# Sandbox transcript (2026-10-29T08:59:22Z, 6ef3f0b)

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
  "correlation_id": "da1d3f50-7bd8-4919-82fe-887034d3f054"
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
  "session_id": "cbb52c09-aecc-4fdb-b230-2c00f95b84aa",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUyNjgsImlhdCI6MTc5MzI2NDM2OCwianRpIjoiZmFkNWQ1NTQtMTQ5ZC00YzE3LTliNzctMWY1NjE0YzlkODAzIiwic2lkIjoiY2JiNTJjMDktYWVjYy00ZmRiLWIyMzAtMmMwMGY5NWI4NGFhIn0.I4Gsha12Dcx4zcnEGznJIkfhXZQ6l6qJfJ-6QqAVtcY",
  "access_expires_at": "2026-10-29T09:14:28.092994229Z",
  "refresh_token": "iJ-OrYZ92KXGxy7SlGIeH5nlu6smtBOcadyCMuNkpSg",
  "refresh_expires_at": "2026-10-29T20:59:28.091320522Z",
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
  "session_id": "995d0553-fc87-4fee-be3a-2392878952b4",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUyNjksImlhdCI6MTc5MzI2NDM2OSwianRpIjoiZWE1MGM4MmItNmIxMS00ODcxLTkxZmEtMzU3MDNlMGJjZDVjIiwic2lkIjoiOTk1ZDA1NTMtZmM4Ny00ZmVlLWJlM2EtMjM5Mjg3ODk1MmI0In0.GrclZaKszS2HHRCaHSzBvshjR9zY9G33ot3O4pbj9O0",
  "access_expires_at": "2026-10-29T09:14:29.163749561Z",
  "refresh_token": "bPdqdADA_3fePISm47EPAbKXwEP3-a10lBdbZEH_tpc",
  "refresh_expires_at": "2026-10-29T20:59:29.163036293Z",
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
  "device_ref": "sandbox-15818"
}
```

```json
{
  "challenge_id": "723719c4-7faf-4833-a315-a427fb2a822a",
  "expires_at": "2026-10-29T09:04:29.549233397Z",
  "resend_available_at": "2026-10-29T08:59:30.549233397Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "451075",
  "sent_at": "2026-10-29T08:59:29.558398118Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "723719c4-7faf-4833-a315-a427fb2a822a",
  "code": "451075",
  "device_ref": "sandbox-15818"
}
```

```json
{
  "session_id": "61a87f3f-f273-42e4-9009-206a8189778b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTI2OSwiaWF0IjoxNzkzMjY0MzY5LCJqdGkiOiJhODE4MGU5YS0yZjU1LTRkOWItYjU5YS1mMWY1ZjZkOWM2MzQiLCJzaWQiOiI2MWE4N2YzZi1mMjczLTQyZTQtOTAwOS0yMDZhODE4OTc3OGIifQ.lkhkMAGnq971hVSbpzvAN4o26u7tMFWeQ32zkDzH7Uc",
  "access_expires_at": "2026-10-29T09:14:29.779933999Z",
  "refresh_token": "kAeF-cTBXrcg5D3sSeZ9o5voIFyU4uuTSACGavxF5H8",
  "refresh_expires_at": "2026-11-28T08:59:29.779180371Z",
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
  "command_id": "9635bdc1-bc61-4533-8689-42150a19024c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:59:30Z",
    "sequence": 1793264370146
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19354997-01d2-4fae-ac1b-23fdecd143c4",
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
  "last_heartbeat_at": "2026-10-29T08:59:30.296111Z",
  "last_location_at": "2026-10-29T08:59:30.296111Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632527720",
  "device_ref": "sandbox-15927"
}
```

```json
{
  "challenge_id": "e37e0efd-31be-4bfc-bf36-af5179ae3acb",
  "expires_at": "2026-10-29T09:04:30.512811231Z",
  "resend_available_at": "2026-10-29T08:59:31.512811231Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632527720` → **200**

```json
{
  "phone": "+380632527720",
  "audience": "CLIENT",
  "code": "002886",
  "sent_at": "2026-10-29T08:59:30.516427636Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e37e0efd-31be-4bfc-bf36-af5179ae3acb",
  "code": "002886",
  "device_ref": "sandbox-15927"
}
```

```json
{
  "session_id": "eae8f722-9a5e-43a0-ae1f-b94c0e36d864",
  "subject": {
    "type": "CLIENT",
    "id": "b070de6d-56ff-4299-b782-e5814f10026b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMDcwZGU2ZC01NmZmLTQyOTktYjc4Mi1lNTgxNGYxMDAyNmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1MjcwLCJpYXQiOjE3OTMyNjQzNzAsImp0aSI6IjY5MmYxYzNhLWFjNzAtNDlhZi1hOTk4LWRjMDI2ZGQ0ZTQzNSIsInNpZCI6ImVhZThmNzIyLTlhNWUtNDNhMC1hZTFmLWI5NGMwZTM2ZDg2NCJ9.pPra0nGEELcLqokMvPY1HPRK9ide6KLciQ1QifStLEE",
  "access_expires_at": "2026-10-29T09:14:30.724297224Z",
  "refresh_token": "YaDu-QfhjUbN6vmPckfN_8ZsFlC02M5Z-HBgSIjwtH0",
  "refresh_expires_at": "2026-11-28T08:59:30.723645254Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "49b7a84b-bd25-4bd3-bd9c-d6cb420442c3",
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
  "id": "4df0ece0-010b-411c-953c-98fbc0311bbd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:04:30.940880Z",
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
  "command_id": "6601ed3c-2a97-4526-bc99-f79934ea6a68",
  "quote_id": "4df0ece0-010b-411c-953c-98fbc0311bbd",
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
  "id": "2e449fc7-182d-42eb-878e-8f505979b244",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b070de6d-56ff-4299-b782-e5814f10026b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:59:31.19017Z",
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
    "id": "e9f88a8c-fd88-48b0-a725-3d409cd230a5",
    "order_id": "2e449fc7-182d-42eb-878e-8f505979b244",
    "expires_at": "2026-10-29T08:59:46.205426Z",
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

`POST /api/driver/v1/offers/e9f88a8c-fd88-48b0-a725-3d409cd230a5/accept` → **200**

```json
{
  "command_id": "72f94bfc-76c2-4140-a80d-281f66e4817d"
}
```

```json
{
  "id": "f7ba8f79-edae-4e26-8050-f16e55818c14",
  "order_id": "2e449fc7-182d-42eb-878e-8f505979b244",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7e4556a0-8a6e-467e-888c-4180dc256c71",
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
  "command_id": "c6958574-7d4f-4a97-84ec-f1865bd4c025",
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
  "changed_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T08:59:32.035818728Z"
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
  "id": "7e4556a0-8a6e-467e-888c-4180dc256c71",
  "order_id": "2e449fc7-182d-42eb-878e-8f505979b244",
  "assignment_id": "f7ba8f79-edae-4e26-8050-f16e55818c14",
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

`POST /api/driver/v1/work-sessions/19354997-01d2-4fae-ac1b-23fdecd143c4/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:59:32Z",
    "sequence": 1793264372595
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19354997-01d2-4fae-ac1b-23fdecd143c4",
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
  "last_heartbeat_at": "2026-10-29T08:59:32.616798Z",
  "last_location_at": "2026-10-29T08:59:32.616798Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7e4556a0-8a6e-467e-888c-4180dc256c71/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "f89d90bf-e4e2-47c4-bbf5-b0188b55b990",
  "expected_version": 0
}
```

```json
{
  "id": "7e4556a0-8a6e-467e-888c-4180dc256c71",
  "order_id": "2e449fc7-182d-42eb-878e-8f505979b244",
  "assignment_id": "f7ba8f79-edae-4e26-8050-f16e55818c14",
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
  "arrived_at": "2026-10-29T08:59:32.806733Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7e4556a0-8a6e-467e-888c-4180dc256c71/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "31275f53-da59-4676-a430-5d78f5181df0",
  "expected_version": 1
}
```

```json
{
  "id": "7e4556a0-8a6e-467e-888c-4180dc256c71",
  "order_id": "2e449fc7-182d-42eb-878e-8f505979b244",
  "assignment_id": "f7ba8f79-edae-4e26-8050-f16e55818c14",
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
  "arrived_at": "2026-10-29T08:59:32.806733Z",
  "started_at": "2026-10-29T08:59:33.0025Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7e4556a0-8a6e-467e-888c-4180dc256c71/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "e64167bc-31fe-483c-a9fa-766ea4ce4d8a",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:59:33Z",
  "cash_received": true
}
```

```json
{
  "id": "7e4556a0-8a6e-467e-888c-4180dc256c71",
  "order_id": "2e449fc7-182d-42eb-878e-8f505979b244",
  "assignment_id": "f7ba8f79-edae-4e26-8050-f16e55818c14",
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
  "arrived_at": "2026-10-29T08:59:32.806733Z",
  "started_at": "2026-10-29T08:59:33.0025Z",
  "completed_at": "2026-10-29T08:59:33.205354Z",
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
  "session_id": "19354997-01d2-4fae-ac1b-23fdecd143c4",
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
  "last_heartbeat_at": "2026-10-29T08:59:32.616798Z",
  "last_location_at": "2026-10-29T08:59:32.616798Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19354997-01d2-4fae-ac1b-23fdecd143c4/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "1a275137-5351-43e0-b50e-1ed0b5af4ff4",
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
  "command_id": "63a0672b-4042-4482-a85a-99069309222c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:59:33Z",
    "sequence": 1793264373786
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
  "correlation_id": "9e640105-4fa6-42f3-9cc7-57f8e9259c8c",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "b95af2b2-0dc6-4d5f-be2e-70922a93a3b3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:59:33Z",
    "sequence": 1793264373977
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5d306c65-54fe-4dba-922c-2c96a78d58c6",
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
  "last_heartbeat_at": "2026-10-29T08:59:33.995828Z",
  "last_location_at": "2026-10-29T08:59:33.995828Z",
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
  "changed_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T08:59:32.035819Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "8108758b-5ec3-494b-a988-7f427eed9724",
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
  "changed_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T08:59:34.36761763Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5d306c65-54fe-4dba-922c-2c96a78d58c6",
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
  "last_heartbeat_at": "2026-10-29T08:59:33.995828Z",
  "last_location_at": "2026-10-29T08:59:33.995828Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5d306c65-54fe-4dba-922c-2c96a78d58c6/close` → **200**

```json
{
  "command_id": "14ea0a41-01e7-46d5-a227-108d7f3862c0",
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
  "session_id": "f789adcd-7ea3-43b9-a5f0-3c412945c2b5",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUyNzUsImlhdCI6MTc5MzI2NDM3NSwianRpIjoiNzU1OWU5ZWItYTliNy00MjI4LWEwZTYtMTJmMTg4ZDQxYTgyIiwic2lkIjoiZjc4OWFkY2QtN2VhMy00M2I5LWE1ZjAtM2M0MTI5NDVjMmI1In0.yj39rOZISHTsngJM3BMuq0F1F5MFNh_YfEA28JfrGWg",
  "access_expires_at": "2026-10-29T09:14:35.145532839Z",
  "refresh_token": "7hi4zC04zc9_nwiiPTZFLQQxWn8lsz4K1aXm-iraY1A",
  "refresh_expires_at": "2026-10-29T20:59:35.144919719Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "ee63bc62-ae79-4421-bf23-1e7c6af8ef52",
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
  "id": "64793aa2-1dc1-42d2-b81e-eee2562256c5",
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
  "created_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "created_at": "2026-10-29T08:59:35.3321Z",
  "updated_at": "2026-10-29T08:59:35.3321Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630606551",
  "device_ref": "sandbox-3051"
}
```

```json
{
  "challenge_id": "b2918209-2d66-45da-960c-39efefdec806",
  "expires_at": "2026-10-29T09:04:35.527219899Z",
  "resend_available_at": "2026-10-29T08:59:36.527219899Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630606551` → **200**

```json
{
  "phone": "+380630606551",
  "audience": "CLIENT",
  "code": "407276",
  "sent_at": "2026-10-29T08:59:35.530263405Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b2918209-2d66-45da-960c-39efefdec806",
  "code": "407276",
  "device_ref": "sandbox-3051"
}
```

```json
{
  "session_id": "9fbf2146-d704-44ec-8e4c-a0e5a69ed63e",
  "subject": {
    "type": "CLIENT",
    "id": "d3210071-0e4d-4792-9a36-c91111b7b28a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzIxMDA3MS0wZTRkLTQ3OTItOWEzNi1jOTExMTFiN2IyOGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1Mjc1LCJpYXQiOjE3OTMyNjQzNzUsImp0aSI6IjIzNmFjMDFiLTE3NzEtNDczMS1iYTNjLTk3NGRiMjNlOGFjMCIsInNpZCI6IjlmYmYyMTQ2LWQ3MDQtNDRlYy04ZTRjLWEwZTVhNjllZDYzZSJ9.Rkdjg-Vh-cCRnGiGqdlHSpdkhiM7GU7oz8nXFOU8RZg",
  "access_expires_at": "2026-10-29T09:14:35.740646865Z",
  "refresh_token": "z0b19snS1QVpc-23A6aiiEUVVXQ69DjRLVp2qSUqVQo",
  "refresh_expires_at": "2026-11-28T08:59:35.740195183Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630606551` → **200**

```json
{
  "client_id": "d3210071-0e4d-4792-9a36-c91111b7b28a"
}
```

`POST /api/admin/v1/rider-wallets/d3210071-0e4d-4792-9a36-c91111b7b28a/top-ups` → **201**

```json
{
  "command_id": "893eaa9c-0e13-4008-a856-75f95c34e222",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "d3210071-0e4d-4792-9a36-c91111b7b28a",
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
      "id": "7afd070b-c6c1-4719-9a49-f15fe362d0e9",
      "at": "2026-10-29T08:59:36.160294Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d7a825a6-a44c-4f87-b89c-bf36c8cc7de9",
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
  "id": "c2c3b1b5-475d-4923-a997-323b3f8af0e4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:04:36.364663Z",
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
      "id": "64793aa2-1dc1-42d2-b81e-eee2562256c5",
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
  "device_ref": "sandbox-26349"
}
```

```json
{
  "challenge_id": "366be2ec-8686-4f90-aabe-c61ee5512cea",
  "expires_at": "2026-10-29T09:04:36.564976586Z",
  "resend_available_at": "2026-10-29T08:59:37.564976586Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "961390",
  "sent_at": "2026-10-29T08:59:36.56838187Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "366be2ec-8686-4f90-aabe-c61ee5512cea",
  "code": "961390",
  "device_ref": "sandbox-26349"
}
```

```json
{
  "session_id": "8049138e-5f7b-4ec5-8ab4-67799a1ec2b1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTI3NiwiaWF0IjoxNzkzMjY0Mzc2LCJqdGkiOiJmZjhiYThiOC0zZTNhLTRlMmQtODM0ZS04Zjc3ZjhkMzk1ZDUiLCJzaWQiOiI4MDQ5MTM4ZS01ZjdiLTRlYzUtOGFiNC02Nzc5OWExZWMyYjEifQ.ctVwqqUUCpkGlXUaMCemYWp6NWG_Nc4mK4-hIuF_ZkI",
  "access_expires_at": "2026-10-29T09:14:36.787591738Z",
  "refresh_token": "_qYOcJr_W28rSQj95kiCSoa0u6JcfYz7Ia270Xy0hY4",
  "refresh_expires_at": "2026-11-28T08:59:36.787016649Z",
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
  "command_id": "24817970-c8c7-4537-a61f-d1268904fefc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:59:37Z",
    "sequence": 1793264377142
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fd95a029-ad58-4aaa-aea4-90f5312b34e6",
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
  "last_heartbeat_at": "2026-10-29T08:59:37.160235Z",
  "last_location_at": "2026-10-29T08:59:37.160235Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "37d3fec5-fd35-406c-ad32-5c000e67bb6a",
  "quote_id": "c2c3b1b5-475d-4923-a997-323b3f8af0e4",
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
  "id": "2f132c74-48d9-4349-b917-3b4d69fcb66e",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d3210071-0e4d-4792-9a36-c91111b7b28a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:59:37.355526Z",
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
  "client_id": "d3210071-0e4d-4792-9a36-c91111b7b28a",
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
      "id": "7afd070b-c6c1-4719-9a49-f15fe362d0e9",
      "at": "2026-10-29T08:59:36.160294Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
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
    "id": "474c50b3-bee2-4a49-89b4-3b4966b83939",
    "order_id": "2f132c74-48d9-4349-b917-3b4d69fcb66e",
    "expires_at": "2026-10-29T08:59:52.361218Z",
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

`POST /api/driver/v1/offers/474c50b3-bee2-4a49-89b4-3b4966b83939/accept` → **200**

```json
{
  "command_id": "e6f6b033-916e-4eb4-8612-bbdd03950f74"
}
```

```json
{
  "id": "324f1b67-c7a4-4d25-8c60-c3a7a1634532",
  "order_id": "2f132c74-48d9-4349-b917-3b4d69fcb66e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "87334fb7-7c47-4040-bf99-222c26c6baab",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "87334fb7-7c47-4040-bf99-222c26c6baab",
  "order_id": "2f132c74-48d9-4349-b917-3b4d69fcb66e",
  "assignment_id": "324f1b67-c7a4-4d25-8c60-c3a7a1634532",
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

`POST /api/driver/v1/work-sessions/fd95a029-ad58-4aaa-aea4-90f5312b34e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:59:38Z",
    "sequence": 1793264378283
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fd95a029-ad58-4aaa-aea4-90f5312b34e6",
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
  "last_heartbeat_at": "2026-10-29T08:59:38.300966Z",
  "last_location_at": "2026-10-29T08:59:38.300966Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/87334fb7-7c47-4040-bf99-222c26c6baab/arrive` → **200**

```json
{
  "command_id": "f4b145dd-b291-4480-9bd5-d78a9953a1b4",
  "expected_version": 0
}
```

```json
{
  "id": "87334fb7-7c47-4040-bf99-222c26c6baab",
  "order_id": "2f132c74-48d9-4349-b917-3b4d69fcb66e",
  "assignment_id": "324f1b67-c7a4-4d25-8c60-c3a7a1634532",
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
  "arrived_at": "2026-10-29T08:59:38.491454Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/87334fb7-7c47-4040-bf99-222c26c6baab/start` → **200**

```json
{
  "command_id": "b1f3003a-7ab1-48bf-9386-e54c164baac4",
  "expected_version": 1
}
```

```json
{
  "id": "87334fb7-7c47-4040-bf99-222c26c6baab",
  "order_id": "2f132c74-48d9-4349-b917-3b4d69fcb66e",
  "assignment_id": "324f1b67-c7a4-4d25-8c60-c3a7a1634532",
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
  "arrived_at": "2026-10-29T08:59:38.491454Z",
  "started_at": "2026-10-29T08:59:38.706672Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/87334fb7-7c47-4040-bf99-222c26c6baab/complete` → **200**

```json
{
  "command_id": "74493817-a046-41c5-9b63-19fedf36c11e",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:59:38Z",
  "cash_received": true
}
```

```json
{
  "id": "87334fb7-7c47-4040-bf99-222c26c6baab",
  "order_id": "2f132c74-48d9-4349-b917-3b4d69fcb66e",
  "assignment_id": "324f1b67-c7a4-4d25-8c60-c3a7a1634532",
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
  "arrived_at": "2026-10-29T08:59:38.491454Z",
  "started_at": "2026-10-29T08:59:38.706672Z",
  "completed_at": "2026-10-29T08:59:38.912199Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "d3210071-0e4d-4792-9a36-c91111b7b28a",
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
      "id": "d9fe3c8c-ae39-4bcf-9a59-4b9bb614d7bb",
      "at": "2026-10-29T08:59:39.726171Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "2f132c74-48d9-4349-b917-3b4d69fcb66e"
    },
    {
      "id": "7afd070b-c6c1-4719-9a49-f15fe362d0e9",
      "at": "2026-10-29T08:59:36.160294Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/64793aa2-1dc1-42d2-b81e-eee2562256c5/archive` → **200**

```json
{
  "command_id": "453a50cf-2b5e-40af-9eb7-01a4f9fdbd88",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "64793aa2-1dc1-42d2-b81e-eee2562256c5",
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
  "created_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "created_at": "2026-10-29T08:59:35.3321Z",
  "updated_at": "2026-10-29T08:59:42.292165Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fd95a029-ad58-4aaa-aea4-90f5312b34e6",
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
  "last_heartbeat_at": "2026-10-29T08:59:38.300966Z",
  "last_location_at": "2026-10-29T08:59:38.300966Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fd95a029-ad58-4aaa-aea4-90f5312b34e6/close` → **200**

```json
{
  "command_id": "fabef21f-d606-49d8-869f-5d08ba4b870d",
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

Done: order 2f132c74-48d9-4349-b917-3b4d69fcb66e.

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
  "session_id": "38a1c7a8-bcef-42a8-b43d-7fb0872c966a",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUyODMsImlhdCI6MTc5MzI2NDM4MywianRpIjoiYmMyNTA1NDAtNmNkZC00N2E4LThiNjAtZWYzMWVjZDA1NWRmIiwic2lkIjoiMzhhMWM3YTgtYmNlZi00MmE4LWI0M2QtN2ZiMDg3MmM5NjZhIn0.Y7oXKBpT-EUje-z-iPp8W05ps63d2OE0oK0faUOscH4",
  "access_expires_at": "2026-10-29T09:14:43.077612083Z",
  "refresh_token": "vlYqTJMvSSxuPk7hqEmCNg-sxg-xbB1enK3ukyfhZEA",
  "refresh_expires_at": "2026-10-29T20:59:43.077138127Z",
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
  "command_id": "89754af4-b994-44b3-b878-44bf55d77020",
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
  "session_id": "04ca20c6-0a4b-4879-a82b-b67be1d59c50",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUyODMsImlhdCI6MTc5MzI2NDM4MywianRpIjoiNzdmY2U0NGQtOGY3Ni00M2ZjLWI0ZjYtM2M2YzYyZmQ0MTI4Iiwic2lkIjoiMDRjYTIwYzYtMGE0Yi00ODc5LWE4MmItYjY3YmUxZDU5YzUwIn0.RsQ9hZiwCe-1SJCRn9hqv5lCzaXJwT3bFh_vjZgEqTU",
  "access_expires_at": "2026-10-29T09:14:43.926887054Z",
  "refresh_token": "ghFd8j8a9RmHzQQl41s0qE-me2N-mxsn6ZprsWCaeQM",
  "refresh_expires_at": "2026-10-29T20:59:43.926463814Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2805814251",
    "linkedid": "1730052700.2805814251",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677753331"
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
    "id": "1730052700.2805814251",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "d514875a-e0a7-4977-96df-711b9dc62b9e",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380677753331",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T08:59:44.103793Z",
      "answered_at": null,
      "ended_at": "2026-10-29T08:59:44.125687Z",
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
    "id": "1730052600.1215310279",
    "linkedid": "1730052600.1215310279",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677753331"
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
      "id": "820791b1-ee82-4802-a414-cc3e34186ebb",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677753331",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T08:59:44.341713Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/820791b1-ee82-4802-a414-cc3e34186ebb/answer` → **200**

```json
{
  "command_id": "05e77d28-eb77-4de6-8b18-206e2547cc11"
}
```

```json
{
  "id": "820791b1-ee82-4802-a414-cc3e34186ebb",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677753331",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "order_ids": [],
  "started_at": "2026-10-29T08:59:44.341713Z",
  "answered_at": "2026-10-29T08:59:44.555019Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1215310279",
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
    "id": "1730052600.1215310279",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "820791b1-ee82-4802-a414-cc3e34186ebb",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677753331",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "order_ids": [],
      "started_at": "2026-10-29T08:59:44.341713Z",
      "answered_at": "2026-10-29T08:59:44.555019Z",
      "ended_at": "2026-10-29T08:59:44.783055Z",
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
      "id": "820791b1-ee82-4802-a414-cc3e34186ebb",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677753331",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "order_ids": [],
      "started_at": "2026-10-29T08:59:44.341713Z",
      "answered_at": "2026-10-29T08:59:44.555019Z",
      "ended_at": "2026-10-29T08:59:44.783055Z",
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
      "id": "820791b1-ee82-4802-a414-cc3e34186ebb",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677753331",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "order_ids": [],
      "started_at": "2026-10-29T08:59:44.341713Z",
      "answered_at": "2026-10-29T08:59:44.555019Z",
      "ended_at": "2026-10-29T08:59:44.783055Z",
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
      "id": "820791b1-ee82-4802-a414-cc3e34186ebb",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677753331",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "order_ids": [],
      "started_at": "2026-10-29T08:59:44.341713Z",
      "answered_at": "2026-10-29T08:59:44.555019Z",
      "ended_at": "2026-10-29T08:59:44.783055Z",
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
      "id": "820791b1-ee82-4802-a414-cc3e34186ebb",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677753331",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "order_ids": [],
      "started_at": "2026-10-29T08:59:44.341713Z",
      "answered_at": "2026-10-29T08:59:44.555019Z",
      "ended_at": "2026-10-29T08:59:44.783055Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T08:59:51.502516Z"
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
      "id": "820791b1-ee82-4802-a414-cc3e34186ebb",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677753331",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "order_ids": [],
      "started_at": "2026-10-29T08:59:44.341713Z",
      "answered_at": "2026-10-29T08:59:44.555019Z",
      "ended_at": "2026-10-29T08:59:44.783055Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T08:59:51.502516Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/820791b1-ee82-4802-a414-cc3e34186ebb/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/820791b1-ee82-4802-a414-cc3e34186ebb/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=820791b1-ee82-4802-a414-cc3e34186ebb` → **200**

```json
{
  "changes": [
    {
      "id": "62f27b69-7743-4770-8a43-19c7d7f76649",
      "occurred_at": "2026-10-29T08:59:53.972052Z",
      "actor_type": "STAFF",
      "actor_id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "820791b1-ee82-4802-a414-cc3e34186ebb",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"709efa26-fa00-4d7d-82d2-98bbb18133fa\", \"order_ids\": []}",
      "correlation_id": "d8760b4e-3677-4604-b595-77a8dbf4ab0e"
    },
    {
      "id": "686ef40c-69fe-4512-aa00-95dcbb6947dc",
      "occurred_at": "2026-10-29T08:59:53.946998Z",
      "actor_type": "STAFF",
      "actor_id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "820791b1-ee82-4802-a414-cc3e34186ebb",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"709efa26-fa00-4d7d-82d2-98bbb18133fa\", \"order_ids\": []}",
      "correlation_id": "d29aa55f-643f-41c8-a75c-1b7a6ad16ec6"
    }
  ]
}
```

Done: call 820791b1-ee82-4802-a414-cc3e34186ebb recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5831"
}
```

```json
{
  "challenge_id": "dec66828-4963-4831-9ee7-55dad66b2cee",
  "expires_at": "2026-10-29T09:04:54.188366716Z",
  "resend_available_at": "2026-10-29T08:59:55.188366716Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "237464",
  "sent_at": "2026-10-29T08:59:54.191336189Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dec66828-4963-4831-9ee7-55dad66b2cee",
  "code": "237464",
  "device_ref": "sandbox-5831"
}
```

```json
{
  "session_id": "5a275900-da17-45a9-8585-0919e8296bf3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTI5NCwiaWF0IjoxNzkzMjY0Mzk0LCJqdGkiOiIxM2JkNzNjYS1hMGM1LTRmYTYtYTYzZS0wN2JhNWUyODg0YTgiLCJzaWQiOiI1YTI3NTkwMC1kYTE3LTQ1YTktODU4NS0wOTE5ZTgyOTZiZjMifQ.hU9DW3QXkwDBt-q58YoPXHFcTgccSbe7m6-Obkjq7xM",
  "access_expires_at": "2026-10-29T09:14:54.395476826Z",
  "refresh_token": "pi7D-Yr7s1qpvR3-LZXaduYeyS3eMkNL1GdElT2qOL0",
  "refresh_expires_at": "2026-11-28T08:59:54.395025585Z",
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
  "command_id": "d8ddafe9-6410-44dc-87ae-ece8a37301de",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:59:54Z",
    "sequence": 1793264394750
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "02a622a7-672e-472e-8fe4-d25d68283bea",
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
  "last_heartbeat_at": "2026-10-29T08:59:54.766938Z",
  "last_location_at": "2026-10-29T08:59:54.766938Z",
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
  "session_id": "26b99e20-f3bf-4cc4-8a8d-33499a0a094f",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUyOTUsImlhdCI6MTc5MzI2NDM5NSwianRpIjoiNTI5ZjE2ZGItNGY1Yi00MjM1LWExODUtZjM5ZDEwZDI1ZDFmIiwic2lkIjoiMjZiOTllMjAtZjNiZi00Y2M0LThhOGQtMzM0OTlhMGEwOTRmIn0.31_5HoWuPYoOVl2dwUVKv41SQGFNzYlfJEtDtaQ-wEw",
  "access_expires_at": "2026-10-29T09:14:55.163635442Z",
  "refresh_token": "TBThO-Y2t1RnVqk4UBSw-o5SQW94iNXSLryEE5IfDRs",
  "refresh_expires_at": "2026-10-29T20:59:55.163195147Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7ecf9576-6f0d-4f6e-835c-802cac7a932e",
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
  "id": "4184db63-4362-44f7-9421-a85f8d4eacdf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:04:55.355350Z",
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
  "command_id": "0c8d61fb-fa65-4dd0-b145-c9b7e45d411a",
  "quote_id": "4184db63-4362-44f7-9421-a85f8d4eacdf",
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
    "phone": "+380679716700"
  }
}
```

```json
{
  "id": "473e8364-2325-40ca-9fe4-994df706bc38",
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
  "created_at": "2026-10-29T08:59:55.561887Z",
  "caller": {
    "name": "Олена",
    "phone": "+380679716700"
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
    "id": "ad7802f0-f2bb-402f-8cb5-ce5ac4e0cd93",
    "order_id": "473e8364-2325-40ca-9fe4-994df706bc38",
    "expires_at": "2026-10-29T09:00:10.566077Z",
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

`POST /api/driver/v1/offers/ad7802f0-f2bb-402f-8cb5-ce5ac4e0cd93/accept` → **200**

```json
{
  "command_id": "f12be497-56c8-49d3-a5ec-f7e3baa070fb"
}
```

```json
{
  "id": "081d9d8b-896d-475e-a53f-2ba99eb657c5",
  "order_id": "473e8364-2325-40ca-9fe4-994df706bc38",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b1e168ed-7666-4ae3-8590-9123270a2991",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380679716700` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380679716700` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380679716700` → **200**

```json
[
  {
    "phone": "+380679716700",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T08:59:57.63297914Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679716700` → **200**

```json
[
  {
    "phone": "+380679716700",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T08:59:57.63297914Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380679716700` → **200**

```json
[
  {
    "phone": "+380679716700",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T08:59:57.63297914Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b1e168ed-7666-4ae3-8590-9123270a2991",
  "order_id": "473e8364-2325-40ca-9fe4-994df706bc38",
  "assignment_id": "081d9d8b-896d-475e-a53f-2ba99eb657c5",
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
    "phone": "+380679716700"
  }
}
```

`POST /api/driver/v1/work-sessions/02a622a7-672e-472e-8fe4-d25d68283bea/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:59:58Z",
    "sequence": 1793264398422
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "02a622a7-672e-472e-8fe4-d25d68283bea",
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
  "last_heartbeat_at": "2026-10-29T08:59:58.439131Z",
  "last_location_at": "2026-10-29T08:59:58.439131Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b1e168ed-7666-4ae3-8590-9123270a2991/arrive` → **200**

```json
{
  "command_id": "309e631a-2c27-4745-a13c-9a9a7da81814",
  "expected_version": 0
}
```

```json
{
  "id": "b1e168ed-7666-4ae3-8590-9123270a2991",
  "order_id": "473e8364-2325-40ca-9fe4-994df706bc38",
  "assignment_id": "081d9d8b-896d-475e-a53f-2ba99eb657c5",
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
  "arrived_at": "2026-10-29T08:59:58.622692Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380679716700"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380679716700` → **200**

```json
[
  {
    "phone": "+380679716700",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T08:59:57.63297914Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679716700` → **200**

```json
[
  {
    "phone": "+380679716700",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T08:59:57.63297914Z"
  },
  {
    "phone": "+380679716700",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T08:59:59.637910962Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679716700` → **200**

```json
[
  {
    "phone": "+380679716700",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T08:59:57.63297914Z"
  },
  {
    "phone": "+380679716700",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T08:59:59.637910962Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380679716700` → **200**

```json
[
  {
    "phone": "+380679716700",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T08:59:57.63297914Z"
  },
  {
    "phone": "+380679716700",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T08:59:59.637910962Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/b1e168ed-7666-4ae3-8590-9123270a2991/start` → **200**

```json
{
  "command_id": "f3dba60a-e07b-4fdd-a056-0e3e05dbf653",
  "expected_version": 1
}
```

```json
{
  "id": "b1e168ed-7666-4ae3-8590-9123270a2991",
  "order_id": "473e8364-2325-40ca-9fe4-994df706bc38",
  "assignment_id": "081d9d8b-896d-475e-a53f-2ba99eb657c5",
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
  "arrived_at": "2026-10-29T08:59:58.622692Z",
  "started_at": "2026-10-29T08:59:59.901329Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380679716700"
  }
}
```

`POST /api/driver/v1/trips/b1e168ed-7666-4ae3-8590-9123270a2991/complete` → **200**

```json
{
  "command_id": "3b2db5a8-aba8-46b3-b9ad-4812fb7ab399",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:00:00Z",
  "cash_received": true
}
```

```json
{
  "id": "b1e168ed-7666-4ae3-8590-9123270a2991",
  "order_id": "473e8364-2325-40ca-9fe4-994df706bc38",
  "assignment_id": "081d9d8b-896d-475e-a53f-2ba99eb657c5",
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
  "arrived_at": "2026-10-29T08:59:58.622692Z",
  "started_at": "2026-10-29T08:59:59.901329Z",
  "completed_at": "2026-10-29T09:00:00.09312Z",
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
  "session_id": "02a622a7-672e-472e-8fe4-d25d68283bea",
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
  "last_heartbeat_at": "2026-10-29T08:59:58.439131Z",
  "last_location_at": "2026-10-29T08:59:58.439131Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/02a622a7-672e-472e-8fe4-d25d68283bea/close` → **200**

```json
{
  "command_id": "43e0f7da-e572-4221-9ec5-22c37799b52e",
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
  "phone": "+380639321888",
  "device_ref": "sandbox-597"
}
```

```json
{
  "challenge_id": "661725da-cb64-4305-8a56-19b05bb3952d",
  "expires_at": "2026-10-29T09:05:00.656989468Z",
  "resend_available_at": "2026-10-29T09:00:01.656989468Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639321888` → **200**

```json
{
  "phone": "+380639321888",
  "audience": "CLIENT",
  "code": "344855",
  "sent_at": "2026-10-29T09:00:00.659650014Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "661725da-cb64-4305-8a56-19b05bb3952d",
  "code": "344855",
  "device_ref": "sandbox-597"
}
```

```json
{
  "session_id": "796774fb-9644-48f1-91f5-4b9c8cee584f",
  "subject": {
    "type": "CLIENT",
    "id": "ad079fc8-a71e-4102-8e4a-05bf7dc0dc1a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZDA3OWZjOC1hNzFlLTQxMDItOGU0YS0wNWJmN2RjMGRjMWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1MzAwLCJpYXQiOjE3OTMyNjQ0MDAsImp0aSI6IjViOWRlMDJiLWJjMDUtNGVlNi1hZmRiLWZkMmI5Y2M5M2M1MSIsInNpZCI6Ijc5Njc3NGZiLTk2NDQtNDhmMS05MWY1LTRiOWM4Y2VlNTg0ZiJ9.waPaWlbDofHpDRoR9jibQMKmToCfxxbAehTf0c9oftM",
  "access_expires_at": "2026-10-29T09:15:00.872603561Z",
  "refresh_token": "ejMVxlp_vkrEjX2520S4ezilDb_U46Xy0J3MyzSwQTI",
  "refresh_expires_at": "2026-11-28T09:00:00.872185881Z",
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
  "device_ref": "sandbox-13094"
}
```

```json
{
  "challenge_id": "5aaf9fe1-9762-42fc-8ef9-f3464a52fd79",
  "expires_at": "2026-10-29T09:05:01.252936181Z",
  "resend_available_at": "2026-10-29T09:00:02.252936181Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "182849",
  "sent_at": "2026-10-29T09:00:01.255740284Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5aaf9fe1-9762-42fc-8ef9-f3464a52fd79",
  "code": "182849",
  "device_ref": "sandbox-13094"
}
```

```json
{
  "session_id": "6857a65a-0c26-4911-a537-9483e3764e49",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTMwMSwiaWF0IjoxNzkzMjY0NDAxLCJqdGkiOiJlZmEyYTljZC0xMzkzLTQyNjgtYjRkNi1kZDRiZjQ1ZDA5NDEiLCJzaWQiOiI2ODU3YTY1YS0wYzI2LTQ5MTEtYTUzNy05NDgzZTM3NjRlNDkifQ.hXhWBb59pN_hWdPQKmVdiOLXFrmXhgscbWxaqREleoc",
  "access_expires_at": "2026-10-29T09:15:01.457900471Z",
  "refresh_token": "UvSelbJ5r8Z8b13wTBvgxaIa3r6jEPhj8b_CxK0o1kU",
  "refresh_expires_at": "2026-11-28T09:00:01.457454377Z",
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
  "session_id": "ef8109c0-92f9-41a8-b1f8-55741a8f19ae",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUzMDIsImlhdCI6MTc5MzI2NDQwMiwianRpIjoiMmJhZTlhYzUtM2JjYy00NjhhLTlmZDQtMmNkZWQ1NTM5YTZiIiwic2lkIjoiZWY4MTA5YzAtOTJmOS00MWE4LWIxZjgtNTU3NDFhOGYxOWFlIn0.wlovngehpZuAf9HlY923kSc-DrdccAUgOOnKuOKjgIA",
  "access_expires_at": "2026-10-29T09:15:02.022862688Z",
  "refresh_token": "6d-sqVC4Z1GkA1U1f-_d5tmVehc4nZyDA873eLofc0Y",
  "refresh_expires_at": "2026-10-29T21:00:02.022453099Z",
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
  "session_id": "de503672-d59b-4a77-9a86-e5f302e32367",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUzMDIsImlhdCI6MTc5MzI2NDQwMiwianRpIjoiZDBhYzZlMWItNWI4My00YTg5LWEwNWYtN2IyYTc1YzU5MDY3Iiwic2lkIjoiZGU1MDM2NzItZDU5Yi00YTc3LTlhODYtZTVmMzAyZTMyMzY3In0.P9fMRGpZnozocfMGDVAs0S2-sd5YjAJXf2mDgMjx5fg",
  "access_expires_at": "2026-10-29T09:15:02.407299592Z",
  "refresh_token": "wQ1o1mF2mVhB78bVbcoR2vYgpwp0oDacVZFUKqIyqEQ",
  "refresh_expires_at": "2026-10-29T21:00:02.406876573Z",
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
  "command_id": "f1820577-10f6-43b4-9e03-1634e516d38c",
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
  "id": "72310062-f5e1-40d1-b4c7-bf00a4954906",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:05:02.777592Z",
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
  "command_id": "da02b752-bc10-43de-8ab1-1f1e37b8385f",
  "quote_id": "72310062-f5e1-40d1-b4c7-bf00a4954906",
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
  "id": "b6bb5637-1fcd-4b69-a905-144258f39104",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad079fc8-a71e-4102-8e4a-05bf7dc0dc1a",
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
  "created_at": "2026-10-29T09:00:02.970156Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6bb5637-1fcd-4b69-a905-144258f39104` → **200**

```json
{
  "id": "b6bb5637-1fcd-4b69-a905-144258f39104",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad079fc8-a71e-4102-8e4a-05bf7dc0dc1a",
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
  "created_at": "2026-10-29T09:00:02.970156Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b6bb5637-1fcd-4b69-a905-144258f39104/cancel` → **200**

```json
{
  "command_id": "6e6015b5-91c1-49ad-98f9-f43d7ea7c7a0",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "b6bb5637-1fcd-4b69-a905-144258f39104",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ad079fc8-a71e-4102-8e4a-05bf7dc0dc1a",
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
  "created_at": "2026-10-29T09:00:02.970156Z",
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
  "command_id": "bfeda0eb-215d-4b03-9cf6-b8eac3eae2d3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:00:03Z",
    "sequence": 1793264403738
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6bcaf0b8-1afc-4bb4-a3fc-2c5777d713f6",
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
  "last_heartbeat_at": "2026-10-29T09:00:03.755635Z",
  "last_location_at": "2026-10-29T09:00:03.755635Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-26172"
}
```

```json
{
  "challenge_id": "a552c72a-4cfd-440e-8d25-bb03095de362",
  "expires_at": "2026-10-29T09:05:03.952913726Z",
  "resend_available_at": "2026-10-29T09:00:04.952913726Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "710916",
  "sent_at": "2026-10-29T09:00:03.955274411Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a552c72a-4cfd-440e-8d25-bb03095de362",
  "code": "710916",
  "device_ref": "sandbox-26172"
}
```

```json
{
  "session_id": "f1c38170-6019-492d-b1b0-ec3428a0076d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTMwNCwiaWF0IjoxNzkzMjY0NDA0LCJqdGkiOiJjYWMxMGI0Ni03NWU5LTQ3ZWYtYTVjMi1kOTIwNmJkYWIxMTEiLCJzaWQiOiJmMWMzODE3MC02MDE5LTQ5MmQtYjFiMC1lYzM0MjhhMDA3NmQifQ.XsRYW1Dg3HW0seeGKzw_-r5TsaP4codKobccWkFMcek",
  "access_expires_at": "2026-10-29T09:15:04.160863764Z",
  "refresh_token": "_h4MNOqYPXqNLPqZYfIy00YBXywLH2XpG7LZ-VXooEY",
  "refresh_expires_at": "2026-11-28T09:00:04.160385162Z",
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
  "command_id": "a1cea3f0-d063-4c17-9dac-c393c0d24b3d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:00:04Z",
    "sequence": 1793264404513
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bdf044bd-7692-4979-9f94-c9a07806615d",
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
  "last_heartbeat_at": "2026-10-29T09:00:04.560754Z",
  "last_location_at": "2026-10-29T09:00:04.560754Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "124087bf-9f38-44bf-bb11-681cec3c21f6",
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
  "id": "b151ed8e-6da8-4a64-9c05-414dbff699ef",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:05:04.749368Z",
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
  "command_id": "b76bbb2b-bdcb-40f1-af76-ce53b57ecdc6",
  "quote_id": "b151ed8e-6da8-4a64-9c05-414dbff699ef",
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
  "id": "04393ced-57b1-4160-bb95-41808a331278",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad079fc8-a71e-4102-8e4a-05bf7dc0dc1a",
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
  "created_at": "2026-10-29T09:00:04.966572Z",
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
    "id": "f52d10a1-13f6-44f9-afe5-a3606b975991",
    "order_id": "04393ced-57b1-4160-bb95-41808a331278",
    "expires_at": "2026-10-29T09:00:19.96928Z",
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

`POST /api/driver/v1/offers/f52d10a1-13f6-44f9-afe5-a3606b975991/accept` → **200**

```json
{
  "command_id": "0ed6db12-2e06-43f8-bb0c-dee0e5fa2b1b"
}
```

```json
{
  "id": "8802b151-dd88-4018-b41b-275043f77ef4",
  "order_id": "04393ced-57b1-4160-bb95-41808a331278",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "aa8d6c19-0dc9-424c-b2e7-bb2bc11f5b19",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "aa8d6c19-0dc9-424c-b2e7-bb2bc11f5b19",
  "order_id": "04393ced-57b1-4160-bb95-41808a331278",
  "assignment_id": "8802b151-dd88-4018-b41b-275043f77ef4",
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

`POST /api/driver/v1/trips/aa8d6c19-0dc9-424c-b2e7-bb2bc11f5b19/cancel` → **200**

```json
{
  "command_id": "7c49c64e-8568-4bfe-85fd-3ffad448150d",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "aa8d6c19-0dc9-424c-b2e7-bb2bc11f5b19",
  "order_id": "04393ced-57b1-4160-bb95-41808a331278",
  "assignment_id": "8802b151-dd88-4018-b41b-275043f77ef4",
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

`GET /api/rider/v1/orders/04393ced-57b1-4160-bb95-41808a331278` → **200**

```json
{
  "id": "04393ced-57b1-4160-bb95-41808a331278",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ad079fc8-a71e-4102-8e4a-05bf7dc0dc1a",
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
    "id": "8802b151-dd88-4018-b41b-275043f77ef4",
    "order_id": "04393ced-57b1-4160-bb95-41808a331278",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "aa8d6c19-0dc9-424c-b2e7-bb2bc11f5b19",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T09:00:04.966572Z",
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
    "id": "49d4d1b8-ed75-4723-8b4f-082c36d0c8ba",
    "order_id": "04393ced-57b1-4160-bb95-41808a331278",
    "expires_at": "2026-10-29T09:00:20.71163Z",
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

`POST /api/driver/v1/offers/49d4d1b8-ed75-4723-8b4f-082c36d0c8ba/accept` → **200**

```json
{
  "command_id": "ce9a151f-1534-4df3-8369-8d5d263cc436"
}
```

```json
{
  "id": "76ecb372-6b91-43c2-9076-be80ad8c5ef3",
  "order_id": "04393ced-57b1-4160-bb95-41808a331278",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5a7671fc-ccab-4f90-97ca-c253a7ea5840",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5a7671fc-ccab-4f90-97ca-c253a7ea5840",
  "order_id": "04393ced-57b1-4160-bb95-41808a331278",
  "assignment_id": "76ecb372-6b91-43c2-9076-be80ad8c5ef3",
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

`POST /api/driver/v1/trips/5a7671fc-ccab-4f90-97ca-c253a7ea5840/cancel` → **200**

```json
{
  "command_id": "278586e3-8005-47b4-abad-1b8f0b44abd7",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "5a7671fc-ccab-4f90-97ca-c253a7ea5840",
  "order_id": "04393ced-57b1-4160-bb95-41808a331278",
  "assignment_id": "76ecb372-6b91-43c2-9076-be80ad8c5ef3",
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
    "id": "04393ced-57b1-4160-bb95-41808a331278",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T09:00:04.966572Z",
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
    "id": "b6bb5637-1fcd-4b69-a905-144258f39104",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T09:00:02.970156Z",
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

`GET /api/operator/v1/orders/04393ced-57b1-4160-bb95-41808a331278/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T09:00:04.967117Z",
      "actor": {
        "type": "CLIENT",
        "id": "ad079fc8-a71e-4102-8e4a-05bf7dc0dc1a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "04393ced-57b1-4160-bb95-41808a331278",
        "quote_id": "b151ed8e-6da8-4a64-9c05-414dbff699ef",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "5386c181-cf20-4946-ab6f-897ce01ee9a9"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T09:00:04.968639Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "04393ced-57b1-4160-bb95-41808a331278",
        "attempt_id": "c4c06c0b-5041-4ef2-9849-25d4d45471f2",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5386c181-cf20-4946-ab6f-897ce01ee9a9"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T09:00:04.97354Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f52d10a1-13f6-44f9-afe5-a3606b975991",
        "order_id": "04393ced-57b1-4160-bb95-41808a331278",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "5386c181-cf20-4946-ab6f-897ce01ee9a9"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T09:00:05.343067Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f52d10a1-13f6-44f9-afe5-a3606b975991",
        "order_id": "04393ced-57b1-4160-bb95-41808a331278",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "8802b151-dd88-4018-b41b-275043f77ef4"
      },
      "correlation_id": "548bfc06-ebaa-485b-b657-44b0adb8913f"
```

Done: orders b6bb5637-1fcd-4b69-a905-144258f39104, 04393ced-57b1-4160-bb95-41808a331278.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733252810",
  "device_ref": "sandbox-6712"
}
```

```json
{
  "challenge_id": "e1c77746-8521-4205-a45d-ad386494dddc",
  "expires_at": "2026-10-29T09:05:07.292595621Z",
  "resend_available_at": "2026-10-29T09:00:08.292595621Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733252810` → **200**

```json
{
  "phone": "+380733252810",
  "audience": "CLIENT",
  "code": "653859",
  "sent_at": "2026-10-29T09:00:07.29518438Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1c77746-8521-4205-a45d-ad386494dddc",
  "code": "653859",
  "device_ref": "sandbox-6712"
}
```

```json
{
  "session_id": "d30bbe49-eaf4-4e2e-90ef-6eee226002e2",
  "subject": {
    "type": "CLIENT",
    "id": "adb9933f-067e-44ed-801a-bfc9684a0db3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZGI5OTMzZi0wNjdlLTQ0ZWQtODAxYS1iZmM5Njg0YTBkYjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1MzA3LCJpYXQiOjE3OTMyNjQ0MDcsImp0aSI6ImQ0ZWVlNDQ1LTY0NGUtNDI0NC1hYTZjLWFlYjkxNTczM2YwMiIsInNpZCI6ImQzMGJiZTQ5LWVhZjQtNGUyZS05MGVmLTZlZWUyMjYwMDJlMiJ9.TVV1vWvwG94Jhwl0T4GgtuZqgAjZhA_hmHce7Zc-8Tk",
  "access_expires_at": "2026-10-29T09:15:07.504516795Z",
  "refresh_token": "WfvyJwMhBmvBaOPuDDtYsP_Dsoh3-3unaK9JG39b6ZI",
  "refresh_expires_at": "2026-11-28T09:00:07.504172826Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "04a45d15-56df-461c-bad1-9b040b7637c6",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "30133ee8-ecf3-476e-8219-7a1e09be50ab",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-30133ee8-ecf3-476e-8219-7a1e09be50ab",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "53e6d830bd6ab9e54315bbdc91bff046",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=30133ee8-ecf3-476e-8219-7a1e09be50ab",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733252810"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=30133ee8-ecf3-476e-8219-7a1e09be50ab",
  "expires_at": "2026-10-29T09:30:07.696462Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/30133ee8-ecf3-476e-8219-7a1e09be50ab` → **200**

```json
{
  "id": "30133ee8-ecf3-476e-8219-7a1e09be50ab",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T09:30:07.696462Z",
  "card": {
    "id": "05e86932-2742-4ad8-b5c4-a508a9595f1d",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4988",
    "card_type": "Visa",
    "created_at": "2026-10-29T09:00:07.896886Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "05e86932-2742-4ad8-b5c4-a508a9595f1d",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****4988",
      "card_type": "Visa",
      "created_at": "2026-10-29T09:00:07.896886Z"
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
  "device_ref": "sandbox-21328"
}
```

```json
{
  "challenge_id": "3d2ff872-09cc-4c4c-b260-19c13363398c",
  "expires_at": "2026-10-29T09:05:08.282922188Z",
  "resend_available_at": "2026-10-29T09:00:09.282922188Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "792302",
  "sent_at": "2026-10-29T09:00:08.285287459Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d2ff872-09cc-4c4c-b260-19c13363398c",
  "code": "792302",
  "device_ref": "sandbox-21328"
}
```

```json
{
  "session_id": "304dc650-1a73-42de-b21a-787c6c360c5c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTMwOCwiaWF0IjoxNzkzMjY0NDA4LCJqdGkiOiJkM2FmMDE0OC1jOTczLTRkZWYtOGI5OC1lMmZiMDY5YmRjNWUiLCJzaWQiOiIzMDRkYzY1MC0xYTczLTQyZGUtYjIxYS03ODdjNmMzNjBjNWMifQ.FWcfowcvhOpdAvl8imu4-lO-Esibh1D7EMDouZfKXjI",
  "access_expires_at": "2026-10-29T09:15:08.487672965Z",
  "refresh_token": "XfI1NmI2VsmwDbJNFgaQ9MrUVPtJxT_WmWssaGsJ_TM",
  "refresh_expires_at": "2026-11-28T09:00:08.487253641Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bdf044bd-7692-4979-9f94-c9a07806615d",
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
  "last_heartbeat_at": "2026-10-29T09:00:04.560754Z",
  "last_location_at": "2026-10-29T09:00:04.560754Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bdf044bd-7692-4979-9f94-c9a07806615d/handover` → **200**

```json
{
  "command_id": "01ed8815-8686-4227-871c-92ea534ff003",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bdf044bd-7692-4979-9f94-c9a07806615d",
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
  "last_heartbeat_at": "2026-10-29T09:00:04.560754Z",
  "last_location_at": "2026-10-29T09:00:04.560754Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bdf044bd-7692-4979-9f94-c9a07806615d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:00:09Z",
    "sequence": 1793264409378
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bdf044bd-7692-4979-9f94-c9a07806615d",
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
  "last_heartbeat_at": "2026-10-29T09:00:09.05483Z",
  "last_location_at": "2026-10-29T09:00:09.05483Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cfe51e3e-aa59-4df6-9d3c-629aa1e01192",
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
  "id": "6a4fde3c-8c1c-40b1-a35e-f2ebcd83c446",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:05:09.246255Z",
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
  "command_id": "3017b39a-7ec8-4e6a-a554-8e03912cc39d",
  "quote_id": "6a4fde3c-8c1c-40b1-a35e-f2ebcd83c446",
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
  "id": "2c642205-5982-44d4-9670-3062934e0b9a",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "adb9933f-067e-44ed-801a-bfc9684a0db3",
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
  "created_at": "2026-10-29T09:00:09.461464Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2c642205-5982-44d4-9670-3062934e0b9a` → **200**

```json
{
  "id": "2c642205-5982-44d4-9670-3062934e0b9a",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "adb9933f-067e-44ed-801a-bfc9684a0db3",
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
  "created_at": "2026-10-29T09:00:09.461464Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2c642205-5982-44d4-9670-3062934e0b9a` → **200**

```json
{
  "id": "2c642205-5982-44d4-9670-3062934e0b9a",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "adb9933f-067e-44ed-801a-bfc9684a0db3",
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
  "created_at": "2026-10-29T09:00:09.461464Z",
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
    "id": "f9038054-3df0-4e4c-a265-ea4d32eb60ee",
    "order_id": "2c642205-5982-44d4-9670-3062934e0b9a",
    "expires_at": "2026-10-29T09:00:24.921027Z",
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

`POST /api/driver/v1/offers/f9038054-3df0-4e4c-a265-ea4d32eb60ee/accept` → **200**

```json
{
  "command_id": "17e094a6-e609-4915-86e3-daef20f174ca"
}
```

```json
{
  "id": "3882b75a-a12d-49ff-ae54-8450c9068a84",
  "order_id": "2c642205-5982-44d4-9670-3062934e0b9a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e542a6e0-696d-4c74-abe1-a0d361f5d355",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e542a6e0-696d-4c74-abe1-a0d361f5d355",
  "order_id": "2c642205-5982-44d4-9670-3062934e0b9a",
  "assignment_id": "3882b75a-a12d-49ff-ae54-8450c9068a84",
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

`POST /api/driver/v1/work-sessions/bdf044bd-7692-4979-9f94-c9a07806615d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:00:11Z",
    "sequence": 1793264411600
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bdf044bd-7692-4979-9f94-c9a07806615d",
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
  "last_heartbeat_at": "2026-10-29T09:00:11.617689Z",
  "last_location_at": "2026-10-29T09:00:11.617689Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e542a6e0-696d-4c74-abe1-a0d361f5d355/arrive` → **200**

```json
{
  "command_id": "72f17cff-2794-45ce-9669-fbce8f1fa12a",
  "expected_version": 0
}
```

```json
{
  "id": "e542a6e0-696d-4c74-abe1-a0d361f5d355",
  "order_id": "2c642205-5982-44d4-9670-3062934e0b9a",
  "assignment_id": "3882b75a-a12d-49ff-ae54-8450c9068a84",
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
  "arrived_at": "2026-10-29T09:00:11.813861Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e542a6e0-696d-4c74-abe1-a0d361f5d355/start` → **200**

```json
{
  "command_id": "0147cb5b-a709-4a9b-870c-5772759b9671",
  "expected_version": 1
}
```

```json
{
  "id": "e542a6e0-696d-4c74-abe1-a0d361f5d355",
  "order_id": "2c642205-5982-44d4-9670-3062934e0b9a",
  "assignment_id": "3882b75a-a12d-49ff-ae54-8450c9068a84",
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
  "arrived_at": "2026-10-29T09:00:11.813861Z",
  "started_at": "2026-10-29T09:00:12.012972Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e542a6e0-696d-4c74-abe1-a0d361f5d355/complete` → **200**

```json
{
  "command_id": "e8f4c56a-571a-430b-b8d2-57966fac94cd",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:00:12Z",
  "cash_received": true
}
```

```json
{
  "id": "e542a6e0-696d-4c74-abe1-a0d361f5d355",
  "order_id": "2c642205-5982-44d4-9670-3062934e0b9a",
  "assignment_id": "3882b75a-a12d-49ff-ae54-8450c9068a84",
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
  "arrived_at": "2026-10-29T09:00:11.813861Z",
  "started_at": "2026-10-29T09:00:12.012972Z",
  "completed_at": "2026-10-29T09:00:12.211203Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/2c642205-5982-44d4-9670-3062934e0b9a` → **200**

```json
{
  "id": "2c642205-5982-44d4-9670-3062934e0b9a",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "adb9933f-067e-44ed-801a-bfc9684a0db3",
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
    "id": "3882b75a-a12d-49ff-ae54-8450c9068a84",
    "order_id": "2c642205-5982-44d4-9670-3062934e0b9a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e542a6e0-696d-4c74-abe1-a0d361f5d355",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:00:09.461464Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2c642205-5982-44d4-9670-3062934e0b9a` → **200**

```json
{
  "id": "2c642205-5982-44d4-9670-3062934e0b9a",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "adb9933f-067e-44ed-801a-bfc9684a0db3",
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
    "id": "3882b75a-a12d-49ff-ae54-8450c9068a84",
    "order_id": "2c642205-5982-44d4-9670-3062934e0b9a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e542a6e0-696d-4c74-abe1-a0d361f5d355",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:00:09.461464Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2c642205-5982-44d4-9670-3062934e0b9a` → **200**

```json
{
  "id": "2c642205-5982-44d4-9670-3062934e0b9a",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "adb9933f-067e-44ed-801a-bfc9684a0db3",
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
    "id": "3882b75a-a12d-49ff-ae54-8450c9068a84",
    "order_id": "2c642205-5982-44d4-9670-3062934e0b9a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e542a6e0-696d-4c74-abe1-a0d361f5d355",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:00:09.461464Z",
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

`GET /api/rider/v1/orders/2c642205-5982-44d4-9670-3062934e0b9a/tip` → **200**

```json
{
  "order_id": "2c642205-5982-44d4-9670-3062934e0b9a",
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
  "available_until": "2026-10-30T09:00:12.211203Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/2c642205-5982-44d4-9670-3062934e0b9a/tip` → **201**

```json
{
  "command_id": "e9c648ad-439b-4dfc-bf05-b5639e75deaa",
  "amount_minor": 2500
}
```

```json
{
  "id": "37fca169-160c-49b5-a1e4-9d0e1458de54",
  "order_id": "2c642205-5982-44d4-9670-3062934e0b9a",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T09:00:15.337445Z"
}
```

`GET /api/rider/v1/orders/2c642205-5982-44d4-9670-3062934e0b9a/tip` → **200**

```json
{
  "order_id": "2c642205-5982-44d4-9670-3062934e0b9a",
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
  "available_until": "2026-10-30T09:00:12.211203Z",
  "open": false,
  "tip": {
    "id": "37fca169-160c-49b5-a1e4-9d0e1458de54",
    "order_id": "2c642205-5982-44d4-9670-3062934e0b9a",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T09:00:15.337445Z"
  }
}
```

`GET /api/rider/v1/orders/2c642205-5982-44d4-9670-3062934e0b9a/tip` → **200**

```json
{
  "order_id": "2c642205-5982-44d4-9670-3062934e0b9a",
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
  "available_until": "2026-10-30T09:00:12.211203Z",
  "open": false,
  "tip": {
    "id": "37fca169-160c-49b5-a1e4-9d0e1458de54",
    "order_id": "2c642205-5982-44d4-9670-3062934e0b9a",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T09:00:15.337445Z"
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
      "id": "d69fe71a-1bed-4cc1-bdb4-23bb5e095e5a",
      "at": "2026-10-29T09:00:12.974879Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "2c642205-5982-44d4-9670-3062934e0b9a",
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
      "id": "b9b681bd-dc8c-4e11-bbf8-abc32eda6b99",
      "at": "2026-10-29T09:00:17.013657Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "2c642205-5982-44d4-9670-3062934e0b9a",
      "counterpart_id": null
    },
    {
      "id": "d69fe71a-1bed-4cc1-bdb4-23bb5e095e5a",
      "at": "2026-10-29T09:00:12.974879Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "2c642205-5982-44d4-9670-3062934e0b9a",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d49586db-996b-4d99-a903-e15fa154b483",
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
  "id": "c421e7ad-07d8-417c-8f70-ad87f0d20b45",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:05:18.266227Z",
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
  "session_id": "0d3609d1-46a3-4b5c-820d-6f3ed9864aea",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUzMTgsImlhdCI6MTc5MzI2NDQxOCwianRpIjoiYTNkZDJiYjAtZTI2YS00ZGRhLTg2NjQtY2ZmZGZjODI1ZmQyIiwic2lkIjoiMGQzNjA5ZDEtNDZhMy00YjVjLTgyMGQtNmYzZWQ5ODY0YWVhIn0.47a_dX6wUqYaSovsK011g2TWbmITB2TV34Y8dCH8POg",
  "access_expires_at": "2026-10-29T09:15:18.664197715Z",
  "refresh_token": "Dsy86o7x26PlXfaac_79CwgcW25TPDd9I6YAaeeSUPU",
  "refresh_expires_at": "2026-10-29T21:00:18.663800536Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380733252810` → **200**

```json
{
  "client_id": "adb9933f-067e-44ed-801a-bfc9684a0db3"
}
```

`POST /api/admin/v1/rider-wallets/adb9933f-067e-44ed-801a-bfc9684a0db3/top-ups` → **201**

```json
{
  "command_id": "8de74a1e-27b7-4dc6-b0ab-bc866619785b",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "adb9933f-067e-44ed-801a-bfc9684a0db3",
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
      "id": "8c7a60f6-17af-4443-b5f6-23384e66e8e0",
      "at": "2026-10-29T09:00:19.015642Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8502c105-5597-4d50-bfae-2a27a12a5a45",
  "quote_id": "c421e7ad-07d8-417c-8f70-ad87f0d20b45",
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
  "id": "78da2639-d37e-49ac-bcb9-178709d67747",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "adb9933f-067e-44ed-801a-bfc9684a0db3",
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
  "created_at": "2026-10-29T09:00:19.217864Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/78da2639-d37e-49ac-bcb9-178709d67747` → **200**

```json
{
  "id": "78da2639-d37e-49ac-bcb9-178709d67747",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "adb9933f-067e-44ed-801a-bfc9684a0db3",
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
  "created_at": "2026-10-29T09:00:19.217864Z",
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
    "id": "82aea263-0eee-4fda-b6ee-c6972fd08530",
    "order_id": "78da2639-d37e-49ac-bcb9-178709d67747",
    "expires_at": "2026-10-29T09:00:34.221467Z",
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

`POST /api/driver/v1/offers/82aea263-0eee-4fda-b6ee-c6972fd08530/accept` → **200**

```json
{
  "command_id": "d9349c32-da88-4759-a23a-4ab4d0b43b69"
}
```

```json
{
  "id": "74626fba-7430-44c5-bb48-7b1b650f7522",
  "order_id": "78da2639-d37e-49ac-bcb9-178709d67747",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8fef325b-9920-4334-9c82-eb0afdbcab2e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8fef325b-9920-4334-9c82-eb0afdbcab2e",
  "order_id": "78da2639-d37e-49ac-bcb9-178709d67747",
  "assignment_id": "74626fba-7430-44c5-bb48-7b1b650f7522",
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

`POST /api/driver/v1/work-sessions/bdf044bd-7692-4979-9f94-c9a07806615d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:00:20Z",
    "sequence": 1793264420141
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bdf044bd-7692-4979-9f94-c9a07806615d",
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
  "last_heartbeat_at": "2026-10-29T09:00:20.161074Z",
  "last_location_at": "2026-10-29T09:00:20.161074Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8fef325b-9920-4334-9c82-eb0afdbcab2e/arrive` → **200**

```json
{
  "command_id": "c5b6ec8f-5f27-4bbc-8fb2-fe5f97bb9c49",
  "expected_version": 0
}
```

```json
{
  "id": "8fef325b-9920-4334-9c82-eb0afdbcab2e",
  "order_id": "78da2639-d37e-49ac-bcb9-178709d67747",
  "assignment_id": "74626fba-7430-44c5-bb48-7b1b650f7522",
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
  "arrived_at": "2026-10-29T09:00:20.349213Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8fef325b-9920-4334-9c82-eb0afdbcab2e/start` → **200**

```json
{
  "command_id": "e7a9968a-1c98-4c5d-8e62-47043f7031c8",
  "expected_version": 1
}
```

```json
{
  "id": "8fef325b-9920-4334-9c82-eb0afdbcab2e",
  "order_id": "78da2639-d37e-49ac-bcb9-178709d67747",
  "assignment_id": "74626fba-7430-44c5-bb48-7b1b650f7522",
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
  "arrived_at": "2026-10-29T09:00:20.349213Z",
  "started_at": "2026-10-29T09:00:20.536766Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8fef325b-9920-4334-9c82-eb0afdbcab2e/complete` → **200**

```json
{
  "command_id": "defeffac-56c5-4d1c-9e58-d52d75862bcd",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:00:20Z",
  "cash_received": true
}
```

```json
{
  "id": "8fef325b-9920-4334-9c82-eb0afdbcab2e",
  "order_id": "78da2639-d37e-49ac-bcb9-178709d67747",
  "assignment_id": "74626fba-7430-44c5-bb48-7b1b650f7522",
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
  "arrived_at": "2026-10-29T09:00:20.349213Z",
  "started_at": "2026-10-29T09:00:20.536766Z",
  "completed_at": "2026-10-29T09:00:20.733324Z",
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
  "client_id": "adb9933f-067e-44ed-801a-bfc9684a0db3",
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
      "id": "8c7a60f6-17af-4443-b5f6-23384e66e8e0",
      "at": "2026-10-29T09:00:19.015642Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
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

`GET /api/rider/v1/orders/78da2639-d37e-49ac-bcb9-178709d67747/tip` → **200**

```json
{
  "order_id": "78da2639-d37e-49ac-bcb9-178709d67747",
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
  "available_until": "2026-10-30T09:00:20.733324Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/78da2639-d37e-49ac-bcb9-178709d67747/tip` → **201**

```json
{
  "command_id": "52d04191-cb10-4b54-ad28-7a5d0245f33e",
  "amount_minor": 2500
}
```

```json
{
  "id": "28ecf112-84d0-4158-958e-91dc83f796ea",
  "order_id": "78da2639-d37e-49ac-bcb9-178709d67747",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T09:00:21.485056Z"
}
```

`GET /api/rider/v1/orders/78da2639-d37e-49ac-bcb9-178709d67747/tip` → **200**

```json
{
  "order_id": "78da2639-d37e-49ac-bcb9-178709d67747",
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
  "available_until": "2026-10-30T09:00:20.733324Z",
  "open": false,
  "tip": {
    "id": "28ecf112-84d0-4158-958e-91dc83f796ea",
    "order_id": "78da2639-d37e-49ac-bcb9-178709d67747",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T09:00:21.485056Z"
  }
}
```

`GET /api/rider/v1/orders/78da2639-d37e-49ac-bcb9-178709d67747/tip` → **200**

```json
{
  "order_id": "78da2639-d37e-49ac-bcb9-178709d67747",
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
  "available_until": "2026-10-30T09:00:20.733324Z",
  "open": false,
  "tip": {
    "id": "28ecf112-84d0-4158-958e-91dc83f796ea",
    "order_id": "78da2639-d37e-49ac-bcb9-178709d67747",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T09:00:21.485056Z"
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
      "id": "14ea9ad2-cc94-417b-b27a-da56e260e876",
      "at": "2026-10-29T09:00:23.071532Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "78da2639-d37e-49ac-bcb9-178709d67747",
      "counterpart_id": null
    },
    {
      "id": "13d8e450-377a-4fc1-a5f7-f15d5014d6a4",
      "at": "2026-10-29T09:00:21.050828Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "78da2639-d37e-49ac-bcb9-178709d67747",
      "counterpart_id": null
    },
    {
      "id": "b9b681bd-dc8c-4e11-bbf8-abc32eda6b99",
      "at": "2026-10-29T09:00:17.013657Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "2c642205-5982-44d4-9670-3062934e0b9a",
      "counterpart_id": null
    },
    {
      "id": "d69fe71a-1bed-4cc1-bdb4-23bb5e095e5a",
      "at": "2026-10-29T09:00:12.974879Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "2c642205-5982-44d4-9670-3062934e0b9a",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bdf044bd-7692-4979-9f94-c9a07806615d",
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
  "last_heartbeat_at": "2026-10-29T09:00:20.161074Z",
  "last_location_at": "2026-10-29T09:00:20.161074Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bdf044bd-7692-4979-9f94-c9a07806615d/close` → **200**

```json
{
  "command_id": "f2a50154-e3db-4827-a689-37f6acf0c5de",
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

Done: card order 78da2639-d37e-49ac-bcb9-178709d67747.

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
  "phone": "+380735108275",
  "device_ref": "sandbox-4014"
}
```

```json
{
  "challenge_id": "20a83701-c8dd-4da1-91a3-495386138327",
  "expires_at": "2026-10-29T09:05:23.829933221Z",
  "resend_available_at": "2026-10-29T09:00:24.829933221Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735108275` → **200**

```json
{
  "phone": "+380735108275",
  "audience": "CLIENT",
  "code": "329826",
  "sent_at": "2026-10-29T09:00:23.831967081Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "20a83701-c8dd-4da1-91a3-495386138327",
  "code": "329826",
  "device_ref": "sandbox-4014"
}
```

```json
{
  "session_id": "93f9ef25-84b3-4aa4-8a03-f548f6de6c72",
  "subject": {
    "type": "CLIENT",
    "id": "7f23356f-f5a6-4091-9929-3d1442f3ec38"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZjIzMzU2Zi1mNWE2LTQwOTEtOTkyOS0zZDE0NDJmM2VjMzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1MzI0LCJpYXQiOjE3OTMyNjQ0MjQsImp0aSI6ImQ0MTY3OWYyLWI2NDItNDg3NS05ODk5LTIxYTZiZjE1NWNlMCIsInNpZCI6IjkzZjllZjI1LTg0YjMtNGFhNC04YTAzLWY1NDhmNmRlNmM3MiJ9.Q8UVtUsI8xLDW5PsnBzOsgou1-dTOaVgZiM4_9mvmhc",
  "access_expires_at": "2026-10-29T09:15:24.034272995Z",
  "refresh_token": "0wZFxXSQZBXEmpH02HttWKN4vfswH1Tp2CPvri1V0Ho",
  "refresh_expires_at": "2026-11-28T09:00:24.033871373Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "00369e37-a59b-4596-9c1f-60ba930f0f52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "937daade-7d44-4f40-bd7f-e6c85d774846",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-937daade-7d44-4f40-bd7f-e6c85d774846",
    "orderDate": "1793264424",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "14298f63beeee9e4e6642ba08f62cdc5",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=937daade-7d44-4f40-bd7f-e6c85d774846",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735108275"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=937daade-7d44-4f40-bd7f-e6c85d774846",
  "created_at": "2026-10-29T09:00:24.233758Z",
  "expires_at": "2026-10-29T09:30:24.233758Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/937daade-7d44-4f40-bd7f-e6c85d774846` → **200**

```json
{
  "id": "937daade-7d44-4f40-bd7f-e6c85d774846",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T09:00:24.233758Z",
  "expires_at": "2026-10-29T09:30:24.233758Z",
  "completed_at": "2026-10-29T09:00:24.419159Z",
  "masked_pan": "41****8368",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "7f23356f-f5a6-4091-9929-3d1442f3ec38",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "7f23356f-f5a6-4091-9929-3d1442f3ec38",
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
      "id": "500ba25f-c180-4585-8587-ea6497a873df",
      "at": "2026-10-29T09:00:25.083964Z",
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
  "client_id": "7f23356f-f5a6-4091-9929-3d1442f3ec38",
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
      "id": "500ba25f-c180-4585-8587-ea6497a873df",
      "at": "2026-10-29T09:00:25.083964Z",
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
  "device_ref": "sandbox-26980"
}
```

```json
{
  "challenge_id": "73edd537-df48-4c03-8df0-ce4cc581b8f1",
  "expires_at": "2026-10-29T09:05:26.161523483Z",
  "resend_available_at": "2026-10-29T09:00:27.161523483Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "732494",
  "sent_at": "2026-10-29T09:00:26.163648041Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "73edd537-df48-4c03-8df0-ce4cc581b8f1",
  "code": "732494",
  "device_ref": "sandbox-26980"
}
```

```json
{
  "session_id": "87b2f42b-d54c-452f-84a4-25257ba50da9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTMyNiwiaWF0IjoxNzkzMjY0NDI2LCJqdGkiOiI4MTVjYmMyYS04MTNmLTQwMDItOWMyZS0yYmJmY2JhY2NmOGIiLCJzaWQiOiI4N2IyZjQyYi1kNTRjLTQ1MmYtODRhNC0yNTI1N2JhNTBkYTkifQ.Sx-2gFGpoiZB_aZGGmtmTwh-j7GRTuWfnG5RQ_zVkTI",
  "access_expires_at": "2026-10-29T09:15:26.365044495Z",
  "refresh_token": "6qZhWYozKtQwgjHKm96a-5ITPzPfQTnxtCe0pNHXlaA",
  "refresh_expires_at": "2026-11-28T09:00:26.36468352Z",
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
  "command_id": "8bb45af1-f895-4380-b103-cbff2fa35cdf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "5b61816e-b494-4656-a233-df9cd9b24098",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-5b61816e-b494-4656-a233-df9cd9b24098",
    "orderDate": "1793264426",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "5a64495ea569366edbfa2ce0bb71d82b",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=5b61816e-b494-4656-a233-df9cd9b24098",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=5b61816e-b494-4656-a233-df9cd9b24098",
  "created_at": "2026-10-29T09:00:26.721444Z",
  "expires_at": "2026-10-29T09:30:26.721444Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/5b61816e-b494-4656-a233-df9cd9b24098` → **200**

```json
{
  "id": "5b61816e-b494-4656-a233-df9cd9b24098",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T09:00:26.721444Z",
  "expires_at": "2026-10-29T09:30:26.721444Z",
  "completed_at": "2026-10-29T09:00:26.90788Z",
  "masked_pan": "41****4798",
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
      "id": "b0b62100-3595-40dd-a5ef-3fc0b2e04d63",
      "at": "2026-10-29T09:00:27.089598Z",
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
  "command_id": "97fdcf2e-1f46-4be6-aca8-3d32baee2e13",
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
  "correlation_id": "4d1957d4-927c-4108-9f45-6b83cf5eeb6c"
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
  "device_ref": "sandbox-16228"
}
```

```json
{
  "challenge_id": "8b0c71d6-28bd-4441-bf68-54e277048be7",
  "expires_at": "2026-10-29T09:05:27.480150379Z",
  "resend_available_at": "2026-10-29T09:00:28.480150379Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "351968",
  "sent_at": "2026-10-29T09:00:27.482917937Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8b0c71d6-28bd-4441-bf68-54e277048be7",
  "code": "351968",
  "device_ref": "sandbox-16228"
}
```

```json
{
  "session_id": "08c481df-79e0-496f-826a-3c154a243e0e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTMyNywiaWF0IjoxNzkzMjY0NDI3LCJqdGkiOiJjNWNkNWVjNS0yMGE5LTRiMmItYjI3My0xNjhkY2RmNmMwYmUiLCJzaWQiOiIwOGM0ODFkZi03OWUwLTQ5NmYtODI2YS0zYzE1NGEyNDNlMGUifQ.dOnxeuztku-ZeNse7H5H5-skG0g8dqtwSu_MKQZZXRg",
  "access_expires_at": "2026-10-29T09:15:27.686958649Z",
  "refresh_token": "zA08M61JFc3cvBc4zu2yvRjy-T5VrqJaSmMbqJrEKHs",
  "refresh_expires_at": "2026-11-28T09:00:27.686443426Z",
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
  "command_id": "d2db0901-7d5b-4c2d-8352-2f24de0a0edd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:00:28Z",
    "sequence": 1793264428390
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8b9a91d4-b832-4fa4-9b0b-1c7a0c1c46a0",
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
  "last_heartbeat_at": "2026-10-29T09:00:28.055469Z",
  "last_location_at": "2026-10-29T09:00:28.055469Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631226662",
  "device_ref": "sandbox-21032"
}
```

```json
{
  "challenge_id": "13962d3b-236a-4dab-8137-f4af3635245b",
  "expires_at": "2026-10-29T09:05:28.239986987Z",
  "resend_available_at": "2026-10-29T09:00:29.239986987Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631226662` → **200**

```json
{
  "phone": "+380631226662",
  "audience": "CLIENT",
  "code": "598467",
  "sent_at": "2026-10-29T09:00:28.241988508Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "13962d3b-236a-4dab-8137-f4af3635245b",
  "code": "598467",
  "device_ref": "sandbox-21032"
}
```

```json
{
  "session_id": "605995d3-379c-48ae-9839-92f60b79ed89",
  "subject": {
    "type": "CLIENT",
    "id": "bba94804-f8ba-4611-b846-7ca5b0d20b0c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmE5NDgwNC1mOGJhLTQ2MTEtYjg0Ni03Y2E1YjBkMjBiMGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1MzI4LCJpYXQiOjE3OTMyNjQ0MjgsImp0aSI6ImFjMjYwYzM1LTcxZmUtNDEzOC1iZTVmLWE1ZGIzNjFkNzU0NyIsInNpZCI6IjYwNTk5NWQzLTM3OWMtNDhhZS05ODM5LTkyZjYwYjc5ZWQ4OSJ9.HXFtJRHPhIdC_AgFoX-jc_CiBOgtNGOvAELn1MF7aUY",
  "access_expires_at": "2026-10-29T09:15:28.445019688Z",
  "refresh_token": "N1YJqV9XG9qcWw6YY2CXOiWnCHfDpQodEYnRKXMrKxY",
  "refresh_expires_at": "2026-11-28T09:00:28.444642328Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a2dceccc-372b-413f-a547-c8a77ed4f4fe",
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
  "id": "24103f67-b1b7-46c9-a936-34b091e0d5ef",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:05:28.628232Z",
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
  "command_id": "9f722c7f-eb48-4869-b39f-254727d4708c",
  "quote_id": "24103f67-b1b7-46c9-a936-34b091e0d5ef",
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
  "id": "01582003-73ea-4d83-9c70-2e3c1779b8c8",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bba94804-f8ba-4611-b846-7ca5b0d20b0c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T09:00:28.830891Z",
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
    "id": "16845a17-ff71-4aa8-87fd-2df697a31e8c",
    "order_id": "01582003-73ea-4d83-9c70-2e3c1779b8c8",
    "expires_at": "2026-10-29T09:00:43.833663Z",
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

`POST /api/driver/v1/offers/16845a17-ff71-4aa8-87fd-2df697a31e8c/accept` → **200**

```json
{
  "command_id": "93b10720-492a-4675-bbf6-4d76426200f9"
}
```

```json
{
  "id": "a8ec8eaa-cb63-405e-9e0a-cf785b4e0e84",
  "order_id": "01582003-73ea-4d83-9c70-2e3c1779b8c8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e41d1fc2-87a0-4f07-ae55-8a52fcb67105",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e41d1fc2-87a0-4f07-ae55-8a52fcb67105",
  "order_id": "01582003-73ea-4d83-9c70-2e3c1779b8c8",
  "assignment_id": "a8ec8eaa-cb63-405e-9e0a-cf785b4e0e84",
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

`POST /api/driver/v1/work-sessions/8b9a91d4-b832-4fa4-9b0b-1c7a0c1c46a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:00:29Z",
    "sequence": 1793264429604
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8b9a91d4-b832-4fa4-9b0b-1c7a0c1c46a0",
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
  "last_heartbeat_at": "2026-10-29T09:00:29.62095Z",
  "last_location_at": "2026-10-29T09:00:29.62095Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e41d1fc2-87a0-4f07-ae55-8a52fcb67105/arrive` → **200**

```json
{
  "command_id": "431a00b1-fbea-4d52-ae74-299921698273",
  "expected_version": 0
}
```

```json
{
  "id": "e41d1fc2-87a0-4f07-ae55-8a52fcb67105",
  "order_id": "01582003-73ea-4d83-9c70-2e3c1779b8c8",
  "assignment_id": "a8ec8eaa-cb63-405e-9e0a-cf785b4e0e84",
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
  "arrived_at": "2026-10-29T09:00:29.806504Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e41d1fc2-87a0-4f07-ae55-8a52fcb67105/start` → **200**

```json
{
  "command_id": "89847765-bd11-4dc2-a189-2954d9c68bac",
  "expected_version": 1
}
```

```json
{
  "id": "e41d1fc2-87a0-4f07-ae55-8a52fcb67105",
  "order_id": "01582003-73ea-4d83-9c70-2e3c1779b8c8",
  "assignment_id": "a8ec8eaa-cb63-405e-9e0a-cf785b4e0e84",
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
  "arrived_at": "2026-10-29T09:00:29.806504Z",
  "started_at": "2026-10-29T09:00:29.997937Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e41d1fc2-87a0-4f07-ae55-8a52fcb67105/complete` → **200**

```json
{
  "command_id": "d610876d-fc44-443a-bb71-06ca62b88b8a",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:00:30Z",
  "cash_received": false
}
```

```json
{
  "id": "e41d1fc2-87a0-4f07-ae55-8a52fcb67105",
  "order_id": "01582003-73ea-4d83-9c70-2e3c1779b8c8",
  "assignment_id": "a8ec8eaa-cb63-405e-9e0a-cf785b4e0e84",
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
  "arrived_at": "2026-10-29T09:00:29.806504Z",
  "started_at": "2026-10-29T09:00:29.997937Z",
  "completed_at": "2026-10-29T09:00:30.197518Z",
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
  "session_id": "a6fcbc26-af2e-400a-8a89-3715281e1d62",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUzMzAsImlhdCI6MTc5MzI2NDQzMCwianRpIjoiNmRiZTVmMzgtMjY3YS00MmE5LWE5ZTktNzY2MWQ5MTQ1ZWM3Iiwic2lkIjoiYTZmY2JjMjYtYWYyZS00MDBhLThhODktMzcxNTI4MWUxZDYyIn0.pBsyMwoavd56LbVbUavsMFxPEoMXUyELHmMVOzhRUiA",
  "access_expires_at": "2026-10-29T09:15:30.587740847Z",
  "refresh_token": "_Ilm3HqUwjk1Y7HPHA2z--bQtPZOb4iSAucXht6tJtM",
  "refresh_expires_at": "2026-10-29T21:00:30.587362928Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/01582003-73ea-4d83-9c70-2e3c1779b8c8/cash-dispute` → **404**

```json
{
  "instance": "/api/admin/v1/orders/01582003-73ea-4d83-9c70-2e3c1779b8c8/cash-dispute",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "83364bca-aa7d-4360-a94c-2bdabedb40b1"
}
```

`GET /api/admin/v1/orders/01582003-73ea-4d83-9c70-2e3c1779b8c8/cash-dispute` → **200**

```json
{
  "order_id": "01582003-73ea-4d83-9c70-2e3c1779b8c8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "bba94804-f8ba-4611-b846-7ca5b0d20b0c",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T09:00:31.127802Z",
  "decide_by": "2026-11-12T09:00:31.127802Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T09:00:31.127802Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "01582003-73ea-4d83-9c70-2e3c1779b8c8",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "bba94804-f8ba-4611-b846-7ca5b0d20b0c",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T09:00:31.127802Z",
      "decide_by": "2026-11-12T09:00:31.127802Z",
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

`POST /api/admin/v1/orders/01582003-73ea-4d83-9c70-2e3c1779b8c8/cash-dispute/decide` → **400**

```json
{
  "command_id": "1e0d83d3-6741-48ef-8dbc-a37102796681",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/01582003-73ea-4d83-9c70-2e3c1779b8c8/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a933a47e-6415-4cfd-959c-f193e11fc1c5",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/01582003-73ea-4d83-9c70-2e3c1779b8c8/cash-dispute/decide` → **200**

```json
{
  "command_id": "5c53d11e-438c-4a67-acc7-178c3f073dbd",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "01582003-73ea-4d83-9c70-2e3c1779b8c8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "bba94804-f8ba-4611-b846-7ca5b0d20b0c",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T09:00:31.127802Z",
  "decide_by": "2026-11-12T09:00:31.127802Z",
  "decision": "PAY_DRIVER",
  "decided_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T09:00:32.541812Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/01582003-73ea-4d83-9c70-2e3c1779b8c8/cash-dispute/decide` → **409**

```json
{
  "command_id": "5378b456-5aa0-492b-b1a6-d09d4fcd637a",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/01582003-73ea-4d83-9c70-2e3c1779b8c8/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "73992ede-dd0f-4aef-8f31-64b66fae902f"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8b9a91d4-b832-4fa4-9b0b-1c7a0c1c46a0",
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
  "last_heartbeat_at": "2026-10-29T09:00:29.62095Z",
  "last_location_at": "2026-10-29T09:00:29.62095Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8b9a91d4-b832-4fa4-9b0b-1c7a0c1c46a0/close` → **200**

```json
{
  "command_id": "f811ee00-ec56-4904-9f40-9bd3ea32eabd",
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
  "session_id": "636edf72-8990-4d00-965b-cecdf679a4b6",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUzMzMsImlhdCI6MTc5MzI2NDQzMywianRpIjoiMDRkOTAwZjItZmE2MC00ZDE1LWIyMzItNTdiZGJiNjJiZjc2Iiwic2lkIjoiNjM2ZWRmNzItODk5MC00ZDAwLTk2NWItY2VjZGY2NzlhNGI2In0.VhX3qCaZzgEBiK6VMTp8WJ95jN3IL6JTzG3nJWqhb1w",
  "access_expires_at": "2026-10-29T09:15:33.510567617Z",
  "refresh_token": "FMIj2jx4g-Kk05V31XEB2RUN_yqnuBlcQTqFduJx7z8",
  "refresh_expires_at": "2026-10-29T21:00:33.510233553Z",
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
  "phone": "+48600962838",
  "device_ref": "sandbox-27326"
}
```

```json
{
  "challenge_id": "8f1da40f-98b0-45eb-b63a-cb73e8371b48",
  "expires_at": "2026-10-29T09:05:34.056442917Z",
  "resend_available_at": "2026-10-29T09:00:35.056442917Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600962838` → **200**

```json
{
  "phone": "+48600962838",
  "audience": "CLIENT",
  "code": "207229",
  "sent_at": "2026-10-29T09:00:34.05856475Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f1da40f-98b0-45eb-b63a-cb73e8371b48",
  "code": "207229",
  "device_ref": "sandbox-27326"
}
```

```json
{
  "session_id": "6bd16f86-3a09-4160-a704-e08ed3e28e50",
  "subject": {
    "type": "CLIENT",
    "id": "01533040-aea8-4556-a8ac-b25c17bad39f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMTUzMzA0MC1hZWE4LTQ1NTYtYThhYy1iMjVjMTdiYWQzOWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1MzM0LCJpYXQiOjE3OTMyNjQ0MzQsImp0aSI6IjIyZjZjZDE5LWE0YjgtNDA4OC05Y2U3LTA2MzQxYmE5NjJjNiIsInNpZCI6IjZiZDE2Zjg2LTNhMDktNDE2MC1hNzA0LWUwOGVkM2UyOGU1MCJ9.QEn6ncO1BOW7lNzFFbomTUmYRwK0vQsXuqh00Mz9TpU",
  "access_expires_at": "2026-10-29T09:15:34.266461003Z",
  "refresh_token": "_rsRG7JPF6dt0cIrd4wCbvSTciOtfpJsuSceN8AYcXk",
  "refresh_expires_at": "2026-11-28T09:00:34.266024203Z",
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
  "command_id": "636d2bfd-7c70-4d26-9f71-155240530527",
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
  "correlation_id": "e5ce295d-2737-4c78-a332-193fcb3d83f2",
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
  "command_id": "c6b95656-f2b3-4ade-aa51-086d6a753eb6",
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
  "paused_at": "2026-10-29T09:00:34.987605977Z",
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
  "command_id": "40393dd5-9b54-448a-8d8e-2feb051d19d7",
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
  "id": "0d37c607-1b8a-43ac-891a-6d9a735f6747",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:05:35.365962Z",
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
  "command_id": "47b54187-3976-4984-8f1a-fc8692ee86cf",
  "quote_id": "0d37c607-1b8a-43ac-891a-6d9a735f6747",
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
  "correlation_id": "38a9e272-d95c-4ff8-b26c-becb8ce8a10a"
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
  "paused_at": "2026-10-29T09:00:34.987606Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "dfa43e89-3568-4fba-8f61-1229e77ef94f",
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
  "command_id": "a02abf0e-fbe0-4022-b621-be635e4de138",
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
  "command_id": "e615ebf2-4550-4b34-b202-af967df5eb1a",
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
  "id": "5a650bcf-e8fc-46f6-9b46-e5feefd08f51",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:05:36.478982Z",
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
  "command_id": "157c47e6-514c-4cae-bc5c-67eddf17f009",
  "quote_id": "5a650bcf-e8fc-46f6-9b46-e5feefd08f51",
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
  "correlation_id": "f601c023-6e38-442f-bd7b-6a2f31923136"
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
  "command_id": "2ff3ff0b-11be-452a-ba01-31498d27a901",
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
  "command_id": "184ebaf3-f709-41a5-b8a5-bd026a2c576a",
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
  "id": "06e981f2-c8e8-408d-9503-1c058179fea7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:05:37.226614Z",
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
  "command_id": "91dda16e-255a-4825-aa37-5c49872b0f44",
  "quote_id": "06e981f2-c8e8-408d-9503-1c058179fea7",
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
  "correlation_id": "0259f214-8d2a-41ef-aec6-34e1a1d033d0"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "6c58fa60-dacb-4576-b665-b065cfa36ff7",
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
  "correlation_id": "b411db8e-6bcb-41ec-9515-8c012afc9775"
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
  "command_id": "d0beb4cc-aa25-46b7-a41b-c6c16b34cefd",
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
  "phone": "+380673798803",
  "device_ref": "sandbox-19834"
}
```

```json
{
  "challenge_id": "1bc1182d-d521-44e6-b3bd-c8bb88c3cf14",
  "expires_at": "2026-10-29T09:05:38.221335663Z",
  "resend_available_at": "2026-10-29T09:00:39.221335663Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673798803` → **200**

```json
{
  "phone": "+380673798803",
  "audience": "CLIENT",
  "code": "808866",
  "sent_at": "2026-10-29T09:00:38.223456389Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1bc1182d-d521-44e6-b3bd-c8bb88c3cf14",
  "code": "808866",
  "device_ref": "sandbox-19834"
}
```

```json
{
  "session_id": "eb352d77-3caf-495c-9ef2-64f494b59a50",
  "subject": {
    "type": "CLIENT",
    "id": "a410cfe2-2acd-4a6d-8d7a-fcfe1f4b2f0a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDEwY2ZlMi0yYWNkLTRhNmQtOGQ3YS1mY2ZlMWY0YjJmMGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1MzM4LCJpYXQiOjE3OTMyNjQ0MzgsImp0aSI6ImY1MjI3MDhkLWUyNjUtNGQ2ZS1iNzhhLTI1Mzg2ZTgwZTZiNCIsInNpZCI6ImViMzUyZDc3LTNjYWYtNDk1Yy05ZWYyLTY0ZjQ5NGI1OWE1MCJ9.5jpThGtLtT7u-YNhEpd-tuRearYQTdmtL3SUWYWX6Cs",
  "access_expires_at": "2026-10-29T09:15:38.428985123Z",
  "refresh_token": "_BLRKwj49RK94FlKHMW78stEUy4nXo3x4hHzEen8f6c",
  "refresh_expires_at": "2026-11-28T09:00:38.42857677Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a410cfe2-2acd-4a6d-8d7a-fcfe1f4b2f0a",
  "session_id": "eb352d77-3caf-495c-9ef2-64f494b59a50",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1aed811f-f777-41ca-870c-ff6b2053ad20",
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
  "id": "f9215c45-0725-486b-b1c0-b9cd346f22a2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:05:38.787761Z",
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
  "challenge_id": "979cf013-3be8-4d87-bd22-12badf12bdda",
  "expires_at": "2026-10-29T09:05:40.975360427Z",
  "resend_available_at": "2026-10-29T09:00:41.975360427Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673798803` → **200**

```json
{
  "phone": "+380673798803",
  "audience": "CLIENT",
  "code": "335135",
  "sent_at": "2026-10-29T09:00:40.977090483Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "b5b14dd3-7250-40cc-a158-fe1d1316c701",
  "challenge_id": "979cf013-3be8-4d87-bd22-12badf12bdda",
  "otp_code": "335135"
}
```

```json
{
  "client_id": "a410cfe2-2acd-4a6d-8d7a-fcfe1f4b2f0a",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T09:00:41.18611303Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "1b929438-ba37-4ea4-8de8-bce18ce6616e",
  "quote_id": "f9215c45-0725-486b-b1c0-b9cd346f22a2",
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
  "correlation_id": "1f20296a-8172-4ff3-acdd-bd0ce8498c2c"
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
  "session_id": "d7e5f562-94ee-431b-b096-e7bb607ad440",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUzNDEsImlhdCI6MTc5MzI2NDQ0MSwianRpIjoiNGQzNWYxMjItMTEwZS00MWJmLWI5YTItYjUwNDYyZDhkMTBkIiwic2lkIjoiZDdlNWY1NjItOTRlZS00MzFiLWIwOTYtZTdiYjYwN2FkNDQwIn0.Na5KOhLBKvCNmwoGplLdsx-b09oGy8FYHgcXLHqnTcQ",
  "access_expires_at": "2026-10-29T09:15:41.777062242Z",
  "refresh_token": "-nmns7RE8C_dpIA6HsYXIGJvSMYxjErZN4J1IfIcMcc",
  "refresh_expires_at": "2026-10-29T21:00:41.776711112Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "a410cfe2-2acd-4a6d-8d7a-fcfe1f4b2f0a",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T09:00:41.186113Z",
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

`POST /api/admin/v1/client-deletions/a410cfe2-2acd-4a6d-8d7a-fcfe1f4b2f0a/complete` → **200**

```json
{
  "command_id": "4529fb9b-a273-47eb-af5e-9ac7550b535f",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "a410cfe2-2acd-4a6d-8d7a-fcfe1f4b2f0a",
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
  "correlation_id": "f633420e-40a3-4c37-a360-9a6ce2383a53"
}
```

Done: client a410cfe2-2acd-4a6d-8d7a-fcfe1f4b2f0a anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669736867",
  "device_ref": "sandbox-24655"
}
```

```json
{
  "challenge_id": "56d110e2-a0b3-42ae-badb-9ce5010da293",
  "expires_at": "2026-10-29T09:05:42.555069429Z",
  "resend_available_at": "2026-10-29T09:00:43.555069429Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669736867` → **200**

```json
{
  "phone": "+380669736867",
  "audience": "CLIENT",
  "code": "130092",
  "sent_at": "2026-10-29T09:00:42.557200291Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "56d110e2-a0b3-42ae-badb-9ce5010da293",
  "code": "130092",
  "device_ref": "sandbox-24655"
}
```

```json
{
  "session_id": "77271e5b-e295-49f8-9b8a-ccc49c6aaf59",
  "subject": {
    "type": "CLIENT",
    "id": "82cd1cb7-3736-4df6-ab84-f52e08e28e74"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MmNkMWNiNy0zNzM2LTRkZjYtYWI4NC1mNTJlMDhlMjhlNzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1MzQyLCJpYXQiOjE3OTMyNjQ0NDIsImp0aSI6ImFmM2NiMGNjLTI5YTQtNDVjOC1iYjA1LWJmYTYyYTU3MTc4ZiIsInNpZCI6Ijc3MjcxZTViLWUyOTUtNDlmOC05YjhhLWNjYzQ5YzZhYWY1OSJ9.iZMheCnlVdyffty3PbOz2TOtaCVuasjYnJlxcZQQWe8",
  "access_expires_at": "2026-10-29T09:15:42.761337151Z",
  "refresh_token": "8RxgFr4ItX134KEkAjZil5ZFWT-hbgOyvumpx5MAHac",
  "refresh_expires_at": "2026-11-28T09:00:42.760983528Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "82cd1cb7-3736-4df6-ab84-f52e08e28e74",
  "session_id": "77271e5b-e295-49f8-9b8a-ccc49c6aaf59",
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
  "session_id": "efdde6e2-6a9d-4391-aa06-182531b2ef42",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUzNDMsImlhdCI6MTc5MzI2NDQ0MywianRpIjoiZjA4N2MxOTYtNDFkMi00ZDM5LWE5YTctMzk0NjlhYzY2MmZkIiwic2lkIjoiZWZkZGU2ZTItNmE5ZC00MzkxLWFhMDYtMTgyNTMxYjJlZjQyIn0.XQLm93i-93wRIN6YGy6u41lvlEPMft6Yhpngcp5yoCA",
  "access_expires_at": "2026-10-29T09:15:43.314706953Z",
  "refresh_token": "ffodjd1XHzcjDwxjinhj8f5kvwcSPjPn8zolJeJNwuw",
  "refresh_expires_at": "2026-10-29T21:00:43.314397075Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=9736867&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "82cd1cb7-3736-4df6-ab84-f52e08e28e74",
      "phone": "+380669736867",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T09:00:42.759543Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/82cd1cb7-3736-4df6-ab84-f52e08e28e74` → **200**

```json
{
  "client": {
    "id": "82cd1cb7-3736-4df6-ab84-f52e08e28e74",
    "phone": "+380669736867",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T09:00:42.759543Z",
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

`POST /api/admin/v1/clients/82cd1cb7-3736-4df6-ab84-f52e08e28e74/block` → **400**

```json
{
  "command_id": "2a1d22a9-f38b-4051-87ce-bda3028d8d06",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/82cd1cb7-3736-4df6-ab84-f52e08e28e74/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "779eb9c0-61c0-497f-a4de-078d6f4fb33d",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/82cd1cb7-3736-4df6-ab84-f52e08e28e74/block` → **200**

```json
{
  "command_id": "4468636d-2ff2-48c7-9c1d-8c5c1ea0f078",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "82cd1cb7-3736-4df6-ab84-f52e08e28e74",
  "phone": "+380669736867",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T09:00:42.759543Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T09:00:44.089546Z",
    "by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
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
  "correlation_id": "1953adfa-7bea-40ff-82b8-65262687bc3c"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669736867",
  "device_ref": "sandbox-8016"
}
```

```json
{
  "challenge_id": "40b59671-9dbf-47f0-a269-610696f87354",
  "expires_at": "2026-10-29T09:05:46.466718251Z",
  "resend_available_at": "2026-10-29T09:00:47.466718251Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669736867` → **200**

```json
{
  "phone": "+380669736867",
  "audience": "CLIENT",
  "code": "115059",
  "sent_at": "2026-10-29T09:00:46.468561731Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "40b59671-9dbf-47f0-a269-610696f87354",
  "code": "115059",
  "device_ref": "sandbox-8016"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "e9da9bf3-04a6-46f6-a66f-081ec727ff29"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/82cd1cb7-3736-4df6-ab84-f52e08e28e74` → **200**

```json
{
  "client": {
    "id": "82cd1cb7-3736-4df6-ab84-f52e08e28e74",
    "phone": "+380669736867",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T09:00:42.759543Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T09:00:44.089546Z",
      "by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
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

`POST /api/admin/v1/clients/82cd1cb7-3736-4df6-ab84-f52e08e28e74/unblock` → **200**

```json
{
  "command_id": "1d05d50d-ba40-4b5f-9627-4ca7452c356f",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "82cd1cb7-3736-4df6-ab84-f52e08e28e74",
  "phone": "+380669736867",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T09:00:42.759543Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669736867",
  "device_ref": "sandbox-26932"
}
```

```json
{
  "challenge_id": "40c2edc2-fc05-42b8-b0f2-6591982ab4d8",
  "expires_at": "2026-10-29T09:05:49.248773339Z",
  "resend_available_at": "2026-10-29T09:00:50.248773339Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669736867` → **200**

```json
{
  "phone": "+380669736867",
  "audience": "CLIENT",
  "code": "638433",
  "sent_at": "2026-10-29T09:00:49.250907951Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "40c2edc2-fc05-42b8-b0f2-6591982ab4d8",
  "code": "638433",
  "device_ref": "sandbox-26932"
}
```

```json
{
  "session_id": "3498f2f4-b13b-47fe-b065-5d5032b6c40d",
  "subject": {
    "type": "CLIENT",
    "id": "82cd1cb7-3736-4df6-ab84-f52e08e28e74"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MmNkMWNiNy0zNzM2LTRkZjYtYWI4NC1mNTJlMDhlMjhlNzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1MzQ5LCJpYXQiOjE3OTMyNjQ0NDksImp0aSI6ImE4ZmFkYTFlLThhYTktNDBmMC1hMDFiLWNmMTNmOWVlYmI0MiIsInNpZCI6IjM0OThmMmY0LWIxM2ItNDdmZS1iMDY1LTVkNTAzMmI2YzQwZCJ9.9tW5-dU7Wejz3YCdVG0hph3b2Nc8KhqQ_D0SrPQjgRk",
  "access_expires_at": "2026-10-29T09:15:49.46689629Z",
  "refresh_token": "tEl5jyxvez6wk6cAEmZwYGxAvybc4VWq_F8ADz47xoU",
  "refresh_expires_at": "2026-11-28T09:00:49.466383132Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "82cd1cb7-3736-4df6-ab84-f52e08e28e74",
  "session_id": "3498f2f4-b13b-47fe-b065-5d5032b6c40d",
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
  "phone": "+380661438179",
  "device_ref": "sandbox-14371"
}
```

```json
{
  "challenge_id": "ebb83285-e490-43a4-b008-42d8f7e75ff5",
  "expires_at": "2026-10-29T09:05:49.837880886Z",
  "resend_available_at": "2026-10-29T09:00:50.837880886Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380661438179` → **200**

```json
{
  "phone": "+380661438179",
  "audience": "CLIENT",
  "code": "369116",
  "sent_at": "2026-10-29T09:00:49.839814345Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ebb83285-e490-43a4-b008-42d8f7e75ff5",
  "code": "369116",
  "device_ref": "sandbox-14371"
}
```

```json
{
  "session_id": "f6421351-c199-4817-aae0-c87806fedb2c",
  "subject": {
    "type": "CLIENT",
    "id": "d1fc709f-8287-4ef0-82b0-3046efb048f5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWZjNzA5Zi04Mjg3LTRlZjAtODJiMC0zMDQ2ZWZiMDQ4ZjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1MzUwLCJpYXQiOjE3OTMyNjQ0NTAsImp0aSI6ImU2ZWNlODY1LTRkZjYtNDAxNi04YjczLWJkMzQ1ZDI1MTYyMiIsInNpZCI6ImY2NDIxMzUxLWMxOTktNDgxNy1hYWUwLWM4NzgwNmZlZGIyYyJ9.P-dmJr_iFPKdree3pzF3vEX0et0OnGyk6iGNcjzRTh8",
  "access_expires_at": "2026-10-29T09:15:50.043190941Z",
  "refresh_token": "91y-GOmVWJLCSBMNkhhhDeq4Xneca3e_mdqeyfjKyTI",
  "refresh_expires_at": "2026-11-28T09:00:50.042810978Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "412ba32c-7a0a-480b-9edb-2abaf2a559b8",
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
  "id": "7667da77-2e82-4592-a4af-fd022c65e603",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:05:50.228063Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 683f0cb4-27a5-4e60-88ab-75e757bea076) → **201**

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
  "session_id": "90458d95-7250-4246-99f4-fb6c12a4f4f6",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUzNTAsImlhdCI6MTc5MzI2NDQ1MCwianRpIjoiOGQxYTA5NjctMDg2Yy00OGUzLWFlODYtNTEzNTBiNzA1YTRkIiwic2lkIjoiOTA0NThkOTUtNzI1MC00MjQ2LTk5ZjQtZmI2YzEyYTRmNGY2In0.ZFRlZFWPkgi2Pm9NXMRh9jV7423i2Bl_FEq2gGxrdRQ",
  "access_expires_at": "2026-10-29T09:15:50.639659455Z",
  "refresh_token": "LhjhkkOj7Peb3CqKl2rncZRol-GMe5_pS-6qRv6lFe0",
  "refresh_expires_at": "2026-10-29T21:00:50.639223283Z",
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
  "session_id": "63c09f2b-940d-45dd-8918-83cb6b312f3e",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUzNTEsImlhdCI6MTc5MzI2NDQ1MSwianRpIjoiOGRiYmE2YTEtZTdjZC00OWViLWJlYTUtNzJhMDU3YmIwYTkxIiwic2lkIjoiNjNjMDlmMmItOTQwZC00NWRkLTg5MTgtODNjYjZiMzEyZjNlIn0.0bhEl6Wcwue4PRdSG9W1RD8wi1WZMWY2zDoDL76ANDo",
  "access_expires_at": "2026-10-29T09:15:51.030089624Z",
  "refresh_token": "vbrE-wftXhQjWN9SKDButhC59auPaIX-jsUtD0ERhl0",
  "refresh_expires_at": "2026-10-29T21:00:51.029734518Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4904c5b1-4715-4861-9092-605cafc0f0e1/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T09:00:50.40873Z",
      "actor": {
        "type": "CLIENT",
        "id": "d1fc709f-8287-4ef0-82b0-3046efb048f5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4904c5b1-4715-4861-9092-605cafc0f0e1",
        "quote_id": "7667da77-2e82-4592-a4af-fd022c65e603",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "683f0cb4-27a5-4e60-88ab-75e757bea076"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T09:00:50.410172Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4904c5b1-4715-4861-9092-605cafc0f0e1",
        "attempt_id": "d3f1fb16-33a9-4bce-bb88-845e4895452d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "683f0cb4-27a5-4e60-88ab-75e757bea076"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T09:00:50.414546Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4904c5b1-4715-4861-9092-605cafc0f0e1",
        "attempt_id": "d3f1fb16-33a9-4bce-bb88-845e4895452d"
      },
      "correlation_id": "683f0cb4-27a5-4e60-88ab-75e757bea076"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "d3f1fb16-33a9-4bce-bb88-845e4895452d",
        "generation": 1,
        "started_at": "2026-10-29T09:00:50.409584Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T09:00:50.414546Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T09:00:50.410547Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/683f0cb4-27a5-4e60-88ab-75e757bea076` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "4904c5b1-4715-4861-9092-605cafc0f0e1:0",
      "order_id": "4904c5b1-4715-4861-9092-605cafc0f0e1",
      "at": "2026-10-29T09:00:50.40873Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "4904c5b1-4715-4861-9092-605cafc0f0e1:1",
      "order_id": "4904c5b1-4715-4861-9092-605cafc0f0e1",
      "at": "2026-10-29T09:00:50.410172Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "4904c5b1-4715-4861-9092-605cafc0f0e1:2",
      "order_id": "4904c5b1-4715-4861-9092-605cafc0f0e1",
      "at": "2026-10-29T09:00:50.414546Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/df3f42f0-f987-40bb-bc7f-2e97dfcfc367` → **200**

```json
{
  "found": []
}
```

Done: request 683f0cb4-27a5-4e60-88ab-75e757bea076 — order 4904c5b1-4715-4861-9092-605cafc0f0e1 found by its id.

`GET /api/rider/v1/orders/4904c5b1-4715-4861-9092-605cafc0f0e1` → **200**

```json
{
  "id": "4904c5b1-4715-4861-9092-605cafc0f0e1",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d1fc709f-8287-4ef0-82b0-3046efb048f5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:00:50.408339Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4904c5b1-4715-4861-9092-605cafc0f0e1/cancel` → **200**

```json
{
  "command_id": "fa0b3021-57e8-4b5e-9436-b4928e04cb3d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4904c5b1-4715-4861-9092-605cafc0f0e1",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d1fc709f-8287-4ef0-82b0-3046efb048f5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T09:00:50.408339Z",
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
  "phone": "+380637850302",
  "device_ref": "sandbox-19428"
}
```

```json
{
  "challenge_id": "8bd29f1e-caab-4b7f-a3fd-62fea7967d92",
  "expires_at": "2026-10-29T09:05:52.159342954Z",
  "resend_available_at": "2026-10-29T09:00:53.159342954Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637850302` → **200**

```json
{
  "phone": "+380637850302",
  "audience": "CLIENT",
  "code": "978262",
  "sent_at": "2026-10-29T09:00:52.161689923Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8bd29f1e-caab-4b7f-a3fd-62fea7967d92",
  "code": "978262",
  "device_ref": "sandbox-19428"
}
```

```json
{
  "session_id": "30ecc951-d924-4d12-8284-54a08897ebda",
  "subject": {
    "type": "CLIENT",
    "id": "28571a83-a84a-451c-833f-68e1fc8912f4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyODU3MWE4My1hODRhLTQ1MWMtODMzZi02OGUxZmM4OTEyZjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1MzUyLCJpYXQiOjE3OTMyNjQ0NTIsImp0aSI6ImUxZDU5YTA4LTk5YzYtNDQwNi1hNWI1LWVhYjBlN2UzZGVjMyIsInNpZCI6IjMwZWNjOTUxLWQ5MjQtNGQxMi04Mjg0LTU0YTA4ODk3ZWJkYSJ9.WsMJEgmdH6i1xma5yG2lZ_m__tJkN3Oc9ua7gQkHN0s",
  "access_expires_at": "2026-10-29T09:15:52.365427019Z",
  "refresh_token": "KI5zywTawChax1kofODGK1fptDqHBWET3BNnJAKSpJQ",
  "refresh_expires_at": "2026-11-28T09:00:52.365009619Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "daab8afe-25bc-44ee-af9e-8e4797084c4a",
  "expires_at": "2026-10-29T09:05:54.54298668Z",
  "resend_available_at": "2026-10-29T09:00:55.54298668Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637850302` → **200**

```json
{
  "phone": "+380637850302",
  "audience": "CLIENT",
  "code": "620688",
  "sent_at": "2026-10-29T09:00:54.544732879Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "8e2140a7-b717-4ee8-b7e2-b9750cb3eec7",
  "challenge_id": "daab8afe-25bc-44ee-af9e-8e4797084c4a",
  "otp_code": "620688"
}
```

```json
{
  "id": "b4372a92-e0c7-446b-82f7-9eb2fb9261c0",
  "state": "PENDING",
  "created_at": "2026-10-29T09:00:54.749626Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/b4372a92-e0c7-446b-82f7-9eb2fb9261c0` → **200**

```json
{
  "id": "b4372a92-e0c7-446b-82f7-9eb2fb9261c0",
  "state": "PENDING",
  "created_at": "2026-10-29T09:00:54.749626Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b4372a92-e0c7-446b-82f7-9eb2fb9261c0` → **200**

```json
{
  "id": "b4372a92-e0c7-446b-82f7-9eb2fb9261c0",
  "state": "PENDING",
  "created_at": "2026-10-29T09:00:54.749626Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b4372a92-e0c7-446b-82f7-9eb2fb9261c0` → **200**

```json
{
  "id": "b4372a92-e0c7-446b-82f7-9eb2fb9261c0",
  "state": "PENDING",
  "created_at": "2026-10-29T09:00:54.749626Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b4372a92-e0c7-446b-82f7-9eb2fb9261c0` → **200**

```json
{
  "id": "b4372a92-e0c7-446b-82f7-9eb2fb9261c0",
  "state": "PENDING",
  "created_at": "2026-10-29T09:00:54.749626Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b4372a92-e0c7-446b-82f7-9eb2fb9261c0` → **200**

```json
{
  "id": "b4372a92-e0c7-446b-82f7-9eb2fb9261c0",
  "state": "PENDING",
  "created_at": "2026-10-29T09:00:54.749626Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b4372a92-e0c7-446b-82f7-9eb2fb9261c0` → **200**

```json
{
  "id": "b4372a92-e0c7-446b-82f7-9eb2fb9261c0",
  "state": "PENDING",
  "created_at": "2026-10-29T09:00:54.749626Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b4372a92-e0c7-446b-82f7-9eb2fb9261c0` → **200**

```json
{
  "id": "b4372a92-e0c7-446b-82f7-9eb2fb9261c0",
  "state": "READY",
  "created_at": "2026-10-29T09:00:54.749626Z",
  "ready_at": "2026-10-29T09:01:01.504662Z",
  "expires_at": "2026-11-05T09:01:01.504662Z",
  "size_bytes": 1028
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/b4372a92-e0c7-446b-82f7-9eb2fb9261c0/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631451904",
  "device_ref": "sandbox-8943"
}
```

```json
{
  "challenge_id": "6cacf8d7-bc1b-4bcf-a0fd-2d5be1a59383",
  "expires_at": "2026-10-29T09:06:02.182715164Z",
  "resend_available_at": "2026-10-29T09:01:03.182715164Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631451904` → **200**

```json
{
  "phone": "+380631451904",
  "audience": "CLIENT",
  "code": "547230",
  "sent_at": "2026-10-29T09:01:02.184864624Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6cacf8d7-bc1b-4bcf-a0fd-2d5be1a59383",
  "code": "547230",
  "device_ref": "sandbox-8943"
}
```

```json
{
  "session_id": "dd3fdb61-6cb8-4d1c-86dc-cc1cff5b810a",
  "subject": {
    "type": "CLIENT",
    "id": "5e9aa9b9-dee7-452a-a302-f7e36b344c06"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTlhYTliOS1kZWU3LTQ1MmEtYTMwMi1mN2UzNmIzNDRjMDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1MzYyLCJpYXQiOjE3OTMyNjQ0NjIsImp0aSI6IjQ0Y2E2YWUwLTM3MjgtNGRjMi1iZmJhLTkyMzFlMGU0NzU5ZCIsInNpZCI6ImRkM2ZkYjYxLTZjYjgtNGQxYy04NmRjLWNjMWNmZjViODEwYSJ9.Sd6Cv1WCeyXWICPkv7x5bajpwe5Ngqf38Udxjr05bj8",
  "access_expires_at": "2026-10-29T09:16:02.384298049Z",
  "refresh_token": "cS2ZM3uAKbchjHeJW0OzSLFfpTLE1UwcWc6MkkxUqR4",
  "refresh_expires_at": "2026-11-28T09:01:02.383819007Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/b4372a92-e0c7-446b-82f7-9eb2fb9261c0/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/b4372a92-e0c7-446b-82f7-9eb2fb9261c0/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "788cb04c-29da-4ab7-860e-da72297e8452"
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
  "session_id": "d1cf2677-4f5b-4dd7-914b-0b99ea15b7fe",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUzNjIsImlhdCI6MTc5MzI2NDQ2MiwianRpIjoiYWRjNWNlODQtOTY2OS00OTA3LThiODctMDlhMjA3NTEwY2I1Iiwic2lkIjoiZDFjZjI2NzctNGY1Yi00ZGQ3LTkxNGItMGI5OWVhMTViN2ZlIn0.H2S7hPJx3sR43OE4xB0eZpmXgWuWrqzxb1hWyFD5RXw",
  "access_expires_at": "2026-10-29T09:16:02.961438242Z",
  "refresh_token": "7MbPY0vI5e90CiAf23Br4WrQcKWCv84jlKk2IiexuMk",
  "refresh_expires_at": "2026-10-29T21:01:02.961130347Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "28571a83-a84a-451c-833f-68e1fc8912f4",
  "session_id": "30ecc951-d924-4d12-8284-54a08897ebda",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/28571a83-a84a-451c-833f-68e1fc8912f4/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "b4372a92-e0c7-446b-82f7-9eb2fb9261c0",
      "state": "READY",
      "created_at": "2026-10-29T09:00:54.749626Z",
      "ready_at": "2026-10-29T09:01:01.504662Z",
      "expires_at": "2026-11-05T09:01:01.504662Z",
      "size_bytes": 1028
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
  "device_ref": "sandbox-3626"
}
```

```json
{
  "challenge_id": "7bdcaa40-bfa7-45db-b36c-9a7caf9fc87c",
  "expires_at": "2026-10-29T09:06:03.521669533Z",
  "resend_available_at": "2026-10-29T09:01:04.521669533Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "268003",
  "sent_at": "2026-10-29T09:01:03.523869525Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7bdcaa40-bfa7-45db-b36c-9a7caf9fc87c",
  "code": "268003",
  "device_ref": "sandbox-3626"
}
```

```json
{
  "session_id": "3e719e38-0703-47b1-9a40-3c0b76ef6860",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTM2MywiaWF0IjoxNzkzMjY0NDYzLCJqdGkiOiIzYTY4ZmFiZC0wMGY4LTRjOWQtYjE4MS01MGUwYWJiM2EzODciLCJzaWQiOiIzZTcxOWUzOC0wNzAzLTQ3YjEtOWE0MC0zYzBiNzZlZjY4NjAifQ.BZ8CeRh4U0CypalFzvUHSWPcb9XNnjc7wuX_b6G2WBg",
  "access_expires_at": "2026-10-29T09:16:03.726482416Z",
  "refresh_token": "y2aBXdHlzbYDqr8Im4zfzipqV6NVQ5I3UcmGYzydRfc",
  "refresh_expires_at": "2026-11-28T09:01:03.726096333Z",
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
  "device_ref": "sandbox-3595"
}
```

```json
{
  "challenge_id": "46db6926-e639-478e-ac0c-3c0ed7056a38",
  "expires_at": "2026-10-29T09:06:04.080107947Z",
  "resend_available_at": "2026-10-29T09:01:05.080107947Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "129098",
  "sent_at": "2026-10-29T09:01:04.082180847Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "46db6926-e639-478e-ac0c-3c0ed7056a38",
  "code": "129098",
  "device_ref": "sandbox-3595"
}
```

```json
{
  "session_id": "b32daeac-3685-400d-8b9e-9feba26d00b3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTM2NCwiaWF0IjoxNzkzMjY0NDY0LCJqdGkiOiIxZGJhY2M4NS1jMDI5LTQzMGMtYjNmNy1jYzRiNjk5YmJhZDEiLCJzaWQiOiJiMzJkYWVhYy0zNjg1LTQwMGQtOGI5ZS05ZmViYTI2ZDAwYjMifQ.y2uk1DhgSXD62iBK2iI-JH6-nzNB8FM64rC6UpUcQlc",
  "access_expires_at": "2026-10-29T09:16:04.28677506Z",
  "refresh_token": "BAyQmYg52A_1DLDPnyuC_9IQtOvm4KloeqyegRqh3j8",
  "refresh_expires_at": "2026-11-28T09:01:04.286408937Z",
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
  "command_id": "ce8161f7-e0b4-4534-a82a-10eea1aa5dc1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:01:04Z",
    "sequence": 1793264464641
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1e1ea781-9f84-43a7-a496-e3bd53525791",
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
  "last_heartbeat_at": "2026-10-29T09:01:04.657604Z",
  "last_location_at": "2026-10-29T09:01:04.657604Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-27550"
}
```

```json
{
  "challenge_id": "d5b32df1-de40-441e-958c-fd87e5a3de0e",
  "expires_at": "2026-10-29T09:06:04.837785028Z",
  "resend_available_at": "2026-10-29T09:01:05.837785028Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "468703",
  "sent_at": "2026-10-29T09:01:04.83984911Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d5b32df1-de40-441e-958c-fd87e5a3de0e",
  "code": "468703",
  "device_ref": "sandbox-27550"
}
```

```json
{
  "session_id": "fdfcbf2a-345c-4fde-ad0f-5712857405e5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTM2NSwiaWF0IjoxNzkzMjY0NDY1LCJqdGkiOiI4MGU1MTgxNi1mYzk2LTRjMmEtOGI0My00MzkzMGY4MTEyMzUiLCJzaWQiOiJmZGZjYmYyYS0zNDVjLTRmZGUtYWQwZi01NzEyODU3NDA1ZTUifQ.Hl4aB6x3NfZFoMJMfHGxZ0kDI0rc9taI3-CKWlfMThI",
  "access_expires_at": "2026-10-29T09:16:05.034806703Z",
  "refresh_token": "LUD1WyikivF_dbKS5iYDT-FT6abQIiVZqZxtAZWwq8s",
  "refresh_expires_at": "2026-11-28T09:01:05.034442814Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6bcaf0b8-1afc-4bb4-a3fc-2c5777d713f6",
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
  "last_heartbeat_at": "2026-10-29T09:00:03.755635Z",
  "last_location_at": "2026-10-29T09:00:03.755635Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6bcaf0b8-1afc-4bb4-a3fc-2c5777d713f6/handover` → **200**

```json
{
  "command_id": "2cde5b97-f828-4ed5-b910-a8e89c779a9b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6bcaf0b8-1afc-4bb4-a3fc-2c5777d713f6",
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
  "last_heartbeat_at": "2026-10-29T09:00:03.755635Z",
  "last_location_at": "2026-10-29T09:00:03.755635Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6bcaf0b8-1afc-4bb4-a3fc-2c5777d713f6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:01:05Z",
    "sequence": 1793264465573
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6bcaf0b8-1afc-4bb4-a3fc-2c5777d713f6",
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
  "last_heartbeat_at": "2026-10-29T09:01:05.589596Z",
  "last_location_at": "2026-10-29T09:01:05.589596Z",
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
  "session_id": "51b64725-4f0c-4842-8496-88691add581a",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUzNjUsImlhdCI6MTc5MzI2NDQ2NSwianRpIjoiMzhlYzU0ZTktZWZmYS00ODM3LTg0ZDgtZjdhMmEyMzcxMTYwIiwic2lkIjoiNTFiNjQ3MjUtNGYwYy00ODQyLTg0OTYtODg2OTFhZGQ1ODFhIn0.BFvw0JW7OSRavwUDBm6jS5k0XcSB1UmDHAg7TL1cFjw",
  "access_expires_at": "2026-10-29T09:16:05.974643777Z",
  "refresh_token": "abNcgNRABWBnMjPEDIvopkHlnfji-4nPXfqSSlxRo0Q",
  "refresh_expires_at": "2026-10-29T21:01:05.974336573Z",
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
  "session_id": "55885354-405a-451c-b55f-8cce8815a359",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUzNjYsImlhdCI6MTc5MzI2NDQ2NiwianRpIjoiYTJlMTE5ZWYtODZiNC00MDc1LTg2MDAtNWY1NDlhODJkODA3Iiwic2lkIjoiNTU4ODUzNTQtNDA1YS00NTFjLWI1NWYtOGNjZTg4MTVhMzU5In0.geWEOFdk382CfuGVb7BfCvC62rAtovjKPHc-DME8O2M",
  "access_expires_at": "2026-10-29T09:16:06.363297609Z",
  "refresh_token": "g7bhsqUM1ZHDAG-W03KpjL37JEQM0eiSBL4Yt36ZHYw",
  "refresh_expires_at": "2026-10-29T21:01:06.362636129Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380681794257",
  "device_ref": "sandbox-23758"
}
```

```json
{
  "challenge_id": "ee193ca5-46f0-4e9b-aaf7-364ca1ed7abc",
  "expires_at": "2026-10-29T09:06:06.550085395Z",
  "resend_available_at": "2026-10-29T09:01:07.550085395Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380681794257` → **200**

```json
{
  "phone": "+380681794257",
  "audience": "CLIENT",
  "code": "447928",
  "sent_at": "2026-10-29T09:01:06.551867405Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ee193ca5-46f0-4e9b-aaf7-364ca1ed7abc",
  "code": "447928",
  "device_ref": "sandbox-23758"
}
```

```json
{
  "session_id": "2a83fc36-0253-4b61-8315-d5d4e77fde38",
  "subject": {
    "type": "CLIENT",
    "id": "f20d6794-dae9-4027-90c7-e8cc3d29b6cd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMjBkNjc5NC1kYWU5LTQwMjctOTBjNy1lOGNjM2QyOWI2Y2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1MzY2LCJpYXQiOjE3OTMyNjQ0NjYsImp0aSI6Ijg4M2Q5OTFjLWZmMzctNDI2Yy1hZmY5LWEwYzI3ZTY3MjlkNiIsInNpZCI6IjJhODNmYzM2LTAyNTMtNGI2MS04MzE1LWQ1ZDRlNzdmZGUzOCJ9.Ml5R96BFxeR94mpeUQ-ccpp-bqvcmSUsM4cekhb0tHs",
  "access_expires_at": "2026-10-29T09:16:06.786700614Z",
  "refresh_token": "4dESo_EzDAwu9v6bVIhXvqS3CUr7uMquHwg5V_5u_3s",
  "refresh_expires_at": "2026-11-28T09:01:06.786358291Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1e9a4be3-3776-472f-b2d8-def24da1fa57",
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
  "id": "236887ab-3f1e-4c6f-8446-1f8ef2c37707",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:06:07.011675Z",
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
  "command_id": "6682fd06-032f-40b8-aa4d-ca0e40051697",
  "quote_id": "236887ab-3f1e-4c6f-8446-1f8ef2c37707",
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
  "id": "242e939b-def3-4201-af09-d37f7bfb409c",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f20d6794-dae9-4027-90c7-e8cc3d29b6cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T09:01:07.210406Z",
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
    "id": "42593c67-334e-4f0c-b93b-5765082e502c",
    "order_id": "242e939b-def3-4201-af09-d37f7bfb409c",
    "expires_at": "2026-10-29T09:01:22.212706Z",
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

`POST /api/driver/v1/offers/42593c67-334e-4f0c-b93b-5765082e502c/reject` → **204**

```json
{
  "command_id": "d43ef8a4-3489-4e72-b5ae-c636109f8bf7"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "07975800-74d6-4f7f-8fa3-4ff070f735c8",
    "order_id": "242e939b-def3-4201-af09-d37f7bfb409c",
    "expires_at": "2026-10-29T09:01:22.588763Z",
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

`POST /api/driver/v1/offers/07975800-74d6-4f7f-8fa3-4ff070f735c8/accept` → **200**

```json
{
  "command_id": "078716ee-9a63-4302-b1b8-c6976ff795b2"
}
```

```json
{
  "id": "afc677ae-0f80-4bb5-984d-9b0726a0994d",
  "order_id": "242e939b-def3-4201-af09-d37f7bfb409c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bb14fffd-de42-42c2-84ce-61708612ca0b",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/242e939b-def3-4201-af09-d37f7bfb409c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T09:01:07.210804Z",
      "actor": {
        "type": "CLIENT",
        "id": "f20d6794-dae9-4027-90c7-e8cc3d29b6cd",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "242e939b-def3-4201-af09-d37f7bfb409c",
        "quote_id": "236887ab-3f1e-4c6f-8446-1f8ef2c37707",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "d5b2f314-a1a3-4cf3-a96b-1f70f178a925"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T09:01:07.212217Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "242e939b-def3-4201-af09-d37f7bfb409c",
        "attempt_id": "50f6f193-37ef-42a3-a707-d6164190f800",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "d5b2f314-a1a3-4cf3-a96b-1f70f178a925"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T09:01:07.214703Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "42593c67-334e-4f0c-b93b-5765082e502c",
        "order_id": "242e939b-def3-4201-af09-d37f7bfb409c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "d5b2f314-a1a3-4cf3-a96b-1f70f178a925"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T09:01:07.587808Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "42593c67-334e-4f0c-b93b-5765082e502c",
        "order_id": "242e939b-def3-4201-af09-d37f7bfb409c"
      },
      "correlation_id": "32140a20-2b97-4dbc-ad84-378a64590406"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 242e939b-def3-4201-af09-d37f7bfb409c — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/242e939b-def3-4201-af09-d37f7bfb409c` → **200**

```json
{
  "id": "242e939b-def3-4201-af09-d37f7bfb409c",
  "short_number": 10,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "f20d6794-dae9-4027-90c7-e8cc3d29b6cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "afc677ae-0f80-4bb5-984d-9b0726a0994d",
    "order_id": "242e939b-def3-4201-af09-d37f7bfb409c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "bb14fffd-de42-42c2-84ce-61708612ca0b",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T09:01:07.210406Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/242e939b-def3-4201-af09-d37f7bfb409c/cancel` → **200**

```json
{
  "command_id": "8f4ce2f7-3700-47e8-838a-7e6a6eb601f6",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "242e939b-def3-4201-af09-d37f7bfb409c",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "f20d6794-dae9-4027-90c7-e8cc3d29b6cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "afc677ae-0f80-4bb5-984d-9b0726a0994d",
    "order_id": "242e939b-def3-4201-af09-d37f7bfb409c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "bb14fffd-de42-42c2-84ce-61708612ca0b",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T09:01:07.210406Z",
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
  "session_id": "1e1ea781-9f84-43a7-a496-e3bd53525791",
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
  "last_heartbeat_at": "2026-10-29T09:01:04.657604Z",
  "last_location_at": "2026-10-29T09:01:04.657604Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1e1ea781-9f84-43a7-a496-e3bd53525791/close` → **200**

```json
{
  "command_id": "71d52260-1882-44e6-aff8-b60d5bc3d1dd",
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
  "session_id": "6bcaf0b8-1afc-4bb4-a3fc-2c5777d713f6",
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
  "last_heartbeat_at": "2026-10-29T09:01:05.589596Z",
  "last_location_at": "2026-10-29T09:01:05.589596Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6bcaf0b8-1afc-4bb4-a3fc-2c5777d713f6/close` → **200**

```json
{
  "command_id": "f438e6c8-94a6-4f76-b0f5-87c2d6ce383a",
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
  "session_id": "9e260bbd-f1b1-41e6-8233-b81a3b320ee0",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUzNjksImlhdCI6MTc5MzI2NDQ2OSwianRpIjoiOGExOGI5ODQtNTc2Yy00NTRiLWI0NzgtNTgyNjRhZjY5ODJjIiwic2lkIjoiOWUyNjBiYmQtZjFiMS00MWU2LTgyMzMtYjgxYTNiMzIwZWUwIn0.SbVgrie8n9ToUdil_4MGAml02D2KuX0mrIH--uAh1t0",
  "access_expires_at": "2026-10-29T09:16:09.537791497Z",
  "refresh_token": "Yk7B7H66h92pHRBJS7vVNwy3tewlc46GI0pPR_rAfBc",
  "refresh_expires_at": "2026-10-29T21:01:09.537412785Z",
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
  "command_id": "0343fd59-3981-4342-90c5-d77303afceb6",
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
  "changed_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T09:01:09.921083Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "e6b90a7c-7611-48e3-8b7b-06bcf80d2222",
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
  "correlation_id": "f7394f4b-f72b-43ad-8f80-e33a07bb2873"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "3ae42c7f-eb37-42a5-bf78-62b0ca4be9b6",
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
  "correlation_id": "824a297b-d94c-4659-822d-c81a0d5bcd9d"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631989545",
  "device_ref": "sandbox-14198"
}
```

```json
{
  "challenge_id": "92dfa665-706c-40ec-9ef4-c58f56d01d23",
  "expires_at": "2026-10-29T09:06:10.540001221Z",
  "resend_available_at": "2026-10-29T09:01:11.540001221Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631989545` → **200**

```json
{
  "phone": "+380631989545",
  "audience": "CLIENT",
  "code": "470338",
  "sent_at": "2026-10-29T09:01:10.542057861Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "92dfa665-706c-40ec-9ef4-c58f56d01d23",
  "code": "470338",
  "device_ref": "sandbox-14198"
}
```

```json
{
  "session_id": "aafc9978-3efc-4d9c-9488-2dbc00487b15",
  "subject": {
    "type": "CLIENT",
    "id": "6ac8a63b-8838-4851-9a6d-bdd9f7bf7296"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YWM4YTYzYi04ODM4LTQ4NTEtOWE2ZC1iZGQ5ZjdiZjcyOTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1MzcwLCJpYXQiOjE3OTMyNjQ0NzAsImp0aSI6IjVjMzRmZGE4LTg5ZmMtNGQ3OS04NTA1LWI1MzY1NjgxNzUzNiIsInNpZCI6ImFhZmM5OTc4LTNlZmMtNGQ5Yy05NDg4LTJkYmMwMDQ4N2IxNSJ9.Ksk6B8IZhY5It53glQyOkeh6xdZyikwMdHSJTCBc43o",
  "access_expires_at": "2026-10-29T09:16:10.770001548Z",
  "refresh_token": "AnAOeNwX3cC8FV0FmzK-5HflsRr5s46k438bZc1m1Zg",
  "refresh_expires_at": "2026-11-28T09:01:10.769676127Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "883c3d65-5648-4d6c-9dbe-8b22703aa15f",
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
  "id": "d67f14d6-6204-415f-80c8-ba45c391601c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:06:10.951264Z",
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
  "command_id": "aee7cd20-22f3-43d3-a2f5-0741c4db90a8",
  "quote_id": "d67f14d6-6204-415f-80c8-ba45c391601c",
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
  "correlation_id": "1afc9003-bf92-44cf-b84c-713ec5a0ee2e"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3478ffa1-9898-4b69-8a0b-dd9ad6e54b57",
  "quote_id": "d67f14d6-6204-415f-80c8-ba45c391601c",
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
  "id": "39b43493-c076-4c35-beec-655865427610",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6ac8a63b-8838-4851-9a6d-bdd9f7bf7296",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:01:11.32516Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/39b43493-c076-4c35-beec-655865427610/cancel` → **200**

```json
{
  "command_id": "b91b1bfd-a6fd-4314-a96b-13708b40b235",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "39b43493-c076-4c35-beec-655865427610",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6ac8a63b-8838-4851-9a6d-bdd9f7bf7296",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T09:01:11.32516Z",
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
  "command_id": "197cefc0-d716-4999-b9f8-43196e9dfeae",
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
  "changed_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T09:01:11.718666Z"
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
      "changed_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T09:01:11.718666Z"
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
  "device_ref": "sandbox-4173"
}
```

```json
{
  "challenge_id": "fb9a67ea-9588-49c4-bee7-b1a8813d55e3",
  "expires_at": "2026-10-29T09:06:12.270831553Z",
  "resend_available_at": "2026-10-29T09:01:13.270831553Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "563821",
  "sent_at": "2026-10-29T09:01:12.27316149Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb9a67ea-9588-49c4-bee7-b1a8813d55e3",
  "code": "563821",
  "device_ref": "sandbox-4173"
}
```

```json
{
  "session_id": "e85f6ce4-d13a-4e1f-b1f4-e708c5c8e8ba",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTM3MiwiaWF0IjoxNzkzMjY0NDcyLCJqdGkiOiJkYmYxN2NjZS1iNDEyLTQ0MzMtOTliYi1mNjM1MWUwYmRmMDgiLCJzaWQiOiJlODVmNmNlNC1kMTNhLTRlMWYtYjFmNC1lNzA4YzVjOGU4YmEifQ.TwGkcOeCD9vuDHrYq4UKus5cOvt4uqdfBsYYinV4Y58",
  "access_expires_at": "2026-10-29T09:16:12.472151947Z",
  "refresh_token": "OpD7NKyKSUfzKe2f3wHGdLCrRFQqvz44R2IE4FN6FTw",
  "refresh_expires_at": "2026-11-28T09:01:12.471751463Z",
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
  "command_id": "048954da-0712-4880-9ac8-c526c11630dc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:01:12Z",
    "sequence": 1793264472824
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7a18b91a-71a3-45f8-badd-760b2c120569",
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
  "last_heartbeat_at": "2026-10-29T09:01:12.840421Z",
  "last_location_at": "2026-10-29T09:01:12.840421Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679758662",
  "device_ref": "sandbox-12740"
}
```

```json
{
  "challenge_id": "0ad9bdea-80a8-4fe8-9876-c4924fa97047",
  "expires_at": "2026-10-29T09:06:13.021339611Z",
  "resend_available_at": "2026-10-29T09:01:14.021339611Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679758662` → **200**

```json
{
  "phone": "+380679758662",
  "audience": "CLIENT",
  "code": "210482",
  "sent_at": "2026-10-29T09:01:13.023345719Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0ad9bdea-80a8-4fe8-9876-c4924fa97047",
  "code": "210482",
  "device_ref": "sandbox-12740"
}
```

```json
{
  "session_id": "31e883f9-702d-42da-b981-8d36844f7d1d",
  "subject": {
    "type": "CLIENT",
    "id": "5de9470f-20e6-4227-8004-04e7b772d295"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZGU5NDcwZi0yMGU2LTQyMjctODAwNC0wNGU3Yjc3MmQyOTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1MzczLCJpYXQiOjE3OTMyNjQ0NzMsImp0aSI6IjMzYzg0M2U2LTEyNDctNDViNS04ZTZiLThlM2YwYzhhYmQzOSIsInNpZCI6IjMxZTg4M2Y5LTcwMmQtNDJkYS1iOTgxLThkMzY4NDRmN2QxZCJ9.bTugC-bVJtB-Mlnuj1D3i3yZwG9Ks_8fpRM8uLWTZ58",
  "access_expires_at": "2026-10-29T09:16:13.22418639Z",
  "refresh_token": "Yp-zg42-6MTYTICYpiMVSaHPqQPXyP0ujbqf3DeZZ7w",
  "refresh_expires_at": "2026-11-28T09:01:13.223887749Z",
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
  "command_id": "fa078760-7020-40ed-af86-1fcca40fb612",
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
  "id": "40845202-8801-42fe-8253-59988b4f7246",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:06:13.577584Z",
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
  "command_id": "da17de7b-9217-4da3-815b-fe6457fbe9d3",
  "platform": "ANDROID",
  "token": "sandbox-driver-45324a5a-1108-412c-980a-14b6714c29ec"
}
```

```json
{
  "id": "23111e20-cf90-40d5-a745-28895fa85f12",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T09:01:13.774169Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "6e2e7f48-9dff-444c-91d0-c40db9594bf7",
  "platform": "ANDROID",
  "token": "sandbox-rider-c6758b78-f1a0-494c-839a-1fcdc1a8423e"
}
```

```json
{
  "id": "4563531b-aa79-4c69-9f26-4c6082219fdc",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T09:01:13.967494Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3b4ae02f-8a64-450b-bb57-4e39a9b88c99",
  "quote_id": "40845202-8801-42fe-8253-59988b4f7246",
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
  "id": "e83786e3-2722-4998-bb70-1749ef7faa19",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5de9470f-20e6-4227-8004-04e7b772d295",
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
  "created_at": "2026-10-29T09:01:14.162739Z",
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
    "id": "585c8f91-9dc8-4fe6-9348-2df421e6a99c",
    "order_id": "e83786e3-2722-4998-bb70-1749ef7faa19",
    "expires_at": "2026-10-29T09:01:29.165103Z",
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

`POST /api/driver/v1/offers/585c8f91-9dc8-4fe6-9348-2df421e6a99c/accept` → **200**

```json
{
  "command_id": "7a5ec687-7fbb-4e67-9cb0-972bf7fbef9c"
}
```

```json
{
  "id": "0cef14df-51bc-434c-8cd7-2b7ec9d3ed06",
  "order_id": "e83786e3-2722-4998-bb70-1749ef7faa19",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d67de0f4-9e53-4317-9e7b-b0934bf731b3",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T09:01:14.142Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T09:01:14.142Z` → **200**

```json
[
  {
    "at": "2026-10-29T09:01:14.782231487Z",
    "token_suffix": "4c29ec",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "e83786e3-2722-4998-bb70-1749ef7faa19",
      "order_version": "2",
      "event_id": "675d5492-fa33-4dac-835d-23093cf799d9",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380679758662&after=2026-10-29T09:01:14.142Z` → **200**

```json
[
  {
    "at": "2026-10-29T09:01:15.785581302Z",
    "token_suffix": "a8423e",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "e83786e3-2722-4998-bb70-1749ef7faa19",
      "order_version": "3",
      "event_id": "3ece7e84-941a-4f43-bd11-e7728d628b39",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/e83786e3-2722-4998-bb70-1749ef7faa19/messages` → **201**

```json
{
  "command_id": "4918b57f-8b6d-45d2-861b-84d727972c4a",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "39af43c7-2b0c-43da-a07c-b11d17cc32b0",
  "order_id": "e83786e3-2722-4998-bb70-1749ef7faa19",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T09:01:15.8371895Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d67de0f4-9e53-4317-9e7b-b0934bf731b3",
  "order_id": "e83786e3-2722-4998-bb70-1749ef7faa19",
  "assignment_id": "0cef14df-51bc-434c-8cd7-2b7ec9d3ed06",
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

`POST /api/driver/v1/trips/d67de0f4-9e53-4317-9e7b-b0934bf731b3/messages` → **201**

```json
{
  "command_id": "bc0a1453-2e19-42ab-b069-764204169fb1",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "6b6d6bee-0210-44c6-9882-05f8fff7ba36",
  "order_id": "e83786e3-2722-4998-bb70-1749ef7faa19",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T09:01:16.197041342Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/e83786e3-2722-4998-bb70-1749ef7faa19/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/d67de0f4-9e53-4317-9e7b-b0934bf731b3/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679758662"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/7a18b91a-71a3-45f8-badd-760b2c120569/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:01:16Z",
    "sequence": 1793264476717
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7a18b91a-71a3-45f8-badd-760b2c120569",
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
  "last_heartbeat_at": "2026-10-29T09:01:16.732587Z",
  "last_location_at": "2026-10-29T09:01:16.732587Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d67de0f4-9e53-4317-9e7b-b0934bf731b3",
  "order_id": "e83786e3-2722-4998-bb70-1749ef7faa19",
  "assignment_id": "0cef14df-51bc-434c-8cd7-2b7ec9d3ed06",
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

`POST /api/driver/v1/trips/d67de0f4-9e53-4317-9e7b-b0934bf731b3/arrive` → **200**

```json
{
  "command_id": "0a9adf63-a891-4138-bfcc-8ff35110f2e5",
  "expected_version": 0
}
```

```json
{
  "id": "d67de0f4-9e53-4317-9e7b-b0934bf731b3",
  "order_id": "e83786e3-2722-4998-bb70-1749ef7faa19",
  "assignment_id": "0cef14df-51bc-434c-8cd7-2b7ec9d3ed06",
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
  "arrived_at": "2026-10-29T09:01:17.096745Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d67de0f4-9e53-4317-9e7b-b0934bf731b3/start` → **200**

```json
{
  "command_id": "5197fbea-d00c-4332-a364-e6d03552178b",
  "expected_version": 1
}
```

```json
{
  "id": "d67de0f4-9e53-4317-9e7b-b0934bf731b3",
  "order_id": "e83786e3-2722-4998-bb70-1749ef7faa19",
  "assignment_id": "0cef14df-51bc-434c-8cd7-2b7ec9d3ed06",
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
  "arrived_at": "2026-10-29T09:01:17.096745Z",
  "started_at": "2026-10-29T09:01:17.283966Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/7a18b91a-71a3-45f8-badd-760b2c120569/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:01:17Z",
    "sequence": 1793264477457
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7a18b91a-71a3-45f8-badd-760b2c120569",
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
  "last_heartbeat_at": "2026-10-29T09:01:17.476621Z",
  "last_location_at": "2026-10-29T09:01:17.476621Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/d67de0f4-9e53-4317-9e7b-b0934bf731b3/complete` → **200**

```json
{
  "command_id": "e8fe916d-ab6c-4453-bef8-abe5731668a6",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:01:17Z",
  "cash_received": true
}
```

```json
{
  "id": "d67de0f4-9e53-4317-9e7b-b0934bf731b3",
  "order_id": "e83786e3-2722-4998-bb70-1749ef7faa19",
  "assignment_id": "0cef14df-51bc-434c-8cd7-2b7ec9d3ed06",
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
  "arrived_at": "2026-10-29T09:01:17.096745Z",
  "started_at": "2026-10-29T09:01:17.283966Z",
  "completed_at": "2026-10-29T09:01:17.666779Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/e83786e3-2722-4998-bb70-1749ef7faa19` → **200**

```json
{
  "id": "e83786e3-2722-4998-bb70-1749ef7faa19",
  "short_number": 12,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "5de9470f-20e6-4227-8004-04e7b772d295",
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
    "id": "0cef14df-51bc-434c-8cd7-2b7ec9d3ed06",
    "order_id": "e83786e3-2722-4998-bb70-1749ef7faa19",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d67de0f4-9e53-4317-9e7b-b0934bf731b3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:01:14.162739Z",
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
    "id": "e83786e3-2722-4998-bb70-1749ef7faa19",
    "short_number": 12,
    "status": "FULFILLED",
    "created_at": "2026-10-29T09:01:14.162739Z",
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
    "id": "d67de0f4-9e53-4317-9e7b-b0934bf731b3",
    "order_id": "e83786e3-2722-4998-bb70-1749ef7faa19",
    "order_short_number": 12,
    "created_at": "2026-10-29T09:01:14.554899Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "e41d1fc2-87a0-4f07-ae55-8a52fcb67105",
    "order_id": "01582003-73ea-4d83-9c70-2e3c1779b8c8",
    "order_short_number": 8,
    "created_at": "2026-10-29T09:00:29.252392Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "b1e168ed-7666-4ae3-8590-9123270a2991",
    "order_id": "473e8364-2325-40ca-9fe4-994df706bc38",
    "order_short_number": 3,
    "created_at": "2026-10-29T08:59:55.953427Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "87334fb7-7c47-4040-bf99-222c26c6baab",
    "order_id": "2f132c74-48d9-4349-b917-3b4d69fcb66e",
    "order_short_number": 2,
    "created_at": "2026-10-29T08:59:37.934715Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "7e4556a0-8a6e-467e-888c-4180dc256c71",
    "order_id": "2e449fc7-182d-42eb-878e-8f505979b244",
    "order_short_number": 1,
    "created_at": "2026-10-29T08:59:31.650135Z",
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

`GET /api/rider/v1/orders/e83786e3-2722-4998-bb70-1749ef7faa19/tip` → **200**

```json
{
  "order_id": "e83786e3-2722-4998-bb70-1749ef7faa19",
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
  "available_until": "2026-10-30T09:01:17.666779Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e83786e3-2722-4998-bb70-1749ef7faa19/tip` → **201**

```json
{
  "command_id": "746c1da2-9154-4fd4-8172-a38dc40b0020",
  "amount_minor": 1100
}
```

```json
{
  "id": "fd949f7a-9a0f-48d8-9356-1e2859e9f4ab",
  "order_id": "e83786e3-2722-4998-bb70-1749ef7faa19",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T09:01:21.962276Z"
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
  "session_id": "de16e969-f6ca-462e-83e5-5fbafcb98051",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUzODIsImlhdCI6MTc5MzI2NDQ4MiwianRpIjoiNGIyNjFmMzItODViNS00MGM5LTlkZWItMjk4ODFhZjRiMDI5Iiwic2lkIjoiZGUxNmU5NjktZjZjYS00NjJlLTgzZTUtNWZiYWZjYjk4MDUxIn0.YPHtdgR4EtBg3x7MHZlAS6mpCqa8Eztv5lkvfAQnr04",
  "access_expires_at": "2026-10-29T09:16:22.35530088Z",
  "refresh_token": "oGe0o2ri9JCV1j5WRk2v6e92MPGzrCHhSfM3oeGYYaM",
  "refresh_expires_at": "2026-10-29T21:01:22.354935959Z",
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
        "created": 12,
        "fulfilled": 7,
        "cancelled": 5,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 11,
          "PHONE": 1
        },
        "by_payment": {
          "CARD": 1,
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
    "created": 12,
    "fulfilled": 7,
    "cancelled": 5,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 11,
      "PHONE": 1
    },
    "by_payment": {
      "CARD": 1,
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
  "generated_at": "2026-10-29T09:01:22.541082481Z"
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
        "trips": 7,
        "fares_minor": 85179,
        "service_rides_minor": 0,
        "commission_minor": 12780,
        "driver_share_minor": 72399,
        "discounts_minor": 1052,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 16297,
        "paid_with_bonuses_minor": 18297,
        "collected_by_drivers_minor": 39016,
        "tips_minor": 5000,
        "rider_debt_change_minor": 10517
      }
    }
  ],
  "total": {
    "trips": 7,
    "fares_minor": 85179,
    "service_rides_minor": 0,
    "commission_minor": 12780,
    "driver_share_minor": 72399,
    "discounts_minor": 1052,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 16297,
    "paid_with_bonuses_minor": 18297,
    "collected_by_drivers_minor": 39016,
    "tips_minor": 5000,
    "rider_debt_change_minor": 10517
  },
  "generated_at": "2026-10-29T09:01:22.730400524Z"
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
  "session_id": "430a834e-549d-458b-97c1-a9d589f13bde",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUzODMsImlhdCI6MTc5MzI2NDQ4MywianRpIjoiMTYxNGY2ZjAtYTg4NS00ZmZmLWFmNzAtMzBlZjgxN2JhNWVmIiwic2lkIjoiNDMwYTgzNGUtNTQ5ZC00NThiLTk3YzEtYTlkNTg5ZjEzYmRlIn0.QYGkZ5Vun-3oFq1zqD1wk6d-4MK08RRzKagxpc4nb7c",
  "access_expires_at": "2026-10-29T09:16:23.130108697Z",
  "refresh_token": "JQueRwN-eUCCq0KjEr_X8g6fsbrkMoLl-yYL3yGcN_A",
  "refresh_expires_at": "2026-10-29T21:01:23.129676055Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e83786e3-2722-4998-bb70-1749ef7faa19/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T09:01:14.163168Z",
      "actor": {
        "type": "CLIENT",
        "id": "5de9470f-20e6-4227-8004-04e7b772d295",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e83786e3-2722-4998-bb70-1749ef7faa19",
        "quote_id": "40845202-8801-42fe-8253-59988b4f7246",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "69a7be06-853d-4a31-8cc7-9647e870bc50"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T09:01:14.164635Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e83786e3-2722-4998-bb70-1749ef7faa19",
        "attempt_id": "ab5e3dc0-6b75-456d-8dab-2d2c1ae31d03",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "69a7be06-853d-4a31-8cc7-9647e870bc50"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T09:01:14.16631Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "585c8f91-9dc8-4fe6-9348-2df421e6a99c",
        "order_id": "e83786e3-2722-4998-bb70-1749ef7faa19",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "69a7be06-853d-4a31-8cc7-9647e870bc50"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T09:01:14.555872Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "585c8f91-9dc8-4fe6-9348-2df421e6a99c",
        "order_id": "e83786e3-2722-4998-bb70-1749ef7faa19",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "0cef14df-51bc-434c-8cd7-2b7ec9d3ed06"
      },
      "correlation_id": "8c0f6e9b-0007-4771-984e-23a8d52677be"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T09:01:23.498956538Z",
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
      "last_location_at": "2026-10-29T09:01:17.476621Z",
      "order_id": null
    }
  ]
}
```

Done: order e83786e3-2722-4998-bb70-1749ef7faa19.

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
  "session_id": "c3c951fd-c9b1-49e9-9be3-b4c1db8337af",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUzODMsImlhdCI6MTc5MzI2NDQ4MywianRpIjoiYjg5M2Q2ODgtMTQ0NS00MThhLTkyYTEtN2ZmOGI3Yjg0MTRlIiwic2lkIjoiYzNjOTUxZmQtYzliMS00OWU5LTliZTMtYjRjMWRiODMzN2FmIn0.L3FqXQeF7jXfmYl2I_rD748cPfgVgJjEefdD5GhR79Y",
  "access_expires_at": "2026-10-29T09:16:23.903630043Z",
  "refresh_token": "5Y4kJCaUIt63WV7maYXlVpBqz_dOsFdthK4XjKzPTrE",
  "refresh_expires_at": "2026-10-29T21:01:23.903231776Z",
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
  "command_id": "926d18ff-eafe-4fd2-beb4-e6add5416438",
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
  "timestamp": "2026-10-29T09:01:24.000+0000",
  "channel": {
    "id": "1730052000.2697316091",
    "linkedid": "1730052000.2697316091",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672170819"
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
  "timestamp": "2026-10-29T09:01:24.000+0000",
  "channel": {
    "id": "1730052000.2697316091",
    "linkedid": "1730052000.2697316091",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672170819"
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
  "session_id": "3d1bf767-4071-440e-a4fc-7a440673d4bf",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUzODQsImlhdCI6MTc5MzI2NDQ4NCwianRpIjoiYmI3ZjlhNTctMjFkMC00OTMwLWFlMjEtZTA0NTMzMmM4N2M1Iiwic2lkIjoiM2QxYmY3NjctNDA3MS00NDBlLWE0ZmMtN2E0NDA2NzNkNGJmIn0.aer6viI807i7joi8wUn-Vg_wzoYD_xPpVEz_-l2lH9Y",
  "access_expires_at": "2026-10-29T09:16:24.709481092Z",
  "refresh_token": "rnkbNwCvG37Cr-tjWJniVsjbyzpHQECed08NkmAgME8",
  "refresh_expires_at": "2026-10-29T21:01:24.709079876Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "0acb1426-795f-4f48-a432-e0ba2b1f7670",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672170819",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T09:01:24Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/0acb1426-795f-4f48-a432-e0ba2b1f7670/answer` → **200**

```json
{
  "command_id": "99de42a5-c82c-4736-bfc5-58cf1db044c4"
}
```

```json
{
  "id": "0acb1426-795f-4f48-a432-e0ba2b1f7670",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672170819",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "order_ids": [],
  "started_at": "2026-10-29T09:01:24Z",
  "answered_at": "2026-10-29T09:01:25.0801Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2697316091",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7c85affc-e8b1-448b-8636-50d51eff6ca5",
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
  "id": "0cf94e58-bfaf-412c-a789-2f87be7fa899",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:06:25.291393Z",
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
  "command_id": "a52ef8e6-2e22-44d9-b9db-2910d391c3b0",
  "quote_id": "0cf94e58-bfaf-412c-a789-2f87be7fa899",
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
    "phone": "+380672170819"
  },
  "call_id": "0acb1426-795f-4f48-a432-e0ba2b1f7670"
}
```

```json
{
  "id": "9fc62810-34a6-46a5-a893-409867b55f22",
  "short_number": 13,
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
  "created_at": "2026-10-29T09:01:25.487211Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672170819"
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
    "id": "1730052000.2697316091",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "0acb1426-795f-4f48-a432-e0ba2b1f7670",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672170819",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "order_ids": [
        "9fc62810-34a6-46a5-a893-409867b55f22"
      ],
      "started_at": "2026-10-29T09:01:24Z",
      "answered_at": "2026-10-29T09:01:25.0801Z",
      "ended_at": "2026-10-29T09:01:25.688702Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "820791b1-ee82-4802-a414-cc3e34186ebb",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677753331",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "order_ids": [],
      "started_at": "2026-10-29T08:59:44.341713Z",
      "answered_at": "2026-10-29T08:59:44.555019Z",
      "ended_at": "2026-10-29T08:59:44.783055Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T08:59:51.502516Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/9fc62810-34a6-46a5-a893-409867b55f22` → **200**

```json
{
  "id": "9fc62810-34a6-46a5-a893-409867b55f22",
  "short_number": 13,
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
  "created_at": "2026-10-29T09:01:25.487211Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672170819"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/9fc62810-34a6-46a5-a893-409867b55f22` → **200**

```json
{
  "id": "9fc62810-34a6-46a5-a893-409867b55f22",
  "short_number": 13,
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
  "created_at": "2026-10-29T09:01:25.487211Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672170819"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9fc62810-34a6-46a5-a893-409867b55f22/cancel` → **200**

```json
{
  "command_id": "f8fb9823-3fc0-4406-9a17-8e2a907119a3",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "9fc62810-34a6-46a5-a893-409867b55f22",
  "short_number": 13,
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
  "created_at": "2026-10-29T09:01:25.487211Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672170819"
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

Done: call 0acb1426-795f-4f48-a432-e0ba2b1f7670 with order 9fc62810-34a6-46a5-a893-409867b55f22.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30199"
}
```

```json
{
  "challenge_id": "2d31700c-6f6d-45ef-a9ba-dc3df7862bf7",
  "expires_at": "2026-10-29T09:06:26.480245615Z",
  "resend_available_at": "2026-10-29T09:01:27.480245615Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "408041",
  "sent_at": "2026-10-29T09:01:26.482356462Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2d31700c-6f6d-45ef-a9ba-dc3df7862bf7",
  "code": "408041",
  "device_ref": "sandbox-30199"
}
```

```json
{
  "session_id": "74083417-08de-4fab-905a-c90fa628ae66",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTM4NiwiaWF0IjoxNzkzMjY0NDg2LCJqdGkiOiJhZmFkNGE2OC01Njc1LTQwMDktYmE1Yy0wOTBiNTc2NTFmNmIiLCJzaWQiOiI3NDA4MzQxNy0wOGRlLTRmYWItOTA1YS1jOTBmYTYyOGFlNjYifQ.0aOb35dybbFeAoLzEgJPUY__cZh_zedOsWRj4hWYtg0",
  "access_expires_at": "2026-10-29T09:16:26.688336748Z",
  "refresh_token": "8LJm_bFeb-Zg6xTXg9lD7EDYapkoRwTrK0JcR4OPlLw",
  "refresh_expires_at": "2026-11-28T09:01:26.687939088Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7a18b91a-71a3-45f8-badd-760b2c120569",
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
  "last_heartbeat_at": "2026-10-29T09:01:17.476621Z",
  "last_location_at": "2026-10-29T09:01:17.476621Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7a18b91a-71a3-45f8-badd-760b2c120569/handover` → **200**

```json
{
  "command_id": "905b2999-b99f-45ee-b42e-a74181eb9285",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7a18b91a-71a3-45f8-badd-760b2c120569",
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
  "last_heartbeat_at": "2026-10-29T09:01:17.476621Z",
  "last_location_at": "2026-10-29T09:01:17.476621Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7a18b91a-71a3-45f8-badd-760b2c120569/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:01:27Z",
    "sequence": 1793264487230
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7a18b91a-71a3-45f8-badd-760b2c120569",
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
  "last_heartbeat_at": "2026-10-29T09:01:27.246194Z",
  "last_location_at": "2026-10-29T09:01:27.246194Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668140616",
  "device_ref": "sandbox-9966"
}
```

```json
{
  "challenge_id": "ffa8e952-e4aa-42fa-b1a0-d30d80bc7ade",
  "expires_at": "2026-10-29T09:06:27.4285988Z",
  "resend_available_at": "2026-10-29T09:01:28.4285988Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668140616` → **200**

```json
{
  "phone": "+380668140616",
  "audience": "CLIENT",
  "code": "407751",
  "sent_at": "2026-10-29T09:01:27.43057028Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ffa8e952-e4aa-42fa-b1a0-d30d80bc7ade",
  "code": "407751",
  "device_ref": "sandbox-9966"
}
```

```json
{
  "session_id": "3c3ebf4c-a61e-4156-8603-319fec3a4fd4",
  "subject": {
    "type": "CLIENT",
    "id": "330299a7-7d04-4650-85a1-2490237582aa"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMzAyOTlhNy03ZDA0LTQ2NTAtODVhMS0yNDkwMjM3NTgyYWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1Mzg3LCJpYXQiOjE3OTMyNjQ0ODcsImp0aSI6ImEwMzY3NzlhLWJiZDYtNDI1YS1hZTgzLWMxNjFiNDhlNTlmOSIsInNpZCI6IjNjM2ViZjRjLWE2MWUtNDE1Ni04NjAzLTMxOWZlYzNhNGZkNCJ9.r_7Atwc7D0gFtEGurNM9DBH557xvgPw8BF1P_1BxB80",
  "access_expires_at": "2026-10-29T09:16:27.644744833Z",
  "refresh_token": "16jt25G_rNuFdv_VDhOm8cO0Zp1jmWwFRFaDobQ8d30",
  "refresh_expires_at": "2026-11-28T09:01:27.644294493Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2fa4b9d2-02b1-4a8f-804b-966d8848cf67",
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
  "id": "6a7091f6-0e98-4c42-b0d9-ccee692d950b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:06:27.845274Z",
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
  "command_id": "de814de1-f138-4f13-b2b8-9e11275a5c05",
  "quote_id": "6a7091f6-0e98-4c42-b0d9-ccee692d950b",
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
  "id": "cf96d530-5e44-4885-83d8-9c0859af2140",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "330299a7-7d04-4650-85a1-2490237582aa",
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
  "created_at": "2026-10-29T09:01:28.045222Z",
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
    "id": "32651c4f-8c96-4012-9e6f-c7a83d699ddc",
    "order_id": "cf96d530-5e44-4885-83d8-9c0859af2140",
    "expires_at": "2026-10-29T09:01:43.047351Z",
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

`POST /api/driver/v1/offers/32651c4f-8c96-4012-9e6f-c7a83d699ddc/accept` → **200**

```json
{
  "command_id": "14e81dcf-3246-4e64-9477-048fc69ce722"
}
```

```json
{
  "id": "3c541947-3a26-43d5-ab46-3197be85f902",
  "order_id": "cf96d530-5e44-4885-83d8-9c0859af2140",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8336baf6-1ad1-4c2d-beb1-7fa0d2b905dc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8336baf6-1ad1-4c2d-beb1-7fa0d2b905dc",
  "order_id": "cf96d530-5e44-4885-83d8-9c0859af2140",
  "assignment_id": "3c541947-3a26-43d5-ab46-3197be85f902",
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

`POST /api/driver/v1/work-sessions/7a18b91a-71a3-45f8-badd-760b2c120569/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:01:28Z",
    "sequence": 1793264488801
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7a18b91a-71a3-45f8-badd-760b2c120569",
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
  "last_heartbeat_at": "2026-10-29T09:01:28.817391Z",
  "last_location_at": "2026-10-29T09:01:28.817391Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8336baf6-1ad1-4c2d-beb1-7fa0d2b905dc/arrive` → **200**

```json
{
  "command_id": "146c199c-692f-4c52-a630-a34ff31b837b",
  "expected_version": 0
}
```

```json
{
  "id": "8336baf6-1ad1-4c2d-beb1-7fa0d2b905dc",
  "order_id": "cf96d530-5e44-4885-83d8-9c0859af2140",
  "assignment_id": "3c541947-3a26-43d5-ab46-3197be85f902",
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
  "arrived_at": "2026-10-29T09:01:29.012359Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8336baf6-1ad1-4c2d-beb1-7fa0d2b905dc/start` → **200**

```json
{
  "command_id": "8c7f34dd-5d31-4724-8128-25f25ad1bc35",
  "expected_version": 1
}
```

```json
{
  "id": "8336baf6-1ad1-4c2d-beb1-7fa0d2b905dc",
  "order_id": "cf96d530-5e44-4885-83d8-9c0859af2140",
  "assignment_id": "3c541947-3a26-43d5-ab46-3197be85f902",
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
  "arrived_at": "2026-10-29T09:01:29.012359Z",
  "started_at": "2026-10-29T09:01:29.209335Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/7a18b91a-71a3-45f8-badd-760b2c120569/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:01:29Z",
    "sequence": 1793264489405
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7a18b91a-71a3-45f8-badd-760b2c120569",
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
  "last_heartbeat_at": "2026-10-29T09:01:29.42138Z",
  "last_location_at": "2026-10-29T09:01:29.42138Z",
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
  "device_ref": "sandbox-23150"
}
```

```json
{
  "challenge_id": "bb7ca31e-206f-4ce8-8e49-c8ec7f74a1b0",
  "expires_at": "2026-10-29T09:06:29.595787671Z",
  "resend_available_at": "2026-10-29T09:01:30.595787671Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "643506",
  "sent_at": "2026-10-29T09:01:29.59782813Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bb7ca31e-206f-4ce8-8e49-c8ec7f74a1b0",
  "code": "643506",
  "device_ref": "sandbox-23150"
}
```

```json
{
  "session_id": "19a93c9d-d0f4-4136-a6c4-985f5e2359b1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTM4OSwiaWF0IjoxNzkzMjY0NDg5LCJqdGkiOiI1YTYyZGZmZi0xZTVkLTQ1MzYtOTc5My0wMTIwNDU1ZjE1ZGQiLCJzaWQiOiIxOWE5M2M5ZC1kMGY0LTQxMzYtYTZjNC05ODVmNWUyMzU5YjEifQ.zqcnMLLvc_grZ-1geuYoNTSdGj_tg6cwuqIrbq8D9gc",
  "access_expires_at": "2026-10-29T09:16:29.812544626Z",
  "refresh_token": "otnMFIvOfT4J7sNCko5HiQBe5TDrmCVINecwiRUyI4A",
  "refresh_expires_at": "2026-11-28T09:01:29.812168949Z",
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
  "command_id": "6efbb41e-4268-4077-bc76-9f0b3cc14a82",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:01:30Z",
    "sequence": 1793264490207
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "208171bf-ffd7-4184-ac83-046099311bd1",
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
  "last_heartbeat_at": "2026-10-29T09:01:30.223187Z",
  "last_location_at": "2026-10-29T09:01:30.223187Z",
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
  "session_id": "b2c1bd2a-d3fe-400d-b14a-1c79e8295e1d",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUzOTAsImlhdCI6MTc5MzI2NDQ5MCwianRpIjoiMmU1Zjc4NjktZDkxYy00OGVjLThiYTgtYTQ4YjA3MWE3ODU2Iiwic2lkIjoiYjJjMWJkMmEtZDNmZS00MDBkLWIxNGEtMWM3OWU4Mjk1ZTFkIn0.TmAdwys8R3wcnYupbf0iXJxcMKc22JzG-WUmN3sNET0",
  "access_expires_at": "2026-10-29T09:16:30.608526691Z",
  "refresh_token": "flzTYWb_2F4nAvYN-K-_dkYRMPjN1jEE8HDEa0UI6xM",
  "refresh_expires_at": "2026-10-29T21:01:30.60821488Z",
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
  "session_id": "28016c87-7718-4cdb-8650-9e97a9467abf",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUzOTAsImlhdCI6MTc5MzI2NDQ5MCwianRpIjoiMDI0NjBhYTctNWM3Mi00NWFhLTllMWYtMzY3M2E5NDYxYzYyIiwic2lkIjoiMjgwMTZjODctNzcxOC00Y2RiLTg2NTAtOWU5N2E5NDY3YWJmIn0.Z0SiTLCX3VbPsWwc-BuWu6yxvBCLE4OZLBIlBO7F_iQ",
  "access_expires_at": "2026-10-29T09:16:30.98682658Z",
  "refresh_token": "ap8khlKJg8iI7dqZmSF7YOe3KC--6eRe2eEbO4zxYbU",
  "refresh_expires_at": "2026-10-29T21:01:30.986468726Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/cf96d530-5e44-4885-83d8-9c0859af2140` → **200**

```json
{
  "id": "cf96d530-5e44-4885-83d8-9c0859af2140",
  "short_number": 14,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "330299a7-7d04-4650-85a1-2490237582aa",
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
    "id": "3c541947-3a26-43d5-ab46-3197be85f902",
    "order_id": "cf96d530-5e44-4885-83d8-9c0859af2140",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "8336baf6-1ad1-4c2d-beb1-7fa0d2b905dc",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T09:01:28.045222Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/cf96d530-5e44-4885-83d8-9c0859af2140/interrupt` → **200**

```json
{
  "command_id": "97f61020-ca44-48bf-9e4b-1c381abaaab7",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "cf96d530-5e44-4885-83d8-9c0859af2140",
    "short_number": 14,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "330299a7-7d04-4650-85a1-2490237582aa",
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
      "id": "3c541947-3a26-43d5-ab46-3197be85f902",
      "order_id": "cf96d530-5e44-4885-83d8-9c0859af2140",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "8336baf6-1ad1-4c2d-beb1-7fa0d2b905dc",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T09:01:28.045222Z",
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
    "id": "d5bbe737-74aa-497c-8590-73c64fd5186d",
    "short_number": 15,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "330299a7-7d04-4650-85a1-2490237582aa",
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
    "id": "4ea877d7-a8a2-4942-b5c0-84f1c74f3689",
    "order_id": "d5bbe737-74aa-497c-8590-73c64fd5186d",
    "expires_at": "2026-10-29T09:01:46.366562Z",
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

`POST /api/driver/v1/offers/4ea877d7-a8a2-4942-b5c0-84f1c74f3689/accept` → **200**

```json
{
  "command_id": "4db44a7b-23b5-46d7-a4cd-fb90e365a397"
}
```

```json
{
  "id": "7177b4e3-93ba-4891-81c3-249b726f5692",
  "order_id": "d5bbe737-74aa-497c-8590-73c64fd5186d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a4e9eb62-199d-4edb-a0a5-783209bcd79a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a4e9eb62-199d-4edb-a0a5-783209bcd79a",
  "order_id": "d5bbe737-74aa-497c-8590-73c64fd5186d",
  "assignment_id": "7177b4e3-93ba-4891-81c3-249b726f5692",
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
  "session_id": "208171bf-ffd7-4184-ac83-046099311bd1",
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
  "last_heartbeat_at": "2026-10-29T09:01:30.223187Z",
  "last_location_at": "2026-10-29T09:01:30.223187Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/208171bf-ffd7-4184-ac83-046099311bd1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:01:32Z",
    "sequence": 1793264492280
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "208171bf-ffd7-4184-ac83-046099311bd1",
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
  "last_heartbeat_at": "2026-10-29T09:01:32.295767Z",
  "last_location_at": "2026-10-29T09:01:32.295767Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a4e9eb62-199d-4edb-a0a5-783209bcd79a/arrive` → **200**

```json
{
  "command_id": "04196afb-8300-42de-b9de-02c1e70f35e1",
  "expected_version": 0
}
```

```json
{
  "id": "a4e9eb62-199d-4edb-a0a5-783209bcd79a",
  "order_id": "d5bbe737-74aa-497c-8590-73c64fd5186d",
  "assignment_id": "7177b4e3-93ba-4891-81c3-249b726f5692",
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
  "arrived_at": "2026-10-29T09:01:32.483302Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a4e9eb62-199d-4edb-a0a5-783209bcd79a/start` → **200**

```json
{
  "command_id": "0380aa22-2058-4f08-836b-b5f1c7133467",
  "expected_version": 1
}
```

```json
{
  "id": "a4e9eb62-199d-4edb-a0a5-783209bcd79a",
  "order_id": "d5bbe737-74aa-497c-8590-73c64fd5186d",
  "assignment_id": "7177b4e3-93ba-4891-81c3-249b726f5692",
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
  "arrived_at": "2026-10-29T09:01:32.483302Z",
  "started_at": "2026-10-29T09:01:32.673243Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a4e9eb62-199d-4edb-a0a5-783209bcd79a/complete` → **200**

```json
{
  "command_id": "ced003d4-7976-44ba-900f-0d1865b12890",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:01:32Z"
}
```

```json
{
  "id": "a4e9eb62-199d-4edb-a0a5-783209bcd79a",
  "order_id": "d5bbe737-74aa-497c-8590-73c64fd5186d",
  "assignment_id": "7177b4e3-93ba-4891-81c3-249b726f5692",
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
  "arrived_at": "2026-10-29T09:01:32.483302Z",
  "started_at": "2026-10-29T09:01:32.673243Z",
  "completed_at": "2026-10-29T09:01:32.869674Z",
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
    "id": "d5bbe737-74aa-497c-8590-73c64fd5186d",
    "short_number": 15,
    "status": "FULFILLED",
    "created_at": "2026-10-29T09:01:31.358446Z",
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
    "id": "cf96d530-5e44-4885-83d8-9c0859af2140",
    "short_number": 14,
    "status": "CANCELLED",
    "created_at": "2026-10-29T09:01:28.045222Z",
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

`GET /api/operator/v1/orders/cf96d530-5e44-4885-83d8-9c0859af2140/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T09:01:28.045611Z",
      "actor": {
        "type": "CLIENT",
        "id": "330299a7-7d04-4650-85a1-2490237582aa",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "cf96d530-5e44-4885-83d8-9c0859af2140",
        "quote_id": "6a7091f6-0e98-4c42-b0d9-ccee692d950b",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "8facbcea-f75e-4f5a-a526-8bdf3f27e821"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T09:01:28.046878Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "cf96d530-5e44-4885-83d8-9c0859af2140",
        "attempt_id": "c6779c10-8640-4174-9400-3347d7d6b26c",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8facbcea-f75e-4f5a-a526-8bdf3f27e821"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T09:01:28.048582Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "32651c4f-8c96-4012-9e6f-c7a83d699ddc",
        "order_id": "cf96d530-5e44-4885-83d8-9c0859af2140",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "8facbcea-f75e-4f5a-a526-8bdf3f27e821"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T09:01:28.442108Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "32651c4f-8c96-4012-9e6f-c7a83d699ddc",
        "order_id": "cf96d530-5e44-4885-83d8-9c0859af2140",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "3c541947-3a26-43d5-ab46-3197be85f902"
      },
      "correlation_id": "968c7d01-8c1f-41e1-b857-35f51fb45b92"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/d5bbe737-74aa-497c-8590-73c64fd5186d/tip` → **200**

```json
{
  "order_id": "d5bbe737-74aa-497c-8590-73c64fd5186d",
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
  "available_until": "2026-10-30T09:01:32.869674Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/d5bbe737-74aa-497c-8590-73c64fd5186d/tip` → **409**

```json
{
  "command_id": "b689cd2a-a5a7-4930-b6f2-3884243f34fb",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/d5bbe737-74aa-497c-8590-73c64fd5186d/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "27d2695f-2470-43b2-a2d5-a96f9e4034b0"
}
```

Done: interrupted cf96d530-5e44-4885-83d8-9c0859af2140, follow-up d5bbe737-74aa-497c-8590-73c64fd5186d.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7a18b91a-71a3-45f8-badd-760b2c120569",
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
  "last_heartbeat_at": "2026-10-29T09:01:29.42138Z",
  "last_location_at": "2026-10-29T09:01:29.42138Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7a18b91a-71a3-45f8-badd-760b2c120569/close` → **200**

```json
{
  "command_id": "57080064-b5ac-4540-8540-72636d95739e",
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
  "session_id": "208171bf-ffd7-4184-ac83-046099311bd1",
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
  "last_heartbeat_at": "2026-10-29T09:01:32.295767Z",
  "last_location_at": "2026-10-29T09:01:32.295767Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/208171bf-ffd7-4184-ac83-046099311bd1/close` → **200**

```json
{
  "command_id": "7d1e5140-ec4e-4487-a59f-38cae55873b9",
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
  "session_id": "ebaae503-9c25-46f0-863f-cbd3cf2250ec",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjUzOTcsImlhdCI6MTc5MzI2NDQ5NywianRpIjoiYjE3YTM4ZTUtMTRjZC00OTJmLWI3ZDItYzQ1ZTllOTMwMjZiIiwic2lkIjoiZWJhYWU1MDMtOWMyNS00NmYwLTg2M2YtY2JkM2NmMjI1MGVjIn0._pbH4EeXZt1qEZl_mO0OAjsQuRMWhQLc1G1KC7zrTFk",
  "access_expires_at": "2026-10-29T09:16:37.923624192Z",
  "refresh_token": "dn64r52CYwAkhH2vfSvQrZtqr-HKamv6H_NGxTp7X4w",
  "refresh_expires_at": "2026-10-29T21:01:37.923074542Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "caad6816-7e90-421e-a962-46d9e9833abb",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T09:01:38Z"
}
```

```json
{
  "id": "d8c128ca-6154-438e-80ec-77246e8d7e5c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T09:01:38Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/d8c128ca-6154-438e-80ec-77246e8d7e5c/publish` → **200**

```json
{
  "command_id": "82e6b4f9-c164-4deb-a700-8f6baf9a0572",
  "expected_version": 0
}
```

```json
{
  "id": "d8c128ca-6154-438e-80ec-77246e8d7e5c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T09:01:38.315981Z",
  "published_at": "2026-10-29T09:01:38.315981Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "d8c128ca-6154-438e-80ec-77246e8d7e5c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T09:01:38.315981Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638130065",
  "device_ref": "sandbox-5551"
}
```

```json
{
  "challenge_id": "05afa4b9-b4ea-4c69-bef3-c1063dc28e47",
  "expires_at": "2026-10-29T09:06:38.681248281Z",
  "resend_available_at": "2026-10-29T09:01:39.681248281Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638130065` → **200**

```json
{
  "phone": "+380638130065",
  "audience": "CLIENT",
  "code": "147698",
  "sent_at": "2026-10-29T09:01:38.684667132Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "05afa4b9-b4ea-4c69-bef3-c1063dc28e47",
  "code": "147698",
  "device_ref": "sandbox-5551"
}
```

```json
{
  "session_id": "d7417317-9a3b-444e-bbc2-a456120d2fe8",
  "subject": {
    "type": "CLIENT",
    "id": "5400c62c-5a43-4cea-bbf8-1ad51d5aab62"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDAwYzYyYy01YTQzLTRjZWEtYmJmOC0xYWQ1MWQ1YWFiNjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1Mzk4LCJpYXQiOjE3OTMyNjQ0OTgsImp0aSI6IjVkZGJmMzJiLTdjODEtNGM0My1iMWFjLTE1ZWU3NTdmY2RlMyIsInNpZCI6ImQ3NDE3MzE3LTlhM2ItNDQ0ZS1iYmMyLWE0NTYxMjBkMmZlOCJ9.WOSPJdStxI5v4nxPAExiMSgwbD-ASZSGQ4bdNqG3B9Q",
  "access_expires_at": "2026-10-29T09:16:38.888287258Z",
  "refresh_token": "4AYztHFmfaa_SN3VMNKVRrZ6OnbkOmbaqvuVaUfuZmM",
  "refresh_expires_at": "2026-11-28T09:01:38.88790434Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "d8c128ca-6154-438e-80ec-77246e8d7e5c",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T09:01:38.315981Z",
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
  "command_id": "1fe59dcd-fcbd-4cd2-98d2-eb160021bbb3",
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
  "id": "89c877d0-7f6d-4925-8795-04d03bb29e39",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:06:39.254398Z",
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
  "command_id": "4785937a-b43f-4ac1-b009-909a4b533d45",
  "quote_id": "89c877d0-7f6d-4925-8795-04d03bb29e39",
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
  "correlation_id": "d16b3752-7300-4993-a6bd-19956f9d0df9"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "d0028d07-7a16-4a05-a783-85d8e34117eb",
  "version_id": "d8c128ca-6154-438e-80ec-77246e8d7e5c",
  "language": "uk"
}
```

```json
{
  "version_id": "d8c128ca-6154-438e-80ec-77246e8d7e5c",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T09:01:39.635925Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "77ea9213-a22f-4323-ac01-ac9c7c9d3d57",
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
  "id": "bc25ded8-27ac-4e0d-bef6-97e2519fd3ba",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:06:39.822182Z",
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
  "command_id": "2e6e4203-4fcf-4594-b6e6-41f60ffa883e",
  "quote_id": "bc25ded8-27ac-4e0d-bef6-97e2519fd3ba",
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
  "id": "b33bca53-7aed-4fc3-b97f-2e85cb5fab22",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5400c62c-5a43-4cea-bbf8-1ad51d5aab62",
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
  "created_at": "2026-10-29T09:01:40.011334Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b33bca53-7aed-4fc3-b97f-2e85cb5fab22` → **200**

```json
{
  "id": "b33bca53-7aed-4fc3-b97f-2e85cb5fab22",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5400c62c-5a43-4cea-bbf8-1ad51d5aab62",
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
  "created_at": "2026-10-29T09:01:40.011334Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b33bca53-7aed-4fc3-b97f-2e85cb5fab22/cancel` → **200**

```json
{
  "command_id": "65a005a5-4655-4c35-8383-1af9c1cb816c",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b33bca53-7aed-4fc3-b97f-2e85cb5fab22",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5400c62c-5a43-4cea-bbf8-1ad51d5aab62",
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
  "created_at": "2026-10-29T09:01:40.011334Z",
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

`POST /api/admin/v1/legal-documents/d8c128ca-6154-438e-80ec-77246e8d7e5c` → **409**

```json
{
  "command_id": "2cad5ca4-cb44-4e4d-868b-f309ae3ed228",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T09:01:40Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/d8c128ca-6154-438e-80ec-77246e8d7e5c",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e2d89643-9960-4848-823c-302b06c6c95a"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "60ce584c-5b87-4965-b39f-3d5747325169",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T09:01:40Z"
}
```

```json
{
  "id": "3a42e85f-b61d-47d2-b92d-86c01429b20c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T09:01:40Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/3a42e85f-b61d-47d2-b92d-86c01429b20c/publish` → **200**

```json
{
  "command_id": "c90250e6-88fe-4fef-871c-f7ed829665ab",
  "expected_version": 0
}
```

```json
{
  "id": "3a42e85f-b61d-47d2-b92d-86c01429b20c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T09:01:40.99785Z",
  "published_at": "2026-10-29T09:01:40.99785Z",
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
  "device_ref": "sandbox-10151"
}
```

```json
{
  "challenge_id": "39682e06-a087-4df5-9ae0-c3a8a9d2e4a0",
  "expires_at": "2026-10-29T09:06:41.186500848Z",
  "resend_available_at": "2026-10-29T09:01:42.186500848Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "167320",
  "sent_at": "2026-10-29T09:01:41.188488739Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "39682e06-a087-4df5-9ae0-c3a8a9d2e4a0",
  "code": "167320",
  "device_ref": "sandbox-10151"
}
```

```json
{
  "session_id": "19b7d3bf-cb1b-424f-8dfa-4ffa6a39e7d8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTQwMSwiaWF0IjoxNzkzMjY0NTAxLCJqdGkiOiIwODIzMDVjMS03MjVlLTQxZTAtYTdkYy0yOTgzOTE5ZGYyNjgiLCJzaWQiOiIxOWI3ZDNiZi1jYjFiLTQyNGYtOGRmYS00ZmZhNmEzOWU3ZDgifQ.upm854AeAvx910o6yI1fZ1yvq5T9C43JvCXxAVh3cdo",
  "access_expires_at": "2026-10-29T09:16:41.387686046Z",
  "refresh_token": "27AyJ11U9u0LIO8NwBckIbmkp2sba9BPPsyHLnBSiAU",
  "refresh_expires_at": "2026-11-28T09:01:41.387266763Z",
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
  "command_id": "e45e2ca8-1fb1-445f-bf22-83cb12c04020",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:01:41Z",
    "sequence": 1793264501745
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "19b5fe88-4f19-4bc2-84e0-ca656c8a2e10",
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
  "last_heartbeat_at": "2026-10-29T09:01:41.760527Z",
  "last_location_at": "2026-10-29T09:01:41.760527Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675977162",
  "device_ref": "sandbox-30371"
}
```

```json
{
  "challenge_id": "3b993673-b34a-4b5a-a8f8-8bc283d5f06d",
  "expires_at": "2026-10-29T09:06:41.941799461Z",
  "resend_available_at": "2026-10-29T09:01:42.941799461Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675977162` → **200**

```json
{
  "phone": "+380675977162",
  "audience": "CLIENT",
  "code": "497301",
  "sent_at": "2026-10-29T09:01:41.94403083Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b993673-b34a-4b5a-a8f8-8bc283d5f06d",
  "code": "497301",
  "device_ref": "sandbox-30371"
}
```

```json
{
  "session_id": "75f13d12-6ff6-45b9-af4e-30d6ceac204c",
  "subject": {
    "type": "CLIENT",
    "id": "b0849173-c7bf-445d-9266-9f3e37822630"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMDg0OTE3My1jN2JmLTQ0NWQtOTI2Ni05ZjNlMzc4MjI2MzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1NDAyLCJpYXQiOjE3OTMyNjQ1MDIsImp0aSI6Ijk3MWM5ODZkLTVkMTYtNDlkMi1hMWUyLWE3ZWQ0Zjc4YWJkOCIsInNpZCI6Ijc1ZjEzZDEyLTZmZjYtNDViOS1hZjRlLTMwZDZjZWFjMjA0YyJ9.zd61gnhUf1gXnWZM063tSAMxjlC9i747L4PU9Xb93v0",
  "access_expires_at": "2026-10-29T09:16:42.153548696Z",
  "refresh_token": "uPdkO_ojSpm2oCJOKBYb5rDNL3rk9BVPYnMJ1PzAfHA",
  "refresh_expires_at": "2026-11-28T09:01:42.153084586Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b1f6af63-5dd8-49b7-a95b-37a239511a6c",
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
  "id": "5d74011b-fe63-4f95-91bd-df9ccab5f3f1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:06:42.346053Z",
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
  "command_id": "5d404830-6a94-47b6-9f09-82482756e4dc",
  "quote_id": "5d74011b-fe63-4f95-91bd-df9ccab5f3f1",
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
    "phone": "+380674823483"
  }
}
```

```json
{
  "id": "7a89b2a0-dff3-45f0-80b5-c6922a57c1b2",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b0849173-c7bf-445d-9266-9f3e37822630",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T09:01:42.538623Z",
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
    "id": "2676f7e8-39b2-4e2e-a2fc-808a2b64b9c9",
    "order_id": "7a89b2a0-dff3-45f0-80b5-c6922a57c1b2",
    "expires_at": "2026-10-29T09:01:57.540853Z",
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

`POST /api/driver/v1/offers/2676f7e8-39b2-4e2e-a2fc-808a2b64b9c9/accept` → **200**

```json
{
  "command_id": "5fc01ea3-84b8-436d-9cd8-ed0bc09fdf4c"
}
```

```json
{
  "id": "2f804da3-ac48-47ca-a86a-db66c8295e05",
  "order_id": "7a89b2a0-dff3-45f0-80b5-c6922a57c1b2",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "30dcd5f0-0536-4340-822b-7ffc62f8af72",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "30dcd5f0-0536-4340-822b-7ffc62f8af72",
  "order_id": "7a89b2a0-dff3-45f0-80b5-c6922a57c1b2",
  "assignment_id": "2f804da3-ac48-47ca-a86a-db66c8295e05",
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
    "phone": "+380674823483"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "742fb844-ffea-443a-8645-53424e625575",
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
  "id": "ed545c0b-a0bd-4545-93de-6344bbacbd73",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:06:43.299479Z",
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
  "command_id": "1e23c44e-9d1e-4b8a-a51a-2cb362657ff4",
  "quote_id": "ed545c0b-a0bd-4545-93de-6344bbacbd73",
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
  "id": "dc8616d8-7b32-4700-8b61-346defa01abf",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b0849173-c7bf-445d-9266-9f3e37822630",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:01:43.49797Z",
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
  "command_id": "4aabca73-7bd3-4efc-905e-6d421a5c560d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T12:01:43Z"
}
```

```json
{
  "id": "616b2adc-a80c-48b1-a981-009eaede44ae",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:06:43.738499Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T12:01:43Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "505766f5-4e68-481a-85f1-ce96fbf3365e",
  "quote_id": "616b2adc-a80c-48b1-a981-009eaede44ae",
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
  "pickup_at": "2026-10-29T12:01:43Z"
}
```

```json
{
  "id": "be7448ff-fc0f-4426-9402-d331df587f83",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b0849173-c7bf-445d-9266-9f3e37822630",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T09:01:43.929189Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T12:01:43Z",
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
  "command_id": "cc472928-3eb5-4bf5-a9c9-ad7296d5ea8a",
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
  "id": "89cb625f-346a-48cd-9716-6ad30b1572f1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:06:44.129014Z",
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
  "command_id": "c6fa7a25-4041-49ad-ad1b-c54ac26ce631",
  "quote_id": "89cb625f-346a-48cd-9716-6ad30b1572f1",
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
  "correlation_id": "6c4a0577-999f-4a16-a4a6-f1f87c7c8765"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "be7448ff-fc0f-4426-9402-d331df587f83",
      "short_number": 19,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "b0849173-c7bf-445d-9266-9f3e37822630",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T09:01:43.929189Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T12:01:43Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "dc8616d8-7b32-4700-8b61-346defa01abf",
      "short_number": 18,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "b0849173-c7bf-445d-9266-9f3e37822630",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T09:01:43.49797Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "7a89b2a0-dff3-45f0-80b5-c6922a57c1b2",
      "short_number": 17,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "dc8616d8-7b32-4700-8b61-346defa01abf",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b0849173-c7bf-445d-9266-9f3e37822630",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:01:43.49797Z",
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

`GET /api/rider/v1/orders/7a89b2a0-dff3-45f0-80b5-c6922a57c1b2` → **200**

```json
{
  "id": "7a89b2a0-dff3-45f0-80b5-c6922a57c1b2",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b0849173-c7bf-445d-9266-9f3e37822630",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "2f804da3-ac48-47ca-a86a-db66c8295e05",
    "order_id": "7a89b2a0-dff3-45f0-80b5-c6922a57c1b2",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "30dcd5f0-0536-4340-822b-7ffc62f8af72",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T09:01:42.538623Z",
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
    "location_at": "2026-10-29T09:01:41.760527Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/7a89b2a0-dff3-45f0-80b5-c6922a57c1b2/cancel` → **200**

```json
{
  "command_id": "d1f06a87-1c70-4102-98ef-6df61dfa9839",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7a89b2a0-dff3-45f0-80b5-c6922a57c1b2",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "b0849173-c7bf-445d-9266-9f3e37822630",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "2f804da3-ac48-47ca-a86a-db66c8295e05",
    "order_id": "7a89b2a0-dff3-45f0-80b5-c6922a57c1b2",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "30dcd5f0-0536-4340-822b-7ffc62f8af72",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T09:01:42.538623Z",
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

`GET /api/rider/v1/orders/dc8616d8-7b32-4700-8b61-346defa01abf` → **200**

```json
{
  "id": "dc8616d8-7b32-4700-8b61-346defa01abf",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b0849173-c7bf-445d-9266-9f3e37822630",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:01:43.49797Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/dc8616d8-7b32-4700-8b61-346defa01abf/cancel` → **200**

```json
{
  "command_id": "e4eec1d9-4595-4f47-8161-dac47d555729",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "dc8616d8-7b32-4700-8b61-346defa01abf",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b0849173-c7bf-445d-9266-9f3e37822630",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T09:01:43.49797Z",
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

`GET /api/rider/v1/orders/be7448ff-fc0f-4426-9402-d331df587f83` → **200**

```json
{
  "id": "be7448ff-fc0f-4426-9402-d331df587f83",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b0849173-c7bf-445d-9266-9f3e37822630",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T09:01:43.929189Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T12:01:43Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/be7448ff-fc0f-4426-9402-d331df587f83/cancel` → **200**

```json
{
  "command_id": "eb659cd0-312d-44b1-98d0-073111883bc6",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "be7448ff-fc0f-4426-9402-d331df587f83",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "b0849173-c7bf-445d-9266-9f3e37822630",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T09:01:43.929189Z",
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
  "pickup_at": "2026-10-29T12:01:43Z",
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
  "session_id": "19b5fe88-4f19-4bc2-84e0-ca656c8a2e10",
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
  "last_heartbeat_at": "2026-10-29T09:01:41.760527Z",
  "last_location_at": "2026-10-29T09:01:41.760527Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19b5fe88-4f19-4bc2-84e0-ca656c8a2e10/close` → **200**

```json
{
  "command_id": "3c8b5d7a-b372-4ee8-962e-770b90d5a51a",
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

Done: orders 7a89b2a0-dff3-45f0-80b5-c6922a57c1b2, dc8616d8-7b32-4700-8b61-346defa01abf, be7448ff-fc0f-4426-9402-d331df587f83.

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
  "session_id": "bdd9d23e-8dac-432d-88df-e3905040427f",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjU0MDYsImlhdCI6MTc5MzI2NDUwNiwianRpIjoiZDc2MTc4YWQtOWEwYS00MTFhLWE3MjQtMDczOWNhMmM1NDY5Iiwic2lkIjoiYmRkOWQyM2UtOGRhYy00MzJkLTg4ZGYtZTM5MDUwNDA0MjdmIn0.KMVrzEoK7YvBluqXChDrsJIppd9a6dajUdf-AK_tcRE",
  "access_expires_at": "2026-10-29T09:16:46.602307539Z",
  "refresh_token": "DL4dFbZ1sD_0TJxgqS9cktexcUCkVnbEbBQdmPGl21Y",
  "refresh_expires_at": "2026-10-29T21:01:46.601969388Z",
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
  "session_id": "656862a1-d529-4a3a-8f76-16a7214e2659",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjU0MDYsImlhdCI6MTc5MzI2NDUwNiwianRpIjoiMDBhYTU5YzMtMzI2My00Yzc3LTg2N2UtOTAxYWNiMGFmOTU0Iiwic2lkIjoiNjU2ODYyYTEtZDUyOS00YTNhLThmNzYtMTZhNzIxNGUyNjU5In0.2Pe3l4BbmoymZ_9PIvAEpE4kYfonflfOcw2nfFM4ClI",
  "access_expires_at": "2026-10-29T09:16:46.986373942Z",
  "refresh_token": "YKsykBeLZQAzxs6Dy4k556pND8s0U2oqxovhQwk-pVU",
  "refresh_expires_at": "2026-10-29T21:01:46.985191317Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17040"
}
```

```json
{
  "challenge_id": "da875edf-21d7-472f-ac53-8e7ee0d116d0",
  "expires_at": "2026-10-29T09:06:47.164118958Z",
  "resend_available_at": "2026-10-29T09:01:48.164118958Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "707092",
  "sent_at": "2026-10-29T09:01:47.166087821Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "da875edf-21d7-472f-ac53-8e7ee0d116d0",
  "code": "707092",
  "device_ref": "sandbox-17040"
}
```

```json
{
  "session_id": "b0697d50-0622-4fbe-9654-7cb2459770ff",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTQwNywiaWF0IjoxNzkzMjY0NTA3LCJqdGkiOiJhMTViMmU3My0xZjgwLTQ2MjktOWM2Yi05MDFmZDNjMjk0NzEiLCJzaWQiOiJiMDY5N2Q1MC0wNjIyLTRmYmUtOTY1NC03Y2IyNDU5NzcwZmYifQ.A94YBD8NwoMsWK2QwIZCEMautED_uiBjHtzSid2fME8",
  "access_expires_at": "2026-10-29T09:16:47.367069197Z",
  "refresh_token": "NENdQKEUc7kgHnNhESUGNOdMu0v-Y8VFaG3uoRGWokM",
  "refresh_expires_at": "2026-11-28T09:01:47.366714431Z",
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
  "command_id": "ab2862e4-6d41-4811-bb64-b41a14d38577",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:01:47Z",
    "sequence": 1793264507724
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1349aad0-dda0-4529-92e8-310eea79c802",
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
  "last_heartbeat_at": "2026-10-29T09:01:47.739792Z",
  "last_location_at": "2026-10-29T09:01:47.739792Z",
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
  "command_id": "68f9be73-3f41-4695-a0de-4b7372d44df7",
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
  "effective_at": "2026-10-29T09:01:48.111429Z",
  "changed_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T09:00:00.097075Z",
  "last_entries": [
    {
      "order_id": "473e8364-2325-40ca-9fe4-994df706bc38",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T09:00:00.097075Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "83b8cbae-2ff1-4960-bda6-a67f7525afc4",
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
  "id": "a72b28af-ad63-44d2-8723-1b16ff09617d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:06:48.476332Z",
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
  "command_id": "69fa9ca7-7550-4cf2-8280-8b40c46e4645",
  "quote_id": "a72b28af-ad63-44d2-8723-1b16ff09617d",
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
    "phone": "+3806711129762"
  }
}
```

```json
{
  "id": "add22ea5-4ec5-4a18-889a-3db0ca6c3ccc",
  "short_number": 20,
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
  "created_at": "2026-10-29T09:01:48.670218Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711129762"
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
    "id": "6258f987-b3fa-419a-a9ca-354a9c5b9537",
    "order_id": "add22ea5-4ec5-4a18-889a-3db0ca6c3ccc",
    "expires_at": "2026-10-29T09:02:03.672729Z",
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

`POST /api/driver/v1/offers/6258f987-b3fa-419a-a9ca-354a9c5b9537/accept` → **200**

```json
{
  "command_id": "ebf5fd92-8adc-419e-8d5a-5ee401819301"
}
```

```json
{
  "id": "e431cccd-9244-429e-b367-3240f2df9695",
  "order_id": "add22ea5-4ec5-4a18-889a-3db0ca6c3ccc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9b4caf0a-0883-4e82-9ecf-993ad1fcd92e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9b4caf0a-0883-4e82-9ecf-993ad1fcd92e",
  "order_id": "add22ea5-4ec5-4a18-889a-3db0ca6c3ccc",
  "assignment_id": "e431cccd-9244-429e-b367-3240f2df9695",
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
    "phone": "+3806711129762"
  }
}
```

`POST /api/driver/v1/work-sessions/1349aad0-dda0-4529-92e8-310eea79c802/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:01:49Z",
    "sequence": 1793264509405
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1349aad0-dda0-4529-92e8-310eea79c802",
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
  "last_heartbeat_at": "2026-10-29T09:01:49.420973Z",
  "last_location_at": "2026-10-29T09:01:49.420973Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9b4caf0a-0883-4e82-9ecf-993ad1fcd92e/arrive` → **200**

```json
{
  "command_id": "f73596b0-04e2-46cb-8fcf-d98b5d5fab4c",
  "expected_version": 0
}
```

```json
{
  "id": "9b4caf0a-0883-4e82-9ecf-993ad1fcd92e",
  "order_id": "add22ea5-4ec5-4a18-889a-3db0ca6c3ccc",
  "assignment_id": "e431cccd-9244-429e-b367-3240f2df9695",
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
  "arrived_at": "2026-10-29T09:01:49.615707Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711129762"
  }
}
```

`POST /api/driver/v1/trips/9b4caf0a-0883-4e82-9ecf-993ad1fcd92e/start` → **200**

```json
{
  "command_id": "c0af488b-c703-49c8-a85a-c110cc76509e",
  "expected_version": 1
}
```

```json
{
  "id": "9b4caf0a-0883-4e82-9ecf-993ad1fcd92e",
  "order_id": "add22ea5-4ec5-4a18-889a-3db0ca6c3ccc",
  "assignment_id": "e431cccd-9244-429e-b367-3240f2df9695",
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
  "arrived_at": "2026-10-29T09:01:49.615707Z",
  "started_at": "2026-10-29T09:01:49.812058Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711129762"
  }
}
```

`POST /api/driver/v1/trips/9b4caf0a-0883-4e82-9ecf-993ad1fcd92e/complete` → **200**

```json
{
  "command_id": "59d2a5b2-23b6-45e0-8b31-38a0c46c8ac3",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:01:50Z",
  "cash_received": true
}
```

```json
{
  "id": "9b4caf0a-0883-4e82-9ecf-993ad1fcd92e",
  "order_id": "add22ea5-4ec5-4a18-889a-3db0ca6c3ccc",
  "assignment_id": "e431cccd-9244-429e-b367-3240f2df9695",
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
  "arrived_at": "2026-10-29T09:01:49.615707Z",
  "started_at": "2026-10-29T09:01:49.812058Z",
  "completed_at": "2026-10-29T09:01:50.019263Z",
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
  "command_id": "52fa3669-7b7b-4414-9a7f-d74d63f05de4",
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
  "id": "85c3eebc-c675-409f-a0e0-8e23102de80b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:06:50.214472Z",
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
  "command_id": "d0a1eaa3-5fc4-4c62-a8b7-35b97222ae82",
  "quote_id": "85c3eebc-c675-409f-a0e0-8e23102de80b",
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
    "phone": "+3806711115622"
  }
}
```

```json
{
  "id": "a5d59ad6-8d06-49ba-ac99-68f9f62b6896",
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
  "created_at": "2026-10-29T09:01:50.405212Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115622"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/a5d59ad6-8d06-49ba-ac99-68f9f62b6896` → **200**

```json
{
  "id": "a5d59ad6-8d06-49ba-ac99-68f9f62b6896",
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
  "created_at": "2026-10-29T09:01:50.405212Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115622"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a5d59ad6-8d06-49ba-ac99-68f9f62b6896/cancel` → **200**

```json
{
  "command_id": "0350cdf9-af5b-47eb-9197-36cf65a151b5",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "a5d59ad6-8d06-49ba-ac99-68f9f62b6896",
  "short_number": 21,
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
  "created_at": "2026-10-29T09:01:50.405212Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115622"
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
  "staff_id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T09:00:00.097075Z",
  "last_entries": [
    {
      "order_id": "a5d59ad6-8d06-49ba-ac99-68f9f62b6896",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T09:01:50.80411Z"
    },
    {
      "order_id": "add22ea5-4ec5-4a18-889a-3db0ca6c3ccc",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T09:01:50.022203Z"
    },
    {
      "order_id": "473e8364-2325-40ca-9fe4-994df706bc38",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T09:00:00.097075Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1349aad0-dda0-4529-92e8-310eea79c802",
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
  "last_heartbeat_at": "2026-10-29T09:01:49.420973Z",
  "last_location_at": "2026-10-29T09:01:49.420973Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1349aad0-dda0-4529-92e8-310eea79c802/close` → **200**

```json
{
  "command_id": "f41e28a4-2c6b-4637-802b-a632d955bbd9",
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

Done: operator bonus for fulfilled add22ea5-4ec5-4a18-889a-3db0ca6c3ccc and operator-fault cancellation a5d59ad6-8d06-49ba-ac99-68f9f62b6896.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672175053",
  "device_ref": "sandbox-31489"
}
```

```json
{
  "challenge_id": "d081cdca-f844-4feb-916d-0fdc3478fba9",
  "expires_at": "2026-10-29T09:06:54.82615953Z",
  "resend_available_at": "2026-10-29T09:01:55.82615953Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672175053` → **200**

```json
{
  "phone": "+380672175053",
  "audience": "CLIENT",
  "code": "996718",
  "sent_at": "2026-10-29T09:01:54.827933969Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674063621",
  "device_ref": "sandbox-32415",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "ff297ca3-30b6-4486-a83a-df516a4a3741",
  "expires_at": "2026-10-29T09:06:56.241882107Z",
  "resend_available_at": "2026-10-29T09:01:57.241882107Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674063621` → **200**

```json
{
  "phone": "+380674063621",
  "audience": "CLIENT",
  "code": "478822",
  "sent_at": "2026-10-29T09:01:56.243506038Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674063621",
  "device_ref": "sandbox-27519",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "efd51c42-d3fb-44fe-b344-500fecc57308",
  "expires_at": "2026-10-29T09:06:57.646059012Z",
  "resend_available_at": "2026-10-29T09:01:58.646059012Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380674063621` → **200**

```json
{
  "phone": "+380674063621",
  "audience": "CLIENT",
  "code": "873608",
  "sent_at": "2026-10-29T09:01:57.648052301Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679590000",
  "device_ref": "sandbox-31631"
}
```

```json
{
  "challenge_id": "cb35b144-cd63-40f6-8ba2-dc4d3445da1a",
  "expires_at": "2026-10-29T09:06:59.064500218Z",
  "resend_available_at": "2026-10-29T09:02:00.064500218Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679590000",
  "device_ref": "sandbox-1529"
}
```

```json
{
  "challenge_id": "893676ce-3490-4f88-929d-0bd21cf41d7c",
  "expires_at": "2026-10-29T09:07:00.446162999Z",
  "resend_available_at": "2026-10-29T09:02:01.446162999Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679590000` → **200**

```json
{
  "phone": "+380679590000",
  "audience": "CLIENT",
  "code": "538045",
  "sent_at": "2026-10-29T09:02:00.448378223Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679590000",
  "device_ref": "sandbox-17204",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "afed661d-9160-493e-a0c3-b945b10f9e49",
  "expires_at": "2026-10-29T09:07:01.852022564Z",
  "resend_available_at": "2026-10-29T09:02:02.852022564Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679590000` → **200**

```json
{
  "phone": "+380679590000",
  "audience": "CLIENT",
  "code": "773167",
  "sent_at": "2026-10-29T09:02:01.853980139Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380679590000",
  "device_ref": "sandbox-8104",
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
  "correlation_id": "91dfad06-91ce-4d78-a0ac-198c935bca03",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000032229"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "65bbbc6a-5d0d-4f04-8711-08f82bf6f924"
}
```

`GET /sandbox/v1/otp?phone=%2B442000032229` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120018110"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "a4654de3-00f4-42ad-a277-3de1bb3229aa"
}
```

`GET /sandbox/v1/otp?phone=%2B37120018110` → **404**

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
  "session_id": "8893aff5-4f19-4841-870f-792bedb71139",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjU0MjQsImlhdCI6MTc5MzI2NDUyNCwianRpIjoiZTg1YzFhYzUtYmZlMC00MGU5LWJlM2MtY2NkMTQ0ODk4Yjk0Iiwic2lkIjoiODg5M2FmZjUtNGYxOS00ODQxLTg3MGYtNzkyYmVkYjcxMTM5In0.NqC9hdvwk1myev8XeI8uzkunWRaomzkg3qTTK143L9g",
  "access_expires_at": "2026-10-29T09:17:04.040320722Z",
  "refresh_token": "5JC49p3lD-H0CweI9KpPH1r_ehOx7Ed85Vo4p6Y4NXA",
  "refresh_expires_at": "2026-10-29T21:02:04.039957374Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679590000` → **200**

```json
{
  "deliveries": [
    {
      "id": "fd97cb17-30ec-4d19-a848-4923ea742fb6",
      "challenge_id": "afed661d-9160-493e-a0c3-b945b10f9e49",
      "phone": "+380679590000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-f9eb489c-6e15-4923-9ca6-105498aa25d8",
      "error": null,
      "attempted_at": "2026-10-29T09:02:01.85428Z"
    },
    {
      "id": "89db1f0c-fc6d-4168-84b1-9ac3276bbd64",
      "challenge_id": "893676ce-3490-4f88-929d-0bd21cf41d7c",
      "phone": "+380679590000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-5b75dddf-5d62-437a-aaa8-2d0b0db0567a",
      "error": null,
      "attempted_at": "2026-10-29T09:02:00.448777Z"
    },
    {
      "id": "90ea81c8-cd28-4406-8557-0cbae32fc7ee",
      "challenge_id": "cb35b144-cd63-40f6-8ba2-dc4d3445da1a",
      "phone": "+380679590000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T09:01:59.066221Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380679590000` → **200**

```json
{
  "phone": "+380679590000",
  "audience": "CLIENT",
  "code": "773167",
  "sent_at": "2026-10-29T09:02:01.853980139Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674063621` → **200**

```json
{
  "deliveries": [
    {
      "id": "4a147a71-cc45-412a-99cd-63761afa0c45",
      "challenge_id": "efd51c42-d3fb-44fe-b344-500fecc57308",
      "phone": "+380674063621",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-123cac3a-333a-441e-9eb2-b0d52913d70b",
      "error": null,
      "attempted_at": "2026-10-29T09:01:57.648297Z"
    },
    {
      "id": "75867344-db1c-443d-bd48-5297f022c4de",
      "challenge_id": "ff297ca3-30b6-4486-a83a-df516a4a3741",
      "phone": "+380674063621",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-8266f7f4-9a4d-41a4-a7aa-41562f9c72a0",
      "error": null,
      "attempted_at": "2026-10-29T09:01:56.243754Z"
    }
  ]
}
```

Done: SMS to +380672175053; SMS then a call to +380674063621; a failed SMS, two calls and a refused third to +380679590000; +44 and +371 refused.

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
  "session_id": "24496371-a4c2-4582-94b0-730452d0f984",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjU0MjQsImlhdCI6MTc5MzI2NDUyNCwianRpIjoiYWE5ZjliMzgtNzQwOS00YzMxLWI2NTItOThlMDZjNmI1MDUzIiwic2lkIjoiMjQ0OTYzNzEtYTRjMi00NTgyLTk0YjAtNzMwNDUyZDBmOTg0In0.uy0QlyRl5uhrPv213Qm_NxICdsL1vNdY6RBPhu8lIBY",
  "access_expires_at": "2026-10-29T09:17:04.809183029Z",
  "refresh_token": "j-YAAT_rqKlyxBPri2nBBCYeOniBRFBHYDJ05DGBNLQ",
  "refresh_expires_at": "2026-10-29T21:02:04.808769284Z",
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
  "session_id": "22976a2e-30f0-4106-9a0a-d210a788c484",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjU0MjUsImlhdCI6MTc5MzI2NDUyNSwianRpIjoiYzc3YjBkMjktYjg2OC00MDBmLWFhMzgtZmI3ZmVjODljMDczIiwic2lkIjoiMjI5NzZhMmUtMzBmMC00MTA2LTlhMGEtZDIxMGE3ODhjNDg0In0.uDhUNQs7eBJvDbLa50tjbrqC0w0SKCO_GoVQTD7xOLE",
  "access_expires_at": "2026-10-29T09:17:05.200659272Z",
  "refresh_token": "Prb5ymYE_KP7oWyc-6_zdTGPdlOXP2U-rgkC6aTqfm4",
  "refresh_expires_at": "2026-10-29T21:02:05.200342184Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
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

`POST /api/admin/v1/staff-extensions/6ee6968e-c7cf-40fd-b22b-a4857fddd494` → **200**

```json
{
  "command_id": "24c75f54-8c41-41aa-8ef2-b49e9a4147f1",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "158992e1-4fa0-4d2c-9f12-d28f16799be8",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T09:02:05.922029Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T09:02:05.922029Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "0fd90af2-a2e7-47f2-85b6-c075338e3392",
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
  "id": "4830749f-6b64-471a-80dd-0f1668dacd0c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:07:06.285577Z",
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
  "command_id": "d517e860-3b02-4dcf-88d7-d607ca043c77",
  "quote_id": "4830749f-6b64-471a-80dd-0f1668dacd0c",
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
    "phone": "+380679733628"
  }
}
```

```json
{
  "id": "73a3c98b-5b22-4529-a2f2-4c052551b151",
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
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:02:06.471308Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679733628"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/73a3c98b-5b22-4529-a2f2-4c052551b151/calls` → **201**

```json
{
  "command_id": "7e6457b9-22d1-4ad6-87e1-3cf23528b9c3",
  "to": "CALLER"
}
```

```json
{
  "id": "6abe8d56-70db-4e50-b40e-b13ae054a4bf",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "order_ids": [
    "73a3c98b-5b22-4529-a2f2-4c052551b151"
  ],
  "started_at": "2026-10-29T09:02:06.672137Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/73a3c98b-5b22-4529-a2f2-4c052551b151/calls` → **201**

```json
{
  "command_id": "7e6457b9-22d1-4ad6-87e1-3cf23528b9c3",
  "to": "CALLER"
}
```

```json
{
  "id": "6abe8d56-70db-4e50-b40e-b13ae054a4bf",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "order_ids": [
    "73a3c98b-5b22-4529-a2f2-4c052551b151"
  ],
  "started_at": "2026-10-29T09:02:06.672137Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "6abe8d56-70db-4e50-b40e-b13ae054a4bf",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380679733628",
    "at": "2026-10-29T09:02:06.674018497Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "6abe8d56-70db-4e50-b40e-b13ae054a4bf",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.11626",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "6abe8d56-70db-4e50-b40e-b13ae054a4bf"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "6abe8d56-70db-4e50-b40e-b13ae054a4bf",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=73a3c98b-5b22-4529-a2f2-4c052551b151` → **200**

```json
{
  "calls": [
    {
      "id": "6abe8d56-70db-4e50-b40e-b13ae054a4bf",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "order_ids": [
        "73a3c98b-5b22-4529-a2f2-4c052551b151"
      ],
      "started_at": "2026-10-29T09:02:06.672137Z",
      "answered_at": "2026-10-29T09:02:07.097942Z",
      "ended_at": "2026-10-29T09:02:07.114934Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=73a3c98b-5b22-4529-a2f2-4c052551b151` → **200**

```json
{
  "calls": [
    {
      "id": "6abe8d56-70db-4e50-b40e-b13ae054a4bf",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "order_ids": [
        "73a3c98b-5b22-4529-a2f2-4c052551b151"
      ],
      "started_at": "2026-10-29T09:02:06.672137Z",
      "answered_at": "2026-10-29T09:02:07.097942Z",
      "ended_at": "2026-10-29T09:02:07.114934Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=73a3c98b-5b22-4529-a2f2-4c052551b151` → **200**

```json
{
  "calls": [
    {
      "id": "6abe8d56-70db-4e50-b40e-b13ae054a4bf",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "order_ids": [
        "73a3c98b-5b22-4529-a2f2-4c052551b151"
      ],
      "started_at": "2026-10-29T09:02:06.672137Z",
      "answered_at": "2026-10-29T09:02:07.097942Z",
      "ended_at": "2026-10-29T09:02:07.114934Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=73a3c98b-5b22-4529-a2f2-4c052551b151` → **200**

```json
{
  "calls": [
    {
      "id": "6abe8d56-70db-4e50-b40e-b13ae054a4bf",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "order_ids": [
        "73a3c98b-5b22-4529-a2f2-4c052551b151"
      ],
      "started_at": "2026-10-29T09:02:06.672137Z",
      "answered_at": "2026-10-29T09:02:07.097942Z",
      "ended_at": "2026-10-29T09:02:07.114934Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T09:02:11.533267Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/73a3c98b-5b22-4529-a2f2-4c052551b151` → **200**

```json
{
  "id": "73a3c98b-5b22-4529-a2f2-4c052551b151",
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
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:02:06.471308Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679733628"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/73a3c98b-5b22-4529-a2f2-4c052551b151/cancel` → **200**

```json
{
  "command_id": "4a9fa405-fe7f-42c8-9f46-ae31f967d2c9",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "73a3c98b-5b22-4529-a2f2-4c052551b151",
  "short_number": 22,
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
  "created_at": "2026-10-29T09:02:06.471308Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679733628"
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
  "command_id": "2a3a8243-251c-4765-bd26-fad3a2da1de1",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T09:02:14.270998Z",
  "extension": "101"
}
```

Done: outgoing call 6abe8d56-70db-4e50-b40e-b13ae054a4bf from order 73a3c98b-5b22-4529-a2f2-4c052551b151, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639095784",
  "device_ref": "sandbox-13829"
}
```

```json
{
  "challenge_id": "208b5da0-0d12-4fb9-a969-4f8191db6d39",
  "expires_at": "2026-10-29T09:07:14.458617424Z",
  "resend_available_at": "2026-10-29T09:02:15.458617424Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639095784` → **200**

```json
{
  "phone": "+380639095784",
  "audience": "CLIENT",
  "code": "392585",
  "sent_at": "2026-10-29T09:02:14.460652466Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "208b5da0-0d12-4fb9-a969-4f8191db6d39",
  "code": "392585",
  "device_ref": "sandbox-13829"
}
```

```json
{
  "session_id": "2cc666c0-0d4b-4011-afb6-f8423ae8a13e",
  "subject": {
    "type": "CLIENT",
    "id": "b54bb51b-afff-43b2-9df9-bcfec903bc6d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTRiYjUxYi1hZmZmLTQzYjItOWRmOS1iY2ZlYzkwM2JjNmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1NDM0LCJpYXQiOjE3OTMyNjQ1MzQsImp0aSI6IjJiZThkMTNkLTdhZTYtNGM1Yy05ZGUwLTRjMDAyNGM4MDUyYyIsInNpZCI6IjJjYzY2NmMwLTBkNGItNDAxMS1hZmI2LWY4NDIzYWU4YTEzZSJ9.cLCe6bCpydKxAhYQMRVZTIYFq4YxiiKDTvE5Ezqb4lw",
  "access_expires_at": "2026-10-29T09:17:14.662567013Z",
  "refresh_token": "TZoY4z0vILCW-MyYUqKvrftGA3KK6viv0of-IUFDXH8",
  "refresh_expires_at": "2026-11-28T09:02:14.662222613Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b54bb51b-afff-43b2-9df9-bcfec903bc6d",
  "session_id": "2cc666c0-0d4b-4011-afb6-f8423ae8a13e",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639095784",
  "device_ref": "sandbox-13401"
}
```

```json
{
  "challenge_id": "7c0283e0-7f2e-4904-912d-a036fe1fea91",
  "expires_at": "2026-10-29T09:07:17.012235231Z",
  "resend_available_at": "2026-10-29T09:02:18.012235231Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639095784` → **200**

```json
{
  "phone": "+380639095784",
  "audience": "CLIENT",
  "code": "795377",
  "sent_at": "2026-10-29T09:02:17.013959574Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7c0283e0-7f2e-4904-912d-a036fe1fea91",
  "code": "795377",
  "device_ref": "sandbox-13401"
}
```

```json
{
  "session_id": "4d17baf2-792c-4972-808d-96e881854e10",
  "subject": {
    "type": "CLIENT",
    "id": "b54bb51b-afff-43b2-9df9-bcfec903bc6d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTRiYjUxYi1hZmZmLTQzYjItOWRmOS1iY2ZlYzkwM2JjNmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1NDM3LCJpYXQiOjE3OTMyNjQ1MzcsImp0aSI6IjY5ZGQwNzg0LWU4MDEtNGM0OC04N2Y0LTI4Zjk2OTRhMzBkNyIsInNpZCI6IjRkMTdiYWYyLTc5MmMtNDk3Mi04MDhkLTk2ZTg4MTg1NGUxMCJ9.z80hm-XPiqvzI8MkKpgyd4LxeNAd69d_SXxUL7f2z_8",
  "access_expires_at": "2026-10-29T09:17:17.214322037Z",
  "refresh_token": "8EgjjmixFo3v5QTI_3LqHKdKYkmP-4vpnX0cq5lLbag",
  "refresh_expires_at": "2026-11-28T09:02:17.213750053Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "1b6be21c-ebe1-4d57-874e-f5095dfd0cf1",
  "expires_at": "2026-10-29T09:07:19.400375988Z",
  "resend_available_at": "2026-10-29T09:02:20.400375988Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639095784` → **200**

```json
{
  "phone": "+380639095784",
  "audience": "CLIENT",
  "code": "720851",
  "sent_at": "2026-10-29T09:02:19.401865687Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380637348320"
}
```

```json
{
  "challenge_id": "23037091-ef2d-468c-8329-088c1fbb270a",
  "expires_at": "2026-10-29T09:07:19.594968587Z",
  "resend_available_at": "2026-10-29T09:02:20.594968587Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637348320` → **200**

```json
{
  "phone": "+380637348320",
  "audience": "CLIENT",
  "code": "314963",
  "sent_at": "2026-10-29T09:02:19.596523505Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "086eda8e-ed5d-4964-a329-aae1b866f521",
  "current_challenge_id": "1b6be21c-ebe1-4d57-874e-f5095dfd0cf1",
  "current_code": "000000",
  "new_challenge_id": "23037091-ef2d-468c-8329-088c1fbb270a",
  "new_code": "314963"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "23c7c4f6-5ffc-47a6-bcc5-b47acb646ac9"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "b7ec35e6-4a7f-4da2-bc78-663626301a69",
  "current_challenge_id": "1b6be21c-ebe1-4d57-874e-f5095dfd0cf1",
  "current_code": "720851",
  "new_challenge_id": "23037091-ef2d-468c-8329-088c1fbb270a",
  "new_code": "314963"
}
```

```json
{
  "subject_id": "b54bb51b-afff-43b2-9df9-bcfec903bc6d",
  "phone": "+380637348320",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b54bb51b-afff-43b2-9df9-bcfec903bc6d",
  "session_id": "2cc666c0-0d4b-4011-afb6-f8423ae8a13e",
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
  "correlation_id": "127aceb1-36ab-4f7b-846c-153346825e1d"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637348320",
  "device_ref": "sandbox-11929"
}
```

```json
{
  "challenge_id": "f0e5b41e-5070-4991-9009-ebdcf6c94359",
  "expires_at": "2026-10-29T09:07:22.532930896Z",
  "resend_available_at": "2026-10-29T09:02:23.532930896Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637348320` → **200**

```json
{
  "phone": "+380637348320",
  "audience": "CLIENT",
  "code": "579940",
  "sent_at": "2026-10-29T09:02:22.534853569Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0e5b41e-5070-4991-9009-ebdcf6c94359",
  "code": "579940",
  "device_ref": "sandbox-11929"
}
```

```json
{
  "session_id": "21b3eae3-b61a-4a84-9753-0b312b83ec74",
  "subject": {
    "type": "CLIENT",
    "id": "b54bb51b-afff-43b2-9df9-bcfec903bc6d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTRiYjUxYi1hZmZmLTQzYjItOWRmOS1iY2ZlYzkwM2JjNmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1NDQyLCJpYXQiOjE3OTMyNjQ1NDIsImp0aSI6IjFmZmM4M2M3LWY1MTMtNDVmNy1hOTlkLWZkOGRkMjIzYTg1ZCIsInNpZCI6IjIxYjNlYWUzLWI2MWEtNGE4NC05NzUzLTBiMzEyYjgzZWM3NCJ9.54TDXsB0ZhOxtcrBemO0Ga6q4NAphA_iDo50ntaS08s",
  "access_expires_at": "2026-10-29T09:17:22.738397608Z",
  "refresh_token": "t7uLLWMefKahpWizLe278zqay3_AjupYzGAtYU823TU",
  "refresh_expires_at": "2026-11-28T09:02:22.738032085Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b54bb51b-afff-43b2-9df9-bcfec903bc6d",
  "session_id": "21b3eae3-b61a-4a84-9753-0b312b83ec74",
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
  "session_id": "64d568dd-8d2e-4926-92f6-d23d2aad8565",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjU0NDMsImlhdCI6MTc5MzI2NDU0MywianRpIjoiMGY5OWEzZDEtYjEzNS00ODM4LWFkNjAtZTEyMjc4NThjMjhhIiwic2lkIjoiNjRkNTY4ZGQtOGQyZS00OTI2LTkyZjYtZDIzZDJhYWQ4NTY1In0.BjL4eTq7EVRwvb8GHozs6kRTNacPC8nQiK1gJ4YpxvE",
  "access_expires_at": "2026-10-29T09:17:23.293743414Z",
  "refresh_token": "pSzPcDjH7d67It4Hus0kw-HLZAZlEbG3fAthA24ZpZo",
  "refresh_expires_at": "2026-10-29T21:02:23.293356499Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/b54bb51b-afff-43b2-9df9-bcfec903bc6d` → **200**

```json
{
  "client": {
    "id": "b54bb51b-afff-43b2-9df9-bcfec903bc6d",
    "phone": "+380637348320",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T09:02:14.660933Z",
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

`POST /api/admin/v1/clients/b54bb51b-afff-43b2-9df9-bcfec903bc6d/phone/new-code` → **201**

```json
{
  "phone": "+380638284053"
}
```

```json
{
  "challenge_id": "4d7c3bbc-4728-481e-aaca-f692745a437b",
  "expires_at": "2026-10-29T09:07:23.673666142Z",
  "resend_available_at": "2026-10-29T09:02:24.673666142Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638284053` → **200**

```json
{
  "phone": "+380638284053",
  "audience": "CLIENT",
  "code": "091956",
  "sent_at": "2026-10-29T09:02:23.675435164Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/b54bb51b-afff-43b2-9df9-bcfec903bc6d/phone` → **422**

```json
{
  "command_id": "41554f5f-1df9-4456-ad28-b54084a14051",
  "expected_version": 3,
  "new_challenge_id": "4d7c3bbc-4728-481e-aaca-f692745a437b",
  "new_code": "091957",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/b54bb51b-afff-43b2-9df9-bcfec903bc6d/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "1e983556-4295-4f11-b9a8-f6da3aff2569"
}
```

`POST /api/admin/v1/clients/b54bb51b-afff-43b2-9df9-bcfec903bc6d/phone` → **400**

```json
{
  "command_id": "b77b249a-4990-462c-9595-f8eb12aab403",
  "expected_version": 3,
  "new_challenge_id": "4d7c3bbc-4728-481e-aaca-f692745a437b",
  "new_code": "091956",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/b54bb51b-afff-43b2-9df9-bcfec903bc6d/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "1e205453-2477-4867-837a-4945f8ffcad7",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/b54bb51b-afff-43b2-9df9-bcfec903bc6d/phone` → **200**

```json
{
  "command_id": "d3a1f015-8c29-49eb-8fb0-e15a5aec75ba",
  "expected_version": 3,
  "new_challenge_id": "4d7c3bbc-4728-481e-aaca-f692745a437b",
  "new_code": "091956",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "b54bb51b-afff-43b2-9df9-bcfec903bc6d",
  "phone": "+380638284053",
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
  "correlation_id": "57cc8e61-31c6-4496-9185-ab06d8373b4e"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380638284053",
  "device_ref": "sandbox-19127"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "22ebcf6a-f386-4a90-bdd1-d5b57a384e90",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638284053",
  "device_ref": "sandbox-19127"
}
```

```json
{
  "challenge_id": "75a5e36a-9ece-467a-98f9-e5c251954857",
  "expires_at": "2026-10-29T09:07:25.816441835Z",
  "resend_available_at": "2026-10-29T09:02:26.816441835Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638284053` → **200**

```json
{
  "phone": "+380638284053",
  "audience": "CLIENT",
  "code": "225696",
  "sent_at": "2026-10-29T09:02:25.818232539Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "75a5e36a-9ece-467a-98f9-e5c251954857",
  "code": "225696",
  "device_ref": "sandbox-19127"
}
```

```json
{
  "session_id": "17991c2e-24d6-4fb7-a0e9-207c25d2ab38",
  "subject": {
    "type": "CLIENT",
    "id": "b54bb51b-afff-43b2-9df9-bcfec903bc6d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTRiYjUxYi1hZmZmLTQzYjItOWRmOS1iY2ZlYzkwM2JjNmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1NDQ2LCJpYXQiOjE3OTMyNjQ1NDYsImp0aSI6IjY5ZmI5ZTlhLTZjNTUtNGYzOS1iNGE0LWUxODhmMDNlNTE1OCIsInNpZCI6IjE3OTkxYzJlLTI0ZDYtNGZiNy1hMGU5LTIwN2MyNWQyYWIzOCJ9.KfT8VKjtj4FFIRO0SjdtAK2fMBzbhxwipjWPyxeuMy8",
  "access_expires_at": "2026-10-29T09:17:26.017312777Z",
  "refresh_token": "A-WCsxitidmjWUMDAdn_oP6hs661GnLotpz8O_l5Soo",
  "refresh_expires_at": "2026-11-28T09:02:26.01699053Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b54bb51b-afff-43b2-9df9-bcfec903bc6d",
  "session_id": "17991c2e-24d6-4fb7-a0e9-207c25d2ab38",
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
  "phone": "+380637206329",
  "device_ref": "sandbox-24789"
}
```

```json
{
  "challenge_id": "6812902e-47c9-4da4-ae2e-3b3dd8d5b581",
  "expires_at": "2026-10-29T09:07:26.37564793Z",
  "resend_available_at": "2026-10-29T09:02:27.37564793Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637206329` → **200**

```json
{
  "phone": "+380637206329",
  "audience": "CLIENT",
  "code": "869865",
  "sent_at": "2026-10-29T09:02:26.377481819Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6812902e-47c9-4da4-ae2e-3b3dd8d5b581",
  "code": "869865",
  "device_ref": "sandbox-24789"
}
```

```json
{
  "session_id": "1e2bb78b-b33c-4025-8893-ce848de78af6",
  "subject": {
    "type": "CLIENT",
    "id": "c03670d8-c047-4488-8cc2-32303891d754"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMDM2NzBkOC1jMDQ3LTQ0ODgtOGNjMi0zMjMwMzg5MWQ3NTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1NDQ2LCJpYXQiOjE3OTMyNjQ1NDYsImp0aSI6IjJiOWIxNGIwLTlkY2QtNDM5Yi05MzRlLTQ4MTEwNzViODJlMyIsInNpZCI6IjFlMmJiNzhiLWIzM2MtNDAyNS04ODkzLWNlODQ4ZGU3OGFmNiJ9.DB_MzcvyL3VgfmDIE2xZ0Zp9ui81YH5YJ6JiQdjIZvc",
  "access_expires_at": "2026-10-29T09:17:26.575350618Z",
  "refresh_token": "EXZ3uCbB0E9-Pu-3GbbYfoIIqwuEFvy9ow8p2Oys6Us",
  "refresh_expires_at": "2026-11-28T09:02:26.574982501Z",
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
  "session_id": "76b631ac-9f58-4635-8ebe-897fad40976f",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjU0NDcsImlhdCI6MTc5MzI2NDU0NywianRpIjoiMTJkMDFjZWQtOTRhMy00MDJlLWEyNjQtNzQ2ZmEzNWVhOWEzIiwic2lkIjoiNzZiNjMxYWMtOWY1OC00NjM1LThlYmUtODk3ZmFkNDA5NzZmIn0.RjThaBu-yruMLc60Qor0qUEX-tW0Eh1S8XBn-55jCJU",
  "access_expires_at": "2026-10-29T09:17:27.347851214Z",
  "refresh_token": "8xOWlAkJ7f3fju6u0uLhym1304zbPWN2XmHzBLSwRpc",
  "refresh_expires_at": "2026-10-29T21:02:27.347506593Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380637206329` → **200**

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
  "correlation_id": "e664a622-574b-4749-b9b6-7dcc77df7bb7"
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
  "session_id": "d4f30f31-de10-4d1a-ad5c-7ac80b8c17b4",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjU0NDgsImlhdCI6MTc5MzI2NDU0OCwianRpIjoiMmZmMTlhYjctN2I4NS00MTQzLTlhZjYtNzZlNTM3N2ZlNTZiIiwic2lkIjoiZDRmMzBmMzEtZGUxMC00ZDFhLWFkNWMtN2FjODBiOGMxN2I0In0.dLr_GubHXi77dMQgtN3lfWqea-dO22mIN591Gku_D0U",
  "access_expires_at": "2026-10-29T09:17:28.108126762Z",
  "refresh_token": "u-7AwCuVctHBdm3JiHix5jSv3N1KuqyZ5Uhb6CU6iWY",
  "refresh_expires_at": "2026-10-29T21:02:28.107808221Z",
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
  "changed_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T08:59:34.367618Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "1510d56f-cb42-4546-92f1-d156b6bfeeb7",
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
  "changed_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T09:02:28.473421163Z"
}
```

## The rider books the airport for 2026-10-29T12:02:27Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600207414",
  "device_ref": "sandbox-31552"
}
```

```json
{
  "challenge_id": "71fa4f48-ff14-4ea3-b432-971cc5b3b57e",
  "expires_at": "2026-10-29T09:07:28.665642686Z",
  "resend_available_at": "2026-10-29T09:02:29.665642686Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600207414` → **200**

```json
{
  "phone": "+48600207414",
  "audience": "CLIENT",
  "code": "788484",
  "sent_at": "2026-10-29T09:02:28.667658009Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "71fa4f48-ff14-4ea3-b432-971cc5b3b57e",
  "code": "788484",
  "device_ref": "sandbox-31552"
}
```

```json
{
  "session_id": "e6712ac2-fd66-4e0b-babb-3e48cc31d593",
  "subject": {
    "type": "CLIENT",
    "id": "77c7c0db-0d33-4b53-9f04-690de83748a8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2M3YzBkYi0wZDMzLTRiNTMtOWYwNC02OTBkZTgzNzQ4YTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1NDQ4LCJpYXQiOjE3OTMyNjQ1NDgsImp0aSI6IjU5YzExYWZkLTVkMDktNGRjNC04ZTQ0LWEyMzUxZDc5OThjNSIsInNpZCI6ImU2NzEyYWMyLWZkNjYtNGUwYi1iYWJiLTNlNDhjYzMxZDU5MyJ9.c4o41udBm1i9JqMr5vJFsWFz71MAxNXSpD3BBilH5Uo",
  "access_expires_at": "2026-10-29T09:17:28.870708029Z",
  "refresh_token": "dvkXUTPA9ObysfJdQ0pfNYCfLuJquTewlqJeD9o90lc",
  "refresh_expires_at": "2026-11-28T09:02:28.870275305Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "69430d44-018c-41c2-9261-f6407f6eba99",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T12:02:27Z"
}
```

```json
{
  "id": "2e489ba8-0169-4e29-bcd7-4a17152e75ca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:07:29.060336Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T12:02:27Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d48c7d20-f685-4456-b15d-c15b8378dff5",
  "quote_id": "2e489ba8-0169-4e29-bcd7-4a17152e75ca",
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
  "pickup_at": "2026-10-29T12:02:27Z"
}
```

```json
{
  "id": "7cb6dffe-53a1-4a0c-94af-dc4ed7086091",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "77c7c0db-0d33-4b53-9f04-690de83748a8",
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
  "created_at": "2026-10-29T09:02:29.25245Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T12:02:27Z",
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
  "device_ref": "sandbox-28140"
}
```

```json
{
  "challenge_id": "fcf7f102-83c0-4c14-994e-7de2f53c84f5",
  "expires_at": "2026-10-29T09:07:29.448961256Z",
  "resend_available_at": "2026-10-29T09:02:30.448961256Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "241001",
  "sent_at": "2026-10-29T09:02:29.451916667Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fcf7f102-83c0-4c14-994e-7de2f53c84f5",
  "code": "241001",
  "device_ref": "sandbox-28140"
}
```

```json
{
  "session_id": "ea603fd4-4f4d-4dce-82e4-c6dc5fa9572c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTQ0OSwiaWF0IjoxNzkzMjY0NTQ5LCJqdGkiOiIzOTMxNmE2MS01MDk2LTQ5YTktOWM2Ni0wMmUyM2JkNjhiNzYiLCJzaWQiOiJlYTYwM2ZkNC00ZjRkLTRkY2UtODJlNC1jNmRjNWZhOTU3MmMifQ.N5my89iNjHBqN0GwIPiyjcTgLUncXo8PScnYusEPRBg",
  "access_expires_at": "2026-10-29T09:17:29.67998176Z",
  "refresh_token": "4b0n0aUPBzdgQklkrh55TX9RsRDxUgnEY7UdyVyhPQA",
  "refresh_expires_at": "2026-11-28T09:02:29.679569196Z",
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
  "command_id": "6c1ce99e-dd3a-48b4-8e3e-fbd8e355cff0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:02:30Z",
    "sequence": 1793264550321
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0d28acd1-11d4-4fe1-9028-4c4990f3da8d",
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
  "last_heartbeat_at": "2026-10-29T09:02:30.047347Z",
  "last_location_at": "2026-10-29T09:02:30.047347Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "7cb6dffe-53a1-4a0c-94af-dc4ed7086091",
      "short_number": 23,
      "pickup_at": "2026-10-29T12:02:27Z",
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

`POST /api/driver/v1/preorders/7cb6dffe-53a1-4a0c-94af-dc4ed7086091/reserve` → **200**

```json
{
  "command_id": "0ac538d0-8d44-4d6d-8694-892119244c72"
}
```

```json
{
  "id": "61b6b6f4-d2a6-4d17-aedc-18e1b3ff2287",
  "state": "RESERVED",
  "order": {
    "order_id": "7cb6dffe-53a1-4a0c-94af-dc4ed7086091",
    "short_number": 23,
    "pickup_at": "2026-10-29T12:02:27Z",
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
  "reserved_at": "2026-10-29T09:02:30.425995Z",
  "confirm_from": "2026-10-29T11:32:27Z",
  "confirm_until": "2026-10-29T11:42:27Z",
  "drop_until": "2026-10-29T11:02:27Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "61b6b6f4-d2a6-4d17-aedc-18e1b3ff2287",
      "state": "RESERVED",
      "order": {
        "order_id": "7cb6dffe-53a1-4a0c-94af-dc4ed7086091",
        "short_number": 23,
        "pickup_at": "2026-10-29T12:02:27Z",
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
      "reserved_at": "2026-10-29T09:02:30.425995Z",
      "confirm_from": "2026-10-29T11:32:27Z",
      "confirm_until": "2026-10-29T11:42:27Z",
      "drop_until": "2026-10-29T11:02:27Z"
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
      "id": "61b6b6f4-d2a6-4d17-aedc-18e1b3ff2287",
      "state": "RESERVED",
      "order": {
        "order_id": "7cb6dffe-53a1-4a0c-94af-dc4ed7086091",
        "short_number": 23,
        "pickup_at": "2026-10-29T12:02:27Z",
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
      "reserved_at": "2026-10-29T09:02:30.425995Z",
      "confirm_from": "2026-10-29T11:32:27Z",
      "confirm_until": "2026-10-29T11:42:27Z",
      "drop_until": "2026-10-29T11:02:27Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/61b6b6f4-d2a6-4d17-aedc-18e1b3ff2287/confirm` → **409**

```json
{
  "command_id": "7516d8e8-c646-4102-bc98-766a1ee2a413"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/61b6b6f4-d2a6-4d17-aedc-18e1b3ff2287/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a30fe0f4-05ca-4df7-9b3a-87eafc3fcc2c"
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
  "session_id": "14c9d466-2332-4f51-9146-94cc7edc6a10",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjU0NTEsImlhdCI6MTc5MzI2NDU1MSwianRpIjoiMjZjNGVlNTQtZjg0ZC00YmUxLTk2OTYtZDhjNmYxNzFhZDNlIiwic2lkIjoiMTRjOWQ0NjYtMjMzMi00ZjUxLTkxNDYtOTRjYzdlZGM2YTEwIn0.ABFINkfFPQetIdqMCCDg_17px6kUoFCJJOR626ueSb8",
  "access_expires_at": "2026-10-29T09:17:31.341989459Z",
  "refresh_token": "B9gXOuAwFeA8Reg6mZ0zSB964T7XVO0b4tx94Jp2YH4",
  "refresh_expires_at": "2026-10-29T21:02:31.341668644Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7cb6dffe-53a1-4a0c-94af-dc4ed7086091` → **200**

```json
{
  "id": "7cb6dffe-53a1-4a0c-94af-dc4ed7086091",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "77c7c0db-0d33-4b53-9f04-690de83748a8",
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
  "created_at": "2026-10-29T09:02:29.25245Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T12:02:27Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "61b6b6f4-d2a6-4d17-aedc-18e1b3ff2287",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T09:02:30.425995Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/7cb6dffe-53a1-4a0c-94af-dc4ed7086091/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T09:02:29.253258Z",
      "actor": {
        "type": "CLIENT",
        "id": "77c7c0db-0d33-4b53-9f04-690de83748a8",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "7cb6dffe-53a1-4a0c-94af-dc4ed7086091",
        "preorder": true,
        "quote_id": "2e489ba8-0169-4e29-bcd7-4a17152e75ca",
        "pickup_at": "2026-10-29T12:02:27Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "9501a7ab-9fc6-4180-a5b2-e56e08b7bd77"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T09:02:30.426772Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7cb6dffe-53a1-4a0c-94af-dc4ed7086091",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "61b6b6f4-d2a6-4d17-aedc-18e1b3ff2287"
      },
      "correlation_id": "b5342a13-3a42-43df-b137-2e7718452083"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 7cb6dffe-53a1-4a0c-94af-dc4ed7086091, reservation 61b6b6f4-d2a6-4d17-aedc-18e1b3ff2287.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21590"
}
```

```json
{
  "challenge_id": "eaa1e9e4-642e-499b-a0e0-71f96f91dd43",
  "expires_at": "2026-10-29T09:07:31.892617665Z",
  "resend_available_at": "2026-10-29T09:02:32.892617665Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "155474",
  "sent_at": "2026-10-29T09:02:31.894966442Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eaa1e9e4-642e-499b-a0e0-71f96f91dd43",
  "code": "155474",
  "device_ref": "sandbox-21590"
}
```

```json
{
  "session_id": "1c37d654-8909-453a-bd32-16c7246c2e35",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTQ1MiwiaWF0IjoxNzkzMjY0NTUyLCJqdGkiOiIwNTFlMjk3Zi0xMmY0LTQ1YWMtYTBiMS1iNmVmMjA5NGYyZDgiLCJzaWQiOiIxYzM3ZDY1NC04OTA5LTQ1M2EtYmQzMi0xNmM3MjQ2YzJlMzUifQ.THvwC4Jou0g1Jfe2bm9pkBIw6KsGY9u3NbGnsraKV8w",
  "access_expires_at": "2026-10-29T09:17:32.090719976Z",
  "refresh_token": "KBxnFZ7v6HSIcFs64sNZLOa26ELbWj2TBxJ8ZfTAWqE",
  "refresh_expires_at": "2026-11-28T09:02:32.090383518Z",
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
  "command_id": "abcf4176-49cc-41cc-919d-62e92c451fd7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:02:32Z",
    "sequence": 1793264552437
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ef86ba7b-1302-4767-9bf0-f0c189632d46",
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
  "last_heartbeat_at": "2026-10-29T09:02:32.454273Z",
  "last_location_at": "2026-10-29T09:02:32.454273Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677404624",
  "device_ref": "sandbox-28692"
}
```

```json
{
  "challenge_id": "85ea808f-033a-4417-9e0a-09766bf0c793",
  "expires_at": "2026-10-29T09:07:32.64139296Z",
  "resend_available_at": "2026-10-29T09:02:33.64139296Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677404624` → **200**

```json
{
  "phone": "+380677404624",
  "audience": "CLIENT",
  "code": "491354",
  "sent_at": "2026-10-29T09:02:32.643369173Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "85ea808f-033a-4417-9e0a-09766bf0c793",
  "code": "491354",
  "device_ref": "sandbox-28692"
}
```

```json
{
  "session_id": "04c61d50-bf99-46d8-9cbb-9ad5f795418c",
  "subject": {
    "type": "CLIENT",
    "id": "13458417-7d29-4f40-a7ff-329d15c6d9c8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzQ1ODQxNy03ZDI5LTRmNDAtYTdmZi0zMjlkMTVjNmQ5YzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1NDUyLCJpYXQiOjE3OTMyNjQ1NTIsImp0aSI6IjBhNGU1NzMxLTkwZmMtNDM0YS05NGQxLWZmNmRkZWJiN2NkMCIsInNpZCI6IjA0YzYxZDUwLWJmOTktNDZkOC05Y2JiLTlhZDVmNzk1NDE4YyJ9.CWq0O7jJ7UXKmqCrGFIeJXJ-fHWDe1nacd0GS-OKnkY",
  "access_expires_at": "2026-10-29T09:17:32.841351402Z",
  "refresh_token": "9GTLFk0D-S3qKtb9yrpw2mZaGGFHNIYjGkh1ANy_3OI",
  "refresh_expires_at": "2026-11-28T09:02:32.841042225Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d31f24da-a7af-41f3-a7e5-86f76ab6b620",
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
  "id": "67ff16e7-37d7-4493-9f8a-e98326742f0a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:07:33.024419Z",
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
  "command_id": "40c107d2-ad67-412f-8b4c-d0d6f3194355",
  "quote_id": "67ff16e7-37d7-4493-9f8a-e98326742f0a",
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
  "id": "ad1a3eb4-6f04-4f3e-9a18-0d21127a1c2f",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13458417-7d29-4f40-a7ff-329d15c6d9c8",
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
  "created_at": "2026-10-29T09:02:33.216271Z",
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
    "id": "3ae4a368-010b-42da-b37c-27fcaceb1b95",
    "order_id": "ad1a3eb4-6f04-4f3e-9a18-0d21127a1c2f",
    "expires_at": "2026-10-29T09:02:48.218264Z",
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

`POST /api/driver/v1/offers/3ae4a368-010b-42da-b37c-27fcaceb1b95/accept` → **200**

```json
{
  "command_id": "cf29779c-750b-438e-bc22-cfb0f780812f"
}
```

```json
{
  "id": "63176380-bcd5-4a4f-b4f3-4112fcf5915c",
  "order_id": "ad1a3eb4-6f04-4f3e-9a18-0d21127a1c2f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e9ba670e-f368-400c-aef9-6082b9f10617",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e9ba670e-f368-400c-aef9-6082b9f10617",
  "order_id": "ad1a3eb4-6f04-4f3e-9a18-0d21127a1c2f",
  "assignment_id": "63176380-bcd5-4a4f-b4f3-4112fcf5915c",
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

`POST /api/driver/v1/work-sessions/ef86ba7b-1302-4767-9bf0-f0c189632d46/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:02:33Z",
    "sequence": 1793264553943
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ef86ba7b-1302-4767-9bf0-f0c189632d46",
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
  "last_heartbeat_at": "2026-10-29T09:02:33.958326Z",
  "last_location_at": "2026-10-29T09:02:33.958326Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e9ba670e-f368-400c-aef9-6082b9f10617",
  "order_id": "ad1a3eb4-6f04-4f3e-9a18-0d21127a1c2f",
  "assignment_id": "63176380-bcd5-4a4f-b4f3-4112fcf5915c",
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

`POST /api/driver/v1/trips/e9ba670e-f368-400c-aef9-6082b9f10617/arrive` → **200**

```json
{
  "command_id": "9847333a-a6a7-44d1-9df5-4260e309e3e2",
  "expected_version": 0
}
```

```json
{
  "id": "e9ba670e-f368-400c-aef9-6082b9f10617",
  "order_id": "ad1a3eb4-6f04-4f3e-9a18-0d21127a1c2f",
  "assignment_id": "63176380-bcd5-4a4f-b4f3-4112fcf5915c",
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
  "arrived_at": "2026-10-29T09:02:34.318015Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e9ba670e-f368-400c-aef9-6082b9f10617/start` → **200**

```json
{
  "command_id": "0201258e-8f01-4c42-8714-6c8882eb43c1",
  "expected_version": 1
}
```

```json
{
  "id": "e9ba670e-f368-400c-aef9-6082b9f10617",
  "order_id": "ad1a3eb4-6f04-4f3e-9a18-0d21127a1c2f",
  "assignment_id": "63176380-bcd5-4a4f-b4f3-4112fcf5915c",
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
  "arrived_at": "2026-10-29T09:02:34.318015Z",
  "started_at": "2026-10-29T09:02:34.501022Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/ef86ba7b-1302-4767-9bf0-f0c189632d46/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:02:34Z",
    "sequence": 1793264554681
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ef86ba7b-1302-4767-9bf0-f0c189632d46",
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
  "last_heartbeat_at": "2026-10-29T09:02:34.696646Z",
  "last_location_at": "2026-10-29T09:02:34.696646Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/e9ba670e-f368-400c-aef9-6082b9f10617/complete` → **200**

```json
{
  "command_id": "a269be54-67a9-41cb-b2d8-d0fddbe8cf47",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:02:34Z",
  "cash_received": true
}
```

```json
{
  "id": "e9ba670e-f368-400c-aef9-6082b9f10617",
  "order_id": "ad1a3eb4-6f04-4f3e-9a18-0d21127a1c2f",
  "assignment_id": "63176380-bcd5-4a4f-b4f3-4112fcf5915c",
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
  "arrived_at": "2026-10-29T09:02:34.318015Z",
  "started_at": "2026-10-29T09:02:34.501022Z",
  "completed_at": "2026-10-29T09:02:34.876171Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/ad1a3eb4-6f04-4f3e-9a18-0d21127a1c2f/rating` → **200**

```json
{
  "command_id": "52da40d4-7784-4f82-9cb6-930a486ea319",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "ad1a3eb4-6f04-4f3e-9a18-0d21127a1c2f",
  "score": 5,
  "created_at": "2026-10-29T09:02:35.075493432Z"
}
```

`POST /api/driver/v1/orders/ad1a3eb4-6f04-4f3e-9a18-0d21127a1c2f/rating` → **200**

```json
{
  "command_id": "3b14f0eb-26b8-4146-a9f5-953abf952ec7",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "ad1a3eb4-6f04-4f3e-9a18-0d21127a1c2f",
  "score": 4,
  "created_at": "2026-10-29T09:02:35.257569842Z"
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
  "session_id": "892bb48e-3538-4d73-a654-67eca0abf79f",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjU0NTUsImlhdCI6MTc5MzI2NDU1NSwianRpIjoiODJhZDM0NmYtM2VkYi00NDczLWE4MjUtODU0MWVmZGI0ODk4Iiwic2lkIjoiODkyYmI0OGUtMzUzOC00ZDczLWE2NTQtNjdlY2EwYWJmNzlmIn0.ojhWEmXRBW--bGqAuDpkIbHaLL0aoPcfWuiophFgYGU",
  "access_expires_at": "2026-10-29T09:17:35.845589392Z",
  "refresh_token": "AtseNsolCnN27FAIXw800691Lo4mSxgu4ychGiWzAuA",
  "refresh_expires_at": "2026-10-29T21:02:35.845226465Z",
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
  "session_id": "70076da8-e8a1-4559-8fa4-e47ea2fe537a",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjU0NTYsImlhdCI6MTc5MzI2NDU1NiwianRpIjoiMzI1ZmRlYjUtZDQ3ZC00OTliLWFjYzYtNDVkM2FhZmE4NGYxIiwic2lkIjoiNzAwNzZkYTgtZThhMS00NTU5LThmYTQtZTQ3ZWEyZmU1MzdhIn0.bS0qeOUvRxNKqou0TsZ2Ra9q-ZeNExL9v4nRfkRJv3s",
  "access_expires_at": "2026-10-29T09:17:36.236450283Z",
  "refresh_token": "G8bg91TSl7sr0BAt1df7VArKqEX6yNAWvlMIizJ8BeU",
  "refresh_expires_at": "2026-10-29T21:02:36.236034005Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ad1a3eb4-6f04-4f3e-9a18-0d21127a1c2f/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "ad1a3eb4-6f04-4f3e-9a18-0d21127a1c2f",
      "author_type": "RIDER",
      "author_id": "13458417-7d29-4f40-a7ff-329d15c6d9c8",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T09:02:35.075493Z"
    },
    {
      "order_id": "ad1a3eb4-6f04-4f3e-9a18-0d21127a1c2f",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "13458417-7d29-4f40-a7ff-329d15c6d9c8",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T09:02:35.25757Z"
    }
  ]
}
```

Done: ratings for order ad1a3eb4-6f04-4f3e-9a18-0d21127a1c2f.

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
  "session_id": "bb112b20-fae2-4b5d-a65b-683648de1dee",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjU0NTYsImlhdCI6MTc5MzI2NDU1NiwianRpIjoiMDZhOTVhMmEtZTI4Ny00MTY3LWI1ZTktMTA3NDUzNzRlODVlIiwic2lkIjoiYmIxMTJiMjAtZmFlMi00YjVkLWE2NWItNjgzNjQ4ZGUxZGVlIn0.hGzz8tghEBJSWQOVOb1SI2XGlpaHleg-an6U4_qe3N0",
  "access_expires_at": "2026-10-29T09:17:36.858513867Z",
  "refresh_token": "l3MydFEmeQlEoWNZebdNXjp0MH_oX2brl90mzLqjFYA",
  "refresh_expires_at": "2026-10-29T21:02:36.857945124Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "66093255-c25d-4953-b794-289f2ab1b344",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "ff3e3fc9-3dbf-49df-be70-74335377e632",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:02:37.048197Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ff3e3fc9-3dbf-49df-be70-74335377e632` → **200**

```json
{
  "id": "ff3e3fc9-3dbf-49df-be70-74335377e632",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:02:37.048197Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ff3e3fc9-3dbf-49df-be70-74335377e632` → **200**

```json
{
  "id": "ff3e3fc9-3dbf-49df-be70-74335377e632",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:02:37.048197Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ff3e3fc9-3dbf-49df-be70-74335377e632` → **200**

```json
{
  "id": "ff3e3fc9-3dbf-49df-be70-74335377e632",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:02:37.048197Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ff3e3fc9-3dbf-49df-be70-74335377e632` → **200**

```json
{
  "id": "ff3e3fc9-3dbf-49df-be70-74335377e632",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:02:37.048197Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ff3e3fc9-3dbf-49df-be70-74335377e632` → **200**

```json
{
  "id": "ff3e3fc9-3dbf-49df-be70-74335377e632",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T09:02:37.048197Z",
  "ready_at": "2026-10-29T09:02:41.547212Z",
  "expires_at": "2026-10-30T09:02:41.547212Z"
}
```

`GET /api/admin/v1/reports/exports/ff3e3fc9-3dbf-49df-be70-74335377e632/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,23,10,13,0,0,18,5,0,21,1,0,1,7,1,5
total,23,10,13,0,0,18,5,0,21,1,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "1f6e7cc7-5986-4e42-8a20-ddf6dd5f4e43",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "f801c1b0-e342-40d2-8951-e126f40cf434",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:02:42.16387Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f801c1b0-e342-40d2-8951-e126f40cf434` → **200**

```json
{
  "id": "f801c1b0-e342-40d2-8951-e126f40cf434",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:02:42.16387Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f801c1b0-e342-40d2-8951-e126f40cf434` → **200**

```json
{
  "id": "f801c1b0-e342-40d2-8951-e126f40cf434",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:02:42.16387Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f801c1b0-e342-40d2-8951-e126f40cf434` → **200**

```json
{
  "id": "f801c1b0-e342-40d2-8951-e126f40cf434",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:02:42.16387Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f801c1b0-e342-40d2-8951-e126f40cf434` → **200**

```json
{
  "id": "f801c1b0-e342-40d2-8951-e126f40cf434",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:02:42.16387Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f801c1b0-e342-40d2-8951-e126f40cf434` → **200**

```json
{
  "id": "f801c1b0-e342-40d2-8951-e126f40cf434",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T09:02:42.16387Z",
  "ready_at": "2026-10-29T09:02:46.553322Z",
  "expires_at": "2026-10-30T09:02:46.553322Z"
}
```

`GET /api/admin/v1/reports/exports/f801c1b0-e342-40d2-8951-e126f40cf434/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,10,1387.37,130.74,208.14,1179.23,10.52,0.00,162.97,182.97,795.00,50.00,105.17
total,UAH,10,1387.37,130.74,208.14,1179.23,10.52,0.00,162.97,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/8caf97c6-7008-4174-bfaa-33abd3cecf55` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/8caf97c6-7008-4174-bfaa-33abd3cecf55",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6cc48749-0c56-4e58-aef2-3c982358ecb0"
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
  "device_ref": "sandbox-9825"
}
```

```json
{
  "challenge_id": "bdb74654-4d26-4d41-9925-acd8e46c30bd",
  "expires_at": "2026-10-29T09:07:47.455582183Z",
  "resend_available_at": "2026-10-29T09:02:48.455582183Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "971247",
  "sent_at": "2026-10-29T09:02:47.457848629Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bdb74654-4d26-4d41-9925-acd8e46c30bd",
  "code": "971247",
  "device_ref": "sandbox-9825"
}
```

```json
{
  "session_id": "cd010c39-3bd6-4c0f-b4d0-92d91c0a2c93",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTQ2NywiaWF0IjoxNzkzMjY0NTY3LCJqdGkiOiI3NzlmOWE4My01MmUyLTQ0ZjAtODE1OS0zZGIyNzM0YmExNTUiLCJzaWQiOiJjZDAxMGMzOS0zYmQ2LTRjMGYtYjRkMC05MmQ5MWMwYTJjOTMifQ.y8AZ5EA_gTHBPE_ZdFPtCvUZJoWYedLziZSUinKXL3A",
  "access_expires_at": "2026-10-29T09:17:47.657930107Z",
  "refresh_token": "Tvs2EQoX791QJCqm7Ui1fsS1FHvj_GysxkAtAOMMzKE",
  "refresh_expires_at": "2026-11-28T09:02:47.657511706Z",
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
  "command_id": "03af92a2-5a83-4146-9ace-e973383332e9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:02:48Z",
    "sequence": 1793264568199
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d29ac5ea-0be1-4738-801f-c2da444c159c",
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
  "last_heartbeat_at": "2026-10-29T09:02:48.214347Z",
  "last_location_at": "2026-10-29T09:02:48.214347Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "55124797-0365-4a62-a718-4b39e816fca8",
  "points": [
    {
      "sequence": 1793264570397,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T09:01:50Z"
    },
    {
      "sequence": 1793264570408,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T09:02:50Z"
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
  "session_id": "8e1bb140-999b-4bf6-b659-014ec86f0d7a",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjU0NzAsImlhdCI6MTc5MzI2NDU3MCwianRpIjoiNGMxZTNmMzUtNTA4Yi00YmRjLThiMTMtMmYzMWQyYzI0ZmY3Iiwic2lkIjoiOGUxYmIxNDAtOTk5Yi00YmY2LWI2NTktMDE0ZWM4NmYwZDdhIn0.RkCGUNYkPakb6NnVVD1tSy9i-Se2EzuK6FKFaSHrQp4",
  "access_expires_at": "2026-10-29T09:17:50.863307406Z",
  "refresh_token": "h4M5YsO4d6f5nnFyZgUqYDvkyGa48N7O7z2ZbT_3A38",
  "refresh_expires_at": "2026-10-29T21:02:50.862980322Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "99b84108-4595-42a9-b011-310bf6ad923f",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T09:02:50Z",
        "track_point_id": "469480f3-2596-4eba-afaf-b2f9e542e2fc",
        "work_session_id": "d29ac5ea-0be1-4738-801f-c2da444c159c"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T09:02:50Z",
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
    "version": 4,
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

`POST /api/admin/v1/driver-risk-flags/99b84108-4595-42a9-b011-310bf6ad923f/confirm` → **200**

```json
{
  "command_id": "5b75bbea-e9a8-4638-a256-4c75e600f0bf",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "99b84108-4595-42a9-b011-310bf6ad923f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T09:02:50Z",
    "track_point_id": "469480f3-2596-4eba-afaf-b2f9e542e2fc",
    "work_session_id": "d29ac5ea-0be1-4738-801f-c2da444c159c"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T09:02:50Z",
  "reason": null,
  "reviewed_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "reviewed_at": "2026-10-29T09:02:51.451688Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/99b84108-4595-42a9-b011-310bf6ad923f/dismiss` → **409**

```json
{
  "command_id": "312b4748-6b59-499a-8718-3ffecc3ca5f3",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/99b84108-4595-42a9-b011-310bf6ad923f/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "db7f9408-19a0-424e-ba20-ec0a9abccfb6"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "d2a3348c-9107-49a5-896a-dacb4dd97ec7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "d143cfc5-f8f9-47fb-be9d-47cf49ba03ff",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "raised_at": "2026-10-29T09:02:51.832966Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/d143cfc5-f8f9-47fb-be9d-47cf49ba03ff/dismiss` → **200**

```json
{
  "command_id": "22060360-9761-4686-9e7e-bc404d8f1465",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "d143cfc5-f8f9-47fb-be9d-47cf49ba03ff",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "raised_at": "2026-10-29T09:02:51.832966Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "reviewed_at": "2026-10-29T09:02:52.028931Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "32e7c999-b446-450e-9a35-95d554652dc4",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "99b84108-4595-42a9-b011-310bf6ad923f"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "SUSPENDED",
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
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T09:02:52.233703Z"
    }
  ]
}
```

Done: flag 99b84108-4595-42a9-b011-310bf6ad923f confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "cc7cdb90-9c10-46b2-8168-a5b645e3185a",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjU0NzIsImlhdCI6MTc5MzI2NDU3MiwianRpIjoiMjRhYTU2NGYtNTE2OS00ODM0LWIwNjAtM2I3ZTkzZTQ1ODVhIiwic2lkIjoiY2M3Y2RiOTAtOWMxMC00NmIyLTgxNjgtYTViNjQ1ZTMxODVhIn0.q29yhGA9A6TAEN80YqBdsdF0BBwkFapfN_-Au5BHio8",
  "access_expires_at": "2026-10-29T09:17:52.812098218Z",
  "refresh_token": "aq3POWC32nUkkiFYuhcHppEwG2O3NcvFVG42En4UDcI",
  "refresh_expires_at": "2026-10-29T21:02:52.811659917Z",
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
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T09:02:52.233703Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "5d2b044a-3d3e-4a6c-9a6d-29c7525c3b4c",
  "expected_version": 5,
  "reason": "Sandbox clean-up"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d29ac5ea-0be1-4738-801f-c2da444c159c",
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
  "last_heartbeat_at": "2026-10-29T09:02:48.214347Z",
  "last_location_at": "2026-10-29T09:02:48.214347Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d29ac5ea-0be1-4738-801f-c2da444c159c/close` → **200**

```json
{
  "command_id": "d806e806-25db-45b9-af1c-75ae4c593baf",
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
  "session_id": "68ba1612-cef5-4c21-96d6-4864f85aefa6",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjU0NzMsImlhdCI6MTc5MzI2NDU3MywianRpIjoiNzJjYzc3ZGEtOTg1YS00NDMzLTk4ZTEtMzQ0NDIzZDYxNmE4Iiwic2lkIjoiNjhiYTE2MTItY2VmNS00YzIxLTk2ZDYtNDg2NGY4NWFlZmE2In0.qvwdY7UFGIGTyqZEngEhEkgF_SlucoTb6yzwBLnvm3Y",
  "access_expires_at": "2026-10-29T09:17:53.95348082Z",
  "refresh_token": "rdH3CoyJXHICiUX0vWiJY21W7FeHL7JergqUaN73hsU",
  "refresh_expires_at": "2026-10-29T21:02:53.953037711Z",
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
  "command_id": "19dad20f-d4f6-4900-aa68-b8c4aa318050",
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
  "changed_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T09:02:54.333191Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "19dad20f-d4f6-4900-aa68-b8c4aa318050",
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
  "changed_by": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T09:02:54.333191Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48766954745",
  "device_ref": "sandbox-20950"
}
```

```json
{
  "challenge_id": "d17c2e46-1d1a-4994-afca-6d1934484dc6",
  "expires_at": "2026-10-29T09:07:54.713282955Z",
  "resend_available_at": "2026-10-29T09:02:55.713282955Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48766954745` → **200**

```json
{
  "phone": "+48766954745",
  "audience": "CLIENT",
  "code": "498600",
  "sent_at": "2026-10-29T09:02:54.715284597Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d17c2e46-1d1a-4994-afca-6d1934484dc6",
  "code": "498600",
  "device_ref": "sandbox-20950"
}
```

```json
{
  "session_id": "a205ad81-2620-4d30-b507-a76f2cbbb82b",
  "subject": {
    "type": "CLIENT",
    "id": "7e6f41fa-491e-40d8-aa95-bff740b4a597"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTZmNDFmYS00OTFlLTQwZDgtYWE5NS1iZmY3NDBiNGE1OTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1NDc0LCJpYXQiOjE3OTMyNjQ1NzQsImp0aSI6IjFmZTkxZWRiLWI3ZGMtNDExMS05YTBlLTRkMTk0OWIwZjdhNyIsInNpZCI6ImEyMDVhZDgxLTI2MjAtNGQzMC1iNTA3LWE3NmYyY2JiYjgyYiJ9.4DQvrWZ-X-kB3hWM6Iipt2qb5q1_f5S5VDA7sdvkFW0",
  "access_expires_at": "2026-10-29T09:17:54.94406242Z",
  "refresh_token": "Hq6ZbE60i70u6nmvL5ggupaQDH7K75kqLKkFSPQCaik",
  "refresh_expires_at": "2026-11-28T09:02:54.943742547Z",
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
  "correlation_id": "5158082d-8283-4814-9492-f6412f9c5c8a"
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
  "device_ref": "sandbox-16289"
}
```

```json
{
  "challenge_id": "f9111710-989a-481d-808e-75687698a9c8",
  "expires_at": "2026-10-29T09:07:55.499443479Z",
  "resend_available_at": "2026-10-29T09:02:56.499443479Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "922469",
  "sent_at": "2026-10-29T09:02:55.501227052Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9111710-989a-481d-808e-75687698a9c8",
  "code": "922469",
  "device_ref": "sandbox-16289"
}
```

```json
{
  "session_id": "f953cb87-7518-4713-894b-d41ab6bf7dcd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTQ3NSwiaWF0IjoxNzkzMjY0NTc1LCJqdGkiOiI4M2UxYTAxNy1kNWU4LTQzNTYtYjRmZi0yMmY4YTllNTc3MGEiLCJzaWQiOiJmOTUzY2I4Ny03NTE4LTQ3MTMtODk0Yi1kNDFhYjZiZjdkY2QifQ.b3fEsu5L3xU6ZIC_FCCC_odrZUoj8lPVdu0lM9tQ5ug",
  "access_expires_at": "2026-10-29T09:17:55.706605842Z",
  "refresh_token": "AzTYxhm1omyFbmKgqIkDZYJdtrTP0EapKGeLpji5j2A",
  "refresh_expires_at": "2026-11-28T09:02:55.70623968Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0d28acd1-11d4-4fe1-9028-4c4990f3da8d",
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
  "last_heartbeat_at": "2026-10-29T09:02:30.047347Z",
  "last_location_at": "2026-10-29T09:02:30.047347Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0d28acd1-11d4-4fe1-9028-4c4990f3da8d/handover` → **200**

```json
{
  "command_id": "d050d177-ff6f-4a97-a4f7-a1e37bccbe83",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0d28acd1-11d4-4fe1-9028-4c4990f3da8d",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-29T09:02:30.047347Z",
  "last_location_at": "2026-10-29T09:02:30.047347Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0d28acd1-11d4-4fe1-9028-4c4990f3da8d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:02:56Z",
    "sequence": 1793264576228
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0d28acd1-11d4-4fe1-9028-4c4990f3da8d",
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
  "last_heartbeat_at": "2026-10-29T09:02:56.242858Z",
  "last_location_at": "2026-10-29T09:02:56.242858Z",
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
  "session_id": "0d28acd1-11d4-4fe1-9028-4c4990f3da8d",
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
  "last_heartbeat_at": "2026-10-29T09:02:56.242858Z",
  "last_location_at": "2026-10-29T09:02:56.242858Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0d28acd1-11d4-4fe1-9028-4c4990f3da8d/close` → **200**

```json
{
  "command_id": "fa3a6142-241f-48f9-a75a-2df1eb323074",
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
  "correlation_id": "53c93bd0-f024-4ec1-94ee-26e3a2fb7118"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675445633",
  "device_ref": "sandbox-23435"
}
```

```json
{
  "challenge_id": "a1adadec-a2ff-4f4f-b27b-2ce051e22bc3",
  "expires_at": "2026-10-29T09:07:57.144680578Z",
  "resend_available_at": "2026-10-29T09:02:58.144680578Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675445633` → **200**

```json
{
  "phone": "+380675445633",
  "audience": "CLIENT",
  "code": "768975",
  "sent_at": "2026-10-29T09:02:57.146557461Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a1adadec-a2ff-4f4f-b27b-2ce051e22bc3",
  "code": "768975",
  "device_ref": "sandbox-23435"
}
```

```json
{
  "session_id": "10982433-6fb4-4d40-9e33-76e0ca0e0d48",
  "subject": {
    "type": "CLIENT",
    "id": "1eb46821-7da0-40e4-af13-83b75ece90fe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZWI0NjgyMS03ZGEwLTQwZTQtYWYxMy04M2I3NWVjZTkwZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1NDc3LCJpYXQiOjE3OTMyNjQ1NzcsImp0aSI6ImZkMGJmYmNmLTk2ZjQtNGM1OS1hZDExLTA5ODdmOThhYTBkNSIsInNpZCI6IjEwOTgyNDMzLTZmYjQtNGQ0MC05ZTMzLTc2ZTBjYTBlMGQ0OCJ9.o3RbMJ4um_ezxVwco-wZV2cm1wX_xhUOMg9p3CtBDlU",
  "access_expires_at": "2026-10-29T09:17:57.341034527Z",
  "refresh_token": "ss_Uki_RStBnMyQhuRAo2BcrzG8oVfvp-QpkeyPFAi0",
  "refresh_expires_at": "2026-11-28T09:02:57.340683827Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "cdaba5ee-6613-43f2-9a4b-1bd36ffbac8e",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "5b9ac6c7-b2a6-432d-95df-063847e27ecd",
  "upload_path": "/api/rider/v1/uploads/5b9ac6c7-b2a6-432d-95df-063847e27ecd",
  "expires_at": "2026-10-29T09:17:57.521288471Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/5b9ac6c7-b2a6-432d-95df-063847e27ecd` → **200**

```json
{
  "file_id": "5b9ac6c7-b2a6-432d-95df-063847e27ecd",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "1828daef-89e7-4295-a140-55152475abe3",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "5b9ac6c7-b2a6-432d-95df-063847e27ecd"
  ]
}
```

```json
{
  "id": "4e24ab0d-7557-4443-914b-d4ff37a19ca7",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "1eb46821-7da0-40e4-af13-83b75ece90fe",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T09:02:57.727897Z",
  "updated_at": "2026-10-29T09:02:57.727897Z",
  "respond_by": "2026-10-29T13:02:57.727897Z",
  "messages": [
    {
      "id": "ea571ed2-db47-4b74-8f17-60e9c18fbc87",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "1eb46821-7da0-40e4-af13-83b75ece90fe",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T09:02:57.728881Z",
      "attachments": [
        {
          "file_id": "5b9ac6c7-b2a6-432d-95df-063847e27ecd",
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
  "session_id": "b61749a1-4abf-4c67-8f42-c33fb72b6137",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjU0NzgsImlhdCI6MTc5MzI2NDU3OCwianRpIjoiMTAwYmZmODAtMDVkYS00Yjk1LTg3OTgtOGEyNmY2M2M2ZWM5Iiwic2lkIjoiYjYxNzQ5YTEtNGFiZi00YzY3LThmNDItYzMzZmI3MmI2MTM3In0.E3QnAZEIvZ-TIDUNBN5YLdIExoZ6mJB3p8ByqQbhtzU",
  "access_expires_at": "2026-10-29T09:17:58.129655464Z",
  "refresh_token": "6fDBl3oVFrpQ5VFDVbKK2S2yVns7QLftmzsOKapEP24",
  "refresh_expires_at": "2026-10-29T21:02:58.129350964Z",
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
  "session_id": "6a95dd4e-fa2c-4981-af77-b5ea3e232126",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjU0NzgsImlhdCI6MTc5MzI2NDU3OCwianRpIjoiMTgyNWI2NTctMWUzOS00MmVlLWExOTktMTU5OTNjODQ4ZDA3Iiwic2lkIjoiNmE5NWRkNGUtZmEyYy00OTgxLWFmNzctYjVlYTNlMjMyMTI2In0.1hbMMtST5zByj7OgwqJzPohBAhHusx90Q__A-lahgxw",
  "access_expires_at": "2026-10-29T09:17:58.514894785Z",
  "refresh_token": "OF96BcCI_cspPyVVNON5cV_LYVFpaohSUoP_dk9_pwM",
  "refresh_expires_at": "2026-10-29T21:02:58.514572028Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/4e24ab0d-7557-4443-914b-d4ff37a19ca7/attachments/5b9ac6c7-b2a6-432d-95df-063847e27ecd` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "83f88034-2f63-4983-b399-d8d698399d13",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "9112b87f-bb27-4f93-9cfe-5db465fc95c3",
  "upload_path": "/api/operator/v1/uploads/9112b87f-bb27-4f93-9cfe-5db465fc95c3",
  "expires_at": "2026-10-29T09:17:58.712951154Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/9112b87f-bb27-4f93-9cfe-5db465fc95c3` → **200**

```json
{
  "file_id": "9112b87f-bb27-4f93-9cfe-5db465fc95c3",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/4e24ab0d-7557-4443-914b-d4ff37a19ca7` → **200**

```json
{
  "id": "4e24ab0d-7557-4443-914b-d4ff37a19ca7",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "1eb46821-7da0-40e4-af13-83b75ece90fe",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T09:02:57.727897Z",
  "updated_at": "2026-10-29T09:02:57.727897Z",
  "respond_by": "2026-10-29T13:02:57.727897Z",
  "messages": [
    {
      "id": "ea571ed2-db47-4b74-8f17-60e9c18fbc87",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "1eb46821-7da0-40e4-af13-83b75ece90fe",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T09:02:57.728881Z",
      "attachments": [
        {
          "file_id": "5b9ac6c7-b2a6-432d-95df-063847e27ecd",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/4e24ab0d-7557-4443-914b-d4ff37a19ca7/comments` → **200**

```json
{
  "command_id": "231a3f2c-62f6-41e7-a7da-e2ead3418798",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "9112b87f-bb27-4f93-9cfe-5db465fc95c3"
  ]
}
```

```json
{
  "id": "4e24ab0d-7557-4443-914b-d4ff37a19ca7",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "1eb46821-7da0-40e4-af13-83b75ece90fe",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T09:02:57.727897Z",
  "updated_at": "2026-10-29T09:02:59.111551Z",
  "respond_by": "2026-10-29T13:02:57.727897Z",
  "messages": [
    {
      "id": "ea571ed2-db47-4b74-8f17-60e9c18fbc87",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "1eb46821-7da0-40e4-af13-83b75ece90fe",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T09:02:57.728881Z",
      "attachments": [
        {
          "file_id": "5b9ac6c7-b2a6-432d-95df-063847e27ecd",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "d7ab63b0-53ee-4f7d-af5c-b87f26106c00",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T09:02:59.11122Z",
      "attachments": [
        {
          "file_id": "9112b87f-bb27-4f93-9cfe-5db465fc95c3",
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

`GET /api/rider/v1/support/cases/4e24ab0d-7557-4443-914b-d4ff37a19ca7` → **200**

```json
{
  "id": "4e24ab0d-7557-4443-914b-d4ff37a19ca7",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "1eb46821-7da0-40e4-af13-83b75ece90fe",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T09:02:57.727897Z",
  "updated_at": "2026-10-29T09:02:59.111551Z",
  "respond_by": "2026-10-29T13:02:57.727897Z",
  "messages": [
    {
      "id": "ea571ed2-db47-4b74-8f17-60e9c18fbc87",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "1eb46821-7da0-40e4-af13-83b75ece90fe",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T09:02:57.728881Z",
      "attachments": [
        {
          "file_id": "5b9ac6c7-b2a6-432d-95df-063847e27ecd",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "d7ab63b0-53ee-4f7d-af5c-b87f26106c00",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T09:02:59.11122Z",
      "attachments": [
        {
          "file_id": "9112b87f-bb27-4f93-9cfe-5db465fc95c3",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/4e24ab0d-7557-4443-914b-d4ff37a19ca7/attachments/9112b87f-bb27-4f93-9cfe-5db465fc95c3` → **200**

Done: support case 4e24ab0d-7557-4443-914b-d4ff37a19ca7, rider attachment 5b9ac6c7-b2a6-432d-95df-063847e27ecd, operator attachment 9112b87f-bb27-4f93-9cfe-5db465fc95c3.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739783798",
  "device_ref": "sandbox-25230"
}
```

```json
{
  "challenge_id": "eb9937ae-23c7-4cd8-b1c3-2e256dad2812",
  "expires_at": "2026-10-29T09:07:59.507064904Z",
  "resend_available_at": "2026-10-29T09:03:00.507064904Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739783798` → **200**

```json
{
  "phone": "+380739783798",
  "audience": "CLIENT",
  "code": "156404",
  "sent_at": "2026-10-29T09:02:59.508815386Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eb9937ae-23c7-4cd8-b1c3-2e256dad2812",
  "code": "156404",
  "device_ref": "sandbox-25230"
}
```

```json
{
  "session_id": "accd7a28-6cf2-4861-925d-54f3af4e8f2a",
  "subject": {
    "type": "CLIENT",
    "id": "73600aa5-7c1d-46b4-b2ef-30c19e32cf51"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MzYwMGFhNS03YzFkLTQ2YjQtYjJlZi0zMGMxOWUzMmNmNTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1NDc5LCJpYXQiOjE3OTMyNjQ1NzksImp0aSI6IjcyNzQxNzYwLTI5MGQtNDJlMS05Y2Y0LWI1MDZjODNjY2NjZSIsInNpZCI6ImFjY2Q3YTI4LTZjZjItNDg2MS05MjVkLTU0ZjNhZjRlOGYyYSJ9.Dt4bTBdpWK5RPT-1hZ-9jknPdjpCeTqeh7PHmcS2F2U",
  "access_expires_at": "2026-10-29T09:17:59.706667414Z",
  "refresh_token": "OPIB4SIku4uK8mrs-ItRCYUfjun_8wv_o0wdD6NWBPQ",
  "refresh_expires_at": "2026-11-28T09:02:59.706330636Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "15feb660-8df1-4e9b-9efc-796375d17752",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "f356eb95-71b9-4a28-b5a5-95495a4e555b",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-f356eb95-71b9-4a28-b5a5-95495a4e555b",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "1214d645233757fa47b483426939735d",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=f356eb95-71b9-4a28-b5a5-95495a4e555b",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739783798"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=f356eb95-71b9-4a28-b5a5-95495a4e555b",
  "expires_at": "2026-10-29T09:32:59.886877Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/f356eb95-71b9-4a28-b5a5-95495a4e555b` → **200**

```json
{
  "id": "f356eb95-71b9-4a28-b5a5-95495a4e555b",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T09:32:59.886877Z",
  "card": {
    "id": "2ed102b2-15a7-457e-9ecf-2788d99a9de1",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4714",
    "card_type": "Visa",
    "created_at": "2026-10-29T09:03:00.070573Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e58c4228-e361-4bb8-b794-2a9fecb07ba0",
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
  "id": "06b48e71-7389-4d09-b6ac-11f43e0cf624",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:08:00.275358Z",
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
  "command_id": "1ee74e33-bbde-4463-b6b4-ccd5e42af1b3",
  "quote_id": "06b48e71-7389-4d09-b6ac-11f43e0cf624",
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
  "id": "3f38db67-379b-432e-a2ba-f9fd3c88a37a",
  "short_number": 25,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "73600aa5-7c1d-46b4-b2ef-30c19e32cf51",
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
  "created_at": "2026-10-29T09:03:00.46579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3f38db67-379b-432e-a2ba-f9fd3c88a37a` → **200**

```json
{
  "id": "3f38db67-379b-432e-a2ba-f9fd3c88a37a",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "73600aa5-7c1d-46b4-b2ef-30c19e32cf51",
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
  "created_at": "2026-10-29T09:03:00.46579Z",
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

`GET /api/rider/v1/orders/3f38db67-379b-432e-a2ba-f9fd3c88a37a` → **200**

```json
{
  "id": "3f38db67-379b-432e-a2ba-f9fd3c88a37a",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "73600aa5-7c1d-46b4-b2ef-30c19e32cf51",
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
  "created_at": "2026-10-29T09:03:00.46579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3f38db67-379b-432e-a2ba-f9fd3c88a37a/switch-to-cash` → **200**

```json
{
  "command_id": "ca6478fe-113f-496d-94fe-8478d7581c07",
  "expected_version": 3
}
```

```json
{
  "id": "3f38db67-379b-432e-a2ba-f9fd3c88a37a",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "73600aa5-7c1d-46b4-b2ef-30c19e32cf51",
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
  "created_at": "2026-10-29T09:03:00.46579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3f38db67-379b-432e-a2ba-f9fd3c88a37a/switch-to-cash` → **409**

```json
{
  "command_id": "9b5cf83f-5275-44c4-a131-783ecfad06d1",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/3f38db67-379b-432e-a2ba-f9fd3c88a37a/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1020c1ef-0eb9-4073-abd9-e13022dbc378"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/3f38db67-379b-432e-a2ba-f9fd3c88a37a` → **200**

```json
{
  "id": "3f38db67-379b-432e-a2ba-f9fd3c88a37a",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "73600aa5-7c1d-46b4-b2ef-30c19e32cf51",
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
  "created_at": "2026-10-29T09:03:00.46579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3f38db67-379b-432e-a2ba-f9fd3c88a37a/cancel` → **200**

```json
{
  "command_id": "856c84bf-85ed-4552-a557-30090cd90622",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3f38db67-379b-432e-a2ba-f9fd3c88a37a",
  "short_number": 25,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "73600aa5-7c1d-46b4-b2ef-30c19e32cf51",
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
  "created_at": "2026-10-29T09:03:00.46579Z",
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
  "session_id": "9d56b3bd-54d9-432c-92ca-4ee139128748",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjU0ODIsImlhdCI6MTc5MzI2NDU4MiwianRpIjoiNzdjNjIxOGItYjcwZi00NGQ5LTgxYzItNjVjNGEzOTkwZmNlIiwic2lkIjoiOWQ1NmIzYmQtNTRkOS00MzJjLTkyY2EtNGVlMTM5MTI4NzQ4In0.rSkiUgCNphmXmdnbOj2Ho8PhgQhgqb16BpJni8HqLPk",
  "access_expires_at": "2026-10-29T09:18:02.022343576Z",
  "refresh_token": "wT5IveKMcgIrjglZ0_mp_MDdnVi4E8LbnM02xE3iBM8",
  "refresh_expires_at": "2026-10-29T21:03:02.022033888Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-19070"
}
```

```json
{
  "challenge_id": "75825796-35a6-4900-9621-fe80b9c44d5b",
  "expires_at": "2026-10-29T09:08:02.199024788Z",
  "resend_available_at": "2026-10-29T09:03:03.199024788Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "926666",
  "sent_at": "2026-10-29T09:03:02.200819247Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "75825796-35a6-4900-9621-fe80b9c44d5b",
  "code": "926666",
  "device_ref": "sandbox-19070"
}
```

```json
{
  "session_id": "c9e33f4e-e47c-4006-8941-565f4149175f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTQ4MiwiaWF0IjoxNzkzMjY0NTgyLCJqdGkiOiJhNjdmZDE1OC00YTBlLTQxMzgtYjEzZC03OWQ1YWJmMzk4MTgiLCJzaWQiOiJjOWUzM2Y0ZS1lNDdjLTQwMDYtODk0MS01NjVmNDE0OTE3NWYifQ.m8HVmzTejRV9_cZOfNcWin0oEqLr8fWe4BYoF31005s",
  "access_expires_at": "2026-10-29T09:18:02.403711872Z",
  "refresh_token": "j6Nzj-KC-RlNFQqoTIEMGm1mUhGq8eJsYDLs8wMhx9Q",
  "refresh_expires_at": "2026-11-28T09:03:02.403287632Z",
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

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
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
  },
  "phone": "+380500000003",
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T09:02:52.233703Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T09:02:53.184316Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "b4b1d893-cc5e-4a94-ab28-07ac3d4510f1",
  "expected_version": 7,
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
  "version": 8,
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
  "device_ref": "sandbox-19554"
}
```

```json
{
  "challenge_id": "82a08325-b5fe-40e3-ba22-b711182a2f39",
  "expires_at": "2026-10-29T09:08:03.170775765Z",
  "resend_available_at": "2026-10-29T09:03:04.170775765Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "642635",
  "sent_at": "2026-10-29T09:03:03.172772139Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "82a08325-b5fe-40e3-ba22-b711182a2f39",
  "code": "642635",
  "device_ref": "sandbox-19554"
}
```

```json
{
  "session_id": "c7d2520d-374c-4f10-9a64-4a99d9e6c31f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTQ4MywiaWF0IjoxNzkzMjY0NTgzLCJqdGkiOiI4NGQwNmY4Mi1lYThmLTRjZTgtYTQzZS1mMDNjMmVhOGRiODgiLCJzaWQiOiJjN2QyNTIwZC0zNzRjLTRmMTAtOWE2NC00YTk5ZDllNmMzMWYifQ.qiytNeokwGYTvKcOHJ3PWqdSu1t4YgtskDkz3GVdhHQ",
  "access_expires_at": "2026-10-29T09:18:03.373032338Z",
  "refresh_token": "kHOgVIXTZBfIE_rnImlWPv9GczmEk2YW7Lw6YhOHXTo",
  "refresh_expires_at": "2026-11-28T09:03:03.372668929Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ef86ba7b-1302-4767-9bf0-f0c189632d46",
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
  "last_heartbeat_at": "2026-10-29T09:02:34.696646Z",
  "last_location_at": "2026-10-29T09:02:34.696646Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ef86ba7b-1302-4767-9bf0-f0c189632d46/handover` → **200**

```json
{
  "command_id": "83741895-0319-4eb2-ad4f-85f26764291f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ef86ba7b-1302-4767-9bf0-f0c189632d46",
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
  "last_heartbeat_at": "2026-10-29T09:02:34.696646Z",
  "last_location_at": "2026-10-29T09:02:34.696646Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ef86ba7b-1302-4767-9bf0-f0c189632d46/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:03:03Z",
    "sequence": 1793264583904
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ef86ba7b-1302-4767-9bf0-f0c189632d46",
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
  "last_heartbeat_at": "2026-10-29T09:03:03.918978Z",
  "last_location_at": "2026-10-29T09:03:03.918978Z",
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
  "command_id": "537cfd70-02e8-4412-9ee5-fa0c4b060171",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:03:04Z",
    "sequence": 1793264584277
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d7855719-dbbc-47e7-8838-d24640679afa",
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
  "last_heartbeat_at": "2026-10-29T09:03:04.291926Z",
  "last_location_at": "2026-10-29T09:03:04.291926Z",
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
  "session_id": "5e6dbe8b-9414-4240-9984-ff112b3a29e5",
  "subject": {
    "type": "STAFF",
    "id": "6ee6968e-c7cf-40fd-b22b-a4857fddd494"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWU2OTY4ZS1jN2NmLTQwZmQtYjIyYi1hNDg1N2ZkZGQ0OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjU0ODQsImlhdCI6MTc5MzI2NDU4NCwianRpIjoiODQyNWI1MDctYmUxNC00OTdmLWIyY2EtOGJhYWZmZjdkYmRlIiwic2lkIjoiNWU2ZGJlOGItOTQxNC00MjQwLTk5ODQtZmYxMTJiM2EyOWU1In0.eJdkwya68gj0hlC6JL5OhZS46QYyHYvKPMGwzwlpMnY",
  "access_expires_at": "2026-10-29T09:18:04.674736907Z",
  "refresh_token": "nW0iZtxTAxsA22N_767a13hwPsRRrZSpUIhdk-nWXN4",
  "refresh_expires_at": "2026-10-29T21:03:04.674437375Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2fec58c0-9982-4ebf-90d2-bc31fdef724e",
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
  "id": "03f41528-184c-4a68-8518-fc388ce41714",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:08:04.852711Z",
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
  "command_id": "0e44ad69-660b-42fc-b1c2-b9a2d0bc8546",
  "quote_id": "03f41528-184c-4a68-8518-fc388ce41714",
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
  "id": "5146fec3-f0f6-4ada-b46a-74a81386014e",
  "short_number": 26,
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
  "created_at": "2026-10-29T09:03:05.03834Z",
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
    "id": "3b01c13a-2112-467d-b58a-7516ff881480",
    "order_id": "5146fec3-f0f6-4ada-b46a-74a81386014e",
    "expires_at": "2026-10-29T09:03:20.041102Z",
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

`POST /api/driver/v1/offers/3b01c13a-2112-467d-b58a-7516ff881480/accept` → **200**

```json
{
  "command_id": "d74066a9-e392-4425-afe5-c272e6ca0a89"
}
```

```json
{
  "id": "95e6c6cd-2550-4d1c-89dd-2371f266b02a",
  "order_id": "5146fec3-f0f6-4ada-b46a-74a81386014e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "52848d1a-09d2-475f-81f5-b8aaaf2e29bf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "52848d1a-09d2-475f-81f5-b8aaaf2e29bf",
  "order_id": "5146fec3-f0f6-4ada-b46a-74a81386014e",
  "assignment_id": "95e6c6cd-2550-4d1c-89dd-2371f266b02a",
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

`POST /api/driver/v1/work-sessions/d7855719-dbbc-47e7-8838-d24640679afa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:03:05Z",
    "sequence": 1793264586139
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d7855719-dbbc-47e7-8838-d24640679afa",
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
  "last_heartbeat_at": "2026-10-29T09:03:06.016221Z",
  "last_location_at": "2026-10-29T09:03:06.016221Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/52848d1a-09d2-475f-81f5-b8aaaf2e29bf/arrive` → **200**

```json
{
  "command_id": "d9b685fb-d66d-4ec0-80a4-e459750fa10f",
  "expected_version": 0
}
```

```json
{
  "id": "52848d1a-09d2-475f-81f5-b8aaaf2e29bf",
  "order_id": "5146fec3-f0f6-4ada-b46a-74a81386014e",
  "assignment_id": "95e6c6cd-2550-4d1c-89dd-2371f266b02a",
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
  "arrived_at": "2026-10-29T09:03:06.201064Z",
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

`POST /api/driver/v1/trips/52848d1a-09d2-475f-81f5-b8aaaf2e29bf/start` → **200**

```json
{
  "command_id": "d203b7fb-4b8a-4ef8-98f1-57ef9a70d61c",
  "expected_version": 1
}
```

```json
{
  "id": "52848d1a-09d2-475f-81f5-b8aaaf2e29bf",
  "order_id": "5146fec3-f0f6-4ada-b46a-74a81386014e",
  "assignment_id": "95e6c6cd-2550-4d1c-89dd-2371f266b02a",
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
  "arrived_at": "2026-10-29T09:03:06.201064Z",
  "started_at": "2026-10-29T09:03:06.386763Z",
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

`POST /api/driver/v1/trips/52848d1a-09d2-475f-81f5-b8aaaf2e29bf/complete` → **200**

```json
{
  "command_id": "6f29519a-9ea2-4980-9bdf-0ff4c672f6f1",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:03:06Z",
  "cash_received": true
}
```

```json
{
  "id": "52848d1a-09d2-475f-81f5-b8aaaf2e29bf",
  "order_id": "5146fec3-f0f6-4ada-b46a-74a81386014e",
  "assignment_id": "95e6c6cd-2550-4d1c-89dd-2371f266b02a",
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
  "arrived_at": "2026-10-29T09:03:06.201064Z",
  "started_at": "2026-10-29T09:03:06.386763Z",
  "completed_at": "2026-10-29T09:03:06.577154Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/5146fec3-f0f6-4ada-b46a-74a81386014e` → **200**

```json
{
  "id": "5146fec3-f0f6-4ada-b46a-74a81386014e",
  "short_number": 26,
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
    "id": "95e6c6cd-2550-4d1c-89dd-2371f266b02a",
    "order_id": "5146fec3-f0f6-4ada-b46a-74a81386014e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "52848d1a-09d2-475f-81f5-b8aaaf2e29bf",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:03:05.03834Z",
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
      "balance_minor": 28209,
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
  "session_id": "ef86ba7b-1302-4767-9bf0-f0c189632d46",
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
  "last_heartbeat_at": "2026-10-29T09:03:03.918978Z",
  "last_location_at": "2026-10-29T09:03:03.918978Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ef86ba7b-1302-4767-9bf0-f0c189632d46/close` → **200**

```json
{
  "command_id": "fb35a9fd-7cf6-4aea-bdbc-f80e7d39e3c5",
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
  "session_id": "d7855719-dbbc-47e7-8838-d24640679afa",
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
  "last_heartbeat_at": "2026-10-29T09:03:06.016221Z",
  "last_location_at": "2026-10-29T09:03:06.016221Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d7855719-dbbc-47e7-8838-d24640679afa/close` → **200**

```json
{
  "command_id": "93ddd160-fba3-4981-ab62-8458b666faf5",
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

Done: terminal order 5146fec3-f0f6-4ada-b46a-74a81386014e by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10043"
}
```

```json
{
  "challenge_id": "427033c6-0252-4e72-9bbe-b8061ae262ee",
  "expires_at": "2026-10-29T09:08:10.946746977Z",
  "resend_available_at": "2026-10-29T09:03:11.946746977Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "531960",
  "sent_at": "2026-10-29T09:03:10.948874489Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "427033c6-0252-4e72-9bbe-b8061ae262ee",
  "code": "531960",
  "device_ref": "sandbox-10043"
}
```

```json
{
  "session_id": "40050e8e-d816-45ae-b092-c05888b4e76f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTQ5MSwiaWF0IjoxNzkzMjY0NTkxLCJqdGkiOiJjNmQ5OTI3OS1lYmI5LTQyYTQtODc1OS00NDAzZTc1ZjU5MWMiLCJzaWQiOiI0MDA1MGU4ZS1kODE2LTQ1YWUtYjA5Mi1jMDU4ODhiNGU3NmYifQ.__XHKowRhmHbW-RKh1q4qq27Z8b494yZVExyab4FzY8",
  "access_expires_at": "2026-10-29T09:18:11.153633231Z",
  "refresh_token": "q98B4XG9gIxnS3jDBkd5r2HCn-SZnKpdhyxRHuCzDAs",
  "refresh_expires_at": "2026-11-28T09:03:11.153258175Z",
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
  "device_ref": "sandbox-6419"
}
```

```json
{
  "challenge_id": "950b8c48-7e5e-4890-afbd-de91fb0bf382",
  "expires_at": "2026-10-29T09:08:11.509667255Z",
  "resend_available_at": "2026-10-29T09:03:12.509667255Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "102758",
  "sent_at": "2026-10-29T09:03:11.5115118Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "950b8c48-7e5e-4890-afbd-de91fb0bf382",
  "code": "102758",
  "device_ref": "sandbox-6419"
}
```

```json
{
  "session_id": "0676bb66-fc6f-452d-ad6c-e7eb8933c7b5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTQ5MSwiaWF0IjoxNzkzMjY0NTkxLCJqdGkiOiI2MjVmNGEyYy1jZjcwLTQyM2ItYmIwYS02MTlhZGQ4NTZiMWQiLCJzaWQiOiIwNjc2YmI2Ni1mYzZmLTQ1MmQtYWQ2Yy1lN2ViODkzM2M3YjUifQ.Qgp5Do_Qxy9S1MxZR2scK0ESlzbVfGSOcvB3NK4iQ8c",
  "access_expires_at": "2026-10-29T09:18:11.715153916Z",
  "refresh_token": "LumF1IqHXwhYn1diGjkovLiV8lpTt6kkIns9I9zc7Nc",
  "refresh_expires_at": "2026-11-28T09:03:11.714813132Z",
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
  "device_ref": "sandbox-13055"
}
```

```json
{
  "challenge_id": "41b64d78-e313-4ddd-ac5e-45a6a501f5da",
  "expires_at": "2026-10-29T09:08:12.101817259Z",
  "resend_available_at": "2026-10-29T09:03:13.101817259Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "660431",
  "sent_at": "2026-10-29T09:03:12.103991692Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "41b64d78-e313-4ddd-ac5e-45a6a501f5da",
  "code": "660431",
  "device_ref": "sandbox-13055"
}
```

```json
{
  "session_id": "8dfa3115-0b93-45a6-a540-4895511792de",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NTQ5MiwiaWF0IjoxNzkzMjY0NTkyLCJqdGkiOiIwMmU2NDAwMi04YTIyLTRhZDUtYWQwZi1lZjg0ZDFjYTIzMjMiLCJzaWQiOiI4ZGZhMzExNS0wYjkzLTQ1YTYtYTU0MC00ODk1NTExNzkyZGUifQ.3I5zDXneVywirzmau1rD1gzt37F2b2B5bnHUFeQEgUk",
  "access_expires_at": "2026-10-29T09:18:12.308147313Z",
  "refresh_token": "D38QEdqScKjPSWr30rTS-qgTt9ZMwjJItaYpmjEzuIY",
  "refresh_expires_at": "2026-11-28T09:03:12.307757664Z",
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
  "phone": "+380691906604",
  "device_ref": "sandbox-11936"
}
```

```json
{
  "challenge_id": "3c8b6bb9-5af9-41af-baed-29cc0cffbb37",
  "expires_at": "2026-10-29T09:08:12.661783317Z",
  "resend_available_at": "2026-10-29T09:03:13.661783317Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380691906604` → **200**

```json
{
  "phone": "+380691906604",
  "audience": "CLIENT",
  "code": "278388",
  "sent_at": "2026-10-29T09:03:12.663722805Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c8b6bb9-5af9-41af-baed-29cc0cffbb37",
  "code": "278388",
  "device_ref": "sandbox-11936"
}
```

```json
{
  "session_id": "a59fe72d-67c1-43c7-9b32-2101832a45ec",
  "subject": {
    "type": "CLIENT",
    "id": "2121b6bf-20f9-45d8-b12b-f8a039066830"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTIxYjZiZi0yMGY5LTQ1ZDgtYjEyYi1mOGEwMzkwNjY4MzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY1NDkyLCJpYXQiOjE3OTMyNjQ1OTIsImp0aSI6Ijc4NzM1NDY0LWRmYTItNGFiMC05ODk2LTI4MTc5MTI1NTNhYyIsInNpZCI6ImE1OWZlNzJkLTY3YzEtNDNjNy05YjMyLTIxMDE4MzJhNDVlYyJ9.I_eYl4ZMcgPF_OwsJrkqK0vZbTQyZfJqUHXHqopGDAI",
  "access_expires_at": "2026-10-29T09:18:12.865044909Z",
  "refresh_token": "K0JNwZCWEf2Zcy4EETxbJeacnYe26nNs8pgCPhJBcsE",
  "refresh_expires_at": "2026-11-28T09:03:12.864744635Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2f420ea5-f6a2-4786-8ece-6eb380fe86c1",
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
  "id": "f0e76d97-9ea5-452d-96d3-ea7b0b2fc5f2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:08:13.050064Z",
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
  "command_id": "6aa354d4-ddad-418b-b0e9-62e1f9f21e01",
  "quote_id": "f0e76d97-9ea5-452d-96d3-ea7b0b2fc5f2",
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
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T09:03:13.239818Z",
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
  "blizz_orders_total": 27,
  "blizz_orders_cancelled_total": 14,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 17,
  "blizz_dispatch_assigned_seconds_count": 16,
  "blizz_offers_total": 19,
  "blizz_dispatch_excluded_total": 9,
  "blizz_sms_sent_total": 70
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 16
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 8.963932822
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 4.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 17
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.109008835
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 16.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 1.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 19.0
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
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 63.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/3409af39-3bdd-4a16-b839-959892ff764e` → **200**

```json
{
  "id": "3409af39-3bdd-4a16-b839-959892ff764e",
  "short_number": 27,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2121b6bf-20f9-45d8-b12b-f8a039066830",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T09:03:13.239818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793264896618E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793264896679E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.79326489668E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793264896681E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.79326489668E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
