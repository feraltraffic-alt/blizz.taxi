# Sandbox transcript (2026-10-30T12:06:09Z, 78233d1)

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
  "correlation_id": "9d7666ea-d5e5-485b-a312-b4cdd7302233"
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
  "session_id": "691d5c89-127a-4479-ac9e-7b98bb4efa57",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjI4NzYsImlhdCI6MTc5MzM2MTk3NiwianRpIjoiOWZlY2FlMTktMzdhMi00ZDUyLTkyYjEtOTVlNzcxMjAzNDBmIiwic2lkIjoiNjkxZDVjODktMTI3YS00NDc5LWFjOWUtN2I5OGJiNGVmYTU3In0.qYeM6XAPUcWcJ4Xoe7R0nP1j9WnHWaPRFt4MS9etXN8",
  "access_expires_at": "2026-10-30T12:21:16.284994991Z",
  "refresh_token": "61od7zlJr8mJwQ3x-WsMEviHETixSdCfjj5hUUW0bfE",
  "refresh_expires_at": "2026-10-31T00:06:16.282211659Z",
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
  "session_id": "07399d44-b1f8-4bb3-bbbc-37d91eefcc21",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjI4NzgsImlhdCI6MTc5MzM2MTk3OCwianRpIjoiNmE3MWI2NjQtYWViMS00NzNmLWJlMTAtNjFkODRjYjgzOTNjIiwic2lkIjoiMDczOTlkNDQtYjFmOC00YmIzLWJiYmMtMzdkOTFlZWZjYzIxIn0.L8_vliMjDJRbODaxKtWuaYL8-m0MLYR16pedkt7PiuE",
  "access_expires_at": "2026-10-30T12:21:18.150918638Z",
  "refresh_token": "JAJjb4iYuNTxsXZxRvyvNec8Wl8dPyLU3h4QrK3dt3k",
  "refresh_expires_at": "2026-10-31T00:06:18.149696758Z",
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
  "device_ref": "sandbox-14421"
}
```

```json
{
  "challenge_id": "613202cb-9272-481f-a32b-ab427c0c026f",
  "expires_at": "2026-10-30T12:11:18.808851792Z",
  "resend_available_at": "2026-10-30T12:06:19.808851792Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "788152",
  "sent_at": "2026-10-30T12:06:18.821846582Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "613202cb-9272-481f-a32b-ab427c0c026f",
  "code": "788152",
  "device_ref": "sandbox-14421"
}
```

```json
{
  "session_id": "33e3f061-47b3-45aa-8ea8-cf5cb63145a1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Mjg3OSwiaWF0IjoxNzkzMzYxOTc5LCJqdGkiOiI3MGVkMWIxYy1mODAwLTQ5YjMtODQ1Yy1kNzQ1OWQ4MjQ4OTYiLCJzaWQiOiIzM2UzZjA2MS00N2IzLTQ1YWEtOGVhOC1jZjVjYjYzMTQ1YTEifQ.neFxjAP_takWMZ-4gyytNUt1fmpU5HO1pvR0ju7oq9I",
  "access_expires_at": "2026-10-30T12:21:19.173636102Z",
  "refresh_token": "XZOiFa78iBRCmq0t8oYUS9galdDwzwHxbVZgGBC4Mok",
  "refresh_expires_at": "2026-11-29T12:06:19.172245696Z",
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
  "command_id": "8352d48b-0195-475d-848a-0ce2297fc856",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:06:19Z",
    "sequence": 1793361979786
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "11c0a904-b7c5-44cf-999d-a32d298f1fcd",
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
  "last_heartbeat_at": "2026-10-30T12:06:19.889002Z",
  "last_location_at": "2026-10-30T12:06:19.889002Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637878679",
  "device_ref": "sandbox-26880"
}
```

```json
{
  "challenge_id": "69a1fdcc-b04a-4cd8-bd5a-629a684a087c",
  "expires_at": "2026-10-30T12:11:20.197922517Z",
  "resend_available_at": "2026-10-30T12:06:21.197922517Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637878679` → **200**

```json
{
  "phone": "+380637878679",
  "audience": "CLIENT",
  "code": "251963",
  "sent_at": "2026-10-30T12:06:20.203567168Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "69a1fdcc-b04a-4cd8-bd5a-629a684a087c",
  "code": "251963",
  "device_ref": "sandbox-26880"
}
```

```json
{
  "session_id": "744c5877-901f-4715-9a90-55ac2e142079",
  "subject": {
    "type": "CLIENT",
    "id": "b65dbfcd-f160-491d-8399-0a38d9977467"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNjVkYmZjZC1mMTYwLTQ5MWQtODM5OS0wYTM4ZDk5Nzc0NjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYyODgwLCJpYXQiOjE3OTMzNjE5ODAsImp0aSI6ImU3MDgyODQ1LWM3NjItNGRhZC1iNGYzLTNmOTkwMTZhMjc5MCIsInNpZCI6Ijc0NGM1ODc3LTkwMWYtNDcxNS05YTkwLTU1YWMyZTE0MjA3OSJ9.NEmUxJALhCE5fHAWAQDx6t21q7GdwBFHJSiWHKiTdLU",
  "access_expires_at": "2026-10-30T12:21:20.53137844Z",
  "refresh_token": "gyXlsm4YYlTFbF7tgvWa6wEO9xVJWVDknyYlnczgAqY",
  "refresh_expires_at": "2026-11-29T12:06:20.530240047Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b7efa46d-bada-4c1f-84ca-d287402543a2",
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
  "id": "696ec925-44ff-47d9-93b3-7157b494b5f0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:11:20.894732Z",
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
  "command_id": "2b9f9612-7bd4-4915-b31f-0da3bbd63d6d",
  "quote_id": "696ec925-44ff-47d9-93b3-7157b494b5f0",
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
  "id": "820bc9be-b1ae-4af0-aca4-3de3e7418977",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b65dbfcd-f160-491d-8399-0a38d9977467",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:06:21.304241Z",
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
    "id": "f74de95c-f680-408e-9723-460054dba779",
    "order_id": "820bc9be-b1ae-4af0-aca4-3de3e7418977",
    "expires_at": "2026-10-30T12:06:36.315518Z",
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

`POST /api/driver/v1/offers/f74de95c-f680-408e-9723-460054dba779/accept` → **200**

```json
{
  "command_id": "d64e5485-d3d2-4fd3-b93a-5ac4be89874f"
}
```

```json
{
  "id": "bf5c7cb7-a544-4771-866b-56ed745d8042",
  "order_id": "820bc9be-b1ae-4af0-aca4-3de3e7418977",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4a70e17a-9653-4b2e-9e3a-9493622a70d4",
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
  "command_id": "2419018a-4354-4a3d-ae2c-315d1fc062d2",
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
  "changed_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T12:06:22.618518706Z"
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
  "id": "4a70e17a-9653-4b2e-9e3a-9493622a70d4",
  "order_id": "820bc9be-b1ae-4af0-aca4-3de3e7418977",
  "assignment_id": "bf5c7cb7-a544-4771-866b-56ed745d8042",
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

`POST /api/driver/v1/work-sessions/11c0a904-b7c5-44cf-999d-a32d298f1fcd/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:06:23Z",
    "sequence": 1793361983626
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "11c0a904-b7c5-44cf-999d-a32d298f1fcd",
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
  "last_heartbeat_at": "2026-10-30T12:06:23.655803Z",
  "last_location_at": "2026-10-30T12:06:23.655803Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/4a70e17a-9653-4b2e-9e3a-9493622a70d4/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "e4ca463e-afb2-4f8d-9b48-bbd9d94b70ae",
  "expected_version": 0
}
```

```json
{
  "id": "4a70e17a-9653-4b2e-9e3a-9493622a70d4",
  "order_id": "820bc9be-b1ae-4af0-aca4-3de3e7418977",
  "assignment_id": "bf5c7cb7-a544-4771-866b-56ed745d8042",
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
  "arrived_at": "2026-10-30T12:06:23.97384Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4a70e17a-9653-4b2e-9e3a-9493622a70d4/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "d54a4c1c-7370-490e-abe1-00db6bd228af",
  "expected_version": 1
}
```

```json
{
  "id": "4a70e17a-9653-4b2e-9e3a-9493622a70d4",
  "order_id": "820bc9be-b1ae-4af0-aca4-3de3e7418977",
  "assignment_id": "bf5c7cb7-a544-4771-866b-56ed745d8042",
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
  "arrived_at": "2026-10-30T12:06:23.97384Z",
  "started_at": "2026-10-30T12:06:24.296118Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4a70e17a-9653-4b2e-9e3a-9493622a70d4/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "47c0116f-bd03-492a-91c5-d2df6af293fe",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:06:24Z",
  "cash_received": true
}
```

```json
{
  "id": "4a70e17a-9653-4b2e-9e3a-9493622a70d4",
  "order_id": "820bc9be-b1ae-4af0-aca4-3de3e7418977",
  "assignment_id": "bf5c7cb7-a544-4771-866b-56ed745d8042",
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
  "arrived_at": "2026-10-30T12:06:23.97384Z",
  "started_at": "2026-10-30T12:06:24.296118Z",
  "completed_at": "2026-10-30T12:06:24.629066Z",
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
  "session_id": "11c0a904-b7c5-44cf-999d-a32d298f1fcd",
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
  "last_heartbeat_at": "2026-10-30T12:06:23.655803Z",
  "last_location_at": "2026-10-30T12:06:23.655803Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/11c0a904-b7c5-44cf-999d-a32d298f1fcd/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "04b2224f-6afd-4e65-b996-0f21f8235bec",
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
  "command_id": "90c1a24d-7f3a-42bc-8404-16bb261f2b06",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:06:25Z",
    "sequence": 1793361985604
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
  "correlation_id": "8ce904b7-4252-4d0b-86d6-b426d7bc98c1",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "749cf3f1-9573-41dd-a926-e97dab6391ac",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:06:25Z",
    "sequence": 1793361985921
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "79b945d4-8e5a-43cb-a18a-49faf08cea13",
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
  "last_heartbeat_at": "2026-10-30T12:06:25.943424Z",
  "last_location_at": "2026-10-30T12:06:25.943424Z",
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
  "changed_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T12:06:22.618519Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "a9db691c-e117-40e8-bb23-6ed3da7db9f2",
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
  "changed_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T12:06:26.567631532Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "79b945d4-8e5a-43cb-a18a-49faf08cea13",
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
  "last_heartbeat_at": "2026-10-30T12:06:25.943424Z",
  "last_location_at": "2026-10-30T12:06:25.943424Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/79b945d4-8e5a-43cb-a18a-49faf08cea13/close` → **200**

```json
{
  "command_id": "5213b336-bfda-479c-98e7-e614e64bb689",
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
  "session_id": "560bac36-29a0-4267-acdf-05c35fc7d703",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjI4ODcsImlhdCI6MTc5MzM2MTk4NywianRpIjoiN2EyZTA5MzgtMTg1My00NjU1LTgwYWQtMjA2MDkxMjA4Zjg3Iiwic2lkIjoiNTYwYmFjMzYtMjlhMC00MjY3LWFjZGYtMDVjMzVmYzdkNzAzIn0.9V1FdrF7dHzHGArrA3QmuwBugnfjL6GzcysblYZxM5E",
  "access_expires_at": "2026-10-30T12:21:27.780281027Z",
  "refresh_token": "W9bucL9RohP6_M6jT0VOuLMgXldoTOQlvtm4npnwltM",
  "refresh_expires_at": "2026-10-31T00:06:27.779391349Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "7a1ccd4f-10b7-4525-854e-e711fad76c86",
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
  "id": "bd546df5-9b5e-4567-ad1d-1165ad6f894f",
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
  "created_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "created_at": "2026-10-30T12:06:28.081034Z",
  "updated_at": "2026-10-30T12:06:28.081034Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636943121",
  "device_ref": "sandbox-15216"
}
```

```json
{
  "challenge_id": "b03cc716-419a-4bc6-a5a3-2210853f90e2",
  "expires_at": "2026-10-30T12:11:28.381994372Z",
  "resend_available_at": "2026-10-30T12:06:29.381994372Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636943121` → **200**

```json
{
  "phone": "+380636943121",
  "audience": "CLIENT",
  "code": "304478",
  "sent_at": "2026-10-30T12:06:28.386800731Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b03cc716-419a-4bc6-a5a3-2210853f90e2",
  "code": "304478",
  "device_ref": "sandbox-15216"
}
```

```json
{
  "session_id": "3d3d1e80-ae6e-442b-98b4-95371aa45f18",
  "subject": {
    "type": "CLIENT",
    "id": "d2e49e05-c009-4972-9e2d-707e9cb8bdb6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMmU0OWUwNS1jMDA5LTQ5NzItOWUyZC03MDdlOWNiOGJkYjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYyODg4LCJpYXQiOjE3OTMzNjE5ODgsImp0aSI6ImM1MjgxMTY5LThmZWQtNGViZi05ZDA1LWU3YWZiMTJiNTNhYiIsInNpZCI6IjNkM2QxZTgwLWFlNmUtNDQyYi05OGI0LTk1MzcxYWE0NWYxOCJ9.2nkDVcDzwfeFpphd_AopeZjmjr59FzDN9IgI8WMGPqY",
  "access_expires_at": "2026-10-30T12:21:28.735502354Z",
  "refresh_token": "1V3irszBJ9BV8eIUd8-BC2fveY3nt5GiG9eRyAAfnqg",
  "refresh_expires_at": "2026-11-29T12:06:28.734575409Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380636943121` → **200**

```json
{
  "client_id": "d2e49e05-c009-4972-9e2d-707e9cb8bdb6"
}
```

`POST /api/admin/v1/rider-wallets/d2e49e05-c009-4972-9e2d-707e9cb8bdb6/top-ups` → **201**

```json
{
  "command_id": "1ebed505-d7f7-4dd8-a720-cdd58444ecfd",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "d2e49e05-c009-4972-9e2d-707e9cb8bdb6",
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
      "id": "abed910a-0410-47fc-8590-0071a1534245",
      "at": "2026-10-30T12:06:29.324067Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "c2b31b2b-8610-441e-a39e-de6e6485310e",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "68998595-3506-4bb1-9df7-0ff83bf124c5",
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
  "id": "f191515e-fc44-4122-b541-09cd276ed712",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:11:29.649401Z",
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
      "id": "bd546df5-9b5e-4567-ad1d-1165ad6f894f",
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
  "device_ref": "sandbox-24349"
}
```

```json
{
  "challenge_id": "254dd622-9953-4572-bf58-27c72347f88f",
  "expires_at": "2026-10-30T12:11:29.96158934Z",
  "resend_available_at": "2026-10-30T12:06:30.96158934Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "470850",
  "sent_at": "2026-10-30T12:06:29.966040865Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "254dd622-9953-4572-bf58-27c72347f88f",
  "code": "470850",
  "device_ref": "sandbox-24349"
}
```

```json
{
  "session_id": "e8afeabd-a7f9-4161-bc57-0290725f6b7e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Mjg5MCwiaWF0IjoxNzkzMzYxOTkwLCJqdGkiOiJlNjgwNWY2Yy01NWY4LTRkYjktODM1Zi1hODFkYTRkYTdkODciLCJzaWQiOiJlOGFmZWFiZC1hN2Y5LTQxNjEtYmM1Ny0wMjkwNzI1ZjZiN2UifQ.T-CDifPN06Jj78Epkiu2fqldYMAfwnavZPlES4sQUvQ",
  "access_expires_at": "2026-10-30T12:21:30.274641406Z",
  "refresh_token": "HAobw5evwBmW49G_B_ONREn5wkM3dIZq57VzTFtOGb0",
  "refresh_expires_at": "2026-11-29T12:06:30.273929111Z",
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
  "command_id": "12f4632f-7cc2-42ad-a1f6-737dfe0567a9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:06:30Z",
    "sequence": 1793361990863
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d47a70f9-7576-46d5-b95e-685db75cf29e",
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
  "last_heartbeat_at": "2026-10-30T12:06:30.884208Z",
  "last_location_at": "2026-10-30T12:06:30.884208Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "69dde6ff-1e1b-4b03-9ce8-3230ae02a675",
  "quote_id": "f191515e-fc44-4122-b541-09cd276ed712",
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
  "id": "bf8d8c8f-3644-45bb-8562-01003ac91a08",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d2e49e05-c009-4972-9e2d-707e9cb8bdb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:06:31.196585Z",
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
  "client_id": "d2e49e05-c009-4972-9e2d-707e9cb8bdb6",
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
      "id": "abed910a-0410-47fc-8590-0071a1534245",
      "at": "2026-10-30T12:06:29.324067Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "c2b31b2b-8610-441e-a39e-de6e6485310e",
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
    "id": "e22c86f7-5135-4e91-ad8c-6173060c6ae2",
    "order_id": "bf8d8c8f-3644-45bb-8562-01003ac91a08",
    "expires_at": "2026-10-30T12:06:46.204409Z",
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

`POST /api/driver/v1/offers/e22c86f7-5135-4e91-ad8c-6173060c6ae2/accept` → **200**

```json
{
  "command_id": "20d2e22b-9433-4671-9757-e14150882677"
}
```

```json
{
  "id": "977d6183-4027-46b4-a1d9-2259e2167da9",
  "order_id": "bf8d8c8f-3644-45bb-8562-01003ac91a08",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5408a98f-8a97-45da-ba2e-dabd1a79fec2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5408a98f-8a97-45da-ba2e-dabd1a79fec2",
  "order_id": "bf8d8c8f-3644-45bb-8562-01003ac91a08",
  "assignment_id": "977d6183-4027-46b4-a1d9-2259e2167da9",
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

`POST /api/driver/v1/work-sessions/d47a70f9-7576-46d5-b95e-685db75cf29e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:06:34Z",
    "sequence": 1793361994714
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d47a70f9-7576-46d5-b95e-685db75cf29e",
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
  "last_heartbeat_at": "2026-10-30T12:06:34.735824Z",
  "last_location_at": "2026-10-30T12:06:34.735824Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/5408a98f-8a97-45da-ba2e-dabd1a79fec2/arrive` → **200**

```json
{
  "command_id": "a87e39ed-69d2-450b-a166-992a37b8a4fc",
  "expected_version": 0
}
```

```json
{
  "id": "5408a98f-8a97-45da-ba2e-dabd1a79fec2",
  "order_id": "bf8d8c8f-3644-45bb-8562-01003ac91a08",
  "assignment_id": "977d6183-4027-46b4-a1d9-2259e2167da9",
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
  "arrived_at": "2026-10-30T12:06:35.0408Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5408a98f-8a97-45da-ba2e-dabd1a79fec2/start` → **200**

```json
{
  "command_id": "3c08019f-670c-430b-92d4-6b7c42eb3926",
  "expected_version": 1
}
```

```json
{
  "id": "5408a98f-8a97-45da-ba2e-dabd1a79fec2",
  "order_id": "bf8d8c8f-3644-45bb-8562-01003ac91a08",
  "assignment_id": "977d6183-4027-46b4-a1d9-2259e2167da9",
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
  "arrived_at": "2026-10-30T12:06:35.0408Z",
  "started_at": "2026-10-30T12:06:35.352356Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/5408a98f-8a97-45da-ba2e-dabd1a79fec2/complete` → **200**

```json
{
  "command_id": "b9798b9f-9035-4de0-b811-637fbd68427e",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:06:35Z",
  "cash_received": true
}
```

```json
{
  "id": "5408a98f-8a97-45da-ba2e-dabd1a79fec2",
  "order_id": "bf8d8c8f-3644-45bb-8562-01003ac91a08",
  "assignment_id": "977d6183-4027-46b4-a1d9-2259e2167da9",
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
  "arrived_at": "2026-10-30T12:06:35.0408Z",
  "started_at": "2026-10-30T12:06:35.352356Z",
  "completed_at": "2026-10-30T12:06:35.668434Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "d2e49e05-c009-4972-9e2d-707e9cb8bdb6",
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
      "id": "59665de9-d59a-4f0d-92ad-d7bcc9771322",
      "at": "2026-10-30T12:06:35.886631Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "bf8d8c8f-3644-45bb-8562-01003ac91a08"
    },
    {
      "id": "abed910a-0410-47fc-8590-0071a1534245",
      "at": "2026-10-30T12:06:29.324067Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "c2b31b2b-8610-441e-a39e-de6e6485310e",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/bd546df5-9b5e-4567-ad1d-1165ad6f894f/archive` → **200**

```json
{
  "command_id": "c31fe1d7-bd64-4f6c-bcd0-d718e539bf43",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "bd546df5-9b5e-4567-ad1d-1165ad6f894f",
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
  "created_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "created_at": "2026-10-30T12:06:28.081034Z",
  "updated_at": "2026-10-30T12:06:39.290654Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d47a70f9-7576-46d5-b95e-685db75cf29e",
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
  "last_heartbeat_at": "2026-10-30T12:06:34.735824Z",
  "last_location_at": "2026-10-30T12:06:34.735824Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d47a70f9-7576-46d5-b95e-685db75cf29e/close` → **200**

```json
{
  "command_id": "6a9b62fb-d44f-4a7b-b2bc-4b1f0e8dc137",
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

Done: order bf8d8c8f-3644-45bb-8562-01003ac91a08.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-2872"
}
```

```json
{
  "challenge_id": "83b13d03-2ca5-4043-85c4-ea7ba02f454f",
  "expires_at": "2026-10-30T12:11:40.21637098Z",
  "resend_available_at": "2026-10-30T12:06:41.21637098Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "684462",
  "sent_at": "2026-10-30T12:06:40.221112419Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "83b13d03-2ca5-4043-85c4-ea7ba02f454f",
  "code": "684462",
  "device_ref": "sandbox-2872"
}
```

```json
{
  "session_id": "a3eb0996-d68b-4d1c-80eb-ffcb8184d0fc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MjkwMCwiaWF0IjoxNzkzMzYyMDAwLCJqdGkiOiI5Nzg3MGE0Ny1mYWJkLTRkM2QtOTEyZC1hOWIwMzlmMWM3ZDEiLCJzaWQiOiJhM2ViMDk5Ni1kNjhiLTRkMWMtODBlYi1mZmNiODE4NGQwZmMifQ.uYJALhGt6P_As_CZuEVTngjq1GyNrHCwQfy4piTfzw4",
  "access_expires_at": "2026-10-30T12:21:40.54153871Z",
  "refresh_token": "xAyBzUCPLrSL0RRpDn7XjiIoDPn2wQsvg8pghNGqvAs",
  "refresh_expires_at": "2026-11-29T12:06:40.540798885Z",
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
  "command_id": "e307e78c-894e-4971-ab39-8c26cec3174a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:06:41Z",
    "sequence": 1793362001414
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "92a53d52-2285-41cd-bd33-e416f380ab64",
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
  "last_heartbeat_at": "2026-10-30T12:06:41.435083Z",
  "last_location_at": "2026-10-30T12:06:41.435083Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/92a53d52-2285-41cd-bd33-e416f380ab64/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:06:46Z",
    "sequence": 1793362006729
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "92a53d52-2285-41cd-bd33-e416f380ab64",
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
  "last_heartbeat_at": "2026-10-30T12:06:46.749901Z",
  "last_location_at": "2026-10-30T12:06:41.435083Z",
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
  "session_id": "1f214ca6-82bc-4511-a158-f45cd3685b30",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjI5MDcsImlhdCI6MTc5MzM2MjAwNywianRpIjoiZmU4NWUwMTUtNjI0YS00N2FkLThkYjQtZDU5OTc5YmVkMjgzIiwic2lkIjoiMWYyMTRjYTYtODJiYy00NTExLWExNTgtZjQ1Y2QzNjg1YjMwIn0.rnCI889yfOz5ElUqZIqwwjc833J_F-9_8K7l_syGqoc",
  "access_expires_at": "2026-10-30T12:21:47.350722254Z",
  "refresh_token": "f3QpNRJGdM2bS4GvzVkUlujaqFcegiC9mhlPH4QW48g",
  "refresh_expires_at": "2026-10-31T00:06:47.350028705Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T12:06:47.634182859Z",
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
      "last_location_at": "2026-10-30T12:06:41.435083Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/92a53d52-2285-41cd-bd33-e416f380ab64/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:06:47Z",
    "sequence": 1793362007941
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "92a53d52-2285-41cd-bd33-e416f380ab64",
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
  "last_heartbeat_at": "2026-10-30T12:06:47.961954Z",
  "last_location_at": "2026-10-30T12:06:47.961954Z",
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
  "session_id": "92a53d52-2285-41cd-bd33-e416f380ab64",
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
  "last_heartbeat_at": "2026-10-30T12:06:47.961954Z",
  "last_location_at": "2026-10-30T12:06:47.961954Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/92a53d52-2285-41cd-bd33-e416f380ab64/close` → **200**

```json
{
  "command_id": "fb3bc201-06ce-4a5c-acee-5534eb401d99",
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
  "device_ref": "sandbox-19344"
}
```

```json
{
  "challenge_id": "bcffdc1e-d8c8-486c-9573-dc9653ead237",
  "expires_at": "2026-10-30T12:11:48.880396522Z",
  "resend_available_at": "2026-10-30T12:06:49.880396522Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "879564",
  "sent_at": "2026-10-30T12:06:48.88441033Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bcffdc1e-d8c8-486c-9573-dc9653ead237",
  "code": "879564",
  "device_ref": "sandbox-19344"
}
```

```json
{
  "session_id": "8178a17e-0d65-44af-a1a2-74ce5bafb36d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MjkwOSwiaWF0IjoxNzkzMzYyMDA5LCJqdGkiOiJlNWYxZWUzOC01MTc1LTQ1YTYtOTVlZi1jZjI5NzFhZDBlMzUiLCJzaWQiOiI4MTc4YTE3ZS0wZDY1LTQ0YWYtYTFhMi03NGNlNWJhZmIzNmQifQ.sTwXm2s_QerSSmGhw_qJ7DX1iGqf9ckAxlMDdw5xCRw",
  "access_expires_at": "2026-10-30T12:21:49.201466857Z",
  "refresh_token": "zChOuPDwSJxMQ_oMiL9yYpH90Xr_kJIkMlqHoQd9LRE",
  "refresh_expires_at": "2026-11-29T12:06:49.200572884Z",
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
  "device_ref": "sandbox-8641"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "ca8ec289-a244-4d9c-b008-0dda8eb0793a",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-8641"
}
```

```json
{
  "challenge_id": "be22f6e9-319e-4829-a8cc-66732afe4653",
  "expires_at": "2026-10-30T12:11:51.082941761Z",
  "resend_available_at": "2026-10-30T12:06:52.082941761Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "023701",
  "sent_at": "2026-10-30T12:06:51.08680937Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be22f6e9-319e-4829-a8cc-66732afe4653",
  "code": "023701",
  "device_ref": "sandbox-8641"
}
```

```json
{
  "session_id": "c9db35f0-9354-4659-bd7c-963329f4a237",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MjkxMSwiaWF0IjoxNzkzMzYyMDExLCJqdGkiOiJiNzBmMDZmZS04NjM1LTQ5NGEtYmNiOS03NmYxYjM4MGM5OWEiLCJzaWQiOiJjOWRiMzVmMC05MzU0LTQ2NTktYmQ3Yy05NjMzMjlmNGEyMzcifQ.dLmm6TYMlhMdN6LgFGvJN77hVKsuDs_zvNrfkztzcvU",
  "access_expires_at": "2026-10-30T12:21:51.411681791Z",
  "refresh_token": "5YJbY24Ia42p0yfncAO2JZQ54plSrMgW6Aw9SCT-EQQ",
  "refresh_expires_at": "2026-11-29T12:06:51.410972542Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-27278"
}
```

```json
{
  "challenge_id": "64f69697-ed19-44dd-a019-912b1c582bda",
  "expires_at": "2026-10-30T12:11:51.689913728Z",
  "resend_available_at": "2026-10-30T12:06:52.689913728Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "605060",
  "sent_at": "2026-10-30T12:06:51.693669001Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "64f69697-ed19-44dd-a019-912b1c582bda",
  "code": "605060",
  "device_ref": "sandbox-27278"
}
```

```json
{
  "session_id": "655f8fe5-6bb8-4184-8298-2fb91d935d17",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MjkxMiwiaWF0IjoxNzkzMzYyMDEyLCJqdGkiOiJjYmY1NWRmNS02ZDZiLTQ3NTItYjM4Yy03NTk3YzFlMDYxY2QiLCJzaWQiOiI2NTVmOGZlNS02YmI4LTQxODQtODI5OC0yZmI5MWQ5MzVkMTcifQ.3zA8VY7-uKfHTEp71r7_557CZGy9crmNY_idK3BLt-s",
  "access_expires_at": "2026-10-30T12:21:52.017091739Z",
  "refresh_token": "O6V8BjlWttuAOvVyNBrMIWo3K403pqW_cwylgnNj_Rg",
  "refresh_expires_at": "2026-11-29T12:06:52.016444075Z",
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
  "command_id": "54502d7e-416d-4de1-a557-1881bc662886",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:09:55Z",
    "sequence": 1793362195904
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "4e705ce5-b5a3-479b-8fe3-7e28c89dcf0f",
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
  "last_heartbeat_at": "2026-10-30T12:09:55.925067Z",
  "last_location_at": "2026-10-30T12:09:55.925067Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600993838",
  "device_ref": "sandbox-2763"
}
```

```json
{
  "challenge_id": "11e5e866-0cb2-4ee1-98dc-da841011e7c4",
  "expires_at": "2026-10-30T12:14:56.239086613Z",
  "resend_available_at": "2026-10-30T12:09:57.239086613Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600993838` → **200**

```json
{
  "phone": "+48600993838",
  "audience": "CLIENT",
  "code": "647019",
  "sent_at": "2026-10-30T12:09:56.243108066Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "11e5e866-0cb2-4ee1-98dc-da841011e7c4",
  "code": "647019",
  "device_ref": "sandbox-2763"
}
```

```json
{
  "session_id": "64178bfc-3341-4f5f-87bc-191c26cfb9fb",
  "subject": {
    "type": "CLIENT",
    "id": "1a5d2486-40f2-48d1-84bf-7d4c2cad14b3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYTVkMjQ4Ni00MGYyLTQ4ZDEtODRiZi03ZDRjMmNhZDE0YjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMDk2LCJpYXQiOjE3OTMzNjIxOTYsImp0aSI6IjgyYzRkZTI0LTk4OWItNDMxOS05ZDU2LWEzM2MzOTkzZGI3YiIsInNpZCI6IjY0MTc4YmZjLTMzNDEtNGY1Zi04N2JjLTE5MWMyNmNmYjlmYiJ9.FLdHgsFZpPa5X_eWRa8MGeApQz3EUatBglM0SP-YaTs",
  "access_expires_at": "2026-10-30T12:24:56.563350485Z",
  "refresh_token": "hh0w3WtfvYuKcwR4Xanqk5Y1tHyLU8GXBuaKoPPhF0E",
  "refresh_expires_at": "2026-11-29T12:09:56.56271836Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c0859db2-a633-42df-8b1d-9653ce758e05",
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
  "id": "6e83ce4e-dd95-48ee-88e6-a4f296edad26",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:14:56.862246Z",
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
  "command_id": "10bf1f6f-58ec-4aac-8211-cf0741f0f0cb",
  "quote_id": "6e83ce4e-dd95-48ee-88e6-a4f296edad26",
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
  "id": "613476e4-d07d-42d9-8c0d-98d72d8052ff",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1a5d2486-40f2-48d1-84bf-7d4c2cad14b3",
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
  "created_at": "2026-10-30T12:09:57.164352Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/613476e4-d07d-42d9-8c0d-98d72d8052ff` → **200**

```json
{
  "id": "613476e4-d07d-42d9-8c0d-98d72d8052ff",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1a5d2486-40f2-48d1-84bf-7d4c2cad14b3",
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
  "created_at": "2026-10-30T12:09:57.164352Z",
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

`POST /api/driver/v1/orders/613476e4-d07d-42d9-8c0d-98d72d8052ff/claim` → **422**

```json
{
  "command_id": "47edeeb0-5b5b-41fe-8dc0-1117eff3cf5b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/613476e4-d07d-42d9-8c0d-98d72d8052ff/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "f9dce40e-dc8d-412c-b5d7-6fc48b03a919"
}
```

`GET /api/rider/v1/orders/613476e4-d07d-42d9-8c0d-98d72d8052ff` → **200**

```json
{
  "id": "613476e4-d07d-42d9-8c0d-98d72d8052ff",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1a5d2486-40f2-48d1-84bf-7d4c2cad14b3",
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
  "created_at": "2026-10-30T12:09:57.164352Z",
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

`POST /api/driver/v1/orders/8049f14c-46ba-46b3-9bdd-cbf636c5fd25/claim` → **404**

```json
{
  "command_id": "588663d5-0b2b-439a-ad0f-a4df2ebd224d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8049f14c-46ba-46b3-9bdd-cbf636c5fd25/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "937b78e1-30e4-4071-9de0-66e203c2d3ce"
}
```

`POST /api/driver/v1/orders/8831f6b6-9345-45f5-a813-e3dc76437806/claim` → **404**

```json
{
  "command_id": "eda58719-02dd-4fd7-b996-e392a073e92d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8831f6b6-9345-45f5-a813-e3dc76437806/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a6b0fc39-673e-438c-97ef-ac830efecd74"
}
```

`POST /api/driver/v1/orders/21c7cbc0-7d9b-4ba8-8ac0-adab77c74982/claim` → **404**

```json
{
  "command_id": "4ebfa7c2-6192-49d8-a21c-b119b9289809"
}
```

```json
{
  "instance": "/api/driver/v1/orders/21c7cbc0-7d9b-4ba8-8ac0-adab77c74982/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a8346092-b4ff-46c4-ac21-081950447a87"
}
```

`POST /api/driver/v1/orders/1647635c-0567-471d-8145-5caacc98d688/claim` → **404**

```json
{
  "command_id": "3d86a5dc-2054-4a57-a9df-0c10da573a55"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1647635c-0567-471d-8145-5caacc98d688/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a1aee5a0-f37c-4b2e-8dda-c437af3fcfad"
}
```

`POST /api/driver/v1/orders/e29e09a1-a102-4671-b9e9-a60b8140cf4b/claim` → **404**

```json
{
  "command_id": "d30ff744-e8b1-40fc-aebb-d6cc72442d28"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e29e09a1-a102-4671-b9e9-a60b8140cf4b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f2b33a58-9825-4f39-93d0-75acf1c6209d"
}
```

`POST /api/driver/v1/orders/ade933a3-083a-4bd4-86d2-fd5d415c08be/claim` → **404**

```json
{
  "command_id": "417eef0b-2e6e-4a15-b75c-a10a77cd2e24"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ade933a3-083a-4bd4-86d2-fd5d415c08be/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "279f32b4-8731-4bed-af6f-a451e404e9fe"
}
```

`POST /api/driver/v1/orders/9c93c725-f2c1-4880-9ddc-9e084bbe5ace/claim` → **404**

```json
{
  "command_id": "50f1bfb1-19a1-49db-b512-e96d13cb2486"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9c93c725-f2c1-4880-9ddc-9e084bbe5ace/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ac9690a2-839d-427a-8654-1569d358970c"
}
```

`POST /api/driver/v1/orders/583814b5-3476-4074-89ae-d5deb8cf593f/claim` → **404**

```json
{
  "command_id": "538404e7-da53-4268-b829-d1908360b907"
}
```

```json
{
  "instance": "/api/driver/v1/orders/583814b5-3476-4074-89ae-d5deb8cf593f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ca0110f9-ed56-496d-b559-3cc3989a30a7"
}
```

`POST /api/driver/v1/orders/3dc553a7-033f-49ad-9762-3fafa67db296/claim` → **404**

```json
{
  "command_id": "15602d52-9a2a-4af9-84db-b4c4a2dd9002"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3dc553a7-033f-49ad-9762-3fafa67db296/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cfd77f29-5335-458e-8380-f2ee278f2c83"
}
```

`POST /api/driver/v1/orders/75b290e3-884c-4c3d-bf8b-10449e63fd0c/claim` → **404**

```json
{
  "command_id": "0dbe0ed4-2c7a-4437-a510-24e514808ed2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/75b290e3-884c-4c3d-bf8b-10449e63fd0c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "36722b14-7227-4a92-b007-c6d7dbf1957f"
}
```

`POST /api/driver/v1/orders/64e579ce-240e-48ed-957f-ab5ad0b367ea/claim` → **404**

```json
{
  "command_id": "88db2441-2a99-4119-adb6-a2e1bc9e600e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/64e579ce-240e-48ed-957f-ab5ad0b367ea/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b9034da8-1aa8-486c-9f9c-528dcb2dbf98"
}
```

`POST /api/driver/v1/orders/397f8824-da8b-4b77-bf92-e97eab40c7c8/claim` → **404**

```json
{
  "command_id": "3d89a112-8d7b-4c5a-a93e-2eadf73a4ff7"
}
```

```json
{
  "instance": "/api/driver/v1/orders/397f8824-da8b-4b77-bf92-e97eab40c7c8/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9c0c0442-cce6-4dec-a57f-c03ff0f9cefd"
}
```

`POST /api/driver/v1/orders/dc783d91-c5a9-4831-a532-7924983c0471/claim` → **404**

```json
{
  "command_id": "66b49630-89e1-4440-aa41-6455a944acd7"
}
```

```json
{
  "instance": "/api/driver/v1/orders/dc783d91-c5a9-4831-a532-7924983c0471/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7edc3f6b-606d-4bf8-960b-bbdba33f4787"
}
```

`POST /api/driver/v1/orders/4352bd44-5164-4f5c-a2aa-b52b0673fd3f/claim` → **404**

```json
{
  "command_id": "caed78db-345a-454a-a048-b935c41017a5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4352bd44-5164-4f5c-a2aa-b52b0673fd3f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7fea6735-6d8f-47b9-8a16-e2ffaf09eba1"
}
```

`POST /api/driver/v1/orders/80c3b697-0090-42df-a231-0eab789d27ed/claim` → **404**

```json
{
  "command_id": "2b1baa32-3e19-448c-8647-575993f83948"
}
```

```json
{
  "instance": "/api/driver/v1/orders/80c3b697-0090-42df-a231-0eab789d27ed/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1d7146bf-2631-432e-ac9d-515d2daee8e9"
}
```

`POST /api/driver/v1/orders/01fc7720-d62c-4786-ade5-279b62242a23/claim` → **404**

```json
{
  "command_id": "a43db49d-cbdf-4ecd-8f8c-4a239779b6b4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/01fc7720-d62c-4786-ade5-279b62242a23/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "15a168fd-63cb-4266-a1c8-a2143e83442c"
}
```

`POST /api/driver/v1/orders/4696744b-0b62-4f3e-ad05-de9460f45858/claim` → **404**

```json
{
  "command_id": "09aaecab-d588-488f-9807-01febdf39976"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4696744b-0b62-4f3e-ad05-de9460f45858/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b96eee4e-077c-45d1-a411-36073c14c3c7"
}
```

`POST /api/driver/v1/orders/66b8714c-3bdc-403f-ad06-cb5a54e1c580/claim` → **404**

```json
{
  "command_id": "bafc9d7c-f1fe-4285-91c2-7c4bb5718d30"
}
```

```json
{
  "instance": "/api/driver/v1/orders/66b8714c-3bdc-403f-ad06-cb5a54e1c580/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f08d79c2-9e8b-4109-90a9-0482ba87dc40"
}
```

`POST /api/driver/v1/orders/3748df4d-ef49-4110-a498-6acaf55399d3/claim` → **404**

```json
{
  "command_id": "37438aa6-5e07-4485-9488-ae26b334e9d9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3748df4d-ef49-4110-a498-6acaf55399d3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8f6aebf3-7f84-49cd-a727-10f52ec42aac"
}
```

`POST /api/driver/v1/orders/dceaebb0-6cff-4bf6-972d-3c02672870fc/claim` → **404**

```json
{
  "command_id": "f8592fe8-e094-40b7-b3ac-15f8a989b021"
}
```

```json
{
  "instance": "/api/driver/v1/orders/dceaebb0-6cff-4bf6-972d-3c02672870fc/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8924b8f2-da6e-416c-ab42-4f347a144bb2"
}
```

`POST /api/driver/v1/orders/5120cf57-6e11-48c6-8be1-41c074fad2cd/claim` → **404**

```json
{
  "command_id": "cb0530f5-9fa4-4df6-a01c-612140064fc5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5120cf57-6e11-48c6-8be1-41c074fad2cd/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c22fda82-4389-4a78-8a88-640de5e8bdaf"
}
```

`POST /api/driver/v1/orders/193a620a-3e85-406d-8e5c-06dd207f8633/claim` → **404**

```json
{
  "command_id": "38b64fd7-9651-418c-8eb0-4c230e3416b9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/193a620a-3e85-406d-8e5c-06dd207f8633/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e05228e0-f8f1-42d6-9c5b-5523239df74f"
}
```

`POST /api/driver/v1/orders/acb5159f-7847-4321-9126-f6e9732a10dd/claim` → **404**

```json
{
  "command_id": "a86f5f07-c00f-444e-a21a-2c7a2b5fdf77"
}
```

```json
{
  "instance": "/api/driver/v1/orders/acb5159f-7847-4321-9126-f6e9732a10dd/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5942a217-42dc-44a3-b945-9b062c555ba9"
}
```

`POST /api/driver/v1/orders/03fe794d-17e8-44d9-98e8-25dd50a7fa3a/claim` → **404**

```json
{
  "command_id": "073647e6-a2ea-4b28-ac56-f24f891d3f2c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/03fe794d-17e8-44d9-98e8-25dd50a7fa3a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8c8f84c5-6074-4255-8a7a-890c407a63e1"
}
```

`POST /api/driver/v1/orders/e286cb55-87f4-494c-a22f-649ab91be227/claim` → **404**

```json
{
  "command_id": "95b4763c-324c-4fcf-9f6a-5dd521c4864c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e286cb55-87f4-494c-a22f-649ab91be227/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1cfd4343-8509-4f0f-9f85-c2121c4928cd"
}
```

`POST /api/driver/v1/orders/ef5159f8-e1e5-4e38-a160-d81318efd1c3/claim` → **404**

```json
{
  "command_id": "d93403fa-1e95-4339-a200-be605c4d2c75"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ef5159f8-e1e5-4e38-a160-d81318efd1c3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3a8eaceb-9d35-48ad-9c27-1914cf39cba6"
}
```

`POST /api/driver/v1/orders/8b9ee2ec-0073-4e5f-b89a-45fb082198b6/claim` → **404**

```json
{
  "command_id": "0aca77d9-fd0d-40b3-9ca5-0959bdbfd738"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8b9ee2ec-0073-4e5f-b89a-45fb082198b6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b97b1205-17c1-44a9-9578-699be6333703"
}
```

`POST /api/driver/v1/orders/40cf357d-ffb3-4593-bc3d-48a593be8c73/claim` → **404**

```json
{
  "command_id": "d3031766-1455-4dd5-9216-04e323b9e5b9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/40cf357d-ffb3-4593-bc3d-48a593be8c73/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "90062ee9-575b-4727-a1ab-3b24a355ba3a"
}
```

`POST /api/driver/v1/orders/7147d354-e97e-4321-a4b3-e4aea03b7095/claim` → **404**

```json
{
  "command_id": "8affd329-67a6-49cc-89d1-6e5d6d16ff31"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7147d354-e97e-4321-a4b3-e4aea03b7095/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "083db771-9867-4f15-84a0-6350bbaf424a"
}
```

`POST /api/driver/v1/orders/a5eb6d24-f186-425f-beed-a730ddf30fb1/claim` → **429**

```json
{
  "command_id": "336fd0ec-f1a6-40ca-a91a-40def4fa4990"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a5eb6d24-f186-425f-beed-a730ddf30fb1/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "b3e21688-2501-42b0-8d48-31804f49be40",
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
  "command_id": "3aa4ea8c-20ce-4c25-8f2c-ef4e005bd44d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:10:08Z",
    "sequence": 1793362208103
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "a3764d0a-3782-49b7-8018-9f1a385163f0",
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
  "last_heartbeat_at": "2026-10-30T12:10:08.123291Z",
  "last_location_at": "2026-10-30T12:10:08.123291Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "613476e4-d07d-42d9-8c0d-98d72d8052ff",
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

`POST /api/driver/v1/orders/613476e4-d07d-42d9-8c0d-98d72d8052ff/claim` → **409**

```json
{
  "command_id": "17b853dc-64d5-4982-91b4-94b7f5267e4c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/613476e4-d07d-42d9-8c0d-98d72d8052ff/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "37f95c32-0d36-4c1a-af4a-8c714475ef49"
}
```

`POST /api/driver/v1/orders/613476e4-d07d-42d9-8c0d-98d72d8052ff/claim` → **200**

```json
{
  "command_id": "b367b47d-032b-463a-a45c-09f8d88ddb81"
}
```

```json
{
  "id": "45341553-48b8-4541-87b7-74407a9a8e5d",
  "order_id": "613476e4-d07d-42d9-8c0d-98d72d8052ff",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "263769d4-e312-4657-a939-f1f0a37c9b9a",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "263769d4-e312-4657-a939-f1f0a37c9b9a",
  "order_id": "613476e4-d07d-42d9-8c0d-98d72d8052ff",
  "assignment_id": "45341553-48b8-4541-87b7-74407a9a8e5d",
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

`POST /api/driver/v1/trips/263769d4-e312-4657-a939-f1f0a37c9b9a/cancel` → **200**

```json
{
  "command_id": "f2addf65-e7e6-4153-ad06-001ed1dc1849",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "263769d4-e312-4657-a939-f1f0a37c9b9a",
  "order_id": "613476e4-d07d-42d9-8c0d-98d72d8052ff",
  "assignment_id": "45341553-48b8-4541-87b7-74407a9a8e5d",
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

`GET /api/rider/v1/orders/613476e4-d07d-42d9-8c0d-98d72d8052ff` → **200**

```json
{
  "id": "613476e4-d07d-42d9-8c0d-98d72d8052ff",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "1a5d2486-40f2-48d1-84bf-7d4c2cad14b3",
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
    "id": "45341553-48b8-4541-87b7-74407a9a8e5d",
    "order_id": "613476e4-d07d-42d9-8c0d-98d72d8052ff",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "263769d4-e312-4657-a939-f1f0a37c9b9a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T12:09:57.164352Z",
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
  "session_id": "4e705ce5-b5a3-479b-8fe3-7e28c89dcf0f",
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
  "last_heartbeat_at": "2026-10-30T12:09:55.925067Z",
  "last_location_at": "2026-10-30T12:09:55.925067Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4e705ce5-b5a3-479b-8fe3-7e28c89dcf0f/close` → **200**

```json
{
  "command_id": "1acc14f8-e91a-4d56-b0e6-95add7ee6fa2",
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
  "session_id": "a3764d0a-3782-49b7-8018-9f1a385163f0",
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
  "last_heartbeat_at": "2026-10-30T12:10:08.123291Z",
  "last_location_at": "2026-10-30T12:10:08.123291Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a3764d0a-3782-49b7-8018-9f1a385163f0/close` → **200**

```json
{
  "command_id": "aa244c18-0e34-45e1-aeed-81ee0180d747",
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
  "session_id": "77a8b391-0c4a-44d5-9b7b-7559c2cbd8a0",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMxMTEsImlhdCI6MTc5MzM2MjIxMSwianRpIjoiZDcyMzg1OTAtNDViYS00ZjVkLTkxNWItYzliMzI3ZTc1YTc4Iiwic2lkIjoiNzdhOGIzOTEtMGM0YS00NGQ1LTliN2ItNzU1OWMyY2JkOGEwIn0.C_p8HTgFJgHrg1XjhUxhdYQ059k0ODnL0a6v3CTZmac",
  "access_expires_at": "2026-10-30T12:25:11.724046797Z",
  "refresh_token": "BM4RtuYubh1-nI_Jhhtlq-BbBdQ0T3ZArKDCNESl1hs",
  "refresh_expires_at": "2026-10-31T00:10:11.72346108Z",
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
  "command_id": "324b94a0-2d92-45b9-a966-f1084b5b24fe",
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
  "session_id": "bc36a85e-7d2b-4da5-a7ef-c985adc7f339",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMxMTIsImlhdCI6MTc5MzM2MjIxMiwianRpIjoiZDc4NjQxZjYtZjIxYi00ZTRlLWE1NWQtYzE2M2ZiMWI1YjAxIiwic2lkIjoiYmMzNmE4NWUtN2QyYi00ZGE1LWE3ZWYtYzk4NWFkYzdmMzM5In0.r56uHD9uyyONggWH5WWt8VweQqyyyayqxYhC0w0lSy0",
  "access_expires_at": "2026-10-30T12:25:12.896630628Z",
  "refresh_token": "Vn1liLN6AHXzu9lXFcNEW77bz2pre0yOaJbFUpkW2G0",
  "refresh_expires_at": "2026-10-31T00:10:12.896030914Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2424025735",
    "linkedid": "1730052700.2424025735",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671959735"
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
    "id": "1730052700.2424025735",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "9290b122-13dc-466c-a04e-e25e65e317a3",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380671959735",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T12:10:13.18177Z",
      "answered_at": null,
      "ended_at": "2026-10-30T12:10:13.206789Z",
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
    "id": "1730052600.2379929693",
    "linkedid": "1730052600.2379929693",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671959735"
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
      "id": "24575b0d-850c-4c21-80fb-5c32ac3a7da4",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671959735",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T12:10:13.553748Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/24575b0d-850c-4c21-80fb-5c32ac3a7da4/answer` → **200**

```json
{
  "command_id": "6cc78cb9-dde8-4f2e-bc13-8339b21955fc"
}
```

```json
{
  "id": "24575b0d-850c-4c21-80fb-5c32ac3a7da4",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671959735",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "order_ids": [],
  "started_at": "2026-10-30T12:10:13.553748Z",
  "answered_at": "2026-10-30T12:10:13.881569Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2379929693",
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
    "id": "1730052600.2379929693",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "24575b0d-850c-4c21-80fb-5c32ac3a7da4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671959735",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
      "order_ids": [],
      "started_at": "2026-10-30T12:10:13.553748Z",
      "answered_at": "2026-10-30T12:10:13.881569Z",
      "ended_at": "2026-10-30T12:10:14.196027Z",
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
      "id": "24575b0d-850c-4c21-80fb-5c32ac3a7da4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671959735",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
      "order_ids": [],
      "started_at": "2026-10-30T12:10:13.553748Z",
      "answered_at": "2026-10-30T12:10:13.881569Z",
      "ended_at": "2026-10-30T12:10:14.196027Z",
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
      "id": "24575b0d-850c-4c21-80fb-5c32ac3a7da4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671959735",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
      "order_ids": [],
      "started_at": "2026-10-30T12:10:13.553748Z",
      "answered_at": "2026-10-30T12:10:13.881569Z",
      "ended_at": "2026-10-30T12:10:14.196027Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T12:10:18.616745Z"
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
      "id": "24575b0d-850c-4c21-80fb-5c32ac3a7da4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671959735",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
      "order_ids": [],
      "started_at": "2026-10-30T12:10:13.553748Z",
      "answered_at": "2026-10-30T12:10:13.881569Z",
      "ended_at": "2026-10-30T12:10:14.196027Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T12:10:18.616745Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/24575b0d-850c-4c21-80fb-5c32ac3a7da4/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/24575b0d-850c-4c21-80fb-5c32ac3a7da4/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=24575b0d-850c-4c21-80fb-5c32ac3a7da4` → **200**

```json
{
  "changes": [
    {
      "id": "5997ea22-7d55-416e-b728-cfb4b268fe82",
      "occurred_at": "2026-10-30T12:10:19.462119Z",
      "actor_type": "STAFF",
      "actor_id": "c2b31b2b-8610-441e-a39e-de6e6485310e",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "24575b0d-850c-4c21-80fb-5c32ac3a7da4",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"c472d712-9deb-4f3d-9752-8671cfea4392\", \"order_ids\": []}",
      "correlation_id": "15b09bc5-93a3-4a79-806c-3fc01cabff44"
    },
    {
      "id": "e9e59b4e-0af9-4ed3-b900-2c5081155904",
      "occurred_at": "2026-10-30T12:10:19.429848Z",
      "actor_type": "STAFF",
      "actor_id": "c2b31b2b-8610-441e-a39e-de6e6485310e",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "24575b0d-850c-4c21-80fb-5c32ac3a7da4",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"c472d712-9deb-4f3d-9752-8671cfea4392\", \"order_ids\": []}",
      "correlation_id": "f6ae985d-a8d1-470c-9179-00b11f36c3ab"
    }
  ]
}
```

Done: call 24575b0d-850c-4c21-80fb-5c32ac3a7da4 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30758"
}
```

```json
{
  "challenge_id": "90654b85-b64b-45f2-9ef7-91c6d1839cb5",
  "expires_at": "2026-10-30T12:15:19.795790976Z",
  "resend_available_at": "2026-10-30T12:10:20.795790976Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "325044",
  "sent_at": "2026-10-30T12:10:19.799220883Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90654b85-b64b-45f2-9ef7-91c6d1839cb5",
  "code": "325044",
  "device_ref": "sandbox-30758"
}
```

```json
{
  "session_id": "a14f0068-c206-4569-819c-137d006327ae",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzEyMCwiaWF0IjoxNzkzMzYyMjIwLCJqdGkiOiI2OTkyZjQ0ZC1iOGRkLTQ1NjgtODk2YS0yNzgzNWNkOTlmMTAiLCJzaWQiOiJhMTRmMDA2OC1jMjA2LTQ1NjktODE5Yy0xMzdkMDA2MzI3YWUifQ.eCHYAJ-VTHVtBhPT-TaKi8gkrU-SzEtRdXdD3pHnxdk",
  "access_expires_at": "2026-10-30T12:25:20.110523694Z",
  "refresh_token": "1hSkI5Xam6jWyNXDFERmvnc8rkzonGZ3uE0Xa71suSk",
  "refresh_expires_at": "2026-11-29T12:10:20.109877336Z",
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
  "command_id": "0dfb0dde-11b0-41fe-a062-fc4a98c74b5c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:10:20Z",
    "sequence": 1793362220705
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7b7589fd-1ee2-4d7e-b898-fde3806f0e14",
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
  "last_heartbeat_at": "2026-10-30T12:10:20.726001Z",
  "last_location_at": "2026-10-30T12:10:20.726001Z",
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
  "session_id": "ead14e30-c21a-4c83-84f8-dbe4042de911",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMxMjEsImlhdCI6MTc5MzM2MjIyMSwianRpIjoiNjdhNTRlNjQtZjRiZi00OTk3LWEwMGEtMDhmYWFjODk1YjVmIiwic2lkIjoiZWFkMTRlMzAtYzIxYS00YzgzLTg0ZjgtZGJlNDA0MmRlOTExIn0.5pEf945QDoCTko56xPNnglzZWXqlSQ_r7B4h0-ytl5U",
  "access_expires_at": "2026-10-30T12:25:21.316669948Z",
  "refresh_token": "108Gkg1aKAkHtUF3R-mpv-00s-iaGBtCXZ2VGblOrU4",
  "refresh_expires_at": "2026-10-31T00:10:21.316000712Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "b2e383d6-b718-4ef0-9df7-a64b560dcb07",
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
  "id": "848e7670-5255-4721-b16b-9359e82d60fd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:15:21.623537Z",
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
  "command_id": "52efd611-4af5-474b-b973-f57d536ec7db",
  "quote_id": "848e7670-5255-4721-b16b-9359e82d60fd",
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
    "phone": "+380673250011"
  }
}
```

```json
{
  "id": "68f00b41-9f1b-4940-8197-c441af18ab80",
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
  "created_at": "2026-10-30T12:10:21.945795Z",
  "caller": {
    "name": "Олена",
    "phone": "+380673250011"
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
    "id": "e11db524-c3f1-48aa-938c-3cbbbef477b9",
    "order_id": "68f00b41-9f1b-4940-8197-c441af18ab80",
    "expires_at": "2026-10-30T12:10:36.950822Z",
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

`POST /api/driver/v1/offers/e11db524-c3f1-48aa-938c-3cbbbef477b9/accept` → **200**

```json
{
  "command_id": "e39a658c-f1e8-4abf-a25a-4c95f6afad9b"
}
```

```json
{
  "id": "f85bd7e2-9f16-47c9-a422-2c1d7a55f9a6",
  "order_id": "68f00b41-9f1b-4940-8197-c441af18ab80",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "61b30388-3adf-4a1d-b80f-dbecf56c6bab",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380673250011` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673250011` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673250011` → **200**

```json
[
  {
    "phone": "+380673250011",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:10:24.183074667Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673250011` → **200**

```json
[
  {
    "phone": "+380673250011",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:10:24.183074667Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673250011` → **200**

```json
[
  {
    "phone": "+380673250011",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:10:24.183074667Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "61b30388-3adf-4a1d-b80f-dbecf56c6bab",
  "order_id": "68f00b41-9f1b-4940-8197-c441af18ab80",
  "assignment_id": "f85bd7e2-9f16-47c9-a422-2c1d7a55f9a6",
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
    "phone": "+380673250011"
  }
}
```

`POST /api/driver/v1/work-sessions/7b7589fd-1ee2-4d7e-b898-fde3806f0e14/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:10:25Z",
    "sequence": 1793362225303
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7b7589fd-1ee2-4d7e-b898-fde3806f0e14",
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
  "last_heartbeat_at": "2026-10-30T12:10:25.323209Z",
  "last_location_at": "2026-10-30T12:10:25.323209Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/61b30388-3adf-4a1d-b80f-dbecf56c6bab/arrive` → **200**

```json
{
  "command_id": "7ed5309d-41d1-4c02-a7ac-da0a950bbcd2",
  "expected_version": 0
}
```

```json
{
  "id": "61b30388-3adf-4a1d-b80f-dbecf56c6bab",
  "order_id": "68f00b41-9f1b-4940-8197-c441af18ab80",
  "assignment_id": "f85bd7e2-9f16-47c9-a422-2c1d7a55f9a6",
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
  "arrived_at": "2026-10-30T12:10:25.630286Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673250011"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380673250011` → **200**

```json
[
  {
    "phone": "+380673250011",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:10:24.183074667Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673250011` → **200**

```json
[
  {
    "phone": "+380673250011",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:10:24.183074667Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673250011` → **200**

```json
[
  {
    "phone": "+380673250011",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:10:24.183074667Z"
  },
  {
    "phone": "+380673250011",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T12:10:27.193901136Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673250011` → **200**

```json
[
  {
    "phone": "+380673250011",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:10:24.183074667Z"
  },
  {
    "phone": "+380673250011",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T12:10:27.193901136Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673250011` → **200**

```json
[
  {
    "phone": "+380673250011",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:10:24.183074667Z"
  },
  {
    "phone": "+380673250011",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T12:10:27.193901136Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/61b30388-3adf-4a1d-b80f-dbecf56c6bab/start` → **200**

```json
{
  "command_id": "da8256d2-d792-48fc-a28b-98cf47f90499",
  "expected_version": 1
}
```

```json
{
  "id": "61b30388-3adf-4a1d-b80f-dbecf56c6bab",
  "order_id": "68f00b41-9f1b-4940-8197-c441af18ab80",
  "assignment_id": "f85bd7e2-9f16-47c9-a422-2c1d7a55f9a6",
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
  "arrived_at": "2026-10-30T12:10:25.630286Z",
  "started_at": "2026-10-30T12:10:28.073455Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673250011"
  }
}
```

`POST /api/driver/v1/trips/61b30388-3adf-4a1d-b80f-dbecf56c6bab/complete` → **200**

```json
{
  "command_id": "8f82626e-bd5c-4260-ab49-b5e8786ec434",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:10:28Z",
  "cash_received": true
}
```

```json
{
  "id": "61b30388-3adf-4a1d-b80f-dbecf56c6bab",
  "order_id": "68f00b41-9f1b-4940-8197-c441af18ab80",
  "assignment_id": "f85bd7e2-9f16-47c9-a422-2c1d7a55f9a6",
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
  "arrived_at": "2026-10-30T12:10:25.630286Z",
  "started_at": "2026-10-30T12:10:28.073455Z",
  "completed_at": "2026-10-30T12:10:28.383565Z",
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
  "session_id": "7b7589fd-1ee2-4d7e-b898-fde3806f0e14",
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
  "last_heartbeat_at": "2026-10-30T12:10:25.323209Z",
  "last_location_at": "2026-10-30T12:10:25.323209Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7b7589fd-1ee2-4d7e-b898-fde3806f0e14/close` → **200**

```json
{
  "command_id": "95ed9ac0-bf91-4a62-b28b-f3485cf3272c",
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
  "phone": "+380637224929",
  "device_ref": "sandbox-2370"
}
```

```json
{
  "challenge_id": "baffacd2-994a-4797-aa8b-b17a6b72dfac",
  "expires_at": "2026-10-30T12:15:29.304482726Z",
  "resend_available_at": "2026-10-30T12:10:30.304482726Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637224929` → **200**

```json
{
  "phone": "+380637224929",
  "audience": "CLIENT",
  "code": "055258",
  "sent_at": "2026-10-30T12:10:29.307484092Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "baffacd2-994a-4797-aa8b-b17a6b72dfac",
  "code": "055258",
  "device_ref": "sandbox-2370"
}
```

```json
{
  "session_id": "24f86c2c-123b-48ff-a8a2-df15563b8288",
  "subject": {
    "type": "CLIENT",
    "id": "d2df702d-80f1-4dba-b8e7-8dbb809fbd6c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMmRmNzAyZC04MGYxLTRkYmEtYjhlNy04ZGJiODA5ZmJkNmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMTI5LCJpYXQiOjE3OTMzNjIyMjksImp0aSI6IjQ4YjUzOWM2LTZkNmMtNDQ3MS1hM2M1LTNhNWExYjZmMTc5ZiIsInNpZCI6IjI0Zjg2YzJjLTEyM2ItNDhmZi1hOGEyLWRmMTU1NjNiODI4OCJ9.VZOCwWHy5Oo8ykaG0MUUQcwzbiIViohYnPST2BKd09o",
  "access_expires_at": "2026-10-30T12:25:29.629615206Z",
  "refresh_token": "WnVDFHGSUVwsT6Ipo8w7-kx7FjstSPFQb5oOIrT3Rqs",
  "refresh_expires_at": "2026-11-29T12:10:29.629008622Z",
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
  "device_ref": "sandbox-3942"
}
```

```json
{
  "challenge_id": "8be2c7b2-018d-47dd-ae36-401c32fb8bc9",
  "expires_at": "2026-10-30T12:15:30.215919031Z",
  "resend_available_at": "2026-10-30T12:10:31.215919031Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "939105",
  "sent_at": "2026-10-30T12:10:30.218690576Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8be2c7b2-018d-47dd-ae36-401c32fb8bc9",
  "code": "939105",
  "device_ref": "sandbox-3942"
}
```

```json
{
  "session_id": "c410d158-c201-416c-8e62-7fd0872bf106",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzEzMCwiaWF0IjoxNzkzMzYyMjMwLCJqdGkiOiIzNTc5YmY2OS01YmVmLTQ4MDEtYjk2NS0xZWEzOWQyODNlOTIiLCJzaWQiOiJjNDEwZDE1OC1jMjAxLTQxNmMtOGU2Mi03ZmQwODcyYmYxMDYifQ.lNccrc29M7bCJgM4QmlZ0fYSGvd4lDwQzl-ZdwEWZEM",
  "access_expires_at": "2026-10-30T12:25:30.538478334Z",
  "refresh_token": "Af6FTnBi6Db7snXg6gBBpT1Z7eYj1VX-MI77gihwLvo",
  "refresh_expires_at": "2026-11-29T12:10:30.537848138Z",
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
  "session_id": "4254e9ca-8db0-4ba2-8e2f-e9c9af634016",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMxMzEsImlhdCI6MTc5MzM2MjIzMSwianRpIjoiYzMxMjc3Y2MtNWIzNi00MGUyLTkwZTgtMWY0NzM4NmFmNzU3Iiwic2lkIjoiNDI1NGU5Y2EtOGRiMC00YmEyLThlMmYtZTljOWFmNjM0MDE2In0.h6CINHR45GiAUdkDhP-DTQ3IrHSsmf0M96lAKxsO99o",
  "access_expires_at": "2026-10-30T12:25:31.406531336Z",
  "refresh_token": "NwbyBlJGPsdGrYjZ7Ec2CKh5thjDZRDZfk6J1JYtTVo",
  "refresh_expires_at": "2026-10-31T00:10:31.405878513Z",
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
  "session_id": "49648c71-86ff-47f0-95cc-3e70b299dce3",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMxMzEsImlhdCI6MTc5MzM2MjIzMSwianRpIjoiMWI4ODFmMmMtOTJjYS00ZTA5LWJmNTYtNjUyZTY0NzhjNWI5Iiwic2lkIjoiNDk2NDhjNzEtODZmZi00N2YwLTk1Y2MtM2U3MGIyOTlkY2UzIn0.tOiiovJBCvNm7j4TRH3hcjBF9oKT6Se_IPPHlPoecq0",
  "access_expires_at": "2026-10-30T12:25:31.993627367Z",
  "refresh_token": "4P7ZFyi-WNFlxzcAR2wOO_5Hk_d0TrsEDc26kgDrbIk",
  "refresh_expires_at": "2026-10-31T00:10:31.993027954Z",
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
  "command_id": "eb3f8a8e-6b7d-4af7-a636-4095ccdc8f11",
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
  "id": "a775eec4-db32-4af2-8a15-d4369b9dfec5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:15:32.591194Z",
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
  "command_id": "c68eef39-0b36-4382-aaee-b23d332784fa",
  "quote_id": "a775eec4-db32-4af2-8a15-d4369b9dfec5",
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
  "id": "e57f8bba-7adc-41a2-96e0-69c2b5104778",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d2df702d-80f1-4dba-b8e7-8dbb809fbd6c",
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
  "created_at": "2026-10-30T12:10:32.903727Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e57f8bba-7adc-41a2-96e0-69c2b5104778` → **200**

```json
{
  "id": "e57f8bba-7adc-41a2-96e0-69c2b5104778",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d2df702d-80f1-4dba-b8e7-8dbb809fbd6c",
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
  "created_at": "2026-10-30T12:10:32.903727Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e57f8bba-7adc-41a2-96e0-69c2b5104778/cancel` → **200**

```json
{
  "command_id": "f4f035b0-0406-4876-9e99-298d1acf6335",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "e57f8bba-7adc-41a2-96e0-69c2b5104778",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d2df702d-80f1-4dba-b8e7-8dbb809fbd6c",
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
  "created_at": "2026-10-30T12:10:32.903727Z",
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
  "command_id": "8a24e226-62ed-4419-952d-3e9daf68b008",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:10:34Z",
    "sequence": 1793362234159
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a529b37e-a035-4eab-b274-d090fa915c53",
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
  "last_heartbeat_at": "2026-10-30T12:10:34.1788Z",
  "last_location_at": "2026-10-30T12:10:34.1788Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-9784"
}
```

```json
{
  "challenge_id": "0774bf42-e7f3-43a1-99ce-ca81cd842a27",
  "expires_at": "2026-10-30T12:15:34.470115661Z",
  "resend_available_at": "2026-10-30T12:10:35.470115661Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "146486",
  "sent_at": "2026-10-30T12:10:34.473358396Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0774bf42-e7f3-43a1-99ce-ca81cd842a27",
  "code": "146486",
  "device_ref": "sandbox-9784"
}
```

```json
{
  "session_id": "936c2089-a0fe-4b02-9be2-889480469749",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzEzNCwiaWF0IjoxNzkzMzYyMjM0LCJqdGkiOiI5YmFkMWRjNS1iYTRkLTRjNjYtYThmOS0wYjFjYzI1ZjVkNWYiLCJzaWQiOiI5MzZjMjA4OS1hMGZlLTRiMDItOWJlMi04ODk0ODA0Njk3NDkifQ.UJ16SXojJNgkmkQmr1UJZYIKClKINQ7W1Hwke3QIvyA",
  "access_expires_at": "2026-10-30T12:25:34.793963165Z",
  "refresh_token": "WmUpABH8CTL5YTdAAm2K1ed56gake7HsiswFYJen2b0",
  "refresh_expires_at": "2026-11-29T12:10:34.79337796Z",
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
  "command_id": "1a0f8859-359c-4ce5-8efc-ae4583034f67",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:10:35Z",
    "sequence": 1793362235383
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "696938c2-f12b-4c47-aa76-7bd4be3aa27a",
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
  "last_heartbeat_at": "2026-10-30T12:10:35.40363Z",
  "last_location_at": "2026-10-30T12:10:35.40363Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b2261458-0036-4b72-a374-8d1e839665a5",
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
  "id": "30ddc9b6-4e0c-4c43-aa6b-34d9678982d5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:15:35.715409Z",
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
  "command_id": "8cc0387e-1c4c-443f-bed3-eea315093861",
  "quote_id": "30ddc9b6-4e0c-4c43-aa6b-34d9678982d5",
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
  "id": "df6546c6-cddc-4f78-81f5-7d054026e037",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d2df702d-80f1-4dba-b8e7-8dbb809fbd6c",
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
  "created_at": "2026-10-30T12:10:36.013866Z",
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
    "id": "1c868272-733f-416d-a02b-1b31eae0dc91",
    "order_id": "df6546c6-cddc-4f78-81f5-7d054026e037",
    "expires_at": "2026-10-30T12:10:51.01823Z",
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

`POST /api/driver/v1/offers/1c868272-733f-416d-a02b-1b31eae0dc91/accept` → **200**

```json
{
  "command_id": "89d99127-fe70-4751-9097-5f933aad7151"
}
```

```json
{
  "id": "c47b7778-d188-4b7e-92e9-78401901ecc4",
  "order_id": "df6546c6-cddc-4f78-81f5-7d054026e037",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b877b882-b43c-4c37-ab66-3b3a3fe7d535",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b877b882-b43c-4c37-ab66-3b3a3fe7d535",
  "order_id": "df6546c6-cddc-4f78-81f5-7d054026e037",
  "assignment_id": "c47b7778-d188-4b7e-92e9-78401901ecc4",
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

`POST /api/driver/v1/trips/b877b882-b43c-4c37-ab66-3b3a3fe7d535/cancel` → **200**

```json
{
  "command_id": "257ddf43-fbac-45ff-82f7-9b6ffc906069",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "b877b882-b43c-4c37-ab66-3b3a3fe7d535",
  "order_id": "df6546c6-cddc-4f78-81f5-7d054026e037",
  "assignment_id": "c47b7778-d188-4b7e-92e9-78401901ecc4",
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

`GET /api/rider/v1/orders/df6546c6-cddc-4f78-81f5-7d054026e037` → **200**

```json
{
  "id": "df6546c6-cddc-4f78-81f5-7d054026e037",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d2df702d-80f1-4dba-b8e7-8dbb809fbd6c",
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
    "id": "c47b7778-d188-4b7e-92e9-78401901ecc4",
    "order_id": "df6546c6-cddc-4f78-81f5-7d054026e037",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "b877b882-b43c-4c37-ab66-3b3a3fe7d535",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T12:10:36.013866Z",
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
    "id": "ef6bee11-2546-43b5-9217-6229e1356a8e",
    "order_id": "df6546c6-cddc-4f78-81f5-7d054026e037",
    "expires_at": "2026-10-30T12:10:52.282405Z",
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

`POST /api/driver/v1/offers/ef6bee11-2546-43b5-9217-6229e1356a8e/accept` → **200**

```json
{
  "command_id": "e3aa0425-137b-4b4e-a4cc-4fd11618a458"
}
```

```json
{
  "id": "f5ebda14-9b2e-42da-9a52-1a7e9642de03",
  "order_id": "df6546c6-cddc-4f78-81f5-7d054026e037",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "870e8c2f-9c68-4fa3-b0b0-6f0362baa599",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "870e8c2f-9c68-4fa3-b0b0-6f0362baa599",
  "order_id": "df6546c6-cddc-4f78-81f5-7d054026e037",
  "assignment_id": "f5ebda14-9b2e-42da-9a52-1a7e9642de03",
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

`POST /api/driver/v1/trips/870e8c2f-9c68-4fa3-b0b0-6f0362baa599/cancel` → **200**

```json
{
  "command_id": "e70003ce-7cb0-4b8f-b8a6-64997e5e090c",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "870e8c2f-9c68-4fa3-b0b0-6f0362baa599",
  "order_id": "df6546c6-cddc-4f78-81f5-7d054026e037",
  "assignment_id": "f5ebda14-9b2e-42da-9a52-1a7e9642de03",
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
    "id": "df6546c6-cddc-4f78-81f5-7d054026e037",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-30T12:10:36.013866Z",
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
    "id": "e57f8bba-7adc-41a2-96e0-69c2b5104778",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T12:10:32.903727Z",
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

`GET /api/operator/v1/orders/df6546c6-cddc-4f78-81f5-7d054026e037/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T12:10:36.014426Z",
      "actor": {
        "type": "CLIENT",
        "id": "d2df702d-80f1-4dba-b8e7-8dbb809fbd6c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "df6546c6-cddc-4f78-81f5-7d054026e037",
        "quote_id": "30ddc9b6-4e0c-4c43-aa6b-34d9678982d5",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "7a1f122d-3c91-4f36-a34d-bbf74fb3091b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T12:10:36.017021Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "df6546c6-cddc-4f78-81f5-7d054026e037",
        "attempt_id": "c00dabcc-4fe8-4a24-ad79-60010db08809",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7a1f122d-3c91-4f36-a34d-bbf74fb3091b"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T12:10:36.025252Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1c868272-733f-416d-a02b-1b31eae0dc91",
        "order_id": "df6546c6-cddc-4f78-81f5-7d054026e037",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "7a1f122d-3c91-4f36-a34d-bbf74fb3091b"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T12:10:36.633905Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "1c868272-733f-416d-a02b-1b31eae0dc91",
        "order_id": "df6546c6-cddc-4f78-81f5-7d054026e037",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "c47b7778-d188-4b7e-92e9-78401901ecc4"
      },
      "correlation_id": "9af27221-ca97-460e-a3ee-c34197bc9152"
```

Done: orders e57f8bba-7adc-41a2-96e0-69c2b5104778, df6546c6-cddc-4f78-81f5-7d054026e037.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735669232",
  "device_ref": "sandbox-12097"
}
```

```json
{
  "challenge_id": "f97ce89f-347a-4855-b2f5-2440377ef69e",
  "expires_at": "2026-10-30T12:15:39.782433604Z",
  "resend_available_at": "2026-10-30T12:10:40.782433604Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735669232` → **200**

```json
{
  "phone": "+380735669232",
  "audience": "CLIENT",
  "code": "453744",
  "sent_at": "2026-10-30T12:10:39.785540423Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f97ce89f-347a-4855-b2f5-2440377ef69e",
  "code": "453744",
  "device_ref": "sandbox-12097"
}
```

```json
{
  "session_id": "b5ee03c5-3508-4812-aafd-9d21db2d6e80",
  "subject": {
    "type": "CLIENT",
    "id": "3d6b57a8-1318-4d9e-b714-d182a0f826ed"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZDZiNTdhOC0xMzE4LTRkOWUtYjcxNC1kMTgyYTBmODI2ZWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMTQwLCJpYXQiOjE3OTMzNjIyNDAsImp0aSI6IjU0MTkzMWUwLTZkNjMtNDhjMy1hOTRlLWJhNDFmZWQ0YzZlMSIsInNpZCI6ImI1ZWUwM2M1LTM1MDgtNDgxMi1hYWZkLTlkMjFkYjJkNmU4MCJ9.6NSuO1KWl0_VxycJagw_ygB1Bs4-7pyhNqvcM-zRAPI",
  "access_expires_at": "2026-10-30T12:25:40.101013361Z",
  "refresh_token": "tDYl85jIaC-mFj09GjdnikR8IjpGsJPwbjliOoa8Xzk",
  "refresh_expires_at": "2026-11-29T12:10:40.100449014Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "f15d10a4-c616-4e41-b20b-3122a01b5bf7",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "94fd9b00-0888-42ac-b7f7-8d43b0b21a62",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-94fd9b00-0888-42ac-b7f7-8d43b0b21a62",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "55bc1c853e0ac11420d61588a474de5e",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=94fd9b00-0888-42ac-b7f7-8d43b0b21a62",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735669232"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=94fd9b00-0888-42ac-b7f7-8d43b0b21a62",
  "expires_at": "2026-10-30T12:40:40.401204Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/94fd9b00-0888-42ac-b7f7-8d43b0b21a62` → **200**

```json
{
  "id": "94fd9b00-0888-42ac-b7f7-8d43b0b21a62",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T12:40:40.401204Z",
  "card": {
    "id": "3c0721fb-5af8-4d9c-815b-527ca8ad4044",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6118",
    "card_type": "Visa",
    "created_at": "2026-10-30T12:10:40.708205Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "3c0721fb-5af8-4d9c-815b-527ca8ad4044",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****6118",
      "card_type": "Visa",
      "created_at": "2026-10-30T12:10:40.708205Z"
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
  "device_ref": "sandbox-6715"
}
```

```json
{
  "challenge_id": "d7fb0990-a672-4de7-99ce-34d8ad991036",
  "expires_at": "2026-10-30T12:15:41.310234503Z",
  "resend_available_at": "2026-10-30T12:10:42.310234503Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "201384",
  "sent_at": "2026-10-30T12:10:41.313056346Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d7fb0990-a672-4de7-99ce-34d8ad991036",
  "code": "201384",
  "device_ref": "sandbox-6715"
}
```

```json
{
  "session_id": "05727496-a2cc-42c7-bbba-1f7e1b3455cc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzE0MSwiaWF0IjoxNzkzMzYyMjQxLCJqdGkiOiIzZWMyNTZiMi03ZTAyLTRkYWMtODQwZC0wYTE0NzU0ODllYzgiLCJzaWQiOiIwNTcyNzQ5Ni1hMmNjLTQyYzctYmJiYS0xZjdlMWIzNDU1Y2MifQ.R0JbaQ_5hRQKw6oHwEMKa6nDpUd-sfOM8a0_qeJ4Dz8",
  "access_expires_at": "2026-10-30T12:25:41.626653239Z",
  "refresh_token": "hzez1gY2z0yVbVR60Qxe7pa0IHu8CDgKsDeP1R-x-ks",
  "refresh_expires_at": "2026-11-29T12:10:41.626020353Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "696938c2-f12b-4c47-aa76-7bd4be3aa27a",
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
  "last_heartbeat_at": "2026-10-30T12:10:35.40363Z",
  "last_location_at": "2026-10-30T12:10:35.40363Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/696938c2-f12b-4c47-aa76-7bd4be3aa27a/handover` → **200**

```json
{
  "command_id": "975b48fb-34bf-4cc7-94ab-5fc03d7fb7fa",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "696938c2-f12b-4c47-aa76-7bd4be3aa27a",
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
  "last_heartbeat_at": "2026-10-30T12:10:35.40363Z",
  "last_location_at": "2026-10-30T12:10:35.40363Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 42 s to the next point)

`POST /api/driver/v1/work-sessions/696938c2-f12b-4c47-aa76-7bd4be3aa27a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:11:24Z",
    "sequence": 1793362284540
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "696938c2-f12b-4c47-aa76-7bd4be3aa27a",
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
  "last_heartbeat_at": "2026-10-30T12:11:24.559527Z",
  "last_location_at": "2026-10-30T12:11:24.559527Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ab963332-a437-4992-9dd4-1fb15f6472c6",
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
  "id": "bd45ee50-bbf6-4531-9249-e41dd8e30d61",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:16:24.860778Z",
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
  "command_id": "fef1ba56-4dbd-4edd-90cd-e01313c750ce",
  "quote_id": "bd45ee50-bbf6-4531-9249-e41dd8e30d61",
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
  "id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3d6b57a8-1318-4d9e-b714-d182a0f826ed",
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
  "created_at": "2026-10-30T12:11:25.173473Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dae239aa-24cf-4ac9-a2e2-34c18b98b83b` → **200**

```json
{
  "id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3d6b57a8-1318-4d9e-b714-d182a0f826ed",
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
  "created_at": "2026-10-30T12:11:25.173473Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dae239aa-24cf-4ac9-a2e2-34c18b98b83b` → **200**

```json
{
  "id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3d6b57a8-1318-4d9e-b714-d182a0f826ed",
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
  "created_at": "2026-10-30T12:11:25.173473Z",
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
    "id": "2be8b0be-4d77-46df-b1f1-caa1e084b035",
    "order_id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
    "expires_at": "2026-10-30T12:11:40.541374Z",
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

`POST /api/driver/v1/offers/2be8b0be-4d77-46df-b1f1-caa1e084b035/accept` → **200**

```json
{
  "command_id": "74b75614-705e-4b18-b315-8888bc60d62d"
}
```

```json
{
  "id": "b1ede896-3741-401f-8eab-1c7d9c602ec5",
  "order_id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "97f058bf-10b0-4a40-bc40-c09faf3fe14e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "97f058bf-10b0-4a40-bc40-c09faf3fe14e",
  "order_id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
  "assignment_id": "b1ede896-3741-401f-8eab-1c7d9c602ec5",
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

(the car drives 6 s to the next point)

`POST /api/driver/v1/work-sessions/696938c2-f12b-4c47-aa76-7bd4be3aa27a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:11:34Z",
    "sequence": 1793362294725
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "696938c2-f12b-4c47-aa76-7bd4be3aa27a",
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
  "last_heartbeat_at": "2026-10-30T12:11:34.02579Z",
  "last_location_at": "2026-10-30T12:11:34.02579Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/97f058bf-10b0-4a40-bc40-c09faf3fe14e/arrive` → **200**

```json
{
  "command_id": "17b6ad89-95fb-4c6f-97a7-eb4c57c5c773",
  "expected_version": 0
}
```

```json
{
  "id": "97f058bf-10b0-4a40-bc40-c09faf3fe14e",
  "order_id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
  "assignment_id": "b1ede896-3741-401f-8eab-1c7d9c602ec5",
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
  "arrived_at": "2026-10-30T12:11:34.324537Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/97f058bf-10b0-4a40-bc40-c09faf3fe14e/start` → **200**

```json
{
  "command_id": "728c473f-eed1-4616-867b-87719ce2c8f1",
  "expected_version": 1
}
```

```json
{
  "id": "97f058bf-10b0-4a40-bc40-c09faf3fe14e",
  "order_id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
  "assignment_id": "b1ede896-3741-401f-8eab-1c7d9c602ec5",
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
  "arrived_at": "2026-10-30T12:11:34.324537Z",
  "started_at": "2026-10-30T12:11:34.634126Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/97f058bf-10b0-4a40-bc40-c09faf3fe14e/complete` → **200**

```json
{
  "command_id": "4b2d6a39-e697-4d44-8913-2fa9f5b8441a",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:11:34Z",
  "cash_received": true
}
```

```json
{
  "id": "97f058bf-10b0-4a40-bc40-c09faf3fe14e",
  "order_id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
  "assignment_id": "b1ede896-3741-401f-8eab-1c7d9c602ec5",
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
  "arrived_at": "2026-10-30T12:11:34.324537Z",
  "started_at": "2026-10-30T12:11:34.634126Z",
  "completed_at": "2026-10-30T12:11:34.956508Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/dae239aa-24cf-4ac9-a2e2-34c18b98b83b` → **200**

```json
{
  "id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "3d6b57a8-1318-4d9e-b714-d182a0f826ed",
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
    "id": "b1ede896-3741-401f-8eab-1c7d9c602ec5",
    "order_id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "97f058bf-10b0-4a40-bc40-c09faf3fe14e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:11:25.173473Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dae239aa-24cf-4ac9-a2e2-34c18b98b83b` → **200**

```json
{
  "id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "3d6b57a8-1318-4d9e-b714-d182a0f826ed",
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
    "id": "b1ede896-3741-401f-8eab-1c7d9c602ec5",
    "order_id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "97f058bf-10b0-4a40-bc40-c09faf3fe14e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:11:25.173473Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dae239aa-24cf-4ac9-a2e2-34c18b98b83b` → **200**

```json
{
  "id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "3d6b57a8-1318-4d9e-b714-d182a0f826ed",
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
    "id": "b1ede896-3741-401f-8eab-1c7d9c602ec5",
    "order_id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "97f058bf-10b0-4a40-bc40-c09faf3fe14e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:11:25.173473Z",
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

`GET /api/rider/v1/orders/dae239aa-24cf-4ac9-a2e2-34c18b98b83b/tip` → **200**

```json
{
  "order_id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
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
  "available_until": "2026-10-31T12:11:34.956508Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/dae239aa-24cf-4ac9-a2e2-34c18b98b83b/tip` → **201**

```json
{
  "command_id": "3fc5a33a-2876-4e17-ae47-c4177a9cc93c",
  "amount_minor": 2500
}
```

```json
{
  "id": "509417db-7b20-4612-a55c-a34f2772ba36",
  "order_id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T12:11:38.775281Z"
}
```

`GET /api/rider/v1/orders/dae239aa-24cf-4ac9-a2e2-34c18b98b83b/tip` → **200**

```json
{
  "order_id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
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
  "available_until": "2026-10-31T12:11:34.956508Z",
  "open": false,
  "tip": {
    "id": "509417db-7b20-4612-a55c-a34f2772ba36",
    "order_id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T12:11:38.775281Z"
  }
}
```

`GET /api/rider/v1/orders/dae239aa-24cf-4ac9-a2e2-34c18b98b83b/tip` → **200**

```json
{
  "order_id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
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
  "available_until": "2026-10-31T12:11:34.956508Z",
  "open": false,
  "tip": {
    "id": "509417db-7b20-4612-a55c-a34f2772ba36",
    "order_id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T12:11:38.775281Z"
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
      "id": "e255c9ac-f448-4982-b184-de81a7ae45c0",
      "at": "2026-10-30T12:11:40.670166Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
      "counterpart_id": null
    },
    {
      "id": "2de9df0b-980f-452f-933d-1bcee0a2f8b0",
      "at": "2026-10-30T12:11:35.618073Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bab38abf-17a3-44f6-a05a-2427f428af82",
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
  "id": "df4d876b-a9b6-4d5d-965d-1eea01d71a86",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:16:41.005274Z",
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
  "session_id": "8e50f769-8e70-4067-bdf4-af91a005398a",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMyMDEsImlhdCI6MTc5MzM2MjMwMSwianRpIjoiYzdkYTZjYzAtNjA3ZC00YzlkLTk1MTgtZTE2MGJiOTgyOWJiIiwic2lkIjoiOGU1MGY3NjktOGU3MC00MDY3LWJkZjQtYWY5MWEwMDUzOThhIn0.Q3rcQeklDJI6gJdsevvg1bBACLQrNnxr2D9fdKoXB7U",
  "access_expires_at": "2026-10-30T12:26:41.598180818Z",
  "refresh_token": "NXrH1cweSy1_KQFrhwmQqXYHxkPE1_YlnxIMmP54LDs",
  "refresh_expires_at": "2026-10-31T00:11:41.597587015Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380735669232` → **200**

```json
{
  "client_id": "3d6b57a8-1318-4d9e-b714-d182a0f826ed"
}
```

`POST /api/admin/v1/rider-wallets/3d6b57a8-1318-4d9e-b714-d182a0f826ed/top-ups` → **201**

```json
{
  "command_id": "4f05ba59-0710-4f5f-8372-b53cdf6ae3d7",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "3d6b57a8-1318-4d9e-b714-d182a0f826ed",
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
      "id": "3537aefc-4f76-4887-84c8-af0a4a8e1c0a",
      "at": "2026-10-30T12:11:42.165464Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "c2b31b2b-8610-441e-a39e-de6e6485310e",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1fda29a3-3378-4fab-a8fa-ccc3008b68eb",
  "quote_id": "df4d876b-a9b6-4d5d-965d-1eea01d71a86",
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
  "id": "c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3d6b57a8-1318-4d9e-b714-d182a0f826ed",
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
  "created_at": "2026-10-30T12:11:42.487416Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba` → **200**

```json
{
  "id": "c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3d6b57a8-1318-4d9e-b714-d182a0f826ed",
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
  "created_at": "2026-10-30T12:11:42.487416Z",
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
    "id": "d6214876-feb7-45d3-89cb-bb4e1a9e6eb2",
    "order_id": "c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba",
    "expires_at": "2026-10-30T12:11:57.492277Z",
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

`POST /api/driver/v1/offers/d6214876-feb7-45d3-89cb-bb4e1a9e6eb2/accept` → **200**

```json
{
  "command_id": "232a77ac-0f93-430c-b36f-efbea9a36487"
}
```

```json
{
  "id": "8d05fd4b-54c3-4e08-832f-6a5b8c15d57e",
  "order_id": "c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "54115e9a-53b1-4e5c-a967-ebe4cade5d10",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "54115e9a-53b1-4e5c-a967-ebe4cade5d10",
  "order_id": "c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba",
  "assignment_id": "8d05fd4b-54c3-4e08-832f-6a5b8c15d57e",
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

`POST /api/driver/v1/work-sessions/696938c2-f12b-4c47-aa76-7bd4be3aa27a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:11:44Z",
    "sequence": 1793362304148
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "696938c2-f12b-4c47-aa76-7bd4be3aa27a",
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
  "last_heartbeat_at": "2026-10-30T12:11:44.033749Z",
  "last_location_at": "2026-10-30T12:11:44.033749Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/54115e9a-53b1-4e5c-a967-ebe4cade5d10/arrive` → **200**

```json
{
  "command_id": "1ab8a0de-ffa3-4794-9e9d-d619267fd485",
  "expected_version": 0
}
```

```json
{
  "id": "54115e9a-53b1-4e5c-a967-ebe4cade5d10",
  "order_id": "c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba",
  "assignment_id": "8d05fd4b-54c3-4e08-832f-6a5b8c15d57e",
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
  "arrived_at": "2026-10-30T12:11:44.33285Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/54115e9a-53b1-4e5c-a967-ebe4cade5d10/start` → **200**

```json
{
  "command_id": "8e820cc2-1a0a-4634-8b1d-25089656832a",
  "expected_version": 1
}
```

```json
{
  "id": "54115e9a-53b1-4e5c-a967-ebe4cade5d10",
  "order_id": "c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba",
  "assignment_id": "8d05fd4b-54c3-4e08-832f-6a5b8c15d57e",
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
  "arrived_at": "2026-10-30T12:11:44.33285Z",
  "started_at": "2026-10-30T12:11:44.646526Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/54115e9a-53b1-4e5c-a967-ebe4cade5d10/complete` → **200**

```json
{
  "command_id": "b6293b7a-e702-4b5a-a9eb-f644249ef429",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:11:44Z",
  "cash_received": true
}
```

```json
{
  "id": "54115e9a-53b1-4e5c-a967-ebe4cade5d10",
  "order_id": "c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba",
  "assignment_id": "8d05fd4b-54c3-4e08-832f-6a5b8c15d57e",
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
  "arrived_at": "2026-10-30T12:11:44.33285Z",
  "started_at": "2026-10-30T12:11:44.646526Z",
  "completed_at": "2026-10-30T12:11:44.963605Z",
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
  "client_id": "3d6b57a8-1318-4d9e-b714-d182a0f826ed",
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
      "id": "3537aefc-4f76-4887-84c8-af0a4a8e1c0a",
      "at": "2026-10-30T12:11:42.165464Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "c2b31b2b-8610-441e-a39e-de6e6485310e",
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

`GET /api/rider/v1/orders/c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba/tip` → **200**

```json
{
  "order_id": "c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba",
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
  "available_until": "2026-10-31T12:11:44.963605Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba/tip` → **201**

```json
{
  "command_id": "19f08c8f-3a52-4556-9f5e-342db1ecb59d",
  "amount_minor": 2500
}
```

```json
{
  "id": "524bc3d1-bdda-4302-b309-76cb3f4584c0",
  "order_id": "c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T12:11:46.145687Z"
}
```

`GET /api/rider/v1/orders/c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba/tip` → **200**

```json
{
  "order_id": "c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba",
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
  "available_until": "2026-10-31T12:11:44.963605Z",
  "open": false,
  "tip": {
    "id": "524bc3d1-bdda-4302-b309-76cb3f4584c0",
    "order_id": "c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T12:11:46.145687Z"
  }
}
```

`GET /api/rider/v1/orders/c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba/tip` → **200**

```json
{
  "order_id": "c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba",
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
  "available_until": "2026-10-31T12:11:44.963605Z",
  "open": false,
  "tip": {
    "id": "524bc3d1-bdda-4302-b309-76cb3f4584c0",
    "order_id": "c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T12:11:46.145687Z"
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
      "id": "c52c92d7-ce80-4b01-8796-a52d69dac7bd",
      "at": "2026-10-30T12:11:47.748417Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba",
      "counterpart_id": null
    },
    {
      "id": "f270c8df-4f53-4590-9099-b3ed10767218",
      "at": "2026-10-30T12:11:45.716615Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba",
      "counterpart_id": null
    },
    {
      "id": "e255c9ac-f448-4982-b184-de81a7ae45c0",
      "at": "2026-10-30T12:11:40.670166Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
      "counterpart_id": null
    },
    {
      "id": "2de9df0b-980f-452f-933d-1bcee0a2f8b0",
      "at": "2026-10-30T12:11:35.618073Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "dae239aa-24cf-4ac9-a2e2-34c18b98b83b",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "696938c2-f12b-4c47-aa76-7bd4be3aa27a",
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
  "last_heartbeat_at": "2026-10-30T12:11:44.033749Z",
  "last_location_at": "2026-10-30T12:11:44.033749Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/696938c2-f12b-4c47-aa76-7bd4be3aa27a/close` → **200**

```json
{
  "command_id": "6dd16885-553f-41cc-9ca2-8839a0d1fc70",
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

Done: card order c477c9c0-b8c3-4ff9-a7a9-9f49829f53ba.

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
  "phone": "+380738763537",
  "device_ref": "sandbox-30665"
}
```

```json
{
  "challenge_id": "42faf68d-f0a2-48b2-8e2f-f5b02830207d",
  "expires_at": "2026-10-30T12:16:49.246476376Z",
  "resend_available_at": "2026-10-30T12:11:50.246476376Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738763537` → **200**

```json
{
  "phone": "+380738763537",
  "audience": "CLIENT",
  "code": "443725",
  "sent_at": "2026-10-30T12:11:49.249215817Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "42faf68d-f0a2-48b2-8e2f-f5b02830207d",
  "code": "443725",
  "device_ref": "sandbox-30665"
}
```

```json
{
  "session_id": "1d970c93-0235-4dbe-8a5e-28faff53bcce",
  "subject": {
    "type": "CLIENT",
    "id": "cdaeb610-9a8e-47d3-a651-708686cd089c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZGFlYjYxMC05YThlLTQ3ZDMtYTY1MS03MDg2ODZjZDA4OWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMjA5LCJpYXQiOjE3OTMzNjIzMDksImp0aSI6IjRhMGJjY2FmLWI3ZmItNGQ1YS05ZDkwLTIwZDU5MWFjMzA0ZiIsInNpZCI6IjFkOTcwYzkzLTAyMzUtNGRiZS04YTVlLTI4ZmFmZjUzYmNjZSJ9.RayHuf2WAdySynhiVDVEWhH2cumZW4BzegHpCesGL5Y",
  "access_expires_at": "2026-10-30T12:26:49.570144608Z",
  "refresh_token": "1er4HevEzlOcyoXCLRGQIfOEXPzeWtk4CNNwkwMnu_o",
  "refresh_expires_at": "2026-11-29T12:11:49.569610387Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "c4884477-d5bd-458c-a3bf-a97316a69a1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "2cf6fb5e-fb38-4cc8-9590-6e7def47b0cd",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-2cf6fb5e-fb38-4cc8-9590-6e7def47b0cd",
    "orderDate": "1793362309",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "f566addb16102e9fcda7f227a222baeb",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=2cf6fb5e-fb38-4cc8-9590-6e7def47b0cd",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738763537"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=2cf6fb5e-fb38-4cc8-9590-6e7def47b0cd",
  "created_at": "2026-10-30T12:11:49.883949Z",
  "expires_at": "2026-10-30T12:41:49.883949Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/2cf6fb5e-fb38-4cc8-9590-6e7def47b0cd` → **200**

```json
{
  "id": "2cf6fb5e-fb38-4cc8-9590-6e7def47b0cd",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T12:11:49.883949Z",
  "expires_at": "2026-10-30T12:41:49.883949Z",
  "completed_at": "2026-10-30T12:11:50.179776Z",
  "masked_pan": "41****9353",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "cdaeb610-9a8e-47d3-a651-708686cd089c",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "cdaeb610-9a8e-47d3-a651-708686cd089c",
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
      "id": "af582747-789a-4a29-a9d8-bbeb41e5cea6",
      "at": "2026-10-30T12:11:50.770486Z",
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
  "client_id": "cdaeb610-9a8e-47d3-a651-708686cd089c",
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
      "id": "af582747-789a-4a29-a9d8-bbeb41e5cea6",
      "at": "2026-10-30T12:11:50.770486Z",
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
  "device_ref": "sandbox-7268"
}
```

```json
{
  "challenge_id": "f0125342-bf8f-4bce-a42b-2e77cd1d79ca",
  "expires_at": "2026-10-30T12:16:52.358220648Z",
  "resend_available_at": "2026-10-30T12:11:53.358220648Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "526500",
  "sent_at": "2026-10-30T12:11:52.361257868Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0125342-bf8f-4bce-a42b-2e77cd1d79ca",
  "code": "526500",
  "device_ref": "sandbox-7268"
}
```

```json
{
  "session_id": "d8f85116-fb5c-4b6b-877b-4cac0053e10e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzIxMiwiaWF0IjoxNzkzMzYyMzEyLCJqdGkiOiJmMDVlZjBiMS1hOWNjLTQ5ZmQtYWY4Mi1kNWQ1NWMzOGRlZjIiLCJzaWQiOiJkOGY4NTExNi1mYjVjLTRiNmItODc3Yi00Y2FjMDA1M2UxMGUifQ.NoPf9wUDa80kKwj1iilWYZ9U3CXwRgA31HS-0sieoVo",
  "access_expires_at": "2026-10-30T12:26:52.675810279Z",
  "refresh_token": "7kTWG2KuF-vRCMuS1Aag54gLsH0TGyx9FhXFQ7cSa9k",
  "refresh_expires_at": "2026-11-29T12:11:52.675245391Z",
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
  "command_id": "6388b46b-13cc-4450-a553-7a0a87ff89db",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "b61a4507-50f7-478d-b730-2852ab376134",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-b61a4507-50f7-478d-b730-2852ab376134",
    "orderDate": "1793362313",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "c7ddd72ab2420c74ffc4eac22f973ca7",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=b61a4507-50f7-478d-b730-2852ab376134",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=b61a4507-50f7-478d-b730-2852ab376134",
  "created_at": "2026-10-30T12:11:53.273723Z",
  "expires_at": "2026-10-30T12:41:53.273723Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/b61a4507-50f7-478d-b730-2852ab376134` → **200**

```json
{
  "id": "b61a4507-50f7-478d-b730-2852ab376134",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T12:11:53.273723Z",
  "expires_at": "2026-10-30T12:41:53.273723Z",
  "completed_at": "2026-10-30T12:11:53.581361Z",
  "masked_pan": "41****2926",
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
      "id": "10a349af-684b-403b-a41a-292640058560",
      "at": "2026-10-30T12:11:53.778003Z",
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
  "command_id": "46db1680-acc5-460d-af62-138e36daf2d7",
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
  "correlation_id": "eee94438-7327-4720-a39f-977f21035c3e"
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
  "device_ref": "sandbox-28561"
}
```

```json
{
  "challenge_id": "82cd70d9-0871-4b69-b2ea-edc7496a8106",
  "expires_at": "2026-10-30T12:16:54.494587923Z",
  "resend_available_at": "2026-10-30T12:11:55.494587923Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "446097",
  "sent_at": "2026-10-30T12:11:54.497442606Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "82cd70d9-0871-4b69-b2ea-edc7496a8106",
  "code": "446097",
  "device_ref": "sandbox-28561"
}
```

```json
{
  "session_id": "a677c2ad-66b1-48f8-8465-c878f747fa60",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzIxNCwiaWF0IjoxNzkzMzYyMzE0LCJqdGkiOiI5NTYwZGVhZS0yMGE1LTQ4ZDYtOTlhNi1hN2NiMGFkNzMwNzkiLCJzaWQiOiJhNjc3YzJhZC02NmIxLTQ4ZjgtODQ2NS1jODc4Zjc0N2ZhNjAifQ.QjFSaNEZHkp-9QszUZthYVbVcjpnLjPRaKRk9NwQSHE",
  "access_expires_at": "2026-10-30T12:26:54.806480553Z",
  "refresh_token": "y14s7aduLIR6489XpNQrJ3vbiPZPshIUzadD9dwLbSk",
  "refresh_expires_at": "2026-11-29T12:11:54.805894164Z",
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
  "command_id": "0c11e80b-b99f-4b9a-8d35-cbd14c34ece0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:11:55Z",
    "sequence": 1793362315399
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7bf6e95a-5e80-47bd-a4bf-20e2ea906d3e",
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
  "last_heartbeat_at": "2026-10-30T12:11:55.419145Z",
  "last_location_at": "2026-10-30T12:11:55.419145Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636309310",
  "device_ref": "sandbox-21750"
}
```

```json
{
  "challenge_id": "5aa93809-1b7d-4577-b925-ef61e85208fc",
  "expires_at": "2026-10-30T12:16:55.72443812Z",
  "resend_available_at": "2026-10-30T12:11:56.72443812Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636309310` → **200**

```json
{
  "phone": "+380636309310",
  "audience": "CLIENT",
  "code": "796870",
  "sent_at": "2026-10-30T12:11:55.72751147Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5aa93809-1b7d-4577-b925-ef61e85208fc",
  "code": "796870",
  "device_ref": "sandbox-21750"
}
```

```json
{
  "session_id": "7d9314d4-b915-4e1a-8259-19be3f2b66ac",
  "subject": {
    "type": "CLIENT",
    "id": "2ad1b92d-c18d-4ce3-bd8a-df4c0b7084ca"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYWQxYjkyZC1jMThkLTRjZTMtYmQ4YS1kZjRjMGI3MDg0Y2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMjE2LCJpYXQiOjE3OTMzNjIzMTYsImp0aSI6IjAxZmZiYTdhLWY1MDktNDU2ZC04YzRkLWM1MWNlZjRlMDYyOCIsInNpZCI6IjdkOTMxNGQ0LWI5MTUtNGUxYS04MjU5LTE5YmUzZjJiNjZhYyJ9.OMgsWl26i7GCzQVdN85YVtMIkTJTpyQO3Ct0S179LPM",
  "access_expires_at": "2026-10-30T12:26:56.044192516Z",
  "refresh_token": "CdYQHB3MtrK1_3aIEX7OOLwVFykyIrfEeImi5AxH8Lg",
  "refresh_expires_at": "2026-11-29T12:11:56.043646442Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1fdcd440-efcc-4ff0-8766-eeb61cb87e96",
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
  "id": "d78e9c1d-e582-4671-a5fd-7f352cc6788c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:16:56.340980Z",
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
  "command_id": "7a63dc37-046f-4459-9073-a1145464c212",
  "quote_id": "d78e9c1d-e582-4671-a5fd-7f352cc6788c",
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
  "id": "666463c8-9858-4508-8aca-66bb9a7832fa",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2ad1b92d-c18d-4ce3-bd8a-df4c0b7084ca",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:11:56.647467Z",
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
    "id": "47102b4c-b00f-4060-b0c9-eae32fb2f70c",
    "order_id": "666463c8-9858-4508-8aca-66bb9a7832fa",
    "expires_at": "2026-10-30T12:12:11.650512Z",
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

`POST /api/driver/v1/offers/47102b4c-b00f-4060-b0c9-eae32fb2f70c/accept` → **200**

```json
{
  "command_id": "4fb5bc9b-e8f9-4e8b-9928-543f9329be38"
}
```

```json
{
  "id": "57e18ebc-2944-4857-8b9b-1451cdad081f",
  "order_id": "666463c8-9858-4508-8aca-66bb9a7832fa",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a4f85f19-6848-4736-9bf0-68229de0ab4b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a4f85f19-6848-4736-9bf0-68229de0ab4b",
  "order_id": "666463c8-9858-4508-8aca-66bb9a7832fa",
  "assignment_id": "57e18ebc-2944-4857-8b9b-1451cdad081f",
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

`POST /api/driver/v1/work-sessions/7bf6e95a-5e80-47bd-a4bf-20e2ea906d3e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:11:57Z",
    "sequence": 1793362317841
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7bf6e95a-5e80-47bd-a4bf-20e2ea906d3e",
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
  "last_heartbeat_at": "2026-10-30T12:11:57.860263Z",
  "last_location_at": "2026-10-30T12:11:57.860263Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a4f85f19-6848-4736-9bf0-68229de0ab4b/arrive` → **200**

```json
{
  "command_id": "13da4bce-e986-4a3c-9a90-a1be0fe8b4ce",
  "expected_version": 0
}
```

```json
{
  "id": "a4f85f19-6848-4736-9bf0-68229de0ab4b",
  "order_id": "666463c8-9858-4508-8aca-66bb9a7832fa",
  "assignment_id": "57e18ebc-2944-4857-8b9b-1451cdad081f",
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
  "arrived_at": "2026-10-30T12:11:58.162379Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a4f85f19-6848-4736-9bf0-68229de0ab4b/start` → **200**

```json
{
  "command_id": "386ebe3d-3a16-4457-a58f-ac1753c81712",
  "expected_version": 1
}
```

```json
{
  "id": "a4f85f19-6848-4736-9bf0-68229de0ab4b",
  "order_id": "666463c8-9858-4508-8aca-66bb9a7832fa",
  "assignment_id": "57e18ebc-2944-4857-8b9b-1451cdad081f",
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
  "arrived_at": "2026-10-30T12:11:58.162379Z",
  "started_at": "2026-10-30T12:11:58.459336Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a4f85f19-6848-4736-9bf0-68229de0ab4b/complete` → **200**

```json
{
  "command_id": "6c86033d-9596-410f-95c5-a7e2e9e7da29",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:11:58Z",
  "cash_received": false
}
```

```json
{
  "id": "a4f85f19-6848-4736-9bf0-68229de0ab4b",
  "order_id": "666463c8-9858-4508-8aca-66bb9a7832fa",
  "assignment_id": "57e18ebc-2944-4857-8b9b-1451cdad081f",
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
  "arrived_at": "2026-10-30T12:11:58.162379Z",
  "started_at": "2026-10-30T12:11:58.459336Z",
  "completed_at": "2026-10-30T12:11:58.772408Z",
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
  "session_id": "0d0fbb25-d617-4cfe-81be-62bf9398e7d0",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMyMTksImlhdCI6MTc5MzM2MjMxOSwianRpIjoiYzkyNDVhMDUtMzMyYy00ZjBjLWEwZjQtMTA4NDE5MTRjZGNlIiwic2lkIjoiMGQwZmJiMjUtZDYxNy00Y2ZlLTgxYmUtNjJiZjkzOThlN2QwIn0.SvjeeJ1LLQ9aZr7xvbrFHKBlPX7ki0GeTe4iR8UfzRI",
  "access_expires_at": "2026-10-30T12:26:59.383862369Z",
  "refresh_token": "zZ_Ot5R6MoyddEOFxYgHHe6oUuOR3vEBX02kEOK_gG4",
  "refresh_expires_at": "2026-10-31T00:11:59.383120429Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/666463c8-9858-4508-8aca-66bb9a7832fa/cash-dispute` → **200**

```json
{
  "order_id": "666463c8-9858-4508-8aca-66bb9a7832fa",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "2ad1b92d-c18d-4ce3-bd8a-df4c0b7084ca",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T12:11:58.850813Z",
  "decide_by": "2026-11-13T12:11:58.850813Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T12:11:58.850813Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "666463c8-9858-4508-8aca-66bb9a7832fa",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "2ad1b92d-c18d-4ce3-bd8a-df4c0b7084ca",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T12:11:58.850813Z",
      "decide_by": "2026-11-13T12:11:58.850813Z",
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

`POST /api/admin/v1/orders/666463c8-9858-4508-8aca-66bb9a7832fa/cash-dispute/decide` → **400**

```json
{
  "command_id": "28dd00e4-f541-4a2f-96ee-e1beddb21a26",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/666463c8-9858-4508-8aca-66bb9a7832fa/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "5d8afffd-5575-415e-b804-89e9cf151196",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/666463c8-9858-4508-8aca-66bb9a7832fa/cash-dispute/decide` → **200**

```json
{
  "command_id": "771e43f4-00b5-4b3a-8db3-85215bccdce4",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "666463c8-9858-4508-8aca-66bb9a7832fa",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "2ad1b92d-c18d-4ce3-bd8a-df4c0b7084ca",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T12:11:58.850813Z",
  "decide_by": "2026-11-13T12:11:58.850813Z",
  "decision": "PAY_DRIVER",
  "decided_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T12:12:00.692592Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/666463c8-9858-4508-8aca-66bb9a7832fa/cash-dispute/decide` → **409**

```json
{
  "command_id": "0593b827-4bf9-467e-8a08-abdaea05d48f",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/666463c8-9858-4508-8aca-66bb9a7832fa/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "76a33169-111f-4fbe-b363-701000cb997c"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7bf6e95a-5e80-47bd-a4bf-20e2ea906d3e",
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
  "last_heartbeat_at": "2026-10-30T12:11:57.860263Z",
  "last_location_at": "2026-10-30T12:11:57.860263Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7bf6e95a-5e80-47bd-a4bf-20e2ea906d3e/close` → **200**

```json
{
  "command_id": "724f1c6d-ec25-4a4a-ae7b-246e1ed9d96b",
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
  "phone": "+380735597813",
  "device_ref": "sandbox-14385"
}
```

```json
{
  "challenge_id": "97728be6-f2a1-43db-a555-ed51ca5393a0",
  "expires_at": "2026-10-30T12:17:01.911002332Z",
  "resend_available_at": "2026-10-30T12:12:02.911002332Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735597813` → **200**

```json
{
  "phone": "+380735597813",
  "audience": "CLIENT",
  "code": "135048",
  "sent_at": "2026-10-30T12:12:01.914186993Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "97728be6-f2a1-43db-a555-ed51ca5393a0",
  "code": "135048",
  "device_ref": "sandbox-14385"
}
```

```json
{
  "session_id": "f3b611bc-3144-443e-811e-9516ae586d6b",
  "subject": {
    "type": "CLIENT",
    "id": "e41301d0-2c47-4464-b081-10d7463dbe19"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNDEzMDFkMC0yYzQ3LTQ0NjQtYjA4MS0xMGQ3NDYzZGJlMTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMjIyLCJpYXQiOjE3OTMzNjIzMjIsImp0aSI6ImMzZmVlYTVmLTRiMzEtNGQ3YS04NjBjLTViM2NmYWM3YWE4OCIsInNpZCI6ImYzYjYxMWJjLTMxNDQtNDQzZS04MTFlLTk1MTZhZTU4NmQ2YiJ9.wIgC5_xEaHjyWACLtNO4HJsC4nYU7h3Pp3ElVTlgZLA",
  "access_expires_at": "2026-10-30T12:27:02.237193213Z",
  "refresh_token": "U_d5vOF0vguq3D-WJMkbTjR0QF6nU0D-2NxfP5NPrOs",
  "refresh_expires_at": "2026-11-29T12:12:02.236670784Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "c126de85-fb44-4627-80e5-dcc65c329413",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "45d4218c-507b-4c1e-8abe-7087dc72adc2",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-45d4218c-507b-4c1e-8abe-7087dc72adc2",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "5b929cb580c35dfa361605af4e7e45c4",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=45d4218c-507b-4c1e-8abe-7087dc72adc2",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735597813"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=45d4218c-507b-4c1e-8abe-7087dc72adc2",
  "expires_at": "2026-10-30T12:42:02.526888Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/45d4218c-507b-4c1e-8abe-7087dc72adc2` → **200**

```json
{
  "id": "45d4218c-507b-4c1e-8abe-7087dc72adc2",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T12:42:02.526888Z",
  "card": {
    "id": "ce7642ce-983e-47c1-8dc8-39bc78ebaa3a",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5725",
    "card_type": "Visa",
    "created_at": "2026-10-30T12:12:02.823106Z"
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
  "device_ref": "sandbox-26029"
}
```

```json
{
  "challenge_id": "4ea957d3-fe3c-4a5c-9c07-9fbaa387983c",
  "expires_at": "2026-10-30T12:17:03.142256516Z",
  "resend_available_at": "2026-10-30T12:12:04.142256516Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "264001",
  "sent_at": "2026-10-30T12:12:03.145173899Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4ea957d3-fe3c-4a5c-9c07-9fbaa387983c",
  "code": "264001",
  "device_ref": "sandbox-26029"
}
```

```json
{
  "session_id": "64fcc201-011a-4c68-afd1-251c4a351ee4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzIyMywiaWF0IjoxNzkzMzYyMzIzLCJqdGkiOiIyOWFiMDM3ZS1hNGE4LTQxZmQtYjUxNS1lMjVkMjRkNGE1YzIiLCJzaWQiOiI2NGZjYzIwMS0wMTFhLTRjNjgtYWZkMS0yNTFjNGEzNTFlZTQifQ.Sks-__qC2kOdHotErD_M3GATbRWqKyePODVQzETyq9k",
  "access_expires_at": "2026-10-30T12:27:03.467515861Z",
  "refresh_token": "878Ck4JoL1r7CdzskW4m_WoOzpESboy8rzcO9F9B0JE",
  "refresh_expires_at": "2026-11-29T12:12:03.466905488Z",
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
  "command_id": "42af7625-175f-4352-afd1-95e5e41ba614",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:12:04Z",
    "sequence": 1793362324614
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "99ed09a6-5c61-4990-a40b-754fba675b62",
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
  "last_heartbeat_at": "2026-10-30T12:12:04.079899Z",
  "last_location_at": "2026-10-30T12:12:04.079899Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9663bd37-c954-4426-9af3-19fa6aa19b55",
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
  "id": "d0ffc871-5e2c-43f8-8373-d358c25f5982",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:17:04.393521Z",
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
  "command_id": "967a9f84-784d-4da7-b2e9-8bc33b25495c",
  "quote_id": "d0ffc871-5e2c-43f8-8373-d358c25f5982",
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
  "id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e41301d0-2c47-4464-b081-10d7463dbe19",
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
  "created_at": "2026-10-30T12:12:04.71261Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5dccffb2-a82a-4124-900e-6c44bf5dcf24` → **200**

```json
{
  "id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e41301d0-2c47-4464-b081-10d7463dbe19",
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
  "created_at": "2026-10-30T12:12:04.71261Z",
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
    "id": "3572f298-efca-4795-9c6a-835a962114ce",
    "order_id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
    "expires_at": "2026-10-30T12:12:19.897373Z",
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

`POST /api/driver/v1/offers/3572f298-efca-4795-9c6a-835a962114ce/accept` → **200**

```json
{
  "command_id": "865e8cbd-a2f8-4cea-bb49-2e5a807782ca"
}
```

```json
{
  "id": "3166fbf0-f2fb-453e-8174-f6ef67a6c6ff",
  "order_id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cbdbd296-3a38-4056-884f-d07dec59c458",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cbdbd296-3a38-4056-884f-d07dec59c458",
  "order_id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
  "assignment_id": "3166fbf0-f2fb-453e-8174-f6ef67a6c6ff",
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

`POST /api/rider/v1/orders/5dccffb2-a82a-4124-900e-6c44bf5dcf24/messages` → **201**

```json
{
  "command_id": "421229fe-0937-4870-9975-0214ea3125fd",
  "body": "Я біля входу, мій номер +380735597813, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "992150f6-5eb1-4038-96e0-ce2fb0f174bd",
  "order_id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380735597813, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T12:12:06.180858752Z"
}
```

`POST /api/driver/v1/trips/cbdbd296-3a38-4056-884f-d07dec59c458/messages` → **201**

```json
{
  "command_id": "ad983685-21fd-4988-b0a9-01e53f7f55e0",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "39614494-d89d-4d5e-aa7f-54a6669daa8c",
  "order_id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T12:12:06.490601645Z"
}
```

(the car drives 7 s to the next point)

`POST /api/driver/v1/work-sessions/99ed09a6-5c61-4990-a40b-754fba675b62/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:12:13Z",
    "sequence": 1793362333804
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "99ed09a6-5c61-4990-a40b-754fba675b62",
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
  "last_heartbeat_at": "2026-10-30T12:12:13.822789Z",
  "last_location_at": "2026-10-30T12:12:13.822789Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/cbdbd296-3a38-4056-884f-d07dec59c458/arrive` → **200**

```json
{
  "command_id": "a57e9acf-a2a5-4c51-b281-388341d9caaa",
  "expected_version": 0
}
```

```json
{
  "id": "cbdbd296-3a38-4056-884f-d07dec59c458",
  "order_id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
  "assignment_id": "3166fbf0-f2fb-453e-8174-f6ef67a6c6ff",
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
  "arrived_at": "2026-10-30T12:12:14.11573Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cbdbd296-3a38-4056-884f-d07dec59c458/start` → **200**

```json
{
  "command_id": "1792f397-b807-452b-bf6d-23c80dbb8702",
  "expected_version": 1
}
```

```json
{
  "id": "cbdbd296-3a38-4056-884f-d07dec59c458",
  "order_id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
  "assignment_id": "3166fbf0-f2fb-453e-8174-f6ef67a6c6ff",
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
  "arrived_at": "2026-10-30T12:12:14.11573Z",
  "started_at": "2026-10-30T12:12:14.419145Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/99ed09a6-5c61-4990-a40b-754fba675b62/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:13:44Z",
    "sequence": 1793362424731
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "99ed09a6-5c61-4990-a40b-754fba675b62",
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
  "last_heartbeat_at": "2026-10-30T12:13:44.750034Z",
  "last_location_at": "2026-10-30T12:13:44.750034Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/cbdbd296-3a38-4056-884f-d07dec59c458/complete` → **200**

```json
{
  "command_id": "11040251-30bf-4eee-8c60-0fa275f5303c",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:13:45Z",
  "cash_received": false
}
```

```json
{
  "id": "cbdbd296-3a38-4056-884f-d07dec59c458",
  "order_id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
  "assignment_id": "3166fbf0-f2fb-453e-8174-f6ef67a6c6ff",
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
  "arrived_at": "2026-10-30T12:12:14.11573Z",
  "started_at": "2026-10-30T12:12:14.419145Z",
  "completed_at": "2026-10-30T12:13:45.053681Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/5dccffb2-a82a-4124-900e-6c44bf5dcf24` → **200**

```json
{
  "id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "e41301d0-2c47-4464-b081-10d7463dbe19",
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
    "id": "3166fbf0-f2fb-453e-8174-f6ef67a6c6ff",
    "order_id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cbdbd296-3a38-4056-884f-d07dec59c458",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:12:04.71261Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5dccffb2-a82a-4124-900e-6c44bf5dcf24` → **200**

```json
{
  "id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "e41301d0-2c47-4464-b081-10d7463dbe19",
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
    "id": "3166fbf0-f2fb-453e-8174-f6ef67a6c6ff",
    "order_id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cbdbd296-3a38-4056-884f-d07dec59c458",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:12:04.71261Z",
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
  "session_id": "99ed09a6-5c61-4990-a40b-754fba675b62",
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
  "last_heartbeat_at": "2026-10-30T12:13:44.750034Z",
  "last_location_at": "2026-10-30T12:13:44.750034Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/99ed09a6-5c61-4990-a40b-754fba675b62/close` → **200**

```json
{
  "command_id": "4a281748-7d20-44e2-872b-8095c3498f72",
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
  "session_id": "c92b634a-8641-4e60-943f-b6f8affce62c",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMzMjcsImlhdCI6MTc5MzM2MjQyNywianRpIjoiYmY1MzZjZGUtZGMwYi00ZDZmLWE2YWEtMjRiOWVmNmVjNGEwIiwic2lkIjoiYzkyYjYzNGEtODY0MS00ZTYwLTk0M2YtYjZmOGFmZmNlNjJjIn0._C6iy_uM2TUAEjEek2QD-fCYxFqHZ2CByWaar7o4q_A",
  "access_expires_at": "2026-10-30T12:28:47.930232549Z",
  "refresh_token": "fKW9c5z3vzzMdyc8qIKBlW2UHDQkefM0velzEEhEIlg",
  "refresh_expires_at": "2026-10-31T00:13:47.929600946Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/5dccffb2-a82a-4124-900e-6c44bf5dcf24/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/5dccffb2-a82a-4124-900e-6c44bf5dcf24/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "0983b8f0-a8c9-4f15-b339-e779f901650f"
}
```

`GET /api/admin/v1/orders/5dccffb2-a82a-4124-900e-6c44bf5dcf24/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T12:13:48.499167898Z",
  "order": {
    "id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
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
    "created_at": "2026-10-30T12:12:04.71261Z",
    "assigned_at": "2026-10-30T12:12:05.602189Z",
    "arrived_at": "2026-10-30T12:12:14.11573Z",
    "started_at": "2026-10-30T12:12:14.419145Z",
    "completed_at": "2026-10-30T12:13:45.053681Z"
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
    "id": "e41301d0-2c47-4464-b081-10d7463dbe19",
    "registered_at": "2026-10-30T12:12:02.234994Z",
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
      "created_at": "2026-10-30T12:12:04.714794Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T12:13:45.082239Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/5dccffb2-a82a-4124-900e-6c44bf5dcf24/chargebacks` → **422**

```json
{
  "command_id": "d8b6ff77-111c-4c28-be0e-c77d706a9d62",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/5dccffb2-a82a-4124-900e-6c44bf5dcf24/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "a76a060a-2e7e-4b15-b807-272ec69a27c2"
}
```

`POST /api/admin/v1/orders/5dccffb2-a82a-4124-900e-6c44bf5dcf24/chargebacks` → **201**

```json
{
  "command_id": "34273bfd-34d0-4273-a29f-d8e2882926f5",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "76321df6-c45b-4f50-a564-a0fbef32bcf7",
  "order_id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T12:13:49.187626Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/5dccffb2-a82a-4124-900e-6c44bf5dcf24/chargebacks` → **201**

```json
{
  "command_id": "34273bfd-34d0-4273-a29f-d8e2882926f5",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "76321df6-c45b-4f50-a564-a0fbef32bcf7",
  "order_id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T12:13:49.187626Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/e41301d0-2c47-4464-b081-10d7463dbe19` → **200**

```json
{
  "client": {
    "id": "e41301d0-2c47-4464-b081-10d7463dbe19",
    "phone": "+380735597813",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:12:02.234994Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T12:12:04.71261Z",
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

`GET /api/admin/v1/clients/e41301d0-2c47-4464-b081-10d7463dbe19` → **200**

```json
{
  "client": {
    "id": "e41301d0-2c47-4464-b081-10d7463dbe19",
    "phone": "+380735597813",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:12:02.234994Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T12:12:04.71261Z",
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

`POST /api/admin/v1/orders/5dccffb2-a82a-4124-900e-6c44bf5dcf24/chargebacks/76321df6-c45b-4f50-a564-a0fbef32bcf7/resolve` → **200**

```json
{
  "command_id": "12ed7f9a-af94-4f36-942c-cf7bc0ccd21e",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "76321df6-c45b-4f50-a564-a0fbef32bcf7",
  "order_id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T12:13:49.187626Z",
  "resolved_at": "2026-10-30T12:13:51.477601Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/e41301d0-2c47-4464-b081-10d7463dbe19` → **200**

```json
{
  "client": {
    "id": "e41301d0-2c47-4464-b081-10d7463dbe19",
    "phone": "+380735597813",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:12:02.234994Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T12:12:04.71261Z",
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

`GET /api/admin/v1/clients/e41301d0-2c47-4464-b081-10d7463dbe19` → **200**

```json
{
  "client": {
    "id": "e41301d0-2c47-4464-b081-10d7463dbe19",
    "phone": "+380735597813",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:12:02.234994Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T12:12:04.71261Z",
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

`POST /api/admin/v1/orders/5dccffb2-a82a-4124-900e-6c44bf5dcf24/chargebacks/76321df6-c45b-4f50-a564-a0fbef32bcf7/resolve` → **409**

```json
{
  "command_id": "dc826e6c-d1f3-4bf2-bdbf-a9b9ef1cf593",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/5dccffb2-a82a-4124-900e-6c44bf5dcf24/chargebacks/76321df6-c45b-4f50-a564-a0fbef32bcf7/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4236e474-13d5-4472-ad7b-797551f5f81c"
}
```

`GET /api/admin/v1/orders/5dccffb2-a82a-4124-900e-6c44bf5dcf24/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "76321df6-c45b-4f50-a564-a0fbef32bcf7",
      "order_id": "5dccffb2-a82a-4124-900e-6c44bf5dcf24",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T12:13:49.187626Z",
      "resolved_at": "2026-10-30T12:13:51.477601Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 5dccffb2-a82a-4124-900e-6c44bf5dcf24 without phone or card digits; chargeback 76321df6-c45b-4f50-a564-a0fbef32bcf7 recorded and won.

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
  "session_id": "76cd735c-e743-4c7e-81d2-799b5eaf2fa2",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMzMzQsImlhdCI6MTc5MzM2MjQzNCwianRpIjoiMzQ2NTlkYjctYTExNi00ZmRhLWE5YjMtNmQzZTU5ZDlkMDQ4Iiwic2lkIjoiNzZjZDczNWMtZTc0My00YzdlLTgxZDItNzk5YjVlYWYyZmEyIn0.EmwZ4gUfeaPxnjDctab8XbAbSeW8HK6pdO3KqeLm9mg",
  "access_expires_at": "2026-10-30T12:28:54.633167358Z",
  "refresh_token": "bIXHwDcg98YexXtbHm196-uW5pxzPJq8C6I_2bPHqmA",
  "refresh_expires_at": "2026-10-31T00:13:54.632589346Z",
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
  "phone": "+48600430887",
  "device_ref": "sandbox-22727"
}
```

```json
{
  "challenge_id": "d5a8c513-834a-4c1a-9462-582cf7f600ce",
  "expires_at": "2026-10-30T12:18:55.516748276Z",
  "resend_available_at": "2026-10-30T12:13:56.516748276Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600430887` → **200**

```json
{
  "phone": "+48600430887",
  "audience": "CLIENT",
  "code": "122114",
  "sent_at": "2026-10-30T12:13:55.520100476Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d5a8c513-834a-4c1a-9462-582cf7f600ce",
  "code": "122114",
  "device_ref": "sandbox-22727"
}
```

```json
{
  "session_id": "19b517ec-f851-431a-b500-3ffc3c40b8c1",
  "subject": {
    "type": "CLIENT",
    "id": "37acc5af-25dd-4e77-a8e8-4f29bf07ce7b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzN2FjYzVhZi0yNWRkLTRlNzctYThlOC00ZjI5YmYwN2NlN2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMzM1LCJpYXQiOjE3OTMzNjI0MzUsImp0aSI6IjZhZmViYzYyLTczNzItNDZkNC1iNTI4LTk0OTExNzI3YmE0NyIsInNpZCI6IjE5YjUxN2VjLWY4NTEtNDMxYS1iNTAwLTNmZmMzYzQwYjhjMSJ9.xQAO0wjNd09FwJBq6bVfgOGSG0k1X_tCW6NJ9Fhbmas",
  "access_expires_at": "2026-10-30T12:28:55.824987594Z",
  "refresh_token": "EtjsiAi2q0kkEalbsLMsjzsCyQSwwG5H4-ioqKvyYCo",
  "refresh_expires_at": "2026-11-29T12:13:55.824437666Z",
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
  "command_id": "d7308cf4-8646-4911-affb-b4f7568d724c",
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
  "correlation_id": "fa80de4e-d212-4b80-adb2-267bca3f403c",
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
  "command_id": "d8bbe29e-6d06-49c4-9639-bc308f52b9c4",
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
  "paused_at": "2026-10-30T12:13:56.969956336Z",
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
  "command_id": "47cb8e4c-6ebb-4e09-b14e-47e7ae11c5ed",
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
  "id": "e2d48fbf-546d-4da1-8d6b-9d962efd61b8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:18:57.613533Z",
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
  "command_id": "c3b2954b-7e96-498b-9e2b-2bcf990aa234",
  "quote_id": "e2d48fbf-546d-4da1-8d6b-9d962efd61b8",
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
  "correlation_id": "17f098e1-d61d-43c8-806f-79bfe07994f8"
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
  "paused_at": "2026-10-30T12:13:56.969956Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "a156f58a-2397-41b1-9aea-490e450a5d10",
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
  "command_id": "05a02f42-6384-45e3-bcfe-c55acc1cca25",
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
  "command_id": "da24911e-f854-4fac-9417-ddc4c1183126",
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
  "id": "16eab0c9-192f-46e7-bdc7-380c911dd5f5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:18:59.489135Z",
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
  "command_id": "17c2b494-b1f3-44d0-b3cd-90140f88f9d5",
  "quote_id": "16eab0c9-192f-46e7-bdc7-380c911dd5f5",
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
  "correlation_id": "a03742dd-bb3a-4e4a-b051-c64d407a9fc0"
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
  "command_id": "a6277aef-9cf6-4e1e-8121-e781b7bea154",
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
      "from": "15:00",
      "to": "16:00"
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
      "from": "15:00",
      "to": "16:00"
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
  "command_id": "7102f13f-5661-4058-a7b9-4029f7857fed",
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
  "id": "4c83e9b4-c590-4716-8eb3-72a9fd8303dd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:19:00.698032Z",
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
  "command_id": "61228cd8-27ae-49b4-9d15-5fd5f1a8545a",
  "quote_id": "4c83e9b4-c590-4716-8eb3-72a9fd8303dd",
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
  "correlation_id": "48809621-b6b6-4c84-93bc-6be2348a0956"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "81e40da8-107a-45d0-bf6d-783e001677cb",
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
  "correlation_id": "b27fc8f3-02d9-4c29-b934-df90bff509fc"
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
      "from": "15:00",
      "to": "16:00"
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
  "command_id": "c3e0f8e1-9030-4961-aa71-c00e8384539d",
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
  "phone": "+380676748079",
  "device_ref": "sandbox-14346"
}
```

```json
{
  "challenge_id": "80d5df5a-7033-4652-a337-11bd24b8b468",
  "expires_at": "2026-10-30T12:19:02.20677057Z",
  "resend_available_at": "2026-10-30T12:14:03.20677057Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676748079` → **200**

```json
{
  "phone": "+380676748079",
  "audience": "CLIENT",
  "code": "306350",
  "sent_at": "2026-10-30T12:14:02.209941547Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80d5df5a-7033-4652-a337-11bd24b8b468",
  "code": "306350",
  "device_ref": "sandbox-14346"
}
```

```json
{
  "session_id": "fd946d2f-46f4-4e5e-9056-d1ba0402212e",
  "subject": {
    "type": "CLIENT",
    "id": "2ef0d43e-0721-40b7-b296-51bf4c216f3a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZWYwZDQzZS0wNzIxLTQwYjctYjI5Ni01MWJmNGMyMTZmM2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMzQyLCJpYXQiOjE3OTMzNjI0NDIsImp0aSI6ImZkYTM4OGFlLWE0YWQtNGZiMS1iNjU1LTA3NzIwNzUwOWFmMiIsInNpZCI6ImZkOTQ2ZDJmLTQ2ZjQtNGU1ZS05MDU2LWQxYmEwNDAyMjEyZSJ9.WC76ubA6yJ6C3KHJo3XiTIHzueS3GbTNgZQ2BsPv_yo",
  "access_expires_at": "2026-10-30T12:29:02.52550445Z",
  "refresh_token": "uMIH9v-a5408u6dxs9aLlIlVB_ZK4uiDBnWgOJzHHXc",
  "refresh_expires_at": "2026-11-29T12:14:02.524971063Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "2ef0d43e-0721-40b7-b296-51bf4c216f3a",
  "session_id": "fd946d2f-46f4-4e5e-9056-d1ba0402212e",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9719da65-8612-4a53-aea2-3fd81f659337",
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
  "id": "71cd7ac5-f178-4f56-b626-a799780bcc4b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:19:03.117872Z",
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
  "challenge_id": "0d9905f6-eb78-4d02-acb6-16db0f964c31",
  "expires_at": "2026-10-30T12:19:05.419866127Z",
  "resend_available_at": "2026-10-30T12:14:06.419866127Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676748079` → **200**

```json
{
  "phone": "+380676748079",
  "audience": "CLIENT",
  "code": "200866",
  "sent_at": "2026-10-30T12:14:05.422496457Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "ddc56f50-4a31-4fb1-9a38-acc1b0eedd3c",
  "challenge_id": "0d9905f6-eb78-4d02-acb6-16db0f964c31",
  "otp_code": "200866"
}
```

```json
{
  "client_id": "2ef0d43e-0721-40b7-b296-51bf4c216f3a",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T12:14:05.74984344Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "88624e83-3cab-49ed-a9fc-1049e4e23efa",
  "quote_id": "71cd7ac5-f178-4f56-b626-a799780bcc4b",
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
  "correlation_id": "09ff8c72-31fa-465c-8fef-dee457683881"
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
  "session_id": "32be0744-16e0-4c31-91e3-80dab54cd298",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMzNDYsImlhdCI6MTc5MzM2MjQ0NiwianRpIjoiZWUzY2ZmNjAtOWJlOS00ZTc2LWEyMzMtZDk2MDJiZDJhMzNiIiwic2lkIjoiMzJiZTA3NDQtMTZlMC00YzMxLTkxZTMtODBkYWI1NGNkMjk4In0.8locwYCtnAVl5mIXKoTZy0VzSh_2IA9m6HYALDo2S4w",
  "access_expires_at": "2026-10-30T12:29:06.630956904Z",
  "refresh_token": "yWix4scAi7Unvj7N5M716jOdH_BDpZXXeEK1o-pPY28",
  "refresh_expires_at": "2026-10-31T00:14:06.630397868Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "2ef0d43e-0721-40b7-b296-51bf4c216f3a",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T12:14:05.749843Z",
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

`POST /api/admin/v1/client-deletions/2ef0d43e-0721-40b7-b296-51bf4c216f3a/complete` → **200**

```json
{
  "command_id": "010d1ade-a097-403a-8503-98bcd2103a0a",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "2ef0d43e-0721-40b7-b296-51bf4c216f3a",
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
  "correlation_id": "e4173d21-add5-472c-84a1-4a218e679dd9"
}
```

Done: client 2ef0d43e-0721-40b7-b296-51bf4c216f3a anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663274096",
  "device_ref": "sandbox-24239"
}
```

```json
{
  "challenge_id": "b84eb211-412d-4865-9126-766c8a5ea9fe",
  "expires_at": "2026-10-30T12:19:07.823017996Z",
  "resend_available_at": "2026-10-30T12:14:08.823017996Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663274096` → **200**

```json
{
  "phone": "+380663274096",
  "audience": "CLIENT",
  "code": "914488",
  "sent_at": "2026-10-30T12:14:07.825854192Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b84eb211-412d-4865-9126-766c8a5ea9fe",
  "code": "914488",
  "device_ref": "sandbox-24239"
}
```

```json
{
  "session_id": "f8e4c6bc-8625-406c-a71f-3469c6a6cd88",
  "subject": {
    "type": "CLIENT",
    "id": "fb2b0d3e-40d3-4886-b443-6bae00e8b14f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjJiMGQzZS00MGQzLTQ4ODYtYjQ0My02YmFlMDBlOGIxNGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMzQ4LCJpYXQiOjE3OTMzNjI0NDgsImp0aSI6IjVlMTk1N2QyLWFlNDEtNGQ0YS1iZmFjLWZiN2JjMWZiYWVjZSIsInNpZCI6ImY4ZTRjNmJjLTg2MjUtNDA2Yy1hNzFmLTM0NjljNmE2Y2Q4OCJ9.gHzv8E6IpwJjzcGwZhYoKcmRVDFiR2wEgdpilY1W9Og",
  "access_expires_at": "2026-10-30T12:29:08.144528139Z",
  "refresh_token": "XzsR0tfYnVIbb6f5NNGbXH-_etz3Y6i_wLBkrlwVbNs",
  "refresh_expires_at": "2026-11-29T12:14:08.143973304Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fb2b0d3e-40d3-4886-b443-6bae00e8b14f",
  "session_id": "f8e4c6bc-8625-406c-a71f-3469c6a6cd88",
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
  "session_id": "e454800e-5170-436c-9018-921414fc478f",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMzNDksImlhdCI6MTc5MzM2MjQ0OSwianRpIjoiZTdmMDZlMGItZjNjZi00NjY3LTk3NjctNmZlM2QzM2ViNTZmIiwic2lkIjoiZTQ1NDgwMGUtNTE3MC00MzZjLTkwMTgtOTIxNDE0ZmM0NzhmIn0.ZJg44f_H_o03taKFzoY0exIOkcJhLCu-RQV-3qWHYWo",
  "access_expires_at": "2026-10-30T12:29:09.032530688Z",
  "refresh_token": "ppYfU80t1CH4OAt9TLarb94bU3YcaW1FbrBSb0YCDPs",
  "refresh_expires_at": "2026-10-31T00:14:09.031940073Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=3274096&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "fb2b0d3e-40d3-4886-b443-6bae00e8b14f",
      "phone": "+380663274096",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T12:14:08.142453Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/fb2b0d3e-40d3-4886-b443-6bae00e8b14f` → **200**

```json
{
  "client": {
    "id": "fb2b0d3e-40d3-4886-b443-6bae00e8b14f",
    "phone": "+380663274096",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:14:08.142453Z",
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

`POST /api/admin/v1/clients/fb2b0d3e-40d3-4886-b443-6bae00e8b14f/block` → **400**

```json
{
  "command_id": "ddee4174-47b5-4ca8-8a39-d429ed1407aa",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/fb2b0d3e-40d3-4886-b443-6bae00e8b14f/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "36d780db-7010-4d53-aeea-46895356115e",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/fb2b0d3e-40d3-4886-b443-6bae00e8b14f/block` → **200**

```json
{
  "command_id": "d2608e6a-f905-4f25-9fcd-5347d4212bdf",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "fb2b0d3e-40d3-4886-b443-6bae00e8b14f",
  "phone": "+380663274096",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T12:14:08.142453Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T12:14:10.284804Z",
    "by": "c2b31b2b-8610-441e-a39e-de6e6485310e"
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
  "correlation_id": "707bc605-9ce4-432c-a055-ef9a665a83fe"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663274096",
  "device_ref": "sandbox-13258"
}
```

```json
{
  "challenge_id": "2c8bdc75-baba-4c39-9c44-e07e59eeb34e",
  "expires_at": "2026-10-30T12:19:12.891537043Z",
  "resend_available_at": "2026-10-30T12:14:13.891537043Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663274096` → **200**

```json
{
  "phone": "+380663274096",
  "audience": "CLIENT",
  "code": "401073",
  "sent_at": "2026-10-30T12:14:12.894246022Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "2c8bdc75-baba-4c39-9c44-e07e59eeb34e",
  "code": "401073",
  "device_ref": "sandbox-13258"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "3f088f49-f9d6-44b4-9b83-ac13d6d899dd"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/fb2b0d3e-40d3-4886-b443-6bae00e8b14f` → **200**

```json
{
  "client": {
    "id": "fb2b0d3e-40d3-4886-b443-6bae00e8b14f",
    "phone": "+380663274096",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T12:14:08.142453Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T12:14:10.284804Z",
      "by": "c2b31b2b-8610-441e-a39e-de6e6485310e"
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

`POST /api/admin/v1/clients/fb2b0d3e-40d3-4886-b443-6bae00e8b14f/unblock` → **200**

```json
{
  "command_id": "bceb5f5e-7f2d-498a-bf2b-a2fd652ccd0b",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "fb2b0d3e-40d3-4886-b443-6bae00e8b14f",
  "phone": "+380663274096",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T12:14:08.142453Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663274096",
  "device_ref": "sandbox-932"
}
```

```json
{
  "challenge_id": "6e0ee6e3-a561-4260-ad18-9ba140f32c1f",
  "expires_at": "2026-10-30T12:19:16.162260637Z",
  "resend_available_at": "2026-10-30T12:14:17.162260637Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663274096` → **200**

```json
{
  "phone": "+380663274096",
  "audience": "CLIENT",
  "code": "386433",
  "sent_at": "2026-10-30T12:14:16.165709642Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e0ee6e3-a561-4260-ad18-9ba140f32c1f",
  "code": "386433",
  "device_ref": "sandbox-932"
}
```

```json
{
  "session_id": "2c4f12ee-c042-4927-af53-6d4dd54b9f75",
  "subject": {
    "type": "CLIENT",
    "id": "fb2b0d3e-40d3-4886-b443-6bae00e8b14f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjJiMGQzZS00MGQzLTQ4ODYtYjQ0My02YmFlMDBlOGIxNGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMzU2LCJpYXQiOjE3OTMzNjI0NTYsImp0aSI6IjkwZTBhZWQzLTgyOGMtNDUyZC05ZDEyLWMyMjk4NjMyZTc3MSIsInNpZCI6IjJjNGYxMmVlLWMwNDItNDkyNy1hZjUzLTZkNGRkNTRiOWY3NSJ9.hG2OVzzw84HuuhERg8cuFM7zvHGfxbbmNT9BzP35UK0",
  "access_expires_at": "2026-10-30T12:29:16.487074261Z",
  "refresh_token": "TjyxebMY8VtpdlIZ_1lV9yxH4qFRURpDYA3wUSmerck",
  "refresh_expires_at": "2026-11-29T12:14:16.486516068Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fb2b0d3e-40d3-4886-b443-6bae00e8b14f",
  "session_id": "2c4f12ee-c042-4927-af53-6d4dd54b9f75",
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
  "phone": "+380663134921",
  "device_ref": "sandbox-269"
}
```

```json
{
  "challenge_id": "22dc05d7-8063-4515-989a-3a4febdae888",
  "expires_at": "2026-10-30T12:19:17.085501658Z",
  "resend_available_at": "2026-10-30T12:14:18.085501658Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663134921` → **200**

```json
{
  "phone": "+380663134921",
  "audience": "CLIENT",
  "code": "089339",
  "sent_at": "2026-10-30T12:14:17.088068245Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "22dc05d7-8063-4515-989a-3a4febdae888",
  "code": "089339",
  "device_ref": "sandbox-269"
}
```

```json
{
  "session_id": "81e396a9-1a13-4bf6-b037-ea4735ebe5eb",
  "subject": {
    "type": "CLIENT",
    "id": "c97f8fc7-460c-4d99-a063-1648fb3e9c77"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOTdmOGZjNy00NjBjLTRkOTktYTA2My0xNjQ4ZmIzZTljNzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMzU3LCJpYXQiOjE3OTMzNjI0NTcsImp0aSI6ImMwYmQzZjU2LThhZjAtNDY5My05ODZjLWRiNDBmNGNkNTNjYyIsInNpZCI6IjgxZTM5NmE5LTFhMTMtNGJmNi1iMDM3LWVhNDczNWViZTVlYiJ9.VBYLL49WeJJ9cLNUPzfA99cTU8xI24lZ1HrXL6nkwrU",
  "access_expires_at": "2026-10-30T12:29:17.40999034Z",
  "refresh_token": "5mSTiGFpTFCacJWJW1KooJzpvYCqH7C0C-RioVHJUys",
  "refresh_expires_at": "2026-11-29T12:14:17.409452454Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e4b2fc18-4d8e-4e91-9320-cff5b955a801",
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
  "id": "b05bbf8e-ad31-4812-8d77-03fcf3f1e48d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:19:17.714247Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: edb436a3-f61c-46e1-97c1-c04a8003d85b) → **201**

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
  "session_id": "969a0ebd-9a90-4edb-8705-fa6ad6260547",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMzNTgsImlhdCI6MTc5MzM2MjQ1OCwianRpIjoiMWYzMmI3OGMtMmE4Yi00NGY3LTk4ZTEtZjZhYzk4NzhiMDRiIiwic2lkIjoiOTY5YTBlYmQtOWE5MC00ZWRiLTg3MDUtZmE2YWQ2MjYwNTQ3In0.5FuV8sBjNiFtXsgD6JvD3am7U8E8CVo5pVeGCJ1IY8w",
  "access_expires_at": "2026-10-30T12:29:18.349372178Z",
  "refresh_token": "GsHiN4nTfhCNoIGSqHaIv2c4Shmdo8jmmALYlwaphpw",
  "refresh_expires_at": "2026-10-31T00:14:18.348606503Z",
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
  "session_id": "9c563d3b-2d08-43f3-b15a-e38286c08696",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMzNTgsImlhdCI6MTc5MzM2MjQ1OCwianRpIjoiZTMxMWI2ZmMtMzk1Yi00Y2RmLTk4MjQtYmY0N2VhZDMzZmZmIiwic2lkIjoiOWM1NjNkM2ItMmQwOC00M2YzLWIxNWEtZTM4Mjg2YzA4Njk2In0.w7Clx_PoyAoZyQlRRfHQxiI1197rqTDPgnxIOMEN6Ts",
  "access_expires_at": "2026-10-30T12:29:18.936075595Z",
  "refresh_token": "Qzo8rFfePdUpz-tUpwhsqvIlR5BnnpE4-rluZ9b-2mY",
  "refresh_expires_at": "2026-10-31T00:14:18.935466065Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/303b29ce-e549-41e9-a94a-24d92b421c57/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T12:14:18.020007Z",
      "actor": {
        "type": "CLIENT",
        "id": "c97f8fc7-460c-4d99-a063-1648fb3e9c77",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "303b29ce-e549-41e9-a94a-24d92b421c57",
        "quote_id": "b05bbf8e-ad31-4812-8d77-03fcf3f1e48d",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "edb436a3-f61c-46e1-97c1-c04a8003d85b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T12:14:18.021898Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "303b29ce-e549-41e9-a94a-24d92b421c57",
        "attempt_id": "316ac1f4-ce31-459e-9a4a-6111647053ba",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "edb436a3-f61c-46e1-97c1-c04a8003d85b"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T12:14:18.028919Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "303b29ce-e549-41e9-a94a-24d92b421c57",
        "attempt_id": "316ac1f4-ce31-459e-9a4a-6111647053ba"
      },
      "correlation_id": "edb436a3-f61c-46e1-97c1-c04a8003d85b"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "316ac1f4-ce31-459e-9a4a-6111647053ba",
        "generation": 1,
        "started_at": "2026-10-30T12:14:18.020985Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T12:14:18.028919Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T12:14:18.022546Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/edb436a3-f61c-46e1-97c1-c04a8003d85b` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "303b29ce-e549-41e9-a94a-24d92b421c57:0",
      "order_id": "303b29ce-e549-41e9-a94a-24d92b421c57",
      "at": "2026-10-30T12:14:18.020007Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "303b29ce-e549-41e9-a94a-24d92b421c57:1",
      "order_id": "303b29ce-e549-41e9-a94a-24d92b421c57",
      "at": "2026-10-30T12:14:18.021898Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "303b29ce-e549-41e9-a94a-24d92b421c57:2",
      "order_id": "303b29ce-e549-41e9-a94a-24d92b421c57",
      "at": "2026-10-30T12:14:18.028919Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/1c4b75da-c24a-4b53-bcc2-5faa934c3770` → **200**

```json
{
  "found": []
}
```

Done: request edb436a3-f61c-46e1-97c1-c04a8003d85b — order 303b29ce-e549-41e9-a94a-24d92b421c57 found by its id.

`GET /api/rider/v1/orders/303b29ce-e549-41e9-a94a-24d92b421c57` → **200**

```json
{
  "id": "303b29ce-e549-41e9-a94a-24d92b421c57",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c97f8fc7-460c-4d99-a063-1648fb3e9c77",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:14:18.019438Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/303b29ce-e549-41e9-a94a-24d92b421c57/cancel` → **200**

```json
{
  "command_id": "51d9331d-e5d4-4cb0-a52f-216384355c1d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "303b29ce-e549-41e9-a94a-24d92b421c57",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c97f8fc7-460c-4d99-a063-1648fb3e9c77",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:14:18.019438Z",
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
  "phone": "+380639677395",
  "device_ref": "sandbox-12918"
}
```

```json
{
  "challenge_id": "c7c4af6c-a58e-4ac5-913d-6b29ca422833",
  "expires_at": "2026-10-30T12:19:20.763807025Z",
  "resend_available_at": "2026-10-30T12:14:21.763807025Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639677395` → **200**

```json
{
  "phone": "+380639677395",
  "audience": "CLIENT",
  "code": "844215",
  "sent_at": "2026-10-30T12:14:20.766506176Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c7c4af6c-a58e-4ac5-913d-6b29ca422833",
  "code": "844215",
  "device_ref": "sandbox-12918"
}
```

```json
{
  "session_id": "e92acf08-4027-4dfb-92ef-dd714545046b",
  "subject": {
    "type": "CLIENT",
    "id": "84ff7074-e509-4a3d-83ee-d5c5e17ee559"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NGZmNzA3NC1lNTA5LTRhM2QtODNlZS1kNWM1ZTE3ZWU1NTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMzYxLCJpYXQiOjE3OTMzNjI0NjEsImp0aSI6Ijg5NGEzNzRjLTJlOTUtNGZhZi1hODE4LWU4ZTc0MmEzOWVjNyIsInNpZCI6ImU5MmFjZjA4LTQwMjctNGRmYi05MmVmLWRkNzE0NTQ1MDQ2YiJ9.K69UL3BfEEOxJ5xVs5ruJOAdDV0FihgEOn66lxb5iZM",
  "access_expires_at": "2026-10-30T12:29:21.086087595Z",
  "refresh_token": "OGtqQ8tFXMsOr3AyLkTuUsw9lztcf7mMBWz3jBbLlaA",
  "refresh_expires_at": "2026-11-29T12:14:21.08555546Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "f4f6b357-4913-4094-9437-c693b6706ea5",
  "expires_at": "2026-10-30T12:19:23.388037953Z",
  "resend_available_at": "2026-10-30T12:14:24.388037953Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639677395` → **200**

```json
{
  "phone": "+380639677395",
  "audience": "CLIENT",
  "code": "078322",
  "sent_at": "2026-10-30T12:14:23.392810254Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "c74e1234-f15e-41a5-8580-f177dc536d0a",
  "challenge_id": "f4f6b357-4913-4094-9437-c693b6706ea5",
  "otp_code": "078322"
}
```

```json
{
  "id": "350c32d7-dfa2-4520-9a12-e85a6deb3275",
  "state": "PENDING",
  "created_at": "2026-10-30T12:14:23.715475Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/350c32d7-dfa2-4520-9a12-e85a6deb3275` → **200**

```json
{
  "id": "350c32d7-dfa2-4520-9a12-e85a6deb3275",
  "state": "PENDING",
  "created_at": "2026-10-30T12:14:23.715475Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/350c32d7-dfa2-4520-9a12-e85a6deb3275` → **200**

```json
{
  "id": "350c32d7-dfa2-4520-9a12-e85a6deb3275",
  "state": "PENDING",
  "created_at": "2026-10-30T12:14:23.715475Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/350c32d7-dfa2-4520-9a12-e85a6deb3275` → **200**

```json
{
  "id": "350c32d7-dfa2-4520-9a12-e85a6deb3275",
  "state": "PENDING",
  "created_at": "2026-10-30T12:14:23.715475Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/350c32d7-dfa2-4520-9a12-e85a6deb3275` → **200**

```json
{
  "id": "350c32d7-dfa2-4520-9a12-e85a6deb3275",
  "state": "PENDING",
  "created_at": "2026-10-30T12:14:23.715475Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/350c32d7-dfa2-4520-9a12-e85a6deb3275` → **200**

```json
{
  "id": "350c32d7-dfa2-4520-9a12-e85a6deb3275",
  "state": "READY",
  "created_at": "2026-10-30T12:14:23.715475Z",
  "ready_at": "2026-10-30T12:14:28.657685Z",
  "expires_at": "2026-11-06T12:14:28.657685Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/350c32d7-dfa2-4520-9a12-e85a6deb3275/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639632325",
  "device_ref": "sandbox-17008"
}
```

```json
{
  "challenge_id": "faacda58-0c2b-4393-8b20-cc545ce670ca",
  "expires_at": "2026-10-30T12:19:29.482015167Z",
  "resend_available_at": "2026-10-30T12:14:30.482015167Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639632325` → **200**

```json
{
  "phone": "+380639632325",
  "audience": "CLIENT",
  "code": "869972",
  "sent_at": "2026-10-30T12:14:29.484805306Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "faacda58-0c2b-4393-8b20-cc545ce670ca",
  "code": "869972",
  "device_ref": "sandbox-17008"
}
```

```json
{
  "session_id": "498a234f-eb05-4c9b-88fd-d730b4c79bb8",
  "subject": {
    "type": "CLIENT",
    "id": "841e05d6-18ef-499f-88ed-f743a5f41698"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDFlMDVkNi0xOGVmLTQ5OWYtODhlZC1mNzQzYTVmNDE2OTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMzY5LCJpYXQiOjE3OTMzNjI0NjksImp0aSI6ImQwYjlkMWZiLWY4NjQtNGQ0Ni1hNzkyLWY4ZTdmYTZlZDM4MyIsInNpZCI6IjQ5OGEyMzRmLWViMDUtNGM5Yi04OGZkLWQ3MzBiNGM3OWJiOCJ9.MyKM9WoydniZzXNz3RiRdgYwnu648iuJXhIUtWEr1JM",
  "access_expires_at": "2026-10-30T12:29:29.796860715Z",
  "refresh_token": "J7ctCXQam99bPLYWjQIqpGCf--eJgYArj8jQ6FK7F7k",
  "refresh_expires_at": "2026-11-29T12:14:29.796286491Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/350c32d7-dfa2-4520-9a12-e85a6deb3275/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/350c32d7-dfa2-4520-9a12-e85a6deb3275/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2840cb65-ea9b-49ec-a1c3-ffd165e787fe"
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
  "session_id": "5d335490-294e-4592-ab0c-5b9369485b2d",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMzNzAsImlhdCI6MTc5MzM2MjQ3MCwianRpIjoiYjIzZTFlMTEtYzZmOC00NTYzLThjODEtNWVjMjBiNGQ5OTMwIiwic2lkIjoiNWQzMzU0OTAtMjk0ZS00NTkyLWFiMGMtNWI5MzY5NDg1YjJkIn0.hvv5nXbwdZj_6aTG18qPEVVFLjH8dbRvfhMVN_uEHBs",
  "access_expires_at": "2026-10-30T12:29:30.670221768Z",
  "refresh_token": "4RPPOEYp-VyoyiUwLA0Ql7_TFNRjU1uFtI_oghrQ--8",
  "refresh_expires_at": "2026-10-31T00:14:30.66969292Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "84ff7074-e509-4a3d-83ee-d5c5e17ee559",
  "session_id": "e92acf08-4027-4dfb-92ef-dd714545046b",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/84ff7074-e509-4a3d-83ee-d5c5e17ee559/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "350c32d7-dfa2-4520-9a12-e85a6deb3275",
      "state": "READY",
      "created_at": "2026-10-30T12:14:23.715475Z",
      "ready_at": "2026-10-30T12:14:28.657685Z",
      "expires_at": "2026-11-06T12:14:28.657685Z",
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
  "device_ref": "sandbox-4760"
}
```

```json
{
  "challenge_id": "9c4ee374-1685-4ca4-9ea6-fc3c829df8d7",
  "expires_at": "2026-10-30T12:19:31.547733998Z",
  "resend_available_at": "2026-10-30T12:14:32.547733998Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "483731",
  "sent_at": "2026-10-30T12:14:31.550392472Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c4ee374-1685-4ca4-9ea6-fc3c829df8d7",
  "code": "483731",
  "device_ref": "sandbox-4760"
}
```

```json
{
  "session_id": "f53503d4-2dc6-4c50-a5b3-cc63298d689e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzM3MSwiaWF0IjoxNzkzMzYyNDcxLCJqdGkiOiJmNGJlNTc5YS0wMWEwLTRiNGYtYmExNi1jOTViZTQ0OTRiYjgiLCJzaWQiOiJmNTM1MDNkNC0yZGM2LTRjNTAtYTViMy1jYzYzMjk4ZDY4OWUifQ.SVyd1IlBtWJnn1rUnBwEA16AuEpyJ77CJs7cLcOKSNI",
  "access_expires_at": "2026-10-30T12:29:31.86424741Z",
  "refresh_token": "xto7shi2mhHRaTy_2MHAR6F0ilH_mVaQ9puwrHnVXeA",
  "refresh_expires_at": "2026-11-29T12:14:31.863712861Z",
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
  "device_ref": "sandbox-30554"
}
```

```json
{
  "challenge_id": "633d6249-5afc-47f9-89af-ea4fde3d864c",
  "expires_at": "2026-10-30T12:19:32.433929577Z",
  "resend_available_at": "2026-10-30T12:14:33.433929577Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "333398",
  "sent_at": "2026-10-30T12:14:32.436788664Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "633d6249-5afc-47f9-89af-ea4fde3d864c",
  "code": "333398",
  "device_ref": "sandbox-30554"
}
```

```json
{
  "session_id": "4e478cf7-8e32-40ca-8139-86f0dbae8e41",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzM3MiwiaWF0IjoxNzkzMzYyNDcyLCJqdGkiOiJiMWI5MDc2MS0xYjJkLTRmYWMtODBkYi02YWRlNDA0M2YxNmIiLCJzaWQiOiI0ZTQ3OGNmNy04ZTMyLTQwY2EtODEzOS04NmYwZGJhZThlNDEifQ.I-2pbxS9b5UTcouvpZg1yA1dqqCy5vprbqVDZ6IPXT0",
  "access_expires_at": "2026-10-30T12:29:32.755641515Z",
  "refresh_token": "ULmvnJZ65Aq0Rje3kQ0Cm4qr6xVYvIwe9bhJIBNrrBs",
  "refresh_expires_at": "2026-11-29T12:14:32.755026343Z",
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
  "command_id": "1f2bb455-b449-4377-818d-acb637d49329",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:14:33Z",
    "sequence": 1793362473347
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5645f158-75eb-42dd-9150-f983d094dfb9",
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
  "last_heartbeat_at": "2026-10-30T12:14:33.366744Z",
  "last_location_at": "2026-10-30T12:14:33.366744Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-26413"
}
```

```json
{
  "challenge_id": "52e68668-07f7-4baa-b14c-01bb86ca00f0",
  "expires_at": "2026-10-30T12:19:33.666538893Z",
  "resend_available_at": "2026-10-30T12:14:34.666538893Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "987220",
  "sent_at": "2026-10-30T12:14:33.669360741Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "52e68668-07f7-4baa-b14c-01bb86ca00f0",
  "code": "987220",
  "device_ref": "sandbox-26413"
}
```

```json
{
  "session_id": "0a2e5d9a-4dc2-4f37-9848-f2ba07db1594",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzM3MywiaWF0IjoxNzkzMzYyNDczLCJqdGkiOiI5YTU4YzU3YS0zNzhhLTQwNDQtYjY4YS00MjU3YjU2MGE3ZGUiLCJzaWQiOiIwYTJlNWQ5YS00ZGMyLTRmMzctOTg0OC1mMmJhMDdkYjE1OTQifQ.acW2IjVFZQSu9Ugc0OrdjCUa4ehcE2mhjxrb37ZPZO0",
  "access_expires_at": "2026-10-30T12:29:33.992858063Z",
  "refresh_token": "o7mHiGXcVhHB-9RO-Uu4CGHgZliI6xK393beV_IhQDI",
  "refresh_expires_at": "2026-11-29T12:14:33.992283234Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a529b37e-a035-4eab-b274-d090fa915c53",
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
  "last_heartbeat_at": "2026-10-30T12:10:34.1788Z",
  "last_location_at": "2026-10-30T12:10:34.1788Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a529b37e-a035-4eab-b274-d090fa915c53/handover` → **200**

```json
{
  "command_id": "3d0e9ba1-958b-42de-95d6-17e91bb5fe7d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a529b37e-a035-4eab-b274-d090fa915c53",
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
  "last_heartbeat_at": "2026-10-30T12:10:34.1788Z",
  "last_location_at": "2026-10-30T12:10:34.1788Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a529b37e-a035-4eab-b274-d090fa915c53/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:14:34Z",
    "sequence": 1793362474889
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a529b37e-a035-4eab-b274-d090fa915c53",
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
  "last_heartbeat_at": "2026-10-30T12:14:34.908578Z",
  "last_location_at": "2026-10-30T12:14:34.908578Z",
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
  "session_id": "5f729b66-9795-4a5d-9c9f-c6c24be30e10",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMzNzUsImlhdCI6MTc5MzM2MjQ3NSwianRpIjoiNzBjOTNkYjItNzcxYS00NTkxLWJhMzItNWUxNWJkMTQxM2ZlIiwic2lkIjoiNWY3MjliNjYtOTc5NS00YTVkLTljOWYtYzZjMjRiZTMwZTEwIn0.-AgnT18yR_F-ZYllafgI3iK3pN3oWT5uTHlFsN7BaEc",
  "access_expires_at": "2026-10-30T12:29:35.517503836Z",
  "refresh_token": "PTuCShitBsRBn5bhM3xXUktp9CcfyU8sYgfpzN6YHIY",
  "refresh_expires_at": "2026-10-31T00:14:35.516938785Z",
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
  "session_id": "ee42afa9-6aa8-483b-873a-32ddae57d7fa",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMzNzYsImlhdCI6MTc5MzM2MjQ3NiwianRpIjoiNzk1MGMyODktMzkyNC00YmQyLTliYjMtMTQ1NGM5ODFkYTExIiwic2lkIjoiZWU0MmFmYTktNmFhOC00ODNiLTg3M2EtMzJkZGFlNTdkN2ZhIn0.W-BmxrRdcxIyFgFp7Rb2t6odMQHJMw01mkoSAhBnouo",
  "access_expires_at": "2026-10-30T12:29:36.098450144Z",
  "refresh_token": "_97CbCa3GxzhcuQgg7SqhVshsuBhpmFCRHpim1IgTnw",
  "refresh_expires_at": "2026-10-31T00:14:36.097853555Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684611034",
  "device_ref": "sandbox-23227"
}
```

```json
{
  "challenge_id": "af156716-52e0-4e6c-a061-cb6a64aa2d6c",
  "expires_at": "2026-10-30T12:19:36.381031276Z",
  "resend_available_at": "2026-10-30T12:14:37.381031276Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380684611034` → **200**

```json
{
  "phone": "+380684611034",
  "audience": "CLIENT",
  "code": "243334",
  "sent_at": "2026-10-30T12:14:36.383975935Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "af156716-52e0-4e6c-a061-cb6a64aa2d6c",
  "code": "243334",
  "device_ref": "sandbox-23227"
}
```

```json
{
  "session_id": "c85776cf-9be1-4899-9960-c6f1b7372924",
  "subject": {
    "type": "CLIENT",
    "id": "12832494-4a25-4fa1-a69e-51ca47b05bcf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjgzMjQ5NC00YTI1LTRmYTEtYTY5ZS01MWNhNDdiMDViY2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMzc2LCJpYXQiOjE3OTMzNjI0NzYsImp0aSI6ImZhNTJmMWZiLTBlOWEtNGIwMy1iNTdhLWJlNDk0YzBlNTdmMyIsInNpZCI6ImM4NTc3NmNmLTliZTEtNDg5OS05OTYwLWM2ZjFiNzM3MjkyNCJ9.Zjk2j_PG4k3_725ew5jcETeUmryv-VbFguYVC0Jq774",
  "access_expires_at": "2026-10-30T12:29:36.715776277Z",
  "refresh_token": "S_7MxhPXH_3QNqFvs6CEUmQUtuAbQ7AXz8CHzgVkuR0",
  "refresh_expires_at": "2026-11-29T12:14:36.71517015Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5b68b26c-d3a1-4ce0-91e4-2ea4f9516f10",
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
  "id": "4df092fb-feb8-46f8-aa2e-9984426200be",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:19:37.014885Z",
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
  "command_id": "76810956-57cd-400e-8d47-7a2172864a3f",
  "quote_id": "4df092fb-feb8-46f8-aa2e-9984426200be",
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
  "id": "fd9ee963-44f9-40e8-94ae-aea32ab65ec5",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12832494-4a25-4fa1-a69e-51ca47b05bcf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:14:37.327714Z",
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
    "id": "bf15a257-3bb7-4a9d-8c03-cc078e1df794",
    "order_id": "fd9ee963-44f9-40e8-94ae-aea32ab65ec5",
    "expires_at": "2026-10-30T12:14:52.33183Z",
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

`POST /api/driver/v1/offers/bf15a257-3bb7-4a9d-8c03-cc078e1df794/reject` → **204**

```json
{
  "command_id": "0fbbdf67-9c2e-4441-a4f7-ed9e19102a7c"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "3fb6ecc2-3e74-413a-8407-9b36849826a1",
    "order_id": "fd9ee963-44f9-40e8-94ae-aea32ab65ec5",
    "expires_at": "2026-10-30T12:14:52.954818Z",
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

`POST /api/driver/v1/offers/3fb6ecc2-3e74-413a-8407-9b36849826a1/accept` → **200**

```json
{
  "command_id": "98fc42f9-c72c-4f03-aada-4fddae9aaac3"
}
```

```json
{
  "id": "b198fd54-8f11-4d64-8596-bf6939894fc0",
  "order_id": "fd9ee963-44f9-40e8-94ae-aea32ab65ec5",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c4ccc5c7-3112-4004-920f-7c724d7e82fb",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/fd9ee963-44f9-40e8-94ae-aea32ab65ec5/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T12:14:37.328521Z",
      "actor": {
        "type": "CLIENT",
        "id": "12832494-4a25-4fa1-a69e-51ca47b05bcf",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "fd9ee963-44f9-40e8-94ae-aea32ab65ec5",
        "quote_id": "4df092fb-feb8-46f8-aa2e-9984426200be",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "9fd70dc6-d010-4b35-ad4e-168e5e8e02e7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T12:14:37.330938Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fd9ee963-44f9-40e8-94ae-aea32ab65ec5",
        "attempt_id": "061d92bd-0a58-4da0-857e-b925e603aca4",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "9fd70dc6-d010-4b35-ad4e-168e5e8e02e7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T12:14:37.347979Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "bf15a257-3bb7-4a9d-8c03-cc078e1df794",
        "order_id": "fd9ee963-44f9-40e8-94ae-aea32ab65ec5",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "9fd70dc6-d010-4b35-ad4e-168e5e8e02e7"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T12:14:37.953779Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "bf15a257-3bb7-4a9d-8c03-cc078e1df794",
        "order_id": "fd9ee963-44f9-40e8-94ae-aea32ab65ec5"
      },
      "correlation_id": "b5d2f39e-de80-4729-9b3a-d749aaf4347e"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order fd9ee963-44f9-40e8-94ae-aea32ab65ec5 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/fd9ee963-44f9-40e8-94ae-aea32ab65ec5` → **200**

```json
{
  "id": "fd9ee963-44f9-40e8-94ae-aea32ab65ec5",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "12832494-4a25-4fa1-a69e-51ca47b05bcf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "b198fd54-8f11-4d64-8596-bf6939894fc0",
    "order_id": "fd9ee963-44f9-40e8-94ae-aea32ab65ec5",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c4ccc5c7-3112-4004-920f-7c724d7e82fb",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T12:14:37.327714Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/fd9ee963-44f9-40e8-94ae-aea32ab65ec5/cancel` → **200**

```json
{
  "command_id": "d530362f-d84f-4cf0-8a24-f62f992c14eb",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "fd9ee963-44f9-40e8-94ae-aea32ab65ec5",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "12832494-4a25-4fa1-a69e-51ca47b05bcf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "b198fd54-8f11-4d64-8596-bf6939894fc0",
    "order_id": "fd9ee963-44f9-40e8-94ae-aea32ab65ec5",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c4ccc5c7-3112-4004-920f-7c724d7e82fb",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T12:14:37.327714Z",
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
  "session_id": "5645f158-75eb-42dd-9150-f983d094dfb9",
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
  "last_heartbeat_at": "2026-10-30T12:14:33.366744Z",
  "last_location_at": "2026-10-30T12:14:33.366744Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5645f158-75eb-42dd-9150-f983d094dfb9/close` → **200**

```json
{
  "command_id": "96aa4823-0534-4743-bf01-c68bbf29d28f",
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
  "session_id": "a529b37e-a035-4eab-b274-d090fa915c53",
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
  "last_heartbeat_at": "2026-10-30T12:14:34.908578Z",
  "last_location_at": "2026-10-30T12:14:34.908578Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a529b37e-a035-4eab-b274-d090fa915c53/close` → **200**

```json
{
  "command_id": "a128c4b3-64fb-4a9e-83e8-335b0d06ddb6",
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
  "session_id": "127dc30e-c7a3-40ca-ae8d-2daf5da7e4be",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMzODEsImlhdCI6MTc5MzM2MjQ4MSwianRpIjoiNTI1ZDdiNTgtMmMxMy00NWUzLWE4YmEtY2Y5NjBlNWY1NDdhIiwic2lkIjoiMTI3ZGMzMGUtYzdhMy00MGNhLWFlOGQtMmRhZjVkYTdlNGJlIn0.wKduyPJUSS_JD0-aR8SqMEGVurn6_ZkwyKyT7FxwLbs",
  "access_expires_at": "2026-10-30T12:29:41.030191661Z",
  "refresh_token": "3XUh4EewPq_kfK7v-AFItjni5U2JflYBHMimlm4N5YY",
  "refresh_expires_at": "2026-10-31T00:14:41.029648446Z",
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
  "command_id": "d5639b8f-1835-4057-b7cf-96c519647b74",
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
  "changed_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T12:14:41.623335Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "3f77060c-7af3-41df-9a3a-2ae9c87d60c0",
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
  "correlation_id": "c884e6be-d4de-4b5f-b83e-c9724a6ebf53"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "297aa909-2b14-4925-b3b3-3a842b06c3aa",
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
  "correlation_id": "53e8a521-9f29-4d37-b8e4-6b5499f7ffed"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638891208",
  "device_ref": "sandbox-24052"
}
```

```json
{
  "challenge_id": "50c3384f-9d54-4b13-b3b7-2873c633bbc6",
  "expires_at": "2026-10-30T12:19:42.484427075Z",
  "resend_available_at": "2026-10-30T12:14:43.484427075Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638891208` → **200**

```json
{
  "phone": "+380638891208",
  "audience": "CLIENT",
  "code": "259224",
  "sent_at": "2026-10-30T12:14:42.487151262Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "50c3384f-9d54-4b13-b3b7-2873c633bbc6",
  "code": "259224",
  "device_ref": "sandbox-24052"
}
```

```json
{
  "session_id": "9beab543-5759-4482-b0ec-55e1b1698105",
  "subject": {
    "type": "CLIENT",
    "id": "4f81a132-5240-465c-b954-e2afafb0c02b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjgxYTEzMi01MjQwLTQ2NWMtYjk1NC1lMmFmYWZiMGMwMmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMzgyLCJpYXQiOjE3OTMzNjI0ODIsImp0aSI6ImY3NzdhZTUzLTU3ZDItNDNjYS1iOWY1LWNlMDQ2ZjQ3NTE5MCIsInNpZCI6IjliZWFiNTQzLTU3NTktNDQ4Mi1iMGVjLTU1ZTFiMTY5ODEwNSJ9.xt4Ak0F89c-GvKCDgcL34Gs9iqDEK6KHEAMN9lLGqdc",
  "access_expires_at": "2026-10-30T12:29:42.796040454Z",
  "refresh_token": "0bJtJwflPKFPZwlOFJv58SA05EVSKs_SF7-hqr5RhhQ",
  "refresh_expires_at": "2026-11-29T12:14:42.795497939Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e92502db-ec39-4248-9829-7a2fc99f50af",
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
  "id": "fc85cfe6-deb7-4c9e-b5f8-782abdc7d506",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:19:43.090710Z",
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
  "command_id": "91742da7-d42e-49ec-8297-15b11022e478",
  "quote_id": "fc85cfe6-deb7-4c9e-b5f8-782abdc7d506",
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
  "correlation_id": "5ad5acaa-fe36-476d-ac28-acfff7a99805"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "cc143f73-f697-46f9-8a48-b4b00d359c32",
  "quote_id": "fc85cfe6-deb7-4c9e-b5f8-782abdc7d506",
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
  "id": "f4d7ab58-09cc-4b50-9489-8f8bc1b168b0",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4f81a132-5240-465c-b954-e2afafb0c02b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:14:43.683047Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f4d7ab58-09cc-4b50-9489-8f8bc1b168b0/cancel` → **200**

```json
{
  "command_id": "d228d4be-38fc-4b14-8a5b-ed8bca9ae162",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f4d7ab58-09cc-4b50-9489-8f8bc1b168b0",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4f81a132-5240-465c-b954-e2afafb0c02b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:14:43.683047Z",
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
  "command_id": "61c10764-60eb-4273-9858-c235ab3321be",
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
  "changed_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T12:14:44.333284Z"
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
      "changed_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T12:14:44.333284Z"
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
  "device_ref": "sandbox-19959"
}
```

```json
{
  "challenge_id": "5b584977-8fc5-42b3-867b-f1d60321d991",
  "expires_at": "2026-10-30T12:19:45.212122323Z",
  "resend_available_at": "2026-10-30T12:14:46.212122323Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "844540",
  "sent_at": "2026-10-30T12:14:45.214871663Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5b584977-8fc5-42b3-867b-f1d60321d991",
  "code": "844540",
  "device_ref": "sandbox-19959"
}
```

```json
{
  "session_id": "fd206132-fae5-4008-bad3-fecfd011ba66",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzM4NSwiaWF0IjoxNzkzMzYyNDg1LCJqdGkiOiJmNTg0NDE4YS1hYzI2LTQwMTUtOTFmYy1hMjBiYTg4ZmQxMzMiLCJzaWQiOiJmZDIwNjEzMi1mYWU1LTQwMDgtYmFkMy1mZWNmZDAxMWJhNjYifQ.bYbcaZ6HaEB2bUUbK3qC42PISgmbpaDdcSG-Xnqv5zM",
  "access_expires_at": "2026-10-30T12:29:45.532212505Z",
  "refresh_token": "wOj2PamodBwRTG2xx6-yrA1c3ptrXSH9X1UEA61Db6w",
  "refresh_expires_at": "2026-11-29T12:14:45.531661384Z",
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
  "command_id": "a94f671a-46b0-4111-898f-938a21210a8e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:14:46Z",
    "sequence": 1793362486125
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "55009776-ac0c-4b0b-8760-c95eb8298106",
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
  "last_heartbeat_at": "2026-10-30T12:14:46.143135Z",
  "last_location_at": "2026-10-30T12:14:46.143135Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679574797",
  "device_ref": "sandbox-17659"
}
```

```json
{
  "challenge_id": "ad07b05e-6f61-4304-b6a7-4d0b87cef5a2",
  "expires_at": "2026-10-30T12:19:46.440590915Z",
  "resend_available_at": "2026-10-30T12:14:47.440590915Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679574797` → **200**

```json
{
  "phone": "+380679574797",
  "audience": "CLIENT",
  "code": "600554",
  "sent_at": "2026-10-30T12:14:46.443305825Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad07b05e-6f61-4304-b6a7-4d0b87cef5a2",
  "code": "600554",
  "device_ref": "sandbox-17659"
}
```

```json
{
  "session_id": "8f4e481d-d859-4da0-a90c-4552bcb6444c",
  "subject": {
    "type": "CLIENT",
    "id": "b76455cd-fd2f-407c-ac07-8582f84c3d53"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzY0NTVjZC1mZDJmLTQwN2MtYWMwNy04NTgyZjg0YzNkNTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMzg2LCJpYXQiOjE3OTMzNjI0ODYsImp0aSI6ImE3OTczNjY3LTY0MTctNDk1MS04NmMzLTEwZWQzYTk5ZTE0MyIsInNpZCI6IjhmNGU0ODFkLWQ4NTktNGRhMC1hOTBjLTQ1NTJiY2I2NDQ0YyJ9.OUQZNPNPwd6RzQnaIdZohLziXqv2dUUKBeKCxuqJB5k",
  "access_expires_at": "2026-10-30T12:29:46.757014972Z",
  "refresh_token": "JwGSfqRFKRSARkMam2muVrOsiFR1899HFX9eO1shc2o",
  "refresh_expires_at": "2026-11-29T12:14:46.756487617Z",
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
  "command_id": "dfc3e7d8-5b4e-4d90-97eb-daac490c324d",
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
  "id": "34b26df7-d890-4e3b-8e82-9cc200ae4732",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:19:47.328597Z",
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
  "command_id": "c20ab576-fcea-450c-af39-71d1c0f74396",
  "platform": "ANDROID",
  "token": "sandbox-driver-b7911012-ca9a-4dc5-bb30-20768f6220e2"
}
```

```json
{
  "id": "12db8807-033e-4fde-980c-0a7823f8e602",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T12:14:47.638157Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "9ffbad1b-71d7-43fb-9b85-238c7f79fa79",
  "platform": "ANDROID",
  "token": "sandbox-rider-98d2ade6-cc2f-47a8-ab2f-c86d30e2044e"
}
```

```json
{
  "id": "28ceb78f-dcb1-4d21-b88b-2dd385b192e6",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T12:14:47.929391Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3c620fce-ece3-44ae-b15b-b4b7ac40aee7",
  "quote_id": "34b26df7-d890-4e3b-8e82-9cc200ae4732",
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
  "id": "02e03b46-9194-477f-b322-3f0bc9c81845",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b76455cd-fd2f-407c-ac07-8582f84c3d53",
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
  "created_at": "2026-10-30T12:14:48.22883Z",
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
    "id": "fbe16b05-85d2-4f63-8fd1-396275194b0d",
    "order_id": "02e03b46-9194-477f-b322-3f0bc9c81845",
    "expires_at": "2026-10-30T12:15:03.232696Z",
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

`POST /api/driver/v1/offers/fbe16b05-85d2-4f63-8fd1-396275194b0d/accept` → **200**

```json
{
  "command_id": "892b8d7a-4e79-4d06-97dd-4b9580ed60ca"
}
```

```json
{
  "id": "d141c38f-396b-49b0-8e4b-3e9aca502872",
  "order_id": "02e03b46-9194-477f-b322-3f0bc9c81845",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b38becce-ee05-4bae-bb9c-f4e0bfe56c92",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T12:14:48.204Z` → **200**

```json
[
  {
    "at": "2026-10-30T12:14:48.736838606Z",
    "token_suffix": "6220e2",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "02e03b46-9194-477f-b322-3f0bc9c81845",
      "order_version": "2",
      "event_id": "777adfc3-f5da-4604-a948-ffa7afe80faa",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380679574797&after=2026-10-30T12:14:48.204Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380679574797&after=2026-10-30T12:14:48.204Z` → **200**

```json
[
  {
    "at": "2026-10-30T12:14:49.744704424Z",
    "token_suffix": "e2044e",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "02e03b46-9194-477f-b322-3f0bc9c81845",
      "order_version": "3",
      "event_id": "50e1d9e2-e3ac-48b1-a191-434946f4ccd3",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/02e03b46-9194-477f-b322-3f0bc9c81845/messages` → **201**

```json
{
  "command_id": "e909501e-37bf-433d-a92b-a0222ba8bd0b",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "2a6f07ed-3fb0-4b21-b806-d39d034571a5",
  "order_id": "02e03b46-9194-477f-b322-3f0bc9c81845",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T12:14:50.226266384Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b38becce-ee05-4bae-bb9c-f4e0bfe56c92",
  "order_id": "02e03b46-9194-477f-b322-3f0bc9c81845",
  "assignment_id": "d141c38f-396b-49b0-8e4b-3e9aca502872",
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

`POST /api/driver/v1/trips/b38becce-ee05-4bae-bb9c-f4e0bfe56c92/messages` → **201**

```json
{
  "command_id": "5c809deb-e545-4b92-92c9-001c1c02d333",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "fad44a2a-152e-479e-b988-ad0713b36599",
  "order_id": "02e03b46-9194-477f-b322-3f0bc9c81845",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T12:14:50.822074652Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/02e03b46-9194-477f-b322-3f0bc9c81845/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/b38becce-ee05-4bae-bb9c-f4e0bfe56c92/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679574797"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/55009776-ac0c-4b0b-8760-c95eb8298106/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:14:51Z",
    "sequence": 1793362491685
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "55009776-ac0c-4b0b-8760-c95eb8298106",
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
  "last_heartbeat_at": "2026-10-30T12:14:51.703848Z",
  "last_location_at": "2026-10-30T12:14:51.703848Z",
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
  "id": "b38becce-ee05-4bae-bb9c-f4e0bfe56c92",
  "order_id": "02e03b46-9194-477f-b322-3f0bc9c81845",
  "assignment_id": "d141c38f-396b-49b0-8e4b-3e9aca502872",
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

`POST /api/driver/v1/trips/b38becce-ee05-4bae-bb9c-f4e0bfe56c92/arrive` → **200**

```json
{
  "command_id": "5fd25bb3-85cf-463e-b8f4-74208c5c6613",
  "expected_version": 0
}
```

```json
{
  "id": "b38becce-ee05-4bae-bb9c-f4e0bfe56c92",
  "order_id": "02e03b46-9194-477f-b322-3f0bc9c81845",
  "assignment_id": "d141c38f-396b-49b0-8e4b-3e9aca502872",
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
  "arrived_at": "2026-10-30T12:14:52.266047Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b38becce-ee05-4bae-bb9c-f4e0bfe56c92/start` → **200**

```json
{
  "command_id": "0dc1ab3c-0d9a-450b-bf7d-2d4d50e54ea4",
  "expected_version": 1
}
```

```json
{
  "id": "b38becce-ee05-4bae-bb9c-f4e0bfe56c92",
  "order_id": "02e03b46-9194-477f-b322-3f0bc9c81845",
  "assignment_id": "d141c38f-396b-49b0-8e4b-3e9aca502872",
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
  "arrived_at": "2026-10-30T12:14:52.266047Z",
  "started_at": "2026-10-30T12:14:52.562153Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/55009776-ac0c-4b0b-8760-c95eb8298106/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:15:40Z",
    "sequence": 1793362540884
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "55009776-ac0c-4b0b-8760-c95eb8298106",
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
  "last_heartbeat_at": "2026-10-30T12:15:40.903682Z",
  "last_location_at": "2026-10-30T12:15:40.903682Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/b38becce-ee05-4bae-bb9c-f4e0bfe56c92/complete` → **200**

```json
{
  "command_id": "3e50cfcf-b5a1-4b8a-b749-8358670113a9",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:15:41Z",
  "cash_received": true
}
```

```json
{
  "id": "b38becce-ee05-4bae-bb9c-f4e0bfe56c92",
  "order_id": "02e03b46-9194-477f-b322-3f0bc9c81845",
  "assignment_id": "d141c38f-396b-49b0-8e4b-3e9aca502872",
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
  "arrived_at": "2026-10-30T12:14:52.266047Z",
  "started_at": "2026-10-30T12:14:52.562153Z",
  "completed_at": "2026-10-30T12:15:41.218399Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/02e03b46-9194-477f-b322-3f0bc9c81845` → **200**

```json
{
  "id": "02e03b46-9194-477f-b322-3f0bc9c81845",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "b76455cd-fd2f-407c-ac07-8582f84c3d53",
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
    "id": "d141c38f-396b-49b0-8e4b-3e9aca502872",
    "order_id": "02e03b46-9194-477f-b322-3f0bc9c81845",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b38becce-ee05-4bae-bb9c-f4e0bfe56c92",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:14:48.22883Z",
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
    "id": "02e03b46-9194-477f-b322-3f0bc9c81845",
    "short_number": 14,
    "status": "FULFILLED",
    "created_at": "2026-10-30T12:14:48.22883Z",
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
    "id": "b38becce-ee05-4bae-bb9c-f4e0bfe56c92",
    "order_id": "02e03b46-9194-477f-b322-3f0bc9c81845",
    "order_short_number": 14,
    "created_at": "2026-10-30T12:14:48.839391Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "a4f85f19-6848-4736-9bf0-68229de0ab4b",
    "order_id": "666463c8-9858-4508-8aca-66bb9a7832fa",
    "order_short_number": 9,
    "created_at": "2026-10-30T12:11:57.261925Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "61b30388-3adf-4a1d-b80f-dbecf56c6bab",
    "order_id": "68f00b41-9f1b-4940-8197-c441af18ab80",
    "order_short_number": 4,
    "created_at": "2026-10-30T12:10:22.578956Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "5408a98f-8a97-45da-ba2e-dabd1a79fec2",
    "order_id": "bf8d8c8f-3644-45bb-8562-01003ac91a08",
    "order_short_number": 2,
    "created_at": "2026-10-30T12:06:32.105021Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "4a70e17a-9653-4b2e-9e3a-9493622a70d4",
    "order_id": "820bc9be-b1ae-4af0-aca4-3de3e7418977",
    "order_short_number": 1,
    "created_at": "2026-10-30T12:06:21.97177Z",
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

`GET /api/rider/v1/orders/02e03b46-9194-477f-b322-3f0bc9c81845/tip` → **200**

```json
{
  "order_id": "02e03b46-9194-477f-b322-3f0bc9c81845",
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
  "available_until": "2026-10-31T12:15:41.218399Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/02e03b46-9194-477f-b322-3f0bc9c81845/tip` → **201**

```json
{
  "command_id": "55d33e76-8a0e-46c6-aee6-25d1425e2905",
  "amount_minor": 1100
}
```

```json
{
  "id": "d5f54f45-d3fa-4392-85b9-dfe9fac9ca34",
  "order_id": "02e03b46-9194-477f-b322-3f0bc9c81845",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T12:15:46.308996Z"
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
  "session_id": "b43316e9-3d71-44df-a98f-ec0378921cb7",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM0NDYsImlhdCI6MTc5MzM2MjU0NiwianRpIjoiNmY3YWQyNWMtZDQ2NS00MWVjLTliZmUtNzI1MDRjODk3NDM5Iiwic2lkIjoiYjQzMzE2ZTktM2Q3MS00NGRmLWE5OGYtZWMwMzc4OTIxY2I3In0.DI1GkmD8s7XfqFrMGYQa8i39lEyGb5T7jk3D9jqLYyo",
  "access_expires_at": "2026-10-30T12:30:46.893583028Z",
  "refresh_token": "pNqK8MO8Aisc3ct6Fop8nU0yTJQujGsZG2MQx2qNXiM",
  "refresh_expires_at": "2026-10-31T00:15:46.892689507Z",
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
  "generated_at": "2026-10-30T12:15:47.185980951Z"
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
  "generated_at": "2026-10-30T12:15:47.489378345Z"
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
  "session_id": "f32262a0-02d2-4b41-aacf-d0304d5ede82",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM0NDgsImlhdCI6MTc5MzM2MjU0OCwianRpIjoiNjUyZjZiNmItZDE2MC00N2YwLTgyZjAtZjk5OTAyNDk4MmMwIiwic2lkIjoiZjMyMjYyYTAtMDJkMi00YjQxLWFhY2YtZDAzMDRkNWVkZTgyIn0.U3YUA324_RoQmEnrlj4UJCk04UnJRyYphYI_L3lzXvo",
  "access_expires_at": "2026-10-30T12:30:48.07897453Z",
  "refresh_token": "9j91HAqhCm2lpSEGuRK8YaauBGo61TZvjOav2PtR_Bs",
  "refresh_expires_at": "2026-10-31T00:15:48.078348743Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/02e03b46-9194-477f-b322-3f0bc9c81845/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T12:14:48.229431Z",
      "actor": {
        "type": "CLIENT",
        "id": "b76455cd-fd2f-407c-ac07-8582f84c3d53",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "02e03b46-9194-477f-b322-3f0bc9c81845",
        "quote_id": "34b26df7-d890-4e3b-8e82-9cc200ae4732",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "35d1b0ee-8ed8-46b6-ac8e-1eff0aa53eeb"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T12:14:48.2318Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "02e03b46-9194-477f-b322-3f0bc9c81845",
        "attempt_id": "12ff41d8-fce3-451c-9de8-78303e903cdd",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "35d1b0ee-8ed8-46b6-ac8e-1eff0aa53eeb"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T12:14:48.23525Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "fbe16b05-85d2-4f63-8fd1-396275194b0d",
        "order_id": "02e03b46-9194-477f-b322-3f0bc9c81845",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "35d1b0ee-8ed8-46b6-ac8e-1eff0aa53eeb"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T12:14:48.841065Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "fbe16b05-85d2-4f63-8fd1-396275194b0d",
        "order_id": "02e03b46-9194-477f-b322-3f0bc9c81845",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "d141c38f-396b-49b0-8e4b-3e9aca502872"
      },
      "correlation_id": "72fc02c9-07ad-4e38-8dbe-3e5e9771e096"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T12:15:48.658243797Z",
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
      "last_location_at": "2026-10-30T12:15:40.903682Z",
      "order_id": null
    }
  ]
}
```

Done: order 02e03b46-9194-477f-b322-3f0bc9c81845.

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
  "session_id": "7f58390c-abc0-4136-867b-475392768ff4",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM0NDksImlhdCI6MTc5MzM2MjU0OSwianRpIjoiZDU5ZmZjNTAtNTUzYS00MGY5LWJjMzktOWIyOTExYTRiY2NmIiwic2lkIjoiN2Y1ODM5MGMtYWJjMC00MTM2LTg2N2ItNDc1MzkyNzY4ZmY0In0.VlzqcfFR-jqjXjq98XsEm72bBgY6vRMJMZ7eT0rGQE8",
  "access_expires_at": "2026-10-30T12:30:49.255704849Z",
  "refresh_token": "eYfdRWgXayJLAB_WyRlgQ82uxcq0GzuHF4O-udcckU4",
  "refresh_expires_at": "2026-10-31T00:15:49.255043666Z",
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
  "command_id": "9130c22c-c4a5-49af-b3e8-805fc655cc01",
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
  "timestamp": "2026-10-30T12:15:50.000+0000",
  "channel": {
    "id": "1730052000.3196930460",
    "linkedid": "1730052000.3196930460",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673081700"
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
  "timestamp": "2026-10-30T12:15:50.000+0000",
  "channel": {
    "id": "1730052000.3196930460",
    "linkedid": "1730052000.3196930460",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673081700"
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
  "session_id": "a3b5592a-6fa2-4e62-a879-09cd356c31fc",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM0NTAsImlhdCI6MTc5MzM2MjU1MCwianRpIjoiNjM4MDg2NDEtNjI4My00OGY4LWJhYzEtMzE3N2Y4MmUyNzIwIiwic2lkIjoiYTNiNTU5MmEtNmZhMi00ZTYyLWE4NzktMDljZDM1NmMzMWZjIn0.7upbA8DMs-fTEtGJORXKacojdQyzgqXG6HwSzsh0L0U",
  "access_expires_at": "2026-10-30T12:30:50.440051731Z",
  "refresh_token": "sqwKGmHxK-6R97oBPW4L8H-87HmuHwSuzLswjWI8saA",
  "refresh_expires_at": "2026-10-31T00:15:50.439488481Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "a8643a76-19fc-43f7-a462-9f50ae577e71",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673081700",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T12:15:50Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/a8643a76-19fc-43f7-a462-9f50ae577e71/answer` → **200**

```json
{
  "command_id": "928c383c-47f3-4b97-bbf2-1f46e6d79346"
}
```

```json
{
  "id": "a8643a76-19fc-43f7-a462-9f50ae577e71",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673081700",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "order_ids": [],
  "started_at": "2026-10-30T12:15:50Z",
  "answered_at": "2026-10-30T12:15:51.024749Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.3196930460",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "b1128e2c-f89f-4651-a687-3069c25dd5ee",
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
  "id": "bf0bbc15-e130-475f-a750-535f71e7d6d2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:20:51.359938Z",
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
  "command_id": "a99e1826-5ef7-48b6-9d75-52c6410c673b",
  "quote_id": "bf0bbc15-e130-475f-a750-535f71e7d6d2",
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
    "phone": "+380673081700"
  },
  "call_id": "a8643a76-19fc-43f7-a462-9f50ae577e71"
}
```

```json
{
  "id": "9acde525-4f5e-434b-bf33-47caa2bee4c4",
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
  "created_at": "2026-10-30T12:15:51.663572Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673081700"
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
    "id": "1730052000.3196930460",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "a8643a76-19fc-43f7-a462-9f50ae577e71",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673081700",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
      "order_ids": [
        "9acde525-4f5e-434b-bf33-47caa2bee4c4"
      ],
      "started_at": "2026-10-30T12:15:50Z",
      "answered_at": "2026-10-30T12:15:51.024749Z",
      "ended_at": "2026-10-30T12:15:51.999733Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "24575b0d-850c-4c21-80fb-5c32ac3a7da4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671959735",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
      "order_ids": [],
      "started_at": "2026-10-30T12:10:13.553748Z",
      "answered_at": "2026-10-30T12:10:13.881569Z",
      "ended_at": "2026-10-30T12:10:14.196027Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T12:10:18.616745Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/9acde525-4f5e-434b-bf33-47caa2bee4c4` → **200**

```json
{
  "id": "9acde525-4f5e-434b-bf33-47caa2bee4c4",
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
  "created_at": "2026-10-30T12:15:51.663572Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673081700"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/9acde525-4f5e-434b-bf33-47caa2bee4c4` → **200**

```json
{
  "id": "9acde525-4f5e-434b-bf33-47caa2bee4c4",
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
  "created_at": "2026-10-30T12:15:51.663572Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673081700"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9acde525-4f5e-434b-bf33-47caa2bee4c4/cancel` → **200**

```json
{
  "command_id": "2c6d2acc-0414-4855-955f-61f9f5f93352",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "9acde525-4f5e-434b-bf33-47caa2bee4c4",
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
  "created_at": "2026-10-30T12:15:51.663572Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673081700"
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

Done: call a8643a76-19fc-43f7-a462-9f50ae577e71 with order 9acde525-4f5e-434b-bf33-47caa2bee4c4.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31182"
}
```

```json
{
  "challenge_id": "d8fd1bc9-2eb2-4348-822d-1b2a0c183868",
  "expires_at": "2026-10-30T12:20:53.285180238Z",
  "resend_available_at": "2026-10-30T12:15:54.285180238Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "478709",
  "sent_at": "2026-10-30T12:15:53.288024936Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8fd1bc9-2eb2-4348-822d-1b2a0c183868",
  "code": "478709",
  "device_ref": "sandbox-31182"
}
```

```json
{
  "session_id": "0b4eec76-762b-4b72-a6af-f048bea5e0b8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzQ1MywiaWF0IjoxNzkzMzYyNTUzLCJqdGkiOiJhYjk3NzhkMy1kMjEyLTRkZjctODMxMi1lOTRjOGEyOWUyNTUiLCJzaWQiOiIwYjRlZWM3Ni03NjJiLTRiNzItYTZhZi1mMDQ4YmVhNWUwYjgifQ.OYSsySE4hiDVIJt_H2dX9Y_8d227o4FlcSecAz6A6vQ",
  "access_expires_at": "2026-10-30T12:30:53.602635145Z",
  "refresh_token": "sqZCbgAIdj9bdLsR1m10hkoZqhLzp8t31pP4YUlg-1Q",
  "refresh_expires_at": "2026-11-29T12:15:53.601911454Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "55009776-ac0c-4b0b-8760-c95eb8298106",
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
  "last_heartbeat_at": "2026-10-30T12:15:40.903682Z",
  "last_location_at": "2026-10-30T12:15:40.903682Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/55009776-ac0c-4b0b-8760-c95eb8298106/handover` → **200**

```json
{
  "command_id": "0da4361f-cdef-41db-a98f-7d3faed49c81",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "55009776-ac0c-4b0b-8760-c95eb8298106",
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
  "last_heartbeat_at": "2026-10-30T12:15:40.903682Z",
  "last_location_at": "2026-10-30T12:15:40.903682Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 85 s to the next point)

`POST /api/driver/v1/work-sessions/55009776-ac0c-4b0b-8760-c95eb8298106/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:17:19Z",
    "sequence": 1793362639498
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "55009776-ac0c-4b0b-8760-c95eb8298106",
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
  "last_heartbeat_at": "2026-10-30T12:17:19.516859Z",
  "last_location_at": "2026-10-30T12:17:19.516859Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666401582",
  "device_ref": "sandbox-18943"
}
```

```json
{
  "challenge_id": "1a7d61f5-a29f-42f6-a0f3-508fbc94cbe0",
  "expires_at": "2026-10-30T12:22:19.802305081Z",
  "resend_available_at": "2026-10-30T12:17:20.802305081Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666401582` → **200**

```json
{
  "phone": "+380666401582",
  "audience": "CLIENT",
  "code": "638467",
  "sent_at": "2026-10-30T12:17:19.805155642Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a7d61f5-a29f-42f6-a0f3-508fbc94cbe0",
  "code": "638467",
  "device_ref": "sandbox-18943"
}
```

```json
{
  "session_id": "88f7a352-b007-4222-b8a5-f3f8f86695bb",
  "subject": {
    "type": "CLIENT",
    "id": "a7545494-13b7-4ad4-829f-633304cbf2da"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNzU0NTQ5NC0xM2I3LTRhZDQtODI5Zi02MzMzMDRjYmYyZGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzNTQwLCJpYXQiOjE3OTMzNjI2NDAsImp0aSI6Ijg2YTYzNDc4LTRkOTQtNDdjNy05ZGRkLTcwODJiMTA1MWE3MyIsInNpZCI6Ijg4ZjdhMzUyLWIwMDctNDIyMi1iOGE1LWYzZjhmODY2OTViYiJ9.6FzIpCPuO5uKGT1SHyR1XZNyLd9gg65sBPcVcLmpn9A",
  "access_expires_at": "2026-10-30T12:32:20.125658305Z",
  "refresh_token": "brnHvxSzCxK2Vmm-woIJgqUg9y5e-YbfrhQsqdz0r5k",
  "refresh_expires_at": "2026-11-29T12:17:20.124988396Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ca85715c-9703-49ef-bc0e-e301b8d986e0",
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
  "id": "07f76ba6-5dfa-46a1-8465-64fba3db87b7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:22:20.418511Z",
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
  "command_id": "03d1ae25-76a6-41ee-b1e2-b9311e2d8dc9",
  "quote_id": "07f76ba6-5dfa-46a1-8465-64fba3db87b7",
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
  "id": "1bd9554e-0936-4ff0-983c-081b5c112928",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a7545494-13b7-4ad4-829f-633304cbf2da",
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
  "created_at": "2026-10-30T12:17:20.717223Z",
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
    "id": "ee580955-b2c0-4a3d-b139-c0448dddc030",
    "order_id": "1bd9554e-0936-4ff0-983c-081b5c112928",
    "expires_at": "2026-10-30T12:17:35.720539Z",
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

`POST /api/driver/v1/offers/ee580955-b2c0-4a3d-b139-c0448dddc030/accept` → **200**

```json
{
  "command_id": "30d4cb66-3e05-4010-a4a9-5c7cab3b2f9b"
}
```

```json
{
  "id": "1af33ef5-36e1-44d8-8e2b-03b2aa648702",
  "order_id": "1bd9554e-0936-4ff0-983c-081b5c112928",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "220fc3b4-829c-40f2-ab3a-32bfcb2b92c1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "220fc3b4-829c-40f2-ab3a-32bfcb2b92c1",
  "order_id": "1bd9554e-0936-4ff0-983c-081b5c112928",
  "assignment_id": "1af33ef5-36e1-44d8-8e2b-03b2aa648702",
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

`POST /api/driver/v1/work-sessions/55009776-ac0c-4b0b-8760-c95eb8298106/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:17:21Z",
    "sequence": 1793362641906
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "55009776-ac0c-4b0b-8760-c95eb8298106",
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
  "last_heartbeat_at": "2026-10-30T12:17:21.925198Z",
  "last_location_at": "2026-10-30T12:17:21.925198Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/220fc3b4-829c-40f2-ab3a-32bfcb2b92c1/arrive` → **200**

```json
{
  "command_id": "8180c660-7997-4319-bf60-7141c0f4c3f3",
  "expected_version": 0
}
```

```json
{
  "id": "220fc3b4-829c-40f2-ab3a-32bfcb2b92c1",
  "order_id": "1bd9554e-0936-4ff0-983c-081b5c112928",
  "assignment_id": "1af33ef5-36e1-44d8-8e2b-03b2aa648702",
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
  "arrived_at": "2026-10-30T12:17:22.226249Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/220fc3b4-829c-40f2-ab3a-32bfcb2b92c1/start` → **200**

```json
{
  "command_id": "7492941c-4d2e-44b8-adcb-834e79db449b",
  "expected_version": 1
}
```

```json
{
  "id": "220fc3b4-829c-40f2-ab3a-32bfcb2b92c1",
  "order_id": "1bd9554e-0936-4ff0-983c-081b5c112928",
  "assignment_id": "1af33ef5-36e1-44d8-8e2b-03b2aa648702",
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
  "arrived_at": "2026-10-30T12:17:22.226249Z",
  "started_at": "2026-10-30T12:17:22.55759Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions/55009776-ac0c-4b0b-8760-c95eb8298106/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:18:21Z",
    "sequence": 1793362701869
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "55009776-ac0c-4b0b-8760-c95eb8298106",
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
  "last_heartbeat_at": "2026-10-30T12:18:21.888065Z",
  "last_location_at": "2026-10-30T12:18:21.888065Z",
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
  "device_ref": "sandbox-12726"
}
```

```json
{
  "challenge_id": "9559827c-5fa0-4dd9-8697-6e9d0ee83446",
  "expires_at": "2026-10-30T12:23:22.174000242Z",
  "resend_available_at": "2026-10-30T12:18:23.174000242Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "491043",
  "sent_at": "2026-10-30T12:18:22.176815089Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9559827c-5fa0-4dd9-8697-6e9d0ee83446",
  "code": "491043",
  "device_ref": "sandbox-12726"
}
```

```json
{
  "session_id": "9fafae83-8464-4753-ae31-2ac40b41a4b4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzYwMiwiaWF0IjoxNzkzMzYyNzAyLCJqdGkiOiJiYTEwNmRiNy1kMTljLTQ1ZjQtOWQ0Zi1lNGVkMTczMTMwZTUiLCJzaWQiOiI5ZmFmYWU4My04NDY0LTQ3NTMtYWUzMS0yYWM0MGI0MWE0YjQifQ.HsgFvmewfnasQgRWHkYNXuV1ecDcX-9m5IaIOJSTXk8",
  "access_expires_at": "2026-10-30T12:33:22.498456171Z",
  "refresh_token": "qSdxRVjRaUZeTof5WR9b2xnd08PDxJOuI37M9o87Osg",
  "refresh_expires_at": "2026-11-29T12:18:22.497817481Z",
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
  "command_id": "df1b0e9c-9d88-4d9f-8cdb-c74a303e4612",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:18:23Z",
    "sequence": 1793362703114
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "18e78940-0004-4581-a995-0a471ddfeaa7",
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
  "last_heartbeat_at": "2026-10-30T12:18:23.13313Z",
  "last_location_at": "2026-10-30T12:18:23.13313Z",
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
  "session_id": "766def34-a4b6-4e22-853c-4567e2b22c97",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM2MDMsImlhdCI6MTc5MzM2MjcwMywianRpIjoiOWYyOGUwZGUtNTk0MS00NmMwLTkzYWItZGVmNjYxNzlhNmVmIiwic2lkIjoiNzY2ZGVmMzQtYTRiNi00ZTIyLTg1M2MtNDU2N2UyYjIyYzk3In0.QQjKQmqenq3UGzx8P9wsNUDmtpn9l624Og5qtzrzThU",
  "access_expires_at": "2026-10-30T12:33:23.736956821Z",
  "refresh_token": "aBTPkKWudiQLJ8qFIvAEKL8obuVBZbRu4tAY8TWEqFc",
  "refresh_expires_at": "2026-10-31T00:18:23.736425553Z",
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
  "session_id": "b143d19b-728a-40a8-8ef5-c8dc8ee83e25",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM2MDQsImlhdCI6MTc5MzM2MjcwNCwianRpIjoiNzMyMjJjMDctZjVhYi00YzFmLTk2MWUtNGNmNzIwYjI3NjQyIiwic2lkIjoiYjE0M2QxOWItNzI4YS00MGE4LThlZjUtYzhkYzhlZTgzZTI1In0.1DU_PMCn49bkpfncmW7W9JesmX3LRTRie2FRyIxZ3Ic",
  "access_expires_at": "2026-10-30T12:33:24.318229286Z",
  "refresh_token": "xzE5y56UkNJYntmx2K1Dj3pJhYtyHExrvpsCQOzGK6k",
  "refresh_expires_at": "2026-10-31T00:18:24.317703449Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/1bd9554e-0936-4ff0-983c-081b5c112928` → **200**

```json
{
  "id": "1bd9554e-0936-4ff0-983c-081b5c112928",
  "short_number": 16,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "a7545494-13b7-4ad4-829f-633304cbf2da",
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
    "id": "1af33ef5-36e1-44d8-8e2b-03b2aa648702",
    "order_id": "1bd9554e-0936-4ff0-983c-081b5c112928",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "220fc3b4-829c-40f2-ab3a-32bfcb2b92c1",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T12:17:20.717223Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/1bd9554e-0936-4ff0-983c-081b5c112928/interrupt` → **200**

```json
{
  "command_id": "ba81a2e4-5ef2-47b6-9a56-78a4d9d38ffe",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "1bd9554e-0936-4ff0-983c-081b5c112928",
    "short_number": 16,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "a7545494-13b7-4ad4-829f-633304cbf2da",
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
      "id": "1af33ef5-36e1-44d8-8e2b-03b2aa648702",
      "order_id": "1bd9554e-0936-4ff0-983c-081b5c112928",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "220fc3b4-829c-40f2-ab3a-32bfcb2b92c1",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T12:17:20.717223Z",
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
    "id": "ff0e03e7-119e-48c0-aa02-8efeaefff4fc",
    "short_number": 17,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "a7545494-13b7-4ad4-829f-633304cbf2da",
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
    "id": "2e13a0af-c55b-4b1c-9de4-220df4bb4039",
    "order_id": "ff0e03e7-119e-48c0-aa02-8efeaefff4fc",
    "expires_at": "2026-10-30T12:18:39.935368Z",
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

`POST /api/driver/v1/offers/2e13a0af-c55b-4b1c-9de4-220df4bb4039/accept` → **200**

```json
{
  "command_id": "fa715def-e8e8-49a9-b0ec-c8662f026dde"
}
```

```json
{
  "id": "a0a4a8ac-21ce-40e5-b7b1-055d0275e07e",
  "order_id": "ff0e03e7-119e-48c0-aa02-8efeaefff4fc",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0f796808-2564-487d-8c7d-575fefea92f5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0f796808-2564-487d-8c7d-575fefea92f5",
  "order_id": "ff0e03e7-119e-48c0-aa02-8efeaefff4fc",
  "assignment_id": "a0a4a8ac-21ce-40e5-b7b1-055d0275e07e",
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
  "session_id": "18e78940-0004-4581-a995-0a471ddfeaa7",
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
  "last_heartbeat_at": "2026-10-30T12:18:23.13313Z",
  "last_location_at": "2026-10-30T12:18:23.13313Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/18e78940-0004-4581-a995-0a471ddfeaa7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:18:26Z",
    "sequence": 1793362706452
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "18e78940-0004-4581-a995-0a471ddfeaa7",
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
  "last_heartbeat_at": "2026-10-30T12:18:26.470467Z",
  "last_location_at": "2026-10-30T12:18:26.470467Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/0f796808-2564-487d-8c7d-575fefea92f5/arrive` → **200**

```json
{
  "command_id": "f33d5759-d857-4e45-9327-a86bd07baa04",
  "expected_version": 0
}
```

```json
{
  "id": "0f796808-2564-487d-8c7d-575fefea92f5",
  "order_id": "ff0e03e7-119e-48c0-aa02-8efeaefff4fc",
  "assignment_id": "a0a4a8ac-21ce-40e5-b7b1-055d0275e07e",
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
  "arrived_at": "2026-10-30T12:18:26.770523Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0f796808-2564-487d-8c7d-575fefea92f5/start` → **200**

```json
{
  "command_id": "28b1507f-9ce5-4b2f-bcdf-0897e2561a4f",
  "expected_version": 1
}
```

```json
{
  "id": "0f796808-2564-487d-8c7d-575fefea92f5",
  "order_id": "ff0e03e7-119e-48c0-aa02-8efeaefff4fc",
  "assignment_id": "a0a4a8ac-21ce-40e5-b7b1-055d0275e07e",
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
  "arrived_at": "2026-10-30T12:18:26.770523Z",
  "started_at": "2026-10-30T12:18:27.067888Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0f796808-2564-487d-8c7d-575fefea92f5/complete` → **200**

```json
{
  "command_id": "ad2630aa-347b-4e33-838b-2ff3d6e51368",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:18:27Z"
}
```

```json
{
  "id": "0f796808-2564-487d-8c7d-575fefea92f5",
  "order_id": "ff0e03e7-119e-48c0-aa02-8efeaefff4fc",
  "assignment_id": "a0a4a8ac-21ce-40e5-b7b1-055d0275e07e",
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
  "arrived_at": "2026-10-30T12:18:26.770523Z",
  "started_at": "2026-10-30T12:18:27.067888Z",
  "completed_at": "2026-10-30T12:18:27.37954Z",
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
    "id": "ff0e03e7-119e-48c0-aa02-8efeaefff4fc",
    "short_number": 17,
    "status": "FULFILLED",
    "created_at": "2026-10-30T12:18:24.925753Z",
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
    "id": "1bd9554e-0936-4ff0-983c-081b5c112928",
    "short_number": 16,
    "status": "CANCELLED",
    "created_at": "2026-10-30T12:17:20.717223Z",
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

`GET /api/operator/v1/orders/1bd9554e-0936-4ff0-983c-081b5c112928/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T12:17:20.717762Z",
      "actor": {
        "type": "CLIENT",
        "id": "a7545494-13b7-4ad4-829f-633304cbf2da",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1bd9554e-0936-4ff0-983c-081b5c112928",
        "quote_id": "07f76ba6-5dfa-46a1-8465-64fba3db87b7",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "0c492518-ce7f-4dc1-a9e6-42c7aa51918c"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T12:17:20.719804Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1bd9554e-0936-4ff0-983c-081b5c112928",
        "attempt_id": "1d6cb6c9-855c-49ef-98b2-46d4425ac815",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0c492518-ce7f-4dc1-a9e6-42c7aa51918c"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T12:17:20.72276Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ee580955-b2c0-4a3d-b139-c0448dddc030",
        "order_id": "1bd9554e-0936-4ff0-983c-081b5c112928",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "0c492518-ce7f-4dc1-a9e6-42c7aa51918c"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T12:17:21.324029Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ee580955-b2c0-4a3d-b139-c0448dddc030",
        "order_id": "1bd9554e-0936-4ff0-983c-081b5c112928",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "1af33ef5-36e1-44d8-8e2b-03b2aa648702"
      },
      "correlation_id": "be887aa0-4385-4aa7-9682-8cd3dac0b186"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/ff0e03e7-119e-48c0-aa02-8efeaefff4fc/tip` → **200**

```json
{
  "order_id": "ff0e03e7-119e-48c0-aa02-8efeaefff4fc",
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
  "available_until": "2026-10-31T12:18:27.37954Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/ff0e03e7-119e-48c0-aa02-8efeaefff4fc/tip` → **409**

```json
{
  "command_id": "0a980993-3cc7-41e4-8d51-901fefaf5b13",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/ff0e03e7-119e-48c0-aa02-8efeaefff4fc/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5ff4bf24-70e9-4a5c-89ba-642d4f28a646"
}
```

Done: interrupted 1bd9554e-0936-4ff0-983c-081b5c112928, follow-up ff0e03e7-119e-48c0-aa02-8efeaefff4fc.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "55009776-ac0c-4b0b-8760-c95eb8298106",
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
  "last_heartbeat_at": "2026-10-30T12:18:21.888065Z",
  "last_location_at": "2026-10-30T12:18:21.888065Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/55009776-ac0c-4b0b-8760-c95eb8298106/close` → **200**

```json
{
  "command_id": "a0bc52dd-bacc-4815-8ffd-e96f5b555589",
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
  "session_id": "18e78940-0004-4581-a995-0a471ddfeaa7",
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
  "last_heartbeat_at": "2026-10-30T12:18:26.470467Z",
  "last_location_at": "2026-10-30T12:18:26.470467Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/18e78940-0004-4581-a995-0a471ddfeaa7/close` → **200**

```json
{
  "command_id": "abf58ae5-4151-4737-bb10-6f3c3d0bbf19",
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
  "session_id": "83571183-0794-467e-aa0f-8269d4d68eb7",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM2MTMsImlhdCI6MTc5MzM2MjcxMywianRpIjoiN2IzN2E0MTEtZjU2Yy00NDU2LWIwMmYtMWQ5OGQyYzgzZjQwIiwic2lkIjoiODM1NzExODMtMDc5NC00NjdlLWFhMGYtODI2OWQ0ZDY4ZWI3In0.Ci0dCpLyFYiYBsM04btyHXYUcKX1AYIvK_cDYPDcKiI",
  "access_expires_at": "2026-10-30T12:33:33.640554194Z",
  "refresh_token": "SjZ_hXDapmouz3MoL4-bAMy59GxS850YqkN01SW1dSU",
  "refresh_expires_at": "2026-10-31T00:18:33.639955019Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "3736abf3-9375-4168-866e-3358a6d70402",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T12:18:33Z"
}
```

```json
{
  "id": "7f84b657-7d10-462c-b1df-94798c549923",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T12:18:33Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/7f84b657-7d10-462c-b1df-94798c549923/publish` → **200**

```json
{
  "command_id": "545b0c07-ce48-4224-89d2-9270719967f3",
  "expected_version": 0
}
```

```json
{
  "id": "7f84b657-7d10-462c-b1df-94798c549923",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T12:18:34.236749Z",
  "published_at": "2026-10-30T12:18:34.236749Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "7f84b657-7d10-462c-b1df-94798c549923",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T12:18:34.236749Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636399487",
  "device_ref": "sandbox-2370"
}
```

```json
{
  "challenge_id": "ab76b04e-074b-4ea7-a15f-3117ec5a7a28",
  "expires_at": "2026-10-30T12:23:34.819237349Z",
  "resend_available_at": "2026-10-30T12:18:35.819237349Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636399487` → **200**

```json
{
  "phone": "+380636399487",
  "audience": "CLIENT",
  "code": "937717",
  "sent_at": "2026-10-30T12:18:34.822202426Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab76b04e-074b-4ea7-a15f-3117ec5a7a28",
  "code": "937717",
  "device_ref": "sandbox-2370"
}
```

```json
{
  "session_id": "0ddd89fa-cd66-4e9e-a923-763d7995a053",
  "subject": {
    "type": "CLIENT",
    "id": "40569945-9e8d-4e8a-9af8-7c536fe0569a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MDU2OTk0NS05ZThkLTRlOGEtOWFmOC03YzUzNmZlMDU2OWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzNjE1LCJpYXQiOjE3OTMzNjI3MTUsImp0aSI6IjI5MmM4MTE1LWZiYzAtNGIxNi1iMjJiLTEwZTYzNmUzYmQ2MiIsInNpZCI6IjBkZGQ4OWZhLWNkNjYtNGU5ZS1hOTIzLTc2M2Q3OTk1YTA1MyJ9.aRg16ooLLSCeE4SjHLNoZ8zdJaj8eghkVd9TpGZci48",
  "access_expires_at": "2026-10-30T12:33:35.136740656Z",
  "refresh_token": "UfNR05TukOq_IW0gdC8D1Smd4GL-V0oQHGJLoufJcjM",
  "refresh_expires_at": "2026-11-29T12:18:35.13620505Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "7f84b657-7d10-462c-b1df-94798c549923",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T12:18:34.236749Z",
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
  "command_id": "771e6bd9-ed20-4e6f-8538-8faba75c4649",
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
  "id": "4fe9a4cb-3fdb-4fec-a287-e71fdf5116d1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:23:35.726679Z",
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
  "command_id": "7fdcfc08-05be-45de-aac7-736b7a5d6d0d",
  "quote_id": "4fe9a4cb-3fdb-4fec-a287-e71fdf5116d1",
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
  "correlation_id": "e99e64db-9a53-49a1-a9d1-1c36dceea447"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "05d63b4d-d98b-425e-b314-9e37d9745d42",
  "version_id": "7f84b657-7d10-462c-b1df-94798c549923",
  "language": "uk"
}
```

```json
{
  "version_id": "7f84b657-7d10-462c-b1df-94798c549923",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T12:18:36.315821Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "62abd078-a97f-4187-b16d-6317ea015cde",
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
  "id": "4119500b-a6d8-44a5-b57f-c351f43f28b2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:23:36.617056Z",
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
  "command_id": "80a2b08a-5f37-4c23-bb12-27ca38d9b001",
  "quote_id": "4119500b-a6d8-44a5-b57f-c351f43f28b2",
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
  "id": "98020e87-4c0d-4911-9f7f-08d33f06207a",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "40569945-9e8d-4e8a-9af8-7c536fe0569a",
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
  "created_at": "2026-10-30T12:18:36.916736Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/98020e87-4c0d-4911-9f7f-08d33f06207a` → **200**

```json
{
  "id": "98020e87-4c0d-4911-9f7f-08d33f06207a",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "40569945-9e8d-4e8a-9af8-7c536fe0569a",
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
  "created_at": "2026-10-30T12:18:36.916736Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/98020e87-4c0d-4911-9f7f-08d33f06207a/cancel` → **200**

```json
{
  "command_id": "dfddbf23-84e8-4885-b94f-f0b2240e7fc9",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "98020e87-4c0d-4911-9f7f-08d33f06207a",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "40569945-9e8d-4e8a-9af8-7c536fe0569a",
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
  "created_at": "2026-10-30T12:18:36.916736Z",
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

`POST /api/admin/v1/legal-documents/7f84b657-7d10-462c-b1df-94798c549923` → **409**

```json
{
  "command_id": "928aab87-d46a-40d4-91ca-e6a1b6c7e028",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T12:18:37Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/7f84b657-7d10-462c-b1df-94798c549923",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e513e937-062d-4a5d-87e9-a604447c5e07"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "d275e00d-6e0f-4eb8-b0d3-cd3d1accebed",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T12:18:38Z"
}
```

```json
{
  "id": "684b63e1-2726-4c98-8058-9e77d2c17fe8",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T12:18:38Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/684b63e1-2726-4c98-8058-9e77d2c17fe8/publish` → **200**

```json
{
  "command_id": "a8c9602b-d642-4c38-95d5-b9d219b58c46",
  "expected_version": 0
}
```

```json
{
  "id": "684b63e1-2726-4c98-8058-9e77d2c17fe8",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T12:18:38.468284Z",
  "published_at": "2026-10-30T12:18:38.468284Z",
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
  "device_ref": "sandbox-28734"
}
```

```json
{
  "challenge_id": "2012f3bb-6b3a-4d84-aff8-12dd67d1a3b2",
  "expires_at": "2026-10-30T12:23:38.772755616Z",
  "resend_available_at": "2026-10-30T12:18:39.772755616Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "517123",
  "sent_at": "2026-10-30T12:18:38.775561594Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2012f3bb-6b3a-4d84-aff8-12dd67d1a3b2",
  "code": "517123",
  "device_ref": "sandbox-28734"
}
```

```json
{
  "session_id": "c6f5c0af-ba7f-48f7-bdaa-23111cd94b83",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzYxOSwiaWF0IjoxNzkzMzYyNzE5LCJqdGkiOiI2ZjNjZjhjYS04NDY3LTQyZDYtODZiNy00ODhmNWE3ZDYzYzkiLCJzaWQiOiJjNmY1YzBhZi1iYTdmLTQ4ZjctYmRhYS0yMzExMWNkOTRiODMifQ.vBbrihKg0E9dt0pGwuP9_55RqinLPwm6rUtTzps_fYc",
  "access_expires_at": "2026-10-30T12:33:39.101661346Z",
  "refresh_token": "OLnyJdRlPSB0hZdiPpo6AjS_u4Z5axxQwu2-w-fck2E",
  "refresh_expires_at": "2026-11-29T12:18:39.100831287Z",
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
  "command_id": "b481b7d3-0304-44ed-845b-85ff37263d0d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:19:50Z",
    "sequence": 1793362790704
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d0f94ad3-52c3-4d88-aa72-5120ad88f79f",
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
  "last_heartbeat_at": "2026-10-30T12:19:50.722841Z",
  "last_location_at": "2026-10-30T12:19:50.722841Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670173986",
  "device_ref": "sandbox-15994"
}
```

```json
{
  "challenge_id": "ae7cd509-8bef-43f9-80c0-65eb4d9379e2",
  "expires_at": "2026-10-30T12:24:51.024075856Z",
  "resend_available_at": "2026-10-30T12:19:52.024075856Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670173986` → **200**

```json
{
  "phone": "+380670173986",
  "audience": "CLIENT",
  "code": "981472",
  "sent_at": "2026-10-30T12:19:51.02678001Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ae7cd509-8bef-43f9-80c0-65eb4d9379e2",
  "code": "981472",
  "device_ref": "sandbox-15994"
}
```

```json
{
  "session_id": "68968059-f54a-495e-8ad5-a252c24371e0",
  "subject": {
    "type": "CLIENT",
    "id": "39d6f1e8-5c2c-4da3-a2be-7d8c0df388b0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOWQ2ZjFlOC01YzJjLTRkYTMtYTJiZS03ZDhjMGRmMzg4YjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzNjkxLCJpYXQiOjE3OTMzNjI3OTEsImp0aSI6ImI0Y2U2NTAwLTNmZDItNGRiMC1iMWVmLWNjZDk2ZTgxNjA1NCIsInNpZCI6IjY4OTY4MDU5LWY1NGEtNDk1ZS04YWQ1LWEyNTJjMjQzNzFlMCJ9.AKoclrUZKraDrUr7xtvIix5RN6bUQRSzoR7w4cTahdk",
  "access_expires_at": "2026-10-30T12:34:51.345282904Z",
  "refresh_token": "r4CPLh9CoNZynfNvQYnPdfcdI0fr6X08C8fm2RE2fTE",
  "refresh_expires_at": "2026-11-29T12:19:51.344771133Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b58eeb2e-aa6b-49ec-8dea-1f52c93e1412",
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
  "id": "e725f6ff-26ce-4cb2-bbf7-2a74ba40d727",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:24:51.642187Z",
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
  "command_id": "0627bdef-6652-405e-a10a-17a04f88b496",
  "quote_id": "e725f6ff-26ce-4cb2-bbf7-2a74ba40d727",
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
    "phone": "+380673039136"
  }
}
```

```json
{
  "id": "6cc6bd4c-527d-4a34-8dfc-0bfe987222da",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "39d6f1e8-5c2c-4da3-a2be-7d8c0df388b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:19:51.954005Z",
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
    "id": "5c45c2ae-a7ba-46f1-b575-c91aa05f4885",
    "order_id": "6cc6bd4c-527d-4a34-8dfc-0bfe987222da",
    "expires_at": "2026-10-30T12:20:06.958249Z",
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

`POST /api/driver/v1/offers/5c45c2ae-a7ba-46f1-b575-c91aa05f4885/accept` → **200**

```json
{
  "command_id": "a9e47f01-1885-4c3d-af9b-7e8c2ef1bfa2"
}
```

```json
{
  "id": "b5961867-8d6d-455f-98d8-9d267a3f6600",
  "order_id": "6cc6bd4c-527d-4a34-8dfc-0bfe987222da",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bcfd117c-1908-43bb-8d3f-9423373f4a65",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bcfd117c-1908-43bb-8d3f-9423373f4a65",
  "order_id": "6cc6bd4c-527d-4a34-8dfc-0bfe987222da",
  "assignment_id": "b5961867-8d6d-455f-98d8-9d267a3f6600",
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
    "phone": "+380673039136"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f7ad2c48-7019-4d07-b611-43128d1759bf",
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
  "id": "9a6427fe-16ef-4eb7-9a48-66bcf498cbf4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:24:53.183800Z",
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
  "command_id": "3e5b51f6-ff69-463d-a843-ddfd5298c235",
  "quote_id": "9a6427fe-16ef-4eb7-9a48-66bcf498cbf4",
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
  "id": "3c618ac8-8453-4364-99d9-b53953d2584c",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "39d6f1e8-5c2c-4da3-a2be-7d8c0df388b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:19:53.487263Z",
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
  "command_id": "a85ebd9b-f409-46f1-9ac1-46fff6cb01eb",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T15:19:53Z"
}
```

```json
{
  "id": "f83127d5-ea78-4316-8dd9-41f586aba36f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:24:53.811257Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T15:19:53Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b57a716d-2df1-4afb-b267-9251351a59ed",
  "quote_id": "f83127d5-ea78-4316-8dd9-41f586aba36f",
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
  "pickup_at": "2026-10-30T15:19:53Z"
}
```

```json
{
  "id": "5bc0a88f-cf75-4778-99eb-3fb41bbe8a4f",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "39d6f1e8-5c2c-4da3-a2be-7d8c0df388b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T12:19:54.127914Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T15:19:53Z",
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
  "command_id": "98316ff9-ec81-402c-ae7e-80b8e8ab0aa7",
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
  "id": "4ad3bf4e-6a29-473f-a3b1-1536a52cb956",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:24:54.459983Z",
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
  "command_id": "c7a6beb1-e51b-438e-9991-45d755c85826",
  "quote_id": "4ad3bf4e-6a29-473f-a3b1-1536a52cb956",
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
  "correlation_id": "63bb0ddf-e912-49b9-a117-e90aa8b4f179"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "5bc0a88f-cf75-4778-99eb-3fb41bbe8a4f",
      "short_number": 21,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "39d6f1e8-5c2c-4da3-a2be-7d8c0df388b0",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T12:19:54.127914Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T15:19:53Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "3c618ac8-8453-4364-99d9-b53953d2584c",
      "short_number": 20,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "39d6f1e8-5c2c-4da3-a2be-7d8c0df388b0",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T12:19:53.487263Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "6cc6bd4c-527d-4a34-8dfc-0bfe987222da",
      "short_number": 19,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "3c618ac8-8453-4364-99d9-b53953d2584c",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "39d6f1e8-5c2c-4da3-a2be-7d8c0df388b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:19:53.487263Z",
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

`GET /api/rider/v1/orders/6cc6bd4c-527d-4a34-8dfc-0bfe987222da` → **200**

```json
{
  "id": "6cc6bd4c-527d-4a34-8dfc-0bfe987222da",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "39d6f1e8-5c2c-4da3-a2be-7d8c0df388b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "b5961867-8d6d-455f-98d8-9d267a3f6600",
    "order_id": "6cc6bd4c-527d-4a34-8dfc-0bfe987222da",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "bcfd117c-1908-43bb-8d3f-9423373f4a65",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T12:19:51.954005Z",
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
    "location_at": "2026-10-30T12:19:50.722841Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/6cc6bd4c-527d-4a34-8dfc-0bfe987222da/cancel` → **200**

```json
{
  "command_id": "8c4438f5-5e46-404f-9e7e-9bb42bab4581",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6cc6bd4c-527d-4a34-8dfc-0bfe987222da",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "39d6f1e8-5c2c-4da3-a2be-7d8c0df388b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "b5961867-8d6d-455f-98d8-9d267a3f6600",
    "order_id": "6cc6bd4c-527d-4a34-8dfc-0bfe987222da",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "bcfd117c-1908-43bb-8d3f-9423373f4a65",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T12:19:51.954005Z",
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

`GET /api/rider/v1/orders/3c618ac8-8453-4364-99d9-b53953d2584c` → **200**

```json
{
  "id": "3c618ac8-8453-4364-99d9-b53953d2584c",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "39d6f1e8-5c2c-4da3-a2be-7d8c0df388b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:19:53.487263Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3c618ac8-8453-4364-99d9-b53953d2584c/cancel` → **200**

```json
{
  "command_id": "7a64a09a-343e-4c0c-b416-3212a17a2b4a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3c618ac8-8453-4364-99d9-b53953d2584c",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "39d6f1e8-5c2c-4da3-a2be-7d8c0df388b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:19:53.487263Z",
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

`GET /api/rider/v1/orders/5bc0a88f-cf75-4778-99eb-3fb41bbe8a4f` → **200**

```json
{
  "id": "5bc0a88f-cf75-4778-99eb-3fb41bbe8a4f",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "39d6f1e8-5c2c-4da3-a2be-7d8c0df388b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T12:19:54.127914Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T15:19:53Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5bc0a88f-cf75-4778-99eb-3fb41bbe8a4f/cancel` → **200**

```json
{
  "command_id": "9694fabb-e169-42a7-a7b1-d9b0a18c8e56",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5bc0a88f-cf75-4778-99eb-3fb41bbe8a4f",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "39d6f1e8-5c2c-4da3-a2be-7d8c0df388b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T12:19:54.127914Z",
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
  "pickup_at": "2026-10-30T15:19:53Z",
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
  "session_id": "d0f94ad3-52c3-4d88-aa72-5120ad88f79f",
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
  "last_heartbeat_at": "2026-10-30T12:19:50.722841Z",
  "last_location_at": "2026-10-30T12:19:50.722841Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d0f94ad3-52c3-4d88-aa72-5120ad88f79f/close` → **200**

```json
{
  "command_id": "e85716d3-0afa-4704-86e8-a58b801cac7f",
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

Done: orders 6cc6bd4c-527d-4a34-8dfc-0bfe987222da, 3c618ac8-8453-4364-99d9-b53953d2584c, 5bc0a88f-cf75-4778-99eb-3fb41bbe8a4f.

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
  "session_id": "9a56d4ad-5937-4965-8463-ada373419c9a",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM2OTgsImlhdCI6MTc5MzM2Mjc5OCwianRpIjoiYmYwOWNkMzQtNzY3OC00M2U3LWE0MzctYTk2YzA3ZWFjYThhIiwic2lkIjoiOWE1NmQ0YWQtNTkzNy00OTY1LTg0NjMtYWRhMzczNDE5YzlhIn0.onNQT4tUFhOYl74zclRIGaWeDFO_W8Rn5iIr-bxOfJA",
  "access_expires_at": "2026-10-30T12:34:58.437132301Z",
  "refresh_token": "ls9BRRlo9d418wG7ck7tBeBzaQ52El1SbEg0zxWtXK0",
  "refresh_expires_at": "2026-10-31T00:19:58.436454624Z",
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
  "session_id": "b1696bcc-c555-48a7-8ee5-c22b1fb6cc13",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM2OTksImlhdCI6MTc5MzM2Mjc5OSwianRpIjoiYWNjYmRlMDctMzQ1ZC00YjExLWExM2QtZmFjMjQyY2JiMTgyIiwic2lkIjoiYjE2OTZiY2MtYzU1NS00OGE3LThlZTUtYzIyYjFmYjZjYzEzIn0.Xc2Qm9L06ODxwiaib0egasWn_xbIkDgwkbUh0IqezYs",
  "access_expires_at": "2026-10-30T12:34:59.026547517Z",
  "refresh_token": "kXVVLchQTCtS9ArQP6Us5e3XnVsW-h39_wD6sjL259s",
  "refresh_expires_at": "2026-10-31T00:19:59.025986635Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21071"
}
```

```json
{
  "challenge_id": "8e313f93-f3c0-43d6-8090-a713ba3a8f7b",
  "expires_at": "2026-10-30T12:24:59.306588033Z",
  "resend_available_at": "2026-10-30T12:20:00.306588033Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "494574",
  "sent_at": "2026-10-30T12:19:59.309335986Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e313f93-f3c0-43d6-8090-a713ba3a8f7b",
  "code": "494574",
  "device_ref": "sandbox-21071"
}
```

```json
{
  "session_id": "0ddb4423-ed20-47aa-bf01-42526a6dbdbc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzY5OSwiaWF0IjoxNzkzMzYyNzk5LCJqdGkiOiI2NDA4M2I5ZS0wOWQ5LTQzOTctYWE5NC1iNzIzOWYxZmZiY2IiLCJzaWQiOiIwZGRiNDQyMy1lZDIwLTQ3YWEtYmYwMS00MjUyNmE2ZGJkYmMifQ.eBi9YLAbEjnfhtavJE6j73Q21d5axaGNx9Wr9TvLCEc",
  "access_expires_at": "2026-10-30T12:34:59.638971093Z",
  "refresh_token": "oPNcqcISXvwE5jLUk-8fL7enMX_1trXgcQYluIJCAog",
  "refresh_expires_at": "2026-11-29T12:19:59.638434997Z",
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
  "command_id": "f096d138-17e4-4974-99f5-d8999efeeac1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:20:00Z",
    "sequence": 1793362800232
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6f6351b-4dd5-40ae-b8f5-758d18a2a049",
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
  "last_heartbeat_at": "2026-10-30T12:20:00.250715Z",
  "last_location_at": "2026-10-30T12:20:00.250715Z",
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
  "command_id": "e3e99fb0-3a08-4b52-898d-d8a31398782e",
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
  "effective_at": "2026-10-30T12:20:00.855876Z",
  "changed_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T12:10:28.389239Z",
  "last_entries": [
    {
      "order_id": "68f00b41-9f1b-4940-8197-c441af18ab80",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T12:10:28.389239Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "01991156-41e0-4efd-911c-dfd8777ed56e",
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
  "id": "8bc6f603-0f91-4e75-9d33-4956ce5401a7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:25:01.442270Z",
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
  "command_id": "122b083c-dcda-4a2b-9757-fa34b66bb7b6",
  "quote_id": "8bc6f603-0f91-4e75-9d33-4956ce5401a7",
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
    "phone": "+3806711113477"
  }
}
```

```json
{
  "id": "a0f17d14-2580-4d8a-bd6a-ae21b6e9a385",
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
  "created_at": "2026-10-30T12:20:01.746759Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113477"
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
    "id": "17c7a122-2041-4dcc-9473-9d2af3f04643",
    "order_id": "a0f17d14-2580-4d8a-bd6a-ae21b6e9a385",
    "expires_at": "2026-10-30T12:20:16.750344Z",
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

`POST /api/driver/v1/offers/17c7a122-2041-4dcc-9473-9d2af3f04643/accept` → **200**

```json
{
  "command_id": "4b030aba-6102-4bd1-8509-a7b71df04e55"
}
```

```json
{
  "id": "93f43656-b9bf-4245-a8d2-549c5829b4b8",
  "order_id": "a0f17d14-2580-4d8a-bd6a-ae21b6e9a385",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a03cc840-c9cb-4cec-9085-51c61d1e2c82",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a03cc840-c9cb-4cec-9085-51c61d1e2c82",
  "order_id": "a0f17d14-2580-4d8a-bd6a-ae21b6e9a385",
  "assignment_id": "93f43656-b9bf-4245-a8d2-549c5829b4b8",
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
    "phone": "+3806711113477"
  }
}
```

`POST /api/driver/v1/work-sessions/d6f6351b-4dd5-40ae-b8f5-758d18a2a049/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:20:02Z",
    "sequence": 1793362802946
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6f6351b-4dd5-40ae-b8f5-758d18a2a049",
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
  "last_heartbeat_at": "2026-10-30T12:20:02.964632Z",
  "last_location_at": "2026-10-30T12:20:02.964632Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a03cc840-c9cb-4cec-9085-51c61d1e2c82/arrive` → **200**

```json
{
  "command_id": "3c695a7e-d7d5-4253-97a6-6b2bfb7b0a4b",
  "expected_version": 0
}
```

```json
{
  "id": "a03cc840-c9cb-4cec-9085-51c61d1e2c82",
  "order_id": "a0f17d14-2580-4d8a-bd6a-ae21b6e9a385",
  "assignment_id": "93f43656-b9bf-4245-a8d2-549c5829b4b8",
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
  "arrived_at": "2026-10-30T12:20:03.26838Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711113477"
  }
}
```

`POST /api/driver/v1/trips/a03cc840-c9cb-4cec-9085-51c61d1e2c82/start` → **200**

```json
{
  "command_id": "a0654032-8878-4b61-b48b-70701cb6d4d1",
  "expected_version": 1
}
```

```json
{
  "id": "a03cc840-c9cb-4cec-9085-51c61d1e2c82",
  "order_id": "a0f17d14-2580-4d8a-bd6a-ae21b6e9a385",
  "assignment_id": "93f43656-b9bf-4245-a8d2-549c5829b4b8",
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
  "arrived_at": "2026-10-30T12:20:03.26838Z",
  "started_at": "2026-10-30T12:20:03.582591Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711113477"
  }
}
```

`POST /api/driver/v1/trips/a03cc840-c9cb-4cec-9085-51c61d1e2c82/complete` → **200**

```json
{
  "command_id": "38361cc2-81b0-44a2-9291-07465d00a5b4",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:20:03Z",
  "cash_received": true
}
```

```json
{
  "id": "a03cc840-c9cb-4cec-9085-51c61d1e2c82",
  "order_id": "a0f17d14-2580-4d8a-bd6a-ae21b6e9a385",
  "assignment_id": "93f43656-b9bf-4245-a8d2-549c5829b4b8",
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
  "arrived_at": "2026-10-30T12:20:03.26838Z",
  "started_at": "2026-10-30T12:20:03.582591Z",
  "completed_at": "2026-10-30T12:20:03.891221Z",
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
  "command_id": "45598ef6-3c5c-4174-9680-03e3f28c4057",
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
  "id": "1e6abc2c-3672-4d4d-ad51-f6ed4212b659",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:25:04.195761Z",
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
  "command_id": "997ce808-fbe8-4716-ade6-87243a9d9b8d",
  "quote_id": "1e6abc2c-3672-4d4d-ad51-f6ed4212b659",
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
    "phone": "+3806711128056"
  }
}
```

```json
{
  "id": "8ee12565-247d-4724-bca7-058598ead6cb",
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
  "created_at": "2026-10-30T12:20:04.4981Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128056"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/8ee12565-247d-4724-bca7-058598ead6cb` → **200**

```json
{
  "id": "8ee12565-247d-4724-bca7-058598ead6cb",
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
  "created_at": "2026-10-30T12:20:04.4981Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128056"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8ee12565-247d-4724-bca7-058598ead6cb/cancel` → **200**

```json
{
  "command_id": "865d018a-428f-46fc-8c54-2911eef3206c",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "8ee12565-247d-4724-bca7-058598ead6cb",
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
  "created_at": "2026-10-30T12:20:04.4981Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128056"
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
  "staff_id": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T12:10:28.389239Z",
  "last_entries": [
    {
      "order_id": "8ee12565-247d-4724-bca7-058598ead6cb",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T12:20:05.168628Z"
    },
    {
      "order_id": "a0f17d14-2580-4d8a-bd6a-ae21b6e9a385",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T12:20:03.896087Z"
    },
    {
      "order_id": "68f00b41-9f1b-4940-8197-c441af18ab80",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T12:10:28.389239Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6f6351b-4dd5-40ae-b8f5-758d18a2a049",
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
  "last_heartbeat_at": "2026-10-30T12:20:02.964632Z",
  "last_location_at": "2026-10-30T12:20:02.964632Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d6f6351b-4dd5-40ae-b8f5-758d18a2a049/close` → **200**

```json
{
  "command_id": "e5f5058e-2b27-46a3-9123-bf12493d57df",
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

Done: operator bonus for fulfilled a0f17d14-2580-4d8a-bd6a-ae21b6e9a385 and operator-fault cancellation 8ee12565-247d-4724-bca7-058598ead6cb.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676198640",
  "device_ref": "sandbox-11386"
}
```

```json
{
  "challenge_id": "da91520e-4598-4bb0-89f4-e1f8c6fd1ef1",
  "expires_at": "2026-10-30T12:25:09.597866802Z",
  "resend_available_at": "2026-10-30T12:20:10.597866802Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676198640` → **200**

```json
{
  "phone": "+380676198640",
  "audience": "CLIENT",
  "code": "982460",
  "sent_at": "2026-10-30T12:20:09.659171369Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679284471",
  "device_ref": "sandbox-26835",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "7b87d91d-9288-409f-a079-256e1454da61",
  "expires_at": "2026-10-30T12:25:11.182207853Z",
  "resend_available_at": "2026-10-30T12:20:12.182207853Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679284471` → **200**

```json
{
  "phone": "+380679284471",
  "audience": "CLIENT",
  "code": "663489",
  "sent_at": "2026-10-30T12:20:11.184559225Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679284471",
  "device_ref": "sandbox-31092",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b7513943-26d2-466a-b402-e80f43b57829",
  "expires_at": "2026-10-30T12:25:12.697687966Z",
  "resend_available_at": "2026-10-30T12:20:13.697687966Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679284471` → **200**

```json
{
  "phone": "+380679284471",
  "audience": "CLIENT",
  "code": "236081",
  "sent_at": "2026-10-30T12:20:12.700692932Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675090000",
  "device_ref": "sandbox-417"
}
```

```json
{
  "challenge_id": "bd237dbf-f85f-4143-b15d-ace2ee08931b",
  "expires_at": "2026-10-30T12:25:14.210277482Z",
  "resend_available_at": "2026-10-30T12:20:15.210277482Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675090000",
  "device_ref": "sandbox-3203"
}
```

```json
{
  "challenge_id": "7e71709c-916c-404d-bb4c-a3b296dca212",
  "expires_at": "2026-10-30T12:25:15.701587698Z",
  "resend_available_at": "2026-10-30T12:20:16.701587698Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675090000` → **200**

```json
{
  "phone": "+380675090000",
  "audience": "CLIENT",
  "code": "543297",
  "sent_at": "2026-10-30T12:20:15.704938628Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675090000",
  "device_ref": "sandbox-9794",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "c3ea90f2-7eaa-4267-9c6b-746c1c9cbdf3",
  "expires_at": "2026-10-30T12:25:17.226338225Z",
  "resend_available_at": "2026-10-30T12:20:18.226338225Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675090000` → **200**

```json
{
  "phone": "+380675090000",
  "audience": "CLIENT",
  "code": "266328",
  "sent_at": "2026-10-30T12:20:17.229088734Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380675090000",
  "device_ref": "sandbox-21760",
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
  "correlation_id": "e949f9de-60eb-45f9-a93f-f6a77849bb67",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000001943"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "5f82a4c3-18be-483c-a405-9612b91d40a3"
}
```

`GET /sandbox/v1/otp?phone=%2B442000001943` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120031912"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "bbf0ac67-c12f-4f58-9679-3e020170b485"
}
```

`GET /sandbox/v1/otp?phone=%2B37120031912` → **404**

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
  "session_id": "c773d2eb-8eee-4ca2-931d-ed9d967d9e33",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM3MTksImlhdCI6MTc5MzM2MjgxOSwianRpIjoiM2UxYTU0ZTEtNGY3Ni00ZjI0LTk5YTEtYmNlMzYzNmU4OTM4Iiwic2lkIjoiYzc3M2QyZWItOGVlZS00Y2EyLTkzMWQtZWQ5ZDk2N2Q5ZTMzIn0.7aRSacyjvKTdsXgV3sJe96mus0neDtxHCnsLBB3ScoU",
  "access_expires_at": "2026-10-30T12:35:19.958600986Z",
  "refresh_token": "OY7c2bCuYHyR5ctV3Q3q_Em5HjQyczr4fSchOUK8VVw",
  "refresh_expires_at": "2026-10-31T00:20:19.957992073Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675090000` → **200**

```json
{
  "deliveries": [
    {
      "id": "b6cd70ea-1bbb-48bb-b7ed-955d310901a9",
      "challenge_id": "c3ea90f2-7eaa-4267-9c6b-746c1c9cbdf3",
      "phone": "+380675090000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-c09f15d2-0f05-4df1-9790-94c983886f14",
      "error": null,
      "attempted_at": "2026-10-30T12:20:17.229545Z"
    },
    {
      "id": "14d39340-674f-40be-92dd-90c9c4dcfb0e",
      "challenge_id": "7e71709c-916c-404d-bb4c-a3b296dca212",
      "phone": "+380675090000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-07781d71-4f49-400b-8abd-f16fc161aa02",
      "error": null,
      "attempted_at": "2026-10-30T12:20:15.705192Z"
    },
    {
      "id": "66ef69a0-7a68-4df2-9ead-46e8a1d44a51",
      "challenge_id": "bd237dbf-f85f-4143-b15d-ace2ee08931b",
      "phone": "+380675090000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T12:20:14.212922Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380675090000` → **200**

```json
{
  "phone": "+380675090000",
  "audience": "CLIENT",
  "code": "266328",
  "sent_at": "2026-10-30T12:20:17.229088734Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679284471` → **200**

```json
{
  "deliveries": [
    {
      "id": "6b262c8a-b438-40e2-83b4-5467e9954294",
      "challenge_id": "b7513943-26d2-466a-b402-e80f43b57829",
      "phone": "+380679284471",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-191824db-07e7-4d62-8d35-680321e21b25",
      "error": null,
      "attempted_at": "2026-10-30T12:20:12.7011Z"
    },
    {
      "id": "d1c0195b-6b83-47bb-8497-366b26f7c10e",
      "challenge_id": "7b87d91d-9288-409f-a079-256e1454da61",
      "phone": "+380679284471",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-2b343a96-3236-4868-bc70-034dad1021d5",
      "error": null,
      "attempted_at": "2026-10-30T12:20:11.184983Z"
    }
  ]
}
```

Done: SMS to +380676198640; SMS then a call to +380679284471; a failed SMS, two calls and a refused third to +380675090000; +44 and +371 refused.

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
  "session_id": "0a67852c-6db1-4657-bd95-2366a39263a7",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM3MjEsImlhdCI6MTc5MzM2MjgyMSwianRpIjoiMGYwMjA2NjktMTlmYS00OGM1LTllMGItMmFiZjc4OTY2ZjhiIiwic2lkIjoiMGE2Nzg1MmMtNmRiMS00NjU3LWJkOTUtMjM2NmEzOTI2M2E3In0.ie071C9WS3oVkAkI-ops-oFU2ztHS8eTePV-K3XhQBA",
  "access_expires_at": "2026-10-30T12:35:21.193871153Z",
  "refresh_token": "KKtqT3Fw0nwZfjF8Oynq9MRzzF5yw3Rv1lFtr_e8J5A",
  "refresh_expires_at": "2026-10-31T00:20:21.193108091Z",
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
  "session_id": "f9454405-e00c-4bdf-9e54-5d3d9ffaa8bd",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM3MjEsImlhdCI6MTc5MzM2MjgyMSwianRpIjoiZTQ4NzM4N2QtM2JlZC00M2U3LWFkYjQtMjhlZWExYzQwMGUzIiwic2lkIjoiZjk0NTQ0MDUtZTAwYy00YmRmLTllNTQtNWQzZDlmZmFhOGJkIn0.IjwIoKuW1hnV66JGLgl6Zb96hu6rP-6BZ0fOpGQ6msM",
  "access_expires_at": "2026-10-30T12:35:21.798273298Z",
  "refresh_token": "Dd4oRUz6Nxdm-JZtcNsfHPvoYEv3dJ1MYvTaa8MpyCk",
  "refresh_expires_at": "2026-10-31T00:20:21.797651381Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e",
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

`POST /api/admin/v1/staff-extensions/c2b31b2b-8610-441e-a39e-de6e6485310e` → **200**

```json
{
  "command_id": "cfb01e47-b973-4bf6-a455-e234ea0e222f",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "5015f6dd-4d5b-47d1-a127-59a35d210a6c",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T12:20:22.962517Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T12:20:22.962517Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "64c8941a-9375-44bc-b40a-c0eb078a5644",
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
  "id": "cf62369b-3fb7-4ba0-b405-be6d088dcd59",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:25:23.544332Z",
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
  "command_id": "56ad4397-37b1-42b8-9f74-3104c92005c8",
  "quote_id": "cf62369b-3fb7-4ba0-b405-be6d088dcd59",
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
    "phone": "+380673114379"
  }
}
```

```json
{
  "id": "f1c1baa6-95ff-4c34-b4d0-e65e37c39f20",
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
  "created_at": "2026-10-30T12:20:23.842815Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673114379"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/f1c1baa6-95ff-4c34-b4d0-e65e37c39f20/calls` → **201**

```json
{
  "command_id": "6ba255b7-70f2-44a6-99b6-addfdb8f5866",
  "to": "CALLER"
}
```

```json
{
  "id": "0c00d0c8-c0b3-4b3d-b6c2-fbf976545ffa",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "order_ids": [
    "f1c1baa6-95ff-4c34-b4d0-e65e37c39f20"
  ],
  "started_at": "2026-10-30T12:20:24.183866Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/f1c1baa6-95ff-4c34-b4d0-e65e37c39f20/calls` → **201**

```json
{
  "command_id": "6ba255b7-70f2-44a6-99b6-addfdb8f5866",
  "to": "CALLER"
}
```

```json
{
  "id": "0c00d0c8-c0b3-4b3d-b6c2-fbf976545ffa",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "order_ids": [
    "f1c1baa6-95ff-4c34-b4d0-e65e37c39f20"
  ],
  "started_at": "2026-10-30T12:20:24.183866Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "0c00d0c8-c0b3-4b3d-b6c2-fbf976545ffa",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380673114379",
    "at": "2026-10-30T12:20:24.186100474Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "0c00d0c8-c0b3-4b3d-b6c2-fbf976545ffa",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.11839",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "0c00d0c8-c0b3-4b3d-b6c2-fbf976545ffa"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "0c00d0c8-c0b3-4b3d-b6c2-fbf976545ffa",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=f1c1baa6-95ff-4c34-b4d0-e65e37c39f20` → **200**

```json
{
  "calls": [
    {
      "id": "0c00d0c8-c0b3-4b3d-b6c2-fbf976545ffa",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
      "order_ids": [
        "f1c1baa6-95ff-4c34-b4d0-e65e37c39f20"
      ],
      "started_at": "2026-10-30T12:20:24.183866Z",
      "answered_at": "2026-10-30T12:20:24.87513Z",
      "ended_at": "2026-10-30T12:20:24.899201Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=f1c1baa6-95ff-4c34-b4d0-e65e37c39f20` → **200**

```json
{
  "calls": [
    {
      "id": "0c00d0c8-c0b3-4b3d-b6c2-fbf976545ffa",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
      "order_ids": [
        "f1c1baa6-95ff-4c34-b4d0-e65e37c39f20"
      ],
      "started_at": "2026-10-30T12:20:24.183866Z",
      "answered_at": "2026-10-30T12:20:24.87513Z",
      "ended_at": "2026-10-30T12:20:24.899201Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=f1c1baa6-95ff-4c34-b4d0-e65e37c39f20` → **200**

```json
{
  "calls": [
    {
      "id": "0c00d0c8-c0b3-4b3d-b6c2-fbf976545ffa",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
      "order_ids": [
        "f1c1baa6-95ff-4c34-b4d0-e65e37c39f20"
      ],
      "started_at": "2026-10-30T12:20:24.183866Z",
      "answered_at": "2026-10-30T12:20:24.87513Z",
      "ended_at": "2026-10-30T12:20:24.899201Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T12:20:28.70778Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/f1c1baa6-95ff-4c34-b4d0-e65e37c39f20` → **200**

```json
{
  "id": "f1c1baa6-95ff-4c34-b4d0-e65e37c39f20",
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
  "created_at": "2026-10-30T12:20:23.842815Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673114379"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f1c1baa6-95ff-4c34-b4d0-e65e37c39f20/cancel` → **200**

```json
{
  "command_id": "7380c7c8-8fef-474a-b213-9713c798d819",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "f1c1baa6-95ff-4c34-b4d0-e65e37c39f20",
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
  "created_at": "2026-10-30T12:20:23.842815Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673114379"
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
  "command_id": "46d42fa2-0df3-47f6-9b3d-cc0f9f685694",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T12:20:30.481194Z",
  "extension": "101"
}
```

Done: outgoing call 0c00d0c8-c0b3-4b3d-b6c2-fbf976545ffa from order f1c1baa6-95ff-4c34-b4d0-e65e37c39f20, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637307381",
  "device_ref": "sandbox-23725"
}
```

```json
{
  "challenge_id": "3efd667d-c508-4afe-9519-68b78f181270",
  "expires_at": "2026-10-30T12:25:30.771404743Z",
  "resend_available_at": "2026-10-30T12:20:31.771404743Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637307381` → **200**

```json
{
  "phone": "+380637307381",
  "audience": "CLIENT",
  "code": "708746",
  "sent_at": "2026-10-30T12:20:30.774171673Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3efd667d-c508-4afe-9519-68b78f181270",
  "code": "708746",
  "device_ref": "sandbox-23725"
}
```

```json
{
  "session_id": "92dfee8e-30ef-4ece-9014-0d12b0e92898",
  "subject": {
    "type": "CLIENT",
    "id": "1b518d2b-5c10-4aae-a44c-10937e7a313b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYjUxOGQyYi01YzEwLTRhYWUtYTQ0Yy0xMDkzN2U3YTMxM2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzNzMxLCJpYXQiOjE3OTMzNjI4MzEsImp0aSI6ImY1N2QwODk1LTg5YWUtNDBiZi1iN2E1LTE5M2NmYTkzOTA4ZSIsInNpZCI6IjkyZGZlZThlLTMwZWYtNGVjZS05MDE0LTBkMTJiMGU5Mjg5OCJ9.PBWttaqQk-HwLB3OP7IYByxXP0JpNwp0jkR0ncRw1r8",
  "access_expires_at": "2026-10-30T12:35:31.087454832Z",
  "refresh_token": "ATA-URjB_g2_5xd7hITA7dKN-olqfDMoHs4eLNwF9qo",
  "refresh_expires_at": "2026-11-29T12:20:31.086884232Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1b518d2b-5c10-4aae-a44c-10937e7a313b",
  "session_id": "92dfee8e-30ef-4ece-9014-0d12b0e92898",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637307381",
  "device_ref": "sandbox-25733"
}
```

```json
{
  "challenge_id": "8f1d3aab-208b-45e3-98b9-c74f5b24cb66",
  "expires_at": "2026-10-30T12:25:33.653916466Z",
  "resend_available_at": "2026-10-30T12:20:34.653916466Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637307381` → **200**

```json
{
  "phone": "+380637307381",
  "audience": "CLIENT",
  "code": "652327",
  "sent_at": "2026-10-30T12:20:33.656542164Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f1d3aab-208b-45e3-98b9-c74f5b24cb66",
  "code": "652327",
  "device_ref": "sandbox-25733"
}
```

```json
{
  "session_id": "0364f011-718e-4fcc-8fa1-5eb86197bf4b",
  "subject": {
    "type": "CLIENT",
    "id": "1b518d2b-5c10-4aae-a44c-10937e7a313b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYjUxOGQyYi01YzEwLTRhYWUtYTQ0Yy0xMDkzN2U3YTMxM2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzNzMzLCJpYXQiOjE3OTMzNjI4MzMsImp0aSI6IjUxMTNlZGRiLTJhYTMtNDBkYS1iMjIxLTM0YzI4M2I0ZmFlYSIsInNpZCI6IjAzNjRmMDExLTcxOGUtNGZjYy04ZmExLTVlYjg2MTk3YmY0YiJ9.Hfave-uTYe4a8dlTJ1ssPdxLXIR-UE4PtWeoVdaBJvw",
  "access_expires_at": "2026-10-30T12:35:33.975670831Z",
  "refresh_token": "OJKQnLww6hGwmueQ_ZZOcNWbZFQ2Hys8Sd8KMeKryWc",
  "refresh_expires_at": "2026-11-29T12:20:33.975088439Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "00bc0341-9fc1-4a00-b864-932b078a2432",
  "expires_at": "2026-10-30T12:25:36.273739025Z",
  "resend_available_at": "2026-10-30T12:20:37.273739025Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637307381` → **200**

```json
{
  "phone": "+380637307381",
  "audience": "CLIENT",
  "code": "079762",
  "sent_at": "2026-10-30T12:20:36.276391114Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380630940078"
}
```

```json
{
  "challenge_id": "d23335d4-8e22-4cb6-86ca-8e52a9299ce6",
  "expires_at": "2026-10-30T12:25:36.583704632Z",
  "resend_available_at": "2026-10-30T12:20:37.583704632Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630940078` → **200**

```json
{
  "phone": "+380630940078",
  "audience": "CLIENT",
  "code": "544996",
  "sent_at": "2026-10-30T12:20:36.586050548Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "b0f6abe6-28c6-46b9-95b1-7bceb14e2c4f",
  "current_challenge_id": "00bc0341-9fc1-4a00-b864-932b078a2432",
  "current_code": "000000",
  "new_challenge_id": "d23335d4-8e22-4cb6-86ca-8e52a9299ce6",
  "new_code": "544996"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "cd983c15-2edc-4532-9ba2-ae0b7de8f3d7"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "69cef8df-a75e-4fff-aea1-36226262fb4e",
  "current_challenge_id": "00bc0341-9fc1-4a00-b864-932b078a2432",
  "current_code": "079762",
  "new_challenge_id": "d23335d4-8e22-4cb6-86ca-8e52a9299ce6",
  "new_code": "544996"
}
```

```json
{
  "subject_id": "1b518d2b-5c10-4aae-a44c-10937e7a313b",
  "phone": "+380630940078",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1b518d2b-5c10-4aae-a44c-10937e7a313b",
  "session_id": "92dfee8e-30ef-4ece-9014-0d12b0e92898",
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
  "correlation_id": "051afc3f-d80e-4a6a-aafb-fbeb27d29ea8"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630940078",
  "device_ref": "sandbox-22941"
}
```

```json
{
  "challenge_id": "99e0593e-e5f1-48ca-ab25-de6ecb38a1df",
  "expires_at": "2026-10-30T12:25:40.066048195Z",
  "resend_available_at": "2026-10-30T12:20:41.066048195Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630940078` → **200**

```json
{
  "phone": "+380630940078",
  "audience": "CLIENT",
  "code": "060881",
  "sent_at": "2026-10-30T12:20:40.068914584Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "99e0593e-e5f1-48ca-ab25-de6ecb38a1df",
  "code": "060881",
  "device_ref": "sandbox-22941"
}
```

```json
{
  "session_id": "14b6ac44-2c33-4364-af9d-3bda3b863a32",
  "subject": {
    "type": "CLIENT",
    "id": "1b518d2b-5c10-4aae-a44c-10937e7a313b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYjUxOGQyYi01YzEwLTRhYWUtYTQ0Yy0xMDkzN2U3YTMxM2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzNzQwLCJpYXQiOjE3OTMzNjI4NDAsImp0aSI6ImQ4ZmU2NzNmLTVkY2EtNDkzNy04MDJhLWNiYWYxODk4MGRjYSIsInNpZCI6IjE0YjZhYzQ0LTJjMzMtNDM2NC1hZjlkLTNiZGEzYjg2M2EzMiJ9.UPcixn9lZ2J5rmyuOSh41GWcpA_XPC8o2CfAYbJ-re4",
  "access_expires_at": "2026-10-30T12:35:40.426511268Z",
  "refresh_token": "WsIHbVix-80WE85CAapiR1MMjGqyJiYLgjKoqH1P3f8",
  "refresh_expires_at": "2026-11-29T12:20:40.425847508Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1b518d2b-5c10-4aae-a44c-10937e7a313b",
  "session_id": "14b6ac44-2c33-4364-af9d-3bda3b863a32",
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
  "session_id": "3c04401f-0b2d-4b17-a5e8-12d1f2c24884",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM3NDEsImlhdCI6MTc5MzM2Mjg0MSwianRpIjoiNGZkNTEzZWMtODRlYi00MWE1LWIzMTYtZjdmMTk1MTgzZGQ2Iiwic2lkIjoiM2MwNDQwMWYtMGIyZC00YjE3LWE1ZTgtMTJkMWYyYzI0ODg0In0.uMg7qBkZwJgoAYgv76tG1VEC_0KbtknHgTbxTOqusEk",
  "access_expires_at": "2026-10-30T12:35:41.295144Z",
  "refresh_token": "N1X1R41uPst1D0KEraIBonyXYN_stiT8jo0N--7dM4U",
  "refresh_expires_at": "2026-10-31T00:20:41.294579634Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/1b518d2b-5c10-4aae-a44c-10937e7a313b` → **200**

```json
{
  "client": {
    "id": "1b518d2b-5c10-4aae-a44c-10937e7a313b",
    "phone": "+380630940078",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:20:31.085267Z",
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

`POST /api/admin/v1/clients/1b518d2b-5c10-4aae-a44c-10937e7a313b/phone/new-code` → **201**

```json
{
  "phone": "+380633191497"
}
```

```json
{
  "challenge_id": "4551b42d-0563-43b0-a86f-227ec229a0d2",
  "expires_at": "2026-10-30T12:25:41.926164972Z",
  "resend_available_at": "2026-10-30T12:20:42.926164972Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633191497` → **200**

```json
{
  "phone": "+380633191497",
  "audience": "CLIENT",
  "code": "589046",
  "sent_at": "2026-10-30T12:20:41.928862436Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/1b518d2b-5c10-4aae-a44c-10937e7a313b/phone` → **422**

```json
{
  "command_id": "4f617041-668c-4b24-9c4e-47814f6208d6",
  "expected_version": 3,
  "new_challenge_id": "4551b42d-0563-43b0-a86f-227ec229a0d2",
  "new_code": "589047",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/1b518d2b-5c10-4aae-a44c-10937e7a313b/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "2804deb7-3926-4429-be9b-e06470d86eaf"
}
```

`POST /api/admin/v1/clients/1b518d2b-5c10-4aae-a44c-10937e7a313b/phone` → **400**

```json
{
  "command_id": "9ac2c354-0a2a-48cd-bf49-1ec544cf668b",
  "expected_version": 3,
  "new_challenge_id": "4551b42d-0563-43b0-a86f-227ec229a0d2",
  "new_code": "589046",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/1b518d2b-5c10-4aae-a44c-10937e7a313b/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "062fd483-324f-4cce-9580-4c9301ffe06f",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/1b518d2b-5c10-4aae-a44c-10937e7a313b/phone` → **200**

```json
{
  "command_id": "a3c5c9d7-bac0-44b9-b479-7ea46322fd91",
  "expected_version": 3,
  "new_challenge_id": "4551b42d-0563-43b0-a86f-227ec229a0d2",
  "new_code": "589046",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "1b518d2b-5c10-4aae-a44c-10937e7a313b",
  "phone": "+380633191497",
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
  "correlation_id": "7d0f42d2-7c90-4d9a-b53e-03bd5bcebfdd"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633191497",
  "device_ref": "sandbox-4784"
}
```

```json
{
  "challenge_id": "e26fa2c9-a05f-4094-98f4-5c7f6e6dee82",
  "expires_at": "2026-10-30T12:25:43.429723344Z",
  "resend_available_at": "2026-10-30T12:20:44.429723344Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633191497` → **200**

```json
{
  "phone": "+380633191497",
  "audience": "CLIENT",
  "code": "580930",
  "sent_at": "2026-10-30T12:20:43.432266505Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e26fa2c9-a05f-4094-98f4-5c7f6e6dee82",
  "code": "580930",
  "device_ref": "sandbox-4784"
}
```

```json
{
  "session_id": "04523aeb-4d26-41bf-985d-ec7323de5cc2",
  "subject": {
    "type": "CLIENT",
    "id": "1b518d2b-5c10-4aae-a44c-10937e7a313b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYjUxOGQyYi01YzEwLTRhYWUtYTQ0Yy0xMDkzN2U3YTMxM2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzNzQzLCJpYXQiOjE3OTMzNjI4NDMsImp0aSI6IjU5YzJjN2VlLTczNDItNDk1NC04ZjViLWU4NGVjZGViYzE2YSIsInNpZCI6IjA0NTIzYWViLTRkMjYtNDFiZi05ODVkLWVjNzMyM2RlNWNjMiJ9.H5Uy3dBVr1cWYyDtidbxti0MyU1AKm2WXS200ITT0yI",
  "access_expires_at": "2026-10-30T12:35:43.742044484Z",
  "refresh_token": "6IYwp7mWo3Fnrh9SnMbsfGdYuHKCQUveQjN-tlEImqY",
  "refresh_expires_at": "2026-11-29T12:20:43.741527424Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1b518d2b-5c10-4aae-a44c-10937e7a313b",
  "session_id": "04523aeb-4d26-41bf-985d-ec7323de5cc2",
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
  "phone": "+380631444847",
  "device_ref": "sandbox-8573"
}
```

```json
{
  "challenge_id": "f4fc94e1-8d55-4223-9a51-13cb3e722151",
  "expires_at": "2026-10-30T12:25:44.319609087Z",
  "resend_available_at": "2026-10-30T12:20:45.319609087Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631444847` → **200**

```json
{
  "phone": "+380631444847",
  "audience": "CLIENT",
  "code": "140093",
  "sent_at": "2026-10-30T12:20:44.322150064Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f4fc94e1-8d55-4223-9a51-13cb3e722151",
  "code": "140093",
  "device_ref": "sandbox-8573"
}
```

```json
{
  "session_id": "8647efbf-95a3-4718-bf28-4877568f10f1",
  "subject": {
    "type": "CLIENT",
    "id": "a86b2bab-7bf9-49cd-bb9a-d85f2f329679"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODZiMmJhYi03YmY5LTQ5Y2QtYmI5YS1kODVmMmYzMjk2NzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzNzQ0LCJpYXQiOjE3OTMzNjI4NDQsImp0aSI6IjZmM2U3ZWM5LWQxYzQtNDAzYi1iYzg0LTBmYzUwZmI1YTJkZCIsInNpZCI6Ijg2NDdlZmJmLTk1YTMtNDcxOC1iZjI4LTQ4Nzc1NjhmMTBmMSJ9.uSGt9kG3LMhIBzRW4U1U9VBYppMTWsTZv5GiKt5xh-M",
  "access_expires_at": "2026-10-30T12:35:44.631794702Z",
  "refresh_token": "MUbFOF90JAekAbFdEn7DjlmZ6bk3yp1YmohioIOAums",
  "refresh_expires_at": "2026-11-29T12:20:44.631230915Z",
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
  "session_id": "9137d8e2-4cd7-490b-a9cb-ca346c394b90",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM3NDUsImlhdCI6MTc5MzM2Mjg0NSwianRpIjoiMGVkYzIwOWQtNmY5Zi00MWNkLWE4ZWQtZGVkOWRiZDQ2NmRjIiwic2lkIjoiOTEzN2Q4ZTItNGNkNy00OTBiLWE5Y2ItY2EzNDZjMzk0YjkwIn0.-7D9InDBa_Av1llHoAZEhCH-oB9yOOK_TxRWcobOymM",
  "access_expires_at": "2026-10-30T12:35:45.828496955Z",
  "refresh_token": "um6fgnOgM6JAamAdXlkRnoKWuNi0XAWJij6SDNHCMWE",
  "refresh_expires_at": "2026-10-31T00:20:45.827911614Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380631444847` → **200**

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
  "correlation_id": "1434addf-466c-4913-bb4b-5a6b4cd52545"
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
  "session_id": "e057ef04-6bd9-4acb-a0c8-ea7c9d93c679",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM3NDYsImlhdCI6MTc5MzM2Mjg0NiwianRpIjoiNzhhNTdkZjgtMjA4ZC00YzdkLWIxMGEtNmU3MmVmOWZkMGVkIiwic2lkIjoiZTA1N2VmMDQtNmJkOS00YWNiLWEwYzgtZWE3YzlkOTNjNjc5In0.ZFBLTPxqS8OohQ2AD7_f9MmdM6fumHEVR2aFFpuciHk",
  "access_expires_at": "2026-10-30T12:35:46.989001887Z",
  "refresh_token": "LkqmrCTLFgg2Zpt6cfQU75wZGOo4bWjAIrWihcDojwA",
  "refresh_expires_at": "2026-10-31T00:20:46.988472103Z",
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
  "changed_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T12:06:26.567632Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "6f348b39-cc84-4ae9-84a4-b4781dd29b38",
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
  "changed_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T12:20:47.572464406Z"
}
```

## The rider books the airport for 2026-10-30T15:20:46Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600009134",
  "device_ref": "sandbox-7541"
}
```

```json
{
  "challenge_id": "028ce600-3f23-4bdc-a234-5743a98faf4f",
  "expires_at": "2026-10-30T12:25:47.886368195Z",
  "resend_available_at": "2026-10-30T12:20:48.886368195Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600009134` → **200**

```json
{
  "phone": "+48600009134",
  "audience": "CLIENT",
  "code": "205265",
  "sent_at": "2026-10-30T12:20:47.889101749Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "028ce600-3f23-4bdc-a234-5743a98faf4f",
  "code": "205265",
  "device_ref": "sandbox-7541"
}
```

```json
{
  "session_id": "be0cf161-8fde-418c-9f1a-16a926f23b44",
  "subject": {
    "type": "CLIENT",
    "id": "458e575c-8fd2-41a7-aaf6-f3615a7929d3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NThlNTc1Yy04ZmQyLTQxYTctYWFmNi1mMzYxNWE3OTI5ZDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzNzQ4LCJpYXQiOjE3OTMzNjI4NDgsImp0aSI6ImE5MzNkNzQxLTllNTAtNGQ3Mi1iYmJhLWI0N2M5NmM0ZjBhYSIsInNpZCI6ImJlMGNmMTYxLThmZGUtNDE4Yy05ZjFhLTE2YTkyNmYyM2I0NCJ9.JQdKL_vxHmPu5bEI1CZSLATdLuCPXNnf9MANChHXjKQ",
  "access_expires_at": "2026-10-30T12:35:48.207346482Z",
  "refresh_token": "XzTMFjjBwsay5iMvBcov8lMA2p8oA-GYM0cQ546HFD0",
  "refresh_expires_at": "2026-11-29T12:20:48.206813893Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ee05dece-b564-4a8c-bba8-14b224aac681",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T15:20:46Z"
}
```

```json
{
  "id": "eaed4500-8928-412b-b16c-c60fdd3996a5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:25:48.499805Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T15:20:46Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "e97a3530-cd5e-47f2-9634-533cdb1ff77a",
  "quote_id": "eaed4500-8928-412b-b16c-c60fdd3996a5",
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
  "pickup_at": "2026-10-30T15:20:46Z"
}
```

```json
{
  "id": "c2036327-ff43-4a18-a01e-154c68373d6c",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "458e575c-8fd2-41a7-aaf6-f3615a7929d3",
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
  "created_at": "2026-10-30T12:20:48.797653Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T15:20:46Z",
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
  "device_ref": "sandbox-4154"
}
```

```json
{
  "challenge_id": "7109f6d3-751a-4d3c-bf6a-846806a9d4a2",
  "expires_at": "2026-10-30T12:25:49.102764531Z",
  "resend_available_at": "2026-10-30T12:20:50.102764531Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "869134",
  "sent_at": "2026-10-30T12:20:49.105456641Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7109f6d3-751a-4d3c-bf6a-846806a9d4a2",
  "code": "869134",
  "device_ref": "sandbox-4154"
}
```

```json
{
  "session_id": "65098f7a-7c52-4498-a1a1-75d91d295abe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Mzc0OSwiaWF0IjoxNzkzMzYyODQ5LCJqdGkiOiI0NDhlY2RhMi1iMmZlLTQyMWMtOTk0Yi1mMWExZjc5NGMxNTEiLCJzaWQiOiI2NTA5OGY3YS03YzUyLTQ0OTgtYTFhMS03NWQ5MWQyOTVhYmUifQ.aldh0LpE3bu1NqpoV9iukZsanRk8HzAelXcTS-vCofQ",
  "access_expires_at": "2026-10-30T12:35:49.417191576Z",
  "refresh_token": "WaETppzA2-eNtFUc5qLT6m7zs-MJ4s3tv198PPBerHs",
  "refresh_expires_at": "2026-11-29T12:20:49.416652831Z",
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
  "command_id": "b3942754-35c5-4ad7-939e-943097ee6b7c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:20:50Z",
    "sequence": 1793362850621
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "5f724c0f-7236-4ec1-9a15-adeea14cb84a",
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
  "last_heartbeat_at": "2026-10-30T12:20:50.024515Z",
  "last_location_at": "2026-10-30T12:20:50.024515Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "c2036327-ff43-4a18-a01e-154c68373d6c",
      "short_number": 25,
      "pickup_at": "2026-10-30T15:20:46Z",
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

`POST /api/driver/v1/preorders/c2036327-ff43-4a18-a01e-154c68373d6c/reserve` → **200**

```json
{
  "command_id": "117e528f-2e83-42c4-935c-93daab5601b5"
}
```

```json
{
  "id": "be633957-c4ec-4c84-866b-c9927c59aae8",
  "state": "RESERVED",
  "order": {
    "order_id": "c2036327-ff43-4a18-a01e-154c68373d6c",
    "short_number": 25,
    "pickup_at": "2026-10-30T15:20:46Z",
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
  "reserved_at": "2026-10-30T12:20:50.63839Z",
  "confirm_from": "2026-10-30T14:50:46Z",
  "confirm_until": "2026-10-30T15:00:46Z",
  "drop_until": "2026-10-30T14:20:46Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "be633957-c4ec-4c84-866b-c9927c59aae8",
      "state": "RESERVED",
      "order": {
        "order_id": "c2036327-ff43-4a18-a01e-154c68373d6c",
        "short_number": 25,
        "pickup_at": "2026-10-30T15:20:46Z",
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
      "reserved_at": "2026-10-30T12:20:50.63839Z",
      "confirm_from": "2026-10-30T14:50:46Z",
      "confirm_until": "2026-10-30T15:00:46Z",
      "drop_until": "2026-10-30T14:20:46Z"
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
      "id": "be633957-c4ec-4c84-866b-c9927c59aae8",
      "state": "RESERVED",
      "order": {
        "order_id": "c2036327-ff43-4a18-a01e-154c68373d6c",
        "short_number": 25,
        "pickup_at": "2026-10-30T15:20:46Z",
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
      "reserved_at": "2026-10-30T12:20:50.63839Z",
      "confirm_from": "2026-10-30T14:50:46Z",
      "confirm_until": "2026-10-30T15:00:46Z",
      "drop_until": "2026-10-30T14:20:46Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/be633957-c4ec-4c84-866b-c9927c59aae8/confirm` → **409**

```json
{
  "command_id": "f4c4f2aa-2a4d-4083-aa52-1a15050c3fb6"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/be633957-c4ec-4c84-866b-c9927c59aae8/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c8c04ecb-4894-4578-ad39-e4ee989c480c"
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
  "session_id": "8c5f673e-9ae1-4dc2-a296-a6ecc6533c64",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM3NTIsImlhdCI6MTc5MzM2Mjg1MiwianRpIjoiM2Y5Y2E3NmItOTViMC00YjI2LWFkYjgtMmIxOGZiMTdlZGJjIiwic2lkIjoiOGM1ZjY3M2UtOWFlMS00ZGMyLWEyOTYtYTZlY2M2NTMzYzY0In0.KeZ-k2I1dvE7XDGxqv6r5Ec-DDqfS8rsYu3zCahw24k",
  "access_expires_at": "2026-10-30T12:35:52.103948931Z",
  "refresh_token": "YV1UtFBm4-x0sH1p52u7RaNhjex0CW6O2fAqmq8smys",
  "refresh_expires_at": "2026-10-31T00:20:52.10343061Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c2036327-ff43-4a18-a01e-154c68373d6c` → **200**

```json
{
  "id": "c2036327-ff43-4a18-a01e-154c68373d6c",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "458e575c-8fd2-41a7-aaf6-f3615a7929d3",
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
  "created_at": "2026-10-30T12:20:48.797653Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T15:20:46Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "be633957-c4ec-4c84-866b-c9927c59aae8",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T12:20:50.63839Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/c2036327-ff43-4a18-a01e-154c68373d6c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T12:20:48.798932Z",
      "actor": {
        "type": "CLIENT",
        "id": "458e575c-8fd2-41a7-aaf6-f3615a7929d3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "c2036327-ff43-4a18-a01e-154c68373d6c",
        "preorder": true,
        "quote_id": "eaed4500-8928-412b-b16c-c60fdd3996a5",
        "pickup_at": "2026-10-30T15:20:46Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "888eece5-f7b5-4086-a631-2dc2804ed204"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T12:20:50.639503Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c2036327-ff43-4a18-a01e-154c68373d6c",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "be633957-c4ec-4c84-866b-c9927c59aae8"
      },
      "correlation_id": "c3b49499-2eb4-4eea-b769-4998fb1d104d"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order c2036327-ff43-4a18-a01e-154c68373d6c, reservation be633957-c4ec-4c84-866b-c9927c59aae8.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2782"
}
```

```json
{
  "challenge_id": "8a17dad1-bd99-4c94-819c-568a9d55db42",
  "expires_at": "2026-10-30T12:25:53.008277191Z",
  "resend_available_at": "2026-10-30T12:20:54.008277191Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "842597",
  "sent_at": "2026-10-30T12:20:53.011071607Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a17dad1-bd99-4c94-819c-568a9d55db42",
  "code": "842597",
  "device_ref": "sandbox-2782"
}
```

```json
{
  "session_id": "82a4793e-5b31-4de7-a80b-4fda8cf462d2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Mzc1MywiaWF0IjoxNzkzMzYyODUzLCJqdGkiOiJhNzRmNWVhOC0xZGU1LTQ3NDktYjllNi01MDAzMjA2ZTQwYTYiLCJzaWQiOiI4MmE0NzkzZS01YjMxLTRkZTctYTgwYi00ZmRhOGNmNDYyZDIifQ.geqauHFUsrN_b3PxYmY9UbN6e9kRTHkGnRJif8j3gUs",
  "access_expires_at": "2026-10-30T12:35:53.326823575Z",
  "refresh_token": "CV0INNUramyCBWsVsxr626JD4PUjYKWPGSr9Jl8io9M",
  "refresh_expires_at": "2026-11-29T12:20:53.326234621Z",
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
  "command_id": "3271671b-eceb-41cb-afaf-1bee32732f72",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:20:53Z",
    "sequence": 1793362853915
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "79ba9ed1-7a0b-427e-91f2-6ed6e7963b93",
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
  "last_heartbeat_at": "2026-10-30T12:20:53.933863Z",
  "last_location_at": "2026-10-30T12:20:53.933863Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674264888",
  "device_ref": "sandbox-8539"
}
```

```json
{
  "challenge_id": "493454c1-56a0-4b54-a1dc-24dcafdb8acf",
  "expires_at": "2026-10-30T12:25:54.247519905Z",
  "resend_available_at": "2026-10-30T12:20:55.247519905Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674264888` → **200**

```json
{
  "phone": "+380674264888",
  "audience": "CLIENT",
  "code": "820990",
  "sent_at": "2026-10-30T12:20:54.250183807Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "493454c1-56a0-4b54-a1dc-24dcafdb8acf",
  "code": "820990",
  "device_ref": "sandbox-8539"
}
```

```json
{
  "session_id": "2f4e8725-38af-4db9-8670-a12c762a1306",
  "subject": {
    "type": "CLIENT",
    "id": "88aee7ec-7be7-4f1a-b1c2-26bf9bfb4d88"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OGFlZTdlYy03YmU3LTRmMWEtYjFjMi0yNmJmOWJmYjRkODgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzNzU0LCJpYXQiOjE3OTMzNjI4NTQsImp0aSI6IjFiNWZhYjA2LTk3ZDQtNDU4Zi05YTMzLWQwY2M0ZDJhNTFlOSIsInNpZCI6IjJmNGU4NzI1LTM4YWYtNGRiOS04NjcwLWExMmM3NjJhMTMwNiJ9.HNSf-kygfsTltoRW1mRrAWCm9LoNzaGpCLQYSO2Honc",
  "access_expires_at": "2026-10-30T12:35:54.576256494Z",
  "refresh_token": "m-Ls409k2dmWCDjiqFtKLyKkLuGse_ybH5IzhxSjLp8",
  "refresh_expires_at": "2026-11-29T12:20:54.575695089Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4e675028-3515-4d33-b703-7cbcabc9a3fe",
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
  "id": "fc5596c5-6e28-49d9-bc26-38b2f6f6c5a3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:25:54.870303Z",
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
  "command_id": "ad4da5c8-dd7c-4e48-892f-c8f24a089973",
  "quote_id": "fc5596c5-6e28-49d9-bc26-38b2f6f6c5a3",
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
  "id": "decc79c1-9a32-45e0-9376-86712d85b255",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "88aee7ec-7be7-4f1a-b1c2-26bf9bfb4d88",
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
  "created_at": "2026-10-30T12:20:55.172194Z",
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
    "id": "c4e393f0-cef6-4a81-b7ad-104bd1105ff5",
    "order_id": "decc79c1-9a32-45e0-9376-86712d85b255",
    "expires_at": "2026-10-30T12:21:10.175186Z",
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

`POST /api/driver/v1/offers/c4e393f0-cef6-4a81-b7ad-104bd1105ff5/accept` → **200**

```json
{
  "command_id": "49845077-d397-405e-80ca-84f0b3fd6e4f"
}
```

```json
{
  "id": "55369480-15fc-4079-89b9-246e5c54854c",
  "order_id": "decc79c1-9a32-45e0-9376-86712d85b255",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "86a5398b-2aee-4be0-a5ed-ff727f09818a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "86a5398b-2aee-4be0-a5ed-ff727f09818a",
  "order_id": "decc79c1-9a32-45e0-9376-86712d85b255",
  "assignment_id": "55369480-15fc-4079-89b9-246e5c54854c",
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

`POST /api/driver/v1/work-sessions/79ba9ed1-7a0b-427e-91f2-6ed6e7963b93/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:20:56Z",
    "sequence": 1793362856372
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "79ba9ed1-7a0b-427e-91f2-6ed6e7963b93",
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
  "last_heartbeat_at": "2026-10-30T12:20:56.390869Z",
  "last_location_at": "2026-10-30T12:20:56.390869Z",
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
  "id": "86a5398b-2aee-4be0-a5ed-ff727f09818a",
  "order_id": "decc79c1-9a32-45e0-9376-86712d85b255",
  "assignment_id": "55369480-15fc-4079-89b9-246e5c54854c",
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

`POST /api/driver/v1/trips/86a5398b-2aee-4be0-a5ed-ff727f09818a/arrive` → **200**

```json
{
  "command_id": "1a90def4-f789-4dae-a74d-01c05a95fe06",
  "expected_version": 0
}
```

```json
{
  "id": "86a5398b-2aee-4be0-a5ed-ff727f09818a",
  "order_id": "decc79c1-9a32-45e0-9376-86712d85b255",
  "assignment_id": "55369480-15fc-4079-89b9-246e5c54854c",
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
  "arrived_at": "2026-10-30T12:20:56.971363Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/86a5398b-2aee-4be0-a5ed-ff727f09818a/start` → **200**

```json
{
  "command_id": "c3ee53f6-11b7-4014-9a2e-26183eaba630",
  "expected_version": 1
}
```

```json
{
  "id": "86a5398b-2aee-4be0-a5ed-ff727f09818a",
  "order_id": "decc79c1-9a32-45e0-9376-86712d85b255",
  "assignment_id": "55369480-15fc-4079-89b9-246e5c54854c",
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
  "arrived_at": "2026-10-30T12:20:56.971363Z",
  "started_at": "2026-10-30T12:20:57.270008Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/79ba9ed1-7a0b-427e-91f2-6ed6e7963b93/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:21:45Z",
    "sequence": 1793362905587
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "79ba9ed1-7a0b-427e-91f2-6ed6e7963b93",
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
  "last_heartbeat_at": "2026-10-30T12:21:45.605337Z",
  "last_location_at": "2026-10-30T12:21:45.605337Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/86a5398b-2aee-4be0-a5ed-ff727f09818a/complete` → **200**

```json
{
  "command_id": "bfa01040-58d2-4e3d-aa14-169020744580",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:21:45Z",
  "cash_received": true
}
```

```json
{
  "id": "86a5398b-2aee-4be0-a5ed-ff727f09818a",
  "order_id": "decc79c1-9a32-45e0-9376-86712d85b255",
  "assignment_id": "55369480-15fc-4079-89b9-246e5c54854c",
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
  "arrived_at": "2026-10-30T12:20:56.971363Z",
  "started_at": "2026-10-30T12:20:57.270008Z",
  "completed_at": "2026-10-30T12:21:45.896839Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/decc79c1-9a32-45e0-9376-86712d85b255/rating` → **200**

```json
{
  "command_id": "78f3fd5a-1414-4d0b-b057-7147c6d1cc92",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "decc79c1-9a32-45e0-9376-86712d85b255",
  "score": 5,
  "created_at": "2026-10-30T12:21:46.224386868Z"
}
```

`POST /api/driver/v1/orders/decc79c1-9a32-45e0-9376-86712d85b255/rating` → **200**

```json
{
  "command_id": "7463e077-1bd2-4b56-b96c-403d680dd262",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "decc79c1-9a32-45e0-9376-86712d85b255",
  "score": 4,
  "created_at": "2026-10-30T12:21:46.522406027Z"
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
  "session_id": "1dd66c72-b9fc-48ed-8549-52e0deb395b6",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM4MDcsImlhdCI6MTc5MzM2MjkwNywianRpIjoiMjdkNmEzY2QtNWZkYi00NTBjLTg5OGUtODliMmNiYjk1NzI3Iiwic2lkIjoiMWRkNjZjNzItYjlmYy00OGVkLTg1NDktNTJlMGRlYjM5NWI2In0.SrornOvcnGqj8Li_1hzEOim0UioPvLNVH2MMzMu8E4c",
  "access_expires_at": "2026-10-30T12:36:47.394054101Z",
  "refresh_token": "afpSBjtD1iTD8SHRbBk51VZ4IZLzbhoYvxBPLC8VJ-U",
  "refresh_expires_at": "2026-10-31T00:21:47.393487318Z",
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
  "session_id": "629675ba-ec88-42d4-b66e-13a1ee3d62d2",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM4MDcsImlhdCI6MTc5MzM2MjkwNywianRpIjoiMDlmNWYzMmEtMmU0NC00ODg1LThhOTItZjFhNjc5OGE4NzQ5Iiwic2lkIjoiNjI5Njc1YmEtZWM4OC00MmQ0LWI2NmUtMTNhMWVlM2Q2MmQyIn0.v85hLqrN-ZdOurLwZwepAjIO3sAkXY8stP-UWIPwbLQ",
  "access_expires_at": "2026-10-30T12:36:47.972825256Z",
  "refresh_token": "iPyBQHBgEO-kka-dwHeW4x8_RyAP8Z0W0m-qoMCD0r4",
  "refresh_expires_at": "2026-10-31T00:21:47.972223177Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/decc79c1-9a32-45e0-9376-86712d85b255/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "decc79c1-9a32-45e0-9376-86712d85b255",
      "author_type": "RIDER",
      "author_id": "88aee7ec-7be7-4f1a-b1c2-26bf9bfb4d88",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T12:21:46.224387Z"
    },
    {
      "order_id": "decc79c1-9a32-45e0-9376-86712d85b255",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "88aee7ec-7be7-4f1a-b1c2-26bf9bfb4d88",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T12:21:46.522406Z"
    }
  ]
}
```

Done: ratings for order decc79c1-9a32-45e0-9376-86712d85b255.

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
  "session_id": "5ec0ffe1-ceea-4dd2-bd48-b066c01d09a0",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM4MDgsImlhdCI6MTc5MzM2MjkwOCwianRpIjoiZTY3NGYxM2ItNjExZi00Y2JmLTg5ZmItOGY0MDU2NTRiYTU0Iiwic2lkIjoiNWVjMGZmZTEtY2VlYS00ZGQyLWJkNDgtYjA2NmMwMWQwOWEwIn0.6zpeh5b43yy8tCLYDL7VJZBbKzMLSyra8MC4u-TJntM",
  "access_expires_at": "2026-10-30T12:36:48.857784407Z",
  "refresh_token": "rgF7INYYCy8MqtENQpx9cQEH3nsYJRL-7bMqjJH7VTU",
  "refresh_expires_at": "2026-10-31T00:21:48.857213747Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "4f67e9ef-398b-4965-b117-541d31b5ea13",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "d94bebb9-1fc6-4666-af0c-d0b6609e5f28",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:21:49.154449Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d94bebb9-1fc6-4666-af0c-d0b6609e5f28` → **200**

```json
{
  "id": "d94bebb9-1fc6-4666-af0c-d0b6609e5f28",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:21:49.154449Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d94bebb9-1fc6-4666-af0c-d0b6609e5f28` → **200**

```json
{
  "id": "d94bebb9-1fc6-4666-af0c-d0b6609e5f28",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:21:49.154449Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d94bebb9-1fc6-4666-af0c-d0b6609e5f28` → **200**

```json
{
  "id": "d94bebb9-1fc6-4666-af0c-d0b6609e5f28",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:21:49.154449Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d94bebb9-1fc6-4666-af0c-d0b6609e5f28` → **200**

```json
{
  "id": "d94bebb9-1fc6-4666-af0c-d0b6609e5f28",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:21:49.154449Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d94bebb9-1fc6-4666-af0c-d0b6609e5f28` → **200**

```json
{
  "id": "d94bebb9-1fc6-4666-af0c-d0b6609e5f28",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T12:21:49.154449Z",
  "ready_at": "2026-10-30T12:21:53.85773Z",
  "expires_at": "2026-10-31T12:21:53.85773Z"
}
```

`GET /api/admin/v1/reports/exports/d94bebb9-1fc6-4666-af0c-d0b6609e5f28/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "76006dcc-e237-4be0-87e1-21956bccd0cd",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "a8334187-baec-456b-9b47-856bf6910982",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:21:54.916652Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a8334187-baec-456b-9b47-856bf6910982` → **200**

```json
{
  "id": "a8334187-baec-456b-9b47-856bf6910982",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:21:54.916652Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a8334187-baec-456b-9b47-856bf6910982` → **200**

```json
{
  "id": "a8334187-baec-456b-9b47-856bf6910982",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:21:54.916652Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a8334187-baec-456b-9b47-856bf6910982` → **200**

```json
{
  "id": "a8334187-baec-456b-9b47-856bf6910982",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:21:54.916652Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a8334187-baec-456b-9b47-856bf6910982` → **200**

```json
{
  "id": "a8334187-baec-456b-9b47-856bf6910982",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T12:21:54.916652Z",
  "ready_at": "2026-10-30T12:21:58.865352Z",
  "expires_at": "2026-10-31T12:21:58.865352Z"
}
```

`GET /api/admin/v1/reports/exports/a8334187-baec-456b-9b47-856bf6910982/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/d8ac11c6-1bed-47c7-855d-91be4e3e40c4` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/d8ac11c6-1bed-47c7-855d-91be4e3e40c4",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "895b98e4-bf40-478e-803a-b97f628b7a8f"
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
  "session_id": "84689acb-ef64-4ea8-a4d3-cfbbbcf8e1b0",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM4MjAsImlhdCI6MTc5MzM2MjkyMCwianRpIjoiMzY3NGFhYmUtYmY3Yy00ZTE3LTg2ZWYtZjI2ODlhZTVhYzk2Iiwic2lkIjoiODQ2ODlhY2ItZWY2NC00ZWE4LWE0ZDMtY2ZiYmJjZjhlMWIwIn0.fFyJFX5wElOvXBMHEzjY3GecQGLt-FI_xtjlaKt-Dqk",
  "access_expires_at": "2026-10-30T12:37:00.002596232Z",
  "refresh_token": "5h7By9yXKcWWGf3yFCU216UFEmfhB46i2f9F7YVTCzM",
  "refresh_expires_at": "2026-10-31T00:22:00.001970689Z",
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
  "command_id": "5f387406-5a6c-4095-b84d-3ed21207a45e",
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
  "changed_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T12:22:00.59396689Z"
}
```

`POST /sandbox/v1/retention/fixtures/5f61e5ab-74b3-47ba-b1d9-303ea10f74ed` → **200**

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

`GET /sandbox/v1/retention/fixtures/5f61e5ab-74b3-47ba-b1d9-303ea10f74ed` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/5f61e5ab-74b3-47ba-b1d9-303ea10f74ed` → **204**

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
  "changed_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T12:22:00.593967Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "64d35e77-70df-4b91-9016-c6020eaf75c0",
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
  "changed_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T12:22:01.310490821Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-26684"
}
```

```json
{
  "challenge_id": "e0df791f-5283-4053-addf-30da569270d3",
  "expires_at": "2026-10-30T12:27:01.607137421Z",
  "resend_available_at": "2026-10-30T12:22:02.607137421Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "487447",
  "sent_at": "2026-10-30T12:22:01.610844731Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e0df791f-5283-4053-addf-30da569270d3",
  "code": "487447",
  "device_ref": "sandbox-26684"
}
```

```json
{
  "session_id": "fda72e56-cee0-4662-841c-304223835387",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzgyMSwiaWF0IjoxNzkzMzYyOTIxLCJqdGkiOiJkYjY2ZDYzNi00MDU2LTRiMzItODNhYy1kN2RmNDdiOWJiMmQiLCJzaWQiOiJmZGE3MmU1Ni1jZWUwLTQ2NjItODQxYy0zMDQyMjM4MzUzODcifQ.SZvD0OLMXOpCZ0myVe1XweRYAplwmgF4uzxaGz2db8Y",
  "access_expires_at": "2026-10-30T12:37:01.925502443Z",
  "refresh_token": "QpEN3B50G4HFIE5wDujiMwkgjQ8T8qkRFu7mIgSdnWY",
  "refresh_expires_at": "2026-11-29T12:22:01.924970947Z",
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
  "command_id": "048aac7b-4c96-4303-bc3b-122f62f76082",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:22:02Z",
    "sequence": 1793362922780
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c85f792f-4c95-4155-b5da-eb7c963794d7",
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
  "last_heartbeat_at": "2026-10-30T12:22:02.799084Z",
  "last_location_at": "2026-10-30T12:22:02.799084Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "1d1cbbbb-acbd-4207-9bf2-cbdd1f5bc3ba",
  "points": [
    {
      "sequence": 1793362925102,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T12:21:05Z"
    },
    {
      "sequence": 1793362925109,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T12:22:05Z"
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
  "session_id": "0f05d41b-0bc7-4e78-b178-4a441004d110",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM4MjUsImlhdCI6MTc5MzM2MjkyNSwianRpIjoiOGNlZmJkNTYtN2VjYy00NGFjLWExMTYtYTYzNjBkNWNmYTA1Iiwic2lkIjoiMGYwNWQ0MWItMGJjNy00ZTc4LWIxNzgtNGE0NDEwMDRkMTEwIn0.PvPp8g3YCvV1fmNK7fAwR8kM04Khwl33fz1xVzEgsVc",
  "access_expires_at": "2026-10-30T12:37:05.729121769Z",
  "refresh_token": "2whHEh6ccgMUd4wAmQuccIfR1qHVdSYghXscTut1Vsk",
  "refresh_expires_at": "2026-10-31T00:22:05.728569242Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "276a4fbd-6f65-4fbb-b4c2-b0fd7c957eb3",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T12:22:05Z",
        "track_point_id": "113f740f-c041-4c35-a4a5-cda7e335153a",
        "work_session_id": "c85f792f-4c95-4155-b5da-eb7c963794d7"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T12:22:05Z",
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

`POST /api/admin/v1/driver-risk-flags/276a4fbd-6f65-4fbb-b4c2-b0fd7c957eb3/confirm` → **200**

```json
{
  "command_id": "d52ad02c-8ca5-45c4-9492-bf842db8ef9b",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "276a4fbd-6f65-4fbb-b4c2-b0fd7c957eb3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T12:22:05Z",
    "track_point_id": "113f740f-c041-4c35-a4a5-cda7e335153a",
    "work_session_id": "c85f792f-4c95-4155-b5da-eb7c963794d7"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T12:22:05Z",
  "reason": null,
  "reviewed_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "reviewed_at": "2026-10-30T12:22:06.650025Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/276a4fbd-6f65-4fbb-b4c2-b0fd7c957eb3/dismiss` → **409**

```json
{
  "command_id": "de519f63-cf9d-4334-baa4-85220a17937d",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/276a4fbd-6f65-4fbb-b4c2-b0fd7c957eb3/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "01ea0fb2-affd-4763-9c05-7ad4bb0ed51d"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "61fdd9b7-4eaa-4075-8691-361f2ae478d9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "37a1c7a9-c448-478d-9c75-86e4a64af129",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "raised_at": "2026-10-30T12:22:07.250504Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/37a1c7a9-c448-478d-9c75-86e4a64af129/dismiss` → **200**

```json
{
  "command_id": "df6dfbf5-b2da-4517-9280-648d7a3236a8",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "37a1c7a9-c448-478d-9c75-86e4a64af129",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "raised_at": "2026-10-30T12:22:07.250504Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "reviewed_at": "2026-10-30T12:22:07.554024Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "f17c2363-0c06-420d-a78d-1d7e6e020db0",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "276a4fbd-6f65-4fbb-b4c2-b0fd7c957eb3"
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
      "actor_id": "c2b31b2b-8610-441e-a39e-de6e6485310e",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T12:22:07.862411Z"
    }
  ],
  "duplicates": []
}
```

Done: flag 276a4fbd-6f65-4fbb-b4c2-b0fd7c957eb3 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "3f6f30e6-f978-4825-93ce-7759a4f5ce82",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM4MjgsImlhdCI6MTc5MzM2MjkyOCwianRpIjoiYjYwN2Y1YTUtZjE4MC00NmY1LWE4MTQtMDFmM2FiY2UwM2M1Iiwic2lkIjoiM2Y2ZjMwZTYtZjk3OC00ODI1LTkzY2UtNzc1OWE0ZjVjZTgyIn0.7JSRRJv043XhhFBnU_LSUi2yF85z6JapxfwXud7VSec",
  "access_expires_at": "2026-10-30T12:37:08.753177773Z",
  "refresh_token": "1k3UQNn8YQAF9LcZx9CCDydlaCUZOOxR4MOvzWa90xY",
  "refresh_expires_at": "2026-10-31T00:22:08.752650764Z",
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
      "actor_id": "c2b31b2b-8610-441e-a39e-de6e6485310e",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T12:22:07.862411Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "2dc1b571-bbeb-49e9-a4da-61f18ce7a20a",
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
  "session_id": "c85f792f-4c95-4155-b5da-eb7c963794d7",
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
  "last_heartbeat_at": "2026-10-30T12:22:02.799084Z",
  "last_location_at": "2026-10-30T12:22:02.799084Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c85f792f-4c95-4155-b5da-eb7c963794d7/close` → **200**

```json
{
  "command_id": "882a7fb6-18dc-4b76-ba5d-6d5fdc4d751f",
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
  "session_id": "fca86c5f-e786-44a8-99b6-09520ac223d3",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM4MzAsImlhdCI6MTc5MzM2MjkzMCwianRpIjoiNDc4OGM5ZjItZDcxOS00MzdmLTg0YjctZjE2Y2Y1YWJkZjVhIiwic2lkIjoiZmNhODZjNWYtZTc4Ni00NGE4LTk5YjYtMDk1MjBhYzIyM2QzIn0.o38Szj5RV_iK7WInluSt1cpQn8AmHPCli0IsVVeXnmg",
  "access_expires_at": "2026-10-30T12:37:10.574950207Z",
  "refresh_token": "1xyC37onVCLNVIX5a0oRbn1kTNiSRHXUGNYz0XKQCss",
  "refresh_expires_at": "2026-10-31T00:22:10.574368356Z",
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
  "command_id": "1baf9e7c-86ac-4c1b-b0d7-7a8403eddcc6",
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
  "changed_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T12:22:11.155838Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "1baf9e7c-86ac-4c1b-b0d7-7a8403eddcc6",
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
  "changed_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T12:22:11.155838Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48536974136",
  "device_ref": "sandbox-26278"
}
```

```json
{
  "challenge_id": "09016146-4f2c-4421-bd6f-c9e863257bfd",
  "expires_at": "2026-10-30T12:27:11.768374666Z",
  "resend_available_at": "2026-10-30T12:22:12.768374666Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48536974136` → **200**

```json
{
  "phone": "+48536974136",
  "audience": "CLIENT",
  "code": "342517",
  "sent_at": "2026-10-30T12:22:11.771382016Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "09016146-4f2c-4421-bd6f-c9e863257bfd",
  "code": "342517",
  "device_ref": "sandbox-26278"
}
```

```json
{
  "session_id": "8f5e1127-6f37-49d2-ace4-0f8df3cc82eb",
  "subject": {
    "type": "CLIENT",
    "id": "6099aefd-3cac-4688-ba07-9c95f80f2192"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDk5YWVmZC0zY2FjLTQ2ODgtYmEwNy05Yzk1ZjgwZjIxOTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzODMyLCJpYXQiOjE3OTMzNjI5MzIsImp0aSI6IjYyZjMyYWIzLTMzZmEtNDU4Ny1hZjI4LWQ1YWRmYzJjZjJmNiIsInNpZCI6IjhmNWUxMTI3LTZmMzctNDlkMi1hY2U0LTBmOGRmM2NjODJlYiJ9.uFDnIyQybgcBem7ZSQ6Zqsn8UFs5qm28iRoFARYWzXg",
  "access_expires_at": "2026-10-30T12:37:12.085369255Z",
  "refresh_token": "ytEUQgwXP9TQHIgUPbYH4j2lNwQQ8xnFk40_29fcFGQ",
  "refresh_expires_at": "2026-11-29T12:22:12.08483873Z",
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
  "correlation_id": "16e9609a-92b2-4045-bcb5-29be02baaf81"
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
  "device_ref": "sandbox-17955"
}
```

```json
{
  "challenge_id": "4f147583-8913-4683-83ba-e8272c76ab35",
  "expires_at": "2026-10-30T12:27:12.940448983Z",
  "resend_available_at": "2026-10-30T12:22:13.940448983Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "746053",
  "sent_at": "2026-10-30T12:22:12.942948261Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f147583-8913-4683-83ba-e8272c76ab35",
  "code": "746053",
  "device_ref": "sandbox-17955"
}
```

```json
{
  "session_id": "f96a9c94-a6cf-437f-baf6-9486d59e75c7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzgzMywiaWF0IjoxNzkzMzYyOTMzLCJqdGkiOiIwNDE1ZDMzYi0yNjA1LTQwY2MtYWU4Yi1lODhmNjc0Njk0ODUiLCJzaWQiOiJmOTZhOWM5NC1hNmNmLTQzN2YtYmFmNi05NDg2ZDU5ZTc1YzcifQ.NzSJDSRAk8P1IF-dTFMeBoUwEkp_zxA6f8uoD-kud54",
  "access_expires_at": "2026-10-30T12:37:13.244213179Z",
  "refresh_token": "UOCbLpALhk9A6TpZDyDrh21wQ5TIX1fHcB1Hah3GyM0",
  "refresh_expires_at": "2026-11-29T12:22:13.243707662Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "5f724c0f-7236-4ec1-9a15-adeea14cb84a",
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
  "last_heartbeat_at": "2026-10-30T12:20:50.024515Z",
  "last_location_at": "2026-10-30T12:20:50.024515Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5f724c0f-7236-4ec1-9a15-adeea14cb84a/handover` → **200**

```json
{
  "command_id": "9d2755aa-1244-4a17-a2c7-e06165f7347d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "5f724c0f-7236-4ec1-9a15-adeea14cb84a",
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
  "last_heartbeat_at": "2026-10-30T12:20:50.024515Z",
  "last_location_at": "2026-10-30T12:20:50.024515Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5f724c0f-7236-4ec1-9a15-adeea14cb84a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:22:14Z",
    "sequence": 1793362934107
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "5f724c0f-7236-4ec1-9a15-adeea14cb84a",
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
  "last_heartbeat_at": "2026-10-30T12:22:14.125585Z",
  "last_location_at": "2026-10-30T12:22:14.125585Z",
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
  "session_id": "5f724c0f-7236-4ec1-9a15-adeea14cb84a",
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
  "last_heartbeat_at": "2026-10-30T12:22:14.125585Z",
  "last_location_at": "2026-10-30T12:22:14.125585Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5f724c0f-7236-4ec1-9a15-adeea14cb84a/close` → **200**

```json
{
  "command_id": "3522a6ff-dafc-4664-858f-3c0fd25a5db5",
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
  "correlation_id": "0cf45ac3-ed5b-446d-bc02-5da559430cac"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678996130",
  "device_ref": "sandbox-2056"
}
```

```json
{
  "challenge_id": "9d6d3f3e-7317-48be-84d7-17f97c5914bf",
  "expires_at": "2026-10-30T12:27:15.574418614Z",
  "resend_available_at": "2026-10-30T12:22:16.574418614Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678996130` → **200**

```json
{
  "phone": "+380678996130",
  "audience": "CLIENT",
  "code": "422841",
  "sent_at": "2026-10-30T12:22:15.576925486Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d6d3f3e-7317-48be-84d7-17f97c5914bf",
  "code": "422841",
  "device_ref": "sandbox-2056"
}
```

```json
{
  "session_id": "37f3dfce-bc7c-4d32-9a07-e066c80bcc03",
  "subject": {
    "type": "CLIENT",
    "id": "0b2c7425-28e0-4681-82d8-9b96140970f3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYjJjNzQyNS0yOGUwLTQ2ODEtODJkOC05Yjk2MTQwOTcwZjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzODM1LCJpYXQiOjE3OTMzNjI5MzUsImp0aSI6IjZjMTAyZDY1LThhZTktNDY1YS04ZTIyLWNmOTQ4YWU4YzJkNyIsInNpZCI6IjM3ZjNkZmNlLWJjN2MtNGQzMi05YTA3LWUwNjZjODBiY2MwMyJ9.Sfcu8OXfxruVyQR6CNYJLzjQw-ORMOZJUXl4exzpCug",
  "access_expires_at": "2026-10-30T12:37:15.888164558Z",
  "refresh_token": "6n_ORG-xkxsBK5uWQ1dOIzCUShgtuAOFkD3zGKhb9ME",
  "refresh_expires_at": "2026-11-29T12:22:15.887627611Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "d73be98d-bde3-4046-b45a-3dde4d494014",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "f249ff0c-e4f3-44a9-ad40-90eebca642cf",
  "upload_path": "/api/rider/v1/uploads/f249ff0c-e4f3-44a9-ad40-90eebca642cf",
  "expires_at": "2026-10-30T12:37:16.175579658Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/f249ff0c-e4f3-44a9-ad40-90eebca642cf` → **200**

```json
{
  "file_id": "f249ff0c-e4f3-44a9-ad40-90eebca642cf",
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
  "command_id": "2ed86c2f-5fda-47cb-9861-f892026290e6",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "b6c5159f-6d38-4bb8-8819-aabbbc597f28",
  "upload_path": "/api/rider/v1/uploads/b6c5159f-6d38-4bb8-8819-aabbbc597f28",
  "expires_at": "2026-10-30T12:37:16.515823446Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/b6c5159f-6d38-4bb8-8819-aabbbc597f28` → **200**

```json
{
  "file_id": "b6c5159f-6d38-4bb8-8819-aabbbc597f28",
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
  "command_id": "ff592fac-763d-4a0b-8e9e-876a25ec10ee",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b2ac1438-db8a-4bdc-9010-ba8402db9b77",
  "upload_path": "/api/rider/v1/uploads/b2ac1438-db8a-4bdc-9010-ba8402db9b77",
  "expires_at": "2026-10-30T12:37:16.825988108Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/b2ac1438-db8a-4bdc-9010-ba8402db9b77` → **200**

```json
{
  "file_id": "b2ac1438-db8a-4bdc-9010-ba8402db9b77",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "d776cc46-e781-49ae-8b47-a5e4fe9802f0",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "b2ac1438-db8a-4bdc-9010-ba8402db9b77"
  ]
}
```

```json
{
  "id": "c81ce492-24ee-441b-974a-a5232a3ae558",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "0b2c7425-28e0-4681-82d8-9b96140970f3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T12:22:17.143495Z",
  "updated_at": "2026-10-30T12:22:17.143495Z",
  "respond_by": "2026-10-30T16:22:17.143495Z",
  "messages": [
    {
      "id": "15e9dc38-deb0-48a7-bec1-f93cd8e64b09",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "0b2c7425-28e0-4681-82d8-9b96140970f3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T12:22:17.144654Z",
      "attachments": [
        {
          "file_id": "b2ac1438-db8a-4bdc-9010-ba8402db9b77",
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
  "session_id": "b3535929-7cd2-42d0-ac64-425a36f43ce3",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM4MzcsImlhdCI6MTc5MzM2MjkzNywianRpIjoiOGZiNWFiYTctYWRkOS00MzFjLWIwZGMtZjBmOTdiYzBhYWY0Iiwic2lkIjoiYjM1MzU5MjktN2NkMi00MmQwLWFjNjQtNDI1YTM2ZjQzY2UzIn0.PQ0wVfdas32gJLu4vXQ9IzgwM1Wu0G_91OUNuxVxa1I",
  "access_expires_at": "2026-10-30T12:37:17.746012939Z",
  "refresh_token": "8ly4xrPHtR_pmSJl0DbCQBcsJn1E4DA9DKPK7b1_GvE",
  "refresh_expires_at": "2026-10-31T00:22:17.74547478Z",
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
  "session_id": "6e672734-41e5-41d1-b323-5a3543dfa05e",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM4MzgsImlhdCI6MTc5MzM2MjkzOCwianRpIjoiMDZmZDUxZDAtNDNjNy00OGIxLWI2ODktMTgyOTE0NDgzYmExIiwic2lkIjoiNmU2NzI3MzQtNDFlNS00MWQxLWIzMjMtNWEzNTQzZGZhMDVlIn0.H73dCsx2GY3nLoldUtENbtAin0yWil3VCxKWkr4mSIw",
  "access_expires_at": "2026-10-30T12:37:18.32674672Z",
  "refresh_token": "IKAfgrQqbwz5QmE4bM0U3ssx_cSbPjcYI9FFyTW5Sd8",
  "refresh_expires_at": "2026-10-31T00:22:18.326145864Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/c81ce492-24ee-441b-974a-a5232a3ae558/attachments/b2ac1438-db8a-4bdc-9010-ba8402db9b77` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "f9a47ffd-7cfe-4bd5-99d6-96fd4eecc842",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "87a50803-da8b-4958-95aa-68d6847fa72b",
  "upload_path": "/api/operator/v1/uploads/87a50803-da8b-4958-95aa-68d6847fa72b",
  "expires_at": "2026-10-30T12:37:18.624972664Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/87a50803-da8b-4958-95aa-68d6847fa72b` → **200**

```json
{
  "file_id": "87a50803-da8b-4958-95aa-68d6847fa72b",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/c81ce492-24ee-441b-974a-a5232a3ae558` → **200**

```json
{
  "id": "c81ce492-24ee-441b-974a-a5232a3ae558",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "0b2c7425-28e0-4681-82d8-9b96140970f3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T12:22:17.143495Z",
  "updated_at": "2026-10-30T12:22:17.143495Z",
  "respond_by": "2026-10-30T16:22:17.143495Z",
  "messages": [
    {
      "id": "15e9dc38-deb0-48a7-bec1-f93cd8e64b09",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "0b2c7425-28e0-4681-82d8-9b96140970f3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T12:22:17.144654Z",
      "attachments": [
        {
          "file_id": "b2ac1438-db8a-4bdc-9010-ba8402db9b77",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/c81ce492-24ee-441b-974a-a5232a3ae558/comments` → **200**

```json
{
  "command_id": "391bf11e-9764-47a6-8c78-a1a33c83dc80",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "87a50803-da8b-4958-95aa-68d6847fa72b"
  ]
}
```

```json
{
  "id": "c81ce492-24ee-441b-974a-a5232a3ae558",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "0b2c7425-28e0-4681-82d8-9b96140970f3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T12:22:17.143495Z",
  "updated_at": "2026-10-30T12:22:19.246012Z",
  "respond_by": "2026-10-30T16:22:17.143495Z",
  "messages": [
    {
      "id": "15e9dc38-deb0-48a7-bec1-f93cd8e64b09",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "0b2c7425-28e0-4681-82d8-9b96140970f3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T12:22:17.144654Z",
      "attachments": [
        {
          "file_id": "b2ac1438-db8a-4bdc-9010-ba8402db9b77",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "8ac229f3-007a-4e09-a74c-b52af7d26fa9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "c2b31b2b-8610-441e-a39e-de6e6485310e",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T12:22:19.245488Z",
      "attachments": [
        {
          "file_id": "87a50803-da8b-4958-95aa-68d6847fa72b",
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

`GET /api/rider/v1/support/cases/c81ce492-24ee-441b-974a-a5232a3ae558` → **200**

```json
{
  "id": "c81ce492-24ee-441b-974a-a5232a3ae558",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "0b2c7425-28e0-4681-82d8-9b96140970f3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T12:22:17.143495Z",
  "updated_at": "2026-10-30T12:22:19.246012Z",
  "respond_by": "2026-10-30T16:22:17.143495Z",
  "messages": [
    {
      "id": "15e9dc38-deb0-48a7-bec1-f93cd8e64b09",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "0b2c7425-28e0-4681-82d8-9b96140970f3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T12:22:17.144654Z",
      "attachments": [
        {
          "file_id": "b2ac1438-db8a-4bdc-9010-ba8402db9b77",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "8ac229f3-007a-4e09-a74c-b52af7d26fa9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T12:22:19.245488Z",
      "attachments": [
        {
          "file_id": "87a50803-da8b-4958-95aa-68d6847fa72b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/c81ce492-24ee-441b-974a-a5232a3ae558/attachments/87a50803-da8b-4958-95aa-68d6847fa72b` → **200**

Done: support case c81ce492-24ee-441b-974a-a5232a3ae558, rider attachment b2ac1438-db8a-4bdc-9010-ba8402db9b77, operator attachment 87a50803-da8b-4958-95aa-68d6847fa72b.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731254181",
  "device_ref": "sandbox-12037"
}
```

```json
{
  "challenge_id": "912f13af-1caa-4eee-b7c8-0b4d63a0d97c",
  "expires_at": "2026-10-30T12:27:19.861283003Z",
  "resend_available_at": "2026-10-30T12:22:20.861283003Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731254181` → **200**

```json
{
  "phone": "+380731254181",
  "audience": "CLIENT",
  "code": "661293",
  "sent_at": "2026-10-30T12:22:19.864097297Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "912f13af-1caa-4eee-b7c8-0b4d63a0d97c",
  "code": "661293",
  "device_ref": "sandbox-12037"
}
```

```json
{
  "session_id": "9fb3d1d4-f7c9-425a-97a1-71b2c38fe07f",
  "subject": {
    "type": "CLIENT",
    "id": "a27048f6-d7c6-47b0-b75b-c6e93812435e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjcwNDhmNi1kN2M2LTQ3YjAtYjc1Yi1jNmU5MzgxMjQzNWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzODQwLCJpYXQiOjE3OTMzNjI5NDAsImp0aSI6ImM0ZmJlNDZjLWI1MDMtNGRkNy05ZjQwLWVhYTdmNDY5YjdmNCIsInNpZCI6IjlmYjNkMWQ0LWY3YzktNDI1YS05N2ExLTcxYjJjMzhmZTA3ZiJ9.H2OhD6VKHvMBjyr3I3Ul3iLPSQmqMDfXvkWrwn5Pthc",
  "access_expires_at": "2026-10-30T12:37:20.176203852Z",
  "refresh_token": "xJNA4Gt3w1WrTfzrXVElA-MFoGbWdvE4sHzyRvt_5LY",
  "refresh_expires_at": "2026-11-29T12:22:20.175655246Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "536ffeac-4023-4d4b-ad11-39fcf3389da1",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "3c4d1515-9e37-4276-ad65-7e5789392554",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-3c4d1515-9e37-4276-ad65-7e5789392554",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "e80dfc9e3b834e2faab16f43cb615712",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=3c4d1515-9e37-4276-ad65-7e5789392554",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731254181"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=3c4d1515-9e37-4276-ad65-7e5789392554",
  "expires_at": "2026-10-30T12:52:20.466521Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/3c4d1515-9e37-4276-ad65-7e5789392554` → **200**

```json
{
  "id": "3c4d1515-9e37-4276-ad65-7e5789392554",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T12:52:20.466521Z",
  "card": {
    "id": "3b73d2fb-9d04-40b5-873a-9250c90a1cc2",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9993",
    "card_type": "Visa",
    "created_at": "2026-10-30T12:22:20.759929Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "208b342a-ff6b-40a3-8ab7-8554cb1cc581",
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
  "id": "5bfa19c0-3e09-4250-83bb-a6bbd10cc7f1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:27:21.079611Z",
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
  "command_id": "1af55d74-3b32-4796-bb54-b7db25148b0f",
  "quote_id": "5bfa19c0-3e09-4250-83bb-a6bbd10cc7f1",
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
  "id": "fc3fb78a-de3a-466a-bec1-d9dfae7433c3",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a27048f6-d7c6-47b0-b75b-c6e93812435e",
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
  "created_at": "2026-10-30T12:22:21.377795Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fc3fb78a-de3a-466a-bec1-d9dfae7433c3` → **200**

```json
{
  "id": "fc3fb78a-de3a-466a-bec1-d9dfae7433c3",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a27048f6-d7c6-47b0-b75b-c6e93812435e",
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
  "created_at": "2026-10-30T12:22:21.377795Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fc3fb78a-de3a-466a-bec1-d9dfae7433c3` → **200**

```json
{
  "id": "fc3fb78a-de3a-466a-bec1-d9dfae7433c3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a27048f6-d7c6-47b0-b75b-c6e93812435e",
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
  "created_at": "2026-10-30T12:22:21.377795Z",
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

`GET /api/rider/v1/orders/fc3fb78a-de3a-466a-bec1-d9dfae7433c3` → **200**

```json
{
  "id": "fc3fb78a-de3a-466a-bec1-d9dfae7433c3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a27048f6-d7c6-47b0-b75b-c6e93812435e",
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
  "created_at": "2026-10-30T12:22:21.377795Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/fc3fb78a-de3a-466a-bec1-d9dfae7433c3/switch-to-cash` → **200**

```json
{
  "command_id": "64c175ba-a8c1-4358-819b-ca4d18b0530e",
  "expected_version": 3
}
```

```json
{
  "id": "fc3fb78a-de3a-466a-bec1-d9dfae7433c3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "a27048f6-d7c6-47b0-b75b-c6e93812435e",
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
  "created_at": "2026-10-30T12:22:21.377795Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/fc3fb78a-de3a-466a-bec1-d9dfae7433c3/switch-to-cash` → **409**

```json
{
  "command_id": "1ab82a36-3c1b-40ac-b9f7-70b781741d69",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/fc3fb78a-de3a-466a-bec1-d9dfae7433c3/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "fa622878-902f-4c53-8ef6-616563d5c10d"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/fc3fb78a-de3a-466a-bec1-d9dfae7433c3` → **200**

```json
{
  "id": "fc3fb78a-de3a-466a-bec1-d9dfae7433c3",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "a27048f6-d7c6-47b0-b75b-c6e93812435e",
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
  "created_at": "2026-10-30T12:22:21.377795Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/fc3fb78a-de3a-466a-bec1-d9dfae7433c3/cancel` → **200**

```json
{
  "command_id": "29d5002a-eebd-4b56-ad2f-f3751c207b46",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "fc3fb78a-de3a-466a-bec1-d9dfae7433c3",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "a27048f6-d7c6-47b0-b75b-c6e93812435e",
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
  "created_at": "2026-10-30T12:22:21.377795Z",
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
  "session_id": "453ce798-65fe-48f0-885e-73fcb5a20ea2",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM4NDUsImlhdCI6MTc5MzM2Mjk0NSwianRpIjoiNTAyMWQwYzctNjNmNC00OTBjLTg5ZWMtNWVjNjAwNmU5MWZiIiwic2lkIjoiNDUzY2U3OTgtNjVmZS00OGYwLTg4NWUtNzNmY2I1YTIwZWEyIn0.Db-1XXkDV8fQtM4knP5mKIG6GHcDiPpiU5ZnPdTzBos",
  "access_expires_at": "2026-10-30T12:37:25.111522886Z",
  "refresh_token": "Jei4IHDEAbCJc4d8OaKyHlBz2SIwLrfLF6_KI82imGQ",
  "refresh_expires_at": "2026-10-31T00:22:25.110948519Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-376"
}
```

```json
{
  "challenge_id": "05b1ff4f-498c-4380-8f5b-132454350289",
  "expires_at": "2026-10-30T12:27:25.389484591Z",
  "resend_available_at": "2026-10-30T12:22:26.389484591Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "056136",
  "sent_at": "2026-10-30T12:22:25.392522862Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "05b1ff4f-498c-4380-8f5b-132454350289",
  "code": "056136",
  "device_ref": "sandbox-376"
}
```

```json
{
  "session_id": "79f8f66d-c29f-4d27-9838-1f798532c061",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Mzg0NSwiaWF0IjoxNzkzMzYyOTQ1LCJqdGkiOiJiYmVkMTU2NC0wOGY3LTQxZDQtOWM4Ny0zYTU3MzUyNTgzOTciLCJzaWQiOiI3OWY4ZjY2ZC1jMjlmLTRkMjctOTgzOC0xZjc5ODUzMmMwNjEifQ._L1hfMCIJMkWAyJlyxmw3srbICnaztOVIiwJmkTLXzI",
  "access_expires_at": "2026-10-30T12:37:25.708634566Z",
  "refresh_token": "e_iMAnpHDyUZE858wnh2jFDGPhfwauf2hYSYvfacfJA",
  "refresh_expires_at": "2026-11-29T12:22:25.7080483Z",
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
      "actor_id": "c2b31b2b-8610-441e-a39e-de6e6485310e",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T12:22:07.862411Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "c2b31b2b-8610-441e-a39e-de6e6485310e",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T12:22:09.358465Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "16cde7d6-ee65-4ffa-86ff-58423b9aa67c",
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
  "device_ref": "sandbox-4920"
}
```

```json
{
  "challenge_id": "549d2f00-6501-4d5f-bf18-20fdea8f1cf9",
  "expires_at": "2026-10-30T12:27:26.881096483Z",
  "resend_available_at": "2026-10-30T12:22:27.881096483Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "855867",
  "sent_at": "2026-10-30T12:22:26.883583219Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "549d2f00-6501-4d5f-bf18-20fdea8f1cf9",
  "code": "855867",
  "device_ref": "sandbox-4920"
}
```

```json
{
  "session_id": "8cb0ace5-4c02-4c32-9ce5-28ca3b769574",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Mzg0NywiaWF0IjoxNzkzMzYyOTQ3LCJqdGkiOiI2ZDE0ZGU5MS1kZGY2LTRhMzQtYTY1Yi0xNTZlMWQ3MzdlOTEiLCJzaWQiOiI4Y2IwYWNlNS00YzAyLTRjMzItOWNlNS0yOGNhM2I3Njk1NzQifQ.eIAzYZxTQ7n06Pp8MGEdKCxKQzzPGSSYYl9DCO9KhjQ",
  "access_expires_at": "2026-10-30T12:37:27.195889499Z",
  "refresh_token": "1sdXBDhDDBfFfQG0VVAoDYjRABGFJin7f_nebCrBHHQ",
  "refresh_expires_at": "2026-11-29T12:22:27.195292529Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "79ba9ed1-7a0b-427e-91f2-6ed6e7963b93",
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
  "last_heartbeat_at": "2026-10-30T12:21:45.605337Z",
  "last_location_at": "2026-10-30T12:21:45.605337Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/79ba9ed1-7a0b-427e-91f2-6ed6e7963b93/handover` → **200**

```json
{
  "command_id": "f950d875-c9c7-46d7-954d-bdec679f1e97",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "79ba9ed1-7a0b-427e-91f2-6ed6e7963b93",
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
  "last_heartbeat_at": "2026-10-30T12:21:45.605337Z",
  "last_location_at": "2026-10-30T12:21:45.605337Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

(the car drives 6 s to the next point)

`POST /api/driver/v1/work-sessions/79ba9ed1-7a0b-427e-91f2-6ed6e7963b93/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:22:34Z",
    "sequence": 1793362954804
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "79ba9ed1-7a0b-427e-91f2-6ed6e7963b93",
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
  "last_heartbeat_at": "2026-10-30T12:22:34.09792Z",
  "last_location_at": "2026-10-30T12:22:34.09792Z",
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
  "command_id": "e1f52924-8720-417c-ba29-5122aec5ea0a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:22:34Z",
    "sequence": 1793362954805
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "12cd0c53-071f-44d9-b147-b658c7619adc",
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
  "last_heartbeat_at": "2026-10-30T12:22:34.701621Z",
  "last_location_at": "2026-10-30T12:22:34.701621Z",
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
  "session_id": "ad48720a-47d8-4482-9661-5def5646f4ca",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjM4NTUsImlhdCI6MTc5MzM2Mjk1NSwianRpIjoiMDNhZWYyMmYtYmY3MC00MjE0LWE3OWQtYTFiZWU5MGM4ZDg5Iiwic2lkIjoiYWQ0ODcyMGEtNDdkOC00NDgyLTk2NjEtNWRlZjU2NDZmNGNhIn0.6T_fPkVTd8sgZ9sCBHBuR1-k-OfyOvR8Y3zNF3Pq-Bk",
  "access_expires_at": "2026-10-30T12:37:35.287470311Z",
  "refresh_token": "emKS05fx_zR8pML2yyVQseJNcgGmuljDikSkWSR8zW4",
  "refresh_expires_at": "2026-10-31T00:22:35.286901211Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c6c3f942-43e0-4dfa-bddd-7f119184ad95",
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
  "id": "2f88d6e9-67e3-4de8-b0c3-76c748aec03e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:27:35.579658Z",
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
  "command_id": "8ba5cb80-38b7-4832-a8e6-ba1fa2d35123",
  "quote_id": "2f88d6e9-67e3-4de8-b0c3-76c748aec03e",
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
  "id": "de6c5a0d-8046-41ba-ba34-8a436dd89b88",
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
  "created_at": "2026-10-30T12:22:35.883647Z",
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
    "id": "90338445-5ae0-4b8d-87b5-c640b20048b2",
    "order_id": "de6c5a0d-8046-41ba-ba34-8a436dd89b88",
    "expires_at": "2026-10-30T12:22:50.887476Z",
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

`POST /api/driver/v1/offers/90338445-5ae0-4b8d-87b5-c640b20048b2/accept` → **200**

```json
{
  "command_id": "4b96b137-aa03-4703-a7ae-d765f4488712"
}
```

```json
{
  "id": "8ca38e88-a3f0-4cac-a71e-872f7c8ccd63",
  "order_id": "de6c5a0d-8046-41ba-ba34-8a436dd89b88",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "78420fff-906d-43da-a40d-30214d8c1a92",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "78420fff-906d-43da-a40d-30214d8c1a92",
  "order_id": "de6c5a0d-8046-41ba-ba34-8a436dd89b88",
  "assignment_id": "8ca38e88-a3f0-4cac-a71e-872f7c8ccd63",
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

`POST /api/driver/v1/work-sessions/12cd0c53-071f-44d9-b147-b658c7619adc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:22:46Z",
    "sequence": 1793362966377
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "12cd0c53-071f-44d9-b147-b658c7619adc",
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
  "last_heartbeat_at": "2026-10-30T12:22:46.395548Z",
  "last_location_at": "2026-10-30T12:22:46.395548Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/78420fff-906d-43da-a40d-30214d8c1a92/arrive` → **200**

```json
{
  "command_id": "c5c3f96e-3b6f-4580-a37e-4927e512b92d",
  "expected_version": 0
}
```

```json
{
  "id": "78420fff-906d-43da-a40d-30214d8c1a92",
  "order_id": "de6c5a0d-8046-41ba-ba34-8a436dd89b88",
  "assignment_id": "8ca38e88-a3f0-4cac-a71e-872f7c8ccd63",
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
  "arrived_at": "2026-10-30T12:22:46.69442Z",
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

`POST /api/driver/v1/trips/78420fff-906d-43da-a40d-30214d8c1a92/start` → **200**

```json
{
  "command_id": "cb4427e1-da01-43c5-b008-917c14958eb1",
  "expected_version": 1
}
```

```json
{
  "id": "78420fff-906d-43da-a40d-30214d8c1a92",
  "order_id": "de6c5a0d-8046-41ba-ba34-8a436dd89b88",
  "assignment_id": "8ca38e88-a3f0-4cac-a71e-872f7c8ccd63",
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
  "arrived_at": "2026-10-30T12:22:46.69442Z",
  "started_at": "2026-10-30T12:22:47.018558Z",
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

`POST /api/driver/v1/trips/78420fff-906d-43da-a40d-30214d8c1a92/complete` → **200**

```json
{
  "command_id": "1088f165-0274-4631-88ca-4afbad552391",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:22:47Z",
  "cash_received": true
}
```

```json
{
  "id": "78420fff-906d-43da-a40d-30214d8c1a92",
  "order_id": "de6c5a0d-8046-41ba-ba34-8a436dd89b88",
  "assignment_id": "8ca38e88-a3f0-4cac-a71e-872f7c8ccd63",
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
  "arrived_at": "2026-10-30T12:22:46.69442Z",
  "started_at": "2026-10-30T12:22:47.018558Z",
  "completed_at": "2026-10-30T12:22:47.327343Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/de6c5a0d-8046-41ba-ba34-8a436dd89b88` → **200**

```json
{
  "id": "de6c5a0d-8046-41ba-ba34-8a436dd89b88",
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
    "id": "8ca38e88-a3f0-4cac-a71e-872f7c8ccd63",
    "order_id": "de6c5a0d-8046-41ba-ba34-8a436dd89b88",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "78420fff-906d-43da-a40d-30214d8c1a92",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:22:35.883647Z",
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
  "session_id": "79ba9ed1-7a0b-427e-91f2-6ed6e7963b93",
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
  "last_heartbeat_at": "2026-10-30T12:22:34.09792Z",
  "last_location_at": "2026-10-30T12:22:34.09792Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/79ba9ed1-7a0b-427e-91f2-6ed6e7963b93/close` → **200**

```json
{
  "command_id": "5acc42e4-88b7-41ac-a12a-01ccc820a1b0",
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
  "session_id": "12cd0c53-071f-44d9-b147-b658c7619adc",
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
  "last_heartbeat_at": "2026-10-30T12:22:46.395548Z",
  "last_location_at": "2026-10-30T12:22:46.395548Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/12cd0c53-071f-44d9-b147-b658c7619adc/close` → **200**

```json
{
  "command_id": "9b30e8aa-638d-48ad-a7a7-94f33f6d1f48",
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

Done: terminal order de6c5a0d-8046-41ba-ba34-8a436dd89b88 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14686"
}
```

```json
{
  "challenge_id": "ac502470-3942-4160-bb93-769a8e2c1365",
  "expires_at": "2026-10-30T12:27:52.400715823Z",
  "resend_available_at": "2026-10-30T12:22:53.400715823Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "788723",
  "sent_at": "2026-10-30T12:22:52.403449763Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ac502470-3942-4160-bb93-769a8e2c1365",
  "code": "788723",
  "device_ref": "sandbox-14686"
}
```

```json
{
  "session_id": "e8f9be8b-a6ec-455e-94bb-613a6df38e48",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Mzg3MiwiaWF0IjoxNzkzMzYyOTcyLCJqdGkiOiJjODViZmZjOC0yYmJmLTRjMWQtYWNlOS1iZDU3NmM3ZWM5YTIiLCJzaWQiOiJlOGY5YmU4Yi1hNmVjLTQ1NWUtOTRiYi02MTNhNmRmMzhlNDgifQ.XZoI9xhaWTKJ0oEkIqgq96-xjhbqIuqzGHFAC-ljMnY",
  "access_expires_at": "2026-10-30T12:37:52.719113603Z",
  "refresh_token": "bLOL5C4wDxlLxeYUgIx22wdiMNWW9etlYnLikJmlIPE",
  "refresh_expires_at": "2026-11-29T12:22:52.718412991Z",
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
  "device_ref": "sandbox-29105"
}
```

```json
{
  "challenge_id": "ba6450ad-9cbb-48d4-bd44-95a4426cb4c4",
  "expires_at": "2026-10-30T12:27:53.30217961Z",
  "resend_available_at": "2026-10-30T12:22:54.30217961Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "585372",
  "sent_at": "2026-10-30T12:22:53.304842331Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ba6450ad-9cbb-48d4-bd44-95a4426cb4c4",
  "code": "585372",
  "device_ref": "sandbox-29105"
}
```

```json
{
  "session_id": "bcd7fd52-5c43-4871-b0bb-b17f658f55c2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Mzg3MywiaWF0IjoxNzkzMzYyOTczLCJqdGkiOiI0ZDY2YmFjOC03YmIyLTRjODAtOWQ2NC02MjdjNzAyMzlhNTIiLCJzaWQiOiJiY2Q3ZmQ1Mi01YzQzLTQ4NzEtYjBiYi1iMTdmNjU4ZjU1YzIifQ._8avJvpDT0s0gzYOoKzCYm9LwPlQMwDXcQSmGbFNjzA",
  "access_expires_at": "2026-10-30T12:37:53.622451081Z",
  "refresh_token": "gqRtvKW10ynUI8vcD9F3_Qhj9PV7tt9iIPYecqJZ9wo",
  "refresh_expires_at": "2026-11-29T12:22:53.621856718Z",
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
  "device_ref": "sandbox-23584"
}
```

```json
{
  "challenge_id": "7f088582-c91e-43d5-b221-364a026c2fdb",
  "expires_at": "2026-10-30T12:27:54.186455784Z",
  "resend_available_at": "2026-10-30T12:22:55.186455784Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "612771",
  "sent_at": "2026-10-30T12:22:54.188956639Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f088582-c91e-43d5-b221-364a026c2fdb",
  "code": "612771",
  "device_ref": "sandbox-23584"
}
```

```json
{
  "session_id": "2c79305c-87f6-4cd4-b4cc-1599c6ad4ca0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Mzg3NCwiaWF0IjoxNzkzMzYyOTc0LCJqdGkiOiIzMTgwNDFkZi01MGRmLTRlZDUtYjY0My0wOWYzNGFlNjc0YTAiLCJzaWQiOiIyYzc5MzA1Yy04N2Y2LTRjZDQtYjRjYy0xNTk5YzZhZDRjYTAifQ.vO4ImQKb6eZ6Dng39B77-UbGpKMKYjMmRdxZGsGIJdw",
  "access_expires_at": "2026-10-30T12:37:54.499353754Z",
  "refresh_token": "F4BLuhFy1RaS_wEPS8jjJ80F6gEfNM_D6ELLmjSunaw",
  "refresh_expires_at": "2026-11-29T12:22:54.498748871Z",
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
  "phone": "+380699745826",
  "device_ref": "sandbox-26361"
}
```

```json
{
  "challenge_id": "c4481c5f-a55b-4ea2-9ec2-7b63ce61cd1a",
  "expires_at": "2026-10-30T12:27:55.072665356Z",
  "resend_available_at": "2026-10-30T12:22:56.072665356Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380699745826` → **200**

```json
{
  "phone": "+380699745826",
  "audience": "CLIENT",
  "code": "611404",
  "sent_at": "2026-10-30T12:22:55.075164756Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c4481c5f-a55b-4ea2-9ec2-7b63ce61cd1a",
  "code": "611404",
  "device_ref": "sandbox-26361"
}
```

```json
{
  "session_id": "03ab83ea-9a2d-4a8a-93e3-56bab641abbc",
  "subject": {
    "type": "CLIENT",
    "id": "b9301d52-a106-4167-adaa-d222f5a91d7c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOTMwMWQ1Mi1hMTA2LTQxNjctYWRhYS1kMjIyZjVhOTFkN2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzODc1LCJpYXQiOjE3OTMzNjI5NzUsImp0aSI6IjhlMTkxM2ZlLTQxZWUtNGNiNy05NjFhLWE1OTM3MWI1YTkxNCIsInNpZCI6IjAzYWI4M2VhLTlhMmQtNGE4YS05M2UzLTU2YmFiNjQxYWJiYyJ9.A01qAIskcyzTK9VASbiibhp5ucqlX_w1ZHCOyb_e66E",
  "access_expires_at": "2026-10-30T12:37:55.392109637Z",
  "refresh_token": "37Lu-hZeleVX4GULP7q_tmA9GChjWHxQxQ3OxIFb2Ns",
  "refresh_expires_at": "2026-11-29T12:22:55.391583971Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "636e0359-ca72-4c38-afb8-695bca1ec2fb",
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
  "id": "9cdebee4-7015-4016-b797-d7d574d50473",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:27:55.687299Z",
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
  "command_id": "c6dac4d8-ae8f-4616-93c0-099bb0ec24fd",
  "quote_id": "9cdebee4-7015-4016-b797-d7d574d50473",
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
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:22:55.980516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:22:55.980516Z",
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
  "blizz_sms_sent_total": 77
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 11.886230081
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.714696733
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 6.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.194905319
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
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 70.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/e83ca3d3-06ad-4529-9e14-0d05a390e91f` → **200**

```json
{
  "id": "e83ca3d3-06ad-4529-9e14-0d05a390e91f",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b9301d52-a106-4167-adaa-d222f5a91d7c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:22:55.980516Z",
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
  "session_id": "51160f4b-4043-4e5b-9f7b-e6dddb877199",
  "subject": {
    "type": "STAFF",
    "id": "c2b31b2b-8610-441e-a39e-de6e6485310e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmIzMWIyYi04NjEwLTQ0MWUtYTM5ZS1kZTZlNjQ4NTMxMGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQwNTcsImlhdCI6MTc5MzM2MzE1NywianRpIjoiZjMwNjNjNTQtYTllZS00Mzc5LWEzODEtNGViYWRjNjE5YzJlIiwic2lkIjoiNTExNjBmNGItNDA0My00ZTViLTlmN2ItZTZkZGRiODc3MTk5In0.hOFK25GrrMgenxo33tJCf05uRVACU5MnbDzoUGlLdHo",
  "access_expires_at": "2026-10-30T12:40:57.787080803Z",
  "refresh_token": "JYfBvpJQKVl4EAXndf1mWG9trf-NhwdHl7cMF9qv2jc",
  "refresh_expires_at": "2026-10-31T00:25:57.786052206Z",
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
  "id": "66992382-c5e3-4a39-9646-b18215b647a6",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T12:25:58.118932Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T12:25:58.118968Z",
  "updated_at": "2026-10-30T12:25:58.136648Z",
  "finished_at": "2026-10-30T12:25:58.136648Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/66992382-c5e3-4a39-9646-b18215b647a6` → **200**

```json
{
  "run": {
    "id": "66992382-c5e3-4a39-9646-b18215b647a6",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T12:25:58.118932Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T12:25:58.118968Z",
    "updated_at": "2026-10-30T12:25:58.136648Z",
    "finished_at": "2026-10-30T12:25:58.136648Z",
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
  "id": "66992382-c5e3-4a39-9646-b18215b647a6",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T12:25:58.118932Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T12:25:58.118968Z",
  "updated_at": "2026-10-30T12:25:58.136648Z",
  "finished_at": "2026-10-30T12:25:58.136648Z",
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
  "id": "66992382-c5e3-4a39-9646-b18215b647a6",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T12:25:58.118932Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T12:25:58.118968Z",
  "updated_at": "2026-10-30T12:25:58.136648Z",
  "finished_at": "2026-10-30T12:25:58.136648Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/03d015bb-b622-48a4-b0eb-c208f8a9dc41` → **204**

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
  "id": "d19ede9d-24d0-42be-bcea-4766595b885e",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T12:25:58.610359Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T12:25:58.610395Z",
  "updated_at": "2026-10-30T12:25:58.618687Z",
  "finished_at": "2026-10-30T12:25:58.618687Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/d19ede9d-24d0-42be-bcea-4766595b885e` → **200**

```json
{
  "run": {
    "id": "d19ede9d-24d0-42be-bcea-4766595b885e",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T12:25:58.610359Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T12:25:58.610395Z",
    "updated_at": "2026-10-30T12:25:58.618687Z",
    "finished_at": "2026-10-30T12:25:58.618687Z",
    "version": 1
  },
  "items": [
    {
      "id": "c64de847-b376-4488-8c0e-95e0b865961a",
      "run_id": "d19ede9d-24d0-42be-bcea-4766595b885e",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "405e22cadea1c6379d634033e05f1b12f6096b68ff4a9db27ca394b086a95120",
      "reference_display": "sandbox-reconciliation-03d015bb-b622-48a4-b0eb-c208f8a9dc41",
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
      "provider_at": "2026-10-30T12:25:58Z",
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
  "id": "d19ede9d-24d0-42be-bcea-4766595b885e",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T12:25:58.610359Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T12:25:58.610395Z",
  "updated_at": "2026-10-30T12:25:58.618687Z",
  "finished_at": "2026-10-30T12:25:58.618687Z",
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
  "id": "d19ede9d-24d0-42be-bcea-4766595b885e",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T12:25:58.610359Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T12:25:58.610395Z",
  "updated_at": "2026-10-30T12:25:58.618687Z",
  "finished_at": "2026-10-30T12:25:58.618687Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/c64de847-b376-4488-8c0e-95e0b865961a/resolve` → **200**

```json
{
  "command_id": "b457ebaa-c800-4d85-8fa3-72866f221eb5",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "c64de847-b376-4488-8c0e-95e0b865961a",
  "run_id": "d19ede9d-24d0-42be-bcea-4766595b885e",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "405e22cadea1c6379d634033e05f1b12f6096b68ff4a9db27ca394b086a95120",
  "reference_display": "sandbox-reconciliation-03d015bb-b622-48a4-b0eb-c208f8a9dc41",
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
  "provider_at": "2026-10-30T12:25:58Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "resolved_at": "2026-10-30T12:25:59.03324Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/c64de847-b376-4488-8c0e-95e0b865961a/resolve` → **200**

```json
{
  "command_id": "b457ebaa-c800-4d85-8fa3-72866f221eb5",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "c64de847-b376-4488-8c0e-95e0b865961a",
  "run_id": "d19ede9d-24d0-42be-bcea-4766595b885e",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "405e22cadea1c6379d634033e05f1b12f6096b68ff4a9db27ca394b086a95120",
  "reference_display": "sandbox-reconciliation-03d015bb-b622-48a4-b0eb-c208f8a9dc41",
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
  "provider_at": "2026-10-30T12:25:58Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
  "resolved_at": "2026-10-30T12:25:59.03324Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/c64de847-b376-4488-8c0e-95e0b865961a/resolve` → **409**

```json
{
  "command_id": "487588cc-0737-4f0e-9c10-4e8a178b1b10",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/c64de847-b376-4488-8c0e-95e0b865961a/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ab5823cc-aa84-4187-a22f-40cb5290ba93"
}
```

`GET /api/admin/v1/payment-reconciliations/d19ede9d-24d0-42be-bcea-4766595b885e` → **200**

```json
{
  "run": {
    "id": "d19ede9d-24d0-42be-bcea-4766595b885e",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T12:25:58.610359Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T12:25:58.610395Z",
    "updated_at": "2026-10-30T12:25:59.03324Z",
    "finished_at": "2026-10-30T12:25:58.618687Z",
    "version": 2
  },
  "items": [
    {
      "id": "c64de847-b376-4488-8c0e-95e0b865961a",
      "run_id": "d19ede9d-24d0-42be-bcea-4766595b885e",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "405e22cadea1c6379d634033e05f1b12f6096b68ff4a9db27ca394b086a95120",
      "reference_display": "sandbox-reconciliation-03d015bb-b622-48a4-b0eb-c208f8a9dc41",
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
      "provider_at": "2026-10-30T12:25:58Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "c2b31b2b-8610-441e-a39e-de6e6485310e",
      "resolved_at": "2026-10-30T12:25:59.03324Z",
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
      "id": "d19ede9d-24d0-42be-bcea-4766595b885e",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T12:25:58.610359Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T12:25:58.610395Z",
      "updated_at": "2026-10-30T12:25:59.03324Z",
      "finished_at": "2026-10-30T12:25:58.618687Z",
      "version": 2
    },
    {
      "id": "e48119f6-721e-45f7-bda0-fb1c1c80998e",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T12:06:38.571195Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T12:06:38.571508Z",
      "updated_at": "2026-10-30T12:06:38.579184Z",
      "finished_at": "2026-10-30T12:06:38.579184Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/03d015bb-b622-48a4-b0eb-c208f8a9dc41` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "d19ede9d-24d0-42be-bcea-4766595b885e",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T12:25:58.610359Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T12:25:58.610395Z",
  "updated_at": "2026-10-30T12:25:59.03324Z",
  "finished_at": "2026-10-30T12:25:58.618687Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793363283947E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793363284369E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.79336328437E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793363283947E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793363284371E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
