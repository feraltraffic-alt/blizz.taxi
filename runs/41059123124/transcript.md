# Sandbox transcript (2026-10-30T12:57:10Z, 94df537)

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
  "correlation_id": "f47f2fde-81bb-436e-a0bb-3f79e6a03586"
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
  "session_id": "cc55fcb0-e481-45ee-a7e9-b3d79cd06d15",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU5NDAsImlhdCI6MTc5MzM2NTA0MCwianRpIjoiODZhYTZmYTctNjA2Zi00MGQ0LWE2NDYtNTVlZWU4M2EzYjE1Iiwic2lkIjoiY2M1NWZjYjAtZTQ4MS00NWVlLWE3ZTktYjNkNzljZDA2ZDE1In0.BO-ctqFnMOHwCL4iHBv8_vY3jIRUTD65fFCbGDQo_e8",
  "access_expires_at": "2026-10-30T13:12:20.040331252Z",
  "refresh_token": "dHqhPBOtpaq6ScSOjbudzNCJ7GnGeo2xOISzVfeUZfI",
  "refresh_expires_at": "2026-10-31T00:57:20.03808893Z",
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
  "session_id": "7f6035ba-3c88-4cde-9313-f94fd26d7c22",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU5NDIsImlhdCI6MTc5MzM2NTA0MiwianRpIjoiODY4Y2UwN2UtZWE5Ni00ZTZjLTk4MzgtNTc3NTJhMDdiMTU4Iiwic2lkIjoiN2Y2MDM1YmEtM2M4OC00Y2RlLTkzMTMtZjk0ZmQyNmQ3YzIyIn0.C_HYJm0OuWiZTRZrMrPyKLcP2SVHA0uQhBu_uY8GWZM",
  "access_expires_at": "2026-10-30T13:12:22.118243121Z",
  "refresh_token": "UWW2CBkK0JocSb6xiStB_kIpfPON1H6gTxpJVL74Qnk",
  "refresh_expires_at": "2026-10-31T00:57:22.117168857Z",
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
  "device_ref": "sandbox-1204"
}
```

```json
{
  "challenge_id": "8034c8c7-d135-4705-a815-bb51017b4c88",
  "expires_at": "2026-10-30T13:02:22.762522632Z",
  "resend_available_at": "2026-10-30T12:57:23.762522632Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "095811",
  "sent_at": "2026-10-30T12:57:22.775816004Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8034c8c7-d135-4705-a815-bb51017b4c88",
  "code": "095811",
  "device_ref": "sandbox-1204"
}
```

```json
{
  "session_id": "bbfce772-ac87-4df1-b6c0-69409425cf2b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTk0MywiaWF0IjoxNzkzMzY1MDQzLCJqdGkiOiJkNWJlNWUzMi1lZWYxLTQzODctYWFiZC0wNmFhNjA2NmU1OWUiLCJzaWQiOiJiYmZjZTc3Mi1hYzg3LTRkZjEtYjZjMC02OTQwOTQyNWNmMmIifQ.b6cqhwFo5SaB-I2rIjZ40L4pCShn2HvBmn211mtMSqQ",
  "access_expires_at": "2026-10-30T13:12:23.11724376Z",
  "refresh_token": "c-VUUxtugU7Aj42O9bEJeXKe6hUc09rho22WF2MGVPY",
  "refresh_expires_at": "2026-11-29T12:57:23.116203791Z",
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
  "command_id": "061a66b2-976c-44e2-8e08-07b15536ebe9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:57:23Z",
    "sequence": 1793365043706
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e38ac5e-8161-4957-a1a7-1a9c1f861760",
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
  "last_heartbeat_at": "2026-10-30T12:57:23.838709Z",
  "last_location_at": "2026-10-30T12:57:23.838709Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635580112",
  "device_ref": "sandbox-3283"
}
```

```json
{
  "challenge_id": "e6e7e087-dacb-431e-9988-a643bc6fa97d",
  "expires_at": "2026-10-30T13:02:24.144654675Z",
  "resend_available_at": "2026-10-30T12:57:25.144654675Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635580112` → **200**

```json
{
  "phone": "+380635580112",
  "audience": "CLIENT",
  "code": "425932",
  "sent_at": "2026-10-30T12:57:24.149296178Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e6e7e087-dacb-431e-9988-a643bc6fa97d",
  "code": "425932",
  "device_ref": "sandbox-3283"
}
```

```json
{
  "session_id": "0f0558bf-46fa-474a-91b4-283aeb63766f",
  "subject": {
    "type": "CLIENT",
    "id": "c4a193e5-0b55-4fd0-abdd-e3eba2a6e0c0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExOTNlNS0wYjU1LTRmZDAtYWJkZC1lM2ViYTJhNmUwYzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1OTQ0LCJpYXQiOjE3OTMzNjUwNDQsImp0aSI6Ijg0YmIxZmIxLTVmZWEtNGE0Zi1iODJiLTFjNWM1YTg4Y2IwZSIsInNpZCI6IjBmMDU1OGJmLTQ2ZmEtNDc0YS05MWI0LTI4M2FlYjYzNzY2ZiJ9.SeD6Tj7drihY4veODsCloKjAo-4mK1QfPuk-CjX7REQ",
  "access_expires_at": "2026-10-30T13:12:24.475457962Z",
  "refresh_token": "7Sp8W3qV_3ZQgHx0TkW3HbJfU0fzWpFmsFFX_x1Een8",
  "refresh_expires_at": "2026-11-29T12:57:24.474444512Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "faba8d35-cb4d-4fed-a0b5-d3d3e3b49896",
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
  "id": "65269abb-ddee-4b0f-9af2-cb996d4bc692",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:02:24.805439Z",
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
  "command_id": "c63ea087-0529-4dd5-aa71-7a66d46a55a4",
  "quote_id": "65269abb-ddee-4b0f-9af2-cb996d4bc692",
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
  "id": "c2635c6d-250e-4080-9c4d-5546a9d03eaa",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c4a193e5-0b55-4fd0-abdd-e3eba2a6e0c0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:57:25.182543Z",
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
    "id": "5537649a-d42b-4e2b-a3f3-f16de8066af0",
    "order_id": "c2635c6d-250e-4080-9c4d-5546a9d03eaa",
    "expires_at": "2026-10-30T12:57:40.192693Z",
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

`POST /api/driver/v1/offers/5537649a-d42b-4e2b-a3f3-f16de8066af0/accept` → **200**

```json
{
  "command_id": "b174ed72-1ee1-422b-a193-0b2ccf2b9c2c"
}
```

```json
{
  "id": "54da02e2-7702-4cda-ba72-7fe337735402",
  "order_id": "c2635c6d-250e-4080-9c4d-5546a9d03eaa",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "91e8269e-8ef1-42a7-ab9e-3dd300d8df77",
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
  "command_id": "303ade21-0042-4a41-b9c3-62a63925f56a",
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
  "changed_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T12:57:26.475185297Z"
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
  "id": "91e8269e-8ef1-42a7-ab9e-3dd300d8df77",
  "order_id": "c2635c6d-250e-4080-9c4d-5546a9d03eaa",
  "assignment_id": "54da02e2-7702-4cda-ba72-7fe337735402",
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

`POST /api/driver/v1/work-sessions/2e38ac5e-8161-4957-a1a7-1a9c1f861760/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:57:27Z",
    "sequence": 1793365047411
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e38ac5e-8161-4957-a1a7-1a9c1f861760",
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
  "last_heartbeat_at": "2026-10-30T12:57:27.438815Z",
  "last_location_at": "2026-10-30T12:57:27.438815Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/91e8269e-8ef1-42a7-ab9e-3dd300d8df77/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "ef2dc13f-c488-4ade-9b15-7128b44b46d6",
  "expected_version": 0
}
```

```json
{
  "id": "91e8269e-8ef1-42a7-ab9e-3dd300d8df77",
  "order_id": "c2635c6d-250e-4080-9c4d-5546a9d03eaa",
  "assignment_id": "54da02e2-7702-4cda-ba72-7fe337735402",
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
  "arrived_at": "2026-10-30T12:57:27.747335Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/91e8269e-8ef1-42a7-ab9e-3dd300d8df77/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "946ea3e9-18f3-4f0f-ab18-3596fdf7e04b",
  "expected_version": 1
}
```

```json
{
  "id": "91e8269e-8ef1-42a7-ab9e-3dd300d8df77",
  "order_id": "c2635c6d-250e-4080-9c4d-5546a9d03eaa",
  "assignment_id": "54da02e2-7702-4cda-ba72-7fe337735402",
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
  "arrived_at": "2026-10-30T12:57:27.747335Z",
  "started_at": "2026-10-30T12:57:28.050478Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/91e8269e-8ef1-42a7-ab9e-3dd300d8df77/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "bc25909d-e4ff-4517-aa23-7360e71f1fe5",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:57:28Z",
  "cash_received": true
}
```

```json
{
  "id": "91e8269e-8ef1-42a7-ab9e-3dd300d8df77",
  "order_id": "c2635c6d-250e-4080-9c4d-5546a9d03eaa",
  "assignment_id": "54da02e2-7702-4cda-ba72-7fe337735402",
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
  "arrived_at": "2026-10-30T12:57:27.747335Z",
  "started_at": "2026-10-30T12:57:28.050478Z",
  "completed_at": "2026-10-30T12:57:28.376665Z",
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
  "session_id": "2e38ac5e-8161-4957-a1a7-1a9c1f861760",
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
  "last_heartbeat_at": "2026-10-30T12:57:27.438815Z",
  "last_location_at": "2026-10-30T12:57:27.438815Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2e38ac5e-8161-4957-a1a7-1a9c1f861760/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "22d8854e-71c6-497b-a081-d39bf62b4423",
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
  "command_id": "e7d3f133-8e00-4b0c-88f7-8512ba2facf9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:57:29Z",
    "sequence": 1793365049364
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
  "correlation_id": "7b9cf0ec-736f-4d3c-8809-cbb8eebfdd41",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "3fc4e391-1d10-4b33-8ff5-abe539d30822",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:57:29Z",
    "sequence": 1793365049686
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d1846be-f8a1-42e6-96f2-7bda04cd8a14",
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
  "last_heartbeat_at": "2026-10-30T12:57:29.711527Z",
  "last_location_at": "2026-10-30T12:57:29.711527Z",
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
  "changed_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T12:57:26.475185Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "9228843c-0376-4adb-9e61-1d0e8c55e86e",
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
  "changed_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T12:57:30.318096301Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d1846be-f8a1-42e6-96f2-7bda04cd8a14",
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
  "last_heartbeat_at": "2026-10-30T12:57:29.711527Z",
  "last_location_at": "2026-10-30T12:57:29.711527Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3d1846be-f8a1-42e6-96f2-7bda04cd8a14/close` → **200**

```json
{
  "command_id": "49973345-d658-439c-8af7-1bd67ffb5b7c",
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
  "session_id": "7aa0808a-42de-459d-a7d0-3db29d3ef4b2",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU5NTEsImlhdCI6MTc5MzM2NTA1MSwianRpIjoiZWJlOGZjYTUtM2UyZC00N2Y2LTllMTQtZTIzN2M4N2ZmNzBmIiwic2lkIjoiN2FhMDgwOGEtNDJkZS00NTlkLWE3ZDAtM2RiMjlkM2VmNGIyIn0.x_fvruQQnVlYFaWgx7Xn_tzps21LTlLuo-JI6foomCE",
  "access_expires_at": "2026-10-30T13:12:31.558368536Z",
  "refresh_token": "Kpk7Llf-VVI6-CNThWK0HFMtwZFBEPrgbLMZqOCPmNw",
  "refresh_expires_at": "2026-10-31T00:57:31.55744579Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "5b2a6120-792a-4840-857d-d62e77879313",
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
  "id": "eafa81a3-11b4-4f96-8193-3625af25029a",
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
  "created_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "created_at": "2026-10-30T12:57:31.856709Z",
  "updated_at": "2026-10-30T12:57:31.856709Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630853426",
  "device_ref": "sandbox-10228"
}
```

```json
{
  "challenge_id": "e7cfcde9-0f28-4a86-aebe-0aaa1277596c",
  "expires_at": "2026-10-30T13:02:32.168964927Z",
  "resend_available_at": "2026-10-30T12:57:33.168964927Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630853426` → **200**

```json
{
  "phone": "+380630853426",
  "audience": "CLIENT",
  "code": "861787",
  "sent_at": "2026-10-30T12:57:32.174151532Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e7cfcde9-0f28-4a86-aebe-0aaa1277596c",
  "code": "861787",
  "device_ref": "sandbox-10228"
}
```

```json
{
  "session_id": "ae5d4d82-c170-4e92-8da9-a41de27c5d1b",
  "subject": {
    "type": "CLIENT",
    "id": "f902055d-e8a9-4aea-9fe2-4c14ef8b66fd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmOTAyMDU1ZC1lOGE5LTRhZWEtOWZlMi00YzE0ZWY4YjY2ZmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1OTUyLCJpYXQiOjE3OTMzNjUwNTIsImp0aSI6IjNhYTY3YWExLWEyYzktNDc0MC05NGM0LTNmYzM0MDFmYWVlYyIsInNpZCI6ImFlNWQ0ZDgyLWMxNzAtNGU5Mi04ZGE5LWE0MWRlMjdjNWQxYiJ9.8gi3VeNjs93-950ZuD5EVzVVo5jcegC8Sa3BMjPNAJY",
  "access_expires_at": "2026-10-30T13:12:32.499122299Z",
  "refresh_token": "-6huR9Bx7TUl58AbyD8J9nY9TpRvMsCoOpQlPkYDjUA",
  "refresh_expires_at": "2026-11-29T12:57:32.49825254Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630853426` → **200**

```json
{
  "client_id": "f902055d-e8a9-4aea-9fe2-4c14ef8b66fd"
}
```

`POST /api/admin/v1/rider-wallets/f902055d-e8a9-4aea-9fe2-4c14ef8b66fd/top-ups` → **201**

```json
{
  "command_id": "968e683f-6043-4ffe-b696-bb9c9e16c756",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "f902055d-e8a9-4aea-9fe2-4c14ef8b66fd",
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
      "id": "14355924-ba74-4b81-9f41-5a04fc471144",
      "at": "2026-10-30T12:57:33.086832Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "197a1567-13a8-45cc-97c5-dac2fb0425b1",
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
  "id": "9a6ea82b-7f13-4d39-9ca8-1a36bda59aa0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:02:33.406420Z",
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
      "id": "eafa81a3-11b4-4f96-8193-3625af25029a",
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
  "device_ref": "sandbox-13421"
}
```

```json
{
  "challenge_id": "d9a2a388-bf7f-4a43-b2b3-ff8c65ba2dd6",
  "expires_at": "2026-10-30T13:02:33.710482231Z",
  "resend_available_at": "2026-10-30T12:57:34.710482231Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "888726",
  "sent_at": "2026-10-30T12:57:33.715225949Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d9a2a388-bf7f-4a43-b2b3-ff8c65ba2dd6",
  "code": "888726",
  "device_ref": "sandbox-13421"
}
```

```json
{
  "session_id": "664f0454-44b7-4e59-90c8-6382b18f5d14",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTk1NCwiaWF0IjoxNzkzMzY1MDU0LCJqdGkiOiIwODQ4ZTg2NC1lNTM0LTRhOGUtOWVmNy02ZTJkMGI4MGNlZTciLCJzaWQiOiI2NjRmMDQ1NC00NGI3LTRlNTktOTBjOC02MzgyYjE4ZjVkMTQifQ.xaxwL4fZEWoZlmVDPFtyAsGMdnZLmpOsuQe-iq9tIt4",
  "access_expires_at": "2026-10-30T13:12:34.032906919Z",
  "refresh_token": "Q8eLErkHsK2TDwnbVtOH6I8ij-Rj-UN6ACCrsgoSuhk",
  "refresh_expires_at": "2026-11-29T12:57:34.032247109Z",
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
  "command_id": "46480c9b-bc19-4b6b-b526-8abc327ef364",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:57:34Z",
    "sequence": 1793365054627
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2063de9c-cf7a-4bfd-8e0b-a6ccb6c09d25",
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
  "last_heartbeat_at": "2026-10-30T12:57:34.649805Z",
  "last_location_at": "2026-10-30T12:57:34.649805Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "38103d5e-4861-486e-abe0-626bbdeade8a",
  "quote_id": "9a6ea82b-7f13-4d39-9ca8-1a36bda59aa0",
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
  "id": "a98bbd73-3a81-466c-88a7-ba331561dc0e",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f902055d-e8a9-4aea-9fe2-4c14ef8b66fd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:57:34.959833Z",
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
  "client_id": "f902055d-e8a9-4aea-9fe2-4c14ef8b66fd",
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
      "id": "14355924-ba74-4b81-9f41-5a04fc471144",
      "at": "2026-10-30T12:57:33.086832Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
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
    "id": "354181a1-aca7-42e2-809e-d4d4971743d7",
    "order_id": "a98bbd73-3a81-466c-88a7-ba331561dc0e",
    "expires_at": "2026-10-30T12:57:49.967565Z",
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

`POST /api/driver/v1/offers/354181a1-aca7-42e2-809e-d4d4971743d7/accept` → **200**

```json
{
  "command_id": "d450ec90-1e83-47e6-b82b-74ecd5c8861b"
}
```

```json
{
  "id": "8f07b3c0-ed75-46b6-8390-ba72527dba33",
  "order_id": "a98bbd73-3a81-466c-88a7-ba331561dc0e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "af1f04f0-73fe-4fa1-aa9a-c91d7a8349d7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "af1f04f0-73fe-4fa1-aa9a-c91d7a8349d7",
  "order_id": "a98bbd73-3a81-466c-88a7-ba331561dc0e",
  "assignment_id": "8f07b3c0-ed75-46b6-8390-ba72527dba33",
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

`POST /api/driver/v1/work-sessions/2063de9c-cf7a-4bfd-8e0b-a6ccb6c09d25/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:57:38Z",
    "sequence": 1793365058456
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2063de9c-cf7a-4bfd-8e0b-a6ccb6c09d25",
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
  "last_heartbeat_at": "2026-10-30T12:57:38.478369Z",
  "last_location_at": "2026-10-30T12:57:38.478369Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/af1f04f0-73fe-4fa1-aa9a-c91d7a8349d7/arrive` → **200**

```json
{
  "command_id": "790696d6-42c2-4163-b6ca-f2a25c5b6c4c",
  "expected_version": 0
}
```

```json
{
  "id": "af1f04f0-73fe-4fa1-aa9a-c91d7a8349d7",
  "order_id": "a98bbd73-3a81-466c-88a7-ba331561dc0e",
  "assignment_id": "8f07b3c0-ed75-46b6-8390-ba72527dba33",
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
  "arrived_at": "2026-10-30T12:57:38.783219Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/af1f04f0-73fe-4fa1-aa9a-c91d7a8349d7/start` → **200**

```json
{
  "command_id": "e42a66ab-7cdd-4eb5-ab31-74615676885a",
  "expected_version": 1
}
```

```json
{
  "id": "af1f04f0-73fe-4fa1-aa9a-c91d7a8349d7",
  "order_id": "a98bbd73-3a81-466c-88a7-ba331561dc0e",
  "assignment_id": "8f07b3c0-ed75-46b6-8390-ba72527dba33",
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
  "arrived_at": "2026-10-30T12:57:38.783219Z",
  "started_at": "2026-10-30T12:57:39.094175Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/af1f04f0-73fe-4fa1-aa9a-c91d7a8349d7/complete` → **200**

```json
{
  "command_id": "02a95f45-2adb-4e8e-aba4-ee736d2f7249",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:57:39Z",
  "cash_received": true
}
```

```json
{
  "id": "af1f04f0-73fe-4fa1-aa9a-c91d7a8349d7",
  "order_id": "a98bbd73-3a81-466c-88a7-ba331561dc0e",
  "assignment_id": "8f07b3c0-ed75-46b6-8390-ba72527dba33",
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
  "arrived_at": "2026-10-30T12:57:38.783219Z",
  "started_at": "2026-10-30T12:57:39.094175Z",
  "completed_at": "2026-10-30T12:57:39.433122Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "f902055d-e8a9-4aea-9fe2-4c14ef8b66fd",
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
      "id": "905c792f-46e2-4dff-a83c-4c29b5a84c90",
      "at": "2026-10-30T12:57:39.491729Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "a98bbd73-3a81-466c-88a7-ba331561dc0e"
    },
    {
      "id": "14355924-ba74-4b81-9f41-5a04fc471144",
      "at": "2026-10-30T12:57:33.086832Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/eafa81a3-11b4-4f96-8193-3625af25029a/archive` → **200**

```json
{
  "command_id": "f303a3d5-e82d-42a2-a638-f73031f1c7ff",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "eafa81a3-11b4-4f96-8193-3625af25029a",
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
  "created_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "created_at": "2026-10-30T12:57:31.856709Z",
  "updated_at": "2026-10-30T12:57:43.051739Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2063de9c-cf7a-4bfd-8e0b-a6ccb6c09d25",
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
  "last_heartbeat_at": "2026-10-30T12:57:38.478369Z",
  "last_location_at": "2026-10-30T12:57:38.478369Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2063de9c-cf7a-4bfd-8e0b-a6ccb6c09d25/close` → **200**

```json
{
  "command_id": "fd806df7-3669-43c6-80aa-d26f2bfa3d2e",
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

Done: order a98bbd73-3a81-466c-88a7-ba331561dc0e.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-5529"
}
```

```json
{
  "challenge_id": "5c5bd180-00a0-4245-83b5-7422499007f9",
  "expires_at": "2026-10-30T13:02:43.955052119Z",
  "resend_available_at": "2026-10-30T12:57:44.955052119Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "387535",
  "sent_at": "2026-10-30T12:57:43.959523303Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5c5bd180-00a0-4245-83b5-7422499007f9",
  "code": "387535",
  "device_ref": "sandbox-5529"
}
```

```json
{
  "session_id": "c3136875-8627-4b6e-9d7f-1959f3d36df0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTk2NCwiaWF0IjoxNzkzMzY1MDY0LCJqdGkiOiJhMjEyYmVkNC0yZDY5LTQyOTQtOGRkZS05NDZlZDQ4MzExY2MiLCJzaWQiOiJjMzEzNjg3NS04NjI3LTRiNmUtOWQ3Zi0xOTU5ZjNkMzZkZjAifQ.D_158_osK0PM8J_mOKbakpHIc3ATDKH9m4A0UVV1Rwc",
  "access_expires_at": "2026-10-30T13:12:44.283421958Z",
  "refresh_token": "pJy_Q-8K6N4Y5APb2rsaYQnRGHTw5dpb3QQE4iiBD5o",
  "refresh_expires_at": "2026-11-29T12:57:44.282731728Z",
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
  "command_id": "5a0e9664-be4e-4b1d-8553-f4a671f8cb24",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:57:45Z",
    "sequence": 1793365065146
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "44b9d4aa-e5bf-4bb2-a806-22b4f56b3e11",
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
  "last_heartbeat_at": "2026-10-30T12:57:45.168598Z",
  "last_location_at": "2026-10-30T12:57:45.168598Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/44b9d4aa-e5bf-4bb2-a806-22b4f56b3e11/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:57:50Z",
    "sequence": 1793365070460
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "44b9d4aa-e5bf-4bb2-a806-22b4f56b3e11",
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
  "last_heartbeat_at": "2026-10-30T12:57:50.483124Z",
  "last_location_at": "2026-10-30T12:57:45.168598Z",
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
  "session_id": "4fee2e98-f4e9-41d1-91b0-93d2601c9681",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU5NzEsImlhdCI6MTc5MzM2NTA3MSwianRpIjoiMzIzODNlZDktNjgxOC00NmJhLWFiYjAtZjdmOWFkMmQzOGVmIiwic2lkIjoiNGZlZTJlOTgtZjRlOS00MWQxLTkxYjAtOTNkMjYwMWM5NjgxIn0.1dB8bimDpw3Ricwr6hhbG1VWdcv8RoSIU0dB5EwmiwQ",
  "access_expires_at": "2026-10-30T13:12:51.138312187Z",
  "refresh_token": "6UAJpLmrwdLR17uLjRZlliEkpbRcWG2t6h99FugiNpU",
  "refresh_expires_at": "2026-10-31T00:57:51.137624526Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T12:57:51.429866336Z",
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
      "last_location_at": "2026-10-30T12:57:45.168598Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/44b9d4aa-e5bf-4bb2-a806-22b4f56b3e11/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:57:51Z",
    "sequence": 1793365071735
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "44b9d4aa-e5bf-4bb2-a806-22b4f56b3e11",
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
  "last_heartbeat_at": "2026-10-30T12:57:51.756916Z",
  "last_location_at": "2026-10-30T12:57:51.756916Z",
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
  "session_id": "44b9d4aa-e5bf-4bb2-a806-22b4f56b3e11",
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
  "last_heartbeat_at": "2026-10-30T12:57:51.756916Z",
  "last_location_at": "2026-10-30T12:57:51.756916Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/44b9d4aa-e5bf-4bb2-a806-22b4f56b3e11/close` → **200**

```json
{
  "command_id": "527820bc-8b7f-4524-a1dc-b8bc61c3cf6d",
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
  "device_ref": "sandbox-18005"
}
```

```json
{
  "challenge_id": "284683a1-1b75-441d-a052-ae05cb00f7bf",
  "expires_at": "2026-10-30T13:02:52.665465004Z",
  "resend_available_at": "2026-10-30T12:57:53.665465004Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "111175",
  "sent_at": "2026-10-30T12:57:52.669654332Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "284683a1-1b75-441d-a052-ae05cb00f7bf",
  "code": "111175",
  "device_ref": "sandbox-18005"
}
```

```json
{
  "session_id": "06a4ab58-5a96-4632-b6ef-d1f7be27af38",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTk3MiwiaWF0IjoxNzkzMzY1MDcyLCJqdGkiOiI0MTcyMjc3OS0yZWNiLTQ5ODItYmNhZS1hYzY3MzRjYTk3MGIiLCJzaWQiOiIwNmE0YWI1OC01YTk2LTQ2MzItYjZlZi1kMWY3YmUyN2FmMzgifQ.c4k_k1zIMXYx2g1NW-WRHt9F1f_n6LfQ_1HN-XwP2O0",
  "access_expires_at": "2026-10-30T13:12:52.984792652Z",
  "refresh_token": "YXluBXXxKMBUkkc2iX59MPYbQb5ltUfDbH1y7ynJ36o",
  "refresh_expires_at": "2026-11-29T12:57:52.984101215Z",
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
  "device_ref": "sandbox-24296"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "cdba5f56-c417-4632-b847-6f29613ef918",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-24296"
}
```

```json
{
  "challenge_id": "195b5874-69f8-43ed-8963-106d3de7e496",
  "expires_at": "2026-10-30T13:02:54.844938318Z",
  "resend_available_at": "2026-10-30T12:57:55.844938318Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "269262",
  "sent_at": "2026-10-30T12:57:54.848557205Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "195b5874-69f8-43ed-8963-106d3de7e496",
  "code": "269262",
  "device_ref": "sandbox-24296"
}
```

```json
{
  "session_id": "127a7f69-d2c0-46f2-92bc-063dcfe24a32",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTk3NSwiaWF0IjoxNzkzMzY1MDc1LCJqdGkiOiIwMTcxZmE5My0zMDJlLTQ1YmYtYmFhZS00ZWZiYzVkNmU4NWEiLCJzaWQiOiIxMjdhN2Y2OS1kMmMwLTQ2ZjItOTJiYy0wNjNkY2ZlMjRhMzIifQ.0-S2f2y40fauUC3wjUYu323lNTwf_7JMRXtaEFtw8A4",
  "access_expires_at": "2026-10-30T13:12:55.160876986Z",
  "refresh_token": "Cq54VMq22mSr9nJTRk43lx8R_KU43IiDp_5FBUIQmGA",
  "refresh_expires_at": "2026-11-29T12:57:55.160234567Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-13358"
}
```

```json
{
  "challenge_id": "80b29cb2-a710-4201-a6c4-dc009d694eb2",
  "expires_at": "2026-10-30T13:02:55.441097024Z",
  "resend_available_at": "2026-10-30T12:57:56.441097024Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "259591",
  "sent_at": "2026-10-30T12:57:55.44502302Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80b29cb2-a710-4201-a6c4-dc009d694eb2",
  "code": "259591",
  "device_ref": "sandbox-13358"
}
```

```json
{
  "session_id": "837c78fc-14b2-48a4-bd06-cb1efe8d5294",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTk3NSwiaWF0IjoxNzkzMzY1MDc1LCJqdGkiOiIzYWQ0MDcyYy03NzE0LTQwYzItODU5OC1mZmY4MzE2ZTM2NjIiLCJzaWQiOiI4MzdjNzhmYy0xNGIyLTQ4YTQtYmQwNi1jYjFlZmU4ZDUyOTQifQ.Ei-Qy6iOHcFu_VtptP_PzdqsK0dZV5EM-ISkffelWLs",
  "access_expires_at": "2026-10-30T13:12:55.762497303Z",
  "refresh_token": "IrEljdqIRVHsDmEBElRjylJjjOHqbKw0ziw-ERxZXgo",
  "refresh_expires_at": "2026-11-29T12:57:55.761864347Z",
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
  "command_id": "5f65eb42-9833-4ade-b7e3-94f27b050c12",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:00:59Z",
    "sequence": 1793365259630
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "2e0a6928-c964-4573-9347-b50051fab816",
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
  "last_heartbeat_at": "2026-10-30T13:00:59.651725Z",
  "last_location_at": "2026-10-30T13:00:59.651725Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600199735",
  "device_ref": "sandbox-18747"
}
```

```json
{
  "challenge_id": "16d53b7b-31f2-44ae-84cb-4740ff321e91",
  "expires_at": "2026-10-30T13:05:59.971729688Z",
  "resend_available_at": "2026-10-30T13:01:00.971729688Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600199735` → **200**

```json
{
  "phone": "+48600199735",
  "audience": "CLIENT",
  "code": "084559",
  "sent_at": "2026-10-30T13:00:59.975339955Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "16d53b7b-31f2-44ae-84cb-4740ff321e91",
  "code": "084559",
  "device_ref": "sandbox-18747"
}
```

```json
{
  "session_id": "25ed7364-60e6-4247-990b-72b417c3ecb0",
  "subject": {
    "type": "CLIENT",
    "id": "28a23a4f-7f79-468d-ae51-5fb45075ac9d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOGEyM2E0Zi03Zjc5LTQ2OGQtYWU1MS01ZmI0NTA3NWFjOWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MTYwLCJpYXQiOjE3OTMzNjUyNjAsImp0aSI6ImIwYTBkNmUzLWU2ZTctNDU5My1hOGZhLTNhNzk3ZGYzYWYwNSIsInNpZCI6IjI1ZWQ3MzY0LTYwZTYtNDI0Ny05OTBiLTcyYjQxN2MzZWNiMCJ9.USdBUEaHHspCRxCEavBww1Mzu3f0yb8QJUUUS93b83g",
  "access_expires_at": "2026-10-30T13:16:00.302125963Z",
  "refresh_token": "NMgpwRG6IyBB43jK7DKoQmqjnKx-_kORB06vASx-BW4",
  "refresh_expires_at": "2026-11-29T13:01:00.301531674Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ab80dcf4-fade-4148-8da0-64f64f062c16",
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
  "id": "37676ae9-38a7-472f-a066-f23a402f2db7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:06:00.598360Z",
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
  "command_id": "fa704b2c-2d9d-42d9-be95-62705830a6b0",
  "quote_id": "37676ae9-38a7-472f-a066-f23a402f2db7",
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
  "id": "05f73268-2597-4d43-bc94-22cc1fc8eb8c",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "28a23a4f-7f79-468d-ae51-5fb45075ac9d",
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
  "created_at": "2026-10-30T13:01:00.912658Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/05f73268-2597-4d43-bc94-22cc1fc8eb8c` → **200**

```json
{
  "id": "05f73268-2597-4d43-bc94-22cc1fc8eb8c",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "28a23a4f-7f79-468d-ae51-5fb45075ac9d",
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
  "created_at": "2026-10-30T13:01:00.912658Z",
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

`POST /api/driver/v1/orders/05f73268-2597-4d43-bc94-22cc1fc8eb8c/claim` → **422**

```json
{
  "command_id": "fc5fc031-4c30-4689-8e77-7b3d0f4cacbe"
}
```

```json
{
  "instance": "/api/driver/v1/orders/05f73268-2597-4d43-bc94-22cc1fc8eb8c/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "9f1dd977-fd1f-4435-916e-ea628987ab27"
}
```

`GET /api/rider/v1/orders/05f73268-2597-4d43-bc94-22cc1fc8eb8c` → **200**

```json
{
  "id": "05f73268-2597-4d43-bc94-22cc1fc8eb8c",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "28a23a4f-7f79-468d-ae51-5fb45075ac9d",
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
  "created_at": "2026-10-30T13:01:00.912658Z",
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

`POST /api/driver/v1/orders/530fb126-5a0a-4a4e-93b2-5bc585ccbcc5/claim` → **404**

```json
{
  "command_id": "30b8aae3-dbc0-44d3-9d90-de672c3be15f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/530fb126-5a0a-4a4e-93b2-5bc585ccbcc5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1a44c0c0-029f-43ca-9acf-f34613e3d666"
}
```

`POST /api/driver/v1/orders/5a36838e-9ae0-495e-a98d-c322cc4cf784/claim` → **404**

```json
{
  "command_id": "08fb3c54-8331-48d6-9c0d-288398481d89"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5a36838e-9ae0-495e-a98d-c322cc4cf784/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "928dbc7a-d29d-4683-af27-a515cd1da616"
}
```

`POST /api/driver/v1/orders/979fbb35-d7c0-4941-9135-52d5dc903e55/claim` → **404**

```json
{
  "command_id": "bef5b814-2601-4cb6-89a4-85694288d57d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/979fbb35-d7c0-4941-9135-52d5dc903e55/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fac31a52-0233-4e4b-a09a-4e9788a27655"
}
```

`POST /api/driver/v1/orders/8c5eeb7e-2d13-4b4f-ac5c-2c1ab5a2792d/claim` → **404**

```json
{
  "command_id": "178df5ec-4ead-4866-b92a-4d30e9dacc7a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8c5eeb7e-2d13-4b4f-ac5c-2c1ab5a2792d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "75335693-6cbe-4f89-b9b4-62b141c51610"
}
```

`POST /api/driver/v1/orders/e191c9b9-7699-4b58-82fa-f681c73df7a4/claim` → **404**

```json
{
  "command_id": "25e9cdd1-4504-4319-a735-28ec40d72996"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e191c9b9-7699-4b58-82fa-f681c73df7a4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "80eb47c9-efc0-4b1e-a5d8-0a741cf0a29a"
}
```

`POST /api/driver/v1/orders/c1f77a35-0383-4d62-8cea-a5484b8f39e2/claim` → **404**

```json
{
  "command_id": "dd5acbb2-09a5-409b-aa3b-f7943d4b7f46"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c1f77a35-0383-4d62-8cea-a5484b8f39e2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9ab9d0c8-c008-430f-9337-1da9aed10bf2"
}
```

`POST /api/driver/v1/orders/86be9460-c7b1-436f-b757-5e0dac1b6868/claim` → **404**

```json
{
  "command_id": "a1fa8006-1d45-4ab2-af5d-ee05c945f6f7"
}
```

```json
{
  "instance": "/api/driver/v1/orders/86be9460-c7b1-436f-b757-5e0dac1b6868/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "abe499b4-c61a-44d7-ae09-b24502998256"
}
```

`POST /api/driver/v1/orders/d805fcc0-7b2c-4628-98b7-7d5406efe6aa/claim` → **404**

```json
{
  "command_id": "8384e0be-9e0b-4b2d-8352-062cc00f41ee"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d805fcc0-7b2c-4628-98b7-7d5406efe6aa/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "382b6eb3-f72e-48f2-94c4-3dbe3adaa5a2"
}
```

`POST /api/driver/v1/orders/69598cf1-3970-4f75-9e6e-f2373770378e/claim` → **404**

```json
{
  "command_id": "72497dbe-c132-403b-b149-8a7a64442262"
}
```

```json
{
  "instance": "/api/driver/v1/orders/69598cf1-3970-4f75-9e6e-f2373770378e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0ce71fc2-18e7-4fa9-9a99-d4750c3964bc"
}
```

`POST /api/driver/v1/orders/7d552773-f396-406f-9029-ff996abbe886/claim` → **404**

```json
{
  "command_id": "73631e4f-ad80-4619-afef-b5d835b9bf67"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7d552773-f396-406f-9029-ff996abbe886/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d184a0fe-ca28-4121-8aec-9b7efc8879c5"
}
```

`POST /api/driver/v1/orders/1edafffd-fde3-4771-acf5-08fd139f72ce/claim` → **404**

```json
{
  "command_id": "f965b373-3001-4be4-858c-ee09c5e26b7e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1edafffd-fde3-4771-acf5-08fd139f72ce/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cb9e187d-8717-4b4d-9387-e5bd7a8d12e0"
}
```

`POST /api/driver/v1/orders/e0e01622-a8ab-4a63-8939-218eb3a79ad1/claim` → **404**

```json
{
  "command_id": "a9e5ae72-fe27-49e7-ae1e-a6659e7f74c9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e0e01622-a8ab-4a63-8939-218eb3a79ad1/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "58470650-06d4-4041-841a-98c900cb8f40"
}
```

`POST /api/driver/v1/orders/b72cfa0f-9ddd-4e10-b0c7-65fd9f218bdf/claim` → **404**

```json
{
  "command_id": "540216fa-9534-46dd-bc63-23b799a88ebf"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b72cfa0f-9ddd-4e10-b0c7-65fd9f218bdf/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4b0dbea9-6966-4219-9345-373df5e8fd5d"
}
```

`POST /api/driver/v1/orders/15dde2c1-1acc-400d-ae82-2252f89280df/claim` → **404**

```json
{
  "command_id": "2803bfd9-add1-4f5b-8d84-5bbde5ec3ec5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/15dde2c1-1acc-400d-ae82-2252f89280df/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a870a9d6-058e-416b-82f4-bdf32f0cd589"
}
```

`POST /api/driver/v1/orders/6b6e4ed2-c5f7-44a6-b620-8fc319b64b93/claim` → **404**

```json
{
  "command_id": "ee5f7209-9e2e-4cca-8823-bcf5eea3d8aa"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6b6e4ed2-c5f7-44a6-b620-8fc319b64b93/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "33fa95d8-8cc4-4a3d-9730-a09db0ddffaa"
}
```

`POST /api/driver/v1/orders/d2969f9e-352e-40f7-9ae4-2ebbf84e5dea/claim` → **404**

```json
{
  "command_id": "3429b6ef-4c17-41d3-9e8d-643fdb556dd7"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d2969f9e-352e-40f7-9ae4-2ebbf84e5dea/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fed5b39a-ad70-4e4e-aa3b-47e28ac45813"
}
```

`POST /api/driver/v1/orders/4a3fbb0b-0125-481a-a195-ca3752bff165/claim` → **404**

```json
{
  "command_id": "55c6d263-9288-4a9d-a1f1-ccbaa2bf0bf9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4a3fbb0b-0125-481a-a195-ca3752bff165/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "444156f1-4e76-4a98-8bee-983a42ccfda7"
}
```

`POST /api/driver/v1/orders/439868db-0e6d-4672-b7fe-8ae511e778f5/claim` → **404**

```json
{
  "command_id": "ce6b78f5-1f3b-46d0-9a33-6c7019a045d5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/439868db-0e6d-4672-b7fe-8ae511e778f5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "154cf2a3-546a-44ac-a97a-9494e72a1d80"
}
```

`POST /api/driver/v1/orders/524fa427-80d9-4554-a1d1-d645c01bb555/claim` → **404**

```json
{
  "command_id": "4c43be2c-dffc-4bb3-ac90-0b25c2f7b97d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/524fa427-80d9-4554-a1d1-d645c01bb555/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "51b6b79b-f8d9-4efb-8469-1be0c6646b02"
}
```

`POST /api/driver/v1/orders/48837dca-f6e6-4534-b989-74d8af807d5d/claim` → **404**

```json
{
  "command_id": "115d743b-c18f-4870-a16b-ffa1851be6c3"
}
```

```json
{
  "instance": "/api/driver/v1/orders/48837dca-f6e6-4534-b989-74d8af807d5d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "283a5a70-12fe-4002-be09-0faec5d6085b"
}
```

`POST /api/driver/v1/orders/4ad71eb5-5d6e-44db-98e9-d957fd8e92f9/claim` → **404**

```json
{
  "command_id": "d8b3434f-9775-4436-873c-93cda8e55f1e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4ad71eb5-5d6e-44db-98e9-d957fd8e92f9/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "05a81d9b-5b6f-454a-9f97-dc91d3a840d1"
}
```

`POST /api/driver/v1/orders/fc5c2c56-28ff-4899-b396-b512d45b12ba/claim` → **404**

```json
{
  "command_id": "a9b37cc6-5de5-4f90-895f-67d666c14ddc"
}
```

```json
{
  "instance": "/api/driver/v1/orders/fc5c2c56-28ff-4899-b396-b512d45b12ba/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fd2abb0a-1105-4e07-8254-90211053650c"
}
```

`POST /api/driver/v1/orders/8aba6d8f-14e5-4ca2-bee2-b5352474fbda/claim` → **404**

```json
{
  "command_id": "860c1e04-12e7-44ab-9887-a07d857af4d7"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8aba6d8f-14e5-4ca2-bee2-b5352474fbda/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ca3ab553-0637-41dc-94af-9db7c7791919"
}
```

`POST /api/driver/v1/orders/ee618b83-0e4d-41b2-affb-81f19151652c/claim` → **404**

```json
{
  "command_id": "d6b21a68-ddb9-47c9-bdcc-c3364f95c72d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ee618b83-0e4d-41b2-affb-81f19151652c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "82069839-e756-4442-865c-8e0b5fdfb549"
}
```

`POST /api/driver/v1/orders/f20028d0-9edc-4112-b347-c1a8660bd95b/claim` → **404**

```json
{
  "command_id": "a714069b-4f8c-4c29-b394-2b1c6572a5b1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f20028d0-9edc-4112-b347-c1a8660bd95b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a47ca1ca-001d-4634-99d4-568dc9569c1d"
}
```

`POST /api/driver/v1/orders/df3aa891-2a0a-415e-826b-1030ab7cc4c1/claim` → **404**

```json
{
  "command_id": "ea3a4f15-0be9-4990-b485-8f1c28dda03f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/df3aa891-2a0a-415e-826b-1030ab7cc4c1/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a4f13c56-031f-4f35-995a-b0ab932651e4"
}
```

`POST /api/driver/v1/orders/065a4b0f-0c38-41f8-89ed-e11b11d683c4/claim` → **404**

```json
{
  "command_id": "bfc85bdf-4830-4076-8aa7-367e101d7f95"
}
```

```json
{
  "instance": "/api/driver/v1/orders/065a4b0f-0c38-41f8-89ed-e11b11d683c4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "291de816-14be-4336-9dd2-84eea9d8ce2c"
}
```

`POST /api/driver/v1/orders/6c465b2c-8f8f-4169-b7be-dd47de691d94/claim` → **404**

```json
{
  "command_id": "d7eba7ee-153d-470c-9884-8a9e6ba5350e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6c465b2c-8f8f-4169-b7be-dd47de691d94/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b2f5ad99-ced2-4e8b-8e44-acf36e2e47f3"
}
```

`POST /api/driver/v1/orders/8e57d1d2-5f5a-42e7-8f76-f78c1bfb3b64/claim` → **404**

```json
{
  "command_id": "d07b753b-9229-43d3-ad95-8daf12a2151e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8e57d1d2-5f5a-42e7-8f76-f78c1bfb3b64/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f52135d7-6fac-44b7-9680-4fab99a2eea7"
}
```

`POST /api/driver/v1/orders/25bcf2fc-6de3-4184-b3d7-c3601c30d310/claim` → **429**

```json
{
  "command_id": "621f457d-84a1-4a51-bfd9-eb8b2c954c90"
}
```

```json
{
  "instance": "/api/driver/v1/orders/25bcf2fc-6de3-4184-b3d7-c3601c30d310/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "1c0865bc-f62c-43dc-b509-806359801779",
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
  "command_id": "9c264702-3357-4e2b-a788-e17ca52cc42a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:01:12Z",
    "sequence": 1793365272316
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4ff5a8a1-06ee-449e-b017-c23a6165bec8",
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
  "last_heartbeat_at": "2026-10-30T13:01:12.052832Z",
  "last_location_at": "2026-10-30T13:01:12.052832Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "05f73268-2597-4d43-bc94-22cc1fc8eb8c",
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

`POST /api/driver/v1/orders/05f73268-2597-4d43-bc94-22cc1fc8eb8c/claim` → **409**

```json
{
  "command_id": "49476576-36bf-4ed7-8175-1828c032b897"
}
```

```json
{
  "instance": "/api/driver/v1/orders/05f73268-2597-4d43-bc94-22cc1fc8eb8c/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1ab285ea-be31-408a-ae9b-5362ad0385f2"
}
```

`POST /api/driver/v1/orders/05f73268-2597-4d43-bc94-22cc1fc8eb8c/claim` → **200**

```json
{
  "command_id": "9c1bc317-0c4c-46b3-bbe9-82823105bfe2"
}
```

```json
{
  "id": "2397fc64-b19a-4012-9bb3-e43e0a61f155",
  "order_id": "05f73268-2597-4d43-bc94-22cc1fc8eb8c",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "b6e80d49-a9d6-45c0-8f9d-ebd3a23c6488",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b6e80d49-a9d6-45c0-8f9d-ebd3a23c6488",
  "order_id": "05f73268-2597-4d43-bc94-22cc1fc8eb8c",
  "assignment_id": "2397fc64-b19a-4012-9bb3-e43e0a61f155",
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

`POST /api/driver/v1/trips/b6e80d49-a9d6-45c0-8f9d-ebd3a23c6488/cancel` → **200**

```json
{
  "command_id": "8c642827-70c1-4555-bfa2-685c713a44fa",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "b6e80d49-a9d6-45c0-8f9d-ebd3a23c6488",
  "order_id": "05f73268-2597-4d43-bc94-22cc1fc8eb8c",
  "assignment_id": "2397fc64-b19a-4012-9bb3-e43e0a61f155",
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

`GET /api/rider/v1/orders/05f73268-2597-4d43-bc94-22cc1fc8eb8c` → **200**

```json
{
  "id": "05f73268-2597-4d43-bc94-22cc1fc8eb8c",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "28a23a4f-7f79-468d-ae51-5fb45075ac9d",
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
    "id": "2397fc64-b19a-4012-9bb3-e43e0a61f155",
    "order_id": "05f73268-2597-4d43-bc94-22cc1fc8eb8c",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "b6e80d49-a9d6-45c0-8f9d-ebd3a23c6488",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:01:00.912658Z",
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
  "session_id": "2e0a6928-c964-4573-9347-b50051fab816",
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
  "last_heartbeat_at": "2026-10-30T13:00:59.651725Z",
  "last_location_at": "2026-10-30T13:00:59.651725Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2e0a6928-c964-4573-9347-b50051fab816/close` → **200**

```json
{
  "command_id": "c68be423-2c3d-4762-b44f-3651cda65331",
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
  "session_id": "4ff5a8a1-06ee-449e-b017-c23a6165bec8",
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
  "last_heartbeat_at": "2026-10-30T13:01:12.052832Z",
  "last_location_at": "2026-10-30T13:01:12.052832Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4ff5a8a1-06ee-449e-b017-c23a6165bec8/close` → **200**

```json
{
  "command_id": "3773dba5-d1eb-4ae1-9dd0-0fe2efacd9ba",
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
  "session_id": "4befbd03-ad80-4230-9f48-fa3051767dd6",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYxNzUsImlhdCI6MTc5MzM2NTI3NSwianRpIjoiODY1ZDNiZDgtZDExMC00ODU4LTg2YTYtYzg0M2Y4ZjE0OWFiIiwic2lkIjoiNGJlZmJkMDMtYWQ4MC00MjMwLTlmNDgtZmEzMDUxNzY3ZGQ2In0.mpu8I5ykscRou4SLrBW30vkP7F7N9RPoJadVdMYDAHc",
  "access_expires_at": "2026-10-30T13:16:15.781308067Z",
  "refresh_token": "01sVuCQRUWz3YW2hz84uUAOi2u_AB2inSjIA2fzFYB8",
  "refresh_expires_at": "2026-10-31T01:01:15.779663336Z",
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
  "command_id": "90b32d86-a373-4174-99d1-6750f1898cb2",
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
  "session_id": "e71b4333-fea5-4bac-8c91-077428ac6948",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYxNzcsImlhdCI6MTc5MzM2NTI3NywianRpIjoiOTYzZmI4Y2YtZTZlMy00MDc2LWI2MTAtYzAxNzc4NGE5MGNmIiwic2lkIjoiZTcxYjQzMzMtZmVhNS00YmFjLThjOTEtMDc3NDI4YWM2OTQ4In0.yF-Nu-FjImr_vSNywMwKq0Qknbz_EWn5PHiW_dbXIdI",
  "access_expires_at": "2026-10-30T13:16:17.025155988Z",
  "refresh_token": "WtHtJx3uOdH7jGZ81FNpykxTMutEIGn9chvT44-1E0g",
  "refresh_expires_at": "2026-10-31T01:01:17.024592598Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.42201186",
    "linkedid": "1730052700.42201186",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676615205"
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
    "id": "1730052700.42201186",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "a3259e0b-6e7e-485b-9fcd-0481ca9e3dad",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380676615205",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:01:17.320557Z",
      "answered_at": null,
      "ended_at": "2026-10-30T13:01:17.348252Z",
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
    "id": "1730052600.3096011807",
    "linkedid": "1730052600.3096011807",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676615205"
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
      "id": "cdbb4ef4-3ce5-48ca-b518-d2fab314b522",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676615205",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:01:17.69362Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/cdbb4ef4-3ce5-48ca-b518-d2fab314b522/answer` → **200**

```json
{
  "command_id": "adf2cc60-2359-41bd-891e-f85eb0a51fc4"
}
```

```json
{
  "id": "cdbb4ef4-3ce5-48ca-b518-d2fab314b522",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676615205",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "order_ids": [],
  "started_at": "2026-10-30T13:01:17.69362Z",
  "answered_at": "2026-10-30T13:01:18.026718Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.3096011807",
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
    "id": "1730052600.3096011807",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "cdbb4ef4-3ce5-48ca-b518-d2fab314b522",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676615205",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
      "order_ids": [],
      "started_at": "2026-10-30T13:01:17.69362Z",
      "answered_at": "2026-10-30T13:01:18.026718Z",
      "ended_at": "2026-10-30T13:01:18.352298Z",
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
      "id": "cdbb4ef4-3ce5-48ca-b518-d2fab314b522",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676615205",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
      "order_ids": [],
      "started_at": "2026-10-30T13:01:17.69362Z",
      "answered_at": "2026-10-30T13:01:18.026718Z",
      "ended_at": "2026-10-30T13:01:18.352298Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:01:19.198834Z"
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
      "id": "cdbb4ef4-3ce5-48ca-b518-d2fab314b522",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676615205",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
      "order_ids": [],
      "started_at": "2026-10-30T13:01:17.69362Z",
      "answered_at": "2026-10-30T13:01:18.026718Z",
      "ended_at": "2026-10-30T13:01:18.352298Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:01:19.198834Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/cdbb4ef4-3ce5-48ca-b518-d2fab314b522/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/cdbb4ef4-3ce5-48ca-b518-d2fab314b522/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=cdbb4ef4-3ce5-48ca-b518-d2fab314b522` → **200**

```json
{
  "changes": [
    {
      "id": "5105a9d9-46d2-40c1-aeae-54de7571220a",
      "occurred_at": "2026-10-30T13:01:21.34444Z",
      "actor_type": "STAFF",
      "actor_id": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "cdbb4ef4-3ce5-48ca-b518-d2fab314b522",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"c4fb1b96-2fa4-41aa-8fd1-38f740d2a422\", \"order_ids\": []}",
      "correlation_id": "e1bb4def-23ba-4d4d-a0e0-57b8bd7a3169"
    },
    {
      "id": "1375a374-c1a8-41bb-abcc-449a71125235",
      "occurred_at": "2026-10-30T13:01:21.309283Z",
      "actor_type": "STAFF",
      "actor_id": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "cdbb4ef4-3ce5-48ca-b518-d2fab314b522",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"c4fb1b96-2fa4-41aa-8fd1-38f740d2a422\", \"order_ids\": []}",
      "correlation_id": "fd61beff-2d13-4603-bcd4-6013286557bb"
    }
  ]
}
```

Done: call cdbb4ef4-3ce5-48ca-b518-d2fab314b522 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3221"
}
```

```json
{
  "challenge_id": "f0226ee2-1378-41d9-a645-f82a422acce9",
  "expires_at": "2026-10-30T13:06:21.694271176Z",
  "resend_available_at": "2026-10-30T13:01:22.694271176Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "118089",
  "sent_at": "2026-10-30T13:01:21.697602983Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0226ee2-1378-41d9-a645-f82a422acce9",
  "code": "118089",
  "device_ref": "sandbox-3221"
}
```

```json
{
  "session_id": "2fe134f8-4833-46e5-9d9a-531a4f1227df",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjE4MiwiaWF0IjoxNzkzMzY1MjgyLCJqdGkiOiI3ZTIxYWYyMy1iMGM1LTQ2YWItOTZhMy0yNjkwMGIyZDc4MjgiLCJzaWQiOiIyZmUxMzRmOC00ODMzLTQ2ZTUtOWQ5YS01MzFhNGYxMjI3ZGYifQ.yJYbPNXdF-3MqzTiuDse2CbKGZ-DsKtYX6dS9vWkDcA",
  "access_expires_at": "2026-10-30T13:16:22.026734259Z",
  "refresh_token": "BHHN_vaAZ-j5U2XpuEqN40gWOwvesu4GgTmXBGmlRGY",
  "refresh_expires_at": "2026-11-29T13:01:22.026193133Z",
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
  "command_id": "4c95d461-2f69-4dfb-8a88-088c6beb20a2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:01:22Z",
    "sequence": 1793365282633
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "50233d77-c82c-4481-b95c-0a598abf37c7",
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
  "last_heartbeat_at": "2026-10-30T13:01:22.655465Z",
  "last_location_at": "2026-10-30T13:01:22.655465Z",
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
  "session_id": "98c4776f-f3e8-4442-96d5-20473044f2e0",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYxODMsImlhdCI6MTc5MzM2NTI4MywianRpIjoiMjM5MTkxZWQtYmQwNS00OWYxLThhMTMtYTc1NjBmMGYxNWQyIiwic2lkIjoiOThjNDc3NmYtZjNlOC00NDQyLTk2ZDUtMjA0NzMwNDRmMmUwIn0.1eUaO4GX12wMtK6YCVE1MRPlJ0SiUFvG9-Qy-TzehW8",
  "access_expires_at": "2026-10-30T13:16:23.291272276Z",
  "refresh_token": "k7e7CnGzlDh51oBuqXa1hK31vys8C9aEniFWnUiuZME",
  "refresh_expires_at": "2026-10-31T01:01:23.290710619Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ee29e569-5069-49c9-999b-8d2378d1039c",
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
  "id": "f743fcde-72fc-47b0-98bb-d7025b77f5dc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:06:23.594188Z",
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
  "command_id": "bf7e7def-32dd-4d70-9fdb-0bc67b5f8d79",
  "quote_id": "f743fcde-72fc-47b0-98bb-d7025b77f5dc",
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
    "phone": "+380677385014"
  }
}
```

```json
{
  "id": "ab66910a-78a6-4145-8073-c0d729ba252a",
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
  "created_at": "2026-10-30T13:01:23.925155Z",
  "caller": {
    "name": "Олена",
    "phone": "+380677385014"
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
    "id": "13d76c17-b9b8-4b1f-9d93-8e7d9f2bb20c",
    "order_id": "ab66910a-78a6-4145-8073-c0d729ba252a",
    "expires_at": "2026-10-30T13:01:38.930155Z",
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

`POST /api/driver/v1/offers/13d76c17-b9b8-4b1f-9d93-8e7d9f2bb20c/accept` → **200**

```json
{
  "command_id": "af7e82e6-613b-46b3-945a-b126486e3e39"
}
```

```json
{
  "id": "8c162c53-385b-4283-a0f1-dd22f3cd298b",
  "order_id": "ab66910a-78a6-4145-8073-c0d729ba252a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8ea82212-b399-4f5f-a841-f33557694336",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380677385014` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380677385014` → **200**

```json
[
  {
    "phone": "+380677385014",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:01:25.784102772Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677385014` → **200**

```json
[
  {
    "phone": "+380677385014",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:01:25.784102772Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677385014` → **200**

```json
[
  {
    "phone": "+380677385014",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:01:25.784102772Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8ea82212-b399-4f5f-a841-f33557694336",
  "order_id": "ab66910a-78a6-4145-8073-c0d729ba252a",
  "assignment_id": "8c162c53-385b-4283-a0f1-dd22f3cd298b",
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
    "phone": "+380677385014"
  }
}
```

`POST /api/driver/v1/work-sessions/50233d77-c82c-4481-b95c-0a598abf37c7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:01:26Z",
    "sequence": 1793365286306
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "50233d77-c82c-4481-b95c-0a598abf37c7",
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
  "last_heartbeat_at": "2026-10-30T13:01:26.326609Z",
  "last_location_at": "2026-10-30T13:01:26.326609Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/8ea82212-b399-4f5f-a841-f33557694336/arrive` → **200**

```json
{
  "command_id": "8dba9ba2-9771-42d5-b768-7a8bb72c2245",
  "expected_version": 0
}
```

```json
{
  "id": "8ea82212-b399-4f5f-a841-f33557694336",
  "order_id": "ab66910a-78a6-4145-8073-c0d729ba252a",
  "assignment_id": "8c162c53-385b-4283-a0f1-dd22f3cd298b",
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
  "arrived_at": "2026-10-30T13:01:26.633825Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677385014"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380677385014` → **200**

```json
[
  {
    "phone": "+380677385014",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:01:25.784102772Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677385014` → **200**

```json
[
  {
    "phone": "+380677385014",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:01:25.784102772Z"
  },
  {
    "phone": "+380677385014",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:01:27.790921812Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677385014` → **200**

```json
[
  {
    "phone": "+380677385014",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:01:25.784102772Z"
  },
  {
    "phone": "+380677385014",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:01:27.790921812Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677385014` → **200**

```json
[
  {
    "phone": "+380677385014",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:01:25.784102772Z"
  },
  {
    "phone": "+380677385014",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:01:27.790921812Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/8ea82212-b399-4f5f-a841-f33557694336/start` → **200**

```json
{
  "command_id": "394e0460-8aa1-467e-ac9c-f1d1a8b1a60e",
  "expected_version": 1
}
```

```json
{
  "id": "8ea82212-b399-4f5f-a841-f33557694336",
  "order_id": "ab66910a-78a6-4145-8073-c0d729ba252a",
  "assignment_id": "8c162c53-385b-4283-a0f1-dd22f3cd298b",
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
  "arrived_at": "2026-10-30T13:01:26.633825Z",
  "started_at": "2026-10-30T13:01:28.06054Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677385014"
  }
}
```

`POST /api/driver/v1/trips/8ea82212-b399-4f5f-a841-f33557694336/complete` → **200**

```json
{
  "command_id": "1515e5b1-c292-407e-9d3c-a5e00197fe49",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:01:28Z",
  "cash_received": true
}
```

```json
{
  "id": "8ea82212-b399-4f5f-a841-f33557694336",
  "order_id": "ab66910a-78a6-4145-8073-c0d729ba252a",
  "assignment_id": "8c162c53-385b-4283-a0f1-dd22f3cd298b",
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
  "arrived_at": "2026-10-30T13:01:26.633825Z",
  "started_at": "2026-10-30T13:01:28.06054Z",
  "completed_at": "2026-10-30T13:01:28.376915Z",
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
  "session_id": "50233d77-c82c-4481-b95c-0a598abf37c7",
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
  "last_heartbeat_at": "2026-10-30T13:01:26.326609Z",
  "last_location_at": "2026-10-30T13:01:26.326609Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/50233d77-c82c-4481-b95c-0a598abf37c7/close` → **200**

```json
{
  "command_id": "d2532900-ea59-4289-9dd7-df641646dd7d",
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
  "phone": "+380637117950",
  "device_ref": "sandbox-24372"
}
```

```json
{
  "challenge_id": "73937ed1-d65b-4714-be20-0dbbed2d9e05",
  "expires_at": "2026-10-30T13:06:29.350513399Z",
  "resend_available_at": "2026-10-30T13:01:30.350513399Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637117950` → **200**

```json
{
  "phone": "+380637117950",
  "audience": "CLIENT",
  "code": "598623",
  "sent_at": "2026-10-30T13:01:29.353430017Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "73937ed1-d65b-4714-be20-0dbbed2d9e05",
  "code": "598623",
  "device_ref": "sandbox-24372"
}
```

```json
{
  "session_id": "1d936db8-e101-4805-8944-b0a6f2ef7e22",
  "subject": {
    "type": "CLIENT",
    "id": "da0dbb4d-c1d3-444e-9b05-d6485063bb37"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTBkYmI0ZC1jMWQzLTQ0NGUtOWIwNS1kNjQ4NTA2M2JiMzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MTg5LCJpYXQiOjE3OTMzNjUyODksImp0aSI6IjM3MmY2ZjUxLTk2MzgtNGNjMS05YTY3LTYxZjBlZTU2MDlkZCIsInNpZCI6IjFkOTM2ZGI4LWUxMDEtNDgwNS04OTQ0LWIwYTZmMmVmN2UyMiJ9.xB1CNU_69lsh0gDJdPnxo3T85OyKPub5cjSajPzDYH0",
  "access_expires_at": "2026-10-30T13:16:29.689552047Z",
  "refresh_token": "uMS3nFdoW9_hRdTMrt1wylSWle8EyWlgYqxDgqxCcwk",
  "refresh_expires_at": "2026-11-29T13:01:29.689021727Z",
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
  "device_ref": "sandbox-18093"
}
```

```json
{
  "challenge_id": "a5803f59-a373-4213-bbf6-6ce4b5c68d4a",
  "expires_at": "2026-10-30T13:06:30.295066065Z",
  "resend_available_at": "2026-10-30T13:01:31.295066065Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "932506",
  "sent_at": "2026-10-30T13:01:30.297649954Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a5803f59-a373-4213-bbf6-6ce4b5c68d4a",
  "code": "932506",
  "device_ref": "sandbox-18093"
}
```

```json
{
  "session_id": "45e8edad-d79b-428a-bdd3-2613fb0d1187",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjE5MCwiaWF0IjoxNzkzMzY1MjkwLCJqdGkiOiJhYWE3OWQ2Yy00NjZkLTRhNDYtODU3ZC1mNjNiNzY0OTY1NTkiLCJzaWQiOiI0NWU4ZWRhZC1kNzliLTQyOGEtYmRkMy0yNjEzZmIwZDExODcifQ.8HkUhdE5qTF4utKruw094Nrwfsa1yU3ilRbX8cn7tb8",
  "access_expires_at": "2026-10-30T13:16:30.627394122Z",
  "refresh_token": "XAILFrUZaDPaJq9i91tLdE8n7T54ar3M-OmTC8d03Wo",
  "refresh_expires_at": "2026-11-29T13:01:30.626706241Z",
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
  "session_id": "fadf2b45-55bc-48a1-bb11-0a45ff561cdb",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYxOTEsImlhdCI6MTc5MzM2NTI5MSwianRpIjoiNzg3NzFjZGUtZTUyZi00Njg4LTg5MTEtMTk5NzQ1MmFhMTRkIiwic2lkIjoiZmFkZjJiNDUtNTViYy00OGExLWJiMTEtMGE0NWZmNTYxY2RiIn0.jUFB0YW53ntDjGO5wHx3p3-YkKksdSeDhwyAa3b4Urk",
  "access_expires_at": "2026-10-30T13:16:31.549393621Z",
  "refresh_token": "wxONbjaXVSLh4MJ8ZhGjPIFEzDbd9l2cLUTl3px9YLI",
  "refresh_expires_at": "2026-10-31T01:01:31.548670157Z",
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
  "session_id": "1ec09472-27ea-4c70-864c-a7b495e36dc0",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYxOTIsImlhdCI6MTc5MzM2NTI5MiwianRpIjoiMTJlYWQwZGMtYThjNC00ZmM3LWE3MGEtNTVjN2U2ZTIyYTAwIiwic2lkIjoiMWVjMDk0NzItMjdlYS00YzcwLTg2NGMtYTdiNDk1ZTM2ZGMwIn0.6j20BTPJhoNElXb5OZsObZ4KeVWQ4K__RJsbNSQysCo",
  "access_expires_at": "2026-10-30T13:16:32.176068058Z",
  "refresh_token": "_8YYoah7EtEMs8NiHqanPPPQXmPE2j8GcEWpOHD9dxs",
  "refresh_expires_at": "2026-10-31T01:01:32.175478463Z",
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
  "command_id": "9bac380f-280a-4ce3-b346-2621a587d8c3",
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
  "id": "02febd6e-7799-4330-b910-4ddfac5ddb85",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:06:32.774565Z",
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
  "command_id": "cec25788-7f73-4973-9a18-24c3cac76bfd",
  "quote_id": "02febd6e-7799-4330-b910-4ddfac5ddb85",
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
  "id": "775fdfce-9048-4148-8375-10e3e2b805b3",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "da0dbb4d-c1d3-444e-9b05-d6485063bb37",
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
  "created_at": "2026-10-30T13:01:33.087172Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/775fdfce-9048-4148-8375-10e3e2b805b3` → **200**

```json
{
  "id": "775fdfce-9048-4148-8375-10e3e2b805b3",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "da0dbb4d-c1d3-444e-9b05-d6485063bb37",
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
  "created_at": "2026-10-30T13:01:33.087172Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/775fdfce-9048-4148-8375-10e3e2b805b3/cancel` → **200**

```json
{
  "command_id": "38260348-f2c2-4bf4-8bd0-6f3ef15fd5cb",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "775fdfce-9048-4148-8375-10e3e2b805b3",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "da0dbb4d-c1d3-444e-9b05-d6485063bb37",
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
  "created_at": "2026-10-30T13:01:33.087172Z",
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
  "command_id": "3e853229-0c45-41bb-9ece-4fc9f5232506",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:01:34Z",
    "sequence": 1793365294361
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f6d2f4ba-963c-4033-a59d-f98f759bfc55",
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
  "last_heartbeat_at": "2026-10-30T13:01:34.383439Z",
  "last_location_at": "2026-10-30T13:01:34.383439Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-6964"
}
```

```json
{
  "challenge_id": "831ec092-cef0-4608-af22-1b156ee99c7b",
  "expires_at": "2026-10-30T13:06:34.680576667Z",
  "resend_available_at": "2026-10-30T13:01:35.680576667Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "501814",
  "sent_at": "2026-10-30T13:01:34.683378894Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "831ec092-cef0-4608-af22-1b156ee99c7b",
  "code": "501814",
  "device_ref": "sandbox-6964"
}
```

```json
{
  "session_id": "c93d4ea1-eca8-44ac-a544-d99b67ab7a65",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjE5NSwiaWF0IjoxNzkzMzY1Mjk1LCJqdGkiOiJlN2Q2ODBmYy01NzYxLTQwMWEtOTY4Ni1kMjdkZTg0M2ZlYzkiLCJzaWQiOiJjOTNkNGVhMS1lY2E4LTQ0YWMtYTU0NC1kOTliNjdhYjdhNjUifQ.WF7mI2GkSMOrKtM6cDkvwGIzqlG8pekwIOOCzyTanqw",
  "access_expires_at": "2026-10-30T13:16:35.009687241Z",
  "refresh_token": "KzbL0dV98y1uLLGqSJ-PCurkcbEtEXY7pn-DKUmSLPE",
  "refresh_expires_at": "2026-11-29T13:01:35.008994021Z",
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
  "command_id": "d16dab7b-213c-4a6e-95f9-06e3bc3e24f9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:01:35Z",
    "sequence": 1793365295644
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b0b89470-54be-455c-834f-40b727107c7b",
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
  "last_heartbeat_at": "2026-10-30T13:01:35.674225Z",
  "last_location_at": "2026-10-30T13:01:35.674225Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "523d8343-316f-4716-8c61-fcabf58f676f",
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
  "id": "45a4d0b8-3b5b-4a97-a3e5-9b962bd73093",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:06:36.008957Z",
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
  "command_id": "6693f489-5901-4b64-801f-c2e605275110",
  "quote_id": "45a4d0b8-3b5b-4a97-a3e5-9b962bd73093",
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
  "id": "a6326917-6f54-471f-be1d-8e0f88f38f6e",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "da0dbb4d-c1d3-444e-9b05-d6485063bb37",
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
  "created_at": "2026-10-30T13:01:36.327111Z",
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
    "id": "76ff70ab-b068-4e57-91e8-40da3670b639",
    "order_id": "a6326917-6f54-471f-be1d-8e0f88f38f6e",
    "expires_at": "2026-10-30T13:01:51.332531Z",
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

`POST /api/driver/v1/offers/76ff70ab-b068-4e57-91e8-40da3670b639/accept` → **200**

```json
{
  "command_id": "9d8e58f5-9089-4bda-90ae-a0096811a44c"
}
```

```json
{
  "id": "c300762c-361e-4692-8b16-f4b5d531f498",
  "order_id": "a6326917-6f54-471f-be1d-8e0f88f38f6e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5eeaed0d-8d61-4ba9-a50a-cbd679dcaf10",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5eeaed0d-8d61-4ba9-a50a-cbd679dcaf10",
  "order_id": "a6326917-6f54-471f-be1d-8e0f88f38f6e",
  "assignment_id": "c300762c-361e-4692-8b16-f4b5d531f498",
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

`POST /api/driver/v1/trips/5eeaed0d-8d61-4ba9-a50a-cbd679dcaf10/cancel` → **200**

```json
{
  "command_id": "42e1402d-106b-428c-b6fc-fb7ed2f09ad9",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "5eeaed0d-8d61-4ba9-a50a-cbd679dcaf10",
  "order_id": "a6326917-6f54-471f-be1d-8e0f88f38f6e",
  "assignment_id": "c300762c-361e-4692-8b16-f4b5d531f498",
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

`GET /api/rider/v1/orders/a6326917-6f54-471f-be1d-8e0f88f38f6e` → **200**

```json
{
  "id": "a6326917-6f54-471f-be1d-8e0f88f38f6e",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "da0dbb4d-c1d3-444e-9b05-d6485063bb37",
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
    "id": "c300762c-361e-4692-8b16-f4b5d531f498",
    "order_id": "a6326917-6f54-471f-be1d-8e0f88f38f6e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "5eeaed0d-8d61-4ba9-a50a-cbd679dcaf10",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:01:36.327111Z",
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
    "id": "8e201595-3477-422e-ad13-58edc48160d5",
    "order_id": "a6326917-6f54-471f-be1d-8e0f88f38f6e",
    "expires_at": "2026-10-30T13:01:52.558256Z",
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

`POST /api/driver/v1/offers/8e201595-3477-422e-ad13-58edc48160d5/accept` → **200**

```json
{
  "command_id": "9d944c8f-9953-418f-8e7a-b3affa497ca2"
}
```

```json
{
  "id": "8abf2527-0376-4a5f-967d-a481af1a67ea",
  "order_id": "a6326917-6f54-471f-be1d-8e0f88f38f6e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "653014dd-8506-4498-9400-5c18f31bebb0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "653014dd-8506-4498-9400-5c18f31bebb0",
  "order_id": "a6326917-6f54-471f-be1d-8e0f88f38f6e",
  "assignment_id": "8abf2527-0376-4a5f-967d-a481af1a67ea",
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

`POST /api/driver/v1/trips/653014dd-8506-4498-9400-5c18f31bebb0/cancel` → **200**

```json
{
  "command_id": "a7a96001-fbaf-46f4-86fa-e18bce38a17d",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "653014dd-8506-4498-9400-5c18f31bebb0",
  "order_id": "a6326917-6f54-471f-be1d-8e0f88f38f6e",
  "assignment_id": "8abf2527-0376-4a5f-967d-a481af1a67ea",
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
    "id": "a6326917-6f54-471f-be1d-8e0f88f38f6e",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-30T13:01:36.327111Z",
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
    "id": "775fdfce-9048-4148-8375-10e3e2b805b3",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T13:01:33.087172Z",
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

`GET /api/operator/v1/orders/a6326917-6f54-471f-be1d-8e0f88f38f6e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:01:36.32821Z",
      "actor": {
        "type": "CLIENT",
        "id": "da0dbb4d-c1d3-444e-9b05-d6485063bb37",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a6326917-6f54-471f-be1d-8e0f88f38f6e",
        "quote_id": "45a4d0b8-3b5b-4a97-a3e5-9b962bd73093",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "526b67d7-e031-4583-9749-4d1795d767cd"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:01:36.331256Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a6326917-6f54-471f-be1d-8e0f88f38f6e",
        "attempt_id": "8823ce66-255c-43f7-9d0d-dd65721330e4",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "526b67d7-e031-4583-9749-4d1795d767cd"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:01:36.340044Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "76ff70ab-b068-4e57-91e8-40da3670b639",
        "order_id": "a6326917-6f54-471f-be1d-8e0f88f38f6e",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "526b67d7-e031-4583-9749-4d1795d767cd"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:01:36.942231Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "76ff70ab-b068-4e57-91e8-40da3670b639",
        "order_id": "a6326917-6f54-471f-be1d-8e0f88f38f6e",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "c300762c-361e-4692-8b16-f4b5d531f498"
      },
      "correlation_id": "d0501da8-877c-4fb8-9062-69dfdccf0b80"
```

Done: orders 775fdfce-9048-4148-8375-10e3e2b805b3, a6326917-6f54-471f-be1d-8e0f88f38f6e.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734057500",
  "device_ref": "sandbox-8023"
}
```

```json
{
  "challenge_id": "f849e858-23fc-40e3-a6d1-36ed6673c1b8",
  "expires_at": "2026-10-30T13:06:40.107604291Z",
  "resend_available_at": "2026-10-30T13:01:41.107604291Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734057500` → **200**

```json
{
  "phone": "+380734057500",
  "audience": "CLIENT",
  "code": "664852",
  "sent_at": "2026-10-30T13:01:40.11036059Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f849e858-23fc-40e3-a6d1-36ed6673c1b8",
  "code": "664852",
  "device_ref": "sandbox-8023"
}
```

```json
{
  "session_id": "85e22b23-48e5-4afc-bd59-38ca3b07d26f",
  "subject": {
    "type": "CLIENT",
    "id": "ccdef412-dff0-4b6d-a01a-5df123ba3e7b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjY2RlZjQxMi1kZmYwLTRiNmQtYTAxYS01ZGYxMjNiYTNlN2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MjAwLCJpYXQiOjE3OTMzNjUzMDAsImp0aSI6ImM2OTc5MDQ4LWJmZDUtNDk4MC1hNmZkLTYxYjlhMjVjNmEyOCIsInNpZCI6Ijg1ZTIyYjIzLTQ4ZTUtNGFmYy1iZDU5LTM4Y2EzYjA3ZDI2ZiJ9.4UtkLpYHKDHaFABFP3Be_DCp6IVLpLW810T-yt3hcr8",
  "access_expires_at": "2026-10-30T13:16:40.439467291Z",
  "refresh_token": "p33eNpXm_dfeRSYzAHtHr0LA1U8mWW7RJ9vIefqne8E",
  "refresh_expires_at": "2026-11-29T13:01:40.438487669Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "423553ce-ed66-4ec9-9848-ddf7777dda65",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "324ca822-39c7-4224-b99e-309712bff285",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-324ca822-39c7-4224-b99e-309712bff285",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "ff4a6699dc15425d6441d3880ec835d0",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=324ca822-39c7-4224-b99e-309712bff285",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734057500"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=324ca822-39c7-4224-b99e-309712bff285",
  "expires_at": "2026-10-30T13:31:40.739863Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/324ca822-39c7-4224-b99e-309712bff285` → **200**

```json
{
  "id": "324ca822-39c7-4224-b99e-309712bff285",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:31:40.739863Z",
  "card": {
    "id": "b3b70242-c55a-4b8f-878d-38a49ff43fc5",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7790",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:01:41.051406Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "b3b70242-c55a-4b8f-878d-38a49ff43fc5",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****7790",
      "card_type": "Visa",
      "created_at": "2026-10-30T13:01:41.051406Z"
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
  "device_ref": "sandbox-22525"
}
```

```json
{
  "challenge_id": "4bfe1a5e-8783-4b65-93e6-6ba53e6f40d5",
  "expires_at": "2026-10-30T13:06:41.652932931Z",
  "resend_available_at": "2026-10-30T13:01:42.652932931Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "746752",
  "sent_at": "2026-10-30T13:01:41.655439442Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4bfe1a5e-8783-4b65-93e6-6ba53e6f40d5",
  "code": "746752",
  "device_ref": "sandbox-22525"
}
```

```json
{
  "session_id": "eaecf03e-249f-4f52-8667-9365d9f2cad7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjIwMSwiaWF0IjoxNzkzMzY1MzAxLCJqdGkiOiJkNjc2ZTUxMy04ZWEyLTQ5MTItYjRlMy00ZDY3NmEyNjY0MmEiLCJzaWQiOiJlYWVjZjAzZS0yNDlmLTRmNTItODY2Ny05MzY1ZDlmMmNhZDcifQ.EJKxaoMUnppHLaWQXUI_z6XuFONj8IB11rYPdzCakb8",
  "access_expires_at": "2026-10-30T13:16:41.988399021Z",
  "refresh_token": "Zyhk45qiNGUCLRiViYaJLjC84vQ79uoliJwyg6WGjyQ",
  "refresh_expires_at": "2026-11-29T13:01:41.98773258Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b0b89470-54be-455c-834f-40b727107c7b",
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
  "last_heartbeat_at": "2026-10-30T13:01:35.674225Z",
  "last_location_at": "2026-10-30T13:01:35.674225Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b0b89470-54be-455c-834f-40b727107c7b/handover` → **200**

```json
{
  "command_id": "059940ca-1aa3-45ea-96d4-cf815584d37e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b0b89470-54be-455c-834f-40b727107c7b",
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
  "last_heartbeat_at": "2026-10-30T13:01:35.674225Z",
  "last_location_at": "2026-10-30T13:01:35.674225Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 42 s to the next point)

`POST /api/driver/v1/work-sessions/b0b89470-54be-455c-834f-40b727107c7b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:02:24Z",
    "sequence": 1793365344911
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b0b89470-54be-455c-834f-40b727107c7b",
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
  "last_heartbeat_at": "2026-10-30T13:02:24.932191Z",
  "last_location_at": "2026-10-30T13:02:24.932191Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b5933c70-2992-49f5-81ea-890a4dc42a5b",
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
  "id": "4cc209b0-d210-42f4-bc0a-d35e2b0c9cca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:07:25.242951Z",
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
  "command_id": "cdda42ab-80db-4f62-bac8-e8df11b5ec61",
  "quote_id": "4cc209b0-d210-42f4-bc0a-d35e2b0c9cca",
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
  "id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ccdef412-dff0-4b6d-a01a-5df123ba3e7b",
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
  "created_at": "2026-10-30T13:02:25.565384Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c43ac0c6-b4fc-4191-bd2a-3f8c748aea49` → **200**

```json
{
  "id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ccdef412-dff0-4b6d-a01a-5df123ba3e7b",
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
  "created_at": "2026-10-30T13:02:25.565384Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c43ac0c6-b4fc-4191-bd2a-3f8c748aea49` → **200**

```json
{
  "id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ccdef412-dff0-4b6d-a01a-5df123ba3e7b",
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
  "created_at": "2026-10-30T13:02:25.565384Z",
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
    "id": "a2c3ebb1-c993-4377-9e6c-48856a519875",
    "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
    "expires_at": "2026-10-30T13:02:41.141651Z",
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

`POST /api/driver/v1/offers/a2c3ebb1-c993-4377-9e6c-48856a519875/accept` → **200**

```json
{
  "command_id": "69bf61eb-61e5-4a4c-bf66-f807ebc731c8"
}
```

```json
{
  "id": "83b28e48-6f0d-4f2f-b6ff-fb38199f5255",
  "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9dc8ee32-efa8-4717-9648-bb755be3178c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9dc8ee32-efa8-4717-9648-bb755be3178c",
  "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
  "assignment_id": "83b28e48-6f0d-4f2f-b6ff-fb38199f5255",
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

`POST /api/driver/v1/work-sessions/b0b89470-54be-455c-834f-40b727107c7b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:02:33Z",
    "sequence": 1793365353439
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b0b89470-54be-455c-834f-40b727107c7b",
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
  "last_heartbeat_at": "2026-10-30T13:02:33.460564Z",
  "last_location_at": "2026-10-30T13:02:33.460564Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/9dc8ee32-efa8-4717-9648-bb755be3178c/arrive` → **200**

```json
{
  "command_id": "e55a779d-ebd3-4721-9cf6-5421505c5596",
  "expected_version": 0
}
```

```json
{
  "id": "9dc8ee32-efa8-4717-9648-bb755be3178c",
  "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
  "assignment_id": "83b28e48-6f0d-4f2f-b6ff-fb38199f5255",
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
  "arrived_at": "2026-10-30T13:02:33.766384Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9dc8ee32-efa8-4717-9648-bb755be3178c/start` → **200**

```json
{
  "command_id": "64a9fd84-d14c-4862-ab7e-fa480e940f87",
  "expected_version": 1
}
```

```json
{
  "id": "9dc8ee32-efa8-4717-9648-bb755be3178c",
  "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
  "assignment_id": "83b28e48-6f0d-4f2f-b6ff-fb38199f5255",
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
  "arrived_at": "2026-10-30T13:02:33.766384Z",
  "started_at": "2026-10-30T13:02:34.082601Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9dc8ee32-efa8-4717-9648-bb755be3178c/complete` → **200**

```json
{
  "command_id": "75784e09-e859-4b5c-bf1f-13df5a55e093",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:02:34Z",
  "cash_received": true
}
```

```json
{
  "id": "9dc8ee32-efa8-4717-9648-bb755be3178c",
  "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
  "assignment_id": "83b28e48-6f0d-4f2f-b6ff-fb38199f5255",
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
  "arrived_at": "2026-10-30T13:02:33.766384Z",
  "started_at": "2026-10-30T13:02:34.082601Z",
  "completed_at": "2026-10-30T13:02:34.403174Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/c43ac0c6-b4fc-4191-bd2a-3f8c748aea49` → **200**

```json
{
  "id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "ccdef412-dff0-4b6d-a01a-5df123ba3e7b",
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
    "id": "83b28e48-6f0d-4f2f-b6ff-fb38199f5255",
    "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9dc8ee32-efa8-4717-9648-bb755be3178c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:02:25.565384Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c43ac0c6-b4fc-4191-bd2a-3f8c748aea49` → **200**

```json
{
  "id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "ccdef412-dff0-4b6d-a01a-5df123ba3e7b",
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
    "id": "83b28e48-6f0d-4f2f-b6ff-fb38199f5255",
    "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9dc8ee32-efa8-4717-9648-bb755be3178c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:02:25.565384Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c43ac0c6-b4fc-4191-bd2a-3f8c748aea49` → **200**

```json
{
  "id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "ccdef412-dff0-4b6d-a01a-5df123ba3e7b",
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
    "id": "83b28e48-6f0d-4f2f-b6ff-fb38199f5255",
    "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9dc8ee32-efa8-4717-9648-bb755be3178c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:02:25.565384Z",
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

`GET /api/rider/v1/orders/c43ac0c6-b4fc-4191-bd2a-3f8c748aea49/tip` → **200**

```json
{
  "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
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
  "available_until": "2026-10-31T13:02:34.403174Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/c43ac0c6-b4fc-4191-bd2a-3f8c748aea49/tip` → **201**

```json
{
  "command_id": "55fa7224-8486-45f4-8296-13d5f70a59ae",
  "amount_minor": 2500
}
```

```json
{
  "id": "095bccaf-609c-474d-9036-35bda2478f9c",
  "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T13:02:38.267603Z"
}
```

`GET /api/rider/v1/orders/c43ac0c6-b4fc-4191-bd2a-3f8c748aea49/tip` → **200**

```json
{
  "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
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
  "available_until": "2026-10-31T13:02:34.403174Z",
  "open": false,
  "tip": {
    "id": "095bccaf-609c-474d-9036-35bda2478f9c",
    "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T13:02:38.267603Z"
  }
}
```

`GET /api/rider/v1/orders/c43ac0c6-b4fc-4191-bd2a-3f8c748aea49/tip` → **200**

```json
{
  "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
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
  "available_until": "2026-10-31T13:02:34.403174Z",
  "open": false,
  "tip": {
    "id": "095bccaf-609c-474d-9036-35bda2478f9c",
    "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T13:02:38.267603Z"
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
      "id": "745a0b0d-2751-4a6d-9067-c63400a512f9",
      "at": "2026-10-30T13:02:35.221178Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
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
      "id": "68283fcf-a19d-4891-8635-47a3eb127ad7",
      "at": "2026-10-30T13:02:40.276364Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
      "counterpart_id": null
    },
    {
      "id": "745a0b0d-2751-4a6d-9067-c63400a512f9",
      "at": "2026-10-30T13:02:35.221178Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "71e16349-28c0-4d9f-ba46-282231c3f382",
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
  "id": "74b87517-0a94-4d46-b240-3407b7fceec6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:07:41.782059Z",
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
  "session_id": "bd8ff96c-1028-4450-b303-042e8ca624fd",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyNjIsImlhdCI6MTc5MzM2NTM2MiwianRpIjoiNDczNmUwMTMtMmJlNC00ZjJmLTgyZTEtZmYzNTU1MmRkMTgyIiwic2lkIjoiYmQ4ZmY5NmMtMTAyOC00NDUwLWIzMDMtMDQyZThjYTYyNGZkIn0.Lh5Sv3UYsSXHSCZzrUy3zZLwQzAhWeNesak1E_Rh9a4",
  "access_expires_at": "2026-10-30T13:17:42.42945505Z",
  "refresh_token": "ZRniQxSy_6RhgAWIYPlwNRS2JA_oGLCbTlEOwWNEg8s",
  "refresh_expires_at": "2026-10-31T01:02:42.428911911Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380734057500` → **200**

```json
{
  "client_id": "ccdef412-dff0-4b6d-a01a-5df123ba3e7b"
}
```

`POST /api/admin/v1/rider-wallets/ccdef412-dff0-4b6d-a01a-5df123ba3e7b/top-ups` → **201**

```json
{
  "command_id": "f6d69e4e-7206-46a0-8767-5bcfa0ae1735",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "ccdef412-dff0-4b6d-a01a-5df123ba3e7b",
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
      "id": "38763ee7-8a7e-48ef-9655-a89b9da76074",
      "at": "2026-10-30T13:02:43.027455Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "677231dc-0bcd-40bd-ab60-a1ce90c075c1",
  "quote_id": "74b87517-0a94-4d46-b240-3407b7fceec6",
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
  "id": "6f176650-b9e7-483a-8269-aac6612b15a1",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ccdef412-dff0-4b6d-a01a-5df123ba3e7b",
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
  "created_at": "2026-10-30T13:02:43.338466Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6f176650-b9e7-483a-8269-aac6612b15a1` → **200**

```json
{
  "id": "6f176650-b9e7-483a-8269-aac6612b15a1",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ccdef412-dff0-4b6d-a01a-5df123ba3e7b",
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
  "created_at": "2026-10-30T13:02:43.338466Z",
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
    "id": "176ed332-3dbc-4822-9a2a-ca27fb0db1e1",
    "order_id": "6f176650-b9e7-483a-8269-aac6612b15a1",
    "expires_at": "2026-10-30T13:02:58.343677Z",
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

`POST /api/driver/v1/offers/176ed332-3dbc-4822-9a2a-ca27fb0db1e1/accept` → **200**

```json
{
  "command_id": "e6a38cd1-7cc6-480a-88ff-3e1a99ebb6da"
}
```

```json
{
  "id": "0106c650-ff58-4afe-bbcc-7820a9eca3c7",
  "order_id": "6f176650-b9e7-483a-8269-aac6612b15a1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8a481888-ab20-4b99-9ac0-0e70a641e046",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8a481888-ab20-4b99-9ac0-0e70a641e046",
  "order_id": "6f176650-b9e7-483a-8269-aac6612b15a1",
  "assignment_id": "0106c650-ff58-4afe-bbcc-7820a9eca3c7",
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

`POST /api/driver/v1/work-sessions/b0b89470-54be-455c-834f-40b727107c7b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:02:44Z",
    "sequence": 1793365364881
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b0b89470-54be-455c-834f-40b727107c7b",
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
  "last_heartbeat_at": "2026-10-30T13:02:44.903201Z",
  "last_location_at": "2026-10-30T13:02:44.903201Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/8a481888-ab20-4b99-9ac0-0e70a641e046/arrive` → **200**

```json
{
  "command_id": "eb787a69-4068-4721-bdb5-9eaa6aa8e06e",
  "expected_version": 0
}
```

```json
{
  "id": "8a481888-ab20-4b99-9ac0-0e70a641e046",
  "order_id": "6f176650-b9e7-483a-8269-aac6612b15a1",
  "assignment_id": "0106c650-ff58-4afe-bbcc-7820a9eca3c7",
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
  "arrived_at": "2026-10-30T13:02:45.217021Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8a481888-ab20-4b99-9ac0-0e70a641e046/start` → **200**

```json
{
  "command_id": "892fdb5f-cf6f-4573-b9ef-76273714123b",
  "expected_version": 1
}
```

```json
{
  "id": "8a481888-ab20-4b99-9ac0-0e70a641e046",
  "order_id": "6f176650-b9e7-483a-8269-aac6612b15a1",
  "assignment_id": "0106c650-ff58-4afe-bbcc-7820a9eca3c7",
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
  "arrived_at": "2026-10-30T13:02:45.217021Z",
  "started_at": "2026-10-30T13:02:45.536333Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8a481888-ab20-4b99-9ac0-0e70a641e046/complete` → **200**

```json
{
  "command_id": "6790bb66-96bb-4444-9db7-83d7b2891c6f",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:02:45Z",
  "cash_received": true
}
```

```json
{
  "id": "8a481888-ab20-4b99-9ac0-0e70a641e046",
  "order_id": "6f176650-b9e7-483a-8269-aac6612b15a1",
  "assignment_id": "0106c650-ff58-4afe-bbcc-7820a9eca3c7",
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
  "arrived_at": "2026-10-30T13:02:45.217021Z",
  "started_at": "2026-10-30T13:02:45.536333Z",
  "completed_at": "2026-10-30T13:02:45.857622Z",
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
  "client_id": "ccdef412-dff0-4b6d-a01a-5df123ba3e7b",
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
      "id": "38763ee7-8a7e-48ef-9655-a89b9da76074",
      "at": "2026-10-30T13:02:43.027455Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
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

`GET /api/rider/v1/orders/6f176650-b9e7-483a-8269-aac6612b15a1/tip` → **200**

```json
{
  "order_id": "6f176650-b9e7-483a-8269-aac6612b15a1",
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
  "available_until": "2026-10-31T13:02:45.857622Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/6f176650-b9e7-483a-8269-aac6612b15a1/tip` → **201**

```json
{
  "command_id": "31b5e352-063e-47fd-927b-55c216d0e975",
  "amount_minor": 2500
}
```

```json
{
  "id": "5158dc4c-4446-4082-8c61-01a879580e6d",
  "order_id": "6f176650-b9e7-483a-8269-aac6612b15a1",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T13:02:47.100271Z"
}
```

`GET /api/rider/v1/orders/6f176650-b9e7-483a-8269-aac6612b15a1/tip` → **200**

```json
{
  "order_id": "6f176650-b9e7-483a-8269-aac6612b15a1",
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
  "available_until": "2026-10-31T13:02:45.857622Z",
  "open": false,
  "tip": {
    "id": "5158dc4c-4446-4082-8c61-01a879580e6d",
    "order_id": "6f176650-b9e7-483a-8269-aac6612b15a1",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T13:02:47.100271Z"
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
      "id": "c011e53e-a9a5-4b0a-9756-6ca7e8a3f5fb",
      "at": "2026-10-30T13:02:46.319558Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "6f176650-b9e7-483a-8269-aac6612b15a1",
      "counterpart_id": null
    },
    {
      "id": "68283fcf-a19d-4891-8635-47a3eb127ad7",
      "at": "2026-10-30T13:02:40.276364Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
      "counterpart_id": null
    },
    {
      "id": "745a0b0d-2751-4a6d-9067-c63400a512f9",
      "at": "2026-10-30T13:02:35.221178Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
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
      "id": "e1a500fc-00ae-4b75-9d54-0916d003fa45",
      "at": "2026-10-30T13:02:48.354464Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "6f176650-b9e7-483a-8269-aac6612b15a1",
      "counterpart_id": null
    },
    {
      "id": "c011e53e-a9a5-4b0a-9756-6ca7e8a3f5fb",
      "at": "2026-10-30T13:02:46.319558Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "6f176650-b9e7-483a-8269-aac6612b15a1",
      "counterpart_id": null
    },
    {
      "id": "68283fcf-a19d-4891-8635-47a3eb127ad7",
      "at": "2026-10-30T13:02:40.276364Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
      "counterpart_id": null
    },
    {
      "id": "745a0b0d-2751-4a6d-9067-c63400a512f9",
      "at": "2026-10-30T13:02:35.221178Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c43ac0c6-b4fc-4191-bd2a-3f8c748aea49",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b0b89470-54be-455c-834f-40b727107c7b",
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
  "last_heartbeat_at": "2026-10-30T13:02:44.903201Z",
  "last_location_at": "2026-10-30T13:02:44.903201Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b0b89470-54be-455c-834f-40b727107c7b/close` → **200**

```json
{
  "command_id": "53d5d832-a914-4bdf-b580-3095afd3e9e9",
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

Done: card order 6f176650-b9e7-483a-8269-aac6612b15a1.

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
  "phone": "+380731952459",
  "device_ref": "sandbox-8315"
}
```

```json
{
  "challenge_id": "89a2e4b6-0dbc-409b-a6e4-4105c56dd7a9",
  "expires_at": "2026-10-30T13:07:50.194359098Z",
  "resend_available_at": "2026-10-30T13:02:51.194359098Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731952459` → **200**

```json
{
  "phone": "+380731952459",
  "audience": "CLIENT",
  "code": "550308",
  "sent_at": "2026-10-30T13:02:50.196974733Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "89a2e4b6-0dbc-409b-a6e4-4105c56dd7a9",
  "code": "550308",
  "device_ref": "sandbox-8315"
}
```

```json
{
  "session_id": "2b78bdd0-a48d-4025-ad4f-88581df2f0ed",
  "subject": {
    "type": "CLIENT",
    "id": "55238976-f3b6-405c-b69a-1af33eb2a21c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NTIzODk3Ni1mM2I2LTQwNWMtYjY5YS0xYWYzM2ViMmEyMWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MjcwLCJpYXQiOjE3OTMzNjUzNzAsImp0aSI6IjUyY2Q5MGE5LTVjMWUtNDY1OC04YTdjLTk0MGNiNzc1NmMxZCIsInNpZCI6IjJiNzhiZGQwLWE0OGQtNDAyNS1hZDRmLTg4NTgxZGYyZjBlZCJ9.Z1sM3e04c-c4D5KDczmNbAqOPWhAjgTmJLpQRAHBGfk",
  "access_expires_at": "2026-10-30T13:17:50.52253256Z",
  "refresh_token": "V68vfYirMs-HDRiNsTtfjBNExIyLxy0CbJYpa9ZWg3I",
  "refresh_expires_at": "2026-11-29T13:02:50.521836962Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "cbc7bd01-2e3c-418b-bcfe-742c4c24b424",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "d8873f53-d34b-49bb-ade0-30fd352cb142",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-d8873f53-d34b-49bb-ade0-30fd352cb142",
    "orderDate": "1793365370",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "3f8391d140d018c096f8fc127c138698",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=d8873f53-d34b-49bb-ade0-30fd352cb142",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731952459"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=d8873f53-d34b-49bb-ade0-30fd352cb142",
  "created_at": "2026-10-30T13:02:50.823248Z",
  "expires_at": "2026-10-30T13:32:50.823248Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/d8873f53-d34b-49bb-ade0-30fd352cb142` → **200**

```json
{
  "id": "d8873f53-d34b-49bb-ade0-30fd352cb142",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T13:02:50.823248Z",
  "expires_at": "2026-10-30T13:32:50.823248Z",
  "completed_at": "2026-10-30T13:02:51.135299Z",
  "masked_pan": "41****7094",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "55238976-f3b6-405c-b69a-1af33eb2a21c",
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
      "id": "3c6396e1-90ce-4bc3-8ff6-f82ada872c76",
      "at": "2026-10-30T13:02:51.374066Z",
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
  "client_id": "55238976-f3b6-405c-b69a-1af33eb2a21c",
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
      "id": "3c6396e1-90ce-4bc3-8ff6-f82ada872c76",
      "at": "2026-10-30T13:02:51.374066Z",
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
  "device_ref": "sandbox-28799"
}
```

```json
{
  "challenge_id": "a2199a7f-bad9-46d1-9934-4b13e265c63c",
  "expires_at": "2026-10-30T13:07:52.065769609Z",
  "resend_available_at": "2026-10-30T13:02:53.065769609Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "422878",
  "sent_at": "2026-10-30T13:02:52.068474818Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a2199a7f-bad9-46d1-9934-4b13e265c63c",
  "code": "422878",
  "device_ref": "sandbox-28799"
}
```

```json
{
  "session_id": "5dded066-f1e9-455e-8f0e-1b981f3446ae",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjI3MiwiaWF0IjoxNzkzMzY1MzcyLCJqdGkiOiI1MGJjMThhOS1lMzhlLTRkYWMtODc4Yi1hMjliNWQ0NjAyYWQiLCJzaWQiOiI1ZGRlZDA2Ni1mMWU5LTQ1NWUtOGYwZS0xYjk4MWYzNDQ2YWUifQ.WanS7GJjDhqI0qNJ4B6txsXkPNK7SotgxyUgvT22Mew",
  "access_expires_at": "2026-10-30T13:17:52.39338598Z",
  "refresh_token": "IHvn4Hnv39AnoRKEByYysTzg9y2n_Ag5O8YqlPheCdg",
  "refresh_expires_at": "2026-11-29T13:02:52.392839226Z",
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
  "command_id": "3320bb04-77ee-498d-a5a8-1053abf195fc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "8890454f-132e-4995-b2e1-6bea59ecd8ec",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-8890454f-132e-4995-b2e1-6bea59ecd8ec",
    "orderDate": "1793365372",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "674e28ff90a1e4749b5682e89b5f4d6c",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=8890454f-132e-4995-b2e1-6bea59ecd8ec",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=8890454f-132e-4995-b2e1-6bea59ecd8ec",
  "created_at": "2026-10-30T13:02:52.978922Z",
  "expires_at": "2026-10-30T13:32:52.978922Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/8890454f-132e-4995-b2e1-6bea59ecd8ec` → **200**

```json
{
  "id": "8890454f-132e-4995-b2e1-6bea59ecd8ec",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T13:02:52.978922Z",
  "expires_at": "2026-10-30T13:32:52.978922Z",
  "completed_at": "2026-10-30T13:02:53.283787Z",
  "masked_pan": "41****7219",
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
      "id": "400b3bb3-59aa-43a3-8bf5-082cffe80278",
      "at": "2026-10-30T13:02:53.381062Z",
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
  "command_id": "85672880-bbae-495d-9236-fbeb29d95284",
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
  "correlation_id": "7aa74f5a-330d-407c-bacd-580b6416a786"
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
  "device_ref": "sandbox-2193"
}
```

```json
{
  "challenge_id": "6b7f5b9c-6d50-4c64-a816-005fa7586346",
  "expires_at": "2026-10-30T13:07:54.214926682Z",
  "resend_available_at": "2026-10-30T13:02:55.214926682Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "244886",
  "sent_at": "2026-10-30T13:02:54.218589349Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6b7f5b9c-6d50-4c64-a816-005fa7586346",
  "code": "244886",
  "device_ref": "sandbox-2193"
}
```

```json
{
  "session_id": "d8142842-bac9-4a4d-a665-c20c3be86117",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjI3NCwiaWF0IjoxNzkzMzY1Mzc0LCJqdGkiOiI0ZDkwYzAxYi01MjFjLTQ5ZjctODg4Zi1jZTExODlkNjQ4MzciLCJzaWQiOiJkODE0Mjg0Mi1iYWM5LTRhNGQtYTY2NS1jMjBjM2JlODYxMTcifQ.TOMGQGJexQsFZvXoFqiFZApESszjEbbLuqdAnsTGhng",
  "access_expires_at": "2026-10-30T13:17:54.547919786Z",
  "refresh_token": "BU36M3AIsHOe8gXlH21eWFRWjcKSWsOrjiEMMBY07TI",
  "refresh_expires_at": "2026-11-29T13:02:54.547267617Z",
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
  "command_id": "f1067589-1bf6-4633-a359-eea2d1b3ee2d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:02:55Z",
    "sequence": 1793365375144
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51e8836a-e7fd-48c1-9366-e834daa23753",
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
  "last_heartbeat_at": "2026-10-30T13:02:55.166025Z",
  "last_location_at": "2026-10-30T13:02:55.166025Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632291407",
  "device_ref": "sandbox-3873"
}
```

```json
{
  "challenge_id": "dbf5b184-0fcc-4c71-9973-b1ba17287564",
  "expires_at": "2026-10-30T13:07:55.462553877Z",
  "resend_available_at": "2026-10-30T13:02:56.462553877Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632291407` → **200**

```json
{
  "phone": "+380632291407",
  "audience": "CLIENT",
  "code": "788615",
  "sent_at": "2026-10-30T13:02:55.466388708Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dbf5b184-0fcc-4c71-9973-b1ba17287564",
  "code": "788615",
  "device_ref": "sandbox-3873"
}
```

```json
{
  "session_id": "1f958b8c-950a-4866-9070-56f4408fff8c",
  "subject": {
    "type": "CLIENT",
    "id": "b0749f26-c605-4ea3-9bdb-d6751239a335"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMDc0OWYyNi1jNjA1LTRlYTMtOWJkYi1kNjc1MTIzOWEzMzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2Mjc1LCJpYXQiOjE3OTMzNjUzNzUsImp0aSI6IjEyNjNhYmM2LTJlMGEtNDI5Ni1iOTMxLTQ5MzI0MjU3MGU5OCIsInNpZCI6IjFmOTU4YjhjLTk1MGEtNDg2Ni05MDcwLTU2ZjQ0MDhmZmY4YyJ9.VjdROHG598t0csADbGD5p3bYQQ_pcY03pnuolJsc2to",
  "access_expires_at": "2026-10-30T13:17:55.786622491Z",
  "refresh_token": "rUnNr2FFXGjn6i1YdYnu82Nf9l5o3uQuBRdOCH7G-eU",
  "refresh_expires_at": "2026-11-29T13:02:55.786083078Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1d0d968a-6755-4c2f-8bf3-fb3cb00b8426",
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
  "id": "efccf471-bfda-4ded-94f5-0bf78b33b8ff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:07:56.085553Z",
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
  "command_id": "992c9c92-fdcb-442b-af3c-34b3e6707336",
  "quote_id": "efccf471-bfda-4ded-94f5-0bf78b33b8ff",
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
  "id": "1100c40e-d31d-4ae3-92df-69403483330a",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b0749f26-c605-4ea3-9bdb-d6751239a335",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:02:56.397656Z",
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
    "id": "2dc00b6e-91f7-4ddd-8b6d-547bac82d362",
    "order_id": "1100c40e-d31d-4ae3-92df-69403483330a",
    "expires_at": "2026-10-30T13:03:11.400815Z",
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

`POST /api/driver/v1/offers/2dc00b6e-91f7-4ddd-8b6d-547bac82d362/accept` → **200**

```json
{
  "command_id": "71e4f684-ae6c-4853-810b-6038ed740f31"
}
```

```json
{
  "id": "33c4e011-fe9c-428e-81c0-75fd393c720d",
  "order_id": "1100c40e-d31d-4ae3-92df-69403483330a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "36859780-f490-46ff-ae53-c82bbdf03a9f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "36859780-f490-46ff-ae53-c82bbdf03a9f",
  "order_id": "1100c40e-d31d-4ae3-92df-69403483330a",
  "assignment_id": "33c4e011-fe9c-428e-81c0-75fd393c720d",
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

`POST /api/driver/v1/work-sessions/51e8836a-e7fd-48c1-9366-e834daa23753/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:02:57Z",
    "sequence": 1793365377626
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51e8836a-e7fd-48c1-9366-e834daa23753",
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
  "last_heartbeat_at": "2026-10-30T13:02:57.647616Z",
  "last_location_at": "2026-10-30T13:02:57.647616Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/36859780-f490-46ff-ae53-c82bbdf03a9f/arrive` → **200**

```json
{
  "command_id": "43847020-9110-430b-a0e3-9c27b0d8bc53",
  "expected_version": 0
}
```

```json
{
  "id": "36859780-f490-46ff-ae53-c82bbdf03a9f",
  "order_id": "1100c40e-d31d-4ae3-92df-69403483330a",
  "assignment_id": "33c4e011-fe9c-428e-81c0-75fd393c720d",
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
  "arrived_at": "2026-10-30T13:02:57.952778Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/36859780-f490-46ff-ae53-c82bbdf03a9f/start` → **200**

```json
{
  "command_id": "f5309750-3f44-487f-9eb2-86467ea9e5da",
  "expected_version": 1
}
```

```json
{
  "id": "36859780-f490-46ff-ae53-c82bbdf03a9f",
  "order_id": "1100c40e-d31d-4ae3-92df-69403483330a",
  "assignment_id": "33c4e011-fe9c-428e-81c0-75fd393c720d",
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
  "arrived_at": "2026-10-30T13:02:57.952778Z",
  "started_at": "2026-10-30T13:02:58.258223Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/36859780-f490-46ff-ae53-c82bbdf03a9f/complete` → **200**

```json
{
  "command_id": "e9f8d58b-f3c4-41d3-8979-211da53b82c9",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:02:58Z",
  "cash_received": false
}
```

```json
{
  "id": "36859780-f490-46ff-ae53-c82bbdf03a9f",
  "order_id": "1100c40e-d31d-4ae3-92df-69403483330a",
  "assignment_id": "33c4e011-fe9c-428e-81c0-75fd393c720d",
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
  "arrived_at": "2026-10-30T13:02:57.952778Z",
  "started_at": "2026-10-30T13:02:58.258223Z",
  "completed_at": "2026-10-30T13:02:58.574706Z",
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
  "session_id": "3aff8328-68f2-4a98-b492-ac9bf862ae60",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyNzksImlhdCI6MTc5MzM2NTM3OSwianRpIjoiNzVmM2EwYzMtNjk3MS00ZmE5LWFmYjMtOGFhMTQ5NGMxYWUxIiwic2lkIjoiM2FmZjgzMjgtNjhmMi00YTk4LWI0OTItYWM5YmY4NjJhZTYwIn0.Q6tZqtT4oQ8NTyM3FD-PSNK2wN2bIWPsidDijzcIgeQ",
  "access_expires_at": "2026-10-30T13:17:59.211771724Z",
  "refresh_token": "JcW6VQ6ZUl5ArXtbysQ1rpajcolB6dcNsxVkmJ_-ST0",
  "refresh_expires_at": "2026-10-31T01:02:59.211234283Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/1100c40e-d31d-4ae3-92df-69403483330a/cash-dispute` → **200**

```json
{
  "order_id": "1100c40e-d31d-4ae3-92df-69403483330a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "b0749f26-c605-4ea3-9bdb-d6751239a335",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T13:02:59.45767Z",
  "decide_by": "2026-11-13T13:02:59.45767Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T13:02:59.45767Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "1100c40e-d31d-4ae3-92df-69403483330a",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "b0749f26-c605-4ea3-9bdb-d6751239a335",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T13:02:59.45767Z",
      "decide_by": "2026-11-13T13:02:59.45767Z",
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

`POST /api/admin/v1/orders/1100c40e-d31d-4ae3-92df-69403483330a/cash-dispute/decide` → **400**

```json
{
  "command_id": "46897a5c-ee8b-417b-ac19-16e20de6bece",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/1100c40e-d31d-4ae3-92df-69403483330a/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "6069f037-b3a6-4c00-9956-bfced2e56653",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/1100c40e-d31d-4ae3-92df-69403483330a/cash-dispute/decide` → **200**

```json
{
  "command_id": "fb774642-aaaa-449f-83be-8b555ebb89f5",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "1100c40e-d31d-4ae3-92df-69403483330a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "b0749f26-c605-4ea3-9bdb-d6751239a335",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T13:02:59.45767Z",
  "decide_by": "2026-11-13T13:02:59.45767Z",
  "decision": "PAY_DRIVER",
  "decided_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T13:03:00.466952Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/1100c40e-d31d-4ae3-92df-69403483330a/cash-dispute/decide` → **409**

```json
{
  "command_id": "80d6aaef-d9b8-40fb-a235-ef043603753c",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/1100c40e-d31d-4ae3-92df-69403483330a/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "35b4eb28-329f-4a94-b65b-fd37c8df6353"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51e8836a-e7fd-48c1-9366-e834daa23753",
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
  "last_heartbeat_at": "2026-10-30T13:02:57.647616Z",
  "last_location_at": "2026-10-30T13:02:57.647616Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/51e8836a-e7fd-48c1-9366-e834daa23753/close` → **200**

```json
{
  "command_id": "a1f3611b-ab6d-40a8-8c3b-d93c9660369f",
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
  "phone": "+380730346741",
  "device_ref": "sandbox-23334"
}
```

```json
{
  "challenge_id": "7fb426de-27df-47b0-8909-96b60e8aef70",
  "expires_at": "2026-10-30T13:08:01.704420764Z",
  "resend_available_at": "2026-10-30T13:03:02.704420764Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730346741` → **200**

```json
{
  "phone": "+380730346741",
  "audience": "CLIENT",
  "code": "882618",
  "sent_at": "2026-10-30T13:03:01.70709244Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7fb426de-27df-47b0-8909-96b60e8aef70",
  "code": "882618",
  "device_ref": "sandbox-23334"
}
```

```json
{
  "session_id": "8e5f3779-817c-45ab-a469-47a5e5ff7631",
  "subject": {
    "type": "CLIENT",
    "id": "e8f63fcc-058f-4a49-9c21-35db6cc7f9af"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOGY2M2ZjYy0wNThmLTRhNDktOWMyMS0zNWRiNmNjN2Y5YWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MjgyLCJpYXQiOjE3OTMzNjUzODIsImp0aSI6ImQ4MTI3NTM5LWNhMjAtNDc1Yi05MThhLTEzZDUxYTcyOTc4MCIsInNpZCI6IjhlNWYzNzc5LTgxN2MtNDVhYi1hNDY5LTQ3YTVlNWZmNzYzMSJ9.iC1DpI-2vc5Iv5RFSmHNQDUuUldxHpqDsXugsQi2mA4",
  "access_expires_at": "2026-10-30T13:18:02.034041495Z",
  "refresh_token": "oezmC59niYMdnf9UtmH4apAK38iO2N-gAgv2KXUUibI",
  "refresh_expires_at": "2026-11-29T13:03:02.033410171Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "3066a611-3ee7-4944-8ee6-102427836e15",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "29f372d1-31d2-4aa0-8e00-e9a8a5354336",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-29f372d1-31d2-4aa0-8e00-e9a8a5354336",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "a4db955e5cea580efc728daeef783aaa",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=29f372d1-31d2-4aa0-8e00-e9a8a5354336",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730346741"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=29f372d1-31d2-4aa0-8e00-e9a8a5354336",
  "expires_at": "2026-10-30T13:33:02.328623Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/29f372d1-31d2-4aa0-8e00-e9a8a5354336` → **200**

```json
{
  "id": "29f372d1-31d2-4aa0-8e00-e9a8a5354336",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:33:02.328623Z",
  "card": {
    "id": "4b50efbb-cf6b-4593-a48b-23503483432c",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6415",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:03:02.63428Z"
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
  "device_ref": "sandbox-24536"
}
```

```json
{
  "challenge_id": "e2a3e3a9-8e11-492e-9593-81991117d8fa",
  "expires_at": "2026-10-30T13:08:02.949865702Z",
  "resend_available_at": "2026-10-30T13:03:03.949865702Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "579450",
  "sent_at": "2026-10-30T13:03:02.952519297Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2a3e3a9-8e11-492e-9593-81991117d8fa",
  "code": "579450",
  "device_ref": "sandbox-24536"
}
```

```json
{
  "session_id": "c21eb2b5-86f4-4fae-9419-30ecc5d185f1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjI4MywiaWF0IjoxNzkzMzY1MzgzLCJqdGkiOiJiZWUxN2ExOS1iOGEwLTQ4MWMtODEwZi03NmQxNTE1MDcyYzgiLCJzaWQiOiJjMjFlYjJiNS04NmY0LTRmYWUtOTQxOS0zMGVjYzVkMTg1ZjEifQ.UHRt6kIYjV2DsbUrkGVsVpqrPuKJCvP09eDlgK18K3I",
  "access_expires_at": "2026-10-30T13:18:03.277354471Z",
  "refresh_token": "VhtUSkpJDtQxILkVH2ErlNVOAIR8qaOLj8ojPNsvgWA",
  "refresh_expires_at": "2026-11-29T13:03:03.276767487Z",
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
  "command_id": "4fbd5a69-d88b-4f39-b3be-a5a65117c03e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:03:03Z",
    "sequence": 1793365383885
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "63a75f83-0b69-4850-8ae7-46aad2e6296a",
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
  "last_heartbeat_at": "2026-10-30T13:03:03.906208Z",
  "last_location_at": "2026-10-30T13:03:03.906208Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c139d100-9e13-4b00-8b5e-37002d57b929",
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
  "id": "7aac710f-5552-4088-ae85-476b8f0c5b1f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:08:04.210054Z",
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
  "command_id": "c7a84067-9fac-4a16-9660-dfb38cec24d2",
  "quote_id": "7aac710f-5552-4088-ae85-476b8f0c5b1f",
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
  "id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e8f63fcc-058f-4a49-9c21-35db6cc7f9af",
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
  "created_at": "2026-10-30T13:03:04.529594Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6f8d5633-feef-4fa8-881d-22ace7bbcb2c` → **200**

```json
{
  "id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e8f63fcc-058f-4a49-9c21-35db6cc7f9af",
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
  "created_at": "2026-10-30T13:03:04.529594Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6f8d5633-feef-4fa8-881d-22ace7bbcb2c` → **200**

```json
{
  "id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e8f63fcc-058f-4a49-9c21-35db6cc7f9af",
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
  "created_at": "2026-10-30T13:03:04.529594Z",
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
    "id": "803e65ef-7a8b-4545-809c-66a83173aeba",
    "order_id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
    "expires_at": "2026-10-30T13:03:20.501224Z",
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

`POST /api/driver/v1/offers/803e65ef-7a8b-4545-809c-66a83173aeba/accept` → **200**

```json
{
  "command_id": "2cf68c7a-6c95-449d-89a4-7d41983efbc7"
}
```

```json
{
  "id": "646cb091-c4a2-4bf6-8d8c-b62b60126f80",
  "order_id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4d4539e3-f3f0-48eb-b8fa-47e78ca33a05",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4d4539e3-f3f0-48eb-b8fa-47e78ca33a05",
  "order_id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
  "assignment_id": "646cb091-c4a2-4bf6-8d8c-b62b60126f80",
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

`POST /api/rider/v1/orders/6f8d5633-feef-4fa8-881d-22ace7bbcb2c/messages` → **201**

```json
{
  "command_id": "8e6e1687-d039-4c2a-9c11-391094fa4c9c",
  "body": "Я біля входу, мій номер +380730346741, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "6cca1d6f-f0c8-401c-8b1a-b975f844c8a4",
  "order_id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380730346741, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T13:03:07.352556299Z"
}
```

`POST /api/driver/v1/trips/4d4539e3-f3f0-48eb-b8fa-47e78ca33a05/messages` → **201**

```json
{
  "command_id": "3521ffe8-33e7-46cd-b9ae-d87d626d3c25",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "b13c2910-d0a0-49e3-84f2-79e984507b8b",
  "order_id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T13:03:07.658176977Z"
}
```

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/63a75f83-0b69-4850-8ae7-46aad2e6296a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:03:12Z",
    "sequence": 1793365392974
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "63a75f83-0b69-4850-8ae7-46aad2e6296a",
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
  "last_heartbeat_at": "2026-10-30T13:03:12.995804Z",
  "last_location_at": "2026-10-30T13:03:12.995804Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/4d4539e3-f3f0-48eb-b8fa-47e78ca33a05/arrive` → **200**

```json
{
  "command_id": "19283b96-96bc-436d-b6ab-9b57b4b02b54",
  "expected_version": 0
}
```

```json
{
  "id": "4d4539e3-f3f0-48eb-b8fa-47e78ca33a05",
  "order_id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
  "assignment_id": "646cb091-c4a2-4bf6-8d8c-b62b60126f80",
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
  "arrived_at": "2026-10-30T13:03:13.303491Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4d4539e3-f3f0-48eb-b8fa-47e78ca33a05/start` → **200**

```json
{
  "command_id": "6d6ebf15-86b7-4b2e-a1a5-30fbd4dd5435",
  "expected_version": 1
}
```

```json
{
  "id": "4d4539e3-f3f0-48eb-b8fa-47e78ca33a05",
  "order_id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
  "assignment_id": "646cb091-c4a2-4bf6-8d8c-b62b60126f80",
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
  "arrived_at": "2026-10-30T13:03:13.303491Z",
  "started_at": "2026-10-30T13:03:13.618003Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/63a75f83-0b69-4850-8ae7-46aad2e6296a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:04:43Z",
    "sequence": 1793365483952
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "63a75f83-0b69-4850-8ae7-46aad2e6296a",
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
  "last_heartbeat_at": "2026-10-30T13:04:43.972641Z",
  "last_location_at": "2026-10-30T13:04:43.972641Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/4d4539e3-f3f0-48eb-b8fa-47e78ca33a05/complete` → **200**

```json
{
  "command_id": "7edc1731-6e4c-4c68-957f-f54756b516cc",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:04:44Z",
  "cash_received": false
}
```

```json
{
  "id": "4d4539e3-f3f0-48eb-b8fa-47e78ca33a05",
  "order_id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
  "assignment_id": "646cb091-c4a2-4bf6-8d8c-b62b60126f80",
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
  "arrived_at": "2026-10-30T13:03:13.303491Z",
  "started_at": "2026-10-30T13:03:13.618003Z",
  "completed_at": "2026-10-30T13:04:44.280506Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/6f8d5633-feef-4fa8-881d-22ace7bbcb2c` → **200**

```json
{
  "id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "e8f63fcc-058f-4a49-9c21-35db6cc7f9af",
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
    "id": "646cb091-c4a2-4bf6-8d8c-b62b60126f80",
    "order_id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4d4539e3-f3f0-48eb-b8fa-47e78ca33a05",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:03:04.529594Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6f8d5633-feef-4fa8-881d-22ace7bbcb2c` → **200**

```json
{
  "id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "e8f63fcc-058f-4a49-9c21-35db6cc7f9af",
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
    "id": "646cb091-c4a2-4bf6-8d8c-b62b60126f80",
    "order_id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4d4539e3-f3f0-48eb-b8fa-47e78ca33a05",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:03:04.529594Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6f8d5633-feef-4fa8-881d-22ace7bbcb2c` → **200**

```json
{
  "id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "e8f63fcc-058f-4a49-9c21-35db6cc7f9af",
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
    "id": "646cb091-c4a2-4bf6-8d8c-b62b60126f80",
    "order_id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4d4539e3-f3f0-48eb-b8fa-47e78ca33a05",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:03:04.529594Z",
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
  "session_id": "63a75f83-0b69-4850-8ae7-46aad2e6296a",
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
  "last_heartbeat_at": "2026-10-30T13:04:43.972641Z",
  "last_location_at": "2026-10-30T13:04:43.972641Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/63a75f83-0b69-4850-8ae7-46aad2e6296a/close` → **200**

```json
{
  "command_id": "ed944f4c-0fc4-405f-92f3-ac279803df50",
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
  "session_id": "5b53a815-4122-443d-9b70-b95ba84551cc",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYzODgsImlhdCI6MTc5MzM2NTQ4OCwianRpIjoiMzdiOTM1ZmUtYjJkMS00MmFhLWFlYjctZGVjYmMzZDZlZGM0Iiwic2lkIjoiNWI1M2E4MTUtNDEyMi00NDNkLTliNzAtYjk1YmE4NDU1MWNjIn0.oWCaFwLTD2kpjZVK2K9Wmjn0_yyT3FIq_yt2Q3oBs14",
  "access_expires_at": "2026-10-30T13:19:48.473666684Z",
  "refresh_token": "CowkIJPKsOuf6bVqjkZkmqDRQUfy3i385fxgGwgv-v0",
  "refresh_expires_at": "2026-10-31T01:04:48.473121964Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/6f8d5633-feef-4fa8-881d-22ace7bbcb2c/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/6f8d5633-feef-4fa8-881d-22ace7bbcb2c/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "06db352b-a931-4353-94ea-df6dbd74f658"
}
```

`GET /api/admin/v1/orders/6f8d5633-feef-4fa8-881d-22ace7bbcb2c/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T13:04:49.054200934Z",
  "order": {
    "id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
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
    "created_at": "2026-10-30T13:03:04.529594Z",
    "assigned_at": "2026-10-30T13:03:06.754844Z",
    "arrived_at": "2026-10-30T13:03:13.303491Z",
    "started_at": "2026-10-30T13:03:13.618003Z",
    "completed_at": "2026-10-30T13:04:44.280506Z"
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
    "id": "e8f63fcc-058f-4a49-9c21-35db6cc7f9af",
    "registered_at": "2026-10-30T13:03:02.031602Z",
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
      "created_at": "2026-10-30T13:03:04.531794Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T13:04:44.708949Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/6f8d5633-feef-4fa8-881d-22ace7bbcb2c/chargebacks` → **422**

```json
{
  "command_id": "a8d1f031-a493-47d9-8065-f32bf5581a8d",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/6f8d5633-feef-4fa8-881d-22ace7bbcb2c/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "790d312d-baf1-489c-be05-8dcb600f6c10"
}
```

`POST /api/admin/v1/orders/6f8d5633-feef-4fa8-881d-22ace7bbcb2c/chargebacks` → **201**

```json
{
  "command_id": "8226f414-4ae3-4a04-a831-1ca3de7e9218",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "0c9c8388-6e70-45fa-b7a9-dcd8a36d1a9f",
  "order_id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T13:04:49.740401Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/6f8d5633-feef-4fa8-881d-22ace7bbcb2c/chargebacks` → **201**

```json
{
  "command_id": "8226f414-4ae3-4a04-a831-1ca3de7e9218",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "0c9c8388-6e70-45fa-b7a9-dcd8a36d1a9f",
  "order_id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T13:04:49.740401Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/e8f63fcc-058f-4a49-9c21-35db6cc7f9af` → **200**

```json
{
  "client": {
    "id": "e8f63fcc-058f-4a49-9c21-35db6cc7f9af",
    "phone": "+380730346741",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:03:02.031602Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:03:04.529594Z",
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

`GET /api/admin/v1/clients/e8f63fcc-058f-4a49-9c21-35db6cc7f9af` → **200**

```json
{
  "client": {
    "id": "e8f63fcc-058f-4a49-9c21-35db6cc7f9af",
    "phone": "+380730346741",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:03:02.031602Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:03:04.529594Z",
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

`POST /api/admin/v1/orders/6f8d5633-feef-4fa8-881d-22ace7bbcb2c/chargebacks/0c9c8388-6e70-45fa-b7a9-dcd8a36d1a9f/resolve` → **200**

```json
{
  "command_id": "22ce9bc1-3109-450d-97b5-905ccd94301d",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "0c9c8388-6e70-45fa-b7a9-dcd8a36d1a9f",
  "order_id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T13:04:49.740401Z",
  "resolved_at": "2026-10-30T13:04:52.047771Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/e8f63fcc-058f-4a49-9c21-35db6cc7f9af` → **200**

```json
{
  "client": {
    "id": "e8f63fcc-058f-4a49-9c21-35db6cc7f9af",
    "phone": "+380730346741",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:03:02.031602Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:03:04.529594Z",
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

`GET /api/admin/v1/clients/e8f63fcc-058f-4a49-9c21-35db6cc7f9af` → **200**

```json
{
  "client": {
    "id": "e8f63fcc-058f-4a49-9c21-35db6cc7f9af",
    "phone": "+380730346741",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:03:02.031602Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:03:04.529594Z",
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

`POST /api/admin/v1/orders/6f8d5633-feef-4fa8-881d-22ace7bbcb2c/chargebacks/0c9c8388-6e70-45fa-b7a9-dcd8a36d1a9f/resolve` → **409**

```json
{
  "command_id": "8cda23fb-0d97-4dd8-9ca5-edcaece90298",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/6f8d5633-feef-4fa8-881d-22ace7bbcb2c/chargebacks/0c9c8388-6e70-45fa-b7a9-dcd8a36d1a9f/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "bb045474-1e8c-489a-a876-68d94700c4f5"
}
```

`GET /api/admin/v1/orders/6f8d5633-feef-4fa8-881d-22ace7bbcb2c/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "0c9c8388-6e70-45fa-b7a9-dcd8a36d1a9f",
      "order_id": "6f8d5633-feef-4fa8-881d-22ace7bbcb2c",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T13:04:49.740401Z",
      "resolved_at": "2026-10-30T13:04:52.047771Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 6f8d5633-feef-4fa8-881d-22ace7bbcb2c without phone or card digits; chargeback 0c9c8388-6e70-45fa-b7a9-dcd8a36d1a9f recorded and won.

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
  "session_id": "214f8063-9f78-4bfc-abd3-37e385edf4ae",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYzOTUsImlhdCI6MTc5MzM2NTQ5NSwianRpIjoiNTg1ZmRmNGQtMDFiNC00YTg4LWJhMzItZDkzY2I2OGM5NjVkIiwic2lkIjoiMjE0ZjgwNjMtOWY3OC00YmZjLWFiZDMtMzdlMzg1ZWRmNGFlIn0.HJwKpitXGRLLR3YNdud2MUOqI5_N9JVp0HqFA_5NCvo",
  "access_expires_at": "2026-10-30T13:19:55.229271768Z",
  "refresh_token": "JdBl0yagZR6ji15MjGd66_Z4cdRV-WsZ3I88QI0YFks",
  "refresh_expires_at": "2026-10-31T01:04:55.228650324Z",
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
  "phone": "+48600311271",
  "device_ref": "sandbox-29122"
}
```

```json
{
  "challenge_id": "9a9b095a-f06f-48ba-9a04-83003df9c6ee",
  "expires_at": "2026-10-30T13:09:56.122802138Z",
  "resend_available_at": "2026-10-30T13:04:57.122802138Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600311271` → **200**

```json
{
  "phone": "+48600311271",
  "audience": "CLIENT",
  "code": "121422",
  "sent_at": "2026-10-30T13:04:56.125428354Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9a9b095a-f06f-48ba-9a04-83003df9c6ee",
  "code": "121422",
  "device_ref": "sandbox-29122"
}
```

```json
{
  "session_id": "049be24d-a55e-47a0-a4c8-871918aeb536",
  "subject": {
    "type": "CLIENT",
    "id": "41aa22e7-4a9b-4aa0-a881-326319c393b9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWFhMjJlNy00YTliLTRhYTAtYTg4MS0zMjYzMTljMzkzYjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2Mzk2LCJpYXQiOjE3OTMzNjU0OTYsImp0aSI6ImVlMjRjYmVlLTNkMmUtNGEwYy05MDlhLTQzOWNiYWE1ZmE3OCIsInNpZCI6IjA0OWJlMjRkLWE1NWUtNDdhMC1hNGM4LTg3MTkxOGFlYjUzNiJ9.MmzvpLoNolaKvkAWu64btPjVTnvE-s2NYPYfWkzdkAg",
  "access_expires_at": "2026-10-30T13:19:56.441813603Z",
  "refresh_token": "R4z9u2vO-te_tT223JOelFw34UJuJ8CwairKUfCGCWg",
  "refresh_expires_at": "2026-11-29T13:04:56.44130145Z",
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
  "command_id": "87972dbd-ae41-4c52-9a56-66a9f0351988",
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
  "correlation_id": "197f05f7-5a3a-4e71-a6a3-bd891c22e483",
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
  "command_id": "5dc461d3-419c-4321-b944-a08abfbe27b1",
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
  "paused_at": "2026-10-30T13:04:57.641768657Z",
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
  "command_id": "3b79e5fc-fda4-4210-a8fe-bc5b811a60d2",
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
  "id": "d3f4728b-80ed-4c84-b8ee-cd3984dfc402",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:09:58.260048Z",
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
  "command_id": "69c7b40d-6749-4093-a830-02d53cf1a5e0",
  "quote_id": "d3f4728b-80ed-4c84-b8ee-cd3984dfc402",
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
  "correlation_id": "b0a31f5e-9943-4761-8adf-c5f3247a1a47"
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
  "paused_at": "2026-10-30T13:04:57.641769Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "1facd3df-487b-4565-ac78-a00130f00e53",
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
  "command_id": "0eb26e57-6066-4f16-a757-49f501d96a2f",
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
  "command_id": "0e2eb6db-9d57-4cc6-9691-6d4bf9ba7d4d",
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
  "id": "5baf6fee-65e2-48fe-9ac2-c4a4723f3fb7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:10:00.061838Z",
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
  "command_id": "5d6e2ec2-b7c6-4675-a7bf-2d1e4a98d33e",
  "quote_id": "5baf6fee-65e2-48fe-9ac2-c4a4723f3fb7",
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
  "correlation_id": "35b058c4-15ab-41a7-8c98-5fd844eef0d0"
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
  "command_id": "e0feb535-0bcf-4f57-9dd3-697c9e848856",
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
  "command_id": "ab95508f-0846-44c9-9ba8-267ae2b3834a",
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
  "id": "9f37347f-4514-4f23-a113-4c1985391a1b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:10:01.280001Z",
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
  "command_id": "05e02bf7-5317-43ff-b90d-395a21fc9aeb",
  "quote_id": "9f37347f-4514-4f23-a113-4c1985391a1b",
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
  "correlation_id": "9b80e83b-58dd-4329-92fb-eea5f977f828"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "59531838-098c-4e12-b292-d9037d091706",
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
  "correlation_id": "4623bfa7-cadd-4bb2-a86d-c7ced16a081a"
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
  "command_id": "cb057b54-e86b-422f-8dab-4e9670c7ef77",
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
  "phone": "+380678146725",
  "device_ref": "sandbox-16383"
}
```

```json
{
  "challenge_id": "a0bde052-a17b-40dc-9d05-6072754c0e3a",
  "expires_at": "2026-10-30T13:10:02.813075046Z",
  "resend_available_at": "2026-10-30T13:05:03.813075046Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678146725` → **200**

```json
{
  "phone": "+380678146725",
  "audience": "CLIENT",
  "code": "081350",
  "sent_at": "2026-10-30T13:05:02.815655525Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a0bde052-a17b-40dc-9d05-6072754c0e3a",
  "code": "081350",
  "device_ref": "sandbox-16383"
}
```

```json
{
  "session_id": "888faa2e-0da7-4986-8474-2172e8209b51",
  "subject": {
    "type": "CLIENT",
    "id": "f377d646-f03d-4259-a117-27267abcf2d7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMzc3ZDY0Ni1mMDNkLTQyNTktYTExNy0yNzI2N2FiY2YyZDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NDAzLCJpYXQiOjE3OTMzNjU1MDMsImp0aSI6IjBlYjdhNGQ2LWNmMGItNDBlOC05Zjc0LWVmZTNiZjRiODQzYiIsInNpZCI6Ijg4OGZhYTJlLTBkYTctNDk4Ni04NDc0LTIxNzJlODIwOWI1MSJ9.0jmGpGWcT8JM4apgMtbKuKTlLq_uSlmpucDevUuBr6A",
  "access_expires_at": "2026-10-30T13:20:03.133931933Z",
  "refresh_token": "8zPSF7MjxA06K8f590sx-mBAgm80D1n1H-7PWfi1it8",
  "refresh_expires_at": "2026-11-29T13:05:03.133405552Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f377d646-f03d-4259-a117-27267abcf2d7",
  "session_id": "888faa2e-0da7-4986-8474-2172e8209b51",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c45f33f5-321b-49b8-a568-f936d69b65f8",
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
  "id": "4e592163-a8cd-46a5-bab5-2913749084d5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:10:03.723049Z",
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
  "challenge_id": "2a482335-30d9-48ba-ac56-ba84835e4611",
  "expires_at": "2026-10-30T13:10:06.037999263Z",
  "resend_available_at": "2026-10-30T13:05:07.037999263Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678146725` → **200**

```json
{
  "phone": "+380678146725",
  "audience": "CLIENT",
  "code": "711467",
  "sent_at": "2026-10-30T13:05:06.040182412Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "2577b030-27e3-4e6c-a42f-3fbc40b11249",
  "challenge_id": "2a482335-30d9-48ba-ac56-ba84835e4611",
  "otp_code": "711467"
}
```

```json
{
  "client_id": "f377d646-f03d-4259-a117-27267abcf2d7",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T13:05:06.370206001Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "3102dc2f-ac0c-42ad-8169-35ed3b60b32e",
  "quote_id": "4e592163-a8cd-46a5-bab5-2913749084d5",
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
  "correlation_id": "59dccba2-6aa6-4abf-80af-62e4d62d98fc"
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
  "session_id": "e9e25255-9c1d-421e-ba1b-84fb41aa541a",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY0MDcsImlhdCI6MTc5MzM2NTUwNywianRpIjoiZjQ4Zjk5ODgtZTYyNC00NzMxLWJkOTAtMDE5ZDFjYjBmZWU4Iiwic2lkIjoiZTllMjUyNTUtOWMxZC00MjFlLWJhMWItODRmYjQxYWE1NDFhIn0.MNCw8ipK-Q7BJ1dx4oFCAV_FiZ83AUatEJfUIbgOrZM",
  "access_expires_at": "2026-10-30T13:20:07.316114195Z",
  "refresh_token": "UnF73C-7O_s820tBqLXNpVlBkIiPCGXHLgKVW8d3Zu0",
  "refresh_expires_at": "2026-10-31T01:05:07.315542731Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "f377d646-f03d-4259-a117-27267abcf2d7",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T13:05:06.370206Z",
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

`POST /api/admin/v1/client-deletions/f377d646-f03d-4259-a117-27267abcf2d7/complete` → **200**

```json
{
  "command_id": "04a0483f-823b-491b-84d6-c684d4ab14ab",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "f377d646-f03d-4259-a117-27267abcf2d7",
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
  "correlation_id": "1b057906-1733-4baf-8287-5c6994649151"
}
```

Done: client f377d646-f03d-4259-a117-27267abcf2d7 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662865064",
  "device_ref": "sandbox-18941"
}
```

```json
{
  "challenge_id": "33ed0ced-8446-4cb6-bba0-4fd3a730ea15",
  "expires_at": "2026-10-30T13:10:08.555021602Z",
  "resend_available_at": "2026-10-30T13:05:09.555021602Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662865064` → **200**

```json
{
  "phone": "+380662865064",
  "audience": "CLIENT",
  "code": "427790",
  "sent_at": "2026-10-30T13:05:08.557788027Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "33ed0ced-8446-4cb6-bba0-4fd3a730ea15",
  "code": "427790",
  "device_ref": "sandbox-18941"
}
```

```json
{
  "session_id": "791139d1-e2ff-4280-8bca-c692bdc755dc",
  "subject": {
    "type": "CLIENT",
    "id": "28f6aa67-720c-4203-8ea7-bc96a6748453"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOGY2YWE2Ny03MjBjLTQyMDMtOGVhNy1iYzk2YTY3NDg0NTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NDA4LCJpYXQiOjE3OTMzNjU1MDgsImp0aSI6IjRkMTFlYjk0LTdkZmEtNDIxYy05OWFkLTVmMTczZDU2MjJjMSIsInNpZCI6Ijc5MTEzOWQxLWUyZmYtNDI4MC04YmNhLWM2OTJiZGM3NTVkYyJ9.uXz1msZHoOaILe1sde2jc_A_K8FBlKedcTrfUMaG4OQ",
  "access_expires_at": "2026-10-30T13:20:08.888247227Z",
  "refresh_token": "wD-HcvelcxXcuvMyOG3UJTD3SG2KvLBbJ26nwYV8FnY",
  "refresh_expires_at": "2026-11-29T13:05:08.887561394Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "28f6aa67-720c-4203-8ea7-bc96a6748453",
  "session_id": "791139d1-e2ff-4280-8bca-c692bdc755dc",
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
  "session_id": "cbaba7ed-8f5b-41bc-ab60-dc7b863f95f8",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY0MDksImlhdCI6MTc5MzM2NTUwOSwianRpIjoiNjY5NDZhZTUtYTM2OS00NWFlLThiYzktM2UyZGZiM2NlNWRhIiwic2lkIjoiY2JhYmE3ZWQtOGY1Yi00MWJjLWFiNjAtZGM3Yjg2M2Y5NWY4In0.IH5psTbV9fll-jzt4ZZxCzOTt27q3mIxsrbUD5jdaxw",
  "access_expires_at": "2026-10-30T13:20:09.820458494Z",
  "refresh_token": "zDxD8YBxmwpSZQrKqdn_qeQ6NRvJBzrfWpXBEAhwyeU",
  "refresh_expires_at": "2026-10-31T01:05:09.819867692Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=2865064&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "28f6aa67-720c-4203-8ea7-bc96a6748453",
      "phone": "+380662865064",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T13:05:08.885408Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/28f6aa67-720c-4203-8ea7-bc96a6748453` → **200**

```json
{
  "client": {
    "id": "28f6aa67-720c-4203-8ea7-bc96a6748453",
    "phone": "+380662865064",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:05:08.885408Z",
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

`POST /api/admin/v1/clients/28f6aa67-720c-4203-8ea7-bc96a6748453/block` → **400**

```json
{
  "command_id": "11bc3052-8c21-412c-85d0-2775bd519b24",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/28f6aa67-720c-4203-8ea7-bc96a6748453/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "f164ac29-6f2d-49c2-a4a6-944d012ba1f8",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/28f6aa67-720c-4203-8ea7-bc96a6748453/block` → **200**

```json
{
  "command_id": "5af15eff-5878-4c50-a13f-1552db0f5379",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "28f6aa67-720c-4203-8ea7-bc96a6748453",
  "phone": "+380662865064",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T13:05:08.885408Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T13:05:11.063395Z",
    "by": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
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
  "correlation_id": "42e7dac6-1044-465d-b3a9-2f4338feb134"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662865064",
  "device_ref": "sandbox-23998"
}
```

```json
{
  "challenge_id": "27661e4b-d7d0-4976-8e3a-c07737d480b8",
  "expires_at": "2026-10-30T13:10:13.666561639Z",
  "resend_available_at": "2026-10-30T13:05:14.666561639Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662865064` → **200**

```json
{
  "phone": "+380662865064",
  "audience": "CLIENT",
  "code": "849254",
  "sent_at": "2026-10-30T13:05:13.669131098Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "27661e4b-d7d0-4976-8e3a-c07737d480b8",
  "code": "849254",
  "device_ref": "sandbox-23998"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "e8553f69-ea34-4f54-a08c-d4307b742ff5"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/28f6aa67-720c-4203-8ea7-bc96a6748453` → **200**

```json
{
  "client": {
    "id": "28f6aa67-720c-4203-8ea7-bc96a6748453",
    "phone": "+380662865064",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T13:05:08.885408Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T13:05:11.063395Z",
      "by": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
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

`POST /api/admin/v1/clients/28f6aa67-720c-4203-8ea7-bc96a6748453/unblock` → **200**

```json
{
  "command_id": "786b3bf7-bf9e-4698-b0ab-0b81ce9ef147",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "28f6aa67-720c-4203-8ea7-bc96a6748453",
  "phone": "+380662865064",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T13:05:08.885408Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662865064",
  "device_ref": "sandbox-5604"
}
```

```json
{
  "challenge_id": "5203119f-324d-4ff2-9334-1abb6f66379a",
  "expires_at": "2026-10-30T13:10:16.950081804Z",
  "resend_available_at": "2026-10-30T13:05:17.950081804Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662865064` → **200**

```json
{
  "phone": "+380662865064",
  "audience": "CLIENT",
  "code": "199606",
  "sent_at": "2026-10-30T13:05:16.95266436Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5203119f-324d-4ff2-9334-1abb6f66379a",
  "code": "199606",
  "device_ref": "sandbox-5604"
}
```

```json
{
  "session_id": "642e9188-1efc-4f12-98c1-71d5b3532182",
  "subject": {
    "type": "CLIENT",
    "id": "28f6aa67-720c-4203-8ea7-bc96a6748453"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOGY2YWE2Ny03MjBjLTQyMDMtOGVhNy1iYzk2YTY3NDg0NTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NDE3LCJpYXQiOjE3OTMzNjU1MTcsImp0aSI6ImZhMTdhOTc3LTNjMjktNGUzNS1iYjI0LWRmOGViOTY4MDViMiIsInNpZCI6IjY0MmU5MTg4LTFlZmMtNGYxMi05OGMxLTcxZDViMzUzMjE4MiJ9.2tNos_kGRSjzwgYx-sI1oY2aG0a9ttHIUrOyfY3c-K8",
  "access_expires_at": "2026-10-30T13:20:17.268927543Z",
  "refresh_token": "npQsAbWi31579Js9onWjkIn_3axxEf4zBmkmQZXkFxo",
  "refresh_expires_at": "2026-11-29T13:05:17.2683421Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "28f6aa67-720c-4203-8ea7-bc96a6748453",
  "session_id": "642e9188-1efc-4f12-98c1-71d5b3532182",
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
  "phone": "+380666066563",
  "device_ref": "sandbox-31015"
}
```

```json
{
  "challenge_id": "3c1ca01f-ca91-432c-bde6-4b28a039eae9",
  "expires_at": "2026-10-30T13:10:17.847753283Z",
  "resend_available_at": "2026-10-30T13:05:18.847753283Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666066563` → **200**

```json
{
  "phone": "+380666066563",
  "audience": "CLIENT",
  "code": "372055",
  "sent_at": "2026-10-30T13:05:17.851126264Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c1ca01f-ca91-432c-bde6-4b28a039eae9",
  "code": "372055",
  "device_ref": "sandbox-31015"
}
```

```json
{
  "session_id": "afb15192-5975-4ba0-b211-7a6e21e4db2f",
  "subject": {
    "type": "CLIENT",
    "id": "8f6a47e7-e299-4f06-9909-3f0a963984c4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjZhNDdlNy1lMjk5LTRmMDYtOTkwOS0zZjBhOTYzOTg0YzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NDE4LCJpYXQiOjE3OTMzNjU1MTgsImp0aSI6IjFlNDViYWU5LWY4ZDMtNDMyOC1hMjFkLWU3ODRhNDQzYjY0YSIsInNpZCI6ImFmYjE1MTkyLTU5NzUtNGJhMC1iMjExLTdhNmUyMWU0ZGIyZiJ9.cPnqR0m9JrbIquY9aOA21F_dgMn-TDz8f-tPGGyUsNw",
  "access_expires_at": "2026-10-30T13:20:18.167552592Z",
  "refresh_token": "ywa_GOlJGAWcUzwv8ZurLEkSTKwD4qTgdp0G2yXyTSA",
  "refresh_expires_at": "2026-11-29T13:05:18.167051283Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4f580fca-017e-42ae-8345-bcea280701df",
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
  "id": "7d32c367-589d-47d7-80d9-4d830d21821b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:10:18.462909Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 67c326ea-ca0f-4e32-bbf6-1d001e780733) → **201**

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
  "session_id": "9b1f55f5-2bdd-4df7-b1ab-609f1548c708",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY0MTksImlhdCI6MTc5MzM2NTUxOSwianRpIjoiMzBhMzBhMWMtODk4NS00Mjg0LWE2MGItMTdjZjI1ODZmZDczIiwic2lkIjoiOWIxZjU1ZjUtMmJkZC00ZGY3LWIxYWItNjA5ZjE1NDhjNzA4In0.DmI3NRvB9zLOZ02fiA7i2whhPNK5hb_klUvuAYQzno0",
  "access_expires_at": "2026-10-30T13:20:19.14703421Z",
  "refresh_token": "I03egpA4FEKt5PUQ0_0-VOrB_6uGqAfeCnLaTVYAmMQ",
  "refresh_expires_at": "2026-10-31T01:05:19.146379815Z",
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
  "session_id": "6cc2b2d8-a25e-471b-8f65-d27c2690a9d1",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY0MTksImlhdCI6MTc5MzM2NTUxOSwianRpIjoiZTE4OThjYmItYTFkNC00YTQ1LWJhNTktNjczNTA0YjBkNGM1Iiwic2lkIjoiNmNjMmIyZDgtYTI1ZS00NzFiLThmNjUtZDI3YzI2OTBhOWQxIn0.JL-QtAWPSHyeG9wdijATY0D45NavT_DFa98k9jHWx4s",
  "access_expires_at": "2026-10-30T13:20:19.775136345Z",
  "refresh_token": "fc52NXLD5ltrXExWuJF5TqvSzTvN7cHAMcPaLPV-dxQ",
  "refresh_expires_at": "2026-10-31T01:05:19.774539395Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/20445cf3-64dd-4030-91e4-b07f274d678d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:05:18.772026Z",
      "actor": {
        "type": "CLIENT",
        "id": "8f6a47e7-e299-4f06-9909-3f0a963984c4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "20445cf3-64dd-4030-91e4-b07f274d678d",
        "quote_id": "7d32c367-589d-47d7-80d9-4d830d21821b",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "67c326ea-ca0f-4e32-bbf6-1d001e780733"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:05:18.774251Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "20445cf3-64dd-4030-91e4-b07f274d678d",
        "attempt_id": "bf775235-1e76-431b-abf4-5a2b8d3ede2f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "67c326ea-ca0f-4e32-bbf6-1d001e780733"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T13:05:18.785151Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "20445cf3-64dd-4030-91e4-b07f274d678d",
        "attempt_id": "bf775235-1e76-431b-abf4-5a2b8d3ede2f"
      },
      "correlation_id": "67c326ea-ca0f-4e32-bbf6-1d001e780733"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "bf775235-1e76-431b-abf4-5a2b8d3ede2f",
        "generation": 1,
        "started_at": "2026-10-30T13:05:18.773273Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T13:05:18.785151Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T13:05:18.775031Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/67c326ea-ca0f-4e32-bbf6-1d001e780733` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "20445cf3-64dd-4030-91e4-b07f274d678d:0",
      "order_id": "20445cf3-64dd-4030-91e4-b07f274d678d",
      "at": "2026-10-30T13:05:18.772026Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "20445cf3-64dd-4030-91e4-b07f274d678d:1",
      "order_id": "20445cf3-64dd-4030-91e4-b07f274d678d",
      "at": "2026-10-30T13:05:18.774251Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "20445cf3-64dd-4030-91e4-b07f274d678d:2",
      "order_id": "20445cf3-64dd-4030-91e4-b07f274d678d",
      "at": "2026-10-30T13:05:18.785151Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/1a06ce4d-6369-4ca3-b346-714eb3eb6394` → **200**

```json
{
  "found": []
}
```

Done: request 67c326ea-ca0f-4e32-bbf6-1d001e780733 — order 20445cf3-64dd-4030-91e4-b07f274d678d found by its id.

`GET /api/rider/v1/orders/20445cf3-64dd-4030-91e4-b07f274d678d` → **200**

```json
{
  "id": "20445cf3-64dd-4030-91e4-b07f274d678d",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8f6a47e7-e299-4f06-9909-3f0a963984c4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:18.771435Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/20445cf3-64dd-4030-91e4-b07f274d678d/cancel` → **200**

```json
{
  "command_id": "9eb47786-804e-4027-a440-095a392c47ee",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "20445cf3-64dd-4030-91e4-b07f274d678d",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8f6a47e7-e299-4f06-9909-3f0a963984c4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:05:18.771435Z",
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
  "phone": "+380634766118",
  "device_ref": "sandbox-8289"
}
```

```json
{
  "challenge_id": "c2b05229-3f32-4494-b713-be2b1a16f4e0",
  "expires_at": "2026-10-30T13:10:21.576390214Z",
  "resend_available_at": "2026-10-30T13:05:22.576390214Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634766118` → **200**

```json
{
  "phone": "+380634766118",
  "audience": "CLIENT",
  "code": "672732",
  "sent_at": "2026-10-30T13:05:21.578942316Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2b05229-3f32-4494-b713-be2b1a16f4e0",
  "code": "672732",
  "device_ref": "sandbox-8289"
}
```

```json
{
  "session_id": "abf3fa26-ffda-4af5-bbaa-f08420d6adb2",
  "subject": {
    "type": "CLIENT",
    "id": "0a171fdc-4fc9-49f9-9158-90269836db59"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYTE3MWZkYy00ZmM5LTQ5ZjktOTE1OC05MDI2OTgzNmRiNTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NDIxLCJpYXQiOjE3OTMzNjU1MjEsImp0aSI6ImNjYjYzMGU2LTVkODktNGYyYi1iNWYzLTAyZjZjYzBjZWExZiIsInNpZCI6ImFiZjNmYTI2LWZmZGEtNGFmNS1iYmFhLWYwODQyMGQ2YWRiMiJ9.tI7AK7Yo-b_fXGaGGWbJCXQA6FHyuT7zG0TBkhIhx18",
  "access_expires_at": "2026-10-30T13:20:21.901535973Z",
  "refresh_token": "vAeCuX7vr1-gOoJPGyb3leRTTjQprG-pzzDzEMNKlZM",
  "refresh_expires_at": "2026-11-29T13:05:21.900857498Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "2e77d6c9-8ce8-4d21-88b4-6f29001143dd",
  "expires_at": "2026-10-30T13:10:24.191660005Z",
  "resend_available_at": "2026-10-30T13:05:25.191660005Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634766118` → **200**

```json
{
  "phone": "+380634766118",
  "audience": "CLIENT",
  "code": "915086",
  "sent_at": "2026-10-30T13:05:24.194682488Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "1408e296-2e06-43dc-bfad-22e7864be559",
  "challenge_id": "2e77d6c9-8ce8-4d21-88b4-6f29001143dd",
  "otp_code": "915086"
}
```

```json
{
  "id": "33077664-1419-4598-bcec-a3edafffcaff",
  "state": "PENDING",
  "created_at": "2026-10-30T13:05:24.521608Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/33077664-1419-4598-bcec-a3edafffcaff` → **200**

```json
{
  "id": "33077664-1419-4598-bcec-a3edafffcaff",
  "state": "PENDING",
  "created_at": "2026-10-30T13:05:24.521608Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/33077664-1419-4598-bcec-a3edafffcaff` → **200**

```json
{
  "id": "33077664-1419-4598-bcec-a3edafffcaff",
  "state": "PENDING",
  "created_at": "2026-10-30T13:05:24.521608Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/33077664-1419-4598-bcec-a3edafffcaff` → **200**

```json
{
  "id": "33077664-1419-4598-bcec-a3edafffcaff",
  "state": "PENDING",
  "created_at": "2026-10-30T13:05:24.521608Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/33077664-1419-4598-bcec-a3edafffcaff` → **200**

```json
{
  "id": "33077664-1419-4598-bcec-a3edafffcaff",
  "state": "PENDING",
  "created_at": "2026-10-30T13:05:24.521608Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/33077664-1419-4598-bcec-a3edafffcaff` → **200**

```json
{
  "id": "33077664-1419-4598-bcec-a3edafffcaff",
  "state": "READY",
  "created_at": "2026-10-30T13:05:24.521608Z",
  "ready_at": "2026-10-30T13:05:29.240994Z",
  "expires_at": "2026-11-06T13:05:29.240994Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/33077664-1419-4598-bcec-a3edafffcaff/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634019860",
  "device_ref": "sandbox-31540"
}
```

```json
{
  "challenge_id": "c732fa2a-7a25-44c3-81e3-1c0d1a612b8d",
  "expires_at": "2026-10-30T13:10:30.322124982Z",
  "resend_available_at": "2026-10-30T13:05:31.322124982Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634019860` → **200**

```json
{
  "phone": "+380634019860",
  "audience": "CLIENT",
  "code": "810453",
  "sent_at": "2026-10-30T13:05:30.32493767Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c732fa2a-7a25-44c3-81e3-1c0d1a612b8d",
  "code": "810453",
  "device_ref": "sandbox-31540"
}
```

```json
{
  "session_id": "be0c25dc-2de5-42d7-b6f7-65e36bb9a16d",
  "subject": {
    "type": "CLIENT",
    "id": "4ad77e6c-638c-491c-8ac9-1ee8080bd291"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YWQ3N2U2Yy02MzhjLTQ5MWMtOGFjOS0xZWU4MDgwYmQyOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NDMwLCJpYXQiOjE3OTMzNjU1MzAsImp0aSI6ImE1NTRkNzQ0LWE0Y2QtNGIyZi04OTg5LTExOGJlMjQxYzg0MiIsInNpZCI6ImJlMGMyNWRjLTJkZTUtNDJkNy1iNmY3LTY1ZTM2YmI5YTE2ZCJ9.sHvenvEs6C7Nu08f1GvYmZxro-hs-_6m84hc88TDnVA",
  "access_expires_at": "2026-10-30T13:20:30.646035242Z",
  "refresh_token": "9pA4ELhXrwIU8ur9khIW0IcPm6W-fW_OU-NXyzFyasU",
  "refresh_expires_at": "2026-11-29T13:05:30.645520404Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/33077664-1419-4598-bcec-a3edafffcaff/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/33077664-1419-4598-bcec-a3edafffcaff/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "be106afa-87e2-4b4d-badf-24e2ac0ab8dc"
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
  "session_id": "e7f6551a-bf61-4506-bc56-9095494bee31",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY0MzEsImlhdCI6MTc5MzM2NTUzMSwianRpIjoiNzZlZTY1M2UtZjAzOC00YjMxLTlhYzItOTg2MzU0ODQxNmIwIiwic2lkIjoiZTdmNjU1MWEtYmY2MS00NTA2LWJjNTYtOTA5NTQ5NGJlZTMxIn0.xOKRNVAtCbDKFPJkwHD0qhyBirzHQw-JSo0wLiRuEhk",
  "access_expires_at": "2026-10-30T13:20:31.55607553Z",
  "refresh_token": "lcyacnsKPVRMY8jpOL7IJ1zYU71CHip__weV0MAvFek",
  "refresh_expires_at": "2026-10-31T01:05:31.555532143Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0a171fdc-4fc9-49f9-9158-90269836db59",
  "session_id": "abf3fa26-ffda-4af5-bbaa-f08420d6adb2",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/0a171fdc-4fc9-49f9-9158-90269836db59/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "33077664-1419-4598-bcec-a3edafffcaff",
      "state": "READY",
      "created_at": "2026-10-30T13:05:24.521608Z",
      "ready_at": "2026-10-30T13:05:29.240994Z",
      "expires_at": "2026-11-06T13:05:29.240994Z",
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
  "device_ref": "sandbox-7151"
}
```

```json
{
  "challenge_id": "cc1ff4e8-d36d-4947-bbdd-7ee8d1bdf47a",
  "expires_at": "2026-10-30T13:10:32.448325116Z",
  "resend_available_at": "2026-10-30T13:05:33.448325116Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "958295",
  "sent_at": "2026-10-30T13:05:32.450947999Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cc1ff4e8-d36d-4947-bbdd-7ee8d1bdf47a",
  "code": "958295",
  "device_ref": "sandbox-7151"
}
```

```json
{
  "session_id": "feed66e4-9e5e-4683-9517-52bfccc47055",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjQzMiwiaWF0IjoxNzkzMzY1NTMyLCJqdGkiOiIzMDJmM2Q3Ny0wMjkxLTQ2OTctYTBjOS05NTZhOTRiNjg0MTYiLCJzaWQiOiJmZWVkNjZlNC05ZTVlLTQ2ODMtOTUxNy01MmJmY2NjNDcwNTUifQ.cuODH0_a0RVEC1nsmEMCAtAUlyejNjmlShvXdztEb1c",
  "access_expires_at": "2026-10-30T13:20:32.772030079Z",
  "refresh_token": "4vnTqSi9vxBa_zCRv3StWEit_o9T7Bknq7_qlZzUwZU",
  "refresh_expires_at": "2026-11-29T13:05:32.77135759Z",
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
  "device_ref": "sandbox-11208"
}
```

```json
{
  "challenge_id": "04a69b11-6fcc-428b-862a-2e37f1ccc127",
  "expires_at": "2026-10-30T13:10:33.35473012Z",
  "resend_available_at": "2026-10-30T13:05:34.35473012Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "197619",
  "sent_at": "2026-10-30T13:05:33.357559272Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "04a69b11-6fcc-428b-862a-2e37f1ccc127",
  "code": "197619",
  "device_ref": "sandbox-11208"
}
```

```json
{
  "session_id": "ce423ed7-1e4d-4b23-a514-857bf0aaae61",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjQzMywiaWF0IjoxNzkzMzY1NTMzLCJqdGkiOiI4MzllMDUxNS05YmJkLTQyMDAtOWIxYy01M2NkMzc2ZDY4ZDIiLCJzaWQiOiJjZTQyM2VkNy0xZTRkLTRiMjMtYTUxNC04NTdiZjBhYWFlNjEifQ.-e8WIjuQplkRcGdlos7ELqdGS4wzjJ8C_PPqgmeXiwE",
  "access_expires_at": "2026-10-30T13:20:33.676657121Z",
  "refresh_token": "Ln7QdtEGffh8csXkT9e3yswa2TaHVnDXKHA9thozte4",
  "refresh_expires_at": "2026-11-29T13:05:33.676041538Z",
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
  "command_id": "f3846e4b-af59-40e6-b5b3-6b36baf670f1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:05:34Z",
    "sequence": 1793365534285
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7481c844-c684-4749-9d98-50ceed194fdf",
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
  "last_heartbeat_at": "2026-10-30T13:05:34.305059Z",
  "last_location_at": "2026-10-30T13:05:34.305059Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-16231"
}
```

```json
{
  "challenge_id": "722e8345-09b6-4fb2-968c-6da82dc5a67c",
  "expires_at": "2026-10-30T13:10:34.602183416Z",
  "resend_available_at": "2026-10-30T13:05:35.602183416Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "473110",
  "sent_at": "2026-10-30T13:05:34.604653598Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "722e8345-09b6-4fb2-968c-6da82dc5a67c",
  "code": "473110",
  "device_ref": "sandbox-16231"
}
```

```json
{
  "session_id": "768837bb-b8d6-4e22-8d2b-86da13b05453",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjQzNCwiaWF0IjoxNzkzMzY1NTM0LCJqdGkiOiI2YmUyMzMwNi1iMjhjLTRlOGYtYWM0NC1kY2EzM2YzODUyNzkiLCJzaWQiOiI3Njg4MzdiYi1iOGQ2LTRlMjItOGQyYi04NmRhMTNiMDU0NTMifQ.5z9Ya7h1QrzCdrUoDtjLZV1pq2YxR0suP5uU9y6fWxs",
  "access_expires_at": "2026-10-30T13:20:34.928658345Z",
  "refresh_token": "ypIBwULdxlzG_cBSBtaDn0bi8dMD0375wqFRUYDX_g0",
  "refresh_expires_at": "2026-11-29T13:05:34.928110251Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f6d2f4ba-963c-4033-a59d-f98f759bfc55",
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
  "last_heartbeat_at": "2026-10-30T13:01:34.383439Z",
  "last_location_at": "2026-10-30T13:01:34.383439Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f6d2f4ba-963c-4033-a59d-f98f759bfc55/handover` → **200**

```json
{
  "command_id": "1b02f2bc-19ac-42fb-b489-c16463060fdc",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f6d2f4ba-963c-4033-a59d-f98f759bfc55",
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
  "last_heartbeat_at": "2026-10-30T13:01:34.383439Z",
  "last_location_at": "2026-10-30T13:01:34.383439Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f6d2f4ba-963c-4033-a59d-f98f759bfc55/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:05:35Z",
    "sequence": 1793365535827
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f6d2f4ba-963c-4033-a59d-f98f759bfc55",
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
  "last_heartbeat_at": "2026-10-30T13:05:35.847621Z",
  "last_location_at": "2026-10-30T13:05:35.847621Z",
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
  "session_id": "f37adb1e-904d-4860-98c3-1c3c26a7594a",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY0MzYsImlhdCI6MTc5MzM2NTUzNiwianRpIjoiYjhlOWNhMzItN2NlMS00NTMyLWJmNjItYWE2NDMxYmRlNzdhIiwic2lkIjoiZjM3YWRiMWUtOTA0ZC00ODYwLTk4YzMtMWMzYzI2YTc1OTRhIn0.TDJDOxvDW9GeeaRtm5HaDBjrQU_kAzYnIANcipY2vmA",
  "access_expires_at": "2026-10-30T13:20:36.471232892Z",
  "refresh_token": "ghXARff3mF5wH_298EBITYpWDFYCEkj0Jj0DOfZGYgk",
  "refresh_expires_at": "2026-10-31T01:05:36.470688713Z",
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
  "session_id": "f8720bb7-cf79-48ba-995a-9401a0bf7b72",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY0MzcsImlhdCI6MTc5MzM2NTUzNywianRpIjoiNmRmZjMyZTAtOTllMS00N2IwLWE5ZWMtNDUyMDZhNmQ2ZDJjIiwic2lkIjoiZjg3MjBiYjctY2Y3OS00OGJhLTk5NWEtOTQwMWEwYmY3YjcyIn0.pGOUuBPFYrVIN2CWTLwTPDwL5Sv_8T7f6b7T9BnGVH0",
  "access_expires_at": "2026-10-30T13:20:37.093968495Z",
  "refresh_token": "ncRJk7WRiXF68m2zcTiH8nJtmxuE1u3DMNmnwpYigzU",
  "refresh_expires_at": "2026-10-31T01:05:37.093417737Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380683819089",
  "device_ref": "sandbox-10761"
}
```

```json
{
  "challenge_id": "1b0a8da5-30c3-4023-a048-883f71931ffb",
  "expires_at": "2026-10-30T13:10:37.382603786Z",
  "resend_available_at": "2026-10-30T13:05:38.382603786Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380683819089` → **200**

```json
{
  "phone": "+380683819089",
  "audience": "CLIENT",
  "code": "012207",
  "sent_at": "2026-10-30T13:05:37.385100389Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1b0a8da5-30c3-4023-a048-883f71931ffb",
  "code": "012207",
  "device_ref": "sandbox-10761"
}
```

```json
{
  "session_id": "057ee0f3-1fad-4fc0-98e2-65bbccd618b1",
  "subject": {
    "type": "CLIENT",
    "id": "aa400646-21a3-4eaa-ba47-6a183d029931"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYTQwMDY0Ni0yMWEzLTRlYWEtYmE0Ny02YTE4M2QwMjk5MzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NDM3LCJpYXQiOjE3OTMzNjU1MzcsImp0aSI6ImU5ZDA3MmFmLTQ3YzctNDZiZS1hZGY2LTlkMjY2N2M2MzdiYSIsInNpZCI6IjA1N2VlMGYzLTFmYWQtNGZjMC05OGUyLTY1YmJjY2Q2MThiMSJ9.3xCKyt4ZCL3ET6H7jghnbbv-Bb7oqdoNdI7h4cQcv64",
  "access_expires_at": "2026-10-30T13:20:37.702686099Z",
  "refresh_token": "kNtvrN4GY3-8uymJNarGSYfGXmvjnDprP_Eml7pYJNI",
  "refresh_expires_at": "2026-11-29T13:05:37.702202099Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a59010f0-9000-4717-acd2-78e28bfbf83f",
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
  "id": "20664147-e49d-4b0f-9e7a-060c5bdd6c5e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:10:38.002312Z",
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
  "command_id": "a4f36734-2c2f-4cb8-bdf8-0bc06102449c",
  "quote_id": "20664147-e49d-4b0f-9e7a-060c5bdd6c5e",
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
  "id": "7dc6440e-b72d-4d22-98f3-4cfd88b119dc",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aa400646-21a3-4eaa-ba47-6a183d029931",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:05:38.308823Z",
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
    "id": "559b59e9-53c2-4201-bd2f-e9c6ef63e2f8",
    "order_id": "7dc6440e-b72d-4d22-98f3-4cfd88b119dc",
    "expires_at": "2026-10-30T13:05:53.312304Z",
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

`POST /api/driver/v1/offers/559b59e9-53c2-4201-bd2f-e9c6ef63e2f8/reject` → **204**

```json
{
  "command_id": "58af2304-9c83-4014-ac9b-9e86fa354541"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "0e5e9c13-230b-430f-9126-eeb65a61faa3",
    "order_id": "7dc6440e-b72d-4d22-98f3-4cfd88b119dc",
    "expires_at": "2026-10-30T13:05:53.943367Z",
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

`POST /api/driver/v1/offers/0e5e9c13-230b-430f-9126-eeb65a61faa3/accept` → **200**

```json
{
  "command_id": "d0feefe1-3bf4-41db-afb8-a6c126883261"
}
```

```json
{
  "id": "4c93aed1-266c-4b01-b224-09603fc24a72",
  "order_id": "7dc6440e-b72d-4d22-98f3-4cfd88b119dc",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b5760ed1-5114-4b7a-b69f-8ba240fe4355",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/7dc6440e-b72d-4d22-98f3-4cfd88b119dc/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:05:38.309395Z",
      "actor": {
        "type": "CLIENT",
        "id": "aa400646-21a3-4eaa-ba47-6a183d029931",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "7dc6440e-b72d-4d22-98f3-4cfd88b119dc",
        "quote_id": "20664147-e49d-4b0f-9e7a-060c5bdd6c5e",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "ddf331d1-8df5-4fbc-9424-65530952bfc7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:05:38.311502Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7dc6440e-b72d-4d22-98f3-4cfd88b119dc",
        "attempt_id": "5223f36f-917c-4066-a8ab-19498b989adf",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ddf331d1-8df5-4fbc-9424-65530952bfc7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:05:38.318698Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "559b59e9-53c2-4201-bd2f-e9c6ef63e2f8",
        "order_id": "7dc6440e-b72d-4d22-98f3-4cfd88b119dc",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "ddf331d1-8df5-4fbc-9424-65530952bfc7"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T13:05:38.942167Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "559b59e9-53c2-4201-bd2f-e9c6ef63e2f8",
        "order_id": "7dc6440e-b72d-4d22-98f3-4cfd88b119dc"
      },
      "correlation_id": "ee9c9006-d447-4791-81c5-8ced9bb3d4e4"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 7dc6440e-b72d-4d22-98f3-4cfd88b119dc — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/7dc6440e-b72d-4d22-98f3-4cfd88b119dc` → **200**

```json
{
  "id": "7dc6440e-b72d-4d22-98f3-4cfd88b119dc",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "aa400646-21a3-4eaa-ba47-6a183d029931",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "4c93aed1-266c-4b01-b224-09603fc24a72",
    "order_id": "7dc6440e-b72d-4d22-98f3-4cfd88b119dc",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b5760ed1-5114-4b7a-b69f-8ba240fe4355",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T13:05:38.308823Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7dc6440e-b72d-4d22-98f3-4cfd88b119dc/cancel` → **200**

```json
{
  "command_id": "99cdc8ce-6834-4437-b7d7-c6be902d8c77",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "7dc6440e-b72d-4d22-98f3-4cfd88b119dc",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "aa400646-21a3-4eaa-ba47-6a183d029931",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "4c93aed1-266c-4b01-b224-09603fc24a72",
    "order_id": "7dc6440e-b72d-4d22-98f3-4cfd88b119dc",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "b5760ed1-5114-4b7a-b69f-8ba240fe4355",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:05:38.308823Z",
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
  "session_id": "7481c844-c684-4749-9d98-50ceed194fdf",
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
  "last_heartbeat_at": "2026-10-30T13:05:34.305059Z",
  "last_location_at": "2026-10-30T13:05:34.305059Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7481c844-c684-4749-9d98-50ceed194fdf/close` → **200**

```json
{
  "command_id": "8ad1af20-0961-4ab2-b0b9-520e2382f132",
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
  "session_id": "f6d2f4ba-963c-4033-a59d-f98f759bfc55",
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
  "last_heartbeat_at": "2026-10-30T13:05:35.847621Z",
  "last_location_at": "2026-10-30T13:05:35.847621Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f6d2f4ba-963c-4033-a59d-f98f759bfc55/close` → **200**

```json
{
  "command_id": "c3859968-3429-423f-848a-f37de7920e21",
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
  "device_ref": "sandbox-30846"
}
```

```json
{
  "challenge_id": "390d7103-c1cb-4393-9a9f-32a2072dcbca",
  "expires_at": "2026-10-30T13:10:41.788024967Z",
  "resend_available_at": "2026-10-30T13:05:42.788024967Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "931777",
  "sent_at": "2026-10-30T13:05:41.790367563Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "390d7103-c1cb-4393-9a9f-32a2072dcbca",
  "code": "931777",
  "device_ref": "sandbox-30846"
}
```

```json
{
  "session_id": "ffc2a07d-80b2-405c-b0ed-d2675db6b67c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjQ0MiwiaWF0IjoxNzkzMzY1NTQyLCJqdGkiOiJhZTQ0MWM0My0zOGI3LTRjY2EtOTk5Yi05MjJlNTQyOWU5OTQiLCJzaWQiOiJmZmMyYTA3ZC04MGIyLTQwNWMtYjBlZC1kMjY3NWRiNmI2N2MifQ.X7AUgPkwZycQMqL5VkLcSH-e8yHBN0lNvFxpaqNrFyw",
  "access_expires_at": "2026-10-30T13:20:42.108523298Z",
  "refresh_token": "P0TtPJEo-bisKV8oNltfFFIIRR4s3uWRyFgRcqLK3WA",
  "refresh_expires_at": "2026-11-29T13:05:42.108028733Z",
  "account_created": false
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "93ed9b67-8b74-4cdd-8b28-72dd39c5ff27",
  "content_type": "application/pdf",
  "size_bytes": 87
}
```

```json
{
  "file_id": "82406d4a-dc99-4e7b-a75c-213f1e3d42fd",
  "upload_path": "/api/driver/v1/uploads/82406d4a-dc99-4e7b-a75c-213f1e3d42fd",
  "expires_at": "2026-10-30T13:20:42.406071821Z",
  "max_bytes": 87
}
```

`PUT /api/driver/v1/uploads/82406d4a-dc99-4e7b-a75c-213f1e3d42fd` → **200**

```json
{
  "file_id": "82406d4a-dc99-4e7b-a75c-213f1e3d42fd",
  "state": "SAFE",
  "content_type": "application/pdf",
  "size_bytes": 87,
  "reject_reason": null
}
```

## On the server's disk the file is not the PDF

Stored at `driver_document/2026-10/82406d4a-dc99-4e7b-a75c-213f1e3d42fd`, first bytes `425a46310a8bc21c` (plain: `255044462d312e37` = %PDF-1.7).

## His download is exactly what he uploaded

`GET /api/driver/v1/files/82406d4a-dc99-4e7b-a75c-213f1e3d42fd` → **200**

SHA-256 uploaded `3b57fd76011b963392f979f492d45014cfd14f587cf8f57c5bf9f240f30cf5a2`, downloaded `3b57fd76011b963392f979f492d45014cfd14f587cf8f57c5bf9f240f30cf5a2`.

Done: document 82406d4a-dc99-4e7b-a75c-213f1e3d42fd is encrypted on disk and downloads unchanged.

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
  "session_id": "8677e60f-888f-410e-bcef-01b053f58854",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY0NDMsImlhdCI6MTc5MzM2NTU0MywianRpIjoiYmVhNDBiYjEtODA3Mi00MGI4LTk4NTAtYzVmZTM0MTcyZmZmIiwic2lkIjoiODY3N2U2MGYtODg4Zi00MTBlLWJjZWYtMDFiMDUzZjU4ODU0In0.-nPcY2PfImpVK-YtLAhg8J9WpcECT683aq5TVFRmItA",
  "access_expires_at": "2026-10-30T13:20:43.134773941Z",
  "refresh_token": "akRlhP6EzCNBRuPckQmHs1faci1rO3FmPnBwlOnrLNc",
  "refresh_expires_at": "2026-10-31T01:05:43.134261199Z",
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
  "command_id": "d4d93522-a39b-4527-a0a4-5b5796cd9259",
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
  "changed_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T13:05:43.739389Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "61579d6d-d55a-4346-bfba-1aa254971b4f",
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
  "correlation_id": "e2511b4f-7087-4d3b-8a0f-a29f372e4ecf"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "82082c5a-c8cc-4f89-98c0-04840532c27b",
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
  "correlation_id": "b853f8bf-7763-4fe4-8bc0-189fa3dfbb95"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634626288",
  "device_ref": "sandbox-27777"
}
```

```json
{
  "challenge_id": "d94411f2-160d-4363-ae05-af81b98c47d3",
  "expires_at": "2026-10-30T13:10:44.701703913Z",
  "resend_available_at": "2026-10-30T13:05:45.701703913Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634626288` → **200**

```json
{
  "phone": "+380634626288",
  "audience": "CLIENT",
  "code": "609246",
  "sent_at": "2026-10-30T13:05:44.705794387Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d94411f2-160d-4363-ae05-af81b98c47d3",
  "code": "609246",
  "device_ref": "sandbox-27777"
}
```

```json
{
  "session_id": "3a926dbe-7d0a-41b1-9e24-bf8e2a374e44",
  "subject": {
    "type": "CLIENT",
    "id": "1c4af23c-49e0-4a54-ba7f-40e6169343bd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzRhZjIzYy00OWUwLTRhNTQtYmE3Zi00MGU2MTY5MzQzYmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NDQ1LCJpYXQiOjE3OTMzNjU1NDUsImp0aSI6IjI1MzA5ZTZlLTdkNjUtNGI5Yi05ZmFhLWU4N2YyNDk0OGI2MyIsInNpZCI6IjNhOTI2ZGJlLTdkMGEtNDFiMS05ZTI0LWJmOGUyYTM3NGU0NCJ9.-RXd8SBaNODwcMqE2UDJvMLgVJa0N3PhLJ8zZXA1JdM",
  "access_expires_at": "2026-10-30T13:20:45.043180297Z",
  "refresh_token": "wt3uGIkGqCj0Epykn8JST4KgOqOpiv3hN4numczTSQQ",
  "refresh_expires_at": "2026-11-29T13:05:45.042519257Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f6a0d76f-38df-4612-947d-ce30b271988e",
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
  "id": "2d6fc49c-9581-4594-9801-c5e28fe551be",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:10:45.353177Z",
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
  "command_id": "88ac2d46-c193-4a0c-b2d6-8ba75627c35a",
  "quote_id": "2d6fc49c-9581-4594-9801-c5e28fe551be",
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
  "correlation_id": "9a0fe6ae-aab1-4abc-8edd-2e0c74716f76"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "e05d2091-b1ef-4522-a32c-d800c0a0396b",
  "quote_id": "2d6fc49c-9581-4594-9801-c5e28fe551be",
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
  "id": "f31689eb-9bfe-471b-a612-20217b9e4663",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1c4af23c-49e0-4a54-ba7f-40e6169343bd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:45.990352Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f31689eb-9bfe-471b-a612-20217b9e4663/cancel` → **200**

```json
{
  "command_id": "ff278e5f-9d13-42c5-aed7-b501d1f30c2a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f31689eb-9bfe-471b-a612-20217b9e4663",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1c4af23c-49e0-4a54-ba7f-40e6169343bd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:05:45.990352Z",
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
  "command_id": "d8dc7182-6943-4370-9281-f117e5ec9f78",
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
  "changed_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T13:05:46.693636Z"
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
      "changed_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T13:05:46.693636Z"
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
  "device_ref": "sandbox-14069"
}
```

```json
{
  "challenge_id": "59977d0e-95f4-4abd-aea7-4af627a61cb1",
  "expires_at": "2026-10-30T13:10:47.602010668Z",
  "resend_available_at": "2026-10-30T13:05:48.602010668Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "421931",
  "sent_at": "2026-10-30T13:05:47.60515887Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "59977d0e-95f4-4abd-aea7-4af627a61cb1",
  "code": "421931",
  "device_ref": "sandbox-14069"
}
```

```json
{
  "session_id": "858891ab-c743-4b0a-a2d5-628982104120",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjQ0NywiaWF0IjoxNzkzMzY1NTQ3LCJqdGkiOiIzOTg5YWQyYi1jZjQ1LTQzMjItYjEyZS1lM2MzNDgzMzkyNTYiLCJzaWQiOiI4NTg4OTFhYi1jNzQzLTRiMGEtYTJkNS02Mjg5ODIxMDQxMjAifQ.kYBE1WrOUtjcbQkDmqPJKVbHDDH-3FqDFteoyRraFEI",
  "access_expires_at": "2026-10-30T13:20:47.930854541Z",
  "refresh_token": "3pWwda1ZSeebjDQW5WfiZ4xLm2RN5-k5Gx8TCyK_0ls",
  "refresh_expires_at": "2026-11-29T13:05:47.930317539Z",
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
  "command_id": "aab3d721-e4d1-4b89-a5aa-ed8df868174f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:05:48Z",
    "sequence": 1793365548531
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3b97d550-d2e5-4be8-946b-37386ad8f8a0",
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
  "last_heartbeat_at": "2026-10-30T13:05:48.551317Z",
  "last_location_at": "2026-10-30T13:05:48.551317Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674700815",
  "device_ref": "sandbox-16040"
}
```

```json
{
  "challenge_id": "7e41e8cf-ed87-4b07-8671-ccb4aefb7c0f",
  "expires_at": "2026-10-30T13:10:48.846046364Z",
  "resend_available_at": "2026-10-30T13:05:49.846046364Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674700815` → **200**

```json
{
  "phone": "+380674700815",
  "audience": "CLIENT",
  "code": "053411",
  "sent_at": "2026-10-30T13:05:48.849284813Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e41e8cf-ed87-4b07-8671-ccb4aefb7c0f",
  "code": "053411",
  "device_ref": "sandbox-16040"
}
```

```json
{
  "session_id": "81c623d6-f1d4-4029-a596-4ac56a8ece98",
  "subject": {
    "type": "CLIENT",
    "id": "824f268e-a074-4d7c-8af6-ab7d4daea210"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MjRmMjY4ZS1hMDc0LTRkN2MtOGFmNi1hYjdkNGRhZWEyMTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NDQ5LCJpYXQiOjE3OTMzNjU1NDksImp0aSI6ImNjMzkwYzY1LWFkODQtNDZmNi04ZGQxLTEzMTk4MTcwZWNiZCIsInNpZCI6IjgxYzYyM2Q2LWYxZDQtNDAyOS1hNTk2LTRhYzU2YThlY2U5OCJ9.8sLOMANpFlDmYf4h11nSXaxrlgidizT4z3v7T7VC-EE",
  "access_expires_at": "2026-10-30T13:20:49.189805034Z",
  "refresh_token": "lfFT7Gtk9yGHf_c7W3tQPAYTSWeSG1lJcFm8WWPAneQ",
  "refresh_expires_at": "2026-11-29T13:05:49.189270814Z",
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
  "command_id": "e93a0fb5-5dc3-435a-b3b3-965cae2cc3f9",
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
  "id": "e97362c0-e492-40fd-960c-9fbacf8f3981",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:10:49.790903Z",
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
  "command_id": "7270c0a9-c006-4a50-8902-499dc1c92d6c",
  "platform": "ANDROID",
  "token": "sandbox-driver-63e837d5-f5ce-423a-863f-28e65f4e10c6"
}
```

```json
{
  "id": "b73aa962-7d08-4668-87ea-c8987e6f8d32",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T13:05:50.112109Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "d7ba785d-674e-416a-b932-0b3a3d2500cd",
  "platform": "ANDROID",
  "token": "sandbox-rider-e022b368-ee45-43fb-858f-4a65fce83764"
}
```

```json
{
  "id": "37f459f6-a3d5-420b-8887-2a0488b31199",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T13:05:50.398116Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "60fc3b7b-9764-4ceb-9cd4-55d695f233a4",
  "quote_id": "e97362c0-e492-40fd-960c-9fbacf8f3981",
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
  "id": "b40bf853-1076-409c-b67a-131836a34182",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "824f268e-a074-4d7c-8af6-ab7d4daea210",
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
  "created_at": "2026-10-30T13:05:50.706624Z",
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
    "id": "9d29d2e7-13c3-4ed5-9e51-f4378f14ad42",
    "order_id": "b40bf853-1076-409c-b67a-131836a34182",
    "expires_at": "2026-10-30T13:06:05.710085Z",
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

`POST /api/driver/v1/offers/9d29d2e7-13c3-4ed5-9e51-f4378f14ad42/accept` → **200**

```json
{
  "command_id": "b11c0c32-fd29-4446-ab74-539ba3ce909a"
}
```

```json
{
  "id": "c1d23a1c-939d-455d-95f7-a34e452fc076",
  "order_id": "b40bf853-1076-409c-b67a-131836a34182",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2721ddce-9608-4e02-91b5-68347c17657e",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T13:05:50.679Z` → **200**

```json
[
  {
    "at": "2026-10-30T13:05:51.29782724Z",
    "token_suffix": "4e10c6",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_version": "2",
      "order_id": "b40bf853-1076-409c-b67a-131836a34182",
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "a956f9ed-958f-4c1f-8ab4-0ada045aba4d"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674700815&after=2026-10-30T13:05:50.679Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380674700815&after=2026-10-30T13:05:50.679Z` → **200**

```json
[
  {
    "at": "2026-10-30T13:05:52.303898658Z",
    "token_suffix": "e83764",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_version": "3",
      "order_id": "b40bf853-1076-409c-b67a-131836a34182",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "1e9980ec-7989-4e01-97d4-cc5c9bb56812"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/b40bf853-1076-409c-b67a-131836a34182/messages` → **201**

```json
{
  "command_id": "e4aa93f5-8b8c-4bd1-9439-df935bf1a5e9",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "6bec0a6d-e769-4173-8a57-325ae389c22b",
  "order_id": "b40bf853-1076-409c-b67a-131836a34182",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T13:05:52.74291827Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2721ddce-9608-4e02-91b5-68347c17657e",
  "order_id": "b40bf853-1076-409c-b67a-131836a34182",
  "assignment_id": "c1d23a1c-939d-455d-95f7-a34e452fc076",
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

`POST /api/driver/v1/trips/2721ddce-9608-4e02-91b5-68347c17657e/messages` → **201**

```json
{
  "command_id": "8339b41a-5c61-41de-948c-703234064d2f",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "750f50d0-2e96-48af-a756-1ea69acf7c63",
  "order_id": "b40bf853-1076-409c-b67a-131836a34182",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T13:05:53.329088208Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/b40bf853-1076-409c-b67a-131836a34182/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/2721ddce-9608-4e02-91b5-68347c17657e/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674700815"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/3b97d550-d2e5-4be8-946b-37386ad8f8a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:05:54Z",
    "sequence": 1793365554233
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3b97d550-d2e5-4be8-946b-37386ad8f8a0",
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
  "last_heartbeat_at": "2026-10-30T13:05:54.253976Z",
  "last_location_at": "2026-10-30T13:05:54.253976Z",
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
  "id": "2721ddce-9608-4e02-91b5-68347c17657e",
  "order_id": "b40bf853-1076-409c-b67a-131836a34182",
  "assignment_id": "c1d23a1c-939d-455d-95f7-a34e452fc076",
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

`POST /api/driver/v1/trips/2721ddce-9608-4e02-91b5-68347c17657e/arrive` → **200**

```json
{
  "command_id": "b4a8e26a-71a6-447a-a8b7-35df96f60605",
  "expected_version": 0
}
```

```json
{
  "id": "2721ddce-9608-4e02-91b5-68347c17657e",
  "order_id": "b40bf853-1076-409c-b67a-131836a34182",
  "assignment_id": "c1d23a1c-939d-455d-95f7-a34e452fc076",
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
  "arrived_at": "2026-10-30T13:05:54.835498Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2721ddce-9608-4e02-91b5-68347c17657e/start` → **200**

```json
{
  "command_id": "bb95932c-8a94-42e0-8e6b-dde544b8c55b",
  "expected_version": 1
}
```

```json
{
  "id": "2721ddce-9608-4e02-91b5-68347c17657e",
  "order_id": "b40bf853-1076-409c-b67a-131836a34182",
  "assignment_id": "c1d23a1c-939d-455d-95f7-a34e452fc076",
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
  "arrived_at": "2026-10-30T13:05:54.835498Z",
  "started_at": "2026-10-30T13:05:55.149407Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/3b97d550-d2e5-4be8-946b-37386ad8f8a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:06:43Z",
    "sequence": 1793365603478
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3b97d550-d2e5-4be8-946b-37386ad8f8a0",
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
  "last_heartbeat_at": "2026-10-30T13:06:43.499383Z",
  "last_location_at": "2026-10-30T13:06:43.499383Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/2721ddce-9608-4e02-91b5-68347c17657e/complete` → **200**

```json
{
  "command_id": "c95a0418-d388-4e93-8014-22bd13771a3d",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:06:43Z",
  "cash_received": true
}
```

```json
{
  "id": "2721ddce-9608-4e02-91b5-68347c17657e",
  "order_id": "b40bf853-1076-409c-b67a-131836a34182",
  "assignment_id": "c1d23a1c-939d-455d-95f7-a34e452fc076",
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
  "arrived_at": "2026-10-30T13:05:54.835498Z",
  "started_at": "2026-10-30T13:05:55.149407Z",
  "completed_at": "2026-10-30T13:06:43.813299Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/b40bf853-1076-409c-b67a-131836a34182` → **200**

```json
{
  "id": "b40bf853-1076-409c-b67a-131836a34182",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "824f268e-a074-4d7c-8af6-ab7d4daea210",
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
    "id": "c1d23a1c-939d-455d-95f7-a34e452fc076",
    "order_id": "b40bf853-1076-409c-b67a-131836a34182",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2721ddce-9608-4e02-91b5-68347c17657e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:05:50.706624Z",
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
    "id": "b40bf853-1076-409c-b67a-131836a34182",
    "short_number": 14,
    "status": "FULFILLED",
    "created_at": "2026-10-30T13:05:50.706624Z",
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
    "id": "2721ddce-9608-4e02-91b5-68347c17657e",
    "order_id": "b40bf853-1076-409c-b67a-131836a34182",
    "order_short_number": 14,
    "created_at": "2026-10-30T13:05:51.342716Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "36859780-f490-46ff-ae53-c82bbdf03a9f",
    "order_id": "1100c40e-d31d-4ae3-92df-69403483330a",
    "order_short_number": 9,
    "created_at": "2026-10-30T13:02:57.030379Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "8ea82212-b399-4f5f-a841-f33557694336",
    "order_id": "ab66910a-78a6-4145-8073-c0d729ba252a",
    "order_short_number": 4,
    "created_at": "2026-10-30T13:01:24.581038Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "af1f04f0-73fe-4fa1-aa9a-c91d7a8349d7",
    "order_id": "a98bbd73-3a81-466c-88a7-ba331561dc0e",
    "order_short_number": 2,
    "created_at": "2026-10-30T12:57:35.86078Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "91e8269e-8ef1-42a7-ab9e-3dd300d8df77",
    "order_id": "c2635c6d-250e-4080-9c4d-5546a9d03eaa",
    "order_short_number": 1,
    "created_at": "2026-10-30T12:57:25.835367Z",
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

`GET /api/rider/v1/orders/b40bf853-1076-409c-b67a-131836a34182/tip` → **200**

```json
{
  "order_id": "b40bf853-1076-409c-b67a-131836a34182",
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
  "available_until": "2026-10-31T13:06:43.813299Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b40bf853-1076-409c-b67a-131836a34182/tip` → **201**

```json
{
  "command_id": "8d9270ac-3d6f-4088-876e-ef62ded7aba7",
  "amount_minor": 1100
}
```

```json
{
  "id": "a32b6642-5e87-493d-8b37-ef9fac326f13",
  "order_id": "b40bf853-1076-409c-b67a-131836a34182",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T13:06:48.963637Z"
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
  "session_id": "ed22a4e2-300a-413b-86a0-6e41390116ec",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY1MDksImlhdCI6MTc5MzM2NTYwOSwianRpIjoiZTQwZGQwMWUtNmNkNS00YThlLWIxNjUtNTdhYzk1OTkzNTBmIiwic2lkIjoiZWQyMmE0ZTItMzAwYS00MTNiLTg2YTAtNmU0MTM5MDExNmVjIn0.YqBug7cYSOLXFc-m9Wkc1gs_hG7ioyCaGJCWUOkN5f8",
  "access_expires_at": "2026-10-30T13:21:49.599413253Z",
  "refresh_token": "QvrAXQAoxMrVNuvXBGFEDQq0i81PLvHM6XlYtFPauhg",
  "refresh_expires_at": "2026-10-31T01:06:49.598511103Z",
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
  "generated_at": "2026-10-30T13:06:49.902930322Z"
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
  "generated_at": "2026-10-30T13:06:50.211235175Z"
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
  "session_id": "3ce94045-7e50-499a-80c9-5b940675720a",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY1MTAsImlhdCI6MTc5MzM2NTYxMCwianRpIjoiNzE1MWMxNmUtODY1Mi00MzEwLWIyNGQtYmNiMWVmMDY2ZTUwIiwic2lkIjoiM2NlOTQwNDUtN2U1MC00OTlhLTgwYzktNWI5NDA2NzU3MjBhIn0.h_djfLjfOvo0vK2MWb4D7FFDaM1NTTz2pat0UWWPz38",
  "access_expires_at": "2026-10-30T13:21:50.843020894Z",
  "refresh_token": "XzHTx-stkmwO4SvR7-YJ98Jkq8SAzgCaLyNl7rnKRv8",
  "refresh_expires_at": "2026-10-31T01:06:50.842407139Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b40bf853-1076-409c-b67a-131836a34182/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:05:50.707144Z",
      "actor": {
        "type": "CLIENT",
        "id": "824f268e-a074-4d7c-8af6-ab7d4daea210",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b40bf853-1076-409c-b67a-131836a34182",
        "quote_id": "e97362c0-e492-40fd-960c-9fbacf8f3981",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "2090f23e-c3fe-4ccc-b7f8-1f54dca11ad2"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:05:50.709228Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b40bf853-1076-409c-b67a-131836a34182",
        "attempt_id": "48321e43-e659-4fc3-b1c6-611a8ef66123",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "2090f23e-c3fe-4ccc-b7f8-1f54dca11ad2"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:05:50.71658Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9d29d2e7-13c3-4ed5-9e51-f4378f14ad42",
        "order_id": "b40bf853-1076-409c-b67a-131836a34182",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "2090f23e-c3fe-4ccc-b7f8-1f54dca11ad2"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:05:51.344713Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "9d29d2e7-13c3-4ed5-9e51-f4378f14ad42",
        "order_id": "b40bf853-1076-409c-b67a-131836a34182",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "c1d23a1c-939d-455d-95f7-a34e452fc076"
      },
      "correlation_id": "44d74865-1920-4ce4-ba24-a8c8b20e7157"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T13:06:51.436583671Z",
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
      "last_location_at": "2026-10-30T13:06:43.499383Z",
      "order_id": null
    }
  ]
}
```

Done: order b40bf853-1076-409c-b67a-131836a34182.

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
  "session_id": "5efef5cd-7e04-40f3-9f13-417e46e1c122",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY1MTIsImlhdCI6MTc5MzM2NTYxMiwianRpIjoiMjM2MmFmZjktZjUxZC00ZDZiLWIwNTktNDBmMjMwZjZjYmIwIiwic2lkIjoiNWVmZWY1Y2QtN2UwNC00MGYzLTlmMTMtNDE3ZTQ2ZTFjMTIyIn0.j5Fiwy4Y_KXK_HpuXcG2HwJ0a9BeE2PWtpxqideg-6g",
  "access_expires_at": "2026-10-30T13:21:52.0860018Z",
  "refresh_token": "87R737dBSSCZ_MNxULAyhRYEzGuSYO-V9MKMhp33jlE",
  "refresh_expires_at": "2026-10-31T01:06:52.085085002Z",
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
  "command_id": "63b45965-96d0-4a2d-a3f2-c80a4f3046d6",
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
  "timestamp": "2026-10-30T13:06:52.000+0000",
  "channel": {
    "id": "1730052000.984610309",
    "linkedid": "1730052000.984610309",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678997216"
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
  "timestamp": "2026-10-30T13:06:52.000+0000",
  "channel": {
    "id": "1730052000.984610309",
    "linkedid": "1730052000.984610309",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678997216"
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
  "session_id": "1d6bdd91-8c70-41c8-b876-554a9e3c2756",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY1MTMsImlhdCI6MTc5MzM2NTYxMywianRpIjoiNjUwM2Q3MjYtNmFlMy00YzUzLWEyNmEtZDdmOGJkOWIxZmExIiwic2lkIjoiMWQ2YmRkOTEtOGM3MC00MWM4LWI4NzYtNTU0YTllM2MyNzU2In0.vkArjPul37Zc0MN6DKqGFuTRI7Hsq35YOrtNVv453AY",
  "access_expires_at": "2026-10-30T13:21:53.338320281Z",
  "refresh_token": "X7R7RaWab3ee0Lx__oCS12QtCouVyTEUVDgWWXLHHgM",
  "refresh_expires_at": "2026-10-31T01:06:53.337729378Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "62009c4b-39d2-417f-81a8-7c68bbb25d06",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678997216",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:06:52Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/62009c4b-39d2-417f-81a8-7c68bbb25d06/answer` → **200**

```json
{
  "command_id": "6761f9da-5144-44f1-8356-cf2c3f809f75"
}
```

```json
{
  "id": "62009c4b-39d2-417f-81a8-7c68bbb25d06",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678997216",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "order_ids": [],
  "started_at": "2026-10-30T13:06:52Z",
  "answered_at": "2026-10-30T13:06:53.944732Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.984610309",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6e62bb2b-1265-45cc-8fdb-5009675aa340",
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
  "id": "58a9007a-5b50-4e9a-9a0c-acff26249d73",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:11:54.275968Z",
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
  "command_id": "a1fbd0bb-3e1a-431c-b7a9-27f1f4178b66",
  "quote_id": "58a9007a-5b50-4e9a-9a0c-acff26249d73",
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
    "phone": "+380678997216"
  },
  "call_id": "62009c4b-39d2-417f-81a8-7c68bbb25d06"
}
```

```json
{
  "id": "8a7f57ee-3318-48ba-a019-8560b948f549",
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
  "created_at": "2026-10-30T13:06:54.594375Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678997216"
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
    "id": "1730052000.984610309",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "62009c4b-39d2-417f-81a8-7c68bbb25d06",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678997216",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
      "order_ids": [
        "8a7f57ee-3318-48ba-a019-8560b948f549"
      ],
      "started_at": "2026-10-30T13:06:52Z",
      "answered_at": "2026-10-30T13:06:53.944732Z",
      "ended_at": "2026-10-30T13:06:54.933035Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "cdbb4ef4-3ce5-48ca-b518-d2fab314b522",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676615205",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
      "order_ids": [],
      "started_at": "2026-10-30T13:01:17.69362Z",
      "answered_at": "2026-10-30T13:01:18.026718Z",
      "ended_at": "2026-10-30T13:01:18.352298Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:01:19.198834Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/8a7f57ee-3318-48ba-a019-8560b948f549` → **200**

```json
{
  "id": "8a7f57ee-3318-48ba-a019-8560b948f549",
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
  "created_at": "2026-10-30T13:06:54.594375Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678997216"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/8a7f57ee-3318-48ba-a019-8560b948f549` → **200**

```json
{
  "id": "8a7f57ee-3318-48ba-a019-8560b948f549",
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
  "created_at": "2026-10-30T13:06:54.594375Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678997216"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8a7f57ee-3318-48ba-a019-8560b948f549/cancel` → **200**

```json
{
  "command_id": "bd00b7a1-1fa0-4828-bfd2-96ec94677f74",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "8a7f57ee-3318-48ba-a019-8560b948f549",
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
  "created_at": "2026-10-30T13:06:54.594375Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678997216"
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

Done: call 62009c4b-39d2-417f-81a8-7c68bbb25d06 with order 8a7f57ee-3318-48ba-a019-8560b948f549.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31721"
}
```

```json
{
  "challenge_id": "ecf5f802-916e-4e29-9534-2baf49a927a5",
  "expires_at": "2026-10-30T13:11:56.254039028Z",
  "resend_available_at": "2026-10-30T13:06:57.254039028Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "373850",
  "sent_at": "2026-10-30T13:06:56.257564792Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ecf5f802-916e-4e29-9534-2baf49a927a5",
  "code": "373850",
  "device_ref": "sandbox-31721"
}
```

```json
{
  "session_id": "b2346978-1b95-48a4-9604-b6c008a7e61b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjUxNiwiaWF0IjoxNzkzMzY1NjE2LCJqdGkiOiJhMTAxZGIzMy1kZGY5LTQ3ZWMtOGU0OC0yMTMxZmE2ZjkzNjEiLCJzaWQiOiJiMjM0Njk3OC0xYjk1LTQ4YTQtOTYwNC1iNmMwMDhhN2U2MWIifQ.vf33Z8SUfBj6W5WNstBVj9jcsKPMEI8o0NytRKCMTzI",
  "access_expires_at": "2026-10-30T13:21:56.588153471Z",
  "refresh_token": "F7ZF2Sx89qlv2uY1sp1G9JY_r_pj9mIdfSZT3zfZPfU",
  "refresh_expires_at": "2026-11-29T13:06:56.58750815Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3b97d550-d2e5-4be8-946b-37386ad8f8a0",
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
  "last_heartbeat_at": "2026-10-30T13:06:43.499383Z",
  "last_location_at": "2026-10-30T13:06:43.499383Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3b97d550-d2e5-4be8-946b-37386ad8f8a0/handover` → **200**

```json
{
  "command_id": "38d19fe9-dab1-41cf-93f0-4f85bd607843",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3b97d550-d2e5-4be8-946b-37386ad8f8a0",
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
  "last_heartbeat_at": "2026-10-30T13:06:43.499383Z",
  "last_location_at": "2026-10-30T13:06:43.499383Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 85 s to the next point)

`POST /api/driver/v1/work-sessions/3b97d550-d2e5-4be8-946b-37386ad8f8a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:08:22Z",
    "sequence": 1793365702507
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3b97d550-d2e5-4be8-946b-37386ad8f8a0",
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
  "last_heartbeat_at": "2026-10-30T13:08:22.528176Z",
  "last_location_at": "2026-10-30T13:08:22.528176Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665779030",
  "device_ref": "sandbox-10975"
}
```

```json
{
  "challenge_id": "ba779eb1-9721-4b30-b79d-244c1c68d1b3",
  "expires_at": "2026-10-30T13:13:22.826746092Z",
  "resend_available_at": "2026-10-30T13:08:23.826746092Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665779030` → **200**

```json
{
  "phone": "+380665779030",
  "audience": "CLIENT",
  "code": "170522",
  "sent_at": "2026-10-30T13:08:22.83056762Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ba779eb1-9721-4b30-b79d-244c1c68d1b3",
  "code": "170522",
  "device_ref": "sandbox-10975"
}
```

```json
{
  "session_id": "b440cf53-7375-484b-827b-9df2f6104bad",
  "subject": {
    "type": "CLIENT",
    "id": "1a27d436-b757-4b7a-b610-63cfc6a2c314"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYTI3ZDQzNi1iNzU3LTRiN2EtYjYxMC02M2NmYzZhMmMzMTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NjAzLCJpYXQiOjE3OTMzNjU3MDMsImp0aSI6IjQwMDk4MGZjLWUwNzQtNDNmNC1hNzdlLTg2OTI5OWM4OGY0OSIsInNpZCI6ImI0NDBjZjUzLTczNzUtNDg0Yi04MjdiLTlkZjJmNjEwNGJhZCJ9.hiBMsJd1JpnBG1unvuxRVgi_Ifu3uGZCbrGx7aSS-3I",
  "access_expires_at": "2026-10-30T13:23:23.151179724Z",
  "refresh_token": "o5f3Eb_QMbA-CTspTGNu7KDPkcSDu7PVwKcd8l5LvR4",
  "refresh_expires_at": "2026-11-29T13:08:23.150528627Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "55df7241-d08b-4de3-ba28-6381a096eca0",
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
  "id": "915e8434-1eb4-4484-b2e3-45f2e5d3299d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:13:23.449226Z",
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
  "command_id": "25c4508a-1217-4933-96fa-ff5152967597",
  "quote_id": "915e8434-1eb4-4484-b2e3-45f2e5d3299d",
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
  "id": "0a3ad1ab-f1f0-4f9c-8cd2-6f4b90546e6f",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1a27d436-b757-4b7a-b610-63cfc6a2c314",
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
  "created_at": "2026-10-30T13:08:23.754901Z",
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
    "id": "4b5989ab-5814-4388-b453-53fbaec7e5ec",
    "order_id": "0a3ad1ab-f1f0-4f9c-8cd2-6f4b90546e6f",
    "expires_at": "2026-10-30T13:08:38.758385Z",
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

`POST /api/driver/v1/offers/4b5989ab-5814-4388-b453-53fbaec7e5ec/accept` → **200**

```json
{
  "command_id": "44772ea4-d85a-4a8e-9b45-16d32a118dd6"
}
```

```json
{
  "id": "bd6c626a-9982-4c75-93bf-fef208a561ad",
  "order_id": "0a3ad1ab-f1f0-4f9c-8cd2-6f4b90546e6f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8973cf05-0aeb-4c85-b88e-64522df684c4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8973cf05-0aeb-4c85-b88e-64522df684c4",
  "order_id": "0a3ad1ab-f1f0-4f9c-8cd2-6f4b90546e6f",
  "assignment_id": "bd6c626a-9982-4c75-93bf-fef208a561ad",
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

`POST /api/driver/v1/work-sessions/3b97d550-d2e5-4be8-946b-37386ad8f8a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:08:24Z",
    "sequence": 1793365704951
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3b97d550-d2e5-4be8-946b-37386ad8f8a0",
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
  "last_heartbeat_at": "2026-10-30T13:08:24.971279Z",
  "last_location_at": "2026-10-30T13:08:24.971279Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/8973cf05-0aeb-4c85-b88e-64522df684c4/arrive` → **200**

```json
{
  "command_id": "f069231c-2667-4b00-9137-a3ce1fbfea4c",
  "expected_version": 0
}
```

```json
{
  "id": "8973cf05-0aeb-4c85-b88e-64522df684c4",
  "order_id": "0a3ad1ab-f1f0-4f9c-8cd2-6f4b90546e6f",
  "assignment_id": "bd6c626a-9982-4c75-93bf-fef208a561ad",
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
  "arrived_at": "2026-10-30T13:08:25.279172Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8973cf05-0aeb-4c85-b88e-64522df684c4/start` → **200**

```json
{
  "command_id": "4858cd06-0181-45c4-9afc-b9440556aee0",
  "expected_version": 1
}
```

```json
{
  "id": "8973cf05-0aeb-4c85-b88e-64522df684c4",
  "order_id": "0a3ad1ab-f1f0-4f9c-8cd2-6f4b90546e6f",
  "assignment_id": "bd6c626a-9982-4c75-93bf-fef208a561ad",
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
  "arrived_at": "2026-10-30T13:08:25.279172Z",
  "started_at": "2026-10-30T13:08:25.592239Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions/3b97d550-d2e5-4be8-946b-37386ad8f8a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:09:24Z",
    "sequence": 1793365764918
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3b97d550-d2e5-4be8-946b-37386ad8f8a0",
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
  "last_heartbeat_at": "2026-10-30T13:09:24.937704Z",
  "last_location_at": "2026-10-30T13:09:24.937704Z",
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
  "device_ref": "sandbox-12104"
}
```

```json
{
  "challenge_id": "4f3e3459-3573-465d-aa9b-68a0271b9842",
  "expires_at": "2026-10-30T13:14:25.227708103Z",
  "resend_available_at": "2026-10-30T13:09:26.227708103Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "887174",
  "sent_at": "2026-10-30T13:09:25.230855736Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f3e3459-3573-465d-aa9b-68a0271b9842",
  "code": "887174",
  "device_ref": "sandbox-12104"
}
```

```json
{
  "session_id": "daae34dc-ce95-427b-ba8d-bead948ad0e7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjY2NSwiaWF0IjoxNzkzMzY1NzY1LCJqdGkiOiI2YTNiZThiZC00YmE1LTQ2MDItYmExYy0yN2Q0OTRlN2MyZTYiLCJzaWQiOiJkYWFlMzRkYy1jZTk1LTQyN2ItYmE4ZC1iZWFkOTQ4YWQwZTcifQ.sOKg0HzMg5vEx5Yb1u53fE5sl8fjqsRsyNrRC4EDPho",
  "access_expires_at": "2026-10-30T13:24:25.552651988Z",
  "refresh_token": "nKArMt69LXpC5sW-3d9k0HIkTDwcSqOdG7qxa-M5SbM",
  "refresh_expires_at": "2026-11-29T13:09:25.552091239Z",
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
  "command_id": "fc704cac-9048-4bca-a77b-962431dd8fe6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:09:26Z",
    "sequence": 1793365766147
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "2e4f7d5b-f273-4b2e-aa39-d6087c48b051",
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
  "last_heartbeat_at": "2026-10-30T13:09:26.166915Z",
  "last_location_at": "2026-10-30T13:09:26.166915Z",
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
  "session_id": "426bb05c-33eb-4fc8-8470-3c785b3a42d4",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY2NjYsImlhdCI6MTc5MzM2NTc2NiwianRpIjoiYzRmYWIzMWMtZTI3NS00M2M1LTgwNDMtOWJjNDUwMWJhMmFlIiwic2lkIjoiNDI2YmIwNWMtMzNlYi00ZmM4LTg0NzAtM2M3ODViM2E0MmQ0In0.vOPAfq_5uBRoFROqFE21lywunqrWN2cBB42AiIU54Gc",
  "access_expires_at": "2026-10-30T13:24:26.79195786Z",
  "refresh_token": "D2fkJzaa4-7H3zXOKh8uIMAELp4n6PC-txwervJr36U",
  "refresh_expires_at": "2026-10-31T01:09:26.791394752Z",
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
  "session_id": "eeedaf58-3366-4242-8d61-98e03abf4a45",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY2NjcsImlhdCI6MTc5MzM2NTc2NywianRpIjoiZjFkZDU5ODUtNzZhOC00ZGJhLWI1NDgtOWQ0NmY0ODAwNjY4Iiwic2lkIjoiZWVlZGFmNTgtMzM2Ni00MjQyLThkNjEtOThlMDNhYmY0YTQ1In0.dOs9o2xpneOlWyF_AWVz0-NsawZZMsvkmrsm6McNU5Y",
  "access_expires_at": "2026-10-30T13:24:27.407990301Z",
  "refresh_token": "vBxPT_1u5jlljgtNFEb9KkSX0bvFD2oFMdCauoz7EHA",
  "refresh_expires_at": "2026-10-31T01:09:27.407414955Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0a3ad1ab-f1f0-4f9c-8cd2-6f4b90546e6f` → **200**

```json
{
  "id": "0a3ad1ab-f1f0-4f9c-8cd2-6f4b90546e6f",
  "short_number": 16,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "1a27d436-b757-4b7a-b610-63cfc6a2c314",
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
    "id": "bd6c626a-9982-4c75-93bf-fef208a561ad",
    "order_id": "0a3ad1ab-f1f0-4f9c-8cd2-6f4b90546e6f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "8973cf05-0aeb-4c85-b88e-64522df684c4",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T13:08:23.754901Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0a3ad1ab-f1f0-4f9c-8cd2-6f4b90546e6f/interrupt` → **200**

```json
{
  "command_id": "56e179f3-e5a5-43f6-b1aa-3fd6d3caa395",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "0a3ad1ab-f1f0-4f9c-8cd2-6f4b90546e6f",
    "short_number": 16,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "1a27d436-b757-4b7a-b610-63cfc6a2c314",
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
      "id": "bd6c626a-9982-4c75-93bf-fef208a561ad",
      "order_id": "0a3ad1ab-f1f0-4f9c-8cd2-6f4b90546e6f",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "8973cf05-0aeb-4c85-b88e-64522df684c4",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T13:08:23.754901Z",
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
    "id": "a4fdeaad-5dc5-4a86-aa54-4ff2a9514cc4",
    "short_number": 17,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "1a27d436-b757-4b7a-b610-63cfc6a2c314",
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
    "id": "87605a4f-2ad6-469a-9b4c-2a1a3505cf7d",
    "order_id": "a4fdeaad-5dc5-4a86-aa54-4ff2a9514cc4",
    "expires_at": "2026-10-30T13:09:43.026763Z",
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

`POST /api/driver/v1/offers/87605a4f-2ad6-469a-9b4c-2a1a3505cf7d/accept` → **200**

```json
{
  "command_id": "ef5682b2-6208-4cc5-aa2e-1856e2940de0"
}
```

```json
{
  "id": "b621ceca-bd5e-43ab-9d75-fca9b033b643",
  "order_id": "a4fdeaad-5dc5-4a86-aa54-4ff2a9514cc4",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4d4588f8-8647-46cd-9f6c-b2d40b9e8d26",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4d4588f8-8647-46cd-9f6c-b2d40b9e8d26",
  "order_id": "a4fdeaad-5dc5-4a86-aa54-4ff2a9514cc4",
  "assignment_id": "b621ceca-bd5e-43ab-9d75-fca9b033b643",
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
  "session_id": "2e4f7d5b-f273-4b2e-aa39-d6087c48b051",
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
  "last_heartbeat_at": "2026-10-30T13:09:26.166915Z",
  "last_location_at": "2026-10-30T13:09:26.166915Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/2e4f7d5b-f273-4b2e-aa39-d6087c48b051/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:09:29Z",
    "sequence": 1793365769579
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "2e4f7d5b-f273-4b2e-aa39-d6087c48b051",
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
  "last_heartbeat_at": "2026-10-30T13:09:29.6035Z",
  "last_location_at": "2026-10-30T13:09:29.6035Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/4d4588f8-8647-46cd-9f6c-b2d40b9e8d26/arrive` → **200**

```json
{
  "command_id": "bf942a5f-598c-4f2a-8611-60186d39564d",
  "expected_version": 0
}
```

```json
{
  "id": "4d4588f8-8647-46cd-9f6c-b2d40b9e8d26",
  "order_id": "a4fdeaad-5dc5-4a86-aa54-4ff2a9514cc4",
  "assignment_id": "b621ceca-bd5e-43ab-9d75-fca9b033b643",
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
  "arrived_at": "2026-10-30T13:09:29.911128Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4d4588f8-8647-46cd-9f6c-b2d40b9e8d26/start` → **200**

```json
{
  "command_id": "9fc2a0b3-204f-4ace-b7a2-8f0c0ddcd15b",
  "expected_version": 1
}
```

```json
{
  "id": "4d4588f8-8647-46cd-9f6c-b2d40b9e8d26",
  "order_id": "a4fdeaad-5dc5-4a86-aa54-4ff2a9514cc4",
  "assignment_id": "b621ceca-bd5e-43ab-9d75-fca9b033b643",
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
  "arrived_at": "2026-10-30T13:09:29.911128Z",
  "started_at": "2026-10-30T13:09:30.221864Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4d4588f8-8647-46cd-9f6c-b2d40b9e8d26/complete` → **200**

```json
{
  "command_id": "39ee07db-a4a6-4c46-938f-e9e5aad91a61",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:09:30Z"
}
```

```json
{
  "id": "4d4588f8-8647-46cd-9f6c-b2d40b9e8d26",
  "order_id": "a4fdeaad-5dc5-4a86-aa54-4ff2a9514cc4",
  "assignment_id": "b621ceca-bd5e-43ab-9d75-fca9b033b643",
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
  "arrived_at": "2026-10-30T13:09:29.911128Z",
  "started_at": "2026-10-30T13:09:30.221864Z",
  "completed_at": "2026-10-30T13:09:30.538266Z",
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
    "id": "a4fdeaad-5dc5-4a86-aa54-4ff2a9514cc4",
    "short_number": 17,
    "status": "FULFILLED",
    "created_at": "2026-10-30T13:09:28.016139Z",
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
    "id": "0a3ad1ab-f1f0-4f9c-8cd2-6f4b90546e6f",
    "short_number": 16,
    "status": "CANCELLED",
    "created_at": "2026-10-30T13:08:23.754901Z",
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

`GET /api/operator/v1/orders/0a3ad1ab-f1f0-4f9c-8cd2-6f4b90546e6f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:08:23.75539Z",
      "actor": {
        "type": "CLIENT",
        "id": "1a27d436-b757-4b7a-b610-63cfc6a2c314",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "0a3ad1ab-f1f0-4f9c-8cd2-6f4b90546e6f",
        "quote_id": "915e8434-1eb4-4484-b2e3-45f2e5d3299d",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "01a0a1c4-27c0-4f80-bcb2-188e2c9368ce"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:08:23.757518Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0a3ad1ab-f1f0-4f9c-8cd2-6f4b90546e6f",
        "attempt_id": "cac9c5db-f9f1-4755-9fc2-e2a53ced6f12",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "01a0a1c4-27c0-4f80-bcb2-188e2c9368ce"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:08:23.764251Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "4b5989ab-5814-4388-b453-53fbaec7e5ec",
        "order_id": "0a3ad1ab-f1f0-4f9c-8cd2-6f4b90546e6f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "01a0a1c4-27c0-4f80-bcb2-188e2c9368ce"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:08:24.365479Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "4b5989ab-5814-4388-b453-53fbaec7e5ec",
        "order_id": "0a3ad1ab-f1f0-4f9c-8cd2-6f4b90546e6f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "bd6c626a-9982-4c75-93bf-fef208a561ad"
      },
      "correlation_id": "c812facd-44ff-4da7-ba8c-2887093c02f2"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/a4fdeaad-5dc5-4a86-aa54-4ff2a9514cc4/tip` → **200**

```json
{
  "order_id": "a4fdeaad-5dc5-4a86-aa54-4ff2a9514cc4",
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
  "available_until": "2026-10-31T13:09:30.538266Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/a4fdeaad-5dc5-4a86-aa54-4ff2a9514cc4/tip` → **409**

```json
{
  "command_id": "c809ca1b-77a7-443b-9c23-523698cfa26c",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/a4fdeaad-5dc5-4a86-aa54-4ff2a9514cc4/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b5178ec4-e545-4226-8a86-625c907548d6"
}
```

Done: interrupted 0a3ad1ab-f1f0-4f9c-8cd2-6f4b90546e6f, follow-up a4fdeaad-5dc5-4a86-aa54-4ff2a9514cc4.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3b97d550-d2e5-4be8-946b-37386ad8f8a0",
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
  "last_heartbeat_at": "2026-10-30T13:09:24.937704Z",
  "last_location_at": "2026-10-30T13:09:24.937704Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3b97d550-d2e5-4be8-946b-37386ad8f8a0/close` → **200**

```json
{
  "command_id": "3159901b-66a3-497c-8ce4-fecd80c01a5c",
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
  "session_id": "2e4f7d5b-f273-4b2e-aa39-d6087c48b051",
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
  "last_heartbeat_at": "2026-10-30T13:09:29.6035Z",
  "last_location_at": "2026-10-30T13:09:29.6035Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2e4f7d5b-f273-4b2e-aa39-d6087c48b051/close` → **200**

```json
{
  "command_id": "a774b945-0c2e-4f76-88eb-c534e3b0cd02",
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
  "session_id": "0f633df5-fb17-4f0c-adbb-7a128c2332cf",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY2NzYsImlhdCI6MTc5MzM2NTc3NiwianRpIjoiZDM4MWZjNmYtYzJkNC00MjUxLWI2ZTItODI4MGU0YWQ2ZDRhIiwic2lkIjoiMGY2MzNkZjUtZmIxNy00ZjBjLWFkYmItN2ExMjhjMjMzMmNmIn0.VUbKdE1hkgYxDQZJ4apIuUpVpRpJRGI0LXAVUvsSmsY",
  "access_expires_at": "2026-10-30T13:24:36.863696563Z",
  "refresh_token": "7zL3gF6o7z19QyOBUg15x8w845ELxX0NY6-lYdz8EyA",
  "refresh_expires_at": "2026-10-31T01:09:36.86310956Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "d091aa97-292f-4c2d-bf2e-f1b82fc407bc",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:09:37Z"
}
```

```json
{
  "id": "812124cc-134b-4dbf-a383-6537f286545c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:09:37Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/812124cc-134b-4dbf-a383-6537f286545c/publish` → **200**

```json
{
  "command_id": "902898cd-3e56-4a44-89a8-de5ec563a9bb",
  "expected_version": 0
}
```

```json
{
  "id": "812124cc-134b-4dbf-a383-6537f286545c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:09:37.483572Z",
  "published_at": "2026-10-30T13:09:37.483572Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "812124cc-134b-4dbf-a383-6537f286545c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T13:09:37.483572Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630121646",
  "device_ref": "sandbox-19"
}
```

```json
{
  "challenge_id": "08ec30c3-7a16-4803-8f66-a06d7ac895aa",
  "expires_at": "2026-10-30T13:14:38.068746556Z",
  "resend_available_at": "2026-10-30T13:09:39.068746556Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630121646` → **200**

```json
{
  "phone": "+380630121646",
  "audience": "CLIENT",
  "code": "977013",
  "sent_at": "2026-10-30T13:09:38.072173259Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "08ec30c3-7a16-4803-8f66-a06d7ac895aa",
  "code": "977013",
  "device_ref": "sandbox-19"
}
```

```json
{
  "session_id": "ca7b6a33-6aec-48d9-85ac-18c82dbf95d9",
  "subject": {
    "type": "CLIENT",
    "id": "09194b39-8667-48a7-9f68-ffef927fad48"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOTE5NGIzOS04NjY3LTQ4YTctOWY2OC1mZmVmOTI3ZmFkNDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2Njc4LCJpYXQiOjE3OTMzNjU3NzgsImp0aSI6IjM3ZDU3YjUzLTcyNTMtNGRlZC1hN2Y0LTYyZDk5MTQxZmQ4ZSIsInNpZCI6ImNhN2I2YTMzLTZhZWMtNDhkOS04NWFjLTE4YzgyZGJmOTVkOSJ9.fFkjKmcDKlmdhkqiowsfRdCB64M6p4RO5sZtwnoskeI",
  "access_expires_at": "2026-10-30T13:24:38.386320965Z",
  "refresh_token": "j8fYZkiHIyLFJMOcoIEGrxPQEO4f595crxcSWl1UtxY",
  "refresh_expires_at": "2026-11-29T13:09:38.385445923Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "812124cc-134b-4dbf-a383-6537f286545c",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T13:09:37.483572Z",
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
  "command_id": "72083b2f-02f6-45c4-81b6-a1fe0177d7ab",
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
  "id": "8a5b455c-830a-49a0-9db6-bab0f967996d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:14:38.974406Z",
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
  "command_id": "32782572-3fc1-4125-97f4-ae8e52e4b4f8",
  "quote_id": "8a5b455c-830a-49a0-9db6-bab0f967996d",
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
  "correlation_id": "c168ed40-8801-4c89-a983-51825dccf619"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "4678a368-5735-4b51-869a-455cbcf0d58a",
  "version_id": "812124cc-134b-4dbf-a383-6537f286545c",
  "language": "uk"
}
```

```json
{
  "version_id": "812124cc-134b-4dbf-a383-6537f286545c",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T13:09:39.590834Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e1a3b9a8-407d-440d-87df-11f2e85e8c6c",
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
  "id": "d6e87256-d54b-4be2-a4b8-6f322a49da30",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:14:39.888714Z",
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
  "command_id": "5ff1a095-c2b0-45f7-9c9e-a96ade38212f",
  "quote_id": "d6e87256-d54b-4be2-a4b8-6f322a49da30",
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
  "id": "b934e65d-4bc0-468a-b4f4-79c3e840e657",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "09194b39-8667-48a7-9f68-ffef927fad48",
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
  "created_at": "2026-10-30T13:09:40.192836Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b934e65d-4bc0-468a-b4f4-79c3e840e657` → **200**

```json
{
  "id": "b934e65d-4bc0-468a-b4f4-79c3e840e657",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "09194b39-8667-48a7-9f68-ffef927fad48",
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
  "created_at": "2026-10-30T13:09:40.192836Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b934e65d-4bc0-468a-b4f4-79c3e840e657/cancel` → **200**

```json
{
  "command_id": "1ec7bb6e-c156-4356-b5ae-8b8199e5ccdb",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b934e65d-4bc0-468a-b4f4-79c3e840e657",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "09194b39-8667-48a7-9f68-ffef927fad48",
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
  "created_at": "2026-10-30T13:09:40.192836Z",
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

`POST /api/admin/v1/legal-documents/812124cc-134b-4dbf-a383-6537f286545c` → **409**

```json
{
  "command_id": "1eea022a-0c6e-4082-8942-31ece8daecf7",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:09:41Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/812124cc-134b-4dbf-a383-6537f286545c",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "097a4d4a-9e98-4167-a48e-2eb65dc23e01"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "af42cfeb-7229-4c37-bc85-d3afb50c051b",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T13:09:41Z"
}
```

```json
{
  "id": "c6c409d3-fed4-4238-8297-ea22cf69daa5",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T13:09:41Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/c6c409d3-fed4-4238-8297-ea22cf69daa5/publish` → **200**

```json
{
  "command_id": "51897511-1a02-4916-970f-a335239d9b48",
  "expected_version": 0
}
```

```json
{
  "id": "c6c409d3-fed4-4238-8297-ea22cf69daa5",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T13:09:41.767608Z",
  "published_at": "2026-10-30T13:09:41.767608Z",
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
  "device_ref": "sandbox-21583"
}
```

```json
{
  "challenge_id": "883d66ee-0d52-42a2-8262-68f9bd44a307",
  "expires_at": "2026-10-30T13:14:42.068552435Z",
  "resend_available_at": "2026-10-30T13:09:43.068552435Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "161544",
  "sent_at": "2026-10-30T13:09:42.071104367Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "883d66ee-0d52-42a2-8262-68f9bd44a307",
  "code": "161544",
  "device_ref": "sandbox-21583"
}
```

```json
{
  "session_id": "25eae823-1da7-4602-b1cf-252d3044110b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjY4MiwiaWF0IjoxNzkzMzY1NzgyLCJqdGkiOiJlNDUxZWE2NS1hNzQyLTQ4ZTktYmNkMC00YjlmMmQ2MDdlZDEiLCJzaWQiOiIyNWVhZTgyMy0xZGE3LTQ2MDItYjFjZi0yNTJkMzA0NDExMGIifQ.MhaGP4vI5BSJOr2urTH515QS-hoUGvw1kO5RxY398Cg",
  "access_expires_at": "2026-10-30T13:24:42.395409828Z",
  "refresh_token": "_aKRJ5QOowVXdOrt1mq0VQE_Jli50hQx36uVWgISeV8",
  "refresh_expires_at": "2026-11-29T13:09:42.394912777Z",
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
  "command_id": "f282ef6f-8267-4ae1-981b-6839c5349cb9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:10:53Z",
    "sequence": 1793365853995
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "3aa37a39-39bc-442a-9f55-b98ac5497286",
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
  "last_heartbeat_at": "2026-10-30T13:10:54.015075Z",
  "last_location_at": "2026-10-30T13:10:54.015075Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670672406",
  "device_ref": "sandbox-4419"
}
```

```json
{
  "challenge_id": "86b478ae-1c5c-4a84-988f-d0ca3175451b",
  "expires_at": "2026-10-30T13:15:54.321804666Z",
  "resend_available_at": "2026-10-30T13:10:55.321804666Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670672406` → **200**

```json
{
  "phone": "+380670672406",
  "audience": "CLIENT",
  "code": "071525",
  "sent_at": "2026-10-30T13:10:54.324670248Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "86b478ae-1c5c-4a84-988f-d0ca3175451b",
  "code": "071525",
  "device_ref": "sandbox-4419"
}
```

```json
{
  "session_id": "82c43abc-fd07-439b-9710-a2586017294f",
  "subject": {
    "type": "CLIENT",
    "id": "85d4c299-b7d6-47c2-90b1-bf745a80f86c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NWQ0YzI5OS1iN2Q2LTQ3YzItOTBiMS1iZjc0NWE4MGY4NmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NzU0LCJpYXQiOjE3OTMzNjU4NTQsImp0aSI6ImI1NTJkMjgxLTRjOGQtNGNkYS05ZjRkLWIxY2M5MDJmMmRhMCIsInNpZCI6IjgyYzQzYWJjLWZkMDctNDM5Yi05NzEwLWEyNTg2MDE3Mjk0ZiJ9.jhv7VnuGYjJV2xuZpsQHTomoFPk8XL-hlYHRj8t_pH8",
  "access_expires_at": "2026-10-30T13:25:54.645053716Z",
  "refresh_token": "2a3hOkdojbLVXTNiegH3IOklSvWaamjYdBKDD1C4HNA",
  "refresh_expires_at": "2026-11-29T13:10:54.644548804Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7239cfeb-1318-4786-ad42-0547ae607b21",
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
  "id": "c27b83ea-ec04-42a2-b4d8-ce2d6f293530",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:15:54.933663Z",
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
  "command_id": "c2d4e00e-01a1-47a6-ba86-855f205d3659",
  "quote_id": "c27b83ea-ec04-42a2-b4d8-ce2d6f293530",
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
    "phone": "+380670685465"
  }
}
```

```json
{
  "id": "2b2f04c0-8703-4cd7-b344-8c93aa42e658",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85d4c299-b7d6-47c2-90b1-bf745a80f86c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:10:55.237645Z",
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
    "id": "e2682c74-9c59-4c91-84bc-cdf01c16d684",
    "order_id": "2b2f04c0-8703-4cd7-b344-8c93aa42e658",
    "expires_at": "2026-10-30T13:11:10.242152Z",
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

`POST /api/driver/v1/offers/e2682c74-9c59-4c91-84bc-cdf01c16d684/accept` → **200**

```json
{
  "command_id": "f73ef368-cf80-46d6-9f34-563b533743cf"
}
```

```json
{
  "id": "1ba4c405-9e38-4901-ba82-ba4657679cc1",
  "order_id": "2b2f04c0-8703-4cd7-b344-8c93aa42e658",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "83853a98-76e8-48d6-a578-18f9fce9094d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "83853a98-76e8-48d6-a578-18f9fce9094d",
  "order_id": "2b2f04c0-8703-4cd7-b344-8c93aa42e658",
  "assignment_id": "1ba4c405-9e38-4901-ba82-ba4657679cc1",
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
    "phone": "+380670685465"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6aea5836-30a3-457b-9b06-a2bf3cdfe153",
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
  "id": "6f220581-0083-4995-8e37-029adebf537f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:15:56.465715Z",
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
  "command_id": "bd903b3f-2542-4c11-bb2c-0140ba7f5687",
  "quote_id": "6f220581-0083-4995-8e37-029adebf537f",
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
  "id": "ea52d906-6c57-4d7d-9b55-af81330d6996",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85d4c299-b7d6-47c2-90b1-bf745a80f86c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:10:56.765581Z",
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
  "command_id": "37fac0ff-c380-4d98-93d3-6b4208e1fabc",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T16:10:57Z"
}
```

```json
{
  "id": "ca9aaa48-318f-4d7d-b9c9-638407149d45",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:15:57.085664Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T16:10:57Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a437b04b-5119-4f01-ab66-dea0a206f0ca",
  "quote_id": "ca9aaa48-318f-4d7d-b9c9-638407149d45",
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
  "pickup_at": "2026-10-30T16:10:57Z"
}
```

```json
{
  "id": "f82d7c94-a675-482c-830f-3bc4cfb76a61",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "85d4c299-b7d6-47c2-90b1-bf745a80f86c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T13:10:57.389856Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T16:10:57Z",
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
  "command_id": "55e64ba1-3d04-40e0-b8cc-2831dfec6b12",
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
  "id": "a9492d35-e008-4066-9ae5-2c827b05f6cc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:15:57.704480Z",
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
  "command_id": "37cb829e-6d21-4a60-80bc-7c4fae4c70c8",
  "quote_id": "a9492d35-e008-4066-9ae5-2c827b05f6cc",
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
  "correlation_id": "dc9ad011-d787-4968-8d2c-34af87442262"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "f82d7c94-a675-482c-830f-3bc4cfb76a61",
      "short_number": 21,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "85d4c299-b7d6-47c2-90b1-bf745a80f86c",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T13:10:57.389856Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T16:10:57Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "ea52d906-6c57-4d7d-9b55-af81330d6996",
      "short_number": 20,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "85d4c299-b7d6-47c2-90b1-bf745a80f86c",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T13:10:56.765581Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "2b2f04c0-8703-4cd7-b344-8c93aa42e658",
      "short_number": 19,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "ea52d906-6c57-4d7d-9b55-af81330d6996",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85d4c299-b7d6-47c2-90b1-bf745a80f86c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:10:56.765581Z",
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

`GET /api/rider/v1/orders/2b2f04c0-8703-4cd7-b344-8c93aa42e658` → **200**

```json
{
  "id": "2b2f04c0-8703-4cd7-b344-8c93aa42e658",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "85d4c299-b7d6-47c2-90b1-bf745a80f86c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "1ba4c405-9e38-4901-ba82-ba4657679cc1",
    "order_id": "2b2f04c0-8703-4cd7-b344-8c93aa42e658",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "83853a98-76e8-48d6-a578-18f9fce9094d",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T13:10:55.237645Z",
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
    "location_at": "2026-10-30T13:10:54.015075Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/2b2f04c0-8703-4cd7-b344-8c93aa42e658/cancel` → **200**

```json
{
  "command_id": "30d13dc9-ecf7-4d25-b181-1753005d38ee",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2b2f04c0-8703-4cd7-b344-8c93aa42e658",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "85d4c299-b7d6-47c2-90b1-bf745a80f86c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "1ba4c405-9e38-4901-ba82-ba4657679cc1",
    "order_id": "2b2f04c0-8703-4cd7-b344-8c93aa42e658",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "83853a98-76e8-48d6-a578-18f9fce9094d",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:10:55.237645Z",
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

`GET /api/rider/v1/orders/ea52d906-6c57-4d7d-9b55-af81330d6996` → **200**

```json
{
  "id": "ea52d906-6c57-4d7d-9b55-af81330d6996",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85d4c299-b7d6-47c2-90b1-bf745a80f86c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:10:56.765581Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ea52d906-6c57-4d7d-9b55-af81330d6996/cancel` → **200**

```json
{
  "command_id": "04ef5d64-a0cf-4e7f-93db-835e05b3f736",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ea52d906-6c57-4d7d-9b55-af81330d6996",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "85d4c299-b7d6-47c2-90b1-bf745a80f86c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:10:56.765581Z",
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

`GET /api/rider/v1/orders/f82d7c94-a675-482c-830f-3bc4cfb76a61` → **200**

```json
{
  "id": "f82d7c94-a675-482c-830f-3bc4cfb76a61",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "85d4c299-b7d6-47c2-90b1-bf745a80f86c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T13:10:57.389856Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T16:10:57Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f82d7c94-a675-482c-830f-3bc4cfb76a61/cancel` → **200**

```json
{
  "command_id": "e233bf7d-0f1a-48fe-8921-61e893e9ae38",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f82d7c94-a675-482c-830f-3bc4cfb76a61",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "85d4c299-b7d6-47c2-90b1-bf745a80f86c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T13:10:57.389856Z",
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
  "pickup_at": "2026-10-30T16:10:57Z",
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
  "session_id": "3aa37a39-39bc-442a-9f55-b98ac5497286",
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
  "last_heartbeat_at": "2026-10-30T13:10:54.015075Z",
  "last_location_at": "2026-10-30T13:10:54.015075Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3aa37a39-39bc-442a-9f55-b98ac5497286/close` → **200**

```json
{
  "command_id": "7f3d41c7-e623-4fab-8958-636c4b73ac8c",
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

Done: orders 2b2f04c0-8703-4cd7-b344-8c93aa42e658, ea52d906-6c57-4d7d-9b55-af81330d6996, f82d7c94-a675-482c-830f-3bc4cfb76a61.

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
  "session_id": "c0b802e4-d8ec-4e76-9c6e-801a4b5225cf",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY3NjEsImlhdCI6MTc5MzM2NTg2MSwianRpIjoiMGY0YzRjOGUtOGJjMC00MmI2LThkZTItNjI1OTA1ZWIzNDEyIiwic2lkIjoiYzBiODAyZTQtZDhlYy00ZTc2LTljNmUtODAxYTRiNTIyNWNmIn0.noLLmVfLTzbW70DfIEKs_8RilMDZ-plgjYCzV5qHMdA",
  "access_expires_at": "2026-10-30T13:26:01.650702571Z",
  "refresh_token": "FVTjzr4QL6peArzk6qNITRDvERQTRXcW_bMUeVo3ALs",
  "refresh_expires_at": "2026-10-31T01:11:01.65000115Z",
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
  "session_id": "9a8e4508-ba70-40b9-9e73-c7adedb283f6",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY3NjIsImlhdCI6MTc5MzM2NTg2MiwianRpIjoiN2RiMzYwNTctODA5Yy00N2UxLWJmODQtMTZmNzYwODlkNDI2Iiwic2lkIjoiOWE4ZTQ1MDgtYmE3MC00MGI5LTllNzMtYzdhZGVkYjI4M2Y2In0.4Spg5SzEBVNlUW9yAkVvWok34LiAVIVJywEJPP32m34",
  "access_expires_at": "2026-10-30T13:26:02.265718503Z",
  "refresh_token": "iJMp-paN-b5lHis16kLucqMyKK7WJfLd29TATa6Zb2U",
  "refresh_expires_at": "2026-10-31T01:11:02.265218098Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17666"
}
```

```json
{
  "challenge_id": "c7d0b205-a29e-47c4-a66e-f7bf64eeff56",
  "expires_at": "2026-10-30T13:16:02.548145454Z",
  "resend_available_at": "2026-10-30T13:11:03.548145454Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "340997",
  "sent_at": "2026-10-30T13:11:02.550537124Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c7d0b205-a29e-47c4-a66e-f7bf64eeff56",
  "code": "340997",
  "device_ref": "sandbox-17666"
}
```

```json
{
  "session_id": "20297c1e-0ca0-4bad-867d-be00b4c0f02a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Njc2MiwiaWF0IjoxNzkzMzY1ODYyLCJqdGkiOiI4ZmM2ZDdkYy0zZWI0LTQ0YWMtYjc0OC0xNzI0YjQ0NTgzYWUiLCJzaWQiOiIyMDI5N2MxZS0wY2EwLTRiYWQtODY3ZC1iZTAwYjRjMGYwMmEifQ.LUT8RwL2DIcWhyBx6ACDvmqU29R1cc6bmG2plsmy_mw",
  "access_expires_at": "2026-10-30T13:26:02.866025225Z",
  "refresh_token": "3gsmLIQOgUPP8WAa5KfyH3V-OTv68R-PEwgpUzTb1FA",
  "refresh_expires_at": "2026-11-29T13:11:02.865463214Z",
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
  "command_id": "ec249a99-a497-4401-8023-f88f52f777a1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:11:03Z",
    "sequence": 1793365863477
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "914a6f2d-4ece-4f99-8ca2-276c53d035e6",
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
  "last_heartbeat_at": "2026-10-30T13:11:03.499543Z",
  "last_location_at": "2026-10-30T13:11:03.499543Z",
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
  "command_id": "d2fa3c36-95c1-4518-a47c-081621a88937",
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
  "effective_at": "2026-10-30T13:11:04.097537Z",
  "changed_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T13:01:28.382818Z",
  "last_entries": [
    {
      "order_id": "ab66910a-78a6-4145-8073-c0d729ba252a",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T13:01:28.382818Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "fec2a467-1acb-470d-b834-5608de30047a",
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
  "id": "bb7a0291-53ec-4463-91c2-6b581d456459",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:16:04.689106Z",
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
  "command_id": "81bf35ef-9fc8-4b05-a5bb-2fe43d1ba971",
  "quote_id": "bb7a0291-53ec-4463-91c2-6b581d456459",
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
    "phone": "+3806711121338"
  }
}
```

```json
{
  "id": "65a22d28-4bbe-4466-8d4e-2ea66c990a0d",
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
  "created_at": "2026-10-30T13:11:04.990318Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121338"
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
    "id": "51327aa0-0aee-4460-8914-ba44f91f7a1d",
    "order_id": "65a22d28-4bbe-4466-8d4e-2ea66c990a0d",
    "expires_at": "2026-10-30T13:11:19.9943Z",
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

`POST /api/driver/v1/offers/51327aa0-0aee-4460-8914-ba44f91f7a1d/accept` → **200**

```json
{
  "command_id": "36eb4151-dcad-4857-9b58-7c310881124b"
}
```

```json
{
  "id": "3c9ac9f5-d93e-4135-93f2-02d24ccbb7a8",
  "order_id": "65a22d28-4bbe-4466-8d4e-2ea66c990a0d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f7d15a88-36e5-49e4-be9e-4aaef5f3a124",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f7d15a88-36e5-49e4-be9e-4aaef5f3a124",
  "order_id": "65a22d28-4bbe-4466-8d4e-2ea66c990a0d",
  "assignment_id": "3c9ac9f5-d93e-4135-93f2-02d24ccbb7a8",
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
    "phone": "+3806711121338"
  }
}
```

`POST /api/driver/v1/work-sessions/914a6f2d-4ece-4f99-8ca2-276c53d035e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:11:06Z",
    "sequence": 1793365866188
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "914a6f2d-4ece-4f99-8ca2-276c53d035e6",
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
  "last_heartbeat_at": "2026-10-30T13:11:06.207773Z",
  "last_location_at": "2026-10-30T13:11:06.207773Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/f7d15a88-36e5-49e4-be9e-4aaef5f3a124/arrive` → **200**

```json
{
  "command_id": "502309ac-1f42-4335-a582-986aadf82364",
  "expected_version": 0
}
```

```json
{
  "id": "f7d15a88-36e5-49e4-be9e-4aaef5f3a124",
  "order_id": "65a22d28-4bbe-4466-8d4e-2ea66c990a0d",
  "assignment_id": "3c9ac9f5-d93e-4135-93f2-02d24ccbb7a8",
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
  "arrived_at": "2026-10-30T13:11:06.509599Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711121338"
  }
}
```

`POST /api/driver/v1/trips/f7d15a88-36e5-49e4-be9e-4aaef5f3a124/start` → **200**

```json
{
  "command_id": "5ede45a9-00e9-452f-b3fd-fd955e412b1c",
  "expected_version": 1
}
```

```json
{
  "id": "f7d15a88-36e5-49e4-be9e-4aaef5f3a124",
  "order_id": "65a22d28-4bbe-4466-8d4e-2ea66c990a0d",
  "assignment_id": "3c9ac9f5-d93e-4135-93f2-02d24ccbb7a8",
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
  "arrived_at": "2026-10-30T13:11:06.509599Z",
  "started_at": "2026-10-30T13:11:06.810682Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711121338"
  }
}
```

`POST /api/driver/v1/trips/f7d15a88-36e5-49e4-be9e-4aaef5f3a124/complete` → **200**

```json
{
  "command_id": "78973a42-c6e5-4754-abc3-251c7dafb0f9",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:11:07Z",
  "cash_received": true
}
```

```json
{
  "id": "f7d15a88-36e5-49e4-be9e-4aaef5f3a124",
  "order_id": "65a22d28-4bbe-4466-8d4e-2ea66c990a0d",
  "assignment_id": "3c9ac9f5-d93e-4135-93f2-02d24ccbb7a8",
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
  "arrived_at": "2026-10-30T13:11:06.509599Z",
  "started_at": "2026-10-30T13:11:06.810682Z",
  "completed_at": "2026-10-30T13:11:07.119092Z",
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
  "command_id": "921cfabc-9ada-405b-81f5-729e9968661e",
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
  "id": "2370a411-64fa-4d13-95a6-4c6e6fb3b0ea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:16:07.423283Z",
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
  "command_id": "5d23ab2e-5bd8-4cd2-80a6-950472c54e40",
  "quote_id": "2370a411-64fa-4d13-95a6-4c6e6fb3b0ea",
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
    "phone": "+380671114364"
  }
}
```

```json
{
  "id": "141a384b-7df1-416a-94d1-ec898e72c4b8",
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
  "created_at": "2026-10-30T13:11:07.732759Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671114364"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/141a384b-7df1-416a-94d1-ec898e72c4b8` → **200**

```json
{
  "id": "141a384b-7df1-416a-94d1-ec898e72c4b8",
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
  "created_at": "2026-10-30T13:11:07.732759Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671114364"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/141a384b-7df1-416a-94d1-ec898e72c4b8/cancel` → **200**

```json
{
  "command_id": "c1dee287-6ee9-466d-bdc3-29f53dee93d3",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "141a384b-7df1-416a-94d1-ec898e72c4b8",
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
  "created_at": "2026-10-30T13:11:07.732759Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671114364"
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
  "staff_id": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T13:01:28.382818Z",
  "last_entries": [
    {
      "order_id": "141a384b-7df1-416a-94d1-ec898e72c4b8",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T13:11:08.366628Z"
    },
    {
      "order_id": "65a22d28-4bbe-4466-8d4e-2ea66c990a0d",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T13:11:07.123683Z"
    },
    {
      "order_id": "ab66910a-78a6-4145-8073-c0d729ba252a",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T13:01:28.382818Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "914a6f2d-4ece-4f99-8ca2-276c53d035e6",
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
  "last_heartbeat_at": "2026-10-30T13:11:06.207773Z",
  "last_location_at": "2026-10-30T13:11:06.207773Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/914a6f2d-4ece-4f99-8ca2-276c53d035e6/close` → **200**

```json
{
  "command_id": "ae0dcd60-a098-45a4-9116-df30921749f0",
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

Done: operator bonus for fulfilled 65a22d28-4bbe-4466-8d4e-2ea66c990a0d and operator-fault cancellation 141a384b-7df1-416a-94d1-ec898e72c4b8.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677401792",
  "device_ref": "sandbox-30923"
}
```

```json
{
  "challenge_id": "f9331a25-3a9a-421b-9982-7bb1b5d1703b",
  "expires_at": "2026-10-30T13:16:12.839615004Z",
  "resend_available_at": "2026-10-30T13:11:13.839615004Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677401792` → **200**

```json
{
  "phone": "+380677401792",
  "audience": "CLIENT",
  "code": "540532",
  "sent_at": "2026-10-30T13:11:12.841861526Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675851552",
  "device_ref": "sandbox-31362",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "d3e31cd0-f716-4651-aeb4-d51e1092f1af",
  "expires_at": "2026-10-30T13:16:14.369303551Z",
  "resend_available_at": "2026-10-30T13:11:15.369303551Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675851552` → **200**

```json
{
  "phone": "+380675851552",
  "audience": "CLIENT",
  "code": "455942",
  "sent_at": "2026-10-30T13:11:14.371659218Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675851552",
  "device_ref": "sandbox-29994",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "8b095449-74c7-4dad-9e96-3f78ff2c9a6f",
  "expires_at": "2026-10-30T13:16:15.891763077Z",
  "resend_available_at": "2026-10-30T13:11:16.891763077Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675851552` → **200**

```json
{
  "phone": "+380675851552",
  "audience": "CLIENT",
  "code": "820190",
  "sent_at": "2026-10-30T13:11:15.89433704Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675120000",
  "device_ref": "sandbox-11633"
}
```

```json
{
  "challenge_id": "85da91d3-bbeb-49ca-af3d-742a1c2dd893",
  "expires_at": "2026-10-30T13:16:17.423260257Z",
  "resend_available_at": "2026-10-30T13:11:18.423260257Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675120000",
  "device_ref": "sandbox-25382"
}
```

```json
{
  "challenge_id": "3512aed6-3333-4875-8be4-cf3d4f21d583",
  "expires_at": "2026-10-30T13:16:18.921872852Z",
  "resend_available_at": "2026-10-30T13:11:19.921872852Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675120000` → **200**

```json
{
  "phone": "+380675120000",
  "audience": "CLIENT",
  "code": "498014",
  "sent_at": "2026-10-30T13:11:18.924870848Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675120000",
  "device_ref": "sandbox-24991",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "0bc4376f-319b-4e0b-b0e6-2d894e588658",
  "expires_at": "2026-10-30T13:16:20.444201429Z",
  "resend_available_at": "2026-10-30T13:11:21.444201429Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675120000` → **200**

```json
{
  "phone": "+380675120000",
  "audience": "CLIENT",
  "code": "671850",
  "sent_at": "2026-10-30T13:11:20.446589769Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380675120000",
  "device_ref": "sandbox-11356",
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
  "correlation_id": "bb278aea-8042-4f04-99fb-89691ce79b1e",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000021332"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "df9aeb73-11d8-40e3-8326-c30c8db66e8b"
}
```

`GET /sandbox/v1/otp?phone=%2B442000021332` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120024503"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "894aedda-750e-4978-8d19-fc8f3173708d"
}
```

`GET /sandbox/v1/otp?phone=%2B37120024503` → **404**

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
  "session_id": "c912bb7e-8385-4174-8c50-8b957a305938",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY3ODMsImlhdCI6MTc5MzM2NTg4MywianRpIjoiN2RhNTZmYjEtMDY4Ni00OWRjLTkxNDctNTc0NWZiMjQ5MGNlIiwic2lkIjoiYzkxMmJiN2UtODM4NS00MTc0LThjNTAtOGI5NTdhMzA1OTM4In0.SNMWJi-2Zq7zUYIjRidBHdgyMhwSPS8SFNKLUc_rU9w",
  "access_expires_at": "2026-10-30T13:26:23.234000209Z",
  "refresh_token": "Gvy8bbg8TWO2YhPe1a5rK_bsgzA4zD4YxeNdnrzXDDE",
  "refresh_expires_at": "2026-10-31T01:11:23.233194475Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675120000` → **200**

```json
{
  "deliveries": [
    {
      "id": "096571b4-22c6-446e-8080-0134df1589b6",
      "challenge_id": "0bc4376f-319b-4e0b-b0e6-2d894e588658",
      "phone": "+380675120000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-f7919773-130f-48ea-a9d5-8cf5cd1b38e3",
      "error": null,
      "attempted_at": "2026-10-30T13:11:20.447069Z"
    },
    {
      "id": "9578833a-78dd-4027-b837-2d84c5f3f3fb",
      "challenge_id": "3512aed6-3333-4875-8be4-cf3d4f21d583",
      "phone": "+380675120000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-ee24aad2-5bdd-4a03-b5a6-05d9648be963",
      "error": null,
      "attempted_at": "2026-10-30T13:11:18.925331Z"
    },
    {
      "id": "88011258-5273-4f98-90e5-87f5029b8d16",
      "challenge_id": "85da91d3-bbeb-49ca-af3d-742a1c2dd893",
      "phone": "+380675120000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T13:11:17.42573Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380675120000` → **200**

```json
{
  "phone": "+380675120000",
  "audience": "CLIENT",
  "code": "671850",
  "sent_at": "2026-10-30T13:11:20.446589769Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675851552` → **200**

```json
{
  "deliveries": [
    {
      "id": "45559f2a-2426-49d7-9005-2d85d0b137a0",
      "challenge_id": "8b095449-74c7-4dad-9e96-3f78ff2c9a6f",
      "phone": "+380675851552",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-4049a1a0-6eef-4227-971e-a3b9662bc8e6",
      "error": null,
      "attempted_at": "2026-10-30T13:11:15.894581Z"
    },
    {
      "id": "3411c8bc-60a5-4330-8146-31739688ad57",
      "challenge_id": "d3e31cd0-f716-4651-aeb4-d51e1092f1af",
      "phone": "+380675851552",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b006796e-10fe-476f-b265-9e62212671b8",
      "error": null,
      "attempted_at": "2026-10-30T13:11:14.372148Z"
    }
  ]
}
```

Done: SMS to +380677401792; SMS then a call to +380675851552; a failed SMS, two calls and a refused third to +380675120000; +44 and +371 refused.

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
  "session_id": "7fb72a4d-9a04-495e-b13d-c81ca8e54965",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY3ODQsImlhdCI6MTc5MzM2NTg4NCwianRpIjoiMGZkMjVmNWQtMzU4Mi00NzkwLTg5ZjQtOWVhMWY5NjY5Y2ViIiwic2lkIjoiN2ZiNzJhNGQtOWEwNC00OTVlLWIxM2QtYzgxY2E4ZTU0OTY1In0.owqChuoTxkrIybkjRfhujTUa9IvHMbpdyrJtkZxFU0A",
  "access_expires_at": "2026-10-30T13:26:24.509373698Z",
  "refresh_token": "Qk1rvFU5aiQxaJz2obpa5cZKVehfyqNOxuIe6dw3Suw",
  "refresh_expires_at": "2026-10-31T01:11:24.508806614Z",
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
  "session_id": "cc5e96c3-4371-4007-a972-9b8791f047a5",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY3ODUsImlhdCI6MTc5MzM2NTg4NSwianRpIjoiYmU1MzRmMDktY2FmYi00NTVjLTg1ZTEtMzExZmE5NjExNmMxIiwic2lkIjoiY2M1ZTk2YzMtNDM3MS00MDA3LWE5NzItOWI4NzkxZjA0N2E1In0.pDnb08A5uU0_OoyvFU6JFKj3RFhmUOhvtY8uRLFG_4U",
  "access_expires_at": "2026-10-30T13:26:25.13526554Z",
  "refresh_token": "uxypN3xys2JZK2r-lGeaeU4eblnI18Nwi85nWvb_4p4",
  "refresh_expires_at": "2026-10-31T01:11:25.134722652Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
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

`POST /api/admin/v1/staff-extensions/1336b6b8-bb63-4881-8f1f-12487e8176e5` → **200**

```json
{
  "command_id": "71d42287-1063-4a67-9e03-093ad2d94329",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "36089221-e6d2-48f7-9d45-23345a8478cc",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T13:11:26.327559Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T13:11:26.327559Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a45f39f8-1693-487a-a028-29bd90e66420",
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
  "id": "a7226d84-5452-490d-bec9-9192bd22fdc2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:16:26.934627Z",
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
  "command_id": "06fdbeec-4ea6-41c5-8149-5392cd562a2a",
  "quote_id": "a7226d84-5452-490d-bec9-9192bd22fdc2",
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
    "phone": "+380672602317"
  }
}
```

```json
{
  "id": "8dd48263-5d56-4649-8611-418f6203c89c",
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
  "created_at": "2026-10-30T13:11:27.287401Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672602317"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/8dd48263-5d56-4649-8611-418f6203c89c/calls` → **201**

```json
{
  "command_id": "060d6097-5ac9-4c04-8470-f52b996311f6",
  "to": "CALLER"
}
```

```json
{
  "id": "90839b02-af7f-4204-996d-3cafe327b62c",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "order_ids": [
    "8dd48263-5d56-4649-8611-418f6203c89c"
  ],
  "started_at": "2026-10-30T13:11:27.624354Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/8dd48263-5d56-4649-8611-418f6203c89c/calls` → **201**

```json
{
  "command_id": "060d6097-5ac9-4c04-8470-f52b996311f6",
  "to": "CALLER"
}
```

```json
{
  "id": "90839b02-af7f-4204-996d-3cafe327b62c",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "order_ids": [
    "8dd48263-5d56-4649-8611-418f6203c89c"
  ],
  "started_at": "2026-10-30T13:11:27.624354Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "90839b02-af7f-4204-996d-3cafe327b62c",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380672602317",
    "at": "2026-10-30T13:11:27.626778267Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "90839b02-af7f-4204-996d-3cafe327b62c",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.23991",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "90839b02-af7f-4204-996d-3cafe327b62c"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "90839b02-af7f-4204-996d-3cafe327b62c",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=8dd48263-5d56-4649-8611-418f6203c89c` → **200**

```json
{
  "calls": [
    {
      "id": "90839b02-af7f-4204-996d-3cafe327b62c",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
      "order_ids": [
        "8dd48263-5d56-4649-8611-418f6203c89c"
      ],
      "started_at": "2026-10-30T13:11:27.624354Z",
      "answered_at": "2026-10-30T13:11:28.309776Z",
      "ended_at": "2026-10-30T13:11:28.333444Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=8dd48263-5d56-4649-8611-418f6203c89c` → **200**

```json
{
  "calls": [
    {
      "id": "90839b02-af7f-4204-996d-3cafe327b62c",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
      "order_ids": [
        "8dd48263-5d56-4649-8611-418f6203c89c"
      ],
      "started_at": "2026-10-30T13:11:27.624354Z",
      "answered_at": "2026-10-30T13:11:28.309776Z",
      "ended_at": "2026-10-30T13:11:28.333444Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:11:29.296749Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/8dd48263-5d56-4649-8611-418f6203c89c` → **200**

```json
{
  "id": "8dd48263-5d56-4649-8611-418f6203c89c",
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
  "created_at": "2026-10-30T13:11:27.287401Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672602317"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8dd48263-5d56-4649-8611-418f6203c89c/cancel` → **200**

```json
{
  "command_id": "adadd690-f754-4e51-9964-9f52b2d7788d",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "8dd48263-5d56-4649-8611-418f6203c89c",
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
  "created_at": "2026-10-30T13:11:27.287401Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672602317"
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
  "command_id": "99d89655-3f3a-4820-8512-5f0c944585a3",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T13:11:31.597157Z",
  "extension": "101"
}
```

Done: outgoing call 90839b02-af7f-4204-996d-3cafe327b62c from order 8dd48263-5d56-4649-8611-418f6203c89c, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635038534",
  "device_ref": "sandbox-23742"
}
```

```json
{
  "challenge_id": "bf9aac98-e380-4044-b20a-bb352fcdc9ba",
  "expires_at": "2026-10-30T13:16:31.902800363Z",
  "resend_available_at": "2026-10-30T13:11:32.902800363Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635038534` → **200**

```json
{
  "phone": "+380635038534",
  "audience": "CLIENT",
  "code": "028370",
  "sent_at": "2026-10-30T13:11:31.905242502Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf9aac98-e380-4044-b20a-bb352fcdc9ba",
  "code": "028370",
  "device_ref": "sandbox-23742"
}
```

```json
{
  "session_id": "09c2d788-17af-48c5-b25f-1ca9c781fcb2",
  "subject": {
    "type": "CLIENT",
    "id": "ed8e39b0-d98e-4963-99e7-b8dd395bb77b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZDhlMzliMC1kOThlLTQ5NjMtOTllNy1iOGRkMzk1YmI3N2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NzkyLCJpYXQiOjE3OTMzNjU4OTIsImp0aSI6IjVkMjUwM2ZlLTI3ZTctNGU4MS1hMjY2LWY4YTU5YmY3ZDEwMiIsInNpZCI6IjA5YzJkNzg4LTE3YWYtNDhjNS1iMjVmLTFjYTljNzgxZmNiMiJ9.KqbSjuAXNcnnEksg1j8ONN8NFSLbdtu9HFWlT9nr0sA",
  "access_expires_at": "2026-10-30T13:26:32.21672094Z",
  "refresh_token": "5JmDh8yeA8bgBPM5jpoNxC5f01jRG6iihk6owe9K1LQ",
  "refresh_expires_at": "2026-11-29T13:11:32.21615587Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ed8e39b0-d98e-4963-99e7-b8dd395bb77b",
  "session_id": "09c2d788-17af-48c5-b25f-1ca9c781fcb2",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635038534",
  "device_ref": "sandbox-2754"
}
```

```json
{
  "challenge_id": "aa292bc3-ffb0-4ca3-83b8-6bd0580ac6d9",
  "expires_at": "2026-10-30T13:16:34.792987693Z",
  "resend_available_at": "2026-10-30T13:11:35.792987693Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635038534` → **200**

```json
{
  "phone": "+380635038534",
  "audience": "CLIENT",
  "code": "430530",
  "sent_at": "2026-10-30T13:11:34.795415938Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa292bc3-ffb0-4ca3-83b8-6bd0580ac6d9",
  "code": "430530",
  "device_ref": "sandbox-2754"
}
```

```json
{
  "session_id": "ff92539a-ef08-45e9-a048-793f62da3d83",
  "subject": {
    "type": "CLIENT",
    "id": "ed8e39b0-d98e-4963-99e7-b8dd395bb77b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZDhlMzliMC1kOThlLTQ5NjMtOTllNy1iOGRkMzk1YmI3N2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2Nzk1LCJpYXQiOjE3OTMzNjU4OTUsImp0aSI6ImMwYWNhNmI4LTM2YWItNDViOC1iMTMxLWI1ZDk3ODkzN2EzNyIsInNpZCI6ImZmOTI1MzlhLWVmMDgtNDVlOS1hMDQ4LTc5M2Y2MmRhM2Q4MyJ9.atXQRP9YzERtzuQDiVhiNkqFzIfxhUnJemTmz-Kbr_4",
  "access_expires_at": "2026-10-30T13:26:35.105934866Z",
  "refresh_token": "qgtTVm7Xo0aL2gaXDl-nPJpzdQyyiUureA57DSDvpSg",
  "refresh_expires_at": "2026-11-29T13:11:35.105381873Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "0116afe6-a9e8-464a-b73e-372af691496a",
  "expires_at": "2026-10-30T13:16:37.40055458Z",
  "resend_available_at": "2026-10-30T13:11:38.40055458Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635038534` → **200**

```json
{
  "phone": "+380635038534",
  "audience": "CLIENT",
  "code": "891942",
  "sent_at": "2026-10-30T13:11:37.402729206Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380631956375"
}
```

```json
{
  "challenge_id": "e818fc2c-03c1-4392-bb4d-412e989b022b",
  "expires_at": "2026-10-30T13:16:37.706280403Z",
  "resend_available_at": "2026-10-30T13:11:38.706280403Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631956375` → **200**

```json
{
  "phone": "+380631956375",
  "audience": "CLIENT",
  "code": "550876",
  "sent_at": "2026-10-30T13:11:37.708389023Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "08298c3b-a5f4-46a3-9a3b-09f332a3f7b6",
  "current_challenge_id": "0116afe6-a9e8-464a-b73e-372af691496a",
  "current_code": "000000",
  "new_challenge_id": "e818fc2c-03c1-4392-bb4d-412e989b022b",
  "new_code": "550876"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "21c1b620-d192-45ee-9b7c-0ea30f3f6c12"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "750d18be-9cc5-4cbd-89ed-f9d203595160",
  "current_challenge_id": "0116afe6-a9e8-464a-b73e-372af691496a",
  "current_code": "891942",
  "new_challenge_id": "e818fc2c-03c1-4392-bb4d-412e989b022b",
  "new_code": "550876"
}
```

```json
{
  "subject_id": "ed8e39b0-d98e-4963-99e7-b8dd395bb77b",
  "phone": "+380631956375",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ed8e39b0-d98e-4963-99e7-b8dd395bb77b",
  "session_id": "09c2d788-17af-48c5-b25f-1ca9c781fcb2",
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
  "correlation_id": "57b6c93c-f4ea-4400-af4b-dcf138252328"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631956375",
  "device_ref": "sandbox-14834"
}
```

```json
{
  "challenge_id": "1fb60706-d29b-408b-80e2-c9622882cc6a",
  "expires_at": "2026-10-30T13:16:41.183421055Z",
  "resend_available_at": "2026-10-30T13:11:42.183421055Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631956375` → **200**

```json
{
  "phone": "+380631956375",
  "audience": "CLIENT",
  "code": "834774",
  "sent_at": "2026-10-30T13:11:41.186226104Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1fb60706-d29b-408b-80e2-c9622882cc6a",
  "code": "834774",
  "device_ref": "sandbox-14834"
}
```

```json
{
  "session_id": "5bb6dc6d-bd94-440b-9528-540aa6cc573c",
  "subject": {
    "type": "CLIENT",
    "id": "ed8e39b0-d98e-4963-99e7-b8dd395bb77b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZDhlMzliMC1kOThlLTQ5NjMtOTllNy1iOGRkMzk1YmI3N2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2ODAxLCJpYXQiOjE3OTMzNjU5MDEsImp0aSI6IjhjNmNlY2EwLTczYTQtNDZlNi1iYzAwLTNhZDFjZDYxMmFlYyIsInNpZCI6IjViYjZkYzZkLWJkOTQtNDQwYi05NTI4LTU0MGFhNmNjNTczYyJ9.oezHKF4gW1JdweYuC7vJDbRIhBgQUVD8vK2WWU7dCTw",
  "access_expires_at": "2026-10-30T13:26:41.501674552Z",
  "refresh_token": "yJKqkQSO2AkdA2pkuen2cPpe7uTwS_o-WT7SU56kyl8",
  "refresh_expires_at": "2026-11-29T13:11:41.501143581Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ed8e39b0-d98e-4963-99e7-b8dd395bb77b",
  "session_id": "5bb6dc6d-bd94-440b-9528-540aa6cc573c",
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
  "session_id": "d2aa94be-49bb-4cec-9d57-c6dfba52457b",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY4MDIsImlhdCI6MTc5MzM2NTkwMiwianRpIjoiZThhODcyZDgtZGNhMC00NDY4LTk2MmQtNmNkZjQwYTBjN2Q3Iiwic2lkIjoiZDJhYTk0YmUtNDliYi00Y2VjLTlkNTctYzZkZmJhNTI0NTdiIn0.kvlbpSudjpjV5OD0-XO_LCCGzppl8dM-4843TXTZZoo",
  "access_expires_at": "2026-10-30T13:26:42.409007226Z",
  "refresh_token": "gInB55vXkHBpD_ctEauHxZO8sJLlqY0dmoqUeGkkzGI",
  "refresh_expires_at": "2026-10-31T01:11:42.408417729Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/ed8e39b0-d98e-4963-99e7-b8dd395bb77b` → **200**

```json
{
  "client": {
    "id": "ed8e39b0-d98e-4963-99e7-b8dd395bb77b",
    "phone": "+380631956375",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:11:32.214726Z",
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

`POST /api/admin/v1/clients/ed8e39b0-d98e-4963-99e7-b8dd395bb77b/phone/new-code` → **201**

```json
{
  "phone": "+380631399881"
}
```

```json
{
  "challenge_id": "b97189c8-38ce-402b-9fba-ad35d0a5056f",
  "expires_at": "2026-10-30T13:16:43.021838497Z",
  "resend_available_at": "2026-10-30T13:11:44.021838497Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631399881` → **200**

```json
{
  "phone": "+380631399881",
  "audience": "CLIENT",
  "code": "703553",
  "sent_at": "2026-10-30T13:11:43.024441214Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/ed8e39b0-d98e-4963-99e7-b8dd395bb77b/phone` → **422**

```json
{
  "command_id": "5107cb46-0a15-4023-a54d-730dbf74d7a7",
  "expected_version": 3,
  "new_challenge_id": "b97189c8-38ce-402b-9fba-ad35d0a5056f",
  "new_code": "703554",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/ed8e39b0-d98e-4963-99e7-b8dd395bb77b/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "04e79ab0-0b7f-458b-8a63-bcf2fc69b8ff"
}
```

`POST /api/admin/v1/clients/ed8e39b0-d98e-4963-99e7-b8dd395bb77b/phone` → **400**

```json
{
  "command_id": "b319c2df-e757-49f1-8a6d-b8f859cfe3de",
  "expected_version": 3,
  "new_challenge_id": "b97189c8-38ce-402b-9fba-ad35d0a5056f",
  "new_code": "703553",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/ed8e39b0-d98e-4963-99e7-b8dd395bb77b/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "617de3bd-49fa-4a43-94ff-72c5a8b526b3",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/ed8e39b0-d98e-4963-99e7-b8dd395bb77b/phone` → **200**

```json
{
  "command_id": "4cbcb07e-7e82-4db2-8d7b-68a85496177a",
  "expected_version": 3,
  "new_challenge_id": "b97189c8-38ce-402b-9fba-ad35d0a5056f",
  "new_code": "703553",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "ed8e39b0-d98e-4963-99e7-b8dd395bb77b",
  "phone": "+380631399881",
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
  "correlation_id": "c60bbeb4-a043-45eb-bd69-65d31f74ca54"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631399881",
  "device_ref": "sandbox-618"
}
```

```json
{
  "challenge_id": "3d751114-b1f9-48c5-b886-452719b44162",
  "expires_at": "2026-10-30T13:16:44.522782944Z",
  "resend_available_at": "2026-10-30T13:11:45.522782944Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631399881` → **200**

```json
{
  "phone": "+380631399881",
  "audience": "CLIENT",
  "code": "481674",
  "sent_at": "2026-10-30T13:11:44.525217799Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d751114-b1f9-48c5-b886-452719b44162",
  "code": "481674",
  "device_ref": "sandbox-618"
}
```

```json
{
  "session_id": "be57eae1-9f12-4052-b4a8-1dc38de1123f",
  "subject": {
    "type": "CLIENT",
    "id": "ed8e39b0-d98e-4963-99e7-b8dd395bb77b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZDhlMzliMC1kOThlLTQ5NjMtOTllNy1iOGRkMzk1YmI3N2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2ODA0LCJpYXQiOjE3OTMzNjU5MDQsImp0aSI6ImQ0MjE0MzI3LTFlYzItNDZiMy1hMjcwLTNiM2JjNjA2NjMxZiIsInNpZCI6ImJlNTdlYWUxLTlmMTItNDA1Mi1iNGE4LTFkYzM4ZGUxMTIzZiJ9.rfFEMZpTIkbq3H3BLJMOBNT8IbqK4mYFwmaF2imyfTc",
  "access_expires_at": "2026-10-30T13:26:44.841835546Z",
  "refresh_token": "qythNpGQwPtmSOGfjibDgR7is-lf9tiYHNGSKFV9YtA",
  "refresh_expires_at": "2026-11-29T13:11:44.841339186Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ed8e39b0-d98e-4963-99e7-b8dd395bb77b",
  "session_id": "be57eae1-9f12-4052-b4a8-1dc38de1123f",
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
  "phone": "+380630136050",
  "device_ref": "sandbox-27788"
}
```

```json
{
  "challenge_id": "2c4f6623-fadd-4e1e-b599-7c7afc9f81c1",
  "expires_at": "2026-10-30T13:16:45.415077412Z",
  "resend_available_at": "2026-10-30T13:11:46.415077412Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630136050` → **200**

```json
{
  "phone": "+380630136050",
  "audience": "CLIENT",
  "code": "715004",
  "sent_at": "2026-10-30T13:11:45.41766393Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2c4f6623-fadd-4e1e-b599-7c7afc9f81c1",
  "code": "715004",
  "device_ref": "sandbox-27788"
}
```

```json
{
  "session_id": "019bf46e-32cb-43c5-8b2b-04376ca79220",
  "subject": {
    "type": "CLIENT",
    "id": "9d90ca7e-77db-4fe4-ad81-18239137cf28"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDkwY2E3ZS03N2RiLTRmZTQtYWQ4MS0xODIzOTEzN2NmMjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2ODA1LCJpYXQiOjE3OTMzNjU5MDUsImp0aSI6Ijg3ZDY4Yjg5LTQzMTEtNGVmMy05NWU1LTliMGMwMmJlMDViOSIsInNpZCI6IjAxOWJmNDZlLTMyY2ItNDNjNS04YjJiLTA0Mzc2Y2E3OTIyMCJ9.W77MCqxnEB5p4Aj5XsKlr5E5ClIbBUicabHq6VHXb_0",
  "access_expires_at": "2026-10-30T13:26:45.734036301Z",
  "refresh_token": "lF9TwfbeJlbzqKES7rC9Rmhsqmufr_6vvTVVW3vJp1M",
  "refresh_expires_at": "2026-11-29T13:11:45.733509046Z",
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
  "session_id": "a68848a5-5403-4064-8b16-9379da94cd5b",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY4MDYsImlhdCI6MTc5MzM2NTkwNiwianRpIjoiODQ2OTM2MTItZjRkYS00ZDg3LTk2OTQtODllNDE0ZDk2MmZiIiwic2lkIjoiYTY4ODQ4YTUtNTQwMy00MDY0LThiMTYtOTM3OWRhOTRjZDViIn0.vxmzy-TadIH-qLoChrO50g9-g7mvKLq0TPfUnmYsI9I",
  "access_expires_at": "2026-10-30T13:26:46.954629791Z",
  "refresh_token": "5u4oylz_AGlM4X035GxddETrnOCrovk3NnR3iNyUq_k",
  "refresh_expires_at": "2026-10-31T01:11:46.954123777Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380630136050` → **200**

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
  "correlation_id": "d7c48599-5a36-4c0d-b3b1-7779ad7bfe17"
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
  "session_id": "7d7263a9-f6bc-4634-9990-63803b0c55d2",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY4MDgsImlhdCI6MTc5MzM2NTkwOCwianRpIjoiYTk0N2M0NGUtNjY4ZC00OTkxLWE4YTItODQyYmNjZDY3ZTNkIiwic2lkIjoiN2Q3MjYzYTktZjZiYy00NjM0LTk5OTAtNjM4MDNiMGM1NWQyIn0.61R8rYj6T57wL3MOapLgpyFlP8d-aH5C0hwjLAYmDS4",
  "access_expires_at": "2026-10-30T13:26:48.181662617Z",
  "refresh_token": "OiokZaWsNbkVSH6NLHsQ1IQOwkWBXtncwN8PhCcTLiw",
  "refresh_expires_at": "2026-10-31T01:11:48.181131386Z",
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
  "changed_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T12:57:30.318096Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "fe824645-099a-4a63-817d-b7a9849b8c33",
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
  "changed_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T13:11:48.769081691Z"
}
```

## The rider books the airport for 2026-10-30T16:11:47Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600771521",
  "device_ref": "sandbox-19869"
}
```

```json
{
  "challenge_id": "4ded4169-386c-45fa-95ba-6130956d41a0",
  "expires_at": "2026-10-30T13:16:49.08142513Z",
  "resend_available_at": "2026-10-30T13:11:50.08142513Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600771521` → **200**

```json
{
  "phone": "+48600771521",
  "audience": "CLIENT",
  "code": "123751",
  "sent_at": "2026-10-30T13:11:49.083842753Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4ded4169-386c-45fa-95ba-6130956d41a0",
  "code": "123751",
  "device_ref": "sandbox-19869"
}
```

```json
{
  "session_id": "3e137891-a409-4d0b-96d4-4c5375311a86",
  "subject": {
    "type": "CLIENT",
    "id": "dfab4886-29c0-427f-87d4-064b078cddd8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZmFiNDg4Ni0yOWMwLTQyN2YtODdkNC0wNjRiMDc4Y2RkZDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2ODA5LCJpYXQiOjE3OTMzNjU5MDksImp0aSI6IjVjODQyNDg4LTk1ZjAtNGQyNy05ZjRhLTEwZjE5NjQzY2E0YSIsInNpZCI6IjNlMTM3ODkxLWE0MDktNGQwYi05NmQ0LTRjNTM3NTMxMWE4NiJ9.6tIAYZKT2jWrVhQJY1dJ7pncq3hSM1PMgHOU29EohL0",
  "access_expires_at": "2026-10-30T13:26:49.407974595Z",
  "refresh_token": "UUjW0K9mfuT0xmp72g8xTugZbi95989ov6wKia7Qox8",
  "refresh_expires_at": "2026-11-29T13:11:49.407281802Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "679bf8c1-c16e-42f9-b7f8-284c14260c60",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T16:11:47Z"
}
```

```json
{
  "id": "fec0964b-15d8-4266-aee1-245c9446caff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:16:49.701973Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T16:11:47Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "75ab9883-b36d-42ba-b805-67a1d6964a69",
  "quote_id": "fec0964b-15d8-4266-aee1-245c9446caff",
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
  "pickup_at": "2026-10-30T16:11:47Z"
}
```

```json
{
  "id": "634edb1f-3a79-426a-b889-95150433183b",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "dfab4886-29c0-427f-87d4-064b078cddd8",
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
  "created_at": "2026-10-30T13:11:49.999187Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T16:11:47Z",
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
  "device_ref": "sandbox-3348"
}
```

```json
{
  "challenge_id": "cd18d6b2-8524-4de8-b436-18f2bb6675b1",
  "expires_at": "2026-10-30T13:16:50.300665671Z",
  "resend_available_at": "2026-10-30T13:11:51.300665671Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "708933",
  "sent_at": "2026-10-30T13:11:50.30308747Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd18d6b2-8524-4de8-b436-18f2bb6675b1",
  "code": "708933",
  "device_ref": "sandbox-3348"
}
```

```json
{
  "session_id": "95f4e508-8a00-40fe-89f8-bd4856e0185f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjgxMCwiaWF0IjoxNzkzMzY1OTEwLCJqdGkiOiI5NDhlNGMwMC0wMjA3LTQ4ODYtOGIzOS1iYjhlY2ZhNzI3ZmYiLCJzaWQiOiI5NWY0ZTUwOC04YTAwLTQwZmUtODlmOC1iZDQ4NTZlMDE4NWYifQ.rvW6xSpPrwGSwUupgy37sktwotRa9Xj5s7WoAnE8n4s",
  "access_expires_at": "2026-10-30T13:26:50.616410087Z",
  "refresh_token": "hC-KNfj_mzpege1GdV7muItfZjE-G_1bSAFHjhX9QyE",
  "refresh_expires_at": "2026-11-29T13:11:50.615927869Z",
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
  "command_id": "88fa32b9-6b72-431c-a1ce-bb018103ac3c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:11:51Z",
    "sequence": 1793365911208
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "afc44886-d76b-41ec-849b-98cd20cc1866",
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
  "last_heartbeat_at": "2026-10-30T13:11:51.228024Z",
  "last_location_at": "2026-10-30T13:11:51.228024Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "634edb1f-3a79-426a-b889-95150433183b",
      "short_number": 25,
      "pickup_at": "2026-10-30T16:11:47Z",
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

`POST /api/driver/v1/preorders/634edb1f-3a79-426a-b889-95150433183b/reserve` → **200**

```json
{
  "command_id": "4701195f-4581-48b7-948c-e7582b24fee0"
}
```

```json
{
  "id": "f72104e6-bc42-4ec0-ad23-e011e6281eb6",
  "state": "RESERVED",
  "order": {
    "order_id": "634edb1f-3a79-426a-b889-95150433183b",
    "short_number": 25,
    "pickup_at": "2026-10-30T16:11:47Z",
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
  "reserved_at": "2026-10-30T13:11:51.817482Z",
  "confirm_from": "2026-10-30T15:41:47Z",
  "confirm_until": "2026-10-30T15:51:47Z",
  "drop_until": "2026-10-30T15:11:47Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "f72104e6-bc42-4ec0-ad23-e011e6281eb6",
      "state": "RESERVED",
      "order": {
        "order_id": "634edb1f-3a79-426a-b889-95150433183b",
        "short_number": 25,
        "pickup_at": "2026-10-30T16:11:47Z",
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
      "reserved_at": "2026-10-30T13:11:51.817482Z",
      "confirm_from": "2026-10-30T15:41:47Z",
      "confirm_until": "2026-10-30T15:51:47Z",
      "drop_until": "2026-10-30T15:11:47Z"
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
      "id": "f72104e6-bc42-4ec0-ad23-e011e6281eb6",
      "state": "RESERVED",
      "order": {
        "order_id": "634edb1f-3a79-426a-b889-95150433183b",
        "short_number": 25,
        "pickup_at": "2026-10-30T16:11:47Z",
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
      "reserved_at": "2026-10-30T13:11:51.817482Z",
      "confirm_from": "2026-10-30T15:41:47Z",
      "confirm_until": "2026-10-30T15:51:47Z",
      "drop_until": "2026-10-30T15:11:47Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/f72104e6-bc42-4ec0-ad23-e011e6281eb6/confirm` → **409**

```json
{
  "command_id": "f773fcbd-3a5c-42c4-b75c-aab021cdcbb2"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/f72104e6-bc42-4ec0-ad23-e011e6281eb6/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c32d76d5-985c-47a4-a30d-12201767424e"
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
  "session_id": "8933d303-02da-479f-9abb-b859774b1fa0",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY4MTMsImlhdCI6MTc5MzM2NTkxMywianRpIjoiNTQxOTYwYjYtYTJmZC00ZjMzLThhZGMtMzI5YTRhZDQ2ZDg1Iiwic2lkIjoiODkzM2QzMDMtMDJkYS00NzlmLTlhYmItYjg1OTc3NGIxZmEwIn0.WwcgCfb_WxbhXRgqZX2lpVHrekC2efbOv931Q0HTQC8",
  "access_expires_at": "2026-10-30T13:26:53.304270337Z",
  "refresh_token": "PWNmmQD1rhgI1H1YBRDOIY296vk73CyTlvvPnTNNLcI",
  "refresh_expires_at": "2026-10-31T01:11:53.303761429Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/634edb1f-3a79-426a-b889-95150433183b` → **200**

```json
{
  "id": "634edb1f-3a79-426a-b889-95150433183b",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "dfab4886-29c0-427f-87d4-064b078cddd8",
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
  "created_at": "2026-10-30T13:11:49.999187Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T16:11:47Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "f72104e6-bc42-4ec0-ad23-e011e6281eb6",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T13:11:51.817482Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/634edb1f-3a79-426a-b889-95150433183b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T13:11:50.000231Z",
      "actor": {
        "type": "CLIENT",
        "id": "dfab4886-29c0-427f-87d4-064b078cddd8",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "634edb1f-3a79-426a-b889-95150433183b",
        "preorder": true,
        "quote_id": "fec0964b-15d8-4266-aee1-245c9446caff",
        "pickup_at": "2026-10-30T16:11:47Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "16b0b68e-7b83-4d8e-b786-2d86e3ef7850"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T13:11:51.818582Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "634edb1f-3a79-426a-b889-95150433183b",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "f72104e6-bc42-4ec0-ad23-e011e6281eb6"
      },
      "correlation_id": "9908686b-563d-4ca8-ac41-bfed2917f5f6"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 634edb1f-3a79-426a-b889-95150433183b, reservation f72104e6-bc42-4ec0-ad23-e011e6281eb6.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-32351"
}
```

```json
{
  "challenge_id": "58a48387-bb96-471d-85e2-12690a53116e",
  "expires_at": "2026-10-30T13:16:54.187144596Z",
  "resend_available_at": "2026-10-30T13:11:55.187144596Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "887822",
  "sent_at": "2026-10-30T13:11:54.190361283Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "58a48387-bb96-471d-85e2-12690a53116e",
  "code": "887822",
  "device_ref": "sandbox-32351"
}
```

```json
{
  "session_id": "8cda287c-dc9e-48dc-b086-31acc506fc48",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjgxNCwiaWF0IjoxNzkzMzY1OTE0LCJqdGkiOiJhZWI2MGIwNy01NDNjLTQ5MDAtOTYxZS1iMzc1MzJlYTRhYTAiLCJzaWQiOiI4Y2RhMjg3Yy1kYzllLTQ4ZGMtYjA4Ni0zMWFjYzUwNmZjNDgifQ.i3SgsZF65zuU2VYHSazzUAaZKdeePREHtB2eWqKk1Cs",
  "access_expires_at": "2026-10-30T13:26:54.513037812Z",
  "refresh_token": "hjelFjnN4T9Ozn7UHnxnb3Gf-rH1CYa24sIooADEcuA",
  "refresh_expires_at": "2026-11-29T13:11:54.512538058Z",
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
  "command_id": "344e3817-1bf5-4420-88bb-8d384e7129b7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:11:55Z",
    "sequence": 1793365915931
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "61d0596a-51ac-4764-9125-dd8fe07e96a0",
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
  "last_heartbeat_at": "2026-10-30T13:11:55.111686Z",
  "last_location_at": "2026-10-30T13:11:55.111686Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679264668",
  "device_ref": "sandbox-7849"
}
```

```json
{
  "challenge_id": "f66ae8d8-be50-489f-a404-028ed1bfdcf6",
  "expires_at": "2026-10-30T13:16:55.405812356Z",
  "resend_available_at": "2026-10-30T13:11:56.405812356Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679264668` → **200**

```json
{
  "phone": "+380679264668",
  "audience": "CLIENT",
  "code": "464396",
  "sent_at": "2026-10-30T13:11:55.408294879Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f66ae8d8-be50-489f-a404-028ed1bfdcf6",
  "code": "464396",
  "device_ref": "sandbox-7849"
}
```

```json
{
  "session_id": "0b3ae04f-79b1-4071-90f6-e87d2a93195a",
  "subject": {
    "type": "CLIENT",
    "id": "5c84009a-cd59-43cc-996d-f656764d4352"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1Yzg0MDA5YS1jZDU5LTQzY2MtOTk2ZC1mNjU2NzY0ZDQzNTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2ODE1LCJpYXQiOjE3OTMzNjU5MTUsImp0aSI6ImRmYjFlNWUxLTRkZGUtNGM4Ny04MWRmLTBlMTI2MjQ3ZWFlZSIsInNpZCI6IjBiM2FlMDRmLTc5YjEtNDA3MS05MGY2LWU4N2QyYTkzMTk1YSJ9.KCadM4ONBDdlPUPyjmcwAxxdRRS_g7tqa27I33i2R90",
  "access_expires_at": "2026-10-30T13:26:55.729677845Z",
  "refresh_token": "wAnncEWe4_T6QkLZk99Icnf-9B4iRDx7b5d2oHzJn60",
  "refresh_expires_at": "2026-11-29T13:11:55.729007309Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "84d2cb94-8b52-486f-8d81-d828113f0a3d",
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
  "id": "9a6909d0-25bd-42cc-a759-b9b83f64121c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:16:56.031468Z",
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
  "command_id": "1d545940-7ac1-45f9-b45a-bc4c2176b26d",
  "quote_id": "9a6909d0-25bd-42cc-a759-b9b83f64121c",
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
  "id": "72175aa6-393d-4557-bcf2-432ec81884f0",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5c84009a-cd59-43cc-996d-f656764d4352",
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
  "created_at": "2026-10-30T13:11:56.3431Z",
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
    "id": "2711b879-eb48-4ac9-a178-cebe19dc4e07",
    "order_id": "72175aa6-393d-4557-bcf2-432ec81884f0",
    "expires_at": "2026-10-30T13:12:11.34627Z",
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

`POST /api/driver/v1/offers/2711b879-eb48-4ac9-a178-cebe19dc4e07/accept` → **200**

```json
{
  "command_id": "4160ea02-5132-41a5-85e2-156709dd494b"
}
```

```json
{
  "id": "e9c698eb-5f52-433f-b9c3-63cfe5c3e442",
  "order_id": "72175aa6-393d-4557-bcf2-432ec81884f0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b81f67c5-c0a4-45be-8d9c-c24603773b61",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b81f67c5-c0a4-45be-8d9c-c24603773b61",
  "order_id": "72175aa6-393d-4557-bcf2-432ec81884f0",
  "assignment_id": "e9c698eb-5f52-433f-b9c3-63cfe5c3e442",
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

`POST /api/driver/v1/work-sessions/61d0596a-51ac-4764-9125-dd8fe07e96a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:11:57Z",
    "sequence": 1793365917519
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "61d0596a-51ac-4764-9125-dd8fe07e96a0",
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
  "last_heartbeat_at": "2026-10-30T13:11:57.537807Z",
  "last_location_at": "2026-10-30T13:11:57.537807Z",
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
  "id": "b81f67c5-c0a4-45be-8d9c-c24603773b61",
  "order_id": "72175aa6-393d-4557-bcf2-432ec81884f0",
  "assignment_id": "e9c698eb-5f52-433f-b9c3-63cfe5c3e442",
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

`POST /api/driver/v1/trips/b81f67c5-c0a4-45be-8d9c-c24603773b61/arrive` → **200**

```json
{
  "command_id": "85ff31a2-a432-4dac-8b48-761e33a4047d",
  "expected_version": 0
}
```

```json
{
  "id": "b81f67c5-c0a4-45be-8d9c-c24603773b61",
  "order_id": "72175aa6-393d-4557-bcf2-432ec81884f0",
  "assignment_id": "e9c698eb-5f52-433f-b9c3-63cfe5c3e442",
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
  "arrived_at": "2026-10-30T13:11:58.110071Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b81f67c5-c0a4-45be-8d9c-c24603773b61/start` → **200**

```json
{
  "command_id": "0ced17c7-489b-495a-87a6-76b4baed5c91",
  "expected_version": 1
}
```

```json
{
  "id": "b81f67c5-c0a4-45be-8d9c-c24603773b61",
  "order_id": "72175aa6-393d-4557-bcf2-432ec81884f0",
  "assignment_id": "e9c698eb-5f52-433f-b9c3-63cfe5c3e442",
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
  "arrived_at": "2026-10-30T13:11:58.110071Z",
  "started_at": "2026-10-30T13:11:58.39729Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/61d0596a-51ac-4764-9125-dd8fe07e96a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:12:46Z",
    "sequence": 1793365966710
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "61d0596a-51ac-4764-9125-dd8fe07e96a0",
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
  "last_heartbeat_at": "2026-10-30T13:12:46.729187Z",
  "last_location_at": "2026-10-30T13:12:46.729187Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/b81f67c5-c0a4-45be-8d9c-c24603773b61/complete` → **200**

```json
{
  "command_id": "14cdcedf-bf0a-4112-a5cf-d5edacf525a3",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:12:47Z",
  "cash_received": true
}
```

```json
{
  "id": "b81f67c5-c0a4-45be-8d9c-c24603773b61",
  "order_id": "72175aa6-393d-4557-bcf2-432ec81884f0",
  "assignment_id": "e9c698eb-5f52-433f-b9c3-63cfe5c3e442",
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
  "arrived_at": "2026-10-30T13:11:58.110071Z",
  "started_at": "2026-10-30T13:11:58.39729Z",
  "completed_at": "2026-10-30T13:12:47.023875Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/72175aa6-393d-4557-bcf2-432ec81884f0/rating` → **200**

```json
{
  "command_id": "946d5038-b3ca-4e0b-ba91-64787f2b39be",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "72175aa6-393d-4557-bcf2-432ec81884f0",
  "score": 5,
  "created_at": "2026-10-30T13:12:47.341949448Z"
}
```

`POST /api/driver/v1/orders/72175aa6-393d-4557-bcf2-432ec81884f0/rating` → **200**

```json
{
  "command_id": "4f4f405d-0691-4935-9df9-6984e51f617d",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "72175aa6-393d-4557-bcf2-432ec81884f0",
  "score": 4,
  "created_at": "2026-10-30T13:12:47.640952132Z"
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
  "session_id": "30a94c96-9e7f-4aa3-a5e9-09a30f2eb0a9",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY4NjgsImlhdCI6MTc5MzM2NTk2OCwianRpIjoiMzY3NzA2N2QtYjBhNC00MWU1LTljODUtNTgwMGZjYmU3Y2Q3Iiwic2lkIjoiMzBhOTRjOTYtOWU3Zi00YWEzLWE1ZTktMDlhMzBmMmViMGE5In0.td4F9ndVTT0r6aeibQGLDEMiGqiCriR2UK1bn4rUM-U",
  "access_expires_at": "2026-10-30T13:27:48.562592919Z",
  "refresh_token": "G0eJtprVnKrPSNfCz6Mtsq1Idzm2VI1MuiTq4Crx794",
  "refresh_expires_at": "2026-10-31T01:12:48.561999276Z",
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
  "session_id": "a93b01fe-2ca4-41b8-9548-b2e86e0574a4",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY4NjksImlhdCI6MTc5MzM2NTk2OSwianRpIjoiYzg1ZGIyMmItNjI1OC00ZjUxLWE1OGMtMzk5M2FiZjA0MDA1Iiwic2lkIjoiYTkzYjAxZmUtMmNhNC00MWI4LTk1NDgtYjJlODZlMDU3NGE0In0.7es_0-LAL9OZgIAV0zIbwSvwV3o-Kyu8lYyV2gAGqJk",
  "access_expires_at": "2026-10-30T13:27:49.189383288Z",
  "refresh_token": "llj74ve1z9HuhM_EGi9bVfAw9-fDDqo6bZi409mLe74",
  "refresh_expires_at": "2026-10-31T01:12:49.188824917Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/72175aa6-393d-4557-bcf2-432ec81884f0/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "72175aa6-393d-4557-bcf2-432ec81884f0",
      "author_type": "RIDER",
      "author_id": "5c84009a-cd59-43cc-996d-f656764d4352",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T13:12:47.341949Z"
    },
    {
      "order_id": "72175aa6-393d-4557-bcf2-432ec81884f0",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "5c84009a-cd59-43cc-996d-f656764d4352",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T13:12:47.640952Z"
    }
  ]
}
```

Done: ratings for order 72175aa6-393d-4557-bcf2-432ec81884f0.

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
  "session_id": "9a77fe9a-a9f6-49da-a647-721ae84ebc89",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY4NzAsImlhdCI6MTc5MzM2NTk3MCwianRpIjoiNmRhOTBjZDUtZWZhNy00YmMyLTk1ZGQtNGJmOWJmNjZkODM2Iiwic2lkIjoiOWE3N2ZlOWEtYTlmNi00OWRhLWE2NDctNzIxYWU4NGViYzg5In0.y0421db-peFW77rs2n04v_l8JGrTpyXQLKcCWOBS8Pg",
  "access_expires_at": "2026-10-30T13:27:50.149767163Z",
  "refresh_token": "SAf4fIgfXJw_IZdiQrsssnEvdfH1KlXwtPp34GRP36M",
  "refresh_expires_at": "2026-10-31T01:12:50.149162254Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "3c9177b3-101c-47f9-b3ba-6c580516454f",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "52916a92-67e6-42c2-8ee4-664a12360ddc",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:12:50.460269Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/52916a92-67e6-42c2-8ee4-664a12360ddc` → **200**

```json
{
  "id": "52916a92-67e6-42c2-8ee4-664a12360ddc",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:12:50.460269Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/52916a92-67e6-42c2-8ee4-664a12360ddc` → **200**

```json
{
  "id": "52916a92-67e6-42c2-8ee4-664a12360ddc",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:12:50.460269Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/52916a92-67e6-42c2-8ee4-664a12360ddc` → **200**

```json
{
  "id": "52916a92-67e6-42c2-8ee4-664a12360ddc",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:12:50.460269Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/52916a92-67e6-42c2-8ee4-664a12360ddc` → **200**

```json
{
  "id": "52916a92-67e6-42c2-8ee4-664a12360ddc",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T13:12:50.460269Z",
  "ready_at": "2026-10-30T13:12:54.430274Z",
  "expires_at": "2026-10-31T13:12:54.430274Z"
}
```

`GET /api/admin/v1/reports/exports/52916a92-67e6-42c2-8ee4-664a12360ddc/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "a85d7837-92a0-4eac-857d-208df7a45852",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "08674f14-a841-4833-b7b0-8ffe46b9ae21",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:12:54.955619Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/08674f14-a841-4833-b7b0-8ffe46b9ae21` → **200**

```json
{
  "id": "08674f14-a841-4833-b7b0-8ffe46b9ae21",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:12:54.955619Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/08674f14-a841-4833-b7b0-8ffe46b9ae21` → **200**

```json
{
  "id": "08674f14-a841-4833-b7b0-8ffe46b9ae21",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:12:54.955619Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/08674f14-a841-4833-b7b0-8ffe46b9ae21` → **200**

```json
{
  "id": "08674f14-a841-4833-b7b0-8ffe46b9ae21",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:12:54.955619Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/08674f14-a841-4833-b7b0-8ffe46b9ae21` → **200**

```json
{
  "id": "08674f14-a841-4833-b7b0-8ffe46b9ae21",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:12:54.955619Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/08674f14-a841-4833-b7b0-8ffe46b9ae21` → **200**

```json
{
  "id": "08674f14-a841-4833-b7b0-8ffe46b9ae21",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T13:12:54.955619Z",
  "ready_at": "2026-10-30T13:12:59.438335Z",
  "expires_at": "2026-10-31T13:12:59.438335Z"
}
```

`GET /api/admin/v1/reports/exports/08674f14-a841-4833-b7b0-8ffe46b9ae21/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/5d27e9c9-fad5-40e9-8f4a-db0c3905c2da` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/5d27e9c9-fad5-40e9-8f4a-db0c3905c2da",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b8bde1ed-52cc-48ee-bfab-249df397f7fb"
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
  "session_id": "220b981d-308b-4fb9-ac4e-fb9e11d30d28",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY4ODEsImlhdCI6MTc5MzM2NTk4MSwianRpIjoiOWMxM2M0YWUtYzVhOS00OWIxLTk5MGYtYjkzMTNhMGIxNzNiIiwic2lkIjoiMjIwYjk4MWQtMzA4Yi00ZmI5LWFjNGUtZmI5ZTExZDMwZDI4In0.s45fGjjRUP_qKFuojPiocHGtFOBKAOAgg1klWX11BTc",
  "access_expires_at": "2026-10-30T13:28:01.383079519Z",
  "refresh_token": "w-098n2ew8dStf16W47chJqM7jW3j5TU6jlwd6dsisY",
  "refresh_expires_at": "2026-10-31T01:13:01.382545883Z",
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
  "command_id": "39020b96-8d6a-478f-bbc3-9c1a2e5dc3bb",
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
  "changed_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T13:13:01.985131842Z"
}
```

`POST /sandbox/v1/retention/fixtures/5bd889d0-b85d-40ee-8cdf-441693c4a0f1` → **200**

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

`GET /sandbox/v1/retention/fixtures/5bd889d0-b85d-40ee-8cdf-441693c4a0f1` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/5bd889d0-b85d-40ee-8cdf-441693c4a0f1` → **204**

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
  "changed_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T13:13:01.985132Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "416e8f2c-7bf9-4493-9e09-0d2b99ec62ed",
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
  "changed_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T13:13:02.710043646Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-21927"
}
```

```json
{
  "challenge_id": "aa9abec4-8118-4a2c-abab-1e98917b9e2d",
  "expires_at": "2026-10-30T13:18:03.014562374Z",
  "resend_available_at": "2026-10-30T13:13:04.014562374Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "108862",
  "sent_at": "2026-10-30T13:13:03.017392106Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa9abec4-8118-4a2c-abab-1e98917b9e2d",
  "code": "108862",
  "device_ref": "sandbox-21927"
}
```

```json
{
  "session_id": "be2eecdb-803f-41ce-946d-4c76c27f9781",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Njg4MywiaWF0IjoxNzkzMzY1OTgzLCJqdGkiOiI1Y2FiZWM3Ny1iMGY2LTQ2MjItOWFmNy04YzRlMzBlNmU0MzYiLCJzaWQiOiJiZTJlZWNkYi04MDNmLTQxY2UtOTQ2ZC00Yzc2YzI3Zjk3ODEifQ.prc94pWAd_DuAxzZJMY-UpadhmXY6Uwe-ZrCaFTliaw",
  "access_expires_at": "2026-10-30T13:28:03.335511253Z",
  "refresh_token": "Rzrd8ZNdRwhj7QVHcmEdADUlW7eXpj14MxCGkJyDY9c",
  "refresh_expires_at": "2026-11-29T13:13:03.334977211Z",
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
  "command_id": "56d7c713-bf69-4b9b-9b0d-f2397c95c705",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:13:04Z",
    "sequence": 1793365984212
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "30a29e2d-7f87-466f-9131-05695299c782",
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
  "last_heartbeat_at": "2026-10-30T13:13:04.230795Z",
  "last_location_at": "2026-10-30T13:13:04.230795Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "11754078-6cbe-4cab-b251-5f2fa02dd64f",
  "points": [
    {
      "sequence": 1793365986529,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T13:12:06Z"
    },
    {
      "sequence": 1793365986538,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T13:13:06Z"
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
  "session_id": "a555b4de-17bf-4c8d-9630-e0dcd8577dbb",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY4ODcsImlhdCI6MTc5MzM2NTk4NywianRpIjoiZmFlNWQ2NzUtZTY4ZS00MDZkLWJmOWUtM2Y3MDRjYzEwNDQwIiwic2lkIjoiYTU1NWI0ZGUtMTdiZi00YzhkLTk2MzAtZTBkY2Q4NTc3ZGJiIn0.egI1rKkEeZcljqbrheQNuQ1wOSFB1iP-53gr_lO-3Iw",
  "access_expires_at": "2026-10-30T13:28:07.203725471Z",
  "refresh_token": "DKzyPvG57XkB7iyTZRZfaPLvJyLhAu_R0hrNtWmDYDc",
  "refresh_expires_at": "2026-10-31T01:13:07.203210885Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "d0c7af8d-5cf9-4d09-98ef-f90fbd925788",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T13:13:06Z",
        "track_point_id": "e3d381d6-5d28-494d-8379-bd103c210e93",
        "work_session_id": "30a29e2d-7f87-466f-9131-05695299c782"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T13:13:06Z",
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

`POST /api/admin/v1/driver-risk-flags/d0c7af8d-5cf9-4d09-98ef-f90fbd925788/confirm` → **200**

```json
{
  "command_id": "59939ca2-3c53-40d6-a741-7f0bb70e258a",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "d0c7af8d-5cf9-4d09-98ef-f90fbd925788",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T13:13:06Z",
    "track_point_id": "e3d381d6-5d28-494d-8379-bd103c210e93",
    "work_session_id": "30a29e2d-7f87-466f-9131-05695299c782"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T13:13:06Z",
  "reason": null,
  "reviewed_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "reviewed_at": "2026-10-30T13:13:08.119015Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/d0c7af8d-5cf9-4d09-98ef-f90fbd925788/dismiss` → **409**

```json
{
  "command_id": "d14ef6e9-0615-4666-ba98-ab2063a1df57",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/d0c7af8d-5cf9-4d09-98ef-f90fbd925788/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a79a6ce5-9393-4bff-8f03-4abbbc8d131e"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "510bc9db-f621-46c3-8ae9-0a1f603a95ef",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "c4aad8ec-c4a9-49f6-8a82-f478537ddadf",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "raised_at": "2026-10-30T13:13:08.734386Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/c4aad8ec-c4a9-49f6-8a82-f478537ddadf/dismiss` → **200**

```json
{
  "command_id": "ec4456d0-9028-4f6e-b3e2-56a978839323",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "c4aad8ec-c4a9-49f6-8a82-f478537ddadf",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "raised_at": "2026-10-30T13:13:08.734386Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "reviewed_at": "2026-10-30T13:13:09.041237Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "0a328645-9bf5-4c1d-9301-5aaa4be6c646",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "d0c7af8d-5cf9-4d09-98ef-f90fbd925788"
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
      "actor_id": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T13:13:09.348498Z"
    }
  ],
  "duplicates": []
}
```

Done: flag d0c7af8d-5cf9-4d09-98ef-f90fbd925788 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "4a0b9745-7f04-4e76-af22-71c7f709a0c6",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY4OTAsImlhdCI6MTc5MzM2NTk5MCwianRpIjoiNjliZTYxYzEtMGViMC00Y2E4LTg1ZDEtYzFiMDdiNTQxYzNhIiwic2lkIjoiNGEwYjk3NDUtN2YwNC00ZTc2LWFmMjItNzFjN2Y3MDlhMGM2In0.zpHne5HTOvOIp4k9BF49rIv5gS6o3gJfglaWDXUaMOE",
  "access_expires_at": "2026-10-30T13:28:10.294373006Z",
  "refresh_token": "Jjtj86jmnHOA-Ui1oW-8bPWiVXLJ40yX9j7kfQo1lw4",
  "refresh_expires_at": "2026-10-31T01:13:10.293628732Z",
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
      "actor_id": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T13:13:09.348498Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "3bab802c-348c-419c-936e-803b3a25f4ce",
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
  "session_id": "30a29e2d-7f87-466f-9131-05695299c782",
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
  "last_heartbeat_at": "2026-10-30T13:13:04.230795Z",
  "last_location_at": "2026-10-30T13:13:04.230795Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/30a29e2d-7f87-466f-9131-05695299c782/close` → **200**

```json
{
  "command_id": "56203c0a-5853-4f03-99f3-e4fb56dd5c05",
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
  "session_id": "3edbaf77-ea4c-401f-aa1e-6039e9fe4998",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY4OTIsImlhdCI6MTc5MzM2NTk5MiwianRpIjoiMTliMDViMDgtZmIzNS00MDdlLWI2MzQtYzE0YjA5ZjdhM2VhIiwic2lkIjoiM2VkYmFmNzctZWE0Yy00MDFmLWFhMWUtNjAzOWU5ZmU0OTk4In0.4r9UuNHGIt93TUPG8is-Yr2IxE1iQONDSCqoxp-tlkU",
  "access_expires_at": "2026-10-30T13:28:12.130897713Z",
  "refresh_token": "ieeaFk3tHj19TfgF-ipWR6oBQtO-yecHg41rmtQFWws",
  "refresh_expires_at": "2026-10-31T01:13:12.130368125Z",
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
  "command_id": "1da5be0c-ffcd-4f84-ac8a-cb9545b787c3",
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
  "changed_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T13:13:12.752764Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "1da5be0c-ffcd-4f84-ac8a-cb9545b787c3",
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
  "changed_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T13:13:12.752764Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48128395236",
  "device_ref": "sandbox-19546"
}
```

```json
{
  "challenge_id": "9281dff2-395a-4f51-9f93-0fe219e6e4d3",
  "expires_at": "2026-10-30T13:18:13.354155641Z",
  "resend_available_at": "2026-10-30T13:13:14.354155641Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48128395236` → **200**

```json
{
  "phone": "+48128395236",
  "audience": "CLIENT",
  "code": "467241",
  "sent_at": "2026-10-30T13:13:13.356641403Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9281dff2-395a-4f51-9f93-0fe219e6e4d3",
  "code": "467241",
  "device_ref": "sandbox-19546"
}
```

```json
{
  "session_id": "55c9f242-c9fa-4b62-8bc0-849d214f63ac",
  "subject": {
    "type": "CLIENT",
    "id": "c0120b01-f0b1-4e84-b5f5-43a095e117a0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMDEyMGIwMS1mMGIxLTRlODQtYjVmNS00M2EwOTVlMTE3YTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2ODkzLCJpYXQiOjE3OTMzNjU5OTMsImp0aSI6IjYyZjQ3YzE1LWExZGEtNGM5Yi04M2FhLWNjZTM2YjllOTA3MSIsInNpZCI6IjU1YzlmMjQyLWM5ZmEtNGI2Mi04YmMwLTg0OWQyMTRmNjNhYyJ9.YMbgXfOvvT1VIUvkR3V5bdh8_Dhnp_sqG-41iQQnzlc",
  "access_expires_at": "2026-10-30T13:28:13.671665479Z",
  "refresh_token": "ZJDuH_VEGvHLtOP-rODtsMOf598IsnPjFnHj0nYbtOA",
  "refresh_expires_at": "2026-11-29T13:13:13.671194106Z",
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
  "correlation_id": "40574828-4689-48a4-adfc-601a802763d9"
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
  "device_ref": "sandbox-8608"
}
```

```json
{
  "challenge_id": "164b0323-87d8-461e-a9af-9a4143811bda",
  "expires_at": "2026-10-30T13:18:14.541317995Z",
  "resend_available_at": "2026-10-30T13:13:15.541317995Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "294738",
  "sent_at": "2026-10-30T13:13:14.544080159Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "164b0323-87d8-461e-a9af-9a4143811bda",
  "code": "294738",
  "device_ref": "sandbox-8608"
}
```

```json
{
  "session_id": "22c2ccdf-a004-47fc-9f27-3324885b9e33",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Njg5NCwiaWF0IjoxNzkzMzY1OTk0LCJqdGkiOiJiYmUxZjIwOC1hMDZkLTRmMjgtOTQ5NC1hODNkYzAxNmU2YzAiLCJzaWQiOiIyMmMyY2NkZi1hMDA0LTQ3ZmMtOWYyNy0zMzI0ODg1YjllMzMifQ.rgno3RMggxCdU4IxPGF11DmYbOe_CGld2TTsqytWEMc",
  "access_expires_at": "2026-10-30T13:28:14.858655134Z",
  "refresh_token": "fEFY0iDvtha_G18UMHeomqO1YFMlCiNCp9zSz5MfiRg",
  "refresh_expires_at": "2026-11-29T13:13:14.858145085Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "afc44886-d76b-41ec-849b-98cd20cc1866",
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
  "last_heartbeat_at": "2026-10-30T13:11:51.228024Z",
  "last_location_at": "2026-10-30T13:11:51.228024Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/afc44886-d76b-41ec-849b-98cd20cc1866/handover` → **200**

```json
{
  "command_id": "9c1d9014-e12c-4738-bfae-5aace3dd4f4b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "afc44886-d76b-41ec-849b-98cd20cc1866",
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
  "last_heartbeat_at": "2026-10-30T13:11:51.228024Z",
  "last_location_at": "2026-10-30T13:11:51.228024Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/afc44886-d76b-41ec-849b-98cd20cc1866/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:13:15Z",
    "sequence": 1793365995753
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "afc44886-d76b-41ec-849b-98cd20cc1866",
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
  "last_heartbeat_at": "2026-10-30T13:13:15.772638Z",
  "last_location_at": "2026-10-30T13:13:15.772638Z",
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
  "session_id": "afc44886-d76b-41ec-849b-98cd20cc1866",
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
  "last_heartbeat_at": "2026-10-30T13:13:15.772638Z",
  "last_location_at": "2026-10-30T13:13:15.772638Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/afc44886-d76b-41ec-849b-98cd20cc1866/close` → **200**

```json
{
  "command_id": "b0472cb1-565b-44eb-9e6d-37bf0c03d2d3",
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
  "correlation_id": "9e0463c4-2d44-45a2-a64e-6b5a1fadc07a"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676109089",
  "device_ref": "sandbox-25713"
}
```

```json
{
  "challenge_id": "98233a15-f763-48d4-8351-01e01c137ec0",
  "expires_at": "2026-10-30T13:18:17.242164488Z",
  "resend_available_at": "2026-10-30T13:13:18.242164488Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676109089` → **200**

```json
{
  "phone": "+380676109089",
  "audience": "CLIENT",
  "code": "905956",
  "sent_at": "2026-10-30T13:13:17.244684531Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98233a15-f763-48d4-8351-01e01c137ec0",
  "code": "905956",
  "device_ref": "sandbox-25713"
}
```

```json
{
  "session_id": "dbcd1db4-301a-43aa-9450-5a6c23b45600",
  "subject": {
    "type": "CLIENT",
    "id": "8f14f4e6-3d33-42ce-82cb-2280658d066a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjE0ZjRlNi0zZDMzLTQyY2UtODJjYi0yMjgwNjU4ZDA2NmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2ODk3LCJpYXQiOjE3OTMzNjU5OTcsImp0aSI6ImJlNTJkNjA2LTk4ODMtNDEwMi04MmRhLTdhMTkyOTU4Y2MxMSIsInNpZCI6ImRiY2QxZGI0LTMwMWEtNDNhYS05NDUwLTVhNmMyM2I0NTYwMCJ9.0-BAoBqAd6u2E4WStio1Zz8cu3ZjLKzODgu_AGEI8Kg",
  "access_expires_at": "2026-10-30T13:28:17.566998633Z",
  "refresh_token": "-A7S9oP-Xv-WGGrXw-Z5U8qgBizeqhrDKgOvbvsU1jc",
  "refresh_expires_at": "2026-11-29T13:13:17.566447523Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "9b4266d3-2ece-40e5-8b4b-b0312813dada",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "e39daad8-554f-4154-af46-536ddc53e57d",
  "upload_path": "/api/rider/v1/uploads/e39daad8-554f-4154-af46-536ddc53e57d",
  "expires_at": "2026-10-30T13:28:17.863465724Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/e39daad8-554f-4154-af46-536ddc53e57d` → **200**

```json
{
  "file_id": "e39daad8-554f-4154-af46-536ddc53e57d",
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
  "command_id": "bd66be25-1059-4ca3-ae2e-7a0891994a34",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "6663ad9d-6cf2-4554-8f90-7042d5f08122",
  "upload_path": "/api/rider/v1/uploads/6663ad9d-6cf2-4554-8f90-7042d5f08122",
  "expires_at": "2026-10-30T13:28:18.187985166Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/6663ad9d-6cf2-4554-8f90-7042d5f08122` → **200**

```json
{
  "file_id": "6663ad9d-6cf2-4554-8f90-7042d5f08122",
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
  "command_id": "bb823930-f0f4-4dfc-8f58-13075f6a70b7",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "0e7bdf09-983e-43e6-a1e4-8ee39cb2f792",
  "upload_path": "/api/rider/v1/uploads/0e7bdf09-983e-43e6-a1e4-8ee39cb2f792",
  "expires_at": "2026-10-30T13:28:18.506125515Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/0e7bdf09-983e-43e6-a1e4-8ee39cb2f792` → **200**

```json
{
  "file_id": "0e7bdf09-983e-43e6-a1e4-8ee39cb2f792",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "2e79d127-cade-42bf-abbf-f8fa4772b368",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "0e7bdf09-983e-43e6-a1e4-8ee39cb2f792"
  ]
}
```

```json
{
  "id": "3e44ab21-cc75-4d22-9fdb-a81f264a4caa",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "8f14f4e6-3d33-42ce-82cb-2280658d066a",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T13:13:18.829608Z",
  "updated_at": "2026-10-30T13:13:18.829608Z",
  "respond_by": "2026-10-30T17:13:18.829608Z",
  "messages": [
    {
      "id": "83f5f399-aefd-4f12-b414-5576e9a951f2",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "8f14f4e6-3d33-42ce-82cb-2280658d066a",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:13:18.830643Z",
      "attachments": [
        {
          "file_id": "0e7bdf09-983e-43e6-a1e4-8ee39cb2f792",
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
  "session_id": "d8800324-a924-4cee-9bc6-8cd9c3503194",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY4OTksImlhdCI6MTc5MzM2NTk5OSwianRpIjoiODU4MTM2YzktZDg3Zi00YTQwLTkyYWUtZWM4ZDc5NjYwZGIyIiwic2lkIjoiZDg4MDAzMjQtYTkyNC00Y2VlLTliYzYtOGNkOWMzNTAzMTk0In0.UrFkhy7FPpZ-O1zyvdGZXZrUZYJ-vFrgzSE8rUmzVN0",
  "access_expires_at": "2026-10-30T13:28:19.475991161Z",
  "refresh_token": "SiPzTZPugRKrxsMzLxJV8qit6ocq6KjpC28auoUO8GM",
  "refresh_expires_at": "2026-10-31T01:13:19.475454132Z",
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
  "session_id": "7ebdd8ec-620d-42f7-ba00-ea0625e7481e",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY5MDAsImlhdCI6MTc5MzM2NjAwMCwianRpIjoiNTg0ZmMwZGYtYWY1MS00OTYyLWExMGYtZDVmYjNhMjUzMzM1Iiwic2lkIjoiN2ViZGQ4ZWMtNjIwZC00MmY3LWJhMDAtZWEwNjI1ZTc0ODFlIn0.VyiyaEu-xQSi7xxPZq-GWjwcjN2hh1tVbjKu0B46160",
  "access_expires_at": "2026-10-30T13:28:20.098786242Z",
  "refresh_token": "xnizMbU1ERycdGnEfsaAZtVkj6YoNT3SLdlAbhpKwJs",
  "refresh_expires_at": "2026-10-31T01:13:20.098266598Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/3e44ab21-cc75-4d22-9fdb-a81f264a4caa/attachments/0e7bdf09-983e-43e6-a1e4-8ee39cb2f792` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "dc33ec6e-bad6-4260-b53e-b737d8aec656",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "fe0312c1-b7b9-402b-b69c-734ce08409f2",
  "upload_path": "/api/operator/v1/uploads/fe0312c1-b7b9-402b-b69c-734ce08409f2",
  "expires_at": "2026-10-30T13:28:20.399829212Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/fe0312c1-b7b9-402b-b69c-734ce08409f2` → **200**

```json
{
  "file_id": "fe0312c1-b7b9-402b-b69c-734ce08409f2",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/3e44ab21-cc75-4d22-9fdb-a81f264a4caa` → **200**

```json
{
  "id": "3e44ab21-cc75-4d22-9fdb-a81f264a4caa",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "8f14f4e6-3d33-42ce-82cb-2280658d066a",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T13:13:18.829608Z",
  "updated_at": "2026-10-30T13:13:18.829608Z",
  "respond_by": "2026-10-30T17:13:18.829608Z",
  "messages": [
    {
      "id": "83f5f399-aefd-4f12-b414-5576e9a951f2",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "8f14f4e6-3d33-42ce-82cb-2280658d066a",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:13:18.830643Z",
      "attachments": [
        {
          "file_id": "0e7bdf09-983e-43e6-a1e4-8ee39cb2f792",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/3e44ab21-cc75-4d22-9fdb-a81f264a4caa/comments` → **200**

```json
{
  "command_id": "47931134-618b-412a-85e8-dc8d85082ab8",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "fe0312c1-b7b9-402b-b69c-734ce08409f2"
  ]
}
```

```json
{
  "id": "3e44ab21-cc75-4d22-9fdb-a81f264a4caa",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "8f14f4e6-3d33-42ce-82cb-2280658d066a",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T13:13:18.829608Z",
  "updated_at": "2026-10-30T13:13:21.039538Z",
  "respond_by": "2026-10-30T17:13:18.829608Z",
  "messages": [
    {
      "id": "83f5f399-aefd-4f12-b414-5576e9a951f2",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "8f14f4e6-3d33-42ce-82cb-2280658d066a",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:13:18.830643Z",
      "attachments": [
        {
          "file_id": "0e7bdf09-983e-43e6-a1e4-8ee39cb2f792",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "6a7c23df-2389-4218-90ae-42e3160d4009",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T13:13:21.039014Z",
      "attachments": [
        {
          "file_id": "fe0312c1-b7b9-402b-b69c-734ce08409f2",
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

`GET /api/rider/v1/support/cases/3e44ab21-cc75-4d22-9fdb-a81f264a4caa` → **200**

```json
{
  "id": "3e44ab21-cc75-4d22-9fdb-a81f264a4caa",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "8f14f4e6-3d33-42ce-82cb-2280658d066a",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T13:13:18.829608Z",
  "updated_at": "2026-10-30T13:13:21.039538Z",
  "respond_by": "2026-10-30T17:13:18.829608Z",
  "messages": [
    {
      "id": "83f5f399-aefd-4f12-b414-5576e9a951f2",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "8f14f4e6-3d33-42ce-82cb-2280658d066a",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:13:18.830643Z",
      "attachments": [
        {
          "file_id": "0e7bdf09-983e-43e6-a1e4-8ee39cb2f792",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "6a7c23df-2389-4218-90ae-42e3160d4009",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T13:13:21.039014Z",
      "attachments": [
        {
          "file_id": "fe0312c1-b7b9-402b-b69c-734ce08409f2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/3e44ab21-cc75-4d22-9fdb-a81f264a4caa/attachments/fe0312c1-b7b9-402b-b69c-734ce08409f2` → **200**

Done: support case 3e44ab21-cc75-4d22-9fdb-a81f264a4caa, rider attachment 0e7bdf09-983e-43e6-a1e4-8ee39cb2f792, operator attachment fe0312c1-b7b9-402b-b69c-734ce08409f2.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380736571355",
  "device_ref": "sandbox-12792"
}
```

```json
{
  "challenge_id": "267e1379-8e35-4ba7-a87f-37c2d8572f30",
  "expires_at": "2026-10-30T13:18:21.697617906Z",
  "resend_available_at": "2026-10-30T13:13:22.697617906Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380736571355` → **200**

```json
{
  "phone": "+380736571355",
  "audience": "CLIENT",
  "code": "744091",
  "sent_at": "2026-10-30T13:13:21.700230986Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "267e1379-8e35-4ba7-a87f-37c2d8572f30",
  "code": "744091",
  "device_ref": "sandbox-12792"
}
```

```json
{
  "session_id": "8727f44e-8960-4849-8ba7-e5146a94f49e",
  "subject": {
    "type": "CLIENT",
    "id": "115e9f13-2d14-491f-878d-bf92be4a952c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMTVlOWYxMy0yZDE0LTQ5MWYtODc4ZC1iZjkyYmU0YTk1MmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2OTAyLCJpYXQiOjE3OTMzNjYwMDIsImp0aSI6ImU2ZmIwMDJiLWMwZGUtNDYwNC04ZDVmLWYyOWNlNDIzYzAyMyIsInNpZCI6Ijg3MjdmNDRlLTg5NjAtNDg0OS04YmE3LWU1MTQ2YTk0ZjQ5ZSJ9.ftdhsaqsOG_QJn7qpRS6oRD54ZJgkfb-XRhC86wPO7k",
  "access_expires_at": "2026-10-30T13:28:22.01714015Z",
  "refresh_token": "W7pCOVzZ91oDV3z9afi5k-vmxkyxR75qxWFplIdVGag",
  "refresh_expires_at": "2026-11-29T13:13:22.016571981Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "6c655cc7-bc90-45b7-848f-7682fcea13ac",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "c00057e8-9582-446b-a703-e83d4a0d7161",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-c00057e8-9582-446b-a703-e83d4a0d7161",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "021f9d63bcaf433b6041b72ede798773",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=c00057e8-9582-446b-a703-e83d4a0d7161",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736571355"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=c00057e8-9582-446b-a703-e83d4a0d7161",
  "expires_at": "2026-10-30T13:43:22.302381Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/c00057e8-9582-446b-a703-e83d4a0d7161` → **200**

```json
{
  "id": "c00057e8-9582-446b-a703-e83d4a0d7161",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:43:22.302381Z",
  "card": {
    "id": "7633b986-29a8-434c-9952-8c7730f5e618",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8998",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:13:22.597964Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e532dcbf-abbb-45f1-92b9-936bc506c5c3",
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
  "id": "47e48d66-1389-4241-a4f1-2275ae8ae674",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:18:22.911124Z",
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
  "command_id": "2773774f-40d0-40ee-9ad9-23a6e183230b",
  "quote_id": "47e48d66-1389-4241-a4f1-2275ae8ae674",
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
  "id": "19e195a2-9f88-480e-b413-cc6b0c00474e",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "115e9f13-2d14-491f-878d-bf92be4a952c",
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
  "created_at": "2026-10-30T13:13:23.218038Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/19e195a2-9f88-480e-b413-cc6b0c00474e` → **200**

```json
{
  "id": "19e195a2-9f88-480e-b413-cc6b0c00474e",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "115e9f13-2d14-491f-878d-bf92be4a952c",
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
  "created_at": "2026-10-30T13:13:23.218038Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/19e195a2-9f88-480e-b413-cc6b0c00474e` → **200**

```json
{
  "id": "19e195a2-9f88-480e-b413-cc6b0c00474e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "115e9f13-2d14-491f-878d-bf92be4a952c",
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
  "created_at": "2026-10-30T13:13:23.218038Z",
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

`GET /api/rider/v1/orders/19e195a2-9f88-480e-b413-cc6b0c00474e` → **200**

```json
{
  "id": "19e195a2-9f88-480e-b413-cc6b0c00474e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "115e9f13-2d14-491f-878d-bf92be4a952c",
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
  "created_at": "2026-10-30T13:13:23.218038Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/19e195a2-9f88-480e-b413-cc6b0c00474e/switch-to-cash` → **200**

```json
{
  "command_id": "9e51f46a-46f7-4767-ad53-dbcceaa9fd85",
  "expected_version": 3
}
```

```json
{
  "id": "19e195a2-9f88-480e-b413-cc6b0c00474e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "115e9f13-2d14-491f-878d-bf92be4a952c",
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
  "created_at": "2026-10-30T13:13:23.218038Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/19e195a2-9f88-480e-b413-cc6b0c00474e/switch-to-cash` → **409**

```json
{
  "command_id": "32fa2395-dac2-405d-b7cf-3f7dbccb1fbe",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/19e195a2-9f88-480e-b413-cc6b0c00474e/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "62287bdf-71aa-4a38-94b8-960fca3d215c"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/19e195a2-9f88-480e-b413-cc6b0c00474e` → **200**

```json
{
  "id": "19e195a2-9f88-480e-b413-cc6b0c00474e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "115e9f13-2d14-491f-878d-bf92be4a952c",
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
  "created_at": "2026-10-30T13:13:23.218038Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/19e195a2-9f88-480e-b413-cc6b0c00474e/cancel` → **200**

```json
{
  "command_id": "f1c7a9e4-6e8f-406f-8a73-0f70a6ad5720",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "19e195a2-9f88-480e-b413-cc6b0c00474e",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "115e9f13-2d14-491f-878d-bf92be4a952c",
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
  "created_at": "2026-10-30T13:13:23.218038Z",
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
  "session_id": "bed1fcc0-07ef-41a6-af80-31b0671374a8",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY5MDcsImlhdCI6MTc5MzM2NjAwNywianRpIjoiOWFiZWIxZTktN2RiNi00OWE5LTgyYWQtMGZmZTA2MTA4OTM5Iiwic2lkIjoiYmVkMWZjYzAtMDdlZi00MWE2LWFmODAtMzFiMDY3MTM3NGE4In0.aVCf_tie7RvNzYniY6qirmINfC9Drl-ZmOQzd-AzWfc",
  "access_expires_at": "2026-10-30T13:28:27.01130017Z",
  "refresh_token": "TywD8xWq66YrJSNsROV7fA8XtX6vd6cRka1CIGZfrMg",
  "refresh_expires_at": "2026-10-31T01:13:27.010644972Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-29249"
}
```

```json
{
  "challenge_id": "6e9019a6-236f-436f-a391-f8b459cd13bb",
  "expires_at": "2026-10-30T13:18:27.29923016Z",
  "resend_available_at": "2026-10-30T13:13:28.29923016Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "499840",
  "sent_at": "2026-10-30T13:13:27.302579622Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e9019a6-236f-436f-a391-f8b459cd13bb",
  "code": "499840",
  "device_ref": "sandbox-29249"
}
```

```json
{
  "session_id": "5bb852e5-6b5d-41e2-849b-f1c80f83fdec",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjkwNywiaWF0IjoxNzkzMzY2MDA3LCJqdGkiOiIwODJkY2NkMC02MjIxLTRmYzItYTg1Ny0zMDAxYWM2Njk2MzMiLCJzaWQiOiI1YmI4NTJlNS02YjVkLTQxZTItODQ5Yi1mMWM4MGY4M2ZkZWMifQ.tj_8GSHJO8FhzOyfwaPRxQx0MdZxv5mTVLhEh3MgY9Q",
  "access_expires_at": "2026-10-30T13:28:27.625959592Z",
  "refresh_token": "RA4lp3LqAl8jZaB9EzgMxq6C34Uq-sOuzqzoSRJsDuk",
  "refresh_expires_at": "2026-11-29T13:13:27.625450904Z",
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
      "actor_id": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T13:13:09.348498Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T13:13:10.894727Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "7c4c8943-01fc-49ef-96ac-96842c56e447",
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
  "device_ref": "sandbox-1985"
}
```

```json
{
  "challenge_id": "c4c44dd4-e119-4862-a321-22b8b6961bdf",
  "expires_at": "2026-10-30T13:18:28.802001782Z",
  "resend_available_at": "2026-10-30T13:13:29.802001782Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "373986",
  "sent_at": "2026-10-30T13:13:28.804215205Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c4c44dd4-e119-4862-a321-22b8b6961bdf",
  "code": "373986",
  "device_ref": "sandbox-1985"
}
```

```json
{
  "session_id": "43387ac3-d9a4-4a8e-a0d9-7c8208dc73b5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjkwOSwiaWF0IjoxNzkzMzY2MDA5LCJqdGkiOiJiMGI2ODYzOC1lZTE2LTQ5ZDgtYmI5NC05NDNlNGM3NDBlYzciLCJzaWQiOiI0MzM4N2FjMy1kOWE0LTRhOGUtYTBkOS03YzgyMDhkYzczYjUifQ.SGqkZToyQPjvFsZ1kz4OKE4kIMEMVMTv2c1vKS-BKVE",
  "access_expires_at": "2026-10-30T13:28:29.124941881Z",
  "refresh_token": "m9RaVkvCPjJWWguCqndHzHhWhRV8Uo6oEUaCMI2ZC4I",
  "refresh_expires_at": "2026-11-29T13:13:29.124416624Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "61d0596a-51ac-4764-9125-dd8fe07e96a0",
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
  "last_heartbeat_at": "2026-10-30T13:12:46.729187Z",
  "last_location_at": "2026-10-30T13:12:46.729187Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/61d0596a-51ac-4764-9125-dd8fe07e96a0/handover` → **200**

```json
{
  "command_id": "c802fffb-8486-48b4-8575-c117a6b8e8a9",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "61d0596a-51ac-4764-9125-dd8fe07e96a0",
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
  "last_heartbeat_at": "2026-10-30T13:12:46.729187Z",
  "last_location_at": "2026-10-30T13:12:46.729187Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/61d0596a-51ac-4764-9125-dd8fe07e96a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:13:35Z",
    "sequence": 1793366015606
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "61d0596a-51ac-4764-9125-dd8fe07e96a0",
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
  "last_heartbeat_at": "2026-10-30T13:13:35.079616Z",
  "last_location_at": "2026-10-30T13:13:35.079616Z",
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
  "command_id": "bde66270-4117-4554-978f-0606efbfa9e7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:13:35Z",
    "sequence": 1793366015685
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c52af2b2-b904-4355-a109-30c977243ad6",
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
  "last_heartbeat_at": "2026-10-30T13:13:35.706254Z",
  "last_location_at": "2026-10-30T13:13:35.706254Z",
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
  "session_id": "f16c7e17-6fa9-48f1-b09c-205fed0e9989",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY5MTYsImlhdCI6MTc5MzM2NjAxNiwianRpIjoiNzJmYmQyOTQtZTE0NS00ODZiLWI2YWYtMjU0M2E2YzQyNmMyIiwic2lkIjoiZjE2YzdlMTctNmZhOS00OGYxLWIwOWMtMjA1ZmVkMGU5OTg5In0.hFxxFMsYgDbGhU4Ha3I2mgQCbG7G9a5FqYO-nx5ilqg",
  "access_expires_at": "2026-10-30T13:28:36.340025891Z",
  "refresh_token": "iDxl_GA1lpFAA0HTqO8cCM1BL_G4pQ_hx6YCKb-CnUs",
  "refresh_expires_at": "2026-10-31T01:13:36.339345832Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a987c5e4-4bd4-471d-8fce-8d6fca2a5ddf",
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
  "id": "516409d1-fc50-4ef5-a9e8-a5225429e6b8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:18:36.639725Z",
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
  "command_id": "7026e743-7400-4620-a4c0-664ab83e7893",
  "quote_id": "516409d1-fc50-4ef5-a9e8-a5225429e6b8",
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
  "id": "1bf30f96-2c9d-477c-bfe1-12f90cd275d2",
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
  "created_at": "2026-10-30T13:13:36.947554Z",
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
    "id": "80902d15-2154-40e8-8e8d-2128ebc0e830",
    "order_id": "1bf30f96-2c9d-477c-bfe1-12f90cd275d2",
    "expires_at": "2026-10-30T13:13:51.951423Z",
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

`POST /api/driver/v1/offers/80902d15-2154-40e8-8e8d-2128ebc0e830/accept` → **200**

```json
{
  "command_id": "1876e8b8-305a-4e25-abfa-5994cc5d5df5"
}
```

```json
{
  "id": "823ed624-9264-441c-b5dc-b7241d2191fd",
  "order_id": "1bf30f96-2c9d-477c-bfe1-12f90cd275d2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c29fd56e-995f-475a-9da8-5f0717857c22",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c29fd56e-995f-475a-9da8-5f0717857c22",
  "order_id": "1bf30f96-2c9d-477c-bfe1-12f90cd275d2",
  "assignment_id": "823ed624-9264-441c-b5dc-b7241d2191fd",
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

`POST /api/driver/v1/work-sessions/c52af2b2-b904-4355-a109-30c977243ad6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:13:47Z",
    "sequence": 1793366027439
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c52af2b2-b904-4355-a109-30c977243ad6",
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
  "last_heartbeat_at": "2026-10-30T13:13:47.458953Z",
  "last_location_at": "2026-10-30T13:13:47.458953Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/c29fd56e-995f-475a-9da8-5f0717857c22/arrive` → **200**

```json
{
  "command_id": "c809b382-b67c-49c4-9962-6df621c091a1",
  "expected_version": 0
}
```

```json
{
  "id": "c29fd56e-995f-475a-9da8-5f0717857c22",
  "order_id": "1bf30f96-2c9d-477c-bfe1-12f90cd275d2",
  "assignment_id": "823ed624-9264-441c-b5dc-b7241d2191fd",
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
  "arrived_at": "2026-10-30T13:13:47.756615Z",
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

`POST /api/driver/v1/trips/c29fd56e-995f-475a-9da8-5f0717857c22/start` → **200**

```json
{
  "command_id": "08e0928c-7535-497b-961c-cca1c9dd40ea",
  "expected_version": 1
}
```

```json
{
  "id": "c29fd56e-995f-475a-9da8-5f0717857c22",
  "order_id": "1bf30f96-2c9d-477c-bfe1-12f90cd275d2",
  "assignment_id": "823ed624-9264-441c-b5dc-b7241d2191fd",
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
  "arrived_at": "2026-10-30T13:13:47.756615Z",
  "started_at": "2026-10-30T13:13:48.061927Z",
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

`POST /api/driver/v1/trips/c29fd56e-995f-475a-9da8-5f0717857c22/complete` → **200**

```json
{
  "command_id": "2df6b969-965e-48b6-b959-b06f24e6508c",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:13:48Z",
  "cash_received": true
}
```

```json
{
  "id": "c29fd56e-995f-475a-9da8-5f0717857c22",
  "order_id": "1bf30f96-2c9d-477c-bfe1-12f90cd275d2",
  "assignment_id": "823ed624-9264-441c-b5dc-b7241d2191fd",
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
  "arrived_at": "2026-10-30T13:13:47.756615Z",
  "started_at": "2026-10-30T13:13:48.061927Z",
  "completed_at": "2026-10-30T13:13:48.371719Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/1bf30f96-2c9d-477c-bfe1-12f90cd275d2` → **200**

```json
{
  "id": "1bf30f96-2c9d-477c-bfe1-12f90cd275d2",
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
    "id": "823ed624-9264-441c-b5dc-b7241d2191fd",
    "order_id": "1bf30f96-2c9d-477c-bfe1-12f90cd275d2",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c29fd56e-995f-475a-9da8-5f0717857c22",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:13:36.947554Z",
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
  "session_id": "61d0596a-51ac-4764-9125-dd8fe07e96a0",
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
  "last_heartbeat_at": "2026-10-30T13:13:35.079616Z",
  "last_location_at": "2026-10-30T13:13:35.079616Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/61d0596a-51ac-4764-9125-dd8fe07e96a0/close` → **200**

```json
{
  "command_id": "0b187401-d43b-4f6f-8a49-66b59a5220da",
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
  "session_id": "c52af2b2-b904-4355-a109-30c977243ad6",
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
  "last_heartbeat_at": "2026-10-30T13:13:47.458953Z",
  "last_location_at": "2026-10-30T13:13:47.458953Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c52af2b2-b904-4355-a109-30c977243ad6/close` → **200**

```json
{
  "command_id": "78607fb3-d611-4abd-a18b-cfa566c6b222",
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

Done: terminal order 1bf30f96-2c9d-477c-bfe1-12f90cd275d2 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30896"
}
```

```json
{
  "challenge_id": "2d6f31d9-e164-4528-8552-4ff9d74fcd57",
  "expires_at": "2026-10-30T13:18:53.403337039Z",
  "resend_available_at": "2026-10-30T13:13:54.403337039Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "850414",
  "sent_at": "2026-10-30T13:13:53.405769121Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2d6f31d9-e164-4528-8552-4ff9d74fcd57",
  "code": "850414",
  "device_ref": "sandbox-30896"
}
```

```json
{
  "session_id": "c18d1809-6cb8-48b9-af4b-54835247b803",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjkzMywiaWF0IjoxNzkzMzY2MDMzLCJqdGkiOiJjOTkwZDVlYS1kNWVlLTQzMTktYTg5ZC1mMGZmMGU2YTliM2IiLCJzaWQiOiJjMThkMTgwOS02Y2I4LTQ4YjktYWY0Yi01NDgzNTI0N2I4MDMifQ.sQ6JGvogB3gvRlMP1qsHq1FmUN_eklTscL8ssqTxwk4",
  "access_expires_at": "2026-10-30T13:28:53.709652305Z",
  "refresh_token": "5I8Fn91n9NBUeRsHbC0rVvxtldKYwYjUYP4PXkIslco",
  "refresh_expires_at": "2026-11-29T13:13:53.70913828Z",
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
  "device_ref": "sandbox-19914"
}
```

```json
{
  "challenge_id": "cf7328fe-a0ee-4945-8f95-ff0310a405b1",
  "expires_at": "2026-10-30T13:18:54.272385131Z",
  "resend_available_at": "2026-10-30T13:13:55.272385131Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "594720",
  "sent_at": "2026-10-30T13:13:54.274567807Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf7328fe-a0ee-4945-8f95-ff0310a405b1",
  "code": "594720",
  "device_ref": "sandbox-19914"
}
```

```json
{
  "session_id": "a36909a9-8a97-4ca9-8aab-ad35f898062d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjkzNCwiaWF0IjoxNzkzMzY2MDM0LCJqdGkiOiIyMWRiZTcwZC1mZWEyLTQzMTctYmUyNy0wODdkNDRlNWQ3MmYiLCJzaWQiOiJhMzY5MDlhOS04YTk3LTRjYTktOGFhYi1hZDM1Zjg5ODA2MmQifQ.3ifUqjnCDevzfjQUCPudVCvqvaKZMRo7Eoewt3PuYs0",
  "access_expires_at": "2026-10-30T13:28:54.587115115Z",
  "refresh_token": "gFl7KXnEQzohtpP_opv6rgs52gLwDYMGhWAh-x1MEBI",
  "refresh_expires_at": "2026-11-29T13:13:54.586547191Z",
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
  "device_ref": "sandbox-18320"
}
```

```json
{
  "challenge_id": "85f818d0-2580-401f-8b68-a6f3fd7b789b",
  "expires_at": "2026-10-30T13:18:55.153085301Z",
  "resend_available_at": "2026-10-30T13:13:56.153085301Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "967163",
  "sent_at": "2026-10-30T13:13:55.1555318Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "85f818d0-2580-401f-8b68-a6f3fd7b789b",
  "code": "967163",
  "device_ref": "sandbox-18320"
}
```

```json
{
  "session_id": "25ca1dcb-f3c6-41fd-b619-00e09c3fbfc6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjkzNSwiaWF0IjoxNzkzMzY2MDM1LCJqdGkiOiIyNzBlYjA2NS1iNDExLTRiYjUtOWNlYy0xYjNjNjQ5MjQ5ZjIiLCJzaWQiOiIyNWNhMWRjYi1mM2M2LTQxZmQtYjYxOS0wMGUwOWMzZmJmYzYifQ.gbTzaYgsIgG80PYVgwiKYoPFQwQlQvZfAU448q_SYCc",
  "access_expires_at": "2026-10-30T13:28:55.462794516Z",
  "refresh_token": "y8Nk3UDZqn4ItoXUHmcYThq8bmLDMbssPIYAXo8jaQ8",
  "refresh_expires_at": "2026-11-29T13:13:55.462261013Z",
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
  "phone": "+380696507660",
  "device_ref": "sandbox-16692"
}
```

```json
{
  "challenge_id": "8a871a49-c49f-4a64-bd00-f44c2a5e2c89",
  "expires_at": "2026-10-30T13:18:56.043269538Z",
  "resend_available_at": "2026-10-30T13:13:57.043269538Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380696507660` → **200**

```json
{
  "phone": "+380696507660",
  "audience": "CLIENT",
  "code": "110568",
  "sent_at": "2026-10-30T13:13:56.045454756Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a871a49-c49f-4a64-bd00-f44c2a5e2c89",
  "code": "110568",
  "device_ref": "sandbox-16692"
}
```

```json
{
  "session_id": "4dfd83e0-da58-48a8-82db-0c1894ff3e3a",
  "subject": {
    "type": "CLIENT",
    "id": "f5e76c93-652f-457c-9b70-3f2bb792d81c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWU3NmM5My02NTJmLTQ1N2MtOWI3MC0zZjJiYjc5MmQ4MWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2OTM2LCJpYXQiOjE3OTMzNjYwMzYsImp0aSI6IjBjMTc5YWVhLTA2YTEtNDMwYS04YTI1LWJhNWY3YmQzMjQyZCIsInNpZCI6IjRkZmQ4M2UwLWRhNTgtNDhhOC04MmRiLTBjMTg5NGZmM2UzYSJ9.OhEZXBQQcyEtnKOpRlLXRoPAVOCZ1DeoxAWKS-gDaRM",
  "access_expires_at": "2026-10-30T13:28:56.36200954Z",
  "refresh_token": "nwu2-M1B3A-so-NRNa7IVFc3-eCwOVttD4n_AS3vKzs",
  "refresh_expires_at": "2026-11-29T13:13:56.361432287Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8d5bfbe5-0ca3-4075-bd95-b6306a42925d",
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
  "id": "e490e06b-a9a5-45f9-80c2-72bcb38e44bb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:18:56.652590Z",
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
  "command_id": "3bf40f26-c4c4-4605-99be-4f945ad6408a",
  "quote_id": "e490e06b-a9a5-45f9-80c2-72bcb38e44bb",
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
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:13:56.950134Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:13:56.950134Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 12.074755089
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 15.102759019
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 6.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.212263334
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

`GET /api/rider/v1/orders/f1784190-24c8-4a59-920e-e509f7545b70` → **200**

```json
{
  "id": "f1784190-24c8-4a59-920e-e509f7545b70",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f5e76c93-652f-457c-9b70-3f2bb792d81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:13:56.950134Z",
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
  "session_id": "16c86e06-04dc-4f31-9196-46a37aca1fb2",
  "subject": {
    "type": "STAFF",
    "id": "1336b6b8-bb63-4881-8f1f-12487e8176e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzM2YjZiOC1iYjYzLTQ4ODEtOGYxZi0xMjQ4N2U4MTc2ZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcxMTgsImlhdCI6MTc5MzM2NjIxOCwianRpIjoiZmQwNmUzYTEtYjY5Yi00YzA2LTlkOTQtYjU0MWEwZWE5ODJiIiwic2lkIjoiMTZjODZlMDYtMDRkYy00ZjMxLTkxOTYtNDZhMzdhY2ExZmIyIn0.IhH2JPNhDPXjDBNho0igBr2jhyGdCBvNPp7EPNMTlBk",
  "access_expires_at": "2026-10-30T13:31:58.803791585Z",
  "refresh_token": "RXEsdlxxX5aTMZOl_-ufium4RhjyKErEwS0B97bOJiA",
  "refresh_expires_at": "2026-10-31T01:16:58.802915549Z",
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
  "id": "120f8928-8594-4030-9220-205fee69a086",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:16:59.102871Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:16:59.10292Z",
  "updated_at": "2026-10-30T13:16:59.118858Z",
  "finished_at": "2026-10-30T13:16:59.118858Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/120f8928-8594-4030-9220-205fee69a086` → **200**

```json
{
  "run": {
    "id": "120f8928-8594-4030-9220-205fee69a086",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:16:59.102871Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:16:59.10292Z",
    "updated_at": "2026-10-30T13:16:59.118858Z",
    "finished_at": "2026-10-30T13:16:59.118858Z",
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
  "id": "120f8928-8594-4030-9220-205fee69a086",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:16:59.102871Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:16:59.10292Z",
  "updated_at": "2026-10-30T13:16:59.118858Z",
  "finished_at": "2026-10-30T13:16:59.118858Z",
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
  "id": "120f8928-8594-4030-9220-205fee69a086",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:16:59.102871Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:16:59.10292Z",
  "updated_at": "2026-10-30T13:16:59.118858Z",
  "finished_at": "2026-10-30T13:16:59.118858Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/df39a0be-014d-4bab-8d63-042e34720ae6` → **204**

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
  "id": "1b836036-4901-4bcd-9197-9c21fe142368",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:16:59.554989Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:16:59.555015Z",
  "updated_at": "2026-10-30T13:16:59.562683Z",
  "finished_at": "2026-10-30T13:16:59.562683Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/1b836036-4901-4bcd-9197-9c21fe142368` → **200**

```json
{
  "run": {
    "id": "1b836036-4901-4bcd-9197-9c21fe142368",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:16:59.554989Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:16:59.555015Z",
    "updated_at": "2026-10-30T13:16:59.562683Z",
    "finished_at": "2026-10-30T13:16:59.562683Z",
    "version": 1
  },
  "items": [
    {
      "id": "be819d49-591c-4531-808a-102c41d90565",
      "run_id": "1b836036-4901-4bcd-9197-9c21fe142368",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "f8c375415b6d8f951ecfac0407d78ff35389328859e115203995b926068371d4",
      "reference_display": "sandbox-reconciliation-df39a0be-014d-4bab-8d63-042e#####ae6",
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
      "provider_at": "2026-10-30T13:16:59Z",
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
  "id": "1b836036-4901-4bcd-9197-9c21fe142368",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:16:59.554989Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:16:59.555015Z",
  "updated_at": "2026-10-30T13:16:59.562683Z",
  "finished_at": "2026-10-30T13:16:59.562683Z",
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
  "id": "1b836036-4901-4bcd-9197-9c21fe142368",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:16:59.554989Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:16:59.555015Z",
  "updated_at": "2026-10-30T13:16:59.562683Z",
  "finished_at": "2026-10-30T13:16:59.562683Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/be819d49-591c-4531-808a-102c41d90565/resolve` → **200**

```json
{
  "command_id": "aeab6e8a-dd16-49f2-b839-6d0ce7c10d39",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "be819d49-591c-4531-808a-102c41d90565",
  "run_id": "1b836036-4901-4bcd-9197-9c21fe142368",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "f8c375415b6d8f951ecfac0407d78ff35389328859e115203995b926068371d4",
  "reference_display": "sandbox-reconciliation-df39a0be-014d-4bab-8d63-042e#####ae6",
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
  "provider_at": "2026-10-30T13:16:59Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "resolved_at": "2026-10-30T13:16:59.98739Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/be819d49-591c-4531-808a-102c41d90565/resolve` → **200**

```json
{
  "command_id": "aeab6e8a-dd16-49f2-b839-6d0ce7c10d39",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "be819d49-591c-4531-808a-102c41d90565",
  "run_id": "1b836036-4901-4bcd-9197-9c21fe142368",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "f8c375415b6d8f951ecfac0407d78ff35389328859e115203995b926068371d4",
  "reference_display": "sandbox-reconciliation-df39a0be-014d-4bab-8d63-042e#####ae6",
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
  "provider_at": "2026-10-30T13:16:59Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
  "resolved_at": "2026-10-30T13:16:59.98739Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/be819d49-591c-4531-808a-102c41d90565/resolve` → **409**

```json
{
  "command_id": "7c3b8594-30e2-44de-86d3-a0e6129faa50",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/be819d49-591c-4531-808a-102c41d90565/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a516d71d-6655-47f5-9549-63d568898b87"
}
```

`GET /api/admin/v1/payment-reconciliations/1b836036-4901-4bcd-9197-9c21fe142368` → **200**

```json
{
  "run": {
    "id": "1b836036-4901-4bcd-9197-9c21fe142368",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:16:59.554989Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:16:59.555015Z",
    "updated_at": "2026-10-30T13:16:59.98739Z",
    "finished_at": "2026-10-30T13:16:59.562683Z",
    "version": 2
  },
  "items": [
    {
      "id": "be819d49-591c-4531-808a-102c41d90565",
      "run_id": "1b836036-4901-4bcd-9197-9c21fe142368",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "f8c375415b6d8f951ecfac0407d78ff35389328859e115203995b926068371d4",
      "reference_display": "sandbox-reconciliation-df39a0be-014d-4bab-8d63-042e#####ae6",
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
      "provider_at": "2026-10-30T13:16:59Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "1336b6b8-bb63-4881-8f1f-12487e8176e5",
      "resolved_at": "2026-10-30T13:16:59.98739Z",
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
      "id": "1b836036-4901-4bcd-9197-9c21fe142368",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T13:16:59.554989Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T13:16:59.555015Z",
      "updated_at": "2026-10-30T13:16:59.98739Z",
      "finished_at": "2026-10-30T13:16:59.562683Z",
      "version": 2
    },
    {
      "id": "163ee2bf-9879-4d89-bc08-30209165f039",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T12:57:39.160647Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T12:57:39.160777Z",
      "updated_at": "2026-10-30T12:57:39.170254Z",
      "finished_at": "2026-10-30T12:57:39.170254Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/df39a0be-014d-4bab-8d63-042e34720ae6` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "1b836036-4901-4bcd-9197-9c21fe142368",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:16:59.554989Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:16:59.555015Z",
  "updated_at": "2026-10-30T13:16:59.98739Z",
  "finished_at": "2026-10-30T13:16:59.562683Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793366344518E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793366344934E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793366344934E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793366344555E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793366344935E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
