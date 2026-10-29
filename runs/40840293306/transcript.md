# Sandbox transcript (2026-10-29T08:11:38Z, a4f8124)

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
  "correlation_id": "fd9a287d-3ff6-442e-8044-2c6d7fad24f0"
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
  "session_id": "9e72f8bb-d3f6-4c9b-80fa-e70f864edb57",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI0MDQsImlhdCI6MTc5MzI2MTUwNCwianRpIjoiZmYwMGUwYzgtMjE5My00MmRjLTlkOTYtMjUxZTQxNGRjNWYwIiwic2lkIjoiOWU3MmY4YmItZDNmNi00YzliLTgwZmEtZTcwZjg2NGVkYjU3In0.uLmr12zlgVj7cood9DZM-vDLNtSjZPmY1s8AByJh7jc",
  "access_expires_at": "2026-10-29T08:26:44.032940781Z",
  "refresh_token": "d8L3cld29UoMFq1bh4CKHH156SGvOJMFdEwzuQZUChI",
  "refresh_expires_at": "2026-10-29T20:11:44.031190842Z",
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
  "session_id": "5350c2a3-9afc-4640-905e-07d110a0716f",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI0MDUsImlhdCI6MTc5MzI2MTUwNSwianRpIjoiNGRjZWVkNDItNmIwOS00OWU5LWFjMjItMTgyNzE5NTAxODlhIiwic2lkIjoiNTM1MGMyYTMtOWFmYy00NjQwLTkwNWUtMDdkMTEwYTA3MTZmIn0.i42v_hRCf7MyYy6ML5F1VIpif08WflBsie-eKu1uqvA",
  "access_expires_at": "2026-10-29T08:26:45.082234576Z",
  "refresh_token": "l5Z8sOMWe7A1ogoLKQVG4tP5Kvpz0XU2-om291ncyHc",
  "refresh_expires_at": "2026-10-29T20:11:45.081507762Z",
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
  "device_ref": "sandbox-31130"
}
```

```json
{
  "challenge_id": "96a53c67-0edb-4fbc-89f5-08064c627253",
  "expires_at": "2026-10-29T08:16:45.480259076Z",
  "resend_available_at": "2026-10-29T08:11:46.480259076Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "673291",
  "sent_at": "2026-10-29T08:11:45.487574924Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "96a53c67-0edb-4fbc-89f5-08064c627253",
  "code": "673291",
  "device_ref": "sandbox-31130"
}
```

```json
{
  "session_id": "edc5bf76-33ee-4ccf-b224-cc81dc1b1d48",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjQwNSwiaWF0IjoxNzkzMjYxNTA1LCJqdGkiOiI2Mzk0OWU2NC02MDZjLTQyZGYtYWJmYy1mZDU1MzhkYjYyZGUiLCJzaWQiOiJlZGM1YmY3Ni0zM2VlLTRjY2YtYjIyNC1jYzgxZGMxYjFkNDgifQ.sRStTbwURF_qLbj5gnb0qavLwTJSvQfci0SPWzaz2A8",
  "access_expires_at": "2026-10-29T08:26:45.70940487Z",
  "refresh_token": "wIUFrfeIPCaGpAPK_UR1RJik5AML2uiRtQsYJi34xRA",
  "refresh_expires_at": "2026-11-28T08:11:45.708567007Z",
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
  "command_id": "9de94fce-ef58-40a5-b9ea-fef9c1925315",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:11:46Z",
    "sequence": 1793261506826
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d1521941-cc40-483d-913b-21dfe090a35a",
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
  "last_heartbeat_at": "2026-10-29T08:11:46.169234Z",
  "last_location_at": "2026-10-29T08:11:46.169234Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634756309",
  "device_ref": "sandbox-16339"
}
```

```json
{
  "challenge_id": "bea3be37-9228-40ad-a07c-3a5020354955",
  "expires_at": "2026-10-29T08:16:46.373354915Z",
  "resend_available_at": "2026-10-29T08:11:47.373354915Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634756309` → **200**

```json
{
  "phone": "+380634756309",
  "audience": "CLIENT",
  "code": "657364",
  "sent_at": "2026-10-29T08:11:46.37846168Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bea3be37-9228-40ad-a07c-3a5020354955",
  "code": "657364",
  "device_ref": "sandbox-16339"
}
```

```json
{
  "session_id": "5d12367c-b02d-4fa4-9fe5-63d86e378dc0",
  "subject": {
    "type": "CLIENT",
    "id": "6bd2db4f-29c4-4a0b-9689-b43affe303de"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmQyZGI0Zi0yOWM0LTRhMGItOTY4OS1iNDNhZmZlMzAzZGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNDA2LCJpYXQiOjE3OTMyNjE1MDYsImp0aSI6IjE4ODFiYzk1LTVhYWEtNDA5NS1iNTg5LWZiNzU5MzlkNDM0MyIsInNpZCI6IjVkMTIzNjdjLWIwMmQtNGZhNC05ZmU1LTYzZDg2ZTM3OGRjMCJ9.BhI_o53i061FQYiutXccEOsdyEK55jXD-4yjpOMrCb8",
  "access_expires_at": "2026-10-29T08:26:46.623877688Z",
  "refresh_token": "bd5-t5A-ZgDghCo39dwc5hdbq3KZZwDqZuYv63U11FU",
  "refresh_expires_at": "2026-11-28T08:11:46.623114803Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7a148378-a9f6-4ffc-ae21-f8c53837e4d9",
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
  "id": "cd37ff53-f7de-4ce4-b5bf-986c94ee4d5f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:16:46.828006Z",
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
  "command_id": "7aab59ee-d0c0-4887-9c2f-65bdd46b45bd",
  "quote_id": "cd37ff53-f7de-4ce4-b5bf-986c94ee4d5f",
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
  "id": "39d3fdef-6a63-4aad-9b07-b3aea01b8534",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd2db4f-29c4-4a0b-9689-b43affe303de",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:11:47.070091Z",
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
    "id": "a78b313b-f63e-4d91-a1c2-b6e1cb103015",
    "order_id": "39d3fdef-6a63-4aad-9b07-b3aea01b8534",
    "expires_at": "2026-10-29T08:12:02.077881Z",
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

`POST /api/driver/v1/offers/a78b313b-f63e-4d91-a1c2-b6e1cb103015/accept` → **200**

```json
{
  "command_id": "9aad755b-f49f-490d-aa8c-eaa9b257bdee"
}
```

```json
{
  "id": "f59c631d-7023-4317-93d9-79f441a8c9c9",
  "order_id": "39d3fdef-6a63-4aad-9b07-b3aea01b8534",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "723ca7a9-b9f2-4356-8e8a-646f79ec7f14",
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
  "command_id": "eca51c85-8d84-4151-b784-1c5a5b4c314c",
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
  "changed_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T08:11:47.886032917Z"
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
  "id": "723ca7a9-b9f2-4356-8e8a-646f79ec7f14",
  "order_id": "39d3fdef-6a63-4aad-9b07-b3aea01b8534",
  "assignment_id": "f59c631d-7023-4317-93d9-79f441a8c9c9",
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

`POST /api/driver/v1/work-sessions/d1521941-cc40-483d-913b-21dfe090a35a/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:11:48Z",
    "sequence": 1793261508483
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d1521941-cc40-483d-913b-21dfe090a35a",
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
  "last_heartbeat_at": "2026-10-29T08:11:48.505722Z",
  "last_location_at": "2026-10-29T08:11:48.505722Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/723ca7a9-b9f2-4356-8e8a-646f79ec7f14/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "73a088db-a3f3-4b69-b002-a13af53c04f9",
  "expected_version": 0
}
```

```json
{
  "id": "723ca7a9-b9f2-4356-8e8a-646f79ec7f14",
  "order_id": "39d3fdef-6a63-4aad-9b07-b3aea01b8534",
  "assignment_id": "f59c631d-7023-4317-93d9-79f441a8c9c9",
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
  "arrived_at": "2026-10-29T08:11:48.705558Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/723ca7a9-b9f2-4356-8e8a-646f79ec7f14/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "12ebc287-ab47-4f31-b020-77cfb5669a4f",
  "expected_version": 1
}
```

```json
{
  "id": "723ca7a9-b9f2-4356-8e8a-646f79ec7f14",
  "order_id": "39d3fdef-6a63-4aad-9b07-b3aea01b8534",
  "assignment_id": "f59c631d-7023-4317-93d9-79f441a8c9c9",
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
  "arrived_at": "2026-10-29T08:11:48.705558Z",
  "started_at": "2026-10-29T08:11:48.904815Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/723ca7a9-b9f2-4356-8e8a-646f79ec7f14/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "709fc8c5-5f28-4066-b68e-23de5ccc28ac",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:11:49Z",
  "cash_received": true
}
```

```json
{
  "id": "723ca7a9-b9f2-4356-8e8a-646f79ec7f14",
  "order_id": "39d3fdef-6a63-4aad-9b07-b3aea01b8534",
  "assignment_id": "f59c631d-7023-4317-93d9-79f441a8c9c9",
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
  "arrived_at": "2026-10-29T08:11:48.705558Z",
  "started_at": "2026-10-29T08:11:48.904815Z",
  "completed_at": "2026-10-29T08:11:49.107057Z",
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
  "session_id": "d1521941-cc40-483d-913b-21dfe090a35a",
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
  "last_heartbeat_at": "2026-10-29T08:11:48.505722Z",
  "last_location_at": "2026-10-29T08:11:48.505722Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d1521941-cc40-483d-913b-21dfe090a35a/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "bc5ca515-5b9e-44d9-b6e9-057f5cd9cb13",
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
  "command_id": "a0f87bc4-e5e0-4daa-b6a2-4f0576e8f545",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:11:49Z",
    "sequence": 1793261509691
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
  "correlation_id": "8c370256-9f09-4804-85a8-97fc9f1e5b95",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "8f58319f-8646-434c-a32e-a23b5fa4d2bd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:11:49Z",
    "sequence": 1793261509890
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5741dc17-430c-4348-9950-6af1e6ceb141",
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
  "last_heartbeat_at": "2026-10-29T08:11:49.90812Z",
  "last_location_at": "2026-10-29T08:11:49.90812Z",
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
  "changed_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T08:11:47.886033Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "7e0fa4dd-81fc-421b-bc9d-dbb471ed0b33",
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
  "changed_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T08:11:50.281550139Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5741dc17-430c-4348-9950-6af1e6ceb141",
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
  "last_heartbeat_at": "2026-10-29T08:11:49.90812Z",
  "last_location_at": "2026-10-29T08:11:49.90812Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5741dc17-430c-4348-9950-6af1e6ceb141/close` → **200**

```json
{
  "command_id": "d6609ba2-e9ac-4b8a-b2bb-dde276faebd8",
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
  "session_id": "23a8ec50-e1f3-4d12-a294-91c4955867e5",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI0MTEsImlhdCI6MTc5MzI2MTUxMSwianRpIjoiYzQ3MTYyYjAtODBmNS00MjBiLWE4MGQtZGUzYmFjNmRhNDk1Iiwic2lkIjoiMjNhOGVjNTAtZTFmMy00ZDEyLWEyOTQtOTFjNDk1NTg2N2U1In0.5DXXzuwFY-xdfbcOTKmf_d9pAMz4mqLvD6gz1UQiTpc",
  "access_expires_at": "2026-10-29T08:26:51.104078082Z",
  "refresh_token": "EauAdU7NiTbpJgvrTcZb8P7lncXbW5fXngO31VagHM4",
  "refresh_expires_at": "2026-10-29T20:11:51.10350876Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "7ce862ad-50aa-46bc-ba0f-7e75dcb90e17",
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
  "id": "d0c070f5-99bb-4954-91e9-4ee2ebe6d4fc",
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
  "created_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "created_at": "2026-10-29T08:11:51.29651Z",
  "updated_at": "2026-10-29T08:11:51.29651Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632173831",
  "device_ref": "sandbox-24123"
}
```

```json
{
  "challenge_id": "4bfc2064-dc60-48d5-83c7-31cc775e2fde",
  "expires_at": "2026-10-29T08:16:51.527255035Z",
  "resend_available_at": "2026-10-29T08:11:52.527255035Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632173831` → **200**

```json
{
  "phone": "+380632173831",
  "audience": "CLIENT",
  "code": "899699",
  "sent_at": "2026-10-29T08:11:51.530344032Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4bfc2064-dc60-48d5-83c7-31cc775e2fde",
  "code": "899699",
  "device_ref": "sandbox-24123"
}
```

```json
{
  "session_id": "6fd7d538-ab3f-4bd6-933a-b28dabf1120f",
  "subject": {
    "type": "CLIENT",
    "id": "ee3b2e16-c3a3-4dee-8e2f-2451c1e8a81c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZTNiMmUxNi1jM2EzLTRkZWUtOGUyZi0yNDUxYzFlOGE4MWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNDExLCJpYXQiOjE3OTMyNjE1MTEsImp0aSI6IjY2MDY2ZThkLTE3MTAtNDliMi1iMzQwLWFhNjQ2YWY4MDI2OSIsInNpZCI6IjZmZDdkNTM4LWFiM2YtNGJkNi05MzNhLWIyOGRhYmYxMTIwZiJ9.GojL6ZJDWqHgZkxh-cQvEl5uZHTOa2SJ8xcO-7z2h5c",
  "access_expires_at": "2026-10-29T08:26:51.742063976Z",
  "refresh_token": "v2-7_kuAdaDINs2lNhhkn9kdBhpNujlps0Zqg3j8g5c",
  "refresh_expires_at": "2026-11-28T08:11:51.741569211Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380632173831` → **200**

```json
{
  "client_id": "ee3b2e16-c3a3-4dee-8e2f-2451c1e8a81c"
}
```

`POST /api/admin/v1/rider-wallets/ee3b2e16-c3a3-4dee-8e2f-2451c1e8a81c/top-ups` → **201**

```json
{
  "command_id": "6f554a17-f021-4093-a23f-c6a2ff860d4c",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "ee3b2e16-c3a3-4dee-8e2f-2451c1e8a81c",
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
      "id": "96734d07-f3c4-4c15-9ae3-fa07d8c6482d",
      "at": "2026-10-29T08:11:52.113549Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b986bb87-f75d-4442-97ac-8135f84b4511",
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
  "id": "94354f93-2768-49bc-b930-617d91d00289",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:16:52.313205Z",
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
      "id": "d0c070f5-99bb-4954-91e9-4ee2ebe6d4fc",
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
  "device_ref": "sandbox-30597"
}
```

```json
{
  "challenge_id": "16a4430a-05dd-4010-85f5-b9927453e69b",
  "expires_at": "2026-10-29T08:16:52.505425185Z",
  "resend_available_at": "2026-10-29T08:11:53.505425185Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "494040",
  "sent_at": "2026-10-29T08:11:52.508007585Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "16a4430a-05dd-4010-85f5-b9927453e69b",
  "code": "494040",
  "device_ref": "sandbox-30597"
}
```

```json
{
  "session_id": "693c5246-75ac-4ea2-8b17-a2e408d10553",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjQxMiwiaWF0IjoxNzkzMjYxNTEyLCJqdGkiOiJlMzIyMTRmOC03OWNmLTQzZWUtYjg3ZS04OTM3ODM3MzFiZDMiLCJzaWQiOiI2OTNjNTI0Ni03NWFjLTRlYTItOGIxNy1hMmU0MDhkMTA1NTMifQ.MUJSKEr3ABfOK61S-h4LML_CPwOrc5KTTNQ_ijaYM68",
  "access_expires_at": "2026-10-29T08:26:52.717936846Z",
  "refresh_token": "1enVCH5kusW6VoZ2NWANTO9xxwODWq2XVJqdhL_IB6M",
  "refresh_expires_at": "2026-11-28T08:11:52.71744733Z",
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
  "command_id": "5ced54ee-fa85-4acd-b826-4cdabe1a830f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:11:53Z",
    "sequence": 1793261513694
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "132795dc-e10f-4adb-86b6-68efb7cadfbd",
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
  "last_heartbeat_at": "2026-10-29T08:11:53.08752Z",
  "last_location_at": "2026-10-29T08:11:53.08752Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c149b97b-8610-4a4c-a8f0-93de8966d15d",
  "quote_id": "94354f93-2768-49bc-b930-617d91d00289",
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
  "id": "11a30086-8882-4339-be9d-6bef37edee8e",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee3b2e16-c3a3-4dee-8e2f-2451c1e8a81c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:11:53.285359Z",
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
  "client_id": "ee3b2e16-c3a3-4dee-8e2f-2451c1e8a81c",
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
      "id": "96734d07-f3c4-4c15-9ae3-fa07d8c6482d",
      "at": "2026-10-29T08:11:52.113549Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "3a4258dd-3209-4d24-8c44-4c5661453235",
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
    "id": "b90d311e-dddb-4f1a-8bc9-a4865290399e",
    "order_id": "11a30086-8882-4339-be9d-6bef37edee8e",
    "expires_at": "2026-10-29T08:12:08.291231Z",
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

`POST /api/driver/v1/offers/b90d311e-dddb-4f1a-8bc9-a4865290399e/accept` → **200**

```json
{
  "command_id": "daa3272f-a0d3-40b2-98b1-bf775a653a12"
}
```

```json
{
  "id": "207abf29-7d3b-49c5-88ac-8f161f9f60e4",
  "order_id": "11a30086-8882-4339-be9d-6bef37edee8e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3579941e-f8b7-4059-8854-80c0d66da6dc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3579941e-f8b7-4059-8854-80c0d66da6dc",
  "order_id": "11a30086-8882-4339-be9d-6bef37edee8e",
  "assignment_id": "207abf29-7d3b-49c5-88ac-8f161f9f60e4",
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

`POST /api/driver/v1/work-sessions/132795dc-e10f-4adb-86b6-68efb7cadfbd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:11:54Z",
    "sequence": 1793261514218
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "132795dc-e10f-4adb-86b6-68efb7cadfbd",
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
  "last_heartbeat_at": "2026-10-29T08:11:54.235785Z",
  "last_location_at": "2026-10-29T08:11:54.235785Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3579941e-f8b7-4059-8854-80c0d66da6dc/arrive` → **200**

```json
{
  "command_id": "f9147b37-167f-4e81-8926-58aecdf9a896",
  "expected_version": 0
}
```

```json
{
  "id": "3579941e-f8b7-4059-8854-80c0d66da6dc",
  "order_id": "11a30086-8882-4339-be9d-6bef37edee8e",
  "assignment_id": "207abf29-7d3b-49c5-88ac-8f161f9f60e4",
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
  "arrived_at": "2026-10-29T08:11:54.420166Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3579941e-f8b7-4059-8854-80c0d66da6dc/start` → **200**

```json
{
  "command_id": "fb798660-c1f2-4692-9f37-2d7d23969ee7",
  "expected_version": 1
}
```

```json
{
  "id": "3579941e-f8b7-4059-8854-80c0d66da6dc",
  "order_id": "11a30086-8882-4339-be9d-6bef37edee8e",
  "assignment_id": "207abf29-7d3b-49c5-88ac-8f161f9f60e4",
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
  "arrived_at": "2026-10-29T08:11:54.420166Z",
  "started_at": "2026-10-29T08:11:54.616014Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/3579941e-f8b7-4059-8854-80c0d66da6dc/complete` → **200**

```json
{
  "command_id": "91137c25-7780-4cac-a4ca-ec4c0c9d6648",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:11:54Z",
  "cash_received": true
}
```

```json
{
  "id": "3579941e-f8b7-4059-8854-80c0d66da6dc",
  "order_id": "11a30086-8882-4339-be9d-6bef37edee8e",
  "assignment_id": "207abf29-7d3b-49c5-88ac-8f161f9f60e4",
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
  "arrived_at": "2026-10-29T08:11:54.420166Z",
  "started_at": "2026-10-29T08:11:54.616014Z",
  "completed_at": "2026-10-29T08:11:54.825913Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "ee3b2e16-c3a3-4dee-8e2f-2451c1e8a81c",
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
      "id": "ab997d3d-2f9e-4cfe-966a-8d8941129986",
      "at": "2026-10-29T08:11:55.737269Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "11a30086-8882-4339-be9d-6bef37edee8e"
    },
    {
      "id": "96734d07-f3c4-4c15-9ae3-fa07d8c6482d",
      "at": "2026-10-29T08:11:52.113549Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/d0c070f5-99bb-4954-91e9-4ee2ebe6d4fc/archive` → **200**

```json
{
  "command_id": "85ccdd96-d687-4c90-8983-1e8c5641247c",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "d0c070f5-99bb-4954-91e9-4ee2ebe6d4fc",
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
  "created_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "created_at": "2026-10-29T08:11:51.29651Z",
  "updated_at": "2026-10-29T08:11:58.201004Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "132795dc-e10f-4adb-86b6-68efb7cadfbd",
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
  "last_heartbeat_at": "2026-10-29T08:11:54.235785Z",
  "last_location_at": "2026-10-29T08:11:54.235785Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/132795dc-e10f-4adb-86b6-68efb7cadfbd/close` → **200**

```json
{
  "command_id": "39bd2110-fcdf-4983-8f08-0ff8afffe50d",
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

Done: order 11a30086-8882-4339-be9d-6bef37edee8e.

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
  "session_id": "0abebedb-edcc-407a-a1bd-603ec1f853ff",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI0MTgsImlhdCI6MTc5MzI2MTUxOCwianRpIjoiMjY4Yzc1MjQtYjBlYy00Mzk3LThlZGQtYjQ1MTgzYTU0MDJlIiwic2lkIjoiMGFiZWJlZGItZWRjYy00MDdhLWExYmQtNjAzZWMxZjg1M2ZmIn0.e4zsT1pnPyuLqinZGLLMcpPq-7U5ABHeiGin3vQwEBY",
  "access_expires_at": "2026-10-29T08:26:58.989138442Z",
  "refresh_token": "q7Ta8i2ezUwzAcf6WEMNBlPw94TkriWcguELgr_SUXk",
  "refresh_expires_at": "2026-10-29T20:11:58.988632567Z",
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
  "command_id": "dfdde7b0-2fd6-47af-8a74-2838f06a0ca3",
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
  "session_id": "795da390-8735-416f-88b9-fde45fadbbff",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI0MTksImlhdCI6MTc5MzI2MTUxOSwianRpIjoiNGQ1YjZiZGQtMDc0OC00NzM1LWFiYjMtYmJmNzgwMmI3OGRlIiwic2lkIjoiNzk1ZGEzOTAtODczNS00MTZmLTg4YjktZmRlNDVmYWRiYmZmIn0.-gHPlxbcuZEQcCM6W2Vy7VdDDMklcZ7scfgM0yyg96o",
  "access_expires_at": "2026-10-29T08:26:59.75797523Z",
  "refresh_token": "LFJ-KDXeohzPT1WAVP1DVbwgO7Rqvmg1Ox9QBmietFc",
  "refresh_expires_at": "2026-10-29T20:11:59.757530643Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2906727555",
    "linkedid": "1730052700.2906727555",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675530979"
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
    "id": "1730052700.2906727555",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "22492717-8d65-457b-a484-ba0fe722f408",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380675530979",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T08:11:59.935654Z",
      "answered_at": null,
      "ended_at": "2026-10-29T08:11:59.955843Z",
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
    "id": "1730052600.1933617867",
    "linkedid": "1730052600.1933617867",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675530979"
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
      "id": "fc489761-c66f-4da2-a2c7-c576d8fcb01c",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675530979",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T08:12:00.165105Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/fc489761-c66f-4da2-a2c7-c576d8fcb01c/answer` → **200**

```json
{
  "command_id": "d62ce2a2-e358-437a-8102-4f66df1fa90d"
}
```

```json
{
  "id": "fc489761-c66f-4da2-a2c7-c576d8fcb01c",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675530979",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "order_ids": [],
  "started_at": "2026-10-29T08:12:00.165105Z",
  "answered_at": "2026-10-29T08:12:00.485057Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1933617867",
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
    "id": "1730052600.1933617867",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "fc489761-c66f-4da2-a2c7-c576d8fcb01c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675530979",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "order_ids": [],
      "started_at": "2026-10-29T08:12:00.165105Z",
      "answered_at": "2026-10-29T08:12:00.485057Z",
      "ended_at": "2026-10-29T08:12:00.750762Z",
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
      "id": "fc489761-c66f-4da2-a2c7-c576d8fcb01c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675530979",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "order_ids": [],
      "started_at": "2026-10-29T08:12:00.165105Z",
      "answered_at": "2026-10-29T08:12:00.485057Z",
      "ended_at": "2026-10-29T08:12:00.750762Z",
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
      "id": "fc489761-c66f-4da2-a2c7-c576d8fcb01c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675530979",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "order_ids": [],
      "started_at": "2026-10-29T08:12:00.165105Z",
      "answered_at": "2026-10-29T08:12:00.485057Z",
      "ended_at": "2026-10-29T08:12:00.750762Z",
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
      "id": "fc489761-c66f-4da2-a2c7-c576d8fcb01c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675530979",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "order_ids": [],
      "started_at": "2026-10-29T08:12:00.165105Z",
      "answered_at": "2026-10-29T08:12:00.485057Z",
      "ended_at": "2026-10-29T08:12:00.750762Z",
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
      "id": "fc489761-c66f-4da2-a2c7-c576d8fcb01c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675530979",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "order_ids": [],
      "started_at": "2026-10-29T08:12:00.165105Z",
      "answered_at": "2026-10-29T08:12:00.485057Z",
      "ended_at": "2026-10-29T08:12:00.750762Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T08:12:07.500533Z"
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
      "id": "fc489761-c66f-4da2-a2c7-c576d8fcb01c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675530979",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "order_ids": [],
      "started_at": "2026-10-29T08:12:00.165105Z",
      "answered_at": "2026-10-29T08:12:00.485057Z",
      "ended_at": "2026-10-29T08:12:00.750762Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T08:12:07.500533Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/fc489761-c66f-4da2-a2c7-c576d8fcb01c/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/fc489761-c66f-4da2-a2c7-c576d8fcb01c/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=fc489761-c66f-4da2-a2c7-c576d8fcb01c` → **200**

```json
{
  "changes": [
    {
      "id": "b27ebcce-f553-494c-a6d7-4cee763e98bd",
      "occurred_at": "2026-10-29T08:12:09.941133Z",
      "actor_type": "STAFF",
      "actor_id": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "fc489761-c66f-4da2-a2c7-c576d8fcb01c",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"1dc036e0-0c8b-403c-80a1-050cff4d54fc\", \"order_ids\": []}",
      "correlation_id": "3ec2e96c-8f21-49d6-9b6d-cdb73609d529"
    },
    {
      "id": "bfbb9946-a38f-4883-aa38-291d3964c63b",
      "occurred_at": "2026-10-29T08:12:09.913428Z",
      "actor_type": "STAFF",
      "actor_id": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "fc489761-c66f-4da2-a2c7-c576d8fcb01c",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"1dc036e0-0c8b-403c-80a1-050cff4d54fc\", \"order_ids\": []}",
      "correlation_id": "6d4a7410-cd98-4791-b5e6-65e2171295cd"
    }
  ]
}
```

Done: call fc489761-c66f-4da2-a2c7-c576d8fcb01c recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30819"
}
```

```json
{
  "challenge_id": "f768f9af-feac-47f7-a304-77e7ee5b303b",
  "expires_at": "2026-10-29T08:17:10.15901753Z",
  "resend_available_at": "2026-10-29T08:12:11.15901753Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "821494",
  "sent_at": "2026-10-29T08:12:10.162094237Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f768f9af-feac-47f7-a304-77e7ee5b303b",
  "code": "821494",
  "device_ref": "sandbox-30819"
}
```

```json
{
  "session_id": "277fe8b6-fce0-4391-a4d6-ad8aa5d53c26",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjQzMCwiaWF0IjoxNzkzMjYxNTMwLCJqdGkiOiJhMjhhZDcyMS03NmMxLTRlYWEtOWFmYi0yYzAwN2E1MjQzNGIiLCJzaWQiOiIyNzdmZThiNi1mY2UwLTQzOTEtYTRkNi1hZDhhYTVkNTNjMjYifQ.h2KhVZtogfPlSSQnKo5zU3YutGJNPypfsNn2akM7_to",
  "access_expires_at": "2026-10-29T08:27:10.367139833Z",
  "refresh_token": "BaJsfK9OS1JmcqQcf7FDTNPLkFJhWtyavlrG6rn0yZE",
  "refresh_expires_at": "2026-11-28T08:12:10.366657343Z",
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
  "command_id": "15992c97-99a7-4373-b8e3-fd5cda981a15",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:12:10Z",
    "sequence": 1793261530735
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e072f79-5ec9-4b3d-a3fc-4de58b5b3e7f",
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
  "last_heartbeat_at": "2026-10-29T08:12:10.75339Z",
  "last_location_at": "2026-10-29T08:12:10.75339Z",
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
  "session_id": "a4f65ecb-06bb-42fa-b450-3b71a4d4ceef",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI0MzEsImlhdCI6MTc5MzI2MTUzMSwianRpIjoiYzZjMDRjYmEtYjdlZi00NDJlLThkNjEtM2NjODJkN2VmZGIxIiwic2lkIjoiYTRmNjVlY2ItMDZiYi00MmZhLWI0NTAtM2I3MWE0ZDRjZWVmIn0.RVtyae5uYoaM7UmecSIAZ2rg94a54swd0mDhx54VycY",
  "access_expires_at": "2026-10-29T08:27:11.142534569Z",
  "refresh_token": "SFxhQM6icTWEcCMspTuuTRYwdhthJPdAaPeQslQig2c",
  "refresh_expires_at": "2026-10-29T20:12:11.142036105Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "78aa2418-6d67-444b-84c7-224afc642760",
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
  "id": "52d001b7-95f8-40fb-be3d-8eeba2105b8c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:17:11.326576Z",
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
  "command_id": "eef65d9e-6026-4402-b9bf-533ddabc9c82",
  "quote_id": "52d001b7-95f8-40fb-be3d-8eeba2105b8c",
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
    "phone": "+380678265612"
  }
}
```

```json
{
  "id": "31835055-31c5-4661-a366-7d1209b5f59f",
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
  "created_at": "2026-10-29T08:12:11.535086Z",
  "caller": {
    "name": "Олена",
    "phone": "+380678265612"
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
    "id": "842dfbed-0af5-48e0-af5a-326c93bfe445",
    "order_id": "31835055-31c5-4661-a366-7d1209b5f59f",
    "expires_at": "2026-10-29T08:12:26.539139Z",
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

`POST /api/driver/v1/offers/842dfbed-0af5-48e0-af5a-326c93bfe445/accept` → **200**

```json
{
  "command_id": "1ea16843-8264-4592-8d91-0da384a70543"
}
```

```json
{
  "id": "d6ae6193-778f-46a0-8dd1-5f65a34c57f4",
  "order_id": "31835055-31c5-4661-a366-7d1209b5f59f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ba45bcca-cb33-4a78-980d-40a529b2b39c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380678265612` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678265612` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678265612` → **200**

```json
[
  {
    "phone": "+380678265612",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T08:12:13.629491707Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678265612` → **200**

```json
[
  {
    "phone": "+380678265612",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T08:12:13.629491707Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678265612` → **200**

```json
[
  {
    "phone": "+380678265612",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T08:12:13.629491707Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ba45bcca-cb33-4a78-980d-40a529b2b39c",
  "order_id": "31835055-31c5-4661-a366-7d1209b5f59f",
  "assignment_id": "d6ae6193-778f-46a0-8dd1-5f65a34c57f4",
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
    "phone": "+380678265612"
  }
}
```

`POST /api/driver/v1/work-sessions/2e072f79-5ec9-4b3d-a3fc-4de58b5b3e7f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:12:14Z",
    "sequence": 1793261534424
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e072f79-5ec9-4b3d-a3fc-4de58b5b3e7f",
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
  "last_heartbeat_at": "2026-10-29T08:12:14.441583Z",
  "last_location_at": "2026-10-29T08:12:14.441583Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ba45bcca-cb33-4a78-980d-40a529b2b39c/arrive` → **200**

```json
{
  "command_id": "28d6ecda-9518-4460-aa66-a0ad2de04473",
  "expected_version": 0
}
```

```json
{
  "id": "ba45bcca-cb33-4a78-980d-40a529b2b39c",
  "order_id": "31835055-31c5-4661-a366-7d1209b5f59f",
  "assignment_id": "d6ae6193-778f-46a0-8dd1-5f65a34c57f4",
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
  "arrived_at": "2026-10-29T08:12:14.629666Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678265612"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380678265612` → **200**

```json
[
  {
    "phone": "+380678265612",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T08:12:13.629491707Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678265612` → **200**

```json
[
  {
    "phone": "+380678265612",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T08:12:13.629491707Z"
  },
  {
    "phone": "+380678265612",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T08:12:15.644313946Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678265612` → **200**

```json
[
  {
    "phone": "+380678265612",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T08:12:13.629491707Z"
  },
  {
    "phone": "+380678265612",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T08:12:15.644313946Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678265612` → **200**

```json
[
  {
    "phone": "+380678265612",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T08:12:13.629491707Z"
  },
  {
    "phone": "+380678265612",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T08:12:15.644313946Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/ba45bcca-cb33-4a78-980d-40a529b2b39c/start` → **200**

```json
{
  "command_id": "120db265-730f-4ee9-bcb6-d2b5570d509e",
  "expected_version": 1
}
```

```json
{
  "id": "ba45bcca-cb33-4a78-980d-40a529b2b39c",
  "order_id": "31835055-31c5-4661-a366-7d1209b5f59f",
  "assignment_id": "d6ae6193-778f-46a0-8dd1-5f65a34c57f4",
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
  "arrived_at": "2026-10-29T08:12:14.629666Z",
  "started_at": "2026-10-29T08:12:15.913485Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678265612"
  }
}
```

`POST /api/driver/v1/trips/ba45bcca-cb33-4a78-980d-40a529b2b39c/complete` → **200**

```json
{
  "command_id": "14d85ce3-acb3-4bf6-b97b-f9b74039aa75",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:12:16Z",
  "cash_received": true
}
```

```json
{
  "id": "ba45bcca-cb33-4a78-980d-40a529b2b39c",
  "order_id": "31835055-31c5-4661-a366-7d1209b5f59f",
  "assignment_id": "d6ae6193-778f-46a0-8dd1-5f65a34c57f4",
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
  "arrived_at": "2026-10-29T08:12:14.629666Z",
  "started_at": "2026-10-29T08:12:15.913485Z",
  "completed_at": "2026-10-29T08:12:16.106429Z",
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
  "session_id": "2e072f79-5ec9-4b3d-a3fc-4de58b5b3e7f",
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
  "last_heartbeat_at": "2026-10-29T08:12:14.441583Z",
  "last_location_at": "2026-10-29T08:12:14.441583Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2e072f79-5ec9-4b3d-a3fc-4de58b5b3e7f/close` → **200**

```json
{
  "command_id": "e8bc8e5a-d095-4870-8a49-98d7a32c9538",
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
  "phone": "+380639396229",
  "device_ref": "sandbox-11279"
}
```

```json
{
  "challenge_id": "b1eeb0db-a610-413b-ba36-0545a147968c",
  "expires_at": "2026-10-29T08:17:16.724329143Z",
  "resend_available_at": "2026-10-29T08:12:17.724329143Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639396229` → **200**

```json
{
  "phone": "+380639396229",
  "audience": "CLIENT",
  "code": "813732",
  "sent_at": "2026-10-29T08:12:16.727055237Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b1eeb0db-a610-413b-ba36-0545a147968c",
  "code": "813732",
  "device_ref": "sandbox-11279"
}
```

```json
{
  "session_id": "4608b6ea-0cbb-4878-bbe5-79430748ba70",
  "subject": {
    "type": "CLIENT",
    "id": "8c9cab65-d429-4b0e-b49d-3413c24c7de2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YzljYWI2NS1kNDI5LTRiMGUtYjQ5ZC0zNDEzYzI0YzdkZTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNDM2LCJpYXQiOjE3OTMyNjE1MzYsImp0aSI6ImYwODYyMzBjLWY0ZjctNDcyMy1hYmFkLWVlYjU3N2NmM2NkYSIsInNpZCI6IjQ2MDhiNmVhLTBjYmItNDg3OC1iYmU1LTc5NDMwNzQ4YmE3MCJ9.wWqPpWbC8ZC392SJ0MiPtf5Id126mr5CRQ5NM8xn81M",
  "access_expires_at": "2026-10-29T08:27:16.939391878Z",
  "refresh_token": "aCiNwq1HAw65zcn7fUgMpNM5LKr_-6B89BpNRdeZ5zI",
  "refresh_expires_at": "2026-11-28T08:12:16.938995143Z",
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
        "pl": "Zmiana planów",
        "ru": "Передумал ехать",
        "en": "Changed my mind"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "uk": "Помилився адресою",
        "pl": "Błędny adres",
        "ru": "Ошибся адресом",
        "en": "Wrong address"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "uk": "Поїду іншим транспортом",
        "pl": "Inny transport",
        "ru": "Уеду на другом транспорте",
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
  "device_ref": "sandbox-15612"
}
```

```json
{
  "challenge_id": "7bc1a85e-022c-4525-9f56-0ef868221035",
  "expires_at": "2026-10-29T08:17:17.292127709Z",
  "resend_available_at": "2026-10-29T08:12:18.292127709Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "434642",
  "sent_at": "2026-10-29T08:12:17.294264121Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7bc1a85e-022c-4525-9f56-0ef868221035",
  "code": "434642",
  "device_ref": "sandbox-15612"
}
```

```json
{
  "session_id": "aede936e-da13-4ed4-9c88-7505efb391a9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjQzNywiaWF0IjoxNzkzMjYxNTM3LCJqdGkiOiI0MGVlMmU5My04MTY5LTQ5MzYtOTQ3MC00ZjM5NzY3ZGFjYTgiLCJzaWQiOiJhZWRlOTM2ZS1kYTEzLTRlZDQtOWM4OC03NTA1ZWZiMzkxYTkifQ.GNKxqIcrRri5ErmUGbUgWTxF9CvoQmdvWETmePZ3urI",
  "access_expires_at": "2026-10-29T08:27:17.491418069Z",
  "refresh_token": "UYiQxEVDq3B7ov-uB5iI4Wxf_WluN2i4TvgsQfrd9co",
  "refresh_expires_at": "2026-11-28T08:12:17.490866396Z",
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
        "pl": "Pasażer nie przyszedł",
        "ru": "Пассажир не вышел",
        "en": "Passenger did not show up"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "uk": "Несправність автомобіля",
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля",
        "en": "Vehicle problem"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "uk": "Не можу під'їхати",
        "pl": "Nie mogę dojechać",
        "ru": "Не могу подъехать",
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
  "session_id": "154e9277-8423-4f89-8e16-c4fb75bee583",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI0MzgsImlhdCI6MTc5MzI2MTUzOCwianRpIjoiNGQ4ZjFjNDEtZWJlOS00ZDhmLTlmODktOGQ1YjA2OWY2OWRhIiwic2lkIjoiMTU0ZTkyNzctODQyMy00Zjg5LThlMTYtYzRmYjc1YmVlNTgzIn0.FPqNzMZFKgCKl4fg21rxnTT7915qpbM7hjHzjHlI9Co",
  "access_expires_at": "2026-10-29T08:27:18.062281422Z",
  "refresh_token": "cQISpT3wOvWzOIKHf72j0wWBws29GOKVqfTapfWmYt0",
  "refresh_expires_at": "2026-10-29T20:12:18.061857211Z",
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
  "session_id": "3cc7d348-3083-43c1-9ff2-3215875afcfe",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI0MzgsImlhdCI6MTc5MzI2MTUzOCwianRpIjoiNmNhZmYzMTItM2ExZi00YjRjLTk3YzgtNzE0MTQyMmUxNzgzIiwic2lkIjoiM2NjN2QzNDgtMzA4My00M2MxLTlmZjItMzIxNTg3NWFmY2ZlIn0.nZAQL5bSITHNEEe7Jy9Aws9-Tz7Oxmv0C32bkrHdv_k",
  "access_expires_at": "2026-10-29T08:27:18.450600446Z",
  "refresh_token": "BukSqMxZgkGSHiL4DT1vUZC3LivUME2HY6yXpRwlqT0",
  "refresh_expires_at": "2026-10-29T20:12:18.450162003Z",
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
        "pl": "Na prośbę pasażera",
        "ru": "Пассажир попросил",
        "en": "Passenger asked"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "uk": "Дубль замовлення",
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа",
        "en": "Duplicate order"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "uk": "Немає вільних авто",
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин",
        "en": "No cars available"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "uk": "Тестове замовлення",
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ",
        "en": "Test order"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "uk": "Помилка оператора",
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора",
        "en": "Operator error"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "uk": "ДТП",
        "pl": "Wypadek",
        "ru": "ДТП",
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
  "command_id": "8b8ee623-ae4e-4894-aa1f-ce4648e946f7",
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
  "id": "4f267378-5947-4adf-9c93-b9f63a966b42",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:17:18.827192Z",
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
  "command_id": "2e454db7-1edb-4f0b-819a-6a7b23337b81",
  "quote_id": "4f267378-5947-4adf-9c93-b9f63a966b42",
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
  "id": "bbf60704-dc91-46b9-afa1-10c98179f538",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8c9cab65-d429-4b0e-b49d-3413c24c7de2",
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
  "created_at": "2026-10-29T08:12:19.025098Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bbf60704-dc91-46b9-afa1-10c98179f538` → **200**

```json
{
  "id": "bbf60704-dc91-46b9-afa1-10c98179f538",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8c9cab65-d429-4b0e-b49d-3413c24c7de2",
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
  "created_at": "2026-10-29T08:12:19.025098Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/bbf60704-dc91-46b9-afa1-10c98179f538/cancel` → **200**

```json
{
  "command_id": "44dc0cb5-95fa-44b7-9599-f5c3fff44df9",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "bbf60704-dc91-46b9-afa1-10c98179f538",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8c9cab65-d429-4b0e-b49d-3413c24c7de2",
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
  "created_at": "2026-10-29T08:12:19.025098Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "uk": "Довго чекати авто",
      "pl": "Zbyt długie oczekiwanie",
      "ru": "Долго ждать машину",
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
  "command_id": "c5066458-7b3d-40ec-a1fb-e1c045d4150b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:12:19Z",
    "sequence": 1793261539788
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e6008818-da2a-4233-b491-0d8210ca96ce",
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
  "last_heartbeat_at": "2026-10-29T08:12:19.804876Z",
  "last_location_at": "2026-10-29T08:12:19.804876Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-2613"
}
```

```json
{
  "challenge_id": "84f5800d-741d-49ff-bb19-a29452af4843",
  "expires_at": "2026-10-29T08:17:19.997744221Z",
  "resend_available_at": "2026-10-29T08:12:20.997744221Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "573308",
  "sent_at": "2026-10-29T08:12:19.999943825Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "84f5800d-741d-49ff-bb19-a29452af4843",
  "code": "573308",
  "device_ref": "sandbox-2613"
}
```

```json
{
  "session_id": "a2855855-270d-498b-98fd-aaa368526fcd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjQ0MCwiaWF0IjoxNzkzMjYxNTQwLCJqdGkiOiI0MDdmZTBiNS0yYWJhLTRiNjQtODQ1Ni04NmYyYTBmYzdjYWEiLCJzaWQiOiJhMjg1NTg1NS0yNzBkLTQ5OGItOThmZC1hYWEzNjg1MjZmY2QifQ.QYmu7zSd67ZPfFu4DNbneoT0Vdd8YnekcFTNvjS_eyY",
  "access_expires_at": "2026-10-29T08:27:20.201062422Z",
  "refresh_token": "5HB2mwXXBhgx8TzOSbRV-VaVoEJnGjFdU4ZxTVftHS0",
  "refresh_expires_at": "2026-11-28T08:12:20.200632367Z",
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
  "command_id": "981d29ee-d560-43ce-8f25-140d9fb5a8c6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:12:20Z",
    "sequence": 1793261540575
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ffaf5e7e-d671-4ee0-b58b-ca2fad7bbfc7",
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
  "last_heartbeat_at": "2026-10-29T08:12:20.592859Z",
  "last_location_at": "2026-10-29T08:12:20.592859Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "87426672-7cb2-4346-acc6-cbb80e153825",
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
  "id": "a95c6107-604a-4ec9-a165-2298e353f48a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:17:20.786350Z",
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
  "command_id": "df0959e9-ec2d-4c48-be41-3e2c9e98c5f1",
  "quote_id": "a95c6107-604a-4ec9-a165-2298e353f48a",
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
  "id": "50c087b6-7580-4584-a4c3-31fa8ab7c8e3",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8c9cab65-d429-4b0e-b49d-3413c24c7de2",
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
  "created_at": "2026-10-29T08:12:20.986927Z",
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
    "id": "548f9399-54cc-4ae4-8018-6a40a0c48ef8",
    "order_id": "50c087b6-7580-4584-a4c3-31fa8ab7c8e3",
    "expires_at": "2026-10-29T08:12:35.99007Z",
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

`POST /api/driver/v1/offers/548f9399-54cc-4ae4-8018-6a40a0c48ef8/accept` → **200**

```json
{
  "command_id": "5ebc66ce-9371-4dfe-9214-cff607b08ffe"
}
```

```json
{
  "id": "45f3d513-e4bb-44ef-b877-91c059628e77",
  "order_id": "50c087b6-7580-4584-a4c3-31fa8ab7c8e3",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dcc5c241-6c64-4927-967f-4fa81e76f823",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dcc5c241-6c64-4927-967f-4fa81e76f823",
  "order_id": "50c087b6-7580-4584-a4c3-31fa8ab7c8e3",
  "assignment_id": "45f3d513-e4bb-44ef-b877-91c059628e77",
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

`POST /api/driver/v1/trips/dcc5c241-6c64-4927-967f-4fa81e76f823/cancel` → **200**

```json
{
  "command_id": "5c1f4de4-e3c3-41f3-b373-591158f9940d",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "dcc5c241-6c64-4927-967f-4fa81e76f823",
  "order_id": "50c087b6-7580-4584-a4c3-31fa8ab7c8e3",
  "assignment_id": "45f3d513-e4bb-44ef-b877-91c059628e77",
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

`GET /api/rider/v1/orders/50c087b6-7580-4584-a4c3-31fa8ab7c8e3` → **200**

```json
{
  "id": "50c087b6-7580-4584-a4c3-31fa8ab7c8e3",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "8c9cab65-d429-4b0e-b49d-3413c24c7de2",
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
    "id": "45f3d513-e4bb-44ef-b877-91c059628e77",
    "order_id": "50c087b6-7580-4584-a4c3-31fa8ab7c8e3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "dcc5c241-6c64-4927-967f-4fa81e76f823",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T08:12:20.986927Z",
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
    "id": "93a0f8d5-50ee-476f-92bb-5e9d33a13704",
    "order_id": "50c087b6-7580-4584-a4c3-31fa8ab7c8e3",
    "expires_at": "2026-10-29T08:12:36.769739Z",
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

`POST /api/driver/v1/offers/93a0f8d5-50ee-476f-92bb-5e9d33a13704/accept` → **200**

```json
{
  "command_id": "bcb3d367-9be3-4b70-bc87-7bdaf1f9df97"
}
```

```json
{
  "id": "3869d215-9a0b-47b8-84b5-1ed25e4f2097",
  "order_id": "50c087b6-7580-4584-a4c3-31fa8ab7c8e3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0cd80258-c8e8-48b1-84ef-860485d348e3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0cd80258-c8e8-48b1-84ef-860485d348e3",
  "order_id": "50c087b6-7580-4584-a4c3-31fa8ab7c8e3",
  "assignment_id": "3869d215-9a0b-47b8-84b5-1ed25e4f2097",
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

`POST /api/driver/v1/trips/0cd80258-c8e8-48b1-84ef-860485d348e3/cancel` → **200**

```json
{
  "command_id": "06ae8e34-b4dd-4ede-a21f-0dea50fe624c",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "0cd80258-c8e8-48b1-84ef-860485d348e3",
  "order_id": "50c087b6-7580-4584-a4c3-31fa8ab7c8e3",
  "assignment_id": "3869d215-9a0b-47b8-84b5-1ed25e4f2097",
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
    "id": "50c087b6-7580-4584-a4c3-31fa8ab7c8e3",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T08:12:20.986927Z",
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
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel"
      }
    },
    "pickup_at": null
  },
  {
    "id": "bbf60704-dc91-46b9-afa1-10c98179f538",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T08:12:19.025098Z",
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
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/50c087b6-7580-4584-a4c3-31fa8ab7c8e3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T08:12:20.98752Z",
      "actor": {
        "type": "CLIENT",
        "id": "8c9cab65-d429-4b0e-b49d-3413c24c7de2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "50c087b6-7580-4584-a4c3-31fa8ab7c8e3",
        "quote_id": "a95c6107-604a-4ec9-a165-2298e353f48a",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "dc465937-d54c-4351-b259-0700af296e50"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T08:12:20.989243Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "50c087b6-7580-4584-a4c3-31fa8ab7c8e3",
        "attempt_id": "c60fcb5f-b41f-4470-8984-3a0fe0f8fb2b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "dc465937-d54c-4351-b259-0700af296e50"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T08:12:20.995893Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "548f9399-54cc-4ae4-8018-6a40a0c48ef8",
        "order_id": "50c087b6-7580-4584-a4c3-31fa8ab7c8e3",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "dc465937-d54c-4351-b259-0700af296e50"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T08:12:21.379229Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "548f9399-54cc-4ae4-8018-6a40a0c48ef8",
        "order_id": "50c087b6-7580-4584-a4c3-31fa8ab7c8e3",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "45f3d513-e4bb-44ef-b877-91c059628e77"
      },
      "correlation_id": "81dd0556-08ea-473a-9952-d7c4321fae34"
```

Done: orders bbf60704-dc91-46b9-afa1-10c98179f538, 50c087b6-7580-4584-a4c3-31fa8ab7c8e3.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732315351",
  "device_ref": "sandbox-2523"
}
```

```json
{
  "challenge_id": "4bbd25ae-4472-41d5-8cd2-8f1c820bea29",
  "expires_at": "2026-10-29T08:17:23.284270722Z",
  "resend_available_at": "2026-10-29T08:12:24.284270722Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732315351` → **200**

```json
{
  "phone": "+380732315351",
  "audience": "CLIENT",
  "code": "162569",
  "sent_at": "2026-10-29T08:12:23.286680503Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4bbd25ae-4472-41d5-8cd2-8f1c820bea29",
  "code": "162569",
  "device_ref": "sandbox-2523"
}
```

```json
{
  "session_id": "2cea7c06-2242-457c-b397-6b49d7e788d4",
  "subject": {
    "type": "CLIENT",
    "id": "0b0e4fa1-36b2-4d18-a872-c0180fb218bd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYjBlNGZhMS0zNmIyLTRkMTgtYTg3Mi1jMDE4MGZiMjE4YmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNDQzLCJpYXQiOjE3OTMyNjE1NDMsImp0aSI6IjZjYjgxZGNkLTk2NzUtNGM4Yi1iZGZlLTJkOWZlYjk4NWYyZiIsInNpZCI6IjJjZWE3YzA2LTIyNDItNDU3Yy1iMzk3LTZiNDlkN2U3ODhkNCJ9.CqYdVOqGICGxFP9DE5qbYA6nPq5w5Wn5L7cc6tU0-8Q",
  "access_expires_at": "2026-10-29T08:27:23.488017205Z",
  "refresh_token": "Fl2CAkxx44wBRi0ijggz4-f5MNnIoNXh50TWLIXG0rE",
  "refresh_expires_at": "2026-11-28T08:12:23.487671743Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "d4615fcf-a42c-4daa-8923-23669693c07c",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "d812f20f-c068-4fce-aca5-b8cbb1a5ecb9",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-d812f20f-c068-4fce-aca5-b8cbb1a5ecb9",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "52a6e37477d43896c4b13602acb63aa7",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=d812f20f-c068-4fce-aca5-b8cbb1a5ecb9",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732315351"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=d812f20f-c068-4fce-aca5-b8cbb1a5ecb9",
  "expires_at": "2026-10-29T08:42:23.672906Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/d812f20f-c068-4fce-aca5-b8cbb1a5ecb9` → **200**

```json
{
  "id": "d812f20f-c068-4fce-aca5-b8cbb1a5ecb9",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T08:42:23.672906Z",
  "card": {
    "id": "4a301186-8e9b-470c-b767-d0cf8627ba39",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7200",
    "card_type": "Visa",
    "created_at": "2026-10-29T08:12:23.880065Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "4a301186-8e9b-470c-b767-d0cf8627ba39",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****7200",
      "card_type": "Visa",
      "created_at": "2026-10-29T08:12:23.880065Z"
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
  "device_ref": "sandbox-29840"
}
```

```json
{
  "challenge_id": "4badd655-992b-4de8-9c6e-500ba8db0e08",
  "expires_at": "2026-10-29T08:17:24.255948257Z",
  "resend_available_at": "2026-10-29T08:12:25.255948257Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "360102",
  "sent_at": "2026-10-29T08:12:24.258067954Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4badd655-992b-4de8-9c6e-500ba8db0e08",
  "code": "360102",
  "device_ref": "sandbox-29840"
}
```

```json
{
  "session_id": "659e01cb-ad66-417f-a771-68031d5f6a4b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjQ0NCwiaWF0IjoxNzkzMjYxNTQ0LCJqdGkiOiJkZjdmODI0Yi0zNDdiLTQ3MjgtYTUyMS1iNDBjN2E1NmUwZTgiLCJzaWQiOiI2NTllMDFjYi1hZDY2LTQxN2YtYTc3MS02ODAzMWQ1ZjZhNGIifQ.AlS2cMVEJjb62q4hWmWAGhAin-QvjGYdyYOz1hl3JNE",
  "access_expires_at": "2026-10-29T08:27:24.465821436Z",
  "refresh_token": "2_EkC7G010TCrnUvWzJr18u-zwA-rjl5N8RTPAp2ZRU",
  "refresh_expires_at": "2026-11-28T08:12:24.46544773Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ffaf5e7e-d671-4ee0-b58b-ca2fad7bbfc7",
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
  "last_heartbeat_at": "2026-10-29T08:12:20.592859Z",
  "last_location_at": "2026-10-29T08:12:20.592859Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ffaf5e7e-d671-4ee0-b58b-ca2fad7bbfc7/handover` → **200**

```json
{
  "command_id": "54cd10ce-6a69-4096-bdf0-a094402c5b57",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ffaf5e7e-d671-4ee0-b58b-ca2fad7bbfc7",
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
  "last_heartbeat_at": "2026-10-29T08:12:20.592859Z",
  "last_location_at": "2026-10-29T08:12:20.592859Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ffaf5e7e-d671-4ee0-b58b-ca2fad7bbfc7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:12:25Z",
    "sequence": 1793261545703
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ffaf5e7e-d671-4ee0-b58b-ca2fad7bbfc7",
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
  "last_heartbeat_at": "2026-10-29T08:12:25.087022Z",
  "last_location_at": "2026-10-29T08:12:25.087022Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c22836b7-ee6a-4957-8b41-384be2ffd646",
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
  "id": "805f377f-e1a5-4f75-af9d-0b9b05481bb9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:17:25.269625Z",
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
  "command_id": "8c64e4fe-24ad-4fa6-b076-49b5e918d106",
  "quote_id": "805f377f-e1a5-4f75-af9d-0b9b05481bb9",
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
  "id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0b0e4fa1-36b2-4d18-a872-c0180fb218bd",
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
  "created_at": "2026-10-29T08:12:25.463658Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d0244bd5-6b04-4f34-96d2-1bf679c2baf2` → **200**

```json
{
  "id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0b0e4fa1-36b2-4d18-a872-c0180fb218bd",
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
  "created_at": "2026-10-29T08:12:25.463658Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d0244bd5-6b04-4f34-96d2-1bf679c2baf2` → **200**

```json
{
  "id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0b0e4fa1-36b2-4d18-a872-c0180fb218bd",
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
  "created_at": "2026-10-29T08:12:25.463658Z",
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
    "id": "cba8c0bc-6f3b-478e-b8b9-b9267077cc62",
    "order_id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
    "expires_at": "2026-10-29T08:12:40.914198Z",
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

`POST /api/driver/v1/offers/cba8c0bc-6f3b-478e-b8b9-b9267077cc62/accept` → **200**

```json
{
  "command_id": "3914dee8-82b1-44c8-84e2-4e207ba6bd87"
}
```

```json
{
  "id": "cf46a91d-9db2-4b3f-a6bd-007973e2cf54",
  "order_id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "49fe2135-c3f5-4978-ad73-a30733543c5b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "49fe2135-c3f5-4978-ad73-a30733543c5b",
  "order_id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
  "assignment_id": "cf46a91d-9db2-4b3f-a6bd-007973e2cf54",
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

`POST /api/driver/v1/work-sessions/ffaf5e7e-d671-4ee0-b58b-ca2fad7bbfc7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:12:27Z",
    "sequence": 1793261547582
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ffaf5e7e-d671-4ee0-b58b-ca2fad7bbfc7",
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
  "last_heartbeat_at": "2026-10-29T08:12:27.600027Z",
  "last_location_at": "2026-10-29T08:12:27.600027Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/49fe2135-c3f5-4978-ad73-a30733543c5b/arrive` → **200**

```json
{
  "command_id": "548d1aed-71d8-4050-83e4-861b90282f7c",
  "expected_version": 0
}
```

```json
{
  "id": "49fe2135-c3f5-4978-ad73-a30733543c5b",
  "order_id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
  "assignment_id": "cf46a91d-9db2-4b3f-a6bd-007973e2cf54",
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
  "arrived_at": "2026-10-29T08:12:27.794406Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/49fe2135-c3f5-4978-ad73-a30733543c5b/start` → **200**

```json
{
  "command_id": "39a1f6d4-0aeb-4dbc-b681-2d51935ff0ed",
  "expected_version": 1
}
```

```json
{
  "id": "49fe2135-c3f5-4978-ad73-a30733543c5b",
  "order_id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
  "assignment_id": "cf46a91d-9db2-4b3f-a6bd-007973e2cf54",
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
  "arrived_at": "2026-10-29T08:12:27.794406Z",
  "started_at": "2026-10-29T08:12:27.990386Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/49fe2135-c3f5-4978-ad73-a30733543c5b/complete` → **200**

```json
{
  "command_id": "e5689a41-d4dd-4151-90aa-38e45bf81a19",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:12:28Z",
  "cash_received": true
}
```

```json
{
  "id": "49fe2135-c3f5-4978-ad73-a30733543c5b",
  "order_id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
  "assignment_id": "cf46a91d-9db2-4b3f-a6bd-007973e2cf54",
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
  "arrived_at": "2026-10-29T08:12:27.794406Z",
  "started_at": "2026-10-29T08:12:27.990386Z",
  "completed_at": "2026-10-29T08:12:28.184443Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/d0244bd5-6b04-4f34-96d2-1bf679c2baf2` → **200**

```json
{
  "id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "0b0e4fa1-36b2-4d18-a872-c0180fb218bd",
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
    "id": "cf46a91d-9db2-4b3f-a6bd-007973e2cf54",
    "order_id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "49fe2135-c3f5-4978-ad73-a30733543c5b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T08:12:25.463658Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d0244bd5-6b04-4f34-96d2-1bf679c2baf2` → **200**

```json
{
  "id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "0b0e4fa1-36b2-4d18-a872-c0180fb218bd",
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
    "id": "cf46a91d-9db2-4b3f-a6bd-007973e2cf54",
    "order_id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "49fe2135-c3f5-4978-ad73-a30733543c5b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T08:12:25.463658Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d0244bd5-6b04-4f34-96d2-1bf679c2baf2` → **200**

```json
{
  "id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "0b0e4fa1-36b2-4d18-a872-c0180fb218bd",
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
    "id": "cf46a91d-9db2-4b3f-a6bd-007973e2cf54",
    "order_id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "49fe2135-c3f5-4978-ad73-a30733543c5b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T08:12:25.463658Z",
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

`GET /api/rider/v1/orders/d0244bd5-6b04-4f34-96d2-1bf679c2baf2/tip` → **200**

```json
{
  "order_id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
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
  "available_until": "2026-10-30T08:12:28.184443Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/d0244bd5-6b04-4f34-96d2-1bf679c2baf2/tip` → **201**

```json
{
  "command_id": "f00e78b5-6b1f-4993-a1ba-e6639ea5f3c8",
  "amount_minor": 2500
}
```

```json
{
  "id": "6a6b7797-0e3c-43ce-823f-791a41b20575",
  "order_id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T08:12:31.315445Z"
}
```

`GET /api/rider/v1/orders/d0244bd5-6b04-4f34-96d2-1bf679c2baf2/tip` → **200**

```json
{
  "order_id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
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
  "available_until": "2026-10-30T08:12:28.184443Z",
  "open": false,
  "tip": {
    "id": "6a6b7797-0e3c-43ce-823f-791a41b20575",
    "order_id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T08:12:31.315445Z"
  }
}
```

`GET /api/rider/v1/orders/d0244bd5-6b04-4f34-96d2-1bf679c2baf2/tip` → **200**

```json
{
  "order_id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
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
  "available_until": "2026-10-30T08:12:28.184443Z",
  "open": false,
  "tip": {
    "id": "6a6b7797-0e3c-43ce-823f-791a41b20575",
    "order_id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T08:12:31.315445Z"
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
      "id": "6da61841-9004-40be-8c5c-c0101e5c9bb3",
      "at": "2026-10-29T08:12:28.955252Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
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
      "id": "4a22a4ed-4c8d-487e-9eeb-72eb6a5cdec9",
      "at": "2026-10-29T08:12:33.013283Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
      "counterpart_id": null
    },
    {
      "id": "6da61841-9004-40be-8c5c-c0101e5c9bb3",
      "at": "2026-10-29T08:12:28.955252Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "48f6ae7c-d57d-4294-bb3c-af5e0f7185d7",
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
  "id": "8039ad6f-f1c0-4252-b8ed-87610c980441",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:17:34.283156Z",
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
  "session_id": "ca32e661-079d-4885-82b6-b0026a036be6",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI0NTQsImlhdCI6MTc5MzI2MTU1NCwianRpIjoiZDRlYjk1OTAtODliZS00YzI1LWJhMWUtY2U2MzBmMmM5ZTJiIiwic2lkIjoiY2EzMmU2NjEtMDc5ZC00ODg1LTgyYjYtYjAwMjZhMDM2YmU2In0.BPPYN7q3gp50AwrIukUVCOzf86P86F-BE0D2nnqc-Wo",
  "access_expires_at": "2026-10-29T08:27:34.678000834Z",
  "refresh_token": "o1GrOeP2OaYeeqSYodeb56DxaT-YASS88pKTrJuG5t8",
  "refresh_expires_at": "2026-10-29T20:12:34.677633348Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380732315351` → **200**

```json
{
  "client_id": "0b0e4fa1-36b2-4d18-a872-c0180fb218bd"
}
```

`POST /api/admin/v1/rider-wallets/0b0e4fa1-36b2-4d18-a872-c0180fb218bd/top-ups` → **201**

```json
{
  "command_id": "fe550915-e410-4aa9-a670-02ca43faa20e",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "0b0e4fa1-36b2-4d18-a872-c0180fb218bd",
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
      "id": "accb95f2-a855-4f51-8bc8-ede096c6f99e",
      "at": "2026-10-29T08:12:35.032586Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5a7f32ad-af99-4eea-ba4d-184c332ccc96",
  "quote_id": "8039ad6f-f1c0-4252-b8ed-87610c980441",
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
  "id": "310464a2-c8f7-4b27-8b06-2098de1dfb27",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0b0e4fa1-36b2-4d18-a872-c0180fb218bd",
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
  "created_at": "2026-10-29T08:12:35.226655Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/310464a2-c8f7-4b27-8b06-2098de1dfb27` → **200**

```json
{
  "id": "310464a2-c8f7-4b27-8b06-2098de1dfb27",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0b0e4fa1-36b2-4d18-a872-c0180fb218bd",
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
  "created_at": "2026-10-29T08:12:35.226655Z",
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
    "id": "1b32ea84-fd98-4a09-b262-3e1204d3e276",
    "order_id": "310464a2-c8f7-4b27-8b06-2098de1dfb27",
    "expires_at": "2026-10-29T08:12:50.229982Z",
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

`POST /api/driver/v1/offers/1b32ea84-fd98-4a09-b262-3e1204d3e276/accept` → **200**

```json
{
  "command_id": "09d4e14c-f46d-46a4-b114-23e23c01a131"
}
```

```json
{
  "id": "9ed94d73-9d8c-4d44-8443-0d515cbab54f",
  "order_id": "310464a2-c8f7-4b27-8b06-2098de1dfb27",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3dd7f43d-5a9e-4256-b2ad-f6e3307ea7f7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3dd7f43d-5a9e-4256-b2ad-f6e3307ea7f7",
  "order_id": "310464a2-c8f7-4b27-8b06-2098de1dfb27",
  "assignment_id": "9ed94d73-9d8c-4d44-8443-0d515cbab54f",
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

`POST /api/driver/v1/work-sessions/ffaf5e7e-d671-4ee0-b58b-ca2fad7bbfc7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:12:36Z",
    "sequence": 1793261556155
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ffaf5e7e-d671-4ee0-b58b-ca2fad7bbfc7",
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
  "last_heartbeat_at": "2026-10-29T08:12:36.174569Z",
  "last_location_at": "2026-10-29T08:12:36.174569Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3dd7f43d-5a9e-4256-b2ad-f6e3307ea7f7/arrive` → **200**

```json
{
  "command_id": "4d34c5dc-497f-4476-9527-773d498ebca0",
  "expected_version": 0
}
```

```json
{
  "id": "3dd7f43d-5a9e-4256-b2ad-f6e3307ea7f7",
  "order_id": "310464a2-c8f7-4b27-8b06-2098de1dfb27",
  "assignment_id": "9ed94d73-9d8c-4d44-8443-0d515cbab54f",
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
  "arrived_at": "2026-10-29T08:12:36.361359Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3dd7f43d-5a9e-4256-b2ad-f6e3307ea7f7/start` → **200**

```json
{
  "command_id": "fd758315-92f0-4073-a0af-cc7d7a8e1466",
  "expected_version": 1
}
```

```json
{
  "id": "3dd7f43d-5a9e-4256-b2ad-f6e3307ea7f7",
  "order_id": "310464a2-c8f7-4b27-8b06-2098de1dfb27",
  "assignment_id": "9ed94d73-9d8c-4d44-8443-0d515cbab54f",
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
  "arrived_at": "2026-10-29T08:12:36.361359Z",
  "started_at": "2026-10-29T08:12:36.561805Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3dd7f43d-5a9e-4256-b2ad-f6e3307ea7f7/complete` → **200**

```json
{
  "command_id": "05429dac-0d51-4451-92bc-c546e95241bc",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:12:36Z",
  "cash_received": true
}
```

```json
{
  "id": "3dd7f43d-5a9e-4256-b2ad-f6e3307ea7f7",
  "order_id": "310464a2-c8f7-4b27-8b06-2098de1dfb27",
  "assignment_id": "9ed94d73-9d8c-4d44-8443-0d515cbab54f",
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
  "arrived_at": "2026-10-29T08:12:36.361359Z",
  "started_at": "2026-10-29T08:12:36.561805Z",
  "completed_at": "2026-10-29T08:12:36.768641Z",
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
  "client_id": "0b0e4fa1-36b2-4d18-a872-c0180fb218bd",
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
      "id": "accb95f2-a855-4f51-8bc8-ede096c6f99e",
      "at": "2026-10-29T08:12:35.032586Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "3a4258dd-3209-4d24-8c44-4c5661453235",
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

`GET /api/rider/v1/orders/310464a2-c8f7-4b27-8b06-2098de1dfb27/tip` → **200**

```json
{
  "order_id": "310464a2-c8f7-4b27-8b06-2098de1dfb27",
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
  "available_until": "2026-10-30T08:12:36.768641Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/310464a2-c8f7-4b27-8b06-2098de1dfb27/tip` → **201**

```json
{
  "command_id": "61632e3b-2df2-4c76-9ea8-174430e44daa",
  "amount_minor": 2500
}
```

```json
{
  "id": "67781166-0cee-4807-87ea-97259e976f8a",
  "order_id": "310464a2-c8f7-4b27-8b06-2098de1dfb27",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T08:12:37.518256Z"
}
```

`GET /api/rider/v1/orders/310464a2-c8f7-4b27-8b06-2098de1dfb27/tip` → **200**

```json
{
  "order_id": "310464a2-c8f7-4b27-8b06-2098de1dfb27",
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
  "available_until": "2026-10-30T08:12:36.768641Z",
  "open": false,
  "tip": {
    "id": "67781166-0cee-4807-87ea-97259e976f8a",
    "order_id": "310464a2-c8f7-4b27-8b06-2098de1dfb27",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T08:12:37.518256Z"
  }
}
```

`GET /api/rider/v1/orders/310464a2-c8f7-4b27-8b06-2098de1dfb27/tip` → **200**

```json
{
  "order_id": "310464a2-c8f7-4b27-8b06-2098de1dfb27",
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
  "available_until": "2026-10-30T08:12:36.768641Z",
  "open": false,
  "tip": {
    "id": "67781166-0cee-4807-87ea-97259e976f8a",
    "order_id": "310464a2-c8f7-4b27-8b06-2098de1dfb27",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T08:12:37.518256Z"
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
      "id": "ea650af8-44ab-43ca-91b9-bb160a7c56d0",
      "at": "2026-10-29T08:12:39.074278Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "310464a2-c8f7-4b27-8b06-2098de1dfb27",
      "counterpart_id": null
    },
    {
      "id": "f9656b73-5511-4d2d-9ff4-530dac975a24",
      "at": "2026-10-29T08:12:37.042839Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "310464a2-c8f7-4b27-8b06-2098de1dfb27",
      "counterpart_id": null
    },
    {
      "id": "4a22a4ed-4c8d-487e-9eeb-72eb6a5cdec9",
      "at": "2026-10-29T08:12:33.013283Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
      "counterpart_id": null
    },
    {
      "id": "6da61841-9004-40be-8c5c-c0101e5c9bb3",
      "at": "2026-10-29T08:12:28.955252Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d0244bd5-6b04-4f34-96d2-1bf679c2baf2",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ffaf5e7e-d671-4ee0-b58b-ca2fad7bbfc7",
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
  "last_heartbeat_at": "2026-10-29T08:12:36.174569Z",
  "last_location_at": "2026-10-29T08:12:36.174569Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ffaf5e7e-d671-4ee0-b58b-ca2fad7bbfc7/close` → **200**

```json
{
  "command_id": "560c96ae-3ca5-4fed-a190-ff195cc8b0c9",
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

Done: card order 310464a2-c8f7-4b27-8b06-2098de1dfb27.

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
  "phone": "+380736101436",
  "device_ref": "sandbox-29907"
}
```

```json
{
  "challenge_id": "e6693118-8545-4c4f-8c9e-9761e09ab3d0",
  "expires_at": "2026-10-29T08:17:39.874031011Z",
  "resend_available_at": "2026-10-29T08:12:40.874031011Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380736101436` → **200**

```json
{
  "phone": "+380736101436",
  "audience": "CLIENT",
  "code": "506871",
  "sent_at": "2026-10-29T08:12:39.875840618Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e6693118-8545-4c4f-8c9e-9761e09ab3d0",
  "code": "506871",
  "device_ref": "sandbox-29907"
}
```

```json
{
  "session_id": "a97749ee-f29f-455a-aa70-e0ea957e5101",
  "subject": {
    "type": "CLIENT",
    "id": "8934f772-f154-4d1a-824c-ba91416795d4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OTM0Zjc3Mi1mMTU0LTRkMWEtODI0Yy1iYTkxNDE2Nzk1ZDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNDYwLCJpYXQiOjE3OTMyNjE1NjAsImp0aSI6IjRkZjNjNzhkLTA2ZjEtNDhlNi05Y2E2LThlMWY5OTRmYmUzOCIsInNpZCI6ImE5Nzc0OWVlLWYyOWYtNDU1YS1hYTcwLWUwZWE5NTdlNTEwMSJ9.G-l6YEPN3Kf4cnZM5OP4HEqQXC5ECuiMt5FPb6U5Cnw",
  "access_expires_at": "2026-10-29T08:27:40.087641699Z",
  "refresh_token": "24PqQ_9613vgZMlEAifUfDgSRtDW7hrNfPRxDHHqJzA",
  "refresh_expires_at": "2026-11-28T08:12:40.087227031Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "ce422782-baab-40ac-9bd3-9162a8bd8ced",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "fbaea1ca-9187-4514-984f-9e1c3ec7bd29",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-fbaea1ca-9187-4514-984f-9e1c3ec7bd29",
    "orderDate": "1793261560",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "d6b358a41abf10f424656a16968e8339",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=fbaea1ca-9187-4514-984f-9e1c3ec7bd29",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736101436"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=fbaea1ca-9187-4514-984f-9e1c3ec7bd29",
  "created_at": "2026-10-29T08:12:40.269973Z",
  "expires_at": "2026-10-29T08:42:40.269973Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/fbaea1ca-9187-4514-984f-9e1c3ec7bd29` → **200**

```json
{
  "id": "fbaea1ca-9187-4514-984f-9e1c3ec7bd29",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T08:12:40.269973Z",
  "expires_at": "2026-10-29T08:42:40.269973Z",
  "completed_at": "2026-10-29T08:12:40.457678Z",
  "masked_pan": "41****2500",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "8934f772-f154-4d1a-824c-ba91416795d4",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "8934f772-f154-4d1a-824c-ba91416795d4",
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
      "id": "0d2723b2-2e9a-4a61-8d4c-0a0a1996dc47",
      "at": "2026-10-29T08:12:41.085811Z",
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
  "client_id": "8934f772-f154-4d1a-824c-ba91416795d4",
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
      "id": "0d2723b2-2e9a-4a61-8d4c-0a0a1996dc47",
      "at": "2026-10-29T08:12:41.085811Z",
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
  "device_ref": "sandbox-15337"
}
```

```json
{
  "challenge_id": "9828412a-5482-474f-acf6-cedd5dffe38e",
  "expires_at": "2026-10-29T08:17:42.248099828Z",
  "resend_available_at": "2026-10-29T08:12:43.248099828Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "640003",
  "sent_at": "2026-10-29T08:12:42.250302696Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9828412a-5482-474f-acf6-cedd5dffe38e",
  "code": "640003",
  "device_ref": "sandbox-15337"
}
```

```json
{
  "session_id": "535c463c-68a4-4543-9812-2dc424a4de3b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjQ2MiwiaWF0IjoxNzkzMjYxNTYyLCJqdGkiOiIyMTU2YjIzMS04NGI0LTQzNjEtYTI1Mi1lODlmNzc4MjI4OTIiLCJzaWQiOiI1MzVjNDYzYy02OGE0LTQ1NDMtOTgxMi0yZGM0MjRhNGRlM2IifQ.8pCfQXQBV6pf4Ry0Z8CbZn6xIWahck1D3OuKvFKYp1Y",
  "access_expires_at": "2026-10-29T08:27:42.449848344Z",
  "refresh_token": "g1aA3_aZz3YluxZ1LPgVBcDxoQQjBkh_jVKMahCdDkE",
  "refresh_expires_at": "2026-11-28T08:12:42.449448809Z",
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
  "command_id": "1f049bc3-738c-48a9-8f33-882e9625e149",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "edab8ec3-963d-4bbf-8b22-f698cee8a72c",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-edab8ec3-963d-4bbf-8b22-f698cee8a72c",
    "orderDate": "1793261562",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "099fa03691eb40a4bd013dc3ee9aaae1",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=edab8ec3-963d-4bbf-8b22-f698cee8a72c",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=edab8ec3-963d-4bbf-8b22-f698cee8a72c",
  "created_at": "2026-10-29T08:12:42.812267Z",
  "expires_at": "2026-10-29T08:42:42.812267Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/edab8ec3-963d-4bbf-8b22-f698cee8a72c` → **200**

```json
{
  "id": "edab8ec3-963d-4bbf-8b22-f698cee8a72c",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T08:12:42.812267Z",
  "expires_at": "2026-10-29T08:42:42.812267Z",
  "completed_at": "2026-10-29T08:12:42.997297Z",
  "masked_pan": "41****3855",
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
      "id": "81b5b6da-38c1-4a53-815d-cd2e81ba6a55",
      "at": "2026-10-29T08:12:43.091027Z",
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
  "command_id": "cf50dead-cb67-44f1-997b-ea064bac2433",
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
  "correlation_id": "8868f874-fe00-4cb8-b553-3991a54d94bd"
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
  "device_ref": "sandbox-14749"
}
```

```json
{
  "challenge_id": "8a2db599-5612-4dd4-a52d-922f6ee505f5",
  "expires_at": "2026-10-29T08:17:43.585671409Z",
  "resend_available_at": "2026-10-29T08:12:44.585671409Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "153628",
  "sent_at": "2026-10-29T08:12:43.587559987Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a2db599-5612-4dd4-a52d-922f6ee505f5",
  "code": "153628",
  "device_ref": "sandbox-14749"
}
```

```json
{
  "session_id": "333d9c74-9bc3-4e88-91ae-6e2e43b9fb20",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjQ2MywiaWF0IjoxNzkzMjYxNTYzLCJqdGkiOiI3ZTg2OGIwMS1hMDkyLTRiYTktOTRiMS1lZmMyMjY0YzBjYjUiLCJzaWQiOiIzMzNkOWM3NC05YmMzLTRlODgtOTFhZS02ZTJlNDNiOWZiMjAifQ.MHyX7ebFdPF89qGaj0JSzF1WTZSLI0HceCONCVW7_u4",
  "access_expires_at": "2026-10-29T08:27:43.797263854Z",
  "refresh_token": "rdsiun0U-8OAZsaISRWQUYU7WNLvm0oMARSmS8dYVjk",
  "refresh_expires_at": "2026-11-28T08:12:43.796761945Z",
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
  "command_id": "773f7e24-f0e8-445a-a1ec-9a72619da8b6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:12:44Z",
    "sequence": 1793261564167
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "008fdf0a-9794-4639-9644-ba584fad99bd",
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
  "last_heartbeat_at": "2026-10-29T08:12:44.184158Z",
  "last_location_at": "2026-10-29T08:12:44.184158Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638372920",
  "device_ref": "sandbox-13837"
}
```

```json
{
  "challenge_id": "7436bc84-8581-4be2-8f76-06a1831ca131",
  "expires_at": "2026-10-29T08:17:44.369182633Z",
  "resend_available_at": "2026-10-29T08:12:45.369182633Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638372920` → **200**

```json
{
  "phone": "+380638372920",
  "audience": "CLIENT",
  "code": "764482",
  "sent_at": "2026-10-29T08:12:44.371075081Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7436bc84-8581-4be2-8f76-06a1831ca131",
  "code": "764482",
  "device_ref": "sandbox-13837"
}
```

```json
{
  "session_id": "c3839e84-f30e-484e-a06e-dc0e7d1815a8",
  "subject": {
    "type": "CLIENT",
    "id": "7b52967a-945a-4e2f-b7d4-ee89cec8f567"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YjUyOTY3YS05NDVhLTRlMmYtYjdkNC1lZTg5Y2VjOGY1NjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNDY0LCJpYXQiOjE3OTMyNjE1NjQsImp0aSI6ImQxYzllYjcxLWU1MmQtNGYzYy1iYzI0LTMzMGRlMDQ0MDU0YiIsInNpZCI6ImMzODM5ZTg0LWYzMGUtNDg0ZS1hMDZlLWRjMGU3ZDE4MTVhOCJ9.7FEBSTO4TOeYhSv0C0HSlfjcWBle64HoJUGPNTSIDSA",
  "access_expires_at": "2026-10-29T08:27:44.572087502Z",
  "refresh_token": "1ERe7vuObC_nIjxuWcos3GoulkpVF2OwIWi0GN9ANmo",
  "refresh_expires_at": "2026-11-28T08:12:44.571770152Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "404d6531-9fe6-4d94-b213-38dcd9710211",
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
  "id": "4540149e-f23c-41ae-be7c-3fb9c362ac83",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:17:44.760820Z",
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
  "command_id": "ca72aaf6-9193-4723-b28e-81adf1a64423",
  "quote_id": "4540149e-f23c-41ae-be7c-3fb9c362ac83",
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
  "id": "744cbd7a-19c4-43f0-821f-2442bbfef378",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7b52967a-945a-4e2f-b7d4-ee89cec8f567",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:12:44.957515Z",
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
    "id": "8b97b000-6bb8-40d1-a3c9-c77ab6bea916",
    "order_id": "744cbd7a-19c4-43f0-821f-2442bbfef378",
    "expires_at": "2026-10-29T08:12:59.96034Z",
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

`POST /api/driver/v1/offers/8b97b000-6bb8-40d1-a3c9-c77ab6bea916/accept` → **200**

```json
{
  "command_id": "3c81901d-c3f0-47e4-ab3d-4f0e044d3c9c"
}
```

```json
{
  "id": "81e258ac-468e-4a6f-865f-81b66f1f0a6d",
  "order_id": "744cbd7a-19c4-43f0-821f-2442bbfef378",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d45678c8-7a72-4ebe-bf79-504834c4f9ac",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d45678c8-7a72-4ebe-bf79-504834c4f9ac",
  "order_id": "744cbd7a-19c4-43f0-821f-2442bbfef378",
  "assignment_id": "81e258ac-468e-4a6f-865f-81b66f1f0a6d",
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

`POST /api/driver/v1/work-sessions/008fdf0a-9794-4639-9644-ba584fad99bd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:12:45Z",
    "sequence": 1793261565693
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "008fdf0a-9794-4639-9644-ba584fad99bd",
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
  "last_heartbeat_at": "2026-10-29T08:12:45.709655Z",
  "last_location_at": "2026-10-29T08:12:45.709655Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d45678c8-7a72-4ebe-bf79-504834c4f9ac/arrive` → **200**

```json
{
  "command_id": "3578e935-a2cb-4a11-be47-20bd456a8f9f",
  "expected_version": 0
}
```

```json
{
  "id": "d45678c8-7a72-4ebe-bf79-504834c4f9ac",
  "order_id": "744cbd7a-19c4-43f0-821f-2442bbfef378",
  "assignment_id": "81e258ac-468e-4a6f-865f-81b66f1f0a6d",
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
  "arrived_at": "2026-10-29T08:12:45.8971Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d45678c8-7a72-4ebe-bf79-504834c4f9ac/start` → **200**

```json
{
  "command_id": "ef2616eb-0e41-4b47-8cdd-91ce32dece77",
  "expected_version": 1
}
```

```json
{
  "id": "d45678c8-7a72-4ebe-bf79-504834c4f9ac",
  "order_id": "744cbd7a-19c4-43f0-821f-2442bbfef378",
  "assignment_id": "81e258ac-468e-4a6f-865f-81b66f1f0a6d",
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
  "arrived_at": "2026-10-29T08:12:45.8971Z",
  "started_at": "2026-10-29T08:12:46.087574Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d45678c8-7a72-4ebe-bf79-504834c4f9ac/complete` → **200**

```json
{
  "command_id": "4a2481c5-2bdc-457d-aef6-ba852dbf6981",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:12:46Z",
  "cash_received": false
}
```

```json
{
  "id": "d45678c8-7a72-4ebe-bf79-504834c4f9ac",
  "order_id": "744cbd7a-19c4-43f0-821f-2442bbfef378",
  "assignment_id": "81e258ac-468e-4a6f-865f-81b66f1f0a6d",
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
  "arrived_at": "2026-10-29T08:12:45.8971Z",
  "started_at": "2026-10-29T08:12:46.087574Z",
  "completed_at": "2026-10-29T08:12:46.284791Z",
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
  "session_id": "c85b8644-63ce-4ab4-930b-af557c6282f3",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI0NjYsImlhdCI6MTc5MzI2MTU2NiwianRpIjoiMzU2MDcwNjEtOTVmMC00OTlmLWI4MjAtMGUzNzg3ZDgxY2Y5Iiwic2lkIjoiYzg1Yjg2NDQtNjNjZS00YWI0LTkzMGItYWY1NTdjNjI4MmYzIn0.h6ei8YQ7-eJfnFImuBKKmKN2YFof_zXJGvLCyJCUbho",
  "access_expires_at": "2026-10-29T08:27:46.677391878Z",
  "refresh_token": "kpvoY9r4_yaDOyf2n8Y4i5ghrPC-26HLHCkO4fF_cp4",
  "refresh_expires_at": "2026-10-29T20:12:46.676987055Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/744cbd7a-19c4-43f0-821f-2442bbfef378/cash-dispute` → **404**

```json
{
  "instance": "/api/admin/v1/orders/744cbd7a-19c4-43f0-821f-2442bbfef378/cash-dispute",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fe564a5a-063f-41e9-9b1f-0566b9aa5105"
}
```

`GET /api/admin/v1/orders/744cbd7a-19c4-43f0-821f-2442bbfef378/cash-dispute` → **200**

```json
{
  "order_id": "744cbd7a-19c4-43f0-821f-2442bbfef378",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "7b52967a-945a-4e2f-b7d4-ee89cec8f567",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T08:12:47.130238Z",
  "decide_by": "2026-11-12T08:12:47.130238Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T08:12:47.130238Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "744cbd7a-19c4-43f0-821f-2442bbfef378",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "7b52967a-945a-4e2f-b7d4-ee89cec8f567",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T08:12:47.130238Z",
      "decide_by": "2026-11-12T08:12:47.130238Z",
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

`POST /api/admin/v1/orders/744cbd7a-19c4-43f0-821f-2442bbfef378/cash-dispute/decide` → **400**

```json
{
  "command_id": "5e992cfd-8a69-492c-b4d8-c2d267d0adde",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/744cbd7a-19c4-43f0-821f-2442bbfef378/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "d28f8178-515e-415d-a505-03453cb9390e",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/744cbd7a-19c4-43f0-821f-2442bbfef378/cash-dispute/decide` → **200**

```json
{
  "command_id": "05217b41-c322-41c5-abe1-9b2631db5daa",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "744cbd7a-19c4-43f0-821f-2442bbfef378",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "7b52967a-945a-4e2f-b7d4-ee89cec8f567",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T08:12:47.130238Z",
  "decide_by": "2026-11-12T08:12:47.130238Z",
  "decision": "PAY_DRIVER",
  "decided_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T08:12:48.613029Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/744cbd7a-19c4-43f0-821f-2442bbfef378/cash-dispute/decide` → **409**

```json
{
  "command_id": "cd84b23b-2612-4a1e-9e44-f09b3ad4f621",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/744cbd7a-19c4-43f0-821f-2442bbfef378/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "aecd6c8d-bedf-435e-8b58-93ce6dd413c1"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "008fdf0a-9794-4639-9644-ba584fad99bd",
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
  "last_heartbeat_at": "2026-10-29T08:12:45.709655Z",
  "last_location_at": "2026-10-29T08:12:45.709655Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/008fdf0a-9794-4639-9644-ba584fad99bd/close` → **200**

```json
{
  "command_id": "edf65604-8151-432f-946f-93f09ef8b3ee",
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
  "session_id": "90833376-c36e-41fc-8070-2e04b9f7c662",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI0NjksImlhdCI6MTc5MzI2MTU2OSwianRpIjoiNDVjYzU0OTQtM2RjNi00OWJkLTk1NTctNGE4YmZlZDNlZmI5Iiwic2lkIjoiOTA4MzMzNzYtYzM2ZS00MWZjLTgwNzAtMmUwNGI5ZjdjNjYyIn0.9-qnPwISHhHRxDNzsv6KRDzFlyHeVPoEJuzxroBpBMA",
  "access_expires_at": "2026-10-29T08:27:49.57222993Z",
  "refresh_token": "DBYAF7UwJiiBE1t1XOEf_r6XwJ0B6JXSaLrVGSOWuHM",
  "refresh_expires_at": "2026-10-29T20:12:49.571863616Z",
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
  "phone": "+48600965103",
  "device_ref": "sandbox-14368"
}
```

```json
{
  "challenge_id": "ab4fea7f-b8fe-4b8b-94d5-9136e1fbdf3f",
  "expires_at": "2026-10-29T08:17:50.11820596Z",
  "resend_available_at": "2026-10-29T08:12:51.11820596Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600965103` → **200**

```json
{
  "phone": "+48600965103",
  "audience": "CLIENT",
  "code": "663192",
  "sent_at": "2026-10-29T08:12:50.120069057Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab4fea7f-b8fe-4b8b-94d5-9136e1fbdf3f",
  "code": "663192",
  "device_ref": "sandbox-14368"
}
```

```json
{
  "session_id": "6932c982-c716-40ea-902c-b3cc7d23d2a1",
  "subject": {
    "type": "CLIENT",
    "id": "24211cc3-9436-4bd4-9224-4f508a0a1a03"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNDIxMWNjMy05NDM2LTRiZDQtOTIyNC00ZjUwOGEwYTFhMDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNDcwLCJpYXQiOjE3OTMyNjE1NzAsImp0aSI6IjMwY2M2MTIwLTQ2ZmEtNDRiYi1iYzI4LTI2ZTk0M2ZiZDRiMSIsInNpZCI6IjY5MzJjOTgyLWM3MTYtNDBlYS05MDJjLWIzY2M3ZDIzZDJhMSJ9.S66Lrd_hM_SmH5aEEWEdQbjwctdT5KHJKk45-I5nJ5k",
  "access_expires_at": "2026-10-29T08:27:50.322933986Z",
  "refresh_token": "EpsiBIP9lsXDvDI6calXweU4gSWu6Q3zxZLXgME9bNQ",
  "refresh_expires_at": "2026-11-28T08:12:50.322458928Z",
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
  "command_id": "dcef0498-5e2b-461c-9eed-e3187ddab557",
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
  "correlation_id": "fb906015-263e-4bfa-bf2e-0aef6c0fd958",
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
  "command_id": "f29aa2d3-9409-4de5-8680-c260fa2b1bf5",
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
  "paused_at": "2026-10-29T08:12:51.060577827Z",
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
  "command_id": "cb64c1f1-3a70-4905-b566-4258b8bf0b81",
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
  "id": "d1306ada-0130-4007-a4cd-edf573d15df6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:17:51.448133Z",
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
  "command_id": "7a8abfea-2967-4e5f-af38-3e757d5c377e",
  "quote_id": "d1306ada-0130-4007-a4cd-edf573d15df6",
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
  "correlation_id": "cfc9bfd9-c4b6-4b4c-89b6-0f9007f36f7a"
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
  "paused_at": "2026-10-29T08:12:51.060578Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "8602948c-2805-4a23-b5af-15f67b245874",
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
  "command_id": "62d6be28-70cd-4790-8ada-da4a79e7700a",
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
  "command_id": "e02124e1-3f82-48ce-938f-4f3d9b789374",
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
  "id": "dedf5dbf-cbe4-4179-8eac-ae25c3287090",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:17:52.618767Z",
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
  "command_id": "f4fc134d-a8c7-45b9-8fee-6ffe174431ce",
  "quote_id": "dedf5dbf-cbe4-4179-8eac-ae25c3287090",
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
  "correlation_id": "6539c7b0-18a1-4099-92e9-9756f25d8b85"
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
  "command_id": "352a1b8d-7a47-4b24-837e-26b4f391cea2",
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
      "from": "11:00",
      "to": "12:00"
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
      "from": "11:00",
      "to": "12:00"
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
  "command_id": "315a9e72-87e4-403f-8d99-9361b4d7c410",
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
  "id": "e6d9fac7-5a98-49eb-9c39-4b2036cb51b9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:17:53.363492Z",
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
  "command_id": "df7a91d4-120a-4932-acba-8497d6a1ab95",
  "quote_id": "e6d9fac7-5a98-49eb-9c39-4b2036cb51b9",
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
  "correlation_id": "b494ef03-e04b-45c6-95e7-544fa290d9a2"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "241bad43-de30-4f47-a4eb-9ad9d9442d82",
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
  "correlation_id": "a734b1a1-672b-4117-ae88-7e14bca9147f"
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
      "from": "11:00",
      "to": "12:00"
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
  "command_id": "59dec0f8-3b91-4c9f-a388-48fbde4ed59f",
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
  "phone": "+380674669667",
  "device_ref": "sandbox-9770"
}
```

```json
{
  "challenge_id": "54980247-a8f4-4d33-aec1-1e75a451ebf8",
  "expires_at": "2026-10-29T08:17:54.325556754Z",
  "resend_available_at": "2026-10-29T08:12:55.325556754Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674669667` → **200**

```json
{
  "phone": "+380674669667",
  "audience": "CLIENT",
  "code": "258042",
  "sent_at": "2026-10-29T08:12:54.327217734Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "54980247-a8f4-4d33-aec1-1e75a451ebf8",
  "code": "258042",
  "device_ref": "sandbox-9770"
}
```

```json
{
  "session_id": "13f262ad-1d86-4d72-be14-177b87111ca9",
  "subject": {
    "type": "CLIENT",
    "id": "d6c445bd-ebcd-4584-9004-8b9c137a0154"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmM0NDViZC1lYmNkLTQ1ODQtOTAwNC04YjljMTM3YTAxNTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNDc0LCJpYXQiOjE3OTMyNjE1NzQsImp0aSI6IjczZDhkZjI2LWVlMmYtNDZlYy04MGIyLTk4ZTBmZGExZjlhZCIsInNpZCI6IjEzZjI2MmFkLTFkODYtNGQ3Mi1iZTE0LTE3N2I4NzExMWNhOSJ9.pNQxQG92N73Ss7nMRDupIB72tdH4X9tYxq6IN5G84I0",
  "access_expires_at": "2026-10-29T08:27:54.52540495Z",
  "refresh_token": "FvOUm7AiXuajshlIZUpRsDEqhreozAi3hzbWeQLgVHQ",
  "refresh_expires_at": "2026-11-28T08:12:54.525097607Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d6c445bd-ebcd-4584-9004-8b9c137a0154",
  "session_id": "13f262ad-1d86-4d72-be14-177b87111ca9",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a11fd300-7c2b-40fa-a032-0f0f90df8f09",
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
  "id": "a87cc10b-7e8f-444e-a1f2-58dc2a489b5a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:17:54.890127Z",
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
  "challenge_id": "5fcb3c9e-56f2-4f8c-9a4d-ae2cbbc14128",
  "expires_at": "2026-10-29T08:17:57.079136308Z",
  "resend_available_at": "2026-10-29T08:12:58.079136308Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674669667` → **200**

```json
{
  "phone": "+380674669667",
  "audience": "CLIENT",
  "code": "247390",
  "sent_at": "2026-10-29T08:12:57.08096206Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "0d231d9f-0c13-4bc6-9145-6df990091d5b",
  "challenge_id": "5fcb3c9e-56f2-4f8c-9a4d-ae2cbbc14128",
  "otp_code": "247390"
}
```

```json
{
  "client_id": "d6c445bd-ebcd-4584-9004-8b9c137a0154",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T08:12:57.29107493Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "d2411c11-0c17-4e32-896e-cd7a0de04b6e",
  "quote_id": "a87cc10b-7e8f-444e-a1f2-58dc2a489b5a",
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
  "correlation_id": "2463a664-3fed-40a3-82c0-6079d3b0e2ec"
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
  "session_id": "a49ca997-4dae-4dd0-a2a8-aea657ec6f2d",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI0NzcsImlhdCI6MTc5MzI2MTU3NywianRpIjoiZGZkZDMwZDctYTYyZC00M2FmLTlmNTItOGZmNDZlMjNkM2MxIiwic2lkIjoiYTQ5Y2E5OTctNGRhZS00ZGQwLWEyYTgtYWVhNjU3ZWM2ZjJkIn0.rWjsYa6yBoDj_FwW0ad7ANUFC87R8HrwnX5Yr1RQSbI",
  "access_expires_at": "2026-10-29T08:27:57.87146749Z",
  "refresh_token": "vfe_R-D-FY13CpAhABMOCQ8HfOjK_i7MpXrxgn7_znk",
  "refresh_expires_at": "2026-10-29T20:12:57.871027133Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "d6c445bd-ebcd-4584-9004-8b9c137a0154",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T08:12:57.291075Z",
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

`POST /api/admin/v1/client-deletions/d6c445bd-ebcd-4584-9004-8b9c137a0154/complete` → **200**

```json
{
  "command_id": "7c549722-93c7-4b17-a9ec-edf7595705c1",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "d6c445bd-ebcd-4584-9004-8b9c137a0154",
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
  "correlation_id": "4b2015cf-0962-4be1-a095-e698006cea36"
}
```

Done: client d6c445bd-ebcd-4584-9004-8b9c137a0154 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661058238",
  "device_ref": "sandbox-4680"
}
```

```json
{
  "challenge_id": "9e14b7ca-aa71-4e4c-a54d-9fdd41039fe1",
  "expires_at": "2026-10-29T08:17:58.621115842Z",
  "resend_available_at": "2026-10-29T08:12:59.621115842Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661058238` → **200**

```json
{
  "phone": "+380661058238",
  "audience": "CLIENT",
  "code": "781656",
  "sent_at": "2026-10-29T08:12:58.622893631Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9e14b7ca-aa71-4e4c-a54d-9fdd41039fe1",
  "code": "781656",
  "device_ref": "sandbox-4680"
}
```

```json
{
  "session_id": "17cb67ad-0474-4ef9-b1a7-16fc1b06be96",
  "subject": {
    "type": "CLIENT",
    "id": "c551d1fc-0bc4-4c52-a0f7-8ba34d1de261"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNTUxZDFmYy0wYmM0LTRjNTItYTBmNy04YmEzNGQxZGUyNjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNDc4LCJpYXQiOjE3OTMyNjE1NzgsImp0aSI6ImUxYjE4ODIzLWY2MTgtNDEwMC1iN2RhLTliNzY3ZmY2OGQ5ZiIsInNpZCI6IjE3Y2I2N2FkLTA0NzQtNGVmOS1iMWE3LTE2ZmMxYjA2YmU5NiJ9.oj4DepxZ0vDgltiJ2be8BMD922ONInrDZbWL2qKA1H8",
  "access_expires_at": "2026-10-29T08:27:58.827928141Z",
  "refresh_token": "gJcz_9rpvSTBjSTPepXf1nPKP0J6XKXixdgMDjZiHOE",
  "refresh_expires_at": "2026-11-28T08:12:58.827516924Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c551d1fc-0bc4-4c52-a0f7-8ba34d1de261",
  "session_id": "17cb67ad-0474-4ef9-b1a7-16fc1b06be96",
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
  "session_id": "8d1930af-7026-4b9c-82f1-dfcf8a156923",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI0NzksImlhdCI6MTc5MzI2MTU3OSwianRpIjoiNjAyNTM1ZGQtZDc5Zi00YWNjLTgyY2UtNzU4N2E5ZWQzNzY5Iiwic2lkIjoiOGQxOTMwYWYtNzAyNi00YjljLTgyZjEtZGZjZjhhMTU2OTIzIn0.9eoy3ceS8nxYMS8g9lmkQfoA2O3QGnDsRWaXGv4Vnvs",
  "access_expires_at": "2026-10-29T08:27:59.405870796Z",
  "refresh_token": "gQpZLtdMaWjgZNYlI6zENV1QmL7R0qareVGrJSG6t_4",
  "refresh_expires_at": "2026-10-29T20:12:59.405460495Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=1058238&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "c551d1fc-0bc4-4c52-a0f7-8ba34d1de261",
      "phone": "+380661058238",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T08:12:58.826048Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/c551d1fc-0bc4-4c52-a0f7-8ba34d1de261` → **200**

```json
{
  "client": {
    "id": "c551d1fc-0bc4-4c52-a0f7-8ba34d1de261",
    "phone": "+380661058238",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T08:12:58.826048Z",
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

`POST /api/admin/v1/clients/c551d1fc-0bc4-4c52-a0f7-8ba34d1de261/block` → **400**

```json
{
  "command_id": "ec68ec72-6e7b-4201-98c8-4d27769be0ba",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/c551d1fc-0bc4-4c52-a0f7-8ba34d1de261/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "252edcf7-d391-4ac7-bd0f-cdf6926b721e",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/c551d1fc-0bc4-4c52-a0f7-8ba34d1de261/block` → **200**

```json
{
  "command_id": "8063917f-1207-47ff-9bae-61cc4e9abe28",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "c551d1fc-0bc4-4c52-a0f7-8ba34d1de261",
  "phone": "+380661058238",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T08:12:58.826048Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T08:13:00.277994Z",
    "by": "3a4258dd-3209-4d24-8c44-4c5661453235"
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
  "correlation_id": "8537f2f5-1eb2-44d8-980d-bc01435c0e57"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661058238",
  "device_ref": "sandbox-16053"
}
```

```json
{
  "challenge_id": "e2b407da-05bb-4fcf-befd-36bb5abfc0e3",
  "expires_at": "2026-10-29T08:18:02.645461794Z",
  "resend_available_at": "2026-10-29T08:13:03.645461794Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661058238` → **200**

```json
{
  "phone": "+380661058238",
  "audience": "CLIENT",
  "code": "581238",
  "sent_at": "2026-10-29T08:13:02.647638522Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "e2b407da-05bb-4fcf-befd-36bb5abfc0e3",
  "code": "581238",
  "device_ref": "sandbox-16053"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "47f66962-0aa0-4083-9432-4a3043bcb58b"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/c551d1fc-0bc4-4c52-a0f7-8ba34d1de261` → **200**

```json
{
  "client": {
    "id": "c551d1fc-0bc4-4c52-a0f7-8ba34d1de261",
    "phone": "+380661058238",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T08:12:58.826048Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T08:13:00.277994Z",
      "by": "3a4258dd-3209-4d24-8c44-4c5661453235"
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

`POST /api/admin/v1/clients/c551d1fc-0bc4-4c52-a0f7-8ba34d1de261/unblock` → **200**

```json
{
  "command_id": "5aab6366-5ecb-49ca-9af7-fa96859c004c",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "c551d1fc-0bc4-4c52-a0f7-8ba34d1de261",
  "phone": "+380661058238",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T08:12:58.826048Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661058238",
  "device_ref": "sandbox-295"
}
```

```json
{
  "challenge_id": "f7f2af1f-b0e0-4462-891a-a7907836680f",
  "expires_at": "2026-10-29T08:18:05.479474465Z",
  "resend_available_at": "2026-10-29T08:13:06.479474465Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661058238` → **200**

```json
{
  "phone": "+380661058238",
  "audience": "CLIENT",
  "code": "746052",
  "sent_at": "2026-10-29T08:13:05.481143228Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f7f2af1f-b0e0-4462-891a-a7907836680f",
  "code": "746052",
  "device_ref": "sandbox-295"
}
```

```json
{
  "session_id": "16f0e091-fb1d-4030-a353-7f07d5221c3f",
  "subject": {
    "type": "CLIENT",
    "id": "c551d1fc-0bc4-4c52-a0f7-8ba34d1de261"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNTUxZDFmYy0wYmM0LTRjNTItYTBmNy04YmEzNGQxZGUyNjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNDg1LCJpYXQiOjE3OTMyNjE1ODUsImp0aSI6IjZkYzgwZDM5LWNjM2MtNDE2OS1hNzgxLWYzMzVlYWNkNzY2ZiIsInNpZCI6IjE2ZjBlMDkxLWZiMWQtNDAzMC1hMzUzLTdmMDdkNTIyMWMzZiJ9.SLoqsgX6AQoBLSfH3u5viY1sGjDzz3FOFgy7jGbmwzk",
  "access_expires_at": "2026-10-29T08:28:05.685558534Z",
  "refresh_token": "eDw0II5zWk2Z227ZqAnaWFCpFgugVJPCHMVmqGXd-Ws",
  "refresh_expires_at": "2026-11-28T08:13:05.685031842Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c551d1fc-0bc4-4c52-a0f7-8ba34d1de261",
  "session_id": "16f0e091-fb1d-4030-a353-7f07d5221c3f",
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
  "phone": "+380668058965",
  "device_ref": "sandbox-22786"
}
```

```json
{
  "challenge_id": "24bde6da-5c40-44a8-ac71-5fcf0fa1eb7e",
  "expires_at": "2026-10-29T08:18:06.054851973Z",
  "resend_available_at": "2026-10-29T08:13:07.054851973Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668058965` → **200**

```json
{
  "phone": "+380668058965",
  "audience": "CLIENT",
  "code": "801151",
  "sent_at": "2026-10-29T08:13:06.056848277Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "24bde6da-5c40-44a8-ac71-5fcf0fa1eb7e",
  "code": "801151",
  "device_ref": "sandbox-22786"
}
```

```json
{
  "session_id": "f20aa05b-ef76-468c-affa-fb3a4e3eadca",
  "subject": {
    "type": "CLIENT",
    "id": "d2021ce0-c28f-495a-b8bf-08d5f5025ca3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMjAyMWNlMC1jMjhmLTQ5NWEtYjhiZi0wOGQ1ZjUwMjVjYTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNDg2LCJpYXQiOjE3OTMyNjE1ODYsImp0aSI6Ijg2ODBhNDZiLTFlNTctNGFkNi1iMWM5LTA4ODE1NmI0ZWNhYiIsInNpZCI6ImYyMGFhMDViLWVmNzYtNDY4Yy1hZmZhLWZiM2E0ZTNlYWRjYSJ9.jti7GHqz3szp9Q-QXAnDdhuCbCwMXlIPc7gGzaZTAIw",
  "access_expires_at": "2026-10-29T08:28:06.258778835Z",
  "refresh_token": "n6bu0z9mzafhdfNBJ5C8-yodAW9FsUTiuWn8VOTDxD0",
  "refresh_expires_at": "2026-11-28T08:13:06.258446462Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bedd276a-2428-4fa0-845e-10e4eedf3cac",
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
  "id": "7c54cc6a-b058-4e92-a142-11798b152deb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:18:06.452670Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 47b25cc4-e732-48f5-9131-062906936e07) → **201**

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
  "session_id": "0b24ef86-431a-4847-95db-4422b695b97d",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI0ODYsImlhdCI6MTc5MzI2MTU4NiwianRpIjoiYzUxOWJmNzEtNDY2Yy00ZjU3LWFiM2EtNGIyYmI1NDBhZThlIiwic2lkIjoiMGIyNGVmODYtNDMxYS00ODQ3LTk1ZGItNDQyMmI2OTViOTdkIn0.KDQmKSjdUvQrrgFoXpn4Z5aySBV3D_jtgDM3o3zmjLQ",
  "access_expires_at": "2026-10-29T08:28:06.87600563Z",
  "refresh_token": "I_DF9vQYZllfZ5aNS6ooGI4L2xDcSgXDVJRHxoucSNc",
  "refresh_expires_at": "2026-10-29T20:13:06.875611254Z",
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
  "session_id": "e4c215b6-dc03-4442-ac3b-0d932348733e",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI0ODcsImlhdCI6MTc5MzI2MTU4NywianRpIjoiNjMyYWY5MDgtZGVjYy00NDc5LWIzYTctMTg5YmJmNDM0YWQyIiwic2lkIjoiZTRjMjE1YjYtZGMwMy00NDQyLWFjM2ItMGQ5MzIzNDg3MzNlIn0.IJxOQLQeeuBDaNQdEQJWQN5f869CQIfkCfQHF9Qjb2U",
  "access_expires_at": "2026-10-29T08:28:07.262183697Z",
  "refresh_token": "RNMQT3oGjNxdVIoBplU0ktJjs0DOeayD8AG_am_vvOs",
  "refresh_expires_at": "2026-10-29T20:13:07.261827419Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2ddacdbe-da6d-475c-9172-934678d38440/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T08:13:06.640741Z",
      "actor": {
        "type": "CLIENT",
        "id": "d2021ce0-c28f-495a-b8bf-08d5f5025ca3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2ddacdbe-da6d-475c-9172-934678d38440",
        "quote_id": "7c54cc6a-b058-4e92-a142-11798b152deb",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "47b25cc4-e732-48f5-9131-062906936e07"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T08:13:06.64254Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2ddacdbe-da6d-475c-9172-934678d38440",
        "attempt_id": "76da1e56-83f8-4844-80c6-f5c983f5d62f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "47b25cc4-e732-48f5-9131-062906936e07"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T08:13:06.647272Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2ddacdbe-da6d-475c-9172-934678d38440",
        "attempt_id": "76da1e56-83f8-4844-80c6-f5c983f5d62f"
      },
      "correlation_id": "47b25cc4-e732-48f5-9131-062906936e07"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "76da1e56-83f8-4844-80c6-f5c983f5d62f",
        "generation": 1,
        "started_at": "2026-10-29T08:13:06.641813Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T08:13:06.647272Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T08:13:06.643075Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/47b25cc4-e732-48f5-9131-062906936e07` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "2ddacdbe-da6d-475c-9172-934678d38440:0",
      "order_id": "2ddacdbe-da6d-475c-9172-934678d38440",
      "at": "2026-10-29T08:13:06.640741Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "2ddacdbe-da6d-475c-9172-934678d38440:1",
      "order_id": "2ddacdbe-da6d-475c-9172-934678d38440",
      "at": "2026-10-29T08:13:06.64254Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "2ddacdbe-da6d-475c-9172-934678d38440:2",
      "order_id": "2ddacdbe-da6d-475c-9172-934678d38440",
      "at": "2026-10-29T08:13:06.647272Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/f895318d-9e99-4183-b906-3807309705b7` → **200**

```json
{
  "found": []
}
```

Done: request 47b25cc4-e732-48f5-9131-062906936e07 — order 2ddacdbe-da6d-475c-9172-934678d38440 found by its id.

`GET /api/rider/v1/orders/2ddacdbe-da6d-475c-9172-934678d38440` → **200**

```json
{
  "id": "2ddacdbe-da6d-475c-9172-934678d38440",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d2021ce0-c28f-495a-b8bf-08d5f5025ca3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:13:06.64034Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2ddacdbe-da6d-475c-9172-934678d38440/cancel` → **200**

```json
{
  "command_id": "bde303ec-f5a8-4c44-af41-005448ea1277",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2ddacdbe-da6d-475c-9172-934678d38440",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d2021ce0-c28f-495a-b8bf-08d5f5025ca3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:13:06.64034Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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
  "phone": "+380630996789",
  "device_ref": "sandbox-25522"
}
```

```json
{
  "challenge_id": "f49fd781-18d1-4326-9d49-ace9a06002fb",
  "expires_at": "2026-10-29T08:18:08.454401355Z",
  "resend_available_at": "2026-10-29T08:13:09.454401355Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630996789` → **200**

```json
{
  "phone": "+380630996789",
  "audience": "CLIENT",
  "code": "124638",
  "sent_at": "2026-10-29T08:13:08.456440613Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f49fd781-18d1-4326-9d49-ace9a06002fb",
  "code": "124638",
  "device_ref": "sandbox-25522"
}
```

```json
{
  "session_id": "17b45c8a-4280-4ecc-a782-22cdb757f974",
  "subject": {
    "type": "CLIENT",
    "id": "130dafac-6d2b-4e83-b843-ab008871ab1a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzBkYWZhYy02ZDJiLTRlODMtYjg0My1hYjAwODg3MWFiMWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNDg4LCJpYXQiOjE3OTMyNjE1ODgsImp0aSI6Ijk2NTk5Y2EzLTJmM2ItNDRkYi1hMmNjLTdjNjQ2MGIzODZmMSIsInNpZCI6IjE3YjQ1YzhhLTQyODAtNGVjYy1hNzgyLTIyY2RiNzU3Zjk3NCJ9.re8kWCYEe4EvOLBpw8rBKeDWSX9ku-H-oPUdkfDzxFY",
  "access_expires_at": "2026-10-29T08:28:08.667973647Z",
  "refresh_token": "3A74AG_ZdEdIrumfcm_SkF32EIKFgeoWuQETuBm05J0",
  "refresh_expires_at": "2026-11-28T08:13:08.667513701Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "fb8162e3-fecf-47c4-8f36-909559286e62",
  "expires_at": "2026-10-29T08:18:10.88250271Z",
  "resend_available_at": "2026-10-29T08:13:11.88250271Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630996789` → **200**

```json
{
  "phone": "+380630996789",
  "audience": "CLIENT",
  "code": "147685",
  "sent_at": "2026-10-29T08:13:10.884024886Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "fc81fade-10ad-4e64-9e30-0bc1e83e7056",
  "challenge_id": "fb8162e3-fecf-47c4-8f36-909559286e62",
  "otp_code": "147685"
}
```

```json
{
  "id": "2ab1c03a-5dd5-4e2c-8e36-281a9b3b8bf2",
  "state": "PENDING",
  "created_at": "2026-10-29T08:13:11.08661Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/2ab1c03a-5dd5-4e2c-8e36-281a9b3b8bf2` → **200**

```json
{
  "id": "2ab1c03a-5dd5-4e2c-8e36-281a9b3b8bf2",
  "state": "PENDING",
  "created_at": "2026-10-29T08:13:11.08661Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/2ab1c03a-5dd5-4e2c-8e36-281a9b3b8bf2` → **200**

```json
{
  "id": "2ab1c03a-5dd5-4e2c-8e36-281a9b3b8bf2",
  "state": "PENDING",
  "created_at": "2026-10-29T08:13:11.08661Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/2ab1c03a-5dd5-4e2c-8e36-281a9b3b8bf2` → **200**

```json
{
  "id": "2ab1c03a-5dd5-4e2c-8e36-281a9b3b8bf2",
  "state": "PENDING",
  "created_at": "2026-10-29T08:13:11.08661Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/2ab1c03a-5dd5-4e2c-8e36-281a9b3b8bf2` → **200**

```json
{
  "id": "2ab1c03a-5dd5-4e2c-8e36-281a9b3b8bf2",
  "state": "PENDING",
  "created_at": "2026-10-29T08:13:11.08661Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/2ab1c03a-5dd5-4e2c-8e36-281a9b3b8bf2` → **200**

```json
{
  "id": "2ab1c03a-5dd5-4e2c-8e36-281a9b3b8bf2",
  "state": "PENDING",
  "created_at": "2026-10-29T08:13:11.08661Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/2ab1c03a-5dd5-4e2c-8e36-281a9b3b8bf2` → **200**

```json
{
  "id": "2ab1c03a-5dd5-4e2c-8e36-281a9b3b8bf2",
  "state": "PENDING",
  "created_at": "2026-10-29T08:13:11.08661Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/2ab1c03a-5dd5-4e2c-8e36-281a9b3b8bf2` → **200**

```json
{
  "id": "2ab1c03a-5dd5-4e2c-8e36-281a9b3b8bf2",
  "state": "READY",
  "created_at": "2026-10-29T08:13:11.08661Z",
  "ready_at": "2026-10-29T08:13:17.503085Z",
  "expires_at": "2026-11-05T08:13:17.503085Z",
  "size_bytes": 1030
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/2ab1c03a-5dd5-4e2c-8e36-281a9b3b8bf2/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633166836",
  "device_ref": "sandbox-18513"
}
```

```json
{
  "challenge_id": "4dfdb721-2f29-4c89-b327-903650a52331",
  "expires_at": "2026-10-29T08:18:18.502081714Z",
  "resend_available_at": "2026-10-29T08:13:19.502081714Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633166836` → **200**

```json
{
  "phone": "+380633166836",
  "audience": "CLIENT",
  "code": "030051",
  "sent_at": "2026-10-29T08:13:18.504111848Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4dfdb721-2f29-4c89-b327-903650a52331",
  "code": "030051",
  "device_ref": "sandbox-18513"
}
```

```json
{
  "session_id": "55be86f4-e9ad-4eb2-a2a4-c8a1267f9b20",
  "subject": {
    "type": "CLIENT",
    "id": "ea70c710-cacd-4e49-80d7-89e6fe8d10bf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYTcwYzcxMC1jYWNkLTRlNDktODBkNy04OWU2ZmU4ZDEwYmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNDk4LCJpYXQiOjE3OTMyNjE1OTgsImp0aSI6IjIzNzdmYWM5LTQ4NTUtNDQzNi04MjliLTFiNTFlMDRmZTQ3NiIsInNpZCI6IjU1YmU4NmY0LWU5YWQtNGViMi1hMmE0LWM4YTEyNjdmOWIyMCJ9.OkQRslh9LpHB6f29C9YXbWjkq5H4WVY6BPh4MuRbb14",
  "access_expires_at": "2026-10-29T08:28:18.702634703Z",
  "refresh_token": "v-CyB_Tib7M6Nwud8VDch-lSriWkp0CQ6-HlbO3-mDo",
  "refresh_expires_at": "2026-11-28T08:13:18.702268524Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/2ab1c03a-5dd5-4e2c-8e36-281a9b3b8bf2/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/2ab1c03a-5dd5-4e2c-8e36-281a9b3b8bf2/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "53ba5c85-354a-4575-ac7f-3fdb12f1fb45"
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
  "session_id": "b933dced-1757-4a15-b66b-3780ab672d79",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI0OTksImlhdCI6MTc5MzI2MTU5OSwianRpIjoiOTg0ZGNkNDQtMWY4ZS00MTgxLTkxYjctZWUwNGQ3ODY1MWUyIiwic2lkIjoiYjkzM2RjZWQtMTc1Ny00YTE1LWI2NmItMzc4MGFiNjcyZDc5In0.EnFiX6ZEBfrHuKQad28hTeL_rAmacsfaihwhV1NGAb4",
  "access_expires_at": "2026-10-29T08:28:19.261973762Z",
  "refresh_token": "oYFsfkOzTe0-duA-zVx5KY3mpPjdVw3tPSn43gbSAQg",
  "refresh_expires_at": "2026-10-29T20:13:19.260216996Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "130dafac-6d2b-4e83-b843-ab008871ab1a",
  "session_id": "17b45c8a-4280-4ecc-a782-22cdb757f974",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/130dafac-6d2b-4e83-b843-ab008871ab1a/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "2ab1c03a-5dd5-4e2c-8e36-281a9b3b8bf2",
      "state": "READY",
      "created_at": "2026-10-29T08:13:11.08661Z",
      "ready_at": "2026-10-29T08:13:17.503085Z",
      "expires_at": "2026-11-05T08:13:17.503085Z",
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
  "device_ref": "sandbox-11486"
}
```

```json
{
  "challenge_id": "14dd5cb4-b010-4016-a693-8e62e5515edb",
  "expires_at": "2026-10-29T08:18:19.836895132Z",
  "resend_available_at": "2026-10-29T08:13:20.836895132Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "748139",
  "sent_at": "2026-10-29T08:13:19.838546133Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "14dd5cb4-b010-4016-a693-8e62e5515edb",
  "code": "748139",
  "device_ref": "sandbox-11486"
}
```

```json
{
  "session_id": "f57ec2da-4891-428f-8ab9-43d858a83c78",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjUwMCwiaWF0IjoxNzkzMjYxNjAwLCJqdGkiOiIwYjNiMDkyMy01ZGRiLTQzYzQtODk4MS1kYTNiZjNkMDM2NDgiLCJzaWQiOiJmNTdlYzJkYS00ODkxLTQyOGYtOGFiOS00M2Q4NThhODNjNzgifQ.9upodM3g2W4ssCqmAglJvmFHxDVSUIb2T8i_eA9lit0",
  "access_expires_at": "2026-10-29T08:28:20.030182126Z",
  "refresh_token": "TEnej1dtd1HZPuH-Wyy4mhzfZ1J2EeEydA-SVw7hDFo",
  "refresh_expires_at": "2026-11-28T08:13:20.029787694Z",
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
  "device_ref": "sandbox-3277"
}
```

```json
{
  "challenge_id": "d01fa1fa-053f-423b-a154-8dbe304121e8",
  "expires_at": "2026-10-29T08:18:20.377560526Z",
  "resend_available_at": "2026-10-29T08:13:21.377560526Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "688841",
  "sent_at": "2026-10-29T08:13:20.379293677Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d01fa1fa-053f-423b-a154-8dbe304121e8",
  "code": "688841",
  "device_ref": "sandbox-3277"
}
```

```json
{
  "session_id": "97c16398-4639-447d-8451-c2a22f0a4e6d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjUwMCwiaWF0IjoxNzkzMjYxNjAwLCJqdGkiOiI5YmM5YmY4OC01MTkyLTRkNTItYWVjNi04YWU3ZDhkMGEwM2UiLCJzaWQiOiI5N2MxNjM5OC00NjM5LTQ0N2QtODQ1MS1jMmEyMmYwYTRlNmQifQ.Rsd11fft8ABKKjHEbGG5I26YLRUpogqu9KnW5-6GYVo",
  "access_expires_at": "2026-10-29T08:28:20.577268994Z",
  "refresh_token": "G8tRsw3EzSa52kYtwLNK6i8u9fPiStjpCSyu2TGPp-0",
  "refresh_expires_at": "2026-11-28T08:13:20.576891878Z",
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
  "command_id": "8eaf6f20-2d76-4235-b9da-93aac42d0b1a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:13:20Z",
    "sequence": 1793261600932
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "43afb6e1-ac25-43d4-ad34-563309f0a7f7",
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
  "last_heartbeat_at": "2026-10-29T08:13:20.948336Z",
  "last_location_at": "2026-10-29T08:13:20.948336Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-11409"
}
```

```json
{
  "challenge_id": "2e284dac-594f-47b9-a3ab-1a7b21b2a9e8",
  "expires_at": "2026-10-29T08:18:21.129426109Z",
  "resend_available_at": "2026-10-29T08:13:22.129426109Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "973190",
  "sent_at": "2026-10-29T08:13:21.131796883Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e284dac-594f-47b9-a3ab-1a7b21b2a9e8",
  "code": "973190",
  "device_ref": "sandbox-11409"
}
```

```json
{
  "session_id": "db7fe074-4dd1-4338-a5cb-df73db46033f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjUwMSwiaWF0IjoxNzkzMjYxNjAxLCJqdGkiOiI0NmViNDJmZS01ZjM3LTQxMGQtOGNjYS00OGVmNmQ3Y2E4YTYiLCJzaWQiOiJkYjdmZTA3NC00ZGQxLTQzMzgtYTVjYi1kZjczZGI0NjAzM2YifQ.BZPBkj7Dn5Qt2qPZb9Y3_eCM6XUKCypbWJsYIAax-Bg",
  "access_expires_at": "2026-10-29T08:28:21.333236893Z",
  "refresh_token": "Nwr9ZZmrxGyDC0JN6vTtRcJrJnZvfp7kcqahyk7KttA",
  "refresh_expires_at": "2026-11-28T08:13:21.332881155Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e6008818-da2a-4233-b491-0d8210ca96ce",
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
  "last_heartbeat_at": "2026-10-29T08:12:19.804876Z",
  "last_location_at": "2026-10-29T08:12:19.804876Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e6008818-da2a-4233-b491-0d8210ca96ce/handover` → **200**

```json
{
  "command_id": "7d7e9e52-a396-4f5b-aece-f548df6eb39b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e6008818-da2a-4233-b491-0d8210ca96ce",
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
  "last_heartbeat_at": "2026-10-29T08:12:19.804876Z",
  "last_location_at": "2026-10-29T08:12:19.804876Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e6008818-da2a-4233-b491-0d8210ca96ce/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:13:21Z",
    "sequence": 1793261601869
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e6008818-da2a-4233-b491-0d8210ca96ce",
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
  "last_heartbeat_at": "2026-10-29T08:13:21.884835Z",
  "last_location_at": "2026-10-29T08:13:21.884835Z",
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
  "session_id": "3af05c08-8e9e-485a-80f6-3c45b051fd67",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1MDIsImlhdCI6MTc5MzI2MTYwMiwianRpIjoiYzk2OGEzMGYtNzk0ZS00NTU1LTljNGEtMTRhYzY0ODJmMzM2Iiwic2lkIjoiM2FmMDVjMDgtOGU5ZS00ODVhLTgwZjYtM2M0NWIwNTFmZDY3In0.JyDztoa2Hcng26XJHnYvyDf-NWkfsi-60zuK7HAtY98",
  "access_expires_at": "2026-10-29T08:28:22.257939498Z",
  "refresh_token": "knGJo2nimglKEfGkouMyqzQZ-c7Mb6AguqJe1qWsm-o",
  "refresh_expires_at": "2026-10-29T20:13:22.257607186Z",
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
  "session_id": "b523637c-dae4-41ed-870e-5d405075c8c4",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1MDIsImlhdCI6MTc5MzI2MTYwMiwianRpIjoiMjVjMWY0NWQtYzU4ZC00MTM3LWJjNDUtYWQyYzk2YjExNjllIiwic2lkIjoiYjUyMzYzN2MtZGFlNC00MWVkLTg3MGUtNWQ0MDUwNzVjOGM0In0.QUj0E69I1Fv4IPe198omraVViDNWzFXzPSFUYgmOEsY",
  "access_expires_at": "2026-10-29T08:28:22.622337643Z",
  "refresh_token": "LXbwADbuFX8QMAcnx9QUurww_JUXaM1V2wWSEGQLthY",
  "refresh_expires_at": "2026-10-29T20:13:22.621949226Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380687739103",
  "device_ref": "sandbox-8142"
}
```

```json
{
  "challenge_id": "57c379e0-4daf-4183-933d-067ebeced3ed",
  "expires_at": "2026-10-29T08:18:22.798629714Z",
  "resend_available_at": "2026-10-29T08:13:23.798629714Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380687739103` → **200**

```json
{
  "phone": "+380687739103",
  "audience": "CLIENT",
  "code": "674013",
  "sent_at": "2026-10-29T08:13:22.800478299Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57c379e0-4daf-4183-933d-067ebeced3ed",
  "code": "674013",
  "device_ref": "sandbox-8142"
}
```

```json
{
  "session_id": "2591a578-0e54-4327-bd74-a2ce19279794",
  "subject": {
    "type": "CLIENT",
    "id": "0e441188-b3b6-47b0-a378-a36eb6e0ebf0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZTQ0MTE4OC1iM2I2LTQ3YjAtYTM3OC1hMzZlYjZlMGViZjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNTAzLCJpYXQiOjE3OTMyNjE2MDMsImp0aSI6IjllYzEzNzJkLWVjZDQtNDdkNS1iZDI1LTAxZmVhMGRhMDI2NiIsInNpZCI6IjI1OTFhNTc4LTBlNTQtNDMyNy1iZDc0LWEyY2UxOTI3OTc5NCJ9.aIVEfyVawHlmtC-QdKX-n2Y_aNLg7_z0mF38fhRNoHk",
  "access_expires_at": "2026-10-29T08:28:23.002800308Z",
  "refresh_token": "sKKgXM-vI83df6GdAwllGrRF0p14lAauuL866oci6WU",
  "refresh_expires_at": "2026-11-28T08:13:23.002451091Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "969409e7-2d6d-4d6a-9232-ba9101e1cc76",
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
  "id": "13487737-5eef-456b-bb88-80dda83cfaa8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:18:23.200661Z",
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
  "command_id": "57c27bf1-909c-46ff-9b8d-dbb94342317d",
  "quote_id": "13487737-5eef-456b-bb88-80dda83cfaa8",
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
  "id": "d0f4e05a-5583-431e-b197-0b434a7b1cd4",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0e441188-b3b6-47b0-a378-a36eb6e0ebf0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:13:23.405753Z",
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
    "id": "6c7db35a-4150-494e-9cdb-50f1ffad4cf8",
    "order_id": "d0f4e05a-5583-431e-b197-0b434a7b1cd4",
    "expires_at": "2026-10-29T08:13:38.40796Z",
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

`POST /api/driver/v1/offers/6c7db35a-4150-494e-9cdb-50f1ffad4cf8/reject` → **204**

```json
{
  "command_id": "50636c68-ca1a-41d1-9a20-8099022788e4"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "e0bd771f-11db-4421-b2c3-c54d6f5d9e92",
    "order_id": "d0f4e05a-5583-431e-b197-0b434a7b1cd4",
    "expires_at": "2026-10-29T08:13:38.784454Z",
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

`POST /api/driver/v1/offers/e0bd771f-11db-4421-b2c3-c54d6f5d9e92/accept` → **200**

```json
{
  "command_id": "8eb7f9ba-61af-4c08-bed6-22e637976e32"
}
```

```json
{
  "id": "1f860d6e-6c5b-438d-94eb-c93f3770f063",
  "order_id": "d0f4e05a-5583-431e-b197-0b434a7b1cd4",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ab2426f4-fe75-44e4-ad1a-3c703e85de3c",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/d0f4e05a-5583-431e-b197-0b434a7b1cd4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T08:13:23.406096Z",
      "actor": {
        "type": "CLIENT",
        "id": "0e441188-b3b6-47b0-a378-a36eb6e0ebf0",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d0f4e05a-5583-431e-b197-0b434a7b1cd4",
        "quote_id": "13487737-5eef-456b-bb88-80dda83cfaa8",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "5ed64c50-6ea3-441a-aa30-817a5bb1aaed"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T08:13:23.407409Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d0f4e05a-5583-431e-b197-0b434a7b1cd4",
        "attempt_id": "a88ef8d5-aae1-48bb-8228-c9559fbd34eb",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5ed64c50-6ea3-441a-aa30-817a5bb1aaed"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T08:13:23.409857Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6c7db35a-4150-494e-9cdb-50f1ffad4cf8",
        "order_id": "d0f4e05a-5583-431e-b197-0b434a7b1cd4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "5ed64c50-6ea3-441a-aa30-817a5bb1aaed"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T08:13:23.783713Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6c7db35a-4150-494e-9cdb-50f1ffad4cf8",
        "order_id": "d0f4e05a-5583-431e-b197-0b434a7b1cd4"
      },
      "correlation_id": "311fb48d-a171-4443-9907-960d39900ee8"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order d0f4e05a-5583-431e-b197-0b434a7b1cd4 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/d0f4e05a-5583-431e-b197-0b434a7b1cd4` → **200**

```json
{
  "id": "d0f4e05a-5583-431e-b197-0b434a7b1cd4",
  "short_number": 10,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "0e441188-b3b6-47b0-a378-a36eb6e0ebf0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "1f860d6e-6c5b-438d-94eb-c93f3770f063",
    "order_id": "d0f4e05a-5583-431e-b197-0b434a7b1cd4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "ab2426f4-fe75-44e4-ad1a-3c703e85de3c",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T08:13:23.405753Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d0f4e05a-5583-431e-b197-0b434a7b1cd4/cancel` → **200**

```json
{
  "command_id": "04b58923-2bd4-4e07-9501-41ee1fa26948",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d0f4e05a-5583-431e-b197-0b434a7b1cd4",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "0e441188-b3b6-47b0-a378-a36eb6e0ebf0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "1f860d6e-6c5b-438d-94eb-c93f3770f063",
    "order_id": "d0f4e05a-5583-431e-b197-0b434a7b1cd4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "ab2426f4-fe75-44e4-ad1a-3c703e85de3c",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T08:13:23.405753Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
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
  "session_id": "43afb6e1-ac25-43d4-ad34-563309f0a7f7",
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
  "last_heartbeat_at": "2026-10-29T08:13:20.948336Z",
  "last_location_at": "2026-10-29T08:13:20.948336Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/43afb6e1-ac25-43d4-ad34-563309f0a7f7/close` → **200**

```json
{
  "command_id": "99d376b7-06bb-4b91-88e6-018f6c903658",
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
  "session_id": "e6008818-da2a-4233-b491-0d8210ca96ce",
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
  "last_heartbeat_at": "2026-10-29T08:13:21.884835Z",
  "last_location_at": "2026-10-29T08:13:21.884835Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e6008818-da2a-4233-b491-0d8210ca96ce/close` → **200**

```json
{
  "command_id": "179ae7e9-9c03-403d-932f-dd65788208f6",
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
  "session_id": "7ac3a62e-b048-4f0b-836d-2bb9855dca0a",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1MDUsImlhdCI6MTc5MzI2MTYwNSwianRpIjoiYzM4YjlhMGQtOTYwNS00ODI3LTljNjYtMjIzMzQzZGQwMWM3Iiwic2lkIjoiN2FjM2E2MmUtYjA0OC00ZjBiLTgzNmQtMmJiOTg1NWRjYTBhIn0.GuymkPOJ1Cg9OqJWoIozKikobT2BiQDx9cQl2wGZBXg",
  "access_expires_at": "2026-10-29T08:28:25.702187626Z",
  "refresh_token": "76kW0h0xOqviw99zFoLysVkgRMpm72k_8jVZH9K8Y6Q",
  "refresh_expires_at": "2026-10-29T20:13:25.701816976Z",
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
  "command_id": "a924cda5-e5cf-49c7-b963-b2d5ed95a30a",
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
  "changed_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T08:13:26.068112Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "97cea052-a532-4809-9a6d-24652f009dff",
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
  "correlation_id": "b8d8ca9d-d18e-4743-a64a-511a2b5702a8"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "78a3bab0-d0c6-4e33-b282-6ff29d9631cb",
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
  "correlation_id": "56cb1061-3587-48c4-b2a0-a72ffe7eaa2d"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634030977",
  "device_ref": "sandbox-7084"
}
```

```json
{
  "challenge_id": "c70ab179-08c3-4002-99b4-a6ae34c1b5d1",
  "expires_at": "2026-10-29T08:18:26.617303911Z",
  "resend_available_at": "2026-10-29T08:13:27.617303911Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634030977` → **200**

```json
{
  "phone": "+380634030977",
  "audience": "CLIENT",
  "code": "409196",
  "sent_at": "2026-10-29T08:13:26.619392198Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c70ab179-08c3-4002-99b4-a6ae34c1b5d1",
  "code": "409196",
  "device_ref": "sandbox-7084"
}
```

```json
{
  "session_id": "cd43084a-b40d-4c4d-b592-15b3bd5476b4",
  "subject": {
    "type": "CLIENT",
    "id": "ae8b78bb-9b51-4b0e-b663-22043538fc0f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZThiNzhiYi05YjUxLTRiMGUtYjY2My0yMjA0MzUzOGZjMGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNTA2LCJpYXQiOjE3OTMyNjE2MDYsImp0aSI6ImIzNTIzMjE2LTdlZDMtNGE4Yi1iMjU0LThjNzYwMzkyOTM5ZCIsInNpZCI6ImNkNDMwODRhLWI0MGQtNGM0ZC1iNTkyLTE1YjNiZDU0NzZiNCJ9.JLn3RThTtsI-aOMh9xBubmxSQX_kRnASouOZwIkgrEM",
  "access_expires_at": "2026-10-29T08:28:26.882972915Z",
  "refresh_token": "NGyGc4cWrif21ntKjz036RXmlBZlJuucId08gd5xAKY",
  "refresh_expires_at": "2026-11-28T08:13:26.882582715Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7d7fa844-a7a3-4ef8-8cf0-fea1ebdd403e",
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
  "id": "29ae8f80-b621-46ee-8845-4811d43b3ad7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:18:27.067343Z",
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
  "command_id": "23db4123-8c04-4ff6-9393-457a6d2cdf8b",
  "quote_id": "29ae8f80-b621-46ee-8845-4811d43b3ad7",
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
  "correlation_id": "51fdcabb-0b1b-437c-9f79-f56a86c8241a"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "332c107f-1fb5-45b4-92de-27a5a1c9f4cc",
  "quote_id": "29ae8f80-b621-46ee-8845-4811d43b3ad7",
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
  "id": "f837ab56-8b71-41db-8d2d-608ea955ff97",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ae8b78bb-9b51-4b0e-b663-22043538fc0f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:13:27.428166Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f837ab56-8b71-41db-8d2d-608ea955ff97/cancel` → **200**

```json
{
  "command_id": "f4d066ef-22fd-4bcd-b839-7a47ab7a1c75",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f837ab56-8b71-41db-8d2d-608ea955ff97",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ae8b78bb-9b51-4b0e-b663-22043538fc0f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:13:27.428166Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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
  "command_id": "c1bfc780-1704-4eec-b759-9bbab24875e2",
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
  "changed_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T08:13:27.873312Z"
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
      "changed_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T08:13:27.873312Z"
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
  "device_ref": "sandbox-23404"
}
```

```json
{
  "challenge_id": "6ab2131c-d2c0-4bbf-a218-2c500dde5537",
  "expires_at": "2026-10-29T08:18:28.438559082Z",
  "resend_available_at": "2026-10-29T08:13:29.438559082Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "048789",
  "sent_at": "2026-10-29T08:13:28.440218Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ab2131c-d2c0-4bbf-a218-2c500dde5537",
  "code": "048789",
  "device_ref": "sandbox-23404"
}
```

```json
{
  "session_id": "bc496758-d1e4-4cf8-97c5-d355cb7c3224",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjUwOCwiaWF0IjoxNzkzMjYxNjA4LCJqdGkiOiI2YjVjNzM0Ny04NDc0LTQxMGQtYTFjYS0wNDkzMDg3OWI4NjciLCJzaWQiOiJiYzQ5Njc1OC1kMWU0LTRjZjgtOTdjNS1kMzU1Y2I3YzMyMjQifQ.Pwj43JPVOL7WhnQBTsoytiBILXHklKlRkng3TP_jvIQ",
  "access_expires_at": "2026-10-29T08:28:28.634593547Z",
  "refresh_token": "z0mmNSiHxWyDCJQHUc_OHt0Re5yImDvjaPG348O1-RE",
  "refresh_expires_at": "2026-11-28T08:13:28.634212901Z",
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
  "command_id": "25f45e15-f256-4d1e-851c-376f6b7ec7d0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:13:28Z",
    "sequence": 1793261608976
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c2708828-f4b3-4337-864d-dd7a900c8119",
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
  "last_heartbeat_at": "2026-10-29T08:13:28.991275Z",
  "last_location_at": "2026-10-29T08:13:28.991275Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671381186",
  "device_ref": "sandbox-2120"
}
```

```json
{
  "challenge_id": "1f28f3ab-9a7f-49a8-b851-f18536a90a51",
  "expires_at": "2026-10-29T08:18:29.16916184Z",
  "resend_available_at": "2026-10-29T08:13:30.16916184Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671381186` → **200**

```json
{
  "phone": "+380671381186",
  "audience": "CLIENT",
  "code": "773277",
  "sent_at": "2026-10-29T08:13:29.171087962Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1f28f3ab-9a7f-49a8-b851-f18536a90a51",
  "code": "773277",
  "device_ref": "sandbox-2120"
}
```

```json
{
  "session_id": "9d1ef078-0de0-4ab9-a655-da6e9d9c5cc2",
  "subject": {
    "type": "CLIENT",
    "id": "032a171f-5a7e-422a-839c-0f79913ff3a5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzJhMTcxZi01YTdlLTQyMmEtODM5Yy0wZjc5OTEzZmYzYTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNTA5LCJpYXQiOjE3OTMyNjE2MDksImp0aSI6IjYxZTY5NTc2LWFkNzMtNDI5My1hM2IzLTAyMTk5MjI3ZTBiMyIsInNpZCI6IjlkMWVmMDc4LTBkZTAtNGFiOS1hNjU1LWRhNmU5ZDljNWNjMiJ9.3MK3xFoXFxmUEDKL4y9tJ6pviIdLMDrsCB_D1wMngAk",
  "access_expires_at": "2026-10-29T08:28:29.38805599Z",
  "refresh_token": "v57rQVJzxcGwQjG-o3sVqBVVLikwvVRByS_QXDNOwtI",
  "refresh_expires_at": "2026-11-28T08:13:29.387550045Z",
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
  "command_id": "67388a52-88ca-4402-8162-fbbf4805a6bc",
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
  "id": "a326a65e-261d-43ae-926c-f0ba11543ba7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:18:29.796463Z",
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
  "command_id": "27bbb90a-58ab-4e2d-88aa-3e9ed398b245",
  "platform": "ANDROID",
  "token": "sandbox-driver-4516c04f-522c-4ee8-9ba8-d283da3c0986"
}
```

```json
{
  "id": "251ff522-c527-4e71-bf0f-d19b9643bc65",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T08:13:29.990272Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "b515bd3b-aa36-46e3-b99e-61c665a2470e",
  "platform": "ANDROID",
  "token": "sandbox-rider-88e71f16-abdb-4e49-b2cf-fe18266e47a6"
}
```

```json
{
  "id": "2ce42fcf-b870-4757-b5b5-20268cdb2b76",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T08:13:30.169753Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3af14411-4dc4-42e6-9669-a9d24587f4d1",
  "quote_id": "a326a65e-261d-43ae-926c-f0ba11543ba7",
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
  "id": "1d6df1af-2a35-41b0-883d-4028bddced78",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "032a171f-5a7e-422a-839c-0f79913ff3a5",
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
  "created_at": "2026-10-29T08:13:30.355093Z",
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
    "id": "a1aa88d0-8065-4393-b2a7-c4ec09b6740e",
    "order_id": "1d6df1af-2a35-41b0-883d-4028bddced78",
    "expires_at": "2026-10-29T08:13:45.35766Z",
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

`POST /api/driver/v1/offers/a1aa88d0-8065-4393-b2a7-c4ec09b6740e/accept` → **200**

```json
{
  "command_id": "dc1f7c48-fc33-46c4-9471-67c58d2c7e96"
}
```

```json
{
  "id": "be825b66-6330-4942-b2a0-06ca85c4ad58",
  "order_id": "1d6df1af-2a35-41b0-883d-4028bddced78",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fe22351d-00b9-4535-8bf9-f5fbf555baa1",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T08:13:30.333Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T08:13:30.333Z` → **200**

```json
[
  {
    "at": "2026-10-29T08:13:31.828025042Z",
    "token_suffix": "3c0986",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "c49a9080-fd01-45f0-804f-62e819a9d6c0",
      "order_version": "2",
      "order_id": "1d6df1af-2a35-41b0-883d-4028bddced78",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380671381186&after=2026-10-29T08:13:30.333Z` → **200**

```json
[
  {
    "at": "2026-10-29T08:13:31.829713649Z",
    "token_suffix": "6e47a6",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "98cfbbb7-457b-4733-a618-cd145a565450",
      "order_version": "3",
      "order_id": "1d6df1af-2a35-41b0-883d-4028bddced78",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/1d6df1af-2a35-41b0-883d-4028bddced78/messages` → **201**

```json
{
  "command_id": "715e26da-3754-48ad-b971-0948a9421e59",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "173e1a9c-ed8e-4305-9e95-70ebb9969df4",
  "order_id": "1d6df1af-2a35-41b0-883d-4028bddced78",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T08:13:31.979511691Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fe22351d-00b9-4535-8bf9-f5fbf555baa1",
  "order_id": "1d6df1af-2a35-41b0-883d-4028bddced78",
  "assignment_id": "be825b66-6330-4942-b2a0-06ca85c4ad58",
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

`POST /api/driver/v1/trips/fe22351d-00b9-4535-8bf9-f5fbf555baa1/messages` → **201**

```json
{
  "command_id": "b24447e9-856d-4c8d-b94f-f16a8f6e996c",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "ae918120-0317-4d7e-951b-9c841db0898f",
  "order_id": "1d6df1af-2a35-41b0-883d-4028bddced78",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T08:13:32.33444319Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/1d6df1af-2a35-41b0-883d-4028bddced78/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/fe22351d-00b9-4535-8bf9-f5fbf555baa1/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380671381186"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/c2708828-f4b3-4337-864d-dd7a900c8119/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:13:32Z",
    "sequence": 1793261612909
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c2708828-f4b3-4337-864d-dd7a900c8119",
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
  "last_heartbeat_at": "2026-10-29T08:13:32.925057Z",
  "last_location_at": "2026-10-29T08:13:32.925057Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fe22351d-00b9-4535-8bf9-f5fbf555baa1",
  "order_id": "1d6df1af-2a35-41b0-883d-4028bddced78",
  "assignment_id": "be825b66-6330-4942-b2a0-06ca85c4ad58",
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

`POST /api/driver/v1/trips/fe22351d-00b9-4535-8bf9-f5fbf555baa1/arrive` → **200**

```json
{
  "command_id": "c407763e-1794-4df0-a7a8-e79a66eb00be",
  "expected_version": 0
}
```

```json
{
  "id": "fe22351d-00b9-4535-8bf9-f5fbf555baa1",
  "order_id": "1d6df1af-2a35-41b0-883d-4028bddced78",
  "assignment_id": "be825b66-6330-4942-b2a0-06ca85c4ad58",
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
  "arrived_at": "2026-10-29T08:13:33.272692Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fe22351d-00b9-4535-8bf9-f5fbf555baa1/start` → **200**

```json
{
  "command_id": "0c95b402-8b72-46df-ace9-113470b6c16b",
  "expected_version": 1
}
```

```json
{
  "id": "fe22351d-00b9-4535-8bf9-f5fbf555baa1",
  "order_id": "1d6df1af-2a35-41b0-883d-4028bddced78",
  "assignment_id": "be825b66-6330-4942-b2a0-06ca85c4ad58",
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
  "arrived_at": "2026-10-29T08:13:33.272692Z",
  "started_at": "2026-10-29T08:13:33.45456Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/c2708828-f4b3-4337-864d-dd7a900c8119/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:13:33Z",
    "sequence": 1793261613634
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c2708828-f4b3-4337-864d-dd7a900c8119",
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
  "last_heartbeat_at": "2026-10-29T08:13:33.650767Z",
  "last_location_at": "2026-10-29T08:13:33.650767Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/fe22351d-00b9-4535-8bf9-f5fbf555baa1/complete` → **200**

```json
{
  "command_id": "1ced9296-3f3b-4474-8ef6-8b080dbbe08f",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:13:33Z",
  "cash_received": true
}
```

```json
{
  "id": "fe22351d-00b9-4535-8bf9-f5fbf555baa1",
  "order_id": "1d6df1af-2a35-41b0-883d-4028bddced78",
  "assignment_id": "be825b66-6330-4942-b2a0-06ca85c4ad58",
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
  "arrived_at": "2026-10-29T08:13:33.272692Z",
  "started_at": "2026-10-29T08:13:33.45456Z",
  "completed_at": "2026-10-29T08:13:33.837513Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/1d6df1af-2a35-41b0-883d-4028bddced78` → **200**

```json
{
  "id": "1d6df1af-2a35-41b0-883d-4028bddced78",
  "short_number": 12,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "032a171f-5a7e-422a-839c-0f79913ff3a5",
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
    "id": "be825b66-6330-4942-b2a0-06ca85c4ad58",
    "order_id": "1d6df1af-2a35-41b0-883d-4028bddced78",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "fe22351d-00b9-4535-8bf9-f5fbf555baa1",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T08:13:30.355093Z",
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
    "id": "1d6df1af-2a35-41b0-883d-4028bddced78",
    "short_number": 12,
    "status": "FULFILLED",
    "created_at": "2026-10-29T08:13:30.355093Z",
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
    "id": "fe22351d-00b9-4535-8bf9-f5fbf555baa1",
    "order_id": "1d6df1af-2a35-41b0-883d-4028bddced78",
    "order_short_number": 12,
    "created_at": "2026-10-29T08:13:30.715635Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "d45678c8-7a72-4ebe-bf79-504834c4f9ac",
    "order_id": "744cbd7a-19c4-43f0-821f-2442bbfef378",
    "order_short_number": 8,
    "created_at": "2026-10-29T08:12:45.337368Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "ba45bcca-cb33-4a78-980d-40a529b2b39c",
    "order_id": "31835055-31c5-4661-a366-7d1209b5f59f",
    "order_short_number": 3,
    "created_at": "2026-10-29T08:12:11.93518Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "3579941e-f8b7-4059-8854-80c0d66da6dc",
    "order_id": "11a30086-8882-4339-be9d-6bef37edee8e",
    "order_short_number": 2,
    "created_at": "2026-10-29T08:11:53.872418Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "723ca7a9-b9f2-4356-8e8a-646f79ec7f14",
    "order_id": "39d3fdef-6a63-4aad-9b07-b3aea01b8534",
    "order_short_number": 1,
    "created_at": "2026-10-29T08:11:47.486774Z",
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

`GET /api/rider/v1/orders/1d6df1af-2a35-41b0-883d-4028bddced78/tip` → **200**

```json
{
  "order_id": "1d6df1af-2a35-41b0-883d-4028bddced78",
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
  "available_until": "2026-10-30T08:13:33.837513Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/1d6df1af-2a35-41b0-883d-4028bddced78/tip` → **201**

```json
{
  "command_id": "446338bf-90c7-47c1-9c22-238108c3c413",
  "amount_minor": 1100
}
```

```json
{
  "id": "b47ae2c3-6808-4aec-9379-2d7891e42306",
  "order_id": "1d6df1af-2a35-41b0-883d-4028bddced78",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T08:13:38.200799Z"
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
  "session_id": "3fc0f082-4b78-4c38-8c99-844efcce60fb",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1MTgsImlhdCI6MTc5MzI2MTYxOCwianRpIjoiMTkzNzEwZmUtYWQwOC00ZWU2LWI2NTQtOThlN2VmODJjNzNhIiwic2lkIjoiM2ZjMGYwODItNGI3OC00YzM4LThjOTktODQ0ZWZjY2U2MGZiIn0.N7owwJft6eXf0oqGQiY89X7Ng1RC_03bLXgIVMfdjMA",
  "access_expires_at": "2026-10-29T08:28:38.583468643Z",
  "refresh_token": "HM6AdD8ZyxMaD6Y_3dlnWdYFsLZd5aGb_9OUXXJctX8",
  "refresh_expires_at": "2026-10-29T20:13:38.583157643Z",
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
          "DRIVER": 1,
          "RIDER": 3,
          "STAFF": 1
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
      "DRIVER": 1,
      "RIDER": 3,
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
  "generated_at": "2026-10-29T08:13:38.76701548Z"
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
  "generated_at": "2026-10-29T08:13:38.952142321Z"
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
  "session_id": "6a9376fc-304d-47c7-84cd-4ae745c9a5e2",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1MTksImlhdCI6MTc5MzI2MTYxOSwianRpIjoiYTQyNWRiZWUtN2ZiMC00MDhjLWFlNGYtNjA2ZDk0Yjg4NmI5Iiwic2lkIjoiNmE5Mzc2ZmMtMzA0ZC00N2M3LTg0Y2QtNGFlNzQ1YzlhNWUyIn0.aK6Fc43t_F2zilaDRTJQ0q0oxwEf994_h1NUhtHgk0k",
  "access_expires_at": "2026-10-29T08:28:39.339894152Z",
  "refresh_token": "0qsdbPOjBXaGJsGMrne77Y4u4o3TX30vf9poBtc9YTI",
  "refresh_expires_at": "2026-10-29T20:13:39.339456901Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/1d6df1af-2a35-41b0-883d-4028bddced78/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T08:13:30.355568Z",
      "actor": {
        "type": "CLIENT",
        "id": "032a171f-5a7e-422a-839c-0f79913ff3a5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1d6df1af-2a35-41b0-883d-4028bddced78",
        "quote_id": "a326a65e-261d-43ae-926c-f0ba11543ba7",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "654bdd36-4423-4b99-bb19-ef044144f103"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T08:13:30.357105Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1d6df1af-2a35-41b0-883d-4028bddced78",
        "attempt_id": "17219167-09ce-4483-a6ae-98326431f07d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "654bdd36-4423-4b99-bb19-ef044144f103"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T08:13:30.359193Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a1aa88d0-8065-4393-b2a7-c4ec09b6740e",
        "order_id": "1d6df1af-2a35-41b0-883d-4028bddced78",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "654bdd36-4423-4b99-bb19-ef044144f103"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T08:13:30.716799Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a1aa88d0-8065-4393-b2a7-c4ec09b6740e",
        "order_id": "1d6df1af-2a35-41b0-883d-4028bddced78",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "be825b66-6330-4942-b2a0-06ca85c4ad58"
      },
      "correlation_id": "641ce869-16e2-4b56-a7e6-8c7adb0e0d34"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T08:13:39.706870272Z",
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
      "last_location_at": "2026-10-29T08:13:33.650767Z",
      "order_id": null
    }
  ]
}
```

Done: order 1d6df1af-2a35-41b0-883d-4028bddced78.

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
  "session_id": "24f30a5f-951f-4e19-bc4f-f6f5c725de3b",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1MjAsImlhdCI6MTc5MzI2MTYyMCwianRpIjoiNjIwYjE5MjEtNjY4Ny00YzhmLWExMDgtNmE2YmUyNjA1MmZjIiwic2lkIjoiMjRmMzBhNWYtOTUxZi00ZTE5LWJjNGYtZjZmNWM3MjVkZTNiIn0.-Yc3P8EitOfQpFLfn8k12DXnnUODbSgDueKGtYQmnGk",
  "access_expires_at": "2026-10-29T08:28:40.10386966Z",
  "refresh_token": "7VbIll6-3bXoyYMYMkFVGpFOVYRLrA76HMCV0N6mXxw",
  "refresh_expires_at": "2026-10-29T20:13:40.10351956Z",
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
  "command_id": "61d332e4-7663-48c0-81cb-2ba4d1f62efc",
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
  "timestamp": "2026-10-29T08:13:40.000+0000",
  "channel": {
    "id": "1730052000.1795116839",
    "linkedid": "1730052000.1795116839",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671245821"
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
  "timestamp": "2026-10-29T08:13:40.000+0000",
  "channel": {
    "id": "1730052000.1795116839",
    "linkedid": "1730052000.1795116839",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671245821"
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
  "session_id": "a1578e00-30a3-4860-8dc2-9594c48ff6fc",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1MjAsImlhdCI6MTc5MzI2MTYyMCwianRpIjoiMzQzM2Q1MmQtYjk2ZS00NjEzLWEyOTUtNmE4Y2E2MWUyNDBjIiwic2lkIjoiYTE1NzhlMDAtMzBhMy00ODYwLThkYzItOTU5NGM0OGZmNmZjIn0.bN449N0ddYGFzadba3KvS-X4450vJ8whaEEM0JAO-tk",
  "access_expires_at": "2026-10-29T08:28:40.879791126Z",
  "refresh_token": "TePkdr0-G8QK7wuz0LNlCKBFgdyWNPkEvuYdNSbCDj8",
  "refresh_expires_at": "2026-10-29T20:13:40.879426604Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "e5eec9ad-8883-4a33-97e7-9f1577d88b30",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671245821",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T08:13:40Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/e5eec9ad-8883-4a33-97e7-9f1577d88b30/answer` → **200**

```json
{
  "command_id": "3567ef18-5ca8-4dc7-b215-db0c40abee8d"
}
```

```json
{
  "id": "e5eec9ad-8883-4a33-97e7-9f1577d88b30",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671245821",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "order_ids": [],
  "started_at": "2026-10-29T08:13:40Z",
  "answered_at": "2026-10-29T08:13:41.250593Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1795116839",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c387324e-8466-42fd-acd8-cb6e1d13731b",
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
  "id": "31a923ee-b55f-4535-887c-96ea58c55887",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:18:41.458477Z",
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
  "command_id": "a354f466-d81f-4892-8a17-9a64f332f83e",
  "quote_id": "31a923ee-b55f-4535-887c-96ea58c55887",
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
    "phone": "+380671245821"
  },
  "call_id": "e5eec9ad-8883-4a33-97e7-9f1577d88b30"
}
```

```json
{
  "id": "4b9b25a4-5021-41f9-bf7a-fbf99b2ecef8",
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
  "created_at": "2026-10-29T08:13:41.647291Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671245821"
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
    "id": "1730052000.1795116839",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "e5eec9ad-8883-4a33-97e7-9f1577d88b30",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671245821",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "order_ids": [
        "4b9b25a4-5021-41f9-bf7a-fbf99b2ecef8"
      ],
      "started_at": "2026-10-29T08:13:40Z",
      "answered_at": "2026-10-29T08:13:41.250593Z",
      "ended_at": "2026-10-29T08:13:41.884392Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "fc489761-c66f-4da2-a2c7-c576d8fcb01c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675530979",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "order_ids": [],
      "started_at": "2026-10-29T08:12:00.165105Z",
      "answered_at": "2026-10-29T08:12:00.485057Z",
      "ended_at": "2026-10-29T08:12:00.750762Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T08:12:07.500533Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/4b9b25a4-5021-41f9-bf7a-fbf99b2ecef8` → **200**

```json
{
  "id": "4b9b25a4-5021-41f9-bf7a-fbf99b2ecef8",
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
  "created_at": "2026-10-29T08:13:41.647291Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671245821"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/4b9b25a4-5021-41f9-bf7a-fbf99b2ecef8` → **200**

```json
{
  "id": "4b9b25a4-5021-41f9-bf7a-fbf99b2ecef8",
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
  "created_at": "2026-10-29T08:13:41.647291Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671245821"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4b9b25a4-5021-41f9-bf7a-fbf99b2ecef8/cancel` → **200**

```json
{
  "command_id": "ca9babe5-f586-4a7a-bd67-80508396ac86",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4b9b25a4-5021-41f9-bf7a-fbf99b2ecef8",
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
  "created_at": "2026-10-29T08:13:41.647291Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671245821"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call e5eec9ad-8883-4a33-97e7-9f1577d88b30 with order 4b9b25a4-5021-41f9-bf7a-fbf99b2ecef8.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16567"
}
```

```json
{
  "challenge_id": "dbb3b558-be5c-4b61-a4c2-fa92599c056e",
  "expires_at": "2026-10-29T08:18:42.672351624Z",
  "resend_available_at": "2026-10-29T08:13:43.672351624Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "955906",
  "sent_at": "2026-10-29T08:13:42.674032916Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dbb3b558-be5c-4b61-a4c2-fa92599c056e",
  "code": "955906",
  "device_ref": "sandbox-16567"
}
```

```json
{
  "session_id": "7a9d92f8-3b9d-4e40-8ff4-0972996a411d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjUyMiwiaWF0IjoxNzkzMjYxNjIyLCJqdGkiOiJhMWMwYzQzOS1jMzAzLTRmMWEtYmVlZS04YzdlMmQwN2ZjZjciLCJzaWQiOiI3YTlkOTJmOC0zYjlkLTRlNDAtOGZmNC0wOTcyOTk2YTQxMWQifQ.dXsNmcgzTvhJ7bzNGHT5VZenugUpXjitknQpNwroZWI",
  "access_expires_at": "2026-10-29T08:28:42.870116464Z",
  "refresh_token": "lik6LOw2tAZutGdaStAo9Cn0DOCOSXUT1fsFsGX9O80",
  "refresh_expires_at": "2026-11-28T08:13:42.869776639Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c2708828-f4b3-4337-864d-dd7a900c8119",
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
  "last_heartbeat_at": "2026-10-29T08:13:33.650767Z",
  "last_location_at": "2026-10-29T08:13:33.650767Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c2708828-f4b3-4337-864d-dd7a900c8119/handover` → **200**

```json
{
  "command_id": "d1460c45-0c7d-448c-8b8b-fd1ffc623feb",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c2708828-f4b3-4337-864d-dd7a900c8119",
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
  "last_heartbeat_at": "2026-10-29T08:13:33.650767Z",
  "last_location_at": "2026-10-29T08:13:33.650767Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c2708828-f4b3-4337-864d-dd7a900c8119/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:13:43Z",
    "sequence": 1793261623405
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c2708828-f4b3-4337-864d-dd7a900c8119",
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
  "last_heartbeat_at": "2026-10-29T08:13:43.421316Z",
  "last_location_at": "2026-10-29T08:13:43.421316Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664655534",
  "device_ref": "sandbox-2700"
}
```

```json
{
  "challenge_id": "5be7a27d-99b5-42ec-857d-44770a6d94cc",
  "expires_at": "2026-10-29T08:18:43.597517986Z",
  "resend_available_at": "2026-10-29T08:13:44.597517986Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664655534` → **200**

```json
{
  "phone": "+380664655534",
  "audience": "CLIENT",
  "code": "654805",
  "sent_at": "2026-10-29T08:13:43.599259603Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5be7a27d-99b5-42ec-857d-44770a6d94cc",
  "code": "654805",
  "device_ref": "sandbox-2700"
}
```

```json
{
  "session_id": "9a22407f-e1fe-4fac-a845-f7b5fb72edb2",
  "subject": {
    "type": "CLIENT",
    "id": "3d81c98d-44ed-414f-a6a5-e5f42392c8d5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZDgxYzk4ZC00NGVkLTQxNGYtYTZhNS1lNWY0MjM5MmM4ZDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNTIzLCJpYXQiOjE3OTMyNjE2MjMsImp0aSI6ImU3YjI0ZDU4LTgxNWYtNGIyYi04OTIxLTdmMjQzNGJmNTcyZCIsInNpZCI6IjlhMjI0MDdmLWUxZmUtNGZhYy1hODQ1LWY3YjVmYjcyZWRiMiJ9.iaMJ49P1jUkarvgr396PHUXp7OH5c5uy1Vz7lsI9zN4",
  "access_expires_at": "2026-10-29T08:28:43.808722386Z",
  "refresh_token": "w0RrVkFRjiFT5IFlIr3OuPTVjHNE9vZ6x0Tuu7o_EbM",
  "refresh_expires_at": "2026-11-28T08:13:43.808315781Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a84abfb1-c87a-4f63-9443-4e471043c0cf",
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
  "id": "c86d0ef5-8eea-4bb7-a9c1-0084c17fd9f8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:18:43.991161Z",
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
  "command_id": "d05a4971-32c1-47e3-b477-c2dca07f90a5",
  "quote_id": "c86d0ef5-8eea-4bb7-a9c1-0084c17fd9f8",
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
  "id": "f8aa913f-d4cf-4627-8be1-1d0f9a452263",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3d81c98d-44ed-414f-a6a5-e5f42392c8d5",
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
  "created_at": "2026-10-29T08:13:44.173802Z",
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
    "id": "9f59abe8-7d6a-40ff-9eb2-c33ac2d55113",
    "order_id": "f8aa913f-d4cf-4627-8be1-1d0f9a452263",
    "expires_at": "2026-10-29T08:13:59.175776Z",
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

`POST /api/driver/v1/offers/9f59abe8-7d6a-40ff-9eb2-c33ac2d55113/accept` → **200**

```json
{
  "command_id": "7853fe78-b4c6-4bc3-a5af-651cda4be37c"
}
```

```json
{
  "id": "87f07f01-45c3-4d9d-9634-f5136f0eb79a",
  "order_id": "f8aa913f-d4cf-4627-8be1-1d0f9a452263",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3b003300-4352-4bcf-bbf3-d029786d82db",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3b003300-4352-4bcf-bbf3-d029786d82db",
  "order_id": "f8aa913f-d4cf-4627-8be1-1d0f9a452263",
  "assignment_id": "87f07f01-45c3-4d9d-9634-f5136f0eb79a",
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

`POST /api/driver/v1/work-sessions/c2708828-f4b3-4337-864d-dd7a900c8119/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:13:44Z",
    "sequence": 1793261624904
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c2708828-f4b3-4337-864d-dd7a900c8119",
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
  "last_heartbeat_at": "2026-10-29T08:13:44.920295Z",
  "last_location_at": "2026-10-29T08:13:44.920295Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3b003300-4352-4bcf-bbf3-d029786d82db/arrive` → **200**

```json
{
  "command_id": "1484fa83-7e04-4642-9b87-e0786537b751",
  "expected_version": 0
}
```

```json
{
  "id": "3b003300-4352-4bcf-bbf3-d029786d82db",
  "order_id": "f8aa913f-d4cf-4627-8be1-1d0f9a452263",
  "assignment_id": "87f07f01-45c3-4d9d-9634-f5136f0eb79a",
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
  "arrived_at": "2026-10-29T08:13:45.143295Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3b003300-4352-4bcf-bbf3-d029786d82db/start` → **200**

```json
{
  "command_id": "a6b66a71-ebf6-4ad5-a911-2546c5ed1fc1",
  "expected_version": 1
}
```

```json
{
  "id": "3b003300-4352-4bcf-bbf3-d029786d82db",
  "order_id": "f8aa913f-d4cf-4627-8be1-1d0f9a452263",
  "assignment_id": "87f07f01-45c3-4d9d-9634-f5136f0eb79a",
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
  "arrived_at": "2026-10-29T08:13:45.143295Z",
  "started_at": "2026-10-29T08:13:45.33722Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/c2708828-f4b3-4337-864d-dd7a900c8119/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:13:45Z",
    "sequence": 1793261625515
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c2708828-f4b3-4337-864d-dd7a900c8119",
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
  "last_heartbeat_at": "2026-10-29T08:13:45.530088Z",
  "last_location_at": "2026-10-29T08:13:45.530088Z",
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
  "device_ref": "sandbox-3373"
}
```

```json
{
  "challenge_id": "2e0ed59c-662d-42ac-8d13-e50845f43671",
  "expires_at": "2026-10-29T08:18:45.710410282Z",
  "resend_available_at": "2026-10-29T08:13:46.710410282Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "322568",
  "sent_at": "2026-10-29T08:13:45.711883944Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e0ed59c-662d-42ac-8d13-e50845f43671",
  "code": "322568",
  "device_ref": "sandbox-3373"
}
```

```json
{
  "session_id": "af7ea559-9590-4a4e-ab38-08c539df8379",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjUyNSwiaWF0IjoxNzkzMjYxNjI1LCJqdGkiOiIyZTI2MTVhYy1iNTRkLTQzNjEtOGFjMC00NDI4ZjUzNjgyZmEiLCJzaWQiOiJhZjdlYTU1OS05NTkwLTRhNGUtYWIzOC0wOGM1MzlkZjgzNzkifQ.mVPIASqhisC-k2qu6ANd2yX4BLBTO-WSejY8meVSXSY",
  "access_expires_at": "2026-10-29T08:28:45.913878027Z",
  "refresh_token": "K3hTtZ38N80T121IJoHfs0FHoftWe9VHHToyFYFkx_w",
  "refresh_expires_at": "2026-11-28T08:13:45.913469348Z",
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
  "command_id": "d7feb26a-4814-4ea4-acd1-9b2315a93fa9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:13:46Z",
    "sequence": 1793261626261
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "31ef8d66-8167-435f-b4ed-a55c15c07e5e",
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
  "last_heartbeat_at": "2026-10-29T08:13:46.282278Z",
  "last_location_at": "2026-10-29T08:13:46.282278Z",
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
  "session_id": "2fe1240c-b8ca-4351-ac18-407d9bac66de",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1MjYsImlhdCI6MTc5MzI2MTYyNiwianRpIjoiMWE5Y2JiN2ItZWJjYi00M2ViLWI2MjUtN2NhMTQzZDgxZWE5Iiwic2lkIjoiMmZlMTI0MGMtYjhjYS00MzUxLWFjMTgtNDA3ZDliYWM2NmRlIn0.ksC7EcMM63V0gnvGll0yUSme36BABl7qRQoHuPDsowE",
  "access_expires_at": "2026-10-29T08:28:46.6934486Z",
  "refresh_token": "DEMrvO6Co3rS69V_b2Y4U14HXqcokGA5pviLbXi3Pfk",
  "refresh_expires_at": "2026-10-29T20:13:46.693103687Z",
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
  "session_id": "b5b707ae-3ebd-44ba-bf5e-de1e897eccf7",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1MjcsImlhdCI6MTc5MzI2MTYyNywianRpIjoiMjk4ODUyOGItMjg5Yy00MjU3LTkwNmItZjZkMzIxYzBjODRjIiwic2lkIjoiYjViNzA3YWUtM2ViZC00NGJhLWJmNWUtZGUxZTg5N2VjY2Y3In0.RutN-RGWbBr9OQlMIRiGEX6SJofJK7aAXpsuqfql85c",
  "access_expires_at": "2026-10-29T08:28:47.067049313Z",
  "refresh_token": "1Wt4UanI_K7uzP8jUk3cDZSe3q25S4lt1bYE8X-XiY8",
  "refresh_expires_at": "2026-10-29T20:13:47.06672376Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f8aa913f-d4cf-4627-8be1-1d0f9a452263` → **200**

```json
{
  "id": "f8aa913f-d4cf-4627-8be1-1d0f9a452263",
  "short_number": 14,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "3d81c98d-44ed-414f-a6a5-e5f42392c8d5",
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
    "id": "87f07f01-45c3-4d9d-9634-f5136f0eb79a",
    "order_id": "f8aa913f-d4cf-4627-8be1-1d0f9a452263",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "3b003300-4352-4bcf-bbf3-d029786d82db",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T08:13:44.173802Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f8aa913f-d4cf-4627-8be1-1d0f9a452263/interrupt` → **200**

```json
{
  "command_id": "08c4767b-21e5-49ec-b54f-8af644e2a308",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "f8aa913f-d4cf-4627-8be1-1d0f9a452263",
    "short_number": 14,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "3d81c98d-44ed-414f-a6a5-e5f42392c8d5",
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
      "id": "87f07f01-45c3-4d9d-9634-f5136f0eb79a",
      "order_id": "f8aa913f-d4cf-4627-8be1-1d0f9a452263",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "3b003300-4352-4bcf-bbf3-d029786d82db",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T08:13:44.173802Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "7693d28a-9adc-40b9-86af-d6e7a3cd9258",
    "short_number": 15,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "3d81c98d-44ed-414f-a6a5-e5f42392c8d5",
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
    "id": "56cc47a3-a8fe-416c-8698-0bfbcc0ba973",
    "order_id": "7693d28a-9adc-40b9-86af-d6e7a3cd9258",
    "expires_at": "2026-10-29T08:14:02.45805Z",
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

`POST /api/driver/v1/offers/56cc47a3-a8fe-416c-8698-0bfbcc0ba973/accept` → **200**

```json
{
  "command_id": "3970e914-8013-4ec4-9577-798a942cc33e"
}
```

```json
{
  "id": "a6e7c2de-813c-4000-b3ff-c03db0bca859",
  "order_id": "7693d28a-9adc-40b9-86af-d6e7a3cd9258",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a831f373-3645-46e1-9c47-6f1463448850",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a831f373-3645-46e1-9c47-6f1463448850",
  "order_id": "7693d28a-9adc-40b9-86af-d6e7a3cd9258",
  "assignment_id": "a6e7c2de-813c-4000-b3ff-c03db0bca859",
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
  "session_id": "31ef8d66-8167-435f-b4ed-a55c15c07e5e",
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
  "last_heartbeat_at": "2026-10-29T08:13:46.282278Z",
  "last_location_at": "2026-10-29T08:13:46.282278Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/31ef8d66-8167-435f-b4ed-a55c15c07e5e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:13:48Z",
    "sequence": 1793261628352
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "31ef8d66-8167-435f-b4ed-a55c15c07e5e",
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
  "last_heartbeat_at": "2026-10-29T08:13:48.36844Z",
  "last_location_at": "2026-10-29T08:13:48.36844Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a831f373-3645-46e1-9c47-6f1463448850/arrive` → **200**

```json
{
  "command_id": "838b5a9d-8986-45c1-8e1d-e99d02b803a8",
  "expected_version": 0
}
```

```json
{
  "id": "a831f373-3645-46e1-9c47-6f1463448850",
  "order_id": "7693d28a-9adc-40b9-86af-d6e7a3cd9258",
  "assignment_id": "a6e7c2de-813c-4000-b3ff-c03db0bca859",
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
  "arrived_at": "2026-10-29T08:13:48.54855Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a831f373-3645-46e1-9c47-6f1463448850/start` → **200**

```json
{
  "command_id": "a0988221-db84-42f3-a97a-67247731ea0c",
  "expected_version": 1
}
```

```json
{
  "id": "a831f373-3645-46e1-9c47-6f1463448850",
  "order_id": "7693d28a-9adc-40b9-86af-d6e7a3cd9258",
  "assignment_id": "a6e7c2de-813c-4000-b3ff-c03db0bca859",
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
  "arrived_at": "2026-10-29T08:13:48.54855Z",
  "started_at": "2026-10-29T08:13:48.732963Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a831f373-3645-46e1-9c47-6f1463448850/complete` → **200**

```json
{
  "command_id": "531fd5d4-2910-47f3-a987-47a51dcf1662",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:13:48Z"
}
```

```json
{
  "id": "a831f373-3645-46e1-9c47-6f1463448850",
  "order_id": "7693d28a-9adc-40b9-86af-d6e7a3cd9258",
  "assignment_id": "a6e7c2de-813c-4000-b3ff-c03db0bca859",
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
  "arrived_at": "2026-10-29T08:13:48.54855Z",
  "started_at": "2026-10-29T08:13:48.732963Z",
  "completed_at": "2026-10-29T08:13:48.924096Z",
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
    "id": "7693d28a-9adc-40b9-86af-d6e7a3cd9258",
    "short_number": 15,
    "status": "FULFILLED",
    "created_at": "2026-10-29T08:13:47.450536Z",
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
    "id": "f8aa913f-d4cf-4627-8be1-1d0f9a452263",
    "short_number": 14,
    "status": "CANCELLED",
    "created_at": "2026-10-29T08:13:44.173802Z",
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
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
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

`GET /api/operator/v1/orders/f8aa913f-d4cf-4627-8be1-1d0f9a452263/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T08:13:44.174177Z",
      "actor": {
        "type": "CLIENT",
        "id": "3d81c98d-44ed-414f-a6a5-e5f42392c8d5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f8aa913f-d4cf-4627-8be1-1d0f9a452263",
        "quote_id": "c86d0ef5-8eea-4bb7-a9c1-0084c17fd9f8",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "cd77bee8-6021-42d3-be10-b6e2c71ae0d7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T08:13:44.175352Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f8aa913f-d4cf-4627-8be1-1d0f9a452263",
        "attempt_id": "0d724a38-b7ba-490a-8da7-533a974337af",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "cd77bee8-6021-42d3-be10-b6e2c71ae0d7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T08:13:44.176956Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9f59abe8-7d6a-40ff-9eb2-c33ac2d55113",
        "order_id": "f8aa913f-d4cf-4627-8be1-1d0f9a452263",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "cd77bee8-6021-42d3-be10-b6e2c71ae0d7"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T08:13:44.553743Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "9f59abe8-7d6a-40ff-9eb2-c33ac2d55113",
        "order_id": "f8aa913f-d4cf-4627-8be1-1d0f9a452263",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "87f07f01-45c3-4d9d-9634-f5136f0eb79a"
      },
      "correlation_id": "7e5cb00e-82fc-4fce-a6da-95bca73fed7b"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/7693d28a-9adc-40b9-86af-d6e7a3cd9258/tip` → **200**

```json
{
  "order_id": "7693d28a-9adc-40b9-86af-d6e7a3cd9258",
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
  "available_until": "2026-10-30T08:13:48.924096Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/7693d28a-9adc-40b9-86af-d6e7a3cd9258/tip` → **409**

```json
{
  "command_id": "47deca78-c851-44f1-9a9e-14ed20085319",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/7693d28a-9adc-40b9-86af-d6e7a3cd9258/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0559cab1-57e5-4db3-a583-4bb8554c8952"
}
```

Done: interrupted f8aa913f-d4cf-4627-8be1-1d0f9a452263, follow-up 7693d28a-9adc-40b9-86af-d6e7a3cd9258.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c2708828-f4b3-4337-864d-dd7a900c8119",
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
  "last_heartbeat_at": "2026-10-29T08:13:45.530088Z",
  "last_location_at": "2026-10-29T08:13:45.530088Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c2708828-f4b3-4337-864d-dd7a900c8119/close` → **200**

```json
{
  "command_id": "da369094-b8f8-415c-b81b-c60308cd02f1",
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
  "session_id": "31ef8d66-8167-435f-b4ed-a55c15c07e5e",
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
  "last_heartbeat_at": "2026-10-29T08:13:48.36844Z",
  "last_location_at": "2026-10-29T08:13:48.36844Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/31ef8d66-8167-435f-b4ed-a55c15c07e5e/close` → **200**

```json
{
  "command_id": "f735bd78-51f9-4a42-9940-96a5f6c205dd",
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
  "session_id": "dea9e14d-b829-48c2-ba59-932f3324ae3d",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1MzMsImlhdCI6MTc5MzI2MTYzMywianRpIjoiZDc0NWQ4M2EtMTNlZi00MGM0LTkzNWUtMDJhNTk3ZjU5OTU2Iiwic2lkIjoiZGVhOWUxNGQtYjgyOS00OGMyLWJhNTktOTMyZjMzMjRhZTNkIn0.Sql8RQouJRGS71mVEI3fCXns8tW7wLbfjyUGiGsLMfE",
  "access_expires_at": "2026-10-29T08:28:53.947541671Z",
  "refresh_token": "4mDDg6UWuub5xAY35OZl3BAFGbWzALG-WkR8u138ZdI",
  "refresh_expires_at": "2026-10-29T20:13:53.946958338Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "38798f7c-317c-481f-a21a-43a7d04198c5",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T08:13:54Z"
}
```

```json
{
  "id": "2b0824e4-e77b-4920-ac1f-48acd51d5020",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T08:13:54Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/2b0824e4-e77b-4920-ac1f-48acd51d5020/publish` → **200**

```json
{
  "command_id": "33415f46-7986-42f1-9ba0-66af84913217",
  "expected_version": 0
}
```

```json
{
  "id": "2b0824e4-e77b-4920-ac1f-48acd51d5020",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T08:13:54.330119Z",
  "published_at": "2026-10-29T08:13:54.330119Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "2b0824e4-e77b-4920-ac1f-48acd51d5020",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T08:13:54.330119Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631802822",
  "device_ref": "sandbox-17137"
}
```

```json
{
  "challenge_id": "6e52c289-22ad-480b-9820-78aa567e00cd",
  "expires_at": "2026-10-29T08:18:54.706257644Z",
  "resend_available_at": "2026-10-29T08:13:55.706257644Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631802822` → **200**

```json
{
  "phone": "+380631802822",
  "audience": "CLIENT",
  "code": "425289",
  "sent_at": "2026-10-29T08:13:54.709060328Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e52c289-22ad-480b-9820-78aa567e00cd",
  "code": "425289",
  "device_ref": "sandbox-17137"
}
```

```json
{
  "session_id": "b973480a-af7b-4fd6-8bad-33286c3a6840",
  "subject": {
    "type": "CLIENT",
    "id": "027b66cb-d226-4fe6-abab-e7bab7d8ff37"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjdiNjZjYi1kMjI2LTRmZTYtYWJhYi1lN2JhYjdkOGZmMzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNTM0LCJpYXQiOjE3OTMyNjE2MzQsImp0aSI6Ijg4OTEzMzdmLTdjNTEtNDliOC04MDAwLWYwOWU4NmE2MTE1MiIsInNpZCI6ImI5NzM0ODBhLWFmN2ItNGZkNi04YmFkLTMzMjg2YzNhNjg0MCJ9.85EkqFpCuhqMRVOvcfyLM7v6-j1u4OHPGL5_36r6C6Y",
  "access_expires_at": "2026-10-29T08:28:54.912640836Z",
  "refresh_token": "o7u3UTolHnUOoyLeUU1FeTNlyq10VznztYndWcHdlLs",
  "refresh_expires_at": "2026-11-28T08:13:54.912146928Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "2b0824e4-e77b-4920-ac1f-48acd51d5020",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T08:13:54.330119Z",
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
  "command_id": "91e6e2e4-92eb-41ef-90e1-95669223433c",
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
  "id": "af2cdc22-6409-450b-9fb8-1b1cdf517155",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:18:55.306573Z",
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
  "command_id": "e3d07f96-0ea1-4e33-a0c8-d67e2badc692",
  "quote_id": "af2cdc22-6409-450b-9fb8-1b1cdf517155",
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
  "correlation_id": "9a106fe4-06f0-4a1c-afd6-3772916edca8"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "6af65b48-8331-4754-9af2-190336312934",
  "version_id": "2b0824e4-e77b-4920-ac1f-48acd51d5020",
  "language": "uk"
}
```

```json
{
  "version_id": "2b0824e4-e77b-4920-ac1f-48acd51d5020",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T08:13:55.667313Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6128db00-e54e-4311-a608-78a758c72bca",
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
  "id": "618fb3b9-02cf-4e62-983f-933293b83de1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:18:55.851562Z",
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
  "command_id": "892cc762-8367-4002-9317-993aaea0533c",
  "quote_id": "618fb3b9-02cf-4e62-983f-933293b83de1",
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
  "id": "4534c788-e5be-43b2-a024-da68d686d0a3",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "027b66cb-d226-4fe6-abab-e7bab7d8ff37",
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
  "created_at": "2026-10-29T08:13:56.04149Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4534c788-e5be-43b2-a024-da68d686d0a3` → **200**

```json
{
  "id": "4534c788-e5be-43b2-a024-da68d686d0a3",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "027b66cb-d226-4fe6-abab-e7bab7d8ff37",
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
  "created_at": "2026-10-29T08:13:56.04149Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4534c788-e5be-43b2-a024-da68d686d0a3/cancel` → **200**

```json
{
  "command_id": "d6f2faf9-f003-4e8b-9509-cc6cce764c9c",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4534c788-e5be-43b2-a024-da68d686d0a3",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "027b66cb-d226-4fe6-abab-e7bab7d8ff37",
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
  "created_at": "2026-10-29T08:13:56.04149Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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

`POST /api/admin/v1/legal-documents/2b0824e4-e77b-4920-ac1f-48acd51d5020` → **409**

```json
{
  "command_id": "6e34e67b-2c30-4673-9376-4ab2ca134a47",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T08:13:56Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/2b0824e4-e77b-4920-ac1f-48acd51d5020",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5866c33e-c0d8-41b2-b6f6-8d1ae52eea77"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "1380ce99-cac5-4e88-a590-f30a865e1548",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T08:13:56Z"
}
```

```json
{
  "id": "57f574cb-3ea5-456f-b287-986921542dcf",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T08:13:56Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/57f574cb-3ea5-456f-b287-986921542dcf/publish` → **200**

```json
{
  "command_id": "d4a5e95d-d89a-4101-a09d-313a50947874",
  "expected_version": 0
}
```

```json
{
  "id": "57f574cb-3ea5-456f-b287-986921542dcf",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T08:13:56.993598Z",
  "published_at": "2026-10-29T08:13:56.993598Z",
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
  "device_ref": "sandbox-30776"
}
```

```json
{
  "challenge_id": "ce1ad2cb-34fd-42a1-a07d-c6fdc6024581",
  "expires_at": "2026-10-29T08:18:57.181884198Z",
  "resend_available_at": "2026-10-29T08:13:58.181884198Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "595917",
  "sent_at": "2026-10-29T08:13:57.183598298Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce1ad2cb-34fd-42a1-a07d-c6fdc6024581",
  "code": "595917",
  "device_ref": "sandbox-30776"
}
```

```json
{
  "session_id": "9d5391c1-9ca2-41b9-9537-61487a12c2eb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjUzNywiaWF0IjoxNzkzMjYxNjM3LCJqdGkiOiIxZmJiMDlmMy04YWY5LTQ1NjgtYmJkZC03MWU0M2I5NTU1MzUiLCJzaWQiOiI5ZDUzOTFjMS05Y2EyLTQxYjktOTUzNy02MTQ4N2ExMmMyZWIifQ.zhslYnArSPBMXHUHLEkvZZhAOGvc6wfSA78nesiIJhI",
  "access_expires_at": "2026-10-29T08:28:57.378927593Z",
  "refresh_token": "jRDX7xpwyu74RIPX7OFt5h2U8_VMdKSck2AId1Zsqek",
  "refresh_expires_at": "2026-11-28T08:13:57.378493079Z",
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
  "command_id": "03fbeb58-449e-429c-b6db-d02ad1da4c23",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:13:57Z",
    "sequence": 1793261637736
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e88c26cd-fa2e-4dfa-a782-a8a1f8bf035e",
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
  "last_heartbeat_at": "2026-10-29T08:13:57.751632Z",
  "last_location_at": "2026-10-29T08:13:57.751632Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672317380",
  "device_ref": "sandbox-9923"
}
```

```json
{
  "challenge_id": "47a06873-36a2-4f65-a838-38f4c9898d5d",
  "expires_at": "2026-10-29T08:18:57.93009919Z",
  "resend_available_at": "2026-10-29T08:13:58.93009919Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672317380` → **200**

```json
{
  "phone": "+380672317380",
  "audience": "CLIENT",
  "code": "340811",
  "sent_at": "2026-10-29T08:13:57.931874122Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "47a06873-36a2-4f65-a838-38f4c9898d5d",
  "code": "340811",
  "device_ref": "sandbox-9923"
}
```

```json
{
  "session_id": "3751c8a5-1f3a-44d0-ac53-48141229e185",
  "subject": {
    "type": "CLIENT",
    "id": "5f27731a-e0de-4210-aee3-9f9109945b1b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZjI3NzMxYS1lMGRlLTQyMTAtYWVlMy05ZjkxMDk5NDViMWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNTM4LCJpYXQiOjE3OTMyNjE2MzgsImp0aSI6ImUxOTUzNDhjLTAzZTYtNDg2ZC05ZWI3LTlkMDU5YTA1NTc3NSIsInNpZCI6IjM3NTFjOGE1LTFmM2EtNDRkMC1hYzUzLTQ4MTQxMjI5ZTE4NSJ9.6qnawtzsNO_9RSX7dGUlNe02Br-xiTnhfOF0ZnBuSVw",
  "access_expires_at": "2026-10-29T08:28:58.148267151Z",
  "refresh_token": "PU9TncX49BXK13Z9oeveswzrKHlvumqhKbr4yMAUh4A",
  "refresh_expires_at": "2026-11-28T08:13:58.147764419Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1e99f196-2bd9-439a-b0e6-5903b3f0938e",
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
  "id": "eb0409fd-2948-45c8-ae27-f10ff164bba6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:18:58.344102Z",
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
  "command_id": "1c67f86b-4203-4410-bea3-d2e9811bffeb",
  "quote_id": "eb0409fd-2948-45c8-ae27-f10ff164bba6",
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
    "phone": "+380671554365"
  }
}
```

```json
{
  "id": "89d3afba-5bc2-497a-9de1-7fa5268543f6",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5f27731a-e0de-4210-aee3-9f9109945b1b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:13:58.534949Z",
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
    "id": "62559f03-bad7-4122-8d4d-bb91d1371227",
    "order_id": "89d3afba-5bc2-497a-9de1-7fa5268543f6",
    "expires_at": "2026-10-29T08:14:13.537258Z",
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

`POST /api/driver/v1/offers/62559f03-bad7-4122-8d4d-bb91d1371227/accept` → **200**

```json
{
  "command_id": "746074f6-0879-4baf-a39c-db338656d09a"
}
```

```json
{
  "id": "de23cc74-79cb-4916-948f-fa02eb7281a5",
  "order_id": "89d3afba-5bc2-497a-9de1-7fa5268543f6",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f573ba4f-eaee-4bff-9ccd-8707e35d000f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f573ba4f-eaee-4bff-9ccd-8707e35d000f",
  "order_id": "89d3afba-5bc2-497a-9de1-7fa5268543f6",
  "assignment_id": "de23cc74-79cb-4916-948f-fa02eb7281a5",
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
    "phone": "+380671554365"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dd9e7d56-9900-4cf5-96e3-7efb69bf7700",
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
  "id": "18d1e2b8-bb3f-47d0-8fb1-865b915037ef",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:18:59.295245Z",
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
  "command_id": "f4e5c611-98e9-4eed-b409-69132751b8dc",
  "quote_id": "18d1e2b8-bb3f-47d0-8fb1-865b915037ef",
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
  "id": "f6fa2f1f-f5f1-48d9-a8bb-66e22bc06d6a",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5f27731a-e0de-4210-aee3-9f9109945b1b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:13:59.487521Z",
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
  "command_id": "ef5bd4cc-a7f2-41fc-b689-81ae1ba09d0e",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T11:13:59Z"
}
```

```json
{
  "id": "0854c93f-d4a8-4428-9061-9a4a56dac6cd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:18:59.704202Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T11:13:59Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "fda6898d-fbeb-48a0-a537-fe2c8125b0a9",
  "quote_id": "0854c93f-d4a8-4428-9061-9a4a56dac6cd",
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
  "pickup_at": "2026-10-29T11:13:59Z"
}
```

```json
{
  "id": "0fa4e2ec-2ae8-40fe-964b-001488097bd2",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5f27731a-e0de-4210-aee3-9f9109945b1b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T08:13:59.894509Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T11:13:59Z",
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
  "command_id": "79359c19-caaa-4ecc-9033-4860c7d629f8",
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
  "id": "287106d2-60f1-4de0-b43f-56bb0a74b708",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:19:00.089209Z",
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
  "command_id": "6402bf71-97bc-4fbc-891e-fbff23bbe5cc",
  "quote_id": "287106d2-60f1-4de0-b43f-56bb0a74b708",
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
  "correlation_id": "a3d6fc11-e213-437a-af0c-7a883e9e9a24"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "0fa4e2ec-2ae8-40fe-964b-001488097bd2",
      "short_number": 19,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "5f27731a-e0de-4210-aee3-9f9109945b1b",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T08:13:59.894509Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T11:13:59Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "f6fa2f1f-f5f1-48d9-a8bb-66e22bc06d6a",
      "short_number": 18,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "5f27731a-e0de-4210-aee3-9f9109945b1b",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T08:13:59.487521Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "89d3afba-5bc2-497a-9de1-7fa5268543f6",
      "short_number": 17,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "f6fa2f1f-f5f1-48d9-a8bb-66e22bc06d6a",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5f27731a-e0de-4210-aee3-9f9109945b1b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:13:59.487521Z",
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

`GET /api/rider/v1/orders/89d3afba-5bc2-497a-9de1-7fa5268543f6` → **200**

```json
{
  "id": "89d3afba-5bc2-497a-9de1-7fa5268543f6",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5f27731a-e0de-4210-aee3-9f9109945b1b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "de23cc74-79cb-4916-948f-fa02eb7281a5",
    "order_id": "89d3afba-5bc2-497a-9de1-7fa5268543f6",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "f573ba4f-eaee-4bff-9ccd-8707e35d000f",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T08:13:58.534949Z",
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
    "location_at": "2026-10-29T08:13:57.751632Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/89d3afba-5bc2-497a-9de1-7fa5268543f6/cancel` → **200**

```json
{
  "command_id": "236b6512-07da-4814-a081-f9ea970e2777",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "89d3afba-5bc2-497a-9de1-7fa5268543f6",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "5f27731a-e0de-4210-aee3-9f9109945b1b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "de23cc74-79cb-4916-948f-fa02eb7281a5",
    "order_id": "89d3afba-5bc2-497a-9de1-7fa5268543f6",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "f573ba4f-eaee-4bff-9ccd-8707e35d000f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T08:13:58.534949Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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

`GET /api/rider/v1/orders/f6fa2f1f-f5f1-48d9-a8bb-66e22bc06d6a` → **200**

```json
{
  "id": "f6fa2f1f-f5f1-48d9-a8bb-66e22bc06d6a",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5f27731a-e0de-4210-aee3-9f9109945b1b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:13:59.487521Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f6fa2f1f-f5f1-48d9-a8bb-66e22bc06d6a/cancel` → **200**

```json
{
  "command_id": "1b661212-2d6c-4f48-add9-554c188ea5e8",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f6fa2f1f-f5f1-48d9-a8bb-66e22bc06d6a",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5f27731a-e0de-4210-aee3-9f9109945b1b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:13:59.487521Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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

`GET /api/rider/v1/orders/0fa4e2ec-2ae8-40fe-964b-001488097bd2` → **200**

```json
{
  "id": "0fa4e2ec-2ae8-40fe-964b-001488097bd2",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5f27731a-e0de-4210-aee3-9f9109945b1b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T08:13:59.894509Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T11:13:59Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0fa4e2ec-2ae8-40fe-964b-001488097bd2/cancel` → **200**

```json
{
  "command_id": "6dcb9ead-d1fe-4a9e-94ab-b66ad0380326",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0fa4e2ec-2ae8-40fe-964b-001488097bd2",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "5f27731a-e0de-4210-aee3-9f9109945b1b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T08:13:59.894509Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
    }
  },
  "pickup_at": "2026-10-29T11:13:59Z",
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
  "session_id": "e88c26cd-fa2e-4dfa-a782-a8a1f8bf035e",
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
  "last_heartbeat_at": "2026-10-29T08:13:57.751632Z",
  "last_location_at": "2026-10-29T08:13:57.751632Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e88c26cd-fa2e-4dfa-a782-a8a1f8bf035e/close` → **200**

```json
{
  "command_id": "3693bd3f-13bc-4991-971f-406fe3910ec2",
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

Done: orders 89d3afba-5bc2-497a-9de1-7fa5268543f6, f6fa2f1f-f5f1-48d9-a8bb-66e22bc06d6a, 0fa4e2ec-2ae8-40fe-964b-001488097bd2.

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
  "session_id": "8ba6269d-5a37-4358-aa92-a405ebac6cbf",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1NDIsImlhdCI6MTc5MzI2MTY0MiwianRpIjoiYTBkMThmNTktMzMxZi00ZWI2LWJhNmMtYWUxZDU4NTU3MTJkIiwic2lkIjoiOGJhNjI2OWQtNWEzNy00MzU4LWFhOTItYTQwNWViYWM2Y2JmIn0.ZMPcIYMXAdpS2fcvYg2U7tsgGIhwZAIh6TIqKuvnSzo",
  "access_expires_at": "2026-10-29T08:29:02.702174864Z",
  "refresh_token": "5ZpS8y4cIqIjBxZAlQfFTS5A5s5bFR2MxUzLj8Lr11Y",
  "refresh_expires_at": "2026-10-29T20:14:02.701784292Z",
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
  "session_id": "131a7e51-4429-45db-9198-3821d5a4a8fe",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1NDMsImlhdCI6MTc5MzI2MTY0MywianRpIjoiNGY4Njg4MDktM2RjMi00MTNhLTg3OTUtNDQ1ZTk4ZjcyMTg2Iiwic2lkIjoiMTMxYTdlNTEtNDQyOS00NWRiLTkxOTgtMzgyMWQ1YTRhOGZlIn0.akD6TtMK0GM6TvAxDVzaCWsd4um_3X7775etpQ8gj3Y",
  "access_expires_at": "2026-10-29T08:29:03.083159673Z",
  "refresh_token": "5VYdrNvZrU2QhmAvJFKFni7P9Ey4wVZ5t3A0vnNhvi0",
  "refresh_expires_at": "2026-10-29T20:14:03.082764745Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11784"
}
```

```json
{
  "challenge_id": "f41cff9d-bbec-42dc-9ebf-fa45e8d47b2c",
  "expires_at": "2026-10-29T08:19:03.265331322Z",
  "resend_available_at": "2026-10-29T08:14:04.265331322Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "232760",
  "sent_at": "2026-10-29T08:14:03.267049046Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f41cff9d-bbec-42dc-9ebf-fa45e8d47b2c",
  "code": "232760",
  "device_ref": "sandbox-11784"
}
```

```json
{
  "session_id": "98b9947c-7d97-47e5-be27-54d23d3c6bf1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjU0MywiaWF0IjoxNzkzMjYxNjQzLCJqdGkiOiI1MDE5NWQzNi00NjRiLTQ4NGEtYWM4OC04NTU0OTY5ZDBiMzYiLCJzaWQiOiI5OGI5OTQ3Yy03ZDk3LTQ3ZTUtYmUyNy01NGQyM2QzYzZiZjEifQ.jFZLYqnT13xgngPH-kI2_woIK2IA9xSQQr3cqHG0ddw",
  "access_expires_at": "2026-10-29T08:29:03.475350931Z",
  "refresh_token": "2HcKB8xQi7KugV5tgRmNs3C1jxTepiIfdpMuTLAZ4Qk",
  "refresh_expires_at": "2026-11-28T08:14:03.475016574Z",
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
  "command_id": "201ebd0d-c4c4-4d57-aac8-3d6a81618ca2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:14:03Z",
    "sequence": 1793261643839
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "24c17fdb-68d9-47ae-b270-42e225edf294",
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
  "last_heartbeat_at": "2026-10-29T08:14:03.854645Z",
  "last_location_at": "2026-10-29T08:14:03.854645Z",
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
  "command_id": "275a4ce7-a07d-4ac1-b5ad-993439049240",
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
  "effective_at": "2026-10-29T08:14:04.254716Z",
  "changed_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T08:12:16.110178Z",
  "last_entries": [
    {
      "order_id": "31835055-31c5-4661-a366-7d1209b5f59f",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T08:12:16.110178Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "38d8816f-a306-4025-b251-e59ea8fb2aee",
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
  "id": "a0afc2b7-012b-40fb-9ff2-0072a0a66f89",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:19:04.646066Z",
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
  "command_id": "66a7c960-05ad-40fd-9bcc-1a6c3def8799",
  "quote_id": "a0afc2b7-012b-40fb-9ff2-0072a0a66f89",
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
    "phone": "+3806711130308"
  }
}
```

```json
{
  "id": "bf53b059-cc67-4212-bf57-1a98426f82c0",
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
  "created_at": "2026-10-29T08:14:04.850636Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711130308"
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
    "id": "3348bf80-33d8-4602-a4f1-5f713e0f0324",
    "order_id": "bf53b059-cc67-4212-bf57-1a98426f82c0",
    "expires_at": "2026-10-29T08:14:19.853194Z",
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

`POST /api/driver/v1/offers/3348bf80-33d8-4602-a4f1-5f713e0f0324/accept` → **200**

```json
{
  "command_id": "d40bd69c-6617-49ae-86b9-ca5879595e40"
}
```

```json
{
  "id": "dd0adbf9-55c4-432b-a756-02c950d436d4",
  "order_id": "bf53b059-cc67-4212-bf57-1a98426f82c0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "81d6402b-f15d-401e-b1b4-cfcd7b38d55d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "81d6402b-f15d-401e-b1b4-cfcd7b38d55d",
  "order_id": "bf53b059-cc67-4212-bf57-1a98426f82c0",
  "assignment_id": "dd0adbf9-55c4-432b-a756-02c950d436d4",
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
    "phone": "+3806711130308"
  }
}
```

`POST /api/driver/v1/work-sessions/24c17fdb-68d9-47ae-b270-42e225edf294/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:14:05Z",
    "sequence": 1793261645613
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "24c17fdb-68d9-47ae-b270-42e225edf294",
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
  "last_heartbeat_at": "2026-10-29T08:14:05.629432Z",
  "last_location_at": "2026-10-29T08:14:05.629432Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/81d6402b-f15d-401e-b1b4-cfcd7b38d55d/arrive` → **200**

```json
{
  "command_id": "01a93f6f-4687-4ecc-ad0a-dc3423b5e6d0",
  "expected_version": 0
}
```

```json
{
  "id": "81d6402b-f15d-401e-b1b4-cfcd7b38d55d",
  "order_id": "bf53b059-cc67-4212-bf57-1a98426f82c0",
  "assignment_id": "dd0adbf9-55c4-432b-a756-02c950d436d4",
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
  "arrived_at": "2026-10-29T08:14:05.824277Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711130308"
  }
}
```

`POST /api/driver/v1/trips/81d6402b-f15d-401e-b1b4-cfcd7b38d55d/start` → **200**

```json
{
  "command_id": "12d0175f-d3c1-4ca7-8eef-8f3a8db1c78c",
  "expected_version": 1
}
```

```json
{
  "id": "81d6402b-f15d-401e-b1b4-cfcd7b38d55d",
  "order_id": "bf53b059-cc67-4212-bf57-1a98426f82c0",
  "assignment_id": "dd0adbf9-55c4-432b-a756-02c950d436d4",
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
  "arrived_at": "2026-10-29T08:14:05.824277Z",
  "started_at": "2026-10-29T08:14:06.057158Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711130308"
  }
}
```

`POST /api/driver/v1/trips/81d6402b-f15d-401e-b1b4-cfcd7b38d55d/complete` → **200**

```json
{
  "command_id": "ab04c9b3-f247-480e-be8a-aa4fabcc0da8",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:14:06Z",
  "cash_received": true
}
```

```json
{
  "id": "81d6402b-f15d-401e-b1b4-cfcd7b38d55d",
  "order_id": "bf53b059-cc67-4212-bf57-1a98426f82c0",
  "assignment_id": "dd0adbf9-55c4-432b-a756-02c950d436d4",
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
  "arrived_at": "2026-10-29T08:14:05.824277Z",
  "started_at": "2026-10-29T08:14:06.057158Z",
  "completed_at": "2026-10-29T08:14:06.259152Z",
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
  "command_id": "ff517707-9a5a-4f00-9cbe-c0297cb99d6f",
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
  "id": "81426594-c69a-42c8-84d8-e9841281d005",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:19:06.458193Z",
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
  "command_id": "91c773cb-5528-4894-985d-aafe2e0354dc",
  "quote_id": "81426594-c69a-42c8-84d8-e9841281d005",
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
    "phone": "+380671114973"
  }
}
```

```json
{
  "id": "94e8f1c8-a69e-48de-8557-e3420d9ff329",
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
  "created_at": "2026-10-29T08:14:06.664151Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671114973"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/94e8f1c8-a69e-48de-8557-e3420d9ff329` → **200**

```json
{
  "id": "94e8f1c8-a69e-48de-8557-e3420d9ff329",
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
  "created_at": "2026-10-29T08:14:06.664151Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671114973"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/94e8f1c8-a69e-48de-8557-e3420d9ff329/cancel` → **200**

```json
{
  "command_id": "19a75f50-6b8d-4e33-9d50-c16bf741dbb0",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "94e8f1c8-a69e-48de-8557-e3420d9ff329",
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
  "created_at": "2026-10-29T08:14:06.664151Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671114973"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "uk": "Помилка оператора",
      "pl": "Błąd operatora",
      "ru": "Ошибка оператора",
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
  "staff_id": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T08:12:16.110178Z",
  "last_entries": [
    {
      "order_id": "94e8f1c8-a69e-48de-8557-e3420d9ff329",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T08:14:07.075379Z"
    },
    {
      "order_id": "bf53b059-cc67-4212-bf57-1a98426f82c0",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T08:14:06.262164Z"
    },
    {
      "order_id": "31835055-31c5-4661-a366-7d1209b5f59f",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T08:12:16.110178Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "24c17fdb-68d9-47ae-b270-42e225edf294",
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
  "last_heartbeat_at": "2026-10-29T08:14:05.629432Z",
  "last_location_at": "2026-10-29T08:14:05.629432Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/24c17fdb-68d9-47ae-b270-42e225edf294/close` → **200**

```json
{
  "command_id": "cf0753f7-1ec4-4ec5-a099-0eb3dde3a7f7",
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

Done: operator bonus for fulfilled bf53b059-cc67-4212-bf57-1a98426f82c0 and operator-fault cancellation 94e8f1c8-a69e-48de-8557-e3420d9ff329.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675624540",
  "device_ref": "sandbox-25704"
}
```

```json
{
  "challenge_id": "34b602eb-a321-4692-8c1d-35a9e707ab80",
  "expires_at": "2026-10-29T08:19:09.87976808Z",
  "resend_available_at": "2026-10-29T08:14:10.87976808Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675624540` → **200**

```json
{
  "phone": "+380675624540",
  "audience": "CLIENT",
  "code": "523391",
  "sent_at": "2026-10-29T08:14:09.881396681Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673734513",
  "device_ref": "sandbox-31264",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b99a5172-a960-4b67-84aa-5ab138d26670",
  "expires_at": "2026-10-29T08:19:10.083549258Z",
  "resend_available_at": "2026-10-29T08:14:11.083549258Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673734513` → **200**

```json
{
  "phone": "+380673734513",
  "audience": "CLIENT",
  "code": "934147",
  "sent_at": "2026-10-29T08:14:10.085161118Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671250000",
  "device_ref": "sandbox-23905"
}
```

```json
{
  "challenge_id": "759216dc-e724-4f58-9e33-e743177e0e86",
  "expires_at": "2026-10-29T08:19:10.276159589Z",
  "resend_available_at": "2026-10-29T08:14:11.276159589Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671250000` → **200**

```json
{
  "phone": "+380671250000",
  "audience": "CLIENT",
  "code": "216983",
  "sent_at": "2026-10-29T08:14:10.278847637Z",
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
  "session_id": "c9da8e21-23df-4882-83ed-4c92fc07bab3",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1NTAsImlhdCI6MTc5MzI2MTY1MCwianRpIjoiYjhjOTU4ZTItNDllZC00NTZhLThlOTUtYmExYmFkMThhYWFmIiwic2lkIjoiYzlkYThlMjEtMjNkZi00ODgyLTgzZWQtNGM5MmZjMDdiYWIzIn0.2NJ7KJZDQ5VakLl18qXu7-f2cGJ_h1tvr7x4l-gkUL0",
  "access_expires_at": "2026-10-29T08:29:10.676986952Z",
  "refresh_token": "73ysz-vAvfPzAaAe_BFlFDj1qrrzakwX7zrMvWLeO00",
  "refresh_expires_at": "2026-10-29T20:14:10.676602529Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671250000` → **200**

```json
{
  "deliveries": [
    {
      "id": "424ab344-a4bb-461c-a04b-1b922aaa13b6",
      "challenge_id": "759216dc-e724-4f58-9e33-e743177e0e86",
      "phone": "+380671250000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b0229404-fdc1-4cab-aaf3-9b2707808b6b",
      "error": null,
      "attempted_at": "2026-10-29T08:14:10.279161Z"
    },
    {
      "id": "22bce121-5593-48e0-8f1a-71acdbc026da",
      "challenge_id": "759216dc-e724-4f58-9e33-e743177e0e86",
      "phone": "+380671250000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T08:14:10.277888Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380671250000` → **200**

```json
{
  "phone": "+380671250000",
  "audience": "CLIENT",
  "code": "216983",
  "sent_at": "2026-10-29T08:14:10.278847637Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673734513` → **200**

```json
{
  "deliveries": [
    {
      "id": "60a38f40-e5cb-4781-8267-be0d0fac76d4",
      "challenge_id": "b99a5172-a960-4b67-84aa-5ab138d26670",
      "phone": "+380673734513",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-6251e9d5-2b13-43b8-ab14-d405a04deba6",
      "error": null,
      "attempted_at": "2026-10-29T08:14:10.085419Z"
    }
  ]
}
```

Done: SMS to +380675624540, a call to +380673734513, SMS then a call to +380671250000.

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
  "session_id": "2a979f00-1a74-4170-afbd-d5d9285d5dd9",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1NTEsImlhdCI6MTc5MzI2MTY1MSwianRpIjoiNzUwNzYyMTItYjE5OC00MmY2LTg4YWMtMGM5NDI5MDVjMWIwIiwic2lkIjoiMmE5NzlmMDAtMWE3NC00MTcwLWFmYmQtZDVkOTI4NWQ1ZGQ5In0.L8MBu-9f8g_a_PUHOLbIzS_sNDzhj4o2sy5c5FrsbTk",
  "access_expires_at": "2026-10-29T08:29:11.460056892Z",
  "refresh_token": "dOdWBt2GVgBaqT3YZgzatMzYNIxg1iWDbu4LNtz7VH8",
  "refresh_expires_at": "2026-10-29T20:14:11.459718299Z",
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
  "session_id": "8a31c46b-0945-4b4e-83c6-c13775efcbbd",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1NTEsImlhdCI6MTc5MzI2MTY1MSwianRpIjoiNzhkNDMyYTItYjg2Ny00ZjhkLWE5ZmMtN2RlZjJkNzVkNzc4Iiwic2lkIjoiOGEzMWM0NmItMDk0NS00YjRlLTgzYzYtYzEzNzc1ZWZjYmJkIn0.5NCXrPfOofW4VwzqCbP_lqKlH7hshOakeSNMQx5BbDg",
  "access_expires_at": "2026-10-29T08:29:11.845999614Z",
  "refresh_token": "hFtcHzpRON0Fo_zoIutYkJaoBu69oBhnMEsZpLmmZYw",
  "refresh_expires_at": "2026-10-29T20:14:11.845601596Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235",
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

`POST /api/admin/v1/staff-extensions/3a4258dd-3209-4d24-8c44-4c5661453235` → **200**

```json
{
  "command_id": "a90f320b-9062-459e-a91f-8ed9db665e61",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "05e1fb85-0f56-4d2e-b5ee-ec78d4ea2c28",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T08:14:12.603034Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T08:14:12.603034Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "eaac4f0b-be58-4260-a2d6-9992e8bf8425",
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
  "id": "18f2d97f-52b0-46e1-ab94-6c4feaa69ad4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:19:12.968835Z",
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
  "command_id": "218788db-0cca-47c9-8c89-b3a69422c1dc",
  "quote_id": "18f2d97f-52b0-46e1-ab94-6c4feaa69ad4",
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
    "phone": "+380672251365"
  }
}
```

```json
{
  "id": "17099b6e-9daf-46b6-8829-c1e12963966a",
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
  "created_at": "2026-10-29T08:14:13.15865Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672251365"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/17099b6e-9daf-46b6-8829-c1e12963966a/calls` → **201**

```json
{
  "command_id": "292bf5cc-0f15-4974-8dcf-163ddf1e018a",
  "to": "CALLER"
}
```

```json
{
  "id": "3d246c8b-9eff-42f6-ba55-ca54e7f44248",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "order_ids": [
    "17099b6e-9daf-46b6-8829-c1e12963966a"
  ],
  "started_at": "2026-10-29T08:14:13.367582Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/17099b6e-9daf-46b6-8829-c1e12963966a/calls` → **201**

```json
{
  "command_id": "292bf5cc-0f15-4974-8dcf-163ddf1e018a",
  "to": "CALLER"
}
```

```json
{
  "id": "3d246c8b-9eff-42f6-ba55-ca54e7f44248",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "order_ids": [
    "17099b6e-9daf-46b6-8829-c1e12963966a"
  ],
  "started_at": "2026-10-29T08:14:13.367582Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "3d246c8b-9eff-42f6-ba55-ca54e7f44248",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380672251365",
    "at": "2026-10-29T08:14:13.369562332Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "3d246c8b-9eff-42f6-ba55-ca54e7f44248",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.11960",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "3d246c8b-9eff-42f6-ba55-ca54e7f44248"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "3d246c8b-9eff-42f6-ba55-ca54e7f44248",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=17099b6e-9daf-46b6-8829-c1e12963966a` → **200**

```json
{
  "calls": [
    {
      "id": "3d246c8b-9eff-42f6-ba55-ca54e7f44248",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "order_ids": [
        "17099b6e-9daf-46b6-8829-c1e12963966a"
      ],
      "started_at": "2026-10-29T08:14:13.367582Z",
      "answered_at": "2026-10-29T08:14:13.79267Z",
      "ended_at": "2026-10-29T08:14:13.810398Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=17099b6e-9daf-46b6-8829-c1e12963966a` → **200**

```json
{
  "calls": [
    {
      "id": "3d246c8b-9eff-42f6-ba55-ca54e7f44248",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "order_ids": [
        "17099b6e-9daf-46b6-8829-c1e12963966a"
      ],
      "started_at": "2026-10-29T08:14:13.367582Z",
      "answered_at": "2026-10-29T08:14:13.79267Z",
      "ended_at": "2026-10-29T08:14:13.810398Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=17099b6e-9daf-46b6-8829-c1e12963966a` → **200**

```json
{
  "calls": [
    {
      "id": "3d246c8b-9eff-42f6-ba55-ca54e7f44248",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "order_ids": [
        "17099b6e-9daf-46b6-8829-c1e12963966a"
      ],
      "started_at": "2026-10-29T08:14:13.367582Z",
      "answered_at": "2026-10-29T08:14:13.79267Z",
      "ended_at": "2026-10-29T08:14:13.810398Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T08:14:17.522742Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/17099b6e-9daf-46b6-8829-c1e12963966a` → **200**

```json
{
  "id": "17099b6e-9daf-46b6-8829-c1e12963966a",
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
  "created_at": "2026-10-29T08:14:13.15865Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672251365"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/17099b6e-9daf-46b6-8829-c1e12963966a/cancel` → **200**

```json
{
  "command_id": "ecfab6b2-a117-42eb-a280-13c3a47fa613",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "17099b6e-9daf-46b6-8829-c1e12963966a",
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
  "created_at": "2026-10-29T08:14:13.15865Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672251365"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
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
  "command_id": "6b618644-dc70-450f-a07f-378748dd1b74",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T08:14:18.837465Z",
  "extension": "101"
}
```

Done: outgoing call 3d246c8b-9eff-42f6-ba55-ca54e7f44248 from order 17099b6e-9daf-46b6-8829-c1e12963966a, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631379918",
  "device_ref": "sandbox-23207"
}
```

```json
{
  "challenge_id": "7c2d3ffb-8bd9-4bd2-b7d8-1881c6d8b537",
  "expires_at": "2026-10-29T08:19:19.023650235Z",
  "resend_available_at": "2026-10-29T08:14:20.023650235Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631379918` → **200**

```json
{
  "phone": "+380631379918",
  "audience": "CLIENT",
  "code": "619240",
  "sent_at": "2026-10-29T08:14:19.025410756Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7c2d3ffb-8bd9-4bd2-b7d8-1881c6d8b537",
  "code": "619240",
  "device_ref": "sandbox-23207"
}
```

```json
{
  "session_id": "1c65442a-fff5-401d-bc1c-97133c1ef7fc",
  "subject": {
    "type": "CLIENT",
    "id": "f4f7d6ea-a894-4476-9e76-2f7cd3e541a6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNGY3ZDZlYS1hODk0LTQ0NzYtOWU3Ni0yZjdjZDNlNTQxYTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNTU5LCJpYXQiOjE3OTMyNjE2NTksImp0aSI6IjgzMTI2OGNmLTQ5ODktNDM5OS05YWQzLTVmNjY1MmM1NTlhMSIsInNpZCI6IjFjNjU0NDJhLWZmZjUtNDAxZC1iYzFjLTk3MTMzYzFlZjdmYyJ9.qUmWF823T-tDzOxkzmHWTrumOedu5AWwzLJvla9RC90",
  "access_expires_at": "2026-10-29T08:29:19.221828687Z",
  "refresh_token": "FuNGHfI6KSk6CFlUHB6A0h22g8yztW15A2iWMv-0LHs",
  "refresh_expires_at": "2026-11-28T08:14:19.221437083Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f4f7d6ea-a894-4476-9e76-2f7cd3e541a6",
  "session_id": "1c65442a-fff5-401d-bc1c-97133c1ef7fc",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631379918",
  "device_ref": "sandbox-788"
}
```

```json
{
  "challenge_id": "acdaee25-9b5d-4513-b861-7ffc5e76b322",
  "expires_at": "2026-10-29T08:19:21.567518875Z",
  "resend_available_at": "2026-10-29T08:14:22.567518875Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631379918` → **200**

```json
{
  "phone": "+380631379918",
  "audience": "CLIENT",
  "code": "423736",
  "sent_at": "2026-10-29T08:14:21.568965383Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "acdaee25-9b5d-4513-b861-7ffc5e76b322",
  "code": "423736",
  "device_ref": "sandbox-788"
}
```

```json
{
  "session_id": "4e10242a-0271-4eb9-8554-8941bbd5828e",
  "subject": {
    "type": "CLIENT",
    "id": "f4f7d6ea-a894-4476-9e76-2f7cd3e541a6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNGY3ZDZlYS1hODk0LTQ0NzYtOWU3Ni0yZjdjZDNlNTQxYTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNTYxLCJpYXQiOjE3OTMyNjE2NjEsImp0aSI6Ijg2ODFhMjAwLWJhODMtNGY5Yy1hNDI1LWI1OWZhMDY2Yjg2NSIsInNpZCI6IjRlMTAyNDJhLTAyNzEtNGViOS04NTU0LTg5NDFiYmQ1ODI4ZSJ9.rGHr6ij3EBn562SJS7gMWI83YIdJEWebbzZAC0iaW8E",
  "access_expires_at": "2026-10-29T08:29:21.767304793Z",
  "refresh_token": "hlTjsJDSiEE2QseQAVd7rqa4LU84duxyMbwSUCLxHMk",
  "refresh_expires_at": "2026-11-28T08:14:21.766825208Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "b8a14fd0-339a-4914-a81c-13d4d0ee8387",
  "expires_at": "2026-10-29T08:19:23.947654098Z",
  "resend_available_at": "2026-10-29T08:14:24.947654098Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631379918` → **200**

```json
{
  "phone": "+380631379918",
  "audience": "CLIENT",
  "code": "114860",
  "sent_at": "2026-10-29T08:14:23.94903448Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380639844377"
}
```

```json
{
  "challenge_id": "e0a16327-67af-42fc-ab40-f04932da3d08",
  "expires_at": "2026-10-29T08:19:24.148513635Z",
  "resend_available_at": "2026-10-29T08:14:25.148513635Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639844377` → **200**

```json
{
  "phone": "+380639844377",
  "audience": "CLIENT",
  "code": "500763",
  "sent_at": "2026-10-29T08:14:24.150113275Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "2b543442-696c-4021-999b-efffd52c08c6",
  "current_challenge_id": "b8a14fd0-339a-4914-a81c-13d4d0ee8387",
  "current_code": "000000",
  "new_challenge_id": "e0a16327-67af-42fc-ab40-f04932da3d08",
  "new_code": "500763"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "f4512e0f-4b56-4f2a-96e5-badb6af6c644"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "5bcc70fc-8b61-4ac6-8540-a3100fac3a04",
  "current_challenge_id": "b8a14fd0-339a-4914-a81c-13d4d0ee8387",
  "current_code": "114860",
  "new_challenge_id": "e0a16327-67af-42fc-ab40-f04932da3d08",
  "new_code": "500763"
}
```

```json
{
  "subject_id": "f4f7d6ea-a894-4476-9e76-2f7cd3e541a6",
  "phone": "+380639844377",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f4f7d6ea-a894-4476-9e76-2f7cd3e541a6",
  "session_id": "1c65442a-fff5-401d-bc1c-97133c1ef7fc",
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
  "correlation_id": "503e97af-4002-4a2c-8b6c-c1d49da3d71f"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639844377",
  "device_ref": "sandbox-32245"
}
```

```json
{
  "challenge_id": "a4f6ef25-f065-4b83-a23e-41635197d612",
  "expires_at": "2026-10-29T08:19:27.055885859Z",
  "resend_available_at": "2026-10-29T08:14:28.055885859Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639844377` → **200**

```json
{
  "phone": "+380639844377",
  "audience": "CLIENT",
  "code": "562041",
  "sent_at": "2026-10-29T08:14:27.057437852Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a4f6ef25-f065-4b83-a23e-41635197d612",
  "code": "562041",
  "device_ref": "sandbox-32245"
}
```

```json
{
  "session_id": "8a792edc-61e2-4c57-8e5c-605373cda10b",
  "subject": {
    "type": "CLIENT",
    "id": "f4f7d6ea-a894-4476-9e76-2f7cd3e541a6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNGY3ZDZlYS1hODk0LTQ0NzYtOWU3Ni0yZjdjZDNlNTQxYTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNTY3LCJpYXQiOjE3OTMyNjE2NjcsImp0aSI6IjE3YTE0YWVlLTgyZjktNDJkYy04ZDkzLWY4YzBhZDA5ZTUzNCIsInNpZCI6IjhhNzkyZWRjLTYxZTItNGM1Ny04ZTVjLTYwNTM3M2NkYTEwYiJ9.aa5F79hfuRXnHkBMltj7ygWU7MlU5T-48scI6GaFzsw",
  "access_expires_at": "2026-10-29T08:29:27.253070647Z",
  "refresh_token": "qJWOU7K3WIS70VqmwwCr4uv-JA_VCOtbCzYndrkGKSA",
  "refresh_expires_at": "2026-11-28T08:14:27.252686614Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f4f7d6ea-a894-4476-9e76-2f7cd3e541a6",
  "session_id": "8a792edc-61e2-4c57-8e5c-605373cda10b",
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
  "session_id": "69726e63-353f-4920-ae25-488031d9a4bb",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1NjcsImlhdCI6MTc5MzI2MTY2NywianRpIjoiM2FlMTIzYWEtMGU2OS00ZjdiLWFhMzQtOTRmNmNiMjdhNTE4Iiwic2lkIjoiNjk3MjZlNjMtMzUzZi00OTIwLWFlMjUtNDg4MDMxZDlhNGJiIn0.lQ48bZHV8SxOKWsGLKmk2dabK_a5XCS52UHeRgSvvxg",
  "access_expires_at": "2026-10-29T08:29:27.806293984Z",
  "refresh_token": "C0lf20EQy_0dC4odENhipsXN1nxqak-ZvmbEm0cdD5E",
  "refresh_expires_at": "2026-10-29T20:14:27.805983694Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/f4f7d6ea-a894-4476-9e76-2f7cd3e541a6` → **200**

```json
{
  "client": {
    "id": "f4f7d6ea-a894-4476-9e76-2f7cd3e541a6",
    "phone": "+380639844377",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T08:14:19.22011Z",
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

`POST /api/admin/v1/clients/f4f7d6ea-a894-4476-9e76-2f7cd3e541a6/phone/new-code` → **201**

```json
{
  "phone": "+380639178312"
}
```

```json
{
  "challenge_id": "f705486a-381a-40cb-8d87-dcb07fbfd797",
  "expires_at": "2026-10-29T08:19:28.185395326Z",
  "resend_available_at": "2026-10-29T08:14:29.185395326Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639178312` → **200**

```json
{
  "phone": "+380639178312",
  "audience": "CLIENT",
  "code": "749568",
  "sent_at": "2026-10-29T08:14:28.186716707Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/f4f7d6ea-a894-4476-9e76-2f7cd3e541a6/phone` → **422**

```json
{
  "command_id": "7b2351fb-9da8-4d51-b220-b316be6b9103",
  "expected_version": 3,
  "new_challenge_id": "f705486a-381a-40cb-8d87-dcb07fbfd797",
  "new_code": "749569",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/f4f7d6ea-a894-4476-9e76-2f7cd3e541a6/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "e0286c65-4950-40b5-bc75-577656611d37"
}
```

`POST /api/admin/v1/clients/f4f7d6ea-a894-4476-9e76-2f7cd3e541a6/phone` → **400**

```json
{
  "command_id": "55e9dad4-4ead-42da-84f5-e6b3d51ebd9d",
  "expected_version": 3,
  "new_challenge_id": "f705486a-381a-40cb-8d87-dcb07fbfd797",
  "new_code": "749568",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/f4f7d6ea-a894-4476-9e76-2f7cd3e541a6/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "17555a35-0f5b-4e03-a3f8-3fe3dc35c725",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/f4f7d6ea-a894-4476-9e76-2f7cd3e541a6/phone` → **200**

```json
{
  "command_id": "faa9008b-bb4b-44ea-bfa0-aa4995904b03",
  "expected_version": 3,
  "new_challenge_id": "f705486a-381a-40cb-8d87-dcb07fbfd797",
  "new_code": "749568",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "f4f7d6ea-a894-4476-9e76-2f7cd3e541a6",
  "phone": "+380639178312",
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
  "correlation_id": "8a207ed7-1367-4ae5-85fc-4eab1ad3efd7"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380639178312",
  "device_ref": "sandbox-12243"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "bd96c286-87ab-4026-9d9b-01498d9ea568",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639178312",
  "device_ref": "sandbox-12243"
}
```

```json
{
  "challenge_id": "0af1fe79-b028-4dde-b683-ff5b0faba09e",
  "expires_at": "2026-10-29T08:19:30.298651862Z",
  "resend_available_at": "2026-10-29T08:14:31.298651862Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639178312` → **200**

```json
{
  "phone": "+380639178312",
  "audience": "CLIENT",
  "code": "999829",
  "sent_at": "2026-10-29T08:14:30.300366697Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0af1fe79-b028-4dde-b683-ff5b0faba09e",
  "code": "999829",
  "device_ref": "sandbox-12243"
}
```

```json
{
  "session_id": "c3be0ae2-f206-483f-8c13-1d85da2e8c7d",
  "subject": {
    "type": "CLIENT",
    "id": "f4f7d6ea-a894-4476-9e76-2f7cd3e541a6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNGY3ZDZlYS1hODk0LTQ0NzYtOWU3Ni0yZjdjZDNlNTQxYTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNTcwLCJpYXQiOjE3OTMyNjE2NzAsImp0aSI6Ijg3NDc3MTNkLWE3ZGEtNDE1ZC1iOGVhLWY5NmU2ZDliMmY5MSIsInNpZCI6ImMzYmUwYWUyLWYyMDYtNDgzZi04YzEzLTFkODVkYTJlOGM3ZCJ9.FbusbA5iqxX9n5cq0jX9QhhsugNPzW7cVrOd7V-fShk",
  "access_expires_at": "2026-10-29T08:29:30.528519937Z",
  "refresh_token": "WOMMud98wBht7F8kyOMsT8CFfPj23ezEof6uAbncPW0",
  "refresh_expires_at": "2026-11-28T08:14:30.528181014Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f4f7d6ea-a894-4476-9e76-2f7cd3e541a6",
  "session_id": "c3be0ae2-f206-483f-8c13-1d85da2e8c7d",
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
  "phone": "+380638950109",
  "device_ref": "sandbox-13713"
}
```

```json
{
  "challenge_id": "d4daebb7-0fa2-4ace-a9da-20993e889218",
  "expires_at": "2026-10-29T08:19:30.888674494Z",
  "resend_available_at": "2026-10-29T08:14:31.888674494Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638950109` → **200**

```json
{
  "phone": "+380638950109",
  "audience": "CLIENT",
  "code": "081208",
  "sent_at": "2026-10-29T08:14:30.890346314Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d4daebb7-0fa2-4ace-a9da-20993e889218",
  "code": "081208",
  "device_ref": "sandbox-13713"
}
```

```json
{
  "session_id": "7c44c04d-49fd-4fa5-b4b8-b333c7808f4e",
  "subject": {
    "type": "CLIENT",
    "id": "07b1b0bf-beae-4761-b653-1f57c40c76a3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwN2IxYjBiZi1iZWFlLTQ3NjEtYjY1My0xZjU3YzQwYzc2YTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNTcxLCJpYXQiOjE3OTMyNjE2NzEsImp0aSI6IjEyYTg5NmVhLTEzZGUtNDI1My04MGQ0LWY2MjU2ZTZmM2IwNyIsInNpZCI6IjdjNDRjMDRkLTQ5ZmQtNGZhNS1iNGI4LWIzMzNjNzgwOGY0ZSJ9.Oxqwvdf8qA_d8y5bFkn60Nq3_FJUW0iWmmYTVsolKmY",
  "access_expires_at": "2026-10-29T08:29:31.084388849Z",
  "refresh_token": "1OQExfb9CwxaMWiyGuUBV_mrsl16CHUuhjDS6izLqcw",
  "refresh_expires_at": "2026-11-28T08:14:31.084070167Z",
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
  "session_id": "fedf8bfa-3df9-4b56-b007-a095776d1dd5",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1NzEsImlhdCI6MTc5MzI2MTY3MSwianRpIjoiMmYyZmNhZGItOWMxMC00MTdhLTlmNjQtOTI4NmUyOWFlNmY2Iiwic2lkIjoiZmVkZjhiZmEtM2RmOS00YjU2LWIwMDctYTA5NTc3NmQxZGQ1In0.wOSk61pnQGCmxlHh806VQfBWqLPGktNCAOveBcnn8UQ",
  "access_expires_at": "2026-10-29T08:29:31.82734744Z",
  "refresh_token": "HBCO6xyPVidZoOgofA1FqJ4Eh3VLRJ7nKzravFepdwg",
  "refresh_expires_at": "2026-10-29T20:14:31.827052864Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380638950109` → **200**

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
  "correlation_id": "7d9d7a9d-5cdc-4050-9105-4595e2315539"
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
  "session_id": "bc285d43-7ebc-4957-b0af-d879f46c2a9c",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1NzIsImlhdCI6MTc5MzI2MTY3MiwianRpIjoiMjk2YWZiMjQtM2VkYi00NzgzLTgzODUtOTg5ODc0ZWY3YjgxIiwic2lkIjoiYmMyODVkNDMtN2ViYy00OTU3LWIwYWYtZDg3OWY0NmMyYTljIn0.8AmSFNQZUoumHo5nPqLsFU_pHf8NbAjdeucAcIYazJs",
  "access_expires_at": "2026-10-29T08:29:32.562920139Z",
  "refresh_token": "tzJJ-ZKJw7iN8Zw8P5QCc3foU4B65rKnqXPxPDEAaGM",
  "refresh_expires_at": "2026-10-29T20:14:32.562000183Z",
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
  "changed_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T08:11:50.28155Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "e07d3012-dcae-4fa7-9021-1ce170bbf54d",
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
  "changed_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T08:14:32.926879701Z"
}
```

## The rider books the airport for 2026-10-29T11:14:32Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600761656",
  "device_ref": "sandbox-30356"
}
```

```json
{
  "challenge_id": "1874b1bb-910d-4151-9a0c-f30c7a5551a4",
  "expires_at": "2026-10-29T08:19:33.111650208Z",
  "resend_available_at": "2026-10-29T08:14:34.111650208Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600761656` → **200**

```json
{
  "phone": "+48600761656",
  "audience": "CLIENT",
  "code": "167957",
  "sent_at": "2026-10-29T08:14:33.113321587Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1874b1bb-910d-4151-9a0c-f30c7a5551a4",
  "code": "167957",
  "device_ref": "sandbox-30356"
}
```

```json
{
  "session_id": "80f1dc11-7953-4231-b145-e1ca5f8286da",
  "subject": {
    "type": "CLIENT",
    "id": "c2674bf6-de38-410d-90ea-8f38a37f17d2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMjY3NGJmNi1kZTM4LTQxMGQtOTBlYS04ZjM4YTM3ZjE3ZDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNTczLCJpYXQiOjE3OTMyNjE2NzMsImp0aSI6ImMwMjc1YTFkLWRjYjEtNGQzNS05NmVjLTAxNGM2MjYyOWNiNyIsInNpZCI6IjgwZjFkYzExLTc5NTMtNDIzMS1iMTQ1LWUxY2E1ZjgyODZkYSJ9.QvpHfmdMs-DYFWjU_K2np0ChEUX4PQ7kC6tL63uFWBE",
  "access_expires_at": "2026-10-29T08:29:33.310857267Z",
  "refresh_token": "83wdQUDX-lhljkNG5jQd7M4SQPVg6rh080nlJnWtKUk",
  "refresh_expires_at": "2026-11-28T08:14:33.310506951Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0cafd002-d2ef-489c-9d78-1c9f37cebfb8",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T11:14:32Z"
}
```

```json
{
  "id": "da7dcdfc-80b0-4198-b6ea-5ecccce19501",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:19:33.491279Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T11:14:32Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "85614a43-00c7-40aa-8326-671b70f89411",
  "quote_id": "da7dcdfc-80b0-4198-b6ea-5ecccce19501",
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
  "pickup_at": "2026-10-29T11:14:32Z"
}
```

```json
{
  "id": "5a1d90ca-4081-4b1d-b42c-791c337d48e9",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c2674bf6-de38-410d-90ea-8f38a37f17d2",
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
  "created_at": "2026-10-29T08:14:33.673136Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T11:14:32Z",
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
  "device_ref": "sandbox-5833"
}
```

```json
{
  "challenge_id": "e2937980-b763-4e8f-8e0b-1ffa240d4e60",
  "expires_at": "2026-10-29T08:19:33.853530364Z",
  "resend_available_at": "2026-10-29T08:14:34.853530364Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "899764",
  "sent_at": "2026-10-29T08:14:33.855314513Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2937980-b763-4e8f-8e0b-1ffa240d4e60",
  "code": "899764",
  "device_ref": "sandbox-5833"
}
```

```json
{
  "session_id": "3d59a964-51ad-4d36-b94e-c949b8e11e79",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjU3NCwiaWF0IjoxNzkzMjYxNjc0LCJqdGkiOiI5NzVkM2YyMC00MDRmLTQ2YzktOGRlMC1iYmFkMDQ4YzAzMGEiLCJzaWQiOiIzZDU5YTk2NC01MWFkLTRkMzYtYjk0ZS1jOTQ5YjhlMTFlNzkifQ.9Lfj7lT1EOK5lWj6L8BsQA66m-pgPBy-BEgxYOFhs5A",
  "access_expires_at": "2026-10-29T08:29:34.049350745Z",
  "refresh_token": "m7TCvkhTWhZc04aLVXcJOZiruifWQkSUZLJz0eKbaH8",
  "refresh_expires_at": "2026-11-28T08:14:34.04899176Z",
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
  "command_id": "d5536bce-ff6a-411c-b9ef-6e53733cf9fe",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:14:34Z",
    "sequence": 1793261674392
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "becbebcc-25a7-4837-adda-d00e567cef06",
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
  "last_heartbeat_at": "2026-10-29T08:14:34.40813Z",
  "last_location_at": "2026-10-29T08:14:34.40813Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "5a1d90ca-4081-4b1d-b42c-791c337d48e9",
      "short_number": 23,
      "pickup_at": "2026-10-29T11:14:32Z",
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

`POST /api/driver/v1/preorders/5a1d90ca-4081-4b1d-b42c-791c337d48e9/reserve` → **200**

```json
{
  "command_id": "0b7ae8bf-f13c-401b-98be-6b4a8049ff07"
}
```

```json
{
  "id": "b1c0c01b-abbe-4aed-b0fb-30d8c4a395aa",
  "state": "RESERVED",
  "order": {
    "order_id": "5a1d90ca-4081-4b1d-b42c-791c337d48e9",
    "short_number": 23,
    "pickup_at": "2026-10-29T11:14:32Z",
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
  "reserved_at": "2026-10-29T08:14:34.768779Z",
  "confirm_from": "2026-10-29T10:44:32Z",
  "confirm_until": "2026-10-29T10:54:32Z",
  "drop_until": "2026-10-29T10:14:32Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "b1c0c01b-abbe-4aed-b0fb-30d8c4a395aa",
      "state": "RESERVED",
      "order": {
        "order_id": "5a1d90ca-4081-4b1d-b42c-791c337d48e9",
        "short_number": 23,
        "pickup_at": "2026-10-29T11:14:32Z",
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
      "reserved_at": "2026-10-29T08:14:34.768779Z",
      "confirm_from": "2026-10-29T10:44:32Z",
      "confirm_until": "2026-10-29T10:54:32Z",
      "drop_until": "2026-10-29T10:14:32Z"
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
      "id": "b1c0c01b-abbe-4aed-b0fb-30d8c4a395aa",
      "state": "RESERVED",
      "order": {
        "order_id": "5a1d90ca-4081-4b1d-b42c-791c337d48e9",
        "short_number": 23,
        "pickup_at": "2026-10-29T11:14:32Z",
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
      "reserved_at": "2026-10-29T08:14:34.768779Z",
      "confirm_from": "2026-10-29T10:44:32Z",
      "confirm_until": "2026-10-29T10:54:32Z",
      "drop_until": "2026-10-29T10:14:32Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/b1c0c01b-abbe-4aed-b0fb-30d8c4a395aa/confirm` → **409**

```json
{
  "command_id": "46898bad-50c9-4da4-81f6-19246dc26ed5"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/b1c0c01b-abbe-4aed-b0fb-30d8c4a395aa/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e0d84074-486e-48f1-9498-db8e2bf585cd"
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
  "session_id": "b793b015-d2ff-42f8-90e4-d5641dbedc5a",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1NzUsImlhdCI6MTc5MzI2MTY3NSwianRpIjoiMTM4NTIwNzQtNWRmZC00OWIyLTg5OGQtYjk4NjZkYWE4MjQzIiwic2lkIjoiYjc5M2IwMTUtZDJmZi00MmY4LTkwZTQtZDU2NDFkYmVkYzVhIn0.KpR3JOAQt0-v3zLDn6sxOxroNVVwm4UUotEm2Lm-CDg",
  "access_expires_at": "2026-10-29T08:29:35.69223174Z",
  "refresh_token": "WhdBcMMLxNidgJ4ussB8RkmuvgBplqcCXD0cTtEYQGI",
  "refresh_expires_at": "2026-10-29T20:14:35.691824222Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5a1d90ca-4081-4b1d-b42c-791c337d48e9` → **200**

```json
{
  "id": "5a1d90ca-4081-4b1d-b42c-791c337d48e9",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "c2674bf6-de38-410d-90ea-8f38a37f17d2",
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
  "created_at": "2026-10-29T08:14:33.673136Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T11:14:32Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "b1c0c01b-abbe-4aed-b0fb-30d8c4a395aa",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T08:14:34.768779Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/5a1d90ca-4081-4b1d-b42c-791c337d48e9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T08:14:33.67389Z",
      "actor": {
        "type": "CLIENT",
        "id": "c2674bf6-de38-410d-90ea-8f38a37f17d2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "5a1d90ca-4081-4b1d-b42c-791c337d48e9",
        "preorder": true,
        "quote_id": "da7dcdfc-80b0-4198-b6ea-5ecccce19501",
        "pickup_at": "2026-10-29T11:14:32Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "ab2fba9c-6351-4c49-8880-569528cd8e59"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T08:14:34.769602Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5a1d90ca-4081-4b1d-b42c-791c337d48e9",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "b1c0c01b-abbe-4aed-b0fb-30d8c4a395aa"
      },
      "correlation_id": "f4ab72d5-69f8-41d7-82f5-5f8af17a2d62"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 5a1d90ca-4081-4b1d-b42c-791c337d48e9, reservation b1c0c01b-abbe-4aed-b0fb-30d8c4a395aa.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10466"
}
```

```json
{
  "challenge_id": "faa1128f-5d21-426a-b0c5-33f1a7f560ab",
  "expires_at": "2026-10-29T08:19:36.270973606Z",
  "resend_available_at": "2026-10-29T08:14:37.270973606Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "565846",
  "sent_at": "2026-10-29T08:14:36.272911391Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "faa1128f-5d21-426a-b0c5-33f1a7f560ab",
  "code": "565846",
  "device_ref": "sandbox-10466"
}
```

```json
{
  "session_id": "126f5cce-324a-49d9-8961-207708524e65",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjU3NiwiaWF0IjoxNzkzMjYxNjc2LCJqdGkiOiI5NTUyNmUxYy0xODQ0LTQ0ODctOGZjOS0wYTBiYzg3NjgwZmIiLCJzaWQiOiIxMjZmNWNjZS0zMjRhLTQ5ZDktODk2MS0yMDc3MDg1MjRlNjUifQ.tpQICgW_ddKSvV17YPzTOf7BYcdgvS__DadxAcPI9K0",
  "access_expires_at": "2026-10-29T08:29:36.474953817Z",
  "refresh_token": "YFDfDl9p3Af37ohIttMh4GKAnMkl2rSpqKpzkakR4t4",
  "refresh_expires_at": "2026-11-28T08:14:36.474558159Z",
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
  "command_id": "c78f6491-a14b-4fbf-a665-0fc9f8cb585b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:14:36Z",
    "sequence": 1793261676851
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e7c48498-9195-4ac6-bc38-89b8acbccc37",
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
  "last_heartbeat_at": "2026-10-29T08:14:36.867243Z",
  "last_location_at": "2026-10-29T08:14:36.867243Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674698195",
  "device_ref": "sandbox-10485"
}
```

```json
{
  "challenge_id": "96d0b3f9-5897-40af-9f4c-a8a105b6bf32",
  "expires_at": "2026-10-29T08:19:37.049711683Z",
  "resend_available_at": "2026-10-29T08:14:38.049711683Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674698195` → **200**

```json
{
  "phone": "+380674698195",
  "audience": "CLIENT",
  "code": "386110",
  "sent_at": "2026-10-29T08:14:37.051396815Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "96d0b3f9-5897-40af-9f4c-a8a105b6bf32",
  "code": "386110",
  "device_ref": "sandbox-10485"
}
```

```json
{
  "session_id": "2dc1a021-1c8a-4ec0-8c0d-63905e848ea4",
  "subject": {
    "type": "CLIENT",
    "id": "5527172b-829b-48cc-8433-655a8f5433eb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NTI3MTcyYi04MjliLTQ4Y2MtODQzMy02NTVhOGY1NDMzZWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNTc3LCJpYXQiOjE3OTMyNjE2NzcsImp0aSI6IjAyNzFkZWMxLTEzYTktNDAyMi05Mjg4LTFmNzZiZmZjYjJmNCIsInNpZCI6IjJkYzFhMDIxLTFjOGEtNGVjMC04YzBkLTYzOTA1ZTg0OGVhNCJ9.MuH7qkCqCsmfpdE7C44opHl4cDvC_B-9yrwaVg4zvV0",
  "access_expires_at": "2026-10-29T08:29:37.248959137Z",
  "refresh_token": "qi_qLx5aNu1PaTBnDYLjXGmiforjtYzcLukvlI8-tFw",
  "refresh_expires_at": "2026-11-28T08:14:37.248652513Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fc047253-566a-4409-941e-c67ff23c5cab",
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
  "id": "7fa5ebd4-36f5-4565-88f1-7df40b271a5d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:19:37.424644Z",
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
  "command_id": "9ffa67e1-c6ac-49a0-baeb-768bfbf0a6bd",
  "quote_id": "7fa5ebd4-36f5-4565-88f1-7df40b271a5d",
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
  "id": "870a42f9-dfd7-4274-902c-2211b552b4ee",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5527172b-829b-48cc-8433-655a8f5433eb",
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
  "created_at": "2026-10-29T08:14:37.612128Z",
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
    "id": "b08f8a27-4b62-4061-91ce-1ef8d48d5807",
    "order_id": "870a42f9-dfd7-4274-902c-2211b552b4ee",
    "expires_at": "2026-10-29T08:14:52.613939Z",
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

`POST /api/driver/v1/offers/b08f8a27-4b62-4061-91ce-1ef8d48d5807/accept` → **200**

```json
{
  "command_id": "79dd20aa-fb60-421f-a459-c3a715056877"
}
```

```json
{
  "id": "3fefdc61-f477-456c-a20a-e1e66f15327f",
  "order_id": "870a42f9-dfd7-4274-902c-2211b552b4ee",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d518b52f-a260-488f-8580-4caf1cd10ac8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d518b52f-a260-488f-8580-4caf1cd10ac8",
  "order_id": "870a42f9-dfd7-4274-902c-2211b552b4ee",
  "assignment_id": "3fefdc61-f477-456c-a20a-e1e66f15327f",
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

`POST /api/driver/v1/work-sessions/e7c48498-9195-4ac6-bc38-89b8acbccc37/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:14:38Z",
    "sequence": 1793261678341
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e7c48498-9195-4ac6-bc38-89b8acbccc37",
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
  "last_heartbeat_at": "2026-10-29T08:14:38.35664Z",
  "last_location_at": "2026-10-29T08:14:38.35664Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d518b52f-a260-488f-8580-4caf1cd10ac8",
  "order_id": "870a42f9-dfd7-4274-902c-2211b552b4ee",
  "assignment_id": "3fefdc61-f477-456c-a20a-e1e66f15327f",
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

`POST /api/driver/v1/trips/d518b52f-a260-488f-8580-4caf1cd10ac8/arrive` → **200**

```json
{
  "command_id": "70146918-7bdc-40ec-ad67-ca356d3656e8",
  "expected_version": 0
}
```

```json
{
  "id": "d518b52f-a260-488f-8580-4caf1cd10ac8",
  "order_id": "870a42f9-dfd7-4274-902c-2211b552b4ee",
  "assignment_id": "3fefdc61-f477-456c-a20a-e1e66f15327f",
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
  "arrived_at": "2026-10-29T08:14:38.701277Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d518b52f-a260-488f-8580-4caf1cd10ac8/start` → **200**

```json
{
  "command_id": "485f4b44-1a1c-4e55-9a0c-69e3da9f3154",
  "expected_version": 1
}
```

```json
{
  "id": "d518b52f-a260-488f-8580-4caf1cd10ac8",
  "order_id": "870a42f9-dfd7-4274-902c-2211b552b4ee",
  "assignment_id": "3fefdc61-f477-456c-a20a-e1e66f15327f",
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
  "arrived_at": "2026-10-29T08:14:38.701277Z",
  "started_at": "2026-10-29T08:14:38.89127Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/e7c48498-9195-4ac6-bc38-89b8acbccc37/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:14:39Z",
    "sequence": 1793261679633
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e7c48498-9195-4ac6-bc38-89b8acbccc37",
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
  "last_heartbeat_at": "2026-10-29T08:14:39.07834Z",
  "last_location_at": "2026-10-29T08:14:39.07834Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/d518b52f-a260-488f-8580-4caf1cd10ac8/complete` → **200**

```json
{
  "command_id": "619905e9-bebf-4765-a62d-8ad94c12706c",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:14:39Z",
  "cash_received": true
}
```

```json
{
  "id": "d518b52f-a260-488f-8580-4caf1cd10ac8",
  "order_id": "870a42f9-dfd7-4274-902c-2211b552b4ee",
  "assignment_id": "3fefdc61-f477-456c-a20a-e1e66f15327f",
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
  "arrived_at": "2026-10-29T08:14:38.701277Z",
  "started_at": "2026-10-29T08:14:38.89127Z",
  "completed_at": "2026-10-29T08:14:39.257541Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/870a42f9-dfd7-4274-902c-2211b552b4ee/rating` → **200**

```json
{
  "command_id": "550b06a6-936b-4a4c-ba4d-86db87f3582a",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "870a42f9-dfd7-4274-902c-2211b552b4ee",
  "score": 5,
  "created_at": "2026-10-29T08:14:39.451245829Z"
}
```

`POST /api/driver/v1/orders/870a42f9-dfd7-4274-902c-2211b552b4ee/rating` → **200**

```json
{
  "command_id": "f5106659-969d-485e-b54c-302632a61302",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "870a42f9-dfd7-4274-902c-2211b552b4ee",
  "score": 4,
  "created_at": "2026-10-29T08:14:39.632126258Z"
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
  "session_id": "c4f4d863-6d84-4c40-b40c-eb767907889c",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1ODAsImlhdCI6MTc5MzI2MTY4MCwianRpIjoiNzQxZjQ2MGYtMzNlMi00OTMyLTgzZDMtZjllNTlmNDhkZTQ5Iiwic2lkIjoiYzRmNGQ4NjMtNmQ4NC00YzQwLWI0MGMtZWI3Njc5MDc4ODljIn0.i6tNK-IAoJBIl0EwgHBVEE2evpyKDdZbjtVbSsOM7cY",
  "access_expires_at": "2026-10-29T08:29:40.196531555Z",
  "refresh_token": "rpnAXMynLXI2MYFMWpo54l5Kcs8zn-x4Gyt-OKQe41U",
  "refresh_expires_at": "2026-10-29T20:14:40.19616545Z",
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
  "session_id": "ed157f6c-90cb-4dd3-a9a5-32f3171f69e2",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1ODAsImlhdCI6MTc5MzI2MTY4MCwianRpIjoiYWNkNGZjZTAtMmVmZS00YjdmLWJhZWMtOTAzY2QzYTRhZDY4Iiwic2lkIjoiZWQxNTdmNmMtOTBjYi00ZGQzLWE5YTUtMzJmMzE3MWY2OWUyIn0.d22j_PRUPcENH8ux8rqF7YX07XZLZYvRDNH4SxtN-tQ",
  "access_expires_at": "2026-10-29T08:29:40.571239556Z",
  "refresh_token": "mivvKSU_nCwNtUjS1a0JVE1ZPe5Ro4ftlKSoHXug3M4",
  "refresh_expires_at": "2026-10-29T20:14:40.570880682Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/870a42f9-dfd7-4274-902c-2211b552b4ee/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "870a42f9-dfd7-4274-902c-2211b552b4ee",
      "author_type": "RIDER",
      "author_id": "5527172b-829b-48cc-8433-655a8f5433eb",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T08:14:39.451246Z"
    },
    {
      "order_id": "870a42f9-dfd7-4274-902c-2211b552b4ee",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "5527172b-829b-48cc-8433-655a8f5433eb",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T08:14:39.632126Z"
    }
  ]
}
```

Done: ratings for order 870a42f9-dfd7-4274-902c-2211b552b4ee.

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
  "session_id": "899deac8-0aca-4d71-9db5-3f29cefbe3f0",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1ODEsImlhdCI6MTc5MzI2MTY4MSwianRpIjoiZWMxYWJlNDUtNmVjZC00MzUzLWI3ZDctMmI5MzE1OWYyODY3Iiwic2lkIjoiODk5ZGVhYzgtMGFjYS00ZDcxLTlkYjUtM2YyOWNlZmJlM2YwIn0.k2F5A_cKh-Yq_qA8uMSt84J6M5dkx1Ud06btFt1QlCw",
  "access_expires_at": "2026-10-29T08:29:41.154251364Z",
  "refresh_token": "OV0QzI1qQ8QaH_E3Q4l20L1wgc8ptla_-Eu3ZUK9_uY",
  "refresh_expires_at": "2026-10-29T20:14:41.153650449Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "e7dae587-de79-4b4a-b1c4-485661cfc020",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "b028a0c2-876f-4c49-a2d3-bc91eb747115",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T08:14:41.336949Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b028a0c2-876f-4c49-a2d3-bc91eb747115` → **200**

```json
{
  "id": "b028a0c2-876f-4c49-a2d3-bc91eb747115",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T08:14:41.336949Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b028a0c2-876f-4c49-a2d3-bc91eb747115` → **200**

```json
{
  "id": "b028a0c2-876f-4c49-a2d3-bc91eb747115",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T08:14:41.336949Z",
  "ready_at": "2026-10-29T08:14:42.554464Z",
  "expires_at": "2026-10-30T08:14:42.554464Z"
}
```

`GET /api/admin/v1/reports/exports/b028a0c2-876f-4c49-a2d3-bc91eb747115/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,23,10,13,0,0,18,5,0,21,1,0,1,7,1,5
total,23,10,13,0,0,18,5,0,21,1,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "8ef26350-f3f6-4815-91c3-6a16aed6e728",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "bdff824f-1956-4eb9-b178-b62a35636c1d",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T08:14:42.904297Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bdff824f-1956-4eb9-b178-b62a35636c1d` → **200**

```json
{
  "id": "bdff824f-1956-4eb9-b178-b62a35636c1d",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T08:14:42.904297Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bdff824f-1956-4eb9-b178-b62a35636c1d` → **200**

```json
{
  "id": "bdff824f-1956-4eb9-b178-b62a35636c1d",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T08:14:42.904297Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bdff824f-1956-4eb9-b178-b62a35636c1d` → **200**

```json
{
  "id": "bdff824f-1956-4eb9-b178-b62a35636c1d",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T08:14:42.904297Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bdff824f-1956-4eb9-b178-b62a35636c1d` → **200**

```json
{
  "id": "bdff824f-1956-4eb9-b178-b62a35636c1d",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T08:14:42.904297Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bdff824f-1956-4eb9-b178-b62a35636c1d` → **200**

```json
{
  "id": "bdff824f-1956-4eb9-b178-b62a35636c1d",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T08:14:42.904297Z",
  "ready_at": "2026-10-29T08:14:47.560022Z",
  "expires_at": "2026-10-30T08:14:47.560022Z"
}
```

`GET /api/admin/v1/reports/exports/bdff824f-1956-4eb9-b178-b62a35636c1d/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,10,1387.37,130.74,208.14,1179.23,10.52,0.00,162.97,182.97,795.00,50.00,105.17
total,UAH,10,1387.37,130.74,208.14,1179.23,10.52,0.00,162.97,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/7a259e28-8869-414a-b8e9-e88df85f223f` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/7a259e28-8869-414a-b8e9-e88df85f223f",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d70c6609-6864-4d72-ba6a-8e2f6c3f5ccb"
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
  "device_ref": "sandbox-29426"
}
```

```json
{
  "challenge_id": "529dc275-91c1-4615-9f41-feacf2307f06",
  "expires_at": "2026-10-29T08:19:48.211647147Z",
  "resend_available_at": "2026-10-29T08:14:49.211647147Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "148352",
  "sent_at": "2026-10-29T08:14:48.213525123Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "529dc275-91c1-4615-9f41-feacf2307f06",
  "code": "148352",
  "device_ref": "sandbox-29426"
}
```

```json
{
  "session_id": "bd036f7b-70e8-4cbc-a7fa-61321f3dc96d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjU4OCwiaWF0IjoxNzkzMjYxNjg4LCJqdGkiOiI1Y2IyNzczZi1jNmE2LTQzOTgtOWVjMS0zMzRiZWEyMmJjMWIiLCJzaWQiOiJiZDAzNmY3Yi03MGU4LTRjYmMtYTdmYS02MTMyMWYzZGM5NmQifQ.eVRXgQGaMwxjcUYlJJ7rxSuTzABejlKO-sXlA7UEEoE",
  "access_expires_at": "2026-10-29T08:29:48.412116092Z",
  "refresh_token": "viCBK0-cQIVHd9UferpxQp0qR9NCdt7QW4dQPdiIaxM",
  "refresh_expires_at": "2026-11-28T08:14:48.41169168Z",
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
  "command_id": "1cdcf587-9b19-45f8-be03-15447947a697",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:14:48Z",
    "sequence": 1793261688949
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7abb0c66-0f3b-4e29-8e47-9619b84a7901",
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
  "last_heartbeat_at": "2026-10-29T08:14:48.967534Z",
  "last_location_at": "2026-10-29T08:14:48.967534Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "23cf9735-febd-4c01-a4e4-535d6f7a6c27",
  "points": [
    {
      "sequence": 1793261691148,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T08:13:51Z"
    },
    {
      "sequence": 1793261691155,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T08:14:51Z"
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
  "session_id": "d8a55ccf-b54a-4d16-94fa-0ef5f8d007a8",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1OTEsImlhdCI6MTc5MzI2MTY5MSwianRpIjoiNDQ1NjA5NWMtMTU1Yy00MWQxLWE4NTgtMmY3YTkyNmVkNzZiIiwic2lkIjoiZDhhNTVjY2YtYjU0YS00ZDE2LTk0ZmEtMGVmNWY4ZDAwN2E4In0.WBn41IBLwbg0wcCWr6Zs6Utk8ZZGT9ZZJjthvXwmi_w",
  "access_expires_at": "2026-10-29T08:29:51.615080758Z",
  "refresh_token": "ejK93uGUWgEUXGKePCOV22HKLYvCmlN7O_P1kFaameo",
  "refresh_expires_at": "2026-10-29T20:14:51.614578527Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "8243800b-d553-44ad-9222-5621e5a77ed2",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T08:14:51Z",
        "track_point_id": "bd028ace-b63e-4e46-8496-ca281456d9c9",
        "work_session_id": "7abb0c66-0f3b-4e29-8e47-9619b84a7901"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T08:14:51Z",
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

`POST /api/admin/v1/driver-risk-flags/8243800b-d553-44ad-9222-5621e5a77ed2/confirm` → **200**

```json
{
  "command_id": "ea83b889-bb22-4d82-abfc-6a768b8618c0",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "8243800b-d553-44ad-9222-5621e5a77ed2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T08:14:51Z",
    "track_point_id": "bd028ace-b63e-4e46-8496-ca281456d9c9",
    "work_session_id": "7abb0c66-0f3b-4e29-8e47-9619b84a7901"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T08:14:51Z",
  "reason": null,
  "reviewed_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "reviewed_at": "2026-10-29T08:14:52.185876Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/8243800b-d553-44ad-9222-5621e5a77ed2/dismiss` → **409**

```json
{
  "command_id": "a14467cc-1bdd-4c86-a31e-c1473fcfb603",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/8243800b-d553-44ad-9222-5621e5a77ed2/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3d513418-8904-46f0-a2d0-f8e09ef5d9ea"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "d48868fc-d0c5-40ea-9f5c-fa4585c399dd",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "518c92cc-b4cb-4313-a22c-b021b433543a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "raised_at": "2026-10-29T08:14:52.559044Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/518c92cc-b4cb-4313-a22c-b021b433543a/dismiss` → **200**

```json
{
  "command_id": "13accbf6-5403-4b62-821a-ef1706e7bcba",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "518c92cc-b4cb-4313-a22c-b021b433543a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "raised_at": "2026-10-29T08:14:52.559044Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "reviewed_at": "2026-10-29T08:14:52.746927Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "808f2ac3-86f7-426d-ab5d-c281b20facf4",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "8243800b-d553-44ad-9222-5621e5a77ed2"
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
      "actor_id": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T08:14:52.938517Z"
    }
  ]
}
```

Done: flag 8243800b-d553-44ad-9222-5621e5a77ed2 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "abc1e218-7ceb-4a98-9097-d55d9d1b186c",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1OTMsImlhdCI6MTc5MzI2MTY5MywianRpIjoiYjI4MTUzNDQtYmQzYS00YTQyLWJjMDQtYWI0ODJmOGEyMzIxIiwic2lkIjoiYWJjMWUyMTgtN2NlYi00YTk4LTkwOTctZDU1ZDlkMWIxODZjIn0.-XcAWvPQyHGkAONPRwO8Yr-E0kdRoXfmKhdG5H2RfBU",
  "access_expires_at": "2026-10-29T08:29:53.495988427Z",
  "refresh_token": "nASDrjiVpaUxKTD27dfxtD0QW_OHufxT_ZgDt91Qufw",
  "refresh_expires_at": "2026-10-29T20:14:53.495656809Z",
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
      "actor_id": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T08:14:52.938517Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "cc86f812-c52f-483a-9032-8a0c4900f3c6",
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
  "session_id": "7abb0c66-0f3b-4e29-8e47-9619b84a7901",
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
  "last_heartbeat_at": "2026-10-29T08:14:48.967534Z",
  "last_location_at": "2026-10-29T08:14:48.967534Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7abb0c66-0f3b-4e29-8e47-9619b84a7901/close` → **200**

```json
{
  "command_id": "3a71245d-a3c5-4ef1-aa15-85d3f7f5ac48",
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
  "session_id": "4fbbe743-6760-4d0c-a6d2-89e7532341f8",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1OTQsImlhdCI6MTc5MzI2MTY5NCwianRpIjoiZWQ1ODdkNjEtZTY0OC00YTU0LWE0YWItMTgyMzg3MmRkMmEyIiwic2lkIjoiNGZiYmU3NDMtNjc2MC00ZDBjLWE2ZDItODllNzUzMjM0MWY4In0.OOF_rSIKBBrJfMaUY5lB7PSCBBLc6SibVUr0LtLEcRc",
  "access_expires_at": "2026-10-29T08:29:54.599023134Z",
  "refresh_token": "_Nb3UeXv2TdWmyf1mR3nwlZw2PF2hgOuXUhzyPvBG5E",
  "refresh_expires_at": "2026-10-29T20:14:54.598551944Z",
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
  "command_id": "99088fa6-edba-4f78-9905-680ea4ee1ef6",
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
  "changed_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T08:14:54.9779Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "99088fa6-edba-4f78-9905-680ea4ee1ef6",
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
  "changed_by": "3a4258dd-3209-4d24-8c44-4c5661453235",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T08:14:54.9779Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48348895118",
  "device_ref": "sandbox-7585"
}
```

```json
{
  "challenge_id": "67e17a08-85ef-40cc-bb67-9ec7f4e7e29b",
  "expires_at": "2026-10-29T08:19:55.379662898Z",
  "resend_available_at": "2026-10-29T08:14:56.379662898Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48348895118` → **200**

```json
{
  "phone": "+48348895118",
  "audience": "CLIENT",
  "code": "737894",
  "sent_at": "2026-10-29T08:14:55.381501884Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "67e17a08-85ef-40cc-bb67-9ec7f4e7e29b",
  "code": "737894",
  "device_ref": "sandbox-7585"
}
```

```json
{
  "session_id": "405a6c71-0d01-41af-9c26-91f3b5d5c7b7",
  "subject": {
    "type": "CLIENT",
    "id": "5c91aea4-7a98-49e9-b9ab-88dc9b4e4b02"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YzkxYWVhNC03YTk4LTQ5ZTktYjlhYi04OGRjOWI0ZTRiMDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNTk1LCJpYXQiOjE3OTMyNjE2OTUsImp0aSI6ImYzMTdhYjIwLTdjM2UtNDFmNi1iMjY1LWJiNDM3NWVhNmM3OCIsInNpZCI6IjQwNWE2YzcxLTBkMDEtNDFhZi05YzI2LTkxZjNiNWQ1YzdiNyJ9.wIt0nVSpT8gOdDini3Xrqt58dunhZgW4oiHcNNKAGII",
  "access_expires_at": "2026-10-29T08:29:55.573203891Z",
  "refresh_token": "rx41v9zOxssLPP0qagXp_nQMufHtFuD46dd3YjO_u3E",
  "refresh_expires_at": "2026-11-28T08:14:55.572894582Z",
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
  "correlation_id": "268cb7d3-cd5e-407f-9391-f37f4d10f509"
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
  "device_ref": "sandbox-23835"
}
```

```json
{
  "challenge_id": "bfe0a07f-bea3-4fc8-8496-6ce4a91ac388",
  "expires_at": "2026-10-29T08:19:56.102592495Z",
  "resend_available_at": "2026-10-29T08:14:57.102592495Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "813918",
  "sent_at": "2026-10-29T08:14:56.104198238Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bfe0a07f-bea3-4fc8-8496-6ce4a91ac388",
  "code": "813918",
  "device_ref": "sandbox-23835"
}
```

```json
{
  "session_id": "4c613680-ca97-44fe-9e7d-780396cc106d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjU5NiwiaWF0IjoxNzkzMjYxNjk2LCJqdGkiOiI5NzBiYzM4Yi1lMjY3LTRmMWEtYTFkZC0wYzZmZTZkYjUwZTkiLCJzaWQiOiI0YzYxMzY4MC1jYTk3LTQ0ZmUtOWU3ZC03ODAzOTZjYzEwNmQifQ.Okyk4MuSPgde4GjBR9sRHDtSAeCpx4p2g4aAbWBUx6A",
  "access_expires_at": "2026-10-29T08:29:56.300439147Z",
  "refresh_token": "hJw2IEonpsirT47mCr6hFBvh4sk6ahWKNsZHNwVkHbc",
  "refresh_expires_at": "2026-11-28T08:14:56.300083158Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "becbebcc-25a7-4837-adda-d00e567cef06",
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
  "last_heartbeat_at": "2026-10-29T08:14:34.40813Z",
  "last_location_at": "2026-10-29T08:14:34.40813Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/becbebcc-25a7-4837-adda-d00e567cef06/handover` → **200**

```json
{
  "command_id": "86d4b1e6-ad02-47d9-bcf9-e7bbe941ec5a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "becbebcc-25a7-4837-adda-d00e567cef06",
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
  "last_heartbeat_at": "2026-10-29T08:14:34.40813Z",
  "last_location_at": "2026-10-29T08:14:34.40813Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/becbebcc-25a7-4837-adda-d00e567cef06/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:14:56Z",
    "sequence": 1793261696866
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "becbebcc-25a7-4837-adda-d00e567cef06",
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
  "last_heartbeat_at": "2026-10-29T08:14:56.88092Z",
  "last_location_at": "2026-10-29T08:14:56.88092Z",
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
  "session_id": "becbebcc-25a7-4837-adda-d00e567cef06",
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
  "last_heartbeat_at": "2026-10-29T08:14:56.88092Z",
  "last_location_at": "2026-10-29T08:14:56.88092Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/becbebcc-25a7-4837-adda-d00e567cef06/close` → **200**

```json
{
  "command_id": "b66d6634-2bef-4ed7-bbe9-51ec18524ecc",
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
  "correlation_id": "89f27d5c-39ee-4e7b-91bd-ffbddf92ef97"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670817913",
  "device_ref": "sandbox-21506"
}
```

```json
{
  "challenge_id": "b81692da-5a7f-4933-ab99-8ac48159fd1f",
  "expires_at": "2026-10-29T08:19:57.782907256Z",
  "resend_available_at": "2026-10-29T08:14:58.782907256Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670817913` → **200**

```json
{
  "phone": "+380670817913",
  "audience": "CLIENT",
  "code": "269847",
  "sent_at": "2026-10-29T08:14:57.784875748Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b81692da-5a7f-4933-ab99-8ac48159fd1f",
  "code": "269847",
  "device_ref": "sandbox-21506"
}
```

```json
{
  "session_id": "1672fc1e-4b1a-495e-a177-3dfd3b2fbf34",
  "subject": {
    "type": "CLIENT",
    "id": "4ece4e99-c660-45cd-b22e-a1063fdd8344"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWNlNGU5OS1jNjYwLTQ1Y2QtYjIyZS1hMTA2M2ZkZDgzNDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNTk3LCJpYXQiOjE3OTMyNjE2OTcsImp0aSI6IjliODY3OTExLTE3ZjMtNDQwYi04OWQyLTA5ZWM5OTMyZTZkOCIsInNpZCI6IjE2NzJmYzFlLTRiMWEtNDk1ZS1hMTc3LTNkZmQzYjJmYmYzNCJ9.QULRTUostXUd_Bs0QHDbhtDG8469DTRtl5Vipm7r84Y",
  "access_expires_at": "2026-10-29T08:29:57.981400356Z",
  "refresh_token": "glTp4_8itT3Xp9zL1Z2MM9m6ffAHmqcT3s-ZqlEUSIg",
  "refresh_expires_at": "2026-11-28T08:14:57.981052799Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "58cef85f-e3ce-4c3c-86cd-8c1a56c873bd",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "9eb4800a-8852-4552-9801-9a5573438097",
  "upload_path": "/api/rider/v1/uploads/9eb4800a-8852-4552-9801-9a5573438097",
  "expires_at": "2026-10-29T08:29:58.158880933Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/9eb4800a-8852-4552-9801-9a5573438097` → **200**

```json
{
  "file_id": "9eb4800a-8852-4552-9801-9a5573438097",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "5418f774-1762-402a-a6e4-785b911db6f6",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "9eb4800a-8852-4552-9801-9a5573438097"
  ]
}
```

```json
{
  "id": "fef1e8d6-aec6-4159-9d3d-0af526db8324",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "4ece4e99-c660-45cd-b22e-a1063fdd8344",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T08:14:58.365555Z",
  "updated_at": "2026-10-29T08:14:58.365555Z",
  "respond_by": "2026-10-29T12:14:58.365555Z",
  "messages": [
    {
      "id": "03912415-9d7b-492e-985e-1dcbf23e1002",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "4ece4e99-c660-45cd-b22e-a1063fdd8344",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T08:14:58.366461Z",
      "attachments": [
        {
          "file_id": "9eb4800a-8852-4552-9801-9a5573438097",
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
  "session_id": "fb83a010-9d79-4b8b-809a-b2270d82f3b6",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1OTgsImlhdCI6MTc5MzI2MTY5OCwianRpIjoiOWUyZTgwYjYtMDVhYi00ZTkzLTk2NmEtODYzNmM3YmNlZWQxIiwic2lkIjoiZmI4M2EwMTAtOWQ3OS00YjhiLTgwOWEtYjIyNzBkODJmM2I2In0.bWZWbuokRAiAI8jMGhU1tf7NHmcwFW-HJJ_zE99rFhU",
  "access_expires_at": "2026-10-29T08:29:58.758307029Z",
  "refresh_token": "s2jgrbKsZT9dPL3R8w9adZL6h-Cy4s5FfEGVDVDs_dU",
  "refresh_expires_at": "2026-10-29T20:14:58.757984781Z",
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
  "session_id": "04ffe4af-d83b-4d1e-94c7-d08c304a2374",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI1OTksImlhdCI6MTc5MzI2MTY5OSwianRpIjoiYjc2M2EzNzktOTlkOC00OWEyLWE0ZmItNDMxOGQzZTBhMWE5Iiwic2lkIjoiMDRmZmU0YWYtZDgzYi00ZDFlLTk0YzctZDA4YzMwNGEyMzc0In0.QRlNj8wzDuw1g0MQCoNNtc_hJAwRX-9p5eN-CA3WDt4",
  "access_expires_at": "2026-10-29T08:29:59.127548167Z",
  "refresh_token": "GQ_wPmg7Voz-J5XpA2Z-pNEEXKQ42eOVUR2wvRCfxFg",
  "refresh_expires_at": "2026-10-29T20:14:59.127169153Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/fef1e8d6-aec6-4159-9d3d-0af526db8324/attachments/9eb4800a-8852-4552-9801-9a5573438097` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "c39ee7d2-1740-4533-9f66-a287d48a27bb",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "124945bd-40da-432f-9bbc-9a3aa2521fb1",
  "upload_path": "/api/operator/v1/uploads/124945bd-40da-432f-9bbc-9a3aa2521fb1",
  "expires_at": "2026-10-29T08:29:59.309863353Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/124945bd-40da-432f-9bbc-9a3aa2521fb1` → **200**

```json
{
  "file_id": "124945bd-40da-432f-9bbc-9a3aa2521fb1",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/fef1e8d6-aec6-4159-9d3d-0af526db8324` → **200**

```json
{
  "id": "fef1e8d6-aec6-4159-9d3d-0af526db8324",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "4ece4e99-c660-45cd-b22e-a1063fdd8344",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T08:14:58.365555Z",
  "updated_at": "2026-10-29T08:14:58.365555Z",
  "respond_by": "2026-10-29T12:14:58.365555Z",
  "messages": [
    {
      "id": "03912415-9d7b-492e-985e-1dcbf23e1002",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "4ece4e99-c660-45cd-b22e-a1063fdd8344",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T08:14:58.366461Z",
      "attachments": [
        {
          "file_id": "9eb4800a-8852-4552-9801-9a5573438097",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/fef1e8d6-aec6-4159-9d3d-0af526db8324/comments` → **200**

```json
{
  "command_id": "95df6767-5150-42fd-beb2-024890e3a42f",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "124945bd-40da-432f-9bbc-9a3aa2521fb1"
  ]
}
```

```json
{
  "id": "fef1e8d6-aec6-4159-9d3d-0af526db8324",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "4ece4e99-c660-45cd-b22e-a1063fdd8344",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T08:14:58.365555Z",
  "updated_at": "2026-10-29T08:14:59.687597Z",
  "respond_by": "2026-10-29T12:14:58.365555Z",
  "messages": [
    {
      "id": "03912415-9d7b-492e-985e-1dcbf23e1002",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "4ece4e99-c660-45cd-b22e-a1063fdd8344",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T08:14:58.366461Z",
      "attachments": [
        {
          "file_id": "9eb4800a-8852-4552-9801-9a5573438097",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "a96c9612-b6d4-45ba-b121-ac424025f7ad",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T08:14:59.687307Z",
      "attachments": [
        {
          "file_id": "124945bd-40da-432f-9bbc-9a3aa2521fb1",
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

`GET /api/rider/v1/support/cases/fef1e8d6-aec6-4159-9d3d-0af526db8324` → **200**

```json
{
  "id": "fef1e8d6-aec6-4159-9d3d-0af526db8324",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "4ece4e99-c660-45cd-b22e-a1063fdd8344",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T08:14:58.365555Z",
  "updated_at": "2026-10-29T08:14:59.687597Z",
  "respond_by": "2026-10-29T12:14:58.365555Z",
  "messages": [
    {
      "id": "03912415-9d7b-492e-985e-1dcbf23e1002",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "4ece4e99-c660-45cd-b22e-a1063fdd8344",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T08:14:58.366461Z",
      "attachments": [
        {
          "file_id": "9eb4800a-8852-4552-9801-9a5573438097",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "a96c9612-b6d4-45ba-b121-ac424025f7ad",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T08:14:59.687307Z",
      "attachments": [
        {
          "file_id": "124945bd-40da-432f-9bbc-9a3aa2521fb1",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/fef1e8d6-aec6-4159-9d3d-0af526db8324/attachments/124945bd-40da-432f-9bbc-9a3aa2521fb1` → **200**

Done: support case fef1e8d6-aec6-4159-9d3d-0af526db8324, rider attachment 9eb4800a-8852-4552-9801-9a5573438097, operator attachment 124945bd-40da-432f-9bbc-9a3aa2521fb1.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739265439",
  "device_ref": "sandbox-19323"
}
```

```json
{
  "challenge_id": "62b29d04-ff12-403c-a5ff-f8eb68ac8edf",
  "expires_at": "2026-10-29T08:20:00.069833883Z",
  "resend_available_at": "2026-10-29T08:15:01.069833883Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380739265439` → **200**

```json
{
  "phone": "+380739265439",
  "audience": "CLIENT",
  "code": "009387",
  "sent_at": "2026-10-29T08:15:00.071319077Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62b29d04-ff12-403c-a5ff-f8eb68ac8edf",
  "code": "009387",
  "device_ref": "sandbox-19323"
}
```

```json
{
  "session_id": "6a2b25e5-6e3d-49d5-bb1c-19f34e6dbbd0",
  "subject": {
    "type": "CLIENT",
    "id": "45e0fe12-1b66-493c-b946-44aa116ce320"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NWUwZmUxMi0xYjY2LTQ5M2MtYjk0Ni00NGFhMTE2Y2UzMjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNjAwLCJpYXQiOjE3OTMyNjE3MDAsImp0aSI6ImI2ZDhhODk1LTk1ZmQtNGNmZS1hNDBjLTI4MzZmN2E5ZjQwMyIsInNpZCI6IjZhMmIyNWU1LTZlM2QtNDlkNS1iYjFjLTE5ZjM0ZTZkYmJkMCJ9.thD2_fcCP4jzWKsVgv8MHnSMLlfutUKbbyWh9ateEQo",
  "access_expires_at": "2026-10-29T08:30:00.271976468Z",
  "refresh_token": "DFQt1PvA4n4wogaAbZPgzbmkx2vF7wpDI7jsUd5CxbU",
  "refresh_expires_at": "2026-11-28T08:15:00.27152306Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "eaef2678-0c57-47a8-9594-74f248df7b04",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "41c6ae69-029e-4399-b805-084223547c22",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-41c6ae69-029e-4399-b805-084223547c22",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "637dcd8714ee167512b6dcaf3093382b",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=41c6ae69-029e-4399-b805-084223547c22",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739265439"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=41c6ae69-029e-4399-b805-084223547c22",
  "expires_at": "2026-10-29T08:45:00.45075Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/41c6ae69-029e-4399-b805-084223547c22` → **200**

```json
{
  "id": "41c6ae69-029e-4399-b805-084223547c22",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T08:45:00.45075Z",
  "card": {
    "id": "027cf5f1-b011-420a-aace-7fcc6efebaa4",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1852",
    "card_type": "Visa",
    "created_at": "2026-10-29T08:15:00.62801Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3d18f925-9b49-40c4-ab80-1ee14688db59",
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
  "id": "fc8e78aa-8e02-4910-9b24-e4a3e1e9c36f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:20:00.820012Z",
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
  "command_id": "6d982ace-0cd5-4efa-96a8-d91507955b56",
  "quote_id": "fc8e78aa-8e02-4910-9b24-e4a3e1e9c36f",
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
  "id": "02f1d32a-ce05-4036-8f54-f3c4f22c3188",
  "short_number": 25,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "45e0fe12-1b66-493c-b946-44aa116ce320",
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
  "created_at": "2026-10-29T08:15:01.012289Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/02f1d32a-ce05-4036-8f54-f3c4f22c3188` → **200**

```json
{
  "id": "02f1d32a-ce05-4036-8f54-f3c4f22c3188",
  "short_number": 25,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "45e0fe12-1b66-493c-b946-44aa116ce320",
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
  "created_at": "2026-10-29T08:15:01.012289Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/02f1d32a-ce05-4036-8f54-f3c4f22c3188` → **200**

```json
{
  "id": "02f1d32a-ce05-4036-8f54-f3c4f22c3188",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "45e0fe12-1b66-493c-b946-44aa116ce320",
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
  "created_at": "2026-10-29T08:15:01.012289Z",
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

`GET /api/rider/v1/orders/02f1d32a-ce05-4036-8f54-f3c4f22c3188` → **200**

```json
{
  "id": "02f1d32a-ce05-4036-8f54-f3c4f22c3188",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "45e0fe12-1b66-493c-b946-44aa116ce320",
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
  "created_at": "2026-10-29T08:15:01.012289Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/02f1d32a-ce05-4036-8f54-f3c4f22c3188/switch-to-cash` → **200**

```json
{
  "command_id": "7fb3c39b-0873-4dc4-921c-458d683c724c",
  "expected_version": 3
}
```

```json
{
  "id": "02f1d32a-ce05-4036-8f54-f3c4f22c3188",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "45e0fe12-1b66-493c-b946-44aa116ce320",
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
  "created_at": "2026-10-29T08:15:01.012289Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/02f1d32a-ce05-4036-8f54-f3c4f22c3188/switch-to-cash` → **409**

```json
{
  "command_id": "4e19fc0f-6e13-4689-94ae-8f51fca8f453",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/02f1d32a-ce05-4036-8f54-f3c4f22c3188/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "907ecaef-fbfc-4eee-a40c-13c3daafb612"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/02f1d32a-ce05-4036-8f54-f3c4f22c3188` → **200**

```json
{
  "id": "02f1d32a-ce05-4036-8f54-f3c4f22c3188",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "45e0fe12-1b66-493c-b946-44aa116ce320",
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
  "created_at": "2026-10-29T08:15:01.012289Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/02f1d32a-ce05-4036-8f54-f3c4f22c3188/cancel` → **200**

```json
{
  "command_id": "8ba90872-8603-4298-935f-d0fc2e5d0aa2",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "02f1d32a-ce05-4036-8f54-f3c4f22c3188",
  "short_number": 25,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "45e0fe12-1b66-493c-b946-44aa116ce320",
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
  "created_at": "2026-10-29T08:15:01.012289Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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
  "session_id": "0e2d19e1-57d2-46eb-a688-76e049f812ab",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI2MDMsImlhdCI6MTc5MzI2MTcwMywianRpIjoiNmQ5NzEwYTAtNDQzYS00NzZmLWE0MTYtZWZkODUzNjFhMDJkIiwic2lkIjoiMGUyZDE5ZTEtNTdkMi00NmViLWE2ODgtNzZlMDQ5ZjgxMmFiIn0.p12qpfM8ezXp9O2PY6z7C-CjEJ0KG4B9faGPx6S0B0c",
  "access_expires_at": "2026-10-29T08:30:03.751849887Z",
  "refresh_token": "w2T-d7zQCxQ9o3H4S-S1BTIV4exVb54wLZm55pu_N6M",
  "refresh_expires_at": "2026-10-29T20:15:03.75144991Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-4208"
}
```

```json
{
  "challenge_id": "bf5ac9fe-2549-48ae-8f7a-9396fc2e6588",
  "expires_at": "2026-10-29T08:20:03.944149006Z",
  "resend_available_at": "2026-10-29T08:15:04.944149006Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "242482",
  "sent_at": "2026-10-29T08:15:03.94587176Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf5ac9fe-2549-48ae-8f7a-9396fc2e6588",
  "code": "242482",
  "device_ref": "sandbox-4208"
}
```

```json
{
  "session_id": "2331eccf-890d-42e9-a4b3-bc5bfe9f72e6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjYwNCwiaWF0IjoxNzkzMjYxNzA0LCJqdGkiOiI5OWQ1NTIyNy03N2FiLTQ2YTAtYWNiNS01ZTE1ZDg3ZTJlYjgiLCJzaWQiOiIyMzMxZWNjZi04OTBkLTQyZTktYTRiMy1iYzViZmU5ZjcyZTYifQ.C8nwg2Z85Fn5CqVygtlv0vCcBGW_xVo2vxEe7DbVzmY",
  "access_expires_at": "2026-10-29T08:30:04.18176662Z",
  "refresh_token": "ZCjclRMk_wk6cwph6uuRIxyZBVNJo_KsXbVEfZUJKAU",
  "refresh_expires_at": "2026-11-28T08:15:04.181256872Z",
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
      "actor_id": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T08:14:52.938517Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "3a4258dd-3209-4d24-8c44-4c5661453235",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T08:14:53.850644Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "8f812521-cc86-446f-a39d-8b72dd7927ca",
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
  "device_ref": "sandbox-22475"
}
```

```json
{
  "challenge_id": "ea5786f1-b1b3-44fa-aedb-8894bbb2679c",
  "expires_at": "2026-10-29T08:20:04.93376071Z",
  "resend_available_at": "2026-10-29T08:15:05.93376071Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "259237",
  "sent_at": "2026-10-29T08:15:04.935386092Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ea5786f1-b1b3-44fa-aedb-8894bbb2679c",
  "code": "259237",
  "device_ref": "sandbox-22475"
}
```

```json
{
  "session_id": "c56e2a44-64a0-43e7-9811-b67217a8263d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjYwNSwiaWF0IjoxNzkzMjYxNzA1LCJqdGkiOiIzOGJkZTNiMy1mNTI3LTQ2MTItOGMwNy0wYjBjZjNmYWVjNDgiLCJzaWQiOiJjNTZlMmE0NC02NGEwLTQzZTctOTgxMS1iNjcyMTdhODI2M2QifQ.ncR5bP-NnRo2YcJC7UowYjlCP4bZPGNE0bLe5X6VLYk",
  "access_expires_at": "2026-10-29T08:30:05.131019745Z",
  "refresh_token": "LBmIhCuXu6L9y8kdE2xJ2BjTxxD61qx1FkbLWMiyvkU",
  "refresh_expires_at": "2026-11-28T08:15:05.130623315Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e7c48498-9195-4ac6-bc38-89b8acbccc37",
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
  "last_heartbeat_at": "2026-10-29T08:14:39.07834Z",
  "last_location_at": "2026-10-29T08:14:39.07834Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e7c48498-9195-4ac6-bc38-89b8acbccc37/handover` → **200**

```json
{
  "command_id": "62f5b346-ab9f-41d3-898a-3cffa81ee814",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e7c48498-9195-4ac6-bc38-89b8acbccc37",
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
  "last_heartbeat_at": "2026-10-29T08:14:39.07834Z",
  "last_location_at": "2026-10-29T08:14:39.07834Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e7c48498-9195-4ac6-bc38-89b8acbccc37/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:15:05Z",
    "sequence": 1793261705672
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e7c48498-9195-4ac6-bc38-89b8acbccc37",
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
  "last_heartbeat_at": "2026-10-29T08:15:05.688975Z",
  "last_location_at": "2026-10-29T08:15:05.688975Z",
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
  "command_id": "5d365969-33b4-457f-9477-a15a15fe0aa1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:15:06Z",
    "sequence": 1793261706494
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "af62aec8-2071-4dc6-b05f-e38e8b05cfc2",
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
  "last_heartbeat_at": "2026-10-29T08:15:06.064299Z",
  "last_location_at": "2026-10-29T08:15:06.064299Z",
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
  "session_id": "528e09a7-2d34-4bf4-a0de-d72662e96a4b",
  "subject": {
    "type": "STAFF",
    "id": "3a4258dd-3209-4d24-8c44-4c5661453235"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTQyNThkZC0zMjA5LTRkMjQtOGM0NC00YzU2NjE0NTMyMzUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjI2MDYsImlhdCI6MTc5MzI2MTcwNiwianRpIjoiNWZiMDlmMmUtMmY1ZS00M2NjLTgxNTgtMjU4ZGRhMDViYjRiIiwic2lkIjoiNTI4ZTA5YTctMmQzNC00YmY0LWEwZGUtZDcyNjYyZTk2YTRiIn0.nmimB016goYMhG9zbxpKdAt0CB3ilLL4RJ98WZzmn5A",
  "access_expires_at": "2026-10-29T08:30:06.445627961Z",
  "refresh_token": "EA0ijNqEINko9M6xcO69Jd4nc8J4We1_KAt6NvX9Saw",
  "refresh_expires_at": "2026-10-29T20:15:06.445270419Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "42a938f0-c136-42e3-a026-84fb815c7c4d",
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
  "id": "ea03f38b-6381-4388-bbe6-adcb3dcd1c01",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:20:06.624198Z",
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
  "command_id": "2d0b9853-8ab0-429b-92ed-fb4852aeb23d",
  "quote_id": "ea03f38b-6381-4388-bbe6-adcb3dcd1c01",
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
  "id": "181e2f72-9dee-4ce9-bda0-0ac8361ee82c",
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
  "created_at": "2026-10-29T08:15:06.81365Z",
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
    "id": "77786403-a040-4a2e-ab92-9908eb4cac6c",
    "order_id": "181e2f72-9dee-4ce9-bda0-0ac8361ee82c",
    "expires_at": "2026-10-29T08:15:21.816806Z",
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

`POST /api/driver/v1/offers/77786403-a040-4a2e-ab92-9908eb4cac6c/accept` → **200**

```json
{
  "command_id": "25baa6df-9431-42a9-93c5-8c78e584e4a9"
}
```

```json
{
  "id": "40e7ab65-f7c4-48d3-9a0f-96b2ddfd928f",
  "order_id": "181e2f72-9dee-4ce9-bda0-0ac8361ee82c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e80256fb-2256-46c9-b5bd-918fb7828092",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e80256fb-2256-46c9-b5bd-918fb7828092",
  "order_id": "181e2f72-9dee-4ce9-bda0-0ac8361ee82c",
  "assignment_id": "40e7ab65-f7c4-48d3-9a0f-96b2ddfd928f",
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

`POST /api/driver/v1/work-sessions/af62aec8-2071-4dc6-b05f-e38e8b05cfc2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T08:15:07Z",
    "sequence": 1793261707716
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "af62aec8-2071-4dc6-b05f-e38e8b05cfc2",
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
  "last_heartbeat_at": "2026-10-29T08:15:07.732221Z",
  "last_location_at": "2026-10-29T08:15:07.732221Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e80256fb-2256-46c9-b5bd-918fb7828092/arrive` → **200**

```json
{
  "command_id": "d93fa0b8-c88a-4317-af28-68f386b54bc3",
  "expected_version": 0
}
```

```json
{
  "id": "e80256fb-2256-46c9-b5bd-918fb7828092",
  "order_id": "181e2f72-9dee-4ce9-bda0-0ac8361ee82c",
  "assignment_id": "40e7ab65-f7c4-48d3-9a0f-96b2ddfd928f",
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
  "arrived_at": "2026-10-29T08:15:07.918393Z",
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

`POST /api/driver/v1/trips/e80256fb-2256-46c9-b5bd-918fb7828092/start` → **200**

```json
{
  "command_id": "a6973b95-8e40-45d4-a067-3a8e92cfc691",
  "expected_version": 1
}
```

```json
{
  "id": "e80256fb-2256-46c9-b5bd-918fb7828092",
  "order_id": "181e2f72-9dee-4ce9-bda0-0ac8361ee82c",
  "assignment_id": "40e7ab65-f7c4-48d3-9a0f-96b2ddfd928f",
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
  "arrived_at": "2026-10-29T08:15:07.918393Z",
  "started_at": "2026-10-29T08:15:08.10648Z",
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

`POST /api/driver/v1/trips/e80256fb-2256-46c9-b5bd-918fb7828092/complete` → **200**

```json
{
  "command_id": "36dd947a-28ee-4e0d-b61e-dd1dee259130",
  "expected_version": 2,
  "reported_at": "2026-10-29T08:15:08Z",
  "cash_received": true
}
```

```json
{
  "id": "e80256fb-2256-46c9-b5bd-918fb7828092",
  "order_id": "181e2f72-9dee-4ce9-bda0-0ac8361ee82c",
  "assignment_id": "40e7ab65-f7c4-48d3-9a0f-96b2ddfd928f",
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
  "arrived_at": "2026-10-29T08:15:07.918393Z",
  "started_at": "2026-10-29T08:15:08.10648Z",
  "completed_at": "2026-10-29T08:15:08.299868Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/181e2f72-9dee-4ce9-bda0-0ac8361ee82c` → **200**

```json
{
  "id": "181e2f72-9dee-4ce9-bda0-0ac8361ee82c",
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
    "id": "40e7ab65-f7c4-48d3-9a0f-96b2ddfd928f",
    "order_id": "181e2f72-9dee-4ce9-bda0-0ac8361ee82c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e80256fb-2256-46c9-b5bd-918fb7828092",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T08:15:06.81365Z",
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
  "session_id": "e7c48498-9195-4ac6-bc38-89b8acbccc37",
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
  "last_heartbeat_at": "2026-10-29T08:15:05.688975Z",
  "last_location_at": "2026-10-29T08:15:05.688975Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e7c48498-9195-4ac6-bc38-89b8acbccc37/close` → **200**

```json
{
  "command_id": "194ca0c2-0219-4f3e-aa95-82e45a46a464",
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
  "session_id": "af62aec8-2071-4dc6-b05f-e38e8b05cfc2",
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
  "last_heartbeat_at": "2026-10-29T08:15:07.732221Z",
  "last_location_at": "2026-10-29T08:15:07.732221Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/af62aec8-2071-4dc6-b05f-e38e8b05cfc2/close` → **200**

```json
{
  "command_id": "5fb52c0e-fd63-47a9-a50c-a7e99cc5d9cc",
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

Done: terminal order 181e2f72-9dee-4ce9-bda0-0ac8361ee82c by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4756"
}
```

```json
{
  "challenge_id": "37f3363a-9d98-4cb9-904b-d0402fe1525d",
  "expires_at": "2026-10-29T08:20:12.567880787Z",
  "resend_available_at": "2026-10-29T08:15:13.567880787Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "337031",
  "sent_at": "2026-10-29T08:15:12.569604589Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "37f3363a-9d98-4cb9-904b-d0402fe1525d",
  "code": "337031",
  "device_ref": "sandbox-4756"
}
```

```json
{
  "session_id": "3c8ea225-5397-4521-907a-3bb86542106a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjYxMiwiaWF0IjoxNzkzMjYxNzEyLCJqdGkiOiJlMDQ1N2ExYy1kOGUwLTRkYjAtOGJkMS0yMGVkZjI0NTViYzkiLCJzaWQiOiIzYzhlYTIyNS01Mzk3LTQ1MjEtOTA3YS0zYmI4NjU0MjEwNmEifQ.S4p_xM03UcjugbJOeJ88IQAcKfz1dvQxosEDjzP33cs",
  "access_expires_at": "2026-10-29T08:30:12.775988599Z",
  "refresh_token": "wUrdtiVOp3DWDV7GM3aOMOiHnMbc5ICeGB4hkxhggY8",
  "refresh_expires_at": "2026-11-28T08:15:12.775456232Z",
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
  "device_ref": "sandbox-9579"
}
```

```json
{
  "challenge_id": "ea63564f-9294-4f67-bfe0-4ac44bdb6560",
  "expires_at": "2026-10-29T08:20:13.133410015Z",
  "resend_available_at": "2026-10-29T08:15:14.133410015Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "576613",
  "sent_at": "2026-10-29T08:15:13.135177291Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ea63564f-9294-4f67-bfe0-4ac44bdb6560",
  "code": "576613",
  "device_ref": "sandbox-9579"
}
```

```json
{
  "session_id": "d7d4ce78-6b43-49f4-85a6-8aca99fc736b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjYxMywiaWF0IjoxNzkzMjYxNzEzLCJqdGkiOiI0YmM2MmE5NS1jYzM2LTQyZjktOGE2ZC1mOTZhN2ZlYzVmMjciLCJzaWQiOiJkN2Q0Y2U3OC02YjQzLTQ5ZjQtODVhNi04YWNhOTlmYzczNmIifQ.OyarMkDurvvHRdDYYXFig9euM1U1jGWGgooVVIqAHVU",
  "access_expires_at": "2026-10-29T08:30:13.337020027Z",
  "refresh_token": "UalPJm2ZmRFr34qIBmTaBnGFwVSNJkssoCVpIh85YOw",
  "refresh_expires_at": "2026-11-28T08:15:13.336664198Z",
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
  "device_ref": "sandbox-4620"
}
```

```json
{
  "challenge_id": "f13a4692-ddf1-4bfc-801f-3774322f8245",
  "expires_at": "2026-10-29T08:20:13.686162537Z",
  "resend_available_at": "2026-10-29T08:15:14.686162537Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "674781",
  "sent_at": "2026-10-29T08:15:13.687598873Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f13a4692-ddf1-4bfc-801f-3774322f8245",
  "code": "674781",
  "device_ref": "sandbox-4620"
}
```

```json
{
  "session_id": "1d66ba0f-34ad-40e8-aa33-95571baee2be",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MjYxMywiaWF0IjoxNzkzMjYxNzEzLCJqdGkiOiJlMWIyYjE1YS01NzZmLTQzMWUtODZlYS1lYWNkMjJlZjYxNTIiLCJzaWQiOiIxZDY2YmEwZi0zNGFkLTQwZTgtYWEzMy05NTU3MWJhZWUyYmUifQ.0hrcvZQhWNtEIKV5L8FFVTR0nqHsPbElJV22LzS1Nt8",
  "access_expires_at": "2026-10-29T08:30:13.889051006Z",
  "refresh_token": "2ZiKGMZBF55phVNPZ4ryzm_kNqlm5QBxO03N9nlc-9c",
  "refresh_expires_at": "2026-11-28T08:15:13.888654541Z",
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
  "phone": "+380694616730",
  "device_ref": "sandbox-24295"
}
```

```json
{
  "challenge_id": "f92c4db1-a56a-41f2-812e-d08f0934bb0d",
  "expires_at": "2026-10-29T08:20:14.234029788Z",
  "resend_available_at": "2026-10-29T08:15:15.234029788Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380694616730` → **200**

```json
{
  "phone": "+380694616730",
  "audience": "CLIENT",
  "code": "862441",
  "sent_at": "2026-10-29T08:15:14.235712296Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f92c4db1-a56a-41f2-812e-d08f0934bb0d",
  "code": "862441",
  "device_ref": "sandbox-24295"
}
```

```json
{
  "session_id": "b9e93538-22ac-4381-8bc0-6cb996f340bf",
  "subject": {
    "type": "CLIENT",
    "id": "9c6f56ef-2649-4a4b-917f-b043df197bb6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YzZmNTZlZi0yNjQ5LTRhNGItOTE3Zi1iMDQzZGYxOTdiYjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYyNjE0LCJpYXQiOjE3OTMyNjE3MTQsImp0aSI6ImFiY2IxZWE3LTk5NWYtNDQzYy04OWNhLTlhMGI3NDlhNjU3OCIsInNpZCI6ImI5ZTkzNTM4LTIyYWMtNDM4MS04YmMwLTZjYjk5NmYzNDBiZiJ9.9hc_tuITw3hRb4vQov3g0LEUH7AFW_2futM11wu2Pp8",
  "access_expires_at": "2026-10-29T08:30:14.424979356Z",
  "refresh_token": "jAvsVTCnGek-Du18NjbiY44o5E2nrvfgOGR349NyXhg",
  "refresh_expires_at": "2026-11-28T08:15:14.424637218Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c3c19920-215e-496e-8a11-d8c17044e2de",
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
  "id": "2c4e239f-4f4f-42bf-a48a-417efc83e209",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:20:14.604463Z",
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
  "command_id": "27b50dce-f4e3-4654-9f8c-65c5ade599fa",
  "quote_id": "2c4e239f-4f4f-42bf-a48a-417efc83e209",
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
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T08:15:14.79469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:15:14.79469Z",
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
  "blizz_sms_sent_total": 69
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 16
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 8.841433029
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 4.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 17
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.091523345
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

`GET /api/rider/v1/orders/0d53615d-4a7d-4f5e-8451-d796302336b5` → **200**

```json
{
  "id": "0d53615d-4a7d-4f5e-8451-d796302336b5",
  "short_number": 27,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9c6f56ef-2649-4a4b-917f-b043df197bb6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T08:15:14.79469Z",
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
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793262022627E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793262022659E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793262022659E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.79326202266E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.79326202266E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
