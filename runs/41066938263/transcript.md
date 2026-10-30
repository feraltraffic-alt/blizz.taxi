# Sandbox transcript (2026-10-30T13:53:55Z, cf8b6a7)

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
  "correlation_id": "141c7226-5b16-47a1-9a21-2fe35153ad71"
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
  "session_id": "5b6ba8be-cec0-4f03-8860-45153bbf2d21",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjkzNDMsImlhdCI6MTc5MzM2ODQ0MywianRpIjoiYjAxYmNjYTQtZTJjZi00MGMyLTgyNTktMTlkYWY1NmU4YWQ3Iiwic2lkIjoiNWI2YmE4YmUtY2VjMC00ZjAzLTg4NjAtNDUxNTNiYmYyZDIxIn0.bwk5qpmfABmHer891DR_OFLoJVTqlg2Rb-g3xor1ZAg",
  "access_expires_at": "2026-10-30T14:09:03.077375668Z",
  "refresh_token": "rwYBQsB8WKHdeGPmcsLFF_0Un924D7CnABTODUVcMb4",
  "refresh_expires_at": "2026-10-31T01:54:03.07479988Z",
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
  "session_id": "2bceb3cc-8a12-47c3-8ff6-f348f6c29dff",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjkzNDQsImlhdCI6MTc5MzM2ODQ0NCwianRpIjoiODlhMGMwODktMDE3OC00ZDI2LWE5NzAtYzRlODdhZTMzY2ExIiwic2lkIjoiMmJjZWIzY2MtOGExMi00N2MzLThmZjYtZjM0OGY2YzI5ZGZmIn0.sKvjJV8LX6uoIvKoOG6oOMpZwmj5T0ENll8mN3ITXWg",
  "access_expires_at": "2026-10-30T14:09:04.952524809Z",
  "refresh_token": "E3LSM03tTmIkO_SX4qUxSEgWXHKOgXE7lx_kBvLdoOk",
  "refresh_expires_at": "2026-10-31T01:54:04.951505763Z",
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
  "device_ref": "sandbox-2886"
}
```

```json
{
  "challenge_id": "2f063db2-8a12-42f2-8518-28804d133836",
  "expires_at": "2026-10-30T13:59:05.613606024Z",
  "resend_available_at": "2026-10-30T13:54:06.613606024Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "584121",
  "sent_at": "2026-10-30T13:54:05.626849252Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f063db2-8a12-42f2-8518-28804d133836",
  "code": "584121",
  "device_ref": "sandbox-2886"
}
```

```json
{
  "session_id": "95795966-7935-46bf-aed9-d979672a65ce",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2OTM0NSwiaWF0IjoxNzkzMzY4NDQ1LCJqdGkiOiIwNGQ2OTEzOS0wNjRkLTRiNjctYmNlZC0xYWQ5ZjJkNzJiYjgiLCJzaWQiOiI5NTc5NTk2Ni03OTM1LTQ2YmYtYWVkOS1kOTc5NjcyYTY1Y2UifQ.wojOE5v_mjT0bnkNsQnZk8rZiNdKp6XLRbAHh-kVwTs",
  "access_expires_at": "2026-10-30T14:09:05.98772318Z",
  "refresh_token": "DfbX6b_-9Mu8nolJ8w1Ufe5OUOpWmozCwIklVlu7VcQ",
  "refresh_expires_at": "2026-11-29T13:54:05.986611402Z",
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
  "command_id": "d2f43f52-0d2f-4ef5-917b-954a8dadfa7d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:54:06Z",
    "sequence": 1793368446636
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9240a98d-f5a3-4df2-b64b-78e5e3bb8103",
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
  "last_heartbeat_at": "2026-10-30T13:54:06.739212Z",
  "last_location_at": "2026-10-30T13:54:06.739212Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635689012",
  "device_ref": "sandbox-27669"
}
```

```json
{
  "challenge_id": "a0428a83-94e8-4ae3-9854-3e30d1626eba",
  "expires_at": "2026-10-30T13:59:07.091196257Z",
  "resend_available_at": "2026-10-30T13:54:08.091196257Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635689012` → **200**

```json
{
  "phone": "+380635689012",
  "audience": "CLIENT",
  "code": "082622",
  "sent_at": "2026-10-30T13:54:07.096410647Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a0428a83-94e8-4ae3-9854-3e30d1626eba",
  "code": "082622",
  "device_ref": "sandbox-27669"
}
```

```json
{
  "session_id": "332d4c0b-b0d1-4370-9444-d540641db812",
  "subject": {
    "type": "CLIENT",
    "id": "1f8a7013-e049-4a1d-a46c-e7b44b281a48"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjhhNzAxMy1lMDQ5LTRhMWQtYTQ2Yy1lN2I0NGIyODFhNDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY5MzQ3LCJpYXQiOjE3OTMzNjg0NDcsImp0aSI6Ijk3OWUxODNhLWI5YWYtNDhlZS1iMmI1LWY3M2I0ZmRmNmM0MSIsInNpZCI6IjMzMmQ0YzBiLWIwZDEtNDM3MC05NDQ0LWQ1NDA2NDFkYjgxMiJ9.9FXhAu7SfOp90002iYOl54NJgNXJmlCQgTXO0SdKf4k",
  "access_expires_at": "2026-10-30T14:09:07.435885957Z",
  "refresh_token": "gzw4LVH22SjUaSiCvL3674BvjzCyJhq_4HzJFk_8uSg",
  "refresh_expires_at": "2026-11-29T13:54:07.434929268Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d1fbae98-21a4-4764-a57d-4b67c5f4269c",
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
  "id": "bb0ec259-0453-4911-985e-f46e6c4c0181",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:59:07.793770Z",
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
  "command_id": "df35050d-a3ca-4b9f-9aee-acc48bcb4c13",
  "quote_id": "bb0ec259-0453-4911-985e-f46e6c4c0181",
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
  "id": "87bc0db2-d435-4c0a-98c4-757d8bd08161",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1f8a7013-e049-4a1d-a46c-e7b44b281a48",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:54:08.205591Z",
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
    "id": "9e9ea87c-89e3-4ef8-a4a5-3696665c3194",
    "order_id": "87bc0db2-d435-4c0a-98c4-757d8bd08161",
    "expires_at": "2026-10-30T13:54:23.216389Z",
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

`POST /api/driver/v1/offers/9e9ea87c-89e3-4ef8-a4a5-3696665c3194/accept` → **200**

```json
{
  "command_id": "7fa31d70-f40f-4de9-9883-4df60d7dbefc"
}
```

```json
{
  "id": "5a622f07-e5c7-4dcd-b045-3d0c621e8b9a",
  "order_id": "87bc0db2-d435-4c0a-98c4-757d8bd08161",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "826b6392-d4e5-489d-b2bb-7217da907ed4",
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
  "command_id": "61c9e0f9-0dd5-41f6-9d9b-a329ec57f926",
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
  "changed_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T13:54:09.570325334Z"
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
  "id": "826b6392-d4e5-489d-b2bb-7217da907ed4",
  "order_id": "87bc0db2-d435-4c0a-98c4-757d8bd08161",
  "assignment_id": "5a622f07-e5c7-4dcd-b045-3d0c621e8b9a",
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

`POST /api/driver/v1/work-sessions/9240a98d-f5a3-4df2-b64b-78e5e3bb8103/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:54:10Z",
    "sequence": 1793368450574
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9240a98d-f5a3-4df2-b64b-78e5e3bb8103",
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
  "last_heartbeat_at": "2026-10-30T13:54:10.601688Z",
  "last_location_at": "2026-10-30T13:54:10.601688Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/826b6392-d4e5-489d-b2bb-7217da907ed4/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "1dbceee9-c670-416e-bbab-58527b55bee8",
  "expected_version": 0
}
```

```json
{
  "id": "826b6392-d4e5-489d-b2bb-7217da907ed4",
  "order_id": "87bc0db2-d435-4c0a-98c4-757d8bd08161",
  "assignment_id": "5a622f07-e5c7-4dcd-b045-3d0c621e8b9a",
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
  "arrived_at": "2026-10-30T13:54:10.932957Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/826b6392-d4e5-489d-b2bb-7217da907ed4/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "a1b50e44-9398-4e77-87fd-63699fea85c4",
  "expected_version": 1
}
```

```json
{
  "id": "826b6392-d4e5-489d-b2bb-7217da907ed4",
  "order_id": "87bc0db2-d435-4c0a-98c4-757d8bd08161",
  "assignment_id": "5a622f07-e5c7-4dcd-b045-3d0c621e8b9a",
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
  "arrived_at": "2026-10-30T13:54:10.932957Z",
  "started_at": "2026-10-30T13:54:11.278907Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/826b6392-d4e5-489d-b2bb-7217da907ed4/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "bad247a3-20d6-4c65-afd0-4c8aa419268d",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:54:11Z",
  "cash_received": true
}
```

```json
{
  "id": "826b6392-d4e5-489d-b2bb-7217da907ed4",
  "order_id": "87bc0db2-d435-4c0a-98c4-757d8bd08161",
  "assignment_id": "5a622f07-e5c7-4dcd-b045-3d0c621e8b9a",
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
  "arrived_at": "2026-10-30T13:54:10.932957Z",
  "started_at": "2026-10-30T13:54:11.278907Z",
  "completed_at": "2026-10-30T13:54:11.62309Z",
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
  "session_id": "9240a98d-f5a3-4df2-b64b-78e5e3bb8103",
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
  "last_heartbeat_at": "2026-10-30T13:54:10.601688Z",
  "last_location_at": "2026-10-30T13:54:10.601688Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9240a98d-f5a3-4df2-b64b-78e5e3bb8103/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "3920e202-cb03-4fd3-b80d-e2b8a4150be8",
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
  "command_id": "5622baf4-646d-4726-9605-1d923e71ea5d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:54:12Z",
    "sequence": 1793368452548
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
  "correlation_id": "dea7985c-16d5-41f8-92fa-1e2bc3b6e944",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "47774508-60e1-4273-81f9-f6ced3adccb4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:54:12Z",
    "sequence": 1793368452884
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b66217d1-0f64-4b13-977f-c13a9b67e63b",
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
  "last_heartbeat_at": "2026-10-30T13:54:12.908705Z",
  "last_location_at": "2026-10-30T13:54:12.908705Z",
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
  "changed_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T13:54:09.570325Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "bf01b46d-780f-48c0-a4fb-dd524eb0edda",
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
  "changed_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T13:54:13.546293393Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b66217d1-0f64-4b13-977f-c13a9b67e63b",
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
  "last_heartbeat_at": "2026-10-30T13:54:12.908705Z",
  "last_location_at": "2026-10-30T13:54:12.908705Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b66217d1-0f64-4b13-977f-c13a9b67e63b/close` → **200**

```json
{
  "command_id": "d87ac7cf-5d63-419f-95d9-fd96be0cf5fb",
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
  "session_id": "bb343bb3-f08e-499d-9d5c-fbfed4b92b78",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjkzNTQsImlhdCI6MTc5MzM2ODQ1NCwianRpIjoiYTY2MDQwYjctMjIwMi00M2Y0LTgwOTctYWIzMTljZGJiN2IxIiwic2lkIjoiYmIzNDNiYjMtZjA4ZS00OTlkLTlkNWMtZmJmZWQ0YjkyYjc4In0._SZ_qSbilDrzQ5kcxRfSsY49JyVEnNGiBERNFCM5Kxo",
  "access_expires_at": "2026-10-30T14:09:14.809063685Z",
  "refresh_token": "YuY9NHIgKYBwfcC4I9impQUbkZoLupW-nZfna7uSliE",
  "refresh_expires_at": "2026-10-31T01:54:14.808168638Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "0cd14b9f-863b-4143-841c-ef6b6f9421c0",
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
  "id": "38b30e09-39c2-44ae-b75d-bdb62fe98cf8",
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
  "created_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "created_at": "2026-10-30T13:54:15.117924Z",
  "updated_at": "2026-10-30T13:54:15.117924Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632108256",
  "device_ref": "sandbox-32167"
}
```

```json
{
  "challenge_id": "54f27b16-e6f8-4af6-930f-479eae17c211",
  "expires_at": "2026-10-30T13:59:15.432631295Z",
  "resend_available_at": "2026-10-30T13:54:16.432631295Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632108256` → **200**

```json
{
  "phone": "+380632108256",
  "audience": "CLIENT",
  "code": "581522",
  "sent_at": "2026-10-30T13:54:15.437324626Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "54f27b16-e6f8-4af6-930f-479eae17c211",
  "code": "581522",
  "device_ref": "sandbox-32167"
}
```

```json
{
  "session_id": "19c126bb-78ec-4dad-afbf-be220161e99b",
  "subject": {
    "type": "CLIENT",
    "id": "b325ece4-8f42-4f72-a1de-0cf717ae577c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzI1ZWNlNC04ZjQyLTRmNzItYTFkZS0wY2Y3MTdhZTU3N2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY5MzU1LCJpYXQiOjE3OTMzNjg0NTUsImp0aSI6Ijk4YjBlNDlmLTdlZjUtNDE5Yy1iNDFhLTFkZWEyMTE1ZDQ4MCIsInNpZCI6IjE5YzEyNmJiLTc4ZWMtNGRhZC1hZmJmLWJlMjIwMTYxZTk5YiJ9.O_1JD8hJdSE6mBtlCwAhWwMe-6ixBYRL2t0rRytSa5I",
  "access_expires_at": "2026-10-30T14:09:15.778275406Z",
  "refresh_token": "Xlx3U_7LPSu09l5IOdSuqiHe4eH1PtQN44I2E1yIBW0",
  "refresh_expires_at": "2026-11-29T13:54:15.777287731Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380632108256` → **200**

```json
{
  "client_id": "b325ece4-8f42-4f72-a1de-0cf717ae577c"
}
```

`POST /api/admin/v1/rider-wallets/b325ece4-8f42-4f72-a1de-0cf717ae577c/top-ups` → **201**

```json
{
  "command_id": "19e1683b-c278-4dd3-8a61-48532db49ca1",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "b325ece4-8f42-4f72-a1de-0cf717ae577c",
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
      "id": "d11a1d5a-7565-4234-b989-b6a012cfd041",
      "at": "2026-10-30T13:54:16.419666Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "432d3ce1-762e-4c60-80de-7105d97ad61c",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c1f2066c-30c8-4485-a0b6-f899c2d18277",
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
  "id": "6a48e30a-46e4-4c0f-9ac6-b8a4f77bd208",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:59:16.758804Z",
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
      "id": "38b30e09-39c2-44ae-b75d-bdb62fe98cf8",
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
  "device_ref": "sandbox-22842"
}
```

```json
{
  "challenge_id": "ac3a257b-8e83-44eb-b90d-9365cbb82cf4",
  "expires_at": "2026-10-30T13:59:17.078367095Z",
  "resend_available_at": "2026-10-30T13:54:18.078367095Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "168634",
  "sent_at": "2026-10-30T13:54:17.082978042Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ac3a257b-8e83-44eb-b90d-9365cbb82cf4",
  "code": "168634",
  "device_ref": "sandbox-22842"
}
```

```json
{
  "session_id": "5abd31d3-0ff2-434c-bee7-f177f0ddc148",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2OTM1NywiaWF0IjoxNzkzMzY4NDU3LCJqdGkiOiJjNGMzZDczNS0xODZkLTRlY2ItYWFmMC0zN2NhM2ZlODdjNDIiLCJzaWQiOiI1YWJkMzFkMy0wZmYyLTQzNGMtYmVlNy1mMTc3ZjBkZGMxNDgifQ.wAo6zp469Kb7c9i5kaDMR8g5HBN-dmN6Vf6e0rTG5aY",
  "access_expires_at": "2026-10-30T14:09:17.429782301Z",
  "refresh_token": "NkE1-qvPXcxicbSWZiaJePMt0JMh3CqUQtpqx7RuoD0",
  "refresh_expires_at": "2026-11-29T13:54:17.428876718Z",
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
  "command_id": "c270ee71-095d-4182-8abc-ff34cab5ccff",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:54:18Z",
    "sequence": 1793368458667
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "494fa674-e9ab-46a7-bd5a-aade7653b90d",
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
  "last_heartbeat_at": "2026-10-30T13:54:18.092452Z",
  "last_location_at": "2026-10-30T13:54:18.092452Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "bb051da5-aba4-4dd4-ac50-134da3d7e7a4",
  "quote_id": "6a48e30a-46e4-4c0f-9ac6-b8a4f77bd208",
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
  "id": "8a511ed8-e7d8-4368-9e64-d9ef379951ae",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b325ece4-8f42-4f72-a1de-0cf717ae577c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:54:18.419916Z",
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
  "client_id": "b325ece4-8f42-4f72-a1de-0cf717ae577c",
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
      "id": "d11a1d5a-7565-4234-b989-b6a012cfd041",
      "at": "2026-10-30T13:54:16.419666Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "432d3ce1-762e-4c60-80de-7105d97ad61c",
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
    "id": "f95b17ce-56c2-4922-b54d-a628853a16e7",
    "order_id": "8a511ed8-e7d8-4368-9e64-d9ef379951ae",
    "expires_at": "2026-10-30T13:54:33.429387Z",
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

`POST /api/driver/v1/offers/f95b17ce-56c2-4922-b54d-a628853a16e7/accept` → **200**

```json
{
  "command_id": "20ebcda1-47cc-49f9-b7d8-3f7a52c1cd73"
}
```

```json
{
  "id": "fa7bbebe-5810-40ba-88c6-03b554716fc4",
  "order_id": "8a511ed8-e7d8-4368-9e64-d9ef379951ae",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0a5f95f5-3ba1-4f36-ae32-c90b7e8c5af1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0a5f95f5-3ba1-4f36-ae32-c90b7e8c5af1",
  "order_id": "8a511ed8-e7d8-4368-9e64-d9ef379951ae",
  "assignment_id": "fa7bbebe-5810-40ba-88c6-03b554716fc4",
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

`POST /api/driver/v1/work-sessions/494fa674-e9ab-46a7-bd5a-aade7653b90d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:54:22Z",
    "sequence": 1793368462764
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "494fa674-e9ab-46a7-bd5a-aade7653b90d",
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
  "last_heartbeat_at": "2026-10-30T13:54:22.098735Z",
  "last_location_at": "2026-10-30T13:54:22.098735Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/0a5f95f5-3ba1-4f36-ae32-c90b7e8c5af1/arrive` → **200**

```json
{
  "command_id": "ffd5318d-6e09-4875-83a3-51001f02364d",
  "expected_version": 0
}
```

```json
{
  "id": "0a5f95f5-3ba1-4f36-ae32-c90b7e8c5af1",
  "order_id": "8a511ed8-e7d8-4368-9e64-d9ef379951ae",
  "assignment_id": "fa7bbebe-5810-40ba-88c6-03b554716fc4",
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
  "arrived_at": "2026-10-30T13:54:22.426449Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0a5f95f5-3ba1-4f36-ae32-c90b7e8c5af1/start` → **200**

```json
{
  "command_id": "1ec9ab0a-3b29-400d-85c6-592e760a249c",
  "expected_version": 1
}
```

```json
{
  "id": "0a5f95f5-3ba1-4f36-ae32-c90b7e8c5af1",
  "order_id": "8a511ed8-e7d8-4368-9e64-d9ef379951ae",
  "assignment_id": "fa7bbebe-5810-40ba-88c6-03b554716fc4",
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
  "arrived_at": "2026-10-30T13:54:22.426449Z",
  "started_at": "2026-10-30T13:54:22.758987Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/0a5f95f5-3ba1-4f36-ae32-c90b7e8c5af1/complete` → **200**

```json
{
  "command_id": "841afc08-8a91-4131-b339-96b4a66cca7f",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:54:23Z",
  "cash_received": true
}
```

```json
{
  "id": "0a5f95f5-3ba1-4f36-ae32-c90b7e8c5af1",
  "order_id": "8a511ed8-e7d8-4368-9e64-d9ef379951ae",
  "assignment_id": "fa7bbebe-5810-40ba-88c6-03b554716fc4",
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
  "arrived_at": "2026-10-30T13:54:22.426449Z",
  "started_at": "2026-10-30T13:54:22.758987Z",
  "completed_at": "2026-10-30T13:54:23.102674Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "b325ece4-8f42-4f72-a1de-0cf717ae577c",
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
      "id": "20bbf39d-cbd5-4c8a-87b6-e3a62085ea37",
      "at": "2026-10-30T13:54:23.751844Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "8a511ed8-e7d8-4368-9e64-d9ef379951ae"
    },
    {
      "id": "d11a1d5a-7565-4234-b989-b6a012cfd041",
      "at": "2026-10-30T13:54:16.419666Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "432d3ce1-762e-4c60-80de-7105d97ad61c",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/38b30e09-39c2-44ae-b75d-bdb62fe98cf8/archive` → **200**

```json
{
  "command_id": "5c891f71-16fe-449e-b989-e7ec4d1acc38",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "38b30e09-39c2-44ae-b75d-bdb62fe98cf8",
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
  "created_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "created_at": "2026-10-30T13:54:15.117924Z",
  "updated_at": "2026-10-30T13:54:26.759909Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "494fa674-e9ab-46a7-bd5a-aade7653b90d",
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
  "last_heartbeat_at": "2026-10-30T13:54:22.098735Z",
  "last_location_at": "2026-10-30T13:54:22.098735Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/494fa674-e9ab-46a7-bd5a-aade7653b90d/close` → **200**

```json
{
  "command_id": "62036124-9136-4e0f-aef1-7d4841321314",
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

Done: order 8a511ed8-e7d8-4368-9e64-d9ef379951ae.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-27219"
}
```

```json
{
  "challenge_id": "ca7f3a0a-e602-4732-a701-7f28d3a8eb8b",
  "expires_at": "2026-10-30T13:59:27.718639986Z",
  "resend_available_at": "2026-10-30T13:54:28.718639986Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "792453",
  "sent_at": "2026-10-30T13:54:27.723529982Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca7f3a0a-e602-4732-a701-7f28d3a8eb8b",
  "code": "792453",
  "device_ref": "sandbox-27219"
}
```

```json
{
  "session_id": "6bb06cc0-efac-40dc-ba3f-bc728410d5a5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2OTM2OCwiaWF0IjoxNzkzMzY4NDY4LCJqdGkiOiIzYjdlNTRiMi00Y2UyLTQxNzAtOTFjNy03ZGQwZGFiNGU0ZjUiLCJzaWQiOiI2YmIwNmNjMC1lZmFjLTQwZGMtYmEzZi1iYzcyODQxMGQ1YTUifQ.yGuqpcaR94vXH0Z5_nHUR2DfZq5w7Kr67eJFxEoNOMQ",
  "access_expires_at": "2026-10-30T14:09:28.064061191Z",
  "refresh_token": "7-RLsLRnZRd9XZDEHAgwBIt1dOa_-gTPEICyxDPS4I4",
  "refresh_expires_at": "2026-11-29T13:54:28.063298025Z",
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
  "command_id": "b3a5acee-f2e1-4efa-bdff-43f07d92c0b9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:54:28Z",
    "sequence": 1793368468986
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "29768594-c1b9-4a00-8466-7ebec2f9f1d0",
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
  "last_heartbeat_at": "2026-10-30T13:54:29.009279Z",
  "last_location_at": "2026-10-30T13:54:29.009279Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/29768594-c1b9-4a00-8466-7ebec2f9f1d0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:54:34Z",
    "sequence": 1793368474309
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "29768594-c1b9-4a00-8466-7ebec2f9f1d0",
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
  "last_heartbeat_at": "2026-10-30T13:54:34.331483Z",
  "last_location_at": "2026-10-30T13:54:29.009279Z",
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
  "session_id": "6e49e72f-5fa3-4527-9b87-1fad729fd254",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjkzNzQsImlhdCI6MTc5MzM2ODQ3NCwianRpIjoiM2YxNzIwYmYtNDczNy00MDdjLTk2ZmItMjljM2Q2NWJkMjRiIiwic2lkIjoiNmU0OWU3MmYtNWZhMy00NTI3LTliODctMWZhZDcyOWZkMjU0In0.RkVNFp_fwECxkzdzsr-NmzTW4k6aqJRkw5xcDXgE5bk",
  "access_expires_at": "2026-10-30T14:09:34.965268148Z",
  "refresh_token": "F09UUNf_yy_Es2YWihbk-DkCB0JBGGhwXyb-Ww8Z7Uw",
  "refresh_expires_at": "2026-10-31T01:54:34.964543433Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T13:54:35.28047767Z",
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
      "last_location_at": "2026-10-30T13:54:29.009279Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/29768594-c1b9-4a00-8466-7ebec2f9f1d0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:54:35Z",
    "sequence": 1793368475603
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "29768594-c1b9-4a00-8466-7ebec2f9f1d0",
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
  "last_heartbeat_at": "2026-10-30T13:54:35.626611Z",
  "last_location_at": "2026-10-30T13:54:35.626611Z",
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
  "session_id": "29768594-c1b9-4a00-8466-7ebec2f9f1d0",
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
  "last_heartbeat_at": "2026-10-30T13:54:35.626611Z",
  "last_location_at": "2026-10-30T13:54:35.626611Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/29768594-c1b9-4a00-8466-7ebec2f9f1d0/close` → **200**

```json
{
  "command_id": "a26f736f-5735-450f-8202-157bfa117550",
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
  "device_ref": "sandbox-495"
}
```

```json
{
  "challenge_id": "c1c01c8a-18eb-408b-b53f-85be6b05eac3",
  "expires_at": "2026-10-30T13:59:36.581296701Z",
  "resend_available_at": "2026-10-30T13:54:37.581296701Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "458330",
  "sent_at": "2026-10-30T13:54:36.585836745Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c1c01c8a-18eb-408b-b53f-85be6b05eac3",
  "code": "458330",
  "device_ref": "sandbox-495"
}
```

```json
{
  "session_id": "d9da9cb5-e194-40dc-8c9d-d026fba281f1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2OTM3NiwiaWF0IjoxNzkzMzY4NDc2LCJqdGkiOiJhMDZkMWJmMC1iNmRlLTQzYTgtYWNmYi02NjJhM2RhMDZiN2EiLCJzaWQiOiJkOWRhOWNiNS1lMTk0LTQwZGMtOGM5ZC1kMDI2ZmJhMjgxZjEifQ.DsPl84NumNFUDqmzdwrYp6RPzIYLnUPgcdT-RIcbi_c",
  "access_expires_at": "2026-10-30T14:09:36.921585925Z",
  "refresh_token": "0bSCiiQhrPjIEognlDYcFZv2nBBTxDRNZltNmlCORms",
  "refresh_expires_at": "2026-11-29T13:54:36.920773728Z",
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
  "device_ref": "sandbox-25306"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "c518bd3f-595f-4ad3-8b05-f85e19323fc2",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-25306"
}
```

```json
{
  "challenge_id": "cf1684d4-a2a5-4c4f-bc5e-47f9b713314a",
  "expires_at": "2026-10-30T13:59:38.831558192Z",
  "resend_available_at": "2026-10-30T13:54:39.831558192Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "146979",
  "sent_at": "2026-10-30T13:54:38.835489478Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf1684d4-a2a5-4c4f-bc5e-47f9b713314a",
  "code": "146979",
  "device_ref": "sandbox-25306"
}
```

```json
{
  "session_id": "03ce230c-b8f8-4c38-8c0c-c27ff81e3709",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2OTM3OSwiaWF0IjoxNzkzMzY4NDc5LCJqdGkiOiI5MTA0OTlhYS1jY2NmLTQ1YjUtOTQyNC02Yzg4MWI5YTQ0MGIiLCJzaWQiOiIwM2NlMjMwYy1iOGY4LTRjMzgtOGMwYy1jMjdmZjgxZTM3MDkifQ.gIhnhnaximPPsf2Dr-_7dUQegXuxsq-f3VszmlRUrdA",
  "access_expires_at": "2026-10-30T14:09:39.159301251Z",
  "refresh_token": "Nhi-GqaJAMkjwf5d5UukzrvGKuB5KgLMjVyLvUj6BO0",
  "refresh_expires_at": "2026-11-29T13:54:39.15857295Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-18091"
}
```

```json
{
  "challenge_id": "22da30e4-92e0-4171-896e-52730da56c4a",
  "expires_at": "2026-10-30T13:59:39.45795624Z",
  "resend_available_at": "2026-10-30T13:54:40.45795624Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "664790",
  "sent_at": "2026-10-30T13:54:39.462103521Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "22da30e4-92e0-4171-896e-52730da56c4a",
  "code": "664790",
  "device_ref": "sandbox-18091"
}
```

```json
{
  "session_id": "5c6f2bb4-cb78-4c67-a840-2590d6751a16",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2OTM3OSwiaWF0IjoxNzkzMzY4NDc5LCJqdGkiOiI2NzhiODFhMy01MzE1LTRmOGYtODI5OS01Zjc5MDA0ZDZkMDkiLCJzaWQiOiI1YzZmMmJiNC1jYjc4LTRjNjctYTg0MC0yNTkwZDY3NTFhMTYifQ.YEFRqXyHmFKa1aNASs1EVM_MbFvkfGJldGfGv9JqXp0",
  "access_expires_at": "2026-10-30T14:09:39.810692728Z",
  "refresh_token": "OeEAvZphGs2JptIrLncanEamrgdOKwraGoowXCuC4VE",
  "refresh_expires_at": "2026-11-29T13:54:39.809954441Z",
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

(the car drives 182 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "5de4d8fc-e3af-4e50-823d-794aa372b7a7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:57:42Z",
    "sequence": 1793368662743
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "5f4da001-1df3-432b-b008-9dc46c47a61a",
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
  "last_heartbeat_at": "2026-10-30T13:57:42.76801Z",
  "last_location_at": "2026-10-30T13:57:42.76801Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600367759",
  "device_ref": "sandbox-3999"
}
```

```json
{
  "challenge_id": "f30b2ab4-5771-4ef1-b518-7fbd87071a21",
  "expires_at": "2026-10-30T14:02:43.115742157Z",
  "resend_available_at": "2026-10-30T13:57:44.115742157Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600367759` → **200**

```json
{
  "phone": "+48600367759",
  "audience": "CLIENT",
  "code": "432986",
  "sent_at": "2026-10-30T13:57:43.121681573Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f30b2ab4-5771-4ef1-b518-7fbd87071a21",
  "code": "432986",
  "device_ref": "sandbox-3999"
}
```

```json
{
  "session_id": "ea22011d-1dfd-40b5-a8e1-79d7a981bb66",
  "subject": {
    "type": "CLIENT",
    "id": "5a153a0a-d109-42b0-9485-b04f8003431c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTE1M2EwYS1kMTA5LTQyYjAtOTQ4NS1iMDRmODAwMzQzMWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY5NTYzLCJpYXQiOjE3OTMzNjg2NjMsImp0aSI6ImU2NWE1YWZiLTJlMzItNGU5Yy1hMzE2LWFiMmE1MWFlOWUwZiIsInNpZCI6ImVhMjIwMTFkLTFkZmQtNDBiNS1hOGUxLTc5ZDdhOTgxYmI2NiJ9.iPbEZ-KKG0dzsFyAk5FFjpMfkbnmAFequRzxK3KjkaI",
  "access_expires_at": "2026-10-30T14:12:43.498696948Z",
  "refresh_token": "3pciwVhOZjaMY7Pw6Tz6pGXMLe9N_YgDhyDry-g0eGU",
  "refresh_expires_at": "2026-11-29T13:57:43.497981412Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "775ed177-6564-4482-a6bd-01ae90cfd2a7",
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
  "id": "0f34ba70-2b81-48e6-ab76-f787faa339bc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:02:43.830859Z",
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
  "command_id": "ffb32506-8e7f-46a9-9197-d1fd7feaf8f2",
  "quote_id": "0f34ba70-2b81-48e6-ab76-f787faa339bc",
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
  "id": "4aa6544a-21d8-40af-8e44-51651ade20be",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5a153a0a-d109-42b0-9485-b04f8003431c",
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
  "created_at": "2026-10-30T13:57:44.162704Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4aa6544a-21d8-40af-8e44-51651ade20be` → **200**

```json
{
  "id": "4aa6544a-21d8-40af-8e44-51651ade20be",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5a153a0a-d109-42b0-9485-b04f8003431c",
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
  "created_at": "2026-10-30T13:57:44.162704Z",
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

`POST /api/driver/v1/orders/4aa6544a-21d8-40af-8e44-51651ade20be/claim` → **422**

```json
{
  "command_id": "c172a5b1-35b0-4613-9590-b20951cd06e2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4aa6544a-21d8-40af-8e44-51651ade20be/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "1485ffc0-69cf-4bd9-b156-3e1d051e2a4b"
}
```

`GET /api/rider/v1/orders/4aa6544a-21d8-40af-8e44-51651ade20be` → **200**

```json
{
  "id": "4aa6544a-21d8-40af-8e44-51651ade20be",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5a153a0a-d109-42b0-9485-b04f8003431c",
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
  "created_at": "2026-10-30T13:57:44.162704Z",
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

`POST /api/driver/v1/orders/b6a608dc-32cf-4f10-bc36-dadc3643f478/claim` → **404**

```json
{
  "command_id": "b48940bd-806b-46d9-b41b-47e71a4d5cd0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b6a608dc-32cf-4f10-bc36-dadc3643f478/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1acf6569-21b1-40b6-a2d3-a9c6272a150a"
}
```

`POST /api/driver/v1/orders/d23ef92f-4c42-480f-986b-878b59cf15f4/claim` → **404**

```json
{
  "command_id": "6fffc3fa-cb5b-48bf-b57b-ad8ad9eec4f8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d23ef92f-4c42-480f-986b-878b59cf15f4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7e67ddf9-48da-4d9f-ab5e-bddfe894cd7c"
}
```

`POST /api/driver/v1/orders/833a50f2-a722-4c18-b62e-baa98ccba19e/claim` → **404**

```json
{
  "command_id": "8f161359-334b-47a8-a64c-b7a0e0e31949"
}
```

```json
{
  "instance": "/api/driver/v1/orders/833a50f2-a722-4c18-b62e-baa98ccba19e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "75959a69-92cc-4e9a-96f1-642ac414948f"
}
```

`POST /api/driver/v1/orders/9c8d3c1c-c9df-465d-a953-190bb2a4fc3c/claim` → **404**

```json
{
  "command_id": "4cc7850b-8939-4ff4-afc2-56eaf45ece1a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9c8d3c1c-c9df-465d-a953-190bb2a4fc3c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cb686a24-ef71-4acc-bf16-412235f1cccb"
}
```

`POST /api/driver/v1/orders/04b9faf4-84f5-4d7c-8b79-41a9c2d5b3c8/claim` → **404**

```json
{
  "command_id": "6f0a6c42-07d1-43f8-a882-4e8b1e2d2d54"
}
```

```json
{
  "instance": "/api/driver/v1/orders/04b9faf4-84f5-4d7c-8b79-41a9c2d5b3c8/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "efb846ca-4b84-4e74-b4d9-955dd4752c72"
}
```

`POST /api/driver/v1/orders/a213d931-154c-478b-b64c-4014686665bf/claim` → **404**

```json
{
  "command_id": "804d5333-80a3-4ce7-a5fe-255d884300c9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a213d931-154c-478b-b64c-4014686665bf/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9920ce13-22f5-4743-86e1-ac2b314f1535"
}
```

`POST /api/driver/v1/orders/0ce8fc88-8232-4c7f-976a-7d97a796c397/claim` → **404**

```json
{
  "command_id": "9f9d32fe-bb6e-44dd-820a-281205af9152"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0ce8fc88-8232-4c7f-976a-7d97a796c397/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "01b9dda5-29d4-4c9a-a5fb-053e0762100b"
}
```

`POST /api/driver/v1/orders/86198b57-a431-440f-83a4-9738da6cbd16/claim` → **404**

```json
{
  "command_id": "6dd10942-ac02-47a8-a52b-358bd6097ce3"
}
```

```json
{
  "instance": "/api/driver/v1/orders/86198b57-a431-440f-83a4-9738da6cbd16/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8039f45c-180f-4ad2-89e8-e80a93774e63"
}
```

`POST /api/driver/v1/orders/184ae025-6004-4fc2-b5f3-77cebc26803f/claim` → **404**

```json
{
  "command_id": "d2b33b33-c5bd-4a74-8063-b8529a5f0d42"
}
```

```json
{
  "instance": "/api/driver/v1/orders/184ae025-6004-4fc2-b5f3-77cebc26803f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b3df0d6f-47c9-4db8-b55b-3dbe86d1727b"
}
```

`POST /api/driver/v1/orders/ba3c315b-3f7d-4082-9273-4a099766a7c7/claim` → **404**

```json
{
  "command_id": "3af2de27-a960-4ffa-938b-af4a6c1762d1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ba3c315b-3f7d-4082-9273-4a099766a7c7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e0f2ce5d-7b63-4c1b-a77c-d1728e0c9201"
}
```

`POST /api/driver/v1/orders/45b51d84-24a5-4c41-b09e-86fede2b39be/claim` → **404**

```json
{
  "command_id": "6db742b0-fb8f-4374-9027-d7296640a83f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/45b51d84-24a5-4c41-b09e-86fede2b39be/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1bcd4860-bb73-4ab9-b850-000b1ce1ac81"
}
```

`POST /api/driver/v1/orders/622cac91-ebdd-4590-a3c1-1cf7ae36853a/claim` → **404**

```json
{
  "command_id": "1ef5aa6a-21d9-4090-9a14-14dcbbc812fc"
}
```

```json
{
  "instance": "/api/driver/v1/orders/622cac91-ebdd-4590-a3c1-1cf7ae36853a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6857f834-3dcf-47cb-9490-4a61ae6eb133"
}
```

`POST /api/driver/v1/orders/8ccfcb1e-8a2c-4173-b029-87096425f50d/claim` → **404**

```json
{
  "command_id": "dbbdeee7-abfb-41eb-9ff1-0dca37bf7c3c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8ccfcb1e-8a2c-4173-b029-87096425f50d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9889dd67-da86-48ee-9cf5-12e4df3eff50"
}
```

`POST /api/driver/v1/orders/3fda5a33-4e10-4195-8f09-ce72ed20b4cc/claim` → **404**

```json
{
  "command_id": "bd9534bf-12fc-4f9d-809f-a4afb2cdfff3"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3fda5a33-4e10-4195-8f09-ce72ed20b4cc/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d3ab7eae-5a94-497a-a059-0abe3e0b16f6"
}
```

`POST /api/driver/v1/orders/0da1a347-0e72-4f14-abb4-25a7d09821d5/claim` → **404**

```json
{
  "command_id": "e2977859-c60c-4a8c-a06c-97e857d66caa"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0da1a347-0e72-4f14-abb4-25a7d09821d5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f9ad3d37-f18b-4de8-b655-244dfe98e1a5"
}
```

`POST /api/driver/v1/orders/c703ad98-3db5-4f2b-8f6b-02eaaef5b6cd/claim` → **404**

```json
{
  "command_id": "9fea674e-8a53-4377-b7c8-cb3f8c80be83"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c703ad98-3db5-4f2b-8f6b-02eaaef5b6cd/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "02d96da7-cfe1-44ed-9057-3c81dad50fcb"
}
```

`POST /api/driver/v1/orders/39305ea6-a88f-4bf9-8836-d7824f897fae/claim` → **404**

```json
{
  "command_id": "c7e15f28-d04c-4760-a204-f33b279f5684"
}
```

```json
{
  "instance": "/api/driver/v1/orders/39305ea6-a88f-4bf9-8836-d7824f897fae/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fe3ffae9-c200-4982-afd2-f5ea8dd28797"
}
```

`POST /api/driver/v1/orders/fa6ff870-7bee-4486-b8d4-404661367b38/claim` → **404**

```json
{
  "command_id": "0083a75f-4bb2-4004-b36e-32bf96ea6806"
}
```

```json
{
  "instance": "/api/driver/v1/orders/fa6ff870-7bee-4486-b8d4-404661367b38/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "640bed40-1eab-40b8-a545-caeb8e2d2cfe"
}
```

`POST /api/driver/v1/orders/2a3a7cbc-09f6-4239-97ec-94d27c9cf990/claim` → **404**

```json
{
  "command_id": "ce6948a0-2d13-4058-a106-96314a9be16d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2a3a7cbc-09f6-4239-97ec-94d27c9cf990/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5882c1d4-1cef-4171-bbd1-55e0ef81014a"
}
```

`POST /api/driver/v1/orders/c3f385ac-747a-4043-8800-55bb8d4769fd/claim` → **404**

```json
{
  "command_id": "7f1d6e62-207d-44ce-9367-276f8275eaae"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c3f385ac-747a-4043-8800-55bb8d4769fd/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5276d654-9b02-421d-924f-49b601f0c5d4"
}
```

`POST /api/driver/v1/orders/ef69acb9-bd83-45fc-adb8-dd06601942ef/claim` → **404**

```json
{
  "command_id": "711fa90d-6d7e-4c00-88c6-c8b708d1113d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ef69acb9-bd83-45fc-adb8-dd06601942ef/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "50f9fbdb-85c5-4c61-9463-768680a4abb6"
}
```

`POST /api/driver/v1/orders/8f09200d-6732-422b-9380-767baaec9823/claim` → **404**

```json
{
  "command_id": "f9bfc690-bfe1-4d96-9b91-39c6b90492ed"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8f09200d-6732-422b-9380-767baaec9823/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1fd88552-9d58-4f55-a758-716cd08874d1"
}
```

`POST /api/driver/v1/orders/5281f719-52c5-4281-b03f-516ab911ff18/claim` → **404**

```json
{
  "command_id": "7cc63d8b-cb4c-4977-bde3-b143d573a551"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5281f719-52c5-4281-b03f-516ab911ff18/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "38b1ba35-020f-4947-9b0c-8f779daf08bc"
}
```

`POST /api/driver/v1/orders/b68785d4-36ba-4463-833b-7819b6ced522/claim` → **404**

```json
{
  "command_id": "3044cc6f-e100-40d1-a509-fcab22af2a15"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b68785d4-36ba-4463-833b-7819b6ced522/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "be2cf5da-ac34-4c9d-b4b1-e6c64a3868e3"
}
```

`POST /api/driver/v1/orders/903d98fa-59e7-427a-b21f-dee28a1b4c8e/claim` → **404**

```json
{
  "command_id": "5deb63d7-221e-472d-af04-94e5d068fcb9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/903d98fa-59e7-427a-b21f-dee28a1b4c8e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4579f498-240c-4754-8b6e-25496f9597d6"
}
```

`POST /api/driver/v1/orders/fe59e388-2eba-4aa2-9527-5d9271c746ca/claim` → **404**

```json
{
  "command_id": "6e706514-711c-4707-97d2-44e226e6123f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/fe59e388-2eba-4aa2-9527-5d9271c746ca/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "832a3fea-289f-484f-84f3-8acb26dc60a1"
}
```

`POST /api/driver/v1/orders/816c558d-d9c9-4bc3-bbab-bc6a420ee63b/claim` → **404**

```json
{
  "command_id": "bc5d3fec-4f16-4c36-9b7e-530f74e14f83"
}
```

```json
{
  "instance": "/api/driver/v1/orders/816c558d-d9c9-4bc3-bbab-bc6a420ee63b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6fde80b0-be81-4898-99ba-f690290dcd0c"
}
```

`POST /api/driver/v1/orders/5bb3ad4e-8810-4571-b4f9-a4b0de58cc51/claim` → **404**

```json
{
  "command_id": "2290ec26-734d-4f17-8707-cd07d54cef86"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5bb3ad4e-8810-4571-b4f9-a4b0de58cc51/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "101f427c-adb2-48da-8aa7-428b4a4063c0"
}
```

`POST /api/driver/v1/orders/4790e7d9-5caf-4d66-ae3c-138862f0cd27/claim` → **404**

```json
{
  "command_id": "b738a068-0575-421d-9fc6-456f7be026f9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4790e7d9-5caf-4d66-ae3c-138862f0cd27/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "13da731c-c275-4f5e-a59f-3fed92d86f9c"
}
```

`POST /api/driver/v1/orders/56a4e291-e654-425a-9394-55cc4b0adbd3/claim` → **429**

```json
{
  "command_id": "a05a100a-e37a-4e1e-81d6-83e017320546"
}
```

```json
{
  "instance": "/api/driver/v1/orders/56a4e291-e654-425a-9394-55cc4b0adbd3/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "35d117e3-d422-450e-a925-42e45d743e6b",
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
  "command_id": "ff6ea45d-09c0-4e44-b70e-ebae5c070fda",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:57:55Z",
    "sequence": 1793368675634
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "7a88bbdc-0b15-4233-9ca5-a5aad7a8b40a",
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
  "last_heartbeat_at": "2026-10-30T13:57:55.65492Z",
  "last_location_at": "2026-10-30T13:57:55.65492Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "4aa6544a-21d8-40af-8e44-51651ade20be",
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

`POST /api/driver/v1/orders/4aa6544a-21d8-40af-8e44-51651ade20be/claim` → **409**

```json
{
  "command_id": "2eb64ef0-1703-44a6-a0b1-ee200497e75c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4aa6544a-21d8-40af-8e44-51651ade20be/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "eb3a54d9-c326-4435-92a5-33f34a4dafa9"
}
```

`POST /api/driver/v1/orders/4aa6544a-21d8-40af-8e44-51651ade20be/claim` → **200**

```json
{
  "command_id": "c58e7df3-a568-45fe-9f61-890e5db24f7a"
}
```

```json
{
  "id": "6097d3e3-1233-467d-b201-082006f3ec1a",
  "order_id": "4aa6544a-21d8-40af-8e44-51651ade20be",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "50dd088f-9eef-4a23-a273-2436a14262fc",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "50dd088f-9eef-4a23-a273-2436a14262fc",
  "order_id": "4aa6544a-21d8-40af-8e44-51651ade20be",
  "assignment_id": "6097d3e3-1233-467d-b201-082006f3ec1a",
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

`POST /api/driver/v1/trips/50dd088f-9eef-4a23-a273-2436a14262fc/cancel` → **200**

```json
{
  "command_id": "88ce0a31-a595-4b95-8c8b-fb565714568a",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "50dd088f-9eef-4a23-a273-2436a14262fc",
  "order_id": "4aa6544a-21d8-40af-8e44-51651ade20be",
  "assignment_id": "6097d3e3-1233-467d-b201-082006f3ec1a",
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

`GET /api/rider/v1/orders/4aa6544a-21d8-40af-8e44-51651ade20be` → **200**

```json
{
  "id": "4aa6544a-21d8-40af-8e44-51651ade20be",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "5a153a0a-d109-42b0-9485-b04f8003431c",
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
    "id": "6097d3e3-1233-467d-b201-082006f3ec1a",
    "order_id": "4aa6544a-21d8-40af-8e44-51651ade20be",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "50dd088f-9eef-4a23-a273-2436a14262fc",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:57:44.162704Z",
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
  "session_id": "5f4da001-1df3-432b-b008-9dc46c47a61a",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T13:57:42.76801Z",
  "last_location_at": "2026-10-30T13:57:42.76801Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5f4da001-1df3-432b-b008-9dc46c47a61a/close` → **200**

```json
{
  "command_id": "5288cc5f-3080-4fd2-b52c-51b9ee3524e0",
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
  "session_id": "7a88bbdc-0b15-4233-9ca5-a5aad7a8b40a",
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
  "last_heartbeat_at": "2026-10-30T13:57:55.65492Z",
  "last_location_at": "2026-10-30T13:57:55.65492Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7a88bbdc-0b15-4233-9ca5-a5aad7a8b40a/close` → **200**

```json
{
  "command_id": "8f9e3d55-7c0a-40e3-9c94-b9a7857dede4",
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
  "session_id": "bee2b996-079f-4243-a37f-41826ca4e850",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjk1NzksImlhdCI6MTc5MzM2ODY3OSwianRpIjoiODc0ZDBiMDctY2MwNy00YjlkLTlhYzMtNjFjNTIxOTEzMDE2Iiwic2lkIjoiYmVlMmI5OTYtMDc5Zi00MjQzLWEzN2YtNDE4MjZjYTRlODUwIn0.ukdL8UG8UHiwb9djj6QGzb3bOKBrr0zzYHe3u1vXCek",
  "access_expires_at": "2026-10-30T14:12:59.40360189Z",
  "refresh_token": "9nH6ALOL6pP2Un3XC7ncg9ySw6JNNVtmTuyzqG-MoGo",
  "refresh_expires_at": "2026-10-31T01:57:59.40290598Z",
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
  "command_id": "b570e0e3-2de0-49b4-a1b4-627fa1ed98c9",
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
  "session_id": "23431e02-7b6d-4ded-bff5-a0c791b83d0d",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjk1ODAsImlhdCI6MTc5MzM2ODY4MCwianRpIjoiMTBkMGY2OTktY2MzZi00MTgzLWJjN2UtZWI5MjU1ZjM3MGJiIiwic2lkIjoiMjM0MzFlMDItN2I2ZC00ZGVkLWJmZjUtYTBjNzkxYjgzZDBkIn0.hlE6OwW3T93Iam168CA5PZccntk3kgLHQEeeE8UyfY4",
  "access_expires_at": "2026-10-30T14:13:00.628913762Z",
  "refresh_token": "Hss9sF_ZlJhdPrYRiVb5PJQj5H57AF3dN7pCCbcVwQU",
  "refresh_expires_at": "2026-10-31T01:58:00.628320383Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.13348502",
    "linkedid": "1730052700.13348502",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673291219"
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
    "id": "1730052700.13348502",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "301af3e2-0685-47fd-a32a-af41a8c4a475",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380673291219",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:58:00.922057Z",
      "answered_at": null,
      "ended_at": "2026-10-30T13:58:00.948254Z",
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
    "id": "1730052600.1542311950",
    "linkedid": "1730052600.1542311950",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673291219"
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
      "id": "7d989706-3039-4967-8c00-738abcfa5f64",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673291219",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:58:01.295402Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/7d989706-3039-4967-8c00-738abcfa5f64/answer` → **200**

```json
{
  "command_id": "95969010-1ae8-43d2-a310-f9acf7953089"
}
```

```json
{
  "id": "7d989706-3039-4967-8c00-738abcfa5f64",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673291219",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "order_ids": [],
  "started_at": "2026-10-30T13:58:01.295402Z",
  "answered_at": "2026-10-30T13:58:01.644481Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1542311950",
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
    "id": "1730052600.1542311950",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "7d989706-3039-4967-8c00-738abcfa5f64",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673291219",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
      "order_ids": [],
      "started_at": "2026-10-30T13:58:01.295402Z",
      "answered_at": "2026-10-30T13:58:01.644481Z",
      "ended_at": "2026-10-30T13:58:01.983814Z",
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
      "id": "7d989706-3039-4967-8c00-738abcfa5f64",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673291219",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
      "order_ids": [],
      "started_at": "2026-10-30T13:58:01.295402Z",
      "answered_at": "2026-10-30T13:58:01.644481Z",
      "ended_at": "2026-10-30T13:58:01.983814Z",
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
      "id": "7d989706-3039-4967-8c00-738abcfa5f64",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673291219",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
      "order_ids": [],
      "started_at": "2026-10-30T13:58:01.295402Z",
      "answered_at": "2026-10-30T13:58:01.644481Z",
      "ended_at": "2026-10-30T13:58:01.983814Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:58:04.414795Z"
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
      "id": "7d989706-3039-4967-8c00-738abcfa5f64",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673291219",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
      "order_ids": [],
      "started_at": "2026-10-30T13:58:01.295402Z",
      "answered_at": "2026-10-30T13:58:01.644481Z",
      "ended_at": "2026-10-30T13:58:01.983814Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:58:04.414795Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/7d989706-3039-4967-8c00-738abcfa5f64/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/7d989706-3039-4967-8c00-738abcfa5f64/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=7d989706-3039-4967-8c00-738abcfa5f64` → **200**

```json
{
  "changes": [
    {
      "id": "6449f5b7-a472-4c30-a7c1-fdbf60f7595f",
      "occurred_at": "2026-10-30T13:58:07.304222Z",
      "actor_type": "STAFF",
      "actor_id": "432d3ce1-762e-4c60-80de-7105d97ad61c",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "7d989706-3039-4967-8c00-738abcfa5f64",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"e2fd04dc-ad12-44af-8336-0ded5372bf76\", \"order_ids\": []}",
      "correlation_id": "681f6410-4cb1-4dc0-9446-c0d6b88bc191"
    },
    {
      "id": "09e67bdf-f496-4d7f-9f2f-224550427f03",
      "occurred_at": "2026-10-30T13:58:07.270863Z",
      "actor_type": "STAFF",
      "actor_id": "432d3ce1-762e-4c60-80de-7105d97ad61c",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "7d989706-3039-4967-8c00-738abcfa5f64",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"e2fd04dc-ad12-44af-8336-0ded5372bf76\", \"order_ids\": []}",
      "correlation_id": "6b173c82-157f-43be-b19c-e8c307374a46"
    }
  ]
}
```

Done: call 7d989706-3039-4967-8c00-738abcfa5f64 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-22189"
}
```

```json
{
  "challenge_id": "ad7bf8f4-4819-4c56-b1ac-7e4b64d3475e",
  "expires_at": "2026-10-30T14:03:07.657159611Z",
  "resend_available_at": "2026-10-30T13:58:08.657159611Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "734343",
  "sent_at": "2026-10-30T13:58:07.660671243Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad7bf8f4-4819-4c56-b1ac-7e4b64d3475e",
  "code": "734343",
  "device_ref": "sandbox-22189"
}
```

```json
{
  "session_id": "d9708503-e0fc-4a4c-9332-838b095fee3a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2OTU4NywiaWF0IjoxNzkzMzY4Njg3LCJqdGkiOiI1ZmZlMzQxOC1mNWRkLTRiN2YtYWEyOS1mOTJjYzFlY2FmZDkiLCJzaWQiOiJkOTcwODUwMy1lMGZjLTRhNGMtOTMzMi04MzhiMDk1ZmVlM2EifQ.uLlRI7WoVRlj4Y6iIXQP5exzNbkThGNch6iC1h38pkc",
  "access_expires_at": "2026-10-30T14:13:07.982470875Z",
  "refresh_token": "18kHqdoFAgmEP7wAnQqn_7YDnNXrQZ957-Gyqd-Xj54",
  "refresh_expires_at": "2026-11-29T13:58:07.98183678Z",
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
  "command_id": "7d0962c9-c733-4d91-9688-8a6540cf8626",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:58:08Z",
    "sequence": 1793368688614
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "56847cfa-2d89-4539-9ddb-9dd1835a01f4",
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
  "last_heartbeat_at": "2026-10-30T13:58:08.635966Z",
  "last_location_at": "2026-10-30T13:58:08.635966Z",
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
  "session_id": "43743b06-7f8d-4864-99b1-62fd1d582ebf",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjk1ODksImlhdCI6MTc5MzM2ODY4OSwianRpIjoiNTYwNTUyNTktNmFjZS00OGVmLWI2NmItMGM5MDE0MTM5ZmJlIiwic2lkIjoiNDM3NDNiMDYtN2Y4ZC00ODY0LTk5YjEtNjJmZDFkNTgyZWJmIn0.bhUcuQX4mk8SPVsJHPMyqzVVAu9CUYn7a_ZPeQ3X_Jc",
  "access_expires_at": "2026-10-30T14:13:09.244772024Z",
  "refresh_token": "6SH-KP3saSeB4EUzVT4SwbtxWgw7BLOJ8q2Ts49YZjA",
  "refresh_expires_at": "2026-10-31T01:58:09.244112211Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "4fa90bcf-bdfe-474d-9965-ccea5a5a879f",
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
  "id": "6272c431-37a8-4f87-b138-7163df2a92cb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:03:09.580507Z",
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
  "command_id": "07c90086-0cd6-42c7-b016-5f91b9f2aeff",
  "quote_id": "6272c431-37a8-4f87-b138-7163df2a92cb",
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
    "phone": "+380678804796"
  }
}
```

```json
{
  "id": "ac2245ff-b7a1-4ede-8f82-6b48acc04fff",
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
  "created_at": "2026-10-30T13:58:09.902914Z",
  "caller": {
    "name": "Олена",
    "phone": "+380678804796"
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
    "id": "fc7a4680-7080-4b66-8a22-bce6694b6fd3",
    "order_id": "ac2245ff-b7a1-4ede-8f82-6b48acc04fff",
    "expires_at": "2026-10-30T13:58:24.908Z",
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

`POST /api/driver/v1/offers/fc7a4680-7080-4b66-8a22-bce6694b6fd3/accept` → **200**

```json
{
  "command_id": "bdb8740b-2c4f-4be6-b618-e90dc0acde8a"
}
```

```json
{
  "id": "1e2ece50-f71c-4f78-ba14-028a974a34f6",
  "order_id": "ac2245ff-b7a1-4ede-8f82-6b48acc04fff",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "aae6f9c5-e5b7-4d4c-87db-7129bef4257f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380678804796` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678804796` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678804796` → **200**

```json
[
  {
    "phone": "+380678804796",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:58:12.096611207Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678804796` → **200**

```json
[
  {
    "phone": "+380678804796",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:58:12.096611207Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678804796` → **200**

```json
[
  {
    "phone": "+380678804796",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:58:12.096611207Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "aae6f9c5-e5b7-4d4c-87db-7129bef4257f",
  "order_id": "ac2245ff-b7a1-4ede-8f82-6b48acc04fff",
  "assignment_id": "1e2ece50-f71c-4f78-ba14-028a974a34f6",
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
    "phone": "+380678804796"
  }
}
```

`POST /api/driver/v1/work-sessions/56847cfa-2d89-4539-9ddb-9dd1835a01f4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:58:13Z",
    "sequence": 1793368693297
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "56847cfa-2d89-4539-9ddb-9dd1835a01f4",
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
  "last_heartbeat_at": "2026-10-30T13:58:13.317249Z",
  "last_location_at": "2026-10-30T13:58:13.317249Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/aae6f9c5-e5b7-4d4c-87db-7129bef4257f/arrive` → **200**

```json
{
  "command_id": "dfc773e9-5e98-47df-8377-ebc2331c07b3",
  "expected_version": 0
}
```

```json
{
  "id": "aae6f9c5-e5b7-4d4c-87db-7129bef4257f",
  "order_id": "ac2245ff-b7a1-4ede-8f82-6b48acc04fff",
  "assignment_id": "1e2ece50-f71c-4f78-ba14-028a974a34f6",
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
  "arrived_at": "2026-10-30T13:58:13.633741Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678804796"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380678804796` → **200**

```json
[
  {
    "phone": "+380678804796",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:58:12.096611207Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678804796` → **200**

```json
[
  {
    "phone": "+380678804796",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:58:12.096611207Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678804796` → **200**

```json
[
  {
    "phone": "+380678804796",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:58:12.096611207Z"
  },
  {
    "phone": "+380678804796",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:58:15.105812464Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678804796` → **200**

```json
[
  {
    "phone": "+380678804796",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:58:12.096611207Z"
  },
  {
    "phone": "+380678804796",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:58:15.105812464Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678804796` → **200**

```json
[
  {
    "phone": "+380678804796",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:58:12.096611207Z"
  },
  {
    "phone": "+380678804796",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:58:15.105812464Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/aae6f9c5-e5b7-4d4c-87db-7129bef4257f/start` → **200**

```json
{
  "command_id": "e8a4d2fc-b5e7-41fd-ab48-94f6149cdb3f",
  "expected_version": 1
}
```

```json
{
  "id": "aae6f9c5-e5b7-4d4c-87db-7129bef4257f",
  "order_id": "ac2245ff-b7a1-4ede-8f82-6b48acc04fff",
  "assignment_id": "1e2ece50-f71c-4f78-ba14-028a974a34f6",
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
  "arrived_at": "2026-10-30T13:58:13.633741Z",
  "started_at": "2026-10-30T13:58:16.095333Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678804796"
  }
}
```

`POST /api/driver/v1/trips/aae6f9c5-e5b7-4d4c-87db-7129bef4257f/complete` → **200**

```json
{
  "command_id": "c1585dd5-3108-4bed-82d6-313ad1aa6cf7",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:58:16Z",
  "cash_received": true
}
```

```json
{
  "id": "aae6f9c5-e5b7-4d4c-87db-7129bef4257f",
  "order_id": "ac2245ff-b7a1-4ede-8f82-6b48acc04fff",
  "assignment_id": "1e2ece50-f71c-4f78-ba14-028a974a34f6",
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
  "arrived_at": "2026-10-30T13:58:13.633741Z",
  "started_at": "2026-10-30T13:58:16.095333Z",
  "completed_at": "2026-10-30T13:58:16.423527Z",
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
  "session_id": "56847cfa-2d89-4539-9ddb-9dd1835a01f4",
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
  "last_heartbeat_at": "2026-10-30T13:58:13.317249Z",
  "last_location_at": "2026-10-30T13:58:13.317249Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/56847cfa-2d89-4539-9ddb-9dd1835a01f4/close` → **200**

```json
{
  "command_id": "89d76f30-6032-473c-95c0-eddbfea89593",
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
  "phone": "+380639666929",
  "device_ref": "sandbox-24918"
}
```

```json
{
  "challenge_id": "bc7bb33a-e693-466b-9a72-b02bc5b201a1",
  "expires_at": "2026-10-30T14:03:17.385538835Z",
  "resend_available_at": "2026-10-30T13:58:18.385538835Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639666929` → **200**

```json
{
  "phone": "+380639666929",
  "audience": "CLIENT",
  "code": "079008",
  "sent_at": "2026-10-30T13:58:17.388719188Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc7bb33a-e693-466b-9a72-b02bc5b201a1",
  "code": "079008",
  "device_ref": "sandbox-24918"
}
```

```json
{
  "session_id": "07d452dd-995f-48ba-b003-fa9d65c5a527",
  "subject": {
    "type": "CLIENT",
    "id": "bd193b95-95f9-4aa6-8b3c-2a6c3defa261"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZDE5M2I5NS05NWY5LTRhYTYtOGIzYy0yYTZjM2RlZmEyNjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY5NTk3LCJpYXQiOjE3OTMzNjg2OTcsImp0aSI6ImE2NzAyNzI2LTMxZGItNGFmYi1iNWVjLTBiMjExMzdhMmJkNCIsInNpZCI6IjA3ZDQ1MmRkLTk5NWYtNDhiYS1iMDAzLWZhOWQ2NWM1YTUyNyJ9.sBlsCQKBp8Sbq5f58TDRRzoQN8At604mXCA8jQqck4I",
  "access_expires_at": "2026-10-30T14:13:17.717012148Z",
  "refresh_token": "-n5QdKO_nley0UTREyFnRL_GvI_XraOcvlBBdK48gQM",
  "refresh_expires_at": "2026-11-29T13:58:17.716437334Z",
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
  "device_ref": "sandbox-17746"
}
```

```json
{
  "challenge_id": "27547a03-cfb6-4f7c-85f2-9e5b82de07ad",
  "expires_at": "2026-10-30T14:03:18.326863859Z",
  "resend_available_at": "2026-10-30T13:58:19.326863859Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "980972",
  "sent_at": "2026-10-30T13:58:18.329943403Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "27547a03-cfb6-4f7c-85f2-9e5b82de07ad",
  "code": "980972",
  "device_ref": "sandbox-17746"
}
```

```json
{
  "session_id": "4f53bfa0-d026-443f-9c20-492d8c59872f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2OTU5OCwiaWF0IjoxNzkzMzY4Njk4LCJqdGkiOiIwYWQ5N2U5Ni0xNzhlLTQ1YTktYTRlMC02OTZhM2FkNTQ5MjYiLCJzaWQiOiI0ZjUzYmZhMC1kMDI2LTQ0M2YtOWMyMC00OTJkOGM1OTg3MmYifQ.Tv2DlgjcZ5UZXydpc8OgF6pCw2_j8jwtvCv8OBauws8",
  "access_expires_at": "2026-10-30T14:13:18.662161725Z",
  "refresh_token": "ZY5eveYn5sKYvwL0tYPx6z5Hec33XuqBc4rrF69gA3I",
  "refresh_expires_at": "2026-11-29T13:58:18.661515197Z",
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
  "session_id": "79321fd0-20a6-4bc7-ae83-cbf6c32b2a4e",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjk1OTksImlhdCI6MTc5MzM2ODY5OSwianRpIjoiMTdiNDVlYzQtMjk1OC00YTU4LThhZjAtNjM4NzExMzk4ZDEzIiwic2lkIjoiNzkzMjFmZDAtMjBhNi00YmM3LWFlODMtY2JmNmMzMmIyYTRlIn0.h_FlLp-iQdZvNfQWGAQ-To1nv_iH2RlrMUt7IRbDwhE",
  "access_expires_at": "2026-10-30T14:13:19.560778837Z",
  "refresh_token": "58XrKjZmQxGscKddCh4hrAEs_k8f6JithJGQ-9tYQeg",
  "refresh_expires_at": "2026-10-31T01:58:19.560075002Z",
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
  "session_id": "0af4ea7e-687f-448e-8732-acd8da6bb528",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjk2MDAsImlhdCI6MTc5MzM2ODcwMCwianRpIjoiOTMxN2I1MmItNTkzOS00NTZhLThjZTEtMzhkODI5NmY2YTNlIiwic2lkIjoiMGFmNGVhN2UtNjg3Zi00NDhlLTg3MzItYWNkOGRhNmJiNTI4In0.6trJp7JHCJJ3mobber17W2VunShVO3jiLJCiYRqA0wI",
  "access_expires_at": "2026-10-30T14:13:20.171861689Z",
  "refresh_token": "_uIqYSdjRs3G8KM0tXcPjuIUcSDuBz85G31i-HpTvL0",
  "refresh_expires_at": "2026-10-31T01:58:20.171206745Z",
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
  "command_id": "9da451cc-3449-4d27-8e72-20f27991b950",
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
  "id": "8ced70b8-5773-4f04-a76e-5e720d410a1f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:03:20.794606Z",
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
  "command_id": "47135b23-38e8-4019-84cf-843bcf86c901",
  "quote_id": "8ced70b8-5773-4f04-a76e-5e720d410a1f",
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
  "id": "d1525136-0564-4f33-a5b2-d0e32742a817",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd193b95-95f9-4aa6-8b3c-2a6c3defa261",
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
  "created_at": "2026-10-30T13:58:21.129351Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d1525136-0564-4f33-a5b2-d0e32742a817` → **200**

```json
{
  "id": "d1525136-0564-4f33-a5b2-d0e32742a817",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd193b95-95f9-4aa6-8b3c-2a6c3defa261",
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
  "created_at": "2026-10-30T13:58:21.129351Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d1525136-0564-4f33-a5b2-d0e32742a817/cancel` → **200**

```json
{
  "command_id": "f124bd47-353e-4ed6-b9ca-ba12eedc54e6",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "d1525136-0564-4f33-a5b2-d0e32742a817",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bd193b95-95f9-4aa6-8b3c-2a6c3defa261",
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
  "created_at": "2026-10-30T13:58:21.129351Z",
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
  "command_id": "8050137a-453c-43c9-999c-6dd857a7d429",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:58:22Z",
    "sequence": 1793368702421
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "29f151e4-971d-443f-9418-faaf435cb6f9",
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
  "last_heartbeat_at": "2026-10-30T13:58:22.443558Z",
  "last_location_at": "2026-10-30T13:58:22.443558Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-6518"
}
```

```json
{
  "challenge_id": "99ac12e8-7c3f-4dba-b129-9e0a911706fa",
  "expires_at": "2026-10-30T14:03:22.760958646Z",
  "resend_available_at": "2026-10-30T13:58:23.760958646Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "198941",
  "sent_at": "2026-10-30T13:58:22.764323894Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "99ac12e8-7c3f-4dba-b129-9e0a911706fa",
  "code": "198941",
  "device_ref": "sandbox-6518"
}
```

```json
{
  "session_id": "09059807-fc98-48e0-920d-fd6a006f8ea0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2OTYwMywiaWF0IjoxNzkzMzY4NzAzLCJqdGkiOiIwZTc5MWRkYy04YzVjLTQ4Y2QtYjU3MC0yMDE3MDIyY2ZmOGEiLCJzaWQiOiIwOTA1OTgwNy1mYzk4LTQ4ZTAtOTIwZC1mZDZhMDA2ZjhlYTAifQ.1UF5Ol7O3Gx_1mjH2eOLBsejO_3pctMtXk8bFDrmAYY",
  "access_expires_at": "2026-10-30T14:13:23.094752586Z",
  "refresh_token": "GSE9yM8g-m038nFcu-s2B0Js7iUC5vojACRW_jXaLo0",
  "refresh_expires_at": "2026-11-29T13:58:23.094121527Z",
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
  "command_id": "3062b281-f564-419b-8fde-924b20852503",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:58:23Z",
    "sequence": 1793368703708
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e814638c-1b81-4996-b2c6-f1dfdb6511cf",
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
  "last_heartbeat_at": "2026-10-30T13:58:23.728817Z",
  "last_location_at": "2026-10-30T13:58:23.728817Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6051e083-380e-474e-8261-bc7af0b97cbf",
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
  "id": "5851714a-0246-4123-99ae-fcf87e6eff96",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:03:24.038833Z",
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
  "command_id": "8c680eaa-0a77-4158-a8fd-b9bde4bf599f",
  "quote_id": "5851714a-0246-4123-99ae-fcf87e6eff96",
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
  "id": "09313f5b-c09f-4486-bbf0-e6fc2dda5ebe",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd193b95-95f9-4aa6-8b3c-2a6c3defa261",
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
  "created_at": "2026-10-30T13:58:24.360746Z",
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
    "id": "140511d0-99ff-4815-a915-8ce701b6af6d",
    "order_id": "09313f5b-c09f-4486-bbf0-e6fc2dda5ebe",
    "expires_at": "2026-10-30T13:58:39.364776Z",
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

`POST /api/driver/v1/offers/140511d0-99ff-4815-a915-8ce701b6af6d/accept` → **200**

```json
{
  "command_id": "acec0c7e-efa4-4bb2-ab46-eb07bc04ba2e"
}
```

```json
{
  "id": "0e2e0d39-f6c6-428f-997e-6af3a26ac5f2",
  "order_id": "09313f5b-c09f-4486-bbf0-e6fc2dda5ebe",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5e4a2127-7eaa-4fce-988a-0de74a376eb3",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5e4a2127-7eaa-4fce-988a-0de74a376eb3",
  "order_id": "09313f5b-c09f-4486-bbf0-e6fc2dda5ebe",
  "assignment_id": "0e2e0d39-f6c6-428f-997e-6af3a26ac5f2",
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

`POST /api/driver/v1/trips/5e4a2127-7eaa-4fce-988a-0de74a376eb3/cancel` → **200**

```json
{
  "command_id": "dd172776-d60e-4a64-a300-93fd559e1aa9",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "5e4a2127-7eaa-4fce-988a-0de74a376eb3",
  "order_id": "09313f5b-c09f-4486-bbf0-e6fc2dda5ebe",
  "assignment_id": "0e2e0d39-f6c6-428f-997e-6af3a26ac5f2",
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

`GET /api/rider/v1/orders/09313f5b-c09f-4486-bbf0-e6fc2dda5ebe` → **200**

```json
{
  "id": "09313f5b-c09f-4486-bbf0-e6fc2dda5ebe",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "bd193b95-95f9-4aa6-8b3c-2a6c3defa261",
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
    "id": "0e2e0d39-f6c6-428f-997e-6af3a26ac5f2",
    "order_id": "09313f5b-c09f-4486-bbf0-e6fc2dda5ebe",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "5e4a2127-7eaa-4fce-988a-0de74a376eb3",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:58:24.360746Z",
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
    "id": "05a52c21-1126-4fcc-98b0-314cf35782fe",
    "order_id": "09313f5b-c09f-4486-bbf0-e6fc2dda5ebe",
    "expires_at": "2026-10-30T13:58:40.646561Z",
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

`POST /api/driver/v1/offers/05a52c21-1126-4fcc-98b0-314cf35782fe/accept` → **200**

```json
{
  "command_id": "46190d71-ca44-40de-8a59-a5cfa569bceb"
}
```

```json
{
  "id": "0120d2f8-01fc-439a-a013-1102c27aa3a3",
  "order_id": "09313f5b-c09f-4486-bbf0-e6fc2dda5ebe",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bdf4f9f5-b830-48e0-8dba-6840fa0c43d1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bdf4f9f5-b830-48e0-8dba-6840fa0c43d1",
  "order_id": "09313f5b-c09f-4486-bbf0-e6fc2dda5ebe",
  "assignment_id": "0120d2f8-01fc-439a-a013-1102c27aa3a3",
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

`POST /api/driver/v1/trips/bdf4f9f5-b830-48e0-8dba-6840fa0c43d1/cancel` → **200**

```json
{
  "command_id": "be10f903-546b-4eec-a6f2-eee9e0d49d1f",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "bdf4f9f5-b830-48e0-8dba-6840fa0c43d1",
  "order_id": "09313f5b-c09f-4486-bbf0-e6fc2dda5ebe",
  "assignment_id": "0120d2f8-01fc-439a-a013-1102c27aa3a3",
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
    "id": "09313f5b-c09f-4486-bbf0-e6fc2dda5ebe",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-30T13:58:24.360746Z",
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
    "id": "d1525136-0564-4f33-a5b2-d0e32742a817",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T13:58:21.129351Z",
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

`GET /api/operator/v1/orders/09313f5b-c09f-4486-bbf0-e6fc2dda5ebe/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:58:24.361456Z",
      "actor": {
        "type": "CLIENT",
        "id": "bd193b95-95f9-4aa6-8b3c-2a6c3defa261",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "09313f5b-c09f-4486-bbf0-e6fc2dda5ebe",
        "quote_id": "5851714a-0246-4123-99ae-fcf87e6eff96",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "cabce360-effd-464f-a7ee-df31effca470"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:58:24.363906Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "09313f5b-c09f-4486-bbf0-e6fc2dda5ebe",
        "attempt_id": "b5f4d0b8-65da-487e-9d0b-ae63fc9f9ac8",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "cabce360-effd-464f-a7ee-df31effca470"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:58:24.371286Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "140511d0-99ff-4815-a915-8ce701b6af6d",
        "order_id": "09313f5b-c09f-4486-bbf0-e6fc2dda5ebe",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "cabce360-effd-464f-a7ee-df31effca470"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:58:25.010948Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "140511d0-99ff-4815-a915-8ce701b6af6d",
        "order_id": "09313f5b-c09f-4486-bbf0-e6fc2dda5ebe",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "0e2e0d39-f6c6-428f-997e-6af3a26ac5f2"
      },
      "correlation_id": "fc42d44b-6837-43b5-9f09-9b324375f869"
```

Done: orders d1525136-0564-4f33-a5b2-d0e32742a817, 09313f5b-c09f-4486-bbf0-e6fc2dda5ebe.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733007593",
  "device_ref": "sandbox-12809"
}
```

```json
{
  "challenge_id": "72d44551-e3bd-4a16-9e9f-3e85b2a32c7b",
  "expires_at": "2026-10-30T14:03:28.197554342Z",
  "resend_available_at": "2026-10-30T13:58:29.197554342Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733007593` → **200**

```json
{
  "phone": "+380733007593",
  "audience": "CLIENT",
  "code": "226677",
  "sent_at": "2026-10-30T13:58:28.20078993Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "72d44551-e3bd-4a16-9e9f-3e85b2a32c7b",
  "code": "226677",
  "device_ref": "sandbox-12809"
}
```

```json
{
  "session_id": "e3872ebd-4d86-4353-b418-1ced872a8d85",
  "subject": {
    "type": "CLIENT",
    "id": "5bc126a8-e822-4d98-810c-020dd4b8acf8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YmMxMjZhOC1lODIyLTRkOTgtODEwYy0wMjBkZDRiOGFjZjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY5NjA4LCJpYXQiOjE3OTMzNjg3MDgsImp0aSI6IjIxMzViMjYwLTM0YTYtNDVjNC04MWFhLTUyZDc3MzBhNWQyZSIsInNpZCI6ImUzODcyZWJkLTRkODYtNDM1My1iNDE4LTFjZWQ4NzJhOGQ4NSJ9.qfCSf0x94V2Si4YsTXzJAPSP2kFzluhHbeNP6LSEEq8",
  "access_expires_at": "2026-10-30T14:13:28.540603355Z",
  "refresh_token": "fmqwFGdAy3h8Tzq4lof7T6kWwK6YewQPNhxB7oxoTX8",
  "refresh_expires_at": "2026-11-29T13:58:28.539976012Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "46908f2e-d40d-421f-a846-5d33eca17a98",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "082cebb7-6ddf-4193-8493-43984717a5f4",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-082cebb7-6ddf-4193-8493-43984717a5f4",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "b19f987ff053ef577a9e6606f926367c",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=082cebb7-6ddf-4193-8493-43984717a5f4",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733007593"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=082cebb7-6ddf-4193-8493-43984717a5f4",
  "expires_at": "2026-10-30T14:28:28.853687Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/082cebb7-6ddf-4193-8493-43984717a5f4` → **200**

```json
{
  "id": "082cebb7-6ddf-4193-8493-43984717a5f4",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T14:28:28.853687Z",
  "card": {
    "id": "dc828b56-a727-4c47-9d0d-4967180fd562",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7778",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:58:29.169505Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "dc828b56-a727-4c47-9d0d-4967180fd562",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****7778",
      "card_type": "Visa",
      "created_at": "2026-10-30T13:58:29.169505Z"
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
  "device_ref": "sandbox-24237"
}
```

```json
{
  "challenge_id": "4f8f662b-0cc3-46c9-a4eb-6cf7ed0b1296",
  "expires_at": "2026-10-30T14:03:29.794279966Z",
  "resend_available_at": "2026-10-30T13:58:30.794279966Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "210971",
  "sent_at": "2026-10-30T13:58:29.798609031Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f8f662b-0cc3-46c9-a4eb-6cf7ed0b1296",
  "code": "210971",
  "device_ref": "sandbox-24237"
}
```

```json
{
  "session_id": "72dd7f9e-1c22-48cf-ba54-9266376c3389",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2OTYxMCwiaWF0IjoxNzkzMzY4NzEwLCJqdGkiOiI0Y2NkZjQzMi04NmJkLTQ3NDctODA5OS03NDczN2FiMTRjODciLCJzaWQiOiI3MmRkN2Y5ZS0xYzIyLTQ4Y2YtYmE1NC05MjY2Mzc2YzMzODkifQ.yLrWVUWkYvfKebGDpU1WuyQkeOTRyxigd1pX4naNE0E",
  "access_expires_at": "2026-10-30T14:13:30.134092166Z",
  "refresh_token": "1DRzvHvI2fmfF5yJ0fhBYeDUpQ06Ohx2n6adpyRtDbU",
  "refresh_expires_at": "2026-11-29T13:58:30.133374835Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e814638c-1b81-4996-b2c6-f1dfdb6511cf",
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
  "last_heartbeat_at": "2026-10-30T13:58:23.728817Z",
  "last_location_at": "2026-10-30T13:58:23.728817Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e814638c-1b81-4996-b2c6-f1dfdb6511cf/handover` → **200**

```json
{
  "command_id": "39ad2b14-c357-4580-b6ae-d955afbc6e1b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e814638c-1b81-4996-b2c6-f1dfdb6511cf",
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
  "last_heartbeat_at": "2026-10-30T13:58:23.728817Z",
  "last_location_at": "2026-10-30T13:58:23.728817Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 41 s to the next point)

`POST /api/driver/v1/work-sessions/e814638c-1b81-4996-b2c6-f1dfdb6511cf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:59:12Z",
    "sequence": 1793368752650
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e814638c-1b81-4996-b2c6-f1dfdb6511cf",
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
  "last_heartbeat_at": "2026-10-30T13:59:12.085697Z",
  "last_location_at": "2026-10-30T13:59:12.085697Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "efbb8e57-3568-4bc4-8187-b83db6cac65d",
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
  "id": "62eddee3-f4f0-4df9-9eb1-f5a12927c520",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:04:12.399444Z",
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
  "command_id": "1d86750a-86a3-4d22-b8b2-2160892db118",
  "quote_id": "62eddee3-f4f0-4df9-9eb1-f5a12927c520",
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
  "id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5bc126a8-e822-4d98-810c-020dd4b8acf8",
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
  "created_at": "2026-10-30T13:59:12.726714Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1484e7c1-2b76-4e05-91b0-20935d1c8b75` → **200**

```json
{
  "id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5bc126a8-e822-4d98-810c-020dd4b8acf8",
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
  "created_at": "2026-10-30T13:59:12.726714Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1484e7c1-2b76-4e05-91b0-20935d1c8b75` → **200**

```json
{
  "id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5bc126a8-e822-4d98-810c-020dd4b8acf8",
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
  "created_at": "2026-10-30T13:59:12.726714Z",
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
    "id": "bcc59012-b3e4-4ce4-a48c-e540ecb9d163",
    "order_id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
    "expires_at": "2026-10-30T13:59:28.487392Z",
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

`POST /api/driver/v1/offers/bcc59012-b3e4-4ce4-a48c-e540ecb9d163/accept` → **200**

```json
{
  "command_id": "88f60451-c9f2-4cf6-bf59-32885cf558be"
}
```

```json
{
  "id": "8bf4d0fd-c991-490e-83a6-92d83dba4632",
  "order_id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "864b0501-f0ea-4e99-888e-a6076ecd83a6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "864b0501-f0ea-4e99-888e-a6076ecd83a6",
  "order_id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
  "assignment_id": "8bf4d0fd-c991-490e-83a6-92d83dba4632",
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

`POST /api/driver/v1/work-sessions/e814638c-1b81-4996-b2c6-f1dfdb6511cf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:59:21Z",
    "sequence": 1793368761595
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e814638c-1b81-4996-b2c6-f1dfdb6511cf",
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
  "last_heartbeat_at": "2026-10-30T13:59:21.615513Z",
  "last_location_at": "2026-10-30T13:59:21.615513Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/864b0501-f0ea-4e99-888e-a6076ecd83a6/arrive` → **200**

```json
{
  "command_id": "a3fd8bd4-107d-43bc-840b-a4770bd1c3a0",
  "expected_version": 0
}
```

```json
{
  "id": "864b0501-f0ea-4e99-888e-a6076ecd83a6",
  "order_id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
  "assignment_id": "8bf4d0fd-c991-490e-83a6-92d83dba4632",
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
  "arrived_at": "2026-10-30T13:59:21.928142Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/864b0501-f0ea-4e99-888e-a6076ecd83a6/start` → **200**

```json
{
  "command_id": "960d2ebb-a7fe-45e9-b363-631a2b01ffba",
  "expected_version": 1
}
```

```json
{
  "id": "864b0501-f0ea-4e99-888e-a6076ecd83a6",
  "order_id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
  "assignment_id": "8bf4d0fd-c991-490e-83a6-92d83dba4632",
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
  "arrived_at": "2026-10-30T13:59:21.928142Z",
  "started_at": "2026-10-30T13:59:22.252421Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/864b0501-f0ea-4e99-888e-a6076ecd83a6/complete` → **200**

```json
{
  "command_id": "d2a0f130-6bfe-42f5-aa21-e20958bbb96f",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:59:22Z",
  "cash_received": true
}
```

```json
{
  "id": "864b0501-f0ea-4e99-888e-a6076ecd83a6",
  "order_id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
  "assignment_id": "8bf4d0fd-c991-490e-83a6-92d83dba4632",
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
  "arrived_at": "2026-10-30T13:59:21.928142Z",
  "started_at": "2026-10-30T13:59:22.252421Z",
  "completed_at": "2026-10-30T13:59:22.579977Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/1484e7c1-2b76-4e05-91b0-20935d1c8b75` → **200**

```json
{
  "id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5bc126a8-e822-4d98-810c-020dd4b8acf8",
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
    "id": "8bf4d0fd-c991-490e-83a6-92d83dba4632",
    "order_id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "864b0501-f0ea-4e99-888e-a6076ecd83a6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:59:12.726714Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1484e7c1-2b76-4e05-91b0-20935d1c8b75` → **200**

```json
{
  "id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5bc126a8-e822-4d98-810c-020dd4b8acf8",
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
    "id": "8bf4d0fd-c991-490e-83a6-92d83dba4632",
    "order_id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "864b0501-f0ea-4e99-888e-a6076ecd83a6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:59:12.726714Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1484e7c1-2b76-4e05-91b0-20935d1c8b75` → **200**

```json
{
  "id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5bc126a8-e822-4d98-810c-020dd4b8acf8",
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
    "id": "8bf4d0fd-c991-490e-83a6-92d83dba4632",
    "order_id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "864b0501-f0ea-4e99-888e-a6076ecd83a6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:59:12.726714Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1484e7c1-2b76-4e05-91b0-20935d1c8b75` → **200**

```json
{
  "id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "5bc126a8-e822-4d98-810c-020dd4b8acf8",
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
    "id": "8bf4d0fd-c991-490e-83a6-92d83dba4632",
    "order_id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "864b0501-f0ea-4e99-888e-a6076ecd83a6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:59:12.726714Z",
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

`GET /api/rider/v1/orders/1484e7c1-2b76-4e05-91b0-20935d1c8b75/tip` → **200**

```json
{
  "order_id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
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
  "available_until": "2026-10-31T13:59:22.579977Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/1484e7c1-2b76-4e05-91b0-20935d1c8b75/tip` → **201**

```json
{
  "command_id": "b56b5dc5-4603-4ca1-95cb-c18f82a2ea2b",
  "amount_minor": 2500
}
```

```json
{
  "id": "c896d739-cc79-42bb-a60f-0d075b3ce109",
  "order_id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T13:59:27.787083Z"
}
```

`GET /api/rider/v1/orders/1484e7c1-2b76-4e05-91b0-20935d1c8b75/tip` → **200**

```json
{
  "order_id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
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
  "available_until": "2026-10-31T13:59:22.579977Z",
  "open": false,
  "tip": {
    "id": "c896d739-cc79-42bb-a60f-0d075b3ce109",
    "order_id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T13:59:27.787083Z"
  }
}
```

`GET /api/rider/v1/orders/1484e7c1-2b76-4e05-91b0-20935d1c8b75/tip` → **200**

```json
{
  "order_id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
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
  "available_until": "2026-10-31T13:59:22.579977Z",
  "open": false,
  "tip": {
    "id": "c896d739-cc79-42bb-a60f-0d075b3ce109",
    "order_id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T13:59:27.787083Z"
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
      "id": "5dfa16ca-ea2e-41a6-a67f-c11100c49ce7",
      "at": "2026-10-30T13:59:29.673884Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
      "counterpart_id": null
    },
    {
      "id": "07694f9d-eb66-4ff9-829f-4ed185b7a605",
      "at": "2026-10-30T13:59:23.592966Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "934069c0-7d83-44c6-85e4-923f5c556c97",
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
  "id": "de90caca-4eca-4bc5-bf13-f8618414c13f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:04:30.015327Z",
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
  "session_id": "79cc9e44-36c1-440f-bcf4-8aa56faf4088",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjk2NzAsImlhdCI6MTc5MzM2ODc3MCwianRpIjoiZGVmZWI5ZmUtMTAxNy00OThmLTg3ZTMtZDZiMTVmOGJjOWRiIiwic2lkIjoiNzljYzllNDQtMzZjMS00NDBmLWJjZjQtOGFhNTZmYWY0MDg4In0.St9xmewusWKMWq1wx5fD18d_miqwwr_BwR09xwrmqPI",
  "access_expires_at": "2026-10-30T14:14:30.629795026Z",
  "refresh_token": "vl8A9GHA47gGgNFF79hd5gtxsva3Gt7cUcF2rFcCRy0",
  "refresh_expires_at": "2026-10-31T01:59:30.629215089Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380733007593` → **200**

```json
{
  "client_id": "5bc126a8-e822-4d98-810c-020dd4b8acf8"
}
```

`POST /api/admin/v1/rider-wallets/5bc126a8-e822-4d98-810c-020dd4b8acf8/top-ups` → **201**

```json
{
  "command_id": "a576c797-0975-48c1-a6d5-8dcdc84b014d",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "5bc126a8-e822-4d98-810c-020dd4b8acf8",
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
      "id": "fe23c137-ab1d-4f1f-ad83-4b19f2f32ef0",
      "at": "2026-10-30T13:59:31.234591Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "432d3ce1-762e-4c60-80de-7105d97ad61c",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2ea1792b-250d-4631-a02e-5a8ec47473f0",
  "quote_id": "de90caca-4eca-4bc5-bf13-f8618414c13f",
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
  "id": "4f44da0c-6fc5-422e-8713-684ecf49513a",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5bc126a8-e822-4d98-810c-020dd4b8acf8",
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
  "created_at": "2026-10-30T13:59:31.550879Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4f44da0c-6fc5-422e-8713-684ecf49513a` → **200**

```json
{
  "id": "4f44da0c-6fc5-422e-8713-684ecf49513a",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5bc126a8-e822-4d98-810c-020dd4b8acf8",
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
  "created_at": "2026-10-30T13:59:31.550879Z",
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
    "id": "2bb336f6-8e1a-4de5-8946-a7515a288c52",
    "order_id": "4f44da0c-6fc5-422e-8713-684ecf49513a",
    "expires_at": "2026-10-30T13:59:46.555381Z",
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

`POST /api/driver/v1/offers/2bb336f6-8e1a-4de5-8946-a7515a288c52/accept` → **200**

```json
{
  "command_id": "f6fc2500-5847-4e6b-ae9d-50aee42bbbe3"
}
```

```json
{
  "id": "7b943adf-2d85-4e4d-bb69-89bf548010ac",
  "order_id": "4f44da0c-6fc5-422e-8713-684ecf49513a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "181b49e9-42fe-4745-9ade-b7d588613012",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "181b49e9-42fe-4745-9ade-b7d588613012",
  "order_id": "4f44da0c-6fc5-422e-8713-684ecf49513a",
  "assignment_id": "7b943adf-2d85-4e4d-bb69-89bf548010ac",
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

`POST /api/driver/v1/work-sessions/e814638c-1b81-4996-b2c6-f1dfdb6511cf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:59:33Z",
    "sequence": 1793368773109
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e814638c-1b81-4996-b2c6-f1dfdb6511cf",
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
  "last_heartbeat_at": "2026-10-30T13:59:33.128458Z",
  "last_location_at": "2026-10-30T13:59:33.128458Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/181b49e9-42fe-4745-9ade-b7d588613012/arrive` → **200**

```json
{
  "command_id": "3f1b0bfc-b50e-4627-a874-8961efcce4ab",
  "expected_version": 0
}
```

```json
{
  "id": "181b49e9-42fe-4745-9ade-b7d588613012",
  "order_id": "4f44da0c-6fc5-422e-8713-684ecf49513a",
  "assignment_id": "7b943adf-2d85-4e4d-bb69-89bf548010ac",
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
  "arrived_at": "2026-10-30T13:59:33.428564Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/181b49e9-42fe-4745-9ade-b7d588613012/start` → **200**

```json
{
  "command_id": "aadcf33a-1642-4b06-906c-943c5f51500d",
  "expected_version": 1
}
```

```json
{
  "id": "181b49e9-42fe-4745-9ade-b7d588613012",
  "order_id": "4f44da0c-6fc5-422e-8713-684ecf49513a",
  "assignment_id": "7b943adf-2d85-4e4d-bb69-89bf548010ac",
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
  "arrived_at": "2026-10-30T13:59:33.428564Z",
  "started_at": "2026-10-30T13:59:33.742724Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/181b49e9-42fe-4745-9ade-b7d588613012/complete` → **200**

```json
{
  "command_id": "1e0f1f81-0dd9-4064-9c4d-266229307060",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:59:34Z",
  "cash_received": true
}
```

```json
{
  "id": "181b49e9-42fe-4745-9ade-b7d588613012",
  "order_id": "4f44da0c-6fc5-422e-8713-684ecf49513a",
  "assignment_id": "7b943adf-2d85-4e4d-bb69-89bf548010ac",
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
  "arrived_at": "2026-10-30T13:59:33.428564Z",
  "started_at": "2026-10-30T13:59:33.742724Z",
  "completed_at": "2026-10-30T13:59:34.052986Z",
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
  "client_id": "5bc126a8-e822-4d98-810c-020dd4b8acf8",
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
      "id": "fe23c137-ab1d-4f1f-ad83-4b19f2f32ef0",
      "at": "2026-10-30T13:59:31.234591Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "432d3ce1-762e-4c60-80de-7105d97ad61c",
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

`GET /api/rider/v1/orders/4f44da0c-6fc5-422e-8713-684ecf49513a/tip` → **200**

```json
{
  "order_id": "4f44da0c-6fc5-422e-8713-684ecf49513a",
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
  "available_until": "2026-10-31T13:59:34.052986Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/4f44da0c-6fc5-422e-8713-684ecf49513a/tip` → **201**

```json
{
  "command_id": "438f0883-e354-4994-b9b1-e99afaf33bd8",
  "amount_minor": 2500
}
```

```json
{
  "id": "20f556d2-09b5-4b33-a1df-1bbea5c4b08f",
  "order_id": "4f44da0c-6fc5-422e-8713-684ecf49513a",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T13:59:35.256509Z"
}
```

`GET /api/rider/v1/orders/4f44da0c-6fc5-422e-8713-684ecf49513a/tip` → **200**

```json
{
  "order_id": "4f44da0c-6fc5-422e-8713-684ecf49513a",
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
  "available_until": "2026-10-31T13:59:34.052986Z",
  "open": false,
  "tip": {
    "id": "20f556d2-09b5-4b33-a1df-1bbea5c4b08f",
    "order_id": "4f44da0c-6fc5-422e-8713-684ecf49513a",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T13:59:35.256509Z"
  }
}
```

`GET /api/rider/v1/orders/4f44da0c-6fc5-422e-8713-684ecf49513a/tip` → **200**

```json
{
  "order_id": "4f44da0c-6fc5-422e-8713-684ecf49513a",
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
  "available_until": "2026-10-31T13:59:34.052986Z",
  "open": false,
  "tip": {
    "id": "20f556d2-09b5-4b33-a1df-1bbea5c4b08f",
    "order_id": "4f44da0c-6fc5-422e-8713-684ecf49513a",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T13:59:35.256509Z"
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
      "id": "3b938fad-ca34-4d57-a3ca-d1fd1919e3b8",
      "at": "2026-10-30T13:59:36.776393Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "4f44da0c-6fc5-422e-8713-684ecf49513a",
      "counterpart_id": null
    },
    {
      "id": "969dcf52-21a7-467b-ba7f-ad7a599b6c0d",
      "at": "2026-10-30T13:59:34.744633Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "4f44da0c-6fc5-422e-8713-684ecf49513a",
      "counterpart_id": null
    },
    {
      "id": "5dfa16ca-ea2e-41a6-a67f-c11100c49ce7",
      "at": "2026-10-30T13:59:29.673884Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
      "counterpart_id": null
    },
    {
      "id": "07694f9d-eb66-4ff9-829f-4ed185b7a605",
      "at": "2026-10-30T13:59:23.592966Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1484e7c1-2b76-4e05-91b0-20935d1c8b75",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e814638c-1b81-4996-b2c6-f1dfdb6511cf",
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
  "last_heartbeat_at": "2026-10-30T13:59:33.128458Z",
  "last_location_at": "2026-10-30T13:59:33.128458Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e814638c-1b81-4996-b2c6-f1dfdb6511cf/close` → **200**

```json
{
  "command_id": "eab17d5f-5668-42e0-b25a-700dc356052a",
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

Done: card order 4f44da0c-6fc5-422e-8713-684ecf49513a.

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
  "phone": "+380737861475",
  "device_ref": "sandbox-3663"
}
```

```json
{
  "challenge_id": "32d919fe-7f83-4ed0-b2b5-bfd9b456d0c5",
  "expires_at": "2026-10-30T14:04:38.39975569Z",
  "resend_available_at": "2026-10-30T13:59:39.39975569Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737861475` → **200**

```json
{
  "phone": "+380737861475",
  "audience": "CLIENT",
  "code": "805081",
  "sent_at": "2026-10-30T13:59:38.402628675Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32d919fe-7f83-4ed0-b2b5-bfd9b456d0c5",
  "code": "805081",
  "device_ref": "sandbox-3663"
}
```

```json
{
  "session_id": "a8d36ac2-1f04-4c3f-9f04-3c52908c1085",
  "subject": {
    "type": "CLIENT",
    "id": "1be9b832-75b4-413a-a9d6-1f7d10225b82"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYmU5YjgzMi03NWI0LTQxM2EtYTlkNi0xZjdkMTAyMjViODIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY5Njc4LCJpYXQiOjE3OTMzNjg3NzgsImp0aSI6ImUzYzQzNThlLWY4MjktNGY3OC1hNWU5LTI0NDdhNWQ4NWIwOSIsInNpZCI6ImE4ZDM2YWMyLTFmMDQtNGMzZi05ZjA0LTNjNTI5MDhjMTA4NSJ9.JnjfJZ0cU_TzFvMt_mSt9Xc1doMnJblMEvRmPhb-cdA",
  "access_expires_at": "2026-10-30T14:14:38.720233828Z",
  "refresh_token": "Rlv-0no0Zv-Ys9ErHPpa4gr72aabQaSBGzZiud-u0kA",
  "refresh_expires_at": "2026-11-29T13:59:38.719662687Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "f0487c1c-8b5d-4ed6-a883-ee30025c59b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "2cb4dbd0-8e1c-426a-bbbf-bff309e2c800",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-2cb4dbd0-8e1c-426a-bbbf-bff309e2c800",
    "orderDate": "1793368779",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "65ccd23c92780465db62d61b2d9f873a",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=2cb4dbd0-8e1c-426a-bbbf-bff309e2c800",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737861475"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=2cb4dbd0-8e1c-426a-bbbf-bff309e2c800",
  "created_at": "2026-10-30T13:59:39.02396Z",
  "expires_at": "2026-10-30T14:29:39.02396Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/2cb4dbd0-8e1c-426a-bbbf-bff309e2c800` → **200**

```json
{
  "id": "2cb4dbd0-8e1c-426a-bbbf-bff309e2c800",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T13:59:39.02396Z",
  "expires_at": "2026-10-30T14:29:39.02396Z",
  "completed_at": "2026-10-30T13:59:39.334798Z",
  "masked_pan": "41****4668",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "1be9b832-75b4-413a-a9d6-1f7d10225b82",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "1be9b832-75b4-413a-a9d6-1f7d10225b82",
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
      "id": "b0e0e088-df67-4e22-99b7-e254d8fa2e52",
      "at": "2026-10-30T13:59:39.79921Z",
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
  "client_id": "1be9b832-75b4-413a-a9d6-1f7d10225b82",
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
      "id": "b0e0e088-df67-4e22-99b7-e254d8fa2e52",
      "at": "2026-10-30T13:59:39.79921Z",
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
  "device_ref": "sandbox-29128"
}
```

```json
{
  "challenge_id": "7122e346-19f5-4f15-9edc-5ad40d54ba04",
  "expires_at": "2026-10-30T14:04:41.568127983Z",
  "resend_available_at": "2026-10-30T13:59:42.568127983Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "808869",
  "sent_at": "2026-10-30T13:59:41.570934936Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7122e346-19f5-4f15-9edc-5ad40d54ba04",
  "code": "808869",
  "device_ref": "sandbox-29128"
}
```

```json
{
  "session_id": "d3d4f535-9e47-4560-b86a-e9a5fb1ff510",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2OTY4MSwiaWF0IjoxNzkzMzY4NzgxLCJqdGkiOiI5MmRkOGQzYS1kMTZkLTQxZDctYTVlMy0zNzQxNWVkNjY3YTUiLCJzaWQiOiJkM2Q0ZjUzNS05ZTQ3LTQ1NjAtYjg2YS1lOWE1ZmIxZmY1MTAifQ.tEgbxSTI91z00pQruD8TqzCA5nR9rqjGECdn7rfb-zY",
  "access_expires_at": "2026-10-30T14:14:41.900427698Z",
  "refresh_token": "dIHi4ekgkBfJkmtrEvCUbk99vldAcy-lSXZCsMxJUpA",
  "refresh_expires_at": "2026-11-29T13:59:41.899774796Z",
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
  "command_id": "83795001-0bd3-4370-835b-4208a85bbb45",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "ba841676-b688-43f0-9096-7f21754c1fe2",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-ba841676-b688-43f0-9096-7f21754c1fe2",
    "orderDate": "1793368782",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "2e83e55d7e4af7386af5f4fb28a62a51",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=ba841676-b688-43f0-9096-7f21754c1fe2",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=ba841676-b688-43f0-9096-7f21754c1fe2",
  "created_at": "2026-10-30T13:59:42.501682Z",
  "expires_at": "2026-10-30T14:29:42.501682Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/ba841676-b688-43f0-9096-7f21754c1fe2` → **200**

```json
{
  "id": "ba841676-b688-43f0-9096-7f21754c1fe2",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T13:59:42.501682Z",
  "expires_at": "2026-10-30T14:29:42.501682Z",
  "completed_at": "2026-10-30T13:59:42.825293Z",
  "masked_pan": "41****6794",
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
      "id": "0f1c21b2-f981-4eeb-8c35-393afacc8384",
      "at": "2026-10-30T13:59:43.813333Z",
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
  "command_id": "64b92044-0b35-41b6-829b-d9beca3ee043",
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
  "correlation_id": "753b7a41-8a7b-43cb-b36e-9cdd08b26abb"
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
  "device_ref": "sandbox-14793"
}
```

```json
{
  "challenge_id": "78f8d8dc-a238-4143-8818-f6bac7ec593c",
  "expires_at": "2026-10-30T14:04:45.164895451Z",
  "resend_available_at": "2026-10-30T13:59:46.164895451Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "302852",
  "sent_at": "2026-10-30T13:59:45.167975317Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78f8d8dc-a238-4143-8818-f6bac7ec593c",
  "code": "302852",
  "device_ref": "sandbox-14793"
}
```

```json
{
  "session_id": "99d98c5b-9c3e-4646-b796-1ba12eb1c4b2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2OTY4NSwiaWF0IjoxNzkzMzY4Nzg1LCJqdGkiOiJiNjlmNjEzMy1kYmQ4LTQ0YTctOTQ2My05NDZmOTg3NmZiYzkiLCJzaWQiOiI5OWQ5OGM1Yi05YzNlLTQ2NDYtYjc5Ni0xYmExMmViMWM0YjIifQ.nEu0UcZp3z2xOuvplWxakcyJbi8nzbqtLXVFuad982E",
  "access_expires_at": "2026-10-30T14:14:45.504144058Z",
  "refresh_token": "fYoW1L9BHmBLem_53u5fBKSBOsSgJ8-sC_vooM_6Mfk",
  "refresh_expires_at": "2026-11-29T13:59:45.503512905Z",
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
  "command_id": "870f1c25-3bd5-4966-be88-f5a86779cd83",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:59:46Z",
    "sequence": 1793368786145
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e85d06b8-38e8-4359-9568-2f229d114bac",
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
  "last_heartbeat_at": "2026-10-30T13:59:46.166207Z",
  "last_location_at": "2026-10-30T13:59:46.166207Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637394773",
  "device_ref": "sandbox-6636"
}
```

```json
{
  "challenge_id": "5296a511-1019-4173-bf76-542c3e43e4a3",
  "expires_at": "2026-10-30T14:04:46.48056084Z",
  "resend_available_at": "2026-10-30T13:59:47.48056084Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637394773` → **200**

```json
{
  "phone": "+380637394773",
  "audience": "CLIENT",
  "code": "861908",
  "sent_at": "2026-10-30T13:59:46.483628294Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5296a511-1019-4173-bf76-542c3e43e4a3",
  "code": "861908",
  "device_ref": "sandbox-6636"
}
```

```json
{
  "session_id": "b16da7f6-d08d-4dcf-a06d-fedf2ae207f2",
  "subject": {
    "type": "CLIENT",
    "id": "43cfa8a9-0d33-4003-b6f3-069e11227634"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0M2NmYThhOS0wZDMzLTQwMDMtYjZmMy0wNjllMTEyMjc2MzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY5Njg2LCJpYXQiOjE3OTMzNjg3ODYsImp0aSI6IjQxMjJmYmM3LWExMGUtNGY0MC05YTNkLTYzMjIxYzM3MmMyNCIsInNpZCI6ImIxNmRhN2Y2LWQwOGQtNGRjZi1hMDZkLWZlZGYyYWUyMDdmMiJ9.SD0qWI00nAce7Mh0lvzntyhW78NLL4jr9oaJ0DLgFKs",
  "access_expires_at": "2026-10-30T14:14:46.822753881Z",
  "refresh_token": "7LO6n7Zvda6caSWoKHGiXicHkf2_K156hje8CWf-E_Q",
  "refresh_expires_at": "2026-11-29T13:59:46.822081219Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "064d0f60-6cb5-43c2-aa62-24bda9394b69",
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
  "id": "6f02c239-4065-457b-9173-119694771168",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:04:47.136856Z",
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
  "command_id": "f4db6e5e-ab69-4ed5-8299-70b6515c0a92",
  "quote_id": "6f02c239-4065-457b-9173-119694771168",
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
  "id": "d94de4bf-8bca-4d18-bd41-9d2f43cb0ab3",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "43cfa8a9-0d33-4003-b6f3-069e11227634",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:59:47.458136Z",
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
    "id": "6f8d2d30-cc69-45a2-991e-9299cafdb04f",
    "order_id": "d94de4bf-8bca-4d18-bd41-9d2f43cb0ab3",
    "expires_at": "2026-10-30T14:00:02.461586Z",
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

`POST /api/driver/v1/offers/6f8d2d30-cc69-45a2-991e-9299cafdb04f/accept` → **200**

```json
{
  "command_id": "f2b18767-d624-49fc-bd60-d34dcee891df"
}
```

```json
{
  "id": "c14f6c94-cabe-4102-857e-d662472dd94b",
  "order_id": "d94de4bf-8bca-4d18-bd41-9d2f43cb0ab3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "26264149-af54-489f-ac25-bba8f8d0f0bf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "26264149-af54-489f-ac25-bba8f8d0f0bf",
  "order_id": "d94de4bf-8bca-4d18-bd41-9d2f43cb0ab3",
  "assignment_id": "c14f6c94-cabe-4102-857e-d662472dd94b",
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

`POST /api/driver/v1/work-sessions/e85d06b8-38e8-4359-9568-2f229d114bac/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:59:48Z",
    "sequence": 1793368788735
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e85d06b8-38e8-4359-9568-2f229d114bac",
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
  "last_heartbeat_at": "2026-10-30T13:59:48.755421Z",
  "last_location_at": "2026-10-30T13:59:48.755421Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/26264149-af54-489f-ac25-bba8f8d0f0bf/arrive` → **200**

```json
{
  "command_id": "ed77643a-a4b9-4fbd-aad9-8a018e3036fd",
  "expected_version": 0
}
```

```json
{
  "id": "26264149-af54-489f-ac25-bba8f8d0f0bf",
  "order_id": "d94de4bf-8bca-4d18-bd41-9d2f43cb0ab3",
  "assignment_id": "c14f6c94-cabe-4102-857e-d662472dd94b",
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
  "arrived_at": "2026-10-30T13:59:49.072472Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/26264149-af54-489f-ac25-bba8f8d0f0bf/start` → **200**

```json
{
  "command_id": "6260a4d6-80f9-4792-995a-5cb3318dc2c6",
  "expected_version": 1
}
```

```json
{
  "id": "26264149-af54-489f-ac25-bba8f8d0f0bf",
  "order_id": "d94de4bf-8bca-4d18-bd41-9d2f43cb0ab3",
  "assignment_id": "c14f6c94-cabe-4102-857e-d662472dd94b",
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
  "arrived_at": "2026-10-30T13:59:49.072472Z",
  "started_at": "2026-10-30T13:59:49.397565Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/26264149-af54-489f-ac25-bba8f8d0f0bf/complete` → **200**

```json
{
  "command_id": "f5607c96-1ffc-4c72-905b-9979cda1894e",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:59:49Z",
  "cash_received": false
}
```

```json
{
  "id": "26264149-af54-489f-ac25-bba8f8d0f0bf",
  "order_id": "d94de4bf-8bca-4d18-bd41-9d2f43cb0ab3",
  "assignment_id": "c14f6c94-cabe-4102-857e-d662472dd94b",
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
  "arrived_at": "2026-10-30T13:59:49.072472Z",
  "started_at": "2026-10-30T13:59:49.397565Z",
  "completed_at": "2026-10-30T13:59:49.7268Z",
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
  "session_id": "55fa67d7-3c9e-4cc3-9793-dff73b4678c4",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjk2OTAsImlhdCI6MTc5MzM2ODc5MCwianRpIjoiYTI0ZjE5ZWYtZjRlZC00OTgwLWIxZDAtMjQyYzVhODE5NzViIiwic2lkIjoiNTVmYTY3ZDctM2M5ZS00Y2MzLTk3OTMtZGZmNzNiNDY3OGM0In0.RD1fjHj_U1eQJRfQEYVYmywxDjv2eECbuPidRWlnrZo",
  "access_expires_at": "2026-10-30T14:14:50.360921866Z",
  "refresh_token": "OXt1yQSwyjLXkRDA6GizOvz0BhNqyr9c1-apNs0k7TU",
  "refresh_expires_at": "2026-10-31T01:59:50.360321069Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/d94de4bf-8bca-4d18-bd41-9d2f43cb0ab3/cash-dispute` → **200**

```json
{
  "order_id": "d94de4bf-8bca-4d18-bd41-9d2f43cb0ab3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "43cfa8a9-0d33-4003-b6f3-069e11227634",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T13:59:49.894586Z",
  "decide_by": "2026-11-13T13:59:49.894586Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T13:59:49.894586Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "d94de4bf-8bca-4d18-bd41-9d2f43cb0ab3",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "43cfa8a9-0d33-4003-b6f3-069e11227634",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T13:59:49.894586Z",
      "decide_by": "2026-11-13T13:59:49.894586Z",
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

`POST /api/admin/v1/orders/d94de4bf-8bca-4d18-bd41-9d2f43cb0ab3/cash-dispute/decide` → **400**

```json
{
  "command_id": "4f16dfbf-98f0-404b-881e-843efbec3c51",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/d94de4bf-8bca-4d18-bd41-9d2f43cb0ab3/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "ab1b6316-4399-4f36-93c8-dc10ae7040fd",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/d94de4bf-8bca-4d18-bd41-9d2f43cb0ab3/cash-dispute/decide` → **200**

```json
{
  "command_id": "b7b719b1-5066-4c1e-8aef-5608303fc275",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "d94de4bf-8bca-4d18-bd41-9d2f43cb0ab3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "43cfa8a9-0d33-4003-b6f3-069e11227634",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T13:59:49.894586Z",
  "decide_by": "2026-11-13T13:59:49.894586Z",
  "decision": "PAY_DRIVER",
  "decided_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T13:59:51.661351Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/d94de4bf-8bca-4d18-bd41-9d2f43cb0ab3/cash-dispute/decide` → **409**

```json
{
  "command_id": "0f03ae19-5a70-4903-95ba-90571fc82cec",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/d94de4bf-8bca-4d18-bd41-9d2f43cb0ab3/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e6962e38-e652-4855-ba6e-f123ef8e5ef6"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e85d06b8-38e8-4359-9568-2f229d114bac",
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
  "last_heartbeat_at": "2026-10-30T13:59:48.755421Z",
  "last_location_at": "2026-10-30T13:59:48.755421Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e85d06b8-38e8-4359-9568-2f229d114bac/close` → **200**

```json
{
  "command_id": "23817795-7b12-4bc2-9889-a95f76bfbbd9",
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
  "phone": "+380738483639",
  "device_ref": "sandbox-2300"
}
```

```json
{
  "challenge_id": "d7fb0a3c-3935-4f1c-8d1e-85ac3e05c2dd",
  "expires_at": "2026-10-30T14:04:52.902579609Z",
  "resend_available_at": "2026-10-30T13:59:53.902579609Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738483639` → **200**

```json
{
  "phone": "+380738483639",
  "audience": "CLIENT",
  "code": "378683",
  "sent_at": "2026-10-30T13:59:52.905975387Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d7fb0a3c-3935-4f1c-8d1e-85ac3e05c2dd",
  "code": "378683",
  "device_ref": "sandbox-2300"
}
```

```json
{
  "session_id": "144d4038-6382-42a2-8ade-e953ad57bd89",
  "subject": {
    "type": "CLIENT",
    "id": "76839a70-708f-42c6-baf3-e11a8e72ccf1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NjgzOWE3MC03MDhmLTQyYzYtYmFmMy1lMTFhOGU3MmNjZjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY5NjkzLCJpYXQiOjE3OTMzNjg3OTMsImp0aSI6ImNhNWRjZDEzLTQ0YjUtNDY5Mi05NWY1LTljMzEyMDZlOGZiMCIsInNpZCI6IjE0NGQ0MDM4LTYzODItNDJhMi04YWRlLWU5NTNhZDU3YmQ4OSJ9.aAK0vhN20PzdqPa_rHIB7fGLcQpcNZm8qjzJbmyP8LE",
  "access_expires_at": "2026-10-30T14:14:53.241207613Z",
  "refresh_token": "YTiVXEOC5ISP4mEDJsHIpz8VvJQ6GYkBIscw00zLUhw",
  "refresh_expires_at": "2026-11-29T13:59:53.240597419Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "dda40c06-f983-46b2-a9fb-f1ceeb4f5191",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "60dbed46-d6d2-416b-b597-c122c5a80708",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-60dbed46-d6d2-416b-b597-c122c5a80708",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "919ab2582ee1f13f88be8c37a2d81183",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=60dbed46-d6d2-416b-b597-c122c5a80708",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738483639"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=60dbed46-d6d2-416b-b597-c122c5a80708",
  "expires_at": "2026-10-30T14:29:53.54568Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/60dbed46-d6d2-416b-b597-c122c5a80708` → **200**

```json
{
  "id": "60dbed46-d6d2-416b-b597-c122c5a80708",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T14:29:53.54568Z",
  "card": {
    "id": "bd27c46d-6c25-4b17-8e9b-a60fefeb024f",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4868",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:59:53.860847Z"
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
  "device_ref": "sandbox-21694"
}
```

```json
{
  "challenge_id": "20b9d0a6-cfbe-4a6d-85a1-448eb5499298",
  "expires_at": "2026-10-30T14:04:54.181660134Z",
  "resend_available_at": "2026-10-30T13:59:55.181660134Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "205825",
  "sent_at": "2026-10-30T13:59:54.184584445Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "20b9d0a6-cfbe-4a6d-85a1-448eb5499298",
  "code": "205825",
  "device_ref": "sandbox-21694"
}
```

```json
{
  "session_id": "7de2fb72-19d0-4993-8b23-9f105f2a2861",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2OTY5NCwiaWF0IjoxNzkzMzY4Nzk0LCJqdGkiOiJiNGQ4MzgzNS0wYjc0LTRmMGMtOTk2Zi1kNWRkZGZlOTk0N2MiLCJzaWQiOiI3ZGUyZmI3Mi0xOWQwLTQ5OTMtOGIyMy05ZjEwNWYyYTI4NjEifQ.yyw1HFhQoOkcy-uOiV5OkEbC_FkANkqNX7w1wFhu4xY",
  "access_expires_at": "2026-10-30T14:14:54.525987964Z",
  "refresh_token": "EZDWDfXbL5VAF0cnMafoAf12_1So11UC8qNUIvblWEk",
  "refresh_expires_at": "2026-11-29T13:59:54.525252744Z",
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
  "command_id": "d06a899b-5707-4400-a920-66c252b75dbf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:59:55Z",
    "sequence": 1793368795147
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "df0c3fe7-30e9-4b3e-a240-d211e12999b9",
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
  "last_heartbeat_at": "2026-10-30T13:59:55.167753Z",
  "last_location_at": "2026-10-30T13:59:55.167753Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d8e98c2c-51ed-49e7-b5c9-23dba81313e4",
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
  "id": "2bc3fb23-7563-468d-8c8e-edd9f45353cc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:04:55.483840Z",
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
  "command_id": "bf58fbab-38de-4148-a04a-bd46ed43721e",
  "quote_id": "2bc3fb23-7563-468d-8c8e-edd9f45353cc",
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
  "id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "76839a70-708f-42c6-baf3-e11a8e72ccf1",
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
  "created_at": "2026-10-30T13:59:55.798088Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b` → **200**

```json
{
  "id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "76839a70-708f-42c6-baf3-e11a8e72ccf1",
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
  "created_at": "2026-10-30T13:59:55.798088Z",
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
    "id": "d0c12f6e-757e-42bf-9e22-dfc0b6d140c5",
    "order_id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
    "expires_at": "2026-10-30T14:00:10.938901Z",
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

`POST /api/driver/v1/offers/d0c12f6e-757e-42bf-9e22-dfc0b6d140c5/accept` → **200**

```json
{
  "command_id": "f37f19c6-adad-46e4-a46a-4c478057b4a7"
}
```

```json
{
  "id": "5e9964d6-3340-4e9d-b492-1fdcf4a7a664",
  "order_id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d4a065c1-299c-4f81-9f75-4018db17a7cf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d4a065c1-299c-4f81-9f75-4018db17a7cf",
  "order_id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
  "assignment_id": "5e9964d6-3340-4e9d-b492-1fdcf4a7a664",
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

`POST /api/rider/v1/orders/4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b/messages` → **201**

```json
{
  "command_id": "9d902bee-be75-464f-943e-e64702b306fe",
  "body": "Я біля входу, мій номер +380738483639, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "e93cdd7e-9f95-482f-9ca7-45a8b26d50a2",
  "order_id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380738483639, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T13:59:57.35938192Z"
}
```

`POST /api/driver/v1/trips/d4a065c1-299c-4f81-9f75-4018db17a7cf/messages` → **201**

```json
{
  "command_id": "506e41ea-785f-42f7-a6df-128a066abc02",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "759b176e-5b23-49f5-9d7a-79cce45ce794",
  "order_id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T13:59:57.664148405Z"
}
```

(the car drives 7 s to the next point)

`POST /api/driver/v1/work-sessions/df0c3fe7-30e9-4b3e-a240-d211e12999b9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:00:04Z",
    "sequence": 1793368804986
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "df0c3fe7-30e9-4b3e-a240-d211e12999b9",
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
  "last_heartbeat_at": "2026-10-30T14:00:05.006527Z",
  "last_location_at": "2026-10-30T14:00:05.006527Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/d4a065c1-299c-4f81-9f75-4018db17a7cf/arrive` → **200**

```json
{
  "command_id": "c197a883-2468-4a3f-af72-11bc978403bf",
  "expected_version": 0
}
```

```json
{
  "id": "d4a065c1-299c-4f81-9f75-4018db17a7cf",
  "order_id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
  "assignment_id": "5e9964d6-3340-4e9d-b492-1fdcf4a7a664",
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
  "arrived_at": "2026-10-30T14:00:05.315398Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d4a065c1-299c-4f81-9f75-4018db17a7cf/start` → **200**

```json
{
  "command_id": "78f3283d-2eb4-4bb4-bc0c-9e8ecdf7466b",
  "expected_version": 1
}
```

```json
{
  "id": "d4a065c1-299c-4f81-9f75-4018db17a7cf",
  "order_id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
  "assignment_id": "5e9964d6-3340-4e9d-b492-1fdcf4a7a664",
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
  "arrived_at": "2026-10-30T14:00:05.315398Z",
  "started_at": "2026-10-30T14:00:05.640227Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/df0c3fe7-30e9-4b3e-a240-d211e12999b9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:01:35Z",
    "sequence": 1793368895966
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "df0c3fe7-30e9-4b3e-a240-d211e12999b9",
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
  "last_heartbeat_at": "2026-10-30T14:01:35.986795Z",
  "last_location_at": "2026-10-30T14:01:35.986795Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/d4a065c1-299c-4f81-9f75-4018db17a7cf/complete` → **200**

```json
{
  "command_id": "de0ddf83-a278-484e-8fda-810480127608",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:01:36Z",
  "cash_received": false
}
```

```json
{
  "id": "d4a065c1-299c-4f81-9f75-4018db17a7cf",
  "order_id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
  "assignment_id": "5e9964d6-3340-4e9d-b492-1fdcf4a7a664",
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
  "arrived_at": "2026-10-30T14:00:05.315398Z",
  "started_at": "2026-10-30T14:00:05.640227Z",
  "completed_at": "2026-10-30T14:01:36.312874Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b` → **200**

```json
{
  "id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "76839a70-708f-42c6-baf3-e11a8e72ccf1",
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
    "id": "5e9964d6-3340-4e9d-b492-1fdcf4a7a664",
    "order_id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d4a065c1-299c-4f81-9f75-4018db17a7cf",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:59:55.798088Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b` → **200**

```json
{
  "id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "76839a70-708f-42c6-baf3-e11a8e72ccf1",
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
    "id": "5e9964d6-3340-4e9d-b492-1fdcf4a7a664",
    "order_id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d4a065c1-299c-4f81-9f75-4018db17a7cf",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:59:55.798088Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b` → **200**

```json
{
  "id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "76839a70-708f-42c6-baf3-e11a8e72ccf1",
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
    "id": "5e9964d6-3340-4e9d-b492-1fdcf4a7a664",
    "order_id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d4a065c1-299c-4f81-9f75-4018db17a7cf",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:59:55.798088Z",
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
  "session_id": "df0c3fe7-30e9-4b3e-a240-d211e12999b9",
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
  "last_heartbeat_at": "2026-10-30T14:01:35.986795Z",
  "last_location_at": "2026-10-30T14:01:35.986795Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/df0c3fe7-30e9-4b3e-a240-d211e12999b9/close` → **200**

```json
{
  "command_id": "367062f2-fb23-4d9e-b4f2-952bbd2fca41",
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
  "session_id": "96de4089-4215-48ee-baf6-f27c104222d7",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjk4MDAsImlhdCI6MTc5MzM2ODkwMCwianRpIjoiZGZiYjZiNzgtMTI4MS00YWY4LTlmNTUtYTNkZTYxZTM2ZDQzIiwic2lkIjoiOTZkZTQwODktNDIxNS00OGVlLWJhZjYtZjI3YzEwNDIyMmQ3In0.3S8XFn0JIs_mmWpXNcLJ_ao_QJF2CAsFT49bE0Y4beE",
  "access_expires_at": "2026-10-30T14:16:40.491822805Z",
  "refresh_token": "ukgBODqd-8m-nc9voLBa9nKUdnD1uN1dw2zNOouzu5Y",
  "refresh_expires_at": "2026-10-31T02:01:40.490584366Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "4b7d21b6-4e75-4196-a7bd-51e83742621e"
}
```

`GET /api/admin/v1/orders/4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T14:01:41.113128038Z",
  "order": {
    "id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
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
    "created_at": "2026-10-30T13:59:55.798088Z",
    "assigned_at": "2026-10-30T13:59:56.752916Z",
    "arrived_at": "2026-10-30T14:00:05.315398Z",
    "started_at": "2026-10-30T14:00:05.640227Z",
    "completed_at": "2026-10-30T14:01:36.312874Z"
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
    "id": "76839a70-708f-42c6-baf3-e11a8e72ccf1",
    "registered_at": "2026-10-30T13:59:53.238699Z",
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
      "created_at": "2026-10-30T13:59:55.800794Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T14:01:37.176848Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b/chargebacks` → **422**

```json
{
  "command_id": "a00eca3c-3c21-4dc8-a0c9-de91d006126e",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "8926d36b-5046-44ff-aa09-68716aad71db"
}
```

`POST /api/admin/v1/orders/4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b/chargebacks` → **201**

```json
{
  "command_id": "0b36767b-35fe-4581-81ec-ad9f8d3529a9",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "085e3037-9fda-43ab-b64f-deb07ca2b6c2",
  "order_id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T14:01:41.807817Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b/chargebacks` → **201**

```json
{
  "command_id": "0b36767b-35fe-4581-81ec-ad9f8d3529a9",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "085e3037-9fda-43ab-b64f-deb07ca2b6c2",
  "order_id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T14:01:41.807817Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/76839a70-708f-42c6-baf3-e11a8e72ccf1` → **200**

```json
{
  "client": {
    "id": "76839a70-708f-42c6-baf3-e11a8e72ccf1",
    "phone": "+380738483639",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:59:53.238699Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:59:55.798088Z",
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

`POST /api/admin/v1/orders/4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b/chargebacks/085e3037-9fda-43ab-b64f-deb07ca2b6c2/resolve` → **200**

```json
{
  "command_id": "7228e462-ae36-4e75-bad7-b2bd9b2f5faf",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "085e3037-9fda-43ab-b64f-deb07ca2b6c2",
  "order_id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T14:01:41.807817Z",
  "resolved_at": "2026-10-30T14:01:42.840329Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/76839a70-708f-42c6-baf3-e11a8e72ccf1` → **200**

```json
{
  "client": {
    "id": "76839a70-708f-42c6-baf3-e11a8e72ccf1",
    "phone": "+380738483639",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:59:53.238699Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:59:55.798088Z",
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

`GET /api/admin/v1/clients/76839a70-708f-42c6-baf3-e11a8e72ccf1` → **200**

```json
{
  "client": {
    "id": "76839a70-708f-42c6-baf3-e11a8e72ccf1",
    "phone": "+380738483639",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:59:53.238699Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:59:55.798088Z",
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

`POST /api/admin/v1/orders/4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b/chargebacks/085e3037-9fda-43ab-b64f-deb07ca2b6c2/resolve` → **409**

```json
{
  "command_id": "f8ddd88f-868f-4f51-98c3-0ae52ba5ddc6",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b/chargebacks/085e3037-9fda-43ab-b64f-deb07ca2b6c2/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "697bd62d-d512-4649-b49d-8713df7a111e"
}
```

`GET /api/admin/v1/orders/4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "085e3037-9fda-43ab-b64f-deb07ca2b6c2",
      "order_id": "4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T14:01:41.807817Z",
      "resolved_at": "2026-10-30T14:01:42.840329Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 4c4ce5cf-f130-47fc-9dc8-07f4ebe73d9b without phone or card digits; chargeback 085e3037-9fda-43ab-b64f-deb07ca2b6c2 recorded and won.

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
  "session_id": "ffa8d45a-d664-41f9-919c-6ba78c49e9dc",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjk4MDYsImlhdCI6MTc5MzM2ODkwNiwianRpIjoiODY2ODM3NGEtNDM1Ni00YzBkLTgwY2MtOTdhN2U5Njc3NTRiIiwic2lkIjoiZmZhOGQ0NWEtZDY2NC00MWY5LTkxOWMtNmJhNzhjNDllOWRjIn0.u4NWxcakXfWAgXsT_22XNUs_cuSL1wbsq5qfQ_mtG-w",
  "access_expires_at": "2026-10-30T14:16:46.089395198Z",
  "refresh_token": "GuQnvlAEFAsws6tot8LpDS0SomUc2jw2bCdotrWtpJM",
  "refresh_expires_at": "2026-10-31T02:01:46.088746431Z",
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
  "phone": "+48600863142",
  "device_ref": "sandbox-10320"
}
```

```json
{
  "challenge_id": "cd6aa80c-ccdb-4090-b480-70a969044426",
  "expires_at": "2026-10-30T14:06:47.012429338Z",
  "resend_available_at": "2026-10-30T14:01:48.012429338Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600863142` → **200**

```json
{
  "phone": "+48600863142",
  "audience": "CLIENT",
  "code": "094000",
  "sent_at": "2026-10-30T14:01:47.015543883Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd6aa80c-ccdb-4090-b480-70a969044426",
  "code": "094000",
  "device_ref": "sandbox-10320"
}
```

```json
{
  "session_id": "116ead26-0052-4816-a9f3-c7dabe1cf256",
  "subject": {
    "type": "CLIENT",
    "id": "3fe7b8fa-3569-4f56-a8bb-206895949c35"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZmU3YjhmYS0zNTY5LTRmNTYtYThiYi0yMDY4OTU5NDljMzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY5ODA3LCJpYXQiOjE3OTMzNjg5MDcsImp0aSI6IjI1OTRlMDVmLTE3ZGMtNGZlOS1iYTNkLTI3YjEwMWE2NzM3ZSIsInNpZCI6IjExNmVhZDI2LTAwNTItNDgxNi1hOWYzLWM3ZGFiZTFjZjI1NiJ9.99uudY5ecxQlr3dYCK1cJkd9lhcHMGRClMZqipe__is",
  "access_expires_at": "2026-10-30T14:16:47.355164203Z",
  "refresh_token": "XajP1ZTQxjXMGVkbxpeaNp5GIaK4wX_-E-RQxn6LDcw",
  "refresh_expires_at": "2026-11-29T14:01:47.354577042Z",
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
  "command_id": "e15f4696-9ddd-4c27-86fc-90185c97187c",
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
  "correlation_id": "902fc588-a6c1-41ff-9733-7f912cf7950d",
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
  "command_id": "fee3815c-7e29-4b89-9ade-10cdfaa888e4",
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
  "paused_at": "2026-10-30T14:01:48.598649757Z",
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
  "command_id": "94ed784c-5cff-460d-ac00-0caa1054498f",
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
  "id": "df4202cb-b2e1-43b0-bb9a-ef1aad9668e1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:06:49.238145Z",
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
  "command_id": "dd0634a6-facd-4f36-a4a6-cf22889336db",
  "quote_id": "df4202cb-b2e1-43b0-bb9a-ef1aad9668e1",
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
  "correlation_id": "39a078b3-1907-4546-9676-122c99d8def2"
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
  "paused_at": "2026-10-30T14:01:48.59865Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "015659ca-99f7-45d3-bb7a-e861510d8127",
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
  "command_id": "740618fa-fa5c-4834-b9c3-f3b20199699a",
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
  "command_id": "1c458003-f53d-41f1-b6a0-8e07a32d6c84",
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
  "id": "b7933c3e-55c0-4e05-b7d8-8ebf4ae1ceea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:06:51.086085Z",
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
  "command_id": "30ea5031-191e-4934-9f67-f117fc96fd07",
  "quote_id": "b7933c3e-55c0-4e05-b7d8-8ebf4ae1ceea",
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
  "correlation_id": "7e193e6c-a18b-418c-80b5-200f7f7de74f"
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
  "command_id": "26d09e05-fb78-4a1b-9954-34d447ec26ae",
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
  "command_id": "1873bb4d-3cf9-4207-bc44-4d13b50541e6",
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
  "id": "d31bc49a-8439-4b07-84c5-6d9e55ccdc00",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:06:52.357250Z",
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
  "command_id": "b257c001-9a91-4836-a260-432e2a451553",
  "quote_id": "d31bc49a-8439-4b07-84c5-6d9e55ccdc00",
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
  "correlation_id": "964ee5f5-4607-4df5-bbfe-2509c986faae"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "780b8afe-428e-497e-a422-3dd01ecb7a5c",
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
  "correlation_id": "adc32f57-74eb-465d-bf6d-a5933db43201",
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
  "command_id": "e5f43e22-5ea5-4351-9cf6-7696d88ee628",
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
  "phone": "+380671503868",
  "device_ref": "sandbox-578"
}
```

```json
{
  "challenge_id": "3d377ba4-97a9-4c16-aa2e-9ebd3f5c0795",
  "expires_at": "2026-10-30T14:06:53.957307601Z",
  "resend_available_at": "2026-10-30T14:01:54.957307601Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671503868` → **200**

```json
{
  "phone": "+380671503868",
  "audience": "CLIENT",
  "code": "313044",
  "sent_at": "2026-10-30T14:01:53.960008891Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d377ba4-97a9-4c16-aa2e-9ebd3f5c0795",
  "code": "313044",
  "device_ref": "sandbox-578"
}
```

```json
{
  "session_id": "6f626bce-5374-472a-aab3-6816d6d301f1",
  "subject": {
    "type": "CLIENT",
    "id": "9bdfb486-380a-433d-86e2-6aba4a6c41a0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmRmYjQ4Ni0zODBhLTQzM2QtODZlMi02YWJhNGE2YzQxYTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY5ODE0LCJpYXQiOjE3OTMzNjg5MTQsImp0aSI6IjI5YjhiMzRmLTVjMmEtNDkxMi05YTE1LTg4MzE2OTZiYWYwMSIsInNpZCI6IjZmNjI2YmNlLTUzNzQtNDcyYS1hYWIzLTY4MTZkNmQzMDFmMSJ9.DN9WWYOZZX_qMpdlioKpyfZqVbW9yCKYdbKIjF6zHek",
  "access_expires_at": "2026-10-30T14:16:54.281944953Z",
  "refresh_token": "3Zjah6tII7RNGyez_fRqthfqa1vMvIIO77-1U2BZzK8",
  "refresh_expires_at": "2026-11-29T14:01:54.281258547Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9bdfb486-380a-433d-86e2-6aba4a6c41a0",
  "session_id": "6f626bce-5374-472a-aab3-6816d6d301f1",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bc2c0f35-f5e3-4dd3-9b14-637777487b1e",
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
  "id": "e40cc5b8-2fba-4398-a4b0-218b3ca971da",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:06:54.885357Z",
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
  "challenge_id": "befffdd7-af70-4696-a2e8-673706ceb287",
  "expires_at": "2026-10-30T14:06:57.204580478Z",
  "resend_available_at": "2026-10-30T14:01:58.204580478Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671503868` → **200**

```json
{
  "phone": "+380671503868",
  "audience": "CLIENT",
  "code": "310510",
  "sent_at": "2026-10-30T14:01:57.207111178Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "ec0e1b5e-4dc3-42e4-b96c-16390c048a26",
  "challenge_id": "befffdd7-af70-4696-a2e8-673706ceb287",
  "otp_code": "310510"
}
```

```json
{
  "client_id": "9bdfb486-380a-433d-86e2-6aba4a6c41a0",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T14:01:57.546249569Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "0068b88b-5ef8-4c49-a990-e23c4e257e3d",
  "quote_id": "e40cc5b8-2fba-4398-a4b0-218b3ca971da",
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
  "correlation_id": "7c61eab0-b3f1-475a-8584-949dbfa3307d"
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
  "session_id": "f6d3eaae-ee5b-4608-889a-d0e9462d077f",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjk4MTgsImlhdCI6MTc5MzM2ODkxOCwianRpIjoiZjhkNGFjOGUtNTY2Yi00MmFkLTkwOTItNTNjZDY5MGQ2NmU0Iiwic2lkIjoiZjZkM2VhYWUtZWU1Yi00NjA4LTg4OWEtZDBlOTQ2MmQwNzdmIn0.qldnIOQG7uhHMXBDVmVXY1VlliUWGjhEtFA8DUIAu_k",
  "access_expires_at": "2026-10-30T14:16:58.478233017Z",
  "refresh_token": "jkHJj4pwFzUFmFyA0ELZs9yaogZcKr6MU-VdnQJTzUY",
  "refresh_expires_at": "2026-10-31T02:01:58.477568863Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "9bdfb486-380a-433d-86e2-6aba4a6c41a0",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T14:01:57.54625Z",
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

`POST /api/admin/v1/client-deletions/9bdfb486-380a-433d-86e2-6aba4a6c41a0/complete` → **200**

```json
{
  "command_id": "3a1eb15c-8ed4-44be-a3b9-2ac2b7595a3f",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "9bdfb486-380a-433d-86e2-6aba4a6c41a0",
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
  "correlation_id": "1f80454c-140a-4098-9bea-4b2995fbcd61"
}
```

Done: client 9bdfb486-380a-433d-86e2-6aba4a6c41a0 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668704867",
  "device_ref": "sandbox-32096"
}
```

```json
{
  "challenge_id": "e326823c-af7b-43a7-af9a-902300692e38",
  "expires_at": "2026-10-30T14:06:59.731267676Z",
  "resend_available_at": "2026-10-30T14:02:00.731267676Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668704867` → **200**

```json
{
  "phone": "+380668704867",
  "audience": "CLIENT",
  "code": "234503",
  "sent_at": "2026-10-30T14:01:59.734468031Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e326823c-af7b-43a7-af9a-902300692e38",
  "code": "234503",
  "device_ref": "sandbox-32096"
}
```

```json
{
  "session_id": "33345c0f-f5dd-4d84-813f-f04b63228d48",
  "subject": {
    "type": "CLIENT",
    "id": "3a8d42d4-e3d2-42ce-ae7b-0f368d4b354c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYThkNDJkNC1lM2QyLTQyY2UtYWU3Yi0wZjM2OGQ0YjM1NGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY5ODIwLCJpYXQiOjE3OTMzNjg5MjAsImp0aSI6IjcxN2E1MzNjLTExNjQtNDY0Ni1hZDlmLTc4YzkzNDE3ZmQ3NCIsInNpZCI6IjMzMzQ1YzBmLWY1ZGQtNGQ4NC04MTNmLWYwNGI2MzIyOGQ0OCJ9.GZ0gSaUbpNAqNa1JjRTl6R31V2BYPCXDtzD6zWFIUbw",
  "access_expires_at": "2026-10-30T14:17:00.071883039Z",
  "refresh_token": "goy4SMJIIKpHgn71DYLtehYl3JF9WHUV4SQcp_66HLg",
  "refresh_expires_at": "2026-11-29T14:02:00.071246921Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3a8d42d4-e3d2-42ce-ae7b-0f368d4b354c",
  "session_id": "33345c0f-f5dd-4d84-813f-f04b63228d48",
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
  "session_id": "166eb438-401a-43bc-af46-6e028876cf13",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjk4MjAsImlhdCI6MTc5MzM2ODkyMCwianRpIjoiMzczZTY4NDktNGY5Zi00MjE5LWE2M2YtNDNjYmY1MTk4ZTU4Iiwic2lkIjoiMTY2ZWI0MzgtNDAxYS00M2JjLWFmNDYtNmUwMjg4NzZjZjEzIn0.Zy7EVLNWBsnVYWJGC7xJxh36jUmGvRN7dqS4E5DiiOM",
  "access_expires_at": "2026-10-30T14:17:00.956277127Z",
  "refresh_token": "5y8aVp3Mady4s-EfURtKx0iXMl9Fn44QmdYDYIPE7L8",
  "refresh_expires_at": "2026-10-31T02:02:00.955529727Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=8704867&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "3a8d42d4-e3d2-42ce-ae7b-0f368d4b354c",
      "phone": "+380668704867",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T14:02:00.069311Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/3a8d42d4-e3d2-42ce-ae7b-0f368d4b354c` → **200**

```json
{
  "client": {
    "id": "3a8d42d4-e3d2-42ce-ae7b-0f368d4b354c",
    "phone": "+380668704867",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T14:02:00.069311Z",
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

`POST /api/admin/v1/clients/3a8d42d4-e3d2-42ce-ae7b-0f368d4b354c/block` → **400**

```json
{
  "command_id": "52795fa2-3e4f-479a-bfb8-8a47a592f019",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/3a8d42d4-e3d2-42ce-ae7b-0f368d4b354c/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7b520f59-6607-4569-b93b-9603770c0efc",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/3a8d42d4-e3d2-42ce-ae7b-0f368d4b354c/block` → **200**

```json
{
  "command_id": "ab703e6e-70ea-4659-a3d2-ed57dfbd7ad2",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "3a8d42d4-e3d2-42ce-ae7b-0f368d4b354c",
  "phone": "+380668704867",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T14:02:00.069311Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T14:02:02.269936Z",
    "by": "432d3ce1-762e-4c60-80de-7105d97ad61c"
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
  "correlation_id": "076458b0-c94c-4eb6-b4f7-21e4f11ceff5"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668704867",
  "device_ref": "sandbox-9115"
}
```

```json
{
  "challenge_id": "71ddfc39-d7fe-409a-a9b3-0f07b170468e",
  "expires_at": "2026-10-30T14:07:04.916158663Z",
  "resend_available_at": "2026-10-30T14:02:05.916158663Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668704867` → **200**

```json
{
  "phone": "+380668704867",
  "audience": "CLIENT",
  "code": "405860",
  "sent_at": "2026-10-30T14:02:04.922991797Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "71ddfc39-d7fe-409a-a9b3-0f07b170468e",
  "code": "405860",
  "device_ref": "sandbox-9115"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "17223ef9-767d-4e61-92ad-341bfc4b1bae"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/3a8d42d4-e3d2-42ce-ae7b-0f368d4b354c` → **200**

```json
{
  "client": {
    "id": "3a8d42d4-e3d2-42ce-ae7b-0f368d4b354c",
    "phone": "+380668704867",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T14:02:00.069311Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T14:02:02.269936Z",
      "by": "432d3ce1-762e-4c60-80de-7105d97ad61c"
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

`POST /api/admin/v1/clients/3a8d42d4-e3d2-42ce-ae7b-0f368d4b354c/unblock` → **200**

```json
{
  "command_id": "d0b80889-de3b-47a9-9717-02b2ebb8ae55",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "3a8d42d4-e3d2-42ce-ae7b-0f368d4b354c",
  "phone": "+380668704867",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T14:02:00.069311Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668704867",
  "device_ref": "sandbox-6192"
}
```

```json
{
  "challenge_id": "ae0040c5-cd5c-4472-aa85-4a9fa5105885",
  "expires_at": "2026-10-30T14:07:08.260139441Z",
  "resend_available_at": "2026-10-30T14:02:09.260139441Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668704867` → **200**

```json
{
  "phone": "+380668704867",
  "audience": "CLIENT",
  "code": "275098",
  "sent_at": "2026-10-30T14:02:08.263102361Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ae0040c5-cd5c-4472-aa85-4a9fa5105885",
  "code": "275098",
  "device_ref": "sandbox-6192"
}
```

```json
{
  "session_id": "965e1850-9c1e-472f-b350-f616cb0e3028",
  "subject": {
    "type": "CLIENT",
    "id": "3a8d42d4-e3d2-42ce-ae7b-0f368d4b354c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYThkNDJkNC1lM2QyLTQyY2UtYWU3Yi0wZjM2OGQ0YjM1NGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY5ODI4LCJpYXQiOjE3OTMzNjg5MjgsImp0aSI6IjdjODMzOTdkLTY5YTEtNGMxNi05MTlkLWFhOTk3ZjE1Y2NjMyIsInNpZCI6Ijk2NWUxODUwLTljMWUtNDcyZi1iMzUwLWY2MTZjYjBlMzAyOCJ9.8qfLr3bkSZO-2jZQ3ISZ87rI81UQ2H1SBc5ideas0nA",
  "access_expires_at": "2026-10-30T14:17:08.606417361Z",
  "refresh_token": "wH-bM-ScT7so0VltUtbDNHQcSduoWnqGLiuVfsA5haw",
  "refresh_expires_at": "2026-11-29T14:02:08.605773168Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3a8d42d4-e3d2-42ce-ae7b-0f368d4b354c",
  "session_id": "965e1850-9c1e-472f-b350-f616cb0e3028",
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
  "phone": "+380668284239",
  "device_ref": "sandbox-25723"
}
```

```json
{
  "challenge_id": "21d79132-d405-41e0-b760-629567160be4",
  "expires_at": "2026-10-30T14:07:09.233309449Z",
  "resend_available_at": "2026-10-30T14:02:10.233309449Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668284239` → **200**

```json
{
  "phone": "+380668284239",
  "audience": "CLIENT",
  "code": "847739",
  "sent_at": "2026-10-30T14:02:09.236318635Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "21d79132-d405-41e0-b760-629567160be4",
  "code": "847739",
  "device_ref": "sandbox-25723"
}
```

```json
{
  "session_id": "548cc368-af24-4bdd-bce4-8b1278a3bde4",
  "subject": {
    "type": "CLIENT",
    "id": "7eea8b4a-6ad3-466c-b3e4-d970c1e260d8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZWVhOGI0YS02YWQzLTQ2NmMtYjNlNC1kOTcwYzFlMjYwZDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY5ODI5LCJpYXQiOjE3OTMzNjg5MjksImp0aSI6IjZhM2E3MWM0LTM1MmUtNDRhYy1hZDUxLTMwZjljNDJlMDdiNSIsInNpZCI6IjU0OGNjMzY4LWFmMjQtNGJkZC1iY2U0LThiMTI3OGEzYmRlNCJ9.Be8tkotJ9x-y0j8a5aiFhFa_DnT4BComi9719aeWaDE",
  "access_expires_at": "2026-10-30T14:17:09.570151919Z",
  "refresh_token": "4MMvaC8kv5avJwktX11karxJTzzCnNpaN63rWCZpHd8",
  "refresh_expires_at": "2026-11-29T14:02:09.569591229Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3fff3ba5-6387-4f68-93e1-8550daa88626",
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
  "id": "7398a897-c3cf-4664-93f2-dc356baa83a2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:07:09.882270Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 4a4d85f2-c240-447f-934c-0a21724bce9f) → **201**

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
  "session_id": "ae2b05d6-64ac-4199-bc5b-70a9aebec492",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjk4MzAsImlhdCI6MTc5MzM2ODkzMCwianRpIjoiY2ViODZhNmUtZjMzOS00NTJkLTkwZjAtNzQzZjkwMjVlZWQ0Iiwic2lkIjoiYWUyYjA1ZDYtNjRhYy00MTk5LWJjNWItNzBhOWFlYmVjNDkyIn0.lql68Y_FVBs9XGlmbT89Q-agXRqkCQkS8M54ms__fnE",
  "access_expires_at": "2026-10-30T14:17:10.526641179Z",
  "refresh_token": "CHlxPba0HwbApBTkPgeSJ49lvrJj1g6zkZRvUIk-VbA",
  "refresh_expires_at": "2026-10-31T02:02:10.525971993Z",
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
  "session_id": "304a6658-8db3-4692-81b0-4cff8b432c1a",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjk4MzEsImlhdCI6MTc5MzM2ODkzMSwianRpIjoiZTZlNDAzMTYtOWY2Yy00MzRmLWIxNWUtNGIxY2NkOWU1ZDJhIiwic2lkIjoiMzA0YTY2NTgtOGRiMy00NjkyLTgxYjAtNGNmZjhiNDMyYzFhIn0.EZ0tbBPSjYc_Lo_hFPQguG8uKf1jDVSu0_mizvB9DUI",
  "access_expires_at": "2026-10-30T14:17:11.128677273Z",
  "refresh_token": "YfIaRGkvoMUtm4ceLaalXvdiQcMZQO8L9nXhcdQjjIo",
  "refresh_expires_at": "2026-10-31T02:02:11.128092989Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/56c7a61c-c266-4d6b-81ae-6452ae4fc86e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T14:02:10.194695Z",
      "actor": {
        "type": "CLIENT",
        "id": "7eea8b4a-6ad3-466c-b3e4-d970c1e260d8",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "56c7a61c-c266-4d6b-81ae-6452ae4fc86e",
        "quote_id": "7398a897-c3cf-4664-93f2-dc356baa83a2",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "4a4d85f2-c240-447f-934c-0a21724bce9f"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T14:02:10.196637Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "56c7a61c-c266-4d6b-81ae-6452ae4fc86e",
        "attempt_id": "9c241948-3a01-4704-baca-3ee06736bcaf",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "4a4d85f2-c240-447f-934c-0a21724bce9f"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T14:02:10.204324Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "56c7a61c-c266-4d6b-81ae-6452ae4fc86e",
        "attempt_id": "9c241948-3a01-4704-baca-3ee06736bcaf"
      },
      "correlation_id": "4a4d85f2-c240-447f-934c-0a21724bce9f"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "9c241948-3a01-4704-baca-3ee06736bcaf",
        "generation": 1,
        "started_at": "2026-10-30T14:02:10.195666Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T14:02:10.204324Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T14:02:10.197348Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/4a4d85f2-c240-447f-934c-0a21724bce9f` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "56c7a61c-c266-4d6b-81ae-6452ae4fc86e:0",
      "order_id": "56c7a61c-c266-4d6b-81ae-6452ae4fc86e",
      "at": "2026-10-30T14:02:10.194695Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "56c7a61c-c266-4d6b-81ae-6452ae4fc86e:1",
      "order_id": "56c7a61c-c266-4d6b-81ae-6452ae4fc86e",
      "at": "2026-10-30T14:02:10.196637Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "56c7a61c-c266-4d6b-81ae-6452ae4fc86e:2",
      "order_id": "56c7a61c-c266-4d6b-81ae-6452ae4fc86e",
      "at": "2026-10-30T14:02:10.204324Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/424ca203-966d-4f9b-aa88-522b306ceddf` → **200**

```json
{
  "found": []
}
```

Done: request 4a4d85f2-c240-447f-934c-0a21724bce9f — order 56c7a61c-c266-4d6b-81ae-6452ae4fc86e found by its id.

`GET /api/rider/v1/orders/56c7a61c-c266-4d6b-81ae-6452ae4fc86e` → **200**

```json
{
  "id": "56c7a61c-c266-4d6b-81ae-6452ae4fc86e",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7eea8b4a-6ad3-466c-b3e4-d970c1e260d8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:02:10.194142Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/56c7a61c-c266-4d6b-81ae-6452ae4fc86e/cancel` → **200**

```json
{
  "command_id": "9a0046a6-213d-4a4d-b1c6-04147b72be2c",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "56c7a61c-c266-4d6b-81ae-6452ae4fc86e",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7eea8b4a-6ad3-466c-b3e4-d970c1e260d8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:02:10.194142Z",
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
  "phone": "+380632124406",
  "device_ref": "sandbox-21182"
}
```

```json
{
  "challenge_id": "cb0acff8-266d-4903-96d7-0a6021040744",
  "expires_at": "2026-10-30T14:07:13.026510878Z",
  "resend_available_at": "2026-10-30T14:02:14.026510878Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632124406` → **200**

```json
{
  "phone": "+380632124406",
  "audience": "CLIENT",
  "code": "152656",
  "sent_at": "2026-10-30T14:02:13.029897117Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb0acff8-266d-4903-96d7-0a6021040744",
  "code": "152656",
  "device_ref": "sandbox-21182"
}
```

```json
{
  "session_id": "73a83796-f39e-4d7f-9ec0-b040d8c3964d",
  "subject": {
    "type": "CLIENT",
    "id": "3f92f1bc-003d-47ef-ba56-37a421881f3f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZjkyZjFiYy0wMDNkLTQ3ZWYtYmE1Ni0zN2E0MjE4ODFmM2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY5ODMzLCJpYXQiOjE3OTMzNjg5MzMsImp0aSI6IjIzYWYwZWJlLTIyZjUtNDJkMC05ODRjLTc4ZjRiMTMxNzM2OCIsInNpZCI6IjczYTgzNzk2LWYzOWUtNGQ3Zi05ZWMwLWIwNDBkOGMzOTY0ZCJ9.HZ92YSn4HqV-nn239tz76eIDF-9WOm2TPcWMj5uTRlo",
  "access_expires_at": "2026-10-30T14:17:13.364987573Z",
  "refresh_token": "R44-nQJVn_DhHKPRHOWYMqjMwDka_4939BdMwy9Jya4",
  "refresh_expires_at": "2026-11-29T14:02:13.364415071Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "a8997eee-ae2f-445a-83f1-796001b49183",
  "expires_at": "2026-10-30T14:07:15.660048293Z",
  "resend_available_at": "2026-10-30T14:02:16.660048293Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632124406` → **200**

```json
{
  "phone": "+380632124406",
  "audience": "CLIENT",
  "code": "759521",
  "sent_at": "2026-10-30T14:02:15.662553295Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "1ddcbdfa-1a4b-4d9f-a06d-930f56edfe55",
  "challenge_id": "a8997eee-ae2f-445a-83f1-796001b49183",
  "otp_code": "759521"
}
```

```json
{
  "id": "2c491ba4-f143-41cf-96fb-682cde2b6fd2",
  "state": "PENDING",
  "created_at": "2026-10-30T14:02:16.004644Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/2c491ba4-f143-41cf-96fb-682cde2b6fd2` → **200**

```json
{
  "id": "2c491ba4-f143-41cf-96fb-682cde2b6fd2",
  "state": "PENDING",
  "created_at": "2026-10-30T14:02:16.004644Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/2c491ba4-f143-41cf-96fb-682cde2b6fd2` → **200**

```json
{
  "id": "2c491ba4-f143-41cf-96fb-682cde2b6fd2",
  "state": "PENDING",
  "created_at": "2026-10-30T14:02:16.004644Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/2c491ba4-f143-41cf-96fb-682cde2b6fd2` → **200**

```json
{
  "id": "2c491ba4-f143-41cf-96fb-682cde2b6fd2",
  "state": "PENDING",
  "created_at": "2026-10-30T14:02:16.004644Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/2c491ba4-f143-41cf-96fb-682cde2b6fd2` → **200**

```json
{
  "id": "2c491ba4-f143-41cf-96fb-682cde2b6fd2",
  "state": "PENDING",
  "created_at": "2026-10-30T14:02:16.004644Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/2c491ba4-f143-41cf-96fb-682cde2b6fd2` → **200**

```json
{
  "id": "2c491ba4-f143-41cf-96fb-682cde2b6fd2",
  "state": "PENDING",
  "created_at": "2026-10-30T14:02:16.004644Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/2c491ba4-f143-41cf-96fb-682cde2b6fd2` → **200**

```json
{
  "id": "2c491ba4-f143-41cf-96fb-682cde2b6fd2",
  "state": "PENDING",
  "created_at": "2026-10-30T14:02:16.004644Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/2c491ba4-f143-41cf-96fb-682cde2b6fd2` → **200**

```json
{
  "id": "2c491ba4-f143-41cf-96fb-682cde2b6fd2",
  "state": "PENDING",
  "created_at": "2026-10-30T14:02:16.004644Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/2c491ba4-f143-41cf-96fb-682cde2b6fd2` → **200**

```json
{
  "id": "2c491ba4-f143-41cf-96fb-682cde2b6fd2",
  "state": "READY",
  "created_at": "2026-10-30T14:02:16.004644Z",
  "ready_at": "2026-10-30T14:02:24.450088Z",
  "expires_at": "2026-11-06T14:02:24.450088Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/2c491ba4-f143-41cf-96fb-682cde2b6fd2/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631495532",
  "device_ref": "sandbox-26718"
}
```

```json
{
  "challenge_id": "8fe1e006-fdaf-4f9c-b3b4-7cc47b2b06c0",
  "expires_at": "2026-10-30T14:07:25.730980603Z",
  "resend_available_at": "2026-10-30T14:02:26.730980603Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631495532` → **200**

```json
{
  "phone": "+380631495532",
  "audience": "CLIENT",
  "code": "525652",
  "sent_at": "2026-10-30T14:02:25.733859517Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8fe1e006-fdaf-4f9c-b3b4-7cc47b2b06c0",
  "code": "525652",
  "device_ref": "sandbox-26718"
}
```

```json
{
  "session_id": "1119ce2d-b6ab-456c-940a-ed747e6d7d68",
  "subject": {
    "type": "CLIENT",
    "id": "ebbc817d-df65-47e4-b2b1-f8f71b998064"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYmJjODE3ZC1kZjY1LTQ3ZTQtYjJiMS1mOGY3MWI5OTgwNjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY5ODQ2LCJpYXQiOjE3OTMzNjg5NDYsImp0aSI6IjMzZDFlNWY2LTIyOTktNGM5MS1hZTEzLWZjZGExNTRiNjU5NSIsInNpZCI6IjExMTljZTJkLWI2YWItNDU2Yy05NDBhLWVkNzQ3ZTZkN2Q2OCJ9.CbQH2NNQT2PZjEiF3eID8keVrI6qKcNDVJfF4nwcEnQ",
  "access_expires_at": "2026-10-30T14:17:26.060122197Z",
  "refresh_token": "SY02N3uq46ksmUBSN8eJdepGATxSSWueTNGB7Ir2TC8",
  "refresh_expires_at": "2026-11-29T14:02:26.059520793Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/2c491ba4-f143-41cf-96fb-682cde2b6fd2/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/2c491ba4-f143-41cf-96fb-682cde2b6fd2/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "247505b6-c58d-4688-8620-3574001b941d"
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
  "session_id": "eed569f9-d0e3-4175-ba1a-1fed7c363e0e",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjk4NDYsImlhdCI6MTc5MzM2ODk0NiwianRpIjoiMDZlOWM3YzEtNDU2MC00ZDIzLWE1YTctNThlNGU1ZjUxOGM1Iiwic2lkIjoiZWVkNTY5ZjktZDBlMy00MTc1LWJhMWEtMWZlZDdjMzYzZTBlIn0.Ic8col26EChbLR9pCqd5rXZI4inYPzrS847W1QSXtbQ",
  "access_expires_at": "2026-10-30T14:17:26.956303821Z",
  "refresh_token": "9cC2EtK4mkDXxK1QrVg-u_dHkWTrcB09SDeZVWvp3wY",
  "refresh_expires_at": "2026-10-31T02:02:26.955552825Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3f92f1bc-003d-47ef-ba56-37a421881f3f",
  "session_id": "73a83796-f39e-4d7f-9ec0-b040d8c3964d",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/3f92f1bc-003d-47ef-ba56-37a421881f3f/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "2c491ba4-f143-41cf-96fb-682cde2b6fd2",
      "state": "READY",
      "created_at": "2026-10-30T14:02:16.004644Z",
      "ready_at": "2026-10-30T14:02:24.450088Z",
      "expires_at": "2026-11-06T14:02:24.450088Z",
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
  "device_ref": "sandbox-5262"
}
```

```json
{
  "challenge_id": "1134c488-e59e-4d5e-8d81-41d31a79031a",
  "expires_at": "2026-10-30T14:07:27.853138341Z",
  "resend_available_at": "2026-10-30T14:02:28.853138341Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "834069",
  "sent_at": "2026-10-30T14:02:27.85598466Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1134c488-e59e-4d5e-8d81-41d31a79031a",
  "code": "834069",
  "device_ref": "sandbox-5262"
}
```

```json
{
  "session_id": "f0ffb7f5-5d82-4477-b3f4-39c2ee6e4804",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2OTg0OCwiaWF0IjoxNzkzMzY4OTQ4LCJqdGkiOiJjMDA0MzVmMi1jM2ZlLTRhZDAtOWJlMC04NzMyNGVkMDcwOWUiLCJzaWQiOiJmMGZmYjdmNS01ZDgyLTQ0NzctYjNmNC0zOWMyZWU2ZTQ4MDQifQ.0lVSVc2zN6RQR9H1btMlpdYB1fUhYCN5QzGHnAYjRfo",
  "access_expires_at": "2026-10-30T14:17:28.196191613Z",
  "refresh_token": "d310vm3_N7MF4ildIE-6eoMPuLvkr4kUrYn3BwvHpGI",
  "refresh_expires_at": "2026-11-29T14:02:28.195440386Z",
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
  "device_ref": "sandbox-31891"
}
```

```json
{
  "challenge_id": "ec4c8b49-b979-4eae-a7a5-3624dd840215",
  "expires_at": "2026-10-30T14:07:28.785123042Z",
  "resend_available_at": "2026-10-30T14:02:29.785123042Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "702739",
  "sent_at": "2026-10-30T14:02:28.787822658Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ec4c8b49-b979-4eae-a7a5-3624dd840215",
  "code": "702739",
  "device_ref": "sandbox-31891"
}
```

```json
{
  "session_id": "b606324f-b0c8-4093-87e5-f33242b3c898",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2OTg0OSwiaWF0IjoxNzkzMzY4OTQ5LCJqdGkiOiIwOWI5NDJhZi1lODE0LTRhZWUtOWFkNi1kOGY4NGNmNjVjNTIiLCJzaWQiOiJiNjA2MzI0Zi1iMGM4LTQwOTMtODdlNS1mMzMyNDJiM2M4OTgifQ.zPJekdtZNmKbOnmGtnFBAREa2PEtyf4crkYInQJkEb4",
  "access_expires_at": "2026-10-30T14:17:29.1094844Z",
  "refresh_token": "JE5E7nhMXunqG3xnzgeSR6iAZClyiwZwWzz80uZcCCg",
  "refresh_expires_at": "2026-11-29T14:02:29.108847234Z",
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
  "command_id": "b25b4f5f-a1a3-4825-b257-bf4e9b68cead",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:02:29Z",
    "sequence": 1793368949725
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2c9e23ff-3cc5-4b15-bc39-f0ca760de2de",
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
  "last_heartbeat_at": "2026-10-30T14:02:29.745601Z",
  "last_location_at": "2026-10-30T14:02:29.745601Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-12685"
}
```

```json
{
  "challenge_id": "adf84c72-5f8a-40a2-a64c-367d023a45d4",
  "expires_at": "2026-10-30T14:07:30.049422861Z",
  "resend_available_at": "2026-10-30T14:02:31.049422861Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "170823",
  "sent_at": "2026-10-30T14:02:30.052471629Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "adf84c72-5f8a-40a2-a64c-367d023a45d4",
  "code": "170823",
  "device_ref": "sandbox-12685"
}
```

```json
{
  "session_id": "d969a294-ab0e-43b7-be3b-8fafbd69b8be",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2OTg1MCwiaWF0IjoxNzkzMzY4OTUwLCJqdGkiOiIzMTA1MmI1MC05NmI2LTQ1NTgtODI1My04MGU5NjVmODk0ODUiLCJzaWQiOiJkOTY5YTI5NC1hYjBlLTQzYjctYmUzYi04ZmFmYmQ2OWI4YmUifQ.0dx70IueDmXK0aHVdcINwYshJmE-sMR8EjgFsaqxgOQ",
  "access_expires_at": "2026-10-30T14:17:30.381815273Z",
  "refresh_token": "j22SF7hHwbJybG6nXM6say2bJKxglVWcreRWXYV9ly4",
  "refresh_expires_at": "2026-11-29T14:02:30.381208267Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "29f151e4-971d-443f-9418-faaf435cb6f9",
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
  "last_heartbeat_at": "2026-10-30T13:58:22.443558Z",
  "last_location_at": "2026-10-30T13:58:22.443558Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/29f151e4-971d-443f-9418-faaf435cb6f9/handover` → **200**

```json
{
  "command_id": "45ceff1b-557e-480b-8bce-be4b8bfd307a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "29f151e4-971d-443f-9418-faaf435cb6f9",
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
  "last_heartbeat_at": "2026-10-30T13:58:22.443558Z",
  "last_location_at": "2026-10-30T13:58:22.443558Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/29f151e4-971d-443f-9418-faaf435cb6f9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:02:31Z",
    "sequence": 1793368951299
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "29f151e4-971d-443f-9418-faaf435cb6f9",
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
  "last_heartbeat_at": "2026-10-30T14:02:31.321902Z",
  "last_location_at": "2026-10-30T14:02:31.321902Z",
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
  "session_id": "25871a1d-fcba-4714-b6ca-70f051822e87",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjk4NTEsImlhdCI6MTc5MzM2ODk1MSwianRpIjoiY2E1OWU1ODctNWI0YS00OWU3LWJmOTMtODFiZjY4MjVjMDNjIiwic2lkIjoiMjU4NzFhMWQtZmNiYS00NzE0LWI2Y2EtNzBmMDUxODIyZTg3In0.KxqeZalvlq7k6QiCMdFzkOHqNuCUz4SVmVIzsOB5KGg",
  "access_expires_at": "2026-10-30T14:17:31.907930422Z",
  "refresh_token": "uNV4swjWPlLyGAjjrBg-Ma_HOHhbMKkWxG2VEndv0xg",
  "refresh_expires_at": "2026-10-31T02:02:31.907336761Z",
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
  "session_id": "0f3696f4-7944-4eff-aa3f-95ea5f988719",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjk4NTIsImlhdCI6MTc5MzM2ODk1MiwianRpIjoiZjYyM2ViOGQtOGE5YS00YTA1LWJhYTEtMTZkNjA4NzVlNTE4Iiwic2lkIjoiMGYzNjk2ZjQtNzk0NC00ZWZmLWFhM2YtOTVlYTVmOTg4NzE5In0.5HGLuox8SQMRZnTGrppoTvbM57qr0L7vpDah9G5fr7k",
  "access_expires_at": "2026-10-30T14:17:32.500996651Z",
  "refresh_token": "8gQstWYhVcqtSL509HdsB5BQ8JvfSUY08uVmaeZofms",
  "refresh_expires_at": "2026-10-31T02:02:32.500405204Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686349479",
  "device_ref": "sandbox-32193"
}
```

```json
{
  "challenge_id": "f2bf298e-3939-4ba2-bb8a-2d7befb63969",
  "expires_at": "2026-10-30T14:07:32.801403852Z",
  "resend_available_at": "2026-10-30T14:02:33.801403852Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380686349479` → **200**

```json
{
  "phone": "+380686349479",
  "audience": "CLIENT",
  "code": "274053",
  "sent_at": "2026-10-30T14:02:32.80549018Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f2bf298e-3939-4ba2-bb8a-2d7befb63969",
  "code": "274053",
  "device_ref": "sandbox-32193"
}
```

```json
{
  "session_id": "32d86f16-5427-45f1-b58a-12e2cdff8282",
  "subject": {
    "type": "CLIENT",
    "id": "a2c89097-f915-4b38-a40a-edc26670c776"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMmM4OTA5Ny1mOTE1LTRiMzgtYTQwYS1lZGMyNjY3MGM3NzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY5ODUzLCJpYXQiOjE3OTMzNjg5NTMsImp0aSI6IjY4YTBkNjVjLTQ1MjAtNGI4MS1iNmRmLWM2NGZkNWE2Yzc1NyIsInNpZCI6IjMyZDg2ZjE2LTU0MjctNDVmMS1iNThhLTEyZTJjZGZmODI4MiJ9.GYtr78jLf3lLZvutwQJ9xsfP18MrO6harqKsa97S_WI",
  "access_expires_at": "2026-10-30T14:17:33.136359082Z",
  "refresh_token": "pGm5Cv3tuEFQCWZ-5PNEfikOV5uryLynXeJVFgrO300",
  "refresh_expires_at": "2026-11-29T14:02:33.135720196Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fa95a16e-4b0e-4e88-9307-0da2e903fe8b",
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
  "id": "f6828df4-8791-46fa-a783-a50c67134b38",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:07:33.460859Z",
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
  "command_id": "3848ab6a-0946-49b4-86e6-c23cb820c14c",
  "quote_id": "f6828df4-8791-46fa-a783-a50c67134b38",
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
  "id": "3f78db08-0091-4a09-b3a3-a26c01d89579",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a2c89097-f915-4b38-a40a-edc26670c776",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:02:33.764125Z",
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
    "id": "7cfd18a4-babe-4e91-98f3-4fb645a9a3bd",
    "order_id": "3f78db08-0091-4a09-b3a3-a26c01d89579",
    "expires_at": "2026-10-30T14:02:48.767182Z",
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

`POST /api/driver/v1/offers/7cfd18a4-babe-4e91-98f3-4fb645a9a3bd/reject` → **204**

```json
{
  "command_id": "fba1ca81-f7fe-41da-a15a-cb2dfc82f306"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "dcb165ae-4490-4838-ac12-e3ea2569c472",
    "order_id": "3f78db08-0091-4a09-b3a3-a26c01d89579",
    "expires_at": "2026-10-30T14:02:49.390815Z",
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

`POST /api/driver/v1/offers/dcb165ae-4490-4838-ac12-e3ea2569c472/accept` → **200**

```json
{
  "command_id": "95c6b459-03f1-4221-b849-82cd47307250"
}
```

```json
{
  "id": "c6843061-9f2c-4406-9f71-6d2ef549d5c0",
  "order_id": "3f78db08-0091-4a09-b3a3-a26c01d89579",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "63501f81-e172-4872-9601-eb2a170b85a9",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/3f78db08-0091-4a09-b3a3-a26c01d89579/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T14:02:33.764656Z",
      "actor": {
        "type": "CLIENT",
        "id": "a2c89097-f915-4b38-a40a-edc26670c776",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "3f78db08-0091-4a09-b3a3-a26c01d89579",
        "quote_id": "f6828df4-8791-46fa-a783-a50c67134b38",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "5602b8fd-bde0-47ea-9ee5-46ae8fe60c67"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T14:02:33.766515Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3f78db08-0091-4a09-b3a3-a26c01d89579",
        "attempt_id": "c55ec1bd-ad51-4d05-9c9d-d20021a9118b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5602b8fd-bde0-47ea-9ee5-46ae8fe60c67"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T14:02:33.769249Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "7cfd18a4-babe-4e91-98f3-4fb645a9a3bd",
        "order_id": "3f78db08-0091-4a09-b3a3-a26c01d89579",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "5602b8fd-bde0-47ea-9ee5-46ae8fe60c67"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T14:02:34.389878Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "7cfd18a4-babe-4e91-98f3-4fb645a9a3bd",
        "order_id": "3f78db08-0091-4a09-b3a3-a26c01d89579"
      },
      "correlation_id": "667eaf4e-68ad-42d9-8add-11590ba99e8d"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 3f78db08-0091-4a09-b3a3-a26c01d89579 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/3f78db08-0091-4a09-b3a3-a26c01d89579` → **200**

```json
{
  "id": "3f78db08-0091-4a09-b3a3-a26c01d89579",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "a2c89097-f915-4b38-a40a-edc26670c776",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "c6843061-9f2c-4406-9f71-6d2ef549d5c0",
    "order_id": "3f78db08-0091-4a09-b3a3-a26c01d89579",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "63501f81-e172-4872-9601-eb2a170b85a9",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T14:02:33.764125Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3f78db08-0091-4a09-b3a3-a26c01d89579/cancel` → **200**

```json
{
  "command_id": "e519839a-19b7-4c3e-ab64-a91159a68891",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "3f78db08-0091-4a09-b3a3-a26c01d89579",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "a2c89097-f915-4b38-a40a-edc26670c776",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "c6843061-9f2c-4406-9f71-6d2ef549d5c0",
    "order_id": "3f78db08-0091-4a09-b3a3-a26c01d89579",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "63501f81-e172-4872-9601-eb2a170b85a9",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T14:02:33.764125Z",
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
  "session_id": "2c9e23ff-3cc5-4b15-bc39-f0ca760de2de",
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
  "last_heartbeat_at": "2026-10-30T14:02:29.745601Z",
  "last_location_at": "2026-10-30T14:02:29.745601Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2c9e23ff-3cc5-4b15-bc39-f0ca760de2de/close` → **200**

```json
{
  "command_id": "fcba5b57-4c72-4b6a-a2d9-8e9b495012d0",
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
  "session_id": "29f151e4-971d-443f-9418-faaf435cb6f9",
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
  "last_heartbeat_at": "2026-10-30T14:02:31.321902Z",
  "last_location_at": "2026-10-30T14:02:31.321902Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/29f151e4-971d-443f-9418-faaf435cb6f9/close` → **200**

```json
{
  "command_id": "bd60f39a-a0ff-4930-bc05-8c9b62a73f97",
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
  "device_ref": "sandbox-30221"
}
```

```json
{
  "challenge_id": "ab55fb6c-dc10-4c2a-a285-100523db8630",
  "expires_at": "2026-10-30T14:07:37.289589807Z",
  "resend_available_at": "2026-10-30T14:02:38.289589807Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "376827",
  "sent_at": "2026-10-30T14:02:37.292264156Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab55fb6c-dc10-4c2a-a285-100523db8630",
  "code": "376827",
  "device_ref": "sandbox-30221"
}
```

```json
{
  "session_id": "93f71c38-5087-4fbe-9891-5353b840ed64",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2OTg1NywiaWF0IjoxNzkzMzY4OTU3LCJqdGkiOiI2ZjE1ZTFjMC01ZjIzLTQxNjEtYWEyZS0xMGIxNjhkNmNmMWQiLCJzaWQiOiI5M2Y3MWMzOC01MDg3LTRmYmUtOTg5MS01MzUzYjg0MGVkNjQifQ.-0IecD4JRN0V_1QMikSYdpZYlzB-CYeaar1VsCqQK30",
  "access_expires_at": "2026-10-30T14:17:37.618661703Z",
  "refresh_token": "-bLPKo1OCpbXnNo3LKpRxzTP20XDWBxPjHF1wKlD_a4",
  "refresh_expires_at": "2026-11-29T14:02:37.618121271Z",
  "account_created": false
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "579c58be-8c45-4940-b52e-0bfa727121ad",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "ccb7f5d5-dcb6-4e08-a966-d752faa9e4f9",
  "upload_path": "/api/driver/v1/uploads/ccb7f5d5-dcb6-4e08-a966-d752faa9e4f9",
  "expires_at": "2026-10-30T14:17:37.922996899Z",
  "max_bytes": 86
}
```

`PUT /api/driver/v1/uploads/ccb7f5d5-dcb6-4e08-a966-d752faa9e4f9` → **200**

```json
{
  "file_id": "ccb7f5d5-dcb6-4e08-a966-d752faa9e4f9",
  "state": "SAFE",
  "content_type": "application/pdf",
  "size_bytes": 86,
  "reject_reason": null
}
```

## On the server's disk the file is not the PDF

Stored at `driver_document/2026-10/ccb7f5d5-dcb6-4e08-a966-d752faa9e4f9`, first bytes `425a4631eada5ed3` (plain: `255044462d312e37` = %PDF-1.7).

## His download is exactly what he uploaded

`GET /api/driver/v1/files/ccb7f5d5-dcb6-4e08-a966-d752faa9e4f9` → **200**

SHA-256 uploaded `7e2255854ee0d69aad2646df6e32e5345eb3fb68707e0fd2cbb72727ed397759`, downloaded `7e2255854ee0d69aad2646df6e32e5345eb3fb68707e0fd2cbb72727ed397759`.

Done: document ccb7f5d5-dcb6-4e08-a966-d752faa9e4f9 is encrypted on disk and downloads unchanged.

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
  "session_id": "5dfa3be2-be76-4503-90b8-94acbca7fbe3",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjk4NTgsImlhdCI6MTc5MzM2ODk1OCwianRpIjoiNGJjZmRjNzctMTdlOC00NTMzLTllYzgtYWU5NDU3YmQ4ZGQ4Iiwic2lkIjoiNWRmYTNiZTItYmU3Ni00NTAzLTkwYjgtOTRhY2JjYTdmYmUzIn0.htvyPjwRv5Xp51pUSWydJTa03cm6wzERxO7iC7haLMM",
  "access_expires_at": "2026-10-30T14:17:38.617709441Z",
  "refresh_token": "fioS0Epzj7MaLxkXvfeEEtrJ7Z8aEW227hIDvU8FYBc",
  "refresh_expires_at": "2026-10-31T02:02:38.617125868Z",
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
  "command_id": "5c07613d-70c8-402e-95c6-9f0cc33cefae",
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
  "changed_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T14:02:39.243614Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "ba82848f-7a3d-4ccf-af54-7a84ec4e508a",
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
  "correlation_id": "593d624c-ed49-4c7f-b286-10bd6561a065",
  "current_version": 1
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "8a089c1d-55ac-4362-8e59-912122d1f711",
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
  "correlation_id": "6ef5c021-c6de-4ad1-995f-42bbee2638e6"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639626999",
  "device_ref": "sandbox-10154"
}
```

```json
{
  "challenge_id": "8f592d2b-51b3-47b9-afb4-2267bb6fa1aa",
  "expires_at": "2026-10-30T14:07:40.187635457Z",
  "resend_available_at": "2026-10-30T14:02:41.187635457Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639626999` → **200**

```json
{
  "phone": "+380639626999",
  "audience": "CLIENT",
  "code": "515303",
  "sent_at": "2026-10-30T14:02:40.190684074Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f592d2b-51b3-47b9-afb4-2267bb6fa1aa",
  "code": "515303",
  "device_ref": "sandbox-10154"
}
```

```json
{
  "session_id": "92f5b2ab-c2c4-4341-8cb2-ea27a9957ec7",
  "subject": {
    "type": "CLIENT",
    "id": "2656c149-147c-4734-8832-163b6d9d87fb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNjU2YzE0OS0xNDdjLTQ3MzQtODgzMi0xNjNiNmQ5ZDg3ZmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY5ODYwLCJpYXQiOjE3OTMzNjg5NjAsImp0aSI6IjE5N2E4ODIyLWQ5NWUtNDg3NS1hMDZiLWEwNTJhYjUyOGZiMiIsInNpZCI6IjkyZjViMmFiLWMyYzQtNDM0MS04Y2IyLWVhMjdhOTk1N2VjNyJ9.Hyj7SbePft_trnCTv7R6OAYpoloNllsNG8TPYzYGeqg",
  "access_expires_at": "2026-10-30T14:17:40.52136425Z",
  "refresh_token": "xV6s-NNy5l_U1Y9QHaX-vIWl-ebSkrZu58o3N_61A8Y",
  "refresh_expires_at": "2026-11-29T14:02:40.520713683Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bcd29d40-2f22-4f22-8031-a86cb60c8e77",
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
  "id": "6a93e962-0af9-465d-8bcc-6e67cd2bfb41",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:07:40.830426Z",
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
  "command_id": "23e50469-c748-4936-9b1f-1eb26866ad46",
  "quote_id": "6a93e962-0af9-465d-8bcc-6e67cd2bfb41",
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
  "correlation_id": "bac5ad32-8212-4ce5-b149-1dca5393fb48"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a5918f11-5e24-4161-9018-9cee43918252",
  "quote_id": "6a93e962-0af9-465d-8bcc-6e67cd2bfb41",
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
  "id": "7d1d8a18-0c8b-41ab-9d08-94d27dedf0f8",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2656c149-147c-4734-8832-163b6d9d87fb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:02:41.463396Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7d1d8a18-0c8b-41ab-9d08-94d27dedf0f8/cancel` → **200**

```json
{
  "command_id": "c26efdba-7150-4329-bf52-538ba1aa1f4a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7d1d8a18-0c8b-41ab-9d08-94d27dedf0f8",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2656c149-147c-4734-8832-163b6d9d87fb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:02:41.463396Z",
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
  "command_id": "35d327c7-40ac-4305-af68-c59e783a803d",
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
  "changed_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T14:02:42.123606Z"
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
      "changed_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T14:02:42.123606Z"
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
  "device_ref": "sandbox-32641"
}
```

```json
{
  "challenge_id": "aa4035b3-04f9-4909-9fc9-75790a9678de",
  "expires_at": "2026-10-30T14:07:43.14267298Z",
  "resend_available_at": "2026-10-30T14:02:44.14267298Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "940517",
  "sent_at": "2026-10-30T14:02:43.145690269Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa4035b3-04f9-4909-9fc9-75790a9678de",
  "code": "940517",
  "device_ref": "sandbox-32641"
}
```

```json
{
  "session_id": "8e51b370-ed36-438e-8f63-0e085b8a3c16",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2OTg2MywiaWF0IjoxNzkzMzY4OTYzLCJqdGkiOiI2YjU5ZWEwOC0wNzAwLTQ2MWUtYTI1MC04ZWUzNTNlMWMxNjMiLCJzaWQiOiI4ZTUxYjM3MC1lZDM2LTQzOGUtOGY2My0wZTA4NWI4YTNjMTYifQ.F4a79ZM6lh0Eocm_2UeSmppYbLsPV2Ms-dlUyxkVGBI",
  "access_expires_at": "2026-10-30T14:17:43.533838609Z",
  "refresh_token": "dPp3YO0SfpT0oB9VkG8jZnmc5XyB_cNUYio9wgXaD1Q",
  "refresh_expires_at": "2026-11-29T14:02:43.533210506Z",
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
  "command_id": "8e5580ae-c645-45b9-b702-2882df2050c8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:02:44Z",
    "sequence": 1793368964174
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0b055ed0-6f19-4733-bfe8-cb8681bc452d",
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
  "last_heartbeat_at": "2026-10-30T14:02:44.1944Z",
  "last_location_at": "2026-10-30T14:02:44.1944Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674149810",
  "device_ref": "sandbox-31340"
}
```

```json
{
  "challenge_id": "a2a42a26-bfa2-4e12-b4b4-93bd962a852f",
  "expires_at": "2026-10-30T14:07:44.506128236Z",
  "resend_available_at": "2026-10-30T14:02:45.506128236Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674149810` → **200**

```json
{
  "phone": "+380674149810",
  "audience": "CLIENT",
  "code": "017363",
  "sent_at": "2026-10-30T14:02:44.509140162Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a2a42a26-bfa2-4e12-b4b4-93bd962a852f",
  "code": "017363",
  "device_ref": "sandbox-31340"
}
```

```json
{
  "session_id": "3f56582d-d79f-4210-a426-d69866a3b4da",
  "subject": {
    "type": "CLIENT",
    "id": "09d83518-8371-47ae-953c-c67e83722014"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWQ4MzUxOC04MzcxLTQ3YWUtOTUzYy1jNjdlODM3MjIwMTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY5ODY0LCJpYXQiOjE3OTMzNjg5NjQsImp0aSI6IjRkM2E4MTA2LTM0MDItNGVkZC1hOWViLTYxZjY4ZjMzYjk3NSIsInNpZCI6IjNmNTY1ODJkLWQ3OWYtNDIxMC1hNDI2LWQ2OTg2NmEzYjRkYSJ9.WR38_Blzm16PdGujUckKOd0HR-sPwCevHEHb_yvcdSE",
  "access_expires_at": "2026-10-30T14:17:44.8464859Z",
  "refresh_token": "wxHHQx8yhzsOm02WbOqYzSMLfxa3zSf235RGzqsOmYA",
  "refresh_expires_at": "2026-11-29T14:02:44.845903209Z",
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
  "command_id": "69c7cd1d-6f40-446d-b13d-80222d4868e5",
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
  "id": "58d3c79b-20f6-4d79-aa7b-935e97286ad5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:07:45.448509Z",
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
  "command_id": "1bc8ccc2-e6f7-41d0-89f6-e18ff1478cfd",
  "platform": "ANDROID",
  "token": "sandbox-driver-dd6b9d13-9119-4074-bb32-24a8c690efea"
}
```

```json
{
  "id": "df7a026d-07af-4e21-860c-3268a7bffe13",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T14:02:45.762113Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "08f52ebd-acb4-4759-8634-56376f392735",
  "platform": "ANDROID",
  "token": "sandbox-rider-b87081c7-9be4-40c6-804b-0aff496f5de7"
}
```

```json
{
  "id": "1cdb66b6-62e3-42ac-ba03-97fe436ca07e",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T14:02:46.061707Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0f23af95-8f41-4abd-93fe-c281d855b93f",
  "quote_id": "58d3c79b-20f6-4d79-aa7b-935e97286ad5",
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
  "id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "09d83518-8371-47ae-953c-c67e83722014",
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
  "created_at": "2026-10-30T14:02:46.371945Z",
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
    "id": "c791bde7-ac30-4382-b394-af794deedfca",
    "order_id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
    "expires_at": "2026-10-30T14:03:01.37505Z",
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

`POST /api/driver/v1/offers/c791bde7-ac30-4382-b394-af794deedfca/accept` → **200**

```json
{
  "command_id": "679e0e9c-4c4b-49f7-9948-b3e1156489bf"
}
```

```json
{
  "id": "4692aab7-384a-426b-a9f2-6010c58fb996",
  "order_id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e2ba3b3e-9ecb-473a-9f15-63ebbdac5cee",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T14:02:46.346Z` → **200**

```json
[
  {
    "at": "2026-10-30T14:02:46.705807968Z",
    "token_suffix": "90efea",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "5b9b0c56-6ea9-462c-a6bc-0f6810fba9a4",
      "order_version": "2",
      "order_id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674149810&after=2026-10-30T14:02:46.346Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380674149810&after=2026-10-30T14:02:46.346Z` → **200**

```json
[
  {
    "at": "2026-10-30T14:02:47.7115137Z",
    "token_suffix": "6f5de7",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "6d4cc7e6-a603-440a-b80f-a21a08324db8",
      "order_version": "3",
      "order_id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/a0c0e454-0516-4fc7-af2d-553bde3d4dcf/messages` → **201**

```json
{
  "command_id": "0600d6e7-4f67-4829-be6e-3882fa2efa03",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "3e0fe1bb-f626-4249-a72e-6cdb9c73df23",
  "order_id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T14:02:48.408866577Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e2ba3b3e-9ecb-473a-9f15-63ebbdac5cee",
  "order_id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
  "assignment_id": "4692aab7-384a-426b-a9f2-6010c58fb996",
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

`POST /api/driver/v1/trips/e2ba3b3e-9ecb-473a-9f15-63ebbdac5cee/messages` → **201**

```json
{
  "command_id": "6beb23be-adfb-4bec-a1c4-962cdbc610a1",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "f774f730-4fba-4f4b-83d5-038586d5ec9f",
  "order_id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T14:02:49.014928509Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/a0c0e454-0516-4fc7-af2d-553bde3d4dcf/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/e2ba3b3e-9ecb-473a-9f15-63ebbdac5cee/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674149810"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/0b055ed0-6f19-4733-bfe8-cb8681bc452d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:02:49Z",
    "sequence": 1793368969960
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0b055ed0-6f19-4733-bfe8-cb8681bc452d",
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
  "last_heartbeat_at": "2026-10-30T14:02:49.981483Z",
  "last_location_at": "2026-10-30T14:02:49.981483Z",
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
  "id": "e2ba3b3e-9ecb-473a-9f15-63ebbdac5cee",
  "order_id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
  "assignment_id": "4692aab7-384a-426b-a9f2-6010c58fb996",
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

`POST /api/driver/v1/trips/e2ba3b3e-9ecb-473a-9f15-63ebbdac5cee/arrive` → **200**

```json
{
  "command_id": "d3297112-8284-44da-b11b-d799586420c9",
  "expected_version": 0
}
```

```json
{
  "id": "e2ba3b3e-9ecb-473a-9f15-63ebbdac5cee",
  "order_id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
  "assignment_id": "4692aab7-384a-426b-a9f2-6010c58fb996",
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
  "arrived_at": "2026-10-30T14:02:50.602957Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e2ba3b3e-9ecb-473a-9f15-63ebbdac5cee/start` → **200**

```json
{
  "command_id": "33e04b01-e096-4d98-b934-220e7c55ce07",
  "expected_version": 1
}
```

```json
{
  "id": "e2ba3b3e-9ecb-473a-9f15-63ebbdac5cee",
  "order_id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
  "assignment_id": "4692aab7-384a-426b-a9f2-6010c58fb996",
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
  "arrived_at": "2026-10-30T14:02:50.602957Z",
  "started_at": "2026-10-30T14:02:50.923233Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 47 s to the next point)

`POST /api/driver/v1/work-sessions/0b055ed0-6f19-4733-bfe8-cb8681bc452d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:03:38Z",
    "sequence": 1793369018255
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0b055ed0-6f19-4733-bfe8-cb8681bc452d",
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
  "last_heartbeat_at": "2026-10-30T14:03:38.27842Z",
  "last_location_at": "2026-10-30T14:03:38.27842Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/e2ba3b3e-9ecb-473a-9f15-63ebbdac5cee/complete` → **200**

```json
{
  "command_id": "a8476276-348c-4953-8dfd-3449e9baae74",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:03:38Z",
  "cash_received": true
}
```

```json
{
  "id": "e2ba3b3e-9ecb-473a-9f15-63ebbdac5cee",
  "order_id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
  "assignment_id": "4692aab7-384a-426b-a9f2-6010c58fb996",
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
  "arrived_at": "2026-10-30T14:02:50.602957Z",
  "started_at": "2026-10-30T14:02:50.923233Z",
  "completed_at": "2026-10-30T14:03:38.59787Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/a0c0e454-0516-4fc7-af2d-553bde3d4dcf` → **200**

```json
{
  "id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "09d83518-8371-47ae-953c-c67e83722014",
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
    "id": "4692aab7-384a-426b-a9f2-6010c58fb996",
    "order_id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e2ba3b3e-9ecb-473a-9f15-63ebbdac5cee",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T14:02:46.371945Z",
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
    "id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
    "short_number": 14,
    "status": "FULFILLED",
    "created_at": "2026-10-30T14:02:46.371945Z",
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
    "id": "e2ba3b3e-9ecb-473a-9f15-63ebbdac5cee",
    "order_id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
    "order_short_number": 14,
    "created_at": "2026-10-30T14:02:47.008527Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "26264149-af54-489f-ac25-bba8f8d0f0bf",
    "order_id": "d94de4bf-8bca-4d18-bd41-9d2f43cb0ab3",
    "order_short_number": 9,
    "created_at": "2026-10-30T13:59:48.104368Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "aae6f9c5-e5b7-4d4c-87db-7129bef4257f",
    "order_id": "ac2245ff-b7a1-4ede-8f82-6b48acc04fff",
    "order_short_number": 4,
    "created_at": "2026-10-30T13:58:10.543009Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "0a5f95f5-3ba1-4f36-ae32-c90b7e8c5af1",
    "order_id": "8a511ed8-e7d8-4368-9e64-d9ef379951ae",
    "order_short_number": 2,
    "created_at": "2026-10-30T13:54:19.418188Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "826b6392-d4e5-489d-b2bb-7217da907ed4",
    "order_id": "87bc0db2-d435-4c0a-98c4-757d8bd08161",
    "order_short_number": 1,
    "created_at": "2026-10-30T13:54:08.922051Z",
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

`GET /api/rider/v1/orders/a0c0e454-0516-4fc7-af2d-553bde3d4dcf/tip` → **200**

```json
{
  "order_id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
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
  "available_until": "2026-10-31T14:03:38.59787Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/a0c0e454-0516-4fc7-af2d-553bde3d4dcf/tip` → **201**

```json
{
  "command_id": "38818ea3-c20e-4503-88a0-06dbac5660df",
  "amount_minor": 1100
}
```

```json
{
  "id": "ee44e3ab-77c2-4a1e-bcb9-42efb34f72d4",
  "order_id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T14:03:43.879803Z"
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
  "session_id": "ca1c0766-7644-4b1d-966a-f4cdfb1db008",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjk5MjQsImlhdCI6MTc5MzM2OTAyNCwianRpIjoiZTk2MTNmY2ItY2IwNC00MWY5LTkzMDYtODdlMDVlNTA0NzI5Iiwic2lkIjoiY2ExYzA3NjYtNzY0NC00YjFkLTk2NmEtZjRjZGZiMWRiMDA4In0.AXo3zDne0LYg74mWwYsaRY0ufIY8s1m85ZWaCGBwwiI",
  "access_expires_at": "2026-10-30T14:18:44.491804011Z",
  "refresh_token": "hQxXhG02yhEz4-fM2w6yO8QJQarf4vnBU7KCXpsI_z0",
  "refresh_expires_at": "2026-10-31T02:03:44.490861007Z",
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
          "RIDER": 3,
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
      "PHONE": 1,
      "APP": 12
    },
    "by_payment": {
      "CASH": 11,
      "CARD": 2
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
  "generated_at": "2026-10-30T14:03:44.80191471Z"
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
  "generated_at": "2026-10-30T14:03:45.135089169Z"
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
  "session_id": "d2e0f7cd-b6ec-4fad-8a03-906f8f360f67",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjk5MjUsImlhdCI6MTc5MzM2OTAyNSwianRpIjoiYjMyMzc4ZmItYTIwZi00YmEzLThmY2YtODJlNzM3YjVhYjMwIiwic2lkIjoiZDJlMGY3Y2QtYjZlYy00ZmFkLThhMDMtOTA2ZjhmMzYwZjY3In0.gkqry1lAv0SGJn6mBQGwFv44RMu0FVwDW362GowlpyQ",
  "access_expires_at": "2026-10-30T14:18:45.756076934Z",
  "refresh_token": "7aBHV7p2kpEi6Cv4E1885G1ivq3EJ_RRURJDBTLldWA",
  "refresh_expires_at": "2026-10-31T02:03:45.755130883Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a0c0e454-0516-4fc7-af2d-553bde3d4dcf/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T14:02:46.372444Z",
      "actor": {
        "type": "CLIENT",
        "id": "09d83518-8371-47ae-953c-c67e83722014",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
        "quote_id": "58d3c79b-20f6-4d79-aa7b-935e97286ad5",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "e56358e8-90af-4bea-93e3-4a78bbd4c4d7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T14:02:46.374334Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
        "attempt_id": "6aaca34a-5bd5-4417-a241-594ab15ea3c1",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e56358e8-90af-4bea-93e3-4a78bbd4c4d7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T14:02:46.377283Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c791bde7-ac30-4382-b394-af794deedfca",
        "order_id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "e56358e8-90af-4bea-93e3-4a78bbd4c4d7"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T14:02:47.010289Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "c791bde7-ac30-4382-b394-af794deedfca",
        "order_id": "a0c0e454-0516-4fc7-af2d-553bde3d4dcf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "4692aab7-384a-426b-a9f2-6010c58fb996"
      },
      "correlation_id": "ff8cc0ee-086e-46ec-b593-ddf8e9695825"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T14:03:46.38270384Z",
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
      "last_location_at": "2026-10-30T14:03:38.27842Z",
      "order_id": null
    }
  ]
}
```

Done: order a0c0e454-0516-4fc7-af2d-553bde3d4dcf.

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
  "session_id": "6c18f9db-e78a-4185-b116-8681d13470cc",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjk5MjYsImlhdCI6MTc5MzM2OTAyNiwianRpIjoiODllZjRmNTItODM0Yy00MzVmLWJhZDUtZjRlZTFkOTUxODNmIiwic2lkIjoiNmMxOGY5ZGItZTc4YS00MTg1LWIxMTYtODY4MWQxMzQ3MGNjIn0.zUn3n6mS61oUt6vEh26rTfgPFpaMA-GJBoYDaZ5wkYs",
  "access_expires_at": "2026-10-30T14:18:46.99837451Z",
  "refresh_token": "5YNUWTGI3OMHauMew0xFt7bKZsmpvd11CVmbjBjxR1s",
  "refresh_expires_at": "2026-10-31T02:03:46.99773837Z",
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
  "command_id": "377c790f-0896-4537-889f-f695757961bc",
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
  "timestamp": "2026-10-30T14:03:47.000+0000",
  "channel": {
    "id": "1730052000.177007825",
    "linkedid": "1730052000.177007825",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674850278"
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
  "timestamp": "2026-10-30T14:03:47.000+0000",
  "channel": {
    "id": "1730052000.177007825",
    "linkedid": "1730052000.177007825",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674850278"
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
  "session_id": "adbd9e2f-403e-4503-88e3-dc6b36cbf9d2",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjk5MjgsImlhdCI6MTc5MzM2OTAyOCwianRpIjoiNjI2ZDYxZjAtOTliMC00NzQwLWEwZmMtMTYzNTQyZWZhNjRiIiwic2lkIjoiYWRiZDllMmYtNDAzZS00NTAzLTg4ZTMtZGM2YjM2Y2JmOWQyIn0.adfTJ_Zj5nrsaaRuD0zf3jTZjTvPvMjSLPWbgvx5X1A",
  "access_expires_at": "2026-10-30T14:18:48.252728525Z",
  "refresh_token": "2PGa0DPv3-2nG-aqcs9lWbrrnG0QZ8jvLhUODjwF0XY",
  "refresh_expires_at": "2026-10-31T02:03:48.252135194Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "cff961df-b548-42c6-92f8-edc00f088503",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674850278",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T14:03:47Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/cff961df-b548-42c6-92f8-edc00f088503/answer` → **200**

```json
{
  "command_id": "675be322-56ca-4a2d-abd5-70c583927dff"
}
```

```json
{
  "id": "cff961df-b548-42c6-92f8-edc00f088503",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674850278",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "order_ids": [],
  "started_at": "2026-10-30T14:03:47Z",
  "answered_at": "2026-10-30T14:03:48.875437Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.177007825",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "aaa51c92-930c-453f-89ff-a95f70627f53",
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
  "id": "4ad0d392-b266-465d-aa4f-fb192320f624",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:08:49.214106Z",
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
  "command_id": "dc42ce81-7684-4b93-a673-76eeb1e714af",
  "quote_id": "4ad0d392-b266-465d-aa4f-fb192320f624",
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
    "phone": "+380674850278"
  },
  "call_id": "cff961df-b548-42c6-92f8-edc00f088503"
}
```

```json
{
  "id": "94ee068b-5d25-452a-9a8d-5be7134d6c0b",
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
  "created_at": "2026-10-30T14:03:49.549807Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674850278"
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
    "id": "1730052000.177007825",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "cff961df-b548-42c6-92f8-edc00f088503",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674850278",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
      "order_ids": [
        "94ee068b-5d25-452a-9a8d-5be7134d6c0b"
      ],
      "started_at": "2026-10-30T14:03:47Z",
      "answered_at": "2026-10-30T14:03:48.875437Z",
      "ended_at": "2026-10-30T14:03:49.882378Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "7d989706-3039-4967-8c00-738abcfa5f64",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673291219",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
      "order_ids": [],
      "started_at": "2026-10-30T13:58:01.295402Z",
      "answered_at": "2026-10-30T13:58:01.644481Z",
      "ended_at": "2026-10-30T13:58:01.983814Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:58:04.414795Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/94ee068b-5d25-452a-9a8d-5be7134d6c0b` → **200**

```json
{
  "id": "94ee068b-5d25-452a-9a8d-5be7134d6c0b",
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
  "created_at": "2026-10-30T14:03:49.549807Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674850278"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/94ee068b-5d25-452a-9a8d-5be7134d6c0b` → **200**

```json
{
  "id": "94ee068b-5d25-452a-9a8d-5be7134d6c0b",
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
  "created_at": "2026-10-30T14:03:49.549807Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674850278"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/94ee068b-5d25-452a-9a8d-5be7134d6c0b/cancel` → **200**

```json
{
  "command_id": "9de77406-09cb-4c6a-b814-65904fbff5d9",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "94ee068b-5d25-452a-9a8d-5be7134d6c0b",
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
  "created_at": "2026-10-30T14:03:49.549807Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674850278"
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

Done: call cff961df-b548-42c6-92f8-edc00f088503 with order 94ee068b-5d25-452a-9a8d-5be7134d6c0b.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31090"
}
```

```json
{
  "challenge_id": "108cad4c-cb68-4264-a574-0baf1ca32fff",
  "expires_at": "2026-10-30T14:08:51.197892963Z",
  "resend_available_at": "2026-10-30T14:03:52.197892963Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "150247",
  "sent_at": "2026-10-30T14:03:51.202249056Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "108cad4c-cb68-4264-a574-0baf1ca32fff",
  "code": "150247",
  "device_ref": "sandbox-31090"
}
```

```json
{
  "session_id": "d5aa1bef-e394-404d-8f43-f9fc868e9b9d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2OTkzMSwiaWF0IjoxNzkzMzY5MDMxLCJqdGkiOiI0YjFkM2Q3Yy03ZGQyLTRjNzYtOTQyYi1iMWNkODAwM2ViOGYiLCJzaWQiOiJkNWFhMWJlZi1lMzk0LTQwNGQtOGY0My1mOWZjODY4ZTliOWQifQ.3X1WnV5l7n0mal38ercXY_-B34grk2jyMdpdsv39Bvo",
  "access_expires_at": "2026-10-30T14:18:51.523065877Z",
  "refresh_token": "H1dyhhOagr8ir65TEUlwSep3kinGXKfI7nK1IFfOrPU",
  "refresh_expires_at": "2026-11-29T14:03:51.522419689Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0b055ed0-6f19-4733-bfe8-cb8681bc452d",
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
  "last_heartbeat_at": "2026-10-30T14:03:38.27842Z",
  "last_location_at": "2026-10-30T14:03:38.27842Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0b055ed0-6f19-4733-bfe8-cb8681bc452d/handover` → **200**

```json
{
  "command_id": "b8adee57-93f7-4b56-93cc-7444a3fc7ea4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0b055ed0-6f19-4733-bfe8-cb8681bc452d",
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
  "last_heartbeat_at": "2026-10-30T14:03:38.27842Z",
  "last_location_at": "2026-10-30T14:03:38.27842Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 85 s to the next point)

`POST /api/driver/v1/work-sessions/0b055ed0-6f19-4733-bfe8-cb8681bc452d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:05:17Z",
    "sequence": 1793369117462
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0b055ed0-6f19-4733-bfe8-cb8681bc452d",
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
  "last_heartbeat_at": "2026-10-30T14:05:17.481641Z",
  "last_location_at": "2026-10-30T14:05:17.481641Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661854402",
  "device_ref": "sandbox-2252"
}
```

```json
{
  "challenge_id": "0b64f4ea-6861-4886-89a0-8df446826414",
  "expires_at": "2026-10-30T14:10:17.778180051Z",
  "resend_available_at": "2026-10-30T14:05:18.778180051Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380661854402` → **200**

```json
{
  "phone": "+380661854402",
  "audience": "CLIENT",
  "code": "028021",
  "sent_at": "2026-10-30T14:05:17.781559673Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0b64f4ea-6861-4886-89a0-8df446826414",
  "code": "028021",
  "device_ref": "sandbox-2252"
}
```

```json
{
  "session_id": "a76a5910-a3d8-4088-885e-363001c89373",
  "subject": {
    "type": "CLIENT",
    "id": "abb60faf-043f-4f58-a19d-4615531385a5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYmI2MGZhZi0wNDNmLTRmNTgtYTE5ZC00NjE1NTMxMzg1YTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcwMDE4LCJpYXQiOjE3OTMzNjkxMTgsImp0aSI6IjRhZDg3ZWMzLWE2YmQtNGE0Ni1hNDQ1LTFhNTZlZDMzMTlhNSIsInNpZCI6ImE3NmE1OTEwLWEzZDgtNDA4OC04ODVlLTM2MzAwMWM4OTM3MyJ9.h5tY5_-xvIDBU2MovWKppzzDHH18wpXkfuaBpRv71qk",
  "access_expires_at": "2026-10-30T14:20:18.10344321Z",
  "refresh_token": "W1yL-7caXAUww066AY82YqTPyp8o_0olSUuo_Ue6Sis",
  "refresh_expires_at": "2026-11-29T14:05:18.102763178Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8a766818-74ef-483a-935f-0de3c829d2e9",
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
  "id": "44c2b313-9d6a-4517-9e6b-a247bfe14e61",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:10:18.407645Z",
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
  "command_id": "65f96450-36a5-458a-ae22-dff5c896a8c8",
  "quote_id": "44c2b313-9d6a-4517-9e6b-a247bfe14e61",
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
  "id": "4c75be9b-8cb1-48d3-b6d5-f36ded244d05",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "abb60faf-043f-4f58-a19d-4615531385a5",
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
  "created_at": "2026-10-30T14:05:18.71852Z",
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
    "id": "de1e934e-aa98-4de7-b488-7033d4496a8a",
    "order_id": "4c75be9b-8cb1-48d3-b6d5-f36ded244d05",
    "expires_at": "2026-10-30T14:05:33.722897Z",
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

`POST /api/driver/v1/offers/de1e934e-aa98-4de7-b488-7033d4496a8a/accept` → **200**

```json
{
  "command_id": "3dd1788e-26af-4018-a957-622ec56bfa4a"
}
```

```json
{
  "id": "53b3d4ee-4e2e-4d19-b21f-8ea97cd046a2",
  "order_id": "4c75be9b-8cb1-48d3-b6d5-f36ded244d05",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cd9d1dbb-e7e0-4f32-80fa-89e55b06cbc1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cd9d1dbb-e7e0-4f32-80fa-89e55b06cbc1",
  "order_id": "4c75be9b-8cb1-48d3-b6d5-f36ded244d05",
  "assignment_id": "53b3d4ee-4e2e-4d19-b21f-8ea97cd046a2",
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

`POST /api/driver/v1/work-sessions/0b055ed0-6f19-4733-bfe8-cb8681bc452d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:05:19Z",
    "sequence": 1793369119930
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0b055ed0-6f19-4733-bfe8-cb8681bc452d",
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
  "last_heartbeat_at": "2026-10-30T14:05:19.950121Z",
  "last_location_at": "2026-10-30T14:05:19.950121Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/cd9d1dbb-e7e0-4f32-80fa-89e55b06cbc1/arrive` → **200**

```json
{
  "command_id": "8a21a5ab-8d2b-41e4-ba61-2d6ff4b592ab",
  "expected_version": 0
}
```

```json
{
  "id": "cd9d1dbb-e7e0-4f32-80fa-89e55b06cbc1",
  "order_id": "4c75be9b-8cb1-48d3-b6d5-f36ded244d05",
  "assignment_id": "53b3d4ee-4e2e-4d19-b21f-8ea97cd046a2",
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
  "arrived_at": "2026-10-30T14:05:20.251074Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cd9d1dbb-e7e0-4f32-80fa-89e55b06cbc1/start` → **200**

```json
{
  "command_id": "47ed2a45-be8a-4720-b635-661f15157cfb",
  "expected_version": 1
}
```

```json
{
  "id": "cd9d1dbb-e7e0-4f32-80fa-89e55b06cbc1",
  "order_id": "4c75be9b-8cb1-48d3-b6d5-f36ded244d05",
  "assignment_id": "53b3d4ee-4e2e-4d19-b21f-8ea97cd046a2",
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
  "arrived_at": "2026-10-30T14:05:20.251074Z",
  "started_at": "2026-10-30T14:05:20.555615Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions/0b055ed0-6f19-4733-bfe8-cb8681bc452d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:06:19Z",
    "sequence": 1793369179896
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0b055ed0-6f19-4733-bfe8-cb8681bc452d",
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
  "last_heartbeat_at": "2026-10-30T14:06:19.914683Z",
  "last_location_at": "2026-10-30T14:06:19.914683Z",
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
  "device_ref": "sandbox-16503"
}
```

```json
{
  "challenge_id": "44a64390-435e-4b03-88f7-60756aa93652",
  "expires_at": "2026-10-30T14:11:20.21415104Z",
  "resend_available_at": "2026-10-30T14:06:21.21415104Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "329897",
  "sent_at": "2026-10-30T14:06:20.216894262Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "44a64390-435e-4b03-88f7-60756aa93652",
  "code": "329897",
  "device_ref": "sandbox-16503"
}
```

```json
{
  "session_id": "7047ba70-d4b8-48ae-b67a-efec6a0cbb3e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MDA4MCwiaWF0IjoxNzkzMzY5MTgwLCJqdGkiOiJiNTQ0NTM1OS00MjdjLTRmZTUtODZhOS00MzI0ODcwYzQ1OWEiLCJzaWQiOiI3MDQ3YmE3MC1kNGI4LTQ4YWUtYjY3YS1lZmVjNmEwY2JiM2UifQ.5w7e0x5AcdBdMdmTXkcorfSgemuad9EnDEyHEAm2CuQ",
  "access_expires_at": "2026-10-30T14:21:20.535296846Z",
  "refresh_token": "DvOuhzIQJAnOYBKVnEU3m0Icu8Mw54MSIJmms-0ojwk",
  "refresh_expires_at": "2026-11-29T14:06:20.534381936Z",
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
  "command_id": "276041e6-c46f-4d9c-9732-cdd68dacc302",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:06:21Z",
    "sequence": 1793369181143
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "da84c47e-3b9b-4103-9768-a8fc83ffea7d",
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
  "last_heartbeat_at": "2026-10-30T14:06:21.161944Z",
  "last_location_at": "2026-10-30T14:06:21.161944Z",
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
  "session_id": "7f18b7bc-a6ee-4c13-aebb-3e454d088cd0",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAwODEsImlhdCI6MTc5MzM2OTE4MSwianRpIjoiMTQ3ZWUzODMtNzBlYi00YTEyLTllZDAtMDc1NGE3MDk1ZWU3Iiwic2lkIjoiN2YxOGI3YmMtYTZlZS00YzEzLWFlYmItM2U0NTRkMDg4Y2QwIn0.Fpl4bDwdTDMlG3BknEGExrFW477_6Ryd08HtAc0-7gA",
  "access_expires_at": "2026-10-30T14:21:21.773668831Z",
  "refresh_token": "4YbozLCLk-e7e-8nKGr6JQCjNv3osdSRDxvl2PIzoPo",
  "refresh_expires_at": "2026-10-31T02:06:21.772955978Z",
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
  "session_id": "af6e7047-4223-48b0-ba8b-ea4514e8ebf1",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAwODIsImlhdCI6MTc5MzM2OTE4MiwianRpIjoiYzY5YjU5NTEtNGNiNS00MmM2LTkyZDctNDg2N2I4OGUxYjExIiwic2lkIjoiYWY2ZTcwNDctNDIyMy00OGIwLWJhOGItZWE0NTE0ZThlYmYxIn0.aDF6KXka0HePOTla5fxEXDdGHh3wbiwtb4iFfob7dOs",
  "access_expires_at": "2026-10-30T14:21:22.362926719Z",
  "refresh_token": "noFOj5rYocYyk5le5zjeJZ2-J8gAH-JXoRwLnof3DI0",
  "refresh_expires_at": "2026-10-31T02:06:22.36236068Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4c75be9b-8cb1-48d3-b6d5-f36ded244d05` → **200**

```json
{
  "id": "4c75be9b-8cb1-48d3-b6d5-f36ded244d05",
  "short_number": 16,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "abb60faf-043f-4f58-a19d-4615531385a5",
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
    "id": "53b3d4ee-4e2e-4d19-b21f-8ea97cd046a2",
    "order_id": "4c75be9b-8cb1-48d3-b6d5-f36ded244d05",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "cd9d1dbb-e7e0-4f32-80fa-89e55b06cbc1",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T14:05:18.71852Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4c75be9b-8cb1-48d3-b6d5-f36ded244d05/interrupt` → **200**

```json
{
  "command_id": "6a887116-d3ce-4ccd-9939-db031f2e6ab8",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "4c75be9b-8cb1-48d3-b6d5-f36ded244d05",
    "short_number": 16,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "abb60faf-043f-4f58-a19d-4615531385a5",
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
      "id": "53b3d4ee-4e2e-4d19-b21f-8ea97cd046a2",
      "order_id": "4c75be9b-8cb1-48d3-b6d5-f36ded244d05",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "cd9d1dbb-e7e0-4f32-80fa-89e55b06cbc1",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T14:05:18.71852Z",
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
    "id": "84207c4f-3204-466c-a8e3-8cd2e8fecd42",
    "short_number": 17,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "abb60faf-043f-4f58-a19d-4615531385a5",
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
    "id": "7ef5b80c-146c-48a8-af25-8b20519af259",
    "order_id": "84207c4f-3204-466c-a8e3-8cd2e8fecd42",
    "expires_at": "2026-10-30T14:06:37.977573Z",
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

`POST /api/driver/v1/offers/7ef5b80c-146c-48a8-af25-8b20519af259/accept` → **200**

```json
{
  "command_id": "9e724596-4ac4-427b-b406-41a52fd47053"
}
```

```json
{
  "id": "289ada2c-3713-45b7-92d5-7c25dc76aa15",
  "order_id": "84207c4f-3204-466c-a8e3-8cd2e8fecd42",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0c21b0ca-84e0-4f4f-b7b5-88d45841dc52",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0c21b0ca-84e0-4f4f-b7b5-88d45841dc52",
  "order_id": "84207c4f-3204-466c-a8e3-8cd2e8fecd42",
  "assignment_id": "289ada2c-3713-45b7-92d5-7c25dc76aa15",
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
  "session_id": "da84c47e-3b9b-4103-9768-a8fc83ffea7d",
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
  "last_heartbeat_at": "2026-10-30T14:06:21.161944Z",
  "last_location_at": "2026-10-30T14:06:21.161944Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/da84c47e-3b9b-4103-9768-a8fc83ffea7d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:06:24Z",
    "sequence": 1793369184524
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "da84c47e-3b9b-4103-9768-a8fc83ffea7d",
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
  "last_heartbeat_at": "2026-10-30T14:06:24.543533Z",
  "last_location_at": "2026-10-30T14:06:24.543533Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/0c21b0ca-84e0-4f4f-b7b5-88d45841dc52/arrive` → **200**

```json
{
  "command_id": "53b860bb-db01-46be-8bac-49eb1bcb63f3",
  "expected_version": 0
}
```

```json
{
  "id": "0c21b0ca-84e0-4f4f-b7b5-88d45841dc52",
  "order_id": "84207c4f-3204-466c-a8e3-8cd2e8fecd42",
  "assignment_id": "289ada2c-3713-45b7-92d5-7c25dc76aa15",
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
  "arrived_at": "2026-10-30T14:06:24.845193Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0c21b0ca-84e0-4f4f-b7b5-88d45841dc52/start` → **200**

```json
{
  "command_id": "91c9ccc0-89e8-4d92-b08b-4701673a0ffb",
  "expected_version": 1
}
```

```json
{
  "id": "0c21b0ca-84e0-4f4f-b7b5-88d45841dc52",
  "order_id": "84207c4f-3204-466c-a8e3-8cd2e8fecd42",
  "assignment_id": "289ada2c-3713-45b7-92d5-7c25dc76aa15",
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
  "arrived_at": "2026-10-30T14:06:24.845193Z",
  "started_at": "2026-10-30T14:06:25.153296Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0c21b0ca-84e0-4f4f-b7b5-88d45841dc52/complete` → **200**

```json
{
  "command_id": "17f6740f-2737-4fc8-bc98-52790d73d1df",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:06:25Z"
}
```

```json
{
  "id": "0c21b0ca-84e0-4f4f-b7b5-88d45841dc52",
  "order_id": "84207c4f-3204-466c-a8e3-8cd2e8fecd42",
  "assignment_id": "289ada2c-3713-45b7-92d5-7c25dc76aa15",
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
  "arrived_at": "2026-10-30T14:06:24.845193Z",
  "started_at": "2026-10-30T14:06:25.153296Z",
  "completed_at": "2026-10-30T14:06:25.471093Z",
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
    "id": "84207c4f-3204-466c-a8e3-8cd2e8fecd42",
    "short_number": 17,
    "status": "FULFILLED",
    "created_at": "2026-10-30T14:06:22.967171Z",
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
    "id": "4c75be9b-8cb1-48d3-b6d5-f36ded244d05",
    "short_number": 16,
    "status": "CANCELLED",
    "created_at": "2026-10-30T14:05:18.71852Z",
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

`GET /api/operator/v1/orders/4c75be9b-8cb1-48d3-b6d5-f36ded244d05/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T14:05:18.719341Z",
      "actor": {
        "type": "CLIENT",
        "id": "abb60faf-043f-4f58-a19d-4615531385a5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4c75be9b-8cb1-48d3-b6d5-f36ded244d05",
        "quote_id": "44c2b313-9d6a-4517-9e6b-a247bfe14e61",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "b9964f78-f837-4eae-aa23-de90918698a4"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T14:05:18.721921Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4c75be9b-8cb1-48d3-b6d5-f36ded244d05",
        "attempt_id": "a9a452c3-36bf-4b27-af1a-8b09fc3335fd",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b9964f78-f837-4eae-aa23-de90918698a4"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T14:05:18.729815Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "de1e934e-aa98-4de7-b488-7033d4496a8a",
        "order_id": "4c75be9b-8cb1-48d3-b6d5-f36ded244d05",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "b9964f78-f837-4eae-aa23-de90918698a4"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T14:05:19.337382Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "de1e934e-aa98-4de7-b488-7033d4496a8a",
        "order_id": "4c75be9b-8cb1-48d3-b6d5-f36ded244d05",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "53b3d4ee-4e2e-4d19-b21f-8ea97cd046a2"
      },
      "correlation_id": "a68da04f-f30c-4271-9f1a-37d8073147ca"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/84207c4f-3204-466c-a8e3-8cd2e8fecd42/tip` → **200**

```json
{
  "order_id": "84207c4f-3204-466c-a8e3-8cd2e8fecd42",
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
  "available_until": "2026-10-31T14:06:25.471093Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/84207c4f-3204-466c-a8e3-8cd2e8fecd42/tip` → **409**

```json
{
  "command_id": "b8e9ac89-629a-41e1-aa56-2e0430a0ba63",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/84207c4f-3204-466c-a8e3-8cd2e8fecd42/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "01ef88b8-1ba7-41c2-a661-cc2123faa66e"
}
```

Done: interrupted 4c75be9b-8cb1-48d3-b6d5-f36ded244d05, follow-up 84207c4f-3204-466c-a8e3-8cd2e8fecd42.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0b055ed0-6f19-4733-bfe8-cb8681bc452d",
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
  "last_heartbeat_at": "2026-10-30T14:06:19.914683Z",
  "last_location_at": "2026-10-30T14:06:19.914683Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0b055ed0-6f19-4733-bfe8-cb8681bc452d/close` → **200**

```json
{
  "command_id": "682871f4-99f0-43f4-bb02-720bf30fac14",
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
  "session_id": "da84c47e-3b9b-4103-9768-a8fc83ffea7d",
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
  "last_heartbeat_at": "2026-10-30T14:06:24.543533Z",
  "last_location_at": "2026-10-30T14:06:24.543533Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/da84c47e-3b9b-4103-9768-a8fc83ffea7d/close` → **200**

```json
{
  "command_id": "38d060dc-2c56-4dde-a369-78d6eb8d6954",
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
  "session_id": "60dc499c-9fae-47c6-8a86-48217b82984a",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAwOTEsImlhdCI6MTc5MzM2OTE5MSwianRpIjoiOTBiMDBlMjMtNmRmMC00NjA0LTg0NzQtNjE5YTY2NmY3ZGQ2Iiwic2lkIjoiNjBkYzQ5OWMtOWZhZS00N2M2LThhODYtNDgyMTdiODI5ODRhIn0.nAZrp1M9iJPIxXYl5kLi6DOpephwptck978a5xPBXVs",
  "access_expires_at": "2026-10-30T14:21:31.822016476Z",
  "refresh_token": "mzoLkFbhGk2V-y4rTo-ehP9x8M7sUCKomETkRhwJ1ns",
  "refresh_expires_at": "2026-10-31T02:06:31.821428075Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "5cfbb3f3-496b-4a7c-be3e-2ecdb0269179",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T14:06:32Z"
}
```

```json
{
  "id": "b8b86399-81dd-408d-a867-51de1d37649d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T14:06:32Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/b8b86399-81dd-408d-a867-51de1d37649d/publish` → **200**

```json
{
  "command_id": "4053c2e9-7b3c-440d-8ee8-eecf15e7eab1",
  "expected_version": 0
}
```

```json
{
  "id": "b8b86399-81dd-408d-a867-51de1d37649d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T14:06:32.454338Z",
  "published_at": "2026-10-30T14:06:32.454338Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "b8b86399-81dd-408d-a867-51de1d37649d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T14:06:32.454338Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637318218",
  "device_ref": "sandbox-30497"
}
```

```json
{
  "challenge_id": "0d9432e4-4e58-4b2a-b866-9c2ec62bab9f",
  "expires_at": "2026-10-30T14:11:33.045116607Z",
  "resend_available_at": "2026-10-30T14:06:34.045116607Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637318218` → **200**

```json
{
  "phone": "+380637318218",
  "audience": "CLIENT",
  "code": "468313",
  "sent_at": "2026-10-30T14:06:33.048629029Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d9432e4-4e58-4b2a-b866-9c2ec62bab9f",
  "code": "468313",
  "device_ref": "sandbox-30497"
}
```

```json
{
  "session_id": "ff0a314a-ee11-4297-acb4-237990034244",
  "subject": {
    "type": "CLIENT",
    "id": "4d45453e-e384-4eb4-9d92-e61a749e3268"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDQ1NDUzZS1lMzg0LTRlYjQtOWQ5Mi1lNjFhNzQ5ZTMyNjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcwMDkzLCJpYXQiOjE3OTMzNjkxOTMsImp0aSI6IjAwMTAyYTk0LTUxNTMtNDBlNS04YTBhLTM0NzBlYjQ3YTU5MSIsInNpZCI6ImZmMGEzMTRhLWVlMTEtNDI5Ny1hY2I0LTIzNzk5MDAzNDI0NCJ9.jEbAdvTdUuP0R2yXQa6dzZ90zBzpLIO-cUFw2TOIApY",
  "access_expires_at": "2026-10-30T14:21:33.383990977Z",
  "refresh_token": "xS5SiDtWmb3odRiiAgFFwTTrHwYxCMZQ5sT3uRGN0EU",
  "refresh_expires_at": "2026-11-29T14:06:33.383171483Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "b8b86399-81dd-408d-a867-51de1d37649d",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T14:06:32.454338Z",
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
  "command_id": "77565f2a-ab00-49c8-844e-e489fd6681d0",
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
  "id": "983ac064-74d7-4cfd-a0b1-6e224324521a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:11:33.980736Z",
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
  "command_id": "1a4e44df-7e6e-4804-a674-6a9747d56579",
  "quote_id": "983ac064-74d7-4cfd-a0b1-6e224324521a",
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
  "correlation_id": "3dea896f-82db-49d4-b0f7-05b665122c93"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "4f989cca-fbe1-42d5-81a5-559b8042c728",
  "version_id": "b8b86399-81dd-408d-a867-51de1d37649d",
  "language": "uk"
}
```

```json
{
  "version_id": "b8b86399-81dd-408d-a867-51de1d37649d",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T14:06:34.606171Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "efdba8ef-abed-4735-b2de-cf830f65d2c7",
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
  "id": "714af42f-5cbf-4d50-88b6-71f69de666fd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:11:34.905712Z",
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
  "command_id": "ec0a7e4b-8871-455e-ae77-9531ed9db9b5",
  "quote_id": "714af42f-5cbf-4d50-88b6-71f69de666fd",
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
  "id": "9d61f209-e139-45b1-8f56-756ae03aa434",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d45453e-e384-4eb4-9d92-e61a749e3268",
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
  "created_at": "2026-10-30T14:06:35.230193Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9d61f209-e139-45b1-8f56-756ae03aa434` → **200**

```json
{
  "id": "9d61f209-e139-45b1-8f56-756ae03aa434",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d45453e-e384-4eb4-9d92-e61a749e3268",
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
  "created_at": "2026-10-30T14:06:35.230193Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9d61f209-e139-45b1-8f56-756ae03aa434/cancel` → **200**

```json
{
  "command_id": "b628045f-1e73-4140-a53f-b05ec0f90e2f",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9d61f209-e139-45b1-8f56-756ae03aa434",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4d45453e-e384-4eb4-9d92-e61a749e3268",
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
  "created_at": "2026-10-30T14:06:35.230193Z",
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

`POST /api/admin/v1/legal-documents/b8b86399-81dd-408d-a867-51de1d37649d` → **409**

```json
{
  "command_id": "d7aa8fef-2351-49eb-954f-7e341a81b276",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T14:06:36Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/b8b86399-81dd-408d-a867-51de1d37649d",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3a6b2e72-04e4-406d-821d-c61eab96a7b2"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "5e96fea9-a989-4a0a-b473-307f8f443c4e",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T14:06:36Z"
}
```

```json
{
  "id": "5542b69d-65eb-4581-8954-cc445bd02ee6",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T14:06:36Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/5542b69d-65eb-4581-8954-cc445bd02ee6/publish` → **200**

```json
{
  "command_id": "714eb404-20d8-45a0-91a2-2b174e7efd2c",
  "expected_version": 0
}
```

```json
{
  "id": "5542b69d-65eb-4581-8954-cc445bd02ee6",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T14:06:36.83965Z",
  "published_at": "2026-10-30T14:06:36.83965Z",
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
  "device_ref": "sandbox-14975"
}
```

```json
{
  "challenge_id": "11336af4-552b-40b3-93a2-259d26f1036d",
  "expires_at": "2026-10-30T14:11:37.138960867Z",
  "resend_available_at": "2026-10-30T14:06:38.138960867Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "400038",
  "sent_at": "2026-10-30T14:06:37.14166284Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "11336af4-552b-40b3-93a2-259d26f1036d",
  "code": "400038",
  "device_ref": "sandbox-14975"
}
```

```json
{
  "session_id": "79ff5742-558d-49f5-ade2-c9f5584a86db",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MDA5NywiaWF0IjoxNzkzMzY5MTk3LCJqdGkiOiI5MTM2MzI1Zi1kODJkLTQ0ZDctYjRmYy03NjRhYzY4YjZhNGUiLCJzaWQiOiI3OWZmNTc0Mi01NThkLTQ5ZjUtYWRlMi1jOWY1NTg0YTg2ZGIifQ.akEBxn5r6pmOArOpDtQbMNa5MZoBRc8j1vTU4TGI8Lo",
  "access_expires_at": "2026-10-30T14:21:37.479644253Z",
  "refresh_token": "XtAMEUDrrYqDR7F6y45qsq81z2GEgN8P0fSjrPuYZ_M",
  "refresh_expires_at": "2026-11-29T14:06:37.478988447Z",
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

(the car drives 70 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "e902a480-7d5d-4c9a-b117-119d2ac5e16b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:07:48Z",
    "sequence": 1793369268963
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4df4755f-9c24-413e-bdad-6962b21cab6f",
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
  "last_heartbeat_at": "2026-10-30T14:07:48.115521Z",
  "last_location_at": "2026-10-30T14:07:48.115521Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675201228",
  "device_ref": "sandbox-12548"
}
```

```json
{
  "challenge_id": "6e42de0c-cfef-4790-b902-25d4fa712842",
  "expires_at": "2026-10-30T14:12:48.418559929Z",
  "resend_available_at": "2026-10-30T14:07:49.418559929Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675201228` → **200**

```json
{
  "phone": "+380675201228",
  "audience": "CLIENT",
  "code": "328918",
  "sent_at": "2026-10-30T14:07:48.421843453Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e42de0c-cfef-4790-b902-25d4fa712842",
  "code": "328918",
  "device_ref": "sandbox-12548"
}
```

```json
{
  "session_id": "d05c9fd4-7648-4c67-aca4-76186d4ccaa2",
  "subject": {
    "type": "CLIENT",
    "id": "2a050402-81a1-43a1-94a3-870353ea8791"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTA1MDQwMi04MWExLTQzYTEtOTRhMy04NzAzNTNlYTg3OTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcwMTY4LCJpYXQiOjE3OTMzNjkyNjgsImp0aSI6ImI4ZmQ1ZGE2LTEyNTEtNGRhMS1hMjU1LWVmOGJjZmYzZmI2NSIsInNpZCI6ImQwNWM5ZmQ0LTc2NDgtNGM2Ny1hY2E0LTc2MTg2ZDRjY2FhMiJ9.bsieXWN8RQC9En5_rGAeNr-6PqrFuZ8MKdoh67OHJOc",
  "access_expires_at": "2026-10-30T14:22:48.752717218Z",
  "refresh_token": "Z4t-kKHO230qkw7WTWqLeRGH_CdHodaxbfHrnY60grM",
  "refresh_expires_at": "2026-11-29T14:07:48.752187407Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4931080c-2b36-4c16-8434-a5e1ecd94e39",
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
  "id": "2ad568cb-e2aa-40a5-bbd0-6f4bcacfecbb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:12:49.054835Z",
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
  "command_id": "7ae5821a-c2d7-42d6-a849-4d84be525286",
  "quote_id": "2ad568cb-e2aa-40a5-bbd0-6f4bcacfecbb",
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
    "phone": "+380671428475"
  }
}
```

```json
{
  "id": "61e3458f-a85b-4f42-85ab-7eba17001128",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a050402-81a1-43a1-94a3-870353ea8791",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:07:49.370712Z",
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
    "id": "c85ae367-9079-425c-b83f-35ff987c4986",
    "order_id": "61e3458f-a85b-4f42-85ab-7eba17001128",
    "expires_at": "2026-10-30T14:08:04.374822Z",
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

`POST /api/driver/v1/offers/c85ae367-9079-425c-b83f-35ff987c4986/accept` → **200**

```json
{
  "command_id": "80b7b037-45fc-4171-9f50-1313a9c7a60e"
}
```

```json
{
  "id": "af3d1b63-d17f-464a-b21b-c7fb571f8e5d",
  "order_id": "61e3458f-a85b-4f42-85ab-7eba17001128",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6a10713f-ab89-4fa8-95a1-04cd23d2ae9d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6a10713f-ab89-4fa8-95a1-04cd23d2ae9d",
  "order_id": "61e3458f-a85b-4f42-85ab-7eba17001128",
  "assignment_id": "af3d1b63-d17f-464a-b21b-c7fb571f8e5d",
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
    "phone": "+380671428475"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8f65cabc-a3e7-4d05-a461-5b967d0df9b4",
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
  "id": "6d51ac7c-2a18-4c18-b97b-71f4656d8823",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:12:50.609885Z",
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
  "command_id": "3d5d2c1f-9f0e-4390-8471-e882003e2fac",
  "quote_id": "6d51ac7c-2a18-4c18-b97b-71f4656d8823",
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
  "id": "4fbff777-2179-4a1f-82b5-5185c4101c5f",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a050402-81a1-43a1-94a3-870353ea8791",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:07:50.924747Z",
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
  "command_id": "2762ca88-0bae-407c-a15c-530ca5bdb5a0",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T17:07:51Z"
}
```

```json
{
  "id": "dcbecbab-c89f-4164-97ab-e92fb3ee8309",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:12:51.260545Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T17:07:51Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "890cd8a7-a433-4236-8b97-d8452d4fb403",
  "quote_id": "dcbecbab-c89f-4164-97ab-e92fb3ee8309",
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
  "pickup_at": "2026-10-30T17:07:51Z"
}
```

```json
{
  "id": "dcbc8496-659c-407a-bb9c-a30c6c572f65",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2a050402-81a1-43a1-94a3-870353ea8791",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T14:07:51.580289Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T17:07:51Z",
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
  "command_id": "d22c7bc6-04ef-4641-ac28-48ad4aee1ac7",
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
  "id": "a727b4dc-841d-4ea8-a51a-4a21cd498e3d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:12:51.911763Z",
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
  "command_id": "c07d225c-0d76-4fd5-a641-eb4498c55c7a",
  "quote_id": "a727b4dc-841d-4ea8-a51a-4a21cd498e3d",
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
  "correlation_id": "513c80a5-6e4e-40a5-8801-f511c90dd023"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "dcbc8496-659c-407a-bb9c-a30c6c572f65",
      "short_number": 21,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "2a050402-81a1-43a1-94a3-870353ea8791",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T14:07:51.580289Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T17:07:51Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "4fbff777-2179-4a1f-82b5-5185c4101c5f",
      "short_number": 20,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "2a050402-81a1-43a1-94a3-870353ea8791",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T14:07:50.924747Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "61e3458f-a85b-4f42-85ab-7eba17001128",
      "short_number": 19,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "4fbff777-2179-4a1f-82b5-5185c4101c5f",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a050402-81a1-43a1-94a3-870353ea8791",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:07:50.924747Z",
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

`GET /api/rider/v1/orders/61e3458f-a85b-4f42-85ab-7eba17001128` → **200**

```json
{
  "id": "61e3458f-a85b-4f42-85ab-7eba17001128",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2a050402-81a1-43a1-94a3-870353ea8791",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "af3d1b63-d17f-464a-b21b-c7fb571f8e5d",
    "order_id": "61e3458f-a85b-4f42-85ab-7eba17001128",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "6a10713f-ab89-4fa8-95a1-04cd23d2ae9d",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T14:07:49.370712Z",
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
    "location_at": "2026-10-30T14:07:48.115521Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/61e3458f-a85b-4f42-85ab-7eba17001128/cancel` → **200**

```json
{
  "command_id": "66e08096-e5e8-495a-be85-b0a51f593999",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "61e3458f-a85b-4f42-85ab-7eba17001128",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "2a050402-81a1-43a1-94a3-870353ea8791",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "af3d1b63-d17f-464a-b21b-c7fb571f8e5d",
    "order_id": "61e3458f-a85b-4f42-85ab-7eba17001128",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "6a10713f-ab89-4fa8-95a1-04cd23d2ae9d",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T14:07:49.370712Z",
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

`GET /api/rider/v1/orders/4fbff777-2179-4a1f-82b5-5185c4101c5f` → **200**

```json
{
  "id": "4fbff777-2179-4a1f-82b5-5185c4101c5f",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a050402-81a1-43a1-94a3-870353ea8791",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:07:50.924747Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4fbff777-2179-4a1f-82b5-5185c4101c5f/cancel` → **200**

```json
{
  "command_id": "6b007ca9-5c3f-4377-9520-8d44ca0a9613",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4fbff777-2179-4a1f-82b5-5185c4101c5f",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2a050402-81a1-43a1-94a3-870353ea8791",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:07:50.924747Z",
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

`GET /api/rider/v1/orders/dcbc8496-659c-407a-bb9c-a30c6c572f65` → **200**

```json
{
  "id": "dcbc8496-659c-407a-bb9c-a30c6c572f65",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2a050402-81a1-43a1-94a3-870353ea8791",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T14:07:51.580289Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T17:07:51Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/dcbc8496-659c-407a-bb9c-a30c6c572f65/cancel` → **200**

```json
{
  "command_id": "721a9647-9a48-4336-a980-f0d2665bd1ab",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "dcbc8496-659c-407a-bb9c-a30c6c572f65",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "2a050402-81a1-43a1-94a3-870353ea8791",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T14:07:51.580289Z",
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
  "pickup_at": "2026-10-30T17:07:51Z",
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
  "session_id": "4df4755f-9c24-413e-bdad-6962b21cab6f",
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
  "last_heartbeat_at": "2026-10-30T14:07:48.115521Z",
  "last_location_at": "2026-10-30T14:07:48.115521Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4df4755f-9c24-413e-bdad-6962b21cab6f/close` → **200**

```json
{
  "command_id": "f5999531-c9ee-45d5-ae4e-b714e712eed3",
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

Done: orders 61e3458f-a85b-4f42-85ab-7eba17001128, 4fbff777-2179-4a1f-82b5-5185c4101c5f, dcbc8496-659c-407a-bb9c-a30c6c572f65.

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
  "session_id": "b59ca8cf-b461-40f1-acff-7ba2664ff001",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAxNzYsImlhdCI6MTc5MzM2OTI3NiwianRpIjoiMTZiYWNkMWYtN2E0Yi00YTVlLThlZTUtY2E1NGEzZDg4MDUzIiwic2lkIjoiYjU5Y2E4Y2YtYjQ2MS00MGYxLWFjZmYtN2JhMjY2NGZmMDAxIn0.wvqs0T36QycZtgcE6EWRBT3pL66C_Z_4QFfDQ2WORis",
  "access_expires_at": "2026-10-30T14:22:56.018577389Z",
  "refresh_token": "eGFxB1sKjhPx0ky0T9Mni7fMNFNCSlOZ85VQ4S599TI",
  "refresh_expires_at": "2026-10-31T02:07:56.017940518Z",
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
  "session_id": "725a3444-4d58-4f61-b334-a3f99f1e318d",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAxNzYsImlhdCI6MTc5MzM2OTI3NiwianRpIjoiNjk4YmE0ZWYtMWU1My00Y2NkLTg0ZjAtMzQyMDY1NWY5OTg4Iiwic2lkIjoiNzI1YTM0NDQtNGQ1OC00ZjYxLWIzMzQtYTNmOTlmMWUzMThkIn0.llCQ1ozVVQglWNDdINdGaUCsTLDaDC81od7pjQYeCvE",
  "access_expires_at": "2026-10-30T14:22:56.608270556Z",
  "refresh_token": "AgmLOJPfqrQX_ZlExn0UMhVQOhDUjSE1v8ccZkytPuE",
  "refresh_expires_at": "2026-10-31T02:07:56.607665273Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19645"
}
```

```json
{
  "challenge_id": "454d71c9-ab4f-4842-a1a2-8dada42dfdb1",
  "expires_at": "2026-10-30T14:12:56.901735464Z",
  "resend_available_at": "2026-10-30T14:07:57.901735464Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "467611",
  "sent_at": "2026-10-30T14:07:56.904777933Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "454d71c9-ab4f-4842-a1a2-8dada42dfdb1",
  "code": "467611",
  "device_ref": "sandbox-19645"
}
```

```json
{
  "session_id": "cf4a491c-2939-415f-9795-3ed53b00212c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MDE3NywiaWF0IjoxNzkzMzY5Mjc3LCJqdGkiOiJkMDJkMWZmNy0yYzA0LTRjZjktOGE5NS03ZDU1MGFjNzBlYjYiLCJzaWQiOiJjZjRhNDkxYy0yOTM5LTQxNWYtOTc5NS0zZWQ1M2IwMDIxMmMifQ.3BSSRjT3qJ_Z_avxWUEBs2kW3fr2NCv1IvhCqLVJpBY",
  "access_expires_at": "2026-10-30T14:22:57.239045709Z",
  "refresh_token": "dT0pRf9y2CuYEhrB88eWKCHzHTPeQjBr0R3LlhvHCTE",
  "refresh_expires_at": "2026-11-29T14:07:57.238401053Z",
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
  "command_id": "4da906ed-dc2a-48fa-8fe8-ec1279dc0211",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:07:57Z",
    "sequence": 1793369277882
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "93ea8537-5373-4aa5-adc4-5db540c04367",
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
  "last_heartbeat_at": "2026-10-30T14:07:57.901499Z",
  "last_location_at": "2026-10-30T14:07:57.901499Z",
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
  "command_id": "a7673d0b-0ed2-4143-8e37-e505fc5972c0",
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
  "effective_at": "2026-10-30T14:07:58.518507Z",
  "changed_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T13:58:16.429502Z",
  "last_entries": [
    {
      "order_id": "ac2245ff-b7a1-4ede-8f82-6b48acc04fff",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T13:58:16.429502Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c5801c3f-07d8-4171-8535-c160b4c9292c",
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
  "id": "e72edbde-7809-4909-9158-12502bab2159",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:12:59.144556Z",
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
  "command_id": "75fbd6df-3c98-427b-a442-30563074c534",
  "quote_id": "e72edbde-7809-4909-9158-12502bab2159",
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
    "phone": "+3806711126471"
  }
}
```

```json
{
  "id": "69000db9-0fb4-4c3b-b4d0-ec4139a7d31d",
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
  "created_at": "2026-10-30T14:07:59.464057Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711126471"
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
    "id": "3dbdf86c-ee45-4595-a56e-c06885f90b9b",
    "order_id": "69000db9-0fb4-4c3b-b4d0-ec4139a7d31d",
    "expires_at": "2026-10-30T14:08:14.468252Z",
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

`POST /api/driver/v1/offers/3dbdf86c-ee45-4595-a56e-c06885f90b9b/accept` → **200**

```json
{
  "command_id": "e0219d25-e877-4db4-b9ff-1a964bda9f99"
}
```

```json
{
  "id": "4ba84827-214a-4df2-970c-526e1e44f1ad",
  "order_id": "69000db9-0fb4-4c3b-b4d0-ec4139a7d31d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "52a443be-4b03-47e2-8b9e-bd46e7255637",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "52a443be-4b03-47e2-8b9e-bd46e7255637",
  "order_id": "69000db9-0fb4-4c3b-b4d0-ec4139a7d31d",
  "assignment_id": "4ba84827-214a-4df2-970c-526e1e44f1ad",
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
    "phone": "+3806711126471"
  }
}
```

`POST /api/driver/v1/work-sessions/93ea8537-5373-4aa5-adc4-5db540c04367/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:08:00Z",
    "sequence": 1793369280717
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "93ea8537-5373-4aa5-adc4-5db540c04367",
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
  "last_heartbeat_at": "2026-10-30T14:08:00.741187Z",
  "last_location_at": "2026-10-30T14:08:00.741187Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/52a443be-4b03-47e2-8b9e-bd46e7255637/arrive` → **200**

```json
{
  "command_id": "12df45bf-58d6-4740-9d06-b8b70fad2a64",
  "expected_version": 0
}
```

```json
{
  "id": "52a443be-4b03-47e2-8b9e-bd46e7255637",
  "order_id": "69000db9-0fb4-4c3b-b4d0-ec4139a7d31d",
  "assignment_id": "4ba84827-214a-4df2-970c-526e1e44f1ad",
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
  "arrived_at": "2026-10-30T14:08:01.048887Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711126471"
  }
}
```

`POST /api/driver/v1/trips/52a443be-4b03-47e2-8b9e-bd46e7255637/start` → **200**

```json
{
  "command_id": "8d5439af-d7a7-449b-a166-55bdbb1b0246",
  "expected_version": 1
}
```

```json
{
  "id": "52a443be-4b03-47e2-8b9e-bd46e7255637",
  "order_id": "69000db9-0fb4-4c3b-b4d0-ec4139a7d31d",
  "assignment_id": "4ba84827-214a-4df2-970c-526e1e44f1ad",
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
  "arrived_at": "2026-10-30T14:08:01.048887Z",
  "started_at": "2026-10-30T14:08:01.369115Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711126471"
  }
}
```

`POST /api/driver/v1/trips/52a443be-4b03-47e2-8b9e-bd46e7255637/complete` → **200**

```json
{
  "command_id": "51e143cc-53e5-49cb-a334-dd61326037cf",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:08:01Z",
  "cash_received": true
}
```

```json
{
  "id": "52a443be-4b03-47e2-8b9e-bd46e7255637",
  "order_id": "69000db9-0fb4-4c3b-b4d0-ec4139a7d31d",
  "assignment_id": "4ba84827-214a-4df2-970c-526e1e44f1ad",
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
  "arrived_at": "2026-10-30T14:08:01.048887Z",
  "started_at": "2026-10-30T14:08:01.369115Z",
  "completed_at": "2026-10-30T14:08:01.683261Z",
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
  "command_id": "cd40b7ae-7f70-4f4d-93c6-3d6aa83065ee",
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
  "id": "ae51f22d-f9a9-432e-9e99-eee1b51454fa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:13:02.004250Z",
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
  "command_id": "9712f4fd-1844-4429-97d4-2d9c5885ac29",
  "quote_id": "ae51f22d-f9a9-432e-9e99-eee1b51454fa",
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
    "phone": "+380671110484"
  }
}
```

```json
{
  "id": "da9bd796-d763-41ab-ba2b-2aecb03ae882",
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
  "created_at": "2026-10-30T14:08:02.326303Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671110484"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/da9bd796-d763-41ab-ba2b-2aecb03ae882` → **200**

```json
{
  "id": "da9bd796-d763-41ab-ba2b-2aecb03ae882",
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
  "created_at": "2026-10-30T14:08:02.326303Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671110484"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/da9bd796-d763-41ab-ba2b-2aecb03ae882/cancel` → **200**

```json
{
  "command_id": "c9bc6869-270c-4949-bfc8-ee695058f29c",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "da9bd796-d763-41ab-ba2b-2aecb03ae882",
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
  "created_at": "2026-10-30T14:08:02.326303Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671110484"
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
  "staff_id": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T13:58:16.429502Z",
  "last_entries": [
    {
      "order_id": "da9bd796-d763-41ab-ba2b-2aecb03ae882",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T14:08:03.021743Z"
    },
    {
      "order_id": "69000db9-0fb4-4c3b-b4d0-ec4139a7d31d",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T14:08:01.688742Z"
    },
    {
      "order_id": "ac2245ff-b7a1-4ede-8f82-6b48acc04fff",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T13:58:16.429502Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "93ea8537-5373-4aa5-adc4-5db540c04367",
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
  "last_heartbeat_at": "2026-10-30T14:08:00.741187Z",
  "last_location_at": "2026-10-30T14:08:00.741187Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/93ea8537-5373-4aa5-adc4-5db540c04367/close` → **200**

```json
{
  "command_id": "8d4431f6-b67a-44da-a90d-55b27194cd78",
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

Done: operator bonus for fulfilled 69000db9-0fb4-4c3b-b4d0-ec4139a7d31d and operator-fault cancellation da9bd796-d763-41ab-ba2b-2aecb03ae882.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674675738",
  "device_ref": "sandbox-11687"
}
```

```json
{
  "challenge_id": "466b16c1-56d1-4f44-93c2-5b7d2017087f",
  "expires_at": "2026-10-30T14:13:07.519086466Z",
  "resend_available_at": "2026-10-30T14:08:08.519086466Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674675738` → **200**

```json
{
  "phone": "+380674675738",
  "audience": "CLIENT",
  "code": "992312",
  "sent_at": "2026-10-30T14:08:07.521979958Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675722729",
  "device_ref": "sandbox-8754",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "f871a31e-77f1-4ccd-8fa4-617c9942dc02",
  "expires_at": "2026-10-30T14:13:09.053900206Z",
  "resend_available_at": "2026-10-30T14:08:10.053900206Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675722729` → **200**

```json
{
  "phone": "+380675722729",
  "audience": "CLIENT",
  "code": "897671",
  "sent_at": "2026-10-30T14:08:09.056448533Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675722729",
  "device_ref": "sandbox-10881",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "942cf560-59f4-4cff-bc0e-b8c8c622eaa3",
  "expires_at": "2026-10-30T14:13:10.580033637Z",
  "resend_available_at": "2026-10-30T14:08:11.580033637Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675722729` → **200**

```json
{
  "phone": "+380675722729",
  "audience": "CLIENT",
  "code": "655067",
  "sent_at": "2026-10-30T14:08:10.58355023Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673130000",
  "device_ref": "sandbox-10991"
}
```

```json
{
  "challenge_id": "1b673301-19a8-4dcf-9b79-d7397737d447",
  "expires_at": "2026-10-30T14:13:12.118194617Z",
  "resend_available_at": "2026-10-30T14:08:13.118194617Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673130000",
  "device_ref": "sandbox-6569"
}
```

```json
{
  "challenge_id": "8a9ce455-e8ca-44fa-8c57-f6a0b8acacf0",
  "expires_at": "2026-10-30T14:13:13.63049462Z",
  "resend_available_at": "2026-10-30T14:08:14.63049462Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380673130000` → **200**

```json
{
  "phone": "+380673130000",
  "audience": "CLIENT",
  "code": "623718",
  "sent_at": "2026-10-30T14:08:13.633956414Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673130000",
  "device_ref": "sandbox-17056",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "51cab1cd-46ed-43fb-919d-bba1f5e211c7",
  "expires_at": "2026-10-30T14:13:15.148143161Z",
  "resend_available_at": "2026-10-30T14:08:16.148143161Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380673130000` → **200**

```json
{
  "phone": "+380673130000",
  "audience": "CLIENT",
  "code": "513708",
  "sent_at": "2026-10-30T14:08:15.15086542Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380673130000",
  "device_ref": "sandbox-5452",
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
  "correlation_id": "8a6d9f70-347f-4f90-9070-a215aa410292",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000000936"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "b05b4609-6fe6-4dfd-a271-129f7bea37d0"
}
```

`GET /sandbox/v1/otp?phone=%2B442000000936` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120021139"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "f2c50c75-dba1-46ab-9d74-1b760053812b"
}
```

`GET /sandbox/v1/otp?phone=%2B37120021139` → **404**

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
  "session_id": "f1024b8d-e869-4862-bbbd-5c58d61bb4ff",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAxOTcsImlhdCI6MTc5MzM2OTI5NywianRpIjoiNDdhMjU1MjItZTMzNy00Yzg4LWE3OGEtZmU1ZWIwMDNmNzM5Iiwic2lkIjoiZjEwMjRiOGQtZTg2OS00ODYyLWJiYmQtNWM1OGQ2MWJiNGZmIn0.w1LG2PdsJhnjZnGCqsQ1rm7gXtxrulyrBYDw0KpMNYA",
  "access_expires_at": "2026-10-30T14:23:17.958869273Z",
  "refresh_token": "1jsC-R8BFSsb_E2XrgDxtcoRFFarAuxyA9AQI2Vpu4I",
  "refresh_expires_at": "2026-10-31T02:08:17.958018011Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673130000` → **200**

```json
{
  "deliveries": [
    {
      "id": "5f266122-b4f0-4ffb-b781-6bf97452dcc0",
      "challenge_id": "51cab1cd-46ed-43fb-919d-bba1f5e211c7",
      "phone": "+380673130000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b7a581f5-c4e8-462e-991c-b66e309c325f",
      "error": null,
      "attempted_at": "2026-10-30T14:08:15.151176Z"
    },
    {
      "id": "f69b8e04-0509-48bb-bb6d-a13d254596c0",
      "challenge_id": "8a9ce455-e8ca-44fa-8c57-f6a0b8acacf0",
      "phone": "+380673130000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-812dd867-2341-4d4d-9d41-b67a4f3496d2",
      "error": null,
      "attempted_at": "2026-10-30T14:08:13.634263Z"
    },
    {
      "id": "e799ffef-5898-4f3a-b661-bea1bc2362c0",
      "challenge_id": "1b673301-19a8-4dcf-9b79-d7397737d447",
      "phone": "+380673130000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T14:08:12.1212Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380673130000` → **200**

```json
{
  "phone": "+380673130000",
  "audience": "CLIENT",
  "code": "513708",
  "sent_at": "2026-10-30T14:08:15.15086542Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675722729` → **200**

```json
{
  "deliveries": [
    {
      "id": "ec895a0a-b494-4a6a-ab52-907210b12d3b",
      "challenge_id": "942cf560-59f4-4cff-bc0e-b8c8c622eaa3",
      "phone": "+380675722729",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-3f86a18e-6bd8-41ed-bf89-e967318c03f8",
      "error": null,
      "attempted_at": "2026-10-30T14:08:10.584078Z"
    },
    {
      "id": "12a1d4a4-07e9-4ee9-b20c-5a58819d74e3",
      "challenge_id": "f871a31e-77f1-4ccd-8fa4-617c9942dc02",
      "phone": "+380675722729",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-2650cd84-4edc-42f1-b811-655d8de69650",
      "error": null,
      "attempted_at": "2026-10-30T14:08:09.056693Z"
    }
  ]
}
```

Done: SMS to +380674675738; SMS then a call to +380675722729; a failed SMS, two calls and a refused third to +380673130000; +44 and +371 refused.

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
  "session_id": "75d5d207-2e5a-458e-a40e-4637293c9a46",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAxOTksImlhdCI6MTc5MzM2OTI5OSwianRpIjoiNDdlODg1M2MtOTQ0ZS00MWY3LTkxZmMtMGVjMTFlNzljNjYyIiwic2lkIjoiNzVkNWQyMDctMmU1YS00NThlLWE0MGUtNDYzNzI5M2M5YTQ2In0.yyYL7nPKwZelW8CpKHFaZUuvQv3Qj-AK9SADtHWFY-A",
  "access_expires_at": "2026-10-30T14:23:19.235879626Z",
  "refresh_token": "MifIG_-zlnqj_bbenW9vasolfKIgonbRDEaZk9gKJ2A",
  "refresh_expires_at": "2026-10-31T02:08:19.235306674Z",
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
  "session_id": "e8c0499d-852f-4afd-b6db-4c71c11da290",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAxOTksImlhdCI6MTc5MzM2OTI5OSwianRpIjoiYTBiZGExMWEtZWI1MC00YmRlLWExN2MtYmIzM2E1ZTdhMDhmIiwic2lkIjoiZThjMDQ5OWQtODUyZi00YWZkLWI2ZGItNGM3MWMxMWRhMjkwIn0.h5m563XI76l8IBrwE-Pxche2Y4X15-uNaRvm3xtvpa8",
  "access_expires_at": "2026-10-30T14:23:19.82629668Z",
  "refresh_token": "MEN42_kKudPDxcUK_PmxDEDEKJHEkPHJo8v7Q-aOC_I",
  "refresh_expires_at": "2026-10-31T02:08:19.825634933Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c",
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

`POST /api/admin/v1/staff-extensions/432d3ce1-762e-4c60-80de-7105d97ad61c` → **200**

```json
{
  "command_id": "c9c66943-1664-4bf8-9826-f2922f9631c7",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "46f092e6-4ed7-4182-b516-d78bda75b998",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T14:08:21.064762Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T14:08:21.064762Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d1d55d48-d426-406c-9a9f-8e8e31947a7e",
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
  "id": "375c2684-8fc1-4c3d-81a7-40daac5487fa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:13:21.671458Z",
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
  "command_id": "8eae7478-2daa-4b2e-8f45-c3cd9c75ce72",
  "quote_id": "375c2684-8fc1-4c3d-81a7-40daac5487fa",
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
    "phone": "+380678838468"
  }
}
```

```json
{
  "id": "ed73d8c5-ead5-4574-a2fa-e83aa1a8e815",
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
  "created_at": "2026-10-30T14:08:22.003149Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678838468"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/ed73d8c5-ead5-4574-a2fa-e83aa1a8e815/calls` → **201**

```json
{
  "command_id": "37f69436-c97d-4969-9c1c-287cb2402960",
  "to": "CALLER"
}
```

```json
{
  "id": "7549646d-40d6-47d8-8385-6263c438ad78",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "order_ids": [
    "ed73d8c5-ead5-4574-a2fa-e83aa1a8e815"
  ],
  "started_at": "2026-10-30T14:08:22.348632Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/ed73d8c5-ead5-4574-a2fa-e83aa1a8e815/calls` → **201**

```json
{
  "command_id": "37f69436-c97d-4969-9c1c-287cb2402960",
  "to": "CALLER"
}
```

```json
{
  "id": "7549646d-40d6-47d8-8385-6263c438ad78",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "order_ids": [
    "ed73d8c5-ead5-4574-a2fa-e83aa1a8e815"
  ],
  "started_at": "2026-10-30T14:08:22.348632Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "7549646d-40d6-47d8-8385-6263c438ad78",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380678838468",
    "at": "2026-10-30T14:08:22.350896767Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "7549646d-40d6-47d8-8385-6263c438ad78",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.7539",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "7549646d-40d6-47d8-8385-6263c438ad78"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "7549646d-40d6-47d8-8385-6263c438ad78",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=ed73d8c5-ead5-4574-a2fa-e83aa1a8e815` → **200**

```json
{
  "calls": [
    {
      "id": "7549646d-40d6-47d8-8385-6263c438ad78",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
      "order_ids": [
        "ed73d8c5-ead5-4574-a2fa-e83aa1a8e815"
      ],
      "started_at": "2026-10-30T14:08:22.348632Z",
      "answered_at": "2026-10-30T14:08:23.050772Z",
      "ended_at": "2026-10-30T14:08:23.076917Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=ed73d8c5-ead5-4574-a2fa-e83aa1a8e815` → **200**

```json
{
  "calls": [
    {
      "id": "7549646d-40d6-47d8-8385-6263c438ad78",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
      "order_ids": [
        "ed73d8c5-ead5-4574-a2fa-e83aa1a8e815"
      ],
      "started_at": "2026-10-30T14:08:22.348632Z",
      "answered_at": "2026-10-30T14:08:23.050772Z",
      "ended_at": "2026-10-30T14:08:23.076917Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T14:08:24.51688Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/ed73d8c5-ead5-4574-a2fa-e83aa1a8e815` → **200**

```json
{
  "id": "ed73d8c5-ead5-4574-a2fa-e83aa1a8e815",
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
  "created_at": "2026-10-30T14:08:22.003149Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678838468"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ed73d8c5-ead5-4574-a2fa-e83aa1a8e815/cancel` → **200**

```json
{
  "command_id": "ce137cd4-0346-4b2e-b8ad-6ea603d6e6bc",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ed73d8c5-ead5-4574-a2fa-e83aa1a8e815",
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
  "created_at": "2026-10-30T14:08:22.003149Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678838468"
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
  "command_id": "f1dc1b97-3cd7-46a8-98dc-054b280e835f",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T14:08:26.410981Z",
  "extension": "101"
}
```

Done: outgoing call 7549646d-40d6-47d8-8385-6263c438ad78 from order ed73d8c5-ead5-4574-a2fa-e83aa1a8e815, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633306687",
  "device_ref": "sandbox-2862"
}
```

```json
{
  "challenge_id": "ffe1c181-5c99-4811-837d-a0c78e23858a",
  "expires_at": "2026-10-30T14:13:26.728939231Z",
  "resend_available_at": "2026-10-30T14:08:27.728939231Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633306687` → **200**

```json
{
  "phone": "+380633306687",
  "audience": "CLIENT",
  "code": "936625",
  "sent_at": "2026-10-30T14:08:26.731831408Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ffe1c181-5c99-4811-837d-a0c78e23858a",
  "code": "936625",
  "device_ref": "sandbox-2862"
}
```

```json
{
  "session_id": "d6af7625-cc29-4f27-8c2d-4ba633a01655",
  "subject": {
    "type": "CLIENT",
    "id": "8b27c69d-2575-490a-ba8d-87024e79dc57"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YjI3YzY5ZC0yNTc1LTQ5MGEtYmE4ZC04NzAyNGU3OWRjNTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcwMjA3LCJpYXQiOjE3OTMzNjkzMDcsImp0aSI6IjYzYTUyMTFhLThlNTItNGI0Zi05ZTIwLTgxMjRmMjk2NDM1YSIsInNpZCI6ImQ2YWY3NjI1LWNjMjktNGYyNy04YzJkLTRiYTYzM2EwMTY1NSJ9.6jnzbquwvX1jc_o8WZwzx-5dG2rCCc-sDsPE4vSGVNw",
  "access_expires_at": "2026-10-30T14:23:27.054109895Z",
  "refresh_token": "14zFtMNXZBdwUS6JjqUdV5uCra84wcIinT-5uYoMtjk",
  "refresh_expires_at": "2026-11-29T14:08:27.053500215Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8b27c69d-2575-490a-ba8d-87024e79dc57",
  "session_id": "d6af7625-cc29-4f27-8c2d-4ba633a01655",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633306687",
  "device_ref": "sandbox-21223"
}
```

```json
{
  "challenge_id": "626ac368-2278-48b5-ac99-39301aeff983",
  "expires_at": "2026-10-30T14:13:29.649742195Z",
  "resend_available_at": "2026-10-30T14:08:30.649742195Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633306687` → **200**

```json
{
  "phone": "+380633306687",
  "audience": "CLIENT",
  "code": "872356",
  "sent_at": "2026-10-30T14:08:29.652254905Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "626ac368-2278-48b5-ac99-39301aeff983",
  "code": "872356",
  "device_ref": "sandbox-21223"
}
```

```json
{
  "session_id": "e900a5f0-b742-4f95-b8f6-db15eed52b3e",
  "subject": {
    "type": "CLIENT",
    "id": "8b27c69d-2575-490a-ba8d-87024e79dc57"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YjI3YzY5ZC0yNTc1LTQ5MGEtYmE4ZC04NzAyNGU3OWRjNTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcwMjA5LCJpYXQiOjE3OTMzNjkzMDksImp0aSI6IjViOTA2MWIxLTllYzgtNDc3OC04NzU2LTQzYmFmZGRkZDRjNiIsInNpZCI6ImU5MDBhNWYwLWI3NDItNGY5NS1iOGY2LWRiMTVlZWQ1MmIzZSJ9.jEfo06XDXcPM28XLrDYL0kOCYXEs5DWKaerPxIT2U94",
  "access_expires_at": "2026-10-30T14:23:29.973735114Z",
  "refresh_token": "2K93iQ5cnowj6MmF_reZF0MWNr3o05icdfRdYUgYvNg",
  "refresh_expires_at": "2026-11-29T14:08:29.973052297Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "234b9458-146e-4cdb-b0f2-ed7b2df47a33",
  "expires_at": "2026-10-30T14:13:32.275022976Z",
  "resend_available_at": "2026-10-30T14:08:33.275022976Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633306687` → **200**

```json
{
  "phone": "+380633306687",
  "audience": "CLIENT",
  "code": "850333",
  "sent_at": "2026-10-30T14:08:32.277704067Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380636824640"
}
```

```json
{
  "challenge_id": "3c44fe54-53b5-4c32-809a-ad3189897b81",
  "expires_at": "2026-10-30T14:13:32.597175295Z",
  "resend_available_at": "2026-10-30T14:08:33.597175295Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636824640` → **200**

```json
{
  "phone": "+380636824640",
  "audience": "CLIENT",
  "code": "268832",
  "sent_at": "2026-10-30T14:08:32.599404313Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "368182ea-56de-4a8f-a63a-8668ad95d650",
  "current_challenge_id": "234b9458-146e-4cdb-b0f2-ed7b2df47a33",
  "current_code": "000000",
  "new_challenge_id": "3c44fe54-53b5-4c32-809a-ad3189897b81",
  "new_code": "268832"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "9fad6e51-49ad-4587-98cf-7ac5b030fe81"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "d21570d5-ee89-42c0-b57e-c7eed0d59a6a",
  "current_challenge_id": "234b9458-146e-4cdb-b0f2-ed7b2df47a33",
  "current_code": "850333",
  "new_challenge_id": "3c44fe54-53b5-4c32-809a-ad3189897b81",
  "new_code": "268832"
}
```

```json
{
  "subject_id": "8b27c69d-2575-490a-ba8d-87024e79dc57",
  "phone": "+380636824640",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8b27c69d-2575-490a-ba8d-87024e79dc57",
  "session_id": "d6af7625-cc29-4f27-8c2d-4ba633a01655",
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
  "correlation_id": "2687d2b8-80fa-41ca-b5f2-e5dc0fb7246e"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636824640",
  "device_ref": "sandbox-6392"
}
```

```json
{
  "challenge_id": "e8770bd0-7101-4b3a-9c94-4929523c6870",
  "expires_at": "2026-10-30T14:13:36.146232509Z",
  "resend_available_at": "2026-10-30T14:08:37.146232509Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636824640` → **200**

```json
{
  "phone": "+380636824640",
  "audience": "CLIENT",
  "code": "831905",
  "sent_at": "2026-10-30T14:08:36.148913501Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e8770bd0-7101-4b3a-9c94-4929523c6870",
  "code": "831905",
  "device_ref": "sandbox-6392"
}
```

```json
{
  "session_id": "e0805b17-4efd-46a9-a86d-ecff4a67d6ab",
  "subject": {
    "type": "CLIENT",
    "id": "8b27c69d-2575-490a-ba8d-87024e79dc57"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YjI3YzY5ZC0yNTc1LTQ5MGEtYmE4ZC04NzAyNGU3OWRjNTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcwMjE2LCJpYXQiOjE3OTMzNjkzMTYsImp0aSI6ImQwMjY0YTc4LWE4MzktNDU3MC04NjFlLTJlZTVmNjdjYTcyNiIsInNpZCI6ImUwODA1YjE3LTRlZmQtNDZhOS1hODZkLWVjZmY0YTY3ZDZhYiJ9.gjsi2-VC_DM1RSVIlDTb8GY2bvhXnOk23e48C6V1tQY",
  "access_expires_at": "2026-10-30T14:23:36.478183506Z",
  "refresh_token": "3WlH48RNWPuYRWryyD4lcJq9Dok8Nwnkc4t6FRsvS9g",
  "refresh_expires_at": "2026-11-29T14:08:36.477560211Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8b27c69d-2575-490a-ba8d-87024e79dc57",
  "session_id": "e0805b17-4efd-46a9-a86d-ecff4a67d6ab",
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
  "session_id": "82dfd7dd-118b-466c-8bf9-e7268e26a650",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAyMTcsImlhdCI6MTc5MzM2OTMxNywianRpIjoiNDAwZDcxNzctZDg3NC00NWNjLTk5ZWYtZjlmZWI0ZjRkZDRlIiwic2lkIjoiODJkZmQ3ZGQtMTE4Yi00NjZjLThiZjktZTcyNjhlMjZhNjUwIn0.1JIg6WSdOhq7nl2H3nfd1H6v9dLaAzHl3V4oqcuSjgE",
  "access_expires_at": "2026-10-30T14:23:37.36665052Z",
  "refresh_token": "vv0-L4m46ngfj5cOLZ7shFJ-KXM-HykFPh7b2lCEqTQ",
  "refresh_expires_at": "2026-10-31T02:08:37.366078302Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/8b27c69d-2575-490a-ba8d-87024e79dc57` → **200**

```json
{
  "client": {
    "id": "8b27c69d-2575-490a-ba8d-87024e79dc57",
    "phone": "+380636824640",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T14:08:27.051824Z",
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

`POST /api/admin/v1/clients/8b27c69d-2575-490a-ba8d-87024e79dc57/phone/new-code` → **201**

```json
{
  "phone": "+380639341010"
}
```

```json
{
  "challenge_id": "8c8049ef-17d8-4718-a68f-3a0d0278fb0e",
  "expires_at": "2026-10-30T14:13:38.002685121Z",
  "resend_available_at": "2026-10-30T14:08:39.002685121Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639341010` → **200**

```json
{
  "phone": "+380639341010",
  "audience": "CLIENT",
  "code": "094593",
  "sent_at": "2026-10-30T14:08:38.005216673Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/8b27c69d-2575-490a-ba8d-87024e79dc57/phone` → **422**

```json
{
  "command_id": "0ed17b8f-13fb-4843-b1d2-2db8eb9317e0",
  "expected_version": 3,
  "new_challenge_id": "8c8049ef-17d8-4718-a68f-3a0d0278fb0e",
  "new_code": "094594",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/8b27c69d-2575-490a-ba8d-87024e79dc57/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "97879eb7-12ae-434f-85d3-b9780cd4a3c5"
}
```

`POST /api/admin/v1/clients/8b27c69d-2575-490a-ba8d-87024e79dc57/phone` → **400**

```json
{
  "command_id": "71df9ff4-7d79-47c4-9aaa-724bc651bf10",
  "expected_version": 3,
  "new_challenge_id": "8c8049ef-17d8-4718-a68f-3a0d0278fb0e",
  "new_code": "094593",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/8b27c69d-2575-490a-ba8d-87024e79dc57/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "bc3fbaa2-6367-4bf3-944b-100131dbb745",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/8b27c69d-2575-490a-ba8d-87024e79dc57/phone` → **200**

```json
{
  "command_id": "137fffe1-3ec2-4929-af9c-bf09cdc4eaea",
  "expected_version": 3,
  "new_challenge_id": "8c8049ef-17d8-4718-a68f-3a0d0278fb0e",
  "new_code": "094593",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "8b27c69d-2575-490a-ba8d-87024e79dc57",
  "phone": "+380639341010",
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
  "correlation_id": "a0f9aa05-0a8a-4fc3-8335-903d0cfa7587"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639341010",
  "device_ref": "sandbox-28361"
}
```

```json
{
  "challenge_id": "4f0abef0-295e-4a95-a428-3e01c2c35454",
  "expires_at": "2026-10-30T14:13:39.575421303Z",
  "resend_available_at": "2026-10-30T14:08:40.575421303Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639341010` → **200**

```json
{
  "phone": "+380639341010",
  "audience": "CLIENT",
  "code": "196913",
  "sent_at": "2026-10-30T14:08:39.578297214Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f0abef0-295e-4a95-a428-3e01c2c35454",
  "code": "196913",
  "device_ref": "sandbox-28361"
}
```

```json
{
  "session_id": "330784ce-d753-436c-9e8d-c4e19792b405",
  "subject": {
    "type": "CLIENT",
    "id": "8b27c69d-2575-490a-ba8d-87024e79dc57"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YjI3YzY5ZC0yNTc1LTQ5MGEtYmE4ZC04NzAyNGU3OWRjNTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcwMjE5LCJpYXQiOjE3OTMzNjkzMTksImp0aSI6IjI3MTVmNmM4LWY0M2ItNDM0Yy05YzgyLTRlMmIyNzU0NjU4OSIsInNpZCI6IjMzMDc4NGNlLWQ3NTMtNDM2Yy05ZThkLWM0ZTE5NzkyYjQwNSJ9.yMLCS_blxVknxu-v9meZdKyt7c8RRZ-reQZUkH1mrb0",
  "access_expires_at": "2026-10-30T14:23:39.903474562Z",
  "refresh_token": "017-QGFOB10xsbznnx5X-H1uU2UIHg8Je5uL-kA8YhI",
  "refresh_expires_at": "2026-11-29T14:08:39.902820849Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8b27c69d-2575-490a-ba8d-87024e79dc57",
  "session_id": "330784ce-d753-436c-9e8d-c4e19792b405",
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
  "phone": "+380632530481",
  "device_ref": "sandbox-21662"
}
```

```json
{
  "challenge_id": "d5503282-8b40-4791-a157-6b623d476be9",
  "expires_at": "2026-10-30T14:13:40.509680275Z",
  "resend_available_at": "2026-10-30T14:08:41.509680275Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632530481` → **200**

```json
{
  "phone": "+380632530481",
  "audience": "CLIENT",
  "code": "776367",
  "sent_at": "2026-10-30T14:08:40.515059786Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d5503282-8b40-4791-a157-6b623d476be9",
  "code": "776367",
  "device_ref": "sandbox-21662"
}
```

```json
{
  "session_id": "544d4ffd-f6cb-498e-862f-43555e6cd4b8",
  "subject": {
    "type": "CLIENT",
    "id": "d8647043-12d9-4399-96ff-77dbc6ec9248"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODY0NzA0My0xMmQ5LTQzOTktOTZmZi03N2RiYzZlYzkyNDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcwMjIwLCJpYXQiOjE3OTMzNjkzMjAsImp0aSI6IjgwNjdiNDllLTkwYjYtNDU0MS1iNWMxLTJhZTZiMmQ1YjMzYSIsInNpZCI6IjU0NGQ0ZmZkLWY2Y2ItNDk4ZS04NjJmLTQzNTU1ZTZjZDRiOCJ9.FfKSollWfObq0GTIsf0Gnz2KzOB4sq-PV8z791vUES0",
  "access_expires_at": "2026-10-30T14:23:40.836986727Z",
  "refresh_token": "xw7VomdKwLX2KG0UvqGqmxV6ISpkEyRrLplQJFjC2ww",
  "refresh_expires_at": "2026-11-29T14:08:40.83644305Z",
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
  "session_id": "19bc9640-8297-48ca-a940-6b9e5feb3e8a",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAyMjIsImlhdCI6MTc5MzM2OTMyMiwianRpIjoiMTQ0NGI3MTctNzA3Ny00MTg1LTgzZDEtMmI3ZGQ2ZGYzNjJmIiwic2lkIjoiMTliYzk2NDAtODI5Ny00OGNhLWE5NDAtNmI5ZTVmZWIzZThhIn0.wonEBi9uHrMJpWYTqJ8xXzXa6ENGgK_A6Nii8pdiSzo",
  "access_expires_at": "2026-10-30T14:23:42.050820364Z",
  "refresh_token": "ngSOTzELMMSEj3w6o6npvv5Pm5b1HkFEa06qWz8utCM",
  "refresh_expires_at": "2026-10-31T02:08:42.05024568Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380632530481` → **200**

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
  "correlation_id": "fc29cf92-7fb5-4da3-a522-9cbc97229e08"
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
  "session_id": "9da238a5-6a75-480b-bd98-07bc30813187",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAyMjMsImlhdCI6MTc5MzM2OTMyMywianRpIjoiNjI3OGQzMTMtYjdkMC00NTA1LTljNzMtM2QwMTEyOGFiYjdlIiwic2lkIjoiOWRhMjM4YTUtNmE3NS00ODBiLWJkOTgtMDdiYzMwODEzMTg3In0.2oCr8GOmaIA6eEcZAvp2uHtmA8bJazujodHoPket9M4",
  "access_expires_at": "2026-10-30T14:23:43.302917228Z",
  "refresh_token": "MfWxUo5OIgpbtIXpk19P8x-5IKeasmNilC3jEuF-sho",
  "refresh_expires_at": "2026-10-31T02:08:43.302213341Z",
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
  "changed_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T13:54:13.546293Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "f4917b78-8b2f-4fc5-8dd7-18ef2f1de2bf",
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
  "changed_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T14:08:44.010235334Z"
}
```

## The rider books the airport for 2026-10-30T17:08:42Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600805189",
  "device_ref": "sandbox-22506"
}
```

```json
{
  "challenge_id": "58adb3e4-f185-4334-8544-0e0a79f9182e",
  "expires_at": "2026-10-30T14:13:44.346130962Z",
  "resend_available_at": "2026-10-30T14:08:45.346130962Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600805189` → **200**

```json
{
  "phone": "+48600805189",
  "audience": "CLIENT",
  "code": "933737",
  "sent_at": "2026-10-30T14:08:44.349170539Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "58adb3e4-f185-4334-8544-0e0a79f9182e",
  "code": "933737",
  "device_ref": "sandbox-22506"
}
```

```json
{
  "session_id": "77e1a3c7-c182-41d1-9e2f-b63fabe1950b",
  "subject": {
    "type": "CLIENT",
    "id": "372fd264-5e33-4416-9283-65137733e745"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNzJmZDI2NC01ZTMzLTQ0MTYtOTI4My02NTEzNzczM2U3NDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcwMjI0LCJpYXQiOjE3OTMzNjkzMjQsImp0aSI6ImNmNTFmMzhmLTVkNTMtNGFlZC05ZWQyLTZiNzhkNjg1MDZmNSIsInNpZCI6Ijc3ZTFhM2M3LWMxODItNDFkMS05ZTJmLWI2M2ZhYmUxOTUwYiJ9.DELAaU6O_uaQp9CzI6f19ivLO15z6biEbfaH0ayqmaM",
  "access_expires_at": "2026-10-30T14:23:44.678527203Z",
  "refresh_token": "fMYTlpHKkolcXE2mGls8yiMgFUvqnkrm-SosE-RrGF0",
  "refresh_expires_at": "2026-11-29T14:08:44.677671595Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0b3196bc-e5b1-4abe-b2de-b71a3fc4f4b5",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T17:08:42Z"
}
```

```json
{
  "id": "4e3f32c8-eecc-4c81-ba33-7e3c3f322b6d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:13:44.987272Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T17:08:42Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0d2f9aea-8c1d-4db3-a7bf-56929ace3de4",
  "quote_id": "4e3f32c8-eecc-4c81-ba33-7e3c3f322b6d",
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
  "pickup_at": "2026-10-30T17:08:42Z"
}
```

```json
{
  "id": "e8fee7ef-8804-4e19-ac64-608050cc2057",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "372fd264-5e33-4416-9283-65137733e745",
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
  "created_at": "2026-10-30T14:08:45.308384Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T17:08:42Z",
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
  "device_ref": "sandbox-13482"
}
```

```json
{
  "challenge_id": "f21f3ebf-237b-4ea6-84a2-0a2b17cf2876",
  "expires_at": "2026-10-30T14:13:45.644858967Z",
  "resend_available_at": "2026-10-30T14:08:46.644858967Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "347844",
  "sent_at": "2026-10-30T14:08:45.648212711Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f21f3ebf-237b-4ea6-84a2-0a2b17cf2876",
  "code": "347844",
  "device_ref": "sandbox-13482"
}
```

```json
{
  "session_id": "2dd5d7f9-eda6-4ae4-9c56-27e9c1688f00",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MDIyNSwiaWF0IjoxNzkzMzY5MzI1LCJqdGkiOiI3OWQ0ODkzYi1kYTM1LTRkYWQtYWU4ZS02MWU5YmM2NGQzNTEiLCJzaWQiOiIyZGQ1ZDdmOS1lZGE2LTRhZTQtOWM1Ni0yN2U5YzE2ODhmMDAifQ.nAZxUvcFfcNXZeTx5cvPZMAeK_NGpC_hPpHhDn1vsx0",
  "access_expires_at": "2026-10-30T14:23:45.968991214Z",
  "refresh_token": "n1DaUODK7bBn1LgkxMvHk5-1VY0K2k_SkV-oOMvrJSk",
  "refresh_expires_at": "2026-11-29T14:08:45.968389096Z",
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
  "command_id": "f6e3d32c-1fde-4e3f-b285-6e2528f74a8d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:08:46Z",
    "sequence": 1793369326582
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "7d14af97-3f26-4708-9ec7-512908cb4692",
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
  "last_heartbeat_at": "2026-10-30T14:08:46.601249Z",
  "last_location_at": "2026-10-30T14:08:46.601249Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "e8fee7ef-8804-4e19-ac64-608050cc2057",
      "short_number": 25,
      "pickup_at": "2026-10-30T17:08:42Z",
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

`POST /api/driver/v1/preorders/e8fee7ef-8804-4e19-ac64-608050cc2057/reserve` → **200**

```json
{
  "command_id": "cf86d125-b6e9-4bf1-a741-474d6800ebe6"
}
```

```json
{
  "id": "0f50e05b-1d9d-4910-a231-4b9262c46b0b",
  "state": "RESERVED",
  "order": {
    "order_id": "e8fee7ef-8804-4e19-ac64-608050cc2057",
    "short_number": 25,
    "pickup_at": "2026-10-30T17:08:42Z",
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
  "reserved_at": "2026-10-30T14:08:47.219502Z",
  "confirm_from": "2026-10-30T16:38:42Z",
  "confirm_until": "2026-10-30T16:48:42Z",
  "drop_until": "2026-10-30T16:08:42Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "0f50e05b-1d9d-4910-a231-4b9262c46b0b",
      "state": "RESERVED",
      "order": {
        "order_id": "e8fee7ef-8804-4e19-ac64-608050cc2057",
        "short_number": 25,
        "pickup_at": "2026-10-30T17:08:42Z",
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
      "reserved_at": "2026-10-30T14:08:47.219502Z",
      "confirm_from": "2026-10-30T16:38:42Z",
      "confirm_until": "2026-10-30T16:48:42Z",
      "drop_until": "2026-10-30T16:08:42Z"
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
      "id": "0f50e05b-1d9d-4910-a231-4b9262c46b0b",
      "state": "RESERVED",
      "order": {
        "order_id": "e8fee7ef-8804-4e19-ac64-608050cc2057",
        "short_number": 25,
        "pickup_at": "2026-10-30T17:08:42Z",
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
      "reserved_at": "2026-10-30T14:08:47.219502Z",
      "confirm_from": "2026-10-30T16:38:42Z",
      "confirm_until": "2026-10-30T16:48:42Z",
      "drop_until": "2026-10-30T16:08:42Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/0f50e05b-1d9d-4910-a231-4b9262c46b0b/confirm` → **409**

```json
{
  "command_id": "4d0407cb-84bf-421b-853e-e796a2461874"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/0f50e05b-1d9d-4910-a231-4b9262c46b0b/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "49edf79c-947e-4389-9614-58a6d3a05961"
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
  "session_id": "46697934-d44a-411e-9621-40489faa2d15",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAyMjgsImlhdCI6MTc5MzM2OTMyOCwianRpIjoiNzdmYzMwZDItNGU1OC00MDFhLTkwYWQtNmQyYWVlZjQyZjgxIiwic2lkIjoiNDY2OTc5MzQtZDQ0YS00MTFlLTk2MjEtNDA0ODlmYWEyZDE1In0.ZhSTYhlRkTH7d3J6sqep2gqd2BmRNHAA9q22jAgdqS4",
  "access_expires_at": "2026-10-30T14:23:48.738462185Z",
  "refresh_token": "bGIphVzTNt0IBcWxTdOSXbGvr6yTvyoFMDdlwSTWkp4",
  "refresh_expires_at": "2026-10-31T02:08:48.737831265Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e8fee7ef-8804-4e19-ac64-608050cc2057` → **200**

```json
{
  "id": "e8fee7ef-8804-4e19-ac64-608050cc2057",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "372fd264-5e33-4416-9283-65137733e745",
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
  "created_at": "2026-10-30T14:08:45.308384Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T17:08:42Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "0f50e05b-1d9d-4910-a231-4b9262c46b0b",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T14:08:47.219502Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/e8fee7ef-8804-4e19-ac64-608050cc2057/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T14:08:45.309492Z",
      "actor": {
        "type": "CLIENT",
        "id": "372fd264-5e33-4416-9283-65137733e745",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "e8fee7ef-8804-4e19-ac64-608050cc2057",
        "preorder": true,
        "quote_id": "4e3f32c8-eecc-4c81-ba33-7e3c3f322b6d",
        "pickup_at": "2026-10-30T17:08:42Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "a72fe5fa-7960-43f1-bcf7-cf9794a3d913"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T14:08:47.220677Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e8fee7ef-8804-4e19-ac64-608050cc2057",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "0f50e05b-1d9d-4910-a231-4b9262c46b0b"
      },
      "correlation_id": "cbd25515-70e8-4a78-a313-3b05349d092c"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order e8fee7ef-8804-4e19-ac64-608050cc2057, reservation 0f50e05b-1d9d-4910-a231-4b9262c46b0b.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20975"
}
```

```json
{
  "challenge_id": "3e4db290-7a12-4522-bf17-f62b281244c3",
  "expires_at": "2026-10-30T14:13:49.687391368Z",
  "resend_available_at": "2026-10-30T14:08:50.687391368Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "320295",
  "sent_at": "2026-10-30T14:08:49.69098428Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e4db290-7a12-4522-bf17-f62b281244c3",
  "code": "320295",
  "device_ref": "sandbox-20975"
}
```

```json
{
  "session_id": "d3e0ce9e-4455-44c8-b46d-23217bb34ac6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MDIzMCwiaWF0IjoxNzkzMzY5MzMwLCJqdGkiOiI5YmFkYmQ1MS0wNWM5LTQwMGMtOWMzYS1hNzJjNDkzMjUwYzUiLCJzaWQiOiJkM2UwY2U5ZS00NDU1LTQ0YzgtYjQ2ZC0yMzIxN2JiMzRhYzYifQ._5ydkitEfeR-_IWeeAtGbmmUiauz6pR04Rf3d1y9VtY",
  "access_expires_at": "2026-10-30T14:23:50.017267558Z",
  "refresh_token": "4L0lqKnz0z5opwREDXXAIIsB4FFR11G8OXFRqFTBhK8",
  "refresh_expires_at": "2026-11-29T14:08:50.016692062Z",
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
  "command_id": "24ec6700-825b-49e7-90c0-3aa394ca4dd2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:08:50Z",
    "sequence": 1793369330633
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2a5c3e1c-5fa8-4198-b26a-9cc3c2426001",
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
  "last_heartbeat_at": "2026-10-30T14:08:50.653676Z",
  "last_location_at": "2026-10-30T14:08:50.653676Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672984944",
  "device_ref": "sandbox-27582"
}
```

```json
{
  "challenge_id": "d869a169-d24f-4db1-9d32-16cb7add77d4",
  "expires_at": "2026-10-30T14:13:50.953914484Z",
  "resend_available_at": "2026-10-30T14:08:51.953914484Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672984944` → **200**

```json
{
  "phone": "+380672984944",
  "audience": "CLIENT",
  "code": "776837",
  "sent_at": "2026-10-30T14:08:50.956540775Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d869a169-d24f-4db1-9d32-16cb7add77d4",
  "code": "776837",
  "device_ref": "sandbox-27582"
}
```

```json
{
  "session_id": "1dec35a2-de4c-4eef-8ba7-68a9bb908263",
  "subject": {
    "type": "CLIENT",
    "id": "b79cc1f3-fc9b-4429-8c2d-66392e2d93da"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzljYzFmMy1mYzliLTQ0MjktOGMyZC02NjM5MmUyZDkzZGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcwMjMxLCJpYXQiOjE3OTMzNjkzMzEsImp0aSI6IjgwNWQzYWI1LTgwMWEtNDBmNy05Njg5LTcyYzU3N2U2ZDE2MSIsInNpZCI6IjFkZWMzNWEyLWRlNGMtNGVlZi04YmE3LTY4YTliYjkwODI2MyJ9.LUwPqa0BYHDEgVstdTLOhPB7hP4CU4H6JiXUAkf6QD4",
  "access_expires_at": "2026-10-30T14:23:51.28181573Z",
  "refresh_token": "mJHG3ksYfYNyPrZfZIlFbtd2UY5u2YJdaXrSVDYkg9k",
  "refresh_expires_at": "2026-11-29T14:08:51.281210948Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "42d883d4-b0c3-4276-9909-51769e3a15ed",
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
  "id": "25c73de0-2729-4226-a31a-ecdbd1459110",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:13:51.591699Z",
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
  "command_id": "0acc9c90-d09e-4508-aea5-e21f6dce1f49",
  "quote_id": "25c73de0-2729-4226-a31a-ecdbd1459110",
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
  "id": "502409fc-3f72-4a59-8c44-165538b0af2c",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b79cc1f3-fc9b-4429-8c2d-66392e2d93da",
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
  "created_at": "2026-10-30T14:08:51.909511Z",
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
    "id": "3a2b0bc3-eb58-4f24-b824-d47b1619f22b",
    "order_id": "502409fc-3f72-4a59-8c44-165538b0af2c",
    "expires_at": "2026-10-30T14:09:06.913071Z",
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

`POST /api/driver/v1/offers/3a2b0bc3-eb58-4f24-b824-d47b1619f22b/accept` → **200**

```json
{
  "command_id": "5dbc7bc9-dec8-4f25-b356-400dc96eb5e8"
}
```

```json
{
  "id": "5772c6c8-5cf6-475b-990e-71518e1190b2",
  "order_id": "502409fc-3f72-4a59-8c44-165538b0af2c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fa452cc5-bc69-4081-b0cd-b9f0f68655e3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fa452cc5-bc69-4081-b0cd-b9f0f68655e3",
  "order_id": "502409fc-3f72-4a59-8c44-165538b0af2c",
  "assignment_id": "5772c6c8-5cf6-475b-990e-71518e1190b2",
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

`POST /api/driver/v1/work-sessions/2a5c3e1c-5fa8-4198-b26a-9cc3c2426001/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:08:53Z",
    "sequence": 1793369333154
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2a5c3e1c-5fa8-4198-b26a-9cc3c2426001",
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
  "last_heartbeat_at": "2026-10-30T14:08:53.174231Z",
  "last_location_at": "2026-10-30T14:08:53.174231Z",
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
  "id": "fa452cc5-bc69-4081-b0cd-b9f0f68655e3",
  "order_id": "502409fc-3f72-4a59-8c44-165538b0af2c",
  "assignment_id": "5772c6c8-5cf6-475b-990e-71518e1190b2",
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

`POST /api/driver/v1/trips/fa452cc5-bc69-4081-b0cd-b9f0f68655e3/arrive` → **200**

```json
{
  "command_id": "c216e03f-5300-4674-83f0-6fabf7ac3bee",
  "expected_version": 0
}
```

```json
{
  "id": "fa452cc5-bc69-4081-b0cd-b9f0f68655e3",
  "order_id": "502409fc-3f72-4a59-8c44-165538b0af2c",
  "assignment_id": "5772c6c8-5cf6-475b-990e-71518e1190b2",
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
  "arrived_at": "2026-10-30T14:08:53.785795Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fa452cc5-bc69-4081-b0cd-b9f0f68655e3/start` → **200**

```json
{
  "command_id": "a31c0e25-80ce-45ce-beb3-10dc6cc46ed8",
  "expected_version": 1
}
```

```json
{
  "id": "fa452cc5-bc69-4081-b0cd-b9f0f68655e3",
  "order_id": "502409fc-3f72-4a59-8c44-165538b0af2c",
  "assignment_id": "5772c6c8-5cf6-475b-990e-71518e1190b2",
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
  "arrived_at": "2026-10-30T14:08:53.785795Z",
  "started_at": "2026-10-30T14:08:54.09691Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/2a5c3e1c-5fa8-4198-b26a-9cc3c2426001/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:09:42Z",
    "sequence": 1793369382442
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2a5c3e1c-5fa8-4198-b26a-9cc3c2426001",
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
  "last_heartbeat_at": "2026-10-30T14:09:42.461152Z",
  "last_location_at": "2026-10-30T14:09:42.461152Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/fa452cc5-bc69-4081-b0cd-b9f0f68655e3/complete` → **200**

```json
{
  "command_id": "547ee82e-6be2-47ee-b8ba-a5a31a51e6f4",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:09:42Z",
  "cash_received": true
}
```

```json
{
  "id": "fa452cc5-bc69-4081-b0cd-b9f0f68655e3",
  "order_id": "502409fc-3f72-4a59-8c44-165538b0af2c",
  "assignment_id": "5772c6c8-5cf6-475b-990e-71518e1190b2",
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
  "arrived_at": "2026-10-30T14:08:53.785795Z",
  "started_at": "2026-10-30T14:08:54.09691Z",
  "completed_at": "2026-10-30T14:09:42.787315Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/502409fc-3f72-4a59-8c44-165538b0af2c/rating` → **200**

```json
{
  "command_id": "7b964dd4-f294-4fd1-8714-4a4524e4abcd",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "502409fc-3f72-4a59-8c44-165538b0af2c",
  "score": 5,
  "created_at": "2026-10-30T14:09:43.150538316Z"
}
```

`POST /api/driver/v1/orders/502409fc-3f72-4a59-8c44-165538b0af2c/rating` → **200**

```json
{
  "command_id": "2c5ccb5d-9dd7-405f-addd-fd029e826e58",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "502409fc-3f72-4a59-8c44-165538b0af2c",
  "score": 4,
  "created_at": "2026-10-30T14:09:43.480121151Z"
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
  "session_id": "138c4ece-2dfe-4082-82c4-c5a4f1075dc9",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAyODQsImlhdCI6MTc5MzM2OTM4NCwianRpIjoiODEyYmFjM2EtNTkwMC00NDU3LTk0ODMtZmU5ZmViMTQxMTYzIiwic2lkIjoiMTM4YzRlY2UtMmRmZS00MDgyLTgyYzQtYzVhNGYxMDc1ZGM5In0.DP8SbkosCVjfuWL3-gM4WIOwCMKF8fYdl3TCm5Rus2Q",
  "access_expires_at": "2026-10-30T14:24:44.417275623Z",
  "refresh_token": "KzO38N_5VF4g6DsL5eIcIUVehayCtgkCqZ4TGWl50z4",
  "refresh_expires_at": "2026-10-31T02:09:44.416658627Z",
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
  "session_id": "f0cd4e34-af07-41b2-b300-0e451672e846",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAyODUsImlhdCI6MTc5MzM2OTM4NSwianRpIjoiODRhZWUzMzktYTYyOC00ZTg1LWFkNGEtNmI3N2Q5YWY1NDcyIiwic2lkIjoiZjBjZDRlMzQtYWYwNy00MWIyLWIzMDAtMGU0NTE2NzJlODQ2In0.CktbtCsV_zhGXt5819Mduh8cj6cUN_J0-a0EooEPigI",
  "access_expires_at": "2026-10-30T14:24:45.010823744Z",
  "refresh_token": "kbOVxVqhe-iikYrCWNahpd4-x7X-rEdWG6IFQod5ZAo",
  "refresh_expires_at": "2026-10-31T02:09:45.010221669Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/502409fc-3f72-4a59-8c44-165538b0af2c/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "502409fc-3f72-4a59-8c44-165538b0af2c",
      "author_type": "RIDER",
      "author_id": "b79cc1f3-fc9b-4429-8c2d-66392e2d93da",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T14:09:43.150538Z"
    },
    {
      "order_id": "502409fc-3f72-4a59-8c44-165538b0af2c",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "b79cc1f3-fc9b-4429-8c2d-66392e2d93da",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T14:09:43.480121Z"
    }
  ]
}
```

Done: ratings for order 502409fc-3f72-4a59-8c44-165538b0af2c.

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
  "session_id": "f3b28d21-6998-4da3-a3d3-90e1a249a545",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAyODUsImlhdCI6MTc5MzM2OTM4NSwianRpIjoiOTExN2YzY2ItNDQ0MS00ZDI0LWJiNWUtNGQ4MjMyNGFiN2I0Iiwic2lkIjoiZjNiMjhkMjEtNjk5OC00ZGEzLWEzZDMtOTBlMWEyNDlhNTQ1In0.X2JBPgnhrx7kngMjDtTJ7IFi_2mvPlldKybBQ1LZB-U",
  "access_expires_at": "2026-10-30T14:24:45.913623167Z",
  "refresh_token": "L97vBsPdc_SehruQXad-wYBLjksoAJGMMKQbKwvWDvs",
  "refresh_expires_at": "2026-10-31T02:09:45.913007587Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "e70effa3-3c90-4590-b684-cf82ae9624ce",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "5575f0b3-b93c-490b-8e97-ad1093510a79",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:09:46.211426Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5575f0b3-b93c-490b-8e97-ad1093510a79` → **200**

```json
{
  "id": "5575f0b3-b93c-490b-8e97-ad1093510a79",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:09:46.211426Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5575f0b3-b93c-490b-8e97-ad1093510a79` → **200**

```json
{
  "id": "5575f0b3-b93c-490b-8e97-ad1093510a79",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:09:46.211426Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5575f0b3-b93c-490b-8e97-ad1093510a79` → **200**

```json
{
  "id": "5575f0b3-b93c-490b-8e97-ad1093510a79",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:09:46.211426Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5575f0b3-b93c-490b-8e97-ad1093510a79` → **200**

```json
{
  "id": "5575f0b3-b93c-490b-8e97-ad1093510a79",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T14:09:46.211426Z",
  "ready_at": "2026-10-30T14:09:49.688259Z",
  "expires_at": "2026-10-31T14:09:49.688259Z"
}
```

`GET /api/admin/v1/reports/exports/5575f0b3-b93c-490b-8e97-ad1093510a79/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b8d464d2-4e2d-4a9d-8b04-f801bf36e3d5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "ac9df8e2-738e-4d87-bb16-64cf9512928a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:09:50.759793Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ac9df8e2-738e-4d87-bb16-64cf9512928a` → **200**

```json
{
  "id": "ac9df8e2-738e-4d87-bb16-64cf9512928a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:09:50.759793Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ac9df8e2-738e-4d87-bb16-64cf9512928a` → **200**

```json
{
  "id": "ac9df8e2-738e-4d87-bb16-64cf9512928a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:09:50.759793Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ac9df8e2-738e-4d87-bb16-64cf9512928a` → **200**

```json
{
  "id": "ac9df8e2-738e-4d87-bb16-64cf9512928a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:09:50.759793Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ac9df8e2-738e-4d87-bb16-64cf9512928a` → **200**

```json
{
  "id": "ac9df8e2-738e-4d87-bb16-64cf9512928a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T14:09:50.759793Z",
  "ready_at": "2026-10-30T14:09:54.697721Z",
  "expires_at": "2026-10-31T14:09:54.697721Z"
}
```

`GET /api/admin/v1/reports/exports/ac9df8e2-738e-4d87-bb16-64cf9512928a/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/68078675-76b0-4823-bd99-e7ca2c8921cf` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/68078675-76b0-4823-bd99-e7ca2c8921cf",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9da8b5bb-3747-4d62-a6fa-8d37f03dab54"
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
  "session_id": "6e0bca87-4b87-430b-bd60-13785dcd83df",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAyOTUsImlhdCI6MTc5MzM2OTM5NSwianRpIjoiNTk5MjFjMWItODhhMy00YmJmLTkwYWUtNTNiNTJlNmE3Yjk4Iiwic2lkIjoiNmUwYmNhODctNGI4Ny00MzBiLWJkNjAtMTM3ODVkY2Q4M2RmIn0.xkLQ-suPYINxnOOpQc6XpQQlvyfiZEOMPPMc8hXDjiQ",
  "access_expires_at": "2026-10-30T14:24:55.923123146Z",
  "refresh_token": "4IhZYhj3Mp863KejpBuOCPZp-sP_hv1tO-IV9QjywMQ",
  "refresh_expires_at": "2026-10-31T02:09:55.922492918Z",
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
  "command_id": "2c2f106f-f3b8-455a-aed9-687b8c907f3e",
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
  "changed_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T14:09:56.546245392Z"
}
```

`POST /sandbox/v1/retention/fixtures/bf191c21-d63c-40ae-b156-12ecf061652f` → **200**

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

`GET /sandbox/v1/retention/fixtures/bf191c21-d63c-40ae-b156-12ecf061652f` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/bf191c21-d63c-40ae-b156-12ecf061652f` → **204**

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
  "changed_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T14:09:56.546245Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "649a0b5d-acd9-4843-a5c2-3cbfe4eb50d3",
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
  "changed_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T14:09:57.302550723Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-17408"
}
```

```json
{
  "challenge_id": "fdd9f9d6-1e01-4d2f-b7a2-e9d9ab1968d7",
  "expires_at": "2026-10-30T14:14:57.620217879Z",
  "resend_available_at": "2026-10-30T14:09:58.620217879Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "222132",
  "sent_at": "2026-10-30T14:09:57.623225703Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fdd9f9d6-1e01-4d2f-b7a2-e9d9ab1968d7",
  "code": "222132",
  "device_ref": "sandbox-17408"
}
```

```json
{
  "session_id": "a2b6a77c-9c55-4b3d-8b22-57d210df815b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MDI5NywiaWF0IjoxNzkzMzY5Mzk3LCJqdGkiOiI2ZjRjODA2OS1kYjY3LTQ5MTYtYTI0Yi1mYmMzODU3MTk3Y2YiLCJzaWQiOiJhMmI2YTc3Yy05YzU1LTRiM2QtOGIyMi01N2QyMTBkZjgxNWIifQ.kqeV7Y0F8rVg4E-vJrF9yuJQ5qdHkwpM0PeTOLBhHig",
  "access_expires_at": "2026-10-30T14:24:57.943773744Z",
  "refresh_token": "r70zumNpqHyirawUabJxPlZkXARlGAN6DqBxGmHB-aU",
  "refresh_expires_at": "2026-11-29T14:09:57.943221372Z",
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
  "command_id": "24cdbce5-23a7-4f9c-a1c0-0f60232d688e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:09:58Z",
    "sequence": 1793369398860
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "37d76958-6228-4428-9648-f545312d40a2",
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
  "last_heartbeat_at": "2026-10-30T14:09:58.879251Z",
  "last_location_at": "2026-10-30T14:09:58.879251Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "c0c2859a-eaf3-4fe8-8cff-b7a2d55cc90f",
  "points": [
    {
      "sequence": 1793369401189,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T14:09:01Z"
    },
    {
      "sequence": 1793369401197,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T14:10:01Z"
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
  "session_id": "ee9d0e00-6087-46ff-be9b-009c94f605ed",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAzMDEsImlhdCI6MTc5MzM2OTQwMSwianRpIjoiZDkyZmZiOTEtYTY2My00ZGVlLTg3NWUtN2IwN2ZiYmIzMjk5Iiwic2lkIjoiZWU5ZDBlMDAtNjA4Ny00NmZmLWJlOWItMDA5Yzk0ZjYwNWVkIn0.OqkHBbOaMDBkWOvJAd1T2oJ9IpQLsBy0uxU1OyIPH8w",
  "access_expires_at": "2026-10-30T14:25:01.905140107Z",
  "refresh_token": "JssNJGPJyl6pVPFbrVdKFTNhTAmFdSjw1GXjb_QtCtQ",
  "refresh_expires_at": "2026-10-31T02:10:01.904411906Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "e84f7fab-7ae6-4328-81a5-dbff2fd2941e",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T14:10:01Z",
        "track_point_id": "204e3c5d-bbf6-49d0-8492-cccb0505bed6",
        "work_session_id": "37d76958-6228-4428-9648-f545312d40a2"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T14:10:01Z",
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

`POST /api/admin/v1/driver-risk-flags/e84f7fab-7ae6-4328-81a5-dbff2fd2941e/confirm` → **200**

```json
{
  "command_id": "522bf7a4-d319-424b-819f-de7552e80559",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "e84f7fab-7ae6-4328-81a5-dbff2fd2941e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T14:10:01Z",
    "track_point_id": "204e3c5d-bbf6-49d0-8492-cccb0505bed6",
    "work_session_id": "37d76958-6228-4428-9648-f545312d40a2"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T14:10:01Z",
  "reason": null,
  "reviewed_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "reviewed_at": "2026-10-30T14:10:02.904998Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/e84f7fab-7ae6-4328-81a5-dbff2fd2941e/dismiss` → **409**

```json
{
  "command_id": "05c84030-a78e-4685-9510-dc2d75157989",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/e84f7fab-7ae6-4328-81a5-dbff2fd2941e/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2842ecc3-24c7-4270-b9cf-1c12bbab9661"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "58d8050b-503a-4989-9298-9a978d01c13d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "b3d18648-7a6d-4bc7-8ac7-586b2e65044b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "raised_at": "2026-10-30T14:10:03.56495Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/b3d18648-7a6d-4bc7-8ac7-586b2e65044b/dismiss` → **200**

```json
{
  "command_id": "721cc9c1-413c-4480-9e81-d1a21f4b6e52",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "b3d18648-7a6d-4bc7-8ac7-586b2e65044b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "raised_at": "2026-10-30T14:10:03.56495Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "reviewed_at": "2026-10-30T14:10:03.902971Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "667fef27-4981-4c20-a935-a8522182334e",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "e84f7fab-7ae6-4328-81a5-dbff2fd2941e"
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
      "actor_id": "432d3ce1-762e-4c60-80de-7105d97ad61c",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T14:10:04.232965Z"
    }
  ],
  "duplicates": []
}
```

Done: flag e84f7fab-7ae6-4328-81a5-dbff2fd2941e confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "aa1c7c69-91a5-4601-a6b9-cb4058f52b36",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAzMDUsImlhdCI6MTc5MzM2OTQwNSwianRpIjoiYzAzNTQyYjgtNTNjOC00MmMxLTk3NDEtNTU0YzFkMGU3MGVhIiwic2lkIjoiYWExYzdjNjktOTFhNS00NjAxLWE2YjktY2I0MDU4ZjUyYjM2In0.OwT1nAKxgLfi09Hjs-EJZbg2bKgYDAEe_gAjdTW2Na8",
  "access_expires_at": "2026-10-30T14:25:05.165645518Z",
  "refresh_token": "4FlhkqBLEkOrdJTWOqKePAHCwm2S4esOWOQ2ItRGi2A",
  "refresh_expires_at": "2026-10-31T02:10:05.165071041Z",
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
      "actor_id": "432d3ce1-762e-4c60-80de-7105d97ad61c",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T14:10:04.232965Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "06b18402-eeb2-4b46-a82f-6bea6cae9ef0",
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
  "session_id": "37d76958-6228-4428-9648-f545312d40a2",
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
  "last_heartbeat_at": "2026-10-30T14:09:58.879251Z",
  "last_location_at": "2026-10-30T14:09:58.879251Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/37d76958-6228-4428-9648-f545312d40a2/close` → **200**

```json
{
  "command_id": "c844d6e7-6d22-49e5-a836-29859225b899",
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
  "session_id": "5d705b7b-9495-4abe-94d9-a61b9e07299d",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAzMDYsImlhdCI6MTc5MzM2OTQwNiwianRpIjoiMGFiMjAwZWEtMjJjNy00ZGQ1LWI2YTEtZGVmZWM2NThjMzU3Iiwic2lkIjoiNWQ3MDViN2ItOTQ5NS00YWJlLTk0ZDktYTYxYjllMDcyOTlkIn0.yrId8jiSC4a7T_i3-sOcYPhBhkTEnybDb86aaMHUSW4",
  "access_expires_at": "2026-10-30T14:25:06.958722972Z",
  "refresh_token": "G2rscnh1hJvRN_GKoIFz8Lt4i_pdAhZgdzSbzBC-u3o",
  "refresh_expires_at": "2026-10-31T02:10:06.958109888Z",
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
  "command_id": "64002ffa-b753-4038-98a3-b29b69bb177f",
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
  "changed_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T14:10:07.570307Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "64002ffa-b753-4038-98a3-b29b69bb177f",
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
  "changed_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T14:10:07.570307Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48801057167",
  "device_ref": "sandbox-13449"
}
```

```json
{
  "challenge_id": "eca5864c-9772-4209-92e1-48b82bfe7a91",
  "expires_at": "2026-10-30T14:15:08.18250782Z",
  "resend_available_at": "2026-10-30T14:10:09.18250782Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48801057167` → **200**

```json
{
  "phone": "+48801057167",
  "audience": "CLIENT",
  "code": "619404",
  "sent_at": "2026-10-30T14:10:08.185629928Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eca5864c-9772-4209-92e1-48b82bfe7a91",
  "code": "619404",
  "device_ref": "sandbox-13449"
}
```

```json
{
  "session_id": "13a6e357-12dc-42d2-bd03-3edd8107132e",
  "subject": {
    "type": "CLIENT",
    "id": "b8e3d942-4537-4cf6-8848-c920acc5085a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOGUzZDk0Mi00NTM3LTRjZjYtODg0OC1jOTIwYWNjNTA4NWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcwMzA4LCJpYXQiOjE3OTMzNjk0MDgsImp0aSI6IjNiYzA0ZTFhLTljNzctNGQ2ZS05NzlmLTRlMmRiNmMwODllOSIsInNpZCI6IjEzYTZlMzU3LTEyZGMtNDJkMi1iZDAzLTNlZGQ4MTA3MTMyZSJ9.joMhy_sHAp3DOMJmV8TT9_mD5ZNKZQ5j74_iqXuALok",
  "access_expires_at": "2026-10-30T14:25:08.500438115Z",
  "refresh_token": "tvOeMgDHhzL3BCEFpOl83MH1-mcmCaFsnzpvkExOrO0",
  "refresh_expires_at": "2026-11-29T14:10:08.499827213Z",
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
  "correlation_id": "6d34175b-3d45-4769-9c6e-af52ada6f49d"
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
  "device_ref": "sandbox-25941"
}
```

```json
{
  "challenge_id": "bdf24d49-d8b8-4cf9-aa8f-0173b8de06d7",
  "expires_at": "2026-10-30T14:15:09.396895683Z",
  "resend_available_at": "2026-10-30T14:10:10.396895683Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "619957",
  "sent_at": "2026-10-30T14:10:09.399666623Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bdf24d49-d8b8-4cf9-aa8f-0173b8de06d7",
  "code": "619957",
  "device_ref": "sandbox-25941"
}
```

```json
{
  "session_id": "a20996fc-7878-4293-b8e4-5fca85fe4038",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MDMwOSwiaWF0IjoxNzkzMzY5NDA5LCJqdGkiOiI1YTk1MTE1MS04ZjlkLTQyNDYtYjE1My1kZDE1ZjYyY2I3NjIiLCJzaWQiOiJhMjA5OTZmYy03ODc4LTQyOTMtYjhlNC01ZmNhODVmZTQwMzgifQ.dWvVtL3YkSCPS3zUhshe3L0uJIm5Vbo6fOsnnjCnLnA",
  "access_expires_at": "2026-10-30T14:25:09.737916813Z",
  "refresh_token": "CWu1IagqNr7YFYpG76jdlW7LBny8pOsU1jF_FPr_7pI",
  "refresh_expires_at": "2026-11-29T14:10:09.737351747Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "7d14af97-3f26-4708-9ec7-512908cb4692",
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
  "last_heartbeat_at": "2026-10-30T14:08:46.601249Z",
  "last_location_at": "2026-10-30T14:08:46.601249Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7d14af97-3f26-4708-9ec7-512908cb4692/handover` → **200**

```json
{
  "command_id": "a1effa8a-851a-4590-8aea-6476b8d713bd",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "7d14af97-3f26-4708-9ec7-512908cb4692",
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
  "last_heartbeat_at": "2026-10-30T14:08:46.601249Z",
  "last_location_at": "2026-10-30T14:08:46.601249Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7d14af97-3f26-4708-9ec7-512908cb4692/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:10:10Z",
    "sequence": 1793369410650
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "7d14af97-3f26-4708-9ec7-512908cb4692",
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
  "last_heartbeat_at": "2026-10-30T14:10:10.66844Z",
  "last_location_at": "2026-10-30T14:10:10.66844Z",
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
  "session_id": "7d14af97-3f26-4708-9ec7-512908cb4692",
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
  "last_heartbeat_at": "2026-10-30T14:10:10.66844Z",
  "last_location_at": "2026-10-30T14:10:10.66844Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7d14af97-3f26-4708-9ec7-512908cb4692/close` → **200**

```json
{
  "command_id": "7c632062-002c-4120-a341-68e9324d6c23",
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
  "correlation_id": "10597f42-33dd-4658-88b6-968a2da14276"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679428502",
  "device_ref": "sandbox-26750"
}
```

```json
{
  "challenge_id": "1fde03b4-2c4b-4202-a998-4318ebbc1be6",
  "expires_at": "2026-10-30T14:15:12.182550337Z",
  "resend_available_at": "2026-10-30T14:10:13.182550337Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679428502` → **200**

```json
{
  "phone": "+380679428502",
  "audience": "CLIENT",
  "code": "371395",
  "sent_at": "2026-10-30T14:10:12.185362898Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1fde03b4-2c4b-4202-a998-4318ebbc1be6",
  "code": "371395",
  "device_ref": "sandbox-26750"
}
```

```json
{
  "session_id": "69df8808-2b9c-4f95-bb65-5ea2314fcfc4",
  "subject": {
    "type": "CLIENT",
    "id": "0f5df076-8af5-4706-aed1-69a79f52ad7b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZjVkZjA3Ni04YWY1LTQ3MDYtYWVkMS02OWE3OWY1MmFkN2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcwMzEyLCJpYXQiOjE3OTMzNjk0MTIsImp0aSI6IjAwMzU0Y2UwLTM4OTQtNGQxYi05NmNlLTU4YjE0MDlmMjZlZSIsInNpZCI6IjY5ZGY4ODA4LTJiOWMtNGY5NS1iYjY1LTVlYTIzMTRmY2ZjNCJ9.kVXc35ltbHlXAU_KLriHNqcT8TNRI99zUj6UajLLjwU",
  "access_expires_at": "2026-10-30T14:25:12.509708801Z",
  "refresh_token": "BFPfXhWiydhf_Em16nFS41vCbJQevFIGy9X2ZvdvHP8",
  "refresh_expires_at": "2026-11-29T14:10:12.509017299Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "845da21f-9f1e-4d95-ba31-b27985b44b81",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "6beee320-8498-4622-b857-1292ccc7cc76",
  "upload_path": "/api/rider/v1/uploads/6beee320-8498-4622-b857-1292ccc7cc76",
  "expires_at": "2026-10-30T14:25:12.811892586Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/6beee320-8498-4622-b857-1292ccc7cc76` → **200**

```json
{
  "file_id": "6beee320-8498-4622-b857-1292ccc7cc76",
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
  "command_id": "3ebcd47b-1b3a-455f-8930-ce38701f3c64",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "b4b129e1-caaf-4195-9ce1-ebe1669e762a",
  "upload_path": "/api/rider/v1/uploads/b4b129e1-caaf-4195-9ce1-ebe1669e762a",
  "expires_at": "2026-10-30T14:25:13.153158003Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/b4b129e1-caaf-4195-9ce1-ebe1669e762a` → **200**

```json
{
  "file_id": "b4b129e1-caaf-4195-9ce1-ebe1669e762a",
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
  "command_id": "85c57b44-38ed-455c-aed3-630d7a73b815",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "2925aade-bce6-483f-b9ad-0adac0bf6cc0",
  "upload_path": "/api/rider/v1/uploads/2925aade-bce6-483f-b9ad-0adac0bf6cc0",
  "expires_at": "2026-10-30T14:25:13.474986449Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/2925aade-bce6-483f-b9ad-0adac0bf6cc0` → **200**

```json
{
  "file_id": "2925aade-bce6-483f-b9ad-0adac0bf6cc0",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "b0e90fb4-8eb4-4dce-8ccc-6a1c30d1a3d1",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "2925aade-bce6-483f-b9ad-0adac0bf6cc0"
  ]
}
```

```json
{
  "id": "be2ca15b-98a1-41fa-8a0e-db8cda8156f3",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "0f5df076-8af5-4706-aed1-69a79f52ad7b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T14:10:13.811058Z",
  "updated_at": "2026-10-30T14:10:13.811058Z",
  "respond_by": "2026-10-30T18:10:13.811058Z",
  "messages": [
    {
      "id": "89029e2c-827c-4b44-af13-95715f98b46f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "0f5df076-8af5-4706-aed1-69a79f52ad7b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T14:10:13.812356Z",
      "attachments": [
        {
          "file_id": "2925aade-bce6-483f-b9ad-0adac0bf6cc0",
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
  "session_id": "cfd80252-cb1b-4e7d-872a-a68adda32969",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAzMTQsImlhdCI6MTc5MzM2OTQxNCwianRpIjoiMmRiODAzNWQtOTIxYS00N2U1LWIzOWUtN2NkYzU1NGFhZWY3Iiwic2lkIjoiY2ZkODAyNTItY2IxYi00ZTdkLTg3MmEtYTY4YWRkYTMyOTY5In0.bcpF-V99mK2jI7yAS9Jxkkib3bXNN_quMhydMFZiy4U",
  "access_expires_at": "2026-10-30T14:25:14.417513107Z",
  "refresh_token": "f08ibl0eh5lis-s3iPISOY3CmFx9dj6Uk5apetm-Vec",
  "refresh_expires_at": "2026-10-31T02:10:14.416927111Z",
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
  "session_id": "a6ef4aa3-ea2a-43eb-9002-c439b5e4d1f2",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAzMTUsImlhdCI6MTc5MzM2OTQxNSwianRpIjoiZDFjZjhjNzctNjYyOC00ZWU4LWI4MjQtNWU2ZDVlZmQwYTExIiwic2lkIjoiYTZlZjRhYTMtZWEyYS00M2ViLTkwMDItYzQzOWI1ZTRkMWYyIn0.tfvUHR_-RLn6zFp7QlsKsyqhvVcbUNGf9BOt7eioey4",
  "access_expires_at": "2026-10-30T14:25:15.022380719Z",
  "refresh_token": "vmOs3WCtml6PquG1dcUVwOa3uqWhpIxryTWVNirWDVs",
  "refresh_expires_at": "2026-10-31T02:10:15.021743778Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/be2ca15b-98a1-41fa-8a0e-db8cda8156f3/attachments/2925aade-bce6-483f-b9ad-0adac0bf6cc0` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "295fa8fb-e063-4ff3-81ee-e1afe5fba07f",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "243714ca-b71d-49d3-a13b-2b0ae2254f7a",
  "upload_path": "/api/operator/v1/uploads/243714ca-b71d-49d3-a13b-2b0ae2254f7a",
  "expires_at": "2026-10-30T14:25:15.329859738Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/243714ca-b71d-49d3-a13b-2b0ae2254f7a` → **200**

```json
{
  "file_id": "243714ca-b71d-49d3-a13b-2b0ae2254f7a",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/be2ca15b-98a1-41fa-8a0e-db8cda8156f3` → **200**

```json
{
  "id": "be2ca15b-98a1-41fa-8a0e-db8cda8156f3",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "0f5df076-8af5-4706-aed1-69a79f52ad7b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T14:10:13.811058Z",
  "updated_at": "2026-10-30T14:10:13.811058Z",
  "respond_by": "2026-10-30T18:10:13.811058Z",
  "messages": [
    {
      "id": "89029e2c-827c-4b44-af13-95715f98b46f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "0f5df076-8af5-4706-aed1-69a79f52ad7b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T14:10:13.812356Z",
      "attachments": [
        {
          "file_id": "2925aade-bce6-483f-b9ad-0adac0bf6cc0",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/be2ca15b-98a1-41fa-8a0e-db8cda8156f3/comments` → **200**

```json
{
  "command_id": "b2f687cc-795f-47ec-9007-9056fb7eeeae",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "243714ca-b71d-49d3-a13b-2b0ae2254f7a"
  ]
}
```

```json
{
  "id": "be2ca15b-98a1-41fa-8a0e-db8cda8156f3",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "0f5df076-8af5-4706-aed1-69a79f52ad7b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T14:10:13.811058Z",
  "updated_at": "2026-10-30T14:10:15.961252Z",
  "respond_by": "2026-10-30T18:10:13.811058Z",
  "messages": [
    {
      "id": "89029e2c-827c-4b44-af13-95715f98b46f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "0f5df076-8af5-4706-aed1-69a79f52ad7b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T14:10:13.812356Z",
      "attachments": [
        {
          "file_id": "2925aade-bce6-483f-b9ad-0adac0bf6cc0",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "3c69888a-c298-453b-afd1-9d0f26f371d3",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "432d3ce1-762e-4c60-80de-7105d97ad61c",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T14:10:15.960774Z",
      "attachments": [
        {
          "file_id": "243714ca-b71d-49d3-a13b-2b0ae2254f7a",
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

`GET /api/rider/v1/support/cases/be2ca15b-98a1-41fa-8a0e-db8cda8156f3` → **200**

```json
{
  "id": "be2ca15b-98a1-41fa-8a0e-db8cda8156f3",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "0f5df076-8af5-4706-aed1-69a79f52ad7b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T14:10:13.811058Z",
  "updated_at": "2026-10-30T14:10:15.961252Z",
  "respond_by": "2026-10-30T18:10:13.811058Z",
  "messages": [
    {
      "id": "89029e2c-827c-4b44-af13-95715f98b46f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "0f5df076-8af5-4706-aed1-69a79f52ad7b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T14:10:13.812356Z",
      "attachments": [
        {
          "file_id": "2925aade-bce6-483f-b9ad-0adac0bf6cc0",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "3c69888a-c298-453b-afd1-9d0f26f371d3",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T14:10:15.960774Z",
      "attachments": [
        {
          "file_id": "243714ca-b71d-49d3-a13b-2b0ae2254f7a",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/be2ca15b-98a1-41fa-8a0e-db8cda8156f3/attachments/243714ca-b71d-49d3-a13b-2b0ae2254f7a` → **200**

Done: support case be2ca15b-98a1-41fa-8a0e-db8cda8156f3, rider attachment 2925aade-bce6-483f-b9ad-0adac0bf6cc0, operator attachment 243714ca-b71d-49d3-a13b-2b0ae2254f7a.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735665197",
  "device_ref": "sandbox-10236"
}
```

```json
{
  "challenge_id": "62fcfa65-0cf1-46ff-af4d-d46b4de1223c",
  "expires_at": "2026-10-30T14:15:16.591767022Z",
  "resend_available_at": "2026-10-30T14:10:17.591767022Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735665197` → **200**

```json
{
  "phone": "+380735665197",
  "audience": "CLIENT",
  "code": "394129",
  "sent_at": "2026-10-30T14:10:16.594621412Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62fcfa65-0cf1-46ff-af4d-d46b4de1223c",
  "code": "394129",
  "device_ref": "sandbox-10236"
}
```

```json
{
  "session_id": "5a34e945-2fe0-448d-99c3-f4839246f4ec",
  "subject": {
    "type": "CLIENT",
    "id": "63e9b9a8-ad5c-4d03-9d77-0d596346d9e2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2M2U5YjlhOC1hZDVjLTRkMDMtOWQ3Ny0wZDU5NjM0NmQ5ZTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcwMzE2LCJpYXQiOjE3OTMzNjk0MTYsImp0aSI6ImE1NTA2NDZlLWEwOWItNDVhNC1hNGQxLTdkMDk4YTBiZDVlOSIsInNpZCI6IjVhMzRlOTQ1LTJmZTAtNDQ4ZC05OWMzLWY0ODM5MjQ2ZjRlYyJ9.NB_36rlWQKu9qoiykNGkQ6fujNCRuzMh42MdSHmGhjM",
  "access_expires_at": "2026-10-30T14:25:16.918770558Z",
  "refresh_token": "TMA0PJ2sPRmuOwtV8MXrCS54KnPcKWrmr33sokl_B1E",
  "refresh_expires_at": "2026-11-29T14:10:16.9181683Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "af15e59c-b776-44ad-acb6-02ee7aa45ac5",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "fe5b5bc3-fd76-4d5b-aa96-5a600a1d582a",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-fe5b5bc3-fd76-4d5b-aa96-5a600a1d582a",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "69874b1eb23a876328aeee77eaa67d7f",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=fe5b5bc3-fd76-4d5b-aa96-5a600a1d582a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735665197"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=fe5b5bc3-fd76-4d5b-aa96-5a600a1d582a",
  "expires_at": "2026-10-30T14:40:17.223799Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/fe5b5bc3-fd76-4d5b-aa96-5a600a1d582a` → **200**

```json
{
  "id": "fe5b5bc3-fd76-4d5b-aa96-5a600a1d582a",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T14:40:17.223799Z",
  "card": {
    "id": "8913e5ff-6f18-4f6a-8d44-43fe9655b535",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2613",
    "card_type": "Visa",
    "created_at": "2026-10-30T14:10:17.525923Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0f5b2fa7-56ea-43df-93f6-b959b125dc6a",
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
  "id": "fe004210-f52a-4dcd-91d5-22b1bd914500",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:15:17.848056Z",
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
  "command_id": "e416e8d4-488d-4c3c-98ed-7626463afbd5",
  "quote_id": "fe004210-f52a-4dcd-91d5-22b1bd914500",
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
  "id": "da2c1ba8-e891-465f-8a05-e34a5dc9bace",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "63e9b9a8-ad5c-4d03-9d77-0d596346d9e2",
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
  "created_at": "2026-10-30T14:10:18.171411Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/da2c1ba8-e891-465f-8a05-e34a5dc9bace` → **200**

```json
{
  "id": "da2c1ba8-e891-465f-8a05-e34a5dc9bace",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "63e9b9a8-ad5c-4d03-9d77-0d596346d9e2",
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
  "created_at": "2026-10-30T14:10:18.171411Z",
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

`GET /api/rider/v1/orders/da2c1ba8-e891-465f-8a05-e34a5dc9bace` → **200**

```json
{
  "id": "da2c1ba8-e891-465f-8a05-e34a5dc9bace",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "63e9b9a8-ad5c-4d03-9d77-0d596346d9e2",
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
  "created_at": "2026-10-30T14:10:18.171411Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/da2c1ba8-e891-465f-8a05-e34a5dc9bace/switch-to-cash` → **200**

```json
{
  "command_id": "e8cedf21-e716-4099-acca-3d2c212d338c",
  "expected_version": 3
}
```

```json
{
  "id": "da2c1ba8-e891-465f-8a05-e34a5dc9bace",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "63e9b9a8-ad5c-4d03-9d77-0d596346d9e2",
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
  "created_at": "2026-10-30T14:10:18.171411Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/da2c1ba8-e891-465f-8a05-e34a5dc9bace/switch-to-cash` → **409**

```json
{
  "command_id": "5c933eaa-2919-4e86-8e91-af825f31fc45",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/da2c1ba8-e891-465f-8a05-e34a5dc9bace/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4f0179fc-3673-4f1d-b0a3-85ba093e06cc"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/da2c1ba8-e891-465f-8a05-e34a5dc9bace` → **200**

```json
{
  "id": "da2c1ba8-e891-465f-8a05-e34a5dc9bace",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "63e9b9a8-ad5c-4d03-9d77-0d596346d9e2",
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
  "created_at": "2026-10-30T14:10:18.171411Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/da2c1ba8-e891-465f-8a05-e34a5dc9bace/cancel` → **200**

```json
{
  "command_id": "0219faaf-e803-460e-a6ce-06282bd7e80c",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "da2c1ba8-e891-465f-8a05-e34a5dc9bace",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "63e9b9a8-ad5c-4d03-9d77-0d596346d9e2",
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
  "created_at": "2026-10-30T14:10:18.171411Z",
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
  "session_id": "2062b338-9cf7-4eb1-a32b-7d07b7108460",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAzMjAsImlhdCI6MTc5MzM2OTQyMCwianRpIjoiMzg0M2YzZDAtYzIwMy00OTNhLWE4NGMtYmJkMGIxNWFlZDQ3Iiwic2lkIjoiMjA2MmIzMzgtOWNmNy00ZWIxLWEzMmItN2QwN2I3MTA4NDYwIn0.N29gWQHeFCHhpRDkCr68QzQlFY_QIzaHtNYK18u0b64",
  "access_expires_at": "2026-10-30T14:25:20.730217662Z",
  "refresh_token": "QMXJ8ZMI94VyXhVPtpNBwUCrdJS1__JTSuL_SUerAIQ",
  "refresh_expires_at": "2026-10-31T02:10:20.729609585Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-26087"
}
```

```json
{
  "challenge_id": "4b0aa78f-48b2-4ca1-8d8d-3aebc8ee5bc5",
  "expires_at": "2026-10-30T14:15:21.033440099Z",
  "resend_available_at": "2026-10-30T14:10:22.033440099Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "590206",
  "sent_at": "2026-10-30T14:10:21.036215039Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b0aa78f-48b2-4ca1-8d8d-3aebc8ee5bc5",
  "code": "590206",
  "device_ref": "sandbox-26087"
}
```

```json
{
  "session_id": "09eb94cb-ab67-4c9a-a4b2-2988626bc393",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MDMyMSwiaWF0IjoxNzkzMzY5NDIxLCJqdGkiOiJlY2IyMjY0NC0xODNjLTQzOWMtOTY1ZS1jZDFkZWRlZmVjM2IiLCJzaWQiOiIwOWViOTRjYi1hYjY3LTRjOWEtYTRiMi0yOTg4NjI2YmMzOTMifQ.B6154ZzKinP5X0Bk42hU5vcVjxNhcbQI0lYHn00qulE",
  "access_expires_at": "2026-10-30T14:25:21.36886385Z",
  "refresh_token": "Fiz89yJwmWBpoP0SBmQ90LBUbpPqw3em0otpAb2HuiA",
  "refresh_expires_at": "2026-11-29T14:10:21.36825519Z",
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
      "actor_id": "432d3ce1-762e-4c60-80de-7105d97ad61c",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T14:10:04.232965Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "432d3ce1-762e-4c60-80de-7105d97ad61c",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T14:10:05.768597Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "9cbad847-c4bb-4ac3-a010-d811b7c3e28f",
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
  "device_ref": "sandbox-15444"
}
```

```json
{
  "challenge_id": "080f263e-c052-429f-b902-75eff43d21c0",
  "expires_at": "2026-10-30T14:15:22.608486268Z",
  "resend_available_at": "2026-10-30T14:10:23.608486268Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "482323",
  "sent_at": "2026-10-30T14:10:22.611555058Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "080f263e-c052-429f-b902-75eff43d21c0",
  "code": "482323",
  "device_ref": "sandbox-15444"
}
```

```json
{
  "session_id": "c0fc2119-f364-4f94-bf1b-f095995e8a44",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MDMyMiwiaWF0IjoxNzkzMzY5NDIyLCJqdGkiOiJhNGIyNTQxMC1kODg1LTQ4M2MtODYzZi1mMGFlMTliZjI3ZWEiLCJzaWQiOiJjMGZjMjExOS1mMzY0LTRmOTQtYmYxYi1mMDk1OTk1ZThhNDQifQ.3Rh57xthYHzWH-g_Y1B7b-jD9RLVkMAu3ylYHStQH-g",
  "access_expires_at": "2026-10-30T14:25:22.931920698Z",
  "refresh_token": "3MG7gH1idKbQ5REnQrNwtjN2F8Pde5WhY6HyFvCn190",
  "refresh_expires_at": "2026-11-29T14:10:22.931335383Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2a5c3e1c-5fa8-4198-b26a-9cc3c2426001",
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
  "last_heartbeat_at": "2026-10-30T14:09:42.461152Z",
  "last_location_at": "2026-10-30T14:09:42.461152Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2a5c3e1c-5fa8-4198-b26a-9cc3c2426001/handover` → **200**

```json
{
  "command_id": "be6be7da-0e84-43ba-aef4-87f9b99dd754",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2a5c3e1c-5fa8-4198-b26a-9cc3c2426001",
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
  "last_heartbeat_at": "2026-10-30T14:09:42.461152Z",
  "last_location_at": "2026-10-30T14:09:42.461152Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

(the car drives 8 s to the next point)

`POST /api/driver/v1/work-sessions/2a5c3e1c-5fa8-4198-b26a-9cc3c2426001/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:10:31Z",
    "sequence": 1793369431872
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2a5c3e1c-5fa8-4198-b26a-9cc3c2426001",
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
  "last_heartbeat_at": "2026-10-30T14:10:31.891887Z",
  "last_location_at": "2026-10-30T14:10:31.891887Z",
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
  "command_id": "9202ea58-64dd-42cf-9811-064d43172624",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:10:32Z",
    "sequence": 1793369432509
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5aca808b-cf1c-4e9b-9635-07fad96e3b7e",
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
  "last_heartbeat_at": "2026-10-30T14:10:32.528426Z",
  "last_location_at": "2026-10-30T14:10:32.528426Z",
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
  "session_id": "525b5920-9950-4c7f-9203-6a9ac3f24df2",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzAzMzMsImlhdCI6MTc5MzM2OTQzMywianRpIjoiYTdiNzk3YWYtNzdiYy00NDk0LWIzMDMtN2JhODJkOGY4YzE3Iiwic2lkIjoiNTI1YjU5MjAtOTk1MC00YzdmLTkyMDMtNmE5YWMzZjI0ZGYyIn0.yMsjsFqBekqfO3mHlR7omMyU2yGvXIj5mK-M9CociMY",
  "access_expires_at": "2026-10-30T14:25:33.122275735Z",
  "refresh_token": "kny-tjyUjLggi2EnVoHkByeskYkylk9f7v3LTnExG-E",
  "refresh_expires_at": "2026-10-31T02:10:33.121674751Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "14d85fa7-7485-416b-97cd-c75c077ec22f",
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
  "id": "e0d58ddb-c87b-4c6a-b6ed-7af29c30865c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:15:33.431766Z",
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
  "command_id": "4455c650-7858-443b-b0ff-eec3366450cd",
  "quote_id": "e0d58ddb-c87b-4c6a-b6ed-7af29c30865c",
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
  "id": "0e74ffbf-217b-4ee1-99d4-adbac68f12dc",
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
  "created_at": "2026-10-30T14:10:33.756959Z",
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
    "id": "06a56510-12b1-4c0d-b29a-83f849a5200f",
    "order_id": "0e74ffbf-217b-4ee1-99d4-adbac68f12dc",
    "expires_at": "2026-10-30T14:10:48.761224Z",
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

`POST /api/driver/v1/offers/06a56510-12b1-4c0d-b29a-83f849a5200f/accept` → **200**

```json
{
  "command_id": "d1edceff-af2d-4467-aec8-2dd6a51665c0"
}
```

```json
{
  "id": "084eb9d8-52b3-456d-bd52-3709325cc4ae",
  "order_id": "0e74ffbf-217b-4ee1-99d4-adbac68f12dc",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "95ddd2ba-193a-4807-85de-18ab604bb684",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "95ddd2ba-193a-4807-85de-18ab604bb684",
  "order_id": "0e74ffbf-217b-4ee1-99d4-adbac68f12dc",
  "assignment_id": "084eb9d8-52b3-456d-bd52-3709325cc4ae",
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

`POST /api/driver/v1/work-sessions/5aca808b-cf1c-4e9b-9635-07fad96e3b7e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:10:44Z",
    "sequence": 1793369444329
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5aca808b-cf1c-4e9b-9635-07fad96e3b7e",
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
  "last_heartbeat_at": "2026-10-30T14:10:44.349014Z",
  "last_location_at": "2026-10-30T14:10:44.349014Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/95ddd2ba-193a-4807-85de-18ab604bb684/arrive` → **200**

```json
{
  "command_id": "8a4b1c07-01eb-463f-919f-015493dda93f",
  "expected_version": 0
}
```

```json
{
  "id": "95ddd2ba-193a-4807-85de-18ab604bb684",
  "order_id": "0e74ffbf-217b-4ee1-99d4-adbac68f12dc",
  "assignment_id": "084eb9d8-52b3-456d-bd52-3709325cc4ae",
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
  "arrived_at": "2026-10-30T14:10:44.655607Z",
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

`POST /api/driver/v1/trips/95ddd2ba-193a-4807-85de-18ab604bb684/start` → **200**

```json
{
  "command_id": "f9335bf6-fa84-42f4-bdb0-7e9ad9a76086",
  "expected_version": 1
}
```

```json
{
  "id": "95ddd2ba-193a-4807-85de-18ab604bb684",
  "order_id": "0e74ffbf-217b-4ee1-99d4-adbac68f12dc",
  "assignment_id": "084eb9d8-52b3-456d-bd52-3709325cc4ae",
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
  "arrived_at": "2026-10-30T14:10:44.655607Z",
  "started_at": "2026-10-30T14:10:44.966209Z",
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

`POST /api/driver/v1/trips/95ddd2ba-193a-4807-85de-18ab604bb684/complete` → **200**

```json
{
  "command_id": "e8ec4b72-434c-48a3-9d92-6bcc34ce60d8",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:10:45Z",
  "cash_received": true
}
```

```json
{
  "id": "95ddd2ba-193a-4807-85de-18ab604bb684",
  "order_id": "0e74ffbf-217b-4ee1-99d4-adbac68f12dc",
  "assignment_id": "084eb9d8-52b3-456d-bd52-3709325cc4ae",
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
  "arrived_at": "2026-10-30T14:10:44.655607Z",
  "started_at": "2026-10-30T14:10:44.966209Z",
  "completed_at": "2026-10-30T14:10:45.292877Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/0e74ffbf-217b-4ee1-99d4-adbac68f12dc` → **200**

```json
{
  "id": "0e74ffbf-217b-4ee1-99d4-adbac68f12dc",
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
    "id": "084eb9d8-52b3-456d-bd52-3709325cc4ae",
    "order_id": "0e74ffbf-217b-4ee1-99d4-adbac68f12dc",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "95ddd2ba-193a-4807-85de-18ab604bb684",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T14:10:33.756959Z",
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
  "session_id": "2a5c3e1c-5fa8-4198-b26a-9cc3c2426001",
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
  "last_heartbeat_at": "2026-10-30T14:10:31.891887Z",
  "last_location_at": "2026-10-30T14:10:31.891887Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2a5c3e1c-5fa8-4198-b26a-9cc3c2426001/close` → **200**

```json
{
  "command_id": "80e6298c-c258-4935-b8a4-57a46fce34f6",
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
  "session_id": "5aca808b-cf1c-4e9b-9635-07fad96e3b7e",
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
  "last_heartbeat_at": "2026-10-30T14:10:44.349014Z",
  "last_location_at": "2026-10-30T14:10:44.349014Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5aca808b-cf1c-4e9b-9635-07fad96e3b7e/close` → **200**

```json
{
  "command_id": "84636570-f916-47b2-b2d8-ec2e81b9d227",
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

Done: terminal order 0e74ffbf-217b-4ee1-99d4-adbac68f12dc by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4150"
}
```

```json
{
  "challenge_id": "5a092066-dd79-4566-b018-9e45ac9bcf94",
  "expires_at": "2026-10-30T14:15:50.41833157Z",
  "resend_available_at": "2026-10-30T14:10:51.41833157Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "963353",
  "sent_at": "2026-10-30T14:10:50.421180552Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5a092066-dd79-4566-b018-9e45ac9bcf94",
  "code": "963353",
  "device_ref": "sandbox-4150"
}
```

```json
{
  "session_id": "1c070bb6-26a3-4c5a-af72-4c556f16f968",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MDM1MCwiaWF0IjoxNzkzMzY5NDUwLCJqdGkiOiJhMjJiMmQ1Ny02M2E5LTQxOTUtOTc0Zi02MjU1NTQ0NDEyN2QiLCJzaWQiOiIxYzA3MGJiNi0yNmEzLTRjNWEtYWY3Mi00YzU1NmYxNmY5NjgifQ.-y0aiy9UGIUOjF4WxQivohy62quZTxqAz433aG4js3E",
  "access_expires_at": "2026-10-30T14:25:50.740416879Z",
  "refresh_token": "euqMFg1xN2j-3pCPtcF8Xvmey2LU6OCMzPe9uS4XuqQ",
  "refresh_expires_at": "2026-11-29T14:10:50.739851031Z",
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
  "device_ref": "sandbox-21664"
}
```

```json
{
  "challenge_id": "d8dd0cb2-3031-4a9b-b2c5-d427bd2cc3a5",
  "expires_at": "2026-10-30T14:15:51.32743533Z",
  "resend_available_at": "2026-10-30T14:10:52.32743533Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "909090",
  "sent_at": "2026-10-30T14:10:51.329966119Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8dd0cb2-3031-4a9b-b2c5-d427bd2cc3a5",
  "code": "909090",
  "device_ref": "sandbox-21664"
}
```

```json
{
  "session_id": "4deaf47f-fb0d-4b0b-bfc4-be2545003bea",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MDM1MSwiaWF0IjoxNzkzMzY5NDUxLCJqdGkiOiIyYzViZWE0Zi1lMWE4LTQ4MDYtODlmNi0yZDk3MmM0YzE4ZGUiLCJzaWQiOiI0ZGVhZjQ3Zi1mYjBkLTRiMGItYmZjNC1iZTI1NDUwMDNiZWEifQ.gqWxVSyL1drGepByxjEb61XiJamxhpwmtmbH54JMUlY",
  "access_expires_at": "2026-10-30T14:25:51.650606506Z",
  "refresh_token": "M4xRkbps8T-EK2z7mavqg_mRx0-TeP38sxpvBR76miM",
  "refresh_expires_at": "2026-11-29T14:10:51.649983842Z",
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
  "device_ref": "sandbox-2993"
}
```

```json
{
  "challenge_id": "7d9b3966-b135-4a63-88c4-18a62389ecfd",
  "expires_at": "2026-10-30T14:15:52.222380064Z",
  "resend_available_at": "2026-10-30T14:10:53.222380064Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "435389",
  "sent_at": "2026-10-30T14:10:52.226009487Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7d9b3966-b135-4a63-88c4-18a62389ecfd",
  "code": "435389",
  "device_ref": "sandbox-2993"
}
```

```json
{
  "session_id": "c592593a-dce3-40c6-8b49-92df086d8237",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MDM1MiwiaWF0IjoxNzkzMzY5NDUyLCJqdGkiOiIzZGRiZjg4Yi0yOGNjLTRkZDktOTI5NS00MGJiN2YzMTJmMDUiLCJzaWQiOiJjNTkyNTkzYS1kY2UzLTQwYzYtOGI0OS05MmRmMDg2ZDgyMzcifQ.L4YprJbKwWbiJC0WWP-SPyymR3eRGVtwAJKlrYIpJoM",
  "access_expires_at": "2026-10-30T14:25:52.546525392Z",
  "refresh_token": "Xq09eCz53Pi4LSzv6nCisuXEECQCBzBNtHHVw7iwNWk",
  "refresh_expires_at": "2026-11-29T14:10:52.545942513Z",
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
  "phone": "+380697360782",
  "device_ref": "sandbox-15472"
}
```

```json
{
  "challenge_id": "34984a18-d3eb-4493-b94a-7f2e5555921a",
  "expires_at": "2026-10-30T14:15:53.123537023Z",
  "resend_available_at": "2026-10-30T14:10:54.123537023Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380697360782` → **200**

```json
{
  "phone": "+380697360782",
  "audience": "CLIENT",
  "code": "947958",
  "sent_at": "2026-10-30T14:10:53.126221758Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "34984a18-d3eb-4493-b94a-7f2e5555921a",
  "code": "947958",
  "device_ref": "sandbox-15472"
}
```

```json
{
  "session_id": "bc20fb6d-0d26-4f60-9b07-3a8c0995e4fe",
  "subject": {
    "type": "CLIENT",
    "id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOGY2OTk5ZC1mOGUxLTQwNTktODhlNS0yYWY5NGIzMWRjZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcwMzUzLCJpYXQiOjE3OTMzNjk0NTMsImp0aSI6ImZmMDUzY2QxLWE5OWMtNDIyMS05MGJmLWJkZTExZmQ2YjcyNCIsInNpZCI6ImJjMjBmYjZkLTBkMjYtNGY2MC05YjA3LTNhOGMwOTk1ZTRmZSJ9.GzmKJH5Ffs-1QbL4csOhfj7HqXlid3xougruDKEfiYk",
  "access_expires_at": "2026-10-30T14:25:53.446403532Z",
  "refresh_token": "boYio-NSmxdgBdc03OWwCdDxqMpYLTaHX4ykwWwyc1g",
  "refresh_expires_at": "2026-11-29T14:10:53.445758296Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "50c05749-aaa6-48b3-9ec0-37434f7baa7f",
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
  "id": "fb44905f-564c-48b0-a858-14d266cbc7ea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:15:53.755891Z",
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
  "command_id": "deb93863-f912-460d-bc03-af034827a5b2",
  "quote_id": "fb44905f-564c-48b0-a858-14d266cbc7ea",
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
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:10:54.065423Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:10:54.065423Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 12.430630885
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.863196288
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 6.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.195657088
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

`GET /api/rider/v1/orders/ae278f31-d826-4037-98c6-59f2ce40e954` → **200**

```json
{
  "id": "ae278f31-d826-4037-98c6-59f2ce40e954",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e8f6999d-f8e1-4059-88e5-2af94b31dcdd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:10:54.065423Z",
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
  "session_id": "45e6d59e-7de2-4566-87bb-e34e80653bb0",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzA1MzYsImlhdCI6MTc5MzM2OTYzNiwianRpIjoiNWUwOGM3NDEtMWJhOC00MzZlLWI1MTctYjYyYTRkMTg1NWU4Iiwic2lkIjoiNDVlNmQ1OWUtN2RlMi00NTY2LTg3YmItZTM0ZTgwNjUzYmIwIn0.cSzh9IHXJPgNE70i1mED-DLDVRDirxwErE0sevvzzCo",
  "access_expires_at": "2026-10-30T14:28:56.440400693Z",
  "refresh_token": "ma6WDunJ7h9IcymDtHBfL25lLBUMF-5w2O2Q681LJBM",
  "refresh_expires_at": "2026-10-31T02:13:56.43946274Z",
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
  "id": "9fb88dbf-15a0-4b10-89ac-99499add2ca0",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T14:13:56.760917Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T14:13:56.760961Z",
  "updated_at": "2026-10-30T14:13:56.783387Z",
  "finished_at": "2026-10-30T14:13:56.783387Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/9fb88dbf-15a0-4b10-89ac-99499add2ca0` → **200**

```json
{
  "run": {
    "id": "9fb88dbf-15a0-4b10-89ac-99499add2ca0",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T14:13:56.760917Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T14:13:56.760961Z",
    "updated_at": "2026-10-30T14:13:56.783387Z",
    "finished_at": "2026-10-30T14:13:56.783387Z",
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
  "id": "9fb88dbf-15a0-4b10-89ac-99499add2ca0",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T14:13:56.760917Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T14:13:56.760961Z",
  "updated_at": "2026-10-30T14:13:56.783387Z",
  "finished_at": "2026-10-30T14:13:56.783387Z",
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
  "id": "9fb88dbf-15a0-4b10-89ac-99499add2ca0",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T14:13:56.760917Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T14:13:56.760961Z",
  "updated_at": "2026-10-30T14:13:56.783387Z",
  "finished_at": "2026-10-30T14:13:56.783387Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/fca03ff4-05f6-48f3-b178-a506f82f1d5a` → **204**

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
  "id": "fc7c71eb-8ad7-4ed5-996a-e79f85b9ec39",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T14:13:57.273672Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T14:13:57.273713Z",
  "updated_at": "2026-10-30T14:13:57.282579Z",
  "finished_at": "2026-10-30T14:13:57.282579Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/fc7c71eb-8ad7-4ed5-996a-e79f85b9ec39` → **200**

```json
{
  "run": {
    "id": "fc7c71eb-8ad7-4ed5-996a-e79f85b9ec39",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T14:13:57.273672Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T14:13:57.273713Z",
    "updated_at": "2026-10-30T14:13:57.282579Z",
    "finished_at": "2026-10-30T14:13:57.282579Z",
    "version": 1
  },
  "items": [
    {
      "id": "591c53f6-35c3-4147-9d0f-0f7af3d68b5c",
      "run_id": "fc7c71eb-8ad7-4ed5-996a-e79f85b9ec39",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "4d07814aeeb2355d2401c3fc6eed40ebfe166d89504496dac18c86b7106424e0",
      "reference_display": "sandbox-reconciliation-fca03ff4-05f6-48f3-b178-a506f82f1d5a",
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
      "provider_at": "2026-10-30T14:13:57Z",
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
  "id": "fc7c71eb-8ad7-4ed5-996a-e79f85b9ec39",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T14:13:57.273672Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T14:13:57.273713Z",
  "updated_at": "2026-10-30T14:13:57.282579Z",
  "finished_at": "2026-10-30T14:13:57.282579Z",
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
  "id": "fc7c71eb-8ad7-4ed5-996a-e79f85b9ec39",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T14:13:57.273672Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T14:13:57.273713Z",
  "updated_at": "2026-10-30T14:13:57.282579Z",
  "finished_at": "2026-10-30T14:13:57.282579Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/591c53f6-35c3-4147-9d0f-0f7af3d68b5c/resolve` → **200**

```json
{
  "command_id": "45ce2020-0c52-4680-b675-43044852ef6c",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "591c53f6-35c3-4147-9d0f-0f7af3d68b5c",
  "run_id": "fc7c71eb-8ad7-4ed5-996a-e79f85b9ec39",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "4d07814aeeb2355d2401c3fc6eed40ebfe166d89504496dac18c86b7106424e0",
  "reference_display": "sandbox-reconciliation-fca03ff4-05f6-48f3-b178-a506f82f1d5a",
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
  "provider_at": "2026-10-30T14:13:57Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "resolved_at": "2026-10-30T14:13:57.753942Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/591c53f6-35c3-4147-9d0f-0f7af3d68b5c/resolve` → **200**

```json
{
  "command_id": "45ce2020-0c52-4680-b675-43044852ef6c",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "591c53f6-35c3-4147-9d0f-0f7af3d68b5c",
  "run_id": "fc7c71eb-8ad7-4ed5-996a-e79f85b9ec39",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "4d07814aeeb2355d2401c3fc6eed40ebfe166d89504496dac18c86b7106424e0",
  "reference_display": "sandbox-reconciliation-fca03ff4-05f6-48f3-b178-a506f82f1d5a",
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
  "provider_at": "2026-10-30T14:13:57Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
  "resolved_at": "2026-10-30T14:13:57.753942Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/591c53f6-35c3-4147-9d0f-0f7af3d68b5c/resolve` → **409**

```json
{
  "command_id": "f4518f9a-e0de-4971-915c-0314aae4ff96",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/591c53f6-35c3-4147-9d0f-0f7af3d68b5c/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d0fc0ac5-49e3-4a38-8a35-aeff2be53ee0"
}
```

`GET /api/admin/v1/payment-reconciliations/fc7c71eb-8ad7-4ed5-996a-e79f85b9ec39` → **200**

```json
{
  "run": {
    "id": "fc7c71eb-8ad7-4ed5-996a-e79f85b9ec39",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T14:13:57.273672Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T14:13:57.273713Z",
    "updated_at": "2026-10-30T14:13:57.753942Z",
    "finished_at": "2026-10-30T14:13:57.282579Z",
    "version": 2
  },
  "items": [
    {
      "id": "591c53f6-35c3-4147-9d0f-0f7af3d68b5c",
      "run_id": "fc7c71eb-8ad7-4ed5-996a-e79f85b9ec39",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "4d07814aeeb2355d2401c3fc6eed40ebfe166d89504496dac18c86b7106424e0",
      "reference_display": "sandbox-reconciliation-fca03ff4-05f6-48f3-b178-a506f82f1d5a",
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
      "provider_at": "2026-10-30T14:13:57Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "432d3ce1-762e-4c60-80de-7105d97ad61c",
      "resolved_at": "2026-10-30T14:13:57.753942Z",
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
      "id": "fc7c71eb-8ad7-4ed5-996a-e79f85b9ec39",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T14:13:57.273672Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T14:13:57.273713Z",
      "updated_at": "2026-10-30T14:13:57.753942Z",
      "finished_at": "2026-10-30T14:13:57.282579Z",
      "version": 2
    },
    {
      "id": "fbf93cc1-2ac1-4210-8e86-6b6a98f9c433",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T13:54:24.358625Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T13:54:24.358738Z",
      "updated_at": "2026-10-30T13:54:24.364566Z",
      "finished_at": "2026-10-30T13:54:24.364566Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/fca03ff4-05f6-48f3-b178-a506f82f1d5a` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "fc7c71eb-8ad7-4ed5-996a-e79f85b9ec39",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T14:13:57.273672Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T14:13:57.273713Z",
  "updated_at": "2026-10-30T14:13:57.753942Z",
  "finished_at": "2026-10-30T14:13:57.282579Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793369764797E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793369765292E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793369765293E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793369764797E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793369765293E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.

# Scenario: backup-restore

## A rider exists when the backup is taken

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689023583",
  "device_ref": "sandbox-17148"
}
```

```json
{
  "challenge_id": "5f1a073b-5969-434e-9ef6-ac932e8b9975",
  "expires_at": "2026-10-30T14:21:06.530738906Z",
  "resend_available_at": "2026-10-30T14:16:07.530738906Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380689023583` → **200**

```json
{
  "phone": "+380689023583",
  "audience": "CLIENT",
  "code": "447903",
  "sent_at": "2026-10-30T14:16:06.535278474Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5f1a073b-5969-434e-9ef6-ac932e8b9975",
  "code": "447903",
  "device_ref": "sandbox-17148"
}
```

```json
{
  "session_id": "c4454804-6819-4ec9-b4ab-9c9b2dbce9c9",
  "subject": {
    "type": "CLIENT",
    "id": "d6b1044d-1116-41a4-b46d-10cbdac138ec"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNmIxMDQ0ZC0xMTE2LTQxYTQtYjQ2ZC0xMGNiZGFjMTM4ZWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcwNjY2LCJpYXQiOjE3OTMzNjk3NjYsImp0aSI6Ijc0MjZkMDg0LTgxNTYtNGM3OC05Yjk0LTYxYWY4ZWJjOWEzZCIsInNpZCI6ImM0NDU0ODA0LTY4MTktNGVjOS1iNGFiLTljOWIyZGJjZTljOSJ9.yZ8x0jUyWR9aUjQlF6q5ZimSOoBngsYZ5wpswFP_8EU",
  "access_expires_at": "2026-10-30T14:31:06.862851497Z",
  "refresh_token": "GnJKsJSDU_ifgAnZoaWGzPv8-pHKHZ10YlEALr1hCRc",
  "refresh_expires_at": "2026-11-29T14:16:06.861897913Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d6b1044d-1116-41a4-b46d-10cbdac138ec",
  "session_id": "c4454804-6819-4ec9-b4ab-9c9b2dbce9c9",
  "account_state": "ACTIVE"
}
```

## Back up the database (deploy/backup.sh)
Backed up blizz to blizz.dump (520K)

## After the backup the rider deletes the account and staff complete it

`POST /api/rider/v1/me/deletion-request/challenge` → **201**

```json
{
  "challenge_id": "c6ef5cec-3b2f-4f1d-ab39-6a0c2e994be8",
  "expires_at": "2026-10-30T14:21:10.012100673Z",
  "resend_available_at": "2026-10-30T14:16:11.012100673Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380689023583` → **200**

```json
{
  "phone": "+380689023583",
  "audience": "CLIENT",
  "code": "618811",
  "sent_at": "2026-10-30T14:16:10.014634418Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "593bb614-b83c-480e-a390-1fc7fc681209",
  "challenge_id": "c6ef5cec-3b2f-4f1d-ab39-6a0c2e994be8",
  "otp_code": "618811"
}
```

```json
{
  "client_id": "d6b1044d-1116-41a4-b46d-10cbdac138ec",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T14:16:10.339979435Z"
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
  "session_id": "0229ee1e-aa57-4848-8c34-7ddb4e9e06dc",
  "subject": {
    "type": "STAFF",
    "id": "432d3ce1-762e-4c60-80de-7105d97ad61c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzJkM2NlMS03NjJlLTRjNjAtODBkZS03MTA1ZDk3YWQ2MWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzA2NzAsImlhdCI6MTc5MzM2OTc3MCwianRpIjoiNGVjMDEyODgtNzg5My00ZjgxLTg4N2YtY2JlNTk5MWNjM2MwIiwic2lkIjoiMDIyOWVlMWUtYWE1Ny00ODQ4LThjMzQtN2RkYjRlOWUwNmRjIn0.KeYlDSl0X-9DJtCt5R1R2FJwWcPV5VGToKpIb2og6PA",
  "access_expires_at": "2026-10-30T14:31:10.930612178Z",
  "refresh_token": "BfKZpSGMNjk3IGjL7zGy3s31udRNsuHk8mSyYPO-cqI",
  "refresh_expires_at": "2026-10-31T02:16:10.929957645Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/client-deletions/d6b1044d-1116-41a4-b46d-10cbdac138ec/complete` → **200**

```json
{
  "command_id": "f40867b8-9c4c-472b-8159-b8be5afc2bb2",
  "reason": "Sandbox: backup and restore check"
}
```

```json
{
  "client_id": "d6b1044d-1116-41a4-b46d-10cbdac138ec",
  "account_state": "ANONYMIZED"
}
```

## Restore into an empty database (deploy/restore.sh); over data it refuses
Restored blizz.dump into blizz_restored: 101 migrations applied. Start the server on it with the same ERASURE_JOURNAL_DIR.
Database blizz_restored is not empty (112 tables): restore only into an empty database

In the restored database before the server starts: `ACTIVE +380689023583` (the backup predates the deletion).

## Start the server on the restored database with the same journal: the deletion is applied again

After the start: `ANONYMIZED -`.

Done: backup, restore into an empty database, start on it; the deleted rider stayed deleted (T-39).
