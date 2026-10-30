# Sandbox transcript (2026-10-30T09:44:36Z, fdb223c)

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
  "correlation_id": "c971514d-a7f9-4b11-b388-3d77e0745701"
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
  "session_id": "bac98a19-f580-4f91-9525-d6c9185ead48",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQzODMsImlhdCI6MTc5MzM1MzQ4MywianRpIjoiMDg2MGEyNTgtMDliYy00MGVlLWJlMDEtZTFmMDA1ODJkMTczIiwic2lkIjoiYmFjOThhMTktZjU4MC00ZjkxLTk1MjUtZDZjOTE4NWVhZDQ4In0.JtzZmirqc7DyrgjENOPAUZGZjmI6OihTeB_AGEY7IgU",
  "access_expires_at": "2026-10-30T09:59:43.926930313Z",
  "refresh_token": "8MqUNfop8Q_CzH0cpDkDRil1JbQdB533t88Proq0jmk",
  "refresh_expires_at": "2026-10-30T21:44:43.923714923Z",
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
  "session_id": "be1b7b54-352c-4c0f-a055-d9a55c4c8838",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQzODUsImlhdCI6MTc5MzM1MzQ4NSwianRpIjoiYThjNzhmNDEtMGFjOS00NzMyLThhNTEtMTJjMWUwMTIzYzc1Iiwic2lkIjoiYmUxYjdiNTQtMzUyYy00YzBmLWEwNTUtZDlhNTVjNGM4ODM4In0.wYB4h-X5YIKYIyejs4Kb2mckNv1NePFxyR8Lnx4NdMU",
  "access_expires_at": "2026-10-30T09:59:45.815405961Z",
  "refresh_token": "w4_M4rCcWiTGh8Zkqbc96wdSUZpjASJc_1rP-hauYlY",
  "refresh_expires_at": "2026-10-30T21:44:45.814343989Z",
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
  "device_ref": "sandbox-17486"
}
```

```json
{
  "challenge_id": "a16f0eaa-e6cd-44a0-a1d6-2593b0f72aa9",
  "expires_at": "2026-10-30T09:49:46.457475697Z",
  "resend_available_at": "2026-10-30T09:44:47.457475697Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "009257",
  "sent_at": "2026-10-30T09:44:46.476048491Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a16f0eaa-e6cd-44a0-a1d6-2593b0f72aa9",
  "code": "009257",
  "device_ref": "sandbox-17486"
}
```

```json
{
  "session_id": "0e0ad3b8-def9-4210-9860-67f86acc104b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDM4NiwiaWF0IjoxNzkzMzUzNDg2LCJqdGkiOiIxOTA5MTc5ZC00OWQxLTQ2YTMtODRkNy02MDU3MjhiMjgyZWQiLCJzaWQiOiIwZTBhZDNiOC1kZWY5LTQyMTAtOTg2MC02N2Y4NmFjYzEwNGIifQ.A71GsvYFL7322gBVCydqFqmTNGEDFiVio7IPasfTw9I",
  "access_expires_at": "2026-10-30T09:59:46.837822664Z",
  "refresh_token": "xAbUwgelB9vNeI8IL6LrxD5sNWB7GTrvniJ5SCmYKys",
  "refresh_expires_at": "2026-11-29T09:44:46.836826296Z",
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
  "command_id": "71aaf473-b4d8-4959-a09f-07cb8006059c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:44:47Z",
    "sequence": 1793353487424
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a6121cfc-c4b1-4220-afa8-91d8eb3ff999",
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
  "last_heartbeat_at": "2026-10-30T09:44:47.52289Z",
  "last_location_at": "2026-10-30T09:44:47.52289Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635125620",
  "device_ref": "sandbox-982"
}
```

```json
{
  "challenge_id": "b320e825-bad1-4018-bd80-134297b00014",
  "expires_at": "2026-10-30T09:49:47.815598343Z",
  "resend_available_at": "2026-10-30T09:44:48.815598343Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635125620` → **200**

```json
{
  "phone": "+380635125620",
  "audience": "CLIENT",
  "code": "605717",
  "sent_at": "2026-10-30T09:44:47.82049166Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b320e825-bad1-4018-bd80-134297b00014",
  "code": "605717",
  "device_ref": "sandbox-982"
}
```

```json
{
  "session_id": "fd2c55bc-1412-4d56-b72c-99ef2dc97ead",
  "subject": {
    "type": "CLIENT",
    "id": "16a2c22b-5f34-40d3-8760-0d927cd8fb08"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNmEyYzIyYi01ZjM0LTQwZDMtODc2MC0wZDkyN2NkOGZiMDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0Mzg4LCJpYXQiOjE3OTMzNTM0ODgsImp0aSI6ImZlY2IzMzJkLWE5OWYtNDcwMS05ZTBjLTA3ZjY3Njk3ZGEyMiIsInNpZCI6ImZkMmM1NWJjLTE0MTItNGQ1Ni1iNzJjLTk5ZWYyZGM5N2VhZCJ9.HZOv_obCQINsDG49nm-jPgxNzGZtXXXvOv80jQX5ULM",
  "access_expires_at": "2026-10-30T09:59:48.138029841Z",
  "refresh_token": "4MiJQvERy35uPPFWKSMiCHAYnZc6X9e67p5pk-El85g",
  "refresh_expires_at": "2026-11-29T09:44:48.137105577Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d7c76983-bd28-4ca3-b449-148ea77b9b76",
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
  "id": "22dd7312-b911-41a9-96d5-23d00ab5f5af",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:49:48.468235Z",
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
  "command_id": "67985450-e38b-448d-8dcf-54da04819e72",
  "quote_id": "22dd7312-b911-41a9-96d5-23d00ab5f5af",
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
  "id": "089e917f-bcf7-4df8-9065-f80f57dcc3d7",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "16a2c22b-5f34-40d3-8760-0d927cd8fb08",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:44:48.878672Z",
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
    "id": "7f455804-7328-4f07-969b-df7b54a1eccc",
    "order_id": "089e917f-bcf7-4df8-9065-f80f57dcc3d7",
    "expires_at": "2026-10-30T09:45:03.887048Z",
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

`POST /api/driver/v1/offers/7f455804-7328-4f07-969b-df7b54a1eccc/accept` → **200**

```json
{
  "command_id": "1ce29401-135a-49db-a90a-84df23e7799e"
}
```

```json
{
  "id": "2288a857-fa6a-404f-8c5b-a3753c08a44d",
  "order_id": "089e917f-bcf7-4df8-9065-f80f57dcc3d7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9c2a6f69-bcf0-41ad-9d09-0174bbf14ca0",
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
  "command_id": "80df13e1-8354-4d32-b345-38e40fdf3874",
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
  "changed_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T09:44:50.153171863Z"
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
  "id": "9c2a6f69-bcf0-41ad-9d09-0174bbf14ca0",
  "order_id": "089e917f-bcf7-4df8-9065-f80f57dcc3d7",
  "assignment_id": "2288a857-fa6a-404f-8c5b-a3753c08a44d",
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

`POST /api/driver/v1/work-sessions/a6121cfc-c4b1-4220-afa8-91d8eb3ff999/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:44:51Z",
    "sequence": 1793353491775
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a6121cfc-c4b1-4220-afa8-91d8eb3ff999",
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
  "last_heartbeat_at": "2026-10-30T09:44:51.103092Z",
  "last_location_at": "2026-10-30T09:44:51.103092Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9c2a6f69-bcf0-41ad-9d09-0174bbf14ca0/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "84d63020-5e7d-482f-9fb6-7c8732d14419",
  "expected_version": 0
}
```

```json
{
  "id": "9c2a6f69-bcf0-41ad-9d09-0174bbf14ca0",
  "order_id": "089e917f-bcf7-4df8-9065-f80f57dcc3d7",
  "assignment_id": "2288a857-fa6a-404f-8c5b-a3753c08a44d",
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
  "arrived_at": "2026-10-30T09:44:51.426132Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9c2a6f69-bcf0-41ad-9d09-0174bbf14ca0/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "1d48a82f-9651-411c-a417-2428e8d1c186",
  "expected_version": 1
}
```

```json
{
  "id": "9c2a6f69-bcf0-41ad-9d09-0174bbf14ca0",
  "order_id": "089e917f-bcf7-4df8-9065-f80f57dcc3d7",
  "assignment_id": "2288a857-fa6a-404f-8c5b-a3753c08a44d",
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
  "arrived_at": "2026-10-30T09:44:51.426132Z",
  "started_at": "2026-10-30T09:44:51.752157Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9c2a6f69-bcf0-41ad-9d09-0174bbf14ca0/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "a681d710-d388-4e43-83fa-0f86b4aa7be5",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:44:52Z",
  "cash_received": true
}
```

```json
{
  "id": "9c2a6f69-bcf0-41ad-9d09-0174bbf14ca0",
  "order_id": "089e917f-bcf7-4df8-9065-f80f57dcc3d7",
  "assignment_id": "2288a857-fa6a-404f-8c5b-a3753c08a44d",
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
  "arrived_at": "2026-10-30T09:44:51.426132Z",
  "started_at": "2026-10-30T09:44:51.752157Z",
  "completed_at": "2026-10-30T09:44:52.076614Z",
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
  "session_id": "a6121cfc-c4b1-4220-afa8-91d8eb3ff999",
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
  "last_heartbeat_at": "2026-10-30T09:44:51.103092Z",
  "last_location_at": "2026-10-30T09:44:51.103092Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a6121cfc-c4b1-4220-afa8-91d8eb3ff999/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "cfcf9dd8-cb91-4b94-b791-8567237e6ade",
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
  "command_id": "bc812523-c189-4105-9dba-7c19739c1d5f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:44:52Z",
    "sequence": 1793353492982
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
  "correlation_id": "183a0a13-1d06-4d14-9072-b45659c6a01b",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "97589fe4-f159-4eca-818d-0036768cb1e7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:44:53Z",
    "sequence": 1793353493310
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "653d9922-7413-45c4-bb9d-fca967822f35",
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
  "last_heartbeat_at": "2026-10-30T09:44:53.332611Z",
  "last_location_at": "2026-10-30T09:44:53.332611Z",
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
  "changed_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T09:44:50.153172Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "aa2fb04f-d259-445f-8de1-669205cb0b78",
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
  "changed_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T09:44:53.952534681Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "653d9922-7413-45c4-bb9d-fca967822f35",
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
  "last_heartbeat_at": "2026-10-30T09:44:53.332611Z",
  "last_location_at": "2026-10-30T09:44:53.332611Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/653d9922-7413-45c4-bb9d-fca967822f35/close` → **200**

```json
{
  "command_id": "16d5c55c-db7e-4cb3-a5a3-7791d6a1f171",
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
  "session_id": "6051ec82-4ff1-4d74-b837-3732a9de0aaf",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQzOTUsImlhdCI6MTc5MzM1MzQ5NSwianRpIjoiYzJkNTA3NDMtMDAxYi00OTZmLTkwNjgtMWQxNjQyNmU3ZDA1Iiwic2lkIjoiNjA1MWVjODItNGZmMS00ZDc0LWI4MzctMzczMmE5ZGUwYWFmIn0.EyP49IwzpLbQfMZifzw8RPWX2dJ1PMr5GSlAuIiWjyY",
  "access_expires_at": "2026-10-30T09:59:55.155693248Z",
  "refresh_token": "NNGfkrvJJQHgkxLaSFHNwZya29mUqw9a1hRShFNVCzc",
  "refresh_expires_at": "2026-10-30T21:44:55.154749688Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "7ee384db-b63d-42a7-b46a-ed05a6956a23",
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
  "id": "f8b11b63-67a9-4090-a4f3-0b24f473a8e4",
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
  "created_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "created_at": "2026-10-30T09:44:55.466393Z",
  "updated_at": "2026-10-30T09:44:55.466393Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636833916",
  "device_ref": "sandbox-19914"
}
```

```json
{
  "challenge_id": "018d6731-df84-412b-9b6c-da21ba0375b4",
  "expires_at": "2026-10-30T09:49:55.778991694Z",
  "resend_available_at": "2026-10-30T09:44:56.778991694Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636833916` → **200**

```json
{
  "phone": "+380636833916",
  "audience": "CLIENT",
  "code": "590852",
  "sent_at": "2026-10-30T09:44:55.78407776Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "018d6731-df84-412b-9b6c-da21ba0375b4",
  "code": "590852",
  "device_ref": "sandbox-19914"
}
```

```json
{
  "session_id": "794ddc5d-0cac-413c-851d-cf51f448bb7a",
  "subject": {
    "type": "CLIENT",
    "id": "d7d426ea-d81c-4538-b6f3-af1c0b7a6159"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkN2Q0MjZlYS1kODFjLTQ1MzgtYjZmMy1hZjFjMGI3YTYxNTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0Mzk2LCJpYXQiOjE3OTMzNTM0OTYsImp0aSI6IjUwNTdjMDgyLWU2ZWItNDkxNC05ZjQyLWYxMjA5MDBhNzJhOSIsInNpZCI6Ijc5NGRkYzVkLTBjYWMtNDEzYy04NTFkLWNmNTFmNDQ4YmI3YSJ9.TQSyhC8yiz5xp9HKMLDunJKV6eka3dqt8bLA4d0ivkA",
  "access_expires_at": "2026-10-30T09:59:56.122644884Z",
  "refresh_token": "zOBbT2b-Q6Y1RDWXt0iLlahCyJ1C3YO818h88e_z__0",
  "refresh_expires_at": "2026-11-29T09:44:56.121814445Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380636833916` → **200**

```json
{
  "client_id": "d7d426ea-d81c-4538-b6f3-af1c0b7a6159"
}
```

`POST /api/admin/v1/rider-wallets/d7d426ea-d81c-4538-b6f3-af1c0b7a6159/top-ups` → **201**

```json
{
  "command_id": "f1347773-8c7a-451e-8176-ece85e1d0f95",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "d7d426ea-d81c-4538-b6f3-af1c0b7a6159",
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
      "id": "a7736cfe-6124-4fee-8872-4823ad5bfd82",
      "at": "2026-10-30T09:44:56.729825Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "932dc2a2-31c0-4196-9862-e118e6a2e4cd",
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
  "id": "0c40b541-219d-474e-8a15-2d784ee07406",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:49:57.053683Z",
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
      "id": "f8b11b63-67a9-4090-a4f3-0b24f473a8e4",
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
  "device_ref": "sandbox-12576"
}
```

```json
{
  "challenge_id": "828e960d-7fbf-4ec3-8619-1327e8c1e87e",
  "expires_at": "2026-10-30T09:49:57.356219696Z",
  "resend_available_at": "2026-10-30T09:44:58.356219696Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "060553",
  "sent_at": "2026-10-30T09:44:57.360691139Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "828e960d-7fbf-4ec3-8619-1327e8c1e87e",
  "code": "060553",
  "device_ref": "sandbox-12576"
}
```

```json
{
  "session_id": "d1331abd-a629-43b3-ae44-fd4a88fb8c46",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDM5NywiaWF0IjoxNzkzMzUzNDk3LCJqdGkiOiJmMzhkNGMzMy0wNTNhLTQ5YWYtODVmYy0wZWFmOWEyMWEyMTQiLCJzaWQiOiJkMTMzMWFiZC1hNjI5LTQzYjMtYWU0NC1mZDRhODhmYjhjNDYifQ.0dAwmuzLWFNZgo9w_xJrlcaDHQj5SL5RChBWJWQ3UQU",
  "access_expires_at": "2026-10-30T09:59:57.676931999Z",
  "refresh_token": "sTOPlBS18uoXZdzgOLgg4y-_2mP7WBQEmykJzQFzc_4",
  "refresh_expires_at": "2026-11-29T09:44:57.67624433Z",
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
  "command_id": "514c68d0-8dc0-4249-bc27-51440002e3ef",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:44:58Z",
    "sequence": 1793353498254
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a399a0bb-48b6-46f7-adf6-31d0cac5d835",
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
  "last_heartbeat_at": "2026-10-30T09:44:58.276286Z",
  "last_location_at": "2026-10-30T09:44:58.276286Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "aaf493bf-3b13-4a30-b86d-c9c4298befb9",
  "quote_id": "0c40b541-219d-474e-8a15-2d784ee07406",
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
  "id": "725c2a3a-0ba0-4ced-8f1f-fa4d753a8afb",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d7d426ea-d81c-4538-b6f3-af1c0b7a6159",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:44:58.58716Z",
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
  "client_id": "d7d426ea-d81c-4538-b6f3-af1c0b7a6159",
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
      "id": "a7736cfe-6124-4fee-8872-4823ad5bfd82",
      "at": "2026-10-30T09:44:56.729825Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
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
    "id": "406657f8-f381-4cf2-b3b8-e26a9fd3c410",
    "order_id": "725c2a3a-0ba0-4ced-8f1f-fa4d753a8afb",
    "expires_at": "2026-10-30T09:45:13.595155Z",
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

`POST /api/driver/v1/offers/406657f8-f381-4cf2-b3b8-e26a9fd3c410/accept` → **200**

```json
{
  "command_id": "01f6218c-4352-4cae-a0b9-f80eb923a78b"
}
```

```json
{
  "id": "e8d1edf7-95a2-49a2-8a11-3dfd878255d2",
  "order_id": "725c2a3a-0ba0-4ced-8f1f-fa4d753a8afb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a8134d2e-07e0-47aa-a95b-4b92ae3ceafe",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a8134d2e-07e0-47aa-a95b-4b92ae3ceafe",
  "order_id": "725c2a3a-0ba0-4ced-8f1f-fa4d753a8afb",
  "assignment_id": "e8d1edf7-95a2-49a2-8a11-3dfd878255d2",
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

`POST /api/driver/v1/work-sessions/a399a0bb-48b6-46f7-adf6-31d0cac5d835/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:45:00Z",
    "sequence": 1793353500994
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a399a0bb-48b6-46f7-adf6-31d0cac5d835",
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
  "last_heartbeat_at": "2026-10-30T09:45:00.12071Z",
  "last_location_at": "2026-10-30T09:45:00.12071Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a8134d2e-07e0-47aa-a95b-4b92ae3ceafe/arrive` → **200**

```json
{
  "command_id": "aca79141-d4fb-4c2b-84bf-b8d5c42d6cd2",
  "expected_version": 0
}
```

```json
{
  "id": "a8134d2e-07e0-47aa-a95b-4b92ae3ceafe",
  "order_id": "725c2a3a-0ba0-4ced-8f1f-fa4d753a8afb",
  "assignment_id": "e8d1edf7-95a2-49a2-8a11-3dfd878255d2",
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
  "arrived_at": "2026-10-30T09:45:00.449828Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a8134d2e-07e0-47aa-a95b-4b92ae3ceafe/start` → **200**

```json
{
  "command_id": "f90d9c7f-f8da-4eed-afd4-3f982e2becf7",
  "expected_version": 1
}
```

```json
{
  "id": "a8134d2e-07e0-47aa-a95b-4b92ae3ceafe",
  "order_id": "725c2a3a-0ba0-4ced-8f1f-fa4d753a8afb",
  "assignment_id": "e8d1edf7-95a2-49a2-8a11-3dfd878255d2",
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
  "arrived_at": "2026-10-30T09:45:00.449828Z",
  "started_at": "2026-10-30T09:45:00.760697Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/a8134d2e-07e0-47aa-a95b-4b92ae3ceafe/complete` → **200**

```json
{
  "command_id": "c01cd3e2-c273-47e8-95f1-4b56052562e7",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:45:01Z",
  "cash_received": true
}
```

```json
{
  "id": "a8134d2e-07e0-47aa-a95b-4b92ae3ceafe",
  "order_id": "725c2a3a-0ba0-4ced-8f1f-fa4d753a8afb",
  "assignment_id": "e8d1edf7-95a2-49a2-8a11-3dfd878255d2",
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
  "arrived_at": "2026-10-30T09:45:00.449828Z",
  "started_at": "2026-10-30T09:45:00.760697Z",
  "completed_at": "2026-10-30T09:45:01.085279Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "d7d426ea-d81c-4538-b6f3-af1c0b7a6159",
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
      "id": "85cc68fc-1eb0-4277-a38e-aa52ce076824",
      "at": "2026-10-30T09:45:01.20719Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "725c2a3a-0ba0-4ced-8f1f-fa4d753a8afb"
    },
    {
      "id": "a7736cfe-6124-4fee-8872-4823ad5bfd82",
      "at": "2026-10-30T09:44:56.729825Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/f8b11b63-67a9-4090-a4f3-0b24f473a8e4/archive` → **200**

```json
{
  "command_id": "6dbbb181-3b6c-4c3c-9cb3-a9086c619650",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "f8b11b63-67a9-4090-a4f3-0b24f473a8e4",
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
  "created_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "created_at": "2026-10-30T09:44:55.466393Z",
  "updated_at": "2026-10-30T09:45:04.719627Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a399a0bb-48b6-46f7-adf6-31d0cac5d835",
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
  "last_heartbeat_at": "2026-10-30T09:45:00.12071Z",
  "last_location_at": "2026-10-30T09:45:00.12071Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a399a0bb-48b6-46f7-adf6-31d0cac5d835/close` → **200**

```json
{
  "command_id": "c06132d9-700f-47ab-959c-cf10776a0942",
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

Done: order 725c2a3a-0ba0-4ced-8f1f-fa4d753a8afb.

# Scenario: broadcast-claims

## Nobody is online in Warsaw; Piotr signs in on two phones, Anna goes online 10 km from the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-4865"
}
```

```json
{
  "challenge_id": "e11e6901-4b02-4da3-a9a8-0ed6f69a14e9",
  "expires_at": "2026-10-30T09:50:05.650307724Z",
  "resend_available_at": "2026-10-30T09:45:06.650307724Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "671579",
  "sent_at": "2026-10-30T09:45:05.65480848Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e11e6901-4b02-4da3-a9a8-0ed6f69a14e9",
  "code": "671579",
  "device_ref": "sandbox-4865"
}
```

```json
{
  "session_id": "014ebc85-8c36-44f9-a25c-22be7cb035e2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDQwNSwiaWF0IjoxNzkzMzUzNTA1LCJqdGkiOiIwMWJhODE0Mi1hMGY2LTQ0MzgtYjcyNS00ZDdkZDczMGFhMzAiLCJzaWQiOiIwMTRlYmM4NS04YzM2LTQ0ZjktYTI1Yy0yMmJlN2NiMDM1ZTIifQ.EBzP7R-uY8pNoiuAlH2__V3HIiR5CThpbG7HjNdqQ54",
  "access_expires_at": "2026-10-30T10:00:05.997655498Z",
  "refresh_token": "uVbdsaW1ezyhrpxdwxixqvBretF2ZM3Jq9C3ixWIIkE",
  "refresh_expires_at": "2026-11-29T09:45:05.996897645Z",
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
  "device_ref": "sandbox-2521"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "d016e161-134e-4e14-acdb-1c1be96603f1",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-2521"
}
```

```json
{
  "challenge_id": "8ff35615-3136-46ad-b4a3-71ca5681681b",
  "expires_at": "2026-10-30T09:50:07.909023456Z",
  "resend_available_at": "2026-10-30T09:45:08.909023456Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "381228",
  "sent_at": "2026-10-30T09:45:07.912877764Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ff35615-3136-46ad-b4a3-71ca5681681b",
  "code": "381228",
  "device_ref": "sandbox-2521"
}
```

```json
{
  "session_id": "a23ff87b-0284-48e5-9e38-7e7108f68d7b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDQwOCwiaWF0IjoxNzkzMzUzNTA4LCJqdGkiOiIxMTdiMmMwMi0wZjBkLTQyMWEtYjk4ZS0xZmMwZjRhZDMxNzIiLCJzaWQiOiJhMjNmZjg3Yi0wMjg0LTQ4ZTUtOWUzOC03ZTcxMDhmNjhkN2IifQ.hbMJNQCTjOz9ZsZI6tSB_IlwEkQYQqxFBwtnQKZkwTY",
  "access_expires_at": "2026-10-30T10:00:08.240913817Z",
  "refresh_token": "ASQD-sI0JNg83BuCimdeFTXrboYa4tbRWk-YR6KFfj4",
  "refresh_expires_at": "2026-11-29T09:45:08.240157426Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-18604"
}
```

```json
{
  "challenge_id": "c2e33c3c-a330-4081-85ca-53bc20f72490",
  "expires_at": "2026-10-30T09:50:08.535225006Z",
  "resend_available_at": "2026-10-30T09:45:09.535225006Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "270138",
  "sent_at": "2026-10-30T09:45:08.539344491Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2e33c3c-a330-4081-85ca-53bc20f72490",
  "code": "270138",
  "device_ref": "sandbox-18604"
}
```

```json
{
  "session_id": "8ddd01af-66a7-4c2f-b2b0-f6a2ab2bbbcc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDQwOCwiaWF0IjoxNzkzMzUzNTA4LCJqdGkiOiI1ZmYxMWUyYi1mYzc4LTRjZWYtOTQ2OC1kZDlmMGMxZDRmNzciLCJzaWQiOiI4ZGRkMDFhZi02NmE3LTRjMmYtYjJiMC1mNmEyYWIyYmJiY2MifQ.6bkAnnSWYoeVz3HFy0LoCRZZSAFQC8RTtFoVXY7HBZQ",
  "access_expires_at": "2026-10-30T10:00:08.863183467Z",
  "refresh_token": "6nLJItDZbeVi32V_oL1jVjGvi6ELnN6uBWLDuzGOTPM",
  "refresh_expires_at": "2026-11-29T09:45:08.862437645Z",
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
  "command_id": "6a0ff693-23d6-476f-b863-4e7a8a3861d1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:45:09Z",
    "sequence": 1793353509744
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "e2d67002-d441-4411-ade0-302e0a65a438",
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
  "last_heartbeat_at": "2026-10-30T09:45:09.76658Z",
  "last_location_at": "2026-10-30T09:45:09.76658Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600376760",
  "device_ref": "sandbox-32035"
}
```

```json
{
  "challenge_id": "449cbd96-df1e-45be-92e1-f0e3b34858d3",
  "expires_at": "2026-10-30T09:50:10.072930456Z",
  "resend_available_at": "2026-10-30T09:45:11.072930456Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600376760` → **200**

```json
{
  "phone": "+48600376760",
  "audience": "CLIENT",
  "code": "765866",
  "sent_at": "2026-10-30T09:45:10.076980369Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "449cbd96-df1e-45be-92e1-f0e3b34858d3",
  "code": "765866",
  "device_ref": "sandbox-32035"
}
```

```json
{
  "session_id": "700f47a4-2f68-49a2-a39d-5fba020671ea",
  "subject": {
    "type": "CLIENT",
    "id": "4c3a15d4-a43e-4376-9b67-16617d4c6221"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YzNhMTVkNC1hNDNlLTQzNzYtOWI2Ny0xNjYxN2Q0YzYyMjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NDEwLCJpYXQiOjE3OTMzNTM1MTAsImp0aSI6ImI0ZmY4ODhiLTVmOWMtNGUxNy04MDAyLWQ4ZTkyYWEzMzliMSIsInNpZCI6IjcwMGY0N2E0LTJmNjgtNDlhMi1hMzlkLTVmYmEwMjA2NzFlYSJ9.LtCXc97JefTNNsOL_56eRWek5169HOuYlT8LWwBJlRY",
  "access_expires_at": "2026-10-30T10:00:10.411117586Z",
  "refresh_token": "VEaq8vYD0MXcFM0sFbvd8PggAoD-hcmoJpssl80GDvc",
  "refresh_expires_at": "2026-11-29T09:45:10.410331174Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "df05ab70-6784-4916-abb9-02994d6691b7",
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
  "id": "37226eb0-e9cf-4348-88c8-30179150c5f1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:50:10.718987Z",
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
  "command_id": "3cd5beda-fb9b-4f58-b896-f7f97df6d6cb",
  "quote_id": "37226eb0-e9cf-4348-88c8-30179150c5f1",
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
  "id": "6f093a42-65de-4142-90a1-3f3bc821c6de",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4c3a15d4-a43e-4376-9b67-16617d4c6221",
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
  "created_at": "2026-10-30T09:45:11.038431Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6f093a42-65de-4142-90a1-3f3bc821c6de` → **200**

```json
{
  "id": "6f093a42-65de-4142-90a1-3f3bc821c6de",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4c3a15d4-a43e-4376-9b67-16617d4c6221",
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
  "created_at": "2026-10-30T09:45:11.038431Z",
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

`POST /api/driver/v1/orders/6f093a42-65de-4142-90a1-3f3bc821c6de/claim` → **422**

```json
{
  "command_id": "8d13f5f8-136d-4873-94ad-07a249b49ce9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6f093a42-65de-4142-90a1-3f3bc821c6de/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "3479eb56-e570-4c23-9033-983de8d1e9fb"
}
```

`GET /api/rider/v1/orders/6f093a42-65de-4142-90a1-3f3bc821c6de` → **200**

```json
{
  "id": "6f093a42-65de-4142-90a1-3f3bc821c6de",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4c3a15d4-a43e-4376-9b67-16617d4c6221",
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
  "created_at": "2026-10-30T09:45:11.038431Z",
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

`POST /api/driver/v1/orders/7f85514e-2ea1-491f-a7b7-d421608f0192/claim` → **404**

```json
{
  "command_id": "09aead3e-2fdb-4a41-ac4d-6d58f5c04909"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7f85514e-2ea1-491f-a7b7-d421608f0192/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "45fb6c86-d204-453a-b7b3-846f87b3e734"
}
```

`POST /api/driver/v1/orders/c16b3eeb-d353-4338-bf8e-765f2e5e58a6/claim` → **404**

```json
{
  "command_id": "7890dad6-0daa-47a7-93bd-c77faf1ab8bc"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c16b3eeb-d353-4338-bf8e-765f2e5e58a6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fa80d558-0450-4a26-8afe-da3c6e7540b4"
}
```

`POST /api/driver/v1/orders/0172f869-66db-47aa-9374-90e39ed2977f/claim` → **404**

```json
{
  "command_id": "a12f2d0c-2ce8-4864-9fc4-2aeda43980ac"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0172f869-66db-47aa-9374-90e39ed2977f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a4049460-3dbd-49ab-8f22-9bc4012dea63"
}
```

`POST /api/driver/v1/orders/ac4c5356-1064-4df0-951d-525daa920037/claim` → **404**

```json
{
  "command_id": "14b61863-daa6-4823-8957-1afd6dfad157"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ac4c5356-1064-4df0-951d-525daa920037/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "338db5b0-a611-4b21-9be2-8ede2273d78d"
}
```

`POST /api/driver/v1/orders/853d3df9-3d6f-467b-b69d-f791b5b38850/claim` → **404**

```json
{
  "command_id": "7fc44310-9bbb-49e6-97a0-e6696ca5d6bc"
}
```

```json
{
  "instance": "/api/driver/v1/orders/853d3df9-3d6f-467b-b69d-f791b5b38850/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9eb28e1a-a162-4dae-933d-0e0308c71b3d"
}
```

`POST /api/driver/v1/orders/77d20ce7-d77d-4eb3-9cd8-aebd1d42bd18/claim` → **404**

```json
{
  "command_id": "50f19328-9c02-4113-81a0-b6aa2cec97d2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/77d20ce7-d77d-4eb3-9cd8-aebd1d42bd18/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2bd9724c-4c0f-4975-a385-a79bafb3b34c"
}
```

`POST /api/driver/v1/orders/dc103051-d9ba-4500-a395-62e0a9d5c0fa/claim` → **404**

```json
{
  "command_id": "174f2304-7d30-4b39-93cb-da55802d054c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/dc103051-d9ba-4500-a395-62e0a9d5c0fa/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "590e1a78-12c1-4bd6-bc19-91470c09181e"
}
```

`POST /api/driver/v1/orders/19241ca9-34f9-4439-abf4-5de1f11fa6cf/claim` → **404**

```json
{
  "command_id": "a0b80e76-8973-4d90-9c8c-ccbeb4462ffe"
}
```

```json
{
  "instance": "/api/driver/v1/orders/19241ca9-34f9-4439-abf4-5de1f11fa6cf/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9e6831c9-6cda-4711-bd3e-c3b54525874b"
}
```

`POST /api/driver/v1/orders/981aea9c-63d9-4063-aed5-0ae3e104ffea/claim` → **404**

```json
{
  "command_id": "eecca049-8b57-485a-a52d-c9aa83fa2608"
}
```

```json
{
  "instance": "/api/driver/v1/orders/981aea9c-63d9-4063-aed5-0ae3e104ffea/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7de20845-c330-4d35-ba5f-29818a97307b"
}
```

`POST /api/driver/v1/orders/7f0d2d68-9e30-44b6-a479-feba661ffc70/claim` → **404**

```json
{
  "command_id": "2dd032e5-b8e6-40bd-9db3-4489f5dbc3be"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7f0d2d68-9e30-44b6-a479-feba661ffc70/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "79410fc8-1823-41fc-9a07-f5cee181567b"
}
```

`POST /api/driver/v1/orders/fd0b67cd-c5f3-4806-bdc2-ae1769d0098d/claim` → **404**

```json
{
  "command_id": "83112b61-a915-4164-bc09-7235a3c8cf6b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/fd0b67cd-c5f3-4806-bdc2-ae1769d0098d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "35cbccb0-68f4-40f2-be47-3388d47cce96"
}
```

`POST /api/driver/v1/orders/da6e63c6-c23a-49ab-a11e-6eb915ab3690/claim` → **404**

```json
{
  "command_id": "05dd381f-d5a0-4250-8e22-998e609a2f7f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/da6e63c6-c23a-49ab-a11e-6eb915ab3690/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "dc200ffe-ed4e-4cf9-8df1-d9ed0c7b80d2"
}
```

`POST /api/driver/v1/orders/9e736f7e-cfe2-4050-abd8-db78a5ed440a/claim` → **404**

```json
{
  "command_id": "1651c2e1-2d8a-44da-8f90-12d5009a993b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9e736f7e-cfe2-4050-abd8-db78a5ed440a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0cf8359b-6778-4723-a9c0-3be36ed08272"
}
```

`POST /api/driver/v1/orders/555ae4b2-1b40-4d44-a068-bc4389882139/claim` → **404**

```json
{
  "command_id": "44952117-f4ca-4906-a1f0-14916b0e664c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/555ae4b2-1b40-4d44-a068-bc4389882139/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8cf6d147-ca57-4453-958e-2da18ff57b18"
}
```

`POST /api/driver/v1/orders/c5975275-429b-4e6c-8fc1-97b6cf84f989/claim` → **404**

```json
{
  "command_id": "5f28e3e2-28d7-4210-918d-a4e83f0f3785"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c5975275-429b-4e6c-8fc1-97b6cf84f989/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b556262a-6d86-4324-b944-c4d483dd7604"
}
```

`POST /api/driver/v1/orders/36f42ea8-429a-4009-bad7-4eb318e6309d/claim` → **404**

```json
{
  "command_id": "780e6c1c-668e-4280-a611-f855aff510f8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/36f42ea8-429a-4009-bad7-4eb318e6309d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "39b37464-1483-4f3a-b553-2826065e6eff"
}
```

`POST /api/driver/v1/orders/944d9407-e094-480c-bdba-02690a42f561/claim` → **404**

```json
{
  "command_id": "30f94bc2-4e78-408a-a54f-904220e8666e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/944d9407-e094-480c-bdba-02690a42f561/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9ee8c64f-3c99-49c1-8b45-46a978ce1b87"
}
```

`POST /api/driver/v1/orders/16cae1ed-5bad-463a-a7d1-b31d4814246f/claim` → **404**

```json
{
  "command_id": "6dfbf9ad-1d4d-4f5b-975c-3ffa9cee3d6e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/16cae1ed-5bad-463a-a7d1-b31d4814246f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0a1e678c-ce4d-48de-b275-dd4f0333a390"
}
```

`POST /api/driver/v1/orders/ffe3da03-baf5-46a1-858a-0f3fa0bb6f72/claim` → **404**

```json
{
  "command_id": "72c43ac8-ece0-406b-b9be-ddd682ed8151"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ffe3da03-baf5-46a1-858a-0f3fa0bb6f72/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7762c9e8-559d-44e4-99ce-9abd8198c6ab"
}
```

`POST /api/driver/v1/orders/3e55c595-891d-4e33-8856-0369bf71e885/claim` → **404**

```json
{
  "command_id": "bae13fb0-547b-4d2e-87ba-07b124b1b68f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3e55c595-891d-4e33-8856-0369bf71e885/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "80b87fa6-357e-4f4c-b22f-53349f73f3e7"
}
```

`POST /api/driver/v1/orders/2ddef9a5-57dc-415a-9348-a10f286b0487/claim` → **404**

```json
{
  "command_id": "be70c08e-6bfb-4c55-8171-618d3c230e64"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2ddef9a5-57dc-415a-9348-a10f286b0487/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b2d2c8f2-e65e-4ecd-a030-48299688c3f9"
}
```

`POST /api/driver/v1/orders/11a358e8-6835-4a49-9989-66875e3faa5a/claim` → **404**

```json
{
  "command_id": "7b7b132c-57c0-462f-8abd-a447d97558f0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/11a358e8-6835-4a49-9989-66875e3faa5a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "537dc665-2e86-41b7-8cca-7466810e2a69"
}
```

`POST /api/driver/v1/orders/28eb92e5-2b97-4068-a2b8-02202a330ad3/claim` → **404**

```json
{
  "command_id": "c68e6e41-0123-44ca-ab15-e654b885dc9a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/28eb92e5-2b97-4068-a2b8-02202a330ad3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9b286e7a-8d01-41f6-89fd-25dac5cf1c85"
}
```

`POST /api/driver/v1/orders/0cc8484f-8d78-4b76-9292-884e7024bd67/claim` → **404**

```json
{
  "command_id": "d4598b09-d530-48bd-a19d-fabe3139e8e2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0cc8484f-8d78-4b76-9292-884e7024bd67/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b972a99a-336c-4b1e-951e-6de2e0c56369"
}
```

`POST /api/driver/v1/orders/09b13d0e-8f4d-485c-acc0-e5a03f2e7e5e/claim` → **404**

```json
{
  "command_id": "7ef6c91a-2073-4e0b-a09b-acf2b911181b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/09b13d0e-8f4d-485c-acc0-e5a03f2e7e5e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "db1a7d69-521f-4e4b-abe1-5970ea43eb54"
}
```

`POST /api/driver/v1/orders/a921f337-7812-4f75-848d-2c92b8ab044f/claim` → **404**

```json
{
  "command_id": "a4dc6a16-2d74-4911-953b-be852106d260"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a921f337-7812-4f75-848d-2c92b8ab044f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "021563bf-e4c7-4166-9c15-74b7a62a9036"
}
```

`POST /api/driver/v1/orders/98edf07d-2654-4b15-ae8c-5b47cf5b99b9/claim` → **404**

```json
{
  "command_id": "20a5806d-2f80-4502-a18c-79b2ef0ab9d0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/98edf07d-2654-4b15-ae8c-5b47cf5b99b9/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d73a2e29-50c9-4bb6-bbbd-c7d56328bf5c"
}
```

`POST /api/driver/v1/orders/34bd166d-b94f-4ea2-a820-ccc2f02bb0c6/claim` → **404**

```json
{
  "command_id": "c63fef49-8969-4c01-ae23-18936b5bcf0f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/34bd166d-b94f-4ea2-a820-ccc2f02bb0c6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "bd109382-6600-41b7-a239-e228cfd3076d"
}
```

`POST /api/driver/v1/orders/c3fca68c-4cd7-4f9e-bedd-fdce4ecf4d5b/claim` → **404**

```json
{
  "command_id": "2bbe70d2-b89b-4749-a56a-b38dc3aac861"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c3fca68c-4cd7-4f9e-bedd-fdce4ecf4d5b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7f9d6295-dd8e-49bd-93cd-2cd3df0ec98f"
}
```

`POST /api/driver/v1/orders/9b339fd8-7776-42f5-88f6-8a6df0e35e2b/claim` → **429**

```json
{
  "command_id": "209bf2c3-7f87-4b6d-8af0-4cf6db2eb568"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9b339fd8-7776-42f5-88f6-8a6df0e35e2b/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "77e42212-9b95-478b-9622-3c607af7ccb5",
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
  "command_id": "24dd46ad-3dd0-4f52-8e9a-7709a07e521c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:45:22Z",
    "sequence": 1793353522282
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b1cabf62-278b-4597-a00b-4165529b8ff1",
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
  "last_heartbeat_at": "2026-10-30T09:45:22.303276Z",
  "last_location_at": "2026-10-30T09:45:22.303276Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "6f093a42-65de-4142-90a1-3f3bc821c6de",
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

`POST /api/driver/v1/orders/6f093a42-65de-4142-90a1-3f3bc821c6de/claim` → **409**

```json
{
  "command_id": "68fde533-4214-40a9-a238-75075a60b3e4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6f093a42-65de-4142-90a1-3f3bc821c6de/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e1d6c7fa-a9bf-4ab7-b3e1-f895c14d9379"
}
```

`POST /api/driver/v1/orders/6f093a42-65de-4142-90a1-3f3bc821c6de/claim` → **200**

```json
{
  "command_id": "6d128ede-ca88-45f3-afcf-83dbaf141bdc"
}
```

```json
{
  "id": "7c1929ce-66ca-4a7f-ba44-097fb647ea96",
  "order_id": "6f093a42-65de-4142-90a1-3f3bc821c6de",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "aebe670c-c082-4ef1-94d0-075801164357",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "aebe670c-c082-4ef1-94d0-075801164357",
  "order_id": "6f093a42-65de-4142-90a1-3f3bc821c6de",
  "assignment_id": "7c1929ce-66ca-4a7f-ba44-097fb647ea96",
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

`POST /api/driver/v1/trips/aebe670c-c082-4ef1-94d0-075801164357/cancel` → **200**

```json
{
  "command_id": "7d81d4f1-f582-4afc-80e3-c486315847a3",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "aebe670c-c082-4ef1-94d0-075801164357",
  "order_id": "6f093a42-65de-4142-90a1-3f3bc821c6de",
  "assignment_id": "7c1929ce-66ca-4a7f-ba44-097fb647ea96",
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

`GET /api/rider/v1/orders/6f093a42-65de-4142-90a1-3f3bc821c6de` → **200**

```json
{
  "id": "6f093a42-65de-4142-90a1-3f3bc821c6de",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "4c3a15d4-a43e-4376-9b67-16617d4c6221",
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
    "id": "7c1929ce-66ca-4a7f-ba44-097fb647ea96",
    "order_id": "6f093a42-65de-4142-90a1-3f3bc821c6de",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "aebe670c-c082-4ef1-94d0-075801164357",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:45:11.038431Z",
  "cancellation": {
    "by": "DRIVER",
    "reason_code": "PASSENGER_ASKED",
    "reason_labels": {
      "ru": "Пассажир попросил отменить",
      "pl": "Pasażer poprosił o anulowanie",
      "uk": "Пасажир попросив скасувати",
      "en": "Passenger asked to cancel"
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
  "session_id": "e2d67002-d441-4411-ade0-302e0a65a438",
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
  "last_heartbeat_at": "2026-10-30T09:45:09.76658Z",
  "last_location_at": "2026-10-30T09:45:09.76658Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e2d67002-d441-4411-ade0-302e0a65a438/close` → **200**

```json
{
  "command_id": "748402b5-8d69-4ffa-9313-c217be0354f2",
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
  "session_id": "b1cabf62-278b-4597-a00b-4165529b8ff1",
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
  "last_heartbeat_at": "2026-10-30T09:45:22.303276Z",
  "last_location_at": "2026-10-30T09:45:22.303276Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b1cabf62-278b-4597-a00b-4165529b8ff1/close` → **200**

```json
{
  "command_id": "a86fc22f-3791-47cd-b17e-2d543198ecb9",
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
  "session_id": "c792d22e-f9bd-48b6-9573-033fb5e835eb",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ0MjYsImlhdCI6MTc5MzM1MzUyNiwianRpIjoiZDM1OGJkNDEtYzI2OS00ZTQ1LWI5YTUtYmNhNDZiNDA4ZDAyIiwic2lkIjoiYzc5MmQyMmUtZjliZC00OGI2LTk1NzMtMDMzZmI1ZTgzNWViIn0.jP7w9d2dJn_VSS83nMTJEgdifaWFWFHN5vW1D6qties",
  "access_expires_at": "2026-10-30T10:00:26.01474446Z",
  "refresh_token": "92qnDCOd_4BYtwylPpJCfrde3iIYLlyBCwx8Ib-tbLY",
  "refresh_expires_at": "2026-10-30T21:45:26.014014193Z",
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
  "command_id": "ae01b6c8-1d96-4569-bccc-0b3e5dd40841",
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
  "session_id": "a69f3926-1bd7-4940-b394-e360e1068a23",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ0MjcsImlhdCI6MTc5MzM1MzUyNywianRpIjoiMjY3MzE5OGUtY2RjYi00NTVmLWJlZTAtMDJmMzFjOGM0Y2JiIiwic2lkIjoiYTY5ZjM5MjYtMWJkNy00OTQwLWIzOTQtZTM2MGUxMDY4YTIzIn0.y_LMVnaumXfrxWYsF4l3SSv2HVMQdjbY2SfUvbjpXRE",
  "access_expires_at": "2026-10-30T10:00:27.221887399Z",
  "refresh_token": "BMBdyuQpVFyZ0kPbggdb-koGGbkzLa1JJ2W59tL_twA",
  "refresh_expires_at": "2026-10-30T21:45:27.221314821Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.150616696",
    "linkedid": "1730052700.150616696",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674732294"
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
    "id": "1730052700.150616696",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "ee8655c9-cf14-49f4-90f4-86a1696c3ea9",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380674732294",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T09:45:27.521769Z",
      "answered_at": null,
      "ended_at": "2026-10-30T09:45:27.547735Z",
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
    "id": "1730052600.3186625712",
    "linkedid": "1730052600.3186625712",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674732294"
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
      "id": "bf77f12f-267a-45f8-bb28-2d9064fdb033",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674732294",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T09:45:27.877301Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/bf77f12f-267a-45f8-bb28-2d9064fdb033/answer` → **200**

```json
{
  "command_id": "4c6fbbba-4048-4cdb-8eed-5ba643f179df"
}
```

```json
{
  "id": "bf77f12f-267a-45f8-bb28-2d9064fdb033",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674732294",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "order_ids": [],
  "started_at": "2026-10-30T09:45:27.877301Z",
  "answered_at": "2026-10-30T09:45:28.214103Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.3186625712",
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
    "id": "1730052600.3186625712",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "bf77f12f-267a-45f8-bb28-2d9064fdb033",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674732294",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "order_ids": [],
      "started_at": "2026-10-30T09:45:27.877301Z",
      "answered_at": "2026-10-30T09:45:28.214103Z",
      "ended_at": "2026-10-30T09:45:28.543694Z",
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
      "id": "bf77f12f-267a-45f8-bb28-2d9064fdb033",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674732294",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "order_ids": [],
      "started_at": "2026-10-30T09:45:27.877301Z",
      "answered_at": "2026-10-30T09:45:28.214103Z",
      "ended_at": "2026-10-30T09:45:28.543694Z",
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
      "id": "bf77f12f-267a-45f8-bb28-2d9064fdb033",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674732294",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "order_ids": [],
      "started_at": "2026-10-30T09:45:27.877301Z",
      "answered_at": "2026-10-30T09:45:28.214103Z",
      "ended_at": "2026-10-30T09:45:28.543694Z",
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
      "id": "bf77f12f-267a-45f8-bb28-2d9064fdb033",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674732294",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "order_ids": [],
      "started_at": "2026-10-30T09:45:27.877301Z",
      "answered_at": "2026-10-30T09:45:28.214103Z",
      "ended_at": "2026-10-30T09:45:28.543694Z",
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
      "id": "bf77f12f-267a-45f8-bb28-2d9064fdb033",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674732294",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "order_ids": [],
      "started_at": "2026-10-30T09:45:27.877301Z",
      "answered_at": "2026-10-30T09:45:28.214103Z",
      "ended_at": "2026-10-30T09:45:28.543694Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:45:35.840873Z"
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
      "id": "bf77f12f-267a-45f8-bb28-2d9064fdb033",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674732294",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "order_ids": [],
      "started_at": "2026-10-30T09:45:27.877301Z",
      "answered_at": "2026-10-30T09:45:28.214103Z",
      "ended_at": "2026-10-30T09:45:28.543694Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:45:35.840873Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/bf77f12f-267a-45f8-bb28-2d9064fdb033/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/bf77f12f-267a-45f8-bb28-2d9064fdb033/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=bf77f12f-267a-45f8-bb28-2d9064fdb033` → **200**

```json
{
  "changes": [
    {
      "id": "b89ddf48-2712-43d0-af4f-4f72b7fe3127",
      "occurred_at": "2026-10-30T09:45:38.420027Z",
      "actor_type": "STAFF",
      "actor_id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "bf77f12f-267a-45f8-bb28-2d9064fdb033",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"11865376-2c4d-4123-bab3-3e41a455dc66\", \"order_ids\": []}",
      "correlation_id": "ca1cac28-8724-47c0-bf4e-49f7d5a01605"
    },
    {
      "id": "21cafe18-0dc7-422d-9dbf-dd2001008a65",
      "occurred_at": "2026-10-30T09:45:38.384786Z",
      "actor_type": "STAFF",
      "actor_id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "bf77f12f-267a-45f8-bb28-2d9064fdb033",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"11865376-2c4d-4123-bab3-3e41a455dc66\", \"order_ids\": []}",
      "correlation_id": "04b6607f-7f87-4a17-aed5-8b1e7eda16d6"
    }
  ]
}
```

Done: call bf77f12f-267a-45f8-bb28-2d9064fdb033 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23267"
}
```

```json
{
  "challenge_id": "1dd25daf-a673-411f-832c-e4aa3841154a",
  "expires_at": "2026-10-30T09:50:38.750216556Z",
  "resend_available_at": "2026-10-30T09:45:39.750216556Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "693329",
  "sent_at": "2026-10-30T09:45:38.754219568Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1dd25daf-a673-411f-832c-e4aa3841154a",
  "code": "693329",
  "device_ref": "sandbox-23267"
}
```

```json
{
  "session_id": "2226af32-1569-49a1-a25f-cd0a4f530a12",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDQzOSwiaWF0IjoxNzkzMzUzNTM5LCJqdGkiOiI3MWIxZDg5Yi0yNTBjLTRmMDItOTEzZi1lZjIxNTQ3MGMwYWQiLCJzaWQiOiIyMjI2YWYzMi0xNTY5LTQ5YTEtYTI1Zi1jZDBhNGY1MzBhMTIifQ.qV9NDcIAKSYyJ1NVvmw5cyQ57WQriEFKa5mgbQXRNYY",
  "access_expires_at": "2026-10-30T10:00:39.071371253Z",
  "refresh_token": "iKYquM3QALdOQx0o_EJfmxDIziV1zVHtvzXQzcr9rFQ",
  "refresh_expires_at": "2026-11-29T09:45:39.070676337Z",
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
  "command_id": "bcac2c1c-b0a9-442a-b129-c3407905d666",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:45:39Z",
    "sequence": 1793353539648
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8cbfb7fc-6e4a-4836-a34a-1fb3a4b0e5c3",
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
  "last_heartbeat_at": "2026-10-30T09:45:39.669071Z",
  "last_location_at": "2026-10-30T09:45:39.669071Z",
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
  "session_id": "7a0c2431-54ab-4643-b05e-1b3a1ca3af31",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ0NDAsImlhdCI6MTc5MzM1MzU0MCwianRpIjoiMjYzYTVkZmMtOWM5ZS00MWQ5LWFlZDMtNWVjMDQ3MjIyMjZlIiwic2lkIjoiN2EwYzI0MzEtNTRhYi00NjQzLWIwNWUtMWIzYTFjYTNhZjMxIn0.eMAB2mkU9sH0SLA-JkX9JrV1RbHL_eUcsMQ0Xy6F8K0",
  "access_expires_at": "2026-10-30T10:00:40.268312141Z",
  "refresh_token": "gv7rfYIJtrjHPBVzUMu2pPe2xcH_-HX3iZDxeVHuEyY",
  "refresh_expires_at": "2026-10-30T21:45:40.267660035Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "87a160dd-92ea-4b1c-948f-4ffe5c6f114d",
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
  "id": "1ea41c36-51e3-488a-a16f-f7712ba12982",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:50:40.569773Z",
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
  "command_id": "4c2911ad-8c80-4817-b0e0-e8706f8e93d3",
  "quote_id": "1ea41c36-51e3-488a-a16f-f7712ba12982",
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
    "phone": "+380674008195"
  }
}
```

```json
{
  "id": "94675f5f-3b73-4583-9b7c-247a743ea319",
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
  "created_at": "2026-10-30T09:45:40.896085Z",
  "caller": {
    "name": "Олена",
    "phone": "+380674008195"
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
    "id": "c4a04e98-e824-494f-aca9-73a846bb2018",
    "order_id": "94675f5f-3b73-4583-9b7c-247a743ea319",
    "expires_at": "2026-10-30T09:45:55.901125Z",
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

`POST /api/driver/v1/offers/c4a04e98-e824-494f-aca9-73a846bb2018/accept` → **200**

```json
{
  "command_id": "c6b14319-b81c-435c-bb41-735c5f1ddf08"
}
```

```json
{
  "id": "f2cc8e51-343c-4404-985c-8f61dd000dae",
  "order_id": "94675f5f-3b73-4583-9b7c-247a743ea319",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4b677cb1-c00f-4ecb-aef9-c616a3e3bb33",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380674008195` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380674008195` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380674008195` → **200**

```json
[
  {
    "phone": "+380674008195",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:45:43.128864623Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674008195` → **200**

```json
[
  {
    "phone": "+380674008195",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:45:43.128864623Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380674008195` → **200**

```json
[
  {
    "phone": "+380674008195",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:45:43.128864623Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4b677cb1-c00f-4ecb-aef9-c616a3e3bb33",
  "order_id": "94675f5f-3b73-4583-9b7c-247a743ea319",
  "assignment_id": "f2cc8e51-343c-4404-985c-8f61dd000dae",
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
    "phone": "+380674008195"
  }
}
```

`POST /api/driver/v1/work-sessions/8cbfb7fc-6e4a-4836-a34a-1fb3a4b0e5c3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:45:44Z",
    "sequence": 1793353544250
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8cbfb7fc-6e4a-4836-a34a-1fb3a4b0e5c3",
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
  "last_heartbeat_at": "2026-10-30T09:45:44.270556Z",
  "last_location_at": "2026-10-30T09:45:44.270556Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4b677cb1-c00f-4ecb-aef9-c616a3e3bb33/arrive` → **200**

```json
{
  "command_id": "310dc039-1bcd-49e4-8706-266f56695e8b",
  "expected_version": 0
}
```

```json
{
  "id": "4b677cb1-c00f-4ecb-aef9-c616a3e3bb33",
  "order_id": "94675f5f-3b73-4583-9b7c-247a743ea319",
  "assignment_id": "f2cc8e51-343c-4404-985c-8f61dd000dae",
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
  "arrived_at": "2026-10-30T09:45:44.603322Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380674008195"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380674008195` → **200**

```json
[
  {
    "phone": "+380674008195",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:45:43.128864623Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674008195` → **200**

```json
[
  {
    "phone": "+380674008195",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:45:43.128864623Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674008195` → **200**

```json
[
  {
    "phone": "+380674008195",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:45:43.128864623Z"
  },
  {
    "phone": "+380674008195",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T09:45:46.138808427Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674008195` → **200**

```json
[
  {
    "phone": "+380674008195",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:45:43.128864623Z"
  },
  {
    "phone": "+380674008195",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T09:45:46.138808427Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380674008195` → **200**

```json
[
  {
    "phone": "+380674008195",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:45:43.128864623Z"
  },
  {
    "phone": "+380674008195",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T09:45:46.138808427Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/4b677cb1-c00f-4ecb-aef9-c616a3e3bb33/start` → **200**

```json
{
  "command_id": "0a80507e-eb0e-40bc-abe1-1bc3c29abab3",
  "expected_version": 1
}
```

```json
{
  "id": "4b677cb1-c00f-4ecb-aef9-c616a3e3bb33",
  "order_id": "94675f5f-3b73-4583-9b7c-247a743ea319",
  "assignment_id": "f2cc8e51-343c-4404-985c-8f61dd000dae",
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
  "arrived_at": "2026-10-30T09:45:44.603322Z",
  "started_at": "2026-10-30T09:45:47.04521Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380674008195"
  }
}
```

`POST /api/driver/v1/trips/4b677cb1-c00f-4ecb-aef9-c616a3e3bb33/complete` → **200**

```json
{
  "command_id": "d4e9eeb4-82b4-47b4-b029-aa965c36f798",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:45:47Z",
  "cash_received": true
}
```

```json
{
  "id": "4b677cb1-c00f-4ecb-aef9-c616a3e3bb33",
  "order_id": "94675f5f-3b73-4583-9b7c-247a743ea319",
  "assignment_id": "f2cc8e51-343c-4404-985c-8f61dd000dae",
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
  "arrived_at": "2026-10-30T09:45:44.603322Z",
  "started_at": "2026-10-30T09:45:47.04521Z",
  "completed_at": "2026-10-30T09:45:47.359106Z",
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
  "session_id": "8cbfb7fc-6e4a-4836-a34a-1fb3a4b0e5c3",
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
  "last_heartbeat_at": "2026-10-30T09:45:44.270556Z",
  "last_location_at": "2026-10-30T09:45:44.270556Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8cbfb7fc-6e4a-4836-a34a-1fb3a4b0e5c3/close` → **200**

```json
{
  "command_id": "5d29bb08-e5d5-4ddf-a6b9-197c3a2d331c",
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
  "phone": "+380637883934",
  "device_ref": "sandbox-18228"
}
```

```json
{
  "challenge_id": "1d0011c2-b764-4761-8211-3c0e7b5bfac7",
  "expires_at": "2026-10-30T09:50:48.295039931Z",
  "resend_available_at": "2026-10-30T09:45:49.295039931Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637883934` → **200**

```json
{
  "phone": "+380637883934",
  "audience": "CLIENT",
  "code": "708130",
  "sent_at": "2026-10-30T09:45:48.299267989Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d0011c2-b764-4761-8211-3c0e7b5bfac7",
  "code": "708130",
  "device_ref": "sandbox-18228"
}
```

```json
{
  "session_id": "b9c312f1-d38c-4ee4-b080-fb22292b9550",
  "subject": {
    "type": "CLIENT",
    "id": "79c32034-debd-474a-aa50-c4ccf2d59920"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3OWMzMjAzNC1kZWJkLTQ3NGEtYWE1MC1jNGNjZjJkNTk5MjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NDQ4LCJpYXQiOjE3OTMzNTM1NDgsImp0aSI6IjFkYzgzYmM3LTA4YTEtNDlmMy04ODQ4LTg3OGY2ZTg2NmJkZSIsInNpZCI6ImI5YzMxMmYxLWQzOGMtNGVlNC1iMDgwLWZiMjIyOTJiOTU1MCJ9.fEvoH3SVINrRrvlpDUTMyaMc5FYwmJipPkyInEP_AGI",
  "access_expires_at": "2026-10-30T10:00:48.6215059Z",
  "refresh_token": "_1DRiZOU04QxF-rq1YqITWoQlDuqpEBQnc5Kk2jFtd0",
  "refresh_expires_at": "2026-11-29T09:45:48.620944673Z",
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
        "ru": "Передумал ехать",
        "pl": "Zmiana planów",
        "uk": "Передумав їхати",
        "en": "Changed my mind"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто",
        "en": "The wait is too long"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "ru": "Ошибся адресом",
        "pl": "Błędny adres",
        "uk": "Помилився адресою",
        "en": "Wrong address"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "ru": "Уеду на другом транспорте",
        "pl": "Inny transport",
        "uk": "Поїду іншим транспортом",
        "en": "Found other transport"
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
  "device_ref": "sandbox-21096"
}
```

```json
{
  "challenge_id": "89a00159-586e-44d7-b0f4-8c6b3f1e86fa",
  "expires_at": "2026-10-30T09:50:49.191458822Z",
  "resend_available_at": "2026-10-30T09:45:50.191458822Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "010992",
  "sent_at": "2026-10-30T09:45:49.194582097Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "89a00159-586e-44d7-b0f4-8c6b3f1e86fa",
  "code": "010992",
  "device_ref": "sandbox-21096"
}
```

```json
{
  "session_id": "85fe801a-561d-43de-820a-246c7a766717",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDQ0OSwiaWF0IjoxNzkzMzUzNTQ5LCJqdGkiOiI2MTQyMDQ4OC05YmQ1LTQ4MGUtYmJjMC0xZGUwMThjYTYxYjQiLCJzaWQiOiI4NWZlODAxYS01NjFkLTQzZGUtODIwYS0yNDZjN2E3NjY3MTcifQ.sDgd6YRsGwt4wvf0pJlunrGkbvl5CNmfTZIVtmF5_Gg",
  "access_expires_at": "2026-10-30T10:00:49.509197078Z",
  "refresh_token": "lmf3qGsgLzMEwydQPmfKd4uQRX67E2-YtjMekwlUyAg",
  "refresh_expires_at": "2026-11-29T09:45:49.508625331Z",
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
        "ru": "Пассажир не вышел",
        "pl": "Pasażer nie przyszedł",
        "uk": "Пасажир не вийшов",
        "en": "Passenger did not show up"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "ru": "Неисправность автомобиля",
        "pl": "Awaria samochodu",
        "uk": "Несправність автомобіля",
        "en": "Vehicle problem"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "ru": "Не могу подъехать",
        "pl": "Nie mogę dojechać",
        "uk": "Не можу під'їхати",
        "en": "Cannot reach the pickup"
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
  "session_id": "65e00c23-c45f-4224-93b2-9614cb37acd8",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ0NTAsImlhdCI6MTc5MzM1MzU1MCwianRpIjoiYzAzYzFkODctZTJiYi00NzdkLTgyNmUtZTJiYThmODQ4MTY5Iiwic2lkIjoiNjVlMDBjMjMtYzQ1Zi00MjI0LTkzYjItOTYxNGNiMzdhY2Q4In0.kOCupK-Iot8pVVgvZqxlsLUTZ13MPRvvBWbQzftqurw",
  "access_expires_at": "2026-10-30T10:00:50.381557505Z",
  "refresh_token": "1IGLM7nGgXlhktK4KUrdiponnEQ3mO2LqRWsNNEQJHg",
  "refresh_expires_at": "2026-10-30T21:45:50.38097815Z",
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
  "session_id": "cd51badf-d548-4f31-8691-faee41859e59",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ0NTAsImlhdCI6MTc5MzM1MzU1MCwianRpIjoiOTRiYzc1OGEtMzkwNi00M2Y4LTk5ZTUtZDE2ODcxYjY1NmFlIiwic2lkIjoiY2Q1MWJhZGYtZDU0OC00ZjMxLTg2OTEtZmFlZTQxODU5ZTU5In0.mAg-DG7QNVzOBs-sG6pTloEw-vNOR08xmYUrOCn02Lc",
  "access_expires_at": "2026-10-30T10:00:50.97871638Z",
  "refresh_token": "ABusUYQwUbRQeESDLq7B70ZKpisyXdesgOotJClHgHs",
  "refresh_expires_at": "2026-10-30T21:45:50.977994273Z",
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
        "ru": "Пассажир попросил",
        "pl": "Na prośbę pasażera",
        "uk": "Пасажир попросив",
        "en": "Passenger asked"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "ru": "Дубль заказа",
        "pl": "Duplikat zamówienia",
        "uk": "Дубль замовлення",
        "en": "Duplicate order"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "ru": "Нет свободных машин",
        "pl": "Brak wolnych aut",
        "uk": "Немає вільних авто",
        "en": "No cars available"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "ru": "Тестовый заказ",
        "pl": "Zamówienie testowe",
        "uk": "Тестове замовлення",
        "en": "Test order"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "ru": "Ошибка оператора",
        "pl": "Błąd operatora",
        "uk": "Помилка оператора",
        "en": "Operator error"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "ru": "ДТП",
        "pl": "Wypadek",
        "uk": "ДТП",
        "en": "Accident"
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
  "command_id": "85d1efc5-36ac-48ee-a8b6-438282e1eb6e",
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
  "id": "2ad50653-bba9-48ec-9db4-fb76b8e578c7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:50:51.572133Z",
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
  "command_id": "2c8842d7-7a8e-4832-b4e0-c5df939801e4",
  "quote_id": "2ad50653-bba9-48ec-9db4-fb76b8e578c7",
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
  "id": "46166b8f-312f-4b47-b8a9-1ecf2aab984e",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "79c32034-debd-474a-aa50-c4ccf2d59920",
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
  "created_at": "2026-10-30T09:45:51.886675Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/46166b8f-312f-4b47-b8a9-1ecf2aab984e` → **200**

```json
{
  "id": "46166b8f-312f-4b47-b8a9-1ecf2aab984e",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "79c32034-debd-474a-aa50-c4ccf2d59920",
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
  "created_at": "2026-10-30T09:45:51.886675Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/46166b8f-312f-4b47-b8a9-1ecf2aab984e/cancel` → **200**

```json
{
  "command_id": "1e09559c-f9f9-4af6-8d4d-f2746a18b498",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "46166b8f-312f-4b47-b8a9-1ecf2aab984e",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "79c32034-debd-474a-aa50-c4ccf2d59920",
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
  "created_at": "2026-10-30T09:45:51.886675Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "ru": "Долго ждать машину",
      "pl": "Zbyt długie oczekiwanie",
      "uk": "Довго чекати авто",
      "en": "The wait is too long"
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
  "command_id": "4e277502-f5f9-48ac-a916-b85a2e22ae49",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:45:53Z",
    "sequence": 1793353553143
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "976c035d-ae94-4f71-bae4-1cae93e1fc4c",
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
  "last_heartbeat_at": "2026-10-30T09:45:53.163063Z",
  "last_location_at": "2026-10-30T09:45:53.163063Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-8925"
}
```

```json
{
  "challenge_id": "480efe5c-c2a0-451c-88e2-a65f913275ff",
  "expires_at": "2026-10-30T09:50:53.453063309Z",
  "resend_available_at": "2026-10-30T09:45:54.453063309Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "982135",
  "sent_at": "2026-10-30T09:45:53.456036927Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "480efe5c-c2a0-451c-88e2-a65f913275ff",
  "code": "982135",
  "device_ref": "sandbox-8925"
}
```

```json
{
  "session_id": "da973310-06dd-450c-911c-0190613a674b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDQ1MywiaWF0IjoxNzkzMzUzNTUzLCJqdGkiOiI4NzQ3YjMxMy1iY2I2LTQzZWUtOTM5MC0xM2ViODNhN2U5ZDQiLCJzaWQiOiJkYTk3MzMxMC0wNmRkLTQ1MGMtOTExYy0wMTkwNjEzYTY3NGIifQ.2-dmWTnkRrqlxzI3PQ1r1mI_8cOJ4I1PGGkePG7uHOc",
  "access_expires_at": "2026-10-30T10:00:53.77637384Z",
  "refresh_token": "3eX1VBZ8oMy_mlluGLQiXkD8zkpGFPWECuPrio6ILVU",
  "refresh_expires_at": "2026-11-29T09:45:53.775752282Z",
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
  "command_id": "febd2b54-b0af-4732-97ff-612a990b89c7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:45:54Z",
    "sequence": 1793353554350
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "edb27c5f-f0a9-4f54-8b3c-371f163866b4",
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
  "last_heartbeat_at": "2026-10-30T09:45:54.371089Z",
  "last_location_at": "2026-10-30T09:45:54.371089Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "024bbe42-771e-4124-8470-5e5bdb6aa027",
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
  "id": "efe2fdb8-9e69-41c7-84e2-9e3f5f53c702",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:50:54.688302Z",
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
  "command_id": "5f048e07-7c7c-4dca-8eab-9f9a3687c730",
  "quote_id": "efe2fdb8-9e69-41c7-84e2-9e3f5f53c702",
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
  "id": "7e2caae9-480c-4715-addd-5d4c44d85bab",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "79c32034-debd-474a-aa50-c4ccf2d59920",
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
  "created_at": "2026-10-30T09:45:54.999357Z",
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
    "id": "fce758be-e2d6-44ca-b806-5dd191d52516",
    "order_id": "7e2caae9-480c-4715-addd-5d4c44d85bab",
    "expires_at": "2026-10-30T09:46:10.003129Z",
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

`POST /api/driver/v1/offers/fce758be-e2d6-44ca-b806-5dd191d52516/accept` → **200**

```json
{
  "command_id": "d65be189-43b8-4376-838e-0e0deb9329a6"
}
```

```json
{
  "id": "27dbd9f6-5005-4ebc-89a2-fbe4b5de75b2",
  "order_id": "7e2caae9-480c-4715-addd-5d4c44d85bab",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "10d1df71-8415-4b81-b40e-2532340bc02c",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "10d1df71-8415-4b81-b40e-2532340bc02c",
  "order_id": "7e2caae9-480c-4715-addd-5d4c44d85bab",
  "assignment_id": "27dbd9f6-5005-4ebc-89a2-fbe4b5de75b2",
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

`POST /api/driver/v1/trips/10d1df71-8415-4b81-b40e-2532340bc02c/cancel` → **200**

```json
{
  "command_id": "28fe4fd0-f9d5-4416-9425-42564f459488",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "10d1df71-8415-4b81-b40e-2532340bc02c",
  "order_id": "7e2caae9-480c-4715-addd-5d4c44d85bab",
  "assignment_id": "27dbd9f6-5005-4ebc-89a2-fbe4b5de75b2",
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

`GET /api/rider/v1/orders/7e2caae9-480c-4715-addd-5d4c44d85bab` → **200**

```json
{
  "id": "7e2caae9-480c-4715-addd-5d4c44d85bab",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "79c32034-debd-474a-aa50-c4ccf2d59920",
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
    "id": "27dbd9f6-5005-4ebc-89a2-fbe4b5de75b2",
    "order_id": "7e2caae9-480c-4715-addd-5d4c44d85bab",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "10d1df71-8415-4b81-b40e-2532340bc02c",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:45:54.999357Z",
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
    "id": "8756569a-2a25-4b59-85ea-32a21ddd33fa",
    "order_id": "7e2caae9-480c-4715-addd-5d4c44d85bab",
    "expires_at": "2026-10-30T09:46:11.232096Z",
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

`POST /api/driver/v1/offers/8756569a-2a25-4b59-85ea-32a21ddd33fa/accept` → **200**

```json
{
  "command_id": "f1b621ca-3a5a-4ece-8a29-61bdb7a139c1"
}
```

```json
{
  "id": "15e1ace8-04c7-4867-bb9a-e5a24cab34d5",
  "order_id": "7e2caae9-480c-4715-addd-5d4c44d85bab",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "057fa380-8ba2-4a33-b28a-0deb1dc4ffec",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "057fa380-8ba2-4a33-b28a-0deb1dc4ffec",
  "order_id": "7e2caae9-480c-4715-addd-5d4c44d85bab",
  "assignment_id": "15e1ace8-04c7-4867-bb9a-e5a24cab34d5",
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

`POST /api/driver/v1/trips/057fa380-8ba2-4a33-b28a-0deb1dc4ffec/cancel` → **200**

```json
{
  "command_id": "27bd194d-4e8e-486a-a731-2e80187e8e50",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "057fa380-8ba2-4a33-b28a-0deb1dc4ffec",
  "order_id": "7e2caae9-480c-4715-addd-5d4c44d85bab",
  "assignment_id": "15e1ace8-04c7-4867-bb9a-e5a24cab34d5",
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
    "id": "7e2caae9-480c-4715-addd-5d4c44d85bab",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-30T09:45:54.999357Z",
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
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel"
      }
    },
    "pickup_at": null
  },
  {
    "id": "46166b8f-312f-4b47-b8a9-1ecf2aab984e",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T09:45:51.886675Z",
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
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто",
        "en": "The wait is too long"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/7e2caae9-480c-4715-addd-5d4c44d85bab/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:45:55.000076Z",
      "actor": {
        "type": "CLIENT",
        "id": "79c32034-debd-474a-aa50-c4ccf2d59920",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "7e2caae9-480c-4715-addd-5d4c44d85bab",
        "quote_id": "efe2fdb8-9e69-41c7-84e2-9e3f5f53c702",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "7a8640e4-e0e0-4bda-82d8-b18f3cee936d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:45:55.002228Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7e2caae9-480c-4715-addd-5d4c44d85bab",
        "attempt_id": "4ad0cbd5-72c3-4e92-9812-f9c3f1b24585",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7a8640e4-e0e0-4bda-82d8-b18f3cee936d"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:45:55.009326Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "fce758be-e2d6-44ca-b806-5dd191d52516",
        "order_id": "7e2caae9-480c-4715-addd-5d4c44d85bab",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "7a8640e4-e0e0-4bda-82d8-b18f3cee936d"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T09:45:55.625664Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "fce758be-e2d6-44ca-b806-5dd191d52516",
        "order_id": "7e2caae9-480c-4715-addd-5d4c44d85bab",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "27dbd9f6-5005-4ebc-89a2-fbe4b5de75b2"
      },
      "correlation_id": "18aa368f-f1af-4168-b201-f1eeb8773ca0"
```

Done: orders 46166b8f-312f-4b47-b8a9-1ecf2aab984e, 7e2caae9-480c-4715-addd-5d4c44d85bab.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380736273412",
  "device_ref": "sandbox-20633"
}
```

```json
{
  "challenge_id": "42efb9bc-f02f-4b61-930f-07f8e2491e6e",
  "expires_at": "2026-10-30T09:50:58.671463921Z",
  "resend_available_at": "2026-10-30T09:45:59.671463921Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380736273412` → **200**

```json
{
  "phone": "+380736273412",
  "audience": "CLIENT",
  "code": "077259",
  "sent_at": "2026-10-30T09:45:58.674860944Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "42efb9bc-f02f-4b61-930f-07f8e2491e6e",
  "code": "077259",
  "device_ref": "sandbox-20633"
}
```

```json
{
  "session_id": "1c9c25ff-9086-4a2a-91ea-9f6d0a0573ab",
  "subject": {
    "type": "CLIENT",
    "id": "e33aa1b0-d360-4e21-9c3c-3132fcd8a6b1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzNhYTFiMC1kMzYwLTRlMjEtOWMzYy0zMTMyZmNkOGE2YjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NDU4LCJpYXQiOjE3OTMzNTM1NTgsImp0aSI6IjJmNjFlNjI4LThmNTYtNDJlMC1iY2M3LWJkOTc1ZTAxNDU2YiIsInNpZCI6IjFjOWMyNWZmLTkwODYtNGEyYS05MWVhLTlmNmQwYTA1NzNhYiJ9.6I6eYYvB8z6aXRIA9VcCU8BYjiwa-IQDG-nunmxxfyg",
  "access_expires_at": "2026-10-30T10:00:58.998194738Z",
  "refresh_token": "6MaqVq49Vx_VmkowF2bxDhVnZERHOVfqXuA09nTp3U4",
  "refresh_expires_at": "2026-11-29T09:45:58.997573559Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "4139ff2f-a188-49c9-896a-2548471e6b41",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "1b652aba-463d-41c2-a10c-0f0576312d81",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-1b652aba-463d-41c2-a10c-0f0576312d81",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "466db4bcd538ed7f3865a7a573c630c4",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=1b652aba-463d-41c2-a10c-0f0576312d81",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736273412"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=1b652aba-463d-41c2-a10c-0f0576312d81",
  "expires_at": "2026-10-30T10:15:59.297353Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/1b652aba-463d-41c2-a10c-0f0576312d81` → **200**

```json
{
  "id": "1b652aba-463d-41c2-a10c-0f0576312d81",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:15:59.297353Z",
  "card": {
    "id": "c94b9f66-9a1c-4fc3-a5b3-2f28414441aa",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9700",
    "card_type": "Visa",
    "created_at": "2026-10-30T09:45:59.599706Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "c94b9f66-9a1c-4fc3-a5b3-2f28414441aa",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****9700",
      "card_type": "Visa",
      "created_at": "2026-10-30T09:45:59.599706Z"
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
  "device_ref": "sandbox-7709"
}
```

```json
{
  "challenge_id": "6235705d-e6e3-49e0-9369-be0e9acd8f11",
  "expires_at": "2026-10-30T09:51:00.208520416Z",
  "resend_available_at": "2026-10-30T09:46:01.208520416Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "087799",
  "sent_at": "2026-10-30T09:46:00.211459288Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6235705d-e6e3-49e0-9369-be0e9acd8f11",
  "code": "087799",
  "device_ref": "sandbox-7709"
}
```

```json
{
  "session_id": "2c620f76-d1e3-4ef5-bb84-cb6c7b5220fe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDQ2MCwiaWF0IjoxNzkzMzUzNTYwLCJqdGkiOiJhMDFiOGU5Yi01NWY0LTRkYzctYTY4MS02NTk0NTU3OTA2MjgiLCJzaWQiOiIyYzYyMGY3Ni1kMWUzLTRlZjUtYmI4NC1jYjZjN2I1MjIwZmUifQ.O_jnsbxfSmOJ-lrhDsPRpkbsltL3g6-CCauSzZBvKxs",
  "access_expires_at": "2026-10-30T10:01:00.538243505Z",
  "refresh_token": "4GsA8gPiNyXGrWFEvqx67DMZEBqLdaMIlKN6RneIna0",
  "refresh_expires_at": "2026-11-29T09:46:00.537594024Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "edb27c5f-f0a9-4f54-8b3c-371f163866b4",
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
  "last_heartbeat_at": "2026-10-30T09:45:54.371089Z",
  "last_location_at": "2026-10-30T09:45:54.371089Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/edb27c5f-f0a9-4f54-8b3c-371f163866b4/handover` → **200**

```json
{
  "command_id": "beb5b49d-ec0a-4874-8672-a4113fa57e1f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "edb27c5f-f0a9-4f54-8b3c-371f163866b4",
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
  "last_heartbeat_at": "2026-10-30T09:45:54.371089Z",
  "last_location_at": "2026-10-30T09:45:54.371089Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/edb27c5f-f0a9-4f54-8b3c-371f163866b4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:46:01Z",
    "sequence": 1793353561425
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "edb27c5f-f0a9-4f54-8b3c-371f163866b4",
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
  "last_heartbeat_at": "2026-10-30T09:46:01.444789Z",
  "last_location_at": "2026-10-30T09:46:01.444789Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b0da4b4c-057f-4b58-b487-8dbc7a0898eb",
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
  "id": "660fc8ec-c7ac-4d6f-b306-bd971eb64962",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:51:01.747681Z",
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
  "command_id": "7aaa3921-2a0e-410e-bdc9-217ca3853af9",
  "quote_id": "660fc8ec-c7ac-4d6f-b306-bd971eb64962",
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
  "id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e33aa1b0-d360-4e21-9c3c-3132fcd8a6b1",
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
  "created_at": "2026-10-30T09:46:02.063505Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/678b11c6-4b18-4a40-9ed3-d7d502236214` → **200**

```json
{
  "id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e33aa1b0-d360-4e21-9c3c-3132fcd8a6b1",
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
  "created_at": "2026-10-30T09:46:02.063505Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/678b11c6-4b18-4a40-9ed3-d7d502236214` → **200**

```json
{
  "id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e33aa1b0-d360-4e21-9c3c-3132fcd8a6b1",
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
  "created_at": "2026-10-30T09:46:02.063505Z",
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
    "id": "116992fc-4bc1-45b5-a80f-88cfcd937b09",
    "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
    "expires_at": "2026-10-30T09:46:17.601748Z",
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

`POST /api/driver/v1/offers/116992fc-4bc1-45b5-a80f-88cfcd937b09/accept` → **200**

```json
{
  "command_id": "cb03009b-b109-4602-b36d-b723a4a58d75"
}
```

```json
{
  "id": "5b41da41-361b-449d-a034-d3b07c25c146",
  "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2465df17-263c-4097-b5d3-a222656228a8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2465df17-263c-4097-b5d3-a222656228a8",
  "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
  "assignment_id": "5b41da41-361b-449d-a034-d3b07c25c146",
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

`POST /api/driver/v1/work-sessions/edb27c5f-f0a9-4f54-8b3c-371f163866b4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:46:04Z",
    "sequence": 1793353564925
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "edb27c5f-f0a9-4f54-8b3c-371f163866b4",
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
  "last_heartbeat_at": "2026-10-30T09:46:04.945506Z",
  "last_location_at": "2026-10-30T09:46:04.945506Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2465df17-263c-4097-b5d3-a222656228a8/arrive` → **200**

```json
{
  "command_id": "0b6dd5d8-98dc-42e4-ba98-1334a8fe3a73",
  "expected_version": 0
}
```

```json
{
  "id": "2465df17-263c-4097-b5d3-a222656228a8",
  "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
  "assignment_id": "5b41da41-361b-449d-a034-d3b07c25c146",
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
  "arrived_at": "2026-10-30T09:46:05.258191Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2465df17-263c-4097-b5d3-a222656228a8/start` → **200**

```json
{
  "command_id": "dd754e55-2e80-415a-b609-f075553edd24",
  "expected_version": 1
}
```

```json
{
  "id": "2465df17-263c-4097-b5d3-a222656228a8",
  "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
  "assignment_id": "5b41da41-361b-449d-a034-d3b07c25c146",
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
  "arrived_at": "2026-10-30T09:46:05.258191Z",
  "started_at": "2026-10-30T09:46:05.579409Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2465df17-263c-4097-b5d3-a222656228a8/complete` → **200**

```json
{
  "command_id": "8ec16398-f7db-4106-a3a6-fd2b5b8c5cb2",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:46:05Z",
  "cash_received": true
}
```

```json
{
  "id": "2465df17-263c-4097-b5d3-a222656228a8",
  "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
  "assignment_id": "5b41da41-361b-449d-a034-d3b07c25c146",
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
  "arrived_at": "2026-10-30T09:46:05.258191Z",
  "started_at": "2026-10-30T09:46:05.579409Z",
  "completed_at": "2026-10-30T09:46:05.907176Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/678b11c6-4b18-4a40-9ed3-d7d502236214` → **200**

```json
{
  "id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "e33aa1b0-d360-4e21-9c3c-3132fcd8a6b1",
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
    "id": "5b41da41-361b-449d-a034-d3b07c25c146",
    "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2465df17-263c-4097-b5d3-a222656228a8",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:46:02.063505Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/678b11c6-4b18-4a40-9ed3-d7d502236214` → **200**

```json
{
  "id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "e33aa1b0-d360-4e21-9c3c-3132fcd8a6b1",
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
    "id": "5b41da41-361b-449d-a034-d3b07c25c146",
    "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2465df17-263c-4097-b5d3-a222656228a8",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:46:02.063505Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/678b11c6-4b18-4a40-9ed3-d7d502236214` → **200**

```json
{
  "id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "e33aa1b0-d360-4e21-9c3c-3132fcd8a6b1",
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
    "id": "5b41da41-361b-449d-a034-d3b07c25c146",
    "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2465df17-263c-4097-b5d3-a222656228a8",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:46:02.063505Z",
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

`GET /api/rider/v1/orders/678b11c6-4b18-4a40-9ed3-d7d502236214/tip` → **200**

```json
{
  "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
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
  "available_until": "2026-10-31T09:46:05.907176Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/678b11c6-4b18-4a40-9ed3-d7d502236214/tip` → **201**

```json
{
  "command_id": "c3e03fe7-8e49-4b58-9c23-ade1abff3715",
  "amount_minor": 2500
}
```

```json
{
  "id": "7a23c65c-fa44-428e-8bf8-2bcf1c717c35",
  "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T09:46:09.757713Z"
}
```

`GET /api/rider/v1/orders/678b11c6-4b18-4a40-9ed3-d7d502236214/tip` → **200**

```json
{
  "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
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
  "available_until": "2026-10-31T09:46:05.907176Z",
  "open": false,
  "tip": {
    "id": "7a23c65c-fa44-428e-8bf8-2bcf1c717c35",
    "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T09:46:09.757713Z"
  }
}
```

`GET /api/rider/v1/orders/678b11c6-4b18-4a40-9ed3-d7d502236214/tip` → **200**

```json
{
  "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
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
  "available_until": "2026-10-31T09:46:05.907176Z",
  "open": false,
  "tip": {
    "id": "7a23c65c-fa44-428e-8bf8-2bcf1c717c35",
    "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T09:46:09.757713Z"
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
      "id": "0dbf8750-dfb5-46ba-9be3-92e5c1b4e74f",
      "at": "2026-10-30T09:46:06.679829Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
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
      "id": "d5b073cd-49bf-476a-802d-009444dccb36",
      "at": "2026-10-30T09:46:11.735637Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
      "counterpart_id": null
    },
    {
      "id": "0dbf8750-dfb5-46ba-9be3-92e5c1b4e74f",
      "at": "2026-10-30T09:46:06.679829Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6d637c23-29d9-485b-84e0-95507ee36352",
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
  "id": "0269c7a6-9ea8-4194-ab84-be5563798430",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:51:13.283103Z",
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
  "session_id": "8302451c-e6a6-4b3e-aba0-2e3bf6656520",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ0NzMsImlhdCI6MTc5MzM1MzU3MywianRpIjoiZDllMzRhMzktYTU4Yi00NGFjLWJjODAtMGNlYTFlYzQ4YTQwIiwic2lkIjoiODMwMjQ1MWMtZTZhNi00YjNlLWFiYTAtMmUzYmY2NjU2NTIwIn0.H9Hggg2aak-dUI_2vTEwWe_cDqgK7N3-5XGfclu4JbY",
  "access_expires_at": "2026-10-30T10:01:13.916529542Z",
  "refresh_token": "5bvtPKyO39QCEQGGbWPeJe5rJVT4sZ_l2eF0cLdiASM",
  "refresh_expires_at": "2026-10-30T21:46:13.915878969Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380736273412` → **200**

```json
{
  "client_id": "e33aa1b0-d360-4e21-9c3c-3132fcd8a6b1"
}
```

`POST /api/admin/v1/rider-wallets/e33aa1b0-d360-4e21-9c3c-3132fcd8a6b1/top-ups` → **201**

```json
{
  "command_id": "55c9dcc5-0d9c-48bd-9c2b-47ff87fd0015",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "e33aa1b0-d360-4e21-9c3c-3132fcd8a6b1",
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
      "id": "045c28e2-227c-48f0-b66d-9196c2f424da",
      "at": "2026-10-30T09:46:14.545221Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "217e8fc6-6f01-4dec-a78f-3bfdc1fefb00",
  "quote_id": "0269c7a6-9ea8-4194-ab84-be5563798430",
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
  "id": "0c959686-5d9f-4c29-9603-dc13b3451d52",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e33aa1b0-d360-4e21-9c3c-3132fcd8a6b1",
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
  "created_at": "2026-10-30T09:46:14.861637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0c959686-5d9f-4c29-9603-dc13b3451d52` → **200**

```json
{
  "id": "0c959686-5d9f-4c29-9603-dc13b3451d52",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e33aa1b0-d360-4e21-9c3c-3132fcd8a6b1",
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
  "created_at": "2026-10-30T09:46:14.861637Z",
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
    "id": "df0c1eca-a604-4272-a599-a9ef1c87be05",
    "order_id": "0c959686-5d9f-4c29-9603-dc13b3451d52",
    "expires_at": "2026-10-30T09:46:29.866637Z",
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

`POST /api/driver/v1/offers/df0c1eca-a604-4272-a599-a9ef1c87be05/accept` → **200**

```json
{
  "command_id": "e97a4d07-ba03-4863-9e42-f35f79f2d891"
}
```

```json
{
  "id": "10db82c9-d988-47d9-9db9-c23494187f89",
  "order_id": "0c959686-5d9f-4c29-9603-dc13b3451d52",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ad514945-69fe-4d34-b105-966c324c3f49",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ad514945-69fe-4d34-b105-966c324c3f49",
  "order_id": "0c959686-5d9f-4c29-9603-dc13b3451d52",
  "assignment_id": "10db82c9-d988-47d9-9db9-c23494187f89",
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

`POST /api/driver/v1/work-sessions/edb27c5f-f0a9-4f54-8b3c-371f163866b4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:46:16Z",
    "sequence": 1793353576387
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "edb27c5f-f0a9-4f54-8b3c-371f163866b4",
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
  "last_heartbeat_at": "2026-10-30T09:46:16.407733Z",
  "last_location_at": "2026-10-30T09:46:16.407733Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ad514945-69fe-4d34-b105-966c324c3f49/arrive` → **200**

```json
{
  "command_id": "2a4301c8-c846-4805-8c7a-0375cd778e46",
  "expected_version": 0
}
```

```json
{
  "id": "ad514945-69fe-4d34-b105-966c324c3f49",
  "order_id": "0c959686-5d9f-4c29-9603-dc13b3451d52",
  "assignment_id": "10db82c9-d988-47d9-9db9-c23494187f89",
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
  "arrived_at": "2026-10-30T09:46:16.705386Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ad514945-69fe-4d34-b105-966c324c3f49/start` → **200**

```json
{
  "command_id": "51deabba-bfbe-45a9-83c5-8fe4def3a30f",
  "expected_version": 1
}
```

```json
{
  "id": "ad514945-69fe-4d34-b105-966c324c3f49",
  "order_id": "0c959686-5d9f-4c29-9603-dc13b3451d52",
  "assignment_id": "10db82c9-d988-47d9-9db9-c23494187f89",
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
  "arrived_at": "2026-10-30T09:46:16.705386Z",
  "started_at": "2026-10-30T09:46:17.009989Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ad514945-69fe-4d34-b105-966c324c3f49/complete` → **200**

```json
{
  "command_id": "a742d507-6202-4ff1-9a8f-d49ccc920ca9",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:46:17Z",
  "cash_received": true
}
```

```json
{
  "id": "ad514945-69fe-4d34-b105-966c324c3f49",
  "order_id": "0c959686-5d9f-4c29-9603-dc13b3451d52",
  "assignment_id": "10db82c9-d988-47d9-9db9-c23494187f89",
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
  "arrived_at": "2026-10-30T09:46:16.705386Z",
  "started_at": "2026-10-30T09:46:17.009989Z",
  "completed_at": "2026-10-30T09:46:17.323648Z",
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
  "client_id": "e33aa1b0-d360-4e21-9c3c-3132fcd8a6b1",
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
      "id": "045c28e2-227c-48f0-b66d-9196c2f424da",
      "at": "2026-10-30T09:46:14.545221Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
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

`GET /api/rider/v1/orders/0c959686-5d9f-4c29-9603-dc13b3451d52/tip` → **200**

```json
{
  "order_id": "0c959686-5d9f-4c29-9603-dc13b3451d52",
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
  "available_until": "2026-10-31T09:46:17.323648Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/0c959686-5d9f-4c29-9603-dc13b3451d52/tip` → **201**

```json
{
  "command_id": "74dd79f5-94b6-40ae-8d89-d72dd796a687",
  "amount_minor": 2500
}
```

```json
{
  "id": "4258dcd4-9821-48f9-aaa5-6a3ee6ca0a01",
  "order_id": "0c959686-5d9f-4c29-9603-dc13b3451d52",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T09:46:18.549196Z"
}
```

`GET /api/rider/v1/orders/0c959686-5d9f-4c29-9603-dc13b3451d52/tip` → **200**

```json
{
  "order_id": "0c959686-5d9f-4c29-9603-dc13b3451d52",
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
  "available_until": "2026-10-31T09:46:17.323648Z",
  "open": false,
  "tip": {
    "id": "4258dcd4-9821-48f9-aaa5-6a3ee6ca0a01",
    "order_id": "0c959686-5d9f-4c29-9603-dc13b3451d52",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T09:46:18.549196Z"
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
      "id": "4b2d9627-4ead-48aa-b7d5-aa9be635739a",
      "at": "2026-10-30T09:46:17.783643Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0c959686-5d9f-4c29-9603-dc13b3451d52",
      "counterpart_id": null
    },
    {
      "id": "d5b073cd-49bf-476a-802d-009444dccb36",
      "at": "2026-10-30T09:46:11.735637Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
      "counterpart_id": null
    },
    {
      "id": "0dbf8750-dfb5-46ba-9be3-92e5c1b4e74f",
      "at": "2026-10-30T09:46:06.679829Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
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
      "id": "ff8fff0f-545e-495b-8251-51687373c005",
      "at": "2026-10-30T09:46:19.812423Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0c959686-5d9f-4c29-9603-dc13b3451d52",
      "counterpart_id": null
    },
    {
      "id": "4b2d9627-4ead-48aa-b7d5-aa9be635739a",
      "at": "2026-10-30T09:46:17.783643Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0c959686-5d9f-4c29-9603-dc13b3451d52",
      "counterpart_id": null
    },
    {
      "id": "d5b073cd-49bf-476a-802d-009444dccb36",
      "at": "2026-10-30T09:46:11.735637Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
      "counterpart_id": null
    },
    {
      "id": "0dbf8750-dfb5-46ba-9be3-92e5c1b4e74f",
      "at": "2026-10-30T09:46:06.679829Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "678b11c6-4b18-4a40-9ed3-d7d502236214",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "edb27c5f-f0a9-4f54-8b3c-371f163866b4",
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
  "last_heartbeat_at": "2026-10-30T09:46:16.407733Z",
  "last_location_at": "2026-10-30T09:46:16.407733Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/edb27c5f-f0a9-4f54-8b3c-371f163866b4/close` → **200**

```json
{
  "command_id": "f9dc29b3-c612-4d74-9b3e-2626f78b2dd0",
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

Done: card order 0c959686-5d9f-4c29-9603-dc13b3451d52.

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
  "phone": "+380738236030",
  "device_ref": "sandbox-13504"
}
```

```json
{
  "challenge_id": "bfe93057-9f61-4c96-b14d-aec425186abf",
  "expires_at": "2026-10-30T09:51:21.647597241Z",
  "resend_available_at": "2026-10-30T09:46:22.647597241Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738236030` → **200**

```json
{
  "phone": "+380738236030",
  "audience": "CLIENT",
  "code": "104155",
  "sent_at": "2026-10-30T09:46:21.650488608Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bfe93057-9f61-4c96-b14d-aec425186abf",
  "code": "104155",
  "device_ref": "sandbox-13504"
}
```

```json
{
  "session_id": "6d9d2fe1-aa30-449f-a0bb-5d10e4d5d894",
  "subject": {
    "type": "CLIENT",
    "id": "d6bb7d7e-bbb5-44ce-ba1f-f815a883cbc4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmJiN2Q3ZS1iYmI1LTQ0Y2UtYmExZi1mODE1YTg4M2NiYzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NDgxLCJpYXQiOjE3OTMzNTM1ODEsImp0aSI6IjZhYzRhZTY4LTJmNjgtNGQwMi05MmE4LTkwZjFjNzY3YTZhNCIsInNpZCI6IjZkOWQyZmUxLWFhMzAtNDQ5Zi1hMGJiLTVkMTBlNGQ1ZDg5NCJ9.sKcFNX8CPaNtdggloN64nWbvtPkxklJQ6Gx33mC_0j8",
  "access_expires_at": "2026-10-30T10:01:21.972605275Z",
  "refresh_token": "qWiPxUttLwtgpZeXaAP39xCUWbCMSkYqSWormtTQ_8o",
  "refresh_expires_at": "2026-11-29T09:46:21.972099171Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "db446add-0a5a-4050-ac50-80166ff60a7a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "6058a791-20ad-4b38-a1b9-5e6ee57c3ebb",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-6058a791-20ad-4b38-a1b9-5e6ee57c3ebb",
    "orderDate": "1793353582",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "254a480af41006aaf92c4b955697eeb7",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=6058a791-20ad-4b38-a1b9-5e6ee57c3ebb",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738236030"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=6058a791-20ad-4b38-a1b9-5e6ee57c3ebb",
  "created_at": "2026-10-30T09:46:22.281717Z",
  "expires_at": "2026-10-30T10:16:22.281717Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/6058a791-20ad-4b38-a1b9-5e6ee57c3ebb` → **200**

```json
{
  "id": "6058a791-20ad-4b38-a1b9-5e6ee57c3ebb",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T09:46:22.281717Z",
  "expires_at": "2026-10-30T10:16:22.281717Z",
  "completed_at": "2026-10-30T09:46:22.590641Z",
  "masked_pan": "41****8208",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "d6bb7d7e-bbb5-44ce-ba1f-f815a883cbc4",
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
      "id": "7743a4c2-2b68-4892-9578-1f11343074fa",
      "at": "2026-10-30T09:46:22.830599Z",
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
  "client_id": "d6bb7d7e-bbb5-44ce-ba1f-f815a883cbc4",
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
      "id": "7743a4c2-2b68-4892-9578-1f11343074fa",
      "at": "2026-10-30T09:46:22.830599Z",
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
  "device_ref": "sandbox-24039"
}
```

```json
{
  "challenge_id": "9790d686-4af4-40c3-aaa6-210a855180ff",
  "expires_at": "2026-10-30T09:51:23.516761367Z",
  "resend_available_at": "2026-10-30T09:46:24.516761367Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "182057",
  "sent_at": "2026-10-30T09:46:23.519502061Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9790d686-4af4-40c3-aaa6-210a855180ff",
  "code": "182057",
  "device_ref": "sandbox-24039"
}
```

```json
{
  "session_id": "27edbf95-c073-4ff0-9144-67b363626c6a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDQ4MywiaWF0IjoxNzkzMzUzNTgzLCJqdGkiOiI1YmJiMjE5ZC1jZGE0LTQ4NDAtOWU2Zi1iZDFkYjVlOGRiMTYiLCJzaWQiOiIyN2VkYmY5NS1jMDczLTRmZjAtOTE0NC02N2IzNjM2MjZjNmEifQ.n4i_z1V1vwVH5XDEqzPmgQg3dkq_5AbQn75vGs5y33c",
  "access_expires_at": "2026-10-30T10:01:23.850158475Z",
  "refresh_token": "n-NFpY91SAT4brt_bhKbuW6g69lIJzb9AXTexLR0wcw",
  "refresh_expires_at": "2026-11-29T09:46:23.849416585Z",
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
  "command_id": "7d0cc7de-a3a5-43ca-9400-fc0f1f694308",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "d0334a4e-4ae4-4523-aa1d-ceb0e9d05ccc",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-d0334a4e-4ae4-4523-aa1d-ceb0e9d05ccc",
    "orderDate": "1793353584",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "bc77c88f1ff8cd57c643f95496596d91",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=d0334a4e-4ae4-4523-aa1d-ceb0e9d05ccc",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=d0334a4e-4ae4-4523-aa1d-ceb0e9d05ccc",
  "created_at": "2026-10-30T09:46:24.447778Z",
  "expires_at": "2026-10-30T10:16:24.447778Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/d0334a4e-4ae4-4523-aa1d-ceb0e9d05ccc` → **200**

```json
{
  "id": "d0334a4e-4ae4-4523-aa1d-ceb0e9d05ccc",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T09:46:24.447778Z",
  "expires_at": "2026-10-30T10:16:24.447778Z",
  "completed_at": "2026-10-30T09:46:24.745221Z",
  "masked_pan": "41****0744",
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
      "id": "ae995813-18cb-4168-8373-cab5f664f0ab",
      "at": "2026-10-30T09:46:24.838217Z",
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
  "command_id": "ca296bd7-07db-43da-9232-6cfe98623379",
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
  "correlation_id": "e8027731-7f0a-4570-b56d-8eaa81398e6e"
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
  "device_ref": "sandbox-19253"
}
```

```json
{
  "challenge_id": "607e23a9-76b1-4889-b13e-345515e86785",
  "expires_at": "2026-10-30T09:51:25.672174999Z",
  "resend_available_at": "2026-10-30T09:46:26.672174999Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "679463",
  "sent_at": "2026-10-30T09:46:25.674818811Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "607e23a9-76b1-4889-b13e-345515e86785",
  "code": "679463",
  "device_ref": "sandbox-19253"
}
```

```json
{
  "session_id": "61be8013-2667-4c06-82d5-a0bd29799908",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDQ4NiwiaWF0IjoxNzkzMzUzNTg2LCJqdGkiOiJiM2Q2MjI2Yi04NDU4LTRlMWItOGRkNS1kODQyMjAwZGFjODQiLCJzaWQiOiI2MWJlODAxMy0yNjY3LTRjMDYtODJkNS1hMGJkMjk3OTk5MDgifQ.it65A7hRNXrR39_UD9tC90m0FkUCLHCktPVFSyIYSS4",
  "access_expires_at": "2026-10-30T10:01:26.001378593Z",
  "refresh_token": "Rl1xHRD0u3RkXBkis2_3Db-bBuJWGNzimmcyYnyK4Yc",
  "refresh_expires_at": "2026-11-29T09:46:26.0006426Z",
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
  "command_id": "c25084fe-218a-4e09-9b27-314ae9ec2b31",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:46:26Z",
    "sequence": 1793353586587
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ec3cb5e8-d624-494d-8e4b-142927391c26",
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
  "last_heartbeat_at": "2026-10-30T09:46:26.607405Z",
  "last_location_at": "2026-10-30T09:46:26.607405Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631751111",
  "device_ref": "sandbox-13966"
}
```

```json
{
  "challenge_id": "88004068-81f2-4ac8-b927-18ebc3c5c6bf",
  "expires_at": "2026-10-30T09:51:26.90786338Z",
  "resend_available_at": "2026-10-30T09:46:27.90786338Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631751111` → **200**

```json
{
  "phone": "+380631751111",
  "audience": "CLIENT",
  "code": "065491",
  "sent_at": "2026-10-30T09:46:26.910658702Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88004068-81f2-4ac8-b927-18ebc3c5c6bf",
  "code": "065491",
  "device_ref": "sandbox-13966"
}
```

```json
{
  "session_id": "cf0d9739-195d-4cf8-8cad-c50bf92ef2ac",
  "subject": {
    "type": "CLIENT",
    "id": "1f4480a2-d31a-4d44-b5d3-3c533a1ff577"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjQ0ODBhMi1kMzFhLTRkNDQtYjVkMy0zYzUzM2ExZmY1NzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NDg3LCJpYXQiOjE3OTMzNTM1ODcsImp0aSI6ImJiYzhkMjVkLTQ0M2EtNGZmZC1hOTU3LWJmMmJiZjRiZDg1MSIsInNpZCI6ImNmMGQ5NzM5LTE5NWQtNGNmOC04Y2FkLWM1MGJmOTJlZjJhYyJ9.6YT1GqEg_ZEYHZULYuiqohNRRLcyTUbXSsEyA8Xi9F8",
  "access_expires_at": "2026-10-30T10:01:27.229067602Z",
  "refresh_token": "RQxk8gfMgMnqL6vcTrEETHwR6RuVtpCTyJClVLqWBRw",
  "refresh_expires_at": "2026-11-29T09:46:27.228468242Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3909e5c7-b80b-4012-bad7-c6138c93cb08",
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
  "id": "ebbe1e59-0081-4030-beb8-6dc025c9f65a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:51:27.535544Z",
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
  "command_id": "3dec2e50-dfae-4912-a48d-b8c6c09fcd0e",
  "quote_id": "ebbe1e59-0081-4030-beb8-6dc025c9f65a",
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
  "id": "e9375585-c8cc-45e6-94d7-562915f0687b",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1f4480a2-d31a-4d44-b5d3-3c533a1ff577",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:46:27.844213Z",
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
    "id": "2a29ec40-b922-4c90-bd35-9e85de5a60e0",
    "order_id": "e9375585-c8cc-45e6-94d7-562915f0687b",
    "expires_at": "2026-10-30T09:46:42.847674Z",
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

`POST /api/driver/v1/offers/2a29ec40-b922-4c90-bd35-9e85de5a60e0/accept` → **200**

```json
{
  "command_id": "e0086a9b-ca70-48e7-ba1b-d416da7b129a"
}
```

```json
{
  "id": "6e95a30b-31be-4db1-9b09-f181b9786139",
  "order_id": "e9375585-c8cc-45e6-94d7-562915f0687b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2da26b7a-1567-4f2f-8c89-ee5e0010965f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2da26b7a-1567-4f2f-8c89-ee5e0010965f",
  "order_id": "e9375585-c8cc-45e6-94d7-562915f0687b",
  "assignment_id": "6e95a30b-31be-4db1-9b09-f181b9786139",
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

`POST /api/driver/v1/work-sessions/ec3cb5e8-d624-494d-8e4b-142927391c26/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:46:29Z",
    "sequence": 1793353589654
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ec3cb5e8-d624-494d-8e4b-142927391c26",
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
  "last_heartbeat_at": "2026-10-30T09:46:29.084409Z",
  "last_location_at": "2026-10-30T09:46:29.084409Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2da26b7a-1567-4f2f-8c89-ee5e0010965f/arrive` → **200**

```json
{
  "command_id": "316893a9-94d8-4c81-8593-ddcd49242072",
  "expected_version": 0
}
```

```json
{
  "id": "2da26b7a-1567-4f2f-8c89-ee5e0010965f",
  "order_id": "e9375585-c8cc-45e6-94d7-562915f0687b",
  "assignment_id": "6e95a30b-31be-4db1-9b09-f181b9786139",
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
  "arrived_at": "2026-10-30T09:46:29.383928Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2da26b7a-1567-4f2f-8c89-ee5e0010965f/start` → **200**

```json
{
  "command_id": "1c8667da-3e61-4754-8961-9b39faa9b862",
  "expected_version": 1
}
```

```json
{
  "id": "2da26b7a-1567-4f2f-8c89-ee5e0010965f",
  "order_id": "e9375585-c8cc-45e6-94d7-562915f0687b",
  "assignment_id": "6e95a30b-31be-4db1-9b09-f181b9786139",
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
  "arrived_at": "2026-10-30T09:46:29.383928Z",
  "started_at": "2026-10-30T09:46:29.692644Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2da26b7a-1567-4f2f-8c89-ee5e0010965f/complete` → **200**

```json
{
  "command_id": "7345c98f-eff3-4a69-8b8e-05987dbfa4f6",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:46:29Z",
  "cash_received": false
}
```

```json
{
  "id": "2da26b7a-1567-4f2f-8c89-ee5e0010965f",
  "order_id": "e9375585-c8cc-45e6-94d7-562915f0687b",
  "assignment_id": "6e95a30b-31be-4db1-9b09-f181b9786139",
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
  "arrived_at": "2026-10-30T09:46:29.383928Z",
  "started_at": "2026-10-30T09:46:29.692644Z",
  "completed_at": "2026-10-30T09:46:30.013883Z",
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
  "session_id": "027597d1-b9ae-4800-937d-bd5aa575ce2d",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ0OTAsImlhdCI6MTc5MzM1MzU5MCwianRpIjoiY2RlOTVmNjQtZmIzOC00YTFlLThhNGMtNzg0OWNmYjQyNTFhIiwic2lkIjoiMDI3NTk3ZDEtYjlhZS00ODAwLTkzN2QtYmQ1YWE1NzVjZTJkIn0.o24B85obP1SddiF7d_N2GPdYf8nasd1FZaxYt0yrKYs",
  "access_expires_at": "2026-10-30T10:01:30.617068815Z",
  "refresh_token": "tR3POhmHO_OEkv17H8KhzLRUy43k5e-zIRU_7XKTc1Q",
  "refresh_expires_at": "2026-10-30T21:46:30.616472983Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/e9375585-c8cc-45e6-94d7-562915f0687b/cash-dispute` → **200**

```json
{
  "order_id": "e9375585-c8cc-45e6-94d7-562915f0687b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "1f4480a2-d31a-4d44-b5d3-3c533a1ff577",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T09:46:30.895192Z",
  "decide_by": "2026-11-13T09:46:30.895192Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T09:46:30.895192Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "e9375585-c8cc-45e6-94d7-562915f0687b",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "1f4480a2-d31a-4d44-b5d3-3c533a1ff577",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T09:46:30.895192Z",
      "decide_by": "2026-11-13T09:46:30.895192Z",
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

`POST /api/admin/v1/orders/e9375585-c8cc-45e6-94d7-562915f0687b/cash-dispute/decide` → **400**

```json
{
  "command_id": "ad1c196a-d3e6-41a0-b460-f6cec34596b3",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/e9375585-c8cc-45e6-94d7-562915f0687b/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "0669d8e7-2fd5-4080-9be0-639426958700",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/e9375585-c8cc-45e6-94d7-562915f0687b/cash-dispute/decide` → **200**

```json
{
  "command_id": "b90dca4e-b650-48b4-9320-2dd5417dbce3",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "e9375585-c8cc-45e6-94d7-562915f0687b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "1f4480a2-d31a-4d44-b5d3-3c533a1ff577",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T09:46:30.895192Z",
  "decide_by": "2026-11-13T09:46:30.895192Z",
  "decision": "PAY_DRIVER",
  "decided_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T09:46:31.860591Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/e9375585-c8cc-45e6-94d7-562915f0687b/cash-dispute/decide` → **409**

```json
{
  "command_id": "5f285b03-53ee-4e7b-8b33-f9f28b0230a7",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/e9375585-c8cc-45e6-94d7-562915f0687b/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2fd843ac-90b9-4c65-906e-4a6da4856997"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ec3cb5e8-d624-494d-8e4b-142927391c26",
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
  "last_heartbeat_at": "2026-10-30T09:46:29.084409Z",
  "last_location_at": "2026-10-30T09:46:29.084409Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ec3cb5e8-d624-494d-8e4b-142927391c26/close` → **200**

```json
{
  "command_id": "021a5e1c-38c2-497a-9682-8dc803b06aff",
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
  "phone": "+380732313130",
  "device_ref": "sandbox-19967"
}
```

```json
{
  "challenge_id": "96cbc72d-0eb1-433a-9fa3-0bb93255e829",
  "expires_at": "2026-10-30T09:51:33.076873472Z",
  "resend_available_at": "2026-10-30T09:46:34.076873472Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732313130` → **200**

```json
{
  "phone": "+380732313130",
  "audience": "CLIENT",
  "code": "900782",
  "sent_at": "2026-10-30T09:46:33.079864862Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "96cbc72d-0eb1-433a-9fa3-0bb93255e829",
  "code": "900782",
  "device_ref": "sandbox-19967"
}
```

```json
{
  "session_id": "663b6e3d-a900-4425-b3e4-81edef5b4c72",
  "subject": {
    "type": "CLIENT",
    "id": "c4a7f4e9-1c13-4bbd-9cb9-a72f93c82dfb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGE3ZjRlOS0xYzEzLTRiYmQtOWNiOS1hNzJmOTNjODJkZmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NDkzLCJpYXQiOjE3OTMzNTM1OTMsImp0aSI6IjhjNzQ1YjhkLTczZjMtNDZiMC04MzhlLWUxMmQyMGQ4YjNkZCIsInNpZCI6IjY2M2I2ZTNkLWE5MDAtNDQyNS1iM2U0LTgxZWRlZjViNGM3MiJ9.-JribaGsRY2eiicamH5EEXgur2KdConYBXyZUsVEA1o",
  "access_expires_at": "2026-10-30T10:01:33.408597169Z",
  "refresh_token": "sNFJLhM3E_fKv2C62cdkEkkTM21BTnAr32Q3A3c_i6c",
  "refresh_expires_at": "2026-11-29T09:46:33.408003967Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "62ac90fe-22ff-4be5-8e02-adf5e78759fb",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b85c6eb0-3ea3-4e18-aa73-aa6b79f0a5a0",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b85c6eb0-3ea3-4e18-aa73-aa6b79f0a5a0",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "c5911e7c389ba923d2387d39c8f7a75a",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b85c6eb0-3ea3-4e18-aa73-aa6b79f0a5a0",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732313130"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b85c6eb0-3ea3-4e18-aa73-aa6b79f0a5a0",
  "expires_at": "2026-10-30T10:16:33.690882Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b85c6eb0-3ea3-4e18-aa73-aa6b79f0a5a0` → **200**

```json
{
  "id": "b85c6eb0-3ea3-4e18-aa73-aa6b79f0a5a0",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:16:33.690882Z",
  "card": {
    "id": "5900d287-67a4-4e48-90e5-e427a6588acd",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4049",
    "card_type": "Visa",
    "created_at": "2026-10-30T09:46:33.998481Z"
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
  "device_ref": "sandbox-25095"
}
```

```json
{
  "challenge_id": "9de163c2-b683-4b01-8cb4-7adcd388624b",
  "expires_at": "2026-10-30T09:51:34.311411492Z",
  "resend_available_at": "2026-10-30T09:46:35.311411492Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "690640",
  "sent_at": "2026-10-30T09:46:34.314394897Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9de163c2-b683-4b01-8cb4-7adcd388624b",
  "code": "690640",
  "device_ref": "sandbox-25095"
}
```

```json
{
  "session_id": "7629b2b9-8438-4bd5-ac15-e0be382c0c7f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDQ5NCwiaWF0IjoxNzkzMzUzNTk0LCJqdGkiOiI5NWQxYmVmZS0xNjE3LTRjYWQtOTJlMi1kMzA3NDRhZmJlNDUiLCJzaWQiOiI3NjI5YjJiOS04NDM4LTRiZDUtYWMxNS1lMGJlMzgyYzBjN2YifQ.726Pte8Bnxyyr5darSo3FQRC7fPdz-RnixGBwf_sI2E",
  "access_expires_at": "2026-10-30T10:01:34.633947701Z",
  "refresh_token": "xoX_ZARajqr-Dupe8JZprnYBA22kBlVnOIEwljOkt1U",
  "refresh_expires_at": "2026-11-29T09:46:34.633391043Z",
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
  "command_id": "71a5820c-b20a-46b2-9f9c-cf6aa4f7e5a2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:46:35Z",
    "sequence": 1793353595230
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fa678e68-5754-4b09-87a9-01cf05a1b511",
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
  "last_heartbeat_at": "2026-10-30T09:46:35.251251Z",
  "last_location_at": "2026-10-30T09:46:35.251251Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a83f4ea3-c4af-419b-aaa7-d027784864bf",
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
  "id": "911a3197-7546-49f4-b3e6-c0cb85a6e80a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:51:35.558492Z",
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
  "command_id": "b7829e46-63eb-43bb-afe6-ea87fdfc8b42",
  "quote_id": "911a3197-7546-49f4-b3e6-c0cb85a6e80a",
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
  "id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c4a7f4e9-1c13-4bbd-9cb9-a72f93c82dfb",
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
  "created_at": "2026-10-30T09:46:35.870148Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7e19014f-4392-479b-a705-d7ff3b68ba22` → **200**

```json
{
  "id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c4a7f4e9-1c13-4bbd-9cb9-a72f93c82dfb",
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
  "created_at": "2026-10-30T09:46:35.870148Z",
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
    "id": "3bd39b9a-2367-4ce5-809d-f1f50a66e732",
    "order_id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
    "expires_at": "2026-10-30T09:46:50.937054Z",
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

`POST /api/driver/v1/offers/3bd39b9a-2367-4ce5-809d-f1f50a66e732/accept` → **200**

```json
{
  "command_id": "2aaf7bf1-de0a-483f-a221-1df18e1a5322"
}
```

```json
{
  "id": "e2219127-afa7-43a9-bf6f-540e619c8753",
  "order_id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f7423810-6a24-4b0f-967c-d1425207e4d3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f7423810-6a24-4b0f-967c-d1425207e4d3",
  "order_id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
  "assignment_id": "e2219127-afa7-43a9-bf6f-540e619c8753",
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

`POST /api/rider/v1/orders/7e19014f-4392-479b-a705-d7ff3b68ba22/messages` → **201**

```json
{
  "command_id": "4a32b88e-2993-4b1a-8b9a-5e73a37e370a",
  "body": "Я біля входу, мій номер +380732313130, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "62c8a8cd-bede-43b0-b172-80cb99126ba3",
  "order_id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380732313130, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T09:46:37.407709259Z"
}
```

`POST /api/driver/v1/trips/f7423810-6a24-4b0f-967c-d1425207e4d3/messages` → **201**

```json
{
  "command_id": "0aacd2ad-873d-4c68-a81d-134e8c4a818a",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "11df37f9-f2b2-4887-a8e9-75f1fb6df347",
  "order_id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T09:46:37.699352582Z"
}
```

`POST /api/driver/v1/work-sessions/fa678e68-5754-4b09-87a9-01cf05a1b511/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:46:37Z",
    "sequence": 1793353597987
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fa678e68-5754-4b09-87a9-01cf05a1b511",
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
  "last_heartbeat_at": "2026-10-30T09:46:38.006964Z",
  "last_location_at": "2026-10-30T09:46:38.006964Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f7423810-6a24-4b0f-967c-d1425207e4d3/arrive` → **200**

```json
{
  "command_id": "24cf2042-17ee-4507-96ae-8aef36017f9c",
  "expected_version": 0
}
```

```json
{
  "id": "f7423810-6a24-4b0f-967c-d1425207e4d3",
  "order_id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
  "assignment_id": "e2219127-afa7-43a9-bf6f-540e619c8753",
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
  "arrived_at": "2026-10-30T09:46:38.33719Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f7423810-6a24-4b0f-967c-d1425207e4d3/start` → **200**

```json
{
  "command_id": "38abb76d-0377-4b8f-955b-5eeaf0d6e99a",
  "expected_version": 1
}
```

```json
{
  "id": "f7423810-6a24-4b0f-967c-d1425207e4d3",
  "order_id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
  "assignment_id": "e2219127-afa7-43a9-bf6f-540e619c8753",
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
  "arrived_at": "2026-10-30T09:46:38.33719Z",
  "started_at": "2026-10-30T09:46:38.655038Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/fa678e68-5754-4b09-87a9-01cf05a1b511/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:46:38Z",
    "sequence": 1793353598947
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fa678e68-5754-4b09-87a9-01cf05a1b511",
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
  "last_heartbeat_at": "2026-10-30T09:46:38.967748Z",
  "last_location_at": "2026-10-30T09:46:38.967748Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/f7423810-6a24-4b0f-967c-d1425207e4d3/complete` → **200**

```json
{
  "command_id": "3952ca01-2d3c-4865-9cf4-545d112c84f5",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:46:39Z",
  "cash_received": false
}
```

```json
{
  "id": "f7423810-6a24-4b0f-967c-d1425207e4d3",
  "order_id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
  "assignment_id": "e2219127-afa7-43a9-bf6f-540e619c8753",
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
  "arrived_at": "2026-10-30T09:46:38.33719Z",
  "started_at": "2026-10-30T09:46:38.655038Z",
  "completed_at": "2026-10-30T09:46:39.275391Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/7e19014f-4392-479b-a705-d7ff3b68ba22` → **200**

```json
{
  "id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c4a7f4e9-1c13-4bbd-9cb9-a72f93c82dfb",
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
    "id": "e2219127-afa7-43a9-bf6f-540e619c8753",
    "order_id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f7423810-6a24-4b0f-967c-d1425207e4d3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:46:35.870148Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7e19014f-4392-479b-a705-d7ff3b68ba22` → **200**

```json
{
  "id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c4a7f4e9-1c13-4bbd-9cb9-a72f93c82dfb",
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
    "id": "e2219127-afa7-43a9-bf6f-540e619c8753",
    "order_id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f7423810-6a24-4b0f-967c-d1425207e4d3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:46:35.870148Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7e19014f-4392-479b-a705-d7ff3b68ba22` → **200**

```json
{
  "id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "c4a7f4e9-1c13-4bbd-9cb9-a72f93c82dfb",
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
    "id": "e2219127-afa7-43a9-bf6f-540e619c8753",
    "order_id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f7423810-6a24-4b0f-967c-d1425207e4d3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:46:35.870148Z",
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
  "session_id": "fa678e68-5754-4b09-87a9-01cf05a1b511",
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
  "last_heartbeat_at": "2026-10-30T09:46:38.967748Z",
  "last_location_at": "2026-10-30T09:46:38.967748Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fa678e68-5754-4b09-87a9-01cf05a1b511/close` → **200**

```json
{
  "command_id": "f8e58d54-ab48-4eac-ad60-df0451cde1ff",
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
  "session_id": "a83f2c5a-6959-44ae-a64f-02fa06db60bb",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1MDMsImlhdCI6MTc5MzM1MzYwMywianRpIjoiZDg5ZjcwNDQtMTJiOS00MWIzLTlkODAtMzU2MDk4MTRhMzM1Iiwic2lkIjoiYTgzZjJjNWEtNjk1OS00NGFlLWE2NGYtMDJmYTA2ZGI2MGJiIn0.Uk7kAB5oV9pEUNcfLRcvzwt_d_3BzO1IN0pitdzIwBw",
  "access_expires_at": "2026-10-30T10:01:43.392939481Z",
  "refresh_token": "yRSRR8y_8St4GkBAWo__d6CrnC4PaZV6OVubk2BJOac",
  "refresh_expires_at": "2026-10-30T21:46:43.392380057Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/7e19014f-4392-479b-a705-d7ff3b68ba22/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/7e19014f-4392-479b-a705-d7ff3b68ba22/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "33ee1e17-b221-4988-a52a-8d3806c4a506"
}
```

`GET /api/admin/v1/orders/7e19014f-4392-479b-a705-d7ff3b68ba22/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T09:46:43.979679632Z",
  "order": {
    "id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
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
    "created_at": "2026-10-30T09:46:35.870148Z",
    "assigned_at": "2026-10-30T09:46:36.791821Z",
    "arrived_at": "2026-10-30T09:46:38.33719Z",
    "started_at": "2026-10-30T09:46:38.655038Z",
    "completed_at": "2026-10-30T09:46:39.275391Z"
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
    "id": "c4a7f4e9-1c13-4bbd-9cb9-a72f93c82dfb",
    "registered_at": "2026-10-30T09:46:33.406078Z",
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
      "created_at": "2026-10-30T09:46:35.872611Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T09:46:40.021777Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/7e19014f-4392-479b-a705-d7ff3b68ba22/chargebacks` → **422**

```json
{
  "command_id": "8c7b4fd9-264c-4914-8941-e029d02c853f",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/7e19014f-4392-479b-a705-d7ff3b68ba22/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "820760ae-08bf-4c01-a4b1-2096648bb29e"
}
```

`POST /api/admin/v1/orders/7e19014f-4392-479b-a705-d7ff3b68ba22/chargebacks` → **201**

```json
{
  "command_id": "9125a806-c6e4-4ed1-93dd-2172c974b2d9",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "874f5849-a43b-495b-a3bc-6adbe307ba78",
  "order_id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T09:46:44.665129Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/7e19014f-4392-479b-a705-d7ff3b68ba22/chargebacks` → **201**

```json
{
  "command_id": "9125a806-c6e4-4ed1-93dd-2172c974b2d9",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "874f5849-a43b-495b-a3bc-6adbe307ba78",
  "order_id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T09:46:44.665129Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/c4a7f4e9-1c13-4bbd-9cb9-a72f93c82dfb` → **200**

```json
{
  "client": {
    "id": "c4a7f4e9-1c13-4bbd-9cb9-a72f93c82dfb",
    "phone": "+380732313130",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:46:33.406078Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T09:46:35.870148Z",
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

`POST /api/admin/v1/orders/7e19014f-4392-479b-a705-d7ff3b68ba22/chargebacks/874f5849-a43b-495b-a3bc-6adbe307ba78/resolve` → **200**

```json
{
  "command_id": "a58fe0f1-b5bc-4c5f-87f4-d5598d3c414d",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "874f5849-a43b-495b-a3bc-6adbe307ba78",
  "order_id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T09:46:44.665129Z",
  "resolved_at": "2026-10-30T09:46:45.625136Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/c4a7f4e9-1c13-4bbd-9cb9-a72f93c82dfb` → **200**

```json
{
  "client": {
    "id": "c4a7f4e9-1c13-4bbd-9cb9-a72f93c82dfb",
    "phone": "+380732313130",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:46:33.406078Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T09:46:35.870148Z",
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

`GET /api/admin/v1/clients/c4a7f4e9-1c13-4bbd-9cb9-a72f93c82dfb` → **200**

```json
{
  "client": {
    "id": "c4a7f4e9-1c13-4bbd-9cb9-a72f93c82dfb",
    "phone": "+380732313130",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:46:33.406078Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T09:46:35.870148Z",
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

`POST /api/admin/v1/orders/7e19014f-4392-479b-a705-d7ff3b68ba22/chargebacks/874f5849-a43b-495b-a3bc-6adbe307ba78/resolve` → **409**

```json
{
  "command_id": "2ae52181-154e-41d5-95d8-f222e05eaf07",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/7e19014f-4392-479b-a705-d7ff3b68ba22/chargebacks/874f5849-a43b-495b-a3bc-6adbe307ba78/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7ece45ab-d31c-46d4-b549-6785b2571c7a"
}
```

`GET /api/admin/v1/orders/7e19014f-4392-479b-a705-d7ff3b68ba22/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "874f5849-a43b-495b-a3bc-6adbe307ba78",
      "order_id": "7e19014f-4392-479b-a705-d7ff3b68ba22",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T09:46:44.665129Z",
      "resolved_at": "2026-10-30T09:46:45.625136Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 7e19014f-4392-479b-a705-d7ff3b68ba22 without phone or card digits; chargeback 874f5849-a43b-495b-a3bc-6adbe307ba78 recorded and won.

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
  "session_id": "749be5ac-b465-4935-aa94-a68671c32d6b",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1MDgsImlhdCI6MTc5MzM1MzYwOCwianRpIjoiNTkwZDQ4M2UtNDZkMS00MDViLWFhZjgtMjQwYWY0ZjI4MDcyIiwic2lkIjoiNzQ5YmU1YWMtYjQ2NS00OTM1LWFhOTQtYTY4NjcxYzMyZDZiIn0.9HKMxTSm6Noq-loSR_X4y3huH5vD2LlJ1GXogeMf4WA",
  "access_expires_at": "2026-10-30T10:01:48.793511845Z",
  "refresh_token": "wQm-mxbVi4o9uj94IwJ0wyihfK-x6vlZzIuOx7FzL_o",
  "refresh_expires_at": "2026-10-30T21:46:48.792985153Z",
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
  "phone": "+48600389973",
  "device_ref": "sandbox-30477"
}
```

```json
{
  "challenge_id": "4aef7f12-d04f-4228-a052-2d366ea0f96a",
  "expires_at": "2026-10-30T09:51:49.682149612Z",
  "resend_available_at": "2026-10-30T09:46:50.682149612Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600389973` → **200**

```json
{
  "phone": "+48600389973",
  "audience": "CLIENT",
  "code": "579361",
  "sent_at": "2026-10-30T09:46:49.684886355Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4aef7f12-d04f-4228-a052-2d366ea0f96a",
  "code": "579361",
  "device_ref": "sandbox-30477"
}
```

```json
{
  "session_id": "21f4cda0-7de4-4dd8-abb7-4d9c032b1119",
  "subject": {
    "type": "CLIENT",
    "id": "9c6a2e9c-642d-4b57-b370-af45571bf30e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YzZhMmU5Yy02NDJkLTRiNTctYjM3MC1hZjQ1NTcxYmYzMGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NTEwLCJpYXQiOjE3OTMzNTM2MTAsImp0aSI6ImQ4NjliMmU0LWNhODEtNDEyOS04Y2I2LWU3NWNhM2U4NzI3NyIsInNpZCI6IjIxZjRjZGEwLTdkZTQtNGRkOC1hYmI3LTRkOWMwMzJiMTExOSJ9.u-GXxyt6wwY9RoRMA-vr5MyCR19nZ87vHZp90eS8duo",
  "access_expires_at": "2026-10-30T10:01:50.004445948Z",
  "refresh_token": "LMCET35m7JdSllzTD0EPHt9CZmd91eJZuAhUzM7tgJI",
  "refresh_expires_at": "2026-11-29T09:46:50.003913946Z",
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
  "command_id": "d345654b-4755-4af0-bb57-ca54878f2b93",
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
  "correlation_id": "ad78b0bd-456e-4be8-8aa9-b95882e8e301",
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
  "command_id": "3bdb10ea-97ff-4e15-9c3d-49f0a04f0f0f",
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
  "paused_at": "2026-10-30T09:46:51.212598663Z",
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
  "command_id": "bac829e5-841b-4242-ac6a-d605197fcb59",
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
  "id": "93bc533a-d649-4f4f-9b63-afd945e8ea83",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:51:51.831228Z",
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
  "command_id": "9b294031-71b9-4e65-91dd-39ba26eba7e4",
  "quote_id": "93bc533a-d649-4f4f-9b63-afd945e8ea83",
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
  "correlation_id": "59f71732-15c1-4739-995a-bc43eb753fcd"
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
  "paused_at": "2026-10-30T09:46:51.212599Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "00c41364-11b5-49e6-a328-6e1b814e1091",
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
  "command_id": "565c2867-02ad-4a0b-ac49-eff4bc54a3fb",
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
  "command_id": "04a0f5ec-0f58-4b7d-81b9-83d1db03a8c8",
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
  "id": "b364f6f5-d4ed-459a-9ca0-17acd7f3b4ad",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:51:53.652628Z",
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
  "command_id": "f77ba4eb-39d1-4c09-9ec3-7fde2b3f2c73",
  "quote_id": "b364f6f5-d4ed-459a-9ca0-17acd7f3b4ad",
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
  "correlation_id": "1588c836-7ce3-4c3a-8bea-8f26483e6d9e"
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
  "command_id": "f6bd08fa-7601-4784-8267-f91a16e94075",
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
  "command_id": "f68731d1-f71e-4ed8-96af-990b7096e176",
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
  "id": "629e1e2e-dfee-4ae6-be48-9b06a16d6ea0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:51:54.870329Z",
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
  "command_id": "e1ec3b97-26f3-4675-871b-33b51d3d6a55",
  "quote_id": "629e1e2e-dfee-4ae6-be48-9b06a16d6ea0",
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
  "correlation_id": "b54d6520-3f01-4852-85c1-5b08f6991ff0"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "1ed1ee8f-ff84-4ffb-a7cc-cbb933b639a8",
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
  "correlation_id": "dcb3e72c-feec-4d56-8ebe-cad6c4f3ff6b"
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
  "command_id": "30f2025e-0660-4f36-91ab-154fd33c71cb",
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
  "phone": "+380670969945",
  "device_ref": "sandbox-17865"
}
```

```json
{
  "challenge_id": "90345be3-79b1-424f-8e68-4fd8888ad97f",
  "expires_at": "2026-10-30T09:51:56.389162604Z",
  "resend_available_at": "2026-10-30T09:46:57.389162604Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670969945` → **200**

```json
{
  "phone": "+380670969945",
  "audience": "CLIENT",
  "code": "491921",
  "sent_at": "2026-10-30T09:46:56.391821821Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90345be3-79b1-424f-8e68-4fd8888ad97f",
  "code": "491921",
  "device_ref": "sandbox-17865"
}
```

```json
{
  "session_id": "1fa37374-1f38-45af-9c28-cb8f246bbe2e",
  "subject": {
    "type": "CLIENT",
    "id": "b42ba2c4-643a-4ccc-bc3f-e31bc96a126a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDJiYTJjNC02NDNhLTRjY2MtYmMzZi1lMzFiYzk2YTEyNmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NTE2LCJpYXQiOjE3OTMzNTM2MTYsImp0aSI6IjAxNjVkMWE2LTA4NWYtNGIwNy1hNDg3LTUwNTk3YTk4M2MyMSIsInNpZCI6IjFmYTM3Mzc0LTFmMzgtNDVhZi05YzI4LWNiOGYyNDZiYmUyZSJ9.POh0afkUNxJyNOnNYGAShNr8K-qvZR9zY0jkaL2wz38",
  "access_expires_at": "2026-10-30T10:01:56.704018023Z",
  "refresh_token": "6I6HGWK6Ge-hOc7odvhMJTx-ShpTFuGcDfy1U87Rzjg",
  "refresh_expires_at": "2026-11-29T09:46:56.703471634Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b42ba2c4-643a-4ccc-bc3f-e31bc96a126a",
  "session_id": "1fa37374-1f38-45af-9c28-cb8f246bbe2e",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1afccd98-c1b7-43e0-85b0-f35114db5daf",
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
  "id": "8470cbfc-0b80-4fec-89e4-803e587dd509",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:51:57.296064Z",
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
  "challenge_id": "15104cdc-4cad-48d9-8a4b-fceba3d65fa6",
  "expires_at": "2026-10-30T09:51:59.595925446Z",
  "resend_available_at": "2026-10-30T09:47:00.595925446Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670969945` → **200**

```json
{
  "phone": "+380670969945",
  "audience": "CLIENT",
  "code": "452029",
  "sent_at": "2026-10-30T09:46:59.59836837Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "983b3bb8-6dd1-460f-9968-ca6557034dbf",
  "challenge_id": "15104cdc-4cad-48d9-8a4b-fceba3d65fa6",
  "otp_code": "452029"
}
```

```json
{
  "client_id": "b42ba2c4-643a-4ccc-bc3f-e31bc96a126a",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T09:46:59.931258393Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "c90438e9-2380-457c-89c5-89b82f3cee1c",
  "quote_id": "8470cbfc-0b80-4fec-89e4-803e587dd509",
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
  "correlation_id": "bd85990b-e993-4d15-addb-14cf4ee64fc3"
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
  "session_id": "75e5fba8-7926-4db4-a4a3-42b07a926306",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1MjAsImlhdCI6MTc5MzM1MzYyMCwianRpIjoiYmUwMjQ0NGEtYzE3Zi00MTA0LTg5MDUtNDc2ZDhhYzAzODQwIiwic2lkIjoiNzVlNWZiYTgtNzkyNi00ZGI0LWE0YTMtNDJiMDdhOTI2MzA2In0.B8HUt0HNUdcJi4Q0ZNooEt75r-sLPcQ3hq8GPza45p8",
  "access_expires_at": "2026-10-30T10:02:00.854710354Z",
  "refresh_token": "ysQeElK6qpO-FtMfzp7OX5P0605bTOWzKChVVTZ1g8I",
  "refresh_expires_at": "2026-10-30T21:47:00.854110577Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "b42ba2c4-643a-4ccc-bc3f-e31bc96a126a",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T09:46:59.931258Z",
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

`POST /api/admin/v1/client-deletions/b42ba2c4-643a-4ccc-bc3f-e31bc96a126a/complete` → **200**

```json
{
  "command_id": "abaa11f4-28df-4b0e-b01d-6c03ef50a605",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "b42ba2c4-643a-4ccc-bc3f-e31bc96a126a",
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
  "correlation_id": "452653d8-53eb-42c2-a782-ef5c948e61f0"
}
```

Done: client b42ba2c4-643a-4ccc-bc3f-e31bc96a126a anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662508775",
  "device_ref": "sandbox-28986"
}
```

```json
{
  "challenge_id": "ef4a4462-9396-4a41-94db-b9c980296ca5",
  "expires_at": "2026-10-30T09:52:02.072694964Z",
  "resend_available_at": "2026-10-30T09:47:03.072694964Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662508775` → **200**

```json
{
  "phone": "+380662508775",
  "audience": "CLIENT",
  "code": "033824",
  "sent_at": "2026-10-30T09:47:02.075639524Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ef4a4462-9396-4a41-94db-b9c980296ca5",
  "code": "033824",
  "device_ref": "sandbox-28986"
}
```

```json
{
  "session_id": "4f367a0f-d451-42f6-ac85-75ae580a328f",
  "subject": {
    "type": "CLIENT",
    "id": "1a8d862e-0ca9-44ee-badc-b593338087ed"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYThkODYyZS0wY2E5LTQ0ZWUtYmFkYy1iNTkzMzM4MDg3ZWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NTIyLCJpYXQiOjE3OTMzNTM2MjIsImp0aSI6IjM3MDAyNjQ5LTdiY2YtNGNmYi1iMDZjLTQ3YzdhNmMyNjIyNiIsInNpZCI6IjRmMzY3YTBmLWQ0NTEtNDJmNi1hYzg1LTc1YWU1ODBhMzI4ZiJ9.CNaPP5b8nEIpDJCKf-6yFh3JprfmayuOEbZvrUwjmN8",
  "access_expires_at": "2026-10-30T10:02:02.40094144Z",
  "refresh_token": "WRrIHgr4yH7Wfy2eaexKhqlYv9r2DPTun-n4vfbAxpc",
  "refresh_expires_at": "2026-11-29T09:47:02.400462927Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1a8d862e-0ca9-44ee-badc-b593338087ed",
  "session_id": "4f367a0f-d451-42f6-ac85-75ae580a328f",
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
  "session_id": "a70eea2d-07c2-4771-9845-b7ad9c867193",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1MjMsImlhdCI6MTc5MzM1MzYyMywianRpIjoiZjUzMGEwZDAtODRjZC00M2FlLWI4NDQtYzE4NzIyNjAyNmJjIiwic2lkIjoiYTcwZWVhMmQtMDdjMi00NzcxLTk4NDUtYjdhZDljODY3MTkzIn0.jT55RM4JqibZJrKK4fq4k_ab59NA1WWOXen2bJ7fZ4Q",
  "access_expires_at": "2026-10-30T10:02:03.289154083Z",
  "refresh_token": "auGJfKunFlMPqKAQ7vJvP_yAdHFgp5psqrRd5zFRvUo",
  "refresh_expires_at": "2026-10-30T21:47:03.288563071Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=2508775&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "1a8d862e-0ca9-44ee-badc-b593338087ed",
      "phone": "+380662508775",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T09:47:02.398914Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/1a8d862e-0ca9-44ee-badc-b593338087ed` → **200**

```json
{
  "client": {
    "id": "1a8d862e-0ca9-44ee-badc-b593338087ed",
    "phone": "+380662508775",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:47:02.398914Z",
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

`POST /api/admin/v1/clients/1a8d862e-0ca9-44ee-badc-b593338087ed/block` → **400**

```json
{
  "command_id": "5fda5e90-e9cc-4a93-83c2-88c3e690122b",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/1a8d862e-0ca9-44ee-badc-b593338087ed/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "3b123153-7d57-4518-8104-6a7f01562a28",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/1a8d862e-0ca9-44ee-badc-b593338087ed/block` → **200**

```json
{
  "command_id": "0cb97f53-c626-4516-9a12-36191e3b1706",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "1a8d862e-0ca9-44ee-badc-b593338087ed",
  "phone": "+380662508775",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T09:47:02.398914Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T09:47:04.535681Z",
    "by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
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
  "correlation_id": "a832155f-edbb-4ff7-8740-879f21fe9f53"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662508775",
  "device_ref": "sandbox-22328"
}
```

```json
{
  "challenge_id": "230cce2b-defc-4ec4-8149-d2e3a377579a",
  "expires_at": "2026-10-30T09:52:07.133555833Z",
  "resend_available_at": "2026-10-30T09:47:08.133555833Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662508775` → **200**

```json
{
  "phone": "+380662508775",
  "audience": "CLIENT",
  "code": "796596",
  "sent_at": "2026-10-30T09:47:07.136307645Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "230cce2b-defc-4ec4-8149-d2e3a377579a",
  "code": "796596",
  "device_ref": "sandbox-22328"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "87304c77-19e3-4265-a0bf-764564300cc6"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/1a8d862e-0ca9-44ee-badc-b593338087ed` → **200**

```json
{
  "client": {
    "id": "1a8d862e-0ca9-44ee-badc-b593338087ed",
    "phone": "+380662508775",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T09:47:02.398914Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T09:47:04.535681Z",
      "by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
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

`POST /api/admin/v1/clients/1a8d862e-0ca9-44ee-badc-b593338087ed/unblock` → **200**

```json
{
  "command_id": "21936395-d496-46df-a2ab-57e84082419c",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "1a8d862e-0ca9-44ee-badc-b593338087ed",
  "phone": "+380662508775",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T09:47:02.398914Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662508775",
  "device_ref": "sandbox-18383"
}
```

```json
{
  "challenge_id": "c97476ce-ecd0-4130-a04e-a7b1eb8ef2bd",
  "expires_at": "2026-10-30T09:52:10.391709069Z",
  "resend_available_at": "2026-10-30T09:47:11.391709069Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662508775` → **200**

```json
{
  "phone": "+380662508775",
  "audience": "CLIENT",
  "code": "718882",
  "sent_at": "2026-10-30T09:47:10.394538065Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c97476ce-ecd0-4130-a04e-a7b1eb8ef2bd",
  "code": "718882",
  "device_ref": "sandbox-18383"
}
```

```json
{
  "session_id": "3a8b1c11-593b-4b6a-abdd-b00315221f2a",
  "subject": {
    "type": "CLIENT",
    "id": "1a8d862e-0ca9-44ee-badc-b593338087ed"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYThkODYyZS0wY2E5LTQ0ZWUtYmFkYy1iNTkzMzM4MDg3ZWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NTMwLCJpYXQiOjE3OTMzNTM2MzAsImp0aSI6IjZkMTAwZjkyLTE4ZmEtNGMwMy04Yjg1LTE1OWIyZDQ1MGQ0MiIsInNpZCI6IjNhOGIxYzExLTU5M2ItNGI2YS1hYmRkLWIwMDMxNTIyMWYyYSJ9.rZgHhZJp8hanKmkseVdbLvWyoFDGcUPtz7qdRRVUQjk",
  "access_expires_at": "2026-10-30T10:02:10.705828542Z",
  "refresh_token": "sqqEvyb-Z1r9QD8D-ZExfdbx_mGeAnUNPkW7iqN2QPI",
  "refresh_expires_at": "2026-11-29T09:47:10.705309957Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1a8d862e-0ca9-44ee-badc-b593338087ed",
  "session_id": "3a8b1c11-593b-4b6a-abdd-b00315221f2a",
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
  "phone": "+380663584682",
  "device_ref": "sandbox-12203"
}
```

```json
{
  "challenge_id": "b27c90b0-8d1e-47fd-a511-55293b891e7c",
  "expires_at": "2026-10-30T09:52:11.312371863Z",
  "resend_available_at": "2026-10-30T09:47:12.312371863Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663584682` → **200**

```json
{
  "phone": "+380663584682",
  "audience": "CLIENT",
  "code": "637875",
  "sent_at": "2026-10-30T09:47:11.315251473Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b27c90b0-8d1e-47fd-a511-55293b891e7c",
  "code": "637875",
  "device_ref": "sandbox-12203"
}
```

```json
{
  "session_id": "873120a3-7018-4a0b-8abf-2ba43460db2b",
  "subject": {
    "type": "CLIENT",
    "id": "d6ee8935-869a-4fed-b38d-5f5be432e9ff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmVlODkzNS04NjlhLTRmZWQtYjM4ZC01ZjViZTQzMmU5ZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NTMxLCJpYXQiOjE3OTMzNTM2MzEsImp0aSI6ImE5ZGE2NzgyLWRhMzYtNGUxYS1hZWVjLTBmYjAyOTMzYmRmMiIsInNpZCI6Ijg3MzEyMGEzLTcwMTgtNGEwYi04YWJmLTJiYTQzNDYwZGIyYiJ9.lAj-kNTpN4yqWBlZlUKVpEY8y7z6YOSHlk7kpxoynDQ",
  "access_expires_at": "2026-10-30T10:02:11.641662449Z",
  "refresh_token": "NvGriIC5wmTzOnDZ1QOTvjK3B6RJxtXOR6SxohJzi0E",
  "refresh_expires_at": "2026-11-29T09:47:11.641091664Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "951cdc41-e22f-4a9d-9760-7f14319a58f8",
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
  "id": "5cfc4af8-5193-4c19-b021-85b11bdda5d6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:52:11.946601Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 2ceab4e7-9f3b-43bc-ad9b-6e0f6cd61ca3) → **201**

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
  "session_id": "a2167d04-dcfb-4f4b-a504-8f6bf28dded3",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1MzIsImlhdCI6MTc5MzM1MzYzMiwianRpIjoiNDI4ZTFhZDMtMjlhMS00YzFkLThiNTQtMTU1NzQzYmMyMDI0Iiwic2lkIjoiYTIxNjdkMDQtZGNmYi00ZjRiLWE1MDQtOGY2YmYyOGRkZWQzIn0.dndn_XdODP8iv6M_rODrGUgd1bct7TDVrR37_EJ6tAY",
  "access_expires_at": "2026-10-30T10:02:12.606656766Z",
  "refresh_token": "apPyI8t_KjjgsM7S9L3mN85KhT13x9akpKrWLIjaMVI",
  "refresh_expires_at": "2026-10-30T21:47:12.606126778Z",
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
  "session_id": "dd201945-7c84-47e3-b370-44b8d547bd90",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1MzMsImlhdCI6MTc5MzM1MzYzMywianRpIjoiNTYzYzQwMTMtZjQ4Mi00ZTM3LThkZDktOTc1ZGE0YzQ3ZWU5Iiwic2lkIjoiZGQyMDE5NDUtN2M4NC00N2UzLWIzNzAtNDRiOGQ1NDdiZDkwIn0.vCnUYWdQFy4grGKBoxxdrF15KbrCShfLXNp9fCTmS5M",
  "access_expires_at": "2026-10-30T10:02:13.188185055Z",
  "refresh_token": "mXwM49r9mYwteCpG5bV9lBEmwjLkwASdNZe8dMbpN3M",
  "refresh_expires_at": "2026-10-30T21:47:13.187590216Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2ea3239c-2674-4075-bf2b-f2a6fb83f43a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:47:12.262837Z",
      "actor": {
        "type": "CLIENT",
        "id": "d6ee8935-869a-4fed-b38d-5f5be432e9ff",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2ea3239c-2674-4075-bf2b-f2a6fb83f43a",
        "quote_id": "5cfc4af8-5193-4c19-b021-85b11bdda5d6",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "2ceab4e7-9f3b-43bc-ad9b-6e0f6cd61ca3"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:47:12.26484Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2ea3239c-2674-4075-bf2b-f2a6fb83f43a",
        "attempt_id": "0d6b9055-cbc3-46c7-8ce4-ef8be26f9f8e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "2ceab4e7-9f3b-43bc-ad9b-6e0f6cd61ca3"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T09:47:12.272544Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2ea3239c-2674-4075-bf2b-f2a6fb83f43a",
        "attempt_id": "0d6b9055-cbc3-46c7-8ce4-ef8be26f9f8e"
      },
      "correlation_id": "2ceab4e7-9f3b-43bc-ad9b-6e0f6cd61ca3"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "0d6b9055-cbc3-46c7-8ce4-ef8be26f9f8e",
        "generation": 1,
        "started_at": "2026-10-30T09:47:12.26384Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T09:47:12.272544Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T09:47:12.265631Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/2ceab4e7-9f3b-43bc-ad9b-6e0f6cd61ca3` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "2ea3239c-2674-4075-bf2b-f2a6fb83f43a:0",
      "order_id": "2ea3239c-2674-4075-bf2b-f2a6fb83f43a",
      "at": "2026-10-30T09:47:12.262837Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "2ea3239c-2674-4075-bf2b-f2a6fb83f43a:1",
      "order_id": "2ea3239c-2674-4075-bf2b-f2a6fb83f43a",
      "at": "2026-10-30T09:47:12.26484Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "2ea3239c-2674-4075-bf2b-f2a6fb83f43a:2",
      "order_id": "2ea3239c-2674-4075-bf2b-f2a6fb83f43a",
      "at": "2026-10-30T09:47:12.272544Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/e44f0b8f-c47c-4094-867c-a63919f87d75` → **200**

```json
{
  "found": []
}
```

Done: request 2ceab4e7-9f3b-43bc-ad9b-6e0f6cd61ca3 — order 2ea3239c-2674-4075-bf2b-f2a6fb83f43a found by its id.

`GET /api/rider/v1/orders/2ea3239c-2674-4075-bf2b-f2a6fb83f43a` → **200**

```json
{
  "id": "2ea3239c-2674-4075-bf2b-f2a6fb83f43a",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d6ee8935-869a-4fed-b38d-5f5be432e9ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:47:12.262283Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2ea3239c-2674-4075-bf2b-f2a6fb83f43a/cancel` → **200**

```json
{
  "command_id": "75928708-d95b-43e1-bae6-226e81f7dc9a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2ea3239c-2674-4075-bf2b-f2a6fb83f43a",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d6ee8935-869a-4fed-b38d-5f5be432e9ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:47:12.262283Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
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
  "phone": "+380638096501",
  "device_ref": "sandbox-14811"
}
```

```json
{
  "challenge_id": "81a2579e-2ff0-45ff-a98f-e8800d7d041e",
  "expires_at": "2026-10-30T09:52:15.165211384Z",
  "resend_available_at": "2026-10-30T09:47:16.165211384Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638096501` → **200**

```json
{
  "phone": "+380638096501",
  "audience": "CLIENT",
  "code": "948660",
  "sent_at": "2026-10-30T09:47:15.168097728Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "81a2579e-2ff0-45ff-a98f-e8800d7d041e",
  "code": "948660",
  "device_ref": "sandbox-14811"
}
```

```json
{
  "session_id": "3e862d10-f80c-4467-a332-8f03d364b4a3",
  "subject": {
    "type": "CLIENT",
    "id": "379e811d-892f-4231-a500-e9ac07d8e48c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNzllODExZC04OTJmLTQyMzEtYTUwMC1lOWFjMDdkOGU0OGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NTM1LCJpYXQiOjE3OTMzNTM2MzUsImp0aSI6IjE5ZTljODgxLTkxYTgtNGY2MS04MTVlLTgwY2JiYjhhNmE5NCIsInNpZCI6IjNlODYyZDEwLWY4MGMtNDQ2Ny1hMzMyLThmMDNkMzY0YjRhMyJ9.HHA2fEIQjag3Z79cosuTN5WKw5Gr2d7Y0xNf3JDgpqY",
  "access_expires_at": "2026-10-30T10:02:15.487800283Z",
  "refresh_token": "hk2ZL0B7A4hPGjbgdxd62TLRU1FZVBxNR8yS4Sq3pFs",
  "refresh_expires_at": "2026-11-29T09:47:15.48719839Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "b7ca0135-0fe0-4fe0-a09c-d010edf5e0b6",
  "expires_at": "2026-10-30T09:52:17.774336668Z",
  "resend_available_at": "2026-10-30T09:47:18.774336668Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638096501` → **200**

```json
{
  "phone": "+380638096501",
  "audience": "CLIENT",
  "code": "124657",
  "sent_at": "2026-10-30T09:47:17.776836631Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "ca8e663d-51f2-45a8-b0a4-a0d709fc9693",
  "challenge_id": "b7ca0135-0fe0-4fe0-a09c-d010edf5e0b6",
  "otp_code": "124657"
}
```

```json
{
  "id": "8d43f75a-7f47-4b0d-a932-4ed6d22e5f60",
  "state": "PENDING",
  "created_at": "2026-10-30T09:47:18.106436Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/8d43f75a-7f47-4b0d-a932-4ed6d22e5f60` → **200**

```json
{
  "id": "8d43f75a-7f47-4b0d-a932-4ed6d22e5f60",
  "state": "PENDING",
  "created_at": "2026-10-30T09:47:18.106436Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/8d43f75a-7f47-4b0d-a932-4ed6d22e5f60` → **200**

```json
{
  "id": "8d43f75a-7f47-4b0d-a932-4ed6d22e5f60",
  "state": "PENDING",
  "created_at": "2026-10-30T09:47:18.106436Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/8d43f75a-7f47-4b0d-a932-4ed6d22e5f60` → **200**

```json
{
  "id": "8d43f75a-7f47-4b0d-a932-4ed6d22e5f60",
  "state": "PENDING",
  "created_at": "2026-10-30T09:47:18.106436Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/8d43f75a-7f47-4b0d-a932-4ed6d22e5f60` → **200**

```json
{
  "id": "8d43f75a-7f47-4b0d-a932-4ed6d22e5f60",
  "state": "PENDING",
  "created_at": "2026-10-30T09:47:18.106436Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/8d43f75a-7f47-4b0d-a932-4ed6d22e5f60` → **200**

```json
{
  "id": "8d43f75a-7f47-4b0d-a932-4ed6d22e5f60",
  "state": "PENDING",
  "created_at": "2026-10-30T09:47:18.106436Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/8d43f75a-7f47-4b0d-a932-4ed6d22e5f60` → **200**

```json
{
  "id": "8d43f75a-7f47-4b0d-a932-4ed6d22e5f60",
  "state": "PENDING",
  "created_at": "2026-10-30T09:47:18.106436Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/8d43f75a-7f47-4b0d-a932-4ed6d22e5f60` → **200**

```json
{
  "id": "8d43f75a-7f47-4b0d-a932-4ed6d22e5f60",
  "state": "READY",
  "created_at": "2026-10-30T09:47:18.106436Z",
  "ready_at": "2026-10-30T09:47:25.86909Z",
  "expires_at": "2026-11-06T09:47:25.86909Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/8d43f75a-7f47-4b0d-a932-4ed6d22e5f60/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639137262",
  "device_ref": "sandbox-22146"
}
```

```json
{
  "challenge_id": "0ec133bb-5b99-46e8-b798-9bae3ad1faa7",
  "expires_at": "2026-10-30T09:52:26.460158746Z",
  "resend_available_at": "2026-10-30T09:47:27.460158746Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639137262` → **200**

```json
{
  "phone": "+380639137262",
  "audience": "CLIENT",
  "code": "288971",
  "sent_at": "2026-10-30T09:47:26.463606108Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0ec133bb-5b99-46e8-b798-9bae3ad1faa7",
  "code": "288971",
  "device_ref": "sandbox-22146"
}
```

```json
{
  "session_id": "dc325102-8f06-4b6e-991b-23924d2b1e3b",
  "subject": {
    "type": "CLIENT",
    "id": "b1912901-a3f2-4f97-b049-a77429662a01"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTkxMjkwMS1hM2YyLTRmOTctYjA0OS1hNzc0Mjk2NjJhMDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NTQ2LCJpYXQiOjE3OTMzNTM2NDYsImp0aSI6Ijc2OTAwMjMxLTY3NjktNDRmZC1iOTAwLTZlZDVkMmNjMzhhYyIsInNpZCI6ImRjMzI1MTAyLThmMDYtNGI2ZS05OTFiLTIzOTI0ZDJiMWUzYiJ9.JB7sguPARRWjgrd6KWfSBp74QJ8AWXnZgD9ULP5pjAU",
  "access_expires_at": "2026-10-30T10:02:26.789078014Z",
  "refresh_token": "IoNZDMYZxeStIHN9hjCJ6qhVbJ-NQ6gN9ax65nWnl54",
  "refresh_expires_at": "2026-11-29T09:47:26.788472633Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/8d43f75a-7f47-4b0d-a932-4ed6d22e5f60/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/8d43f75a-7f47-4b0d-a932-4ed6d22e5f60/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c5291df8-a914-4f2c-b7da-23b288fc3517"
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
  "session_id": "8696b706-7532-4246-b889-f122ab70d4a7",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1NDcsImlhdCI6MTc5MzM1MzY0NywianRpIjoiODk4ZmE1NGItOWYwMC00ZTAzLTgxZGUtNzU1ZTgzMzNlMGFhIiwic2lkIjoiODY5NmI3MDYtNzUzMi00MjQ2LWI4ODktZjEyMmFiNzBkNGE3In0.4I7gBbxl0005Q833e5FP28P0vFETrqBjWosZaTnhAHk",
  "access_expires_at": "2026-10-30T10:02:27.66242262Z",
  "refresh_token": "4YP9uRYVEigM_G-pozW8Q91ldrlnez8kPLp-Z1rtwkQ",
  "refresh_expires_at": "2026-10-30T21:47:27.661876321Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "379e811d-892f-4231-a500-e9ac07d8e48c",
  "session_id": "3e862d10-f80c-4467-a332-8f03d364b4a3",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/379e811d-892f-4231-a500-e9ac07d8e48c/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "8d43f75a-7f47-4b0d-a932-4ed6d22e5f60",
      "state": "READY",
      "created_at": "2026-10-30T09:47:18.106436Z",
      "ready_at": "2026-10-30T09:47:25.86909Z",
      "expires_at": "2026-11-06T09:47:25.86909Z",
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
  "device_ref": "sandbox-21848"
}
```

```json
{
  "challenge_id": "c97a2373-d07f-45aa-b56f-f88ca1e6af02",
  "expires_at": "2026-10-30T09:52:28.532233271Z",
  "resend_available_at": "2026-10-30T09:47:29.532233271Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "285498",
  "sent_at": "2026-10-30T09:47:28.534974373Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c97a2373-d07f-45aa-b56f-f88ca1e6af02",
  "code": "285498",
  "device_ref": "sandbox-21848"
}
```

```json
{
  "session_id": "df06adbc-79be-4213-beb3-ae83936c97dc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDU0OCwiaWF0IjoxNzkzMzUzNjQ4LCJqdGkiOiJkZTUwNjczNC1mMTc4LTRjZWYtYTIzZC0yZjljOGJkMzRiMzYiLCJzaWQiOiJkZjA2YWRiYy03OWJlLTQyMTMtYmViMy1hZTgzOTM2Yzk3ZGMifQ.GyLKMaBNeScBsYuNKcUt-96L0GOA5Er9DblPlfRCQzE",
  "access_expires_at": "2026-10-30T10:02:28.848683312Z",
  "refresh_token": "dKI4zr6_fPIonMEj3KcMOLhlnAdh7dnR1OwKPZiBKPg",
  "refresh_expires_at": "2026-11-29T09:47:28.848127405Z",
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
  "device_ref": "sandbox-10312"
}
```

```json
{
  "challenge_id": "5e06e31b-a04e-4daa-8576-9d2932bfd5c2",
  "expires_at": "2026-10-30T09:52:29.428337202Z",
  "resend_available_at": "2026-10-30T09:47:30.428337202Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "910264",
  "sent_at": "2026-10-30T09:47:29.43102544Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5e06e31b-a04e-4daa-8576-9d2932bfd5c2",
  "code": "910264",
  "device_ref": "sandbox-10312"
}
```

```json
{
  "session_id": "566109b6-a558-4deb-94c2-ddd512df0bac",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDU0OSwiaWF0IjoxNzkzMzUzNjQ5LCJqdGkiOiI3NzlhMjM4NC05ZTlkLTQyM2YtOGEyZC1hNmJhYjE3MTVhNzMiLCJzaWQiOiI1NjYxMDliNi1hNTU4LTRkZWItOTRjMi1kZGQ1MTJkZjBiYWMifQ.XYZVT1lN_taySteA_SfriNAKyyxk4sbftKOFzBponbM",
  "access_expires_at": "2026-10-30T10:02:29.742723178Z",
  "refresh_token": "4i3vOPROsbPdEeDw6AghblcsjJas8zt2CEtH8oEC1Co",
  "refresh_expires_at": "2026-11-29T09:47:29.742207787Z",
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
  "command_id": "fe38148a-4f24-42df-9342-90e6bb47e115",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:47:30Z",
    "sequence": 1793353650311
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1621a18e-39d4-421a-aea2-13b380cdfb4c",
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
  "last_heartbeat_at": "2026-10-30T09:47:30.329941Z",
  "last_location_at": "2026-10-30T09:47:30.329941Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-12648"
}
```

```json
{
  "challenge_id": "bd3cd705-bb5b-416d-a0f7-53613b17a587",
  "expires_at": "2026-10-30T09:52:30.623375355Z",
  "resend_available_at": "2026-10-30T09:47:31.623375355Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "900967",
  "sent_at": "2026-10-30T09:47:30.626745069Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bd3cd705-bb5b-416d-a0f7-53613b17a587",
  "code": "900967",
  "device_ref": "sandbox-12648"
}
```

```json
{
  "session_id": "3bf559c4-219c-4f9d-af9f-596db878005f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDU1MCwiaWF0IjoxNzkzMzUzNjUwLCJqdGkiOiIzMTAxZWRhZS03MzFiLTQ1ZDYtOTMxYy1iNGVjODNhM2FlZWQiLCJzaWQiOiIzYmY1NTljNC0yMTljLTRmOWQtYWY5Zi01OTZkYjg3ODAwNWYifQ.9McdfTjiMirIXcJAZv4hqfC0fh1R82NzkGauBUugPQU",
  "access_expires_at": "2026-10-30T10:02:30.941391972Z",
  "refresh_token": "ZWdYFiX0ueMIxsvrntgiupeDH9Z1vxd57vHvRGWLv2A",
  "refresh_expires_at": "2026-11-29T09:47:30.940862796Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "976c035d-ae94-4f71-bae4-1cae93e1fc4c",
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
  "last_heartbeat_at": "2026-10-30T09:45:53.163063Z",
  "last_location_at": "2026-10-30T09:45:53.163063Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/976c035d-ae94-4f71-bae4-1cae93e1fc4c/handover` → **200**

```json
{
  "command_id": "df007601-ca8a-45dd-81a6-5399cb3ac25e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "976c035d-ae94-4f71-bae4-1cae93e1fc4c",
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
  "last_heartbeat_at": "2026-10-30T09:45:53.163063Z",
  "last_location_at": "2026-10-30T09:45:53.163063Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/976c035d-ae94-4f71-bae4-1cae93e1fc4c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:47:31Z",
    "sequence": 1793353651801
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "976c035d-ae94-4f71-bae4-1cae93e1fc4c",
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
  "last_heartbeat_at": "2026-10-30T09:47:31.820733Z",
  "last_location_at": "2026-10-30T09:47:31.820733Z",
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
  "session_id": "6127f763-04aa-43a3-b6a1-30f853126454",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1NTIsImlhdCI6MTc5MzM1MzY1MiwianRpIjoiZDI0ODk2MjktNGRlMy00ZDc0LWJkZDYtYzk1ZjgxYTdjNWRmIiwic2lkIjoiNjEyN2Y3NjMtMDRhYS00M2EzLWI2YTEtMzBmODUzMTI2NDU0In0.T1LnYG-bFr2HDYQoUZ7fLYOSc99xkyS6PZjGmHI9yGI",
  "access_expires_at": "2026-10-30T10:02:32.407102754Z",
  "refresh_token": "9xaGDqYzqok1Q3ktJSS6BAlE_MNsM2W3VAHH5JlkkDw",
  "refresh_expires_at": "2026-10-30T21:47:32.406520568Z",
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
  "session_id": "ac380ef5-a0ef-41fc-8240-8d3a3fef6235",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1NTIsImlhdCI6MTc5MzM1MzY1MiwianRpIjoiM2EwNDU1ZDktYmIwYS00MzA4LTk0MDQtYzJjOTJlYjJhNTJlIiwic2lkIjoiYWMzODBlZjUtYTBlZi00MWZjLTgyNDAtOGQzYTNmZWY2MjM1In0.ksppE4UpwB3xj-sGab9K_XDK61rhyvbkuR_jFGEAXxg",
  "access_expires_at": "2026-10-30T10:02:32.988330128Z",
  "refresh_token": "4CuKKAZTCbOPfKRaqg16lcjvj9SmZXDls91SjgMVaug",
  "refresh_expires_at": "2026-10-30T21:47:32.987767228Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684936533",
  "device_ref": "sandbox-15768"
}
```

```json
{
  "challenge_id": "7b9ca1ec-fbfb-4bee-ba34-20254cb7980e",
  "expires_at": "2026-10-30T09:52:33.268330782Z",
  "resend_available_at": "2026-10-30T09:47:34.268330782Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380684936533` → **200**

```json
{
  "phone": "+380684936533",
  "audience": "CLIENT",
  "code": "259619",
  "sent_at": "2026-10-30T09:47:33.27117417Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7b9ca1ec-fbfb-4bee-ba34-20254cb7980e",
  "code": "259619",
  "device_ref": "sandbox-15768"
}
```

```json
{
  "session_id": "4e0fcbf2-8c71-4050-8e0d-0cffb916863b",
  "subject": {
    "type": "CLIENT",
    "id": "ae025ec0-5821-4e0d-9a5f-41a21d9b46d9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZTAyNWVjMC01ODIxLTRlMGQtOWE1Zi00MWEyMWQ5YjQ2ZDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NTUzLCJpYXQiOjE3OTMzNTM2NTMsImp0aSI6ImNhZDM1NWI3LTU3OWMtNDM3OC04M2M0LWJkY2NiNmNkNmI1ZSIsInNpZCI6IjRlMGZjYmYyLThjNzEtNDA1MC04ZTBkLTBjZmZiOTE2ODYzYiJ9.1jhlNxRZtxs6CtA7dh3010r4wI9nMXUr975Y4oAWcDI",
  "access_expires_at": "2026-10-30T10:02:33.587564622Z",
  "refresh_token": "fPdKK0fwhz2us0rp1x3gFc1D4wTVeFM6YruY9uxMmC4",
  "refresh_expires_at": "2026-11-29T09:47:33.587083435Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c9b475b5-9906-406f-8276-61c9e27d5076",
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
  "id": "5fb1acc4-479f-445a-9607-6ecd64135954",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:52:33.884585Z",
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
  "command_id": "73dc8945-3d45-46a6-8e3e-d7434d50bf95",
  "quote_id": "5fb1acc4-479f-445a-9607-6ecd64135954",
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
  "id": "488b055f-7b44-4afe-bfbd-e7db5b0f8681",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ae025ec0-5821-4e0d-9a5f-41a21d9b46d9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:47:34.208381Z",
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
    "id": "014e0111-dca5-4411-be16-b044298b4e92",
    "order_id": "488b055f-7b44-4afe-bfbd-e7db5b0f8681",
    "expires_at": "2026-10-30T09:47:49.211906Z",
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

`POST /api/driver/v1/offers/014e0111-dca5-4411-be16-b044298b4e92/reject` → **204**

```json
{
  "command_id": "9b8ea834-c225-41cd-9c87-a10c08b528d4"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "67d7b852-6419-49bd-bec6-e3c966ca72c2",
    "order_id": "488b055f-7b44-4afe-bfbd-e7db5b0f8681",
    "expires_at": "2026-10-30T09:47:49.835184Z",
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

`POST /api/driver/v1/offers/67d7b852-6419-49bd-bec6-e3c966ca72c2/accept` → **200**

```json
{
  "command_id": "eb2995ab-3830-4c98-9fe3-50d6d4becb84"
}
```

```json
{
  "id": "eb8626b6-d21c-47a3-9bc3-184869fec11d",
  "order_id": "488b055f-7b44-4afe-bfbd-e7db5b0f8681",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b036cbf3-4f28-47ad-b686-32e709805cce",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/488b055f-7b44-4afe-bfbd-e7db5b0f8681/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:47:34.208938Z",
      "actor": {
        "type": "CLIENT",
        "id": "ae025ec0-5821-4e0d-9a5f-41a21d9b46d9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "488b055f-7b44-4afe-bfbd-e7db5b0f8681",
        "quote_id": "5fb1acc4-479f-445a-9607-6ecd64135954",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "5e933b1c-d8df-4ee4-97fd-fe20a71fd3f3"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:47:34.211258Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "488b055f-7b44-4afe-bfbd-e7db5b0f8681",
        "attempt_id": "9c106aff-cacd-48dd-9b46-c9ef1bb74616",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5e933b1c-d8df-4ee4-97fd-fe20a71fd3f3"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:47:34.213999Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "014e0111-dca5-4411-be16-b044298b4e92",
        "order_id": "488b055f-7b44-4afe-bfbd-e7db5b0f8681",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "5e933b1c-d8df-4ee4-97fd-fe20a71fd3f3"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T09:47:34.834181Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "014e0111-dca5-4411-be16-b044298b4e92",
        "order_id": "488b055f-7b44-4afe-bfbd-e7db5b0f8681"
      },
      "correlation_id": "5e16247f-1949-47e5-932c-b7a24d4b3e8c"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 488b055f-7b44-4afe-bfbd-e7db5b0f8681 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/488b055f-7b44-4afe-bfbd-e7db5b0f8681` → **200**

```json
{
  "id": "488b055f-7b44-4afe-bfbd-e7db5b0f8681",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "ae025ec0-5821-4e0d-9a5f-41a21d9b46d9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "eb8626b6-d21c-47a3-9bc3-184869fec11d",
    "order_id": "488b055f-7b44-4afe-bfbd-e7db5b0f8681",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b036cbf3-4f28-47ad-b686-32e709805cce",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T09:47:34.208381Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/488b055f-7b44-4afe-bfbd-e7db5b0f8681/cancel` → **200**

```json
{
  "command_id": "3d820915-3c07-4ce3-a635-b6a3ee2c2e07",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "488b055f-7b44-4afe-bfbd-e7db5b0f8681",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ae025ec0-5821-4e0d-9a5f-41a21d9b46d9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "eb8626b6-d21c-47a3-9bc3-184869fec11d",
    "order_id": "488b055f-7b44-4afe-bfbd-e7db5b0f8681",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "b036cbf3-4f28-47ad-b686-32e709805cce",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:47:34.208381Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
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
  "session_id": "1621a18e-39d4-421a-aea2-13b380cdfb4c",
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
  "last_heartbeat_at": "2026-10-30T09:47:30.329941Z",
  "last_location_at": "2026-10-30T09:47:30.329941Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1621a18e-39d4-421a-aea2-13b380cdfb4c/close` → **200**

```json
{
  "command_id": "f52a7152-2c44-48ac-8ab4-592d48aeca70",
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
  "session_id": "976c035d-ae94-4f71-bae4-1cae93e1fc4c",
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
  "last_heartbeat_at": "2026-10-30T09:47:31.820733Z",
  "last_location_at": "2026-10-30T09:47:31.820733Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/976c035d-ae94-4f71-bae4-1cae93e1fc4c/close` → **200**

```json
{
  "command_id": "d966b575-8296-4e76-b176-53a7b3e3f96e",
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
  "session_id": "df151871-8908-46a9-aee9-1d6d1526dd8e",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1NTgsImlhdCI6MTc5MzM1MzY1OCwianRpIjoiNDM4ZTUyMjgtNzU3NS00ODM5LWEzYjktMDk3OTg2NjczYTk3Iiwic2lkIjoiZGYxNTE4NzEtODkwOC00NmE5LWFlZTktMWQ2ZDE1MjZkZDhlIn0.2LU_9aX9rK8_TTcRiU6Y0d_N4HcNmBQwJqBnxlKZ7JU",
  "access_expires_at": "2026-10-30T10:02:38.011629028Z",
  "refresh_token": "97gm37Um1GX9OpHas3Z4AHgS632sj67PX5TKDd9g4eE",
  "refresh_expires_at": "2026-10-30T21:47:38.011024721Z",
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
  "command_id": "39398b00-d037-4cc6-87c0-59d6f25a45cb",
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
  "changed_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T09:47:38.616457Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "001e7a18-dc84-4b65-870d-5b94a03a8116",
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
  "correlation_id": "89d73774-8915-4676-9239-daa6dac41619"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "e26cabc6-de11-46f5-ae81-976ee559b574",
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
  "correlation_id": "c708b206-8dec-4f98-8dd9-3242608fde22"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632188732",
  "device_ref": "sandbox-32115"
}
```

```json
{
  "challenge_id": "ddb8c07d-7784-47a1-8c46-8e32128ea02f",
  "expires_at": "2026-10-30T09:52:39.534199785Z",
  "resend_available_at": "2026-10-30T09:47:40.534199785Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632188732` → **200**

```json
{
  "phone": "+380632188732",
  "audience": "CLIENT",
  "code": "704155",
  "sent_at": "2026-10-30T09:47:39.538376952Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ddb8c07d-7784-47a1-8c46-8e32128ea02f",
  "code": "704155",
  "device_ref": "sandbox-32115"
}
```

```json
{
  "session_id": "9a9c0bf0-acf5-476f-aa96-56d8fb5dfca3",
  "subject": {
    "type": "CLIENT",
    "id": "500328a9-62ec-4fe3-beb2-9d1e91b59625"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MDAzMjhhOS02MmVjLTRmZTMtYmViMi05ZDFlOTFiNTk2MjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NTU5LCJpYXQiOjE3OTMzNTM2NTksImp0aSI6IjZlY2Q5ZTY5LWVjNTAtNGQ5OC04Zjk3LWY1NjBkODQ4ZmMxNiIsInNpZCI6IjlhOWMwYmYwLWFjZjUtNDc2Zi1hYTk2LTU2ZDhmYjVkZmNhMyJ9.FozIzjOBFI-r4a9TU_8As1Kbp9Iy4mz5z5mZWuFrOaM",
  "access_expires_at": "2026-10-30T10:02:39.857698762Z",
  "refresh_token": "sxxDsxMz7uVdqOF6IUw3NyPlxJM6hcoSoxnxwAet8j0",
  "refresh_expires_at": "2026-11-29T09:47:39.857077623Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ddcd563a-0e2c-469e-b64f-879e81e28cc1",
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
  "id": "e40ba44e-5e10-4f98-aa89-57f62fcc4bbe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:52:40.156458Z",
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
  "command_id": "e48b68c0-661f-4c78-ac7d-6edd1a88de19",
  "quote_id": "e40ba44e-5e10-4f98-aa89-57f62fcc4bbe",
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
  "correlation_id": "7918a8f0-684f-4383-8480-b234bdf86922"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9f4a5976-d688-46ff-a78b-23435e61f304",
  "quote_id": "e40ba44e-5e10-4f98-aa89-57f62fcc4bbe",
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
  "id": "845f7427-196a-4bd9-b8bd-d8ccd0704f55",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "500328a9-62ec-4fe3-beb2-9d1e91b59625",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:47:40.765484Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/845f7427-196a-4bd9-b8bd-d8ccd0704f55/cancel` → **200**

```json
{
  "command_id": "a880f394-1d77-47ca-ac09-b8588e9e9f78",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "845f7427-196a-4bd9-b8bd-d8ccd0704f55",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "500328a9-62ec-4fe3-beb2-9d1e91b59625",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:47:40.765484Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
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
  "command_id": "c75a93df-dff1-4443-9148-d5fba0e61245",
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
  "changed_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T09:47:41.415813Z"
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
      "changed_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T09:47:41.415813Z"
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
  "device_ref": "sandbox-11451"
}
```

```json
{
  "challenge_id": "242db4f5-56da-4a2b-bed2-a315bcf9a87f",
  "expires_at": "2026-10-30T09:52:42.335554357Z",
  "resend_available_at": "2026-10-30T09:47:43.335554357Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "391972",
  "sent_at": "2026-10-30T09:47:42.338222359Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "242db4f5-56da-4a2b-bed2-a315bcf9a87f",
  "code": "391972",
  "device_ref": "sandbox-11451"
}
```

```json
{
  "session_id": "79822b50-769d-4732-93a8-0abdd496e42c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDU2MiwiaWF0IjoxNzkzMzUzNjYyLCJqdGkiOiJmNTBlMDkwNi00MTNiLTQ2ZGMtYThiYS1kOTdlYjViZTlkOGYiLCJzaWQiOiI3OTgyMmI1MC03NjlkLTQ3MzItOTNhOC0wYWJkZDQ5NmU0MmMifQ.YRvw3NtkdAZ_6ixaV7LKw2J2DhIkLZQpkwqXy2Rz_0s",
  "access_expires_at": "2026-10-30T10:02:42.655706373Z",
  "refresh_token": "EmAgOJmBs_yV_W9wq6LI3RtrFKhS3GDIfzvwee9tk6k",
  "refresh_expires_at": "2026-11-29T09:47:42.655114158Z",
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
  "command_id": "8d6393c2-3e59-4115-9713-70b78948624e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:47:43Z",
    "sequence": 1793353663230
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c8cf0420-2fe7-427c-946e-e67db30250e2",
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
  "last_heartbeat_at": "2026-10-30T09:47:43.248719Z",
  "last_location_at": "2026-10-30T09:47:43.248719Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672516507",
  "device_ref": "sandbox-22426"
}
```

```json
{
  "challenge_id": "38a6e21d-44cc-4615-9144-9893c2326192",
  "expires_at": "2026-10-30T09:52:43.539055968Z",
  "resend_available_at": "2026-10-30T09:47:44.539055968Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672516507` → **200**

```json
{
  "phone": "+380672516507",
  "audience": "CLIENT",
  "code": "658385",
  "sent_at": "2026-10-30T09:47:43.541972616Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "38a6e21d-44cc-4615-9144-9893c2326192",
  "code": "658385",
  "device_ref": "sandbox-22426"
}
```

```json
{
  "session_id": "fd3355a1-69e9-400b-add4-a134427fe19f",
  "subject": {
    "type": "CLIENT",
    "id": "4411eb48-405a-492a-8b1d-d0fb8df659ae"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NDExZWI0OC00MDVhLTQ5MmEtOGIxZC1kMGZiOGRmNjU5YWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NTYzLCJpYXQiOjE3OTMzNTM2NjMsImp0aSI6IjM0M2Q1MTJiLWJhMjgtNDY3MC04NGNhLTZjODYxNTRhYzBlZiIsInNpZCI6ImZkMzM1NWExLTY5ZTktNDAwYi1hZGQ0LWExMzQ0MjdmZTE5ZiJ9.Y40Qat4vPd1HEJnqlneAtJhNwX2jIvJScYy9dSGu3hI",
  "access_expires_at": "2026-10-30T10:02:43.858694324Z",
  "refresh_token": "z955CjTRx2mbd7fm-GB75qoTNGM-jODnuCIx7ll5elU",
  "refresh_expires_at": "2026-11-29T09:47:43.85802774Z",
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
  "command_id": "5f47e698-c319-42f4-824d-91443fc5bb6e",
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
  "id": "bc5e89cd-9ad2-4e87-8093-7c1658abce51",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:52:44.474444Z",
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
  "command_id": "b37a2ab8-d337-4c46-bd5e-87af604631cd",
  "platform": "ANDROID",
  "token": "sandbox-driver-49523210-6e69-453c-adde-117f4ba8b8bf"
}
```

```json
{
  "id": "03548033-6cc8-4f0b-8305-3fb4ddb9ff3e",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T09:47:44.782631Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "d5e52654-a556-4039-a745-cc43b43229a0",
  "platform": "ANDROID",
  "token": "sandbox-rider-304112f2-d12b-40d2-a4c8-0b3f287f7529"
}
```

```json
{
  "id": "8f158553-9181-4e56-95e4-f5c8c3501829",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T09:47:45.085226Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "e5fe480f-4096-4c27-9834-c790d7afa433",
  "quote_id": "bc5e89cd-9ad2-4e87-8093-7c1658abce51",
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
  "id": "67d4f32e-07b9-4338-b49b-744970492009",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4411eb48-405a-492a-8b1d-d0fb8df659ae",
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
  "created_at": "2026-10-30T09:47:45.3924Z",
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
    "id": "a78784ad-6ef6-46a8-b124-adaa8aba57d1",
    "order_id": "67d4f32e-07b9-4338-b49b-744970492009",
    "expires_at": "2026-10-30T09:48:00.395716Z",
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

`POST /api/driver/v1/offers/a78784ad-6ef6-46a8-b124-adaa8aba57d1/accept` → **200**

```json
{
  "command_id": "fc867900-b0fc-492a-89b6-7b15a9442f1d"
}
```

```json
{
  "id": "e5a197c4-e8c7-42da-a0b8-f55acdcb9354",
  "order_id": "67d4f32e-07b9-4338-b49b-744970492009",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3e3a82a6-663a-4d75-91a1-86ae2b1d671c",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T09:47:45.367Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T09:47:45.367Z` → **200**

```json
[
  {
    "at": "2026-10-30T09:47:46.456323097Z",
    "token_suffix": "a8b8bf",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_version": "2",
      "event_id": "63418053-2f77-4760-a57d-962b03dbe7be",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "67d4f32e-07b9-4338-b49b-744970492009"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380672516507&after=2026-10-30T09:47:45.367Z` → **200**

```json
[
  {
    "at": "2026-10-30T09:47:46.459234014Z",
    "token_suffix": "7f7529",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_version": "3",
      "event_id": "deb0801a-66d9-47d9-a9e1-f7d0c7e5d4d6",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "67d4f32e-07b9-4338-b49b-744970492009"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/67d4f32e-07b9-4338-b49b-744970492009/messages` → **201**

```json
{
  "command_id": "6eaab75c-4b99-4eaa-9320-b10d6f2c5ec0",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "4caa66f1-048a-41ba-865d-d41aabd2e567",
  "order_id": "67d4f32e-07b9-4338-b49b-744970492009",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T09:47:47.383992557Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3e3a82a6-663a-4d75-91a1-86ae2b1d671c",
  "order_id": "67d4f32e-07b9-4338-b49b-744970492009",
  "assignment_id": "e5a197c4-e8c7-42da-a0b8-f55acdcb9354",
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

`POST /api/driver/v1/trips/3e3a82a6-663a-4d75-91a1-86ae2b1d671c/messages` → **201**

```json
{
  "command_id": "592d9594-aaac-4c1f-8d84-7e026df62228",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "8a1fe509-c512-4a4a-af3d-c9c1f7ad3fe1",
  "order_id": "67d4f32e-07b9-4338-b49b-744970492009",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T09:47:47.96218711Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/67d4f32e-07b9-4338-b49b-744970492009/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/3e3a82a6-663a-4d75-91a1-86ae2b1d671c/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672516507"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/c8cf0420-2fe7-427c-946e-e67db30250e2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:47:48Z",
    "sequence": 1793353668802
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c8cf0420-2fe7-427c-946e-e67db30250e2",
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
  "last_heartbeat_at": "2026-10-30T09:47:48.821775Z",
  "last_location_at": "2026-10-30T09:47:48.821775Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3e3a82a6-663a-4d75-91a1-86ae2b1d671c",
  "order_id": "67d4f32e-07b9-4338-b49b-744970492009",
  "assignment_id": "e5a197c4-e8c7-42da-a0b8-f55acdcb9354",
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

`POST /api/driver/v1/trips/3e3a82a6-663a-4d75-91a1-86ae2b1d671c/arrive` → **200**

```json
{
  "command_id": "78d3100a-cabc-4b65-acd1-dbd548a93e21",
  "expected_version": 0
}
```

```json
{
  "id": "3e3a82a6-663a-4d75-91a1-86ae2b1d671c",
  "order_id": "67d4f32e-07b9-4338-b49b-744970492009",
  "assignment_id": "e5a197c4-e8c7-42da-a0b8-f55acdcb9354",
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
  "arrived_at": "2026-10-30T09:47:49.414395Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3e3a82a6-663a-4d75-91a1-86ae2b1d671c/start` → **200**

```json
{
  "command_id": "96bff36b-bff1-4804-9a08-ae54b100951d",
  "expected_version": 1
}
```

```json
{
  "id": "3e3a82a6-663a-4d75-91a1-86ae2b1d671c",
  "order_id": "67d4f32e-07b9-4338-b49b-744970492009",
  "assignment_id": "e5a197c4-e8c7-42da-a0b8-f55acdcb9354",
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
  "arrived_at": "2026-10-30T09:47:49.414395Z",
  "started_at": "2026-10-30T09:47:49.709111Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/c8cf0420-2fe7-427c-946e-e67db30250e2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:47:49Z",
    "sequence": 1793353669998
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c8cf0420-2fe7-427c-946e-e67db30250e2",
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
  "last_heartbeat_at": "2026-10-30T09:47:50.017494Z",
  "last_location_at": "2026-10-30T09:47:50.017494Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/3e3a82a6-663a-4d75-91a1-86ae2b1d671c/complete` → **200**

```json
{
  "command_id": "cf10bf85-f2c8-4efe-8a96-f2eb3a810a4a",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:47:50Z",
  "cash_received": true
}
```

```json
{
  "id": "3e3a82a6-663a-4d75-91a1-86ae2b1d671c",
  "order_id": "67d4f32e-07b9-4338-b49b-744970492009",
  "assignment_id": "e5a197c4-e8c7-42da-a0b8-f55acdcb9354",
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
  "arrived_at": "2026-10-30T09:47:49.414395Z",
  "started_at": "2026-10-30T09:47:49.709111Z",
  "completed_at": "2026-10-30T09:47:50.316228Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/67d4f32e-07b9-4338-b49b-744970492009` → **200**

```json
{
  "id": "67d4f32e-07b9-4338-b49b-744970492009",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "4411eb48-405a-492a-8b1d-d0fb8df659ae",
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
    "id": "e5a197c4-e8c7-42da-a0b8-f55acdcb9354",
    "order_id": "67d4f32e-07b9-4338-b49b-744970492009",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3e3a82a6-663a-4d75-91a1-86ae2b1d671c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:47:45.3924Z",
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
    "id": "67d4f32e-07b9-4338-b49b-744970492009",
    "short_number": 14,
    "status": "FULFILLED",
    "created_at": "2026-10-30T09:47:45.3924Z",
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
    "id": "3e3a82a6-663a-4d75-91a1-86ae2b1d671c",
    "order_id": "67d4f32e-07b9-4338-b49b-744970492009",
    "order_short_number": 14,
    "created_at": "2026-10-30T09:47:45.989675Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "2da26b7a-1567-4f2f-8c89-ee5e0010965f",
    "order_id": "e9375585-c8cc-45e6-94d7-562915f0687b",
    "order_short_number": 9,
    "created_at": "2026-10-30T09:46:28.494145Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "4b677cb1-c00f-4ecb-aef9-c616a3e3bb33",
    "order_id": "94675f5f-3b73-4583-9b7c-247a743ea319",
    "order_short_number": 4,
    "created_at": "2026-10-30T09:45:41.528425Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "a8134d2e-07e0-47aa-a95b-4b92ae3ceafe",
    "order_id": "725c2a3a-0ba0-4ced-8f1f-fa4d753a8afb",
    "order_short_number": 2,
    "created_at": "2026-10-30T09:44:59.51528Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "9c2a6f69-bcf0-41ad-9d09-0174bbf14ca0",
    "order_id": "089e917f-bcf7-4df8-9065-f80f57dcc3d7",
    "order_short_number": 1,
    "created_at": "2026-10-30T09:44:49.526893Z",
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

`GET /api/rider/v1/orders/67d4f32e-07b9-4338-b49b-744970492009/tip` → **200**

```json
{
  "order_id": "67d4f32e-07b9-4338-b49b-744970492009",
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
  "available_until": "2026-10-31T09:47:50.316228Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/67d4f32e-07b9-4338-b49b-744970492009/tip` → **201**

```json
{
  "command_id": "a4ca134b-8130-47c4-921e-5ea23dff5571",
  "amount_minor": 1100
}
```

```json
{
  "id": "c786a064-216b-41d4-8548-c8c9b26fa429",
  "order_id": "67d4f32e-07b9-4338-b49b-744970492009",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T09:47:55.395124Z"
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
  "session_id": "719c127d-0718-461d-a429-9bf35bb6d90a",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1NzUsImlhdCI6MTc5MzM1MzY3NSwianRpIjoiYjI3YjJmNzAtYjlmMC00YmUyLThmMWQtNDM4ZDU2NzI5OWY2Iiwic2lkIjoiNzE5YzEyN2QtMDcxOC00NjFkLWE0MjktOWJmMzViYjZkOTBhIn0.COaXpXFdDZmf6EM_tR4qIwHCA95NwjdAptuxMj6y1Zc",
  "access_expires_at": "2026-10-30T10:02:55.999797701Z",
  "refresh_token": "YQiRavJvS34jP9DqiQKz6cVzdqWnQXJ2Tmb1Wb_taxA",
  "refresh_expires_at": "2026-10-30T21:47:55.999103205Z",
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
  "generated_at": "2026-10-30T09:47:56.30619787Z"
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
  "generated_at": "2026-10-30T09:47:56.602995678Z"
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
  "session_id": "60c24eec-163a-4977-b488-885d94be6cad",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1NzcsImlhdCI6MTc5MzM1MzY3NywianRpIjoiMzcwMWUxZWQtNDZkMC00NDA0LWI0NTgtMjY4ZDlmODljOWQ1Iiwic2lkIjoiNjBjMjRlZWMtMTYzYS00OTc3LWI0ODgtODg1ZDk0YmU2Y2FkIn0.moLwYDAV5nAJogl9D4veqlJQ_4oCUweIDqGQxzsgSaY",
  "access_expires_at": "2026-10-30T10:02:57.197479059Z",
  "refresh_token": "9rVxoeN4XH-LCoHYTVML934friqLTm2VGS-bhThZVPA",
  "refresh_expires_at": "2026-10-30T21:47:57.196625377Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/67d4f32e-07b9-4338-b49b-744970492009/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:47:45.392861Z",
      "actor": {
        "type": "CLIENT",
        "id": "4411eb48-405a-492a-8b1d-d0fb8df659ae",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "67d4f32e-07b9-4338-b49b-744970492009",
        "quote_id": "bc5e89cd-9ad2-4e87-8093-7c1658abce51",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "bc80751c-3ef3-4900-82a6-c720a81bd3c7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:47:45.395Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "67d4f32e-07b9-4338-b49b-744970492009",
        "attempt_id": "df646fa8-9b9b-44c6-937a-8846df51343b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "bc80751c-3ef3-4900-82a6-c720a81bd3c7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:47:45.397826Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a78784ad-6ef6-46a8-b124-adaa8aba57d1",
        "order_id": "67d4f32e-07b9-4338-b49b-744970492009",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "bc80751c-3ef3-4900-82a6-c720a81bd3c7"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T09:47:45.991372Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a78784ad-6ef6-46a8-b124-adaa8aba57d1",
        "order_id": "67d4f32e-07b9-4338-b49b-744970492009",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "e5a197c4-e8c7-42da-a0b8-f55acdcb9354"
      },
      "correlation_id": "eb688777-73b2-405f-b8a7-16821b186ea3"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T09:47:57.782817208Z",
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
      "last_location_at": "2026-10-30T09:47:50.017494Z",
      "order_id": null
    }
  ]
}
```

Done: order 67d4f32e-07b9-4338-b49b-744970492009.

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
  "session_id": "5f3af575-896a-4b99-890f-0174e8a27538",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1NzgsImlhdCI6MTc5MzM1MzY3OCwianRpIjoiYzMzYjA5MDctNTFlNi00NzY0LTlhMjktZThlMTRiYmE5NmRkIiwic2lkIjoiNWYzYWY1NzUtODk2YS00Yjk5LTg5MGYtMDE3NGU4YTI3NTM4In0.zjw795q8FuvuaGB7NbLTWP-w1opGtacFwhGGNHC3L_k",
  "access_expires_at": "2026-10-30T10:02:58.385144937Z",
  "refresh_token": "IRwGpA5gZY7ACp_moQchERG0ByGC5LR_axkniV_BhwM",
  "refresh_expires_at": "2026-10-30T21:47:58.384489865Z",
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
  "command_id": "64a2ab9d-a2a6-40cd-8aeb-867d5ecc344d",
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
  "timestamp": "2026-10-30T09:47:59.000+0000",
  "channel": {
    "id": "1730052000.2142428065",
    "linkedid": "1730052000.2142428065",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674007103"
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
  "timestamp": "2026-10-30T09:47:59.000+0000",
  "channel": {
    "id": "1730052000.2142428065",
    "linkedid": "1730052000.2142428065",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674007103"
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
  "session_id": "4d1e8ea5-9476-4f9a-99f0-31cfa13dd035",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1NzksImlhdCI6MTc5MzM1MzY3OSwianRpIjoiMGEwMzUzNzUtZGQxOS00OTRlLThiODgtYzBmOGU1NWE1ODJiIiwic2lkIjoiNGQxZThlYTUtOTQ3Ni00ZjlhLTk5ZjAtMzFjZmExM2RkMDM1In0.ozH2t9BbVIRK4Kn4FzyPZdnJaHw62xincD3xj7drBC8",
  "access_expires_at": "2026-10-30T10:02:59.596155677Z",
  "refresh_token": "yGl6eioddM5Xo5a98T2szGCuikkNVSyOvOWcOlelECE",
  "refresh_expires_at": "2026-10-30T21:47:59.595586625Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "93da4b4c-f278-469a-b176-aeec463a10a7",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674007103",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T09:47:59Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/93da4b4c-f278-469a-b176-aeec463a10a7/answer` → **200**

```json
{
  "command_id": "eeee466d-142a-431a-ba0a-08c83c25af03"
}
```

```json
{
  "id": "93da4b4c-f278-469a-b176-aeec463a10a7",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674007103",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "order_ids": [],
  "started_at": "2026-10-30T09:47:59Z",
  "answered_at": "2026-10-30T09:48:00.196043Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2142428065",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "986c30d5-331e-4ab4-8c4b-b53878e180cf",
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
  "id": "bbf2973e-e98e-4a3f-8fd2-4afd75a5c469",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:53:00.527734Z",
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
  "command_id": "163a9aff-533d-4be9-98dc-3b5f5ef210d1",
  "quote_id": "bbf2973e-e98e-4a3f-8fd2-4afd75a5c469",
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
    "phone": "+380674007103"
  },
  "call_id": "93da4b4c-f278-469a-b176-aeec463a10a7"
}
```

```json
{
  "id": "9146ca3e-f430-4031-b601-9bc48c91fd37",
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
  "created_at": "2026-10-30T09:48:00.834563Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674007103"
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
    "id": "1730052000.2142428065",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "93da4b4c-f278-469a-b176-aeec463a10a7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674007103",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "order_ids": [
        "9146ca3e-f430-4031-b601-9bc48c91fd37"
      ],
      "started_at": "2026-10-30T09:47:59Z",
      "answered_at": "2026-10-30T09:48:00.196043Z",
      "ended_at": "2026-10-30T09:48:01.164284Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "bf77f12f-267a-45f8-bb28-2d9064fdb033",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674732294",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "order_ids": [],
      "started_at": "2026-10-30T09:45:27.877301Z",
      "answered_at": "2026-10-30T09:45:28.214103Z",
      "ended_at": "2026-10-30T09:45:28.543694Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:45:35.840873Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/9146ca3e-f430-4031-b601-9bc48c91fd37` → **200**

```json
{
  "id": "9146ca3e-f430-4031-b601-9bc48c91fd37",
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
  "created_at": "2026-10-30T09:48:00.834563Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674007103"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/9146ca3e-f430-4031-b601-9bc48c91fd37` → **200**

```json
{
  "id": "9146ca3e-f430-4031-b601-9bc48c91fd37",
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
  "created_at": "2026-10-30T09:48:00.834563Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674007103"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9146ca3e-f430-4031-b601-9bc48c91fd37/cancel` → **200**

```json
{
  "command_id": "d3fc47aa-80ec-4da1-898a-15f879ade1b8",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "9146ca3e-f430-4031-b601-9bc48c91fd37",
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
  "created_at": "2026-10-30T09:48:00.834563Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674007103"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 93da4b4c-f278-469a-b176-aeec463a10a7 with order 9146ca3e-f430-4031-b601-9bc48c91fd37.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2972"
}
```

```json
{
  "challenge_id": "ebf5b630-80a2-4aff-b286-5d3e12e54f9c",
  "expires_at": "2026-10-30T09:53:02.434141608Z",
  "resend_available_at": "2026-10-30T09:48:03.434141608Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "714986",
  "sent_at": "2026-10-30T09:48:02.436821703Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ebf5b630-80a2-4aff-b286-5d3e12e54f9c",
  "code": "714986",
  "device_ref": "sandbox-2972"
}
```

```json
{
  "session_id": "ce78d095-61af-4e35-80f3-943df0193160",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDU4MiwiaWF0IjoxNzkzMzUzNjgyLCJqdGkiOiJlZGI2Y2IzNi0yMzVkLTQ4MjUtYjU5OC00NmZmN2JmNjY0YjQiLCJzaWQiOiJjZTc4ZDA5NS02MWFmLTRlMzUtODBmMy05NDNkZjAxOTMxNjAifQ.wezdX3qBOneptZnKCSW1BAoQ4nR8bbDyrQSzjWFqI1E",
  "access_expires_at": "2026-10-30T10:03:02.754810308Z",
  "refresh_token": "3arZ3GY9kn2icpp16Lmcu-ev3D3LZsf2RsFDY9kfDAM",
  "refresh_expires_at": "2026-11-29T09:48:02.754254657Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c8cf0420-2fe7-427c-946e-e67db30250e2",
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
  "last_heartbeat_at": "2026-10-30T09:47:50.017494Z",
  "last_location_at": "2026-10-30T09:47:50.017494Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c8cf0420-2fe7-427c-946e-e67db30250e2/handover` → **200**

```json
{
  "command_id": "2211eb43-d688-47a4-a3ce-a3e8b5ba7a0e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c8cf0420-2fe7-427c-946e-e67db30250e2",
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
  "last_heartbeat_at": "2026-10-30T09:47:50.017494Z",
  "last_location_at": "2026-10-30T09:47:50.017494Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c8cf0420-2fe7-427c-946e-e67db30250e2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:48:03Z",
    "sequence": 1793353683625
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c8cf0420-2fe7-427c-946e-e67db30250e2",
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
  "last_heartbeat_at": "2026-10-30T09:48:03.645523Z",
  "last_location_at": "2026-10-30T09:48:03.645523Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667750635",
  "device_ref": "sandbox-14986"
}
```

```json
{
  "challenge_id": "b2e8e1ba-b813-4fce-8621-794909a21a28",
  "expires_at": "2026-10-30T09:53:03.926984807Z",
  "resend_available_at": "2026-10-30T09:48:04.926984807Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667750635` → **200**

```json
{
  "phone": "+380667750635",
  "audience": "CLIENT",
  "code": "067562",
  "sent_at": "2026-10-30T09:48:03.929855071Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b2e8e1ba-b813-4fce-8621-794909a21a28",
  "code": "067562",
  "device_ref": "sandbox-14986"
}
```

```json
{
  "session_id": "a0a61729-47a8-4c75-928d-e10e181e327b",
  "subject": {
    "type": "CLIENT",
    "id": "f50aa049-61f8-41c6-8374-844bffce46de"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNTBhYTA0OS02MWY4LTQxYzYtODM3NC04NDRiZmZjZTQ2ZGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NTg0LCJpYXQiOjE3OTMzNTM2ODQsImp0aSI6IjIyNTRhYzRjLTNhNWEtNDU0MS1hMGFlLTIwMzg0OTJiYjZjMiIsInNpZCI6ImEwYTYxNzI5LTQ3YTgtNGM3NS05MjhkLWUxMGUxODFlMzI3YiJ9.Mknd9oBegNHyDqusPo9F3-FlkVqa4i2xWa0XaTwM-Z0",
  "access_expires_at": "2026-10-30T10:03:04.251091603Z",
  "refresh_token": "B5pmz51D2qdkwZpaSLFYq0k1alSotaHnypsu-Do8N_c",
  "refresh_expires_at": "2026-11-29T09:48:04.249856337Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "67e84cac-9bb1-4136-a1d1-b75052445421",
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
  "id": "e2e6e2d3-416b-4d2d-bcf3-8f70d7555c8d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:53:04.553183Z",
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
  "command_id": "aefed3f6-74c3-4ece-982e-a003b66a172e",
  "quote_id": "e2e6e2d3-416b-4d2d-bcf3-8f70d7555c8d",
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
  "id": "bcf4bc5f-21ff-4d3c-a867-387b749b9b52",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f50aa049-61f8-41c6-8374-844bffce46de",
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
  "created_at": "2026-10-30T09:48:04.859751Z",
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
    "id": "ddaf5951-4111-4064-8ea8-a2aa87f8eabb",
    "order_id": "bcf4bc5f-21ff-4d3c-a867-387b749b9b52",
    "expires_at": "2026-10-30T09:48:19.862831Z",
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

`POST /api/driver/v1/offers/ddaf5951-4111-4064-8ea8-a2aa87f8eabb/accept` → **200**

```json
{
  "command_id": "dc1ad9a2-6875-4ed7-95e8-1e7cc465e90a"
}
```

```json
{
  "id": "a4c1e034-9b67-4678-bc3d-cb6d2aee9aa9",
  "order_id": "bcf4bc5f-21ff-4d3c-a867-387b749b9b52",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "35effaae-24d3-4f45-b2ae-5d51cad9067a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "35effaae-24d3-4f45-b2ae-5d51cad9067a",
  "order_id": "bcf4bc5f-21ff-4d3c-a867-387b749b9b52",
  "assignment_id": "a4c1e034-9b67-4678-bc3d-cb6d2aee9aa9",
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

`POST /api/driver/v1/work-sessions/c8cf0420-2fe7-427c-946e-e67db30250e2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:48:06Z",
    "sequence": 1793353686432
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c8cf0420-2fe7-427c-946e-e67db30250e2",
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
  "last_heartbeat_at": "2026-10-30T09:48:06.062409Z",
  "last_location_at": "2026-10-30T09:48:06.062409Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/35effaae-24d3-4f45-b2ae-5d51cad9067a/arrive` → **200**

```json
{
  "command_id": "731954d5-0faa-4086-a5b1-b0353f971bdf",
  "expected_version": 0
}
```

```json
{
  "id": "35effaae-24d3-4f45-b2ae-5d51cad9067a",
  "order_id": "bcf4bc5f-21ff-4d3c-a867-387b749b9b52",
  "assignment_id": "a4c1e034-9b67-4678-bc3d-cb6d2aee9aa9",
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
  "arrived_at": "2026-10-30T09:48:06.359301Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/35effaae-24d3-4f45-b2ae-5d51cad9067a/start` → **200**

```json
{
  "command_id": "ca9d8463-8678-4b99-a960-084e1d2d52cc",
  "expected_version": 1
}
```

```json
{
  "id": "35effaae-24d3-4f45-b2ae-5d51cad9067a",
  "order_id": "bcf4bc5f-21ff-4d3c-a867-387b749b9b52",
  "assignment_id": "a4c1e034-9b67-4678-bc3d-cb6d2aee9aa9",
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
  "arrived_at": "2026-10-30T09:48:06.359301Z",
  "started_at": "2026-10-30T09:48:06.663099Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/c8cf0420-2fe7-427c-946e-e67db30250e2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:48:06Z",
    "sequence": 1793353686945
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c8cf0420-2fe7-427c-946e-e67db30250e2",
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
  "last_heartbeat_at": "2026-10-30T09:48:06.965119Z",
  "last_location_at": "2026-10-30T09:48:06.965119Z",
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
  "device_ref": "sandbox-16142"
}
```

```json
{
  "challenge_id": "d59529f7-6a8b-4fbe-873f-99d43b47eaeb",
  "expires_at": "2026-10-30T09:53:07.250619142Z",
  "resend_available_at": "2026-10-30T09:48:08.250619142Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "669043",
  "sent_at": "2026-10-30T09:48:07.253802266Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d59529f7-6a8b-4fbe-873f-99d43b47eaeb",
  "code": "669043",
  "device_ref": "sandbox-16142"
}
```

```json
{
  "session_id": "5962cab1-0f9e-483d-9def-9a4a751f0501",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDU4NywiaWF0IjoxNzkzMzUzNjg3LCJqdGkiOiI2OTY0YzVhMS01MDlmLTQxNGMtYWExOS1mNGI4YmNjMWUxMmEiLCJzaWQiOiI1OTYyY2FiMS0wZjllLTQ4M2QtOWRlZi05YTRhNzUxZjA1MDEifQ.jfXvryT54LskJbmPCBBWoJNhJa-nZ0OOfowmlexxkJU",
  "access_expires_at": "2026-10-30T10:03:07.569070868Z",
  "refresh_token": "aas9-SaGCFpudoOHy-yMYoTqpoz2zM6d_xg4MdHg-fc",
  "refresh_expires_at": "2026-11-29T09:48:07.568557039Z",
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
  "command_id": "8d83f10f-98bc-4796-8100-bd11ce69ea1d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:48:08Z",
    "sequence": 1793353688133
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "114340e3-71a7-437f-8e6e-2a9df90aeadc",
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
  "last_heartbeat_at": "2026-10-30T09:48:08.151936Z",
  "last_location_at": "2026-10-30T09:48:08.151936Z",
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
  "session_id": "99623aab-2495-4f1f-8d06-56b6ab42d320",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1ODgsImlhdCI6MTc5MzM1MzY4OCwianRpIjoiZjJiZjk2NmQtMzc4OC00ZjA0LTljMjUtOTRhNzc1N2E0ZDQ2Iiwic2lkIjoiOTk2MjNhYWItMjQ5NS00ZjFmLThkMDYtNTZiNmFiNDJkMzIwIn0.38gfTF5CE1OzQE6dK89yaRj4sR8ImlO-hhmfym0oMc0",
  "access_expires_at": "2026-10-30T10:03:08.738680558Z",
  "refresh_token": "d_PKMTR9kI1dlL5pe10D_WdT9dnomSRW-h9p-7xNpA4",
  "refresh_expires_at": "2026-10-30T21:48:08.738140992Z",
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
  "session_id": "a9001193-91d4-453a-b5af-5f416f1da22e",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1ODksImlhdCI6MTc5MzM1MzY4OSwianRpIjoiMGI3ZDZjY2ItYzg2Yy00YjA0LWE0MTgtZjc3MWViYmVmYTg1Iiwic2lkIjoiYTkwMDExOTMtOTFkNC00NTNhLWI1YWYtNWY0MTZmMWRhMjJlIn0.YllX22BG3lZJYW_c-2js_i0Ie4xFvJareJf3KdiAeM8",
  "access_expires_at": "2026-10-30T10:03:09.310145229Z",
  "refresh_token": "W8yhCT0NkBGVZvtGIeeDPk8LbEhcKJGEixH2kRLfdTo",
  "refresh_expires_at": "2026-10-30T21:48:09.309600192Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/bcf4bc5f-21ff-4d3c-a867-387b749b9b52` → **200**

```json
{
  "id": "bcf4bc5f-21ff-4d3c-a867-387b749b9b52",
  "short_number": 16,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "f50aa049-61f8-41c6-8374-844bffce46de",
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
    "id": "a4c1e034-9b67-4678-bc3d-cb6d2aee9aa9",
    "order_id": "bcf4bc5f-21ff-4d3c-a867-387b749b9b52",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "35effaae-24d3-4f45-b2ae-5d51cad9067a",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T09:48:04.859751Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/bcf4bc5f-21ff-4d3c-a867-387b749b9b52/interrupt` → **200**

```json
{
  "command_id": "567b420b-efe0-4f0f-b481-d28d72d380c1",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "bcf4bc5f-21ff-4d3c-a867-387b749b9b52",
    "short_number": 16,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "f50aa049-61f8-41c6-8374-844bffce46de",
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
      "id": "a4c1e034-9b67-4678-bc3d-cb6d2aee9aa9",
      "order_id": "bcf4bc5f-21ff-4d3c-a867-387b749b9b52",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "35effaae-24d3-4f45-b2ae-5d51cad9067a",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T09:48:04.859751Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "61e86e6f-bb70-4ab3-baa7-13f67f449b66",
    "short_number": 17,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "f50aa049-61f8-41c6-8374-844bffce46de",
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
    "id": "84f8d628-761e-4e5a-b38d-c11f60b063ea",
    "order_id": "61e86e6f-bb70-4ab3-baa7-13f67f449b66",
    "expires_at": "2026-10-30T09:48:24.925454Z",
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

`POST /api/driver/v1/offers/84f8d628-761e-4e5a-b38d-c11f60b063ea/accept` → **200**

```json
{
  "command_id": "2fdedb30-adea-4752-89f7-718ad24b0367"
}
```

```json
{
  "id": "126c1593-937f-4463-9b26-60361e63ae70",
  "order_id": "61e86e6f-bb70-4ab3-baa7-13f67f449b66",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a4512841-2ff9-4903-8108-41a3bdc4e5d2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a4512841-2ff9-4903-8108-41a3bdc4e5d2",
  "order_id": "61e86e6f-bb70-4ab3-baa7-13f67f449b66",
  "assignment_id": "126c1593-937f-4463-9b26-60361e63ae70",
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
  "session_id": "114340e3-71a7-437f-8e6e-2a9df90aeadc",
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
  "last_heartbeat_at": "2026-10-30T09:48:08.151936Z",
  "last_location_at": "2026-10-30T09:48:08.151936Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/114340e3-71a7-437f-8e6e-2a9df90aeadc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:48:11Z",
    "sequence": 1793353691440
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "114340e3-71a7-437f-8e6e-2a9df90aeadc",
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
  "last_heartbeat_at": "2026-10-30T09:48:11.459601Z",
  "last_location_at": "2026-10-30T09:48:11.459601Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a4512841-2ff9-4903-8108-41a3bdc4e5d2/arrive` → **200**

```json
{
  "command_id": "5bd04ef0-c4a9-45ba-b280-5435eeccf1c5",
  "expected_version": 0
}
```

```json
{
  "id": "a4512841-2ff9-4903-8108-41a3bdc4e5d2",
  "order_id": "61e86e6f-bb70-4ab3-baa7-13f67f449b66",
  "assignment_id": "126c1593-937f-4463-9b26-60361e63ae70",
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
  "arrived_at": "2026-10-30T09:48:11.75775Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a4512841-2ff9-4903-8108-41a3bdc4e5d2/start` → **200**

```json
{
  "command_id": "e519fe13-f5bc-46e5-9c27-815df2d4a182",
  "expected_version": 1
}
```

```json
{
  "id": "a4512841-2ff9-4903-8108-41a3bdc4e5d2",
  "order_id": "61e86e6f-bb70-4ab3-baa7-13f67f449b66",
  "assignment_id": "126c1593-937f-4463-9b26-60361e63ae70",
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
  "arrived_at": "2026-10-30T09:48:11.75775Z",
  "started_at": "2026-10-30T09:48:12.059708Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a4512841-2ff9-4903-8108-41a3bdc4e5d2/complete` → **200**

```json
{
  "command_id": "faaf7c70-9244-4f6b-9064-7169babc10ec",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:48:12Z"
}
```

```json
{
  "id": "a4512841-2ff9-4903-8108-41a3bdc4e5d2",
  "order_id": "61e86e6f-bb70-4ab3-baa7-13f67f449b66",
  "assignment_id": "126c1593-937f-4463-9b26-60361e63ae70",
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
  "arrived_at": "2026-10-30T09:48:11.75775Z",
  "started_at": "2026-10-30T09:48:12.059708Z",
  "completed_at": "2026-10-30T09:48:12.366181Z",
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
    "id": "61e86e6f-bb70-4ab3-baa7-13f67f449b66",
    "short_number": 17,
    "status": "FULFILLED",
    "created_at": "2026-10-30T09:48:09.915884Z",
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
    "id": "bcf4bc5f-21ff-4d3c-a867-387b749b9b52",
    "short_number": 16,
    "status": "CANCELLED",
    "created_at": "2026-10-30T09:48:04.859751Z",
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
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way"
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

`GET /api/operator/v1/orders/bcf4bc5f-21ff-4d3c-a867-387b749b9b52/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:48:04.860295Z",
      "actor": {
        "type": "CLIENT",
        "id": "f50aa049-61f8-41c6-8374-844bffce46de",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "bcf4bc5f-21ff-4d3c-a867-387b749b9b52",
        "quote_id": "e2e6e2d3-416b-4d2d-bcf3-8f70d7555c8d",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "1fa64001-5165-498e-8865-7cf18b4c3497"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:48:04.862172Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "bcf4bc5f-21ff-4d3c-a867-387b749b9b52",
        "attempt_id": "b386b18a-fd71-444d-8acd-16ff5f11f866",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1fa64001-5165-498e-8865-7cf18b4c3497"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:48:04.864853Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ddaf5951-4111-4064-8ea8-a2aa87f8eabb",
        "order_id": "bcf4bc5f-21ff-4d3c-a867-387b749b9b52",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "1fa64001-5165-498e-8865-7cf18b4c3497"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T09:48:05.48054Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ddaf5951-4111-4064-8ea8-a2aa87f8eabb",
        "order_id": "bcf4bc5f-21ff-4d3c-a867-387b749b9b52",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "a4c1e034-9b67-4678-bc3d-cb6d2aee9aa9"
      },
      "correlation_id": "431870cd-cc73-4924-bae1-f9fdf7126e9a"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/61e86e6f-bb70-4ab3-baa7-13f67f449b66/tip` → **200**

```json
{
  "order_id": "61e86e6f-bb70-4ab3-baa7-13f67f449b66",
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
  "available_until": "2026-10-31T09:48:12.366181Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/61e86e6f-bb70-4ab3-baa7-13f67f449b66/tip` → **409**

```json
{
  "command_id": "7bf2d888-7dbd-4026-aa94-ca2c3983f3d9",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/61e86e6f-bb70-4ab3-baa7-13f67f449b66/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0d7ada02-a766-4c05-b7cf-c35652cda128"
}
```

Done: interrupted bcf4bc5f-21ff-4d3c-a867-387b749b9b52, follow-up 61e86e6f-bb70-4ab3-baa7-13f67f449b66.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c8cf0420-2fe7-427c-946e-e67db30250e2",
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
  "last_heartbeat_at": "2026-10-30T09:48:06.965119Z",
  "last_location_at": "2026-10-30T09:48:06.965119Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c8cf0420-2fe7-427c-946e-e67db30250e2/close` → **200**

```json
{
  "command_id": "4ba576c9-ec75-48fb-8039-9254c271b9cb",
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
  "session_id": "114340e3-71a7-437f-8e6e-2a9df90aeadc",
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
  "last_heartbeat_at": "2026-10-30T09:48:11.459601Z",
  "last_location_at": "2026-10-30T09:48:11.459601Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/114340e3-71a7-437f-8e6e-2a9df90aeadc/close` → **200**

```json
{
  "command_id": "a540f9c7-a3bd-4ae6-bbd1-8b161d98f5c1",
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
  "session_id": "916e738d-93a8-4182-8e31-b8485c418a7d",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1OTgsImlhdCI6MTc5MzM1MzY5OCwianRpIjoiMDFmODlhZDUtYjI1NC00NzFlLWE1OTEtYWFlNDY5ZDQyMzYzIiwic2lkIjoiOTE2ZTczOGQtOTNhOC00MTgyLThlMzEtYjg0ODVjNDE4YTdkIn0.8C3uGdTaElOpHgzPcwX-PvOBBnqaghjcpbrkuDmkgZM",
  "access_expires_at": "2026-10-30T10:03:18.616048157Z",
  "refresh_token": "_KDuMNAGD_9A5RykUSi5qsMJwygDto-S9HQw75qWESs",
  "refresh_expires_at": "2026-10-30T21:48:18.615499022Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "6115063f-3929-47c5-af4e-df1f6f41f035",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:48:18Z"
}
```

```json
{
  "id": "b7fdf0d9-e9e7-4705-bcf0-edbbddb7a833",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:48:18Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/b7fdf0d9-e9e7-4705-bcf0-edbbddb7a833/publish` → **200**

```json
{
  "command_id": "fc77a5fa-efbe-4204-89e8-79f0a41cf8af",
  "expected_version": 0
}
```

```json
{
  "id": "b7fdf0d9-e9e7-4705-bcf0-edbbddb7a833",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:48:19.215071Z",
  "published_at": "2026-10-30T09:48:19.215071Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "b7fdf0d9-e9e7-4705-bcf0-edbbddb7a833",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T09:48:19.215071Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631764969",
  "device_ref": "sandbox-15201"
}
```

```json
{
  "challenge_id": "28538308-8859-4968-996e-0bfe1647845f",
  "expires_at": "2026-10-30T09:53:19.800409505Z",
  "resend_available_at": "2026-10-30T09:48:20.800409505Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631764969` → **200**

```json
{
  "phone": "+380631764969",
  "audience": "CLIENT",
  "code": "824469",
  "sent_at": "2026-10-30T09:48:19.803465996Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "28538308-8859-4968-996e-0bfe1647845f",
  "code": "824469",
  "device_ref": "sandbox-15201"
}
```

```json
{
  "session_id": "1e4ed9cd-19f3-4824-a510-87658d4e1e2b",
  "subject": {
    "type": "CLIENT",
    "id": "6d13c68c-264a-456a-8443-56a133e890c5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZDEzYzY4Yy0yNjRhLTQ1NmEtODQ0My01NmExMzNlODkwYzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NjAwLCJpYXQiOjE3OTMzNTM3MDAsImp0aSI6ImZlMjRhNTMwLTUwMjYtNDczZi1iY2E4LTE2OTZlNDE1YzFkZSIsInNpZCI6IjFlNGVkOWNkLTE5ZjMtNDgyNC1hNTEwLTg3NjU4ZDRlMWUyYiJ9.924IZApO0-h0Vz1PtBrpIEizOJWpE0kVQFqo43Z566M",
  "access_expires_at": "2026-10-30T10:03:20.108100544Z",
  "refresh_token": "2zJe2xjdL4cIBscV_54N3z9qBwBDhmJybguK784EY-U",
  "refresh_expires_at": "2026-11-29T09:48:20.107563359Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "b7fdf0d9-e9e7-4705-bcf0-edbbddb7a833",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T09:48:19.215071Z",
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
  "command_id": "dfdd3a5c-67ad-4322-980a-6c7adf40bd67",
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
  "id": "0bad0141-6b3e-46b5-a835-4512a4f3766d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:53:20.702896Z",
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
  "command_id": "6952456d-8186-4f18-b13f-aa5cccd5f7ec",
  "quote_id": "0bad0141-6b3e-46b5-a835-4512a4f3766d",
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
  "correlation_id": "03df5d7a-a6ba-438b-82f7-44a268797f37"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "53a4279b-effe-40b0-a2e7-e604f72ea823",
  "version_id": "b7fdf0d9-e9e7-4705-bcf0-edbbddb7a833",
  "language": "uk"
}
```

```json
{
  "version_id": "b7fdf0d9-e9e7-4705-bcf0-edbbddb7a833",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T09:48:21.307128Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6151ff97-1ab9-41f6-8800-f6792fea939a",
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
  "id": "931670d9-8ec6-4fc1-8729-a6208145bf7f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:53:21.599789Z",
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
  "command_id": "87c8b738-d81d-46e2-90dd-6072574587c8",
  "quote_id": "931670d9-8ec6-4fc1-8729-a6208145bf7f",
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
  "id": "095e3ec0-d416-482b-ad93-6af07732cf68",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6d13c68c-264a-456a-8443-56a133e890c5",
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
  "created_at": "2026-10-30T09:48:21.898743Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/095e3ec0-d416-482b-ad93-6af07732cf68` → **200**

```json
{
  "id": "095e3ec0-d416-482b-ad93-6af07732cf68",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6d13c68c-264a-456a-8443-56a133e890c5",
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
  "created_at": "2026-10-30T09:48:21.898743Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/095e3ec0-d416-482b-ad93-6af07732cf68/cancel` → **200**

```json
{
  "command_id": "d65ae423-7c6a-4d5f-8ac8-bd9c69b95328",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "095e3ec0-d416-482b-ad93-6af07732cf68",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6d13c68c-264a-456a-8443-56a133e890c5",
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
  "created_at": "2026-10-30T09:48:21.898743Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
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

`POST /api/admin/v1/legal-documents/b7fdf0d9-e9e7-4705-bcf0-edbbddb7a833` → **409**

```json
{
  "command_id": "96659d92-1e51-435f-822e-b921ea487223",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:48:22Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/b7fdf0d9-e9e7-4705-bcf0-edbbddb7a833",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d0880a84-5dcf-4ff8-85f2-9d6c6fd0fcdb"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "956c67ea-46d9-4502-8af8-c37e8fefa127",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T09:48:23Z"
}
```

```json
{
  "id": "0a73b994-7348-4e9b-9a92-141c35fc9329",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T09:48:23Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/0a73b994-7348-4e9b-9a92-141c35fc9329/publish` → **200**

```json
{
  "command_id": "fa2f4451-9a4c-499c-84cd-e5256393964a",
  "expected_version": 0
}
```

```json
{
  "id": "0a73b994-7348-4e9b-9a92-141c35fc9329",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T09:48:23.44447Z",
  "published_at": "2026-10-30T09:48:23.44447Z",
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
  "device_ref": "sandbox-24409"
}
```

```json
{
  "challenge_id": "dea31e03-3a1b-4125-948c-8af2091692cd",
  "expires_at": "2026-10-30T09:53:23.748086713Z",
  "resend_available_at": "2026-10-30T09:48:24.748086713Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "157875",
  "sent_at": "2026-10-30T09:48:23.750900501Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dea31e03-3a1b-4125-948c-8af2091692cd",
  "code": "157875",
  "device_ref": "sandbox-24409"
}
```

```json
{
  "session_id": "f22032ad-99e5-4fe1-ab0d-0aa7e44b997a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDYwNCwiaWF0IjoxNzkzMzUzNzA0LCJqdGkiOiI4MmI2YWNhYy0wNTljLTQ5MGUtODJhNy00NDFhNDg4ZTliOWYiLCJzaWQiOiJmMjIwMzJhZC05OWU1LTRmZTEtYWIwZC0wYWE3ZTQ0Yjk5N2EifQ.RFdGmYun9yAKiuCzrUH3FSt5eBQW0wbx9U5fqxuTkOo",
  "access_expires_at": "2026-10-30T10:03:24.060700818Z",
  "refresh_token": "MOAL_lUqb29qnm-4CIbHE5EXgKdtnTVNvLJaNbIQvlI",
  "refresh_expires_at": "2026-11-29T09:48:24.060083579Z",
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
  "command_id": "2c30f66c-4670-4007-8c3b-8511749c1bd1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:48:24Z",
    "sequence": 1793353704637
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ab28936d-3fe3-4cf0-b374-c1175edb990c",
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
  "last_heartbeat_at": "2026-10-30T09:48:24.65532Z",
  "last_location_at": "2026-10-30T09:48:24.65532Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676071825",
  "device_ref": "sandbox-29998"
}
```

```json
{
  "challenge_id": "b2ced71c-4852-4dfd-9ae4-f7ccdf8c5f04",
  "expires_at": "2026-10-30T09:53:24.957213079Z",
  "resend_available_at": "2026-10-30T09:48:25.957213079Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676071825` → **200**

```json
{
  "phone": "+380676071825",
  "audience": "CLIENT",
  "code": "555130",
  "sent_at": "2026-10-30T09:48:24.960014745Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b2ced71c-4852-4dfd-9ae4-f7ccdf8c5f04",
  "code": "555130",
  "device_ref": "sandbox-29998"
}
```

```json
{
  "session_id": "ae95646e-5a68-422f-b2b0-494216a8823a",
  "subject": {
    "type": "CLIENT",
    "id": "0456c179-84ee-499e-8186-f564ecf48c4b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNDU2YzE3OS04NGVlLTQ5OWUtODE4Ni1mNTY0ZWNmNDhjNGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NjA1LCJpYXQiOjE3OTMzNTM3MDUsImp0aSI6IjlmNDI0NzVlLTg1NGQtNDE5MC1iYTllLWZkMmNiNTllYTI3YSIsInNpZCI6ImFlOTU2NDZlLTVhNjgtNDIyZi1iMmIwLTQ5NDIxNmE4ODIzYSJ9.Gk8w8O9YvNnqre-6LBIe-TVoIYtZi6CmFWTYYdoPvig",
  "access_expires_at": "2026-10-30T10:03:25.287817098Z",
  "refresh_token": "GlfLm5Od5gEAUnunneQeCjEmlsrfhlKwIHBNPlAlzw8",
  "refresh_expires_at": "2026-11-29T09:48:25.287340249Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e9c1b05d-d8bc-4e5d-aa14-2fa1a4448426",
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
  "id": "9e5758b5-a804-45a4-895a-d71417ab2276",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:53:25.586810Z",
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
  "command_id": "e1c308b2-118d-41f5-9ab7-28d33f553ef0",
  "quote_id": "9e5758b5-a804-45a4-895a-d71417ab2276",
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
    "phone": "+380675741969"
  }
}
```

```json
{
  "id": "63b85176-18d1-484d-a067-d9190c139392",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0456c179-84ee-499e-8186-f564ecf48c4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:48:25.889744Z",
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
    "id": "4f1a0911-c896-41bd-9017-2ed21fc71b16",
    "order_id": "63b85176-18d1-484d-a067-d9190c139392",
    "expires_at": "2026-10-30T09:48:40.893243Z",
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

`POST /api/driver/v1/offers/4f1a0911-c896-41bd-9017-2ed21fc71b16/accept` → **200**

```json
{
  "command_id": "77974057-f3fc-49f1-8755-87d5a3970335"
}
```

```json
{
  "id": "e47a4cb5-79ef-4a12-b52e-edf1dab10993",
  "order_id": "63b85176-18d1-484d-a067-d9190c139392",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5403fe52-a935-47b1-86d2-d63ee76a6078",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5403fe52-a935-47b1-86d2-d63ee76a6078",
  "order_id": "63b85176-18d1-484d-a067-d9190c139392",
  "assignment_id": "e47a4cb5-79ef-4a12-b52e-edf1dab10993",
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
    "phone": "+380675741969"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ea9363a2-1ef1-4145-b278-2a9004b372dc",
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
  "id": "954d1c50-1bd9-4b23-804f-273e6d8c52f3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:53:27.093599Z",
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
  "command_id": "59b99e1b-4a38-4f2c-9617-05cfb2e6571a",
  "quote_id": "954d1c50-1bd9-4b23-804f-273e6d8c52f3",
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
  "id": "ffb77aa5-e615-40cf-b0be-419ca8e02963",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0456c179-84ee-499e-8186-f564ecf48c4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:48:27.406138Z",
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
  "command_id": "48a4e0d3-0f95-4d4e-aa7c-7adf435bb8f3",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T12:48:27Z"
}
```

```json
{
  "id": "14e9d225-d1b3-4000-876f-da2d790a5556",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:53:27.738856Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T12:48:27Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "e54232a1-31e0-419c-96ea-d919b257171f",
  "quote_id": "14e9d225-d1b3-4000-876f-da2d790a5556",
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
  "pickup_at": "2026-10-30T12:48:27Z"
}
```

```json
{
  "id": "19bef340-de90-431d-960f-15880a131119",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0456c179-84ee-499e-8186-f564ecf48c4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T09:48:28.038226Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T12:48:27Z",
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
  "command_id": "5c8ef209-ec4c-46e3-a357-44091ce13c96",
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
  "id": "f3c72d62-21ca-458f-8fbe-f44e60b18452",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:53:28.362923Z",
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
  "command_id": "adf0b808-7f76-4639-8f66-9962b7047c6a",
  "quote_id": "f3c72d62-21ca-458f-8fbe-f44e60b18452",
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
  "correlation_id": "20e73072-f233-4bd9-9ac0-57b7441d232f"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "19bef340-de90-431d-960f-15880a131119",
      "short_number": 21,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "0456c179-84ee-499e-8186-f564ecf48c4b",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T09:48:28.038226Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T12:48:27Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "ffb77aa5-e615-40cf-b0be-419ca8e02963",
      "short_number": 20,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "0456c179-84ee-499e-8186-f564ecf48c4b",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T09:48:27.406138Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "63b85176-18d1-484d-a067-d9190c139392",
      "short_number": 19,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "ffb77aa5-e615-40cf-b0be-419ca8e02963",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0456c179-84ee-499e-8186-f564ecf48c4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:48:27.406138Z",
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

`GET /api/rider/v1/orders/63b85176-18d1-484d-a067-d9190c139392` → **200**

```json
{
  "id": "63b85176-18d1-484d-a067-d9190c139392",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0456c179-84ee-499e-8186-f564ecf48c4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e47a4cb5-79ef-4a12-b52e-edf1dab10993",
    "order_id": "63b85176-18d1-484d-a067-d9190c139392",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "5403fe52-a935-47b1-86d2-d63ee76a6078",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T09:48:25.889744Z",
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
    "location_at": "2026-10-30T09:48:24.65532Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/63b85176-18d1-484d-a067-d9190c139392/cancel` → **200**

```json
{
  "command_id": "9949e9a6-862f-475a-b64f-5130a4e56c17",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "63b85176-18d1-484d-a067-d9190c139392",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "0456c179-84ee-499e-8186-f564ecf48c4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e47a4cb5-79ef-4a12-b52e-edf1dab10993",
    "order_id": "63b85176-18d1-484d-a067-d9190c139392",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "5403fe52-a935-47b1-86d2-d63ee76a6078",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:48:25.889744Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
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

`GET /api/rider/v1/orders/ffb77aa5-e615-40cf-b0be-419ca8e02963` → **200**

```json
{
  "id": "ffb77aa5-e615-40cf-b0be-419ca8e02963",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0456c179-84ee-499e-8186-f564ecf48c4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:48:27.406138Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ffb77aa5-e615-40cf-b0be-419ca8e02963/cancel` → **200**

```json
{
  "command_id": "6f8fbf2a-6d63-4d78-b716-e6cc80299bbf",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ffb77aa5-e615-40cf-b0be-419ca8e02963",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0456c179-84ee-499e-8186-f564ecf48c4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:48:27.406138Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
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

`GET /api/rider/v1/orders/19bef340-de90-431d-960f-15880a131119` → **200**

```json
{
  "id": "19bef340-de90-431d-960f-15880a131119",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0456c179-84ee-499e-8186-f564ecf48c4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T09:48:28.038226Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T12:48:27Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/19bef340-de90-431d-960f-15880a131119/cancel` → **200**

```json
{
  "command_id": "08a331a6-391c-40d5-83c8-9e9ef618918f",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "19bef340-de90-431d-960f-15880a131119",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "0456c179-84ee-499e-8186-f564ecf48c4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T09:48:28.038226Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
    }
  },
  "pickup_at": "2026-10-30T12:48:27Z",
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
  "session_id": "ab28936d-3fe3-4cf0-b374-c1175edb990c",
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
  "last_heartbeat_at": "2026-10-30T09:48:24.65532Z",
  "last_location_at": "2026-10-30T09:48:24.65532Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab28936d-3fe3-4cf0-b374-c1175edb990c/close` → **200**

```json
{
  "command_id": "45450078-1963-404a-a5fc-34fd637db1d5",
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

Done: orders 63b85176-18d1-484d-a067-d9190c139392, ffb77aa5-e615-40cf-b0be-419ca8e02963, 19bef340-de90-431d-960f-15880a131119.

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
  "session_id": "2368fe48-d080-4cae-9a25-04ecec526dfd",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2MTIsImlhdCI6MTc5MzM1MzcxMiwianRpIjoiZTI0NWNhNWMtZGFlYi00NzQ3LWI4MDktNzk2MmEyYWU1ZTM1Iiwic2lkIjoiMjM2OGZlNDgtZDA4MC00Y2FlLTlhMjUtMDRlY2VjNTI2ZGZkIn0.l0xa8mU5zd362dAjv5uKCOpb7lp3CcNWhB7FGuRAXNg",
  "access_expires_at": "2026-10-30T10:03:32.28274507Z",
  "refresh_token": "8l4vr7GM4A3CL6M6b23_g8TlMcLIHnlA6GJrWJuxATY",
  "refresh_expires_at": "2026-10-30T21:48:32.282000869Z",
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
  "session_id": "c92d044f-dcc9-4b05-a3ff-1482526a9b79",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2MTIsImlhdCI6MTc5MzM1MzcxMiwianRpIjoiZmNhYzBjYzAtNjE5Yy00NGUxLTlkMDgtMWRiZDRhZThhZGUyIiwic2lkIjoiYzkyZDA0NGYtZGNjOS00YjA1LWEzZmYtMTQ4MjUyNmE5Yjc5In0.nRLNBGnYHivDOVHSyKUxW3nONnVzSZd0PCKhmySTDAI",
  "access_expires_at": "2026-10-30T10:03:32.856540092Z",
  "refresh_token": "vNspFLZEO6QQLChwewbUpv3I30djqoRhBiow9TIjEOY",
  "refresh_expires_at": "2026-10-30T21:48:32.855996417Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28744"
}
```

```json
{
  "challenge_id": "5cc41a77-e0fd-462b-9b4e-a4a63c32887d",
  "expires_at": "2026-10-30T09:53:33.142525294Z",
  "resend_available_at": "2026-10-30T09:48:34.142525294Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "578144",
  "sent_at": "2026-10-30T09:48:33.146100036Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5cc41a77-e0fd-462b-9b4e-a4a63c32887d",
  "code": "578144",
  "device_ref": "sandbox-28744"
}
```

```json
{
  "session_id": "16eed407-3578-44ae-aa89-99fb3fc914a9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDYxMywiaWF0IjoxNzkzMzUzNzEzLCJqdGkiOiI5MGEwYmZjMS03ODQwLTQzYzgtYmM2OC0wM2NiYzIxY2I5NDYiLCJzaWQiOiIxNmVlZDQwNy0zNTc4LTQ0YWUtYWE4OS05OWZiM2ZjOTE0YTkifQ.DdpqfdpQ1CCf9s8Au92I7PZ7lItXLd5QX6Wb0ud7VGA",
  "access_expires_at": "2026-10-30T10:03:33.462427681Z",
  "refresh_token": "_abBBj3_6VT-Ho5P3Zq9JYmQWRps_ZXA1eE-vAm8BKU",
  "refresh_expires_at": "2026-11-29T09:48:33.461876662Z",
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
  "command_id": "9814a03c-16a3-4a85-9917-723cf803492c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:48:34Z",
    "sequence": 1793353714253
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9dbd7306-683a-4244-a244-c3e123a69503",
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
  "last_heartbeat_at": "2026-10-30T09:48:34.043124Z",
  "last_location_at": "2026-10-30T09:48:34.043124Z",
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
  "command_id": "5c17f371-2ba3-4aed-b47a-cf973d221759",
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
  "effective_at": "2026-10-30T09:48:34.637095Z",
  "changed_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T09:45:47.366257Z",
  "last_entries": [
    {
      "order_id": "94675f5f-3b73-4583-9b7c-247a743ea319",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T09:45:47.366257Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "0b141a26-fae8-4165-955d-4dbf08e1ac31",
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
  "id": "d37d22cf-c930-499b-9c03-38825a1b0389",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:53:35.236591Z",
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
  "command_id": "b101f46e-1a75-41ca-981d-b63d21d601e4",
  "quote_id": "d37d22cf-c930-499b-9c03-38825a1b0389",
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
    "phone": "+3806711121845"
  }
}
```

```json
{
  "id": "15578139-6d08-45a1-9050-79c2ab6184e2",
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
  "created_at": "2026-10-30T09:48:35.537291Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121845"
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
    "id": "7842f079-cea9-4ead-82d9-d878bbbdfe90",
    "order_id": "15578139-6d08-45a1-9050-79c2ab6184e2",
    "expires_at": "2026-10-30T09:48:50.540935Z",
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

`POST /api/driver/v1/offers/7842f079-cea9-4ead-82d9-d878bbbdfe90/accept` → **200**

```json
{
  "command_id": "50fa28ce-a444-4716-9263-9d7dbda64bcd"
}
```

```json
{
  "id": "99e19ebb-2b8d-4efa-8665-1114e347a268",
  "order_id": "15578139-6d08-45a1-9050-79c2ab6184e2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a412d866-1727-4b0c-b7ba-5c64217e7fa0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a412d866-1727-4b0c-b7ba-5c64217e7fa0",
  "order_id": "15578139-6d08-45a1-9050-79c2ab6184e2",
  "assignment_id": "99e19ebb-2b8d-4efa-8665-1114e347a268",
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
    "phone": "+3806711121845"
  }
}
```

`POST /api/driver/v1/work-sessions/9dbd7306-683a-4244-a244-c3e123a69503/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:48:36Z",
    "sequence": 1793353716720
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9dbd7306-683a-4244-a244-c3e123a69503",
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
  "last_heartbeat_at": "2026-10-30T09:48:36.738939Z",
  "last_location_at": "2026-10-30T09:48:36.738939Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a412d866-1727-4b0c-b7ba-5c64217e7fa0/arrive` → **200**

```json
{
  "command_id": "618efdb3-a3d6-46eb-8d89-1ef7a3e7cbc4",
  "expected_version": 0
}
```

```json
{
  "id": "a412d866-1727-4b0c-b7ba-5c64217e7fa0",
  "order_id": "15578139-6d08-45a1-9050-79c2ab6184e2",
  "assignment_id": "99e19ebb-2b8d-4efa-8665-1114e347a268",
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
  "arrived_at": "2026-10-30T09:48:37.037363Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711121845"
  }
}
```

`POST /api/driver/v1/trips/a412d866-1727-4b0c-b7ba-5c64217e7fa0/start` → **200**

```json
{
  "command_id": "5b36d83d-9fc3-4e22-bf16-013f29ac7b6b",
  "expected_version": 1
}
```

```json
{
  "id": "a412d866-1727-4b0c-b7ba-5c64217e7fa0",
  "order_id": "15578139-6d08-45a1-9050-79c2ab6184e2",
  "assignment_id": "99e19ebb-2b8d-4efa-8665-1114e347a268",
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
  "arrived_at": "2026-10-30T09:48:37.037363Z",
  "started_at": "2026-10-30T09:48:37.335233Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711121845"
  }
}
```

`POST /api/driver/v1/trips/a412d866-1727-4b0c-b7ba-5c64217e7fa0/complete` → **200**

```json
{
  "command_id": "dc5d031e-a011-40c1-81b3-905d16cbb8e8",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:48:37Z",
  "cash_received": true
}
```

```json
{
  "id": "a412d866-1727-4b0c-b7ba-5c64217e7fa0",
  "order_id": "15578139-6d08-45a1-9050-79c2ab6184e2",
  "assignment_id": "99e19ebb-2b8d-4efa-8665-1114e347a268",
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
  "arrived_at": "2026-10-30T09:48:37.037363Z",
  "started_at": "2026-10-30T09:48:37.335233Z",
  "completed_at": "2026-10-30T09:48:37.641886Z",
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
  "command_id": "8389dbca-6cce-43a4-966c-a0b8f90fe7ad",
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
  "id": "c4ba4d40-44db-4ee1-9eaa-0f3c3fa44a67",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:53:37.947617Z",
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
  "command_id": "9f692be9-67e0-4303-bbb2-86f2aa51213e",
  "quote_id": "c4ba4d40-44db-4ee1-9eaa-0f3c3fa44a67",
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
    "phone": "+3806711132743"
  }
}
```

```json
{
  "id": "e871c2c2-ff03-4036-98d5-106ed618b96a",
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
  "created_at": "2026-10-30T09:48:38.25738Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711132743"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/e871c2c2-ff03-4036-98d5-106ed618b96a` → **200**

```json
{
  "id": "e871c2c2-ff03-4036-98d5-106ed618b96a",
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
  "created_at": "2026-10-30T09:48:38.25738Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711132743"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e871c2c2-ff03-4036-98d5-106ed618b96a/cancel` → **200**

```json
{
  "command_id": "d816d3df-9adb-47de-92fe-f697cb3a8445",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "e871c2c2-ff03-4036-98d5-106ed618b96a",
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
  "created_at": "2026-10-30T09:48:38.25738Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711132743"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "ru": "Ошибка оператора",
      "pl": "Błąd operatora",
      "uk": "Помилка оператора",
      "en": "Operator error"
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
  "staff_id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T09:45:47.366257Z",
  "last_entries": [
    {
      "order_id": "e871c2c2-ff03-4036-98d5-106ed618b96a",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T09:48:38.907824Z"
    },
    {
      "order_id": "15578139-6d08-45a1-9050-79c2ab6184e2",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T09:48:37.646351Z"
    },
    {
      "order_id": "94675f5f-3b73-4583-9b7c-247a743ea319",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T09:45:47.366257Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9dbd7306-683a-4244-a244-c3e123a69503",
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
  "last_heartbeat_at": "2026-10-30T09:48:36.738939Z",
  "last_location_at": "2026-10-30T09:48:36.738939Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9dbd7306-683a-4244-a244-c3e123a69503/close` → **200**

```json
{
  "command_id": "20a5e4dc-7efe-41f5-bb42-f3750a2e0bf4",
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

Done: operator bonus for fulfilled 15578139-6d08-45a1-9050-79c2ab6184e2 and operator-fault cancellation e871c2c2-ff03-4036-98d5-106ed618b96a.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672996393",
  "device_ref": "sandbox-27079"
}
```

```json
{
  "challenge_id": "aa886ec6-fb0f-4102-80aa-132a4d328e36",
  "expires_at": "2026-10-30T09:53:43.360373635Z",
  "resend_available_at": "2026-10-30T09:48:44.360373635Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672996393` → **200**

```json
{
  "phone": "+380672996393",
  "audience": "CLIENT",
  "code": "015630",
  "sent_at": "2026-10-30T09:48:43.363034745Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675984394",
  "device_ref": "sandbox-10809",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "329fd5e7-a11d-4b83-b0e1-3a8d422f8fd8",
  "expires_at": "2026-10-30T09:53:44.886341498Z",
  "resend_available_at": "2026-10-30T09:48:45.886341498Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675984394` → **200**

```json
{
  "phone": "+380675984394",
  "audience": "CLIENT",
  "code": "141791",
  "sent_at": "2026-10-30T09:48:44.888650586Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675984394",
  "device_ref": "sandbox-31490",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "d91d0dfb-abad-4c1a-81c2-d538a7fc4675",
  "expires_at": "2026-10-30T09:53:46.42145991Z",
  "resend_available_at": "2026-10-30T09:48:47.42145991Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675984394` → **200**

```json
{
  "phone": "+380675984394",
  "audience": "CLIENT",
  "code": "013488",
  "sent_at": "2026-10-30T09:48:46.428556365Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670250000",
  "device_ref": "sandbox-6894"
}
```

```json
{
  "challenge_id": "b8825ec4-a868-4d58-9e34-df38f6baa05b",
  "expires_at": "2026-10-30T09:53:47.940206806Z",
  "resend_available_at": "2026-10-30T09:48:48.940206806Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670250000",
  "device_ref": "sandbox-24601"
}
```

```json
{
  "challenge_id": "d3667813-c14c-4c5b-a2d1-e973e115ce1b",
  "expires_at": "2026-10-30T09:53:49.428706637Z",
  "resend_available_at": "2026-10-30T09:48:50.428706637Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380670250000` → **200**

```json
{
  "phone": "+380670250000",
  "audience": "CLIENT",
  "code": "295302",
  "sent_at": "2026-10-30T09:48:49.431738935Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670250000",
  "device_ref": "sandbox-32278",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "743a95ba-6ecb-49f9-a93f-5d4a265ee1d7",
  "expires_at": "2026-10-30T09:53:50.954798712Z",
  "resend_available_at": "2026-10-30T09:48:51.954798712Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380670250000` → **200**

```json
{
  "phone": "+380670250000",
  "audience": "CLIENT",
  "code": "889352",
  "sent_at": "2026-10-30T09:48:50.95742505Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380670250000",
  "device_ref": "sandbox-7539",
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
  "correlation_id": "4b4a9fd1-58ba-4b27-a066-8578303d73e4",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000025756"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "9cb99c2e-03e9-42b6-acc6-3650ee2a06e4"
}
```

`GET /sandbox/v1/otp?phone=%2B442000025756` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120017701"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "d347fb1a-9c13-43b6-a870-0c340b297422"
}
```

`GET /sandbox/v1/otp?phone=%2B37120017701` → **404**

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
  "session_id": "c266afc8-76e1-4193-95e6-c74d875d6ec1",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2MzMsImlhdCI6MTc5MzM1MzczMywianRpIjoiOWY1NDk5NTctMjNjYS00Yjk2LTk3YWUtNTUzMmU3OWUzOWNlIiwic2lkIjoiYzI2NmFmYzgtNzZlMS00MTkzLTk1ZTYtYzc0ZDg3NWQ2ZWMxIn0.AJa1YWszVaJsVtXQqcYe_Gj1ExYOZ3jMXdyW97h-ohk",
  "access_expires_at": "2026-10-30T10:03:53.697318255Z",
  "refresh_token": "8sAf0N5BiZombwuu0p6XV25hJ_o3qOPsxyqSuufiLjI",
  "refresh_expires_at": "2026-10-30T21:48:53.696592812Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670250000` → **200**

```json
{
  "deliveries": [
    {
      "id": "c7c08fe9-c0dd-4d41-93a4-b850dcd62545",
      "challenge_id": "743a95ba-6ecb-49f9-a93f-5d4a265ee1d7",
      "phone": "+380670250000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-68ee363d-033e-48f1-a81a-c8994cce5b98",
      "error": null,
      "attempted_at": "2026-10-30T09:48:50.957712Z"
    },
    {
      "id": "f1d956aa-ba4e-4d85-aecd-531ca73f6a3c",
      "challenge_id": "d3667813-c14c-4c5b-a2d1-e973e115ce1b",
      "phone": "+380670250000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-1db784aa-346b-446d-9bff-52d958cfed4a",
      "error": null,
      "attempted_at": "2026-10-30T09:48:49.432123Z"
    },
    {
      "id": "b759c441-d8e3-4ff7-911f-cd9c648f4bfa",
      "challenge_id": "b8825ec4-a868-4d58-9e34-df38f6baa05b",
      "phone": "+380670250000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T09:48:47.943444Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380670250000` → **200**

```json
{
  "phone": "+380670250000",
  "audience": "CLIENT",
  "code": "889352",
  "sent_at": "2026-10-30T09:48:50.95742505Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675984394` → **200**

```json
{
  "deliveries": [
    {
      "id": "04a55842-5a9f-494e-bd6c-bdad551a1843",
      "challenge_id": "d91d0dfb-abad-4c1a-81c2-d538a7fc4675",
      "phone": "+380675984394",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-033a7957-5295-46d2-a1ab-45619239fde1",
      "error": null,
      "attempted_at": "2026-10-30T09:48:46.428878Z"
    },
    {
      "id": "9913a46a-ac5e-4079-9d2c-c4be42fb3a68",
      "challenge_id": "329fd5e7-a11d-4b83-b0e1-3a8d422f8fd8",
      "phone": "+380675984394",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-8cac60a5-123e-4a03-a781-db4e7f665954",
      "error": null,
      "attempted_at": "2026-10-30T09:48:44.8891Z"
    }
  ]
}
```

Done: SMS to +380672996393; SMS then a call to +380675984394; a failed SMS, two calls and a refused third to +380670250000; +44 and +371 refused.

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
  "session_id": "73b12bff-be45-4a87-abcc-b29fc793f5de",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2MzQsImlhdCI6MTc5MzM1MzczNCwianRpIjoiZjc2ZmEwODMtM2RlOS00OGFlLTk1ZTQtZjEzMWIxNmE5Zjg4Iiwic2lkIjoiNzNiMTJiZmYtYmU0NS00YTg3LWFiY2MtYjI5ZmM3OTNmNWRlIn0.Dtv4p0uzqGbJR8sOjIX0AlTCwi2q64Itpg5dwOLMY4o",
  "access_expires_at": "2026-10-30T10:03:54.903279687Z",
  "refresh_token": "Bmv8cwJx0kqiq69VIQx-8mPFffIBIlyv-Ylx37edXyU",
  "refresh_expires_at": "2026-10-30T21:48:54.902706879Z",
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
  "session_id": "7d979d1b-b2a8-4d89-a431-940c1816d8c9",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2MzUsImlhdCI6MTc5MzM1MzczNSwianRpIjoiYzI1YWQ4NzUtMGYxMy00MzI4LWEyNzYtNWJhNDBjMzdjMjVjIiwic2lkIjoiN2Q5NzlkMWItYjJhOC00ZDg5LWE0MzEtOTQwYzE4MTZkOGM5In0.87DysSY6WJGQmY06EjlPac-gmikiUKyClsoy5y1TCTI",
  "access_expires_at": "2026-10-30T10:03:55.491658508Z",
  "refresh_token": "KO1PdE-0AyOVdN_IECZ3Q9MqPWkuRl7lgzOonQXItnU",
  "refresh_expires_at": "2026-10-30T21:48:55.491154278Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
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

`POST /api/admin/v1/staff-extensions/f623e6fb-9e8a-433d-a033-eb16e626cf4c` → **200**

```json
{
  "command_id": "21072e53-abe6-4ad0-a431-22e042406b07",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "a489b0aa-4be1-4a7f-a790-47c08330146c",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T09:48:56.660599Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T09:48:56.660599Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7d4c59c2-77fb-4af5-8414-5b004d96b0e6",
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
  "id": "7a8f89b6-1c91-45f7-a9a9-01092f46a024",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:53:57.221701Z",
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
  "command_id": "446a1beb-360c-413f-8dc4-728c171346fb",
  "quote_id": "7a8f89b6-1c91-45f7-a9a9-01092f46a024",
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
    "phone": "+380673600653"
  }
}
```

```json
{
  "id": "2cebf5e3-d4df-4ba1-ba6d-243dff7eb86c",
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
  "created_at": "2026-10-30T09:48:57.519831Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673600653"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/2cebf5e3-d4df-4ba1-ba6d-243dff7eb86c/calls` → **201**

```json
{
  "command_id": "1ccb5877-43f6-4846-92cb-59d58f4828b7",
  "to": "CALLER"
}
```

```json
{
  "id": "e08fb74f-f21d-4a5b-b007-1608d5f835d0",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "order_ids": [
    "2cebf5e3-d4df-4ba1-ba6d-243dff7eb86c"
  ],
  "started_at": "2026-10-30T09:48:57.852737Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/2cebf5e3-d4df-4ba1-ba6d-243dff7eb86c/calls` → **201**

```json
{
  "command_id": "1ccb5877-43f6-4846-92cb-59d58f4828b7",
  "to": "CALLER"
}
```

```json
{
  "id": "e08fb74f-f21d-4a5b-b007-1608d5f835d0",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "order_ids": [
    "2cebf5e3-d4df-4ba1-ba6d-243dff7eb86c"
  ],
  "started_at": "2026-10-30T09:48:57.852737Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "e08fb74f-f21d-4a5b-b007-1608d5f835d0",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380673600653",
    "at": "2026-10-30T09:48:57.855189893Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "e08fb74f-f21d-4a5b-b007-1608d5f835d0",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.11532",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "e08fb74f-f21d-4a5b-b007-1608d5f835d0"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "e08fb74f-f21d-4a5b-b007-1608d5f835d0",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=2cebf5e3-d4df-4ba1-ba6d-243dff7eb86c` → **200**

```json
{
  "calls": [
    {
      "id": "e08fb74f-f21d-4a5b-b007-1608d5f835d0",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "order_ids": [
        "2cebf5e3-d4df-4ba1-ba6d-243dff7eb86c"
      ],
      "started_at": "2026-10-30T09:48:57.852737Z",
      "answered_at": "2026-10-30T09:48:58.525477Z",
      "ended_at": "2026-10-30T09:48:58.546392Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=2cebf5e3-d4df-4ba1-ba6d-243dff7eb86c` → **200**

```json
{
  "calls": [
    {
      "id": "e08fb74f-f21d-4a5b-b007-1608d5f835d0",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "order_ids": [
        "2cebf5e3-d4df-4ba1-ba6d-243dff7eb86c"
      ],
      "started_at": "2026-10-30T09:48:57.852737Z",
      "answered_at": "2026-10-30T09:48:58.525477Z",
      "ended_at": "2026-10-30T09:48:58.546392Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=2cebf5e3-d4df-4ba1-ba6d-243dff7eb86c` → **200**

```json
{
  "calls": [
    {
      "id": "e08fb74f-f21d-4a5b-b007-1608d5f835d0",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "order_ids": [
        "2cebf5e3-d4df-4ba1-ba6d-243dff7eb86c"
      ],
      "started_at": "2026-10-30T09:48:57.852737Z",
      "answered_at": "2026-10-30T09:48:58.525477Z",
      "ended_at": "2026-10-30T09:48:58.546392Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=2cebf5e3-d4df-4ba1-ba6d-243dff7eb86c` → **200**

```json
{
  "calls": [
    {
      "id": "e08fb74f-f21d-4a5b-b007-1608d5f835d0",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "order_ids": [
        "2cebf5e3-d4df-4ba1-ba6d-243dff7eb86c"
      ],
      "started_at": "2026-10-30T09:48:57.852737Z",
      "answered_at": "2026-10-30T09:48:58.525477Z",
      "ended_at": "2026-10-30T09:48:58.546392Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=2cebf5e3-d4df-4ba1-ba6d-243dff7eb86c` → **200**

```json
{
  "calls": [
    {
      "id": "e08fb74f-f21d-4a5b-b007-1608d5f835d0",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "order_ids": [
        "2cebf5e3-d4df-4ba1-ba6d-243dff7eb86c"
      ],
      "started_at": "2026-10-30T09:48:57.852737Z",
      "answered_at": "2026-10-30T09:48:58.525477Z",
      "ended_at": "2026-10-30T09:48:58.546392Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:49:05.882998Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/2cebf5e3-d4df-4ba1-ba6d-243dff7eb86c` → **200**

```json
{
  "id": "2cebf5e3-d4df-4ba1-ba6d-243dff7eb86c",
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
  "created_at": "2026-10-30T09:48:57.519831Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673600653"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2cebf5e3-d4df-4ba1-ba6d-243dff7eb86c/cancel` → **200**

```json
{
  "command_id": "b83017c9-334c-4024-a087-9e172577ada3",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "2cebf5e3-d4df-4ba1-ba6d-243dff7eb86c",
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
  "created_at": "2026-10-30T09:48:57.519831Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673600653"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
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
  "command_id": "69edb519-8261-4718-bd1c-9352f3003e3e",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T09:49:08.717938Z",
  "extension": "101"
}
```

Done: outgoing call e08fb74f-f21d-4a5b-b007-1608d5f835d0 from order 2cebf5e3-d4df-4ba1-ba6d-243dff7eb86c, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630870953",
  "device_ref": "sandbox-7912"
}
```

```json
{
  "challenge_id": "64c0bdfd-6670-480b-87b5-cea05a2996f9",
  "expires_at": "2026-10-30T09:54:09.012898946Z",
  "resend_available_at": "2026-10-30T09:49:10.012898946Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630870953` → **200**

```json
{
  "phone": "+380630870953",
  "audience": "CLIENT",
  "code": "015674",
  "sent_at": "2026-10-30T09:49:09.015680328Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "64c0bdfd-6670-480b-87b5-cea05a2996f9",
  "code": "015674",
  "device_ref": "sandbox-7912"
}
```

```json
{
  "session_id": "654459e5-4193-41cf-bbb2-a661b6faf293",
  "subject": {
    "type": "CLIENT",
    "id": "17c7ea9e-c166-454b-87af-b04293bc3f3c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxN2M3ZWE5ZS1jMTY2LTQ1NGItODdhZi1iMDQyOTNiYzNmM2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NjQ5LCJpYXQiOjE3OTMzNTM3NDksImp0aSI6IjdiZmEwOGFkLWI1MWQtNDE3OC1hNjk5LWUwMjg1NmQzZjliNyIsInNpZCI6IjY1NDQ1OWU1LTQxOTMtNDFjZi1iYmIyLWE2NjFiNmZhZjI5MyJ9.6h7BJ1jWmTBTUykWpV8-VkrZkzjvib7V_0paE3z7WeE",
  "access_expires_at": "2026-10-30T10:04:09.323511673Z",
  "refresh_token": "r1gq0cArgv3iw0uc5bcDBptSLD8QCR8-Ki-Epqbzon0",
  "refresh_expires_at": "2026-11-29T09:49:09.323036757Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "17c7ea9e-c166-454b-87af-b04293bc3f3c",
  "session_id": "654459e5-4193-41cf-bbb2-a661b6faf293",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630870953",
  "device_ref": "sandbox-7702"
}
```

```json
{
  "challenge_id": "1c398414-38d2-44b6-82f7-75009474f48c",
  "expires_at": "2026-10-30T09:54:11.896727834Z",
  "resend_available_at": "2026-10-30T09:49:12.896727834Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630870953` → **200**

```json
{
  "phone": "+380630870953",
  "audience": "CLIENT",
  "code": "762562",
  "sent_at": "2026-10-30T09:49:11.899362488Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1c398414-38d2-44b6-82f7-75009474f48c",
  "code": "762562",
  "device_ref": "sandbox-7702"
}
```

```json
{
  "session_id": "7bc6c952-f1fb-4dc5-96cb-67e017fe2523",
  "subject": {
    "type": "CLIENT",
    "id": "17c7ea9e-c166-454b-87af-b04293bc3f3c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxN2M3ZWE5ZS1jMTY2LTQ1NGItODdhZi1iMDQyOTNiYzNmM2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NjUyLCJpYXQiOjE3OTMzNTM3NTIsImp0aSI6IjBhNTM2YjUzLWQwMmUtNDA4Zi05YjcxLWFhZWU0ZjhhNTkyMyIsInNpZCI6IjdiYzZjOTUyLWYxZmItNGRjNS05NmNiLTY3ZTAxN2ZlMjUyMyJ9.9Rqp5Bz2r7FEVg1-AfZmaG4zpvHGG7BLrhdNt5JsVyA",
  "access_expires_at": "2026-10-30T10:04:12.213678653Z",
  "refresh_token": "SVVaLsHZFwZ_eaol3dUXDiXYCUxHq2ZGbmQ-BqH6CkU",
  "refresh_expires_at": "2026-11-29T09:49:12.21314663Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "de953ac5-f7dc-404b-968b-a6cc697f7d25",
  "expires_at": "2026-10-30T09:54:14.503306547Z",
  "resend_available_at": "2026-10-30T09:49:15.503306547Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630870953` → **200**

```json
{
  "phone": "+380630870953",
  "audience": "CLIENT",
  "code": "403037",
  "sent_at": "2026-10-30T09:49:14.505743641Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380639501365"
}
```

```json
{
  "challenge_id": "5e813f4e-ddbd-44f7-9beb-5294e8d5aac2",
  "expires_at": "2026-10-30T09:54:14.814366687Z",
  "resend_available_at": "2026-10-30T09:49:15.814366687Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639501365` → **200**

```json
{
  "phone": "+380639501365",
  "audience": "CLIENT",
  "code": "093584",
  "sent_at": "2026-10-30T09:49:14.81694297Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "92dcba01-661f-4855-b2fc-4137bf22a6f1",
  "current_challenge_id": "de953ac5-f7dc-404b-968b-a6cc697f7d25",
  "current_code": "000000",
  "new_challenge_id": "5e813f4e-ddbd-44f7-9beb-5294e8d5aac2",
  "new_code": "093584"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "58182eb4-bea7-4958-878a-43188679387f"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "576cbb9e-dfc2-418d-be93-54383a0f5b6a",
  "current_challenge_id": "de953ac5-f7dc-404b-968b-a6cc697f7d25",
  "current_code": "403037",
  "new_challenge_id": "5e813f4e-ddbd-44f7-9beb-5294e8d5aac2",
  "new_code": "093584"
}
```

```json
{
  "subject_id": "17c7ea9e-c166-454b-87af-b04293bc3f3c",
  "phone": "+380639501365",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "17c7ea9e-c166-454b-87af-b04293bc3f3c",
  "session_id": "654459e5-4193-41cf-bbb2-a661b6faf293",
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
  "correlation_id": "3b37ef6f-4fc4-495d-8fa8-a02892d5ebdb"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639501365",
  "device_ref": "sandbox-15680"
}
```

```json
{
  "challenge_id": "8e0ae952-3b69-4070-9ddc-fed3a2bab1f3",
  "expires_at": "2026-10-30T09:54:18.3124314Z",
  "resend_available_at": "2026-10-30T09:49:19.3124314Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639501365` → **200**

```json
{
  "phone": "+380639501365",
  "audience": "CLIENT",
  "code": "952064",
  "sent_at": "2026-10-30T09:49:18.315127052Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e0ae952-3b69-4070-9ddc-fed3a2bab1f3",
  "code": "952064",
  "device_ref": "sandbox-15680"
}
```

```json
{
  "session_id": "b0cb57db-9044-4f8c-9344-8f77d1c66224",
  "subject": {
    "type": "CLIENT",
    "id": "17c7ea9e-c166-454b-87af-b04293bc3f3c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxN2M3ZWE5ZS1jMTY2LTQ1NGItODdhZi1iMDQyOTNiYzNmM2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NjU4LCJpYXQiOjE3OTMzNTM3NTgsImp0aSI6IjU1MWEyMTI5LThjYjgtNDc0OS05MGMwLTY4MzI1YmJhNDgyZCIsInNpZCI6ImIwY2I1N2RiLTkwNDQtNGY4Yy05MzQ0LThmNzdkMWM2NjIyNCJ9.Cjz-_k83hmXnGcw2n97rJaXs09haPTXmQqKm7b1HkGI",
  "access_expires_at": "2026-10-30T10:04:18.6281526Z",
  "refresh_token": "zqrpoKG3urPjKHne40d1r8e9mWBsDlKA8F-40d7Mozw",
  "refresh_expires_at": "2026-11-29T09:49:18.627610228Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "17c7ea9e-c166-454b-87af-b04293bc3f3c",
  "session_id": "b0cb57db-9044-4f8c-9344-8f77d1c66224",
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
  "session_id": "7548319f-c304-4632-a88b-7b0bd504886e",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2NTksImlhdCI6MTc5MzM1Mzc1OSwianRpIjoiODVmMzZmMzMtYjY2MS00N2VkLTgzZTMtOTc0MWIzNzhhMTQ5Iiwic2lkIjoiNzU0ODMxOWYtYzMwNC00NjMyLWE4OGItN2IwYmQ1MDQ4ODZlIn0.nlmJxud5Z22jcZJetLBGlgqaNcXiaTiuDXv6qTYNHhA",
  "access_expires_at": "2026-10-30T10:04:19.490420074Z",
  "refresh_token": "8C7dksScHPaXEr5xx4MtQpcyxllfDn7KlKQ1knTGeVQ",
  "refresh_expires_at": "2026-10-30T21:49:19.489748947Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/17c7ea9e-c166-454b-87af-b04293bc3f3c` → **200**

```json
{
  "client": {
    "id": "17c7ea9e-c166-454b-87af-b04293bc3f3c",
    "phone": "+380639501365",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:49:09.321505Z",
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

`POST /api/admin/v1/clients/17c7ea9e-c166-454b-87af-b04293bc3f3c/phone/new-code` → **201**

```json
{
  "phone": "+380631370749"
}
```

```json
{
  "challenge_id": "827ef54e-7f6f-489e-9a72-e6bf345244be",
  "expires_at": "2026-10-30T09:54:20.12279953Z",
  "resend_available_at": "2026-10-30T09:49:21.12279953Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631370749` → **200**

```json
{
  "phone": "+380631370749",
  "audience": "CLIENT",
  "code": "558038",
  "sent_at": "2026-10-30T09:49:20.125454191Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/17c7ea9e-c166-454b-87af-b04293bc3f3c/phone` → **422**

```json
{
  "command_id": "ca54ba84-d948-4d96-94ce-4a42a20edf19",
  "expected_version": 3,
  "new_challenge_id": "827ef54e-7f6f-489e-9a72-e6bf345244be",
  "new_code": "558039",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/17c7ea9e-c166-454b-87af-b04293bc3f3c/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "da4f0114-6749-4019-ab7c-e71863f0a820"
}
```

`POST /api/admin/v1/clients/17c7ea9e-c166-454b-87af-b04293bc3f3c/phone` → **400**

```json
{
  "command_id": "d54ff1cc-6e60-46f8-b830-31c54abdd29c",
  "expected_version": 3,
  "new_challenge_id": "827ef54e-7f6f-489e-9a72-e6bf345244be",
  "new_code": "558038",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/17c7ea9e-c166-454b-87af-b04293bc3f3c/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "6a7ffec3-ca58-4c4c-b1d4-e55d14020fa3",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/17c7ea9e-c166-454b-87af-b04293bc3f3c/phone` → **200**

```json
{
  "command_id": "aea08d95-a48c-471c-9af1-a018e23715cd",
  "expected_version": 3,
  "new_challenge_id": "827ef54e-7f6f-489e-9a72-e6bf345244be",
  "new_code": "558038",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "17c7ea9e-c166-454b-87af-b04293bc3f3c",
  "phone": "+380631370749",
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
  "correlation_id": "f21c4ea9-a176-4c2e-8d30-47b57c0c4985"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631370749",
  "device_ref": "sandbox-18791"
}
```

```json
{
  "challenge_id": "34b2e1ee-2475-4bdf-a88b-cf2c608ff2e3",
  "expires_at": "2026-10-30T09:54:21.643086489Z",
  "resend_available_at": "2026-10-30T09:49:22.643086489Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631370749` → **200**

```json
{
  "phone": "+380631370749",
  "audience": "CLIENT",
  "code": "140310",
  "sent_at": "2026-10-30T09:49:21.646167333Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "34b2e1ee-2475-4bdf-a88b-cf2c608ff2e3",
  "code": "140310",
  "device_ref": "sandbox-18791"
}
```

```json
{
  "session_id": "a6effa36-d110-469a-a142-209097a68439",
  "subject": {
    "type": "CLIENT",
    "id": "17c7ea9e-c166-454b-87af-b04293bc3f3c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxN2M3ZWE5ZS1jMTY2LTQ1NGItODdhZi1iMDQyOTNiYzNmM2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NjYxLCJpYXQiOjE3OTMzNTM3NjEsImp0aSI6ImExMzFiZjI5LTliNDktNDMxNy05ZWQ1LTgzZDNhNDc3NzE4NSIsInNpZCI6ImE2ZWZmYTM2LWQxMTAtNDY5YS1hMTQyLTIwOTA5N2E2ODQzOSJ9.RNVO_T5PMnMbH7ZSskdewyq9TGsfNbvP2wplSi3DQN0",
  "access_expires_at": "2026-10-30T10:04:21.968389779Z",
  "refresh_token": "tWY2sz3IEOc4Ai0oNIrv7_LijynHoX5WWc8Nx_KQk7k",
  "refresh_expires_at": "2026-11-29T09:49:21.967853078Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "17c7ea9e-c166-454b-87af-b04293bc3f3c",
  "session_id": "a6effa36-d110-469a-a142-209097a68439",
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
  "phone": "+380639300628",
  "device_ref": "sandbox-6600"
}
```

```json
{
  "challenge_id": "db5aa8b3-16f9-4de1-a8ad-02d2581a485d",
  "expires_at": "2026-10-30T09:54:22.553466552Z",
  "resend_available_at": "2026-10-30T09:49:23.553466552Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639300628` → **200**

```json
{
  "phone": "+380639300628",
  "audience": "CLIENT",
  "code": "215573",
  "sent_at": "2026-10-30T09:49:22.556336826Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db5aa8b3-16f9-4de1-a8ad-02d2581a485d",
  "code": "215573",
  "device_ref": "sandbox-6600"
}
```

```json
{
  "session_id": "6ec88c14-d6b4-41b9-8182-bd77f2aeea95",
  "subject": {
    "type": "CLIENT",
    "id": "70bd4c2d-8957-4f7f-a4b1-1fc712a7d886"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MGJkNGMyZC04OTU3LTRmN2YtYTRiMS0xZmM3MTJhN2Q4ODYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NjYyLCJpYXQiOjE3OTMzNTM3NjIsImp0aSI6IjJlZGM4YmZjLTdiY2QtNGJkZC1hZGJiLTgzYmE1YzMxMTZiZiIsInNpZCI6IjZlYzg4YzE0LWQ2YjQtNDFiOS04MTgyLWJkNzdmMmFlZWE5NSJ9._4yLTFjbGWuOlirhk6ZZkfDZX6nTqu6_Dp3CNsD0I_c",
  "access_expires_at": "2026-10-30T10:04:22.872176902Z",
  "refresh_token": "e1rFD-GtYf1E4_2iL1wX0Z6xWtnRATdtgZDsGhvxi4Y",
  "refresh_expires_at": "2026-11-29T09:49:22.871657644Z",
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
  "session_id": "307cfdf9-4647-460f-8073-ef89174c5e99",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2NjQsImlhdCI6MTc5MzM1Mzc2NCwianRpIjoiOWQ2MTExMmMtMDk0Ny00YjVlLTk0ZTgtMjEzM2Y0ODEzMTU4Iiwic2lkIjoiMzA3Y2ZkZjktNDY0Ny00NjBmLTgwNzMtZWY4OTE3NGM1ZTk5In0.ARpSPVop70WJ3_6Cul_yeOwWoG4I4m_rTzs5SXbR-kg",
  "access_expires_at": "2026-10-30T10:04:24.059574479Z",
  "refresh_token": "eQYRhkOwhuMjPus2ezEZpzMAHC06-HkU86gNFjVAh7I",
  "refresh_expires_at": "2026-10-30T21:49:24.05900128Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380639300628` → **200**

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
  "correlation_id": "922527ce-7098-478e-b8b0-6a85bec3a0a8"
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
  "session_id": "d064e726-30ef-4656-bd62-fe3aa489232d",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2NjUsImlhdCI6MTc5MzM1Mzc2NSwianRpIjoiZGJiMTBlODAtZmRlMi00MzgxLWJhNDUtNmY1NzZmMzVlZjE3Iiwic2lkIjoiZDA2NGU3MjYtMzBlZi00NjU2LWJkNjItZmUzYWE0ODkyMzJkIn0.8y9BzBXTv7Mf_BDughIIow-buje2DZMzWD9mxFcPtUc",
  "access_expires_at": "2026-10-30T10:04:25.266174992Z",
  "refresh_token": "0nrsiEesUGdjzqyibi8bvxxuKBCpfwXXvARgdpKLKrc",
  "refresh_expires_at": "2026-10-30T21:49:25.265612523Z",
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
  "changed_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T09:44:53.952535Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "b5f8be76-d205-4b75-bc2f-751f1d8d3cc3",
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
  "changed_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T09:49:25.887248129Z"
}
```

## The rider books the airport for 2026-10-30T12:49:24Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600091377",
  "device_ref": "sandbox-1947"
}
```

```json
{
  "challenge_id": "b5546108-1704-4bcc-89c2-346a83512ba3",
  "expires_at": "2026-10-30T09:54:26.208517796Z",
  "resend_available_at": "2026-10-30T09:49:27.208517796Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600091377` → **200**

```json
{
  "phone": "+48600091377",
  "audience": "CLIENT",
  "code": "881104",
  "sent_at": "2026-10-30T09:49:26.21144193Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b5546108-1704-4bcc-89c2-346a83512ba3",
  "code": "881104",
  "device_ref": "sandbox-1947"
}
```

```json
{
  "session_id": "5df2a9ce-65f7-4901-b6b3-eaa510f3d615",
  "subject": {
    "type": "CLIENT",
    "id": "33b24f69-7082-494e-96d0-a7f823ab4dca"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzM2IyNGY2OS03MDgyLTQ5NGUtOTZkMC1hN2Y4MjNhYjRkY2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NjY2LCJpYXQiOjE3OTMzNTM3NjYsImp0aSI6IjYzYWQzNTlkLTE5OTUtNDg5Zi04MTUzLTM5YWQyMTEzMmMwZiIsInNpZCI6IjVkZjJhOWNlLTY1ZjctNDkwMS1iNmIzLWVhYTUxMGYzZDYxNSJ9.quf76WxHMxZ1wVsKnE_vIP-tvJJkutGk8G5DRRrT6n8",
  "access_expires_at": "2026-10-30T10:04:26.527593836Z",
  "refresh_token": "1wx7crPrDkYSNAoft7YcLdl1agqRSyGYOebX8K53dVY",
  "refresh_expires_at": "2026-11-29T09:49:26.526868453Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ad6f648b-0fa1-43c8-9764-320382f7c3b5",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T12:49:24Z"
}
```

```json
{
  "id": "11b342b2-9a10-4e3c-b658-91f432fed60e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:54:26.827715Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T12:49:24Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "12532516-e07f-408d-a253-85d325d6ae5b",
  "quote_id": "11b342b2-9a10-4e3c-b658-91f432fed60e",
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
  "pickup_at": "2026-10-30T12:49:24Z"
}
```

```json
{
  "id": "2d0d2cdd-0ea7-409c-a9b4-1a1c2981783e",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "33b24f69-7082-494e-96d0-a7f823ab4dca",
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
  "created_at": "2026-10-30T09:49:27.13437Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T12:49:24Z",
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
  "device_ref": "sandbox-25057"
}
```

```json
{
  "challenge_id": "4c60b494-a9d6-44b6-a6fa-852e1fe93529",
  "expires_at": "2026-10-30T09:54:27.43619562Z",
  "resend_available_at": "2026-10-30T09:49:28.43619562Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "402560",
  "sent_at": "2026-10-30T09:49:27.4388458Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4c60b494-a9d6-44b6-a6fa-852e1fe93529",
  "code": "402560",
  "device_ref": "sandbox-25057"
}
```

```json
{
  "session_id": "f80a5b77-f6df-4125-b251-eb56434c0549",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDY2NywiaWF0IjoxNzkzMzUzNzY3LCJqdGkiOiI5OWU2Y2FhOS0yYzlmLTQxNTMtYmY3Mi05YWY2OTMwZDEyNzUiLCJzaWQiOiJmODBhNWI3Ny1mNmRmLTQxMjUtYjI1MS1lYjU2NDM0YzA1NDkifQ.Ws--_jNwgrILvs7hTB4j_XyuXU-ATcVssAVBkvbl78c",
  "access_expires_at": "2026-10-30T10:04:27.75534664Z",
  "refresh_token": "FqRj8400oEEQdst-0-a9Hc1x1vbXBx6OmCXTLEDoNQk",
  "refresh_expires_at": "2026-11-29T09:49:27.754783068Z",
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
  "command_id": "75c9dfbd-09be-41e4-b36c-1880d089c137",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:49:28Z",
    "sequence": 1793353768316
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "15676981-81e3-4984-a461-82e553b73d98",
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
  "last_heartbeat_at": "2026-10-30T09:49:28.334447Z",
  "last_location_at": "2026-10-30T09:49:28.334447Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "2d0d2cdd-0ea7-409c-a9b4-1a1c2981783e",
      "short_number": 25,
      "pickup_at": "2026-10-30T12:49:24Z",
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

`POST /api/driver/v1/preorders/2d0d2cdd-0ea7-409c-a9b4-1a1c2981783e/reserve` → **200**

```json
{
  "command_id": "06cbcb24-3649-4fae-b429-9ed058c8f81e"
}
```

```json
{
  "id": "c41a9884-9225-475d-a2f1-e4ac29018579",
  "state": "RESERVED",
  "order": {
    "order_id": "2d0d2cdd-0ea7-409c-a9b4-1a1c2981783e",
    "short_number": 25,
    "pickup_at": "2026-10-30T12:49:24Z",
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
  "reserved_at": "2026-10-30T09:49:28.913619Z",
  "confirm_from": "2026-10-30T12:19:24Z",
  "confirm_until": "2026-10-30T12:29:24Z",
  "drop_until": "2026-10-30T11:49:24Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "c41a9884-9225-475d-a2f1-e4ac29018579",
      "state": "RESERVED",
      "order": {
        "order_id": "2d0d2cdd-0ea7-409c-a9b4-1a1c2981783e",
        "short_number": 25,
        "pickup_at": "2026-10-30T12:49:24Z",
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
      "reserved_at": "2026-10-30T09:49:28.913619Z",
      "confirm_from": "2026-10-30T12:19:24Z",
      "confirm_until": "2026-10-30T12:29:24Z",
      "drop_until": "2026-10-30T11:49:24Z"
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
      "id": "c41a9884-9225-475d-a2f1-e4ac29018579",
      "state": "RESERVED",
      "order": {
        "order_id": "2d0d2cdd-0ea7-409c-a9b4-1a1c2981783e",
        "short_number": 25,
        "pickup_at": "2026-10-30T12:49:24Z",
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
      "reserved_at": "2026-10-30T09:49:28.913619Z",
      "confirm_from": "2026-10-30T12:19:24Z",
      "confirm_until": "2026-10-30T12:29:24Z",
      "drop_until": "2026-10-30T11:49:24Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/c41a9884-9225-475d-a2f1-e4ac29018579/confirm` → **409**

```json
{
  "command_id": "73da905e-9dac-44b5-a18f-19ae432eb3d6"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/c41a9884-9225-475d-a2f1-e4ac29018579/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b2ba8a59-589b-4e7e-98cd-b8c5d4191d92"
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
  "session_id": "b28d6dc2-175e-4865-9087-e6b8b2d0c79a",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2NzAsImlhdCI6MTc5MzM1Mzc3MCwianRpIjoiYmQ5ZjI5MTQtZTI0MC00NGI0LTk0YzAtMTk2YTNjM2UxOThmIiwic2lkIjoiYjI4ZDZkYzItMTc1ZS00ODY1LTkwODctZTZiOGIyZDBjNzlhIn0.zoDgtl4-vb3ZAAG4QTu5iFKgpyEzT3IwUd_Ou7SUNcI",
  "access_expires_at": "2026-10-30T10:04:30.358475931Z",
  "refresh_token": "7NXm7hqFr2bSLGC7YeI_EmapfrfRSmymGPTvCyuXCOQ",
  "refresh_expires_at": "2026-10-30T21:49:30.357926726Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2d0d2cdd-0ea7-409c-a9b4-1a1c2981783e` → **200**

```json
{
  "id": "2d0d2cdd-0ea7-409c-a9b4-1a1c2981783e",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "33b24f69-7082-494e-96d0-a7f823ab4dca",
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
  "created_at": "2026-10-30T09:49:27.13437Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T12:49:24Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "c41a9884-9225-475d-a2f1-e4ac29018579",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T09:49:28.913619Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/2d0d2cdd-0ea7-409c-a9b4-1a1c2981783e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T09:49:27.135498Z",
      "actor": {
        "type": "CLIENT",
        "id": "33b24f69-7082-494e-96d0-a7f823ab4dca",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "2d0d2cdd-0ea7-409c-a9b4-1a1c2981783e",
        "preorder": true,
        "quote_id": "11b342b2-9a10-4e3c-b658-91f432fed60e",
        "pickup_at": "2026-10-30T12:49:24Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "247d634d-f5e4-4123-95ff-85995c3409fb"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T09:49:28.914927Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2d0d2cdd-0ea7-409c-a9b4-1a1c2981783e",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "c41a9884-9225-475d-a2f1-e4ac29018579"
      },
      "correlation_id": "9222f883-72d7-4e46-b30a-0ea074f55d14"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 2d0d2cdd-0ea7-409c-a9b4-1a1c2981783e, reservation c41a9884-9225-475d-a2f1-e4ac29018579.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17863"
}
```

```json
{
  "challenge_id": "bde11f9f-718b-4b1e-9063-1f035af44bc1",
  "expires_at": "2026-10-30T09:54:31.257552289Z",
  "resend_available_at": "2026-10-30T09:49:32.257552289Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "239909",
  "sent_at": "2026-10-30T09:49:31.260377289Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bde11f9f-718b-4b1e-9063-1f035af44bc1",
  "code": "239909",
  "device_ref": "sandbox-17863"
}
```

```json
{
  "session_id": "31a6d879-1266-4319-9cc5-2a2c15a90385",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDY3MSwiaWF0IjoxNzkzMzUzNzcxLCJqdGkiOiI3YTVjZGRmNS1hMGU1LTQ3MWYtODI2ZS1lZDM1MjJhMjI0NGYiLCJzaWQiOiIzMWE2ZDg3OS0xMjY2LTQzMTktOWNjNS0yYTJjMTVhOTAzODUifQ.7WhzSsQ9aXVqszYARTyUlDTH-A282fL4c7Ti_GbLqU4",
  "access_expires_at": "2026-10-30T10:04:31.573332927Z",
  "refresh_token": "2GZh7qQlFxBEeq-iecB54JlPsugu1OQSX1ra5iEnmrw",
  "refresh_expires_at": "2026-11-29T09:49:31.572720324Z",
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
  "command_id": "2887c9ae-5813-4f5f-a2ba-2297622c1d9e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:49:32Z",
    "sequence": 1793353772139
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3523ad15-9788-4ec9-9b16-fff6d384627b",
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
  "last_heartbeat_at": "2026-10-30T09:49:32.158636Z",
  "last_location_at": "2026-10-30T09:49:32.158636Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675397853",
  "device_ref": "sandbox-827"
}
```

```json
{
  "challenge_id": "d8a1a645-86c7-4781-8c1b-23a460f51482",
  "expires_at": "2026-10-30T09:54:32.455614706Z",
  "resend_available_at": "2026-10-30T09:49:33.455614706Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675397853` → **200**

```json
{
  "phone": "+380675397853",
  "audience": "CLIENT",
  "code": "846719",
  "sent_at": "2026-10-30T09:49:32.458226034Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8a1a645-86c7-4781-8c1b-23a460f51482",
  "code": "846719",
  "device_ref": "sandbox-827"
}
```

```json
{
  "session_id": "cf341fe2-ad7a-4a0d-be77-c6bf1f327190",
  "subject": {
    "type": "CLIENT",
    "id": "2ee273ed-e12d-4fa9-974e-ba3b5b186261"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZWUyNzNlZC1lMTJkLTRmYTktOTc0ZS1iYTNiNWIxODYyNjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NjcyLCJpYXQiOjE3OTMzNTM3NzIsImp0aSI6ImRkMzI3YjI3LWE0OTItNDk0NC1iYTgwLWJiZTJiZWQ1NjEzMiIsInNpZCI6ImNmMzQxZmUyLWFkN2EtNGEwZC1iZTc3LWM2YmYxZjMyNzE5MCJ9.KMfoi3QNZm_c_Jlc1sHl3g6O1hL25dARNqOy9R5J4RQ",
  "access_expires_at": "2026-10-30T10:04:32.774901907Z",
  "refresh_token": "hWzFdfg6jNLu-llMakth6txjSbF_hBcwZiAQJIw8EiQ",
  "refresh_expires_at": "2026-11-29T09:49:32.774366459Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "97b8c582-98d1-4a72-9d40-18e8354f22c5",
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
  "id": "506a6410-37f9-4e34-9ca5-76a6ada83e9d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:54:33.070232Z",
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
  "command_id": "d65ae07b-422d-4679-ac9e-684d721ddd03",
  "quote_id": "506a6410-37f9-4e34-9ca5-76a6ada83e9d",
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
  "id": "e60aae49-0f4f-4609-b755-8d26f4192b54",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2ee273ed-e12d-4fa9-974e-ba3b5b186261",
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
  "created_at": "2026-10-30T09:49:33.370102Z",
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
    "id": "a09c15d6-0b0c-4e34-ab4a-36d93f6c43ab",
    "order_id": "e60aae49-0f4f-4609-b755-8d26f4192b54",
    "expires_at": "2026-10-30T09:49:48.372854Z",
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

`POST /api/driver/v1/offers/a09c15d6-0b0c-4e34-ab4a-36d93f6c43ab/accept` → **200**

```json
{
  "command_id": "d3308eb3-6c6d-447a-949c-c938a833e877"
}
```

```json
{
  "id": "c64b3ce5-0179-4421-8941-d6a67b74c58b",
  "order_id": "e60aae49-0f4f-4609-b755-8d26f4192b54",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b795f309-f19f-4ff4-99c5-a744675444f0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b795f309-f19f-4ff4-99c5-a744675444f0",
  "order_id": "e60aae49-0f4f-4609-b755-8d26f4192b54",
  "assignment_id": "c64b3ce5-0179-4421-8941-d6a67b74c58b",
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

`POST /api/driver/v1/work-sessions/3523ad15-9788-4ec9-9b16-fff6d384627b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:49:34Z",
    "sequence": 1793353774539
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3523ad15-9788-4ec9-9b16-fff6d384627b",
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
  "last_heartbeat_at": "2026-10-30T09:49:34.557917Z",
  "last_location_at": "2026-10-30T09:49:34.557917Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b795f309-f19f-4ff4-99c5-a744675444f0",
  "order_id": "e60aae49-0f4f-4609-b755-8d26f4192b54",
  "assignment_id": "c64b3ce5-0179-4421-8941-d6a67b74c58b",
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

`POST /api/driver/v1/trips/b795f309-f19f-4ff4-99c5-a744675444f0/arrive` → **200**

```json
{
  "command_id": "bb4edc4a-7cd1-4e0c-90bb-a64491a32398",
  "expected_version": 0
}
```

```json
{
  "id": "b795f309-f19f-4ff4-99c5-a744675444f0",
  "order_id": "e60aae49-0f4f-4609-b755-8d26f4192b54",
  "assignment_id": "c64b3ce5-0179-4421-8941-d6a67b74c58b",
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
  "arrived_at": "2026-10-30T09:49:35.139944Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b795f309-f19f-4ff4-99c5-a744675444f0/start` → **200**

```json
{
  "command_id": "22367533-939e-475b-b49a-e242ba4c2ad7",
  "expected_version": 1
}
```

```json
{
  "id": "b795f309-f19f-4ff4-99c5-a744675444f0",
  "order_id": "e60aae49-0f4f-4609-b755-8d26f4192b54",
  "assignment_id": "c64b3ce5-0179-4421-8941-d6a67b74c58b",
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
  "arrived_at": "2026-10-30T09:49:35.139944Z",
  "started_at": "2026-10-30T09:49:35.440225Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/3523ad15-9788-4ec9-9b16-fff6d384627b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:49:35Z",
    "sequence": 1793353775722
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3523ad15-9788-4ec9-9b16-fff6d384627b",
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
  "last_heartbeat_at": "2026-10-30T09:49:35.740883Z",
  "last_location_at": "2026-10-30T09:49:35.740883Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/b795f309-f19f-4ff4-99c5-a744675444f0/complete` → **200**

```json
{
  "command_id": "82337b24-213f-4627-b05c-345bae39eba0",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:49:36Z",
  "cash_received": true
}
```

```json
{
  "id": "b795f309-f19f-4ff4-99c5-a744675444f0",
  "order_id": "e60aae49-0f4f-4609-b755-8d26f4192b54",
  "assignment_id": "c64b3ce5-0179-4421-8941-d6a67b74c58b",
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
  "arrived_at": "2026-10-30T09:49:35.139944Z",
  "started_at": "2026-10-30T09:49:35.440225Z",
  "completed_at": "2026-10-30T09:49:36.051614Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/e60aae49-0f4f-4609-b755-8d26f4192b54/rating` → **200**

```json
{
  "command_id": "aeb57655-e01d-4d18-ad98-06a55ee9f8ed",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "e60aae49-0f4f-4609-b755-8d26f4192b54",
  "score": 5,
  "created_at": "2026-10-30T09:49:36.362074261Z"
}
```

`POST /api/driver/v1/orders/e60aae49-0f4f-4609-b755-8d26f4192b54/rating` → **200**

```json
{
  "command_id": "743b63bf-f239-424e-abfa-676e608ef9a5",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "e60aae49-0f4f-4609-b755-8d26f4192b54",
  "score": 4,
  "created_at": "2026-10-30T09:49:36.659465161Z"
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
  "session_id": "2f4bcc68-4c0d-40c9-9679-3016c57a68d8",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2NzcsImlhdCI6MTc5MzM1Mzc3NywianRpIjoiMmRlODZmMWUtNmEwZi00MzJiLTk2NzItMjFlMjg1Yzc4NmQ5Iiwic2lkIjoiMmY0YmNjNjgtNGMwZC00MGM5LTk2NzktMzAxNmM1N2E2OGQ4In0.ZRBpYT0QW1PB5mQr1BHngpnNF9Xa9GGGzTsVNPJlHPI",
  "access_expires_at": "2026-10-30T10:04:37.547371432Z",
  "refresh_token": "FIBo0UrvCm_x4QWgc43whl7q2dx8H09pQiP9N9JZXLE",
  "refresh_expires_at": "2026-10-30T21:49:37.546845531Z",
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
  "session_id": "3f522062-ad9e-4a1a-98b4-03065edac571",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2NzgsImlhdCI6MTc5MzM1Mzc3OCwianRpIjoiNTg0OWQ2OTYtOWJiNS00Nzg2LTlhODEtMjU4MGQ3YmZhNTBhIiwic2lkIjoiM2Y1MjIwNjItYWQ5ZS00YTFhLTk4YjQtMDMwNjVlZGFjNTcxIn0.b2Ne5aplLTbYRORhJrDrQdBc9h-DgoK1Bu6kZ9bGJVg",
  "access_expires_at": "2026-10-30T10:04:38.129473989Z",
  "refresh_token": "uUX-8j2gp9p7Y4tD1v6EF-pKARUU4X7LwP9rINtPQgc",
  "refresh_expires_at": "2026-10-30T21:49:38.128941205Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e60aae49-0f4f-4609-b755-8d26f4192b54/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "e60aae49-0f4f-4609-b755-8d26f4192b54",
      "author_type": "RIDER",
      "author_id": "2ee273ed-e12d-4fa9-974e-ba3b5b186261",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T09:49:36.362074Z"
    },
    {
      "order_id": "e60aae49-0f4f-4609-b755-8d26f4192b54",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "2ee273ed-e12d-4fa9-974e-ba3b5b186261",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T09:49:36.659465Z"
    }
  ]
}
```

Done: ratings for order e60aae49-0f4f-4609-b755-8d26f4192b54.

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
  "session_id": "b0a8af08-d35c-4ecb-a5ae-790219dda92a",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2NzksImlhdCI6MTc5MzM1Mzc3OSwianRpIjoiM2VmOGIyNTYtNzdhMy00YWIzLWEyZWMtYjc5MzI5Yjk2Nzk4Iiwic2lkIjoiYjBhOGFmMDgtZDM1Yy00ZWNiLWE1YWUtNzkwMjE5ZGRhOTJhIn0.fevI4b0sgaMPgFfrNSC8GNCv3SM_P-ElFYHzWhLTbEE",
  "access_expires_at": "2026-10-30T10:04:39.02709229Z",
  "refresh_token": "BRokLUWoR8_F_0JLI8QJWX2mJhReQTpFzzue-wOabS0",
  "refresh_expires_at": "2026-10-30T21:49:39.026522046Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b1e91dff-f0b1-4f66-8a1e-c01b509b05c0",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "1dd0b1bb-2c6b-45a3-a09a-07d8d76dc766",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:49:39.322266Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1dd0b1bb-2c6b-45a3-a09a-07d8d76dc766` → **200**

```json
{
  "id": "1dd0b1bb-2c6b-45a3-a09a-07d8d76dc766",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:49:39.322266Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1dd0b1bb-2c6b-45a3-a09a-07d8d76dc766` → **200**

```json
{
  "id": "1dd0b1bb-2c6b-45a3-a09a-07d8d76dc766",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:49:39.322266Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1dd0b1bb-2c6b-45a3-a09a-07d8d76dc766` → **200**

```json
{
  "id": "1dd0b1bb-2c6b-45a3-a09a-07d8d76dc766",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T09:49:39.322266Z",
  "ready_at": "2026-10-30T09:49:40.961438Z",
  "expires_at": "2026-10-31T09:49:40.961438Z"
}
```

`GET /api/admin/v1/reports/exports/1dd0b1bb-2c6b-45a3-a09a-07d8d76dc766/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b5c37cbe-01a2-4452-b85e-c37312df4243",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "3c8763f6-cc53-4545-824b-c43a0dc91316",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:49:42.534908Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3c8763f6-cc53-4545-824b-c43a0dc91316` → **200**

```json
{
  "id": "3c8763f6-cc53-4545-824b-c43a0dc91316",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:49:42.534908Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3c8763f6-cc53-4545-824b-c43a0dc91316` → **200**

```json
{
  "id": "3c8763f6-cc53-4545-824b-c43a0dc91316",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:49:42.534908Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3c8763f6-cc53-4545-824b-c43a0dc91316` → **200**

```json
{
  "id": "3c8763f6-cc53-4545-824b-c43a0dc91316",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:49:42.534908Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3c8763f6-cc53-4545-824b-c43a0dc91316` → **200**

```json
{
  "id": "3c8763f6-cc53-4545-824b-c43a0dc91316",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T09:49:42.534908Z",
  "ready_at": "2026-10-30T09:49:45.969661Z",
  "expires_at": "2026-10-31T09:49:45.969661Z"
}
```

`GET /api/admin/v1/reports/exports/3c8763f6-cc53-4545-824b-c43a0dc91316/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/090a88a7-b902-4f9a-9451-8dce018e5371` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/090a88a7-b902-4f9a-9451-8dce018e5371",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6bb57fca-793e-46df-9acc-27d565475b8f"
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
  "device_ref": "sandbox-21360"
}
```

```json
{
  "challenge_id": "28818c0f-9bce-409e-9c46-94ed862ae29d",
  "expires_at": "2026-10-30T09:54:47.35045058Z",
  "resend_available_at": "2026-10-30T09:49:48.35045058Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "327458",
  "sent_at": "2026-10-30T09:49:47.353488797Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "28818c0f-9bce-409e-9c46-94ed862ae29d",
  "code": "327458",
  "device_ref": "sandbox-21360"
}
```

```json
{
  "session_id": "bab7bb29-bdf6-45a6-b051-ae26de32ad6e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDY4NywiaWF0IjoxNzkzMzUzNzg3LCJqdGkiOiIxYzE0NjA5NS1mNDNmLTQ3MTMtYTZkYy1lM2RiNjk1NTJhMjAiLCJzaWQiOiJiYWI3YmIyOS1iZGY2LTQ1YTYtYjA1MS1hZTI2ZGUzMmFkNmUifQ.UEnffbqaxAkWu5LtpZJdsMUgqhzyx62MSP1c7cds3rM",
  "access_expires_at": "2026-10-30T10:04:47.665303757Z",
  "refresh_token": "16j28INUI6ifUeHuA7nUx4HqLr94S7WBjR4zV06SojQ",
  "refresh_expires_at": "2026-11-29T09:49:47.664718978Z",
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
  "command_id": "da7362ea-ec10-4f3c-9974-b1409616ba72",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:49:48Z",
    "sequence": 1793353788516
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fac9767a-6c46-47cc-81c1-4769bf6de1d7",
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
  "last_heartbeat_at": "2026-10-30T09:49:48.534061Z",
  "last_location_at": "2026-10-30T09:49:48.534061Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "d4de4768-f5b6-4008-9631-bc28c0b7c822",
  "points": [
    {
      "sequence": 1793353790831,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T09:48:50Z"
    },
    {
      "sequence": 1793353790838,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T09:49:50Z"
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
  "session_id": "cc9bad89-bbe5-4964-8777-3a6447e1637d",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2OTEsImlhdCI6MTc5MzM1Mzc5MSwianRpIjoiOTU2OGRmN2YtYWRkMy00ZjdhLTljZDktODcxNDk5ZDUxZmUwIiwic2lkIjoiY2M5YmFkODktYmJlNS00OTY0LTg3NzctM2E2NDQ3ZTE2MzdkIn0.zTPzdApBpbLxWS6rpHuu-_J-mDkTxpE3ES-1wnSmMLw",
  "access_expires_at": "2026-10-30T10:04:51.480076666Z",
  "refresh_token": "Iz5GgTH5Gdc2rTpWp7XFPT6m6duOmnLSLUB2sdrbmx0",
  "refresh_expires_at": "2026-10-30T21:49:51.479554382Z",
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
      "id": "26abc9a3-10a4-4469-8281-cbd6d76e5c85",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T09:49:50Z",
        "track_point_id": "6a85e277-d582-46e7-a566-836ee7cb17b3",
        "work_session_id": "fac9767a-6c46-47cc-81c1-4769bf6de1d7"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T09:49:50Z",
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

`POST /api/admin/v1/driver-risk-flags/26abc9a3-10a4-4469-8281-cbd6d76e5c85/confirm` → **200**

```json
{
  "command_id": "b48e659e-8d57-4f27-af0b-eed39348850a",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "26abc9a3-10a4-4469-8281-cbd6d76e5c85",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T09:49:50Z",
    "track_point_id": "6a85e277-d582-46e7-a566-836ee7cb17b3",
    "work_session_id": "fac9767a-6c46-47cc-81c1-4769bf6de1d7"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T09:49:50Z",
  "reason": null,
  "reviewed_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "reviewed_at": "2026-10-30T09:49:53.693056Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/26abc9a3-10a4-4469-8281-cbd6d76e5c85/dismiss` → **409**

```json
{
  "command_id": "a4b0608c-80b0-4d4a-8ebe-6808fec2758e",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/26abc9a3-10a4-4469-8281-cbd6d76e5c85/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "be51749e-d508-42ec-b158-da5f1d57efe0"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "817d2714-3abe-468d-93e7-f16f5482e5c9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "c6f3652e-263e-428c-9ea6-3c898e0aea7a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "raised_at": "2026-10-30T09:49:54.318556Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/c6f3652e-263e-428c-9ea6-3c898e0aea7a/dismiss` → **200**

```json
{
  "command_id": "7a35c20a-1955-4742-a2c7-533bcad90ddc",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "c6f3652e-263e-428c-9ea6-3c898e0aea7a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "raised_at": "2026-10-30T09:49:54.318556Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "reviewed_at": "2026-10-30T09:49:54.643458Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "7f6cd027-c21c-4249-b817-6ec7c4fb273c",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "26abc9a3-10a4-4469-8281-cbd6d76e5c85"
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
      "actor_id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T09:49:54.949532Z"
    }
  ]
}
```

Done: flag 26abc9a3-10a4-4469-8281-cbd6d76e5c85 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "8102dcfb-21a7-405e-ba3f-ccbf795a7d9b",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2OTUsImlhdCI6MTc5MzM1Mzc5NSwianRpIjoiNjExNzdlYTUtMjI2NC00NTA2LTlhODYtMTE2MDkwMDdmZTlhIiwic2lkIjoiODEwMmRjZmItMjFhNy00MDVlLWJhM2YtY2NiZjc5NWE3ZDliIn0.NXfEV3Ere6y05QKqfO2RFfFa7Gi9wqiL6MronNeSag0",
  "access_expires_at": "2026-10-30T10:04:55.832135689Z",
  "refresh_token": "tSa4fSewP1t7P7BXRRO1iF6SU3UAJCJWUVUEobGgioQ",
  "refresh_expires_at": "2026-10-30T21:49:55.831590102Z",
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
      "actor_id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T09:49:54.949532Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "e50d99d4-5e15-4121-933b-a9ea994d09f5",
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
  "session_id": "fac9767a-6c46-47cc-81c1-4769bf6de1d7",
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
  "last_heartbeat_at": "2026-10-30T09:49:48.534061Z",
  "last_location_at": "2026-10-30T09:49:48.534061Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fac9767a-6c46-47cc-81c1-4769bf6de1d7/close` → **200**

```json
{
  "command_id": "b231e549-ed34-48d3-881c-fd2663c9ef2d",
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
  "session_id": "8092f1c6-23df-450a-9c27-b2cb097e3b78",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2OTcsImlhdCI6MTc5MzM1Mzc5NywianRpIjoiMGQ1ZjRmNmMtNDVhMi00ZTc2LWI1ZTQtNDc3NmZmODk1NTFiIiwic2lkIjoiODA5MmYxYzYtMjNkZi00NTBhLTljMjctYjJjYjA5N2UzYjc4In0.jLJWkuwcOykBTkq8a73AiR3D32SdBIeHMcUuVJF59bw",
  "access_expires_at": "2026-10-30T10:04:57.62847736Z",
  "refresh_token": "iUw50Lod00jLYfVO80-S_daKXv7F_BrzbDC5sQyYpEI",
  "refresh_expires_at": "2026-10-30T21:49:57.627924329Z",
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
  "command_id": "0ebd2e9e-219c-4c95-89ef-e4b3d48d4e7a",
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
  "changed_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T09:49:58.213024Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "0ebd2e9e-219c-4c95-89ef-e4b3d48d4e7a",
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
  "changed_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T09:49:58.213024Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48211737803",
  "device_ref": "sandbox-24612"
}
```

```json
{
  "challenge_id": "e739fc2d-6868-4102-86e8-286c2dc59bc1",
  "expires_at": "2026-10-30T09:54:58.813349865Z",
  "resend_available_at": "2026-10-30T09:49:59.813349865Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48211737803` → **200**

```json
{
  "phone": "+48211737803",
  "audience": "CLIENT",
  "code": "280338",
  "sent_at": "2026-10-30T09:49:58.816309385Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e739fc2d-6868-4102-86e8-286c2dc59bc1",
  "code": "280338",
  "device_ref": "sandbox-24612"
}
```

```json
{
  "session_id": "1fc662cb-c5c5-4adc-a2c1-289254d08756",
  "subject": {
    "type": "CLIENT",
    "id": "288677c7-cbb4-4d33-ae1a-2638354b5176"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyODg2NzdjNy1jYmI0LTRkMzMtYWUxYS0yNjM4MzU0YjUxNzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0Njk5LCJpYXQiOjE3OTMzNTM3OTksImp0aSI6ImU2OTZjMmFhLTA0N2EtNGY0Ni1hYzU5LTZiNGYxZjU1ZGVjMSIsInNpZCI6IjFmYzY2MmNiLWM1YzUtNGFkYy1hMmMxLTI4OTI1NGQwODc1NiJ9.8v3LhTaWO6eO59het0Q5ZB_mo1hB6UGf1z0vjjnPLOo",
  "access_expires_at": "2026-10-30T10:04:59.132545318Z",
  "refresh_token": "056M8xE0lcQ897BuoVff7gectS6fL3Q2rkQsdld-OLo",
  "refresh_expires_at": "2026-11-29T09:49:59.132063429Z",
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
  "correlation_id": "31061687-4560-467c-acda-a3c45bfb2790"
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
  "device_ref": "sandbox-23707"
}
```

```json
{
  "challenge_id": "ba06675c-5dc5-4a8d-9364-90cda0540405",
  "expires_at": "2026-10-30T09:54:59.984203564Z",
  "resend_available_at": "2026-10-30T09:50:00.984203564Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "004862",
  "sent_at": "2026-10-30T09:49:59.986898009Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ba06675c-5dc5-4a8d-9364-90cda0540405",
  "code": "004862",
  "device_ref": "sandbox-23707"
}
```

```json
{
  "session_id": "d9115343-f4e6-4057-a167-42ae1d126a12",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDcwMCwiaWF0IjoxNzkzMzUzODAwLCJqdGkiOiI0ODYxNDhiYi1kYzU2LTQ3YWEtOWQzYi01MDE0NTc5NzRhNTgiLCJzaWQiOiJkOTExNTM0My1mNGU2LTQwNTctYTE2Ny00MmFlMWQxMjZhMTIifQ.N5TRtXmFhTVeGR2z8a20OdF6f-JBN0Psft3IZnXR2t4",
  "access_expires_at": "2026-10-30T10:05:00.298408371Z",
  "refresh_token": "xr-HwzKD32MCdwfDbTSGIgHTfdX8C49z0-ylJaZwjRE",
  "refresh_expires_at": "2026-11-29T09:50:00.297883933Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "15676981-81e3-4984-a461-82e553b73d98",
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
  "last_heartbeat_at": "2026-10-30T09:49:28.334447Z",
  "last_location_at": "2026-10-30T09:49:28.334447Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/15676981-81e3-4984-a461-82e553b73d98/handover` → **200**

```json
{
  "command_id": "08a48ed7-9094-4ea4-a17a-4f55da9ea503",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "15676981-81e3-4984-a461-82e553b73d98",
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
  "last_heartbeat_at": "2026-10-30T09:49:28.334447Z",
  "last_location_at": "2026-10-30T09:49:28.334447Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/15676981-81e3-4984-a461-82e553b73d98/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:50:01Z",
    "sequence": 1793353801165
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "15676981-81e3-4984-a461-82e553b73d98",
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
  "last_heartbeat_at": "2026-10-30T09:50:01.183762Z",
  "last_location_at": "2026-10-30T09:50:01.183762Z",
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
  "session_id": "15676981-81e3-4984-a461-82e553b73d98",
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
  "last_heartbeat_at": "2026-10-30T09:50:01.183762Z",
  "last_location_at": "2026-10-30T09:50:01.183762Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/15676981-81e3-4984-a461-82e553b73d98/close` → **200**

```json
{
  "command_id": "15eddfa9-230a-4423-a31c-10e2e8e9af71",
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
  "correlation_id": "ab341161-3313-4d35-9b6a-b77485bb5d4e"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678692558",
  "device_ref": "sandbox-16879"
}
```

```json
{
  "challenge_id": "73824f3c-3ec8-4eb3-9c24-fe569801fdd2",
  "expires_at": "2026-10-30T09:55:02.712517689Z",
  "resend_available_at": "2026-10-30T09:50:03.712517689Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678692558` → **200**

```json
{
  "phone": "+380678692558",
  "audience": "CLIENT",
  "code": "845757",
  "sent_at": "2026-10-30T09:50:02.715237252Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "73824f3c-3ec8-4eb3-9c24-fe569801fdd2",
  "code": "845757",
  "device_ref": "sandbox-16879"
}
```

```json
{
  "session_id": "91002f26-1fd1-4fbf-889f-6b0d0f139c27",
  "subject": {
    "type": "CLIENT",
    "id": "9ef193e3-2444-480c-b6e1-f9c1e2bc9602"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZWYxOTNlMy0yNDQ0LTQ4MGMtYjZlMS1mOWMxZTJiYzk2MDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NzAzLCJpYXQiOjE3OTMzNTM4MDMsImp0aSI6IjY0Y2NlMTcyLWZmODctNGNlZi1hMmYyLTgwMjI5YTczNjVmOCIsInNpZCI6IjkxMDAyZjI2LTFmZDEtNGZiZi04ODlmLTZiMGQwZjEzOWMyNyJ9.m-8QNEo3N3MDVKxbxfS_anqN0FfG78iHfesBuCv3IXg",
  "access_expires_at": "2026-10-30T10:05:03.02373729Z",
  "refresh_token": "29gxlFfPIxagXQcijA8QMykc9ONUOfv9awZQSAokfso",
  "refresh_expires_at": "2026-11-29T09:50:03.02311237Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "54aa4d82-8fb8-48a2-8b30-7e53ba480f80",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "838b2ca1-0367-4aca-a6f8-d991c32441d5",
  "upload_path": "/api/rider/v1/uploads/838b2ca1-0367-4aca-a6f8-d991c32441d5",
  "expires_at": "2026-10-30T10:05:03.313366498Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/838b2ca1-0367-4aca-a6f8-d991c32441d5` → **200**

```json
{
  "file_id": "838b2ca1-0367-4aca-a6f8-d991c32441d5",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "9c34a633-4c14-4d4d-8c8f-348d40a8dd7c",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "838b2ca1-0367-4aca-a6f8-d991c32441d5"
  ]
}
```

```json
{
  "id": "5905055d-4a80-4826-8f50-81af0aff8cf1",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9ef193e3-2444-480c-b6e1-f9c1e2bc9602",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T09:50:03.657815Z",
  "updated_at": "2026-10-30T09:50:03.657815Z",
  "respond_by": "2026-10-30T13:50:03.657815Z",
  "messages": [
    {
      "id": "b086605b-745d-4e35-bc0d-b86c334d2bd9",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9ef193e3-2444-480c-b6e1-f9c1e2bc9602",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:50:03.659062Z",
      "attachments": [
        {
          "file_id": "838b2ca1-0367-4aca-a6f8-d991c32441d5",
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
  "session_id": "3c39b3f1-51fa-4c75-b447-c77662ee0289",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3MDQsImlhdCI6MTc5MzM1MzgwNCwianRpIjoiOGZmZTNjNjYtMmEzOS00NmMxLWFmYWItMjhkNjQ1YzMzM2JjIiwic2lkIjoiM2MzOWIzZjEtNTFmYS00Yzc1LWI0NDctYzc3NjYyZWUwMjg5In0.jFhhbfp7y7ZCaTXtQZo1GeQfOwh8T27bQgRSAPX0cF0",
  "access_expires_at": "2026-10-30T10:05:04.267907541Z",
  "refresh_token": "kNDwpYFiFfIopvPnRoicgRNIptG9mOk7CHSpipKCglg",
  "refresh_expires_at": "2026-10-30T21:50:04.267405004Z",
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
  "session_id": "8ea84ec7-fd52-4c9c-b226-223e3e845a51",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3MDQsImlhdCI6MTc5MzM1MzgwNCwianRpIjoiMTIwODc0OTUtZWQ0ZC00MThhLWFlODYtZGZjYjMzMDBmZmRmIiwic2lkIjoiOGVhODRlYzctZmQ1Mi00YzljLWIyMjYtMjIzZTNlODQ1YTUxIn0.yKwQNHFeCv6EGNP8dBrNWZb0SFTq5YLWOlpQXl22GV8",
  "access_expires_at": "2026-10-30T10:05:04.847999959Z",
  "refresh_token": "qXBxFHoHNM0TndXq7LtJqw7xE5coA_07hgnKIqElRyU",
  "refresh_expires_at": "2026-10-30T21:50:04.847447208Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/5905055d-4a80-4826-8f50-81af0aff8cf1/attachments/838b2ca1-0367-4aca-a6f8-d991c32441d5` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "856ad132-4b99-42cc-900b-feda7b0c92e0",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b532b304-959b-4ddf-87b0-b8b8a3e0d573",
  "upload_path": "/api/operator/v1/uploads/b532b304-959b-4ddf-87b0-b8b8a3e0d573",
  "expires_at": "2026-10-30T10:05:05.156412542Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/b532b304-959b-4ddf-87b0-b8b8a3e0d573` → **200**

```json
{
  "file_id": "b532b304-959b-4ddf-87b0-b8b8a3e0d573",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/5905055d-4a80-4826-8f50-81af0aff8cf1` → **200**

```json
{
  "id": "5905055d-4a80-4826-8f50-81af0aff8cf1",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9ef193e3-2444-480c-b6e1-f9c1e2bc9602",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T09:50:03.657815Z",
  "updated_at": "2026-10-30T09:50:03.657815Z",
  "respond_by": "2026-10-30T13:50:03.657815Z",
  "messages": [
    {
      "id": "b086605b-745d-4e35-bc0d-b86c334d2bd9",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9ef193e3-2444-480c-b6e1-f9c1e2bc9602",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:50:03.659062Z",
      "attachments": [
        {
          "file_id": "838b2ca1-0367-4aca-a6f8-d991c32441d5",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/5905055d-4a80-4826-8f50-81af0aff8cf1/comments` → **200**

```json
{
  "command_id": "2622754e-c3d2-482b-bfb3-eebea78e76ff",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "b532b304-959b-4ddf-87b0-b8b8a3e0d573"
  ]
}
```

```json
{
  "id": "5905055d-4a80-4826-8f50-81af0aff8cf1",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9ef193e3-2444-480c-b6e1-f9c1e2bc9602",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T09:50:03.657815Z",
  "updated_at": "2026-10-30T09:50:05.788921Z",
  "respond_by": "2026-10-30T13:50:03.657815Z",
  "messages": [
    {
      "id": "b086605b-745d-4e35-bc0d-b86c334d2bd9",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9ef193e3-2444-480c-b6e1-f9c1e2bc9602",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:50:03.659062Z",
      "attachments": [
        {
          "file_id": "838b2ca1-0367-4aca-a6f8-d991c32441d5",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "d16c5e31-f77e-4d02-b1e3-20b447a0ff99",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T09:50:05.78848Z",
      "attachments": [
        {
          "file_id": "b532b304-959b-4ddf-87b0-b8b8a3e0d573",
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

`GET /api/rider/v1/support/cases/5905055d-4a80-4826-8f50-81af0aff8cf1` → **200**

```json
{
  "id": "5905055d-4a80-4826-8f50-81af0aff8cf1",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9ef193e3-2444-480c-b6e1-f9c1e2bc9602",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T09:50:03.657815Z",
  "updated_at": "2026-10-30T09:50:05.788921Z",
  "respond_by": "2026-10-30T13:50:03.657815Z",
  "messages": [
    {
      "id": "b086605b-745d-4e35-bc0d-b86c334d2bd9",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9ef193e3-2444-480c-b6e1-f9c1e2bc9602",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:50:03.659062Z",
      "attachments": [
        {
          "file_id": "838b2ca1-0367-4aca-a6f8-d991c32441d5",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "d16c5e31-f77e-4d02-b1e3-20b447a0ff99",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T09:50:05.78848Z",
      "attachments": [
        {
          "file_id": "b532b304-959b-4ddf-87b0-b8b8a3e0d573",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/5905055d-4a80-4826-8f50-81af0aff8cf1/attachments/b532b304-959b-4ddf-87b0-b8b8a3e0d573` → **200**

Done: support case 5905055d-4a80-4826-8f50-81af0aff8cf1, rider attachment 838b2ca1-0367-4aca-a6f8-d991c32441d5, operator attachment b532b304-959b-4ddf-87b0-b8b8a3e0d573.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737827499",
  "device_ref": "sandbox-25778"
}
```

```json
{
  "challenge_id": "5576819e-3be1-4daf-ab67-2c9e3589840d",
  "expires_at": "2026-10-30T09:55:06.414361111Z",
  "resend_available_at": "2026-10-30T09:50:07.414361111Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737827499` → **200**

```json
{
  "phone": "+380737827499",
  "audience": "CLIENT",
  "code": "504309",
  "sent_at": "2026-10-30T09:50:06.417069417Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5576819e-3be1-4daf-ab67-2c9e3589840d",
  "code": "504309",
  "device_ref": "sandbox-25778"
}
```

```json
{
  "session_id": "a37b5534-34f8-4ab1-b665-41887b58895e",
  "subject": {
    "type": "CLIENT",
    "id": "dadc6687-1b63-4c26-8a59-158a74a96f1e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYWRjNjY4Ny0xYjYzLTRjMjYtOGE1OS0xNThhNzRhOTZmMWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NzA2LCJpYXQiOjE3OTMzNTM4MDYsImp0aSI6IjliMDI3ZDcwLTllMTEtNGY5OS1hODJkLTAzNDU0YzYxNzU4YyIsInNpZCI6ImEzN2I1NTM0LTM0ZjgtNGFiMS1iNjY1LTQxODg3YjU4ODk1ZSJ9.Kss7n_402_g-isTCAzLixsogL_DIrcQCB-HUsxeyEys",
  "access_expires_at": "2026-10-30T10:05:06.731298134Z",
  "refresh_token": "qs5zCOnCJiYHL7S1BYwkhWsEKDRcqt5D3dzQJTrENUU",
  "refresh_expires_at": "2026-11-29T09:50:06.730775855Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "9b7f0c25-aca3-41e8-a101-91edbfd27768",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "38f0d179-4e95-4a94-98e9-b9e940f3890a",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-38f0d179-4e95-4a94-98e9-b9e940f3890a",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "367ecfc472f8fcf297f9f8b77f90bacf",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=38f0d179-4e95-4a94-98e9-b9e940f3890a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737827499"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=38f0d179-4e95-4a94-98e9-b9e940f3890a",
  "expires_at": "2026-10-30T10:20:07.022352Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/38f0d179-4e95-4a94-98e9-b9e940f3890a` → **200**

```json
{
  "id": "38f0d179-4e95-4a94-98e9-b9e940f3890a",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:20:07.022352Z",
  "card": {
    "id": "1c4159e0-03d4-469a-9f5a-05401c60f6ee",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3289",
    "card_type": "Visa",
    "created_at": "2026-10-30T09:50:07.318921Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "48b35ec8-85cd-4d3b-8813-f4646b4fae22",
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
  "id": "77f613c4-7a8c-468d-9e10-364a99c1e67e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:55:07.642790Z",
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
  "command_id": "77f763bb-77b3-4d91-9826-19371c45217c",
  "quote_id": "77f613c4-7a8c-468d-9e10-364a99c1e67e",
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
  "id": "fc179786-e8b6-43a4-9b87-196b33df91fd",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "dadc6687-1b63-4c26-8a59-158a74a96f1e",
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
  "created_at": "2026-10-30T09:50:07.951694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fc179786-e8b6-43a4-9b87-196b33df91fd` → **200**

```json
{
  "id": "fc179786-e8b6-43a4-9b87-196b33df91fd",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "dadc6687-1b63-4c26-8a59-158a74a96f1e",
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
  "created_at": "2026-10-30T09:50:07.951694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fc179786-e8b6-43a4-9b87-196b33df91fd` → **200**

```json
{
  "id": "fc179786-e8b6-43a4-9b87-196b33df91fd",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "dadc6687-1b63-4c26-8a59-158a74a96f1e",
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
  "created_at": "2026-10-30T09:50:07.951694Z",
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

`GET /api/rider/v1/orders/fc179786-e8b6-43a4-9b87-196b33df91fd` → **200**

```json
{
  "id": "fc179786-e8b6-43a4-9b87-196b33df91fd",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "dadc6687-1b63-4c26-8a59-158a74a96f1e",
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
  "created_at": "2026-10-30T09:50:07.951694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/fc179786-e8b6-43a4-9b87-196b33df91fd/switch-to-cash` → **200**

```json
{
  "command_id": "aa5e44cc-bbae-43a8-a885-c9d79069c748",
  "expected_version": 3
}
```

```json
{
  "id": "fc179786-e8b6-43a4-9b87-196b33df91fd",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "dadc6687-1b63-4c26-8a59-158a74a96f1e",
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
  "created_at": "2026-10-30T09:50:07.951694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/fc179786-e8b6-43a4-9b87-196b33df91fd/switch-to-cash` → **409**

```json
{
  "command_id": "148b23a1-4d8a-4638-ba93-67e70710c03c",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/fc179786-e8b6-43a4-9b87-196b33df91fd/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3c9003d9-7eb7-44f3-b60e-15c45fd54a25"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/fc179786-e8b6-43a4-9b87-196b33df91fd` → **200**

```json
{
  "id": "fc179786-e8b6-43a4-9b87-196b33df91fd",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "dadc6687-1b63-4c26-8a59-158a74a96f1e",
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
  "created_at": "2026-10-30T09:50:07.951694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/fc179786-e8b6-43a4-9b87-196b33df91fd/cancel` → **200**

```json
{
  "command_id": "4283e4c1-1cbb-4dba-81a6-bbeff13fb513",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "fc179786-e8b6-43a4-9b87-196b33df91fd",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "dadc6687-1b63-4c26-8a59-158a74a96f1e",
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
  "created_at": "2026-10-30T09:50:07.951694Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
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
  "session_id": "a829c7c0-306f-455b-bbe4-3fd03c5d6b74",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3MTEsImlhdCI6MTc5MzM1MzgxMSwianRpIjoiZjIyOTQyODItYjVhMS00NWUwLWJmODYtYmI3NGVjZmRkZTk1Iiwic2lkIjoiYTgyOWM3YzAtMzA2Zi00NTViLWJiZTQtM2ZkMDNjNWQ2Yjc0In0.hCLQktZgrJ9ofiA1Y7E4DQARj625Y-RPBV-bvMCeses",
  "access_expires_at": "2026-10-30T10:05:11.701514617Z",
  "refresh_token": "B-nQSiFtSlWKyR-6CKvLVu4TzPCZtoLoQ4MeoUcFysE",
  "refresh_expires_at": "2026-10-30T21:50:11.701012371Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-27539"
}
```

```json
{
  "challenge_id": "920b90f5-fe34-46e1-96fa-4b6bdb4a9824",
  "expires_at": "2026-10-30T09:55:11.989395617Z",
  "resend_available_at": "2026-10-30T09:50:12.989395617Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "084466",
  "sent_at": "2026-10-30T09:50:11.992278096Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "920b90f5-fe34-46e1-96fa-4b6bdb4a9824",
  "code": "084466",
  "device_ref": "sandbox-27539"
}
```

```json
{
  "session_id": "6a5b185e-63d2-43d4-8113-69d7e5dcb30f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDcxMiwiaWF0IjoxNzkzMzUzODEyLCJqdGkiOiI5NDkyMzg2MS1jZTJjLTRlM2UtYmJhYi0wMDI2Yzc3OWQ3NWMiLCJzaWQiOiI2YTViMTg1ZS02M2QyLTQzZDQtODExMy02OWQ3ZTVkY2IzMGYifQ.EFiJQcWm06SeVLWshntlzk38ImP5E95JtHU3muj-t98",
  "access_expires_at": "2026-10-30T10:05:12.317761423Z",
  "refresh_token": "-gX023gi0LZ6jtRAjZ890O47VMJPyJqn-CJl6KwZiXc",
  "refresh_expires_at": "2026-11-29T09:50:12.317244308Z",
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
      "actor_id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T09:49:54.949532Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T09:49:56.442708Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "8911ea21-4f40-44e5-b7c7-9bcb645ea326",
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
  "device_ref": "sandbox-28009"
}
```

```json
{
  "challenge_id": "bc3aead6-04ce-4880-a828-393e3072ab55",
  "expires_at": "2026-10-30T09:55:13.488285817Z",
  "resend_available_at": "2026-10-30T09:50:14.488285817Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "877985",
  "sent_at": "2026-10-30T09:50:13.491148735Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc3aead6-04ce-4880-a828-393e3072ab55",
  "code": "877985",
  "device_ref": "sandbox-28009"
}
```

```json
{
  "session_id": "b5e74e27-dffc-4f67-a995-85e31b725eda",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDcxMywiaWF0IjoxNzkzMzUzODEzLCJqdGkiOiI1MmE5ZTE1OS0wYWVhLTQ0NzItYWEzMC04OGUxZDY5NTBlOGEiLCJzaWQiOiJiNWU3NGUyNy1kZmZjLTRmNjctYTk5NS04NWUzMWI3MjVlZGEifQ.2k_AuXLIkO_wnEP76L0aSIxX37_-BwJALH1NtWXs8L8",
  "access_expires_at": "2026-10-30T10:05:13.828339094Z",
  "refresh_token": "92mpPvZHPcrgOGVzZIWoCmQAY11PC1YVyg4KJYAXkb8",
  "refresh_expires_at": "2026-11-29T09:50:13.827689305Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3523ad15-9788-4ec9-9b16-fff6d384627b",
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
  "last_heartbeat_at": "2026-10-30T09:49:35.740883Z",
  "last_location_at": "2026-10-30T09:49:35.740883Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/3523ad15-9788-4ec9-9b16-fff6d384627b/handover` → **200**

```json
{
  "command_id": "30823030-798e-441d-9a22-b0f518e3b0c7",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3523ad15-9788-4ec9-9b16-fff6d384627b",
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
  "last_heartbeat_at": "2026-10-30T09:49:35.740883Z",
  "last_location_at": "2026-10-30T09:49:35.740883Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/3523ad15-9788-4ec9-9b16-fff6d384627b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:50:14Z",
    "sequence": 1793353814737
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3523ad15-9788-4ec9-9b16-fff6d384627b",
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
  "last_heartbeat_at": "2026-10-30T09:50:14.755157Z",
  "last_location_at": "2026-10-30T09:50:14.755157Z",
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
  "command_id": "e625ccce-84f5-4225-857c-68857472b8ad",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:50:15Z",
    "sequence": 1793353815326
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "11bff88d-0a71-4572-99b7-2e1142b32b2a",
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
  "last_heartbeat_at": "2026-10-30T09:50:15.343895Z",
  "last_location_at": "2026-10-30T09:50:15.343895Z",
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
  "session_id": "994bb692-6821-4ee9-8d36-5a0b7b012b86",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3MTUsImlhdCI6MTc5MzM1MzgxNSwianRpIjoiZDdjZDI1N2QtMDg2Ni00OTdkLWI3NWEtYjU0YzMzODYzNGY2Iiwic2lkIjoiOTk0YmI2OTItNjgyMS00ZWU5LThkMzYtNWEwYjdiMDEyYjg2In0.xWtia9n14OdWbr-aoBOzyOsSekdMQXD2uUcklvg15Ps",
  "access_expires_at": "2026-10-30T10:05:15.928688331Z",
  "refresh_token": "G_t5DPXnOH7ZqQqeXPJ6efcWtSl0sBpQBml7H8VkxEM",
  "refresh_expires_at": "2026-10-30T21:50:15.928212704Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2cd4cfa7-a37a-4b13-a503-81adc2fa099e",
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
  "id": "2ce434f0-32c2-450c-b361-f32bf53f1a2a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:55:16.225152Z",
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
  "command_id": "17b6e426-26e6-4674-a313-dbf0563d2f32",
  "quote_id": "2ce434f0-32c2-450c-b361-f32bf53f1a2a",
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
  "id": "627477da-5fee-4471-9b1c-0cfa610b37cb",
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
  "created_at": "2026-10-30T09:50:16.544237Z",
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
    "id": "d2dd53dc-fded-4d31-800c-a02bb55b4bc6",
    "order_id": "627477da-5fee-4471-9b1c-0cfa610b37cb",
    "expires_at": "2026-10-30T09:50:31.547844Z",
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

`POST /api/driver/v1/offers/d2dd53dc-fded-4d31-800c-a02bb55b4bc6/accept` → **200**

```json
{
  "command_id": "2f6c7912-f6df-4c77-9c12-fd8f542f0d69"
}
```

```json
{
  "id": "7cdb609b-225f-484f-97b5-e44243be8991",
  "order_id": "627477da-5fee-4471-9b1c-0cfa610b37cb",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e8003471-3cb0-4366-a2ad-7d228c388d20",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e8003471-3cb0-4366-a2ad-7d228c388d20",
  "order_id": "627477da-5fee-4471-9b1c-0cfa610b37cb",
  "assignment_id": "7cdb609b-225f-484f-97b5-e44243be8991",
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

`POST /api/driver/v1/work-sessions/11bff88d-0a71-4572-99b7-2e1142b32b2a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:50:18Z",
    "sequence": 1793353818128
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "11bff88d-0a71-4572-99b7-2e1142b32b2a",
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
  "last_heartbeat_at": "2026-10-30T09:50:18.031876Z",
  "last_location_at": "2026-10-30T09:50:18.031876Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e8003471-3cb0-4366-a2ad-7d228c388d20/arrive` → **200**

```json
{
  "command_id": "601fc694-5146-4b64-b095-8e2fed8610bc",
  "expected_version": 0
}
```

```json
{
  "id": "e8003471-3cb0-4366-a2ad-7d228c388d20",
  "order_id": "627477da-5fee-4471-9b1c-0cfa610b37cb",
  "assignment_id": "7cdb609b-225f-484f-97b5-e44243be8991",
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
  "arrived_at": "2026-10-30T09:50:18.332337Z",
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

`POST /api/driver/v1/trips/e8003471-3cb0-4366-a2ad-7d228c388d20/start` → **200**

```json
{
  "command_id": "6000dd2d-2685-443e-89c1-879610766585",
  "expected_version": 1
}
```

```json
{
  "id": "e8003471-3cb0-4366-a2ad-7d228c388d20",
  "order_id": "627477da-5fee-4471-9b1c-0cfa610b37cb",
  "assignment_id": "7cdb609b-225f-484f-97b5-e44243be8991",
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
  "arrived_at": "2026-10-30T09:50:18.332337Z",
  "started_at": "2026-10-30T09:50:18.630978Z",
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

`POST /api/driver/v1/trips/e8003471-3cb0-4366-a2ad-7d228c388d20/complete` → **200**

```json
{
  "command_id": "57346c0f-fdbd-4235-98e7-fa15dac9fcd4",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:50:18Z",
  "cash_received": true
}
```

```json
{
  "id": "e8003471-3cb0-4366-a2ad-7d228c388d20",
  "order_id": "627477da-5fee-4471-9b1c-0cfa610b37cb",
  "assignment_id": "7cdb609b-225f-484f-97b5-e44243be8991",
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
  "arrived_at": "2026-10-30T09:50:18.332337Z",
  "started_at": "2026-10-30T09:50:18.630978Z",
  "completed_at": "2026-10-30T09:50:18.944255Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/627477da-5fee-4471-9b1c-0cfa610b37cb` → **200**

```json
{
  "id": "627477da-5fee-4471-9b1c-0cfa610b37cb",
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
    "id": "7cdb609b-225f-484f-97b5-e44243be8991",
    "order_id": "627477da-5fee-4471-9b1c-0cfa610b37cb",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e8003471-3cb0-4366-a2ad-7d228c388d20",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:50:16.544237Z",
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
  "session_id": "3523ad15-9788-4ec9-9b16-fff6d384627b",
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
  "last_heartbeat_at": "2026-10-30T09:50:14.755157Z",
  "last_location_at": "2026-10-30T09:50:14.755157Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3523ad15-9788-4ec9-9b16-fff6d384627b/close` → **200**

```json
{
  "command_id": "ad5147e9-ca9a-4ac7-af95-39b0f942e752",
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
  "session_id": "11bff88d-0a71-4572-99b7-2e1142b32b2a",
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
  "last_heartbeat_at": "2026-10-30T09:50:18.031876Z",
  "last_location_at": "2026-10-30T09:50:18.031876Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/11bff88d-0a71-4572-99b7-2e1142b32b2a/close` → **200**

```json
{
  "command_id": "2581816b-d363-429e-aa23-ca0074062ccd",
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

Done: terminal order 627477da-5fee-4471-9b1c-0cfa610b37cb by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6142"
}
```

```json
{
  "challenge_id": "212b1a4f-5ec5-4f01-aed5-224b9ff9b11b",
  "expires_at": "2026-10-30T09:55:24.021506561Z",
  "resend_available_at": "2026-10-30T09:50:25.021506561Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "224715",
  "sent_at": "2026-10-30T09:50:24.024310702Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "212b1a4f-5ec5-4f01-aed5-224b9ff9b11b",
  "code": "224715",
  "device_ref": "sandbox-6142"
}
```

```json
{
  "session_id": "773f8d4a-e62e-4ad7-8d46-eefc67a12368",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDcyNCwiaWF0IjoxNzkzMzUzODI0LCJqdGkiOiIyMjNhMzQ3MC0yZDcxLTQ5NzktODkxOS1iMjg3ZjY1NDZlMzQiLCJzaWQiOiI3NzNmOGQ0YS1lNjJlLTRhZDctOGQ0Ni1lZWZjNjdhMTIzNjgifQ.Ts6OJvxwakSXo-2t6RMygaO947wqvQSkdCrojSGZW7c",
  "access_expires_at": "2026-10-30T10:05:24.342185571Z",
  "refresh_token": "50QWL5JH7qX6zWoT_LCtYCs7MwoVqmSgFNpgjNQ0KgU",
  "refresh_expires_at": "2026-11-29T09:50:24.341570023Z",
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
  "device_ref": "sandbox-32391"
}
```

```json
{
  "challenge_id": "a38fefc9-aeb3-477d-a984-1ad826f914fb",
  "expires_at": "2026-10-30T09:55:24.922100344Z",
  "resend_available_at": "2026-10-30T09:50:25.922100344Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "377846",
  "sent_at": "2026-10-30T09:50:24.924819826Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a38fefc9-aeb3-477d-a984-1ad826f914fb",
  "code": "377846",
  "device_ref": "sandbox-32391"
}
```

```json
{
  "session_id": "a4a409bd-00b2-4fec-8518-d6d82d551872",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDcyNSwiaWF0IjoxNzkzMzUzODI1LCJqdGkiOiI0YmI0NmM3NS1lOGYzLTQ2YWItYTZiNC0xMmYyZWRlNDhkOGUiLCJzaWQiOiJhNGE0MDliZC0wMGIyLTRmZWMtODUxOC1kNmQ4MmQ1NTE4NzIifQ.xrNVWujXmK4fnXrSvZwLjXVE_j4edWWSYgMOkqjJ3ts",
  "access_expires_at": "2026-10-30T10:05:25.233406435Z",
  "refresh_token": "3o_Uyi1xFDJKGTgkjfiyyM4ZC3waYnZLLXqFGP0MYV8",
  "refresh_expires_at": "2026-11-29T09:50:25.232822606Z",
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
  "device_ref": "sandbox-4096"
}
```

```json
{
  "challenge_id": "16c76e93-8e46-4f3d-b9a5-739e5a362a7c",
  "expires_at": "2026-10-30T09:55:25.798867117Z",
  "resend_available_at": "2026-10-30T09:50:26.798867117Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "347085",
  "sent_at": "2026-10-30T09:50:25.80252752Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "16c76e93-8e46-4f3d-b9a5-739e5a362a7c",
  "code": "347085",
  "device_ref": "sandbox-4096"
}
```

```json
{
  "session_id": "28c9165e-8850-4592-b8ea-2adba1c6e9f1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDcyNiwiaWF0IjoxNzkzMzUzODI2LCJqdGkiOiIyY2Y2OWJiYy04MDgyLTRhN2UtODBiOS01MjNiYjE4OTNmM2EiLCJzaWQiOiIyOGM5MTY1ZS04ODUwLTQ1OTItYjhlYS0yYWRiYTFjNmU5ZjEifQ.YCMub5KU2ExdjMP2NQHQ1u1DPwlfTFnn99c5k9HpIYM",
  "access_expires_at": "2026-10-30T10:05:26.112409658Z",
  "refresh_token": "NmrZ1g3dIvKAWnMtC4NE32RR-3SrQlBh0uuy54IijRU",
  "refresh_expires_at": "2026-11-29T09:50:26.111858918Z",
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
  "phone": "+380690826402",
  "device_ref": "sandbox-2569"
}
```

```json
{
  "challenge_id": "c194de79-4f21-4a18-85e3-ecc9240aa3f6",
  "expires_at": "2026-10-30T09:55:26.692524748Z",
  "resend_available_at": "2026-10-30T09:50:27.692524748Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380690826402` → **200**

```json
{
  "phone": "+380690826402",
  "audience": "CLIENT",
  "code": "770110",
  "sent_at": "2026-10-30T09:50:26.69586591Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c194de79-4f21-4a18-85e3-ecc9240aa3f6",
  "code": "770110",
  "device_ref": "sandbox-2569"
}
```

```json
{
  "session_id": "eb913910-f984-4012-b1ef-bfe53db9acbd",
  "subject": {
    "type": "CLIENT",
    "id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMDNlNTdmNi0xYWM2LTQ5NjctOTZlOC0wNDhiMmRlMmVlYjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NzI3LCJpYXQiOjE3OTMzNTM4MjcsImp0aSI6IjIyODQ0OGIzLTUzN2MtNDRkYS04YmM5LWY0ODk1NDQzZTYzZiIsInNpZCI6ImViOTEzOTEwLWY5ODQtNDAxMi1iMWVmLWJmZTUzZGI5YWNiZCJ9.XBmDZlqeIO9w4_972QfN8DKP8AJSmVBGPhTUINdDEKE",
  "access_expires_at": "2026-10-30T10:05:27.013679046Z",
  "refresh_token": "lG-KmKtWxNgRsFoHQCcHQgeVEq6vY2zCSuOrpK0YH0Q",
  "refresh_expires_at": "2026-11-29T09:50:27.013158365Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4cc06cc4-197e-450d-9834-673c808bda0f",
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
  "id": "d1b36cd0-7365-4403-b79f-f09b075e1c18",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:55:27.309291Z",
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
  "command_id": "31531266-cb83-4a51-b2e2-ddef1028026e",
  "quote_id": "d1b36cd0-7365-4403-b79f-f09b075e1c18",
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
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:27.617251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:50:27.617251Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 12.175725814
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.717135263
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.192064123
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

`GET /api/rider/v1/orders/e01fa29d-7970-45bc-9b9f-fd30c3b4f835` → **200**

```json
{
  "id": "e01fa29d-7970-45bc-9b9f-fd30c3b4f835",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b03e57f6-1ac6-4967-96e8-048b2de2eeb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:50:27.617251Z",
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
  "session_id": "d4d6c42e-7d54-4b0b-9024-0f82673ab73d",
  "subject": {
    "type": "STAFF",
    "id": "f623e6fb-9e8a-433d-a033-eb16e626cf4c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjIzZTZmYi05ZThhLTQzM2QtYTAzMy1lYjE2ZTYyNmNmNGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ5MDksImlhdCI6MTc5MzM1NDAwOSwianRpIjoiYjY2YjVhYzEtYjM0Ny00M2FjLWI2YzUtNDFjMTc3YmY3MTRkIiwic2lkIjoiZDRkNmM0MmUtN2Q1NC00YjBiLTkwMjQtMGY4MjY3M2FiNzNkIn0.n1dTMMJTJxFsPM8F-qEslF9mK0TUwmxzaPPIqQETIeE",
  "access_expires_at": "2026-10-30T10:08:29.499294697Z",
  "refresh_token": "IdICY0cUZbe4JK3koLSWjn1Yum3y6fbjQ9NZV0zNKG8",
  "refresh_expires_at": "2026-10-30T21:53:29.49839296Z",
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
  "id": "1bcb6c1f-3c35-49fe-8a61-189d17fbc057",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:53:29.799707Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:53:29.799742Z",
  "updated_at": "2026-10-30T09:53:29.816567Z",
  "finished_at": "2026-10-30T09:53:29.816567Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/1bcb6c1f-3c35-49fe-8a61-189d17fbc057` → **200**

```json
{
  "run": {
    "id": "1bcb6c1f-3c35-49fe-8a61-189d17fbc057",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T09:53:29.799707Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T09:53:29.799742Z",
    "updated_at": "2026-10-30T09:53:29.816567Z",
    "finished_at": "2026-10-30T09:53:29.816567Z",
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
  "id": "1bcb6c1f-3c35-49fe-8a61-189d17fbc057",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:53:29.799707Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:53:29.799742Z",
  "updated_at": "2026-10-30T09:53:29.816567Z",
  "finished_at": "2026-10-30T09:53:29.816567Z",
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
  "id": "1bcb6c1f-3c35-49fe-8a61-189d17fbc057",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:53:29.799707Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:53:29.799742Z",
  "updated_at": "2026-10-30T09:53:29.816567Z",
  "finished_at": "2026-10-30T09:53:29.816567Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/00b07fea-a301-4f95-a021-ee7d9a4cfc8c` → **204**

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
  "id": "a8299eb2-3017-4446-98ec-ba0d8e0346a8",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:53:30.30137Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:53:30.301403Z",
  "updated_at": "2026-10-30T09:53:30.308999Z",
  "finished_at": "2026-10-30T09:53:30.308999Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/a8299eb2-3017-4446-98ec-ba0d8e0346a8` → **200**

```json
{
  "run": {
    "id": "a8299eb2-3017-4446-98ec-ba0d8e0346a8",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T09:53:30.30137Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T09:53:30.301403Z",
    "updated_at": "2026-10-30T09:53:30.308999Z",
    "finished_at": "2026-10-30T09:53:30.308999Z",
    "version": 1
  },
  "items": [
    {
      "id": "b66e35eb-4f1a-4996-8330-0c83e86740ae",
      "run_id": "a8299eb2-3017-4446-98ec-ba0d8e0346a8",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "96875a3d62d329d29f588ec248adf580d0b348cc41454eb4c9ce3733f19be912",
      "reference_display": "sandbox-reconciliation-00b07fea-a301-4f95-a021-ee7d9a4cfc8c",
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
      "provider_at": "2026-10-30T09:53:30Z",
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
  "id": "a8299eb2-3017-4446-98ec-ba0d8e0346a8",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:53:30.30137Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:53:30.301403Z",
  "updated_at": "2026-10-30T09:53:30.308999Z",
  "finished_at": "2026-10-30T09:53:30.308999Z",
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
  "id": "a8299eb2-3017-4446-98ec-ba0d8e0346a8",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:53:30.30137Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:53:30.301403Z",
  "updated_at": "2026-10-30T09:53:30.308999Z",
  "finished_at": "2026-10-30T09:53:30.308999Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/b66e35eb-4f1a-4996-8330-0c83e86740ae/resolve` → **200**

```json
{
  "command_id": "da52e193-3b74-41e5-aee2-e4ebabc3056c",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "b66e35eb-4f1a-4996-8330-0c83e86740ae",
  "run_id": "a8299eb2-3017-4446-98ec-ba0d8e0346a8",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "96875a3d62d329d29f588ec248adf580d0b348cc41454eb4c9ce3733f19be912",
  "reference_display": "sandbox-reconciliation-00b07fea-a301-4f95-a021-ee7d9a4cfc8c",
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
  "provider_at": "2026-10-30T09:53:30Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "resolved_at": "2026-10-30T09:53:30.733436Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/b66e35eb-4f1a-4996-8330-0c83e86740ae/resolve` → **200**

```json
{
  "command_id": "da52e193-3b74-41e5-aee2-e4ebabc3056c",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "b66e35eb-4f1a-4996-8330-0c83e86740ae",
  "run_id": "a8299eb2-3017-4446-98ec-ba0d8e0346a8",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "96875a3d62d329d29f588ec248adf580d0b348cc41454eb4c9ce3733f19be912",
  "reference_display": "sandbox-reconciliation-00b07fea-a301-4f95-a021-ee7d9a4cfc8c",
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
  "provider_at": "2026-10-30T09:53:30Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
  "resolved_at": "2026-10-30T09:53:30.733436Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/b66e35eb-4f1a-4996-8330-0c83e86740ae/resolve` → **409**

```json
{
  "command_id": "1d620c54-66bd-4fca-8bee-e2f9f75610e2",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/b66e35eb-4f1a-4996-8330-0c83e86740ae/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c1e6d777-f213-4b80-921f-b85b64e508f6"
}
```

`GET /api/admin/v1/payment-reconciliations/a8299eb2-3017-4446-98ec-ba0d8e0346a8` → **200**

```json
{
  "run": {
    "id": "a8299eb2-3017-4446-98ec-ba0d8e0346a8",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T09:53:30.30137Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T09:53:30.301403Z",
    "updated_at": "2026-10-30T09:53:30.733436Z",
    "finished_at": "2026-10-30T09:53:30.308999Z",
    "version": 2
  },
  "items": [
    {
      "id": "b66e35eb-4f1a-4996-8330-0c83e86740ae",
      "run_id": "a8299eb2-3017-4446-98ec-ba0d8e0346a8",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "96875a3d62d329d29f588ec248adf580d0b348cc41454eb4c9ce3733f19be912",
      "reference_display": "sandbox-reconciliation-00b07fea-a301-4f95-a021-ee7d9a4cfc8c",
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
      "provider_at": "2026-10-30T09:53:30Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "f623e6fb-9e8a-433d-a033-eb16e626cf4c",
      "resolved_at": "2026-10-30T09:53:30.733436Z",
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
      "id": "a8299eb2-3017-4446-98ec-ba0d8e0346a8",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T09:53:30.30137Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T09:53:30.301403Z",
      "updated_at": "2026-10-30T09:53:30.733436Z",
      "finished_at": "2026-10-30T09:53:30.308999Z",
      "version": 2
    },
    {
      "id": "0a6df6b2-8c4a-4a2a-9ea9-61fa218d64fb",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T09:45:05.840828Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T09:45:05.840902Z",
      "updated_at": "2026-10-30T09:45:05.855186Z",
      "finished_at": "2026-10-30T09:45:05.855186Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/00b07fea-a301-4f95-a021-ee7d9a4cfc8c` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "a8299eb2-3017-4446-98ec-ba0d8e0346a8",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:53:30.30137Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:53:30.301403Z",
  "updated_at": "2026-10-30T09:53:30.733436Z",
  "finished_at": "2026-10-30T09:53:30.308999Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793354136029E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793354136328E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793354136329E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793354136059E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793354136329E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
