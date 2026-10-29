# Sandbox transcript (2026-10-29T07:41:46Z, 8101429)

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
  "correlation_id": "8ce33a80-39b4-43bb-9006-e23842011c7c"
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
  "session_id": "f542a06e-b377-4f68-8598-907d192ed125",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA2MTIsImlhdCI6MTc5MzI1OTcxMiwianRpIjoiYzk0ZmZkZWUtZDI0Yy00ZDhhLWExMjAtNmU2YTRiMjZkMmNiIiwic2lkIjoiZjU0MmEwNmUtYjM3Ny00ZjY4LTg1OTgtOTA3ZDE5MmVkMTI1In0.NkmhEjzuKLhFBMwLDCgQOPDm97C5VdwhNoDswrqGMjk",
  "access_expires_at": "2026-10-29T07:56:52.124674427Z",
  "refresh_token": "-QVSORDp_j8pdVqZfX0NIw5ZCXA_6h_T4NU9bKtcMwA",
  "refresh_expires_at": "2026-10-29T19:41:52.122935098Z",
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
  "session_id": "33187219-39b5-4338-8f0e-1dc0809f815f",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA2MTMsImlhdCI6MTc5MzI1OTcxMywianRpIjoiMzY0NmJjMTAtNWQ3NS00OTM0LTg5MDYtMmZjYjNhNjc5MTA2Iiwic2lkIjoiMzMxODcyMTktMzliNS00MzM4LThmMGUtMWRjMDgwOWY4MTVmIn0.bFS3fKbIFMBfKueQ2vHzYyMP0iIsOzWgzMp-WGUvdmw",
  "access_expires_at": "2026-10-29T07:56:53.224395364Z",
  "refresh_token": "Yxjc3uKR9ipNYSpsgHEf9zSu0yiLFBv0_6iZTLik8io",
  "refresh_expires_at": "2026-10-29T19:41:53.22362924Z",
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
  "device_ref": "sandbox-12983"
}
```

```json
{
  "challenge_id": "ea788824-bfc5-486d-ab3f-8028a780399c",
  "expires_at": "2026-10-29T07:46:53.618734171Z",
  "resend_available_at": "2026-10-29T07:41:54.618734171Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "026613",
  "sent_at": "2026-10-29T07:41:53.626813761Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ea788824-bfc5-486d-ab3f-8028a780399c",
  "code": "026613",
  "device_ref": "sandbox-12983"
}
```

```json
{
  "session_id": "a1136b70-8521-4c9b-833d-68785202a91b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDYxMywiaWF0IjoxNzkzMjU5NzEzLCJqdGkiOiJkMWY4NjYzNy00MjM2LTRkNWItYTYxOC1iNDMxYmNlNzlhMzciLCJzaWQiOiJhMTEzNmI3MC04NTIxLTRjOWItODMzZC02ODc4NTIwMmE5MWIifQ.JLI1MljzCUMEe2hgIsV0YS069A35RjMGaIIujG96_Dg",
  "access_expires_at": "2026-10-29T07:56:53.851012927Z",
  "refresh_token": "qBkcKebSlRmSTbb8MiGIuPIwdXKwBMg_4MrLcS7FAtY",
  "refresh_expires_at": "2026-11-28T07:41:53.850273037Z",
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
  "command_id": "206e5db4-b027-4252-a7ea-7013f3278ade",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:41:54Z",
    "sequence": 1793259714251
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6d4c13f4-47d3-40dc-8b62-1a35390cba55",
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
  "last_heartbeat_at": "2026-10-29T07:41:54.348385Z",
  "last_location_at": "2026-10-29T07:41:54.348385Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630999213",
  "device_ref": "sandbox-17334"
}
```

```json
{
  "challenge_id": "eda8f937-bb06-467c-b554-cc36cd969bf0",
  "expires_at": "2026-10-29T07:46:54.549033531Z",
  "resend_available_at": "2026-10-29T07:41:55.549033531Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630999213` → **200**

```json
{
  "phone": "+380630999213",
  "audience": "CLIENT",
  "code": "556663",
  "sent_at": "2026-10-29T07:41:54.552305755Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eda8f937-bb06-467c-b554-cc36cd969bf0",
  "code": "556663",
  "device_ref": "sandbox-17334"
}
```

```json
{
  "session_id": "45efe471-a6c1-4b98-92e7-6457d01311d7",
  "subject": {
    "type": "CLIENT",
    "id": "f6ee23ea-bce5-4f66-a7aa-82dd2ae047ff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNmVlMjNlYS1iY2U1LTRmNjYtYTdhYS04MmRkMmFlMDQ3ZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNjE0LCJpYXQiOjE3OTMyNTk3MTQsImp0aSI6IjRkZDFhNmUwLTBjZDQtNDhkOC1hNWMzLWU5ZmYxYWRmZDRmYSIsInNpZCI6IjQ1ZWZlNDcxLWE2YzEtNGI5OC05MmU3LTY0NTdkMDEzMTFkNyJ9.5C_MNDwIkBwZLDGr-c-gCekjFyPLbrup7r6vegIwELA",
  "access_expires_at": "2026-10-29T07:56:54.774171657Z",
  "refresh_token": "epssXTxUh5ASNshI6Mauf3cCl-cjkXOjB33dNdmw89w",
  "refresh_expires_at": "2026-11-28T07:41:54.773267819Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "00b74721-e677-484a-a44f-aa15c45129e0",
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
  "id": "5efae22b-e62f-48e0-a97c-ca6a7ccde569",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:46:54.994066Z",
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
  "command_id": "0b0e3a8c-642d-4706-8eb7-40c04e21a14f",
  "quote_id": "5efae22b-e62f-48e0-a97c-ca6a7ccde569",
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
  "id": "bc003375-966a-46ad-a782-30d6678b735f",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f6ee23ea-bce5-4f66-a7aa-82dd2ae047ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:41:55.263338Z",
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
    "id": "ae2fc672-aac1-4373-9425-1fe088e76d29",
    "order_id": "bc003375-966a-46ad-a782-30d6678b735f",
    "expires_at": "2026-10-29T07:42:10.272394Z",
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

`POST /api/driver/v1/offers/ae2fc672-aac1-4373-9425-1fe088e76d29/accept` → **200**

```json
{
  "command_id": "741ce596-3e38-466f-874e-a2cfaa1d5dca"
}
```

```json
{
  "id": "824b2d1a-80bf-4c7d-b127-80421205fffe",
  "order_id": "bc003375-966a-46ad-a782-30d6678b735f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a69b1dbc-ae2c-47af-99c8-fd64fddd83b2",
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
  "command_id": "4e95cefa-2009-427c-9870-b05fcdf61be3",
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
  "changed_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T07:41:56.153815627Z"
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
  "id": "a69b1dbc-ae2c-47af-99c8-fd64fddd83b2",
  "order_id": "bc003375-966a-46ad-a782-30d6678b735f",
  "assignment_id": "824b2d1a-80bf-4c7d-b127-80421205fffe",
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

`POST /api/driver/v1/work-sessions/6d4c13f4-47d3-40dc-8b62-1a35390cba55/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:41:56Z",
    "sequence": 1793259716755
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6d4c13f4-47d3-40dc-8b62-1a35390cba55",
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
  "last_heartbeat_at": "2026-10-29T07:41:56.779179Z",
  "last_location_at": "2026-10-29T07:41:56.779179Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a69b1dbc-ae2c-47af-99c8-fd64fddd83b2/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "279f2b78-7ba1-463a-b8e7-238898f53608",
  "expected_version": 0
}
```

```json
{
  "id": "a69b1dbc-ae2c-47af-99c8-fd64fddd83b2",
  "order_id": "bc003375-966a-46ad-a782-30d6678b735f",
  "assignment_id": "824b2d1a-80bf-4c7d-b127-80421205fffe",
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
  "arrived_at": "2026-10-29T07:41:56.990814Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a69b1dbc-ae2c-47af-99c8-fd64fddd83b2/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "01e3c86b-6ff4-43e2-876a-3c53e646fc96",
  "expected_version": 1
}
```

```json
{
  "id": "a69b1dbc-ae2c-47af-99c8-fd64fddd83b2",
  "order_id": "bc003375-966a-46ad-a782-30d6678b735f",
  "assignment_id": "824b2d1a-80bf-4c7d-b127-80421205fffe",
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
  "arrived_at": "2026-10-29T07:41:56.990814Z",
  "started_at": "2026-10-29T07:41:57.236554Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a69b1dbc-ae2c-47af-99c8-fd64fddd83b2/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "ea0800e5-c054-4040-83b8-ab15480ba2be",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:41:57Z",
  "cash_received": true
}
```

```json
{
  "id": "a69b1dbc-ae2c-47af-99c8-fd64fddd83b2",
  "order_id": "bc003375-966a-46ad-a782-30d6678b735f",
  "assignment_id": "824b2d1a-80bf-4c7d-b127-80421205fffe",
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
  "arrived_at": "2026-10-29T07:41:56.990814Z",
  "started_at": "2026-10-29T07:41:57.236554Z",
  "completed_at": "2026-10-29T07:41:57.494019Z",
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
  "session_id": "6d4c13f4-47d3-40dc-8b62-1a35390cba55",
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
  "last_heartbeat_at": "2026-10-29T07:41:56.779179Z",
  "last_location_at": "2026-10-29T07:41:56.779179Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6d4c13f4-47d3-40dc-8b62-1a35390cba55/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "44ea883d-d96d-4118-8fdf-f42e46d9c2a9",
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
  "command_id": "cc5bc1a7-54ce-4268-9b37-450361ab420d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:41:58Z",
    "sequence": 1793259718882
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
  "correlation_id": "133417c9-3040-4415-a2d5-021ac80f0740",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "494f0483-be79-46dd-866b-f4c1bf146f9f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:41:58Z",
    "sequence": 1793259718883
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a1445b53-a7ef-44fa-9c2d-2cf4348ce2cd",
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
  "last_heartbeat_at": "2026-10-29T07:41:58.349493Z",
  "last_location_at": "2026-10-29T07:41:58.349493Z",
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
  "changed_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T07:41:56.153816Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "ed30a3f9-ada9-44d5-abcf-f62b85c6621c",
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
  "changed_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T07:41:58.83480507Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a1445b53-a7ef-44fa-9c2d-2cf4348ce2cd",
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
  "last_heartbeat_at": "2026-10-29T07:41:58.349493Z",
  "last_location_at": "2026-10-29T07:41:58.349493Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a1445b53-a7ef-44fa-9c2d-2cf4348ce2cd/close` → **200**

```json
{
  "command_id": "dcdcc2df-c66e-4143-81dc-cabc5b95a81e",
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
  "session_id": "fc2c8f1a-f19e-4e34-8ce5-120d3d746917",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA2MTksImlhdCI6MTc5MzI1OTcxOSwianRpIjoiZWEwZjQwZGQtYmYzYi00YTZjLTk4ODktNjNjMDk2YTNjMWIyIiwic2lkIjoiZmMyYzhmMWEtZjE5ZS00ZTM0LThjZTUtMTIwZDNkNzQ2OTE3In0.y4bHS_h1agw8uUOa6A7daUC1I4CY0pWgm0n0YpnV7TY",
  "access_expires_at": "2026-10-29T07:56:59.706863137Z",
  "refresh_token": "dUDnx_kfFg6q0ReQgi4lFDOgFq9uwNquZa0VxGLegp8",
  "refresh_expires_at": "2026-10-29T19:41:59.706238042Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "f19f4863-d11b-464c-a69e-92a29fcee03e",
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
  "id": "eb3b3cc3-d6db-41e9-a8bb-cffa1d0306cf",
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
  "created_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "created_at": "2026-10-29T07:41:59.908201Z",
  "updated_at": "2026-10-29T07:41:59.908201Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635319559",
  "device_ref": "sandbox-4271"
}
```

```json
{
  "challenge_id": "2f44ae25-1147-4489-98a9-e2af96f1e3e6",
  "expires_at": "2026-10-29T07:47:00.112449115Z",
  "resend_available_at": "2026-10-29T07:42:01.112449115Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635319559` → **200**

```json
{
  "phone": "+380635319559",
  "audience": "CLIENT",
  "code": "700456",
  "sent_at": "2026-10-29T07:42:00.115630365Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f44ae25-1147-4489-98a9-e2af96f1e3e6",
  "code": "700456",
  "device_ref": "sandbox-4271"
}
```

```json
{
  "session_id": "6990327c-dae0-4be2-a248-f3814f6c4ac8",
  "subject": {
    "type": "CLIENT",
    "id": "56a37728-5efc-4038-8150-d8e2825a99a2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmEzNzcyOC01ZWZjLTQwMzgtODE1MC1kOGUyODI1YTk5YTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNjIwLCJpYXQiOjE3OTMyNTk3MjAsImp0aSI6IjUwYWFhZmQzLWNiNGItNDViZC1iNGU4LWRiODIxNTgyMWMyYiIsInNpZCI6IjY5OTAzMjdjLWRhZTAtNGJlMi1hMjQ4LWYzODE0ZjZjNGFjOCJ9.AVLLJj1dXwUtLx0pdIAl3WbsMQShYEc_jc2pTXs6VAQ",
  "access_expires_at": "2026-10-29T07:57:00.322691769Z",
  "refresh_token": "pZj9D6YdEQCxnUSkZsiVg0fURgBustPS9-x35eHBXKw",
  "refresh_expires_at": "2026-11-28T07:42:00.322236955Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380635319559` → **200**

```json
{
  "client_id": "56a37728-5efc-4038-8150-d8e2825a99a2"
}
```

`POST /api/admin/v1/rider-wallets/56a37728-5efc-4038-8150-d8e2825a99a2/top-ups` → **201**

```json
{
  "command_id": "4f608d71-6960-40bb-8227-ccc0d1c04cb8",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "56a37728-5efc-4038-8150-d8e2825a99a2",
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
      "id": "bb7c7c39-6684-4d1f-b52c-d7cf9ba63f2b",
      "at": "2026-10-29T07:42:00.717851Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aabf039d-4ead-4d65-a2b2-c16a98e0ae66",
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
  "id": "ea157d3b-643a-44b3-a5e4-bdc421f13722",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:47:00.936590Z",
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
      "id": "eb3b3cc3-d6db-41e9-a8bb-cffa1d0306cf",
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
  "device_ref": "sandbox-11610"
}
```

```json
{
  "challenge_id": "cae6b79b-7199-43d7-9340-b72c9eb832ae",
  "expires_at": "2026-10-29T07:47:01.13333815Z",
  "resend_available_at": "2026-10-29T07:42:02.13333815Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "601019",
  "sent_at": "2026-10-29T07:42:01.13625928Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cae6b79b-7199-43d7-9340-b72c9eb832ae",
  "code": "601019",
  "device_ref": "sandbox-11610"
}
```

```json
{
  "session_id": "ff7a5f8b-bc9d-4cd9-9fcc-d72f78042473",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDYyMSwiaWF0IjoxNzkzMjU5NzIxLCJqdGkiOiI4NzU0MjI5Yy05NjMxLTQyZmQtYTZmZi0zM2VhMDkzOWY2MmUiLCJzaWQiOiJmZjdhNWY4Yi1iYzlkLTRjZDktOWZjYy1kNzJmNzgwNDI0NzMifQ.nsGlrGEeVBqU-ZpYdm-APKyN_2p6r2b_6lStOu1oWQk",
  "access_expires_at": "2026-10-29T07:57:01.354883355Z",
  "refresh_token": "Jr4GnOawe1AkfJP51VeTBA9SD-P2IbsbIb3tXAeDOQ4",
  "refresh_expires_at": "2026-11-28T07:42:01.354379203Z",
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
  "command_id": "fd60daf9-bf36-40e0-97de-4d293fd38bf6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:42:01Z",
    "sequence": 1793259721759
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8b518c6f-da6f-4947-b3ed-c1dc6d38c1e8",
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
  "last_heartbeat_at": "2026-10-29T07:42:01.780782Z",
  "last_location_at": "2026-10-29T07:42:01.780782Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "e4a4966a-e0c4-4e8a-97e6-3248ba1a1764",
  "quote_id": "ea157d3b-643a-44b3-a5e4-bdc421f13722",
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
  "id": "1267005d-472d-492c-8b36-d48ba76a434d",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56a37728-5efc-4038-8150-d8e2825a99a2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:42:01.980327Z",
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
  "client_id": "56a37728-5efc-4038-8150-d8e2825a99a2",
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
      "id": "bb7c7c39-6684-4d1f-b52c-d7cf9ba63f2b",
      "at": "2026-10-29T07:42:00.717851Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
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
    "id": "a29e4029-1c68-433f-a11e-41f5d426091b",
    "order_id": "1267005d-472d-492c-8b36-d48ba76a434d",
    "expires_at": "2026-10-29T07:42:16.986542Z",
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

`POST /api/driver/v1/offers/a29e4029-1c68-433f-a11e-41f5d426091b/accept` → **200**

```json
{
  "command_id": "58934d17-7c90-44c4-8664-76ec87fbcde1"
}
```

```json
{
  "id": "7536cf6b-6c72-4019-8e08-ecd7a2b0e85f",
  "order_id": "1267005d-472d-492c-8b36-d48ba76a434d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "797a3717-8cb7-41ef-9e40-87c49d1cf5b3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "797a3717-8cb7-41ef-9e40-87c49d1cf5b3",
  "order_id": "1267005d-472d-492c-8b36-d48ba76a434d",
  "assignment_id": "7536cf6b-6c72-4019-8e08-ecd7a2b0e85f",
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

`POST /api/driver/v1/work-sessions/8b518c6f-da6f-4947-b3ed-c1dc6d38c1e8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:42:02Z",
    "sequence": 1793259722937
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8b518c6f-da6f-4947-b3ed-c1dc6d38c1e8",
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
  "last_heartbeat_at": "2026-10-29T07:42:02.956078Z",
  "last_location_at": "2026-10-29T07:42:02.956078Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/797a3717-8cb7-41ef-9e40-87c49d1cf5b3/arrive` → **200**

```json
{
  "command_id": "4b8088b0-e0b5-47ce-bd1d-06118218c4f5",
  "expected_version": 0
}
```

```json
{
  "id": "797a3717-8cb7-41ef-9e40-87c49d1cf5b3",
  "order_id": "1267005d-472d-492c-8b36-d48ba76a434d",
  "assignment_id": "7536cf6b-6c72-4019-8e08-ecd7a2b0e85f",
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
  "arrived_at": "2026-10-29T07:42:03.163852Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/797a3717-8cb7-41ef-9e40-87c49d1cf5b3/start` → **200**

```json
{
  "command_id": "22348ca6-1779-4c58-b4bf-fdb9b46bad17",
  "expected_version": 1
}
```

```json
{
  "id": "797a3717-8cb7-41ef-9e40-87c49d1cf5b3",
  "order_id": "1267005d-472d-492c-8b36-d48ba76a434d",
  "assignment_id": "7536cf6b-6c72-4019-8e08-ecd7a2b0e85f",
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
  "arrived_at": "2026-10-29T07:42:03.163852Z",
  "started_at": "2026-10-29T07:42:03.367427Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/797a3717-8cb7-41ef-9e40-87c49d1cf5b3/complete` → **200**

```json
{
  "command_id": "9726e289-d01d-4cb8-ba53-6d33c539872f",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:42:03Z",
  "cash_received": true
}
```

```json
{
  "id": "797a3717-8cb7-41ef-9e40-87c49d1cf5b3",
  "order_id": "1267005d-472d-492c-8b36-d48ba76a434d",
  "assignment_id": "7536cf6b-6c72-4019-8e08-ecd7a2b0e85f",
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
  "arrived_at": "2026-10-29T07:42:03.163852Z",
  "started_at": "2026-10-29T07:42:03.367427Z",
  "completed_at": "2026-10-29T07:42:03.591895Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "56a37728-5efc-4038-8150-d8e2825a99a2",
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
      "id": "f367ba88-f755-4c9b-b719-26702ad042e7",
      "at": "2026-10-29T07:42:03.627646Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "1267005d-472d-492c-8b36-d48ba76a434d"
    },
    {
      "id": "bb7c7c39-6684-4d1f-b52c-d7cf9ba63f2b",
      "at": "2026-10-29T07:42:00.717851Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/eb3b3cc3-d6db-41e9-a8bb-cffa1d0306cf/archive` → **200**

```json
{
  "command_id": "431bcecd-91d5-4330-9879-062632b211ba",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "eb3b3cc3-d6db-41e9-a8bb-cffa1d0306cf",
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
  "created_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "created_at": "2026-10-29T07:41:59.908201Z",
  "updated_at": "2026-10-29T07:42:07.019328Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8b518c6f-da6f-4947-b3ed-c1dc6d38c1e8",
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
  "last_heartbeat_at": "2026-10-29T07:42:02.956078Z",
  "last_location_at": "2026-10-29T07:42:02.956078Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8b518c6f-da6f-4947-b3ed-c1dc6d38c1e8/close` → **200**

```json
{
  "command_id": "d1ce47dc-09e7-456c-9b2a-d2d1ab0225f1",
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

Done: order 1267005d-472d-492c-8b36-d48ba76a434d.

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
  "session_id": "7ec14363-57bb-44da-8c9b-db7a1fededbe",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA2MjcsImlhdCI6MTc5MzI1OTcyNywianRpIjoiZDZlYzBmYmYtZjNjMS00M2I0LTg5YTYtMmFlNDdiZmNlYjY2Iiwic2lkIjoiN2VjMTQzNjMtNTdiYi00NGRhLThjOWItZGI3YTFmZWRlZGJlIn0.OCEQUCz9UmmRhxCylFYJ1RAeLE12pFcdtk5IXZoaB4k",
  "access_expires_at": "2026-10-29T07:57:07.871221512Z",
  "refresh_token": "YvqdA-w87h4XdsF2CL1aSp6Au12zEcBHofXGjI-HG_Q",
  "refresh_expires_at": "2026-10-29T19:42:07.870516304Z",
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
  "command_id": "c845aa49-9f30-4da2-85ef-6ec04aa673b5",
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
  "session_id": "f58c8713-d30e-4a8f-87cc-b8696fa55280",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA2MjgsImlhdCI6MTc5MzI1OTcyOCwianRpIjoiZDI4YzZlNTYtNWQ1Yy00ODQ5LWJmMDUtZDc1YjE0ZTFjYjQwIiwic2lkIjoiZjU4Yzg3MTMtZDMwZS00YThmLTg3Y2MtYjg2OTZmYTU1MjgwIn0.YGeyQC5gsWdtxpfFRoMDl4bf8wccdAVlwf2oOLsUzqU",
  "access_expires_at": "2026-10-29T07:57:08.820340043Z",
  "refresh_token": "fKTAvFb-mpZGyntwz9Flz4z0X0mqk7kYeS5iSFvkKck",
  "refresh_expires_at": "2026-10-29T19:42:08.81955473Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.667111517",
    "linkedid": "1730052700.667111517",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670257677"
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
    "id": "1730052700.667111517",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "c5871dd1-cf06-4d3c-acf2-9821785bb364",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380670257677",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T07:42:09.169859Z",
      "answered_at": null,
      "ended_at": "2026-10-29T07:42:09.194651Z",
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
    "id": "1730052600.2040220181",
    "linkedid": "1730052600.2040220181",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670257677"
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
      "id": "ef672842-7faf-4f0f-b11e-df75d474979a",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670257677",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T07:42:09.433468Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/ef672842-7faf-4f0f-b11e-df75d474979a/answer` → **200**

```json
{
  "command_id": "2694ccdd-36ae-4a25-a515-f1140b33b99b"
}
```

```json
{
  "id": "ef672842-7faf-4f0f-b11e-df75d474979a",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670257677",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "order_ids": [],
  "started_at": "2026-10-29T07:42:09.433468Z",
  "answered_at": "2026-10-29T07:42:09.671379Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2040220181",
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
    "id": "1730052600.2040220181",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "ef672842-7faf-4f0f-b11e-df75d474979a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670257677",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
      "order_ids": [],
      "started_at": "2026-10-29T07:42:09.433468Z",
      "answered_at": "2026-10-29T07:42:09.671379Z",
      "ended_at": "2026-10-29T07:42:09.89169Z",
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
      "id": "ef672842-7faf-4f0f-b11e-df75d474979a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670257677",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
      "order_ids": [],
      "started_at": "2026-10-29T07:42:09.433468Z",
      "answered_at": "2026-10-29T07:42:09.671379Z",
      "ended_at": "2026-10-29T07:42:09.89169Z",
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
      "id": "ef672842-7faf-4f0f-b11e-df75d474979a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670257677",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
      "order_ids": [],
      "started_at": "2026-10-29T07:42:09.433468Z",
      "answered_at": "2026-10-29T07:42:09.671379Z",
      "ended_at": "2026-10-29T07:42:09.89169Z",
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
      "id": "ef672842-7faf-4f0f-b11e-df75d474979a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670257677",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
      "order_ids": [],
      "started_at": "2026-10-29T07:42:09.433468Z",
      "answered_at": "2026-10-29T07:42:09.671379Z",
      "ended_at": "2026-10-29T07:42:09.89169Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T07:42:15.35138Z"
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
      "id": "ef672842-7faf-4f0f-b11e-df75d474979a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670257677",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
      "order_ids": [],
      "started_at": "2026-10-29T07:42:09.433468Z",
      "answered_at": "2026-10-29T07:42:09.671379Z",
      "ended_at": "2026-10-29T07:42:09.89169Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T07:42:15.35138Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/ef672842-7faf-4f0f-b11e-df75d474979a/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/ef672842-7faf-4f0f-b11e-df75d474979a/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=ef672842-7faf-4f0f-b11e-df75d474979a` → **200**

```json
{
  "changes": [
    {
      "id": "9fcbb65e-daa9-433b-9e1b-38e730c24ba3",
      "occurred_at": "2026-10-29T07:42:16.949835Z",
      "actor_type": "STAFF",
      "actor_id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "ef672842-7faf-4f0f-b11e-df75d474979a",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"91a14acb-4b72-4667-b410-12c1dfa0c9d0\", \"order_ids\": []}",
      "correlation_id": "ebc8139a-0669-4c2b-9065-06fe845e04cf"
    },
    {
      "id": "a3121814-3b50-4ef7-a7fb-958f9a7a12cd",
      "occurred_at": "2026-10-29T07:42:16.921816Z",
      "actor_type": "STAFF",
      "actor_id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "ef672842-7faf-4f0f-b11e-df75d474979a",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"91a14acb-4b72-4667-b410-12c1dfa0c9d0\", \"order_ids\": []}",
      "correlation_id": "8a4413aa-e2fc-46e0-bdf4-601180d0ef7a"
    }
  ]
}
```

Done: call ef672842-7faf-4f0f-b11e-df75d474979a recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-13510"
}
```

```json
{
  "challenge_id": "3c08fbf3-70ea-42b1-a818-41408dddd46f",
  "expires_at": "2026-10-29T07:47:17.18859761Z",
  "resend_available_at": "2026-10-29T07:42:18.18859761Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "318829",
  "sent_at": "2026-10-29T07:42:17.191899872Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c08fbf3-70ea-42b1-a818-41408dddd46f",
  "code": "318829",
  "device_ref": "sandbox-13510"
}
```

```json
{
  "session_id": "2567f47b-8189-4386-9c1b-84acda46e84d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDYzNywiaWF0IjoxNzkzMjU5NzM3LCJqdGkiOiI5ODgxMWQxMy1lOGRiLTQwZWYtOTNmZi1lZmI2ZGQ3ZjkzMWEiLCJzaWQiOiIyNTY3ZjQ3Yi04MTg5LTQzODYtOWMxYi04NGFjZGE0NmU4NGQifQ.DzN3oSuAFfRuiE_VPqv-RqNdNrlImHAvHNNytisGFao",
  "access_expires_at": "2026-10-29T07:57:17.423467716Z",
  "refresh_token": "spr47eRcuLeVDbK1Rhq1M0DkLkdpQb60-45-dK8fpa0",
  "refresh_expires_at": "2026-11-28T07:42:17.42290917Z",
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
  "command_id": "45245a9d-07e3-4219-83e3-5257766efd70",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:42:17Z",
    "sequence": 1793259737809
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2857eba0-0f10-417c-9c78-6422e6c66507",
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
  "last_heartbeat_at": "2026-10-29T07:42:17.833323Z",
  "last_location_at": "2026-10-29T07:42:17.833323Z",
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
  "session_id": "76531944-65ef-41b9-9c0a-0273502d0093",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA2MzgsImlhdCI6MTc5MzI1OTczOCwianRpIjoiY2MzODY3MmEtMzQ3OS00NDEwLWE5ODUtMDhiOGNlZjQ4Njg5Iiwic2lkIjoiNzY1MzE5NDQtNjVlZi00MWI5LTljMGEtMDI3MzUwMmQwMDkzIn0.n-ZqOmz4EJP9hOY2aZNsAvEK1vZ3W9sdcHXxm0bV-yg",
  "access_expires_at": "2026-10-29T07:57:18.25061715Z",
  "refresh_token": "LUIHkWYd_isJvSJKc6suZF7nBaye0AKusFqsATGhXuI",
  "refresh_expires_at": "2026-10-29T19:42:18.250202097Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "00c3dce2-cde0-4a07-b9f3-0fe96a242dc1",
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
  "id": "fafccfe1-4cdd-4e4d-93ca-a818103fc750",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:47:18.450611Z",
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
  "command_id": "f5496b40-0a79-495b-bfb9-1ba2068bc16b",
  "quote_id": "fafccfe1-4cdd-4e4d-93ca-a818103fc750",
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
    "phone": "+380678454809"
  }
}
```

```json
{
  "id": "3ad8c39a-638c-4a93-ba69-67ad0877cce6",
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
  "created_at": "2026-10-29T07:42:18.672568Z",
  "caller": {
    "name": "Олена",
    "phone": "+380678454809"
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
    "id": "17f46412-daff-4bb2-8368-a38203ea5417",
    "order_id": "3ad8c39a-638c-4a93-ba69-67ad0877cce6",
    "expires_at": "2026-10-29T07:42:33.676571Z",
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

`POST /api/driver/v1/offers/17f46412-daff-4bb2-8368-a38203ea5417/accept` → **200**

```json
{
  "command_id": "9d8ab4c3-5837-421e-bfe7-f41a6f9a4d7d"
}
```

```json
{
  "id": "245836dd-d295-4d8b-8e82-e767fd4c7ae3",
  "order_id": "3ad8c39a-638c-4a93-ba69-67ad0877cce6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "00061d78-c4ab-42fc-9bd9-287b45a8e168",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380678454809` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678454809` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678454809` → **200**

```json
[
  {
    "phone": "+380678454809",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:42:20.528709172Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678454809` → **200**

```json
[
  {
    "phone": "+380678454809",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:42:20.528709172Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678454809` → **200**

```json
[
  {
    "phone": "+380678454809",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:42:20.528709172Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "00061d78-c4ab-42fc-9bd9-287b45a8e168",
  "order_id": "3ad8c39a-638c-4a93-ba69-67ad0877cce6",
  "assignment_id": "245836dd-d295-4d8b-8e82-e767fd4c7ae3",
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
    "phone": "+380678454809"
  }
}
```

`POST /api/driver/v1/work-sessions/2857eba0-0f10-417c-9c78-6422e6c66507/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:42:21Z",
    "sequence": 1793259741571
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2857eba0-0f10-417c-9c78-6422e6c66507",
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
  "last_heartbeat_at": "2026-10-29T07:42:21.589374Z",
  "last_location_at": "2026-10-29T07:42:21.589374Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/00061d78-c4ab-42fc-9bd9-287b45a8e168/arrive` → **200**

```json
{
  "command_id": "6f0d6c4b-21f8-4588-8436-7ab1ae9309c4",
  "expected_version": 0
}
```

```json
{
  "id": "00061d78-c4ab-42fc-9bd9-287b45a8e168",
  "order_id": "3ad8c39a-638c-4a93-ba69-67ad0877cce6",
  "assignment_id": "245836dd-d295-4d8b-8e82-e767fd4c7ae3",
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
  "arrived_at": "2026-10-29T07:42:21.785062Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678454809"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380678454809` → **200**

```json
[
  {
    "phone": "+380678454809",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:42:20.528709172Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678454809` → **200**

```json
[
  {
    "phone": "+380678454809",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:42:20.528709172Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678454809` → **200**

```json
[
  {
    "phone": "+380678454809",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:42:20.528709172Z"
  },
  {
    "phone": "+380678454809",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T07:42:23.537410583Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678454809` → **200**

```json
[
  {
    "phone": "+380678454809",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:42:20.528709172Z"
  },
  {
    "phone": "+380678454809",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T07:42:23.537410583Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678454809` → **200**

```json
[
  {
    "phone": "+380678454809",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:42:20.528709172Z"
  },
  {
    "phone": "+380678454809",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T07:42:23.537410583Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/00061d78-c4ab-42fc-9bd9-287b45a8e168/start` → **200**

```json
{
  "command_id": "6672a6b3-c742-4934-95ff-e8b518663954",
  "expected_version": 1
}
```

```json
{
  "id": "00061d78-c4ab-42fc-9bd9-287b45a8e168",
  "order_id": "3ad8c39a-638c-4a93-ba69-67ad0877cce6",
  "assignment_id": "245836dd-d295-4d8b-8e82-e767fd4c7ae3",
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
  "arrived_at": "2026-10-29T07:42:21.785062Z",
  "started_at": "2026-10-29T07:42:24.111741Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678454809"
  }
}
```

`POST /api/driver/v1/trips/00061d78-c4ab-42fc-9bd9-287b45a8e168/complete` → **200**

```json
{
  "command_id": "439df9e2-9598-4b98-8893-d6617be642f6",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:42:24Z",
  "cash_received": true
}
```

```json
{
  "id": "00061d78-c4ab-42fc-9bd9-287b45a8e168",
  "order_id": "3ad8c39a-638c-4a93-ba69-67ad0877cce6",
  "assignment_id": "245836dd-d295-4d8b-8e82-e767fd4c7ae3",
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
  "arrived_at": "2026-10-29T07:42:21.785062Z",
  "started_at": "2026-10-29T07:42:24.111741Z",
  "completed_at": "2026-10-29T07:42:24.327233Z",
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
  "session_id": "2857eba0-0f10-417c-9c78-6422e6c66507",
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
  "last_heartbeat_at": "2026-10-29T07:42:21.589374Z",
  "last_location_at": "2026-10-29T07:42:21.589374Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2857eba0-0f10-417c-9c78-6422e6c66507/close` → **200**

```json
{
  "command_id": "6c408613-e557-4c45-8cdc-0ac9bca3669c",
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
  "phone": "+380633669114",
  "device_ref": "sandbox-19151"
}
```

```json
{
  "challenge_id": "973869e6-c7d5-4809-ab36-7027ff82c60c",
  "expires_at": "2026-10-29T07:47:24.908014962Z",
  "resend_available_at": "2026-10-29T07:42:25.908014962Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633669114` → **200**

```json
{
  "phone": "+380633669114",
  "audience": "CLIENT",
  "code": "909566",
  "sent_at": "2026-10-29T07:42:24.910619577Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "973869e6-c7d5-4809-ab36-7027ff82c60c",
  "code": "909566",
  "device_ref": "sandbox-19151"
}
```

```json
{
  "session_id": "e12e7d61-8262-46ed-b060-31a2d85efb5a",
  "subject": {
    "type": "CLIENT",
    "id": "a8ebf6e2-22f0-4fad-b7eb-3231e17c9f4c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOGViZjZlMi0yMmYwLTRmYWQtYjdlYi0zMjMxZTE3YzlmNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNjQ1LCJpYXQiOjE3OTMyNTk3NDUsImp0aSI6Ijk2ODk3MjExLWFmNWItNDg2NC1hMWQ4LTJhZTA4ZmM4MjZiZSIsInNpZCI6ImUxMmU3ZDYxLTgyNjItNDZlZC1iMDYwLTMxYTJkODVlZmI1YSJ9.s1JnnE8IpxGVkiXVV2vAySAuk3qvmGnA2QvQjYZPsHg",
  "access_expires_at": "2026-10-29T07:57:25.118148054Z",
  "refresh_token": "AnnBMNxMuYRzoRS6UJRH0_SG27p1NQ9VHvxgYEYYjcY",
  "refresh_expires_at": "2026-11-28T07:42:25.117723745Z",
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
  "device_ref": "sandbox-25625"
}
```

```json
{
  "challenge_id": "020c8d8d-652b-436b-b040-c682aac3c046",
  "expires_at": "2026-10-29T07:47:25.48234207Z",
  "resend_available_at": "2026-10-29T07:42:26.48234207Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "056367",
  "sent_at": "2026-10-29T07:42:25.484581955Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "020c8d8d-652b-436b-b040-c682aac3c046",
  "code": "056367",
  "device_ref": "sandbox-25625"
}
```

```json
{
  "session_id": "4ca66fcd-44a6-4154-ace0-86bd8d39ad40",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDY0NSwiaWF0IjoxNzkzMjU5NzQ1LCJqdGkiOiJkNDM4YTZlMi0xZThkLTRjMDgtOTJmOC00YTBhZDkwNDcyYjUiLCJzaWQiOiI0Y2E2NmZjZC00NGE2LTQxNTQtYWNlMC04NmJkOGQzOWFkNDAifQ.vQCWRa2nBp-JxejURodWHXPW-twYPDK7HbCW1U53yt0",
  "access_expires_at": "2026-10-29T07:57:25.692260334Z",
  "refresh_token": "OeKqnIb93BMnIpnIx3wEwdnfymE6-bRmlQeYif1h74M",
  "refresh_expires_at": "2026-11-28T07:42:25.69173429Z",
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
  "session_id": "da82a046-08bb-4e2b-8453-91ed273605c3",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA2NDYsImlhdCI6MTc5MzI1OTc0NiwianRpIjoiNjE3YjI0ZTgtMzE5Yi00MzY3LTg0NzYtZTAzZDU1ODFjNTA1Iiwic2lkIjoiZGE4MmEwNDYtMDhiYi00ZTJiLTg0NTMtOTFlZDI3MzYwNWMzIn0.1nsmuOezEvEGjSb8B0BATBsj09hpAZxbkb3VKzU8l9Q",
  "access_expires_at": "2026-10-29T07:57:26.250006494Z",
  "refresh_token": "Irw4U40-gPvBwZVtETykxIWE2FeYyQJ10OP3Kcq2uL0",
  "refresh_expires_at": "2026-10-29T19:42:26.249600743Z",
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
  "session_id": "72e0bd87-7244-4c26-b0c2-6cfad369e131",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA2NDYsImlhdCI6MTc5MzI1OTc0NiwianRpIjoiNjlkNGY4YzAtZWJkOS00M2Y5LTkyODMtNzI5YjU1Yjk3NjNhIiwic2lkIjoiNzJlMGJkODctNzI0NC00YzI2LWIwYzItNmNmYWQzNjllMTMxIn0.59y_oxnEvCIb37yfQ1mi1t7EqSadqdcteJQ7hk2jiWM",
  "access_expires_at": "2026-10-29T07:57:26.639863271Z",
  "refresh_token": "vxFidVDP7RlKGtzo7x5AmsF8j8Qi5U8qiA_jhqvuAew",
  "refresh_expires_at": "2026-10-29T19:42:26.639322751Z",
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
  "command_id": "2dfe6af2-9061-4fc4-a3d8-15fdaa717166",
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
  "id": "ba193f38-70a8-4ffa-b4c5-80e02b319a8d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:47:27.029360Z",
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
  "command_id": "4c70a842-a42f-4a32-9d03-caa7f9c08165",
  "quote_id": "ba193f38-70a8-4ffa-b4c5-80e02b319a8d",
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
  "id": "cf151a73-f997-43dd-9769-d4d54b8f4d21",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a8ebf6e2-22f0-4fad-b7eb-3231e17c9f4c",
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
  "created_at": "2026-10-29T07:42:27.232783Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cf151a73-f997-43dd-9769-d4d54b8f4d21` → **200**

```json
{
  "id": "cf151a73-f997-43dd-9769-d4d54b8f4d21",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a8ebf6e2-22f0-4fad-b7eb-3231e17c9f4c",
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
  "created_at": "2026-10-29T07:42:27.232783Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/cf151a73-f997-43dd-9769-d4d54b8f4d21/cancel` → **200**

```json
{
  "command_id": "04235e16-ed61-4ef2-9e32-33dc847d1f77",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "cf151a73-f997-43dd-9769-d4d54b8f4d21",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a8ebf6e2-22f0-4fad-b7eb-3231e17c9f4c",
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
  "created_at": "2026-10-29T07:42:27.232783Z",
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
  "command_id": "79b54be8-5877-4107-968b-56aefb3f4181",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:42:28Z",
    "sequence": 1793259748264
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c4895421-6fa9-4ef8-8df8-7adcc7f65b36",
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
  "last_heartbeat_at": "2026-10-29T07:42:28.043849Z",
  "last_location_at": "2026-10-29T07:42:28.043849Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-14730"
}
```

```json
{
  "challenge_id": "662a56bd-b982-49f6-8095-8e18a91e774b",
  "expires_at": "2026-10-29T07:47:28.22992303Z",
  "resend_available_at": "2026-10-29T07:42:29.22992303Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "267913",
  "sent_at": "2026-10-29T07:42:28.232099331Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "662a56bd-b982-49f6-8095-8e18a91e774b",
  "code": "267913",
  "device_ref": "sandbox-14730"
}
```

```json
{
  "session_id": "1a7a9b41-66e5-4dd1-a11d-6d95dbd898eb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDY0OCwiaWF0IjoxNzkzMjU5NzQ4LCJqdGkiOiIzYWUxN2IxYi1mYmRiLTRmNGUtYWM4OC0zZWRjNzk0YWM4NWIiLCJzaWQiOiIxYTdhOWI0MS02NmU1LTRkZDEtYTExZC02ZDk1ZGJkODk4ZWIifQ.yu4Vtpa7dCn0qdUNP8iXyZolEPhLtNnha1Aw1SPPMTM",
  "access_expires_at": "2026-10-29T07:57:28.436405357Z",
  "refresh_token": "9GTzxkO_IVKOBk5dYiwjmk98lKpcrnk4H5y-wbB2ajE",
  "refresh_expires_at": "2026-11-28T07:42:28.436025986Z",
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
  "command_id": "56d25dfc-16cd-4b29-8c50-9a74f4e87727",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:42:28Z",
    "sequence": 1793259748828
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1164282c-6298-4906-96c0-e699ab1b6074",
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
  "last_heartbeat_at": "2026-10-29T07:42:28.845706Z",
  "last_location_at": "2026-10-29T07:42:28.845706Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "62d62e62-cdf6-4fb5-9d52-660a36cb2305",
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
  "id": "352eed15-bb9f-45d7-86d2-95f6924a79e0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:47:29.048467Z",
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
  "command_id": "430a3598-e3bf-44e4-a58f-7e3360306510",
  "quote_id": "352eed15-bb9f-45d7-86d2-95f6924a79e0",
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
  "id": "212cad17-69d9-4be7-9c84-3ebe9b0a7178",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a8ebf6e2-22f0-4fad-b7eb-3231e17c9f4c",
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
  "created_at": "2026-10-29T07:42:29.259374Z",
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
    "id": "30c10ee0-2c25-4643-8cfb-59f9352816a1",
    "order_id": "212cad17-69d9-4be7-9c84-3ebe9b0a7178",
    "expires_at": "2026-10-29T07:42:44.262427Z",
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

`POST /api/driver/v1/offers/30c10ee0-2c25-4643-8cfb-59f9352816a1/accept` → **200**

```json
{
  "command_id": "e21d2130-5bed-4338-808d-d96c5b4601f4"
}
```

```json
{
  "id": "044dc216-f078-46f4-aedb-b3fd4a6d60dc",
  "order_id": "212cad17-69d9-4be7-9c84-3ebe9b0a7178",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "010bb9b7-1d42-46d5-89b0-ccc72e341fe1",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "010bb9b7-1d42-46d5-89b0-ccc72e341fe1",
  "order_id": "212cad17-69d9-4be7-9c84-3ebe9b0a7178",
  "assignment_id": "044dc216-f078-46f4-aedb-b3fd4a6d60dc",
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

`POST /api/driver/v1/trips/010bb9b7-1d42-46d5-89b0-ccc72e341fe1/cancel` → **200**

```json
{
  "command_id": "5a75974c-9da7-4e31-b178-532f425d0bd6",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "010bb9b7-1d42-46d5-89b0-ccc72e341fe1",
  "order_id": "212cad17-69d9-4be7-9c84-3ebe9b0a7178",
  "assignment_id": "044dc216-f078-46f4-aedb-b3fd4a6d60dc",
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

`GET /api/rider/v1/orders/212cad17-69d9-4be7-9c84-3ebe9b0a7178` → **200**

```json
{
  "id": "212cad17-69d9-4be7-9c84-3ebe9b0a7178",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "a8ebf6e2-22f0-4fad-b7eb-3231e17c9f4c",
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
    "id": "044dc216-f078-46f4-aedb-b3fd4a6d60dc",
    "order_id": "212cad17-69d9-4be7-9c84-3ebe9b0a7178",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "010bb9b7-1d42-46d5-89b0-ccc72e341fe1",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T07:42:29.259374Z",
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
    "id": "fea9dfb5-b1c8-4896-ba8d-e548feef86e8",
    "order_id": "212cad17-69d9-4be7-9c84-3ebe9b0a7178",
    "expires_at": "2026-10-29T07:42:45.076514Z",
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

`POST /api/driver/v1/offers/fea9dfb5-b1c8-4896-ba8d-e548feef86e8/accept` → **200**

```json
{
  "command_id": "9ace1901-4974-41c7-9861-c208a77f3de2"
}
```

```json
{
  "id": "27fe1206-8eb1-49c7-997f-0b458d18101c",
  "order_id": "212cad17-69d9-4be7-9c84-3ebe9b0a7178",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "46a857b9-df73-4fda-a5ef-09bac411be1f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "46a857b9-df73-4fda-a5ef-09bac411be1f",
  "order_id": "212cad17-69d9-4be7-9c84-3ebe9b0a7178",
  "assignment_id": "27fe1206-8eb1-49c7-997f-0b458d18101c",
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

`POST /api/driver/v1/trips/46a857b9-df73-4fda-a5ef-09bac411be1f/cancel` → **200**

```json
{
  "command_id": "52e7d6c0-496f-41cd-9081-da6254b3334d",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "46a857b9-df73-4fda-a5ef-09bac411be1f",
  "order_id": "212cad17-69d9-4be7-9c84-3ebe9b0a7178",
  "assignment_id": "27fe1206-8eb1-49c7-997f-0b458d18101c",
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
    "id": "212cad17-69d9-4be7-9c84-3ebe9b0a7178",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T07:42:29.259374Z",
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
    "id": "cf151a73-f997-43dd-9769-d4d54b8f4d21",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T07:42:27.232783Z",
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

`GET /api/operator/v1/orders/212cad17-69d9-4be7-9c84-3ebe9b0a7178/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:42:29.259923Z",
      "actor": {
        "type": "CLIENT",
        "id": "a8ebf6e2-22f0-4fad-b7eb-3231e17c9f4c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "212cad17-69d9-4be7-9c84-3ebe9b0a7178",
        "quote_id": "352eed15-bb9f-45d7-86d2-95f6924a79e0",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "c3ea36e3-13ba-474d-8ce6-121350526170"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:42:29.261612Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "212cad17-69d9-4be7-9c84-3ebe9b0a7178",
        "attempt_id": "7ed9e3a1-ce33-421f-85d9-d484999d029f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c3ea36e3-13ba-474d-8ce6-121350526170"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T07:42:29.26722Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "30c10ee0-2c25-4643-8cfb-59f9352816a1",
        "order_id": "212cad17-69d9-4be7-9c84-3ebe9b0a7178",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "c3ea36e3-13ba-474d-8ce6-121350526170"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T07:42:29.674161Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "30c10ee0-2c25-4643-8cfb-59f9352816a1",
        "order_id": "212cad17-69d9-4be7-9c84-3ebe9b0a7178",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "044dc216-f078-46f4-aedb-b3fd4a6d60dc"
      },
      "correlation_id": "db940386-4218-414a-8d0b-2ee38f27b1c9"
```

Done: orders cf151a73-f997-43dd-9769-d4d54b8f4d21, 212cad17-69d9-4be7-9c84-3ebe9b0a7178.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734445236",
  "device_ref": "sandbox-12994"
}
```

```json
{
  "challenge_id": "d6bac43c-3064-4fa1-a69a-824af73c1c0d",
  "expires_at": "2026-10-29T07:47:31.693634716Z",
  "resend_available_at": "2026-10-29T07:42:32.693634716Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380734445236` → **200**

```json
{
  "phone": "+380734445236",
  "audience": "CLIENT",
  "code": "376144",
  "sent_at": "2026-10-29T07:42:31.696866559Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6bac43c-3064-4fa1-a69a-824af73c1c0d",
  "code": "376144",
  "device_ref": "sandbox-12994"
}
```

```json
{
  "session_id": "8ceaaad4-94f3-4ea9-9cea-6a8ae0fa8892",
  "subject": {
    "type": "CLIENT",
    "id": "e5e4b0fc-4f05-4bbf-a5bf-17344980dba8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWU0YjBmYy00ZjA1LTRiYmYtYTViZi0xNzM0NDk4MGRiYTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNjUxLCJpYXQiOjE3OTMyNTk3NTEsImp0aSI6IjYxNjA1MmY3LWMyOWUtNGE3Yy1iMDE2LWZlMzJmNzE0MTM3MSIsInNpZCI6IjhjZWFhYWQ0LTk0ZjMtNGVhOS05Y2VhLTZhOGFlMGZhODg5MiJ9.bbXw9bXcFTntxDf-y887BVndt2xJe_7MSrZrNEGMTIs",
  "access_expires_at": "2026-10-29T07:57:31.915874719Z",
  "refresh_token": "5P1dEwyGvimpV5Vo2__WHhGckMUWh2UG8iMUw8-75RU",
  "refresh_expires_at": "2026-11-28T07:42:31.915460787Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "9028dc14-41e4-4db7-98f9-470215a8ba7c",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "e95c5049-1240-4324-8ce1-e3a153ddc358",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-e95c5049-1240-4324-8ce1-e3a153ddc358",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "47a4148f5042f126b0382bb76b8454a4",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=e95c5049-1240-4324-8ce1-e3a153ddc358",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734445236"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=e95c5049-1240-4324-8ce1-e3a153ddc358",
  "expires_at": "2026-10-29T08:12:32.10684Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/e95c5049-1240-4324-8ce1-e3a153ddc358` → **200**

```json
{
  "id": "e95c5049-1240-4324-8ce1-e3a153ddc358",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T08:12:32.10684Z",
  "card": {
    "id": "4675135e-07d5-45f2-9556-6bb846d0b6ca",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7499",
    "card_type": "Visa",
    "created_at": "2026-10-29T07:42:32.304889Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "4675135e-07d5-45f2-9556-6bb846d0b6ca",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****7499",
      "card_type": "Visa",
      "created_at": "2026-10-29T07:42:32.304889Z"
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
  "device_ref": "sandbox-4921"
}
```

```json
{
  "challenge_id": "45172dd4-2e05-44e9-a9ec-002e8c4b5586",
  "expires_at": "2026-10-29T07:47:32.721551121Z",
  "resend_available_at": "2026-10-29T07:42:33.721551121Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "516348",
  "sent_at": "2026-10-29T07:42:32.730222408Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "45172dd4-2e05-44e9-a9ec-002e8c4b5586",
  "code": "516348",
  "device_ref": "sandbox-4921"
}
```

```json
{
  "session_id": "dbd1b847-cb19-46f5-872b-4ffd5b42dfc7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDY1MiwiaWF0IjoxNzkzMjU5NzUyLCJqdGkiOiI3ZDc3ZjViNC1mMWQ5LTQ4NTgtOGI3OC1lMWU4M2ZhMjEzYmQiLCJzaWQiOiJkYmQxYjg0Ny1jYjE5LTQ2ZjUtODcyYi00ZmZkNWI0MmRmYzcifQ.VqDEYay1ztpeB23mGg4u7SLA_NoSg4xJro400fPSjxE",
  "access_expires_at": "2026-10-29T07:57:32.946435548Z",
  "refresh_token": "OR8YbQmNvjwPwdXBnKxW2SrBDcbiLb45KUXM5th5q-4",
  "refresh_expires_at": "2026-11-28T07:42:32.946073292Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1164282c-6298-4906-96c0-e699ab1b6074",
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
  "last_heartbeat_at": "2026-10-29T07:42:28.845706Z",
  "last_location_at": "2026-10-29T07:42:28.845706Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1164282c-6298-4906-96c0-e699ab1b6074/handover` → **200**

```json
{
  "command_id": "668bf55a-8052-4790-bcef-35539f43efbd",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1164282c-6298-4906-96c0-e699ab1b6074",
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
  "last_heartbeat_at": "2026-10-29T07:42:28.845706Z",
  "last_location_at": "2026-10-29T07:42:28.845706Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1164282c-6298-4906-96c0-e699ab1b6074/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:42:33Z",
    "sequence": 1793259753520
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1164282c-6298-4906-96c0-e699ab1b6074",
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
  "last_heartbeat_at": "2026-10-29T07:42:33.538388Z",
  "last_location_at": "2026-10-29T07:42:33.538388Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6dacf393-c982-4795-b3a6-6719a11e86f5",
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
  "id": "0fd6cd3e-0272-4bc2-9caf-962cbf9252bd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:47:33.726982Z",
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
  "command_id": "b205c353-b5a4-4481-9188-d1e74441448d",
  "quote_id": "0fd6cd3e-0272-4bc2-9caf-962cbf9252bd",
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
  "id": "7f940456-8e08-4088-a61b-3894495c8904",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e5e4b0fc-4f05-4bbf-a5bf-17344980dba8",
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
  "created_at": "2026-10-29T07:42:33.931836Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7f940456-8e08-4088-a61b-3894495c8904` → **200**

```json
{
  "id": "7f940456-8e08-4088-a61b-3894495c8904",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e5e4b0fc-4f05-4bbf-a5bf-17344980dba8",
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
  "created_at": "2026-10-29T07:42:33.931836Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7f940456-8e08-4088-a61b-3894495c8904` → **200**

```json
{
  "id": "7f940456-8e08-4088-a61b-3894495c8904",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e5e4b0fc-4f05-4bbf-a5bf-17344980dba8",
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
  "created_at": "2026-10-29T07:42:33.931836Z",
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
    "id": "cb97cee3-1f75-448b-99b6-a1fe60bbbaa0",
    "order_id": "7f940456-8e08-4088-a61b-3894495c8904",
    "expires_at": "2026-10-29T07:42:49.848527Z",
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

`POST /api/driver/v1/offers/cb97cee3-1f75-448b-99b6-a1fe60bbbaa0/accept` → **200**

```json
{
  "command_id": "50ce57d7-3b5c-4000-929c-9c74889543d7"
}
```

```json
{
  "id": "88c0b7a8-d22b-454a-ab09-a8adfa2c5266",
  "order_id": "7f940456-8e08-4088-a61b-3894495c8904",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c8dcbfa2-2189-456a-949a-daf104c82acc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c8dcbfa2-2189-456a-949a-daf104c82acc",
  "order_id": "7f940456-8e08-4088-a61b-3894495c8904",
  "assignment_id": "88c0b7a8-d22b-454a-ab09-a8adfa2c5266",
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

`POST /api/driver/v1/work-sessions/1164282c-6298-4906-96c0-e699ab1b6074/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:42:36Z",
    "sequence": 1793259756835
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1164282c-6298-4906-96c0-e699ab1b6074",
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
  "last_heartbeat_at": "2026-10-29T07:42:36.102052Z",
  "last_location_at": "2026-10-29T07:42:36.102052Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c8dcbfa2-2189-456a-949a-daf104c82acc/arrive` → **200**

```json
{
  "command_id": "f7352c72-ac4a-44ce-a3fa-6af2620ad418",
  "expected_version": 0
}
```

```json
{
  "id": "c8dcbfa2-2189-456a-949a-daf104c82acc",
  "order_id": "7f940456-8e08-4088-a61b-3894495c8904",
  "assignment_id": "88c0b7a8-d22b-454a-ab09-a8adfa2c5266",
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
  "arrived_at": "2026-10-29T07:42:36.317694Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c8dcbfa2-2189-456a-949a-daf104c82acc/start` → **200**

```json
{
  "command_id": "98e504c5-2f0a-421b-a8eb-dad6a9899276",
  "expected_version": 1
}
```

```json
{
  "id": "c8dcbfa2-2189-456a-949a-daf104c82acc",
  "order_id": "7f940456-8e08-4088-a61b-3894495c8904",
  "assignment_id": "88c0b7a8-d22b-454a-ab09-a8adfa2c5266",
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
  "arrived_at": "2026-10-29T07:42:36.317694Z",
  "started_at": "2026-10-29T07:42:36.528687Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c8dcbfa2-2189-456a-949a-daf104c82acc/complete` → **200**

```json
{
  "command_id": "f5588a9b-20c1-4731-abe6-563dad035fac",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:42:36Z",
  "cash_received": true
}
```

```json
{
  "id": "c8dcbfa2-2189-456a-949a-daf104c82acc",
  "order_id": "7f940456-8e08-4088-a61b-3894495c8904",
  "assignment_id": "88c0b7a8-d22b-454a-ab09-a8adfa2c5266",
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
  "arrived_at": "2026-10-29T07:42:36.317694Z",
  "started_at": "2026-10-29T07:42:36.528687Z",
  "completed_at": "2026-10-29T07:42:36.750402Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/7f940456-8e08-4088-a61b-3894495c8904` → **200**

```json
{
  "id": "7f940456-8e08-4088-a61b-3894495c8904",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "e5e4b0fc-4f05-4bbf-a5bf-17344980dba8",
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
    "id": "88c0b7a8-d22b-454a-ab09-a8adfa2c5266",
    "order_id": "7f940456-8e08-4088-a61b-3894495c8904",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c8dcbfa2-2189-456a-949a-daf104c82acc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:42:33.931836Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7f940456-8e08-4088-a61b-3894495c8904` → **200**

```json
{
  "id": "7f940456-8e08-4088-a61b-3894495c8904",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "e5e4b0fc-4f05-4bbf-a5bf-17344980dba8",
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
    "id": "88c0b7a8-d22b-454a-ab09-a8adfa2c5266",
    "order_id": "7f940456-8e08-4088-a61b-3894495c8904",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c8dcbfa2-2189-456a-949a-daf104c82acc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:42:33.931836Z",
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

`GET /api/rider/v1/orders/7f940456-8e08-4088-a61b-3894495c8904/tip` → **200**

```json
{
  "order_id": "7f940456-8e08-4088-a61b-3894495c8904",
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
  "available_until": "2026-10-30T07:42:36.750402Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/7f940456-8e08-4088-a61b-3894495c8904/tip` → **201**

```json
{
  "command_id": "19d25101-58c9-451f-b297-d32ccb2a65ba",
  "amount_minor": 2500
}
```

```json
{
  "id": "ea4707b5-39f3-47aa-b113-43ec8782d1e8",
  "order_id": "7f940456-8e08-4088-a61b-3894495c8904",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T07:42:38.749487Z"
}
```

`GET /api/rider/v1/orders/7f940456-8e08-4088-a61b-3894495c8904/tip` → **200**

```json
{
  "order_id": "7f940456-8e08-4088-a61b-3894495c8904",
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
  "available_until": "2026-10-30T07:42:36.750402Z",
  "open": false,
  "tip": {
    "id": "ea4707b5-39f3-47aa-b113-43ec8782d1e8",
    "order_id": "7f940456-8e08-4088-a61b-3894495c8904",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T07:42:38.749487Z"
  }
}
```

`GET /api/rider/v1/orders/7f940456-8e08-4088-a61b-3894495c8904/tip` → **200**

```json
{
  "order_id": "7f940456-8e08-4088-a61b-3894495c8904",
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
  "available_until": "2026-10-30T07:42:36.750402Z",
  "open": false,
  "tip": {
    "id": "ea4707b5-39f3-47aa-b113-43ec8782d1e8",
    "order_id": "7f940456-8e08-4088-a61b-3894495c8904",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T07:42:38.749487Z"
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
      "id": "18dcb275-22d5-4903-bec7-53f60eed66da",
      "at": "2026-10-29T07:42:39.954255Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7f940456-8e08-4088-a61b-3894495c8904",
      "counterpart_id": null
    },
    {
      "id": "1707d603-b4da-48b1-a247-fc31cd6e17b4",
      "at": "2026-10-29T07:42:36.904849Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7f940456-8e08-4088-a61b-3894495c8904",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f4b601e1-ee35-48fd-b81c-1ad9195a8405",
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
  "id": "c4b6023c-d03b-4e25-981f-b9ebe1ad2717",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:47:40.524684Z",
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
  "session_id": "41eeed3a-8c17-4624-bc27-f5abceb5bfb1",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA2NjAsImlhdCI6MTc5MzI1OTc2MCwianRpIjoiMzBiYWRmZjktZDQ0MS00NzJiLWJlNTEtMzUxM2E3ZjU0YzQxIiwic2lkIjoiNDFlZWVkM2EtOGMxNy00NjI0LWJjMjctZjVhYmNlYjViZmIxIn0.9c8-Wcx6B_w7vh4v0TPzdPkADTxPU1BqBSvZUHo62Yw",
  "access_expires_at": "2026-10-29T07:57:40.946584842Z",
  "refresh_token": "LjiE83wgxowsnxEH4F-JP81Y1tExdBQLmdN7uXDn8VA",
  "refresh_expires_at": "2026-10-29T19:42:40.946173152Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380734445236` → **200**

```json
{
  "client_id": "e5e4b0fc-4f05-4bbf-a5bf-17344980dba8"
}
```

`POST /api/admin/v1/rider-wallets/e5e4b0fc-4f05-4bbf-a5bf-17344980dba8/top-ups` → **201**

```json
{
  "command_id": "b7c18e58-1a41-4b52-abdb-6166650f6773",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "e5e4b0fc-4f05-4bbf-a5bf-17344980dba8",
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
      "id": "d736a148-a33e-42d7-b4fb-bb618ce7fd23",
      "at": "2026-10-29T07:42:41.319256Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "06c6012d-e818-434e-98b8-73535046ccc2",
  "quote_id": "c4b6023c-d03b-4e25-981f-b9ebe1ad2717",
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
  "id": "dd39af07-f48f-436a-a36d-ec346e54dad1",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e5e4b0fc-4f05-4bbf-a5bf-17344980dba8",
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
  "created_at": "2026-10-29T07:42:41.515292Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dd39af07-f48f-436a-a36d-ec346e54dad1` → **200**

```json
{
  "id": "dd39af07-f48f-436a-a36d-ec346e54dad1",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e5e4b0fc-4f05-4bbf-a5bf-17344980dba8",
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
  "created_at": "2026-10-29T07:42:41.515292Z",
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
    "id": "e2dcb270-48a4-4d8d-95f4-9acbdd1809c8",
    "order_id": "dd39af07-f48f-436a-a36d-ec346e54dad1",
    "expires_at": "2026-10-29T07:42:56.518889Z",
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

`POST /api/driver/v1/offers/e2dcb270-48a4-4d8d-95f4-9acbdd1809c8/accept` → **200**

```json
{
  "command_id": "503b811f-bd9a-48e2-9ac1-df4eeff0ab6e"
}
```

```json
{
  "id": "84a20b26-b7f8-44a6-b30a-6a26c9e2483b",
  "order_id": "dd39af07-f48f-436a-a36d-ec346e54dad1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3bd51e3e-620e-4b4e-9260-2d70eff0370a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3bd51e3e-620e-4b4e-9260-2d70eff0370a",
  "order_id": "dd39af07-f48f-436a-a36d-ec346e54dad1",
  "assignment_id": "84a20b26-b7f8-44a6-b30a-6a26c9e2483b",
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

`POST /api/driver/v1/work-sessions/1164282c-6298-4906-96c0-e699ab1b6074/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:42:42Z",
    "sequence": 1793259762478
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1164282c-6298-4906-96c0-e699ab1b6074",
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
  "last_heartbeat_at": "2026-10-29T07:42:42.495766Z",
  "last_location_at": "2026-10-29T07:42:42.495766Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3bd51e3e-620e-4b4e-9260-2d70eff0370a/arrive` → **200**

```json
{
  "command_id": "a5621dbc-b35a-4d44-956f-f5b44c90ef73",
  "expected_version": 0
}
```

```json
{
  "id": "3bd51e3e-620e-4b4e-9260-2d70eff0370a",
  "order_id": "dd39af07-f48f-436a-a36d-ec346e54dad1",
  "assignment_id": "84a20b26-b7f8-44a6-b30a-6a26c9e2483b",
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
  "arrived_at": "2026-10-29T07:42:42.684975Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3bd51e3e-620e-4b4e-9260-2d70eff0370a/start` → **200**

```json
{
  "command_id": "5fcd9b57-bdad-4c10-adf0-ffa9af78fc32",
  "expected_version": 1
}
```

```json
{
  "id": "3bd51e3e-620e-4b4e-9260-2d70eff0370a",
  "order_id": "dd39af07-f48f-436a-a36d-ec346e54dad1",
  "assignment_id": "84a20b26-b7f8-44a6-b30a-6a26c9e2483b",
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
  "arrived_at": "2026-10-29T07:42:42.684975Z",
  "started_at": "2026-10-29T07:42:42.881301Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3bd51e3e-620e-4b4e-9260-2d70eff0370a/complete` → **200**

```json
{
  "command_id": "6aab801e-ab7f-4efc-b1d9-1c17246b950e",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:42:43Z",
  "cash_received": true
}
```

```json
{
  "id": "3bd51e3e-620e-4b4e-9260-2d70eff0370a",
  "order_id": "dd39af07-f48f-436a-a36d-ec346e54dad1",
  "assignment_id": "84a20b26-b7f8-44a6-b30a-6a26c9e2483b",
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
  "arrived_at": "2026-10-29T07:42:42.684975Z",
  "started_at": "2026-10-29T07:42:42.881301Z",
  "completed_at": "2026-10-29T07:42:43.087119Z",
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
  "client_id": "e5e4b0fc-4f05-4bbf-a5bf-17344980dba8",
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
      "id": "d736a148-a33e-42d7-b4fb-bb618ce7fd23",
      "at": "2026-10-29T07:42:41.319256Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
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

`GET /api/rider/v1/orders/dd39af07-f48f-436a-a36d-ec346e54dad1/tip` → **200**

```json
{
  "order_id": "dd39af07-f48f-436a-a36d-ec346e54dad1",
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
  "available_until": "2026-10-30T07:42:43.087119Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/dd39af07-f48f-436a-a36d-ec346e54dad1/tip` → **201**

```json
{
  "command_id": "168845f9-cbbb-4ab6-a670-c5d8cdb51904",
  "amount_minor": 2500
}
```

```json
{
  "id": "339e05a1-d765-444c-9a02-c68ce6a37183",
  "order_id": "dd39af07-f48f-436a-a36d-ec346e54dad1",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T07:42:43.837765Z"
}
```

`GET /api/rider/v1/orders/dd39af07-f48f-436a-a36d-ec346e54dad1/tip` → **200**

```json
{
  "order_id": "dd39af07-f48f-436a-a36d-ec346e54dad1",
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
  "available_until": "2026-10-30T07:42:43.087119Z",
  "open": false,
  "tip": {
    "id": "339e05a1-d765-444c-9a02-c68ce6a37183",
    "order_id": "dd39af07-f48f-436a-a36d-ec346e54dad1",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T07:42:43.837765Z"
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
      "id": "c4000a4a-614b-4b78-a766-4f792eaa05b7",
      "at": "2026-10-29T07:42:43.989381Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "dd39af07-f48f-436a-a36d-ec346e54dad1",
      "counterpart_id": null
    },
    {
      "id": "18dcb275-22d5-4903-bec7-53f60eed66da",
      "at": "2026-10-29T07:42:39.954255Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7f940456-8e08-4088-a61b-3894495c8904",
      "counterpart_id": null
    },
    {
      "id": "1707d603-b4da-48b1-a247-fc31cd6e17b4",
      "at": "2026-10-29T07:42:36.904849Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7f940456-8e08-4088-a61b-3894495c8904",
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
      "id": "dca7a68a-924a-4bcf-a596-8a6510450125",
      "at": "2026-10-29T07:42:45.009824Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "dd39af07-f48f-436a-a36d-ec346e54dad1",
      "counterpart_id": null
    },
    {
      "id": "c4000a4a-614b-4b78-a766-4f792eaa05b7",
      "at": "2026-10-29T07:42:43.989381Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "dd39af07-f48f-436a-a36d-ec346e54dad1",
      "counterpart_id": null
    },
    {
      "id": "18dcb275-22d5-4903-bec7-53f60eed66da",
      "at": "2026-10-29T07:42:39.954255Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7f940456-8e08-4088-a61b-3894495c8904",
      "counterpart_id": null
    },
    {
      "id": "1707d603-b4da-48b1-a247-fc31cd6e17b4",
      "at": "2026-10-29T07:42:36.904849Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7f940456-8e08-4088-a61b-3894495c8904",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1164282c-6298-4906-96c0-e699ab1b6074",
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
  "last_heartbeat_at": "2026-10-29T07:42:42.495766Z",
  "last_location_at": "2026-10-29T07:42:42.495766Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1164282c-6298-4906-96c0-e699ab1b6074/close` → **200**

```json
{
  "command_id": "eae4cf8b-1637-430a-9cfe-2d0169f7c254",
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

Done: card order dd39af07-f48f-436a-a36d-ec346e54dad1.

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
  "phone": "+380734576534",
  "device_ref": "sandbox-8844"
}
```

```json
{
  "challenge_id": "2c50bcf7-fb5b-4d52-9788-90194acfab10",
  "expires_at": "2026-10-29T07:47:46.106975181Z",
  "resend_available_at": "2026-10-29T07:42:47.106975181Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380734576534` → **200**

```json
{
  "phone": "+380734576534",
  "audience": "CLIENT",
  "code": "446649",
  "sent_at": "2026-10-29T07:42:46.108739466Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2c50bcf7-fb5b-4d52-9788-90194acfab10",
  "code": "446649",
  "device_ref": "sandbox-8844"
}
```

```json
{
  "session_id": "25cf7db0-73a5-442c-a7de-9a4c1c1092f8",
  "subject": {
    "type": "CLIENT",
    "id": "83c606d8-ed97-4bae-a1f0-8831096c214a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4M2M2MDZkOC1lZDk3LTRiYWUtYTFmMC04ODMxMDk2YzIxNGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNjY2LCJpYXQiOjE3OTMyNTk3NjYsImp0aSI6IjRkOGYzZDRiLTFlMGMtNDU3ZC1hNWQwLWQzZGIwOTY5NzczMiIsInNpZCI6IjI1Y2Y3ZGIwLTczYTUtNDQyYy1hN2RlLTlhNGMxYzEwOTJmOCJ9.FtoMYVdEkmrRqrwM7plwV7LuR8jB1ZB9XRfydpJmj4A",
  "access_expires_at": "2026-10-29T07:57:46.307005945Z",
  "refresh_token": "MPLmp92-6qC3rXdB87Md107HTxImSMX_pseEnRNjhw0",
  "refresh_expires_at": "2026-11-28T07:42:46.306536789Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "7d64e0a9-ef15-419b-9f34-1cf3c97e1601",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "ac1d96c2-572d-49c6-ad1c-22a4f491448d",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-ac1d96c2-572d-49c6-ad1c-22a4f491448d",
    "orderDate": "1793259766",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "6b1936638c14720e246216b796cad51d",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=ac1d96c2-572d-49c6-ad1c-22a4f491448d",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734576534"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=ac1d96c2-572d-49c6-ad1c-22a4f491448d",
  "created_at": "2026-10-29T07:42:46.481468Z",
  "expires_at": "2026-10-29T08:12:46.481468Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/ac1d96c2-572d-49c6-ad1c-22a4f491448d` → **200**

```json
{
  "id": "ac1d96c2-572d-49c6-ad1c-22a4f491448d",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T07:42:46.481468Z",
  "expires_at": "2026-10-29T08:12:46.481468Z",
  "completed_at": "2026-10-29T07:42:46.675092Z",
  "masked_pan": "41****9474",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "83c606d8-ed97-4bae-a1f0-8831096c214a",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "83c606d8-ed97-4bae-a1f0-8831096c214a",
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
      "id": "c4669428-2b2b-45f5-8579-3d7e141eb7ec",
      "at": "2026-10-29T07:42:47.022573Z",
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
  "client_id": "83c606d8-ed97-4bae-a1f0-8831096c214a",
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
      "id": "c4669428-2b2b-45f5-8579-3d7e141eb7ec",
      "at": "2026-10-29T07:42:47.022573Z",
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
  "device_ref": "sandbox-14724"
}
```

```json
{
  "challenge_id": "56be5fad-95ff-4834-a23c-db08207c3db2",
  "expires_at": "2026-10-29T07:47:48.405123299Z",
  "resend_available_at": "2026-10-29T07:42:49.405123299Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "419311",
  "sent_at": "2026-10-29T07:42:48.407118872Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "56be5fad-95ff-4834-a23c-db08207c3db2",
  "code": "419311",
  "device_ref": "sandbox-14724"
}
```

```json
{
  "session_id": "3e860a19-a105-4c51-85ba-f0aa6d9e00da",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDY2OCwiaWF0IjoxNzkzMjU5NzY4LCJqdGkiOiI3NTQ4OTA4MC1iNjdmLTRmNzctOWRmNS05MTdlZjdmODhiYzYiLCJzaWQiOiIzZTg2MGExOS1hMTA1LTRjNTEtODViYS1mMGFhNmQ5ZTAwZGEifQ.pbQ94I4fWtWbkq9Z4JY5LEq-QhhwANrp5-m8qISZL4o",
  "access_expires_at": "2026-10-29T07:57:48.611147026Z",
  "refresh_token": "o-tqDNelZH5Hr_q2wVfrB_QSUmzHM4vyMD_STJ9eHc4",
  "refresh_expires_at": "2026-11-28T07:42:48.610727544Z",
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
  "command_id": "97524719-5bce-4583-abbf-b01976ba33c1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "063d5598-8a02-4f4d-946a-8b45f6e060a9",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-063d5598-8a02-4f4d-946a-8b45f6e060a9",
    "orderDate": "1793259768",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "5792902fbe130bef7c35a6ec1877106c",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=063d5598-8a02-4f4d-946a-8b45f6e060a9",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=063d5598-8a02-4f4d-946a-8b45f6e060a9",
  "created_at": "2026-10-29T07:42:48.981605Z",
  "expires_at": "2026-10-29T08:12:48.981605Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/063d5598-8a02-4f4d-946a-8b45f6e060a9` → **200**

```json
{
  "id": "063d5598-8a02-4f4d-946a-8b45f6e060a9",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T07:42:48.981605Z",
  "expires_at": "2026-10-29T08:12:48.981605Z",
  "completed_at": "2026-10-29T07:42:49.166862Z",
  "masked_pan": "41****7228",
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
      "id": "97d59f09-ba8e-4c11-8a3b-5c4fedf7d576",
      "at": "2026-10-29T07:42:50.037872Z",
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
  "command_id": "15e1ff83-7928-4b4f-89f5-904043310a45",
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
  "correlation_id": "67e83ad7-e09f-476e-bf4a-3fce9c6e7b8e"
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
  "device_ref": "sandbox-22399"
}
```

```json
{
  "challenge_id": "82e9b6f6-4518-43ab-9114-d42f1f4db8d9",
  "expires_at": "2026-10-29T07:47:50.921663391Z",
  "resend_available_at": "2026-10-29T07:42:51.921663391Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "446066",
  "sent_at": "2026-10-29T07:42:50.923416034Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "82e9b6f6-4518-43ab-9114-d42f1f4db8d9",
  "code": "446066",
  "device_ref": "sandbox-22399"
}
```

```json
{
  "session_id": "fedd8a00-a020-406e-ac02-ca542da51609",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDY3MSwiaWF0IjoxNzkzMjU5NzcxLCJqdGkiOiIwNjhkMDkwZi1kMjc2LTQ4YTAtYjVjMi0zMzZlM2Q2MzgzNDIiLCJzaWQiOiJmZWRkOGEwMC1hMDIwLTQwNmUtYWMwMi1jYTU0MmRhNTE2MDkifQ.bGmMfVkg4fIE4vYZlSJl-IUY2XkXDFm_ijHIjR6Hmsc",
  "access_expires_at": "2026-10-29T07:57:51.128264259Z",
  "refresh_token": "RBkbTLw7eH7N2q3vdN1fZA7WlockwTM9aS4ayyOInHI",
  "refresh_expires_at": "2026-11-28T07:42:51.127829915Z",
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
  "command_id": "561214ed-835d-4578-aa0c-504bceed99f9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:42:51Z",
    "sequence": 1793259771482
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "446719c7-2117-419d-8b90-31467ddd09db",
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
  "last_heartbeat_at": "2026-10-29T07:42:51.499277Z",
  "last_location_at": "2026-10-29T07:42:51.499277Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637371448",
  "device_ref": "sandbox-19746"
}
```

```json
{
  "challenge_id": "c0ad052e-a2d9-4901-8e51-3b4f8f3f92b0",
  "expires_at": "2026-10-29T07:47:51.693455968Z",
  "resend_available_at": "2026-10-29T07:42:52.693455968Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637371448` → **200**

```json
{
  "phone": "+380637371448",
  "audience": "CLIENT",
  "code": "456163",
  "sent_at": "2026-10-29T07:42:51.695626756Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c0ad052e-a2d9-4901-8e51-3b4f8f3f92b0",
  "code": "456163",
  "device_ref": "sandbox-19746"
}
```

```json
{
  "session_id": "c9342175-27f3-462f-b2e7-04aa4d8dd374",
  "subject": {
    "type": "CLIENT",
    "id": "5c571d69-942d-407a-a2ca-a8a1faef03c4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YzU3MWQ2OS05NDJkLTQwN2EtYTJjYS1hOGExZmFlZjAzYzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNjcxLCJpYXQiOjE3OTMyNTk3NzEsImp0aSI6IjJlMzkwYzljLWY2N2UtNGQyMy1iNjViLTg3ODUyYjM5M2Q5MiIsInNpZCI6ImM5MzQyMTc1LTI3ZjMtNDYyZi1iMmU3LTA0YWE0ZDhkZDM3NCJ9.8WFy_ZZc38xdBb7JJ02ZcauWLjGR1-7-k0pmvAgdNiQ",
  "access_expires_at": "2026-10-29T07:57:51.90506903Z",
  "refresh_token": "GzchpNuQER0n1rdHGq93Qe1y3gDaWWUWKusu-OPHouM",
  "refresh_expires_at": "2026-11-28T07:42:51.904722827Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e3522d60-31da-4d43-b2b2-975d375ab999",
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
  "id": "9abf2e38-363c-4eea-869e-902e7894518b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:47:52.091587Z",
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
  "command_id": "de3062de-a254-44a7-b9cd-6879a5b0db9f",
  "quote_id": "9abf2e38-363c-4eea-869e-902e7894518b",
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
  "id": "0a0e642e-1c87-4ebb-9898-65eec90734eb",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5c571d69-942d-407a-a2ca-a8a1faef03c4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:42:52.283077Z",
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
    "id": "f1b6837a-1ae5-4bd0-bb0f-07025bffff5e",
    "order_id": "0a0e642e-1c87-4ebb-9898-65eec90734eb",
    "expires_at": "2026-10-29T07:43:07.285181Z",
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

`POST /api/driver/v1/offers/f1b6837a-1ae5-4bd0-bb0f-07025bffff5e/accept` → **200**

```json
{
  "command_id": "50a4e0f2-242a-4f7f-ace8-d249a8be4455"
}
```

```json
{
  "id": "6a86664c-495a-4342-930f-9d4d648e3c01",
  "order_id": "0a0e642e-1c87-4ebb-9898-65eec90734eb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fea730d4-cdbc-4d32-ad68-f40718451d12",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fea730d4-cdbc-4d32-ad68-f40718451d12",
  "order_id": "0a0e642e-1c87-4ebb-9898-65eec90734eb",
  "assignment_id": "6a86664c-495a-4342-930f-9d4d648e3c01",
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

`POST /api/driver/v1/work-sessions/446719c7-2117-419d-8b90-31467ddd09db/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:42:52Z",
    "sequence": 1793259772991
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "446719c7-2117-419d-8b90-31467ddd09db",
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
  "last_heartbeat_at": "2026-10-29T07:42:53.007181Z",
  "last_location_at": "2026-10-29T07:42:53.007181Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/fea730d4-cdbc-4d32-ad68-f40718451d12/arrive` → **200**

```json
{
  "command_id": "4a502df2-8453-4005-8ab7-a49de0fcb275",
  "expected_version": 0
}
```

```json
{
  "id": "fea730d4-cdbc-4d32-ad68-f40718451d12",
  "order_id": "0a0e642e-1c87-4ebb-9898-65eec90734eb",
  "assignment_id": "6a86664c-495a-4342-930f-9d4d648e3c01",
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
  "arrived_at": "2026-10-29T07:42:53.194179Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fea730d4-cdbc-4d32-ad68-f40718451d12/start` → **200**

```json
{
  "command_id": "c1342edd-d3fa-4be2-a287-f61ef823896f",
  "expected_version": 1
}
```

```json
{
  "id": "fea730d4-cdbc-4d32-ad68-f40718451d12",
  "order_id": "0a0e642e-1c87-4ebb-9898-65eec90734eb",
  "assignment_id": "6a86664c-495a-4342-930f-9d4d648e3c01",
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
  "arrived_at": "2026-10-29T07:42:53.194179Z",
  "started_at": "2026-10-29T07:42:53.374362Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fea730d4-cdbc-4d32-ad68-f40718451d12/complete` → **200**

```json
{
  "command_id": "09d1e6c3-3a3e-4f2e-b050-ce34905382a4",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:42:53Z",
  "cash_received": false
}
```

```json
{
  "id": "fea730d4-cdbc-4d32-ad68-f40718451d12",
  "order_id": "0a0e642e-1c87-4ebb-9898-65eec90734eb",
  "assignment_id": "6a86664c-495a-4342-930f-9d4d648e3c01",
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
  "arrived_at": "2026-10-29T07:42:53.194179Z",
  "started_at": "2026-10-29T07:42:53.374362Z",
  "completed_at": "2026-10-29T07:42:53.561919Z",
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
  "session_id": "81740e06-5125-43c4-81fd-c0b007d02797",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA2NzMsImlhdCI6MTc5MzI1OTc3MywianRpIjoiMjgxYzg0NmEtMjIzNi00ZDY0LWJkZDctMTM2ZTAyMTRmOGZiIiwic2lkIjoiODE3NDBlMDYtNTEyNS00M2M0LTgxZmQtYzBiMDA3ZDAyNzk3In0.Vbb35PXC7uw0MpE7dflMmBPHtXaLd9ga9V1wYkoVQzE",
  "access_expires_at": "2026-10-29T07:57:53.942390659Z",
  "refresh_token": "ta9WJP_Yo70foMrLFNZeKW_lt4UDXT7UkdhXeAlQY8k",
  "refresh_expires_at": "2026-10-29T19:42:53.942014482Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/0a0e642e-1c87-4ebb-9898-65eec90734eb/cash-dispute` → **200**

```json
{
  "order_id": "0a0e642e-1c87-4ebb-9898-65eec90734eb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "5c571d69-942d-407a-a2ca-a8a1faef03c4",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T07:42:54.076662Z",
  "decide_by": "2026-11-12T07:42:54.076662Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T07:42:54.076662Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "0a0e642e-1c87-4ebb-9898-65eec90734eb",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "5c571d69-942d-407a-a2ca-a8a1faef03c4",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T07:42:54.076662Z",
      "decide_by": "2026-11-12T07:42:54.076662Z",
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

`POST /api/admin/v1/orders/0a0e642e-1c87-4ebb-9898-65eec90734eb/cash-dispute/decide` → **400**

```json
{
  "command_id": "e14dbcb7-4e6c-4372-895c-2ef3ee90a4ef",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/0a0e642e-1c87-4ebb-9898-65eec90734eb/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "c24d24b0-6742-4fad-bdd4-5d1105cc4d6b",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/0a0e642e-1c87-4ebb-9898-65eec90734eb/cash-dispute/decide` → **200**

```json
{
  "command_id": "484eeb20-f307-436e-9fc5-af4ca6552dff",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "0a0e642e-1c87-4ebb-9898-65eec90734eb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "5c571d69-942d-407a-a2ca-a8a1faef03c4",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T07:42:54.076662Z",
  "decide_by": "2026-11-12T07:42:54.076662Z",
  "decision": "PAY_DRIVER",
  "decided_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T07:42:54.707147Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/0a0e642e-1c87-4ebb-9898-65eec90734eb/cash-dispute/decide` → **409**

```json
{
  "command_id": "545602e4-b6cc-4e8e-b4c6-a82caf1c7302",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/0a0e642e-1c87-4ebb-9898-65eec90734eb/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2fa0322a-45c9-47a2-8d41-b2258606ff09"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "446719c7-2117-419d-8b90-31467ddd09db",
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
  "last_heartbeat_at": "2026-10-29T07:42:53.007181Z",
  "last_location_at": "2026-10-29T07:42:53.007181Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/446719c7-2117-419d-8b90-31467ddd09db/close` → **200**

```json
{
  "command_id": "99d75cdf-2d4e-4223-9c83-ecda2909543d",
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
  "session_id": "35570c90-4971-49c2-8bb5-10b99b8487f1",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA2NzUsImlhdCI6MTc5MzI1OTc3NSwianRpIjoiZjI2Mjk0NTQtZGVmMy00ZWJkLWJlN2ItN2FkNDAzY2ExNTNmIiwic2lkIjoiMzU1NzBjOTAtNDk3MS00OWMyLThiYjUtMTBiOTliODQ4N2YxIn0.TKaPv3dY9XtQmgy-UwtsHIt32xIStug02xUfZJC8Ojw",
  "access_expires_at": "2026-10-29T07:57:55.690564996Z",
  "refresh_token": "hWqXQEmSmHzohBpaxgrzk4En6zdgaB74DbPe29nhldk",
  "refresh_expires_at": "2026-10-29T19:42:55.690179255Z",
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
  "phone": "+48600417851",
  "device_ref": "sandbox-7318"
}
```

```json
{
  "challenge_id": "603563c9-ea5b-4efa-a6ee-b87bed998f8d",
  "expires_at": "2026-10-29T07:47:56.254532349Z",
  "resend_available_at": "2026-10-29T07:42:57.254532349Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600417851` → **200**

```json
{
  "phone": "+48600417851",
  "audience": "CLIENT",
  "code": "832182",
  "sent_at": "2026-10-29T07:42:56.256546172Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "603563c9-ea5b-4efa-a6ee-b87bed998f8d",
  "code": "832182",
  "device_ref": "sandbox-7318"
}
```

```json
{
  "session_id": "cd01f5f7-273d-4baf-b509-c0740bc8fa70",
  "subject": {
    "type": "CLIENT",
    "id": "af1dc2d1-c47e-4835-908f-d3e47fce24b6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjFkYzJkMS1jNDdlLTQ4MzUtOTA4Zi1kM2U0N2ZjZTI0YjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNjc2LCJpYXQiOjE3OTMyNTk3NzYsImp0aSI6ImU0YTMxNTE3LTA4ZTctNDZlNS04MjBkLWI2ODQxOTNiMWI5MCIsInNpZCI6ImNkMDFmNWY3LTI3M2QtNGJhZi1iNTA5LWMwNzQwYmM4ZmE3MCJ9.m86bI4_8n0LUW00jUCRel4VUqa7-xRvTTvzzHngw484",
  "access_expires_at": "2026-10-29T07:57:56.464659476Z",
  "refresh_token": "YxZcq8uaUC8IIPs-5qxX6bxnvIiLvN1mrP-ZYpC8qgY",
  "refresh_expires_at": "2026-11-28T07:42:56.464343258Z",
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
  "command_id": "70516988-9439-4237-bc10-a61b18718d32",
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
  "correlation_id": "34b9b8d4-9712-44af-94e2-767a99d763b4",
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
  "command_id": "92fbcf7e-dd33-4342-b403-23993e840b3a",
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
  "paused_at": "2026-10-29T07:42:57.207225424Z",
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
  "command_id": "88232350-991f-447c-9270-4a839b91f4b9",
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
  "id": "ba125bf4-77df-4df5-83ae-05a232447cbc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:47:57.582731Z",
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
  "command_id": "17228c53-e9f5-404e-97be-724bd9e62c56",
  "quote_id": "ba125bf4-77df-4df5-83ae-05a232447cbc",
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
  "correlation_id": "025b1067-d0c0-4b1e-a6b8-031752ba5bb7"
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
  "paused_at": "2026-10-29T07:42:57.207225Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "f32dc102-5c74-47ca-8593-2b690709c3aa",
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
  "command_id": "cc027e96-6d4d-4125-a278-8d25a5519d65",
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
  "command_id": "891edf71-76f9-4da0-b6b1-05b0cfa19b6c",
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
  "id": "020cdc7c-f2ba-45bf-b01e-014abd2408ea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:47:58.727261Z",
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
  "command_id": "f66c9a45-18fd-4709-804b-bbe1cc05c0c8",
  "quote_id": "020cdc7c-f2ba-45bf-b01e-014abd2408ea",
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
  "correlation_id": "5b15ac18-2b90-4e3f-a6f2-15a8d85df558"
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
  "command_id": "39249f44-4cb1-455d-9c99-ca8174e7db59",
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
      "from": "10:00",
      "to": "11:00"
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
      "from": "10:00",
      "to": "11:00"
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
  "command_id": "4da01063-6184-462b-a523-7fd3007f9e0f",
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
  "id": "37299f24-b834-47cf-a46c-4f6e3fce7546",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:47:59.490688Z",
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
  "command_id": "2637e18c-13b2-482c-94da-9423e7eb1425",
  "quote_id": "37299f24-b834-47cf-a46c-4f6e3fce7546",
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
  "correlation_id": "8aa50f71-52bd-478a-861a-8bb0fc53a2c1"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "bc1c3040-c7af-4779-a816-c4dff96688f1",
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
  "correlation_id": "6c558840-7cec-4db2-b015-fd26ea7a926f"
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
      "from": "10:00",
      "to": "11:00"
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
  "command_id": "a79c16fd-1529-4bc4-b7c1-0bfa97b19a4e",
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
  "phone": "+380672656993",
  "device_ref": "sandbox-4309"
}
```

```json
{
  "challenge_id": "927543ad-fc36-466f-9f43-a35c18092bbb",
  "expires_at": "2026-10-29T07:48:00.453176513Z",
  "resend_available_at": "2026-10-29T07:43:01.453176513Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672656993` → **200**

```json
{
  "phone": "+380672656993",
  "audience": "CLIENT",
  "code": "781704",
  "sent_at": "2026-10-29T07:43:00.45491375Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "927543ad-fc36-466f-9f43-a35c18092bbb",
  "code": "781704",
  "device_ref": "sandbox-4309"
}
```

```json
{
  "session_id": "67cc5520-2aac-4721-9c1f-385901613905",
  "subject": {
    "type": "CLIENT",
    "id": "6937c120-3d4e-4945-88b4-0d2157dd7905"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTM3YzEyMC0zZDRlLTQ5NDUtODhiNC0wZDIxNTdkZDc5MDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNjgwLCJpYXQiOjE3OTMyNTk3ODAsImp0aSI6ImU5ZTc0ZTRiLWY3NzQtNDEyNS1iYTQ4LTM3NDNmNzIwMTFhYiIsInNpZCI6IjY3Y2M1NTIwLTJhYWMtNDcyMS05YzFmLTM4NTkwMTYxMzkwNSJ9.hTDuJhGisJhl36UuxDwgm9-a44JOpESbZ4o0tpTlFsk",
  "access_expires_at": "2026-10-29T07:58:00.647803615Z",
  "refresh_token": "mhoUpLVJInQTN4tNGPj4VT0uMQyrha7wdK4GCWY-3j0",
  "refresh_expires_at": "2026-11-28T07:43:00.647495188Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6937c120-3d4e-4945-88b4-0d2157dd7905",
  "session_id": "67cc5520-2aac-4721-9c1f-385901613905",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "55a3312d-d4da-464a-9f18-7fd6f83db4ef",
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
  "id": "2356dd53-14b7-42a3-baac-ab01dfcea64e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:48:01.007014Z",
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
  "challenge_id": "05a38743-12a6-4bbe-9011-07a2b226d95c",
  "expires_at": "2026-10-29T07:48:03.200275052Z",
  "resend_available_at": "2026-10-29T07:43:04.200275052Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672656993` → **200**

```json
{
  "phone": "+380672656993",
  "audience": "CLIENT",
  "code": "716809",
  "sent_at": "2026-10-29T07:43:03.2017656Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "630e46ed-1f73-4d96-b02c-badcf3182a79",
  "challenge_id": "05a38743-12a6-4bbe-9011-07a2b226d95c",
  "otp_code": "716809"
}
```

```json
{
  "client_id": "6937c120-3d4e-4945-88b4-0d2157dd7905",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T07:43:03.408523727Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "ff386990-cb85-4076-95e7-509968a07d72",
  "quote_id": "2356dd53-14b7-42a3-baac-ab01dfcea64e",
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
  "correlation_id": "9349459b-8b95-40ca-89cf-3e15ce756b1f"
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
  "session_id": "5ff8dbf9-265c-4529-bf33-aad581ae465c",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA2ODMsImlhdCI6MTc5MzI1OTc4MywianRpIjoiYzE2YTE0ZDYtODFhOS00OWRiLWJjMjgtYTc4ZWJkYmRjZmQzIiwic2lkIjoiNWZmOGRiZjktMjY1Yy00NTI5LWJmMzMtYWFkNTgxYWU0NjVjIn0.UlNd8aYJZu3wlAcNwDiijgxOfDvN1Z7WwXQ4XDv2hb4",
  "access_expires_at": "2026-10-29T07:58:03.975952123Z",
  "refresh_token": "BiIDismHPONYSJkiaq1urvjzg9GeWtfXATtZ4pblFIw",
  "refresh_expires_at": "2026-10-29T19:43:03.975476564Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "6937c120-3d4e-4945-88b4-0d2157dd7905",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T07:43:03.408524Z",
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

`POST /api/admin/v1/client-deletions/6937c120-3d4e-4945-88b4-0d2157dd7905/complete` → **200**

```json
{
  "command_id": "28bafee4-8934-48e5-b80b-7eabf2fd06c5",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "6937c120-3d4e-4945-88b4-0d2157dd7905",
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
  "correlation_id": "cec1bc32-0fe4-4fa0-b4f9-d9fc29fc881a"
}
```

Done: client 6937c120-3d4e-4945-88b4-0d2157dd7905 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667454240",
  "device_ref": "sandbox-19304"
}
```

```json
{
  "challenge_id": "3007018e-bc11-4afc-b56e-73eea7ff0feb",
  "expires_at": "2026-10-29T07:48:04.730358371Z",
  "resend_available_at": "2026-10-29T07:43:05.730358371Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667454240` → **200**

```json
{
  "phone": "+380667454240",
  "audience": "CLIENT",
  "code": "242325",
  "sent_at": "2026-10-29T07:43:04.732202432Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3007018e-bc11-4afc-b56e-73eea7ff0feb",
  "code": "242325",
  "device_ref": "sandbox-19304"
}
```

```json
{
  "session_id": "05877a54-e6dc-497a-91d7-eeb9ad372a3b",
  "subject": {
    "type": "CLIENT",
    "id": "5d52f914-1252-4a32-a5c6-3534d5624fa9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDUyZjkxNC0xMjUyLTRhMzItYTVjNi0zNTM0ZDU2MjRmYTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNjg0LCJpYXQiOjE3OTMyNTk3ODQsImp0aSI6IjVjYjAxM2M4LTUzNzEtNGEyNi05ZWNhLWM2YWFiMTM4YjhlNSIsInNpZCI6IjA1ODc3YTU0LWU2ZGMtNDk3YS05MWQ3LWVlYjlhZDM3MmEzYiJ9.bmgLRopkMg99yayvTW1hHGtCM8CryJLmtoTfmD5J9ec",
  "access_expires_at": "2026-10-29T07:58:04.943434639Z",
  "refresh_token": "NKFMvWba4tqkbAovWh_TXOUneAVgVjQK82H6v1NzEds",
  "refresh_expires_at": "2026-11-28T07:43:04.94308442Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "5d52f914-1252-4a32-a5c6-3534d5624fa9",
  "session_id": "05877a54-e6dc-497a-91d7-eeb9ad372a3b",
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
  "session_id": "90e7f799-2c18-425e-a80c-3a2ca963c1e7",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA2ODUsImlhdCI6MTc5MzI1OTc4NSwianRpIjoiMjY4YzA5ZjAtZmRkNS00ZDgxLTgwMDQtYzgyMzIzNzRlMDNiIiwic2lkIjoiOTBlN2Y3OTktMmMxOC00MjVlLWE4MGMtM2EyY2E5NjNjMWU3In0.z2VK3NEhGHaGH0OpVgt85EUQGo_F-CFaJS-_1_TuWik",
  "access_expires_at": "2026-10-29T07:58:05.495057938Z",
  "refresh_token": "GsGeyRmONLzKQfCssHMfpVkIiLVy1Kbvpce6jtZpu7M",
  "refresh_expires_at": "2026-10-29T19:43:05.494700068Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=7454240&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "5d52f914-1252-4a32-a5c6-3534d5624fa9",
      "phone": "+380667454240",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T07:43:04.941591Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/5d52f914-1252-4a32-a5c6-3534d5624fa9` → **200**

```json
{
  "client": {
    "id": "5d52f914-1252-4a32-a5c6-3534d5624fa9",
    "phone": "+380667454240",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T07:43:04.941591Z",
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

`POST /api/admin/v1/clients/5d52f914-1252-4a32-a5c6-3534d5624fa9/block` → **400**

```json
{
  "command_id": "3d890027-f890-4a25-81e6-981821b87d28",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/5d52f914-1252-4a32-a5c6-3534d5624fa9/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "267bd644-0320-4ac8-bc0e-01446b85470b",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/5d52f914-1252-4a32-a5c6-3534d5624fa9/block` → **200**

```json
{
  "command_id": "3290de5d-9cf0-4b4d-8f7a-68a578124873",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "5d52f914-1252-4a32-a5c6-3534d5624fa9",
  "phone": "+380667454240",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T07:43:04.941591Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T07:43:06.266562Z",
    "by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
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
  "correlation_id": "305b2d98-e3e2-4c0a-b1d8-3c6cd14ad931"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667454240",
  "device_ref": "sandbox-14941"
}
```

```json
{
  "challenge_id": "f0f3be3f-fbc9-4bbd-8ef6-a826afd0be0c",
  "expires_at": "2026-10-29T07:48:08.636792533Z",
  "resend_available_at": "2026-10-29T07:43:09.636792533Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667454240` → **200**

```json
{
  "phone": "+380667454240",
  "audience": "CLIENT",
  "code": "539741",
  "sent_at": "2026-10-29T07:43:08.638743693Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "f0f3be3f-fbc9-4bbd-8ef6-a826afd0be0c",
  "code": "539741",
  "device_ref": "sandbox-14941"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "968599f3-9f50-4fed-a741-7ab332aac192"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/5d52f914-1252-4a32-a5c6-3534d5624fa9` → **200**

```json
{
  "client": {
    "id": "5d52f914-1252-4a32-a5c6-3534d5624fa9",
    "phone": "+380667454240",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T07:43:04.941591Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T07:43:06.266562Z",
      "by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
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

`POST /api/admin/v1/clients/5d52f914-1252-4a32-a5c6-3534d5624fa9/unblock` → **200**

```json
{
  "command_id": "f86b0a11-d30e-4943-a2f6-855e60ceeaf9",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "5d52f914-1252-4a32-a5c6-3534d5624fa9",
  "phone": "+380667454240",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T07:43:04.941591Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667454240",
  "device_ref": "sandbox-25752"
}
```

```json
{
  "challenge_id": "7ed069a9-c13f-4bcd-a0b1-21691dfed257",
  "expires_at": "2026-10-29T07:48:11.428850049Z",
  "resend_available_at": "2026-10-29T07:43:12.428850049Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667454240` → **200**

```json
{
  "phone": "+380667454240",
  "audience": "CLIENT",
  "code": "104129",
  "sent_at": "2026-10-29T07:43:11.430492157Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7ed069a9-c13f-4bcd-a0b1-21691dfed257",
  "code": "104129",
  "device_ref": "sandbox-25752"
}
```

```json
{
  "session_id": "c5e8c5cc-cfce-4fda-bc08-d18847849077",
  "subject": {
    "type": "CLIENT",
    "id": "5d52f914-1252-4a32-a5c6-3534d5624fa9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDUyZjkxNC0xMjUyLTRhMzItYTVjNi0zNTM0ZDU2MjRmYTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNjkxLCJpYXQiOjE3OTMyNTk3OTEsImp0aSI6IjcwODY4OTM1LTRlNmUtNDIxMC05ZGNhLTkxNGE5MTQyMTAxNCIsInNpZCI6ImM1ZThjNWNjLWNmY2UtNGZkYS1iYzA4LWQxODg0Nzg0OTA3NyJ9.osbg-U-8o9zcfKJQq4HnM3mAKb4XsCTc96QuGHFAQbU",
  "access_expires_at": "2026-10-29T07:58:11.632415446Z",
  "refresh_token": "pQDYYAF2LfAmeFTV5xrcr59Noqait7tIPIBdWHH-VO8",
  "refresh_expires_at": "2026-11-28T07:43:11.631916362Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "5d52f914-1252-4a32-a5c6-3534d5624fa9",
  "session_id": "c5e8c5cc-cfce-4fda-bc08-d18847849077",
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
  "phone": "+380663250200",
  "device_ref": "sandbox-30896"
}
```

```json
{
  "challenge_id": "be169114-374d-427f-9676-34383bd2065e",
  "expires_at": "2026-10-29T07:48:12.005565318Z",
  "resend_available_at": "2026-10-29T07:43:13.005565318Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663250200` → **200**

```json
{
  "phone": "+380663250200",
  "audience": "CLIENT",
  "code": "125628",
  "sent_at": "2026-10-29T07:43:12.00733517Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be169114-374d-427f-9676-34383bd2065e",
  "code": "125628",
  "device_ref": "sandbox-30896"
}
```

```json
{
  "session_id": "d1101553-d7f5-4a4b-9c21-623a74c7f4a7",
  "subject": {
    "type": "CLIENT",
    "id": "71ae466c-3e67-4552-a49d-01d6716f4964"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MWFlNDY2Yy0zZTY3LTQ1NTItYTQ5ZC0wMWQ2NzE2ZjQ5NjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNjkyLCJpYXQiOjE3OTMyNTk3OTIsImp0aSI6ImEzZmI0ODQ4LTUzNjUtNGNiZi05ZWFjLTlmZjFiZWU4Nzk0ZiIsInNpZCI6ImQxMTAxNTUzLWQ3ZjUtNGE0Yi05YzIxLTYyM2E3NGM3ZjRhNyJ9.Sy8hiDqxr6jbCZ27moDPd5W0BroLMcpgricaZPKXoQE",
  "access_expires_at": "2026-10-29T07:58:12.22451546Z",
  "refresh_token": "K3ZBU2ShKxKzQfGb2V7EmrvoJ5tEp8oGZXmg-5N3NnA",
  "refresh_expires_at": "2026-11-28T07:43:12.224071903Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6073ca8f-c8d0-4f2c-ac36-adcdcefa2785",
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
  "id": "19079362-50c6-4089-b3e7-f6b74332a599",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:48:12.418288Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: af495c6c-bfba-4add-9cdd-14d35bcd5a2b) → **201**

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
  "session_id": "c10c7792-e51d-4925-89db-c6a63747960d",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA2OTIsImlhdCI6MTc5MzI1OTc5MiwianRpIjoiODY1YzYwN2MtNTNlOS00ZTRkLTk5YmEtMmM3YWZlZTg4MzliIiwic2lkIjoiYzEwYzc3OTItZTUxZC00OTI1LTg5ZGItYzZhNjM3NDc5NjBkIn0.rokdaT9u75VrZ8YgNeUU75sgeUMh-QWTec8yBWA-Nag",
  "access_expires_at": "2026-10-29T07:58:12.84622391Z",
  "refresh_token": "BYBd4VHbbStYqre2kVNqO2Oy8KB14ZaLUoAixQftPRY",
  "refresh_expires_at": "2026-10-29T19:43:12.845782871Z",
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
  "session_id": "85122a00-fe54-4dcc-a1ad-87f7b63a9b08",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA2OTMsImlhdCI6MTc5MzI1OTc5MywianRpIjoiMWU5N2YwYWEtODAyOS00OGMwLTllNzItMmRhZDgzZTk2NjE4Iiwic2lkIjoiODUxMjJhMDAtZmU1NC00ZGNjLWExYWQtODdmN2I2M2E5YjA4In0.jyCj98HMQO1wlLrGm4VY7isa8EhiC2k43QknO0Jxv7o",
  "access_expires_at": "2026-10-29T07:58:13.226487935Z",
  "refresh_token": "51d7LkMZkWuADxly2ayD9qRcxEDEyZCPeCIrdExGRL8",
  "refresh_expires_at": "2026-10-29T19:43:13.225832003Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d30d440e-ac3b-435c-a8cb-acb5ff643585/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:43:12.617792Z",
      "actor": {
        "type": "CLIENT",
        "id": "71ae466c-3e67-4552-a49d-01d6716f4964",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d30d440e-ac3b-435c-a8cb-acb5ff643585",
        "quote_id": "19079362-50c6-4089-b3e7-f6b74332a599",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "af495c6c-bfba-4add-9cdd-14d35bcd5a2b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:43:12.619512Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d30d440e-ac3b-435c-a8cb-acb5ff643585",
        "attempt_id": "b1f9fea1-8c6b-41fc-bb95-e2572960c393",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "af495c6c-bfba-4add-9cdd-14d35bcd5a2b"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T07:43:12.624283Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d30d440e-ac3b-435c-a8cb-acb5ff643585",
        "attempt_id": "b1f9fea1-8c6b-41fc-bb95-e2572960c393"
      },
      "correlation_id": "af495c6c-bfba-4add-9cdd-14d35bcd5a2b"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "b1f9fea1-8c6b-41fc-bb95-e2572960c393",
        "generation": 1,
        "started_at": "2026-10-29T07:43:12.618777Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T07:43:12.624283Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T07:43:12.620111Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/af495c6c-bfba-4add-9cdd-14d35bcd5a2b` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "d30d440e-ac3b-435c-a8cb-acb5ff643585:0",
      "order_id": "d30d440e-ac3b-435c-a8cb-acb5ff643585",
      "at": "2026-10-29T07:43:12.617792Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "d30d440e-ac3b-435c-a8cb-acb5ff643585:1",
      "order_id": "d30d440e-ac3b-435c-a8cb-acb5ff643585",
      "at": "2026-10-29T07:43:12.619512Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "d30d440e-ac3b-435c-a8cb-acb5ff643585:2",
      "order_id": "d30d440e-ac3b-435c-a8cb-acb5ff643585",
      "at": "2026-10-29T07:43:12.624283Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/76775dc2-43dd-41b0-b779-f2fb7e8c3064` → **200**

```json
{
  "found": []
}
```

Done: request af495c6c-bfba-4add-9cdd-14d35bcd5a2b — order d30d440e-ac3b-435c-a8cb-acb5ff643585 found by its id.

`GET /api/rider/v1/orders/d30d440e-ac3b-435c-a8cb-acb5ff643585` → **200**

```json
{
  "id": "d30d440e-ac3b-435c-a8cb-acb5ff643585",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71ae466c-3e67-4552-a49d-01d6716f4964",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:43:12.61735Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d30d440e-ac3b-435c-a8cb-acb5ff643585/cancel` → **200**

```json
{
  "command_id": "5002429d-7201-457f-bc2c-b73893f7cace",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d30d440e-ac3b-435c-a8cb-acb5ff643585",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "71ae466c-3e67-4552-a49d-01d6716f4964",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:43:12.61735Z",
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
  "phone": "+380633014006",
  "device_ref": "sandbox-18900"
}
```

```json
{
  "challenge_id": "5377cdc4-af58-4206-94ce-0c0b6f865750",
  "expires_at": "2026-10-29T07:48:14.322224928Z",
  "resend_available_at": "2026-10-29T07:43:15.322224928Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633014006` → **200**

```json
{
  "phone": "+380633014006",
  "audience": "CLIENT",
  "code": "266398",
  "sent_at": "2026-10-29T07:43:14.324583882Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5377cdc4-af58-4206-94ce-0c0b6f865750",
  "code": "266398",
  "device_ref": "sandbox-18900"
}
```

```json
{
  "session_id": "44a65a3f-8274-4386-8478-21eb706f6e32",
  "subject": {
    "type": "CLIENT",
    "id": "a9647562-ffcf-4622-b9ba-8142e5f493a1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOTY0NzU2Mi1mZmNmLTQ2MjItYjliYS04MTQyZTVmNDkzYTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNjk0LCJpYXQiOjE3OTMyNTk3OTQsImp0aSI6IjAyMTRlOTgwLTk2NzMtNDlhZi05YzdiLTM2NTFmNDVmMDg0NiIsInNpZCI6IjQ0YTY1YTNmLTgyNzQtNDM4Ni04NDc4LTIxZWI3MDZmNmUzMiJ9.VbMiVLBqy_XIeWh2EKDXcHC02Z8U5y_E6IamQZpyHS0",
  "access_expires_at": "2026-10-29T07:58:14.514647143Z",
  "refresh_token": "6zK68Tr1pYOhrEVleI0fjcmGqWBiY3WLYa-2MK8gcxo",
  "refresh_expires_at": "2026-11-28T07:43:14.514307249Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "8df056ef-f9ab-410f-8bea-acff7e4b9335",
  "expires_at": "2026-10-29T07:48:16.686389898Z",
  "resend_available_at": "2026-10-29T07:43:17.686389898Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633014006` → **200**

```json
{
  "phone": "+380633014006",
  "audience": "CLIENT",
  "code": "318653",
  "sent_at": "2026-10-29T07:43:16.687733659Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "50907d9b-6b1a-4d93-bc1b-3a23be3d4b16",
  "challenge_id": "8df056ef-f9ab-410f-8bea-acff7e4b9335",
  "otp_code": "318653"
}
```

```json
{
  "id": "f8b06f3a-e7f2-403e-b5aa-68c904d1b53d",
  "state": "PENDING",
  "created_at": "2026-10-29T07:43:16.887939Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/f8b06f3a-e7f2-403e-b5aa-68c904d1b53d` → **200**

```json
{
  "id": "f8b06f3a-e7f2-403e-b5aa-68c904d1b53d",
  "state": "PENDING",
  "created_at": "2026-10-29T07:43:16.887939Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/f8b06f3a-e7f2-403e-b5aa-68c904d1b53d` → **200**

```json
{
  "id": "f8b06f3a-e7f2-403e-b5aa-68c904d1b53d",
  "state": "PENDING",
  "created_at": "2026-10-29T07:43:16.887939Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/f8b06f3a-e7f2-403e-b5aa-68c904d1b53d` → **200**

```json
{
  "id": "f8b06f3a-e7f2-403e-b5aa-68c904d1b53d",
  "state": "PENDING",
  "created_at": "2026-10-29T07:43:16.887939Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/f8b06f3a-e7f2-403e-b5aa-68c904d1b53d` → **200**

```json
{
  "id": "f8b06f3a-e7f2-403e-b5aa-68c904d1b53d",
  "state": "PENDING",
  "created_at": "2026-10-29T07:43:16.887939Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/f8b06f3a-e7f2-403e-b5aa-68c904d1b53d` → **200**

```json
{
  "id": "f8b06f3a-e7f2-403e-b5aa-68c904d1b53d",
  "state": "PENDING",
  "created_at": "2026-10-29T07:43:16.887939Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/f8b06f3a-e7f2-403e-b5aa-68c904d1b53d` → **200**

```json
{
  "id": "f8b06f3a-e7f2-403e-b5aa-68c904d1b53d",
  "state": "PENDING",
  "created_at": "2026-10-29T07:43:16.887939Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/f8b06f3a-e7f2-403e-b5aa-68c904d1b53d` → **200**

```json
{
  "id": "f8b06f3a-e7f2-403e-b5aa-68c904d1b53d",
  "state": "PENDING",
  "created_at": "2026-10-29T07:43:16.887939Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/f8b06f3a-e7f2-403e-b5aa-68c904d1b53d` → **200**

```json
{
  "id": "f8b06f3a-e7f2-403e-b5aa-68c904d1b53d",
  "state": "PENDING",
  "created_at": "2026-10-29T07:43:16.887939Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/f8b06f3a-e7f2-403e-b5aa-68c904d1b53d` → **200**

```json
{
  "id": "f8b06f3a-e7f2-403e-b5aa-68c904d1b53d",
  "state": "READY",
  "created_at": "2026-10-29T07:43:16.887939Z",
  "ready_at": "2026-10-29T07:43:25.365543Z",
  "expires_at": "2026-11-05T07:43:25.365543Z",
  "size_bytes": 1030
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/f8b06f3a-e7f2-403e-b5aa-68c904d1b53d/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633873001",
  "device_ref": "sandbox-11444"
}
```

```json
{
  "challenge_id": "31fac145-f622-44df-9e2f-a9505f1acdc3",
  "expires_at": "2026-10-29T07:48:26.68531294Z",
  "resend_available_at": "2026-10-29T07:43:27.68531294Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633873001` → **200**

```json
{
  "phone": "+380633873001",
  "audience": "CLIENT",
  "code": "787544",
  "sent_at": "2026-10-29T07:43:26.68736548Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31fac145-f622-44df-9e2f-a9505f1acdc3",
  "code": "787544",
  "device_ref": "sandbox-11444"
}
```

```json
{
  "session_id": "2d26430d-abc7-4ec9-afb5-d2940532dbb1",
  "subject": {
    "type": "CLIENT",
    "id": "a1f2fa9b-96ac-4320-b528-a92c782efc78"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMWYyZmE5Yi05NmFjLTQzMjAtYjUyOC1hOTJjNzgyZWZjNzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNzA2LCJpYXQiOjE3OTMyNTk4MDYsImp0aSI6IjQyY2JjMzk2LTUxZDQtNDRkMC04OWNiLWJjOTQ5ZjBmNjFhYiIsInNpZCI6IjJkMjY0MzBkLWFiYzctNGVjOS1hZmI1LWQyOTQwNTMyZGJiMSJ9.vhq5piTr00qGM_y1rWIKi2gt77FlPmx_09AimQ0CRLw",
  "access_expires_at": "2026-10-29T07:58:26.891607486Z",
  "refresh_token": "4tfsm27PNCbHFRdj7ZrVPhZzbUkjOzGWocsH1MIGXTs",
  "refresh_expires_at": "2026-11-28T07:43:26.891232931Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/f8b06f3a-e7f2-403e-b5aa-68c904d1b53d/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/f8b06f3a-e7f2-403e-b5aa-68c904d1b53d/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "467e2b83-9b54-4ded-9fa7-7d4a9dac0963"
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
  "session_id": "6aaf2826-9d38-43fd-ae57-98f5988e18bc",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3MDcsImlhdCI6MTc5MzI1OTgwNywianRpIjoiN2I1MTRiNGMtN2RmNS00MTBlLWE2ODQtZjRmZDI3NDg5ZDgyIiwic2lkIjoiNmFhZjI4MjYtOWQzOC00M2ZkLWFlNTctOThmNTk4OGUxOGJjIn0.ocGIlIjHIMtO74Wvp5zXMBPbmn39o0JvO2HQqn3DIX0",
  "access_expires_at": "2026-10-29T07:58:27.47120256Z",
  "refresh_token": "_tFBBJWxqjLoVh9wWNcw4vBpf8a0pHvld3FZfrFDYHk",
  "refresh_expires_at": "2026-10-29T19:43:27.470771541Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a9647562-ffcf-4622-b9ba-8142e5f493a1",
  "session_id": "44a65a3f-8274-4386-8478-21eb706f6e32",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/a9647562-ffcf-4622-b9ba-8142e5f493a1/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "f8b06f3a-e7f2-403e-b5aa-68c904d1b53d",
      "state": "READY",
      "created_at": "2026-10-29T07:43:16.887939Z",
      "ready_at": "2026-10-29T07:43:25.365543Z",
      "expires_at": "2026-11-05T07:43:25.365543Z",
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
  "device_ref": "sandbox-10115"
}
```

```json
{
  "challenge_id": "80758d00-85a0-4c5e-8823-4fb508a38a26",
  "expires_at": "2026-10-29T07:48:28.019599412Z",
  "resend_available_at": "2026-10-29T07:43:29.019599412Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "901920",
  "sent_at": "2026-10-29T07:43:28.0215934Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80758d00-85a0-4c5e-8823-4fb508a38a26",
  "code": "901920",
  "device_ref": "sandbox-10115"
}
```

```json
{
  "session_id": "64558ad7-88de-4324-9f22-c9ec7b6a7b50",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDcwOCwiaWF0IjoxNzkzMjU5ODA4LCJqdGkiOiI4NjRmYzRjMS00ZWRhLTRlNTItYTBhMi1mNTI5OGM2MzIyNzYiLCJzaWQiOiI2NDU1OGFkNy04OGRlLTQzMjQtOWYyMi1jOWVjN2I2YTdiNTAifQ.7-mJhm1OeNoBCCWVxYg1E6W9hY3GZEHLrTqNoasgLMg",
  "access_expires_at": "2026-10-29T07:58:28.223946313Z",
  "refresh_token": "6-PzsVnrcpm6PNwhwdeu4YNS22zD13xSxZ8ySckcYbk",
  "refresh_expires_at": "2026-11-28T07:43:28.223581974Z",
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
  "device_ref": "sandbox-21943"
}
```

```json
{
  "challenge_id": "6ac4edab-eb2a-4ca6-9d36-4ab9842d8804",
  "expires_at": "2026-10-29T07:48:28.598048338Z",
  "resend_available_at": "2026-10-29T07:43:29.598048338Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "233837",
  "sent_at": "2026-10-29T07:43:28.599773793Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ac4edab-eb2a-4ca6-9d36-4ab9842d8804",
  "code": "233837",
  "device_ref": "sandbox-21943"
}
```

```json
{
  "session_id": "27339f78-3c1f-4e1e-a270-4e3a8b3f7bac",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDcwOCwiaWF0IjoxNzkzMjU5ODA4LCJqdGkiOiIzMmMwMDU5YS0wY2E3LTQxZTMtODQ3Ni05NmRiMjNlMDYzODYiLCJzaWQiOiIyNzMzOWY3OC0zYzFmLTRlMWUtYTI3MC00ZTNhOGIzZjdiYWMifQ.2wxVRB41Xyqwa0fWJwawY_g5YZj8ie2b6pp2_7snECQ",
  "access_expires_at": "2026-10-29T07:58:28.809079523Z",
  "refresh_token": "GTKETkWfkFT7xy0wksphBMBG4Y0U6ne-XmAxLGOgegE",
  "refresh_expires_at": "2026-11-28T07:43:28.808724477Z",
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
  "command_id": "b3ff2561-251a-48b9-924f-c40052ec4c0c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:43:29Z",
    "sequence": 1793259809173
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "407956cc-84ce-4e1e-b215-441d61e0e158",
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
  "last_heartbeat_at": "2026-10-29T07:43:29.188943Z",
  "last_location_at": "2026-10-29T07:43:29.188943Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-4659"
}
```

```json
{
  "challenge_id": "242ffa08-1da8-4ed4-8031-d05745e85988",
  "expires_at": "2026-10-29T07:48:29.375859193Z",
  "resend_available_at": "2026-10-29T07:43:30.375859193Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "497728",
  "sent_at": "2026-10-29T07:43:29.377676224Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "242ffa08-1da8-4ed4-8031-d05745e85988",
  "code": "497728",
  "device_ref": "sandbox-4659"
}
```

```json
{
  "session_id": "3755f369-1c5d-4b1f-b9a5-c08b2c6e4ee4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDcwOSwiaWF0IjoxNzkzMjU5ODA5LCJqdGkiOiI3N2FiODNmNS1kYjQyLTQ1ZjMtYWUwMy1kZTc2Mzc2MTM1YjAiLCJzaWQiOiIzNzU1ZjM2OS0xYzVkLTRiMWYtYjlhNS1jMDhiMmM2ZTRlZTQifQ.uXh1i9ebt1Q_Pjbyn6Aw18FFWT-mZGF3opTmSArTSyw",
  "access_expires_at": "2026-10-29T07:58:29.5854061Z",
  "refresh_token": "IQvS_MW1l0e4uBsFfRgn3lEO2wgPQx3dREQGi4cySkk",
  "refresh_expires_at": "2026-11-28T07:43:29.585077503Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c4895421-6fa9-4ef8-8df8-7adcc7f65b36",
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
  "last_heartbeat_at": "2026-10-29T07:42:28.043849Z",
  "last_location_at": "2026-10-29T07:42:28.043849Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c4895421-6fa9-4ef8-8df8-7adcc7f65b36/handover` → **200**

```json
{
  "command_id": "0dcd3e58-0718-477e-9c79-6fb481e68430",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c4895421-6fa9-4ef8-8df8-7adcc7f65b36",
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
  "last_heartbeat_at": "2026-10-29T07:42:28.043849Z",
  "last_location_at": "2026-10-29T07:42:28.043849Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c4895421-6fa9-4ef8-8df8-7adcc7f65b36/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:43:30Z",
    "sequence": 1793259810134
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c4895421-6fa9-4ef8-8df8-7adcc7f65b36",
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
  "last_heartbeat_at": "2026-10-29T07:43:30.150457Z",
  "last_location_at": "2026-10-29T07:43:30.150457Z",
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
  "session_id": "19ef141c-e1a9-43fd-af83-ec26477d0489",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3MTAsImlhdCI6MTc5MzI1OTgxMCwianRpIjoiZmE2YjlmYmMtNTMwOC00MjExLTllNDItYjM3MjlhYjhiMmFkIiwic2lkIjoiMTllZjE0MWMtZTFhOS00M2ZkLWFmODMtZWMyNjQ3N2QwNDg5In0.qKLGH9S8QRter2ARb9E3pqdQEcpx6xXp1grAYAYHAYo",
  "access_expires_at": "2026-10-29T07:58:30.536363728Z",
  "refresh_token": "M22RdVKiDVRHye0JqPj_nm4awYpRaK8kPSfIDobFaH4",
  "refresh_expires_at": "2026-10-29T19:43:30.5359603Z",
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
  "session_id": "9d7c7786-e853-4510-ab63-274f2a15b590",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3MTAsImlhdCI6MTc5MzI1OTgxMCwianRpIjoiYTQ5N2E1MTItYzg1Yy00NWZjLWE5OTctZGJlN2Y5ZDFkZjg1Iiwic2lkIjoiOWQ3Yzc3ODYtZTg1My00NTEwLWFiNjMtMjc0ZjJhMTViNTkwIn0.fpE2SYGeuRgt_eC6ijzi2gCIvsaerOVbUHFEs4jS-ZU",
  "access_expires_at": "2026-10-29T07:58:30.921095444Z",
  "refresh_token": "t91Ttihe5R2L8Ibszz91pb14HJAMLUrvledUiA6Nhts",
  "refresh_expires_at": "2026-10-29T19:43:30.920634752Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380687660272",
  "device_ref": "sandbox-3053"
}
```

```json
{
  "challenge_id": "07445d65-e88a-40f1-b2ac-8e58576407cd",
  "expires_at": "2026-10-29T07:48:31.099020763Z",
  "resend_available_at": "2026-10-29T07:43:32.099020763Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380687660272` → **200**

```json
{
  "phone": "+380687660272",
  "audience": "CLIENT",
  "code": "766189",
  "sent_at": "2026-10-29T07:43:31.100713049Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "07445d65-e88a-40f1-b2ac-8e58576407cd",
  "code": "766189",
  "device_ref": "sandbox-3053"
}
```

```json
{
  "session_id": "97526172-1c15-4715-8e8b-115549d2934e",
  "subject": {
    "type": "CLIENT",
    "id": "cae128d3-1364-4846-9464-242385b95975"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYWUxMjhkMy0xMzY0LTQ4NDYtOTQ2NC0yNDIzODViOTU5NzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNzExLCJpYXQiOjE3OTMyNTk4MTEsImp0aSI6ImE4MDM2MTU4LTBmOTYtNGI4ZS05MDFmLTQ5YTg0NjMwNWZkZCIsInNpZCI6Ijk3NTI2MTcyLTFjMTUtNDcxNS04ZThiLTExNTU0OWQyOTM0ZSJ9.sXeD9Tx1OMXEwEVReaa30A1jagqmNQWO1--XEez6Wuk",
  "access_expires_at": "2026-10-29T07:58:31.302228236Z",
  "refresh_token": "-eerorOmNA7xRK2etxUzWUfB4j1TQSeFSSRsy-aMOL4",
  "refresh_expires_at": "2026-11-28T07:43:31.301881242Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "578a3b85-a215-4ea7-8949-bd7dee21332e",
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
  "id": "340b7a60-b664-46c2-a0cb-260ee09de119",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:48:31.488115Z",
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
  "command_id": "679bcd63-8dfa-470a-ad61-84bd9f37b67d",
  "quote_id": "340b7a60-b664-46c2-a0cb-260ee09de119",
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
  "id": "2988c3ae-0a1c-47ba-87e2-81257d0637e3",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cae128d3-1364-4846-9464-242385b95975",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:43:31.684571Z",
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
    "id": "b798457f-471f-4242-b411-37aecd321dea",
    "order_id": "2988c3ae-0a1c-47ba-87e2-81257d0637e3",
    "expires_at": "2026-10-29T07:43:46.686812Z",
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

`POST /api/driver/v1/offers/b798457f-471f-4242-b411-37aecd321dea/reject` → **204**

```json
{
  "command_id": "972f8ab7-fbbc-4114-b921-e317d3c2e7b4"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "0afb840e-d3cb-4755-95b2-fb356068c19a",
    "order_id": "2988c3ae-0a1c-47ba-87e2-81257d0637e3",
    "expires_at": "2026-10-29T07:43:47.072458Z",
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

`POST /api/driver/v1/offers/0afb840e-d3cb-4755-95b2-fb356068c19a/accept` → **200**

```json
{
  "command_id": "05bee7a9-746e-48a2-974c-f9a98da6e726"
}
```

```json
{
  "id": "2abc4f6a-0174-42cc-b00c-d5d8bcda3c6f",
  "order_id": "2988c3ae-0a1c-47ba-87e2-81257d0637e3",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "eb04905c-648b-4aaa-a330-d05c8b7de71f",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/2988c3ae-0a1c-47ba-87e2-81257d0637e3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:43:31.684942Z",
      "actor": {
        "type": "CLIENT",
        "id": "cae128d3-1364-4846-9464-242385b95975",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2988c3ae-0a1c-47ba-87e2-81257d0637e3",
        "quote_id": "340b7a60-b664-46c2-a0cb-260ee09de119",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "48e45224-8341-4d10-9ac0-99488255ed85"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:43:31.686314Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2988c3ae-0a1c-47ba-87e2-81257d0637e3",
        "attempt_id": "918e1e0c-10ff-4849-96d4-cde0e74b973b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "48e45224-8341-4d10-9ac0-99488255ed85"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T07:43:31.688696Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b798457f-471f-4242-b411-37aecd321dea",
        "order_id": "2988c3ae-0a1c-47ba-87e2-81257d0637e3",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "48e45224-8341-4d10-9ac0-99488255ed85"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T07:43:32.071645Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b798457f-471f-4242-b411-37aecd321dea",
        "order_id": "2988c3ae-0a1c-47ba-87e2-81257d0637e3"
      },
      "correlation_id": "62897214-6884-4c77-b640-71ee2acf1b98"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 2988c3ae-0a1c-47ba-87e2-81257d0637e3 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/2988c3ae-0a1c-47ba-87e2-81257d0637e3` → **200**

```json
{
  "id": "2988c3ae-0a1c-47ba-87e2-81257d0637e3",
  "short_number": 10,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "cae128d3-1364-4846-9464-242385b95975",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "2abc4f6a-0174-42cc-b00c-d5d8bcda3c6f",
    "order_id": "2988c3ae-0a1c-47ba-87e2-81257d0637e3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "eb04905c-648b-4aaa-a330-d05c8b7de71f",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T07:43:31.684571Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2988c3ae-0a1c-47ba-87e2-81257d0637e3/cancel` → **200**

```json
{
  "command_id": "6f2156d4-1b45-44b7-bf70-e2478710b0ae",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "2988c3ae-0a1c-47ba-87e2-81257d0637e3",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "cae128d3-1364-4846-9464-242385b95975",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "2abc4f6a-0174-42cc-b00c-d5d8bcda3c6f",
    "order_id": "2988c3ae-0a1c-47ba-87e2-81257d0637e3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "eb04905c-648b-4aaa-a330-d05c8b7de71f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T07:43:31.684571Z",
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
  "session_id": "407956cc-84ce-4e1e-b215-441d61e0e158",
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
  "last_heartbeat_at": "2026-10-29T07:43:29.188943Z",
  "last_location_at": "2026-10-29T07:43:29.188943Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/407956cc-84ce-4e1e-b215-441d61e0e158/close` → **200**

```json
{
  "command_id": "2748369a-54b3-4499-90d1-6b9bbe924172",
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
  "session_id": "c4895421-6fa9-4ef8-8df8-7adcc7f65b36",
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
  "last_heartbeat_at": "2026-10-29T07:43:30.150457Z",
  "last_location_at": "2026-10-29T07:43:30.150457Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c4895421-6fa9-4ef8-8df8-7adcc7f65b36/close` → **200**

```json
{
  "command_id": "85ae6980-28c6-4f49-b6e9-6785b35030ec",
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
  "session_id": "21415c18-4d05-4d12-aede-73e01cfdce3d",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3MTQsImlhdCI6MTc5MzI1OTgxNCwianRpIjoiYzg2ZjhkYWQtYzQ5Zi00NzE2LTk0NjItNTU2ZjZlZjE2NGJjIiwic2lkIjoiMjE0MTVjMTgtNGQwNS00ZDEyLWFlZGUtNzNlMDFjZmRjZTNkIn0.vOsc-axHQB7j9ZCbEjEyKQe-1vpD9NS5D-H3086WC6M",
  "access_expires_at": "2026-10-29T07:58:34.030018032Z",
  "refresh_token": "oV1Nd5HNQ5u8-Y7q0U81eWcBMHv18p-aJh_UOBpI9VI",
  "refresh_expires_at": "2026-10-29T19:43:34.029676846Z",
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
  "command_id": "41ae8b2d-6fa7-45ba-b2a3-81a8672208a7",
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
  "changed_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T07:43:34.40441Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "fb398af6-e92e-464a-bfe4-11fe16a1f466",
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
  "correlation_id": "14c7ba03-54e9-41c4-be96-e2f8a68380bf"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "9164672e-18aa-41be-a7a8-9b74ad86b36f",
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
  "correlation_id": "643d192a-1b78-4797-a387-3e80ba722668"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630414544",
  "device_ref": "sandbox-13981"
}
```

```json
{
  "challenge_id": "030c11d4-4b12-4c66-864f-b830b5d61fc2",
  "expires_at": "2026-10-29T07:48:34.961049793Z",
  "resend_available_at": "2026-10-29T07:43:35.961049793Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630414544` → **200**

```json
{
  "phone": "+380630414544",
  "audience": "CLIENT",
  "code": "954462",
  "sent_at": "2026-10-29T07:43:34.963075082Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "030c11d4-4b12-4c66-864f-b830b5d61fc2",
  "code": "954462",
  "device_ref": "sandbox-13981"
}
```

```json
{
  "session_id": "2ff85cdb-335a-4bc2-94ed-3c01964752a9",
  "subject": {
    "type": "CLIENT",
    "id": "f258ea96-82b3-483d-92db-04041e182c34"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMjU4ZWE5Ni04MmIzLTQ4M2QtOTJkYi0wNDA0MWUxODJjMzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNzE1LCJpYXQiOjE3OTMyNTk4MTUsImp0aSI6IjUwN2NhNzk5LTA3ZDYtNGYzZS1iYTNiLWMwNzhlNDBjM2YxNyIsInNpZCI6IjJmZjg1Y2RiLTMzNWEtNGJjMi05NGVkLTNjMDE5NjQ3NTJhOSJ9.1pHSzDpjLKfIfjrAQKTzekTWllOnNcv59-n2sq-oMi4",
  "access_expires_at": "2026-10-29T07:58:35.162458707Z",
  "refresh_token": "3W3Q8Y5juFGMWqoiXMzSU-rbxrkCL4IhakYDEoxtxIo",
  "refresh_expires_at": "2026-11-28T07:43:35.162154276Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3b77d257-06e0-40b9-9679-9d6cb6285676",
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
  "id": "81f24697-a944-4cc3-84a4-171581822f52",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:48:35.352463Z",
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
  "command_id": "566f5e45-7644-483e-bbe9-7de10bb88ad2",
  "quote_id": "81f24697-a944-4cc3-84a4-171581822f52",
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
  "correlation_id": "46f66067-ad69-488d-bc95-12375184090f"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5d29a839-cb2c-4df6-964b-a9bb58f8dbcd",
  "quote_id": "81f24697-a944-4cc3-84a4-171581822f52",
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
  "id": "c3218821-a2f8-40ba-a024-a092a7d95f52",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f258ea96-82b3-483d-92db-04041e182c34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:43:35.737662Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c3218821-a2f8-40ba-a024-a092a7d95f52/cancel` → **200**

```json
{
  "command_id": "39624bb5-e5c9-4581-b82b-809996a0bc61",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c3218821-a2f8-40ba-a024-a092a7d95f52",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f258ea96-82b3-483d-92db-04041e182c34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:43:35.737662Z",
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
  "command_id": "9e6004a4-0505-4875-9af2-9c9f9cb04c1c",
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
  "changed_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T07:43:36.151022Z"
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
      "changed_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T07:43:36.151022Z"
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
  "device_ref": "sandbox-17817"
}
```

```json
{
  "challenge_id": "99e8f003-f7d1-4512-b19d-5472f95374ae",
  "expires_at": "2026-10-29T07:48:36.722902586Z",
  "resend_available_at": "2026-10-29T07:43:37.722902586Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "671734",
  "sent_at": "2026-10-29T07:43:36.724653398Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "99e8f003-f7d1-4512-b19d-5472f95374ae",
  "code": "671734",
  "device_ref": "sandbox-17817"
}
```

```json
{
  "session_id": "56941164-90cb-4e2f-ad2d-c5349ba42deb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDcxNiwiaWF0IjoxNzkzMjU5ODE2LCJqdGkiOiI5N2RlYzFmNy1lODBkLTRkMWYtOTA1Yy01YjkyOTZlNjI3OTMiLCJzaWQiOiI1Njk0MTE2NC05MGNiLTRlMmYtYWQyZC1jNTM0OWJhNDJkZWIifQ.vYEZPqcPlYcE0-ZfYZD_I_t5A83Yz2TteuU2U7sCy4k",
  "access_expires_at": "2026-10-29T07:58:36.927349934Z",
  "refresh_token": "hQqafvqvJVEDhQuL65bv4s-T2zfMbw0uzIAM9yj2fNM",
  "refresh_expires_at": "2026-11-28T07:43:36.927014738Z",
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
  "command_id": "fc76cd58-c27d-452d-9ea8-f3e3d2ed692b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:43:37Z",
    "sequence": 1793259817299
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fbcf0e27-528c-45d5-be4e-6fe2224a2e2c",
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
  "last_heartbeat_at": "2026-10-29T07:43:37.316023Z",
  "last_location_at": "2026-10-29T07:43:37.316023Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670231662",
  "device_ref": "sandbox-23882"
}
```

```json
{
  "challenge_id": "388ea00a-6400-45df-b2f8-4813d7c4f956",
  "expires_at": "2026-10-29T07:48:37.504495743Z",
  "resend_available_at": "2026-10-29T07:43:38.504495743Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670231662` → **200**

```json
{
  "phone": "+380670231662",
  "audience": "CLIENT",
  "code": "842122",
  "sent_at": "2026-10-29T07:43:37.506630504Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "388ea00a-6400-45df-b2f8-4813d7c4f956",
  "code": "842122",
  "device_ref": "sandbox-23882"
}
```

```json
{
  "session_id": "b4051643-1ecc-41a5-b292-a7ba134ed4b4",
  "subject": {
    "type": "CLIENT",
    "id": "273cef88-fc75-4b8a-b03a-cd2997dbdea9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNzNjZWY4OC1mYzc1LTRiOGEtYjAzYS1jZDI5OTdkYmRlYTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNzE3LCJpYXQiOjE3OTMyNTk4MTcsImp0aSI6IjE2ZTdhNmY1LTYxOWEtNGM0MS1hNTZhLTEwOGU2NWIxODVlOCIsInNpZCI6ImI0MDUxNjQzLTFlY2MtNDFhNS1iMjkyLWE3YmExMzRlZDRiNCJ9.0L9uLu5jqkRWrObnyvgDWDsHlWqnyFX2syE12TV2wdE",
  "access_expires_at": "2026-10-29T07:58:37.71027983Z",
  "refresh_token": "BIzHRSt6lDR-wogUTSJM4cl5EoBHbLpU0QVR6bK6cBs",
  "refresh_expires_at": "2026-11-28T07:43:37.709950222Z",
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
  "command_id": "05a3a8b8-2a8e-4d1a-a671-f94e3eeb9d68",
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
  "id": "2d584b8a-1b1d-471b-a4ba-b8ffd5d6a655",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:48:38.070283Z",
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
  "command_id": "1c9b35dd-8ca0-40c3-9332-49d484ff1372",
  "platform": "ANDROID",
  "token": "sandbox-driver-8dab464e-20bf-4adc-9204-a60df62804ac"
}
```

```json
{
  "id": "cbb9a28e-734d-4d55-bc70-cce40198a584",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T07:43:38.263934Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "16cb9d09-4569-4104-8034-8280edb4b7c6",
  "platform": "ANDROID",
  "token": "sandbox-rider-70b31d88-d555-4f37-bea0-e80ac4057bab"
}
```

```json
{
  "id": "5f1a1287-bf78-4eef-af47-b68e6474ad62",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T07:43:38.447405Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2d19d74a-994d-42dc-91f2-7751f0ddecda",
  "quote_id": "2d584b8a-1b1d-471b-a4ba-b8ffd5d6a655",
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
  "id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "273cef88-fc75-4b8a-b03a-cd2997dbdea9",
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
  "created_at": "2026-10-29T07:43:38.637008Z",
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
    "id": "737c85e4-6327-4090-a347-360a1d100793",
    "order_id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
    "expires_at": "2026-10-29T07:43:53.639467Z",
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

`POST /api/driver/v1/offers/737c85e4-6327-4090-a347-360a1d100793/accept` → **200**

```json
{
  "command_id": "0c6538c3-e016-4e26-bca7-f2176cbdcfc0"
}
```

```json
{
  "id": "8344fd6a-8d48-48c8-835d-357e09dcc557",
  "order_id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "66e07f83-2d1c-4d5d-99ca-6852de906094",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T07:43:38.615Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T07:43:38.615Z` → **200**

```json
[
  {
    "at": "2026-10-29T07:43:39.697955385Z",
    "token_suffix": "2804ac",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "bdee6596-76ba-4a01-9444-888dc1229cd0",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380670231662&after=2026-10-29T07:43:38.615Z` → **200**

```json
[
  {
    "at": "2026-10-29T07:43:39.699781038Z",
    "token_suffix": "057bab",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "2e7435b3-c3ae-425d-aee4-eaad0117be53",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/3365aeef-463e-41c1-b1f7-82a740fb5fcc/messages` → **201**

```json
{
  "command_id": "e072b849-b4e5-4647-a163-f0c276652082",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "c88bb54e-9a87-4842-bdee-4ae25bf765e6",
  "order_id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T07:43:40.323079878Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "66e07f83-2d1c-4d5d-99ca-6852de906094",
  "order_id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
  "assignment_id": "8344fd6a-8d48-48c8-835d-357e09dcc557",
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

`POST /api/driver/v1/trips/66e07f83-2d1c-4d5d-99ca-6852de906094/messages` → **201**

```json
{
  "command_id": "8371489b-12e0-4e57-a002-e9c122479bc0",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "ff41405e-fe09-4aec-a6fc-41c0024be6d0",
  "order_id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T07:43:40.677939773Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/3365aeef-463e-41c1-b1f7-82a740fb5fcc/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/66e07f83-2d1c-4d5d-99ca-6852de906094/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380670231662"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/fbcf0e27-528c-45d5-be4e-6fe2224a2e2c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:43:41Z",
    "sequence": 1793259821212
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fbcf0e27-528c-45d5-be4e-6fe2224a2e2c",
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
  "last_heartbeat_at": "2026-10-29T07:43:41.227283Z",
  "last_location_at": "2026-10-29T07:43:41.227283Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "66e07f83-2d1c-4d5d-99ca-6852de906094",
  "order_id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
  "assignment_id": "8344fd6a-8d48-48c8-835d-357e09dcc557",
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

`POST /api/driver/v1/trips/66e07f83-2d1c-4d5d-99ca-6852de906094/arrive` → **200**

```json
{
  "command_id": "2320b90e-f0ed-4b1b-89ef-1bb549fe491b",
  "expected_version": 0
}
```

```json
{
  "id": "66e07f83-2d1c-4d5d-99ca-6852de906094",
  "order_id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
  "assignment_id": "8344fd6a-8d48-48c8-835d-357e09dcc557",
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
  "arrived_at": "2026-10-29T07:43:41.592387Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/66e07f83-2d1c-4d5d-99ca-6852de906094/start` → **200**

```json
{
  "command_id": "fb9e4823-991b-441d-b67e-427bcd6237db",
  "expected_version": 1
}
```

```json
{
  "id": "66e07f83-2d1c-4d5d-99ca-6852de906094",
  "order_id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
  "assignment_id": "8344fd6a-8d48-48c8-835d-357e09dcc557",
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
  "arrived_at": "2026-10-29T07:43:41.592387Z",
  "started_at": "2026-10-29T07:43:41.777572Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/fbcf0e27-528c-45d5-be4e-6fe2224a2e2c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:43:41Z",
    "sequence": 1793259821948
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fbcf0e27-528c-45d5-be4e-6fe2224a2e2c",
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
  "last_heartbeat_at": "2026-10-29T07:43:41.963825Z",
  "last_location_at": "2026-10-29T07:43:41.963825Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/66e07f83-2d1c-4d5d-99ca-6852de906094/complete` → **200**

```json
{
  "command_id": "a436101e-0553-47d5-9626-6545aeda52ce",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:43:42Z",
  "cash_received": true
}
```

```json
{
  "id": "66e07f83-2d1c-4d5d-99ca-6852de906094",
  "order_id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
  "assignment_id": "8344fd6a-8d48-48c8-835d-357e09dcc557",
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
  "arrived_at": "2026-10-29T07:43:41.592387Z",
  "started_at": "2026-10-29T07:43:41.777572Z",
  "completed_at": "2026-10-29T07:43:42.149339Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/3365aeef-463e-41c1-b1f7-82a740fb5fcc` → **200**

```json
{
  "id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
  "short_number": 12,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "273cef88-fc75-4b8a-b03a-cd2997dbdea9",
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
    "id": "8344fd6a-8d48-48c8-835d-357e09dcc557",
    "order_id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "66e07f83-2d1c-4d5d-99ca-6852de906094",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:43:38.637008Z",
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
    "id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
    "short_number": 12,
    "status": "FULFILLED",
    "created_at": "2026-10-29T07:43:38.637008Z",
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
    "id": "66e07f83-2d1c-4d5d-99ca-6852de906094",
    "order_id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
    "order_short_number": 12,
    "created_at": "2026-10-29T07:43:39.055606Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "fea730d4-cdbc-4d32-ad68-f40718451d12",
    "order_id": "0a0e642e-1c87-4ebb-9898-65eec90734eb",
    "order_short_number": 8,
    "created_at": "2026-10-29T07:42:52.651385Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "00061d78-c4ab-42fc-9bd9-287b45a8e168",
    "order_id": "3ad8c39a-638c-4a93-ba69-67ad0877cce6",
    "order_short_number": 3,
    "created_at": "2026-10-29T07:42:19.086375Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "797a3717-8cb7-41ef-9e40-87c49d1cf5b3",
    "order_id": "1267005d-472d-492c-8b36-d48ba76a434d",
    "order_short_number": 2,
    "created_at": "2026-10-29T07:42:02.541852Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "a69b1dbc-ae2c-47af-99c8-fd64fddd83b2",
    "order_id": "bc003375-966a-46ad-a782-30d6678b735f",
    "order_short_number": 1,
    "created_at": "2026-10-29T07:41:55.729236Z",
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

`GET /api/rider/v1/orders/3365aeef-463e-41c1-b1f7-82a740fb5fcc/tip` → **200**

```json
{
  "order_id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
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
  "available_until": "2026-10-30T07:43:42.149339Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/3365aeef-463e-41c1-b1f7-82a740fb5fcc/tip` → **201**

```json
{
  "command_id": "a9e3f385-37e7-4049-8713-511e1f161cf0",
  "amount_minor": 1100
}
```

```json
{
  "id": "37b55e4d-d267-4b8a-896c-806147f89293",
  "order_id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T07:43:46.523609Z"
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
  "session_id": "5f7f5087-203a-4cd9-b4fd-13b47a5300e7",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3MjYsImlhdCI6MTc5MzI1OTgyNiwianRpIjoiYjA0ODU3OTUtYzQyNy00YWZhLWJkNjgtOGE2OWIzNjI5ZWRlIiwic2lkIjoiNWY3ZjUwODctMjAzYS00Y2Q5LWI0ZmQtMTNiNDdhNTMwMGU3In0.yfuhXET-bHToptWZdrky03LOnLDkJ2O0wDyvBoMdiL4",
  "access_expires_at": "2026-10-29T07:58:46.943163917Z",
  "refresh_token": "pMaD_ivA1NS9jMv4gGCW25KVz-tbtCAZuuPQc8hfXZA",
  "refresh_expires_at": "2026-10-29T19:43:46.942827989Z",
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
          "PHONE": 1,
          "APP": 11
        },
        "by_payment": {
          "CARD": 1,
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
    "created": 12,
    "fulfilled": 7,
    "cancelled": 5,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "PHONE": 1,
      "APP": 11
    },
    "by_payment": {
      "CARD": 1,
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
  "generated_at": "2026-10-29T07:43:47.124387126Z"
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
  "generated_at": "2026-10-29T07:43:47.320467422Z"
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
  "session_id": "3438a8b9-fa64-4bdd-abfe-c2ec2799eef8",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3MjcsImlhdCI6MTc5MzI1OTgyNywianRpIjoiYjk1NWVkMDQtNDc5MS00YzAyLThmM2ItNDhlNjhhZWY0Zjk3Iiwic2lkIjoiMzQzOGE4YjktZmE2NC00YmRkLWFiZmUtYzJlYzI3OTllZWY4In0.slmv9DZs_1flRgU3fxJLIhjumd3YjVr5DDL558eqUNM",
  "access_expires_at": "2026-10-29T07:58:47.713955396Z",
  "refresh_token": "ZtBH2SzrmOsSiLxqSmSW7jnwZbMesy3fcRzsOMQvA3Y",
  "refresh_expires_at": "2026-10-29T19:43:47.713585718Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3365aeef-463e-41c1-b1f7-82a740fb5fcc/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:43:38.637449Z",
      "actor": {
        "type": "CLIENT",
        "id": "273cef88-fc75-4b8a-b03a-cd2997dbdea9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
        "quote_id": "2d584b8a-1b1d-471b-a4ba-b8ffd5d6a655",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "db4a7abb-e8b2-459f-b8ef-79a3bd5e3d43"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:43:38.638904Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
        "attempt_id": "a44df8e3-b08d-4765-bf9c-d21fca2a1b59",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "db4a7abb-e8b2-459f-b8ef-79a3bd5e3d43"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T07:43:38.640907Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "737c85e4-6327-4090-a347-360a1d100793",
        "order_id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "db4a7abb-e8b2-459f-b8ef-79a3bd5e3d43"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T07:43:39.056628Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "737c85e4-6327-4090-a347-360a1d100793",
        "order_id": "3365aeef-463e-41c1-b1f7-82a740fb5fcc",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "8344fd6a-8d48-48c8-835d-357e09dcc557"
      },
      "correlation_id": "886b7cd1-31cf-4b45-b066-1acb0a4cd935"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T07:43:48.075111739Z",
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
      "last_location_at": "2026-10-29T07:43:41.963825Z",
      "order_id": null
    }
  ]
}
```

Done: order 3365aeef-463e-41c1-b1f7-82a740fb5fcc.

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
  "session_id": "89d4283e-bbf8-4211-a34b-0a7a1b3d0c1b",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3MjgsImlhdCI6MTc5MzI1OTgyOCwianRpIjoiMmYwYzRmNmEtZGFlYi00YmU4LTllODQtNWY3ODdjNTJjMGNmIiwic2lkIjoiODlkNDI4M2UtYmJmOC00MjExLWEzNGItMGE3YTFiM2QwYzFiIn0.tAuFUCHgg6lLZoyEZkDZ90upKXA1aNHdPEYgCkVRrfo",
  "access_expires_at": "2026-10-29T07:58:48.472494587Z",
  "refresh_token": "HxnuvztH9oyoyFVIMRigWVzuWcD_DU7a4twqgVJ7ERw",
  "refresh_expires_at": "2026-10-29T19:43:48.472164248Z",
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
  "command_id": "f4eacb77-ae76-4a24-b57d-3e5fc1e716e3",
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
  "timestamp": "2026-10-29T07:43:49.000+0000",
  "channel": {
    "id": "1730052000.111229285",
    "linkedid": "1730052000.111229285",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673692918"
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
  "timestamp": "2026-10-29T07:43:49.000+0000",
  "channel": {
    "id": "1730052000.111229285",
    "linkedid": "1730052000.111229285",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673692918"
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
  "session_id": "143b0893-6819-4672-9287-da3a41bf5b46",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3MjksImlhdCI6MTc5MzI1OTgyOSwianRpIjoiNGYxZWUyYWQtNTNlYS00YTIxLWFkZDUtNWU2NGVmYWU5ODc3Iiwic2lkIjoiMTQzYjA4OTMtNjgxOS00NjcyLTkyODctZGEzYTQxYmY1YjQ2In0.9By_e9cUZnELtjDF-wakaJ8KA9Vs7NoBH9Nkz3Jqrbk",
  "access_expires_at": "2026-10-29T07:58:49.258716187Z",
  "refresh_token": "09gQJnWXUiLBnpj9gCjz3mS4DveAC3qmlhlDSvYzvcE",
  "refresh_expires_at": "2026-10-29T19:43:49.258390274Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "9f517cc4-751b-4d92-a95f-d3de3f7e414d",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673692918",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T07:43:49Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/9f517cc4-751b-4d92-a95f-d3de3f7e414d/answer` → **200**

```json
{
  "command_id": "6a716bf8-c63e-48cc-a0c7-b9c545b9de07"
}
```

```json
{
  "id": "9f517cc4-751b-4d92-a95f-d3de3f7e414d",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673692918",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "order_ids": [],
  "started_at": "2026-10-29T07:43:49Z",
  "answered_at": "2026-10-29T07:43:49.631445Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.111229285",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2c82b2c3-9200-401a-8446-0f2cd7a06ad3",
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
  "id": "5d44cec5-13a5-409e-aaea-8103fe868358",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:48:49.839931Z",
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
  "command_id": "ccdcc11c-25c5-4f25-977e-741eaf31e66c",
  "quote_id": "5d44cec5-13a5-409e-aaea-8103fe868358",
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
    "phone": "+380673692918"
  },
  "call_id": "9f517cc4-751b-4d92-a95f-d3de3f7e414d"
}
```

```json
{
  "id": "e68c65a1-1736-4b66-8282-2d2d5b934e7a",
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
  "created_at": "2026-10-29T07:43:50.037772Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673692918"
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
    "id": "1730052000.111229285",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "9f517cc4-751b-4d92-a95f-d3de3f7e414d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673692918",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
      "order_ids": [
        "e68c65a1-1736-4b66-8282-2d2d5b934e7a"
      ],
      "started_at": "2026-10-29T07:43:49Z",
      "answered_at": "2026-10-29T07:43:49.631445Z",
      "ended_at": "2026-10-29T07:43:50.236848Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "ef672842-7faf-4f0f-b11e-df75d474979a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670257677",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
      "order_ids": [],
      "started_at": "2026-10-29T07:42:09.433468Z",
      "answered_at": "2026-10-29T07:42:09.671379Z",
      "ended_at": "2026-10-29T07:42:09.89169Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T07:42:15.35138Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/e68c65a1-1736-4b66-8282-2d2d5b934e7a` → **200**

```json
{
  "id": "e68c65a1-1736-4b66-8282-2d2d5b934e7a",
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
  "created_at": "2026-10-29T07:43:50.037772Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673692918"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/e68c65a1-1736-4b66-8282-2d2d5b934e7a` → **200**

```json
{
  "id": "e68c65a1-1736-4b66-8282-2d2d5b934e7a",
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
  "created_at": "2026-10-29T07:43:50.037772Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673692918"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e68c65a1-1736-4b66-8282-2d2d5b934e7a/cancel` → **200**

```json
{
  "command_id": "7c5b8875-75af-4822-87bb-200530d85bae",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "e68c65a1-1736-4b66-8282-2d2d5b934e7a",
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
  "created_at": "2026-10-29T07:43:50.037772Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673692918"
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

Done: call 9f517cc4-751b-4d92-a95f-d3de3f7e414d with order e68c65a1-1736-4b66-8282-2d2d5b934e7a.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21638"
}
```

```json
{
  "challenge_id": "7675f97d-e1a6-4b41-a920-ad8a4d2e0b36",
  "expires_at": "2026-10-29T07:48:51.036292005Z",
  "resend_available_at": "2026-10-29T07:43:52.036292005Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "584698",
  "sent_at": "2026-10-29T07:43:51.038043249Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7675f97d-e1a6-4b41-a920-ad8a4d2e0b36",
  "code": "584698",
  "device_ref": "sandbox-21638"
}
```

```json
{
  "session_id": "ca51d0b0-5410-4d50-a0c4-7a3f4c949856",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDczMSwiaWF0IjoxNzkzMjU5ODMxLCJqdGkiOiJmNzVlZTNhYi0wZTgyLTQwYTktOGU2Mi04NGI2NzllOTE0NTIiLCJzaWQiOiJjYTUxZDBiMC01NDEwLTRkNTAtYTBjNC03YTNmNGM5NDk4NTYifQ.WK1L0YhAk3SrslbNpX1uO1AcCx6qG3lbp9-ZGIckjoU",
  "access_expires_at": "2026-10-29T07:58:51.240780009Z",
  "refresh_token": "OZRdardsmd1FoD5pctNSHuuQqYeyoTVlrP0ZnFEugIg",
  "refresh_expires_at": "2026-11-28T07:43:51.240387022Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fbcf0e27-528c-45d5-be4e-6fe2224a2e2c",
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
  "last_heartbeat_at": "2026-10-29T07:43:41.963825Z",
  "last_location_at": "2026-10-29T07:43:41.963825Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fbcf0e27-528c-45d5-be4e-6fe2224a2e2c/handover` → **200**

```json
{
  "command_id": "dfee14f9-12bb-4d76-b6b7-3bc213e98ec7",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fbcf0e27-528c-45d5-be4e-6fe2224a2e2c",
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
  "last_heartbeat_at": "2026-10-29T07:43:41.963825Z",
  "last_location_at": "2026-10-29T07:43:41.963825Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fbcf0e27-528c-45d5-be4e-6fe2224a2e2c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:43:51Z",
    "sequence": 1793259831797
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fbcf0e27-528c-45d5-be4e-6fe2224a2e2c",
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
  "last_heartbeat_at": "2026-10-29T07:43:51.813875Z",
  "last_location_at": "2026-10-29T07:43:51.813875Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663155014",
  "device_ref": "sandbox-4697"
}
```

```json
{
  "challenge_id": "e320817f-b663-46dd-a214-37ff96d1d020",
  "expires_at": "2026-10-29T07:48:51.990496393Z",
  "resend_available_at": "2026-10-29T07:43:52.990496393Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663155014` → **200**

```json
{
  "phone": "+380663155014",
  "audience": "CLIENT",
  "code": "785696",
  "sent_at": "2026-10-29T07:43:51.992206506Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e320817f-b663-46dd-a214-37ff96d1d020",
  "code": "785696",
  "device_ref": "sandbox-4697"
}
```

```json
{
  "session_id": "b85ea519-f723-4dc7-8330-9ce0deaf94d7",
  "subject": {
    "type": "CLIENT",
    "id": "fbe37d59-85f4-4edb-b2bb-6fe858684f9d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYmUzN2Q1OS04NWY0LTRlZGItYjJiYi02ZmU4NTg2ODRmOWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNzMyLCJpYXQiOjE3OTMyNTk4MzIsImp0aSI6ImE1ZjA0NGJjLTlhNDctNGNlMC1iMTY0LTA0MDY2MTUzYmNiMyIsInNpZCI6ImI4NWVhNTE5LWY3MjMtNGRjNy04MzMwLTljZTBkZWFmOTRkNyJ9.1CVVho8JkQp_68VacIo-6h6mxBOKV6OtywfZM8EBA-o",
  "access_expires_at": "2026-10-29T07:58:52.1914954Z",
  "refresh_token": "ooLXZNXan-ylg49IP3S0EwCfP5RZjCMxBkMj2dr-Ciw",
  "refresh_expires_at": "2026-11-28T07:43:52.191139162Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5f004a79-759a-4660-9a2e-6c785e9c0ede",
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
  "id": "5c3cbb45-de86-4bf6-a7c7-66a802e29578",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:48:52.394749Z",
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
  "command_id": "9eeda0f4-33cc-42ff-b1ab-bee3a1a3f0a0",
  "quote_id": "5c3cbb45-de86-4bf6-a7c7-66a802e29578",
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
  "id": "33ab3429-0774-4bca-9dac-de41dfeb0519",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fbe37d59-85f4-4edb-b2bb-6fe858684f9d",
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
  "created_at": "2026-10-29T07:43:52.596629Z",
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
    "id": "760c9f2d-a6df-42a6-827d-a2cdf6e5acac",
    "order_id": "33ab3429-0774-4bca-9dac-de41dfeb0519",
    "expires_at": "2026-10-29T07:44:07.598745Z",
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

`POST /api/driver/v1/offers/760c9f2d-a6df-42a6-827d-a2cdf6e5acac/accept` → **200**

```json
{
  "command_id": "b9b3c130-80aa-43cf-a130-ca1698ece130"
}
```

```json
{
  "id": "cbc5cfa7-b133-4699-b7c5-85f807a2e667",
  "order_id": "33ab3429-0774-4bca-9dac-de41dfeb0519",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "51caa837-cb4b-48b9-89f3-773c6e814d3d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "51caa837-cb4b-48b9-89f3-773c6e814d3d",
  "order_id": "33ab3429-0774-4bca-9dac-de41dfeb0519",
  "assignment_id": "cbc5cfa7-b133-4699-b7c5-85f807a2e667",
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

`POST /api/driver/v1/work-sessions/fbcf0e27-528c-45d5-be4e-6fe2224a2e2c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:43:53Z",
    "sequence": 1793259833332
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fbcf0e27-528c-45d5-be4e-6fe2224a2e2c",
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
  "last_heartbeat_at": "2026-10-29T07:43:53.348517Z",
  "last_location_at": "2026-10-29T07:43:53.348517Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/51caa837-cb4b-48b9-89f3-773c6e814d3d/arrive` → **200**

```json
{
  "command_id": "d5067405-21b7-49a5-a902-92aa81e144bd",
  "expected_version": 0
}
```

```json
{
  "id": "51caa837-cb4b-48b9-89f3-773c6e814d3d",
  "order_id": "33ab3429-0774-4bca-9dac-de41dfeb0519",
  "assignment_id": "cbc5cfa7-b133-4699-b7c5-85f807a2e667",
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
  "arrived_at": "2026-10-29T07:43:53.538654Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/51caa837-cb4b-48b9-89f3-773c6e814d3d/start` → **200**

```json
{
  "command_id": "567b1db5-ff58-4663-85fe-56323edf3bbe",
  "expected_version": 1
}
```

```json
{
  "id": "51caa837-cb4b-48b9-89f3-773c6e814d3d",
  "order_id": "33ab3429-0774-4bca-9dac-de41dfeb0519",
  "assignment_id": "cbc5cfa7-b133-4699-b7c5-85f807a2e667",
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
  "arrived_at": "2026-10-29T07:43:53.538654Z",
  "started_at": "2026-10-29T07:43:53.732395Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/fbcf0e27-528c-45d5-be4e-6fe2224a2e2c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:43:53Z",
    "sequence": 1793259833923
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fbcf0e27-528c-45d5-be4e-6fe2224a2e2c",
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
  "last_heartbeat_at": "2026-10-29T07:43:53.940492Z",
  "last_location_at": "2026-10-29T07:43:53.940492Z",
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
  "device_ref": "sandbox-12873"
}
```

```json
{
  "challenge_id": "fbbae51b-7e26-4a7a-9887-ee032a0b0d62",
  "expires_at": "2026-10-29T07:48:54.122258388Z",
  "resend_available_at": "2026-10-29T07:43:55.122258388Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "076767",
  "sent_at": "2026-10-29T07:43:54.124039336Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fbbae51b-7e26-4a7a-9887-ee032a0b0d62",
  "code": "076767",
  "device_ref": "sandbox-12873"
}
```

```json
{
  "session_id": "333f755a-6021-4c3b-bb22-b649e319ae8e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDczNCwiaWF0IjoxNzkzMjU5ODM0LCJqdGkiOiJjNDAxYWViZi02MGIyLTQyMWEtOTMxNS1lYzc3ZjY1ZGVmOWEiLCJzaWQiOiIzMzNmNzU1YS02MDIxLTRjM2ItYmIyMi1iNjQ5ZTMxOWFlOGUifQ.f_ZSvt2TvOCvU9dcMW6Qw_v0JYSQs5m7kBLvkewcW-4",
  "access_expires_at": "2026-10-29T07:58:54.329511336Z",
  "refresh_token": "EA-sd0PdRqaXZiL06RVoqD9dA6CoGvS1EoxqaawiBqk",
  "refresh_expires_at": "2026-11-28T07:43:54.32907477Z",
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
  "command_id": "76e0c677-94b2-4ec4-a239-f6dbb697b253",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:43:54Z",
    "sequence": 1793259834696
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f8125664-6a9a-432b-998e-9dfeb1457d42",
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
  "last_heartbeat_at": "2026-10-29T07:43:54.712014Z",
  "last_location_at": "2026-10-29T07:43:54.712014Z",
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
  "session_id": "2ab77a08-5606-4b24-8f9a-12da331d51a7",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3MzUsImlhdCI6MTc5MzI1OTgzNSwianRpIjoiYjJkZjI5MWItN2U0ZC00NjNjLThmMjQtNDliYmE3MGI4NzNmIiwic2lkIjoiMmFiNzdhMDgtNTYwNi00YjI0LThmOWEtMTJkYTMzMWQ1MWE3In0.f3cFagvDD6L_sto8-0RQVUUKTpgAzMDZP0Ix-u1kN8M",
  "access_expires_at": "2026-10-29T07:58:55.112472737Z",
  "refresh_token": "sYJCtmldvO0gorgx6CDKARnwYE9flYLUsfLt6mLJFJY",
  "refresh_expires_at": "2026-10-29T19:43:55.112135127Z",
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
  "session_id": "d4a2046f-f803-46f5-9870-93f90e0f4b7d",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3MzUsImlhdCI6MTc5MzI1OTgzNSwianRpIjoiMDNmMGUyYzgtOTIzMy00MDlkLWE4ZmMtZDY5ZWQyN2EwZmQyIiwic2lkIjoiZDRhMjA0NmYtZjgwMy00NmY1LTk4NzAtOTNmOTBlMGY0YjdkIn0.93YOUEtVAxpgTty49t5sqti7AUWZktMzCvODE456F2M",
  "access_expires_at": "2026-10-29T07:58:55.50808908Z",
  "refresh_token": "lcnD4c_ZCwXLf7p7rrn1OJo6aJ0lu7llJssjDvvPgPY",
  "refresh_expires_at": "2026-10-29T19:43:55.507706438Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/33ab3429-0774-4bca-9dac-de41dfeb0519` → **200**

```json
{
  "id": "33ab3429-0774-4bca-9dac-de41dfeb0519",
  "short_number": 14,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "fbe37d59-85f4-4edb-b2bb-6fe858684f9d",
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
    "id": "cbc5cfa7-b133-4699-b7c5-85f807a2e667",
    "order_id": "33ab3429-0774-4bca-9dac-de41dfeb0519",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "51caa837-cb4b-48b9-89f3-773c6e814d3d",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T07:43:52.596629Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/33ab3429-0774-4bca-9dac-de41dfeb0519/interrupt` → **200**

```json
{
  "command_id": "f68b7417-71d5-4736-aebe-0b21e1c60608",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "33ab3429-0774-4bca-9dac-de41dfeb0519",
    "short_number": 14,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "fbe37d59-85f4-4edb-b2bb-6fe858684f9d",
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
      "id": "cbc5cfa7-b133-4699-b7c5-85f807a2e667",
      "order_id": "33ab3429-0774-4bca-9dac-de41dfeb0519",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "51caa837-cb4b-48b9-89f3-773c6e814d3d",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T07:43:52.596629Z",
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
    "id": "7366befd-bfad-4017-9a49-b08c43611cce",
    "short_number": 15,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "fbe37d59-85f4-4edb-b2bb-6fe858684f9d",
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
    "id": "bc548eeb-9f6b-4554-9304-f1bc003cf155",
    "order_id": "7366befd-bfad-4017-9a49-b08c43611cce",
    "expires_at": "2026-10-29T07:44:10.912301Z",
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

`POST /api/driver/v1/offers/bc548eeb-9f6b-4554-9304-f1bc003cf155/accept` → **200**

```json
{
  "command_id": "2cc83b93-1d6b-4dc3-9078-e27616ac5423"
}
```

```json
{
  "id": "99df5ea9-cf31-497e-9ae5-5ec24289e1b0",
  "order_id": "7366befd-bfad-4017-9a49-b08c43611cce",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f4236c2b-64d3-4f51-a033-e127332381fd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f4236c2b-64d3-4f51-a033-e127332381fd",
  "order_id": "7366befd-bfad-4017-9a49-b08c43611cce",
  "assignment_id": "99df5ea9-cf31-497e-9ae5-5ec24289e1b0",
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
  "session_id": "f8125664-6a9a-432b-998e-9dfeb1457d42",
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
  "last_heartbeat_at": "2026-10-29T07:43:54.712014Z",
  "last_location_at": "2026-10-29T07:43:54.712014Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/f8125664-6a9a-432b-998e-9dfeb1457d42/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:43:56Z",
    "sequence": 1793259836870
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f8125664-6a9a-432b-998e-9dfeb1457d42",
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
  "last_heartbeat_at": "2026-10-29T07:43:56.88661Z",
  "last_location_at": "2026-10-29T07:43:56.88661Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f4236c2b-64d3-4f51-a033-e127332381fd/arrive` → **200**

```json
{
  "command_id": "51e48fca-a16c-49ca-be3b-3c1e7958f88c",
  "expected_version": 0
}
```

```json
{
  "id": "f4236c2b-64d3-4f51-a033-e127332381fd",
  "order_id": "7366befd-bfad-4017-9a49-b08c43611cce",
  "assignment_id": "99df5ea9-cf31-497e-9ae5-5ec24289e1b0",
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
  "arrived_at": "2026-10-29T07:43:57.075753Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f4236c2b-64d3-4f51-a033-e127332381fd/start` → **200**

```json
{
  "command_id": "e0018e29-9c87-4d80-942f-e54c2460b1af",
  "expected_version": 1
}
```

```json
{
  "id": "f4236c2b-64d3-4f51-a033-e127332381fd",
  "order_id": "7366befd-bfad-4017-9a49-b08c43611cce",
  "assignment_id": "99df5ea9-cf31-497e-9ae5-5ec24289e1b0",
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
  "arrived_at": "2026-10-29T07:43:57.075753Z",
  "started_at": "2026-10-29T07:43:57.267272Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f4236c2b-64d3-4f51-a033-e127332381fd/complete` → **200**

```json
{
  "command_id": "71e05374-e667-451c-b2de-dd7ab521550b",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:43:57Z"
}
```

```json
{
  "id": "f4236c2b-64d3-4f51-a033-e127332381fd",
  "order_id": "7366befd-bfad-4017-9a49-b08c43611cce",
  "assignment_id": "99df5ea9-cf31-497e-9ae5-5ec24289e1b0",
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
  "arrived_at": "2026-10-29T07:43:57.075753Z",
  "started_at": "2026-10-29T07:43:57.267272Z",
  "completed_at": "2026-10-29T07:43:57.473254Z",
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
    "id": "7366befd-bfad-4017-9a49-b08c43611cce",
    "short_number": 15,
    "status": "FULFILLED",
    "created_at": "2026-10-29T07:43:55.905216Z",
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
    "id": "33ab3429-0774-4bca-9dac-de41dfeb0519",
    "short_number": 14,
    "status": "CANCELLED",
    "created_at": "2026-10-29T07:43:52.596629Z",
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

`GET /api/operator/v1/orders/33ab3429-0774-4bca-9dac-de41dfeb0519/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:43:52.597061Z",
      "actor": {
        "type": "CLIENT",
        "id": "fbe37d59-85f4-4edb-b2bb-6fe858684f9d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "33ab3429-0774-4bca-9dac-de41dfeb0519",
        "quote_id": "5c3cbb45-de86-4bf6-a7c7-66a802e29578",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "f6bbe0a0-7ae6-4a4a-ac68-252ad4a76f14"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:43:52.598309Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "33ab3429-0774-4bca-9dac-de41dfeb0519",
        "attempt_id": "dec0f440-9441-41cd-9c06-bb64fdcc9376",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f6bbe0a0-7ae6-4a4a-ac68-252ad4a76f14"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T07:43:52.600039Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "760c9f2d-a6df-42a6-827d-a2cdf6e5acac",
        "order_id": "33ab3429-0774-4bca-9dac-de41dfeb0519",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "f6bbe0a0-7ae6-4a4a-ac68-252ad4a76f14"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T07:43:52.968635Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "760c9f2d-a6df-42a6-827d-a2cdf6e5acac",
        "order_id": "33ab3429-0774-4bca-9dac-de41dfeb0519",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "cbc5cfa7-b133-4699-b7c5-85f807a2e667"
      },
      "correlation_id": "ec688b4e-ecbd-4b81-b33e-fdcf19059896"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/7366befd-bfad-4017-9a49-b08c43611cce/tip` → **200**

```json
{
  "order_id": "7366befd-bfad-4017-9a49-b08c43611cce",
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
  "available_until": "2026-10-30T07:43:57.473254Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/7366befd-bfad-4017-9a49-b08c43611cce/tip` → **409**

```json
{
  "command_id": "d70aac1d-1825-44f1-9d3b-07c3519e6d4f",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/7366befd-bfad-4017-9a49-b08c43611cce/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "fe59a658-2587-419e-92f0-1e3b79b35be0"
}
```

Done: interrupted 33ab3429-0774-4bca-9dac-de41dfeb0519, follow-up 7366befd-bfad-4017-9a49-b08c43611cce.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fbcf0e27-528c-45d5-be4e-6fe2224a2e2c",
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
  "last_heartbeat_at": "2026-10-29T07:43:53.940492Z",
  "last_location_at": "2026-10-29T07:43:53.940492Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fbcf0e27-528c-45d5-be4e-6fe2224a2e2c/close` → **200**

```json
{
  "command_id": "1eb1e7ab-1f80-4c0b-a31e-a337f2e207d8",
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
  "session_id": "f8125664-6a9a-432b-998e-9dfeb1457d42",
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
  "last_heartbeat_at": "2026-10-29T07:43:56.88661Z",
  "last_location_at": "2026-10-29T07:43:56.88661Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f8125664-6a9a-432b-998e-9dfeb1457d42/close` → **200**

```json
{
  "command_id": "ec3a1fba-1aa7-4a40-9147-2c90a7975b48",
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
  "session_id": "04bddc9f-c63a-4bf1-8652-5273d3386bbd",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3NDIsImlhdCI6MTc5MzI1OTg0MiwianRpIjoiZjkwMTA0N2YtMDUwNy00Y2FjLWFmOTUtNjY0NDc2ODk3ZDk2Iiwic2lkIjoiMDRiZGRjOWYtYzYzYS00YmYxLTg2NTItNTI3M2QzMzg2YmJkIn0.QSs3T21zEOEpnU-Yldam_O6LAdAefvSX_1yTf7wBgc8",
  "access_expires_at": "2026-10-29T07:59:02.595949784Z",
  "refresh_token": "cclg-1_a_jYUgv0hHOkozigjDrtKqBbJ8wRPgJK-kXE",
  "refresh_expires_at": "2026-10-29T19:44:02.595320793Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "5e991af8-82ab-4169-9f8b-1b190983d482",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T07:44:02Z"
}
```

```json
{
  "id": "1f183d1b-d7d7-431d-b1ef-13701b937377",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T07:44:02Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/1f183d1b-d7d7-431d-b1ef-13701b937377/publish` → **200**

```json
{
  "command_id": "70218b7e-b3dc-4858-8dd3-3e3c4dc619f4",
  "expected_version": 0
}
```

```json
{
  "id": "1f183d1b-d7d7-431d-b1ef-13701b937377",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T07:44:02.989439Z",
  "published_at": "2026-10-29T07:44:02.989439Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "1f183d1b-d7d7-431d-b1ef-13701b937377",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T07:44:02.989439Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637428462",
  "device_ref": "sandbox-31152"
}
```

```json
{
  "challenge_id": "856017a9-228a-4fab-8d7d-31d381147b2e",
  "expires_at": "2026-10-29T07:49:03.353889373Z",
  "resend_available_at": "2026-10-29T07:44:04.353889373Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637428462` → **200**

```json
{
  "phone": "+380637428462",
  "audience": "CLIENT",
  "code": "875575",
  "sent_at": "2026-10-29T07:44:03.356928858Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "856017a9-228a-4fab-8d7d-31d381147b2e",
  "code": "875575",
  "device_ref": "sandbox-31152"
}
```

```json
{
  "session_id": "e40d2341-6677-4903-8fee-e28f7025bb3e",
  "subject": {
    "type": "CLIENT",
    "id": "2beacfb4-e618-4856-8fa7-3a2a0d8e2d13"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYmVhY2ZiNC1lNjE4LTQ4NTYtOGZhNy0zYTJhMGQ4ZTJkMTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNzQzLCJpYXQiOjE3OTMyNTk4NDMsImp0aSI6Ijk4ZTI4MDdkLTUwODktNDM3Ni04NWE4LTg5NGQ1NzAwNWM5OSIsInNpZCI6ImU0MGQyMzQxLTY2NzctNDkwMy04ZmVlLWUyOGY3MDI1YmIzZSJ9.4hOIDZUrazvUtiDT-1Us00dcJLyYc0r9VhHu4jGpsbE",
  "access_expires_at": "2026-10-29T07:59:03.561927911Z",
  "refresh_token": "FxyH97Z73jW1IgZGNfORywf_h_m5hdtNzcQHojn9GM4",
  "refresh_expires_at": "2026-11-28T07:44:03.561542391Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "1f183d1b-d7d7-431d-b1ef-13701b937377",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T07:44:02.989439Z",
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
  "command_id": "a1762585-738b-4906-bf88-b07a0b0b3218",
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
  "id": "81a845ab-c0cd-4808-b9cc-56c924a42d1f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:49:03.936757Z",
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
  "command_id": "cc7cdcf0-cf97-43fa-a876-e436a5e18d92",
  "quote_id": "81a845ab-c0cd-4808-b9cc-56c924a42d1f",
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
  "correlation_id": "d97adb72-48cc-418f-8f0f-20112cf9e6fc"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "f4b34583-a033-4293-a4c1-136381ae892b",
  "version_id": "1f183d1b-d7d7-431d-b1ef-13701b937377",
  "language": "uk"
}
```

```json
{
  "version_id": "1f183d1b-d7d7-431d-b1ef-13701b937377",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T07:44:04.339161Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7a88fa1c-1dfc-49b2-9526-70a55ed1a0b1",
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
  "id": "2de35e16-efd3-4af7-8c4f-73e5b99edef4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:49:04.530465Z",
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
  "command_id": "7c64babf-6f3b-4f46-aab4-4eca413d89a4",
  "quote_id": "2de35e16-efd3-4af7-8c4f-73e5b99edef4",
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
  "id": "c2188b0e-97ca-4a21-bc65-ec8580c14fdf",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2beacfb4-e618-4856-8fa7-3a2a0d8e2d13",
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
  "created_at": "2026-10-29T07:44:04.719402Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2188b0e-97ca-4a21-bc65-ec8580c14fdf` → **200**

```json
{
  "id": "c2188b0e-97ca-4a21-bc65-ec8580c14fdf",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2beacfb4-e618-4856-8fa7-3a2a0d8e2d13",
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
  "created_at": "2026-10-29T07:44:04.719402Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c2188b0e-97ca-4a21-bc65-ec8580c14fdf/cancel` → **200**

```json
{
  "command_id": "749fe558-8d1e-4dd8-85a7-12fd6d0cc890",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c2188b0e-97ca-4a21-bc65-ec8580c14fdf",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2beacfb4-e618-4856-8fa7-3a2a0d8e2d13",
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
  "created_at": "2026-10-29T07:44:04.719402Z",
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

`POST /api/admin/v1/legal-documents/1f183d1b-d7d7-431d-b1ef-13701b937377` → **409**

```json
{
  "command_id": "e7e11d68-0e32-479c-b7dd-6d6374f45e7a",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T07:44:05Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/1f183d1b-d7d7-431d-b1ef-13701b937377",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "324a579c-346e-4812-b676-1199f7644118"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "4c06f8d9-4066-4e02-b879-bde053b6b16d",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T07:44:05Z"
}
```

```json
{
  "id": "8855d313-ed4a-4bd8-ac13-bcf5880e1aee",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T07:44:05Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/8855d313-ed4a-4bd8-ac13-bcf5880e1aee/publish` → **200**

```json
{
  "command_id": "f2f3e757-ae1e-4609-9b42-6642980cb5ab",
  "expected_version": 0
}
```

```json
{
  "id": "8855d313-ed4a-4bd8-ac13-bcf5880e1aee",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T07:44:05.724968Z",
  "published_at": "2026-10-29T07:44:05.724968Z",
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
  "device_ref": "sandbox-21173"
}
```

```json
{
  "challenge_id": "6b977409-70f5-4f4e-9b3a-0bb9024e3f5c",
  "expires_at": "2026-10-29T07:49:05.919010827Z",
  "resend_available_at": "2026-10-29T07:44:06.919010827Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "019398",
  "sent_at": "2026-10-29T07:44:05.920772616Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6b977409-70f5-4f4e-9b3a-0bb9024e3f5c",
  "code": "019398",
  "device_ref": "sandbox-21173"
}
```

```json
{
  "session_id": "1bbe6f88-24bf-4d44-ad3e-dfca13529d33",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDc0NiwiaWF0IjoxNzkzMjU5ODQ2LCJqdGkiOiIwMjI2NTFkNS1lZjk4LTQwNzgtOGJjOC01M2ZjMTAxNzQxOTAiLCJzaWQiOiIxYmJlNmY4OC0yNGJmLTRkNDQtYWQzZS1kZmNhMTM1MjlkMzMifQ.JRqfrfEbtmAF4nQ9D4wEsHgjvLuNj27eVfSdXJTDBOA",
  "access_expires_at": "2026-10-29T07:59:06.125532639Z",
  "refresh_token": "QDys0nP8yygs3N-z1BY3d75Nx9egtriAFv3USQ09J1E",
  "refresh_expires_at": "2026-11-28T07:44:06.12506745Z",
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
  "command_id": "dfaef87e-dbe7-4149-b48d-46ffdc1dd7c9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:44:06Z",
    "sequence": 1793259846493
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "300c878d-2dcf-4df9-929c-b7c63766e476",
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
  "last_heartbeat_at": "2026-10-29T07:44:06.509133Z",
  "last_location_at": "2026-10-29T07:44:06.509133Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675575593",
  "device_ref": "sandbox-3417"
}
```

```json
{
  "challenge_id": "1e8ed628-0066-4fd0-a08f-fcea9c3dba3d",
  "expires_at": "2026-10-29T07:49:06.698408635Z",
  "resend_available_at": "2026-10-29T07:44:07.698408635Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675575593` → **200**

```json
{
  "phone": "+380675575593",
  "audience": "CLIENT",
  "code": "792426",
  "sent_at": "2026-10-29T07:44:06.700124777Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e8ed628-0066-4fd0-a08f-fcea9c3dba3d",
  "code": "792426",
  "device_ref": "sandbox-3417"
}
```

```json
{
  "session_id": "c695b8eb-a431-40a0-a874-4ab1074a42ed",
  "subject": {
    "type": "CLIENT",
    "id": "c393573f-22b0-4c5a-bc87-f67ed3cdff62"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMzkzNTczZi0yMmIwLTRjNWEtYmM4Ny1mNjdlZDNjZGZmNjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNzQ2LCJpYXQiOjE3OTMyNTk4NDYsImp0aSI6ImIwMzJhZjdhLWU1OWItNDIwOC1iZjc5LTk2ODdkYjViYTM5YSIsInNpZCI6ImM2OTViOGViLWE0MzEtNDBhMC1hODc0LTRhYjEwNzRhNDJlZCJ9.FO-_GDX5b5gSDC3z3KqnbN_AY_BFqZ1LxmvPGhaznh4",
  "access_expires_at": "2026-10-29T07:59:06.908131338Z",
  "refresh_token": "Q9YDYa_n5I3kqm-Qe6ILMOgV13NwW8OD7sAXJblOmmk",
  "refresh_expires_at": "2026-11-28T07:44:06.907679889Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7395547c-14d4-43a3-ad8d-855d17434d0b",
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
  "id": "007612b4-5a8f-4dd5-9dbd-5ceebb31cbbd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:49:07.100454Z",
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
  "command_id": "531f800b-6eaf-49eb-9f12-924eeb08d8c8",
  "quote_id": "007612b4-5a8f-4dd5-9dbd-5ceebb31cbbd",
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
    "phone": "+380678378349"
  }
}
```

```json
{
  "id": "149f3a9e-9361-45d7-95a6-358eeb6d0671",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c393573f-22b0-4c5a-bc87-f67ed3cdff62",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:44:07.302798Z",
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
    "id": "5f737b2a-d3de-4493-98f3-af708fcaa694",
    "order_id": "149f3a9e-9361-45d7-95a6-358eeb6d0671",
    "expires_at": "2026-10-29T07:44:22.30564Z",
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

`POST /api/driver/v1/offers/5f737b2a-d3de-4493-98f3-af708fcaa694/accept` → **200**

```json
{
  "command_id": "27581cfd-5cf1-4c49-bc48-a166ca7707d6"
}
```

```json
{
  "id": "42ae3955-04e7-49ea-8664-7f3724064ad0",
  "order_id": "149f3a9e-9361-45d7-95a6-358eeb6d0671",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cad49255-7cf9-497c-be37-437b064735d7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cad49255-7cf9-497c-be37-437b064735d7",
  "order_id": "149f3a9e-9361-45d7-95a6-358eeb6d0671",
  "assignment_id": "42ae3955-04e7-49ea-8664-7f3724064ad0",
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
    "phone": "+380678378349"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "11eaf341-cfa9-4fba-b2e8-6a3b151902b6",
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
  "id": "bcba59e8-4b3b-4b37-b935-bf870d14f73a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:49:08.085718Z",
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
  "command_id": "2d3969a4-8365-482e-977a-78854f21c835",
  "quote_id": "bcba59e8-4b3b-4b37-b935-bf870d14f73a",
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
  "id": "0c21ac96-8f56-4435-a570-febad069b883",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c393573f-22b0-4c5a-bc87-f67ed3cdff62",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:44:08.276695Z",
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
  "command_id": "a8337007-d20c-438c-b765-6eb85f58bf82",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T10:44:08Z"
}
```

```json
{
  "id": "3d74d87a-afad-496e-8fda-e5541c50f0ea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:49:08.490427Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T10:44:08Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f4dcbb57-7eab-4689-a155-5d1ebabd5916",
  "quote_id": "3d74d87a-afad-496e-8fda-e5541c50f0ea",
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
  "pickup_at": "2026-10-29T10:44:08Z"
}
```

```json
{
  "id": "f7fcaf4d-efcb-4757-acbd-4cc0f60e4463",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c393573f-22b0-4c5a-bc87-f67ed3cdff62",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T07:44:08.684341Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T10:44:08Z",
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
  "command_id": "87f1b313-69fa-4a2b-a3df-814e93b466be",
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
  "id": "2badc798-6116-4ed9-bab4-9d09aca70925",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:49:08.888819Z",
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
  "command_id": "621cbfde-e1f6-46e6-bd0b-a4a1b262d915",
  "quote_id": "2badc798-6116-4ed9-bab4-9d09aca70925",
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
  "correlation_id": "284ea22f-4da1-45e0-8d79-eaa842267403"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "f7fcaf4d-efcb-4757-acbd-4cc0f60e4463",
      "short_number": 19,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "c393573f-22b0-4c5a-bc87-f67ed3cdff62",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T07:44:08.684341Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T10:44:08Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "0c21ac96-8f56-4435-a570-febad069b883",
      "short_number": 18,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "c393573f-22b0-4c5a-bc87-f67ed3cdff62",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T07:44:08.276695Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "149f3a9e-9361-45d7-95a6-358eeb6d0671",
      "short_number": 17,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "0c21ac96-8f56-4435-a570-febad069b883",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c393573f-22b0-4c5a-bc87-f67ed3cdff62",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:44:08.276695Z",
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

`GET /api/rider/v1/orders/149f3a9e-9361-45d7-95a6-358eeb6d0671` → **200**

```json
{
  "id": "149f3a9e-9361-45d7-95a6-358eeb6d0671",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c393573f-22b0-4c5a-bc87-f67ed3cdff62",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "42ae3955-04e7-49ea-8664-7f3724064ad0",
    "order_id": "149f3a9e-9361-45d7-95a6-358eeb6d0671",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "cad49255-7cf9-497c-be37-437b064735d7",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T07:44:07.302798Z",
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
    "location_at": "2026-10-29T07:44:06.509133Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/149f3a9e-9361-45d7-95a6-358eeb6d0671/cancel` → **200**

```json
{
  "command_id": "961d0c67-6c71-419c-83ee-df114dcd0d19",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "149f3a9e-9361-45d7-95a6-358eeb6d0671",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c393573f-22b0-4c5a-bc87-f67ed3cdff62",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "42ae3955-04e7-49ea-8664-7f3724064ad0",
    "order_id": "149f3a9e-9361-45d7-95a6-358eeb6d0671",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "cad49255-7cf9-497c-be37-437b064735d7",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T07:44:07.302798Z",
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

`GET /api/rider/v1/orders/0c21ac96-8f56-4435-a570-febad069b883` → **200**

```json
{
  "id": "0c21ac96-8f56-4435-a570-febad069b883",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c393573f-22b0-4c5a-bc87-f67ed3cdff62",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:44:08.276695Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0c21ac96-8f56-4435-a570-febad069b883/cancel` → **200**

```json
{
  "command_id": "899f5f7b-24ad-4ac9-982d-47601b1f7365",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0c21ac96-8f56-4435-a570-febad069b883",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c393573f-22b0-4c5a-bc87-f67ed3cdff62",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:44:08.276695Z",
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

`GET /api/rider/v1/orders/f7fcaf4d-efcb-4757-acbd-4cc0f60e4463` → **200**

```json
{
  "id": "f7fcaf4d-efcb-4757-acbd-4cc0f60e4463",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c393573f-22b0-4c5a-bc87-f67ed3cdff62",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T07:44:08.684341Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T10:44:08Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f7fcaf4d-efcb-4757-acbd-4cc0f60e4463/cancel` → **200**

```json
{
  "command_id": "3c68acaf-f613-4154-a7f4-855f9c311ac7",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f7fcaf4d-efcb-4757-acbd-4cc0f60e4463",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "c393573f-22b0-4c5a-bc87-f67ed3cdff62",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T07:44:08.684341Z",
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
  "pickup_at": "2026-10-29T10:44:08Z",
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
  "session_id": "300c878d-2dcf-4df9-929c-b7c63766e476",
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
  "last_heartbeat_at": "2026-10-29T07:44:06.509133Z",
  "last_location_at": "2026-10-29T07:44:06.509133Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/300c878d-2dcf-4df9-929c-b7c63766e476/close` → **200**

```json
{
  "command_id": "4b24c575-bd0b-4524-b5ac-3974c23ceae8",
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

Done: orders 149f3a9e-9361-45d7-95a6-358eeb6d0671, 0c21ac96-8f56-4435-a570-febad069b883, f7fcaf4d-efcb-4757-acbd-4cc0f60e4463.

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
  "session_id": "a5bc0c1b-71a2-4d55-ab31-185a42db1874",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3NTEsImlhdCI6MTc5MzI1OTg1MSwianRpIjoiM2E5ZjU2ZWEtMzVhOS00OTUyLTgxM2MtZjE0YzkyMjE3MmRlIiwic2lkIjoiYTViYzBjMWItNzFhMi00ZDU1LWFiMzEtMTg1YTQyZGIxODc0In0.frcIVgZf6h2oA1A9fioDEDPYyWmd-pLsHO9U2PlLjZo",
  "access_expires_at": "2026-10-29T07:59:11.43946338Z",
  "refresh_token": "vfer3gDLufWwyYCSVbg8LMMeE8TaUDuutU6Yt1Yaq_I",
  "refresh_expires_at": "2026-10-29T19:44:11.439060854Z",
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
  "session_id": "fa4b15df-cdf7-42aa-a900-7ccfb41e0016",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3NTEsImlhdCI6MTc5MzI1OTg1MSwianRpIjoiMTk0YTU2YzAtNTgzYy00ZWFlLWFhMzctYTQwZmQ2YTM5MzczIiwic2lkIjoiZmE0YjE1ZGYtY2RmNy00MmFhLWE5MDAtN2NjZmI0MWUwMDE2In0.eb1oOca7dhy7p98_mfwi-cs7iB85yERV_7giJl-S9-E",
  "access_expires_at": "2026-10-29T07:59:11.835952359Z",
  "refresh_token": "j_IO7pbgZUxn-JS_sC9BmWkLhgrXOsyw7oQPSMa9eaQ",
  "refresh_expires_at": "2026-10-29T19:44:11.835548892Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-7452"
}
```

```json
{
  "challenge_id": "6a568724-c429-4ec3-83c1-99a9d30b7864",
  "expires_at": "2026-10-29T07:49:12.015357736Z",
  "resend_available_at": "2026-10-29T07:44:13.015357736Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "185975",
  "sent_at": "2026-10-29T07:44:12.01712332Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6a568724-c429-4ec3-83c1-99a9d30b7864",
  "code": "185975",
  "device_ref": "sandbox-7452"
}
```

```json
{
  "session_id": "3c37bc36-b2e8-43ab-b634-9a81ae5d3b02",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDc1MiwiaWF0IjoxNzkzMjU5ODUyLCJqdGkiOiI1MjlmMzU5Yy05NjU1LTQwZTctOWY0Yy1hOTc1Y2I2YTdhOTQiLCJzaWQiOiIzYzM3YmMzNi1iMmU4LTQzYWItYjYzNC05YTgxYWU1ZDNiMDIifQ.EMPfDa0Yw9AScdERVLtxo6JryfSoNvUMtxnCJwLR8RY",
  "access_expires_at": "2026-10-29T07:59:12.226997111Z",
  "refresh_token": "6sTU0MF6EXIxcGXCREKmiGfEsddaEPvAUTyOWKfwqT8",
  "refresh_expires_at": "2026-11-28T07:44:12.226610754Z",
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
  "command_id": "25fecd48-03cb-4afa-8078-6fab63838cc0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:44:12Z",
    "sequence": 1793259852607
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9faebaf0-227a-4e56-80d9-736f9ac208d4",
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
  "last_heartbeat_at": "2026-10-29T07:44:12.62293Z",
  "last_location_at": "2026-10-29T07:44:12.62293Z",
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
  "command_id": "4a7d0f5a-6849-4758-9da0-5ec40e9630c1",
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
  "effective_at": "2026-10-29T07:44:13.007013Z",
  "changed_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T07:42:24.330893Z",
  "last_entries": [
    {
      "order_id": "3ad8c39a-638c-4a93-ba69-67ad0877cce6",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T07:42:24.330893Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "cd270cbe-7e84-4b65-a130-cd362cd7a606",
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
  "id": "dfd6133b-cd0f-4aaa-833f-355fb58096ff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:49:13.385476Z",
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
  "command_id": "e0ac7845-4114-4771-b5f7-33f02aa1e166",
  "quote_id": "dfd6133b-cd0f-4aaa-833f-355fb58096ff",
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
    "phone": "+3806711119088"
  }
}
```

```json
{
  "id": "cfed7b8a-649d-41cb-9a09-50bae9447140",
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
  "created_at": "2026-10-29T07:44:13.582028Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119088"
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
    "id": "710d4914-46c8-46c4-b732-69864218305d",
    "order_id": "cfed7b8a-649d-41cb-9a09-50bae9447140",
    "expires_at": "2026-10-29T07:44:28.584793Z",
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

`POST /api/driver/v1/offers/710d4914-46c8-46c4-b732-69864218305d/accept` → **200**

```json
{
  "command_id": "2789c269-d633-40f6-98db-0c78348c3a5d"
}
```

```json
{
  "id": "a25a486a-ef7c-41ee-936c-6e172eecca24",
  "order_id": "cfed7b8a-649d-41cb-9a09-50bae9447140",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4fce0173-9df5-44c6-83b7-bde8734e9e2f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4fce0173-9df5-44c6-83b7-bde8734e9e2f",
  "order_id": "cfed7b8a-649d-41cb-9a09-50bae9447140",
  "assignment_id": "a25a486a-ef7c-41ee-936c-6e172eecca24",
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
    "phone": "+3806711119088"
  }
}
```

`POST /api/driver/v1/work-sessions/9faebaf0-227a-4e56-80d9-736f9ac208d4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:44:14Z",
    "sequence": 1793259854314
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9faebaf0-227a-4e56-80d9-736f9ac208d4",
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
  "last_heartbeat_at": "2026-10-29T07:44:14.330884Z",
  "last_location_at": "2026-10-29T07:44:14.330884Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4fce0173-9df5-44c6-83b7-bde8734e9e2f/arrive` → **200**

```json
{
  "command_id": "13631e74-b917-4e87-9067-191b0cadc7b3",
  "expected_version": 0
}
```

```json
{
  "id": "4fce0173-9df5-44c6-83b7-bde8734e9e2f",
  "order_id": "cfed7b8a-649d-41cb-9a09-50bae9447140",
  "assignment_id": "a25a486a-ef7c-41ee-936c-6e172eecca24",
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
  "arrived_at": "2026-10-29T07:44:14.527414Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711119088"
  }
}
```

`POST /api/driver/v1/trips/4fce0173-9df5-44c6-83b7-bde8734e9e2f/start` → **200**

```json
{
  "command_id": "274df6bc-535c-4f30-94b6-010b9801bb17",
  "expected_version": 1
}
```

```json
{
  "id": "4fce0173-9df5-44c6-83b7-bde8734e9e2f",
  "order_id": "cfed7b8a-649d-41cb-9a09-50bae9447140",
  "assignment_id": "a25a486a-ef7c-41ee-936c-6e172eecca24",
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
  "arrived_at": "2026-10-29T07:44:14.527414Z",
  "started_at": "2026-10-29T07:44:14.730842Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711119088"
  }
}
```

`POST /api/driver/v1/trips/4fce0173-9df5-44c6-83b7-bde8734e9e2f/complete` → **200**

```json
{
  "command_id": "54c5c976-06e0-4a31-90c4-187c37322208",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:44:14Z",
  "cash_received": true
}
```

```json
{
  "id": "4fce0173-9df5-44c6-83b7-bde8734e9e2f",
  "order_id": "cfed7b8a-649d-41cb-9a09-50bae9447140",
  "assignment_id": "a25a486a-ef7c-41ee-936c-6e172eecca24",
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
  "arrived_at": "2026-10-29T07:44:14.527414Z",
  "started_at": "2026-10-29T07:44:14.730842Z",
  "completed_at": "2026-10-29T07:44:14.933422Z",
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
  "command_id": "f355caa3-99e8-457d-a21b-68d64ccb966c",
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
  "id": "20f2625a-1361-4727-934c-7a58f775a975",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:49:15.135154Z",
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
  "command_id": "c8146e23-3dcd-4ecf-8d81-4546712116b6",
  "quote_id": "20f2625a-1361-4727-934c-7a58f775a975",
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
    "phone": "+3806711114342"
  }
}
```

```json
{
  "id": "0cd2b108-4e8e-45a6-8c06-8001b958dabd",
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
  "created_at": "2026-10-29T07:44:15.332921Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114342"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/0cd2b108-4e8e-45a6-8c06-8001b958dabd` → **200**

```json
{
  "id": "0cd2b108-4e8e-45a6-8c06-8001b958dabd",
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
  "created_at": "2026-10-29T07:44:15.332921Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114342"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0cd2b108-4e8e-45a6-8c06-8001b958dabd/cancel` → **200**

```json
{
  "command_id": "1d87845a-37b6-415e-8617-04aa46000fb9",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "0cd2b108-4e8e-45a6-8c06-8001b958dabd",
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
  "created_at": "2026-10-29T07:44:15.332921Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114342"
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
  "staff_id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T07:42:24.330893Z",
  "last_entries": [
    {
      "order_id": "0cd2b108-4e8e-45a6-8c06-8001b958dabd",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T07:44:15.758741Z"
    },
    {
      "order_id": "cfed7b8a-649d-41cb-9a09-50bae9447140",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T07:44:14.936567Z"
    },
    {
      "order_id": "3ad8c39a-638c-4a93-ba69-67ad0877cce6",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T07:42:24.330893Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9faebaf0-227a-4e56-80d9-736f9ac208d4",
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
  "last_heartbeat_at": "2026-10-29T07:44:14.330884Z",
  "last_location_at": "2026-10-29T07:44:14.330884Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9faebaf0-227a-4e56-80d9-736f9ac208d4/close` → **200**

```json
{
  "command_id": "086912c1-f34a-4a54-bdc5-ea48b868a986",
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

Done: operator bonus for fulfilled cfed7b8a-649d-41cb-9a09-50bae9447140 and operator-fault cancellation 0cd2b108-4e8e-45a6-8c06-8001b958dabd.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674613579",
  "device_ref": "sandbox-23153"
}
```

```json
{
  "challenge_id": "ef506365-136c-4dd5-8afb-e5dac8237060",
  "expires_at": "2026-10-29T07:49:18.546822857Z",
  "resend_available_at": "2026-10-29T07:44:19.546822857Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674613579` → **200**

```json
{
  "phone": "+380674613579",
  "audience": "CLIENT",
  "code": "987906",
  "sent_at": "2026-10-29T07:44:18.548579803Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674801482",
  "device_ref": "sandbox-8070",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "772d1491-2be5-41f8-8837-097553ab7749",
  "expires_at": "2026-10-29T07:49:18.75304539Z",
  "resend_available_at": "2026-10-29T07:44:19.75304539Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674801482` → **200**

```json
{
  "phone": "+380674801482",
  "audience": "CLIENT",
  "code": "344584",
  "sent_at": "2026-10-29T07:44:18.754801115Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672940000",
  "device_ref": "sandbox-18834"
}
```

```json
{
  "challenge_id": "9ad8c393-7879-4d79-ac0c-f409c84f33f3",
  "expires_at": "2026-10-29T07:49:18.962599722Z",
  "resend_available_at": "2026-10-29T07:44:19.962599722Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672940000` → **200**

```json
{
  "phone": "+380672940000",
  "audience": "CLIENT",
  "code": "689956",
  "sent_at": "2026-10-29T07:44:18.965326937Z",
  "channel": "VOICE"
}
```

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
  "session_id": "ee6fa9f8-1fb1-4311-bdfb-38826b0f0971",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3NTksImlhdCI6MTc5MzI1OTg1OSwianRpIjoiYzI4N2M2MWEtZGM0NC00YzE0LWI1MzAtNzM2NWQ5Nzc4NzdmIiwic2lkIjoiZWU2ZmE5ZjgtMWZiMS00MzExLWJkZmItMzg4MjZiMGYwOTcxIn0.0H0ONxAq6O81qmQrpnHtR5j_OsNjqNp90E5K3965gGE",
  "access_expires_at": "2026-10-29T07:59:19.376760735Z",
  "refresh_token": "eS7V14saYao4tHnp5aw-VpoWa9zkyz28P7bwaECMWb4",
  "refresh_expires_at": "2026-10-29T19:44:19.376413721Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672940000` → **200**

```json
{
  "deliveries": [
    {
      "id": "8ffc77cb-1f23-4157-afbe-7f39d1a919f9",
      "challenge_id": "9ad8c393-7879-4d79-ac0c-f409c84f33f3",
      "phone": "+380672940000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-ddea10f3-becc-49a2-841c-49c991ec6ef9",
      "error": null,
      "attempted_at": "2026-10-29T07:44:18.965598Z"
    },
    {
      "id": "abc36eda-f61d-4645-a7be-364bafba870f",
      "challenge_id": "9ad8c393-7879-4d79-ac0c-f409c84f33f3",
      "phone": "+380672940000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T07:44:18.96447Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380672940000` → **200**

```json
{
  "phone": "+380672940000",
  "audience": "CLIENT",
  "code": "689956",
  "sent_at": "2026-10-29T07:44:18.965326937Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674801482` → **200**

```json
{
  "deliveries": [
    {
      "id": "aebbaffe-5434-49e0-b0e3-dba47fa558b9",
      "challenge_id": "772d1491-2be5-41f8-8837-097553ab7749",
      "phone": "+380674801482",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-6e20560d-91f8-4096-9541-4931c3e947da",
      "error": null,
      "attempted_at": "2026-10-29T07:44:18.7551Z"
    }
  ]
}
```

Done: SMS to +380674613579, a call to +380674801482, SMS then a call to +380672940000.

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
  "session_id": "7df93aaa-b7d8-48a3-ab19-26381a3a1bc8",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3NjAsImlhdCI6MTc5MzI1OTg2MCwianRpIjoiNDU0MmFhOWMtZTcxMC00OTMzLWJhMjgtOGEyODIyZGIwZGNjIiwic2lkIjoiN2RmOTNhYWEtYjdkOC00OGEzLWFiMTktMjYzODFhM2ExYmM4In0.zzfwrxjy-Lzt70w8ySsEXPcNh9TykJq8t9TwkBFv2V4",
  "access_expires_at": "2026-10-29T07:59:20.187533489Z",
  "refresh_token": "Hy7OX2R6rwZfCi3rFg4TPhPZFAq23nyWGqr5svjEpSo",
  "refresh_expires_at": "2026-10-29T19:44:20.187139275Z",
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
  "session_id": "e3b440ce-42a6-455a-aa7c-5077b021c352",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3NjAsImlhdCI6MTc5MzI1OTg2MCwianRpIjoiNTJjNmI0ZDAtYWZlMy00NmFmLTgyYjYtZGI1YmQzZTdkMDU0Iiwic2lkIjoiZTNiNDQwY2UtNDJhNi00NTVhLWFhN2MtNTA3N2IwMjFjMzUyIn0.DNTjfw9jgySV8H0sYW6ReEIRpN8Zwe0V2HUY6XcRwJo",
  "access_expires_at": "2026-10-29T07:59:20.580306811Z",
  "refresh_token": "630N4ksLbLgpcCG5jeTJ5bRFcD22yN1Fl_7TSvvGW0Q",
  "refresh_expires_at": "2026-10-29T19:44:20.579922853Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
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

`POST /api/admin/v1/staff-extensions/ff0cc1fe-4488-4e07-aa75-23877d14b8bb` → **200**

```json
{
  "command_id": "2b265f14-97fa-4680-900c-2d54f28b46ff",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "ceefc3f1-8795-455d-8c26-2027713faff9",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T07:44:21.33336Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T07:44:21.33336Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "35560b0a-c91d-4309-b434-af53b52da38d",
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
  "id": "a9f02006-52e6-4326-814a-7311b5120447",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:49:21.698687Z",
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
  "command_id": "117d2c1b-d761-4e7b-a609-105e4e456373",
  "quote_id": "a9f02006-52e6-4326-814a-7311b5120447",
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
    "phone": "+380670291801"
  }
}
```

```json
{
  "id": "b1b68e0e-1d60-4c19-889d-fe376b527ea9",
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
  "created_at": "2026-10-29T07:44:21.887549Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670291801"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/b1b68e0e-1d60-4c19-889d-fe376b527ea9/calls` → **201**

```json
{
  "command_id": "e3327944-21a1-4000-980b-026b10369f53",
  "to": "CALLER"
}
```

```json
{
  "id": "213f1ea9-ee84-47f1-b4c5-13f476aa8092",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "order_ids": [
    "b1b68e0e-1d60-4c19-889d-fe376b527ea9"
  ],
  "started_at": "2026-10-29T07:44:22.094746Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/b1b68e0e-1d60-4c19-889d-fe376b527ea9/calls` → **201**

```json
{
  "command_id": "e3327944-21a1-4000-980b-026b10369f53",
  "to": "CALLER"
}
```

```json
{
  "id": "213f1ea9-ee84-47f1-b4c5-13f476aa8092",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "order_ids": [
    "b1b68e0e-1d60-4c19-889d-fe376b527ea9"
  ],
  "started_at": "2026-10-29T07:44:22.094746Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "213f1ea9-ee84-47f1-b4c5-13f476aa8092",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380670291801",
    "at": "2026-10-29T07:44:22.096980378Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "213f1ea9-ee84-47f1-b4c5-13f476aa8092",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.8110",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "213f1ea9-ee84-47f1-b4c5-13f476aa8092"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "213f1ea9-ee84-47f1-b4c5-13f476aa8092",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=b1b68e0e-1d60-4c19-889d-fe376b527ea9` → **200**

```json
{
  "calls": [
    {
      "id": "213f1ea9-ee84-47f1-b4c5-13f476aa8092",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
      "order_ids": [
        "b1b68e0e-1d60-4c19-889d-fe376b527ea9"
      ],
      "started_at": "2026-10-29T07:44:22.094746Z",
      "answered_at": "2026-10-29T07:44:22.551151Z",
      "ended_at": "2026-10-29T07:44:22.569487Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=b1b68e0e-1d60-4c19-889d-fe376b527ea9` → **200**

```json
{
  "calls": [
    {
      "id": "213f1ea9-ee84-47f1-b4c5-13f476aa8092",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
      "order_ids": [
        "b1b68e0e-1d60-4c19-889d-fe376b527ea9"
      ],
      "started_at": "2026-10-29T07:44:22.094746Z",
      "answered_at": "2026-10-29T07:44:22.551151Z",
      "ended_at": "2026-10-29T07:44:22.569487Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=b1b68e0e-1d60-4c19-889d-fe376b527ea9` → **200**

```json
{
  "calls": [
    {
      "id": "213f1ea9-ee84-47f1-b4c5-13f476aa8092",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
      "order_ids": [
        "b1b68e0e-1d60-4c19-889d-fe376b527ea9"
      ],
      "started_at": "2026-10-29T07:44:22.094746Z",
      "answered_at": "2026-10-29T07:44:22.551151Z",
      "ended_at": "2026-10-29T07:44:22.569487Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T07:44:25.381057Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/b1b68e0e-1d60-4c19-889d-fe376b527ea9` → **200**

```json
{
  "id": "b1b68e0e-1d60-4c19-889d-fe376b527ea9",
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
  "created_at": "2026-10-29T07:44:21.887549Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670291801"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b1b68e0e-1d60-4c19-889d-fe376b527ea9/cancel` → **200**

```json
{
  "command_id": "31822f64-8b43-44ef-9416-7805eb68c1f6",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "b1b68e0e-1d60-4c19-889d-fe376b527ea9",
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
  "created_at": "2026-10-29T07:44:21.887549Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670291801"
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
  "command_id": "df357a93-3048-4234-ba9a-a2de90b15097",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T07:44:27.575362Z",
  "extension": "101"
}
```

Done: outgoing call 213f1ea9-ee84-47f1-b4c5-13f476aa8092 from order b1b68e0e-1d60-4c19-889d-fe376b527ea9, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632736040",
  "device_ref": "sandbox-31815"
}
```

```json
{
  "challenge_id": "fa051a09-a14e-46f2-a66d-37909782ec44",
  "expires_at": "2026-10-29T07:49:27.786886728Z",
  "resend_available_at": "2026-10-29T07:44:28.786886728Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632736040` → **200**

```json
{
  "phone": "+380632736040",
  "audience": "CLIENT",
  "code": "081732",
  "sent_at": "2026-10-29T07:44:27.788913801Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fa051a09-a14e-46f2-a66d-37909782ec44",
  "code": "081732",
  "device_ref": "sandbox-31815"
}
```

```json
{
  "session_id": "b157f456-8b6c-4a46-93a8-524e7aa9529c",
  "subject": {
    "type": "CLIENT",
    "id": "b8db1fa8-e6c2-4737-984b-b25c78753d13"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOGRiMWZhOC1lNmMyLTQ3MzctOTg0Yi1iMjVjNzg3NTNkMTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNzY3LCJpYXQiOjE3OTMyNTk4NjcsImp0aSI6IjJlNzc0YjcwLTgxZTQtNDNjOC1iM2JiLTVkNDNiOGJkODUwOCIsInNpZCI6ImIxNTdmNDU2LThiNmMtNGE0Ni05M2E4LTUyNGU3YWE5NTI5YyJ9.Y-2LzkeftmMkGoXR6MGFMIm-x6ZQM3-4Dq43nUA0B8s",
  "access_expires_at": "2026-10-29T07:59:27.99582309Z",
  "refresh_token": "uJlZ1v33WBPJ_OeYzGgqxdNlGRRiviL3oo-hAnlQzCg",
  "refresh_expires_at": "2026-11-28T07:44:27.995361602Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b8db1fa8-e6c2-4737-984b-b25c78753d13",
  "session_id": "b157f456-8b6c-4a46-93a8-524e7aa9529c",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632736040",
  "device_ref": "sandbox-18829"
}
```

```json
{
  "challenge_id": "0db91f78-1511-4a0e-bf65-93b16acb97e4",
  "expires_at": "2026-10-29T07:49:30.378729355Z",
  "resend_available_at": "2026-10-29T07:44:31.378729355Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632736040` → **200**

```json
{
  "phone": "+380632736040",
  "audience": "CLIENT",
  "code": "750907",
  "sent_at": "2026-10-29T07:44:30.380417054Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0db91f78-1511-4a0e-bf65-93b16acb97e4",
  "code": "750907",
  "device_ref": "sandbox-18829"
}
```

```json
{
  "session_id": "3225aa16-030d-4009-87c4-5cbaaef19501",
  "subject": {
    "type": "CLIENT",
    "id": "b8db1fa8-e6c2-4737-984b-b25c78753d13"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOGRiMWZhOC1lNmMyLTQ3MzctOTg0Yi1iMjVjNzg3NTNkMTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNzcwLCJpYXQiOjE3OTMyNTk4NzAsImp0aSI6IjI5YWU1MmFiLTM4YzEtNDg1ZC1iMWMzLTFiNWMxODNmZmE1NiIsInNpZCI6IjMyMjVhYTE2LTAzMGQtNDAwOS04N2M0LTVjYmFhZWYxOTUwMSJ9.71tz1snBCDlLy2HFqxGTIrfNnMhhL6IMCfAvMZq09Ww",
  "access_expires_at": "2026-10-29T07:59:30.588011962Z",
  "refresh_token": "K9km8OCuRXc900ntHrx2rfJGI4gPZlEh-YCLQ7zNrYg",
  "refresh_expires_at": "2026-11-28T07:44:30.587449449Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "a4863312-42ac-4599-99c0-8c84140bf99f",
  "expires_at": "2026-10-29T07:49:32.772064982Z",
  "resend_available_at": "2026-10-29T07:44:33.772064982Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632736040` → **200**

```json
{
  "phone": "+380632736040",
  "audience": "CLIENT",
  "code": "407384",
  "sent_at": "2026-10-29T07:44:32.773449602Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380637752837"
}
```

```json
{
  "challenge_id": "852db372-9c64-4a6a-9f99-7f82ffc31893",
  "expires_at": "2026-10-29T07:49:32.967418135Z",
  "resend_available_at": "2026-10-29T07:44:33.967418135Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637752837` → **200**

```json
{
  "phone": "+380637752837",
  "audience": "CLIENT",
  "code": "483417",
  "sent_at": "2026-10-29T07:44:32.969088148Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "d5dc9985-a881-4017-81b8-f816646cc121",
  "current_challenge_id": "a4863312-42ac-4599-99c0-8c84140bf99f",
  "current_code": "000000",
  "new_challenge_id": "852db372-9c64-4a6a-9f99-7f82ffc31893",
  "new_code": "483417"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "eeb1e58d-b7cb-467d-8f3b-a0e93ce2c9f7"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "dd208a83-9bee-4129-a7f7-a0a2bf144ac1",
  "current_challenge_id": "a4863312-42ac-4599-99c0-8c84140bf99f",
  "current_code": "407384",
  "new_challenge_id": "852db372-9c64-4a6a-9f99-7f82ffc31893",
  "new_code": "483417"
}
```

```json
{
  "subject_id": "b8db1fa8-e6c2-4737-984b-b25c78753d13",
  "phone": "+380637752837",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b8db1fa8-e6c2-4737-984b-b25c78753d13",
  "session_id": "b157f456-8b6c-4a46-93a8-524e7aa9529c",
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
  "correlation_id": "48b26210-cc29-40ed-9e1c-be6f9d5c54bd"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637752837",
  "device_ref": "sandbox-9149"
}
```

```json
{
  "challenge_id": "2bd03504-47bb-4aa7-a259-ea96d442ad7c",
  "expires_at": "2026-10-29T07:49:35.898457614Z",
  "resend_available_at": "2026-10-29T07:44:36.898457614Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637752837` → **200**

```json
{
  "phone": "+380637752837",
  "audience": "CLIENT",
  "code": "166598",
  "sent_at": "2026-10-29T07:44:35.900096942Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2bd03504-47bb-4aa7-a259-ea96d442ad7c",
  "code": "166598",
  "device_ref": "sandbox-9149"
}
```

```json
{
  "session_id": "57be58e5-9d1e-4d73-ac6f-249d9855f2a9",
  "subject": {
    "type": "CLIENT",
    "id": "b8db1fa8-e6c2-4737-984b-b25c78753d13"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOGRiMWZhOC1lNmMyLTQ3MzctOTg0Yi1iMjVjNzg3NTNkMTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNzc2LCJpYXQiOjE3OTMyNTk4NzYsImp0aSI6IjM0OTQyNjRjLTYyMDctNDZlNi05M2ZhLTViNTk1YjRhNjk5ZSIsInNpZCI6IjU3YmU1OGU1LTlkMWUtNGQ3My1hYzZmLTI0OWQ5ODU1ZjJhOSJ9.eQoYOhrWm4VFdNP4GDjl9b6YQioMv_B_uHohDitY9Jc",
  "access_expires_at": "2026-10-29T07:59:36.105099025Z",
  "refresh_token": "6nkeZS-vx-WGqjO7s4fWZXv_aVm6fiSf0MUV-nnPl-A",
  "refresh_expires_at": "2026-11-28T07:44:36.104669368Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b8db1fa8-e6c2-4737-984b-b25c78753d13",
  "session_id": "57be58e5-9d1e-4d73-ac6f-249d9855f2a9",
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
  "session_id": "2fd0b4d9-ede9-48bf-9483-a0ba55e2c7ca",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3NzYsImlhdCI6MTc5MzI1OTg3NiwianRpIjoiYWQxZjkxYmQtZDZiMS00NGJjLTlkMjItMGQ3YWYwOTRmMTk3Iiwic2lkIjoiMmZkMGI0ZDktZWRlOS00OGJmLTk0ODMtYTBiYTU1ZTJjN2NhIn0.pNYEfC9ySavGa1wzU4kywHXKVuFV3FlbwYnRuzE4LC8",
  "access_expires_at": "2026-10-29T07:59:36.668652537Z",
  "refresh_token": "XhPqZDxAC9IBqZ7S67Se6LzAOH8_h7oFyGcH_83yqf0",
  "refresh_expires_at": "2026-10-29T19:44:36.668302749Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/b8db1fa8-e6c2-4737-984b-b25c78753d13` → **200**

```json
{
  "client": {
    "id": "b8db1fa8-e6c2-4737-984b-b25c78753d13",
    "phone": "+380637752837",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T07:44:27.993983Z",
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

`POST /api/admin/v1/clients/b8db1fa8-e6c2-4737-984b-b25c78753d13/phone/new-code` → **201**

```json
{
  "phone": "+380639530504"
}
```

```json
{
  "challenge_id": "e9927504-b5a2-4567-8236-ad2c46b3dceb",
  "expires_at": "2026-10-29T07:49:37.052802707Z",
  "resend_available_at": "2026-10-29T07:44:38.052802707Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639530504` → **200**

```json
{
  "phone": "+380639530504",
  "audience": "CLIENT",
  "code": "571024",
  "sent_at": "2026-10-29T07:44:37.053984507Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/b8db1fa8-e6c2-4737-984b-b25c78753d13/phone` → **422**

```json
{
  "command_id": "20e97a62-c654-45b3-aac6-708c01ac45d0",
  "expected_version": 3,
  "new_challenge_id": "e9927504-b5a2-4567-8236-ad2c46b3dceb",
  "new_code": "571025",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/b8db1fa8-e6c2-4737-984b-b25c78753d13/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "e65d1233-5bf5-4791-9acd-2134eec6b78e"
}
```

`POST /api/admin/v1/clients/b8db1fa8-e6c2-4737-984b-b25c78753d13/phone` → **400**

```json
{
  "command_id": "a1e119b2-2a1b-40e4-a45b-63979c5c3306",
  "expected_version": 3,
  "new_challenge_id": "e9927504-b5a2-4567-8236-ad2c46b3dceb",
  "new_code": "571024",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/b8db1fa8-e6c2-4737-984b-b25c78753d13/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "6c546371-260b-40c4-a240-38eeea27dfa3",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/b8db1fa8-e6c2-4737-984b-b25c78753d13/phone` → **200**

```json
{
  "command_id": "435e9faf-bc4d-4eb5-80f1-d6dd86e6135f",
  "expected_version": 3,
  "new_challenge_id": "e9927504-b5a2-4567-8236-ad2c46b3dceb",
  "new_code": "571024",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "b8db1fa8-e6c2-4737-984b-b25c78753d13",
  "phone": "+380639530504",
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
  "correlation_id": "e7c7a167-47f5-49c3-8b0b-b8a49eb13050"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380639530504",
  "device_ref": "sandbox-19235"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "433b561c-ca42-4fb4-8523-bb62797674cb",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639530504",
  "device_ref": "sandbox-19235"
}
```

```json
{
  "challenge_id": "46a285e9-c82e-4b67-aea1-10eef00c7106",
  "expires_at": "2026-10-29T07:49:39.227684761Z",
  "resend_available_at": "2026-10-29T07:44:40.227684761Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639530504` → **200**

```json
{
  "phone": "+380639530504",
  "audience": "CLIENT",
  "code": "699623",
  "sent_at": "2026-10-29T07:44:39.2295612Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "46a285e9-c82e-4b67-aea1-10eef00c7106",
  "code": "699623",
  "device_ref": "sandbox-19235"
}
```

```json
{
  "session_id": "08c66b15-e181-4dbf-84db-259d879a553d",
  "subject": {
    "type": "CLIENT",
    "id": "b8db1fa8-e6c2-4737-984b-b25c78753d13"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOGRiMWZhOC1lNmMyLTQ3MzctOTg0Yi1iMjVjNzg3NTNkMTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNzc5LCJpYXQiOjE3OTMyNTk4NzksImp0aSI6Ijg5NWQ2Njk0LTNmMTMtNGRlYy1iMmU3LWEzOGFkYWY3MmJlNCIsInNpZCI6IjA4YzY2YjE1LWUxODEtNGRiZi04NGRiLTI1OWQ4NzlhNTUzZCJ9.BF9DLX61TiNFR6mbRt94SnBNFE1MNtRrwIJa82IMSM0",
  "access_expires_at": "2026-10-29T07:59:39.429919958Z",
  "refresh_token": "Rbikny_8qXtoK4ipaq8CRoKjsJI91pAvFs0ST2b5y-c",
  "refresh_expires_at": "2026-11-28T07:44:39.429594126Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b8db1fa8-e6c2-4737-984b-b25c78753d13",
  "session_id": "08c66b15-e181-4dbf-84db-259d879a553d",
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
  "phone": "+380637729896",
  "device_ref": "sandbox-16260"
}
```

```json
{
  "challenge_id": "31975211-10b6-4ed6-99d0-aca1fce760b5",
  "expires_at": "2026-10-29T07:49:39.799599627Z",
  "resend_available_at": "2026-10-29T07:44:40.799599627Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637729896` → **200**

```json
{
  "phone": "+380637729896",
  "audience": "CLIENT",
  "code": "977435",
  "sent_at": "2026-10-29T07:44:39.801338061Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31975211-10b6-4ed6-99d0-aca1fce760b5",
  "code": "977435",
  "device_ref": "sandbox-16260"
}
```

```json
{
  "session_id": "78c021b5-eba5-4cdb-98f9-2fd9bd55c297",
  "subject": {
    "type": "CLIENT",
    "id": "06f365d9-d887-41bf-912a-2f627dd169cd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNmYzNjVkOS1kODg3LTQxYmYtOTEyYS0yZjYyN2RkMTY5Y2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNzgwLCJpYXQiOjE3OTMyNTk4ODAsImp0aSI6ImQ3ZGU4YTcxLTMxZDUtNDg1YS1iYTZlLWIwYjhkZjJlNzRlYyIsInNpZCI6Ijc4YzAyMWI1LWViYTUtNGNkYi05OGY5LTJmZDliZDU1YzI5NyJ9._QiQ5oww9yLE-KkHBw_5P2YWAu5L-TjOBUbj4paZYNA",
  "access_expires_at": "2026-10-29T07:59:40.018490975Z",
  "refresh_token": "owOvXU8ClrLrbDeFfN2KG_7r4TNs_HArxw3KfomxnRE",
  "refresh_expires_at": "2026-11-28T07:44:40.018128538Z",
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
  "session_id": "04044c44-e2ae-46bd-96f8-8dd8504d097c",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3ODAsImlhdCI6MTc5MzI1OTg4MCwianRpIjoiZWI5ZjYwMmMtYTQ0My00NTZjLThmN2EtMWU2NGJhOWUyOTMwIiwic2lkIjoiMDQwNDRjNDQtZTJhZS00NmJkLTk2ZjgtOGRkODUwNGQwOTdjIn0.-K7fEXHaiEO5HLRhfGOY4wPHwHnQE4CeHclzbELAYrM",
  "access_expires_at": "2026-10-29T07:59:40.826939136Z",
  "refresh_token": "lMQXsJUqE01xHBV_wNi6MD7eku8MGR3OlE1xmEUABYI",
  "refresh_expires_at": "2026-10-29T19:44:40.826566474Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380637729896` → **200**

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
  "correlation_id": "264dac65-aa2b-46f0-8a8c-7e24fc67fea9"
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
  "session_id": "61181be4-2a8f-43da-8d06-ce7a44f7b36a",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3ODEsImlhdCI6MTc5MzI1OTg4MSwianRpIjoiMzUxYTU1NGMtMWUwYy00MjJhLTg5OGUtM2RkMzliNmMxMGI0Iiwic2lkIjoiNjExODFiZTQtMmE4Zi00M2RhLThkMDYtY2U3YTQ0ZjdiMzZhIn0.lKRfi6atnbEOBclLjOB5rXaNvxrZOhfnM-iWwSjrI9E",
  "access_expires_at": "2026-10-29T07:59:41.589637149Z",
  "refresh_token": "PuTwIxCLYe0zwHiygEgVJLGwlUHd4fxwVMpYg_oLkOg",
  "refresh_expires_at": "2026-10-29T19:44:41.589276936Z",
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
  "changed_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T07:41:58.834805Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "87ed84b9-30a0-4b1b-9755-5adb21bdd3e9",
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
  "changed_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T07:44:41.954430441Z"
}
```

## The rider books the airport for 2026-10-29T10:44:41Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600866664",
  "device_ref": "sandbox-335"
}
```

```json
{
  "challenge_id": "4741c6d1-38a4-4f42-babd-9120963bb7f4",
  "expires_at": "2026-10-29T07:49:42.143946768Z",
  "resend_available_at": "2026-10-29T07:44:43.143946768Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600866664` → **200**

```json
{
  "phone": "+48600866664",
  "audience": "CLIENT",
  "code": "484125",
  "sent_at": "2026-10-29T07:44:42.145620266Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4741c6d1-38a4-4f42-babd-9120963bb7f4",
  "code": "484125",
  "device_ref": "sandbox-335"
}
```

```json
{
  "session_id": "c8db36a2-ae08-4fd8-b465-453dad0bb386",
  "subject": {
    "type": "CLIENT",
    "id": "22f32597-bc46-4d83-9fd9-200211325e69"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMmYzMjU5Ny1iYzQ2LTRkODMtOWZkOS0yMDAyMTEzMjVlNjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNzgyLCJpYXQiOjE3OTMyNTk4ODIsImp0aSI6Ijk0ZmY1MzNiLTk0OGMtNGNiYS1iMjg2LWY1ZTcyNTYxM2ZkMiIsInNpZCI6ImM4ZGIzNmEyLWFlMDgtNGZkOC1iNDY1LTQ1M2RhZDBiYjM4NiJ9.DEc9UEayzuGBSjAaLZALNGbhN5gqvfksi4xnHKHnrxw",
  "access_expires_at": "2026-10-29T07:59:42.357308077Z",
  "refresh_token": "2Nb6AfL2BWsPCzwvIG-I4M1JczqFT7vMJfm_1pa-69s",
  "refresh_expires_at": "2026-11-28T07:44:42.356973682Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7f9eb28c-52e9-42b2-9513-bcc3d8995c16",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T10:44:41Z"
}
```

```json
{
  "id": "910b772d-b338-445e-ae3a-d0b8a423ccbe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:49:42.546053Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T10:44:41Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "376f04bb-7284-42f8-8e2a-ea2c012638e6",
  "quote_id": "910b772d-b338-445e-ae3a-d0b8a423ccbe",
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
  "pickup_at": "2026-10-29T10:44:41Z"
}
```

```json
{
  "id": "dfdd8b6a-768f-4001-bca6-3592bb2fcefb",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "22f32597-bc46-4d83-9fd9-200211325e69",
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
  "created_at": "2026-10-29T07:44:42.749125Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T10:44:41Z",
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
  "device_ref": "sandbox-9460"
}
```

```json
{
  "challenge_id": "569ae036-4e48-4f57-80dc-ec9ca25c6154",
  "expires_at": "2026-10-29T07:49:42.954576679Z",
  "resend_available_at": "2026-10-29T07:44:43.954576679Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "936887",
  "sent_at": "2026-10-29T07:44:42.956311018Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "569ae036-4e48-4f57-80dc-ec9ca25c6154",
  "code": "936887",
  "device_ref": "sandbox-9460"
}
```

```json
{
  "session_id": "cdd2142b-e16a-40fc-ac52-ebe41f04413c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDc4MywiaWF0IjoxNzkzMjU5ODgzLCJqdGkiOiI4MDk0MmVkYS00NmU4LTRkYTUtYmI4Yy05Mzc2ZGZhYzBlZmIiLCJzaWQiOiJjZGQyMTQyYi1lMTZhLTQwZmMtYWM1Mi1lYmU0MWYwNDQxM2MifQ.AiMcPxaRA4_KYQoWTtRxcLsqJbu91Vry7FrCRXUXf4A",
  "access_expires_at": "2026-10-29T07:59:43.162006445Z",
  "refresh_token": "NXZNkfNYtC2gE2SoLBDar_XsabMZ67_UWw_E1z0A2LM",
  "refresh_expires_at": "2026-11-28T07:44:43.161669966Z",
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
  "command_id": "e4522d20-285c-4dc3-888a-dada4f194e13",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:44:43Z",
    "sequence": 1793259883530
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bae21fcc-7418-474c-ba93-e01ba901b8a8",
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
  "last_heartbeat_at": "2026-10-29T07:44:43.546592Z",
  "last_location_at": "2026-10-29T07:44:43.546592Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "dfdd8b6a-768f-4001-bca6-3592bb2fcefb",
      "short_number": 23,
      "pickup_at": "2026-10-29T10:44:41Z",
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

`POST /api/driver/v1/preorders/dfdd8b6a-768f-4001-bca6-3592bb2fcefb/reserve` → **200**

```json
{
  "command_id": "db3dd9d6-7d7b-449b-b453-22f39a6912e4"
}
```

```json
{
  "id": "3d5c89f7-cf4b-490c-94ca-99b1425f8faf",
  "state": "RESERVED",
  "order": {
    "order_id": "dfdd8b6a-768f-4001-bca6-3592bb2fcefb",
    "short_number": 23,
    "pickup_at": "2026-10-29T10:44:41Z",
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
  "reserved_at": "2026-10-29T07:44:43.918564Z",
  "confirm_from": "2026-10-29T10:14:41Z",
  "confirm_until": "2026-10-29T10:24:41Z",
  "drop_until": "2026-10-29T09:44:41Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "3d5c89f7-cf4b-490c-94ca-99b1425f8faf",
      "state": "RESERVED",
      "order": {
        "order_id": "dfdd8b6a-768f-4001-bca6-3592bb2fcefb",
        "short_number": 23,
        "pickup_at": "2026-10-29T10:44:41Z",
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
      "reserved_at": "2026-10-29T07:44:43.918564Z",
      "confirm_from": "2026-10-29T10:14:41Z",
      "confirm_until": "2026-10-29T10:24:41Z",
      "drop_until": "2026-10-29T09:44:41Z"
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
      "id": "3d5c89f7-cf4b-490c-94ca-99b1425f8faf",
      "state": "RESERVED",
      "order": {
        "order_id": "dfdd8b6a-768f-4001-bca6-3592bb2fcefb",
        "short_number": 23,
        "pickup_at": "2026-10-29T10:44:41Z",
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
      "reserved_at": "2026-10-29T07:44:43.918564Z",
      "confirm_from": "2026-10-29T10:14:41Z",
      "confirm_until": "2026-10-29T10:24:41Z",
      "drop_until": "2026-10-29T09:44:41Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/3d5c89f7-cf4b-490c-94ca-99b1425f8faf/confirm` → **409**

```json
{
  "command_id": "887343ff-4153-4231-a10e-a0cb374f7da4"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/3d5c89f7-cf4b-490c-94ca-99b1425f8faf/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "519c2014-46b0-48ee-abca-feb72df15f09"
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
  "session_id": "4452d980-f765-4b77-9c96-01046fec0be7",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3ODQsImlhdCI6MTc5MzI1OTg4NCwianRpIjoiYjcwOTA5ZjAtMzdiOS00NzkwLWExMDgtY2VkNzkzMWNlMTBkIiwic2lkIjoiNDQ1MmQ5ODAtZjc2NS00Yjc3LTljOTYtMDEwNDZmZWMwYmU3In0.7Jj9sigsWMFyvq6mAxxlwik2xIz0rZH_toBTmzzUvj0",
  "access_expires_at": "2026-10-29T07:59:44.877168017Z",
  "refresh_token": "qsUp8DU-zzjKIILUzrMpSDyVXJKQ5kYoSeRwBfuDbG0",
  "refresh_expires_at": "2026-10-29T19:44:44.876792451Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/dfdd8b6a-768f-4001-bca6-3592bb2fcefb` → **200**

```json
{
  "id": "dfdd8b6a-768f-4001-bca6-3592bb2fcefb",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "22f32597-bc46-4d83-9fd9-200211325e69",
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
  "created_at": "2026-10-29T07:44:42.749125Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T10:44:41Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "3d5c89f7-cf4b-490c-94ca-99b1425f8faf",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T07:44:43.918564Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/dfdd8b6a-768f-4001-bca6-3592bb2fcefb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T07:44:42.74992Z",
      "actor": {
        "type": "CLIENT",
        "id": "22f32597-bc46-4d83-9fd9-200211325e69",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "dfdd8b6a-768f-4001-bca6-3592bb2fcefb",
        "preorder": true,
        "quote_id": "910b772d-b338-445e-ae3a-d0b8a423ccbe",
        "pickup_at": "2026-10-29T10:44:41Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "9ba5e8cb-af63-4ea3-b927-d8a6f043f163"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T07:44:43.919382Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "dfdd8b6a-768f-4001-bca6-3592bb2fcefb",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "3d5c89f7-cf4b-490c-94ca-99b1425f8faf"
      },
      "correlation_id": "cbfae09f-582f-4665-a0da-b99b5a06f54d"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order dfdd8b6a-768f-4001-bca6-3592bb2fcefb, reservation 3d5c89f7-cf4b-490c-94ca-99b1425f8faf.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-27133"
}
```

```json
{
  "challenge_id": "cbab6fc5-461f-408a-8c6e-cf6ab897985c",
  "expires_at": "2026-10-29T07:49:45.454152892Z",
  "resend_available_at": "2026-10-29T07:44:46.454152892Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "069233",
  "sent_at": "2026-10-29T07:44:45.456311929Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cbab6fc5-461f-408a-8c6e-cf6ab897985c",
  "code": "069233",
  "device_ref": "sandbox-27133"
}
```

```json
{
  "session_id": "b5092929-9b50-440f-b4ac-ba6805e8e352",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDc4NSwiaWF0IjoxNzkzMjU5ODg1LCJqdGkiOiJiOTJkN2M0OS05ZTA5LTQ2MWMtYmRmYS1hNzMwZTBiMDdkMGYiLCJzaWQiOiJiNTA5MjkyOS05YjUwLTQ0MGYtYjRhYy1iYTY4MDVlOGUzNTIifQ.6gCS6qZwF6CxgAJ2RDSXa0Wz1AzzdkqbPnIRZSJSP4g",
  "access_expires_at": "2026-10-29T07:59:45.663137092Z",
  "refresh_token": "5K3tQTqKFrqRYIuh-Ltkg0KxMM4_MWl0F42xh5fpi1A",
  "refresh_expires_at": "2026-11-28T07:44:45.662737896Z",
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
  "command_id": "fb4ee2fd-e009-4108-acb9-188b7e0f7912",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:44:46Z",
    "sequence": 1793259886396
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2d77556e-5a51-42ff-9fe8-0bd3c58cddd5",
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
  "last_heartbeat_at": "2026-10-29T07:44:46.055917Z",
  "last_location_at": "2026-10-29T07:44:46.055917Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676092173",
  "device_ref": "sandbox-20240"
}
```

```json
{
  "challenge_id": "e3411995-beb5-4c37-ad5c-6a1b527357d5",
  "expires_at": "2026-10-29T07:49:46.239507223Z",
  "resend_available_at": "2026-10-29T07:44:47.239507223Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676092173` → **200**

```json
{
  "phone": "+380676092173",
  "audience": "CLIENT",
  "code": "133993",
  "sent_at": "2026-10-29T07:44:46.241342541Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3411995-beb5-4c37-ad5c-6a1b527357d5",
  "code": "133993",
  "device_ref": "sandbox-20240"
}
```

```json
{
  "session_id": "7df21b6d-1d6d-4925-ba99-2f5afa1b58b8",
  "subject": {
    "type": "CLIENT",
    "id": "9296fb42-9c23-47d8-acbb-8772e0af833e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5Mjk2ZmI0Mi05YzIzLTQ3ZDgtYWNiYi04NzcyZTBhZjgzM2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNzg2LCJpYXQiOjE3OTMyNTk4ODYsImp0aSI6Ijg5NTkwMGM1LTM4MmYtNGMzYi1iYTM1LWQ1OTAyODE5N2YwMyIsInNpZCI6IjdkZjIxYjZkLTFkNmQtNDkyNS1iYTk5LTJmNWFmYTFiNThiOCJ9.krPZHs47tu60jUvyh3vYHBLEX6hbC8OGQQOwkdmCz58",
  "access_expires_at": "2026-10-29T07:59:46.447866608Z",
  "refresh_token": "0L9nzm6NkMf4P2m3H3oE-UJtyPThBZw-tGIgl9xu0IM",
  "refresh_expires_at": "2026-11-28T07:44:46.447454453Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cc512049-7736-4686-8fe2-22eeaf84c1c7",
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
  "id": "6dc284c0-1c83-4d1c-ab50-f78e4d9a6fbc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:49:46.639556Z",
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
  "command_id": "d30d02c2-c880-4d18-ad37-dbb65ca06848",
  "quote_id": "6dc284c0-1c83-4d1c-ab50-f78e4d9a6fbc",
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
  "id": "c090514c-523c-4599-b170-4c6ade51f468",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9296fb42-9c23-47d8-acbb-8772e0af833e",
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
  "created_at": "2026-10-29T07:44:46.832951Z",
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
    "id": "1cb20efa-bd1d-4305-a948-f5df7a9cfc5d",
    "order_id": "c090514c-523c-4599-b170-4c6ade51f468",
    "expires_at": "2026-10-29T07:45:01.834954Z",
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

`POST /api/driver/v1/offers/1cb20efa-bd1d-4305-a948-f5df7a9cfc5d/accept` → **200**

```json
{
  "command_id": "a505dcf0-d0cb-49ca-a61d-00df21ff8564"
}
```

```json
{
  "id": "12c789b3-f30d-4e33-a919-0ea617bfab6d",
  "order_id": "c090514c-523c-4599-b170-4c6ade51f468",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3e4ce65f-fe8e-4132-886f-72046ba88d2f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3e4ce65f-fe8e-4132-886f-72046ba88d2f",
  "order_id": "c090514c-523c-4599-b170-4c6ade51f468",
  "assignment_id": "12c789b3-f30d-4e33-a919-0ea617bfab6d",
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

`POST /api/driver/v1/work-sessions/2d77556e-5a51-42ff-9fe8-0bd3c58cddd5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:44:47Z",
    "sequence": 1793259887580
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2d77556e-5a51-42ff-9fe8-0bd3c58cddd5",
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
  "last_heartbeat_at": "2026-10-29T07:44:47.595879Z",
  "last_location_at": "2026-10-29T07:44:47.595879Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3e4ce65f-fe8e-4132-886f-72046ba88d2f",
  "order_id": "c090514c-523c-4599-b170-4c6ade51f468",
  "assignment_id": "12c789b3-f30d-4e33-a919-0ea617bfab6d",
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

`POST /api/driver/v1/trips/3e4ce65f-fe8e-4132-886f-72046ba88d2f/arrive` → **200**

```json
{
  "command_id": "89b3d0b4-b79a-4a9b-a7f7-b47d2e5f1cda",
  "expected_version": 0
}
```

```json
{
  "id": "3e4ce65f-fe8e-4132-886f-72046ba88d2f",
  "order_id": "c090514c-523c-4599-b170-4c6ade51f468",
  "assignment_id": "12c789b3-f30d-4e33-a919-0ea617bfab6d",
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
  "arrived_at": "2026-10-29T07:44:47.982523Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3e4ce65f-fe8e-4132-886f-72046ba88d2f/start` → **200**

```json
{
  "command_id": "2490ac13-ef0b-4dda-881a-ad9b39a9113a",
  "expected_version": 1
}
```

```json
{
  "id": "3e4ce65f-fe8e-4132-886f-72046ba88d2f",
  "order_id": "c090514c-523c-4599-b170-4c6ade51f468",
  "assignment_id": "12c789b3-f30d-4e33-a919-0ea617bfab6d",
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
  "arrived_at": "2026-10-29T07:44:47.982523Z",
  "started_at": "2026-10-29T07:44:48.176647Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/2d77556e-5a51-42ff-9fe8-0bd3c58cddd5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:44:48Z",
    "sequence": 1793259888362
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2d77556e-5a51-42ff-9fe8-0bd3c58cddd5",
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
  "last_heartbeat_at": "2026-10-29T07:44:48.378329Z",
  "last_location_at": "2026-10-29T07:44:48.378329Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/3e4ce65f-fe8e-4132-886f-72046ba88d2f/complete` → **200**

```json
{
  "command_id": "e2d8aa38-070a-48a2-8ba1-3e61a5a3d152",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:44:48Z",
  "cash_received": true
}
```

```json
{
  "id": "3e4ce65f-fe8e-4132-886f-72046ba88d2f",
  "order_id": "c090514c-523c-4599-b170-4c6ade51f468",
  "assignment_id": "12c789b3-f30d-4e33-a919-0ea617bfab6d",
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
  "arrived_at": "2026-10-29T07:44:47.982523Z",
  "started_at": "2026-10-29T07:44:48.176647Z",
  "completed_at": "2026-10-29T07:44:48.571719Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/c090514c-523c-4599-b170-4c6ade51f468/rating` → **200**

```json
{
  "command_id": "805e7053-2601-4d93-a1f4-d96c59737efc",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "c090514c-523c-4599-b170-4c6ade51f468",
  "score": 5,
  "created_at": "2026-10-29T07:44:48.780112815Z"
}
```

`POST /api/driver/v1/orders/c090514c-523c-4599-b170-4c6ade51f468/rating` → **200**

```json
{
  "command_id": "0350cca4-ca63-4291-a4a2-09b6adb76904",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "c090514c-523c-4599-b170-4c6ade51f468",
  "score": 4,
  "created_at": "2026-10-29T07:44:48.976192169Z"
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
  "session_id": "1ffc5118-48aa-44da-bb93-f287b9667d80",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3ODksImlhdCI6MTc5MzI1OTg4OSwianRpIjoiNjQ4NmEyZDItODlhZi00MDI2LTg2N2YtMmUzMTUyOTcyNmRkIiwic2lkIjoiMWZmYzUxMTgtNDhhYS00NGRhLWJiOTMtZjI4N2I5NjY3ZDgwIn0.F0yt0NJb-yPT0KnOgLPU9RZd0H6S8d3qbn6zb5b9vGY",
  "access_expires_at": "2026-10-29T07:59:49.548659464Z",
  "refresh_token": "Lk3QSnK7ar74S2ey6esgvhTWZS9WazZGdbOsp-GK0aA",
  "refresh_expires_at": "2026-10-29T19:44:49.548270924Z",
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
  "session_id": "3758d517-f365-42c7-b7e5-0a3123dbacc3",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3ODksImlhdCI6MTc5MzI1OTg4OSwianRpIjoiZDgwODNjMjctYzE4YS00ZjczLWFiMWYtNjBhMzBiNWMzOWJkIiwic2lkIjoiMzc1OGQ1MTctZjM2NS00MmM3LWI3ZTUtMGEzMTIzZGJhY2MzIn0.YOarrL7toVkjg7ewO7Owxxb4_6l7MAPjm8diR0ItGc8",
  "access_expires_at": "2026-10-29T07:59:49.942721375Z",
  "refresh_token": "z3XJjXFXg-ZqQUgqn1as0ixcAAXHbKwHKVUrZ_sfvPM",
  "refresh_expires_at": "2026-10-29T19:44:49.942417275Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c090514c-523c-4599-b170-4c6ade51f468/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "c090514c-523c-4599-b170-4c6ade51f468",
      "author_type": "RIDER",
      "author_id": "9296fb42-9c23-47d8-acbb-8772e0af833e",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T07:44:48.780113Z"
    },
    {
      "order_id": "c090514c-523c-4599-b170-4c6ade51f468",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "9296fb42-9c23-47d8-acbb-8772e0af833e",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T07:44:48.976192Z"
    }
  ]
}
```

Done: ratings for order c090514c-523c-4599-b170-4c6ade51f468.

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
  "session_id": "db18f1f3-29ad-46f1-90bf-1d9e9094b1d2",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA3OTAsImlhdCI6MTc5MzI1OTg5MCwianRpIjoiMjYyZDkyYTctNzVmMS00YjgxLTg4MzgtYjg2NDcxYjg1YzFmIiwic2lkIjoiZGIxOGYxZjMtMjlhZC00NmYxLTkwYmYtMWQ5ZTkwOTRiMWQyIn0.z4cqIU8oNCJL8vSy4EhWTWSogBZX6MHDq6d0w2ZhuMQ",
  "access_expires_at": "2026-10-29T07:59:50.522053272Z",
  "refresh_token": "HtSeG8yYRslPiMY2-nFk6yw2WD3xu-EFq6tR8vsk5oU",
  "refresh_expires_at": "2026-10-29T19:44:50.52151198Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "10b18e43-218f-4b65-bdf9-edd751bbed56",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "e5b17daf-c2a7-4bc9-a1b5-145113e2caec",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:44:50.725386Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e5b17daf-c2a7-4bc9-a1b5-145113e2caec` → **200**

```json
{
  "id": "e5b17daf-c2a7-4bc9-a1b5-145113e2caec",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:44:50.725386Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e5b17daf-c2a7-4bc9-a1b5-145113e2caec` → **200**

```json
{
  "id": "e5b17daf-c2a7-4bc9-a1b5-145113e2caec",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:44:50.725386Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e5b17daf-c2a7-4bc9-a1b5-145113e2caec` → **200**

```json
{
  "id": "e5b17daf-c2a7-4bc9-a1b5-145113e2caec",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:44:50.725386Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e5b17daf-c2a7-4bc9-a1b5-145113e2caec` → **200**

```json
{
  "id": "e5b17daf-c2a7-4bc9-a1b5-145113e2caec",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:44:50.725386Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e5b17daf-c2a7-4bc9-a1b5-145113e2caec` → **200**

```json
{
  "id": "e5b17daf-c2a7-4bc9-a1b5-145113e2caec",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T07:44:50.725386Z",
  "ready_at": "2026-10-29T07:44:55.402211Z",
  "expires_at": "2026-10-30T07:44:55.402211Z"
}
```

`GET /api/admin/v1/reports/exports/e5b17daf-c2a7-4bc9-a1b5-145113e2caec/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,23,10,13,0,0,18,5,0,21,1,0,1,7,1,5
total,23,10,13,0,0,18,5,0,21,1,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "7cc0ef13-3fc6-4486-8873-a12a0a08ed3e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "bc8547f5-3c83-455a-a1b4-efdd8c41380c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:44:55.875774Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bc8547f5-3c83-455a-a1b4-efdd8c41380c` → **200**

```json
{
  "id": "bc8547f5-3c83-455a-a1b4-efdd8c41380c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:44:55.875774Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bc8547f5-3c83-455a-a1b4-efdd8c41380c` → **200**

```json
{
  "id": "bc8547f5-3c83-455a-a1b4-efdd8c41380c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:44:55.875774Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bc8547f5-3c83-455a-a1b4-efdd8c41380c` → **200**

```json
{
  "id": "bc8547f5-3c83-455a-a1b4-efdd8c41380c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:44:55.875774Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bc8547f5-3c83-455a-a1b4-efdd8c41380c` → **200**

```json
{
  "id": "bc8547f5-3c83-455a-a1b4-efdd8c41380c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:44:55.875774Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bc8547f5-3c83-455a-a1b4-efdd8c41380c` → **200**

```json
{
  "id": "bc8547f5-3c83-455a-a1b4-efdd8c41380c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T07:44:55.875774Z",
  "ready_at": "2026-10-29T07:45:00.409465Z",
  "expires_at": "2026-10-30T07:45:00.409465Z"
}
```

`GET /api/admin/v1/reports/exports/bc8547f5-3c83-455a-a1b4-efdd8c41380c/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,10,1387.37,130.74,208.14,1179.23,10.52,0.00,162.97,182.97,795.00,50.00,105.17
total,UAH,10,1387.37,130.74,208.14,1179.23,10.52,0.00,162.97,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/9945cd3d-35bf-4b55-bfd8-96e6e4d670b0` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/9945cd3d-35bf-4b55-bfd8-96e6e4d670b0",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a7869b9c-c003-42d2-a9df-af6cea9c4fd5"
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
  "device_ref": "sandbox-22726"
}
```

```json
{
  "challenge_id": "e129f787-1819-499e-b8ba-d5d023774298",
  "expires_at": "2026-10-29T07:50:01.198514632Z",
  "resend_available_at": "2026-10-29T07:45:02.198514632Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "302594",
  "sent_at": "2026-10-29T07:45:01.200637346Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e129f787-1819-499e-b8ba-d5d023774298",
  "code": "302594",
  "device_ref": "sandbox-22726"
}
```

```json
{
  "session_id": "58a51ccb-eb1e-4ae4-959f-12ad5b3c7fdc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDgwMSwiaWF0IjoxNzkzMjU5OTAxLCJqdGkiOiJmODE5ZThlOC0xMTA0LTRkYjgtYWQ4Yi0wNDM4YzJlM2Y3ZmYiLCJzaWQiOiI1OGE1MWNjYi1lYjFlLTRhZTQtOTU5Zi0xMmFkNWIzYzdmZGMifQ.8XT3wsDU5RAyJ6gRAGbWa85xJtHRM8qlfq6dDH6P_7k",
  "access_expires_at": "2026-10-29T08:00:01.413615227Z",
  "refresh_token": "_bfglTj9OfqRTmJ0p4YPdAe4VlZ1PEmUVRsrTr8VmUs",
  "refresh_expires_at": "2026-11-28T07:45:01.413288292Z",
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
  "command_id": "21af88fc-2c57-46b4-b2b3-0639ef597fac",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:45:01Z",
    "sequence": 1793259901945
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e5489c33-7843-4fa9-9573-59ccf245a0dc",
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
  "last_heartbeat_at": "2026-10-29T07:45:01.961442Z",
  "last_location_at": "2026-10-29T07:45:01.961442Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "b04e88fd-f257-45d8-86dd-b50c41d1f666",
  "points": [
    {
      "sequence": 1793259904144,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T07:44:04Z"
    },
    {
      "sequence": 1793259904154,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T07:45:04Z"
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
  "session_id": "3d107894-69e6-4102-8c05-1f5b97f82262",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA4MDQsImlhdCI6MTc5MzI1OTkwNCwianRpIjoiZjZhOTEwNWItZDc4Yy00YjU1LWI4MTYtYjViOGNjNDcxZjlkIiwic2lkIjoiM2QxMDc4OTQtNjllNi00MTAyLThjMDUtMWY1Yjk3ZjgyMjYyIn0.JzZSCKXrTk0xmh7zl1y_XRh1FXSRniqOkh6oeZBzSwI",
  "access_expires_at": "2026-10-29T08:00:04.579611175Z",
  "refresh_token": "-pb6-xKqtf_BDkQGVVcn6BBE4J_oELZBNFL4rHEPSKg",
  "refresh_expires_at": "2026-10-29T19:45:04.579120186Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "977b7eaa-fb37-4c9b-97cc-f9fce9e3df62",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T07:45:04Z",
        "track_point_id": "efc85b8b-b2d3-497d-bd91-0aded70e0b4c",
        "work_session_id": "e5489c33-7843-4fa9-9573-59ccf245a0dc"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T07:45:04Z",
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

`POST /api/admin/v1/driver-risk-flags/977b7eaa-fb37-4c9b-97cc-f9fce9e3df62/confirm` → **200**

```json
{
  "command_id": "66217150-0e8d-4fbe-9be4-830d7fe79c1c",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "977b7eaa-fb37-4c9b-97cc-f9fce9e3df62",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T07:45:04Z",
    "track_point_id": "efc85b8b-b2d3-497d-bd91-0aded70e0b4c",
    "work_session_id": "e5489c33-7843-4fa9-9573-59ccf245a0dc"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T07:45:04Z",
  "reason": null,
  "reviewed_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "reviewed_at": "2026-10-29T07:45:05.18942Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/977b7eaa-fb37-4c9b-97cc-f9fce9e3df62/dismiss` → **409**

```json
{
  "command_id": "8b182b9c-a51c-483f-9aa0-0fc5ac2dd09c",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/977b7eaa-fb37-4c9b-97cc-f9fce9e3df62/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2ac6cfae-79cb-4734-9492-dde817be68e8"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "7dba78e0-585e-4244-9ca7-98e20115ec00",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "d04b9251-6271-429e-bcb8-400f7ae1d40e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "raised_at": "2026-10-29T07:45:05.589669Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/d04b9251-6271-429e-bcb8-400f7ae1d40e/dismiss` → **200**

```json
{
  "command_id": "bdef025b-1409-473b-aee0-8bad3cdd939a",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "d04b9251-6271-429e-bcb8-400f7ae1d40e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "raised_at": "2026-10-29T07:45:05.589669Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "reviewed_at": "2026-10-29T07:45:05.783248Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "c41e610d-acfe-4367-80aa-d603cdb92348",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "977b7eaa-fb37-4c9b-97cc-f9fce9e3df62"
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
      "actor_id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T07:45:05.984796Z"
    }
  ]
}
```

Done: flag 977b7eaa-fb37-4c9b-97cc-f9fce9e3df62 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "faf50f25-f291-4072-8069-4cf27c3797ab",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA4MDYsImlhdCI6MTc5MzI1OTkwNiwianRpIjoiNzZjNDkyYmYtOWEwYi00MDVmLTg5MTYtZjIxNDIwZWEzN2I2Iiwic2lkIjoiZmFmNTBmMjUtZjI5MS00MDcyLTgwNjktNGNmMjdjMzc5N2FiIn0.Y_GfpzyRJCy4LqlZ8k-4q4-ncT-tcOPOoW96kyCVrlM",
  "access_expires_at": "2026-10-29T08:00:06.57120351Z",
  "refresh_token": "V0xXCv4mbhp7z8ygIrXXxjBvHH9EW4-cagrrstgIlsM",
  "refresh_expires_at": "2026-10-29T19:45:06.57081834Z",
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
      "actor_id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T07:45:05.984796Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "0521805e-21bb-4453-8860-0746578b5b11",
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
  "session_id": "e5489c33-7843-4fa9-9573-59ccf245a0dc",
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
  "last_heartbeat_at": "2026-10-29T07:45:01.961442Z",
  "last_location_at": "2026-10-29T07:45:01.961442Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e5489c33-7843-4fa9-9573-59ccf245a0dc/close` → **200**

```json
{
  "command_id": "da26c639-7c2a-4ed0-bddf-e539dba2c86d",
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
  "session_id": "ef198dcf-e1e3-4ff7-8d36-9346a2339c20",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA4MDcsImlhdCI6MTc5MzI1OTkwNywianRpIjoiNDU1YzgyODItNGM2ZC00YWU2LWFjNzUtYWU1OGE2NmVlMWIyIiwic2lkIjoiZWYxOThkY2YtZTFlMy00ZmY3LThkMzYtOTM0NmEyMzM5YzIwIn0.l92-5XfqdWa59WMgosSOeK4KY2nP_kN-cvWtdwegJT4",
  "access_expires_at": "2026-10-29T08:00:07.752558033Z",
  "refresh_token": "CbVy8g8vGvkUPTNK-6kUnqEfK5iXXc7dIhyPaA3yiwg",
  "refresh_expires_at": "2026-10-29T19:45:07.752220683Z",
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
  "command_id": "0affaa21-7063-4968-ba06-b807f1f087db",
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
  "changed_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T07:45:08.153512Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "0affaa21-7063-4968-ba06-b807f1f087db",
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
  "changed_by": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T07:45:08.153512Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48173873828",
  "device_ref": "sandbox-14501"
}
```

```json
{
  "challenge_id": "d66d6680-4440-4f0d-a7df-517cdd4407c0",
  "expires_at": "2026-10-29T07:50:08.546359974Z",
  "resend_available_at": "2026-10-29T07:45:09.546359974Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48173873828` → **200**

```json
{
  "phone": "+48173873828",
  "audience": "CLIENT",
  "code": "511944",
  "sent_at": "2026-10-29T07:45:08.548383501Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d66d6680-4440-4f0d-a7df-517cdd4407c0",
  "code": "511944",
  "device_ref": "sandbox-14501"
}
```

```json
{
  "session_id": "944cc918-bb3c-44cf-bb75-9eb9c6258af6",
  "subject": {
    "type": "CLIENT",
    "id": "a835f128-1288-4142-9fe4-8cb201020dcd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODM1ZjEyOC0xMjg4LTQxNDItOWZlNC04Y2IyMDEwMjBkY2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwODA4LCJpYXQiOjE3OTMyNTk5MDgsImp0aSI6ImRiM2RkNzI0LWJhNTMtNDA4MC04MWE1LTU3ODE2YjVlOTdkZiIsInNpZCI6Ijk0NGNjOTE4LWJiM2MtNDRjZi1iYjc1LTllYjljNjI1OGFmNiJ9.SUeycchgWyb_E3l-XubXjhm0FU8Sy-lsFiZdmrnRFlY",
  "access_expires_at": "2026-10-29T08:00:08.759440525Z",
  "refresh_token": "XuaAKeYFRU_z9lVuzBQKTn6a4HUb59Zas-OU0Luk4wo",
  "refresh_expires_at": "2026-11-28T07:45:08.75907975Z",
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
  "correlation_id": "59ea8a72-d4fe-4081-afee-04a88e8268d6"
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
  "device_ref": "sandbox-11702"
}
```

```json
{
  "challenge_id": "7175f579-bb1e-48ab-9f28-5a35e4a60e25",
  "expires_at": "2026-10-29T07:50:09.305790863Z",
  "resend_available_at": "2026-10-29T07:45:10.305790863Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "439052",
  "sent_at": "2026-10-29T07:45:09.307465152Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7175f579-bb1e-48ab-9f28-5a35e4a60e25",
  "code": "439052",
  "device_ref": "sandbox-11702"
}
```

```json
{
  "session_id": "311ebff8-4ec2-4307-ad04-c17995afb5a9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDgwOSwiaWF0IjoxNzkzMjU5OTA5LCJqdGkiOiJlMjdkNmU4YS0yNDYxLTQ0OGMtYmQzMy0wZTVmOGQwODY1YjkiLCJzaWQiOiIzMTFlYmZmOC00ZWMyLTQzMDctYWQwNC1jMTc5OTVhZmI1YTkifQ.W1nuf3iKmMahUdD5k6fBT8-NmATRMcgOWDrpTfLas-k",
  "access_expires_at": "2026-10-29T08:00:09.518597074Z",
  "refresh_token": "ij9MgSsY5oH12qF_zPMOpqQd6CQLZh2ZSUeisVGV7PE",
  "refresh_expires_at": "2026-11-28T07:45:09.518252443Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bae21fcc-7418-474c-ba93-e01ba901b8a8",
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
  "last_heartbeat_at": "2026-10-29T07:44:43.546592Z",
  "last_location_at": "2026-10-29T07:44:43.546592Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bae21fcc-7418-474c-ba93-e01ba901b8a8/handover` → **200**

```json
{
  "command_id": "c95926d3-7185-417e-84fe-dc9ce627a7a2",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bae21fcc-7418-474c-ba93-e01ba901b8a8",
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
  "last_heartbeat_at": "2026-10-29T07:44:43.546592Z",
  "last_location_at": "2026-10-29T07:44:43.546592Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bae21fcc-7418-474c-ba93-e01ba901b8a8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:45:10Z",
    "sequence": 1793259910704
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bae21fcc-7418-474c-ba93-e01ba901b8a8",
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
  "last_heartbeat_at": "2026-10-29T07:45:10.086213Z",
  "last_location_at": "2026-10-29T07:45:10.086213Z",
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
  "session_id": "bae21fcc-7418-474c-ba93-e01ba901b8a8",
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
  "last_heartbeat_at": "2026-10-29T07:45:10.086213Z",
  "last_location_at": "2026-10-29T07:45:10.086213Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bae21fcc-7418-474c-ba93-e01ba901b8a8/close` → **200**

```json
{
  "command_id": "1b2e37e1-7e1a-40d0-b1b9-7806314d7fa3",
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
  "correlation_id": "36ff11ad-2f33-492d-b850-61993cfaf1e8"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671482220",
  "device_ref": "sandbox-3904"
}
```

```json
{
  "challenge_id": "b49e7c66-63f1-4c85-9d0e-5a518fce133d",
  "expires_at": "2026-10-29T07:50:11.032120668Z",
  "resend_available_at": "2026-10-29T07:45:12.032120668Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671482220` → **200**

```json
{
  "phone": "+380671482220",
  "audience": "CLIENT",
  "code": "557547",
  "sent_at": "2026-10-29T07:45:11.033861086Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b49e7c66-63f1-4c85-9d0e-5a518fce133d",
  "code": "557547",
  "device_ref": "sandbox-3904"
}
```

```json
{
  "session_id": "5461a57a-2c38-423e-9fa5-82465b74bd93",
  "subject": {
    "type": "CLIENT",
    "id": "3a5026cb-01a0-4025-b01f-8a802079ca38"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTUwMjZjYi0wMWEwLTQwMjUtYjAxZi04YTgwMjA3OWNhMzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwODExLCJpYXQiOjE3OTMyNTk5MTEsImp0aSI6ImRkZTJiNjg1LWI2YmEtNDNlNi1iNjYyLTVlM2UzYmRiYzlhMiIsInNpZCI6IjU0NjFhNTdhLTJjMzgtNDIzZS05ZmE1LTgyNDY1Yjc0YmQ5MyJ9.ID9EFw4mEA_9xhYedktelwpH4RXOBHjyuzY3Z_02KbM",
  "access_expires_at": "2026-10-29T08:00:11.237201435Z",
  "refresh_token": "hPzHW-WrE291Gt6gM6Bc_0wKcrpaUxrYQqQrNlmS88A",
  "refresh_expires_at": "2026-11-28T07:45:11.236806029Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "097d5349-558a-4417-b447-43af3130737f",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "5ae570e0-2011-4fa4-8ebb-41a959805c0d",
  "upload_path": "/api/rider/v1/uploads/5ae570e0-2011-4fa4-8ebb-41a959805c0d",
  "expires_at": "2026-10-29T08:00:11.434037327Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/5ae570e0-2011-4fa4-8ebb-41a959805c0d` → **200**

```json
{
  "file_id": "5ae570e0-2011-4fa4-8ebb-41a959805c0d",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "a3811f00-03c7-4571-8964-00ad38976e19",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "5ae570e0-2011-4fa4-8ebb-41a959805c0d"
  ]
}
```

```json
{
  "id": "8eced69f-187b-45c0-a1b5-1a74f94bbdec",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3a5026cb-01a0-4025-b01f-8a802079ca38",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T07:45:11.650548Z",
  "updated_at": "2026-10-29T07:45:11.650548Z",
  "respond_by": "2026-10-29T11:45:11.650548Z",
  "messages": [
    {
      "id": "7ed6d47c-bc06-4c75-b3fc-800eb2886cb6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3a5026cb-01a0-4025-b01f-8a802079ca38",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T07:45:11.651487Z",
      "attachments": [
        {
          "file_id": "5ae570e0-2011-4fa4-8ebb-41a959805c0d",
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
  "session_id": "d9dbe869-41a8-44b4-bc18-dc1143dcb4a3",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA4MTIsImlhdCI6MTc5MzI1OTkxMiwianRpIjoiNmE4NDcxNjgtNDE0Yi00MmQ0LTlkMjQtY2FmMjQzODU2ODFlIiwic2lkIjoiZDlkYmU4NjktNDFhOC00NGI0LWJjMTgtZGMxMTQzZGNiNGEzIn0.QT3YXF65hhx0xFrCQE27gKRH82-cf07r2sDrt-oOL5A",
  "access_expires_at": "2026-10-29T08:00:12.061932711Z",
  "refresh_token": "-aMkmz1XZqy6gHGUb0JCrCItxFIbMzR6gPNH4CWrjc4",
  "refresh_expires_at": "2026-10-29T19:45:12.061587019Z",
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
  "session_id": "ebb2b542-08cd-480f-9098-9a047ebbd8f4",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA4MTIsImlhdCI6MTc5MzI1OTkxMiwianRpIjoiMzg3NTFhZjAtZDAyOC00MWMxLWFiN2UtNWMxYjQ1NWNhYWQzIiwic2lkIjoiZWJiMmI1NDItMDhjZC00ODBmLTkwOTgtOWEwNDdlYmJkOGY0In0.zD91FIhorWDJ51uUWKyslXsag-Y4Txq_W23adzQPwBI",
  "access_expires_at": "2026-10-29T08:00:12.456437691Z",
  "refresh_token": "VU8As-lbXdn8wr-6cuTLN4pUIDd6_bqRUStLBBW_Fgc",
  "refresh_expires_at": "2026-10-29T19:45:12.456084438Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/8eced69f-187b-45c0-a1b5-1a74f94bbdec/attachments/5ae570e0-2011-4fa4-8ebb-41a959805c0d` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "8f81cc2b-5c70-4811-b2ea-ed424629cbe7",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "c702e87e-15fd-4ca3-bb65-9547daef18b9",
  "upload_path": "/api/operator/v1/uploads/c702e87e-15fd-4ca3-bb65-9547daef18b9",
  "expires_at": "2026-10-29T08:00:12.65596411Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/c702e87e-15fd-4ca3-bb65-9547daef18b9` → **200**

```json
{
  "file_id": "c702e87e-15fd-4ca3-bb65-9547daef18b9",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/8eced69f-187b-45c0-a1b5-1a74f94bbdec` → **200**

```json
{
  "id": "8eced69f-187b-45c0-a1b5-1a74f94bbdec",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3a5026cb-01a0-4025-b01f-8a802079ca38",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T07:45:11.650548Z",
  "updated_at": "2026-10-29T07:45:11.650548Z",
  "respond_by": "2026-10-29T11:45:11.650548Z",
  "messages": [
    {
      "id": "7ed6d47c-bc06-4c75-b3fc-800eb2886cb6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3a5026cb-01a0-4025-b01f-8a802079ca38",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T07:45:11.651487Z",
      "attachments": [
        {
          "file_id": "5ae570e0-2011-4fa4-8ebb-41a959805c0d",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/8eced69f-187b-45c0-a1b5-1a74f94bbdec/comments` → **200**

```json
{
  "command_id": "d0f67835-54a6-4100-b735-3d3ec0979c44",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "c702e87e-15fd-4ca3-bb65-9547daef18b9"
  ]
}
```

```json
{
  "id": "8eced69f-187b-45c0-a1b5-1a74f94bbdec",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3a5026cb-01a0-4025-b01f-8a802079ca38",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T07:45:11.650548Z",
  "updated_at": "2026-10-29T07:45:13.068933Z",
  "respond_by": "2026-10-29T11:45:11.650548Z",
  "messages": [
    {
      "id": "7ed6d47c-bc06-4c75-b3fc-800eb2886cb6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3a5026cb-01a0-4025-b01f-8a802079ca38",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T07:45:11.651487Z",
      "attachments": [
        {
          "file_id": "5ae570e0-2011-4fa4-8ebb-41a959805c0d",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "2f72fa06-a62e-4652-8c05-7f064731ea67",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T07:45:13.068559Z",
      "attachments": [
        {
          "file_id": "c702e87e-15fd-4ca3-bb65-9547daef18b9",
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

`GET /api/rider/v1/support/cases/8eced69f-187b-45c0-a1b5-1a74f94bbdec` → **200**

```json
{
  "id": "8eced69f-187b-45c0-a1b5-1a74f94bbdec",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3a5026cb-01a0-4025-b01f-8a802079ca38",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T07:45:11.650548Z",
  "updated_at": "2026-10-29T07:45:13.068933Z",
  "respond_by": "2026-10-29T11:45:11.650548Z",
  "messages": [
    {
      "id": "7ed6d47c-bc06-4c75-b3fc-800eb2886cb6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3a5026cb-01a0-4025-b01f-8a802079ca38",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T07:45:11.651487Z",
      "attachments": [
        {
          "file_id": "5ae570e0-2011-4fa4-8ebb-41a959805c0d",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "2f72fa06-a62e-4652-8c05-7f064731ea67",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T07:45:13.068559Z",
      "attachments": [
        {
          "file_id": "c702e87e-15fd-4ca3-bb65-9547daef18b9",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/8eced69f-187b-45c0-a1b5-1a74f94bbdec/attachments/c702e87e-15fd-4ca3-bb65-9547daef18b9` → **200**

Done: support case 8eced69f-187b-45c0-a1b5-1a74f94bbdec, rider attachment 5ae570e0-2011-4fa4-8ebb-41a959805c0d, operator attachment c702e87e-15fd-4ca3-bb65-9547daef18b9.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733179364",
  "device_ref": "sandbox-4062"
}
```

```json
{
  "challenge_id": "4198328e-bea4-443f-ab32-24e755245f87",
  "expires_at": "2026-10-29T07:50:13.503346993Z",
  "resend_available_at": "2026-10-29T07:45:14.503346993Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380733179364` → **200**

```json
{
  "phone": "+380733179364",
  "audience": "CLIENT",
  "code": "140584",
  "sent_at": "2026-10-29T07:45:13.505043827Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4198328e-bea4-443f-ab32-24e755245f87",
  "code": "140584",
  "device_ref": "sandbox-4062"
}
```

```json
{
  "session_id": "99a5dc56-e848-4ef8-9a77-3e4e0927e617",
  "subject": {
    "type": "CLIENT",
    "id": "7f92c727-da2e-4782-9d42-cbb7a07c5897"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZjkyYzcyNy1kYTJlLTQ3ODItOWQ0Mi1jYmI3YTA3YzU4OTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwODEzLCJpYXQiOjE3OTMyNTk5MTMsImp0aSI6ImMyZjNkZDk5LTYzMTUtNDhjZS04MDAwLWJhNjhiZjlkMjcyNyIsInNpZCI6Ijk5YTVkYzU2LWU4NDgtNGVmOC05YTc3LTNlNGUwOTI3ZTYxNyJ9.j2k8HXO_8geC8VitNt00Xok1uo0OzXoF1pscz2ljLKQ",
  "access_expires_at": "2026-10-29T08:00:13.708861722Z",
  "refresh_token": "X4wPriMcNtwmlvE6ct2TyEqtrU8h3eFAQAYj4d_COPI",
  "refresh_expires_at": "2026-11-28T07:45:13.708446097Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "f47672ea-4758-4be5-b746-0b23ee33f114",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "f89d5f78-be20-44e4-9618-a80a6b6522d0",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-f89d5f78-be20-44e4-9618-a80a6b6522d0",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "36eb14b3fb9471674cf4a9128a2fac63",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=f89d5f78-be20-44e4-9618-a80a6b6522d0",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733179364"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=f89d5f78-be20-44e4-9618-a80a6b6522d0",
  "expires_at": "2026-10-29T08:15:13.897747Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/f89d5f78-be20-44e4-9618-a80a6b6522d0` → **200**

```json
{
  "id": "f89d5f78-be20-44e4-9618-a80a6b6522d0",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T08:15:13.897747Z",
  "card": {
    "id": "f1f48a0a-76f6-41e3-84df-f0fd152040ad",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0581",
    "card_type": "Visa",
    "created_at": "2026-10-29T07:45:14.08734Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f9840c0d-fe2d-497e-b76c-717034877d34",
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
  "id": "c9068dd3-3383-41e3-b7c9-0ea4214d88b4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:50:14.301171Z",
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
  "command_id": "32996c7e-5c2f-447f-bfa7-5f633dd30e21",
  "quote_id": "c9068dd3-3383-41e3-b7c9-0ea4214d88b4",
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
  "id": "7a1410c3-be86-499b-8840-b30da2b9c29e",
  "short_number": 25,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7f92c727-da2e-4782-9d42-cbb7a07c5897",
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
  "created_at": "2026-10-29T07:45:14.497536Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7a1410c3-be86-499b-8840-b30da2b9c29e` → **200**

```json
{
  "id": "7a1410c3-be86-499b-8840-b30da2b9c29e",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7f92c727-da2e-4782-9d42-cbb7a07c5897",
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
  "created_at": "2026-10-29T07:45:14.497536Z",
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

`GET /api/rider/v1/orders/7a1410c3-be86-499b-8840-b30da2b9c29e` → **200**

```json
{
  "id": "7a1410c3-be86-499b-8840-b30da2b9c29e",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7f92c727-da2e-4782-9d42-cbb7a07c5897",
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
  "created_at": "2026-10-29T07:45:14.497536Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7a1410c3-be86-499b-8840-b30da2b9c29e/switch-to-cash` → **200**

```json
{
  "command_id": "c8a64de7-634b-4a90-b8b5-6f680a18017d",
  "expected_version": 3
}
```

```json
{
  "id": "7a1410c3-be86-499b-8840-b30da2b9c29e",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "7f92c727-da2e-4782-9d42-cbb7a07c5897",
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
  "created_at": "2026-10-29T07:45:14.497536Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7a1410c3-be86-499b-8840-b30da2b9c29e/switch-to-cash` → **409**

```json
{
  "command_id": "fd638068-eb4e-473a-903e-6b88243372b8",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/7a1410c3-be86-499b-8840-b30da2b9c29e/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "79478f8a-17b0-4c79-a24e-11b74aa4fea8"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/7a1410c3-be86-499b-8840-b30da2b9c29e` → **200**

```json
{
  "id": "7a1410c3-be86-499b-8840-b30da2b9c29e",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "7f92c727-da2e-4782-9d42-cbb7a07c5897",
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
  "created_at": "2026-10-29T07:45:14.497536Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7a1410c3-be86-499b-8840-b30da2b9c29e/cancel` → **200**

```json
{
  "command_id": "da4aea08-1125-43d8-9503-167c6a687a3f",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7a1410c3-be86-499b-8840-b30da2b9c29e",
  "short_number": 25,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "7f92c727-da2e-4782-9d42-cbb7a07c5897",
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
  "created_at": "2026-10-29T07:45:14.497536Z",
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
  "session_id": "bb8446da-54c8-4480-97cf-534dcdd4e41f",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA4MTYsImlhdCI6MTc5MzI1OTkxNiwianRpIjoiODIyMmUxZGYtM2YxOC00NTNjLThmYWUtNmEyOTUyYjlhOTA2Iiwic2lkIjoiYmI4NDQ2ZGEtNTRjOC00NDgwLTk3Y2YtNTM0ZGNkZDRlNDFmIn0.r_Mr-LxnEKbTSrwuwNUtEXKSXT-ds-PMqHIX7tnezpU",
  "access_expires_at": "2026-10-29T08:00:16.09340863Z",
  "refresh_token": "vr7OTqrwzK-gmiXv83alzMwnLdbuEllaFNFhc-unp1M",
  "refresh_expires_at": "2026-10-29T19:45:16.09298322Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-21150"
}
```

```json
{
  "challenge_id": "5f0b26d2-5c3e-403a-87db-b332a65775af",
  "expires_at": "2026-10-29T07:50:16.280207454Z",
  "resend_available_at": "2026-10-29T07:45:17.280207454Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "289351",
  "sent_at": "2026-10-29T07:45:16.281906886Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5f0b26d2-5c3e-403a-87db-b332a65775af",
  "code": "289351",
  "device_ref": "sandbox-21150"
}
```

```json
{
  "session_id": "b9bb2b1c-757a-41c5-a661-a9f45a6a9e77",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDgxNiwiaWF0IjoxNzkzMjU5OTE2LCJqdGkiOiIwN2ZjZTNiNi00ZjcxLTQzMDEtYmJiMy05MmJkYzg4NzNlYTUiLCJzaWQiOiJiOWJiMmIxYy03NTdhLTQxYzUtYTY2MS1hOWY0NWE2YTllNzcifQ.tuG7d9P7O6T16YgCKgVZ3S0bFeoS90mSjrK03LhnInI",
  "access_expires_at": "2026-10-29T08:00:16.500527316Z",
  "refresh_token": "CcrzWA5x9cpciAERQsBq3RHa3MMkwDTgNLHbmIoQdHM",
  "refresh_expires_at": "2026-11-28T07:45:16.500187473Z",
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
      "actor_id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T07:45:05.984796Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T07:45:06.950112Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "d50ccc42-13e3-40b6-b075-951c63846148",
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
  "device_ref": "sandbox-11396"
}
```

```json
{
  "challenge_id": "63f877b1-1acb-409e-9ee8-217bac9181a0",
  "expires_at": "2026-10-29T07:50:17.235742378Z",
  "resend_available_at": "2026-10-29T07:45:18.235742378Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "811920",
  "sent_at": "2026-10-29T07:45:17.237494389Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "63f877b1-1acb-409e-9ee8-217bac9181a0",
  "code": "811920",
  "device_ref": "sandbox-11396"
}
```

```json
{
  "session_id": "9af785d4-f3bd-4109-8f2c-59f84441a33e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDgxNywiaWF0IjoxNzkzMjU5OTE3LCJqdGkiOiJiODhhMjU0NS03NDk5LTQ1OWEtODk1Yy0yYzExYWIzNjRhNmIiLCJzaWQiOiI5YWY3ODVkNC1mM2JkLTQxMDktOGYyYy01OWY4NDQ0MWEzM2UifQ.HqsXnazSo4BBR-ntfE9-9NbXOQyU8HvOzG2tSI3vvvI",
  "access_expires_at": "2026-10-29T08:00:17.441030667Z",
  "refresh_token": "bUsg-8xQPHHbuTveb4JSAJngns1jJ1niYNJRCHfvKK4",
  "refresh_expires_at": "2026-11-28T07:45:17.440557506Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2d77556e-5a51-42ff-9fe8-0bd3c58cddd5",
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
  "last_heartbeat_at": "2026-10-29T07:44:48.378329Z",
  "last_location_at": "2026-10-29T07:44:48.378329Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2d77556e-5a51-42ff-9fe8-0bd3c58cddd5/handover` → **200**

```json
{
  "command_id": "3afd7d66-d14e-4c5a-9cc2-8c885d9d139c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2d77556e-5a51-42ff-9fe8-0bd3c58cddd5",
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
  "last_heartbeat_at": "2026-10-29T07:44:48.378329Z",
  "last_location_at": "2026-10-29T07:44:48.378329Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2d77556e-5a51-42ff-9fe8-0bd3c58cddd5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:45:17Z",
    "sequence": 1793259917995
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2d77556e-5a51-42ff-9fe8-0bd3c58cddd5",
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
  "last_heartbeat_at": "2026-10-29T07:45:18.032467Z",
  "last_location_at": "2026-10-29T07:45:18.032467Z",
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
  "command_id": "5e2d4215-cf84-4643-bd54-2bcdd3cac93b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:45:18Z",
    "sequence": 1793259918631
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "06c7c698-15fc-4c19-ae75-0e0e470ad604",
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
  "last_heartbeat_at": "2026-10-29T07:45:18.655216Z",
  "last_location_at": "2026-10-29T07:45:18.655216Z",
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
  "session_id": "d86b05ef-cf7c-4d7f-b755-312f090e0f4f",
  "subject": {
    "type": "STAFF",
    "id": "ff0cc1fe-4488-4e07-aa75-23877d14b8bb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBjYzFmZS00NDg4LTRlMDctYWE3NS0yMzg3N2QxNGI4YmIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA4MTksImlhdCI6MTc5MzI1OTkxOSwianRpIjoiMjU1Mzk3NTItNGI4ZC00ZDc4LTg2MjEtODIzZTVlMmUwNGI0Iiwic2lkIjoiZDg2YjA1ZWYtY2Y3Yy00ZDdmLWI3NTUtMzEyZjA5MGUwZjRmIn0.oxE2juNLVR7DzzDBKN2xBIgeG-kD3Eyvhcr1dlirbPo",
  "access_expires_at": "2026-10-29T08:00:19.163798235Z",
  "refresh_token": "t1DtphXKd4-VVgwwKIzmwdSGXE4un_2RGtl6oRQjnRU",
  "refresh_expires_at": "2026-10-29T19:45:19.163393836Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2395d171-049b-4574-9729-010566e940af",
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
  "id": "b60e7b71-8da1-4c36-adc0-7d7e7828f081",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:50:19.414491Z",
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
  "command_id": "45cbd789-4a5a-455e-8271-cf685cbfd8b9",
  "quote_id": "b60e7b71-8da1-4c36-adc0-7d7e7828f081",
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
  "id": "4d0a6e2c-14f2-466d-be2a-84dd6f1a6f4a",
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
  "created_at": "2026-10-29T07:45:19.81552Z",
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
    "id": "8f6914e0-2624-4e6d-acb7-82bf725d3202",
    "order_id": "4d0a6e2c-14f2-466d-be2a-84dd6f1a6f4a",
    "expires_at": "2026-10-29T07:45:34.819894Z",
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

`POST /api/driver/v1/offers/8f6914e0-2624-4e6d-acb7-82bf725d3202/accept` → **200**

```json
{
  "command_id": "ac4b44cf-c264-4026-963c-c6537563e231"
}
```

```json
{
  "id": "c5fdf1a2-1fed-45a9-911e-23338a044055",
  "order_id": "4d0a6e2c-14f2-466d-be2a-84dd6f1a6f4a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c1fabe65-7477-41a4-8f0b-c8c1682c8003",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c1fabe65-7477-41a4-8f0b-c8c1682c8003",
  "order_id": "4d0a6e2c-14f2-466d-be2a-84dd6f1a6f4a",
  "assignment_id": "c5fdf1a2-1fed-45a9-911e-23338a044055",
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

`POST /api/driver/v1/work-sessions/06c7c698-15fc-4c19-ae75-0e0e470ad604/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:45:21Z",
    "sequence": 1793259921586
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "06c7c698-15fc-4c19-ae75-0e0e470ad604",
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
  "last_heartbeat_at": "2026-10-29T07:45:21.074891Z",
  "last_location_at": "2026-10-29T07:45:21.074891Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c1fabe65-7477-41a4-8f0b-c8c1682c8003/arrive` → **200**

```json
{
  "command_id": "7406f56d-b31b-4902-b6af-bc38315ccf67",
  "expected_version": 0
}
```

```json
{
  "id": "c1fabe65-7477-41a4-8f0b-c8c1682c8003",
  "order_id": "4d0a6e2c-14f2-466d-be2a-84dd6f1a6f4a",
  "assignment_id": "c5fdf1a2-1fed-45a9-911e-23338a044055",
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
  "arrived_at": "2026-10-29T07:45:21.269849Z",
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

`POST /api/driver/v1/trips/c1fabe65-7477-41a4-8f0b-c8c1682c8003/start` → **200**

```json
{
  "command_id": "cb801d07-80f5-4af8-82ad-f6209a00e389",
  "expected_version": 1
}
```

```json
{
  "id": "c1fabe65-7477-41a4-8f0b-c8c1682c8003",
  "order_id": "4d0a6e2c-14f2-466d-be2a-84dd6f1a6f4a",
  "assignment_id": "c5fdf1a2-1fed-45a9-911e-23338a044055",
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
  "arrived_at": "2026-10-29T07:45:21.269849Z",
  "started_at": "2026-10-29T07:45:21.483602Z",
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

`POST /api/driver/v1/trips/c1fabe65-7477-41a4-8f0b-c8c1682c8003/complete` → **200**

```json
{
  "command_id": "d6505c48-5354-410a-b625-4ba41b3683a3",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:45:21Z",
  "cash_received": true
}
```

```json
{
  "id": "c1fabe65-7477-41a4-8f0b-c8c1682c8003",
  "order_id": "4d0a6e2c-14f2-466d-be2a-84dd6f1a6f4a",
  "assignment_id": "c5fdf1a2-1fed-45a9-911e-23338a044055",
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
  "arrived_at": "2026-10-29T07:45:21.269849Z",
  "started_at": "2026-10-29T07:45:21.483602Z",
  "completed_at": "2026-10-29T07:45:21.692473Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/4d0a6e2c-14f2-466d-be2a-84dd6f1a6f4a` → **200**

```json
{
  "id": "4d0a6e2c-14f2-466d-be2a-84dd6f1a6f4a",
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
    "id": "c5fdf1a2-1fed-45a9-911e-23338a044055",
    "order_id": "4d0a6e2c-14f2-466d-be2a-84dd6f1a6f4a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c1fabe65-7477-41a4-8f0b-c8c1682c8003",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:45:19.81552Z",
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
  "session_id": "2d77556e-5a51-42ff-9fe8-0bd3c58cddd5",
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
  "last_heartbeat_at": "2026-10-29T07:45:18.032467Z",
  "last_location_at": "2026-10-29T07:45:18.032467Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2d77556e-5a51-42ff-9fe8-0bd3c58cddd5/close` → **200**

```json
{
  "command_id": "fd03eb5c-8048-47c7-85b9-6728c24e9ef2",
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
  "session_id": "06c7c698-15fc-4c19-ae75-0e0e470ad604",
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
  "last_heartbeat_at": "2026-10-29T07:45:21.074891Z",
  "last_location_at": "2026-10-29T07:45:21.074891Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/06c7c698-15fc-4c19-ae75-0e0e470ad604/close` → **200**

```json
{
  "command_id": "8b213673-8bf0-41c5-8ae3-70551388a5be",
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

Done: terminal order 4d0a6e2c-14f2-466d-be2a-84dd6f1a6f4a by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15487"
}
```

```json
{
  "challenge_id": "3dd87702-3c3d-489c-ba27-a1e638ba41a6",
  "expires_at": "2026-10-29T07:50:26.054280019Z",
  "resend_available_at": "2026-10-29T07:45:27.054280019Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "030456",
  "sent_at": "2026-10-29T07:45:26.056325985Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3dd87702-3c3d-489c-ba27-a1e638ba41a6",
  "code": "030456",
  "device_ref": "sandbox-15487"
}
```

```json
{
  "session_id": "aa08f678-79cb-4471-9e8b-4c49e6a793a0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDgyNiwiaWF0IjoxNzkzMjU5OTI2LCJqdGkiOiJiYTc0ZmUwYy0zMzEwLTQzYjAtOTM3ZC1jYWYwYTAyMmY5NTUiLCJzaWQiOiJhYTA4ZjY3OC03OWNiLTQ0NzEtOWU4Yi00YzQ5ZTZhNzkzYTAifQ.rS20TjgRbOA4ZKjzq-YUEdZWX4QXsaJH3L8WzEzBMu8",
  "access_expires_at": "2026-10-29T08:00:26.279861783Z",
  "refresh_token": "vnWYv7Hz64G5wINVPvPH4pY-W8Htpy_Rmex89gAtfm4",
  "refresh_expires_at": "2026-11-28T07:45:26.27942168Z",
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
  "device_ref": "sandbox-7247"
}
```

```json
{
  "challenge_id": "30243936-8fd0-45ca-b174-70a7077f53b6",
  "expires_at": "2026-10-29T07:50:26.652065686Z",
  "resend_available_at": "2026-10-29T07:45:27.652065686Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "618180",
  "sent_at": "2026-10-29T07:45:26.653838777Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30243936-8fd0-45ca-b174-70a7077f53b6",
  "code": "618180",
  "device_ref": "sandbox-7247"
}
```

```json
{
  "session_id": "15e8c71d-b0aa-4e36-8207-1d2cf5c0d8f2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDgyNiwiaWF0IjoxNzkzMjU5OTI2LCJqdGkiOiJjMzE5ZDM4YS03NzA2LTRjNTktYmI0ZS1jYzBmM2UzYjQ5NzEiLCJzaWQiOiIxNWU4YzcxZC1iMGFhLTRlMzYtODIwNy0xZDJjZjVjMGQ4ZjIifQ.fhvVE6z_O31wEhFKIUlGjnkdn747jrPtt-_e74F8hQA",
  "access_expires_at": "2026-10-29T08:00:26.870903689Z",
  "refresh_token": "QbkpqR44tvpQ3WPydIwzMh4xpcV9DGmaxW-Xu9imVx4",
  "refresh_expires_at": "2026-11-28T07:45:26.870570785Z",
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
  "device_ref": "sandbox-23187"
}
```

```json
{
  "challenge_id": "b2d678cb-cdd4-44f0-ae20-1d44e1130ea7",
  "expires_at": "2026-10-29T07:50:27.229680756Z",
  "resend_available_at": "2026-10-29T07:45:28.229680756Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "747763",
  "sent_at": "2026-10-29T07:45:27.231663072Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b2d678cb-cdd4-44f0-ae20-1d44e1130ea7",
  "code": "747763",
  "device_ref": "sandbox-23187"
}
```

```json
{
  "session_id": "ff889b32-e9ab-4b1c-8afc-eef3efe0000f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDgyNywiaWF0IjoxNzkzMjU5OTI3LCJqdGkiOiJhMWVjNWY2NS03YTk3LTQzY2EtODEzZS1iMTBkYjVmMzM0NjUiLCJzaWQiOiJmZjg4OWIzMi1lOWFiLTRiMWMtOGFmYy1lZWYzZWZlMDAwMGYifQ.O4Hxz8NmBCayY512dz1hsahUXVQi2im2mSK-dP8ETjo",
  "access_expires_at": "2026-10-29T08:00:27.518024199Z",
  "refresh_token": "WsdP0R8QnOoi74q5nk9ihs2rMD9urV9VyNi3I1Se0ug",
  "refresh_expires_at": "2026-11-28T07:45:27.517610405Z",
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
  "phone": "+380695633889",
  "device_ref": "sandbox-15278"
}
```

```json
{
  "challenge_id": "1a45c069-4945-411c-bde7-e1c046b932c1",
  "expires_at": "2026-10-29T07:50:27.879527496Z",
  "resend_available_at": "2026-10-29T07:45:28.879527496Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380695633889` → **200**

```json
{
  "phone": "+380695633889",
  "audience": "CLIENT",
  "code": "306326",
  "sent_at": "2026-10-29T07:45:27.881251894Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a45c069-4945-411c-bde7-e1c046b932c1",
  "code": "306326",
  "device_ref": "sandbox-15278"
}
```

```json
{
  "session_id": "fb50a5c5-a319-4382-9407-1188a70d0b10",
  "subject": {
    "type": "CLIENT",
    "id": "54a01ed5-d6a6-4dc4-94c0-192830ada606"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NGEwMWVkNS1kNmE2LTRkYzQtOTRjMC0xOTI4MzBhZGE2MDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwODI4LCJpYXQiOjE3OTMyNTk5MjgsImp0aSI6IjQ2NzMyM2JmLWFiMGYtNDlhNS1hMGI4LTYyZmYzNGVkNzIxYyIsInNpZCI6ImZiNTBhNWM1LWEzMTktNDM4Mi05NDA3LTExODhhNzBkMGIxMCJ9.nFP8tvO9XMHU1fLXqUOPPL6tflfoyiDQfTFtsoAMbRk",
  "access_expires_at": "2026-10-29T08:00:28.090930692Z",
  "refresh_token": "hq2Jq37sd51i51W_Y4H6ZAaXXRBzYvV_O7DOxkNFCDk",
  "refresh_expires_at": "2026-11-28T07:45:28.090513082Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0ad753d3-385f-4869-955b-dfda9b760cf9",
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
  "id": "d1abbf64-6240-46cf-ab81-e2fdd1d03847",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:50:28.308068Z",
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
  "command_id": "df28f93d-d785-4eea-992e-2dbfa60601b8",
  "quote_id": "d1abbf64-6240-46cf-ab81-e2fdd1d03847",
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
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:45:28.514307Z",
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
  "blizz_dispatch_excluded_total": 8,
  "blizz_sms_sent_total": 69
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 16
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 8.96534584
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 3.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 17
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.117154362
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
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 62.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/10eed7b3-ac0c-4e64-a0c0-77161d0d35ec` → **200**

```json
{
  "id": "10eed7b3-ac0c-4e64-a0c0-77161d0d35ec",
  "short_number": 27,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "54a01ed5-d6a6-4dc4-94c0-192830ada606",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:45:28.514307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```
