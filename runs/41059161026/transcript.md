# Sandbox transcript (2026-10-30T12:57:16Z, af7a17e)

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
  "correlation_id": "a5fb581e-4e0d-45f4-a65b-815acf31bbdc"
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
  "session_id": "a2fbe90b-32f2-4970-a11a-b669a4bdeb17",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU5NDIsImlhdCI6MTc5MzM2NTA0MiwianRpIjoiMTA2NzBlMDctMzA2Ny00NDhiLWFhNjMtNTkzOGEwODNjZjFhIiwic2lkIjoiYTJmYmU5MGItMzJmMi00OTcwLWExMWEtYjY2OWE0YmRlYjE3In0.I1y_z1ftj8zuY0auuJN7oRcuUcBqphxmaKrwR-va2ps",
  "access_expires_at": "2026-10-30T13:12:22.47935566Z",
  "refresh_token": "Iq_bzIk8YsafPDPZ5p2k7gmoy7Z1a2giiSr8GbAE4ZU",
  "refresh_expires_at": "2026-10-31T00:57:22.477752156Z",
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
  "session_id": "1f92b4a5-3ac0-4729-a5ab-676dc553e744",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU5NDMsImlhdCI6MTc5MzM2NTA0MywianRpIjoiYjQ5OGE0MDgtNGI4OS00OTlmLWEwZDEtNWZmNGYzZTQzMGE4Iiwic2lkIjoiMWY5MmI0YTUtM2FjMC00NzI5LWE1YWItNjc2ZGM1NTNlNzQ0In0.I5r1r4vq3yDmknkGstilzvyIet9N6SzSLuLuiyJfCc0",
  "access_expires_at": "2026-10-30T13:12:23.754008162Z",
  "refresh_token": "NdPqOErVLTkwOBmPvErkUrbbm2kTOTblPKVhRoaAkO8",
  "refresh_expires_at": "2026-10-31T00:57:23.753183185Z",
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
  "device_ref": "sandbox-22965"
}
```

```json
{
  "challenge_id": "2eaf11eb-6c75-494e-953a-aa97165636ec",
  "expires_at": "2026-10-30T13:02:24.182438547Z",
  "resend_available_at": "2026-10-30T12:57:25.182438547Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "784754",
  "sent_at": "2026-10-30T12:57:24.192900996Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2eaf11eb-6c75-494e-953a-aa97165636ec",
  "code": "784754",
  "device_ref": "sandbox-22965"
}
```

```json
{
  "session_id": "6cee9a3d-7e85-4346-b3d8-c6aead5fc025",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTk0NCwiaWF0IjoxNzkzMzY1MDQ0LCJqdGkiOiI1N2UyY2FkZC03NjFhLTQ5MGQtYjVlMi1lYzllZTM1MDczNTMiLCJzaWQiOiI2Y2VlOWEzZC03ZTg1LTQzNDYtYjNkOC1jNmFlYWQ1ZmMwMjUifQ.cFa7dW4sdy_ny1M8Xmen20UInOM7KPX0ATHQY4mt7Vk",
  "access_expires_at": "2026-10-30T13:12:24.431953843Z",
  "refresh_token": "aS_2sUzRGyTo94TG3vbKHnZLS4g2V6GtXNjZxBVRmyk",
  "refresh_expires_at": "2026-11-29T12:57:24.431025079Z",
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
  "command_id": "c952742e-6065-4412-b983-379bfe00e871",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:57:24Z",
    "sequence": 1793365044843
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "736d5e29-3442-47fa-b4cf-1cb659548c54",
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
  "last_heartbeat_at": "2026-10-30T12:57:24.927545Z",
  "last_location_at": "2026-10-30T12:57:24.927545Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639137334",
  "device_ref": "sandbox-16445"
}
```

```json
{
  "challenge_id": "0e34aec3-9138-4550-865e-dfa8c1b20724",
  "expires_at": "2026-10-30T13:02:25.164279615Z",
  "resend_available_at": "2026-10-30T12:57:26.164279615Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639137334` → **200**

```json
{
  "phone": "+380639137334",
  "audience": "CLIENT",
  "code": "065595",
  "sent_at": "2026-10-30T12:57:25.168831096Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e34aec3-9138-4550-865e-dfa8c1b20724",
  "code": "065595",
  "device_ref": "sandbox-16445"
}
```

```json
{
  "session_id": "4d025b85-fae1-4d6b-9b53-f6eed2c5c601",
  "subject": {
    "type": "CLIENT",
    "id": "e2ac9e6c-754e-43d8-83ae-37b9e92a4948"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMmFjOWU2Yy03NTRlLTQzZDgtODNhZS0zN2I5ZTkyYTQ5NDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1OTQ1LCJpYXQiOjE3OTMzNjUwNDUsImp0aSI6ImIwZDYwY2JiLWM1NDMtNDJkZi1hOTI3LWJlMjNhNzM4YTFmMCIsInNpZCI6IjRkMDI1Yjg1LWZhZTEtNGQ2Yi05YjUzLWY2ZWVkMmM1YzYwMSJ9.6T0ZtSSdVO3znvHlqHMe6Lk--ZdK8kmfDuQhLFI9dI8",
  "access_expires_at": "2026-10-30T13:12:25.397686234Z",
  "refresh_token": "ypYK49htpggR00sSTEW44eyJzD2mjSv4t_2u7vQvRak",
  "refresh_expires_at": "2026-11-29T12:57:25.396878598Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "45cc90e1-1357-4a8f-b604-306de288b83f",
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
  "id": "0edc6fd4-df26-4110-a372-c727cd49580a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:02:25.637748Z",
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
  "command_id": "bcd12fd9-e8e1-42d8-8835-b228b0379af7",
  "quote_id": "0edc6fd4-df26-4110-a372-c727cd49580a",
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
  "id": "6a539cdc-c772-49d2-978a-394767688622",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e2ac9e6c-754e-43d8-83ae-37b9e92a4948",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:57:25.902251Z",
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
    "id": "6a45ecf3-faef-4447-9632-04c00085f31f",
    "order_id": "6a539cdc-c772-49d2-978a-394767688622",
    "expires_at": "2026-10-30T12:57:40.909108Z",
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

`POST /api/driver/v1/offers/6a45ecf3-faef-4447-9632-04c00085f31f/accept` → **200**

```json
{
  "command_id": "5596ead7-a8dd-4749-9a7b-eb56c84f2167"
}
```

```json
{
  "id": "7c430da1-f1fb-4f81-ad66-3c3c9ad3681c",
  "order_id": "6a539cdc-c772-49d2-978a-394767688622",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ca8ef86d-8804-4877-b1e7-ef55911e77ae",
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
  "command_id": "14e31cd5-b139-4573-b8c4-ef678c8f99cd",
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
  "changed_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T12:57:26.79042731Z"
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
  "id": "ca8ef86d-8804-4877-b1e7-ef55911e77ae",
  "order_id": "6a539cdc-c772-49d2-978a-394767688622",
  "assignment_id": "7c430da1-f1fb-4f81-ad66-3c3c9ad3681c",
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

`POST /api/driver/v1/work-sessions/736d5e29-3442-47fa-b4cf-1cb659548c54/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:57:27Z",
    "sequence": 1793365047418
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "736d5e29-3442-47fa-b4cf-1cb659548c54",
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
  "last_heartbeat_at": "2026-10-30T12:57:27.438783Z",
  "last_location_at": "2026-10-30T12:57:27.438783Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/ca8ef86d-8804-4877-b1e7-ef55911e77ae/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "7b72757b-a93a-4c7c-b0ce-c05ddc8ad1bb",
  "expected_version": 0
}
```

```json
{
  "id": "ca8ef86d-8804-4877-b1e7-ef55911e77ae",
  "order_id": "6a539cdc-c772-49d2-978a-394767688622",
  "assignment_id": "7c430da1-f1fb-4f81-ad66-3c3c9ad3681c",
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
  "arrived_at": "2026-10-30T12:57:27.655316Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ca8ef86d-8804-4877-b1e7-ef55911e77ae/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "a5eab9a7-f3a7-4c13-a5e6-b2c63c8a3583",
  "expected_version": 1
}
```

```json
{
  "id": "ca8ef86d-8804-4877-b1e7-ef55911e77ae",
  "order_id": "6a539cdc-c772-49d2-978a-394767688622",
  "assignment_id": "7c430da1-f1fb-4f81-ad66-3c3c9ad3681c",
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
  "arrived_at": "2026-10-30T12:57:27.655316Z",
  "started_at": "2026-10-30T12:57:27.887517Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ca8ef86d-8804-4877-b1e7-ef55911e77ae/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "ac3f470c-b8ec-410d-a27c-0f02e8ad9c6b",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:57:28Z",
  "cash_received": true
}
```

```json
{
  "id": "ca8ef86d-8804-4877-b1e7-ef55911e77ae",
  "order_id": "6a539cdc-c772-49d2-978a-394767688622",
  "assignment_id": "7c430da1-f1fb-4f81-ad66-3c3c9ad3681c",
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
  "arrived_at": "2026-10-30T12:57:27.655316Z",
  "started_at": "2026-10-30T12:57:27.887517Z",
  "completed_at": "2026-10-30T12:57:28.118293Z",
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
  "session_id": "736d5e29-3442-47fa-b4cf-1cb659548c54",
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
  "last_heartbeat_at": "2026-10-30T12:57:27.438783Z",
  "last_location_at": "2026-10-30T12:57:27.438783Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/736d5e29-3442-47fa-b4cf-1cb659548c54/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "8f43059e-4703-4192-a84b-48cb503f2243",
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
  "command_id": "17aaf65a-0448-4222-bd43-365869e0025b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:57:28Z",
    "sequence": 1793365048754
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
  "correlation_id": "75a8cd7e-1dd0-4a6a-879e-285bc7bce0a6",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "8bbd9868-8ed1-4879-9a60-f6d8c8b8a5dc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:57:28Z",
    "sequence": 1793365048963
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8c7f0ac-a71b-452e-9a36-c096f94dfccb",
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
  "last_heartbeat_at": "2026-10-30T12:57:28.982473Z",
  "last_location_at": "2026-10-30T12:57:28.982473Z",
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
  "changed_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T12:57:26.790427Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "88671732-9dc2-4bdb-b778-a5ef3b36a3e7",
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
  "changed_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T12:57:29.389149152Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8c7f0ac-a71b-452e-9a36-c096f94dfccb",
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
  "last_heartbeat_at": "2026-10-30T12:57:28.982473Z",
  "last_location_at": "2026-10-30T12:57:28.982473Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d8c7f0ac-a71b-452e-9a36-c096f94dfccb/close` → **200**

```json
{
  "command_id": "eaad2b55-6473-4754-8741-9443062769de",
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
  "session_id": "52938303-e3a6-4836-84ab-9615f369bd88",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU5NTAsImlhdCI6MTc5MzM2NTA1MCwianRpIjoiZGViMjdiODUtYTY1NC00NmVmLWJhNzAtN2Y2ZWU3NjQyYTEzIiwic2lkIjoiNTI5MzgzMDMtZTNhNi00ODM2LTg0YWItOTYxNWYzNjliZDg4In0.IJhlhFSKxEy1vp7jbBWYLU8_HSXO7t9i3tCNUUz0K5g",
  "access_expires_at": "2026-10-30T13:12:30.222223384Z",
  "refresh_token": "eO2ifHqS1B0PWnA9a2PNzNJi2jj8tn5bDcb9bHVn3qU",
  "refresh_expires_at": "2026-10-31T00:57:30.221662426Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "587516ff-79ac-4b36-98c2-f7765252aff7",
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
  "id": "2d1b69d9-0716-4967-942a-03adf275b694",
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
  "created_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "created_at": "2026-10-30T12:57:30.476649Z",
  "updated_at": "2026-10-30T12:57:30.476649Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630082939",
  "device_ref": "sandbox-16166"
}
```

```json
{
  "challenge_id": "17ef41c8-e9ce-4bff-8b15-004913509c8f",
  "expires_at": "2026-10-30T13:02:30.696513488Z",
  "resend_available_at": "2026-10-30T12:57:31.696513488Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630082939` → **200**

```json
{
  "phone": "+380630082939",
  "audience": "CLIENT",
  "code": "310557",
  "sent_at": "2026-10-30T12:57:30.70125062Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "17ef41c8-e9ce-4bff-8b15-004913509c8f",
  "code": "310557",
  "device_ref": "sandbox-16166"
}
```

```json
{
  "session_id": "42fe8d4c-f7e2-44ba-b45c-fcb1f2903d53",
  "subject": {
    "type": "CLIENT",
    "id": "f84659cd-ba2d-40b2-b95f-9d9b00875cde"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODQ2NTljZC1iYTJkLTQwYjItYjk1Zi05ZDliMDA4NzVjZGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY1OTUwLCJpYXQiOjE3OTMzNjUwNTAsImp0aSI6ImRiZGY1OTBkLWU3Y2EtNGExNC1iNjA2LTRmMjVkZjcyZTlhMyIsInNpZCI6IjQyZmU4ZDRjLWY3ZTItNDRiYS1iNDVjLWZjYjFmMjkwM2Q1MyJ9.Up_EhqTIfjUOsSKXSmm7MiXR6ViuAquPLBotdudwk1I",
  "access_expires_at": "2026-10-30T13:12:30.974761152Z",
  "refresh_token": "LmKZhUf4pFvrpi2qXBJxZGJkP38gtyUDOb6g7UZ5J6o",
  "refresh_expires_at": "2026-11-29T12:57:30.974123813Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630082939` → **200**

```json
{
  "client_id": "f84659cd-ba2d-40b2-b95f-9d9b00875cde"
}
```

`POST /api/admin/v1/rider-wallets/f84659cd-ba2d-40b2-b95f-9d9b00875cde/top-ups` → **201**

```json
{
  "command_id": "ff12c845-3fb5-41c0-88df-d8953cebac4c",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "f84659cd-ba2d-40b2-b95f-9d9b00875cde",
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
      "id": "3cffac51-107c-45d2-bb91-77fc78f37074",
      "at": "2026-10-30T12:57:31.372799Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "87983110-3c7f-42d1-8f17-34a004597065",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ca56a181-323b-4a88-b477-1b74ea01e968",
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
  "id": "c4a0409c-b85f-4491-93db-1b96f905798d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:02:31.594492Z",
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
      "id": "2d1b69d9-0716-4967-942a-03adf275b694",
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
  "device_ref": "sandbox-10842"
}
```

```json
{
  "challenge_id": "4e10f400-04dc-4ab1-8843-41c0fea8e88c",
  "expires_at": "2026-10-30T13:02:31.804588218Z",
  "resend_available_at": "2026-10-30T12:57:32.804588218Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "568605",
  "sent_at": "2026-10-30T12:57:31.808058244Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4e10f400-04dc-4ab1-8843-41c0fea8e88c",
  "code": "568605",
  "device_ref": "sandbox-10842"
}
```

```json
{
  "session_id": "d5969f3e-fe17-4d67-a08f-53ab3caa5696",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTk1MiwiaWF0IjoxNzkzMzY1MDUyLCJqdGkiOiJkNDFlYWFiNi1iMTk4LTQ0NWUtOWEwYy1jYjkxZWFmNmJhY2MiLCJzaWQiOiJkNTk2OWYzZS1mZTE3LTRkNjctYTA4Zi01M2FiM2NhYTU2OTYifQ.NyqXVXjU7w_8ntrUXVecz_3SyhoQ3E4wAR3NmYV9nZY",
  "access_expires_at": "2026-10-30T13:12:32.026726528Z",
  "refresh_token": "b8LgbfzuLZJPsYG9e63irTw7muXY-8eXWWDxXmTk1zE",
  "refresh_expires_at": "2026-11-29T12:57:32.026137278Z",
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
  "command_id": "31741c0f-73c4-4f61-9ace-39b1e6418681",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:57:32Z",
    "sequence": 1793365052418
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d1a2cf96-1c82-4304-8733-1c80a28200c1",
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
  "last_heartbeat_at": "2026-10-30T12:57:32.437796Z",
  "last_location_at": "2026-10-30T12:57:32.437796Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c8328b21-3d42-40da-bc60-5bde24c61d69",
  "quote_id": "c4a0409c-b85f-4491-93db-1b96f905798d",
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
  "id": "5262f7bb-0b11-46ff-abbc-46b89dea4605",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f84659cd-ba2d-40b2-b95f-9d9b00875cde",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:57:32.64561Z",
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
  "client_id": "f84659cd-ba2d-40b2-b95f-9d9b00875cde",
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
      "id": "3cffac51-107c-45d2-bb91-77fc78f37074",
      "at": "2026-10-30T12:57:31.372799Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "87983110-3c7f-42d1-8f17-34a004597065",
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
    "id": "6b29e347-cdd8-43a1-9721-67a9d75ca7fa",
    "order_id": "5262f7bb-0b11-46ff-abbc-46b89dea4605",
    "expires_at": "2026-10-30T12:57:47.651271Z",
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

`POST /api/driver/v1/offers/6b29e347-cdd8-43a1-9721-67a9d75ca7fa/accept` → **200**

```json
{
  "command_id": "35ad1fd7-095e-48d9-a9ac-07e89c96a1a2"
}
```

```json
{
  "id": "ab6aede2-40ca-4148-9f0e-5ebeefa6168c",
  "order_id": "5262f7bb-0b11-46ff-abbc-46b89dea4605",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9e0a9d10-7b5b-4e98-a7ab-e82930cf7687",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9e0a9d10-7b5b-4e98-a7ab-e82930cf7687",
  "order_id": "5262f7bb-0b11-46ff-abbc-46b89dea4605",
  "assignment_id": "ab6aede2-40ca-4148-9f0e-5ebeefa6168c",
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

`POST /api/driver/v1/work-sessions/d1a2cf96-1c82-4304-8733-1c80a28200c1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:57:36Z",
    "sequence": 1793365056653
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d1a2cf96-1c82-4304-8733-1c80a28200c1",
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
  "last_heartbeat_at": "2026-10-30T12:57:36.670182Z",
  "last_location_at": "2026-10-30T12:57:36.670182Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/9e0a9d10-7b5b-4e98-a7ab-e82930cf7687/arrive` → **200**

```json
{
  "command_id": "c6df9b1e-f011-4a10-9f87-386772266304",
  "expected_version": 0
}
```

```json
{
  "id": "9e0a9d10-7b5b-4e98-a7ab-e82930cf7687",
  "order_id": "5262f7bb-0b11-46ff-abbc-46b89dea4605",
  "assignment_id": "ab6aede2-40ca-4148-9f0e-5ebeefa6168c",
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
  "arrived_at": "2026-10-30T12:57:36.87527Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9e0a9d10-7b5b-4e98-a7ab-e82930cf7687/start` → **200**

```json
{
  "command_id": "ca0a6b2b-4bb2-4024-88c9-d9422c474938",
  "expected_version": 1
}
```

```json
{
  "id": "9e0a9d10-7b5b-4e98-a7ab-e82930cf7687",
  "order_id": "5262f7bb-0b11-46ff-abbc-46b89dea4605",
  "assignment_id": "ab6aede2-40ca-4148-9f0e-5ebeefa6168c",
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
  "arrived_at": "2026-10-30T12:57:36.87527Z",
  "started_at": "2026-10-30T12:57:37.080211Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/9e0a9d10-7b5b-4e98-a7ab-e82930cf7687/complete` → **200**

```json
{
  "command_id": "42b93ce6-6369-4952-b465-90b5793e8f04",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:57:37Z",
  "cash_received": true
}
```

```json
{
  "id": "9e0a9d10-7b5b-4e98-a7ab-e82930cf7687",
  "order_id": "5262f7bb-0b11-46ff-abbc-46b89dea4605",
  "assignment_id": "ab6aede2-40ca-4148-9f0e-5ebeefa6168c",
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
  "arrived_at": "2026-10-30T12:57:36.87527Z",
  "started_at": "2026-10-30T12:57:37.080211Z",
  "completed_at": "2026-10-30T12:57:37.303215Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "f84659cd-ba2d-40b2-b95f-9d9b00875cde",
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
      "id": "f5ddbd3c-31ea-45ce-a4f2-0d672f4e8784",
      "at": "2026-10-30T12:57:37.797358Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "5262f7bb-0b11-46ff-abbc-46b89dea4605"
    },
    {
      "id": "3cffac51-107c-45d2-bb91-77fc78f37074",
      "at": "2026-10-30T12:57:31.372799Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "87983110-3c7f-42d1-8f17-34a004597065",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/2d1b69d9-0716-4967-942a-03adf275b694/archive` → **200**

```json
{
  "command_id": "52accc1d-eed8-4bb8-8413-93600842878c",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "2d1b69d9-0716-4967-942a-03adf275b694",
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
  "created_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "created_at": "2026-10-30T12:57:30.476649Z",
  "updated_at": "2026-10-30T12:57:40.71332Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d1a2cf96-1c82-4304-8733-1c80a28200c1",
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
  "last_heartbeat_at": "2026-10-30T12:57:36.670182Z",
  "last_location_at": "2026-10-30T12:57:36.670182Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d1a2cf96-1c82-4304-8733-1c80a28200c1/close` → **200**

```json
{
  "command_id": "3ce38a3d-2f4f-4c9d-9bb6-e4ed962f0618",
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

Done: order 5262f7bb-0b11-46ff-abbc-46b89dea4605.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-13957"
}
```

```json
{
  "challenge_id": "c267195c-e0f6-4f08-9a04-7916f28d7e43",
  "expires_at": "2026-10-30T13:02:41.345000563Z",
  "resend_available_at": "2026-10-30T12:57:42.345000563Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "687618",
  "sent_at": "2026-10-30T12:57:41.353337728Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c267195c-e0f6-4f08-9a04-7916f28d7e43",
  "code": "687618",
  "device_ref": "sandbox-13957"
}
```

```json
{
  "session_id": "6e52c2b7-4e17-4d89-9db9-8c7c34329f79",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTk2MSwiaWF0IjoxNzkzMzY1MDYxLCJqdGkiOiJjOGRiNjdhZi1mNjAxLTQxMTMtODA0ZC00N2ZkNDdiZWUwOGYiLCJzaWQiOiI2ZTUyYzJiNy00ZTE3LTRkODktOWRiOS04YzdjMzQzMjlmNzkifQ.9kJwSFb-R3z848Bqlhd_CfU2eU_B1fs9a89DCrk8t40",
  "access_expires_at": "2026-10-30T13:12:41.566564004Z",
  "refresh_token": "ZC67iHMhR_tptZJ_zjOayMjYtJo9GOQbgWstSut3c14",
  "refresh_expires_at": "2026-11-29T12:57:41.56595885Z",
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
  "command_id": "5076d51a-d81e-4c98-aa08-58ccdd3b5afd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:57:42Z",
    "sequence": 1793365062185
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "aeb34fcb-68c5-4cd0-bbe8-b67e8e8dbcc9",
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
  "last_heartbeat_at": "2026-10-30T12:57:42.202528Z",
  "last_location_at": "2026-10-30T12:57:42.202528Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/aeb34fcb-68c5-4cd0-bbe8-b67e8e8dbcc9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:57:47Z",
    "sequence": 1793365067397
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "aeb34fcb-68c5-4cd0-bbe8-b67e8e8dbcc9",
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
  "last_heartbeat_at": "2026-10-30T12:57:47.415489Z",
  "last_location_at": "2026-10-30T12:57:42.202528Z",
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
  "session_id": "02a0a1ac-4fea-4b18-86d9-26d9022d424b",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjU5NjcsImlhdCI6MTc5MzM2NTA2NywianRpIjoiYTJlOTcxOGEtYTlmMy00MjQxLTkyMGMtZGE2NDJjNjFiYmRiIiwic2lkIjoiMDJhMGExYWMtNGZlYS00YjE4LTg2ZDktMjZkOTAyMmQ0MjRiIn0.uBbVdIXR2co2VUqO_AiUkzPO8KMzxzDsf4IHKryVaUU",
  "access_expires_at": "2026-10-30T13:12:47.827697726Z",
  "refresh_token": "uQwjcHWmIbO6hjgMbkQWc6XQjyUfxM9d7Ce5mTTzVp4",
  "refresh_expires_at": "2026-10-31T00:57:47.827209148Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T12:57:48.018504939Z",
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
      "last_location_at": "2026-10-30T12:57:42.202528Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/aeb34fcb-68c5-4cd0-bbe8-b67e8e8dbcc9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:57:48Z",
    "sequence": 1793365068221
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "aeb34fcb-68c5-4cd0-bbe8-b67e8e8dbcc9",
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
  "last_heartbeat_at": "2026-10-30T12:57:48.238355Z",
  "last_location_at": "2026-10-30T12:57:48.238355Z",
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
  "session_id": "aeb34fcb-68c5-4cd0-bbe8-b67e8e8dbcc9",
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
  "last_heartbeat_at": "2026-10-30T12:57:48.238355Z",
  "last_location_at": "2026-10-30T12:57:48.238355Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aeb34fcb-68c5-4cd0-bbe8-b67e8e8dbcc9/close` → **200**

```json
{
  "command_id": "5622bb5c-920e-4bab-bfee-e87b35f7660b",
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
  "device_ref": "sandbox-9144"
}
```

```json
{
  "challenge_id": "b46a321f-6ac7-421f-bb7e-c85c432e5ea7",
  "expires_at": "2026-10-30T13:02:48.825442686Z",
  "resend_available_at": "2026-10-30T12:57:49.825442686Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "126769",
  "sent_at": "2026-10-30T12:57:48.828880683Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b46a321f-6ac7-421f-bb7e-c85c432e5ea7",
  "code": "126769",
  "device_ref": "sandbox-9144"
}
```

```json
{
  "session_id": "1699ce5b-731e-4977-ae55-ceb054e7c907",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTk2OSwiaWF0IjoxNzkzMzY1MDY5LCJqdGkiOiJiZWFhMGY1Zi0zMGI3LTQ2MmMtODJkZi1jYjEyOTE3YmE0MDgiLCJzaWQiOiIxNjk5Y2U1Yi03MzFlLTQ5NzctYWU1NS1jZWIwNTRlN2M5MDcifQ.1BX3-UQbpUhJ6kym4uz7IzClHiGcgYSeQBWcRcM0mAI",
  "access_expires_at": "2026-10-30T13:12:49.04084638Z",
  "refresh_token": "uEa0QbxkvqitkLsSg2ryM3hDwwmtn47XIAPurLW3jx0",
  "refresh_expires_at": "2026-11-29T12:57:49.040238952Z",
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
  "device_ref": "sandbox-11552"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "056d592d-c4b1-471b-b289-95723dc4ea3e",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-11552"
}
```

```json
{
  "challenge_id": "dbffe7cf-67b2-4281-8978-29e2ee20bd8e",
  "expires_at": "2026-10-30T13:02:50.617009566Z",
  "resend_available_at": "2026-10-30T12:57:51.617009566Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "192351",
  "sent_at": "2026-10-30T12:57:50.619626052Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dbffe7cf-67b2-4281-8978-29e2ee20bd8e",
  "code": "192351",
  "device_ref": "sandbox-11552"
}
```

```json
{
  "session_id": "5333c444-5100-44bc-b5d3-732be84f2ac4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTk3MCwiaWF0IjoxNzkzMzY1MDcwLCJqdGkiOiI5NTE2ZjM2YS1iNzc4LTRiM2YtODY2Ny1jYjQwMDUzYTE4MmMiLCJzaWQiOiI1MzMzYzQ0NC01MTAwLTQ0YmMtYjVkMy03MzJiZTg0ZjJhYzQifQ.3s_Rn8ZtSryY4V6xnbXWK7E0B55Ck_zsL9-gxfotDUk",
  "access_expires_at": "2026-10-30T13:12:50.825020996Z",
  "refresh_token": "dAKb5Kfvrrubicp5kMmc_9gw4zks_ku98ASS2XrWUGA",
  "refresh_expires_at": "2026-11-29T12:57:50.824508653Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-15730"
}
```

```json
{
  "challenge_id": "98e62e50-3628-4ca0-b1dc-12fd81790fb3",
  "expires_at": "2026-10-30T13:02:51.028731957Z",
  "resend_available_at": "2026-10-30T12:57:52.028731957Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "549325",
  "sent_at": "2026-10-30T12:57:51.031385827Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98e62e50-3628-4ca0-b1dc-12fd81790fb3",
  "code": "549325",
  "device_ref": "sandbox-15730"
}
```

```json
{
  "session_id": "37553098-a080-45fb-b990-0b2e91db7467",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NTk3MSwiaWF0IjoxNzkzMzY1MDcxLCJqdGkiOiI3ZTgwMmQ1YS1lNGVmLTRlMTktODQ4OS1mYzQ0ZGE1NmE3Y2QiLCJzaWQiOiIzNzU1MzA5OC1hMDgwLTQ1ZmItYjk5MC0wYjJlOTFkYjc0NjcifQ.bCJVGX1WcXx4NB82jzGwl2XF9NNoM4e4-f1wkbMoZnw",
  "access_expires_at": "2026-10-30T13:12:51.240141318Z",
  "refresh_token": "ynUoMTyeQItv0a4MUbn2EMN9gWba32CK4GyKcXlh8t8",
  "refresh_expires_at": "2026-11-29T12:57:51.239598071Z",
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
  "command_id": "2f13ecfb-3661-4719-9825-460681ef62b4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:00:56Z",
    "sequence": 1793365256809
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "df2f576d-ee60-4f5a-90bb-ef261972d807",
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
  "last_heartbeat_at": "2026-10-30T13:00:56.826651Z",
  "last_location_at": "2026-10-30T13:00:56.826651Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600479515",
  "device_ref": "sandbox-14301"
}
```

```json
{
  "challenge_id": "4baeecc7-1213-41bc-93d3-ee8c385d8b75",
  "expires_at": "2026-10-30T13:05:57.020577637Z",
  "resend_available_at": "2026-10-30T13:00:58.020577637Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600479515` → **200**

```json
{
  "phone": "+48600479515",
  "audience": "CLIENT",
  "code": "159453",
  "sent_at": "2026-10-30T13:00:57.023297498Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4baeecc7-1213-41bc-93d3-ee8c385d8b75",
  "code": "159453",
  "device_ref": "sandbox-14301"
}
```

```json
{
  "session_id": "afe7d621-36b2-4243-be51-2f2cd92e1b12",
  "subject": {
    "type": "CLIENT",
    "id": "603c8367-44a9-42cc-a00f-38434e3ddd30"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDNjODM2Ny00NGE5LTQyY2MtYTAwZi0zODQzNGUzZGRkMzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MTU3LCJpYXQiOjE3OTMzNjUyNTcsImp0aSI6IjE1MzBjZGNlLTg3NDAtNDZmZS05MjI0LTY1YzEwNjAyMzQ3YiIsInNpZCI6ImFmZTdkNjIxLTM2YjItNDI0My1iZTUxLTJmMmNkOTJlMWIxMiJ9.Tk4YH6g7FAL-BDZVd-1b_yTvp1vtOdUyx-41ssSliGY",
  "access_expires_at": "2026-10-30T13:15:57.23310121Z",
  "refresh_token": "abGnss926sHrg8xsnt_fe1OQaMdQO-Z0Ao_A1mmJZXM",
  "refresh_expires_at": "2026-11-29T13:00:57.232638327Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b928b56b-82e4-4867-9a5d-afd475c0f6c6",
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
  "id": "5d66e528-e073-4f4a-8aae-8a471cacdc61",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:05:57.451008Z",
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
  "command_id": "9a157b19-dd59-400a-9f3b-5650e7627f15",
  "quote_id": "5d66e528-e073-4f4a-8aae-8a471cacdc61",
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
  "id": "b310c310-37ec-4762-be59-97f66440c1d2",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "603c8367-44a9-42cc-a00f-38434e3ddd30",
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
  "created_at": "2026-10-30T13:00:57.709098Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b310c310-37ec-4762-be59-97f66440c1d2` → **200**

```json
{
  "id": "b310c310-37ec-4762-be59-97f66440c1d2",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "603c8367-44a9-42cc-a00f-38434e3ddd30",
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
  "created_at": "2026-10-30T13:00:57.709098Z",
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

`POST /api/driver/v1/orders/b310c310-37ec-4762-be59-97f66440c1d2/claim` → **422**

```json
{
  "command_id": "ef3e509a-672e-4dca-9f57-59d3937d84ee"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b310c310-37ec-4762-be59-97f66440c1d2/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "fee306e1-8c8b-44f1-8219-1283e72b1ba1"
}
```

`GET /api/rider/v1/orders/b310c310-37ec-4762-be59-97f66440c1d2` → **200**

```json
{
  "id": "b310c310-37ec-4762-be59-97f66440c1d2",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "603c8367-44a9-42cc-a00f-38434e3ddd30",
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
  "created_at": "2026-10-30T13:00:57.709098Z",
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

`POST /api/driver/v1/orders/c8175c80-eb48-4a67-95ec-272bb3d0974e/claim` → **404**

```json
{
  "command_id": "f1a1b4c4-2a16-406e-99f2-a591538fbdb9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c8175c80-eb48-4a67-95ec-272bb3d0974e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "608b5ce5-c0f9-4491-8e39-b0fdea41f2a7"
}
```

`POST /api/driver/v1/orders/da4cb4d0-5a7f-46b1-93b6-c89024064ea7/claim` → **404**

```json
{
  "command_id": "f1337645-56a9-4275-b958-85af06dca47e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/da4cb4d0-5a7f-46b1-93b6-c89024064ea7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6673a087-1569-4aab-9a3e-0202caf030f6"
}
```

`POST /api/driver/v1/orders/6f62b2eb-28c4-4402-86d6-8dbdc57e171a/claim` → **404**

```json
{
  "command_id": "22d0c843-bad4-4367-8eb8-e3097537fa5a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6f62b2eb-28c4-4402-86d6-8dbdc57e171a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cac7de0f-3330-4f8c-a1c0-ae0529659970"
}
```

`POST /api/driver/v1/orders/2c9108aa-a190-4efa-82a8-1e84f8975f5e/claim` → **404**

```json
{
  "command_id": "4431bd6c-cef9-4cc4-8e53-54becbf155e9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2c9108aa-a190-4efa-82a8-1e84f8975f5e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "718adaeb-d280-4592-93de-0f10debd6788"
}
```

`POST /api/driver/v1/orders/3203da85-6ccb-4395-9f94-23be0785f123/claim` → **404**

```json
{
  "command_id": "14fa9bb2-9f9a-40d6-b2a4-f4334d7c2ec2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3203da85-6ccb-4395-9f94-23be0785f123/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ea7524a3-2310-4da5-9fce-8a17c6a2a5f3"
}
```

`POST /api/driver/v1/orders/fbd8a40f-d559-4d67-99cc-4e335e26ecd6/claim` → **404**

```json
{
  "command_id": "ef181847-cb7f-445f-81a3-fc1f03f741a3"
}
```

```json
{
  "instance": "/api/driver/v1/orders/fbd8a40f-d559-4d67-99cc-4e335e26ecd6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "01bbc810-c274-43a0-a416-a957989a1845"
}
```

`POST /api/driver/v1/orders/c510e70b-8f1c-4b4f-9e67-a2dd4356ee63/claim` → **404**

```json
{
  "command_id": "ff49e66c-1d8f-4e04-8faf-3f6499361c36"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c510e70b-8f1c-4b4f-9e67-a2dd4356ee63/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "21ad63d0-90b5-4cdb-b69b-7cdc156e3433"
}
```

`POST /api/driver/v1/orders/e7a4caf9-0265-4a59-b1d5-c843c6a966bf/claim` → **404**

```json
{
  "command_id": "d9d75a4c-0bd6-4d25-a90d-c078aaa3a72b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e7a4caf9-0265-4a59-b1d5-c843c6a966bf/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e3b7b1ee-cd0d-4b25-b765-e4146623c0fa"
}
```

`POST /api/driver/v1/orders/ac89e234-4bae-48cd-9534-e50451dc6c2c/claim` → **404**

```json
{
  "command_id": "ab643794-a34b-4380-a861-35bf95e65b78"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ac89e234-4bae-48cd-9534-e50451dc6c2c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a8795ead-a865-4698-ab11-1ebd0e813db6"
}
```

`POST /api/driver/v1/orders/3f41e5e3-aafd-45f2-9930-6e303e24a0c0/claim` → **404**

```json
{
  "command_id": "987e246a-128c-4e6c-972d-fd3d791636be"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3f41e5e3-aafd-45f2-9930-6e303e24a0c0/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "05837aae-9f96-409f-89fc-338d7ed31afc"
}
```

`POST /api/driver/v1/orders/018ed908-44c2-4f1a-9edb-3055bd1cbd25/claim` → **404**

```json
{
  "command_id": "4942cad3-a109-4918-919b-16dfefb15f6c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/018ed908-44c2-4f1a-9edb-3055bd1cbd25/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "373ef8e9-88e4-4e29-b9c1-6c4594a9c85c"
}
```

`POST /api/driver/v1/orders/4075b298-deea-4dbe-bfe4-fc708cf0a523/claim` → **404**

```json
{
  "command_id": "d263f275-ef54-4b36-b02b-6131706355b7"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4075b298-deea-4dbe-bfe4-fc708cf0a523/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3e860801-8034-41d9-8a1c-f94061c52a89"
}
```

`POST /api/driver/v1/orders/bb7da2ab-0452-4f67-89c7-2a12c3245fc9/claim` → **404**

```json
{
  "command_id": "d7a6deda-2cf0-4e5f-b5fc-19d1a19bbb6b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/bb7da2ab-0452-4f67-89c7-2a12c3245fc9/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3276536d-6adf-4610-a733-566430777069"
}
```

`POST /api/driver/v1/orders/09cd1639-7787-4e48-bba0-d80226c75491/claim` → **404**

```json
{
  "command_id": "b987373a-79d8-4715-848a-a9a6df0018c5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/09cd1639-7787-4e48-bba0-d80226c75491/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c135eacf-64c4-4ec9-b8af-261c8fe46352"
}
```

`POST /api/driver/v1/orders/03bc9430-0589-4e93-8f1a-e7ceba10fd0c/claim` → **404**

```json
{
  "command_id": "2442cece-0cde-4c96-9c78-fa8ecce5b074"
}
```

```json
{
  "instance": "/api/driver/v1/orders/03bc9430-0589-4e93-8f1a-e7ceba10fd0c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "be3d94fb-b6ea-435d-b0ba-1edbd3371b8d"
}
```

`POST /api/driver/v1/orders/8fde3404-aeb3-4283-a978-7c36b69c56d0/claim` → **404**

```json
{
  "command_id": "b393296f-693a-4118-9018-43d3f5a2e18e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8fde3404-aeb3-4283-a978-7c36b69c56d0/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "07d9f285-cadb-463e-bc90-0015232b62c5"
}
```

`POST /api/driver/v1/orders/8e4d6090-b0e2-445e-ac42-68565f9b1a45/claim` → **404**

```json
{
  "command_id": "37a9e165-332b-4ed9-867e-d369c71b68a4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8e4d6090-b0e2-445e-ac42-68565f9b1a45/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8219876c-074b-47f7-b412-d3762952604d"
}
```

`POST /api/driver/v1/orders/c4e82cb3-235a-427d-b6cc-85c7eb2bb781/claim` → **404**

```json
{
  "command_id": "f9508132-2c0b-46fd-a3fc-8575183b4f25"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c4e82cb3-235a-427d-b6cc-85c7eb2bb781/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "42bbf821-2121-4737-87fe-d7095bb8b922"
}
```

`POST /api/driver/v1/orders/7005d280-6fef-40a7-bf7d-b21b489f337b/claim` → **404**

```json
{
  "command_id": "7ae940a5-2d7f-4efb-a3ea-34dcfde237dd"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7005d280-6fef-40a7-bf7d-b21b489f337b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "846ae708-9531-48e0-9383-6a7908623f91"
}
```

`POST /api/driver/v1/orders/54fe9a18-d336-4914-bfd4-8e6cbc2f51fd/claim` → **404**

```json
{
  "command_id": "3beefc04-2885-470f-b7ca-6a48b4a710bd"
}
```

```json
{
  "instance": "/api/driver/v1/orders/54fe9a18-d336-4914-bfd4-8e6cbc2f51fd/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c05a05be-ca2b-4edd-ae19-0d7c31d04960"
}
```

`POST /api/driver/v1/orders/6583d8cc-a063-4441-b481-baa473fe9a80/claim` → **404**

```json
{
  "command_id": "a24e40fc-70aa-4aaa-b321-1e72de7d2fdd"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6583d8cc-a063-4441-b481-baa473fe9a80/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "013be0e0-6ad2-450e-9741-fb036b7f3237"
}
```

`POST /api/driver/v1/orders/186e2f22-5b99-4de4-b533-e5e288b1735e/claim` → **404**

```json
{
  "command_id": "cb4ec28e-85ce-4d6d-a151-31de2e520121"
}
```

```json
{
  "instance": "/api/driver/v1/orders/186e2f22-5b99-4de4-b533-e5e288b1735e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "63b19a9f-71d5-4559-b8eb-6ebed09d513e"
}
```

`POST /api/driver/v1/orders/8911bd14-adf4-4e2a-a918-14bffebe480e/claim` → **404**

```json
{
  "command_id": "8707abe1-a818-441f-a62a-56d578c1a9ae"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8911bd14-adf4-4e2a-a918-14bffebe480e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "026bac56-2ca7-4f9f-82ad-aa8cc28b89d5"
}
```

`POST /api/driver/v1/orders/6338588c-3ef6-4ec6-bee2-98a0e83feb9b/claim` → **404**

```json
{
  "command_id": "a8ae65f6-f69e-46fe-ab9c-af25041c9985"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6338588c-3ef6-4ec6-bee2-98a0e83feb9b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fe37bf8e-7b8d-48a7-90a3-b2f41062adf7"
}
```

`POST /api/driver/v1/orders/f4e1a69d-d3d9-434b-840d-1f1a553aa801/claim` → **404**

```json
{
  "command_id": "f8cbc64a-637b-4550-88c6-6a3a66dc7693"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f4e1a69d-d3d9-434b-840d-1f1a553aa801/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8f898a7f-4081-44eb-ba60-3731064a4f2e"
}
```

`POST /api/driver/v1/orders/e490a456-77d8-42b4-bba8-87294ffbdfe8/claim` → **404**

```json
{
  "command_id": "5a68f5c7-c67c-49b8-9db4-2196672e1afb"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e490a456-77d8-42b4-bba8-87294ffbdfe8/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3e67791b-7f98-490c-8570-fc6c9a8f00a9"
}
```

`POST /api/driver/v1/orders/31ab5880-bffe-41ac-a489-8c29b00a014c/claim` → **404**

```json
{
  "command_id": "b3eb2096-ada4-40d5-a59a-88b0c05dc657"
}
```

```json
{
  "instance": "/api/driver/v1/orders/31ab5880-bffe-41ac-a489-8c29b00a014c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "72e52da2-c576-4d02-9d45-05092fdf77b7"
}
```

`POST /api/driver/v1/orders/c64478c6-fde4-4f33-96ef-74945bf2b019/claim` → **404**

```json
{
  "command_id": "513de6b2-a4c4-4018-9b21-5774c0bb9579"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c64478c6-fde4-4f33-96ef-74945bf2b019/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "37f1fae1-5cea-435d-b41a-f271035e5baf"
}
```

`POST /api/driver/v1/orders/f75c98ab-78b8-4f57-b8e2-1e695816d571/claim` → **404**

```json
{
  "command_id": "deb91956-361e-4527-af38-dddee0498c83"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f75c98ab-78b8-4f57-b8e2-1e695816d571/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d4f182e2-fbff-4f17-92ff-4d2ce34a2e41"
}
```

`POST /api/driver/v1/orders/a14f32d0-24fc-4662-96fa-4c37fd1fac0e/claim` → **429**

```json
{
  "command_id": "ef02dbba-cba1-449b-b779-f79c06b6a5ef"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a14f32d0-24fc-4662-96fa-4c37fd1fac0e/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "317face6-5bff-4e49-9d7d-411a9d0aeccc",
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
  "command_id": "4ca4f66a-b842-4089-9da0-309d08d3f4c9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:01:04Z",
    "sequence": 1793365264783
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "a8c2cc24-da88-4dd7-816c-d2e84b5fbc19",
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
  "last_heartbeat_at": "2026-10-30T13:01:04.800563Z",
  "last_location_at": "2026-10-30T13:01:04.800563Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "b310c310-37ec-4762-be59-97f66440c1d2",
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

`POST /api/driver/v1/orders/b310c310-37ec-4762-be59-97f66440c1d2/claim` → **409**

```json
{
  "command_id": "2ea22364-2dcc-42c2-af98-b1fec2a0c34d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b310c310-37ec-4762-be59-97f66440c1d2/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b60bbddd-a1b9-4d6b-ba01-e7191091c07e"
}
```

`POST /api/driver/v1/orders/b310c310-37ec-4762-be59-97f66440c1d2/claim` → **200**

```json
{
  "command_id": "17ad95de-d05a-4f4d-b89d-79e92c9fab88"
}
```

```json
{
  "id": "c4c7271a-c05d-4b3f-be60-e1dd99b07928",
  "order_id": "b310c310-37ec-4762-be59-97f66440c1d2",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "ed79a7f3-c6ed-4bfd-a99d-9d3d90a93986",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ed79a7f3-c6ed-4bfd-a99d-9d3d90a93986",
  "order_id": "b310c310-37ec-4762-be59-97f66440c1d2",
  "assignment_id": "c4c7271a-c05d-4b3f-be60-e1dd99b07928",
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

`POST /api/driver/v1/trips/ed79a7f3-c6ed-4bfd-a99d-9d3d90a93986/cancel` → **200**

```json
{
  "command_id": "d7632a86-b8a3-413c-81f2-2019c6adca98",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "ed79a7f3-c6ed-4bfd-a99d-9d3d90a93986",
  "order_id": "b310c310-37ec-4762-be59-97f66440c1d2",
  "assignment_id": "c4c7271a-c05d-4b3f-be60-e1dd99b07928",
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

`GET /api/rider/v1/orders/b310c310-37ec-4762-be59-97f66440c1d2` → **200**

```json
{
  "id": "b310c310-37ec-4762-be59-97f66440c1d2",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "603c8367-44a9-42cc-a00f-38434e3ddd30",
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
    "id": "c4c7271a-c05d-4b3f-be60-e1dd99b07928",
    "order_id": "b310c310-37ec-4762-be59-97f66440c1d2",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "ed79a7f3-c6ed-4bfd-a99d-9d3d90a93986",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:00:57.709098Z",
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
  "session_id": "df2f576d-ee60-4f5a-90bb-ef261972d807",
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
  "last_heartbeat_at": "2026-10-30T13:00:56.826651Z",
  "last_location_at": "2026-10-30T13:00:56.826651Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/df2f576d-ee60-4f5a-90bb-ef261972d807/close` → **200**

```json
{
  "command_id": "54e8c4be-eb15-4501-9a10-bb4180e05aee",
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
  "session_id": "a8c2cc24-da88-4dd7-816c-d2e84b5fbc19",
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
  "last_heartbeat_at": "2026-10-30T13:01:04.800563Z",
  "last_location_at": "2026-10-30T13:01:04.800563Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a8c2cc24-da88-4dd7-816c-d2e84b5fbc19/close` → **200**

```json
{
  "command_id": "98d7f97b-a808-47c2-aed9-66053fdb2674",
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
  "session_id": "fde9cf63-44e1-4726-81b0-740168090f43",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYxNjcsImlhdCI6MTc5MzM2NTI2NywianRpIjoiYmQ0MDY0ZjktYmRkYi00MjkwLWE1YjYtMGRjZDg5Yzg0NjBlIiwic2lkIjoiZmRlOWNmNjMtNDRlMS00NzI2LTgxYjAtNzQwMTY4MDkwZjQzIn0.1EOcwH0RTCQADXM6b03mp64rj6EI700EHrhwlquQnEI",
  "access_expires_at": "2026-10-30T13:16:07.078343474Z",
  "refresh_token": "nFqGmre-nGF0voJP5RtHHNPb8YrPRCG8h3M0OvC1oD8",
  "refresh_expires_at": "2026-10-31T01:01:07.07784314Z",
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
  "command_id": "e3301cf4-a9fc-4cf3-8e60-6e5a85398a58",
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
  "session_id": "9a8062b2-55a8-4f11-b0af-88da6549329b",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYxNjcsImlhdCI6MTc5MzM2NTI2NywianRpIjoiM2Q4YzE2NmEtMmRhZC00NmVlLTgzYzItNGY4MGQyMzAzMTIxIiwic2lkIjoiOWE4MDYyYjItNTVhOC00ZjExLWIwYWYtODhkYTY1NDkzMjliIn0.AV9Xrat4fz2AI1tGIOTx3mGWCgsHdgeJsHgT87AQ1FM",
  "access_expires_at": "2026-10-30T13:16:07.827210601Z",
  "refresh_token": "vKbZS6sOBqCTZfJJXl3Jkg9iettDxfJ1nHFzGi-O7q8",
  "refresh_expires_at": "2026-10-31T01:01:07.826769396Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.99685482",
    "linkedid": "1730052700.99685482",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674879945"
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
    "id": "1730052700.99685482",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "054a4804-7e07-4f9a-95c9-9447562aa407",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380674879945",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:01:08.011143Z",
      "answered_at": null,
      "ended_at": "2026-10-30T13:01:08.030767Z",
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
    "id": "1730052600.1208918220",
    "linkedid": "1730052600.1208918220",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674879945"
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
      "id": "286c3e0b-bbb6-4811-a39a-04f42ad13292",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674879945",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:01:08.248652Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/286c3e0b-bbb6-4811-a39a-04f42ad13292/answer` → **200**

```json
{
  "command_id": "3f685577-5522-4543-bbe5-bde6dcc6c2bd"
}
```

```json
{
  "id": "286c3e0b-bbb6-4811-a39a-04f42ad13292",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674879945",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "order_ids": [],
  "started_at": "2026-10-30T13:01:08.248652Z",
  "answered_at": "2026-10-30T13:01:08.473198Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1208918220",
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
    "id": "1730052600.1208918220",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "286c3e0b-bbb6-4811-a39a-04f42ad13292",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674879945",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "87983110-3c7f-42d1-8f17-34a004597065",
      "order_ids": [],
      "started_at": "2026-10-30T13:01:08.248652Z",
      "answered_at": "2026-10-30T13:01:08.473198Z",
      "ended_at": "2026-10-30T13:01:08.687521Z",
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
      "id": "286c3e0b-bbb6-4811-a39a-04f42ad13292",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674879945",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "87983110-3c7f-42d1-8f17-34a004597065",
      "order_ids": [],
      "started_at": "2026-10-30T13:01:08.248652Z",
      "answered_at": "2026-10-30T13:01:08.473198Z",
      "ended_at": "2026-10-30T13:01:08.687521Z",
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
      "id": "286c3e0b-bbb6-4811-a39a-04f42ad13292",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674879945",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "87983110-3c7f-42d1-8f17-34a004597065",
      "order_ids": [],
      "started_at": "2026-10-30T13:01:08.248652Z",
      "answered_at": "2026-10-30T13:01:08.473198Z",
      "ended_at": "2026-10-30T13:01:08.687521Z",
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
      "id": "286c3e0b-bbb6-4811-a39a-04f42ad13292",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674879945",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "87983110-3c7f-42d1-8f17-34a004597065",
      "order_ids": [],
      "started_at": "2026-10-30T13:01:08.248652Z",
      "answered_at": "2026-10-30T13:01:08.473198Z",
      "ended_at": "2026-10-30T13:01:08.687521Z",
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
      "id": "286c3e0b-bbb6-4811-a39a-04f42ad13292",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674879945",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "87983110-3c7f-42d1-8f17-34a004597065",
      "order_ids": [],
      "started_at": "2026-10-30T13:01:08.248652Z",
      "answered_at": "2026-10-30T13:01:08.473198Z",
      "ended_at": "2026-10-30T13:01:08.687521Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:01:15.441989Z"
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
      "id": "286c3e0b-bbb6-4811-a39a-04f42ad13292",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674879945",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "87983110-3c7f-42d1-8f17-34a004597065",
      "order_ids": [],
      "started_at": "2026-10-30T13:01:08.248652Z",
      "answered_at": "2026-10-30T13:01:08.473198Z",
      "ended_at": "2026-10-30T13:01:08.687521Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:01:15.441989Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/286c3e0b-bbb6-4811-a39a-04f42ad13292/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/286c3e0b-bbb6-4811-a39a-04f42ad13292/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=286c3e0b-bbb6-4811-a39a-04f42ad13292` → **200**

```json
{
  "changes": [
    {
      "id": "34a7e5be-9945-4dd2-84c5-bec9a59e4729",
      "occurred_at": "2026-10-30T13:01:17.929442Z",
      "actor_type": "STAFF",
      "actor_id": "87983110-3c7f-42d1-8f17-34a004597065",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "286c3e0b-bbb6-4811-a39a-04f42ad13292",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"c39624ed-409c-4ff3-9bf8-a9bfb40ab9be\", \"order_ids\": []}",
      "correlation_id": "d1855707-dc35-4d3d-8e5c-ba359df55294"
    },
    {
      "id": "0879ff1c-dc2d-49ef-880f-7263cdf42dc0",
      "occurred_at": "2026-10-30T13:01:17.905372Z",
      "actor_type": "STAFF",
      "actor_id": "87983110-3c7f-42d1-8f17-34a004597065",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "286c3e0b-bbb6-4811-a39a-04f42ad13292",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"c39624ed-409c-4ff3-9bf8-a9bfb40ab9be\", \"order_ids\": []}",
      "correlation_id": "612327d9-93aa-4e08-9d3f-99e68e77b58a"
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

Done: call 286c3e0b-bbb6-4811-a39a-04f42ad13292 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21198"
}
```

```json
{
  "challenge_id": "db431338-a622-4d6b-888a-eb4efedbb27b",
  "expires_at": "2026-10-30T13:06:18.156256142Z",
  "resend_available_at": "2026-10-30T13:01:19.156256142Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "071273",
  "sent_at": "2026-10-30T13:01:18.158617957Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db431338-a622-4d6b-888a-eb4efedbb27b",
  "code": "071273",
  "device_ref": "sandbox-21198"
}
```

```json
{
  "session_id": "bedd8404-4de8-428e-9642-477bc98c89ae",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjE3OCwiaWF0IjoxNzkzMzY1Mjc4LCJqdGkiOiI3NDIyN2IwOS1mNzhjLTRmMWQtOTExMC1kMTFiNTNjZTNlZDkiLCJzaWQiOiJiZWRkODQwNC00ZGU4LTQyOGUtOTY0Mi00NzdiYzk4Yzg5YWUifQ.d7Cz3uH5GpMb22NY0gr9kxmVPV99hKCT28-ytZp1dGs",
  "access_expires_at": "2026-10-30T13:16:18.361197487Z",
  "refresh_token": "nH6sSGhkxKBjmsLC-aoNczw8lonAd6TmFh7lS-OQxQE",
  "refresh_expires_at": "2026-11-29T13:01:18.36082855Z",
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
  "command_id": "6fbd206f-7a91-4aa0-81e8-28bcce077cce",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:01:18Z",
    "sequence": 1793365278733
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8b327183-a903-4d92-bde1-8b2548cdb1a6",
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
  "last_heartbeat_at": "2026-10-30T13:01:18.749678Z",
  "last_location_at": "2026-10-30T13:01:18.749678Z",
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
  "session_id": "ede8c5ad-b5bd-4b86-9f5e-1f24c70a43ff",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYxNzksImlhdCI6MTc5MzM2NTI3OSwianRpIjoiNzIwN2I0MTMtZmU4My00NjQ4LWJkODItMmFjYjM5YTcxYzZhIiwic2lkIjoiZWRlOGM1YWQtYjViZC00Yjg2LTlmNWUtMWYyNGM3MGE0M2ZmIn0.6l7D0RssgcxJ3nt5DfEnNJ_HC-FeMADeLkK3k8z_3K0",
  "access_expires_at": "2026-10-30T13:16:19.132784525Z",
  "refresh_token": "h0437zCllZd2hB4J24RtCc240HqEscgh2eSqlriZIZE",
  "refresh_expires_at": "2026-10-31T01:01:19.132361157Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "830fb7eb-4355-4dac-b982-08b7a89276fb",
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
  "id": "c06c30e9-663c-47d3-938f-4cdb3f74d387",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:06:19.320798Z",
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
  "command_id": "1a2d4b43-8500-49c9-8727-261ce1eb845d",
  "quote_id": "c06c30e9-663c-47d3-938f-4cdb3f74d387",
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
    "phone": "+380675444064"
  }
}
```

```json
{
  "id": "598050ee-41a3-4546-9515-e57dbc4692a5",
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
  "created_at": "2026-10-30T13:01:19.5326Z",
  "caller": {
    "name": "Олена",
    "phone": "+380675444064"
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
    "id": "089e4d46-4e81-4d7f-abb3-5ff219e48126",
    "order_id": "598050ee-41a3-4546-9515-e57dbc4692a5",
    "expires_at": "2026-10-30T13:01:34.535795Z",
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

`POST /api/driver/v1/offers/089e4d46-4e81-4d7f-abb3-5ff219e48126/accept` → **200**

```json
{
  "command_id": "a97d751b-bd89-4cee-aae5-b377290b3a37"
}
```

```json
{
  "id": "65442eb9-d23b-442f-865c-651e82f60ae4",
  "order_id": "598050ee-41a3-4546-9515-e57dbc4692a5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "75dddf90-d4f3-4d25-8ba9-d1e53a4124bf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380675444064` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380675444064` → **200**

```json
[
  {
    "phone": "+380675444064",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:01:20.876390345Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675444064` → **200**

```json
[
  {
    "phone": "+380675444064",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:01:20.876390345Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675444064` → **200**

```json
[
  {
    "phone": "+380675444064",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:01:20.876390345Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "75dddf90-d4f3-4d25-8ba9-d1e53a4124bf",
  "order_id": "598050ee-41a3-4546-9515-e57dbc4692a5",
  "assignment_id": "65442eb9-d23b-442f-865c-651e82f60ae4",
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
    "phone": "+380675444064"
  }
}
```

`POST /api/driver/v1/work-sessions/8b327183-a903-4d92-bde1-8b2548cdb1a6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:01:21Z",
    "sequence": 1793365281412
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8b327183-a903-4d92-bde1-8b2548cdb1a6",
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
  "last_heartbeat_at": "2026-10-30T13:01:21.428837Z",
  "last_location_at": "2026-10-30T13:01:21.428837Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/75dddf90-d4f3-4d25-8ba9-d1e53a4124bf/arrive` → **200**

```json
{
  "command_id": "c654b4a6-ab6d-4ad7-b412-fedcf0e73007",
  "expected_version": 0
}
```

```json
{
  "id": "75dddf90-d4f3-4d25-8ba9-d1e53a4124bf",
  "order_id": "598050ee-41a3-4546-9515-e57dbc4692a5",
  "assignment_id": "65442eb9-d23b-442f-865c-651e82f60ae4",
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
  "arrived_at": "2026-10-30T13:01:21.624263Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675444064"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380675444064` → **200**

```json
[
  {
    "phone": "+380675444064",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:01:20.876390345Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675444064` → **200**

```json
[
  {
    "phone": "+380675444064",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:01:20.876390345Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675444064` → **200**

```json
[
  {
    "phone": "+380675444064",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:01:20.876390345Z"
  },
  {
    "phone": "+380675444064",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:01:22.882261609Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675444064` → **200**

```json
[
  {
    "phone": "+380675444064",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:01:20.876390345Z"
  },
  {
    "phone": "+380675444064",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:01:22.882261609Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675444064` → **200**

```json
[
  {
    "phone": "+380675444064",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:01:20.876390345Z"
  },
  {
    "phone": "+380675444064",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:01:22.882261609Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/75dddf90-d4f3-4d25-8ba9-d1e53a4124bf/start` → **200**

```json
{
  "command_id": "33f4a2ad-3cfa-44bf-a125-6a908f5d070c",
  "expected_version": 1
}
```

```json
{
  "id": "75dddf90-d4f3-4d25-8ba9-d1e53a4124bf",
  "order_id": "598050ee-41a3-4546-9515-e57dbc4692a5",
  "assignment_id": "65442eb9-d23b-442f-865c-651e82f60ae4",
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
  "arrived_at": "2026-10-30T13:01:21.624263Z",
  "started_at": "2026-10-30T13:01:23.92483Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675444064"
  }
}
```

`POST /api/driver/v1/trips/75dddf90-d4f3-4d25-8ba9-d1e53a4124bf/complete` → **200**

```json
{
  "command_id": "b08a54eb-a0aa-4c9b-b2ae-9d741ba37562",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:01:24Z",
  "cash_received": true
}
```

```json
{
  "id": "75dddf90-d4f3-4d25-8ba9-d1e53a4124bf",
  "order_id": "598050ee-41a3-4546-9515-e57dbc4692a5",
  "assignment_id": "65442eb9-d23b-442f-865c-651e82f60ae4",
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
  "arrived_at": "2026-10-30T13:01:21.624263Z",
  "started_at": "2026-10-30T13:01:23.92483Z",
  "completed_at": "2026-10-30T13:01:24.15699Z",
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
  "session_id": "8b327183-a903-4d92-bde1-8b2548cdb1a6",
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
  "last_heartbeat_at": "2026-10-30T13:01:21.428837Z",
  "last_location_at": "2026-10-30T13:01:21.428837Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8b327183-a903-4d92-bde1-8b2548cdb1a6/close` → **200**

```json
{
  "command_id": "6d30a0d0-a658-4c3f-8f80-990b653ed179",
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
  "phone": "+380636442223",
  "device_ref": "sandbox-2166"
}
```

```json
{
  "challenge_id": "61a7ea0d-f98a-4c98-8025-da2c7326b472",
  "expires_at": "2026-10-30T13:06:24.7624832Z",
  "resend_available_at": "2026-10-30T13:01:25.7624832Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636442223` → **200**

```json
{
  "phone": "+380636442223",
  "audience": "CLIENT",
  "code": "306948",
  "sent_at": "2026-10-30T13:01:24.764355878Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "61a7ea0d-f98a-4c98-8025-da2c7326b472",
  "code": "306948",
  "device_ref": "sandbox-2166"
}
```

```json
{
  "session_id": "b0518cd1-0cbc-4cbe-b337-314e15a2e6a5",
  "subject": {
    "type": "CLIENT",
    "id": "9aa34f36-b21e-4f01-a7e5-95446b955969"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YWEzNGYzNi1iMjFlLTRmMDEtYTdlNS05NTQ0NmI5NTU5NjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MTg0LCJpYXQiOjE3OTMzNjUyODQsImp0aSI6IjQ5NTE5ODI3LTA3MDEtNDMyMC04MGFlLTQ2OTZhODUxMGZiZSIsInNpZCI6ImIwNTE4Y2QxLTBjYmMtNGNiZS1iMzM3LTMxNGUxNWEyZTZhNSJ9.iBKldTr9Z96xZmQG-Xtp0hTXK1jobSNOwyxDgHIVRz4",
  "access_expires_at": "2026-10-30T13:16:24.967949605Z",
  "refresh_token": "rtpOP4xbrEulOoHAUNPQSy9LGTUkdpm1oTHonIzaLoI",
  "refresh_expires_at": "2026-11-29T13:01:24.967609623Z",
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
  "device_ref": "sandbox-6957"
}
```

```json
{
  "challenge_id": "d27b1d47-e343-4ee5-8865-c5715bfae455",
  "expires_at": "2026-10-30T13:06:25.335218103Z",
  "resend_available_at": "2026-10-30T13:01:26.335218103Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "201493",
  "sent_at": "2026-10-30T13:01:25.337215392Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d27b1d47-e343-4ee5-8865-c5715bfae455",
  "code": "201493",
  "device_ref": "sandbox-6957"
}
```

```json
{
  "session_id": "add83d48-6370-40c0-9ac7-49d3270ad223",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjE4NSwiaWF0IjoxNzkzMzY1Mjg1LCJqdGkiOiIwZDBjYTJjNi1hNDk2LTQxZWMtOWM2OS04ZDc1MTc4Zjc1MTEiLCJzaWQiOiJhZGQ4M2Q0OC02MzcwLTQwYzAtOWFjNy00OWQzMjcwYWQyMjMifQ.aYdJuYYMnoLk5Y3WI7vZv-JRwfGuvHyEEjG780ADGU0",
  "access_expires_at": "2026-10-30T13:16:25.587606845Z",
  "refresh_token": "1lfPap-riqvgy9BFxNl7ahKxw-PQ4uogAI84BQ3JJdc",
  "refresh_expires_at": "2026-11-29T13:01:25.586472175Z",
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
  "session_id": "bd8cd325-d875-4dcc-b8cb-9e9244dbdc27",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYxODYsImlhdCI6MTc5MzM2NTI4NiwianRpIjoiNzI3YzEzYjgtNWQzYy00MTVjLTk0ZDEtMzIwYWM2Y2MxNmRlIiwic2lkIjoiYmQ4Y2QzMjUtZDg3NS00ZGNjLWI4Y2ItOWU5MjQ0ZGJkYzI3In0.fc7Kx7Yj1FjaAFg4TO92w8PW8GjL-hyG1EnrgbNJek8",
  "access_expires_at": "2026-10-30T13:16:26.232033637Z",
  "refresh_token": "kUDAcJd8z6POISgTCCU7KTw5bZtHyWaQt-_czvOu8hQ",
  "refresh_expires_at": "2026-10-31T01:01:26.231631391Z",
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
  "session_id": "6065dd17-ee13-447d-8610-60beb89a4fc8",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYxODYsImlhdCI6MTc5MzM2NTI4NiwianRpIjoiNmNjMjEyNTAtYzIzNC00NGIyLWJkMzctZWZiNmFjOTAwYWE3Iiwic2lkIjoiNjA2NWRkMTctZWUxMy00NDdkLTg2MTAtNjBiZWI4OWE0ZmM4In0.KQkH8FElIxUnP9WSaBfVll1GvzEkizk-OQHjIepZlj0",
  "access_expires_at": "2026-10-30T13:16:26.617348946Z",
  "refresh_token": "VnLujODnY74f6hvBQYYCMqx97nvSw4rx7lTqA5spBOU",
  "refresh_expires_at": "2026-10-31T01:01:26.617007672Z",
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
  "command_id": "0d641c32-d70b-4ef4-a878-53c721cb4105",
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
  "id": "28dbaf2b-8cfc-461a-9f81-72ccd3f026c9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:06:27.008416Z",
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
  "command_id": "edcedf28-5b65-480d-b845-99f70d391bbc",
  "quote_id": "28dbaf2b-8cfc-461a-9f81-72ccd3f026c9",
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
  "id": "f101009d-18b1-474e-be67-17c3972cc4fc",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9aa34f36-b21e-4f01-a7e5-95446b955969",
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
  "created_at": "2026-10-30T13:01:27.218547Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f101009d-18b1-474e-be67-17c3972cc4fc` → **200**

```json
{
  "id": "f101009d-18b1-474e-be67-17c3972cc4fc",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9aa34f36-b21e-4f01-a7e5-95446b955969",
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
  "created_at": "2026-10-30T13:01:27.218547Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f101009d-18b1-474e-be67-17c3972cc4fc/cancel` → **200**

```json
{
  "command_id": "4a692c93-767e-487b-a2fc-52a267b06145",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "f101009d-18b1-474e-be67-17c3972cc4fc",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9aa34f36-b21e-4f01-a7e5-95446b955969",
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
  "created_at": "2026-10-30T13:01:27.218547Z",
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
  "command_id": "2a7e39cc-56ba-4864-9490-27f330c3bf9a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:01:28Z",
    "sequence": 1793365288542
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "532ca750-7fa5-4683-baa5-aa007ab7b97a",
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
  "last_heartbeat_at": "2026-10-30T13:01:28.07123Z",
  "last_location_at": "2026-10-30T13:01:28.07123Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-10968"
}
```

```json
{
  "challenge_id": "7e0a2f39-d1f1-4b95-a4f2-3510b2a62ee3",
  "expires_at": "2026-10-30T13:06:28.297739736Z",
  "resend_available_at": "2026-10-30T13:01:29.297739736Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "607874",
  "sent_at": "2026-10-30T13:01:28.300452663Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e0a2f39-d1f1-4b95-a4f2-3510b2a62ee3",
  "code": "607874",
  "device_ref": "sandbox-10968"
}
```

```json
{
  "session_id": "ef8c4375-8bff-4e4f-b7fc-286ef5219ae7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjE4OCwiaWF0IjoxNzkzMzY1Mjg4LCJqdGkiOiJhODQ3MDhiNi01MTgwLTQ2OTMtOWY2Mi1iYTA1N2M3ZDY4NTkiLCJzaWQiOiJlZjhjNDM3NS04YmZmLTRlNGYtYjdmYy0yODZlZjUyMTlhZTcifQ.Bpen5zZ27HY1-BsJJ_472z-ChSrlMLYF5FMCtbobN2Y",
  "access_expires_at": "2026-10-30T13:16:28.511844618Z",
  "refresh_token": "vb4btkUPcomKLuqAUf_VjUWLiiAbPeCsHs65u6oHKcI",
  "refresh_expires_at": "2026-11-29T13:01:28.511437274Z",
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
  "command_id": "a63610eb-2c62-4b70-9263-4a2fd716564b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:01:28Z",
    "sequence": 1793365288922
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "809cfc0e-605b-45c8-bd66-27e15042b22e",
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
  "last_heartbeat_at": "2026-10-30T13:01:28.940824Z",
  "last_location_at": "2026-10-30T13:01:28.940824Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d25270ef-4743-492d-994e-4cca9d2fc7e6",
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
  "id": "0ea8a6ad-1820-4c34-90ad-dc936fbcd9e2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:06:29.147453Z",
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
  "command_id": "a35ceead-734e-48ce-b161-49c494c99838",
  "quote_id": "0ea8a6ad-1820-4c34-90ad-dc936fbcd9e2",
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
  "id": "dafd7db3-160b-443f-8f95-8354f4d2cc43",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9aa34f36-b21e-4f01-a7e5-95446b955969",
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
  "created_at": "2026-10-30T13:01:29.353818Z",
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
    "id": "2ae500c2-b583-4ea1-8b73-619014d08bdb",
    "order_id": "dafd7db3-160b-443f-8f95-8354f4d2cc43",
    "expires_at": "2026-10-30T13:01:44.356242Z",
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

`POST /api/driver/v1/offers/2ae500c2-b583-4ea1-8b73-619014d08bdb/accept` → **200**

```json
{
  "command_id": "231adb7e-6f90-4ab1-91a8-81a4a59dee0b"
}
```

```json
{
  "id": "6af017fb-1ee9-4184-b7db-6993e1d87211",
  "order_id": "dafd7db3-160b-443f-8f95-8354f4d2cc43",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "37941fe0-e653-49ae-96a8-d7ac870efe7e",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "37941fe0-e653-49ae-96a8-d7ac870efe7e",
  "order_id": "dafd7db3-160b-443f-8f95-8354f4d2cc43",
  "assignment_id": "6af017fb-1ee9-4184-b7db-6993e1d87211",
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

`POST /api/driver/v1/trips/37941fe0-e653-49ae-96a8-d7ac870efe7e/cancel` → **200**

```json
{
  "command_id": "c1a8f636-9941-48ba-94c6-21c0320be3b3",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "37941fe0-e653-49ae-96a8-d7ac870efe7e",
  "order_id": "dafd7db3-160b-443f-8f95-8354f4d2cc43",
  "assignment_id": "6af017fb-1ee9-4184-b7db-6993e1d87211",
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

`GET /api/rider/v1/orders/dafd7db3-160b-443f-8f95-8354f4d2cc43` → **200**

```json
{
  "id": "dafd7db3-160b-443f-8f95-8354f4d2cc43",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9aa34f36-b21e-4f01-a7e5-95446b955969",
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
    "id": "6af017fb-1ee9-4184-b7db-6993e1d87211",
    "order_id": "dafd7db3-160b-443f-8f95-8354f4d2cc43",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "37941fe0-e653-49ae-96a8-d7ac870efe7e",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:01:29.353818Z",
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
    "id": "2f5ff634-b2cb-4f27-80b4-d841d3a1a2fd",
    "order_id": "dafd7db3-160b-443f-8f95-8354f4d2cc43",
    "expires_at": "2026-10-30T13:01:45.210047Z",
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

`POST /api/driver/v1/offers/2f5ff634-b2cb-4f27-80b4-d841d3a1a2fd/accept` → **200**

```json
{
  "command_id": "f18edeb2-4605-456c-990a-71ebb2a80d32"
}
```

```json
{
  "id": "b305c130-412a-48c2-aed5-ec95f3053c67",
  "order_id": "dafd7db3-160b-443f-8f95-8354f4d2cc43",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a5c4e82c-5bdb-4dee-863d-1e26a440290a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a5c4e82c-5bdb-4dee-863d-1e26a440290a",
  "order_id": "dafd7db3-160b-443f-8f95-8354f4d2cc43",
  "assignment_id": "b305c130-412a-48c2-aed5-ec95f3053c67",
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

`POST /api/driver/v1/trips/a5c4e82c-5bdb-4dee-863d-1e26a440290a/cancel` → **200**

```json
{
  "command_id": "e4b2865e-a81f-4996-88fa-3c528e895b1f",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "a5c4e82c-5bdb-4dee-863d-1e26a440290a",
  "order_id": "dafd7db3-160b-443f-8f95-8354f4d2cc43",
  "assignment_id": "b305c130-412a-48c2-aed5-ec95f3053c67",
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
{
  "items": [
    {
      "id": "dafd7db3-160b-443f-8f95-8354f4d2cc43",
      "short_number": 6,
      "status": "CANCELLED",
      "created_at": "2026-10-30T13:01:29.353818Z",
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
      "id": "f101009d-18b1-474e-be67-17c3972cc4fc",
      "short_number": 5,
      "status": "CANCELLED",
      "created_at": "2026-10-30T13:01:27.218547Z",
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
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/orders/dafd7db3-160b-443f-8f95-8354f4d2cc43/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:01:29.354303Z",
      "actor": {
        "type": "CLIENT",
        "id": "9aa34f36-b21e-4f01-a7e5-95446b955969",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "dafd7db3-160b-443f-8f95-8354f4d2cc43",
        "quote_id": "0ea8a6ad-1820-4c34-90ad-dc936fbcd9e2",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "e21b865d-f352-4ae8-b58c-da4dec360e5c"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:01:29.355631Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "dafd7db3-160b-443f-8f95-8354f4d2cc43",
        "attempt_id": "3336db51-8af2-49e5-a76e-e21e58a1d5a6",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e21b865d-f352-4ae8-b58c-da4dec360e5c"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:01:29.36038Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2ae500c2-b583-4ea1-8b73-619014d08bdb",
        "order_id": "dafd7db3-160b-443f-8f95-8354f4d2cc43",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "e21b865d-f352-4ae8-b58c-da4dec360e5c"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:01:29.809978Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "2ae500c2-b583-4ea1-8b73-619014d08bdb",
        "order_id": "dafd7db3-160b-443f-8f95-8354f4d2cc43",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "6af017fb-1ee9-4184-b7db-6993e1d87211"
      },
      "correlation_id": "cb177193-8fb2-466f-97bc-370ed9bc9df0"
```

Done: orders f101009d-18b1-474e-be67-17c3972cc4fc, dafd7db3-160b-443f-8f95-8354f4d2cc43.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731381998",
  "device_ref": "sandbox-20909"
}
```

```json
{
  "challenge_id": "59d56873-103e-4399-bed8-6263686bd750",
  "expires_at": "2026-10-30T13:06:31.78532082Z",
  "resend_available_at": "2026-10-30T13:01:32.78532082Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731381998` → **200**

```json
{
  "phone": "+380731381998",
  "audience": "CLIENT",
  "code": "066857",
  "sent_at": "2026-10-30T13:01:31.787387889Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "59d56873-103e-4399-bed8-6263686bd750",
  "code": "066857",
  "device_ref": "sandbox-20909"
}
```

```json
{
  "session_id": "fb5d97aa-19b3-472d-9e53-656d8a1ede8e",
  "subject": {
    "type": "CLIENT",
    "id": "a59016c0-8feb-427b-a3d2-f8fbfa522310"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTkwMTZjMC04ZmViLTQyN2ItYTNkMi1mOGZiZmE1MjIzMTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MTkxLCJpYXQiOjE3OTMzNjUyOTEsImp0aSI6IjAwMDY1MjY3LTlmM2ItNDAzZC1iNTYxLTQzYzM1MDQzMmMwMCIsInNpZCI6ImZiNWQ5N2FhLTE5YjMtNDcyZC05ZTUzLTY1NmQ4YTFlZGU4ZSJ9.tlfJuDWvg3YLHsxqw2WTOrkH2EiWhVpDJdlwVDJy--o",
  "access_expires_at": "2026-10-30T13:16:31.996735017Z",
  "refresh_token": "qGVyoSn5ULTPq8fZjcpUskGtrsq-SsANDidntumo_xk",
  "refresh_expires_at": "2026-11-29T13:01:31.996341566Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "51bb0626-d4a5-49db-9f1a-e29256fb98bd",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "fae5ead9-f53a-4b85-aac9-cf3934925471",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-fae5ead9-f53a-4b85-aac9-cf3934925471",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "59194244d62cb9bafff74fc4c8835ab5",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=fae5ead9-f53a-4b85-aac9-cf3934925471",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731381998"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=fae5ead9-f53a-4b85-aac9-cf3934925471",
  "expires_at": "2026-10-30T13:31:32.19615Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/fae5ead9-f53a-4b85-aac9-cf3934925471` → **200**

```json
{
  "id": "fae5ead9-f53a-4b85-aac9-cf3934925471",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:31:32.19615Z",
  "card": {
    "id": "caf99d18-6f65-4dac-b6dc-245bbf7fbf04",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1453",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:01:32.397298Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "caf99d18-6f65-4dac-b6dc-245bbf7fbf04",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****1453",
      "card_type": "Visa",
      "created_at": "2026-10-30T13:01:32.397298Z"
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
  "device_ref": "sandbox-26488"
}
```

```json
{
  "challenge_id": "bc26de51-6619-4330-8a92-28dfc8bf90d9",
  "expires_at": "2026-10-30T13:06:32.80375797Z",
  "resend_available_at": "2026-10-30T13:01:33.80375797Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "203931",
  "sent_at": "2026-10-30T13:01:32.805784804Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc26de51-6619-4330-8a92-28dfc8bf90d9",
  "code": "203931",
  "device_ref": "sandbox-26488"
}
```

```json
{
  "session_id": "ae5b0229-3455-4214-9480-2fb917e7d005",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjE5MywiaWF0IjoxNzkzMzY1MjkzLCJqdGkiOiIyODE1Yjg1My03NDMwLTRkMjQtOTRiOC1lMDc3Y2I3ZjczZTEiLCJzaWQiOiJhZTViMDIyOS0zNDU1LTQyMTQtOTQ4MC0yZmI5MTdlN2QwMDUifQ.2Amaa9Oq7nIdeM2gBAV5tfWZDaxX7-G8iF7ZpKDsvXU",
  "access_expires_at": "2026-10-30T13:16:33.062947163Z",
  "refresh_token": "HVBgHAXSZ26q9k9eWr_1uVT4joXTXSPZlgDmBCUKIyI",
  "refresh_expires_at": "2026-11-29T13:01:33.06251323Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "809cfc0e-605b-45c8-bd66-27e15042b22e",
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
  "last_heartbeat_at": "2026-10-30T13:01:28.940824Z",
  "last_location_at": "2026-10-30T13:01:28.940824Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/809cfc0e-605b-45c8-bd66-27e15042b22e/handover` → **200**

```json
{
  "command_id": "e12d95c9-f71b-49e4-a6e7-5ec92295df1c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "809cfc0e-605b-45c8-bd66-27e15042b22e",
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
  "last_heartbeat_at": "2026-10-30T13:01:28.940824Z",
  "last_location_at": "2026-10-30T13:01:28.940824Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 44 s to the next point)

`POST /api/driver/v1/work-sessions/809cfc0e-605b-45c8-bd66-27e15042b22e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:02:17Z",
    "sequence": 1793365337650
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "809cfc0e-605b-45c8-bd66-27e15042b22e",
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
  "last_heartbeat_at": "2026-10-30T13:02:17.665711Z",
  "last_location_at": "2026-10-30T13:02:17.665711Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eb7ef425-5512-4ec8-b73c-94a64c98d9da",
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
  "id": "3f4e2480-916f-4679-9f68-36f88e7e42be",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:07:17.861221Z",
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

`POST /api/rider/v1/orders` → **202**

```json
{
  "command_id": "85a9efe5-81ea-4474-90bb-e3fc1a527a7d",
  "quote_id": "3f4e2480-916f-4679-9f68-36f88e7e42be",
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
  "id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a59016c0-8feb-427b-a3d2-f8fbfa522310",
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
  "created_at": "2026-10-30T13:02:18.065136Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b9bbd540-f174-415f-8628-b7dbbef56ef8` → **200**

```json
{
  "id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a59016c0-8feb-427b-a3d2-f8fbfa522310",
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
  "created_at": "2026-10-30T13:02:18.065136Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b9bbd540-f174-415f-8628-b7dbbef56ef8` → **200**

```json
{
  "id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a59016c0-8feb-427b-a3d2-f8fbfa522310",
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
  "created_at": "2026-10-30T13:02:18.065136Z",
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
    "id": "2aa08bcb-1cdc-4889-a4fc-771baa296fbb",
    "order_id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
    "expires_at": "2026-10-30T13:02:33.670461Z",
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

`POST /api/driver/v1/offers/2aa08bcb-1cdc-4889-a4fc-771baa296fbb/accept` → **200**

```json
{
  "command_id": "6586ea67-3a7f-4e5a-843e-1d6c3078a219"
}
```

```json
{
  "id": "6fee146b-876b-4985-8800-20bdbfd54ee2",
  "order_id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "24704c39-7311-43b4-82df-86ad87fd4d6f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "24704c39-7311-43b4-82df-86ad87fd4d6f",
  "order_id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
  "assignment_id": "6fee146b-876b-4985-8800-20bdbfd54ee2",
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

`POST /api/driver/v1/work-sessions/809cfc0e-605b-45c8-bd66-27e15042b22e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:02:26Z",
    "sequence": 1793365346265
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "809cfc0e-605b-45c8-bd66-27e15042b22e",
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
  "last_heartbeat_at": "2026-10-30T13:02:26.280984Z",
  "last_location_at": "2026-10-30T13:02:26.280984Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/24704c39-7311-43b4-82df-86ad87fd4d6f/arrive` → **200**

```json
{
  "command_id": "af17a165-aa9c-405e-b6ef-263857eac265",
  "expected_version": 0
}
```

```json
{
  "id": "24704c39-7311-43b4-82df-86ad87fd4d6f",
  "order_id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
  "assignment_id": "6fee146b-876b-4985-8800-20bdbfd54ee2",
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
  "arrived_at": "2026-10-30T13:02:26.517741Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/24704c39-7311-43b4-82df-86ad87fd4d6f/start` → **200**

```json
{
  "command_id": "3c961a9b-9bd2-4ab8-b2fa-ed008fd479c0",
  "expected_version": 1
}
```

```json
{
  "id": "24704c39-7311-43b4-82df-86ad87fd4d6f",
  "order_id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
  "assignment_id": "6fee146b-876b-4985-8800-20bdbfd54ee2",
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
  "arrived_at": "2026-10-30T13:02:26.517741Z",
  "started_at": "2026-10-30T13:02:26.721546Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/24704c39-7311-43b4-82df-86ad87fd4d6f/complete` → **200**

```json
{
  "command_id": "4799699b-44b1-4575-87b4-30f3b85ce26e",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:02:26Z",
  "cash_received": true
}
```

```json
{
  "id": "24704c39-7311-43b4-82df-86ad87fd4d6f",
  "order_id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
  "assignment_id": "6fee146b-876b-4985-8800-20bdbfd54ee2",
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
  "arrived_at": "2026-10-30T13:02:26.517741Z",
  "started_at": "2026-10-30T13:02:26.721546Z",
  "completed_at": "2026-10-30T13:02:26.937037Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/b9bbd540-f174-415f-8628-b7dbbef56ef8` → **200**

```json
{
  "id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a59016c0-8feb-427b-a3d2-f8fbfa522310",
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
    "id": "6fee146b-876b-4985-8800-20bdbfd54ee2",
    "order_id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "24704c39-7311-43b4-82df-86ad87fd4d6f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:02:18.065136Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b9bbd540-f174-415f-8628-b7dbbef56ef8` → **200**

```json
{
  "id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a59016c0-8feb-427b-a3d2-f8fbfa522310",
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
    "id": "6fee146b-876b-4985-8800-20bdbfd54ee2",
    "order_id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "24704c39-7311-43b4-82df-86ad87fd4d6f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:02:18.065136Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b9bbd540-f174-415f-8628-b7dbbef56ef8` → **200**

```json
{
  "id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "a59016c0-8feb-427b-a3d2-f8fbfa522310",
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
    "id": "6fee146b-876b-4985-8800-20bdbfd54ee2",
    "order_id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "24704c39-7311-43b4-82df-86ad87fd4d6f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:02:18.065136Z",
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

`GET /api/rider/v1/orders/b9bbd540-f174-415f-8628-b7dbbef56ef8/tip` → **200**

```json
{
  "order_id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
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
  "available_until": "2026-10-31T13:02:26.937037Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b9bbd540-f174-415f-8628-b7dbbef56ef8/tip` → **201**

```json
{
  "command_id": "74b182f2-c54c-46bf-a4be-d8df607fff48",
  "amount_minor": 2500
}
```

```json
{
  "id": "d33e2cb8-f888-4042-82ad-abbde19351d8",
  "order_id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T13:02:30.311723Z"
}
```

`GET /api/rider/v1/orders/b9bbd540-f174-415f-8628-b7dbbef56ef8/tip` → **200**

```json
{
  "order_id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
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
  "available_until": "2026-10-31T13:02:26.937037Z",
  "open": false,
  "tip": {
    "id": "d33e2cb8-f888-4042-82ad-abbde19351d8",
    "order_id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T13:02:30.311723Z"
  }
}
```

`GET /api/rider/v1/orders/b9bbd540-f174-415f-8628-b7dbbef56ef8/tip` → **200**

```json
{
  "order_id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
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
  "available_until": "2026-10-31T13:02:26.937037Z",
  "open": false,
  "tip": {
    "id": "d33e2cb8-f888-4042-82ad-abbde19351d8",
    "order_id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T13:02:30.311723Z"
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
      "id": "7bb8c60b-e799-4e3e-a3a4-83c5992ec939",
      "at": "2026-10-30T13:02:31.767626Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
      "counterpart_id": null
    },
    {
      "id": "0bcd24b4-ced9-4a7c-b111-da96033e60bf",
      "at": "2026-10-30T13:02:27.715147Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b9bbd540-f174-415f-8628-b7dbbef56ef8",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1aab3fc2-b56e-45eb-a2f5-00b1ab1809f5",
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
  "id": "6aa67ac2-14d5-4e2d-83ce-eb5759eb2d18",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:07:32.165584Z",
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
  "session_id": "0be4a5ed-f04a-4fde-845d-c369176cf3c6",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyNTIsImlhdCI6MTc5MzM2NTM1MiwianRpIjoiNmUxOWQwOGYtM2QwMC00MTQ2LWJlYzYtNTJlMzAyOTA3OTQ3Iiwic2lkIjoiMGJlNGE1ZWQtZjA0YS00ZmRlLTg0NWQtYzM2OTE3NmNmM2M2In0.BLCQUTTg5PzTPsuVpwJTXzCXJttaaG6XZtSK52To0x4",
  "access_expires_at": "2026-10-30T13:17:32.576986114Z",
  "refresh_token": "HoRW11S45lnH2X75BpteGMMA92Ck0hmxT1T9c1s8x_Y",
  "refresh_expires_at": "2026-10-31T01:02:32.576574404Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380731381998` → **200**

```json
{
  "client_id": "a59016c0-8feb-427b-a3d2-f8fbfa522310"
}
```

`POST /api/admin/v1/rider-wallets/a59016c0-8feb-427b-a3d2-f8fbfa522310/top-ups` → **201**

```json
{
  "command_id": "50fcd8da-0630-45a0-9f7d-bceacb0d0d92",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "a59016c0-8feb-427b-a3d2-f8fbfa522310",
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
      "id": "29048416-0759-4160-9d02-4acc677f8051",
      "at": "2026-10-30T13:02:32.957715Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "87983110-3c7f-42d1-8f17-34a004597065",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f8c765b3-8036-4732-852e-af3acb31b9be",
  "quote_id": "6aa67ac2-14d5-4e2d-83ce-eb5759eb2d18",
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
  "id": "308b6c6a-587a-414b-bd3c-cb2c94d6cc25",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a59016c0-8feb-427b-a3d2-f8fbfa522310",
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
  "created_at": "2026-10-30T13:02:33.16814Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

**Expected 202, got 201 — scenario stopped.**

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "809cfc0e-605b-45c8-bd66-27e15042b22e",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T13:02:26.280984Z",
  "last_location_at": "2026-10-30T13:02:26.280984Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/809cfc0e-605b-45c8-bd66-27e15042b22e/close` → **200**

```json
{
  "command_id": "6df6ffbe-c92e-418e-bac3-fdaec5437fe7",
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
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
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
  "phone": "+380732700587",
  "device_ref": "sandbox-7397"
}
```

```json
{
  "challenge_id": "275f6cb5-6a0c-4303-82fb-bd87ee91b745",
  "expires_at": "2026-10-30T13:07:33.791769029Z",
  "resend_available_at": "2026-10-30T13:02:34.791769029Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732700587` → **200**

```json
{
  "phone": "+380732700587",
  "audience": "CLIENT",
  "code": "551349",
  "sent_at": "2026-10-30T13:02:33.793470723Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "275f6cb5-6a0c-4303-82fb-bd87ee91b745",
  "code": "551349",
  "device_ref": "sandbox-7397"
}
```

```json
{
  "session_id": "b6b05a9b-db5a-4ead-913f-57a19eb33490",
  "subject": {
    "type": "CLIENT",
    "id": "0d31054a-6b3a-41b8-82dd-97cd597cab1b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZDMxMDU0YS02YjNhLTQxYjgtODJkZC05N2NkNTk3Y2FiMWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MjU0LCJpYXQiOjE3OTMzNjUzNTQsImp0aSI6IjE2NmNkY2U2LWY2YTgtNGJmZi1hOWUxLTg3NGFkNjk1NjFkZiIsInNpZCI6ImI2YjA1YTliLWRiNWEtNGVhZC05MTNmLTU3YTE5ZWIzMzQ5MCJ9.k2pBb8aokpAqiGCj2vof37s7sFAV8MsCe2T_rFb5b7g",
  "access_expires_at": "2026-10-30T13:17:34.003210225Z",
  "refresh_token": "7RLcu6-6AzrWFrszDmHtMWvPwB7BMdCi9gMvnj0a0y4",
  "refresh_expires_at": "2026-11-29T13:02:34.002794479Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "d7bbad1b-357b-488a-b4c6-5693f114cb6f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "53b196ff-a561-4a28-ada5-516c5dd9a6b8",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-53b196ff-a561-4a28-ada5-516c5dd9a6b8",
    "orderDate": "1793365354",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "546da4476a38f6f23f6d4a2092275f5e",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=53b196ff-a561-4a28-ada5-516c5dd9a6b8",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732700587"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=53b196ff-a561-4a28-ada5-516c5dd9a6b8",
  "created_at": "2026-10-30T13:02:34.203691Z",
  "expires_at": "2026-10-30T13:32:34.203691Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/53b196ff-a561-4a28-ada5-516c5dd9a6b8` → **200**

```json
{
  "id": "53b196ff-a561-4a28-ada5-516c5dd9a6b8",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T13:02:34.203691Z",
  "expires_at": "2026-10-30T13:32:34.203691Z",
  "completed_at": "2026-10-30T13:02:34.394699Z",
  "masked_pan": "41****2748",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "0d31054a-6b3a-41b8-82dd-97cd597cab1b",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "0d31054a-6b3a-41b8-82dd-97cd597cab1b",
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
      "id": "25ea33eb-2aee-43ba-a098-05d7814210d3",
      "at": "2026-10-30T13:02:34.790762Z",
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
  "client_id": "0d31054a-6b3a-41b8-82dd-97cd597cab1b",
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
      "id": "25ea33eb-2aee-43ba-a098-05d7814210d3",
      "at": "2026-10-30T13:02:34.790762Z",
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
  "device_ref": "sandbox-1733"
}
```

```json
{
  "challenge_id": "28a98ce8-9c61-4e75-bc3e-302692930d6f",
  "expires_at": "2026-10-30T13:07:36.184400797Z",
  "resend_available_at": "2026-10-30T13:02:37.184400797Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "760609",
  "sent_at": "2026-10-30T13:02:36.186533956Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "28a98ce8-9c61-4e75-bc3e-302692930d6f",
  "code": "760609",
  "device_ref": "sandbox-1733"
}
```

```json
{
  "session_id": "1c78aee6-804d-42f4-b112-55bb530152a4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjI1NiwiaWF0IjoxNzkzMzY1MzU2LCJqdGkiOiIxNjljYjAzMi1jZjNlLTQ1YzktOTk5My02MjY0YjQ1MTVkZDQiLCJzaWQiOiIxYzc4YWVlNi04MDRkLTQyZjQtYjExMi01NWJiNTMwMTUyYTQifQ.nWZu2iDS9ciwzKWJJG5xR1ONsr2lhOCduP8fTrkRg8E",
  "access_expires_at": "2026-10-30T13:17:36.404617395Z",
  "refresh_token": "lTFjc6sgcchiCzVAQ_DxzjfzOja9mPHeNE0UCmtDQ6E",
  "refresh_expires_at": "2026-11-29T13:02:36.404091123Z",
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
  "command_id": "e106d281-857e-4162-93c1-e4e8776b7dad",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "bdc2ff4b-4f2f-4128-b491-40bfe3a3b082",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-bdc2ff4b-4f2f-4128-b491-40bfe3a3b082",
    "orderDate": "1793365356",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "0ad0ffd9b36f94e207220ffbe69a88e0",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=bdc2ff4b-4f2f-4128-b491-40bfe3a3b082",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=bdc2ff4b-4f2f-4128-b491-40bfe3a3b082",
  "created_at": "2026-10-30T13:02:36.796364Z",
  "expires_at": "2026-10-30T13:32:36.796364Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/bdc2ff4b-4f2f-4128-b491-40bfe3a3b082` → **200**

```json
{
  "id": "bdc2ff4b-4f2f-4128-b491-40bfe3a3b082",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T13:02:36.796364Z",
  "expires_at": "2026-10-30T13:32:36.796364Z",
  "completed_at": "2026-10-30T13:02:36.992529Z",
  "masked_pan": "41****7207",
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
      "id": "6e5c5226-7544-4809-845e-7ff743838905",
      "at": "2026-10-30T13:02:37.797447Z",
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
  "command_id": "48e1ddc1-343d-435c-ad7c-7b0d879a18a0",
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
  "correlation_id": "433e993f-30c9-4490-8fad-80743174986d"
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
  "device_ref": "sandbox-2672"
}
```

```json
{
  "challenge_id": "86656f05-c6c1-478a-9c01-c696e730286a",
  "expires_at": "2026-10-30T13:07:38.797592397Z",
  "resend_available_at": "2026-10-30T13:02:39.797592397Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "229375",
  "sent_at": "2026-10-30T13:02:38.799609677Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "86656f05-c6c1-478a-9c01-c696e730286a",
  "code": "229375",
  "device_ref": "sandbox-2672"
}
```

```json
{
  "session_id": "f848f577-d0d1-44ea-9a62-8ea62d219421",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjI1OSwiaWF0IjoxNzkzMzY1MzU5LCJqdGkiOiI5N2E2ZmY2OC1jOGEyLTRlNGUtOWExMi0xNzE3OTBmMDA4Y2YiLCJzaWQiOiJmODQ4ZjU3Ny1kMGQxLTQ0ZWEtOWE2Mi04ZWE2MmQyMTk0MjEifQ.WUoAWXq8NzZ7luXkMBH6x_kfPsoUgL1Mz5iobtKB8J8",
  "access_expires_at": "2026-10-30T13:17:39.008907248Z",
  "refresh_token": "8mlBxuGmqdzzdeu3_tm38GqSDPYfV72IhaR0hxX69Vw",
  "refresh_expires_at": "2026-11-29T13:02:39.008470475Z",
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
  "command_id": "9e9dec75-b42b-4bbb-aeca-c2d40887994b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:02:39Z",
    "sequence": 1793365359393
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0a60ea29-2a41-479f-b673-a7e0fa4ade6e",
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
  "last_heartbeat_at": "2026-10-30T13:02:39.408938Z",
  "last_location_at": "2026-10-30T13:02:39.408938Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638135271",
  "device_ref": "sandbox-3233"
}
```

```json
{
  "challenge_id": "ee5247dd-9127-4b81-99a4-1f85cf89a330",
  "expires_at": "2026-10-30T13:07:39.644123348Z",
  "resend_available_at": "2026-10-30T13:02:40.644123348Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638135271` → **200**

```json
{
  "phone": "+380638135271",
  "audience": "CLIENT",
  "code": "215279",
  "sent_at": "2026-10-30T13:02:39.64624871Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ee5247dd-9127-4b81-99a4-1f85cf89a330",
  "code": "215279",
  "device_ref": "sandbox-3233"
}
```

```json
{
  "session_id": "0d9112ff-2fa0-4733-87b3-70a486769bc8",
  "subject": {
    "type": "CLIENT",
    "id": "f4ae0aa4-1668-4b1d-925b-bcab423f9b9c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNGFlMGFhNC0xNjY4LTRiMWQtOTI1Yi1iY2FiNDIzZjliOWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MjU5LCJpYXQiOjE3OTMzNjUzNTksImp0aSI6ImY4MDY5NjNjLWY5MDktNGQzMy1hOTlkLTk3OTdhNTFmMWQ2MCIsInNpZCI6IjBkOTExMmZmLTJmYTAtNDczMy04N2IzLTcwYTQ4Njc2OWJjOCJ9.pSpgozxyhw5vRL2zlpr7pipH1KnNoyOqK1Bzf3wgKQY",
  "access_expires_at": "2026-10-30T13:17:39.899774963Z",
  "refresh_token": "itF7lmkKtfdgOzuTEB8JO4HkOL_tTgZZ_R_s6jT3xGY",
  "refresh_expires_at": "2026-11-29T13:02:39.89943505Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c6420dbc-35f7-486a-bb14-4fa242214488",
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
  "id": "4c8dfa02-5dd3-4d15-a50b-753e555de7f1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:07:40.100383Z",
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
  "command_id": "58c27d70-96ca-4592-b5d7-766e6c63b20c",
  "quote_id": "4c8dfa02-5dd3-4d15-a50b-753e555de7f1",
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
  "id": "f089e6e6-8b8d-4932-b0a3-aa2a087bc994",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f4ae0aa4-1668-4b1d-925b-bcab423f9b9c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:02:40.302276Z",
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
    "id": "f20dddda-6b76-4d15-bad3-478471ae69f4",
    "order_id": "f089e6e6-8b8d-4932-b0a3-aa2a087bc994",
    "expires_at": "2026-10-30T13:02:55.304838Z",
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

`POST /api/driver/v1/offers/f20dddda-6b76-4d15-bad3-478471ae69f4/accept` → **200**

```json
{
  "command_id": "0f422d8b-e4ea-408e-9547-06f6d1084f79"
}
```

```json
{
  "id": "eb102ff1-f05b-45e6-bb1e-8194ace17adf",
  "order_id": "f089e6e6-8b8d-4932-b0a3-aa2a087bc994",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "71069e55-a745-4868-b3cb-fd6410a96be6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "71069e55-a745-4868-b3cb-fd6410a96be6",
  "order_id": "f089e6e6-8b8d-4932-b0a3-aa2a087bc994",
  "assignment_id": "eb102ff1-f05b-45e6-bb1e-8194ace17adf",
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

`POST /api/driver/v1/work-sessions/0a60ea29-2a41-479f-b673-a7e0fa4ade6e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:02:41Z",
    "sequence": 1793365361115
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0a60ea29-2a41-479f-b673-a7e0fa4ade6e",
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
  "last_heartbeat_at": "2026-10-30T13:02:41.130659Z",
  "last_location_at": "2026-10-30T13:02:41.130659Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/71069e55-a745-4868-b3cb-fd6410a96be6/arrive` → **200**

```json
{
  "command_id": "3ac18536-fc76-40cc-b24b-ae5950e41eac",
  "expected_version": 0
}
```

```json
{
  "id": "71069e55-a745-4868-b3cb-fd6410a96be6",
  "order_id": "f089e6e6-8b8d-4932-b0a3-aa2a087bc994",
  "assignment_id": "eb102ff1-f05b-45e6-bb1e-8194ace17adf",
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
  "arrived_at": "2026-10-30T13:02:41.329952Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/71069e55-a745-4868-b3cb-fd6410a96be6/start` → **200**

```json
{
  "command_id": "ce4bbedb-b67a-4fc4-936c-1e10141a99e4",
  "expected_version": 1
}
```

```json
{
  "id": "71069e55-a745-4868-b3cb-fd6410a96be6",
  "order_id": "f089e6e6-8b8d-4932-b0a3-aa2a087bc994",
  "assignment_id": "eb102ff1-f05b-45e6-bb1e-8194ace17adf",
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
  "arrived_at": "2026-10-30T13:02:41.329952Z",
  "started_at": "2026-10-30T13:02:41.529732Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/71069e55-a745-4868-b3cb-fd6410a96be6/complete` → **200**

```json
{
  "command_id": "cb574547-5a06-4003-83d1-4d5aca2caf8c",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:02:41Z",
  "cash_received": false
}
```

```json
{
  "id": "71069e55-a745-4868-b3cb-fd6410a96be6",
  "order_id": "f089e6e6-8b8d-4932-b0a3-aa2a087bc994",
  "assignment_id": "eb102ff1-f05b-45e6-bb1e-8194ace17adf",
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
  "arrived_at": "2026-10-30T13:02:41.329952Z",
  "started_at": "2026-10-30T13:02:41.529732Z",
  "completed_at": "2026-10-30T13:02:41.741501Z",
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
  "session_id": "10363e60-6eca-495d-adaa-7d1e0def895a",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyNjIsImlhdCI6MTc5MzM2NTM2MiwianRpIjoiOTQyZTE4ZTUtNTRlZi00MDM5LWE4NGYtY2ZhZGIxZjI4ZTk4Iiwic2lkIjoiMTAzNjNlNjAtNmVjYS00OTVkLWFkYWEtN2QxZTBkZWY4OTVhIn0._y8fMAw-f_ZIeEhg1qAfq8X6u9CSrrpQZRxjBDJ2638",
  "access_expires_at": "2026-10-30T13:17:42.16070611Z",
  "refresh_token": "UNtYL1wrG_wAwRMl8UnJaZQOxRsLffZ5xY1NSFxx2Hk",
  "refresh_expires_at": "2026-10-31T01:02:42.160305546Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/f089e6e6-8b8d-4932-b0a3-aa2a087bc994/cash-dispute` → **200**

```json
{
  "order_id": "f089e6e6-8b8d-4932-b0a3-aa2a087bc994",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "f4ae0aa4-1668-4b1d-925b-bcab423f9b9c",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T13:02:41.8576Z",
  "decide_by": "2026-11-13T13:02:41.8576Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T13:02:41.8576Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "f089e6e6-8b8d-4932-b0a3-aa2a087bc994",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "f4ae0aa4-1668-4b1d-925b-bcab423f9b9c",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T13:02:41.8576Z",
      "decide_by": "2026-11-13T13:02:41.8576Z",
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

`POST /api/admin/v1/orders/f089e6e6-8b8d-4932-b0a3-aa2a087bc994/cash-dispute/decide` → **400**

```json
{
  "command_id": "82d3c7d2-004c-40f8-898a-1a1869f10123",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/f089e6e6-8b8d-4932-b0a3-aa2a087bc994/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "352b6b5d-ddf5-4ceb-bcaa-3c179757bcc5",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/f089e6e6-8b8d-4932-b0a3-aa2a087bc994/cash-dispute/decide` → **200**

```json
{
  "command_id": "922139b1-e024-4e90-accf-3f65b9de536a",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "f089e6e6-8b8d-4932-b0a3-aa2a087bc994",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "f4ae0aa4-1668-4b1d-925b-bcab423f9b9c",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T13:02:41.8576Z",
  "decide_by": "2026-11-13T13:02:41.8576Z",
  "decision": "PAY_DRIVER",
  "decided_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T13:02:42.990221Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/f089e6e6-8b8d-4932-b0a3-aa2a087bc994/cash-dispute/decide` → **409**

```json
{
  "command_id": "a439567f-c3ff-4b75-aa0e-80955d5e048d",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/f089e6e6-8b8d-4932-b0a3-aa2a087bc994/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "325d17e2-dff6-4ae1-9c11-80864930d2ae"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0a60ea29-2a41-479f-b673-a7e0fa4ade6e",
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
  "last_heartbeat_at": "2026-10-30T13:02:41.130659Z",
  "last_location_at": "2026-10-30T13:02:41.130659Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0a60ea29-2a41-479f-b673-a7e0fa4ade6e/close` → **200**

```json
{
  "command_id": "2acfce80-6f6a-455a-bcd2-af31d2424d0d",
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
  "phone": "+380737182917",
  "device_ref": "sandbox-10311"
}
```

```json
{
  "challenge_id": "2d9e11c9-b199-45bf-a9d3-63e1d39c09cc",
  "expires_at": "2026-10-30T13:07:43.828964858Z",
  "resend_available_at": "2026-10-30T13:02:44.828964858Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737182917` → **200**

```json
{
  "phone": "+380737182917",
  "audience": "CLIENT",
  "code": "673164",
  "sent_at": "2026-10-30T13:02:43.832768057Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2d9e11c9-b199-45bf-a9d3-63e1d39c09cc",
  "code": "673164",
  "device_ref": "sandbox-10311"
}
```

```json
{
  "session_id": "0ea56085-c8da-4e60-92d3-e27a6bb72600",
  "subject": {
    "type": "CLIENT",
    "id": "ae487dcc-9dc1-4837-8864-e33cea4ac028"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZTQ4N2RjYy05ZGMxLTQ4MzctODg2NC1lMzNjZWE0YWMwMjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MjY0LCJpYXQiOjE3OTMzNjUzNjQsImp0aSI6IjRjNzllYWNkLTYxYTgtNDE2NC04ZjA5LTgzMjQxZTNjOTg2ZSIsInNpZCI6IjBlYTU2MDg1LWM4ZGEtNGU2MC05MmQzLWUyN2E2YmI3MjYwMCJ9.W24RLhtXFaVLXK79nvbi_7alsEGqTREiZin7CL4rdLE",
  "access_expires_at": "2026-10-30T13:17:44.042916242Z",
  "refresh_token": "bKMKPzIuEw8RfIR-5UZqNZWsYLIQz940sAgJVMiyvQA",
  "refresh_expires_at": "2026-11-29T13:02:44.042536649Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "eba2e63c-eb84-4137-8e8e-dd7adb3fec6c",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "566fcad0-85a1-45ce-b70b-a593b555056f",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-566fcad0-85a1-45ce-b70b-a593b555056f",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "26dec674e84551ab7e62be90cdc0fcaf",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=566fcad0-85a1-45ce-b70b-a593b555056f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737182917"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=566fcad0-85a1-45ce-b70b-a593b555056f",
  "expires_at": "2026-10-30T13:32:44.254104Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/566fcad0-85a1-45ce-b70b-a593b555056f` → **200**

```json
{
  "id": "566fcad0-85a1-45ce-b70b-a593b555056f",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:32:44.254104Z",
  "card": {
    "id": "dbc75f8c-f0e8-46b9-9c78-5113ba7fb8cb",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0301",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:02:44.480298Z"
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
  "device_ref": "sandbox-19721"
}
```

```json
{
  "challenge_id": "5d2408a0-43d7-4c39-9bdb-3de16feebe99",
  "expires_at": "2026-10-30T13:07:44.693693674Z",
  "resend_available_at": "2026-10-30T13:02:45.693693674Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "448897",
  "sent_at": "2026-10-30T13:02:44.695689144Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d2408a0-43d7-4c39-9bdb-3de16feebe99",
  "code": "448897",
  "device_ref": "sandbox-19721"
}
```

```json
{
  "session_id": "5c384723-ec67-40bc-9fbe-fe5ff022e75b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjI2NCwiaWF0IjoxNzkzMzY1MzY0LCJqdGkiOiI0OTYyOTkxMi0xNTI1LTQ0ZjQtYjc4ZC01MWIzMzgyNGRkNzEiLCJzaWQiOiI1YzM4NDcyMy1lYzY3LTQwYmMtOWZiZS1mZTVmZjAyMmU3NWIifQ.JV9XqdpCvOtiqd0B0QqS4aWgcV5ZrhC_OJJrdTnHMSg",
  "access_expires_at": "2026-10-30T13:17:44.915126114Z",
  "refresh_token": "6Lq-g4cYf40ox5IuLtWg8PY_YM9f_d294eKosgRi8iQ",
  "refresh_expires_at": "2026-11-29T13:02:44.914588327Z",
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
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
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
  "command_id": "563d8a4d-6dc0-4ff7-b9b4-f7c1e94cd204",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:02:45Z",
    "sequence": 1793365365313
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7203e6f9-0d1a-4700-811e-b8d033b1a38c",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T13:02:45.329713Z",
  "last_location_at": "2026-10-30T13:02:45.329713Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "55cf2de8-c7f8-430b-b9ac-22ecd27679fd",
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
  "id": "c5c5ecef-9a1d-44eb-936e-f4c8cceac64c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:07:45.547018Z",
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

`POST /api/rider/v1/orders` → **202**

```json
{
  "command_id": "d02c2755-ac2e-49f8-9c56-11992646a5c4",
  "quote_id": "c5c5ecef-9a1d-44eb-936e-f4c8cceac64c",
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
  "id": "c4294132-e097-4ce1-a5a9-dda2e0d61e50",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ae487dcc-9dc1-4837-8864-e33cea4ac028",
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
  "created_at": "2026-10-30T13:02:45.75144Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c4294132-e097-4ce1-a5a9-dda2e0d61e50` → **200**

```json
{
  "id": "c4294132-e097-4ce1-a5a9-dda2e0d61e50",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ae487dcc-9dc1-4837-8864-e33cea4ac028",
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
  "created_at": "2026-10-30T13:02:45.75144Z",
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
    "id": "a56587f2-dbb4-4369-b2c8-fe1b27bbf5b0",
    "order_id": "308b6c6a-587a-414b-bd3c-cb2c94d6cc25",
    "expires_at": "2026-10-30T13:02:48.171443Z",
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

`POST /api/driver/v1/offers/a56587f2-dbb4-4369-b2c8-fe1b27bbf5b0/accept` → **200**

```json
{
  "command_id": "ccc56755-3b0b-4f42-a397-faa176613958"
}
```

```json
{
  "id": "1f336d50-41a0-4da7-9882-99e693912e23",
  "order_id": "308b6c6a-587a-414b-bd3c-cb2c94d6cc25",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "02f535a8-14e0-4c1a-a07a-d653b959b3a1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "02f535a8-14e0-4c1a-a07a-d653b959b3a1",
  "order_id": "308b6c6a-587a-414b-bd3c-cb2c94d6cc25",
  "assignment_id": "1f336d50-41a0-4da7-9882-99e693912e23",
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

`POST /api/rider/v1/orders/c4294132-e097-4ce1-a5a9-dda2e0d61e50/messages` → **409**

```json
{
  "command_id": "59452830-ff31-419d-af48-15a67076db65",
  "body": "Я біля входу, мій номер +380737182917, картка 4111 1111 1111 1111"
}
```

```json
{
  "instance": "/api/rider/v1/orders/c4294132-e097-4ce1-a5a9-dda2e0d61e50/messages",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7748bf0c-1c23-487f-a4a7-9349815d612d"
}
```

**Expected 201, got 409 — scenario stopped.**

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7203e6f9-0d1a-4700-811e-b8d033b1a38c",
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
  "last_heartbeat_at": "2026-10-30T13:02:45.329713Z",
  "last_location_at": "2026-10-30T13:02:45.329713Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/7203e6f9-0d1a-4700-811e-b8d033b1a38c/close` → **200**

```json
{
  "command_id": "89ef0030-ae29-41ac-b894-1a15529ecc3f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7203e6f9-0d1a-4700-811e-b8d033b1a38c",
  "session_version": 1,
  "session_state": "CLOSING",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T13:02:45.329713Z",
  "last_location_at": "2026-10-30T13:02:45.329713Z",
  "eligible": false,
  "ineligible_reasons": [
    "SESSION_CLOSING",
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
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
  "session_id": "a0351c61-3810-4ed9-997c-49fff1660ace",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyNjcsImlhdCI6MTc5MzM2NTM2NywianRpIjoiZGViZjE5NmItNGQ0ZS00ZTQ2LTk0ZjktOTE4NGNlZjI5YWI2Iiwic2lkIjoiYTAzNTFjNjEtMzgxMC00ZWQ5LTk5N2MtNDlmZmYxNjYwYWNlIn0.ajItQ_LBqTc48HrYd0e0GxqbBW9WFQNpHI6wznPeVaY",
  "access_expires_at": "2026-10-30T13:17:47.572180029Z",
  "refresh_token": "94u1XTTzwImVwWH1_kxtGWr_yrbigFHkokUVZGGfutA",
  "refresh_expires_at": "2026-10-31T01:02:47.571417489Z",
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
  "phone": "+48600745272",
  "device_ref": "sandbox-23054"
}
```

```json
{
  "challenge_id": "288644e2-1574-4d1a-8310-dbbefca396f6",
  "expires_at": "2026-10-30T13:07:48.160654745Z",
  "resend_available_at": "2026-10-30T13:02:49.160654745Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600745272` → **200**

```json
{
  "phone": "+48600745272",
  "audience": "CLIENT",
  "code": "752031",
  "sent_at": "2026-10-30T13:02:48.162495252Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "288644e2-1574-4d1a-8310-dbbefca396f6",
  "code": "752031",
  "device_ref": "sandbox-23054"
}
```

```json
{
  "session_id": "380a167f-9c6b-47ef-b612-fa9ba86b4577",
  "subject": {
    "type": "CLIENT",
    "id": "b1a02992-103f-4b30-9ad1-151ddcf4a8e1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMWEwMjk5Mi0xMDNmLTRiMzAtOWFkMS0xNTFkZGNmNGE4ZTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MjY4LCJpYXQiOjE3OTMzNjUzNjgsImp0aSI6ImUzODg4ZWI0LTY4OTQtNGEzYy1hNTViLWVlZWViZjU5ZWU0MCIsInNpZCI6IjM4MGExNjdmLTljNmItNDdlZi1iNjEyLWZhOWJhODZiNDU3NyJ9.unu5FWrWoVu1x7RAcS-vgedvNOzRL84bRyP8SmCRzhM",
  "access_expires_at": "2026-10-30T13:17:48.364482756Z",
  "refresh_token": "4ClFpLD9EAXXoZr7Ah2zkYBQT1xv4nsQmDg6a-lspgA",
  "refresh_expires_at": "2026-11-29T13:02:48.364089905Z",
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
  "command_id": "4acd5d4e-07f2-4e06-bd51-a00bd3a016d2",
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
  "correlation_id": "5b2b2613-11cf-472d-b660-a255f7cef6bd",
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
  "command_id": "6be823b8-d72a-429d-961a-d8f114ed453d",
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
  "paused_at": "2026-10-30T13:02:49.107120822Z",
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
  "command_id": "5a76b567-193c-47f3-8d76-1bb3e783fd9e",
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
  "id": "4183dc83-59ea-4c22-92e4-63049061fa0f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:07:49.516131Z",
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
  "command_id": "b4f556e3-3bb5-4b03-979f-fe3642815280",
  "quote_id": "4183dc83-59ea-4c22-92e4-63049061fa0f",
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
  "correlation_id": "2a7afe8e-8fb7-49ea-af43-c45016cffe37"
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
  "paused_at": "2026-10-30T13:02:49.107121Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "13712a1b-6797-4e75-9152-2b5b4ad4566c",
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
  "command_id": "c8381117-888c-4211-b2bc-5bfc9ad67e91",
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
  "command_id": "2896963e-1c7c-4428-bc5c-b88a47d37e0a",
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
  "id": "b9115173-4d93-4493-b4ef-7c6973bd01c9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:07:50.725386Z",
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
  "command_id": "2b6cef73-9f49-4a19-91ef-e9ac13389a91",
  "quote_id": "b9115173-4d93-4493-b4ef-7c6973bd01c9",
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
  "correlation_id": "7d602ed2-f76d-4b1e-96bf-e2ef219c7813"
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
  "command_id": "0ad30654-c21f-4dd9-8ebd-1ab74229e632",
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
  "command_id": "fcf6d1d8-e33c-4db8-a5bd-5bfafeb004c5",
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
  "id": "ddf3d2f7-87bc-44cd-8bf1-5c1ab3f9d56c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:07:51.510419Z",
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
  "command_id": "9cd761e9-7bc9-4697-9d0b-e543634f2b5d",
  "quote_id": "ddf3d2f7-87bc-44cd-8bf1-5c1ab3f9d56c",
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
  "correlation_id": "fac9e85a-f5da-49dc-a2d8-1540e3b448a2"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "01d2d7e8-5eed-4566-8f0b-0debb41f9fcf",
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
  "correlation_id": "611f5579-bc75-4fa6-82be-45f5a8fa2044",
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
  "command_id": "52e3dc8f-c262-4f6a-a375-58ab25bbcb24",
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
  "phone": "+380673494121",
  "device_ref": "sandbox-19049"
}
```

```json
{
  "challenge_id": "290cab10-bc0f-4535-8474-09e2a5615d2b",
  "expires_at": "2026-10-30T13:07:52.511124012Z",
  "resend_available_at": "2026-10-30T13:02:53.511124012Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673494121` → **200**

```json
{
  "phone": "+380673494121",
  "audience": "CLIENT",
  "code": "560848",
  "sent_at": "2026-10-30T13:02:52.513221487Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "290cab10-bc0f-4535-8474-09e2a5615d2b",
  "code": "560848",
  "device_ref": "sandbox-19049"
}
```

```json
{
  "session_id": "23d94572-499c-4f15-a80c-14a01298b14c",
  "subject": {
    "type": "CLIENT",
    "id": "3d877217-d93b-45c5-8b49-d29bc5c38edd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZDg3NzIxNy1kOTNiLTQ1YzUtOGI0OS1kMjliYzVjMzhlZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MjcyLCJpYXQiOjE3OTMzNjUzNzIsImp0aSI6IjJiYTU2ZjA2LTU0MmItNDk1Yy05NWM5LWMwMTZiYmM3YzYyOSIsInNpZCI6IjIzZDk0NTcyLTQ5OWMtNGYxNS1hODBjLTE0YTAxMjk4YjE0YyJ9.kAWXq9F3Xy3PrsqrCImWpxMXhIhlb2OxreKs2XErVzI",
  "access_expires_at": "2026-10-30T13:17:52.715536377Z",
  "refresh_token": "l-9x4nXPsT9VdATXQRd-p0GwbdWk2PdlbKX1njoss6I",
  "refresh_expires_at": "2026-11-29T13:02:52.715102759Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3d877217-d93b-45c5-8b49-d29bc5c38edd",
  "session_id": "23d94572-499c-4f15-a80c-14a01298b14c",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4b70b379-c035-4aeb-b00d-35c9882900e0",
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
  "id": "d9958cc9-3d61-4e80-8411-408a46cc4f17",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:07:53.082597Z",
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
  "challenge_id": "758b0d2b-ac27-45f8-a790-8c9bb5d835a6",
  "expires_at": "2026-10-30T13:07:55.282249028Z",
  "resend_available_at": "2026-10-30T13:02:56.282249028Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673494121` → **200**

```json
{
  "phone": "+380673494121",
  "audience": "CLIENT",
  "code": "869494",
  "sent_at": "2026-10-30T13:02:55.283986145Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "322343cf-ef44-418c-8989-5325e5e2b7f8",
  "challenge_id": "758b0d2b-ac27-45f8-a790-8c9bb5d835a6",
  "otp_code": "869494"
}
```

```json
{
  "client_id": "3d877217-d93b-45c5-8b49-d29bc5c38edd",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T13:02:55.499850998Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "ffb5ff8c-03c8-4512-a447-4d5a746f7018",
  "quote_id": "d9958cc9-3d61-4e80-8411-408a46cc4f17",
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
  "correlation_id": "614dd1f3-f696-4ebf-8f7a-895f055b0fdc"
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
  "session_id": "03df3799-5917-4d90-b0f6-b1121c75d7f1",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyNzYsImlhdCI6MTc5MzM2NTM3NiwianRpIjoiMWU1ZjJlOGEtNDEzMy00OWEwLTg3MGYtYTUwNjhjNTBlNDZhIiwic2lkIjoiMDNkZjM3OTktNTkxNy00ZDkwLWIwZjYtYjExMjFjNzVkN2YxIn0.tf5VLTcFX52KYxsAJucfSMHz10tLlgnLrv_yPxvJSK0",
  "access_expires_at": "2026-10-30T13:17:56.095158078Z",
  "refresh_token": "kSsO1LPKrxbl_lMLWKNPIWGQ95c_qZDZxnJg7VR1BDU",
  "refresh_expires_at": "2026-10-31T01:02:56.094792266Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "3d877217-d93b-45c5-8b49-d29bc5c38edd",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T13:02:55.499851Z",
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

`POST /api/admin/v1/client-deletions/3d877217-d93b-45c5-8b49-d29bc5c38edd/complete` → **200**

```json
{
  "command_id": "46dedea1-4f4b-4c3d-8c3f-32727949d407",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "3d877217-d93b-45c5-8b49-d29bc5c38edd",
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
  "correlation_id": "833b03a2-6080-4ae3-9751-cc591ae7bb51"
}
```

Done: client 3d877217-d93b-45c5-8b49-d29bc5c38edd anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667644636",
  "device_ref": "sandbox-21810"
}
```

```json
{
  "challenge_id": "a7360050-5d9c-470f-a144-be3f0b0f6a1c",
  "expires_at": "2026-10-30T13:07:56.870420731Z",
  "resend_available_at": "2026-10-30T13:02:57.870420731Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667644636` → **200**

```json
{
  "phone": "+380667644636",
  "audience": "CLIENT",
  "code": "422927",
  "sent_at": "2026-10-30T13:02:56.872519984Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7360050-5d9c-470f-a144-be3f0b0f6a1c",
  "code": "422927",
  "device_ref": "sandbox-21810"
}
```

```json
{
  "session_id": "386c5fec-7a5d-405c-8457-831aaf6253b6",
  "subject": {
    "type": "CLIENT",
    "id": "fbe7fe10-cb31-471f-88f7-4567932e8201"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYmU3ZmUxMC1jYjMxLTQ3MWYtODhmNy00NTY3OTMyZTgyMDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2Mjc3LCJpYXQiOjE3OTMzNjUzNzcsImp0aSI6ImJhNzgyMWE1LWMwOTItNGEyOS1iNDhkLTlkNDM3MGE4MmMyOSIsInNpZCI6IjM4NmM1ZmVjLTdhNWQtNDA1Yy04NDU3LTgzMWFhZjYyNTNiNiJ9.9Mtu-iAVb9cb3fhmqLDmxAoISC6YkCWDd2gS8WjndUk",
  "access_expires_at": "2026-10-30T13:17:57.084934062Z",
  "refresh_token": "UMrqAbUZ1QuOq_JDstgokrFVKvokjdwMgnRyVDpk6Pc",
  "refresh_expires_at": "2026-11-29T13:02:57.084540739Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fbe7fe10-cb31-471f-88f7-4567932e8201",
  "session_id": "386c5fec-7a5d-405c-8457-831aaf6253b6",
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
  "session_id": "4ede6039-33a2-4d43-94c6-eea9bda9520f",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyNzcsImlhdCI6MTc5MzM2NTM3NywianRpIjoiNTI5OWU0NjUtMTM2Mi00NzQ0LWI1OWQtNjVlMzljNDY3Mjc4Iiwic2lkIjoiNGVkZTYwMzktMzNhMi00ZDQzLTk0YzYtZWVhOWJkYTk1MjBmIn0.7Y1vCvUJPHOZnvV6nfsTOlqZ0z1k8NTSG4mRTjP5spk",
  "access_expires_at": "2026-10-30T13:17:57.753602021Z",
  "refresh_token": "JfBtzxBFRFv6oD-bI2-4L3BzDNk0he4MVQqu3NBMrXs",
  "refresh_expires_at": "2026-10-31T01:02:57.753225404Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=7644636&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "fbe7fe10-cb31-471f-88f7-4567932e8201",
      "phone": "+380667644636",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T13:02:57.083168Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/fbe7fe10-cb31-471f-88f7-4567932e8201` → **200**

```json
{
  "client": {
    "id": "fbe7fe10-cb31-471f-88f7-4567932e8201",
    "phone": "+380667644636",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:02:57.083168Z",
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

`POST /api/admin/v1/clients/fbe7fe10-cb31-471f-88f7-4567932e8201/block` → **400**

```json
{
  "command_id": "77b3dd5c-01a5-41ad-8245-2d8121085e1c",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/fbe7fe10-cb31-471f-88f7-4567932e8201/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7ba663eb-0eb9-47ec-8647-e573061e0a02",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/fbe7fe10-cb31-471f-88f7-4567932e8201/block` → **200**

```json
{
  "command_id": "3037b7b6-8c8d-47ac-af59-82a8fb32f95b",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "fbe7fe10-cb31-471f-88f7-4567932e8201",
  "phone": "+380667644636",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T13:02:57.083168Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T13:02:58.589208Z",
    "by": "87983110-3c7f-42d1-8f17-34a004597065"
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
  "correlation_id": "a18613c6-9c99-4acc-b986-86dc02fd920b"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667644636",
  "device_ref": "sandbox-4747"
}
```

```json
{
  "challenge_id": "dbb8f529-f6ef-4fbf-986d-b99617c93d51",
  "expires_at": "2026-10-30T13:08:00.986006809Z",
  "resend_available_at": "2026-10-30T13:03:01.986006809Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667644636` → **200**

```json
{
  "phone": "+380667644636",
  "audience": "CLIENT",
  "code": "466991",
  "sent_at": "2026-10-30T13:03:00.98813196Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "dbb8f529-f6ef-4fbf-986d-b99617c93d51",
  "code": "466991",
  "device_ref": "sandbox-4747"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "8681a896-c978-4987-8574-51abc6899c9a"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/fbe7fe10-cb31-471f-88f7-4567932e8201` → **200**

```json
{
  "client": {
    "id": "fbe7fe10-cb31-471f-88f7-4567932e8201",
    "phone": "+380667644636",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T13:02:57.083168Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T13:02:58.589208Z",
      "by": "87983110-3c7f-42d1-8f17-34a004597065"
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

`POST /api/admin/v1/clients/fbe7fe10-cb31-471f-88f7-4567932e8201/unblock` → **200**

```json
{
  "command_id": "88218910-cb96-4b2c-8a0a-e05e0a2aedb2",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "fbe7fe10-cb31-471f-88f7-4567932e8201",
  "phone": "+380667644636",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T13:02:57.083168Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667644636",
  "device_ref": "sandbox-2658"
}
```

```json
{
  "challenge_id": "017ff542-7328-48a0-a4da-d13a3a6ed3f7",
  "expires_at": "2026-10-30T13:08:03.792000679Z",
  "resend_available_at": "2026-10-30T13:03:04.792000679Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667644636` → **200**

```json
{
  "phone": "+380667644636",
  "audience": "CLIENT",
  "code": "453606",
  "sent_at": "2026-10-30T13:03:03.794757373Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "017ff542-7328-48a0-a4da-d13a3a6ed3f7",
  "code": "453606",
  "device_ref": "sandbox-2658"
}
```

```json
{
  "session_id": "f0e734d3-3120-4557-b1c3-70a5bf2aa033",
  "subject": {
    "type": "CLIENT",
    "id": "fbe7fe10-cb31-471f-88f7-4567932e8201"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYmU3ZmUxMC1jYjMxLTQ3MWYtODhmNy00NTY3OTMyZTgyMDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2Mjg0LCJpYXQiOjE3OTMzNjUzODQsImp0aSI6Ijg0OGEyZTUyLWU0NjYtNDg0Mi04OWQ1LTFmYTdkZDNjMzdmNiIsInNpZCI6ImYwZTczNGQzLTMxMjAtNDU1Ny1iMWMzLTcwYTViZjJhYTAzMyJ9.4wkk4ZoXRs0CCGMikUq3dZ69C4tFfXZwC2kkE827RKc",
  "access_expires_at": "2026-10-30T13:18:04.004835479Z",
  "refresh_token": "xbGm6hndE6z2uHch0eu9CbOb7fjbi_4L_z4GDKIcTds",
  "refresh_expires_at": "2026-11-29T13:03:04.004380894Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fbe7fe10-cb31-471f-88f7-4567932e8201",
  "session_id": "f0e734d3-3120-4557-b1c3-70a5bf2aa033",
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
  "phone": "+380667856317",
  "device_ref": "sandbox-26686"
}
```

```json
{
  "challenge_id": "1744c162-1a22-4670-b2ae-53af96628c31",
  "expires_at": "2026-10-30T13:08:04.376818039Z",
  "resend_available_at": "2026-10-30T13:03:05.376818039Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667856317` → **200**

```json
{
  "phone": "+380667856317",
  "audience": "CLIENT",
  "code": "045085",
  "sent_at": "2026-10-30T13:03:04.378693655Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1744c162-1a22-4670-b2ae-53af96628c31",
  "code": "045085",
  "device_ref": "sandbox-26686"
}
```

```json
{
  "session_id": "4b61c0ac-9ae3-4082-9842-86e06891ae35",
  "subject": {
    "type": "CLIENT",
    "id": "e8e6e761-77a7-4996-ba64-6f8229666283"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOGU2ZTc2MS03N2E3LTQ5OTYtYmE2NC02ZjgyMjk2NjYyODMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2Mjg0LCJpYXQiOjE3OTMzNjUzODQsImp0aSI6IjlkZTE0NmZjLWNjNmItNGE4OS1iNGM3LTM5ZmE5ZDE2MzVjMiIsInNpZCI6IjRiNjFjMGFjLTlhZTMtNDA4Mi05ODQyLTg2ZTA2ODkxYWUzNSJ9.HPQaovqBkuHuJPimpFKHXHOaguc5g-LQFWoKjOPRLX0",
  "access_expires_at": "2026-10-30T13:18:04.590212522Z",
  "refresh_token": "U5WEn-yfcNidf0HwevQy4QlNHuWN6Mx5Hqo12SA8PkQ",
  "refresh_expires_at": "2026-11-29T13:03:04.589794562Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "53ec9976-1418-4f15-9772-fd60e5b829ae",
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
  "id": "14efc12f-44da-4eab-a833-7ebe15688aed",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:08:04.779947Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 4998aad9-1674-4e5d-9448-41d6b4d8ef84) → **201**

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
  "session_id": "3b15eb9d-59ee-4670-9bd2-8e2d4d53dc6d",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyODUsImlhdCI6MTc5MzM2NTM4NSwianRpIjoiMDk4ZDhiYWEtMDk0Mi00YWU4LWEyYjAtMzMzNDJhNTJkMGI0Iiwic2lkIjoiM2IxNWViOWQtNTllZS00NjcwLTliZDItOGUyZDRkNTNkYzZkIn0.dtNmUjqD2H6a_0IZpX73uSaGlZiavAw3FBc7hyqU1IY",
  "access_expires_at": "2026-10-30T13:18:05.185547911Z",
  "refresh_token": "flzLKFjUBn6lLX7g4HwKNVqpkurGH0g4ooqw3kmM5hc",
  "refresh_expires_at": "2026-10-31T01:03:05.185094227Z",
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
  "session_id": "7c21a7e6-fb91-4764-9ef3-67fe9469f84b",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyODUsImlhdCI6MTc5MzM2NTM4NSwianRpIjoiYTc2M2FiZjItMWVkYi00NGI4LWE1NmQtNGUzOTE5ZTZkYTcxIiwic2lkIjoiN2MyMWE3ZTYtZmI5MS00NzY0LTllZjMtNjdmZTk0NjlmODRiIn0.5SuPgAbdqbkTN0k5ahYpIlEetvRybjrAvsEsZki6_eM",
  "access_expires_at": "2026-10-30T13:18:05.566805437Z",
  "refresh_token": "Tg7azFCYcLTIZrc6mF_0HVQoYd0nu-qO5LlYXilm7g8",
  "refresh_expires_at": "2026-10-31T01:03:05.566393727Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/81870da4-3b77-4ef2-a618-089db2f0d63a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:03:04.966581Z",
      "actor": {
        "type": "CLIENT",
        "id": "e8e6e761-77a7-4996-ba64-6f8229666283",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "81870da4-3b77-4ef2-a618-089db2f0d63a",
        "quote_id": "14efc12f-44da-4eab-a833-7ebe15688aed",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "4998aad9-1674-4e5d-9448-41d6b4d8ef84"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:03:04.967502Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "81870da4-3b77-4ef2-a618-089db2f0d63a",
        "attempt_id": "7aeca113-195a-42e6-9ad4-b80bcb87a824",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "4998aad9-1674-4e5d-9448-41d6b4d8ef84"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T13:03:04.969164Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "81870da4-3b77-4ef2-a618-089db2f0d63a",
        "attempt_id": "7aeca113-195a-42e6-9ad4-b80bcb87a824"
      },
      "correlation_id": "4998aad9-1674-4e5d-9448-41d6b4d8ef84"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "7aeca113-195a-42e6-9ad4-b80bcb87a824",
        "generation": 1,
        "started_at": "2026-10-30T13:03:04.96706Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T13:03:04.969164Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T13:03:04.967822Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/4998aad9-1674-4e5d-9448-41d6b4d8ef84` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "81870da4-3b77-4ef2-a618-089db2f0d63a:0",
      "order_id": "81870da4-3b77-4ef2-a618-089db2f0d63a",
      "at": "2026-10-30T13:03:04.966581Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "81870da4-3b77-4ef2-a618-089db2f0d63a:1",
      "order_id": "81870da4-3b77-4ef2-a618-089db2f0d63a",
      "at": "2026-10-30T13:03:04.967502Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "81870da4-3b77-4ef2-a618-089db2f0d63a:2",
      "order_id": "81870da4-3b77-4ef2-a618-089db2f0d63a",
      "at": "2026-10-30T13:03:04.969164Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/c0ae7ba1-5992-40dc-b0a5-737a252f6867` → **200**

```json
{
  "found": []
}
```

Done: request 4998aad9-1674-4e5d-9448-41d6b4d8ef84 — order 81870da4-3b77-4ef2-a618-089db2f0d63a found by its id.

`GET /api/rider/v1/orders/81870da4-3b77-4ef2-a618-089db2f0d63a` → **200**

```json
{
  "id": "81870da4-3b77-4ef2-a618-089db2f0d63a",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8e6e761-77a7-4996-ba64-6f8229666283",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:03:04.96627Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/81870da4-3b77-4ef2-a618-089db2f0d63a/cancel` → **200**

```json
{
  "command_id": "87bd8437-bd06-4838-8f12-c98107582892",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "81870da4-3b77-4ef2-a618-089db2f0d63a",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e8e6e761-77a7-4996-ba64-6f8229666283",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:03:04.96627Z",
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
  "phone": "+380635893508",
  "device_ref": "sandbox-26803"
}
```

```json
{
  "challenge_id": "ff0a67e2-0321-4103-9fdb-3ea0865ad11d",
  "expires_at": "2026-10-30T13:08:06.77675453Z",
  "resend_available_at": "2026-10-30T13:03:07.77675453Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635893508` → **200**

```json
{
  "phone": "+380635893508",
  "audience": "CLIENT",
  "code": "519291",
  "sent_at": "2026-10-30T13:03:06.778753261Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ff0a67e2-0321-4103-9fdb-3ea0865ad11d",
  "code": "519291",
  "device_ref": "sandbox-26803"
}
```

```json
{
  "session_id": "dcaac979-27a8-4397-9c1a-9bae8e066d67",
  "subject": {
    "type": "CLIENT",
    "id": "e7795f73-264f-45ef-a408-bd8ea95286ea"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzc5NWY3My0yNjRmLTQ1ZWYtYTQwOC1iZDhlYTk1Mjg2ZWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2Mjg2LCJpYXQiOjE3OTMzNjUzODYsImp0aSI6ImU1ZWY2MTQ4LTFkYzYtNDg5MS1hYzc3LWE1OGM2OTRkNmIzNyIsInNpZCI6ImRjYWFjOTc5LTI3YTgtNDM5Ny05YzFhLTliYWU4ZTA2NmQ2NyJ9.5JUpYjYH-6Bc-IeTYNAw-x9gIEEAiwDeDkuzCB0_Clw",
  "access_expires_at": "2026-10-30T13:18:06.978816851Z",
  "refresh_token": "dj6nmxEFSTcue05Sg8QJGFwO4ytBvCje_Km39juqKBY",
  "refresh_expires_at": "2026-11-29T13:03:06.978336638Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "41e36f02-a8c6-4c17-a45b-1b5ae97d0757",
  "expires_at": "2026-10-30T13:08:09.168572895Z",
  "resend_available_at": "2026-10-30T13:03:10.168572895Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635893508` → **200**

```json
{
  "phone": "+380635893508",
  "audience": "CLIENT",
  "code": "066881",
  "sent_at": "2026-10-30T13:03:09.170128339Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "fdbba635-7d33-4ed0-9fbd-753060b576f8",
  "challenge_id": "41e36f02-a8c6-4c17-a45b-1b5ae97d0757",
  "otp_code": "066881"
}
```

```json
{
  "id": "de174b78-6366-4e41-b5ed-2ee768412cec",
  "state": "PENDING",
  "created_at": "2026-10-30T13:03:09.386266Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/de174b78-6366-4e41-b5ed-2ee768412cec` → **200**

```json
{
  "id": "de174b78-6366-4e41-b5ed-2ee768412cec",
  "state": "PENDING",
  "created_at": "2026-10-30T13:03:09.386266Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/de174b78-6366-4e41-b5ed-2ee768412cec` → **200**

```json
{
  "id": "de174b78-6366-4e41-b5ed-2ee768412cec",
  "state": "PENDING",
  "created_at": "2026-10-30T13:03:09.386266Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/de174b78-6366-4e41-b5ed-2ee768412cec` → **200**

```json
{
  "id": "de174b78-6366-4e41-b5ed-2ee768412cec",
  "state": "PENDING",
  "created_at": "2026-10-30T13:03:09.386266Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/de174b78-6366-4e41-b5ed-2ee768412cec` → **200**

```json
{
  "id": "de174b78-6366-4e41-b5ed-2ee768412cec",
  "state": "PENDING",
  "created_at": "2026-10-30T13:03:09.386266Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/de174b78-6366-4e41-b5ed-2ee768412cec` → **200**

```json
{
  "id": "de174b78-6366-4e41-b5ed-2ee768412cec",
  "state": "PENDING",
  "created_at": "2026-10-30T13:03:09.386266Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/de174b78-6366-4e41-b5ed-2ee768412cec` → **200**

```json
{
  "id": "de174b78-6366-4e41-b5ed-2ee768412cec",
  "state": "READY",
  "created_at": "2026-10-30T13:03:09.386266Z",
  "ready_at": "2026-10-30T13:03:15.443548Z",
  "expires_at": "2026-11-06T13:03:15.443548Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/de174b78-6366-4e41-b5ed-2ee768412cec/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639808823",
  "device_ref": "sandbox-23420"
}
```

```json
{
  "challenge_id": "a0b40a8b-ed76-499a-9e23-70360c7ab215",
  "expires_at": "2026-10-30T13:08:15.703889544Z",
  "resend_available_at": "2026-10-30T13:03:16.703889544Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639808823` → **200**

```json
{
  "phone": "+380639808823",
  "audience": "CLIENT",
  "code": "330069",
  "sent_at": "2026-10-30T13:03:15.705890258Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a0b40a8b-ed76-499a-9e23-70360c7ab215",
  "code": "330069",
  "device_ref": "sandbox-23420"
}
```

```json
{
  "session_id": "f90f5dc0-821b-4d50-a650-15abb2bec9a4",
  "subject": {
    "type": "CLIENT",
    "id": "285967f1-83ca-471e-a70b-eaec87e36200"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyODU5NjdmMS04M2NhLTQ3MWUtYTcwYi1lYWVjODdlMzYyMDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2Mjk1LCJpYXQiOjE3OTMzNjUzOTUsImp0aSI6ImIwY2U2MzE1LWI5MGUtNDBkOS04NTc1LTE2YzQzY2JkMTMwYSIsInNpZCI6ImY5MGY1ZGMwLTgyMWItNGQ1MC1hNjUwLTE1YWJiMmJlYzlhNCJ9.iQbAk9T8bNg52ACmIaJUtKYVSAokA2i0nmAYtqPnLls",
  "access_expires_at": "2026-10-30T13:18:15.915724015Z",
  "refresh_token": "VbSj08u4q9tmnHChB6M6x2beyWdCKj9njP0E6AnbaQw",
  "refresh_expires_at": "2026-11-29T13:03:15.91533828Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/de174b78-6366-4e41-b5ed-2ee768412cec/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/de174b78-6366-4e41-b5ed-2ee768412cec/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "40e6448b-10fb-4c05-b935-d849ee676850"
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
  "session_id": "04550b8f-1c61-437a-a7ab-61219629ba6e",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyOTYsImlhdCI6MTc5MzM2NTM5NiwianRpIjoiMTk3NzdkY2ItNjlhYy00ZTRiLWI3NTYtMGM0OGY4MDAxYmMxIiwic2lkIjoiMDQ1NTBiOGYtMWM2MS00MzdhLWE3YWItNjEyMTk2MjliYTZlIn0.x_tau0fZ9R4q4HtlySGHBoxefRaJISVm8s3BYYMAFmA",
  "access_expires_at": "2026-10-30T13:18:16.497008016Z",
  "refresh_token": "0Ccl_nJ0e45h4Fpmbv7BC11xyMU-6DdTA4V-6rs8t-Q",
  "refresh_expires_at": "2026-10-31T01:03:16.496594926Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "e7795f73-264f-45ef-a408-bd8ea95286ea",
  "session_id": "dcaac979-27a8-4397-9c1a-9bae8e066d67",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/e7795f73-264f-45ef-a408-bd8ea95286ea/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "de174b78-6366-4e41-b5ed-2ee768412cec",
      "state": "READY",
      "created_at": "2026-10-30T13:03:09.386266Z",
      "ready_at": "2026-10-30T13:03:15.443548Z",
      "expires_at": "2026-11-06T13:03:15.443548Z",
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
  "device_ref": "sandbox-14911"
}
```

```json
{
  "challenge_id": "c3e0a553-b408-466d-b649-19fd9d07fb0d",
  "expires_at": "2026-10-30T13:08:17.060874752Z",
  "resend_available_at": "2026-10-30T13:03:18.060874752Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "753512",
  "sent_at": "2026-10-30T13:03:17.062880955Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c3e0a553-b408-466d-b649-19fd9d07fb0d",
  "code": "753512",
  "device_ref": "sandbox-14911"
}
```

```json
{
  "session_id": "14377676-922e-4518-9f6c-beb558807d82",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjI5NywiaWF0IjoxNzkzMzY1Mzk3LCJqdGkiOiI5ODIwMmIwOS0wZjQ2LTQ2YzktYmExYi00ZWU5MmM4OGIyNmIiLCJzaWQiOiIxNDM3NzY3Ni05MjJlLTQ1MTgtOWY2Yy1iZWI1NTg4MDdkODIifQ.MFwMCZLIV3RWdkPnHy_zW8qQmxn2oznprDf6t03T7Tg",
  "access_expires_at": "2026-10-30T13:18:17.31346764Z",
  "refresh_token": "zfdxJjySP-t-JEgrSA5mJfAyrbkldqnFEITIVPfg5hI",
  "refresh_expires_at": "2026-11-29T13:03:17.313055635Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7203e6f9-0d1a-4700-811e-b8d033b1a38c",
  "session_version": 1,
  "session_state": "CLOSING",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T13:02:45.329713Z",
  "last_location_at": "2026-10-30T13:02:45.329713Z",
  "eligible": false,
  "ineligible_reasons": [
    "SESSION_CLOSING",
    "INTENT_PAUSE_AFTER_CURRENT",
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/7203e6f9-0d1a-4700-811e-b8d033b1a38c/close` → **409**

```json
{
  "command_id": "2e532c5b-0527-4490-a7c7-57a321cd9a49",
  "expected_version": 1
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions/7203e6f9-0d1a-4700-811e-b8d033b1a38c/close",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "38e31632-d5eb-49f1-990a-3eafd43ba70b"
}
```

**Expected 200, got 409 — scenario stopped.**

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
  "session_id": "c4c23b23-12ba-4560-89ba-217bff42e7c8",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyOTgsImlhdCI6MTc5MzM2NTM5OCwianRpIjoiMzUwY2NmZjEtNjc4ZS00MGUyLWExZTctZDE2NzNmMzdhNWFlIiwic2lkIjoiYzRjMjNiMjMtMTJiYS00NTYwLTg5YmEtMjE3YmZmNDJlN2M4In0.u18mmftKGMHbqyhS-qA2dWRRDcEtgJf3Sgt-cO-3Iws",
  "access_expires_at": "2026-10-30T13:18:18.126716044Z",
  "refresh_token": "VRjTwtYR5k3OWTgoGSKatAkkmfkWH8zBFlpYnM1zf6o",
  "refresh_expires_at": "2026-10-31T01:03:18.126382083Z",
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
  "command_id": "3ce81387-d439-49f6-97d4-7a23af556ee2",
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
  "changed_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T13:03:18.50712Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "79083399-09e8-4bf1-862b-664c6db8dc5f",
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
  "correlation_id": "0c8e9ad2-d784-4c49-9b35-2073c1c1694d",
  "current_version": 1
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "24850660-ef12-4eee-b6cd-2d20ac6debb2",
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
  "correlation_id": "4011fe8a-51b9-4935-8b9b-5c9c503f2001"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637077747",
  "device_ref": "sandbox-22860"
}
```

```json
{
  "challenge_id": "4013aa84-b4ca-4487-b4d3-a25a34494162",
  "expires_at": "2026-10-30T13:08:19.085602546Z",
  "resend_available_at": "2026-10-30T13:03:20.085602546Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637077747` → **200**

```json
{
  "phone": "+380637077747",
  "audience": "CLIENT",
  "code": "271861",
  "sent_at": "2026-10-30T13:03:19.087576551Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4013aa84-b4ca-4487-b4d3-a25a34494162",
  "code": "271861",
  "device_ref": "sandbox-22860"
}
```

```json
{
  "session_id": "e7158057-99c5-4338-b445-581aea4105ef",
  "subject": {
    "type": "CLIENT",
    "id": "94e71723-a311-4cc8-b0ee-7016e340f55a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NGU3MTcyMy1hMzExLTRjYzgtYjBlZS03MDE2ZTM0MGY1NWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2Mjk5LCJpYXQiOjE3OTMzNjUzOTksImp0aSI6ImU5ZDMxYmNhLWE4ZTItNDlhZC04ODk3LTBhMjc3MTEwOGM5NSIsInNpZCI6ImU3MTU4MDU3LTk5YzUtNDMzOC1iNDQ1LTU4MWFlYTQxMDVlZiJ9.cj3vErBD9qwA8_87F51Cs0BjDExZz5grcyccVPcObNY",
  "access_expires_at": "2026-10-30T13:18:19.297703925Z",
  "refresh_token": "Q8X-koFow8IFetmuWiAodmeFkynyrzprykZYWaGmN58",
  "refresh_expires_at": "2026-11-29T13:03:19.297356212Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "defc8416-3db8-4d5a-93f5-4b8c0ea7907a",
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
  "id": "626e13b5-372c-4ab8-80b7-f49f7681856d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:08:19.485403Z",
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
  "command_id": "11f065d7-24a0-4c23-9d9b-62f0a41e4383",
  "quote_id": "626e13b5-372c-4ab8-80b7-f49f7681856d",
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
  "correlation_id": "993f5868-9b97-4a6b-9453-86e335c76a0f"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7bd7f728-84c4-4001-b6da-53b14db93b3c",
  "quote_id": "626e13b5-372c-4ab8-80b7-f49f7681856d",
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
  "id": "55774038-47ba-4ca5-acdd-866153d9de17",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e71723-a311-4cc8-b0ee-7016e340f55a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:03:19.868955Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/55774038-47ba-4ca5-acdd-866153d9de17/cancel` → **200**

```json
{
  "command_id": "8f7c479c-fccc-4bd3-8441-4e7f86bc6990",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "55774038-47ba-4ca5-acdd-866153d9de17",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "94e71723-a311-4cc8-b0ee-7016e340f55a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:03:19.868955Z",
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
  "command_id": "e3292352-7271-4ce8-8f64-7e67d8d7e15d",
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
  "changed_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T13:03:20.290802Z"
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
      "changed_by": "87983110-3c7f-42d1-8f17-34a004597065",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T13:03:20.290802Z"
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
  "device_ref": "sandbox-15738"
}
```

```json
{
  "challenge_id": "f3ee0068-c2f0-44fa-8b25-aa02b20397ee",
  "expires_at": "2026-10-30T13:08:20.878391999Z",
  "resend_available_at": "2026-10-30T13:03:21.878391999Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "499248",
  "sent_at": "2026-10-30T13:03:20.880403651Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f3ee0068-c2f0-44fa-8b25-aa02b20397ee",
  "code": "499248",
  "device_ref": "sandbox-15738"
}
```

```json
{
  "session_id": "6d925c09-9e8b-49fa-ad25-6a2d95e0cb55",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjMwMSwiaWF0IjoxNzkzMzY1NDAxLCJqdGkiOiIzNTliOWRlNS0zYzViLTRkYWMtYjdlMC0wMDllMjAyNzdkNTMiLCJzaWQiOiI2ZDkyNWMwOS05ZThiLTQ5ZmEtYWQyNS02YTJkOTVlMGNiNTUifQ.FIxjHCkY9OErHqJ997kV_PYbRwFJeWbWIBzyvF1CqJc",
  "access_expires_at": "2026-10-30T13:18:21.097082573Z",
  "refresh_token": "-kFylFptljg0d_vIBV1q_7q8bTCVTJbODVS5Yc1iA7k",
  "refresh_expires_at": "2026-11-29T13:03:21.096551663Z",
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
  "command_id": "74926716-bd72-474c-b492-52fe142253ea",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:03:21Z",
    "sequence": 1793365401475
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9dc695ec-7335-47d5-8c20-f2485f34f084",
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
  "last_heartbeat_at": "2026-10-30T13:03:21.490414Z",
  "last_location_at": "2026-10-30T13:03:21.490414Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670027191",
  "device_ref": "sandbox-19659"
}
```

```json
{
  "challenge_id": "5c8c8c41-432c-4ac3-a098-63f1def1ff81",
  "expires_at": "2026-10-30T13:08:21.677643285Z",
  "resend_available_at": "2026-10-30T13:03:22.677643285Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670027191` → **200**

```json
{
  "phone": "+380670027191",
  "audience": "CLIENT",
  "code": "022562",
  "sent_at": "2026-10-30T13:03:21.679603408Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5c8c8c41-432c-4ac3-a098-63f1def1ff81",
  "code": "022562",
  "device_ref": "sandbox-19659"
}
```

```json
{
  "session_id": "205ca9a3-2337-4f21-87b8-abcaf9330ce4",
  "subject": {
    "type": "CLIENT",
    "id": "e8b15df7-a026-4916-8ec7-3ab57b9e2076"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOGIxNWRmNy1hMDI2LTQ5MTYtOGVjNy0zYWI1N2I5ZTIwNzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MzAxLCJpYXQiOjE3OTMzNjU0MDEsImp0aSI6Ijk5OWE3MDZiLTdkMWQtNGYxZS1iZjkxLTFiN2Y5NjBmNTgzNCIsInNpZCI6IjIwNWNhOWEzLTIzMzctNGYyMS04N2I4LWFiY2FmOTMzMGNlNCJ9.4ZqPRGTzNKmXPmzh3Y4KVvqBI_PgcmVTktwkW9DEbXM",
  "access_expires_at": "2026-10-30T13:18:21.884129304Z",
  "refresh_token": "IA0iCNSDC-JHLEDPXEZ0ugxID7dd2-PPNogexl_CCxw",
  "refresh_expires_at": "2026-11-29T13:03:21.883706781Z",
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
  "command_id": "1153a899-7c5e-4a8f-af75-8bf7740af4eb",
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
  "id": "b35ff578-7de9-4c51-a2ce-a14623fae784",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:08:22.254021Z",
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
  "command_id": "4b1190b6-8ce1-4212-bcc4-ce58c0d6c048",
  "platform": "ANDROID",
  "token": "sandbox-driver-72391db4-c152-47cd-bd6d-d2edfe2956ff"
}
```

```json
{
  "id": "2c594fbe-34ed-4ad6-8170-5e9ef2edab7f",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T13:03:22.455984Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "f3fee1be-6382-4998-8c55-47a28e1917e2",
  "platform": "ANDROID",
  "token": "sandbox-rider-0b482812-f88d-4758-a5a1-7a52a4293e23"
}
```

```json
{
  "id": "4a72fe19-11df-440d-920c-63d5998273c9",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T13:03:22.651799Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8146dd92-01cc-4e7a-9ff2-66ac5b7e215f",
  "quote_id": "b35ff578-7de9-4c51-a2ce-a14623fae784",
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
  "id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8b15df7-a026-4916-8ec7-3ab57b9e2076",
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
  "created_at": "2026-10-30T13:03:22.847443Z",
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
    "id": "7ce46200-24c4-4143-bff5-5f5d841575ec",
    "order_id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
    "expires_at": "2026-10-30T13:03:37.849443Z",
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

`POST /api/driver/v1/offers/7ce46200-24c4-4143-bff5-5f5d841575ec/accept` → **200**

```json
{
  "command_id": "a3654b5b-6a25-4387-a3d2-d7bf98d31dc5"
}
```

```json
{
  "id": "3a6b5a6f-27ec-468d-9631-c754e3fa5112",
  "order_id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "aa9b1191-9059-4d8d-ae4a-9c37e9cc768d",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T13:03:22.827Z` → **200**

```json
[
  {
    "at": "2026-10-30T13:03:23.102779986Z",
    "token_suffix": "2956ff",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "7ad55ca5-8a22-4e93-b199-82f68336fec1",
      "order_version": "2",
      "order_id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380670027191&after=2026-10-30T13:03:22.827Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380670027191&after=2026-10-30T13:03:22.827Z` → **200**

```json
[
  {
    "at": "2026-10-30T13:03:24.107325375Z",
    "token_suffix": "293e23",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "c6067911-e672-4182-b48d-5231c046e395",
      "order_version": "3",
      "order_id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/84e2199e-ee8f-41cf-ad3f-85c89b1424ab/messages` → **201**

```json
{
  "command_id": "fd4a4f2c-d1b2-45e5-9f20-55ed9091d189",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "62d7deb1-17bf-4dad-b642-425cf42efd3a",
  "order_id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T13:03:24.514241628Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "aa9b1191-9059-4d8d-ae4a-9c37e9cc768d",
  "order_id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
  "assignment_id": "3a6b5a6f-27ec-468d-9631-c754e3fa5112",
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

`POST /api/driver/v1/trips/aa9b1191-9059-4d8d-ae4a-9c37e9cc768d/messages` → **201**

```json
{
  "command_id": "20308871-d240-4cc0-8056-fda2d43d26dc",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "bf1346d2-bca3-421c-bb35-d032e682ceca",
  "order_id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T13:03:24.873721386Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/84e2199e-ee8f-41cf-ad3f-85c89b1424ab/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/aa9b1191-9059-4d8d-ae4a-9c37e9cc768d/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380670027191"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/9dc695ec-7335-47d5-8c20-f2485f34f084/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:03:25Z",
    "sequence": 1793365405427
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9dc695ec-7335-47d5-8c20-f2485f34f084",
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
  "last_heartbeat_at": "2026-10-30T13:03:25.443108Z",
  "last_location_at": "2026-10-30T13:03:25.443108Z",
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
  "id": "aa9b1191-9059-4d8d-ae4a-9c37e9cc768d",
  "order_id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
  "assignment_id": "3a6b5a6f-27ec-468d-9631-c754e3fa5112",
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

`POST /api/driver/v1/trips/aa9b1191-9059-4d8d-ae4a-9c37e9cc768d/arrive` → **200**

```json
{
  "command_id": "e8fbfd14-356a-47f2-b074-e2dc625f54f5",
  "expected_version": 0
}
```

```json
{
  "id": "aa9b1191-9059-4d8d-ae4a-9c37e9cc768d",
  "order_id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
  "assignment_id": "3a6b5a6f-27ec-468d-9631-c754e3fa5112",
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
  "arrived_at": "2026-10-30T13:03:25.815253Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/aa9b1191-9059-4d8d-ae4a-9c37e9cc768d/start` → **200**

```json
{
  "command_id": "adee43f1-2e8a-4fe7-9e77-4d6eaf13ffaf",
  "expected_version": 1
}
```

```json
{
  "id": "aa9b1191-9059-4d8d-ae4a-9c37e9cc768d",
  "order_id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
  "assignment_id": "3a6b5a6f-27ec-468d-9631-c754e3fa5112",
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
  "arrived_at": "2026-10-30T13:03:25.815253Z",
  "started_at": "2026-10-30T13:03:26.009773Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/9dc695ec-7335-47d5-8c20-f2485f34f084/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:04:14Z",
    "sequence": 1793365454218
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9dc695ec-7335-47d5-8c20-f2485f34f084",
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
  "last_heartbeat_at": "2026-10-30T13:04:14.234011Z",
  "last_location_at": "2026-10-30T13:04:14.234011Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/aa9b1191-9059-4d8d-ae4a-9c37e9cc768d/complete` → **200**

```json
{
  "command_id": "2389e3ae-41a4-40c2-87e1-0b1a4b2b8e9c",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:04:14Z",
  "cash_received": true
}
```

```json
{
  "id": "aa9b1191-9059-4d8d-ae4a-9c37e9cc768d",
  "order_id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
  "assignment_id": "3a6b5a6f-27ec-468d-9631-c754e3fa5112",
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
  "arrived_at": "2026-10-30T13:03:25.815253Z",
  "started_at": "2026-10-30T13:03:26.009773Z",
  "completed_at": "2026-10-30T13:04:14.442277Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/84e2199e-ee8f-41cf-ad3f-85c89b1424ab` → **200**

```json
{
  "id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e8b15df7-a026-4916-8ec7-3ab57b9e2076",
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
    "id": "3a6b5a6f-27ec-468d-9631-c754e3fa5112",
    "order_id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "aa9b1191-9059-4d8d-ae4a-9c37e9cc768d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:03:22.847443Z",
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
{
  "items": [
    {
      "id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
      "short_number": 13,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:03:22.847443Z",
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
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/driver/v1/trips` → **200**

```json
{
  "items": [
    {
      "id": "aa9b1191-9059-4d8d-ae4a-9c37e9cc768d",
      "order_id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
      "order_short_number": 13,
      "created_at": "2026-10-30T13:03:23.247686Z",
      "pickup_label": "Майдан Незалежності",
      "dropoff_label": "Залізничний вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "71069e55-a745-4868-b3cb-fd6410a96be6",
      "order_id": "f089e6e6-8b8d-4932-b0a3-aa2a087bc994",
      "order_short_number": 9,
      "created_at": "2026-10-30T13:02:40.704372Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "75dddf90-d4f3-4d25-8ba9-d1e53a4124bf",
      "order_id": "598050ee-41a3-4546-9515-e57dbc4692a5",
      "order_short_number": 4,
      "created_at": "2026-10-30T13:01:19.939405Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "9e0a9d10-7b5b-4e98-a7ab-e82930cf7687",
      "order_id": "5262f7bb-0b11-46ff-abbc-46b89dea4605",
      "order_short_number": 2,
      "created_at": "2026-10-30T12:57:33.259429Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "ca8ef86d-8804-4877-b1e7-ef55911e77ae",
      "order_id": "6a539cdc-c772-49d2-978a-394767688622",
      "order_short_number": 1,
      "created_at": "2026-10-30T12:57:26.335605Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
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

`GET /api/rider/v1/orders/84e2199e-ee8f-41cf-ad3f-85c89b1424ab/tip` → **200**

```json
{
  "order_id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
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
  "available_until": "2026-10-31T13:04:14.442277Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/84e2199e-ee8f-41cf-ad3f-85c89b1424ab/tip` → **201**

```json
{
  "command_id": "81102a67-8f27-4784-ae97-f55908502a2b",
  "amount_minor": 1100
}
```

```json
{
  "id": "f6542d50-be87-4e1c-b72f-efee905e1bb9",
  "order_id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T13:04:18.902713Z"
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
  "session_id": "1f5e1e6c-7855-4216-a733-06ecdf5b5efe",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYzNTksImlhdCI6MTc5MzM2NTQ1OSwianRpIjoiM2NmYWNlMjEtYmY2Ny00YTYyLThjYWQtZTgwMjc2Mjc5MGIwIiwic2lkIjoiMWY1ZTFlNmMtNzg1NS00MjE2LWE3MzMtMDZlY2RmNWI1ZWZlIn0.jelEaCgNqrhR8HrfZm2odDTPYfmrqdzs5KJedqz4fyg",
  "access_expires_at": "2026-10-30T13:19:19.296416185Z",
  "refresh_token": "-Y6lesJBK2trlCab4z298CQAAHZbXwz-4BRxc_Yjk2k",
  "refresh_expires_at": "2026-10-31T01:04:19.295734799Z",
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
        "created": 12,
        "fulfilled": 6,
        "cancelled": 4,
        "unfulfilled": 0,
        "open": 2,
        "by_channel": {
          "PHONE": 1,
          "APP": 11
        },
        "by_payment": {
          "CARD": 2,
          "CASH": 10
        },
        "cancelled_by": {
          "RIDER": 3,
          "DRIVER": 1
        }
      }
    }
  ],
  "total": {
    "created": 12,
    "fulfilled": 6,
    "cancelled": 4,
    "unfulfilled": 0,
    "open": 2,
    "by_channel": {
      "PHONE": 1,
      "APP": 11
    },
    "by_payment": {
      "CARD": 2,
      "CASH": 10
    },
    "cancelled_by": {
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
  "generated_at": "2026-10-30T13:04:19.489517712Z"
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
        "trips": 6,
        "fares_minor": 68882,
        "service_rides_minor": 0,
        "commission_minor": 10335,
        "driver_share_minor": 58547,
        "discounts_minor": 1052,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 16297,
        "paid_with_bonuses_minor": 2000,
        "collected_by_drivers_minor": 39016,
        "tips_minor": 2500,
        "rider_debt_change_minor": 10517
      }
    }
  ],
  "total": {
    "trips": 6,
    "fares_minor": 68882,
    "service_rides_minor": 0,
    "commission_minor": 10335,
    "driver_share_minor": 58547,
    "discounts_minor": 1052,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 16297,
    "paid_with_bonuses_minor": 2000,
    "collected_by_drivers_minor": 39016,
    "tips_minor": 2500,
    "rider_debt_change_minor": 10517
  },
  "generated_at": "2026-10-30T13:04:19.690531232Z"
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
  "session_id": "83840b3b-ed72-4d14-acb5-6492062d5504",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYzNjAsImlhdCI6MTc5MzM2NTQ2MCwianRpIjoiODlmNzY5ODctOTdkZS00ODk0LWI4MWQtMzhjYjE1YTVkMDA3Iiwic2lkIjoiODM4NDBiM2ItZWQ3Mi00ZDE0LWFjYjUtNjQ5MjA2MmQ1NTA0In0.WKm7elXTl3Ea0Xt57b1tyedStpaKe_PUZ9ySJLnOBps",
  "access_expires_at": "2026-10-30T13:19:20.091025515Z",
  "refresh_token": "AqbtqGtPldHabmHfywqA7JKSGqzRVn1C99ZMjHp_iu0",
  "refresh_expires_at": "2026-10-31T01:04:20.090544631Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/84e2199e-ee8f-41cf-ad3f-85c89b1424ab/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:03:22.847807Z",
      "actor": {
        "type": "CLIENT",
        "id": "e8b15df7-a026-4916-8ec7-3ab57b9e2076",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
        "quote_id": "b35ff578-7de9-4c51-a2ce-a14623fae784",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "f1642242-6843-4563-b17e-1d8faf77d12d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:03:22.849026Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
        "attempt_id": "f41357ea-4b49-422b-b713-70333c8469a9",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f1642242-6843-4563-b17e-1d8faf77d12d"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:03:22.850863Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "7ce46200-24c4-4143-bff5-5f5d841575ec",
        "order_id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "f1642242-6843-4563-b17e-1d8faf77d12d"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:03:23.248731Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "7ce46200-24c4-4143-bff5-5f5d841575ec",
        "order_id": "84e2199e-ee8f-41cf-ad3f-85c89b1424ab",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "3a6b5a6f-27ec-468d-9631-c754e3fa5112"
      },
      "correlation_id": "d004f972-1f57-4d80-8b8a-9615f931fcd3"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T13:04:20.479727357Z",
  "drivers": [
    {
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "name": "Андрій Шевчук",
      "car": {
        "registration_number": "AA0003TX",
        "make": "Hyundai",
        "model": "Sonata",
        "color": "black",
        "classes": [
          "STANDARD",
          "COMFORT"
        ]
      },
      "has_payment_terminal": false,
      "status": "ON_ORDER",
      "occupancy": "TO_PICKUP",
      "connection": "DISCONNECTED",
      "geolocation": "STALE",
      "location": {
        "lat": 50.448,
        "lon": 30.497
      },
      "last_location_at": "2026-10-30T13:02:45.329713Z",
      "order_id": "308b6c6a-587a-414b-bd3c-cb2c94d6cc25"
    },
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
      "last_location_at": "2026-10-30T13:04:14.234011Z",
      "order_id": null
    },
    {
      "driver_id": "5a000000-0000-4000-8000-000000000402",
      "name": "Олег Коваль",
      "car": {
        "registration_number": "AA0002TX",
        "make": "Toyota",
        "model": "Corolla",
        "color": "grey",
        "classes": [
          "STANDARD"
        ]
      },
      "has_payment_terminal": false,
      "status": "NO_SIGNAL",
      "occupancy": "FREE",
      "connection": "DISCONNECTED",
      "geolocation": "STALE",
      "location": {
        "lat": 50.459,
        "lon": 30.5238
      },
      "last_location_at": "2026-10-30T13:01:28.07123Z",
      "order_id": null
    }
  ]
}
```

Done: order 84e2199e-ee8f-41cf-ad3f-85c89b1424ab.

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
  "session_id": "0afb6b9f-7a1c-4e4c-a498-0969033b4101",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYzNjAsImlhdCI6MTc5MzM2NTQ2MCwianRpIjoiYjE3ODNiOGUtMjc5Mi00N2JjLWJjODctYjk4MjVlM2ZhYzExIiwic2lkIjoiMGFmYjZiOWYtN2ExYy00ZTRjLWE0OTgtMDk2OTAzM2I0MTAxIn0.tUIupwmPUIfO6zAzGPE808LWYT7y-dfEXpjk2tAaTb8",
  "access_expires_at": "2026-10-30T13:19:20.906414348Z",
  "refresh_token": "krFJeyMzjP8-nGLplGlICTxUSQshHAz6Q2RtvrqQNcU",
  "refresh_expires_at": "2026-10-31T01:04:20.905961896Z",
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
  "command_id": "23fda63c-424b-4695-9c98-3d02bdf4e26f",
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
  "timestamp": "2026-10-30T13:04:21.000+0000",
  "channel": {
    "id": "1730052000.1023517422",
    "linkedid": "1730052000.1023517422",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679061698"
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
  "timestamp": "2026-10-30T13:04:21.000+0000",
  "channel": {
    "id": "1730052000.1023517422",
    "linkedid": "1730052000.1023517422",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679061698"
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
  "session_id": "2de82652-0cf5-4e7e-bf6d-6b8e6b2efca9",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYzNjEsImlhdCI6MTc5MzM2NTQ2MSwianRpIjoiYzhmM2VhY2UtY2VkYi00YzczLTlkMTAtNGU5ZTY1NDlmZTc4Iiwic2lkIjoiMmRlODI2NTItMGNmNS00ZTdlLWJmNmQtNmI4ZTZiMmVmY2E5In0.4_1zg5SySuBqUt9gG_Lcoe4hILrk7YNd-5Z15ery_6A",
  "access_expires_at": "2026-10-30T13:19:21.739485878Z",
  "refresh_token": "aLIqDsMcQzQ0_CWBWgG7DEbyR1MYs63eAFJw9ORHqx0",
  "refresh_expires_at": "2026-10-31T01:04:21.73892886Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "5008afda-38bb-4a17-af2f-fb98f215d6dc",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679061698",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:04:21Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/5008afda-38bb-4a17-af2f-fb98f215d6dc/answer` → **200**

```json
{
  "command_id": "e297ce55-6450-4836-a141-465e65896517"
}
```

```json
{
  "id": "5008afda-38bb-4a17-af2f-fb98f215d6dc",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679061698",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "order_ids": [],
  "started_at": "2026-10-30T13:04:21Z",
  "answered_at": "2026-10-30T13:04:22.133095Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1023517422",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c4b49f66-362d-47a1-a843-98a40ed270bb",
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
  "id": "177d0f7c-7ff5-4a91-9c80-a789b50ee57f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:09:22.355968Z",
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
  "command_id": "039531c4-05a2-42bb-b407-befb8304f246",
  "quote_id": "177d0f7c-7ff5-4a91-9c80-a789b50ee57f",
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
    "phone": "+380679061698"
  },
  "call_id": "5008afda-38bb-4a17-af2f-fb98f215d6dc"
}
```

```json
{
  "id": "873b23d9-22b7-4de7-8b02-6f8ef5615a2d",
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
  "created_at": "2026-10-30T13:04:22.560551Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679061698"
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
    "id": "1730052000.1023517422",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "5008afda-38bb-4a17-af2f-fb98f215d6dc",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679061698",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "87983110-3c7f-42d1-8f17-34a004597065",
      "order_ids": [
        "873b23d9-22b7-4de7-8b02-6f8ef5615a2d"
      ],
      "started_at": "2026-10-30T13:04:21Z",
      "answered_at": "2026-10-30T13:04:22.133095Z",
      "ended_at": "2026-10-30T13:04:22.771879Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "286c3e0b-bbb6-4811-a39a-04f42ad13292",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674879945",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "87983110-3c7f-42d1-8f17-34a004597065",
      "order_ids": [],
      "started_at": "2026-10-30T13:01:08.248652Z",
      "answered_at": "2026-10-30T13:01:08.473198Z",
      "ended_at": "2026-10-30T13:01:08.687521Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:01:15.441989Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/873b23d9-22b7-4de7-8b02-6f8ef5615a2d` → **200**

```json
{
  "id": "873b23d9-22b7-4de7-8b02-6f8ef5615a2d",
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
  "created_at": "2026-10-30T13:04:22.560551Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679061698"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/873b23d9-22b7-4de7-8b02-6f8ef5615a2d` → **200**

```json
{
  "id": "873b23d9-22b7-4de7-8b02-6f8ef5615a2d",
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
  "created_at": "2026-10-30T13:04:22.560551Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679061698"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/873b23d9-22b7-4de7-8b02-6f8ef5615a2d/cancel` → **200**

```json
{
  "command_id": "e1ea386f-0473-4afb-89dc-3f5b9f9db9d3",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "873b23d9-22b7-4de7-8b02-6f8ef5615a2d",
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
  "created_at": "2026-10-30T13:04:22.560551Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679061698"
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

Done: call 5008afda-38bb-4a17-af2f-fb98f215d6dc with order 873b23d9-22b7-4de7-8b02-6f8ef5615a2d.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14943"
}
```

```json
{
  "challenge_id": "b320f123-a801-4c18-ab59-1f7ef3f2018d",
  "expires_at": "2026-10-30T13:09:23.633603556Z",
  "resend_available_at": "2026-10-30T13:04:24.633603556Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "278305",
  "sent_at": "2026-10-30T13:04:23.636484539Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b320f123-a801-4c18-ab59-1f7ef3f2018d",
  "code": "278305",
  "device_ref": "sandbox-14943"
}
```

```json
{
  "session_id": "d06cd563-6014-4a76-9e44-da9ca989a380",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjM2MywiaWF0IjoxNzkzMzY1NDYzLCJqdGkiOiI3ZmQzMWIxZS1iOWM4LTRhNjUtOGY4NC03OGVhMzllYTU3YzUiLCJzaWQiOiJkMDZjZDU2My02MDE0LTRhNzYtOWU0NC1kYTljYTk4OWEzODAifQ._MARmkxSjI5oPzGpbDyMHVN1wchcOrQ9CSDmege5gzs",
  "access_expires_at": "2026-10-30T13:19:23.852197357Z",
  "refresh_token": "NTBlvYxrvopTEheo0lCh8B0HVAy-Uw_87uxmTtctccY",
  "refresh_expires_at": "2026-11-29T13:04:23.851559477Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9dc695ec-7335-47d5-8c20-f2485f34f084",
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
  "last_heartbeat_at": "2026-10-30T13:04:14.234011Z",
  "last_location_at": "2026-10-30T13:04:14.234011Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9dc695ec-7335-47d5-8c20-f2485f34f084/handover` → **200**

```json
{
  "command_id": "8fb56c03-8811-4db5-ab5b-77e25d06967f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9dc695ec-7335-47d5-8c20-f2485f34f084",
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
  "last_heartbeat_at": "2026-10-30T13:04:14.234011Z",
  "last_location_at": "2026-10-30T13:04:14.234011Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 89 s to the next point)

`POST /api/driver/v1/work-sessions/9dc695ec-7335-47d5-8c20-f2485f34f084/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:05:53Z",
    "sequence": 1793365553452
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9dc695ec-7335-47d5-8c20-f2485f34f084",
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
  "last_heartbeat_at": "2026-10-30T13:05:53.467884Z",
  "last_location_at": "2026-10-30T13:05:53.467884Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666594374",
  "device_ref": "sandbox-28927"
}
```

```json
{
  "challenge_id": "90b36778-fcc8-4ea9-b4ca-27af4f4c8606",
  "expires_at": "2026-10-30T13:10:53.664123701Z",
  "resend_available_at": "2026-10-30T13:05:54.664123701Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666594374` → **200**

```json
{
  "phone": "+380666594374",
  "audience": "CLIENT",
  "code": "183020",
  "sent_at": "2026-10-30T13:05:53.666512532Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90b36778-fcc8-4ea9-b4ca-27af4f4c8606",
  "code": "183020",
  "device_ref": "sandbox-28927"
}
```

```json
{
  "session_id": "7848ac8d-70f8-48b8-84f1-d98640f5a52e",
  "subject": {
    "type": "CLIENT",
    "id": "04a2dccb-015d-4f12-bd1b-633f5dac5338"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGEyZGNjYi0wMTVkLTRmMTItYmQxYi02MzNmNWRhYzUzMzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NDUzLCJpYXQiOjE3OTMzNjU1NTMsImp0aSI6ImFjNTQ3MWVkLWI1M2YtNDZlYS05ZTEyLWRjNTA4OGNhMzljZSIsInNpZCI6Ijc4NDhhYzhkLTcwZjgtNDhiOC04NGYxLWQ5ODY0MGY1YTUyZSJ9.xAavB20RuTD8N9IUgd-3mCFsTytxQk_CC30U4_9fkuU",
  "access_expires_at": "2026-10-30T13:20:53.903138753Z",
  "refresh_token": "TUmON2aPXc2oeKc5iGvqUK0DJJc8hxVzTL-oZPhYx1w",
  "refresh_expires_at": "2026-11-29T13:05:53.902675405Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a294ca4d-9ec3-42cc-ba78-93eba152f479",
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
  "id": "eeb6a262-fdcb-4ab8-a591-75ebdd6d2590",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:10:54.111480Z",
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
  "command_id": "6db94af5-7040-4dda-b396-6c9f9346c2dd",
  "quote_id": "eeb6a262-fdcb-4ab8-a591-75ebdd6d2590",
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
  "id": "e95c98d6-0363-48af-92c2-0d7c1bf23a9f",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "04a2dccb-015d-4f12-bd1b-633f5dac5338",
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
  "created_at": "2026-10-30T13:05:54.322424Z",
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
    "id": "bfd4ab4c-a1ff-44d1-9e17-8a45a4785151",
    "order_id": "e95c98d6-0363-48af-92c2-0d7c1bf23a9f",
    "expires_at": "2026-10-30T13:06:09.325012Z",
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

`POST /api/driver/v1/offers/bfd4ab4c-a1ff-44d1-9e17-8a45a4785151/accept` → **200**

```json
{
  "command_id": "35efd4f8-bb36-4a48-b1e2-341e5aeb8bdf"
}
```

```json
{
  "id": "6fe5257e-5c20-4b6d-a846-0730e95d7cac",
  "order_id": "e95c98d6-0363-48af-92c2-0d7c1bf23a9f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2e13c209-3e9e-4321-85d3-58517152c880",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2e13c209-3e9e-4321-85d3-58517152c880",
  "order_id": "e95c98d6-0363-48af-92c2-0d7c1bf23a9f",
  "assignment_id": "6fe5257e-5c20-4b6d-a846-0730e95d7cac",
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

`POST /api/driver/v1/work-sessions/9dc695ec-7335-47d5-8c20-f2485f34f084/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:05:55Z",
    "sequence": 1793365555135
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9dc695ec-7335-47d5-8c20-f2485f34f084",
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
  "last_heartbeat_at": "2026-10-30T13:05:55.151085Z",
  "last_location_at": "2026-10-30T13:05:55.151085Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/2e13c209-3e9e-4321-85d3-58517152c880/arrive` → **200**

```json
{
  "command_id": "e6bd8b55-fc27-4892-9d41-43e280e6da19",
  "expected_version": 0
}
```

```json
{
  "id": "2e13c209-3e9e-4321-85d3-58517152c880",
  "order_id": "e95c98d6-0363-48af-92c2-0d7c1bf23a9f",
  "assignment_id": "6fe5257e-5c20-4b6d-a846-0730e95d7cac",
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
  "arrived_at": "2026-10-30T13:05:55.359694Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2e13c209-3e9e-4321-85d3-58517152c880/start` → **200**

```json
{
  "command_id": "e413e955-0993-48b3-b816-f1c9400ddd9e",
  "expected_version": 1
}
```

```json
{
  "id": "2e13c209-3e9e-4321-85d3-58517152c880",
  "order_id": "e95c98d6-0363-48af-92c2-0d7c1bf23a9f",
  "assignment_id": "6fe5257e-5c20-4b6d-a846-0730e95d7cac",
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
  "arrived_at": "2026-10-30T13:05:55.359694Z",
  "started_at": "2026-10-30T13:05:55.572828Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 60 s to the next point)

`POST /api/driver/v1/work-sessions/9dc695ec-7335-47d5-8c20-f2485f34f084/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:06:55Z",
    "sequence": 1793365615791
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9dc695ec-7335-47d5-8c20-f2485f34f084",
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
  "last_heartbeat_at": "2026-10-30T13:06:55.807027Z",
  "last_location_at": "2026-10-30T13:06:55.807027Z",
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
  "device_ref": "sandbox-11328"
}
```

```json
{
  "challenge_id": "d3ddf595-88b7-4fb1-8ba1-a09622c7f3b9",
  "expires_at": "2026-10-30T13:11:56.004297592Z",
  "resend_available_at": "2026-10-30T13:06:57.004297592Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "889482",
  "sent_at": "2026-10-30T13:06:56.006338824Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d3ddf595-88b7-4fb1-8ba1-a09622c7f3b9",
  "code": "889482",
  "device_ref": "sandbox-11328"
}
```

```json
{
  "session_id": "f9f7e806-b44b-48d1-a0e7-a7152953c53f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjUxNiwiaWF0IjoxNzkzMzY1NjE2LCJqdGkiOiI4ZjgzMzM4NS03OWZmLTQzOGQtYWQ5Ny1iOTQ2ZDFkMmJmMDkiLCJzaWQiOiJmOWY3ZTgwNi1iNDRiLTQ4ZDEtYTBlNy1hNzE1Mjk1M2M1M2YifQ.4-zpHG8P6vBPc9FDjRpKW6Vejz7zWye0lLuzZR_hSqE",
  "access_expires_at": "2026-10-30T13:21:56.222430186Z",
  "refresh_token": "iVSd3N9BC9FjB6J4fiVPRU5PPX3gw0dHtf2acjdINdI",
  "refresh_expires_at": "2026-11-29T13:06:56.221808084Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "532ca750-7fa5-4683-baa5-aa007ab7b97a",
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
  "last_heartbeat_at": "2026-10-30T13:01:28.07123Z",
  "last_location_at": "2026-10-30T13:01:28.07123Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/532ca750-7fa5-4683-baa5-aa007ab7b97a/handover` → **200**

```json
{
  "command_id": "56b95cda-bbb9-48d6-8ab6-df68585919a7",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "532ca750-7fa5-4683-baa5-aa007ab7b97a",
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
  "last_heartbeat_at": "2026-10-30T13:01:28.07123Z",
  "last_location_at": "2026-10-30T13:01:28.07123Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/532ca750-7fa5-4683-baa5-aa007ab7b97a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:06:56Z",
    "sequence": 1793365616817
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "532ca750-7fa5-4683-baa5-aa007ab7b97a",
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
  "last_heartbeat_at": "2026-10-30T13:06:56.832708Z",
  "last_location_at": "2026-10-30T13:06:56.832708Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
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
  "session_id": "57e0c24f-8017-4a6c-9b74-d11e5d22cdc1",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY1MTcsImlhdCI6MTc5MzM2NTYxNywianRpIjoiOGY0MmNmMjYtZWEyMy00YWEyLWI3NzYtN2M2MDFhYTE0MDc0Iiwic2lkIjoiNTdlMGMyNGYtODAxNy00YTZjLTliNzQtZDExZTVkMjJjZGMxIn0.oE_gxUbnA6kRVyRh35kLTs--9PAeKHGF0dEYisHA4h8",
  "access_expires_at": "2026-10-30T13:21:57.214370185Z",
  "refresh_token": "JjaLViE7aXvQ-u9FKHBDKpk1gmVukRjfXyJu65ZgmN0",
  "refresh_expires_at": "2026-10-31T01:06:57.213970674Z",
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
  "session_id": "6bf02ed8-1ce5-4d62-abf0-6cac10a3e2c3",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY1MTcsImlhdCI6MTc5MzM2NTYxNywianRpIjoiOGRmMWVhMWEtOGFhZi00YTA5LTkxMTAtNTlkZWU0NTQ5ZWQxIiwic2lkIjoiNmJmMDJlZDgtMWNlNS00ZDYyLWFiZjAtNmNhYzEwYTNlMmMzIn0.HvkxeUSZMAYRIhwGKgBqWQHyhjAJ0WNLUFsUzpv_tNk",
  "access_expires_at": "2026-10-30T13:21:57.600546876Z",
  "refresh_token": "_iuKeVdjm0X0s-K0GoqaZaCYlA2CtsyBeduYqdnyyVQ",
  "refresh_expires_at": "2026-10-31T01:06:57.600051285Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e95c98d6-0363-48af-92c2-0d7c1bf23a9f` → **200**

```json
{
  "id": "e95c98d6-0363-48af-92c2-0d7c1bf23a9f",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "04a2dccb-015d-4f12-bd1b-633f5dac5338",
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
    "id": "6fe5257e-5c20-4b6d-a846-0730e95d7cac",
    "order_id": "e95c98d6-0363-48af-92c2-0d7c1bf23a9f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "2e13c209-3e9e-4321-85d3-58517152c880",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T13:05:54.322424Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e95c98d6-0363-48af-92c2-0d7c1bf23a9f/interrupt` → **200**

```json
{
  "command_id": "c1daab85-d0c3-4804-8f15-675b9af8ee92",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "e95c98d6-0363-48af-92c2-0d7c1bf23a9f",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "04a2dccb-015d-4f12-bd1b-633f5dac5338",
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
      "id": "6fe5257e-5c20-4b6d-a846-0730e95d7cac",
      "order_id": "e95c98d6-0363-48af-92c2-0d7c1bf23a9f",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "2e13c209-3e9e-4321-85d3-58517152c880",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T13:05:54.322424Z",
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
    "id": "7a3a112c-1a9c-4512-ae3a-62e07c29bdd5",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "04a2dccb-015d-4f12-bd1b-633f5dac5338",
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
    "id": "743f59ac-5a01-4b08-8e2c-19c8e938dcf6",
    "order_id": "7a3a112c-1a9c-4512-ae3a-62e07c29bdd5",
    "expires_at": "2026-10-30T13:07:13.005046Z",
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

`POST /api/driver/v1/offers/743f59ac-5a01-4b08-8e2c-19c8e938dcf6/accept` → **200**

```json
{
  "command_id": "e170580a-1d01-47b4-8a91-453a53f339a2"
}
```

```json
{
  "id": "6da33e0e-8787-4d97-b56c-436c87596dce",
  "order_id": "7a3a112c-1a9c-4512-ae3a-62e07c29bdd5",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "93f294e7-7424-4621-9b49-d718a849bbb1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "93f294e7-7424-4621-9b49-d718a849bbb1",
  "order_id": "7a3a112c-1a9c-4512-ae3a-62e07c29bdd5",
  "assignment_id": "6da33e0e-8787-4d97-b56c-436c87596dce",
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
  "session_id": "532ca750-7fa5-4683-baa5-aa007ab7b97a",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-30T13:06:56.832708Z",
  "last_location_at": "2026-10-30T13:06:56.832708Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/532ca750-7fa5-4683-baa5-aa007ab7b97a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:06:58Z",
    "sequence": 1793365618970
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "532ca750-7fa5-4683-baa5-aa007ab7b97a",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-30T13:06:58.985686Z",
  "last_location_at": "2026-10-30T13:06:58.985686Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/93f294e7-7424-4621-9b49-d718a849bbb1/arrive` → **200**

```json
{
  "command_id": "d946cac3-4f55-4bbe-9843-ec3cb9f66a34",
  "expected_version": 0
}
```

```json
{
  "id": "93f294e7-7424-4621-9b49-d718a849bbb1",
  "order_id": "7a3a112c-1a9c-4512-ae3a-62e07c29bdd5",
  "assignment_id": "6da33e0e-8787-4d97-b56c-436c87596dce",
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
  "arrived_at": "2026-10-30T13:06:59.182148Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/93f294e7-7424-4621-9b49-d718a849bbb1/start` → **200**

```json
{
  "command_id": "21868c55-7438-40c4-be66-de7a03bba83d",
  "expected_version": 1
}
```

```json
{
  "id": "93f294e7-7424-4621-9b49-d718a849bbb1",
  "order_id": "7a3a112c-1a9c-4512-ae3a-62e07c29bdd5",
  "assignment_id": "6da33e0e-8787-4d97-b56c-436c87596dce",
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
  "arrived_at": "2026-10-30T13:06:59.182148Z",
  "started_at": "2026-10-30T13:06:59.379087Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/93f294e7-7424-4621-9b49-d718a849bbb1/complete` → **200**

```json
{
  "command_id": "f293bc42-f31d-41c9-a172-f101319f13c9",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:06:59Z"
}
```

```json
{
  "id": "93f294e7-7424-4621-9b49-d718a849bbb1",
  "order_id": "7a3a112c-1a9c-4512-ae3a-62e07c29bdd5",
  "assignment_id": "6da33e0e-8787-4d97-b56c-436c87596dce",
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
  "arrived_at": "2026-10-30T13:06:59.182148Z",
  "started_at": "2026-10-30T13:06:59.379087Z",
  "completed_at": "2026-10-30T13:06:59.578529Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders` → **200**

```json
{
  "items": [
    {
      "id": "7a3a112c-1a9c-4512-ae3a-62e07c29bdd5",
      "short_number": 16,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:06:57.997447Z",
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
      "id": "e95c98d6-0363-48af-92c2-0d7c1bf23a9f",
      "short_number": 15,
      "status": "CANCELLED",
      "created_at": "2026-10-30T13:05:54.322424Z",
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
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
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

`GET /api/operator/v1/orders/e95c98d6-0363-48af-92c2-0d7c1bf23a9f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:05:54.32299Z",
      "actor": {
        "type": "CLIENT",
        "id": "04a2dccb-015d-4f12-bd1b-633f5dac5338",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e95c98d6-0363-48af-92c2-0d7c1bf23a9f",
        "quote_id": "eeb6a262-fdcb-4ab8-a591-75ebdd6d2590",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "8a3b3a53-a7ba-4ceb-9b0d-11fd65f32584"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:05:54.324432Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e95c98d6-0363-48af-92c2-0d7c1bf23a9f",
        "attempt_id": "919c9e12-7422-41c4-b12d-1a6af8c38e44",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8a3b3a53-a7ba-4ceb-9b0d-11fd65f32584"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:05:54.326372Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "bfd4ab4c-a1ff-44d1-9e17-8a45a4785151",
        "order_id": "e95c98d6-0363-48af-92c2-0d7c1bf23a9f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "8a3b3a53-a7ba-4ceb-9b0d-11fd65f32584"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:05:54.734707Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "bfd4ab4c-a1ff-44d1-9e17-8a45a4785151",
        "order_id": "e95c98d6-0363-48af-92c2-0d7c1bf23a9f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "6fe5257e-5c20-4b6d-a846-0730e95d7cac"
      },
      "correlation_id": "df7de36a-aadc-4eb5-8126-14d59128f169"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/7a3a112c-1a9c-4512-ae3a-62e07c29bdd5/tip` → **200**

```json
{
  "order_id": "7a3a112c-1a9c-4512-ae3a-62e07c29bdd5",
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
  "available_until": "2026-10-31T13:06:59.578529Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/7a3a112c-1a9c-4512-ae3a-62e07c29bdd5/tip` → **409**

```json
{
  "command_id": "c58cd931-e469-4fbe-b06d-146ee59667d9",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/7a3a112c-1a9c-4512-ae3a-62e07c29bdd5/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "42ff378c-51a4-4ab7-9946-75300de751d5"
}
```

Done: interrupted e95c98d6-0363-48af-92c2-0d7c1bf23a9f, follow-up 7a3a112c-1a9c-4512-ae3a-62e07c29bdd5.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9dc695ec-7335-47d5-8c20-f2485f34f084",
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
  "last_heartbeat_at": "2026-10-30T13:06:55.807027Z",
  "last_location_at": "2026-10-30T13:06:55.807027Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9dc695ec-7335-47d5-8c20-f2485f34f084/close` → **200**

```json
{
  "command_id": "ab048368-2071-43f0-8133-875704b9f5a8",
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
  "session_id": "532ca750-7fa5-4683-baa5-aa007ab7b97a",
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
  "last_heartbeat_at": "2026-10-30T13:06:58.985686Z",
  "last_location_at": "2026-10-30T13:06:58.985686Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/532ca750-7fa5-4683-baa5-aa007ab7b97a/close` → **200**

```json
{
  "command_id": "f9fa9f98-138d-4c9d-a938-4ec8a5529a85",
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
  "session_id": "f8ca676b-4ddf-40f9-8576-43020e44b2cf",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY1MjQsImlhdCI6MTc5MzM2NTYyNCwianRpIjoiNjMyNmMyZGMtOGIyMy00YzZjLTlhZjYtMWUyZjg0N2E5Mzc1Iiwic2lkIjoiZjhjYTY3NmItNGRkZi00MGY5LTg1NzYtNDMwMjBlNDRiMmNmIn0.6mEKtYdvtqd4tL1eYbKuL7hjPL4HIE4on_OaW1PbCjk",
  "access_expires_at": "2026-10-30T13:22:04.678163569Z",
  "refresh_token": "IaQ3ekaLE6EznMFDZgDY5bww0XSbINidsyb2LM9PSN8",
  "refresh_expires_at": "2026-10-31T01:07:04.677765921Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "41fa18f4-c8ab-4c96-ae14-46e7737c8c96",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:07:04Z"
}
```

```json
{
  "id": "a68e6b47-1629-41e8-9953-612c642bdcc0",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:07:04Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/a68e6b47-1629-41e8-9953-612c642bdcc0/publish` → **200**

```json
{
  "command_id": "3f8a0648-1f81-44da-8c70-159d22d1bc24",
  "expected_version": 0
}
```

```json
{
  "id": "a68e6b47-1629-41e8-9953-612c642bdcc0",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:07:05.076422Z",
  "published_at": "2026-10-30T13:07:05.076422Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "a68e6b47-1629-41e8-9953-612c642bdcc0",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T13:07:05.076422Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632432275",
  "device_ref": "sandbox-30662"
}
```

```json
{
  "challenge_id": "51b61081-a23f-4f2d-8481-c83d5973e01c",
  "expires_at": "2026-10-30T13:12:05.483427711Z",
  "resend_available_at": "2026-10-30T13:07:06.483427711Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632432275` → **200**

```json
{
  "phone": "+380632432275",
  "audience": "CLIENT",
  "code": "921633",
  "sent_at": "2026-10-30T13:07:05.48541288Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "51b61081-a23f-4f2d-8481-c83d5973e01c",
  "code": "921633",
  "device_ref": "sandbox-30662"
}
```

```json
{
  "session_id": "74b9f856-b4ba-406b-878f-27539485741c",
  "subject": {
    "type": "CLIENT",
    "id": "e0b02078-d896-4423-9b17-f9abed1aa675"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMGIwMjA3OC1kODk2LTQ0MjMtOWIxNy1mOWFiZWQxYWE2NzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NTI1LCJpYXQiOjE3OTMzNjU2MjUsImp0aSI6IjkxYmI4OWQxLTBjOTktNDBmNS05MzhkLTUwYTM5MWE5OGM2NiIsInNpZCI6Ijc0YjlmODU2LWI0YmEtNDA2Yi04NzhmLTI3NTM5NDg1NzQxYyJ9.IIHYRZis9iGSsJDi3N2rjP7JEhBxYMwCErQTlGnfu5A",
  "access_expires_at": "2026-10-30T13:22:05.692734974Z",
  "refresh_token": "3uhEBDS71cwptLXBL9_U2wekxSjuRywem65xEzGVnvg",
  "refresh_expires_at": "2026-11-29T13:07:05.692358432Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "a68e6b47-1629-41e8-9953-612c642bdcc0",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T13:07:05.076422Z",
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
  "command_id": "94bf6ba4-9567-4f5d-ba5c-062bc519869d",
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
  "id": "023d48e7-344f-4427-9631-fd6968f2f2dc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:12:06.062094Z",
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
  "command_id": "36e28c20-24c4-43ac-bae3-486b418b81b8",
  "quote_id": "023d48e7-344f-4427-9631-fd6968f2f2dc",
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
  "correlation_id": "cac05a4d-b220-4488-b8bb-28bcb4c2f37f"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "f6ac4060-f2d4-4fa0-8749-b1309f590950",
  "version_id": "a68e6b47-1629-41e8-9953-612c642bdcc0",
  "language": "uk"
}
```

```json
{
  "version_id": "a68e6b47-1629-41e8-9953-612c642bdcc0",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T13:07:06.454344Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9b5b11f6-42b2-470c-8a52-edff54fe4645",
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
  "id": "0b11d11e-5ad9-454e-b902-c49becdb4b84",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:12:06.648677Z",
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
  "command_id": "207ef9d7-cbea-488f-a70a-9dfa49d7f42e",
  "quote_id": "0b11d11e-5ad9-454e-b902-c49becdb4b84",
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
  "id": "45a33df1-4bec-488c-b2e7-4ef1b6f761e5",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e0b02078-d896-4423-9b17-f9abed1aa675",
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
  "created_at": "2026-10-30T13:07:06.845804Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/45a33df1-4bec-488c-b2e7-4ef1b6f761e5` → **200**

```json
{
  "id": "45a33df1-4bec-488c-b2e7-4ef1b6f761e5",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e0b02078-d896-4423-9b17-f9abed1aa675",
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
  "created_at": "2026-10-30T13:07:06.845804Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/45a33df1-4bec-488c-b2e7-4ef1b6f761e5/cancel` → **200**

```json
{
  "command_id": "8c1afb8f-4fcb-4d91-8471-f7c45d641074",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "45a33df1-4bec-488c-b2e7-4ef1b6f761e5",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e0b02078-d896-4423-9b17-f9abed1aa675",
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
  "created_at": "2026-10-30T13:07:06.845804Z",
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

`POST /api/admin/v1/legal-documents/a68e6b47-1629-41e8-9953-612c642bdcc0` → **409**

```json
{
  "command_id": "dfc73712-7284-4979-ac43-9969fe41c943",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:07:07Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/a68e6b47-1629-41e8-9953-612c642bdcc0",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d58a556d-5dc2-4013-800f-1f6170658b94"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "fa796606-4edd-4809-a648-56518c481600",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T13:07:07Z"
}
```

```json
{
  "id": "57c725bf-48d4-4236-ab0f-f5cf3c1a3f86",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T13:07:07Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/57c725bf-48d4-4236-ab0f-f5cf3c1a3f86/publish` → **200**

```json
{
  "command_id": "813b2592-5040-4f33-8150-392c229c6d83",
  "expected_version": 0
}
```

```json
{
  "id": "57c725bf-48d4-4236-ab0f-f5cf3c1a3f86",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T13:07:07.879907Z",
  "published_at": "2026-10-30T13:07:07.879907Z",
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
  "device_ref": "sandbox-27007"
}
```

```json
{
  "challenge_id": "1b25dba5-2b88-4595-9aba-cffa46c1a9af",
  "expires_at": "2026-10-30T13:12:08.072406546Z",
  "resend_available_at": "2026-10-30T13:07:09.072406546Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "656501",
  "sent_at": "2026-10-30T13:07:08.074447088Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1b25dba5-2b88-4595-9aba-cffa46c1a9af",
  "code": "656501",
  "device_ref": "sandbox-27007"
}
```

```json
{
  "session_id": "7654758f-de25-4c33-848c-26113e9d9dcd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjUyOCwiaWF0IjoxNzkzMzY1NjI4LCJqdGkiOiI4MDdjZDg3Yy03ZTVjLTQxZTctYjBlYi0xNjU3OTM0NTQwMTQiLCJzaWQiOiI3NjU0NzU4Zi1kZTI1LTRjMzMtODQ4Yy0yNjExM2U5ZDlkY2QifQ.PotyJMtJ11aRhD923FjztX8HiGK-p18DETs5qflMf8E",
  "access_expires_at": "2026-10-30T13:22:08.290641142Z",
  "refresh_token": "qVdCcLu4yCp4mVkRmzyP1SIV3-HR4iKhb21NTGSCDlw",
  "refresh_expires_at": "2026-11-29T13:07:08.29019484Z",
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
  "command_id": "3329355a-d4f6-4134-84c4-02462534e3c4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:08:22Z",
    "sequence": 1793365702697
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8aa6ad36-94d2-4204-bfc8-10ad83951217",
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
  "last_heartbeat_at": "2026-10-30T13:08:22.713687Z",
  "last_location_at": "2026-10-30T13:08:22.713687Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674880307",
  "device_ref": "sandbox-21484"
}
```

```json
{
  "challenge_id": "2dfb6f75-fd72-494e-b3d9-eee369da615f",
  "expires_at": "2026-10-30T13:13:22.918025728Z",
  "resend_available_at": "2026-10-30T13:08:23.918025728Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674880307` → **200**

```json
{
  "phone": "+380674880307",
  "audience": "CLIENT",
  "code": "200131",
  "sent_at": "2026-10-30T13:08:22.919848431Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2dfb6f75-fd72-494e-b3d9-eee369da615f",
  "code": "200131",
  "device_ref": "sandbox-21484"
}
```

```json
{
  "session_id": "c2e881a8-ca80-4364-9bc0-8022797db911",
  "subject": {
    "type": "CLIENT",
    "id": "4bd7f006-bb52-45b0-914c-df71501d56ea"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YmQ3ZjAwNi1iYjUyLTQ1YjAtOTE0Yy1kZjcxNTAxZDU2ZWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NjAzLCJpYXQiOjE3OTMzNjU3MDMsImp0aSI6IjQ5MjQ3MGEyLTU5YWUtNDAzYS05YzYwLWI2NzVlZjMxYzEzNCIsInNpZCI6ImMyZTg4MWE4LWNhODAtNDM2NC05YmMwLTgwMjI3OTdkYjkxMSJ9.0syzIQ1-EnMkl-t_c4fE5VlDgcOZOENnFazq8lUer9A",
  "access_expires_at": "2026-10-30T13:23:23.144799086Z",
  "refresh_token": "Qu5Oo1yYRQGyr1lnNgcXkL7k_pKYjjdhQXLZPR1dpi4",
  "refresh_expires_at": "2026-11-29T13:08:23.144359164Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7258086b-296a-45f6-aac3-1a00a4265bea",
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
  "id": "66257da7-4d0a-4f79-b57f-40fc8cc0750d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:13:23.346623Z",
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
  "command_id": "7087fe24-ee5d-4d03-98a9-784fac96b0be",
  "quote_id": "66257da7-4d0a-4f79-b57f-40fc8cc0750d",
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
    "phone": "+380679719820"
  }
}
```

```json
{
  "id": "f5c24602-8f1f-4190-9ed4-779f3f67825c",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4bd7f006-bb52-45b0-914c-df71501d56ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:08:23.565131Z",
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
    "id": "b22418c8-b137-4e65-a60d-2bff4d6ea13f",
    "order_id": "f5c24602-8f1f-4190-9ed4-779f3f67825c",
    "expires_at": "2026-10-30T13:08:38.567638Z",
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

`POST /api/driver/v1/offers/b22418c8-b137-4e65-a60d-2bff4d6ea13f/accept` → **200**

```json
{
  "command_id": "ccdef5ed-97cf-446a-8e22-58093f4f1261"
}
```

```json
{
  "id": "68e405ee-5e11-49f7-b6c1-ebd5b6e9dea9",
  "order_id": "f5c24602-8f1f-4190-9ed4-779f3f67825c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0e6e4e66-0b48-4409-b085-99927d69939c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0e6e4e66-0b48-4409-b085-99927d69939c",
  "order_id": "f5c24602-8f1f-4190-9ed4-779f3f67825c",
  "assignment_id": "68e405ee-5e11-49f7-b6c1-ebd5b6e9dea9",
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
    "phone": "+380679719820"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "13e1e14b-92d8-4574-b77e-87aa3bd18e7b",
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
  "id": "c65d9fae-a47d-4536-ab53-a44dddbc6129",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:13:24.374970Z",
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
  "command_id": "24ad26bb-a22d-41f1-81fa-c8dc6bd81cc5",
  "quote_id": "c65d9fae-a47d-4536-ab53-a44dddbc6129",
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
  "id": "6c9e41fd-9f3b-416e-8e8f-275955b0a1fb",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4bd7f006-bb52-45b0-914c-df71501d56ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:08:24.580815Z",
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
  "command_id": "ea9e70b7-3712-4477-8317-4fa3b1160392",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T16:08:24Z"
}
```

```json
{
  "id": "04648ad1-f088-40cd-9911-ddbfd3b4d5e0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:13:24.801205Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T16:08:24Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c9622e24-bc6d-4b19-b100-6c1970c5e7ac",
  "quote_id": "04648ad1-f088-40cd-9911-ddbfd3b4d5e0",
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
  "pickup_at": "2026-10-30T16:08:24Z"
}
```

```json
{
  "id": "9f344114-20da-4001-bfda-74a5122df099",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4bd7f006-bb52-45b0-914c-df71501d56ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T13:08:25.007968Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T16:08:24Z",
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
  "command_id": "97876671-63f3-4cf1-9a56-b89a074e637b",
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
  "id": "05147ef3-4179-411e-be2c-82e5ea79467e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:13:25.230003Z",
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
  "command_id": "d50edc69-afd5-439d-ae94-c0596baf70ec",
  "quote_id": "05147ef3-4179-411e-be2c-82e5ea79467e",
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
  "correlation_id": "22a2178a-72eb-48e3-8640-3c783880cc01"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "9f344114-20da-4001-bfda-74a5122df099",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "4bd7f006-bb52-45b0-914c-df71501d56ea",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T13:08:25.007968Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T16:08:24Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "6c9e41fd-9f3b-416e-8e8f-275955b0a1fb",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "4bd7f006-bb52-45b0-914c-df71501d56ea",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T13:08:24.580815Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "f5c24602-8f1f-4190-9ed4-779f3f67825c",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "6c9e41fd-9f3b-416e-8e8f-275955b0a1fb",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4bd7f006-bb52-45b0-914c-df71501d56ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:08:24.580815Z",
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

`GET /api/rider/v1/orders/f5c24602-8f1f-4190-9ed4-779f3f67825c` → **200**

```json
{
  "id": "f5c24602-8f1f-4190-9ed4-779f3f67825c",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4bd7f006-bb52-45b0-914c-df71501d56ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "68e405ee-5e11-49f7-b6c1-ebd5b6e9dea9",
    "order_id": "f5c24602-8f1f-4190-9ed4-779f3f67825c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "0e6e4e66-0b48-4409-b085-99927d69939c",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T13:08:23.565131Z",
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
    "location_at": "2026-10-30T13:08:22.713687Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/f5c24602-8f1f-4190-9ed4-779f3f67825c/cancel` → **200**

```json
{
  "command_id": "098b0721-d910-4f5d-8b2a-dfc5f105b2c1",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f5c24602-8f1f-4190-9ed4-779f3f67825c",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "4bd7f006-bb52-45b0-914c-df71501d56ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "68e405ee-5e11-49f7-b6c1-ebd5b6e9dea9",
    "order_id": "f5c24602-8f1f-4190-9ed4-779f3f67825c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "0e6e4e66-0b48-4409-b085-99927d69939c",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:08:23.565131Z",
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

`GET /api/rider/v1/orders/6c9e41fd-9f3b-416e-8e8f-275955b0a1fb` → **200**

```json
{
  "id": "6c9e41fd-9f3b-416e-8e8f-275955b0a1fb",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4bd7f006-bb52-45b0-914c-df71501d56ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:08:24.580815Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/6c9e41fd-9f3b-416e-8e8f-275955b0a1fb/cancel` → **200**

```json
{
  "command_id": "f1371453-250a-466e-acd8-f80be1a2f60f",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6c9e41fd-9f3b-416e-8e8f-275955b0a1fb",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4bd7f006-bb52-45b0-914c-df71501d56ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:08:24.580815Z",
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

`GET /api/rider/v1/orders/9f344114-20da-4001-bfda-74a5122df099` → **200**

```json
{
  "id": "9f344114-20da-4001-bfda-74a5122df099",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4bd7f006-bb52-45b0-914c-df71501d56ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T13:08:25.007968Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T16:08:24Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9f344114-20da-4001-bfda-74a5122df099/cancel` → **200**

```json
{
  "command_id": "bb9bec7e-2bfe-4ed6-b212-080389fc9ec9",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9f344114-20da-4001-bfda-74a5122df099",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "4bd7f006-bb52-45b0-914c-df71501d56ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T13:08:25.007968Z",
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
  "pickup_at": "2026-10-30T16:08:24Z",
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
  "session_id": "8aa6ad36-94d2-4204-bfc8-10ad83951217",
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
  "last_heartbeat_at": "2026-10-30T13:08:22.713687Z",
  "last_location_at": "2026-10-30T13:08:22.713687Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8aa6ad36-94d2-4204-bfc8-10ad83951217/close` → **200**

```json
{
  "command_id": "07bd3c61-5634-4d2f-ba7c-c87f37b8a515",
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

Done: orders f5c24602-8f1f-4190-9ed4-779f3f67825c, 6c9e41fd-9f3b-416e-8e8f-275955b0a1fb, 9f344114-20da-4001-bfda-74a5122df099.

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
  "session_id": "76b039f4-6a1e-4e1e-b83e-1bcb68eb14d9",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY2MDcsImlhdCI6MTc5MzM2NTcwNywianRpIjoiNDgzMzg4ODgtMzVjMy00NTNiLThiNmYtMjY1ZmZiY2E2MmQzIiwic2lkIjoiNzZiMDM5ZjQtNmExZS00ZTFlLWI4M2UtMWJjYjY4ZWIxNGQ5In0.Z7FWQhNYbdLF9PCMqrFdRa3VV5BZH2Jjdf_yuonY_yU",
  "access_expires_at": "2026-10-30T13:23:27.868112293Z",
  "refresh_token": "iNwqY3HvZ5jJ7-a6Iq0xwXuFeDVhzttPRgm-1efw-Yc",
  "refresh_expires_at": "2026-10-31T01:08:27.867627072Z",
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
  "session_id": "d126d170-770b-43e0-b72a-3974f17ba5b4",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY2MDgsImlhdCI6MTc5MzM2NTcwOCwianRpIjoiMzYxMjM3MjAtODZiOC00YzJiLWEyOGMtNjYyNDBhODYxZDFkIiwic2lkIjoiZDEyNmQxNzAtNzcwYi00M2UwLWI3MmEtMzk3NGYxN2JhNWI0In0.Dn9QN7VNViOPi6NcTGBMPKesL2Qp_KLu6dsRR-UtL5c",
  "access_expires_at": "2026-10-30T13:23:28.268512129Z",
  "refresh_token": "IahAVC2ArpEnDKD-AnVjgB14Ae2Rzmf-pJsW41ynGVY",
  "refresh_expires_at": "2026-10-31T01:08:28.268057064Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23566"
}
```

```json
{
  "challenge_id": "b47fb9cf-4ca1-44b6-9b4f-855616be2e3c",
  "expires_at": "2026-10-30T13:13:28.457684105Z",
  "resend_available_at": "2026-10-30T13:08:29.457684105Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "358698",
  "sent_at": "2026-10-30T13:08:28.459721962Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b47fb9cf-4ca1-44b6-9b4f-855616be2e3c",
  "code": "358698",
  "device_ref": "sandbox-23566"
}
```

```json
{
  "session_id": "77114928-e45a-4e7b-b3f1-a4711c788845",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjYwOCwiaWF0IjoxNzkzMzY1NzA4LCJqdGkiOiIyY2FkN2YzNC0xY2ZiLTRhYjctYmIzNy02YWIwZWVmMzU0NjUiLCJzaWQiOiI3NzExNDkyOC1lNDVhLTRlN2ItYjNmMS1hNDcxMWM3ODg4NDUifQ.7hndn-AIW3SYRO-Yzr4HYe4ujyzLkmy4zUX7FVGbv1k",
  "access_expires_at": "2026-10-30T13:23:28.677482858Z",
  "refresh_token": "dNDGsnXeSbRKwoheVryS9JNCrsdXnLpLRKXkZspVg2E",
  "refresh_expires_at": "2026-11-29T13:08:28.677079942Z",
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
  "command_id": "442ddd42-3421-49ed-bc21-ddf8c9d56b7e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:08:29Z",
    "sequence": 1793365709771
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e881447c-10c6-4a0a-965e-7b183f5925b8",
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
  "last_heartbeat_at": "2026-10-30T13:08:29.092804Z",
  "last_location_at": "2026-10-30T13:08:29.092804Z",
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
  "command_id": "7f55ac0c-b60f-423d-a85a-1ebfde1b1fd1",
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
  "effective_at": "2026-10-30T13:08:29.508629Z",
  "changed_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "87983110-3c7f-42d1-8f17-34a004597065",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T13:01:24.16141Z",
  "last_entries": [
    {
      "order_id": "598050ee-41a3-4546-9515-e57dbc4692a5",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T13:01:24.16141Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7de88843-5278-4b1f-bc5d-afaf49c1055f",
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
  "id": "38c04be8-85a6-46b7-9599-3ef98bcfb6ca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:13:29.916332Z",
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
  "command_id": "d0c57f3f-5a64-4b35-9b99-18b7f142c2b2",
  "quote_id": "38c04be8-85a6-46b7-9599-3ef98bcfb6ca",
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
    "phone": "+380671116506"
  }
}
```

```json
{
  "id": "7fdf797d-24a4-44ac-9437-1b9630877bb8",
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
  "created_at": "2026-10-30T13:08:30.130335Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671116506"
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
    "id": "fdd114cd-5c70-46d9-b9e6-e4821a185359",
    "order_id": "7fdf797d-24a4-44ac-9437-1b9630877bb8",
    "expires_at": "2026-10-30T13:08:45.133088Z",
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

`POST /api/driver/v1/offers/fdd114cd-5c70-46d9-b9e6-e4821a185359/accept` → **200**

```json
{
  "command_id": "1b306693-0a84-423e-b09e-1d30f34cb330"
}
```

```json
{
  "id": "36c4db03-a3e6-4248-9865-22aa4c427ecc",
  "order_id": "7fdf797d-24a4-44ac-9437-1b9630877bb8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e4b97584-7127-4d34-8abf-d4567237abdb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e4b97584-7127-4d34-8abf-d4567237abdb",
  "order_id": "7fdf797d-24a4-44ac-9437-1b9630877bb8",
  "assignment_id": "36c4db03-a3e6-4248-9865-22aa4c427ecc",
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
    "phone": "+380671116506"
  }
}
```

(the car drives 1 s to the next point)

`POST /api/driver/v1/work-sessions/e881447c-10c6-4a0a-965e-7b183f5925b8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:08:31Z",
    "sequence": 1793365711959
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e881447c-10c6-4a0a-965e-7b183f5925b8",
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
  "last_heartbeat_at": "2026-10-30T13:08:31.976136Z",
  "last_location_at": "2026-10-30T13:08:31.976136Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/e4b97584-7127-4d34-8abf-d4567237abdb/arrive` → **200**

```json
{
  "command_id": "018b14bf-f370-42cb-8ee2-c6a0b0f03327",
  "expected_version": 0
}
```

```json
{
  "id": "e4b97584-7127-4d34-8abf-d4567237abdb",
  "order_id": "7fdf797d-24a4-44ac-9437-1b9630877bb8",
  "assignment_id": "36c4db03-a3e6-4248-9865-22aa4c427ecc",
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
  "arrived_at": "2026-10-30T13:08:32.176574Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671116506"
  }
}
```

`POST /api/driver/v1/trips/e4b97584-7127-4d34-8abf-d4567237abdb/start` → **200**

```json
{
  "command_id": "e9f9a709-9cf1-42b2-86e7-a6d1c8ac421b",
  "expected_version": 1
}
```

```json
{
  "id": "e4b97584-7127-4d34-8abf-d4567237abdb",
  "order_id": "7fdf797d-24a4-44ac-9437-1b9630877bb8",
  "assignment_id": "36c4db03-a3e6-4248-9865-22aa4c427ecc",
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
  "arrived_at": "2026-10-30T13:08:32.176574Z",
  "started_at": "2026-10-30T13:08:32.420888Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671116506"
  }
}
```

`POST /api/driver/v1/trips/e4b97584-7127-4d34-8abf-d4567237abdb/complete` → **200**

```json
{
  "command_id": "42715e88-ff04-4e9b-a640-5851f2996eb5",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:08:32Z",
  "cash_received": true
}
```

```json
{
  "id": "e4b97584-7127-4d34-8abf-d4567237abdb",
  "order_id": "7fdf797d-24a4-44ac-9437-1b9630877bb8",
  "assignment_id": "36c4db03-a3e6-4248-9865-22aa4c427ecc",
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
  "arrived_at": "2026-10-30T13:08:32.176574Z",
  "started_at": "2026-10-30T13:08:32.420888Z",
  "completed_at": "2026-10-30T13:08:32.631132Z",
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
  "command_id": "6b96fd3d-18f3-4c6e-ac54-0dcec2ebb92b",
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
  "id": "c22606e6-3a80-45d1-923a-71d4f58d0350",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:13:32.842876Z",
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
  "command_id": "423feefc-409b-4ef2-83cc-dfdd880ede59",
  "quote_id": "c22606e6-3a80-45d1-923a-71d4f58d0350",
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
    "phone": "+3806711114841"
  }
}
```

```json
{
  "id": "5b0bf151-fd88-4554-8cde-447a357abc10",
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
  "created_at": "2026-10-30T13:08:33.053876Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114841"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/5b0bf151-fd88-4554-8cde-447a357abc10` → **200**

```json
{
  "id": "5b0bf151-fd88-4554-8cde-447a357abc10",
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
  "created_at": "2026-10-30T13:08:33.053876Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114841"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5b0bf151-fd88-4554-8cde-447a357abc10/cancel` → **200**

```json
{
  "command_id": "4b901a66-3bba-4b16-aab9-91996eccb35d",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "5b0bf151-fd88-4554-8cde-447a357abc10",
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
  "created_at": "2026-10-30T13:08:33.053876Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114841"
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
  "staff_id": "87983110-3c7f-42d1-8f17-34a004597065",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T13:01:24.16141Z",
  "last_entries": [
    {
      "order_id": "5b0bf151-fd88-4554-8cde-447a357abc10",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T13:08:33.478123Z"
    },
    {
      "order_id": "7fdf797d-24a4-44ac-9437-1b9630877bb8",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T13:08:32.63418Z"
    },
    {
      "order_id": "598050ee-41a3-4546-9515-e57dbc4692a5",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T13:01:24.16141Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e881447c-10c6-4a0a-965e-7b183f5925b8",
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
  "last_heartbeat_at": "2026-10-30T13:08:31.976136Z",
  "last_location_at": "2026-10-30T13:08:31.976136Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e881447c-10c6-4a0a-965e-7b183f5925b8/close` → **200**

```json
{
  "command_id": "f210d35a-723d-4a65-aeb3-438a9b1fd56e",
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

Done: operator bonus for fulfilled 7fdf797d-24a4-44ac-9437-1b9630877bb8 and operator-fault cancellation 5b0bf151-fd88-4554-8cde-447a357abc10.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675877490",
  "device_ref": "sandbox-1629"
}
```

```json
{
  "challenge_id": "c4ecfbdb-d834-4413-bb59-a1b8e3b1811f",
  "expires_at": "2026-10-30T13:13:37.523669714Z",
  "resend_available_at": "2026-10-30T13:08:38.523669714Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675877490` → **200**

```json
{
  "phone": "+380675877490",
  "audience": "CLIENT",
  "code": "592815",
  "sent_at": "2026-10-30T13:08:37.525552934Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679940075",
  "device_ref": "sandbox-4561",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "95710597-1e9a-4115-95ac-0f804350040f",
  "expires_at": "2026-10-30T13:13:38.942497938Z",
  "resend_available_at": "2026-10-30T13:08:39.942497938Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679940075` → **200**

```json
{
  "phone": "+380679940075",
  "audience": "CLIENT",
  "code": "707746",
  "sent_at": "2026-10-30T13:08:38.94408036Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679940075",
  "device_ref": "sandbox-13305",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "dcb74d9a-a732-4d53-9924-3e41abce6238",
  "expires_at": "2026-10-30T13:13:40.356110117Z",
  "resend_available_at": "2026-10-30T13:08:41.356110117Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679940075` → **200**

```json
{
  "phone": "+380679940075",
  "audience": "CLIENT",
  "code": "779836",
  "sent_at": "2026-10-30T13:08:40.358897667Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675210000",
  "device_ref": "sandbox-30237"
}
```

```json
{
  "challenge_id": "8f0031ff-ecb5-4164-a093-563ae6daac1e",
  "expires_at": "2026-10-30T13:13:41.770433796Z",
  "resend_available_at": "2026-10-30T13:08:42.770433796Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675210000",
  "device_ref": "sandbox-26290"
}
```

```json
{
  "challenge_id": "6a2913a1-c7a3-4b03-8000-fa91065acdcc",
  "expires_at": "2026-10-30T13:13:43.166962622Z",
  "resend_available_at": "2026-10-30T13:08:44.166962622Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675210000` → **200**

```json
{
  "phone": "+380675210000",
  "audience": "CLIENT",
  "code": "229966",
  "sent_at": "2026-10-30T13:08:43.169049974Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675210000",
  "device_ref": "sandbox-7876",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "6e31c2da-7a16-4ba5-8752-89c852f8cf50",
  "expires_at": "2026-10-30T13:13:44.584487698Z",
  "resend_available_at": "2026-10-30T13:08:45.584487698Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675210000` → **200**

```json
{
  "phone": "+380675210000",
  "audience": "CLIENT",
  "code": "873284",
  "sent_at": "2026-10-30T13:08:44.58700371Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380675210000",
  "device_ref": "sandbox-7974",
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
  "correlation_id": "d1650d01-b007-4b5e-b29f-e5bb03802486",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000016015"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "256d583a-b4ca-4ec4-94e6-6add23ae15e4"
}
```

`GET /sandbox/v1/otp?phone=%2B442000016015` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120017483"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "3d3eebf9-1b61-484f-bd13-011eef8bdd60"
}
```

`GET /sandbox/v1/otp?phone=%2B37120017483` → **404**

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
  "session_id": "d0b9578f-d1ec-4ef1-9960-16e2148ba657",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY2MjYsImlhdCI6MTc5MzM2NTcyNiwianRpIjoiNzA4YmM5NDUtMDM2YS00M2JlLWE2YWMtOTJlYmQxNzlmYjlkIiwic2lkIjoiZDBiOTU3OGYtZDFlYy00ZWYxLTk5NjAtMTZlMjE0OGJhNjU3In0.LT3LEtK-MhfFfabTVeYg9LVqguBtmU7FN1p3Fomw4MI",
  "access_expires_at": "2026-10-30T13:23:46.840254116Z",
  "refresh_token": "ZTEjnau23V_xcWob0g2_I8aGoGPYLhzIWZzQ79-vQy0",
  "refresh_expires_at": "2026-10-31T01:08:46.839872591Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675210000` → **200**

```json
{
  "deliveries": [
    {
      "id": "8b38755a-dce8-432c-9dfb-c1d8fc5523d9",
      "challenge_id": "6e31c2da-7a16-4ba5-8752-89c852f8cf50",
      "phone": "+380675210000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-9128b50f-11d3-4090-a0e0-788c3f3968ce",
      "error": null,
      "attempted_at": "2026-10-30T13:08:44.587222Z"
    },
    {
      "id": "f75e371f-89dc-4e6c-b6eb-3bb09e009ae0",
      "challenge_id": "6a2913a1-c7a3-4b03-8000-fa91065acdcc",
      "phone": "+380675210000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-3e93ce89-f479-452e-b118-544d4a5efa0f",
      "error": null,
      "attempted_at": "2026-10-30T13:08:43.16939Z"
    },
    {
      "id": "2ff82a2f-3a58-4df3-bf52-8693440a69f9",
      "challenge_id": "8f0031ff-ecb5-4164-a093-563ae6daac1e",
      "phone": "+380675210000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T13:08:41.772236Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380675210000` → **200**

```json
{
  "phone": "+380675210000",
  "audience": "CLIENT",
  "code": "873284",
  "sent_at": "2026-10-30T13:08:44.58700371Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679940075` → **200**

```json
{
  "deliveries": [
    {
      "id": "51945702-f529-40ba-b847-806f3da97af9",
      "challenge_id": "dcb74d9a-a732-4d53-9924-3e41abce6238",
      "phone": "+380679940075",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-a477712f-fca0-4564-8676-a17fd73cebab",
      "error": null,
      "attempted_at": "2026-10-30T13:08:40.359293Z"
    },
    {
      "id": "8bddc231-dfc9-4e74-b8b4-ae57cfc89728",
      "challenge_id": "95710597-1e9a-4115-95ac-0f804350040f",
      "phone": "+380679940075",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-98aec5df-5a1e-473d-88ce-85d146b07cb4",
      "error": null,
      "attempted_at": "2026-10-30T13:08:38.944449Z"
    }
  ]
}
```

Done: SMS to +380675877490; SMS then a call to +380679940075; a failed SMS, two calls and a refused third to +380675210000; +44 and +371 refused.

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
  "session_id": "2ee1da34-c1f1-44a1-884e-addec2a14772",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY2MjcsImlhdCI6MTc5MzM2NTcyNywianRpIjoiNzJmMjlmNTAtZmYzMC00Mzk5LWJmZGQtNDllZTAxZWMzMGQ1Iiwic2lkIjoiMmVlMWRhMzQtYzFmMS00NGExLTg4NGUtYWRkZWMyYTE0NzcyIn0.Tl4D5UxsV0UzHJGnX4RgR78-S_hWWDT9SK-fG_a6mBU",
  "access_expires_at": "2026-10-30T13:23:47.67938372Z",
  "refresh_token": "hTK-rLTg9vN0bup_mUW63GA-6EwcUfbCncNXEds4UMw",
  "refresh_expires_at": "2026-10-31T01:08:47.678737978Z",
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
  "session_id": "0d2932e8-bba9-4a44-80ab-69b3a957fe0c",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY2MjgsImlhdCI6MTc5MzM2NTcyOCwianRpIjoiZjA4M2EyYWEtODUwYS00MzU3LWExNjQtZDdiZmRjZDlhY2QxIiwic2lkIjoiMGQyOTMyZTgtYmJhOS00YTQ0LTgwYWItNjliM2E5NTdmZTBjIn0.6ywdZQmcPwwP4iT7Cz9p7zJLd3ezaxoNh2VGvZ90mEM",
  "access_expires_at": "2026-10-30T13:23:48.079056464Z",
  "refresh_token": "14pux5uIVt_tk-QKOGXardLvIz2BI94GhSHz2VLt2e8",
  "refresh_expires_at": "2026-10-31T01:08:48.078628671Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "87983110-3c7f-42d1-8f17-34a004597065",
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

`POST /api/admin/v1/staff-extensions/87983110-3c7f-42d1-8f17-34a004597065` → **200**

```json
{
  "command_id": "695fde50-9501-43b2-be90-162282696bf4",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "87983110-3c7f-42d1-8f17-34a004597065",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "74cdc697-2265-4bb4-b472-0e63e8c505a3",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T13:08:48.888882Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T13:08:48.888882Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "39a7441c-2af4-4feb-8213-27830e9d3804",
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
  "id": "7ababe82-bb09-474e-8555-932594529e9c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:13:49.270937Z",
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
  "command_id": "5abb7eec-fcaa-4397-ad2e-2fb9e50f4092",
  "quote_id": "7ababe82-bb09-474e-8555-932594529e9c",
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
    "phone": "+380675338361"
  }
}
```

```json
{
  "id": "23d49bb2-1d18-4e09-b739-24a382c27346",
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
  "created_at": "2026-10-30T13:08:49.482448Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675338361"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/23d49bb2-1d18-4e09-b739-24a382c27346/calls` → **201**

```json
{
  "command_id": "9240d837-bb71-4981-ac2c-5b0806873c02",
  "to": "CALLER"
}
```

```json
{
  "id": "9802d46f-e1e4-44b5-94f4-b051c3230bc1",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "order_ids": [
    "23d49bb2-1d18-4e09-b739-24a382c27346"
  ],
  "started_at": "2026-10-30T13:08:49.752548Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/23d49bb2-1d18-4e09-b739-24a382c27346/calls` → **201**

```json
{
  "command_id": "9240d837-bb71-4981-ac2c-5b0806873c02",
  "to": "CALLER"
}
```

```json
{
  "id": "9802d46f-e1e4-44b5-94f4-b051c3230bc1",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "order_ids": [
    "23d49bb2-1d18-4e09-b739-24a382c27346"
  ],
  "started_at": "2026-10-30T13:08:49.752548Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "9802d46f-e1e4-44b5-94f4-b051c3230bc1",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380675338361",
    "at": "2026-10-30T13:08:49.75496504Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "9802d46f-e1e4-44b5-94f4-b051c3230bc1",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.17835",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "9802d46f-e1e4-44b5-94f4-b051c3230bc1"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "9802d46f-e1e4-44b5-94f4-b051c3230bc1",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=23d49bb2-1d18-4e09-b739-24a382c27346` → **200**

```json
{
  "calls": [
    {
      "id": "9802d46f-e1e4-44b5-94f4-b051c3230bc1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "87983110-3c7f-42d1-8f17-34a004597065",
      "order_ids": [
        "23d49bb2-1d18-4e09-b739-24a382c27346"
      ],
      "started_at": "2026-10-30T13:08:49.752548Z",
      "answered_at": "2026-10-30T13:08:50.228331Z",
      "ended_at": "2026-10-30T13:08:50.246996Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=23d49bb2-1d18-4e09-b739-24a382c27346` → **200**

```json
{
  "calls": [
    {
      "id": "9802d46f-e1e4-44b5-94f4-b051c3230bc1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "87983110-3c7f-42d1-8f17-34a004597065",
      "order_ids": [
        "23d49bb2-1d18-4e09-b739-24a382c27346"
      ],
      "started_at": "2026-10-30T13:08:49.752548Z",
      "answered_at": "2026-10-30T13:08:50.228331Z",
      "ended_at": "2026-10-30T13:08:50.246996Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=23d49bb2-1d18-4e09-b739-24a382c27346` → **200**

```json
{
  "calls": [
    {
      "id": "9802d46f-e1e4-44b5-94f4-b051c3230bc1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "87983110-3c7f-42d1-8f17-34a004597065",
      "order_ids": [
        "23d49bb2-1d18-4e09-b739-24a382c27346"
      ],
      "started_at": "2026-10-30T13:08:49.752548Z",
      "answered_at": "2026-10-30T13:08:50.228331Z",
      "ended_at": "2026-10-30T13:08:50.246996Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=23d49bb2-1d18-4e09-b739-24a382c27346` → **200**

```json
{
  "calls": [
    {
      "id": "9802d46f-e1e4-44b5-94f4-b051c3230bc1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "87983110-3c7f-42d1-8f17-34a004597065",
      "order_ids": [
        "23d49bb2-1d18-4e09-b739-24a382c27346"
      ],
      "started_at": "2026-10-30T13:08:49.752548Z",
      "answered_at": "2026-10-30T13:08:50.228331Z",
      "ended_at": "2026-10-30T13:08:50.246996Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:08:55.500484Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/23d49bb2-1d18-4e09-b739-24a382c27346` → **200**

```json
{
  "id": "23d49bb2-1d18-4e09-b739-24a382c27346",
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
  "created_at": "2026-10-30T13:08:49.482448Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675338361"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/23d49bb2-1d18-4e09-b739-24a382c27346/cancel` → **200**

```json
{
  "command_id": "4dd1fb4a-66bf-48f7-8e93-6184e207bf9a",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "23d49bb2-1d18-4e09-b739-24a382c27346",
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
  "created_at": "2026-10-30T13:08:49.482448Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675338361"
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
  "command_id": "1b221b3d-6e5c-4f89-9c2d-f97fdda5ee0b",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T13:08:57.540459Z",
  "extension": "101"
}
```

Done: outgoing call 9802d46f-e1e4-44b5-94f4-b051c3230bc1 from order 23d49bb2-1d18-4e09-b739-24a382c27346, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634815222",
  "device_ref": "sandbox-10397"
}
```

```json
{
  "challenge_id": "5875d258-6c01-4167-910a-10f93c41c5d9",
  "expires_at": "2026-10-30T13:13:57.746488247Z",
  "resend_available_at": "2026-10-30T13:08:58.746488247Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634815222` → **200**

```json
{
  "phone": "+380634815222",
  "audience": "CLIENT",
  "code": "839428",
  "sent_at": "2026-10-30T13:08:57.748491572Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5875d258-6c01-4167-910a-10f93c41c5d9",
  "code": "839428",
  "device_ref": "sandbox-10397"
}
```

```json
{
  "session_id": "c70b4f2d-ba02-4e12-a2cb-535466c462db",
  "subject": {
    "type": "CLIENT",
    "id": "08150bbd-829d-4f1c-8fd9-b3f15930dbb8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODE1MGJiZC04MjlkLTRmMWMtOGZkOS1iM2YxNTkzMGRiYjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NjM3LCJpYXQiOjE3OTMzNjU3MzcsImp0aSI6IjVjODVmOWFhLTdlMmItNGIzNi05YzczLTcxODI3ZTc3ZWM4YyIsInNpZCI6ImM3MGI0ZjJkLWJhMDItNGUxMi1hMmNiLTUzNTQ2NmM0NjJkYiJ9.eRDiuvd0__Vk9Opx4ZyX_edzW1yiDN4lyQUfdlUFBJM",
  "access_expires_at": "2026-10-30T13:23:57.960754345Z",
  "refresh_token": "mYxqsLa2nM1de5uZLXFnoiVraeto33e12AbVgvM7vJw",
  "refresh_expires_at": "2026-11-29T13:08:57.960213301Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "08150bbd-829d-4f1c-8fd9-b3f15930dbb8",
  "session_id": "c70b4f2d-ba02-4e12-a2cb-535466c462db",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634815222",
  "device_ref": "sandbox-5522"
}
```

```json
{
  "challenge_id": "e39a4996-5dab-41ad-ab37-52e92221e556",
  "expires_at": "2026-10-30T13:14:00.344553618Z",
  "resend_available_at": "2026-10-30T13:09:01.344553618Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634815222` → **200**

```json
{
  "phone": "+380634815222",
  "audience": "CLIENT",
  "code": "908219",
  "sent_at": "2026-10-30T13:09:00.348471084Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e39a4996-5dab-41ad-ab37-52e92221e556",
  "code": "908219",
  "device_ref": "sandbox-5522"
}
```

```json
{
  "session_id": "af28b456-6347-4e9e-a983-8a3a5d067db9",
  "subject": {
    "type": "CLIENT",
    "id": "08150bbd-829d-4f1c-8fd9-b3f15930dbb8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODE1MGJiZC04MjlkLTRmMWMtOGZkOS1iM2YxNTkzMGRiYjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NjQwLCJpYXQiOjE3OTMzNjU3NDAsImp0aSI6IjMyN2Y4NmI5LWI3YzktNDE5MS05MzEwLTNkMjA5YTE4YTg4NSIsInNpZCI6ImFmMjhiNDU2LTYzNDctNGU5ZS1hOTgzLThhM2E1ZDA2N2RiOSJ9.6h-EvMCNvDkj4ZeUstnQCR8CNFcoJsQZKHkq_3o5qso",
  "access_expires_at": "2026-10-30T13:24:00.573445932Z",
  "refresh_token": "0aTWSCo0lZcsoxpgiJfUmvxs7zvRgY_2ATaprOxnJ7M",
  "refresh_expires_at": "2026-11-29T13:09:00.573097157Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "bfd4ce9f-1606-4958-8626-e722e1bced91",
  "expires_at": "2026-10-30T13:14:02.771333334Z",
  "resend_available_at": "2026-10-30T13:09:03.771333334Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634815222` → **200**

```json
{
  "phone": "+380634815222",
  "audience": "CLIENT",
  "code": "267456",
  "sent_at": "2026-10-30T13:09:02.773621689Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380639378071"
}
```

```json
{
  "challenge_id": "a066cea3-d70b-4e05-af90-6b3c5c61bcad",
  "expires_at": "2026-10-30T13:14:02.988551558Z",
  "resend_available_at": "2026-10-30T13:09:03.988551558Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639378071` → **200**

```json
{
  "phone": "+380639378071",
  "audience": "CLIENT",
  "code": "180651",
  "sent_at": "2026-10-30T13:09:02.990214957Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "4b9680e1-ffec-4b1d-baaa-a277dfba6d2b",
  "current_challenge_id": "bfd4ce9f-1606-4958-8626-e722e1bced91",
  "current_code": "000000",
  "new_challenge_id": "a066cea3-d70b-4e05-af90-6b3c5c61bcad",
  "new_code": "180651"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "fe82b022-4cbe-4a08-aa97-7ed2666d3945"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "e24f1bc6-e64c-4627-a372-a0a251886ad1",
  "current_challenge_id": "bfd4ce9f-1606-4958-8626-e722e1bced91",
  "current_code": "267456",
  "new_challenge_id": "a066cea3-d70b-4e05-af90-6b3c5c61bcad",
  "new_code": "180651"
}
```

```json
{
  "subject_id": "08150bbd-829d-4f1c-8fd9-b3f15930dbb8",
  "phone": "+380639378071",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "08150bbd-829d-4f1c-8fd9-b3f15930dbb8",
  "session_id": "c70b4f2d-ba02-4e12-a2cb-535466c462db",
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
  "correlation_id": "270a1252-8e0c-4431-be97-41d2a3b3e275"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639378071",
  "device_ref": "sandbox-7296"
}
```

```json
{
  "challenge_id": "be8c52be-bab6-40d4-acb2-6072ec1ffae9",
  "expires_at": "2026-10-30T13:14:06.02751815Z",
  "resend_available_at": "2026-10-30T13:09:07.02751815Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639378071` → **200**

```json
{
  "phone": "+380639378071",
  "audience": "CLIENT",
  "code": "297717",
  "sent_at": "2026-10-30T13:09:06.02943183Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be8c52be-bab6-40d4-acb2-6072ec1ffae9",
  "code": "297717",
  "device_ref": "sandbox-7296"
}
```

```json
{
  "session_id": "d3f36330-8f6c-4914-8b8e-efae891294ba",
  "subject": {
    "type": "CLIENT",
    "id": "08150bbd-829d-4f1c-8fd9-b3f15930dbb8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODE1MGJiZC04MjlkLTRmMWMtOGZkOS1iM2YxNTkzMGRiYjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NjQ2LCJpYXQiOjE3OTMzNjU3NDYsImp0aSI6IjhlZWVlYjIzLWM5MjgtNDg0ZS1iMzAzLTEwYTdjZGZkNWM2NiIsInNpZCI6ImQzZjM2MzMwLThmNmMtNDkxNC04YjhlLWVmYWU4OTEyOTRiYSJ9.h6EZnBgA-zwHGjS5ZxtAopTEw8sGFgiVWY8h-P-30yU",
  "access_expires_at": "2026-10-30T13:24:06.240855322Z",
  "refresh_token": "uRWDznJ9JxzpYtKRXVwJwkBXQKN9dXqussr4dFFFUTM",
  "refresh_expires_at": "2026-11-29T13:09:06.240435239Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "08150bbd-829d-4f1c-8fd9-b3f15930dbb8",
  "session_id": "d3f36330-8f6c-4914-8b8e-efae891294ba",
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
  "session_id": "b7e15d0a-e185-4918-b72f-99b62f75f549",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY2NDYsImlhdCI6MTc5MzM2NTc0NiwianRpIjoiOGRkMjdhZjMtZGQ5Mi00NzVmLTg0NjEtYjhhN2Y3OTk5MjFiIiwic2lkIjoiYjdlMTVkMGEtZTE4NS00OTE4LWI3MmYtOTliNjJmNzVmNTQ5In0.8QPbBbvEJja0FYkLcqNfwKte9k_BaKDwYxiuvcFtKxc",
  "access_expires_at": "2026-10-30T13:24:06.816481358Z",
  "refresh_token": "eL-7JpQsIXQln7-DpPh2wXpa7jhQSrO1I3-z42J12As",
  "refresh_expires_at": "2026-10-31T01:09:06.816048522Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/08150bbd-829d-4f1c-8fd9-b3f15930dbb8` → **200**

```json
{
  "client": {
    "id": "08150bbd-829d-4f1c-8fd9-b3f15930dbb8",
    "phone": "+380639378071",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:08:57.958608Z",
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

`POST /api/admin/v1/clients/08150bbd-829d-4f1c-8fd9-b3f15930dbb8/phone/new-code` → **201**

```json
{
  "phone": "+380638512126"
}
```

```json
{
  "challenge_id": "88862365-1d0c-4e22-965a-8831714a0eae",
  "expires_at": "2026-10-30T13:14:07.224429937Z",
  "resend_available_at": "2026-10-30T13:09:08.224429937Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638512126` → **200**

```json
{
  "phone": "+380638512126",
  "audience": "CLIENT",
  "code": "241523",
  "sent_at": "2026-10-30T13:09:07.226206732Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/08150bbd-829d-4f1c-8fd9-b3f15930dbb8/phone` → **422**

```json
{
  "command_id": "e35ce5e2-8fb9-4b0f-bddf-fa572c3326b3",
  "expected_version": 3,
  "new_challenge_id": "88862365-1d0c-4e22-965a-8831714a0eae",
  "new_code": "241524",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/08150bbd-829d-4f1c-8fd9-b3f15930dbb8/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "6ee33ea9-4105-4dff-a71d-f0de5a3a0ddb"
}
```

`POST /api/admin/v1/clients/08150bbd-829d-4f1c-8fd9-b3f15930dbb8/phone` → **400**

```json
{
  "command_id": "0311531d-405c-4e7b-ab21-1e0eb9db93eb",
  "expected_version": 3,
  "new_challenge_id": "88862365-1d0c-4e22-965a-8831714a0eae",
  "new_code": "241523",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/08150bbd-829d-4f1c-8fd9-b3f15930dbb8/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "ea6255cc-f190-44dd-aad5-43b1514bda73",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/08150bbd-829d-4f1c-8fd9-b3f15930dbb8/phone` → **200**

```json
{
  "command_id": "a4bb7b00-b223-470f-9e0b-7ca144aaba23",
  "expected_version": 3,
  "new_challenge_id": "88862365-1d0c-4e22-965a-8831714a0eae",
  "new_code": "241523",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "08150bbd-829d-4f1c-8fd9-b3f15930dbb8",
  "phone": "+380638512126",
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
  "correlation_id": "c47304b6-af55-4445-a6a0-3a15724c2f28"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638512126",
  "device_ref": "sandbox-24012"
}
```

```json
{
  "challenge_id": "8fd16546-a892-43f0-9782-3516ba9f070f",
  "expires_at": "2026-10-30T13:14:08.3262499Z",
  "resend_available_at": "2026-10-30T13:09:09.3262499Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638512126` → **200**

```json
{
  "phone": "+380638512126",
  "audience": "CLIENT",
  "code": "995989",
  "sent_at": "2026-10-30T13:09:08.328363825Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8fd16546-a892-43f0-9782-3516ba9f070f",
  "code": "995989",
  "device_ref": "sandbox-24012"
}
```

```json
{
  "session_id": "32a8cc4d-5746-42cc-8a43-9b86e8e03c20",
  "subject": {
    "type": "CLIENT",
    "id": "08150bbd-829d-4f1c-8fd9-b3f15930dbb8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODE1MGJiZC04MjlkLTRmMWMtOGZkOS1iM2YxNTkzMGRiYjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NjQ4LCJpYXQiOjE3OTMzNjU3NDgsImp0aSI6ImNhOWU0OTFjLWJmMzItNDM3MS04OTBjLTU3MzlkZmM3ZmMzZSIsInNpZCI6IjMyYThjYzRkLTU3NDYtNDJjYy04YTQzLTliODZlOGUwM2MyMCJ9.6tKCm1sqXhXMEXK_ep6bKv0prvbU-FOKwHY5kIRboIo",
  "access_expires_at": "2026-10-30T13:24:08.534600147Z",
  "refresh_token": "eUtxZ5nnZ4-oWtb4q46ak81u7gNCAbJ7hxdMbhMnhN0",
  "refresh_expires_at": "2026-11-29T13:09:08.533986755Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "08150bbd-829d-4f1c-8fd9-b3f15930dbb8",
  "session_id": "32a8cc4d-5746-42cc-8a43-9b86e8e03c20",
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
  "phone": "+380637431490",
  "device_ref": "sandbox-23765"
}
```

```json
{
  "challenge_id": "536ca9bb-96b6-403d-b2e6-3b890a6e0a7e",
  "expires_at": "2026-10-30T13:14:08.91664163Z",
  "resend_available_at": "2026-10-30T13:09:09.91664163Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637431490` → **200**

```json
{
  "phone": "+380637431490",
  "audience": "CLIENT",
  "code": "173273",
  "sent_at": "2026-10-30T13:09:08.923518544Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "536ca9bb-96b6-403d-b2e6-3b890a6e0a7e",
  "code": "173273",
  "device_ref": "sandbox-23765"
}
```

```json
{
  "session_id": "f8a931eb-f324-4cf4-86f7-7d1323537d97",
  "subject": {
    "type": "CLIENT",
    "id": "875dfd9b-55c6-48d8-ba8a-8e53702c7819"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NzVkZmQ5Yi01NWM2LTQ4ZDgtYmE4YS04ZTUzNzAyYzc4MTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NjQ5LCJpYXQiOjE3OTMzNjU3NDksImp0aSI6IjBmYzNmZWZiLTA2YjctNGNkMS1hZGRmLTM2YTkwZDVmMzlmNyIsInNpZCI6ImY4YTkzMWViLWYzMjQtNGNmNC04NmY3LTdkMTMyMzUzN2Q5NyJ9.a3h9UNiOKMXklKQLkzbXPFo7tkbwuIog9T4PV_2vRN0",
  "access_expires_at": "2026-10-30T13:24:09.165001477Z",
  "refresh_token": "mDaEXdSRUS5Kk-uxv9rMZBGAL67a9xO_BmHVPSwAs8o",
  "refresh_expires_at": "2026-11-29T13:09:09.164543337Z",
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
  "session_id": "530281f6-5a9f-43f4-a18d-c1b7be5f959e",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY2NDksImlhdCI6MTc5MzM2NTc0OSwianRpIjoiMDFkNTI1MjAtNzEyOC00MDFmLTliNjMtM2Y1M2FjNDgyNDA3Iiwic2lkIjoiNTMwMjgxZjYtNWE5Zi00M2Y0LWExOGQtYzFiN2JlNWY5NTllIn0.25b1BgG0GCbm9JR4f1DT95LE5T7zQuqirZeTlLlNS20",
  "access_expires_at": "2026-10-30T13:24:09.953810836Z",
  "refresh_token": "S5sB4Gk29qCgcXk196nj0ahDPhVVsimFb2UEwpzhdHo",
  "refresh_expires_at": "2026-10-31T01:09:09.953427379Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380637431490` → **200**

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
  "correlation_id": "cb754c15-4a03-4e03-94f5-4a0937aae802"
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
  "session_id": "55fe6546-ce40-4562-9310-0f49501a358e",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY2NTAsImlhdCI6MTc5MzM2NTc1MCwianRpIjoiYzcyYzdjOWItMDM3Mi00NWVhLWE4MDMtNDg3ZmJkNDYyODhiIiwic2lkIjoiNTVmZTY1NDYtY2U0MC00NTYyLTkzMTAtMGY0OTUwMWEzNThlIn0.aCn7Z41_8JoYc5PPiULYuQI83g1LjcqlDzqOXPINJOw",
  "access_expires_at": "2026-10-30T13:24:10.725391034Z",
  "refresh_token": "G4BmoXgyLTDgPUcDAQHHzMy-ibb1keewTjNMDviDW-g",
  "refresh_expires_at": "2026-10-31T01:09:10.724952164Z",
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
  "changed_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T12:57:29.389149Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "eb618371-ebc2-4e56-8ae2-bfa86ea5b3be",
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
  "changed_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T13:09:11.116097291Z"
}
```

## The rider books the airport for 2026-10-30T16:09:10Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600219743",
  "device_ref": "sandbox-57"
}
```

```json
{
  "challenge_id": "f7267955-167b-46f7-8826-f648ca0422d8",
  "expires_at": "2026-10-30T13:14:11.315694646Z",
  "resend_available_at": "2026-10-30T13:09:12.315694646Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600219743` → **200**

```json
{
  "phone": "+48600219743",
  "audience": "CLIENT",
  "code": "016440",
  "sent_at": "2026-10-30T13:09:11.317641464Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f7267955-167b-46f7-8826-f648ca0422d8",
  "code": "016440",
  "device_ref": "sandbox-57"
}
```

```json
{
  "session_id": "2b30b390-e1a7-404e-a7f8-d7ace3d1d366",
  "subject": {
    "type": "CLIENT",
    "id": "301e2c85-4333-4f9a-a58c-502fcf021257"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMDFlMmM4NS00MzMzLTRmOWEtYTU4Yy01MDJmY2YwMjEyNTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NjUxLCJpYXQiOjE3OTMzNjU3NTEsImp0aSI6ImE2M2E5OTk4LTk1NTItNGJmYS05MTQ4LWY4YTU2ZDE0YzM4MCIsInNpZCI6IjJiMzBiMzkwLWUxYTctNDA0ZS1hN2Y4LWQ3YWNlM2QxZDM2NiJ9.5TWEGf2pj3ZDlkJhAZAZvJTCxn0FVgxfLsm5MzGvA54",
  "access_expires_at": "2026-10-30T13:24:11.556873085Z",
  "refresh_token": "dtdYK9O0jf2edDdBdXPN4rIPxiVE0LfZ2z7kvgX8KgM",
  "refresh_expires_at": "2026-11-29T13:09:11.556449883Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1bf66f76-b637-41c3-8830-d822fb050183",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T16:09:10Z"
}
```

```json
{
  "id": "f9ca4898-a511-49d3-b42d-8abf86437646",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:14:11.747518Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T16:09:10Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4520769f-a2f4-4735-870d-8703246c6cb9",
  "quote_id": "f9ca4898-a511-49d3-b42d-8abf86437646",
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
  "pickup_at": "2026-10-30T16:09:10Z"
}
```

```json
{
  "id": "ab1fe2ad-9b20-4cf9-bb7e-38010e9b5bb1",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "301e2c85-4333-4f9a-a58c-502fcf021257",
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
  "created_at": "2026-10-30T13:09:11.956817Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T16:09:10Z",
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
  "device_ref": "sandbox-268"
}
```

```json
{
  "challenge_id": "a0ea23b2-d31c-42b5-9476-ae90b588be65",
  "expires_at": "2026-10-30T13:14:12.165037494Z",
  "resend_available_at": "2026-10-30T13:09:13.165037494Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "202903",
  "sent_at": "2026-10-30T13:09:12.166848529Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a0ea23b2-d31c-42b5-9476-ae90b588be65",
  "code": "202903",
  "device_ref": "sandbox-268"
}
```

```json
{
  "session_id": "1ffd1ae9-bd23-436e-9387-0edea66043f9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjY1MiwiaWF0IjoxNzkzMzY1NzUyLCJqdGkiOiI4ODhmMmU0YS05ZWViLTQyOGMtYmNiZi1jZDA5MWQzOWUzNzQiLCJzaWQiOiIxZmZkMWFlOS1iZDIzLTQzNmUtOTM4Ny0wZWRlYTY2MDQzZjkifQ.hU_gqPiwvMMYfDpxkmdfBPXGHryu4LRq7Yf5B9K7C0E",
  "access_expires_at": "2026-10-30T13:24:12.389227973Z",
  "refresh_token": "sx4ejNnCFy7TByRAbD-0QUqjhXHJKQ9i2t_mmPQD-zE",
  "refresh_expires_at": "2026-11-29T13:09:12.388840871Z",
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
  "command_id": "5bf8857d-643c-4294-b37a-182b3f68b65d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:09:12Z",
    "sequence": 1793365752787
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "33a502af-8b6c-4455-b81f-8117df80c3b6",
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
  "last_heartbeat_at": "2026-10-30T13:09:12.803256Z",
  "last_location_at": "2026-10-30T13:09:12.803256Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "ab1fe2ad-9b20-4cf9-bb7e-38010e9b5bb1",
      "short_number": 24,
      "pickup_at": "2026-10-30T16:09:10Z",
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

`POST /api/driver/v1/preorders/ab1fe2ad-9b20-4cf9-bb7e-38010e9b5bb1/reserve` → **200**

```json
{
  "command_id": "5bb07a49-0c6b-418b-bdcc-7edfcd40869d"
}
```

```json
{
  "id": "40ae6dd4-8b74-4755-a706-61acc0f9018e",
  "state": "RESERVED",
  "order": {
    "order_id": "ab1fe2ad-9b20-4cf9-bb7e-38010e9b5bb1",
    "short_number": 24,
    "pickup_at": "2026-10-30T16:09:10Z",
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
  "reserved_at": "2026-10-30T13:09:13.20417Z",
  "confirm_from": "2026-10-30T15:39:10Z",
  "confirm_until": "2026-10-30T15:49:10Z",
  "drop_until": "2026-10-30T15:09:10Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "40ae6dd4-8b74-4755-a706-61acc0f9018e",
      "state": "RESERVED",
      "order": {
        "order_id": "ab1fe2ad-9b20-4cf9-bb7e-38010e9b5bb1",
        "short_number": 24,
        "pickup_at": "2026-10-30T16:09:10Z",
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
      "reserved_at": "2026-10-30T13:09:13.20417Z",
      "confirm_from": "2026-10-30T15:39:10Z",
      "confirm_until": "2026-10-30T15:49:10Z",
      "drop_until": "2026-10-30T15:09:10Z"
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
      "id": "40ae6dd4-8b74-4755-a706-61acc0f9018e",
      "state": "RESERVED",
      "order": {
        "order_id": "ab1fe2ad-9b20-4cf9-bb7e-38010e9b5bb1",
        "short_number": 24,
        "pickup_at": "2026-10-30T16:09:10Z",
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
      "reserved_at": "2026-10-30T13:09:13.20417Z",
      "confirm_from": "2026-10-30T15:39:10Z",
      "confirm_until": "2026-10-30T15:49:10Z",
      "drop_until": "2026-10-30T15:09:10Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/40ae6dd4-8b74-4755-a706-61acc0f9018e/confirm` → **409**

```json
{
  "command_id": "781e7dc7-070f-46d1-b47d-b7241dc061e0"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/40ae6dd4-8b74-4755-a706-61acc0f9018e/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "42d406fd-78bf-47ba-8d42-45a4ebc7ba99"
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
  "session_id": "159bec50-67d0-445d-a6a7-464fb65f62b4",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY2NTQsImlhdCI6MTc5MzM2NTc1NCwianRpIjoiNjI5NWQyMTgtYWQwMy00MDM0LWFmOTMtYzJmZDc1NjlkY2E3Iiwic2lkIjoiMTU5YmVjNTAtNjdkMC00NDVkLWE2YTctNDY0ZmI2NWY2MmI0In0.YNNnxc4nt9xUyeQWPWxYV52qprr5vcysiWZJEiJxBRI",
  "access_expires_at": "2026-10-30T13:24:14.190687044Z",
  "refresh_token": "WAgWlmaFYjsyV67RCxpO4uxPKPjTry4kI1VTMksf9EI",
  "refresh_expires_at": "2026-10-31T01:09:14.190328044Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ab1fe2ad-9b20-4cf9-bb7e-38010e9b5bb1` → **200**

```json
{
  "id": "ab1fe2ad-9b20-4cf9-bb7e-38010e9b5bb1",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "301e2c85-4333-4f9a-a58c-502fcf021257",
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
  "created_at": "2026-10-30T13:09:11.956817Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T16:09:10Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "40ae6dd4-8b74-4755-a706-61acc0f9018e",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T13:09:13.20417Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/ab1fe2ad-9b20-4cf9-bb7e-38010e9b5bb1/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T13:09:11.957541Z",
      "actor": {
        "type": "CLIENT",
        "id": "301e2c85-4333-4f9a-a58c-502fcf021257",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "ab1fe2ad-9b20-4cf9-bb7e-38010e9b5bb1",
        "preorder": true,
        "quote_id": "f9ca4898-a511-49d3-b42d-8abf86437646",
        "pickup_at": "2026-10-30T16:09:10Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "4baf53dc-3d02-4a2e-a856-932f39707816"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T13:09:13.205081Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ab1fe2ad-9b20-4cf9-bb7e-38010e9b5bb1",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "40ae6dd4-8b74-4755-a706-61acc0f9018e"
      },
      "correlation_id": "d930b020-45b6-4333-9da3-f475c57886a0"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order ab1fe2ad-9b20-4cf9-bb7e-38010e9b5bb1, reservation 40ae6dd4-8b74-4755-a706-61acc0f9018e.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23915"
}
```

```json
{
  "challenge_id": "ccbb7418-e4f3-461a-b96b-2a9e0141ba44",
  "expires_at": "2026-10-30T13:14:14.821337Z",
  "resend_available_at": "2026-10-30T13:09:15.821337Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "648091",
  "sent_at": "2026-10-30T13:09:14.823420466Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ccbb7418-e4f3-461a-b96b-2a9e0141ba44",
  "code": "648091",
  "device_ref": "sandbox-23915"
}
```

```json
{
  "session_id": "a1f3366a-5878-4a12-b846-56fc3c2e283a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjY1NSwiaWF0IjoxNzkzMzY1NzU1LCJqdGkiOiI4ZGI5MzM2Yi1hOWNhLTQ3ZTUtODUxNC1iYWFhMzYzMjNiZjgiLCJzaWQiOiJhMWYzMzY2YS01ODc4LTRhMTItYjg0Ni01NmZjM2MyZTI4M2EifQ.l2xahPbK05yqhT7BcKhcOgmXFYE2Mmd88qRXmOH9n2Y",
  "access_expires_at": "2026-10-30T13:24:15.090717591Z",
  "refresh_token": "s5Ya8VTDTDLWHKUaw_8neGcxXatPuqHoH1iHbZ_7bv0",
  "refresh_expires_at": "2026-11-29T13:09:15.090317479Z",
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
  "command_id": "066958e7-d761-4dc7-b81e-0fa9c8b0575b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:09:15Z",
    "sequence": 1793365755480
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7329c41c-8625-4fd5-a394-f40d907c03bc",
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
  "last_heartbeat_at": "2026-10-30T13:09:15.49554Z",
  "last_location_at": "2026-10-30T13:09:15.49554Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670201663",
  "device_ref": "sandbox-28873"
}
```

```json
{
  "challenge_id": "4b8feddf-58b0-4e3a-b83a-8c3e5329fe02",
  "expires_at": "2026-10-30T13:14:15.717003639Z",
  "resend_available_at": "2026-10-30T13:09:16.717003639Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670201663` → **200**

```json
{
  "phone": "+380670201663",
  "audience": "CLIENT",
  "code": "596944",
  "sent_at": "2026-10-30T13:09:15.718990299Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b8feddf-58b0-4e3a-b83a-8c3e5329fe02",
  "code": "596944",
  "device_ref": "sandbox-28873"
}
```

```json
{
  "session_id": "1ad107e3-0ef7-4ffd-8330-4865d4921366",
  "subject": {
    "type": "CLIENT",
    "id": "b9fca201-47b7-4794-9c48-ee6245a40338"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOWZjYTIwMS00N2I3LTQ3OTQtOWM0OC1lZTYyNDVhNDAzMzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NjU1LCJpYXQiOjE3OTMzNjU3NTUsImp0aSI6IjlkNTZiN2JlLTJjNmYtNDg0Ny05MDFmLTlhNTVkNTA4NGVjOCIsInNpZCI6IjFhZDEwN2UzLTBlZjctNGZmZC04MzMwLTQ4NjVkNDkyMTM2NiJ9.OgyMHYPBIl0HyIOHPKCjL2QycK3mFlKbXWf9dXGlDtE",
  "access_expires_at": "2026-10-30T13:24:15.927758103Z",
  "refresh_token": "3jR3eTB99O05d9ZsuekKF5SosQJ_zecouA2WUZo5k6Q",
  "refresh_expires_at": "2026-11-29T13:09:15.927412103Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6537a90f-79e9-4ca4-a0ee-cfa8291b804d",
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
  "id": "d0a50bca-7706-4e2a-a237-10d1435f2f16",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:14:16.114181Z",
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
  "command_id": "8c37f39e-c174-477b-87ee-fd4c4fc8b75b",
  "quote_id": "d0a50bca-7706-4e2a-a237-10d1435f2f16",
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
  "id": "07a83994-68ab-46a8-b6cd-b0b3d7f3e1d6",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b9fca201-47b7-4794-9c48-ee6245a40338",
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
  "created_at": "2026-10-30T13:09:16.315341Z",
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
    "id": "df366629-11b4-442b-9db4-b02c467adfb6",
    "order_id": "07a83994-68ab-46a8-b6cd-b0b3d7f3e1d6",
    "expires_at": "2026-10-30T13:09:31.3174Z",
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

`POST /api/driver/v1/offers/df366629-11b4-442b-9db4-b02c467adfb6/accept` → **200**

```json
{
  "command_id": "1d87dfeb-8cba-43c9-9a52-705767559e41"
}
```

```json
{
  "id": "116b0e5c-f120-43a1-81f2-738e5cb83311",
  "order_id": "07a83994-68ab-46a8-b6cd-b0b3d7f3e1d6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d6cd38ac-2717-4d15-8b37-3e4987243e5a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d6cd38ac-2717-4d15-8b37-3e4987243e5a",
  "order_id": "07a83994-68ab-46a8-b6cd-b0b3d7f3e1d6",
  "assignment_id": "116b0e5c-f120-43a1-81f2-738e5cb83311",
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

`POST /api/driver/v1/work-sessions/7329c41c-8625-4fd5-a394-f40d907c03bc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:09:17Z",
    "sequence": 1793365757887
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7329c41c-8625-4fd5-a394-f40d907c03bc",
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
  "last_heartbeat_at": "2026-10-30T13:09:17.103464Z",
  "last_location_at": "2026-10-30T13:09:17.103464Z",
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
  "id": "d6cd38ac-2717-4d15-8b37-3e4987243e5a",
  "order_id": "07a83994-68ab-46a8-b6cd-b0b3d7f3e1d6",
  "assignment_id": "116b0e5c-f120-43a1-81f2-738e5cb83311",
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

`POST /api/driver/v1/trips/d6cd38ac-2717-4d15-8b37-3e4987243e5a/arrive` → **200**

```json
{
  "command_id": "9c1ea6d4-4280-4f55-8630-efaf285e43b1",
  "expected_version": 0
}
```

```json
{
  "id": "d6cd38ac-2717-4d15-8b37-3e4987243e5a",
  "order_id": "07a83994-68ab-46a8-b6cd-b0b3d7f3e1d6",
  "assignment_id": "116b0e5c-f120-43a1-81f2-738e5cb83311",
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
  "arrived_at": "2026-10-30T13:09:17.498724Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d6cd38ac-2717-4d15-8b37-3e4987243e5a/start` → **200**

```json
{
  "command_id": "1e2ed109-898b-4134-98a5-2f1bd3073e2e",
  "expected_version": 1
}
```

```json
{
  "id": "d6cd38ac-2717-4d15-8b37-3e4987243e5a",
  "order_id": "07a83994-68ab-46a8-b6cd-b0b3d7f3e1d6",
  "assignment_id": "116b0e5c-f120-43a1-81f2-738e5cb83311",
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
  "arrived_at": "2026-10-30T13:09:17.498724Z",
  "started_at": "2026-10-30T13:09:17.717003Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 49 s to the next point)

`POST /api/driver/v1/work-sessions/7329c41c-8625-4fd5-a394-f40d907c03bc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:10:06Z",
    "sequence": 1793365806935
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7329c41c-8625-4fd5-a394-f40d907c03bc",
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
  "last_heartbeat_at": "2026-10-30T13:10:06.951457Z",
  "last_location_at": "2026-10-30T13:10:06.951457Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/d6cd38ac-2717-4d15-8b37-3e4987243e5a/complete` → **200**

```json
{
  "command_id": "8fdc64ae-12dd-4ee5-9ad9-de06c3ec09e6",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:10:07Z",
  "cash_received": true
}
```

```json
{
  "id": "d6cd38ac-2717-4d15-8b37-3e4987243e5a",
  "order_id": "07a83994-68ab-46a8-b6cd-b0b3d7f3e1d6",
  "assignment_id": "116b0e5c-f120-43a1-81f2-738e5cb83311",
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
  "arrived_at": "2026-10-30T13:09:17.498724Z",
  "started_at": "2026-10-30T13:09:17.717003Z",
  "completed_at": "2026-10-30T13:10:07.153138Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/07a83994-68ab-46a8-b6cd-b0b3d7f3e1d6/rating` → **200**

```json
{
  "command_id": "93874cf6-bd3a-4712-a109-0df9f6bdffcd",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "07a83994-68ab-46a8-b6cd-b0b3d7f3e1d6",
  "score": 5,
  "created_at": "2026-10-30T13:10:07.375708592Z"
}
```

`POST /api/driver/v1/orders/07a83994-68ab-46a8-b6cd-b0b3d7f3e1d6/rating` → **200**

```json
{
  "command_id": "1264e587-cd50-4662-81c4-0590cd6b553b",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "07a83994-68ab-46a8-b6cd-b0b3d7f3e1d6",
  "score": 4,
  "created_at": "2026-10-30T13:10:07.578504454Z"
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
  "session_id": "ee83ec9e-85df-4360-90f4-f591ad043ef4",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY3MDgsImlhdCI6MTc5MzM2NTgwOCwianRpIjoiNDM2MGFiNDctMWIyYi00ZGMxLWFhZGEtMzYzMjY0YTIyYzU4Iiwic2lkIjoiZWU4M2VjOWUtODVkZi00MzYwLTkwZjQtZjU5MWFkMDQzZWY0In0.hTjpZ-9URNg0UIieGJo0Z8zK6v5sZg_XC61cR1G54WE",
  "access_expires_at": "2026-10-30T13:25:08.199681026Z",
  "refresh_token": "9h4MM8AFjruEC_UZOiMM9HkXg6n0x5-xgnLL6_aFCNc",
  "refresh_expires_at": "2026-10-31T01:10:08.199223657Z",
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
  "session_id": "baead78f-8949-4a32-9994-82c26f3a7b19",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY3MDgsImlhdCI6MTc5MzM2NTgwOCwianRpIjoiNTg0Mzc1OGItZGRkYi00NTU5LTlhYmItODg2MGQ2NzgwNDE5Iiwic2lkIjoiYmFlYWQ3OGYtODk0OS00YTMyLTk5OTQtODJjMjZmM2E3YjE5In0.Ee5sC-NF8GFlBwFqMAw1zetudjVAXeVAe-n4EddQ5Ms",
  "access_expires_at": "2026-10-30T13:25:08.59341906Z",
  "refresh_token": "fI-bjcfP0JzV0VygD-t4WqeLdwoPZhrEct8QJKTIuzs",
  "refresh_expires_at": "2026-10-31T01:10:08.593010846Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/07a83994-68ab-46a8-b6cd-b0b3d7f3e1d6/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "07a83994-68ab-46a8-b6cd-b0b3d7f3e1d6",
      "author_type": "RIDER",
      "author_id": "b9fca201-47b7-4794-9c48-ee6245a40338",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T13:10:07.375709Z"
    },
    {
      "order_id": "07a83994-68ab-46a8-b6cd-b0b3d7f3e1d6",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "b9fca201-47b7-4794-9c48-ee6245a40338",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T13:10:07.578504Z"
    }
  ]
}
```

Done: ratings for order 07a83994-68ab-46a8-b6cd-b0b3d7f3e1d6.

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
  "session_id": "c1258b3c-61b3-43c0-ba4f-b8c895e494fa",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY3MDksImlhdCI6MTc5MzM2NTgwOSwianRpIjoiOThkMzVmZGEtYjJkYi00MWQ4LThlYTgtZjQ1ZWJiMGY1MjU4Iiwic2lkIjoiYzEyNThiM2MtNjFiMy00M2MwLWJhNGYtYjhjODk1ZTQ5NGZhIn0.zTakueExrJdcK0sgjzB1zedy8ChGLFx3aT4mMO5Qc5o",
  "access_expires_at": "2026-10-30T13:25:09.205443329Z",
  "refresh_token": "L5NCpnSNcMA8PTQM07ZHv2ryruWDYuv_nGG9zAUr1P4",
  "refresh_expires_at": "2026-10-31T01:10:09.204965414Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "d7655248-8b68-495e-aed2-25d3a8f33428",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "5e1c9651-6e55-45b8-b70a-f6b1f7eeaf37",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:10:09.412671Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5e1c9651-6e55-45b8-b70a-f6b1f7eeaf37` → **200**

```json
{
  "id": "5e1c9651-6e55-45b8-b70a-f6b1f7eeaf37",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:10:09.412671Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5e1c9651-6e55-45b8-b70a-f6b1f7eeaf37` → **200**

```json
{
  "id": "5e1c9651-6e55-45b8-b70a-f6b1f7eeaf37",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T13:10:09.412671Z",
  "ready_at": "2026-10-30T13:10:10.58218Z",
  "expires_at": "2026-10-31T13:10:10.58218Z"
}
```

`GET /api/admin/v1/reports/exports/5e1c9651-6e55-45b8-b70a-f6b1f7eeaf37/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,23,9,12,1,1,18,5,0,20,2,0,1,7,1,4
total,23,9,12,1,1,18,5,0,20,2,0,1,7,1,4
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "30756d55-1b9a-457d-8393-728ad78d282f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "e3fa1389-d83c-45d4-a1f1-c422d0bf8e25",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:10:11.070472Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e3fa1389-d83c-45d4-a1f1-c422d0bf8e25` → **200**

```json
{
  "id": "e3fa1389-d83c-45d4-a1f1-c422d0bf8e25",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:10:11.070472Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e3fa1389-d83c-45d4-a1f1-c422d0bf8e25` → **200**

```json
{
  "id": "e3fa1389-d83c-45d4-a1f1-c422d0bf8e25",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:10:11.070472Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e3fa1389-d83c-45d4-a1f1-c422d0bf8e25` → **200**

```json
{
  "id": "e3fa1389-d83c-45d4-a1f1-c422d0bf8e25",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:10:11.070472Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e3fa1389-d83c-45d4-a1f1-c422d0bf8e25` → **200**

```json
{
  "id": "e3fa1389-d83c-45d4-a1f1-c422d0bf8e25",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:10:11.070472Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e3fa1389-d83c-45d4-a1f1-c422d0bf8e25` → **200**

```json
{
  "id": "e3fa1389-d83c-45d4-a1f1-c422d0bf8e25",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T13:10:11.070472Z",
  "ready_at": "2026-10-30T13:10:15.587486Z",
  "expires_at": "2026-10-31T13:10:15.587486Z"
}
```

`GET /api/admin/v1/reports/exports/e3fa1389-d83c-45d4-a1f1-c422d0bf8e25/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,9,1224.40,130.74,183.69,1040.71,10.52,0.00,162.97,20.00,795.00,25.00,105.17
total,UAH,9,1224.40,130.74,183.69,1040.71,10.52,0.00,162.97,20.00,795.00,25.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/02d0dfcf-b140-467f-baa4-cfcaa7799620` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/02d0dfcf-b140-467f-baa4-cfcaa7799620",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "66511dc1-a0b1-4aa4-b464-9de27eda8fbe"
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
  "session_id": "444b014a-032a-4c7b-b391-60074d46143d",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY3MTYsImlhdCI6MTc5MzM2NTgxNiwianRpIjoiYWZkYzZjOTgtMDQ3NS00Y2E0LWJhMzctYjI2OWIyMTBlMTUyIiwic2lkIjoiNDQ0YjAxNGEtMDMyYS00YzdiLWIzOTEtNjAwNzRkNDYxNDNkIn0.RSyDFYVEiZm3JRbKjh4kCEKeYb0bHfZ_myPzxp_dsgE",
  "access_expires_at": "2026-10-30T13:25:16.690780041Z",
  "refresh_token": "NgAieS1YbqDZk_ZFlR0rV4-HIwOThoXd4h8w0QtMkP8",
  "refresh_expires_at": "2026-10-31T01:10:16.690414571Z",
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
  "command_id": "b3d9d51a-7d7d-4edd-9af5-6ca2f0ab3a63",
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
  "changed_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T13:10:17.107648508Z"
}
```

`POST /sandbox/v1/retention/fixtures/236a34e6-a3a5-4730-b15d-9bc9f1d1d075` → **200**

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

`GET /sandbox/v1/retention/fixtures/236a34e6-a3a5-4730-b15d-9bc9f1d1d075` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/236a34e6-a3a5-4730-b15d-9bc9f1d1d075` → **204**

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
  "changed_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T13:10:17.107649Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "64eac1f1-fe81-43d6-8d0e-5a627be7db28",
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
  "changed_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T13:10:17.617466959Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-10233"
}
```

```json
{
  "challenge_id": "b4340a11-1baf-48af-8598-ba066972b405",
  "expires_at": "2026-10-30T13:15:17.824651322Z",
  "resend_available_at": "2026-10-30T13:10:18.824651322Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "105238",
  "sent_at": "2026-10-30T13:10:17.826900185Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b4340a11-1baf-48af-8598-ba066972b405",
  "code": "105238",
  "device_ref": "sandbox-10233"
}
```

```json
{
  "session_id": "cf1be68d-42f3-4f60-b15b-46b2fa2b8334",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjcxOCwiaWF0IjoxNzkzMzY1ODE4LCJqdGkiOiIwMTk2MzQxZS1iYTZhLTRkYzYtYTc2Zi03NjFhOGYxMDc2MDUiLCJzaWQiOiJjZjFiZTY4ZC00MmYzLTRmNjAtYjE1Yi00NmIyZmEyYjgzMzQifQ.apFW_UzT9ba1zugsG9tIy5wtD5OcjHeNniEmjCkYWbA",
  "access_expires_at": "2026-10-30T13:25:18.062114146Z",
  "refresh_token": "oPXqZoWzgg20FYsl4SqMK2Ws_8FYDWJFHW5CAOHU4xg",
  "refresh_expires_at": "2026-11-29T13:10:18.061692131Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7203e6f9-0d1a-4700-811e-b8d033b1a38c",
  "session_version": 1,
  "session_state": "CLOSING",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T13:02:45.329713Z",
  "last_location_at": "2026-10-30T13:02:45.329713Z",
  "eligible": false,
  "ineligible_reasons": [
    "SESSION_CLOSING",
    "INTENT_PAUSE_AFTER_CURRENT",
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/7203e6f9-0d1a-4700-811e-b8d033b1a38c/close` → **409**

```json
{
  "command_id": "44fa3cb3-118b-4b7b-b78e-57d9da58c1fb",
  "expected_version": 1
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions/7203e6f9-0d1a-4700-811e-b8d033b1a38c/close",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "bc9f43ae-d0ab-4a4c-933b-84d211b82991"
}
```

**Expected 200, got 409 — scenario stopped.**

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "02f4a9a9-f765-441c-96d7-a082017c1988",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY3MTgsImlhdCI6MTc5MzM2NTgxOCwianRpIjoiMjA5ZmUyYmUtNGYxZC00NTgwLTg4NGQtYmViNzQ0Y2M4MzI4Iiwic2lkIjoiMDJmNGE5YTktZjc2NS00NDFjLTk2ZDctYTA4MjAxN2MxOTg4In0.NptZgYs09VYwyWZAUOcosnx4rtSBhA0eVvjglTwXpZY",
  "access_expires_at": "2026-10-30T13:25:18.854833662Z",
  "refresh_token": "hKcrM2y5AlU9f7sHG5a9XpuIVGFuwXC7p5QQ_1h5bg8",
  "refresh_expires_at": "2026-10-31T01:10:18.85447352Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7203e6f9-0d1a-4700-811e-b8d033b1a38c",
  "session_version": 1,
  "session_state": "CLOSING",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T13:02:45.329713Z",
  "last_location_at": "2026-10-30T13:02:45.329713Z",
  "eligible": false,
  "ineligible_reasons": [
    "SESSION_CLOSING",
    "INTENT_PAUSE_AFTER_CURRENT",
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/7203e6f9-0d1a-4700-811e-b8d033b1a38c/close` → **409**

```json
{
  "command_id": "b23175f7-bca8-42b4-bb01-5e28dde94c25",
  "expected_version": 1
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions/7203e6f9-0d1a-4700-811e-b8d033b1a38c/close",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "49cd0a49-1013-48fd-82bf-aa04e300af47"
}
```

**Expected 200, got 409 — scenario stopped.**

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
  "session_id": "5b8713f2-bec8-4e01-b7f8-6309dfe9e16d",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY3MTksImlhdCI6MTc5MzM2NTgxOSwianRpIjoiZTU0OWU4Y2UtYTc4Zi00YWIxLWEwNGYtZjFkNDZhN2Q0ZDU4Iiwic2lkIjoiNWI4NzEzZjItYmVjOC00ZTAxLWI3ZjgtNjMwOWRmZTllMTZkIn0.MqTZdf4BsS9EUacvf3N_KUkVDDLbVu0tDilFFPHhUgI",
  "access_expires_at": "2026-10-30T13:25:19.929272565Z",
  "refresh_token": "KdQoEkPhXnJT8-aFwcWGC-Y8t1xF2HvV7lFWVsb-7gg",
  "refresh_expires_at": "2026-10-31T01:10:19.928837901Z",
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
  "command_id": "cbbfe095-b04f-4d20-8a7d-f590f7e6f289",
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
  "changed_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T13:10:20.368484Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "cbbfe095-b04f-4d20-8a7d-f590f7e6f289",
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
  "changed_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T13:10:20.368484Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48146418723",
  "device_ref": "sandbox-6339"
}
```

```json
{
  "challenge_id": "5b3fbff0-c3d5-4083-95a9-eb6781e0794e",
  "expires_at": "2026-10-30T13:15:20.772638466Z",
  "resend_available_at": "2026-10-30T13:10:21.772638466Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48146418723` → **200**

```json
{
  "phone": "+48146418723",
  "audience": "CLIENT",
  "code": "308987",
  "sent_at": "2026-10-30T13:10:20.77546261Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5b3fbff0-c3d5-4083-95a9-eb6781e0794e",
  "code": "308987",
  "device_ref": "sandbox-6339"
}
```

```json
{
  "session_id": "5512f358-3d30-4590-acd3-ba74e2709f69",
  "subject": {
    "type": "CLIENT",
    "id": "3a2998b6-d054-4e0a-b6e1-79d89bc12758"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTI5OThiNi1kMDU0LTRlMGEtYjZlMS03OWQ4OWJjMTI3NTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NzIwLCJpYXQiOjE3OTMzNjU4MjAsImp0aSI6ImQzZjM4MGUxLWUxNWMtNGJiYi05YTIwLTA4NTlkZmUwNWRhMSIsInNpZCI6IjU1MTJmMzU4LTNkMzAtNDU5MC1hY2QzLWJhNzRlMjcwOWY2OSJ9.cVm-YlXd2nceiEpyZjSyjASA21TPjXzWvyN-7gEnJOQ",
  "access_expires_at": "2026-10-30T13:25:20.993824018Z",
  "refresh_token": "jm8XvyAAeRTJtYP0ejNL2Rs6fYncfnyp9bjrryZCjHw",
  "refresh_expires_at": "2026-11-29T13:10:20.993493181Z",
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
  "correlation_id": "a5ea8859-6bb0-4b70-8489-0674ec74f7d2"
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
  "device_ref": "sandbox-4993"
}
```

```json
{
  "challenge_id": "7ef68c54-615d-474a-9dfa-eff091bbe1e3",
  "expires_at": "2026-10-30T13:15:21.559955931Z",
  "resend_available_at": "2026-10-30T13:10:22.559955931Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "761475",
  "sent_at": "2026-10-30T13:10:21.561891339Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7ef68c54-615d-474a-9dfa-eff091bbe1e3",
  "code": "761475",
  "device_ref": "sandbox-4993"
}
```

```json
{
  "session_id": "20cc468b-8fed-4880-a153-c608a16c671a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjcyMSwiaWF0IjoxNzkzMzY1ODIxLCJqdGkiOiIxMTcyODBhOS00ZmE0LTRmOTctYjhjZC03NDUyMGQzYThiMTMiLCJzaWQiOiIyMGNjNDY4Yi04ZmVkLTQ4ODAtYTE1My1jNjA4YTE2YzY3MWEifQ.ppoSHhkMaHzffjJq84s2vER1qH6Tj5Z2ahicD_aUWUo",
  "access_expires_at": "2026-10-30T13:25:21.770686076Z",
  "refresh_token": "qNzkpSnaOSzSvOwQQxliI5FEvdTHgJAlelvQ__g3v1Q",
  "refresh_expires_at": "2026-11-29T13:10:21.770314045Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "33a502af-8b6c-4455-b81f-8117df80c3b6",
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
  "last_heartbeat_at": "2026-10-30T13:09:12.803256Z",
  "last_location_at": "2026-10-30T13:09:12.803256Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/33a502af-8b6c-4455-b81f-8117df80c3b6/handover` → **200**

```json
{
  "command_id": "c4884835-18d5-4273-9e6f-bb4cd502bae7",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "33a502af-8b6c-4455-b81f-8117df80c3b6",
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
  "last_heartbeat_at": "2026-10-30T13:09:12.803256Z",
  "last_location_at": "2026-10-30T13:09:12.803256Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/33a502af-8b6c-4455-b81f-8117df80c3b6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:10:22Z",
    "sequence": 1793365822405
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "33a502af-8b6c-4455-b81f-8117df80c3b6",
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
  "last_heartbeat_at": "2026-10-30T13:10:22.420766Z",
  "last_location_at": "2026-10-30T13:10:22.420766Z",
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
  "session_id": "33a502af-8b6c-4455-b81f-8117df80c3b6",
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
  "last_heartbeat_at": "2026-10-30T13:10:22.420766Z",
  "last_location_at": "2026-10-30T13:10:22.420766Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/33a502af-8b6c-4455-b81f-8117df80c3b6/close` → **200**

```json
{
  "command_id": "bacc20b9-60dd-4de9-bfd9-404539eb472b",
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
  "correlation_id": "cecb3138-4f88-4b9c-9249-04e7bdd25544"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672474701",
  "device_ref": "sandbox-8321"
}
```

```json
{
  "challenge_id": "edddcc73-b3ef-4ae3-8494-fd7c5d36c016",
  "expires_at": "2026-10-30T13:15:23.438241117Z",
  "resend_available_at": "2026-10-30T13:10:24.438241117Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672474701` → **200**

```json
{
  "phone": "+380672474701",
  "audience": "CLIENT",
  "code": "810069",
  "sent_at": "2026-10-30T13:10:23.440527858Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "edddcc73-b3ef-4ae3-8494-fd7c5d36c016",
  "code": "810069",
  "device_ref": "sandbox-8321"
}
```

```json
{
  "session_id": "2be8601c-97b3-45d4-8c60-f82f313988b4",
  "subject": {
    "type": "CLIENT",
    "id": "b396522e-5ad5-4da8-86a5-c93638282353"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk2NTIyZS01YWQ1LTRkYTgtODZhNS1jOTM2MzgyODIzNTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NzIzLCJpYXQiOjE3OTMzNjU4MjMsImp0aSI6ImNkYTcxMjRlLWJlZDQtNGJmZC04ODJkLWUzODJmZDhiMjJlYiIsInNpZCI6IjJiZTg2MDFjLTk3YjMtNDVkNC04YzYwLWY4MmYzMTM5ODhiNCJ9.OO0FfdFkpshB1KfzQl8_rOvF9yakli6-hoSFvKSScjk",
  "access_expires_at": "2026-10-30T13:25:23.648715655Z",
  "refresh_token": "6omKIgGG9_1COmWJj2JeOaRXwxlD4gPXG92VjV7MGbE",
  "refresh_expires_at": "2026-11-29T13:10:23.64833984Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "f2258074-6b41-4d31-92f6-8965dc441c97",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "c4821a49-8362-411b-8390-3c0871ece20c",
  "upload_path": "/api/rider/v1/uploads/c4821a49-8362-411b-8390-3c0871ece20c",
  "expires_at": "2026-10-30T13:25:23.853085659Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/c4821a49-8362-411b-8390-3c0871ece20c` → **200**

```json
{
  "file_id": "c4821a49-8362-411b-8390-3c0871ece20c",
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
  "command_id": "08c8b86b-e1ff-41cd-b54d-2d7c6c0dbf1d",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "47dfa52c-f9a7-4745-a06a-e4fb0e196673",
  "upload_path": "/api/rider/v1/uploads/47dfa52c-f9a7-4745-a06a-e4fb0e196673",
  "expires_at": "2026-10-30T13:25:24.076680241Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/47dfa52c-f9a7-4745-a06a-e4fb0e196673` → **200**

```json
{
  "file_id": "47dfa52c-f9a7-4745-a06a-e4fb0e196673",
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
  "command_id": "1c95b32a-7143-4967-bd51-548d51bafbaf",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "90a84995-e5d6-4614-8628-71c79cd286a5",
  "upload_path": "/api/rider/v1/uploads/90a84995-e5d6-4614-8628-71c79cd286a5",
  "expires_at": "2026-10-30T13:25:24.289147729Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/90a84995-e5d6-4614-8628-71c79cd286a5` → **200**

```json
{
  "file_id": "90a84995-e5d6-4614-8628-71c79cd286a5",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "2a684817-34ad-4037-89d8-0671125be89a",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "90a84995-e5d6-4614-8628-71c79cd286a5"
  ]
}
```

```json
{
  "id": "085b43db-5f10-4820-a625-99a28807eed8",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b396522e-5ad5-4da8-86a5-c93638282353",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T13:10:24.501154Z",
  "updated_at": "2026-10-30T13:10:24.501154Z",
  "respond_by": "2026-10-30T17:10:24.501154Z",
  "messages": [
    {
      "id": "d4ad3844-8b8a-487c-b112-a5ef5ca117d0",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b396522e-5ad5-4da8-86a5-c93638282353",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:10:24.502306Z",
      "attachments": [
        {
          "file_id": "90a84995-e5d6-4614-8628-71c79cd286a5",
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
  "session_id": "06af4f12-18cf-4cb3-a831-2f8719f6a634",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY3MjQsImlhdCI6MTc5MzM2NTgyNCwianRpIjoiOWU3YTM1ZTctMmE0Ny00YjY3LTlkMzAtOGNkNjNmYzdhODk5Iiwic2lkIjoiMDZhZjRmMTItMThjZi00Y2IzLWE4MzEtMmY4NzE5ZjZhNjM0In0.QF4HohRWmXqmaZV_UOB4PRsKAd5NvoyBMzUDPDf3RbU",
  "access_expires_at": "2026-10-30T13:25:24.919453223Z",
  "refresh_token": "a8hX-KDR3sSD8FUKIQfckcoVqNQdmdf63rsgF0BmPEM",
  "refresh_expires_at": "2026-10-31T01:10:24.919084298Z",
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
  "session_id": "9c3626d8-62f5-4a53-8d68-4ac2f03a7bbd",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY3MjUsImlhdCI6MTc5MzM2NTgyNSwianRpIjoiYTE2YjkwNDQtYzM4Yi00MGI2LWJhZmUtZDFjMGFkNDEwN2MxIiwic2lkIjoiOWMzNjI2ZDgtNjJmNS00YTUzLThkNjgtNGFjMmYwM2E3YmJkIn0.BsXTcg7NWn8uWyr7e2OpYHVrYlH57yJqsw9-7m6ojQA",
  "access_expires_at": "2026-10-30T13:25:25.313055489Z",
  "refresh_token": "Vwrz6bPrhAM1yEpUV-uXfAy0YvXTNWekFHehyXYzmP8",
  "refresh_expires_at": "2026-10-31T01:10:25.312616729Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/085b43db-5f10-4820-a625-99a28807eed8/attachments/90a84995-e5d6-4614-8628-71c79cd286a5` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "b33374ae-b030-4186-9bf5-8a458f3d1761",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "0e773e56-3e18-4b92-bf4b-913fb5173975",
  "upload_path": "/api/operator/v1/uploads/0e773e56-3e18-4b92-bf4b-913fb5173975",
  "expires_at": "2026-10-30T13:25:25.519801802Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/0e773e56-3e18-4b92-bf4b-913fb5173975` → **200**

```json
{
  "file_id": "0e773e56-3e18-4b92-bf4b-913fb5173975",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/085b43db-5f10-4820-a625-99a28807eed8` → **200**

```json
{
  "id": "085b43db-5f10-4820-a625-99a28807eed8",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b396522e-5ad5-4da8-86a5-c93638282353",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T13:10:24.501154Z",
  "updated_at": "2026-10-30T13:10:24.501154Z",
  "respond_by": "2026-10-30T17:10:24.501154Z",
  "messages": [
    {
      "id": "d4ad3844-8b8a-487c-b112-a5ef5ca117d0",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b396522e-5ad5-4da8-86a5-c93638282353",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:10:24.502306Z",
      "attachments": [
        {
          "file_id": "90a84995-e5d6-4614-8628-71c79cd286a5",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/085b43db-5f10-4820-a625-99a28807eed8/comments` → **200**

```json
{
  "command_id": "3f9c44a1-5d94-4e61-8b98-8d7babfcecac",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "0e773e56-3e18-4b92-bf4b-913fb5173975"
  ]
}
```

```json
{
  "id": "085b43db-5f10-4820-a625-99a28807eed8",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b396522e-5ad5-4da8-86a5-c93638282353",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T13:10:24.501154Z",
  "updated_at": "2026-10-30T13:10:25.980436Z",
  "respond_by": "2026-10-30T17:10:24.501154Z",
  "messages": [
    {
      "id": "d4ad3844-8b8a-487c-b112-a5ef5ca117d0",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b396522e-5ad5-4da8-86a5-c93638282353",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:10:24.502306Z",
      "attachments": [
        {
          "file_id": "90a84995-e5d6-4614-8628-71c79cd286a5",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "bccdf8af-f6c8-43b8-9b09-205a520bfb7c",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "87983110-3c7f-42d1-8f17-34a004597065",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T13:10:25.980104Z",
      "attachments": [
        {
          "file_id": "0e773e56-3e18-4b92-bf4b-913fb5173975",
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

`GET /api/rider/v1/support/cases/085b43db-5f10-4820-a625-99a28807eed8` → **200**

```json
{
  "id": "085b43db-5f10-4820-a625-99a28807eed8",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b396522e-5ad5-4da8-86a5-c93638282353",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T13:10:24.501154Z",
  "updated_at": "2026-10-30T13:10:25.980436Z",
  "respond_by": "2026-10-30T17:10:24.501154Z",
  "messages": [
    {
      "id": "d4ad3844-8b8a-487c-b112-a5ef5ca117d0",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b396522e-5ad5-4da8-86a5-c93638282353",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:10:24.502306Z",
      "attachments": [
        {
          "file_id": "90a84995-e5d6-4614-8628-71c79cd286a5",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "bccdf8af-f6c8-43b8-9b09-205a520bfb7c",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T13:10:25.980104Z",
      "attachments": [
        {
          "file_id": "0e773e56-3e18-4b92-bf4b-913fb5173975",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/085b43db-5f10-4820-a625-99a28807eed8/attachments/0e773e56-3e18-4b92-bf4b-913fb5173975` → **200**

Done: support case 085b43db-5f10-4820-a625-99a28807eed8, rider attachment 90a84995-e5d6-4614-8628-71c79cd286a5, operator attachment 0e773e56-3e18-4b92-bf4b-913fb5173975.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734249938",
  "device_ref": "sandbox-11417"
}
```

```json
{
  "challenge_id": "8decafff-d591-486b-89c2-d768e9eaeb4a",
  "expires_at": "2026-10-30T13:15:26.400328017Z",
  "resend_available_at": "2026-10-30T13:10:27.400328017Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734249938` → **200**

```json
{
  "phone": "+380734249938",
  "audience": "CLIENT",
  "code": "842962",
  "sent_at": "2026-10-30T13:10:26.402074295Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8decafff-d591-486b-89c2-d768e9eaeb4a",
  "code": "842962",
  "device_ref": "sandbox-11417"
}
```

```json
{
  "session_id": "cbb6b112-3d71-44fa-9b01-9c0b73fa1f0e",
  "subject": {
    "type": "CLIENT",
    "id": "39aed4a5-6c71-48fc-8ca2-f9a730dabcd4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOWFlZDRhNS02YzcxLTQ4ZmMtOGNhMi1mOWE3MzBkYWJjZDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NzI2LCJpYXQiOjE3OTMzNjU4MjYsImp0aSI6ImU5YTdjMWMwLTYzODQtNDlkZC1iYzUzLTk3MmI5M2IyYjhiOCIsInNpZCI6ImNiYjZiMTEyLTNkNzEtNDRmYS05YjAxLTljMGI3M2ZhMWYwZSJ9.uqFFcYXomsKuyE5iGi4-n93mT89nfimvNuW5Vs_W5f8",
  "access_expires_at": "2026-10-30T13:25:26.615159818Z",
  "refresh_token": "v3BFdnDBkIsqEiF9VxBSiVjOd-yqFlAI6TblEMcYlNA",
  "refresh_expires_at": "2026-11-29T13:10:26.614770622Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "0f17002e-14b5-4b94-b9d3-9e6d133ffc82",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "9e385d75-364d-47fe-a2d1-7074e57152f4",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-9e385d75-364d-47fe-a2d1-7074e57152f4",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "d32d2679e059769e55a15eda9f8c5cdf",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=9e385d75-364d-47fe-a2d1-7074e57152f4",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734249938"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=9e385d75-364d-47fe-a2d1-7074e57152f4",
  "expires_at": "2026-10-30T13:40:26.807384Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/9e385d75-364d-47fe-a2d1-7074e57152f4` → **200**

```json
{
  "id": "9e385d75-364d-47fe-a2d1-7074e57152f4",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:40:26.807384Z",
  "card": {
    "id": "c321ff36-a253-4aeb-b3da-7a768d3c88e6",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6199",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:10:27.002119Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b59ce198-c0c6-4944-beb2-42e5dbc0db0c",
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
  "id": "2931cb8a-6058-4e5d-bfb4-e2a5f36a2dca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:15:27.223591Z",
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

`POST /api/rider/v1/orders` → **202**

```json
{
  "command_id": "5aef1bd0-6adc-4b05-93f9-e0ac6f2caa58",
  "quote_id": "2931cb8a-6058-4e5d-bfb4-e2a5f36a2dca",
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
  "id": "d2dbf87a-18f6-4193-b0a1-658ae8b5757c",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "39aed4a5-6c71-48fc-8ca2-f9a730dabcd4",
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
  "created_at": "2026-10-30T13:10:27.426558Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d2dbf87a-18f6-4193-b0a1-658ae8b5757c` → **200**

```json
{
  "id": "d2dbf87a-18f6-4193-b0a1-658ae8b5757c",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "39aed4a5-6c71-48fc-8ca2-f9a730dabcd4",
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
  "created_at": "2026-10-30T13:10:27.426558Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d2dbf87a-18f6-4193-b0a1-658ae8b5757c` → **200**

```json
{
  "id": "d2dbf87a-18f6-4193-b0a1-658ae8b5757c",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "39aed4a5-6c71-48fc-8ca2-f9a730dabcd4",
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
  "created_at": "2026-10-30T13:10:27.426558Z",
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

`GET /api/rider/v1/orders/d2dbf87a-18f6-4193-b0a1-658ae8b5757c` → **200**

```json
{
  "id": "d2dbf87a-18f6-4193-b0a1-658ae8b5757c",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "39aed4a5-6c71-48fc-8ca2-f9a730dabcd4",
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
  "created_at": "2026-10-30T13:10:27.426558Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d2dbf87a-18f6-4193-b0a1-658ae8b5757c/switch-to-cash` → **200**

```json
{
  "command_id": "cdd614b7-b374-437d-b37b-e07737121ffa",
  "expected_version": 3
}
```

```json
{
  "id": "d2dbf87a-18f6-4193-b0a1-658ae8b5757c",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "39aed4a5-6c71-48fc-8ca2-f9a730dabcd4",
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
  "created_at": "2026-10-30T13:10:27.426558Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d2dbf87a-18f6-4193-b0a1-658ae8b5757c/switch-to-cash` → **409**

```json
{
  "command_id": "c28c9e32-8654-46a6-b358-021428c02a4c",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/d2dbf87a-18f6-4193-b0a1-658ae8b5757c/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1acc247e-57d8-4a8c-b2bd-93da0df90824"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/d2dbf87a-18f6-4193-b0a1-658ae8b5757c` → **200**

```json
{
  "id": "d2dbf87a-18f6-4193-b0a1-658ae8b5757c",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "39aed4a5-6c71-48fc-8ca2-f9a730dabcd4",
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
  "created_at": "2026-10-30T13:10:27.426558Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d2dbf87a-18f6-4193-b0a1-658ae8b5757c/cancel` → **200**

```json
{
  "command_id": "5984fb3d-fffb-413b-b63e-fb1f81868ede",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d2dbf87a-18f6-4193-b0a1-658ae8b5757c",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "39aed4a5-6c71-48fc-8ca2-f9a730dabcd4",
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
  "created_at": "2026-10-30T13:10:27.426558Z",
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
  "session_id": "fafc10cb-fc34-48e3-9147-4e31cb165cdb",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY3MzAsImlhdCI6MTc5MzM2NTgzMCwianRpIjoiMGYyYzI3ZGQtNjVmNy00MzJlLTg1ZGYtMWJkMzQ2NWUxZDliIiwic2lkIjoiZmFmYzEwY2ItZmMzNC00OGUzLTkxNDctNGUzMWNiMTY1Y2RiIn0.6taUmny6y6vEAeizyVkV9ODhG_kKbxnIqKhwO1GKB0Y",
  "access_expires_at": "2026-10-30T13:25:30.308454515Z",
  "refresh_token": "4lXEpw8vcPoI0ThuqEH7du2JFSjWg2w7MndVTaTX54o",
  "refresh_expires_at": "2026-10-31T01:10:30.308041418Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-26647"
}
```

```json
{
  "challenge_id": "83f6efdf-ba09-4a75-8eaa-32b72b9e02d9",
  "expires_at": "2026-10-30T13:15:30.504395149Z",
  "resend_available_at": "2026-10-30T13:10:31.504395149Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "204713",
  "sent_at": "2026-10-30T13:10:30.507291147Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "83f6efdf-ba09-4a75-8eaa-32b72b9e02d9",
  "code": "204713",
  "device_ref": "sandbox-26647"
}
```

```json
{
  "session_id": "227dc8f0-59fc-4e1a-ae25-2210634acc72",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjczMCwiaWF0IjoxNzkzMzY1ODMwLCJqdGkiOiIzYTRjMzM3Mi05YmUwLTQ1ZTUtOTBhZS1mY2VlMTQ1NzljMGIiLCJzaWQiOiIyMjdkYzhmMC01OWZjLTRlMWEtYWUyNS0yMjEwNjM0YWNjNzIifQ.INAOSheruROKtKQo766jucJVfg54vrjkSRnMGjNRmZ8",
  "access_expires_at": "2026-10-30T13:25:30.729187873Z",
  "refresh_token": "cOuwdkrrHMG-TfaZYg6b865ylsoUYThcQXepzQsTnGA",
  "refresh_expires_at": "2026-11-29T13:10:30.728802583Z",
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
  },
  "phone": "+380500000003",
  "history": [],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "b12ec1be-2abf-40a6-b0af-05ce811d8d42",
  "expected_version": 6,
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
  "version": 7,
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
  "device_ref": "sandbox-9470"
}
```

```json
{
  "challenge_id": "ad84ceb6-9401-4edc-aca3-7399661fcf43",
  "expires_at": "2026-10-30T13:15:31.530156245Z",
  "resend_available_at": "2026-10-30T13:10:32.530156245Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "032412",
  "sent_at": "2026-10-30T13:10:31.532526386Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad84ceb6-9401-4edc-aca3-7399661fcf43",
  "code": "032412",
  "device_ref": "sandbox-9470"
}
```

```json
{
  "session_id": "bcd0b95b-e6e6-487c-a80b-c25717812235",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjczMSwiaWF0IjoxNzkzMzY1ODMxLCJqdGkiOiIxYzFmMWVlOS05MjA5LTQ5N2MtOGM0NC01NzY2MjlhZmJiZWQiLCJzaWQiOiJiY2QwYjk1Yi1lNmU2LTQ4N2MtYTgwYi1jMjU3MTc4MTIyMzUifQ.ioe8h9F3Y4ZmDkRTJKGHiQg6saikl_XsniVn50HfEFg",
  "access_expires_at": "2026-10-30T13:25:31.74763681Z",
  "refresh_token": "Wt4UOvLRObUQf-G1CXUDX2q0SzEFGUS-qJT2G2xwdsw",
  "refresh_expires_at": "2026-11-29T13:10:31.747292482Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7329c41c-8625-4fd5-a394-f40d907c03bc",
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
  "last_heartbeat_at": "2026-10-30T13:10:06.951457Z",
  "last_location_at": "2026-10-30T13:10:06.951457Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7329c41c-8625-4fd5-a394-f40d907c03bc/handover` → **200**

```json
{
  "command_id": "8bf88066-eddf-48bb-8289-c00490abe50a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7329c41c-8625-4fd5-a394-f40d907c03bc",
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
  "last_heartbeat_at": "2026-10-30T13:10:06.951457Z",
  "last_location_at": "2026-10-30T13:10:06.951457Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

(the car drives 23 s to the next point)

`POST /api/driver/v1/work-sessions/7329c41c-8625-4fd5-a394-f40d907c03bc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:10:55Z",
    "sequence": 1793365855338
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7329c41c-8625-4fd5-a394-f40d907c03bc",
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
  "last_heartbeat_at": "2026-10-30T13:10:55.353491Z",
  "last_location_at": "2026-10-30T13:10:55.353491Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7203e6f9-0d1a-4700-811e-b8d033b1a38c",
  "session_version": 1,
  "session_state": "CLOSING",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T13:02:45.329713Z",
  "last_location_at": "2026-10-30T13:02:45.329713Z",
  "eligible": false,
  "ineligible_reasons": [
    "SESSION_CLOSING",
    "INTENT_PAUSE_AFTER_CURRENT",
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/7203e6f9-0d1a-4700-811e-b8d033b1a38c/handover` → **200**

```json
{
  "command_id": "29f34d89-cd45-47b6-8e40-1fc770f2c830",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7203e6f9-0d1a-4700-811e-b8d033b1a38c",
  "session_version": 2,
  "session_state": "CLOSING",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T13:02:45.329713Z",
  "last_location_at": "2026-10-30T13:02:45.329713Z",
  "eligible": false,
  "ineligible_reasons": [
    "SESSION_CLOSING",
    "INTENT_PAUSE_AFTER_CURRENT",
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/7203e6f9-0d1a-4700-811e-b8d033b1a38c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:10:55Z",
    "sequence": 1793365855965
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7203e6f9-0d1a-4700-811e-b8d033b1a38c",
  "session_version": 2,
  "session_state": "CLOSING",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T13:10:55.9805Z",
  "last_location_at": "2026-10-30T13:10:55.9805Z",
  "eligible": false,
  "ineligible_reasons": [
    "SESSION_CLOSING",
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
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
  "session_id": "73174232-dd18-4604-a1ca-b0421d40a2d2",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY3NTYsImlhdCI6MTc5MzM2NTg1NiwianRpIjoiOWQxOGZiZjgtZWI1NS00OTY2LWEzYzctMTIwOTY0YWM3OTMzIiwic2lkIjoiNzMxNzQyMzItZGQxOC00NjA0LWExY2EtYjA0MjFkNDBhMmQyIn0.kpTHwtnmT48nEl4KaO-VfXy-DhKr91XX78086ejG3oI",
  "access_expires_at": "2026-10-30T13:25:56.440703229Z",
  "refresh_token": "qQVefyZjRctCxAF_Hu6kLWmw_GrGGDvaAV-dNw8mMgk",
  "refresh_expires_at": "2026-10-31T01:10:56.440270468Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2aa08f81-d201-445c-9ddb-90470dde9fe2",
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
  "id": "7380250e-1196-486e-aa6e-a8d712a74b03",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:15:56.637781Z",
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
  "command_id": "566166ed-ee4d-425f-9cf9-2b5eba9697ce",
  "quote_id": "7380250e-1196-486e-aa6e-a8d712a74b03",
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
  "id": "9c73e6ca-4fc8-4673-9ce6-5f1da4cfee64",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:10:56.843127Z",
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
[]
```

`POST /api/driver/v1/offers/null/accept` → **400**

```json
{
  "command_id": "7b685c8b-b678-4f10-96a8-2fb937c2f713"
}
```

```json
{
  "instance": "/api/driver/v1/offers/null/accept",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "25c57971-5f41-4dc4-b52f-5c8cfa583e3d"
}
```

**Expected 200, got 400 — scenario stopped.**

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14927"
}
```

```json
{
  "challenge_id": "98660913-256f-4363-b69c-42e1cd1a50e3",
  "expires_at": "2026-10-30T13:15:57.654545844Z",
  "resend_available_at": "2026-10-30T13:10:58.654545844Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "456465",
  "sent_at": "2026-10-30T13:10:57.656475757Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98660913-256f-4363-b69c-42e1cd1a50e3",
  "code": "456465",
  "device_ref": "sandbox-14927"
}
```

```json
{
  "session_id": "eddaac74-a9ad-4d68-901c-1310641e5ef7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Njc1NywiaWF0IjoxNzkzMzY1ODU3LCJqdGkiOiI4NmVlNTIyZC0yOWZiLTRlZTMtOTNkOS04NDZjODU1MzJkMDEiLCJzaWQiOiJlZGRhYWM3NC1hOWFkLTRkNjgtOTAxYy0xMzEwNjQxZTVlZjcifQ.h0ybiUruRety-Q2H8NPGfxSnltJIpJExnzxuBlMzONg",
  "access_expires_at": "2026-10-30T13:25:57.88008939Z",
  "refresh_token": "__N_ifUbiJjmQR-2c933iuV4atGyjbgeN4YeVRiYqgY",
  "refresh_expires_at": "2026-11-29T13:10:57.879654491Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7329c41c-8625-4fd5-a394-f40d907c03bc",
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
  "last_heartbeat_at": "2026-10-30T13:10:55.353491Z",
  "last_location_at": "2026-10-30T13:10:55.353491Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7329c41c-8625-4fd5-a394-f40d907c03bc/close` → **409**

```json
{
  "command_id": "a0455309-cd2f-4a91-b5e0-e0d861426f51",
  "expected_version": 1
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions/7329c41c-8625-4fd5-a394-f40d907c03bc/close",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3d86258f-e430-487c-93df-3563db0ce35f"
}
```

**Expected 200, got 409 — scenario stopped.**

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
  "session_id": "c021472b-f1f2-43ef-9ae5-fcb87e7ec41c",
  "subject": {
    "type": "STAFF",
    "id": "87983110-3c7f-42d1-8f17-34a004597065"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzk4MzExMC0zYzdmLTQyZDEtOGYxNy0zNGEwMDQ1OTcwNjUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY3NTgsImlhdCI6MTc5MzM2NTg1OCwianRpIjoiNTdhYjQyYmUtMmZkMi00NWMzLTkxZWItODRkMTllMWE4NmI4Iiwic2lkIjoiYzAyMTQ3MmItZjFmMi00M2VmLTlhZTUtZmNiODdlN2VjNDFjIn0.7MxFjWLYA04AokN31FAZA4Pf0_WHRQab1pru3SMCBkc",
  "access_expires_at": "2026-10-30T13:25:58.705662715Z",
  "refresh_token": "TglrbBBzD0oW9EiRwcEvyik6OXaZcYlp-h44KxP7-iM",
  "refresh_expires_at": "2026-10-31T01:10:58.705296374Z",
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
  "id": "cb88708a-17f1-4308-92a0-c5315b7154f9",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:10:58.937775Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 9,
  "provider_count": 9,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:10:58.937826Z",
  "updated_at": "2026-10-30T13:10:58.951557Z",
  "finished_at": "2026-10-30T13:10:58.951557Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/cb88708a-17f1-4308-92a0-c5315b7154f9` → **200**

```json
{
  "run": {
    "id": "cb88708a-17f1-4308-92a0-c5315b7154f9",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:10:58.937775Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 9,
    "provider_count": 9,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:10:58.937826Z",
    "updated_at": "2026-10-30T13:10:58.951557Z",
    "finished_at": "2026-10-30T13:10:58.951557Z",
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
  "id": "cb88708a-17f1-4308-92a0-c5315b7154f9",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:10:58.937775Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 9,
  "provider_count": 9,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:10:58.937826Z",
  "updated_at": "2026-10-30T13:10:58.951557Z",
  "finished_at": "2026-10-30T13:10:58.951557Z",
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
  "id": "cb88708a-17f1-4308-92a0-c5315b7154f9",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:10:58.937775Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 9,
  "provider_count": 9,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:10:58.937826Z",
  "updated_at": "2026-10-30T13:10:58.951557Z",
  "finished_at": "2026-10-30T13:10:58.951557Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/5084083e-17b7-46c5-9c24-4d019665a273` → **204**

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
  "id": "2dd4e088-fea9-4960-a800-3979676a283c",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:10:59.287171Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:10:59.287216Z",
  "updated_at": "2026-10-30T13:10:59.293131Z",
  "finished_at": "2026-10-30T13:10:59.293131Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/2dd4e088-fea9-4960-a800-3979676a283c` → **200**

```json
{
  "run": {
    "id": "2dd4e088-fea9-4960-a800-3979676a283c",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:10:59.287171Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:10:59.287216Z",
    "updated_at": "2026-10-30T13:10:59.293131Z",
    "finished_at": "2026-10-30T13:10:59.293131Z",
    "version": 1
  },
  "items": [
    {
      "id": "06b1f1f6-ce77-4c60-9816-3b3e77579947",
      "run_id": "2dd4e088-fea9-4960-a800-3979676a283c",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "ab4bf843ad2952887a4cc37cbd1cb3a75cf17f0b0179ea8bfa9a0598c29d5711",
      "reference_display": "sandbox-reconciliation-#####e-17b7-46c5-9c24-4d#####a273",
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
      "provider_at": "2026-10-30T13:10:59Z",
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
  "id": "2dd4e088-fea9-4960-a800-3979676a283c",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:10:59.287171Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:10:59.287216Z",
  "updated_at": "2026-10-30T13:10:59.293131Z",
  "finished_at": "2026-10-30T13:10:59.293131Z",
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
  "id": "2dd4e088-fea9-4960-a800-3979676a283c",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:10:59.287171Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:10:59.287216Z",
  "updated_at": "2026-10-30T13:10:59.293131Z",
  "finished_at": "2026-10-30T13:10:59.293131Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/06b1f1f6-ce77-4c60-9816-3b3e77579947/resolve` → **200**

```json
{
  "command_id": "cfe3050c-33b7-4a54-8851-689b939e6044",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "06b1f1f6-ce77-4c60-9816-3b3e77579947",
  "run_id": "2dd4e088-fea9-4960-a800-3979676a283c",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "ab4bf843ad2952887a4cc37cbd1cb3a75cf17f0b0179ea8bfa9a0598c29d5711",
  "reference_display": "sandbox-reconciliation-#####e-17b7-46c5-9c24-4d#####a273",
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
  "provider_at": "2026-10-30T13:10:59Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "resolved_at": "2026-10-30T13:10:59.610782Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/06b1f1f6-ce77-4c60-9816-3b3e77579947/resolve` → **200**

```json
{
  "command_id": "cfe3050c-33b7-4a54-8851-689b939e6044",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "06b1f1f6-ce77-4c60-9816-3b3e77579947",
  "run_id": "2dd4e088-fea9-4960-a800-3979676a283c",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "ab4bf843ad2952887a4cc37cbd1cb3a75cf17f0b0179ea8bfa9a0598c29d5711",
  "reference_display": "sandbox-reconciliation-#####e-17b7-46c5-9c24-4d#####a273",
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
  "provider_at": "2026-10-30T13:10:59Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "87983110-3c7f-42d1-8f17-34a004597065",
  "resolved_at": "2026-10-30T13:10:59.610782Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/06b1f1f6-ce77-4c60-9816-3b3e77579947/resolve` → **409**

```json
{
  "command_id": "7ece5599-aebc-4229-96d3-7bea4f74531e",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/06b1f1f6-ce77-4c60-9816-3b3e77579947/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1f360e18-7d05-423b-87e4-0a19578b720e"
}
```

`GET /api/admin/v1/payment-reconciliations/2dd4e088-fea9-4960-a800-3979676a283c` → **200**

```json
{
  "run": {
    "id": "2dd4e088-fea9-4960-a800-3979676a283c",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:10:59.287171Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:10:59.287216Z",
    "updated_at": "2026-10-30T13:10:59.610782Z",
    "finished_at": "2026-10-30T13:10:59.293131Z",
    "version": 2
  },
  "items": [
    {
      "id": "06b1f1f6-ce77-4c60-9816-3b3e77579947",
      "run_id": "2dd4e088-fea9-4960-a800-3979676a283c",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "ab4bf843ad2952887a4cc37cbd1cb3a75cf17f0b0179ea8bfa9a0598c29d5711",
      "reference_display": "sandbox-reconciliation-#####e-17b7-46c5-9c24-4d#####a273",
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
      "provider_at": "2026-10-30T13:10:59Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "87983110-3c7f-42d1-8f17-34a004597065",
      "resolved_at": "2026-10-30T13:10:59.610782Z",
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
      "id": "2dd4e088-fea9-4960-a800-3979676a283c",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T13:10:59.287171Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T13:10:59.287216Z",
      "updated_at": "2026-10-30T13:10:59.610782Z",
      "finished_at": "2026-10-30T13:10:59.293131Z",
      "version": 2
    },
    {
      "id": "6c00015d-8b38-42e5-a7a8-206f8cff311b",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T12:57:45.3946Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T12:57:45.394648Z",
      "updated_at": "2026-10-30T12:57:45.398336Z",
      "finished_at": "2026-10-30T12:57:45.398336Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/5084083e-17b7-46c5-9c24-4d019665a273` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "2dd4e088-fea9-4960-a800-3979676a283c",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:10:59.287171Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:10:59.287216Z",
  "updated_at": "2026-10-30T13:10:59.610782Z",
  "finished_at": "2026-10-30T13:10:59.293131Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793365985619E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793365985841E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793365985842E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793365985619E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793365985842E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
