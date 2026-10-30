# Sandbox transcript (2026-10-30T12:41:30Z, b13d904)

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
  "correlation_id": "fe5850e3-0623-44fc-aa38-ebb35898240b"
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
  "session_id": "91ad8ad0-b1c0-4d24-82ea-bb4003e7688a",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ5OTcsImlhdCI6MTc5MzM2NDA5NywianRpIjoiYzlmNzQ1ZjUtMTI0Yy00OWQxLTg1ZGYtZjBkNThmNzJhMjRmIiwic2lkIjoiOTFhZDhhZDAtYjFjMC00ZDI0LTgyZWEtYmI0MDAzZTc2ODhhIn0.Q7JYIVmb7SYFZqJfza1YuLT0K0jEgzwjYlOegcFH30M",
  "access_expires_at": "2026-10-30T12:56:37.521752882Z",
  "refresh_token": "j4X7UnPmT-PcIM6GZ4PFJ3qnrzfHl6PGsK_JLBR9Bzg",
  "refresh_expires_at": "2026-10-31T00:41:37.519862602Z",
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
  "session_id": "a117e511-ff4e-41d4-9598-c7784f97ec8a",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjQ5OTksImlhdCI6MTc5MzM2NDA5OSwianRpIjoiMTA2OTNiZmItMTVmYy00NTExLWJkZTUtYjYwYTc2ZjY5OGRjIiwic2lkIjoiYTExN2U1MTEtZmY0ZS00MWQ0LTk1OTgtYzc3ODRmOTdlYzhhIn0.8yzxLn2qTRi_42dwn7lWKnQgpJlOzLTwx2UdtNm6fbE",
  "access_expires_at": "2026-10-30T12:56:39.139975862Z",
  "refresh_token": "wleS6A79PiLbx915oK96S58o6vm-RIF5M63TXM94idw",
  "refresh_expires_at": "2026-10-31T00:41:39.139075533Z",
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
  "device_ref": "sandbox-22654"
}
```

```json
{
  "challenge_id": "98a97b44-9cc8-44d4-87b6-ca911c4ac724",
  "expires_at": "2026-10-30T12:46:39.632271052Z",
  "resend_available_at": "2026-10-30T12:41:40.632271052Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "606411",
  "sent_at": "2026-10-30T12:41:39.641968744Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98a97b44-9cc8-44d4-87b6-ca911c4ac724",
  "code": "606411",
  "device_ref": "sandbox-22654"
}
```

```json
{
  "session_id": "ae84e1a8-31ba-45f0-a00f-364b426f18c5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NDk5OSwiaWF0IjoxNzkzMzY0MDk5LCJqdGkiOiIzNDQwZDM3OS1mMmZmLTQ4NWMtOTA5OC02YTczZTcyNzdmZGEiLCJzaWQiOiJhZTg0ZTFhOC0zMWJhLTQ1ZjAtYTAwZi0zNjRiNDI2ZjE4YzUifQ.t1GtF6skPdFsgLz2w70JwcbKkM24k1UJ4SpafB7623M",
  "access_expires_at": "2026-10-30T12:56:39.933878114Z",
  "refresh_token": "Xh1tGuHwDuYLNZo5ZNb_8M6pCTfMDMlDV5tluSsaOd8",
  "refresh_expires_at": "2026-11-29T12:41:39.932989253Z",
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
  "command_id": "a8764007-4353-40ee-9c11-6143f3b441a1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:41:40Z",
    "sequence": 1793364100402
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4cf76b04-ae49-4096-a84f-df2294185291",
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
  "last_heartbeat_at": "2026-10-30T12:41:40.499662Z",
  "last_location_at": "2026-10-30T12:41:40.499662Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631902122",
  "device_ref": "sandbox-23798"
}
```

```json
{
  "challenge_id": "15ddcb55-d7f2-48ed-9193-524ef6ec4a10",
  "expires_at": "2026-10-30T12:46:40.737553882Z",
  "resend_available_at": "2026-10-30T12:41:41.737553882Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631902122` → **200**

```json
{
  "phone": "+380631902122",
  "audience": "CLIENT",
  "code": "736091",
  "sent_at": "2026-10-30T12:41:40.741665Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "15ddcb55-d7f2-48ed-9193-524ef6ec4a10",
  "code": "736091",
  "device_ref": "sandbox-23798"
}
```

```json
{
  "session_id": "062f0c5c-c731-463f-8dcd-bc55a96c8ab1",
  "subject": {
    "type": "CLIENT",
    "id": "6204ec7c-6cd7-4de5-9320-7f26077b02a5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MjA0ZWM3Yy02Y2Q3LTRkZTUtOTMyMC03ZjI2MDc3YjAyYTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1MDAwLCJpYXQiOjE3OTMzNjQxMDAsImp0aSI6IjU1OGZhOTkzLTZjNTgtNDA1NC04Nzg4LTg5YzJiY2E1ZGRjMSIsInNpZCI6IjA2MmYwYzVjLWM3MzEtNDYzZi04ZGNkLWJjNTVhOTZjOGFiMSJ9.v52D_n7eFKY31d0dMCcA6k-zCXUsp5UDBKv44ALG2vs",
  "access_expires_at": "2026-10-30T12:56:40.981263543Z",
  "refresh_token": "i2ROGhXW-0DzPmHzv3SnGOyNL_bMzIIjjihqyt-uces",
  "refresh_expires_at": "2026-11-29T12:41:40.980467308Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e9f10893-05aa-437f-a616-2b56c868aba6",
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
  "id": "38749110-67aa-4798-91a0-01007d5d6f7e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:46:41.241147Z",
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
  "command_id": "22b4c418-3883-4367-9041-2dabbd405eb6",
  "quote_id": "38749110-67aa-4798-91a0-01007d5d6f7e",
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
  "id": "359e58f6-806f-4437-b9a2-3eb792562ccc",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6204ec7c-6cd7-4de5-9320-7f26077b02a5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:41.545882Z",
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
    "id": "b87fd1ed-b229-4bb4-96d9-7320cff144a5",
    "order_id": "359e58f6-806f-4437-b9a2-3eb792562ccc",
    "expires_at": "2026-10-30T12:41:56.553701Z",
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

`POST /api/driver/v1/offers/b87fd1ed-b229-4bb4-96d9-7320cff144a5/accept` → **200**

```json
{
  "command_id": "8ef42cfc-01f0-46a5-b4f8-4e8f159e2215"
}
```

```json
{
  "id": "aab9efe0-9838-4656-b162-1cf16f646d54",
  "order_id": "359e58f6-806f-4437-b9a2-3eb792562ccc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "46bc4265-03ef-4e07-9045-0471232f0b93",
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
  "command_id": "8cf034c9-275b-43e0-9582-c7ff4ec6ed78",
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
  "changed_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T12:41:42.566228308Z"
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
  "id": "46bc4265-03ef-4e07-9045-0471232f0b93",
  "order_id": "359e58f6-806f-4437-b9a2-3eb792562ccc",
  "assignment_id": "aab9efe0-9838-4656-b162-1cf16f646d54",
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

`POST /api/driver/v1/work-sessions/4cf76b04-ae49-4096-a84f-df2294185291/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:41:43Z",
    "sequence": 1793364103300
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4cf76b04-ae49-4096-a84f-df2294185291",
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
  "last_heartbeat_at": "2026-10-30T12:41:43.321993Z",
  "last_location_at": "2026-10-30T12:41:43.321993Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/46bc4265-03ef-4e07-9045-0471232f0b93/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "a52e9456-49b1-4c3f-b79c-40757eeba2f6",
  "expected_version": 0
}
```

```json
{
  "id": "46bc4265-03ef-4e07-9045-0471232f0b93",
  "order_id": "359e58f6-806f-4437-b9a2-3eb792562ccc",
  "assignment_id": "aab9efe0-9838-4656-b162-1cf16f646d54",
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
  "arrived_at": "2026-10-30T12:41:43.565499Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/46bc4265-03ef-4e07-9045-0471232f0b93/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "62800bd3-097a-4871-b1fd-3ccb290dfea3",
  "expected_version": 1
}
```

```json
{
  "id": "46bc4265-03ef-4e07-9045-0471232f0b93",
  "order_id": "359e58f6-806f-4437-b9a2-3eb792562ccc",
  "assignment_id": "aab9efe0-9838-4656-b162-1cf16f646d54",
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
  "arrived_at": "2026-10-30T12:41:43.565499Z",
  "started_at": "2026-10-30T12:41:43.808694Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/46bc4265-03ef-4e07-9045-0471232f0b93/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "aa1908a4-8e33-437f-9117-2ab1cc7aaf0a",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:41:44Z",
  "cash_received": true
}
```

```json
{
  "id": "46bc4265-03ef-4e07-9045-0471232f0b93",
  "order_id": "359e58f6-806f-4437-b9a2-3eb792562ccc",
  "assignment_id": "aab9efe0-9838-4656-b162-1cf16f646d54",
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
  "arrived_at": "2026-10-30T12:41:43.565499Z",
  "started_at": "2026-10-30T12:41:43.808694Z",
  "completed_at": "2026-10-30T12:41:44.057733Z",
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
  "session_id": "4cf76b04-ae49-4096-a84f-df2294185291",
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
  "last_heartbeat_at": "2026-10-30T12:41:43.321993Z",
  "last_location_at": "2026-10-30T12:41:43.321993Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4cf76b04-ae49-4096-a84f-df2294185291/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "6832aa4d-c7a1-4677-9914-73f38f1bcdad",
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
  "command_id": "83e9010d-8ac0-4dfa-8b63-3557fb7ebeba",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:41:44Z",
    "sequence": 1793364104771
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
  "correlation_id": "f8f4e376-40bc-45c0-8c92-f0a5a469d93c",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "6c0d54b2-244f-4f0b-870e-3ab200dfa561",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:41:45Z",
    "sequence": 1793364105231
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "847b7640-9a54-4194-a013-dc6538dce8f2",
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
  "last_heartbeat_at": "2026-10-30T12:41:45.041398Z",
  "last_location_at": "2026-10-30T12:41:45.041398Z",
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
  "changed_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T12:41:42.566228Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "1c6c5ffb-d78c-4207-b120-ac8d92e055f5",
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
  "changed_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T12:41:45.505059171Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "847b7640-9a54-4194-a013-dc6538dce8f2",
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
  "last_heartbeat_at": "2026-10-30T12:41:45.041398Z",
  "last_location_at": "2026-10-30T12:41:45.041398Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/847b7640-9a54-4194-a013-dc6538dce8f2/close` → **200**

```json
{
  "command_id": "ba498d28-579b-4d82-b6c3-91049f47b22b",
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
  "session_id": "c0d0eb56-625b-413a-bc8f-f3e3fba4b178",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjUwMDYsImlhdCI6MTc5MzM2NDEwNiwianRpIjoiZDQyMzVlNjctNzVjNi00NDFiLTk2OGEtNjQ2ODE2ZTNhYWEwIiwic2lkIjoiYzBkMGViNTYtNjI1Yi00MTNhLWJjOGYtZjNlM2ZiYTRiMTc4In0.o638e6dQrhg4-aZebLbbrjgNTDZRYPJ7rQrdRiecBzk",
  "access_expires_at": "2026-10-30T12:56:46.473757833Z",
  "refresh_token": "YDGkOSrdnfKv891jGUM4qpOPIVjXBZCSC5drGwCQSVk",
  "refresh_expires_at": "2026-10-31T00:41:46.473127423Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "34c77141-e444-47f5-9f22-e019b8598396",
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
  "id": "26b9639b-67ba-4fc1-917f-61d3827e7c63",
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
  "created_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "created_at": "2026-10-30T12:41:46.707428Z",
  "updated_at": "2026-10-30T12:41:46.707428Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635678366",
  "device_ref": "sandbox-25359"
}
```

```json
{
  "challenge_id": "6858b71f-8587-4a8e-977d-6d6dd99b0672",
  "expires_at": "2026-10-30T12:46:46.979224158Z",
  "resend_available_at": "2026-10-30T12:41:47.979224158Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635678366` → **200**

```json
{
  "phone": "+380635678366",
  "audience": "CLIENT",
  "code": "437924",
  "sent_at": "2026-10-30T12:41:46.982605837Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6858b71f-8587-4a8e-977d-6d6dd99b0672",
  "code": "437924",
  "device_ref": "sandbox-25359"
}
```

```json
{
  "session_id": "43d106c3-faeb-4195-b78c-a3145eb1dee8",
  "subject": {
    "type": "CLIENT",
    "id": "1cf8f2e4-9ef7-4a46-889c-639e4e2dd3ac"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxY2Y4ZjJlNC05ZWY3LTRhNDYtODg5Yy02MzllNGUyZGQzYWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1MDA3LCJpYXQiOjE3OTMzNjQxMDcsImp0aSI6ImNiYjZkZjgyLTJkYWQtNGIyOC05MzNkLTIwYjE1MjJhMzE1MSIsInNpZCI6IjQzZDEwNmMzLWZhZWItNDE5NS1iNzhjLWEzMTQ1ZWIxZGVlOCJ9.f3iCKuIEMYm7z5utHG2vCBnhoaCSqZ3n8iLnOpbWuFE",
  "access_expires_at": "2026-10-30T12:56:47.225094994Z",
  "refresh_token": "yuHy8tI4DrTpfn0sm-EeZ-Daep5cAlIYQ-48b04WM3c",
  "refresh_expires_at": "2026-11-29T12:41:47.224455441Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380635678366` → **200**

```json
{
  "client_id": "1cf8f2e4-9ef7-4a46-889c-639e4e2dd3ac"
}
```

`POST /api/admin/v1/rider-wallets/1cf8f2e4-9ef7-4a46-889c-639e4e2dd3ac/top-ups` → **201**

```json
{
  "command_id": "2177e278-4180-469a-ab98-cb499d3c9975",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "1cf8f2e4-9ef7-4a46-889c-639e4e2dd3ac",
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
      "id": "1ced6062-d334-4458-b9ff-6ee56c40d925",
      "at": "2026-10-30T12:41:47.689893Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "47d9a790-78c4-455c-bb4c-244de91c5aa4",
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
  "id": "a714026c-3401-457a-bcd9-567212cac28c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:46:47.936827Z",
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
      "id": "26b9639b-67ba-4fc1-917f-61d3827e7c63",
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
  "device_ref": "sandbox-11702"
}
```

```json
{
  "challenge_id": "17b3b716-39b3-42c4-b8d7-8885bff9a034",
  "expires_at": "2026-10-30T12:46:48.176658515Z",
  "resend_available_at": "2026-10-30T12:41:49.176658515Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "817145",
  "sent_at": "2026-10-30T12:41:48.180211627Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "17b3b716-39b3-42c4-b8d7-8885bff9a034",
  "code": "817145",
  "device_ref": "sandbox-11702"
}
```

```json
{
  "session_id": "210c5659-462f-4703-b1e6-82ef1a5534da",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTAwOCwiaWF0IjoxNzkzMzY0MTA4LCJqdGkiOiI1ZTVkY2NkZS05ODdiLTQ0OTUtOGNhNS1jODJjMTRhOGYzYTEiLCJzaWQiOiIyMTBjNTY1OS00NjJmLTQ3MDMtYjFlNi04MmVmMWE1NTM0ZGEifQ.oHEyzovrIL0WSjXrHzUKzp6nC9AqjWWM8pe8k-Ynjuk",
  "access_expires_at": "2026-10-30T12:56:48.438507938Z",
  "refresh_token": "Z-KhT4IVy3j-w2OvXyJyrHFEMaD4nq-X02xpyZ3iKvY",
  "refresh_expires_at": "2026-11-29T12:41:48.437854514Z",
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
  "command_id": "0f639f53-b893-4156-a448-30dad1f0a02f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:41:48Z",
    "sequence": 1793364108897
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cbbc0faf-c642-463c-8eae-c2a6431ecdc0",
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
  "last_heartbeat_at": "2026-10-30T12:41:48.914755Z",
  "last_location_at": "2026-10-30T12:41:48.914755Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "da8d6599-464b-4427-9199-87ab943e3cc7",
  "quote_id": "a714026c-3401-457a-bcd9-567212cac28c",
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
  "id": "7053908e-dbd5-49be-9ea8-a40ca4fe54ec",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1cf8f2e4-9ef7-4a46-889c-639e4e2dd3ac",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:41:49.161569Z",
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
  "client_id": "1cf8f2e4-9ef7-4a46-889c-639e4e2dd3ac",
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
      "id": "1ced6062-d334-4458-b9ff-6ee56c40d925",
      "at": "2026-10-30T12:41:47.689893Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
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
    "id": "a9a28f0c-9fbc-47fd-9692-9ecf1a7e3fa1",
    "order_id": "7053908e-dbd5-49be-9ea8-a40ca4fe54ec",
    "expires_at": "2026-10-30T12:42:04.168104Z",
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

`POST /api/driver/v1/offers/a9a28f0c-9fbc-47fd-9692-9ecf1a7e3fa1/accept` → **200**

```json
{
  "command_id": "f70ad52c-f1eb-43b9-8547-c19af5049e20"
}
```

```json
{
  "id": "717a18ab-8dee-4bcb-a049-73d66cb6cc38",
  "order_id": "7053908e-dbd5-49be-9ea8-a40ca4fe54ec",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8a014ab2-7fc4-40db-85f8-efbffe93dea7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8a014ab2-7fc4-40db-85f8-efbffe93dea7",
  "order_id": "7053908e-dbd5-49be-9ea8-a40ca4fe54ec",
  "assignment_id": "717a18ab-8dee-4bcb-a049-73d66cb6cc38",
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

`POST /api/driver/v1/work-sessions/cbbc0faf-c642-463c-8eae-c2a6431ecdc0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:41:52Z",
    "sequence": 1793364112671
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cbbc0faf-c642-463c-8eae-c2a6431ecdc0",
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
  "last_heartbeat_at": "2026-10-30T12:41:52.689652Z",
  "last_location_at": "2026-10-30T12:41:52.689652Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/8a014ab2-7fc4-40db-85f8-efbffe93dea7/arrive` → **200**

```json
{
  "command_id": "753d32bb-d527-418c-8766-ceeb6b2835d7",
  "expected_version": 0
}
```

```json
{
  "id": "8a014ab2-7fc4-40db-85f8-efbffe93dea7",
  "order_id": "7053908e-dbd5-49be-9ea8-a40ca4fe54ec",
  "assignment_id": "717a18ab-8dee-4bcb-a049-73d66cb6cc38",
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
  "arrived_at": "2026-10-30T12:41:52.949711Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8a014ab2-7fc4-40db-85f8-efbffe93dea7/start` → **200**

```json
{
  "command_id": "e70da213-28e9-4f6d-9e11-c00ddc62dcb8",
  "expected_version": 1
}
```

```json
{
  "id": "8a014ab2-7fc4-40db-85f8-efbffe93dea7",
  "order_id": "7053908e-dbd5-49be-9ea8-a40ca4fe54ec",
  "assignment_id": "717a18ab-8dee-4bcb-a049-73d66cb6cc38",
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
  "arrived_at": "2026-10-30T12:41:52.949711Z",
  "started_at": "2026-10-30T12:41:53.195672Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/8a014ab2-7fc4-40db-85f8-efbffe93dea7/complete` → **200**

```json
{
  "command_id": "0099448c-a71e-4eb7-a2f4-969693cb0b81",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:41:53Z",
  "cash_received": true
}
```

```json
{
  "id": "8a014ab2-7fc4-40db-85f8-efbffe93dea7",
  "order_id": "7053908e-dbd5-49be-9ea8-a40ca4fe54ec",
  "assignment_id": "717a18ab-8dee-4bcb-a049-73d66cb6cc38",
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
  "arrived_at": "2026-10-30T12:41:52.949711Z",
  "started_at": "2026-10-30T12:41:53.195672Z",
  "completed_at": "2026-10-30T12:41:53.446137Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "1cf8f2e4-9ef7-4a46-889c-639e4e2dd3ac",
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
      "id": "1983bd51-bf1e-46d0-a460-381ac247ddf5",
      "at": "2026-10-30T12:41:54.102793Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "7053908e-dbd5-49be-9ea8-a40ca4fe54ec"
    },
    {
      "id": "1ced6062-d334-4458-b9ff-6ee56c40d925",
      "at": "2026-10-30T12:41:47.689893Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/26b9639b-67ba-4fc1-917f-61d3827e7c63/archive` → **200**

```json
{
  "command_id": "11a62431-b9d8-46ce-a2d3-565f00aac351",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "26b9639b-67ba-4fc1-917f-61d3827e7c63",
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
  "created_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "created_at": "2026-10-30T12:41:46.707428Z",
  "updated_at": "2026-10-30T12:41:56.940396Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cbbc0faf-c642-463c-8eae-c2a6431ecdc0",
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
  "last_heartbeat_at": "2026-10-30T12:41:52.689652Z",
  "last_location_at": "2026-10-30T12:41:52.689652Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cbbc0faf-c642-463c-8eae-c2a6431ecdc0/close` → **200**

```json
{
  "command_id": "94bace8d-9a80-41dd-85cb-f3bce7f02ec1",
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

Done: order 7053908e-dbd5-49be-9ea8-a40ca4fe54ec.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-23162"
}
```

```json
{
  "challenge_id": "a1908f9d-5929-4a09-a13a-71c45474692b",
  "expires_at": "2026-10-30T12:46:57.650445791Z",
  "resend_available_at": "2026-10-30T12:41:58.650445791Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "097837",
  "sent_at": "2026-10-30T12:41:57.654356401Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a1908f9d-5929-4a09-a13a-71c45474692b",
  "code": "097837",
  "device_ref": "sandbox-23162"
}
```

```json
{
  "session_id": "6ac5b251-f943-44e5-8dac-12aed37549b4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTAxNywiaWF0IjoxNzkzMzY0MTE3LCJqdGkiOiJkZTgxYjc4ZC01NWNkLTQ4N2EtOThjZi1lZDAzZmM3MWRmODEiLCJzaWQiOiI2YWM1YjI1MS1mOTQzLTQ0ZTUtOGRhYy0xMmFlZDM3NTQ5YjQifQ.LKk3TqSFJRztEmfvb6QYQnvxaJlKQtuoRkc0QYlk4Ow",
  "access_expires_at": "2026-10-30T12:56:57.903805437Z",
  "refresh_token": "tm4Sio8nImAvzlA0VMX46FKxoRyHPD9IM4cKMAgR32A",
  "refresh_expires_at": "2026-11-29T12:41:57.903189689Z",
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
  "command_id": "c53797ba-9538-4692-a4c9-6a40ef30ef85",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:41:58Z",
    "sequence": 1793364118580
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "58380922-9479-445b-89a4-6a7b609b9d61",
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
  "last_heartbeat_at": "2026-10-30T12:41:58.599646Z",
  "last_location_at": "2026-10-30T12:41:58.599646Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/58380922-9479-445b-89a4-6a7b609b9d61/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:42:03Z",
    "sequence": 1793364123827
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "58380922-9479-445b-89a4-6a7b609b9d61",
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
  "last_heartbeat_at": "2026-10-30T12:42:03.844929Z",
  "last_location_at": "2026-10-30T12:41:58.599646Z",
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
  "session_id": "4592510d-d011-4404-9a87-4be44f293ae6",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjUwMjQsImlhdCI6MTc5MzM2NDEyNCwianRpIjoiMTBjYzAzMDAtMDEwYS00NzU1LWI3NDQtNjQ3NGI1NmI1ZjIwIiwic2lkIjoiNDU5MjUxMGQtZDAxMS00NDA0LTlhODctNGJlNDRmMjkzYWU2In0.H4MGi1iuo2O_35WzBy6kVhop5VGoWTTWUl07Tz_NVOc",
  "access_expires_at": "2026-10-30T12:57:04.342926743Z",
  "refresh_token": "OktWZSK9S1OPv7Xd6z66pM7G-kOeHzj5Xkuq3eLw1ww",
  "refresh_expires_at": "2026-10-31T00:42:04.342433115Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T12:42:04.565701674Z",
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
      "last_location_at": "2026-10-30T12:41:58.599646Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/58380922-9479-445b-89a4-6a7b609b9d61/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:42:04Z",
    "sequence": 1793364124806
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "58380922-9479-445b-89a4-6a7b609b9d61",
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
  "last_heartbeat_at": "2026-10-30T12:42:04.82422Z",
  "last_location_at": "2026-10-30T12:42:04.82422Z",
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
  "session_id": "58380922-9479-445b-89a4-6a7b609b9d61",
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
  "last_heartbeat_at": "2026-10-30T12:42:04.82422Z",
  "last_location_at": "2026-10-30T12:42:04.82422Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/58380922-9479-445b-89a4-6a7b609b9d61/close` → **200**

```json
{
  "command_id": "0ca03a12-1847-4b7c-96f0-86437bb4d322",
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
  "device_ref": "sandbox-8210"
}
```

```json
{
  "challenge_id": "a65441e7-52b4-4170-aea6-27a8bd1463b4",
  "expires_at": "2026-10-30T12:47:05.526126926Z",
  "resend_available_at": "2026-10-30T12:42:06.526126926Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "226856",
  "sent_at": "2026-10-30T12:42:05.529846473Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a65441e7-52b4-4170-aea6-27a8bd1463b4",
  "code": "226856",
  "device_ref": "sandbox-8210"
}
```

```json
{
  "session_id": "d4579d61-71e5-4584-b969-25a9216b2b73",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTAyNSwiaWF0IjoxNzkzMzY0MTI1LCJqdGkiOiJiMjJlZjllNi1iODMzLTRkNmYtYWJkZi1hNzQ1Zjg2ODJkNzMiLCJzaWQiOiJkNDU3OWQ2MS03MWU1LTQ1ODQtYjk2OS0yNWE5MjE2YjJiNzMifQ.siVH3y7V0V7tC76lYXKxoOzpdqTQXrHYfq1a3XInNWU",
  "access_expires_at": "2026-10-30T12:57:05.779695494Z",
  "refresh_token": "wu0EaNyzs2RMsXIIEQxfbw_DJM1avJLHySKVsqE4gCM",
  "refresh_expires_at": "2026-11-29T12:42:05.779151201Z",
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
  "device_ref": "sandbox-21852"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "7af5e941-24b0-469d-aea3-c89b1830c961",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-21852"
}
```

```json
{
  "challenge_id": "e98d5c8b-6c6f-44be-9083-561d3c51e93e",
  "expires_at": "2026-10-30T12:47:07.4518977Z",
  "resend_available_at": "2026-10-30T12:42:08.4518977Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "783685",
  "sent_at": "2026-10-30T12:42:07.455039205Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e98d5c8b-6c6f-44be-9083-561d3c51e93e",
  "code": "783685",
  "device_ref": "sandbox-21852"
}
```

```json
{
  "session_id": "803a5059-2aea-444e-9c5e-b228949531c4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTAyNywiaWF0IjoxNzkzMzY0MTI3LCJqdGkiOiI2NzVlN2JlMS1hY2I2LTQ4OWQtOTUzMi00OTA0ZDc5YWZlNmQiLCJzaWQiOiI4MDNhNTA1OS0yYWVhLTQ0NGUtOWM1ZS1iMjI4OTQ5NTMxYzQifQ.nKvxtm_tnJsGql5gGjbzAfrw82CVuKWT9h6j7kFXxMg",
  "access_expires_at": "2026-10-30T12:57:07.703995168Z",
  "refresh_token": "32mAoigOo4xpMQ_zKdPKpQRC5NF9ebtxCcd9E6f9XPU",
  "refresh_expires_at": "2026-11-29T12:42:07.703416535Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-18530"
}
```

```json
{
  "challenge_id": "f08f6cb2-7a18-4b7c-8723-5c30cc7ee7e3",
  "expires_at": "2026-10-30T12:47:07.924396595Z",
  "resend_available_at": "2026-10-30T12:42:08.924396595Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "087329",
  "sent_at": "2026-10-30T12:42:07.92760013Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f08f6cb2-7a18-4b7c-8723-5c30cc7ee7e3",
  "code": "087329",
  "device_ref": "sandbox-18530"
}
```

```json
{
  "session_id": "a4c1eeea-e732-4f47-b836-6ef8a320e430",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTAyOCwiaWF0IjoxNzkzMzY0MTI4LCJqdGkiOiJkYTgwNzBhNy05MzBiLTRkZGUtYjRlOC03OGNiNzRlNDkzMTEiLCJzaWQiOiJhNGMxZWVlYS1lNzMyLTRmNDctYjgzNi02ZWY4YTMyMGU0MzAifQ.XWuuQ2X6wcx3xg8Y2o72pKKA73PxAYc_EAfI6PIhZnU",
  "access_expires_at": "2026-10-30T12:57:08.173482569Z",
  "refresh_token": "JJ_IIqT4CMjy_kWCYX8SB7r7YPiNqMvfF4j5Y7SvJVk",
  "refresh_expires_at": "2026-11-29T12:42:08.172980318Z",
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

(the car drives 184 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "056f98d2-e26c-460d-bc73-ea52609ea084",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:45:12Z",
    "sequence": 1793364312847
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "184559a9-d87f-4df0-9e5d-ce8371c327c9",
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
  "last_heartbeat_at": "2026-10-30T12:45:12.86523Z",
  "last_location_at": "2026-10-30T12:45:12.86523Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600089925",
  "device_ref": "sandbox-28066"
}
```

```json
{
  "challenge_id": "d7fbbc37-229b-41d7-a6b2-e8321bf42560",
  "expires_at": "2026-10-30T12:50:13.10305813Z",
  "resend_available_at": "2026-10-30T12:45:14.10305813Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600089925` → **200**

```json
{
  "phone": "+48600089925",
  "audience": "CLIENT",
  "code": "727443",
  "sent_at": "2026-10-30T12:45:13.10632002Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d7fbbc37-229b-41d7-a6b2-e8321bf42560",
  "code": "727443",
  "device_ref": "sandbox-28066"
}
```

```json
{
  "session_id": "1c119451-d39a-4405-89d0-3e0a9f419065",
  "subject": {
    "type": "CLIENT",
    "id": "5cfdd3ab-3b76-48aa-9446-4eb824be519c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1Y2ZkZDNhYi0zYjc2LTQ4YWEtOTQ0Ni00ZWI4MjRiZTUxOWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1MjEzLCJpYXQiOjE3OTMzNjQzMTMsImp0aSI6ImFhODAwNzYwLTZkZTctNDAzMS04ZDk4LTE4ZTQ5N2I5NDZhOSIsInNpZCI6IjFjMTE5NDUxLWQzOWEtNDQwNS04OWQwLTNlMGE5ZjQxOTA2NSJ9.E_Lh7-33IchHBqlCT9xqEcG6jQXbR7-2Nr43GVCnxqQ",
  "access_expires_at": "2026-10-30T13:00:13.350375371Z",
  "refresh_token": "YbMxtAq7zGTyjoPD-7dW0U8SVsuoIt4Xl6gqs3OU7y0",
  "refresh_expires_at": "2026-11-29T12:45:13.349894182Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fea27f81-f563-4e62-ba50-16e374deff0f",
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
  "id": "d6c0c6cf-9281-4239-a972-379d340fa286",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:50:13.583212Z",
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
  "command_id": "21d8c5a2-c8ee-4085-8e04-560ae9f7f47c",
  "quote_id": "d6c0c6cf-9281-4239-a972-379d340fa286",
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
  "id": "1d360dd1-8ba5-4ac9-b24c-a0f89aeb411e",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5cfdd3ab-3b76-48aa-9446-4eb824be519c",
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
  "created_at": "2026-10-30T12:45:13.821857Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1d360dd1-8ba5-4ac9-b24c-a0f89aeb411e` → **200**

```json
{
  "id": "1d360dd1-8ba5-4ac9-b24c-a0f89aeb411e",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5cfdd3ab-3b76-48aa-9446-4eb824be519c",
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
  "created_at": "2026-10-30T12:45:13.821857Z",
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

`POST /api/driver/v1/orders/1d360dd1-8ba5-4ac9-b24c-a0f89aeb411e/claim` → **422**

```json
{
  "command_id": "71c135a0-953f-4e76-b00d-30ee05ecc18d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1d360dd1-8ba5-4ac9-b24c-a0f89aeb411e/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "86856c9d-492d-4e4b-8c39-1f1a4bfc52da"
}
```

`GET /api/rider/v1/orders/1d360dd1-8ba5-4ac9-b24c-a0f89aeb411e` → **200**

```json
{
  "id": "1d360dd1-8ba5-4ac9-b24c-a0f89aeb411e",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5cfdd3ab-3b76-48aa-9446-4eb824be519c",
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
  "created_at": "2026-10-30T12:45:13.821857Z",
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

`POST /api/driver/v1/orders/85a217c1-a2c7-438c-ae85-45e9f366bb60/claim` → **404**

```json
{
  "command_id": "0d4168e0-55e3-4b26-b72b-a23a3d6d4714"
}
```

```json
{
  "instance": "/api/driver/v1/orders/85a217c1-a2c7-438c-ae85-45e9f366bb60/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c74d3234-cb78-4ae9-a327-dce2e8bd0ab5"
}
```

`POST /api/driver/v1/orders/9b6571c8-1e65-4863-8868-c39d25cccd94/claim` → **404**

```json
{
  "command_id": "403301e7-2dc6-429a-92c0-a7d523d19757"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9b6571c8-1e65-4863-8868-c39d25cccd94/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b6225e05-e4ba-4735-8631-d07b8f937c1a"
}
```

`POST /api/driver/v1/orders/b084d0d7-f51e-4253-8113-a7ec266d09c5/claim` → **404**

```json
{
  "command_id": "9c2f18ce-04e3-4d87-81e3-b4cfad9aa196"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b084d0d7-f51e-4253-8113-a7ec266d09c5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6576d291-6d9a-4836-9e1a-ddd6b97450ed"
}
```

`POST /api/driver/v1/orders/db10f9d5-159c-4643-9dbe-443639374e67/claim` → **404**

```json
{
  "command_id": "fd491d60-d4c5-4434-b7af-f82c33adae1e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/db10f9d5-159c-4643-9dbe-443639374e67/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "00c0e516-a09b-4f87-bff1-e1a951e018aa"
}
```

`POST /api/driver/v1/orders/d8d0c886-ccec-4968-918a-5495963c2682/claim` → **404**

```json
{
  "command_id": "7914cc13-15fb-4982-82d0-ba2aa3216670"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d8d0c886-ccec-4968-918a-5495963c2682/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5209e2af-c5e7-4bcf-8336-368b6d45092f"
}
```

`POST /api/driver/v1/orders/8a3cc0fb-f8f5-4424-9018-5ebc840a69c7/claim` → **404**

```json
{
  "command_id": "b87c3228-615f-4f98-999c-bbc355f6a279"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8a3cc0fb-f8f5-4424-9018-5ebc840a69c7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "54102b38-828b-412c-b712-50999abdf9ed"
}
```

`POST /api/driver/v1/orders/77218eea-5eec-4c3c-b786-19711673676c/claim` → **404**

```json
{
  "command_id": "ddc027ec-406b-4c83-8743-ef926b0ebcdd"
}
```

```json
{
  "instance": "/api/driver/v1/orders/77218eea-5eec-4c3c-b786-19711673676c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3b32b69d-392d-43c7-ac80-f8fa52e44c19"
}
```

`POST /api/driver/v1/orders/49cd5c12-cff3-4992-b9ad-b1d7f5019516/claim` → **404**

```json
{
  "command_id": "d1e8aef9-4dec-4877-ab0e-cb11363d4188"
}
```

```json
{
  "instance": "/api/driver/v1/orders/49cd5c12-cff3-4992-b9ad-b1d7f5019516/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "81dcd3f5-2d0e-4006-a638-5f2bf068ba1a"
}
```

`POST /api/driver/v1/orders/490ce9f0-8e3d-4630-80e0-909a9128339d/claim` → **404**

```json
{
  "command_id": "879f0ebc-e793-40f5-b561-2b55d4f5553e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/490ce9f0-8e3d-4630-80e0-909a9128339d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "be769e5d-de98-47e4-b8e0-0f1a2e731555"
}
```

`POST /api/driver/v1/orders/7ad24a28-46fd-4a45-8b62-1235f0322543/claim` → **404**

```json
{
  "command_id": "ad35492d-cec5-46cc-8cf1-b95aff098123"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7ad24a28-46fd-4a45-8b62-1235f0322543/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "749d2ae1-43b3-4115-8a80-e621a98b5573"
}
```

`POST /api/driver/v1/orders/71dc8111-c056-464e-bb28-0a0f2c334051/claim` → **404**

```json
{
  "command_id": "c31d4a32-cf31-4c4a-b45a-c3c381c12fbd"
}
```

```json
{
  "instance": "/api/driver/v1/orders/71dc8111-c056-464e-bb28-0a0f2c334051/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5f79f558-85f3-4fc1-a7b7-edcde5a4956c"
}
```

`POST /api/driver/v1/orders/c2a94b8c-8bcc-4c50-8c7d-12e1f79f47b8/claim` → **404**

```json
{
  "command_id": "9c8a1fb2-1edc-439f-b03f-a938d8a7842d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c2a94b8c-8bcc-4c50-8c7d-12e1f79f47b8/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5baa23fe-e68c-4291-9d9d-772dbea8236d"
}
```

`POST /api/driver/v1/orders/313f799e-de6b-4af1-a009-9f4615394b23/claim` → **404**

```json
{
  "command_id": "deefb2f4-be52-4048-95b0-8fe6e82cfe86"
}
```

```json
{
  "instance": "/api/driver/v1/orders/313f799e-de6b-4af1-a009-9f4615394b23/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fc1365b5-0e15-4f99-aabd-4dd23acbbbcf"
}
```

`POST /api/driver/v1/orders/f26775e2-42fd-475a-b1e9-cfde6164a90b/claim` → **404**

```json
{
  "command_id": "4bedb9b2-e7b9-4004-b082-080c4380a3e9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f26775e2-42fd-475a-b1e9-cfde6164a90b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a98261b1-7d84-44aa-8fff-a52d2064c978"
}
```

`POST /api/driver/v1/orders/013a043f-2839-4c70-9f00-a4dc32fd4607/claim` → **404**

```json
{
  "command_id": "9b13a3cd-d9a6-4ad7-9422-49d2f35c9242"
}
```

```json
{
  "instance": "/api/driver/v1/orders/013a043f-2839-4c70-9f00-a4dc32fd4607/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c1e0e753-6573-4604-8f77-3ddd4a63fa39"
}
```

`POST /api/driver/v1/orders/fa375a41-4d23-44fe-9bef-d8d31b516cd5/claim` → **404**

```json
{
  "command_id": "d635a528-cb62-425d-a63c-e29e10fa9d68"
}
```

```json
{
  "instance": "/api/driver/v1/orders/fa375a41-4d23-44fe-9bef-d8d31b516cd5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "594a7c9d-f801-45f2-bedd-e002b53fb823"
}
```

`POST /api/driver/v1/orders/1209ad54-5043-4c0a-bc1a-a8b7d08a7050/claim` → **404**

```json
{
  "command_id": "95d73a1d-fe79-41d2-a3a7-8a91edce7d45"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1209ad54-5043-4c0a-bc1a-a8b7d08a7050/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0c2ae5ff-8976-4781-b33a-cf81f1be9e4b"
}
```

`POST /api/driver/v1/orders/4142422d-6293-42ca-a0ed-8a45a40e4a08/claim` → **404**

```json
{
  "command_id": "a1f0d26f-6997-4109-8090-9d77d28f2f3c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4142422d-6293-42ca-a0ed-8a45a40e4a08/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f146c04c-3709-4f2e-bc92-a49666a50569"
}
```

`POST /api/driver/v1/orders/a8e3203f-705d-4472-8a74-ab56e12877e6/claim` → **404**

```json
{
  "command_id": "68fbd73e-d047-42dc-80f4-9e8d0fc00ddd"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a8e3203f-705d-4472-8a74-ab56e12877e6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e9460fe5-97d2-405e-8108-15d4d4131529"
}
```

`POST /api/driver/v1/orders/064bf132-3e2a-49e1-9a51-fe6bd658c2d5/claim` → **404**

```json
{
  "command_id": "f6f4b24f-46c0-4b99-97b0-270906326b79"
}
```

```json
{
  "instance": "/api/driver/v1/orders/064bf132-3e2a-49e1-9a51-fe6bd658c2d5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1f56f548-2326-4ec6-9908-35ee2d7af425"
}
```

`POST /api/driver/v1/orders/4e09ab62-31b4-46a1-84b8-4da5a46be8ec/claim` → **404**

```json
{
  "command_id": "a09012ca-768d-4881-8643-e83967ae18ab"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4e09ab62-31b4-46a1-84b8-4da5a46be8ec/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "859b0b04-654a-4f12-9527-b4c93ea40332"
}
```

`POST /api/driver/v1/orders/f638e2f0-57ac-4bad-9cc4-19fad1699853/claim` → **404**

```json
{
  "command_id": "5513f619-94c4-40d9-a7df-bb094defa40d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f638e2f0-57ac-4bad-9cc4-19fad1699853/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1c63ceb2-5bee-49fc-8948-1e37dd345bab"
}
```

`POST /api/driver/v1/orders/fa1c0609-3c98-4719-83ae-efa9cb969eab/claim` → **404**

```json
{
  "command_id": "6e666d43-b307-42e2-8483-86b4478eeea3"
}
```

```json
{
  "instance": "/api/driver/v1/orders/fa1c0609-3c98-4719-83ae-efa9cb969eab/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "62d0d56b-ccb1-4d43-9382-a0a0e0dbe615"
}
```

`POST /api/driver/v1/orders/f1c065c9-2911-4a92-9bbb-86262d9a343d/claim` → **404**

```json
{
  "command_id": "19fc4233-5faf-4add-a3b6-6f5855ca53b3"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f1c065c9-2911-4a92-9bbb-86262d9a343d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "aaaf43f2-9693-43ce-8f61-914b0cdb16b7"
}
```

`POST /api/driver/v1/orders/26f94754-2db3-4c00-91dd-873bd596c5d0/claim` → **404**

```json
{
  "command_id": "60c552f3-6ba9-41d8-b27b-c3153251ba4e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/26f94754-2db3-4c00-91dd-873bd596c5d0/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9668bd0a-7dd5-425a-baa1-25785c908720"
}
```

`POST /api/driver/v1/orders/6bdc8db4-d984-4b6c-8d5f-df06f26ea27a/claim` → **404**

```json
{
  "command_id": "9bd84627-0aac-460e-a419-4fad0e6cde96"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6bdc8db4-d984-4b6c-8d5f-df06f26ea27a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2f5efe6d-f343-4f1b-96a6-a03ed827ef38"
}
```

`POST /api/driver/v1/orders/0c66a23b-4d1c-4d33-a865-183f8f4096af/claim` → **404**

```json
{
  "command_id": "5786c975-6f92-40bb-8e8a-977638ad0f13"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0c66a23b-4d1c-4d33-a865-183f8f4096af/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f5e6f98e-2278-4fc1-9d67-70c217da71c9"
}
```

`POST /api/driver/v1/orders/57bb9bc6-cfdc-41cd-a6fe-c20cab813d57/claim` → **404**

```json
{
  "command_id": "bb287a52-9e88-4a00-9d96-49398f429d50"
}
```

```json
{
  "instance": "/api/driver/v1/orders/57bb9bc6-cfdc-41cd-a6fe-c20cab813d57/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "29033c21-eb6c-4ce8-ba59-82d4e29ecb78"
}
```

`POST /api/driver/v1/orders/08e192f8-244a-4bff-87f5-122bf4f96cbe/claim` → **404**

```json
{
  "command_id": "fd9aadbf-223a-444f-b234-5b33e4d31be3"
}
```

```json
{
  "instance": "/api/driver/v1/orders/08e192f8-244a-4bff-87f5-122bf4f96cbe/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "714706f2-a434-4026-bb49-67b6e104a048"
}
```

`POST /api/driver/v1/orders/4adb5882-866b-419d-815c-cc955ca944d2/claim` → **429**

```json
{
  "command_id": "c5faf175-1a90-45cf-97ec-aacbff87e1b6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4adb5882-866b-419d-815c-cc955ca944d2/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "370eb6c1-c6b9-4fd3-af3f-74ba5b93eaad",
  "retryable": true,
  "retry_after_seconds": 593
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
  "command_id": "6b3e66d0-9c59-437b-b1b3-5dff4cde5b25",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:45:22Z",
    "sequence": 1793364322200
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ea942e8a-6daa-4213-b0f5-aaa170b90c9a",
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
  "last_heartbeat_at": "2026-10-30T12:45:22.217428Z",
  "last_location_at": "2026-10-30T12:45:22.217428Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "1d360dd1-8ba5-4ac9-b24c-a0f89aeb411e",
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

`POST /api/driver/v1/orders/1d360dd1-8ba5-4ac9-b24c-a0f89aeb411e/claim` → **409**

```json
{
  "command_id": "ffdb50a8-bf8d-4dc5-b1df-b9d93d7c4be8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1d360dd1-8ba5-4ac9-b24c-a0f89aeb411e/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "47822f31-e74f-45fc-be64-ece02758422b"
}
```

`POST /api/driver/v1/orders/1d360dd1-8ba5-4ac9-b24c-a0f89aeb411e/claim` → **200**

```json
{
  "command_id": "d17b047e-d0f5-491b-a291-0905613ad0ec"
}
```

```json
{
  "id": "06b191c8-bdbb-4d22-86a9-8a877a5759ff",
  "order_id": "1d360dd1-8ba5-4ac9-b24c-a0f89aeb411e",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "1fa215c2-d8a0-4911-bc3e-d58f53c057c4",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1fa215c2-d8a0-4911-bc3e-d58f53c057c4",
  "order_id": "1d360dd1-8ba5-4ac9-b24c-a0f89aeb411e",
  "assignment_id": "06b191c8-bdbb-4d22-86a9-8a877a5759ff",
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

`POST /api/driver/v1/trips/1fa215c2-d8a0-4911-bc3e-d58f53c057c4/cancel` → **200**

```json
{
  "command_id": "4f484fed-6d3e-422e-a03e-142169cfb950",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "1fa215c2-d8a0-4911-bc3e-d58f53c057c4",
  "order_id": "1d360dd1-8ba5-4ac9-b24c-a0f89aeb411e",
  "assignment_id": "06b191c8-bdbb-4d22-86a9-8a877a5759ff",
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

`GET /api/rider/v1/orders/1d360dd1-8ba5-4ac9-b24c-a0f89aeb411e` → **200**

```json
{
  "id": "1d360dd1-8ba5-4ac9-b24c-a0f89aeb411e",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "5cfdd3ab-3b76-48aa-9446-4eb824be519c",
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
    "id": "06b191c8-bdbb-4d22-86a9-8a877a5759ff",
    "order_id": "1d360dd1-8ba5-4ac9-b24c-a0f89aeb411e",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "1fa215c2-d8a0-4911-bc3e-d58f53c057c4",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T12:45:13.821857Z",
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
  "session_id": "184559a9-d87f-4df0-9e5d-ce8371c327c9",
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
  "last_heartbeat_at": "2026-10-30T12:45:12.86523Z",
  "last_location_at": "2026-10-30T12:45:12.86523Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/184559a9-d87f-4df0-9e5d-ce8371c327c9/close` → **200**

```json
{
  "command_id": "f9d03f8b-a781-45ac-92cd-225c209553ed",
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
  "session_id": "ea942e8a-6daa-4213-b0f5-aaa170b90c9a",
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
  "last_heartbeat_at": "2026-10-30T12:45:22.217428Z",
  "last_location_at": "2026-10-30T12:45:22.217428Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ea942e8a-6daa-4213-b0f5-aaa170b90c9a/close` → **200**

```json
{
  "command_id": "36fb1246-95f9-48ce-8dbf-f7a8eeccbcb7",
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
  "session_id": "04a58270-a489-4011-8a58-c86e3b9c5c41",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjUyMjUsImlhdCI6MTc5MzM2NDMyNSwianRpIjoiOTA1YjM5YjYtODEwZC00ZTU1LTlmN2YtYzgyY2JhMjZmOTZhIiwic2lkIjoiMDRhNTgyNzAtYTQ4OS00MDExLThhNTgtYzg2ZTNiOWM1YzQxIn0.XbDzBUwhTNQvwsddinPgKX-v7nN1GY1B0ZdLhG1e1Gk",
  "access_expires_at": "2026-10-30T13:00:25.008042627Z",
  "refresh_token": "8q2urWnzW-z1PVAS8l7YQZcB2NDGcUWJ-CsG9Mmdt5w",
  "refresh_expires_at": "2026-10-31T00:45:25.007607137Z",
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
  "command_id": "6cb90c36-b6fd-4900-b14f-e8cc069c0530",
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
  "session_id": "88cff003-86d7-4837-a297-16351b3298f3",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjUyMjUsImlhdCI6MTc5MzM2NDMyNSwianRpIjoiNjE3Nzg2NmQtOWJlOC00YzM4LWJhZDItMmY2ZGNiNzdmNGFhIiwic2lkIjoiODhjZmYwMDMtODZkNy00ODM3LWEyOTctMTYzNTFiMzI5OGYzIn0.TiTnR7G7Bn_95dEWFBVTPSTXVcifvgImrDlga1cV1j0",
  "access_expires_at": "2026-10-30T13:00:25.944322628Z",
  "refresh_token": "24SAAMSdVO1H9kNoXPbzXCI36C1601f5-XEanC5MH3s",
  "refresh_expires_at": "2026-10-31T00:45:25.943860549Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.220511993",
    "linkedid": "1730052700.220511993",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675340004"
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
    "id": "1730052700.220511993",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "35957848-2106-4421-922a-511d691bb0be",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380675340004",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T12:45:26.168155Z",
      "answered_at": null,
      "ended_at": "2026-10-30T12:45:26.189012Z",
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
    "id": "1730052600.1471711768",
    "linkedid": "1730052600.1471711768",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675340004"
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
      "id": "d2c39aea-a95d-48c7-96e3-12917c8ccfb0",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675340004",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T12:45:26.516291Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/d2c39aea-a95d-48c7-96e3-12917c8ccfb0/answer` → **200**

```json
{
  "command_id": "e887f116-7d67-43d3-89bb-d6446835566f"
}
```

```json
{
  "id": "d2c39aea-a95d-48c7-96e3-12917c8ccfb0",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675340004",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "order_ids": [],
  "started_at": "2026-10-30T12:45:26.516291Z",
  "answered_at": "2026-10-30T12:45:26.801834Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1471711768",
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
    "id": "1730052600.1471711768",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "d2c39aea-a95d-48c7-96e3-12917c8ccfb0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675340004",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "order_ids": [],
      "started_at": "2026-10-30T12:45:26.516291Z",
      "answered_at": "2026-10-30T12:45:26.801834Z",
      "ended_at": "2026-10-30T12:45:27.048501Z",
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
      "id": "d2c39aea-a95d-48c7-96e3-12917c8ccfb0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675340004",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "order_ids": [],
      "started_at": "2026-10-30T12:45:26.516291Z",
      "answered_at": "2026-10-30T12:45:26.801834Z",
      "ended_at": "2026-10-30T12:45:27.048501Z",
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
      "id": "d2c39aea-a95d-48c7-96e3-12917c8ccfb0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675340004",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "order_ids": [],
      "started_at": "2026-10-30T12:45:26.516291Z",
      "answered_at": "2026-10-30T12:45:26.801834Z",
      "ended_at": "2026-10-30T12:45:27.048501Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T12:45:29.629858Z"
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
      "id": "d2c39aea-a95d-48c7-96e3-12917c8ccfb0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675340004",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "order_ids": [],
      "started_at": "2026-10-30T12:45:26.516291Z",
      "answered_at": "2026-10-30T12:45:26.801834Z",
      "ended_at": "2026-10-30T12:45:27.048501Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T12:45:29.629858Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/d2c39aea-a95d-48c7-96e3-12917c8ccfb0/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/d2c39aea-a95d-48c7-96e3-12917c8ccfb0/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=d2c39aea-a95d-48c7-96e3-12917c8ccfb0` → **200**

```json
{
  "changes": [
    {
      "id": "ec91779c-2b85-46ae-b707-6b317df50117",
      "occurred_at": "2026-10-30T12:45:32.036317Z",
      "actor_type": "STAFF",
      "actor_id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "d2c39aea-a95d-48c7-96e3-12917c8ccfb0",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"39299b03-2f9e-489f-800a-c2e894505fcf\", \"order_ids\": []}",
      "correlation_id": "662502fc-2d16-43f8-bbed-b1272278c657"
    },
    {
      "id": "f2cd3256-f8f3-4283-95a1-7523e5b5bf0f",
      "occurred_at": "2026-10-30T12:45:31.999712Z",
      "actor_type": "STAFF",
      "actor_id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "d2c39aea-a95d-48c7-96e3-12917c8ccfb0",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"39299b03-2f9e-489f-800a-c2e894505fcf\", \"order_ids\": []}",
      "correlation_id": "dab46e56-8e0a-4a54-a36d-899735e9238c"
    }
  ]
}
```

Done: call d2c39aea-a95d-48c7-96e3-12917c8ccfb0 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29765"
}
```

```json
{
  "challenge_id": "3c44c704-3580-4ff4-b3f9-2e68c9d3174e",
  "expires_at": "2026-10-30T12:50:32.294974826Z",
  "resend_available_at": "2026-10-30T12:45:33.294974826Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "561703",
  "sent_at": "2026-10-30T12:45:32.297906734Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c44c704-3580-4ff4-b3f9-2e68c9d3174e",
  "code": "561703",
  "device_ref": "sandbox-29765"
}
```

```json
{
  "session_id": "bc4bbfa8-4f31-4d7f-b8de-412c4a2066a5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTIzMiwiaWF0IjoxNzkzMzY0MzMyLCJqdGkiOiI5Nzk4M2E4MC1iYzM0LTQwODAtYWFjMy1hYTgyNzM2NTgwMDYiLCJzaWQiOiJiYzRiYmZhOC00ZjMxLTRkN2YtYjhkZS00MTJjNGEyMDY2YTUifQ.AFAOEujv_ZABWS5eEm9Q9sDOwFrh4pCj5UvBw2cKMgA",
  "access_expires_at": "2026-10-30T13:00:32.547552047Z",
  "refresh_token": "fwgfOO5gAUCP7WAZLhYSkc3xs3ZEkJ50yV0vQiL1dj8",
  "refresh_expires_at": "2026-11-29T12:45:32.547020935Z",
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
  "command_id": "5ed99564-eaee-413a-8cb0-50f7779378ba",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:45:32Z",
    "sequence": 1793364333193
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7b0d00ae-dcb1-47a9-8a6d-bce13c1b7a51",
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
  "last_heartbeat_at": "2026-10-30T12:45:33.017017Z",
  "last_location_at": "2026-10-30T12:45:33.017017Z",
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
  "session_id": "94d0f6f9-ea10-459e-b914-98fc85645193",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjUyMzMsImlhdCI6MTc5MzM2NDMzMywianRpIjoiZDFjZTc0OWQtMjBlZC00NTNkLWJjYTctMzc1YTE2ZWNmZWNlIiwic2lkIjoiOTRkMGY2ZjktZWExMC00NTllLWI5MTQtOThmYzg1NjQ1MTkzIn0.LyMEV5CyNxFkWJOBbtUwgg8TUSkM-yNVzIpPKpuake8",
  "access_expires_at": "2026-10-30T13:00:33.503932251Z",
  "refresh_token": "k7a5H3-IVoz7FnQK_K1NTCDe3vZkRjTVD6HEty2D1XI",
  "refresh_expires_at": "2026-10-31T00:45:33.503502419Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "61f8f110-5411-4a43-b215-59b760721a06",
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
  "id": "5a4340c3-7414-43ca-9e43-19853615fbf8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:50:33.734974Z",
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
  "command_id": "e4f45054-1238-46ea-b637-e7008975bdf8",
  "quote_id": "5a4340c3-7414-43ca-9e43-19853615fbf8",
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
    "phone": "+380676438118"
  }
}
```

```json
{
  "id": "94e7b6ee-2fc1-4f08-9c91-1550fa809bfa",
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
  "created_at": "2026-10-30T12:45:33.984941Z",
  "caller": {
    "name": "Олена",
    "phone": "+380676438118"
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
    "id": "e47dccd9-f4f5-49f0-bb22-15e8ce346670",
    "order_id": "94e7b6ee-2fc1-4f08-9c91-1550fa809bfa",
    "expires_at": "2026-10-30T12:45:48.988745Z",
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

`POST /api/driver/v1/offers/e47dccd9-f4f5-49f0-bb22-15e8ce346670/accept` → **200**

```json
{
  "command_id": "87f86685-a02f-49e3-ac92-5bb1aa5d345e"
}
```

```json
{
  "id": "1db2936a-887e-447b-b27e-d1c39d5e23dc",
  "order_id": "94e7b6ee-2fc1-4f08-9c91-1550fa809bfa",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e20a6b86-d586-4116-b1cf-4aca0618c03d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380676438118` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380676438118` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380676438118` → **200**

```json
[
  {
    "phone": "+380676438118",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:45:36.103815173Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676438118` → **200**

```json
[
  {
    "phone": "+380676438118",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:45:36.103815173Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380676438118` → **200**

```json
[
  {
    "phone": "+380676438118",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:45:36.103815173Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e20a6b86-d586-4116-b1cf-4aca0618c03d",
  "order_id": "94e7b6ee-2fc1-4f08-9c91-1550fa809bfa",
  "assignment_id": "1db2936a-887e-447b-b27e-d1c39d5e23dc",
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
    "phone": "+380676438118"
  }
}
```

`POST /api/driver/v1/work-sessions/7b0d00ae-dcb1-47a9-8a6d-bce13c1b7a51/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:45:37Z",
    "sequence": 1793364337287
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7b0d00ae-dcb1-47a9-8a6d-bce13c1b7a51",
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
  "last_heartbeat_at": "2026-10-30T12:45:37.04525Z",
  "last_location_at": "2026-10-30T12:45:37.04525Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/e20a6b86-d586-4116-b1cf-4aca0618c03d/arrive` → **200**

```json
{
  "command_id": "9daa6e50-335d-44c5-9ed7-081ab0bf6083",
  "expected_version": 0
}
```

```json
{
  "id": "e20a6b86-d586-4116-b1cf-4aca0618c03d",
  "order_id": "94e7b6ee-2fc1-4f08-9c91-1550fa809bfa",
  "assignment_id": "1db2936a-887e-447b-b27e-d1c39d5e23dc",
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
  "arrived_at": "2026-10-30T12:45:37.278618Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380676438118"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380676438118` → **200**

```json
[
  {
    "phone": "+380676438118",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:45:36.103815173Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676438118` → **200**

```json
[
  {
    "phone": "+380676438118",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:45:36.103815173Z"
  },
  {
    "phone": "+380676438118",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T12:45:38.278177735Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676438118` → **200**

```json
[
  {
    "phone": "+380676438118",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:45:36.103815173Z"
  },
  {
    "phone": "+380676438118",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T12:45:38.278177735Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380676438118` → **200**

```json
[
  {
    "phone": "+380676438118",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:45:36.103815173Z"
  },
  {
    "phone": "+380676438118",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T12:45:38.278177735Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/e20a6b86-d586-4116-b1cf-4aca0618c03d/start` → **200**

```json
{
  "command_id": "acfa8bf4-3910-434b-a005-309f20686c7c",
  "expected_version": 1
}
```

```json
{
  "id": "e20a6b86-d586-4116-b1cf-4aca0618c03d",
  "order_id": "94e7b6ee-2fc1-4f08-9c91-1550fa809bfa",
  "assignment_id": "1db2936a-887e-447b-b27e-d1c39d5e23dc",
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
  "arrived_at": "2026-10-30T12:45:37.278618Z",
  "started_at": "2026-10-30T12:45:38.605214Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380676438118"
  }
}
```

`POST /api/driver/v1/trips/e20a6b86-d586-4116-b1cf-4aca0618c03d/complete` → **200**

```json
{
  "command_id": "2f7245ca-28b7-4a54-abf7-f0a6bd4b3ed9",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:45:38Z",
  "cash_received": true
}
```

```json
{
  "id": "e20a6b86-d586-4116-b1cf-4aca0618c03d",
  "order_id": "94e7b6ee-2fc1-4f08-9c91-1550fa809bfa",
  "assignment_id": "1db2936a-887e-447b-b27e-d1c39d5e23dc",
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
  "arrived_at": "2026-10-30T12:45:37.278618Z",
  "started_at": "2026-10-30T12:45:38.605214Z",
  "completed_at": "2026-10-30T12:45:38.847084Z",
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
  "session_id": "7b0d00ae-dcb1-47a9-8a6d-bce13c1b7a51",
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
  "last_heartbeat_at": "2026-10-30T12:45:37.04525Z",
  "last_location_at": "2026-10-30T12:45:37.04525Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7b0d00ae-dcb1-47a9-8a6d-bce13c1b7a51/close` → **200**

```json
{
  "command_id": "c0379810-4fff-4649-adba-4c47c8d4815b",
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
  "phone": "+380639016084",
  "device_ref": "sandbox-8393"
}
```

```json
{
  "challenge_id": "b0f4f259-5cf4-4249-897c-4af8791159a3",
  "expires_at": "2026-10-30T12:50:39.544864934Z",
  "resend_available_at": "2026-10-30T12:45:40.544864934Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639016084` → **200**

```json
{
  "phone": "+380639016084",
  "audience": "CLIENT",
  "code": "502754",
  "sent_at": "2026-10-30T12:45:39.547575142Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b0f4f259-5cf4-4249-897c-4af8791159a3",
  "code": "502754",
  "device_ref": "sandbox-8393"
}
```

```json
{
  "session_id": "52a3f1b4-7870-4868-92ed-c6c291f253f1",
  "subject": {
    "type": "CLIENT",
    "id": "a2960f1c-a1a5-492e-beb5-fa6935516341"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjk2MGYxYy1hMWE1LTQ5MmUtYmViNS1mYTY5MzU1MTYzNDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1MjM5LCJpYXQiOjE3OTMzNjQzMzksImp0aSI6IjM4NGQzMzc5LWEyMTMtNDBiOS05NTZjLTM4MDc1YzJmNzM2MyIsInNpZCI6IjUyYTNmMWI0LTc4NzAtNDg2OC05MmVkLWM2YzI5MWYyNTNmMSJ9.7zD7ssmgxxUlJC2YHhGySQede7ZQgChItuP58jt_5kw",
  "access_expires_at": "2026-10-30T13:00:39.804144102Z",
  "refresh_token": "1XCT7hnt5sb9jQ4dHaSWzbjqKEEbEWT_WlM0OsutYPk",
  "refresh_expires_at": "2026-11-29T12:45:39.803492163Z",
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
  "device_ref": "sandbox-18010"
}
```

```json
{
  "challenge_id": "651dcfb6-2e52-4cc7-b9af-465b6a626fe2",
  "expires_at": "2026-10-30T12:50:40.238488073Z",
  "resend_available_at": "2026-10-30T12:45:41.238488073Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "941832",
  "sent_at": "2026-10-30T12:45:40.241234003Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "651dcfb6-2e52-4cc7-b9af-465b6a626fe2",
  "code": "941832",
  "device_ref": "sandbox-18010"
}
```

```json
{
  "session_id": "2f69b0bb-cf0a-4c5c-8328-b67c2ee5c34d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTI0MCwiaWF0IjoxNzkzMzY0MzQwLCJqdGkiOiIzMTAwMjFlMC0wYTZhLTQ5MjktYTFjZi00MzQwN2Q4YmJmZDYiLCJzaWQiOiIyZjY5YjBiYi1jZjBhLTRjNWMtODMyOC1iNjdjMmVlNWMzNGQifQ.z8dW83qOz8r_Ns-Dj7CPCPN51_v3yBmUDPnQuaqzbRQ",
  "access_expires_at": "2026-10-30T13:00:40.491496786Z",
  "refresh_token": "--lKZsqLYnIhfA9KqjujMpsHh-gEaEg3MXTofgr9wIU",
  "refresh_expires_at": "2026-11-29T12:45:40.490950932Z",
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
  "session_id": "fc620406-5b66-4b19-88aa-fe17fabb7549",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjUyNDEsImlhdCI6MTc5MzM2NDM0MSwianRpIjoiZDE2MWU2ZDMtYmExZC00ZmJlLTlmZjItNGY3NTlhMDMxYTk0Iiwic2lkIjoiZmM2MjA0MDYtNWI2Ni00YjE5LTg4YWEtZmUxN2ZhYmI3NTQ5In0.Ow-hOcr2L8d5OZdsoq5Kh-aBoHDFphXDG9xvN-uQ2Ag",
  "access_expires_at": "2026-10-30T13:00:41.177988282Z",
  "refresh_token": "jggdasYQJVjcf1zIq7yIqAD2bQBz2ws7yqiI87o-9SA",
  "refresh_expires_at": "2026-10-31T00:45:41.177553092Z",
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
  "session_id": "7f8ec0f4-bbc2-4f1b-9f70-59513621615f",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjUyNDEsImlhdCI6MTc5MzM2NDM0MSwianRpIjoiZDgzZGM3MmYtOTZkMS00ZWUyLWFkMGMtM2FlOGQ4OTk3OWMxIiwic2lkIjoiN2Y4ZWMwZjQtYmJjMi00ZjFiLTlmNzAtNTk1MTM2MjE2MTVmIn0.PpCuCMsbJo7JVi7w66noqUAQ3WXg0L25-v52KeoWRms",
  "access_expires_at": "2026-10-30T13:00:41.655766388Z",
  "refresh_token": "n2nZ1L9DMRx8sEDgHIEzvmLd7F14FmWle7drXC4r3C4",
  "refresh_expires_at": "2026-10-31T00:45:41.655235417Z",
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
  "command_id": "53b8feae-0cac-45a3-ba4e-67ca6062f5a0",
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
  "id": "1e9d49bd-e618-41e6-a348-e454e6f3bb2d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:50:42.121369Z",
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
  "command_id": "27051931-0b10-424b-8fbe-1bbb34f16771",
  "quote_id": "1e9d49bd-e618-41e6-a348-e454e6f3bb2d",
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
  "id": "1ffcc75f-72dc-45e4-b03e-c82b606fb0ba",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a2960f1c-a1a5-492e-beb5-fa6935516341",
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
  "created_at": "2026-10-30T12:45:42.361787Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1ffcc75f-72dc-45e4-b03e-c82b606fb0ba` → **200**

```json
{
  "id": "1ffcc75f-72dc-45e4-b03e-c82b606fb0ba",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a2960f1c-a1a5-492e-beb5-fa6935516341",
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
  "created_at": "2026-10-30T12:45:42.361787Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/1ffcc75f-72dc-45e4-b03e-c82b606fb0ba/cancel` → **200**

```json
{
  "command_id": "9de93a76-82e8-4902-bed3-277c542fb18e",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "1ffcc75f-72dc-45e4-b03e-c82b606fb0ba",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a2960f1c-a1a5-492e-beb5-fa6935516341",
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
  "created_at": "2026-10-30T12:45:42.361787Z",
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
  "command_id": "2c1a4c5e-53e6-4839-a432-2c0358e1c896",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:45:43Z",
    "sequence": 1793364343317
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ea215620-317e-441d-92cf-55c8a9536ca0",
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
  "last_heartbeat_at": "2026-10-30T12:45:43.334288Z",
  "last_location_at": "2026-10-30T12:45:43.334288Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-31196"
}
```

```json
{
  "challenge_id": "7278d565-444d-42ab-b03a-1e94b7998085",
  "expires_at": "2026-10-30T12:50:43.561283281Z",
  "resend_available_at": "2026-10-30T12:45:44.561283281Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "675142",
  "sent_at": "2026-10-30T12:45:43.582128704Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7278d565-444d-42ab-b03a-1e94b7998085",
  "code": "675142",
  "device_ref": "sandbox-31196"
}
```

```json
{
  "session_id": "f7c6ef6b-13bf-44c0-a78c-2e7f7634cb92",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTI0MywiaWF0IjoxNzkzMzY0MzQzLCJqdGkiOiJlNzkyNDAxNy1lMTEyLTRkOTQtOTM2OS0zOGNkZDM0NzgzZTkiLCJzaWQiOiJmN2M2ZWY2Yi0xM2JmLTQ0YzAtYTc4Yy0yZTdmNzYzNGNiOTIifQ.TDmh-n6Gx33fnhCjbA4M9D-nQjseNhTiPtHzg2enuK8",
  "access_expires_at": "2026-10-30T13:00:43.827488334Z",
  "refresh_token": "l904_z6991qHdvolEqMohiqf9s-RRqRDfNMxIBNh77c",
  "refresh_expires_at": "2026-11-29T12:45:43.827018693Z",
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
  "command_id": "7721253c-dca5-4604-a512-9650fc30c998",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:45:44Z",
    "sequence": 1793364344405
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "34ca4060-beb8-4b4a-a245-1dc150ccb723",
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
  "last_heartbeat_at": "2026-10-30T12:45:44.429724Z",
  "last_location_at": "2026-10-30T12:45:44.429724Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b5e76b09-a71e-44b1-9dc2-97972ea3ab16",
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
  "id": "1551dfaa-a894-404d-b748-4618bf6f2e75",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:50:44.693610Z",
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
  "command_id": "0fa86e50-bb5c-4be5-aba8-38dce3124c46",
  "quote_id": "1551dfaa-a894-404d-b748-4618bf6f2e75",
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
  "id": "9ca5e863-80d9-4a96-964e-f5c28659ea04",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a2960f1c-a1a5-492e-beb5-fa6935516341",
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
  "created_at": "2026-10-30T12:45:44.938081Z",
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
    "id": "5b86f889-d96a-4e0e-bba5-9b115a2548bd",
    "order_id": "9ca5e863-80d9-4a96-964e-f5c28659ea04",
    "expires_at": "2026-10-30T12:45:59.941148Z",
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

`POST /api/driver/v1/offers/5b86f889-d96a-4e0e-bba5-9b115a2548bd/accept` → **200**

```json
{
  "command_id": "80bee588-02a1-42a3-bbbd-abca511407dd"
}
```

```json
{
  "id": "771b4772-94cb-4e43-8774-1b2bc90c2545",
  "order_id": "9ca5e863-80d9-4a96-964e-f5c28659ea04",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cf57d254-f397-4124-b3f1-2a90dd404990",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cf57d254-f397-4124-b3f1-2a90dd404990",
  "order_id": "9ca5e863-80d9-4a96-964e-f5c28659ea04",
  "assignment_id": "771b4772-94cb-4e43-8774-1b2bc90c2545",
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

`POST /api/driver/v1/trips/cf57d254-f397-4124-b3f1-2a90dd404990/cancel` → **200**

```json
{
  "command_id": "f51de56b-a9d7-4c24-b3fa-39268e85a70f",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "cf57d254-f397-4124-b3f1-2a90dd404990",
  "order_id": "9ca5e863-80d9-4a96-964e-f5c28659ea04",
  "assignment_id": "771b4772-94cb-4e43-8774-1b2bc90c2545",
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

`GET /api/rider/v1/orders/9ca5e863-80d9-4a96-964e-f5c28659ea04` → **200**

```json
{
  "id": "9ca5e863-80d9-4a96-964e-f5c28659ea04",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "a2960f1c-a1a5-492e-beb5-fa6935516341",
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
    "id": "771b4772-94cb-4e43-8774-1b2bc90c2545",
    "order_id": "9ca5e863-80d9-4a96-964e-f5c28659ea04",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "cf57d254-f397-4124-b3f1-2a90dd404990",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T12:45:44.938081Z",
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
    "id": "86ac61e9-0154-4427-b7aa-1576a236281c",
    "order_id": "9ca5e863-80d9-4a96-964e-f5c28659ea04",
    "expires_at": "2026-10-30T12:46:00.869219Z",
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

`POST /api/driver/v1/offers/86ac61e9-0154-4427-b7aa-1576a236281c/accept` → **200**

```json
{
  "command_id": "eaea3926-4f22-464a-a56a-2a5b84242453"
}
```

```json
{
  "id": "9bc13381-2994-463b-9e5b-fd2ce7518c9f",
  "order_id": "9ca5e863-80d9-4a96-964e-f5c28659ea04",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "294e1fbc-bbf8-4374-90b6-af03ff667dd8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "294e1fbc-bbf8-4374-90b6-af03ff667dd8",
  "order_id": "9ca5e863-80d9-4a96-964e-f5c28659ea04",
  "assignment_id": "9bc13381-2994-463b-9e5b-fd2ce7518c9f",
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

`POST /api/driver/v1/trips/294e1fbc-bbf8-4374-90b6-af03ff667dd8/cancel` → **200**

```json
{
  "command_id": "79007bec-87c8-4b4c-a761-21c594d71ef9",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "294e1fbc-bbf8-4374-90b6-af03ff667dd8",
  "order_id": "9ca5e863-80d9-4a96-964e-f5c28659ea04",
  "assignment_id": "9bc13381-2994-463b-9e5b-fd2ce7518c9f",
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
    "id": "9ca5e863-80d9-4a96-964e-f5c28659ea04",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-30T12:45:44.938081Z",
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
    "id": "1ffcc75f-72dc-45e4-b03e-c82b606fb0ba",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T12:45:42.361787Z",
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

`GET /api/operator/v1/orders/9ca5e863-80d9-4a96-964e-f5c28659ea04/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T12:45:44.938634Z",
      "actor": {
        "type": "CLIENT",
        "id": "a2960f1c-a1a5-492e-beb5-fa6935516341",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9ca5e863-80d9-4a96-964e-f5c28659ea04",
        "quote_id": "1551dfaa-a894-404d-b748-4618bf6f2e75",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "4662d01b-8534-4233-9e7f-95e0168fb1db"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T12:45:44.940474Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9ca5e863-80d9-4a96-964e-f5c28659ea04",
        "attempt_id": "8bb82eff-fb56-4df3-a76a-64b8b0676a6f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "4662d01b-8534-4233-9e7f-95e0168fb1db"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T12:45:44.946339Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "5b86f889-d96a-4e0e-bba5-9b115a2548bd",
        "order_id": "9ca5e863-80d9-4a96-964e-f5c28659ea04",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "4662d01b-8534-4233-9e7f-95e0168fb1db"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T12:45:45.405691Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "5b86f889-d96a-4e0e-bba5-9b115a2548bd",
        "order_id": "9ca5e863-80d9-4a96-964e-f5c28659ea04",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "771b4772-94cb-4e43-8774-1b2bc90c2545"
      },
      "correlation_id": "f0330505-6f23-4f4d-b6f0-1756d21fe154"
```

Done: orders 1ffcc75f-72dc-45e4-b03e-c82b606fb0ba, 9ca5e863-80d9-4a96-964e-f5c28659ea04.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737944969",
  "device_ref": "sandbox-29062"
}
```

```json
{
  "challenge_id": "03051f48-e08b-44cc-bd11-bd7d17f79db7",
  "expires_at": "2026-10-30T12:50:47.715267008Z",
  "resend_available_at": "2026-10-30T12:45:48.715267008Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737944969` → **200**

```json
{
  "phone": "+380737944969",
  "audience": "CLIENT",
  "code": "304384",
  "sent_at": "2026-10-30T12:45:47.717548033Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "03051f48-e08b-44cc-bd11-bd7d17f79db7",
  "code": "304384",
  "device_ref": "sandbox-29062"
}
```

```json
{
  "session_id": "a5d21b74-b2ee-4298-b1e8-e3636f312235",
  "subject": {
    "type": "CLIENT",
    "id": "70630af0-f1d2-4c8e-b567-556e39b7fc5f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MDYzMGFmMC1mMWQyLTRjOGUtYjU2Ny01NTZlMzliN2ZjNWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1MjQ3LCJpYXQiOjE3OTMzNjQzNDcsImp0aSI6IjFlYjdiOGMwLTFiNjYtNDQ4MS1hZWMzLTlmNGQyYTljYmMwYyIsInNpZCI6ImE1ZDIxYjc0LWIyZWUtNDI5OC1iMWU4LWUzNjM2ZjMxMjIzNSJ9.DuzPFOsW0MAu6a9takjKcAxfUOxHATHNKqGSiTagHfI",
  "access_expires_at": "2026-10-30T13:00:47.963275618Z",
  "refresh_token": "9WKNvtXXqMzmXs_iVfWysbn0lDpSXfTSrRGTQHcbhn0",
  "refresh_expires_at": "2026-11-29T12:45:47.96282177Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "a4e35ca9-f1d4-47f9-b8d5-f3aec18be669",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "c0d5ab32-cb89-4cf1-addc-5891dce1d3d9",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-c0d5ab32-cb89-4cf1-addc-5891dce1d3d9",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "8682714f8128c8fe4005887636035f80",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=c0d5ab32-cb89-4cf1-addc-5891dce1d3d9",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737944969"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=c0d5ab32-cb89-4cf1-addc-5891dce1d3d9",
  "expires_at": "2026-10-30T13:15:48.190104Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/c0d5ab32-cb89-4cf1-addc-5891dce1d3d9` → **200**

```json
{
  "id": "c0d5ab32-cb89-4cf1-addc-5891dce1d3d9",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:15:48.190104Z",
  "card": {
    "id": "221e1034-11c8-41eb-9c87-7d4a773a25d4",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7037",
    "card_type": "Visa",
    "created_at": "2026-10-30T12:45:48.428865Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "221e1034-11c8-41eb-9c87-7d4a773a25d4",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****7037",
      "card_type": "Visa",
      "created_at": "2026-10-30T12:45:48.428865Z"
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
  "device_ref": "sandbox-26865"
}
```

```json
{
  "challenge_id": "aecf14ba-6534-4fd1-887d-93709fbe3129",
  "expires_at": "2026-10-30T12:50:48.890883166Z",
  "resend_available_at": "2026-10-30T12:45:49.890883166Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "279155",
  "sent_at": "2026-10-30T12:45:48.892955554Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aecf14ba-6534-4fd1-887d-93709fbe3129",
  "code": "279155",
  "device_ref": "sandbox-26865"
}
```

```json
{
  "session_id": "5f52efe9-f8b4-4a86-92e5-1327b650096a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTI0OSwiaWF0IjoxNzkzMzY0MzQ5LCJqdGkiOiIxYjhiMWQzZS1jZmIwLTQ1OGUtYmQ1MC05NjQxZDg4MjE4MjEiLCJzaWQiOiI1ZjUyZWZlOS1mOGI0LTRhODYtOTJlNS0xMzI3YjY1MDA5NmEifQ.YOCtZXB3zrTrSrz33bjn8JkCeTG4ChkruicqPJjYULU",
  "access_expires_at": "2026-10-30T13:00:49.138537174Z",
  "refresh_token": "VjtLEUZ2dN3d7LI_YnUe7e7H30ZYsKaAPswxD0Jppv8",
  "refresh_expires_at": "2026-11-29T12:45:49.138095204Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "34ca4060-beb8-4b4a-a245-1dc150ccb723",
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
  "last_heartbeat_at": "2026-10-30T12:45:44.429724Z",
  "last_location_at": "2026-10-30T12:45:44.429724Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/34ca4060-beb8-4b4a-a245-1dc150ccb723/handover` → **200**

```json
{
  "command_id": "a18fc1da-ded0-4980-87e5-a4afd8fade78",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "34ca4060-beb8-4b4a-a245-1dc150ccb723",
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
  "last_heartbeat_at": "2026-10-30T12:45:44.429724Z",
  "last_location_at": "2026-10-30T12:45:44.429724Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 44 s to the next point)

`POST /api/driver/v1/work-sessions/34ca4060-beb8-4b4a-a245-1dc150ccb723/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:46:33Z",
    "sequence": 1793364393842
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "34ca4060-beb8-4b4a-a245-1dc150ccb723",
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
  "last_heartbeat_at": "2026-10-30T12:46:33.859237Z",
  "last_location_at": "2026-10-30T12:46:33.859237Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d0c17784-7420-4860-8909-11d34251d75d",
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
  "id": "59f5960d-5b53-45d6-b674-de6840a6e608",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:51:34.097551Z",
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
  "command_id": "9c83d9d0-18cb-4dd8-93f6-fca9336af9cb",
  "quote_id": "59f5960d-5b53-45d6-b674-de6840a6e608",
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
  "id": "d4abe36c-532a-4292-b778-f263586dfe21",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "70630af0-f1d2-4c8e-b567-556e39b7fc5f",
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
  "created_at": "2026-10-30T12:46:34.341671Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d4abe36c-532a-4292-b778-f263586dfe21` → **200**

```json
{
  "id": "d4abe36c-532a-4292-b778-f263586dfe21",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "70630af0-f1d2-4c8e-b567-556e39b7fc5f",
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
  "created_at": "2026-10-30T12:46:34.341671Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d4abe36c-532a-4292-b778-f263586dfe21` → **200**

```json
{
  "id": "d4abe36c-532a-4292-b778-f263586dfe21",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "70630af0-f1d2-4c8e-b567-556e39b7fc5f",
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
  "created_at": "2026-10-30T12:46:34.341671Z",
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
    "id": "122a78d0-0f8a-4ead-bfea-7929951e74fe",
    "order_id": "d4abe36c-532a-4292-b778-f263586dfe21",
    "expires_at": "2026-10-30T12:46:49.650056Z",
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

`POST /api/driver/v1/offers/122a78d0-0f8a-4ead-bfea-7929951e74fe/accept` → **200**

```json
{
  "command_id": "ce6d3897-148a-4215-9fab-d2511c20f689"
}
```

```json
{
  "id": "82819163-e02d-41c5-a076-87c46b5f226e",
  "order_id": "d4abe36c-532a-4292-b778-f263586dfe21",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dae00b9e-dd83-4296-ab11-5d29552fcd9d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dae00b9e-dd83-4296-ab11-5d29552fcd9d",
  "order_id": "d4abe36c-532a-4292-b778-f263586dfe21",
  "assignment_id": "82819163-e02d-41c5-a076-87c46b5f226e",
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

`POST /api/driver/v1/work-sessions/34ca4060-beb8-4b4a-a245-1dc150ccb723/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:46:42Z",
    "sequence": 1793364402733
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "34ca4060-beb8-4b4a-a245-1dc150ccb723",
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
  "last_heartbeat_at": "2026-10-30T12:46:42.75013Z",
  "last_location_at": "2026-10-30T12:46:42.75013Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/dae00b9e-dd83-4296-ab11-5d29552fcd9d/arrive` → **200**

```json
{
  "command_id": "14ac5b6b-cbcd-440a-9740-211b1a2abaa7",
  "expected_version": 0
}
```

```json
{
  "id": "dae00b9e-dd83-4296-ab11-5d29552fcd9d",
  "order_id": "d4abe36c-532a-4292-b778-f263586dfe21",
  "assignment_id": "82819163-e02d-41c5-a076-87c46b5f226e",
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
  "arrived_at": "2026-10-30T12:46:42.981545Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dae00b9e-dd83-4296-ab11-5d29552fcd9d/start` → **200**

```json
{
  "command_id": "48760286-b73b-4e08-bdd8-134ab0c5298e",
  "expected_version": 1
}
```

```json
{
  "id": "dae00b9e-dd83-4296-ab11-5d29552fcd9d",
  "order_id": "d4abe36c-532a-4292-b778-f263586dfe21",
  "assignment_id": "82819163-e02d-41c5-a076-87c46b5f226e",
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
  "arrived_at": "2026-10-30T12:46:42.981545Z",
  "started_at": "2026-10-30T12:46:43.211374Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dae00b9e-dd83-4296-ab11-5d29552fcd9d/complete` → **200**

```json
{
  "command_id": "9f53d837-9fe6-469a-82c2-65f4bd233440",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:46:43Z",
  "cash_received": true
}
```

```json
{
  "id": "dae00b9e-dd83-4296-ab11-5d29552fcd9d",
  "order_id": "d4abe36c-532a-4292-b778-f263586dfe21",
  "assignment_id": "82819163-e02d-41c5-a076-87c46b5f226e",
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
  "arrived_at": "2026-10-30T12:46:42.981545Z",
  "started_at": "2026-10-30T12:46:43.211374Z",
  "completed_at": "2026-10-30T12:46:43.449703Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/d4abe36c-532a-4292-b778-f263586dfe21` → **200**

```json
{
  "id": "d4abe36c-532a-4292-b778-f263586dfe21",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "70630af0-f1d2-4c8e-b567-556e39b7fc5f",
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
    "id": "82819163-e02d-41c5-a076-87c46b5f226e",
    "order_id": "d4abe36c-532a-4292-b778-f263586dfe21",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "dae00b9e-dd83-4296-ab11-5d29552fcd9d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:46:34.341671Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d4abe36c-532a-4292-b778-f263586dfe21` → **200**

```json
{
  "id": "d4abe36c-532a-4292-b778-f263586dfe21",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "70630af0-f1d2-4c8e-b567-556e39b7fc5f",
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
    "id": "82819163-e02d-41c5-a076-87c46b5f226e",
    "order_id": "d4abe36c-532a-4292-b778-f263586dfe21",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "dae00b9e-dd83-4296-ab11-5d29552fcd9d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:46:34.341671Z",
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

`GET /api/rider/v1/orders/d4abe36c-532a-4292-b778-f263586dfe21/tip` → **200**

```json
{
  "order_id": "d4abe36c-532a-4292-b778-f263586dfe21",
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
  "available_until": "2026-10-31T12:46:43.449703Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/d4abe36c-532a-4292-b778-f263586dfe21/tip` → **201**

```json
{
  "command_id": "b53c9b95-71a0-48ee-a181-7b895eb54994",
  "amount_minor": 2500
}
```

```json
{
  "id": "98ce6be0-2a3d-4dd7-b909-06423eb59a5d",
  "order_id": "d4abe36c-532a-4292-b778-f263586dfe21",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T12:46:45.610786Z"
}
```

`GET /api/rider/v1/orders/d4abe36c-532a-4292-b778-f263586dfe21/tip` → **200**

```json
{
  "order_id": "d4abe36c-532a-4292-b778-f263586dfe21",
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
  "available_until": "2026-10-31T12:46:43.449703Z",
  "open": false,
  "tip": {
    "id": "98ce6be0-2a3d-4dd7-b909-06423eb59a5d",
    "order_id": "d4abe36c-532a-4292-b778-f263586dfe21",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T12:46:45.610786Z"
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
      "id": "31249978-d1f8-40ed-be31-4d26acc6ae25",
      "at": "2026-10-30T12:46:43.712292Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d4abe36c-532a-4292-b778-f263586dfe21",
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
      "id": "63924835-97f1-413f-add4-1dadf53ab49f",
      "at": "2026-10-30T12:46:46.755486Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "d4abe36c-532a-4292-b778-f263586dfe21",
      "counterpart_id": null
    },
    {
      "id": "31249978-d1f8-40ed-be31-4d26acc6ae25",
      "at": "2026-10-30T12:46:43.712292Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d4abe36c-532a-4292-b778-f263586dfe21",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e1ecac1d-1ea3-48bb-b680-51ebf5378a66",
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
  "id": "fc79f6c8-5746-49b3-8093-b121d249ba80",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:51:47.528416Z",
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
  "session_id": "1e410311-d079-4c7e-adfd-a9386fe67c0c",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjUzMDgsImlhdCI6MTc5MzM2NDQwOCwianRpIjoiNjBhMjY4NGMtMTdkMS00MWYyLTg4MjYtMjJkNGQyZWJmMWQxIiwic2lkIjoiMWU0MTAzMTEtZDA3OS00YzdlLWFkZmQtYTkzODZmZTY3YzBjIn0.VFDBVYRMmyZu13nRrqKWXZEVN_xq2CwUI2-f-qmBYq8",
  "access_expires_at": "2026-10-30T13:01:48.018074842Z",
  "refresh_token": "a8gHmMSFD-TWxZu0bifIRqwsQjXgpbbbAhyxtAZhWzY",
  "refresh_expires_at": "2026-10-31T00:46:48.01761084Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380737944969` → **200**

```json
{
  "client_id": "70630af0-f1d2-4c8e-b567-556e39b7fc5f"
}
```

`POST /api/admin/v1/rider-wallets/70630af0-f1d2-4c8e-b567-556e39b7fc5f/top-ups` → **201**

```json
{
  "command_id": "85a47136-00b4-4a29-be0c-9f83f8c9bbe7",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "70630af0-f1d2-4c8e-b567-556e39b7fc5f",
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
      "id": "66404ec4-3ac2-45e3-b104-6e1567181840",
      "at": "2026-10-30T12:46:48.463592Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b64c2ffb-558f-48ef-be86-cc90e64d8149",
  "quote_id": "fc79f6c8-5746-49b3-8093-b121d249ba80",
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
  "id": "f3a70017-92b6-4349-a880-6dd5714d3d0e",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "70630af0-f1d2-4c8e-b567-556e39b7fc5f",
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
  "created_at": "2026-10-30T12:46:48.702441Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f3a70017-92b6-4349-a880-6dd5714d3d0e` → **200**

```json
{
  "id": "f3a70017-92b6-4349-a880-6dd5714d3d0e",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "70630af0-f1d2-4c8e-b567-556e39b7fc5f",
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
  "created_at": "2026-10-30T12:46:48.702441Z",
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
    "id": "239bdcd0-3275-4eec-93c9-99cef11765f0",
    "order_id": "f3a70017-92b6-4349-a880-6dd5714d3d0e",
    "expires_at": "2026-10-30T12:47:03.705815Z",
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

`POST /api/driver/v1/offers/239bdcd0-3275-4eec-93c9-99cef11765f0/accept` → **200**

```json
{
  "command_id": "5666f585-9526-4f73-aef8-15363878bf2e"
}
```

```json
{
  "id": "cccb37ad-4679-4292-9100-1839109dafc1",
  "order_id": "f3a70017-92b6-4349-a880-6dd5714d3d0e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2cfab88c-5461-409b-b0b6-83c6ec06924c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2cfab88c-5461-409b-b0b6-83c6ec06924c",
  "order_id": "f3a70017-92b6-4349-a880-6dd5714d3d0e",
  "assignment_id": "cccb37ad-4679-4292-9100-1839109dafc1",
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

`POST /api/driver/v1/work-sessions/34ca4060-beb8-4b4a-a245-1dc150ccb723/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:46:49Z",
    "sequence": 1793364409862
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "34ca4060-beb8-4b4a-a245-1dc150ccb723",
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
  "last_heartbeat_at": "2026-10-30T12:46:49.878836Z",
  "last_location_at": "2026-10-30T12:46:49.878836Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/2cfab88c-5461-409b-b0b6-83c6ec06924c/arrive` → **200**

```json
{
  "command_id": "b837828f-ead9-4611-880f-1f24e915cd5b",
  "expected_version": 0
}
```

```json
{
  "id": "2cfab88c-5461-409b-b0b6-83c6ec06924c",
  "order_id": "f3a70017-92b6-4349-a880-6dd5714d3d0e",
  "assignment_id": "cccb37ad-4679-4292-9100-1839109dafc1",
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
  "arrived_at": "2026-10-30T12:46:50.114445Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2cfab88c-5461-409b-b0b6-83c6ec06924c/start` → **200**

```json
{
  "command_id": "8872fc8a-477f-4a52-9d8c-081fa2ddd13c",
  "expected_version": 1
}
```

```json
{
  "id": "2cfab88c-5461-409b-b0b6-83c6ec06924c",
  "order_id": "f3a70017-92b6-4349-a880-6dd5714d3d0e",
  "assignment_id": "cccb37ad-4679-4292-9100-1839109dafc1",
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
  "arrived_at": "2026-10-30T12:46:50.114445Z",
  "started_at": "2026-10-30T12:46:50.350033Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2cfab88c-5461-409b-b0b6-83c6ec06924c/complete` → **200**

```json
{
  "command_id": "4c6ca5e5-6296-4383-a53a-3bd6b80775a7",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:46:50Z",
  "cash_received": true
}
```

```json
{
  "id": "2cfab88c-5461-409b-b0b6-83c6ec06924c",
  "order_id": "f3a70017-92b6-4349-a880-6dd5714d3d0e",
  "assignment_id": "cccb37ad-4679-4292-9100-1839109dafc1",
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
  "arrived_at": "2026-10-30T12:46:50.114445Z",
  "started_at": "2026-10-30T12:46:50.350033Z",
  "completed_at": "2026-10-30T12:46:50.599261Z",
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
  "client_id": "70630af0-f1d2-4c8e-b567-556e39b7fc5f",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 300,
      "reserved_minor": 0,
      "available_minor": 300
    }
  ],
  "entries": [
    {
      "id": "870226fe-8eac-416c-ada1-095520744dfd",
      "at": "2026-10-30T12:46:50.809712Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -16297,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "f3a70017-92b6-4349-a880-6dd5714d3d0e"
    },
    {
      "id": "66404ec4-3ac2-45e3-b104-6e1567181840",
      "at": "2026-10-30T12:46:48.463592Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
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

`GET /api/rider/v1/orders/f3a70017-92b6-4349-a880-6dd5714d3d0e/tip` → **200**

```json
{
  "order_id": "f3a70017-92b6-4349-a880-6dd5714d3d0e",
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
  "available_until": "2026-10-31T12:46:50.599261Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/f3a70017-92b6-4349-a880-6dd5714d3d0e/tip` → **201**

```json
{
  "command_id": "72370317-ba6e-4806-a858-4ec8e85b5470",
  "amount_minor": 2500
}
```

```json
{
  "id": "96854b58-0570-404e-86f5-7190a609d83d",
  "order_id": "f3a70017-92b6-4349-a880-6dd5714d3d0e",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T12:46:51.516878Z"
}
```

`GET /api/rider/v1/orders/f3a70017-92b6-4349-a880-6dd5714d3d0e/tip` → **200**

```json
{
  "order_id": "f3a70017-92b6-4349-a880-6dd5714d3d0e",
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
  "available_until": "2026-10-31T12:46:50.599261Z",
  "open": false,
  "tip": {
    "id": "96854b58-0570-404e-86f5-7190a609d83d",
    "order_id": "f3a70017-92b6-4349-a880-6dd5714d3d0e",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T12:46:51.516878Z"
  }
}
```

`GET /api/rider/v1/orders/f3a70017-92b6-4349-a880-6dd5714d3d0e/tip` → **200**

```json
{
  "order_id": "f3a70017-92b6-4349-a880-6dd5714d3d0e",
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
  "available_until": "2026-10-31T12:46:50.599261Z",
  "open": false,
  "tip": {
    "id": "96854b58-0570-404e-86f5-7190a609d83d",
    "order_id": "f3a70017-92b6-4349-a880-6dd5714d3d0e",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T12:46:51.516878Z"
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
      "id": "63bdb8d7-6d42-4189-a6c0-d0215f47426e",
      "at": "2026-10-30T12:46:52.824566Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f3a70017-92b6-4349-a880-6dd5714d3d0e",
      "counterpart_id": null
    },
    {
      "id": "807f27cc-b3f7-4f72-a22a-0e27b1f32999",
      "at": "2026-10-30T12:46:50.802721Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f3a70017-92b6-4349-a880-6dd5714d3d0e",
      "counterpart_id": null
    },
    {
      "id": "63924835-97f1-413f-add4-1dadf53ab49f",
      "at": "2026-10-30T12:46:46.755486Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "d4abe36c-532a-4292-b778-f263586dfe21",
      "counterpart_id": null
    },
    {
      "id": "31249978-d1f8-40ed-be31-4d26acc6ae25",
      "at": "2026-10-30T12:46:43.712292Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d4abe36c-532a-4292-b778-f263586dfe21",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "34ca4060-beb8-4b4a-a245-1dc150ccb723",
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
  "last_heartbeat_at": "2026-10-30T12:46:49.878836Z",
  "last_location_at": "2026-10-30T12:46:49.878836Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/34ca4060-beb8-4b4a-a245-1dc150ccb723/close` → **200**

```json
{
  "command_id": "27d0386c-309e-40a1-9894-d6662a3227d7",
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

Done: card order f3a70017-92b6-4349-a880-6dd5714d3d0e.

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
  "phone": "+380739769566",
  "device_ref": "sandbox-9595"
}
```

```json
{
  "challenge_id": "05c90120-db60-4097-84cd-af974be68864",
  "expires_at": "2026-10-30T12:51:54.101886283Z",
  "resend_available_at": "2026-10-30T12:46:55.101886283Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739769566` → **200**

```json
{
  "phone": "+380739769566",
  "audience": "CLIENT",
  "code": "997679",
  "sent_at": "2026-10-30T12:46:54.104761893Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "05c90120-db60-4097-84cd-af974be68864",
  "code": "997679",
  "device_ref": "sandbox-9595"
}
```

```json
{
  "session_id": "e9053a32-4d81-4824-8fcc-effe7b59cf97",
  "subject": {
    "type": "CLIENT",
    "id": "92a5abde-a221-4ab5-87bd-be2b5b1670af"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MmE1YWJkZS1hMjIxLTRhYjUtODdiZC1iZTJiNWIxNjcwYWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1MzE0LCJpYXQiOjE3OTMzNjQ0MTQsImp0aSI6IjFhOGNlMzY0LWE1NDctNDJkNy1iYmI5LTI5ZmE0MTQ2OGVjNSIsInNpZCI6ImU5MDUzYTMyLTRkODEtNDgyNC04ZmNjLWVmZmU3YjU5Y2Y5NyJ9.o133wErrdqRoV0jizUjrowwGKbYxCVEJ6SO9neD7zro",
  "access_expires_at": "2026-10-30T13:01:54.348430153Z",
  "refresh_token": "wY65EFSt9qGYxwdEm2Rvm_c7LOV6dMUlDIfwqq096YM",
  "refresh_expires_at": "2026-11-29T12:46:54.347989825Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "192cfbe8-62d5-455e-8913-a09d72cabf61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "3ffd40db-0bb3-49c5-980a-da8bd9a94b96",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-3ffd40db-0bb3-49c5-980a-da8bd9a94b96",
    "orderDate": "1793364414",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "02d1d7fb32a6f80be93e130282992ebf",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=3ffd40db-0bb3-49c5-980a-da8bd9a94b96",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739769566"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=3ffd40db-0bb3-49c5-980a-da8bd9a94b96",
  "created_at": "2026-10-30T12:46:54.575976Z",
  "expires_at": "2026-10-30T13:16:54.575976Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/3ffd40db-0bb3-49c5-980a-da8bd9a94b96` → **200**

```json
{
  "id": "3ffd40db-0bb3-49c5-980a-da8bd9a94b96",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T12:46:54.575976Z",
  "expires_at": "2026-10-30T13:16:54.575976Z",
  "completed_at": "2026-10-30T12:46:54.811857Z",
  "masked_pan": "41****4379",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "92a5abde-a221-4ab5-87bd-be2b5b1670af",
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
      "id": "1b63a7f6-3a01-4766-ac89-64309a300442",
      "at": "2026-10-30T12:46:54.83656Z",
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
  "client_id": "92a5abde-a221-4ab5-87bd-be2b5b1670af",
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
      "id": "1b63a7f6-3a01-4766-ac89-64309a300442",
      "at": "2026-10-30T12:46:54.83656Z",
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
  "device_ref": "sandbox-21197"
}
```

```json
{
  "challenge_id": "20c0b421-02bb-4050-8548-ca771194c6ba",
  "expires_at": "2026-10-30T12:51:55.497206202Z",
  "resend_available_at": "2026-10-30T12:46:56.497206202Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "401515",
  "sent_at": "2026-10-30T12:46:55.499166135Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "20c0b421-02bb-4050-8548-ca771194c6ba",
  "code": "401515",
  "device_ref": "sandbox-21197"
}
```

```json
{
  "session_id": "b301f8b9-6f13-4162-b67c-0b50d85007f2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTMxNSwiaWF0IjoxNzkzMzY0NDE1LCJqdGkiOiIxY2Y0YTc3Yi00MmEyLTQwOGQtYjI0Yi0wYTNlNTQ3OWY5NTYiLCJzaWQiOiJiMzAxZjhiOS02ZjEzLTQxNjItYjY3Yy0wYjUwZDg1MDA3ZjIifQ.6zrc9CfUqufz5NOQO7tUhr5KGEMXBZ-OcQHnKA-tlfo",
  "access_expires_at": "2026-10-30T13:01:55.758219651Z",
  "refresh_token": "PzfD7CB7HCbipQqrxgy_TjJTrmC76I3Qla-qXABUuVM",
  "refresh_expires_at": "2026-11-29T12:46:55.757786553Z",
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
  "command_id": "7f1bbbf9-8323-4e8a-9d9c-f835c176822c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "44dd34c7-54d1-4946-a4f4-45af6f70f778",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-44dd34c7-54d1-4946-a4f4-45af6f70f778",
    "orderDate": "1793364416",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "e230451cc9a4bfe8b2b5e2d0e3749c31",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=44dd34c7-54d1-4946-a4f4-45af6f70f778",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=44dd34c7-54d1-4946-a4f4-45af6f70f778",
  "created_at": "2026-10-30T12:46:56.200886Z",
  "expires_at": "2026-10-30T13:16:56.200886Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/44dd34c7-54d1-4946-a4f4-45af6f70f778` → **200**

```json
{
  "id": "44dd34c7-54d1-4946-a4f4-45af6f70f778",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T12:46:56.200886Z",
  "expires_at": "2026-10-30T13:16:56.200886Z",
  "completed_at": "2026-10-30T12:46:56.426243Z",
  "masked_pan": "41****2637",
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
      "id": "7a8d0d48-eacb-4416-8ac2-c76c2ac4a7e3",
      "at": "2026-10-30T12:46:56.842946Z",
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
  "command_id": "f47126cb-4151-43c6-9f78-eb4ee3d390c8",
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
  "correlation_id": "580eb5b1-1bf4-480e-9745-e7f97c75a163"
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
  "device_ref": "sandbox-886"
}
```

```json
{
  "challenge_id": "85026736-5262-4a6c-8308-3e4c96e6524b",
  "expires_at": "2026-10-30T12:51:58.348262256Z",
  "resend_available_at": "2026-10-30T12:46:59.348262256Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "335152",
  "sent_at": "2026-10-30T12:46:58.350453171Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "85026736-5262-4a6c-8308-3e4c96e6524b",
  "code": "335152",
  "device_ref": "sandbox-886"
}
```

```json
{
  "session_id": "d093239a-c898-46d3-b495-3a8030a4e7d6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTMxOCwiaWF0IjoxNzkzMzY0NDE4LCJqdGkiOiI4MTJmYTc2NS1iZjI3LTQwOTEtYTI4My1lNzI4ZjJmOWUxYTAiLCJzaWQiOiJkMDkzMjM5YS1jODk4LTQ2ZDMtYjQ5NS0zYTgwMzBhNGU3ZDYifQ.Jqz3z37GjLxVsaZl0N9793-MfylTAFDNypfIHykzGRE",
  "access_expires_at": "2026-10-30T13:01:58.590058502Z",
  "refresh_token": "RWZNYfiQt9WyBOOqo3fhL27C5t_i5snsLKDAGfDWIfo",
  "refresh_expires_at": "2026-11-29T12:46:58.589633626Z",
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
  "command_id": "377cf9dd-3a07-4cfe-85be-e5f280321cce",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:46:59Z",
    "sequence": 1793364419412
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7c11707a-dacb-4a88-a65e-27462cda4f7e",
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
  "last_heartbeat_at": "2026-10-30T12:46:59.057802Z",
  "last_location_at": "2026-10-30T12:46:59.057802Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638329135",
  "device_ref": "sandbox-14057"
}
```

```json
{
  "challenge_id": "c4526432-2ec2-4bfa-9092-44ac1557d7de",
  "expires_at": "2026-10-30T12:51:59.283232189Z",
  "resend_available_at": "2026-10-30T12:47:00.283232189Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638329135` → **200**

```json
{
  "phone": "+380638329135",
  "audience": "CLIENT",
  "code": "093983",
  "sent_at": "2026-10-30T12:46:59.285374752Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c4526432-2ec2-4bfa-9092-44ac1557d7de",
  "code": "093983",
  "device_ref": "sandbox-14057"
}
```

```json
{
  "session_id": "1d669e3c-937a-4398-bd5a-870c725de111",
  "subject": {
    "type": "CLIENT",
    "id": "2a198951-94b1-413b-8db0-c0f414f32813"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTE5ODk1MS05NGIxLTQxM2ItOGRiMC1jMGY0MTRmMzI4MTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1MzE5LCJpYXQiOjE3OTMzNjQ0MTksImp0aSI6IjRlMTE5NzQ2LTY5Y2UtNDYyNC1hMjhhLWEyMGFjYWZjODIzZiIsInNpZCI6IjFkNjY5ZTNjLTkzN2EtNDM5OC1iZDVhLTg3MGM3MjVkZTExMSJ9.rVQPx1Z2fgT9CTlVPQWbNesZ2vsGrdg2tcc60GtIkYc",
  "access_expires_at": "2026-10-30T13:01:59.531145647Z",
  "refresh_token": "FV4xAuZ8TNRxWmqP8V1X-v3CE3WUj-t5uXQ9I_Raykg",
  "refresh_expires_at": "2026-11-29T12:46:59.530720761Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6972fea5-2701-4e3b-a08c-d3c117258828",
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
  "id": "937bcbf1-a593-45d0-806a-7795c66c590a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:51:59.764586Z",
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
  "command_id": "6d1e8775-22c4-4937-a959-a6f0f430fd64",
  "quote_id": "937bcbf1-a593-45d0-806a-7795c66c590a",
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
  "id": "05f746e0-5686-499c-8e75-0a3d1bdfb1d3",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a198951-94b1-413b-8db0-c0f414f32813",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:47:00.00036Z",
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
    "id": "c4f2bd16-116d-4674-ad50-87b0d38a27b5",
    "order_id": "05f746e0-5686-499c-8e75-0a3d1bdfb1d3",
    "expires_at": "2026-10-30T12:47:15.002635Z",
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

`POST /api/driver/v1/offers/c4f2bd16-116d-4674-ad50-87b0d38a27b5/accept` → **200**

```json
{
  "command_id": "dca8032a-761c-4ea9-b311-30f11fbf62b7"
}
```

```json
{
  "id": "1ea2b7be-a8a9-48e6-bcd1-981e6addf22b",
  "order_id": "05f746e0-5686-499c-8e75-0a3d1bdfb1d3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "49f5a25c-5329-44c5-aad0-8ea4c31494af",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "49f5a25c-5329-44c5-aad0-8ea4c31494af",
  "order_id": "05f746e0-5686-499c-8e75-0a3d1bdfb1d3",
  "assignment_id": "1ea2b7be-a8a9-48e6-bcd1-981e6addf22b",
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

`POST /api/driver/v1/work-sessions/7c11707a-dacb-4a88-a65e-27462cda4f7e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:47:01Z",
    "sequence": 1793364421952
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7c11707a-dacb-4a88-a65e-27462cda4f7e",
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
  "last_heartbeat_at": "2026-10-30T12:47:01.968225Z",
  "last_location_at": "2026-10-30T12:47:01.968225Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/49f5a25c-5329-44c5-aad0-8ea4c31494af/arrive` → **200**

```json
{
  "command_id": "a547abb9-17f9-4062-b8b9-1ba9f6d465f0",
  "expected_version": 0
}
```

```json
{
  "id": "49f5a25c-5329-44c5-aad0-8ea4c31494af",
  "order_id": "05f746e0-5686-499c-8e75-0a3d1bdfb1d3",
  "assignment_id": "1ea2b7be-a8a9-48e6-bcd1-981e6addf22b",
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
  "arrived_at": "2026-10-30T12:47:02.198165Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/49f5a25c-5329-44c5-aad0-8ea4c31494af/start` → **200**

```json
{
  "command_id": "98295ee3-d84d-4447-9c35-5bbf0b6af66c",
  "expected_version": 1
}
```

```json
{
  "id": "49f5a25c-5329-44c5-aad0-8ea4c31494af",
  "order_id": "05f746e0-5686-499c-8e75-0a3d1bdfb1d3",
  "assignment_id": "1ea2b7be-a8a9-48e6-bcd1-981e6addf22b",
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
  "arrived_at": "2026-10-30T12:47:02.198165Z",
  "started_at": "2026-10-30T12:47:02.433021Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/49f5a25c-5329-44c5-aad0-8ea4c31494af/complete` → **200**

```json
{
  "command_id": "380d77ec-fef9-4b86-87b1-b4b7eb3742b8",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:47:02Z",
  "cash_received": false
}
```

```json
{
  "id": "49f5a25c-5329-44c5-aad0-8ea4c31494af",
  "order_id": "05f746e0-5686-499c-8e75-0a3d1bdfb1d3",
  "assignment_id": "1ea2b7be-a8a9-48e6-bcd1-981e6addf22b",
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
  "arrived_at": "2026-10-30T12:47:02.198165Z",
  "started_at": "2026-10-30T12:47:02.433021Z",
  "completed_at": "2026-10-30T12:47:02.676017Z",
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
  "session_id": "23548eb6-d595-4890-9289-f3940e29c24f",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjUzMjMsImlhdCI6MTc5MzM2NDQyMywianRpIjoiNWVhZDkzZjUtYmY2Zi00MjY0LTk0ZWYtMDM5ODg2MWEzOGRjIiwic2lkIjoiMjM1NDhlYjYtZDU5NS00ODkwLTkyODktZjM5NDBlMjljMjRmIn0.iVbwjp7RT6DDIlP9gD8gW0q2P3ybzJ5h-dKVkgt3Z6M",
  "access_expires_at": "2026-10-30T13:02:03.172834717Z",
  "refresh_token": "ssTevYmq0hQV7b_nRsNot96ieJ4OIS617iHLS-522hQ",
  "refresh_expires_at": "2026-10-31T00:47:03.17238818Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/05f746e0-5686-499c-8e75-0a3d1bdfb1d3/cash-dispute` → **200**

```json
{
  "order_id": "05f746e0-5686-499c-8e75-0a3d1bdfb1d3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "2a198951-94b1-413b-8db0-c0f414f32813",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T12:47:02.887509Z",
  "decide_by": "2026-11-13T12:47:02.887509Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T12:47:02.887509Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "05f746e0-5686-499c-8e75-0a3d1bdfb1d3",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "2a198951-94b1-413b-8db0-c0f414f32813",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T12:47:02.887509Z",
      "decide_by": "2026-11-13T12:47:02.887509Z",
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

`POST /api/admin/v1/orders/05f746e0-5686-499c-8e75-0a3d1bdfb1d3/cash-dispute/decide` → **400**

```json
{
  "command_id": "ea2d96b2-9a63-4949-8a37-83807f2fa13f",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/05f746e0-5686-499c-8e75-0a3d1bdfb1d3/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "2bd37753-88e7-45a8-81c0-41497a328132",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/05f746e0-5686-499c-8e75-0a3d1bdfb1d3/cash-dispute/decide` → **200**

```json
{
  "command_id": "1fd25f59-e14d-48fb-bd39-8bf3fdee7f7a",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "05f746e0-5686-499c-8e75-0a3d1bdfb1d3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "2a198951-94b1-413b-8db0-c0f414f32813",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T12:47:02.887509Z",
  "decide_by": "2026-11-13T12:47:02.887509Z",
  "decision": "PAY_DRIVER",
  "decided_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T12:47:04.110348Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/05f746e0-5686-499c-8e75-0a3d1bdfb1d3/cash-dispute/decide` → **409**

```json
{
  "command_id": "bafd7dcc-dada-4349-83c3-d7c848fd0314",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/05f746e0-5686-499c-8e75-0a3d1bdfb1d3/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c93f4be4-ca47-4fcf-9bf6-c1016003df62"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7c11707a-dacb-4a88-a65e-27462cda4f7e",
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
  "last_heartbeat_at": "2026-10-30T12:47:01.968225Z",
  "last_location_at": "2026-10-30T12:47:01.968225Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7c11707a-dacb-4a88-a65e-27462cda4f7e/close` → **200**

```json
{
  "command_id": "a67df783-16ba-4d64-8ea9-bc2744956c75",
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
  "phone": "+380738974869",
  "device_ref": "sandbox-23998"
}
```

```json
{
  "challenge_id": "c94e38a7-dd5b-4c1e-b7ef-3d63fb7bd17f",
  "expires_at": "2026-10-30T12:52:05.03557146Z",
  "resend_available_at": "2026-10-30T12:47:06.03557146Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738974869` → **200**

```json
{
  "phone": "+380738974869",
  "audience": "CLIENT",
  "code": "882970",
  "sent_at": "2026-10-30T12:47:05.03949452Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c94e38a7-dd5b-4c1e-b7ef-3d63fb7bd17f",
  "code": "882970",
  "device_ref": "sandbox-23998"
}
```

```json
{
  "session_id": "800ee279-730a-4a20-b531-fca5a5208601",
  "subject": {
    "type": "CLIENT",
    "id": "7c449170-0dcf-494e-9885-8ff38f82b609"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzQ0OTE3MC0wZGNmLTQ5NGUtOTg4NS04ZmYzOGY4MmI2MDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1MzI1LCJpYXQiOjE3OTMzNjQ0MjUsImp0aSI6ImZhYzdjODc2LTE0MWItNDk2ZS05NDVkLTcxODdkOWJmZGZhOCIsInNpZCI6IjgwMGVlMjc5LTczMGEtNGEyMC1iNTMxLWZjYTVhNTIwODYwMSJ9.QQ8UKmwoG2VeDShrBl06KgkBpyEaM6QIOYLfRQnBnCE",
  "access_expires_at": "2026-10-30T13:02:05.284308596Z",
  "refresh_token": "fzqX4mAzwjRawaR1pfkKXXUdy9LPYuO0Iu5slLG7v_w",
  "refresh_expires_at": "2026-11-29T12:47:05.283437032Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "a9bd0a09-f724-49d7-8b4c-df3640827caf",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "248dbf98-855e-4cb1-9214-5ab7a8812ca0",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-248dbf98-855e-4cb1-9214-5ab7a8812ca0",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "4dff912b6c0443902b6651a8821b627f",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=248dbf98-855e-4cb1-9214-5ab7a8812ca0",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738974869"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=248dbf98-855e-4cb1-9214-5ab7a8812ca0",
  "expires_at": "2026-10-30T13:17:05.505883Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/248dbf98-855e-4cb1-9214-5ab7a8812ca0` → **200**

```json
{
  "id": "248dbf98-855e-4cb1-9214-5ab7a8812ca0",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:17:05.505883Z",
  "card": {
    "id": "61e8abf3-2747-4910-8e19-71ba329b8cec",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6228",
    "card_type": "Visa",
    "created_at": "2026-10-30T12:47:05.738731Z"
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
  "device_ref": "sandbox-4422"
}
```

```json
{
  "challenge_id": "f344d3e2-babd-4b0d-a7d6-adbe13f17246",
  "expires_at": "2026-10-30T12:52:05.985102093Z",
  "resend_available_at": "2026-10-30T12:47:06.985102093Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "005557",
  "sent_at": "2026-10-30T12:47:05.987264048Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f344d3e2-babd-4b0d-a7d6-adbe13f17246",
  "code": "005557",
  "device_ref": "sandbox-4422"
}
```

```json
{
  "session_id": "0c83ef12-93d3-4a81-bec6-5821d1943e80",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTMyNiwiaWF0IjoxNzkzMzY0NDI2LCJqdGkiOiIwYTBhYzU2Zi0wMmY2LTQ1NGItYmU0ZS0xNTJjNmRmY2NhOWQiLCJzaWQiOiIwYzgzZWYxMi05M2QzLTRhODEtYmVjNi01ODIxZDE5NDNlODAifQ.MD7QAMW1avqPmRSw2RTvsk8y_k_vYiXdgKC4REgrIy4",
  "access_expires_at": "2026-10-30T13:02:06.236315356Z",
  "refresh_token": "XfheOJAiShPd58d7nVKD6WNsyjMePjE14uAawFjk1ic",
  "refresh_expires_at": "2026-11-29T12:47:06.235882669Z",
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
  "command_id": "3d580d07-d172-4dfd-b5e7-236b45419f5c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:47:06Z",
    "sequence": 1793364426697
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "afcee047-b3f1-4a23-956e-424652894897",
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
  "last_heartbeat_at": "2026-10-30T12:47:06.714263Z",
  "last_location_at": "2026-10-30T12:47:06.714263Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6458cdf9-b27d-4625-95eb-7f00ea5004e8",
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
  "id": "74084c69-0dfb-477f-a30e-c375f3f4dc25",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:52:06.948159Z",
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
  "command_id": "c2f6f161-7ae4-409b-b276-075dd739dca2",
  "quote_id": "74084c69-0dfb-477f-a30e-c375f3f4dc25",
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
  "id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7c449170-0dcf-494e-9885-8ff38f82b609",
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
  "created_at": "2026-10-30T12:47:07.184553Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6d03bee5-1d24-4d13-914e-82c58ac7df1f` → **200**

```json
{
  "id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7c449170-0dcf-494e-9885-8ff38f82b609",
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
  "created_at": "2026-10-30T12:47:07.184553Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6d03bee5-1d24-4d13-914e-82c58ac7df1f` → **200**

```json
{
  "id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7c449170-0dcf-494e-9885-8ff38f82b609",
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
  "created_at": "2026-10-30T12:47:07.184553Z",
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
    "id": "38278385-3b69-4ef8-ab67-b1b12db746c1",
    "order_id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
    "expires_at": "2026-10-30T12:47:22.919438Z",
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

`POST /api/driver/v1/offers/38278385-3b69-4ef8-ab67-b1b12db746c1/accept` → **200**

```json
{
  "command_id": "e7368bfb-cdcb-4e14-b96e-cdf940cf7e1a"
}
```

```json
{
  "id": "ac999dd7-2d27-4e8b-b4fe-b1e3f8680e47",
  "order_id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "724061a5-6274-4e8b-a19d-ae8cc7076f93",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "724061a5-6274-4e8b-a19d-ae8cc7076f93",
  "order_id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
  "assignment_id": "ac999dd7-2d27-4e8b-b4fe-b1e3f8680e47",
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

`POST /api/rider/v1/orders/6d03bee5-1d24-4d13-914e-82c58ac7df1f/messages` → **201**

```json
{
  "command_id": "10abc572-e06e-42cd-9ed0-5c2a6c44e028",
  "body": "Я біля входу, мій номер +380738974869, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "c803b2b8-6a4e-4367-8bc9-00419d84e4fd",
  "order_id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380738974869, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T12:47:09.569732054Z"
}
```

`POST /api/driver/v1/trips/724061a5-6274-4e8b-a19d-ae8cc7076f93/messages` → **201**

```json
{
  "command_id": "b4ce527b-f66e-41d3-a48f-8851dc37a46b",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "01110728-e6c2-4c9e-a38d-d4054bf32a30",
  "order_id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T12:47:09.805174652Z"
}
```

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/afcee047-b3f1-4a23-956e-424652894897/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:47:15Z",
    "sequence": 1793364435439
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "afcee047-b3f1-4a23-956e-424652894897",
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
  "last_heartbeat_at": "2026-10-30T12:47:15.0601Z",
  "last_location_at": "2026-10-30T12:47:15.0601Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/724061a5-6274-4e8b-a19d-ae8cc7076f93/arrive` → **200**

```json
{
  "command_id": "ef9ed03b-ecb6-4292-a16d-e7f5869e5f60",
  "expected_version": 0
}
```

```json
{
  "id": "724061a5-6274-4e8b-a19d-ae8cc7076f93",
  "order_id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
  "assignment_id": "ac999dd7-2d27-4e8b-b4fe-b1e3f8680e47",
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
  "arrived_at": "2026-10-30T12:47:15.291981Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/724061a5-6274-4e8b-a19d-ae8cc7076f93/start` → **200**

```json
{
  "command_id": "5a1e2568-007e-452a-8398-047c77992c71",
  "expected_version": 1
}
```

```json
{
  "id": "724061a5-6274-4e8b-a19d-ae8cc7076f93",
  "order_id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
  "assignment_id": "ac999dd7-2d27-4e8b-b4fe-b1e3f8680e47",
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
  "arrived_at": "2026-10-30T12:47:15.291981Z",
  "started_at": "2026-10-30T12:47:15.532279Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 91 s to the next point)

`POST /api/driver/v1/work-sessions/afcee047-b3f1-4a23-956e-424652894897/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:48:46Z",
    "sequence": 1793364526777
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "afcee047-b3f1-4a23-956e-424652894897",
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
  "last_heartbeat_at": "2026-10-30T12:48:46.797261Z",
  "last_location_at": "2026-10-30T12:48:46.797261Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/724061a5-6274-4e8b-a19d-ae8cc7076f93/complete` → **200**

```json
{
  "command_id": "9f1649f9-1a8f-4fbf-901a-f26bf05ed064",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:48:47Z",
  "cash_received": false
}
```

```json
{
  "id": "724061a5-6274-4e8b-a19d-ae8cc7076f93",
  "order_id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
  "assignment_id": "ac999dd7-2d27-4e8b-b4fe-b1e3f8680e47",
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
  "arrived_at": "2026-10-30T12:47:15.291981Z",
  "started_at": "2026-10-30T12:47:15.532279Z",
  "completed_at": "2026-10-30T12:48:47.030655Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/6d03bee5-1d24-4d13-914e-82c58ac7df1f` → **200**

```json
{
  "id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7c449170-0dcf-494e-9885-8ff38f82b609",
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
    "id": "ac999dd7-2d27-4e8b-b4fe-b1e3f8680e47",
    "order_id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "724061a5-6274-4e8b-a19d-ae8cc7076f93",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:47:07.184553Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6d03bee5-1d24-4d13-914e-82c58ac7df1f` → **200**

```json
{
  "id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7c449170-0dcf-494e-9885-8ff38f82b609",
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
    "id": "ac999dd7-2d27-4e8b-b4fe-b1e3f8680e47",
    "order_id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "724061a5-6274-4e8b-a19d-ae8cc7076f93",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:47:07.184553Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6d03bee5-1d24-4d13-914e-82c58ac7df1f` → **200**

```json
{
  "id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "7c449170-0dcf-494e-9885-8ff38f82b609",
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
    "id": "ac999dd7-2d27-4e8b-b4fe-b1e3f8680e47",
    "order_id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "724061a5-6274-4e8b-a19d-ae8cc7076f93",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:47:07.184553Z",
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
  "session_id": "afcee047-b3f1-4a23-956e-424652894897",
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
  "last_heartbeat_at": "2026-10-30T12:48:46.797261Z",
  "last_location_at": "2026-10-30T12:48:46.797261Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/afcee047-b3f1-4a23-956e-424652894897/close` → **200**

```json
{
  "command_id": "abc1afaa-d7ce-43e9-a721-2eaa92eabbbe",
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
  "session_id": "273e8b5d-6ca9-430f-84fb-d3e5853b7d36",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU0MzAsImlhdCI6MTc5MzM2NDUzMCwianRpIjoiYmI4ZjI4MGYtZjk1Ni00NWJjLTg0MGYtN2Q5NTFlZmQ3OGM0Iiwic2lkIjoiMjczZThiNWQtNmNhOS00MzBmLTg0ZmItZDNlNTg1M2I3ZDM2In0.PH3dl6e5fC17d2KDllXmuCmKS-eWvg8dbXyVH3dCQ5g",
  "access_expires_at": "2026-10-30T13:03:50.796541199Z",
  "refresh_token": "PpEUIlBnvuXZ-xsdWwx6XaWquOlTMo8KQoiHAkay9yA",
  "refresh_expires_at": "2026-10-31T00:48:50.79606007Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/6d03bee5-1d24-4d13-914e-82c58ac7df1f/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/6d03bee5-1d24-4d13-914e-82c58ac7df1f/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "2475d57b-9470-4b6e-8512-473f09670f7d"
}
```

`GET /api/admin/v1/orders/6d03bee5-1d24-4d13-914e-82c58ac7df1f/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T12:48:51.250530056Z",
  "order": {
    "id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
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
    "created_at": "2026-10-30T12:47:07.184553Z",
    "assigned_at": "2026-10-30T12:47:09.122641Z",
    "arrived_at": "2026-10-30T12:47:15.291981Z",
    "started_at": "2026-10-30T12:47:15.532279Z",
    "completed_at": "2026-10-30T12:48:47.030655Z"
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
    "id": "7c449170-0dcf-494e-9885-8ff38f82b609",
    "registered_at": "2026-10-30T12:47:05.281717Z",
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
      "created_at": "2026-10-30T12:47:07.186903Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T12:48:47.072321Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/6d03bee5-1d24-4d13-914e-82c58ac7df1f/chargebacks` → **422**

```json
{
  "command_id": "33f8528d-c1ee-4a8a-a4be-4774c7508d7d",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/6d03bee5-1d24-4d13-914e-82c58ac7df1f/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "46f21af0-245c-43f7-93bb-c3f62bb1070e"
}
```

`POST /api/admin/v1/orders/6d03bee5-1d24-4d13-914e-82c58ac7df1f/chargebacks` → **201**

```json
{
  "command_id": "6b29046f-030f-4d47-8104-88c564928f4f",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "d6567c48-82c6-4f99-b275-c195f44eca00",
  "order_id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T12:48:51.770687Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/6d03bee5-1d24-4d13-914e-82c58ac7df1f/chargebacks` → **201**

```json
{
  "command_id": "6b29046f-030f-4d47-8104-88c564928f4f",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "d6567c48-82c6-4f99-b275-c195f44eca00",
  "order_id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T12:48:51.770687Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/7c449170-0dcf-494e-9885-8ff38f82b609` → **200**

```json
{
  "client": {
    "id": "7c449170-0dcf-494e-9885-8ff38f82b609",
    "phone": "+380738974869",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:47:05.281717Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T12:47:07.184553Z",
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

`GET /api/admin/v1/clients/7c449170-0dcf-494e-9885-8ff38f82b609` → **200**

```json
{
  "client": {
    "id": "7c449170-0dcf-494e-9885-8ff38f82b609",
    "phone": "+380738974869",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:47:05.281717Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T12:47:07.184553Z",
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

`POST /api/admin/v1/orders/6d03bee5-1d24-4d13-914e-82c58ac7df1f/chargebacks/d6567c48-82c6-4f99-b275-c195f44eca00/resolve` → **200**

```json
{
  "command_id": "aea29b4d-ee35-412c-8592-f8601c2bf9e7",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "d6567c48-82c6-4f99-b275-c195f44eca00",
  "order_id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T12:48:51.770687Z",
  "resolved_at": "2026-10-30T12:48:53.740835Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/7c449170-0dcf-494e-9885-8ff38f82b609` → **200**

```json
{
  "client": {
    "id": "7c449170-0dcf-494e-9885-8ff38f82b609",
    "phone": "+380738974869",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:47:05.281717Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T12:47:07.184553Z",
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

`GET /api/admin/v1/clients/7c449170-0dcf-494e-9885-8ff38f82b609` → **200**

```json
{
  "client": {
    "id": "7c449170-0dcf-494e-9885-8ff38f82b609",
    "phone": "+380738974869",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:47:05.281717Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T12:47:07.184553Z",
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

`POST /api/admin/v1/orders/6d03bee5-1d24-4d13-914e-82c58ac7df1f/chargebacks/d6567c48-82c6-4f99-b275-c195f44eca00/resolve` → **409**

```json
{
  "command_id": "7c9cfcd9-198d-40bb-ad75-985a460e8a63",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/6d03bee5-1d24-4d13-914e-82c58ac7df1f/chargebacks/d6567c48-82c6-4f99-b275-c195f44eca00/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b230fea0-f1a2-422f-8166-c2a26ae9156c"
}
```

`GET /api/admin/v1/orders/6d03bee5-1d24-4d13-914e-82c58ac7df1f/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "d6567c48-82c6-4f99-b275-c195f44eca00",
      "order_id": "6d03bee5-1d24-4d13-914e-82c58ac7df1f",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T12:48:51.770687Z",
      "resolved_at": "2026-10-30T12:48:53.740835Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 6d03bee5-1d24-4d13-914e-82c58ac7df1f without phone or card digits; chargeback d6567c48-82c6-4f99-b275-c195f44eca00 recorded and won.

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
  "session_id": "93e48ca2-f4d5-46f5-ada3-71efe80b6c9a",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU0MzYsImlhdCI6MTc5MzM2NDUzNiwianRpIjoiZDcxM2RlNDAtZDM5My00YWIxLWJiYWEtYTgwNjRmNTU0MWY0Iiwic2lkIjoiOTNlNDhjYTItZjRkNS00NmY1LWFkYTMtNzFlZmU4MGI2YzlhIn0.c__i7gt0Zn2my4V9wUKXpSBiF6wowaD4JG5Lj3sEafA",
  "access_expires_at": "2026-10-30T13:03:56.401949554Z",
  "refresh_token": "QS2cqGQ_utEYXkunaKwS-w8VTxGGVD2rSG801QAocpw",
  "refresh_expires_at": "2026-10-31T00:48:56.401522835Z",
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
  "phone": "+48600100124",
  "device_ref": "sandbox-18565"
}
```

```json
{
  "challenge_id": "b96133ba-3787-450b-a5d5-bd5c872035ac",
  "expires_at": "2026-10-30T12:53:57.076678246Z",
  "resend_available_at": "2026-10-30T12:48:58.076678246Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600100124` → **200**

```json
{
  "phone": "+48600100124",
  "audience": "CLIENT",
  "code": "585669",
  "sent_at": "2026-10-30T12:48:57.079285357Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b96133ba-3787-450b-a5d5-bd5c872035ac",
  "code": "585669",
  "device_ref": "sandbox-18565"
}
```

```json
{
  "session_id": "4f2028b5-51f1-43d7-943f-34becb126227",
  "subject": {
    "type": "CLIENT",
    "id": "1a1999fb-e78f-4beb-bd5b-49345cfab60e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYTE5OTlmYi1lNzhmLTRiZWItYmQ1Yi00OTM0NWNmYWI2MGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1NDM3LCJpYXQiOjE3OTMzNjQ1MzcsImp0aSI6ImE4MWNmYzA1LTI2MmYtNDk0YS05MjljLTczOTFlMTJiZjY5OSIsInNpZCI6IjRmMjAyOGI1LTUxZjEtNDNkNy05NDNmLTM0YmVjYjEyNjIyNyJ9.-pYA8O_N77yuPePE7Sb5DVhzCfsFLKgpYjVRIwlzeq0",
  "access_expires_at": "2026-10-30T13:03:57.324528505Z",
  "refresh_token": "CrrQXKU3hFA95vmYMhqEJX1TbeUs-EAN08JPWaAwz34",
  "refresh_expires_at": "2026-11-29T12:48:57.324094977Z",
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
  "command_id": "d69888d9-aa8a-446f-8ed8-b28929cecbf9",
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
  "correlation_id": "c320056a-19a6-4111-82ea-cfb26dd99a71",
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
  "command_id": "236e1c71-9285-4c50-9483-fd83cfcd5183",
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
  "paused_at": "2026-10-30T12:48:58.219901919Z",
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
  "command_id": "e0af05b4-412d-46e6-b6a8-414f36c6966a",
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
  "id": "48280940-2446-41f8-81ef-c5bd55a0469d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:53:58.726305Z",
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
  "command_id": "1b85f5c5-f7ed-496d-8979-d4890a68c3e0",
  "quote_id": "48280940-2446-41f8-81ef-c5bd55a0469d",
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
  "correlation_id": "cfb7f238-909f-466c-a2b2-ea0efc05ae45"
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
  "paused_at": "2026-10-30T12:48:58.219902Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "313cdcbd-5fd9-4fc4-ba9c-43f57e2b4208",
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
  "command_id": "c88eb018-ec2e-4aea-ba21-3b7700613a82",
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
  "command_id": "8f97f88c-f845-4e2c-8925-879bc6b2db70",
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
  "id": "db98b5ca-092d-4214-afb9-1988cfff8799",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:54:00.095046Z",
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
  "command_id": "1a827aea-e44d-4ba1-8963-84592d0d0643",
  "quote_id": "db98b5ca-092d-4214-afb9-1988cfff8799",
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
  "correlation_id": "aec249ac-6a4a-4a17-94cb-ba876e6025bb"
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
  "command_id": "419f516d-4901-422c-82d3-c25cc16a1733",
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
  "command_id": "0095643c-0185-43cf-8aba-8d9c7aa4f7f3",
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
  "id": "a63234b5-99bb-4028-ac47-99797432095d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:54:01.014173Z",
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
  "command_id": "09334ef0-340f-49a3-ad8d-504938fa27e5",
  "quote_id": "a63234b5-99bb-4028-ac47-99797432095d",
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
  "correlation_id": "87314c77-ca8c-4bf8-8692-1b6ef86d5d1d"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "c9c76724-09d1-446c-b645-daf564b27674",
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
  "correlation_id": "6b8f1043-fca2-4168-b587-6a31dbb8e23d",
  "current_version": 4
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
  "command_id": "e0cc0729-0dba-4e15-98ff-d5cf6b220a17",
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
  "phone": "+380678497031",
  "device_ref": "sandbox-17382"
}
```

```json
{
  "challenge_id": "8446e85c-68a1-46c9-bedd-fa6696487817",
  "expires_at": "2026-10-30T12:54:02.199702157Z",
  "resend_available_at": "2026-10-30T12:49:03.199702157Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678497031` → **200**

```json
{
  "phone": "+380678497031",
  "audience": "CLIENT",
  "code": "972511",
  "sent_at": "2026-10-30T12:49:02.20196429Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8446e85c-68a1-46c9-bedd-fa6696487817",
  "code": "972511",
  "device_ref": "sandbox-17382"
}
```

```json
{
  "session_id": "264b4066-9627-451b-800e-0749b994d15f",
  "subject": {
    "type": "CLIENT",
    "id": "6e9ecc89-e46d-44b9-95db-bc9c9db0aafe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTllY2M4OS1lNDZkLTQ0YjktOTVkYi1iYzljOWRiMGFhZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1NDQyLCJpYXQiOjE3OTMzNjQ1NDIsImp0aSI6IjA1NTMzOGRjLTY5OWItNDkyMy04NjVjLWQ4ZGVkYmY4ZmNkMCIsInNpZCI6IjI2NGI0MDY2LTk2MjctNDUxYi04MDBlLTA3NDliOTk0ZDE1ZiJ9.YYmJXvifxU2LJlKH5cTIX5-pCN2H_nMOzEGX-I03TuY",
  "access_expires_at": "2026-10-30T13:04:02.447349487Z",
  "refresh_token": "TNmZoxieT25DOOqwyTeUDE8A9Hf6zMkfWnuzUlg8Eoc",
  "refresh_expires_at": "2026-11-29T12:49:02.446912393Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6e9ecc89-e46d-44b9-95db-bc9c9db0aafe",
  "session_id": "264b4066-9627-451b-800e-0749b994d15f",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2b14b161-a47f-4f94-bdfa-4cb46e510c88",
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
  "id": "50f06143-a784-4bc7-84a3-d3b4c3413518",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:54:02.890479Z",
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
  "challenge_id": "67e64938-7700-4819-ae15-d41da36c3d54",
  "expires_at": "2026-10-30T12:54:05.118039047Z",
  "resend_available_at": "2026-10-30T12:49:06.118039047Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678497031` → **200**

```json
{
  "phone": "+380678497031",
  "audience": "CLIENT",
  "code": "220980",
  "sent_at": "2026-10-30T12:49:05.119797901Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "8e749b3d-db9b-4241-9f47-3c064ef70d64",
  "challenge_id": "67e64938-7700-4819-ae15-d41da36c3d54",
  "otp_code": "220980"
}
```

```json
{
  "client_id": "6e9ecc89-e46d-44b9-95db-bc9c9db0aafe",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T12:49:05.373258225Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "80377fbe-0954-40a8-b591-ed54046a9f21",
  "quote_id": "50f06143-a784-4bc7-84a3-d3b4c3413518",
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
  "correlation_id": "dc47ff9c-dfba-447a-830e-428be12d6fba"
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
  "session_id": "0e610e99-2684-4d7f-93de-decb92afed12",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU0NDYsImlhdCI6MTc5MzM2NDU0NiwianRpIjoiNGQyMzIyMzEtNjg5NC00Y2IyLWEwOGUtYjdlNmI5MTIyYzgxIiwic2lkIjoiMGU2MTBlOTktMjY4NC00ZDdmLTkzZGUtZGVjYjkyYWZlZDEyIn0.NOyHoi2KNWNoNvCXj5DM0wkUjCIEzWXUIQa0OBu3PoY",
  "access_expires_at": "2026-10-30T13:04:06.090100678Z",
  "refresh_token": "t_XZN21Sswrx6DM7lOVFuJ-X5fMHt5zs3eikkT8Y0j4",
  "refresh_expires_at": "2026-10-31T00:49:06.089680368Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "6e9ecc89-e46d-44b9-95db-bc9c9db0aafe",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T12:49:05.373258Z",
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

`POST /api/admin/v1/client-deletions/6e9ecc89-e46d-44b9-95db-bc9c9db0aafe/complete` → **200**

```json
{
  "command_id": "799ddef1-120a-4f80-8038-849745978bd4",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "6e9ecc89-e46d-44b9-95db-bc9c9db0aafe",
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
  "correlation_id": "45b6f503-88c0-4e10-b076-0961496a400d"
}
```

Done: client 6e9ecc89-e46d-44b9-95db-bc9c9db0aafe anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660483451",
  "device_ref": "sandbox-11451"
}
```

```json
{
  "challenge_id": "73520f7a-545d-4a7d-b01b-ab60a57fb269",
  "expires_at": "2026-10-30T12:54:06.994703449Z",
  "resend_available_at": "2026-10-30T12:49:07.994703449Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660483451` → **200**

```json
{
  "phone": "+380660483451",
  "audience": "CLIENT",
  "code": "441528",
  "sent_at": "2026-10-30T12:49:06.997443262Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "73520f7a-545d-4a7d-b01b-ab60a57fb269",
  "code": "441528",
  "device_ref": "sandbox-11451"
}
```

```json
{
  "session_id": "93608587-1b4a-4ce2-9880-780cf4356d95",
  "subject": {
    "type": "CLIENT",
    "id": "a85288fc-5de0-45aa-b9de-3ee7ca6a638d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODUyODhmYy01ZGUwLTQ1YWEtYjlkZS0zZWU3Y2E2YTYzOGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1NDQ3LCJpYXQiOjE3OTMzNjQ1NDcsImp0aSI6IjE5NDRlZGU5LTM1YzUtNDYxOS1hNjk1LTYxNmY5NzU2YjM4MyIsInNpZCI6IjkzNjA4NTg3LTFiNGEtNGNlMi05ODgwLTc4MGNmNDM1NmQ5NSJ9.S9GPpJhkvD7tuq7ZbjXi9cMkPPO52rThS-cDnAEkmbk",
  "access_expires_at": "2026-10-30T13:04:07.248538977Z",
  "refresh_token": "C7_DN3Nfml-6POpuPdC_BkPvQ0Uy72kWlK86iDeqxuQ",
  "refresh_expires_at": "2026-11-29T12:49:07.248106218Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a85288fc-5de0-45aa-b9de-3ee7ca6a638d",
  "session_id": "93608587-1b4a-4ce2-9880-780cf4356d95",
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
  "session_id": "54a655e0-8253-4075-89f7-1c11391d729e",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU0NDcsImlhdCI6MTc5MzM2NDU0NywianRpIjoiNmExZTA5NDQtMmFlMS00NjU4LTgyYTQtYmQyNjg2MzY5ZDMzIiwic2lkIjoiNTRhNjU1ZTAtODI1My00MDc1LTg5ZjctMWMxMTM5MWQ3MjllIn0.n3m1cr0aoBOlE2tqonAXF7ksF5_BxWI9FcypWYmdJrk",
  "access_expires_at": "2026-10-30T13:04:07.945930391Z",
  "refresh_token": "eq17sS8wuvaj5Hebc2mEBlC0mPCz_al-ke4awucZwD0",
  "refresh_expires_at": "2026-10-31T00:49:07.945514748Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0483451&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "a85288fc-5de0-45aa-b9de-3ee7ca6a638d",
      "phone": "+380660483451",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T12:49:07.246704Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/a85288fc-5de0-45aa-b9de-3ee7ca6a638d` → **200**

```json
{
  "client": {
    "id": "a85288fc-5de0-45aa-b9de-3ee7ca6a638d",
    "phone": "+380660483451",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:49:07.246704Z",
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

`POST /api/admin/v1/clients/a85288fc-5de0-45aa-b9de-3ee7ca6a638d/block` → **400**

```json
{
  "command_id": "16ec4622-62c6-4d7a-a08b-4e60aa8f3e28",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/a85288fc-5de0-45aa-b9de-3ee7ca6a638d/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "afe6d72a-a682-43b0-9f84-852005a869f4",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/a85288fc-5de0-45aa-b9de-3ee7ca6a638d/block` → **200**

```json
{
  "command_id": "7984307b-7a95-42ea-9e42-c155515703ac",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "a85288fc-5de0-45aa-b9de-3ee7ca6a638d",
  "phone": "+380660483451",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T12:49:07.246704Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T12:49:08.882609Z",
    "by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
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
  "correlation_id": "c28431bd-d2ed-4684-ac62-27cdd6fecc72"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660483451",
  "device_ref": "sandbox-2815"
}
```

```json
{
  "challenge_id": "a2c08070-0ffe-406f-adad-89874dbb42cc",
  "expires_at": "2026-10-30T12:54:11.339370393Z",
  "resend_available_at": "2026-10-30T12:49:12.339370393Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660483451` → **200**

```json
{
  "phone": "+380660483451",
  "audience": "CLIENT",
  "code": "696402",
  "sent_at": "2026-10-30T12:49:11.342282363Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "a2c08070-0ffe-406f-adad-89874dbb42cc",
  "code": "696402",
  "device_ref": "sandbox-2815"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "fdec09cf-a5ef-4eea-bb82-56bbb8e20141"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/a85288fc-5de0-45aa-b9de-3ee7ca6a638d` → **200**

```json
{
  "client": {
    "id": "a85288fc-5de0-45aa-b9de-3ee7ca6a638d",
    "phone": "+380660483451",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T12:49:07.246704Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T12:49:08.882609Z",
      "by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
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

`POST /api/admin/v1/clients/a85288fc-5de0-45aa-b9de-3ee7ca6a638d/unblock` → **200**

```json
{
  "command_id": "2efb157e-08ba-42c7-bd19-18b48dbe3832",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "a85288fc-5de0-45aa-b9de-3ee7ca6a638d",
  "phone": "+380660483451",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T12:49:07.246704Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660483451",
  "device_ref": "sandbox-17896"
}
```

```json
{
  "challenge_id": "e8c2eca9-abe7-4c1f-8f84-99051c0cf819",
  "expires_at": "2026-10-30T12:54:14.297150341Z",
  "resend_available_at": "2026-10-30T12:49:15.297150341Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660483451` → **200**

```json
{
  "phone": "+380660483451",
  "audience": "CLIENT",
  "code": "677049",
  "sent_at": "2026-10-30T12:49:14.300127921Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e8c2eca9-abe7-4c1f-8f84-99051c0cf819",
  "code": "677049",
  "device_ref": "sandbox-17896"
}
```

```json
{
  "session_id": "f4b9278f-28f5-49c5-9d5a-06860737d060",
  "subject": {
    "type": "CLIENT",
    "id": "a85288fc-5de0-45aa-b9de-3ee7ca6a638d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODUyODhmYy01ZGUwLTQ1YWEtYjlkZS0zZWU3Y2E2YTYzOGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1NDU0LCJpYXQiOjE3OTMzNjQ1NTQsImp0aSI6IjMzM2QyM2NjLTdhOTgtNDkyMS1hMThmLWE4ZDhhN2M4NWQxZiIsInNpZCI6ImY0YjkyNzhmLTI4ZjUtNDljNS05ZDVhLTA2ODYwNzM3ZDA2MCJ9.P8M890lK_VwdlV5EfQ3OcPqASjCPWGVgJUaZzJAI98Q",
  "access_expires_at": "2026-10-30T13:04:14.549144379Z",
  "refresh_token": "Ek18A5-4tv3c2fi1PfqBs5ymHB_vzLrWYHi4m1aWdqo",
  "refresh_expires_at": "2026-11-29T12:49:14.548701936Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a85288fc-5de0-45aa-b9de-3ee7ca6a638d",
  "session_id": "f4b9278f-28f5-49c5-9d5a-06860737d060",
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
  "phone": "+380667904625",
  "device_ref": "sandbox-21869"
}
```

```json
{
  "challenge_id": "f0eeb40e-4b83-422d-80fa-7df62c96fef1",
  "expires_at": "2026-10-30T12:54:15.004059835Z",
  "resend_available_at": "2026-10-30T12:49:16.004059835Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667904625` → **200**

```json
{
  "phone": "+380667904625",
  "audience": "CLIENT",
  "code": "881484",
  "sent_at": "2026-10-30T12:49:15.006234037Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0eeb40e-4b83-422d-80fa-7df62c96fef1",
  "code": "881484",
  "device_ref": "sandbox-21869"
}
```

```json
{
  "session_id": "c29a4d34-d74e-4253-ba8b-6e3667012f95",
  "subject": {
    "type": "CLIENT",
    "id": "9588deef-9a17-4212-beb2-28f24eb496d7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NTg4ZGVlZi05YTE3LTQyMTItYmViMi0yOGYyNGViNDk2ZDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1NDU1LCJpYXQiOjE3OTMzNjQ1NTUsImp0aSI6IjEwNTU3ZDA4LTM2MzgtNDk1Ny05OTdlLTJkYmU5MjFlZGIzYSIsInNpZCI6ImMyOWE0ZDM0LWQ3NGUtNDI1My1iYThiLTZlMzY2NzAxMmY5NSJ9.Pd11jGA7RqRxybfKKaAT5e71j-B5zfEGhvJTehmm28A",
  "access_expires_at": "2026-10-30T13:04:15.246924333Z",
  "refresh_token": "2RIUCYNSHWojSPxsgNwTn9SiBLdm6GNiNpvocBVcZJc",
  "refresh_expires_at": "2026-11-29T12:49:15.246511583Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2cfa0ad6-cde4-46b6-942f-07e4f3102ddc",
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
  "id": "45448af1-fef3-4317-88a6-e30357ca868d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:54:15.472687Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 415c5550-1e39-44a5-be2a-e5bdb1162aba) → **201**

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
  "session_id": "992875e2-8f73-4768-a306-cd331cf6e669",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU0NTUsImlhdCI6MTc5MzM2NDU1NSwianRpIjoiZmJmODk4OTgtMTc4Yi00ZjU3LTg3MzEtYzZlZWE3OWIwM2ZkIiwic2lkIjoiOTkyODc1ZTItOGY3My00NzY4LWEzMDYtY2QzMzFjZjZlNjY5In0.toQqe9EC99RqKDWnzVaS_lLni7iJ84fNIazpwNKSCAY",
  "access_expires_at": "2026-10-30T13:04:15.990557487Z",
  "refresh_token": "cYLOk0gPEDvWyi6DW79pk4DgONluUYpWSM5FG0fmpSc",
  "refresh_expires_at": "2026-10-31T00:49:15.990038942Z",
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
  "session_id": "b5a22e17-d7c9-4a77-ae1f-940c53e8a4b9",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU0NTYsImlhdCI6MTc5MzM2NDU1NiwianRpIjoiMDE1YTRlYzgtZTg3ZS00YmNiLWE4N2ItMTU1NjEwM2Q3YTRhIiwic2lkIjoiYjVhMjJlMTctZDdjOS00YTc3LWFlMWYtOTQwYzUzZThhNGI5In0.-2wTkQvmstk-sVHQtyGTWUieIXbGQ9e6iuZOQ8v5Iok",
  "access_expires_at": "2026-10-30T13:04:16.471916806Z",
  "refresh_token": "cihMAatlAeUNRekZfaictSgKUB8pFfKUQPa80I0O9aE",
  "refresh_expires_at": "2026-10-31T00:49:16.471407716Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6219bfb3-c09c-4b51-86d7-597cb9eb43dc/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T12:49:15.705049Z",
      "actor": {
        "type": "CLIENT",
        "id": "9588deef-9a17-4212-beb2-28f24eb496d7",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6219bfb3-c09c-4b51-86d7-597cb9eb43dc",
        "quote_id": "45448af1-fef3-4317-88a6-e30357ca868d",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "415c5550-1e39-44a5-be2a-e5bdb1162aba"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T12:49:15.706472Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6219bfb3-c09c-4b51-86d7-597cb9eb43dc",
        "attempt_id": "3946477a-ecfe-4d68-9ffc-7e93fcab99ec",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "415c5550-1e39-44a5-be2a-e5bdb1162aba"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T12:49:15.712137Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6219bfb3-c09c-4b51-86d7-597cb9eb43dc",
        "attempt_id": "3946477a-ecfe-4d68-9ffc-7e93fcab99ec"
      },
      "correlation_id": "415c5550-1e39-44a5-be2a-e5bdb1162aba"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "3946477a-ecfe-4d68-9ffc-7e93fcab99ec",
        "generation": 1,
        "started_at": "2026-10-30T12:49:15.705763Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T12:49:15.712137Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T12:49:15.706942Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/415c5550-1e39-44a5-be2a-e5bdb1162aba` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "6219bfb3-c09c-4b51-86d7-597cb9eb43dc:0",
      "order_id": "6219bfb3-c09c-4b51-86d7-597cb9eb43dc",
      "at": "2026-10-30T12:49:15.705049Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "6219bfb3-c09c-4b51-86d7-597cb9eb43dc:1",
      "order_id": "6219bfb3-c09c-4b51-86d7-597cb9eb43dc",
      "at": "2026-10-30T12:49:15.706472Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "6219bfb3-c09c-4b51-86d7-597cb9eb43dc:2",
      "order_id": "6219bfb3-c09c-4b51-86d7-597cb9eb43dc",
      "at": "2026-10-30T12:49:15.712137Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/65646974-3fde-4996-9f34-fd0719a86bc2` → **200**

```json
{
  "found": []
}
```

Done: request 415c5550-1e39-44a5-be2a-e5bdb1162aba — order 6219bfb3-c09c-4b51-86d7-597cb9eb43dc found by its id.

`GET /api/rider/v1/orders/6219bfb3-c09c-4b51-86d7-597cb9eb43dc` → **200**

```json
{
  "id": "6219bfb3-c09c-4b51-86d7-597cb9eb43dc",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9588deef-9a17-4212-beb2-28f24eb496d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:49:15.704622Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/6219bfb3-c09c-4b51-86d7-597cb9eb43dc/cancel` → **200**

```json
{
  "command_id": "3f78191f-10b3-4b70-b668-efc18066375f",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6219bfb3-c09c-4b51-86d7-597cb9eb43dc",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9588deef-9a17-4212-beb2-28f24eb496d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:49:15.704622Z",
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
  "phone": "+380638876069",
  "device_ref": "sandbox-28105"
}
```

```json
{
  "challenge_id": "aa28db1d-6ce9-45c8-897c-22675eb02334",
  "expires_at": "2026-10-30T12:54:17.866248449Z",
  "resend_available_at": "2026-10-30T12:49:18.866248449Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638876069` → **200**

```json
{
  "phone": "+380638876069",
  "audience": "CLIENT",
  "code": "299666",
  "sent_at": "2026-10-30T12:49:17.868296817Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa28db1d-6ce9-45c8-897c-22675eb02334",
  "code": "299666",
  "device_ref": "sandbox-28105"
}
```

```json
{
  "session_id": "683a6ff5-9f66-42a5-8d9f-50cd603f1f66",
  "subject": {
    "type": "CLIENT",
    "id": "780235d0-c2d5-4149-bd3c-ac2139a06d47"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ODAyMzVkMC1jMmQ1LTQxNDktYmQzYy1hYzIxMzlhMDZkNDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1NDU4LCJpYXQiOjE3OTMzNjQ1NTgsImp0aSI6IjdhMmQ5ODIxLTBjYTMtNDFmYi1iNzg1LTQxZGQzZjViMTc2NCIsInNpZCI6IjY4M2E2ZmY1LTlmNjYtNDJhNS04ZDlmLTUwY2Q2MDNmMWY2NiJ9.SjvB13-dRnyTm92xx26tVc3g3RWIYdm-w5BiINPhAGY",
  "access_expires_at": "2026-10-30T13:04:18.116299757Z",
  "refresh_token": "JH5XLAmlCu57n4kNPgGqXNR8HaRe1gMgFsKmABaCckk",
  "refresh_expires_at": "2026-11-29T12:49:18.115843785Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "6cf88bf4-b2ed-4bf4-8486-80df27e4a6e0",
  "expires_at": "2026-10-30T12:54:20.337067922Z",
  "resend_available_at": "2026-10-30T12:49:21.337067922Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638876069` → **200**

```json
{
  "phone": "+380638876069",
  "audience": "CLIENT",
  "code": "913906",
  "sent_at": "2026-10-30T12:49:20.33960614Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "89d4dd7a-a9f0-4917-8c30-a4249b0a6e3b",
  "challenge_id": "6cf88bf4-b2ed-4bf4-8486-80df27e4a6e0",
  "otp_code": "913906"
}
```

```json
{
  "id": "e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6",
  "state": "PENDING",
  "created_at": "2026-10-30T12:49:20.616971Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6` → **200**

```json
{
  "id": "e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6",
  "state": "PENDING",
  "created_at": "2026-10-30T12:49:20.616971Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6` → **200**

```json
{
  "id": "e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6",
  "state": "PENDING",
  "created_at": "2026-10-30T12:49:20.616971Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6` → **200**

```json
{
  "id": "e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6",
  "state": "PENDING",
  "created_at": "2026-10-30T12:49:20.616971Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6` → **200**

```json
{
  "id": "e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6",
  "state": "PENDING",
  "created_at": "2026-10-30T12:49:20.616971Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6` → **200**

```json
{
  "id": "e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6",
  "state": "PENDING",
  "created_at": "2026-10-30T12:49:20.616971Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6` → **200**

```json
{
  "id": "e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6",
  "state": "PENDING",
  "created_at": "2026-10-30T12:49:20.616971Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6` → **200**

```json
{
  "id": "e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6",
  "state": "PENDING",
  "created_at": "2026-10-30T12:49:20.616971Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6` → **200**

```json
{
  "id": "e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6",
  "state": "PENDING",
  "created_at": "2026-10-30T12:49:20.616971Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6` → **200**

```json
{
  "id": "e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6",
  "state": "READY",
  "created_at": "2026-10-30T12:49:20.616971Z",
  "ready_at": "2026-10-30T12:49:29.657565Z",
  "expires_at": "2026-11-06T12:49:29.657565Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638604468",
  "device_ref": "sandbox-19356"
}
```

```json
{
  "challenge_id": "48c57f73-a379-4178-9ecc-4ff8ebda08d4",
  "expires_at": "2026-10-30T12:54:30.849469346Z",
  "resend_available_at": "2026-10-30T12:49:31.849469346Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638604468` → **200**

```json
{
  "phone": "+380638604468",
  "audience": "CLIENT",
  "code": "685778",
  "sent_at": "2026-10-30T12:49:30.851532716Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "48c57f73-a379-4178-9ecc-4ff8ebda08d4",
  "code": "685778",
  "device_ref": "sandbox-19356"
}
```

```json
{
  "session_id": "b0a0c851-5c96-4318-bc8a-fd700a3433e2",
  "subject": {
    "type": "CLIENT",
    "id": "32e2979e-903a-40ce-96a6-dfeb5ce5869d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMmUyOTc5ZS05MDNhLTQwY2UtOTZhNi1kZmViNWNlNTg2OWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1NDcxLCJpYXQiOjE3OTMzNjQ1NzEsImp0aSI6ImIzMDc3Nzg1LTcyMDEtNDMyZi04MjIzLWViY2I5Zjk5NjM2MyIsInNpZCI6ImIwYTBjODUxLTVjOTYtNDMxOC1iYzhhLWZkNzAwYTM0MzNlMiJ9.6UHjpNXZvywr7xgE0y_CNOVyuiPXcn3pBrvBhNsUlcM",
  "access_expires_at": "2026-10-30T13:04:31.098845039Z",
  "refresh_token": "NWJdY9DQoSmgrlc9OPzlx9-cu8fBvQxGEJ8hEpidtAQ",
  "refresh_expires_at": "2026-11-29T12:49:31.098434053Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "02aa79a3-8db9-44f4-864b-dc468a52f0d4"
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
  "session_id": "5604acd2-c1be-4b2f-a54d-f1a53b43dd73",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU0NzEsImlhdCI6MTc5MzM2NDU3MSwianRpIjoiYTAxNTNjNmEtODc2NC00OTcyLTkzZDctY2FiNDk5YTQ0MDA2Iiwic2lkIjoiNTYwNGFjZDItYzFiZS00YjJmLWE1NGQtZjFhNTNiNDNkZDczIn0.v2VmPuvfeNCDFt4b-nIYB0vmQUcvIUzu919AowZLhbs",
  "access_expires_at": "2026-10-30T13:04:31.810815473Z",
  "refresh_token": "WJZPxADaaWrUO1HWdsdgYp4lS9Fpxwlly4clRQx-W1s",
  "refresh_expires_at": "2026-10-31T00:49:31.810288066Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "780235d0-c2d5-4149-bd3c-ac2139a06d47",
  "session_id": "683a6ff5-9f66-42a5-8d9f-50cd603f1f66",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/780235d0-c2d5-4149-bd3c-ac2139a06d47/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "e7f808c5-ee1c-4d83-bc4a-35c5ddd3c1a6",
      "state": "READY",
      "created_at": "2026-10-30T12:49:20.616971Z",
      "ready_at": "2026-10-30T12:49:29.657565Z",
      "expires_at": "2026-11-06T12:49:29.657565Z",
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
  "device_ref": "sandbox-2864"
}
```

```json
{
  "challenge_id": "6ce03f60-266b-4f7d-8723-a321a929a398",
  "expires_at": "2026-10-30T12:54:32.488758653Z",
  "resend_available_at": "2026-10-30T12:49:33.488758653Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "788263",
  "sent_at": "2026-10-30T12:49:32.490785219Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ce03f60-266b-4f7d-8723-a321a929a398",
  "code": "788263",
  "device_ref": "sandbox-2864"
}
```

```json
{
  "session_id": "9c839627-6480-41fb-8e85-7710fcc50904",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTQ3MiwiaWF0IjoxNzkzMzY0NTcyLCJqdGkiOiIyZDBmZGI3NC1hYTQ5LTQ3ZjgtYThhZi0yMjAxNjc5MzliZDgiLCJzaWQiOiI5YzgzOTYyNy02NDgwLTQxZmItOGU4NS03NzEwZmNjNTA5MDQifQ.m98Nwqh2f8CABvu0TWmWbBKzLMP2tdYdjgWBMn2kJCo",
  "access_expires_at": "2026-10-30T13:04:32.738150239Z",
  "refresh_token": "3Ni9KX_giucPkoXr7xGtyfA5n8f7kAzpUgt2FwFVT_k",
  "refresh_expires_at": "2026-11-29T12:49:32.737604124Z",
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
  "device_ref": "sandbox-14907"
}
```

```json
{
  "challenge_id": "6cfcd773-13f8-4660-ad4f-f1a616ae7743",
  "expires_at": "2026-10-30T12:54:33.17330251Z",
  "resend_available_at": "2026-10-30T12:49:34.17330251Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "935896",
  "sent_at": "2026-10-30T12:49:33.175441712Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6cfcd773-13f8-4660-ad4f-f1a616ae7743",
  "code": "935896",
  "device_ref": "sandbox-14907"
}
```

```json
{
  "session_id": "e31319a0-12d2-4aca-b019-b3ec32c0d5bb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTQ3MywiaWF0IjoxNzkzMzY0NTczLCJqdGkiOiJhYjIwNWRiNC0wOGM5LTRmNzctOTFhYy05YzE1MGE3NGNjMWIiLCJzaWQiOiJlMzEzMTlhMC0xMmQyLTRhY2EtYjAxOS1iM2VjMzJjMGQ1YmIifQ.QW4KXDW0thH2wzlZ8LAMZNQ7d_6Q8dRw9AEpKegvVnk",
  "access_expires_at": "2026-10-30T13:04:33.422134Z",
  "refresh_token": "igpTfA66MvaeEUjF1Tnhe2VR0SJoWSKH-lUpYvbc8TQ",
  "refresh_expires_at": "2026-11-29T12:49:33.42164514Z",
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
  "command_id": "32080571-8c85-4add-8952-ac2715f9ab1b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:49:33Z",
    "sequence": 1793364573873
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ae38a14-c852-4507-a85d-6d58dc805bf4",
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
  "last_heartbeat_at": "2026-10-30T12:49:33.889349Z",
  "last_location_at": "2026-10-30T12:49:33.889349Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-26126"
}
```

```json
{
  "challenge_id": "42c3826c-3ac6-40d3-af27-62f885a1a2fc",
  "expires_at": "2026-10-30T12:54:34.113305824Z",
  "resend_available_at": "2026-10-30T12:49:35.113305824Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "231709",
  "sent_at": "2026-10-30T12:49:34.115436184Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "42c3826c-3ac6-40d3-af27-62f885a1a2fc",
  "code": "231709",
  "device_ref": "sandbox-26126"
}
```

```json
{
  "session_id": "9be6a79c-c164-4d25-bdcb-adbbc9f972a9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTQ3NCwiaWF0IjoxNzkzMzY0NTc0LCJqdGkiOiJlYTM4N2NiOC04NGQ0LTQxN2YtOGEyNC1hYzQzYzVmZTcwZGIiLCJzaWQiOiI5YmU2YTc5Yy1jMTY0LTRkMjUtYmRjYi1hZGJiYzlmOTcyYTkifQ.NKpcq6TgiNbH8wxwVZnpgEWwYmJkbgP6ER2jb-Uy6yA",
  "access_expires_at": "2026-10-30T13:04:34.362001155Z",
  "refresh_token": "HAuIEkS1dKitRSahuQkuuV_EidvCkez_PznLhOuRNew",
  "refresh_expires_at": "2026-11-29T12:49:34.361557411Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ea215620-317e-441d-92cf-55c8a9536ca0",
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
  "last_heartbeat_at": "2026-10-30T12:45:43.334288Z",
  "last_location_at": "2026-10-30T12:45:43.334288Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ea215620-317e-441d-92cf-55c8a9536ca0/handover` → **200**

```json
{
  "command_id": "fd1e3685-6ccf-49be-a86d-9afd4741c230",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ea215620-317e-441d-92cf-55c8a9536ca0",
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
  "last_heartbeat_at": "2026-10-30T12:45:43.334288Z",
  "last_location_at": "2026-10-30T12:45:43.334288Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ea215620-317e-441d-92cf-55c8a9536ca0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:49:35Z",
    "sequence": 1793364575470
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ea215620-317e-441d-92cf-55c8a9536ca0",
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
  "last_heartbeat_at": "2026-10-30T12:49:35.062781Z",
  "last_location_at": "2026-10-30T12:49:35.062781Z",
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
  "session_id": "3fe8c947-8657-4b61-901c-208370f3dc67",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU0NzUsImlhdCI6MTc5MzM2NDU3NSwianRpIjoiMGJmZTJlMDktZTk1MS00MzlhLWIxZDUtN2JiMTk5OTFhMzIyIiwic2lkIjoiM2ZlOGM5NDctODY1Ny00YjYxLTkwMWMtMjA4MzcwZjNkYzY3In0.FB-g0GC4xSLCduiNpxeYjdG_VyzDcZ5m3whT9742Nu0",
  "access_expires_at": "2026-10-30T13:04:35.538818571Z",
  "refresh_token": "d8lhfCL7FlQv5hgTWonwuXe0m9sb7lEKq-AhalwtKBE",
  "refresh_expires_at": "2026-10-31T00:49:35.538396659Z",
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
  "session_id": "88ac49db-57cd-47f6-a32d-c23c54cc5545",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU0NzYsImlhdCI6MTc5MzM2NDU3NiwianRpIjoiOGEyZDAzNGItZDRmNS00MDZhLTg2YTQtODQyZDJjM2NmNTU0Iiwic2lkIjoiODhhYzQ5ZGItNTdjZC00N2Y2LWEzMmQtYzIzYzU0Y2M1NTQ1In0.DrnKj89PSm3uUAPRWmjV1Gvtbq2hJsWfFO9awxIoQsA",
  "access_expires_at": "2026-10-30T13:04:36.018920623Z",
  "refresh_token": "u0E0sfYCYJSbPVLeIxCfjwJBzZZ0QSmxQKI9oPnJq4o",
  "refresh_expires_at": "2026-10-31T00:49:36.018463229Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380688215187",
  "device_ref": "sandbox-18033"
}
```

```json
{
  "challenge_id": "35f014c9-a353-4652-bda2-9aa813fafa94",
  "expires_at": "2026-10-30T12:54:36.238918683Z",
  "resend_available_at": "2026-10-30T12:49:37.238918683Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380688215187` → **200**

```json
{
  "phone": "+380688215187",
  "audience": "CLIENT",
  "code": "006464",
  "sent_at": "2026-10-30T12:49:36.24199041Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "35f014c9-a353-4652-bda2-9aa813fafa94",
  "code": "006464",
  "device_ref": "sandbox-18033"
}
```

```json
{
  "session_id": "f0c0edfb-bbf9-49ad-83d5-05683faaa8d0",
  "subject": {
    "type": "CLIENT",
    "id": "1f085c91-2a99-4e88-9fa4-9c7d8369f274"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjA4NWM5MS0yYTk5LTRlODgtOWZhNC05YzdkODM2OWYyNzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1NDc2LCJpYXQiOjE3OTMzNjQ1NzYsImp0aSI6Ijg1MzBjOTA0LWM2MzQtNGEzNi04M2Q0LTcyOTJkZjZmODI4NiIsInNpZCI6ImYwYzBlZGZiLWJiZjktNDlhZC04M2Q1LTA1NjgzZmFhYThkMCJ9.a_u8jAGVSGYguZu6S15RVbslt5LpYmTUtUGYxCct-Gs",
  "access_expires_at": "2026-10-30T13:04:36.487866607Z",
  "refresh_token": "IBOnoDPvQo-ST5nYu1xbfhdfxC7aiDuWfUM2Ut4ASVw",
  "refresh_expires_at": "2026-11-29T12:49:36.487466037Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "efa5b167-c93a-4cf7-8f26-adec3c0a954d",
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
  "id": "f19a418f-a69b-4ebe-8ad3-58c116bf6adc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:54:36.714732Z",
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
  "command_id": "c820e846-81ab-472e-8baf-9857bcd976b8",
  "quote_id": "f19a418f-a69b-4ebe-8ad3-58c116bf6adc",
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
  "id": "dedae4be-95a6-416f-bab2-8f59db68fba5",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1f085c91-2a99-4e88-9fa4-9c7d8369f274",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:49:36.947922Z",
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
    "id": "ad644849-69f4-4af0-83a9-9e1d0be330c1",
    "order_id": "dedae4be-95a6-416f-bab2-8f59db68fba5",
    "expires_at": "2026-10-30T12:49:51.95001Z",
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

`POST /api/driver/v1/offers/ad644849-69f4-4af0-83a9-9e1d0be330c1/reject` → **204**

```json
{
  "command_id": "e8955d1e-a362-4291-b25a-36782a1bb090"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "9b9af679-068a-4e86-b6f6-9533facbc3da",
    "order_id": "dedae4be-95a6-416f-bab2-8f59db68fba5",
    "expires_at": "2026-10-30T12:49:52.447454Z",
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

`POST /api/driver/v1/offers/9b9af679-068a-4e86-b6f6-9533facbc3da/accept` → **200**

```json
{
  "command_id": "b55d4e0d-c2ed-4e6d-b3c7-47b167c99172"
}
```

```json
{
  "id": "51f5507b-901d-4516-8f01-17419e40558e",
  "order_id": "dedae4be-95a6-416f-bab2-8f59db68fba5",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "360f99c0-0312-4e30-b97b-3ffb8a8c30f5",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/dedae4be-95a6-416f-bab2-8f59db68fba5/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T12:49:36.9483Z",
      "actor": {
        "type": "CLIENT",
        "id": "1f085c91-2a99-4e88-9fa4-9c7d8369f274",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "dedae4be-95a6-416f-bab2-8f59db68fba5",
        "quote_id": "f19a418f-a69b-4ebe-8ad3-58c116bf6adc",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "2bdca6ed-30c0-4cd9-9f18-11ff9e0a2853"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T12:49:36.94957Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "dedae4be-95a6-416f-bab2-8f59db68fba5",
        "attempt_id": "cd0c47ac-bb56-4a7c-9916-79e872ea6736",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "2bdca6ed-30c0-4cd9-9f18-11ff9e0a2853"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T12:49:36.952094Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ad644849-69f4-4af0-83a9-9e1d0be330c1",
        "order_id": "dedae4be-95a6-416f-bab2-8f59db68fba5",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "2bdca6ed-30c0-4cd9-9f18-11ff9e0a2853"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T12:49:37.446685Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ad644849-69f4-4af0-83a9-9e1d0be330c1",
        "order_id": "dedae4be-95a6-416f-bab2-8f59db68fba5"
      },
      "correlation_id": "77ff418d-512e-4725-82e5-db2fa6165ed4"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order dedae4be-95a6-416f-bab2-8f59db68fba5 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/dedae4be-95a6-416f-bab2-8f59db68fba5` → **200**

```json
{
  "id": "dedae4be-95a6-416f-bab2-8f59db68fba5",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "1f085c91-2a99-4e88-9fa4-9c7d8369f274",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "51f5507b-901d-4516-8f01-17419e40558e",
    "order_id": "dedae4be-95a6-416f-bab2-8f59db68fba5",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "360f99c0-0312-4e30-b97b-3ffb8a8c30f5",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T12:49:36.947922Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/dedae4be-95a6-416f-bab2-8f59db68fba5/cancel` → **200**

```json
{
  "command_id": "4ef55a01-8dd8-487c-9a12-1c0b4efc9cb7",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "dedae4be-95a6-416f-bab2-8f59db68fba5",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "1f085c91-2a99-4e88-9fa4-9c7d8369f274",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "51f5507b-901d-4516-8f01-17419e40558e",
    "order_id": "dedae4be-95a6-416f-bab2-8f59db68fba5",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "360f99c0-0312-4e30-b97b-3ffb8a8c30f5",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T12:49:36.947922Z",
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
  "session_id": "2ae38a14-c852-4507-a85d-6d58dc805bf4",
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
  "last_heartbeat_at": "2026-10-30T12:49:33.889349Z",
  "last_location_at": "2026-10-30T12:49:33.889349Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2ae38a14-c852-4507-a85d-6d58dc805bf4/close` → **200**

```json
{
  "command_id": "ba44cbef-6fe7-452d-b166-ab1ab4ee73d0",
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
  "session_id": "ea215620-317e-441d-92cf-55c8a9536ca0",
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
  "last_heartbeat_at": "2026-10-30T12:49:35.062781Z",
  "last_location_at": "2026-10-30T12:49:35.062781Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ea215620-317e-441d-92cf-55c8a9536ca0/close` → **200**

```json
{
  "command_id": "b634a704-6332-4cb4-a8fc-71e2cf59bd2c",
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
  "session_id": "1f31d64e-26f0-46b5-ba26-a11be8363998",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU0NzksImlhdCI6MTc5MzM2NDU3OSwianRpIjoiNWU1MDhkM2ItNTIwMi00MmUxLTg1YmYtOWQzOGQzMDZhZmFkIiwic2lkIjoiMWYzMWQ2NGUtMjZmMC00NmI1LWJhMjYtYTExYmU4MzYzOTk4In0.OeMr7_kc3ZUgUbLS-8Uv8jFWkuGs1EZboZ7yUxVdrgs",
  "access_expires_at": "2026-10-30T13:04:39.826632608Z",
  "refresh_token": "BJ4Ogb-mqFb_gnNLWnWEhRYXDEi7us1KHKaTHcC0dqM",
  "refresh_expires_at": "2026-10-31T00:49:39.826190737Z",
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
  "command_id": "1ad3aff4-ae7a-4512-9cd8-fbd842a226fc",
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
  "changed_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T12:49:40.293883Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "704ec9f3-90ac-4730-a8f9-ceebae673952",
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
  "correlation_id": "0adcef74-e420-4e35-b490-2c2f67a99749",
  "current_version": 1
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "c21022d1-dc03-4d81-8f80-d5eec83aab98",
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
  "correlation_id": "1334e3a3-e761-4781-919f-cbab6eddcaf7"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637623097",
  "device_ref": "sandbox-22679"
}
```

```json
{
  "challenge_id": "bef52c05-f65c-41c9-80bd-acacb38e7486",
  "expires_at": "2026-10-30T12:54:40.984916663Z",
  "resend_available_at": "2026-10-30T12:49:41.984916663Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637623097` → **200**

```json
{
  "phone": "+380637623097",
  "audience": "CLIENT",
  "code": "186594",
  "sent_at": "2026-10-30T12:49:40.987600628Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bef52c05-f65c-41c9-80bd-acacb38e7486",
  "code": "186594",
  "device_ref": "sandbox-22679"
}
```

```json
{
  "session_id": "d188648c-698c-4b67-8645-b61ef3403d98",
  "subject": {
    "type": "CLIENT",
    "id": "22b2aeed-5806-4dcc-a92d-c15ebae31089"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMmIyYWVlZC01ODA2LTRkY2MtYTkyZC1jMTVlYmFlMzEwODkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1NDgxLCJpYXQiOjE3OTMzNjQ1ODEsImp0aSI6IjI2M2QzYzM0LTAyMWEtNDFlNS1hMTQzLTY4MzBhOGE2Mjk2MiIsInNpZCI6ImQxODg2NDhjLTY5OGMtNGI2Ny04NjQ1LWI2MWVmMzQwM2Q5OCJ9.dzqgrYTXd9V03YszK18tLJ_aeluyPd7fVBM5Dq-SXmA",
  "access_expires_at": "2026-10-30T13:04:41.23118106Z",
  "refresh_token": "fn7JJJZNa4hSkun4L26HvmNaxUggblboyvGHLl4VfIY",
  "refresh_expires_at": "2026-11-29T12:49:41.230782993Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6f5ed296-149c-47fd-8583-1d529282cb00",
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
  "id": "a61a2c69-34b1-454c-b647-00d4810599d2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:54:41.459983Z",
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
  "command_id": "bead9d43-607e-4457-a37c-ef0f95e416ab",
  "quote_id": "a61a2c69-34b1-454c-b647-00d4810599d2",
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
  "correlation_id": "e44c9da5-a4dd-41f8-ab73-ceff05edfdb9"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6a33fc31-30d2-43a0-a345-0771d9c3e9be",
  "quote_id": "a61a2c69-34b1-454c-b647-00d4810599d2",
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
  "id": "c6fa02df-ac40-4470-abb3-8602a95c9124",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "22b2aeed-5806-4dcc-a92d-c15ebae31089",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:49:41.926524Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c6fa02df-ac40-4470-abb3-8602a95c9124/cancel` → **200**

```json
{
  "command_id": "421e681e-7a27-40f8-853e-ec1141558510",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c6fa02df-ac40-4470-abb3-8602a95c9124",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "22b2aeed-5806-4dcc-a92d-c15ebae31089",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:49:41.926524Z",
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
  "command_id": "b0a30f21-9e71-438e-9234-d57ae536994a",
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
  "changed_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T12:49:42.415878Z"
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
      "changed_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T12:49:42.415878Z"
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
  "device_ref": "sandbox-20745"
}
```

```json
{
  "challenge_id": "f83c2a6f-8e3c-43f6-9f69-66ffde121423",
  "expires_at": "2026-10-30T12:54:43.118967425Z",
  "resend_available_at": "2026-10-30T12:49:44.118967425Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "327951",
  "sent_at": "2026-10-30T12:49:43.121351368Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f83c2a6f-8e3c-43f6-9f69-66ffde121423",
  "code": "327951",
  "device_ref": "sandbox-20745"
}
```

```json
{
  "session_id": "2d367b93-79a0-4972-a180-8205fe965d99",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTQ4MywiaWF0IjoxNzkzMzY0NTgzLCJqdGkiOiJjY2FlMjhkMi1jZTdiLTRhZDUtYmIwYi05MTNjZDNhY2UzY2IiLCJzaWQiOiIyZDM2N2I5My03OWEwLTQ5NzItYTE4MC04MjA1ZmU5NjVkOTkifQ.JSmM10yTJBCRHPYU2Nb-_-yvKyBSNHTRKOAV2rHABdM",
  "access_expires_at": "2026-10-30T13:04:43.363937365Z",
  "refresh_token": "XEMq_XKFxpslzKjciZIzXAd009wEkoeQuXSfZI_APmo",
  "refresh_expires_at": "2026-11-29T12:49:43.363496796Z",
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
  "command_id": "c27f2e7d-58a3-4bdd-9946-52acbd394d3d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:49:43Z",
    "sequence": 1793364583822
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9b66a2fe-8903-48c5-a087-045139f6f9e2",
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
  "last_heartbeat_at": "2026-10-30T12:49:43.837946Z",
  "last_location_at": "2026-10-30T12:49:43.837946Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679141760",
  "device_ref": "sandbox-31972"
}
```

```json
{
  "challenge_id": "eedba7e2-dc82-436b-b790-bb938cc2f7c9",
  "expires_at": "2026-10-30T12:54:44.065329641Z",
  "resend_available_at": "2026-10-30T12:49:45.065329641Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679141760` → **200**

```json
{
  "phone": "+380679141760",
  "audience": "CLIENT",
  "code": "985048",
  "sent_at": "2026-10-30T12:49:44.067348997Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eedba7e2-dc82-436b-b790-bb938cc2f7c9",
  "code": "985048",
  "device_ref": "sandbox-31972"
}
```

```json
{
  "session_id": "309424b9-374a-49a5-8f5c-d9217ae41bac",
  "subject": {
    "type": "CLIENT",
    "id": "d0487b08-10c9-43b4-b7bc-3f5d5c28b373"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMDQ4N2IwOC0xMGM5LTQzYjQtYjdiYy0zZjVkNWMyOGIzNzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1NDg0LCJpYXQiOjE3OTMzNjQ1ODQsImp0aSI6ImI3ZTQwNTRkLTQwYmYtNDI3Zi05YzAyLTMxMWU0YmZhM2E2MiIsInNpZCI6IjMwOTQyNGI5LTM3NGEtNDlhNS04ZjVjLWQ5MjE3YWU0MWJhYyJ9.QI8wffMUlC-7ULB4lE6eDt_3sV6XmcT5Y_qkZLAeaTA",
  "access_expires_at": "2026-10-30T13:04:44.317534793Z",
  "refresh_token": "tuKeD_IyGVcdyPfLY62Dx-iggQi4jDAr9ILFI9VnO8k",
  "refresh_expires_at": "2026-11-29T12:49:44.317074014Z",
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
  "command_id": "c2855ac5-53a2-4f6b-99ba-3601f738f9f6",
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
  "id": "d7e9aca7-2810-4bcb-a8aa-52f6f556c097",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:54:44.764088Z",
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
  "command_id": "4ca4e92f-2989-4bab-b7cf-dfe54e13dd92",
  "platform": "ANDROID",
  "token": "sandbox-driver-a02a944a-d9cd-4928-9805-24462db2e9df"
}
```

```json
{
  "id": "800a813f-bf78-498e-9112-56e435dc2663",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T12:49:45.003787Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "72090261-23cf-43d5-ae82-7f383ba5483d",
  "platform": "ANDROID",
  "token": "sandbox-rider-3d7a0828-267d-41b8-ac66-3c32ea5323c0"
}
```

```json
{
  "id": "bd47409b-a491-43f5-a53e-34c01651cfda",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T12:49:45.229377Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6e2bad29-ed2e-49b7-9959-c18e9fa5a474",
  "quote_id": "d7e9aca7-2810-4bcb-a8aa-52f6f556c097",
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
  "id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d0487b08-10c9-43b4-b7bc-3f5d5c28b373",
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
  "created_at": "2026-10-30T12:49:45.458533Z",
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
    "id": "a362c321-5333-495a-8c8e-7cd40a5c5cdd",
    "order_id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
    "expires_at": "2026-10-30T12:50:00.460875Z",
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

`POST /api/driver/v1/offers/a362c321-5333-495a-8c8e-7cd40a5c5cdd/accept` → **200**

```json
{
  "command_id": "3683956b-fb66-415e-a727-c7499d73bdb0"
}
```

```json
{
  "id": "d31f5cc0-b575-4cd6-b6e4-fa54023cc437",
  "order_id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5b96a9df-27ef-4040-a9b8-29f22314dbb6",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T12:49:45.438Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T12:49:45.438Z` → **200**

```json
[
  {
    "at": "2026-10-30T12:49:46.675693002Z",
    "token_suffix": "b2e9df",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
      "order_version": "2",
      "event_id": "21585a90-ba7e-4672-8f95-20be04cc3340"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380679141760&after=2026-10-30T12:49:45.438Z` → **200**

```json
[
  {
    "at": "2026-10-30T12:49:46.673597534Z",
    "token_suffix": "5323c0",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
      "order_version": "3",
      "event_id": "f6a33def-fcb6-4433-9759-d2432c76334a"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/4e8aeef3-e0b8-4f8d-9a82-b972823a6925/messages` → **201**

```json
{
  "command_id": "f8423275-6774-454d-8ebc-d7ee9e352075",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "c0c09a90-7b51-47a8-a124-856b3a4eda69",
  "order_id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T12:49:47.22393341Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5b96a9df-27ef-4040-a9b8-29f22314dbb6",
  "order_id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
  "assignment_id": "d31f5cc0-b575-4cd6-b6e4-fa54023cc437",
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

`POST /api/driver/v1/trips/5b96a9df-27ef-4040-a9b8-29f22314dbb6/messages` → **201**

```json
{
  "command_id": "6df6d34e-a4e3-45e8-8745-ff18d4ed5558",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "a288e9bc-f3da-4573-9972-48f191f7a20e",
  "order_id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T12:49:47.671132754Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/4e8aeef3-e0b8-4f8d-9a82-b972823a6925/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/5b96a9df-27ef-4040-a9b8-29f22314dbb6/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679141760"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/9b66a2fe-8903-48c5-a087-045139f6f9e2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:49:48Z",
    "sequence": 1793364588348
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9b66a2fe-8903-48c5-a087-045139f6f9e2",
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
  "last_heartbeat_at": "2026-10-30T12:49:48.364346Z",
  "last_location_at": "2026-10-30T12:49:48.364346Z",
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
  "id": "5b96a9df-27ef-4040-a9b8-29f22314dbb6",
  "order_id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
  "assignment_id": "d31f5cc0-b575-4cd6-b6e4-fa54023cc437",
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

`POST /api/driver/v1/trips/5b96a9df-27ef-4040-a9b8-29f22314dbb6/arrive` → **200**

```json
{
  "command_id": "fd0e74b8-b366-4d41-94c1-2ffea2f63653",
  "expected_version": 0
}
```

```json
{
  "id": "5b96a9df-27ef-4040-a9b8-29f22314dbb6",
  "order_id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
  "assignment_id": "d31f5cc0-b575-4cd6-b6e4-fa54023cc437",
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
  "arrived_at": "2026-10-30T12:49:48.804939Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5b96a9df-27ef-4040-a9b8-29f22314dbb6/start` → **200**

```json
{
  "command_id": "0e10465c-5e2f-4b98-900b-2bc22eeac03c",
  "expected_version": 1
}
```

```json
{
  "id": "5b96a9df-27ef-4040-a9b8-29f22314dbb6",
  "order_id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
  "assignment_id": "d31f5cc0-b575-4cd6-b6e4-fa54023cc437",
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
  "arrived_at": "2026-10-30T12:49:48.804939Z",
  "started_at": "2026-10-30T12:49:49.035419Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/9b66a2fe-8903-48c5-a087-045139f6f9e2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:50:37Z",
    "sequence": 1793364637277
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9b66a2fe-8903-48c5-a087-045139f6f9e2",
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
  "last_heartbeat_at": "2026-10-30T12:50:37.293724Z",
  "last_location_at": "2026-10-30T12:50:37.293724Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/5b96a9df-27ef-4040-a9b8-29f22314dbb6/complete` → **200**

```json
{
  "command_id": "3f98cd7e-8313-4c65-b189-1ce01502831a",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:50:37Z",
  "cash_received": true
}
```

```json
{
  "id": "5b96a9df-27ef-4040-a9b8-29f22314dbb6",
  "order_id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
  "assignment_id": "d31f5cc0-b575-4cd6-b6e4-fa54023cc437",
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
  "arrived_at": "2026-10-30T12:49:48.804939Z",
  "started_at": "2026-10-30T12:49:49.035419Z",
  "completed_at": "2026-10-30T12:50:37.526632Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/4e8aeef3-e0b8-4f8d-9a82-b972823a6925` → **200**

```json
{
  "id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d0487b08-10c9-43b4-b7bc-3f5d5c28b373",
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
    "id": "d31f5cc0-b575-4cd6-b6e4-fa54023cc437",
    "order_id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5b96a9df-27ef-4040-a9b8-29f22314dbb6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:49:45.458533Z",
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
    "id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
    "short_number": 14,
    "status": "FULFILLED",
    "created_at": "2026-10-30T12:49:45.458533Z",
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
    "id": "5b96a9df-27ef-4040-a9b8-29f22314dbb6",
    "order_id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
    "order_short_number": 14,
    "created_at": "2026-10-30T12:49:45.920926Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "49f5a25c-5329-44c5-aad0-8ea4c31494af",
    "order_id": "05f746e0-5686-499c-8e75-0a3d1bdfb1d3",
    "order_short_number": 9,
    "created_at": "2026-10-30T12:47:00.473675Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "e20a6b86-d586-4116-b1cf-4aca0618c03d",
    "order_id": "94e7b6ee-2fc1-4f08-9c91-1550fa809bfa",
    "order_short_number": 4,
    "created_at": "2026-10-30T12:45:34.463102Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "8a014ab2-7fc4-40db-85f8-efbffe93dea7",
    "order_id": "7053908e-dbd5-49be-9ea8-a40ca4fe54ec",
    "order_short_number": 2,
    "created_at": "2026-10-30T12:41:50.207903Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "46bc4265-03ef-4e07-9045-0471232f0b93",
    "order_id": "359e58f6-806f-4437-b9a2-3eb792562ccc",
    "order_short_number": 1,
    "created_at": "2026-10-30T12:41:42.071259Z",
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

`GET /api/rider/v1/orders/4e8aeef3-e0b8-4f8d-9a82-b972823a6925/tip` → **200**

```json
{
  "order_id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
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
  "available_until": "2026-10-31T12:50:37.526632Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/4e8aeef3-e0b8-4f8d-9a82-b972823a6925/tip` → **201**

```json
{
  "command_id": "112a73bb-f9fd-40b4-baef-61ffdbd34ddc",
  "amount_minor": 1100
}
```

```json
{
  "id": "3a5aa35f-51a1-4a8c-9cc3-7076c17d0621",
  "order_id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T12:50:42.128829Z"
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
  "session_id": "41591bfc-2640-4943-9c0b-e84502532c00",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU1NDIsImlhdCI6MTc5MzM2NDY0MiwianRpIjoiMmYzODYzNzMtNTE4Yy00YmJkLWE1MzItMjFmYjhiZTMzNjVkIiwic2lkIjoiNDE1OTFiZmMtMjY0MC00OTQzLTljMGItZTg0NTAyNTMyYzAwIn0.iBlRUGUF_gl_jNf-kx49eXzVw6mCLICUw0k57OeRjuM",
  "access_expires_at": "2026-10-30T13:05:42.618290131Z",
  "refresh_token": "0IzxAMDidfHnQJNJB4nWHQW-5l8uhLeUxkEfE4Dr3d0",
  "refresh_expires_at": "2026-10-31T00:50:42.617565253Z",
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
  "generated_at": "2026-10-30T12:50:42.848892791Z"
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
  "generated_at": "2026-10-30T12:50:43.07592782Z"
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
  "session_id": "386f0324-50fb-4f8e-a3f6-ac3ead575582",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU1NDMsImlhdCI6MTc5MzM2NDY0MywianRpIjoiOTgxMTJlMmQtMGVlNy00OTM2LWE1NDItMzA0NDBmZGU3MzViIiwic2lkIjoiMzg2ZjAzMjQtNTBmYi00ZjhlLWEzZjYtYWMzZWFkNTc1NTgyIn0.j4iwj3VXr_-U0wPPCESwc_C_knZfiTBxQV7saLA3lvI",
  "access_expires_at": "2026-10-30T13:05:43.576750975Z",
  "refresh_token": "Ms4WaXNC3T4hYg54qeDAp6O__YDm3JT4sBNBokhZ5Ck",
  "refresh_expires_at": "2026-10-31T00:50:43.575967531Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4e8aeef3-e0b8-4f8d-9a82-b972823a6925/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T12:49:45.458907Z",
      "actor": {
        "type": "CLIENT",
        "id": "d0487b08-10c9-43b4-b7bc-3f5d5c28b373",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
        "quote_id": "d7e9aca7-2810-4bcb-a8aa-52f6f556c097",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "05f3705f-d7d6-4f28-8cb6-fc2ef16a4fc2"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T12:49:45.460348Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
        "attempt_id": "1287a8c0-482e-40a8-956c-6c524ed37184",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "05f3705f-d7d6-4f28-8cb6-fc2ef16a4fc2"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T12:49:45.462375Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a362c321-5333-495a-8c8e-7cd40a5c5cdd",
        "order_id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "05f3705f-d7d6-4f28-8cb6-fc2ef16a4fc2"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T12:49:45.922648Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a362c321-5333-495a-8c8e-7cd40a5c5cdd",
        "order_id": "4e8aeef3-e0b8-4f8d-9a82-b972823a6925",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "d31f5cc0-b575-4cd6-b6e4-fa54023cc437"
      },
      "correlation_id": "d521ced5-9d04-47b0-b8b0-32794c0b5026"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T12:50:44.030835653Z",
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
      "last_location_at": "2026-10-30T12:50:37.293724Z",
      "order_id": null
    }
  ]
}
```

Done: order 4e8aeef3-e0b8-4f8d-9a82-b972823a6925.

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
  "session_id": "2576088c-bf33-4f9f-82be-eade6863adc0",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU1NDQsImlhdCI6MTc5MzM2NDY0NCwianRpIjoiNTcwMzRmOGUtMmE1Ny00MGNmLTkxMjUtMzRlYTJlYWM3OWUxIiwic2lkIjoiMjU3NjA4OGMtYmYzMy00ZjlmLTgyYmUtZWFkZTY4NjNhZGMwIn0.z1lGnAeJSNOwpNMM4AgyAn9eHtxsDbPDtnJExF_D-sE",
  "access_expires_at": "2026-10-30T13:05:44.524836765Z",
  "refresh_token": "ufDzk1n9Tdt0vA7sl0Soe-STM8gYHtvzI13kQmdtN-c",
  "refresh_expires_at": "2026-10-31T00:50:44.524394714Z",
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
  "command_id": "e5e4cd07-c284-4ddb-9e1f-4157274308f6",
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
  "timestamp": "2026-10-30T12:50:45.000+0000",
  "channel": {
    "id": "1730052000.1835418551",
    "linkedid": "1730052000.1835418551",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678118921"
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
  "timestamp": "2026-10-30T12:50:45.000+0000",
  "channel": {
    "id": "1730052000.1835418551",
    "linkedid": "1730052000.1835418551",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678118921"
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
  "session_id": "3e526aed-a6f2-4d60-b45e-8964b448a063",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU1NDUsImlhdCI6MTc5MzM2NDY0NSwianRpIjoiM2NmNWFjNzUtZWExOC00MzZjLWIzZjgtOTZiZTQ5NWJiNWE2Iiwic2lkIjoiM2U1MjZhZWQtYTZmMi00ZDYwLWI0NWUtODk2NGI0NDhhMDYzIn0.jPDmtikeaWAMAVp7d-eCeTy6-9qvTaUFiymzlIS91LA",
  "access_expires_at": "2026-10-30T13:05:45.487994474Z",
  "refresh_token": "pF3dp3icCCabhKP3UScYVAcY31QEnhj78KkE1A06JQM",
  "refresh_expires_at": "2026-10-31T00:50:45.487555858Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "66908ee5-23a1-4f89-bff2-955d2f319f44",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678118921",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T12:50:45Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/66908ee5-23a1-4f89-bff2-955d2f319f44/answer` → **200**

```json
{
  "command_id": "cbf33024-262f-4991-adf3-9f39d4eea65a"
}
```

```json
{
  "id": "66908ee5-23a1-4f89-bff2-955d2f319f44",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678118921",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "order_ids": [],
  "started_at": "2026-10-30T12:50:45Z",
  "answered_at": "2026-10-30T12:50:45.943561Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1835418551",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2c428fdc-c029-4559-8a9d-fbd526d14c1b",
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
  "id": "cb47bce6-8fae-461b-97a2-175e544b0788",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:55:46.195506Z",
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
  "command_id": "fbf674e1-abc7-4ae8-9f89-e0144ba31d68",
  "quote_id": "cb47bce6-8fae-461b-97a2-175e544b0788",
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
    "phone": "+380678118921"
  },
  "call_id": "66908ee5-23a1-4f89-bff2-955d2f319f44"
}
```

```json
{
  "id": "9117508d-49b7-41d9-96c4-addc74c412b9",
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
  "created_at": "2026-10-30T12:50:46.434003Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678118921"
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
    "id": "1730052000.1835418551",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "66908ee5-23a1-4f89-bff2-955d2f319f44",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678118921",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "order_ids": [
        "9117508d-49b7-41d9-96c4-addc74c412b9"
      ],
      "started_at": "2026-10-30T12:50:45Z",
      "answered_at": "2026-10-30T12:50:45.943561Z",
      "ended_at": "2026-10-30T12:50:46.677791Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "d2c39aea-a95d-48c7-96e3-12917c8ccfb0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675340004",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "order_ids": [],
      "started_at": "2026-10-30T12:45:26.516291Z",
      "answered_at": "2026-10-30T12:45:26.801834Z",
      "ended_at": "2026-10-30T12:45:27.048501Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T12:45:29.629858Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/9117508d-49b7-41d9-96c4-addc74c412b9` → **200**

```json
{
  "id": "9117508d-49b7-41d9-96c4-addc74c412b9",
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
  "created_at": "2026-10-30T12:50:46.434003Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678118921"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/9117508d-49b7-41d9-96c4-addc74c412b9` → **200**

```json
{
  "id": "9117508d-49b7-41d9-96c4-addc74c412b9",
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
  "created_at": "2026-10-30T12:50:46.434003Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678118921"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9117508d-49b7-41d9-96c4-addc74c412b9/cancel` → **200**

```json
{
  "command_id": "3555bef9-1afa-4518-987b-6948048d8659",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "9117508d-49b7-41d9-96c4-addc74c412b9",
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
  "created_at": "2026-10-30T12:50:46.434003Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678118921"
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

Done: call 66908ee5-23a1-4f89-bff2-955d2f319f44 with order 9117508d-49b7-41d9-96c4-addc74c412b9.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-27980"
}
```

```json
{
  "challenge_id": "2050163c-7b9c-4db4-9441-576d852608db",
  "expires_at": "2026-10-30T12:55:47.651027662Z",
  "resend_available_at": "2026-10-30T12:50:48.651027662Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "227479",
  "sent_at": "2026-10-30T12:50:47.653199462Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2050163c-7b9c-4db4-9441-576d852608db",
  "code": "227479",
  "device_ref": "sandbox-27980"
}
```

```json
{
  "session_id": "adc577c4-2093-4b9f-8a85-d972c1526ba7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTU0NywiaWF0IjoxNzkzMzY0NjQ3LCJqdGkiOiI3MWE4NWY1MS1mOGE4LTQ3OWMtYmE4ZC0yZTgzOWI4OWNkNGEiLCJzaWQiOiJhZGM1NzdjNC0yMDkzLTRiOWYtOGE4NS1kOTcyYzE1MjZiYTcifQ.15GEopueNCYzZSGslWn_WzxEtVQVRnW8e1d5syh4HBM",
  "access_expires_at": "2026-10-30T13:05:47.908569398Z",
  "refresh_token": "1tSqaRE80igaqWo9G7jTM4wxVPBCiCwC3tBX5nthsw8",
  "refresh_expires_at": "2026-11-29T12:50:47.908061439Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9b66a2fe-8903-48c5-a087-045139f6f9e2",
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
  "last_heartbeat_at": "2026-10-30T12:50:37.293724Z",
  "last_location_at": "2026-10-30T12:50:37.293724Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9b66a2fe-8903-48c5-a087-045139f6f9e2/handover` → **200**

```json
{
  "command_id": "ec85b882-97b1-4959-833e-64fa54a50863",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9b66a2fe-8903-48c5-a087-045139f6f9e2",
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
  "last_heartbeat_at": "2026-10-30T12:50:37.293724Z",
  "last_location_at": "2026-10-30T12:50:37.293724Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 88 s to the next point)

`POST /api/driver/v1/work-sessions/9b66a2fe-8903-48c5-a087-045139f6f9e2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:52:16Z",
    "sequence": 1793364736602
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9b66a2fe-8903-48c5-a087-045139f6f9e2",
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
  "last_heartbeat_at": "2026-10-30T12:52:16.617679Z",
  "last_location_at": "2026-10-30T12:52:16.617679Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666464996",
  "device_ref": "sandbox-24432"
}
```

```json
{
  "challenge_id": "564f55ce-259b-4812-b29a-70e4065f4942",
  "expires_at": "2026-10-30T12:57:16.841513294Z",
  "resend_available_at": "2026-10-30T12:52:17.841513294Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666464996` → **200**

```json
{
  "phone": "+380666464996",
  "audience": "CLIENT",
  "code": "935337",
  "sent_at": "2026-10-30T12:52:16.843981741Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "564f55ce-259b-4812-b29a-70e4065f4942",
  "code": "935337",
  "device_ref": "sandbox-24432"
}
```

```json
{
  "session_id": "932adc26-a86f-4628-a844-19697157490d",
  "subject": {
    "type": "CLIENT",
    "id": "25e3dfdd-f301-44ba-8b24-cf4a12c937dd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNWUzZGZkZC1mMzAxLTQ0YmEtOGIyNC1jZjRhMTJjOTM3ZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1NjM3LCJpYXQiOjE3OTMzNjQ3MzcsImp0aSI6ImYzMjQxNzRlLWQzNTAtNDRlZS1iZTM3LWQ0MDAxY2RjZjBkYSIsInNpZCI6IjkzMmFkYzI2LWE4NmYtNDYyOC1hODQ0LTE5Njk3MTU3NDkwZCJ9.03pLq6a_ulV79CLreTLQtg8QiXmG0C0DUzYXzZPllNA",
  "access_expires_at": "2026-10-30T13:07:17.087907829Z",
  "refresh_token": "A8aHkmmGy8XJg0KRlUg_jk-IchVaCr0iaEGX5mK12ec",
  "refresh_expires_at": "2026-11-29T12:52:17.087432108Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bc1fd883-1d72-4978-8b2b-71424fd846b7",
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
  "id": "61883783-900f-4011-8163-7ee4909c1a0b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:57:17.316082Z",
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
  "command_id": "60c6ab77-5edb-4ae5-80e2-e9731061c6fd",
  "quote_id": "61883783-900f-4011-8163-7ee4909c1a0b",
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
  "id": "cc1eaa1b-2712-4a01-81fe-5e0505ce95e5",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "25e3dfdd-f301-44ba-8b24-cf4a12c937dd",
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
  "created_at": "2026-10-30T12:52:17.549281Z",
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
    "id": "aabc5bec-10e7-4021-9e20-f5a06dc983e7",
    "order_id": "cc1eaa1b-2712-4a01-81fe-5e0505ce95e5",
    "expires_at": "2026-10-30T12:52:32.55174Z",
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

`POST /api/driver/v1/offers/aabc5bec-10e7-4021-9e20-f5a06dc983e7/accept` → **200**

```json
{
  "command_id": "4f3d2b4a-1442-404f-847b-cfb61fd0c6f9"
}
```

```json
{
  "id": "92f216a0-ee53-4f4e-9b41-91488629b0d0",
  "order_id": "cc1eaa1b-2712-4a01-81fe-5e0505ce95e5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e6ba93cf-225f-4596-b4a7-c092ef43d57d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e6ba93cf-225f-4596-b4a7-c092ef43d57d",
  "order_id": "cc1eaa1b-2712-4a01-81fe-5e0505ce95e5",
  "assignment_id": "92f216a0-ee53-4f4e-9b41-91488629b0d0",
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

`POST /api/driver/v1/work-sessions/9b66a2fe-8903-48c5-a087-045139f6f9e2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:52:18Z",
    "sequence": 1793364738459
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9b66a2fe-8903-48c5-a087-045139f6f9e2",
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
  "last_heartbeat_at": "2026-10-30T12:52:18.474352Z",
  "last_location_at": "2026-10-30T12:52:18.474352Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/e6ba93cf-225f-4596-b4a7-c092ef43d57d/arrive` → **200**

```json
{
  "command_id": "07749e6d-7ed7-40a6-8515-0569f2d7dc01",
  "expected_version": 0
}
```

```json
{
  "id": "e6ba93cf-225f-4596-b4a7-c092ef43d57d",
  "order_id": "cc1eaa1b-2712-4a01-81fe-5e0505ce95e5",
  "assignment_id": "92f216a0-ee53-4f4e-9b41-91488629b0d0",
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
  "arrived_at": "2026-10-30T12:52:18.701379Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e6ba93cf-225f-4596-b4a7-c092ef43d57d/start` → **200**

```json
{
  "command_id": "ee8bb83a-fad2-42f4-b7f3-82ae3ead1bdd",
  "expected_version": 1
}
```

```json
{
  "id": "e6ba93cf-225f-4596-b4a7-c092ef43d57d",
  "order_id": "cc1eaa1b-2712-4a01-81fe-5e0505ce95e5",
  "assignment_id": "92f216a0-ee53-4f4e-9b41-91488629b0d0",
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
  "arrived_at": "2026-10-30T12:52:18.701379Z",
  "started_at": "2026-10-30T12:52:18.933298Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions/9b66a2fe-8903-48c5-a087-045139f6f9e2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:53:18Z",
    "sequence": 1793364798182
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9b66a2fe-8903-48c5-a087-045139f6f9e2",
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
  "last_heartbeat_at": "2026-10-30T12:53:18.198228Z",
  "last_location_at": "2026-10-30T12:53:18.198228Z",
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
  "device_ref": "sandbox-25752"
}
```

```json
{
  "challenge_id": "1dba1fef-3bd7-4af4-a282-3414612a6f50",
  "expires_at": "2026-10-30T12:58:18.42272653Z",
  "resend_available_at": "2026-10-30T12:53:19.42272653Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "891889",
  "sent_at": "2026-10-30T12:53:18.424731745Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1dba1fef-3bd7-4af4-a282-3414612a6f50",
  "code": "891889",
  "device_ref": "sandbox-25752"
}
```

```json
{
  "session_id": "55d3ac8f-edf3-4fca-87e8-b832b929cfd7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTY5OCwiaWF0IjoxNzkzMzY0Nzk4LCJqdGkiOiIwMGI5N2MxMS1mOTQwLTRhNGMtYjBlMi01NTZiYThhODY0ZDkiLCJzaWQiOiI1NWQzYWM4Zi1lZGYzLTRmY2EtODdlOC1iODMyYjkyOWNmZDcifQ.uBNaNDjRTVA9sJYgeIKYlgIb9KWvMtUk6TxzBU_8OkU",
  "access_expires_at": "2026-10-30T13:08:18.667530854Z",
  "refresh_token": "PSS_fg7xyagNKThztM8BCMvuifGJLzahxvAUwNkYXbk",
  "refresh_expires_at": "2026-11-29T12:53:18.667063796Z",
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
  "command_id": "53b43ba2-38ad-4b0e-8fc7-8c7274b33e47",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:53:19Z",
    "sequence": 1793364799185
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "802d24c5-b6c6-4468-8916-1fd3d5f9d15c",
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
  "last_heartbeat_at": "2026-10-30T12:53:19.201195Z",
  "last_location_at": "2026-10-30T12:53:19.201195Z",
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
  "session_id": "70432ccb-8594-476e-923f-fbd34e904d50",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU2OTksImlhdCI6MTc5MzM2NDc5OSwianRpIjoiYzQ5NmUxM2MtODg0MC00MDNlLThjNWMtMWFkNGRhMWI2MjIzIiwic2lkIjoiNzA0MzJjY2ItODU5NC00NzZlLTkyM2YtZmJkMzRlOTA0ZDUwIn0.YV1fOOlWTn2pGq3nFAgy2HA8BJZWmrRAdq9aA3rJllo",
  "access_expires_at": "2026-10-30T13:08:19.703860398Z",
  "refresh_token": "0nIylt3bPJBMPykW4w37vJZ0hBXSJV0xxQDPFGUjwbY",
  "refresh_expires_at": "2026-10-31T00:53:19.703371357Z",
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
  "session_id": "0e06afa0-20d6-4dc6-9ffb-16ccb63b86be",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU3MDAsImlhdCI6MTc5MzM2NDgwMCwianRpIjoiMmI1MGY1MDktOWQyNi00NmNjLTg1YmQtMDExYmRhNTA4ZDYyIiwic2lkIjoiMGUwNmFmYTAtMjBkNi00ZGM2LTlmZmItMTZjY2I2M2I4NmJlIn0.CN3Xo4DAAg2ho7EWZdHzEocJ6N2AZTGCTieTkmvXfDI",
  "access_expires_at": "2026-10-30T13:08:20.211308677Z",
  "refresh_token": "2PZrcFuVrKlb5Ff1kGwxJmbMVLhOmMTxkBvU7OCmfYw",
  "refresh_expires_at": "2026-10-31T00:53:20.210868358Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/cc1eaa1b-2712-4a01-81fe-5e0505ce95e5` → **200**

```json
{
  "id": "cc1eaa1b-2712-4a01-81fe-5e0505ce95e5",
  "short_number": 16,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "25e3dfdd-f301-44ba-8b24-cf4a12c937dd",
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
    "id": "92f216a0-ee53-4f4e-9b41-91488629b0d0",
    "order_id": "cc1eaa1b-2712-4a01-81fe-5e0505ce95e5",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e6ba93cf-225f-4596-b4a7-c092ef43d57d",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T12:52:17.549281Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/cc1eaa1b-2712-4a01-81fe-5e0505ce95e5/interrupt` → **200**

```json
{
  "command_id": "7d214950-6227-42d1-b985-2b54816e869b",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "cc1eaa1b-2712-4a01-81fe-5e0505ce95e5",
    "short_number": 16,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "25e3dfdd-f301-44ba-8b24-cf4a12c937dd",
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
      "id": "92f216a0-ee53-4f4e-9b41-91488629b0d0",
      "order_id": "cc1eaa1b-2712-4a01-81fe-5e0505ce95e5",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "e6ba93cf-225f-4596-b4a7-c092ef43d57d",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T12:52:17.549281Z",
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
    "id": "a6780f21-9889-4db9-b91d-aba03d41cf9c",
    "short_number": 17,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "25e3dfdd-f301-44ba-8b24-cf4a12c937dd",
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
    "id": "ea4f7b89-55d0-4d96-9e40-cad7618d5771",
    "order_id": "a6780f21-9889-4db9-b91d-aba03d41cf9c",
    "expires_at": "2026-10-30T12:53:35.683327Z",
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

`POST /api/driver/v1/offers/ea4f7b89-55d0-4d96-9e40-cad7618d5771/accept` → **200**

```json
{
  "command_id": "5c5b4754-3d52-454f-8203-fdb912ff6db9"
}
```

```json
{
  "id": "b74005a5-36cc-4c15-9298-50a569415922",
  "order_id": "a6780f21-9889-4db9-b91d-aba03d41cf9c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "792e8026-9f01-4ca2-980f-20206b945e04",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "792e8026-9f01-4ca2-980f-20206b945e04",
  "order_id": "a6780f21-9889-4db9-b91d-aba03d41cf9c",
  "assignment_id": "b74005a5-36cc-4c15-9298-50a569415922",
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
  "session_id": "802d24c5-b6c6-4468-8916-1fd3d5f9d15c",
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
  "last_heartbeat_at": "2026-10-30T12:53:19.201195Z",
  "last_location_at": "2026-10-30T12:53:19.201195Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/802d24c5-b6c6-4468-8916-1fd3d5f9d15c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:53:21Z",
    "sequence": 1793364801841
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "802d24c5-b6c6-4468-8916-1fd3d5f9d15c",
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
  "last_heartbeat_at": "2026-10-30T12:53:21.857552Z",
  "last_location_at": "2026-10-30T12:53:21.857552Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/792e8026-9f01-4ca2-980f-20206b945e04/arrive` → **200**

```json
{
  "command_id": "a61e4812-cc96-4213-ba2d-66895976ed7d",
  "expected_version": 0
}
```

```json
{
  "id": "792e8026-9f01-4ca2-980f-20206b945e04",
  "order_id": "a6780f21-9889-4db9-b91d-aba03d41cf9c",
  "assignment_id": "b74005a5-36cc-4c15-9298-50a569415922",
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
  "arrived_at": "2026-10-30T12:53:22.084311Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/792e8026-9f01-4ca2-980f-20206b945e04/start` → **200**

```json
{
  "command_id": "57b6cc75-353b-478f-8286-6ad72d966e67",
  "expected_version": 1
}
```

```json
{
  "id": "792e8026-9f01-4ca2-980f-20206b945e04",
  "order_id": "a6780f21-9889-4db9-b91d-aba03d41cf9c",
  "assignment_id": "b74005a5-36cc-4c15-9298-50a569415922",
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
  "arrived_at": "2026-10-30T12:53:22.084311Z",
  "started_at": "2026-10-30T12:53:22.316172Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/792e8026-9f01-4ca2-980f-20206b945e04/complete` → **200**

```json
{
  "command_id": "e8649b90-fe0c-457c-983a-41ed320dba48",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:53:22Z"
}
```

```json
{
  "id": "792e8026-9f01-4ca2-980f-20206b945e04",
  "order_id": "a6780f21-9889-4db9-b91d-aba03d41cf9c",
  "assignment_id": "b74005a5-36cc-4c15-9298-50a569415922",
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
  "arrived_at": "2026-10-30T12:53:22.084311Z",
  "started_at": "2026-10-30T12:53:22.316172Z",
  "completed_at": "2026-10-30T12:53:22.553412Z",
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
    "id": "a6780f21-9889-4db9-b91d-aba03d41cf9c",
    "short_number": 17,
    "status": "FULFILLED",
    "created_at": "2026-10-30T12:53:20.675499Z",
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
    "id": "cc1eaa1b-2712-4a01-81fe-5e0505ce95e5",
    "short_number": 16,
    "status": "CANCELLED",
    "created_at": "2026-10-30T12:52:17.549281Z",
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

`GET /api/operator/v1/orders/cc1eaa1b-2712-4a01-81fe-5e0505ce95e5/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T12:52:17.549697Z",
      "actor": {
        "type": "CLIENT",
        "id": "25e3dfdd-f301-44ba-8b24-cf4a12c937dd",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "cc1eaa1b-2712-4a01-81fe-5e0505ce95e5",
        "quote_id": "61883783-900f-4011-8163-7ee4909c1a0b",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "7bfbd147-0816-463c-9b15-07ab1d503197"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T12:52:17.551162Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "cc1eaa1b-2712-4a01-81fe-5e0505ce95e5",
        "attempt_id": "bb183ba6-4f4f-4e54-80fe-30b2973f67c9",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7bfbd147-0816-463c-9b15-07ab1d503197"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T12:52:17.553252Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "aabc5bec-10e7-4021-9e20-f5a06dc983e7",
        "order_id": "cc1eaa1b-2712-4a01-81fe-5e0505ce95e5",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "7bfbd147-0816-463c-9b15-07ab1d503197"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T12:52:18.007936Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "aabc5bec-10e7-4021-9e20-f5a06dc983e7",
        "order_id": "cc1eaa1b-2712-4a01-81fe-5e0505ce95e5",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "92f216a0-ee53-4f4e-9b41-91488629b0d0"
      },
      "correlation_id": "98591d7c-d4d7-46ef-a27b-bd410e06ee60"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/a6780f21-9889-4db9-b91d-aba03d41cf9c/tip` → **200**

```json
{
  "order_id": "a6780f21-9889-4db9-b91d-aba03d41cf9c",
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
  "available_until": "2026-10-31T12:53:22.553412Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/a6780f21-9889-4db9-b91d-aba03d41cf9c/tip` → **409**

```json
{
  "command_id": "45a77042-97a6-4687-8c65-4b639a36c39c",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/a6780f21-9889-4db9-b91d-aba03d41cf9c/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "db637042-61ef-4af3-981a-5a603a8efc7f"
}
```

Done: interrupted cc1eaa1b-2712-4a01-81fe-5e0505ce95e5, follow-up a6780f21-9889-4db9-b91d-aba03d41cf9c.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9b66a2fe-8903-48c5-a087-045139f6f9e2",
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
  "last_heartbeat_at": "2026-10-30T12:53:18.198228Z",
  "last_location_at": "2026-10-30T12:53:18.198228Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9b66a2fe-8903-48c5-a087-045139f6f9e2/close` → **200**

```json
{
  "command_id": "2fcf74b4-90e3-4153-ab3b-6ab5fbc636ba",
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
  "session_id": "802d24c5-b6c6-4468-8916-1fd3d5f9d15c",
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
  "last_heartbeat_at": "2026-10-30T12:53:21.857552Z",
  "last_location_at": "2026-10-30T12:53:21.857552Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/802d24c5-b6c6-4468-8916-1fd3d5f9d15c/close` → **200**

```json
{
  "command_id": "6f0c9681-266f-47cd-abf2-f5025f2deb99",
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
  "session_id": "d4669953-dab3-4edf-999b-9e568addd9f3",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU3MDgsImlhdCI6MTc5MzM2NDgwOCwianRpIjoiNjAyMDBiMGQtNDNhOC00OTZlLTkyZDgtZDEzMGUwMjJjYzFjIiwic2lkIjoiZDQ2Njk5NTMtZGFiMy00ZWRmLTk5OWItOWU1NjhhZGRkOWYzIn0.Bd98I40UlD21fF01fXz-5V6yhY2r0h87sQcq18ricgQ",
  "access_expires_at": "2026-10-30T13:08:28.092647526Z",
  "refresh_token": "MTY4a06yRWX69wJkodDTN8zp_xcrv1uMD1VWSx_E39w",
  "refresh_expires_at": "2026-10-31T00:53:28.092235469Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "a64a6b3e-a14c-4259-b9f2-1a7c697d7282",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T12:53:28Z"
}
```

```json
{
  "id": "42ea579b-2a99-414b-b0e0-20b509f8cc5e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T12:53:28Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/42ea579b-2a99-414b-b0e0-20b509f8cc5e/publish` → **200**

```json
{
  "command_id": "fd95124f-29db-4d23-a32a-06bd7dd26122",
  "expected_version": 0
}
```

```json
{
  "id": "42ea579b-2a99-414b-b0e0-20b509f8cc5e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T12:53:28.570963Z",
  "published_at": "2026-10-30T12:53:28.570963Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "42ea579b-2a99-414b-b0e0-20b509f8cc5e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T12:53:28.570963Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632279716",
  "device_ref": "sandbox-16557"
}
```

```json
{
  "challenge_id": "e92d8234-0855-4529-9eea-cbc430745b2e",
  "expires_at": "2026-10-30T12:58:29.007248009Z",
  "resend_available_at": "2026-10-30T12:53:30.007248009Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632279716` → **200**

```json
{
  "phone": "+380632279716",
  "audience": "CLIENT",
  "code": "992385",
  "sent_at": "2026-10-30T12:53:29.009553761Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e92d8234-0855-4529-9eea-cbc430745b2e",
  "code": "992385",
  "device_ref": "sandbox-16557"
}
```

```json
{
  "session_id": "f7320038-5a38-4a4d-afe6-d13b5fbf6b21",
  "subject": {
    "type": "CLIENT",
    "id": "9b1eb620-0d87-4441-82ae-c11ac3f741ac"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjFlYjYyMC0wZDg3LTQ0NDEtODJhZS1jMTFhYzNmNzQxYWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1NzA5LCJpYXQiOjE3OTMzNjQ4MDksImp0aSI6IjE2ZGVjZWEyLTZhYjgtNDRkZC1hZmJlLTZlZDM5OGQ5NTAxNCIsInNpZCI6ImY3MzIwMDM4LTVhMzgtNGE0ZC1hZmU2LWQxM2I1ZmJmNmIyMSJ9.S5RvoodDoI7uzkwYBcfictVfAJQAJcu6GnbVld0q7B0",
  "access_expires_at": "2026-10-30T13:08:29.254258324Z",
  "refresh_token": "O69fqLevD_25aZhr-OouyHxK8JajgFqINo8mGRKLqQE",
  "refresh_expires_at": "2026-11-29T12:53:29.253839163Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "42ea579b-2a99-414b-b0e0-20b509f8cc5e",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T12:53:28.570963Z",
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
  "command_id": "a5a57ab7-eac4-47c8-b63b-626b7a339d29",
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
  "id": "d920caed-6f71-4451-ac59-85ae09a03e13",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:58:29.710838Z",
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
  "command_id": "2cdec63f-6253-474d-a6df-15498984d09c",
  "quote_id": "d920caed-6f71-4451-ac59-85ae09a03e13",
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
  "correlation_id": "56833c5b-87ab-4a31-adc8-9c57b4f8dcd9"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "a3afb7dc-184d-4dbf-affa-b88f08663bd7",
  "version_id": "42ea579b-2a99-414b-b0e0-20b509f8cc5e",
  "language": "uk"
}
```

```json
{
  "version_id": "42ea579b-2a99-414b-b0e0-20b509f8cc5e",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T12:53:30.181243Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bd243b05-fc7a-4379-81b9-3abd381ca470",
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
  "id": "ad6795b4-56d9-403b-a336-3afddc2ea09b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:58:30.410526Z",
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
  "command_id": "53360dea-86c8-4f67-8ce8-46a1013727da",
  "quote_id": "ad6795b4-56d9-403b-a336-3afddc2ea09b",
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
  "id": "c041b1ca-d617-4c86-8b4d-314a762b83fc",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9b1eb620-0d87-4441-82ae-c11ac3f741ac",
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
  "created_at": "2026-10-30T12:53:30.639995Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c041b1ca-d617-4c86-8b4d-314a762b83fc` → **200**

```json
{
  "id": "c041b1ca-d617-4c86-8b4d-314a762b83fc",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9b1eb620-0d87-4441-82ae-c11ac3f741ac",
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
  "created_at": "2026-10-30T12:53:30.639995Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c041b1ca-d617-4c86-8b4d-314a762b83fc/cancel` → **200**

```json
{
  "command_id": "32a85ad0-a9b8-4bc8-b601-cac18e612d18",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c041b1ca-d617-4c86-8b4d-314a762b83fc",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9b1eb620-0d87-4441-82ae-c11ac3f741ac",
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
  "created_at": "2026-10-30T12:53:30.639995Z",
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

`POST /api/admin/v1/legal-documents/42ea579b-2a99-414b-b0e0-20b509f8cc5e` → **409**

```json
{
  "command_id": "c57c7cbe-2abb-4520-a7c9-be44ef963649",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T12:53:31Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/42ea579b-2a99-414b-b0e0-20b509f8cc5e",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9a41a37e-dde1-4043-a230-cb2d0babc26a"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "ccd85df8-da7a-4102-90ed-65e74ad76aa3",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T12:53:31Z"
}
```

```json
{
  "id": "eb4e6f5b-76ef-4ce9-a9b3-db08f65f6c49",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T12:53:31Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/eb4e6f5b-76ef-4ce9-a9b3-db08f65f6c49/publish` → **200**

```json
{
  "command_id": "ded55fa2-0062-4328-8669-72b7ee186630",
  "expected_version": 0
}
```

```json
{
  "id": "eb4e6f5b-76ef-4ce9-a9b3-db08f65f6c49",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T12:53:31.831959Z",
  "published_at": "2026-10-30T12:53:31.831959Z",
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
  "device_ref": "sandbox-29297"
}
```

```json
{
  "challenge_id": "e911f61c-f615-48f9-9e1f-f71fe02f95b4",
  "expires_at": "2026-10-30T12:58:32.064676193Z",
  "resend_available_at": "2026-10-30T12:53:33.064676193Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "203560",
  "sent_at": "2026-10-30T12:53:32.066883415Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e911f61c-f615-48f9-9e1f-f71fe02f95b4",
  "code": "203560",
  "device_ref": "sandbox-29297"
}
```

```json
{
  "session_id": "d1cd85b3-88e7-4d1b-b946-d803b58dc2fb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTcxMiwiaWF0IjoxNzkzMzY0ODEyLCJqdGkiOiIxMTQzOTE0NC0xMThiLTQxMjktOWQyMC1iZDY0YjQ4NzM2M2IiLCJzaWQiOiJkMWNkODViMy04OGU3LTRkMWItYjk0Ni1kODAzYjU4ZGMyZmIifQ.MAFm6_u9Qe91hcwmDO0Zw-3m96Hwd2mNlGR-Xh2O048",
  "access_expires_at": "2026-10-30T13:08:32.3091952Z",
  "refresh_token": "SYwrjHAFBkptZO-rNL0N-z8f13EDtqQrMLNWOrHGlSQ",
  "refresh_expires_at": "2026-11-29T12:53:32.308520986Z",
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

(the car drives 73 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "d7b67144-5f5a-4a5d-a849-d4b936baf905",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:54:45Z",
    "sequence": 1793364885770
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "54142f30-236f-4c81-93fd-ddd9b9f8599c",
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
  "last_heartbeat_at": "2026-10-30T12:54:45.786354Z",
  "last_location_at": "2026-10-30T12:54:45.786354Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673779368",
  "device_ref": "sandbox-12873"
}
```

```json
{
  "challenge_id": "0e03ec79-d7df-4d48-9aee-a0aab001b0df",
  "expires_at": "2026-10-30T12:59:46.017214374Z",
  "resend_available_at": "2026-10-30T12:54:47.017214374Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673779368` → **200**

```json
{
  "phone": "+380673779368",
  "audience": "CLIENT",
  "code": "639969",
  "sent_at": "2026-10-30T12:54:46.019152782Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e03ec79-d7df-4d48-9aee-a0aab001b0df",
  "code": "639969",
  "device_ref": "sandbox-12873"
}
```

```json
{
  "session_id": "37acc312-f01d-4324-b421-4646bf091a15",
  "subject": {
    "type": "CLIENT",
    "id": "c1bed79a-05c7-4bfe-97e2-dfdd20399194"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWJlZDc5YS0wNWM3LTRiZmUtOTdlMi1kZmRkMjAzOTkxOTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1Nzg2LCJpYXQiOjE3OTMzNjQ4ODYsImp0aSI6ImRlZTdmNWVkLTZlMjctNGJhOC1iYzhiLWI1MWNjYjM3ZmFmZCIsInNpZCI6IjM3YWNjMzEyLWYwMWQtNDMyNC1iNDIxLTQ2NDZiZjA5MWExNSJ9.ivIez97dmH8v6BHFrzVomi8mMDg8Y-5URS8XHoLQNyk",
  "access_expires_at": "2026-10-30T13:09:46.262238378Z",
  "refresh_token": "s7d-hYffBdSb7Fq4mdYNSvjpSy9nWu9K3pVTdTiJwCA",
  "refresh_expires_at": "2026-11-29T12:54:46.261836025Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fbf806c0-8a64-4470-a2c6-4261b3cdc02f",
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
  "id": "4f0b5def-3b17-4443-bc7e-3f7762062a23",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:59:46.507925Z",
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
  "command_id": "45be7a27-b31d-45c6-875f-d87cffb54aab",
  "quote_id": "4f0b5def-3b17-4443-bc7e-3f7762062a23",
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
    "phone": "+380674675801"
  }
}
```

```json
{
  "id": "4bacf842-544d-4762-97d9-e72f05e355ec",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1bed79a-05c7-4bfe-97e2-dfdd20399194",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:54:46.819923Z",
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
    "id": "40eb114f-ae49-45fd-9718-fa17067e1258",
    "order_id": "4bacf842-544d-4762-97d9-e72f05e355ec",
    "expires_at": "2026-10-30T12:55:01.82372Z",
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

`POST /api/driver/v1/offers/40eb114f-ae49-45fd-9718-fa17067e1258/accept` → **200**

```json
{
  "command_id": "821ead4b-6b54-495e-a441-5a13cd132785"
}
```

```json
{
  "id": "5c82ef3d-412f-44c9-b102-43116593c461",
  "order_id": "4bacf842-544d-4762-97d9-e72f05e355ec",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "aa6cce37-12fa-4603-9291-7cf2c70da0e5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "aa6cce37-12fa-4603-9291-7cf2c70da0e5",
  "order_id": "4bacf842-544d-4762-97d9-e72f05e355ec",
  "assignment_id": "5c82ef3d-412f-44c9-b102-43116593c461",
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
    "phone": "+380674675801"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cdc67e3c-3fe4-4ab8-8e2d-197af5cf81bd",
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
  "id": "eed3b7e7-dd6c-4f00-bc37-c34b65141c74",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:59:47.815069Z",
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
  "command_id": "ff17145e-2161-4b08-a429-254b21893e2c",
  "quote_id": "eed3b7e7-dd6c-4f00-bc37-c34b65141c74",
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
  "id": "6a60a9b4-a87d-4449-b912-9df45cb881ba",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1bed79a-05c7-4bfe-97e2-dfdd20399194",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:54:48.054884Z",
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
  "command_id": "12a1a296-4dc7-410c-8070-2c512dc4b6d2",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T15:54:48Z"
}
```

```json
{
  "id": "98f44fff-ecac-4f73-99d9-3c7ab36ae6c0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:59:48.308682Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T15:54:48Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a7445945-2a84-4195-ae19-8e8a19ed7cc4",
  "quote_id": "98f44fff-ecac-4f73-99d9-3c7ab36ae6c0",
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
  "pickup_at": "2026-10-30T15:54:48Z"
}
```

```json
{
  "id": "cdfe5161-ef41-42ad-a167-742e8b055ec5",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c1bed79a-05c7-4bfe-97e2-dfdd20399194",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T12:54:48.545078Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T15:54:48Z",
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
  "command_id": "6028a432-840d-49f1-9d45-cc6942dc859b",
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
  "id": "a22fd306-8b39-4f7a-8079-f64251fd39f6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:59:48.787020Z",
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
  "command_id": "e998d206-1a53-4f88-8918-269f0d07fb2f",
  "quote_id": "a22fd306-8b39-4f7a-8079-f64251fd39f6",
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
  "correlation_id": "1334abcb-ce8a-4300-95c3-76ca4146bed3"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "cdfe5161-ef41-42ad-a167-742e8b055ec5",
      "short_number": 21,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "c1bed79a-05c7-4bfe-97e2-dfdd20399194",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T12:54:48.545078Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T15:54:48Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "6a60a9b4-a87d-4449-b912-9df45cb881ba",
      "short_number": 20,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "c1bed79a-05c7-4bfe-97e2-dfdd20399194",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T12:54:48.054884Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "4bacf842-544d-4762-97d9-e72f05e355ec",
      "short_number": 19,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "6a60a9b4-a87d-4449-b912-9df45cb881ba",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1bed79a-05c7-4bfe-97e2-dfdd20399194",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:54:48.054884Z",
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

`GET /api/rider/v1/orders/4bacf842-544d-4762-97d9-e72f05e355ec` → **200**

```json
{
  "id": "4bacf842-544d-4762-97d9-e72f05e355ec",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c1bed79a-05c7-4bfe-97e2-dfdd20399194",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5c82ef3d-412f-44c9-b102-43116593c461",
    "order_id": "4bacf842-544d-4762-97d9-e72f05e355ec",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "aa6cce37-12fa-4603-9291-7cf2c70da0e5",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T12:54:46.819923Z",
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
    "location_at": "2026-10-30T12:54:45.786354Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/4bacf842-544d-4762-97d9-e72f05e355ec/cancel` → **200**

```json
{
  "command_id": "613d1810-97b9-47b2-a7bb-7cd89a024315",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4bacf842-544d-4762-97d9-e72f05e355ec",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c1bed79a-05c7-4bfe-97e2-dfdd20399194",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5c82ef3d-412f-44c9-b102-43116593c461",
    "order_id": "4bacf842-544d-4762-97d9-e72f05e355ec",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "aa6cce37-12fa-4603-9291-7cf2c70da0e5",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T12:54:46.819923Z",
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

`GET /api/rider/v1/orders/6a60a9b4-a87d-4449-b912-9df45cb881ba` → **200**

```json
{
  "id": "6a60a9b4-a87d-4449-b912-9df45cb881ba",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1bed79a-05c7-4bfe-97e2-dfdd20399194",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:54:48.054884Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/6a60a9b4-a87d-4449-b912-9df45cb881ba/cancel` → **200**

```json
{
  "command_id": "239ded48-61bb-4ba4-b862-1f1c08323b91",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6a60a9b4-a87d-4449-b912-9df45cb881ba",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c1bed79a-05c7-4bfe-97e2-dfdd20399194",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:54:48.054884Z",
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

`GET /api/rider/v1/orders/cdfe5161-ef41-42ad-a167-742e8b055ec5` → **200**

```json
{
  "id": "cdfe5161-ef41-42ad-a167-742e8b055ec5",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c1bed79a-05c7-4bfe-97e2-dfdd20399194",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T12:54:48.545078Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T15:54:48Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/cdfe5161-ef41-42ad-a167-742e8b055ec5/cancel` → **200**

```json
{
  "command_id": "75af1ca3-9140-49a0-b628-7ed08e14d583",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "cdfe5161-ef41-42ad-a167-742e8b055ec5",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "c1bed79a-05c7-4bfe-97e2-dfdd20399194",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T12:54:48.545078Z",
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
  "pickup_at": "2026-10-30T15:54:48Z",
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
  "session_id": "54142f30-236f-4c81-93fd-ddd9b9f8599c",
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
  "last_heartbeat_at": "2026-10-30T12:54:45.786354Z",
  "last_location_at": "2026-10-30T12:54:45.786354Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/54142f30-236f-4c81-93fd-ddd9b9f8599c/close` → **200**

```json
{
  "command_id": "2197f2e5-9982-4c51-9112-7ef9a8846c7c",
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

Done: orders 4bacf842-544d-4762-97d9-e72f05e355ec, 6a60a9b4-a87d-4449-b912-9df45cb881ba, cdfe5161-ef41-42ad-a167-742e8b055ec5.

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
  "session_id": "8decf774-dced-4155-b302-e211f70748ec",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU3OTEsImlhdCI6MTc5MzM2NDg5MSwianRpIjoiZjVmNzhlNDAtMWFmYi00NWVkLWExMmQtZTkxYmE3OTIwYmZmIiwic2lkIjoiOGRlY2Y3NzQtZGNlZC00MTU1LWIzMDItZTIxMWY3MDc0OGVjIn0.qdxufSEaODxip_RwvFuiiSE3JaafTCPFJBPboLuCpRk",
  "access_expires_at": "2026-10-30T13:09:51.847605973Z",
  "refresh_token": "h2YV9BPyAPhSvJQ2JIYRKXHXF8tIS2RXbymFzsa33Vc",
  "refresh_expires_at": "2026-10-31T00:54:51.84698655Z",
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
  "session_id": "5480c1ba-3adc-4b86-aef6-a15ff269a757",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU3OTIsImlhdCI6MTc5MzM2NDg5MiwianRpIjoiMTFhNmNhMzYtYmNiZC00ODUyLThhMGUtNzRlZTQxMzU2YThmIiwic2lkIjoiNTQ4MGMxYmEtM2FkYy00Yjg2LWFlZjYtYTE1ZmYyNjlhNzU3In0.v-LVUVzhNd60-c106NAP6CCHHnu4-x14vwU_igy19u4",
  "access_expires_at": "2026-10-30T13:09:52.329072374Z",
  "refresh_token": "w2zOnkJNhQGrJ2-nGhsIBDQK1HshXUsyMly2WRvt0hI",
  "refresh_expires_at": "2026-10-31T00:54:52.32862174Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26416"
}
```

```json
{
  "challenge_id": "330539a8-84d1-4e6a-979f-b19deb464dcd",
  "expires_at": "2026-10-30T12:59:52.548649598Z",
  "resend_available_at": "2026-10-30T12:54:53.548649598Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "098253",
  "sent_at": "2026-10-30T12:54:52.550775702Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "330539a8-84d1-4e6a-979f-b19deb464dcd",
  "code": "098253",
  "device_ref": "sandbox-26416"
}
```

```json
{
  "session_id": "4c366564-8cc1-4d51-8b96-b4d086685316",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTc5MiwiaWF0IjoxNzkzMzY0ODkyLCJqdGkiOiJlNjZlMTAyNC1mOTRjLTQ4MTMtYmMzZi03YTU0MzE4YWI5ZWUiLCJzaWQiOiI0YzM2NjU2NC04Y2MxLTRkNTEtOGI5Ni1iNGQwODY2ODUzMTYifQ.hCL_JhXUPkba0DbnrDXpyX4oTfIjmByybGyp-vgJOcE",
  "access_expires_at": "2026-10-30T13:09:52.790558562Z",
  "refresh_token": "cnIIaiZGn9Sa81XrBug5e77ou97eU1OiktvS0RrmzQg",
  "refresh_expires_at": "2026-11-29T12:54:52.790095649Z",
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
  "command_id": "819455fd-953e-4fd1-ac31-61c5f3c460f6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:54:53Z",
    "sequence": 1793364893248
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "605c5d57-b5ae-4de2-b983-8fe496db9899",
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
  "last_heartbeat_at": "2026-10-30T12:54:53.263953Z",
  "last_location_at": "2026-10-30T12:54:53.263953Z",
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
  "command_id": "56ce8db2-38fc-4249-9c4f-2ddecf7e3a0c",
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
  "effective_at": "2026-10-30T12:54:53.72343Z",
  "changed_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T12:45:38.851574Z",
  "last_entries": [
    {
      "order_id": "94e7b6ee-2fc1-4f08-9c91-1550fa809bfa",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T12:45:38.851574Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c29d0287-d1e3-45b7-b879-60a3358f3101",
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
  "id": "d135b89a-d081-4f74-965c-c4d110baf7d6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:59:54.175818Z",
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
  "command_id": "cb883dd2-136d-4aab-be05-baa0a17a3483",
  "quote_id": "d135b89a-d081-4f74-965c-c4d110baf7d6",
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
    "phone": "+380671113728"
  }
}
```

```json
{
  "id": "9c812cfa-ad09-4855-9e3e-ee3733b7c6ec",
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
  "created_at": "2026-10-30T12:54:54.409174Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671113728"
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
    "id": "faa988ac-0f65-468f-b571-aa5707669858",
    "order_id": "9c812cfa-ad09-4855-9e3e-ee3733b7c6ec",
    "expires_at": "2026-10-30T12:55:09.412464Z",
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

`POST /api/driver/v1/offers/faa988ac-0f65-468f-b571-aa5707669858/accept` → **200**

```json
{
  "command_id": "e5b81673-025b-4895-9169-86b7d918333c"
}
```

```json
{
  "id": "8f9c9e9d-71f3-490d-be5d-b4fd321efb15",
  "order_id": "9c812cfa-ad09-4855-9e3e-ee3733b7c6ec",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c09ce2f6-bcc3-4d00-ab7b-00ecc6a516bf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c09ce2f6-bcc3-4d00-ab7b-00ecc6a516bf",
  "order_id": "9c812cfa-ad09-4855-9e3e-ee3733b7c6ec",
  "assignment_id": "8f9c9e9d-71f3-490d-be5d-b4fd321efb15",
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
    "phone": "+380671113728"
  }
}
```

`POST /api/driver/v1/work-sessions/605c5d57-b5ae-4de2-b983-8fe496db9899/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:54:55Z",
    "sequence": 1793364895363
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "605c5d57-b5ae-4de2-b983-8fe496db9899",
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
  "last_heartbeat_at": "2026-10-30T12:54:55.379203Z",
  "last_location_at": "2026-10-30T12:54:55.379203Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/c09ce2f6-bcc3-4d00-ab7b-00ecc6a516bf/arrive` → **200**

```json
{
  "command_id": "dc4b9e56-27c3-4316-ad91-02b1d3b47fee",
  "expected_version": 0
}
```

```json
{
  "id": "c09ce2f6-bcc3-4d00-ab7b-00ecc6a516bf",
  "order_id": "9c812cfa-ad09-4855-9e3e-ee3733b7c6ec",
  "assignment_id": "8f9c9e9d-71f3-490d-be5d-b4fd321efb15",
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
  "arrived_at": "2026-10-30T12:54:55.61688Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671113728"
  }
}
```

`POST /api/driver/v1/trips/c09ce2f6-bcc3-4d00-ab7b-00ecc6a516bf/start` → **200**

```json
{
  "command_id": "b52c0e89-8901-413c-99dd-d1ca083b7a3d",
  "expected_version": 1
}
```

```json
{
  "id": "c09ce2f6-bcc3-4d00-ab7b-00ecc6a516bf",
  "order_id": "9c812cfa-ad09-4855-9e3e-ee3733b7c6ec",
  "assignment_id": "8f9c9e9d-71f3-490d-be5d-b4fd321efb15",
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
  "arrived_at": "2026-10-30T12:54:55.61688Z",
  "started_at": "2026-10-30T12:54:55.853774Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671113728"
  }
}
```

`POST /api/driver/v1/trips/c09ce2f6-bcc3-4d00-ab7b-00ecc6a516bf/complete` → **200**

```json
{
  "command_id": "afaca16b-6aa9-45e7-bc52-257badd124a6",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:54:56Z",
  "cash_received": true
}
```

```json
{
  "id": "c09ce2f6-bcc3-4d00-ab7b-00ecc6a516bf",
  "order_id": "9c812cfa-ad09-4855-9e3e-ee3733b7c6ec",
  "assignment_id": "8f9c9e9d-71f3-490d-be5d-b4fd321efb15",
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
  "arrived_at": "2026-10-30T12:54:55.61688Z",
  "started_at": "2026-10-30T12:54:55.853774Z",
  "completed_at": "2026-10-30T12:54:56.097394Z",
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
  "command_id": "46f11e5b-5dda-42ce-ab11-a47886a29487",
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
  "id": "38c1235c-8f16-421c-8240-66cc1ed6f9eb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:59:56.338948Z",
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
  "command_id": "63e5992e-2ead-418c-9519-e38429e881eb",
  "quote_id": "38c1235c-8f16-421c-8240-66cc1ed6f9eb",
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
    "phone": "+380671111413"
  }
}
```

```json
{
  "id": "36afd7fb-6d00-400b-a23b-57f815b041fc",
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
  "created_at": "2026-10-30T12:54:56.572561Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671111413"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/36afd7fb-6d00-400b-a23b-57f815b041fc` → **200**

```json
{
  "id": "36afd7fb-6d00-400b-a23b-57f815b041fc",
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
  "created_at": "2026-10-30T12:54:56.572561Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671111413"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/36afd7fb-6d00-400b-a23b-57f815b041fc/cancel` → **200**

```json
{
  "command_id": "b45e6485-722d-4d97-b9dc-bd1ca2f4dbb4",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "36afd7fb-6d00-400b-a23b-57f815b041fc",
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
  "created_at": "2026-10-30T12:54:56.572561Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671111413"
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
  "staff_id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T12:45:38.851574Z",
  "last_entries": [
    {
      "order_id": "36afd7fb-6d00-400b-a23b-57f815b041fc",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T12:54:57.086873Z"
    },
    {
      "order_id": "9c812cfa-ad09-4855-9e3e-ee3733b7c6ec",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T12:54:56.101358Z"
    },
    {
      "order_id": "94e7b6ee-2fc1-4f08-9c91-1550fa809bfa",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T12:45:38.851574Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "605c5d57-b5ae-4de2-b983-8fe496db9899",
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
  "last_heartbeat_at": "2026-10-30T12:54:55.379203Z",
  "last_location_at": "2026-10-30T12:54:55.379203Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/605c5d57-b5ae-4de2-b983-8fe496db9899/close` → **200**

```json
{
  "command_id": "646c9fae-ca3f-4c68-9be4-773f44d0fdc1",
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

Done: operator bonus for fulfilled 9c812cfa-ad09-4855-9e3e-ee3733b7c6ec and operator-fault cancellation 36afd7fb-6d00-400b-a23b-57f815b041fc.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677980344",
  "device_ref": "sandbox-14540"
}
```

```json
{
  "challenge_id": "f7a54fd2-fac7-4756-a128-d797e8a97ecf",
  "expires_at": "2026-10-30T13:00:01.229095521Z",
  "resend_available_at": "2026-10-30T12:55:02.229095521Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677980344` → **200**

```json
{
  "phone": "+380677980344",
  "audience": "CLIENT",
  "code": "214205",
  "sent_at": "2026-10-30T12:55:01.231080297Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673041496",
  "device_ref": "sandbox-13314",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "17758ce4-050d-43a1-9ead-836002c9f54b",
  "expires_at": "2026-10-30T13:00:02.71617532Z",
  "resend_available_at": "2026-10-30T12:55:03.71617532Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673041496` → **200**

```json
{
  "phone": "+380673041496",
  "audience": "CLIENT",
  "code": "927366",
  "sent_at": "2026-10-30T12:55:02.717889257Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673041496",
  "device_ref": "sandbox-27380",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "cea733f6-6ca1-432a-9366-3698a3c307ab",
  "expires_at": "2026-10-30T13:00:04.158042998Z",
  "resend_available_at": "2026-10-30T12:55:05.158042998Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380673041496` → **200**

```json
{
  "phone": "+380673041496",
  "audience": "CLIENT",
  "code": "098504",
  "sent_at": "2026-10-30T12:55:04.160442305Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677900000",
  "device_ref": "sandbox-22645"
}
```

```json
{
  "challenge_id": "3778d951-cb8e-448b-8d20-8947a82f996a",
  "expires_at": "2026-10-30T13:00:05.611286606Z",
  "resend_available_at": "2026-10-30T12:55:06.611286606Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677900000",
  "device_ref": "sandbox-7634"
}
```

```json
{
  "challenge_id": "15e0b914-4a01-489b-b08e-bf04f9191e7c",
  "expires_at": "2026-10-30T13:00:07.039180232Z",
  "resend_available_at": "2026-10-30T12:55:08.039180232Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677900000` → **200**

```json
{
  "phone": "+380677900000",
  "audience": "CLIENT",
  "code": "562190",
  "sent_at": "2026-10-30T12:55:07.041373743Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677900000",
  "device_ref": "sandbox-3450",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "80f77473-35c1-4400-9c4a-727312d18252",
  "expires_at": "2026-10-30T13:00:08.489654792Z",
  "resend_available_at": "2026-10-30T12:55:09.489654792Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677900000` → **200**

```json
{
  "phone": "+380677900000",
  "audience": "CLIENT",
  "code": "775168",
  "sent_at": "2026-10-30T12:55:08.491642634Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380677900000",
  "device_ref": "sandbox-17983",
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
  "correlation_id": "85d3a3b5-b537-4f00-af2e-c8fb5b048282",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000023429"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "2454f430-b535-4708-8afd-ae3195b4fd62"
}
```

`GET /sandbox/v1/otp?phone=%2B442000023429` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120010472"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "9338a95f-c0fd-4685-a6d1-4c184a3f125b"
}
```

`GET /sandbox/v1/otp?phone=%2B37120010472` → **404**

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
  "session_id": "1e0fd128-cf70-4c64-9dd1-4ee771bee5fc",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU4MTAsImlhdCI6MTc5MzM2NDkxMCwianRpIjoiZjc4ZjU0NTUtYWMxNC00MDM5LWI0MWMtYjcyYjA5NjZmNGVkIiwic2lkIjoiMWUwZmQxMjgtY2Y3MC00YzY0LTlkZDEtNGVlNzcxYmVlNWZjIn0.hnI8FAgKarbGZhA3ljEP_1IHb1BNPAjvMHG-Rb9tSks",
  "access_expires_at": "2026-10-30T13:10:10.908063612Z",
  "refresh_token": "NJSwNFGLmnHq8ncGMNFw3E2s84zqdEDnaj8HpUxboD8",
  "refresh_expires_at": "2026-10-31T00:55:10.907646637Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677900000` → **200**

```json
{
  "deliveries": [
    {
      "id": "907ae84e-2808-4637-b992-2f966692adfe",
      "challenge_id": "80f77473-35c1-4400-9c4a-727312d18252",
      "phone": "+380677900000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-215cd453-ac01-43cb-9bd2-bdaf7d9c95a3",
      "error": null,
      "attempted_at": "2026-10-30T12:55:08.491988Z"
    },
    {
      "id": "3c362277-da95-4609-ae29-3311a9544bce",
      "challenge_id": "15e0b914-4a01-489b-b08e-bf04f9191e7c",
      "phone": "+380677900000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-40166530-3633-43ca-b5df-a04931b30e49",
      "error": null,
      "attempted_at": "2026-10-30T12:55:07.041592Z"
    },
    {
      "id": "7095841c-e52c-47ba-8f5c-80af5260034c",
      "challenge_id": "3778d951-cb8e-448b-8d20-8947a82f996a",
      "phone": "+380677900000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T12:55:05.613274Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380677900000` → **200**

```json
{
  "phone": "+380677900000",
  "audience": "CLIENT",
  "code": "775168",
  "sent_at": "2026-10-30T12:55:08.491642634Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673041496` → **200**

```json
{
  "deliveries": [
    {
      "id": "7364e0a3-c09a-4641-8097-f554d25690d5",
      "challenge_id": "cea733f6-6ca1-432a-9366-3698a3c307ab",
      "phone": "+380673041496",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-0ae7e706-ee62-4167-8247-c46a5ba4f554",
      "error": null,
      "attempted_at": "2026-10-30T12:55:04.160911Z"
    },
    {
      "id": "18638a49-404c-4a8b-b1eb-8c3e3d490add",
      "challenge_id": "17758ce4-050d-43a1-9ead-836002c9f54b",
      "phone": "+380673041496",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-8c4b5f5b-75de-407d-89f2-8018478f0e24",
      "error": null,
      "attempted_at": "2026-10-30T12:55:02.71827Z"
    }
  ]
}
```

Done: SMS to +380677980344; SMS then a call to +380673041496; a failed SMS, two calls and a refused third to +380677900000; +44 and +371 refused.

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
  "session_id": "5c8287bb-c77b-450b-92ea-6945cd1c9d5c",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU4MTEsImlhdCI6MTc5MzM2NDkxMSwianRpIjoiYTM5ZGJhMDYtZDc4OC00Y2FiLTkxODAtMGI2NGQ1ODkyMDRkIiwic2lkIjoiNWM4Mjg3YmItYzc3Yi00NTBiLTkyZWEtNjk0NWNkMWM5ZDVjIn0.uOsfLjqLR-NIQiSRJggQ_cNP1oLULuQ1VEASLZBGfAo",
  "access_expires_at": "2026-10-30T13:10:11.887382175Z",
  "refresh_token": "1fuOCWaMq6yDYi86SGEX5tbkMzBIHioBGL9SoNiFTO8",
  "refresh_expires_at": "2026-10-31T00:55:11.886764203Z",
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
  "session_id": "e2702ddd-7c7b-45fb-9aa4-6a13135ff9b2",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU4MTIsImlhdCI6MTc5MzM2NDkxMiwianRpIjoiNzUwMmM0MGItN2EzNC00ZThkLTkzMDEtZjE5ZGNjZTIyYTVmIiwic2lkIjoiZTI3MDJkZGQtN2M3Yi00NWZiLTlhYTQtNmExMzEzNWZmOWIyIn0.19YeyesI25UnUtYBLPB_zwf24SGLX3Ln9H3m_yMOuzM",
  "access_expires_at": "2026-10-30T13:10:12.364367375Z",
  "refresh_token": "AOIv8hn9Yde_Uur01m4w_mXmZ7jobweYepCUN1t2ClY",
  "refresh_expires_at": "2026-10-31T00:55:12.363845866Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
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

`POST /api/admin/v1/staff-extensions/7baee5a8-0553-4fd9-b08e-d8f836e6ea5f` → **200**

```json
{
  "command_id": "97a1b1f5-b339-42fb-aa71-ba19bd7857ed",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "3d8ff3f1-6231-426f-8a06-943da3fa6d4f",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T12:55:13.304142Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T12:55:13.304142Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "40e2501f-10f4-472a-993f-369ab38b4f61",
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
  "id": "d7bedb09-df57-4269-9272-5132d3b20341",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:00:13.749281Z",
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
  "command_id": "9ffc6009-f404-4bc5-8a1a-67d9364a2fd5",
  "quote_id": "d7bedb09-df57-4269-9272-5132d3b20341",
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
    "phone": "+380678725605"
  }
}
```

```json
{
  "id": "4df1846f-785d-4fde-97e6-aa0fcf64c368",
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
  "created_at": "2026-10-30T12:55:13.983703Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678725605"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/4df1846f-785d-4fde-97e6-aa0fcf64c368/calls` → **201**

```json
{
  "command_id": "d41776a2-5456-46fa-bd70-2dbb4c4428a8",
  "to": "CALLER"
}
```

```json
{
  "id": "bacb73a6-f9ea-4e9a-b034-a69020a6b12a",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "order_ids": [
    "4df1846f-785d-4fde-97e6-aa0fcf64c368"
  ],
  "started_at": "2026-10-30T12:55:14.237457Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/4df1846f-785d-4fde-97e6-aa0fcf64c368/calls` → **201**

```json
{
  "command_id": "d41776a2-5456-46fa-bd70-2dbb4c4428a8",
  "to": "CALLER"
}
```

```json
{
  "id": "bacb73a6-f9ea-4e9a-b034-a69020a6b12a",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "order_ids": [
    "4df1846f-785d-4fde-97e6-aa0fcf64c368"
  ],
  "started_at": "2026-10-30T12:55:14.237457Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "bacb73a6-f9ea-4e9a-b034-a69020a6b12a",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380678725605",
    "at": "2026-10-30T12:55:14.23955378Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "bacb73a6-f9ea-4e9a-b034-a69020a6b12a",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.23200",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "bacb73a6-f9ea-4e9a-b034-a69020a6b12a"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "bacb73a6-f9ea-4e9a-b034-a69020a6b12a",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=4df1846f-785d-4fde-97e6-aa0fcf64c368` → **200**

```json
{
  "calls": [
    {
      "id": "bacb73a6-f9ea-4e9a-b034-a69020a6b12a",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "order_ids": [
        "4df1846f-785d-4fde-97e6-aa0fcf64c368"
      ],
      "started_at": "2026-10-30T12:55:14.237457Z",
      "answered_at": "2026-10-30T12:55:14.757226Z",
      "ended_at": "2026-10-30T12:55:14.774898Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=4df1846f-785d-4fde-97e6-aa0fcf64c368` → **200**

```json
{
  "calls": [
    {
      "id": "bacb73a6-f9ea-4e9a-b034-a69020a6b12a",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "order_ids": [
        "4df1846f-785d-4fde-97e6-aa0fcf64c368"
      ],
      "started_at": "2026-10-30T12:55:14.237457Z",
      "answered_at": "2026-10-30T12:55:14.757226Z",
      "ended_at": "2026-10-30T12:55:14.774898Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=4df1846f-785d-4fde-97e6-aa0fcf64c368` → **200**

```json
{
  "calls": [
    {
      "id": "bacb73a6-f9ea-4e9a-b034-a69020a6b12a",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "order_ids": [
        "4df1846f-785d-4fde-97e6-aa0fcf64c368"
      ],
      "started_at": "2026-10-30T12:55:14.237457Z",
      "answered_at": "2026-10-30T12:55:14.757226Z",
      "ended_at": "2026-10-30T12:55:14.774898Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=4df1846f-785d-4fde-97e6-aa0fcf64c368` → **200**

```json
{
  "calls": [
    {
      "id": "bacb73a6-f9ea-4e9a-b034-a69020a6b12a",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "order_ids": [
        "4df1846f-785d-4fde-97e6-aa0fcf64c368"
      ],
      "started_at": "2026-10-30T12:55:14.237457Z",
      "answered_at": "2026-10-30T12:55:14.757226Z",
      "ended_at": "2026-10-30T12:55:14.774898Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T12:55:19.714755Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/4df1846f-785d-4fde-97e6-aa0fcf64c368` → **200**

```json
{
  "id": "4df1846f-785d-4fde-97e6-aa0fcf64c368",
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
  "created_at": "2026-10-30T12:55:13.983703Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678725605"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4df1846f-785d-4fde-97e6-aa0fcf64c368/cancel` → **200**

```json
{
  "command_id": "7c1f3c50-072d-492c-a63e-1b3aa0110bae",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4df1846f-785d-4fde-97e6-aa0fcf64c368",
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
  "created_at": "2026-10-30T12:55:13.983703Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678725605"
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
  "command_id": "d0f6276c-52ae-425d-8dfe-df6c472a9e24",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T12:55:22.277005Z",
  "extension": "101"
}
```

Done: outgoing call bacb73a6-f9ea-4e9a-b034-a69020a6b12a from order 4df1846f-785d-4fde-97e6-aa0fcf64c368, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632435124",
  "device_ref": "sandbox-30830"
}
```

```json
{
  "challenge_id": "f63bb934-cac3-45d3-9524-3757c87d671b",
  "expires_at": "2026-10-30T13:00:22.514017879Z",
  "resend_available_at": "2026-10-30T12:55:23.514017879Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632435124` → **200**

```json
{
  "phone": "+380632435124",
  "audience": "CLIENT",
  "code": "604217",
  "sent_at": "2026-10-30T12:55:22.516018215Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f63bb934-cac3-45d3-9524-3757c87d671b",
  "code": "604217",
  "device_ref": "sandbox-30830"
}
```

```json
{
  "session_id": "d0139747-471f-4db1-94f6-f88561382226",
  "subject": {
    "type": "CLIENT",
    "id": "3eca1300-1e84-4075-856e-ef4f7b8a839d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZWNhMTMwMC0xZTg0LTQwNzUtODU2ZS1lZjRmN2I4YTgzOWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1ODIyLCJpYXQiOjE3OTMzNjQ5MjIsImp0aSI6IjI4YjM2MjAxLTM3ODYtNDhmMy1iNWJlLTk0ZmNmM2ZiNGVhZiIsInNpZCI6ImQwMTM5NzQ3LTQ3MWYtNGRiMS05NGY2LWY4ODU2MTM4MjIyNiJ9.LdKbitEBIMXBbYr6DDVBBCPr3kWymcSyO41FhIgq0bo",
  "access_expires_at": "2026-10-30T13:10:22.754030047Z",
  "refresh_token": "u6wTwAva7FLaB04p5HGdl7G1_T0REjZzCZlvhAvlVNs",
  "refresh_expires_at": "2026-11-29T12:55:22.753538243Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3eca1300-1e84-4075-856e-ef4f7b8a839d",
  "session_id": "d0139747-471f-4db1-94f6-f88561382226",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632435124",
  "device_ref": "sandbox-8207"
}
```

```json
{
  "challenge_id": "e315359d-e7e5-4098-a6e4-1e8f41c88487",
  "expires_at": "2026-10-30T13:00:25.187743517Z",
  "resend_available_at": "2026-10-30T12:55:26.187743517Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632435124` → **200**

```json
{
  "phone": "+380632435124",
  "audience": "CLIENT",
  "code": "675337",
  "sent_at": "2026-10-30T12:55:25.189801388Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e315359d-e7e5-4098-a6e4-1e8f41c88487",
  "code": "675337",
  "device_ref": "sandbox-8207"
}
```

```json
{
  "session_id": "7e4ab427-4b9d-4c13-86b9-9da38badadd6",
  "subject": {
    "type": "CLIENT",
    "id": "3eca1300-1e84-4075-856e-ef4f7b8a839d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZWNhMTMwMC0xZTg0LTQwNzUtODU2ZS1lZjRmN2I4YTgzOWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1ODI1LCJpYXQiOjE3OTMzNjQ5MjUsImp0aSI6IjU2NDhlNDY4LWI4YWItNGIzOC1iM2I2LTdkMjcwZDNkODZmMCIsInNpZCI6IjdlNGFiNDI3LTRiOWQtNGMxMy04NmI5LTlkYTM4YmFkYWRkNiJ9.luE-4NXERTdKhLoAWaHff5M2X-9FzBWSDmk4lwi4pgM",
  "access_expires_at": "2026-10-30T13:10:25.431456878Z",
  "refresh_token": "oNyWhk-WfRMyIqMRfZdl9FOQDrESNAeFAP2OCex5IlQ",
  "refresh_expires_at": "2026-11-29T12:55:25.431028196Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "1db9da48-a631-410c-9d7e-9c58b9989f54",
  "expires_at": "2026-10-30T13:00:27.654959891Z",
  "resend_available_at": "2026-10-30T12:55:28.654959891Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632435124` → **200**

```json
{
  "phone": "+380632435124",
  "audience": "CLIENT",
  "code": "998743",
  "sent_at": "2026-10-30T12:55:27.656724092Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380636295094"
}
```

```json
{
  "challenge_id": "9d013d24-6288-439c-a945-67a39f156836",
  "expires_at": "2026-10-30T13:00:27.893356372Z",
  "resend_available_at": "2026-10-30T12:55:28.893356372Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636295094` → **200**

```json
{
  "phone": "+380636295094",
  "audience": "CLIENT",
  "code": "068093",
  "sent_at": "2026-10-30T12:55:27.895078732Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "285e8df7-bf5b-4f58-af00-fa687df053da",
  "current_challenge_id": "1db9da48-a631-410c-9d7e-9c58b9989f54",
  "current_code": "000000",
  "new_challenge_id": "9d013d24-6288-439c-a945-67a39f156836",
  "new_code": "068093"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "8ba1ebc1-ff8b-4ec6-a80c-14ac1dad6f86"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "0762e65a-6419-4219-9333-962c618bec9a",
  "current_challenge_id": "1db9da48-a631-410c-9d7e-9c58b9989f54",
  "current_code": "998743",
  "new_challenge_id": "9d013d24-6288-439c-a945-67a39f156836",
  "new_code": "068093"
}
```

```json
{
  "subject_id": "3eca1300-1e84-4075-856e-ef4f7b8a839d",
  "phone": "+380636295094",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3eca1300-1e84-4075-856e-ef4f7b8a839d",
  "session_id": "d0139747-471f-4db1-94f6-f88561382226",
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
  "correlation_id": "60a53284-a62d-4461-aaaa-ed68afe1058e"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636295094",
  "device_ref": "sandbox-7924"
}
```

```json
{
  "challenge_id": "53de0b13-9ac5-4d1c-9ced-aabc55de45e3",
  "expires_at": "2026-10-30T13:00:31.020224657Z",
  "resend_available_at": "2026-10-30T12:55:32.020224657Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636295094` → **200**

```json
{
  "phone": "+380636295094",
  "audience": "CLIENT",
  "code": "568894",
  "sent_at": "2026-10-30T12:55:31.022241632Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "53de0b13-9ac5-4d1c-9ced-aabc55de45e3",
  "code": "568894",
  "device_ref": "sandbox-7924"
}
```

```json
{
  "session_id": "16012899-1d59-4e5d-b313-5ac28c2ca06a",
  "subject": {
    "type": "CLIENT",
    "id": "3eca1300-1e84-4075-856e-ef4f7b8a839d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZWNhMTMwMC0xZTg0LTQwNzUtODU2ZS1lZjRmN2I4YTgzOWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1ODMxLCJpYXQiOjE3OTMzNjQ5MzEsImp0aSI6IjQ2NzY3MDJkLWEyNDQtNDM5ZS05MDUzLTYwMDgzMTVmZjUzNSIsInNpZCI6IjE2MDEyODk5LTFkNTktNGU1ZC1iMzEzLTVhYzI4YzJjYTA2YSJ9.gQ4CsgO9u67xK1fsonQialq6Lk19lM9aZBaP5UuB0Ac",
  "access_expires_at": "2026-10-30T13:10:31.269492912Z",
  "refresh_token": "64CIpp-5J0b4EjcYhR9-Oji1mGs9BI0qcdFFZb0uf-s",
  "refresh_expires_at": "2026-11-29T12:55:31.269082387Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3eca1300-1e84-4075-856e-ef4f7b8a839d",
  "session_id": "16012899-1d59-4e5d-b313-5ac28c2ca06a",
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
  "session_id": "66fa2db4-961e-4649-bb96-b65e03d9445e",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU4MzEsImlhdCI6MTc5MzM2NDkzMSwianRpIjoiNmY0NGRlNTEtZGJjNS00YmM1LWJhNzEtYWU0YmM4MGJmNTM4Iiwic2lkIjoiNjZmYTJkYjQtOTYxZS00NjQ5LWJiOTYtYjY1ZTAzZDk0NDVlIn0.P1lh8TdZEWR4pNctap44gd5HrE5IY5hl9ZyaNmu1QZA",
  "access_expires_at": "2026-10-30T13:10:31.966885066Z",
  "refresh_token": "fpSqR8kik7XsZCMEzerFwpnXnbiLIgk8pNZRzJR8G7A",
  "refresh_expires_at": "2026-10-31T00:55:31.966452889Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/3eca1300-1e84-4075-856e-ef4f7b8a839d` → **200**

```json
{
  "client": {
    "id": "3eca1300-1e84-4075-856e-ef4f7b8a839d",
    "phone": "+380636295094",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:55:22.752221Z",
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

`POST /api/admin/v1/clients/3eca1300-1e84-4075-856e-ef4f7b8a839d/phone/new-code` → **201**

```json
{
  "phone": "+380636309704"
}
```

```json
{
  "challenge_id": "8683079b-33dc-480d-b292-e8faedec7c3a",
  "expires_at": "2026-10-30T13:00:32.429872521Z",
  "resend_available_at": "2026-10-30T12:55:33.429872521Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636309704` → **200**

```json
{
  "phone": "+380636309704",
  "audience": "CLIENT",
  "code": "320166",
  "sent_at": "2026-10-30T12:55:32.431582292Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/3eca1300-1e84-4075-856e-ef4f7b8a839d/phone` → **422**

```json
{
  "command_id": "a23a9d4f-34bb-4fca-a7d3-8a0112c2e277",
  "expected_version": 3,
  "new_challenge_id": "8683079b-33dc-480d-b292-e8faedec7c3a",
  "new_code": "320167",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/3eca1300-1e84-4075-856e-ef4f7b8a839d/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "97195c61-4f50-4da3-be56-069ff174380c"
}
```

`POST /api/admin/v1/clients/3eca1300-1e84-4075-856e-ef4f7b8a839d/phone` → **400**

```json
{
  "command_id": "4aaced2a-0608-416d-a456-0fdb386dc2c5",
  "expected_version": 3,
  "new_challenge_id": "8683079b-33dc-480d-b292-e8faedec7c3a",
  "new_code": "320166",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/3eca1300-1e84-4075-856e-ef4f7b8a839d/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "09f8f02e-16ed-4f90-b4ea-4702917b0947",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/3eca1300-1e84-4075-856e-ef4f7b8a839d/phone` → **200**

```json
{
  "command_id": "2d57a72b-b7b0-4924-ab0c-7e453c868541",
  "expected_version": 3,
  "new_challenge_id": "8683079b-33dc-480d-b292-e8faedec7c3a",
  "new_code": "320166",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "3eca1300-1e84-4075-856e-ef4f7b8a839d",
  "phone": "+380636309704",
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
  "correlation_id": "9636c59a-46cf-4ec6-871d-903cb5595369"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636309704",
  "device_ref": "sandbox-22020"
}
```

```json
{
  "challenge_id": "f45b5b4e-2c66-4c46-a635-7d165c2aeec3",
  "expires_at": "2026-10-30T13:00:33.565162085Z",
  "resend_available_at": "2026-10-30T12:55:34.565162085Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636309704` → **200**

```json
{
  "phone": "+380636309704",
  "audience": "CLIENT",
  "code": "649248",
  "sent_at": "2026-10-30T12:55:33.567957997Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f45b5b4e-2c66-4c46-a635-7d165c2aeec3",
  "code": "649248",
  "device_ref": "sandbox-22020"
}
```

```json
{
  "session_id": "5f861b36-f8fc-44c4-9cfa-f3d1f8c68c84",
  "subject": {
    "type": "CLIENT",
    "id": "3eca1300-1e84-4075-856e-ef4f7b8a839d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZWNhMTMwMC0xZTg0LTQwNzUtODU2ZS1lZjRmN2I4YTgzOWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1ODMzLCJpYXQiOjE3OTMzNjQ5MzMsImp0aSI6ImUyMGViNDRjLWQ4Y2ItNDdiMi1hYjAxLTlhOGY0MmE1NTgxZiIsInNpZCI6IjVmODYxYjM2LWY4ZmMtNDRjNC05Y2ZhLWYzZDFmOGM2OGM4NCJ9.1Wox5ZdbiDoZEk_hJN5k_ctRh34MD8ZNWZrewrEhK-c",
  "access_expires_at": "2026-10-30T13:10:33.807188272Z",
  "refresh_token": "t6qedQYayvpItHQJiYA9NtcB9X9B2sexGIJifkx8G5Q",
  "refresh_expires_at": "2026-11-29T12:55:33.806780751Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3eca1300-1e84-4075-856e-ef4f7b8a839d",
  "session_id": "5f861b36-f8fc-44c4-9cfa-f3d1f8c68c84",
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
  "phone": "+380631395903",
  "device_ref": "sandbox-25305"
}
```

```json
{
  "challenge_id": "7a888986-fc9f-48cd-8929-66206be4f9dc",
  "expires_at": "2026-10-30T13:00:34.249098439Z",
  "resend_available_at": "2026-10-30T12:55:35.249098439Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631395903` → **200**

```json
{
  "phone": "+380631395903",
  "audience": "CLIENT",
  "code": "444852",
  "sent_at": "2026-10-30T12:55:34.251128422Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7a888986-fc9f-48cd-8929-66206be4f9dc",
  "code": "444852",
  "device_ref": "sandbox-25305"
}
```

```json
{
  "session_id": "87ba36bf-46c6-409d-acff-216bfd38a3c2",
  "subject": {
    "type": "CLIENT",
    "id": "a6bc87b5-a8fb-4635-9025-fc436001cdcd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNmJjODdiNS1hOGZiLTQ2MzUtOTAyNS1mYzQzNjAwMWNkY2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1ODM0LCJpYXQiOjE3OTMzNjQ5MzQsImp0aSI6Ijg4YTc0ZjFlLWU0ODktNDM3Ni1iNzhhLWZlZjk4YTBiNTY0NSIsInNpZCI6Ijg3YmEzNmJmLTQ2YzYtNDA5ZC1hY2ZmLTIxNmJmZDM4YTNjMiJ9.ObFW_hdP2b1ufsyHHA6R_esdKg12EvJ-xLtuRhckKHs",
  "access_expires_at": "2026-10-30T13:10:34.494230665Z",
  "refresh_token": "ZGHbqG3_gEqIfgc3H6QmYAljATbIfvrEq56sDUzRtLM",
  "refresh_expires_at": "2026-11-29T12:55:34.493727794Z",
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
  "session_id": "fc397ced-7441-4845-987c-fdfadf53ae6f",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU4MzUsImlhdCI6MTc5MzM2NDkzNSwianRpIjoiZjQ1NDJlMDgtZWI3OS00MzJlLWI3MTAtZjE1OGM5YmY4ODljIiwic2lkIjoiZmMzOTdjZWQtNzQ0MS00ODQ1LTk4N2MtZmRmYWRmNTNhZTZmIn0.vq6RAZZ8yWaBmj-X6eI_Ms-Hs2shqqq8CkAuSwGC_D4",
  "access_expires_at": "2026-10-30T13:10:35.44109172Z",
  "refresh_token": "yOJZoVqu7mUqXJYKa1eP-uwAHfSqRwSSSyFwRiWMOUk",
  "refresh_expires_at": "2026-10-31T00:55:35.440657139Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380631395903` → **200**

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
  "correlation_id": "2c63cfdb-2e9d-49c4-99a6-6da8092eb806"
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
  "session_id": "bae944e8-1736-4775-901b-e8b597fac32e",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU4MzYsImlhdCI6MTc5MzM2NDkzNiwianRpIjoiYTY2ZDg4NTMtMDM3OC00NDZkLWJjNzAtMWE0NTg5YzczNmExIiwic2lkIjoiYmFlOTQ0ZTgtMTczNi00Nzc1LTkwMWItZThiNTk3ZmFjMzJlIn0.OR2FTYdHQqMWqfs4wUyiOCOxlnzgITIQQO4ubUPeqFo",
  "access_expires_at": "2026-10-30T13:10:36.383915623Z",
  "refresh_token": "sgbtrbiI4Vz869Ymb1sCvuRAuqnHvFyqakDLSyDFL84",
  "refresh_expires_at": "2026-10-31T00:55:36.383509544Z",
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
  "changed_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T12:41:45.505059Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "c159c342-19c8-49cc-a47a-a4d4d17a50aa",
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
  "changed_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T12:55:36.846845181Z"
}
```

## The rider books the airport for 2026-10-30T15:55:36Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600937866",
  "device_ref": "sandbox-26017"
}
```

```json
{
  "challenge_id": "cf0a7f38-ac4d-4491-b387-cd1daff9f34b",
  "expires_at": "2026-10-30T13:00:37.089433013Z",
  "resend_available_at": "2026-10-30T12:55:38.089433013Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600937866` → **200**

```json
{
  "phone": "+48600937866",
  "audience": "CLIENT",
  "code": "405995",
  "sent_at": "2026-10-30T12:55:37.09264519Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf0a7f38-ac4d-4491-b387-cd1daff9f34b",
  "code": "405995",
  "device_ref": "sandbox-26017"
}
```

```json
{
  "session_id": "0463b7d4-f6de-486a-8107-1b33d7234451",
  "subject": {
    "type": "CLIENT",
    "id": "c98bb3b2-7405-4d28-88d7-e9c10ae5038f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOThiYjNiMi03NDA1LTRkMjgtODhkNy1lOWMxMGFlNTAzOGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1ODM3LCJpYXQiOjE3OTMzNjQ5MzcsImp0aSI6IjUxYzA0ZWU5LTNjMTYtNDc0ZC1hOWVkLTk2YzZmOTMyZDkwYiIsInNpZCI6IjA0NjNiN2Q0LWY2ZGUtNDg2YS04MTA3LTFiMzNkNzIzNDQ1MSJ9.238phcet8BTfYU8AO28tOBd4YZ9UV0aKG9EbKmPOk34",
  "access_expires_at": "2026-10-30T13:10:37.339440996Z",
  "refresh_token": "_-EkhURor9jkuFqQqe_ksfiXSPAQg40CELWH-8NLoMc",
  "refresh_expires_at": "2026-11-29T12:55:37.338999225Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "138e19b4-b498-411c-9dac-176fe5b199c2",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T15:55:36Z"
}
```

```json
{
  "id": "094428fa-ba95-41da-9a02-f87e17a720d6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:00:37.565160Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T15:55:36Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "29795ab7-8828-4ee0-a141-6e744a180d55",
  "quote_id": "094428fa-ba95-41da-9a02-f87e17a720d6",
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
  "pickup_at": "2026-10-30T15:55:36Z"
}
```

```json
{
  "id": "beafb681-b57c-4aeb-b9e7-70b64969c97e",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c98bb3b2-7405-4d28-88d7-e9c10ae5038f",
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
  "created_at": "2026-10-30T12:55:37.794929Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T15:55:36Z",
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
  "device_ref": "sandbox-3641"
}
```

```json
{
  "challenge_id": "a8581679-4345-4dcf-9680-f020702e3575",
  "expires_at": "2026-10-30T13:00:38.033958857Z",
  "resend_available_at": "2026-10-30T12:55:39.033958857Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "715543",
  "sent_at": "2026-10-30T12:55:38.036563758Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a8581679-4345-4dcf-9680-f020702e3575",
  "code": "715543",
  "device_ref": "sandbox-3641"
}
```

```json
{
  "session_id": "9a922567-c9c3-492a-84b2-1853dc1e9b04",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTgzOCwiaWF0IjoxNzkzMzY0OTM4LCJqdGkiOiJhZjRkMmUxMi05NDcyLTQzYzMtYmIyYi00YjQ2NWMxNGQxZjQiLCJzaWQiOiI5YTkyMjU2Ny1jOWMzLTQ5MmEtODRiMi0xODUzZGMxZTliMDQifQ.Q7WRZmAa7E9nXgiqaI9xOWzNHzah-XM5cRjcA9CLCI8",
  "access_expires_at": "2026-10-30T13:10:38.277219641Z",
  "refresh_token": "BzL6qAOwFxhF8atBPmZVpwDQxOidvHBli1zTuwU7QEA",
  "refresh_expires_at": "2026-11-29T12:55:38.276734606Z",
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
  "command_id": "aa77bced-4545-4adf-bf33-36d08a50de5b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:55:38Z",
    "sequence": 1793364938732
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "efe5e7cc-8bac-4dba-aeab-61bf02691712",
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
  "last_heartbeat_at": "2026-10-30T12:55:38.747997Z",
  "last_location_at": "2026-10-30T12:55:38.747997Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "beafb681-b57c-4aeb-b9e7-70b64969c97e",
      "short_number": 25,
      "pickup_at": "2026-10-30T15:55:36Z",
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

`POST /api/driver/v1/preorders/beafb681-b57c-4aeb-b9e7-70b64969c97e/reserve` → **200**

```json
{
  "command_id": "94a99103-d884-46bf-9a5a-eab7cd4365ab"
}
```

```json
{
  "id": "1d34efb9-f193-4821-b30a-912c3c43f4a3",
  "state": "RESERVED",
  "order": {
    "order_id": "beafb681-b57c-4aeb-b9e7-70b64969c97e",
    "short_number": 25,
    "pickup_at": "2026-10-30T15:55:36Z",
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
  "reserved_at": "2026-10-30T12:55:39.194315Z",
  "confirm_from": "2026-10-30T15:25:36Z",
  "confirm_until": "2026-10-30T15:35:36Z",
  "drop_until": "2026-10-30T14:55:36Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "1d34efb9-f193-4821-b30a-912c3c43f4a3",
      "state": "RESERVED",
      "order": {
        "order_id": "beafb681-b57c-4aeb-b9e7-70b64969c97e",
        "short_number": 25,
        "pickup_at": "2026-10-30T15:55:36Z",
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
      "reserved_at": "2026-10-30T12:55:39.194315Z",
      "confirm_from": "2026-10-30T15:25:36Z",
      "confirm_until": "2026-10-30T15:35:36Z",
      "drop_until": "2026-10-30T14:55:36Z"
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
      "id": "1d34efb9-f193-4821-b30a-912c3c43f4a3",
      "state": "RESERVED",
      "order": {
        "order_id": "beafb681-b57c-4aeb-b9e7-70b64969c97e",
        "short_number": 25,
        "pickup_at": "2026-10-30T15:55:36Z",
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
      "reserved_at": "2026-10-30T12:55:39.194315Z",
      "confirm_from": "2026-10-30T15:25:36Z",
      "confirm_until": "2026-10-30T15:35:36Z",
      "drop_until": "2026-10-30T14:55:36Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/1d34efb9-f193-4821-b30a-912c3c43f4a3/confirm` → **409**

```json
{
  "command_id": "42e4ae77-6e5a-450a-8c02-c3ce92abc53a"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/1d34efb9-f193-4821-b30a-912c3c43f4a3/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e6b31a95-ce4c-4b77-84b3-aa427b2e483b"
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
  "session_id": "ab17517b-fc11-40bc-aece-dd51d7825453",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU4NDAsImlhdCI6MTc5MzM2NDk0MCwianRpIjoiMDAxZTYzMjMtOTQwMS00NDcyLTkyOGUtYzEwMDAyMjllNmRkIiwic2lkIjoiYWIxNzUxN2ItZmMxMS00MGJjLWFlY2UtZGQ1MWQ3ODI1NDUzIn0.347V9Fq4rfxPWP0x61QN2Z22wT5vpowAKinMkh6OjgM",
  "access_expires_at": "2026-10-30T13:10:40.353781893Z",
  "refresh_token": "QVAL2zFGGoy1F8xFXfIGJSM0VsE8SoZHdNLqyuEzRTs",
  "refresh_expires_at": "2026-10-31T00:55:40.353310628Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/beafb681-b57c-4aeb-b9e7-70b64969c97e` → **200**

```json
{
  "id": "beafb681-b57c-4aeb-b9e7-70b64969c97e",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "c98bb3b2-7405-4d28-88d7-e9c10ae5038f",
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
  "created_at": "2026-10-30T12:55:37.794929Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T15:55:36Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "1d34efb9-f193-4821-b30a-912c3c43f4a3",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T12:55:39.194315Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/beafb681-b57c-4aeb-b9e7-70b64969c97e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T12:55:37.795781Z",
      "actor": {
        "type": "CLIENT",
        "id": "c98bb3b2-7405-4d28-88d7-e9c10ae5038f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "beafb681-b57c-4aeb-b9e7-70b64969c97e",
        "preorder": true,
        "quote_id": "094428fa-ba95-41da-9a02-f87e17a720d6",
        "pickup_at": "2026-10-30T15:55:36Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "00e013b9-e7e0-49cf-9f47-5b278ba44237"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T12:55:39.195159Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "beafb681-b57c-4aeb-b9e7-70b64969c97e",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "1d34efb9-f193-4821-b30a-912c3c43f4a3"
      },
      "correlation_id": "7e46297b-2122-4421-a854-6214bb34f4bc"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order beafb681-b57c-4aeb-b9e7-70b64969c97e, reservation 1d34efb9-f193-4821-b30a-912c3c43f4a3.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12591"
}
```

```json
{
  "challenge_id": "970e5711-ae65-4ace-8950-ea3694de0a6f",
  "expires_at": "2026-10-30T13:00:41.048289649Z",
  "resend_available_at": "2026-10-30T12:55:42.048289649Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "525225",
  "sent_at": "2026-10-30T12:55:41.0505012Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "970e5711-ae65-4ace-8950-ea3694de0a6f",
  "code": "525225",
  "device_ref": "sandbox-12591"
}
```

```json
{
  "session_id": "8a9667fa-7d81-4e4d-a3ae-ed82a02969a7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTg0MSwiaWF0IjoxNzkzMzY0OTQxLCJqdGkiOiI1ZTYwNWU0Ni0yNWM1LTQ0ODctYWE5Mi1jNDg0ODFiMTBlYzEiLCJzaWQiOiI4YTk2NjdmYS03ZDgxLTRlNGQtYTNhZS1lZDgyYTAyOTY5YTcifQ.J5v5Fy5nWQtqopeaqHe8EK3J0eJ29VXWVwP-RuqyXvo",
  "access_expires_at": "2026-10-30T13:10:41.293105025Z",
  "refresh_token": "33X0H5DARvBcjz8yfed1KqOeEuInV0Bkmn64TcpLPP8",
  "refresh_expires_at": "2026-11-29T12:55:41.292666699Z",
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
  "command_id": "c86efef4-9063-4458-b33c-df7458a4049a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:55:41Z",
    "sequence": 1793364941763
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b7994168-cae9-4d0f-a8eb-686b7826fa4e",
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
  "last_heartbeat_at": "2026-10-30T12:55:41.778944Z",
  "last_location_at": "2026-10-30T12:55:41.778944Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677684315",
  "device_ref": "sandbox-2125"
}
```

```json
{
  "challenge_id": "d3078249-a207-49a6-be9c-b23d74974462",
  "expires_at": "2026-10-30T13:00:41.998824364Z",
  "resend_available_at": "2026-10-30T12:55:42.998824364Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677684315` → **200**

```json
{
  "phone": "+380677684315",
  "audience": "CLIENT",
  "code": "632029",
  "sent_at": "2026-10-30T12:55:42.001007603Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d3078249-a207-49a6-be9c-b23d74974462",
  "code": "632029",
  "device_ref": "sandbox-2125"
}
```

```json
{
  "session_id": "faaf63e1-39c6-4658-8e1d-289da588c2f2",
  "subject": {
    "type": "CLIENT",
    "id": "092240d1-d877-4d85-b24d-b7e8f0275bcd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOTIyNDBkMS1kODc3LTRkODUtYjI0ZC1iN2U4ZjAyNzViY2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1ODQyLCJpYXQiOjE3OTMzNjQ5NDIsImp0aSI6IjY0NTNmZWM3LWNkYWMtNGU3My1hNWJjLWQ2YTdhMGQ1MmNhYSIsInNpZCI6ImZhYWY2M2UxLTM5YzYtNDY1OC04ZTFkLTI4OWRhNTg4YzJmMiJ9.6SQ03rY0VeludgCJei7vCdFxXJRx36-haQdwj8Ofdwg",
  "access_expires_at": "2026-10-30T13:10:42.242101402Z",
  "refresh_token": "5C2tPV14u467AArX31_zYeP24s-01rybDTvDt_DvOIU",
  "refresh_expires_at": "2026-11-29T12:55:42.241498443Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6302ef13-f3e6-45e7-bcdc-6f5d2870d01d",
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
  "id": "8b23a813-b848-4547-bc8a-12fc1ead7550",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:00:42.472094Z",
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
  "command_id": "adfe31ba-8514-4544-a7c0-199ac86e1449",
  "quote_id": "8b23a813-b848-4547-bc8a-12fc1ead7550",
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
  "id": "a1d7582a-3516-40ee-a92f-a6dc3bba0d4e",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "092240d1-d877-4d85-b24d-b7e8f0275bcd",
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
  "created_at": "2026-10-30T12:55:42.705613Z",
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
    "id": "0193f9ed-21b3-4e97-b4f1-64c011ea55dd",
    "order_id": "a1d7582a-3516-40ee-a92f-a6dc3bba0d4e",
    "expires_at": "2026-10-30T12:55:57.707783Z",
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

`POST /api/driver/v1/offers/0193f9ed-21b3-4e97-b4f1-64c011ea55dd/accept` → **200**

```json
{
  "command_id": "630c4bff-eaec-47f1-9725-e86d9d62f018"
}
```

```json
{
  "id": "3a8d9a6c-bf90-4e40-b7e0-f02bfc41dc27",
  "order_id": "a1d7582a-3516-40ee-a92f-a6dc3bba0d4e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5e2430f2-cae6-4835-b165-01c03b2cee84",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5e2430f2-cae6-4835-b165-01c03b2cee84",
  "order_id": "a1d7582a-3516-40ee-a92f-a6dc3bba0d4e",
  "assignment_id": "3a8d9a6c-bf90-4e40-b7e0-f02bfc41dc27",
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

`POST /api/driver/v1/work-sessions/b7994168-cae9-4d0f-a8eb-686b7826fa4e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:55:43Z",
    "sequence": 1793364943628
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b7994168-cae9-4d0f-a8eb-686b7826fa4e",
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
  "last_heartbeat_at": "2026-10-30T12:55:43.643969Z",
  "last_location_at": "2026-10-30T12:55:43.643969Z",
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
  "id": "5e2430f2-cae6-4835-b165-01c03b2cee84",
  "order_id": "a1d7582a-3516-40ee-a92f-a6dc3bba0d4e",
  "assignment_id": "3a8d9a6c-bf90-4e40-b7e0-f02bfc41dc27",
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

`POST /api/driver/v1/trips/5e2430f2-cae6-4835-b165-01c03b2cee84/arrive` → **200**

```json
{
  "command_id": "d00ddf1c-d76d-4bd9-a89b-c57d1a03f29e",
  "expected_version": 0
}
```

```json
{
  "id": "5e2430f2-cae6-4835-b165-01c03b2cee84",
  "order_id": "a1d7582a-3516-40ee-a92f-a6dc3bba0d4e",
  "assignment_id": "3a8d9a6c-bf90-4e40-b7e0-f02bfc41dc27",
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
  "arrived_at": "2026-10-30T12:55:44.090161Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5e2430f2-cae6-4835-b165-01c03b2cee84/start` → **200**

```json
{
  "command_id": "c9a71d66-233d-45f0-bc46-927b6ba7d957",
  "expected_version": 1
}
```

```json
{
  "id": "5e2430f2-cae6-4835-b165-01c03b2cee84",
  "order_id": "a1d7582a-3516-40ee-a92f-a6dc3bba0d4e",
  "assignment_id": "3a8d9a6c-bf90-4e40-b7e0-f02bfc41dc27",
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
  "arrived_at": "2026-10-30T12:55:44.090161Z",
  "started_at": "2026-10-30T12:55:44.320138Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/b7994168-cae9-4d0f-a8eb-686b7826fa4e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:56:32Z",
    "sequence": 1793364992565
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b7994168-cae9-4d0f-a8eb-686b7826fa4e",
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
  "last_heartbeat_at": "2026-10-30T12:56:32.580293Z",
  "last_location_at": "2026-10-30T12:56:32.580293Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/5e2430f2-cae6-4835-b165-01c03b2cee84/complete` → **200**

```json
{
  "command_id": "9bd3e0c1-a175-423d-9952-ec29b10b81b1",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:56:32Z",
  "cash_received": true
}
```

```json
{
  "id": "5e2430f2-cae6-4835-b165-01c03b2cee84",
  "order_id": "a1d7582a-3516-40ee-a92f-a6dc3bba0d4e",
  "assignment_id": "3a8d9a6c-bf90-4e40-b7e0-f02bfc41dc27",
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
  "arrived_at": "2026-10-30T12:55:44.090161Z",
  "started_at": "2026-10-30T12:55:44.320138Z",
  "completed_at": "2026-10-30T12:56:32.807284Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/a1d7582a-3516-40ee-a92f-a6dc3bba0d4e/rating` → **200**

```json
{
  "command_id": "b86daba4-e674-4209-8186-85ea219d7948",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "a1d7582a-3516-40ee-a92f-a6dc3bba0d4e",
  "score": 5,
  "created_at": "2026-10-30T12:56:33.049833439Z"
}
```

`POST /api/driver/v1/orders/a1d7582a-3516-40ee-a92f-a6dc3bba0d4e/rating` → **200**

```json
{
  "command_id": "79ea86ea-d6b8-420a-958e-1ab96cafb4d5",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "a1d7582a-3516-40ee-a92f-a6dc3bba0d4e",
  "score": 4,
  "created_at": "2026-10-30T12:56:33.282331167Z"
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
  "session_id": "c8cc0c9a-6c17-4773-a480-0cb9fb01a73f",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU4OTMsImlhdCI6MTc5MzM2NDk5MywianRpIjoiOWYzNzRiNGEtMGNlMi00MWIyLTlmYmItYzFiZmZiZTcyNDY0Iiwic2lkIjoiYzhjYzBjOWEtNmMxNy00NzczLWE0ODAtMGNiOWZiMDFhNzNmIn0.4RQffPqKTue8ll-ipgDgpAyDQQGyMdtm5oKpHN1h86U",
  "access_expires_at": "2026-10-30T13:11:33.983836883Z",
  "refresh_token": "2_EFFRXPiRVNLZK9U4IQBv0Zizk4ehPDGqYMhT7LNC0",
  "refresh_expires_at": "2026-10-31T00:56:33.983362853Z",
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
  "session_id": "311481a7-6971-4a8d-a216-be8148f0c9ae",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU4OTQsImlhdCI6MTc5MzM2NDk5NCwianRpIjoiYjVmNzhjZGYtMzcyZS00ODQ2LTllOTItYmM4YTI4YTJiZjU0Iiwic2lkIjoiMzExNDgxYTctNjk3MS00YThkLWEyMTYtYmU4MTQ4ZjBjOWFlIn0.8k6OUT702dkleoMcq9044U03wxM5QweJrlKOtZXoB0c",
  "access_expires_at": "2026-10-30T13:11:34.45861716Z",
  "refresh_token": "lDfzjxG6e-_U8yEdZYk8h5dhIfVOqArIGLlEqiYcQJg",
  "refresh_expires_at": "2026-10-31T00:56:34.458209028Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a1d7582a-3516-40ee-a92f-a6dc3bba0d4e/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "a1d7582a-3516-40ee-a92f-a6dc3bba0d4e",
      "author_type": "RIDER",
      "author_id": "092240d1-d877-4d85-b24d-b7e8f0275bcd",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T12:56:33.049833Z"
    },
    {
      "order_id": "a1d7582a-3516-40ee-a92f-a6dc3bba0d4e",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "092240d1-d877-4d85-b24d-b7e8f0275bcd",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T12:56:33.282331Z"
    }
  ]
}
```

Done: ratings for order a1d7582a-3516-40ee-a92f-a6dc3bba0d4e.

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
  "session_id": "3802de13-0ca9-41b1-9ff1-8f936242866e",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU4OTUsImlhdCI6MTc5MzM2NDk5NSwianRpIjoiYWVlYmVmMDEtYjdmYS00MTk1LWI3NDEtZDRiNTM2Nzg5ZjE1Iiwic2lkIjoiMzgwMmRlMTMtMGNhOS00MWIxLTlmZjEtOGY5MzYyNDI4NjZlIn0.grM4AM_PFFmK_1WYsCUoSWR0Q91SN-21ZL7YXUdh48A",
  "access_expires_at": "2026-10-30T13:11:35.173102182Z",
  "refresh_token": "VO28Jom8BGOhqWD4Air8CKH4u1LVhzViOvszJ51IMiE",
  "refresh_expires_at": "2026-10-31T00:56:35.172700389Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "5b8b1438-5e21-4829-9edd-630cf2b1fac4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "c4268e1a-7d5a-437a-8f23-2be30180a9df",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:56:35.405739Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c4268e1a-7d5a-437a-8f23-2be30180a9df` → **200**

```json
{
  "id": "c4268e1a-7d5a-437a-8f23-2be30180a9df",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:56:35.405739Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c4268e1a-7d5a-437a-8f23-2be30180a9df` → **200**

```json
{
  "id": "c4268e1a-7d5a-437a-8f23-2be30180a9df",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:56:35.405739Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c4268e1a-7d5a-437a-8f23-2be30180a9df` → **200**

```json
{
  "id": "c4268e1a-7d5a-437a-8f23-2be30180a9df",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:56:35.405739Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c4268e1a-7d5a-437a-8f23-2be30180a9df` → **200**

```json
{
  "id": "c4268e1a-7d5a-437a-8f23-2be30180a9df",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:56:35.405739Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c4268e1a-7d5a-437a-8f23-2be30180a9df` → **200**

```json
{
  "id": "c4268e1a-7d5a-437a-8f23-2be30180a9df",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T12:56:35.405739Z",
  "ready_at": "2026-10-30T12:56:39.820336Z",
  "expires_at": "2026-10-31T12:56:39.820336Z"
}
```

`GET /api/admin/v1/reports/exports/c4268e1a-7d5a-437a-8f23-2be30180a9df/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "04130754-4a38-45f7-abbf-3c8769e558b7",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "f661f8d4-f753-4d15-aa20-970ab3d90a2a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:56:40.777626Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f661f8d4-f753-4d15-aa20-970ab3d90a2a` → **200**

```json
{
  "id": "f661f8d4-f753-4d15-aa20-970ab3d90a2a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:56:40.777626Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f661f8d4-f753-4d15-aa20-970ab3d90a2a` → **200**

```json
{
  "id": "f661f8d4-f753-4d15-aa20-970ab3d90a2a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:56:40.777626Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f661f8d4-f753-4d15-aa20-970ab3d90a2a` → **200**

```json
{
  "id": "f661f8d4-f753-4d15-aa20-970ab3d90a2a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:56:40.777626Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f661f8d4-f753-4d15-aa20-970ab3d90a2a` → **200**

```json
{
  "id": "f661f8d4-f753-4d15-aa20-970ab3d90a2a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:56:40.777626Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f661f8d4-f753-4d15-aa20-970ab3d90a2a` → **200**

```json
{
  "id": "f661f8d4-f753-4d15-aa20-970ab3d90a2a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T12:56:40.777626Z",
  "ready_at": "2026-10-30T12:56:44.827609Z",
  "expires_at": "2026-10-31T12:56:44.827609Z"
}
```

`GET /api/admin/v1/reports/exports/f661f8d4-f753-4d15-aa20-970ab3d90a2a/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/a75f1a41-6ae0-47cd-9333-33338eb6e5ad` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/a75f1a41-6ae0-47cd-9333-33338eb6e5ad",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2f5a3539-2aba-4d9f-8681-ae3bf99f5906"
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
  "session_id": "b16f1a6b-dd48-4f19-a938-d05be9b5c95a",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU5MDYsImlhdCI6MTc5MzM2NTAwNiwianRpIjoiZjM3MGNlNTItOThlNC00YTExLWExOGMtOTY3ZGFhNTRmNjYzIiwic2lkIjoiYjE2ZjFhNmItZGQ0OC00ZjE5LWE5MzgtZDA1YmU5YjVjOTVhIn0.l1xxLBrW2f-WqcvNaQfS22A_aQQWG2wqjnd9FRQl__8",
  "access_expires_at": "2026-10-30T13:11:46.626816934Z",
  "refresh_token": "aMZ_wnew6UctMUxFdwkTzlsox3N8ERh1SWpEG1SZWLM",
  "refresh_expires_at": "2026-10-31T00:56:46.626385628Z",
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
  "command_id": "cbf52883-22a5-40cb-83e9-a7dc06659b8b",
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
  "changed_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T12:56:47.088487107Z"
}
```

`POST /sandbox/v1/retention/fixtures/8374640f-399e-45d6-ac68-af420095a46e` → **200**

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

`GET /sandbox/v1/retention/fixtures/8374640f-399e-45d6-ac68-af420095a46e` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/8374640f-399e-45d6-ac68-af420095a46e` → **204**

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
  "changed_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T12:56:47.088487Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "f6e84f70-1238-439c-aae1-ae96af07d50c",
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
  "changed_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T12:56:47.633274609Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-30599"
}
```

```json
{
  "challenge_id": "96af882b-da7e-4313-b7e7-86e0e062f67e",
  "expires_at": "2026-10-30T13:01:47.8619432Z",
  "resend_available_at": "2026-10-30T12:56:48.8619432Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "130011",
  "sent_at": "2026-10-30T12:56:47.864753275Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "96af882b-da7e-4313-b7e7-86e0e062f67e",
  "code": "130011",
  "device_ref": "sandbox-30599"
}
```

```json
{
  "session_id": "d59c5cac-754b-4c6a-a32f-14820dfb586f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTkwOCwiaWF0IjoxNzkzMzY1MDA4LCJqdGkiOiIyM2U4ZjIyNy0yMjljLTQwNjQtODc3Yi1kNjZlOTQ3ZjMyNGYiLCJzaWQiOiJkNTljNWNhYy03NTRiLTRjNmEtYTMyZi0xNDgyMGRmYjU4NmYifQ.nKt8crQ1MM06mIhg13hD_CrWhAaF00IP8Aj33ECxV5M",
  "access_expires_at": "2026-10-30T13:11:48.102488349Z",
  "refresh_token": "o74NAav6IHZNTGY-QCTtGjXJLxhSOHlOi9IRiqPZ9SU",
  "refresh_expires_at": "2026-11-29T12:56:48.102084954Z",
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
  "command_id": "3c8fb7b7-fb71-4bd4-8762-40997cb02af7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:56:48Z",
    "sequence": 1793365008777
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f17c95c7-e084-4746-a4e3-d1133b2780ab",
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
  "last_heartbeat_at": "2026-10-30T12:56:48.792487Z",
  "last_location_at": "2026-10-30T12:56:48.792487Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "32dbd2a0-9cf5-48bc-8228-fc2f82be0b43",
  "points": [
    {
      "sequence": 1793365011146,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T12:55:51Z"
    },
    {
      "sequence": 1793365011212,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T12:56:51Z"
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
  "session_id": "f073cec3-4d82-4ff4-a273-606fa7883a3e",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU5MTEsImlhdCI6MTc5MzM2NTAxMSwianRpIjoiNzYyZjBlY2MtNWY4My00NTY3LTkzZmEtMDhmOTViMmIxZjFlIiwic2lkIjoiZjA3M2NlYzMtNGQ4Mi00ZmY0LWEyNzMtNjA2ZmE3ODgzYTNlIn0.QPrDpEAyYt2jkpl5kzgaecWvqp792yRcLaYl4Y5USes",
  "access_expires_at": "2026-10-30T13:11:51.540128587Z",
  "refresh_token": "kWrtppUORYSM46HVhLgHTs8aGmkq-MaTZncWQsNhk0k",
  "refresh_expires_at": "2026-10-31T00:56:51.539658623Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "0a48c58d-8d44-4c94-a64e-fa9bbd1050b0",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T12:56:51Z",
        "track_point_id": "8580569c-5858-4743-b8f6-3f2a19b879e4",
        "work_session_id": "f17c95c7-e084-4746-a4e3-d1133b2780ab"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T12:56:51Z",
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

`POST /api/admin/v1/driver-risk-flags/0a48c58d-8d44-4c94-a64e-fa9bbd1050b0/confirm` → **200**

```json
{
  "command_id": "4656b033-dc90-4f8d-a7df-ce988ac98b50",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "0a48c58d-8d44-4c94-a64e-fa9bbd1050b0",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T12:56:51Z",
    "track_point_id": "8580569c-5858-4743-b8f6-3f2a19b879e4",
    "work_session_id": "f17c95c7-e084-4746-a4e3-d1133b2780ab"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T12:56:51Z",
  "reason": null,
  "reviewed_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "reviewed_at": "2026-10-30T12:56:52.256248Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/0a48c58d-8d44-4c94-a64e-fa9bbd1050b0/dismiss` → **409**

```json
{
  "command_id": "2e4ebf59-2cd1-4de8-b3d2-40ba36baac33",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/0a48c58d-8d44-4c94-a64e-fa9bbd1050b0/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e6283a66-81bf-459e-bdd9-739c3a8f0d03"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "b7fe22a6-9e7f-4650-a7ca-f7bcaacee967",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "80acee54-8250-4a1e-b7f6-7f8075b968ce",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "raised_at": "2026-10-30T12:56:52.731058Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/80acee54-8250-4a1e-b7f6-7f8075b968ce/dismiss` → **200**

```json
{
  "command_id": "ed388621-fe18-45a0-aa90-c3adb93536eb",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "80acee54-8250-4a1e-b7f6-7f8075b968ce",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "raised_at": "2026-10-30T12:56:52.731058Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "reviewed_at": "2026-10-30T12:56:52.964771Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "86d3d060-4a75-44cf-874b-3e12405d0bb8",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "0a48c58d-8d44-4c94-a64e-fa9bbd1050b0"
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
      "actor_id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T12:56:53.209274Z"
    }
  ],
  "duplicates": []
}
```

Done: flag 0a48c58d-8d44-4c94-a64e-fa9bbd1050b0 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "a8689d4d-24b4-4d2d-b312-f87854483f98",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU5MTMsImlhdCI6MTc5MzM2NTAxMywianRpIjoiMjQwMzA1OGQtNzJlMC00ZThhLWFjMzUtZmE1MjJlNTYyZDdiIiwic2lkIjoiYTg2ODlkNGQtMjRiNC00ZDJkLWIzMTItZjg3ODU0NDgzZjk4In0.AMXQkcaVlD02syVKiG43deg-D6CIW322jnysdFS2rWA",
  "access_expires_at": "2026-10-30T13:11:53.92753747Z",
  "refresh_token": "v0ZUpII0WUYC8bj5ojAJ19nt3I92o5bj6vGW7r3yJAE",
  "refresh_expires_at": "2026-10-31T00:56:53.927096789Z",
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
      "actor_id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T12:56:53.209274Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "a6825b45-fb49-4fe6-bf5d-1144181db6c8",
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
  "session_id": "f17c95c7-e084-4746-a4e3-d1133b2780ab",
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
  "last_heartbeat_at": "2026-10-30T12:56:48.792487Z",
  "last_location_at": "2026-10-30T12:56:48.792487Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f17c95c7-e084-4746-a4e3-d1133b2780ab/close` → **200**

```json
{
  "command_id": "9b9b733b-d3bd-426b-93a3-2f69b5bc6408",
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
  "session_id": "ca03ceff-ead0-4d96-97c4-2dbbaa489e01",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU5MTUsImlhdCI6MTc5MzM2NTAxNSwianRpIjoiYzNmNTliMjYtZjk1OS00ZmZiLWI4YTYtYzIyMTRkMzRkZWFkIiwic2lkIjoiY2EwM2NlZmYtZWFkMC00ZDk2LTk3YzQtMmRiYmFhNDg5ZTAxIn0.N0CVP0izxt-TihLLgMIZWpwQqczIb6nnbPBNTZPU1zU",
  "access_expires_at": "2026-10-30T13:11:55.332060842Z",
  "refresh_token": "dk4khHWLZWpYWY25K0N7dGIfNLawkPgAsdYLd4PRPBg",
  "refresh_expires_at": "2026-10-31T00:56:55.331654062Z",
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
  "command_id": "d118a07e-2d6c-426c-b6a0-93172b4c3879",
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
  "changed_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T12:56:55.788023Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "d118a07e-2d6c-426c-b6a0-93172b4c3879",
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
  "changed_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T12:56:55.788023Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48971561604",
  "device_ref": "sandbox-8576"
}
```

```json
{
  "challenge_id": "953c7852-c8b5-4216-a31f-df4584a53cf5",
  "expires_at": "2026-10-30T13:01:56.254241852Z",
  "resend_available_at": "2026-10-30T12:56:57.254241852Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48971561604` → **200**

```json
{
  "phone": "+48971561604",
  "audience": "CLIENT",
  "code": "852626",
  "sent_at": "2026-10-30T12:56:56.256273068Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "953c7852-c8b5-4216-a31f-df4584a53cf5",
  "code": "852626",
  "device_ref": "sandbox-8576"
}
```

```json
{
  "session_id": "8177c61e-9e38-47c5-90dc-a6532bcc4f6b",
  "subject": {
    "type": "CLIENT",
    "id": "c3a495fb-900f-4c3f-aba5-322f8fe962a6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjM2E0OTVmYi05MDBmLTRjM2YtYWJhNS0zMjJmOGZlOTYyYTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1OTE2LCJpYXQiOjE3OTMzNjUwMTYsImp0aSI6ImI1MjZkNjUzLWU5ZmMtNGExOC04Y2I1LTY0ZTdkZDkzMmYyMiIsInNpZCI6IjgxNzdjNjFlLTllMzgtNDdjNS05MGRjLWE2NTMyYmNjNGY2YiJ9.1-hwz9tPFejzn_rrNQTQGSP6di9yIcqDzm-UdHHSugc",
  "access_expires_at": "2026-10-30T13:11:56.496584388Z",
  "refresh_token": "5j3A3haZur94zGT_5e6XKpZp7qxdz7GMnhZb2PthYqs",
  "refresh_expires_at": "2026-11-29T12:56:56.496210116Z",
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
  "correlation_id": "78eceb07-5e86-4b5d-a1a0-6dee9f8779dd"
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
  "device_ref": "sandbox-26538"
}
```

```json
{
  "challenge_id": "ef8e7340-1ef7-41be-82ea-ceeae1220c2f",
  "expires_at": "2026-10-30T13:01:57.159131128Z",
  "resend_available_at": "2026-10-30T12:56:58.159131128Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "179415",
  "sent_at": "2026-10-30T12:56:57.162365079Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ef8e7340-1ef7-41be-82ea-ceeae1220c2f",
  "code": "179415",
  "device_ref": "sandbox-26538"
}
```

```json
{
  "session_id": "5c0dd8af-3050-4b47-9d3b-27d78fa294e7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTkxNywiaWF0IjoxNzkzMzY1MDE3LCJqdGkiOiJmMDBlZjdhNS05YTg1LTRhN2ItYThjZC05MWZiOGU1ZjM3MmMiLCJzaWQiOiI1YzBkZDhhZi0zMDUwLTRiNDctOWQzYi0yN2Q3OGZhMjk0ZTcifQ.dhMxeiY0krnp9xi75rs5yhR6yFkQrR59a8Khxdn7irM",
  "access_expires_at": "2026-10-30T13:11:57.413955605Z",
  "refresh_token": "P_xU67LC_D4RPw0_aguSttT9wdoa4P4JGFvC6CnQHc0",
  "refresh_expires_at": "2026-11-29T12:56:57.413566902Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "efe5e7cc-8bac-4dba-aeab-61bf02691712",
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
  "last_heartbeat_at": "2026-10-30T12:55:38.747997Z",
  "last_location_at": "2026-10-30T12:55:38.747997Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/efe5e7cc-8bac-4dba-aeab-61bf02691712/handover` → **200**

```json
{
  "command_id": "6375828d-a058-4716-8b19-5652b4d38f73",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "efe5e7cc-8bac-4dba-aeab-61bf02691712",
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
  "last_heartbeat_at": "2026-10-30T12:55:38.747997Z",
  "last_location_at": "2026-10-30T12:55:38.747997Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/efe5e7cc-8bac-4dba-aeab-61bf02691712/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:56:58Z",
    "sequence": 1793365018943
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "efe5e7cc-8bac-4dba-aeab-61bf02691712",
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
  "last_heartbeat_at": "2026-10-30T12:56:58.109536Z",
  "last_location_at": "2026-10-30T12:56:58.109536Z",
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
  "session_id": "efe5e7cc-8bac-4dba-aeab-61bf02691712",
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
  "last_heartbeat_at": "2026-10-30T12:56:58.109536Z",
  "last_location_at": "2026-10-30T12:56:58.109536Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/efe5e7cc-8bac-4dba-aeab-61bf02691712/close` → **200**

```json
{
  "command_id": "b2e06ca4-83e4-42f6-93c2-781b475e1daa",
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
  "correlation_id": "7282799c-b12e-44b3-ae82-80bd50e554b8"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671843675",
  "device_ref": "sandbox-8212"
}
```

```json
{
  "challenge_id": "5d8ec776-73e8-416e-99b3-298ce9b63117",
  "expires_at": "2026-10-30T13:01:59.238977653Z",
  "resend_available_at": "2026-10-30T12:57:00.238977653Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671843675` → **200**

```json
{
  "phone": "+380671843675",
  "audience": "CLIENT",
  "code": "175645",
  "sent_at": "2026-10-30T12:56:59.240994358Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d8ec776-73e8-416e-99b3-298ce9b63117",
  "code": "175645",
  "device_ref": "sandbox-8212"
}
```

```json
{
  "session_id": "8da28b08-28c7-47da-93a2-3d88ba769808",
  "subject": {
    "type": "CLIENT",
    "id": "1fd3eda4-f412-44ca-afd9-b0c8e1eb59f8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQzZWRhNC1mNDEyLTQ0Y2EtYWZkOS1iMGM4ZTFlYjU5ZjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1OTE5LCJpYXQiOjE3OTMzNjUwMTksImp0aSI6Ijg0ZDZkNTYzLTIxNDYtNDE4OS1hMGZhLWI1MjkyYmZmYjFkNyIsInNpZCI6IjhkYTI4YjA4LTI4YzctNDdkYS05M2EyLTNkODhiYTc2OTgwOCJ9.uxYlV81ZhR1tzFd2flnjmxXI3KBoM9NS8gC6tus96k8",
  "access_expires_at": "2026-10-30T13:11:59.484309257Z",
  "refresh_token": "vKM_-GbZpLVw0ezf5XeXnGPCHSLLVPb4NU7JCWaMVAU",
  "refresh_expires_at": "2026-11-29T12:56:59.483914054Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "73333166-b7fa-41ca-9c9c-8cdf1f721962",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "03450b79-ebbd-4df1-8afe-2a9872d52543",
  "upload_path": "/api/rider/v1/uploads/03450b79-ebbd-4df1-8afe-2a9872d52543",
  "expires_at": "2026-10-30T13:11:59.71960642Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/03450b79-ebbd-4df1-8afe-2a9872d52543` → **200**

```json
{
  "file_id": "03450b79-ebbd-4df1-8afe-2a9872d52543",
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
  "command_id": "59e94ff9-92c6-4169-a82a-340f9bba10cd",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "2b1818f9-6abd-4c41-8460-93ea9435965b",
  "upload_path": "/api/rider/v1/uploads/2b1818f9-6abd-4c41-8460-93ea9435965b",
  "expires_at": "2026-10-30T13:11:59.972189812Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/2b1818f9-6abd-4c41-8460-93ea9435965b` → **200**

```json
{
  "file_id": "2b1818f9-6abd-4c41-8460-93ea9435965b",
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
  "command_id": "5ed50479-17de-4efc-ac4a-28282aeef8bd",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b85bc947-1a4d-4167-a3e2-3461c8052e76",
  "upload_path": "/api/rider/v1/uploads/b85bc947-1a4d-4167-a3e2-3461c8052e76",
  "expires_at": "2026-10-30T13:12:00.218774905Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/b85bc947-1a4d-4167-a3e2-3461c8052e76` → **200**

```json
{
  "file_id": "b85bc947-1a4d-4167-a3e2-3461c8052e76",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "3e54738b-a2d6-4882-99f9-b093851ccd8e",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "b85bc947-1a4d-4167-a3e2-3461c8052e76"
  ]
}
```

```json
{
  "id": "dcabbe0b-a592-49bb-bc3e-00c65ed6dbe8",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "1fd3eda4-f412-44ca-afd9-b0c8e1eb59f8",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T12:57:00.466044Z",
  "updated_at": "2026-10-30T12:57:00.466044Z",
  "respond_by": "2026-10-30T16:57:00.466044Z",
  "messages": [
    {
      "id": "2046a19d-9e76-478c-8dad-ff24df2161d3",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "1fd3eda4-f412-44ca-afd9-b0c8e1eb59f8",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T12:57:00.466955Z",
      "attachments": [
        {
          "file_id": "b85bc947-1a4d-4167-a3e2-3461c8052e76",
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
  "session_id": "6144e341-76b4-4fcf-ad33-351b522b5f8d",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU5MjAsImlhdCI6MTc5MzM2NTAyMCwianRpIjoiZjQ3YzA5MzMtYjU0Mi00YjIxLTg4NjctNWM2NDc4NDg2MmJkIiwic2lkIjoiNjE0NGUzNDEtNzZiNC00ZmNmLWFkMzMtMzUxYjUyMmI1ZjhkIn0.-yhn3Llffmu2iS50EiUUm257zcKKGFbe1kASHTA8IqE",
  "access_expires_at": "2026-10-30T13:12:00.994215544Z",
  "refresh_token": "x02lBh-5cyrnrfGtvZubD3A0jyEXJIg60A9EGWjgYJI",
  "refresh_expires_at": "2026-10-31T00:57:00.993761334Z",
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
  "session_id": "291f6228-1ab1-452d-9e36-7345a12d32c3",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU5MjEsImlhdCI6MTc5MzM2NTAyMSwianRpIjoiMjIzN2Q4MWMtZTM5OS00YzYyLTljNjktOWNmZGYyYWVjMTRlIiwic2lkIjoiMjkxZjYyMjgtMWFiMS00NTJkLTllMzYtNzM0NWExMmQzMmMzIn0.YVrkbMO6VnzJy2hfpcl46st613ev7AVCMiV3O36EbSs",
  "access_expires_at": "2026-10-30T13:12:01.470245387Z",
  "refresh_token": "ON6YQGAqE_QNI3cnZ22cIFq81IBBTBad8liqFA-bPM0",
  "refresh_expires_at": "2026-10-31T00:57:01.469806259Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/dcabbe0b-a592-49bb-bc3e-00c65ed6dbe8/attachments/b85bc947-1a4d-4167-a3e2-3461c8052e76` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "d2f55604-b655-41ff-a93b-bbba50ff06af",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "dc9650e6-1b65-4f5d-a14d-96646f5717aa",
  "upload_path": "/api/operator/v1/uploads/dc9650e6-1b65-4f5d-a14d-96646f5717aa",
  "expires_at": "2026-10-30T13:12:01.710815487Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/dc9650e6-1b65-4f5d-a14d-96646f5717aa` → **200**

```json
{
  "file_id": "dc9650e6-1b65-4f5d-a14d-96646f5717aa",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/dcabbe0b-a592-49bb-bc3e-00c65ed6dbe8` → **200**

```json
{
  "id": "dcabbe0b-a592-49bb-bc3e-00c65ed6dbe8",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "1fd3eda4-f412-44ca-afd9-b0c8e1eb59f8",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T12:57:00.466044Z",
  "updated_at": "2026-10-30T12:57:00.466044Z",
  "respond_by": "2026-10-30T16:57:00.466044Z",
  "messages": [
    {
      "id": "2046a19d-9e76-478c-8dad-ff24df2161d3",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "1fd3eda4-f412-44ca-afd9-b0c8e1eb59f8",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T12:57:00.466955Z",
      "attachments": [
        {
          "file_id": "b85bc947-1a4d-4167-a3e2-3461c8052e76",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/dcabbe0b-a592-49bb-bc3e-00c65ed6dbe8/comments` → **200**

```json
{
  "command_id": "46f68f01-649f-4486-a8d8-b99ea7072148",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "dc9650e6-1b65-4f5d-a14d-96646f5717aa"
  ]
}
```

```json
{
  "id": "dcabbe0b-a592-49bb-bc3e-00c65ed6dbe8",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "1fd3eda4-f412-44ca-afd9-b0c8e1eb59f8",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T12:57:00.466044Z",
  "updated_at": "2026-10-30T12:57:02.187448Z",
  "respond_by": "2026-10-30T16:57:00.466044Z",
  "messages": [
    {
      "id": "2046a19d-9e76-478c-8dad-ff24df2161d3",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "1fd3eda4-f412-44ca-afd9-b0c8e1eb59f8",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T12:57:00.466955Z",
      "attachments": [
        {
          "file_id": "b85bc947-1a4d-4167-a3e2-3461c8052e76",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "79e059e1-f66e-453c-aa48-34cb5d139b4d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T12:57:02.187071Z",
      "attachments": [
        {
          "file_id": "dc9650e6-1b65-4f5d-a14d-96646f5717aa",
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

`GET /api/rider/v1/support/cases/dcabbe0b-a592-49bb-bc3e-00c65ed6dbe8` → **200**

```json
{
  "id": "dcabbe0b-a592-49bb-bc3e-00c65ed6dbe8",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "1fd3eda4-f412-44ca-afd9-b0c8e1eb59f8",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T12:57:00.466044Z",
  "updated_at": "2026-10-30T12:57:02.187448Z",
  "respond_by": "2026-10-30T16:57:00.466044Z",
  "messages": [
    {
      "id": "2046a19d-9e76-478c-8dad-ff24df2161d3",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "1fd3eda4-f412-44ca-afd9-b0c8e1eb59f8",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T12:57:00.466955Z",
      "attachments": [
        {
          "file_id": "b85bc947-1a4d-4167-a3e2-3461c8052e76",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "79e059e1-f66e-453c-aa48-34cb5d139b4d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T12:57:02.187071Z",
      "attachments": [
        {
          "file_id": "dc9650e6-1b65-4f5d-a14d-96646f5717aa",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/dcabbe0b-a592-49bb-bc3e-00c65ed6dbe8/attachments/dc9650e6-1b65-4f5d-a14d-96646f5717aa` → **200**

Done: support case dcabbe0b-a592-49bb-bc3e-00c65ed6dbe8, rider attachment b85bc947-1a4d-4167-a3e2-3461c8052e76, operator attachment dc9650e6-1b65-4f5d-a14d-96646f5717aa.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738189256",
  "device_ref": "sandbox-4782"
}
```

```json
{
  "challenge_id": "06de069f-362f-4d0f-b5a3-373c4e92b1fb",
  "expires_at": "2026-10-30T13:02:02.683070434Z",
  "resend_available_at": "2026-10-30T12:57:03.683070434Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738189256` → **200**

```json
{
  "phone": "+380738189256",
  "audience": "CLIENT",
  "code": "070114",
  "sent_at": "2026-10-30T12:57:02.6858678Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "06de069f-362f-4d0f-b5a3-373c4e92b1fb",
  "code": "070114",
  "device_ref": "sandbox-4782"
}
```

```json
{
  "session_id": "abb641b5-ff0d-4680-9ddf-cb30c79a5f04",
  "subject": {
    "type": "CLIENT",
    "id": "ae984c03-6cf1-4c2c-9590-31e7d1055761"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZTk4NGMwMy02Y2YxLTRjMmMtOTU5MC0zMWU3ZDEwNTU3NjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1OTIyLCJpYXQiOjE3OTMzNjUwMjIsImp0aSI6ImQ3ZDBkOWFkLWQ5YzktNGE0MS1hNzJkLWY1NWRjNGQzODE3MSIsInNpZCI6ImFiYjY0MWI1LWZmMGQtNDY4MC05ZGRmLWNiMzBjNzlhNWYwNCJ9.n5w39lmLv0QbXI9PXn9QK6Q1LmVI9DS7tdxmrqKhn9Y",
  "access_expires_at": "2026-10-30T13:12:02.927983831Z",
  "refresh_token": "VikV98f8ZHTTr4LuHcqPLo7K9T7HYfAKrtStJ2uTPzA",
  "refresh_expires_at": "2026-11-29T12:57:02.927564923Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "b9c1ec4c-c345-48e6-b820-86981765253d",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "6a8d8da4-f3a0-4f7b-812f-aca07bcb07b0",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-6a8d8da4-f3a0-4f7b-812f-aca07bcb07b0",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "f2c5fa22e14a3406aef1142b5077abd6",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=6a8d8da4-f3a0-4f7b-812f-aca07bcb07b0",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738189256"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=6a8d8da4-f3a0-4f7b-812f-aca07bcb07b0",
  "expires_at": "2026-10-30T13:27:03.152069Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/6a8d8da4-f3a0-4f7b-812f-aca07bcb07b0` → **200**

```json
{
  "id": "6a8d8da4-f3a0-4f7b-812f-aca07bcb07b0",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:27:03.152069Z",
  "card": {
    "id": "207a020d-4ac6-4a4a-8b1f-1e06551545de",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8647",
    "card_type": "Visa",
    "created_at": "2026-10-30T12:57:03.376968Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7bd64e9e-bec9-4efa-83ba-c77e8a00b7d8",
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
  "id": "16387200-0ada-4455-a245-d2e9e74e1320",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:02:03.617081Z",
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
  "command_id": "df832519-3dd2-41a4-8d96-78ec1fceb0c5",
  "quote_id": "16387200-0ada-4455-a245-d2e9e74e1320",
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
  "id": "db0553cd-2f2e-4968-8dd6-ad665ea87f39",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ae984c03-6cf1-4c2c-9590-31e7d1055761",
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
  "created_at": "2026-10-30T12:57:03.855654Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db0553cd-2f2e-4968-8dd6-ad665ea87f39` → **200**

```json
{
  "id": "db0553cd-2f2e-4968-8dd6-ad665ea87f39",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ae984c03-6cf1-4c2c-9590-31e7d1055761",
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
  "created_at": "2026-10-30T12:57:03.855654Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db0553cd-2f2e-4968-8dd6-ad665ea87f39` → **200**

```json
{
  "id": "db0553cd-2f2e-4968-8dd6-ad665ea87f39",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ae984c03-6cf1-4c2c-9590-31e7d1055761",
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
  "created_at": "2026-10-30T12:57:03.855654Z",
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

`GET /api/rider/v1/orders/db0553cd-2f2e-4968-8dd6-ad665ea87f39` → **200**

```json
{
  "id": "db0553cd-2f2e-4968-8dd6-ad665ea87f39",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ae984c03-6cf1-4c2c-9590-31e7d1055761",
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
  "created_at": "2026-10-30T12:57:03.855654Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/db0553cd-2f2e-4968-8dd6-ad665ea87f39/switch-to-cash` → **200**

```json
{
  "command_id": "3e552323-d600-4747-b42f-9e4ad73f77b8",
  "expected_version": 3
}
```

```json
{
  "id": "db0553cd-2f2e-4968-8dd6-ad665ea87f39",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "ae984c03-6cf1-4c2c-9590-31e7d1055761",
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
  "created_at": "2026-10-30T12:57:03.855654Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/db0553cd-2f2e-4968-8dd6-ad665ea87f39/switch-to-cash` → **409**

```json
{
  "command_id": "1f0d3fe2-0b19-4a26-b375-fe343ecb246f",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/db0553cd-2f2e-4968-8dd6-ad665ea87f39/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8fa44a7f-8d89-4026-8772-090cc2eeb34d"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/db0553cd-2f2e-4968-8dd6-ad665ea87f39` → **200**

```json
{
  "id": "db0553cd-2f2e-4968-8dd6-ad665ea87f39",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "ae984c03-6cf1-4c2c-9590-31e7d1055761",
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
  "created_at": "2026-10-30T12:57:03.855654Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/db0553cd-2f2e-4968-8dd6-ad665ea87f39/cancel` → **200**

```json
{
  "command_id": "a8745f2f-4ba0-48ad-b679-daa5caeb2615",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "db0553cd-2f2e-4968-8dd6-ad665ea87f39",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "ae984c03-6cf1-4c2c-9590-31e7d1055761",
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
  "created_at": "2026-10-30T12:57:03.855654Z",
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
  "session_id": "a0888f0a-b78a-4946-b751-ca790e93de0a",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU5MjcsImlhdCI6MTc5MzM2NTAyNywianRpIjoiNjQwZmE0YWQtMjkxNC00MmYyLWFjYjItYjg5NGU5ZGFlYmZkIiwic2lkIjoiYTA4ODhmMGEtYjc4YS00OTQ2LWI3NTEtY2E3OTBlOTNkZTBhIn0.DmwKKZRtEdFk0pGYnrdk3fUPTeUL7j4677F7vT-gQy0",
  "access_expires_at": "2026-10-30T13:12:07.008482925Z",
  "refresh_token": "xKUGAPQ0YRHrjDhekKbF_LZjWiJTE8kL3tkbhunzTZA",
  "refresh_expires_at": "2026-10-31T00:57:07.00805971Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-5868"
}
```

```json
{
  "challenge_id": "b67b6bc8-2a66-4d14-86a0-b7f7b9c6b328",
  "expires_at": "2026-10-30T13:02:07.225392096Z",
  "resend_available_at": "2026-10-30T12:57:08.225392096Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "233181",
  "sent_at": "2026-10-30T12:57:07.227285571Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b67b6bc8-2a66-4d14-86a0-b7f7b9c6b328",
  "code": "233181",
  "device_ref": "sandbox-5868"
}
```

```json
{
  "session_id": "bfff5868-a48c-4136-b0b2-250067e55203",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTkyNywiaWF0IjoxNzkzMzY1MDI3LCJqdGkiOiI1NDIyN2FmYy1jMDQ5LTQxMDQtYWExNC1kYWFlOTQ1N2NlNDMiLCJzaWQiOiJiZmZmNTg2OC1hNDhjLTQxMzYtYjBiMi0yNTAwNjdlNTUyMDMifQ.td62TnUxr18j9fFPeIh0ov9y3Lb3JW4zBRoAIsZxc8k",
  "access_expires_at": "2026-10-30T13:12:07.472817712Z",
  "refresh_token": "Zpq2vuZFxhhkgKdvON3_aflX2Mzwix_FmAB5NELlJW0",
  "refresh_expires_at": "2026-11-29T12:57:07.472414337Z",
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
      "actor_id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T12:56:53.209274Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T12:56:54.389569Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "6cfa101b-79b6-4d0d-9824-48ffc6cdfc39",
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
  "device_ref": "sandbox-30174"
}
```

```json
{
  "challenge_id": "bfd028c2-c53b-41d4-87b2-6dc2097779ce",
  "expires_at": "2026-10-30T13:02:08.367754826Z",
  "resend_available_at": "2026-10-30T12:57:09.367754826Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "316036",
  "sent_at": "2026-10-30T12:57:08.369896717Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bfd028c2-c53b-41d4-87b2-6dc2097779ce",
  "code": "316036",
  "device_ref": "sandbox-30174"
}
```

```json
{
  "session_id": "21e0801f-5401-4a5a-aff2-e0755e3c7a81",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTkyOCwiaWF0IjoxNzkzMzY1MDI4LCJqdGkiOiI5NGI4NzMwNC00MmI1LTQ3YWEtYTM2YS05ZDFkNWZiMzgwMTMiLCJzaWQiOiIyMWUwODAxZi01NDAxLTRhNWEtYWZmMi1lMDc1NWUzYzdhODEifQ.PHMSzqujRMoiX-Ug8W2T1EUKN3NRpqw62uUPSx8LgCw",
  "access_expires_at": "2026-10-30T13:12:08.6082199Z",
  "refresh_token": "iD-Sec-eRR4bdwRY7Euyq2hvvvEj-0afROJWirKJqZs",
  "refresh_expires_at": "2026-11-29T12:57:08.607773761Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b7994168-cae9-4d0f-a8eb-686b7826fa4e",
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
  "last_heartbeat_at": "2026-10-30T12:56:32.580293Z",
  "last_location_at": "2026-10-30T12:56:32.580293Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b7994168-cae9-4d0f-a8eb-686b7826fa4e/handover` → **200**

```json
{
  "command_id": "7c7013b9-0d49-40c4-b714-12ec0d28abfe",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b7994168-cae9-4d0f-a8eb-686b7826fa4e",
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
  "last_heartbeat_at": "2026-10-30T12:56:32.580293Z",
  "last_location_at": "2026-10-30T12:56:32.580293Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

(the car drives 12 s to the next point)

`POST /api/driver/v1/work-sessions/b7994168-cae9-4d0f-a8eb-686b7826fa4e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:57:21Z",
    "sequence": 1793365041301
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b7994168-cae9-4d0f-a8eb-686b7826fa4e",
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
  "last_heartbeat_at": "2026-10-30T12:57:21.316702Z",
  "last_location_at": "2026-10-30T12:57:21.316702Z",
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
  "command_id": "656e9a4c-def6-440c-ac23-fb3441e193c6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:57:21Z",
    "sequence": 1793365041775
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0b207df3-e23e-410b-80fd-49d588410fcb",
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
  "last_heartbeat_at": "2026-10-30T12:57:21.790317Z",
  "last_location_at": "2026-10-30T12:57:21.790317Z",
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
  "session_id": "63e93dc7-2be0-43e3-8f74-6c4a8d70e519",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU5NDIsImlhdCI6MTc5MzM2NTA0MiwianRpIjoiYWNmOTJkMDAtYWUzYy00ZGVjLWI3M2MtNDdmYjg3NzE2YzM1Iiwic2lkIjoiNjNlOTNkYzctMmJlMC00M2UzLThmNzQtNmM0YThkNzBlNTE5In0.6Zv2fDdZHEGjA69CJbBUgsuLOd_mVSl_llA0Lc8tdTc",
  "access_expires_at": "2026-10-30T13:12:22.281575384Z",
  "refresh_token": "X7bnOs1_wBT0WqJNyexLjzepFFNXVgPWZF06JyT2fow",
  "refresh_expires_at": "2026-10-31T00:57:22.281139882Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "aa437c46-2d52-4b89-8720-49bb05af23e9",
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
  "id": "5c35cced-165b-4adc-8148-802add137764",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:02:22.513331Z",
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
  "command_id": "a47916cf-8ac9-424f-b121-489adb205e4b",
  "quote_id": "5c35cced-165b-4adc-8148-802add137764",
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
  "id": "38f031b6-a6f0-48a0-9f74-d2d04b3d74a0",
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
  "created_at": "2026-10-30T12:57:22.744809Z",
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
    "id": "ef9c2486-835b-49bf-859b-37db14a5c953",
    "order_id": "38f031b6-a6f0-48a0-9f74-d2d04b3d74a0",
    "expires_at": "2026-10-30T12:57:37.748349Z",
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

`POST /api/driver/v1/offers/ef9c2486-835b-49bf-859b-37db14a5c953/accept` → **200**

```json
{
  "command_id": "d3452467-180f-47e1-bd32-6880a66fdb64"
}
```

```json
{
  "id": "ca1c733f-21ef-4766-a15e-f4c6a5b0888e",
  "order_id": "38f031b6-a6f0-48a0-9f74-d2d04b3d74a0",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8f7ac92b-05bd-4054-884e-99bc16b935d3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8f7ac92b-05bd-4054-884e-99bc16b935d3",
  "order_id": "38f031b6-a6f0-48a0-9f74-d2d04b3d74a0",
  "assignment_id": "ca1c733f-21ef-4766-a15e-f4c6a5b0888e",
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

`POST /api/driver/v1/work-sessions/0b207df3-e23e-410b-80fd-49d588410fcb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:57:33Z",
    "sequence": 1793365053905
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0b207df3-e23e-410b-80fd-49d588410fcb",
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
  "last_heartbeat_at": "2026-10-30T12:57:33.920328Z",
  "last_location_at": "2026-10-30T12:57:33.920328Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/8f7ac92b-05bd-4054-884e-99bc16b935d3/arrive` → **200**

```json
{
  "command_id": "d3de1f06-e162-4bca-9b56-ab7068efca69",
  "expected_version": 0
}
```

```json
{
  "id": "8f7ac92b-05bd-4054-884e-99bc16b935d3",
  "order_id": "38f031b6-a6f0-48a0-9f74-d2d04b3d74a0",
  "assignment_id": "ca1c733f-21ef-4766-a15e-f4c6a5b0888e",
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
  "arrived_at": "2026-10-30T12:57:34.152474Z",
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

`POST /api/driver/v1/trips/8f7ac92b-05bd-4054-884e-99bc16b935d3/start` → **200**

```json
{
  "command_id": "e702ebe1-496e-4a53-9018-4de39bac15e8",
  "expected_version": 1
}
```

```json
{
  "id": "8f7ac92b-05bd-4054-884e-99bc16b935d3",
  "order_id": "38f031b6-a6f0-48a0-9f74-d2d04b3d74a0",
  "assignment_id": "ca1c733f-21ef-4766-a15e-f4c6a5b0888e",
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
  "arrived_at": "2026-10-30T12:57:34.152474Z",
  "started_at": "2026-10-30T12:57:34.384299Z",
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

`POST /api/driver/v1/trips/8f7ac92b-05bd-4054-884e-99bc16b935d3/complete` → **200**

```json
{
  "command_id": "c07a243a-eaa9-4725-b5ed-3868928bae26",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:57:34Z",
  "cash_received": true
}
```

```json
{
  "id": "8f7ac92b-05bd-4054-884e-99bc16b935d3",
  "order_id": "38f031b6-a6f0-48a0-9f74-d2d04b3d74a0",
  "assignment_id": "ca1c733f-21ef-4766-a15e-f4c6a5b0888e",
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
  "arrived_at": "2026-10-30T12:57:34.152474Z",
  "started_at": "2026-10-30T12:57:34.384299Z",
  "completed_at": "2026-10-30T12:57:34.620895Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/38f031b6-a6f0-48a0-9f74-d2d04b3d74a0` → **200**

```json
{
  "id": "38f031b6-a6f0-48a0-9f74-d2d04b3d74a0",
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
    "id": "ca1c733f-21ef-4766-a15e-f4c6a5b0888e",
    "order_id": "38f031b6-a6f0-48a0-9f74-d2d04b3d74a0",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8f7ac92b-05bd-4054-884e-99bc16b935d3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:57:22.744809Z",
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
  "session_id": "b7994168-cae9-4d0f-a8eb-686b7826fa4e",
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
  "last_heartbeat_at": "2026-10-30T12:57:21.316702Z",
  "last_location_at": "2026-10-30T12:57:21.316702Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b7994168-cae9-4d0f-a8eb-686b7826fa4e/close` → **200**

```json
{
  "command_id": "d0d37bb9-9710-4518-b602-c48b741d45d9",
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
  "session_id": "0b207df3-e23e-410b-80fd-49d588410fcb",
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
  "last_heartbeat_at": "2026-10-30T12:57:33.920328Z",
  "last_location_at": "2026-10-30T12:57:33.920328Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0b207df3-e23e-410b-80fd-49d588410fcb/close` → **200**

```json
{
  "command_id": "3563fecd-790c-4f8b-916e-df3a72f225fb",
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

Done: terminal order 38f031b6-a6f0-48a0-9f74-d2d04b3d74a0 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-150"
}
```

```json
{
  "challenge_id": "a33f0212-70c0-4b3d-b0fc-f9c50d29fee1",
  "expires_at": "2026-10-30T13:02:39.214055637Z",
  "resend_available_at": "2026-10-30T12:57:40.214055637Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "065930",
  "sent_at": "2026-10-30T12:57:39.216293486Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a33f0212-70c0-4b3d-b0fc-f9c50d29fee1",
  "code": "065930",
  "device_ref": "sandbox-150"
}
```

```json
{
  "session_id": "96dcaece-b399-4e97-919d-d3c5db816297",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTk1OSwiaWF0IjoxNzkzMzY1MDU5LCJqdGkiOiI2YmQxZjRkYi0wODJiLTQwNGUtYTA2Yy0wZDhkZDY1ZjVmNmQiLCJzaWQiOiI5NmRjYWVjZS1iMzk5LTRlOTctOTE5ZC1kM2M1ZGI4MTYyOTcifQ.WALj7hV8hd_bgI3O_we-kn0Hs3a2axI6TA11DlzZSxQ",
  "access_expires_at": "2026-10-30T13:12:39.462389005Z",
  "refresh_token": "Ra9IC6FB-JiWQMvyIlzd-TPi1EvmARo8Ynzg_oGUfCM",
  "refresh_expires_at": "2026-11-29T12:57:39.461871452Z",
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
  "device_ref": "sandbox-634"
}
```

```json
{
  "challenge_id": "03b18c31-b840-4261-89e8-82f3aec842ff",
  "expires_at": "2026-10-30T13:02:39.896614364Z",
  "resend_available_at": "2026-10-30T12:57:40.896614364Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "244284",
  "sent_at": "2026-10-30T12:57:39.898595565Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "03b18c31-b840-4261-89e8-82f3aec842ff",
  "code": "244284",
  "device_ref": "sandbox-634"
}
```

```json
{
  "session_id": "a13b3840-991a-4511-b64c-dd6d44aafd8d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTk2MCwiaWF0IjoxNzkzMzY1MDYwLCJqdGkiOiJkMjgyOTQ3ZS02ZjEyLTRjOTAtYjk0MC1kOTQwNmJjZGNjOTQiLCJzaWQiOiJhMTNiMzg0MC05OTFhLTQ1MTEtYjY0Yy1kZDZkNDRhYWZkOGQifQ.MUJf8wqkT12j4M-AJPX_NqBggOaMpHulxiYRmAajHg0",
  "access_expires_at": "2026-10-30T13:12:40.141934249Z",
  "refresh_token": "1_Wc_WktGiNrIN7IO3VsR3ym59qK79Rg1aTi_c0G44I",
  "refresh_expires_at": "2026-11-29T12:57:40.141543123Z",
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
  "device_ref": "sandbox-13836"
}
```

```json
{
  "challenge_id": "fef3d90a-87fd-4703-93a5-badbb686f8be",
  "expires_at": "2026-10-30T13:02:40.573776374Z",
  "resend_available_at": "2026-10-30T12:57:41.573776374Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "385276",
  "sent_at": "2026-10-30T12:57:40.575530561Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fef3d90a-87fd-4703-93a5-badbb686f8be",
  "code": "385276",
  "device_ref": "sandbox-13836"
}
```

```json
{
  "session_id": "69cfefe5-adcd-45bc-b70d-41b0f4aa81e0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTk2MCwiaWF0IjoxNzkzMzY1MDYwLCJqdGkiOiJlNmRlNTMxOC03MGMwLTRhMDktYTg5ZC1lNTMzNzk5NjUyNTQiLCJzaWQiOiI2OWNmZWZlNS1hZGNkLTQ1YmMtYjcwZC00MWIwZjRhYTgxZTAifQ.nU-FKTGhBVYY0Kt1tmBEvLVrOCBwMKWg_IYb-jpCiAI",
  "access_expires_at": "2026-10-30T13:12:40.821003371Z",
  "refresh_token": "N1Jpe9uo7HdXCjBohDlqEzjndZgpz7D6sGIp2ZbwJ_k",
  "refresh_expires_at": "2026-11-29T12:57:40.820618864Z",
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
  "phone": "+380698038319",
  "device_ref": "sandbox-23124"
}
```

```json
{
  "challenge_id": "eb766a06-4838-4d26-be7f-2d2ef0a9ff00",
  "expires_at": "2026-10-30T13:02:41.261025257Z",
  "resend_available_at": "2026-10-30T12:57:42.261025257Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380698038319` → **200**

```json
{
  "phone": "+380698038319",
  "audience": "CLIENT",
  "code": "506548",
  "sent_at": "2026-10-30T12:57:41.262819873Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eb766a06-4838-4d26-be7f-2d2ef0a9ff00",
  "code": "506548",
  "device_ref": "sandbox-23124"
}
```

```json
{
  "session_id": "8ed6df35-393f-472a-b057-a998cee5cc9c",
  "subject": {
    "type": "CLIENT",
    "id": "0d5bdec2-6923-4873-9efd-932f2e363048"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZDViZGVjMi02OTIzLTQ4NzMtOWVmZC05MzJmMmUzNjMwNDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1OTYxLCJpYXQiOjE3OTMzNjUwNjEsImp0aSI6IjBjMzJhYTZkLWM0MWUtNDcxNC1hOTE0LTdiNzFkODE3OWEwNCIsInNpZCI6IjhlZDZkZjM1LTM5M2YtNDcyYS1iMDU3LWE5OThjZWU1Y2M5YyJ9.nOYgb4TXPZ2Tzihd6sbR32OsH43JWTRqCx26mGn0R04",
  "access_expires_at": "2026-10-30T13:12:41.503410916Z",
  "refresh_token": "KhHuW4MhHdh6qLL7GaVsc5JC-rkhSVMX78tPZtnmcx8",
  "refresh_expires_at": "2026-11-29T12:57:41.502981873Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "98bd7278-a23c-45ee-811f-140c6f2c5c2b",
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
  "id": "12144ef4-c712-41b3-957c-27e9e372b496",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:02:41.728660Z",
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
  "command_id": "695ab8d0-71eb-4093-8b18-3864bb0a775c",
  "quote_id": "12144ef4-c712-41b3-957c-27e9e372b496",
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
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:57:41.960009Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:57:41.960009Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 9.066141398
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 12.514900626
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 6.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.148270772
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

`GET /api/rider/v1/orders/e9954e22-374f-4285-95f8-d508c42f6f93` → **200**

```json
{
  "id": "e9954e22-374f-4285-95f8-d508c42f6f93",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0d5bdec2-6923-4873-9efd-932f2e363048",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:57:41.960009Z",
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
  "session_id": "ca04fd0e-9a3d-4eee-bfb1-42c6fbc4c30c",
  "subject": {
    "type": "STAFF",
    "id": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmFlZTVhOC0wNTUzLTRmZDktYjA4ZS1kOGY4MzZlNmVhNWYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYxNDYsImlhdCI6MTc5MzM2NTI0NiwianRpIjoiMGM5Y2FkMGQtM2VlOC00NTc0LWIzNzctMDczZjcwZGQwYTY1Iiwic2lkIjoiY2EwNGZkMGUtOWEzZC00ZWVlLWJmYjEtNDJjNmZiYzRjMzBjIn0.jn_s_jaJoXAL26KVECrVFRVRJsbxnoCI_LGA3un6Gmg",
  "access_expires_at": "2026-10-30T13:15:46.365293263Z",
  "refresh_token": "MwvlQsgX7nnh5MiNqWyYm1cHpI5e1G_hJTDn80nJFbY",
  "refresh_expires_at": "2026-10-31T01:00:46.364563491Z",
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
  "id": "3e198e9f-208a-4934-ae11-5bdc8da033bf",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:00:46.59849Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:00:46.598524Z",
  "updated_at": "2026-10-30T13:00:46.611409Z",
  "finished_at": "2026-10-30T13:00:46.611409Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/3e198e9f-208a-4934-ae11-5bdc8da033bf` → **200**

```json
{
  "run": {
    "id": "3e198e9f-208a-4934-ae11-5bdc8da033bf",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:00:46.59849Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:00:46.598524Z",
    "updated_at": "2026-10-30T13:00:46.611409Z",
    "finished_at": "2026-10-30T13:00:46.611409Z",
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
  "id": "3e198e9f-208a-4934-ae11-5bdc8da033bf",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:00:46.59849Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:00:46.598524Z",
  "updated_at": "2026-10-30T13:00:46.611409Z",
  "finished_at": "2026-10-30T13:00:46.611409Z",
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
  "id": "3e198e9f-208a-4934-ae11-5bdc8da033bf",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:00:46.59849Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:00:46.598524Z",
  "updated_at": "2026-10-30T13:00:46.611409Z",
  "finished_at": "2026-10-30T13:00:46.611409Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/4a0623ce-86fc-4269-ae5c-4d90147967a6` → **204**

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
  "id": "459c6d30-b64b-4c76-82ab-1292e139097b",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:00:46.956586Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:00:46.956619Z",
  "updated_at": "2026-10-30T13:00:46.962565Z",
  "finished_at": "2026-10-30T13:00:46.962565Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/459c6d30-b64b-4c76-82ab-1292e139097b` → **200**

```json
{
  "run": {
    "id": "459c6d30-b64b-4c76-82ab-1292e139097b",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:00:46.956586Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:00:46.956619Z",
    "updated_at": "2026-10-30T13:00:46.962565Z",
    "finished_at": "2026-10-30T13:00:46.962565Z",
    "version": 1
  },
  "items": [
    {
      "id": "ad0ebb71-a250-42fb-81ec-e884dfd1e928",
      "run_id": "459c6d30-b64b-4c76-82ab-1292e139097b",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "859ba6dd5bac62721578863c796299b64d3aa976465796f4bf75a6007adcbf75",
      "reference_display": "sandbox-reconciliation-4a0623ce-86fc-4269-ae5c-4d#####a6",
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
      "provider_at": "2026-10-30T13:00:46Z",
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
  "id": "459c6d30-b64b-4c76-82ab-1292e139097b",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:00:46.956586Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:00:46.956619Z",
  "updated_at": "2026-10-30T13:00:46.962565Z",
  "finished_at": "2026-10-30T13:00:46.962565Z",
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
  "id": "459c6d30-b64b-4c76-82ab-1292e139097b",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:00:46.956586Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:00:46.956619Z",
  "updated_at": "2026-10-30T13:00:46.962565Z",
  "finished_at": "2026-10-30T13:00:46.962565Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/ad0ebb71-a250-42fb-81ec-e884dfd1e928/resolve` → **200**

```json
{
  "command_id": "6dec2482-2658-4f48-8992-617beb3bbd43",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "ad0ebb71-a250-42fb-81ec-e884dfd1e928",
  "run_id": "459c6d30-b64b-4c76-82ab-1292e139097b",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "859ba6dd5bac62721578863c796299b64d3aa976465796f4bf75a6007adcbf75",
  "reference_display": "sandbox-reconciliation-4a0623ce-86fc-4269-ae5c-4d#####a6",
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
  "provider_at": "2026-10-30T13:00:46Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "resolved_at": "2026-10-30T13:00:47.299286Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/ad0ebb71-a250-42fb-81ec-e884dfd1e928/resolve` → **200**

```json
{
  "command_id": "6dec2482-2658-4f48-8992-617beb3bbd43",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "ad0ebb71-a250-42fb-81ec-e884dfd1e928",
  "run_id": "459c6d30-b64b-4c76-82ab-1292e139097b",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "859ba6dd5bac62721578863c796299b64d3aa976465796f4bf75a6007adcbf75",
  "reference_display": "sandbox-reconciliation-4a0623ce-86fc-4269-ae5c-4d#####a6",
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
  "provider_at": "2026-10-30T13:00:46Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
  "resolved_at": "2026-10-30T13:00:47.299286Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/ad0ebb71-a250-42fb-81ec-e884dfd1e928/resolve` → **409**

```json
{
  "command_id": "d0ada229-c38d-4846-86ef-1860ecf0554e",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/ad0ebb71-a250-42fb-81ec-e884dfd1e928/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5b6c0d40-2fac-42cc-94cf-4436e7a0670d"
}
```

`GET /api/admin/v1/payment-reconciliations/459c6d30-b64b-4c76-82ab-1292e139097b` → **200**

```json
{
  "run": {
    "id": "459c6d30-b64b-4c76-82ab-1292e139097b",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:00:46.956586Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:00:46.956619Z",
    "updated_at": "2026-10-30T13:00:47.299286Z",
    "finished_at": "2026-10-30T13:00:46.962565Z",
    "version": 2
  },
  "items": [
    {
      "id": "ad0ebb71-a250-42fb-81ec-e884dfd1e928",
      "run_id": "459c6d30-b64b-4c76-82ab-1292e139097b",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "859ba6dd5bac62721578863c796299b64d3aa976465796f4bf75a6007adcbf75",
      "reference_display": "sandbox-reconciliation-4a0623ce-86fc-4269-ae5c-4d#####a6",
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
      "provider_at": "2026-10-30T13:00:46Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "7baee5a8-0553-4fd9-b08e-d8f836e6ea5f",
      "resolved_at": "2026-10-30T13:00:47.299286Z",
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
      "id": "459c6d30-b64b-4c76-82ab-1292e139097b",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T13:00:46.956586Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T13:00:46.956619Z",
      "updated_at": "2026-10-30T13:00:47.299286Z",
      "finished_at": "2026-10-30T13:00:46.962565Z",
      "version": 2
    },
    {
      "id": "314fd125-b8ab-4050-a69b-5b814179f463",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T12:41:59.593061Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T12:41:59.593136Z",
      "updated_at": "2026-10-30T12:41:59.596965Z",
      "finished_at": "2026-10-30T12:41:59.596965Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/4a0623ce-86fc-4269-ae5c-4d90147967a6` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "459c6d30-b64b-4c76-82ab-1292e139097b",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:00:46.956586Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:00:46.956619Z",
  "updated_at": "2026-10-30T13:00:47.299286Z",
  "finished_at": "2026-10-30T13:00:46.962565Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793365374905E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.79336537019E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793365370191E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793365374905E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793365370191E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
