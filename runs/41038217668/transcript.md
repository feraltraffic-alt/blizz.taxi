# Sandbox transcript (2026-10-30T10:06:39Z, 08b90b8)

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
  "correlation_id": "d826b108-c099-4e6e-a937-f8a970d76ffa"
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
  "session_id": "09a6c16a-bd82-48ce-ab9e-1fb30bfc4d0e",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3MDQsImlhdCI6MTc5MzM1NDgwNCwianRpIjoiNjdjYjUzNWYtZWU2NC00YzZhLWI0NDktN2Q2YjU2NmYwNWI3Iiwic2lkIjoiMDlhNmMxNmEtYmQ4Mi00OGNlLWFiOWUtMWZiMzBiZmM0ZDBlIn0.yX6z1vfnQGDGrr1TfUwV1-HnZNllhm5Mfms7BXU8gF8",
  "access_expires_at": "2026-10-30T10:21:44.939508382Z",
  "refresh_token": "2dSJa72Am4PAB-TnfgSRfB_CTDNrqBobbnZmUMoI74c",
  "refresh_expires_at": "2026-10-30T22:06:44.937979684Z",
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
  "session_id": "480783fb-4cd1-4eb9-928b-0206d42f86b1",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3MDYsImlhdCI6MTc5MzM1NDgwNiwianRpIjoiOWE4YjBkYjEtMzJhZS00ZGI2LTg4OWMtMWI2YzRjNDQ1N2I0Iiwic2lkIjoiNDgwNzgzZmItNGNkMS00ZWI5LTkyOGItMDIwNmQ0MmY4NmIxIn0.iYNO8wVUGqk6AsEelaHOGT4tLY77qCGwlsWGIv3iEOc",
  "access_expires_at": "2026-10-30T10:21:46.167143287Z",
  "refresh_token": "hgm5-jJSvM7GcYYjH71BBxtLUmLhuQr06taOk1OVvWI",
  "refresh_expires_at": "2026-10-30T22:06:46.166370244Z",
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
  "device_ref": "sandbox-4174"
}
```

```json
{
  "challenge_id": "2f3a0a0a-1188-46e5-8eed-082ae035af95",
  "expires_at": "2026-10-30T10:11:46.580209033Z",
  "resend_available_at": "2026-10-30T10:06:47.580209033Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "108164",
  "sent_at": "2026-10-30T10:06:46.589326433Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f3a0a0a-1188-46e5-8eed-082ae035af95",
  "code": "108164",
  "device_ref": "sandbox-4174"
}
```

```json
{
  "session_id": "407457e3-f236-4637-a057-0b0fca8efe9c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTcwNiwiaWF0IjoxNzkzMzU0ODA2LCJqdGkiOiIxM2YwY2FmZi1kNDQ3LTQ0MGEtOGFhNi04NWMzODU5YzRjMjAiLCJzaWQiOiI0MDc0NTdlMy1mMjM2LTQ2MzctYTA1Ny0wYjBmY2E4ZWZlOWMifQ.nEJS1Jsk2ymHbSWSc_bpzkwS2beIf3Jo4UxImblNVh0",
  "access_expires_at": "2026-10-30T10:21:46.823663257Z",
  "refresh_token": "r8616r3_VBtJKySbAZ6mTVy8MHSwVqXmS3pZUwPzbZA",
  "refresh_expires_at": "2026-11-29T10:06:46.822843751Z",
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
  "command_id": "13d1d253-bdda-4405-95e0-ac88f478ec31",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:47Z",
    "sequence": 1793354807223
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7b765fbf-8aec-400b-ba57-4486c2768d26",
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
  "last_heartbeat_at": "2026-10-30T10:06:47.33439Z",
  "last_location_at": "2026-10-30T10:06:47.33439Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634796713",
  "device_ref": "sandbox-9147"
}
```

```json
{
  "challenge_id": "8ba57843-30c4-4545-a713-691b660b8c75",
  "expires_at": "2026-10-30T10:11:47.53104877Z",
  "resend_available_at": "2026-10-30T10:06:48.53104877Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634796713` → **200**

```json
{
  "phone": "+380634796713",
  "audience": "CLIENT",
  "code": "158634",
  "sent_at": "2026-10-30T10:06:47.53509511Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ba57843-30c4-4545-a713-691b660b8c75",
  "code": "158634",
  "device_ref": "sandbox-9147"
}
```

```json
{
  "session_id": "b8bd1f30-67fe-4fb4-a331-0298b8d31819",
  "subject": {
    "type": "CLIENT",
    "id": "1d7098a5-7986-44f9-998d-42d4adf8bbf8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZDcwOThhNS03OTg2LTQ0ZjktOTk4ZC00MmQ0YWRmOGJiZjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NzA3LCJpYXQiOjE3OTMzNTQ4MDcsImp0aSI6IjRhNmUyODk2LTAyOGYtNDcyMy1iNWQ0LTcwNGQwYjQxMGMyMSIsInNpZCI6ImI4YmQxZjMwLTY3ZmUtNGZiNC1hMzMxLTAyOThiOGQzMTgxOSJ9.Pj8RKegkiyFylcz0fMp5yaeGs1Hk-yXV4T8JOzQ3e-4",
  "access_expires_at": "2026-10-30T10:21:47.754320206Z",
  "refresh_token": "lPoqeHjlGXrlVTGKAhq7WP4shN12rN_27DSXoc-BLgw",
  "refresh_expires_at": "2026-11-29T10:06:47.753593326Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a794a0ac-46d3-43b5-9cea-4d92b1cbe313",
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
  "id": "7f1ed9a4-b89e-4d5b-881e-77ac73514dd5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:11:47.977946Z",
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
  "command_id": "df13396e-7c09-40c9-acae-5bdd51c30017",
  "quote_id": "7f1ed9a4-b89e-4d5b-881e-77ac73514dd5",
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
  "id": "5a47047a-a284-4789-a60e-ff9398ff1ef1",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1d7098a5-7986-44f9-998d-42d4adf8bbf8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:06:48.261017Z",
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
    "id": "68eec58e-4cbe-41c5-9a5d-d2f507996af3",
    "order_id": "5a47047a-a284-4789-a60e-ff9398ff1ef1",
    "expires_at": "2026-10-30T10:07:03.268539Z",
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

`POST /api/driver/v1/offers/68eec58e-4cbe-41c5-9a5d-d2f507996af3/accept` → **200**

```json
{
  "command_id": "cec84fbd-b72c-4faa-a0aa-b8347b8319cd"
}
```

```json
{
  "id": "7bf65d7e-3c30-4c3c-9299-e64a2ba03dd4",
  "order_id": "5a47047a-a284-4789-a60e-ff9398ff1ef1",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c8bc91db-bc3d-434a-97b7-9881bd5eb9b2",
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
  "command_id": "4fb80755-0f36-47aa-ad21-b9f7dcbb0a75",
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
  "changed_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T10:06:49.162887325Z"
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
  "id": "c8bc91db-bc3d-434a-97b7-9881bd5eb9b2",
  "order_id": "5a47047a-a284-4789-a60e-ff9398ff1ef1",
  "assignment_id": "7bf65d7e-3c30-4c3c-9299-e64a2ba03dd4",
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

`POST /api/driver/v1/work-sessions/7b765fbf-8aec-400b-ba57-4486c2768d26/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:49Z",
    "sequence": 1793354809778
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7b765fbf-8aec-400b-ba57-4486c2768d26",
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
  "last_heartbeat_at": "2026-10-30T10:06:49.798535Z",
  "last_location_at": "2026-10-30T10:06:49.798535Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/c8bc91db-bc3d-434a-97b7-9881bd5eb9b2/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "15857858-81bb-4fde-b04b-788ec7934f66",
  "expected_version": 0
}
```

```json
{
  "id": "c8bc91db-bc3d-434a-97b7-9881bd5eb9b2",
  "order_id": "5a47047a-a284-4789-a60e-ff9398ff1ef1",
  "assignment_id": "7bf65d7e-3c30-4c3c-9299-e64a2ba03dd4",
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
  "arrived_at": "2026-10-30T10:06:50.005244Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c8bc91db-bc3d-434a-97b7-9881bd5eb9b2/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "e9980457-0e53-461a-a561-3913163fdf38",
  "expected_version": 1
}
```

```json
{
  "id": "c8bc91db-bc3d-434a-97b7-9881bd5eb9b2",
  "order_id": "5a47047a-a284-4789-a60e-ff9398ff1ef1",
  "assignment_id": "7bf65d7e-3c30-4c3c-9299-e64a2ba03dd4",
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
  "arrived_at": "2026-10-30T10:06:50.005244Z",
  "started_at": "2026-10-30T10:06:50.211406Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c8bc91db-bc3d-434a-97b7-9881bd5eb9b2/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "bdff2bb7-7b06-4788-a711-3f39423fce04",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:06:50Z",
  "cash_received": true
}
```

```json
{
  "id": "c8bc91db-bc3d-434a-97b7-9881bd5eb9b2",
  "order_id": "5a47047a-a284-4789-a60e-ff9398ff1ef1",
  "assignment_id": "7bf65d7e-3c30-4c3c-9299-e64a2ba03dd4",
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
  "arrived_at": "2026-10-30T10:06:50.005244Z",
  "started_at": "2026-10-30T10:06:50.211406Z",
  "completed_at": "2026-10-30T10:06:50.431392Z",
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
  "session_id": "7b765fbf-8aec-400b-ba57-4486c2768d26",
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
  "last_heartbeat_at": "2026-10-30T10:06:49.798535Z",
  "last_location_at": "2026-10-30T10:06:49.798535Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7b765fbf-8aec-400b-ba57-4486c2768d26/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "c1f9f04e-8aec-42ef-88b7-42dd23495fbc",
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
  "command_id": "fa50ab1e-dd98-43ab-877f-bc27eb1c5b0a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:51Z",
    "sequence": 1793354811210
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
  "correlation_id": "f3c8f1bc-fec5-4252-b189-1c64acbd25a4",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "49818e92-6cc5-42a3-bd1e-37737bde5d7f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:51Z",
    "sequence": 1793354811234
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "404c2de7-a106-4cc7-94a9-30a2c069f4f3",
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
  "last_heartbeat_at": "2026-10-30T10:06:51.253512Z",
  "last_location_at": "2026-10-30T10:06:51.253512Z",
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
  "changed_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T10:06:49.162887Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "7f220808-3f7c-4538-9006-8b1f45707102",
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
  "changed_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T10:06:51.64488832Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "404c2de7-a106-4cc7-94a9-30a2c069f4f3",
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
  "last_heartbeat_at": "2026-10-30T10:06:51.253512Z",
  "last_location_at": "2026-10-30T10:06:51.253512Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/404c2de7-a106-4cc7-94a9-30a2c069f4f3/close` → **200**

```json
{
  "command_id": "7f370252-45e3-4c5b-ae0f-75a8752adf95",
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
  "session_id": "5bf110ae-c32f-4500-8514-62e3d6b0004f",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3MTIsImlhdCI6MTc5MzM1NDgxMiwianRpIjoiZGRhMzQ0MjktMGZiZC00YzJlLTliMTQtYTkyMjlkMjlmNmUzIiwic2lkIjoiNWJmMTEwYWUtYzMyZi00NTAwLTg1MTQtNjJlM2Q2YjAwMDRmIn0.L9VnV11iMvf9HsaNOWm61lNtLFaihTcS24dmvvW71a0",
  "access_expires_at": "2026-10-30T10:21:52.441693874Z",
  "refresh_token": "ltoVcDq05VAFDDxS_0wW1vi49Y0QN2DkdMcj_9aquIA",
  "refresh_expires_at": "2026-10-30T22:06:52.441221076Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "0d22cee0-328a-42b8-af1a-b61b6e55d892",
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
  "id": "2389f6c5-52ab-4033-819e-77969e5c898a",
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
  "created_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "created_at": "2026-10-30T10:06:52.641125Z",
  "updated_at": "2026-10-30T10:06:52.641125Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636995198",
  "device_ref": "sandbox-25550"
}
```

```json
{
  "challenge_id": "603c6410-0d99-420d-9081-17d6da9d65ee",
  "expires_at": "2026-10-30T10:11:52.842451601Z",
  "resend_available_at": "2026-10-30T10:06:53.842451601Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636995198` → **200**

```json
{
  "phone": "+380636995198",
  "audience": "CLIENT",
  "code": "467929",
  "sent_at": "2026-10-30T10:06:52.851866226Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "603c6410-0d99-420d-9081-17d6da9d65ee",
  "code": "467929",
  "device_ref": "sandbox-25550"
}
```

```json
{
  "session_id": "32255883-2ec7-4486-b8c9-abbcbb7e0969",
  "subject": {
    "type": "CLIENT",
    "id": "a7b8fcd5-298e-43d6-8326-1354150cd067"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2I4ZmNkNS0yOThlLTQzZDYtODMyNi0xMzU0MTUwY2QwNjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NzEzLCJpYXQiOjE3OTMzNTQ4MTMsImp0aSI6ImMxYjUyYWJjLTkyNGEtNDg5NC05Y2YzLTc5YzAwMGM5MTQ4OCIsInNpZCI6IjMyMjU1ODgzLTJlYzctNDQ4Ni1iOGM5LWFiYmNiYjdlMDk2OSJ9.fYNdI2PcB3JT7A9oQVqb5uJsz0ykAnl7slcR6Bm--qQ",
  "access_expires_at": "2026-10-30T10:21:53.076996473Z",
  "refresh_token": "VYV7hn58ED8a6X67W3o9SJWGoPJgSdV3LwzEZ2iOUD4",
  "refresh_expires_at": "2026-11-29T10:06:53.07648547Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380636995198` → **200**

```json
{
  "client_id": "a7b8fcd5-298e-43d6-8326-1354150cd067"
}
```

`POST /api/admin/v1/rider-wallets/a7b8fcd5-298e-43d6-8326-1354150cd067/top-ups` → **201**

```json
{
  "command_id": "ce004149-8296-4bbf-a393-13d3c2673669",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "a7b8fcd5-298e-43d6-8326-1354150cd067",
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
      "id": "ae04d5c2-7cee-4f4b-9404-d42544c1e15f",
      "at": "2026-10-30T10:06:53.474319Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2c438604-56ff-431a-b290-c1295990cbed",
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
  "id": "0fa1943d-6bb5-40d5-b20e-9b0c3560a880",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:11:53.681943Z",
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
      "id": "2389f6c5-52ab-4033-819e-77969e5c898a",
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
  "device_ref": "sandbox-30443"
}
```

```json
{
  "challenge_id": "ed0d6f30-3998-42db-8e8d-d078347ec8f1",
  "expires_at": "2026-10-30T10:11:53.870531876Z",
  "resend_available_at": "2026-10-30T10:06:54.870531876Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "572994",
  "sent_at": "2026-10-30T10:06:53.873709575Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ed0d6f30-3998-42db-8e8d-d078347ec8f1",
  "code": "572994",
  "device_ref": "sandbox-30443"
}
```

```json
{
  "session_id": "d6ad1da4-f16a-46d0-b233-ccb8fc6c8311",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTcxNCwiaWF0IjoxNzkzMzU0ODE0LCJqdGkiOiJlY2YzOTYzZC0yNTQ3LTQzNTYtYjYyYy01ZTg2ODBiNmRiNDMiLCJzaWQiOiJkNmFkMWRhNC1mMTZhLTQ2ZDAtYjIzMy1jY2I4ZmM2YzgzMTEifQ.L5SNgrAsacNYqYC3qAADHNMjd1Ynm0528dlZ7c6m4DU",
  "access_expires_at": "2026-10-30T10:21:54.086683383Z",
  "refresh_token": "XEDWfqiJeNT_ELLKb74RYxuU3WbjrZuQefFmerCwQw8",
  "refresh_expires_at": "2026-11-29T10:06:54.086189729Z",
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
  "command_id": "033693e3-9d3c-4638-bbf5-b9bc1919a4f3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:54Z",
    "sequence": 1793354814468
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "63a01ccc-5705-4341-a065-5a8c582d896b",
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
  "last_heartbeat_at": "2026-10-30T10:06:54.485832Z",
  "last_location_at": "2026-10-30T10:06:54.485832Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "fa03ce09-880a-47ed-9adc-95e8f1621a1f",
  "quote_id": "0fa1943d-6bb5-40d5-b20e-9b0c3560a880",
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
  "id": "5ae57c5b-8540-4347-8dea-459ee117714d",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a7b8fcd5-298e-43d6-8326-1354150cd067",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:06:54.69884Z",
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
  "client_id": "a7b8fcd5-298e-43d6-8326-1354150cd067",
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
      "id": "ae04d5c2-7cee-4f4b-9404-d42544c1e15f",
      "at": "2026-10-30T10:06:53.474319Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "fc83930a-0f00-4627-8f4f-e260893ced8f",
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
    "id": "e3537d73-3ddd-4075-901f-0c8b85931f95",
    "order_id": "5ae57c5b-8540-4347-8dea-459ee117714d",
    "expires_at": "2026-10-30T10:07:09.704464Z",
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

`POST /api/driver/v1/offers/e3537d73-3ddd-4075-901f-0c8b85931f95/accept` → **200**

```json
{
  "command_id": "93f49030-6d76-4df4-bc70-e458acf6289e"
}
```

```json
{
  "id": "d025b967-3ab3-409d-ad93-040a6e054807",
  "order_id": "5ae57c5b-8540-4347-8dea-459ee117714d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4916aa6e-f868-468f-a1fb-83e64c4f51b3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4916aa6e-f868-468f-a1fb-83e64c4f51b3",
  "order_id": "5ae57c5b-8540-4347-8dea-459ee117714d",
  "assignment_id": "d025b967-3ab3-409d-ad93-040a6e054807",
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

(the car drives 3 s to the next point)

`POST /api/driver/v1/work-sessions/63a01ccc-5705-4341-a065-5a8c582d896b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:58Z",
    "sequence": 1793354818699
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "63a01ccc-5705-4341-a065-5a8c582d896b",
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
  "last_heartbeat_at": "2026-10-30T10:06:58.717588Z",
  "last_location_at": "2026-10-30T10:06:58.717588Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/4916aa6e-f868-468f-a1fb-83e64c4f51b3/arrive` → **200**

```json
{
  "command_id": "a525079e-1951-41a6-ad5d-2c5bbbaf6ab6",
  "expected_version": 0
}
```

```json
{
  "id": "4916aa6e-f868-468f-a1fb-83e64c4f51b3",
  "order_id": "5ae57c5b-8540-4347-8dea-459ee117714d",
  "assignment_id": "d025b967-3ab3-409d-ad93-040a6e054807",
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
  "arrived_at": "2026-10-30T10:06:58.918536Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4916aa6e-f868-468f-a1fb-83e64c4f51b3/start` → **200**

```json
{
  "command_id": "91fb6aa0-f77e-4d36-9db6-b65eec39ac32",
  "expected_version": 1
}
```

```json
{
  "id": "4916aa6e-f868-468f-a1fb-83e64c4f51b3",
  "order_id": "5ae57c5b-8540-4347-8dea-459ee117714d",
  "assignment_id": "d025b967-3ab3-409d-ad93-040a6e054807",
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
  "arrived_at": "2026-10-30T10:06:58.918536Z",
  "started_at": "2026-10-30T10:06:59.12147Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/4916aa6e-f868-468f-a1fb-83e64c4f51b3/complete` → **200**

```json
{
  "command_id": "af9265dd-63db-450a-aff9-d17b5c8c7468",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:06:59Z",
  "cash_received": true
}
```

```json
{
  "id": "4916aa6e-f868-468f-a1fb-83e64c4f51b3",
  "order_id": "5ae57c5b-8540-4347-8dea-459ee117714d",
  "assignment_id": "d025b967-3ab3-409d-ad93-040a6e054807",
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
  "arrived_at": "2026-10-30T10:06:58.918536Z",
  "started_at": "2026-10-30T10:06:59.12147Z",
  "completed_at": "2026-10-30T10:06:59.351129Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a7b8fcd5-298e-43d6-8326-1354150cd067",
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
      "id": "7f28c4bd-fd68-478b-87ac-1402f8180cef",
      "at": "2026-10-30T10:07:00.229047Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "5ae57c5b-8540-4347-8dea-459ee117714d"
    },
    {
      "id": "ae04d5c2-7cee-4f4b-9404-d42544c1e15f",
      "at": "2026-10-30T10:06:53.474319Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/2389f6c5-52ab-4033-819e-77969e5c898a/archive` → **200**

```json
{
  "command_id": "3cbcf7d7-10cc-4598-96c9-a759d05f9d82",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "2389f6c5-52ab-4033-819e-77969e5c898a",
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
  "created_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "created_at": "2026-10-30T10:06:52.641125Z",
  "updated_at": "2026-10-30T10:07:02.756413Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "63a01ccc-5705-4341-a065-5a8c582d896b",
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
  "last_heartbeat_at": "2026-10-30T10:06:58.717588Z",
  "last_location_at": "2026-10-30T10:06:58.717588Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/63a01ccc-5705-4341-a065-5a8c582d896b/close` → **200**

```json
{
  "command_id": "8122d77b-e2db-4bcb-874d-543a3529081b",
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

Done: order 5ae57c5b-8540-4347-8dea-459ee117714d.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-27664"
}
```

```json
{
  "challenge_id": "3f63f8f0-7ddd-4ece-a633-69c9f9e5227d",
  "expires_at": "2026-10-30T10:12:03.357983066Z",
  "resend_available_at": "2026-10-30T10:07:04.357983066Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "813495",
  "sent_at": "2026-10-30T10:07:03.362393224Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3f63f8f0-7ddd-4ece-a633-69c9f9e5227d",
  "code": "813495",
  "device_ref": "sandbox-27664"
}
```

```json
{
  "session_id": "c7c5faee-302b-48d8-976c-1375d25d3249",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTcyMywiaWF0IjoxNzkzMzU0ODIzLCJqdGkiOiJiYmI2YTg1Ny02NDYyLTQ2ZWYtYjY3YS03NGNjMmYzNWYxZTYiLCJzaWQiOiJjN2M1ZmFlZS0zMDJiLTQ4ZDgtOTc2Yy0xMzc1ZDI1ZDMyNDkifQ.JfmjeYlhaquvPL2Z-23ZlHHE5Vsywt0-ofqFb08KBLg",
  "access_expires_at": "2026-10-30T10:22:03.585428258Z",
  "refresh_token": "4wLBO9U4LxTWXenRi7FdS4KzkV9PM4kCowmB-jtmPMk",
  "refresh_expires_at": "2026-11-29T10:07:03.584897749Z",
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
  "command_id": "6291ec93-c8d9-4ba5-b863-784cfa389f51",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:07:04Z",
    "sequence": 1793354824172
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "1ee49310-0f61-4f68-8e3a-f15c6af9c47a",
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
  "last_heartbeat_at": "2026-10-30T10:07:04.190666Z",
  "last_location_at": "2026-10-30T10:07:04.190666Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/1ee49310-0f61-4f68-8e3a-f15c6af9c47a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:07:09Z",
    "sequence": 1793354829399
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "1ee49310-0f61-4f68-8e3a-f15c6af9c47a",
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
  "last_heartbeat_at": "2026-10-30T10:07:09.417088Z",
  "last_location_at": "2026-10-30T10:07:04.190666Z",
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
  "session_id": "da44c78b-c78f-4059-a439-165d9e11902a",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3MjksImlhdCI6MTc5MzM1NDgyOSwianRpIjoiY2ZjOTFlZTQtYjM5YS00MmIxLTkwZTMtNjhjYjk5OGZmYTQ2Iiwic2lkIjoiZGE0NGM3OGItYzc4Zi00MDU5LWE0MzktMTY1ZDllMTE5MDJhIn0.AkVZc_VmA66P_vHxz9wtcvLDz2rPh6NJdi2sTQZoSG4",
  "access_expires_at": "2026-10-30T10:22:09.83132155Z",
  "refresh_token": "mWTDO9DO1cCF7DImDdAPKV4YCEPI3MNDEg0uuDq73Y4",
  "refresh_expires_at": "2026-10-30T22:07:09.830855144Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T10:07:10.026077874Z",
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
      "last_location_at": "2026-10-30T10:07:04.190666Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/1ee49310-0f61-4f68-8e3a-f15c6af9c47a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:07:10Z",
    "sequence": 1793354830231
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "1ee49310-0f61-4f68-8e3a-f15c6af9c47a",
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
  "last_heartbeat_at": "2026-10-30T10:07:10.249596Z",
  "last_location_at": "2026-10-30T10:07:10.249596Z",
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
  "session_id": "1ee49310-0f61-4f68-8e3a-f15c6af9c47a",
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
  "last_heartbeat_at": "2026-10-30T10:07:10.249596Z",
  "last_location_at": "2026-10-30T10:07:10.249596Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1ee49310-0f61-4f68-8e3a-f15c6af9c47a/close` → **200**

```json
{
  "command_id": "c1731069-db3d-41b6-9f4a-29e295b1a606",
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
  "device_ref": "sandbox-30443"
}
```

```json
{
  "challenge_id": "b9f22848-9515-452f-97c1-e212b67e89c6",
  "expires_at": "2026-10-30T10:12:10.857430309Z",
  "resend_available_at": "2026-10-30T10:07:11.857430309Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "818172",
  "sent_at": "2026-10-30T10:07:10.860632405Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9f22848-9515-452f-97c1-e212b67e89c6",
  "code": "818172",
  "device_ref": "sandbox-30443"
}
```

```json
{
  "session_id": "7f81b363-f826-4090-99af-6863377578dc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTczMSwiaWF0IjoxNzkzMzU0ODMxLCJqdGkiOiJlNDdkOWZmYy1mZWQ4LTQwODgtODBiOS02YzYwNzBhMGQ0YTYiLCJzaWQiOiI3ZjgxYjM2My1mODI2LTQwOTAtOTlhZi02ODYzMzc3NTc4ZGMifQ.W5u8K0FY7bKHLEXzciyOxQpfemVhJaPWakWm0HhI1Eo",
  "access_expires_at": "2026-10-30T10:22:11.075837621Z",
  "refresh_token": "ynBdnk3Az70iDLoj7YTKRJA3Zqrrz9S03of6FwS-pfo",
  "refresh_expires_at": "2026-11-29T10:07:11.075262422Z",
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
  "device_ref": "sandbox-4333"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "de68d2f0-1670-4e7d-8a92-1055ed8486e6",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-4333"
}
```

```json
{
  "challenge_id": "4e98d807-755d-46e9-84c9-c1be6c7ec9ce",
  "expires_at": "2026-10-30T10:12:12.644745955Z",
  "resend_available_at": "2026-10-30T10:07:13.644745955Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "697968",
  "sent_at": "2026-10-30T10:07:12.647455687Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4e98d807-755d-46e9-84c9-c1be6c7ec9ce",
  "code": "697968",
  "device_ref": "sandbox-4333"
}
```

```json
{
  "session_id": "bf7f2035-51d9-4520-9885-1616c69a2e24",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTczMiwiaWF0IjoxNzkzMzU0ODMyLCJqdGkiOiJkODZiOTgxOS1lNzQ3LTRhOTgtYWUwMi1jYWM3ZThiMzdkMGUiLCJzaWQiOiJiZjdmMjAzNS01MWQ5LTQ1MjAtOTg4NS0xNjE2YzY5YTJlMjQifQ.RFYO8NNK3Z8uS3DFEqCIF9_MF3yE2Bh9PlJlidhxs-g",
  "access_expires_at": "2026-10-30T10:22:12.861274655Z",
  "refresh_token": "g4TobOb-Ef0Ikya3kN4yRYVkiQaGB3ezMFfxmSekqho",
  "refresh_expires_at": "2026-11-29T10:07:12.86088174Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-25145"
}
```

```json
{
  "challenge_id": "397d159e-7b49-4c47-a025-26ecb4a50604",
  "expires_at": "2026-10-30T10:12:13.055231231Z",
  "resend_available_at": "2026-10-30T10:07:14.055231231Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "618911",
  "sent_at": "2026-10-30T10:07:13.057835449Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "397d159e-7b49-4c47-a025-26ecb4a50604",
  "code": "618911",
  "device_ref": "sandbox-25145"
}
```

```json
{
  "session_id": "22733e26-7fb6-4672-a8bb-c28eb993fd01",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTczMywiaWF0IjoxNzkzMzU0ODMzLCJqdGkiOiI4MzM5OWRjMi0zMDUyLTRlY2MtYjg0Ni0wZGE2MTcwMGM5YzIiLCJzaWQiOiIyMjczM2UyNi03ZmI2LTQ2NzItYThiYi1jMjhlYjk5M2ZkMDEifQ.nngMa2AnT3CMu5H4R49M0wb5R-gtHolkSakngadcD_Y",
  "access_expires_at": "2026-10-30T10:22:13.27057714Z",
  "refresh_token": "SZBExbnu8t5HUk9DG8t0h6jYGG91Msa52UaQIW3f5jA",
  "refresh_expires_at": "2026-11-29T10:07:13.27011169Z",
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

(the car drives 185 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "61b2f752-ad75-4a9d-b46e-9bca3879fa18",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:10:18Z",
    "sequence": 1793355018857
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "2ce4b3f2-854a-4b5e-b51e-744689e69284",
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
  "last_heartbeat_at": "2026-10-30T10:10:18.873367Z",
  "last_location_at": "2026-10-30T10:10:18.873367Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600408397",
  "device_ref": "sandbox-3123"
}
```

```json
{
  "challenge_id": "f8e59758-7e6b-4ebb-8fcc-77ca746f2594",
  "expires_at": "2026-10-30T10:15:19.058216803Z",
  "resend_available_at": "2026-10-30T10:10:20.058216803Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600408397` → **200**

```json
{
  "phone": "+48600408397",
  "audience": "CLIENT",
  "code": "654009",
  "sent_at": "2026-10-30T10:10:19.06075227Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f8e59758-7e6b-4ebb-8fcc-77ca746f2594",
  "code": "654009",
  "device_ref": "sandbox-3123"
}
```

```json
{
  "session_id": "a97ed32e-6247-4b75-9944-7f13f3c0888f",
  "subject": {
    "type": "CLIENT",
    "id": "9c536601-8a58-46f7-92e2-e8a7e8c5df35"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YzUzNjYwMS04YTU4LTQ2ZjctOTJlMi1lOGE3ZThjNWRmMzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1OTE5LCJpYXQiOjE3OTMzNTUwMTksImp0aSI6IjQwOTVlZjkwLTNlMDYtNDZhZC04ZTQ5LWE1OTFjZTkyYzViMCIsInNpZCI6ImE5N2VkMzJlLTYyNDctNGI3NS05OTQ0LTdmMTNmM2MwODg4ZiJ9.6YurmDVa4cVCffgaOIbx2BF6g_gg0U7paBV0JcNK-eE",
  "access_expires_at": "2026-10-30T10:25:19.264228351Z",
  "refresh_token": "Qz78pw5wGyq25PaacX_DGdcKT1-a-0c1YY02IBtAEYA",
  "refresh_expires_at": "2026-11-29T10:10:19.263815868Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c0e01d3a-1649-4295-866c-63ed7cad55b1",
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
  "id": "4a5265be-b73f-4acf-882c-df0e3feea782",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:15:19.465184Z",
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
  "command_id": "b1b2f0bd-68f4-45d0-81d9-15c3bff9551a",
  "quote_id": "4a5265be-b73f-4acf-882c-df0e3feea782",
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
  "id": "968770f5-c4f0-4d89-b15b-16f3622e1260",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c536601-8a58-46f7-92e2-e8a7e8c5df35",
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
  "created_at": "2026-10-30T10:10:19.65711Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/968770f5-c4f0-4d89-b15b-16f3622e1260` → **200**

```json
{
  "id": "968770f5-c4f0-4d89-b15b-16f3622e1260",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c536601-8a58-46f7-92e2-e8a7e8c5df35",
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
  "created_at": "2026-10-30T10:10:19.65711Z",
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

`POST /api/driver/v1/orders/968770f5-c4f0-4d89-b15b-16f3622e1260/claim` → **422**

```json
{
  "command_id": "bf25eccb-cf46-41f1-a6bd-f38d7382b1dd"
}
```

```json
{
  "instance": "/api/driver/v1/orders/968770f5-c4f0-4d89-b15b-16f3622e1260/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "7a174f71-1a15-4629-8d57-0b7b0d844261"
}
```

`GET /api/rider/v1/orders/968770f5-c4f0-4d89-b15b-16f3622e1260` → **200**

```json
{
  "id": "968770f5-c4f0-4d89-b15b-16f3622e1260",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c536601-8a58-46f7-92e2-e8a7e8c5df35",
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
  "created_at": "2026-10-30T10:10:19.65711Z",
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

`POST /api/driver/v1/orders/afc719a0-dcb2-4ef7-a753-442015fac801/claim` → **404**

```json
{
  "command_id": "d03a7d83-3812-4606-a41e-f6483d7dbe9d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/afc719a0-dcb2-4ef7-a753-442015fac801/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "901c9d2b-7946-4c3d-aa1a-8e268d1b7f4e"
}
```

`POST /api/driver/v1/orders/110fee8f-46b8-4477-b250-ed3003aac7e6/claim` → **404**

```json
{
  "command_id": "e78cdf13-746d-4f20-8d24-e4829bd83c8b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/110fee8f-46b8-4477-b250-ed3003aac7e6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7b25b58f-4304-4b73-a8b9-e0da21306ecd"
}
```

`POST /api/driver/v1/orders/e0ac67e3-dfb9-4aa2-ba4c-12dbe2c8d766/claim` → **404**

```json
{
  "command_id": "3444b636-a93a-4da2-ad9e-82f9bab4e33d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e0ac67e3-dfb9-4aa2-ba4c-12dbe2c8d766/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "75fa6b48-46d3-486a-9390-488034885e83"
}
```

`POST /api/driver/v1/orders/7f10c5de-c70f-4093-af9a-d902f7310cd7/claim` → **404**

```json
{
  "command_id": "982174df-e418-49a3-8d57-de108928a338"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7f10c5de-c70f-4093-af9a-d902f7310cd7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d2d4bec2-8be4-4198-8273-bb47ee3ac57e"
}
```

`POST /api/driver/v1/orders/13858734-b58a-4c07-a233-a1677c3da7b3/claim` → **404**

```json
{
  "command_id": "00ee7a1f-5681-4804-8728-e98c5c027eb0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/13858734-b58a-4c07-a233-a1677c3da7b3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d48a74e8-f214-418b-bf10-d0c9f186898d"
}
```

`POST /api/driver/v1/orders/b52d1054-92dd-4a77-9ad8-0ad7850dc68d/claim` → **404**

```json
{
  "command_id": "59fb09bb-d428-4a4a-b27f-83761055cf88"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b52d1054-92dd-4a77-9ad8-0ad7850dc68d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7c50ff6a-4ad3-4154-b5dd-6d117030bd7a"
}
```

`POST /api/driver/v1/orders/524a2d4f-4282-44a1-9b59-30f2e8e54922/claim` → **404**

```json
{
  "command_id": "8de8edce-b386-4155-8983-31bcc3806f7f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/524a2d4f-4282-44a1-9b59-30f2e8e54922/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "93739cd8-0398-4866-9d1d-3f60a2bd6ba1"
}
```

`POST /api/driver/v1/orders/01f8f3bc-f238-4aec-8793-34d92bc74e6e/claim` → **404**

```json
{
  "command_id": "62e3f94d-12c9-4819-91f3-fddd2b4cc26c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/01f8f3bc-f238-4aec-8793-34d92bc74e6e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "106afa68-ac2f-4070-acbf-9968132e7fdc"
}
```

`POST /api/driver/v1/orders/394ba3f4-bec4-42c1-a174-45ba5199be6f/claim` → **404**

```json
{
  "command_id": "0fe5e65f-9969-4da0-82cb-292db073f8e0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/394ba3f4-bec4-42c1-a174-45ba5199be6f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ed638cda-ba04-4498-bb31-f4a76da3032b"
}
```

`POST /api/driver/v1/orders/294a1b07-be7c-4968-a971-c70e72fcfe4e/claim` → **404**

```json
{
  "command_id": "5dbbf4c7-f891-470b-85b8-a63c24d70055"
}
```

```json
{
  "instance": "/api/driver/v1/orders/294a1b07-be7c-4968-a971-c70e72fcfe4e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f0cfe330-1340-42c0-bd4e-890faa768cf6"
}
```

`POST /api/driver/v1/orders/3824e804-71e7-4cb7-9b2b-e89c391c2ec7/claim` → **404**

```json
{
  "command_id": "62ff7556-eec4-4ff1-9c59-14f7fc6df9b7"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3824e804-71e7-4cb7-9b2b-e89c391c2ec7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d2c05726-2f53-4432-89ce-585c78903af5"
}
```

`POST /api/driver/v1/orders/5e0b09e7-aea0-4975-a06d-b01129a054bf/claim` → **404**

```json
{
  "command_id": "63648edb-bc8f-4a6b-bd06-20fb6582a96a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5e0b09e7-aea0-4975-a06d-b01129a054bf/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c63fcda5-f469-4276-9ced-b0c1caad7dec"
}
```

`POST /api/driver/v1/orders/52014f85-298b-4f21-8ed0-4bffac8785b7/claim` → **404**

```json
{
  "command_id": "7c5cbf55-9bec-4d80-90dc-9b6790c5aebb"
}
```

```json
{
  "instance": "/api/driver/v1/orders/52014f85-298b-4f21-8ed0-4bffac8785b7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2e42d5f4-31d5-4ccc-8271-0ef7cb23888d"
}
```

`POST /api/driver/v1/orders/748d1300-7bff-4fcc-ac32-acfaed716ad6/claim` → **404**

```json
{
  "command_id": "6c1c974b-7c8b-4aed-8d13-84007485c117"
}
```

```json
{
  "instance": "/api/driver/v1/orders/748d1300-7bff-4fcc-ac32-acfaed716ad6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5ddf1bfc-6651-42c1-bd7a-2b83c1ec5b87"
}
```

`POST /api/driver/v1/orders/135d4bff-5a7e-48c1-b0bc-e31ec9c7ca42/claim` → **404**

```json
{
  "command_id": "0591cb6a-fc47-4c35-b2a4-19165aa734d1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/135d4bff-5a7e-48c1-b0bc-e31ec9c7ca42/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e815baf1-117b-4717-a484-66ba98943c99"
}
```

`POST /api/driver/v1/orders/ca2f0179-43d1-43d3-9a88-3a9b5d3d7501/claim` → **404**

```json
{
  "command_id": "077c6501-7277-48a4-b497-415738cef0de"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ca2f0179-43d1-43d3-9a88-3a9b5d3d7501/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fed0e844-9037-493e-888c-ec2726bfa1c4"
}
```

`POST /api/driver/v1/orders/1c4a064f-1f3e-4d2b-9aed-0731303caa9a/claim` → **404**

```json
{
  "command_id": "8bd29b4e-b2f8-4384-a9e7-4a35ac6d34ba"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1c4a064f-1f3e-4d2b-9aed-0731303caa9a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "feeb0fe0-7009-4dc3-baec-5c32cb84f436"
}
```

`POST /api/driver/v1/orders/0afa6653-6163-4fb7-aca8-77699ac2b73c/claim` → **404**

```json
{
  "command_id": "79531b10-1e92-46cb-96f3-f31b61cd0516"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0afa6653-6163-4fb7-aca8-77699ac2b73c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a5cfa567-9afe-4e43-8a0d-bba52416e6d1"
}
```

`POST /api/driver/v1/orders/e8be97d2-9437-4a0a-abb8-61dae140bc28/claim` → **404**

```json
{
  "command_id": "2bf91604-70da-41ed-988a-6bcc6ec8a55a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e8be97d2-9437-4a0a-abb8-61dae140bc28/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e88dbfac-b300-4975-8d71-57ededb727f1"
}
```

`POST /api/driver/v1/orders/f1e4cc17-8e1c-41d7-b4c9-84202f36209d/claim` → **404**

```json
{
  "command_id": "e38ebb6c-86e9-4122-911a-255ed66c4612"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f1e4cc17-8e1c-41d7-b4c9-84202f36209d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c1e0dc26-3f32-4463-b61e-6f2ce788bc56"
}
```

`POST /api/driver/v1/orders/855f704f-0a72-47ae-a138-eaba86e102ef/claim` → **404**

```json
{
  "command_id": "dad8fbf9-d1b7-49aa-a315-06d4561330a5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/855f704f-0a72-47ae-a138-eaba86e102ef/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0d88d78d-c29d-4d42-8b24-ec542e96d2d8"
}
```

`POST /api/driver/v1/orders/f1c8645e-f0c6-43ec-bb78-c15e1cef6d6c/claim` → **404**

```json
{
  "command_id": "6fce06d3-dd1a-4b0b-8af4-d31f0522e7dc"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f1c8645e-f0c6-43ec-bb78-c15e1cef6d6c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2b5a5e67-2b17-4646-9fe1-88d700bca39b"
}
```

`POST /api/driver/v1/orders/01c4f5c8-980e-489f-a6bd-39dcfa8da254/claim` → **404**

```json
{
  "command_id": "ac687435-486a-48c2-89a7-a1f25cdfbdef"
}
```

```json
{
  "instance": "/api/driver/v1/orders/01c4f5c8-980e-489f-a6bd-39dcfa8da254/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d01aab6e-0bd5-41bf-9d15-6eed05d238f0"
}
```

`POST /api/driver/v1/orders/7bb10956-1b55-4f93-a872-09d18d0d0faf/claim` → **404**

```json
{
  "command_id": "4989c02f-4162-4842-9404-e9defc64d795"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7bb10956-1b55-4f93-a872-09d18d0d0faf/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8f5ad594-329e-4454-be51-7cf9f281e581"
}
```

`POST /api/driver/v1/orders/1c817c35-4447-4b79-834c-14ee34b291c5/claim` → **404**

```json
{
  "command_id": "f2c8d887-451a-4305-8fff-b6bd60ec402b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1c817c35-4447-4b79-834c-14ee34b291c5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "374d0bf1-2310-418b-889d-8823d283ce11"
}
```

`POST /api/driver/v1/orders/17843923-3210-4a70-aa7c-535622d2be95/claim` → **404**

```json
{
  "command_id": "5e11ebe0-652d-4ab7-8605-f2795dc8b79d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/17843923-3210-4a70-aa7c-535622d2be95/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "619559c3-0b6d-4307-8543-2cd2c634cbd5"
}
```

`POST /api/driver/v1/orders/5edb94ac-4337-4537-a932-7e453389dc98/claim` → **404**

```json
{
  "command_id": "9979fcb9-e0a4-4aae-8806-4469ab590d7d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5edb94ac-4337-4537-a932-7e453389dc98/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "345a5aed-5a12-43ba-87c3-b7687c1d2cd7"
}
```

`POST /api/driver/v1/orders/b75ad3ea-892f-420d-adf6-4ee160f2dc23/claim` → **404**

```json
{
  "command_id": "1ffbd713-b70d-46fe-aa50-1db23cfcf0cb"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b75ad3ea-892f-420d-adf6-4ee160f2dc23/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7837da0b-400b-4d7c-8957-77baf861b54f"
}
```

`POST /api/driver/v1/orders/564f0e59-4088-41d0-9821-a36c6d71ed51/claim` → **404**

```json
{
  "command_id": "86ef43b0-eb86-4f7e-8c93-b9731157bf0d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/564f0e59-4088-41d0-9821-a36c6d71ed51/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a8d34bda-5802-42e7-994d-491d38e3f76e"
}
```

`POST /api/driver/v1/orders/e1f77694-c63b-4fba-8e9e-2b3a72976f83/claim` → **429**

```json
{
  "command_id": "2f8786f0-05bf-49bb-bc4e-b8a4ebfe84f0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e1f77694-c63b-4fba-8e9e-2b3a72976f83/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "4b6c64b5-7627-4552-bb76-f79668d67e6f",
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
  "command_id": "4dfecd53-ba87-41ac-8475-636fbe72088d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:10:26Z",
    "sequence": 1793355026954
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "7b223137-af59-4333-8e86-4b1c433b8238",
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
  "last_heartbeat_at": "2026-10-30T10:10:26.971135Z",
  "last_location_at": "2026-10-30T10:10:26.971135Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "968770f5-c4f0-4d89-b15b-16f3622e1260",
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

`POST /api/driver/v1/orders/968770f5-c4f0-4d89-b15b-16f3622e1260/claim` → **409**

```json
{
  "command_id": "30a7f8f8-c2d9-4127-98c3-987818289609"
}
```

```json
{
  "instance": "/api/driver/v1/orders/968770f5-c4f0-4d89-b15b-16f3622e1260/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0c7d3dd4-de86-46dd-8992-39dc7a066c3d"
}
```

`POST /api/driver/v1/orders/968770f5-c4f0-4d89-b15b-16f3622e1260/claim` → **200**

```json
{
  "command_id": "b492135c-f218-4630-838b-b6314d5f3c49"
}
```

```json
{
  "id": "47717c66-bd1e-4c4d-9bdd-4bae0a433035",
  "order_id": "968770f5-c4f0-4d89-b15b-16f3622e1260",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "7ad0acfa-a949-42f8-8bb4-7b3d1c6731ca",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7ad0acfa-a949-42f8-8bb4-7b3d1c6731ca",
  "order_id": "968770f5-c4f0-4d89-b15b-16f3622e1260",
  "assignment_id": "47717c66-bd1e-4c4d-9bdd-4bae0a433035",
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

`POST /api/driver/v1/trips/7ad0acfa-a949-42f8-8bb4-7b3d1c6731ca/cancel` → **200**

```json
{
  "command_id": "3df4096c-126a-430f-9394-86f8a1dc18fe",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "7ad0acfa-a949-42f8-8bb4-7b3d1c6731ca",
  "order_id": "968770f5-c4f0-4d89-b15b-16f3622e1260",
  "assignment_id": "47717c66-bd1e-4c4d-9bdd-4bae0a433035",
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

`GET /api/rider/v1/orders/968770f5-c4f0-4d89-b15b-16f3622e1260` → **200**

```json
{
  "id": "968770f5-c4f0-4d89-b15b-16f3622e1260",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9c536601-8a58-46f7-92e2-e8a7e8c5df35",
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
    "id": "47717c66-bd1e-4c4d-9bdd-4bae0a433035",
    "order_id": "968770f5-c4f0-4d89-b15b-16f3622e1260",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "7ad0acfa-a949-42f8-8bb4-7b3d1c6731ca",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T10:10:19.65711Z",
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
  "session_id": "2ce4b3f2-854a-4b5e-b51e-744689e69284",
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
  "last_heartbeat_at": "2026-10-30T10:10:18.873367Z",
  "last_location_at": "2026-10-30T10:10:18.873367Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2ce4b3f2-854a-4b5e-b51e-744689e69284/close` → **200**

```json
{
  "command_id": "61ebd253-ab31-4242-ad02-e05f19fcff17",
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
  "session_id": "7b223137-af59-4333-8e86-4b1c433b8238",
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
  "last_heartbeat_at": "2026-10-30T10:10:26.971135Z",
  "last_location_at": "2026-10-30T10:10:26.971135Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7b223137-af59-4333-8e86-4b1c433b8238/close` → **200**

```json
{
  "command_id": "2677edaf-1775-4fb1-9ca3-82278c90f34c",
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
  "session_id": "f7067df2-3339-4c06-8151-c045ad13e04a",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU5MjksImlhdCI6MTc5MzM1NTAyOSwianRpIjoiMzE0ZDE2YjgtMmU5My00NTkwLWFiMmYtMDYzODBkNThiMDA1Iiwic2lkIjoiZjcwNjdkZjItMzMzOS00YzA2LTgxNTEtYzA0NWFkMTNlMDRhIn0.vB_1FpcBZbELZj6teHMkmTvPkF-4ENpECVJ72Mh9MeY",
  "access_expires_at": "2026-10-30T10:25:29.37285783Z",
  "refresh_token": "DT4UAPAXTlVfx3X_dN7PcETSZUFTWYp3eehRbuKOcJg",
  "refresh_expires_at": "2026-10-30T22:10:29.372459979Z",
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
  "command_id": "055c964b-48b6-4a72-977f-1415b8e90dc2",
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
  "session_id": "616d4166-f1a6-4a61-8e31-edca51efb8f4",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU5MzAsImlhdCI6MTc5MzM1NTAzMCwianRpIjoiMmNkODQxMDctYzBjZS00Yjc3LWE0NjctNWYzZjQ4NzRkZmFhIiwic2lkIjoiNjE2ZDQxNjYtZjFhNi00YTYxLThlMzEtZWRjYTUxZWZiOGY0In0.SU520vz-IbMqETKQI8pHUh8fmtkV-ciPwpIkxK0j-3s",
  "access_expires_at": "2026-10-30T10:25:30.142946315Z",
  "refresh_token": "qpho02YFelVrVhar6xCVMjstP1St9rvR9A1EXorRQ3g",
  "refresh_expires_at": "2026-10-30T22:10:30.142546311Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.161807187",
    "linkedid": "1730052700.161807187",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676779906"
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
    "id": "1730052700.161807187",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "ba048669-f3ba-4da8-8114-f4f7ef447387",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380676779906",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T10:10:30.327427Z",
      "answered_at": null,
      "ended_at": "2026-10-30T10:10:30.349743Z",
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
    "id": "1730052600.3226110521",
    "linkedid": "1730052600.3226110521",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676779906"
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
      "id": "9d97db98-a464-48d6-b597-b80930034236",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676779906",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T10:10:30.587182Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/9d97db98-a464-48d6-b597-b80930034236/answer` → **200**

```json
{
  "command_id": "ff845e52-bb46-4f9c-b4f2-74ea41dc79d9"
}
```

```json
{
  "id": "9d97db98-a464-48d6-b597-b80930034236",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676779906",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "order_ids": [],
  "started_at": "2026-10-30T10:10:30.587182Z",
  "answered_at": "2026-10-30T10:10:30.814683Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.3226110521",
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
    "id": "1730052600.3226110521",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "9d97db98-a464-48d6-b597-b80930034236",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676779906",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "order_ids": [],
      "started_at": "2026-10-30T10:10:30.587182Z",
      "answered_at": "2026-10-30T10:10:30.814683Z",
      "ended_at": "2026-10-30T10:10:31.041756Z",
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
      "id": "9d97db98-a464-48d6-b597-b80930034236",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676779906",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "order_ids": [],
      "started_at": "2026-10-30T10:10:30.587182Z",
      "answered_at": "2026-10-30T10:10:30.814683Z",
      "ended_at": "2026-10-30T10:10:31.041756Z",
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
      "id": "9d97db98-a464-48d6-b597-b80930034236",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676779906",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "order_ids": [],
      "started_at": "2026-10-30T10:10:30.587182Z",
      "answered_at": "2026-10-30T10:10:30.814683Z",
      "ended_at": "2026-10-30T10:10:31.041756Z",
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
      "id": "9d97db98-a464-48d6-b597-b80930034236",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676779906",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "order_ids": [],
      "started_at": "2026-10-30T10:10:30.587182Z",
      "answered_at": "2026-10-30T10:10:30.814683Z",
      "ended_at": "2026-10-30T10:10:31.041756Z",
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
      "id": "9d97db98-a464-48d6-b597-b80930034236",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676779906",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "order_ids": [],
      "started_at": "2026-10-30T10:10:30.587182Z",
      "answered_at": "2026-10-30T10:10:30.814683Z",
      "ended_at": "2026-10-30T10:10:31.041756Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T10:10:38.002015Z"
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
      "id": "9d97db98-a464-48d6-b597-b80930034236",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676779906",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "order_ids": [],
      "started_at": "2026-10-30T10:10:30.587182Z",
      "answered_at": "2026-10-30T10:10:30.814683Z",
      "ended_at": "2026-10-30T10:10:31.041756Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T10:10:38.002015Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/9d97db98-a464-48d6-b597-b80930034236/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/9d97db98-a464-48d6-b597-b80930034236/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=9d97db98-a464-48d6-b597-b80930034236` → **200**

```json
{
  "changes": [
    {
      "id": "31454e54-462e-46ff-86b8-2f4d2b0eb62f",
      "occurred_at": "2026-10-30T10:10:40.240755Z",
      "actor_type": "STAFF",
      "actor_id": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "9d97db98-a464-48d6-b597-b80930034236",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"aac60395-461c-4405-9a87-1e2e5aed19b9\", \"order_ids\": []}",
      "correlation_id": "c4474bf8-1c8e-4615-a265-0160451431c1"
    },
    {
      "id": "2c7a6777-ff0b-4d34-9ae2-08353d319468",
      "occurred_at": "2026-10-30T10:10:40.213382Z",
      "actor_type": "STAFF",
      "actor_id": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "9d97db98-a464-48d6-b597-b80930034236",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"aac60395-461c-4405-9a87-1e2e5aed19b9\", \"order_ids\": []}",
      "correlation_id": "1622ded5-3fb8-454f-83b7-ed38b8fa59dc"
    }
  ]
}
```

Done: call 9d97db98-a464-48d6-b597-b80930034236 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20307"
}
```

```json
{
  "challenge_id": "f2ec8dff-edb8-49a9-8b06-1ade29143af8",
  "expires_at": "2026-10-30T10:15:40.481409194Z",
  "resend_available_at": "2026-10-30T10:10:41.481409194Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "317992",
  "sent_at": "2026-10-30T10:10:40.483630207Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f2ec8dff-edb8-49a9-8b06-1ade29143af8",
  "code": "317992",
  "device_ref": "sandbox-20307"
}
```

```json
{
  "session_id": "7a076691-4f16-4f1e-90d7-1999701741af",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTk0MCwiaWF0IjoxNzkzMzU1MDQwLCJqdGkiOiI4MGIzY2VlNC1mYmRiLTRmNzMtYmUxMC1hOTljNTkyNjY2ZjgiLCJzaWQiOiI3YTA3NjY5MS00ZjE2LTRmMWUtOTBkNy0xOTk5NzAxNzQxYWYifQ.Ewkk4rkxaE5_DhWxJU-fD4UQuu92V3TSjhtj0m9NDyE",
  "access_expires_at": "2026-10-30T10:25:40.68284802Z",
  "refresh_token": "lrTV2YwuVktSe-6Ug8GwrZlIJ5ZZpwHG5jyw8RjC0Vk",
  "refresh_expires_at": "2026-11-29T10:10:40.682485603Z",
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
  "command_id": "baf28266-d068-4460-9dca-2ea436db5aaa",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:10:41Z",
    "sequence": 1793355041567
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6ffc7115-e27a-4583-b700-c0f9a7ebe898",
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
  "last_heartbeat_at": "2026-10-30T10:10:41.073038Z",
  "last_location_at": "2026-10-30T10:10:41.073038Z",
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
  "session_id": "19b70d3a-a5b1-4da8-b198-f25a936ede9e",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU5NDEsImlhdCI6MTc5MzM1NTA0MSwianRpIjoiYmVkYTJjNmYtZjJjOC00NjVjLWFlZDQtMzg0NjhjZDUyYzk0Iiwic2lkIjoiMTliNzBkM2EtYTViMS00ZGE4LWIxOTgtZjI1YTkzNmVkZTllIn0.uCs0ggwa3n5ZYM3BsSebFo-EKhMbj5LQKU1NZXdYAYM",
  "access_expires_at": "2026-10-30T10:25:41.463677718Z",
  "refresh_token": "7EkoHdqqoz_vKuxl0EfqDq4qSXH0Tuh1rtPqe0MFMhg",
  "refresh_expires_at": "2026-10-30T22:10:41.46338068Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "0f52a9b6-4cce-4eed-b096-c6825a1fd5b3",
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
  "id": "39ead084-afbc-4d68-9adb-64b901d248b9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:15:41.652910Z",
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
  "command_id": "bf543c92-96e7-41e2-9fa9-509b08591634",
  "quote_id": "39ead084-afbc-4d68-9adb-64b901d248b9",
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
    "phone": "+380678858136"
  }
}
```

```json
{
  "id": "18a7dabe-2210-4669-9ed6-73fea5eab461",
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
  "created_at": "2026-10-30T10:10:41.867349Z",
  "caller": {
    "name": "Олена",
    "phone": "+380678858136"
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
    "id": "248e17fe-1570-4829-992c-7fcae068a829",
    "order_id": "18a7dabe-2210-4669-9ed6-73fea5eab461",
    "expires_at": "2026-10-30T10:10:56.870232Z",
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

`POST /api/driver/v1/offers/248e17fe-1570-4829-992c-7fcae068a829/accept` → **200**

```json
{
  "command_id": "cb7b908c-837e-4925-b67c-71ea63c8d127"
}
```

```json
{
  "id": "cee25ab7-6d0b-45e1-9da6-3a7fad815b4c",
  "order_id": "18a7dabe-2210-4669-9ed6-73fea5eab461",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a1bfde36-77c8-4678-ab27-313626716350",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380678858136` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678858136` → **200**

```json
[
  {
    "phone": "+380678858136",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:10:43.465570577Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678858136` → **200**

```json
[
  {
    "phone": "+380678858136",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:10:43.465570577Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678858136` → **200**

```json
[
  {
    "phone": "+380678858136",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:10:43.465570577Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a1bfde36-77c8-4678-ab27-313626716350",
  "order_id": "18a7dabe-2210-4669-9ed6-73fea5eab461",
  "assignment_id": "cee25ab7-6d0b-45e1-9da6-3a7fad815b4c",
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
    "phone": "+380678858136"
  }
}
```

`POST /api/driver/v1/work-sessions/6ffc7115-e27a-4583-b700-c0f9a7ebe898/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:10:43Z",
    "sequence": 1793355043805
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6ffc7115-e27a-4583-b700-c0f9a7ebe898",
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
  "last_heartbeat_at": "2026-10-30T10:10:43.821714Z",
  "last_location_at": "2026-10-30T10:10:43.821714Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a1bfde36-77c8-4678-ab27-313626716350/arrive` → **200**

```json
{
  "command_id": "55b4d4ad-b05b-4a39-9817-446594ee14a7",
  "expected_version": 0
}
```

```json
{
  "id": "a1bfde36-77c8-4678-ab27-313626716350",
  "order_id": "18a7dabe-2210-4669-9ed6-73fea5eab461",
  "assignment_id": "cee25ab7-6d0b-45e1-9da6-3a7fad815b4c",
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
  "arrived_at": "2026-10-30T10:10:44.021792Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678858136"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380678858136` → **200**

```json
[
  {
    "phone": "+380678858136",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:10:43.465570577Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678858136` → **200**

```json
[
  {
    "phone": "+380678858136",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:10:43.465570577Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678858136` → **200**

```json
[
  {
    "phone": "+380678858136",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:10:43.465570577Z"
  },
  {
    "phone": "+380678858136",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T10:10:45.472951164Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678858136` → **200**

```json
[
  {
    "phone": "+380678858136",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:10:43.465570577Z"
  },
  {
    "phone": "+380678858136",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T10:10:45.472951164Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678858136` → **200**

```json
[
  {
    "phone": "+380678858136",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:10:43.465570577Z"
  },
  {
    "phone": "+380678858136",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T10:10:45.472951164Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/a1bfde36-77c8-4678-ab27-313626716350/start` → **200**

```json
{
  "command_id": "d6cf479d-3420-4da8-9ded-84ed607ec54c",
  "expected_version": 1
}
```

```json
{
  "id": "a1bfde36-77c8-4678-ab27-313626716350",
  "order_id": "18a7dabe-2210-4669-9ed6-73fea5eab461",
  "assignment_id": "cee25ab7-6d0b-45e1-9da6-3a7fad815b4c",
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
  "arrived_at": "2026-10-30T10:10:44.021792Z",
  "started_at": "2026-10-30T10:10:46.361849Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678858136"
  }
}
```

`POST /api/driver/v1/trips/a1bfde36-77c8-4678-ab27-313626716350/complete` → **200**

```json
{
  "command_id": "512c6438-1c2b-4ad6-b63a-5f68f9fa5b00",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:10:46Z",
  "cash_received": true
}
```

```json
{
  "id": "a1bfde36-77c8-4678-ab27-313626716350",
  "order_id": "18a7dabe-2210-4669-9ed6-73fea5eab461",
  "assignment_id": "cee25ab7-6d0b-45e1-9da6-3a7fad815b4c",
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
  "arrived_at": "2026-10-30T10:10:44.021792Z",
  "started_at": "2026-10-30T10:10:46.361849Z",
  "completed_at": "2026-10-30T10:10:46.581623Z",
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
  "session_id": "6ffc7115-e27a-4583-b700-c0f9a7ebe898",
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
  "last_heartbeat_at": "2026-10-30T10:10:43.821714Z",
  "last_location_at": "2026-10-30T10:10:43.821714Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6ffc7115-e27a-4583-b700-c0f9a7ebe898/close` → **200**

```json
{
  "command_id": "caddda4d-df15-468f-99c2-c25d7c1c4ce7",
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
  "phone": "+380636215515",
  "device_ref": "sandbox-13792"
}
```

```json
{
  "challenge_id": "54c2f7ec-091a-4f34-8e09-144f1b4ca8e9",
  "expires_at": "2026-10-30T10:15:47.240251413Z",
  "resend_available_at": "2026-10-30T10:10:48.240251413Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636215515` → **200**

```json
{
  "phone": "+380636215515",
  "audience": "CLIENT",
  "code": "509882",
  "sent_at": "2026-10-30T10:10:47.242317107Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "54c2f7ec-091a-4f34-8e09-144f1b4ca8e9",
  "code": "509882",
  "device_ref": "sandbox-13792"
}
```

```json
{
  "session_id": "9baf1afa-858c-469d-adc1-c1e4ab5a353f",
  "subject": {
    "type": "CLIENT",
    "id": "c0ead164-e1ab-44e0-9842-b0bce97312cd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMGVhZDE2NC1lMWFiLTQ0ZTAtOTg0Mi1iMGJjZTk3MzEyY2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1OTQ3LCJpYXQiOjE3OTMzNTUwNDcsImp0aSI6IjdkYTdjZjY3LTI4MWQtNGQwZS05ZDYyLTgzNmI3MmM4YWU3OCIsInNpZCI6IjliYWYxYWZhLTg1OGMtNDY5ZC1hZGMxLWMxZTRhYjVhMzUzZiJ9.ytwcTdPo1VdjT09JKFIVE1RZMhdhd4MzTKUH_T74Al8",
  "access_expires_at": "2026-10-30T10:25:47.452110701Z",
  "refresh_token": "rTyc5fsQ5RNGWLdwwvzMpb3ZGm5QqEHN6jmOVm8H5vo",
  "refresh_expires_at": "2026-11-29T10:10:47.451737842Z",
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
  "device_ref": "sandbox-24857"
}
```

```json
{
  "challenge_id": "3bef863f-b1e1-444c-84db-750be64cc9cf",
  "expires_at": "2026-10-30T10:15:47.822448639Z",
  "resend_available_at": "2026-10-30T10:10:48.822448639Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "925322",
  "sent_at": "2026-10-30T10:10:47.824367335Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3bef863f-b1e1-444c-84db-750be64cc9cf",
  "code": "925322",
  "device_ref": "sandbox-24857"
}
```

```json
{
  "session_id": "9fcecdcd-2470-4ab8-8614-a51baa10c09f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTk0OCwiaWF0IjoxNzkzMzU1MDQ4LCJqdGkiOiI5MDRiZjkwNy1hMjVkLTQ4YjQtOGQyZC00ZTRiNjQxZWU5MDUiLCJzaWQiOiI5ZmNlY2RjZC0yNDcwLTRhYjgtODYxNC1hNTFiYWExMGMwOWYifQ.93WMRNbOfJ4ds9IznPgWQw8aEmmvYBPtW2sIRVkiU0o",
  "access_expires_at": "2026-10-30T10:25:48.025972583Z",
  "refresh_token": "WFBAQRKWq511Zd8q3tWF7fVJBdK6417lbHsiX6Q_pEw",
  "refresh_expires_at": "2026-11-29T10:10:48.025524983Z",
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
  "session_id": "710a207b-5344-43a7-82d5-75b007042685",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU5NDgsImlhdCI6MTc5MzM1NTA0OCwianRpIjoiZTU4NzY1OGYtYTYzNi00NzQxLTljNzktZTQ0ODg0Njg1ZGNiIiwic2lkIjoiNzEwYTIwN2ItNTM0NC00M2E3LTgyZDUtNzViMDA3MDQyNjg1In0.OC1xUagEeUqV4OeQbL_F6v0ngCthIr4cdGOM6EGJFWc",
  "access_expires_at": "2026-10-30T10:25:48.584211529Z",
  "refresh_token": "YNEkLJ0CDKCbiJyRiZf7YsajoTzJCg5LTcerIPk2fyk",
  "refresh_expires_at": "2026-10-30T22:10:48.58386756Z",
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
  "session_id": "b9738fe9-104d-4c47-907f-f53423bc91e9",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU5NDgsImlhdCI6MTc5MzM1NTA0OCwianRpIjoiOTY3MzRkYjEtODViMC00M2YxLThiZmUtYmM0MzFjM2QxNGU1Iiwic2lkIjoiYjk3MzhmZTktMTA0ZC00YzQ3LTkwN2YtZjUzNDIzYmM5MWU5In0.AaeVC3oHe1iGoqbki8lGAtxoDKRezdVGQeDxuLkbJj8",
  "access_expires_at": "2026-10-30T10:25:48.975585155Z",
  "refresh_token": "-AmWGVY_3N2uApUqk1JvcaR4BmpKYgZD62w9DEHH7EY",
  "refresh_expires_at": "2026-10-30T22:10:48.975222658Z",
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
  "command_id": "42035ef1-4c3c-4b1d-957e-c78754cc1b17",
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
  "id": "4916893c-57ea-4c6d-9d34-a7db3c133eeb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:15:49.354496Z",
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
  "command_id": "d134116e-e51c-48f0-b71d-b947623789e7",
  "quote_id": "4916893c-57ea-4c6d-9d34-a7db3c133eeb",
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
  "id": "8e747b57-997a-41b8-b5c7-d230972a9867",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c0ead164-e1ab-44e0-9842-b0bce97312cd",
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
  "created_at": "2026-10-30T10:10:49.561789Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e747b57-997a-41b8-b5c7-d230972a9867` → **200**

```json
{
  "id": "8e747b57-997a-41b8-b5c7-d230972a9867",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c0ead164-e1ab-44e0-9842-b0bce97312cd",
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
  "created_at": "2026-10-30T10:10:49.561789Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/8e747b57-997a-41b8-b5c7-d230972a9867/cancel` → **200**

```json
{
  "command_id": "723c79d3-3a1c-4703-a90e-3092561dbd17",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "8e747b57-997a-41b8-b5c7-d230972a9867",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c0ead164-e1ab-44e0-9842-b0bce97312cd",
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
  "created_at": "2026-10-30T10:10:49.561789Z",
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
  "command_id": "e1a3e734-24e5-45d3-904a-201377f06aab",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:10:50Z",
    "sequence": 1793355050405
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d48386cb-8037-4208-95d7-25d1820e87b0",
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
  "last_heartbeat_at": "2026-10-30T10:10:50.422523Z",
  "last_location_at": "2026-10-30T10:10:50.422523Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-9474"
}
```

```json
{
  "challenge_id": "c31c85ae-9392-4c05-8988-0d8389c18ca4",
  "expires_at": "2026-10-30T10:15:50.60844422Z",
  "resend_available_at": "2026-10-30T10:10:51.60844422Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "853171",
  "sent_at": "2026-10-30T10:10:50.61067004Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c31c85ae-9392-4c05-8988-0d8389c18ca4",
  "code": "853171",
  "device_ref": "sandbox-9474"
}
```

```json
{
  "session_id": "97a6b928-6c7b-4f0b-9d76-d6c30a247c98",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTk1MCwiaWF0IjoxNzkzMzU1MDUwLCJqdGkiOiIzNjAyOTMyYy03NDkwLTQ5ZmItYWJkYy1hNDgzYTIzYTZiYzUiLCJzaWQiOiI5N2E2YjkyOC02YzdiLTRmMGItOWQ3Ni1kNmMzMGEyNDdjOTgifQ.8Fqxn9epp6WMomG4qTwHPEGBwvzg3FeWhBiPT5QVG-c",
  "access_expires_at": "2026-10-30T10:25:50.823671701Z",
  "refresh_token": "3Pf721cxyqZJcFpxveo1PInX7WaHM2oJlM4rMDIQVlU",
  "refresh_expires_at": "2026-11-29T10:10:50.823322868Z",
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
  "command_id": "de30f71a-3302-4071-9468-d4a6468169dc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:10:51Z",
    "sequence": 1793355051203
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bf5ce827-479a-4f7a-9e79-688de4589645",
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
  "last_heartbeat_at": "2026-10-30T10:10:51.220374Z",
  "last_location_at": "2026-10-30T10:10:51.220374Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "63073f43-c94f-4ed4-afd2-a5e0b0a9d451",
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
  "id": "26f1ee0e-d1fa-41e8-bc07-cd7f0053b0da",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:15:51.429447Z",
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
  "command_id": "5d4be6d2-ce4c-4e77-845b-e3608ae9b91b",
  "quote_id": "26f1ee0e-d1fa-41e8-bc07-cd7f0053b0da",
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
  "id": "5507202b-aa51-43ec-9174-245e602dc05e",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c0ead164-e1ab-44e0-9842-b0bce97312cd",
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
  "created_at": "2026-10-30T10:10:51.639561Z",
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
    "id": "6e8bfcfe-edb7-43e1-b422-de193a9f66c3",
    "order_id": "5507202b-aa51-43ec-9174-245e602dc05e",
    "expires_at": "2026-10-30T10:11:06.642667Z",
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

`POST /api/driver/v1/offers/6e8bfcfe-edb7-43e1-b422-de193a9f66c3/accept` → **200**

```json
{
  "command_id": "394be67a-a2ec-4736-b9fb-9fa86a04f83e"
}
```

```json
{
  "id": "cf3d29db-9b90-4781-a24d-2a82ddf0c709",
  "order_id": "5507202b-aa51-43ec-9174-245e602dc05e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "31ea47dd-bd2c-461b-8bad-42d761438c00",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "31ea47dd-bd2c-461b-8bad-42d761438c00",
  "order_id": "5507202b-aa51-43ec-9174-245e602dc05e",
  "assignment_id": "cf3d29db-9b90-4781-a24d-2a82ddf0c709",
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

`POST /api/driver/v1/trips/31ea47dd-bd2c-461b-8bad-42d761438c00/cancel` → **200**

```json
{
  "command_id": "c1e7804c-eea3-4109-8b49-51825b279514",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "31ea47dd-bd2c-461b-8bad-42d761438c00",
  "order_id": "5507202b-aa51-43ec-9174-245e602dc05e",
  "assignment_id": "cf3d29db-9b90-4781-a24d-2a82ddf0c709",
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

`GET /api/rider/v1/orders/5507202b-aa51-43ec-9174-245e602dc05e` → **200**

```json
{
  "id": "5507202b-aa51-43ec-9174-245e602dc05e",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c0ead164-e1ab-44e0-9842-b0bce97312cd",
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
    "id": "cf3d29db-9b90-4781-a24d-2a82ddf0c709",
    "order_id": "5507202b-aa51-43ec-9174-245e602dc05e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "31ea47dd-bd2c-461b-8bad-42d761438c00",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T10:10:51.639561Z",
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
    "id": "666f3549-5f3b-46f4-924a-6df1b049f169",
    "order_id": "5507202b-aa51-43ec-9174-245e602dc05e",
    "expires_at": "2026-10-30T10:11:07.526382Z",
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

`POST /api/driver/v1/offers/666f3549-5f3b-46f4-924a-6df1b049f169/accept` → **200**

```json
{
  "command_id": "53862f89-8745-4ef0-82e7-09f803a35e37"
}
```

```json
{
  "id": "ddb742db-bcb7-4fa6-a002-9d2878620c26",
  "order_id": "5507202b-aa51-43ec-9174-245e602dc05e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fa64dca7-7dc3-4921-8178-930a29647e0a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fa64dca7-7dc3-4921-8178-930a29647e0a",
  "order_id": "5507202b-aa51-43ec-9174-245e602dc05e",
  "assignment_id": "ddb742db-bcb7-4fa6-a002-9d2878620c26",
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

`POST /api/driver/v1/trips/fa64dca7-7dc3-4921-8178-930a29647e0a/cancel` → **200**

```json
{
  "command_id": "822a0466-1a00-4a45-b706-7da738890792",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "fa64dca7-7dc3-4921-8178-930a29647e0a",
  "order_id": "5507202b-aa51-43ec-9174-245e602dc05e",
  "assignment_id": "ddb742db-bcb7-4fa6-a002-9d2878620c26",
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
    "id": "5507202b-aa51-43ec-9174-245e602dc05e",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-30T10:10:51.639561Z",
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
    "id": "8e747b57-997a-41b8-b5c7-d230972a9867",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T10:10:49.561789Z",
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

`GET /api/operator/v1/orders/5507202b-aa51-43ec-9174-245e602dc05e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T10:10:51.640044Z",
      "actor": {
        "type": "CLIENT",
        "id": "c0ead164-e1ab-44e0-9842-b0bce97312cd",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5507202b-aa51-43ec-9174-245e602dc05e",
        "quote_id": "26f1ee0e-d1fa-41e8-bc07-cd7f0053b0da",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "f7808616-b34a-4fdf-8c3d-babea255b2c3"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T10:10:51.641899Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5507202b-aa51-43ec-9174-245e602dc05e",
        "attempt_id": "3a66b7ac-2099-4b0b-a010-b56d2a14eeb9",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f7808616-b34a-4fdf-8c3d-babea255b2c3"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T10:10:51.647414Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6e8bfcfe-edb7-43e1-b422-de193a9f66c3",
        "order_id": "5507202b-aa51-43ec-9174-245e602dc05e",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "f7808616-b34a-4fdf-8c3d-babea255b2c3"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T10:10:52.076918Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "6e8bfcfe-edb7-43e1-b422-de193a9f66c3",
        "order_id": "5507202b-aa51-43ec-9174-245e602dc05e",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "cf3d29db-9b90-4781-a24d-2a82ddf0c709"
      },
      "correlation_id": "fe3ab1c6-9881-4a98-97fe-03712fe96eff"
```

Done: orders 8e747b57-997a-41b8-b5c7-d230972a9867, 5507202b-aa51-43ec-9174-245e602dc05e.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737026642",
  "device_ref": "sandbox-12889"
}
```

```json
{
  "challenge_id": "25f7ef2a-2f69-4ef0-acb4-be48f1b2d79d",
  "expires_at": "2026-10-30T10:15:54.113963603Z",
  "resend_available_at": "2026-10-30T10:10:55.113963603Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737026642` → **200**

```json
{
  "phone": "+380737026642",
  "audience": "CLIENT",
  "code": "118571",
  "sent_at": "2026-10-30T10:10:54.11611469Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "25f7ef2a-2f69-4ef0-acb4-be48f1b2d79d",
  "code": "118571",
  "device_ref": "sandbox-12889"
}
```

```json
{
  "session_id": "2ca9516b-0906-40ac-a984-07e6cb230938",
  "subject": {
    "type": "CLIENT",
    "id": "69597464-d629-41c6-aefd-3f6ece1395bd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTU5NzQ2NC1kNjI5LTQxYzYtYWVmZC0zZjZlY2UxMzk1YmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1OTU0LCJpYXQiOjE3OTMzNTUwNTQsImp0aSI6ImQ5OTFiMmVjLThkYmEtNGEwZC05MjAwLWZhOWY3MWVlZTBkOCIsInNpZCI6IjJjYTk1MTZiLTA5MDYtNDBhYy1hOTg0LTA3ZTZjYjIzMDkzOCJ9.HpgHmIxb8g8hjLPfM9jL2K50dUerinmxP_EBmaySSbY",
  "access_expires_at": "2026-10-30T10:25:54.349980349Z",
  "refresh_token": "et0IMGneOKMsdEX8UG2wjV84p212VhwbRLo4d57lOs8",
  "refresh_expires_at": "2026-11-29T10:10:54.349522111Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "6f7c20e8-c686-43b9-ba0a-bbb26232cd6f",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "4d7698d3-1d78-4000-b3ca-5e860325c2b2",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-4d7698d3-1d78-4000-b3ca-5e860325c2b2",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "b99b20f12027e7ed3b935406a1de79b1",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=4d7698d3-1d78-4000-b3ca-5e860325c2b2",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737026642"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=4d7698d3-1d78-4000-b3ca-5e860325c2b2",
  "expires_at": "2026-10-30T10:40:54.561326Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/4d7698d3-1d78-4000-b3ca-5e860325c2b2` → **200**

```json
{
  "id": "4d7698d3-1d78-4000-b3ca-5e860325c2b2",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:40:54.561326Z",
  "card": {
    "id": "b543ea18-980a-4afa-bde0-1f1abcf0959b",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8438",
    "card_type": "Visa",
    "created_at": "2026-10-30T10:10:54.768717Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "b543ea18-980a-4afa-bde0-1f1abcf0959b",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****8438",
      "card_type": "Visa",
      "created_at": "2026-10-30T10:10:54.768717Z"
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
  "device_ref": "sandbox-8299"
}
```

```json
{
  "challenge_id": "bad3148e-2202-4d4c-8428-411794c31aa6",
  "expires_at": "2026-10-30T10:15:55.187787521Z",
  "resend_available_at": "2026-10-30T10:10:56.187787521Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "964551",
  "sent_at": "2026-10-30T10:10:55.189839618Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bad3148e-2202-4d4c-8428-411794c31aa6",
  "code": "964551",
  "device_ref": "sandbox-8299"
}
```

```json
{
  "session_id": "58cb0696-0472-4e11-99c1-8dcf67e71159",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTk1NSwiaWF0IjoxNzkzMzU1MDU1LCJqdGkiOiI4ZDAyMmMyMi05YjI5LTQyZDItYWNlNC1lZWM4Mjk2YzE4ZDUiLCJzaWQiOiI1OGNiMDY5Ni0wNDcyLTRlMTEtOTljMS04ZGNmNjdlNzExNTkifQ.aGCzIxD1vXmYqspRcKHe7bxYBZXKKX5X74ePA-uPFZE",
  "access_expires_at": "2026-10-30T10:25:55.400960913Z",
  "refresh_token": "SVK0j-MrcCRb-CIYcGPNB8z0pw32aZoh5votCrpmZng",
  "refresh_expires_at": "2026-11-29T10:10:55.400522942Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bf5ce827-479a-4f7a-9e79-688de4589645",
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
  "last_heartbeat_at": "2026-10-30T10:10:51.220374Z",
  "last_location_at": "2026-10-30T10:10:51.220374Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bf5ce827-479a-4f7a-9e79-688de4589645/handover` → **200**

```json
{
  "command_id": "21054a6d-4762-4aae-b6f7-97a71c192f87",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bf5ce827-479a-4f7a-9e79-688de4589645",
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
  "last_heartbeat_at": "2026-10-30T10:10:51.220374Z",
  "last_location_at": "2026-10-30T10:10:51.220374Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 45 s to the next point)

`POST /api/driver/v1/work-sessions/bf5ce827-479a-4f7a-9e79-688de4589645/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:11:41Z",
    "sequence": 1793355101435
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bf5ce827-479a-4f7a-9e79-688de4589645",
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
  "last_heartbeat_at": "2026-10-30T10:11:41.021363Z",
  "last_location_at": "2026-10-30T10:11:41.021363Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "410e51cf-5376-4c00-b0d0-0577e5145598",
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
  "id": "c8eeb4c4-65ab-47a0-b05f-a05ac2d0426a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:16:41.232344Z",
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
  "command_id": "72953170-d059-47f5-8c3c-2c43ac78e3ef",
  "quote_id": "c8eeb4c4-65ab-47a0-b05f-a05ac2d0426a",
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
  "id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "69597464-d629-41c6-aefd-3f6ece1395bd",
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
  "created_at": "2026-10-30T10:11:41.448542Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3` → **200**

```json
{
  "id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "69597464-d629-41c6-aefd-3f6ece1395bd",
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
  "created_at": "2026-10-30T10:11:41.448542Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3` → **200**

```json
{
  "id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "69597464-d629-41c6-aefd-3f6ece1395bd",
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
  "created_at": "2026-10-30T10:11:41.448542Z",
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
    "id": "7fb54cc0-b986-439b-a361-b6c09ac3f2df",
    "order_id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
    "expires_at": "2026-10-30T10:11:56.804836Z",
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

`POST /api/driver/v1/offers/7fb54cc0-b986-439b-a361-b6c09ac3f2df/accept` → **200**

```json
{
  "command_id": "2b448715-6117-4064-96fb-6efa169a74cc"
}
```

```json
{
  "id": "6bf3af5a-ff36-4ddb-826c-85e0854356e9",
  "order_id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "07d4eff4-3484-46f0-bbf2-2ce682659037",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "07d4eff4-3484-46f0-bbf2-2ce682659037",
  "order_id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
  "assignment_id": "6bf3af5a-ff36-4ddb-826c-85e0854356e9",
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

`POST /api/driver/v1/work-sessions/bf5ce827-479a-4f7a-9e79-688de4589645/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:11:49Z",
    "sequence": 1793355109702
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bf5ce827-479a-4f7a-9e79-688de4589645",
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
  "last_heartbeat_at": "2026-10-30T10:11:49.717886Z",
  "last_location_at": "2026-10-30T10:11:49.717886Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/07d4eff4-3484-46f0-bbf2-2ce682659037/arrive` → **200**

```json
{
  "command_id": "5f0475e5-b9b3-49d3-9253-c7e251ebef44",
  "expected_version": 0
}
```

```json
{
  "id": "07d4eff4-3484-46f0-bbf2-2ce682659037",
  "order_id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
  "assignment_id": "6bf3af5a-ff36-4ddb-826c-85e0854356e9",
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
  "arrived_at": "2026-10-30T10:11:49.938551Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/07d4eff4-3484-46f0-bbf2-2ce682659037/start` → **200**

```json
{
  "command_id": "2c9b5285-cbad-42f0-be00-0b61ac3567e7",
  "expected_version": 1
}
```

```json
{
  "id": "07d4eff4-3484-46f0-bbf2-2ce682659037",
  "order_id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
  "assignment_id": "6bf3af5a-ff36-4ddb-826c-85e0854356e9",
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
  "arrived_at": "2026-10-30T10:11:49.938551Z",
  "started_at": "2026-10-30T10:11:50.153115Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/07d4eff4-3484-46f0-bbf2-2ce682659037/complete` → **200**

```json
{
  "command_id": "efc516cf-7b8d-4d0d-ad5a-4d38c12e714d",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:11:50Z",
  "cash_received": true
}
```

```json
{
  "id": "07d4eff4-3484-46f0-bbf2-2ce682659037",
  "order_id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
  "assignment_id": "6bf3af5a-ff36-4ddb-826c-85e0854356e9",
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
  "arrived_at": "2026-10-30T10:11:49.938551Z",
  "started_at": "2026-10-30T10:11:50.153115Z",
  "completed_at": "2026-10-30T10:11:50.362483Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3` → **200**

```json
{
  "id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "69597464-d629-41c6-aefd-3f6ece1395bd",
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
    "id": "6bf3af5a-ff36-4ddb-826c-85e0854356e9",
    "order_id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "07d4eff4-3484-46f0-bbf2-2ce682659037",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:11:41.448542Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3` → **200**

```json
{
  "id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "69597464-d629-41c6-aefd-3f6ece1395bd",
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
    "id": "6bf3af5a-ff36-4ddb-826c-85e0854356e9",
    "order_id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "07d4eff4-3484-46f0-bbf2-2ce682659037",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:11:41.448542Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3` → **200**

```json
{
  "id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "69597464-d629-41c6-aefd-3f6ece1395bd",
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
    "id": "6bf3af5a-ff36-4ddb-826c-85e0854356e9",
    "order_id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "07d4eff4-3484-46f0-bbf2-2ce682659037",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:11:41.448542Z",
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

`GET /api/rider/v1/orders/e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3/tip` → **200**

```json
{
  "order_id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
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
  "available_until": "2026-10-31T10:11:50.362483Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3/tip` → **201**

```json
{
  "command_id": "ff741dbc-7ce8-417c-b4fc-631f2cdf4d1e",
  "amount_minor": 2500
}
```

```json
{
  "id": "a0adf0ea-144c-4b1d-b961-27d10bac50d1",
  "order_id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T10:11:53.628886Z"
}
```

`GET /api/rider/v1/orders/e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3/tip` → **200**

```json
{
  "order_id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
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
  "available_until": "2026-10-31T10:11:50.362483Z",
  "open": false,
  "tip": {
    "id": "a0adf0ea-144c-4b1d-b961-27d10bac50d1",
    "order_id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T10:11:53.628886Z"
  }
}
```

`GET /api/rider/v1/orders/e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3/tip` → **200**

```json
{
  "order_id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
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
  "available_until": "2026-10-31T10:11:50.362483Z",
  "open": false,
  "tip": {
    "id": "a0adf0ea-144c-4b1d-b961-27d10bac50d1",
    "order_id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T10:11:53.628886Z"
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
      "id": "3ebfe1cb-9fbe-4b84-b1a7-9bb140d6d99a",
      "at": "2026-10-30T10:11:54.903303Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
      "counterpart_id": null
    },
    {
      "id": "a348ef3c-bbd8-4d71-b457-a54b8e281e86",
      "at": "2026-10-30T10:11:50.865154Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "829f1c17-df68-4ee6-8d28-f4340a0d164a",
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
  "id": "de001fbe-b6e6-4ee9-9779-2d08dbf2a22d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:16:55.434191Z",
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
  "session_id": "5a2c501f-439d-477c-bf5c-6f2ed7a12cec",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTYwMTUsImlhdCI6MTc5MzM1NTExNSwianRpIjoiNWJjMTE4NjAtMzI5Yi00YWVkLWEzMDktYzlmYzk3MDQzZWZkIiwic2lkIjoiNWEyYzUwMWYtNDM5ZC00NzdjLWJmNWMtNmYyZWQ3YTEyY2VjIn0.JyEzciK2k51uNqU1LRx-ZbYb5D_VzG05cZ92bY0Iao4",
  "access_expires_at": "2026-10-30T10:26:55.838234657Z",
  "refresh_token": "PszOl4CFV7Y7uItkphAOlYwU8Sn5qK_e5sVd_NNUQtE",
  "refresh_expires_at": "2026-10-30T22:11:55.837896487Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380737026642` → **200**

```json
{
  "client_id": "69597464-d629-41c6-aefd-3f6ece1395bd"
}
```

`POST /api/admin/v1/rider-wallets/69597464-d629-41c6-aefd-3f6ece1395bd/top-ups` → **201**

```json
{
  "command_id": "75c1d7d7-6701-4042-a649-40dac1d5f1c3",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "69597464-d629-41c6-aefd-3f6ece1395bd",
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
      "id": "66d3bb89-f7f8-4bc1-8c36-790a1001b3cf",
      "at": "2026-10-30T10:11:56.23208Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "698c0617-9f92-4dc3-8b40-0e6f49cb50f3",
  "quote_id": "de001fbe-b6e6-4ee9-9779-2d08dbf2a22d",
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
  "id": "82aa2528-6f5f-4124-9897-ee3d8cf220ca",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "69597464-d629-41c6-aefd-3f6ece1395bd",
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
  "created_at": "2026-10-30T10:11:56.443524Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/82aa2528-6f5f-4124-9897-ee3d8cf220ca` → **200**

```json
{
  "id": "82aa2528-6f5f-4124-9897-ee3d8cf220ca",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "69597464-d629-41c6-aefd-3f6ece1395bd",
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
  "created_at": "2026-10-30T10:11:56.443524Z",
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
    "id": "f4542d91-8655-4b59-afd9-acfb960754a6",
    "order_id": "82aa2528-6f5f-4124-9897-ee3d8cf220ca",
    "expires_at": "2026-10-30T10:12:11.4467Z",
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

`POST /api/driver/v1/offers/f4542d91-8655-4b59-afd9-acfb960754a6/accept` → **200**

```json
{
  "command_id": "212fc801-886b-4011-a9cc-ccb8e1e108f5"
}
```

```json
{
  "id": "836ba026-b409-4433-8ce5-5abd628d86f7",
  "order_id": "82aa2528-6f5f-4124-9897-ee3d8cf220ca",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9d5aba17-73b1-43a2-8a40-ae0bfe8d3fc7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9d5aba17-73b1-43a2-8a40-ae0bfe8d3fc7",
  "order_id": "82aa2528-6f5f-4124-9897-ee3d8cf220ca",
  "assignment_id": "836ba026-b409-4433-8ce5-5abd628d86f7",
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

`POST /api/driver/v1/work-sessions/bf5ce827-479a-4f7a-9e79-688de4589645/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:11:57Z",
    "sequence": 1793355117526
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bf5ce827-479a-4f7a-9e79-688de4589645",
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
  "last_heartbeat_at": "2026-10-30T10:11:57.543355Z",
  "last_location_at": "2026-10-30T10:11:57.543355Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/9d5aba17-73b1-43a2-8a40-ae0bfe8d3fc7/arrive` → **200**

```json
{
  "command_id": "1f6d9a90-a9aa-4697-ab1c-06a529c86020",
  "expected_version": 0
}
```

```json
{
  "id": "9d5aba17-73b1-43a2-8a40-ae0bfe8d3fc7",
  "order_id": "82aa2528-6f5f-4124-9897-ee3d8cf220ca",
  "assignment_id": "836ba026-b409-4433-8ce5-5abd628d86f7",
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
  "arrived_at": "2026-10-30T10:11:57.751328Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9d5aba17-73b1-43a2-8a40-ae0bfe8d3fc7/start` → **200**

```json
{
  "command_id": "3ff9ff2c-d8ac-4f56-9078-13a5a9f9bb8f",
  "expected_version": 1
}
```

```json
{
  "id": "9d5aba17-73b1-43a2-8a40-ae0bfe8d3fc7",
  "order_id": "82aa2528-6f5f-4124-9897-ee3d8cf220ca",
  "assignment_id": "836ba026-b409-4433-8ce5-5abd628d86f7",
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
  "arrived_at": "2026-10-30T10:11:57.751328Z",
  "started_at": "2026-10-30T10:11:57.960381Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9d5aba17-73b1-43a2-8a40-ae0bfe8d3fc7/complete` → **200**

```json
{
  "command_id": "2191a198-ff47-4e72-bf8e-d305aea6090b",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:11:58Z",
  "cash_received": true
}
```

```json
{
  "id": "9d5aba17-73b1-43a2-8a40-ae0bfe8d3fc7",
  "order_id": "82aa2528-6f5f-4124-9897-ee3d8cf220ca",
  "assignment_id": "836ba026-b409-4433-8ce5-5abd628d86f7",
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
  "arrived_at": "2026-10-30T10:11:57.751328Z",
  "started_at": "2026-10-30T10:11:57.960381Z",
  "completed_at": "2026-10-30T10:11:58.170477Z",
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
  "client_id": "69597464-d629-41c6-aefd-3f6ece1395bd",
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
      "id": "66d3bb89-f7f8-4bc1-8c36-790a1001b3cf",
      "at": "2026-10-30T10:11:56.23208Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "fc83930a-0f00-4627-8f4f-e260893ced8f",
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

`GET /api/rider/v1/orders/82aa2528-6f5f-4124-9897-ee3d8cf220ca/tip` → **200**

```json
{
  "order_id": "82aa2528-6f5f-4124-9897-ee3d8cf220ca",
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
  "available_until": "2026-10-31T10:11:58.170477Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/82aa2528-6f5f-4124-9897-ee3d8cf220ca/tip` → **201**

```json
{
  "command_id": "33da5c99-9491-4c93-95e9-683eb8ef818e",
  "amount_minor": 2500
}
```

```json
{
  "id": "47486336-6a1b-49f1-8b40-d16197aa9fec",
  "order_id": "82aa2528-6f5f-4124-9897-ee3d8cf220ca",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T10:11:58.965282Z"
}
```

`GET /api/rider/v1/orders/82aa2528-6f5f-4124-9897-ee3d8cf220ca/tip` → **200**

```json
{
  "order_id": "82aa2528-6f5f-4124-9897-ee3d8cf220ca",
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
  "available_until": "2026-10-31T10:11:58.170477Z",
  "open": false,
  "tip": {
    "id": "47486336-6a1b-49f1-8b40-d16197aa9fec",
    "order_id": "82aa2528-6f5f-4124-9897-ee3d8cf220ca",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T10:11:58.965282Z"
  }
}
```

`GET /api/rider/v1/orders/82aa2528-6f5f-4124-9897-ee3d8cf220ca/tip` → **200**

```json
{
  "order_id": "82aa2528-6f5f-4124-9897-ee3d8cf220ca",
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
  "available_until": "2026-10-31T10:11:58.170477Z",
  "open": false,
  "tip": {
    "id": "47486336-6a1b-49f1-8b40-d16197aa9fec",
    "order_id": "82aa2528-6f5f-4124-9897-ee3d8cf220ca",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T10:11:58.965282Z"
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
      "id": "fb996c6b-eb71-4c0d-bdbf-1031817c1060",
      "at": "2026-10-30T10:11:58.939153Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "82aa2528-6f5f-4124-9897-ee3d8cf220ca",
      "counterpart_id": null
    },
    {
      "id": "3ebfe1cb-9fbe-4b84-b1a7-9bb140d6d99a",
      "at": "2026-10-30T10:11:54.903303Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
      "counterpart_id": null
    },
    {
      "id": "a348ef3c-bbd8-4d71-b457-a54b8e281e86",
      "at": "2026-10-30T10:11:50.865154Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
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
      "id": "c79b5259-48cd-41f0-9861-eca30872ecb1",
      "at": "2026-10-30T10:12:00.956438Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "82aa2528-6f5f-4124-9897-ee3d8cf220ca",
      "counterpart_id": null
    },
    {
      "id": "fb996c6b-eb71-4c0d-bdbf-1031817c1060",
      "at": "2026-10-30T10:11:58.939153Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "82aa2528-6f5f-4124-9897-ee3d8cf220ca",
      "counterpart_id": null
    },
    {
      "id": "3ebfe1cb-9fbe-4b84-b1a7-9bb140d6d99a",
      "at": "2026-10-30T10:11:54.903303Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
      "counterpart_id": null
    },
    {
      "id": "a348ef3c-bbd8-4d71-b457-a54b8e281e86",
      "at": "2026-10-30T10:11:50.865154Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e9ecf646-3f84-4c3e-8ab7-d7b140dc0fd3",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bf5ce827-479a-4f7a-9e79-688de4589645",
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
  "last_heartbeat_at": "2026-10-30T10:11:57.543355Z",
  "last_location_at": "2026-10-30T10:11:57.543355Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bf5ce827-479a-4f7a-9e79-688de4589645/close` → **200**

```json
{
  "command_id": "2d25575a-6121-4017-afe5-5d1d404b87c8",
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

Done: card order 82aa2528-6f5f-4124-9897-ee3d8cf220ca.

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
  "phone": "+380735233676",
  "device_ref": "sandbox-24644"
}
```

```json
{
  "challenge_id": "23fc0457-3d8e-4833-a221-6f817c728cb0",
  "expires_at": "2026-10-30T10:17:02.515497778Z",
  "resend_available_at": "2026-10-30T10:12:03.515497778Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735233676` → **200**

```json
{
  "phone": "+380735233676",
  "audience": "CLIENT",
  "code": "496484",
  "sent_at": "2026-10-30T10:12:02.517445104Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "23fc0457-3d8e-4833-a221-6f817c728cb0",
  "code": "496484",
  "device_ref": "sandbox-24644"
}
```

```json
{
  "session_id": "97bd6813-a679-42f3-82b5-100b1ac3136b",
  "subject": {
    "type": "CLIENT",
    "id": "a8c2ff1f-137b-4380-86d9-c1e5fd9c17c7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOGMyZmYxZi0xMzdiLTQzODAtODZkOS1jMWU1ZmQ5YzE3YzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2MDIyLCJpYXQiOjE3OTMzNTUxMjIsImp0aSI6ImRiODAzNDNlLWJhN2UtNGY0ZS04NTlkLWM2MTBhMjIxM2NkYiIsInNpZCI6Ijk3YmQ2ODEzLWE2NzktNDJmMy04MmI1LTEwMGIxYWMzMTM2YiJ9.BL-iVt67OP0s1CBStgj7c6gFzegmDRQne902k3bBBko",
  "access_expires_at": "2026-10-30T10:27:02.731176222Z",
  "refresh_token": "VTycBiQeiLxCqdONOSk5DAqPeeUmNUig-5XxXdfUJfc",
  "refresh_expires_at": "2026-11-29T10:12:02.7308636Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "5934b740-996a-4442-b06f-6859f7a5ffc8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "9f374e6d-b8b8-432e-b721-79df67e3dba2",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-9f374e6d-b8b8-432e-b721-79df67e3dba2",
    "orderDate": "1793355122",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "cf91ede1bf7b1efe47202e312c51b84c",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=9f374e6d-b8b8-432e-b721-79df67e3dba2",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735233676"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=9f374e6d-b8b8-432e-b721-79df67e3dba2",
  "created_at": "2026-10-30T10:12:02.925508Z",
  "expires_at": "2026-10-30T10:42:02.925508Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/9f374e6d-b8b8-432e-b721-79df67e3dba2` → **200**

```json
{
  "id": "9f374e6d-b8b8-432e-b721-79df67e3dba2",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T10:12:02.925508Z",
  "expires_at": "2026-10-30T10:42:02.925508Z",
  "completed_at": "2026-10-30T10:12:03.122467Z",
  "masked_pan": "41****1377",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a8c2ff1f-137b-4380-86d9-c1e5fd9c17c7",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a8c2ff1f-137b-4380-86d9-c1e5fd9c17c7",
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
      "id": "223657d5-bca8-41c2-85f5-4b123658c4e2",
      "at": "2026-10-30T10:12:03.968919Z",
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
  "client_id": "a8c2ff1f-137b-4380-86d9-c1e5fd9c17c7",
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
      "id": "223657d5-bca8-41c2-85f5-4b123658c4e2",
      "at": "2026-10-30T10:12:03.968919Z",
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
  "device_ref": "sandbox-551"
}
```

```json
{
  "challenge_id": "1239830e-677a-46a5-b851-c540a32f04fc",
  "expires_at": "2026-10-30T10:17:04.897751422Z",
  "resend_available_at": "2026-10-30T10:12:05.897751422Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "417034",
  "sent_at": "2026-10-30T10:12:04.899879119Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1239830e-677a-46a5-b851-c540a32f04fc",
  "code": "417034",
  "device_ref": "sandbox-551"
}
```

```json
{
  "session_id": "57aaa6bf-1b8c-404e-8e92-cabd2aba4333",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NjAyNSwiaWF0IjoxNzkzMzU1MTI1LCJqdGkiOiJmNjIxYmQ4YS1mZjIzLTRhMWUtODAyOC0xZGRkNWMxNDQ5OTciLCJzaWQiOiI1N2FhYTZiZi0xYjhjLTQwNGUtOGU5Mi1jYWJkMmFiYTQzMzMifQ.kLe5r3zQC7wT8Ea9bTWQMW3QyoQf2H18m0voGWiud0U",
  "access_expires_at": "2026-10-30T10:27:05.116747407Z",
  "refresh_token": "3xvIWqjXn89jxqMjB2TsC8GcejG7n0tCsZKu6BHdsVE",
  "refresh_expires_at": "2026-11-29T10:12:05.116418301Z",
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
  "command_id": "62554e2e-5f01-4139-bd13-7178800f5a80",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "bdcbd6ce-9db8-4f9c-9dad-8a73fe65fe48",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-bdcbd6ce-9db8-4f9c-9dad-8a73fe65fe48",
    "orderDate": "1793355125",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "7ddb86618ff51d4b5535638858e9140d",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=bdcbd6ce-9db8-4f9c-9dad-8a73fe65fe48",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=bdcbd6ce-9db8-4f9c-9dad-8a73fe65fe48",
  "created_at": "2026-10-30T10:12:05.491642Z",
  "expires_at": "2026-10-30T10:42:05.491642Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/bdcbd6ce-9db8-4f9c-9dad-8a73fe65fe48` → **200**

```json
{
  "id": "bdcbd6ce-9db8-4f9c-9dad-8a73fe65fe48",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T10:12:05.491642Z",
  "expires_at": "2026-10-30T10:42:05.491642Z",
  "completed_at": "2026-10-30T10:12:05.686872Z",
  "masked_pan": "41****6517",
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
      "id": "9f513972-0776-417d-a2bf-7821e7f11c24",
      "at": "2026-10-30T10:12:05.975912Z",
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
  "command_id": "5c8d9ca9-3027-4d71-9710-3dab01d2d172",
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
  "correlation_id": "f2753646-9523-4c31-9b17-ab57f90deabd"
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
  "device_ref": "sandbox-21035"
}
```

```json
{
  "challenge_id": "a094b0f8-6e00-4daf-971d-7c83697dd2e1",
  "expires_at": "2026-10-30T10:17:07.496080398Z",
  "resend_available_at": "2026-10-30T10:12:08.496080398Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "959956",
  "sent_at": "2026-10-30T10:12:07.498440336Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a094b0f8-6e00-4daf-971d-7c83697dd2e1",
  "code": "959956",
  "device_ref": "sandbox-21035"
}
```

```json
{
  "session_id": "7dd8a720-5771-481a-8e5b-15082dc22fb7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NjAyNywiaWF0IjoxNzkzMzU1MTI3LCJqdGkiOiI4OTIxMDE3YS0yMjcyLTQwYzQtYjFmYy1lMWZiMDcyMzI0NWMiLCJzaWQiOiI3ZGQ4YTcyMC01NzcxLTQ4MWEtOGU1Yi0xNTA4MmRjMjJmYjcifQ.A7pguiMs58wbXFp5MvY69iW4G-Y3fKxlELIhVRy8ECI",
  "access_expires_at": "2026-10-30T10:27:07.722931999Z",
  "refresh_token": "FPKQZ0AKr_PszJ-dJqg-BadDc5wC1i0WOyOOAz_Pf2I",
  "refresh_expires_at": "2026-11-29T10:12:07.722553909Z",
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
  "command_id": "5e836cbd-b096-4b18-b434-50b549e1cbb7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:12:08Z",
    "sequence": 1793355128163
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3ba026aa-64c0-4454-84bf-6b32aa728abb",
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
  "last_heartbeat_at": "2026-10-30T10:12:08.179591Z",
  "last_location_at": "2026-10-30T10:12:08.179591Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635353032",
  "device_ref": "sandbox-22789"
}
```

```json
{
  "challenge_id": "7d28bf30-7b91-4a53-ab60-3139c2902c4b",
  "expires_at": "2026-10-30T10:17:08.382541787Z",
  "resend_available_at": "2026-10-30T10:12:09.382541787Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635353032` → **200**

```json
{
  "phone": "+380635353032",
  "audience": "CLIENT",
  "code": "488814",
  "sent_at": "2026-10-30T10:12:08.384556149Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7d28bf30-7b91-4a53-ab60-3139c2902c4b",
  "code": "488814",
  "device_ref": "sandbox-22789"
}
```

```json
{
  "session_id": "e3daa141-e06f-4464-aefa-b2869af16924",
  "subject": {
    "type": "CLIENT",
    "id": "7eee05b9-25bb-42cc-94cc-04174c87b22f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZWVlMDViOS0yNWJiLTQyY2MtOTRjYy0wNDE3NGM4N2IyMmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2MDI4LCJpYXQiOjE3OTMzNTUxMjgsImp0aSI6ImJhOTJmYTI1LTllOTAtNDdmMC04M2I3LTc0Y2NhMjlmYzBiMSIsInNpZCI6ImUzZGFhMTQxLWUwNmYtNDQ2NC1hZWZhLWIyODY5YWYxNjkyNCJ9.itn6O5N0VBgHYRsmOVaSMjon2s-5w1NC90gfehCpCY4",
  "access_expires_at": "2026-10-30T10:27:08.606084626Z",
  "refresh_token": "MvUvDgR0GNybKfn2FY945vHOf59ily8FzC1TNUgj7UM",
  "refresh_expires_at": "2026-11-29T10:12:08.605714488Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8b56a50e-974e-4dda-8940-15670b7cdce0",
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
  "id": "325071a8-b567-4c78-b1b4-b6810ebb0ff7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:17:08.810293Z",
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
  "command_id": "32c9e42d-c9ff-4a35-bb94-8a487521f9aa",
  "quote_id": "325071a8-b567-4c78-b1b4-b6810ebb0ff7",
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
  "id": "43f9e662-a75c-4473-b4b4-04139d284fff",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7eee05b9-25bb-42cc-94cc-04174c87b22f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:12:09.013583Z",
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
    "id": "e203f2e5-3d24-40ac-97b5-6460d820d69e",
    "order_id": "43f9e662-a75c-4473-b4b4-04139d284fff",
    "expires_at": "2026-10-30T10:12:24.015956Z",
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

`POST /api/driver/v1/offers/e203f2e5-3d24-40ac-97b5-6460d820d69e/accept` → **200**

```json
{
  "command_id": "fea6a367-1f92-4045-b219-5c71d998c7b7"
}
```

```json
{
  "id": "301e3809-9831-4aa6-ba78-bfac74f9ebc2",
  "order_id": "43f9e662-a75c-4473-b4b4-04139d284fff",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cfb46957-bd5b-4ac6-ac73-060e040fc97d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cfb46957-bd5b-4ac6-ac73-060e040fc97d",
  "order_id": "43f9e662-a75c-4473-b4b4-04139d284fff",
  "assignment_id": "301e3809-9831-4aa6-ba78-bfac74f9ebc2",
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

(the car drives 1 s to the next point)

`POST /api/driver/v1/work-sessions/3ba026aa-64c0-4454-84bf-6b32aa728abb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:12:10Z",
    "sequence": 1793355130809
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3ba026aa-64c0-4454-84bf-6b32aa728abb",
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
  "last_heartbeat_at": "2026-10-30T10:12:10.824926Z",
  "last_location_at": "2026-10-30T10:12:10.824926Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/cfb46957-bd5b-4ac6-ac73-060e040fc97d/arrive` → **200**

```json
{
  "command_id": "28f68af2-b9ac-4055-88c1-1b343ab11c1a",
  "expected_version": 0
}
```

```json
{
  "id": "cfb46957-bd5b-4ac6-ac73-060e040fc97d",
  "order_id": "43f9e662-a75c-4473-b4b4-04139d284fff",
  "assignment_id": "301e3809-9831-4aa6-ba78-bfac74f9ebc2",
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
  "arrived_at": "2026-10-30T10:12:11.026689Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cfb46957-bd5b-4ac6-ac73-060e040fc97d/start` → **200**

```json
{
  "command_id": "6b136ff9-038e-4ca2-936d-0de34665c4e4",
  "expected_version": 1
}
```

```json
{
  "id": "cfb46957-bd5b-4ac6-ac73-060e040fc97d",
  "order_id": "43f9e662-a75c-4473-b4b4-04139d284fff",
  "assignment_id": "301e3809-9831-4aa6-ba78-bfac74f9ebc2",
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
  "arrived_at": "2026-10-30T10:12:11.026689Z",
  "started_at": "2026-10-30T10:12:11.234819Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cfb46957-bd5b-4ac6-ac73-060e040fc97d/complete` → **200**

```json
{
  "command_id": "db5a1cea-0da2-4524-8371-fc488af84acc",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:12:11Z",
  "cash_received": false
}
```

```json
{
  "id": "cfb46957-bd5b-4ac6-ac73-060e040fc97d",
  "order_id": "43f9e662-a75c-4473-b4b4-04139d284fff",
  "assignment_id": "301e3809-9831-4aa6-ba78-bfac74f9ebc2",
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
  "arrived_at": "2026-10-30T10:12:11.026689Z",
  "started_at": "2026-10-30T10:12:11.234819Z",
  "completed_at": "2026-10-30T10:12:11.440171Z",
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
  "session_id": "5113372c-69fc-4da4-8727-e11aa3070775",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTYwMzEsImlhdCI6MTc5MzM1NTEzMSwianRpIjoiMGI0ZDgwY2YtYmZiNC00ZDVjLTgyMzItNmVlMWNmYjJlNzY2Iiwic2lkIjoiNTExMzM3MmMtNjlmYy00ZGE0LTg3MjctZTExYWEzMDcwNzc1In0.oVf3RWn2KoiIrEt7fX7yawfH_cf7l97k9adMINx18Cs",
  "access_expires_at": "2026-10-30T10:27:11.844106917Z",
  "refresh_token": "2VPoDdTqdx6q3vxYn7uU7e7xR6P28vckXCn-h1H3rX4",
  "refresh_expires_at": "2026-10-30T22:12:11.843784822Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/43f9e662-a75c-4473-b4b4-04139d284fff/cash-dispute` → **200**

```json
{
  "order_id": "43f9e662-a75c-4473-b4b4-04139d284fff",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "7eee05b9-25bb-42cc-94cc-04174c87b22f",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T10:12:12.026566Z",
  "decide_by": "2026-11-13T10:12:12.026566Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T10:12:12.026566Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "43f9e662-a75c-4473-b4b4-04139d284fff",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "7eee05b9-25bb-42cc-94cc-04174c87b22f",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T10:12:12.026566Z",
      "decide_by": "2026-11-13T10:12:12.026566Z",
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

`POST /api/admin/v1/orders/43f9e662-a75c-4473-b4b4-04139d284fff/cash-dispute/decide` → **400**

```json
{
  "command_id": "76ca14a6-ff90-41bd-80a5-ab8190cc64ca",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/43f9e662-a75c-4473-b4b4-04139d284fff/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "2a3f2c92-a914-4ccb-a393-e0cba943a712",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/43f9e662-a75c-4473-b4b4-04139d284fff/cash-dispute/decide` → **200**

```json
{
  "command_id": "b7bd007c-e508-4c10-b61f-80b2707a9a6d",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "43f9e662-a75c-4473-b4b4-04139d284fff",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "7eee05b9-25bb-42cc-94cc-04174c87b22f",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T10:12:12.026566Z",
  "decide_by": "2026-11-13T10:12:12.026566Z",
  "decision": "PAY_DRIVER",
  "decided_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T10:12:12.718676Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/43f9e662-a75c-4473-b4b4-04139d284fff/cash-dispute/decide` → **409**

```json
{
  "command_id": "5f57abfe-beea-4ea4-ba30-8659f7ba0250",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/43f9e662-a75c-4473-b4b4-04139d284fff/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "59979d85-29e0-4ff7-8f2b-5f091481f768"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3ba026aa-64c0-4454-84bf-6b32aa728abb",
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
  "last_heartbeat_at": "2026-10-30T10:12:10.824926Z",
  "last_location_at": "2026-10-30T10:12:10.824926Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3ba026aa-64c0-4454-84bf-6b32aa728abb/close` → **200**

```json
{
  "command_id": "b659b63f-113e-4fd3-9a18-c37746c8d881",
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
  "phone": "+380736727337",
  "device_ref": "sandbox-26499"
}
```

```json
{
  "challenge_id": "c96fe786-d655-40d2-ad99-60294816c592",
  "expires_at": "2026-10-30T10:17:13.529465634Z",
  "resend_available_at": "2026-10-30T10:12:14.529465634Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380736727337` → **200**

```json
{
  "phone": "+380736727337",
  "audience": "CLIENT",
  "code": "865709",
  "sent_at": "2026-10-30T10:12:13.53144281Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c96fe786-d655-40d2-ad99-60294816c592",
  "code": "865709",
  "device_ref": "sandbox-26499"
}
```

```json
{
  "session_id": "ac799108-f56f-4ad4-87d3-1749648f540d",
  "subject": {
    "type": "CLIENT",
    "id": "3e769e7e-e149-452d-af4a-185612d21e3a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZTc2OWU3ZS1lMTQ5LTQ1MmQtYWY0YS0xODU2MTJkMjFlM2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2MDMzLCJpYXQiOjE3OTMzNTUxMzMsImp0aSI6IjU4ZWY5MmNmLWEyZmEtNGRlMS05YzUzLTk0ZGUwYjAxZDJjNCIsInNpZCI6ImFjNzk5MTA4LWY1NmYtNGFkNC04N2QzLTE3NDk2NDhmNTQwZCJ9.U-5OUxCle390uinOSy5fqeA8el4PoEInqfzEm5m-SJg",
  "access_expires_at": "2026-10-30T10:27:13.775476622Z",
  "refresh_token": "TVhcxIx_ZDaQgjv222G7Tr9bdwLNjStbOuyLYDYi944",
  "refresh_expires_at": "2026-11-29T10:12:13.775147115Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "c200b445-ea1b-4122-ad58-2f4629ab3498",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "feb2038b-6353-46c6-9c22-46a27926988a",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-feb2038b-6353-46c6-9c22-46a27926988a",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "087863092b3d77746952666c10a22758",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=feb2038b-6353-46c6-9c22-46a27926988a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736727337"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=feb2038b-6353-46c6-9c22-46a27926988a",
  "expires_at": "2026-10-30T10:42:13.965833Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/feb2038b-6353-46c6-9c22-46a27926988a` → **200**

```json
{
  "id": "feb2038b-6353-46c6-9c22-46a27926988a",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:42:13.965833Z",
  "card": {
    "id": "edd873ef-34ab-4f62-ad46-bec82eefee8b",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4122",
    "card_type": "Visa",
    "created_at": "2026-10-30T10:12:14.162756Z"
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
  "device_ref": "sandbox-15731"
}
```

```json
{
  "challenge_id": "493a1813-c16e-4891-9aea-1e526b984c27",
  "expires_at": "2026-10-30T10:17:14.376423015Z",
  "resend_available_at": "2026-10-30T10:12:15.376423015Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "650003",
  "sent_at": "2026-10-30T10:12:14.378399168Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "493a1813-c16e-4891-9aea-1e526b984c27",
  "code": "650003",
  "device_ref": "sandbox-15731"
}
```

```json
{
  "session_id": "bdf7a7b4-17a0-43c2-99e3-2ea8efc87c3f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NjAzNCwiaWF0IjoxNzkzMzU1MTM0LCJqdGkiOiI0YzIxODVkNS05YzFlLTQ5YmYtOTBkZS0zM2E0ZWMyYzEyNTIiLCJzaWQiOiJiZGY3YTdiNC0xN2EwLTQzYzItOTllMy0yZWE4ZWZjODdjM2YifQ.iNhIwd2x5EGhyo03B_0Kaj_wkP4o3elYbtoA2PTaJKY",
  "access_expires_at": "2026-10-30T10:27:14.596912144Z",
  "refresh_token": "QhdDE6DpP_uNuiw4j2xb_05V2m2qLbT1CWmkEAtKwGs",
  "refresh_expires_at": "2026-11-29T10:12:14.596450897Z",
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
  "command_id": "1e26000d-984f-4756-80f8-a1d5c4d6fe39",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:12:14Z",
    "sequence": 1793355134987
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ab002dda-38c3-4eea-b323-a43e0ccfeb69",
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
  "last_heartbeat_at": "2026-10-30T10:12:15.003392Z",
  "last_location_at": "2026-10-30T10:12:15.003392Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d07a437d-f56e-491c-9d67-e0c45923f207",
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
  "id": "a95c7b99-9a7a-4da5-85d7-a7c5da3f820b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:17:15.204636Z",
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
  "command_id": "5410c953-63ac-464d-b135-9eb8cced2151",
  "quote_id": "a95c7b99-9a7a-4da5-85d7-a7c5da3f820b",
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
  "id": "af2df77e-238d-417b-9fa8-b59855db142c",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3e769e7e-e149-452d-af4a-185612d21e3a",
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
  "created_at": "2026-10-30T10:12:15.406797Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/af2df77e-238d-417b-9fa8-b59855db142c` → **200**

```json
{
  "id": "af2df77e-238d-417b-9fa8-b59855db142c",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3e769e7e-e149-452d-af4a-185612d21e3a",
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
  "created_at": "2026-10-30T10:12:15.406797Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/af2df77e-238d-417b-9fa8-b59855db142c` → **200**

```json
{
  "id": "af2df77e-238d-417b-9fa8-b59855db142c",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3e769e7e-e149-452d-af4a-185612d21e3a",
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
  "created_at": "2026-10-30T10:12:15.406797Z",
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
    "id": "81368744-adea-47df-b3f4-d6a7c03b6603",
    "order_id": "af2df77e-238d-417b-9fa8-b59855db142c",
    "expires_at": "2026-10-30T10:12:31.058531Z",
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

`POST /api/driver/v1/offers/81368744-adea-47df-b3f4-d6a7c03b6603/accept` → **200**

```json
{
  "command_id": "f256da26-96b9-47d5-8079-3b5a9f5089e1"
}
```

```json
{
  "id": "4b983d27-6ba0-4664-979c-c28aff57b1f1",
  "order_id": "af2df77e-238d-417b-9fa8-b59855db142c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ad45de86-9529-4ef8-ad0b-6f71a1647530",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ad45de86-9529-4ef8-ad0b-6f71a1647530",
  "order_id": "af2df77e-238d-417b-9fa8-b59855db142c",
  "assignment_id": "4b983d27-6ba0-4664-979c-c28aff57b1f1",
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

`POST /api/rider/v1/orders/af2df77e-238d-417b-9fa8-b59855db142c/messages` → **201**

```json
{
  "command_id": "085e9e87-b321-4666-99ad-667a764811db",
  "body": "Я біля входу, мій номер +380736727337, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "a8b6aebf-4ec4-4d0b-b75a-138470ff9d92",
  "order_id": "af2df77e-238d-417b-9fa8-b59855db142c",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380736727337, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T10:12:17.539806176Z"
}
```

`POST /api/driver/v1/trips/ad45de86-9529-4ef8-ad0b-6f71a1647530/messages` → **201**

```json
{
  "command_id": "c50262d2-4355-46ab-98c0-411e3fbf751c",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "a37c8afd-0a55-4077-a943-031339f8175e",
  "order_id": "af2df77e-238d-417b-9fa8-b59855db142c",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T10:12:17.739079147Z"
}
```

(the car drives 6 s to the next point)

`POST /api/driver/v1/work-sessions/ab002dda-38c3-4eea-b323-a43e0ccfeb69/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:12:23Z",
    "sequence": 1793355143943
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ab002dda-38c3-4eea-b323-a43e0ccfeb69",
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
  "last_heartbeat_at": "2026-10-30T10:12:23.960978Z",
  "last_location_at": "2026-10-30T10:12:23.960978Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/ad45de86-9529-4ef8-ad0b-6f71a1647530/arrive` → **200**

```json
{
  "command_id": "e9bbcb56-db3c-413c-88d7-0b00219c6b04",
  "expected_version": 0
}
```

```json
{
  "id": "ad45de86-9529-4ef8-ad0b-6f71a1647530",
  "order_id": "af2df77e-238d-417b-9fa8-b59855db142c",
  "assignment_id": "4b983d27-6ba0-4664-979c-c28aff57b1f1",
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
  "arrived_at": "2026-10-30T10:12:24.16706Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ad45de86-9529-4ef8-ad0b-6f71a1647530/start` → **200**

```json
{
  "command_id": "ccee6f94-5935-4de5-9255-e06bd1f9f5da",
  "expected_version": 1
}
```

```json
{
  "id": "ad45de86-9529-4ef8-ad0b-6f71a1647530",
  "order_id": "af2df77e-238d-417b-9fa8-b59855db142c",
  "assignment_id": "4b983d27-6ba0-4664-979c-c28aff57b1f1",
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
  "arrived_at": "2026-10-30T10:12:24.16706Z",
  "started_at": "2026-10-30T10:12:24.379951Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/ab002dda-38c3-4eea-b323-a43e0ccfeb69/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:13:54Z",
    "sequence": 1793355234596
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ab002dda-38c3-4eea-b323-a43e0ccfeb69",
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
  "last_heartbeat_at": "2026-10-30T10:13:54.612816Z",
  "last_location_at": "2026-10-30T10:13:54.612816Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/ad45de86-9529-4ef8-ad0b-6f71a1647530/complete` → **200**

```json
{
  "command_id": "ee3c6177-18f7-4e4f-a343-96e22f93334c",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:13:54Z",
  "cash_received": false
}
```

```json
{
  "id": "ad45de86-9529-4ef8-ad0b-6f71a1647530",
  "order_id": "af2df77e-238d-417b-9fa8-b59855db142c",
  "assignment_id": "4b983d27-6ba0-4664-979c-c28aff57b1f1",
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
  "arrived_at": "2026-10-30T10:12:24.16706Z",
  "started_at": "2026-10-30T10:12:24.379951Z",
  "completed_at": "2026-10-30T10:13:54.820003Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/af2df77e-238d-417b-9fa8-b59855db142c` → **200**

```json
{
  "id": "af2df77e-238d-417b-9fa8-b59855db142c",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "3e769e7e-e149-452d-af4a-185612d21e3a",
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
    "id": "4b983d27-6ba0-4664-979c-c28aff57b1f1",
    "order_id": "af2df77e-238d-417b-9fa8-b59855db142c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ad45de86-9529-4ef8-ad0b-6f71a1647530",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:12:15.406797Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/af2df77e-238d-417b-9fa8-b59855db142c` → **200**

```json
{
  "id": "af2df77e-238d-417b-9fa8-b59855db142c",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "3e769e7e-e149-452d-af4a-185612d21e3a",
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
    "id": "4b983d27-6ba0-4664-979c-c28aff57b1f1",
    "order_id": "af2df77e-238d-417b-9fa8-b59855db142c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ad45de86-9529-4ef8-ad0b-6f71a1647530",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:12:15.406797Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/af2df77e-238d-417b-9fa8-b59855db142c` → **200**

```json
{
  "id": "af2df77e-238d-417b-9fa8-b59855db142c",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "3e769e7e-e149-452d-af4a-185612d21e3a",
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
    "id": "4b983d27-6ba0-4664-979c-c28aff57b1f1",
    "order_id": "af2df77e-238d-417b-9fa8-b59855db142c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ad45de86-9529-4ef8-ad0b-6f71a1647530",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:12:15.406797Z",
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
  "session_id": "ab002dda-38c3-4eea-b323-a43e0ccfeb69",
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
  "last_heartbeat_at": "2026-10-30T10:13:54.612816Z",
  "last_location_at": "2026-10-30T10:13:54.612816Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab002dda-38c3-4eea-b323-a43e0ccfeb69/close` → **200**

```json
{
  "command_id": "dcea3e7f-445f-49b3-9645-a17df2000785",
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
  "session_id": "8abbc077-36b2-4aef-9bb5-18cfb7c14fa9",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTYxMzgsImlhdCI6MTc5MzM1NTIzOCwianRpIjoiZjNmMmExMjYtY2I3MC00YTNhLTg3ODUtZWEwMTIxOWEyN2NhIiwic2lkIjoiOGFiYmMwNzctMzZiMi00YWVmLTliYjUtMThjZmI3YzE0ZmE5In0.naLA3tw2y0fRsAhRIZTkkxpKzkbSgtMuj5Yvu-hGhOs",
  "access_expires_at": "2026-10-30T10:28:58.32826358Z",
  "refresh_token": "emjhfhRdEQbcJ7zTPFIoy-Go3xdTVEhwkAD5WXKpNbM",
  "refresh_expires_at": "2026-10-30T22:13:58.327910208Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/af2df77e-238d-417b-9fa8-b59855db142c/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/af2df77e-238d-417b-9fa8-b59855db142c/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "05d54c3a-c4dd-493a-82f5-aae18276005c"
}
```

`GET /api/admin/v1/orders/af2df77e-238d-417b-9fa8-b59855db142c/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T10:13:58.744555641Z",
  "order": {
    "id": "af2df77e-238d-417b-9fa8-b59855db142c",
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
    "created_at": "2026-10-30T10:12:15.406797Z",
    "assigned_at": "2026-10-30T10:12:17.16943Z",
    "arrived_at": "2026-10-30T10:12:24.16706Z",
    "started_at": "2026-10-30T10:12:24.379951Z",
    "completed_at": "2026-10-30T10:13:54.820003Z"
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
    "id": "3e769e7e-e149-452d-af4a-185612d21e3a",
    "registered_at": "2026-10-30T10:12:13.773668Z",
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
      "created_at": "2026-10-30T10:12:15.408376Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T10:13:55.227913Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/af2df77e-238d-417b-9fa8-b59855db142c/chargebacks` → **422**

```json
{
  "command_id": "ef89bc4a-6e61-4697-9c6b-b6a9c7c33f43",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/af2df77e-238d-417b-9fa8-b59855db142c/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "e5dd0102-a396-48c6-8457-7b382fbc21bc"
}
```

`POST /api/admin/v1/orders/af2df77e-238d-417b-9fa8-b59855db142c/chargebacks` → **201**

```json
{
  "command_id": "41712793-da6b-4aa2-a1e7-a654a9281670",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "94d9778c-2d51-4283-9fb2-d574f297818a",
  "order_id": "af2df77e-238d-417b-9fa8-b59855db142c",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T10:13:59.221988Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/af2df77e-238d-417b-9fa8-b59855db142c/chargebacks` → **201**

```json
{
  "command_id": "41712793-da6b-4aa2-a1e7-a654a9281670",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "94d9778c-2d51-4283-9fb2-d574f297818a",
  "order_id": "af2df77e-238d-417b-9fa8-b59855db142c",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T10:13:59.221988Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/3e769e7e-e149-452d-af4a-185612d21e3a` → **200**

```json
{
  "client": {
    "id": "3e769e7e-e149-452d-af4a-185612d21e3a",
    "phone": "+380736727337",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T10:12:13.773668Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "af2df77e-238d-417b-9fa8-b59855db142c",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T10:12:15.406797Z",
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

`POST /api/admin/v1/orders/af2df77e-238d-417b-9fa8-b59855db142c/chargebacks/94d9778c-2d51-4283-9fb2-d574f297818a/resolve` → **200**

```json
{
  "command_id": "8bf764e2-a4d1-49fb-ad41-8fa03e37db36",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "94d9778c-2d51-4283-9fb2-d574f297818a",
  "order_id": "af2df77e-238d-417b-9fa8-b59855db142c",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T10:13:59.221988Z",
  "resolved_at": "2026-10-30T10:13:59.935028Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/3e769e7e-e149-452d-af4a-185612d21e3a` → **200**

```json
{
  "client": {
    "id": "3e769e7e-e149-452d-af4a-185612d21e3a",
    "phone": "+380736727337",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T10:12:13.773668Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "af2df77e-238d-417b-9fa8-b59855db142c",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T10:12:15.406797Z",
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

`GET /api/admin/v1/clients/3e769e7e-e149-452d-af4a-185612d21e3a` → **200**

```json
{
  "client": {
    "id": "3e769e7e-e149-452d-af4a-185612d21e3a",
    "phone": "+380736727337",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T10:12:13.773668Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "af2df77e-238d-417b-9fa8-b59855db142c",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T10:12:15.406797Z",
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

`POST /api/admin/v1/orders/af2df77e-238d-417b-9fa8-b59855db142c/chargebacks/94d9778c-2d51-4283-9fb2-d574f297818a/resolve` → **409**

```json
{
  "command_id": "f48d82ba-cb91-4d91-9b8b-7601dc5234dd",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/af2df77e-238d-417b-9fa8-b59855db142c/chargebacks/94d9778c-2d51-4283-9fb2-d574f297818a/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d2376617-6892-4b8a-8df5-379e53210659"
}
```

`GET /api/admin/v1/orders/af2df77e-238d-417b-9fa8-b59855db142c/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "94d9778c-2d51-4283-9fb2-d574f297818a",
      "order_id": "af2df77e-238d-417b-9fa8-b59855db142c",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T10:13:59.221988Z",
      "resolved_at": "2026-10-30T10:13:59.935028Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order af2df77e-238d-417b-9fa8-b59855db142c without phone or card digits; chargeback 94d9778c-2d51-4283-9fb2-d574f297818a recorded and won.

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
  "session_id": "ab063234-5ebf-4bab-b01e-1e6b9be53d91",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTYxNDIsImlhdCI6MTc5MzM1NTI0MiwianRpIjoiMGUyNTI1NmYtMjBhZi00ZjgwLTkxZGUtNGYzZTQ0N2ZkM2Y5Iiwic2lkIjoiYWIwNjMyMzQtNWViZi00YmFiLWIwMWUtMWU2YjliZTUzZDkxIn0.pDhFyTLBNaYcqkeoATmGlxt6g7cQhivaJpZk3ggMg6E",
  "access_expires_at": "2026-10-30T10:29:02.387158446Z",
  "refresh_token": "DqOhARBp948i3OxwiEHvJhNs48LQnwBgnHSXmEsOIPQ",
  "refresh_expires_at": "2026-10-30T22:14:02.386748448Z",
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
  "phone": "+48600178196",
  "device_ref": "sandbox-10266"
}
```

```json
{
  "challenge_id": "8eb3970b-8831-4d12-a9fd-bfa3062c3866",
  "expires_at": "2026-10-30T10:19:02.979758116Z",
  "resend_available_at": "2026-10-30T10:14:03.979758116Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600178196` → **200**

```json
{
  "phone": "+48600178196",
  "audience": "CLIENT",
  "code": "602263",
  "sent_at": "2026-10-30T10:14:02.981681623Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8eb3970b-8831-4d12-a9fd-bfa3062c3866",
  "code": "602263",
  "device_ref": "sandbox-10266"
}
```

```json
{
  "session_id": "05bd84a8-e932-4efa-9b0a-1ebbfa552041",
  "subject": {
    "type": "CLIENT",
    "id": "ba9a6603-ccdb-4876-bb3b-b38822c48b4d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYTlhNjYwMy1jY2RiLTQ4NzYtYmIzYi1iMzg4MjJjNDhiNGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2MTQzLCJpYXQiOjE3OTMzNTUyNDMsImp0aSI6IjU4Yzg3ZjE2LTY4YjYtNDhhNC1hZTVlLWQyNGM3ZjgzMTczYiIsInNpZCI6IjA1YmQ4NGE4LWU5MzItNGVmYS05YjBhLTFlYmJmYTU1MjA0MSJ9.R1yDkBOu-15K7S-JAdjdlXe4c_PR6BG3dm8Q1PRNlWs",
  "access_expires_at": "2026-10-30T10:29:03.201833952Z",
  "refresh_token": "eQHjD7_ZeeBnL4kt1U-KvwmH69KACaji9QCNv0G0kZE",
  "refresh_expires_at": "2026-11-29T10:14:03.201509764Z",
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
  "command_id": "d171e940-5be0-4329-a60f-ca3a3ce9b6f3",
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
  "correlation_id": "d6b74161-3cbd-418b-bae8-70a10a036340",
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
  "command_id": "a9084b95-b261-4a5f-a049-64e4e5bb812d",
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
  "paused_at": "2026-10-30T10:14:04.032377262Z",
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
  "command_id": "7036cadd-9e92-48c6-87a4-448a36e7d5f6",
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
  "id": "f003fe4b-d585-47a5-9818-6c6d2a445886",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:19:04.431051Z",
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
  "command_id": "51c7a556-4f51-4ec5-9b4e-89dc2c403dc5",
  "quote_id": "f003fe4b-d585-47a5-9818-6c6d2a445886",
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
  "correlation_id": "5270652a-db11-4a37-ad61-0be6060818a9"
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
  "paused_at": "2026-10-30T10:14:04.032377Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "18421fd4-0cdf-4747-abb4-fb53b528ac13",
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
  "command_id": "ae13d8ef-f01b-454c-8527-f6b50a239f0f",
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
  "command_id": "7074aed2-6b16-48c6-a227-068b31254d10",
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
  "id": "e868d26a-ebbe-457a-951a-d76fc3bc91de",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:19:05.750535Z",
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
  "command_id": "3afc18fe-e5b9-479e-b075-836999e53d4b",
  "quote_id": "e868d26a-ebbe-457a-951a-d76fc3bc91de",
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
  "correlation_id": "b5a62c3f-e406-4944-a852-bdc4f1ebf165"
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
  "command_id": "ab888c15-9049-4b02-9b0f-2d04e5c8eda1",
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
  "command_id": "104ec0ae-ca13-42a1-be03-fee880ac04dd",
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
  "id": "fc3f87cc-fe07-429f-a14a-211fb840ddab",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:19:06.563217Z",
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
  "command_id": "932a262b-7920-45ac-8dab-1e4523184a40",
  "quote_id": "fc3f87cc-fe07-429f-a14a-211fb840ddab",
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
  "correlation_id": "e5088aad-98bb-440b-b971-0f7d3c9539f5"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "5c287a95-6318-4b13-a411-c49768fd2b60",
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
  "correlation_id": "298330a3-be32-4a01-9f5a-3af33462679a"
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
  "command_id": "fb15df1a-319c-4e66-91c0-ffc54b326315",
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
  "phone": "+380675581532",
  "device_ref": "sandbox-15301"
}
```

```json
{
  "challenge_id": "c0f947ff-5c18-4502-b1a2-b7f953c1cd6e",
  "expires_at": "2026-10-30T10:19:07.579880133Z",
  "resend_available_at": "2026-10-30T10:14:08.579880133Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675581532` → **200**

```json
{
  "phone": "+380675581532",
  "audience": "CLIENT",
  "code": "210876",
  "sent_at": "2026-10-30T10:14:07.581860406Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c0f947ff-5c18-4502-b1a2-b7f953c1cd6e",
  "code": "210876",
  "device_ref": "sandbox-15301"
}
```

```json
{
  "session_id": "282ad8e5-b7c3-48aa-953e-bbf98de9bd22",
  "subject": {
    "type": "CLIENT",
    "id": "9ae8945b-c1b6-4a5e-ba45-0e2f4cc8630c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YWU4OTQ1Yi1jMWI2LTRhNWUtYmE0NS0wZTJmNGNjODYzMGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2MTQ3LCJpYXQiOjE3OTMzNTUyNDcsImp0aSI6ImJjNzhjMTkxLWU4MzQtNDU2Mi04Mzc3LTIyYmRkMzM3ZTZiNCIsInNpZCI6IjI4MmFkOGU1LWI3YzMtNDhhYS05NTNlLWJiZjk4ZGU5YmQyMiJ9.Nynu2UiHqgidXw7gBedH-5qm-cUD4vavhSq-PbSwmxI",
  "access_expires_at": "2026-10-30T10:29:07.79421657Z",
  "refresh_token": "kqBDkucQa5rDAtk-ow9hVMAS8Xo5tMKpEerjXOk5i_M",
  "refresh_expires_at": "2026-11-29T10:14:07.793856958Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9ae8945b-c1b6-4a5e-ba45-0e2f4cc8630c",
  "session_id": "282ad8e5-b7c3-48aa-953e-bbf98de9bd22",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "55e0cff7-447c-483e-b903-d1c856ea43ff",
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
  "id": "09ebbc27-8d86-4edd-a924-d54f5dab8cc0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:19:08.171907Z",
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
  "challenge_id": "416872d1-f446-42e2-8ca3-ba5c3e529f57",
  "expires_at": "2026-10-30T10:19:10.366924077Z",
  "resend_available_at": "2026-10-30T10:14:11.366924077Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675581532` → **200**

```json
{
  "phone": "+380675581532",
  "audience": "CLIENT",
  "code": "051801",
  "sent_at": "2026-10-30T10:14:10.368538839Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "b79bb588-aea3-49a7-a373-37361f046a92",
  "challenge_id": "416872d1-f446-42e2-8ca3-ba5c3e529f57",
  "otp_code": "051801"
}
```

```json
{
  "client_id": "9ae8945b-c1b6-4a5e-ba45-0e2f4cc8630c",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T10:14:10.5993072Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "2192d002-54b8-48c4-a0d2-e84a4edc44b5",
  "quote_id": "09ebbc27-8d86-4edd-a924-d54f5dab8cc0",
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
  "correlation_id": "5865534b-745b-49a4-b4e0-f262791549ed"
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
  "session_id": "c9d12a04-6c30-497c-aea6-40fb1007f00f",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTYxNTEsImlhdCI6MTc5MzM1NTI1MSwianRpIjoiM2Y2ZDI5YzAtMjM3Ni00MDVjLThlODItMTEzNTUxOGRlZWNmIiwic2lkIjoiYzlkMTJhMDQtNmMzMC00OTdjLWFlYTYtNDBmYjEwMDdmMDBmIn0.yp0BZPiOYip_2aqfgsAnFHisqj9wc8hQbqzJa6TLuvU",
  "access_expires_at": "2026-10-30T10:29:11.232608948Z",
  "refresh_token": "bSbF6PyHwiPsZEUeP3hktGNMU2tIGEkzvfLxaexSLI0",
  "refresh_expires_at": "2026-10-30T22:14:11.232276938Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "9ae8945b-c1b6-4a5e-ba45-0e2f4cc8630c",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T10:14:10.599307Z",
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

`POST /api/admin/v1/client-deletions/9ae8945b-c1b6-4a5e-ba45-0e2f4cc8630c/complete` → **200**

```json
{
  "command_id": "84333cf3-d6f4-4065-8e97-71a7ed2408d7",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "9ae8945b-c1b6-4a5e-ba45-0e2f4cc8630c",
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
  "correlation_id": "844673a3-f338-4074-a7ce-2b0f1353c2c4"
}
```

Done: client 9ae8945b-c1b6-4a5e-ba45-0e2f4cc8630c anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664115477",
  "device_ref": "sandbox-32595"
}
```

```json
{
  "challenge_id": "8940a5b3-9802-4cbc-8eaa-a3fbceb30391",
  "expires_at": "2026-10-30T10:19:12.061134972Z",
  "resend_available_at": "2026-10-30T10:14:13.061134972Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664115477` → **200**

```json
{
  "phone": "+380664115477",
  "audience": "CLIENT",
  "code": "805907",
  "sent_at": "2026-10-30T10:14:12.063307885Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8940a5b3-9802-4cbc-8eaa-a3fbceb30391",
  "code": "805907",
  "device_ref": "sandbox-32595"
}
```

```json
{
  "session_id": "4d16b383-fa74-476c-a567-4fce41f8c7db",
  "subject": {
    "type": "CLIENT",
    "id": "734b0942-6203-422a-9377-06cca542fc4b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MzRiMDk0Mi02MjAzLTQyMmEtOTM3Ny0wNmNjYTU0MmZjNGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2MTUyLCJpYXQiOjE3OTMzNTUyNTIsImp0aSI6IjM0ZDBlYTZkLTUxZmItNGYwZC1iNjQxLWY4MDQ2NjZlZjg1MiIsInNpZCI6IjRkMTZiMzgzLWZhNzQtNDc2Yy1hNTY3LTRmY2U0MWY4YzdkYiJ9.33IjxbbbE4nRXF8UR7RFmRDkySHVurRP21sNmsv7B2A",
  "access_expires_at": "2026-10-30T10:29:12.27788739Z",
  "refresh_token": "ZXHaWWhkcApe_APlZioJvP9V4v5ANTac3QUnsL3pi8o",
  "refresh_expires_at": "2026-11-29T10:14:12.277400156Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "734b0942-6203-422a-9377-06cca542fc4b",
  "session_id": "4d16b383-fa74-476c-a567-4fce41f8c7db",
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
  "session_id": "7310be23-d245-47a5-a126-4c3b5673b8ef",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTYxNTIsImlhdCI6MTc5MzM1NTI1MiwianRpIjoiODc1MWMxNmMtYmM3OS00MTFlLTg4NjUtZjE2NDA2ZDJmMjcyIiwic2lkIjoiNzMxMGJlMjMtZDI0NS00N2E1LWExMjYtNGMzYjU2NzNiOGVmIn0.rsFcd4RKVtzfrqUKz95pP_pOxrm_BKPTk1XY0_lVLfU",
  "access_expires_at": "2026-10-30T10:29:12.861071714Z",
  "refresh_token": "1_lXZt8aza0YO9JmBYOjZBsAFA-zPVV225PngA-l2os",
  "refresh_expires_at": "2026-10-30T22:14:12.860692032Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=4115477&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "734b0942-6203-422a-9377-06cca542fc4b",
      "phone": "+380664115477",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T10:14:12.275988Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/734b0942-6203-422a-9377-06cca542fc4b` → **200**

```json
{
  "client": {
    "id": "734b0942-6203-422a-9377-06cca542fc4b",
    "phone": "+380664115477",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T10:14:12.275988Z",
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

`POST /api/admin/v1/clients/734b0942-6203-422a-9377-06cca542fc4b/block` → **400**

```json
{
  "command_id": "1fc52efe-15d7-4aec-b52d-fbc69c21432a",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/734b0942-6203-422a-9377-06cca542fc4b/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "3dcf66e2-19b3-4cb4-a635-85c0da913ae7",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/734b0942-6203-422a-9377-06cca542fc4b/block` → **200**

```json
{
  "command_id": "bcc3bab3-6558-49c3-981c-5b29da44da61",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "734b0942-6203-422a-9377-06cca542fc4b",
  "phone": "+380664115477",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T10:14:12.275988Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T10:14:13.700896Z",
    "by": "fc83930a-0f00-4627-8f4f-e260893ced8f"
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
  "correlation_id": "3a1c10c3-dee1-473a-88ae-86dd695e375e"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664115477",
  "device_ref": "sandbox-29078"
}
```

```json
{
  "challenge_id": "a2942ebe-8106-4af2-a095-33d244d8761f",
  "expires_at": "2026-10-30T10:19:16.088672924Z",
  "resend_available_at": "2026-10-30T10:14:17.088672924Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664115477` → **200**

```json
{
  "phone": "+380664115477",
  "audience": "CLIENT",
  "code": "877691",
  "sent_at": "2026-10-30T10:14:16.094032658Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "a2942ebe-8106-4af2-a095-33d244d8761f",
  "code": "877691",
  "device_ref": "sandbox-29078"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "630c4633-74c8-453c-98bd-49ae4146d961"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/734b0942-6203-422a-9377-06cca542fc4b` → **200**

```json
{
  "client": {
    "id": "734b0942-6203-422a-9377-06cca542fc4b",
    "phone": "+380664115477",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T10:14:12.275988Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T10:14:13.700896Z",
      "by": "fc83930a-0f00-4627-8f4f-e260893ced8f"
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

`POST /api/admin/v1/clients/734b0942-6203-422a-9377-06cca542fc4b/unblock` → **200**

```json
{
  "command_id": "be720daa-e069-45d9-b45e-1aebd17977de",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "734b0942-6203-422a-9377-06cca542fc4b",
  "phone": "+380664115477",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T10:14:12.275988Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664115477",
  "device_ref": "sandbox-12246"
}
```

```json
{
  "challenge_id": "d1ecddb9-22b0-42d1-a71b-72f1f0ff3032",
  "expires_at": "2026-10-30T10:19:18.92640014Z",
  "resend_available_at": "2026-10-30T10:14:19.92640014Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664115477` → **200**

```json
{
  "phone": "+380664115477",
  "audience": "CLIENT",
  "code": "235487",
  "sent_at": "2026-10-30T10:14:18.928260863Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d1ecddb9-22b0-42d1-a71b-72f1f0ff3032",
  "code": "235487",
  "device_ref": "sandbox-12246"
}
```

```json
{
  "session_id": "a8bc253a-fc5a-4755-b8bd-5e070648aae3",
  "subject": {
    "type": "CLIENT",
    "id": "734b0942-6203-422a-9377-06cca542fc4b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MzRiMDk0Mi02MjAzLTQyMmEtOTM3Ny0wNmNjYTU0MmZjNGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2MTU5LCJpYXQiOjE3OTMzNTUyNTksImp0aSI6IjZkYmNkNGU5LTZmYjUtNDg2OC04YzY5LWNkZjAwNmU4ZGY3ZCIsInNpZCI6ImE4YmMyNTNhLWZjNWEtNDc1NS1iOGJkLTVlMDcwNjQ4YWFlMyJ9.Uguk2Y1pv--08a46uGa3wHU9wvp4WNktrp-IZBxH_-c",
  "access_expires_at": "2026-10-30T10:29:19.134199977Z",
  "refresh_token": "NcqV28IVrAL0z_HQJzSDyu7VkSIvwuT2AYsqpjaIvic",
  "refresh_expires_at": "2026-11-29T10:14:19.133811827Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "734b0942-6203-422a-9377-06cca542fc4b",
  "session_id": "a8bc253a-fc5a-4755-b8bd-5e070648aae3",
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
  "phone": "+380662854384",
  "device_ref": "sandbox-6891"
}
```

```json
{
  "challenge_id": "8b19d7ea-e208-4259-bd73-16b8d3674e84",
  "expires_at": "2026-10-30T10:19:19.501079091Z",
  "resend_available_at": "2026-10-30T10:14:20.501079091Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662854384` → **200**

```json
{
  "phone": "+380662854384",
  "audience": "CLIENT",
  "code": "429518",
  "sent_at": "2026-10-30T10:14:19.503028553Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8b19d7ea-e208-4259-bd73-16b8d3674e84",
  "code": "429518",
  "device_ref": "sandbox-6891"
}
```

```json
{
  "session_id": "553fa587-bed1-4e07-8977-9b2307a15ba6",
  "subject": {
    "type": "CLIENT",
    "id": "3f83c717-edfd-45b7-b9db-efd66d407f15"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZjgzYzcxNy1lZGZkLTQ1YjctYjlkYi1lZmQ2NmQ0MDdmMTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2MTU5LCJpYXQiOjE3OTMzNTUyNTksImp0aSI6ImE0ODNjNGZmLTA1MDAtNDA2MS1iZWExLTM2YjdkMGY3N2MyOCIsInNpZCI6IjU1M2ZhNTg3LWJlZDEtNGUwNy04OTc3LTliMjMwN2ExNWJhNiJ9.88VOVN4j-Hax3VrtI7yZccF3I76Reqmkio3BvSg14-8",
  "access_expires_at": "2026-10-30T10:29:19.70510754Z",
  "refresh_token": "d1VCeGevZwCm4gFWCS7HQQPSLXPNJbDtS8fJkdicmfA",
  "refresh_expires_at": "2026-11-29T10:14:19.704736601Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d18bd2ae-4ccf-4f3c-8eb2-c222b0fe295b",
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
  "id": "24bc8a9c-f336-48c2-b887-5c8f66c457ad",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:19:19.892704Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 0a9a51a3-01d1-4fdd-a57c-d71afc38b7f4) → **201**

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
  "session_id": "e9205435-1af2-43b5-82ff-decd5434ef69",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTYxNjAsImlhdCI6MTc5MzM1NTI2MCwianRpIjoiYjQxYWQxODQtM2FhMi00ZTI0LTk4ZDktYzY0Y2MzYjZjNjdmIiwic2lkIjoiZTkyMDU0MzUtMWFmMi00M2I1LTgyZmYtZGVjZDU0MzRlZjY5In0.0VGLFPBHO-rH9PBxlUAasVPrKy_T1yGrD7WNkZxx08w",
  "access_expires_at": "2026-10-30T10:29:20.345529866Z",
  "refresh_token": "wTQjPmT01DKvBOWTrt4Ma0sW6PD-MPF7gDf03dRTiro",
  "refresh_expires_at": "2026-10-30T22:14:20.345162172Z",
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
  "session_id": "81ee4e96-ba02-4ff0-8af9-11422f1eeec9",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTYxNjAsImlhdCI6MTc5MzM1NTI2MCwianRpIjoiNzIxMzEzNTItZDVlYy00YjM0LTg0NjItOTJlYWYzOWNmNzc3Iiwic2lkIjoiODFlZTRlOTYtYmEwMi00ZmYwLThhZjktMTE0MjJmMWVlZWM5In0.KqIaaf35h2HdSphdL1ZUU23hrWpNB99aw7WqkurMqYE",
  "access_expires_at": "2026-10-30T10:29:20.719392475Z",
  "refresh_token": "p8PvxhG3ON4Ry2PPrlCkAum24QeYI3szNxIDYfyKDLU",
  "refresh_expires_at": "2026-10-30T22:14:20.719062408Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ee069e8e-eb35-459d-affb-6933fb84aff0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T10:14:20.122593Z",
      "actor": {
        "type": "CLIENT",
        "id": "3f83c717-edfd-45b7-b9db-efd66d407f15",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ee069e8e-eb35-459d-affb-6933fb84aff0",
        "quote_id": "24bc8a9c-f336-48c2-b887-5c8f66c457ad",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "0a9a51a3-01d1-4fdd-a57c-d71afc38b7f4"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T10:14:20.123632Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ee069e8e-eb35-459d-affb-6933fb84aff0",
        "attempt_id": "dd35da5b-9325-4507-b3e0-b52fd2d7165d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0a9a51a3-01d1-4fdd-a57c-d71afc38b7f4"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T10:14:20.12609Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ee069e8e-eb35-459d-affb-6933fb84aff0",
        "attempt_id": "dd35da5b-9325-4507-b3e0-b52fd2d7165d"
      },
      "correlation_id": "0a9a51a3-01d1-4fdd-a57c-d71afc38b7f4"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "dd35da5b-9325-4507-b3e0-b52fd2d7165d",
        "generation": 1,
        "started_at": "2026-10-30T10:14:20.12309Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T10:14:20.12609Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T10:14:20.123985Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/0a9a51a3-01d1-4fdd-a57c-d71afc38b7f4` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "ee069e8e-eb35-459d-affb-6933fb84aff0:0",
      "order_id": "ee069e8e-eb35-459d-affb-6933fb84aff0",
      "at": "2026-10-30T10:14:20.122593Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "ee069e8e-eb35-459d-affb-6933fb84aff0:1",
      "order_id": "ee069e8e-eb35-459d-affb-6933fb84aff0",
      "at": "2026-10-30T10:14:20.123632Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "ee069e8e-eb35-459d-affb-6933fb84aff0:2",
      "order_id": "ee069e8e-eb35-459d-affb-6933fb84aff0",
      "at": "2026-10-30T10:14:20.12609Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/6f51ca95-f082-4206-8e74-70a8371fdda8` → **200**

```json
{
  "found": []
}
```

Done: request 0a9a51a3-01d1-4fdd-a57c-d71afc38b7f4 — order ee069e8e-eb35-459d-affb-6933fb84aff0 found by its id.

`GET /api/rider/v1/orders/ee069e8e-eb35-459d-affb-6933fb84aff0` → **200**

```json
{
  "id": "ee069e8e-eb35-459d-affb-6933fb84aff0",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f83c717-edfd-45b7-b9db-efd66d407f15",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:14:20.122251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ee069e8e-eb35-459d-affb-6933fb84aff0/cancel` → **200**

```json
{
  "command_id": "f8547627-2b07-44b6-9028-7d7f2dfdfa7e",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ee069e8e-eb35-459d-affb-6933fb84aff0",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3f83c717-edfd-45b7-b9db-efd66d407f15",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:14:20.122251Z",
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
  "phone": "+380639300267",
  "device_ref": "sandbox-14275"
}
```

```json
{
  "challenge_id": "a577ab5c-6e57-4074-9f98-23e5440728ea",
  "expires_at": "2026-10-30T10:19:21.883033601Z",
  "resend_available_at": "2026-10-30T10:14:22.883033601Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639300267` → **200**

```json
{
  "phone": "+380639300267",
  "audience": "CLIENT",
  "code": "751894",
  "sent_at": "2026-10-30T10:14:21.885100406Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a577ab5c-6e57-4074-9f98-23e5440728ea",
  "code": "751894",
  "device_ref": "sandbox-14275"
}
```

```json
{
  "session_id": "ed3b90f4-3090-4d6f-9972-d7f3cc399358",
  "subject": {
    "type": "CLIENT",
    "id": "a0321b78-e541-4b06-9f60-bd1569ad44e7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMDMyMWI3OC1lNTQxLTRiMDYtOWY2MC1iZDE1NjlhZDQ0ZTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2MTYyLCJpYXQiOjE3OTMzNTUyNjIsImp0aSI6ImQ4ZDVkNWUzLTJmMzQtNDMzYy05MWE2LWM0NDgxZjQ2MzgyYyIsInNpZCI6ImVkM2I5MGY0LTMwOTAtNGQ2Zi05OTcyLWQ3ZjNjYzM5OTM1OCJ9.8Tclfo5_m63Cv6fPrsFF4p57V5FDvs7KR5hgc0v0NLE",
  "access_expires_at": "2026-10-30T10:29:22.094853344Z",
  "refresh_token": "a6SElfF-m_sOGNuMGCqvQ8LvH8uyLuxug560k7iYbp0",
  "refresh_expires_at": "2026-11-29T10:14:22.094476466Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "8fe9507c-89f1-4d8d-8678-118c46fb92d1",
  "expires_at": "2026-10-30T10:19:24.287653226Z",
  "resend_available_at": "2026-10-30T10:14:25.287653226Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639300267` → **200**

```json
{
  "phone": "+380639300267",
  "audience": "CLIENT",
  "code": "940388",
  "sent_at": "2026-10-30T10:14:24.289293497Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "5b6bd5d4-4c01-4ce4-8bf4-da5bd0656f7c",
  "challenge_id": "8fe9507c-89f1-4d8d-8678-118c46fb92d1",
  "otp_code": "940388"
}
```

```json
{
  "id": "b3cb6335-dc79-4bfe-9d59-6c8edffc48e5",
  "state": "PENDING",
  "created_at": "2026-10-30T10:14:24.502103Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/b3cb6335-dc79-4bfe-9d59-6c8edffc48e5` → **200**

```json
{
  "id": "b3cb6335-dc79-4bfe-9d59-6c8edffc48e5",
  "state": "PENDING",
  "created_at": "2026-10-30T10:14:24.502103Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b3cb6335-dc79-4bfe-9d59-6c8edffc48e5` → **200**

```json
{
  "id": "b3cb6335-dc79-4bfe-9d59-6c8edffc48e5",
  "state": "PENDING",
  "created_at": "2026-10-30T10:14:24.502103Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b3cb6335-dc79-4bfe-9d59-6c8edffc48e5` → **200**

```json
{
  "id": "b3cb6335-dc79-4bfe-9d59-6c8edffc48e5",
  "state": "PENDING",
  "created_at": "2026-10-30T10:14:24.502103Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b3cb6335-dc79-4bfe-9d59-6c8edffc48e5` → **200**

```json
{
  "id": "b3cb6335-dc79-4bfe-9d59-6c8edffc48e5",
  "state": "READY",
  "created_at": "2026-10-30T10:14:24.502103Z",
  "ready_at": "2026-10-30T10:14:28.044189Z",
  "expires_at": "2026-11-06T10:14:28.044189Z",
  "size_bytes": 1030
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/b3cb6335-dc79-4bfe-9d59-6c8edffc48e5/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630134428",
  "device_ref": "sandbox-6793"
}
```

```json
{
  "challenge_id": "1e5bc852-e276-4c85-bd46-fd6628953c30",
  "expires_at": "2026-10-30T10:19:28.441049727Z",
  "resend_available_at": "2026-10-30T10:14:29.441049727Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630134428` → **200**

```json
{
  "phone": "+380630134428",
  "audience": "CLIENT",
  "code": "364954",
  "sent_at": "2026-10-30T10:14:28.443159334Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e5bc852-e276-4c85-bd46-fd6628953c30",
  "code": "364954",
  "device_ref": "sandbox-6793"
}
```

```json
{
  "session_id": "07fb204f-1090-4251-bffb-edc5c78de332",
  "subject": {
    "type": "CLIENT",
    "id": "87667839-6f62-48c7-9432-fb1e131e4410"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NzY2NzgzOS02ZjYyLTQ4YzctOTQzMi1mYjFlMTMxZTQ0MTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2MTY4LCJpYXQiOjE3OTMzNTUyNjgsImp0aSI6Ijk0YjMxOTBlLWI0NDEtNDhlZS1iYTQ4LWE2YzhlODVkYTE1YyIsInNpZCI6IjA3ZmIyMDRmLTEwOTAtNDI1MS1iZmZiLWVkYzVjNzhkZTMzMiJ9.rssLjoWBbtyyLat-Ubf0a6ysP3aHbNf5glJX73fzPs4",
  "access_expires_at": "2026-10-30T10:29:28.658835453Z",
  "refresh_token": "BTrvBLGPNzQXcLdYspEcg_xGYiEffgAieINWtaDBeS0",
  "refresh_expires_at": "2026-11-29T10:14:28.658496252Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/b3cb6335-dc79-4bfe-9d59-6c8edffc48e5/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/b3cb6335-dc79-4bfe-9d59-6c8edffc48e5/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "886fda78-f678-4831-b525-3b8051d26fd6"
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
  "session_id": "5158753d-fd44-40b0-aa28-e0795467089c",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTYxNjksImlhdCI6MTc5MzM1NTI2OSwianRpIjoiZmI3MjcwNzYtMzU1Yy00M2Y2LTg3NTYtM2NmYWFkM2M4YTc1Iiwic2lkIjoiNTE1ODc1M2QtZmQ0NC00MGIwLWFhMjgtZTA3OTU0NjcwODljIn0.hFXhyo5b-is36_mDrRjhZTHCap_yczsbsaU4yUJ9jKA",
  "access_expires_at": "2026-10-30T10:29:29.257993143Z",
  "refresh_token": "m22i1SBT5jB6KIPvjU4O_cVraG9ne-ViyIt6nY71o7s",
  "refresh_expires_at": "2026-10-30T22:14:29.257588393Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a0321b78-e541-4b06-9f60-bd1569ad44e7",
  "session_id": "ed3b90f4-3090-4d6f-9972-d7f3cc399358",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/a0321b78-e541-4b06-9f60-bd1569ad44e7/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "b3cb6335-dc79-4bfe-9d59-6c8edffc48e5",
      "state": "READY",
      "created_at": "2026-10-30T10:14:24.502103Z",
      "ready_at": "2026-10-30T10:14:28.044189Z",
      "expires_at": "2026-11-06T10:14:28.044189Z",
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
  "device_ref": "sandbox-26407"
}
```

```json
{
  "challenge_id": "a548b138-4e1b-4e0d-adc4-7d4af6cf638d",
  "expires_at": "2026-10-30T10:19:29.827497545Z",
  "resend_available_at": "2026-10-30T10:14:30.827497545Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "456691",
  "sent_at": "2026-10-30T10:14:29.829683999Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a548b138-4e1b-4e0d-adc4-7d4af6cf638d",
  "code": "456691",
  "device_ref": "sandbox-26407"
}
```

```json
{
  "session_id": "060a8369-46b5-4091-b0ea-a4bcb45e0eb7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NjE3MCwiaWF0IjoxNzkzMzU1MjcwLCJqdGkiOiI2N2Y2MDdkYi00OGUxLTQ5ZGYtOGM4YS1lOGFkM2M3YmQxNmUiLCJzaWQiOiIwNjBhODM2OS00NmI1LTQwOTEtYjBlYS1hNGJjYjQ1ZTBlYjcifQ.UFhpa57y5VAP4y2pExXj2GZzRJsARv1zNr10C8MxkrQ",
  "access_expires_at": "2026-10-30T10:29:30.045353766Z",
  "refresh_token": "tJGFOeOEUrx6l-E4uYS4uCabNljNO2R9trmwc7HwOmA",
  "refresh_expires_at": "2026-11-29T10:14:30.044947029Z",
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
  "device_ref": "sandbox-6985"
}
```

```json
{
  "challenge_id": "0628107e-2ebf-454b-aff1-0e51b9e00821",
  "expires_at": "2026-10-30T10:19:30.418140929Z",
  "resend_available_at": "2026-10-30T10:14:31.418140929Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "919593",
  "sent_at": "2026-10-30T10:14:30.420140881Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0628107e-2ebf-454b-aff1-0e51b9e00821",
  "code": "919593",
  "device_ref": "sandbox-6985"
}
```

```json
{
  "session_id": "349e002d-891f-462e-a312-d9609dae1249",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NjE3MCwiaWF0IjoxNzkzMzU1MjcwLCJqdGkiOiI0MTdiMzY5ZC02YzlhLTRiYTYtODk4OS01ZDYwMTc1MGNmYjciLCJzaWQiOiIzNDllMDAyZC04OTFmLTQ2MmUtYTMxMi1kOTYwOWRhZTEyNDkifQ.2sYXSndy6hm1zGApt9yHqsJU9WSQgHA1KCrBlENPCHQ",
  "access_expires_at": "2026-10-30T10:29:30.630632195Z",
  "refresh_token": "H6Un1K9XgIvKqiQWt-QhxUlHQbThToNbM-fr9LHDoVE",
  "refresh_expires_at": "2026-11-29T10:14:30.63027371Z",
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
  "command_id": "4b4e46c4-eeb7-4344-be13-8fee6b9db54f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:14:31Z",
    "sequence": 1793355271148
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f462b2b3-4869-457a-a40f-5df7df02c55b",
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
  "last_heartbeat_at": "2026-10-30T10:14:31.030515Z",
  "last_location_at": "2026-10-30T10:14:31.030515Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-1345"
}
```

```json
{
  "challenge_id": "93c4d8e5-1163-40ff-befc-9af10da6fd3f",
  "expires_at": "2026-10-30T10:19:31.223726877Z",
  "resend_available_at": "2026-10-30T10:14:32.223726877Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "210880",
  "sent_at": "2026-10-30T10:14:31.225782072Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "93c4d8e5-1163-40ff-befc-9af10da6fd3f",
  "code": "210880",
  "device_ref": "sandbox-1345"
}
```

```json
{
  "session_id": "2333a328-351a-41cb-8828-c58e5287cd34",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NjE3MSwiaWF0IjoxNzkzMzU1MjcxLCJqdGkiOiJlOTFjYzdkMS1lMTJhLTRiMWMtOTVlOS01M2VjNDQ0MWVjN2MiLCJzaWQiOiIyMzMzYTMyOC0zNTFhLTQxY2ItODgyOC1jNThlNTI4N2NkMzQifQ.4UIKetoDp80BZiXUC2WmN1lsRNcZlAccijEOEmPM1WA",
  "access_expires_at": "2026-10-30T10:29:31.446912557Z",
  "refresh_token": "Ync7_sy1pPE7WKpp064Gjizw1O6HbgjBOllcYj7Bs-o",
  "refresh_expires_at": "2026-11-29T10:14:31.446533181Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d48386cb-8037-4208-95d7-25d1820e87b0",
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
  "last_heartbeat_at": "2026-10-30T10:10:50.422523Z",
  "last_location_at": "2026-10-30T10:10:50.422523Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d48386cb-8037-4208-95d7-25d1820e87b0/handover` → **200**

```json
{
  "command_id": "1108de47-5820-4636-bdfa-3e4d36e258f5",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d48386cb-8037-4208-95d7-25d1820e87b0",
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
  "last_heartbeat_at": "2026-10-30T10:10:50.422523Z",
  "last_location_at": "2026-10-30T10:10:50.422523Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d48386cb-8037-4208-95d7-25d1820e87b0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:14:32Z",
    "sequence": 1793355272164
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d48386cb-8037-4208-95d7-25d1820e87b0",
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
  "last_heartbeat_at": "2026-10-30T10:14:32.036439Z",
  "last_location_at": "2026-10-30T10:14:32.036439Z",
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
  "session_id": "7d3803e7-6150-4907-b9f6-d4415b9d8257",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTYxNzIsImlhdCI6MTc5MzM1NTI3MiwianRpIjoiMjRmZWFhOTUtYTA1My00NTcxLTg5OTgtN2RiOGE5OWFlNjFiIiwic2lkIjoiN2QzODAzZTctNjE1MC00OTA3LWI5ZjYtZDQ0MTViOWQ4MjU3In0.Y4jS2vIjKV_V0b_F-IIEL_z3tD6_GhKUyFNNOiFP2jE",
  "access_expires_at": "2026-10-30T10:29:32.41624446Z",
  "refresh_token": "7lMlLD9utj8vCz3QAzD_HJZ5RzcecAl9TcRybb9WckM",
  "refresh_expires_at": "2026-10-30T22:14:32.415888774Z",
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
  "session_id": "7c8d6597-7cba-4d2e-b071-18f0e2ed6cb9",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTYxNzIsImlhdCI6MTc5MzM1NTI3MiwianRpIjoiZTEzMTE5NTQtMjk3ZC00NTg5LWFjMTEtZjY4ZDkxMzE1ZGM0Iiwic2lkIjoiN2M4ZDY1OTctN2NiYS00ZDJlLWIwNzEtMThmMGUyZWQ2Y2I5In0.klWqPlcemZw6EAmcy0Xgb1uQdp3v8K3aO-9zjF7QGUE",
  "access_expires_at": "2026-10-30T10:29:32.801946953Z",
  "refresh_token": "nMGrZjPzhCs1dR5Sk6nZxrkfO4WcLjlXY9CeF3gCXEE",
  "refresh_expires_at": "2026-10-30T22:14:32.801483555Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686032375",
  "device_ref": "sandbox-5149"
}
```

```json
{
  "challenge_id": "b347c72c-e33e-4908-af23-88640399b659",
  "expires_at": "2026-10-30T10:19:32.9926989Z",
  "resend_available_at": "2026-10-30T10:14:33.9926989Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380686032375` → **200**

```json
{
  "phone": "+380686032375",
  "audience": "CLIENT",
  "code": "701315",
  "sent_at": "2026-10-30T10:14:32.994561796Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b347c72c-e33e-4908-af23-88640399b659",
  "code": "701315",
  "device_ref": "sandbox-5149"
}
```

```json
{
  "session_id": "62e2c3c5-366b-4bae-a1d6-137821bf2028",
  "subject": {
    "type": "CLIENT",
    "id": "921b9d40-d6a1-482e-82ea-e231bedb0142"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MjFiOWQ0MC1kNmExLTQ4MmUtODJlYS1lMjMxYmVkYjAxNDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2MTczLCJpYXQiOjE3OTMzNTUyNzMsImp0aSI6IjVjNzNjMDc4LTBmYjQtNGUyMy1hYTBjLTQ4ZGZkOTc2OWIxZSIsInNpZCI6IjYyZTJjM2M1LTM2NmItNGJhZS1hMWQ2LTEzNzgyMWJmMjAyOCJ9.Q35Rab4maKRh9IJA5HzQze9JBOTfVF-ZRUuzlBZsaLo",
  "access_expires_at": "2026-10-30T10:29:33.22826834Z",
  "refresh_token": "O_Me5bJStUNOmHqkSmqyDXciBa9jdbPU1nLeAUG9g-s",
  "refresh_expires_at": "2026-11-29T10:14:33.22705334Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8619274e-7fd7-4a99-917c-71556b85e9e5",
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
  "id": "79a292a3-95de-4400-b61c-c30fc398801f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:19:33.426037Z",
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
  "command_id": "3aa42ec4-0ae1-4b30-b508-187472c16438",
  "quote_id": "79a292a3-95de-4400-b61c-c30fc398801f",
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
  "id": "0ab19226-854a-4d86-b0e8-a24e4839c107",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "921b9d40-d6a1-482e-82ea-e231bedb0142",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:14:33.625887Z",
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
    "id": "8c3f4d4d-8f26-4996-b0af-c9674cbae06a",
    "order_id": "0ab19226-854a-4d86-b0e8-a24e4839c107",
    "expires_at": "2026-10-30T10:14:48.627895Z",
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

`POST /api/driver/v1/offers/8c3f4d4d-8f26-4996-b0af-c9674cbae06a/reject` → **204**

```json
{
  "command_id": "aecf3d61-8bd0-46f7-a926-bde9efcb3e66"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "a6b03222-e775-45f4-8ee0-850406c72e22",
    "order_id": "0ab19226-854a-4d86-b0e8-a24e4839c107",
    "expires_at": "2026-10-30T10:14:49.038159Z",
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

`POST /api/driver/v1/offers/a6b03222-e775-45f4-8ee0-850406c72e22/accept` → **200**

```json
{
  "command_id": "8c6c0394-109c-4c06-beb0-c5af4bc38009"
}
```

```json
{
  "id": "945f346f-d5cd-4605-9aae-7624462edf66",
  "order_id": "0ab19226-854a-4d86-b0e8-a24e4839c107",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "de764ebd-6983-49ed-b3dc-31e52b235b80",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/0ab19226-854a-4d86-b0e8-a24e4839c107/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T10:14:33.626212Z",
      "actor": {
        "type": "CLIENT",
        "id": "921b9d40-d6a1-482e-82ea-e231bedb0142",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "0ab19226-854a-4d86-b0e8-a24e4839c107",
        "quote_id": "79a292a3-95de-4400-b61c-c30fc398801f",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "265909c5-f17a-4a9b-93c4-1d93c02e2156"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T10:14:33.627436Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0ab19226-854a-4d86-b0e8-a24e4839c107",
        "attempt_id": "9d207ba9-f5e4-44bd-8fb9-bacfb708bb1b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "265909c5-f17a-4a9b-93c4-1d93c02e2156"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T10:14:33.629147Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "8c3f4d4d-8f26-4996-b0af-c9674cbae06a",
        "order_id": "0ab19226-854a-4d86-b0e8-a24e4839c107",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "265909c5-f17a-4a9b-93c4-1d93c02e2156"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T10:14:34.037495Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "8c3f4d4d-8f26-4996-b0af-c9674cbae06a",
        "order_id": "0ab19226-854a-4d86-b0e8-a24e4839c107"
      },
      "correlation_id": "76d897bd-8fb6-44ba-b5d2-19c6d8937404"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 0ab19226-854a-4d86-b0e8-a24e4839c107 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/0ab19226-854a-4d86-b0e8-a24e4839c107` → **200**

```json
{
  "id": "0ab19226-854a-4d86-b0e8-a24e4839c107",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "921b9d40-d6a1-482e-82ea-e231bedb0142",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "945f346f-d5cd-4605-9aae-7624462edf66",
    "order_id": "0ab19226-854a-4d86-b0e8-a24e4839c107",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "de764ebd-6983-49ed-b3dc-31e52b235b80",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T10:14:33.625887Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0ab19226-854a-4d86-b0e8-a24e4839c107/cancel` → **200**

```json
{
  "command_id": "8ba82070-e897-478e-9a82-a7f14d0cb7f9",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "0ab19226-854a-4d86-b0e8-a24e4839c107",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "921b9d40-d6a1-482e-82ea-e231bedb0142",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "945f346f-d5cd-4605-9aae-7624462edf66",
    "order_id": "0ab19226-854a-4d86-b0e8-a24e4839c107",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "de764ebd-6983-49ed-b3dc-31e52b235b80",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T10:14:33.625887Z",
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
  "session_id": "f462b2b3-4869-457a-a40f-5df7df02c55b",
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
  "last_heartbeat_at": "2026-10-30T10:14:31.030515Z",
  "last_location_at": "2026-10-30T10:14:31.030515Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f462b2b3-4869-457a-a40f-5df7df02c55b/close` → **200**

```json
{
  "command_id": "dd3db152-323a-42cb-a566-419aea69af27",
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
  "session_id": "d48386cb-8037-4208-95d7-25d1820e87b0",
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
  "last_heartbeat_at": "2026-10-30T10:14:32.036439Z",
  "last_location_at": "2026-10-30T10:14:32.036439Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d48386cb-8037-4208-95d7-25d1820e87b0/close` → **200**

```json
{
  "command_id": "837feaa6-af3c-4e46-9d04-fcf243bcaed9",
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
  "session_id": "40254528-fce9-40b0-b2ea-560b3c74d2ec",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTYxNzYsImlhdCI6MTc5MzM1NTI3NiwianRpIjoiYTZkNzFhZWYtNzczOC00NDVlLWE3YjYtMzIwMWQxODAwZGRmIiwic2lkIjoiNDAyNTQ1MjgtZmNlOS00MGIwLWIyZWEtNTYwYjNjNzRkMmVjIn0.ZvIOXnLxIq1dKB4Ja7SWy-SOnsMVYEeszOJZiXEVVgE",
  "access_expires_at": "2026-10-30T10:29:36.105211502Z",
  "refresh_token": "Z6seAiJNupF_zXDMJlk-ugdmdiUlQx-ByFqpyONaA0g",
  "refresh_expires_at": "2026-10-30T22:14:36.104886022Z",
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
  "command_id": "938a0c92-78bd-48ab-b4bb-e513dfb3e332",
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
  "changed_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T10:14:36.511745Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "4c83a444-a57c-48cc-a582-660834897922",
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
  "correlation_id": "add0ea6a-6013-41ff-8a8f-e295cefd0c8a"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "d8f7beeb-7c8e-4b6e-b1fd-d0155a0dee20",
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
  "correlation_id": "77cbb808-3207-42f1-a719-d8401714e996"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635219602",
  "device_ref": "sandbox-26682"
}
```

```json
{
  "challenge_id": "240d21b8-9754-4839-aada-64a115e030df",
  "expires_at": "2026-10-30T10:19:37.137720459Z",
  "resend_available_at": "2026-10-30T10:14:38.137720459Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635219602` → **200**

```json
{
  "phone": "+380635219602",
  "audience": "CLIENT",
  "code": "466440",
  "sent_at": "2026-10-30T10:14:37.13976517Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "240d21b8-9754-4839-aada-64a115e030df",
  "code": "466440",
  "device_ref": "sandbox-26682"
}
```

```json
{
  "session_id": "3a6ff0f6-cb15-4969-a403-07ed6b020ca2",
  "subject": {
    "type": "CLIENT",
    "id": "dc06af66-76cc-42a1-8aeb-2b20977f261f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYzA2YWY2Ni03NmNjLTQyYTEtOGFlYi0yYjIwOTc3ZjI2MWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2MTc3LCJpYXQiOjE3OTMzNTUyNzcsImp0aSI6Ijc0Zjc0YjdhLTM0NTAtNDIwOC04M2UxLTg5NDU0Y2Q5ZmRkYSIsInNpZCI6IjNhNmZmMGY2LWNiMTUtNDk2OS1hNDAzLTA3ZWQ2YjAyMGNhMiJ9.m7HQEhdjcKf8zpAAnThLxdWsq0xD9QESPt8LatjWpB4",
  "access_expires_at": "2026-10-30T10:29:37.363045372Z",
  "refresh_token": "fVJExdbFlqQPUC8TLh3Ap0Wz1HBEi6G_B7iAkq4HpVk",
  "refresh_expires_at": "2026-11-29T10:14:37.362671939Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "31a37b26-ab67-47d5-8ea3-7e9ca20e17ec",
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
  "id": "7a2b7f8e-6be4-403d-9517-e188458e26ba",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:19:37.562076Z",
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
  "command_id": "82c296b3-3585-4f8f-b2fa-90b5c765be71",
  "quote_id": "7a2b7f8e-6be4-403d-9517-e188458e26ba",
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
  "correlation_id": "2114e7cb-3c9b-4d0f-93e4-70a6a9ad7969"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8c38ce82-e522-43c9-ad9f-e5e6af4faf24",
  "quote_id": "7a2b7f8e-6be4-403d-9517-e188458e26ba",
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
  "id": "d4bc272a-386f-4a8e-80bd-5a32d0532f68",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dc06af66-76cc-42a1-8aeb-2b20977f261f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:14:37.975287Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d4bc272a-386f-4a8e-80bd-5a32d0532f68/cancel` → **200**

```json
{
  "command_id": "93b46286-d5b0-4ff5-b3e4-36955c3b53a5",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d4bc272a-386f-4a8e-80bd-5a32d0532f68",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "dc06af66-76cc-42a1-8aeb-2b20977f261f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:14:37.975287Z",
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
  "command_id": "230eacee-ed35-4714-9506-45e4473a068c",
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
  "changed_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T10:14:38.389328Z"
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
      "changed_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T10:14:38.389328Z"
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
  "device_ref": "sandbox-24432"
}
```

```json
{
  "challenge_id": "bfdf9bfa-7f07-4b6f-80c1-21797c19568f",
  "expires_at": "2026-10-30T10:19:39.091948089Z",
  "resend_available_at": "2026-10-30T10:14:40.091948089Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "069525",
  "sent_at": "2026-10-30T10:14:39.093954931Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bfdf9bfa-7f07-4b6f-80c1-21797c19568f",
  "code": "069525",
  "device_ref": "sandbox-24432"
}
```

```json
{
  "session_id": "cf0316a9-5e4b-402f-b4da-4d5e7523b48b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NjE3OSwiaWF0IjoxNzkzMzU1Mjc5LCJqdGkiOiIwNzBmMzJmYy1iMjBkLTQ2NmQtOTRlMC1jYzkwZDU1ZjE4ZTkiLCJzaWQiOiJjZjAzMTZhOS01ZTRiLTQwMmYtYjRkYS00ZDVlNzUyM2I0OGIifQ.MHQWswJtbbrBeuxTJLHJ-lNvXuCVo5frGvj3bTeui6o",
  "access_expires_at": "2026-10-30T10:29:39.294656316Z",
  "refresh_token": "B_6qzbcNIpAyy25K8tfeSOSuj8WkZdXIrpevR1xv1C8",
  "refresh_expires_at": "2026-11-29T10:14:39.294283134Z",
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
  "command_id": "ee4efde7-eeb1-4e02-a7fd-579e1b2f6fc5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:14:39Z",
    "sequence": 1793355279720
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c8e55f1a-e881-4071-a513-ad7aef5a516b",
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
  "last_heartbeat_at": "2026-10-30T10:14:39.735497Z",
  "last_location_at": "2026-10-30T10:14:39.735497Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677477116",
  "device_ref": "sandbox-9515"
}
```

```json
{
  "challenge_id": "26390221-14cb-4b33-87a9-9a5d30c1e955",
  "expires_at": "2026-10-30T10:19:39.922552309Z",
  "resend_available_at": "2026-10-30T10:14:40.922552309Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677477116` → **200**

```json
{
  "phone": "+380677477116",
  "audience": "CLIENT",
  "code": "688908",
  "sent_at": "2026-10-30T10:14:39.924571971Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "26390221-14cb-4b33-87a9-9a5d30c1e955",
  "code": "688908",
  "device_ref": "sandbox-9515"
}
```

```json
{
  "session_id": "65848a3d-78af-4fb7-a35d-0809adce294f",
  "subject": {
    "type": "CLIENT",
    "id": "e01503bc-1a1b-4b89-aa8e-710e63e0dff9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDE1MDNiYy0xYTFiLTRiODktYWE4ZS03MTBlNjNlMGRmZjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2MTgwLCJpYXQiOjE3OTMzNTUyODAsImp0aSI6ImQ1N2FkYTMxLWI2MWYtNDlkMS04MzU1LWVlNTMyNzgxNTdlZiIsInNpZCI6IjY1ODQ4YTNkLTc4YWYtNGZiNy1hMzVkLTA4MDlhZGNlMjk0ZiJ9.gOL0xZ5YjCQQ_YiIAOYWOYQBblV5UXa4xq3yFzXdv3A",
  "access_expires_at": "2026-10-30T10:29:40.136999463Z",
  "refresh_token": "IZvREU9cZMCZKLokMrwsUAF5rYIDGjk9JxxbzYAXoCg",
  "refresh_expires_at": "2026-11-29T10:14:40.136666121Z",
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
  "command_id": "ad0d3bc7-28d5-4e20-b22a-67a5a593bd61",
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
  "id": "1d8e2f09-c193-4512-8e98-6bb44ae4208d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:19:40.507437Z",
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
  "command_id": "442ed42b-c5ee-4ccd-9ec2-8e8760c607ea",
  "platform": "ANDROID",
  "token": "sandbox-driver-a2d3cd7c-edaf-4cae-92b1-8c42134dc238"
}
```

```json
{
  "id": "b0d3251c-a0fd-4ef4-ab96-b85e6b23a01f",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T10:14:40.720058Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "958d2510-b6c5-4e4f-82c0-6449ec5f7e6d",
  "platform": "ANDROID",
  "token": "sandbox-rider-08f58f5a-ab71-44cf-a46f-b3a5cc3deaac"
}
```

```json
{
  "id": "aa461ea9-8799-431c-989d-c06d752f7aca",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T10:14:40.914523Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7598d5a8-5967-4d82-a2e3-085290b6e799",
  "quote_id": "1d8e2f09-c193-4512-8e98-6bb44ae4208d",
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
  "id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e01503bc-1a1b-4b89-aa8e-710e63e0dff9",
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
  "created_at": "2026-10-30T10:14:41.124002Z",
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
    "id": "25b69fb0-b98c-4aef-8b44-dd2a0f2d723e",
    "order_id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
    "expires_at": "2026-10-30T10:14:56.125766Z",
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

`POST /api/driver/v1/offers/25b69fb0-b98c-4aef-8b44-dd2a0f2d723e/accept` → **200**

```json
{
  "command_id": "68d54ba2-70a4-4d10-bf76-51d4aa3055f0"
}
```

```json
{
  "id": "3b32de2c-c2ad-4e27-bc55-2807c41fc500",
  "order_id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "01cb9384-2a6e-4082-825a-a35127eda334",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T10:14:41.104Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T10:14:41.104Z` → **200**

```json
[
  {
    "at": "2026-10-30T10:14:41.875765718Z",
    "token_suffix": "4dc238",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
      "order_version": "2",
      "event_id": "00891d98-ec88-4006-be83-d0fa434e3992",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380677477116&after=2026-10-30T10:14:41.104Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380677477116&after=2026-10-30T10:14:41.104Z` → **200**

```json
[
  {
    "at": "2026-10-30T10:14:42.879717405Z",
    "token_suffix": "3deaac",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
      "order_version": "3",
      "event_id": "a8d8008b-fd87-4d89-b85c-0f73f731ddeb",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/5be6305e-963d-4ca7-b595-cb96b86532e4/messages` → **201**

```json
{
  "command_id": "ef82399a-e032-474b-bb12-74b38c12ac3b",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "e01ef75d-c262-4d55-848c-6022fc67e80a",
  "order_id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T10:14:43.821284267Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "01cb9384-2a6e-4082-825a-a35127eda334",
  "order_id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
  "assignment_id": "3b32de2c-c2ad-4e27-bc55-2807c41fc500",
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

`POST /api/driver/v1/trips/01cb9384-2a6e-4082-825a-a35127eda334/messages` → **201**

```json
{
  "command_id": "b766b609-042d-462b-b373-5ce4abfddebe",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "e19a4d2d-c68d-432f-b5a7-7cf0ca241664",
  "order_id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T10:14:44.214456989Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/5be6305e-963d-4ca7-b595-cb96b86532e4/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/01cb9384-2a6e-4082-825a-a35127eda334/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380677477116"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/c8e55f1a-e881-4071-a513-ad7aef5a516b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:14:44Z",
    "sequence": 1793355284803
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c8e55f1a-e881-4071-a513-ad7aef5a516b",
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
  "last_heartbeat_at": "2026-10-30T10:14:44.818895Z",
  "last_location_at": "2026-10-30T10:14:44.818895Z",
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
  "id": "01cb9384-2a6e-4082-825a-a35127eda334",
  "order_id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
  "assignment_id": "3b32de2c-c2ad-4e27-bc55-2807c41fc500",
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

`POST /api/driver/v1/trips/01cb9384-2a6e-4082-825a-a35127eda334/arrive` → **200**

```json
{
  "command_id": "cc17bea6-42ef-42fc-be50-94012166fa7e",
  "expected_version": 0
}
```

```json
{
  "id": "01cb9384-2a6e-4082-825a-a35127eda334",
  "order_id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
  "assignment_id": "3b32de2c-c2ad-4e27-bc55-2807c41fc500",
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
  "arrived_at": "2026-10-30T10:14:45.198047Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/01cb9384-2a6e-4082-825a-a35127eda334/start` → **200**

```json
{
  "command_id": "e498ebd8-7712-4581-ad75-cac60e4c03d8",
  "expected_version": 1
}
```

```json
{
  "id": "01cb9384-2a6e-4082-825a-a35127eda334",
  "order_id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
  "assignment_id": "3b32de2c-c2ad-4e27-bc55-2807c41fc500",
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
  "arrived_at": "2026-10-30T10:14:45.198047Z",
  "started_at": "2026-10-30T10:14:45.389381Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/c8e55f1a-e881-4071-a513-ad7aef5a516b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:15:33Z",
    "sequence": 1793355333593
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c8e55f1a-e881-4071-a513-ad7aef5a516b",
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
  "last_heartbeat_at": "2026-10-30T10:15:33.609679Z",
  "last_location_at": "2026-10-30T10:15:33.609679Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/01cb9384-2a6e-4082-825a-a35127eda334/complete` → **200**

```json
{
  "command_id": "8b959d42-9c3f-470f-b8fa-0a9956dad546",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:15:33Z",
  "cash_received": true
}
```

```json
{
  "id": "01cb9384-2a6e-4082-825a-a35127eda334",
  "order_id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
  "assignment_id": "3b32de2c-c2ad-4e27-bc55-2807c41fc500",
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
  "arrived_at": "2026-10-30T10:14:45.198047Z",
  "started_at": "2026-10-30T10:14:45.389381Z",
  "completed_at": "2026-10-30T10:15:33.802867Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/5be6305e-963d-4ca7-b595-cb96b86532e4` → **200**

```json
{
  "id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e01503bc-1a1b-4b89-aa8e-710e63e0dff9",
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
    "id": "3b32de2c-c2ad-4e27-bc55-2807c41fc500",
    "order_id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "01cb9384-2a6e-4082-825a-a35127eda334",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:14:41.124002Z",
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
    "id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
    "short_number": 14,
    "status": "FULFILLED",
    "created_at": "2026-10-30T10:14:41.124002Z",
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
    "id": "01cb9384-2a6e-4082-825a-a35127eda334",
    "order_id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
    "order_short_number": 14,
    "created_at": "2026-10-30T10:14:41.521018Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "cfb46957-bd5b-4ac6-ac73-060e040fc97d",
    "order_id": "43f9e662-a75c-4473-b4b4-04139d284fff",
    "order_short_number": 9,
    "created_at": "2026-10-30T10:12:09.407123Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "a1bfde36-77c8-4678-ab27-313626716350",
    "order_id": "18a7dabe-2210-4669-9ed6-73fea5eab461",
    "order_short_number": 4,
    "created_at": "2026-10-30T10:10:42.288651Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "4916aa6e-f868-468f-a1fb-83e64c4f51b3",
    "order_id": "5ae57c5b-8540-4347-8dea-459ee117714d",
    "order_short_number": 2,
    "created_at": "2026-10-30T10:06:55.294417Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "c8bc91db-bc3d-434a-97b7-9881bd5eb9b2",
    "order_id": "5a47047a-a284-4789-a60e-ff9398ff1ef1",
    "order_short_number": 1,
    "created_at": "2026-10-30T10:06:48.706799Z",
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

`GET /api/rider/v1/orders/5be6305e-963d-4ca7-b595-cb96b86532e4/tip` → **200**

```json
{
  "order_id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
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
  "available_until": "2026-10-31T10:15:33.802867Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/5be6305e-963d-4ca7-b595-cb96b86532e4/tip` → **201**

```json
{
  "command_id": "02001718-0a29-4615-b40a-f6c31bff20c9",
  "amount_minor": 1100
}
```

```json
{
  "id": "23cf1a8d-bfff-4333-a58e-f5796350657e",
  "order_id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T10:15:38.255985Z"
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
  "session_id": "bcd032bd-cd38-4f52-bd12-9587963e6c24",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTYyMzgsImlhdCI6MTc5MzM1NTMzOCwianRpIjoiM2RjZjA0N2ItZjA0NS00MWExLWE0MmQtZDI2NmQwMDBiMDVjIiwic2lkIjoiYmNkMDMyYmQtY2QzOC00ZjUyLWJkMTItOTU4Nzk2M2U2YzI0In0.aR0-tpGxzCQj6G4rlh-KNMpph_9MF4UyyW_uVs7947s",
  "access_expires_at": "2026-10-30T10:30:38.646352879Z",
  "refresh_token": "7LcjVudZWFucukz9TJkrgSk808TrwdXsDghtU_4vrR0",
  "refresh_expires_at": "2026-10-30T22:15:38.645766557Z",
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
  "generated_at": "2026-10-30T10:15:38.834711818Z"
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
  "generated_at": "2026-10-30T10:15:39.030730994Z"
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
  "session_id": "874d8316-18c6-43f9-885b-c81eb42d45ff",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTYyMzksImlhdCI6MTc5MzM1NTMzOSwianRpIjoiMDYxOWUyYmItMzlkNy00OTk1LTgwOTktNGIzNDk0NTgxYmMyIiwic2lkIjoiODc0ZDgzMTYtMThjNi00M2Y5LTg4NWItYzgxZWI0MmQ0NWZmIn0.lVgeAOONkqMQUe7Rf2yvcx9y9gRk9hV4jqv6OdXLiqY",
  "access_expires_at": "2026-10-30T10:30:39.419751437Z",
  "refresh_token": "0xM9wnxP1dNveEgWerxmZoHC2OBSU2BNGpGIlr4ZFw8",
  "refresh_expires_at": "2026-10-30T22:15:39.419395722Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5be6305e-963d-4ca7-b595-cb96b86532e4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T10:14:41.124315Z",
      "actor": {
        "type": "CLIENT",
        "id": "e01503bc-1a1b-4b89-aa8e-710e63e0dff9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
        "quote_id": "1d8e2f09-c193-4512-8e98-6bb44ae4208d",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "b7c45efd-9b3e-4471-bae8-4b9c076ed5eb"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T10:14:41.12541Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
        "attempt_id": "d8fab96a-44e3-4142-bb66-a19d1ee45661",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b7c45efd-9b3e-4471-bae8-4b9c076ed5eb"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T10:14:41.126949Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "25b69fb0-b98c-4aef-8b44-dd2a0f2d723e",
        "order_id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "b7c45efd-9b3e-4471-bae8-4b9c076ed5eb"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T10:14:41.522044Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "25b69fb0-b98c-4aef-8b44-dd2a0f2d723e",
        "order_id": "5be6305e-963d-4ca7-b595-cb96b86532e4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "3b32de2c-c2ad-4e27-bc55-2807c41fc500"
      },
      "correlation_id": "8db069fc-285b-4ab9-bd49-dfe1ea2d5a7c"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T10:15:39.800756687Z",
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
      "last_location_at": "2026-10-30T10:15:33.609679Z",
      "order_id": null
    }
  ]
}
```

Done: order 5be6305e-963d-4ca7-b595-cb96b86532e4.

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
  "session_id": "bed31f66-4673-4958-bb2b-752793698d07",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTYyNDAsImlhdCI6MTc5MzM1NTM0MCwianRpIjoiZTY2YTEwMzItYTYwMS00MmQxLWJiYmUtMjVhZDhiNzEzZTY4Iiwic2lkIjoiYmVkMzFmNjYtNDY3My00OTU4LWJiMmItNzUyNzkzNjk4ZDA3In0.5wXBPgFC2eOd4TnQFvkumSLhI9wfdjEvJ8XXp3Ouf70",
  "access_expires_at": "2026-10-30T10:30:40.194799986Z",
  "refresh_token": "EfI6ynbUrhWRHvXKKR-C7R5N1c3ByXClJxppJXCLNQc",
  "refresh_expires_at": "2026-10-30T22:15:40.194408356Z",
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
  "command_id": "955e2bf4-e7da-4ee9-b20b-71eb6f859691",
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
  "timestamp": "2026-10-30T10:15:40.000+0000",
  "channel": {
    "id": "1730052000.839131617",
    "linkedid": "1730052000.839131617",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676990649"
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
  "timestamp": "2026-10-30T10:15:40.000+0000",
  "channel": {
    "id": "1730052000.839131617",
    "linkedid": "1730052000.839131617",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676990649"
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
  "session_id": "b78c8d69-92c1-480e-a834-a39df1d1a901",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTYyNDAsImlhdCI6MTc5MzM1NTM0MCwianRpIjoiYzk2YzBhZWYtZjkzOC00YTRmLTkwOWUtOTZjMWEyOTE0NmIxIiwic2lkIjoiYjc4YzhkNjktOTJjMS00ODBlLWE4MzQtYTM5ZGYxZDFhOTAxIn0.-InZzgxDdMJRnsQNoAXDJMjZXQJ0Cx98Fm_xhHJ6fkc",
  "access_expires_at": "2026-10-30T10:30:40.985706098Z",
  "refresh_token": "LnUsroOtFLr61kp8N27y1-Io99xK8yPU7ln5EugVojY",
  "refresh_expires_at": "2026-10-30T22:15:40.985318785Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "e8ddb11d-bbec-4d80-870f-e44b74c7727b",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676990649",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T10:15:40Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/e8ddb11d-bbec-4d80-870f-e44b74c7727b/answer` → **200**

```json
{
  "command_id": "ce626217-1b12-410f-96a4-895f74fd8efb"
}
```

```json
{
  "id": "e8ddb11d-bbec-4d80-870f-e44b74c7727b",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676990649",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "order_ids": [],
  "started_at": "2026-10-30T10:15:40Z",
  "answered_at": "2026-10-30T10:15:41.368369Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.839131617",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9b8694cb-bb99-47ef-81a2-b0057b7fa368",
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
  "id": "6329535f-1967-4721-9cea-6c4940271945",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:20:41.586191Z",
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
  "command_id": "e3abbf72-48e9-4c32-93c3-9c7e066f6dd7",
  "quote_id": "6329535f-1967-4721-9cea-6c4940271945",
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
    "phone": "+380676990649"
  },
  "call_id": "e8ddb11d-bbec-4d80-870f-e44b74c7727b"
}
```

```json
{
  "id": "c81e70a8-bb2f-4131-a7b7-297f233183c2",
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
  "created_at": "2026-10-30T10:15:41.788423Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676990649"
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
    "id": "1730052000.839131617",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "e8ddb11d-bbec-4d80-870f-e44b74c7727b",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676990649",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "order_ids": [
        "c81e70a8-bb2f-4131-a7b7-297f233183c2"
      ],
      "started_at": "2026-10-30T10:15:40Z",
      "answered_at": "2026-10-30T10:15:41.368369Z",
      "ended_at": "2026-10-30T10:15:42.004422Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "9d97db98-a464-48d6-b597-b80930034236",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676779906",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "order_ids": [],
      "started_at": "2026-10-30T10:10:30.587182Z",
      "answered_at": "2026-10-30T10:10:30.814683Z",
      "ended_at": "2026-10-30T10:10:31.041756Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T10:10:38.002015Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/c81e70a8-bb2f-4131-a7b7-297f233183c2` → **200**

```json
{
  "id": "c81e70a8-bb2f-4131-a7b7-297f233183c2",
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
  "created_at": "2026-10-30T10:15:41.788423Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676990649"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/c81e70a8-bb2f-4131-a7b7-297f233183c2` → **200**

```json
{
  "id": "c81e70a8-bb2f-4131-a7b7-297f233183c2",
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
  "created_at": "2026-10-30T10:15:41.788423Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676990649"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c81e70a8-bb2f-4131-a7b7-297f233183c2/cancel` → **200**

```json
{
  "command_id": "726fbf16-4797-42fa-ac94-a44428be980c",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "c81e70a8-bb2f-4131-a7b7-297f233183c2",
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
  "created_at": "2026-10-30T10:15:41.788423Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676990649"
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

Done: call e8ddb11d-bbec-4d80-870f-e44b74c7727b with order c81e70a8-bb2f-4131-a7b7-297f233183c2.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24290"
}
```

```json
{
  "challenge_id": "93415d3e-5446-474a-8b51-59970762f98c",
  "expires_at": "2026-10-30T10:20:42.825755357Z",
  "resend_available_at": "2026-10-30T10:15:43.825755357Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "164716",
  "sent_at": "2026-10-30T10:15:42.828483993Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "93415d3e-5446-474a-8b51-59970762f98c",
  "code": "164716",
  "device_ref": "sandbox-24290"
}
```

```json
{
  "session_id": "f258704f-3502-4de9-8943-f80f6606fc82",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NjI0MywiaWF0IjoxNzkzMzU1MzQzLCJqdGkiOiI4NzAwZjEwZC0yNDg4LTQwZmEtODRjNC00ZjQxYjAxZTBjZGMiLCJzaWQiOiJmMjU4NzA0Zi0zNTAyLTRkZTktODk0My1mODBmNjYwNmZjODIifQ.tq__k2AnRvqV1ghsU5-UpdPsGBMGk1P2Fho3TWdpcBw",
  "access_expires_at": "2026-10-30T10:30:43.037752212Z",
  "refresh_token": "5ZfzxvuBH0EcKyy5xA4XsglMkVyMXPzakA9m13Jjx64",
  "refresh_expires_at": "2026-11-29T10:15:43.03735639Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c8e55f1a-e881-4071-a513-ad7aef5a516b",
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
  "last_heartbeat_at": "2026-10-30T10:15:33.609679Z",
  "last_location_at": "2026-10-30T10:15:33.609679Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c8e55f1a-e881-4071-a513-ad7aef5a516b/handover` → **200**

```json
{
  "command_id": "689ed319-aa1a-4a98-91ff-6290c2a75c42",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c8e55f1a-e881-4071-a513-ad7aef5a516b",
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
  "last_heartbeat_at": "2026-10-30T10:15:33.609679Z",
  "last_location_at": "2026-10-30T10:15:33.609679Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 89 s to the next point)

`POST /api/driver/v1/work-sessions/c8e55f1a-e881-4071-a513-ad7aef5a516b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:17:12Z",
    "sequence": 1793355432651
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c8e55f1a-e881-4071-a513-ad7aef5a516b",
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
  "last_heartbeat_at": "2026-10-30T10:17:12.669132Z",
  "last_location_at": "2026-10-30T10:17:12.669132Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664609479",
  "device_ref": "sandbox-15285"
}
```

```json
{
  "challenge_id": "4a02e446-8127-4c9a-94d1-cb2c899e1739",
  "expires_at": "2026-10-30T10:22:12.864125066Z",
  "resend_available_at": "2026-10-30T10:17:13.864125066Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664609479` → **200**

```json
{
  "phone": "+380664609479",
  "audience": "CLIENT",
  "code": "289778",
  "sent_at": "2026-10-30T10:17:12.866141939Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4a02e446-8127-4c9a-94d1-cb2c899e1739",
  "code": "289778",
  "device_ref": "sandbox-15285"
}
```

```json
{
  "session_id": "edb24712-6905-4221-b842-8af386581e92",
  "subject": {
    "type": "CLIENT",
    "id": "91c77136-39da-4985-8034-6f385fb79f8b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWM3NzEzNi0zOWRhLTQ5ODUtODAzNC02ZjM4NWZiNzlmOGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2MzMzLCJpYXQiOjE3OTMzNTU0MzMsImp0aSI6ImM0NDllNTY1LWJiN2YtNDI4YS05MzNiLWFhY2I1MjYxMmJmMyIsInNpZCI6ImVkYjI0NzEyLTY5MDUtNDIyMS1iODQyLThhZjM4NjU4MWU5MiJ9.jhck3VZbTLasGCbf6HLiJ_H9hs5-jlKR3JKBfK7SQsQ",
  "access_expires_at": "2026-10-30T10:32:13.08834022Z",
  "refresh_token": "jpTwMukpN7g5mIfUY-lTzSsSsrDQV2Ng-oZDO1rXqTk",
  "refresh_expires_at": "2026-11-29T10:17:13.087889742Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9cdb0687-5194-43c8-a0a4-8a564013383a",
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
  "id": "9f4f9a8b-219b-4748-8df9-d4d45ed0ea11",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:22:13.287185Z",
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
  "command_id": "2eb2e116-b735-439f-8b41-a294680734d9",
  "quote_id": "9f4f9a8b-219b-4748-8df9-d4d45ed0ea11",
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
  "id": "93327e94-14be-447b-8fe5-804d9d7e5130",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "91c77136-39da-4985-8034-6f385fb79f8b",
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
  "created_at": "2026-10-30T10:17:13.498094Z",
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
    "id": "c10f9e7e-2beb-4d49-b233-fc5b6aa415b1",
    "order_id": "93327e94-14be-447b-8fe5-804d9d7e5130",
    "expires_at": "2026-10-30T10:17:28.500584Z",
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

`POST /api/driver/v1/offers/c10f9e7e-2beb-4d49-b233-fc5b6aa415b1/accept` → **200**

```json
{
  "command_id": "68368c24-62c6-488b-a057-5d5754bf4cdf"
}
```

```json
{
  "id": "984e9e7f-4c8c-4392-9a9f-91f8713a2e6e",
  "order_id": "93327e94-14be-447b-8fe5-804d9d7e5130",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a0a71db8-48d9-47cd-81f3-d07e2f4b4f34",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a0a71db8-48d9-47cd-81f3-d07e2f4b4f34",
  "order_id": "93327e94-14be-447b-8fe5-804d9d7e5130",
  "assignment_id": "984e9e7f-4c8c-4392-9a9f-91f8713a2e6e",
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

`POST /api/driver/v1/work-sessions/c8e55f1a-e881-4071-a513-ad7aef5a516b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:17:14Z",
    "sequence": 1793355434327
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c8e55f1a-e881-4071-a513-ad7aef5a516b",
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
  "last_heartbeat_at": "2026-10-30T10:17:14.342853Z",
  "last_location_at": "2026-10-30T10:17:14.342853Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a0a71db8-48d9-47cd-81f3-d07e2f4b4f34/arrive` → **200**

```json
{
  "command_id": "5b94c06f-44f7-431a-b9ca-ea1c4b534fb7",
  "expected_version": 0
}
```

```json
{
  "id": "a0a71db8-48d9-47cd-81f3-d07e2f4b4f34",
  "order_id": "93327e94-14be-447b-8fe5-804d9d7e5130",
  "assignment_id": "984e9e7f-4c8c-4392-9a9f-91f8713a2e6e",
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
  "arrived_at": "2026-10-30T10:17:14.551951Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a0a71db8-48d9-47cd-81f3-d07e2f4b4f34/start` → **200**

```json
{
  "command_id": "90cbbc9a-5723-4ee7-8976-21cd9b031a4b",
  "expected_version": 1
}
```

```json
{
  "id": "a0a71db8-48d9-47cd-81f3-d07e2f4b4f34",
  "order_id": "93327e94-14be-447b-8fe5-804d9d7e5130",
  "assignment_id": "984e9e7f-4c8c-4392-9a9f-91f8713a2e6e",
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
  "arrived_at": "2026-10-30T10:17:14.551951Z",
  "started_at": "2026-10-30T10:17:14.75628Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 60 s to the next point)

`POST /api/driver/v1/work-sessions/c8e55f1a-e881-4071-a513-ad7aef5a516b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:18:14Z",
    "sequence": 1793355494977
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c8e55f1a-e881-4071-a513-ad7aef5a516b",
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
  "last_heartbeat_at": "2026-10-30T10:18:14.992259Z",
  "last_location_at": "2026-10-30T10:18:14.992259Z",
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
  "device_ref": "sandbox-13638"
}
```

```json
{
  "challenge_id": "0a52f33d-0a0f-437f-ac45-ecedcbdeec8b",
  "expires_at": "2026-10-30T10:23:15.172290813Z",
  "resend_available_at": "2026-10-30T10:18:16.172290813Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "448814",
  "sent_at": "2026-10-30T10:18:15.174162569Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0a52f33d-0a0f-437f-ac45-ecedcbdeec8b",
  "code": "448814",
  "device_ref": "sandbox-13638"
}
```

```json
{
  "session_id": "1c3953c2-977e-4c0e-8381-2fa42f64a035",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NjM5NSwiaWF0IjoxNzkzMzU1NDk1LCJqdGkiOiI1MDg3MjgwNS05NjZmLTRkY2UtYmUzOC1kZDc3ZWIxODA5MzIiLCJzaWQiOiIxYzM5NTNjMi05NzdlLTRjMGUtODM4MS0yZmE0MmY2NGEwMzUifQ._4Behxz67fWuHizhi-GopXP29io5DLKAhq2kP-lyc04",
  "access_expires_at": "2026-10-30T10:33:15.384960774Z",
  "refresh_token": "MXoj0xba5CqQ6DeEcKJSeF5fyniuVI1CpP1sWdZFOgc",
  "refresh_expires_at": "2026-11-29T10:18:15.384590386Z",
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
  "command_id": "0f949b5d-68b0-4911-90f4-22007ca21418",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:18:15Z",
    "sequence": 1793355495773
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "16757f16-3321-4a60-b933-31f64f83e6b0",
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
  "last_heartbeat_at": "2026-10-30T10:18:15.787968Z",
  "last_location_at": "2026-10-30T10:18:15.787968Z",
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
  "session_id": "657e222a-924a-468a-a542-ce65fdbe5295",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTYzOTYsImlhdCI6MTc5MzM1NTQ5NiwianRpIjoiNWRjYTkzOTgtMTZiYy00NTM2LThmMjYtMzdjNzA4MjVhMzE1Iiwic2lkIjoiNjU3ZTIyMmEtOTI0YS00NjhhLWE1NDItY2U2NWZkYmU1Mjk1In0.sQ1OcPVce6t58PwtrHJlbZJYnbJC5OF-qR04lxRQkaI",
  "access_expires_at": "2026-10-30T10:33:16.187862154Z",
  "refresh_token": "VHs-szfngMJAZmFggzqendBYI2bwrFdRZUCWnrOJxwY",
  "refresh_expires_at": "2026-10-30T22:18:16.187549173Z",
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
  "session_id": "8b8958dd-1ab4-4c4b-bb31-3b087aec40b0",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTYzOTYsImlhdCI6MTc5MzM1NTQ5NiwianRpIjoiNDA0MzBlNWUtNDgyNS00YjM5LTliYWQtMGNhYjE2ZWVkZTE0Iiwic2lkIjoiOGI4OTU4ZGQtMWFiNC00YzRiLWJiMzEtM2IwODdhZWM0MGIwIn0.vfpwIxyz8oE2L4EDpIcptct1y8mJFlZmb-q8tkRR7KU",
  "access_expires_at": "2026-10-30T10:33:16.566609659Z",
  "refresh_token": "6vzx6gysDtO195OwU3nqM080qGa6NTUUZ0zxbmjDSXU",
  "refresh_expires_at": "2026-10-30T22:18:16.566293373Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/93327e94-14be-447b-8fe5-804d9d7e5130` → **200**

```json
{
  "id": "93327e94-14be-447b-8fe5-804d9d7e5130",
  "short_number": 16,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "91c77136-39da-4985-8034-6f385fb79f8b",
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
    "id": "984e9e7f-4c8c-4392-9a9f-91f8713a2e6e",
    "order_id": "93327e94-14be-447b-8fe5-804d9d7e5130",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "a0a71db8-48d9-47cd-81f3-d07e2f4b4f34",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T10:17:13.498094Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/93327e94-14be-447b-8fe5-804d9d7e5130/interrupt` → **200**

```json
{
  "command_id": "4d14bb8a-c418-4b0f-9883-03d7259d7932",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "93327e94-14be-447b-8fe5-804d9d7e5130",
    "short_number": 16,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "91c77136-39da-4985-8034-6f385fb79f8b",
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
      "id": "984e9e7f-4c8c-4392-9a9f-91f8713a2e6e",
      "order_id": "93327e94-14be-447b-8fe5-804d9d7e5130",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "a0a71db8-48d9-47cd-81f3-d07e2f4b4f34",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T10:17:13.498094Z",
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
    "id": "56592449-f941-4a29-9dd1-00afda391a6d",
    "short_number": 17,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "91c77136-39da-4985-8034-6f385fb79f8b",
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
    "id": "86f70fad-1f3e-4ee0-95dc-e38c643e4d85",
    "order_id": "56592449-f941-4a29-9dd1-00afda391a6d",
    "expires_at": "2026-10-30T10:18:31.957984Z",
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

`POST /api/driver/v1/offers/86f70fad-1f3e-4ee0-95dc-e38c643e4d85/accept` → **200**

```json
{
  "command_id": "585a66d0-3615-44bf-9454-2c0fcb05405a"
}
```

```json
{
  "id": "e12d5d97-a75c-4daa-a4ed-18e770403bb2",
  "order_id": "56592449-f941-4a29-9dd1-00afda391a6d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9443f0ed-a035-4e26-8a16-d5adfd7e2a15",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9443f0ed-a035-4e26-8a16-d5adfd7e2a15",
  "order_id": "56592449-f941-4a29-9dd1-00afda391a6d",
  "assignment_id": "e12d5d97-a75c-4daa-a4ed-18e770403bb2",
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
  "session_id": "16757f16-3321-4a60-b933-31f64f83e6b0",
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
  "last_heartbeat_at": "2026-10-30T10:18:15.787968Z",
  "last_location_at": "2026-10-30T10:18:15.787968Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/16757f16-3321-4a60-b933-31f64f83e6b0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:18:17Z",
    "sequence": 1793355497909
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "16757f16-3321-4a60-b933-31f64f83e6b0",
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
  "last_heartbeat_at": "2026-10-30T10:18:17.924503Z",
  "last_location_at": "2026-10-30T10:18:17.924503Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/9443f0ed-a035-4e26-8a16-d5adfd7e2a15/arrive` → **200**

```json
{
  "command_id": "2bf4b6f9-a367-4631-8cc0-a82539926103",
  "expected_version": 0
}
```

```json
{
  "id": "9443f0ed-a035-4e26-8a16-d5adfd7e2a15",
  "order_id": "56592449-f941-4a29-9dd1-00afda391a6d",
  "assignment_id": "e12d5d97-a75c-4daa-a4ed-18e770403bb2",
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
  "arrived_at": "2026-10-30T10:18:18.113221Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9443f0ed-a035-4e26-8a16-d5adfd7e2a15/start` → **200**

```json
{
  "command_id": "e23bc045-00a1-4593-81de-2bb538e21610",
  "expected_version": 1
}
```

```json
{
  "id": "9443f0ed-a035-4e26-8a16-d5adfd7e2a15",
  "order_id": "56592449-f941-4a29-9dd1-00afda391a6d",
  "assignment_id": "e12d5d97-a75c-4daa-a4ed-18e770403bb2",
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
  "arrived_at": "2026-10-30T10:18:18.113221Z",
  "started_at": "2026-10-30T10:18:18.305187Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9443f0ed-a035-4e26-8a16-d5adfd7e2a15/complete` → **200**

```json
{
  "command_id": "7b5a1103-b9b5-44fc-b41a-b052d7e67937",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:18:18Z"
}
```

```json
{
  "id": "9443f0ed-a035-4e26-8a16-d5adfd7e2a15",
  "order_id": "56592449-f941-4a29-9dd1-00afda391a6d",
  "assignment_id": "e12d5d97-a75c-4daa-a4ed-18e770403bb2",
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
  "arrived_at": "2026-10-30T10:18:18.113221Z",
  "started_at": "2026-10-30T10:18:18.305187Z",
  "completed_at": "2026-10-30T10:18:18.502191Z",
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
    "id": "56592449-f941-4a29-9dd1-00afda391a6d",
    "short_number": 17,
    "status": "FULFILLED",
    "created_at": "2026-10-30T10:18:16.951294Z",
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
    "id": "93327e94-14be-447b-8fe5-804d9d7e5130",
    "short_number": 16,
    "status": "CANCELLED",
    "created_at": "2026-10-30T10:17:13.498094Z",
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

`GET /api/operator/v1/orders/93327e94-14be-447b-8fe5-804d9d7e5130/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T10:17:13.498647Z",
      "actor": {
        "type": "CLIENT",
        "id": "91c77136-39da-4985-8034-6f385fb79f8b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "93327e94-14be-447b-8fe5-804d9d7e5130",
        "quote_id": "9f4f9a8b-219b-4748-8df9-d4d45ed0ea11",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "5d76072c-27e6-4c96-bfd5-ba0022cf2301"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T10:17:13.500102Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "93327e94-14be-447b-8fe5-804d9d7e5130",
        "attempt_id": "009f6295-f0c1-47e9-b80a-7f54f8732530",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5d76072c-27e6-4c96-bfd5-ba0022cf2301"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T10:17:13.501952Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c10f9e7e-2beb-4d49-b233-fc5b6aa415b1",
        "order_id": "93327e94-14be-447b-8fe5-804d9d7e5130",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "5d76072c-27e6-4c96-bfd5-ba0022cf2301"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T10:17:13.930136Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "c10f9e7e-2beb-4d49-b233-fc5b6aa415b1",
        "order_id": "93327e94-14be-447b-8fe5-804d9d7e5130",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "984e9e7f-4c8c-4392-9a9f-91f8713a2e6e"
      },
      "correlation_id": "78945742-737a-44f8-b125-dc3239a6aeb9"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/56592449-f941-4a29-9dd1-00afda391a6d/tip` → **200**

```json
{
  "order_id": "56592449-f941-4a29-9dd1-00afda391a6d",
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
  "available_until": "2026-10-31T10:18:18.502191Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/56592449-f941-4a29-9dd1-00afda391a6d/tip` → **409**

```json
{
  "command_id": "ed6d85a4-b64b-4736-a18c-7d50bdab8f37",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/56592449-f941-4a29-9dd1-00afda391a6d/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f3bdd50f-3482-459e-8ee7-55af43df6d69"
}
```

Done: interrupted 93327e94-14be-447b-8fe5-804d9d7e5130, follow-up 56592449-f941-4a29-9dd1-00afda391a6d.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c8e55f1a-e881-4071-a513-ad7aef5a516b",
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
  "last_heartbeat_at": "2026-10-30T10:18:14.992259Z",
  "last_location_at": "2026-10-30T10:18:14.992259Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c8e55f1a-e881-4071-a513-ad7aef5a516b/close` → **200**

```json
{
  "command_id": "ea4ebbcd-e956-48c9-ac86-56584cb5238a",
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
  "session_id": "16757f16-3321-4a60-b933-31f64f83e6b0",
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
  "last_heartbeat_at": "2026-10-30T10:18:17.924503Z",
  "last_location_at": "2026-10-30T10:18:17.924503Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/16757f16-3321-4a60-b933-31f64f83e6b0/close` → **200**

```json
{
  "command_id": "5d30ea6c-35ca-4381-b032-ed7871f7cd45",
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
  "session_id": "5546fa27-ffac-4f09-9a8a-170b0d9366a0",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTY0MDMsImlhdCI6MTc5MzM1NTUwMywianRpIjoiMTA5NmQ5YTMtMTIxZC00ZTUyLWE5ZTMtOThkZGFkOGI1OTZmIiwic2lkIjoiNTU0NmZhMjctZmZhYy00ZjA5LTlhOGEtMTcwYjBkOTM2NmEwIn0.yp04C838NE1rjRiImpl_wbIdJuDwhrCXaYQrAFiC93Y",
  "access_expires_at": "2026-10-30T10:33:23.701222892Z",
  "refresh_token": "ksuw62nGr558gDfx9CrzXCJCC8IL6cCWg2CWVA0FChA",
  "refresh_expires_at": "2026-10-30T22:18:23.700901688Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "186e384f-02ac-4fec-88da-153bcb4d47cf",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T10:18:23Z"
}
```

```json
{
  "id": "7e6ac84f-6a41-4ad0-a0bb-0f92729a0d07",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T10:18:23Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/7e6ac84f-6a41-4ad0-a0bb-0f92729a0d07/publish` → **200**

```json
{
  "command_id": "2a8ae1d7-76bf-4880-a827-227545af9850",
  "expected_version": 0
}
```

```json
{
  "id": "7e6ac84f-6a41-4ad0-a0bb-0f92729a0d07",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T10:18:24.104483Z",
  "published_at": "2026-10-30T10:18:24.104483Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "7e6ac84f-6a41-4ad0-a0bb-0f92729a0d07",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T10:18:24.104483Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637068925",
  "device_ref": "sandbox-8791"
}
```

```json
{
  "challenge_id": "e54111b5-a6d8-49ed-abc5-39cb94f4d6d4",
  "expires_at": "2026-10-30T10:23:24.487849265Z",
  "resend_available_at": "2026-10-30T10:18:25.487849265Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637068925` → **200**

```json
{
  "phone": "+380637068925",
  "audience": "CLIENT",
  "code": "987285",
  "sent_at": "2026-10-30T10:18:24.489809515Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e54111b5-a6d8-49ed-abc5-39cb94f4d6d4",
  "code": "987285",
  "device_ref": "sandbox-8791"
}
```

```json
{
  "session_id": "21071fb1-a6c7-4f73-8860-dc8b85cd0d99",
  "subject": {
    "type": "CLIENT",
    "id": "b6561b17-45d4-4f7c-b9d5-214692c9fd02"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNjU2MWIxNy00NWQ0LTRmN2MtYjlkNS0yMTQ2OTJjOWZkMDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2NDA0LCJpYXQiOjE3OTMzNTU1MDQsImp0aSI6IjU5Y2VlZjhjLWNkYmEtNDFmOS05MWQxLWNkZDIxODFkNDY3MSIsInNpZCI6IjIxMDcxZmIxLWE2YzctNGY3My04ODYwLWRjOGI4NWNkMGQ5OSJ9.qrETf9x4W11c-gb8nhHF4XFr1-5tOo_gMAoYQzUf-zc",
  "access_expires_at": "2026-10-30T10:33:24.706285718Z",
  "refresh_token": "2tLDkyAvYeP275khTVO1vQbDmcvJHeQl23wJ39-xbX4",
  "refresh_expires_at": "2026-11-29T10:18:24.705896326Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "7e6ac84f-6a41-4ad0-a0bb-0f92729a0d07",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T10:18:24.104483Z",
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
  "command_id": "8ac6d1c4-3c64-4d1f-a666-32b1c0ce2547",
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
  "id": "ef1a6362-1648-4566-8004-c9d880538b9b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:23:25.094257Z",
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
  "command_id": "aa45cec5-c4a2-43be-8b66-20b7b6d4785c",
  "quote_id": "ef1a6362-1648-4566-8004-c9d880538b9b",
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
  "correlation_id": "5eb45092-85bd-429f-9fb0-fa1380e6e267"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "740e7bee-c618-4493-8106-44101ec4fc27",
  "version_id": "7e6ac84f-6a41-4ad0-a0bb-0f92729a0d07",
  "language": "uk"
}
```

```json
{
  "version_id": "7e6ac84f-6a41-4ad0-a0bb-0f92729a0d07",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T10:18:25.494872Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5391ce94-ebbb-427d-baa8-1a8a5a18f63b",
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
  "id": "be501524-d545-4713-b76f-a32abaaf32ea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:23:25.691035Z",
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
  "command_id": "acc35bf4-afea-44f5-9bb6-366414638516",
  "quote_id": "be501524-d545-4713-b76f-a32abaaf32ea",
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
  "id": "f56c3bad-cb45-48c0-9579-286c6d16374a",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b6561b17-45d4-4f7c-b9d5-214692c9fd02",
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
  "created_at": "2026-10-30T10:18:25.888875Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f56c3bad-cb45-48c0-9579-286c6d16374a` → **200**

```json
{
  "id": "f56c3bad-cb45-48c0-9579-286c6d16374a",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b6561b17-45d4-4f7c-b9d5-214692c9fd02",
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
  "created_at": "2026-10-30T10:18:25.888875Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f56c3bad-cb45-48c0-9579-286c6d16374a/cancel` → **200**

```json
{
  "command_id": "d48e1330-a413-407e-b203-439a8eb92b73",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f56c3bad-cb45-48c0-9579-286c6d16374a",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b6561b17-45d4-4f7c-b9d5-214692c9fd02",
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
  "created_at": "2026-10-30T10:18:25.888875Z",
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

`POST /api/admin/v1/legal-documents/7e6ac84f-6a41-4ad0-a0bb-0f92729a0d07` → **409**

```json
{
  "command_id": "6f7f269b-4f27-45dd-b6b6-cd3421dfa368",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T10:18:26Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/7e6ac84f-6a41-4ad0-a0bb-0f92729a0d07",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2b402319-dc2f-4cd0-a456-b29507036c95"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "facce31e-cdc0-4fe6-bd17-d37ec87df70f",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T10:18:26Z"
}
```

```json
{
  "id": "bf1ade04-8d7d-49f6-ac38-48e88569cfaa",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T10:18:26Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/bf1ade04-8d7d-49f6-ac38-48e88569cfaa/publish` → **200**

```json
{
  "command_id": "66a0011c-d6ef-418b-aa89-e62ca2d0ed74",
  "expected_version": 0
}
```

```json
{
  "id": "bf1ade04-8d7d-49f6-ac38-48e88569cfaa",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T10:18:26.923315Z",
  "published_at": "2026-10-30T10:18:26.923315Z",
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
  "device_ref": "sandbox-5750"
}
```

```json
{
  "challenge_id": "e4bbde9a-0ece-4336-b54e-4b68aba58c5e",
  "expires_at": "2026-10-30T10:23:27.117501198Z",
  "resend_available_at": "2026-10-30T10:18:28.117501198Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "630539",
  "sent_at": "2026-10-30T10:18:27.119435981Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e4bbde9a-0ece-4336-b54e-4b68aba58c5e",
  "code": "630539",
  "device_ref": "sandbox-5750"
}
```

```json
{
  "session_id": "8b45f86a-722b-4809-84a5-3761ff9f204a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NjQwNywiaWF0IjoxNzkzMzU1NTA3LCJqdGkiOiJhYTk2NTg3My1kMzM4LTQ3NWYtYTUzNy04MTg5ZjJhNTdlYjkiLCJzaWQiOiI4YjQ1Zjg2YS03MjJiLTQ4MDktODRhNS0zNzYxZmY5ZjIwNGEifQ.qdkmBV1d0jZ5wHChnbmKiHn69brlrjVsAOT-uqdW3Gs",
  "access_expires_at": "2026-10-30T10:33:27.327728167Z",
  "refresh_token": "o4R4n00Ev3OWPn22btQuDzXOm-2sarJd-9d9ZJnC5Xg",
  "refresh_expires_at": "2026-11-29T10:18:27.327077333Z",
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

(the car drives 74 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "42934de7-550a-4d52-9cc3-03a4fa8d2838",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:19:41Z",
    "sequence": 1793355581719
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0faef648-5275-4e49-82a1-13eeb1ab5ee2",
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
  "last_heartbeat_at": "2026-10-30T10:19:41.734976Z",
  "last_location_at": "2026-10-30T10:19:41.734976Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679244879",
  "device_ref": "sandbox-21073"
}
```

```json
{
  "challenge_id": "23d68958-369a-42af-93a7-701c1cfff726",
  "expires_at": "2026-10-30T10:24:41.934703826Z",
  "resend_available_at": "2026-10-30T10:19:42.934703826Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679244879` → **200**

```json
{
  "phone": "+380679244879",
  "audience": "CLIENT",
  "code": "629519",
  "sent_at": "2026-10-30T10:19:41.93678534Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "23d68958-369a-42af-93a7-701c1cfff726",
  "code": "629519",
  "device_ref": "sandbox-21073"
}
```

```json
{
  "session_id": "8df36d76-3703-44fa-9954-d61db813525d",
  "subject": {
    "type": "CLIENT",
    "id": "4facccaa-6683-47ff-8539-be5aab7c83fb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZmFjY2NhYS02NjgzLTQ3ZmYtODUzOS1iZTVhYWI3YzgzZmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2NDgyLCJpYXQiOjE3OTMzNTU1ODIsImp0aSI6IjU3MzAxMDViLTc1MGMtNGU4ZS05NzMzLTVmMTU4YTZiOGVmMyIsInNpZCI6IjhkZjM2ZDc2LTM3MDMtNDRmYS05OTU0LWQ2MWRiODEzNTI1ZCJ9.AaP1RUyDnhVL4G94OZMgQjHKFEq5KmSize52A903Wpo",
  "access_expires_at": "2026-10-30T10:34:42.1446632Z",
  "refresh_token": "sbaPHEP9GEPKWsNUon_77nhB-qsYoj6NgvtwouU4Oww",
  "refresh_expires_at": "2026-11-29T10:19:42.144343449Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "86175640-9bcb-4152-a3b2-eea85959a18e",
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
  "id": "0c34eaa7-df7b-430e-bd54-ef39ea498647",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:24:42.337811Z",
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
  "command_id": "69304b59-d4e4-46fe-b417-9df48409c15e",
  "quote_id": "0c34eaa7-df7b-430e-bd54-ef39ea498647",
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
    "phone": "+380674612576"
  }
}
```

```json
{
  "id": "d1065c59-5590-47ec-87a2-a537f22696be",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4facccaa-6683-47ff-8539-be5aab7c83fb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:19:42.531233Z",
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
    "id": "0146b882-d36a-49fd-acac-d25143d4034c",
    "order_id": "d1065c59-5590-47ec-87a2-a537f22696be",
    "expires_at": "2026-10-30T10:19:57.53405Z",
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

`POST /api/driver/v1/offers/0146b882-d36a-49fd-acac-d25143d4034c/accept` → **200**

```json
{
  "command_id": "22f5a61d-ffa4-48a9-8b0b-4446057e349e"
}
```

```json
{
  "id": "857c2a92-5235-42b0-8819-4d8f2afe7171",
  "order_id": "d1065c59-5590-47ec-87a2-a537f22696be",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a78ff2ed-888b-4eab-a74c-ead25d2b0124",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a78ff2ed-888b-4eab-a74c-ead25d2b0124",
  "order_id": "d1065c59-5590-47ec-87a2-a537f22696be",
  "assignment_id": "857c2a92-5235-42b0-8819-4d8f2afe7171",
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
    "phone": "+380674612576"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f9ac174a-93a9-4684-947e-78dfa91fa804",
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
  "id": "159b0257-2baf-4173-bd83-6dc8a8d00c1a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:24:43.300420Z",
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
  "command_id": "13fed676-f6af-481e-a786-6a17a82be453",
  "quote_id": "159b0257-2baf-4173-bd83-6dc8a8d00c1a",
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
  "id": "6fb3ca2c-d148-4e98-9736-0cffa670b842",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4facccaa-6683-47ff-8539-be5aab7c83fb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:19:43.493229Z",
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
  "command_id": "2c681c35-4e86-4b4f-abb1-b0a2dac72290",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T13:19:43Z"
}
```

```json
{
  "id": "52b620e8-3744-4f2f-ba46-37d45faa7c85",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:24:43.700441Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T13:19:43Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "16d50d2a-c788-4939-872d-a5ad797f31f3",
  "quote_id": "52b620e8-3744-4f2f-ba46-37d45faa7c85",
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
  "pickup_at": "2026-10-30T13:19:43Z"
}
```

```json
{
  "id": "2aa3ba94-6364-4351-9093-f31bc0197b2f",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4facccaa-6683-47ff-8539-be5aab7c83fb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T10:19:43.899187Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T13:19:43Z",
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
  "command_id": "b2c5a10c-321e-4c34-8eb5-8e4bb629beac",
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
  "id": "08f83c76-94d4-46f4-902a-a91cf1445c96",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:24:44.102549Z",
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
  "command_id": "61a342ff-a900-4dad-8445-d6ad9cab9c0b",
  "quote_id": "08f83c76-94d4-46f4-902a-a91cf1445c96",
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
  "correlation_id": "38e86241-2bd4-43df-b89a-0fe58ae1a8f4"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "2aa3ba94-6364-4351-9093-f31bc0197b2f",
      "short_number": 21,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "4facccaa-6683-47ff-8539-be5aab7c83fb",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T10:19:43.899187Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T13:19:43Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "6fb3ca2c-d148-4e98-9736-0cffa670b842",
      "short_number": 20,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "4facccaa-6683-47ff-8539-be5aab7c83fb",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T10:19:43.493229Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "d1065c59-5590-47ec-87a2-a537f22696be",
      "short_number": 19,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "6fb3ca2c-d148-4e98-9736-0cffa670b842",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4facccaa-6683-47ff-8539-be5aab7c83fb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:19:43.493229Z",
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

`GET /api/rider/v1/orders/d1065c59-5590-47ec-87a2-a537f22696be` → **200**

```json
{
  "id": "d1065c59-5590-47ec-87a2-a537f22696be",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4facccaa-6683-47ff-8539-be5aab7c83fb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "857c2a92-5235-42b0-8819-4d8f2afe7171",
    "order_id": "d1065c59-5590-47ec-87a2-a537f22696be",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "a78ff2ed-888b-4eab-a74c-ead25d2b0124",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T10:19:42.531233Z",
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
    "location_at": "2026-10-30T10:19:41.734976Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/d1065c59-5590-47ec-87a2-a537f22696be/cancel` → **200**

```json
{
  "command_id": "8f895d6a-7435-4cf0-b4af-144665d40a87",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d1065c59-5590-47ec-87a2-a537f22696be",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "4facccaa-6683-47ff-8539-be5aab7c83fb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "857c2a92-5235-42b0-8819-4d8f2afe7171",
    "order_id": "d1065c59-5590-47ec-87a2-a537f22696be",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "a78ff2ed-888b-4eab-a74c-ead25d2b0124",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T10:19:42.531233Z",
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

`GET /api/rider/v1/orders/6fb3ca2c-d148-4e98-9736-0cffa670b842` → **200**

```json
{
  "id": "6fb3ca2c-d148-4e98-9736-0cffa670b842",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4facccaa-6683-47ff-8539-be5aab7c83fb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:19:43.493229Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/6fb3ca2c-d148-4e98-9736-0cffa670b842/cancel` → **200**

```json
{
  "command_id": "d1e1a4c8-db60-4af9-a0db-996844684b69",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6fb3ca2c-d148-4e98-9736-0cffa670b842",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4facccaa-6683-47ff-8539-be5aab7c83fb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:19:43.493229Z",
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

`GET /api/rider/v1/orders/2aa3ba94-6364-4351-9093-f31bc0197b2f` → **200**

```json
{
  "id": "2aa3ba94-6364-4351-9093-f31bc0197b2f",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4facccaa-6683-47ff-8539-be5aab7c83fb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T10:19:43.899187Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T13:19:43Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2aa3ba94-6364-4351-9093-f31bc0197b2f/cancel` → **200**

```json
{
  "command_id": "4044a6bd-a798-471e-b3b2-7fda46a321e3",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2aa3ba94-6364-4351-9093-f31bc0197b2f",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "4facccaa-6683-47ff-8539-be5aab7c83fb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T10:19:43.899187Z",
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
  "pickup_at": "2026-10-30T13:19:43Z",
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
  "session_id": "0faef648-5275-4e49-82a1-13eeb1ab5ee2",
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
  "last_heartbeat_at": "2026-10-30T10:19:41.734976Z",
  "last_location_at": "2026-10-30T10:19:41.734976Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0faef648-5275-4e49-82a1-13eeb1ab5ee2/close` → **200**

```json
{
  "command_id": "35d113dd-bee8-4396-86e1-d6a341fb8d01",
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

Done: orders d1065c59-5590-47ec-87a2-a537f22696be, 6fb3ca2c-d148-4e98-9736-0cffa670b842, 2aa3ba94-6364-4351-9093-f31bc0197b2f.

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
  "session_id": "bf978e24-e834-4bb1-b63d-6da143a6e282",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTY0ODYsImlhdCI6MTc5MzM1NTU4NiwianRpIjoiYjQ5MzVhZGQtYzg5Yi00MjliLTllNDctMTZkNmVlOWJmZTBiIiwic2lkIjoiYmY5NzhlMjQtZTgzNC00YmIxLWI2M2QtNmRhMTQzYTZlMjgyIn0.TN8ckWaalRyBIuWZoFGAc4MJZoAdz-pRQpVqdtRuTPc",
  "access_expires_at": "2026-10-30T10:34:46.663717543Z",
  "refresh_token": "KDrfcEQbqPzmlsoEdSPJysXebvin4VSt_5gKGfkGNvw",
  "refresh_expires_at": "2026-10-30T22:19:46.663364025Z",
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
  "session_id": "636783a4-688c-4417-bbbe-a3fd0acaa578",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTY0ODcsImlhdCI6MTc5MzM1NTU4NywianRpIjoiZGY3ZWM0NmQtMDhmMS00ZjIyLTg4MWYtZmQ0MmJkMDg0OTljIiwic2lkIjoiNjM2NzgzYTQtNjg4Yy00NDE3LWJiYmUtYTNmZDBhY2FhNTc4In0.JGEZzMP-Nc08-atzA2xm8YvQTE9_PIomsneDbPFDDn0",
  "access_expires_at": "2026-10-30T10:34:47.058024917Z",
  "refresh_token": "1E4T_fEUv8WyNDV9x3JiibFhVILnNzmmHw_OTRi38yM",
  "refresh_expires_at": "2026-10-30T22:19:47.057702872Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-13491"
}
```

```json
{
  "challenge_id": "bad8f4a7-0f4d-4d53-8c73-b5117148352b",
  "expires_at": "2026-10-30T10:24:47.235439028Z",
  "resend_available_at": "2026-10-30T10:19:48.235439028Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "605971",
  "sent_at": "2026-10-30T10:19:47.237379815Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bad8f4a7-0f4d-4d53-8c73-b5117148352b",
  "code": "605971",
  "device_ref": "sandbox-13491"
}
```

```json
{
  "session_id": "435e569a-7c00-4037-9665-91184302ce28",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NjQ4NywiaWF0IjoxNzkzMzU1NTg3LCJqdGkiOiIzNDQ1MjhhMi0wMWQwLTRhNGItYmE5Zi01OGNmNWZkMjJmY2MiLCJzaWQiOiI0MzVlNTY5YS03YzAwLTQwMzctOTY2NS05MTE4NDMwMmNlMjgifQ.WoblJW90SVYP1xn2wvkJ3gA9aghMc-mOBX4D2oJxiEE",
  "access_expires_at": "2026-10-30T10:34:47.440913395Z",
  "refresh_token": "oDD_zyZAcTLshvTp-3kItGFstrG_A4qaIzDhodB8eRM",
  "refresh_expires_at": "2026-11-29T10:19:47.440567534Z",
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
  "command_id": "9ed819e1-52f1-4476-bc7b-d80fc88107aa",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:19:47Z",
    "sequence": 1793355587818
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "71d0133d-5d52-4ade-8626-120c302ca678",
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
  "last_heartbeat_at": "2026-10-30T10:19:47.83353Z",
  "last_location_at": "2026-10-30T10:19:47.83353Z",
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
  "command_id": "383debad-0601-46e9-ab46-b79e2a00bc31",
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
  "effective_at": "2026-10-30T10:19:48.218038Z",
  "changed_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T10:10:46.585302Z",
  "last_entries": [
    {
      "order_id": "18a7dabe-2210-4669-9ed6-73fea5eab461",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T10:10:46.585302Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "04fba528-726c-4003-bd1c-59485b5522ce",
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
  "id": "1fe904cb-fbb7-417c-bbf1-5957b7738bfa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:24:48.605695Z",
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
  "command_id": "36c569a6-f795-4a52-b661-7ea0442749ac",
  "quote_id": "1fe904cb-fbb7-417c-bbf1-5957b7738bfa",
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
    "phone": "+3806711120939"
  }
}
```

```json
{
  "id": "bac942f8-76ac-4b0a-99ce-6da60e536870",
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
  "created_at": "2026-10-30T10:19:48.800249Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711120939"
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
    "id": "3a2611b3-1418-42f3-bf19-5dd693f4f51f",
    "order_id": "bac942f8-76ac-4b0a-99ce-6da60e536870",
    "expires_at": "2026-10-30T10:20:03.802665Z",
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

`POST /api/driver/v1/offers/3a2611b3-1418-42f3-bf19-5dd693f4f51f/accept` → **200**

```json
{
  "command_id": "a718dbff-568e-475c-815f-c2c64cc246ee"
}
```

```json
{
  "id": "f882fc8c-c50a-4733-8fdf-39158529ab04",
  "order_id": "bac942f8-76ac-4b0a-99ce-6da60e536870",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8c2b738d-f7f9-4d1e-a9eb-7ceb5dc641ca",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8c2b738d-f7f9-4d1e-a9eb-7ceb5dc641ca",
  "order_id": "bac942f8-76ac-4b0a-99ce-6da60e536870",
  "assignment_id": "f882fc8c-c50a-4733-8fdf-39158529ab04",
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
    "phone": "+3806711120939"
  }
}
```

`POST /api/driver/v1/work-sessions/71d0133d-5d52-4ade-8626-120c302ca678/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:19:49Z",
    "sequence": 1793355589565
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "71d0133d-5d52-4ade-8626-120c302ca678",
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
  "last_heartbeat_at": "2026-10-30T10:19:49.579211Z",
  "last_location_at": "2026-10-30T10:19:49.579211Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/8c2b738d-f7f9-4d1e-a9eb-7ceb5dc641ca/arrive` → **200**

```json
{
  "command_id": "520c8cf9-38c8-42f1-91e3-e509975c6a08",
  "expected_version": 0
}
```

```json
{
  "id": "8c2b738d-f7f9-4d1e-a9eb-7ceb5dc641ca",
  "order_id": "bac942f8-76ac-4b0a-99ce-6da60e536870",
  "assignment_id": "f882fc8c-c50a-4733-8fdf-39158529ab04",
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
  "arrived_at": "2026-10-30T10:19:49.764753Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711120939"
  }
}
```

`POST /api/driver/v1/trips/8c2b738d-f7f9-4d1e-a9eb-7ceb5dc641ca/start` → **200**

```json
{
  "command_id": "16081f94-616c-4632-8c81-4569d64c7d33",
  "expected_version": 1
}
```

```json
{
  "id": "8c2b738d-f7f9-4d1e-a9eb-7ceb5dc641ca",
  "order_id": "bac942f8-76ac-4b0a-99ce-6da60e536870",
  "assignment_id": "f882fc8c-c50a-4733-8fdf-39158529ab04",
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
  "arrived_at": "2026-10-30T10:19:49.764753Z",
  "started_at": "2026-10-30T10:19:49.956175Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711120939"
  }
}
```

`POST /api/driver/v1/trips/8c2b738d-f7f9-4d1e-a9eb-7ceb5dc641ca/complete` → **200**

```json
{
  "command_id": "616713ac-e347-4c54-bb50-1cf347c8e7b2",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:19:50Z",
  "cash_received": true
}
```

```json
{
  "id": "8c2b738d-f7f9-4d1e-a9eb-7ceb5dc641ca",
  "order_id": "bac942f8-76ac-4b0a-99ce-6da60e536870",
  "assignment_id": "f882fc8c-c50a-4733-8fdf-39158529ab04",
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
  "arrived_at": "2026-10-30T10:19:49.764753Z",
  "started_at": "2026-10-30T10:19:49.956175Z",
  "completed_at": "2026-10-30T10:19:50.151451Z",
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
  "command_id": "875cdd0b-b172-437e-a498-536742786d85",
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
  "id": "71d11c40-998e-4089-8afa-a489bea2ab2f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:24:50.346411Z",
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
  "command_id": "afb614e7-68fe-4b5f-8561-72cae93f974f",
  "quote_id": "71d11c40-998e-4089-8afa-a489bea2ab2f",
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
    "phone": "+380671119835"
  }
}
```

```json
{
  "id": "1485c7ec-5b28-4246-a12f-652e9d03fe92",
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
  "created_at": "2026-10-30T10:19:50.549288Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671119835"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/1485c7ec-5b28-4246-a12f-652e9d03fe92` → **200**

```json
{
  "id": "1485c7ec-5b28-4246-a12f-652e9d03fe92",
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
  "created_at": "2026-10-30T10:19:50.549288Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671119835"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/1485c7ec-5b28-4246-a12f-652e9d03fe92/cancel` → **200**

```json
{
  "command_id": "bbb01447-41d6-4529-a83b-86f3ed130e01",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "1485c7ec-5b28-4246-a12f-652e9d03fe92",
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
  "created_at": "2026-10-30T10:19:50.549288Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671119835"
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
  "staff_id": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T10:10:46.585302Z",
  "last_entries": [
    {
      "order_id": "1485c7ec-5b28-4246-a12f-652e9d03fe92",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T10:19:50.964849Z"
    },
    {
      "order_id": "bac942f8-76ac-4b0a-99ce-6da60e536870",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T10:19:50.154828Z"
    },
    {
      "order_id": "18a7dabe-2210-4669-9ed6-73fea5eab461",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T10:10:46.585302Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "71d0133d-5d52-4ade-8626-120c302ca678",
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
  "last_heartbeat_at": "2026-10-30T10:19:49.579211Z",
  "last_location_at": "2026-10-30T10:19:49.579211Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/71d0133d-5d52-4ade-8626-120c302ca678/close` → **200**

```json
{
  "command_id": "5ece806d-e5a4-483f-b172-875b8b28fd8e",
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

Done: operator bonus for fulfilled bac942f8-76ac-4b0a-99ce-6da60e536870 and operator-fault cancellation 1485c7ec-5b28-4246-a12f-652e9d03fe92.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676913076",
  "device_ref": "sandbox-22625"
}
```

```json
{
  "challenge_id": "125fb1ca-8bfa-4a1d-8939-849ac92e4507",
  "expires_at": "2026-10-30T10:24:54.947885554Z",
  "resend_available_at": "2026-10-30T10:19:55.947885554Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676913076` → **200**

```json
{
  "phone": "+380676913076",
  "audience": "CLIENT",
  "code": "374201",
  "sent_at": "2026-10-30T10:19:54.949593074Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679522704",
  "device_ref": "sandbox-22792",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "4e6b4514-fa31-41c0-8676-085c1bc70bd9",
  "expires_at": "2026-10-30T10:24:56.397683543Z",
  "resend_available_at": "2026-10-30T10:19:57.397683543Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679522704` → **200**

```json
{
  "phone": "+380679522704",
  "audience": "CLIENT",
  "code": "488460",
  "sent_at": "2026-10-30T10:19:56.399214427Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679522704",
  "device_ref": "sandbox-22066",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "c23d5155-6154-4631-a581-85622bdaa2f3",
  "expires_at": "2026-10-30T10:24:57.810872373Z",
  "resend_available_at": "2026-10-30T10:19:58.810872373Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679522704` → **200**

```json
{
  "phone": "+380679522704",
  "audience": "CLIENT",
  "code": "024918",
  "sent_at": "2026-10-30T10:19:57.813093361Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675790000",
  "device_ref": "sandbox-18158"
}
```

```json
{
  "challenge_id": "42e75844-3de5-43cd-9816-854fcc5d0e35",
  "expires_at": "2026-10-30T10:24:59.224946625Z",
  "resend_available_at": "2026-10-30T10:20:00.224946625Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675790000",
  "device_ref": "sandbox-20812"
}
```

```json
{
  "challenge_id": "c4e0936f-7e92-47ce-bcbf-b437e17630d3",
  "expires_at": "2026-10-30T10:25:00.613789012Z",
  "resend_available_at": "2026-10-30T10:20:01.613789012Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675790000` → **200**

```json
{
  "phone": "+380675790000",
  "audience": "CLIENT",
  "code": "478442",
  "sent_at": "2026-10-30T10:20:00.615758917Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675790000",
  "device_ref": "sandbox-28640",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "0dde7340-6da6-431b-bf6e-003006f43e48",
  "expires_at": "2026-10-30T10:25:02.01414238Z",
  "resend_available_at": "2026-10-30T10:20:03.01414238Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675790000` → **200**

```json
{
  "phone": "+380675790000",
  "audience": "CLIENT",
  "code": "985598",
  "sent_at": "2026-10-30T10:20:02.016208019Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380675790000",
  "device_ref": "sandbox-3343",
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
  "correlation_id": "1113b08a-514e-48ba-9581-403c466a8bc3",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000032439"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "cabe71b8-9558-450e-bedc-730792d33359"
}
```

`GET /sandbox/v1/otp?phone=%2B442000032439` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120009189"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "b293c4eb-d05d-4fde-8b12-c60a617513b0"
}
```

`GET /sandbox/v1/otp?phone=%2B37120009189` → **404**

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
  "session_id": "bf3028ad-57a1-44dc-8e01-129104f35ac5",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTY1MDQsImlhdCI6MTc5MzM1NTYwNCwianRpIjoiNTFjMjgxM2YtODM1Yy00YmY3LTk4NDMtYmMxYjdkZGJiNzExIiwic2lkIjoiYmYzMDI4YWQtNTdhMS00NGRjLThlMDEtMTI5MTA0ZjM1YWM1In0.ADyJ-w0lY9-TcXYqDi90v8OKceUJ5EXO5BLvK7tvtWk",
  "access_expires_at": "2026-10-30T10:35:04.242781004Z",
  "refresh_token": "0zgsg8Q0wHNGDQ6ABlPofjAiORgmc68zaFNUzXMVnRU",
  "refresh_expires_at": "2026-10-30T22:20:04.242453802Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675790000` → **200**

```json
{
  "deliveries": [
    {
      "id": "71a24ee9-e50d-406c-b23a-a0431822eb54",
      "challenge_id": "0dde7340-6da6-431b-bf6e-003006f43e48",
      "phone": "+380675790000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-277497f9-64d7-4500-bd85-685728929632",
      "error": null,
      "attempted_at": "2026-10-30T10:20:02.016681Z"
    },
    {
      "id": "4f2520fa-407c-4e30-b5a3-488621af315f",
      "challenge_id": "c4e0936f-7e92-47ce-bcbf-b437e17630d3",
      "phone": "+380675790000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-389cc48f-de9f-48da-87db-552654227c81",
      "error": null,
      "attempted_at": "2026-10-30T10:20:00.616139Z"
    },
    {
      "id": "1d95e099-dafb-4d57-932c-b66df7aa917c",
      "challenge_id": "42e75844-3de5-43cd-9816-854fcc5d0e35",
      "phone": "+380675790000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T10:19:59.226832Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380675790000` → **200**

```json
{
  "phone": "+380675790000",
  "audience": "CLIENT",
  "code": "985598",
  "sent_at": "2026-10-30T10:20:02.016208019Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679522704` → **200**

```json
{
  "deliveries": [
    {
      "id": "a629c7e0-45c7-40d2-8adc-47a5251950ce",
      "challenge_id": "c23d5155-6154-4631-a581-85622bdaa2f3",
      "phone": "+380679522704",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-bc7eb5c5-f6de-4e6d-a4d6-be139a5eb9fe",
      "error": null,
      "attempted_at": "2026-10-30T10:19:57.813348Z"
    },
    {
      "id": "4aece968-2645-4341-afd6-3e26bd074c93",
      "challenge_id": "4e6b4514-fa31-41c0-8676-085c1bc70bd9",
      "phone": "+380679522704",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-26e24783-a020-48df-9075-f0a2ca5bbacd",
      "error": null,
      "attempted_at": "2026-10-30T10:19:56.399471Z"
    }
  ]
}
```

Done: SMS to +380676913076; SMS then a call to +380679522704; a failed SMS, two calls and a refused third to +380675790000; +44 and +371 refused.

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
  "session_id": "3acfa976-0f7c-4c69-9df2-f90fdad1d683",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTY1MDUsImlhdCI6MTc5MzM1NTYwNSwianRpIjoiZGQ1NzVhNmEtZDAzNC00MzI5LTlhNTItMzlkMmM3MDI3ZDliIiwic2lkIjoiM2FjZmE5NzYtMGY3Yy00YzY5LTlkZjItZjkwZmRhZDFkNjgzIn0.UzwBA7wfwKXfv6v6cRlp4uvsdpZo1SZyOSkOU5yGREk",
  "access_expires_at": "2026-10-30T10:35:05.031408821Z",
  "refresh_token": "qOZ2VnaOo5nD3OtW-6WMKVqso5JKfK4Oq6m4BJHhNVw",
  "refresh_expires_at": "2026-10-30T22:20:05.031043441Z",
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
  "session_id": "0013221a-350a-4649-b47f-dc1fab6fb731",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTY1MDUsImlhdCI6MTc5MzM1NTYwNSwianRpIjoiNzQ3YzgzYWMtYTZlNi00Y2I0LThiNDYtMGIzOWRkMzkwODE1Iiwic2lkIjoiMDAxMzIyMWEtMzUwYS00NjQ5LWI0N2YtZGMxZmFiNmZiNzMxIn0.ASE4m25MYbNd-Xhpyhw_Qj0qR_DMjkwrSdVPV-PZHO0",
  "access_expires_at": "2026-10-30T10:35:05.409859039Z",
  "refresh_token": "WwUM9Rkixv0xbMd1xPWzQ46Cio-RG97YfACZO2NTvkU",
  "refresh_expires_at": "2026-10-30T22:20:05.409470193Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f",
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

`POST /api/admin/v1/staff-extensions/fc83930a-0f00-4627-8f4f-e260893ced8f` → **200**

```json
{
  "command_id": "54b7cd70-415e-4bd1-bd58-60160f593759",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "d8fa6511-218b-49ed-ac4f-ec5204b80914",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T10:20:06.180351Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T10:20:06.180351Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "5b4b3ce6-4044-4995-bea8-a04b56f283e5",
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
  "id": "fbadb5e9-b68b-4600-97c7-a876487c16ab",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:25:06.558444Z",
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
  "command_id": "a5c6189d-9277-40e0-bda5-044870443ec1",
  "quote_id": "fbadb5e9-b68b-4600-97c7-a876487c16ab",
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
    "phone": "+380676085319"
  }
}
```

```json
{
  "id": "ca0c792c-3463-4899-951a-6740409e2e18",
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
  "created_at": "2026-10-30T10:20:06.748848Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676085319"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/ca0c792c-3463-4899-951a-6740409e2e18/calls` → **201**

```json
{
  "command_id": "bdd96bf6-59d9-41af-805d-31aed5c65986",
  "to": "CALLER"
}
```

```json
{
  "id": "15095752-8dc8-40bb-a94d-6d9b1ff3e75d",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "order_ids": [
    "ca0c792c-3463-4899-951a-6740409e2e18"
  ],
  "started_at": "2026-10-30T10:20:06.966218Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/ca0c792c-3463-4899-951a-6740409e2e18/calls` → **201**

```json
{
  "command_id": "bdd96bf6-59d9-41af-805d-31aed5c65986",
  "to": "CALLER"
}
```

```json
{
  "id": "15095752-8dc8-40bb-a94d-6d9b1ff3e75d",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "order_ids": [
    "ca0c792c-3463-4899-951a-6740409e2e18"
  ],
  "started_at": "2026-10-30T10:20:06.966218Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "15095752-8dc8-40bb-a94d-6d9b1ff3e75d",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380676085319",
    "at": "2026-10-30T10:20:06.967923366Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "15095752-8dc8-40bb-a94d-6d9b1ff3e75d",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.17592",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "15095752-8dc8-40bb-a94d-6d9b1ff3e75d"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "15095752-8dc8-40bb-a94d-6d9b1ff3e75d",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=ca0c792c-3463-4899-951a-6740409e2e18` → **200**

```json
{
  "calls": [
    {
      "id": "15095752-8dc8-40bb-a94d-6d9b1ff3e75d",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "order_ids": [
        "ca0c792c-3463-4899-951a-6740409e2e18"
      ],
      "started_at": "2026-10-30T10:20:06.966218Z",
      "answered_at": "2026-10-30T10:20:07.430786Z",
      "ended_at": "2026-10-30T10:20:07.447977Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=ca0c792c-3463-4899-951a-6740409e2e18` → **200**

```json
{
  "calls": [
    {
      "id": "15095752-8dc8-40bb-a94d-6d9b1ff3e75d",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "order_ids": [
        "ca0c792c-3463-4899-951a-6740409e2e18"
      ],
      "started_at": "2026-10-30T10:20:06.966218Z",
      "answered_at": "2026-10-30T10:20:07.430786Z",
      "ended_at": "2026-10-30T10:20:07.447977Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T10:20:08.068998Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/ca0c792c-3463-4899-951a-6740409e2e18` → **200**

```json
{
  "id": "ca0c792c-3463-4899-951a-6740409e2e18",
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
  "created_at": "2026-10-30T10:20:06.748848Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676085319"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ca0c792c-3463-4899-951a-6740409e2e18/cancel` → **200**

```json
{
  "command_id": "c29d5d58-88d1-4fb0-9064-5151c356866b",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ca0c792c-3463-4899-951a-6740409e2e18",
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
  "created_at": "2026-10-30T10:20:06.748848Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676085319"
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
  "command_id": "8dc3a07c-d135-4858-9049-5f9981428182",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T10:20:10.278416Z",
  "extension": "101"
}
```

Done: outgoing call 15095752-8dc8-40bb-a94d-6d9b1ff3e75d from order ca0c792c-3463-4899-951a-6740409e2e18, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635387554",
  "device_ref": "sandbox-280"
}
```

```json
{
  "challenge_id": "25bc7777-e4a3-454c-82f0-f2c60f639c05",
  "expires_at": "2026-10-30T10:25:10.474123895Z",
  "resend_available_at": "2026-10-30T10:20:11.474123895Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635387554` → **200**

```json
{
  "phone": "+380635387554",
  "audience": "CLIENT",
  "code": "103594",
  "sent_at": "2026-10-30T10:20:10.476141532Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "25bc7777-e4a3-454c-82f0-f2c60f639c05",
  "code": "103594",
  "device_ref": "sandbox-280"
}
```

```json
{
  "session_id": "89e7f724-0cab-47b3-8af1-3d3c1c5a4f89",
  "subject": {
    "type": "CLIENT",
    "id": "75bef4ae-0bfb-4edc-bec1-6b2fbbae4878"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NWJlZjRhZS0wYmZiLTRlZGMtYmVjMS02YjJmYmJhZTQ4NzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2NTEwLCJpYXQiOjE3OTMzNTU2MTAsImp0aSI6IjkzNDA4YzgyLTI3NGMtNDAyMi1iOGQzLWI0N2E0NWM4MWNlYiIsInNpZCI6Ijg5ZTdmNzI0LTBjYWItNDdiMy04YWYxLTNkM2MxYzVhNGY4OSJ9.dAPlOC_H7GZ8_OG1gaoEAFdYkaYMvctsveIwqtD_-A4",
  "access_expires_at": "2026-10-30T10:35:10.66993181Z",
  "refresh_token": "zodkVTecQEilUPi6o1-EezZDZNDP42hWWzf1BKj7kP8",
  "refresh_expires_at": "2026-11-29T10:20:10.669588108Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "75bef4ae-0bfb-4edc-bec1-6b2fbbae4878",
  "session_id": "89e7f724-0cab-47b3-8af1-3d3c1c5a4f89",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635387554",
  "device_ref": "sandbox-19952"
}
```

```json
{
  "challenge_id": "fac85131-c1bd-4e38-b3f6-b71b0dacf817",
  "expires_at": "2026-10-30T10:25:13.031383246Z",
  "resend_available_at": "2026-10-30T10:20:14.031383246Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635387554` → **200**

```json
{
  "phone": "+380635387554",
  "audience": "CLIENT",
  "code": "151356",
  "sent_at": "2026-10-30T10:20:13.033231368Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fac85131-c1bd-4e38-b3f6-b71b0dacf817",
  "code": "151356",
  "device_ref": "sandbox-19952"
}
```

```json
{
  "session_id": "fccf9141-609b-4fd0-ad41-37c52a3188c5",
  "subject": {
    "type": "CLIENT",
    "id": "75bef4ae-0bfb-4edc-bec1-6b2fbbae4878"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NWJlZjRhZS0wYmZiLTRlZGMtYmVjMS02YjJmYmJhZTQ4NzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2NTEzLCJpYXQiOjE3OTMzNTU2MTMsImp0aSI6IjZhM2UxNzZiLTMxZGEtNDY3Ny04OWMxLWFkZjA0MzdjZGIzNyIsInNpZCI6ImZjY2Y5MTQxLTYwOWItNGZkMC1hZDQxLTM3YzUyYTMxODhjNSJ9.fxRo_RVRcmEvMF7D0aHop-raABR2MkThFLARfsRguic",
  "access_expires_at": "2026-10-30T10:35:13.232706313Z",
  "refresh_token": "_HdzeINmsiOxXvwwIojjmNpwVtqw8PU9OgqhuPgD7WY",
  "refresh_expires_at": "2026-11-29T10:20:13.232396587Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "4353ae3c-1059-4a2c-9e84-6064ab7a77fe",
  "expires_at": "2026-10-30T10:25:15.420983201Z",
  "resend_available_at": "2026-10-30T10:20:16.420983201Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635387554` → **200**

```json
{
  "phone": "+380635387554",
  "audience": "CLIENT",
  "code": "727444",
  "sent_at": "2026-10-30T10:20:15.422487415Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380634461846"
}
```

```json
{
  "challenge_id": "03caf9ed-c209-4f4b-b4a1-6de4b9e61612",
  "expires_at": "2026-10-30T10:25:15.625189473Z",
  "resend_available_at": "2026-10-30T10:20:16.625189473Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634461846` → **200**

```json
{
  "phone": "+380634461846",
  "audience": "CLIENT",
  "code": "949407",
  "sent_at": "2026-10-30T10:20:15.626928791Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "0669bcbe-afbb-4a1f-850f-929a2f061c8a",
  "current_challenge_id": "4353ae3c-1059-4a2c-9e84-6064ab7a77fe",
  "current_code": "000000",
  "new_challenge_id": "03caf9ed-c209-4f4b-b4a1-6de4b9e61612",
  "new_code": "949407"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "340e452b-606a-4ad4-8059-dc07ae7cf50f"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "42e84e27-f900-4ac9-8287-752c413fb02a",
  "current_challenge_id": "4353ae3c-1059-4a2c-9e84-6064ab7a77fe",
  "current_code": "727444",
  "new_challenge_id": "03caf9ed-c209-4f4b-b4a1-6de4b9e61612",
  "new_code": "949407"
}
```

```json
{
  "subject_id": "75bef4ae-0bfb-4edc-bec1-6b2fbbae4878",
  "phone": "+380634461846",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "75bef4ae-0bfb-4edc-bec1-6b2fbbae4878",
  "session_id": "89e7f724-0cab-47b3-8af1-3d3c1c5a4f89",
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
  "correlation_id": "ac5f5bcf-2e5c-4c1b-aa0a-4b9faeeaeae9"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634461846",
  "device_ref": "sandbox-3260"
}
```

```json
{
  "challenge_id": "4a709382-a78e-4460-a0bb-7e9538a4b242",
  "expires_at": "2026-10-30T10:25:18.564681107Z",
  "resend_available_at": "2026-10-30T10:20:19.564681107Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634461846` → **200**

```json
{
  "phone": "+380634461846",
  "audience": "CLIENT",
  "code": "412135",
  "sent_at": "2026-10-30T10:20:18.566629349Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4a709382-a78e-4460-a0bb-7e9538a4b242",
  "code": "412135",
  "device_ref": "sandbox-3260"
}
```

```json
{
  "session_id": "395d2671-add0-43bb-8dfe-e7ecb1f99d8a",
  "subject": {
    "type": "CLIENT",
    "id": "75bef4ae-0bfb-4edc-bec1-6b2fbbae4878"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NWJlZjRhZS0wYmZiLTRlZGMtYmVjMS02YjJmYmJhZTQ4NzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2NTE4LCJpYXQiOjE3OTMzNTU2MTgsImp0aSI6Ijg2ODc2Yjc5LTExNDEtNDhkOC05NTBjLTMyZjNkNmQwOWY3ZiIsInNpZCI6IjM5NWQyNjcxLWFkZDAtNDNiYi04ZGZlLWU3ZWNiMWY5OWQ4YSJ9.GXzGlqr9HV6m_PKLmw_UDhwTeZ4zYfnJhx_SxMawDU8",
  "access_expires_at": "2026-10-30T10:35:18.766341714Z",
  "refresh_token": "xaQXSBCaBVgFg2aZhO_RvTK677_gsSQLnhnBZOvAsRw",
  "refresh_expires_at": "2026-11-29T10:20:18.766006495Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "75bef4ae-0bfb-4edc-bec1-6b2fbbae4878",
  "session_id": "395d2671-add0-43bb-8dfe-e7ecb1f99d8a",
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
  "session_id": "71b8597a-30ee-4232-8e1e-9f12a5eeb9b3",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTY1MTksImlhdCI6MTc5MzM1NTYxOSwianRpIjoiMDE4YTBhYTctOWEyZS00ZTUzLWE2NzctYWM5ZjA0Njg1NjRiIiwic2lkIjoiNzFiODU5N2EtMzBlZS00MjMyLThlMWUtOWYxMmE1ZWViOWIzIn0.7I2SJID91nXJqTM8rrjEUd1Eoc9W0jCm6mXd6qIckgQ",
  "access_expires_at": "2026-10-30T10:35:19.327211558Z",
  "refresh_token": "AjeiYo50SSWM9XTlg-_NTf5ZcVkeP3_upwv8CUhuOog",
  "refresh_expires_at": "2026-10-30T22:20:19.326897703Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/75bef4ae-0bfb-4edc-bec1-6b2fbbae4878` → **200**

```json
{
  "client": {
    "id": "75bef4ae-0bfb-4edc-bec1-6b2fbbae4878",
    "phone": "+380634461846",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T10:20:10.668339Z",
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

`POST /api/admin/v1/clients/75bef4ae-0bfb-4edc-bec1-6b2fbbae4878/phone/new-code` → **201**

```json
{
  "phone": "+380634639592"
}
```

```json
{
  "challenge_id": "917c0e50-927c-4237-908c-bd4b237c50a5",
  "expires_at": "2026-10-30T10:25:19.722720286Z",
  "resend_available_at": "2026-10-30T10:20:20.722720286Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634639592` → **200**

```json
{
  "phone": "+380634639592",
  "audience": "CLIENT",
  "code": "212908",
  "sent_at": "2026-10-30T10:20:19.72429059Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/75bef4ae-0bfb-4edc-bec1-6b2fbbae4878/phone` → **422**

```json
{
  "command_id": "92696708-89c5-4932-9df1-7a2bd58b71d7",
  "expected_version": 3,
  "new_challenge_id": "917c0e50-927c-4237-908c-bd4b237c50a5",
  "new_code": "212909",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/75bef4ae-0bfb-4edc-bec1-6b2fbbae4878/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "00756069-d343-4172-9604-3b76bc07ee1f"
}
```

`POST /api/admin/v1/clients/75bef4ae-0bfb-4edc-bec1-6b2fbbae4878/phone` → **400**

```json
{
  "command_id": "0a97f1ac-ae51-47cb-a26e-fb3cc2636b38",
  "expected_version": 3,
  "new_challenge_id": "917c0e50-927c-4237-908c-bd4b237c50a5",
  "new_code": "212908",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/75bef4ae-0bfb-4edc-bec1-6b2fbbae4878/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7fd1bbda-1f87-4d4a-967c-488484a3686f",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/75bef4ae-0bfb-4edc-bec1-6b2fbbae4878/phone` → **200**

```json
{
  "command_id": "09eeff67-78c9-467d-b58e-1a1c1917166f",
  "expected_version": 3,
  "new_challenge_id": "917c0e50-927c-4237-908c-bd4b237c50a5",
  "new_code": "212908",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "75bef4ae-0bfb-4edc-bec1-6b2fbbae4878",
  "phone": "+380634639592",
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
  "correlation_id": "a4efc10e-02f4-4550-a614-c01342783fe5"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380634639592",
  "device_ref": "sandbox-3635"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "5fb14404-ae89-4525-be32-b08a03ef616f",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634639592",
  "device_ref": "sandbox-3635"
}
```

```json
{
  "challenge_id": "0faab003-f4c8-4518-bb0a-419c1b53f70d",
  "expires_at": "2026-10-30T10:25:21.90782979Z",
  "resend_available_at": "2026-10-30T10:20:22.90782979Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634639592` → **200**

```json
{
  "phone": "+380634639592",
  "audience": "CLIENT",
  "code": "374572",
  "sent_at": "2026-10-30T10:20:21.909509679Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0faab003-f4c8-4518-bb0a-419c1b53f70d",
  "code": "374572",
  "device_ref": "sandbox-3635"
}
```

```json
{
  "session_id": "fd993ff0-9dc3-4bef-8ffc-4a7ce080af60",
  "subject": {
    "type": "CLIENT",
    "id": "75bef4ae-0bfb-4edc-bec1-6b2fbbae4878"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NWJlZjRhZS0wYmZiLTRlZGMtYmVjMS02YjJmYmJhZTQ4NzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2NTIyLCJpYXQiOjE3OTMzNTU2MjIsImp0aSI6IjRlNTI1OWZjLTFhOGQtNGMxMy1iODIyLTMxZjc0OTAwOTEwMSIsInNpZCI6ImZkOTkzZmYwLTlkYzMtNGJlZi04ZmZjLTRhN2NlMDgwYWY2MCJ9.LivW2A9smLPjFBRp0wHdE4P0JUPOI0fbfhGKXT7Xa0A",
  "access_expires_at": "2026-10-30T10:35:22.119451315Z",
  "refresh_token": "Q7oD5dYGkG-OlVJM67V7b62NqDL8vd_OGcC-zALsXD4",
  "refresh_expires_at": "2026-11-29T10:20:22.119086584Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "75bef4ae-0bfb-4edc-bec1-6b2fbbae4878",
  "session_id": "fd993ff0-9dc3-4bef-8ffc-4a7ce080af60",
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
  "phone": "+380632182477",
  "device_ref": "sandbox-7923"
}
```

```json
{
  "challenge_id": "1aeffd66-26a3-4d4d-956f-4a77990b55c6",
  "expires_at": "2026-10-30T10:25:22.498859737Z",
  "resend_available_at": "2026-10-30T10:20:23.498859737Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632182477` → **200**

```json
{
  "phone": "+380632182477",
  "audience": "CLIENT",
  "code": "336673",
  "sent_at": "2026-10-30T10:20:22.500718296Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1aeffd66-26a3-4d4d-956f-4a77990b55c6",
  "code": "336673",
  "device_ref": "sandbox-7923"
}
```

```json
{
  "session_id": "b9608aac-a912-4817-8fa2-1d607eb934fc",
  "subject": {
    "type": "CLIENT",
    "id": "270b53c0-0892-4708-9ecb-b47f4bd9ce86"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNzBiNTNjMC0wODkyLTQ3MDgtOWVjYi1iNDdmNGJkOWNlODYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2NTIyLCJpYXQiOjE3OTMzNTU2MjIsImp0aSI6IjhiZmM4MzA5LTg0MjgtNDc4ZC1hZTJmLWJiOTFjYTE2YmJiMiIsInNpZCI6ImI5NjA4YWFjLWE5MTItNDgxNy04ZmEyLTFkNjA3ZWI5MzRmYyJ9.bRaMpOCI7cJkCsi06YGaLPGI2YEfKbO1TCR9tiGcEjg",
  "access_expires_at": "2026-10-30T10:35:22.703737808Z",
  "refresh_token": "CdeLXO2nHGfBwm0n7EY9EZ-Xd8nWsQWWX9qru1SVD-E",
  "refresh_expires_at": "2026-11-29T10:20:22.703426538Z",
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
  "session_id": "4fb2ba3c-9eb1-4d73-84de-997db320e2ac",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTY1MjMsImlhdCI6MTc5MzM1NTYyMywianRpIjoiMjc4NTAxZTUtODZjMy00MWU1LTljZmEtNGE5ZTEwYzI2YTMwIiwic2lkIjoiNGZiMmJhM2MtOWViMS00ZDczLTg0ZGUtOTk3ZGIzMjBlMmFjIn0.0ArE3-oKCUD4MlQwuMuEo9BCGLrh8NTqzOrl56FZgxI",
  "access_expires_at": "2026-10-30T10:35:23.471013008Z",
  "refresh_token": "CSn2WkjnwbdU53Mn7Iekgmshw0eb1mn8SW1IA5HQ_Zg",
  "refresh_expires_at": "2026-10-30T22:20:23.470470538Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380632182477` → **200**

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
  "correlation_id": "597b1827-7fc0-4310-8c72-629492939dd0"
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
  "session_id": "7eca4424-129f-41c5-ae13-fb32a717dc35",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTY1MjQsImlhdCI6MTc5MzM1NTYyNCwianRpIjoiY2JmZjdjZTUtOGE5ZS00Njc5LTllYmMtYmZjNjlmM2QyYWRlIiwic2lkIjoiN2VjYTQ0MjQtMTI5Zi00MWM1LWFlMTMtZmIzMmE3MTdkYzM1In0.hlI5gRJPkIbyPGX7ys3ralyVE_c-BxvT3paN2mXVsmE",
  "access_expires_at": "2026-10-30T10:35:24.253083983Z",
  "refresh_token": "4rn3mfOXLO-WJEXnOJ3NVobdzLuhBHGiVP9JdUrJZx8",
  "refresh_expires_at": "2026-10-30T22:20:24.25275117Z",
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
  "changed_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T10:06:51.644888Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "e46539bb-b469-49e6-9552-246fbbfbfbac",
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
  "changed_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T10:20:24.631541377Z"
}
```

## The rider books the airport for 2026-10-30T13:20:24Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600131786",
  "device_ref": "sandbox-5713"
}
```

```json
{
  "challenge_id": "7ac97195-3542-4875-8641-e0115be9056a",
  "expires_at": "2026-10-30T10:25:24.823641244Z",
  "resend_available_at": "2026-10-30T10:20:25.823641244Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600131786` → **200**

```json
{
  "phone": "+48600131786",
  "audience": "CLIENT",
  "code": "805017",
  "sent_at": "2026-10-30T10:20:24.825310143Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7ac97195-3542-4875-8641-e0115be9056a",
  "code": "805017",
  "device_ref": "sandbox-5713"
}
```

```json
{
  "session_id": "c32c150c-43ee-4c29-abbc-a6971bc01f1a",
  "subject": {
    "type": "CLIENT",
    "id": "06f4e738-396d-4943-877e-07917f577aa8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNmY0ZTczOC0zOTZkLTQ5NDMtODc3ZS0wNzkxN2Y1NzdhYTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2NTI1LCJpYXQiOjE3OTMzNTU2MjUsImp0aSI6IjQwMzdiMDhjLWY4M2UtNGM4Yi1hOGI0LWFiOGRhMWNmNTZkOCIsInNpZCI6ImMzMmMxNTBjLTQzZWUtNGMyOS1hYmJjLWE2OTcxYmMwMWYxYSJ9.wY5t3EMkr0jA2maHbO965wUU3wH8QOz4pAe3jvpFlCI",
  "access_expires_at": "2026-10-30T10:35:25.029862031Z",
  "refresh_token": "OZ9xVWqMz2IhaZOvHAmCKfRIt70XCWo58WB9BbAadt8",
  "refresh_expires_at": "2026-11-29T10:20:25.029510209Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9bec65dc-ce67-469e-9dc6-f17302fdcbfe",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T13:20:24Z"
}
```

```json
{
  "id": "887d3d6e-208a-4582-b26b-98addb20ddbc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:25:25.233989Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T13:20:24Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0c7a6a15-bbfe-49e3-ba1d-a0d8afe302f7",
  "quote_id": "887d3d6e-208a-4582-b26b-98addb20ddbc",
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
  "pickup_at": "2026-10-30T13:20:24Z"
}
```

```json
{
  "id": "9e3201d4-b9bc-4dce-8594-4f4690f1a4c9",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "06f4e738-396d-4943-877e-07917f577aa8",
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
  "created_at": "2026-10-30T10:20:25.424306Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T13:20:24Z",
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
  "device_ref": "sandbox-10014"
}
```

```json
{
  "challenge_id": "2d88425e-9c0d-4dee-960e-eba967fe575f",
  "expires_at": "2026-10-30T10:25:25.619128506Z",
  "resend_available_at": "2026-10-30T10:20:26.619128506Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "834118",
  "sent_at": "2026-10-30T10:20:25.621134458Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2d88425e-9c0d-4dee-960e-eba967fe575f",
  "code": "834118",
  "device_ref": "sandbox-10014"
}
```

```json
{
  "session_id": "2f203973-5e45-44d0-bb17-3d9b9612be67",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NjUyNSwiaWF0IjoxNzkzMzU1NjI1LCJqdGkiOiJiMjhmMzVmYS1jNmViLTQyNzAtOTM2OC0yM2IzZDMzYjIyNDgiLCJzaWQiOiIyZjIwMzk3My01ZTQ1LTQ0ZDAtYmIxNy0zZDliOTYxMmJlNjcifQ.oRrn-OS1gvwHHhwWrxgOoBTzLt3WZJJisjSCQn6n2c4",
  "access_expires_at": "2026-10-30T10:35:25.82822229Z",
  "refresh_token": "iTuSDUiwaVIoDzqZpUZAd1CXi05qyeNKX6ObpJGcTm4",
  "refresh_expires_at": "2026-11-29T10:20:25.827921836Z",
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
  "command_id": "0ba912b9-1a83-40b0-bf2d-a2b4f04979ea",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:20:26Z",
    "sequence": 1793355626204
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "54a0cd1c-8ea3-47fd-8803-e9e98c93f4cb",
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
  "last_heartbeat_at": "2026-10-30T10:20:26.220337Z",
  "last_location_at": "2026-10-30T10:20:26.220337Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "9e3201d4-b9bc-4dce-8594-4f4690f1a4c9",
      "short_number": 25,
      "pickup_at": "2026-10-30T13:20:24Z",
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

`POST /api/driver/v1/preorders/9e3201d4-b9bc-4dce-8594-4f4690f1a4c9/reserve` → **200**

```json
{
  "command_id": "c87869c0-bdf2-416c-9fe4-560c80744f3c"
}
```

```json
{
  "id": "e491c6e9-0c94-4dae-996f-2e93d2092a0c",
  "state": "RESERVED",
  "order": {
    "order_id": "9e3201d4-b9bc-4dce-8594-4f4690f1a4c9",
    "short_number": 25,
    "pickup_at": "2026-10-30T13:20:24Z",
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
  "reserved_at": "2026-10-30T10:20:26.59407Z",
  "confirm_from": "2026-10-30T12:50:24Z",
  "confirm_until": "2026-10-30T13:00:24Z",
  "drop_until": "2026-10-30T12:20:24Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "e491c6e9-0c94-4dae-996f-2e93d2092a0c",
      "state": "RESERVED",
      "order": {
        "order_id": "9e3201d4-b9bc-4dce-8594-4f4690f1a4c9",
        "short_number": 25,
        "pickup_at": "2026-10-30T13:20:24Z",
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
      "reserved_at": "2026-10-30T10:20:26.59407Z",
      "confirm_from": "2026-10-30T12:50:24Z",
      "confirm_until": "2026-10-30T13:00:24Z",
      "drop_until": "2026-10-30T12:20:24Z"
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
      "id": "e491c6e9-0c94-4dae-996f-2e93d2092a0c",
      "state": "RESERVED",
      "order": {
        "order_id": "9e3201d4-b9bc-4dce-8594-4f4690f1a4c9",
        "short_number": 25,
        "pickup_at": "2026-10-30T13:20:24Z",
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
      "reserved_at": "2026-10-30T10:20:26.59407Z",
      "confirm_from": "2026-10-30T12:50:24Z",
      "confirm_until": "2026-10-30T13:00:24Z",
      "drop_until": "2026-10-30T12:20:24Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/e491c6e9-0c94-4dae-996f-2e93d2092a0c/confirm` → **409**

```json
{
  "command_id": "a3e18f0c-3730-4bde-9622-60ad54f9a2c1"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/e491c6e9-0c94-4dae-996f-2e93d2092a0c/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "44f49281-7d68-4b97-b3a5-7d4f4470bc4d"
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
  "session_id": "6506b9ae-f90d-4a5a-85d5-932dcb116937",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTY1MjcsImlhdCI6MTc5MzM1NTYyNywianRpIjoiNTY0MTQ4ZDMtOGUzMC00ZmUxLWI4MGUtMDFiNzc2OWZhYmU0Iiwic2lkIjoiNjUwNmI5YWUtZjkwZC00YTVhLTg1ZDUtOTMyZGNiMTE2OTM3In0.98F5aYDsQNqrU4DKp_YP1khUCyelFes0oH0UluC7bSU",
  "access_expires_at": "2026-10-30T10:35:27.533197047Z",
  "refresh_token": "_9bfrJLgTe75oQQ_8aBI3snRBSdOC38BMWPv13XnmNI",
  "refresh_expires_at": "2026-10-30T22:20:27.532809001Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9e3201d4-b9bc-4dce-8594-4f4690f1a4c9` → **200**

```json
{
  "id": "9e3201d4-b9bc-4dce-8594-4f4690f1a4c9",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "06f4e738-396d-4943-877e-07917f577aa8",
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
  "created_at": "2026-10-30T10:20:25.424306Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T13:20:24Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "e491c6e9-0c94-4dae-996f-2e93d2092a0c",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T10:20:26.59407Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/9e3201d4-b9bc-4dce-8594-4f4690f1a4c9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T10:20:25.424964Z",
      "actor": {
        "type": "CLIENT",
        "id": "06f4e738-396d-4943-877e-07917f577aa8",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "9e3201d4-b9bc-4dce-8594-4f4690f1a4c9",
        "preorder": true,
        "quote_id": "887d3d6e-208a-4582-b26b-98addb20ddbc",
        "pickup_at": "2026-10-30T13:20:24Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "a5f946c8-9fe5-4451-8d36-0eacb0db78cf"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T10:20:26.594852Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9e3201d4-b9bc-4dce-8594-4f4690f1a4c9",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "e491c6e9-0c94-4dae-996f-2e93d2092a0c"
      },
      "correlation_id": "81ae2407-4cfc-41be-a449-7f296c92013f"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 9e3201d4-b9bc-4dce-8594-4f4690f1a4c9, reservation e491c6e9-0c94-4dae-996f-2e93d2092a0c.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-32174"
}
```

```json
{
  "challenge_id": "2faeca42-912b-43a7-ac94-c2f3757e04b2",
  "expires_at": "2026-10-30T10:25:28.097859394Z",
  "resend_available_at": "2026-10-30T10:20:29.097859394Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "465432",
  "sent_at": "2026-10-30T10:20:28.099532504Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2faeca42-912b-43a7-ac94-c2f3757e04b2",
  "code": "465432",
  "device_ref": "sandbox-32174"
}
```

```json
{
  "session_id": "2635124b-87ae-4dcb-8894-72006e430160",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NjUyOCwiaWF0IjoxNzkzMzU1NjI4LCJqdGkiOiI3NzBmYTM1NC03YzQ0LTQyYWItYWNhYi01ZDc5NjUxNGNmZjgiLCJzaWQiOiIyNjM1MTI0Yi04N2FlLTRkY2ItODg5NC03MjAwNmU0MzAxNjAifQ.VEEq30OmoDXzwOnUtW4QuITeGnWRh0tYzj721g-PzlA",
  "access_expires_at": "2026-10-30T10:35:28.295336466Z",
  "refresh_token": "0ae1I8d7oB2nU_KSTbdojfejWyhHRqae7Z3cimYv6EY",
  "refresh_expires_at": "2026-11-29T10:20:28.295035433Z",
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
  "command_id": "fe64290c-244a-4464-a336-12d725eb6727",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:20:28Z",
    "sequence": 1793355628659
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4091cbf-a781-41d9-92c4-a2ca69779409",
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
  "last_heartbeat_at": "2026-10-30T10:20:28.674152Z",
  "last_location_at": "2026-10-30T10:20:28.674152Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679525580",
  "device_ref": "sandbox-32615"
}
```

```json
{
  "challenge_id": "cc28b32d-3f74-4d2f-9909-5268b9251bc9",
  "expires_at": "2026-10-30T10:25:28.856018358Z",
  "resend_available_at": "2026-10-30T10:20:29.856018358Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679525580` → **200**

```json
{
  "phone": "+380679525580",
  "audience": "CLIENT",
  "code": "920897",
  "sent_at": "2026-10-30T10:20:28.858014535Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cc28b32d-3f74-4d2f-9909-5268b9251bc9",
  "code": "920897",
  "device_ref": "sandbox-32615"
}
```

```json
{
  "session_id": "84d105e5-8084-41da-b099-c64794fabe00",
  "subject": {
    "type": "CLIENT",
    "id": "e610cd71-2dee-42ab-ad68-a960247f17e9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjEwY2Q3MS0yZGVlLTQyYWItYWQ2OC1hOTYwMjQ3ZjE3ZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2NTI5LCJpYXQiOjE3OTMzNTU2MjksImp0aSI6IjVjMTk2MTY5LTlkMzctNDFlYy05ZWM1LTM0MzBiNTc0MmYyZSIsInNpZCI6Ijg0ZDEwNWU1LTgwODQtNDFkYS1iMDk5LWM2NDc5NGZhYmUwMCJ9.IThB7b0UxUUh978e14FU75Dm3r9_mOurqCzmGFyQ3vI",
  "access_expires_at": "2026-10-30T10:35:29.05766094Z",
  "refresh_token": "VuyHDXqIp9hR93yPJoLE2DwdxvtsJQYX6YEGqtjxQbg",
  "refresh_expires_at": "2026-11-29T10:20:29.057360659Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "db7da275-ebb2-4ba0-b025-5210bf718961",
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
  "id": "f6da898e-815a-4049-bfd0-2610c791a286",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:25:29.243169Z",
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
  "command_id": "3a67769b-11e4-4cc7-9b4c-b0218b853368",
  "quote_id": "f6da898e-815a-4049-bfd0-2610c791a286",
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
  "id": "3f357633-521b-4cf8-b617-4035db25ccd7",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e610cd71-2dee-42ab-ad68-a960247f17e9",
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
  "created_at": "2026-10-30T10:20:29.42584Z",
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
    "id": "f31e8f56-bdf1-4882-b11d-245bbd2016b3",
    "order_id": "3f357633-521b-4cf8-b617-4035db25ccd7",
    "expires_at": "2026-10-30T10:20:44.427852Z",
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

`POST /api/driver/v1/offers/f31e8f56-bdf1-4882-b11d-245bbd2016b3/accept` → **200**

```json
{
  "command_id": "2f851f06-a3f5-4623-86f5-28eb3dd649f5"
}
```

```json
{
  "id": "3e7e10da-69d6-4114-a195-e07a98e5d9a8",
  "order_id": "3f357633-521b-4cf8-b617-4035db25ccd7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "815d6b5c-875d-4a31-9528-a0965651139c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "815d6b5c-875d-4a31-9528-a0965651139c",
  "order_id": "3f357633-521b-4cf8-b617-4035db25ccd7",
  "assignment_id": "3e7e10da-69d6-4114-a195-e07a98e5d9a8",
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

`POST /api/driver/v1/work-sessions/b4091cbf-a781-41d9-92c4-a2ca69779409/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:20:30Z",
    "sequence": 1793355630169
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4091cbf-a781-41d9-92c4-a2ca69779409",
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
  "last_heartbeat_at": "2026-10-30T10:20:30.183324Z",
  "last_location_at": "2026-10-30T10:20:30.183324Z",
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
  "id": "815d6b5c-875d-4a31-9528-a0965651139c",
  "order_id": "3f357633-521b-4cf8-b617-4035db25ccd7",
  "assignment_id": "3e7e10da-69d6-4114-a195-e07a98e5d9a8",
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

`POST /api/driver/v1/trips/815d6b5c-875d-4a31-9528-a0965651139c/arrive` → **200**

```json
{
  "command_id": "f367c4ef-5c7f-4392-8c62-9485dac7d7bf",
  "expected_version": 0
}
```

```json
{
  "id": "815d6b5c-875d-4a31-9528-a0965651139c",
  "order_id": "3f357633-521b-4cf8-b617-4035db25ccd7",
  "assignment_id": "3e7e10da-69d6-4114-a195-e07a98e5d9a8",
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
  "arrived_at": "2026-10-30T10:20:30.535379Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/815d6b5c-875d-4a31-9528-a0965651139c/start` → **200**

```json
{
  "command_id": "add665f9-6ff2-4e0d-938b-80ae6b7ef659",
  "expected_version": 1
}
```

```json
{
  "id": "815d6b5c-875d-4a31-9528-a0965651139c",
  "order_id": "3f357633-521b-4cf8-b617-4035db25ccd7",
  "assignment_id": "3e7e10da-69d6-4114-a195-e07a98e5d9a8",
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
  "arrived_at": "2026-10-30T10:20:30.535379Z",
  "started_at": "2026-10-30T10:20:30.718934Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 49 s to the next point)

`POST /api/driver/v1/work-sessions/b4091cbf-a781-41d9-92c4-a2ca69779409/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:21:19Z",
    "sequence": 1793355679917
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4091cbf-a781-41d9-92c4-a2ca69779409",
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
  "last_heartbeat_at": "2026-10-30T10:21:19.931537Z",
  "last_location_at": "2026-10-30T10:21:19.931537Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/815d6b5c-875d-4a31-9528-a0965651139c/complete` → **200**

```json
{
  "command_id": "cd393219-708e-42bc-9286-eee8998afa3b",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:21:20Z",
  "cash_received": true
}
```

```json
{
  "id": "815d6b5c-875d-4a31-9528-a0965651139c",
  "order_id": "3f357633-521b-4cf8-b617-4035db25ccd7",
  "assignment_id": "3e7e10da-69d6-4114-a195-e07a98e5d9a8",
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
  "arrived_at": "2026-10-30T10:20:30.535379Z",
  "started_at": "2026-10-30T10:20:30.718934Z",
  "completed_at": "2026-10-30T10:21:20.112768Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/3f357633-521b-4cf8-b617-4035db25ccd7/rating` → **200**

```json
{
  "command_id": "bf5c1bc5-e9c8-48bc-a184-08751dc92106",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "3f357633-521b-4cf8-b617-4035db25ccd7",
  "score": 5,
  "created_at": "2026-10-30T10:21:20.312093385Z"
}
```

`POST /api/driver/v1/orders/3f357633-521b-4cf8-b617-4035db25ccd7/rating` → **200**

```json
{
  "command_id": "7549eb93-adfc-4141-8e99-44e7bfdd5195",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "3f357633-521b-4cf8-b617-4035db25ccd7",
  "score": 4,
  "created_at": "2026-10-30T10:21:20.497950919Z"
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
  "session_id": "d5ce5101-8a67-4d86-b9fb-3d4438213f54",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTY1ODEsImlhdCI6MTc5MzM1NTY4MSwianRpIjoiZDk5ZDU0ZDAtZTJlYS00OTEwLTgyNTEtNGQzM2JhMDMxNTgxIiwic2lkIjoiZDVjZTUxMDEtOGE2Ny00ZDg2LWI5ZmItM2Q0NDM4MjEzZjU0In0.JKN9iZ0S1SBz5xP2_Wjr3NdNGyrnxle-1LtVJJcW4qE",
  "access_expires_at": "2026-10-30T10:36:21.07858539Z",
  "refresh_token": "ZUWE7WGAgnftqyKPkbY5pEKmfdZ8F0uqKquW433ynOE",
  "refresh_expires_at": "2026-10-30T22:21:21.078207963Z",
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
  "session_id": "b202669a-105a-435b-b0fb-bc005c9bcd9c",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTY1ODEsImlhdCI6MTc5MzM1NTY4MSwianRpIjoiOGJlYmE0NDMtMjEzNi00ZmIyLTllZDItMWExMDFmYWUyNjJlIiwic2lkIjoiYjIwMjY2OWEtMTA1YS00MzViLWIwZmItYmMwMDVjOWJjZDljIn0.Mq_D8ll9bRd0NmRyHpmFDPe4i2hCrUO5LCqGiTsD4gQ",
  "access_expires_at": "2026-10-30T10:36:21.4595174Z",
  "refresh_token": "_OfVHpV3bUYXi0m8TPmDLAQOHwF4P6CLxlWf2VDAnOs",
  "refresh_expires_at": "2026-10-30T22:21:21.459189168Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3f357633-521b-4cf8-b617-4035db25ccd7/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "3f357633-521b-4cf8-b617-4035db25ccd7",
      "author_type": "RIDER",
      "author_id": "e610cd71-2dee-42ab-ad68-a960247f17e9",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T10:21:20.312093Z"
    },
    {
      "order_id": "3f357633-521b-4cf8-b617-4035db25ccd7",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "e610cd71-2dee-42ab-ad68-a960247f17e9",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T10:21:20.497951Z"
    }
  ]
}
```

Done: ratings for order 3f357633-521b-4cf8-b617-4035db25ccd7.

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
  "session_id": "600d9dfb-f176-439e-8eb1-507500593a0d",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTY1ODIsImlhdCI6MTc5MzM1NTY4MiwianRpIjoiODdmNjc5YzgtY2U4Ny00MzRlLTkyNDYtYTNmODY5YTdhOGQxIiwic2lkIjoiNjAwZDlkZmItZjE3Ni00MzllLThlYjEtNTA3NTAwNTkzYTBkIn0.olrvjcZihahzopdDDdxaRr4MdBB5_6q4GlOWf_NjyMc",
  "access_expires_at": "2026-10-30T10:36:22.074023349Z",
  "refresh_token": "owbANUKdBSVwk2eN7qZWpViy4CF761gVCT9bvqDQniw",
  "refresh_expires_at": "2026-10-30T22:21:22.073676986Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "9c03f155-08b4-4d6a-b39f-162ad817f224",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "52e12332-3aae-4f32-bb4c-e705d32ae13d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:21:22.295199Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/52e12332-3aae-4f32-bb4c-e705d32ae13d` → **200**

```json
{
  "id": "52e12332-3aae-4f32-bb4c-e705d32ae13d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:21:22.295199Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/52e12332-3aae-4f32-bb4c-e705d32ae13d` → **200**

```json
{
  "id": "52e12332-3aae-4f32-bb4c-e705d32ae13d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T10:21:22.295199Z",
  "ready_at": "2026-10-30T10:21:23.19912Z",
  "expires_at": "2026-10-31T10:21:23.19912Z"
}
```

`GET /api/admin/v1/reports/exports/52e12332-3aae-4f32-bb4c-e705d32ae13d/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "3f45678b-7d43-4324-85dc-70133d54367b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "539ab547-1944-4966-ab66-2f4b4b9382d5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:21:23.876621Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/539ab547-1944-4966-ab66-2f4b4b9382d5` → **200**

```json
{
  "id": "539ab547-1944-4966-ab66-2f4b4b9382d5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:21:23.876621Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/539ab547-1944-4966-ab66-2f4b4b9382d5` → **200**

```json
{
  "id": "539ab547-1944-4966-ab66-2f4b4b9382d5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:21:23.876621Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/539ab547-1944-4966-ab66-2f4b4b9382d5` → **200**

```json
{
  "id": "539ab547-1944-4966-ab66-2f4b4b9382d5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:21:23.876621Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/539ab547-1944-4966-ab66-2f4b4b9382d5` → **200**

```json
{
  "id": "539ab547-1944-4966-ab66-2f4b4b9382d5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:21:23.876621Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/539ab547-1944-4966-ab66-2f4b4b9382d5` → **200**

```json
{
  "id": "539ab547-1944-4966-ab66-2f4b4b9382d5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T10:21:23.876621Z",
  "ready_at": "2026-10-30T10:21:28.204248Z",
  "expires_at": "2026-10-31T10:21:28.204248Z"
}
```

`GET /api/admin/v1/reports/exports/539ab547-1944-4966-ab66-2f4b4b9382d5/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/31538179-80db-45e0-b5b9-aaa8138ed9cd` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/31538179-80db-45e0-b5b9-aaa8138ed9cd",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7d30f6c0-e696-4bdc-a15e-0ce711481fcd"
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
  "device_ref": "sandbox-21681"
}
```

```json
{
  "challenge_id": "377c81e4-3553-46f6-a4e6-7b80e69606ad",
  "expires_at": "2026-10-30T10:26:29.281530093Z",
  "resend_available_at": "2026-10-30T10:21:30.281530093Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "472120",
  "sent_at": "2026-10-30T10:21:29.283836726Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "377c81e4-3553-46f6-a4e6-7b80e69606ad",
  "code": "472120",
  "device_ref": "sandbox-21681"
}
```

```json
{
  "session_id": "75b23092-cd7d-40d5-9e50-e4aecf3ab487",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NjU4OSwiaWF0IjoxNzkzMzU1Njg5LCJqdGkiOiJmOWQ0ZmI1MC1iMGFiLTRjMzUtOGFlOS1mOTI0Y2ZkMGM4MGIiLCJzaWQiOiI3NWIyMzA5Mi1jZDdkLTQwZDUtOWU1MC1lNGFlY2YzYWI0ODcifQ.LNU1TS4bkBh6DxlH25j0ykTqVCagWRD-UJbKWo_JMEw",
  "access_expires_at": "2026-10-30T10:36:29.486908136Z",
  "refresh_token": "guFS04cf9vZQWOaOFIuuh5H3cDni6vibljzTRMei-x0",
  "refresh_expires_at": "2026-11-29T10:21:29.486592073Z",
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
  "command_id": "17de8367-bda3-4551-aa7f-4e80d0ccccb4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:21:30Z",
    "sequence": 1793355690299
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "351f1964-ea3e-494a-8b22-7841eb0bbb64",
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
  "last_heartbeat_at": "2026-10-30T10:21:30.044501Z",
  "last_location_at": "2026-10-30T10:21:30.044501Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "9047896c-a686-4529-b122-eee2f94b32a0",
  "points": [
    {
      "sequence": 1793355692239,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T10:20:32Z"
    },
    {
      "sequence": 1793355692246,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T10:21:32Z"
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
  "session_id": "412bf69a-53a8-4177-84b6-70168e5e49a9",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTY1OTIsImlhdCI6MTc5MzM1NTY5MiwianRpIjoiYWRhYjNlYjgtNzMxMi00ZjAyLWE4NGYtOTEzZmY4OGM0YTYzIiwic2lkIjoiNDEyYmY2OWEtNTNhOC00MTc3LTg0YjYtNzAxNjhlNWU0OWE5In0.XpgQrQupRayYlQqrzoLh1UPSkgK_8JPKgZ6pmf_XW6k",
  "access_expires_at": "2026-10-30T10:36:32.656351768Z",
  "refresh_token": "AVjRe3pCIaY3453G--R6cRybB-hvRliooptEvvfzr-g",
  "refresh_expires_at": "2026-10-30T22:21:32.655983423Z",
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
      "id": "3ecb4f78-c50e-439d-bc47-668c70448b11",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T10:21:32Z",
        "track_point_id": "021234c0-be06-4a05-a52b-1da14b144504",
        "work_session_id": "351f1964-ea3e-494a-8b22-7841eb0bbb64"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T10:21:32Z",
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

`POST /api/admin/v1/driver-risk-flags/3ecb4f78-c50e-439d-bc47-668c70448b11/confirm` → **200**

```json
{
  "command_id": "214f44ea-82aa-4553-ac18-a6e78903ce12",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "3ecb4f78-c50e-439d-bc47-668c70448b11",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T10:21:32Z",
    "track_point_id": "021234c0-be06-4a05-a52b-1da14b144504",
    "work_session_id": "351f1964-ea3e-494a-8b22-7841eb0bbb64"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T10:21:32Z",
  "reason": null,
  "reviewed_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "reviewed_at": "2026-10-30T10:21:34.4592Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/3ecb4f78-c50e-439d-bc47-668c70448b11/dismiss` → **409**

```json
{
  "command_id": "e041b421-5710-49de-8f0b-06d51044ab0b",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/3ecb4f78-c50e-439d-bc47-668c70448b11/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d3ea3e7e-f53d-4d8b-991b-c3ab310afde3"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "7dd96eac-0259-4c7f-89f5-03ef394036f6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "8e8031d0-71df-4056-8463-05efb78f115c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "raised_at": "2026-10-30T10:21:34.841033Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/8e8031d0-71df-4056-8463-05efb78f115c/dismiss` → **200**

```json
{
  "command_id": "7398439f-f9e0-46dd-84b2-7395ddfc172c",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "8e8031d0-71df-4056-8463-05efb78f115c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "raised_at": "2026-10-30T10:21:34.841033Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "reviewed_at": "2026-10-30T10:21:35.033734Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "1d0398bb-66c5-482d-a847-6eec7dc4fd62",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "3ecb4f78-c50e-439d-bc47-668c70448b11"
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
      "actor_id": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T10:21:35.233978Z"
    }
  ]
}
```

Done: flag 3ecb4f78-c50e-439d-bc47-668c70448b11 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "2ff0aa83-add7-4091-bae9-3aa0ccc6a477",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTY1OTUsImlhdCI6MTc5MzM1NTY5NSwianRpIjoiMGNkM2EwOWQtZmY1My00NmRlLWI5ZGEtYjAxZmI3NjBhMjI0Iiwic2lkIjoiMmZmMGFhODMtYWRkNy00MDkxLWJhZTktM2FhMGNjYzZhNDc3In0._3EOoXNhR3Ncbvi3riHSkxWlbHQTt36SoZj7qUE2OVA",
  "access_expires_at": "2026-10-30T10:36:35.807397814Z",
  "refresh_token": "XMfpSbyWjntCqviRqZjzXQyJJhRC0pDQItmkZpubrtA",
  "refresh_expires_at": "2026-10-30T22:21:35.807050822Z",
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
      "actor_id": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T10:21:35.233978Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "0e66b95c-39e4-47fc-b79a-f75a4baee7dc",
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
  "session_id": "351f1964-ea3e-494a-8b22-7841eb0bbb64",
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
  "last_heartbeat_at": "2026-10-30T10:21:30.044501Z",
  "last_location_at": "2026-10-30T10:21:30.044501Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/351f1964-ea3e-494a-8b22-7841eb0bbb64/close` → **200**

```json
{
  "command_id": "d7095a33-8b64-46d2-95b6-8912c9bfa0be",
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
  "session_id": "2c624ea6-a87a-4389-8017-c21077429240",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTY1OTYsImlhdCI6MTc5MzM1NTY5NiwianRpIjoiM2JjOGM4OTMtMjQ1YS00MmM0LThlNmUtMzAyZmRjODUyZGEzIiwic2lkIjoiMmM2MjRlYTYtYTg3YS00Mzg5LTgwMTctYzIxMDc3NDI5MjQwIn0.Ss0MJ4It51xSfG1tqreGTA2yKtZoFkRrtFqUdBvXuOc",
  "access_expires_at": "2026-10-30T10:36:36.967297737Z",
  "refresh_token": "XMiyGu3RLuiihRJAIKxonweqD-zQ5TWqs6Ten7irVjU",
  "refresh_expires_at": "2026-10-30T22:21:36.966994442Z",
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
  "command_id": "e60b0c00-f793-46a3-86ae-68bbcb30711e",
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
  "changed_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T10:21:37.403765Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "e60b0c00-f793-46a3-86ae-68bbcb30711e",
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
  "changed_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T10:21:37.403765Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48172209421",
  "device_ref": "sandbox-14513"
}
```

```json
{
  "challenge_id": "df7c3e78-3b04-4ec1-b63f-22134c33cca0",
  "expires_at": "2026-10-30T10:26:37.816405187Z",
  "resend_available_at": "2026-10-30T10:21:38.816405187Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48172209421` → **200**

```json
{
  "phone": "+48172209421",
  "audience": "CLIENT",
  "code": "146114",
  "sent_at": "2026-10-30T10:21:37.818525959Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df7c3e78-3b04-4ec1-b63f-22134c33cca0",
  "code": "146114",
  "device_ref": "sandbox-14513"
}
```

```json
{
  "session_id": "a7155da0-205c-40e4-974e-81cecb8d2137",
  "subject": {
    "type": "CLIENT",
    "id": "b6869c34-9084-4c6f-973a-82a3445d5f7d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNjg2OWMzNC05MDg0LTRjNmYtOTczYS04MmEzNDQ1ZDVmN2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2NTk4LCJpYXQiOjE3OTMzNTU2OTgsImp0aSI6IjlkNDc0NGFhLTBjMGItNDFlOC1iYWJiLTg4MjFjNjVmOGE3YSIsInNpZCI6ImE3MTU1ZGEwLTIwNWMtNDBlNC05NzRlLTgxY2VjYjhkMjEzNyJ9.45mrDDq-NyhXQ4OJzcL25JfK42lRFtR3jcwqIrn7kdU",
  "access_expires_at": "2026-10-30T10:36:38.032796284Z",
  "refresh_token": "-awVCi03cE1l4iuz-IM9ykKe6n31cr5n4U4CKpKSUH4",
  "refresh_expires_at": "2026-11-29T10:21:38.032460068Z",
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
  "correlation_id": "6d21136a-f295-47af-a418-502fbf401dcc"
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
  "device_ref": "sandbox-13593"
}
```

```json
{
  "challenge_id": "37989bb1-7821-4ece-b17c-e6bf9050296f",
  "expires_at": "2026-10-30T10:26:38.606852854Z",
  "resend_available_at": "2026-10-30T10:21:39.606852854Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "410817",
  "sent_at": "2026-10-30T10:21:38.60866102Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "37989bb1-7821-4ece-b17c-e6bf9050296f",
  "code": "410817",
  "device_ref": "sandbox-13593"
}
```

```json
{
  "session_id": "21421630-bbb4-4ec2-86e6-a0013dccedcd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NjU5OCwiaWF0IjoxNzkzMzU1Njk4LCJqdGkiOiJlNzNkOGQ2Zi00YjA2LTQ0MDgtOWVmZS0wNjE5MWM0MzljMTEiLCJzaWQiOiIyMTQyMTYzMC1iYmI0LTRlYzItODZlNi1hMDAxM2RjY2VkY2QifQ.Lgj9Mkuft39zdNJBChcsR_kA7Ig-vwb0zok6Jze4DK8",
  "access_expires_at": "2026-10-30T10:36:38.805572723Z",
  "refresh_token": "AigUngW6_zVoIaTK2-dqUw6ouRfWcTk4Lhu7muxO9xo",
  "refresh_expires_at": "2026-11-29T10:21:38.805248037Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "54a0cd1c-8ea3-47fd-8803-e9e98c93f4cb",
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
  "last_heartbeat_at": "2026-10-30T10:20:26.220337Z",
  "last_location_at": "2026-10-30T10:20:26.220337Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/54a0cd1c-8ea3-47fd-8803-e9e98c93f4cb/handover` → **200**

```json
{
  "command_id": "623e6185-62c0-479d-83cc-330ae30848da",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "54a0cd1c-8ea3-47fd-8803-e9e98c93f4cb",
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
  "last_heartbeat_at": "2026-10-30T10:20:26.220337Z",
  "last_location_at": "2026-10-30T10:20:26.220337Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/54a0cd1c-8ea3-47fd-8803-e9e98c93f4cb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:21:39Z",
    "sequence": 1793355699367
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "54a0cd1c-8ea3-47fd-8803-e9e98c93f4cb",
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
  "last_heartbeat_at": "2026-10-30T10:21:39.382286Z",
  "last_location_at": "2026-10-30T10:21:39.382286Z",
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
  "session_id": "54a0cd1c-8ea3-47fd-8803-e9e98c93f4cb",
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
  "last_heartbeat_at": "2026-10-30T10:21:39.382286Z",
  "last_location_at": "2026-10-30T10:21:39.382286Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/54a0cd1c-8ea3-47fd-8803-e9e98c93f4cb/close` → **200**

```json
{
  "command_id": "30724966-c8e8-4eea-88c1-796e4d708fdb",
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
  "correlation_id": "4bf1333c-de92-40ba-9f15-0f86871fce34"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674559038",
  "device_ref": "sandbox-2465"
}
```

```json
{
  "challenge_id": "575074c6-0e5e-4556-b9d4-5a7d63c0a6e0",
  "expires_at": "2026-10-30T10:26:40.324226641Z",
  "resend_available_at": "2026-10-30T10:21:41.324226641Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674559038` → **200**

```json
{
  "phone": "+380674559038",
  "audience": "CLIENT",
  "code": "840255",
  "sent_at": "2026-10-30T10:21:40.325934273Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "575074c6-0e5e-4556-b9d4-5a7d63c0a6e0",
  "code": "840255",
  "device_ref": "sandbox-2465"
}
```

```json
{
  "session_id": "4a62a7b5-941a-4631-9ea9-0760095f77a1",
  "subject": {
    "type": "CLIENT",
    "id": "df7f2fc9-e4f1-44fd-9213-5e3dcc8117c4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZjdmMmZjOS1lNGYxLTQ0ZmQtOTIxMy01ZTNkY2M4MTE3YzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2NjAwLCJpYXQiOjE3OTMzNTU3MDAsImp0aSI6IjI3NDc4ZTg2LWI1OWUtNDhkZS04NDJlLTMwMmQ2OGZjZmVlZCIsInNpZCI6IjRhNjJhN2I1LTk0MWEtNDYzMS05ZWE5LTA3NjAwOTVmNzdhMSJ9.pT8G-EO6eDS5b6B69hzIVjU-jTkt5JC06YCnysFnD-0",
  "access_expires_at": "2026-10-30T10:36:40.520127568Z",
  "refresh_token": "NEr9-srhBUGaXOmirg-FH8VJnwNbmV2Djy9RMMo1wlk",
  "refresh_expires_at": "2026-11-29T10:21:40.519842962Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "0a1a98e3-a5f7-48c9-adac-3e105b3a8173",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "8445c041-705d-48c9-89a4-9c09eeed0f2f",
  "upload_path": "/api/rider/v1/uploads/8445c041-705d-48c9-89a4-9c09eeed0f2f",
  "expires_at": "2026-10-30T10:36:40.709656225Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/8445c041-705d-48c9-89a4-9c09eeed0f2f` → **200**

```json
{
  "file_id": "8445c041-705d-48c9-89a4-9c09eeed0f2f",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "e9fc309a-0bca-42c2-819e-b5b86c0368c9",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "8445c041-705d-48c9-89a4-9c09eeed0f2f"
  ]
}
```

```json
{
  "id": "d2c72fa9-5139-4cf2-9131-6c33e980afa5",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "df7f2fc9-e4f1-44fd-9213-5e3dcc8117c4",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T10:21:40.921023Z",
  "updated_at": "2026-10-30T10:21:40.921023Z",
  "respond_by": "2026-10-30T14:21:40.921023Z",
  "messages": [
    {
      "id": "c5d87d80-8ec9-4bc9-845b-7d53e6bf27c6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "df7f2fc9-e4f1-44fd-9213-5e3dcc8117c4",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T10:21:40.9219Z",
      "attachments": [
        {
          "file_id": "8445c041-705d-48c9-89a4-9c09eeed0f2f",
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
  "session_id": "f62bad09-9e3d-4efe-890a-f3359dac2d33",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTY2MDEsImlhdCI6MTc5MzM1NTcwMSwianRpIjoiN2U0MWI4YTgtN2ExMy00ZDYwLTk3MGMtZmM2NjAyYWUxZGQ1Iiwic2lkIjoiZjYyYmFkMDktOWUzZC00ZWZlLTg5MGEtZjMzNTlkYWMyZDMzIn0.-5ZEif3RXQNSCyHF45kqaI0Ivh_ciPb2EGO_KB3C3aE",
  "access_expires_at": "2026-10-30T10:36:41.310155289Z",
  "refresh_token": "EXK361b5QPHQ0EpnXUKotitD1d_liNdo3b2U10ppE7U",
  "refresh_expires_at": "2026-10-30T22:21:41.309816631Z",
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
  "session_id": "f0dbb4ee-9991-4139-a870-1cb3358e972e",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTY2MDEsImlhdCI6MTc5MzM1NTcwMSwianRpIjoiYTFhNmZlNDEtMGY0Zi00MzY3LWEyODEtYTc2YzM4MGJkNmI0Iiwic2lkIjoiZjBkYmI0ZWUtOTk5MS00MTM5LWE4NzAtMWNiMzM1OGU5NzJlIn0.LEQzLohSY_eUYeE-hYLz6yz8ymEn8HxiRsA8L2sBiHE",
  "access_expires_at": "2026-10-30T10:36:41.683788157Z",
  "refresh_token": "ODsf7I9OqNFxu7wpT6R8Td6G9LaGEP7wap-WNIddQV4",
  "refresh_expires_at": "2026-10-30T22:21:41.683426664Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/d2c72fa9-5139-4cf2-9131-6c33e980afa5/attachments/8445c041-705d-48c9-89a4-9c09eeed0f2f` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "a1927898-8925-4351-bb52-9679dba4e94a",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b87180a9-c1b2-4be0-ade0-b2b07d58fa70",
  "upload_path": "/api/operator/v1/uploads/b87180a9-c1b2-4be0-ade0-b2b07d58fa70",
  "expires_at": "2026-10-30T10:36:41.875344296Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/b87180a9-c1b2-4be0-ade0-b2b07d58fa70` → **200**

```json
{
  "file_id": "b87180a9-c1b2-4be0-ade0-b2b07d58fa70",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/d2c72fa9-5139-4cf2-9131-6c33e980afa5` → **200**

```json
{
  "id": "d2c72fa9-5139-4cf2-9131-6c33e980afa5",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "df7f2fc9-e4f1-44fd-9213-5e3dcc8117c4",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T10:21:40.921023Z",
  "updated_at": "2026-10-30T10:21:40.921023Z",
  "respond_by": "2026-10-30T14:21:40.921023Z",
  "messages": [
    {
      "id": "c5d87d80-8ec9-4bc9-845b-7d53e6bf27c6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "df7f2fc9-e4f1-44fd-9213-5e3dcc8117c4",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T10:21:40.9219Z",
      "attachments": [
        {
          "file_id": "8445c041-705d-48c9-89a4-9c09eeed0f2f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/d2c72fa9-5139-4cf2-9131-6c33e980afa5/comments` → **200**

```json
{
  "command_id": "adcce2b0-72f1-4eab-bebf-9dcd3987ff81",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "b87180a9-c1b2-4be0-ade0-b2b07d58fa70"
  ]
}
```

```json
{
  "id": "d2c72fa9-5139-4cf2-9131-6c33e980afa5",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "df7f2fc9-e4f1-44fd-9213-5e3dcc8117c4",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T10:21:40.921023Z",
  "updated_at": "2026-10-30T10:21:42.268225Z",
  "respond_by": "2026-10-30T14:21:40.921023Z",
  "messages": [
    {
      "id": "c5d87d80-8ec9-4bc9-845b-7d53e6bf27c6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "df7f2fc9-e4f1-44fd-9213-5e3dcc8117c4",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T10:21:40.9219Z",
      "attachments": [
        {
          "file_id": "8445c041-705d-48c9-89a4-9c09eeed0f2f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "b55ac5fe-0614-4e25-bbd0-b26b38fb34ae",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T10:21:42.26776Z",
      "attachments": [
        {
          "file_id": "b87180a9-c1b2-4be0-ade0-b2b07d58fa70",
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

`GET /api/rider/v1/support/cases/d2c72fa9-5139-4cf2-9131-6c33e980afa5` → **200**

```json
{
  "id": "d2c72fa9-5139-4cf2-9131-6c33e980afa5",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "df7f2fc9-e4f1-44fd-9213-5e3dcc8117c4",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T10:21:40.921023Z",
  "updated_at": "2026-10-30T10:21:42.268225Z",
  "respond_by": "2026-10-30T14:21:40.921023Z",
  "messages": [
    {
      "id": "c5d87d80-8ec9-4bc9-845b-7d53e6bf27c6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "df7f2fc9-e4f1-44fd-9213-5e3dcc8117c4",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T10:21:40.9219Z",
      "attachments": [
        {
          "file_id": "8445c041-705d-48c9-89a4-9c09eeed0f2f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "b55ac5fe-0614-4e25-bbd0-b26b38fb34ae",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T10:21:42.26776Z",
      "attachments": [
        {
          "file_id": "b87180a9-c1b2-4be0-ade0-b2b07d58fa70",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/d2c72fa9-5139-4cf2-9131-6c33e980afa5/attachments/b87180a9-c1b2-4be0-ade0-b2b07d58fa70` → **200**

Done: support case d2c72fa9-5139-4cf2-9131-6c33e980afa5, rider attachment 8445c041-705d-48c9-89a4-9c09eeed0f2f, operator attachment b87180a9-c1b2-4be0-ade0-b2b07d58fa70.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730100758",
  "device_ref": "sandbox-31291"
}
```

```json
{
  "challenge_id": "5132df7a-ecd5-4770-ae65-4bc65bcaa60b",
  "expires_at": "2026-10-30T10:26:42.657999228Z",
  "resend_available_at": "2026-10-30T10:21:43.657999228Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730100758` → **200**

```json
{
  "phone": "+380730100758",
  "audience": "CLIENT",
  "code": "767163",
  "sent_at": "2026-10-30T10:21:42.659755084Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5132df7a-ecd5-4770-ae65-4bc65bcaa60b",
  "code": "767163",
  "device_ref": "sandbox-31291"
}
```

```json
{
  "session_id": "2e9a5094-5146-4cb7-bc55-92499f797b65",
  "subject": {
    "type": "CLIENT",
    "id": "d558e0af-0c8d-4b4e-a6fa-f101de401bf2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTU4ZTBhZi0wYzhkLTRiNGUtYTZmYS1mMTAxZGU0MDFiZjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2NjAyLCJpYXQiOjE3OTMzNTU3MDIsImp0aSI6IjRiMTU1YWMwLWVhZDAtNGExNy05ZWZiLTczOWZjZTg0NDUyMCIsInNpZCI6IjJlOWE1MDk0LTUxNDYtNGNiNy1iYzU1LTkyNDk5Zjc5N2I2NSJ9.WfdM5t93cRz7yS8G-pXZdN-zTjJ2hd3OlH8KxBoy460",
  "access_expires_at": "2026-10-30T10:36:42.856594277Z",
  "refresh_token": "Rd-gEaAe7Fnmr_YwX5cyuZEcf5PVVTrfbysgBAAhAEE",
  "refresh_expires_at": "2026-11-29T10:21:42.856216022Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "225df585-b1cb-42ef-9442-21fabdb3736d",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "fc75a1f8-aaaf-4471-aff4-f054cf23c57f",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-fc75a1f8-aaaf-4471-aff4-f054cf23c57f",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "115c70c701770d0c58cf47e8b2e27bb3",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=fc75a1f8-aaaf-4471-aff4-f054cf23c57f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730100758"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=fc75a1f8-aaaf-4471-aff4-f054cf23c57f",
  "expires_at": "2026-10-30T10:51:43.048864Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/fc75a1f8-aaaf-4471-aff4-f054cf23c57f` → **200**

```json
{
  "id": "fc75a1f8-aaaf-4471-aff4-f054cf23c57f",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:51:43.048864Z",
  "card": {
    "id": "aa46b1d1-3ba3-4e9b-a174-5f4867f8f59a",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4714",
    "card_type": "Visa",
    "created_at": "2026-10-30T10:21:43.230369Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ed436c79-33a1-46d2-b226-a97e32581531",
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
  "id": "db1d7fb4-9a8e-48fa-9c8d-036359942860",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:26:43.431959Z",
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
  "command_id": "f4771080-4b8b-4456-80d4-2ace2eb09dcf",
  "quote_id": "db1d7fb4-9a8e-48fa-9c8d-036359942860",
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
  "id": "c2065cb2-6231-44b6-8bed-e17822963271",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d558e0af-0c8d-4b4e-a6fa-f101de401bf2",
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
  "created_at": "2026-10-30T10:21:43.623675Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2065cb2-6231-44b6-8bed-e17822963271` → **200**

```json
{
  "id": "c2065cb2-6231-44b6-8bed-e17822963271",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d558e0af-0c8d-4b4e-a6fa-f101de401bf2",
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
  "created_at": "2026-10-30T10:21:43.623675Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2065cb2-6231-44b6-8bed-e17822963271` → **200**

```json
{
  "id": "c2065cb2-6231-44b6-8bed-e17822963271",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d558e0af-0c8d-4b4e-a6fa-f101de401bf2",
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
  "created_at": "2026-10-30T10:21:43.623675Z",
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

`GET /api/rider/v1/orders/c2065cb2-6231-44b6-8bed-e17822963271` → **200**

```json
{
  "id": "c2065cb2-6231-44b6-8bed-e17822963271",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d558e0af-0c8d-4b4e-a6fa-f101de401bf2",
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
  "created_at": "2026-10-30T10:21:43.623675Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c2065cb2-6231-44b6-8bed-e17822963271/switch-to-cash` → **200**

```json
{
  "command_id": "bfbb76d9-1434-43fc-8910-7f054b1345da",
  "expected_version": 3
}
```

```json
{
  "id": "c2065cb2-6231-44b6-8bed-e17822963271",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "d558e0af-0c8d-4b4e-a6fa-f101de401bf2",
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
  "created_at": "2026-10-30T10:21:43.623675Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c2065cb2-6231-44b6-8bed-e17822963271/switch-to-cash` → **409**

```json
{
  "command_id": "1f642cef-a5e1-47f3-a894-0fd9cd2691a0",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/c2065cb2-6231-44b6-8bed-e17822963271/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2609dedc-8bb7-41fc-8609-04257344f7f4"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/c2065cb2-6231-44b6-8bed-e17822963271` → **200**

```json
{
  "id": "c2065cb2-6231-44b6-8bed-e17822963271",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "d558e0af-0c8d-4b4e-a6fa-f101de401bf2",
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
  "created_at": "2026-10-30T10:21:43.623675Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c2065cb2-6231-44b6-8bed-e17822963271/cancel` → **200**

```json
{
  "command_id": "1a0a0292-7dd8-4d10-b995-94a53bb08cf2",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c2065cb2-6231-44b6-8bed-e17822963271",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "d558e0af-0c8d-4b4e-a6fa-f101de401bf2",
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
  "created_at": "2026-10-30T10:21:43.623675Z",
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
  "session_id": "4858b22d-69d6-43f6-84be-8dbad1dc2984",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTY2MDYsImlhdCI6MTc5MzM1NTcwNiwianRpIjoiMGZhYjk1ZmItZWY4ZS00NzRhLWFmMjctZWEwZWFmNmM2MWZmIiwic2lkIjoiNDg1OGIyMmQtNjlkNi00M2Y2LTg0YmUtOGRiYWQxZGMyOTg0In0.34A42MLOFTAZJuzxqSZSh9e41suvYMTLD-iWm9glZ_I",
  "access_expires_at": "2026-10-30T10:36:46.316316409Z",
  "refresh_token": "yzFR6KGXG3Ypk63N8IFRKFoGOmmymNOpsrUudHY8z4E",
  "refresh_expires_at": "2026-10-30T22:21:46.315919682Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-5097"
}
```

```json
{
  "challenge_id": "927d3861-5f11-4175-9a2d-4bdf21fea2ea",
  "expires_at": "2026-10-30T10:26:46.494744334Z",
  "resend_available_at": "2026-10-30T10:21:47.494744334Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "973366",
  "sent_at": "2026-10-30T10:21:46.496576356Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "927d3861-5f11-4175-9a2d-4bdf21fea2ea",
  "code": "973366",
  "device_ref": "sandbox-5097"
}
```

```json
{
  "session_id": "68d76d20-5ad5-4ef6-98e2-4968adcdf149",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NjYwNiwiaWF0IjoxNzkzMzU1NzA2LCJqdGkiOiI2ZjIzOGE0Mi0zYzZjLTRmZmEtODU4Mi03ZTY2N2U2NDRjOGUiLCJzaWQiOiI2OGQ3NmQyMC01YWQ1LTRlZjYtOThlMi00OTY4YWRjZGYxNDkifQ.CmAVblSC-lOKDEqEgSLURrE90MGTFZfE0QTtips5eA4",
  "access_expires_at": "2026-10-30T10:36:46.698601019Z",
  "refresh_token": "wH9j93ADrXcLqVBt7aGU7MQSCmT0i0zDz89Dl9GRzFE",
  "refresh_expires_at": "2026-11-29T10:21:46.69825931Z",
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
      "actor_id": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T10:21:35.233978Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T10:21:36.181882Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "cb38b5d6-b045-4dae-8f4f-f1b50e61efb2",
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
  "device_ref": "sandbox-32663"
}
```

```json
{
  "challenge_id": "e2237303-e8fd-4b5e-9b88-b76adb65c97f",
  "expires_at": "2026-10-30T10:26:47.421949093Z",
  "resend_available_at": "2026-10-30T10:21:48.421949093Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "500389",
  "sent_at": "2026-10-30T10:21:47.423851032Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2237303-e8fd-4b5e-9b88-b76adb65c97f",
  "code": "500389",
  "device_ref": "sandbox-32663"
}
```

```json
{
  "session_id": "443530bb-e80c-4618-8d74-f4f01b8bce1c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NjYwNywiaWF0IjoxNzkzMzU1NzA3LCJqdGkiOiJlNzkzOGM5Zi1mNjVmLTRkNjItOGU5Yi1iMWM0ZTk3Yjg2NGEiLCJzaWQiOiI0NDM1MzBiYi1lODBjLTQ2MTgtOGQ3NC1mNGYwMWI4YmNlMWMifQ.eDqMFkzoy04aUQaSQhy0mqnZQT3zi6D49Y88OEQ_wl8",
  "access_expires_at": "2026-10-30T10:36:47.634576161Z",
  "refresh_token": "24KgrrjqVHIDFFeBFb-t9DYXb6xoISP8dmuAfJfEVzQ",
  "refresh_expires_at": "2026-11-29T10:21:47.63420684Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4091cbf-a781-41d9-92c4-a2ca69779409",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T10:21:19.931537Z",
  "last_location_at": "2026-10-30T10:21:19.931537Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b4091cbf-a781-41d9-92c4-a2ca69779409/handover` → **200**

```json
{
  "command_id": "68b41e14-936f-4632-a477-6b30c8620c00",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4091cbf-a781-41d9-92c4-a2ca69779409",
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
  "last_heartbeat_at": "2026-10-30T10:21:19.931537Z",
  "last_location_at": "2026-10-30T10:21:19.931537Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

(the car drives 20 s to the next point)

`POST /api/driver/v1/work-sessions/b4091cbf-a781-41d9-92c4-a2ca69779409/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:22:08Z",
    "sequence": 1793355728199
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4091cbf-a781-41d9-92c4-a2ca69779409",
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
  "last_heartbeat_at": "2026-10-30T10:22:08.214829Z",
  "last_location_at": "2026-10-30T10:22:08.214829Z",
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
  "command_id": "c42091d6-ea86-4c82-bb9a-b723ee796779",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:22:08Z",
    "sequence": 1793355728595
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c3a6323f-c02d-4c82-bf04-757426b88fc8",
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
  "last_heartbeat_at": "2026-10-30T10:22:08.609935Z",
  "last_location_at": "2026-10-30T10:22:08.609935Z",
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
  "session_id": "ac6988f7-5e02-4ff0-a767-35b57c547731",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTY2MjgsImlhdCI6MTc5MzM1NTcyOCwianRpIjoiYmZjZmQ5OGUtODIwMC00Y2JlLWFmZjYtOGFhNzhjOTAyMzVhIiwic2lkIjoiYWM2OTg4ZjctNWUwMi00ZmYwLWE3NjctMzViNTdjNTQ3NzMxIn0.caO5dGpQIt7DkAz5sGwnolCzinu85ueoywRrgitFl78",
  "access_expires_at": "2026-10-30T10:37:08.995868565Z",
  "refresh_token": "MEXHLkF_6l8jU9XC6OjtH1tNWriexezlbwLgcd4DQ6o",
  "refresh_expires_at": "2026-10-30T22:22:08.995554856Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "aee38648-eed8-4b5d-9d75-de73883fa918",
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
  "id": "78343a00-f880-4355-8c4c-066dfbd07ec4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:27:09.180016Z",
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
  "command_id": "61b3452f-f701-458d-b269-3e571aaec861",
  "quote_id": "78343a00-f880-4355-8c4c-066dfbd07ec4",
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
  "id": "54751136-f835-4da4-9a6f-a788edb6cf2e",
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
  "created_at": "2026-10-30T10:22:09.365736Z",
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
    "id": "463bde74-acdc-45ee-90b3-600dd49cfed1",
    "order_id": "54751136-f835-4da4-9a6f-a788edb6cf2e",
    "expires_at": "2026-10-30T10:22:24.368146Z",
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

`POST /api/driver/v1/offers/463bde74-acdc-45ee-90b3-600dd49cfed1/accept` → **200**

```json
{
  "command_id": "9c4caa13-5373-48d5-8ef7-c2d60295d320"
}
```

```json
{
  "id": "73e93db4-30a7-400f-b879-63a8bd245940",
  "order_id": "54751136-f835-4da4-9a6f-a788edb6cf2e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5e0fec27-6bec-4407-ac1d-4f1d2ece4bac",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5e0fec27-6bec-4407-ac1d-4f1d2ece4bac",
  "order_id": "54751136-f835-4da4-9a6f-a788edb6cf2e",
  "assignment_id": "73e93db4-30a7-400f-b879-63a8bd245940",
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

(the car drives 10 s to the next point)

`POST /api/driver/v1/work-sessions/c3a6323f-c02d-4c82-bf04-757426b88fc8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:22:20Z",
    "sequence": 1793355740269
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c3a6323f-c02d-4c82-bf04-757426b88fc8",
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
  "last_heartbeat_at": "2026-10-30T10:22:20.283569Z",
  "last_location_at": "2026-10-30T10:22:20.283569Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/5e0fec27-6bec-4407-ac1d-4f1d2ece4bac/arrive` → **200**

```json
{
  "command_id": "a08ae93d-3922-41ad-93d8-1e917faeb7fe",
  "expected_version": 0
}
```

```json
{
  "id": "5e0fec27-6bec-4407-ac1d-4f1d2ece4bac",
  "order_id": "54751136-f835-4da4-9a6f-a788edb6cf2e",
  "assignment_id": "73e93db4-30a7-400f-b879-63a8bd245940",
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
  "arrived_at": "2026-10-30T10:22:20.473126Z",
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

`POST /api/driver/v1/trips/5e0fec27-6bec-4407-ac1d-4f1d2ece4bac/start` → **200**

```json
{
  "command_id": "cf1b9ac0-37eb-4fa0-8060-5e76fbd54cea",
  "expected_version": 1
}
```

```json
{
  "id": "5e0fec27-6bec-4407-ac1d-4f1d2ece4bac",
  "order_id": "54751136-f835-4da4-9a6f-a788edb6cf2e",
  "assignment_id": "73e93db4-30a7-400f-b879-63a8bd245940",
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
  "arrived_at": "2026-10-30T10:22:20.473126Z",
  "started_at": "2026-10-30T10:22:20.668494Z",
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

`POST /api/driver/v1/trips/5e0fec27-6bec-4407-ac1d-4f1d2ece4bac/complete` → **200**

```json
{
  "command_id": "8a669c4a-5af3-47a1-8a40-574680bc811d",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:22:20Z",
  "cash_received": true
}
```

```json
{
  "id": "5e0fec27-6bec-4407-ac1d-4f1d2ece4bac",
  "order_id": "54751136-f835-4da4-9a6f-a788edb6cf2e",
  "assignment_id": "73e93db4-30a7-400f-b879-63a8bd245940",
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
  "arrived_at": "2026-10-30T10:22:20.473126Z",
  "started_at": "2026-10-30T10:22:20.668494Z",
  "completed_at": "2026-10-30T10:22:20.867392Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/54751136-f835-4da4-9a6f-a788edb6cf2e` → **200**

```json
{
  "id": "54751136-f835-4da4-9a6f-a788edb6cf2e",
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
    "id": "73e93db4-30a7-400f-b879-63a8bd245940",
    "order_id": "54751136-f835-4da4-9a6f-a788edb6cf2e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5e0fec27-6bec-4407-ac1d-4f1d2ece4bac",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:22:09.365736Z",
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
  "session_id": "b4091cbf-a781-41d9-92c4-a2ca69779409",
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
  "last_heartbeat_at": "2026-10-30T10:22:08.214829Z",
  "last_location_at": "2026-10-30T10:22:08.214829Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b4091cbf-a781-41d9-92c4-a2ca69779409/close` → **200**

```json
{
  "command_id": "2ff8a3c0-6b75-40b4-b5c8-d91ddc95188b",
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
  "session_id": "c3a6323f-c02d-4c82-bf04-757426b88fc8",
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
  "last_heartbeat_at": "2026-10-30T10:22:20.283569Z",
  "last_location_at": "2026-10-30T10:22:20.283569Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c3a6323f-c02d-4c82-bf04-757426b88fc8/close` → **200**

```json
{
  "command_id": "bc1c2144-3a58-4559-93bd-76b67f43fa60",
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

Done: terminal order 54751136-f835-4da4-9a6f-a788edb6cf2e by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18756"
}
```

```json
{
  "challenge_id": "61764abc-8b35-4cea-b56b-9a12b4de2b3c",
  "expires_at": "2026-10-30T10:27:25.243860723Z",
  "resend_available_at": "2026-10-30T10:22:26.243860723Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "165024",
  "sent_at": "2026-10-30T10:22:25.247030648Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "61764abc-8b35-4cea-b56b-9a12b4de2b3c",
  "code": "165024",
  "device_ref": "sandbox-18756"
}
```

```json
{
  "session_id": "f6040196-2cfd-4c8e-9085-e96286f57390",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NjY0NSwiaWF0IjoxNzkzMzU1NzQ1LCJqdGkiOiJhOGM2NzAwOC04MGEwLTRjZmQtYjRiMy0zYTI2M2NmZWUyN2MiLCJzaWQiOiJmNjA0MDE5Ni0yY2ZkLTRjOGUtOTA4NS1lOTYyODZmNTczOTAifQ.gQhYCjmuIHNfHaxM4Kh7Pts1L1J4DJ3lWVIZnuh1dE0",
  "access_expires_at": "2026-10-30T10:37:25.450841323Z",
  "refresh_token": "s0PDwo6PswoWJ6RvPgr25lFZdGNv5X_Oyk0eSjTBSkA",
  "refresh_expires_at": "2026-11-29T10:22:25.450458175Z",
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
  "device_ref": "sandbox-2148"
}
```

```json
{
  "challenge_id": "f74875ea-a0e4-41d0-9de8-81ce615e6c4d",
  "expires_at": "2026-10-30T10:27:25.808885814Z",
  "resend_available_at": "2026-10-30T10:22:26.808885814Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "374433",
  "sent_at": "2026-10-30T10:22:25.810686585Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f74875ea-a0e4-41d0-9de8-81ce615e6c4d",
  "code": "374433",
  "device_ref": "sandbox-2148"
}
```

```json
{
  "session_id": "e3b9638d-0932-4721-83e0-08be6b3ba046",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NjY0NiwiaWF0IjoxNzkzMzU1NzQ2LCJqdGkiOiJkNWU5NmRhOS1mZDc1LTQ0YzAtODk0MS0zMDgwMzAwNDlhZGYiLCJzaWQiOiJlM2I5NjM4ZC0wOTMyLTQ3MjEtODNlMC0wOGJlNmIzYmEwNDYifQ.j0IziVF5JwQ9if-i349p2DCHzr_AhwwNSt4yaEeGnBo",
  "access_expires_at": "2026-10-30T10:37:26.018281855Z",
  "refresh_token": "Unq8suWZi9QQgUDhVnYFlBChxQ0JsTVaahA7EQddxM0",
  "refresh_expires_at": "2026-11-29T10:22:26.017830529Z",
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
  "device_ref": "sandbox-19565"
}
```

```json
{
  "challenge_id": "257fa921-572b-424c-9c92-f0b14e435ae2",
  "expires_at": "2026-10-30T10:27:26.382054156Z",
  "resend_available_at": "2026-10-30T10:22:27.382054156Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "949381",
  "sent_at": "2026-10-30T10:22:26.383836329Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "257fa921-572b-424c-9c92-f0b14e435ae2",
  "code": "949381",
  "device_ref": "sandbox-19565"
}
```

```json
{
  "session_id": "fdf8213a-fcce-4977-8da2-2724874e0edf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NjY0NiwiaWF0IjoxNzkzMzU1NzQ2LCJqdGkiOiI5YjVkZTAxZC1mMzIzLTQxM2ItOTRmZi05ZGVkZjAzYjFhNjciLCJzaWQiOiJmZGY4MjEzYS1mY2NlLTQ5NzctOGRhMi0yNzI0ODc0ZTBlZGYifQ.0N4qLVNVLn_s4J8nWK7q644BNJxDJ2XhoappYQkr1WQ",
  "access_expires_at": "2026-10-30T10:37:26.595574109Z",
  "refresh_token": "1RkJTc5airN8HH8KeiMYwmxkQgE4cQlCVu8nI4I-EJs",
  "refresh_expires_at": "2026-11-29T10:22:26.595187099Z",
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
  "phone": "+380692777531",
  "device_ref": "sandbox-19924"
}
```

```json
{
  "challenge_id": "51f3dc4c-ef5c-4136-826d-aae52a15a003",
  "expires_at": "2026-10-30T10:27:26.953275412Z",
  "resend_available_at": "2026-10-30T10:22:27.953275412Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380692777531` → **200**

```json
{
  "phone": "+380692777531",
  "audience": "CLIENT",
  "code": "968509",
  "sent_at": "2026-10-30T10:22:26.955003963Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "51f3dc4c-ef5c-4136-826d-aae52a15a003",
  "code": "968509",
  "device_ref": "sandbox-19924"
}
```

```json
{
  "session_id": "8ddcbff3-a52f-47c5-a5a2-bfa7d767b937",
  "subject": {
    "type": "CLIENT",
    "id": "68f959c9-4636-4a18-90f1-a83961e464c8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OGY5NTljOS00NjM2LTRhMTgtOTBmMS1hODM5NjFlNDY0YzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU2NjQ3LCJpYXQiOjE3OTMzNTU3NDcsImp0aSI6IjY0MDBmNDAxLTBjOGEtNDExYy05YmQwLWJhMzdlMzFkNGE5OSIsInNpZCI6IjhkZGNiZmYzLWE1MmYtNDdjNS1hNWEyLWJmYTdkNzY3YjkzNyJ9.xxbmtWrnJBT5nPlePJCdFcP3DTL780R6msywpF2q9H0",
  "access_expires_at": "2026-10-30T10:37:27.15562372Z",
  "refresh_token": "D1ckBDMDYev3dxteVMF_lSMJAk_AHTLR0xVVXDtZ1s4",
  "refresh_expires_at": "2026-11-29T10:22:27.155302841Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a9947702-90c2-456d-a7ea-ff47983782fb",
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
  "id": "480ae425-2a57-4a9f-b6b2-35ba415b641d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:27:27.343525Z",
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
  "command_id": "3cde0572-5115-431b-b60a-c1b80303edb4",
  "quote_id": "480ae425-2a57-4a9f-b6b2-35ba415b641d",
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
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:22:27.538686Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:22:27.538686Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 7.870025013
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 10.572033903
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 6.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.11825684
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

`GET /api/rider/v1/orders/2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8` → **200**

```json
{
  "id": "2f9c0c56-68d8-4f0d-b4e8-32e97c5cbaf8",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "68f959c9-4636-4a18-90f1-a83961e464c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:22:27.538686Z",
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
  "session_id": "3e7aed49-1122-4411-8df7-4b3bc1e0316e",
  "subject": {
    "type": "STAFF",
    "id": "fc83930a-0f00-4627-8f4f-e260893ced8f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgzOTMwYS0wZjAwLTQ2MjctOGY0Zi1lMjYwODkzY2VkOGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTY4MzAsImlhdCI6MTc5MzM1NTkzMCwianRpIjoiOTI4ODA3NGYtOWI0Mi00MDA4LWI5ZjAtNjdjNzcyN2QwYTQyIiwic2lkIjoiM2U3YWVkNDktMTEyMi00NDExLThkZjctNGIzYmMxZTAzMTZlIn0.rRPmwuqcAHT-yN3GV39MN8GcBWG2U3OzjOyCCI69bsE",
  "access_expires_at": "2026-10-30T10:40:30.1958213Z",
  "refresh_token": "ZwmPiiF9-V2MJZsvAa2KnlbrrS8h8fSGMWWGyQAkHA4",
  "refresh_expires_at": "2026-10-30T22:25:30.195339771Z",
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
  "id": "9f1c56dc-8d1d-404f-b9d6-b6a10ad4d1a2",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:25:30.391434Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:25:30.391476Z",
  "updated_at": "2026-10-30T10:25:30.403471Z",
  "finished_at": "2026-10-30T10:25:30.403471Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/9f1c56dc-8d1d-404f-b9d6-b6a10ad4d1a2` → **200**

```json
{
  "run": {
    "id": "9f1c56dc-8d1d-404f-b9d6-b6a10ad4d1a2",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T10:25:30.391434Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T10:25:30.391476Z",
    "updated_at": "2026-10-30T10:25:30.403471Z",
    "finished_at": "2026-10-30T10:25:30.403471Z",
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
  "id": "9f1c56dc-8d1d-404f-b9d6-b6a10ad4d1a2",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:25:30.391434Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:25:30.391476Z",
  "updated_at": "2026-10-30T10:25:30.403471Z",
  "finished_at": "2026-10-30T10:25:30.403471Z",
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
  "id": "9f1c56dc-8d1d-404f-b9d6-b6a10ad4d1a2",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:25:30.391434Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:25:30.391476Z",
  "updated_at": "2026-10-30T10:25:30.403471Z",
  "finished_at": "2026-10-30T10:25:30.403471Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/a6edb0a6-db1d-41e9-944b-48453f38d6ca` → **204**

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
  "id": "c682b3dd-4462-4539-be6a-9c129f3869f3",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:25:30.708338Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:25:30.708382Z",
  "updated_at": "2026-10-30T10:25:30.714099Z",
  "finished_at": "2026-10-30T10:25:30.714099Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/c682b3dd-4462-4539-be6a-9c129f3869f3` → **200**

```json
{
  "run": {
    "id": "c682b3dd-4462-4539-be6a-9c129f3869f3",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T10:25:30.708338Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T10:25:30.708382Z",
    "updated_at": "2026-10-30T10:25:30.714099Z",
    "finished_at": "2026-10-30T10:25:30.714099Z",
    "version": 1
  },
  "items": [
    {
      "id": "735e57b6-ee5f-4443-96ab-73fce8ee17e1",
      "run_id": "c682b3dd-4462-4539-be6a-9c129f3869f3",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "5f604907f87f7bad5bf9b86d33e33d904b2a2b43bfb6fdebf5d589f7b620abeb",
      "reference_display": "sandbox-reconciliation-a6edb0a6-db1d-41e9-944b-#####f38d6ca",
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
      "provider_at": "2026-10-30T10:25:30Z",
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
  "id": "c682b3dd-4462-4539-be6a-9c129f3869f3",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:25:30.708338Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:25:30.708382Z",
  "updated_at": "2026-10-30T10:25:30.714099Z",
  "finished_at": "2026-10-30T10:25:30.714099Z",
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
  "id": "c682b3dd-4462-4539-be6a-9c129f3869f3",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:25:30.708338Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:25:30.708382Z",
  "updated_at": "2026-10-30T10:25:30.714099Z",
  "finished_at": "2026-10-30T10:25:30.714099Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/735e57b6-ee5f-4443-96ab-73fce8ee17e1/resolve` → **200**

```json
{
  "command_id": "b622cbbb-6b2b-4439-98f2-85c4a312035c",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "735e57b6-ee5f-4443-96ab-73fce8ee17e1",
  "run_id": "c682b3dd-4462-4539-be6a-9c129f3869f3",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "5f604907f87f7bad5bf9b86d33e33d904b2a2b43bfb6fdebf5d589f7b620abeb",
  "reference_display": "sandbox-reconciliation-a6edb0a6-db1d-41e9-944b-#####f38d6ca",
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
  "provider_at": "2026-10-30T10:25:30Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "resolved_at": "2026-10-30T10:25:31.009412Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/735e57b6-ee5f-4443-96ab-73fce8ee17e1/resolve` → **200**

```json
{
  "command_id": "b622cbbb-6b2b-4439-98f2-85c4a312035c",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "735e57b6-ee5f-4443-96ab-73fce8ee17e1",
  "run_id": "c682b3dd-4462-4539-be6a-9c129f3869f3",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "5f604907f87f7bad5bf9b86d33e33d904b2a2b43bfb6fdebf5d589f7b620abeb",
  "reference_display": "sandbox-reconciliation-a6edb0a6-db1d-41e9-944b-#####f38d6ca",
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
  "provider_at": "2026-10-30T10:25:30Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
  "resolved_at": "2026-10-30T10:25:31.009412Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/735e57b6-ee5f-4443-96ab-73fce8ee17e1/resolve` → **409**

```json
{
  "command_id": "3b17098a-890c-40f4-adec-d2d5a03fb953",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/735e57b6-ee5f-4443-96ab-73fce8ee17e1/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8be09db4-8aef-404d-a465-baeb60765d92"
}
```

`GET /api/admin/v1/payment-reconciliations/c682b3dd-4462-4539-be6a-9c129f3869f3` → **200**

```json
{
  "run": {
    "id": "c682b3dd-4462-4539-be6a-9c129f3869f3",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T10:25:30.708338Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T10:25:30.708382Z",
    "updated_at": "2026-10-30T10:25:31.009412Z",
    "finished_at": "2026-10-30T10:25:30.714099Z",
    "version": 2
  },
  "items": [
    {
      "id": "735e57b6-ee5f-4443-96ab-73fce8ee17e1",
      "run_id": "c682b3dd-4462-4539-be6a-9c129f3869f3",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "5f604907f87f7bad5bf9b86d33e33d904b2a2b43bfb6fdebf5d589f7b620abeb",
      "reference_display": "sandbox-reconciliation-a6edb0a6-db1d-41e9-944b-#####f38d6ca",
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
      "provider_at": "2026-10-30T10:25:30Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "fc83930a-0f00-4627-8f4f-e260893ced8f",
      "resolved_at": "2026-10-30T10:25:31.009412Z",
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
      "id": "c682b3dd-4462-4539-be6a-9c129f3869f3",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T10:25:30.708338Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T10:25:30.708382Z",
      "updated_at": "2026-10-30T10:25:31.009412Z",
      "finished_at": "2026-10-30T10:25:30.714099Z",
      "version": 2
    },
    {
      "id": "28edf76d-1a93-492c-a70b-2cf2ed574ed8",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T10:07:07.965441Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T10:07:07.965516Z",
      "updated_at": "2026-10-30T10:07:07.969943Z",
      "finished_at": "2026-10-30T10:07:07.969943Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/a6edb0a6-db1d-41e9-944b-48453f38d6ca` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "c682b3dd-4462-4539-be6a-9c129f3869f3",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:25:30.708338Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:25:30.708382Z",
  "updated_at": "2026-10-30T10:25:31.009412Z",
  "finished_at": "2026-10-30T10:25:30.714099Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793356058271E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793356053523E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793356053523E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793356058272E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793356053523E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
