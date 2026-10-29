# Sandbox transcript (2026-10-29T10:40:57Z, e36772f)

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
  "correlation_id": "9444a9f7-f9f6-4bb8-b953-fbfebc83e794"
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
  "session_id": "06a2b511-8a9b-4e5a-b1c4-5b568c802b12",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzEzNjgsImlhdCI6MTc5MzI3MDQ2OCwianRpIjoiNTc0MDgyZGEtZmVhMy00MmYwLWE0YWEtNmQxNTQzMmZlOGUyIiwic2lkIjoiMDZhMmI1MTEtOGE5Yi00ZTVhLWIxYzQtNWI1NjhjODAyYjEyIn0.rTvb7Q38okNkZiuzqDe4nb93ZftTnuy4aecHQzA2GwA",
  "access_expires_at": "2026-10-29T10:56:08.260092552Z",
  "refresh_token": "O-tHU2g3JjhsxEV6-CtHDhRukIhvnVffcqELttYq_io",
  "refresh_expires_at": "2026-10-29T22:41:08.258467169Z",
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
  "session_id": "b7ee9d95-7536-41d2-bb21-2b9ca68a7e1f",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzEzNjksImlhdCI6MTc5MzI3MDQ2OSwianRpIjoiNjVhMDJlMjItNmJkOS00ZmQxLTkwYmEtY2Y2MDI3ZmNlYjRhIiwic2lkIjoiYjdlZTlkOTUtNzUzNi00MWQyLWJiMjEtMmI5Y2E2OGE3ZTFmIn0.RLJ4vGRi7aYTzDUTr2NnXPCbHCBuv0XixSzjtUKGzYo",
  "access_expires_at": "2026-10-29T10:56:09.289513485Z",
  "refresh_token": "0eTEYVI_-XgDXqqhosC40SwY7gZsmIj4Dj3zLu_tuwE",
  "refresh_expires_at": "2026-10-29T22:41:09.288882227Z",
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
  "device_ref": "sandbox-30441"
}
```

```json
{
  "challenge_id": "edf88335-2836-4bdf-bf44-6b9a6ea3df1e",
  "expires_at": "2026-10-29T10:46:09.668469411Z",
  "resend_available_at": "2026-10-29T10:41:10.668469411Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "245275",
  "sent_at": "2026-10-29T10:41:09.677621784Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "edf88335-2836-4bdf-bf44-6b9a6ea3df1e",
  "code": "245275",
  "device_ref": "sandbox-30441"
}
```

```json
{
  "session_id": "0244e88c-5a94-4093-852f-0e52b9d1d626",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTM2OSwiaWF0IjoxNzkzMjcwNDY5LCJqdGkiOiI5ODRlMWJmYi05MGNhLTRhMmItYWQ0Mi1kOTQ3NmNiNTU2ZDkiLCJzaWQiOiIwMjQ0ZTg4Yy01YTk0LTQwOTMtODUyZi0wZTUyYjlkMWQ2MjYifQ.kvjpH9MhXtNlridr29jppyRZWqtAWkPeoCZg0OPQSzM",
  "access_expires_at": "2026-10-29T10:56:09.915943015Z",
  "refresh_token": "JUjIRJio_AyuZXV0w-uMWCXgS01GqgS4c5Vxi7b2o6E",
  "refresh_expires_at": "2026-11-28T10:41:09.915203434Z",
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
  "command_id": "72c7b3db-e72f-484d-a443-5b46ca05b077",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:41:10Z",
    "sequence": 1793270470286
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2fd07c9a-3f90-445d-964c-03756a5eda2f",
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
  "last_heartbeat_at": "2026-10-29T10:41:10.543796Z",
  "last_location_at": "2026-10-29T10:41:10.543796Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632526316",
  "device_ref": "sandbox-3037"
}
```

```json
{
  "challenge_id": "91812a3b-4345-4f96-88fb-9fd02d5c3c08",
  "expires_at": "2026-10-29T10:46:10.748639606Z",
  "resend_available_at": "2026-10-29T10:41:11.748639606Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632526316` → **200**

```json
{
  "phone": "+380632526316",
  "audience": "CLIENT",
  "code": "411465",
  "sent_at": "2026-10-29T10:41:10.751994681Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "91812a3b-4345-4f96-88fb-9fd02d5c3c08",
  "code": "411465",
  "device_ref": "sandbox-3037"
}
```

```json
{
  "session_id": "17db1bbb-76e5-4a0e-a1bc-e2d69afec5dc",
  "subject": {
    "type": "CLIENT",
    "id": "f123d56d-f650-4352-9bf7-4d7fe17f4ce4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMTIzZDU2ZC1mNjUwLTQzNTItOWJmNy00ZDdmZTE3ZjRjZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxMzcwLCJpYXQiOjE3OTMyNzA0NzAsImp0aSI6IjE4ZDMwYjdiLWE0MGItNGJjNy05OTVmLTllYjE4NWMzZDg1NCIsInNpZCI6IjE3ZGIxYmJiLTc2ZTUtNGEwZS1hMWJjLWUyZDY5YWZlYzVkYyJ9.zCQOrglA8tQKx_yDqJgAcJmj3f591AZdHGl5BwWIOK0",
  "access_expires_at": "2026-10-29T10:56:10.952363645Z",
  "refresh_token": "90RBJWZ6BehPa9U835n8dXIrJEB49faYLb_1AAh_nqg",
  "refresh_expires_at": "2026-11-28T10:41:10.951727094Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "420c0e83-05b5-4512-8cf3-d221f2e5b136",
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
  "id": "3d1291ca-4dd9-40f4-a90a-401826ca506b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:46:11.160514Z",
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
  "command_id": "590fdd72-236d-4767-a6ef-6ac46c777cc8",
  "quote_id": "3d1291ca-4dd9-40f4-a90a-401826ca506b",
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
  "id": "720cddfe-ae20-4952-9410-c67e28f8db59",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f123d56d-f650-4352-9bf7-4d7fe17f4ce4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T10:41:11.402329Z",
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
    "id": "c65078eb-7bff-438f-b701-0a24c9c78c21",
    "order_id": "720cddfe-ae20-4952-9410-c67e28f8db59",
    "expires_at": "2026-10-29T10:41:26.409138Z",
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

`POST /api/driver/v1/offers/c65078eb-7bff-438f-b701-0a24c9c78c21/accept` → **200**

```json
{
  "command_id": "7d4597ce-8646-479a-b11a-cc76db0e9cfe"
}
```

```json
{
  "id": "816ab64f-23da-4a68-a31a-cad705076beb",
  "order_id": "720cddfe-ae20-4952-9410-c67e28f8db59",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1745da78-665d-43cd-9825-a5e21a793b48",
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
  "command_id": "39fc9cfb-f571-4bfd-b93c-ce3116d75b06",
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
  "changed_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T10:41:12.192894454Z"
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
  "id": "1745da78-665d-43cd-9825-a5e21a793b48",
  "order_id": "720cddfe-ae20-4952-9410-c67e28f8db59",
  "assignment_id": "816ab64f-23da-4a68-a31a-cad705076beb",
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

`POST /api/driver/v1/work-sessions/2fd07c9a-3f90-445d-964c-03756a5eda2f/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:41:12Z",
    "sequence": 1793270472782
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2fd07c9a-3f90-445d-964c-03756a5eda2f",
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
  "last_heartbeat_at": "2026-10-29T10:41:12.804451Z",
  "last_location_at": "2026-10-29T10:41:12.804451Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1745da78-665d-43cd-9825-a5e21a793b48/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "8f17b40c-ef7f-46ca-9661-5744572f841a",
  "expected_version": 0
}
```

```json
{
  "id": "1745da78-665d-43cd-9825-a5e21a793b48",
  "order_id": "720cddfe-ae20-4952-9410-c67e28f8db59",
  "assignment_id": "816ab64f-23da-4a68-a31a-cad705076beb",
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
  "arrived_at": "2026-10-29T10:41:13.042592Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1745da78-665d-43cd-9825-a5e21a793b48/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "ffb799ae-660d-4de3-a6a7-2e3ffd86e2e1",
  "expected_version": 1
}
```

```json
{
  "id": "1745da78-665d-43cd-9825-a5e21a793b48",
  "order_id": "720cddfe-ae20-4952-9410-c67e28f8db59",
  "assignment_id": "816ab64f-23da-4a68-a31a-cad705076beb",
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
  "arrived_at": "2026-10-29T10:41:13.042592Z",
  "started_at": "2026-10-29T10:41:13.236424Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1745da78-665d-43cd-9825-a5e21a793b48/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "f52a1c75-c3c1-4c97-911e-5a01158fd552",
  "expected_version": 2,
  "reported_at": "2026-10-29T10:41:13Z",
  "cash_received": true
}
```

```json
{
  "id": "1745da78-665d-43cd-9825-a5e21a793b48",
  "order_id": "720cddfe-ae20-4952-9410-c67e28f8db59",
  "assignment_id": "816ab64f-23da-4a68-a31a-cad705076beb",
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
  "arrived_at": "2026-10-29T10:41:13.042592Z",
  "started_at": "2026-10-29T10:41:13.236424Z",
  "completed_at": "2026-10-29T10:41:13.438863Z",
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
  "session_id": "2fd07c9a-3f90-445d-964c-03756a5eda2f",
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
  "last_heartbeat_at": "2026-10-29T10:41:12.804451Z",
  "last_location_at": "2026-10-29T10:41:12.804451Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2fd07c9a-3f90-445d-964c-03756a5eda2f/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "1e171c1e-6e77-4309-a803-443665516bc9",
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
  "command_id": "4567f3c0-b3cb-4ccc-b473-834a2df6991e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:41:13Z",
    "sequence": 1793270473982
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
  "correlation_id": "8f63b1a9-de4d-4e29-b8d2-741fb39b5a3d",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "a4ee7528-8cb2-42b2-85f1-790bb4f27d4b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:41:14Z",
    "sequence": 1793270474211
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "97dd21b8-5b1c-4a0a-8b0f-cfd780b6d015",
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
  "last_heartbeat_at": "2026-10-29T10:41:14.229365Z",
  "last_location_at": "2026-10-29T10:41:14.229365Z",
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
  "changed_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T10:41:12.192894Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "20499411-7d5d-45eb-9f6f-ceb44d97d6ac",
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
  "changed_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T10:41:14.596801789Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "97dd21b8-5b1c-4a0a-8b0f-cfd780b6d015",
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
  "last_heartbeat_at": "2026-10-29T10:41:14.229365Z",
  "last_location_at": "2026-10-29T10:41:14.229365Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/97dd21b8-5b1c-4a0a-8b0f-cfd780b6d015/close` → **200**

```json
{
  "command_id": "d882e5fb-99ae-46b0-8279-0e474db90589",
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
  "session_id": "d1dae416-2ee4-4feb-bdb4-102eb16becc0",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzEzNzUsImlhdCI6MTc5MzI3MDQ3NSwianRpIjoiNzcwMDJmZTAtNjZmMC00MmExLWJjMmYtMDRjMjgzZDUyOTQyIiwic2lkIjoiZDFkYWU0MTYtMmVlNC00ZmViLWJkYjQtMTAyZWIxNmJlY2MwIn0.Eh7Yt0pZtkB-eKwpC5lP1AzllgDq2SAnoVG-0tNe_MA",
  "access_expires_at": "2026-10-29T10:56:15.366090823Z",
  "refresh_token": "mz22zj52nb8XJxQGYzbvSfpuju0SDIjQJGfVGtJrrEY",
  "refresh_expires_at": "2026-10-29T22:41:15.365504386Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "79023b2e-f21c-4b83-82e1-b9be91ba442d",
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
  "id": "cd8ee30b-1ad4-4815-8657-641cbdbd9abf",
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
  "created_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "created_at": "2026-10-29T10:41:15.550076Z",
  "updated_at": "2026-10-29T10:41:15.550076Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630437450",
  "device_ref": "sandbox-18355"
}
```

```json
{
  "challenge_id": "cd09e953-4467-44df-861d-500acee1f964",
  "expires_at": "2026-10-29T10:46:15.746721725Z",
  "resend_available_at": "2026-10-29T10:41:16.746721725Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630437450` → **200**

```json
{
  "phone": "+380630437450",
  "audience": "CLIENT",
  "code": "507217",
  "sent_at": "2026-10-29T10:41:15.749990998Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd09e953-4467-44df-861d-500acee1f964",
  "code": "507217",
  "device_ref": "sandbox-18355"
}
```

```json
{
  "session_id": "e15eab54-05a6-4c89-a6fa-1e3e830a00e4",
  "subject": {
    "type": "CLIENT",
    "id": "977385e5-0685-4bd3-a39d-21307f980943"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NzczODVlNS0wNjg1LTRiZDMtYTM5ZC0yMTMwN2Y5ODA5NDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxMzc1LCJpYXQiOjE3OTMyNzA0NzUsImp0aSI6IjkwYTk2NDQ0LTk4ZWMtNDdmNi04NzY1LTU4MTExZmVjNzQ3YSIsInNpZCI6ImUxNWVhYjU0LTA1YTYtNGM4OS1hNmZhLTFlM2U4MzBhMDBlNCJ9.jzimuAWoVxIYfM8vfqcSQHbFimnBsR0yvWkIuEs2mSg",
  "access_expires_at": "2026-10-29T10:56:15.967008243Z",
  "refresh_token": "k1nzVePBqgAiVVtx2aOzMKe2EkATanLCh838jBBmA78",
  "refresh_expires_at": "2026-11-28T10:41:15.966405Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630437450` → **200**

```json
{
  "client_id": "977385e5-0685-4bd3-a39d-21307f980943"
}
```

`POST /api/admin/v1/rider-wallets/977385e5-0685-4bd3-a39d-21307f980943/top-ups` → **201**

```json
{
  "command_id": "b72568e4-f9d9-42e2-b156-09c9beeb09e9",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "977385e5-0685-4bd3-a39d-21307f980943",
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
      "id": "d03382db-97a5-456c-b409-d7b0b6323606",
      "at": "2026-10-29T10:41:16.338275Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "c8491122-a379-432e-880c-2c074e7909b2",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6684d875-d64c-4bbd-abea-2d5e1243e590",
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
  "id": "368c9a75-5548-4018-83f9-c5933585c4c9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:46:16.533761Z",
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
      "id": "cd8ee30b-1ad4-4815-8657-641cbdbd9abf",
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
  "device_ref": "sandbox-2782"
}
```

```json
{
  "challenge_id": "fce42d0f-2109-4a05-b3e8-f46aed4ec4c4",
  "expires_at": "2026-10-29T10:46:16.725335624Z",
  "resend_available_at": "2026-10-29T10:41:17.725335624Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "681959",
  "sent_at": "2026-10-29T10:41:16.729057588Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fce42d0f-2109-4a05-b3e8-f46aed4ec4c4",
  "code": "681959",
  "device_ref": "sandbox-2782"
}
```

```json
{
  "session_id": "06a84a2c-071d-404c-a130-22572093ea2d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTM3NiwiaWF0IjoxNzkzMjcwNDc2LCJqdGkiOiJkNGNlMTE5Zi0xNjExLTRkMWEtYWExMC1jYmI4OGJlYzNmMmYiLCJzaWQiOiIwNmE4NGEyYy0wNzFkLTQwNGMtYTEzMC0yMjU3MjA5M2VhMmQifQ.yEeq00VqllWjYSIPaw3Sjzt8bBljkDQRSBJANmJvNII",
  "access_expires_at": "2026-10-29T10:56:16.937483472Z",
  "refresh_token": "eQ5A8Ym32mO0mUacpzx6aQkfWx1PGvi074jAIX_bklM",
  "refresh_expires_at": "2026-11-28T10:41:16.937001627Z",
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
  "command_id": "ad6cda83-632b-43eb-8b51-c229c9a7b1ad",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:41:17Z",
    "sequence": 1793270477283
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e811665f-78a7-46fa-a577-cc9ef039341e",
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
  "last_heartbeat_at": "2026-10-29T10:41:17.405742Z",
  "last_location_at": "2026-10-29T10:41:17.405742Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f021a6c6-50ea-458c-a3d2-a7d06b325e9d",
  "quote_id": "368c9a75-5548-4018-83f9-c5933585c4c9",
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
  "id": "a6e7b62e-7d08-4791-88fe-876b52d7f51c",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "977385e5-0685-4bd3-a39d-21307f980943",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T10:41:17.67895Z",
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
  "client_id": "977385e5-0685-4bd3-a39d-21307f980943",
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
      "id": "d03382db-97a5-456c-b409-d7b0b6323606",
      "at": "2026-10-29T10:41:16.338275Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "c8491122-a379-432e-880c-2c074e7909b2",
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
    "id": "fc3017fa-9920-411d-bcee-78bb25cd0196",
    "order_id": "a6e7b62e-7d08-4791-88fe-876b52d7f51c",
    "expires_at": "2026-10-29T10:41:32.684701Z",
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

`POST /api/driver/v1/offers/fc3017fa-9920-411d-bcee-78bb25cd0196/accept` → **200**

```json
{
  "command_id": "d7357e38-cfd9-4dc0-b56a-ba2999c037dd"
}
```

```json
{
  "id": "cd616356-baf0-4a0a-a851-ff586d50ff72",
  "order_id": "a6e7b62e-7d08-4791-88fe-876b52d7f51c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "916abeaf-d8db-444e-b475-73871d8e633f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "916abeaf-d8db-444e-b475-73871d8e633f",
  "order_id": "a6e7b62e-7d08-4791-88fe-876b52d7f51c",
  "assignment_id": "cd616356-baf0-4a0a-a851-ff586d50ff72",
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

`POST /api/driver/v1/work-sessions/e811665f-78a7-46fa-a577-cc9ef039341e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:41:18Z",
    "sequence": 1793270478586
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e811665f-78a7-46fa-a577-cc9ef039341e",
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
  "last_heartbeat_at": "2026-10-29T10:41:18.603132Z",
  "last_location_at": "2026-10-29T10:41:18.603132Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/916abeaf-d8db-444e-b475-73871d8e633f/arrive` → **200**

```json
{
  "command_id": "24e62059-f096-414e-9d6a-ed00092940bb",
  "expected_version": 0
}
```

```json
{
  "id": "916abeaf-d8db-444e-b475-73871d8e633f",
  "order_id": "a6e7b62e-7d08-4791-88fe-876b52d7f51c",
  "assignment_id": "cd616356-baf0-4a0a-a851-ff586d50ff72",
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
  "arrived_at": "2026-10-29T10:41:18.787862Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/916abeaf-d8db-444e-b475-73871d8e633f/start` → **200**

```json
{
  "command_id": "f10790a3-2dd8-4550-acf9-bc765c179395",
  "expected_version": 1
}
```

```json
{
  "id": "916abeaf-d8db-444e-b475-73871d8e633f",
  "order_id": "a6e7b62e-7d08-4791-88fe-876b52d7f51c",
  "assignment_id": "cd616356-baf0-4a0a-a851-ff586d50ff72",
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
  "arrived_at": "2026-10-29T10:41:18.787862Z",
  "started_at": "2026-10-29T10:41:18.977523Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/916abeaf-d8db-444e-b475-73871d8e633f/complete` → **200**

```json
{
  "command_id": "8c4a1ac1-fcc7-4586-a94a-5abe6627e712",
  "expected_version": 2,
  "reported_at": "2026-10-29T10:41:19Z",
  "cash_received": true
}
```

```json
{
  "id": "916abeaf-d8db-444e-b475-73871d8e633f",
  "order_id": "a6e7b62e-7d08-4791-88fe-876b52d7f51c",
  "assignment_id": "cd616356-baf0-4a0a-a851-ff586d50ff72",
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
  "arrived_at": "2026-10-29T10:41:18.787862Z",
  "started_at": "2026-10-29T10:41:18.977523Z",
  "completed_at": "2026-10-29T10:41:19.178634Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "977385e5-0685-4bd3-a39d-21307f980943",
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
      "id": "3629f664-267b-42d1-9df5-e02533dd4b7a",
      "at": "2026-10-29T10:41:20.116859Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "a6e7b62e-7d08-4791-88fe-876b52d7f51c"
    },
    {
      "id": "d03382db-97a5-456c-b409-d7b0b6323606",
      "at": "2026-10-29T10:41:16.338275Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "c8491122-a379-432e-880c-2c074e7909b2",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/cd8ee30b-1ad4-4815-8657-641cbdbd9abf/archive` → **200**

```json
{
  "command_id": "05b22947-b454-4d3b-b7f3-864d5ae489e2",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "cd8ee30b-1ad4-4815-8657-641cbdbd9abf",
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
  "created_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "created_at": "2026-10-29T10:41:15.550076Z",
  "updated_at": "2026-10-29T10:41:22.552204Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e811665f-78a7-46fa-a577-cc9ef039341e",
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
  "last_heartbeat_at": "2026-10-29T10:41:18.603132Z",
  "last_location_at": "2026-10-29T10:41:18.603132Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e811665f-78a7-46fa-a577-cc9ef039341e/close` → **200**

```json
{
  "command_id": "1c0583e9-f20e-49f5-831d-520572944677",
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

Done: order a6e7b62e-7d08-4791-88fe-876b52d7f51c.

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
  "session_id": "54dea3b5-251d-48cc-8e01-d6ad3a9d1f9f",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzEzODMsImlhdCI6MTc5MzI3MDQ4MywianRpIjoiNDQ0ZmU1Y2MtYWI3ZS00NGRhLTk5MTAtYTFlYzcwMWJhYzgxIiwic2lkIjoiNTRkZWEzYjUtMjUxZC00OGNjLThlMDEtZDZhZDNhOWQxZjlmIn0.eKfSWsayZl1LxkqYiX5Hr-pTgxS_qAbsj0ar8D8uGCo",
  "access_expires_at": "2026-10-29T10:56:23.294846339Z",
  "refresh_token": "TJIQirKQkgELgaBps6UCEuy1hr9r6FZAAfpHeELYs1I",
  "refresh_expires_at": "2026-10-29T22:41:23.294479397Z",
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
  "command_id": "2a4b6158-8b9b-42c7-b688-27d273fffd73",
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
  "session_id": "d8fe6544-0fce-4282-9d53-6d0aa9ef6d66",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzEzODQsImlhdCI6MTc5MzI3MDQ4NCwianRpIjoiNjk1Yjk3YjctZDA5OS00NjZhLWJlOGUtNjY0ZTE3NmM3ZDhkIiwic2lkIjoiZDhmZTY1NDQtMGZjZS00MjgyLTlkNTMtNmQwYWE5ZWY2ZDY2In0.IMfiMY7c3sfAoJcE_cJ-z66HbQ14pz_Fvgf8PvnhbE8",
  "access_expires_at": "2026-10-29T10:56:24.030730554Z",
  "refresh_token": "e5XvUUuZx5POs3Dk_8Z4zeThlp_PwCZ9X3fhpQJpVpI",
  "refresh_expires_at": "2026-10-29T22:41:24.030186727Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1887925413",
    "linkedid": "1730052700.1887925413",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671308245"
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
    "id": "1730052700.1887925413",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "91f267a5-2e3c-4d61-b9bc-60fd7644737b",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380671308245",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T10:41:24.214966Z",
      "answered_at": null,
      "ended_at": "2026-10-29T10:41:24.235753Z",
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
    "id": "1730052600.156755976",
    "linkedid": "1730052600.156755976",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671308245"
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
      "id": "65b91525-80fb-4e33-a3cd-98bb6018fc9c",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671308245",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T10:41:24.457113Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/65b91525-80fb-4e33-a3cd-98bb6018fc9c/answer` → **200**

```json
{
  "command_id": "591a34ea-895b-4287-a8e8-1764151e2a3f"
}
```

```json
{
  "id": "65b91525-80fb-4e33-a3cd-98bb6018fc9c",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671308245",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "order_ids": [],
  "started_at": "2026-10-29T10:41:24.457113Z",
  "answered_at": "2026-10-29T10:41:24.666846Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.156755976",
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
    "id": "1730052600.156755976",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "65b91525-80fb-4e33-a3cd-98bb6018fc9c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671308245",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c8491122-a379-432e-880c-2c074e7909b2",
      "order_ids": [],
      "started_at": "2026-10-29T10:41:24.457113Z",
      "answered_at": "2026-10-29T10:41:24.666846Z",
      "ended_at": "2026-10-29T10:41:24.869832Z",
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
      "id": "65b91525-80fb-4e33-a3cd-98bb6018fc9c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671308245",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c8491122-a379-432e-880c-2c074e7909b2",
      "order_ids": [],
      "started_at": "2026-10-29T10:41:24.457113Z",
      "answered_at": "2026-10-29T10:41:24.666846Z",
      "ended_at": "2026-10-29T10:41:24.869832Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T10:41:25.895156Z"
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
      "id": "65b91525-80fb-4e33-a3cd-98bb6018fc9c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671308245",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c8491122-a379-432e-880c-2c074e7909b2",
      "order_ids": [],
      "started_at": "2026-10-29T10:41:24.457113Z",
      "answered_at": "2026-10-29T10:41:24.666846Z",
      "ended_at": "2026-10-29T10:41:24.869832Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T10:41:25.895156Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/65b91525-80fb-4e33-a3cd-98bb6018fc9c/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/65b91525-80fb-4e33-a3cd-98bb6018fc9c/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=65b91525-80fb-4e33-a3cd-98bb6018fc9c` → **200**

```json
{
  "changes": [
    {
      "id": "9ead77dc-d64d-48f8-9a79-37e576826f45",
      "occurred_at": "2026-10-29T10:41:27.467658Z",
      "actor_type": "STAFF",
      "actor_id": "c8491122-a379-432e-880c-2c074e7909b2",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "65b91525-80fb-4e33-a3cd-98bb6018fc9c",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"5c0b225e-5ed2-48a8-8be7-178b0fd72bdb\", \"order_ids\": []}",
      "correlation_id": "a586010c-c43f-4ce2-ad54-85712f235894"
    },
    {
      "id": "4e988ae2-669d-44c4-938d-b0cfb5588271",
      "occurred_at": "2026-10-29T10:41:27.442569Z",
      "actor_type": "STAFF",
      "actor_id": "c8491122-a379-432e-880c-2c074e7909b2",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "65b91525-80fb-4e33-a3cd-98bb6018fc9c",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"5c0b225e-5ed2-48a8-8be7-178b0fd72bdb\", \"order_ids\": []}",
      "correlation_id": "a06984dc-dcc6-44c9-9c02-1a2aadf9b918"
    }
  ]
}
```

Done: call 65b91525-80fb-4e33-a3cd-98bb6018fc9c recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20963"
}
```

```json
{
  "challenge_id": "fd1ded68-93a6-427e-a434-447cd2defa0f",
  "expires_at": "2026-10-29T10:46:27.689806351Z",
  "resend_available_at": "2026-10-29T10:41:28.689806351Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "931659",
  "sent_at": "2026-10-29T10:41:27.692988399Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd1ded68-93a6-427e-a434-447cd2defa0f",
  "code": "931659",
  "device_ref": "sandbox-20963"
}
```

```json
{
  "session_id": "b582eb39-8c59-451d-92a4-cea03429167f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTM4NywiaWF0IjoxNzkzMjcwNDg3LCJqdGkiOiIxZDg1Njk0Zi02OGI2LTQ2ZTQtODlhNy1kMTY0MTFhYjg0NzQiLCJzaWQiOiJiNTgyZWIzOS04YzU5LTQ1MWQtOTJhNC1jZWEwMzQyOTE2N2YifQ.iqwN1TT8N5TzKqnn50SJkBjBpszTV240w7Jr6O4b6Go",
  "access_expires_at": "2026-10-29T10:56:27.890172493Z",
  "refresh_token": "DfG-ZOxaNYBV-_9SvcbNn5FbsPKK9uTHE5mYWcachBw",
  "refresh_expires_at": "2026-11-28T10:41:27.889779973Z",
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
  "command_id": "12ecc1e8-0356-410c-88fa-20e6f5f98d77",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:41:28Z",
    "sequence": 1793270488248
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "994145f5-b366-48aa-92bc-df76ad7edd11",
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
  "last_heartbeat_at": "2026-10-29T10:41:28.265616Z",
  "last_location_at": "2026-10-29T10:41:28.265616Z",
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
  "session_id": "5904354b-01af-4a20-9f70-803530606bc9",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzEzODgsImlhdCI6MTc5MzI3MDQ4OCwianRpIjoiNzVjYmRiNGUtYTNhOC00NjI5LWI2OTctZTg4MjQwZjI2Yjg1Iiwic2lkIjoiNTkwNDM1NGItMDFhZi00YTIwLTlmNzAtODAzNTMwNjA2YmM5In0.xdc5kUPuPP4bl-Pu8IhyE-fz8BMR--32DzX_HYI5uU8",
  "access_expires_at": "2026-10-29T10:56:28.648064794Z",
  "refresh_token": "V5scgzRYFoocjPKFENOJIHoBlkk1Ug7fmqg6ni9QAZc",
  "refresh_expires_at": "2026-10-29T22:41:28.64760948Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "555cfc90-4e7b-4eee-846d-9749c7883016",
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
  "id": "d56e74cb-e5c6-40db-8e52-b39bb54962c0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:46:28.829863Z",
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
  "command_id": "afc7a2dd-9c7c-4dca-9987-f6ba086d2568",
  "quote_id": "d56e74cb-e5c6-40db-8e52-b39bb54962c0",
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
    "phone": "+380672345440"
  }
}
```

```json
{
  "id": "658de42b-8585-4c3b-aa05-a6b096907e22",
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
  "created_at": "2026-10-29T10:41:29.0272Z",
  "caller": {
    "name": "Олена",
    "phone": "+380672345440"
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
    "id": "6cec873b-06ae-4721-8176-59e2488499d4",
    "order_id": "658de42b-8585-4c3b-aa05-a6b096907e22",
    "expires_at": "2026-10-29T10:41:44.031644Z",
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

`POST /api/driver/v1/offers/6cec873b-06ae-4721-8176-59e2488499d4/accept` → **200**

```json
{
  "command_id": "b95da3fe-4d20-48e5-9d38-610929e9c637"
}
```

```json
{
  "id": "5d128799-7d14-4aa2-b9a3-b714524bf135",
  "order_id": "658de42b-8585-4c3b-aa05-a6b096907e22",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d999e97e-96e3-4fe8-badb-6c7cad72cce3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380672345440` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380672345440` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380672345440` → **200**

```json
[
  {
    "phone": "+380672345440",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T10:41:31.022994911Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380672345440` → **200**

```json
[
  {
    "phone": "+380672345440",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T10:41:31.022994911Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380672345440` → **200**

```json
[
  {
    "phone": "+380672345440",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T10:41:31.022994911Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d999e97e-96e3-4fe8-badb-6c7cad72cce3",
  "order_id": "658de42b-8585-4c3b-aa05-a6b096907e22",
  "assignment_id": "5d128799-7d14-4aa2-b9a3-b714524bf135",
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
    "phone": "+380672345440"
  }
}
```

`POST /api/driver/v1/work-sessions/994145f5-b366-48aa-92bc-df76ad7edd11/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:41:31Z",
    "sequence": 1793270491910
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "994145f5-b366-48aa-92bc-df76ad7edd11",
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
  "last_heartbeat_at": "2026-10-29T10:41:31.927465Z",
  "last_location_at": "2026-10-29T10:41:31.927465Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d999e97e-96e3-4fe8-badb-6c7cad72cce3/arrive` → **200**

```json
{
  "command_id": "e6972616-53c4-496c-be09-cf326306fa87",
  "expected_version": 0
}
```

```json
{
  "id": "d999e97e-96e3-4fe8-badb-6c7cad72cce3",
  "order_id": "658de42b-8585-4c3b-aa05-a6b096907e22",
  "assignment_id": "5d128799-7d14-4aa2-b9a3-b714524bf135",
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
  "arrived_at": "2026-10-29T10:41:32.121837Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380672345440"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380672345440` → **200**

```json
[
  {
    "phone": "+380672345440",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T10:41:31.022994911Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380672345440` → **200**

```json
[
  {
    "phone": "+380672345440",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T10:41:31.022994911Z"
  },
  {
    "phone": "+380672345440",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T10:41:33.029460461Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380672345440` → **200**

```json
[
  {
    "phone": "+380672345440",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T10:41:31.022994911Z"
  },
  {
    "phone": "+380672345440",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T10:41:33.029460461Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380672345440` → **200**

```json
[
  {
    "phone": "+380672345440",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T10:41:31.022994911Z"
  },
  {
    "phone": "+380672345440",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T10:41:33.029460461Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/d999e97e-96e3-4fe8-badb-6c7cad72cce3/start` → **200**

```json
{
  "command_id": "6db83e85-9d45-4889-ae9a-d68c04b50cb5",
  "expected_version": 1
}
```

```json
{
  "id": "d999e97e-96e3-4fe8-badb-6c7cad72cce3",
  "order_id": "658de42b-8585-4c3b-aa05-a6b096907e22",
  "assignment_id": "5d128799-7d14-4aa2-b9a3-b714524bf135",
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
  "arrived_at": "2026-10-29T10:41:32.121837Z",
  "started_at": "2026-10-29T10:41:33.401313Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380672345440"
  }
}
```

`POST /api/driver/v1/trips/d999e97e-96e3-4fe8-badb-6c7cad72cce3/complete` → **200**

```json
{
  "command_id": "34be563a-8fb2-4467-8c61-df9c213e032d",
  "expected_version": 2,
  "reported_at": "2026-10-29T10:41:33Z",
  "cash_received": true
}
```

```json
{
  "id": "d999e97e-96e3-4fe8-badb-6c7cad72cce3",
  "order_id": "658de42b-8585-4c3b-aa05-a6b096907e22",
  "assignment_id": "5d128799-7d14-4aa2-b9a3-b714524bf135",
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
  "arrived_at": "2026-10-29T10:41:32.121837Z",
  "started_at": "2026-10-29T10:41:33.401313Z",
  "completed_at": "2026-10-29T10:41:33.606657Z",
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
  "session_id": "994145f5-b366-48aa-92bc-df76ad7edd11",
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
  "last_heartbeat_at": "2026-10-29T10:41:31.927465Z",
  "last_location_at": "2026-10-29T10:41:31.927465Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/994145f5-b366-48aa-92bc-df76ad7edd11/close` → **200**

```json
{
  "command_id": "896a86b6-6deb-4beb-bbac-321095ddb3b4",
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
  "phone": "+380633298348",
  "device_ref": "sandbox-14917"
}
```

```json
{
  "challenge_id": "0684f2cc-59c1-4950-b766-2d9e96f9c303",
  "expires_at": "2026-10-29T10:46:34.166284698Z",
  "resend_available_at": "2026-10-29T10:41:35.166284698Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633298348` → **200**

```json
{
  "phone": "+380633298348",
  "audience": "CLIENT",
  "code": "672336",
  "sent_at": "2026-10-29T10:41:34.169459951Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0684f2cc-59c1-4950-b766-2d9e96f9c303",
  "code": "672336",
  "device_ref": "sandbox-14917"
}
```

```json
{
  "session_id": "3317415f-99f8-4cb5-a5de-e9dd115024f8",
  "subject": {
    "type": "CLIENT",
    "id": "459b3a0f-3bb2-41ca-8d94-6cb563dd849a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NTliM2EwZi0zYmIyLTQxY2EtOGQ5NC02Y2I1NjNkZDg0OWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxMzk0LCJpYXQiOjE3OTMyNzA0OTQsImp0aSI6ImNjN2I4YWUwLWNmOTYtNGI2ZC04Y2Q4LWMzZDAwOGRkMDQwYSIsInNpZCI6IjMzMTc0MTVmLTk5ZjgtNGNiNS1hNWRlLWU5ZGQxMTUwMjRmOCJ9.ZkjDKBO1lNGvnKrTB84g4suhexmssYuOpLiX3BPznsM",
  "access_expires_at": "2026-10-29T10:56:34.379020902Z",
  "refresh_token": "9iWrP8jqGoO__Y7zbRlHUZNr1H6SepP_2rm9qqBDmpE",
  "refresh_expires_at": "2026-11-28T10:41:34.378687451Z",
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
  "device_ref": "sandbox-4259"
}
```

```json
{
  "challenge_id": "462db276-d9e5-4b3a-9251-e09a2aff5772",
  "expires_at": "2026-10-29T10:46:34.730058232Z",
  "resend_available_at": "2026-10-29T10:41:35.730058232Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "547280",
  "sent_at": "2026-10-29T10:41:34.7325719Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "462db276-d9e5-4b3a-9251-e09a2aff5772",
  "code": "547280",
  "device_ref": "sandbox-4259"
}
```

```json
{
  "session_id": "d0e795cd-d075-4388-80c1-72c78f503708",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTM5NCwiaWF0IjoxNzkzMjcwNDk0LCJqdGkiOiIwZTVjM2RlMy05NmIzLTQyZGEtOTczYy1iNmEwMDRlOTg0YjgiLCJzaWQiOiJkMGU3OTVjZC1kMDc1LTQzODgtODBjMS03MmM3OGY1MDM3MDgifQ.afBkSYkpLf7OIuw15IC83n4mtcMkFye6SQJtKooq6Io",
  "access_expires_at": "2026-10-29T10:56:34.93081142Z",
  "refresh_token": "-rSg5k_ON91VBzMX0zPb12YJKyT3SeasveEUdt09LU0",
  "refresh_expires_at": "2026-11-28T10:41:34.930393883Z",
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
  "session_id": "44d31e97-1b8e-4cee-ad59-863948d7c498",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzEzOTUsImlhdCI6MTc5MzI3MDQ5NSwianRpIjoiOTAwZmViZjgtZmM2Ny00ZmE1LTljNTItM2I4ODk0ZmYwNzA3Iiwic2lkIjoiNDRkMzFlOTctMWI4ZS00Y2VlLWFkNTktODYzOTQ4ZDdjNDk4In0.60ZqmUJtHn7LNs8qjZxWT69x4cEleIdq3u8llwAHiLY",
  "access_expires_at": "2026-10-29T10:56:35.481225104Z",
  "refresh_token": "mHw1OOWQS6zVFRbHEHm_4huIZrL1U5Jd0wpP-Fj9Bzk",
  "refresh_expires_at": "2026-10-29T22:41:35.480895168Z",
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
  "session_id": "62568ab1-f35e-4eff-9708-486ca13d291c",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzEzOTUsImlhdCI6MTc5MzI3MDQ5NSwianRpIjoiMmQzMGU5N2UtM2Q3YS00NmE2LWFlMzktZDczMjAxMDQ3NTQyIiwic2lkIjoiNjI1NjhhYjEtZjM1ZS00ZWZmLTk3MDgtNDg2Y2ExM2QyOTFjIn0.DJZ2jjUSknMt260Igznx04RssPXjgnUl7URty89eFdY",
  "access_expires_at": "2026-10-29T10:56:35.866104967Z",
  "refresh_token": "_rKcqCNC3PyHvCmisQfGaurKAAKBLXmEOTwo8t-wOik",
  "refresh_expires_at": "2026-10-29T22:41:35.865209812Z",
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
  "command_id": "3755a95e-1050-46d6-9b5a-470b268170f1",
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
  "id": "92e31f9f-2cd1-4736-a84c-2422a8ed87d9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:46:36.241440Z",
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
  "command_id": "a229b194-7def-445f-8632-4a8d19695f05",
  "quote_id": "92e31f9f-2cd1-4736-a84c-2422a8ed87d9",
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
  "id": "615f5be0-a588-46da-8e2e-78c58a112519",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "459b3a0f-3bb2-41ca-8d94-6cb563dd849a",
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
  "created_at": "2026-10-29T10:41:36.439025Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/615f5be0-a588-46da-8e2e-78c58a112519` → **200**

```json
{
  "id": "615f5be0-a588-46da-8e2e-78c58a112519",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "459b3a0f-3bb2-41ca-8d94-6cb563dd849a",
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
  "created_at": "2026-10-29T10:41:36.439025Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/615f5be0-a588-46da-8e2e-78c58a112519/cancel` → **200**

```json
{
  "command_id": "b5af2774-b591-489b-9240-55a6f87f6bb7",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "615f5be0-a588-46da-8e2e-78c58a112519",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "459b3a0f-3bb2-41ca-8d94-6cb563dd849a",
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
  "created_at": "2026-10-29T10:41:36.439025Z",
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
  "command_id": "dc78bb0f-e6dc-49cc-b1d3-01182c4d3ce1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:41:37Z",
    "sequence": 1793270497210
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "27827200-624b-4b45-9cb9-cfe6ea82afdc",
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
  "last_heartbeat_at": "2026-10-29T10:41:37.23451Z",
  "last_location_at": "2026-10-29T10:41:37.23451Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-1910"
}
```

```json
{
  "challenge_id": "fa5f1ef2-d4db-477b-9878-9e5ee424dcd0",
  "expires_at": "2026-10-29T10:46:37.411222793Z",
  "resend_available_at": "2026-10-29T10:41:38.411222793Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "728416",
  "sent_at": "2026-10-29T10:41:37.413670181Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fa5f1ef2-d4db-477b-9878-9e5ee424dcd0",
  "code": "728416",
  "device_ref": "sandbox-1910"
}
```

```json
{
  "session_id": "bffd9136-a7c4-4662-b729-d5fb40a4a86f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTM5NywiaWF0IjoxNzkzMjcwNDk3LCJqdGkiOiIwNjU1NmZhMC0xZmQ0LTQ4MzEtYTgwMS0zYjc2ZGEzNTE3OGEiLCJzaWQiOiJiZmZkOTEzNi1hN2M0LTQ2NjItYjcyOS1kNWZiNDBhNGE4NmYifQ._fq53M4GbQZT207GtAmmopaO6pSRkTZuUkKCBw0_jyo",
  "access_expires_at": "2026-10-29T10:56:37.650571618Z",
  "refresh_token": "DVrZy9QteQI8TtrVRBEvLu3MTb9TufJ7yyXz5aMcyHQ",
  "refresh_expires_at": "2026-11-28T10:41:37.650132168Z",
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
  "command_id": "55f22e79-047e-4bd6-bb3c-4c8c0dc3bd63",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:41:38Z",
    "sequence": 1793270498680
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f7407e95-b943-42f0-aee0-3b3796b1d307",
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
  "last_heartbeat_at": "2026-10-29T10:41:38.02366Z",
  "last_location_at": "2026-10-29T10:41:38.02366Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e1de5069-5d8f-44f8-a04b-302a69078b54",
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
  "id": "e3697343-6730-4056-90de-2d101c750e38",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:46:38.216435Z",
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
  "command_id": "ba8a50b4-29f5-4e01-be9d-68d7284f76c8",
  "quote_id": "e3697343-6730-4056-90de-2d101c750e38",
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
  "id": "44c9829f-8521-4e50-b3fc-8e7d59f0a808",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "459b3a0f-3bb2-41ca-8d94-6cb563dd849a",
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
  "created_at": "2026-10-29T10:41:38.433394Z",
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
    "id": "4726d076-4e57-4811-8b99-019080d1a9e3",
    "order_id": "44c9829f-8521-4e50-b3fc-8e7d59f0a808",
    "expires_at": "2026-10-29T10:41:53.436147Z",
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

`POST /api/driver/v1/offers/4726d076-4e57-4811-8b99-019080d1a9e3/accept` → **200**

```json
{
  "command_id": "e5cf9e6d-1bc8-414c-99d8-f6b4440ae63c"
}
```

```json
{
  "id": "a5c3172f-8ab2-4635-b01c-c312ad67e99b",
  "order_id": "44c9829f-8521-4e50-b3fc-8e7d59f0a808",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "94e62184-5e10-4500-be70-5460a9311c1d",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "94e62184-5e10-4500-be70-5460a9311c1d",
  "order_id": "44c9829f-8521-4e50-b3fc-8e7d59f0a808",
  "assignment_id": "a5c3172f-8ab2-4635-b01c-c312ad67e99b",
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

`POST /api/driver/v1/trips/94e62184-5e10-4500-be70-5460a9311c1d/cancel` → **200**

```json
{
  "command_id": "da628d1e-a4fd-4e2c-b0a7-0c1601c72c98",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "94e62184-5e10-4500-be70-5460a9311c1d",
  "order_id": "44c9829f-8521-4e50-b3fc-8e7d59f0a808",
  "assignment_id": "a5c3172f-8ab2-4635-b01c-c312ad67e99b",
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

`GET /api/rider/v1/orders/44c9829f-8521-4e50-b3fc-8e7d59f0a808` → **200**

```json
{
  "id": "44c9829f-8521-4e50-b3fc-8e7d59f0a808",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "459b3a0f-3bb2-41ca-8d94-6cb563dd849a",
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
    "id": "a5c3172f-8ab2-4635-b01c-c312ad67e99b",
    "order_id": "44c9829f-8521-4e50-b3fc-8e7d59f0a808",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "94e62184-5e10-4500-be70-5460a9311c1d",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T10:41:38.433394Z",
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
    "id": "6e6679d4-5be1-4a92-876d-ba592d9d6865",
    "order_id": "44c9829f-8521-4e50-b3fc-8e7d59f0a808",
    "expires_at": "2026-10-29T10:41:54.172511Z",
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

`POST /api/driver/v1/offers/6e6679d4-5be1-4a92-876d-ba592d9d6865/accept` → **200**

```json
{
  "command_id": "c971574c-cbec-491e-a0bf-4af261ed1f19"
}
```

```json
{
  "id": "0bc3b685-f39c-48d0-a02e-8f4b136ecd08",
  "order_id": "44c9829f-8521-4e50-b3fc-8e7d59f0a808",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "22382622-5f5d-4a3a-8a6b-0daad398f5b8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "22382622-5f5d-4a3a-8a6b-0daad398f5b8",
  "order_id": "44c9829f-8521-4e50-b3fc-8e7d59f0a808",
  "assignment_id": "0bc3b685-f39c-48d0-a02e-8f4b136ecd08",
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

`POST /api/driver/v1/trips/22382622-5f5d-4a3a-8a6b-0daad398f5b8/cancel` → **200**

```json
{
  "command_id": "50e2f5e3-316a-4388-862a-d7b21c746739",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "22382622-5f5d-4a3a-8a6b-0daad398f5b8",
  "order_id": "44c9829f-8521-4e50-b3fc-8e7d59f0a808",
  "assignment_id": "0bc3b685-f39c-48d0-a02e-8f4b136ecd08",
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
    "id": "44c9829f-8521-4e50-b3fc-8e7d59f0a808",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T10:41:38.433394Z",
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
    "id": "615f5be0-a588-46da-8e2e-78c58a112519",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T10:41:36.439025Z",
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

`GET /api/operator/v1/orders/44c9829f-8521-4e50-b3fc-8e7d59f0a808/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T10:41:38.433929Z",
      "actor": {
        "type": "CLIENT",
        "id": "459b3a0f-3bb2-41ca-8d94-6cb563dd849a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "44c9829f-8521-4e50-b3fc-8e7d59f0a808",
        "quote_id": "e3697343-6730-4056-90de-2d101c750e38",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "f99fb852-6ab1-4e5f-a149-d8ecb8db5257"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T10:41:38.435505Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "44c9829f-8521-4e50-b3fc-8e7d59f0a808",
        "attempt_id": "60ded455-c8b7-4cf4-bfb0-726a27947dd7",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f99fb852-6ab1-4e5f-a149-d8ecb8db5257"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T10:41:38.440451Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "4726d076-4e57-4811-8b99-019080d1a9e3",
        "order_id": "44c9829f-8521-4e50-b3fc-8e7d59f0a808",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "f99fb852-6ab1-4e5f-a149-d8ecb8db5257"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T10:41:38.804886Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "4726d076-4e57-4811-8b99-019080d1a9e3",
        "order_id": "44c9829f-8521-4e50-b3fc-8e7d59f0a808",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "a5c3172f-8ab2-4635-b01c-c312ad67e99b"
      },
      "correlation_id": "df075fc5-fc6b-41a2-9dfc-dda90b9801b6"
```

Done: orders 615f5be0-a588-46da-8e2e-78c58a112519, 44c9829f-8521-4e50-b3fc-8e7d59f0a808.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735975387",
  "device_ref": "sandbox-30641"
}
```

```json
{
  "challenge_id": "4624e35c-f643-4b65-955b-b9f41fc8e641",
  "expires_at": "2026-10-29T10:46:40.714390417Z",
  "resend_available_at": "2026-10-29T10:41:41.714390417Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735975387` → **200**

```json
{
  "phone": "+380735975387",
  "audience": "CLIENT",
  "code": "197647",
  "sent_at": "2026-10-29T10:41:40.716930185Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4624e35c-f643-4b65-955b-b9f41fc8e641",
  "code": "197647",
  "device_ref": "sandbox-30641"
}
```

```json
{
  "session_id": "879e668f-13a2-40e2-b74c-9da822f3f58f",
  "subject": {
    "type": "CLIENT",
    "id": "2d429069-e205-40d6-a7dd-ecebf143df29"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZDQyOTA2OS1lMjA1LTQwZDYtYTdkZC1lY2ViZjE0M2RmMjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNDAwLCJpYXQiOjE3OTMyNzA1MDAsImp0aSI6IjA5NDY5ZDljLWQ2ZTctNDhlMi04M2EyLTE1NzRhOWY3ZjcyOCIsInNpZCI6Ijg3OWU2NjhmLTEzYTItNDBlMi1iNzRjLTlkYTgyMmYzZjU4ZiJ9.nfpiLlbJiErp7Ml3tXGBndXtIyf8VVJc7W4SkgNRy0U",
  "access_expires_at": "2026-10-29T10:56:40.926775365Z",
  "refresh_token": "zN6Fgmb-gHMbeImMzM8bw5YkoviYFSlHpcmdCTO3uPM",
  "refresh_expires_at": "2026-11-28T10:41:40.926395183Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "a1e86a90-0605-4e20-87de-6b054490cf99",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "22d5b999-ddb6-47ff-b472-377b506304a3",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-22d5b999-ddb6-47ff-b472-377b506304a3",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "7d271d1fe0e367f480412ca3711f91e8",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=22d5b999-ddb6-47ff-b472-377b506304a3",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735975387"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=22d5b999-ddb6-47ff-b472-377b506304a3",
  "expires_at": "2026-10-29T11:11:41.122513Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/22d5b999-ddb6-47ff-b472-377b506304a3` → **200**

```json
{
  "id": "22d5b999-ddb6-47ff-b472-377b506304a3",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T11:11:41.122513Z",
  "card": {
    "id": "baa63259-b061-4f84-83d1-7613b79ed647",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6580",
    "card_type": "Visa",
    "created_at": "2026-10-29T10:41:41.318197Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "baa63259-b061-4f84-83d1-7613b79ed647",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****6580",
      "card_type": "Visa",
      "created_at": "2026-10-29T10:41:41.318197Z"
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
  "device_ref": "sandbox-31747"
}
```

```json
{
  "challenge_id": "8d385f97-bdfd-4c6d-8f57-18efff50cb12",
  "expires_at": "2026-10-29T10:46:41.699283851Z",
  "resend_available_at": "2026-10-29T10:41:42.699283851Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "794639",
  "sent_at": "2026-10-29T10:41:41.702044008Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8d385f97-bdfd-4c6d-8f57-18efff50cb12",
  "code": "794639",
  "device_ref": "sandbox-31747"
}
```

```json
{
  "session_id": "31d2563d-ba53-4fc8-b712-0440812ae695",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTQwMSwiaWF0IjoxNzkzMjcwNTAxLCJqdGkiOiIwOWJmNGQxYy01NmZmLTQ2ZGEtOTk4NS0yMDRkZWE4ZDlmNDkiLCJzaWQiOiIzMWQyNTYzZC1iYTUzLTRmYzgtYjcxMi0wNDQwODEyYWU2OTUifQ.FDr49Bki21JSgZXbO9Wgj7QklwhfON6k78EMx5l2fuc",
  "access_expires_at": "2026-10-29T10:56:41.912050824Z",
  "refresh_token": "PfIw1SXAwgY9dfY-9T4HdHgyY5WCrWKF-gOGArb-_vY",
  "refresh_expires_at": "2026-11-28T10:41:41.911687428Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f7407e95-b943-42f0-aee0-3b3796b1d307",
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
  "last_heartbeat_at": "2026-10-29T10:41:38.02366Z",
  "last_location_at": "2026-10-29T10:41:38.02366Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f7407e95-b943-42f0-aee0-3b3796b1d307/handover` → **200**

```json
{
  "command_id": "aa5e5c4e-4fe5-46a1-afd0-5ccffd9cf4bd",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f7407e95-b943-42f0-aee0-3b3796b1d307",
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
  "last_heartbeat_at": "2026-10-29T10:41:38.02366Z",
  "last_location_at": "2026-10-29T10:41:38.02366Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f7407e95-b943-42f0-aee0-3b3796b1d307/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:41:42Z",
    "sequence": 1793270502472
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f7407e95-b943-42f0-aee0-3b3796b1d307",
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
  "last_heartbeat_at": "2026-10-29T10:41:42.489393Z",
  "last_location_at": "2026-10-29T10:41:42.489393Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "580bdef2-adae-4b38-b66c-7738a79fd370",
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
  "id": "b8be2d11-2430-44e2-9dcf-f14b8117316e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:46:42.686639Z",
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
  "command_id": "cc41325d-45f3-4a56-903f-6f8005afa5be",
  "quote_id": "b8be2d11-2430-44e2-9dcf-f14b8117316e",
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
  "id": "736fb2e6-9138-4df6-b998-70e37209dab8",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2d429069-e205-40d6-a7dd-ecebf143df29",
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
  "created_at": "2026-10-29T10:41:42.896937Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/736fb2e6-9138-4df6-b998-70e37209dab8` → **200**

```json
{
  "id": "736fb2e6-9138-4df6-b998-70e37209dab8",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2d429069-e205-40d6-a7dd-ecebf143df29",
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
  "created_at": "2026-10-29T10:41:42.896937Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/736fb2e6-9138-4df6-b998-70e37209dab8` → **200**

```json
{
  "id": "736fb2e6-9138-4df6-b998-70e37209dab8",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2d429069-e205-40d6-a7dd-ecebf143df29",
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
  "created_at": "2026-10-29T10:41:42.896937Z",
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
    "id": "27048569-9c13-4d27-99a8-7998d6dd91eb",
    "order_id": "736fb2e6-9138-4df6-b998-70e37209dab8",
    "expires_at": "2026-10-29T10:41:58.264581Z",
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

`POST /api/driver/v1/offers/27048569-9c13-4d27-99a8-7998d6dd91eb/accept` → **200**

```json
{
  "command_id": "3eacffa4-55d1-44b0-81c2-5883f24fa434"
}
```

```json
{
  "id": "c6d0784a-9ec1-4c16-907a-7cec9a7da807",
  "order_id": "736fb2e6-9138-4df6-b998-70e37209dab8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "94caa28a-f273-4fc4-9279-5620f956f2fe",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "94caa28a-f273-4fc4-9279-5620f956f2fe",
  "order_id": "736fb2e6-9138-4df6-b998-70e37209dab8",
  "assignment_id": "c6d0784a-9ec1-4c16-907a-7cec9a7da807",
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

`POST /api/driver/v1/work-sessions/f7407e95-b943-42f0-aee0-3b3796b1d307/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:41:45Z",
    "sequence": 1793270505897
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f7407e95-b943-42f0-aee0-3b3796b1d307",
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
  "last_heartbeat_at": "2026-10-29T10:41:45.106986Z",
  "last_location_at": "2026-10-29T10:41:45.106986Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/94caa28a-f273-4fc4-9279-5620f956f2fe/arrive` → **200**

```json
{
  "command_id": "7e638415-3daf-4534-a8ea-bc11bc164959",
  "expected_version": 0
}
```

```json
{
  "id": "94caa28a-f273-4fc4-9279-5620f956f2fe",
  "order_id": "736fb2e6-9138-4df6-b998-70e37209dab8",
  "assignment_id": "c6d0784a-9ec1-4c16-907a-7cec9a7da807",
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
  "arrived_at": "2026-10-29T10:41:45.298193Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/94caa28a-f273-4fc4-9279-5620f956f2fe/start` → **200**

```json
{
  "command_id": "36cde0a3-0abf-4a2a-ba42-698f34125a94",
  "expected_version": 1
}
```

```json
{
  "id": "94caa28a-f273-4fc4-9279-5620f956f2fe",
  "order_id": "736fb2e6-9138-4df6-b998-70e37209dab8",
  "assignment_id": "c6d0784a-9ec1-4c16-907a-7cec9a7da807",
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
  "arrived_at": "2026-10-29T10:41:45.298193Z",
  "started_at": "2026-10-29T10:41:45.494093Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/94caa28a-f273-4fc4-9279-5620f956f2fe/complete` → **200**

```json
{
  "command_id": "de5ab1e9-90cd-430a-8fea-1430fae747ae",
  "expected_version": 2,
  "reported_at": "2026-10-29T10:41:45Z",
  "cash_received": true
}
```

```json
{
  "id": "94caa28a-f273-4fc4-9279-5620f956f2fe",
  "order_id": "736fb2e6-9138-4df6-b998-70e37209dab8",
  "assignment_id": "c6d0784a-9ec1-4c16-907a-7cec9a7da807",
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
  "arrived_at": "2026-10-29T10:41:45.298193Z",
  "started_at": "2026-10-29T10:41:45.494093Z",
  "completed_at": "2026-10-29T10:41:45.696542Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/736fb2e6-9138-4df6-b998-70e37209dab8` → **200**

```json
{
  "id": "736fb2e6-9138-4df6-b998-70e37209dab8",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "2d429069-e205-40d6-a7dd-ecebf143df29",
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
    "id": "c6d0784a-9ec1-4c16-907a-7cec9a7da807",
    "order_id": "736fb2e6-9138-4df6-b998-70e37209dab8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "94caa28a-f273-4fc4-9279-5620f956f2fe",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T10:41:42.896937Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/736fb2e6-9138-4df6-b998-70e37209dab8` → **200**

```json
{
  "id": "736fb2e6-9138-4df6-b998-70e37209dab8",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "2d429069-e205-40d6-a7dd-ecebf143df29",
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
    "id": "c6d0784a-9ec1-4c16-907a-7cec9a7da807",
    "order_id": "736fb2e6-9138-4df6-b998-70e37209dab8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "94caa28a-f273-4fc4-9279-5620f956f2fe",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T10:41:42.896937Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/736fb2e6-9138-4df6-b998-70e37209dab8` → **200**

```json
{
  "id": "736fb2e6-9138-4df6-b998-70e37209dab8",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "2d429069-e205-40d6-a7dd-ecebf143df29",
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
    "id": "c6d0784a-9ec1-4c16-907a-7cec9a7da807",
    "order_id": "736fb2e6-9138-4df6-b998-70e37209dab8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "94caa28a-f273-4fc4-9279-5620f956f2fe",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T10:41:42.896937Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/736fb2e6-9138-4df6-b998-70e37209dab8` → **200**

```json
{
  "id": "736fb2e6-9138-4df6-b998-70e37209dab8",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "2d429069-e205-40d6-a7dd-ecebf143df29",
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
    "id": "c6d0784a-9ec1-4c16-907a-7cec9a7da807",
    "order_id": "736fb2e6-9138-4df6-b998-70e37209dab8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "94caa28a-f273-4fc4-9279-5620f956f2fe",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T10:41:42.896937Z",
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

`GET /api/rider/v1/orders/736fb2e6-9138-4df6-b998-70e37209dab8/tip` → **200**

```json
{
  "order_id": "736fb2e6-9138-4df6-b998-70e37209dab8",
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
  "available_until": "2026-10-30T10:41:45.696542Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/736fb2e6-9138-4df6-b998-70e37209dab8/tip` → **201**

```json
{
  "command_id": "b57337c0-0334-4593-89d9-e6f25ae2b8fb",
  "amount_minor": 2500
}
```

```json
{
  "id": "14f9b4a2-e935-4eb9-ba85-41fb74fc2319",
  "order_id": "736fb2e6-9138-4df6-b998-70e37209dab8",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T10:41:50.040424Z"
}
```

`GET /api/rider/v1/orders/736fb2e6-9138-4df6-b998-70e37209dab8/tip` → **200**

```json
{
  "order_id": "736fb2e6-9138-4df6-b998-70e37209dab8",
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
  "available_until": "2026-10-30T10:41:45.696542Z",
  "open": false,
  "tip": {
    "id": "14f9b4a2-e935-4eb9-ba85-41fb74fc2319",
    "order_id": "736fb2e6-9138-4df6-b998-70e37209dab8",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T10:41:50.040424Z"
  }
}
```

`GET /api/rider/v1/orders/736fb2e6-9138-4df6-b998-70e37209dab8/tip` → **200**

```json
{
  "order_id": "736fb2e6-9138-4df6-b998-70e37209dab8",
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
  "available_until": "2026-10-30T10:41:45.696542Z",
  "open": false,
  "tip": {
    "id": "14f9b4a2-e935-4eb9-ba85-41fb74fc2319",
    "order_id": "736fb2e6-9138-4df6-b998-70e37209dab8",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T10:41:50.040424Z"
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
      "id": "1d716e4f-afed-4651-868d-254a833cc9ab",
      "at": "2026-10-29T10:41:51.354853Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "736fb2e6-9138-4df6-b998-70e37209dab8",
      "counterpart_id": null
    },
    {
      "id": "1f4f0f72-37fa-45bd-8779-490231e2a9c1",
      "at": "2026-10-29T10:41:46.303569Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "736fb2e6-9138-4df6-b998-70e37209dab8",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8b0ddf4f-46ee-4936-9a41-e4a2e8cb068a",
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
  "id": "85915cee-ab69-49f1-b06a-ac71bdc69be8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:46:51.760011Z",
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
  "session_id": "36beb34c-2975-42a7-96e4-559472f23e31",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE0MTIsImlhdCI6MTc5MzI3MDUxMiwianRpIjoiYWYxMzMwMTgtMDhkOC00OWZjLWIyODItNThjMzNmYTVmMzYwIiwic2lkIjoiMzZiZWIzNGMtMjk3NS00MmE3LTk2ZTQtNTU5NDcyZjIzZTMxIn0.k2upHd6UFrMy4dJVv8qUZdW-7UUoftgDaL0WZXO9qqs",
  "access_expires_at": "2026-10-29T10:56:52.136705885Z",
  "refresh_token": "lPGqIv_6KDvBn4Fg2p-4xiySrtW_kVTtpWlTkTvABgw",
  "refresh_expires_at": "2026-10-29T22:41:52.136332985Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380735975387` → **200**

```json
{
  "client_id": "2d429069-e205-40d6-a7dd-ecebf143df29"
}
```

`POST /api/admin/v1/rider-wallets/2d429069-e205-40d6-a7dd-ecebf143df29/top-ups` → **201**

```json
{
  "command_id": "13513fe7-b8b9-47fd-9600-72e07c524c48",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "2d429069-e205-40d6-a7dd-ecebf143df29",
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
      "id": "a0081c2f-1f9c-4080-b069-1b802e8f39bc",
      "at": "2026-10-29T10:41:52.482011Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "c8491122-a379-432e-880c-2c074e7909b2",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b618fcfa-5f4f-4f60-bb0d-0fa58f541a6d",
  "quote_id": "85915cee-ab69-49f1-b06a-ac71bdc69be8",
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
  "id": "1f5da1b8-a0d7-4634-abbe-82b574a08325",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d429069-e205-40d6-a7dd-ecebf143df29",
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
  "created_at": "2026-10-29T10:41:52.663814Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1f5da1b8-a0d7-4634-abbe-82b574a08325` → **200**

```json
{
  "id": "1f5da1b8-a0d7-4634-abbe-82b574a08325",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d429069-e205-40d6-a7dd-ecebf143df29",
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
  "created_at": "2026-10-29T10:41:52.663814Z",
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
    "id": "0b78e6ae-aa83-44e9-9289-e2d59f746ab4",
    "order_id": "1f5da1b8-a0d7-4634-abbe-82b574a08325",
    "expires_at": "2026-10-29T10:42:07.666984Z",
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

`POST /api/driver/v1/offers/0b78e6ae-aa83-44e9-9289-e2d59f746ab4/accept` → **200**

```json
{
  "command_id": "86727168-8ada-4799-b52e-e06b5723e699"
}
```

```json
{
  "id": "2b1b51dc-e215-45c9-9d07-88434b629827",
  "order_id": "1f5da1b8-a0d7-4634-abbe-82b574a08325",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f66d387a-5952-4f71-b688-fceb6b081350",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f66d387a-5952-4f71-b688-fceb6b081350",
  "order_id": "1f5da1b8-a0d7-4634-abbe-82b574a08325",
  "assignment_id": "2b1b51dc-e215-45c9-9d07-88434b629827",
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

`POST /api/driver/v1/work-sessions/f7407e95-b943-42f0-aee0-3b3796b1d307/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:41:53Z",
    "sequence": 1793270513564
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f7407e95-b943-42f0-aee0-3b3796b1d307",
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
  "last_heartbeat_at": "2026-10-29T10:41:53.581836Z",
  "last_location_at": "2026-10-29T10:41:53.581836Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f66d387a-5952-4f71-b688-fceb6b081350/arrive` → **200**

```json
{
  "command_id": "212f3ce4-52cb-412b-8d86-8072290b55ac",
  "expected_version": 0
}
```

```json
{
  "id": "f66d387a-5952-4f71-b688-fceb6b081350",
  "order_id": "1f5da1b8-a0d7-4634-abbe-82b574a08325",
  "assignment_id": "2b1b51dc-e215-45c9-9d07-88434b629827",
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
  "arrived_at": "2026-10-29T10:41:53.767048Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f66d387a-5952-4f71-b688-fceb6b081350/start` → **200**

```json
{
  "command_id": "df4b1bec-b373-4099-9a29-1ac7e92a83bd",
  "expected_version": 1
}
```

```json
{
  "id": "f66d387a-5952-4f71-b688-fceb6b081350",
  "order_id": "1f5da1b8-a0d7-4634-abbe-82b574a08325",
  "assignment_id": "2b1b51dc-e215-45c9-9d07-88434b629827",
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
  "arrived_at": "2026-10-29T10:41:53.767048Z",
  "started_at": "2026-10-29T10:41:53.952691Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f66d387a-5952-4f71-b688-fceb6b081350/complete` → **200**

```json
{
  "command_id": "f79f2f5d-37a2-4e5f-bc2d-afc643cf8904",
  "expected_version": 2,
  "reported_at": "2026-10-29T10:41:54Z",
  "cash_received": true
}
```

```json
{
  "id": "f66d387a-5952-4f71-b688-fceb6b081350",
  "order_id": "1f5da1b8-a0d7-4634-abbe-82b574a08325",
  "assignment_id": "2b1b51dc-e215-45c9-9d07-88434b629827",
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
  "arrived_at": "2026-10-29T10:41:53.767048Z",
  "started_at": "2026-10-29T10:41:53.952691Z",
  "completed_at": "2026-10-29T10:41:54.144594Z",
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
  "client_id": "2d429069-e205-40d6-a7dd-ecebf143df29",
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
      "id": "a0081c2f-1f9c-4080-b069-1b802e8f39bc",
      "at": "2026-10-29T10:41:52.482011Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "c8491122-a379-432e-880c-2c074e7909b2",
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

`GET /api/rider/v1/orders/1f5da1b8-a0d7-4634-abbe-82b574a08325/tip` → **200**

```json
{
  "order_id": "1f5da1b8-a0d7-4634-abbe-82b574a08325",
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
  "available_until": "2026-10-30T10:41:54.144594Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/1f5da1b8-a0d7-4634-abbe-82b574a08325/tip` → **201**

```json
{
  "command_id": "7995feb8-c023-4080-9e98-ed57ae061224",
  "amount_minor": 2500
}
```

```json
{
  "id": "f95f7155-bba1-46da-9bfd-84af332ac031",
  "order_id": "1f5da1b8-a0d7-4634-abbe-82b574a08325",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T10:41:54.870752Z"
}
```

`GET /api/rider/v1/orders/1f5da1b8-a0d7-4634-abbe-82b574a08325/tip` → **200**

```json
{
  "order_id": "1f5da1b8-a0d7-4634-abbe-82b574a08325",
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
  "available_until": "2026-10-30T10:41:54.144594Z",
  "open": false,
  "tip": {
    "id": "f95f7155-bba1-46da-9bfd-84af332ac031",
    "order_id": "1f5da1b8-a0d7-4634-abbe-82b574a08325",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T10:41:54.870752Z"
  }
}
```

`GET /api/rider/v1/orders/1f5da1b8-a0d7-4634-abbe-82b574a08325/tip` → **200**

```json
{
  "order_id": "1f5da1b8-a0d7-4634-abbe-82b574a08325",
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
  "available_until": "2026-10-30T10:41:54.144594Z",
  "open": false,
  "tip": {
    "id": "f95f7155-bba1-46da-9bfd-84af332ac031",
    "order_id": "1f5da1b8-a0d7-4634-abbe-82b574a08325",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T10:41:54.870752Z"
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
      "id": "13d9d988-a77c-4012-a80e-901aa84b56f1",
      "at": "2026-10-29T10:41:56.400123Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "1f5da1b8-a0d7-4634-abbe-82b574a08325",
      "counterpart_id": null
    },
    {
      "id": "d4a15a70-8b88-4ba4-872d-cc6790f6429d",
      "at": "2026-10-29T10:41:54.377259Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1f5da1b8-a0d7-4634-abbe-82b574a08325",
      "counterpart_id": null
    },
    {
      "id": "1d716e4f-afed-4651-868d-254a833cc9ab",
      "at": "2026-10-29T10:41:51.354853Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "736fb2e6-9138-4df6-b998-70e37209dab8",
      "counterpart_id": null
    },
    {
      "id": "1f4f0f72-37fa-45bd-8779-490231e2a9c1",
      "at": "2026-10-29T10:41:46.303569Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "736fb2e6-9138-4df6-b998-70e37209dab8",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f7407e95-b943-42f0-aee0-3b3796b1d307",
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
  "last_heartbeat_at": "2026-10-29T10:41:53.581836Z",
  "last_location_at": "2026-10-29T10:41:53.581836Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f7407e95-b943-42f0-aee0-3b3796b1d307/close` → **200**

```json
{
  "command_id": "c613aab4-3095-4c85-b083-70e46157abbe",
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

Done: card order 1f5da1b8-a0d7-4634-abbe-82b574a08325.

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
  "phone": "+380736856515",
  "device_ref": "sandbox-18257"
}
```

```json
{
  "challenge_id": "c8d60445-dd55-4fa2-98e7-a2a32fd4cb4e",
  "expires_at": "2026-10-29T10:46:57.147656413Z",
  "resend_available_at": "2026-10-29T10:41:58.147656413Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380736856515` → **200**

```json
{
  "phone": "+380736856515",
  "audience": "CLIENT",
  "code": "252580",
  "sent_at": "2026-10-29T10:41:57.14955139Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c8d60445-dd55-4fa2-98e7-a2a32fd4cb4e",
  "code": "252580",
  "device_ref": "sandbox-18257"
}
```

```json
{
  "session_id": "d1c5fa4a-0f99-4358-b05a-35a57c991bcd",
  "subject": {
    "type": "CLIENT",
    "id": "3714befa-2f7c-4ee2-96f5-0df5e1513780"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNzE0YmVmYS0yZjdjLTRlZTItOTZmNS0wZGY1ZTE1MTM3ODAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNDE3LCJpYXQiOjE3OTMyNzA1MTcsImp0aSI6IjEyYWUyZGZiLTg5ZTktNDAwZS1iOWFmLWUzYmE2OWY1ZmI1YSIsInNpZCI6ImQxYzVmYTRhLTBmOTktNDM1OC1iMDVhLTM1YTU3Yzk5MWJjZCJ9.erY5ngdu8g0xbkE9SncFBhgStm5EQaekOQXltUkXCds",
  "access_expires_at": "2026-10-29T10:56:57.358890321Z",
  "refresh_token": "_Sp2HGtSF1zjjVsP0ZBdCp_Xm2AhQ3TNG8f4zaXT6ww",
  "refresh_expires_at": "2026-11-28T10:41:57.358509399Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "85a6a722-ff63-47d1-bbb6-95cb805c3401",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "674f5d8f-7e7f-410f-847e-9a65d5835019",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-674f5d8f-7e7f-410f-847e-9a65d5835019",
    "orderDate": "1793270517",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "1b78b9c73d79c5f3b858d796b7b699ab",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=674f5d8f-7e7f-410f-847e-9a65d5835019",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736856515"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=674f5d8f-7e7f-410f-847e-9a65d5835019",
  "created_at": "2026-10-29T10:41:57.550953Z",
  "expires_at": "2026-10-29T11:11:57.550953Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/674f5d8f-7e7f-410f-847e-9a65d5835019` → **200**

```json
{
  "id": "674f5d8f-7e7f-410f-847e-9a65d5835019",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T10:41:57.550953Z",
  "expires_at": "2026-10-29T11:11:57.550953Z",
  "completed_at": "2026-10-29T10:41:57.743194Z",
  "masked_pan": "41****1535",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3714befa-2f7c-4ee2-96f5-0df5e1513780",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3714befa-2f7c-4ee2-96f5-0df5e1513780",
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
      "id": "bfb510d6-517e-4a20-8c90-960f3c5164a9",
      "at": "2026-10-29T10:41:58.41425Z",
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
  "client_id": "3714befa-2f7c-4ee2-96f5-0df5e1513780",
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
      "id": "bfb510d6-517e-4a20-8c90-960f3c5164a9",
      "at": "2026-10-29T10:41:58.41425Z",
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
  "device_ref": "sandbox-25395"
}
```

```json
{
  "challenge_id": "2bb245ba-18a4-4f1d-b3bf-b784a50c0bbc",
  "expires_at": "2026-10-29T10:46:59.49418199Z",
  "resend_available_at": "2026-10-29T10:42:00.49418199Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "311267",
  "sent_at": "2026-10-29T10:41:59.496327093Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2bb245ba-18a4-4f1d-b3bf-b784a50c0bbc",
  "code": "311267",
  "device_ref": "sandbox-25395"
}
```

```json
{
  "session_id": "7e2daa9b-b655-4d60-9ca2-ff7f196fc0d8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTQxOSwiaWF0IjoxNzkzMjcwNTE5LCJqdGkiOiI0MGQ2N2ZjNS01NmM0LTRjODQtOGE0MC0wNWNlYjU0MThmMzQiLCJzaWQiOiI3ZTJkYWE5Yi1iNjU1LTRkNjAtOWNhMi1mZjdmMTk2ZmMwZDgifQ.OMs20ZcabauALFjpLBEfm_na9dYBjZG3redSxqduxb8",
  "access_expires_at": "2026-10-29T10:56:59.703558042Z",
  "refresh_token": "pk1zFS1Z-VuTfZmpbKve6NeOUGucPj6EJ-9CwIooWZQ",
  "refresh_expires_at": "2026-11-28T10:41:59.703084641Z",
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
  "command_id": "ef1a1bad-bbde-4954-8f63-9dba68bbde88",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "4071a5c2-1d43-45df-bddd-af4dcab42ccf",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-4071a5c2-1d43-45df-bddd-af4dcab42ccf",
    "orderDate": "1793270520",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "6a3927c084e0ceb6d81ae33c905b58c0",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=4071a5c2-1d43-45df-bddd-af4dcab42ccf",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=4071a5c2-1d43-45df-bddd-af4dcab42ccf",
  "created_at": "2026-10-29T10:42:00.062473Z",
  "expires_at": "2026-10-29T11:12:00.062473Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/4071a5c2-1d43-45df-bddd-af4dcab42ccf` → **200**

```json
{
  "id": "4071a5c2-1d43-45df-bddd-af4dcab42ccf",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T10:42:00.062473Z",
  "expires_at": "2026-10-29T11:12:00.062473Z",
  "completed_at": "2026-10-29T10:42:00.254602Z",
  "masked_pan": "41****6270",
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
      "id": "246770ba-6587-4423-8a45-5281ee6291c2",
      "at": "2026-10-29T10:42:00.420778Z",
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
  "command_id": "7b603217-5879-4363-820c-c0824bc0c2c5",
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
  "correlation_id": "c026835a-7039-4805-8ac8-4ec9a666a4b4"
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
  "device_ref": "sandbox-6494"
}
```

```json
{
  "challenge_id": "ea3541aa-6b64-4ac7-a60b-ac0d1805bc8c",
  "expires_at": "2026-10-29T10:47:00.841073228Z",
  "resend_available_at": "2026-10-29T10:42:01.841073228Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "521063",
  "sent_at": "2026-10-29T10:42:00.843419644Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ea3541aa-6b64-4ac7-a60b-ac0d1805bc8c",
  "code": "521063",
  "device_ref": "sandbox-6494"
}
```

```json
{
  "session_id": "7d9bb2e6-1c63-4898-ad9e-fbf324ccc762",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTQyMSwiaWF0IjoxNzkzMjcwNTIxLCJqdGkiOiJmZWI0MjFmOC04ZDdiLTQ4MmEtODg5NS04MTg3ZWUxN2RkNzciLCJzaWQiOiI3ZDliYjJlNi0xYzYzLTQ4OTgtYWQ5ZS1mYmYzMjRjY2M3NjIifQ.EleTvZLSM62Nvc7HQ7CM8pi1oVy1qOJfKI1FN6uc7UU",
  "access_expires_at": "2026-10-29T10:57:01.051670592Z",
  "refresh_token": "3Ushiike0VoAbHPPgyH8afYK5sC9Shqj1nl1vZfLXBA",
  "refresh_expires_at": "2026-11-28T10:42:01.051268646Z",
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
  "command_id": "2ce76906-c042-4469-934f-5a90bfa8710c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:42:01Z",
    "sequence": 1793270521415
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "444dd337-bf65-44a9-aea8-4c287a4ddf1d",
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
  "last_heartbeat_at": "2026-10-29T10:42:01.43086Z",
  "last_location_at": "2026-10-29T10:42:01.43086Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631426096",
  "device_ref": "sandbox-26501"
}
```

```json
{
  "challenge_id": "7971556e-159b-4c7e-ae33-9e2ad5f33504",
  "expires_at": "2026-10-29T10:47:01.60996552Z",
  "resend_available_at": "2026-10-29T10:42:02.60996552Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631426096` → **200**

```json
{
  "phone": "+380631426096",
  "audience": "CLIENT",
  "code": "247520",
  "sent_at": "2026-10-29T10:42:01.612255291Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7971556e-159b-4c7e-ae33-9e2ad5f33504",
  "code": "247520",
  "device_ref": "sandbox-26501"
}
```

```json
{
  "session_id": "2070417a-c8ab-4c5b-b1df-e0816cbc4109",
  "subject": {
    "type": "CLIENT",
    "id": "abaf7f33-66df-4f01-a874-f663c3ce5598"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYmFmN2YzMy02NmRmLTRmMDEtYTg3NC1mNjYzYzNjZTU1OTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNDIxLCJpYXQiOjE3OTMyNzA1MjEsImp0aSI6IjExNjliYzUzLWY5Y2QtNDRjOC05YzQxLTIyZWVkYzU5MTAyYSIsInNpZCI6IjIwNzA0MTdhLWM4YWItNGM1Yi1iMWRmLWUwODE2Y2JjNDEwOSJ9.UhuY_lbeaHmWZyX6CIHCBOuKQx2DW8QtPdVDSyrtDYs",
  "access_expires_at": "2026-10-29T10:57:01.812990424Z",
  "refresh_token": "8y6ml7zJxLna0i3Fb8s24u4t2BkkyDepSbOIkAsGGPU",
  "refresh_expires_at": "2026-11-28T10:42:01.812634944Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4510ab4c-ca4c-4db2-9507-17e9efc4736f",
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
  "id": "5903afb6-9b03-4b99-836a-fc1fbc7c9b4e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:47:01.992309Z",
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
  "command_id": "d926e8b9-b8a0-411a-9b7a-33ff62b2b398",
  "quote_id": "5903afb6-9b03-4b99-836a-fc1fbc7c9b4e",
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
  "id": "e80319e8-9d3c-46ea-b2a2-c8e60162a943",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "abaf7f33-66df-4f01-a874-f663c3ce5598",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T10:42:02.177335Z",
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
    "id": "18559c14-c63a-4f0f-b73e-7fa33b720a0e",
    "order_id": "e80319e8-9d3c-46ea-b2a2-c8e60162a943",
    "expires_at": "2026-10-29T10:42:17.179558Z",
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

`POST /api/driver/v1/offers/18559c14-c63a-4f0f-b73e-7fa33b720a0e/accept` → **200**

```json
{
  "command_id": "81513b77-d0ee-4a6e-acb4-0c241d5126c2"
}
```

```json
{
  "id": "489dd17a-7cf9-484b-8098-e74722f13d71",
  "order_id": "e80319e8-9d3c-46ea-b2a2-c8e60162a943",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8f194e29-7d36-4d8f-a476-d14c30b73189",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8f194e29-7d36-4d8f-a476-d14c30b73189",
  "order_id": "e80319e8-9d3c-46ea-b2a2-c8e60162a943",
  "assignment_id": "489dd17a-7cf9-484b-8098-e74722f13d71",
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

`POST /api/driver/v1/work-sessions/444dd337-bf65-44a9-aea8-4c287a4ddf1d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:42:02Z",
    "sequence": 1793270522961
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "444dd337-bf65-44a9-aea8-4c287a4ddf1d",
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
  "last_heartbeat_at": "2026-10-29T10:42:02.976553Z",
  "last_location_at": "2026-10-29T10:42:02.976553Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8f194e29-7d36-4d8f-a476-d14c30b73189/arrive` → **200**

```json
{
  "command_id": "58ab5ac1-8b3d-4bc6-9172-84b471c46fcd",
  "expected_version": 0
}
```

```json
{
  "id": "8f194e29-7d36-4d8f-a476-d14c30b73189",
  "order_id": "e80319e8-9d3c-46ea-b2a2-c8e60162a943",
  "assignment_id": "489dd17a-7cf9-484b-8098-e74722f13d71",
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
  "arrived_at": "2026-10-29T10:42:03.159729Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8f194e29-7d36-4d8f-a476-d14c30b73189/start` → **200**

```json
{
  "command_id": "7c23b0af-97cf-41eb-9c2d-c8001307f769",
  "expected_version": 1
}
```

```json
{
  "id": "8f194e29-7d36-4d8f-a476-d14c30b73189",
  "order_id": "e80319e8-9d3c-46ea-b2a2-c8e60162a943",
  "assignment_id": "489dd17a-7cf9-484b-8098-e74722f13d71",
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
  "arrived_at": "2026-10-29T10:42:03.159729Z",
  "started_at": "2026-10-29T10:42:03.345321Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8f194e29-7d36-4d8f-a476-d14c30b73189/complete` → **200**

```json
{
  "command_id": "2c9bcbc4-db70-4af3-93ac-1c42534d80bd",
  "expected_version": 2,
  "reported_at": "2026-10-29T10:42:03Z",
  "cash_received": false
}
```

```json
{
  "id": "8f194e29-7d36-4d8f-a476-d14c30b73189",
  "order_id": "e80319e8-9d3c-46ea-b2a2-c8e60162a943",
  "assignment_id": "489dd17a-7cf9-484b-8098-e74722f13d71",
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
  "arrived_at": "2026-10-29T10:42:03.159729Z",
  "started_at": "2026-10-29T10:42:03.345321Z",
  "completed_at": "2026-10-29T10:42:03.540429Z",
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
  "session_id": "6d38abb4-dd8c-412b-8517-09b8b82d354c",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE0MjMsImlhdCI6MTc5MzI3MDUyMywianRpIjoiNWZhYWMzZjQtNzk4YS00NDMxLTlmOGItZTg5Nzc1YTYxNTc3Iiwic2lkIjoiNmQzOGFiYjQtZGQ4Yy00MTJiLTg1MTctMDliOGI4MmQzNTRjIn0.9gUXcxyC9ur_gDdBQTvhBP9tgDjDV9gVs3zZl6HHZjY",
  "access_expires_at": "2026-10-29T10:57:03.923434635Z",
  "refresh_token": "qBg42KC9Zvfe8sOm6EgwBs7YkqV3qi9k-xN4cpQ63aY",
  "refresh_expires_at": "2026-10-29T22:42:03.92299663Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/e80319e8-9d3c-46ea-b2a2-c8e60162a943/cash-dispute` → **404**

```json
{
  "instance": "/api/admin/v1/orders/e80319e8-9d3c-46ea-b2a2-c8e60162a943/cash-dispute",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "09f41775-a489-4db2-9480-e2a084f7c9a2"
}
```

`GET /api/admin/v1/orders/e80319e8-9d3c-46ea-b2a2-c8e60162a943/cash-dispute` → **200**

```json
{
  "order_id": "e80319e8-9d3c-46ea-b2a2-c8e60162a943",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "abaf7f33-66df-4f01-a874-f663c3ce5598",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T10:42:04.454627Z",
  "decide_by": "2026-11-12T10:42:04.454627Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T10:42:04.454627Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "e80319e8-9d3c-46ea-b2a2-c8e60162a943",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "abaf7f33-66df-4f01-a874-f663c3ce5598",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T10:42:04.454627Z",
      "decide_by": "2026-11-12T10:42:04.454627Z",
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

`POST /api/admin/v1/orders/e80319e8-9d3c-46ea-b2a2-c8e60162a943/cash-dispute/decide` → **400**

```json
{
  "command_id": "51cb4eb9-aca7-40c6-9cbb-e932ee0184d1",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/e80319e8-9d3c-46ea-b2a2-c8e60162a943/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "874950a6-44af-43c8-9fbb-4c6d94fa2c5b",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/e80319e8-9d3c-46ea-b2a2-c8e60162a943/cash-dispute/decide` → **200**

```json
{
  "command_id": "22795e43-f211-4144-a1c0-fc357ca7eb2a",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "e80319e8-9d3c-46ea-b2a2-c8e60162a943",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "abaf7f33-66df-4f01-a874-f663c3ce5598",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T10:42:04.454627Z",
  "decide_by": "2026-11-12T10:42:04.454627Z",
  "decision": "PAY_DRIVER",
  "decided_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T10:42:05.848804Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/e80319e8-9d3c-46ea-b2a2-c8e60162a943/cash-dispute/decide` → **409**

```json
{
  "command_id": "3a8a330b-4754-45fa-84bd-68b20fdf66ce",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/e80319e8-9d3c-46ea-b2a2-c8e60162a943/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0d9c292a-82ab-4840-9724-f42a54b4bc4f"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "444dd337-bf65-44a9-aea8-4c287a4ddf1d",
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
  "last_heartbeat_at": "2026-10-29T10:42:02.976553Z",
  "last_location_at": "2026-10-29T10:42:02.976553Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/444dd337-bf65-44a9-aea8-4c287a4ddf1d/close` → **200**

```json
{
  "command_id": "b651364d-fd8e-4f8c-9ca5-b71f7d978615",
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
  "phone": "+380737062994",
  "device_ref": "sandbox-29769"
}
```

```json
{
  "challenge_id": "c683f58b-fa51-4639-9684-15e81265d82c",
  "expires_at": "2026-10-29T10:47:06.611592261Z",
  "resend_available_at": "2026-10-29T10:42:07.611592261Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737062994` → **200**

```json
{
  "phone": "+380737062994",
  "audience": "CLIENT",
  "code": "643206",
  "sent_at": "2026-10-29T10:42:06.613678546Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c683f58b-fa51-4639-9684-15e81265d82c",
  "code": "643206",
  "device_ref": "sandbox-29769"
}
```

```json
{
  "session_id": "0f0d322a-d429-4c05-8690-d7a7fe157826",
  "subject": {
    "type": "CLIENT",
    "id": "831653ca-0a99-4bd8-806f-ed70b63142d7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MzE2NTNjYS0wYTk5LTRiZDgtODA2Zi1lZDcwYjYzMTQyZDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNDI2LCJpYXQiOjE3OTMyNzA1MjYsImp0aSI6ImZkNTY3YzU1LTI0ZWQtNGU1Ni05NjAwLTliYjYzMzkzM2I0MyIsInNpZCI6IjBmMGQzMjJhLWQ0MjktNGMwNS04NjkwLWQ3YTdmZTE1NzgyNiJ9.Ogwxj4gwzq667Ch2RJRXDXYMgRCTz6iNO1B020dlpe4",
  "access_expires_at": "2026-10-29T10:57:06.812283373Z",
  "refresh_token": "DaoyWwBN26l4d7t1n-zTZ2HzoSSX8xfkS0KO4HsMIvA",
  "refresh_expires_at": "2026-11-28T10:42:06.811934379Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "92c3c25c-f137-46c6-b764-d2ec758aa832",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "e0305de6-49a3-4690-9588-39663383f9c6",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-e0305de6-49a3-4690-9588-39663383f9c6",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "744941d2b955faae813e2b5a419c81f7",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=e0305de6-49a3-4690-9588-39663383f9c6",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737062994"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=e0305de6-49a3-4690-9588-39663383f9c6",
  "expires_at": "2026-10-29T11:12:07.043781Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/e0305de6-49a3-4690-9588-39663383f9c6` → **200**

```json
{
  "id": "e0305de6-49a3-4690-9588-39663383f9c6",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T11:12:07.043781Z",
  "card": {
    "id": "b458053a-a329-46f9-9f2a-01f4366ec21b",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6546",
    "card_type": "Visa",
    "created_at": "2026-10-29T10:42:07.22595Z"
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
  "device_ref": "sandbox-324"
}
```

```json
{
  "challenge_id": "1166ecf7-08df-45ad-9c68-fa75eed1c290",
  "expires_at": "2026-10-29T10:47:07.419014457Z",
  "resend_available_at": "2026-10-29T10:42:08.419014457Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "575236",
  "sent_at": "2026-10-29T10:42:07.421497231Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1166ecf7-08df-45ad-9c68-fa75eed1c290",
  "code": "575236",
  "device_ref": "sandbox-324"
}
```

```json
{
  "session_id": "01f8b7d5-7252-40ff-a1aa-87ba6e7a5703",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTQyNywiaWF0IjoxNzkzMjcwNTI3LCJqdGkiOiIxZGFmM2JhNi0wZWQ3LTRkMGYtYTgyNS0yZTdhY2E3ZTM3NWMiLCJzaWQiOiIwMWY4YjdkNS03MjUyLTQwZmYtYTFhYS04N2JhNmU3YTU3MDMifQ.ebUga9NWvD0Z7-E1R4h7S2NqFDK6UefubDTgruwJFT4",
  "access_expires_at": "2026-10-29T10:57:07.625827884Z",
  "refresh_token": "YD-fhMZZ3AtjH9jpmbaBbrOx68dWzq9qM9WI3KUryKk",
  "refresh_expires_at": "2026-11-28T10:42:07.625460852Z",
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
  "command_id": "2edf069d-cea4-4f09-9333-1370c179d96e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:42:07Z",
    "sequence": 1793270527964
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "92389717-c28d-4c89-98fc-7368503e3c23",
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
  "last_heartbeat_at": "2026-10-29T10:42:07.980545Z",
  "last_location_at": "2026-10-29T10:42:07.980545Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2ba41217-c6c9-4ae0-9db3-2efcf48bd691",
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
  "id": "a2d9a730-b07a-42fa-9bd3-73bf9aaf124b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:47:08.177569Z",
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
  "command_id": "1976369f-e3ae-4017-b0a7-6f168074af96",
  "quote_id": "a2d9a730-b07a-42fa-9bd3-73bf9aaf124b",
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
  "id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "831653ca-0a99-4bd8-806f-ed70b63142d7",
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
  "created_at": "2026-10-29T10:42:08.372393Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a10154c5-4128-4d2a-ac7d-908fb3b71870` → **200**

```json
{
  "id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "831653ca-0a99-4bd8-806f-ed70b63142d7",
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
  "created_at": "2026-10-29T10:42:08.372393Z",
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
    "id": "f9f4538e-f368-418f-9045-e422a42fd5b0",
    "order_id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
    "expires_at": "2026-10-29T10:42:23.477564Z",
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

`POST /api/driver/v1/offers/f9f4538e-f368-418f-9045-e422a42fd5b0/accept` → **200**

```json
{
  "command_id": "d06b569a-2107-42cb-9650-8b7ee3129a86"
}
```

```json
{
  "id": "1b77ebc8-3c5e-4b9f-b86a-2a485b9c8a59",
  "order_id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9e8af375-1642-4b08-b3aa-b945100c994d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9e8af375-1642-4b08-b3aa-b945100c994d",
  "order_id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
  "assignment_id": "1b77ebc8-3c5e-4b9f-b86a-2a485b9c8a59",
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

`POST /api/rider/v1/orders/a10154c5-4128-4d2a-ac7d-908fb3b71870/messages` → **201**

```json
{
  "command_id": "34c677f7-712a-4d7c-b652-0bff6642d5ef",
  "body": "Я біля входу, мій номер +380737062994, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "ccda60ec-188e-4e65-b36c-1e6d3f979fc7",
  "order_id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380737062994, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T10:42:09.327999426Z"
}
```

`POST /api/driver/v1/trips/9e8af375-1642-4b08-b3aa-b945100c994d/messages` → **201**

```json
{
  "command_id": "55a287e8-5169-448b-966c-6ce71e1600cd",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "bddc2f65-81c2-4c0f-873f-62dabb11018f",
  "order_id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T10:42:09.551665227Z"
}
```

`POST /api/driver/v1/work-sessions/92389717-c28d-4c89-98fc-7368503e3c23/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:42:09Z",
    "sequence": 1793270529732
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "92389717-c28d-4c89-98fc-7368503e3c23",
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
  "last_heartbeat_at": "2026-10-29T10:42:09.748962Z",
  "last_location_at": "2026-10-29T10:42:09.748962Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9e8af375-1642-4b08-b3aa-b945100c994d/arrive` → **200**

```json
{
  "command_id": "0fcaa6e8-804f-49f6-803b-eea62a3bbc97",
  "expected_version": 0
}
```

```json
{
  "id": "9e8af375-1642-4b08-b3aa-b945100c994d",
  "order_id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
  "assignment_id": "1b77ebc8-3c5e-4b9f-b86a-2a485b9c8a59",
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
  "arrived_at": "2026-10-29T10:42:09.94221Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9e8af375-1642-4b08-b3aa-b945100c994d/start` → **200**

```json
{
  "command_id": "761b9cea-0f59-4192-a6cd-91bf26bdb685",
  "expected_version": 1
}
```

```json
{
  "id": "9e8af375-1642-4b08-b3aa-b945100c994d",
  "order_id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
  "assignment_id": "1b77ebc8-3c5e-4b9f-b86a-2a485b9c8a59",
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
  "arrived_at": "2026-10-29T10:42:09.94221Z",
  "started_at": "2026-10-29T10:42:10.139772Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/92389717-c28d-4c89-98fc-7368503e3c23/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:42:10Z",
    "sequence": 1793270530322
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "92389717-c28d-4c89-98fc-7368503e3c23",
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
  "last_heartbeat_at": "2026-10-29T10:42:10.338584Z",
  "last_location_at": "2026-10-29T10:42:10.338584Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/9e8af375-1642-4b08-b3aa-b945100c994d/complete` → **200**

```json
{
  "command_id": "efc4ba7c-6b5c-4497-bdaf-ee5f976be957",
  "expected_version": 2,
  "reported_at": "2026-10-29T10:42:10Z",
  "cash_received": false
}
```

```json
{
  "id": "9e8af375-1642-4b08-b3aa-b945100c994d",
  "order_id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
  "assignment_id": "1b77ebc8-3c5e-4b9f-b86a-2a485b9c8a59",
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
  "arrived_at": "2026-10-29T10:42:09.94221Z",
  "started_at": "2026-10-29T10:42:10.139772Z",
  "completed_at": "2026-10-29T10:42:10.535892Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/a10154c5-4128-4d2a-ac7d-908fb3b71870` → **200**

```json
{
  "id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "831653ca-0a99-4bd8-806f-ed70b63142d7",
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
    "id": "1b77ebc8-3c5e-4b9f-b86a-2a485b9c8a59",
    "order_id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9e8af375-1642-4b08-b3aa-b945100c994d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T10:42:08.372393Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a10154c5-4128-4d2a-ac7d-908fb3b71870` → **200**

```json
{
  "id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "831653ca-0a99-4bd8-806f-ed70b63142d7",
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
    "id": "1b77ebc8-3c5e-4b9f-b86a-2a485b9c8a59",
    "order_id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9e8af375-1642-4b08-b3aa-b945100c994d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T10:42:08.372393Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a10154c5-4128-4d2a-ac7d-908fb3b71870` → **200**

```json
{
  "id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "831653ca-0a99-4bd8-806f-ed70b63142d7",
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
    "id": "1b77ebc8-3c5e-4b9f-b86a-2a485b9c8a59",
    "order_id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9e8af375-1642-4b08-b3aa-b945100c994d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T10:42:08.372393Z",
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
  "session_id": "92389717-c28d-4c89-98fc-7368503e3c23",
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
  "last_heartbeat_at": "2026-10-29T10:42:10.338584Z",
  "last_location_at": "2026-10-29T10:42:10.338584Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/92389717-c28d-4c89-98fc-7368503e3c23/close` → **200**

```json
{
  "command_id": "a8ca0a40-efdf-458b-97ee-44f6b5c4552d",
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
  "session_id": "a79cb82e-6c01-4bfc-9c6b-046af6425429",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE0MzMsImlhdCI6MTc5MzI3MDUzMywianRpIjoiNjYzNzg0OTktYzA5NS00ZjkyLWI0YjEtMDJlYTJlNmIxYWM2Iiwic2lkIjoiYTc5Y2I4MmUtNmMwMS00YmZjLTljNmItMDQ2YWY2NDI1NDI5In0.-Yt0HJ6Lavib8RtA613347wQZ29y1d6h-OCXESV4ZR8",
  "access_expires_at": "2026-10-29T10:57:13.886130305Z",
  "refresh_token": "3B1zWjcjElsYqk8AzdWHGHozXU5IhNnRxGtkE4_y-lA",
  "refresh_expires_at": "2026-10-29T22:42:13.885809984Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/a10154c5-4128-4d2a-ac7d-908fb3b71870/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/a10154c5-4128-4d2a-ac7d-908fb3b71870/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7dca6e11-1f2e-4487-ab6a-1f1cb60584a4"
}
```

`GET /api/admin/v1/orders/a10154c5-4128-4d2a-ac7d-908fb3b71870/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T10:42:14.253514233Z",
  "order": {
    "id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
    "short_number": 9,
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
    "created_at": "2026-10-29T10:42:08.372393Z",
    "assigned_at": "2026-10-29T10:42:08.958344Z",
    "arrived_at": "2026-10-29T10:42:09.94221Z",
    "started_at": "2026-10-29T10:42:10.139772Z",
    "completed_at": "2026-10-29T10:42:10.535892Z"
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
    "id": "831653ca-0a99-4bd8-806f-ed70b63142d7",
    "registered_at": "2026-10-29T10:42:06.810417Z",
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
      "created_at": "2026-10-29T10:42:08.374172Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T10:42:11.539222Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/a10154c5-4128-4d2a-ac7d-908fb3b71870/chargebacks` → **422**

```json
{
  "command_id": "0f185db1-0f33-4e94-b218-7d973c068fa9",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "instance": "/api/admin/v1/orders/a10154c5-4128-4d2a-ac7d-908fb3b71870/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "cfe11d1b-8ec2-427e-b80a-2faced34bd22"
}
```

`POST /api/admin/v1/orders/a10154c5-4128-4d2a-ac7d-908fb3b71870/chargebacks` → **201**

```json
{
  "command_id": "dbc86774-55da-4ed9-990a-47865dd0484b",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "819c3baa-a8c4-471a-9d71-b27db87d86b5",
  "order_id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T10:42:14.688383Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/a10154c5-4128-4d2a-ac7d-908fb3b71870/chargebacks` → **201**

```json
{
  "command_id": "dbc86774-55da-4ed9-990a-47865dd0484b",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "819c3baa-a8c4-471a-9d71-b27db87d86b5",
  "order_id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T10:42:14.688383Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/831653ca-0a99-4bd8-806f-ed70b63142d7` → **200**

```json
{
  "client": {
    "id": "831653ca-0a99-4bd8-806f-ed70b63142d7",
    "phone": "+380737062994",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T10:42:06.810417Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T10:42:08.372393Z",
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

`GET /api/admin/v1/clients/831653ca-0a99-4bd8-806f-ed70b63142d7` → **200**

```json
{
  "client": {
    "id": "831653ca-0a99-4bd8-806f-ed70b63142d7",
    "phone": "+380737062994",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T10:42:06.810417Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T10:42:08.372393Z",
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

`POST /api/admin/v1/orders/a10154c5-4128-4d2a-ac7d-908fb3b71870/chargebacks/819c3baa-a8c4-471a-9d71-b27db87d86b5/resolve` → **200**

```json
{
  "command_id": "fb676b22-1201-4f4a-9167-42c604ff006d",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "819c3baa-a8c4-471a-9d71-b27db87d86b5",
  "order_id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-29T10:42:14.688383Z",
  "resolved_at": "2026-10-29T10:42:16.49775Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/831653ca-0a99-4bd8-806f-ed70b63142d7` → **200**

```json
{
  "client": {
    "id": "831653ca-0a99-4bd8-806f-ed70b63142d7",
    "phone": "+380737062994",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T10:42:06.810417Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T10:42:08.372393Z",
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

`POST /api/admin/v1/orders/a10154c5-4128-4d2a-ac7d-908fb3b71870/chargebacks/819c3baa-a8c4-471a-9d71-b27db87d86b5/resolve` → **409**

```json
{
  "command_id": "653f4de2-5940-4a4b-b419-a8407361cd34",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/a10154c5-4128-4d2a-ac7d-908fb3b71870/chargebacks/819c3baa-a8c4-471a-9d71-b27db87d86b5/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "544d7e60-afb2-4679-bd5a-e1e961c82753"
}
```

`GET /api/admin/v1/orders/a10154c5-4128-4d2a-ac7d-908fb3b71870/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "819c3baa-a8c4-471a-9d71-b27db87d86b5",
      "order_id": "a10154c5-4128-4d2a-ac7d-908fb3b71870",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-28",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-29T10:42:14.688383Z",
      "resolved_at": "2026-10-29T10:42:16.49775Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order a10154c5-4128-4d2a-ac7d-908fb3b71870 without phone or card digits; chargeback 819c3baa-a8c4-471a-9d71-b27db87d86b5 recorded and won.

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
  "session_id": "79c18752-206f-4c71-ab7d-68b89aff77bf",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE0MzcsImlhdCI6MTc5MzI3MDUzNywianRpIjoiZWVkZjliYjYtOGQxNS00ODY5LWIwMDAtNDE4OTllNGIyOTM5Iiwic2lkIjoiNzljMTg3NTItMjA2Zi00YzcxLWFiN2QtNjhiODlhZmY3N2JmIn0.VarAq29aB5Zr9PTb8kfXgFc14RVeY-Mi249jiPwhbRo",
  "access_expires_at": "2026-10-29T10:57:17.667978856Z",
  "refresh_token": "g_QP_DstltkbE_Jk6Ql5rAe6GKf_YF4U20eNIFvAJUI",
  "refresh_expires_at": "2026-10-29T22:42:17.667664184Z",
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
  "phone": "+48600645290",
  "device_ref": "sandbox-31891"
}
```

```json
{
  "challenge_id": "1aab8de2-4447-435b-88c3-8e7273443f14",
  "expires_at": "2026-10-29T10:47:18.240339513Z",
  "resend_available_at": "2026-10-29T10:42:19.240339513Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600645290` → **200**

```json
{
  "phone": "+48600645290",
  "audience": "CLIENT",
  "code": "662557",
  "sent_at": "2026-10-29T10:42:18.242251807Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1aab8de2-4447-435b-88c3-8e7273443f14",
  "code": "662557",
  "device_ref": "sandbox-31891"
}
```

```json
{
  "session_id": "a4efb386-4c0b-4a9f-9b9b-563e93cca488",
  "subject": {
    "type": "CLIENT",
    "id": "a1c2e2bc-a4fd-4123-a4b6-22799b17a06c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMWMyZTJiYy1hNGZkLTQxMjMtYTRiNi0yMjc5OWIxN2EwNmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNDM4LCJpYXQiOjE3OTMyNzA1MzgsImp0aSI6IjM1MDgxMDRmLTZmNDAtNGRhZS1iYzA3LTEyNTE0NmFmZWJjNCIsInNpZCI6ImE0ZWZiMzg2LTRjMGItNGE5Zi05YjliLTU2M2U5M2NjYTQ4OCJ9.KQSc2ucMXu-wvO4DW86r9ppPp8Ot882v1X1ahvG4Vqg",
  "access_expires_at": "2026-10-29T10:57:18.452834281Z",
  "refresh_token": "CtRG_TNk4d6Npi573TpmzdhQcIwBIjLbckQCChVDXt4",
  "refresh_expires_at": "2026-11-28T10:42:18.452531876Z",
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
  "command_id": "43efdf76-9002-481b-a9bc-4614a4a8dda8",
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
  "correlation_id": "45e0e1fd-709f-4947-8cb6-48c339c13f71",
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
  "command_id": "7d8528ca-f98c-423c-87f0-3bb3a8556180",
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
  "paused_at": "2026-10-29T10:42:19.192814299Z",
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
  "command_id": "b8840898-ad2a-4fe4-abe5-7e07d482c9d3",
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
  "id": "f2c112af-8554-4ccf-a0dc-e3ff7d121257",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:47:19.577842Z",
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
  "command_id": "a82f83eb-5609-4120-a615-e0ff666b64ee",
  "quote_id": "f2c112af-8554-4ccf-a0dc-e3ff7d121257",
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
  "correlation_id": "cad41739-0ba9-4e41-81ba-f5f2711a9e3e"
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
  "paused_at": "2026-10-29T10:42:19.192814Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "f2c57840-350a-4c34-913e-6f9d77b79467",
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
  "command_id": "477dcc31-39c4-4522-b93c-f215963bcd5a",
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
  "command_id": "4ef26476-497d-4a54-8202-319b5c83f092",
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
  "id": "77441a4e-0aff-485f-9ad0-1a4894b5429e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:47:20.715768Z",
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
  "command_id": "00f44437-7f37-45a7-944c-fd4bffea6353",
  "quote_id": "77441a4e-0aff-485f-9ad0-1a4894b5429e",
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
  "correlation_id": "1af5856d-68c4-4a4f-9b8b-890a9386765a"
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
  "command_id": "e84331dd-6342-459f-9502-67bfddce750a",
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
  "command_id": "1e33ad59-31e9-4e4f-b78c-2c3a189fba40",
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
  "id": "ef453647-ac83-41a1-963a-2da3ad81091c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:47:21.485108Z",
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
  "command_id": "8fd01618-fcd2-4ca8-8888-f0f4822d5cc8",
  "quote_id": "ef453647-ac83-41a1-963a-2da3ad81091c",
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
  "correlation_id": "98564b1e-d266-49fc-9cdc-61c5fb1b7612"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "27a541f9-83c2-453f-802b-f6aa93d2e482",
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
  "correlation_id": "84129d1e-f0e8-429e-9174-556891f3da93"
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
  "command_id": "07b0b4f0-2d79-4fc3-83d7-4a0c98ff0c60",
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
  "phone": "+380671986288",
  "device_ref": "sandbox-13388"
}
```

```json
{
  "challenge_id": "28885787-a95d-4a12-b8c7-c258f7d2450c",
  "expires_at": "2026-10-29T10:47:22.469717318Z",
  "resend_available_at": "2026-10-29T10:42:23.469717318Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671986288` → **200**

```json
{
  "phone": "+380671986288",
  "audience": "CLIENT",
  "code": "806349",
  "sent_at": "2026-10-29T10:42:22.471654619Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "28885787-a95d-4a12-b8c7-c258f7d2450c",
  "code": "806349",
  "device_ref": "sandbox-13388"
}
```

```json
{
  "session_id": "27d874bd-3fb3-4ef2-82d8-437cd8494aed",
  "subject": {
    "type": "CLIENT",
    "id": "4f64fbec-f927-443f-92dd-9670374fc8d8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjY0ZmJlYy1mOTI3LTQ0M2YtOTJkZC05NjcwMzc0ZmM4ZDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNDQyLCJpYXQiOjE3OTMyNzA1NDIsImp0aSI6IjBkNzE1MjU1LTdkZTQtNDQyOC05YjIxLWY1Y2IwMGQ5ZDdkYSIsInNpZCI6IjI3ZDg3NGJkLTNmYjMtNGVmMi04MmQ4LTQzN2NkODQ5NGFlZCJ9.Lf8rdf5saTHGbTQU-h3e8hyA3Fki6fmngX6FqEPQa2s",
  "access_expires_at": "2026-10-29T10:57:22.675091818Z",
  "refresh_token": "VOn4lhq2-HeuJ9P-5sSJOK9KqjBkdLK4t4fm60sJWvE",
  "refresh_expires_at": "2026-11-28T10:42:22.674732123Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4f64fbec-f927-443f-92dd-9670374fc8d8",
  "session_id": "27d874bd-3fb3-4ef2-82d8-437cd8494aed",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f77ea490-3d83-4097-a651-73cdf98980d6",
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
  "id": "51cebed7-83d0-4b64-9d96-2dac06844ed0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:47:23.046645Z",
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
  "challenge_id": "73165aee-6c26-40bf-9782-3e23f524dd94",
  "expires_at": "2026-10-29T10:47:25.236839551Z",
  "resend_available_at": "2026-10-29T10:42:26.236839551Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671986288` → **200**

```json
{
  "phone": "+380671986288",
  "audience": "CLIENT",
  "code": "043609",
  "sent_at": "2026-10-29T10:42:25.238587524Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "84fc0574-9d69-47e1-ba26-57afe1ba7334",
  "challenge_id": "73165aee-6c26-40bf-9782-3e23f524dd94",
  "otp_code": "043609"
}
```

```json
{
  "client_id": "4f64fbec-f927-443f-92dd-9670374fc8d8",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T10:42:25.458503324Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "05121f04-3c4f-4303-87cf-921d8777558b",
  "quote_id": "51cebed7-83d0-4b64-9d96-2dac06844ed0",
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
  "correlation_id": "bfb47b29-2de6-4825-a51d-d2e93d60ef74"
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
  "session_id": "52a251da-2612-4a61-b2c7-75b9a4ca7a53",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE0NDYsImlhdCI6MTc5MzI3MDU0NiwianRpIjoiNWE3NmRiYTUtMGYzNS00NWM2LWIwNzgtODZkZGNlMWZlNmQyIiwic2lkIjoiNTJhMjUxZGEtMjYxMi00YTYxLWIyYzctNzViOWE0Y2E3YTUzIn0.X3soM4eoyw4tHM0DKV7YGrfGnAn98Cd52vdQ3XouSoA",
  "access_expires_at": "2026-10-29T10:57:26.050662727Z",
  "refresh_token": "fv1OSpveRtE70dX5WKpffONCJLiCEkqDKkRMfAvkuho",
  "refresh_expires_at": "2026-10-29T22:42:26.050359942Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "4f64fbec-f927-443f-92dd-9670374fc8d8",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T10:42:25.458503Z",
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

`POST /api/admin/v1/client-deletions/4f64fbec-f927-443f-92dd-9670374fc8d8/complete` → **200**

```json
{
  "command_id": "7564d1d7-218e-4356-a8fc-0c180caad36d",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "4f64fbec-f927-443f-92dd-9670374fc8d8",
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
  "correlation_id": "b64cc302-f073-4e57-91a9-eb8fc4687efc"
}
```

Done: client 4f64fbec-f927-443f-92dd-9670374fc8d8 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661037704",
  "device_ref": "sandbox-23982"
}
```

```json
{
  "challenge_id": "e8c045f3-014d-40e2-9f0a-07c092b5ebc5",
  "expires_at": "2026-10-29T10:47:26.826705414Z",
  "resend_available_at": "2026-10-29T10:42:27.826705414Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380661037704` → **200**

```json
{
  "phone": "+380661037704",
  "audience": "CLIENT",
  "code": "337206",
  "sent_at": "2026-10-29T10:42:26.828848596Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e8c045f3-014d-40e2-9f0a-07c092b5ebc5",
  "code": "337206",
  "device_ref": "sandbox-23982"
}
```

```json
{
  "session_id": "6132821a-4ebb-4edb-b63a-640edbbc2b47",
  "subject": {
    "type": "CLIENT",
    "id": "b2a337d7-9afd-4549-9c80-a1747a808a40"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMmEzMzdkNy05YWZkLTQ1NDktOWM4MC1hMTc0N2E4MDhhNDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNDQ3LCJpYXQiOjE3OTMyNzA1NDcsImp0aSI6ImRmNGIzNmY1LTE2ZGMtNDRmZi04MjEyLTAxZmM1NDIyNDcyNiIsInNpZCI6IjYxMzI4MjFhLTRlYmItNGVkYi1iNjNhLTY0MGVkYmJjMmI0NyJ9.upBwJnpMwXreyoWLLErqs5k0eX1tazlKhXJlU9fXp60",
  "access_expires_at": "2026-10-29T10:57:27.034362305Z",
  "refresh_token": "N3tFjpAEFlIaNeO8TvCFrA9Z2jNcACfDDQZO0vLc5eM",
  "refresh_expires_at": "2026-11-28T10:42:27.033983061Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b2a337d7-9afd-4549-9c80-a1747a808a40",
  "session_id": "6132821a-4ebb-4edb-b63a-640edbbc2b47",
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
  "session_id": "e0006c85-9ecc-4cc8-9898-59bdf663f456",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE0NDcsImlhdCI6MTc5MzI3MDU0NywianRpIjoiYjFhMDNmZTUtNDY2YS00NmZiLWJlMGMtNjQyZTcwYzg5NGJmIiwic2lkIjoiZTAwMDZjODUtOWVjYy00Y2M4LTk4OTgtNTliZGY2NjNmNDU2In0.nOm5YCLWW4-vlgxt4Kqv_5sfsACC9gULRr0Hih21YnM",
  "access_expires_at": "2026-10-29T10:57:27.60714221Z",
  "refresh_token": "NdzuZXuu_LfqIqNZv_J7XN-cENBtBmYJM90FIhhfq44",
  "refresh_expires_at": "2026-10-29T22:42:27.606774351Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=1037704&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "b2a337d7-9afd-4549-9c80-a1747a808a40",
      "phone": "+380661037704",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T10:42:27.032532Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/b2a337d7-9afd-4549-9c80-a1747a808a40` → **200**

```json
{
  "client": {
    "id": "b2a337d7-9afd-4549-9c80-a1747a808a40",
    "phone": "+380661037704",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T10:42:27.032532Z",
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

`POST /api/admin/v1/clients/b2a337d7-9afd-4549-9c80-a1747a808a40/block` → **400**

```json
{
  "command_id": "0adcd5c5-a69b-42d0-8e0e-6b2399c96d7c",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/b2a337d7-9afd-4549-9c80-a1747a808a40/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "fc026e46-2e2e-4fbd-ada2-3f782974c315",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/b2a337d7-9afd-4549-9c80-a1747a808a40/block` → **200**

```json
{
  "command_id": "25e1de56-ad76-42ce-ab67-fc4fce656bab",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "b2a337d7-9afd-4549-9c80-a1747a808a40",
  "phone": "+380661037704",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T10:42:27.032532Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T10:42:28.392927Z",
    "by": "c8491122-a379-432e-880c-2c074e7909b2"
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
  "correlation_id": "4c196567-da76-4f83-8b6e-0ba1f30e602c"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661037704",
  "device_ref": "sandbox-29875"
}
```

```json
{
  "challenge_id": "3732310b-72d6-4741-8a16-3178b7da2243",
  "expires_at": "2026-10-29T10:47:30.761667025Z",
  "resend_available_at": "2026-10-29T10:42:31.761667025Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380661037704` → **200**

```json
{
  "phone": "+380661037704",
  "audience": "CLIENT",
  "code": "184068",
  "sent_at": "2026-10-29T10:42:30.763810069Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "3732310b-72d6-4741-8a16-3178b7da2243",
  "code": "184068",
  "device_ref": "sandbox-29875"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "037bf238-7483-4d98-b2cd-f3fee16e1dc5"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/b2a337d7-9afd-4549-9c80-a1747a808a40` → **200**

```json
{
  "client": {
    "id": "b2a337d7-9afd-4549-9c80-a1747a808a40",
    "phone": "+380661037704",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T10:42:27.032532Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T10:42:28.392927Z",
      "by": "c8491122-a379-432e-880c-2c074e7909b2"
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

`POST /api/admin/v1/clients/b2a337d7-9afd-4549-9c80-a1747a808a40/unblock` → **200**

```json
{
  "command_id": "8573109b-b9a1-4ff6-b8bc-651a93162861",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "b2a337d7-9afd-4549-9c80-a1747a808a40",
  "phone": "+380661037704",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T10:42:27.032532Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661037704",
  "device_ref": "sandbox-4227"
}
```

```json
{
  "challenge_id": "b1a40308-be6b-4856-842b-161e2832dfce",
  "expires_at": "2026-10-29T10:47:33.602649512Z",
  "resend_available_at": "2026-10-29T10:42:34.602649512Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380661037704` → **200**

```json
{
  "phone": "+380661037704",
  "audience": "CLIENT",
  "code": "978693",
  "sent_at": "2026-10-29T10:42:33.604391993Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b1a40308-be6b-4856-842b-161e2832dfce",
  "code": "978693",
  "device_ref": "sandbox-4227"
}
```

```json
{
  "session_id": "1881ca38-a995-49a8-b856-adb901e96f20",
  "subject": {
    "type": "CLIENT",
    "id": "b2a337d7-9afd-4549-9c80-a1747a808a40"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMmEzMzdkNy05YWZkLTQ1NDktOWM4MC1hMTc0N2E4MDhhNDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNDUzLCJpYXQiOjE3OTMyNzA1NTMsImp0aSI6ImQ0YzRlNjE3LWQ1YWYtNDNjOC04MzRjLWFlMDIwZWUyZjAxMiIsInNpZCI6IjE4ODFjYTM4LWE5OTUtNDlhOC1iODU2LWFkYjkwMWU5NmYyMCJ9.GY9eOdQSyJK8ZADstacL34h_gUiy20M0Ne9HaggBBZM",
  "access_expires_at": "2026-10-29T10:57:33.814107188Z",
  "refresh_token": "FoLIiE6fGD_hFbfghlaYQwAdJb9-UZoMjm3_KOo_Ruw",
  "refresh_expires_at": "2026-11-28T10:42:33.813667593Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b2a337d7-9afd-4549-9c80-a1747a808a40",
  "session_id": "1881ca38-a995-49a8-b856-adb901e96f20",
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
  "phone": "+380668878876",
  "device_ref": "sandbox-16906"
}
```

```json
{
  "challenge_id": "119442af-5be6-4bd0-95fe-a4dab9e91dd1",
  "expires_at": "2026-10-29T10:47:34.186629815Z",
  "resend_available_at": "2026-10-29T10:42:35.186629815Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668878876` → **200**

```json
{
  "phone": "+380668878876",
  "audience": "CLIENT",
  "code": "205402",
  "sent_at": "2026-10-29T10:42:34.18859875Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "119442af-5be6-4bd0-95fe-a4dab9e91dd1",
  "code": "205402",
  "device_ref": "sandbox-16906"
}
```

```json
{
  "session_id": "6b0daf1e-268c-4641-9f3e-a3fdd2ab8d29",
  "subject": {
    "type": "CLIENT",
    "id": "8aa048fa-d0c4-4bd8-a4be-aa6362230fcf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YWEwNDhmYS1kMGM0LTRiZDgtYTRiZS1hYTYzNjIyMzBmY2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNDU0LCJpYXQiOjE3OTMyNzA1NTQsImp0aSI6IjFhODQxNTZmLWIzOGItNDViZS04ZmY0LTNhYzkyNzg2YTAwYyIsInNpZCI6IjZiMGRhZjFlLTI2OGMtNDY0MS05ZjNlLWEzZmRkMmFiOGQyOSJ9.plmieXYigQYxOOXGKvAgxKuqtc09At9ipC5kD0OE2Ig",
  "access_expires_at": "2026-10-29T10:57:34.390438761Z",
  "refresh_token": "hrTgN_QuvKi_sWUI9G86MHC_KX0oerF9uEuwzX76Lj0",
  "refresh_expires_at": "2026-11-28T10:42:34.390123247Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bd25d1f4-2c5e-4a0b-8af1-55751ccf8ed3",
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
  "id": "b8a8a8b4-b42c-4fa6-9cb5-83dd930914fa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:47:34.575665Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 5a28dc8b-29a0-45e8-be5e-47062d13e854) → **201**

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
  "session_id": "ac50fa49-4d78-4e6d-b21f-e8278f5bb7b1",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE0NTUsImlhdCI6MTc5MzI3MDU1NSwianRpIjoiZmY0MGJjM2UtNzdiYi00MDEwLWE1ZmQtYjIwYmY4ZDk2NDgzIiwic2lkIjoiYWM1MGZhNDktNGQ3OC00ZTZkLWIyMWYtZTgyNzhmNWJiN2IxIn0.UqVha9W59h0IaGBsWRGrYbPP0pcM5zrwD9fdK4C8rVE",
  "access_expires_at": "2026-10-29T10:57:35.002720838Z",
  "refresh_token": "iM0uRwKXkhvG2YYzONb2R9UbAAi8BhDoqEwUtiqIgm8",
  "refresh_expires_at": "2026-10-29T22:42:35.002410091Z",
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
  "session_id": "1efd20f0-e994-489c-9c0c-94f972df0f49",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE0NTUsImlhdCI6MTc5MzI3MDU1NSwianRpIjoiOGFlYWVhYWItOTVjYi00Nzk2LWE5ODktZDBkOTNhMzBlNzlmIiwic2lkIjoiMWVmZDIwZjAtZTk5NC00ODljLTljMGMtOTRmOTcyZGYwZjQ5In0.yqvGyFCitALr656maZS2xJClZTfatzX3ZxqnU2sNvmY",
  "access_expires_at": "2026-10-29T10:57:35.400402817Z",
  "refresh_token": "il90R7pu0n5SobszStmapm5GjqH6iPC4I6qtZszphss",
  "refresh_expires_at": "2026-10-29T22:42:35.400059Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5c47fdbd-8a06-4557-b368-469acdba4d78/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T10:42:34.767464Z",
      "actor": {
        "type": "CLIENT",
        "id": "8aa048fa-d0c4-4bd8-a4be-aa6362230fcf",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5c47fdbd-8a06-4557-b368-469acdba4d78",
        "quote_id": "b8a8a8b4-b42c-4fa6-9cb5-83dd930914fa",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "5a28dc8b-29a0-45e8-be5e-47062d13e854"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T10:42:34.769012Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5c47fdbd-8a06-4557-b368-469acdba4d78",
        "attempt_id": "ee52d55d-f852-4ef8-bc6c-fb0a2e7ba6c6",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5a28dc8b-29a0-45e8-be5e-47062d13e854"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T10:42:34.773685Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5c47fdbd-8a06-4557-b368-469acdba4d78",
        "attempt_id": "ee52d55d-f852-4ef8-bc6c-fb0a2e7ba6c6"
      },
      "correlation_id": "5a28dc8b-29a0-45e8-be5e-47062d13e854"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "ee52d55d-f852-4ef8-bc6c-fb0a2e7ba6c6",
        "generation": 1,
        "started_at": "2026-10-29T10:42:34.768373Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T10:42:34.773685Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T10:42:34.769475Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/5a28dc8b-29a0-45e8-be5e-47062d13e854` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "5c47fdbd-8a06-4557-b368-469acdba4d78:0",
      "order_id": "5c47fdbd-8a06-4557-b368-469acdba4d78",
      "at": "2026-10-29T10:42:34.767464Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "5c47fdbd-8a06-4557-b368-469acdba4d78:1",
      "order_id": "5c47fdbd-8a06-4557-b368-469acdba4d78",
      "at": "2026-10-29T10:42:34.769012Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "5c47fdbd-8a06-4557-b368-469acdba4d78:2",
      "order_id": "5c47fdbd-8a06-4557-b368-469acdba4d78",
      "at": "2026-10-29T10:42:34.773685Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/135b3268-0e71-45b9-a95c-7309887e656e` → **200**

```json
{
  "found": []
}
```

Done: request 5a28dc8b-29a0-45e8-be5e-47062d13e854 — order 5c47fdbd-8a06-4557-b368-469acdba4d78 found by its id.

`GET /api/rider/v1/orders/5c47fdbd-8a06-4557-b368-469acdba4d78` → **200**

```json
{
  "id": "5c47fdbd-8a06-4557-b368-469acdba4d78",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8aa048fa-d0c4-4bd8-a4be-aa6362230fcf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:42:34.767038Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5c47fdbd-8a06-4557-b368-469acdba4d78/cancel` → **200**

```json
{
  "command_id": "047f1797-4f47-4e6a-8b45-7703ffe1b7af",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5c47fdbd-8a06-4557-b368-469acdba4d78",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8aa048fa-d0c4-4bd8-a4be-aa6362230fcf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T10:42:34.767038Z",
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
  "phone": "+380635363663",
  "device_ref": "sandbox-31296"
}
```

```json
{
  "challenge_id": "34333748-695f-4cf1-8484-1c1756e8ee11",
  "expires_at": "2026-10-29T10:47:36.611551495Z",
  "resend_available_at": "2026-10-29T10:42:37.611551495Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635363663` → **200**

```json
{
  "phone": "+380635363663",
  "audience": "CLIENT",
  "code": "061521",
  "sent_at": "2026-10-29T10:42:36.613609593Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "34333748-695f-4cf1-8484-1c1756e8ee11",
  "code": "061521",
  "device_ref": "sandbox-31296"
}
```

```json
{
  "session_id": "794ac555-632e-409f-9bc3-1fde6ee97eb0",
  "subject": {
    "type": "CLIENT",
    "id": "81577835-bc0e-43e6-81df-4891e7e96867"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MTU3NzgzNS1iYzBlLTQzZTYtODFkZi00ODkxZTdlOTY4NjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNDU2LCJpYXQiOjE3OTMyNzA1NTYsImp0aSI6ImZmMTRkMzhhLTAwMjYtNGU1Yy1iZDc3LTIxYTZkZjVmMDljOCIsInNpZCI6Ijc5NGFjNTU1LTYzMmUtNDA5Zi05YmMzLTFmZGU2ZWU5N2ViMCJ9.Z5uprZPd_sOXK_POHUl985-fwjbTuuTgQ9fgOI543os",
  "access_expires_at": "2026-10-29T10:57:36.818760445Z",
  "refresh_token": "awfcUIRfvQxemci7jDcHlhIttQlHA63Utr1bhquV_kw",
  "refresh_expires_at": "2026-11-28T10:42:36.818447825Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "d64ba4b7-7927-40b7-9c93-9b81c9b08dac",
  "expires_at": "2026-10-29T10:47:39.002884088Z",
  "resend_available_at": "2026-10-29T10:42:40.002884088Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635363663` → **200**

```json
{
  "phone": "+380635363663",
  "audience": "CLIENT",
  "code": "465069",
  "sent_at": "2026-10-29T10:42:39.004530127Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "8fdefbd7-f3e4-4e6f-8ef0-467cef7f0305",
  "challenge_id": "d64ba4b7-7927-40b7-9c93-9b81c9b08dac",
  "otp_code": "465069"
}
```

```json
{
  "id": "af4e7075-833b-46f1-92d4-29a792d7fedb",
  "state": "PENDING",
  "created_at": "2026-10-29T10:42:39.226748Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/af4e7075-833b-46f1-92d4-29a792d7fedb` → **200**

```json
{
  "id": "af4e7075-833b-46f1-92d4-29a792d7fedb",
  "state": "PENDING",
  "created_at": "2026-10-29T10:42:39.226748Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/af4e7075-833b-46f1-92d4-29a792d7fedb` → **200**

```json
{
  "id": "af4e7075-833b-46f1-92d4-29a792d7fedb",
  "state": "PENDING",
  "created_at": "2026-10-29T10:42:39.226748Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/af4e7075-833b-46f1-92d4-29a792d7fedb` → **200**

```json
{
  "id": "af4e7075-833b-46f1-92d4-29a792d7fedb",
  "state": "PENDING",
  "created_at": "2026-10-29T10:42:39.226748Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/af4e7075-833b-46f1-92d4-29a792d7fedb` → **200**

```json
{
  "id": "af4e7075-833b-46f1-92d4-29a792d7fedb",
  "state": "PENDING",
  "created_at": "2026-10-29T10:42:39.226748Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/af4e7075-833b-46f1-92d4-29a792d7fedb` → **200**

```json
{
  "id": "af4e7075-833b-46f1-92d4-29a792d7fedb",
  "state": "PENDING",
  "created_at": "2026-10-29T10:42:39.226748Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/af4e7075-833b-46f1-92d4-29a792d7fedb` → **200**

```json
{
  "id": "af4e7075-833b-46f1-92d4-29a792d7fedb",
  "state": "PENDING",
  "created_at": "2026-10-29T10:42:39.226748Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/af4e7075-833b-46f1-92d4-29a792d7fedb` → **200**

```json
{
  "id": "af4e7075-833b-46f1-92d4-29a792d7fedb",
  "state": "READY",
  "created_at": "2026-10-29T10:42:39.226748Z",
  "ready_at": "2026-10-29T10:42:45.908776Z",
  "expires_at": "2026-11-05T10:42:45.908776Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/af4e7075-833b-46f1-92d4-29a792d7fedb/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630131008",
  "device_ref": "sandbox-30742"
}
```

```json
{
  "challenge_id": "0e6d2ad9-ead6-404b-9c44-2fa2e546684e",
  "expires_at": "2026-10-29T10:47:46.708021892Z",
  "resend_available_at": "2026-10-29T10:42:47.708021892Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630131008` → **200**

```json
{
  "phone": "+380630131008",
  "audience": "CLIENT",
  "code": "452374",
  "sent_at": "2026-10-29T10:42:46.709830246Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e6d2ad9-ead6-404b-9c44-2fa2e546684e",
  "code": "452374",
  "device_ref": "sandbox-30742"
}
```

```json
{
  "session_id": "8de4c487-f434-4145-a1ff-83029c5764f3",
  "subject": {
    "type": "CLIENT",
    "id": "d91d2902-408b-4ce2-9771-99c6e430e19f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOTFkMjkwMi00MDhiLTRjZTItOTc3MS05OWM2ZTQzMGUxOWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNDY2LCJpYXQiOjE3OTMyNzA1NjYsImp0aSI6ImQyOGE2ZWY2LWFmODQtNDc0Mi05ZTkxLTFlMWM1MzYxMTZkMCIsInNpZCI6IjhkZTRjNDg3LWY0MzQtNDE0NS1hMWZmLTgzMDI5YzU3NjRmMyJ9.GMRA61Oiu4vUBTWnQonRLmOMvyB5RoL54ZW7JsERX-k",
  "access_expires_at": "2026-10-29T10:57:46.92029404Z",
  "refresh_token": "DuKxXmdCK27qNonVmGi6F1ge7q6xE2SJLzIeHjEYQjc",
  "refresh_expires_at": "2026-11-28T10:42:46.919932517Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/af4e7075-833b-46f1-92d4-29a792d7fedb/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/af4e7075-833b-46f1-92d4-29a792d7fedb/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0b79f9e5-4d06-4c9c-9742-5b9a9e989886"
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
  "session_id": "75283383-37ca-4cf5-8bec-a805c2200069",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE0NjcsImlhdCI6MTc5MzI3MDU2NywianRpIjoiYmUwMzZhMmItNjFlNS00MDVmLTliYTYtNGE1MzM2Mjg1MzgwIiwic2lkIjoiNzUyODMzODMtMzdjYS00Y2Y1LThiZWMtYTgwNWMyMjAwMDY5In0.XPu4QZ3bcjdt4vPUetZD_5jfxAaQtpqFePz9kDzI1-Q",
  "access_expires_at": "2026-10-29T10:57:47.495371143Z",
  "refresh_token": "ly_B4z7OSNgN34QWr6HSqE-zRMWYAw-ISgWRKWQ9FIc",
  "refresh_expires_at": "2026-10-29T22:42:47.495024652Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "81577835-bc0e-43e6-81df-4891e7e96867",
  "session_id": "794ac555-632e-409f-9bc3-1fde6ee97eb0",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/81577835-bc0e-43e6-81df-4891e7e96867/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "af4e7075-833b-46f1-92d4-29a792d7fedb",
      "state": "READY",
      "created_at": "2026-10-29T10:42:39.226748Z",
      "ready_at": "2026-10-29T10:42:45.908776Z",
      "expires_at": "2026-11-05T10:42:45.908776Z",
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
  "device_ref": "sandbox-2552"
}
```

```json
{
  "challenge_id": "5b78ad1d-49f2-4420-94eb-c2277a74e053",
  "expires_at": "2026-10-29T10:47:48.046349835Z",
  "resend_available_at": "2026-10-29T10:42:49.046349835Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "540021",
  "sent_at": "2026-10-29T10:42:48.048269494Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5b78ad1d-49f2-4420-94eb-c2277a74e053",
  "code": "540021",
  "device_ref": "sandbox-2552"
}
```

```json
{
  "session_id": "f2c911e7-c606-4ca1-8b9c-9b5d280017e0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTQ2OCwiaWF0IjoxNzkzMjcwNTY4LCJqdGkiOiI3YmIyMjNiMS03NzFjLTQ2NTYtODAwMC1iMGNlNDRjOTAwMTEiLCJzaWQiOiJmMmM5MTFlNy1jNjA2LTRjYTEtOGI5Yy05YjVkMjgwMDE3ZTAifQ.VyRNgmLPR9ubmIaOOtpFS894tK_0m8xbIAPBz2PXLK4",
  "access_expires_at": "2026-10-29T10:57:48.25580802Z",
  "refresh_token": "0MaAa-j5YTy9RT5Q_5gAp5-uWWwN1C_vDuWT50YSNdE",
  "refresh_expires_at": "2026-11-28T10:42:48.255447252Z",
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
  "device_ref": "sandbox-28676"
}
```

```json
{
  "challenge_id": "22015357-0605-489e-8abd-fb311d87d092",
  "expires_at": "2026-10-29T10:47:48.615079714Z",
  "resend_available_at": "2026-10-29T10:42:49.615079714Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "083148",
  "sent_at": "2026-10-29T10:42:48.61710697Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "22015357-0605-489e-8abd-fb311d87d092",
  "code": "083148",
  "device_ref": "sandbox-28676"
}
```

```json
{
  "session_id": "f1ab9ee7-38f3-4630-91ad-8f405ecb7f8a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTQ2OCwiaWF0IjoxNzkzMjcwNTY4LCJqdGkiOiI3M2E0N2JlOC04MWQwLTRiNzQtYTFmNC0zZDkwNDQ1ZDllOTQiLCJzaWQiOiJmMWFiOWVlNy0zOGYzLTQ2MzAtOTFhZC04ZjQwNWVjYjdmOGEifQ.k9hSYgVZkWUmDhAlHB_AlE9wBCMfy7eHSYBVQ1YnDO8",
  "access_expires_at": "2026-10-29T10:57:48.821134576Z",
  "refresh_token": "oyvJZZUrJGGxMuJiNnZgAX8vV4MbZCiYbyo4jbDIdIk",
  "refresh_expires_at": "2026-11-28T10:42:48.820696067Z",
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
  "command_id": "16bc6c49-db32-4663-a865-198aaf5c12f4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:42:49Z",
    "sequence": 1793270569183
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "64dd5d61-a267-4f63-a23c-e1dabe83b981",
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
  "last_heartbeat_at": "2026-10-29T10:42:49.19994Z",
  "last_location_at": "2026-10-29T10:42:49.19994Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-17586"
}
```

```json
{
  "challenge_id": "f7ed2c4c-1754-4be6-87fe-2e0b87faa6b8",
  "expires_at": "2026-10-29T10:47:49.378178986Z",
  "resend_available_at": "2026-10-29T10:42:50.378178986Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "336064",
  "sent_at": "2026-10-29T10:42:49.38031108Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f7ed2c4c-1754-4be6-87fe-2e0b87faa6b8",
  "code": "336064",
  "device_ref": "sandbox-17586"
}
```

```json
{
  "session_id": "60cc9c48-cf2b-45f1-a0f7-5853e8aef6b7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTQ2OSwiaWF0IjoxNzkzMjcwNTY5LCJqdGkiOiI1ZDcxYjk2MC00YWI5LTQwMjItYTBlOC0zZTg2NWEyMWYyMTQiLCJzaWQiOiI2MGNjOWM0OC1jZjJiLTQ1ZjEtYTBmNy01ODUzZThhZWY2YjcifQ.q4qjYrKk_ghGzXov22zFAjjgzMxXwvWNQpWnnT68Eo0",
  "access_expires_at": "2026-10-29T10:57:49.583991273Z",
  "refresh_token": "-1RvWe9VP8F01OHW64RJMkkyLvHns-n7Hy5872mkhr8",
  "refresh_expires_at": "2026-11-28T10:42:49.583602018Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "27827200-624b-4b45-9cb9-cfe6ea82afdc",
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
  "last_heartbeat_at": "2026-10-29T10:41:37.23451Z",
  "last_location_at": "2026-10-29T10:41:37.23451Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/27827200-624b-4b45-9cb9-cfe6ea82afdc/handover` → **200**

```json
{
  "command_id": "4b0cf01f-c62a-4751-8740-e67a3ec4e0f4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "27827200-624b-4b45-9cb9-cfe6ea82afdc",
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
  "last_heartbeat_at": "2026-10-29T10:41:37.23451Z",
  "last_location_at": "2026-10-29T10:41:37.23451Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/27827200-624b-4b45-9cb9-cfe6ea82afdc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:42:50Z",
    "sequence": 1793270570140
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "27827200-624b-4b45-9cb9-cfe6ea82afdc",
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
  "last_heartbeat_at": "2026-10-29T10:42:50.156545Z",
  "last_location_at": "2026-10-29T10:42:50.156545Z",
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
  "session_id": "a578f785-af22-4fe6-bd27-b0958ab3611d",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE0NzAsImlhdCI6MTc5MzI3MDU3MCwianRpIjoiOTY3Yzk1ZmUtMDhiMC00MzUxLWEyZDAtMThhYTk0OGQ2ZGM3Iiwic2lkIjoiYTU3OGY3ODUtYWYyMi00ZmU2LWJkMjctYjA5NThhYjM2MTFkIn0.d2h0xa--y0dwN2ieDqk5gemGCNRj4WPyr4HzfaCZ8E4",
  "access_expires_at": "2026-10-29T10:57:50.550343154Z",
  "refresh_token": "7pCvc0FkS6Cn_tNKvguLptLQx_kdSxE-OmpU_OdStSw",
  "refresh_expires_at": "2026-10-29T22:42:50.549980269Z",
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
  "session_id": "86511570-636e-4995-9b2b-260f861ad1d0",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE0NzAsImlhdCI6MTc5MzI3MDU3MCwianRpIjoiOWQ4MzU2ODYtNjVhOC00ODI2LTg0MTEtZjJiMmNmYzI3ZDY2Iiwic2lkIjoiODY1MTE1NzAtNjM2ZS00OTk1LTliMmItMjYwZjg2MWFkMWQwIn0.I0mmc2tqoc745k-qKJdNATFrSXEmUNo8sfABG4DH09w",
  "access_expires_at": "2026-10-29T10:57:50.938977294Z",
  "refresh_token": "baUp7kxaxa_PeWRgkE1IooIPGv8VgD8pIdl4Q8dwSxo",
  "refresh_expires_at": "2026-10-29T22:42:50.938625645Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380680357353",
  "device_ref": "sandbox-8193"
}
```

```json
{
  "challenge_id": "a58f0a8b-8b12-44b8-bbdf-16b8a5de5f1d",
  "expires_at": "2026-10-29T10:47:51.11720072Z",
  "resend_available_at": "2026-10-29T10:42:52.11720072Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380680357353` → **200**

```json
{
  "phone": "+380680357353",
  "audience": "CLIENT",
  "code": "197800",
  "sent_at": "2026-10-29T10:42:51.119577125Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a58f0a8b-8b12-44b8-bbdf-16b8a5de5f1d",
  "code": "197800",
  "device_ref": "sandbox-8193"
}
```

```json
{
  "session_id": "55a01e05-d5b8-46ca-be4d-3a050f46e14a",
  "subject": {
    "type": "CLIENT",
    "id": "295f8b35-d8d5-45c8-8f69-b73012a06c9d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOTVmOGIzNS1kOGQ1LTQ1YzgtOGY2OS1iNzMwMTJhMDZjOWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNDcxLCJpYXQiOjE3OTMyNzA1NzEsImp0aSI6ImJkNDZiNzFlLTVjYmEtNDZiNC04MGUyLWIyMjNiYjRjMmMzNiIsInNpZCI6IjU1YTAxZTA1LWQ1YjgtNDZjYS1iZTRkLTNhMDUwZjQ2ZTE0YSJ9.baiD_3u-xXQNtkifRthcARF_3hzAriaMJY0xN8rwFnw",
  "access_expires_at": "2026-10-29T10:57:51.335195896Z",
  "refresh_token": "i99EV7KYz0k4u8JLYB7ib0tZXiD2LeiVmK74KmE3wuk",
  "refresh_expires_at": "2026-11-28T10:42:51.334875084Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6b85a506-db0d-48cb-82da-f083b1b604b0",
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
  "id": "6f6ed984-cc1d-46c4-a455-88dbeff1a7fe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:47:51.522035Z",
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
  "command_id": "ff03fcd4-4955-4e13-a4cb-31c844e3f84d",
  "quote_id": "6f6ed984-cc1d-46c4-a455-88dbeff1a7fe",
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
  "id": "3e859c4a-1e9b-418b-9355-6fafc20b801b",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "295f8b35-d8d5-45c8-8f69-b73012a06c9d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T10:42:51.72388Z",
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
    "id": "38f160d0-320f-446b-8df8-0340e8ac245a",
    "order_id": "3e859c4a-1e9b-418b-9355-6fafc20b801b",
    "expires_at": "2026-10-29T10:43:06.726153Z",
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

`POST /api/driver/v1/offers/38f160d0-320f-446b-8df8-0340e8ac245a/reject` → **204**

```json
{
  "command_id": "66bbbaa8-4ede-4fa4-a8a2-5fd606c5c0fa"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "72240ea7-709d-40a7-b6ca-fe2ce19b5957",
    "order_id": "3e859c4a-1e9b-418b-9355-6fafc20b801b",
    "expires_at": "2026-10-29T10:43:07.108036Z",
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

`POST /api/driver/v1/offers/72240ea7-709d-40a7-b6ca-fe2ce19b5957/accept` → **200**

```json
{
  "command_id": "5183d89f-85be-490b-9327-ed5cbeafd982"
}
```

```json
{
  "id": "31df258f-134c-4e47-b328-7b62a7718098",
  "order_id": "3e859c4a-1e9b-418b-9355-6fafc20b801b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bbc47dc2-3c11-4950-bdd2-12fbe20b029f",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/3e859c4a-1e9b-418b-9355-6fafc20b801b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T10:42:51.724245Z",
      "actor": {
        "type": "CLIENT",
        "id": "295f8b35-d8d5-45c8-8f69-b73012a06c9d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "3e859c4a-1e9b-418b-9355-6fafc20b801b",
        "quote_id": "6f6ed984-cc1d-46c4-a455-88dbeff1a7fe",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "178bdbd7-bf44-4914-a74e-09f1805aefe9"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T10:42:51.725629Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3e859c4a-1e9b-418b-9355-6fafc20b801b",
        "attempt_id": "fd39837c-60a2-409d-98cc-deca200e556c",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "178bdbd7-bf44-4914-a74e-09f1805aefe9"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T10:42:51.72814Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "38f160d0-320f-446b-8df8-0340e8ac245a",
        "order_id": "3e859c4a-1e9b-418b-9355-6fafc20b801b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "178bdbd7-bf44-4914-a74e-09f1805aefe9"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T10:42:52.107425Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "38f160d0-320f-446b-8df8-0340e8ac245a",
        "order_id": "3e859c4a-1e9b-418b-9355-6fafc20b801b"
      },
      "correlation_id": "6cce8d1e-c57a-4f7a-a9a6-bbc097fcb8ba"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 3e859c4a-1e9b-418b-9355-6fafc20b801b — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/3e859c4a-1e9b-418b-9355-6fafc20b801b` → **200**

```json
{
  "id": "3e859c4a-1e9b-418b-9355-6fafc20b801b",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "295f8b35-d8d5-45c8-8f69-b73012a06c9d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "31df258f-134c-4e47-b328-7b62a7718098",
    "order_id": "3e859c4a-1e9b-418b-9355-6fafc20b801b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "bbc47dc2-3c11-4950-bdd2-12fbe20b029f",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T10:42:51.72388Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3e859c4a-1e9b-418b-9355-6fafc20b801b/cancel` → **200**

```json
{
  "command_id": "42c6760b-94c6-4bd5-bce6-b7c719475b08",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "3e859c4a-1e9b-418b-9355-6fafc20b801b",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "295f8b35-d8d5-45c8-8f69-b73012a06c9d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "31df258f-134c-4e47-b328-7b62a7718098",
    "order_id": "3e859c4a-1e9b-418b-9355-6fafc20b801b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "bbc47dc2-3c11-4950-bdd2-12fbe20b029f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T10:42:51.72388Z",
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
  "session_id": "64dd5d61-a267-4f63-a23c-e1dabe83b981",
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
  "last_heartbeat_at": "2026-10-29T10:42:49.19994Z",
  "last_location_at": "2026-10-29T10:42:49.19994Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/64dd5d61-a267-4f63-a23c-e1dabe83b981/close` → **200**

```json
{
  "command_id": "2c441ed2-ec3c-4d13-bfcd-1a2a77bae1aa",
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
  "session_id": "27827200-624b-4b45-9cb9-cfe6ea82afdc",
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
  "last_heartbeat_at": "2026-10-29T10:42:50.156545Z",
  "last_location_at": "2026-10-29T10:42:50.156545Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/27827200-624b-4b45-9cb9-cfe6ea82afdc/close` → **200**

```json
{
  "command_id": "f22725ac-cd76-43fd-8619-71580902d3e3",
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
  "session_id": "08ac9d0d-30d5-409e-a5a3-86e5a7f885ce",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE0NzQsImlhdCI6MTc5MzI3MDU3NCwianRpIjoiYTJkMjZmMGEtNTZkYi00MjVmLWE3ZWYtYjU2YmZjNjcwMmJjIiwic2lkIjoiMDhhYzlkMGQtMzBkNS00MDllLWE1YTMtODZlNWE3Zjg4NWNlIn0.g-B-ma1rp8ajuT6hLCJB6K8ViFr3BONrF3tqW3CICgc",
  "access_expires_at": "2026-10-29T10:57:54.095229739Z",
  "refresh_token": "EvsXQeyjETtE6QDDrLaiyC69_t6dI_a6bj52LcSNkyg",
  "refresh_expires_at": "2026-10-29T22:42:54.094820986Z",
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
  "command_id": "9986ed86-24c8-4511-874d-3399009408b4",
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
  "changed_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T10:42:54.479267Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "7af276c5-f26b-46f1-83ce-2cdd046d32a2",
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
  "correlation_id": "a0287d85-c2ea-4934-af17-a92eba9ab991"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "f0273fb4-a644-4d86-8d7d-b02f12af1e8d",
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
  "correlation_id": "8e15bd95-37e9-42b1-a8d8-4cea2eac9690"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638096750",
  "device_ref": "sandbox-28692"
}
```

```json
{
  "challenge_id": "8ae63487-9db5-4e17-a552-0c61703e9fe7",
  "expires_at": "2026-10-29T10:47:55.035989094Z",
  "resend_available_at": "2026-10-29T10:42:56.035989094Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638096750` → **200**

```json
{
  "phone": "+380638096750",
  "audience": "CLIENT",
  "code": "573512",
  "sent_at": "2026-10-29T10:42:55.038145159Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ae63487-9db5-4e17-a552-0c61703e9fe7",
  "code": "573512",
  "device_ref": "sandbox-28692"
}
```

```json
{
  "session_id": "0be5e69c-1b34-48dd-848f-8dd263dfa5a3",
  "subject": {
    "type": "CLIENT",
    "id": "3fb63b17-9f85-4edf-9ae2-bebb4609cb2e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZmI2M2IxNy05Zjg1LTRlZGYtOWFlMi1iZWJiNDYwOWNiMmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNDc1LCJpYXQiOjE3OTMyNzA1NzUsImp0aSI6ImE0NjRiZGFjLTQyMTQtNGY2Yi04OWUzLWVkMzkzYjc5NDI0MCIsInNpZCI6IjBiZTVlNjljLTFiMzQtNDhkZC04NDhmLThkZDI2M2RmYTVhMyJ9.KNhorA0G_BfpTiFg4UMw2KeGXBMncW6mSO5whXEcLPs",
  "access_expires_at": "2026-10-29T10:57:55.239522962Z",
  "refresh_token": "SpQiANFZ0Z5ZHonc3gNFmF1GTxzfv-0vaF_JYQAx-MI",
  "refresh_expires_at": "2026-11-28T10:42:55.239150031Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a9e91615-8b9f-48ee-9ba0-8b1f7d9f6eb1",
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
  "id": "c920231a-4e6f-4f79-ad13-e7bd494f8828",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:47:55.425580Z",
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
  "command_id": "3b064c28-e84f-4334-aa98-95642193e332",
  "quote_id": "c920231a-4e6f-4f79-ad13-e7bd494f8828",
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
  "correlation_id": "55916d00-98c4-41e7-964f-aab912c178ee"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "de153937-14d9-4743-9317-7c4aec1447e7",
  "quote_id": "c920231a-4e6f-4f79-ad13-e7bd494f8828",
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
  "id": "f98291c8-9add-4482-95aa-01da1aedce21",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3fb63b17-9f85-4edf-9ae2-bebb4609cb2e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:42:55.802908Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f98291c8-9add-4482-95aa-01da1aedce21/cancel` → **200**

```json
{
  "command_id": "eadf127f-54a2-4d18-8b6e-ff3fb28bc109",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f98291c8-9add-4482-95aa-01da1aedce21",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3fb63b17-9f85-4edf-9ae2-bebb4609cb2e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T10:42:55.802908Z",
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
  "command_id": "dceff7a6-e0cf-4e76-81ae-426e891ad9b1",
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
  "changed_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T10:42:56.219825Z"
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
      "changed_by": "c8491122-a379-432e-880c-2c074e7909b2",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T10:42:56.219825Z"
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
  "device_ref": "sandbox-26800"
}
```

```json
{
  "challenge_id": "8f1eb6cd-5a58-4957-98ea-09c7419ee3f0",
  "expires_at": "2026-10-29T10:47:56.797137107Z",
  "resend_available_at": "2026-10-29T10:42:57.797137107Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "648893",
  "sent_at": "2026-10-29T10:42:56.799247617Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f1eb6cd-5a58-4957-98ea-09c7419ee3f0",
  "code": "648893",
  "device_ref": "sandbox-26800"
}
```

```json
{
  "session_id": "51d44943-c621-420c-b6ff-fdc423d85424",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTQ3NywiaWF0IjoxNzkzMjcwNTc3LCJqdGkiOiI2YzUwZWVkZC0yNTUwLTQ5YzAtYjM4Yi00MmI5M2IwYjExODkiLCJzaWQiOiI1MWQ0NDk0My1jNjIxLTQyMGMtYjZmZi1mZGM0MjNkODU0MjQifQ.VXQg2dNVqFg3iu46wIRADA0cu-avgrOeuBQO5VathT0",
  "access_expires_at": "2026-10-29T10:57:57.000957594Z",
  "refresh_token": "-9QCk5XBLOEokJE22PT21uGOnvoSwPCK8YtsKJQrkN8",
  "refresh_expires_at": "2026-11-28T10:42:57.000622821Z",
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
  "command_id": "6c8a49d0-843b-475e-ae1b-b1ac4112a594",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:42:57Z",
    "sequence": 1793270577359
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a7dde1f4-d8b9-4cf9-a7b2-860f2ab6a2d9",
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
  "last_heartbeat_at": "2026-10-29T10:42:57.375456Z",
  "last_location_at": "2026-10-29T10:42:57.375456Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674456842",
  "device_ref": "sandbox-19514"
}
```

```json
{
  "challenge_id": "2d7aecef-77e3-42b2-87ce-48c66ca25afb",
  "expires_at": "2026-10-29T10:47:57.560742221Z",
  "resend_available_at": "2026-10-29T10:42:58.560742221Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674456842` → **200**

```json
{
  "phone": "+380674456842",
  "audience": "CLIENT",
  "code": "471469",
  "sent_at": "2026-10-29T10:42:57.562614895Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2d7aecef-77e3-42b2-87ce-48c66ca25afb",
  "code": "471469",
  "device_ref": "sandbox-19514"
}
```

```json
{
  "session_id": "d63d6648-d153-48b5-a836-fac02c0697b2",
  "subject": {
    "type": "CLIENT",
    "id": "4cb1a479-b606-41c3-a447-0ba8999adef6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2IxYTQ3OS1iNjA2LTQxYzMtYTQ0Ny0wYmE4OTk5YWRlZjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNDc3LCJpYXQiOjE3OTMyNzA1NzcsImp0aSI6IjY1YjljYzFmLTgxYzktNGRkNC1hMzNhLWZkNGVmNDU3M2IxNCIsInNpZCI6ImQ2M2Q2NjQ4LWQxNTMtNDhiNS1hODM2LWZhYzAyYzA2OTdiMiJ9.iS-VIIO04fpoJYWVBa6pSL00GhOz0H1TMr3UxF8dfYo",
  "access_expires_at": "2026-10-29T10:57:57.769229352Z",
  "refresh_token": "KcYHXaS4M2tlrGhYQJ2FKild5jam1la5QbAaNG4w2Hw",
  "refresh_expires_at": "2026-11-28T10:42:57.768891925Z",
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
  "command_id": "90cd3416-2c82-4938-86b7-54b4e8ef9f4a",
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
  "id": "4c6413d7-a7a2-44ca-85ff-6fa74f227d51",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:47:58.136590Z",
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
  "command_id": "c20d6bdc-a683-4c17-965e-140a4660a02b",
  "platform": "ANDROID",
  "token": "sandbox-driver-c89bc02e-47cc-48a0-a7b7-67e49cfeadd1"
}
```

```json
{
  "id": "906f9f2c-d689-4a5b-8ee1-4ae5978be73d",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T10:42:58.338464Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "cedb126e-0c94-437f-a6e0-30aa581d6fd9",
  "platform": "ANDROID",
  "token": "sandbox-rider-fff17cb9-65b2-44f1-9e39-2c75f04cf993"
}
```

```json
{
  "id": "1863ba0d-369c-423d-b30b-837b0e4d3367",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T10:42:58.526585Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6812e362-475d-4842-b6e3-993a3e4498c4",
  "quote_id": "4c6413d7-a7a2-44ca-85ff-6fa74f227d51",
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
  "id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4cb1a479-b606-41c3-a447-0ba8999adef6",
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
  "created_at": "2026-10-29T10:42:58.722951Z",
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
    "id": "d44482ae-c081-4cd4-82b3-a07984839d24",
    "order_id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
    "expires_at": "2026-10-29T10:43:13.725075Z",
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

`POST /api/driver/v1/offers/d44482ae-c081-4cd4-82b3-a07984839d24/accept` → **200**

```json
{
  "command_id": "66a19ab5-cdec-485e-a9c1-83d9caa3abbb"
}
```

```json
{
  "id": "c2be6e0c-8bc3-4e67-8148-e8389adde2e5",
  "order_id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ba857724-dfb0-41c7-bddd-e258f9dc104d",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T10:42:58.702Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T10:42:58.702Z` → **200**

```json
[
  {
    "at": "2026-10-29T10:43:00.188504842Z",
    "token_suffix": "feadd1",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
      "order_version": "2",
      "event_id": "588f870b-14cf-422a-abfa-dac511dc96f4",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674456842&after=2026-10-29T10:42:58.702Z` → **200**

```json
[
  {
    "at": "2026-10-29T10:43:00.190061386Z",
    "token_suffix": "4cf993",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
      "order_version": "3",
      "event_id": "1d622520-876e-45da-a9f1-7c9b1f56e2bc",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/82585a1d-07d1-4f80-8eea-92b2710479fe/messages` → **201**

```json
{
  "command_id": "faf3de42-899f-4315-9b84-3e8ae655de70",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "76136296-96d6-41ee-b6ec-97e5dbdba369",
  "order_id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T10:43:00.360698981Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ba857724-dfb0-41c7-bddd-e258f9dc104d",
  "order_id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
  "assignment_id": "c2be6e0c-8bc3-4e67-8148-e8389adde2e5",
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

`POST /api/driver/v1/trips/ba857724-dfb0-41c7-bddd-e258f9dc104d/messages` → **201**

```json
{
  "command_id": "83944e15-b6fa-4562-87be-1ac13a1a71fe",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "daff65cb-c306-4448-ad26-5288ba421c26",
  "order_id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T10:43:00.728034643Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/82585a1d-07d1-4f80-8eea-92b2710479fe/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/ba857724-dfb0-41c7-bddd-e258f9dc104d/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674456842"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/a7dde1f4-d8b9-4cf9-a7b2-860f2ab6a2d9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:43:01Z",
    "sequence": 1793270581263
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a7dde1f4-d8b9-4cf9-a7b2-860f2ab6a2d9",
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
  "last_heartbeat_at": "2026-10-29T10:43:01.279137Z",
  "last_location_at": "2026-10-29T10:43:01.279137Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ba857724-dfb0-41c7-bddd-e258f9dc104d",
  "order_id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
  "assignment_id": "c2be6e0c-8bc3-4e67-8148-e8389adde2e5",
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

`POST /api/driver/v1/trips/ba857724-dfb0-41c7-bddd-e258f9dc104d/arrive` → **200**

```json
{
  "command_id": "5faad7e0-9184-4304-bfbd-6b4caa6116b9",
  "expected_version": 0
}
```

```json
{
  "id": "ba857724-dfb0-41c7-bddd-e258f9dc104d",
  "order_id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
  "assignment_id": "c2be6e0c-8bc3-4e67-8148-e8389adde2e5",
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
  "arrived_at": "2026-10-29T10:43:01.636505Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ba857724-dfb0-41c7-bddd-e258f9dc104d/start` → **200**

```json
{
  "command_id": "1ce259d5-b059-4a7f-8242-cde23e4ba048",
  "expected_version": 1
}
```

```json
{
  "id": "ba857724-dfb0-41c7-bddd-e258f9dc104d",
  "order_id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
  "assignment_id": "c2be6e0c-8bc3-4e67-8148-e8389adde2e5",
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
  "arrived_at": "2026-10-29T10:43:01.636505Z",
  "started_at": "2026-10-29T10:43:01.839078Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/a7dde1f4-d8b9-4cf9-a7b2-860f2ab6a2d9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:43:02Z",
    "sequence": 1793270582249
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a7dde1f4-d8b9-4cf9-a7b2-860f2ab6a2d9",
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
  "last_heartbeat_at": "2026-10-29T10:43:02.040696Z",
  "last_location_at": "2026-10-29T10:43:02.040696Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/ba857724-dfb0-41c7-bddd-e258f9dc104d/complete` → **200**

```json
{
  "command_id": "3264be5b-b2d7-4371-8478-186c7b2e2558",
  "expected_version": 2,
  "reported_at": "2026-10-29T10:43:02Z",
  "cash_received": true
}
```

```json
{
  "id": "ba857724-dfb0-41c7-bddd-e258f9dc104d",
  "order_id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
  "assignment_id": "c2be6e0c-8bc3-4e67-8148-e8389adde2e5",
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
  "arrived_at": "2026-10-29T10:43:01.636505Z",
  "started_at": "2026-10-29T10:43:01.839078Z",
  "completed_at": "2026-10-29T10:43:02.229077Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/82585a1d-07d1-4f80-8eea-92b2710479fe` → **200**

```json
{
  "id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "4cb1a479-b606-41c3-a447-0ba8999adef6",
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
    "id": "c2be6e0c-8bc3-4e67-8148-e8389adde2e5",
    "order_id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ba857724-dfb0-41c7-bddd-e258f9dc104d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T10:42:58.722951Z",
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
    "id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-29T10:42:58.722951Z",
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
    "id": "ba857724-dfb0-41c7-bddd-e258f9dc104d",
    "order_id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
    "order_short_number": 13,
    "created_at": "2026-10-29T10:42:59.104663Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "8f194e29-7d36-4d8f-a476-d14c30b73189",
    "order_id": "e80319e8-9d3c-46ea-b2a2-c8e60162a943",
    "order_short_number": 8,
    "created_at": "2026-10-29T10:42:02.615311Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "d999e97e-96e3-4fe8-badb-6c7cad72cce3",
    "order_id": "658de42b-8585-4c3b-aa05-a6b096907e22",
    "order_short_number": 3,
    "created_at": "2026-10-29T10:41:29.458172Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "916abeaf-d8db-444e-b475-73871d8e633f",
    "order_id": "a6e7b62e-7d08-4791-88fe-876b52d7f51c",
    "order_short_number": 2,
    "created_at": "2026-10-29T10:41:18.234315Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "1745da78-665d-43cd-9825-a5e21a793b48",
    "order_id": "720cddfe-ae20-4952-9410-c67e28f8db59",
    "order_short_number": 1,
    "created_at": "2026-10-29T10:41:11.798455Z",
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

`GET /api/rider/v1/orders/82585a1d-07d1-4f80-8eea-92b2710479fe/tip` → **200**

```json
{
  "order_id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
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
  "available_until": "2026-10-30T10:43:02.229077Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/82585a1d-07d1-4f80-8eea-92b2710479fe/tip` → **201**

```json
{
  "command_id": "3dd75b97-c366-44ce-a0ce-180c0c6816f8",
  "amount_minor": 1100
}
```

```json
{
  "id": "1ab76f02-787f-4aef-b047-87790ac79182",
  "order_id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T10:43:06.554224Z"
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
  "session_id": "a7b6c3b3-9380-4b56-9530-3653279aeedf",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE0ODYsImlhdCI6MTc5MzI3MDU4NiwianRpIjoiMjRmZDBlMjEtOWRjNi00ZTA2LWI1NDgtMmY0MGMyNGMwMGQ0Iiwic2lkIjoiYTdiNmMzYjMtOTM4MC00YjU2LTk1MzAtMzY1MzI3OWFlZWRmIn0.979avWnQuwNDO7-7fGlcPt3p7kfHHwhcPlpsBs95dtA",
  "access_expires_at": "2026-10-29T10:58:06.952229022Z",
  "refresh_token": "OI3zR0zOx7rfqGj0PaiB1zQHMCFK-rtf6LBl2oJ9To4",
  "refresh_expires_at": "2026-10-29T22:43:06.951865096Z",
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
  "generated_at": "2026-10-29T10:43:07.148862626Z"
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
  "generated_at": "2026-10-29T10:43:07.337881532Z"
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
  "session_id": "2e4e7a9a-3790-4196-aadc-ff82c04ce6e1",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE0ODcsImlhdCI6MTc5MzI3MDU4NywianRpIjoiZGY2NmFjMGUtYzEyZS00MDI4LTk4MjItNTkxOGNkODYzMjFiIiwic2lkIjoiMmU0ZTdhOWEtMzc5MC00MTk2LWFhZGMtZmY4MmMwNGNlNmUxIn0.lcyCl7O_QJtOfCuOp6U__hc_tEy2lyf-Xlmhb5dRyf4",
  "access_expires_at": "2026-10-29T10:58:07.732760158Z",
  "refresh_token": "MTK6AWj9eL9ADhNJderBzH1BeVt2AlvBEfnRwFSGuDI",
  "refresh_expires_at": "2026-10-29T22:43:07.732445435Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/82585a1d-07d1-4f80-8eea-92b2710479fe/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T10:42:58.723342Z",
      "actor": {
        "type": "CLIENT",
        "id": "4cb1a479-b606-41c3-a447-0ba8999adef6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
        "quote_id": "4c6413d7-a7a2-44ca-85ff-6fa74f227d51",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "70b9bbbd-da7a-481d-ac7d-bbb85161bba7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T10:42:58.724625Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
        "attempt_id": "d12f20e2-c97e-408f-9aa3-95583e9f0e24",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "70b9bbbd-da7a-481d-ac7d-bbb85161bba7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T10:42:58.726421Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d44482ae-c081-4cd4-82b3-a07984839d24",
        "order_id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "70b9bbbd-da7a-481d-ac7d-bbb85161bba7"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T10:42:59.105638Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "d44482ae-c081-4cd4-82b3-a07984839d24",
        "order_id": "82585a1d-07d1-4f80-8eea-92b2710479fe",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "c2be6e0c-8bc3-4e67-8148-e8389adde2e5"
      },
      "correlation_id": "517fcf76-76a1-4a64-8fc3-c3056e700320"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T10:43:08.113114216Z",
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
      "last_location_at": "2026-10-29T10:43:02.040696Z",
      "order_id": null
    }
  ]
}
```

Done: order 82585a1d-07d1-4f80-8eea-92b2710479fe.

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
  "session_id": "2873c372-cd39-4e51-a172-04200d97c040",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE0ODgsImlhdCI6MTc5MzI3MDU4OCwianRpIjoiNGZlYmQxODctOWI4MC00Zjg1LWE4NWMtYTQ0M2I5YmNhMGVlIiwic2lkIjoiMjg3M2MzNzItY2QzOS00ZTUxLWExNzItMDQyMDBkOTdjMDQwIn0.BNWW0yKwj2C7OmhuX1-GwoU6L6I_6Ms0uKN5v0dp0eI",
  "access_expires_at": "2026-10-29T10:58:08.525005986Z",
  "refresh_token": "3VzKfr2ACqscdYNuMj5hBF-nFEL43VfBqeM_TMSlyGs",
  "refresh_expires_at": "2026-10-29T22:43:08.524679926Z",
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
  "command_id": "27e78411-2084-4b51-9d84-5a3a5d0aed3f",
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
  "timestamp": "2026-10-29T10:43:09.000+0000",
  "channel": {
    "id": "1730052000.618515656",
    "linkedid": "1730052000.618515656",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673082523"
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
  "timestamp": "2026-10-29T10:43:09.000+0000",
  "channel": {
    "id": "1730052000.618515656",
    "linkedid": "1730052000.618515656",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673082523"
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
  "session_id": "94ab1c26-3762-4eaf-9343-bfafea30319a",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE0ODksImlhdCI6MTc5MzI3MDU4OSwianRpIjoiNzQxYTBiYjYtNjViMy00NWU3LTg3NGItNmUzMmY5MGQ2MmMzIiwic2lkIjoiOTRhYjFjMjYtMzc2Mi00ZWFmLTkzNDMtYmZhZmVhMzAzMTlhIn0.1rEX17aDxvzAofJLgoYwaXBE9jJXHuY6Wqurt-zUORE",
  "access_expires_at": "2026-10-29T10:58:09.327557099Z",
  "refresh_token": "a10kwpFlmPpxnk1HEYpMOfaLY8AdIKTZYXoTIrWZdDQ",
  "refresh_expires_at": "2026-10-29T22:43:09.327150723Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "d57a4f0f-89db-43cb-bbc5-f89729ccbe2e",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673082523",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T10:43:09Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/d57a4f0f-89db-43cb-bbc5-f89729ccbe2e/answer` → **200**

```json
{
  "command_id": "9efc5347-33a3-41e9-a4a0-5b85df5d9a7c"
}
```

```json
{
  "id": "d57a4f0f-89db-43cb-bbc5-f89729ccbe2e",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673082523",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "order_ids": [],
  "started_at": "2026-10-29T10:43:09Z",
  "answered_at": "2026-10-29T10:43:09.709008Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.618515656",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "27ddc3f7-06c5-4c04-981a-a6b75a20f04a",
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
  "id": "9c967b00-aaee-4aa3-acb0-aae776b5d05e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:48:09.936507Z",
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
  "command_id": "06dec1f3-b83a-481d-ad4b-5b3e100e4c4d",
  "quote_id": "9c967b00-aaee-4aa3-acb0-aae776b5d05e",
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
    "phone": "+380673082523"
  },
  "call_id": "d57a4f0f-89db-43cb-bbc5-f89729ccbe2e"
}
```

```json
{
  "id": "ae8a0cc4-4d05-4f31-a5af-b004ea65e88d",
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
  "created_at": "2026-10-29T10:43:10.13804Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673082523"
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
    "id": "1730052000.618515656",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "d57a4f0f-89db-43cb-bbc5-f89729ccbe2e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673082523",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c8491122-a379-432e-880c-2c074e7909b2",
      "order_ids": [
        "ae8a0cc4-4d05-4f31-a5af-b004ea65e88d"
      ],
      "started_at": "2026-10-29T10:43:09Z",
      "answered_at": "2026-10-29T10:43:09.709008Z",
      "ended_at": "2026-10-29T10:43:10.344514Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "65b91525-80fb-4e33-a3cd-98bb6018fc9c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671308245",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c8491122-a379-432e-880c-2c074e7909b2",
      "order_ids": [],
      "started_at": "2026-10-29T10:41:24.457113Z",
      "answered_at": "2026-10-29T10:41:24.666846Z",
      "ended_at": "2026-10-29T10:41:24.869832Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T10:41:25.895156Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/ae8a0cc4-4d05-4f31-a5af-b004ea65e88d` → **200**

```json
{
  "id": "ae8a0cc4-4d05-4f31-a5af-b004ea65e88d",
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
  "created_at": "2026-10-29T10:43:10.13804Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673082523"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/ae8a0cc4-4d05-4f31-a5af-b004ea65e88d` → **200**

```json
{
  "id": "ae8a0cc4-4d05-4f31-a5af-b004ea65e88d",
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
  "created_at": "2026-10-29T10:43:10.13804Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673082523"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ae8a0cc4-4d05-4f31-a5af-b004ea65e88d/cancel` → **200**

```json
{
  "command_id": "e55dfef3-d22c-4575-8325-182cf6cb8203",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ae8a0cc4-4d05-4f31-a5af-b004ea65e88d",
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
  "created_at": "2026-10-29T10:43:10.13804Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673082523"
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

Done: call d57a4f0f-89db-43cb-bbc5-f89729ccbe2e with order ae8a0cc4-4d05-4f31-a5af-b004ea65e88d.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23200"
}
```

```json
{
  "challenge_id": "07c60c8d-1767-4ca3-bcd1-eb31a5c6aad1",
  "expires_at": "2026-10-29T10:48:11.149186188Z",
  "resend_available_at": "2026-10-29T10:43:12.149186188Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "098859",
  "sent_at": "2026-10-29T10:43:11.151202929Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "07c60c8d-1767-4ca3-bcd1-eb31a5c6aad1",
  "code": "098859",
  "device_ref": "sandbox-23200"
}
```

```json
{
  "session_id": "dae32f5e-8c64-4bb8-9021-39994d89bbd3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTQ5MSwiaWF0IjoxNzkzMjcwNTkxLCJqdGkiOiIzYzY2NjIyNy1jYWZjLTRjMGYtODdhZi0xMWRhMmU5MzUyYjciLCJzaWQiOiJkYWUzMmY1ZS04YzY0LTRiYjgtOTAyMS0zOTk5NGQ4OWJiZDMifQ.0hrwvk17j4eHjdEgOD8slX7jWGYiW2PJ3RLEJsBW8bo",
  "access_expires_at": "2026-10-29T10:58:11.358407846Z",
  "refresh_token": "l8FD50f7Hg81j8btTc4tUJiO5xrxy0SrdhCBIse6kLY",
  "refresh_expires_at": "2026-11-28T10:43:11.358050559Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a7dde1f4-d8b9-4cf9-a7b2-860f2ab6a2d9",
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
  "last_heartbeat_at": "2026-10-29T10:43:02.040696Z",
  "last_location_at": "2026-10-29T10:43:02.040696Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a7dde1f4-d8b9-4cf9-a7b2-860f2ab6a2d9/handover` → **200**

```json
{
  "command_id": "75912025-f760-4f93-abb7-0612dee14a76",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a7dde1f4-d8b9-4cf9-a7b2-860f2ab6a2d9",
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
  "last_heartbeat_at": "2026-10-29T10:43:02.040696Z",
  "last_location_at": "2026-10-29T10:43:02.040696Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a7dde1f4-d8b9-4cf9-a7b2-860f2ab6a2d9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:43:11Z",
    "sequence": 1793270591911
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a7dde1f4-d8b9-4cf9-a7b2-860f2ab6a2d9",
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
  "last_heartbeat_at": "2026-10-29T10:43:11.927926Z",
  "last_location_at": "2026-10-29T10:43:11.927926Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667186230",
  "device_ref": "sandbox-1125"
}
```

```json
{
  "challenge_id": "72d3ed7e-758b-4822-bd09-fe98af5a29cd",
  "expires_at": "2026-10-29T10:48:12.11037573Z",
  "resend_available_at": "2026-10-29T10:43:13.11037573Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667186230` → **200**

```json
{
  "phone": "+380667186230",
  "audience": "CLIENT",
  "code": "177996",
  "sent_at": "2026-10-29T10:43:12.11286724Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "72d3ed7e-758b-4822-bd09-fe98af5a29cd",
  "code": "177996",
  "device_ref": "sandbox-1125"
}
```

```json
{
  "session_id": "e87d0ef0-1d9f-403a-8279-affeba25b28d",
  "subject": {
    "type": "CLIENT",
    "id": "f530b7c1-7126-4c1f-b0ab-f162208764fc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNTMwYjdjMS03MTI2LTRjMWYtYjBhYi1mMTYyMjA4NzY0ZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNDkyLCJpYXQiOjE3OTMyNzA1OTIsImp0aSI6Ijg3NGQ1YzBiLTljYjMtNDYyMy1iZTNkLTA0ODk3YmMzMTFlNiIsInNpZCI6ImU4N2QwZWYwLTFkOWYtNDAzYS04Mjc5LWFmZmViYTI1YjI4ZCJ9.0jBzkHHvaZ8hOfZDBGFZCWpcU2Cs1InFTixWHZEl7nU",
  "access_expires_at": "2026-10-29T10:58:12.325780748Z",
  "refresh_token": "DpKGvMvjnpltndzW_tWmD2P9UIdxnPWw64btgTOBETI",
  "refresh_expires_at": "2026-11-28T10:43:12.325470612Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f4ede34b-b296-4e1e-b70d-50a491f1530c",
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
  "id": "eabeb8e2-4f9c-4a81-a294-68e846fa7f57",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:48:12.514198Z",
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
  "command_id": "91a670cb-cb58-40e4-8333-8199170a6f04",
  "quote_id": "eabeb8e2-4f9c-4a81-a294-68e846fa7f57",
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
  "id": "12c8d52f-4b6c-461d-9eba-e84476b165f5",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f530b7c1-7126-4c1f-b0ab-f162208764fc",
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
  "created_at": "2026-10-29T10:43:12.702399Z",
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
    "id": "b496700f-9ea4-4fbf-a628-b996d7193a51",
    "order_id": "12c8d52f-4b6c-461d-9eba-e84476b165f5",
    "expires_at": "2026-10-29T10:43:27.704365Z",
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

`POST /api/driver/v1/offers/b496700f-9ea4-4fbf-a628-b996d7193a51/accept` → **200**

```json
{
  "command_id": "4be3f456-c9a4-4650-a184-2a26ee4238cc"
}
```

```json
{
  "id": "714e9009-7a97-4aad-a0e2-9ec6fda2377d",
  "order_id": "12c8d52f-4b6c-461d-9eba-e84476b165f5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5476ba4f-9a37-490a-a68a-6abe6832524a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5476ba4f-9a37-490a-a68a-6abe6832524a",
  "order_id": "12c8d52f-4b6c-461d-9eba-e84476b165f5",
  "assignment_id": "714e9009-7a97-4aad-a0e2-9ec6fda2377d",
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

`POST /api/driver/v1/work-sessions/a7dde1f4-d8b9-4cf9-a7b2-860f2ab6a2d9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:43:13Z",
    "sequence": 1793270593438
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a7dde1f4-d8b9-4cf9-a7b2-860f2ab6a2d9",
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
  "last_heartbeat_at": "2026-10-29T10:43:13.454474Z",
  "last_location_at": "2026-10-29T10:43:13.454474Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5476ba4f-9a37-490a-a68a-6abe6832524a/arrive` → **200**

```json
{
  "command_id": "92baa4ea-23ff-4b7b-aebe-17adbc38bef4",
  "expected_version": 0
}
```

```json
{
  "id": "5476ba4f-9a37-490a-a68a-6abe6832524a",
  "order_id": "12c8d52f-4b6c-461d-9eba-e84476b165f5",
  "assignment_id": "714e9009-7a97-4aad-a0e2-9ec6fda2377d",
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
  "arrived_at": "2026-10-29T10:43:13.647333Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5476ba4f-9a37-490a-a68a-6abe6832524a/start` → **200**

```json
{
  "command_id": "3739d6e0-94ec-4777-84b4-a15e338bf1da",
  "expected_version": 1
}
```

```json
{
  "id": "5476ba4f-9a37-490a-a68a-6abe6832524a",
  "order_id": "12c8d52f-4b6c-461d-9eba-e84476b165f5",
  "assignment_id": "714e9009-7a97-4aad-a0e2-9ec6fda2377d",
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
  "arrived_at": "2026-10-29T10:43:13.647333Z",
  "started_at": "2026-10-29T10:43:13.846803Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/a7dde1f4-d8b9-4cf9-a7b2-860f2ab6a2d9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:43:14Z",
    "sequence": 1793270594303
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a7dde1f4-d8b9-4cf9-a7b2-860f2ab6a2d9",
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
  "last_heartbeat_at": "2026-10-29T10:43:14.045938Z",
  "last_location_at": "2026-10-29T10:43:14.045938Z",
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
  "device_ref": "sandbox-22169"
}
```

```json
{
  "challenge_id": "810af156-c6cc-4c38-837f-2b3281eabac6",
  "expires_at": "2026-10-29T10:48:14.228400885Z",
  "resend_available_at": "2026-10-29T10:43:15.228400885Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "828209",
  "sent_at": "2026-10-29T10:43:14.231139301Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "810af156-c6cc-4c38-837f-2b3281eabac6",
  "code": "828209",
  "device_ref": "sandbox-22169"
}
```

```json
{
  "session_id": "3405b6f4-29b5-4d1d-a1ee-83e6ee151071",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTQ5NCwiaWF0IjoxNzkzMjcwNTk0LCJqdGkiOiJhOWE1MzBlMy1mOTU4LTRmYjUtODE5Ny1iNmUzZjNiMGYxZjEiLCJzaWQiOiIzNDA1YjZmNC0yOWI1LTRkMWQtYTFlZS04M2U2ZWUxNTEwNzEifQ.IdEyNnHonDz9_BB85qmeqCBqKUednYzWalPgwDOsPQo",
  "access_expires_at": "2026-10-29T10:58:14.452307997Z",
  "refresh_token": "xyTxDmpDfNKmMdO_rVj981wzfdlT_oRfjg0jwoHx510",
  "refresh_expires_at": "2026-11-28T10:43:14.451563664Z",
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
  "command_id": "79706a16-2de3-4ef4-b07c-a83e32c53e3a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:43:14Z",
    "sequence": 1793270594815
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a3c2344c-ff3b-4e61-88f8-5837417010d8",
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
  "last_heartbeat_at": "2026-10-29T10:43:14.8311Z",
  "last_location_at": "2026-10-29T10:43:14.8311Z",
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
  "session_id": "0df90cfd-722b-4bcf-8136-a53b3c1a1bb2",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE0OTUsImlhdCI6MTc5MzI3MDU5NSwianRpIjoiODJlMGI5YTEtYmE5Yi00M2JmLTgxYTQtMTkyNmFjOGYxMjNjIiwic2lkIjoiMGRmOTBjZmQtNzIyYi00YmNmLTgxMzYtYTUzYjNjMWExYmIyIn0.Lua95qTkixcqny1HQF3AaQZWiRxmlQIOaYsWIwgkrvc",
  "access_expires_at": "2026-10-29T10:58:15.234582138Z",
  "refresh_token": "SExah2qFjAbSgQYXR592hNUgkgoiRbjO_CDkouSlwV4",
  "refresh_expires_at": "2026-10-29T22:43:15.234167334Z",
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
  "session_id": "b3477913-622d-4b0f-8b37-2cb182d5ebc8",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE0OTUsImlhdCI6MTc5MzI3MDU5NSwianRpIjoiYTZiNDM4NzAtOThkMC00ZWQ2LWJhMDEtZmFlYzM1YjlmNmMwIiwic2lkIjoiYjM0Nzc5MTMtNjIyZC00YjBmLThiMzctMmNiMTgyZDVlYmM4In0.PWxLBMq334smyD9YTUV8ZWSPY3L2RZfDnVNCbJ586WI",
  "access_expires_at": "2026-10-29T10:58:15.621359806Z",
  "refresh_token": "Ingpn3Sb-UKKShpydR4ORL_Ha59dkVL9YsN_wUDq9cQ",
  "refresh_expires_at": "2026-10-29T22:43:15.620857011Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/12c8d52f-4b6c-461d-9eba-e84476b165f5` → **200**

```json
{
  "id": "12c8d52f-4b6c-461d-9eba-e84476b165f5",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "f530b7c1-7126-4c1f-b0ab-f162208764fc",
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
    "id": "714e9009-7a97-4aad-a0e2-9ec6fda2377d",
    "order_id": "12c8d52f-4b6c-461d-9eba-e84476b165f5",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "5476ba4f-9a37-490a-a68a-6abe6832524a",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T10:43:12.702399Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/12c8d52f-4b6c-461d-9eba-e84476b165f5/interrupt` → **200**

```json
{
  "command_id": "202778be-3fa1-4504-8372-c627124b5af9",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "12c8d52f-4b6c-461d-9eba-e84476b165f5",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "f530b7c1-7126-4c1f-b0ab-f162208764fc",
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
      "id": "714e9009-7a97-4aad-a0e2-9ec6fda2377d",
      "order_id": "12c8d52f-4b6c-461d-9eba-e84476b165f5",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "5476ba4f-9a37-490a-a68a-6abe6832524a",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T10:43:12.702399Z",
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
    "id": "bcfa40d0-13f8-4e92-8834-124b43b0cb7d",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "f530b7c1-7126-4c1f-b0ab-f162208764fc",
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
    "id": "3eca7db0-9a61-4480-8269-298e1f42c035",
    "order_id": "bcfa40d0-13f8-4e92-8834-124b43b0cb7d",
    "expires_at": "2026-10-29T10:43:31.020011Z",
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

`POST /api/driver/v1/offers/3eca7db0-9a61-4480-8269-298e1f42c035/accept` → **200**

```json
{
  "command_id": "f4d68094-cfd4-42e4-a311-bdb7d85a2e63"
}
```

```json
{
  "id": "78924efa-afec-4e05-b21e-7faad19898c7",
  "order_id": "bcfa40d0-13f8-4e92-8834-124b43b0cb7d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9715795b-31bc-4d17-b6e4-1c307d62ca15",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9715795b-31bc-4d17-b6e4-1c307d62ca15",
  "order_id": "bcfa40d0-13f8-4e92-8834-124b43b0cb7d",
  "assignment_id": "78924efa-afec-4e05-b21e-7faad19898c7",
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
  "session_id": "a3c2344c-ff3b-4e61-88f8-5837417010d8",
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
  "last_heartbeat_at": "2026-10-29T10:43:14.8311Z",
  "last_location_at": "2026-10-29T10:43:14.8311Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/a3c2344c-ff3b-4e61-88f8-5837417010d8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:43:16Z",
    "sequence": 1793270596967
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a3c2344c-ff3b-4e61-88f8-5837417010d8",
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
  "last_heartbeat_at": "2026-10-29T10:43:16.984518Z",
  "last_location_at": "2026-10-29T10:43:16.984518Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9715795b-31bc-4d17-b6e4-1c307d62ca15/arrive` → **200**

```json
{
  "command_id": "9a428e6b-9ed1-442e-a849-b51f2327abdd",
  "expected_version": 0
}
```

```json
{
  "id": "9715795b-31bc-4d17-b6e4-1c307d62ca15",
  "order_id": "bcfa40d0-13f8-4e92-8834-124b43b0cb7d",
  "assignment_id": "78924efa-afec-4e05-b21e-7faad19898c7",
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
  "arrived_at": "2026-10-29T10:43:17.174972Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9715795b-31bc-4d17-b6e4-1c307d62ca15/start` → **200**

```json
{
  "command_id": "7e5cc3c8-50fc-462c-b920-f4079551c0a9",
  "expected_version": 1
}
```

```json
{
  "id": "9715795b-31bc-4d17-b6e4-1c307d62ca15",
  "order_id": "bcfa40d0-13f8-4e92-8834-124b43b0cb7d",
  "assignment_id": "78924efa-afec-4e05-b21e-7faad19898c7",
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
  "arrived_at": "2026-10-29T10:43:17.174972Z",
  "started_at": "2026-10-29T10:43:17.379715Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9715795b-31bc-4d17-b6e4-1c307d62ca15/complete` → **200**

```json
{
  "command_id": "28aff6f6-4d71-41f5-9d47-631bd4962016",
  "expected_version": 2,
  "reported_at": "2026-10-29T10:43:17Z"
}
```

```json
{
  "id": "9715795b-31bc-4d17-b6e4-1c307d62ca15",
  "order_id": "bcfa40d0-13f8-4e92-8834-124b43b0cb7d",
  "assignment_id": "78924efa-afec-4e05-b21e-7faad19898c7",
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
  "arrived_at": "2026-10-29T10:43:17.174972Z",
  "started_at": "2026-10-29T10:43:17.379715Z",
  "completed_at": "2026-10-29T10:43:17.581362Z",
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
    "id": "bcfa40d0-13f8-4e92-8834-124b43b0cb7d",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-29T10:43:16.012081Z",
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
    "id": "12c8d52f-4b6c-461d-9eba-e84476b165f5",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-29T10:43:12.702399Z",
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

`GET /api/operator/v1/orders/12c8d52f-4b6c-461d-9eba-e84476b165f5/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T10:43:12.702765Z",
      "actor": {
        "type": "CLIENT",
        "id": "f530b7c1-7126-4c1f-b0ab-f162208764fc",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "12c8d52f-4b6c-461d-9eba-e84476b165f5",
        "quote_id": "eabeb8e2-4f9c-4a81-a294-68e846fa7f57",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "b1c0b2a8-0e13-4f66-aa3d-a2e255756593"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T10:43:12.704012Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "12c8d52f-4b6c-461d-9eba-e84476b165f5",
        "attempt_id": "44a02dbf-3716-4279-8dc1-bf7eead91f3e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b1c0b2a8-0e13-4f66-aa3d-a2e255756593"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T10:43:12.70804Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b496700f-9ea4-4fbf-a628-b996d7193a51",
        "order_id": "12c8d52f-4b6c-461d-9eba-e84476b165f5",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "b1c0b2a8-0e13-4f66-aa3d-a2e255756593"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T10:43:13.089909Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "b496700f-9ea4-4fbf-a628-b996d7193a51",
        "order_id": "12c8d52f-4b6c-461d-9eba-e84476b165f5",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "714e9009-7a97-4aad-a0e2-9ec6fda2377d"
      },
      "correlation_id": "bd2289b1-8080-4556-bd1b-424b66ffef4f"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/bcfa40d0-13f8-4e92-8834-124b43b0cb7d/tip` → **200**

```json
{
  "order_id": "bcfa40d0-13f8-4e92-8834-124b43b0cb7d",
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
  "available_until": "2026-10-30T10:43:17.581362Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/bcfa40d0-13f8-4e92-8834-124b43b0cb7d/tip` → **409**

```json
{
  "command_id": "73969cc5-a0d9-4fdc-812d-3ecefa199f25",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/bcfa40d0-13f8-4e92-8834-124b43b0cb7d/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "58abaede-b6d3-462c-b5af-1951179d9c42"
}
```

Done: interrupted 12c8d52f-4b6c-461d-9eba-e84476b165f5, follow-up bcfa40d0-13f8-4e92-8834-124b43b0cb7d.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a7dde1f4-d8b9-4cf9-a7b2-860f2ab6a2d9",
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
  "last_heartbeat_at": "2026-10-29T10:43:14.045938Z",
  "last_location_at": "2026-10-29T10:43:14.045938Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a7dde1f4-d8b9-4cf9-a7b2-860f2ab6a2d9/close` → **200**

```json
{
  "command_id": "38d09dcb-e079-442e-bf79-25fa6ad459c7",
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
  "session_id": "a3c2344c-ff3b-4e61-88f8-5837417010d8",
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
  "last_heartbeat_at": "2026-10-29T10:43:16.984518Z",
  "last_location_at": "2026-10-29T10:43:16.984518Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a3c2344c-ff3b-4e61-88f8-5837417010d8/close` → **200**

```json
{
  "command_id": "32a4a8ae-9286-4987-82c8-4208a7f6f966",
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
  "session_id": "922a058a-b402-4b1c-8fba-c83ceadcbb63",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE1MDIsImlhdCI6MTc5MzI3MDYwMiwianRpIjoiNGVjZDc2OTMtZTU2Yi00M2M4LWE0OTQtZWExMTQ1MDI3MzgxIiwic2lkIjoiOTIyYTA1OGEtYjQwMi00YjFjLThmYmEtYzgzY2VhZGNiYjYzIn0.N-uMRbk4J283BAVr7nnv59QHzkMdEmqaXxbSVj-eDUU",
  "access_expires_at": "2026-10-29T10:58:22.69879913Z",
  "refresh_token": "xiz-xFHjtkoykjJdG37kitlooN_JpnlomzMP5DJuE-w",
  "refresh_expires_at": "2026-10-29T22:43:22.698338478Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "33e2e89e-4d30-40da-8952-13fb4a01196c",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T10:43:22Z"
}
```

```json
{
  "id": "77ba1617-5ba6-4844-9132-03fcbb680e63",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T10:43:22Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/77ba1617-5ba6-4844-9132-03fcbb680e63/publish` → **200**

```json
{
  "command_id": "74002b2e-2659-4ba0-9718-b625eb2e6fd0",
  "expected_version": 0
}
```

```json
{
  "id": "77ba1617-5ba6-4844-9132-03fcbb680e63",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T10:43:23.109432Z",
  "published_at": "2026-10-29T10:43:23.109432Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "77ba1617-5ba6-4844-9132-03fcbb680e63",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T10:43:23.109432Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631640327",
  "device_ref": "sandbox-32707"
}
```

```json
{
  "challenge_id": "f543164e-ef16-40dd-a7b9-07a66dee785c",
  "expires_at": "2026-10-29T10:48:23.492487931Z",
  "resend_available_at": "2026-10-29T10:43:24.492487931Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631640327` → **200**

```json
{
  "phone": "+380631640327",
  "audience": "CLIENT",
  "code": "672814",
  "sent_at": "2026-10-29T10:43:23.494515103Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f543164e-ef16-40dd-a7b9-07a66dee785c",
  "code": "672814",
  "device_ref": "sandbox-32707"
}
```

```json
{
  "session_id": "4e65253e-ee6b-47c3-8d7a-3043ad1f1dbe",
  "subject": {
    "type": "CLIENT",
    "id": "fbcb3bc9-6754-42c6-b80d-218b2eb0f09f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYmNiM2JjOS02NzU0LTQyYzYtYjgwZC0yMThiMmViMGYwOWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNTAzLCJpYXQiOjE3OTMyNzA2MDMsImp0aSI6IjU0OGM0ZWY2LTQ3MjMtNDZlZS1hN2IzLWQ4MzFhNmZiMDcxMCIsInNpZCI6IjRlNjUyNTNlLWVlNmItNDdjMy04ZDdhLTMwNDNhZDFmMWRiZSJ9.8C9qUDurj0hYCC2ZUlikxScH3pZsbqigo5wA9zlsEzs",
  "access_expires_at": "2026-10-29T10:58:23.70740104Z",
  "refresh_token": "UKJhTC7FCyRQNRRERh50IMZtiC2EIOpYPsEaDCocV1A",
  "refresh_expires_at": "2026-11-28T10:43:23.706988791Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "77ba1617-5ba6-4844-9132-03fcbb680e63",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T10:43:23.109432Z",
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
  "command_id": "6ab1ffc9-b192-4e01-91c5-4dfb35fad636",
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
  "id": "432603e9-63d4-4ee0-b147-79fee2a83aa2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:48:24.091338Z",
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
  "command_id": "18b1021a-15f1-4a52-ac7d-4defbd86406a",
  "quote_id": "432603e9-63d4-4ee0-b147-79fee2a83aa2",
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
  "correlation_id": "bfa04e5f-e934-4465-ab5d-a8f686a17262"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "2e780366-f527-4f95-8f58-9ed041dc22ed",
  "version_id": "77ba1617-5ba6-4844-9132-03fcbb680e63",
  "language": "uk"
}
```

```json
{
  "version_id": "77ba1617-5ba6-4844-9132-03fcbb680e63",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T10:43:24.495879Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e791c3e0-02cd-4483-9054-e3ba0223cdd9",
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
  "id": "86cd8b11-06d0-4ec2-85d2-30cb546e5431",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:48:24.688459Z",
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
  "command_id": "114c8a62-f441-45ef-928f-47bb61ead3bf",
  "quote_id": "86cd8b11-06d0-4ec2-85d2-30cb546e5431",
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
  "id": "e748ee38-9684-4535-bfdd-760fc1e494ac",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fbcb3bc9-6754-42c6-b80d-218b2eb0f09f",
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
  "created_at": "2026-10-29T10:43:24.88858Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e748ee38-9684-4535-bfdd-760fc1e494ac` → **200**

```json
{
  "id": "e748ee38-9684-4535-bfdd-760fc1e494ac",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fbcb3bc9-6754-42c6-b80d-218b2eb0f09f",
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
  "created_at": "2026-10-29T10:43:24.88858Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e748ee38-9684-4535-bfdd-760fc1e494ac/cancel` → **200**

```json
{
  "command_id": "f683b757-aec0-489f-8e76-42ad7d776a00",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e748ee38-9684-4535-bfdd-760fc1e494ac",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fbcb3bc9-6754-42c6-b80d-218b2eb0f09f",
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
  "created_at": "2026-10-29T10:43:24.88858Z",
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

`POST /api/admin/v1/legal-documents/77ba1617-5ba6-4844-9132-03fcbb680e63` → **409**

```json
{
  "command_id": "05f3a389-6351-49d4-9f72-d708291292f2",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T10:43:25Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/77ba1617-5ba6-4844-9132-03fcbb680e63",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e1423c10-eec7-4267-9a64-7bd863a685e4"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "81ea6924-0929-44b7-ba8f-4016339863a9",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T10:43:25Z"
}
```

```json
{
  "id": "d6cb5a2d-2c59-4020-b076-f6eb6cbaddcd",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T10:43:25Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/d6cb5a2d-2c59-4020-b076-f6eb6cbaddcd/publish` → **200**

```json
{
  "command_id": "f38776c5-e5d9-4f17-a718-ffff71110bdf",
  "expected_version": 0
}
```

```json
{
  "id": "d6cb5a2d-2c59-4020-b076-f6eb6cbaddcd",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T10:43:25.893373Z",
  "published_at": "2026-10-29T10:43:25.893373Z",
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
  "device_ref": "sandbox-21711"
}
```

```json
{
  "challenge_id": "be16b7b2-6802-42b3-9559-c84ec48af01d",
  "expires_at": "2026-10-29T10:48:26.084964991Z",
  "resend_available_at": "2026-10-29T10:43:27.084964991Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "509174",
  "sent_at": "2026-10-29T10:43:26.086928403Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be16b7b2-6802-42b3-9559-c84ec48af01d",
  "code": "509174",
  "device_ref": "sandbox-21711"
}
```

```json
{
  "session_id": "29458dc8-952a-417b-9c5c-be6fb57347c0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTUwNiwiaWF0IjoxNzkzMjcwNjA2LCJqdGkiOiJiY2FmODdjZC01M2Y3LTQzOGUtOGYzNi0zZmEyMjc0MGI5ZmUiLCJzaWQiOiIyOTQ1OGRjOC05NTJhLTQxN2ItOWM1Yy1iZTZmYjU3MzQ3YzAifQ.vtyGQWiMcaDuTdDTKAhpSNr7RnS1-IbRwKylhWo0wCo",
  "access_expires_at": "2026-10-29T10:58:26.297335572Z",
  "refresh_token": "LO3qDV9rKWyjKaaKVwMD8_vkbpwwV4oWzg0TOhutj5o",
  "refresh_expires_at": "2026-11-28T10:43:26.296888879Z",
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
  "command_id": "70b421c3-7a49-42e4-8fb0-f32c99fe188f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:43:26Z",
    "sequence": 1793270606653
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a3f8d7fb-033f-47a2-b116-d17da51ad70c",
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
  "last_heartbeat_at": "2026-10-29T10:43:26.670665Z",
  "last_location_at": "2026-10-29T10:43:26.670665Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676229003",
  "device_ref": "sandbox-18493"
}
```

```json
{
  "challenge_id": "abf77405-64de-4d85-b66b-eb2be16c6d80",
  "expires_at": "2026-10-29T10:48:26.855766016Z",
  "resend_available_at": "2026-10-29T10:43:27.855766016Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676229003` → **200**

```json
{
  "phone": "+380676229003",
  "audience": "CLIENT",
  "code": "560110",
  "sent_at": "2026-10-29T10:43:26.857542712Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "abf77405-64de-4d85-b66b-eb2be16c6d80",
  "code": "560110",
  "device_ref": "sandbox-18493"
}
```

```json
{
  "session_id": "f249d278-f7ee-4ecc-8d66-3572c0b09366",
  "subject": {
    "type": "CLIENT",
    "id": "128b557f-3bd1-4104-8cd7-03380415df90"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjhiNTU3Zi0zYmQxLTQxMDQtOGNkNy0wMzM4MDQxNWRmOTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNTA3LCJpYXQiOjE3OTMyNzA2MDcsImp0aSI6IjZhYTU2MDQ5LWU1NWMtNDAxMi1iNGY5LThjNGQ5YzdhODk5MCIsInNpZCI6ImYyNDlkMjc4LWY3ZWUtNGVjYy04ZDY2LTM1NzJjMGIwOTM2NiJ9.ZaW-Q7MJQXBYDUSlIIgq4lmXWcwXMe01O6uqJKiWnfI",
  "access_expires_at": "2026-10-29T10:58:27.072974232Z",
  "refresh_token": "lrxKOHjH7sEyx-XO0VBvNqWUcQ9Sn4GP4MN7gTHKLv4",
  "refresh_expires_at": "2026-11-28T10:43:27.072555881Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "96f97d5e-c57f-4f35-8133-c2fb68fcc29a",
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
  "id": "90e27698-fbd7-4257-a818-972795f38c0b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:48:27.260667Z",
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
  "command_id": "90cb7419-58ea-4fcd-a4dd-a4a840fed636",
  "quote_id": "90e27698-fbd7-4257-a818-972795f38c0b",
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
    "phone": "+380676342617"
  }
}
```

```json
{
  "id": "3b8267d6-1aa7-4a24-8955-45bcfe170669",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "128b557f-3bd1-4104-8cd7-03380415df90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T10:43:27.45967Z",
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
    "id": "ef20bf8d-448d-49bf-b3dd-0f4c3289570b",
    "order_id": "3b8267d6-1aa7-4a24-8955-45bcfe170669",
    "expires_at": "2026-10-29T10:43:42.462471Z",
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

`POST /api/driver/v1/offers/ef20bf8d-448d-49bf-b3dd-0f4c3289570b/accept` → **200**

```json
{
  "command_id": "7b50bb4f-2917-41db-a13d-2f8f253b8f02"
}
```

```json
{
  "id": "6a29fbec-7f13-48f1-8a46-47f6b1c9192f",
  "order_id": "3b8267d6-1aa7-4a24-8955-45bcfe170669",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "92ccaa5a-e254-4798-815b-4c0cb1242e81",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "92ccaa5a-e254-4798-815b-4c0cb1242e81",
  "order_id": "3b8267d6-1aa7-4a24-8955-45bcfe170669",
  "assignment_id": "6a29fbec-7f13-48f1-8a46-47f6b1c9192f",
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
    "phone": "+380676342617"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2d3f9feb-1a08-405f-a3e3-59ce63927bf4",
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
  "id": "3ec5e4fc-5222-4f80-b42b-0da752a053c0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:48:28.227679Z",
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
  "command_id": "38398a87-eccb-43f8-9c03-87458619d561",
  "quote_id": "3ec5e4fc-5222-4f80-b42b-0da752a053c0",
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
  "id": "581f357f-47ee-40be-9fef-0a99c74cbc17",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "128b557f-3bd1-4104-8cd7-03380415df90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:43:28.423689Z",
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
  "command_id": "ebb08d81-e006-4320-a019-a6335a98ec44",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T13:43:28Z"
}
```

```json
{
  "id": "14f5f23a-6c12-4cc0-8025-da8b5db5db1b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:48:28.629691Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T13:43:28Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6c4b9f9c-b3cb-4882-99cd-a34c2c192615",
  "quote_id": "14f5f23a-6c12-4cc0-8025-da8b5db5db1b",
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
  "pickup_at": "2026-10-29T13:43:28Z"
}
```

```json
{
  "id": "f05ccc85-5d7e-403d-a3d8-b86b1829a63e",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "128b557f-3bd1-4104-8cd7-03380415df90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T10:43:28.829795Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T13:43:28Z",
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
  "command_id": "e379b9ca-8694-43d6-8169-6543cbe5b40e",
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
  "id": "658dd3a6-65e3-4234-a01a-ec22b49f4c11",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:48:29.034031Z",
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
  "command_id": "d3593500-e156-48f3-9cdf-586777528828",
  "quote_id": "658dd3a6-65e3-4234-a01a-ec22b49f4c11",
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
  "correlation_id": "ee3a748f-44b5-4dd1-8293-f1ac06488525"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "f05ccc85-5d7e-403d-a3d8-b86b1829a63e",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "128b557f-3bd1-4104-8cd7-03380415df90",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T10:43:28.829795Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T13:43:28Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "581f357f-47ee-40be-9fef-0a99c74cbc17",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "128b557f-3bd1-4104-8cd7-03380415df90",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T10:43:28.423689Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "3b8267d6-1aa7-4a24-8955-45bcfe170669",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "581f357f-47ee-40be-9fef-0a99c74cbc17",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "128b557f-3bd1-4104-8cd7-03380415df90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:43:28.423689Z",
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

`GET /api/rider/v1/orders/3b8267d6-1aa7-4a24-8955-45bcfe170669` → **200**

```json
{
  "id": "3b8267d6-1aa7-4a24-8955-45bcfe170669",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "128b557f-3bd1-4104-8cd7-03380415df90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "6a29fbec-7f13-48f1-8a46-47f6b1c9192f",
    "order_id": "3b8267d6-1aa7-4a24-8955-45bcfe170669",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "92ccaa5a-e254-4798-815b-4c0cb1242e81",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T10:43:27.45967Z",
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
    "location_at": "2026-10-29T10:43:26.670665Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/3b8267d6-1aa7-4a24-8955-45bcfe170669/cancel` → **200**

```json
{
  "command_id": "75d2deac-1125-402f-b900-85929036593f",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3b8267d6-1aa7-4a24-8955-45bcfe170669",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "128b557f-3bd1-4104-8cd7-03380415df90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "6a29fbec-7f13-48f1-8a46-47f6b1c9192f",
    "order_id": "3b8267d6-1aa7-4a24-8955-45bcfe170669",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "92ccaa5a-e254-4798-815b-4c0cb1242e81",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T10:43:27.45967Z",
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

`GET /api/rider/v1/orders/581f357f-47ee-40be-9fef-0a99c74cbc17` → **200**

```json
{
  "id": "581f357f-47ee-40be-9fef-0a99c74cbc17",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "128b557f-3bd1-4104-8cd7-03380415df90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:43:28.423689Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/581f357f-47ee-40be-9fef-0a99c74cbc17/cancel` → **200**

```json
{
  "command_id": "e15705eb-ea7d-43c5-8114-81c64ab66b40",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "581f357f-47ee-40be-9fef-0a99c74cbc17",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "128b557f-3bd1-4104-8cd7-03380415df90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T10:43:28.423689Z",
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

`GET /api/rider/v1/orders/f05ccc85-5d7e-403d-a3d8-b86b1829a63e` → **200**

```json
{
  "id": "f05ccc85-5d7e-403d-a3d8-b86b1829a63e",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "128b557f-3bd1-4104-8cd7-03380415df90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T10:43:28.829795Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T13:43:28Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f05ccc85-5d7e-403d-a3d8-b86b1829a63e/cancel` → **200**

```json
{
  "command_id": "69c1c5bc-e43e-46b0-8ceb-7b3823d76835",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f05ccc85-5d7e-403d-a3d8-b86b1829a63e",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "128b557f-3bd1-4104-8cd7-03380415df90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T10:43:28.829795Z",
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
  "pickup_at": "2026-10-29T13:43:28Z",
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
  "session_id": "a3f8d7fb-033f-47a2-b116-d17da51ad70c",
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
  "last_heartbeat_at": "2026-10-29T10:43:26.670665Z",
  "last_location_at": "2026-10-29T10:43:26.670665Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a3f8d7fb-033f-47a2-b116-d17da51ad70c/close` → **200**

```json
{
  "command_id": "9c3c3aee-17a3-4f6c-98ec-497cd2a0ad8e",
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

Done: orders 3b8267d6-1aa7-4a24-8955-45bcfe170669, 581f357f-47ee-40be-9fef-0a99c74cbc17, f05ccc85-5d7e-403d-a3d8-b86b1829a63e.

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
  "session_id": "c058acec-62ea-42db-b9e5-22009c796ed1",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE1MTEsImlhdCI6MTc5MzI3MDYxMSwianRpIjoiNjY1NDViMzAtNzBlNy00NmMxLWIzNjMtNDI2Y2Q4M2EwOTJiIiwic2lkIjoiYzA1OGFjZWMtNjJlYS00MmRiLWI5ZTUtMjIwMDljNzk2ZWQxIn0.Wic6tEDlTmN62BkDOXSxEne9ZR3gFZIl5Whhjg7KLCM",
  "access_expires_at": "2026-10-29T10:58:31.570594469Z",
  "refresh_token": "Swo3yzf4xc1Zc7sGxrcExYtqy30ilOw_zswZ9tyfTiY",
  "refresh_expires_at": "2026-10-29T22:43:31.570231864Z",
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
  "session_id": "b0bebfa9-cdd3-4c74-b35c-647694b71b06",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE1MTEsImlhdCI6MTc5MzI3MDYxMSwianRpIjoiZDkyYmQwZDgtYTRhNi00NjQ0LThjOWEtYWYwYjUxNzQyYmY2Iiwic2lkIjoiYjBiZWJmYTktY2RkMy00Yzc0LWIzNWMtNjQ3Njk0YjcxYjA2In0.ibV2H55h_aaixit9j5OApfL8522GFWqOkIAe7niI5U4",
  "access_expires_at": "2026-10-29T10:58:31.963898169Z",
  "refresh_token": "3PKEVetN9PEIWjftm3mCzJvlZie6iGLX4XjDzSH8uAI",
  "refresh_expires_at": "2026-10-29T22:43:31.963530415Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-13800"
}
```

```json
{
  "challenge_id": "a53ac3d9-ffaa-4ada-817e-348f17dbd061",
  "expires_at": "2026-10-29T10:48:32.152346962Z",
  "resend_available_at": "2026-10-29T10:43:33.152346962Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "772635",
  "sent_at": "2026-10-29T10:43:32.154187831Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a53ac3d9-ffaa-4ada-817e-348f17dbd061",
  "code": "772635",
  "device_ref": "sandbox-13800"
}
```

```json
{
  "session_id": "0eccf830-9e65-42ac-94d0-05537080150e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTUxMiwiaWF0IjoxNzkzMjcwNjEyLCJqdGkiOiIzNDcxNjBmYi02NTgxLTQ0Y2UtYTAxYS0wZTFlMDU2MTYxNTEiLCJzaWQiOiIwZWNjZjgzMC05ZTY1LTQyYWMtOTRkMC0wNTUzNzA4MDE1MGUifQ.DB14Pj_CKbDhzRf5Fid55gtmadgh1hnFZidd7nc7R5Y",
  "access_expires_at": "2026-10-29T10:58:32.362175607Z",
  "refresh_token": "jikT7gE2f1WRepkpqh37kBnDhq9klpONx5AH93FrXjc",
  "refresh_expires_at": "2026-11-28T10:43:32.36179921Z",
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
  "command_id": "d3a36707-5e0e-4cf9-89e3-6a802facc841",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:43:32Z",
    "sequence": 1793270612724
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62f5a722-46c9-4d12-b0bb-d6a7dc554909",
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
  "last_heartbeat_at": "2026-10-29T10:43:32.739946Z",
  "last_location_at": "2026-10-29T10:43:32.739946Z",
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
  "command_id": "cd8b064d-b4f0-4083-a0ed-9a7b2aaf7544",
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
  "effective_at": "2026-10-29T10:43:33.120677Z",
  "changed_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "c8491122-a379-432e-880c-2c074e7909b2",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T10:41:33.610748Z",
  "last_entries": [
    {
      "order_id": "658de42b-8585-4c3b-aa05-a6b096907e22",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T10:41:33.610748Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d49487eb-d1ba-4e0f-8e15-eb33639bb41c",
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
  "id": "bf807747-7a5c-4357-9725-245d4a21735d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:48:33.495748Z",
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
  "command_id": "b124fbde-e95d-4d6b-8708-240beeeb3157",
  "quote_id": "bf807747-7a5c-4357-9725-245d4a21735d",
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
    "phone": "+3806711124801"
  }
}
```

```json
{
  "id": "74a0d400-555c-4c48-8e05-9d4227d1ba65",
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
  "created_at": "2026-10-29T10:43:33.6885Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711124801"
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
    "id": "fa1943ef-b815-4317-88d0-d7213bba755f",
    "order_id": "74a0d400-555c-4c48-8e05-9d4227d1ba65",
    "expires_at": "2026-10-29T10:43:48.690939Z",
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

`POST /api/driver/v1/offers/fa1943ef-b815-4317-88d0-d7213bba755f/accept` → **200**

```json
{
  "command_id": "a9552ff5-7969-4430-b60e-f011a4edc8c7"
}
```

```json
{
  "id": "e84f649c-3471-46bd-bd95-341f81eb48c5",
  "order_id": "74a0d400-555c-4c48-8e05-9d4227d1ba65",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f793d5f2-3bc1-4f1b-93cf-5056ea3cc7d1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f793d5f2-3bc1-4f1b-93cf-5056ea3cc7d1",
  "order_id": "74a0d400-555c-4c48-8e05-9d4227d1ba65",
  "assignment_id": "e84f649c-3471-46bd-bd95-341f81eb48c5",
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
    "phone": "+3806711124801"
  }
}
```

`POST /api/driver/v1/work-sessions/62f5a722-46c9-4d12-b0bb-d6a7dc554909/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:43:34Z",
    "sequence": 1793270614440
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62f5a722-46c9-4d12-b0bb-d6a7dc554909",
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
  "last_heartbeat_at": "2026-10-29T10:43:34.456764Z",
  "last_location_at": "2026-10-29T10:43:34.456764Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f793d5f2-3bc1-4f1b-93cf-5056ea3cc7d1/arrive` → **200**

```json
{
  "command_id": "9bc85cd6-e855-4020-a78e-46f1b7ef1a75",
  "expected_version": 0
}
```

```json
{
  "id": "f793d5f2-3bc1-4f1b-93cf-5056ea3cc7d1",
  "order_id": "74a0d400-555c-4c48-8e05-9d4227d1ba65",
  "assignment_id": "e84f649c-3471-46bd-bd95-341f81eb48c5",
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
  "arrived_at": "2026-10-29T10:43:34.647563Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711124801"
  }
}
```

`POST /api/driver/v1/trips/f793d5f2-3bc1-4f1b-93cf-5056ea3cc7d1/start` → **200**

```json
{
  "command_id": "c8d525bf-e007-4b81-9573-dbc9453f8519",
  "expected_version": 1
}
```

```json
{
  "id": "f793d5f2-3bc1-4f1b-93cf-5056ea3cc7d1",
  "order_id": "74a0d400-555c-4c48-8e05-9d4227d1ba65",
  "assignment_id": "e84f649c-3471-46bd-bd95-341f81eb48c5",
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
  "arrived_at": "2026-10-29T10:43:34.647563Z",
  "started_at": "2026-10-29T10:43:34.843371Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711124801"
  }
}
```

`POST /api/driver/v1/trips/f793d5f2-3bc1-4f1b-93cf-5056ea3cc7d1/complete` → **200**

```json
{
  "command_id": "0d65940e-4eab-43e9-955e-d7d2f0f66354",
  "expected_version": 2,
  "reported_at": "2026-10-29T10:43:35Z",
  "cash_received": true
}
```

```json
{
  "id": "f793d5f2-3bc1-4f1b-93cf-5056ea3cc7d1",
  "order_id": "74a0d400-555c-4c48-8e05-9d4227d1ba65",
  "assignment_id": "e84f649c-3471-46bd-bd95-341f81eb48c5",
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
  "arrived_at": "2026-10-29T10:43:34.647563Z",
  "started_at": "2026-10-29T10:43:34.843371Z",
  "completed_at": "2026-10-29T10:43:35.044513Z",
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
  "command_id": "880ff4e5-bd00-4ac0-9f60-8c5ebcf75421",
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
  "id": "3974cf5e-2b70-4450-955f-eddd4f5bf233",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:48:35.241843Z",
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
  "command_id": "ca948800-c870-4f71-b794-3b2102ba8b5f",
  "quote_id": "3974cf5e-2b70-4450-955f-eddd4f5bf233",
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
    "phone": "+3806711132445"
  }
}
```

```json
{
  "id": "88476471-743b-4971-a09d-942d84c7cff9",
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
  "created_at": "2026-10-29T10:43:35.436439Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711132445"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/88476471-743b-4971-a09d-942d84c7cff9` → **200**

```json
{
  "id": "88476471-743b-4971-a09d-942d84c7cff9",
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
  "created_at": "2026-10-29T10:43:35.436439Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711132445"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/88476471-743b-4971-a09d-942d84c7cff9/cancel` → **200**

```json
{
  "command_id": "fc3fbeb9-43b0-4559-8479-ae9a4636760f",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "88476471-743b-4971-a09d-942d84c7cff9",
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
  "created_at": "2026-10-29T10:43:35.436439Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711132445"
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
  "staff_id": "c8491122-a379-432e-880c-2c074e7909b2",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T10:41:33.610748Z",
  "last_entries": [
    {
      "order_id": "88476471-743b-4971-a09d-942d84c7cff9",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T10:43:35.835869Z"
    },
    {
      "order_id": "74a0d400-555c-4c48-8e05-9d4227d1ba65",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T10:43:35.047506Z"
    },
    {
      "order_id": "658de42b-8585-4c3b-aa05-a6b096907e22",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T10:41:33.610748Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62f5a722-46c9-4d12-b0bb-d6a7dc554909",
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
  "last_heartbeat_at": "2026-10-29T10:43:34.456764Z",
  "last_location_at": "2026-10-29T10:43:34.456764Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/62f5a722-46c9-4d12-b0bb-d6a7dc554909/close` → **200**

```json
{
  "command_id": "7db4f963-7588-4ac3-9c2e-221be043fa9f",
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

Done: operator bonus for fulfilled 74a0d400-555c-4c48-8e05-9d4227d1ba65 and operator-fault cancellation 88476471-743b-4971-a09d-942d84c7cff9.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670933053",
  "device_ref": "sandbox-6782"
}
```

```json
{
  "challenge_id": "7f35422f-e652-4236-8ecd-e39d9e418411",
  "expires_at": "2026-10-29T10:48:39.840199168Z",
  "resend_available_at": "2026-10-29T10:43:40.840199168Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670933053` → **200**

```json
{
  "phone": "+380670933053",
  "audience": "CLIENT",
  "code": "981174",
  "sent_at": "2026-10-29T10:43:39.842111529Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675266124",
  "device_ref": "sandbox-31703",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "37200ab0-04ce-477d-bd88-e08c4eb656ac",
  "expires_at": "2026-10-29T10:48:41.25660681Z",
  "resend_available_at": "2026-10-29T10:43:42.25660681Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675266124` → **200**

```json
{
  "phone": "+380675266124",
  "audience": "CLIENT",
  "code": "748021",
  "sent_at": "2026-10-29T10:43:41.258282992Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675266124",
  "device_ref": "sandbox-9625",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "62618f39-5d1f-4411-8136-69df1e75e0df",
  "expires_at": "2026-10-29T10:48:42.671648926Z",
  "resend_available_at": "2026-10-29T10:43:43.671648926Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675266124` → **200**

```json
{
  "phone": "+380675266124",
  "audience": "CLIENT",
  "code": "526174",
  "sent_at": "2026-10-29T10:43:42.673942121Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678520000",
  "device_ref": "sandbox-9943"
}
```

```json
{
  "challenge_id": "900d88be-c1fa-48c3-afcb-bf08cafe2531",
  "expires_at": "2026-10-29T10:48:44.084930003Z",
  "resend_available_at": "2026-10-29T10:43:45.084930003Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678520000",
  "device_ref": "sandbox-22141"
}
```

```json
{
  "challenge_id": "ec70c3e6-1b6b-4553-a161-0b022a9a8efc",
  "expires_at": "2026-10-29T10:48:45.476231838Z",
  "resend_available_at": "2026-10-29T10:43:46.476231838Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380678520000` → **200**

```json
{
  "phone": "+380678520000",
  "audience": "CLIENT",
  "code": "792193",
  "sent_at": "2026-10-29T10:43:45.478270374Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678520000",
  "device_ref": "sandbox-9730",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "1d6d7095-979f-4229-ba5c-3deb028890dc",
  "expires_at": "2026-10-29T10:48:46.891422933Z",
  "resend_available_at": "2026-10-29T10:43:47.891422933Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380678520000` → **200**

```json
{
  "phone": "+380678520000",
  "audience": "CLIENT",
  "code": "244944",
  "sent_at": "2026-10-29T10:43:46.89345799Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380678520000",
  "device_ref": "sandbox-28455",
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
  "correlation_id": "87279b8f-cee8-43d0-87a1-95acc7a230d0",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000002552"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "a2196c77-cc68-4b6e-92ce-5958f43ac9c3"
}
```

`GET /sandbox/v1/otp?phone=%2B442000002552` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120017788"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "fe777842-abd6-4a16-be6a-5fa0ff4ed47b"
}
```

`GET /sandbox/v1/otp?phone=%2B37120017788` → **404**

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
  "session_id": "d7444e30-fa32-4146-b760-25478ce1b97d",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE1MjksImlhdCI6MTc5MzI3MDYyOSwianRpIjoiZmJjOWQ4Y2MtZmY0ZC00ZWIyLWE4ZDEtNzE1NDQxM2Y5NWZhIiwic2lkIjoiZDc0NDRlMzAtZmEzMi00MTQ2LWI3NjAtMjU0NzhjZTFiOTdkIn0.pcV0WuhRbVcy-3XV8cDPgyXK_HcpvivEWg-A6Uie-JQ",
  "access_expires_at": "2026-10-29T10:58:49.175054681Z",
  "refresh_token": "5BsGZEYWx3x7xJUrQL_zjq4H171nBmlg8bjYPunTsIg",
  "refresh_expires_at": "2026-10-29T22:43:49.174727028Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678520000` → **200**

```json
{
  "deliveries": [
    {
      "id": "17f3b8e5-73cc-429e-b940-1f4589f000fc",
      "challenge_id": "1d6d7095-979f-4229-ba5c-3deb028890dc",
      "phone": "+380678520000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-3efaae8c-f06a-40fe-8f48-931ef636c643",
      "error": null,
      "attempted_at": "2026-10-29T10:43:46.893855Z"
    },
    {
      "id": "f413ec2a-7453-4d64-9f5c-6c44d6de5199",
      "challenge_id": "ec70c3e6-1b6b-4553-a161-0b022a9a8efc",
      "phone": "+380678520000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-6f740bce-8e77-4bbc-9a3f-bc931b64b907",
      "error": null,
      "attempted_at": "2026-10-29T10:43:45.478534Z"
    },
    {
      "id": "e16004ed-8fcc-4610-906c-742b200ee7b2",
      "challenge_id": "900d88be-c1fa-48c3-afcb-bf08cafe2531",
      "phone": "+380678520000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T10:43:44.086799Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380678520000` → **200**

```json
{
  "phone": "+380678520000",
  "audience": "CLIENT",
  "code": "244944",
  "sent_at": "2026-10-29T10:43:46.89345799Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675266124` → **200**

```json
{
  "deliveries": [
    {
      "id": "9498c31b-b9e5-4b15-911b-64b910e3b7fa",
      "challenge_id": "62618f39-5d1f-4411-8136-69df1e75e0df",
      "phone": "+380675266124",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-62b18da5-abe9-4477-9c6e-2665cf7b74e6",
      "error": null,
      "attempted_at": "2026-10-29T10:43:42.67422Z"
    },
    {
      "id": "3d04cea3-716f-4525-b0b7-08616eea21f6",
      "challenge_id": "37200ab0-04ce-477d-bd88-e08c4eb656ac",
      "phone": "+380675266124",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-710d0626-c589-4800-9164-4ea3569eb981",
      "error": null,
      "attempted_at": "2026-10-29T10:43:41.258552Z"
    }
  ]
}
```

Done: SMS to +380670933053; SMS then a call to +380675266124; a failed SMS, two calls and a refused third to +380678520000; +44 and +371 refused.

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
  "session_id": "998112fc-2bd8-4e6f-a177-9bee3c96a27e",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE1MjksImlhdCI6MTc5MzI3MDYyOSwianRpIjoiYTZmOWM3MWYtOWZjMi00MjkyLWI4MGEtZjk5NzM0MmU0YzAxIiwic2lkIjoiOTk4MTEyZmMtMmJkOC00ZTZmLWExNzctOWJlZTNjOTZhMjdlIn0.xUAfBd2Mh3l6T-a46gEUGvFsX9YYBtboDP8Q1qoJ2zk",
  "access_expires_at": "2026-10-29T10:58:49.988058987Z",
  "refresh_token": "jEzp51hy6a_gLa8YY7aeL8yWnkDY04ZhjcH-yiXR8Jk",
  "refresh_expires_at": "2026-10-29T22:43:49.987447347Z",
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
  "session_id": "e5910e27-af03-41bd-85a3-3d5d6bc30cf8",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE1MzAsImlhdCI6MTc5MzI3MDYzMCwianRpIjoiN2NhOGE0MWMtYWRkYi00YmNjLTljZjItOGM4MjcxYjhhYjQ2Iiwic2lkIjoiZTU5MTBlMjctYWYwMy00MWJkLTg1YTMtM2Q1ZDZiYzMwY2Y4In0._7nTS_rKd8UyZzLdVZfnMAczxV36HGXpmg9slocsaS0",
  "access_expires_at": "2026-10-29T10:58:50.383774994Z",
  "refresh_token": "NQlzTbhqhdHW0vUeFljxtw1YoCcYVqUlLurftitVScI",
  "refresh_expires_at": "2026-10-29T22:43:50.383420847Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "c8491122-a379-432e-880c-2c074e7909b2",
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

`POST /api/admin/v1/staff-extensions/c8491122-a379-432e-880c-2c074e7909b2` → **200**

```json
{
  "command_id": "6645bb18-787c-467d-a650-74ab6890f8e6",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "c8491122-a379-432e-880c-2c074e7909b2",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "1be673b4-3560-4243-982b-78208e54ad1b",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T10:43:51.13571Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T10:43:51.13571Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ccc43774-a654-4cb7-8550-a3536e700737",
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
  "id": "848dfec5-f851-4fc1-b13f-3f48af6fed87",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:48:51.510509Z",
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
  "command_id": "1beb1a7c-74ff-4d41-9807-c77f83eb6ac6",
  "quote_id": "848dfec5-f851-4fc1-b13f-3f48af6fed87",
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
    "phone": "+380676685221"
  }
}
```

```json
{
  "id": "63ee4b84-2f84-47af-b3eb-58a4ebb7c04a",
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
  "created_at": "2026-10-29T10:43:51.706439Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676685221"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/63ee4b84-2f84-47af-b3eb-58a4ebb7c04a/calls` → **201**

```json
{
  "command_id": "3350acc3-f2ca-4d67-9f76-e1eea004c9d5",
  "to": "CALLER"
}
```

```json
{
  "id": "7110112e-4b98-4e3c-b3f1-f95d2fa937c9",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "order_ids": [
    "63ee4b84-2f84-47af-b3eb-58a4ebb7c04a"
  ],
  "started_at": "2026-10-29T10:43:51.923719Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/63ee4b84-2f84-47af-b3eb-58a4ebb7c04a/calls` → **201**

```json
{
  "command_id": "3350acc3-f2ca-4d67-9f76-e1eea004c9d5",
  "to": "CALLER"
}
```

```json
{
  "id": "7110112e-4b98-4e3c-b3f1-f95d2fa937c9",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "order_ids": [
    "63ee4b84-2f84-47af-b3eb-58a4ebb7c04a"
  ],
  "started_at": "2026-10-29T10:43:51.923719Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "7110112e-4b98-4e3c-b3f1-f95d2fa937c9",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380676685221",
    "at": "2026-10-29T10:43:51.925906012Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "7110112e-4b98-4e3c-b3f1-f95d2fa937c9",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.7218",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "7110112e-4b98-4e3c-b3f1-f95d2fa937c9"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "7110112e-4b98-4e3c-b3f1-f95d2fa937c9",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=63ee4b84-2f84-47af-b3eb-58a4ebb7c04a` → **200**

```json
{
  "calls": [
    {
      "id": "7110112e-4b98-4e3c-b3f1-f95d2fa937c9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c8491122-a379-432e-880c-2c074e7909b2",
      "order_ids": [
        "63ee4b84-2f84-47af-b3eb-58a4ebb7c04a"
      ],
      "started_at": "2026-10-29T10:43:51.923719Z",
      "answered_at": "2026-10-29T10:43:52.391709Z",
      "ended_at": "2026-10-29T10:43:52.409701Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=63ee4b84-2f84-47af-b3eb-58a4ebb7c04a` → **200**

```json
{
  "calls": [
    {
      "id": "7110112e-4b98-4e3c-b3f1-f95d2fa937c9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c8491122-a379-432e-880c-2c074e7909b2",
      "order_ids": [
        "63ee4b84-2f84-47af-b3eb-58a4ebb7c04a"
      ],
      "started_at": "2026-10-29T10:43:51.923719Z",
      "answered_at": "2026-10-29T10:43:52.391709Z",
      "ended_at": "2026-10-29T10:43:52.409701Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=63ee4b84-2f84-47af-b3eb-58a4ebb7c04a` → **200**

```json
{
  "calls": [
    {
      "id": "7110112e-4b98-4e3c-b3f1-f95d2fa937c9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c8491122-a379-432e-880c-2c074e7909b2",
      "order_ids": [
        "63ee4b84-2f84-47af-b3eb-58a4ebb7c04a"
      ],
      "started_at": "2026-10-29T10:43:51.923719Z",
      "answered_at": "2026-10-29T10:43:52.391709Z",
      "ended_at": "2026-10-29T10:43:52.409701Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T10:43:55.928885Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/63ee4b84-2f84-47af-b3eb-58a4ebb7c04a` → **200**

```json
{
  "id": "63ee4b84-2f84-47af-b3eb-58a4ebb7c04a",
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
  "created_at": "2026-10-29T10:43:51.706439Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676685221"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/63ee4b84-2f84-47af-b3eb-58a4ebb7c04a/cancel` → **200**

```json
{
  "command_id": "955bb891-e215-423c-9124-6f39ce72b62a",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "63ee4b84-2f84-47af-b3eb-58a4ebb7c04a",
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
  "created_at": "2026-10-29T10:43:51.706439Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676685221"
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
  "command_id": "f3a37102-efb8-468b-bdbb-da7cf2b1058a",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T10:43:57.487377Z",
  "extension": "101"
}
```

Done: outgoing call 7110112e-4b98-4e3c-b3f1-f95d2fa937c9 from order 63ee4b84-2f84-47af-b3eb-58a4ebb7c04a, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637539489",
  "device_ref": "sandbox-26149"
}
```

```json
{
  "challenge_id": "34a99db8-da69-4946-b341-c9d76888d585",
  "expires_at": "2026-10-29T10:48:57.697238259Z",
  "resend_available_at": "2026-10-29T10:43:58.697238259Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637539489` → **200**

```json
{
  "phone": "+380637539489",
  "audience": "CLIENT",
  "code": "094245",
  "sent_at": "2026-10-29T10:43:57.699236163Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "34a99db8-da69-4946-b341-c9d76888d585",
  "code": "094245",
  "device_ref": "sandbox-26149"
}
```

```json
{
  "session_id": "a2a19a46-4e70-4064-9ce5-de12a48ab457",
  "subject": {
    "type": "CLIENT",
    "id": "09515316-5cec-44ef-a026-51450b9b4521"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOTUxNTMxNi01Y2VjLTQ0ZWYtYTAyNi01MTQ1MGI5YjQ1MjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNTM3LCJpYXQiOjE3OTMyNzA2MzcsImp0aSI6IjI0MWE1YzM3LWQ4YzEtNGViYi05Njg1LTY0OGMwNjQxNTkxOCIsInNpZCI6ImEyYTE5YTQ2LTRlNzAtNDA2NC05Y2U1LWRlMTJhNDhhYjQ1NyJ9.0ttx6vdAggmXdbG8DF_CU-vfpcDUXtdq1dGju7wWJR4",
  "access_expires_at": "2026-10-29T10:58:57.962874274Z",
  "refresh_token": "SfiDISnL6vWrwk7qn5TGJ5ZdSSaf6Uj1IjbgafdWQYs",
  "refresh_expires_at": "2026-11-28T10:43:57.962520041Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "09515316-5cec-44ef-a026-51450b9b4521",
  "session_id": "a2a19a46-4e70-4064-9ce5-de12a48ab457",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637539489",
  "device_ref": "sandbox-8610"
}
```

```json
{
  "challenge_id": "f87d497b-a033-4944-88d4-55a27c9b82a1",
  "expires_at": "2026-10-29T10:49:00.338631155Z",
  "resend_available_at": "2026-10-29T10:44:01.338631155Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637539489` → **200**

```json
{
  "phone": "+380637539489",
  "audience": "CLIENT",
  "code": "330368",
  "sent_at": "2026-10-29T10:44:00.340256519Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f87d497b-a033-4944-88d4-55a27c9b82a1",
  "code": "330368",
  "device_ref": "sandbox-8610"
}
```

```json
{
  "session_id": "213e8514-0f1d-4e19-94e5-0433bc0a2a41",
  "subject": {
    "type": "CLIENT",
    "id": "09515316-5cec-44ef-a026-51450b9b4521"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOTUxNTMxNi01Y2VjLTQ0ZWYtYTAyNi01MTQ1MGI5YjQ1MjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNTQwLCJpYXQiOjE3OTMyNzA2NDAsImp0aSI6IjlkNzQ2OThjLTNjYTEtNGRmNy04Y2NlLTE0MDAyYzI4MzMwYSIsInNpZCI6IjIxM2U4NTE0LTBmMWQtNGUxOS05NGU1LTA0MzNiYzBhMmE0MSJ9.IbMWh2PXGZfVMeoibKDrGmPSDyRlafIHzUBH96lwP84",
  "access_expires_at": "2026-10-29T10:59:00.548974041Z",
  "refresh_token": "cC1P6E2wzoOfCiwhnqYcn__odoL3VK3TbkjAtNtf370",
  "refresh_expires_at": "2026-11-28T10:44:00.548642993Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "0f0d18ea-eedd-41bf-94ae-231e2533902c",
  "expires_at": "2026-10-29T10:49:02.752348559Z",
  "resend_available_at": "2026-10-29T10:44:03.752348559Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637539489` → **200**

```json
{
  "phone": "+380637539489",
  "audience": "CLIENT",
  "code": "775470",
  "sent_at": "2026-10-29T10:44:02.754016216Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380638279024"
}
```

```json
{
  "challenge_id": "b7c773b2-3ef5-4e07-b81d-0c03b4fa20b9",
  "expires_at": "2026-10-29T10:49:03.001843355Z",
  "resend_available_at": "2026-10-29T10:44:04.001843355Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638279024` → **200**

```json
{
  "phone": "+380638279024",
  "audience": "CLIENT",
  "code": "263714",
  "sent_at": "2026-10-29T10:44:03.003388873Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "d4221154-2fba-4390-b821-1a07c69f9185",
  "current_challenge_id": "0f0d18ea-eedd-41bf-94ae-231e2533902c",
  "current_code": "000000",
  "new_challenge_id": "b7c773b2-3ef5-4e07-b81d-0c03b4fa20b9",
  "new_code": "263714"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "f4a0706c-aecc-487c-8515-29d98fa40d4c"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "e157a439-2501-42cf-a595-01cd4a307c53",
  "current_challenge_id": "0f0d18ea-eedd-41bf-94ae-231e2533902c",
  "current_code": "775470",
  "new_challenge_id": "b7c773b2-3ef5-4e07-b81d-0c03b4fa20b9",
  "new_code": "263714"
}
```

```json
{
  "subject_id": "09515316-5cec-44ef-a026-51450b9b4521",
  "phone": "+380638279024",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "09515316-5cec-44ef-a026-51450b9b4521",
  "session_id": "a2a19a46-4e70-4064-9ce5-de12a48ab457",
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
  "correlation_id": "67ad0043-22df-4f01-bd90-0f92e971d9f6"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638279024",
  "device_ref": "sandbox-495"
}
```

```json
{
  "challenge_id": "99de6b3e-cfeb-4abe-84f6-c821de162834",
  "expires_at": "2026-10-29T10:49:05.980243776Z",
  "resend_available_at": "2026-10-29T10:44:06.980243776Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638279024` → **200**

```json
{
  "phone": "+380638279024",
  "audience": "CLIENT",
  "code": "510231",
  "sent_at": "2026-10-29T10:44:05.981928185Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "99de6b3e-cfeb-4abe-84f6-c821de162834",
  "code": "510231",
  "device_ref": "sandbox-495"
}
```

```json
{
  "session_id": "50373317-4662-4867-8f93-59adab1ba174",
  "subject": {
    "type": "CLIENT",
    "id": "09515316-5cec-44ef-a026-51450b9b4521"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOTUxNTMxNi01Y2VjLTQ0ZWYtYTAyNi01MTQ1MGI5YjQ1MjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNTQ2LCJpYXQiOjE3OTMyNzA2NDYsImp0aSI6Ijk3NTU5YzBhLWQ1M2EtNGViZS05YmQ4LWVmMmM4ZjZjNWRhNSIsInNpZCI6IjUwMzczMzE3LTQ2NjItNDg2Ny04ZjkzLTU5YWRhYjFiYTE3NCJ9.ZSZlJyD4y5fOKN2avnvm4BtsYHWEzn2x5qA2IKbT8y8",
  "access_expires_at": "2026-10-29T10:59:06.202163957Z",
  "refresh_token": "-SBCvGHs8Hqo9R6799UB4h_c-OhdJnzMcBdF_KppDbY",
  "refresh_expires_at": "2026-11-28T10:44:06.201830055Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "09515316-5cec-44ef-a026-51450b9b4521",
  "session_id": "50373317-4662-4867-8f93-59adab1ba174",
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
  "session_id": "55080f97-7911-4152-b376-09e403b57af1",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE1NDYsImlhdCI6MTc5MzI3MDY0NiwianRpIjoiZDY1MWZiOGYtMDg3Yy00YTJlLWI3MzItN2VhM2U4ZjM5MmMxIiwic2lkIjoiNTUwODBmOTctNzkxMS00MTUyLWIzNzYtMDllNDAzYjU3YWYxIn0.xEx2uu88qzOljlhmg_isA1s2iXaG6YfWa5M0DkcX2XY",
  "access_expires_at": "2026-10-29T10:59:06.783314198Z",
  "refresh_token": "dtbF8bYsXqRlk9Tw_f_HSUULVWDDObLoeV93DIKGfyo",
  "refresh_expires_at": "2026-10-29T22:44:06.782866115Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/09515316-5cec-44ef-a026-51450b9b4521` → **200**

```json
{
  "client": {
    "id": "09515316-5cec-44ef-a026-51450b9b4521",
    "phone": "+380638279024",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T10:43:57.961149Z",
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

`POST /api/admin/v1/clients/09515316-5cec-44ef-a026-51450b9b4521/phone/new-code` → **201**

```json
{
  "phone": "+380635335164"
}
```

```json
{
  "challenge_id": "cb3dbb1b-fd3e-4498-a9a3-59c01344dc71",
  "expires_at": "2026-10-29T10:49:07.186186653Z",
  "resend_available_at": "2026-10-29T10:44:08.186186653Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635335164` → **200**

```json
{
  "phone": "+380635335164",
  "audience": "CLIENT",
  "code": "758763",
  "sent_at": "2026-10-29T10:44:07.187490433Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/09515316-5cec-44ef-a026-51450b9b4521/phone` → **422**

```json
{
  "command_id": "225dd87d-44b9-43ce-9b19-be17a6e855a9",
  "expected_version": 3,
  "new_challenge_id": "cb3dbb1b-fd3e-4498-a9a3-59c01344dc71",
  "new_code": "758764",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/09515316-5cec-44ef-a026-51450b9b4521/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "11dc3472-8954-4ca4-a1ec-b0f77bdb78ec"
}
```

`POST /api/admin/v1/clients/09515316-5cec-44ef-a026-51450b9b4521/phone` → **400**

```json
{
  "command_id": "c1b8f68b-344f-4843-abed-02ad57fcc279",
  "expected_version": 3,
  "new_challenge_id": "cb3dbb1b-fd3e-4498-a9a3-59c01344dc71",
  "new_code": "758763",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/09515316-5cec-44ef-a026-51450b9b4521/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "40f18d69-59c8-4769-a208-ee32a69bfc3a",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/09515316-5cec-44ef-a026-51450b9b4521/phone` → **200**

```json
{
  "command_id": "657396c4-fc09-40d5-b35f-fc806630caab",
  "expected_version": 3,
  "new_challenge_id": "cb3dbb1b-fd3e-4498-a9a3-59c01344dc71",
  "new_code": "758763",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "09515316-5cec-44ef-a026-51450b9b4521",
  "phone": "+380635335164",
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
  "correlation_id": "cb794df3-017d-4f37-b025-064d294e0da3"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380635335164",
  "device_ref": "sandbox-26442"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "5c9a3a4a-6b45-45e2-8868-69ae0070527d",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635335164",
  "device_ref": "sandbox-26442"
}
```

```json
{
  "challenge_id": "6d5c99ad-7fd3-4acf-b200-22a0caaaae5f",
  "expires_at": "2026-10-29T10:49:09.367606124Z",
  "resend_available_at": "2026-10-29T10:44:10.367606124Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635335164` → **200**

```json
{
  "phone": "+380635335164",
  "audience": "CLIENT",
  "code": "067113",
  "sent_at": "2026-10-29T10:44:09.36940286Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d5c99ad-7fd3-4acf-b200-22a0caaaae5f",
  "code": "067113",
  "device_ref": "sandbox-26442"
}
```

```json
{
  "session_id": "dc6df570-7c7d-4f66-83f7-827d07b5afeb",
  "subject": {
    "type": "CLIENT",
    "id": "09515316-5cec-44ef-a026-51450b9b4521"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOTUxNTMxNi01Y2VjLTQ0ZWYtYTAyNi01MTQ1MGI5YjQ1MjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNTQ5LCJpYXQiOjE3OTMyNzA2NDksImp0aSI6IjkzNmY3NTk0LTdhNzYtNGUzNC05NDQ4LTdkMGUxZGFhNTJmNiIsInNpZCI6ImRjNmRmNTcwLTdjN2QtNGY2Ni04M2Y3LTgyN2QwN2I1YWZlYiJ9.wZDq-yJ3GTyRiWFZapTTU5WFgKKOOzNqoYdx_OERhwY",
  "access_expires_at": "2026-10-29T10:59:09.574722126Z",
  "refresh_token": "O-rgZinR4UiGX34yo9_7wGI93xtytXOSZ4R458doln8",
  "refresh_expires_at": "2026-11-28T10:44:09.574227185Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "09515316-5cec-44ef-a026-51450b9b4521",
  "session_id": "dc6df570-7c7d-4f66-83f7-827d07b5afeb",
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
  "phone": "+380635541370",
  "device_ref": "sandbox-2224"
}
```

```json
{
  "challenge_id": "b1d8d99e-ff78-45da-88e5-ec291d81445f",
  "expires_at": "2026-10-29T10:49:09.973507034Z",
  "resend_available_at": "2026-10-29T10:44:10.973507034Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635541370` → **200**

```json
{
  "phone": "+380635541370",
  "audience": "CLIENT",
  "code": "054219",
  "sent_at": "2026-10-29T10:44:09.975466434Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b1d8d99e-ff78-45da-88e5-ec291d81445f",
  "code": "054219",
  "device_ref": "sandbox-2224"
}
```

```json
{
  "session_id": "53ef3d9c-12e0-4c93-a8fe-159cf55f5e2d",
  "subject": {
    "type": "CLIENT",
    "id": "ffe167e4-926d-4edc-a85c-d8025de8849f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZmUxNjdlNC05MjZkLTRlZGMtYTg1Yy1kODAyNWRlODg0OWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNTUwLCJpYXQiOjE3OTMyNzA2NTAsImp0aSI6ImU0MDMxZGEyLTgyOGMtNGQ5OS1hZTFmLWEzMmYyMDNlNWUzOSIsInNpZCI6IjUzZWYzZDljLTEyZTAtNGM5My1hOGZlLTE1OWNmNTVmNWUyZCJ9.Z9mlElPbqSBPdGHXLzDIMwz_DYqh0bnUlyie8MSBf5A",
  "access_expires_at": "2026-10-29T10:59:10.203585725Z",
  "refresh_token": "GjIGgsHiWdTDXHUzAJmFJkF00dpKsRrX5zVY5Rr__b4",
  "refresh_expires_at": "2026-11-28T10:44:10.203153003Z",
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
  "session_id": "3fe95e0b-65cb-4b06-b63e-618ba381580c",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE1NTEsImlhdCI6MTc5MzI3MDY1MSwianRpIjoiNjViODU0MjQtOWFhYS00NmI3LThhOWItYmM0MjM2MjdkZmIzIiwic2lkIjoiM2ZlOTVlMGItNjVjYi00YjA2LWI2M2UtNjE4YmEzODE1ODBjIn0.2ThkGoKPdDYsGuePJ9vQujYpbQRnobLN40SBfd8XX5U",
  "access_expires_at": "2026-10-29T10:59:11.018267424Z",
  "refresh_token": "6hGRdHMiS4kaD0WgtH3Kt9J_aISBR7kfV6711DFZ3Jg",
  "refresh_expires_at": "2026-10-29T22:44:11.017943927Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380635541370` → **200**

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
  "correlation_id": "fc9988b0-abef-4e2a-86fa-7e2d7bebf6c6"
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
  "session_id": "d1df87fc-7a85-427e-9df8-4fbae3510eb7",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE1NTEsImlhdCI6MTc5MzI3MDY1MSwianRpIjoiOGVkN2ViNzEtMTE2Ni00NWU3LWFkYzQtZDA3NWIwNjJjNDQ5Iiwic2lkIjoiZDFkZjg3ZmMtN2E4NS00MjdlLTlkZjgtNGZiYWUzNTEwZWI3In0.Tn19pbn8r-2rE1Te5SNY3Mw5OVjw9hE1Hqe2-kUIljI",
  "access_expires_at": "2026-10-29T10:59:11.829014269Z",
  "refresh_token": "RCcZ3WJbiX1XGC27A-ZapVomx085G1b921oEo0JDsHc",
  "refresh_expires_at": "2026-10-29T22:44:11.828644272Z",
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
  "changed_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T10:41:14.596802Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "b609004e-ebc3-4f51-960e-77a1d8a7a17c",
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
  "changed_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T10:44:12.210914309Z"
}
```

## The rider books the airport for 2026-10-29T13:44:11Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600733720",
  "device_ref": "sandbox-26466"
}
```

```json
{
  "challenge_id": "8f4bf558-5190-4500-af2a-0cbfffd1038c",
  "expires_at": "2026-10-29T10:49:12.412452772Z",
  "resend_available_at": "2026-10-29T10:44:13.412452772Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600733720` → **200**

```json
{
  "phone": "+48600733720",
  "audience": "CLIENT",
  "code": "399654",
  "sent_at": "2026-10-29T10:44:12.414448986Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f4bf558-5190-4500-af2a-0cbfffd1038c",
  "code": "399654",
  "device_ref": "sandbox-26466"
}
```

```json
{
  "session_id": "078a2285-4915-4e92-89f8-dd2a60138812",
  "subject": {
    "type": "CLIENT",
    "id": "276c7fff-8d96-416d-9f2d-5eab35aafab5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNzZjN2ZmZi04ZDk2LTQxNmQtOWYyZC01ZWFiMzVhYWZhYjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNTUyLCJpYXQiOjE3OTMyNzA2NTIsImp0aSI6ImZiZDQ0YzMxLTFmNDAtNGY0Yi1hYTdhLTBmYjFkMjc0YjZjNSIsInNpZCI6IjA3OGEyMjg1LTQ5MTUtNGU5Mi04OWY4LWRkMmE2MDEzODgxMiJ9.9twMRnQZFJwFBTDCV-0qlwl-PjvoqV-NTqLB2WmEHtE",
  "access_expires_at": "2026-10-29T10:59:12.643572071Z",
  "refresh_token": "Kb20NfMH6iaWtLXka80F019wPhCa79I_Sop7om63U0g",
  "refresh_expires_at": "2026-11-28T10:44:12.643251318Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "07fe673e-9aed-4c54-bb89-d5585cf97c93",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T13:44:11Z"
}
```

```json
{
  "id": "5305a8c8-2de8-4553-bb73-649e2bee7766",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:49:12.836017Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T13:44:11Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "e910e7a6-a7f5-4fe8-83ea-33f16edaf4d9",
  "quote_id": "5305a8c8-2de8-4553-bb73-649e2bee7766",
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
  "pickup_at": "2026-10-29T13:44:11Z"
}
```

```json
{
  "id": "3291066f-0169-43f1-bb97-6bd0f8122d94",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "276c7fff-8d96-416d-9f2d-5eab35aafab5",
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
  "created_at": "2026-10-29T10:44:13.036012Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T13:44:11Z",
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
  "device_ref": "sandbox-5413"
}
```

```json
{
  "challenge_id": "62443afa-4780-42db-a784-66d8280b95d9",
  "expires_at": "2026-10-29T10:49:13.242053851Z",
  "resend_available_at": "2026-10-29T10:44:14.242053851Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "089457",
  "sent_at": "2026-10-29T10:44:13.244343351Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62443afa-4780-42db-a784-66d8280b95d9",
  "code": "089457",
  "device_ref": "sandbox-5413"
}
```

```json
{
  "session_id": "d0753903-f786-44b7-ade4-95686b792c60",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTU1MywiaWF0IjoxNzkzMjcwNjUzLCJqdGkiOiIxYjg5MGQxOS0wYjk0LTRjNDctYjFjNC04ODk5ZjY2YzgwMTgiLCJzaWQiOiJkMDc1MzkwMy1mNzg2LTQ0YjctYWRlNC05NTY4NmI3OTJjNjAifQ.YG9XiLxyP5DWXZLnJHMjs1O1tlHsb5nBLl6B14NhB5s",
  "access_expires_at": "2026-10-29T10:59:13.454826157Z",
  "refresh_token": "HFNYfcE949cmdSg0UB16LJp-L7A3zr_P0Xiwdg0kh_c",
  "refresh_expires_at": "2026-11-28T10:44:13.454413185Z",
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
  "command_id": "1c11cd2b-2e31-41cb-8180-f08cf8a8bab6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:44:13Z",
    "sequence": 1793270653828
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "25645c18-046e-4bf2-a4a9-c0ab93ffc7d1",
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
  "last_heartbeat_at": "2026-10-29T10:44:13.844168Z",
  "last_location_at": "2026-10-29T10:44:13.844168Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "3291066f-0169-43f1-bb97-6bd0f8122d94",
      "short_number": 24,
      "pickup_at": "2026-10-29T13:44:11Z",
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

`POST /api/driver/v1/preorders/3291066f-0169-43f1-bb97-6bd0f8122d94/reserve` → **200**

```json
{
  "command_id": "aa43137c-982b-4178-8b73-df4be1abe248"
}
```

```json
{
  "id": "2405b62d-4943-4263-b01d-b0a08ca2ed9c",
  "state": "RESERVED",
  "order": {
    "order_id": "3291066f-0169-43f1-bb97-6bd0f8122d94",
    "short_number": 24,
    "pickup_at": "2026-10-29T13:44:11Z",
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
  "reserved_at": "2026-10-29T10:44:14.237727Z",
  "confirm_from": "2026-10-29T13:14:11Z",
  "confirm_until": "2026-10-29T13:24:11Z",
  "drop_until": "2026-10-29T12:44:11Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "2405b62d-4943-4263-b01d-b0a08ca2ed9c",
      "state": "RESERVED",
      "order": {
        "order_id": "3291066f-0169-43f1-bb97-6bd0f8122d94",
        "short_number": 24,
        "pickup_at": "2026-10-29T13:44:11Z",
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
      "reserved_at": "2026-10-29T10:44:14.237727Z",
      "confirm_from": "2026-10-29T13:14:11Z",
      "confirm_until": "2026-10-29T13:24:11Z",
      "drop_until": "2026-10-29T12:44:11Z"
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
      "id": "2405b62d-4943-4263-b01d-b0a08ca2ed9c",
      "state": "RESERVED",
      "order": {
        "order_id": "3291066f-0169-43f1-bb97-6bd0f8122d94",
        "short_number": 24,
        "pickup_at": "2026-10-29T13:44:11Z",
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
      "reserved_at": "2026-10-29T10:44:14.237727Z",
      "confirm_from": "2026-10-29T13:14:11Z",
      "confirm_until": "2026-10-29T13:24:11Z",
      "drop_until": "2026-10-29T12:44:11Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/2405b62d-4943-4263-b01d-b0a08ca2ed9c/confirm` → **409**

```json
{
  "command_id": "018fe20b-1370-44ff-b14b-cd622f9a7496"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/2405b62d-4943-4263-b01d-b0a08ca2ed9c/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2c150138-c3f5-4e32-ac07-c0af40bc7612"
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
  "session_id": "a3b09bcd-bcc2-4449-9d4f-070160d8a8de",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE1NTUsImlhdCI6MTc5MzI3MDY1NSwianRpIjoiOGZiMDVlY2EtYTc2OC00MDNkLWFkYTctNjYwYTc1Y2RmYTdkIiwic2lkIjoiYTNiMDliY2QtYmNjMi00NDQ5LTlkNGYtMDcwMTYwZDhhOGRlIn0.nCNzMCjGJLwW7nrfG3XGUhkMxFytcQ5my9VPm6OL4IE",
  "access_expires_at": "2026-10-29T10:59:15.287667295Z",
  "refresh_token": "G_w7E1M-DQfV35KUArp2gS01fCt8Rr4xI9iGRPqfCdg",
  "refresh_expires_at": "2026-10-29T22:44:15.287211609Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3291066f-0169-43f1-bb97-6bd0f8122d94` → **200**

```json
{
  "id": "3291066f-0169-43f1-bb97-6bd0f8122d94",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "276c7fff-8d96-416d-9f2d-5eab35aafab5",
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
  "created_at": "2026-10-29T10:44:13.036012Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T13:44:11Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "2405b62d-4943-4263-b01d-b0a08ca2ed9c",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T10:44:14.237727Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/3291066f-0169-43f1-bb97-6bd0f8122d94/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T10:44:13.036859Z",
      "actor": {
        "type": "CLIENT",
        "id": "276c7fff-8d96-416d-9f2d-5eab35aafab5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "3291066f-0169-43f1-bb97-6bd0f8122d94",
        "preorder": true,
        "quote_id": "5305a8c8-2de8-4553-bb73-649e2bee7766",
        "pickup_at": "2026-10-29T13:44:11Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "36ac8dca-e11f-4188-ae5f-efedded74ca5"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T10:44:14.238676Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3291066f-0169-43f1-bb97-6bd0f8122d94",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "2405b62d-4943-4263-b01d-b0a08ca2ed9c"
      },
      "correlation_id": "7eb0f6ef-f61e-4fc1-b821-5377bc427e76"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 3291066f-0169-43f1-bb97-6bd0f8122d94, reservation 2405b62d-4943-4263-b01d-b0a08ca2ed9c.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12364"
}
```

```json
{
  "challenge_id": "91fc01f4-bc93-440d-9ce1-4844b6a14415",
  "expires_at": "2026-10-29T10:49:15.920704951Z",
  "resend_available_at": "2026-10-29T10:44:16.920704951Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "746185",
  "sent_at": "2026-10-29T10:44:15.922541305Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "91fc01f4-bc93-440d-9ce1-4844b6a14415",
  "code": "746185",
  "device_ref": "sandbox-12364"
}
```

```json
{
  "session_id": "d20443ea-4386-469c-9746-967df13eb8d2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTU1NiwiaWF0IjoxNzkzMjcwNjU2LCJqdGkiOiI4ZWRhZDNlYi0xZTgxLTQ3NTItYjQxNC1iMmQyZTI5MWY3M2YiLCJzaWQiOiJkMjA0NDNlYS00Mzg2LTQ2OWMtOTc0Ni05NjdkZjEzZWI4ZDIifQ.ZvFm8Qtfb66p_il3EEDKLLBlcXYYvsdnur5vlxzztfs",
  "access_expires_at": "2026-10-29T10:59:16.138821244Z",
  "refresh_token": "D5ajFaLTSdXkb-Af1DD_YsPRxLQaa8zDVf_-HB41iY4",
  "refresh_expires_at": "2026-11-28T10:44:16.138474903Z",
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
  "command_id": "62a5b211-72c1-422a-be9a-f2a3f0ebde4a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:44:16Z",
    "sequence": 1793270656509
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "15c5fea7-dfdd-4715-b687-8114aa922145",
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
  "last_heartbeat_at": "2026-10-29T10:44:16.526037Z",
  "last_location_at": "2026-10-29T10:44:16.526037Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678177672",
  "device_ref": "sandbox-13209"
}
```

```json
{
  "challenge_id": "b5c39417-740e-443c-bf34-983b3f04bac6",
  "expires_at": "2026-10-29T10:49:16.714972619Z",
  "resend_available_at": "2026-10-29T10:44:17.714972619Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678177672` → **200**

```json
{
  "phone": "+380678177672",
  "audience": "CLIENT",
  "code": "917766",
  "sent_at": "2026-10-29T10:44:16.716953214Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b5c39417-740e-443c-bf34-983b3f04bac6",
  "code": "917766",
  "device_ref": "sandbox-13209"
}
```

```json
{
  "session_id": "ee101a0f-eca0-4311-bcac-88295b73111b",
  "subject": {
    "type": "CLIENT",
    "id": "6a23d00c-6065-4335-a3a4-896147e4d445"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YTIzZDAwYy02MDY1LTQzMzUtYTNhNC04OTYxNDdlNGQ0NDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNTU2LCJpYXQiOjE3OTMyNzA2NTYsImp0aSI6IjZhNDBhZGFjLWM3MzAtNDc1OS05ZjUwLWNjOGM2OTgwYjIzMyIsInNpZCI6ImVlMTAxYTBmLWVjYTAtNDMxMS1iY2FjLTg4Mjk1YjczMTExYiJ9.Q1PvJE43QfTvcsTZSTM7fsFDTbB1Vkxkd_2bNUtafZg",
  "access_expires_at": "2026-10-29T10:59:16.926591241Z",
  "refresh_token": "EB13EF1hVaZwAX9y_EpwJixuYFMFgWVb-eX-Lf60sps",
  "refresh_expires_at": "2026-11-28T10:44:16.926029352Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "851c5a15-7462-40f4-846e-50e4ac43efbe",
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
  "id": "e74e0244-a508-4fda-aed4-b7084f179a66",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:49:17.122631Z",
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
  "command_id": "076d3a8f-52c5-4588-8b57-f874982a77a1",
  "quote_id": "e74e0244-a508-4fda-aed4-b7084f179a66",
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
  "id": "7a4c90f2-9f51-4d8e-b7b7-05d5e72a3178",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6a23d00c-6065-4335-a3a4-896147e4d445",
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
  "created_at": "2026-10-29T10:44:17.321435Z",
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
    "id": "77b4c41d-a155-401d-8d95-15ebacc5b552",
    "order_id": "7a4c90f2-9f51-4d8e-b7b7-05d5e72a3178",
    "expires_at": "2026-10-29T10:44:32.32458Z",
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

`POST /api/driver/v1/offers/77b4c41d-a155-401d-8d95-15ebacc5b552/accept` → **200**

```json
{
  "command_id": "2e5a558e-4efb-4a5e-a08e-8a92f6f63832"
}
```

```json
{
  "id": "4d77d91c-bc9e-481e-aed2-209f074d5930",
  "order_id": "7a4c90f2-9f51-4d8e-b7b7-05d5e72a3178",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b8ddb9f1-0e9d-4ddf-b9b8-b0936379f62b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b8ddb9f1-0e9d-4ddf-b9b8-b0936379f62b",
  "order_id": "7a4c90f2-9f51-4d8e-b7b7-05d5e72a3178",
  "assignment_id": "4d77d91c-bc9e-481e-aed2-209f074d5930",
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

`POST /api/driver/v1/work-sessions/15c5fea7-dfdd-4715-b687-8114aa922145/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:44:18Z",
    "sequence": 1793270658889
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "15c5fea7-dfdd-4715-b687-8114aa922145",
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
  "last_heartbeat_at": "2026-10-29T10:44:18.104616Z",
  "last_location_at": "2026-10-29T10:44:18.104616Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b8ddb9f1-0e9d-4ddf-b9b8-b0936379f62b",
  "order_id": "7a4c90f2-9f51-4d8e-b7b7-05d5e72a3178",
  "assignment_id": "4d77d91c-bc9e-481e-aed2-209f074d5930",
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

`POST /api/driver/v1/trips/b8ddb9f1-0e9d-4ddf-b9b8-b0936379f62b/arrive` → **200**

```json
{
  "command_id": "9cd26de4-69d0-43eb-a16a-f74c78cd6b4d",
  "expected_version": 0
}
```

```json
{
  "id": "b8ddb9f1-0e9d-4ddf-b9b8-b0936379f62b",
  "order_id": "7a4c90f2-9f51-4d8e-b7b7-05d5e72a3178",
  "assignment_id": "4d77d91c-bc9e-481e-aed2-209f074d5930",
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
  "arrived_at": "2026-10-29T10:44:18.481142Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b8ddb9f1-0e9d-4ddf-b9b8-b0936379f62b/start` → **200**

```json
{
  "command_id": "726640c5-e2ff-4973-b339-e31a91dec1e6",
  "expected_version": 1
}
```

```json
{
  "id": "b8ddb9f1-0e9d-4ddf-b9b8-b0936379f62b",
  "order_id": "7a4c90f2-9f51-4d8e-b7b7-05d5e72a3178",
  "assignment_id": "4d77d91c-bc9e-481e-aed2-209f074d5930",
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
  "arrived_at": "2026-10-29T10:44:18.481142Z",
  "started_at": "2026-10-29T10:44:18.677118Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/15c5fea7-dfdd-4715-b687-8114aa922145/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:44:18Z",
    "sequence": 1793270658890
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "15c5fea7-dfdd-4715-b687-8114aa922145",
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
  "last_heartbeat_at": "2026-10-29T10:44:18.887629Z",
  "last_location_at": "2026-10-29T10:44:18.887629Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/b8ddb9f1-0e9d-4ddf-b9b8-b0936379f62b/complete` → **200**

```json
{
  "command_id": "0d3f038c-2d6a-420d-82d3-b3cfcffe122d",
  "expected_version": 2,
  "reported_at": "2026-10-29T10:44:19Z",
  "cash_received": true
}
```

```json
{
  "id": "b8ddb9f1-0e9d-4ddf-b9b8-b0936379f62b",
  "order_id": "7a4c90f2-9f51-4d8e-b7b7-05d5e72a3178",
  "assignment_id": "4d77d91c-bc9e-481e-aed2-209f074d5930",
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
  "arrived_at": "2026-10-29T10:44:18.481142Z",
  "started_at": "2026-10-29T10:44:18.677118Z",
  "completed_at": "2026-10-29T10:44:19.080006Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/7a4c90f2-9f51-4d8e-b7b7-05d5e72a3178/rating` → **200**

```json
{
  "command_id": "f41890e8-0c55-491b-90c4-b20c1adefb96",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "7a4c90f2-9f51-4d8e-b7b7-05d5e72a3178",
  "score": 5,
  "created_at": "2026-10-29T10:44:19.294592089Z"
}
```

`POST /api/driver/v1/orders/7a4c90f2-9f51-4d8e-b7b7-05d5e72a3178/rating` → **200**

```json
{
  "command_id": "c53e14ed-92ba-41e7-bb1e-f2d47ab7fbd2",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "7a4c90f2-9f51-4d8e-b7b7-05d5e72a3178",
  "score": 4,
  "created_at": "2026-10-29T10:44:19.491536832Z"
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
  "session_id": "5143dcdc-92ae-4176-a0fc-348a8c3ab84f",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE1NjAsImlhdCI6MTc5MzI3MDY2MCwianRpIjoiYzZhYzA2NWMtODA0Zi00MzU4LTliYzgtMzRlZWE4N2E5NGU5Iiwic2lkIjoiNTE0M2RjZGMtOTJhZS00MTc2LWEwZmMtMzQ4YThjM2FiODRmIn0.l3cyO0SMRPmazfh6ofOiSuCiwoSog-_RI-HM57wTWtE",
  "access_expires_at": "2026-10-29T10:59:20.079940546Z",
  "refresh_token": "1MsZCGCdR9mouL1TW7h2UdJZRc9spDucD_haKU8D-mU",
  "refresh_expires_at": "2026-10-29T22:44:20.079551977Z",
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
  "session_id": "61ebd172-fd4b-4c65-92a1-436ab639984c",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE1NjAsImlhdCI6MTc5MzI3MDY2MCwianRpIjoiOWFjMTkzYzctNjA4Ny00MzAyLThiMGItNDllYmZkNzAxZGU2Iiwic2lkIjoiNjFlYmQxNzItZmQ0Yi00YzY1LTkyYTEtNDM2YWI2Mzk5ODRjIn0.G1HPG5n9PtIRpwS6lLGy1VgR2sZS89cIiO4yme_I90s",
  "access_expires_at": "2026-10-29T10:59:20.471115311Z",
  "refresh_token": "q5SbhK4Iw6Sqx-kDlhdR71ZtyWf1MbB1hhyMDl0T2lg",
  "refresh_expires_at": "2026-10-29T22:44:20.470782461Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7a4c90f2-9f51-4d8e-b7b7-05d5e72a3178/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "7a4c90f2-9f51-4d8e-b7b7-05d5e72a3178",
      "author_type": "RIDER",
      "author_id": "6a23d00c-6065-4335-a3a4-896147e4d445",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T10:44:19.294592Z"
    },
    {
      "order_id": "7a4c90f2-9f51-4d8e-b7b7-05d5e72a3178",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "6a23d00c-6065-4335-a3a4-896147e4d445",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T10:44:19.491537Z"
    }
  ]
}
```

Done: ratings for order 7a4c90f2-9f51-4d8e-b7b7-05d5e72a3178.

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
  "session_id": "e7048e97-1e9c-4b25-90b8-095ee4680878",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE1NjEsImlhdCI6MTc5MzI3MDY2MSwianRpIjoiMjJiZGRlNjQtYTExZS00YTkxLWJlNmMtYmRiMzI4OTAyMWEzIiwic2lkIjoiZTcwNDhlOTctMWU5Yy00YjI1LTkwYjgtMDk1ZWU0NjgwODc4In0.f63uPqAA8GT4og0Avv1BvjgblQeqlL7JOeN5pWh9OmI",
  "access_expires_at": "2026-10-29T10:59:21.073397769Z",
  "refresh_token": "NTUxaOMk0ImWNjzWV1Lfd3Jgjzz8AODBGZD6R7P_Xa8",
  "refresh_expires_at": "2026-10-29T22:44:21.073061513Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "8abe2149-2b93-4a61-8e7c-012530b8b413",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "a7c0d451-dee9-4e56-846a-811c2359d9e7",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T10:44:21.269472Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a7c0d451-dee9-4e56-846a-811c2359d9e7` → **200**

```json
{
  "id": "a7c0d451-dee9-4e56-846a-811c2359d9e7",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T10:44:21.269472Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a7c0d451-dee9-4e56-846a-811c2359d9e7` → **200**

```json
{
  "id": "a7c0d451-dee9-4e56-846a-811c2359d9e7",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T10:44:21.269472Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a7c0d451-dee9-4e56-846a-811c2359d9e7` → **200**

```json
{
  "id": "a7c0d451-dee9-4e56-846a-811c2359d9e7",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T10:44:21.269472Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a7c0d451-dee9-4e56-846a-811c2359d9e7` → **200**

```json
{
  "id": "a7c0d451-dee9-4e56-846a-811c2359d9e7",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T10:44:21.269472Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a7c0d451-dee9-4e56-846a-811c2359d9e7` → **200**

```json
{
  "id": "a7c0d451-dee9-4e56-846a-811c2359d9e7",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T10:44:21.269472Z",
  "ready_at": "2026-10-29T10:44:25.943409Z",
  "expires_at": "2026-10-30T10:44:25.943409Z"
}
```

`GET /api/admin/v1/reports/exports/a7c0d451-dee9-4e56-846a-811c2359d9e7/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "1fce2594-5ddb-4320-8478-41c40231bf44",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "361e0b11-19fc-46a9-a479-e40959278e2c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T10:44:26.45841Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/361e0b11-19fc-46a9-a479-e40959278e2c` → **200**

```json
{
  "id": "361e0b11-19fc-46a9-a479-e40959278e2c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T10:44:26.45841Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/361e0b11-19fc-46a9-a479-e40959278e2c` → **200**

```json
{
  "id": "361e0b11-19fc-46a9-a479-e40959278e2c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T10:44:26.45841Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/361e0b11-19fc-46a9-a479-e40959278e2c` → **200**

```json
{
  "id": "361e0b11-19fc-46a9-a479-e40959278e2c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T10:44:26.45841Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/361e0b11-19fc-46a9-a479-e40959278e2c` → **200**

```json
{
  "id": "361e0b11-19fc-46a9-a479-e40959278e2c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T10:44:26.45841Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/361e0b11-19fc-46a9-a479-e40959278e2c` → **200**

```json
{
  "id": "361e0b11-19fc-46a9-a479-e40959278e2c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T10:44:26.45841Z",
  "ready_at": "2026-10-29T10:44:30.949401Z",
  "expires_at": "2026-10-30T10:44:30.949401Z"
}
```

`GET /api/admin/v1/reports/exports/361e0b11-19fc-46a9-a479-e40959278e2c/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/bb5ef40b-9694-420d-a8c8-e974049f2e38` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/bb5ef40b-9694-420d-a8c8-e974049f2e38",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1b7b5670-995a-443c-a88a-0d948d130842"
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
  "device_ref": "sandbox-10168"
}
```

```json
{
  "challenge_id": "cf6d8b03-278d-4515-9bdc-56a545b6548c",
  "expires_at": "2026-10-29T10:49:31.820817246Z",
  "resend_available_at": "2026-10-29T10:44:32.820817246Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "386572",
  "sent_at": "2026-10-29T10:44:31.822728176Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf6d8b03-278d-4515-9bdc-56a545b6548c",
  "code": "386572",
  "device_ref": "sandbox-10168"
}
```

```json
{
  "session_id": "fb29c49e-0eeb-4d01-9685-25b6f73fc246",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTU3MiwiaWF0IjoxNzkzMjcwNjcyLCJqdGkiOiJiMmExOGJkZS1mM2U4LTRjOTEtOGRiZC00YWM0ZDI4NDM2MTYiLCJzaWQiOiJmYjI5YzQ5ZS0wZWViLTRkMDEtOTY4NS0yNWI2ZjczZmMyNDYifQ.-SPcOPoeTW1wpEg5zpvB4kPhQk7De9wxjzR4GeVgUh8",
  "access_expires_at": "2026-10-29T10:59:32.023893919Z",
  "refresh_token": "WruR4yduwujY-Pjt8gSHZ5EUPdru5htR-iBECyUKQ60",
  "refresh_expires_at": "2026-11-28T10:44:32.023565134Z",
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
  "command_id": "d22dc1cb-545c-4b7c-95ee-48286cfd2979",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:44:32Z",
    "sequence": 1793270672567
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "13949f64-0e5e-49f8-8e88-06d1e3c02717",
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
  "last_heartbeat_at": "2026-10-29T10:44:32.582133Z",
  "last_location_at": "2026-10-29T10:44:32.582133Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "cb0db451-bc3d-4436-bc62-fd0adbeff58a",
  "points": [
    {
      "sequence": 1793270674783,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T10:43:34Z"
    },
    {
      "sequence": 1793270674789,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T10:44:34Z"
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
  "session_id": "d15f1231-d198-4aac-a60d-fb814a9a1b91",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE1NzUsImlhdCI6MTc5MzI3MDY3NSwianRpIjoiMjhiZWVkYTgtMGRiNy00NzJlLWJjNGQtMTE2ZThiYzRlMDU4Iiwic2lkIjoiZDE1ZjEyMzEtZDE5OC00YWFjLWE2MGQtZmI4MTRhOWExYjkxIn0.S_cTdTTuXsXzqt_EC-7IgiJtZcnJVE4xMGusxHGfTdM",
  "access_expires_at": "2026-10-29T10:59:35.195795684Z",
  "refresh_token": "wrrwF0pJa30WwcoK-_s2st1muYNZbdHrdE7HwxcgM70",
  "refresh_expires_at": "2026-10-29T22:44:35.195446179Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "5c3f8a35-73fa-44bb-b012-bc78c05b8b93",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T10:44:34Z",
        "track_point_id": "850085fd-b445-43e8-af37-2c5c0f967e56",
        "work_session_id": "13949f64-0e5e-49f8-8e88-06d1e3c02717"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T10:44:34Z",
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

`POST /api/admin/v1/driver-risk-flags/5c3f8a35-73fa-44bb-b012-bc78c05b8b93/confirm` → **200**

```json
{
  "command_id": "2cb7fe2f-0e20-46ca-94f3-536a2b33882a",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "5c3f8a35-73fa-44bb-b012-bc78c05b8b93",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T10:44:34Z",
    "track_point_id": "850085fd-b445-43e8-af37-2c5c0f967e56",
    "work_session_id": "13949f64-0e5e-49f8-8e88-06d1e3c02717"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T10:44:34Z",
  "reason": null,
  "reviewed_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "reviewed_at": "2026-10-29T10:44:35.851135Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/5c3f8a35-73fa-44bb-b012-bc78c05b8b93/dismiss` → **409**

```json
{
  "command_id": "df69651e-69a1-46ee-954c-4e8ff15739fc",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/5c3f8a35-73fa-44bb-b012-bc78c05b8b93/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a0967c14-c3df-40f0-b845-34defbbf375b"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "73e22824-ce33-4a5e-9199-a55561db2d96",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "f4878589-81be-47d1-898b-d14abd20ddc1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "raised_at": "2026-10-29T10:44:36.228313Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/f4878589-81be-47d1-898b-d14abd20ddc1/dismiss` → **200**

```json
{
  "command_id": "2117c819-438e-43c3-9aac-bd96f97785e7",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "f4878589-81be-47d1-898b-d14abd20ddc1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "raised_at": "2026-10-29T10:44:36.228313Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "reviewed_at": "2026-10-29T10:44:36.421593Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "72b9a257-4f45-4d9a-9247-f5c75eaa9c3c",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "5c3f8a35-73fa-44bb-b012-bc78c05b8b93"
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
      "actor_id": "c8491122-a379-432e-880c-2c074e7909b2",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T10:44:36.663423Z"
    }
  ]
}
```

Done: flag 5c3f8a35-73fa-44bb-b012-bc78c05b8b93 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "6c9af29c-2922-4461-9efe-bdf101713672",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE1NzcsImlhdCI6MTc5MzI3MDY3NywianRpIjoiN2QzYjBiMmUtZGExNS00YzBlLWI1ODUtODFmMjZiMDE4Yzc1Iiwic2lkIjoiNmM5YWYyOWMtMjkyMi00NDYxLTllZmUtYmRmMTAxNzEzNjcyIn0.7wp3hPvINhMtxFEwLI6gESAp9T89REREIt_gKyGLiXY",
  "access_expires_at": "2026-10-29T10:59:37.234697595Z",
  "refresh_token": "24W-ZuwYDKHr_i4rwDQ_5hHSJMxJyZwD6MlCDCr-pMI",
  "refresh_expires_at": "2026-10-29T22:44:37.234235021Z",
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
      "actor_id": "c8491122-a379-432e-880c-2c074e7909b2",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T10:44:36.663423Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "6f7e084a-6475-469c-9f8f-6b2ea2ed1875",
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
  "session_id": "13949f64-0e5e-49f8-8e88-06d1e3c02717",
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
  "last_heartbeat_at": "2026-10-29T10:44:32.582133Z",
  "last_location_at": "2026-10-29T10:44:32.582133Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/13949f64-0e5e-49f8-8e88-06d1e3c02717/close` → **200**

```json
{
  "command_id": "60803e46-791c-416b-8e7f-08e99308de08",
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
  "session_id": "f88d4e81-37d3-4ffe-99d9-c241fa122bb3",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE1NzgsImlhdCI6MTc5MzI3MDY3OCwianRpIjoiNmQ4MDIzMmMtZDJlNC00MmE2LWJlNDAtOTg3MjhlZjE2MDdhIiwic2lkIjoiZjg4ZDRlODEtMzdkMy00ZmZlLTk5ZDktYzI0MWZhMTIyYmIzIn0.hZecmrn47r1bczUKPwGfl9WbFxaJ7VUx0npQJxY3-F8",
  "access_expires_at": "2026-10-29T10:59:38.384731755Z",
  "refresh_token": "DMNC63J7IuByAjjbQH-uZk12tt0oUWCPS_9w4Kqq8fU",
  "refresh_expires_at": "2026-10-29T22:44:38.384387247Z",
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
  "command_id": "0089115b-d63c-440c-8e97-67d7163bd2af",
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
  "changed_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T10:44:38.765474Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "0089115b-d63c-440c-8e97-67d7163bd2af",
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
  "changed_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T10:44:38.765474Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48936039273",
  "device_ref": "sandbox-23290"
}
```

```json
{
  "challenge_id": "d71f7349-2785-4283-b059-e4d8b155847d",
  "expires_at": "2026-10-29T10:49:39.165166949Z",
  "resend_available_at": "2026-10-29T10:44:40.165166949Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48936039273` → **200**

```json
{
  "phone": "+48936039273",
  "audience": "CLIENT",
  "code": "959440",
  "sent_at": "2026-10-29T10:44:39.167131493Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d71f7349-2785-4283-b059-e4d8b155847d",
  "code": "959440",
  "device_ref": "sandbox-23290"
}
```

```json
{
  "session_id": "4562ec9b-42d4-4513-81d0-b7ce766c83be",
  "subject": {
    "type": "CLIENT",
    "id": "d5938f18-ea71-4c7b-b4ba-3bd019882589"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTkzOGYxOC1lYTcxLTRjN2ItYjRiYS0zYmQwMTk4ODI1ODkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNTc5LCJpYXQiOjE3OTMyNzA2NzksImp0aSI6ImUyNGUyMjU5LTM5YjYtNDVlNS05ZDMxLWM0YzZkMGQ4M2VmOSIsInNpZCI6IjQ1NjJlYzliLTQyZDQtNDUxMy04MWQwLWI3Y2U3NjZjODNiZSJ9.JU0iE8e7kNZD8qIhhTGVr_rh71lfegfnlUzxYXsyeQs",
  "access_expires_at": "2026-10-29T10:59:39.379502441Z",
  "refresh_token": "hcnDrUrHcIkwwbLTa7F91o745swoqGe45Fi0go3bSCs",
  "refresh_expires_at": "2026-11-28T10:44:39.379034368Z",
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
  "correlation_id": "7c56ef23-e63b-4226-9e39-f091f7d6301c"
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
  "device_ref": "sandbox-4484"
}
```

```json
{
  "challenge_id": "a8098e60-0a71-4f1c-8185-dbf20ee6bec0",
  "expires_at": "2026-10-29T10:49:39.928997832Z",
  "resend_available_at": "2026-10-29T10:44:40.928997832Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "148656",
  "sent_at": "2026-10-29T10:44:39.930747244Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a8098e60-0a71-4f1c-8185-dbf20ee6bec0",
  "code": "148656",
  "device_ref": "sandbox-4484"
}
```

```json
{
  "session_id": "29328e86-af40-46f5-83e7-e551bd4db4a1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTU4MCwiaWF0IjoxNzkzMjcwNjgwLCJqdGkiOiI2OGExNzM5OS00NzdlLTQ0YjEtYWY1Ny02MWY2YjgyODJkMDkiLCJzaWQiOiIyOTMyOGU4Ni1hZjQwLTQ2ZjUtODNlNy1lNTUxYmQ0ZGI0YTEifQ.FSjeZsD_MS05ywAl_fmjw2An3-NuVqEFN-bjXpBx-Wo",
  "access_expires_at": "2026-10-29T10:59:40.171463956Z",
  "refresh_token": "t-Ql-THPKFrsy_m7ul6RG0oO1SYsOLG-PcbOY6VrTVs",
  "refresh_expires_at": "2026-11-28T10:44:40.171064165Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "25645c18-046e-4bf2-a4a9-c0ab93ffc7d1",
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
  "last_heartbeat_at": "2026-10-29T10:44:13.844168Z",
  "last_location_at": "2026-10-29T10:44:13.844168Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/25645c18-046e-4bf2-a4a9-c0ab93ffc7d1/handover` → **200**

```json
{
  "command_id": "55c0c8d4-7781-48c0-9761-6f202a7e7d17",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "25645c18-046e-4bf2-a4a9-c0ab93ffc7d1",
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
  "last_heartbeat_at": "2026-10-29T10:44:13.844168Z",
  "last_location_at": "2026-10-29T10:44:13.844168Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/25645c18-046e-4bf2-a4a9-c0ab93ffc7d1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:44:40Z",
    "sequence": 1793270680695
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "25645c18-046e-4bf2-a4a9-c0ab93ffc7d1",
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
  "last_heartbeat_at": "2026-10-29T10:44:40.709697Z",
  "last_location_at": "2026-10-29T10:44:40.709697Z",
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
  "session_id": "25645c18-046e-4bf2-a4a9-c0ab93ffc7d1",
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
  "last_heartbeat_at": "2026-10-29T10:44:40.709697Z",
  "last_location_at": "2026-10-29T10:44:40.709697Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/25645c18-046e-4bf2-a4a9-c0ab93ffc7d1/close` → **200**

```json
{
  "command_id": "22435c2e-7257-474b-a65d-b79d718acf22",
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
  "correlation_id": "3bca5207-b68c-4a7d-bdf6-60d4c75b3bd0"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678973742",
  "device_ref": "sandbox-20686"
}
```

```json
{
  "challenge_id": "562927ea-f1d1-4f49-89be-5080ebb361f5",
  "expires_at": "2026-10-29T10:49:41.630336456Z",
  "resend_available_at": "2026-10-29T10:44:42.630336456Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678973742` → **200**

```json
{
  "phone": "+380678973742",
  "audience": "CLIENT",
  "code": "222277",
  "sent_at": "2026-10-29T10:44:41.632157844Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "562927ea-f1d1-4f49-89be-5080ebb361f5",
  "code": "222277",
  "device_ref": "sandbox-20686"
}
```

```json
{
  "session_id": "666b08e2-bf5c-45a4-9da9-383acb13f824",
  "subject": {
    "type": "CLIENT",
    "id": "5eeb756e-def0-4eb3-954a-2a16a862a7b5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZWViNzU2ZS1kZWYwLTRlYjMtOTU0YS0yYTE2YTg2MmE3YjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNTgxLCJpYXQiOjE3OTMyNzA2ODEsImp0aSI6ImE3NTExYzM5LWIyZWItNDM3Mi05MTQ2LTUwZjhmY2IzYmUxZSIsInNpZCI6IjY2NmIwOGUyLWJmNWMtNDVhNC05ZGE5LTM4M2FjYjEzZjgyNCJ9.bAvPYNl-PJTqG6yt0EhxZIrPYb3OuJxNP6O8fMmv0Js",
  "access_expires_at": "2026-10-29T10:59:41.84221301Z",
  "refresh_token": "8p5TwVfgeeDTSW4GsIDzTfjteFgiFRimXIRgMnYdY9E",
  "refresh_expires_at": "2026-11-28T10:44:41.841823785Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "b6eb98d4-52c7-4076-a524-ae88f6b8b183",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "cd23820b-6dca-4c1a-b10f-d4042629c34b",
  "upload_path": "/api/rider/v1/uploads/cd23820b-6dca-4c1a-b10f-d4042629c34b",
  "expires_at": "2026-10-29T10:59:42.037598847Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/cd23820b-6dca-4c1a-b10f-d4042629c34b` → **200**

```json
{
  "file_id": "cd23820b-6dca-4c1a-b10f-d4042629c34b",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "89d3ab02-163f-4b14-9559-d9c39830eb12",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "cd23820b-6dca-4c1a-b10f-d4042629c34b"
  ]
}
```

```json
{
  "id": "cf23cf49-d9d5-450a-9f59-c5aab84d3c49",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "5eeb756e-def0-4eb3-954a-2a16a862a7b5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T10:44:42.262452Z",
  "updated_at": "2026-10-29T10:44:42.262452Z",
  "respond_by": "2026-10-29T14:44:42.262452Z",
  "messages": [
    {
      "id": "5c739f0c-3865-444f-98a2-11bbd4b932b5",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "5eeb756e-def0-4eb3-954a-2a16a862a7b5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T10:44:42.263415Z",
      "attachments": [
        {
          "file_id": "cd23820b-6dca-4c1a-b10f-d4042629c34b",
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
  "session_id": "2fb1b5ae-77a8-444b-bcf0-a5f7261ac5a3",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE1ODIsImlhdCI6MTc5MzI3MDY4MiwianRpIjoiYTIxYzcxODItZDNhYy00OTFjLWFhZDctYjA0MjM2ZWRkOGU1Iiwic2lkIjoiMmZiMWI1YWUtNzdhOC00NDRiLWJjZjAtYTVmNzI2MWFjNWEzIn0.dBubKZZdwDRLKU7RSJ5nv5Ug5AE5H8orbG_LeWhHIVo",
  "access_expires_at": "2026-10-29T10:59:42.68326837Z",
  "refresh_token": "IwceSJDdaGlD17gxOagazrLiKviUlEJ0m5t9vtr2kbM",
  "refresh_expires_at": "2026-10-29T22:44:42.682775569Z",
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
  "session_id": "7208e66b-bf5a-4cee-bea9-7f05a270d287",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE1ODMsImlhdCI6MTc5MzI3MDY4MywianRpIjoiMmJhMmEwZjYtYTc0Yy00M2I3LTlhYjQtZGE4MzUxODdjYmVkIiwic2lkIjoiNzIwOGU2NmItYmY1YS00Y2VlLWJlYTktN2YwNWEyNzBkMjg3In0.87ceKUDHjGrWKDaXRmigEgu3xHFNzWDZTU4c87oecxc",
  "access_expires_at": "2026-10-29T10:59:43.117546927Z",
  "refresh_token": "WeawpPYumBvc0in6UmSrotVYUSmeb-RYd5HHt4eXh_w",
  "refresh_expires_at": "2026-10-29T22:44:43.117111593Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/cf23cf49-d9d5-450a-9f59-c5aab84d3c49/attachments/cd23820b-6dca-4c1a-b10f-d4042629c34b` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "de8589cf-a0b0-46c2-8fa0-3cdb0b2f4c00",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "4e012540-3f80-4954-b435-cbc02bc431ec",
  "upload_path": "/api/operator/v1/uploads/4e012540-3f80-4954-b435-cbc02bc431ec",
  "expires_at": "2026-10-29T10:59:43.322438528Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/4e012540-3f80-4954-b435-cbc02bc431ec` → **200**

```json
{
  "file_id": "4e012540-3f80-4954-b435-cbc02bc431ec",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/cf23cf49-d9d5-450a-9f59-c5aab84d3c49` → **200**

```json
{
  "id": "cf23cf49-d9d5-450a-9f59-c5aab84d3c49",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "5eeb756e-def0-4eb3-954a-2a16a862a7b5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T10:44:42.262452Z",
  "updated_at": "2026-10-29T10:44:42.262452Z",
  "respond_by": "2026-10-29T14:44:42.262452Z",
  "messages": [
    {
      "id": "5c739f0c-3865-444f-98a2-11bbd4b932b5",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "5eeb756e-def0-4eb3-954a-2a16a862a7b5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T10:44:42.263415Z",
      "attachments": [
        {
          "file_id": "cd23820b-6dca-4c1a-b10f-d4042629c34b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/cf23cf49-d9d5-450a-9f59-c5aab84d3c49/comments` → **200**

```json
{
  "command_id": "74bf8edf-84d0-4283-8c02-ab4535124998",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "4e012540-3f80-4954-b435-cbc02bc431ec"
  ]
}
```

```json
{
  "id": "cf23cf49-d9d5-450a-9f59-c5aab84d3c49",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "5eeb756e-def0-4eb3-954a-2a16a862a7b5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T10:44:42.262452Z",
  "updated_at": "2026-10-29T10:44:43.746063Z",
  "respond_by": "2026-10-29T14:44:42.262452Z",
  "messages": [
    {
      "id": "5c739f0c-3865-444f-98a2-11bbd4b932b5",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "5eeb756e-def0-4eb3-954a-2a16a862a7b5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T10:44:42.263415Z",
      "attachments": [
        {
          "file_id": "cd23820b-6dca-4c1a-b10f-d4042629c34b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "bccc84e3-eb9d-4bc9-af36-372316be2d0b",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "c8491122-a379-432e-880c-2c074e7909b2",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T10:44:43.745629Z",
      "attachments": [
        {
          "file_id": "4e012540-3f80-4954-b435-cbc02bc431ec",
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

`GET /api/rider/v1/support/cases/cf23cf49-d9d5-450a-9f59-c5aab84d3c49` → **200**

```json
{
  "id": "cf23cf49-d9d5-450a-9f59-c5aab84d3c49",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "5eeb756e-def0-4eb3-954a-2a16a862a7b5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T10:44:42.262452Z",
  "updated_at": "2026-10-29T10:44:43.746063Z",
  "respond_by": "2026-10-29T14:44:42.262452Z",
  "messages": [
    {
      "id": "5c739f0c-3865-444f-98a2-11bbd4b932b5",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "5eeb756e-def0-4eb3-954a-2a16a862a7b5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T10:44:42.263415Z",
      "attachments": [
        {
          "file_id": "cd23820b-6dca-4c1a-b10f-d4042629c34b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "bccc84e3-eb9d-4bc9-af36-372316be2d0b",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T10:44:43.745629Z",
      "attachments": [
        {
          "file_id": "4e012540-3f80-4954-b435-cbc02bc431ec",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/cf23cf49-d9d5-450a-9f59-c5aab84d3c49/attachments/4e012540-3f80-4954-b435-cbc02bc431ec` → **200**

Done: support case cf23cf49-d9d5-450a-9f59-c5aab84d3c49, rider attachment cd23820b-6dca-4c1a-b10f-d4042629c34b, operator attachment 4e012540-3f80-4954-b435-cbc02bc431ec.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731698975",
  "device_ref": "sandbox-6026"
}
```

```json
{
  "challenge_id": "c03aa26c-5f23-441a-8554-dc71c72e07a1",
  "expires_at": "2026-10-29T10:49:44.157915579Z",
  "resend_available_at": "2026-10-29T10:44:45.157915579Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731698975` → **200**

```json
{
  "phone": "+380731698975",
  "audience": "CLIENT",
  "code": "839060",
  "sent_at": "2026-10-29T10:44:44.15990403Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c03aa26c-5f23-441a-8554-dc71c72e07a1",
  "code": "839060",
  "device_ref": "sandbox-6026"
}
```

```json
{
  "session_id": "b89afb11-5c43-4118-a6bd-0daaab31744f",
  "subject": {
    "type": "CLIENT",
    "id": "0174c06a-5599-40a0-b0af-4ebca62ed91b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMTc0YzA2YS01NTk5LTQwYTAtYjBhZi00ZWJjYTYyZWQ5MWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNTg0LCJpYXQiOjE3OTMyNzA2ODQsImp0aSI6IjA4OTNiM2VkLTUzMjItNDNmZS1hNWNkLTViNWI0MGE5MTY3OSIsInNpZCI6ImI4OWFmYjExLTVjNDMtNDExOC1hNmJkLTBkYWFhYjMxNzQ0ZiJ9.kWJWcWPFUzkzhgWLCtVmxhMcCpWnyTHiHccbo6IJMZ8",
  "access_expires_at": "2026-10-29T10:59:44.394514469Z",
  "refresh_token": "W__lT5uCR0tfsBmsF4FZ-nFA4OC35ru0lg5Q6j0oA9Y",
  "refresh_expires_at": "2026-11-28T10:44:44.394104001Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "1d0299bc-f69b-4aea-bf9a-718a2f795042",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "7960389b-c8a9-48d0-bafa-a3de16e6a36d",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-7960389b-c8a9-48d0-bafa-a3de16e6a36d",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "d4c1ea7f34e15a8379dc5f5f179df917",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=7960389b-c8a9-48d0-bafa-a3de16e6a36d",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731698975"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=7960389b-c8a9-48d0-bafa-a3de16e6a36d",
  "expires_at": "2026-10-29T11:14:44.580655Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/7960389b-c8a9-48d0-bafa-a3de16e6a36d` → **200**

```json
{
  "id": "7960389b-c8a9-48d0-bafa-a3de16e6a36d",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T11:14:44.580655Z",
  "card": {
    "id": "dab5a49c-8be7-421d-a339-7542cc2610d7",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1801",
    "card_type": "Visa",
    "created_at": "2026-10-29T10:44:44.766257Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aed9233b-ac04-4827-858e-1f1ee825ed7d",
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
  "id": "5328764d-db31-499b-8f92-b9c03e09901e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:49:44.965822Z",
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
  "command_id": "af3b99be-fc0a-424e-9a50-5ab41c97e6a7",
  "quote_id": "5328764d-db31-499b-8f92-b9c03e09901e",
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
  "id": "5ad9845a-d2d3-4387-bfdc-c833c4fb44d1",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0174c06a-5599-40a0-b0af-4ebca62ed91b",
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
  "created_at": "2026-10-29T10:44:45.171877Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5ad9845a-d2d3-4387-bfdc-c833c4fb44d1` → **200**

```json
{
  "id": "5ad9845a-d2d3-4387-bfdc-c833c4fb44d1",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0174c06a-5599-40a0-b0af-4ebca62ed91b",
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
  "created_at": "2026-10-29T10:44:45.171877Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5ad9845a-d2d3-4387-bfdc-c833c4fb44d1` → **200**

```json
{
  "id": "5ad9845a-d2d3-4387-bfdc-c833c4fb44d1",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0174c06a-5599-40a0-b0af-4ebca62ed91b",
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
  "created_at": "2026-10-29T10:44:45.171877Z",
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

`GET /api/rider/v1/orders/5ad9845a-d2d3-4387-bfdc-c833c4fb44d1` → **200**

```json
{
  "id": "5ad9845a-d2d3-4387-bfdc-c833c4fb44d1",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0174c06a-5599-40a0-b0af-4ebca62ed91b",
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
  "created_at": "2026-10-29T10:44:45.171877Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5ad9845a-d2d3-4387-bfdc-c833c4fb44d1/switch-to-cash` → **200**

```json
{
  "command_id": "6b017a39-77c7-4863-9516-fb7def384b10",
  "expected_version": 3
}
```

```json
{
  "id": "5ad9845a-d2d3-4387-bfdc-c833c4fb44d1",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "0174c06a-5599-40a0-b0af-4ebca62ed91b",
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
  "created_at": "2026-10-29T10:44:45.171877Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5ad9845a-d2d3-4387-bfdc-c833c4fb44d1/switch-to-cash` → **409**

```json
{
  "command_id": "67c09ea5-4458-4842-b01a-ea8420e7b146",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/5ad9845a-d2d3-4387-bfdc-c833c4fb44d1/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "782d7295-6756-4e49-8a60-d28b7d7c532f"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/5ad9845a-d2d3-4387-bfdc-c833c4fb44d1` → **200**

```json
{
  "id": "5ad9845a-d2d3-4387-bfdc-c833c4fb44d1",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "0174c06a-5599-40a0-b0af-4ebca62ed91b",
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
  "created_at": "2026-10-29T10:44:45.171877Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5ad9845a-d2d3-4387-bfdc-c833c4fb44d1/cancel` → **200**

```json
{
  "command_id": "e14ccca7-fdd1-4e9b-b3aa-84da2cfa83fe",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5ad9845a-d2d3-4387-bfdc-c833c4fb44d1",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "0174c06a-5599-40a0-b0af-4ebca62ed91b",
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
  "created_at": "2026-10-29T10:44:45.171877Z",
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
  "session_id": "0af2a649-718b-4385-8a7a-15b9b30e1c88",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE1ODcsImlhdCI6MTc5MzI3MDY4NywianRpIjoiYTYwMTQ3YTYtNzVlYS00MmJjLWJhM2QtMTJlNDVmODllNjA5Iiwic2lkIjoiMGFmMmE2NDktNzE4Yi00Mzg1LThhN2EtMTViOWIzMGUxYzg4In0.42UigDj6LW1dboFRZHl2x0yF4dBY8HnOpKrxm9kVN4E",
  "access_expires_at": "2026-10-29T10:59:47.984178798Z",
  "refresh_token": "p9f8vfTlBsRElpsu2IHBgYmxaszpwU3xfj2coBLLeqA",
  "refresh_expires_at": "2026-10-29T22:44:47.983781464Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-19802"
}
```

```json
{
  "challenge_id": "0d22f294-2665-461c-97b0-7fe71b0be933",
  "expires_at": "2026-10-29T10:49:48.174150835Z",
  "resend_available_at": "2026-10-29T10:44:49.174150835Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "230670",
  "sent_at": "2026-10-29T10:44:48.176201032Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d22f294-2665-461c-97b0-7fe71b0be933",
  "code": "230670",
  "device_ref": "sandbox-19802"
}
```

```json
{
  "session_id": "54952490-65d0-43d1-907c-acb5ed0bed2b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTU4OCwiaWF0IjoxNzkzMjcwNjg4LCJqdGkiOiJjODI1OGViMy03MzAwLTRmMjctOGJmMS0zNWJlYjM2MTI1ZjMiLCJzaWQiOiI1NDk1MjQ5MC02NWQwLTQzZDEtOTA3Yy1hY2I1ZWQwYmVkMmIifQ.PwblrwQswWI-z8W76y30xKJLwJQ45HZfmwvPzhnqhUY",
  "access_expires_at": "2026-10-29T10:59:48.390163898Z",
  "refresh_token": "ixKlWpWs7JE7T7Z67xrp7b0SXLU3-caLt7HFAcZN_FE",
  "refresh_expires_at": "2026-11-28T10:44:48.38977318Z",
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
      "actor_id": "c8491122-a379-432e-880c-2c074e7909b2",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T10:44:36.663423Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "c8491122-a379-432e-880c-2c074e7909b2",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T10:44:37.605498Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "48d5bf53-2d57-4ad3-91b2-5c9b632d8f78",
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
  "device_ref": "sandbox-15729"
}
```

```json
{
  "challenge_id": "2e0744f4-3ffe-47c4-96db-7dafb6626e10",
  "expires_at": "2026-10-29T10:49:49.165715867Z",
  "resend_available_at": "2026-10-29T10:44:50.165715867Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "868608",
  "sent_at": "2026-10-29T10:44:49.167801644Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e0744f4-3ffe-47c4-96db-7dafb6626e10",
  "code": "868608",
  "device_ref": "sandbox-15729"
}
```

```json
{
  "session_id": "71d4c199-f5cd-430c-aaf2-6e220bde79e2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTU4OSwiaWF0IjoxNzkzMjcwNjg5LCJqdGkiOiIzOTJjN2I5NS1jM2Q2LTRlZDctODEzMi1hNDg1MTUyNDRjNTQiLCJzaWQiOiI3MWQ0YzE5OS1mNWNkLTQzMGMtYWFmMi02ZTIyMGJkZTc5ZTIifQ.L5Q_Kcuc8OSWsy1wQbEgzXoGw7jatuLu_wzQ1XbPNP8",
  "access_expires_at": "2026-10-29T10:59:49.389489717Z",
  "refresh_token": "Nol1xZmCj780IVldg9OpRVTxIZQoQtzgwzodLXZ8cSg",
  "refresh_expires_at": "2026-11-28T10:44:49.38910475Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "15c5fea7-dfdd-4715-b687-8114aa922145",
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
  "last_heartbeat_at": "2026-10-29T10:44:18.887629Z",
  "last_location_at": "2026-10-29T10:44:18.887629Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/15c5fea7-dfdd-4715-b687-8114aa922145/handover` → **200**

```json
{
  "command_id": "fe277bde-b579-4323-bae0-a3dcef107ebd",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "15c5fea7-dfdd-4715-b687-8114aa922145",
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
  "last_heartbeat_at": "2026-10-29T10:44:18.887629Z",
  "last_location_at": "2026-10-29T10:44:18.887629Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/15c5fea7-dfdd-4715-b687-8114aa922145/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:44:49Z",
    "sequence": 1793270689950
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "15c5fea7-dfdd-4715-b687-8114aa922145",
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
  "last_heartbeat_at": "2026-10-29T10:44:49.965419Z",
  "last_location_at": "2026-10-29T10:44:49.965419Z",
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
  "command_id": "150a4f5c-5541-4e9e-b45f-ae12f6d4015b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:44:50Z",
    "sequence": 1793270690328
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8e39e312-3421-468a-8521-18fe1b0c22e6",
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
  "last_heartbeat_at": "2026-10-29T10:44:50.343899Z",
  "last_location_at": "2026-10-29T10:44:50.343899Z",
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
  "session_id": "16d3bd21-11e3-41c9-9096-a76e6c77db95",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE1OTAsImlhdCI6MTc5MzI3MDY5MCwianRpIjoiMzE4MDZlZDYtZGE5Ni00NWJiLTliY2MtYWE2ZWFmMDFlNTQ0Iiwic2lkIjoiMTZkM2JkMjEtMTFlMy00MWM5LTkwOTYtYTc2ZTZjNzdkYjk1In0.5lrkc67U4J0TT2AsEXSAqY1cNu-hKfhfn8F4_qCO8aI",
  "access_expires_at": "2026-10-29T10:59:50.724612193Z",
  "refresh_token": "tZGvPHGvaKARYs-yex05YnLI4RbdM0v9OKLxI_82jdo",
  "refresh_expires_at": "2026-10-29T22:44:50.7242778Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "fcbea4f3-cc64-464f-bda2-a6c69bd73394",
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
  "id": "16386a65-3b24-4ad3-9ce4-0b530d3f4e33",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:49:50.904101Z",
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
  "command_id": "2937e09d-ef42-470a-95ba-5c8af42f8acf",
  "quote_id": "16386a65-3b24-4ad3-9ce4-0b530d3f4e33",
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
  "id": "6ee19d60-605f-4b92-9bb6-7e0114ba695c",
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
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-29T10:44:51.0908Z",
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
    "id": "3809f021-944a-4f2d-b023-75bbea12188e",
    "order_id": "6ee19d60-605f-4b92-9bb6-7e0114ba695c",
    "expires_at": "2026-10-29T10:45:06.093139Z",
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

`POST /api/driver/v1/offers/3809f021-944a-4f2d-b023-75bbea12188e/accept` → **200**

```json
{
  "command_id": "7884ca81-6cc2-45f5-9b26-4834634de175"
}
```

```json
{
  "id": "152e53b1-25b6-4aa6-ab4a-930af1a409e1",
  "order_id": "6ee19d60-605f-4b92-9bb6-7e0114ba695c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8a1f45ba-3f3b-4da9-8f1a-4bd3b6d39695",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8a1f45ba-3f3b-4da9-8f1a-4bd3b6d39695",
  "order_id": "6ee19d60-605f-4b92-9bb6-7e0114ba695c",
  "assignment_id": "152e53b1-25b6-4aa6-ab4a-930af1a409e1",
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

`POST /api/driver/v1/work-sessions/8e39e312-3421-468a-8521-18fe1b0c22e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:44:52Z",
    "sequence": 1793270692483
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8e39e312-3421-468a-8521-18fe1b0c22e6",
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
  "last_heartbeat_at": "2026-10-29T10:44:52.063058Z",
  "last_location_at": "2026-10-29T10:44:52.063058Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8a1f45ba-3f3b-4da9-8f1a-4bd3b6d39695/arrive` → **200**

```json
{
  "command_id": "783facd7-2feb-49ba-bacf-f4807dec5ae2",
  "expected_version": 0
}
```

```json
{
  "id": "8a1f45ba-3f3b-4da9-8f1a-4bd3b6d39695",
  "order_id": "6ee19d60-605f-4b92-9bb6-7e0114ba695c",
  "assignment_id": "152e53b1-25b6-4aa6-ab4a-930af1a409e1",
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
  "arrived_at": "2026-10-29T10:44:52.252719Z",
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

`POST /api/driver/v1/trips/8a1f45ba-3f3b-4da9-8f1a-4bd3b6d39695/start` → **200**

```json
{
  "command_id": "9fed57d3-1c0d-4bfc-9b18-50d785875a77",
  "expected_version": 1
}
```

```json
{
  "id": "8a1f45ba-3f3b-4da9-8f1a-4bd3b6d39695",
  "order_id": "6ee19d60-605f-4b92-9bb6-7e0114ba695c",
  "assignment_id": "152e53b1-25b6-4aa6-ab4a-930af1a409e1",
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
  "arrived_at": "2026-10-29T10:44:52.252719Z",
  "started_at": "2026-10-29T10:44:52.455142Z",
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

`POST /api/driver/v1/trips/8a1f45ba-3f3b-4da9-8f1a-4bd3b6d39695/complete` → **200**

```json
{
  "command_id": "d90528ba-8a05-4063-b7f7-82dcc4ad8791",
  "expected_version": 2,
  "reported_at": "2026-10-29T10:44:52Z",
  "cash_received": true
}
```

```json
{
  "id": "8a1f45ba-3f3b-4da9-8f1a-4bd3b6d39695",
  "order_id": "6ee19d60-605f-4b92-9bb6-7e0114ba695c",
  "assignment_id": "152e53b1-25b6-4aa6-ab4a-930af1a409e1",
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
  "arrived_at": "2026-10-29T10:44:52.252719Z",
  "started_at": "2026-10-29T10:44:52.455142Z",
  "completed_at": "2026-10-29T10:44:52.668732Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/6ee19d60-605f-4b92-9bb6-7e0114ba695c` → **200**

```json
{
  "id": "6ee19d60-605f-4b92-9bb6-7e0114ba695c",
  "short_number": 27,
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
    "id": "152e53b1-25b6-4aa6-ab4a-930af1a409e1",
    "order_id": "6ee19d60-605f-4b92-9bb6-7e0114ba695c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8a1f45ba-3f3b-4da9-8f1a-4bd3b6d39695",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T10:44:51.0908Z",
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
  "session_id": "15c5fea7-dfdd-4715-b687-8114aa922145",
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
  "last_heartbeat_at": "2026-10-29T10:44:49.965419Z",
  "last_location_at": "2026-10-29T10:44:49.965419Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/15c5fea7-dfdd-4715-b687-8114aa922145/close` → **200**

```json
{
  "command_id": "0a478964-efa1-4885-8b8a-349a51621321",
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
  "session_id": "8e39e312-3421-468a-8521-18fe1b0c22e6",
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
  "last_heartbeat_at": "2026-10-29T10:44:52.063058Z",
  "last_location_at": "2026-10-29T10:44:52.063058Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8e39e312-3421-468a-8521-18fe1b0c22e6/close` → **200**

```json
{
  "command_id": "59a8fbde-3a8d-4cfa-9a97-f5e891d3a242",
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

Done: terminal order 6ee19d60-605f-4b92-9bb6-7e0114ba695c by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5955"
}
```

```json
{
  "challenge_id": "4abd1c31-70c2-4d59-9b3c-b3bc2091c39f",
  "expires_at": "2026-10-29T10:49:57.083222879Z",
  "resend_available_at": "2026-10-29T10:44:58.083222879Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "215443",
  "sent_at": "2026-10-29T10:44:57.085324891Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4abd1c31-70c2-4d59-9b3c-b3bc2091c39f",
  "code": "215443",
  "device_ref": "sandbox-5955"
}
```

```json
{
  "session_id": "064ea64e-3fd9-4381-be95-d676e436ffbe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTU5NywiaWF0IjoxNzkzMjcwNjk3LCJqdGkiOiJiOGY1YTNlYS0wOWI1LTQ4MmItYWQyYy01MzZlYzQ5OTUxODIiLCJzaWQiOiIwNjRlYTY0ZS0zZmQ5LTQzODEtYmU5NS1kNjc2ZTQzNmZmYmUifQ.FloRmcNfuArA529uJ2liveGHw5XYSLNoqMDJv9o22RY",
  "access_expires_at": "2026-10-29T10:59:57.305448843Z",
  "refresh_token": "MSRvzwSG3rH8ZzGdkc_921vJrmY-wmDcvyugtZn38OE",
  "refresh_expires_at": "2026-11-28T10:44:57.305109412Z",
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
  "device_ref": "sandbox-14679"
}
```

```json
{
  "challenge_id": "4b41c90b-94b2-4941-8ef9-23655235178d",
  "expires_at": "2026-10-29T10:49:57.6690137Z",
  "resend_available_at": "2026-10-29T10:44:58.6690137Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "443545",
  "sent_at": "2026-10-29T10:44:57.67084472Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b41c90b-94b2-4941-8ef9-23655235178d",
  "code": "443545",
  "device_ref": "sandbox-14679"
}
```

```json
{
  "session_id": "ffea3750-ef66-4190-9022-02d6a5b153ef",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTU5NywiaWF0IjoxNzkzMjcwNjk3LCJqdGkiOiJmNmU0MWU4MC1hNzg2LTQ2YzEtYjE2Mi0yMTA1ZDgyYjhmYzYiLCJzaWQiOiJmZmVhMzc1MC1lZjY2LTQxOTAtOTAyMi0wMmQ2YTViMTUzZWYifQ.wjY5fQxcBA5X2mU6fpn2cgoJDDSnI6dctNJinG3etMQ",
  "access_expires_at": "2026-10-29T10:59:57.867450299Z",
  "refresh_token": "rLMYK3YhC5dKPVnYmLQoYrV_BXJRjs5nR2TeE7wmfG8",
  "refresh_expires_at": "2026-11-28T10:44:57.86705039Z",
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
  "device_ref": "sandbox-25437"
}
```

```json
{
  "challenge_id": "9d052e65-e855-4a62-8549-aa10702a6b07",
  "expires_at": "2026-10-29T10:49:58.278200898Z",
  "resend_available_at": "2026-10-29T10:44:59.278200898Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "389416",
  "sent_at": "2026-10-29T10:44:58.280153747Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d052e65-e855-4a62-8549-aa10702a6b07",
  "code": "389416",
  "device_ref": "sandbox-25437"
}
```

```json
{
  "session_id": "4ee3b936-7c25-4c4d-a0e8-697c297f0336",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MTU5OCwiaWF0IjoxNzkzMjcwNjk4LCJqdGkiOiJlNmNlNmMyMC02MDk2LTQzMTQtODJmNy1kOTI3MTI1M2Q0MTEiLCJzaWQiOiI0ZWUzYjkzNi03YzI1LTRjNGQtYTBlOC02OTdjMjk3ZjAzMzYifQ.KhGb8-raLCstqdVlnRoq7gNH__DN6TY127t792PEeCw",
  "access_expires_at": "2026-10-29T10:59:58.491986978Z",
  "refresh_token": "AjOGrtDVKjZ6-Cja2cLiruPNMbO__k7I5J23BbYgoes",
  "refresh_expires_at": "2026-11-28T10:44:58.49162851Z",
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
  "phone": "+380694825757",
  "device_ref": "sandbox-30527"
}
```

```json
{
  "challenge_id": "4a97fff6-6dc3-4508-9437-820dcc415583",
  "expires_at": "2026-10-29T10:49:58.839650067Z",
  "resend_available_at": "2026-10-29T10:44:59.839650067Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380694825757` → **200**

```json
{
  "phone": "+380694825757",
  "audience": "CLIENT",
  "code": "549007",
  "sent_at": "2026-10-29T10:44:58.841350776Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4a97fff6-6dc3-4508-9437-820dcc415583",
  "code": "549007",
  "device_ref": "sandbox-30527"
}
```

```json
{
  "session_id": "e17415a7-112e-433f-a063-1414fe6fb0e0",
  "subject": {
    "type": "CLIENT",
    "id": "791d497a-b2bb-40e9-b4ae-0c525212236b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3OTFkNDk3YS1iMmJiLTQwZTktYjRhZS0wYzUyNTIxMjIzNmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcxNTk5LCJpYXQiOjE3OTMyNzA2OTksImp0aSI6ImFmM2QzMjFkLWI5YzItNDk1Yy1iODZiLTFjZjNmZjZiZTYwOCIsInNpZCI6ImUxNzQxNWE3LTExMmUtNDMzZi1hMDYzLTE0MTRmZTZmYjBlMCJ9.nlRSLMNO7_zds_s4YtltTVFoRYOs2mvVS3-KIu91TrM",
  "access_expires_at": "2026-10-29T10:59:59.083459618Z",
  "refresh_token": "9r9gWQQ8QCMeHWkACX8GFekI6H_PTHHiEz6fTLnKFVk",
  "refresh_expires_at": "2026-11-28T10:44:59.083091023Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2e957780-6e95-4473-914a-9a6fe1fea028",
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
  "id": "1d7868f8-aed3-4680-a430-12a683fa8833",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:49:59.280487Z",
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
  "command_id": "40daf924-5c32-4bef-bdaa-6ee634d94494",
  "quote_id": "1d7868f8-aed3-4680-a430-12a683fa8833",
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
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:44:59.471251Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T10:44:59.471251Z",
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
  "blizz_orders_total": 28,
  "blizz_orders_cancelled_total": 14,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 18,
  "blizz_dispatch_assigned_seconds_count": 17,
  "blizz_offers_total": 20,
  "blizz_dispatch_excluded_total": 10,
  "blizz_sms_sent_total": 72
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 9.551901664
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.10314338
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 17.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 1.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 20.0
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
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 65.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/bcf457ac-3e90-4446-b876-9f9d7088c8e3` → **200**

```json
{
  "id": "bcf457ac-3e90-4446-b876-9f9d7088c8e3",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "791d497a-b2bb-40e9-b4ae-0c525212236b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T10:44:59.471251Z",
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
  "session_id": "d887c3f0-f238-4e1f-ad26-86293d501bf1",
  "subject": {
    "type": "STAFF",
    "id": "c8491122-a379-432e-880c-2c074e7909b2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODQ5MTEyMi1hMzc5LTQzMmUtODgwYy0yYzA3NGU3OTA5YjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzE3ODIsImlhdCI6MTc5MzI3MDg4MiwianRpIjoiMmY5ZWE2YjMtZmJhOS00OWNkLTgxZGYtOGYwOWVhZDAzMDM5Iiwic2lkIjoiZDg4N2MzZjAtZjIzOC00ZTFmLWFkMjYtODYyOTNkNTAxYmYxIn0.2GUhF7puSKAfMRXlO8kPeIFYTUPpTOQuUB-QsR-Qz6c",
  "access_expires_at": "2026-10-29T11:03:02.156856536Z",
  "refresh_token": "31FUtVw2zDFpvEGdoFW_8_EEkNrTMqis7RdpVigKcTQ",
  "refresh_expires_at": "2026-10-29T22:48:02.156443719Z",
  "password_change_required": false
}
```

## The earlier card flows reconcile cleanly without moving money

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29"
}
```

```json
{
  "id": "e8ba1ebf-2285-449e-a165-77fd2299ff23",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T10:48:02.35508Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T10:48:02.355161Z",
  "updated_at": "2026-10-29T10:48:02.364345Z",
  "finished_at": "2026-10-29T10:48:02.364345Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/e8ba1ebf-2285-449e-a165-77fd2299ff23` → **200**

```json
{
  "run": {
    "id": "e8ba1ebf-2285-449e-a165-77fd2299ff23",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T10:48:02.35508Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T10:48:02.355161Z",
    "updated_at": "2026-10-29T10:48:02.364345Z",
    "finished_at": "2026-10-29T10:48:02.364345Z",
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
  "day": "2026-10-29"
}
```

```json
{
  "id": "e8ba1ebf-2285-449e-a165-77fd2299ff23",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T10:48:02.35508Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T10:48:02.355161Z",
  "updated_at": "2026-10-29T10:48:02.364345Z",
  "finished_at": "2026-10-29T10:48:02.364345Z",
  "version": 1
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29"
}
```

```json
{
  "id": "e8ba1ebf-2285-449e-a165-77fd2299ff23",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T10:48:02.35508Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T10:48:02.355161Z",
  "updated_at": "2026-10-29T10:48:02.364345Z",
  "finished_at": "2026-10-29T10:48:02.364345Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/0224dcab-06e4-4224-a1a3-1ac89b859d7a` → **204**

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
  "day": "2026-10-29"
}
```

```json
{
  "id": "ccb71a56-d294-4741-8a0d-c801423dd5ca",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T10:48:02.679076Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T10:48:02.679171Z",
  "updated_at": "2026-10-29T10:48:02.68441Z",
  "finished_at": "2026-10-29T10:48:02.68441Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/ccb71a56-d294-4741-8a0d-c801423dd5ca` → **200**

```json
{
  "run": {
    "id": "ccb71a56-d294-4741-8a0d-c801423dd5ca",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T10:48:02.679076Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T10:48:02.679171Z",
    "updated_at": "2026-10-29T10:48:02.68441Z",
    "finished_at": "2026-10-29T10:48:02.68441Z",
    "version": 1
  },
  "items": [
    {
      "id": "578aeb3c-842d-4ac2-9516-8d9188610255",
      "run_id": "ccb71a56-d294-4741-8a0d-c801423dd5ca",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "6f988eb592c1b352693f9db528f32663ec4bc535a2246edcc6566f47c0db74d2",
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
      "provider_at": "2026-10-29T10:48:02Z",
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
  "day": "2026-10-29"
}
```

```json
{
  "id": "ccb71a56-d294-4741-8a0d-c801423dd5ca",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T10:48:02.679076Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T10:48:02.679171Z",
  "updated_at": "2026-10-29T10:48:02.68441Z",
  "finished_at": "2026-10-29T10:48:02.68441Z",
  "version": 1
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29"
}
```

```json
{
  "id": "ccb71a56-d294-4741-8a0d-c801423dd5ca",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T10:48:02.679076Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T10:48:02.679171Z",
  "updated_at": "2026-10-29T10:48:02.68441Z",
  "finished_at": "2026-10-29T10:48:02.68441Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/578aeb3c-842d-4ac2-9516-8d9188610255/resolve` → **200**

```json
{
  "command_id": "ad607feb-8a57-4a85-aeb8-3651c481990e",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "578aeb3c-842d-4ac2-9516-8d9188610255",
  "run_id": "ccb71a56-d294-4741-8a0d-c801423dd5ca",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "6f988eb592c1b352693f9db528f32663ec4bc535a2246edcc6566f47c0db74d2",
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
  "provider_at": "2026-10-29T10:48:02Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "resolved_at": "2026-10-29T10:48:02.969689Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/578aeb3c-842d-4ac2-9516-8d9188610255/resolve` → **200**

```json
{
  "command_id": "ad607feb-8a57-4a85-aeb8-3651c481990e",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "578aeb3c-842d-4ac2-9516-8d9188610255",
  "run_id": "ccb71a56-d294-4741-8a0d-c801423dd5ca",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "6f988eb592c1b352693f9db528f32663ec4bc535a2246edcc6566f47c0db74d2",
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
  "provider_at": "2026-10-29T10:48:02Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "c8491122-a379-432e-880c-2c074e7909b2",
  "resolved_at": "2026-10-29T10:48:02.969689Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/578aeb3c-842d-4ac2-9516-8d9188610255/resolve` → **409**

```json
{
  "command_id": "ce6168ad-89eb-4795-b2d6-139f3cb7a7a8",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/578aeb3c-842d-4ac2-9516-8d9188610255/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5c062bba-6c82-4ae8-807d-f10bc2c7d38c"
}
```

`GET /api/admin/v1/payment-reconciliations/ccb71a56-d294-4741-8a0d-c801423dd5ca` → **200**

```json
{
  "run": {
    "id": "ccb71a56-d294-4741-8a0d-c801423dd5ca",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T10:48:02.679076Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T10:48:02.679171Z",
    "updated_at": "2026-10-29T10:48:02.969689Z",
    "finished_at": "2026-10-29T10:48:02.68441Z",
    "version": 2
  },
  "items": [
    {
      "id": "578aeb3c-842d-4ac2-9516-8d9188610255",
      "run_id": "ccb71a56-d294-4741-8a0d-c801423dd5ca",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "6f988eb592c1b352693f9db528f32663ec4bc535a2246edcc6566f47c0db74d2",
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
      "provider_at": "2026-10-29T10:48:02Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "c8491122-a379-432e-880c-2c074e7909b2",
      "resolved_at": "2026-10-29T10:48:02.969689Z",
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
      "id": "7c0b266d-226f-4490-8699-275bbd4050f2",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-28",
      "period_from": "2026-10-27T22:00:00Z",
      "period_to": "2026-10-29T02:00:00Z",
      "observed_until": "2026-10-29T10:41:25.879221Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T10:41:25.879286Z",
      "updated_at": "2026-10-29T10:41:25.881896Z",
      "finished_at": "2026-10-29T10:41:25.881896Z",
      "version": 1
    },
    {
      "id": "ccb71a56-d294-4741-8a0d-c801423dd5ca",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-29T10:48:02.679076Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T10:48:02.679171Z",
      "updated_at": "2026-10-29T10:48:02.969689Z",
      "finished_at": "2026-10-29T10:48:02.68441Z",
      "version": 2
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/0224dcab-06e4-4224-a1a3-1ac89b859d7a` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29"
}
```

```json
{
  "id": "ccb71a56-d294-4741-8a0d-c801423dd5ca",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T10:48:02.679076Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T10:48:02.679171Z",
  "updated_at": "2026-10-29T10:48:02.969689Z",
  "finished_at": "2026-10-29T10:48:02.68441Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793271006011E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793271006078E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793271006078E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793271006079E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793271006079E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
